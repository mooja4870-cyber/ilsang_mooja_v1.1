package androidx.vectordrawable.graphics.drawable;

/* JADX INFO: loaded from: classes.dex */
public class VectorDrawableCompat extends androidx.vectordrawable.graphics.drawable.VectorDrawableCommon {
    private static final boolean DBG_VECTOR_DRAWABLE = false;
    static final android.graphics.PorterDuff.Mode DEFAULT_TINT_MODE = null;
    private static final int LINECAP_BUTT = 0;
    private static final int LINECAP_ROUND = 1;
    private static final int LINECAP_SQUARE = 2;
    private static final int LINEJOIN_BEVEL = 2;
    private static final int LINEJOIN_MITER = 0;
    private static final int LINEJOIN_ROUND = 1;
    static final java.lang.String LOGTAG = "VectorDrawableCompat";
    private static final int MAX_CACHED_BITMAP_SIZE = 2048;
    private static final java.lang.String SHAPE_CLIP_PATH = "clip-path";
    private static final java.lang.String SHAPE_GROUP = "group";
    private static final java.lang.String SHAPE_PATH = "path";
    private static final java.lang.String SHAPE_VECTOR = "vector";
    private boolean mAllowCaching;
    private android.graphics.drawable.Drawable.ConstantState mCachedConstantStateDelegate;
    private android.graphics.ColorFilter mColorFilter;
    private boolean mMutated;
    private android.graphics.PorterDuffColorFilter mTintFilter;
    private final android.graphics.Rect mTmpBounds;
    private final float[] mTmpFloats;
    private final android.graphics.Matrix mTmpMatrix;
    private androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VectorDrawableCompatState mVectorState;

    /* JADX INFO: renamed from: androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    private static class VClipPath extends androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VPath {
        VClipPath() {
                r0 = this;
                r0.<init>()
                return
        }

        VClipPath(androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VClipPath r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        private void updateStateFromTypedArray(android.content.res.TypedArray r6, org.xmlpull.v1.XmlPullParser r7) {
                r5 = this;
                r0 = 0
                java.lang.String r1 = r6.getString(r0)
                if (r1 == 0) goto La
                r5.mPathName = r1
            La:
                r2 = 1
                java.lang.String r2 = r6.getString(r2)
                if (r2 == 0) goto L18
                androidx.core.graphics.PathParser$PathDataNode[] r3 = androidx.core.graphics.PathParser.createNodesFromPathData(r2)
                r5.mNodes = r3
            L18:
                java.lang.String r3 = "fillType"
                r4 = 2
                int r0 = androidx.core.content.res.TypedArrayUtils.getNamedInt(r6, r7, r3, r4, r0)
                r5.mFillRule = r0
                return
        }

        public void inflate(android.content.res.Resources r3, android.util.AttributeSet r4, android.content.res.Resources.Theme r5, org.xmlpull.v1.XmlPullParser r6) {
                r2 = this;
                java.lang.String r0 = "pathData"
                boolean r0 = androidx.core.content.res.TypedArrayUtils.hasAttribute(r6, r0)
                if (r0 != 0) goto L9
                return
            L9:
                int[] r1 = androidx.vectordrawable.graphics.drawable.AndroidResources.STYLEABLE_VECTOR_DRAWABLE_CLIP_PATH
                android.content.res.TypedArray r1 = androidx.core.content.res.TypedArrayUtils.obtainAttributes(r3, r5, r4, r1)
                r2.updateStateFromTypedArray(r1, r6)
                r1.recycle()
                return
        }

        @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VPath
        public boolean isClipPath() {
                r1 = this;
                r0 = 1
                return r0
        }
    }

    private static class VFullPath extends androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VPath {
        float mFillAlpha;
        androidx.core.content.res.ComplexColorCompat mFillColor;
        float mStrokeAlpha;
        androidx.core.content.res.ComplexColorCompat mStrokeColor;
        android.graphics.Paint.Cap mStrokeLineCap;
        android.graphics.Paint.Join mStrokeLineJoin;
        float mStrokeMiterlimit;
        float mStrokeWidth;
        private int[] mThemeAttrs;
        float mTrimPathEnd;
        float mTrimPathOffset;
        float mTrimPathStart;

        VFullPath() {
                r2 = this;
                r2.<init>()
                r0 = 0
                r2.mStrokeWidth = r0
                r1 = 1065353216(0x3f800000, float:1.0)
                r2.mStrokeAlpha = r1
                r2.mFillAlpha = r1
                r2.mTrimPathStart = r0
                r2.mTrimPathEnd = r1
                r2.mTrimPathOffset = r0
                android.graphics.Paint$Cap r0 = android.graphics.Paint.Cap.BUTT
                r2.mStrokeLineCap = r0
                android.graphics.Paint$Join r0 = android.graphics.Paint.Join.MITER
                r2.mStrokeLineJoin = r0
                r0 = 1082130432(0x40800000, float:4.0)
                r2.mStrokeMiterlimit = r0
                return
        }

        VFullPath(androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VFullPath r3) {
                r2 = this;
                r2.<init>(r3)
                r0 = 0
                r2.mStrokeWidth = r0
                r1 = 1065353216(0x3f800000, float:1.0)
                r2.mStrokeAlpha = r1
                r2.mFillAlpha = r1
                r2.mTrimPathStart = r0
                r2.mTrimPathEnd = r1
                r2.mTrimPathOffset = r0
                android.graphics.Paint$Cap r0 = android.graphics.Paint.Cap.BUTT
                r2.mStrokeLineCap = r0
                android.graphics.Paint$Join r0 = android.graphics.Paint.Join.MITER
                r2.mStrokeLineJoin = r0
                r0 = 1082130432(0x40800000, float:4.0)
                r2.mStrokeMiterlimit = r0
                int[] r0 = r3.mThemeAttrs
                r2.mThemeAttrs = r0
                androidx.core.content.res.ComplexColorCompat r0 = r3.mStrokeColor
                r2.mStrokeColor = r0
                float r0 = r3.mStrokeWidth
                r2.mStrokeWidth = r0
                float r0 = r3.mStrokeAlpha
                r2.mStrokeAlpha = r0
                androidx.core.content.res.ComplexColorCompat r0 = r3.mFillColor
                r2.mFillColor = r0
                int r0 = r3.mFillRule
                r2.mFillRule = r0
                float r0 = r3.mFillAlpha
                r2.mFillAlpha = r0
                float r0 = r3.mTrimPathStart
                r2.mTrimPathStart = r0
                float r0 = r3.mTrimPathEnd
                r2.mTrimPathEnd = r0
                float r0 = r3.mTrimPathOffset
                r2.mTrimPathOffset = r0
                android.graphics.Paint$Cap r0 = r3.mStrokeLineCap
                r2.mStrokeLineCap = r0
                android.graphics.Paint$Join r0 = r3.mStrokeLineJoin
                r2.mStrokeLineJoin = r0
                float r0 = r3.mStrokeMiterlimit
                r2.mStrokeMiterlimit = r0
                return
        }

        private android.graphics.Paint.Cap getStrokeLineCap(int r2, android.graphics.Paint.Cap r3) {
                r1 = this;
                switch(r2) {
                    case 0: goto La;
                    case 1: goto L7;
                    case 2: goto L4;
                    default: goto L3;
                }
            L3:
                return r3
            L4:
                android.graphics.Paint$Cap r0 = android.graphics.Paint.Cap.SQUARE
                return r0
            L7:
                android.graphics.Paint$Cap r0 = android.graphics.Paint.Cap.ROUND
                return r0
            La:
                android.graphics.Paint$Cap r0 = android.graphics.Paint.Cap.BUTT
                return r0
        }

        private android.graphics.Paint.Join getStrokeLineJoin(int r2, android.graphics.Paint.Join r3) {
                r1 = this;
                switch(r2) {
                    case 0: goto La;
                    case 1: goto L7;
                    case 2: goto L4;
                    default: goto L3;
                }
            L3:
                return r3
            L4:
                android.graphics.Paint$Join r0 = android.graphics.Paint.Join.BEVEL
                return r0
            L7:
                android.graphics.Paint$Join r0 = android.graphics.Paint.Join.ROUND
                return r0
            La:
                android.graphics.Paint$Join r0 = android.graphics.Paint.Join.MITER
                return r0
        }

        private void updateStateFromTypedArray(android.content.res.TypedArray r11, org.xmlpull.v1.XmlPullParser r12, android.content.res.Resources.Theme r13) {
                r10 = this;
                r0 = 0
                r10.mThemeAttrs = r0
                java.lang.String r0 = "pathData"
                boolean r0 = androidx.core.content.res.TypedArrayUtils.hasAttribute(r12, r0)
                if (r0 != 0) goto Lc
                return
            Lc:
                r1 = 0
                java.lang.String r1 = r11.getString(r1)
                if (r1 == 0) goto L15
                r10.mPathName = r1
            L15:
                r2 = 2
                java.lang.String r2 = r11.getString(r2)
                if (r2 == 0) goto L23
                androidx.core.graphics.PathParser$PathDataNode[] r3 = androidx.core.graphics.PathParser.createNodesFromPathData(r2)
                r10.mNodes = r3
            L23:
                r8 = 1
                r9 = 0
                java.lang.String r7 = "fillColor"
                r4 = r11
                r5 = r12
                r6 = r13
                androidx.core.content.res.ComplexColorCompat r11 = androidx.core.content.res.TypedArrayUtils.getNamedComplexColor(r4, r5, r6, r7, r8, r9)
                r3 = r4
                r4 = r5
                r5 = r6
                r10.mFillColor = r11
                r11 = 12
                float r12 = r10.mFillAlpha
                java.lang.String r13 = "fillAlpha"
                float r11 = androidx.core.content.res.TypedArrayUtils.getNamedFloat(r3, r4, r13, r11, r12)
                r10.mFillAlpha = r11
                java.lang.String r11 = "strokeLineCap"
                r12 = 8
                r13 = -1
                int r11 = androidx.core.content.res.TypedArrayUtils.getNamedInt(r3, r4, r11, r12, r13)
                android.graphics.Paint$Cap r12 = r10.mStrokeLineCap
                android.graphics.Paint$Cap r12 = r10.getStrokeLineCap(r11, r12)
                r10.mStrokeLineCap = r12
                java.lang.String r12 = "strokeLineJoin"
                r6 = 9
                int r12 = androidx.core.content.res.TypedArrayUtils.getNamedInt(r3, r4, r12, r6, r13)
                android.graphics.Paint$Join r13 = r10.mStrokeLineJoin
                android.graphics.Paint$Join r13 = r10.getStrokeLineJoin(r12, r13)
                r10.mStrokeLineJoin = r13
                r13 = 10
                float r6 = r10.mStrokeMiterlimit
                java.lang.String r7 = "strokeMiterLimit"
                float r13 = androidx.core.content.res.TypedArrayUtils.getNamedFloat(r3, r4, r7, r13, r6)
                r10.mStrokeMiterlimit = r13
                r7 = 3
                r8 = 0
                java.lang.String r6 = "strokeColor"
                androidx.core.content.res.ComplexColorCompat r13 = androidx.core.content.res.TypedArrayUtils.getNamedComplexColor(r3, r4, r5, r6, r7, r8)
                r10.mStrokeColor = r13
                r13 = 11
                float r6 = r10.mStrokeAlpha
                java.lang.String r7 = "strokeAlpha"
                float r13 = androidx.core.content.res.TypedArrayUtils.getNamedFloat(r3, r4, r7, r13, r6)
                r10.mStrokeAlpha = r13
                r13 = 4
                float r6 = r10.mStrokeWidth
                java.lang.String r7 = "strokeWidth"
                float r13 = androidx.core.content.res.TypedArrayUtils.getNamedFloat(r3, r4, r7, r13, r6)
                r10.mStrokeWidth = r13
                r13 = 6
                float r6 = r10.mTrimPathEnd
                java.lang.String r7 = "trimPathEnd"
                float r13 = androidx.core.content.res.TypedArrayUtils.getNamedFloat(r3, r4, r7, r13, r6)
                r10.mTrimPathEnd = r13
                r13 = 7
                float r6 = r10.mTrimPathOffset
                java.lang.String r7 = "trimPathOffset"
                float r13 = androidx.core.content.res.TypedArrayUtils.getNamedFloat(r3, r4, r7, r13, r6)
                r10.mTrimPathOffset = r13
                r13 = 5
                float r6 = r10.mTrimPathStart
                java.lang.String r7 = "trimPathStart"
                float r13 = androidx.core.content.res.TypedArrayUtils.getNamedFloat(r3, r4, r7, r13, r6)
                r10.mTrimPathStart = r13
                r13 = 13
                int r6 = r10.mFillRule
                java.lang.String r7 = "fillType"
                int r13 = androidx.core.content.res.TypedArrayUtils.getNamedInt(r3, r4, r7, r13, r6)
                r10.mFillRule = r13
                return
        }

        @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VPath
        public void applyTheme(android.content.res.Resources.Theme r2) {
                r1 = this;
                int[] r0 = r1.mThemeAttrs
                if (r0 != 0) goto L5
                return
            L5:
                return
        }

        @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VPath
        public boolean canApplyTheme() {
                r1 = this;
                int[] r0 = r1.mThemeAttrs
                if (r0 == 0) goto L6
                r0 = 1
                goto L7
            L6:
                r0 = 0
            L7:
                return r0
        }

        float getFillAlpha() {
                r1 = this;
                float r0 = r1.mFillAlpha
                return r0
        }

        int getFillColor() {
                r1 = this;
                androidx.core.content.res.ComplexColorCompat r0 = r1.mFillColor
                int r0 = r0.getColor()
                return r0
        }

        float getStrokeAlpha() {
                r1 = this;
                float r0 = r1.mStrokeAlpha
                return r0
        }

        int getStrokeColor() {
                r1 = this;
                androidx.core.content.res.ComplexColorCompat r0 = r1.mStrokeColor
                int r0 = r0.getColor()
                return r0
        }

        float getStrokeWidth() {
                r1 = this;
                float r0 = r1.mStrokeWidth
                return r0
        }

        float getTrimPathEnd() {
                r1 = this;
                float r0 = r1.mTrimPathEnd
                return r0
        }

        float getTrimPathOffset() {
                r1 = this;
                float r0 = r1.mTrimPathOffset
                return r0
        }

        float getTrimPathStart() {
                r1 = this;
                float r0 = r1.mTrimPathStart
                return r0
        }

        public void inflate(android.content.res.Resources r2, android.util.AttributeSet r3, android.content.res.Resources.Theme r4, org.xmlpull.v1.XmlPullParser r5) {
                r1 = this;
                int[] r0 = androidx.vectordrawable.graphics.drawable.AndroidResources.STYLEABLE_VECTOR_DRAWABLE_PATH
                android.content.res.TypedArray r0 = androidx.core.content.res.TypedArrayUtils.obtainAttributes(r2, r4, r3, r0)
                r1.updateStateFromTypedArray(r0, r5, r4)
                r0.recycle()
                return
        }

        @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VObject
        public boolean isStateful() {
                r1 = this;
                androidx.core.content.res.ComplexColorCompat r0 = r1.mFillColor
                boolean r0 = r0.isStateful()
                if (r0 != 0) goto L13
                androidx.core.content.res.ComplexColorCompat r0 = r1.mStrokeColor
                boolean r0 = r0.isStateful()
                if (r0 == 0) goto L11
                goto L13
            L11:
                r0 = 0
                goto L14
            L13:
                r0 = 1
            L14:
                return r0
        }

        @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VObject
        public boolean onStateChanged(int[] r3) {
                r2 = this;
                androidx.core.content.res.ComplexColorCompat r0 = r2.mFillColor
                boolean r0 = r0.onStateChanged(r3)
                androidx.core.content.res.ComplexColorCompat r1 = r2.mStrokeColor
                boolean r1 = r1.onStateChanged(r3)
                r0 = r0 | r1
                return r0
        }

        void setFillAlpha(float r1) {
                r0 = this;
                r0.mFillAlpha = r1
                return
        }

        void setFillColor(int r2) {
                r1 = this;
                androidx.core.content.res.ComplexColorCompat r0 = r1.mFillColor
                r0.setColor(r2)
                return
        }

        void setStrokeAlpha(float r1) {
                r0 = this;
                r0.mStrokeAlpha = r1
                return
        }

        void setStrokeColor(int r2) {
                r1 = this;
                androidx.core.content.res.ComplexColorCompat r0 = r1.mStrokeColor
                r0.setColor(r2)
                return
        }

        void setStrokeWidth(float r1) {
                r0 = this;
                r0.mStrokeWidth = r1
                return
        }

        void setTrimPathEnd(float r1) {
                r0 = this;
                r0.mTrimPathEnd = r1
                return
        }

        void setTrimPathOffset(float r1) {
                r0 = this;
                r0.mTrimPathOffset = r1
                return
        }

        void setTrimPathStart(float r1) {
                r0 = this;
                r0.mTrimPathStart = r1
                return
        }
    }

    private static class VGroup extends androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VObject {
        int mChangingConfigurations;
        final java.util.ArrayList<androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VObject> mChildren;
        private java.lang.String mGroupName;
        final android.graphics.Matrix mLocalMatrix;
        private float mPivotX;
        private float mPivotY;
        float mRotate;
        private float mScaleX;
        private float mScaleY;
        final android.graphics.Matrix mStackedMatrix;
        private int[] mThemeAttrs;
        private float mTranslateX;
        private float mTranslateY;

        public VGroup() {
                r3 = this;
                r0 = 0
                r3.<init>(r0)
                android.graphics.Matrix r1 = new android.graphics.Matrix
                r1.<init>()
                r3.mStackedMatrix = r1
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                r3.mChildren = r1
                r1 = 0
                r3.mRotate = r1
                r3.mPivotX = r1
                r3.mPivotY = r1
                r2 = 1065353216(0x3f800000, float:1.0)
                r3.mScaleX = r2
                r3.mScaleY = r2
                r3.mTranslateX = r1
                r3.mTranslateY = r1
                android.graphics.Matrix r1 = new android.graphics.Matrix
                r1.<init>()
                r3.mLocalMatrix = r1
                r3.mGroupName = r0
                return
        }

        public VGroup(androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VGroup r7, androidx.collection.ArrayMap<java.lang.String, java.lang.Object> r8) {
                r6 = this;
                r0 = 0
                r6.<init>(r0)
                android.graphics.Matrix r1 = new android.graphics.Matrix
                r1.<init>()
                r6.mStackedMatrix = r1
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                r6.mChildren = r1
                r1 = 0
                r6.mRotate = r1
                r6.mPivotX = r1
                r6.mPivotY = r1
                r2 = 1065353216(0x3f800000, float:1.0)
                r6.mScaleX = r2
                r6.mScaleY = r2
                r6.mTranslateX = r1
                r6.mTranslateY = r1
                android.graphics.Matrix r1 = new android.graphics.Matrix
                r1.<init>()
                r6.mLocalMatrix = r1
                r6.mGroupName = r0
                float r0 = r7.mRotate
                r6.mRotate = r0
                float r0 = r7.mPivotX
                r6.mPivotX = r0
                float r0 = r7.mPivotY
                r6.mPivotY = r0
                float r0 = r7.mScaleX
                r6.mScaleX = r0
                float r0 = r7.mScaleY
                r6.mScaleY = r0
                float r0 = r7.mTranslateX
                r6.mTranslateX = r0
                float r0 = r7.mTranslateY
                r6.mTranslateY = r0
                int[] r0 = r7.mThemeAttrs
                r6.mThemeAttrs = r0
                java.lang.String r0 = r7.mGroupName
                r6.mGroupName = r0
                int r0 = r7.mChangingConfigurations
                r6.mChangingConfigurations = r0
                java.lang.String r0 = r6.mGroupName
                if (r0 == 0) goto L5d
                java.lang.String r0 = r6.mGroupName
                r8.put(r0, r6)
            L5d:
                android.graphics.Matrix r0 = r6.mLocalMatrix
                android.graphics.Matrix r1 = r7.mLocalMatrix
                r0.set(r1)
                java.util.ArrayList<androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VObject> r0 = r7.mChildren
                r1 = 0
            L67:
                int r2 = r0.size()
                if (r1 >= r2) goto Lb5
                java.lang.Object r2 = r0.get(r1)
                boolean r3 = r2 instanceof androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VGroup
                if (r3 == 0) goto L83
                r3 = r2
                androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VGroup r3 = (androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VGroup) r3
                java.util.ArrayList<androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VObject> r4 = r6.mChildren
                androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VGroup r5 = new androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VGroup
                r5.<init>(r3, r8)
                r4.add(r5)
                goto Laa
            L83:
                boolean r3 = r2 instanceof androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VFullPath
                if (r3 == 0) goto L90
                androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VFullPath r3 = new androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VFullPath
                r4 = r2
                androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VFullPath r4 = (androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VFullPath) r4
                r3.<init>(r4)
                goto L9c
            L90:
                boolean r3 = r2 instanceof androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VClipPath
                if (r3 == 0) goto Lad
                androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VClipPath r3 = new androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VClipPath
                r4 = r2
                androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VClipPath r4 = (androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VClipPath) r4
                r3.<init>(r4)
            L9c:
                java.util.ArrayList<androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VObject> r4 = r6.mChildren
                r4.add(r3)
                java.lang.String r4 = r3.mPathName
                if (r4 == 0) goto Laa
                java.lang.String r4 = r3.mPathName
                r8.put(r4, r3)
            Laa:
                int r1 = r1 + 1
                goto L67
            Lad:
                java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                java.lang.String r4 = "Unknown object in the tree!"
                r3.<init>(r4)
                throw r3
            Lb5:
                return
        }

        private void updateLocalMatrix() {
                r4 = this;
                android.graphics.Matrix r0 = r4.mLocalMatrix
                r0.reset()
                android.graphics.Matrix r0 = r4.mLocalMatrix
                float r1 = r4.mPivotX
                float r1 = -r1
                float r2 = r4.mPivotY
                float r2 = -r2
                r0.postTranslate(r1, r2)
                android.graphics.Matrix r0 = r4.mLocalMatrix
                float r1 = r4.mScaleX
                float r2 = r4.mScaleY
                r0.postScale(r1, r2)
                android.graphics.Matrix r0 = r4.mLocalMatrix
                float r1 = r4.mRotate
                r2 = 0
                r0.postRotate(r1, r2, r2)
                android.graphics.Matrix r0 = r4.mLocalMatrix
                float r1 = r4.mTranslateX
                float r2 = r4.mPivotX
                float r1 = r1 + r2
                float r2 = r4.mTranslateY
                float r3 = r4.mPivotY
                float r2 = r2 + r3
                r0.postTranslate(r1, r2)
                return
        }

        private void updateStateFromTypedArray(android.content.res.TypedArray r4, org.xmlpull.v1.XmlPullParser r5) {
                r3 = this;
                r0 = 0
                r3.mThemeAttrs = r0
                r0 = 5
                float r1 = r3.mRotate
                java.lang.String r2 = "rotation"
                float r0 = androidx.core.content.res.TypedArrayUtils.getNamedFloat(r4, r5, r2, r0, r1)
                r3.mRotate = r0
                r0 = 1
                float r1 = r3.mPivotX
                float r0 = r4.getFloat(r0, r1)
                r3.mPivotX = r0
                r0 = 2
                float r1 = r3.mPivotY
                float r0 = r4.getFloat(r0, r1)
                r3.mPivotY = r0
                r0 = 3
                float r1 = r3.mScaleX
                java.lang.String r2 = "scaleX"
                float r0 = androidx.core.content.res.TypedArrayUtils.getNamedFloat(r4, r5, r2, r0, r1)
                r3.mScaleX = r0
                r0 = 4
                float r1 = r3.mScaleY
                java.lang.String r2 = "scaleY"
                float r0 = androidx.core.content.res.TypedArrayUtils.getNamedFloat(r4, r5, r2, r0, r1)
                r3.mScaleY = r0
                r0 = 6
                float r1 = r3.mTranslateX
                java.lang.String r2 = "translateX"
                float r0 = androidx.core.content.res.TypedArrayUtils.getNamedFloat(r4, r5, r2, r0, r1)
                r3.mTranslateX = r0
                r0 = 7
                float r1 = r3.mTranslateY
                java.lang.String r2 = "translateY"
                float r0 = androidx.core.content.res.TypedArrayUtils.getNamedFloat(r4, r5, r2, r0, r1)
                r3.mTranslateY = r0
                r0 = 0
                java.lang.String r0 = r4.getString(r0)
                if (r0 == 0) goto L56
                r3.mGroupName = r0
            L56:
                r3.updateLocalMatrix()
                return
        }

        public java.lang.String getGroupName() {
                r1 = this;
                java.lang.String r0 = r1.mGroupName
                return r0
        }

        public android.graphics.Matrix getLocalMatrix() {
                r1 = this;
                android.graphics.Matrix r0 = r1.mLocalMatrix
                return r0
        }

        public float getPivotX() {
                r1 = this;
                float r0 = r1.mPivotX
                return r0
        }

        public float getPivotY() {
                r1 = this;
                float r0 = r1.mPivotY
                return r0
        }

        public float getRotation() {
                r1 = this;
                float r0 = r1.mRotate
                return r0
        }

        public float getScaleX() {
                r1 = this;
                float r0 = r1.mScaleX
                return r0
        }

        public float getScaleY() {
                r1 = this;
                float r0 = r1.mScaleY
                return r0
        }

        public float getTranslateX() {
                r1 = this;
                float r0 = r1.mTranslateX
                return r0
        }

        public float getTranslateY() {
                r1 = this;
                float r0 = r1.mTranslateY
                return r0
        }

        public void inflate(android.content.res.Resources r2, android.util.AttributeSet r3, android.content.res.Resources.Theme r4, org.xmlpull.v1.XmlPullParser r5) {
                r1 = this;
                int[] r0 = androidx.vectordrawable.graphics.drawable.AndroidResources.STYLEABLE_VECTOR_DRAWABLE_GROUP
                android.content.res.TypedArray r0 = androidx.core.content.res.TypedArrayUtils.obtainAttributes(r2, r4, r3, r0)
                r1.updateStateFromTypedArray(r0, r5)
                r0.recycle()
                return
        }

        @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VObject
        public boolean isStateful() {
                r2 = this;
                r0 = 0
            L1:
                java.util.ArrayList<androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VObject> r1 = r2.mChildren
                int r1 = r1.size()
                if (r0 >= r1) goto L1c
                java.util.ArrayList<androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VObject> r1 = r2.mChildren
                java.lang.Object r1 = r1.get(r0)
                androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VObject r1 = (androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VObject) r1
                boolean r1 = r1.isStateful()
                if (r1 == 0) goto L19
                r1 = 1
                return r1
            L19:
                int r0 = r0 + 1
                goto L1
            L1c:
                r0 = 0
                return r0
        }

        @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VObject
        public boolean onStateChanged(int[] r4) {
                r3 = this;
                r0 = 0
                r1 = 0
            L2:
                java.util.ArrayList<androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VObject> r2 = r3.mChildren
                int r2 = r2.size()
                if (r1 >= r2) goto L1a
                java.util.ArrayList<androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VObject> r2 = r3.mChildren
                java.lang.Object r2 = r2.get(r1)
                androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VObject r2 = (androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VObject) r2
                boolean r2 = r2.onStateChanged(r4)
                r0 = r0 | r2
                int r1 = r1 + 1
                goto L2
            L1a:
                return r0
        }

        public void setPivotX(float r2) {
                r1 = this;
                float r0 = r1.mPivotX
                int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r0 == 0) goto Lb
                r1.mPivotX = r2
                r1.updateLocalMatrix()
            Lb:
                return
        }

        public void setPivotY(float r2) {
                r1 = this;
                float r0 = r1.mPivotY
                int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r0 == 0) goto Lb
                r1.mPivotY = r2
                r1.updateLocalMatrix()
            Lb:
                return
        }

        public void setRotation(float r2) {
                r1 = this;
                float r0 = r1.mRotate
                int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r0 == 0) goto Lb
                r1.mRotate = r2
                r1.updateLocalMatrix()
            Lb:
                return
        }

        public void setScaleX(float r2) {
                r1 = this;
                float r0 = r1.mScaleX
                int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r0 == 0) goto Lb
                r1.mScaleX = r2
                r1.updateLocalMatrix()
            Lb:
                return
        }

        public void setScaleY(float r2) {
                r1 = this;
                float r0 = r1.mScaleY
                int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r0 == 0) goto Lb
                r1.mScaleY = r2
                r1.updateLocalMatrix()
            Lb:
                return
        }

        public void setTranslateX(float r2) {
                r1 = this;
                float r0 = r1.mTranslateX
                int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r0 == 0) goto Lb
                r1.mTranslateX = r2
                r1.updateLocalMatrix()
            Lb:
                return
        }

        public void setTranslateY(float r2) {
                r1 = this;
                float r0 = r1.mTranslateY
                int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r0 == 0) goto Lb
                r1.mTranslateY = r2
                r1.updateLocalMatrix()
            Lb:
                return
        }
    }

    private static abstract class VObject {
        private VObject() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ VObject(androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public boolean isStateful() {
                r1 = this;
                r0 = 0
                return r0
        }

        public boolean onStateChanged(int[] r2) {
                r1 = this;
                r0 = 0
                return r0
        }
    }

    private static abstract class VPath extends androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VObject {
        protected static final int FILL_TYPE_WINDING = 0;
        int mChangingConfigurations;
        int mFillRule;
        protected androidx.core.graphics.PathParser.PathDataNode[] mNodes;
        java.lang.String mPathName;

        public VPath() {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                r1.mNodes = r0
                r0 = 0
                r1.mFillRule = r0
                return
        }

        public VPath(androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VPath r2) {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                r1.mNodes = r0
                r0 = 0
                r1.mFillRule = r0
                java.lang.String r0 = r2.mPathName
                r1.mPathName = r0
                int r0 = r2.mChangingConfigurations
                r1.mChangingConfigurations = r0
                androidx.core.graphics.PathParser$PathDataNode[] r0 = r2.mNodes
                androidx.core.graphics.PathParser$PathDataNode[] r0 = androidx.core.graphics.PathParser.deepCopyNodes(r0)
                r1.mNodes = r0
                return
        }

        public void applyTheme(android.content.res.Resources.Theme r1) {
                r0 = this;
                return
        }

        public boolean canApplyTheme() {
                r1 = this;
                r0 = 0
                return r0
        }

        public androidx.core.graphics.PathParser.PathDataNode[] getPathData() {
                r1 = this;
                androidx.core.graphics.PathParser$PathDataNode[] r0 = r1.mNodes
                return r0
        }

        public java.lang.String getPathName() {
                r1 = this;
                java.lang.String r0 = r1.mPathName
                return r0
        }

        public boolean isClipPath() {
                r1 = this;
                r0 = 0
                return r0
        }

        public java.lang.String nodesToString(androidx.core.graphics.PathParser.PathDataNode[] r7) {
                r6 = this;
                java.lang.String r0 = " "
                r1 = 0
            L3:
                int r2 = r7.length
                if (r1 >= r2) goto L48
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.StringBuilder r2 = r2.append(r0)
                r3 = r7[r1]
                char r3 = r3.mType
                java.lang.StringBuilder r2 = r2.append(r3)
                java.lang.String r3 = ":"
                java.lang.StringBuilder r2 = r2.append(r3)
                java.lang.String r0 = r2.toString()
                r2 = r7[r1]
                float[] r2 = r2.mParams
                r3 = 0
            L26:
                int r4 = r2.length
                if (r3 >= r4) goto L45
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.StringBuilder r4 = r4.append(r0)
                r5 = r2[r3]
                java.lang.StringBuilder r4 = r4.append(r5)
                java.lang.String r5 = ","
                java.lang.StringBuilder r4 = r4.append(r5)
                java.lang.String r0 = r4.toString()
                int r3 = r3 + 1
                goto L26
            L45:
                int r1 = r1 + 1
                goto L3
            L48:
                return r0
        }

        public void printVPath(int r5) {
                r4 = this;
                java.lang.String r0 = ""
                r1 = 0
            L3:
                if (r1 >= r5) goto L1b
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.StringBuilder r2 = r2.append(r0)
                java.lang.String r3 = "    "
                java.lang.StringBuilder r2 = r2.append(r3)
                java.lang.String r0 = r2.toString()
                int r1 = r1 + 1
                goto L3
            L1b:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.StringBuilder r1 = r1.append(r0)
                java.lang.String r2 = "current path is :"
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.String r2 = r4.mPathName
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.String r2 = " pathData is "
                java.lang.StringBuilder r1 = r1.append(r2)
                androidx.core.graphics.PathParser$PathDataNode[] r2 = r4.mNodes
                java.lang.String r2 = r4.nodesToString(r2)
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.String r1 = r1.toString()
                java.lang.String r2 = "VectorDrawableCompat"
                android.util.Log.v(r2, r1)
                return
        }

        public void setPathData(androidx.core.graphics.PathParser.PathDataNode[] r2) {
                r1 = this;
                androidx.core.graphics.PathParser$PathDataNode[] r0 = r1.mNodes
                boolean r0 = androidx.core.graphics.PathParser.canMorph(r0, r2)
                if (r0 != 0) goto Lf
                androidx.core.graphics.PathParser$PathDataNode[] r0 = androidx.core.graphics.PathParser.deepCopyNodes(r2)
                r1.mNodes = r0
                goto L14
            Lf:
                androidx.core.graphics.PathParser$PathDataNode[] r0 = r1.mNodes
                androidx.core.graphics.PathParser.updateNodes(r0, r2)
            L14:
                return
        }

        public void toPath(android.graphics.Path r2) {
                r1 = this;
                r2.reset()
                androidx.core.graphics.PathParser$PathDataNode[] r0 = r1.mNodes
                if (r0 == 0) goto Lc
                androidx.core.graphics.PathParser$PathDataNode[] r0 = r1.mNodes
                androidx.core.graphics.PathParser.PathDataNode.nodesToPath(r0, r2)
            Lc:
                return
        }
    }

    private static class VPathRenderer {
        private static final android.graphics.Matrix IDENTITY_MATRIX = null;
        float mBaseHeight;
        float mBaseWidth;
        private int mChangingConfigurations;
        android.graphics.Paint mFillPaint;
        private final android.graphics.Matrix mFinalPathMatrix;
        java.lang.Boolean mIsStateful;
        private final android.graphics.Path mPath;
        private android.graphics.PathMeasure mPathMeasure;
        private final android.graphics.Path mRenderPath;
        int mRootAlpha;
        final androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VGroup mRootGroup;
        java.lang.String mRootName;
        android.graphics.Paint mStrokePaint;
        final androidx.collection.ArrayMap<java.lang.String, java.lang.Object> mVGTargetsMap;
        float mViewportHeight;
        float mViewportWidth;

        static {
                android.graphics.Matrix r0 = new android.graphics.Matrix
                r0.<init>()
                androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VPathRenderer.IDENTITY_MATRIX = r0
                return
        }

        public VPathRenderer() {
                r1 = this;
                r1.<init>()
                android.graphics.Matrix r0 = new android.graphics.Matrix
                r0.<init>()
                r1.mFinalPathMatrix = r0
                r0 = 0
                r1.mBaseWidth = r0
                r1.mBaseHeight = r0
                r1.mViewportWidth = r0
                r1.mViewportHeight = r0
                r0 = 255(0xff, float:3.57E-43)
                r1.mRootAlpha = r0
                r0 = 0
                r1.mRootName = r0
                r1.mIsStateful = r0
                androidx.collection.ArrayMap r0 = new androidx.collection.ArrayMap
                r0.<init>()
                r1.mVGTargetsMap = r0
                androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VGroup r0 = new androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VGroup
                r0.<init>()
                r1.mRootGroup = r0
                android.graphics.Path r0 = new android.graphics.Path
                r0.<init>()
                r1.mPath = r0
                android.graphics.Path r0 = new android.graphics.Path
                r0.<init>()
                r1.mRenderPath = r0
                return
        }

        public VPathRenderer(androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VPathRenderer r4) {
                r3 = this;
                r3.<init>()
                android.graphics.Matrix r0 = new android.graphics.Matrix
                r0.<init>()
                r3.mFinalPathMatrix = r0
                r0 = 0
                r3.mBaseWidth = r0
                r3.mBaseHeight = r0
                r3.mViewportWidth = r0
                r3.mViewportHeight = r0
                r0 = 255(0xff, float:3.57E-43)
                r3.mRootAlpha = r0
                r0 = 0
                r3.mRootName = r0
                r3.mIsStateful = r0
                androidx.collection.ArrayMap r0 = new androidx.collection.ArrayMap
                r0.<init>()
                r3.mVGTargetsMap = r0
                androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VGroup r0 = new androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VGroup
                androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VGroup r1 = r4.mRootGroup
                androidx.collection.ArrayMap<java.lang.String, java.lang.Object> r2 = r3.mVGTargetsMap
                r0.<init>(r1, r2)
                r3.mRootGroup = r0
                android.graphics.Path r0 = new android.graphics.Path
                android.graphics.Path r1 = r4.mPath
                r0.<init>(r1)
                r3.mPath = r0
                android.graphics.Path r0 = new android.graphics.Path
                android.graphics.Path r1 = r4.mRenderPath
                r0.<init>(r1)
                r3.mRenderPath = r0
                float r0 = r4.mBaseWidth
                r3.mBaseWidth = r0
                float r0 = r4.mBaseHeight
                r3.mBaseHeight = r0
                float r0 = r4.mViewportWidth
                r3.mViewportWidth = r0
                float r0 = r4.mViewportHeight
                r3.mViewportHeight = r0
                int r0 = r4.mChangingConfigurations
                r3.mChangingConfigurations = r0
                int r0 = r4.mRootAlpha
                r3.mRootAlpha = r0
                java.lang.String r0 = r4.mRootName
                r3.mRootName = r0
                java.lang.String r0 = r4.mRootName
                if (r0 == 0) goto L67
                androidx.collection.ArrayMap<java.lang.String, java.lang.Object> r0 = r3.mVGTargetsMap
                java.lang.String r1 = r4.mRootName
                r0.put(r1, r3)
            L67:
                java.lang.Boolean r0 = r4.mIsStateful
                r3.mIsStateful = r0
                return
        }

        private static float cross(float r2, float r3, float r4, float r5) {
                float r0 = r2 * r5
                float r1 = r3 * r4
                float r0 = r0 - r1
                return r0
        }

        private void drawGroupTree(androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VGroup r18, android.graphics.Matrix r19, android.graphics.Canvas r20, int r21, int r22, android.graphics.ColorFilter r23) {
                r17 = this;
                r1 = r18
                android.graphics.Matrix r0 = r1.mStackedMatrix
                r7 = r19
                r0.set(r7)
                android.graphics.Matrix r0 = r1.mStackedMatrix
                android.graphics.Matrix r2 = r1.mLocalMatrix
                r0.preConcat(r2)
                r20.save()
                r0 = 0
                r8 = r0
            L15:
                java.util.ArrayList<androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VObject> r0 = r1.mChildren
                int r0 = r0.size()
                if (r8 >= r0) goto L58
                java.util.ArrayList<androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VObject> r0 = r1.mChildren
                java.lang.Object r0 = r0.get(r8)
                r9 = r0
                androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VObject r9 = (androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VObject) r9
                boolean r0 = r9 instanceof androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VGroup
                if (r0 == 0) goto L3d
                r11 = r9
                androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VGroup r11 = (androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VGroup) r11
                android.graphics.Matrix r12 = r1.mStackedMatrix
                r10 = r17
                r13 = r20
                r14 = r21
                r15 = r22
                r16 = r23
                r10.drawGroupTree(r11, r12, r13, r14, r15, r16)
                goto L52
            L3d:
                boolean r0 = r9 instanceof androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VPath
                if (r0 == 0) goto L52
                r2 = r9
                androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VPath r2 = (androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VPath) r2
                r0 = r17
                r3 = r20
                r4 = r21
                r5 = r22
                r6 = r23
                r0.drawPath(r1, r2, r3, r4, r5, r6)
                goto L53
            L52:
            L53:
                int r8 = r8 + 1
                r1 = r18
                goto L15
            L58:
                r20.restore()
                return
        }

        private void drawPath(androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VGroup r20, androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VPath r21, android.graphics.Canvas r22, int r23, int r24, android.graphics.ColorFilter r25) {
                r19 = this;
                r0 = r19
                r1 = r21
                r2 = r22
                r3 = r25
                r4 = r23
                float r5 = (float) r4
                float r6 = r0.mViewportWidth
                float r5 = r5 / r6
                r6 = r24
                float r7 = (float) r6
                float r8 = r0.mViewportHeight
                float r7 = r7 / r8
                float r8 = java.lang.Math.min(r5, r7)
                r9 = r20
                android.graphics.Matrix r10 = r9.mStackedMatrix
                android.graphics.Matrix r11 = r0.mFinalPathMatrix
                r11.set(r10)
                android.graphics.Matrix r11 = r0.mFinalPathMatrix
                r11.postScale(r5, r7)
                float r11 = r0.getMatrixScale(r10)
                r12 = 0
                int r13 = (r11 > r12 ? 1 : (r11 == r12 ? 0 : -1))
                if (r13 != 0) goto L30
                return
            L30:
                android.graphics.Path r13 = r0.mPath
                r1.toPath(r13)
                android.graphics.Path r13 = r0.mPath
                android.graphics.Path r14 = r0.mRenderPath
                r14.reset()
                boolean r14 = r1.isClipPath()
                if (r14 == 0) goto L60
                android.graphics.Path r12 = r0.mRenderPath
                int r14 = r1.mFillRule
                if (r14 != 0) goto L4b
                android.graphics.Path$FillType r14 = android.graphics.Path.FillType.WINDING
                goto L4d
            L4b:
                android.graphics.Path$FillType r14 = android.graphics.Path.FillType.EVEN_ODD
            L4d:
                r12.setFillType(r14)
                android.graphics.Path r12 = r0.mRenderPath
                android.graphics.Matrix r14 = r0.mFinalPathMatrix
                r12.addPath(r13, r14)
                android.graphics.Path r12 = r0.mRenderPath
                r2.clipPath(r12)
                r16 = r5
                goto L1b3
            L60:
                r14 = r1
                androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VFullPath r14 = (androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VFullPath) r14
                float r15 = r14.mTrimPathStart
                int r15 = (r15 > r12 ? 1 : (r15 == r12 ? 0 : -1))
                r16 = 1065353216(0x3f800000, float:1.0)
                if (r15 != 0) goto L75
                float r15 = r14.mTrimPathEnd
                int r15 = (r15 > r16 ? 1 : (r15 == r16 ? 0 : -1))
                if (r15 == 0) goto L72
                goto L75
            L72:
                r16 = r5
                goto Lc2
            L75:
                float r15 = r14.mTrimPathStart
                float r12 = r14.mTrimPathOffset
                float r15 = r15 + r12
                float r15 = r15 % r16
                float r12 = r14.mTrimPathEnd
                float r1 = r14.mTrimPathOffset
                float r12 = r12 + r1
                float r12 = r12 % r16
                android.graphics.PathMeasure r1 = r0.mPathMeasure
                if (r1 != 0) goto L8e
                android.graphics.PathMeasure r1 = new android.graphics.PathMeasure
                r1.<init>()
                r0.mPathMeasure = r1
            L8e:
                android.graphics.PathMeasure r1 = r0.mPathMeasure
                android.graphics.Path r4 = r0.mPath
                r16 = r5
                r5 = 0
                r1.setPath(r4, r5)
                android.graphics.PathMeasure r1 = r0.mPathMeasure
                float r1 = r1.getLength()
                float r15 = r15 * r1
                float r12 = r12 * r1
                r13.reset()
                int r4 = (r15 > r12 ? 1 : (r15 == r12 ? 0 : -1))
                if (r4 <= 0) goto Lb6
                android.graphics.PathMeasure r4 = r0.mPathMeasure
                r5 = 1
                r4.getSegment(r15, r1, r13, r5)
                android.graphics.PathMeasure r4 = r0.mPathMeasure
                r18 = r1
                r1 = 0
                r4.getSegment(r1, r12, r13, r5)
                goto Lbf
            Lb6:
                r18 = r1
                r1 = 0
                r5 = 1
                android.graphics.PathMeasure r4 = r0.mPathMeasure
                r4.getSegment(r15, r12, r13, r5)
            Lbf:
                r13.rLineTo(r1, r1)
            Lc2:
                android.graphics.Path r1 = r0.mRenderPath
                android.graphics.Matrix r4 = r0.mFinalPathMatrix
                r1.addPath(r13, r4)
                androidx.core.content.res.ComplexColorCompat r1 = r14.mFillColor
                boolean r1 = r1.willDraw()
                r12 = 0
                if (r1 == 0) goto L138
                androidx.core.content.res.ComplexColorCompat r1 = r14.mFillColor
                android.graphics.Paint r15 = r0.mFillPaint
                if (r15 != 0) goto Lea
                android.graphics.Paint r15 = new android.graphics.Paint
                r4 = 1
                r17 = 1132396544(0x437f0000, float:255.0)
                r15.<init>(r4)
                r0.mFillPaint = r15
                android.graphics.Paint r4 = r0.mFillPaint
                android.graphics.Paint$Style r15 = android.graphics.Paint.Style.FILL
                r4.setStyle(r15)
                goto Lec
            Lea:
                r17 = 1132396544(0x437f0000, float:255.0)
            Lec:
                android.graphics.Paint r4 = r0.mFillPaint
                boolean r15 = r1.isGradient()
                if (r15 == 0) goto L10c
                android.graphics.Shader r15 = r1.getShader()
                android.graphics.Matrix r5 = r0.mFinalPathMatrix
                r15.setLocalMatrix(r5)
                r4.setShader(r15)
                float r5 = r14.mFillAlpha
                float r5 = r5 * r17
                int r5 = java.lang.Math.round(r5)
                r4.setAlpha(r5)
                goto L121
            L10c:
                r4.setShader(r12)
                r5 = 255(0xff, float:3.57E-43)
                r4.setAlpha(r5)
                int r5 = r1.getColor()
                float r15 = r14.mFillAlpha
                int r5 = androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.applyAlpha(r5, r15)
                r4.setColor(r5)
            L121:
                r4.setColorFilter(r3)
                android.graphics.Path r5 = r0.mRenderPath
                int r15 = r14.mFillRule
                if (r15 != 0) goto L12d
                android.graphics.Path$FillType r15 = android.graphics.Path.FillType.WINDING
                goto L12f
            L12d:
                android.graphics.Path$FillType r15 = android.graphics.Path.FillType.EVEN_ODD
            L12f:
                r5.setFillType(r15)
                android.graphics.Path r5 = r0.mRenderPath
                r2.drawPath(r5, r4)
                goto L13a
            L138:
                r17 = 1132396544(0x437f0000, float:255.0)
            L13a:
                androidx.core.content.res.ComplexColorCompat r1 = r14.mStrokeColor
                boolean r1 = r1.willDraw()
                if (r1 == 0) goto L1b3
                androidx.core.content.res.ComplexColorCompat r1 = r14.mStrokeColor
                android.graphics.Paint r4 = r0.mStrokePaint
                if (r4 != 0) goto L157
                android.graphics.Paint r4 = new android.graphics.Paint
                r5 = 1
                r4.<init>(r5)
                r0.mStrokePaint = r4
                android.graphics.Paint r4 = r0.mStrokePaint
                android.graphics.Paint$Style r5 = android.graphics.Paint.Style.STROKE
                r4.setStyle(r5)
            L157:
                android.graphics.Paint r4 = r0.mStrokePaint
                android.graphics.Paint$Join r5 = r14.mStrokeLineJoin
                if (r5 == 0) goto L162
                android.graphics.Paint$Join r5 = r14.mStrokeLineJoin
                r4.setStrokeJoin(r5)
            L162:
                android.graphics.Paint$Cap r5 = r14.mStrokeLineCap
                if (r5 == 0) goto L16b
                android.graphics.Paint$Cap r5 = r14.mStrokeLineCap
                r4.setStrokeCap(r5)
            L16b:
                float r5 = r14.mStrokeMiterlimit
                r4.setStrokeMiter(r5)
                boolean r5 = r1.isGradient()
                if (r5 == 0) goto L18e
                android.graphics.Shader r5 = r1.getShader()
                android.graphics.Matrix r12 = r0.mFinalPathMatrix
                r5.setLocalMatrix(r12)
                r4.setShader(r5)
                float r12 = r14.mStrokeAlpha
                float r12 = r12 * r17
                int r12 = java.lang.Math.round(r12)
                r4.setAlpha(r12)
                goto L1a3
            L18e:
                r4.setShader(r12)
                r5 = 255(0xff, float:3.57E-43)
                r4.setAlpha(r5)
                int r5 = r1.getColor()
                float r12 = r14.mStrokeAlpha
                int r5 = androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.applyAlpha(r5, r12)
                r4.setColor(r5)
            L1a3:
                r4.setColorFilter(r3)
                float r5 = r8 * r11
                float r12 = r14.mStrokeWidth
                float r12 = r12 * r5
                r4.setStrokeWidth(r12)
                android.graphics.Path r12 = r0.mRenderPath
                r2.drawPath(r12, r4)
            L1b3:
                return
        }

        private float getMatrixScale(android.graphics.Matrix r11) {
                r10 = this;
                r0 = 4
                float[] r0 = new float[r0]
                r0 = {x0040: FILL_ARRAY_DATA , data: [0, 1065353216, 1065353216, 0} // fill-array
                r11.mapVectors(r0)
                r1 = 0
                r2 = r0[r1]
                double r2 = (double) r2
                r4 = 1
                r5 = r0[r4]
                double r5 = (double) r5
                double r2 = java.lang.Math.hypot(r2, r5)
                float r2 = (float) r2
                r3 = 2
                r5 = r0[r3]
                double r5 = (double) r5
                r7 = 3
                r8 = r0[r7]
                double r8 = (double) r8
                double r5 = java.lang.Math.hypot(r5, r8)
                float r5 = (float) r5
                r1 = r0[r1]
                r4 = r0[r4]
                r3 = r0[r3]
                r6 = r0[r7]
                float r1 = cross(r1, r4, r3, r6)
                float r3 = java.lang.Math.max(r2, r5)
                r4 = 0
                r6 = 0
                int r6 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
                if (r6 <= 0) goto L3f
                float r6 = java.lang.Math.abs(r1)
                float r4 = r6 / r3
            L3f:
                return r4
        }

        public void draw(android.graphics.Canvas r8, int r9, int r10, android.graphics.ColorFilter r11) {
                r7 = this;
                androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VGroup r1 = r7.mRootGroup
                android.graphics.Matrix r2 = androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VPathRenderer.IDENTITY_MATRIX
                r0 = r7
                r3 = r8
                r4 = r9
                r5 = r10
                r6 = r11
                r0.drawGroupTree(r1, r2, r3, r4, r5, r6)
                return
        }

        public float getAlpha() {
                r2 = this;
                int r0 = r2.getRootAlpha()
                float r0 = (float) r0
                r1 = 1132396544(0x437f0000, float:255.0)
                float r0 = r0 / r1
                return r0
        }

        public int getRootAlpha() {
                r1 = this;
                int r0 = r1.mRootAlpha
                return r0
        }

        public boolean isStateful() {
                r1 = this;
                java.lang.Boolean r0 = r1.mIsStateful
                if (r0 != 0) goto L10
                androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VGroup r0 = r1.mRootGroup
                boolean r0 = r0.isStateful()
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                r1.mIsStateful = r0
            L10:
                java.lang.Boolean r0 = r1.mIsStateful
                boolean r0 = r0.booleanValue()
                return r0
        }

        public boolean onStateChanged(int[] r2) {
                r1 = this;
                androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VGroup r0 = r1.mRootGroup
                boolean r0 = r0.onStateChanged(r2)
                return r0
        }

        public void setAlpha(float r2) {
                r1 = this;
                r0 = 1132396544(0x437f0000, float:255.0)
                float r0 = r0 * r2
                int r0 = (int) r0
                r1.setRootAlpha(r0)
                return
        }

        public void setRootAlpha(int r1) {
                r0 = this;
                r0.mRootAlpha = r1
                return
        }
    }

    private static class VectorDrawableCompatState extends android.graphics.drawable.Drawable.ConstantState {
        boolean mAutoMirrored;
        boolean mCacheDirty;
        boolean mCachedAutoMirrored;
        android.graphics.Bitmap mCachedBitmap;
        int mCachedRootAlpha;
        int[] mCachedThemeAttrs;
        android.content.res.ColorStateList mCachedTint;
        android.graphics.PorterDuff.Mode mCachedTintMode;
        int mChangingConfigurations;
        android.graphics.Paint mTempPaint;
        android.content.res.ColorStateList mTint;
        android.graphics.PorterDuff.Mode mTintMode;
        androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VPathRenderer mVPathRenderer;

        public VectorDrawableCompatState() {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.mTint = r0
                android.graphics.PorterDuff$Mode r0 = androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.DEFAULT_TINT_MODE
                r1.mTintMode = r0
                androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VPathRenderer r0 = new androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VPathRenderer
                r0.<init>()
                r1.mVPathRenderer = r0
                return
        }

        public VectorDrawableCompatState(androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VectorDrawableCompatState r4) {
                r3 = this;
                r3.<init>()
                r0 = 0
                r3.mTint = r0
                android.graphics.PorterDuff$Mode r0 = androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.DEFAULT_TINT_MODE
                r3.mTintMode = r0
                if (r4 == 0) goto L4b
                int r0 = r4.mChangingConfigurations
                r3.mChangingConfigurations = r0
                androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VPathRenderer r0 = new androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VPathRenderer
                androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VPathRenderer r1 = r4.mVPathRenderer
                r0.<init>(r1)
                r3.mVPathRenderer = r0
                androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VPathRenderer r0 = r4.mVPathRenderer
                android.graphics.Paint r0 = r0.mFillPaint
                if (r0 == 0) goto L2c
                androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VPathRenderer r0 = r3.mVPathRenderer
                android.graphics.Paint r1 = new android.graphics.Paint
                androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VPathRenderer r2 = r4.mVPathRenderer
                android.graphics.Paint r2 = r2.mFillPaint
                r1.<init>(r2)
                r0.mFillPaint = r1
            L2c:
                androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VPathRenderer r0 = r4.mVPathRenderer
                android.graphics.Paint r0 = r0.mStrokePaint
                if (r0 == 0) goto L3f
                androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VPathRenderer r0 = r3.mVPathRenderer
                android.graphics.Paint r1 = new android.graphics.Paint
                androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VPathRenderer r2 = r4.mVPathRenderer
                android.graphics.Paint r2 = r2.mStrokePaint
                r1.<init>(r2)
                r0.mStrokePaint = r1
            L3f:
                android.content.res.ColorStateList r0 = r4.mTint
                r3.mTint = r0
                android.graphics.PorterDuff$Mode r0 = r4.mTintMode
                r3.mTintMode = r0
                boolean r0 = r4.mAutoMirrored
                r3.mAutoMirrored = r0
            L4b:
                return
        }

        public boolean canReuseBitmap(int r2, int r3) {
                r1 = this;
                android.graphics.Bitmap r0 = r1.mCachedBitmap
                int r0 = r0.getWidth()
                if (r2 != r0) goto L12
                android.graphics.Bitmap r0 = r1.mCachedBitmap
                int r0 = r0.getHeight()
                if (r3 != r0) goto L12
                r0 = 1
                return r0
            L12:
                r0 = 0
                return r0
        }

        public boolean canReuseCache() {
                r2 = this;
                boolean r0 = r2.mCacheDirty
                if (r0 != 0) goto L22
                android.content.res.ColorStateList r0 = r2.mCachedTint
                android.content.res.ColorStateList r1 = r2.mTint
                if (r0 != r1) goto L22
                android.graphics.PorterDuff$Mode r0 = r2.mCachedTintMode
                android.graphics.PorterDuff$Mode r1 = r2.mTintMode
                if (r0 != r1) goto L22
                boolean r0 = r2.mCachedAutoMirrored
                boolean r1 = r2.mAutoMirrored
                if (r0 != r1) goto L22
                int r0 = r2.mCachedRootAlpha
                androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VPathRenderer r1 = r2.mVPathRenderer
                int r1 = r1.getRootAlpha()
                if (r0 != r1) goto L22
                r0 = 1
                return r0
            L22:
                r0 = 0
                return r0
        }

        public void createCachedBitmapIfNeeded(int r2, int r3) {
                r1 = this;
                android.graphics.Bitmap r0 = r1.mCachedBitmap
                if (r0 == 0) goto La
                boolean r0 = r1.canReuseBitmap(r2, r3)
                if (r0 != 0) goto L15
            La:
                android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
                android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r2, r3, r0)
                r1.mCachedBitmap = r0
                r0 = 1
                r1.mCacheDirty = r0
            L15:
                return
        }

        public void drawCachedBitmapWithRootAlpha(android.graphics.Canvas r4, android.graphics.ColorFilter r5, android.graphics.Rect r6) {
                r3 = this;
                android.graphics.Paint r0 = r3.getPaint(r5)
                android.graphics.Bitmap r1 = r3.mCachedBitmap
                r2 = 0
                r4.drawBitmap(r1, r2, r6, r0)
                return
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
                r1 = this;
                int r0 = r1.mChangingConfigurations
                return r0
        }

        public android.graphics.Paint getPaint(android.graphics.ColorFilter r3) {
                r2 = this;
                boolean r0 = r2.hasTranslucentRoot()
                if (r0 != 0) goto La
                if (r3 != 0) goto La
                r0 = 0
                return r0
            La:
                android.graphics.Paint r0 = r2.mTempPaint
                if (r0 != 0) goto L1b
                android.graphics.Paint r0 = new android.graphics.Paint
                r0.<init>()
                r2.mTempPaint = r0
                android.graphics.Paint r0 = r2.mTempPaint
                r1 = 1
                r0.setFilterBitmap(r1)
            L1b:
                android.graphics.Paint r0 = r2.mTempPaint
                androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VPathRenderer r1 = r2.mVPathRenderer
                int r1 = r1.getRootAlpha()
                r0.setAlpha(r1)
                android.graphics.Paint r0 = r2.mTempPaint
                r0.setColorFilter(r3)
                android.graphics.Paint r0 = r2.mTempPaint
                return r0
        }

        public boolean hasTranslucentRoot() {
                r2 = this;
                androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VPathRenderer r0 = r2.mVPathRenderer
                int r0 = r0.getRootAlpha()
                r1 = 255(0xff, float:3.57E-43)
                if (r0 >= r1) goto Lc
                r0 = 1
                goto Ld
            Lc:
                r0 = 0
            Ld:
                return r0
        }

        public boolean isStateful() {
                r1 = this;
                androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VPathRenderer r0 = r1.mVPathRenderer
                boolean r0 = r0.isStateful()
                return r0
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public android.graphics.drawable.Drawable newDrawable() {
                r1 = this;
                androidx.vectordrawable.graphics.drawable.VectorDrawableCompat r0 = new androidx.vectordrawable.graphics.drawable.VectorDrawableCompat
                r0.<init>(r1)
                return r0
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public android.graphics.drawable.Drawable newDrawable(android.content.res.Resources r2) {
                r1 = this;
                androidx.vectordrawable.graphics.drawable.VectorDrawableCompat r0 = new androidx.vectordrawable.graphics.drawable.VectorDrawableCompat
                r0.<init>(r1)
                return r0
        }

        public boolean onStateChanged(int[] r3) {
                r2 = this;
                androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VPathRenderer r0 = r2.mVPathRenderer
                boolean r0 = r0.onStateChanged(r3)
                boolean r1 = r2.mCacheDirty
                r1 = r1 | r0
                r2.mCacheDirty = r1
                return r0
        }

        public void updateCacheStates() {
                r1 = this;
                android.content.res.ColorStateList r0 = r1.mTint
                r1.mCachedTint = r0
                android.graphics.PorterDuff$Mode r0 = r1.mTintMode
                r1.mCachedTintMode = r0
                androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VPathRenderer r0 = r1.mVPathRenderer
                int r0 = r0.getRootAlpha()
                r1.mCachedRootAlpha = r0
                boolean r0 = r1.mAutoMirrored
                r1.mCachedAutoMirrored = r0
                r0 = 0
                r1.mCacheDirty = r0
                return
        }

        public void updateCachedBitmap(int r4, int r5) {
                r3 = this;
                android.graphics.Bitmap r0 = r3.mCachedBitmap
                r1 = 0
                r0.eraseColor(r1)
                android.graphics.Canvas r0 = new android.graphics.Canvas
                android.graphics.Bitmap r1 = r3.mCachedBitmap
                r0.<init>(r1)
                androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VPathRenderer r1 = r3.mVPathRenderer
                r2 = 0
                r1.draw(r0, r4, r5, r2)
                return
        }
    }

    private static class VectorDrawableDelegateState extends android.graphics.drawable.Drawable.ConstantState {
        private final android.graphics.drawable.Drawable.ConstantState mDelegateState;

        public VectorDrawableDelegateState(android.graphics.drawable.Drawable.ConstantState r1) {
                r0 = this;
                r0.<init>()
                r0.mDelegateState = r1
                return
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
                r1 = this;
                android.graphics.drawable.Drawable$ConstantState r0 = r1.mDelegateState
                boolean r0 = r0.canApplyTheme()
                return r0
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
                r1 = this;
                android.graphics.drawable.Drawable$ConstantState r0 = r1.mDelegateState
                int r0 = r0.getChangingConfigurations()
                return r0
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public android.graphics.drawable.Drawable newDrawable() {
                r2 = this;
                androidx.vectordrawable.graphics.drawable.VectorDrawableCompat r0 = new androidx.vectordrawable.graphics.drawable.VectorDrawableCompat
                r0.<init>()
                android.graphics.drawable.Drawable$ConstantState r1 = r2.mDelegateState
                android.graphics.drawable.Drawable r1 = r1.newDrawable()
                android.graphics.drawable.VectorDrawable r1 = (android.graphics.drawable.VectorDrawable) r1
                r0.mDelegateDrawable = r1
                return r0
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public android.graphics.drawable.Drawable newDrawable(android.content.res.Resources r3) {
                r2 = this;
                androidx.vectordrawable.graphics.drawable.VectorDrawableCompat r0 = new androidx.vectordrawable.graphics.drawable.VectorDrawableCompat
                r0.<init>()
                android.graphics.drawable.Drawable$ConstantState r1 = r2.mDelegateState
                android.graphics.drawable.Drawable r1 = r1.newDrawable(r3)
                android.graphics.drawable.VectorDrawable r1 = (android.graphics.drawable.VectorDrawable) r1
                r0.mDelegateDrawable = r1
                return r0
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public android.graphics.drawable.Drawable newDrawable(android.content.res.Resources r3, android.content.res.Resources.Theme r4) {
                r2 = this;
                androidx.vectordrawable.graphics.drawable.VectorDrawableCompat r0 = new androidx.vectordrawable.graphics.drawable.VectorDrawableCompat
                r0.<init>()
                android.graphics.drawable.Drawable$ConstantState r1 = r2.mDelegateState
                android.graphics.drawable.Drawable r1 = r1.newDrawable(r3, r4)
                android.graphics.drawable.VectorDrawable r1 = (android.graphics.drawable.VectorDrawable) r1
                r0.mDelegateDrawable = r1
                return r0
        }
    }

    static {
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_IN
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.DEFAULT_TINT_MODE = r0
            return
    }

    VectorDrawableCompat() {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.mAllowCaching = r0
            r0 = 9
            float[] r0 = new float[r0]
            r1.mTmpFloats = r0
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            r1.mTmpMatrix = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r1.mTmpBounds = r0
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VectorDrawableCompatState r0 = new androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VectorDrawableCompatState
            r0.<init>()
            r1.mVectorState = r0
            return
    }

    VectorDrawableCompat(androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VectorDrawableCompatState r4) {
            r3 = this;
            r3.<init>()
            r0 = 1
            r3.mAllowCaching = r0
            r0 = 9
            float[] r0 = new float[r0]
            r3.mTmpFloats = r0
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            r3.mTmpMatrix = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r3.mTmpBounds = r0
            r3.mVectorState = r4
            android.graphics.PorterDuffColorFilter r0 = r3.mTintFilter
            android.content.res.ColorStateList r1 = r4.mTint
            android.graphics.PorterDuff$Mode r2 = r4.mTintMode
            android.graphics.PorterDuffColorFilter r0 = r3.updateTintFilter(r0, r1, r2)
            r3.mTintFilter = r0
            return
    }

    static int applyAlpha(int r2, float r3) {
            int r0 = android.graphics.Color.alpha(r2)
            r1 = 16777215(0xffffff, float:2.3509886E-38)
            r2 = r2 & r1
            float r1 = (float) r0
            float r1 = r1 * r3
            int r1 = (int) r1
            int r1 = r1 << 24
            r2 = r2 | r1
            return r2
    }

    public static androidx.vectordrawable.graphics.drawable.VectorDrawableCompat create(android.content.res.Resources r3, int r4, android.content.res.Resources.Theme r5) {
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat r0 = new androidx.vectordrawable.graphics.drawable.VectorDrawableCompat
            r0.<init>()
            android.graphics.drawable.Drawable r1 = androidx.core.content.res.ResourcesCompat.getDrawable(r3, r4, r5)
            r0.mDelegateDrawable = r1
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VectorDrawableDelegateState r1 = new androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VectorDrawableDelegateState
            android.graphics.drawable.Drawable r2 = r0.mDelegateDrawable
            android.graphics.drawable.Drawable$ConstantState r2 = r2.getConstantState()
            r1.<init>(r2)
            r0.mCachedConstantStateDelegate = r1
            return r0
    }

    public static androidx.vectordrawable.graphics.drawable.VectorDrawableCompat createFromXmlInner(android.content.res.Resources r1, org.xmlpull.v1.XmlPullParser r2, android.util.AttributeSet r3, android.content.res.Resources.Theme r4) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat r0 = new androidx.vectordrawable.graphics.drawable.VectorDrawableCompat
            r0.<init>()
            r0.inflate(r1, r2, r3, r4)
            return r0
    }

    private void inflateInternal(android.content.res.Resources r17, org.xmlpull.v1.XmlPullParser r18, android.util.AttributeSet r19, android.content.res.Resources.Theme r20) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
            r16 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            r4 = r16
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VectorDrawableCompatState r5 = r4.mVectorState
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VPathRenderer r6 = r5.mVPathRenderer
            r7 = 1
            java.util.ArrayDeque r8 = new java.util.ArrayDeque
            r8.<init>()
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VGroup r9 = r6.mRootGroup
            r8.push(r9)
            int r9 = r1.getEventType()
            int r10 = r1.getDepth()
            r11 = 1
            int r10 = r10 + r11
        L23:
            if (r9 == r11) goto Ldb
            int r12 = r1.getDepth()
            r13 = 3
            if (r12 >= r10) goto L2e
            if (r9 == r13) goto Ldb
        L2e:
            r12 = 2
            java.lang.String r14 = "group"
            if (r9 != r12) goto Lc5
            java.lang.String r12 = r1.getName()
            java.lang.Object r13 = r8.peek()
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VGroup r13 = (androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VGroup) r13
            java.lang.String r15 = "path"
            boolean r15 = r15.equals(r12)
            if (r15 == 0) goto L6a
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VFullPath r14 = new androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VFullPath
            r14.<init>()
            r14.inflate(r0, r2, r3, r1)
            java.util.ArrayList<androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VObject> r15 = r13.mChildren
            r15.add(r14)
            java.lang.String r15 = r14.getPathName()
            if (r15 == 0) goto L61
            androidx.collection.ArrayMap<java.lang.String, java.lang.Object> r15 = r6.mVGTargetsMap
            java.lang.String r11 = r14.getPathName()
            r15.put(r11, r14)
        L61:
            r7 = 0
            int r11 = r5.mChangingConfigurations
            int r15 = r14.mChangingConfigurations
            r11 = r11 | r15
            r5.mChangingConfigurations = r11
            goto Lc4
        L6a:
            java.lang.String r11 = "clip-path"
            boolean r11 = r11.equals(r12)
            if (r11 == 0) goto L96
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VClipPath r11 = new androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VClipPath
            r11.<init>()
            r11.inflate(r0, r2, r3, r1)
            java.util.ArrayList<androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VObject> r14 = r13.mChildren
            r14.add(r11)
            java.lang.String r14 = r11.getPathName()
            if (r14 == 0) goto L8e
            androidx.collection.ArrayMap<java.lang.String, java.lang.Object> r14 = r6.mVGTargetsMap
            java.lang.String r15 = r11.getPathName()
            r14.put(r15, r11)
        L8e:
            int r14 = r5.mChangingConfigurations
            int r15 = r11.mChangingConfigurations
            r14 = r14 | r15
            r5.mChangingConfigurations = r14
            goto Lc3
        L96:
            boolean r11 = r14.equals(r12)
            if (r11 == 0) goto Lc3
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VGroup r11 = new androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VGroup
            r11.<init>()
            r11.inflate(r0, r2, r3, r1)
            java.util.ArrayList<androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VObject> r14 = r13.mChildren
            r14.add(r11)
            r8.push(r11)
            java.lang.String r14 = r11.getGroupName()
            if (r14 == 0) goto Lbb
            androidx.collection.ArrayMap<java.lang.String, java.lang.Object> r14 = r6.mVGTargetsMap
            java.lang.String r15 = r11.getGroupName()
            r14.put(r15, r11)
        Lbb:
            int r14 = r5.mChangingConfigurations
            int r15 = r11.mChangingConfigurations
            r14 = r14 | r15
            r5.mChangingConfigurations = r14
            goto Lc4
        Lc3:
        Lc4:
            goto Ld4
        Lc5:
            if (r9 != r13) goto Lc4
            java.lang.String r11 = r1.getName()
            boolean r12 = r14.equals(r11)
            if (r12 == 0) goto Ld4
            r8.pop()
        Ld4:
            int r9 = r1.next()
            r11 = 1
            goto L23
        Ldb:
            if (r7 != 0) goto Lde
            return
        Lde:
            org.xmlpull.v1.XmlPullParserException r11 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r12 = "no path defined"
            r11.<init>(r12)
            throw r11
    }

    private boolean needMirroring() {
            r2 = this;
            boolean r0 = r2.isAutoMirrored()
            if (r0 == 0) goto Lf
            int r0 = androidx.core.graphics.drawable.DrawableCompat.getLayoutDirection(r2)
            r1 = 1
            if (r0 != r1) goto Lf
            goto L10
        Lf:
            r1 = 0
        L10:
            return r1
    }

    private static android.graphics.PorterDuff.Mode parseTintModeCompat(int r1, android.graphics.PorterDuff.Mode r2) {
            switch(r1) {
                case 3: goto L13;
                case 5: goto L10;
                case 9: goto Ld;
                case 14: goto La;
                case 15: goto L7;
                case 16: goto L4;
                default: goto L3;
            }
        L3:
            return r2
        L4:
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.ADD
            return r0
        L7:
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SCREEN
            return r0
        La:
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.MULTIPLY
            return r0
        Ld:
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_ATOP
            return r0
        L10:
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_IN
            return r0
        L13:
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_OVER
            return r0
    }

    private void printGroupTree(androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VGroup r6, int r7) {
            r5 = this;
            java.lang.String r0 = ""
            r1 = 0
        L3:
            if (r1 >= r7) goto L1b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.StringBuilder r2 = r2.append(r0)
            java.lang.String r3 = "    "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r0 = r2.toString()
            int r1 = r1 + 1
            goto L3
        L1b:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r1 = r1.append(r0)
            java.lang.String r2 = "current group is :"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = r6.getGroupName()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " rotation is "
            java.lang.StringBuilder r1 = r1.append(r2)
            float r2 = r6.mRotate
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "VectorDrawableCompat"
            android.util.Log.v(r2, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r1 = r1.append(r0)
            java.lang.String r3 = "matrix is :"
            java.lang.StringBuilder r1 = r1.append(r3)
            android.graphics.Matrix r3 = r6.getLocalMatrix()
            java.lang.String r3 = r3.toString()
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r1 = r1.toString()
            android.util.Log.v(r2, r1)
            r1 = 0
        L6a:
            java.util.ArrayList<androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VObject> r2 = r6.mChildren
            int r2 = r2.size()
            if (r1 >= r2) goto L92
            java.util.ArrayList<androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VObject> r2 = r6.mChildren
            java.lang.Object r2 = r2.get(r1)
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VObject r2 = (androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VObject) r2
            boolean r3 = r2 instanceof androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VGroup
            if (r3 == 0) goto L87
            r3 = r2
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VGroup r3 = (androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VGroup) r3
            int r4 = r7 + 1
            r5.printGroupTree(r3, r4)
            goto L8f
        L87:
            r3 = r2
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VPath r3 = (androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VPath) r3
            int r4 = r7 + 1
            r3.printVPath(r4)
        L8f:
            int r1 = r1 + 1
            goto L6a
        L92:
            return
    }

    private void updateStateFromTypedArray(android.content.res.TypedArray r8, org.xmlpull.v1.XmlPullParser r9, android.content.res.Resources.Theme r10) throws org.xmlpull.v1.XmlPullParserException {
            r7 = this;
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VectorDrawableCompatState r0 = r7.mVectorState
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VPathRenderer r1 = r0.mVPathRenderer
            r2 = 6
            r3 = -1
            java.lang.String r4 = "tintMode"
            int r2 = androidx.core.content.res.TypedArrayUtils.getNamedInt(r8, r9, r4, r2, r3)
            android.graphics.PorterDuff$Mode r3 = android.graphics.PorterDuff.Mode.SRC_IN
            android.graphics.PorterDuff$Mode r3 = parseTintModeCompat(r2, r3)
            r0.mTintMode = r3
            java.lang.String r3 = "tint"
            r4 = 1
            android.content.res.ColorStateList r3 = androidx.core.content.res.TypedArrayUtils.getNamedColorStateList(r8, r9, r10, r3, r4)
            if (r3 == 0) goto L20
            r0.mTint = r3
        L20:
            r4 = 5
            boolean r5 = r0.mAutoMirrored
            java.lang.String r6 = "autoMirrored"
            boolean r4 = androidx.core.content.res.TypedArrayUtils.getNamedBoolean(r8, r9, r6, r4, r5)
            r0.mAutoMirrored = r4
            r4 = 7
            float r5 = r1.mViewportWidth
            java.lang.String r6 = "viewportWidth"
            float r4 = androidx.core.content.res.TypedArrayUtils.getNamedFloat(r8, r9, r6, r4, r5)
            r1.mViewportWidth = r4
            r4 = 8
            float r5 = r1.mViewportHeight
            java.lang.String r6 = "viewportHeight"
            float r4 = androidx.core.content.res.TypedArrayUtils.getNamedFloat(r8, r9, r6, r4, r5)
            r1.mViewportHeight = r4
            float r4 = r1.mViewportWidth
            r5 = 0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto Le2
            float r4 = r1.mViewportHeight
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto Lc5
            r4 = 3
            float r6 = r1.mBaseWidth
            float r4 = r8.getDimension(r4, r6)
            r1.mBaseWidth = r4
            r4 = 2
            float r6 = r1.mBaseHeight
            float r4 = r8.getDimension(r4, r6)
            r1.mBaseHeight = r4
            float r4 = r1.mBaseWidth
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto La8
            float r4 = r1.mBaseHeight
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L8b
        L6e:
            float r4 = r1.getAlpha()
            java.lang.String r5 = "alpha"
            r6 = 4
            float r4 = androidx.core.content.res.TypedArrayUtils.getNamedFloat(r8, r9, r5, r6, r4)
            r1.setAlpha(r4)
            r5 = 0
            java.lang.String r5 = r8.getString(r5)
            if (r5 == 0) goto L8a
            r1.mRootName = r5
            androidx.collection.ArrayMap<java.lang.String, java.lang.Object> r6 = r1.mVGTargetsMap
            r6.put(r5, r1)
        L8a:
            return
        L8b:
            org.xmlpull.v1.XmlPullParserException r4 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = r8.getPositionDescription()
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r6 = "<vector> tag requires height > 0"
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        La8:
            org.xmlpull.v1.XmlPullParserException r4 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = r8.getPositionDescription()
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r6 = "<vector> tag requires width > 0"
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        Lc5:
            org.xmlpull.v1.XmlPullParserException r4 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = r8.getPositionDescription()
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r6 = "<vector> tag requires viewportHeight > 0"
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        Le2:
            org.xmlpull.v1.XmlPullParserException r4 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = r8.getPositionDescription()
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r6 = "<vector> tag requires viewportWidth > 0"
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
    }

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void applyTheme(android.content.res.Resources.Theme r1) {
            r0 = this;
            super.applyTheme(r1)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            if (r0 == 0) goto L9
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            androidx.core.graphics.drawable.DrawableCompat.canApplyTheme(r0)
        L9:
            r0 = 0
            return r0
    }

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void clearColorFilter() {
            r0 = this;
            super.clearColorFilter()
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas r13) {
            r12 = this;
            android.graphics.drawable.Drawable r0 = r12.mDelegateDrawable
            if (r0 == 0) goto La
            android.graphics.drawable.Drawable r0 = r12.mDelegateDrawable
            r0.draw(r13)
            return
        La:
            android.graphics.Rect r0 = r12.mTmpBounds
            r12.copyBounds(r0)
            android.graphics.Rect r0 = r12.mTmpBounds
            int r0 = r0.width()
            if (r0 <= 0) goto Le2
            android.graphics.Rect r0 = r12.mTmpBounds
            int r0 = r0.height()
            if (r0 > 0) goto L21
            goto Le2
        L21:
            android.graphics.ColorFilter r0 = r12.mColorFilter
            if (r0 != 0) goto L28
            android.graphics.PorterDuffColorFilter r0 = r12.mTintFilter
            goto L2a
        L28:
            android.graphics.ColorFilter r0 = r12.mColorFilter
        L2a:
            android.graphics.Matrix r1 = r12.mTmpMatrix
            r13.getMatrix(r1)
            android.graphics.Matrix r1 = r12.mTmpMatrix
            float[] r2 = r12.mTmpFloats
            r1.getValues(r2)
            float[] r1 = r12.mTmpFloats
            r2 = 0
            r1 = r1[r2]
            float r1 = java.lang.Math.abs(r1)
            float[] r3 = r12.mTmpFloats
            r4 = 4
            r3 = r3[r4]
            float r3 = java.lang.Math.abs(r3)
            float[] r4 = r12.mTmpFloats
            r5 = 1
            r4 = r4[r5]
            float r4 = java.lang.Math.abs(r4)
            float[] r5 = r12.mTmpFloats
            r6 = 3
            r5 = r5[r6]
            float r5 = java.lang.Math.abs(r5)
            r6 = 0
            int r7 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r7 != 0) goto L63
            int r7 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r7 == 0) goto L67
        L63:
            r1 = 1065353216(0x3f800000, float:1.0)
            r3 = 1065353216(0x3f800000, float:1.0)
        L67:
            android.graphics.Rect r7 = r12.mTmpBounds
            int r7 = r7.width()
            float r7 = (float) r7
            float r7 = r7 * r1
            int r7 = (int) r7
            android.graphics.Rect r8 = r12.mTmpBounds
            int r8 = r8.height()
            float r8 = (float) r8
            float r8 = r8 * r3
            int r8 = (int) r8
            r9 = 2048(0x800, float:2.87E-42)
            int r7 = java.lang.Math.min(r9, r7)
            int r8 = java.lang.Math.min(r9, r8)
            if (r7 <= 0) goto Le1
            if (r8 > 0) goto L88
            goto Le1
        L88:
            int r9 = r13.save()
            android.graphics.Rect r10 = r12.mTmpBounds
            int r10 = r10.left
            float r10 = (float) r10
            android.graphics.Rect r11 = r12.mTmpBounds
            int r11 = r11.top
            float r11 = (float) r11
            r13.translate(r10, r11)
            boolean r10 = r12.needMirroring()
            if (r10 == 0) goto Lb0
            android.graphics.Rect r11 = r12.mTmpBounds
            int r11 = r11.width()
            float r11 = (float) r11
            r13.translate(r11, r6)
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            r11 = 1065353216(0x3f800000, float:1.0)
            r13.scale(r6, r11)
        Lb0:
            android.graphics.Rect r6 = r12.mTmpBounds
            r6.offsetTo(r2, r2)
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VectorDrawableCompatState r2 = r12.mVectorState
            r2.createCachedBitmapIfNeeded(r7, r8)
            boolean r2 = r12.mAllowCaching
            if (r2 != 0) goto Lc4
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VectorDrawableCompatState r2 = r12.mVectorState
            r2.updateCachedBitmap(r7, r8)
            goto Ld6
        Lc4:
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VectorDrawableCompatState r2 = r12.mVectorState
            boolean r2 = r2.canReuseCache()
            if (r2 != 0) goto Ld6
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VectorDrawableCompatState r2 = r12.mVectorState
            r2.updateCachedBitmap(r7, r8)
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VectorDrawableCompatState r2 = r12.mVectorState
            r2.updateCacheStates()
        Ld6:
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VectorDrawableCompatState r2 = r12.mVectorState
            android.graphics.Rect r6 = r12.mTmpBounds
            r2.drawCachedBitmapWithRootAlpha(r13, r0, r6)
            r13.restoreToCount(r9)
            return
        Le1:
            return
        Le2:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            if (r0 == 0) goto Lb
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            int r0 = androidx.core.graphics.drawable.DrawableCompat.getAlpha(r0)
            return r0
        Lb:
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VectorDrawableCompatState r0 = r1.mVectorState
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VPathRenderer r0 = r0.mVPathRenderer
            int r0 = r0.getRootAlpha()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.mDelegateDrawable
            if (r0 == 0) goto Lb
            android.graphics.drawable.Drawable r0 = r2.mDelegateDrawable
            int r0 = r0.getChangingConfigurations()
            return r0
        Lb:
            int r0 = super.getChangingConfigurations()
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VectorDrawableCompatState r1 = r2.mVectorState
            int r1 = r1.getChangingConfigurations()
            r0 = r0 | r1
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public android.graphics.ColorFilter getColorFilter() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            if (r0 == 0) goto Lb
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            android.graphics.ColorFilter r0 = androidx.core.graphics.drawable.DrawableCompat.getColorFilter(r0)
            return r0
        Lb:
            android.graphics.ColorFilter r0 = r1.mColorFilter
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public android.graphics.drawable.Drawable.ConstantState getConstantState() {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.mDelegateDrawable
            if (r0 == 0) goto L10
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VectorDrawableDelegateState r0 = new androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VectorDrawableDelegateState
            android.graphics.drawable.Drawable r1 = r2.mDelegateDrawable
            android.graphics.drawable.Drawable$ConstantState r1 = r1.getConstantState()
            r0.<init>(r1)
            return r0
        L10:
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VectorDrawableCompatState r0 = r2.mVectorState
            int r1 = r2.getChangingConfigurations()
            r0.mChangingConfigurations = r1
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VectorDrawableCompatState r0 = r2.mVectorState
            return r0
    }

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ android.graphics.drawable.Drawable getCurrent() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = super.getCurrent()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            if (r0 == 0) goto Lb
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            int r0 = r0.getIntrinsicHeight()
            return r0
        Lb:
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VectorDrawableCompatState r0 = r1.mVectorState
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VPathRenderer r0 = r0.mVPathRenderer
            float r0 = r0.mBaseHeight
            int r0 = (int) r0
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            if (r0 == 0) goto Lb
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            int r0 = r0.getIntrinsicWidth()
            return r0
        Lb:
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VectorDrawableCompatState r0 = r1.mVectorState
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VPathRenderer r0 = r0.mVPathRenderer
            float r0 = r0.mBaseWidth
            int r0 = (int) r0
            return r0
    }

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
            r1 = this;
            int r0 = super.getMinimumHeight()
            return r0
    }

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
            r1 = this;
            int r0 = super.getMinimumWidth()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            if (r0 == 0) goto Lb
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            int r0 = r0.getOpacity()
            return r0
        Lb:
            r0 = -3
            return r0
    }

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(android.graphics.Rect r1) {
            r0 = this;
            boolean r1 = super.getPadding(r1)
            return r1
    }

    public float getPixelSize() {
            r7 = this;
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VectorDrawableCompatState r0 = r7.mVectorState
            if (r0 == 0) goto L55
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VectorDrawableCompatState r0 = r7.mVectorState
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VPathRenderer r0 = r0.mVPathRenderer
            if (r0 == 0) goto L55
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VectorDrawableCompatState r0 = r7.mVectorState
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VPathRenderer r0 = r0.mVPathRenderer
            float r0 = r0.mBaseWidth
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L55
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VectorDrawableCompatState r0 = r7.mVectorState
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VPathRenderer r0 = r0.mVPathRenderer
            float r0 = r0.mBaseHeight
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L55
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VectorDrawableCompatState r0 = r7.mVectorState
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VPathRenderer r0 = r0.mVPathRenderer
            float r0 = r0.mViewportHeight
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L55
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VectorDrawableCompatState r0 = r7.mVectorState
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VPathRenderer r0 = r0.mVPathRenderer
            float r0 = r0.mViewportWidth
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L34
            goto L55
        L34:
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VectorDrawableCompatState r0 = r7.mVectorState
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VPathRenderer r0 = r0.mVPathRenderer
            float r0 = r0.mBaseWidth
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VectorDrawableCompatState r1 = r7.mVectorState
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VPathRenderer r1 = r1.mVPathRenderer
            float r1 = r1.mBaseHeight
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VectorDrawableCompatState r2 = r7.mVectorState
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VPathRenderer r2 = r2.mVPathRenderer
            float r2 = r2.mViewportWidth
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VectorDrawableCompatState r3 = r7.mVectorState
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VPathRenderer r3 = r3.mVPathRenderer
            float r3 = r3.mViewportHeight
            float r4 = r2 / r0
            float r5 = r3 / r1
            float r6 = java.lang.Math.min(r4, r5)
            return r6
        L55:
            r0 = 1065353216(0x3f800000, float:1.0)
            return r0
    }

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int[] getState() {
            r1 = this;
            int[] r0 = super.getState()
            return r0
    }

    java.lang.Object getTargetByName(java.lang.String r2) {
            r1 = this;
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VectorDrawableCompatState r0 = r1.mVectorState
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VPathRenderer r0 = r0.mVPathRenderer
            androidx.collection.ArrayMap<java.lang.String, java.lang.Object> r0 = r0.mVGTargetsMap
            java.lang.Object r0 = r0.get(r2)
            return r0
    }

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ android.graphics.Region getTransparentRegion() {
            r1 = this;
            android.graphics.Region r0 = super.getTransparentRegion()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(android.content.res.Resources r2, org.xmlpull.v1.XmlPullParser r3, android.util.AttributeSet r4) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            if (r0 == 0) goto La
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            r0.inflate(r2, r3, r4)
            return
        La:
            r0 = 0
            r1.inflate(r2, r3, r4, r0)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(android.content.res.Resources r7, org.xmlpull.v1.XmlPullParser r8, android.util.AttributeSet r9, android.content.res.Resources.Theme r10) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
            r6 = this;
            android.graphics.drawable.Drawable r0 = r6.mDelegateDrawable
            if (r0 == 0) goto La
            android.graphics.drawable.Drawable r0 = r6.mDelegateDrawable
            androidx.core.graphics.drawable.DrawableCompat.inflate(r0, r7, r8, r9, r10)
            return
        La:
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VectorDrawableCompatState r0 = r6.mVectorState
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VPathRenderer r1 = new androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VPathRenderer
            r1.<init>()
            r0.mVPathRenderer = r1
            int[] r2 = androidx.vectordrawable.graphics.drawable.AndroidResources.STYLEABLE_VECTOR_DRAWABLE_TYPE_ARRAY
            android.content.res.TypedArray r2 = androidx.core.content.res.TypedArrayUtils.obtainAttributes(r7, r10, r9, r2)
            r6.updateStateFromTypedArray(r2, r8, r10)
            r2.recycle()
            int r3 = r6.getChangingConfigurations()
            r0.mChangingConfigurations = r3
            r3 = 1
            r0.mCacheDirty = r3
            r6.inflateInternal(r7, r8, r9, r10)
            android.graphics.PorterDuffColorFilter r3 = r6.mTintFilter
            android.content.res.ColorStateList r4 = r0.mTint
            android.graphics.PorterDuff$Mode r5 = r0.mTintMode
            android.graphics.PorterDuffColorFilter r3 = r6.updateTintFilter(r3, r4, r5)
            r6.mTintFilter = r3
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            if (r0 == 0) goto La
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            r0.invalidateSelf()
            return
        La:
            super.invalidateSelf()
            return
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            if (r0 == 0) goto Lb
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            boolean r0 = androidx.core.graphics.drawable.DrawableCompat.isAutoMirrored(r0)
            return r0
        Lb:
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VectorDrawableCompatState r0 = r1.mVectorState
            boolean r0 = r0.mAutoMirrored
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            if (r0 == 0) goto Lb
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            boolean r0 = r0.isStateful()
            return r0
        Lb:
            boolean r0 = super.isStateful()
            if (r0 != 0) goto L30
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VectorDrawableCompatState r0 = r1.mVectorState
            if (r0 == 0) goto L2e
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VectorDrawableCompatState r0 = r1.mVectorState
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L30
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VectorDrawableCompatState r0 = r1.mVectorState
            android.content.res.ColorStateList r0 = r0.mTint
            if (r0 == 0) goto L2e
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VectorDrawableCompatState r0 = r1.mVectorState
            android.content.res.ColorStateList r0 = r0.mTint
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L2e
            goto L30
        L2e:
            r0 = 0
            goto L31
        L30:
            r0 = 1
        L31:
            return r0
    }

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
            r0 = this;
            super.jumpToCurrentState()
            return
    }

    @Override // android.graphics.drawable.Drawable
    public android.graphics.drawable.Drawable mutate() {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.mDelegateDrawable
            if (r0 == 0) goto La
            android.graphics.drawable.Drawable r0 = r2.mDelegateDrawable
            r0.mutate()
            return r2
        La:
            boolean r0 = r2.mMutated
            if (r0 != 0) goto L20
            android.graphics.drawable.Drawable r0 = super.mutate()
            if (r0 != r2) goto L20
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VectorDrawableCompatState r0 = new androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VectorDrawableCompatState
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VectorDrawableCompatState r1 = r2.mVectorState
            r0.<init>(r1)
            r2.mVectorState = r0
            r0 = 1
            r2.mMutated = r0
        L20:
            return r2
    }

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    protected void onBoundsChange(android.graphics.Rect r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            if (r0 == 0) goto L9
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            r0.setBounds(r2)
        L9:
            return
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] r6) {
            r5 = this;
            android.graphics.drawable.Drawable r0 = r5.mDelegateDrawable
            if (r0 == 0) goto Lb
            android.graphics.drawable.Drawable r0 = r5.mDelegateDrawable
            boolean r0 = r0.setState(r6)
            return r0
        Lb:
            r0 = 0
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VectorDrawableCompatState r1 = r5.mVectorState
            android.content.res.ColorStateList r2 = r1.mTint
            if (r2 == 0) goto L26
            android.graphics.PorterDuff$Mode r2 = r1.mTintMode
            if (r2 == 0) goto L26
            android.graphics.PorterDuffColorFilter r2 = r5.mTintFilter
            android.content.res.ColorStateList r3 = r1.mTint
            android.graphics.PorterDuff$Mode r4 = r1.mTintMode
            android.graphics.PorterDuffColorFilter r2 = r5.updateTintFilter(r2, r3, r4)
            r5.mTintFilter = r2
            r5.invalidateSelf()
            r0 = 1
        L26:
            boolean r2 = r1.isStateful()
            if (r2 == 0) goto L36
            boolean r2 = r1.onStateChanged(r6)
            if (r2 == 0) goto L36
            r5.invalidateSelf()
            r0 = 1
        L36:
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public void scheduleSelf(java.lang.Runnable r2, long r3) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            if (r0 == 0) goto La
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            r0.scheduleSelf(r2, r3)
            return
        La:
            super.scheduleSelf(r2, r3)
            return
    }

    void setAllowCaching(boolean r1) {
            r0 = this;
            r0.mAllowCaching = r1
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            if (r0 == 0) goto La
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            r0.setAlpha(r2)
            return
        La:
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VectorDrawableCompatState r0 = r1.mVectorState
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VPathRenderer r0 = r0.mVPathRenderer
            int r0 = r0.getRootAlpha()
            if (r0 == r2) goto L1e
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VectorDrawableCompatState r0 = r1.mVectorState
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VPathRenderer r0 = r0.mVPathRenderer
            r0.setRootAlpha(r2)
            r1.invalidateSelf()
        L1e:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            if (r0 == 0) goto La
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            androidx.core.graphics.drawable.DrawableCompat.setAutoMirrored(r0, r2)
            return
        La:
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VectorDrawableCompatState r0 = r1.mVectorState
            r0.mAutoMirrored = r2
            return
    }

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setChangingConfigurations(int r1) {
            r0 = this;
            super.setChangingConfigurations(r1)
            return
    }

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(int r1, android.graphics.PorterDuff.Mode r2) {
            r0 = this;
            super.setColorFilter(r1, r2)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            if (r0 == 0) goto La
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            r0.setColorFilter(r2)
            return
        La:
            r1.mColorFilter = r2
            r1.invalidateSelf()
            return
    }

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean r1) {
            r0 = this;
            super.setFilterBitmap(r1)
            return
    }

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float r1, float r2) {
            r0 = this;
            super.setHotspot(r1, r2)
            return
    }

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int r1, int r2, int r3, int r4) {
            r0 = this;
            super.setHotspotBounds(r1, r2, r3, r4)
            return
    }

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setState(int[] r1) {
            r0 = this;
            boolean r1 = super.setState(r1)
            return r1
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTint(int r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            if (r0 == 0) goto La
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            androidx.core.graphics.drawable.DrawableCompat.setTint(r0, r2)
            return
        La:
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r2)
            r1.setTintList(r0)
            return
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTintList(android.content.res.ColorStateList r4) {
            r3 = this;
            android.graphics.drawable.Drawable r0 = r3.mDelegateDrawable
            if (r0 == 0) goto La
            android.graphics.drawable.Drawable r0 = r3.mDelegateDrawable
            androidx.core.graphics.drawable.DrawableCompat.setTintList(r0, r4)
            return
        La:
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VectorDrawableCompatState r0 = r3.mVectorState
            android.content.res.ColorStateList r1 = r0.mTint
            if (r1 == r4) goto L1f
            r0.mTint = r4
            android.graphics.PorterDuffColorFilter r1 = r3.mTintFilter
            android.graphics.PorterDuff$Mode r2 = r0.mTintMode
            android.graphics.PorterDuffColorFilter r1 = r3.updateTintFilter(r1, r4, r2)
            r3.mTintFilter = r1
            r3.invalidateSelf()
        L1f:
            return
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTintMode(android.graphics.PorterDuff.Mode r4) {
            r3 = this;
            android.graphics.drawable.Drawable r0 = r3.mDelegateDrawable
            if (r0 == 0) goto La
            android.graphics.drawable.Drawable r0 = r3.mDelegateDrawable
            androidx.core.graphics.drawable.DrawableCompat.setTintMode(r0, r4)
            return
        La:
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VectorDrawableCompatState r0 = r3.mVectorState
            android.graphics.PorterDuff$Mode r1 = r0.mTintMode
            if (r1 == r4) goto L1f
            r0.mTintMode = r4
            android.graphics.PorterDuffColorFilter r1 = r3.mTintFilter
            android.content.res.ColorStateList r2 = r0.mTint
            android.graphics.PorterDuffColorFilter r1 = r3.updateTintFilter(r1, r2, r4)
            r3.mTintFilter = r1
            r3.invalidateSelf()
        L1f:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean r2, boolean r3) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            if (r0 == 0) goto Lb
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            boolean r0 = r0.setVisible(r2, r3)
            return r0
        Lb:
            boolean r0 = super.setVisible(r2, r3)
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public void unscheduleSelf(java.lang.Runnable r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            if (r0 == 0) goto La
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            r0.unscheduleSelf(r2)
            return
        La:
            super.unscheduleSelf(r2)
            return
    }

    android.graphics.PorterDuffColorFilter updateTintFilter(android.graphics.PorterDuffColorFilter r3, android.content.res.ColorStateList r4, android.graphics.PorterDuff.Mode r5) {
            r2 = this;
            if (r4 == 0) goto L14
            if (r5 != 0) goto L5
            goto L14
        L5:
            int[] r0 = r2.getState()
            r1 = 0
            int r0 = r4.getColorForState(r0, r1)
            android.graphics.PorterDuffColorFilter r1 = new android.graphics.PorterDuffColorFilter
            r1.<init>(r0, r5)
            return r1
        L14:
            r0 = 0
            return r0
    }
}
