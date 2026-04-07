package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
public class LinearLayoutCompat extends android.view.ViewGroup {
    private static final java.lang.String ACCESSIBILITY_CLASS_NAME = "androidx.appcompat.widget.LinearLayoutCompat";
    public static final int HORIZONTAL = 0;
    private static final int INDEX_BOTTOM = 2;
    private static final int INDEX_CENTER_VERTICAL = 0;
    private static final int INDEX_FILL = 3;
    private static final int INDEX_TOP = 1;
    public static final int SHOW_DIVIDER_BEGINNING = 1;
    public static final int SHOW_DIVIDER_END = 4;
    public static final int SHOW_DIVIDER_MIDDLE = 2;
    public static final int SHOW_DIVIDER_NONE = 0;
    public static final int VERTICAL = 1;
    private static final int VERTICAL_GRAVITY_COUNT = 4;
    private boolean mBaselineAligned;
    private int mBaselineAlignedChildIndex;
    private int mBaselineChildTop;
    private android.graphics.drawable.Drawable mDivider;
    private int mDividerHeight;
    private int mDividerPadding;
    private int mDividerWidth;
    private int mGravity;
    private int[] mMaxAscent;
    private int[] mMaxDescent;
    private int mOrientation;
    private int mShowDividers;
    private int mTotalLength;
    private boolean mUseLargestChild;
    private float mWeightSum;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface DividerMode {
    }

    public final class InspectionCompanion implements android.view.inspector.InspectionCompanion<androidx.appcompat.widget.LinearLayoutCompat> {
        private int mBaselineAlignedChildIndexId;
        private int mBaselineAlignedId;
        private int mDividerId;
        private int mDividerPaddingId;
        private int mGravityId;
        private int mMeasureWithLargestChildId;
        private int mOrientationId;
        private boolean mPropertiesMapped;
        private int mShowDividersId;
        private int mWeightSumId;



        public InspectionCompanion() {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.mPropertiesMapped = r0
                return
        }

        @Override // android.view.inspector.InspectionCompanion
        public void mapProperties(android.view.inspector.PropertyMapper r4) {
                r3 = this;
                java.lang.String r0 = "baselineAligned"
                r1 = 16843046(0x1010126, float:2.3694382E-38)
                int r0 = r4.mapBoolean(r0, r1)
                r3.mBaselineAlignedId = r0
                java.lang.String r0 = "baselineAlignedChildIndex"
                r1 = 16843047(0x1010127, float:2.3694385E-38)
                int r0 = r4.mapInt(r0, r1)
                r3.mBaselineAlignedChildIndexId = r0
                java.lang.String r0 = "gravity"
                r1 = 16842927(0x10100af, float:2.3694048E-38)
                int r0 = r4.mapGravity(r0, r1)
                r3.mGravityId = r0
                androidx.appcompat.widget.LinearLayoutCompat$InspectionCompanion$1 r0 = new androidx.appcompat.widget.LinearLayoutCompat$InspectionCompanion$1
                r0.<init>(r3)
                java.lang.String r1 = "orientation"
                r2 = 16842948(0x10100c4, float:2.3694107E-38)
                int r0 = r4.mapIntEnum(r1, r2, r0)
                r3.mOrientationId = r0
                java.lang.String r0 = "weightSum"
                r1 = 16843048(0x1010128, float:2.3694388E-38)
                int r0 = r4.mapFloat(r0, r1)
                r3.mWeightSumId = r0
                java.lang.String r0 = "divider"
                int r1 = androidx.appcompat.R.attr.divider
                int r0 = r4.mapObject(r0, r1)
                r3.mDividerId = r0
                java.lang.String r0 = "dividerPadding"
                int r1 = androidx.appcompat.R.attr.dividerPadding
                int r0 = r4.mapInt(r0, r1)
                r3.mDividerPaddingId = r0
                java.lang.String r0 = "measureWithLargestChild"
                int r1 = androidx.appcompat.R.attr.measureWithLargestChild
                int r0 = r4.mapBoolean(r0, r1)
                r3.mMeasureWithLargestChildId = r0
                int r0 = androidx.appcompat.R.attr.showDividers
                androidx.appcompat.widget.LinearLayoutCompat$InspectionCompanion$2 r1 = new androidx.appcompat.widget.LinearLayoutCompat$InspectionCompanion$2
                r1.<init>(r3)
                java.lang.String r2 = "showDividers"
                int r0 = r4.mapIntFlag(r2, r0, r1)
                r3.mShowDividersId = r0
                r0 = 1
                r3.mPropertiesMapped = r0
                return
        }

        /* JADX INFO: renamed from: readProperties, reason: avoid collision after fix types in other method */
        public void readProperties2(androidx.appcompat.widget.LinearLayoutCompat r3, android.view.inspector.PropertyReader r4) {
                r2 = this;
                boolean r0 = r2.mPropertiesMapped
                if (r0 == 0) goto L56
                int r0 = r2.mBaselineAlignedId
                boolean r1 = r3.isBaselineAligned()
                r4.readBoolean(r0, r1)
                int r0 = r2.mBaselineAlignedChildIndexId
                int r1 = r3.getBaselineAlignedChildIndex()
                r4.readInt(r0, r1)
                int r0 = r2.mGravityId
                int r1 = r3.getGravity()
                r4.readGravity(r0, r1)
                int r0 = r2.mOrientationId
                int r1 = r3.getOrientation()
                r4.readIntEnum(r0, r1)
                int r0 = r2.mWeightSumId
                float r1 = r3.getWeightSum()
                r4.readFloat(r0, r1)
                int r0 = r2.mDividerId
                android.graphics.drawable.Drawable r1 = r3.getDividerDrawable()
                r4.readObject(r0, r1)
                int r0 = r2.mDividerPaddingId
                int r1 = r3.getDividerPadding()
                r4.readInt(r0, r1)
                int r0 = r2.mMeasureWithLargestChildId
                boolean r1 = r3.isMeasureWithLargestChildEnabled()
                r4.readBoolean(r0, r1)
                int r0 = r2.mShowDividersId
                int r1 = r3.getShowDividers()
                r4.readIntFlag(r0, r1)
                return
            L56:
                android.view.inspector.InspectionCompanion$UninitializedPropertyMapException r0 = new android.view.inspector.InspectionCompanion$UninitializedPropertyMapException
                r0.<init>()
                throw r0
        }

        @Override // android.view.inspector.InspectionCompanion
        public /* bridge */ /* synthetic */ void readProperties(androidx.appcompat.widget.LinearLayoutCompat r1, android.view.inspector.PropertyReader r2) {
                r0 = this;
                androidx.appcompat.widget.LinearLayoutCompat r1 = (androidx.appcompat.widget.LinearLayoutCompat) r1
                r0.readProperties2(r1, r2)
                return
        }
    }

    public static class LayoutParams extends android.widget.LinearLayout.LayoutParams {
        public LayoutParams(int r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public LayoutParams(int r1, int r2, float r3) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                return
        }

        public LayoutParams(android.content.Context r1, android.util.AttributeSet r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        public LayoutParams(android.view.ViewGroup.MarginLayoutParams r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface OrientationMode {
    }

    public LinearLayoutCompat(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public LinearLayoutCompat(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public LinearLayoutCompat(android.content.Context r12, android.util.AttributeSet r13, int r14) {
            r11 = this;
            r11.<init>(r12, r13, r14)
            r0 = 1
            r11.mBaselineAligned = r0
            r1 = -1
            r11.mBaselineAlignedChildIndex = r1
            r2 = 0
            r11.mBaselineChildTop = r2
            r3 = 8388659(0x800033, float:1.1755015E-38)
            r11.mGravity = r3
            int[] r3 = androidx.appcompat.R.styleable.LinearLayoutCompat
            androidx.appcompat.widget.TintTypedArray r3 = androidx.appcompat.widget.TintTypedArray.obtainStyledAttributes(r12, r13, r3, r14, r2)
            int[] r6 = androidx.appcompat.R.styleable.LinearLayoutCompat
            android.content.res.TypedArray r8 = r3.getWrappedTypeArray()
            r10 = 0
            r4 = r11
            r5 = r12
            r7 = r13
            r9 = r14
            androidx.core.view.ViewCompat.saveAttributeDataForStyleable(r4, r5, r6, r7, r8, r9, r10)
            int r12 = androidx.appcompat.R.styleable.LinearLayoutCompat_android_orientation
            int r12 = r3.getInt(r12, r1)
            if (r12 < 0) goto L30
            r11.setOrientation(r12)
        L30:
            int r13 = androidx.appcompat.R.styleable.LinearLayoutCompat_android_gravity
            int r12 = r3.getInt(r13, r1)
            if (r12 < 0) goto L3b
            r11.setGravity(r12)
        L3b:
            int r13 = androidx.appcompat.R.styleable.LinearLayoutCompat_android_baselineAligned
            boolean r13 = r3.getBoolean(r13, r0)
            if (r13 != 0) goto L46
            r11.setBaselineAligned(r13)
        L46:
            int r14 = androidx.appcompat.R.styleable.LinearLayoutCompat_android_weightSum
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r14 = r3.getFloat(r14, r0)
            r4.mWeightSum = r14
            int r14 = androidx.appcompat.R.styleable.LinearLayoutCompat_android_baselineAlignedChildIndex
            int r14 = r3.getInt(r14, r1)
            r4.mBaselineAlignedChildIndex = r14
            int r14 = androidx.appcompat.R.styleable.LinearLayoutCompat_measureWithLargestChild
            boolean r14 = r3.getBoolean(r14, r2)
            r4.mUseLargestChild = r14
            int r14 = androidx.appcompat.R.styleable.LinearLayoutCompat_divider
            android.graphics.drawable.Drawable r14 = r3.getDrawable(r14)
            r11.setDividerDrawable(r14)
            int r14 = androidx.appcompat.R.styleable.LinearLayoutCompat_showDividers
            int r14 = r3.getInt(r14, r2)
            r4.mShowDividers = r14
            int r14 = androidx.appcompat.R.styleable.LinearLayoutCompat_dividerPadding
            int r14 = r3.getDimensionPixelSize(r14, r2)
            r4.mDividerPadding = r14
            r3.recycle()
            return
    }

    private void forceUniformHeight(int r10, int r11) {
            r9 = this;
            int r0 = r9.getMeasuredHeight()
            r1 = 1073741824(0x40000000, float:2.0)
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r1)
            r0 = 0
        Lb:
            if (r0 >= r10) goto L3d
            android.view.View r3 = r9.getVirtualChildAt(r0)
            int r1 = r3.getVisibility()
            r2 = 8
            if (r1 == r2) goto L38
            android.view.ViewGroup$LayoutParams r1 = r3.getLayoutParams()
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r1 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) r1
            int r2 = r1.height
            r4 = -1
            if (r2 != r4) goto L36
            int r8 = r1.width
            int r2 = r3.getMeasuredWidth()
            r1.width = r2
            r5 = 0
            r7 = 0
            r2 = r9
            r4 = r11
            r2.measureChildWithMargins(r3, r4, r5, r6, r7)
            r1.width = r8
            goto L39
        L36:
            r4 = r11
            goto L39
        L38:
            r4 = r11
        L39:
            int r0 = r0 + 1
            r11 = r4
            goto Lb
        L3d:
            return
    }

    private void forceUniformWidth(int r10, int r11) {
            r9 = this;
            int r0 = r9.getMeasuredWidth()
            r1 = 1073741824(0x40000000, float:2.0)
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r1)
            r0 = 0
        Lb:
            if (r0 >= r10) goto L3d
            android.view.View r3 = r9.getVirtualChildAt(r0)
            int r1 = r3.getVisibility()
            r2 = 8
            if (r1 == r2) goto L38
            android.view.ViewGroup$LayoutParams r1 = r3.getLayoutParams()
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r1 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) r1
            int r2 = r1.width
            r5 = -1
            if (r2 != r5) goto L36
            int r8 = r1.height
            int r2 = r3.getMeasuredHeight()
            r1.height = r2
            r5 = 0
            r7 = 0
            r2 = r9
            r6 = r11
            r2.measureChildWithMargins(r3, r4, r5, r6, r7)
            r1.height = r8
            goto L39
        L36:
            r6 = r11
            goto L39
        L38:
            r6 = r11
        L39:
            int r0 = r0 + 1
            r11 = r6
            goto Lb
        L3d:
            return
    }

    private void setChildFrame(android.view.View r3, int r4, int r5, int r6, int r7) {
            r2 = this;
            int r0 = r4 + r6
            int r1 = r5 + r7
            r3.layout(r4, r5, r0, r1)
            return
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams r2) {
            r1 = this;
            boolean r0 = r2 instanceof androidx.appcompat.widget.LinearLayoutCompat.LayoutParams
            return r0
    }

    void drawDividersHorizontal(android.graphics.Canvas r8) {
            r7 = this;
            int r0 = r7.getVirtualChildCount()
            boolean r1 = androidx.appcompat.widget.ViewUtils.isLayoutRtl(r7)
            r2 = 0
        L9:
            if (r2 >= r0) goto L3f
            android.view.View r3 = r7.getVirtualChildAt(r2)
            if (r3 == 0) goto L3c
            int r4 = r3.getVisibility()
            r5 = 8
            if (r4 == r5) goto L3c
            boolean r4 = r7.hasDividerBeforeChildAt(r2)
            if (r4 == 0) goto L3c
            android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r4 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) r4
            if (r1 == 0) goto L2f
            int r5 = r3.getRight()
            int r6 = r4.rightMargin
            int r5 = r5 + r6
            goto L39
        L2f:
            int r5 = r3.getLeft()
            int r6 = r4.leftMargin
            int r5 = r5 - r6
            int r6 = r7.mDividerWidth
            int r5 = r5 - r6
        L39:
            r7.drawVerticalDivider(r8, r5)
        L3c:
            int r2 = r2 + 1
            goto L9
        L3f:
            boolean r2 = r7.hasDividerBeforeChildAt(r0)
            if (r2 == 0) goto L80
            int r2 = r0 + (-1)
            android.view.View r2 = r7.getVirtualChildAt(r2)
            if (r2 != 0) goto L61
            if (r1 == 0) goto L54
            int r3 = r7.getPaddingLeft()
            goto L7d
        L54:
            int r3 = r7.getWidth()
            int r4 = r7.getPaddingRight()
            int r3 = r3 - r4
            int r4 = r7.mDividerWidth
            int r3 = r3 - r4
            goto L7d
        L61:
            android.view.ViewGroup$LayoutParams r3 = r2.getLayoutParams()
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r3 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) r3
            if (r1 == 0) goto L75
            int r4 = r2.getLeft()
            int r5 = r3.leftMargin
            int r4 = r4 - r5
            int r5 = r7.mDividerWidth
            int r4 = r4 - r5
            r3 = r4
            goto L7d
        L75:
            int r4 = r2.getRight()
            int r5 = r3.rightMargin
            int r4 = r4 + r5
            r3 = r4
        L7d:
            r7.drawVerticalDivider(r8, r3)
        L80:
            return
    }

    void drawDividersVertical(android.graphics.Canvas r7) {
            r6 = this;
            int r0 = r6.getVirtualChildCount()
            r1 = 0
        L5:
            if (r1 >= r0) goto L31
            android.view.View r2 = r6.getVirtualChildAt(r1)
            if (r2 == 0) goto L2e
            int r3 = r2.getVisibility()
            r4 = 8
            if (r3 == r4) goto L2e
            boolean r3 = r6.hasDividerBeforeChildAt(r1)
            if (r3 == 0) goto L2e
            android.view.ViewGroup$LayoutParams r3 = r2.getLayoutParams()
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r3 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) r3
            int r4 = r2.getTop()
            int r5 = r3.topMargin
            int r4 = r4 - r5
            int r5 = r6.mDividerHeight
            int r4 = r4 - r5
            r6.drawHorizontalDivider(r7, r4)
        L2e:
            int r1 = r1 + 1
            goto L5
        L31:
            boolean r1 = r6.hasDividerBeforeChildAt(r0)
            if (r1 == 0) goto L5f
            int r1 = r0 + (-1)
            android.view.View r1 = r6.getVirtualChildAt(r1)
            r2 = 0
            if (r1 != 0) goto L4d
            int r3 = r6.getHeight()
            int r4 = r6.getPaddingBottom()
            int r3 = r3 - r4
            int r4 = r6.mDividerHeight
            int r3 = r3 - r4
            goto L5c
        L4d:
            android.view.ViewGroup$LayoutParams r3 = r1.getLayoutParams()
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r3 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) r3
            int r4 = r1.getBottom()
            int r5 = r3.bottomMargin
            int r2 = r4 + r5
            r3 = r2
        L5c:
            r6.drawHorizontalDivider(r7, r3)
        L5f:
            return
    }

    void drawHorizontalDivider(android.graphics.Canvas r5, int r6) {
            r4 = this;
            android.graphics.drawable.Drawable r0 = r4.mDivider
            int r1 = r4.getPaddingLeft()
            int r2 = r4.mDividerPadding
            int r1 = r1 + r2
            int r2 = r4.getWidth()
            int r3 = r4.getPaddingRight()
            int r2 = r2 - r3
            int r3 = r4.mDividerPadding
            int r2 = r2 - r3
            int r3 = r4.mDividerHeight
            int r3 = r3 + r6
            r0.setBounds(r1, r6, r2, r3)
            android.graphics.drawable.Drawable r0 = r4.mDivider
            r0.draw(r5)
            return
    }

    void drawVerticalDivider(android.graphics.Canvas r6, int r7) {
            r5 = this;
            android.graphics.drawable.Drawable r0 = r5.mDivider
            int r1 = r5.getPaddingTop()
            int r2 = r5.mDividerPadding
            int r1 = r1 + r2
            int r2 = r5.mDividerWidth
            int r2 = r2 + r7
            int r3 = r5.getHeight()
            int r4 = r5.getPaddingBottom()
            int r3 = r3 - r4
            int r4 = r5.mDividerPadding
            int r3 = r3 - r4
            r0.setBounds(r7, r1, r2, r3)
            android.graphics.drawable.Drawable r0 = r5.mDivider
            r0.draw(r6)
            return
    }

    @Override // android.view.ViewGroup
    protected /* bridge */ /* synthetic */ android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
            r1 = this;
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r0 = r1.generateDefaultLayoutParams()
            return r0
    }

    @Override // android.view.ViewGroup
    protected androidx.appcompat.widget.LinearLayoutCompat.LayoutParams generateDefaultLayoutParams() {
            r3 = this;
            int r0 = r3.mOrientation
            r1 = -2
            if (r0 != 0) goto Lb
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r0 = new androidx.appcompat.widget.LinearLayoutCompat$LayoutParams
            r0.<init>(r1, r1)
            return r0
        Lb:
            int r0 = r3.mOrientation
            r2 = 1
            if (r0 != r2) goto L17
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r0 = new androidx.appcompat.widget.LinearLayoutCompat$LayoutParams
            r2 = -1
            r0.<init>(r2, r1)
            return r0
        L17:
            r0 = 0
            return r0
    }

    @Override // android.view.ViewGroup
    public /* bridge */ /* synthetic */ android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet r1) {
            r0 = this;
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r1 = r0.generateLayoutParams(r1)
            return r1
    }

    @Override // android.view.ViewGroup
    protected /* bridge */ /* synthetic */ android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams r1) {
            r0 = this;
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r1 = r0.generateLayoutParams(r1)
            return r1
    }

    @Override // android.view.ViewGroup
    public androidx.appcompat.widget.LinearLayoutCompat.LayoutParams generateLayoutParams(android.util.AttributeSet r3) {
            r2 = this;
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r0 = new androidx.appcompat.widget.LinearLayoutCompat$LayoutParams
            android.content.Context r1 = r2.getContext()
            r0.<init>(r1, r3)
            return r0
    }

    @Override // android.view.ViewGroup
    protected androidx.appcompat.widget.LinearLayoutCompat.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams r3) {
            r2 = this;
            boolean r0 = r3 instanceof androidx.appcompat.widget.LinearLayoutCompat.LayoutParams
            if (r0 == 0) goto Ld
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r0 = new androidx.appcompat.widget.LinearLayoutCompat$LayoutParams
            r1 = r3
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r1 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) r1
            r0.<init>(r1)
            return r0
        Ld:
            boolean r0 = r3 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L1a
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r0 = new androidx.appcompat.widget.LinearLayoutCompat$LayoutParams
            r1 = r3
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            r0.<init>(r1)
            return r0
        L1a:
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r0 = new androidx.appcompat.widget.LinearLayoutCompat$LayoutParams
            r0.<init>(r3)
            return r0
    }

    @Override // android.view.View
    public int getBaseline() {
            r6 = this;
            int r0 = r6.mBaselineAlignedChildIndex
            if (r0 >= 0) goto L9
            int r0 = super.getBaseline()
            return r0
        L9:
            int r0 = r6.getChildCount()
            int r1 = r6.mBaselineAlignedChildIndex
            if (r0 <= r1) goto L75
            int r0 = r6.mBaselineAlignedChildIndex
            android.view.View r0 = r6.getChildAt(r0)
            int r1 = r0.getBaseline()
            r2 = -1
            if (r1 != r2) goto L2b
            int r3 = r6.mBaselineAlignedChildIndex
            if (r3 != 0) goto L23
            return r2
        L23:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.String r3 = "mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline."
            r2.<init>(r3)
            throw r2
        L2b:
            int r2 = r6.mBaselineChildTop
            int r3 = r6.mOrientation
            r4 = 1
            if (r3 != r4) goto L6a
            int r3 = r6.mGravity
            r3 = r3 & 112(0x70, float:1.57E-43)
            r4 = 48
            if (r3 == r4) goto L6a
            switch(r3) {
                case 16: goto L51;
                case 80: goto L3e;
                default: goto L3d;
            }
        L3d:
            goto L6a
        L3e:
            int r4 = r6.getBottom()
            int r5 = r6.getTop()
            int r4 = r4 - r5
            int r5 = r6.getPaddingBottom()
            int r4 = r4 - r5
            int r5 = r6.mTotalLength
            int r2 = r4 - r5
            goto L6a
        L51:
            int r4 = r6.getBottom()
            int r5 = r6.getTop()
            int r4 = r4 - r5
            int r5 = r6.getPaddingTop()
            int r4 = r4 - r5
            int r5 = r6.getPaddingBottom()
            int r4 = r4 - r5
            int r5 = r6.mTotalLength
            int r4 = r4 - r5
            int r4 = r4 / 2
            int r2 = r2 + r4
        L6a:
            android.view.ViewGroup$LayoutParams r3 = r0.getLayoutParams()
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r3 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) r3
            int r4 = r3.topMargin
            int r4 = r4 + r2
            int r4 = r4 + r1
            return r4
        L75:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds."
            r0.<init>(r1)
            throw r0
    }

    public int getBaselineAlignedChildIndex() {
            r1 = this;
            int r0 = r1.mBaselineAlignedChildIndex
            return r0
    }

    int getChildrenSkipCount(android.view.View r2, int r3) {
            r1 = this;
            r0 = 0
            return r0
    }

    public android.graphics.drawable.Drawable getDividerDrawable() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mDivider
            return r0
    }

    public int getDividerPadding() {
            r1 = this;
            int r0 = r1.mDividerPadding
            return r0
    }

    public int getDividerWidth() {
            r1 = this;
            int r0 = r1.mDividerWidth
            return r0
    }

    public int getGravity() {
            r1 = this;
            int r0 = r1.mGravity
            return r0
    }

    int getLocationOffset(android.view.View r2) {
            r1 = this;
            r0 = 0
            return r0
    }

    int getNextLocationOffset(android.view.View r2) {
            r1 = this;
            r0 = 0
            return r0
    }

    public int getOrientation() {
            r1 = this;
            int r0 = r1.mOrientation
            return r0
    }

    public int getShowDividers() {
            r1 = this;
            int r0 = r1.mShowDividers
            return r0
    }

    android.view.View getVirtualChildAt(int r2) {
            r1 = this;
            android.view.View r0 = r1.getChildAt(r2)
            return r0
    }

    int getVirtualChildCount() {
            r1 = this;
            int r0 = r1.getChildCount()
            return r0
    }

    public float getWeightSum() {
            r1 = this;
            float r0 = r1.mWeightSum
            return r0
    }

    protected boolean hasDividerBeforeChildAt(int r5) {
            r4 = this;
            r0 = 0
            r1 = 1
            if (r5 != 0) goto Lb
            int r2 = r4.mShowDividers
            r2 = r2 & r1
            if (r2 == 0) goto La
            r0 = r1
        La:
            return r0
        Lb:
            int r2 = r4.getChildCount()
            if (r5 != r2) goto L19
            int r2 = r4.mShowDividers
            r2 = r2 & 4
            if (r2 == 0) goto L18
            r0 = r1
        L18:
            return r0
        L19:
            int r1 = r4.mShowDividers
            r1 = r1 & 2
            if (r1 == 0) goto L36
            r0 = 0
            int r1 = r5 + (-1)
        L22:
            if (r1 < 0) goto L35
            android.view.View r2 = r4.getChildAt(r1)
            int r2 = r2.getVisibility()
            r3 = 8
            if (r2 == r3) goto L32
            r0 = 1
            goto L35
        L32:
            int r1 = r1 + (-1)
            goto L22
        L35:
            return r0
        L36:
            return r0
    }

    public boolean isBaselineAligned() {
            r1 = this;
            boolean r0 = r1.mBaselineAligned
            return r0
    }

    public boolean isMeasureWithLargestChildEnabled() {
            r1 = this;
            boolean r0 = r1.mUseLargestChild
            return r0
    }

    void layoutHorizontal(int r31, int r32, int r33, int r34) {
            r30 = this;
            r0 = r30
            boolean r6 = androidx.appcompat.widget.ViewUtils.isLayoutRtl(r0)
            int r7 = r0.getPaddingTop()
            int r8 = r34 - r32
            int r1 = r0.getPaddingBottom()
            int r9 = r8 - r1
            int r1 = r8 - r7
            int r2 = r0.getPaddingBottom()
            int r10 = r1 - r2
            int r11 = r0.getVirtualChildCount()
            int r1 = r0.mGravity
            r2 = 8388615(0x800007, float:1.1754953E-38)
            r12 = r1 & r2
            int r1 = r0.mGravity
            r13 = r1 & 112(0x70, float:1.57E-43)
            boolean r14 = r0.mBaselineAligned
            int[] r15 = r0.mMaxAscent
            int[] r1 = r0.mMaxDescent
            int r2 = r0.getLayoutDirection()
            int r3 = androidx.core.view.GravityCompat.getAbsoluteGravity(r12, r2)
            r16 = 2
            switch(r3) {
                case 1: goto L4d;
                case 5: goto L41;
                default: goto L3c;
            }
        L3c:
            int r3 = r0.getPaddingLeft()
            goto L5a
        L41:
            int r3 = r0.getPaddingLeft()
            int r3 = r3 + r33
            int r3 = r3 - r31
            int r4 = r0.mTotalLength
            int r3 = r3 - r4
            goto L5a
        L4d:
            int r3 = r0.getPaddingLeft()
            int r4 = r33 - r31
            int r5 = r0.mTotalLength
            int r4 = r4 - r5
            int r4 = r4 / 2
            int r3 = r3 + r4
        L5a:
            r4 = 0
            r5 = 1
            if (r6 == 0) goto L66
            int r4 = r11 + (-1)
            r5 = -1
            r17 = r4
            r18 = r5
            goto L6a
        L66:
            r17 = r4
            r18 = r5
        L6a:
            r4 = 0
        L6b:
            if (r4 >= r11) goto L166
            int r5 = r18 * r4
            int r5 = r17 + r5
            r19 = r1
            android.view.View r1 = r0.getVirtualChildAt(r5)
            r20 = 1
            if (r1 != 0) goto L89
            int r21 = r0.measureNullChild(r5)
            int r3 = r3 + r21
            r21 = r2
            r25 = r6
            r23 = r7
            goto L15a
        L89:
            r21 = r2
            int r2 = r1.getVisibility()
            r22 = r3
            r3 = 8
            if (r2 == r3) goto L151
            r2 = r4
            int r4 = r1.getMeasuredWidth()
            int r3 = r1.getMeasuredHeight()
            r23 = -1
            android.view.ViewGroup$LayoutParams r24 = r1.getLayoutParams()
            r25 = r6
            r6 = r24
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r6 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) r6
            r24 = r2
            r2 = -1
            if (r14 == 0) goto Lbd
            r26 = r3
            int r3 = r6.height
            if (r3 == r2) goto Lbf
            int r23 = r1.getBaseline()
            r3 = r23
            goto Lc1
        Lbd:
            r26 = r3
        Lbf:
            r3 = r23
        Lc1:
            int r2 = r6.gravity
            if (r2 >= 0) goto Lc9
            r2 = r13
            r27 = r2
            goto Lcb
        Lc9:
            r27 = r2
        Lcb:
            r2 = r27 & 112(0x70, float:1.57E-43)
            switch(r2) {
                case 16: goto Lff;
                case 48: goto Lee;
                case 80: goto Ld2;
                default: goto Ld0;
            }
        Ld0:
            r2 = r7
            goto L111
        Ld2:
            int r2 = r9 - r26
            r28 = r2
            int r2 = r6.bottomMargin
            int r2 = r28 - r2
            r28 = r2
            r2 = -1
            if (r3 == r2) goto Leb
            int r2 = r1.getMeasuredHeight()
            int r2 = r2 - r3
            r23 = r19[r16]
            int r23 = r23 - r2
            int r2 = r28 - r23
            goto L111
        Leb:
            r2 = r28
            goto L111
        Lee:
            int r2 = r6.topMargin
            int r2 = r2 + r7
            r28 = r2
            r2 = -1
            if (r3 == r2) goto Lfc
            r2 = r15[r20]
            int r2 = r2 - r3
            int r2 = r28 + r2
            goto L111
        Lfc:
            r2 = r28
            goto L111
        Lff:
            int r2 = r10 - r26
            int r2 = r2 / 2
            int r2 = r2 + r7
            r23 = r2
            int r2 = r6.topMargin
            int r2 = r23 + r2
            r23 = r2
            int r2 = r6.bottomMargin
            int r2 = r23 - r2
        L111:
            boolean r23 = r0.hasDividerBeforeChildAt(r5)
            if (r23 == 0) goto L11e
            r23 = r2
            int r2 = r0.mDividerWidth
            int r2 = r22 + r2
            goto L122
        L11e:
            r23 = r2
            r2 = r22
        L122:
            r22 = r2
            int r2 = r6.leftMargin
            int r22 = r22 + r2
            int r2 = r0.getLocationOffset(r1)
            int r2 = r22 + r2
            r29 = r26
            r26 = r3
            r3 = r23
            r23 = r7
            r7 = r5
            r5 = r29
            r0.setChildFrame(r1, r2, r3, r4, r5)
            int r2 = r6.rightMargin
            int r2 = r2 + r4
            int r28 = r0.getNextLocationOffset(r1)
            int r2 = r2 + r28
            int r22 = r22 + r2
            int r2 = r0.getChildrenSkipCount(r1, r7)
            int r2 = r24 + r2
            r4 = r2
            r3 = r22
            goto L15a
        L151:
            r24 = r4
            r25 = r6
            r23 = r7
            r7 = r5
            r3 = r22
        L15a:
            int r4 = r4 + 1
            r1 = r19
            r2 = r21
            r7 = r23
            r6 = r25
            goto L6b
        L166:
            return
    }

    void layoutVertical(int r22, int r23, int r24, int r25) {
            r21 = this;
            r0 = r21
            int r6 = r0.getPaddingLeft()
            int r7 = r24 - r22
            int r1 = r0.getPaddingRight()
            int r8 = r7 - r1
            int r1 = r7 - r6
            int r2 = r0.getPaddingRight()
            int r9 = r1 - r2
            int r10 = r0.getVirtualChildCount()
            int r1 = r0.mGravity
            r11 = r1 & 112(0x70, float:1.57E-43)
            int r1 = r0.mGravity
            r2 = 8388615(0x800007, float:1.1754953E-38)
            r12 = r1 & r2
            switch(r11) {
                case 16: goto L39;
                case 80: goto L2d;
                default: goto L28;
            }
        L28:
            int r1 = r0.getPaddingTop()
            goto L46
        L2d:
            int r1 = r0.getPaddingTop()
            int r1 = r1 + r25
            int r1 = r1 - r23
            int r2 = r0.mTotalLength
            int r1 = r1 - r2
            goto L46
        L39:
            int r1 = r0.getPaddingTop()
            int r2 = r25 - r23
            int r3 = r0.mTotalLength
            int r2 = r2 - r3
            int r2 = r2 / 2
            int r1 = r1 + r2
        L46:
            r2 = 0
            r13 = r2
        L48:
            if (r13 >= r10) goto Lef
            r2 = r1
            android.view.View r1 = r0.getVirtualChildAt(r13)
            if (r1 != 0) goto L59
            int r3 = r0.measureNullChild(r13)
            int r2 = r2 + r3
            r1 = r2
            goto Leb
        L59:
            int r3 = r1.getVisibility()
            r4 = 8
            if (r3 == r4) goto Le7
            int r4 = r1.getMeasuredWidth()
            int r5 = r1.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r3 = r1.getLayoutParams()
            r14 = r3
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r14 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) r14
            int r3 = r14.gravity
            if (r3 >= 0) goto L78
            r3 = r12
            r15 = r3
            goto L79
        L78:
            r15 = r3
        L79:
            int r3 = r0.getLayoutDirection()
            int r16 = androidx.core.view.GravityCompat.getAbsoluteGravity(r15, r3)
            r17 = r16 & 7
            switch(r17) {
                case 1: goto L9a;
                case 5: goto L8f;
                default: goto L86;
            }
        L86:
            r18 = r2
            int r2 = r14.leftMargin
            int r17 = r6 + r2
            r2 = r17
            goto Laf
        L8f:
            int r17 = r8 - r4
            r18 = r2
            int r2 = r14.rightMargin
            int r17 = r17 - r2
            r2 = r17
            goto Laf
        L9a:
            r18 = r2
            int r2 = r9 - r4
            int r2 = r2 / 2
            int r2 = r2 + r6
            r17 = r2
            int r2 = r14.leftMargin
            int r2 = r17 + r2
            r17 = r2
            int r2 = r14.rightMargin
            int r17 = r17 - r2
            r2 = r17
        Laf:
            boolean r17 = r0.hasDividerBeforeChildAt(r13)
            if (r17 == 0) goto Lbe
            r17 = r2
            int r2 = r0.mDividerHeight
            int r2 = r18 + r2
            r18 = r2
            goto Lc0
        Lbe:
            r17 = r2
        Lc0:
            int r2 = r14.topMargin
            int r18 = r18 + r2
            int r2 = r0.getLocationOffset(r1)
            int r2 = r18 + r2
            r20 = r3
            r3 = r2
            r2 = r17
            r17 = r20
            r0.setChildFrame(r1, r2, r3, r4, r5)
            int r3 = r14.bottomMargin
            int r3 = r3 + r5
            int r19 = r0.getNextLocationOffset(r1)
            int r3 = r3 + r19
            int r18 = r18 + r3
            int r3 = r0.getChildrenSkipCount(r1, r13)
            int r13 = r13 + r3
            r1 = r18
            goto Leb
        Le7:
            r18 = r2
            r1 = r18
        Leb:
            int r13 = r13 + 1
            goto L48
        Lef:
            return
    }

    void measureChildBeforeLayout(android.view.View r7, int r8, int r9, int r10, int r11, int r12) {
            r6 = this;
            r0 = r6
            r1 = r7
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
            return
    }

    void measureHorizontal(int r47, int r48) {
            r46 = this;
            r0 = r46
            r7 = 0
            r0.mTotalLength = r7
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 1
            r6 = 0
            int r8 = r0.getVirtualChildCount()
            int r9 = android.view.View.MeasureSpec.getMode(r47)
            int r10 = android.view.View.MeasureSpec.getMode(r48)
            r11 = 0
            r12 = 0
            int[] r13 = r0.mMaxAscent
            if (r13 == 0) goto L21
            int[] r13 = r0.mMaxDescent
            if (r13 != 0) goto L2a
        L21:
            r13 = 4
            int[] r14 = new int[r13]
            r0.mMaxAscent = r14
            int[] r13 = new int[r13]
            r0.mMaxDescent = r13
        L2a:
            int[] r13 = r0.mMaxAscent
            int[] r14 = r0.mMaxDescent
            r16 = 3
            r15 = -1
            r13[r16] = r15
            r17 = 2
            r13[r17] = r15
            r18 = 1
            r13[r18] = r15
            r13[r7] = r15
            r14[r16] = r15
            r14[r17] = r15
            r14[r18] = r15
            r14[r7] = r15
            boolean r15 = r0.mBaselineAligned
            r20 = r6
            boolean r6 = r0.mUseLargestChild
            r21 = r6
            r6 = 1073741824(0x40000000, float:2.0)
            if (r9 != r6) goto L54
            r22 = r18
            goto L56
        L54:
            r22 = r7
        L56:
            r23 = 0
            r24 = 0
            r45 = r11
            r11 = r1
            r1 = r20
            r20 = r5
            r5 = r24
            r24 = r12
            r12 = r2
            r2 = r23
            r23 = r45
        L6a:
            r7 = 8
            r28 = 0
            if (r5 >= r8) goto L271
            r29 = r1
            android.view.View r1 = r0.getVirtualChildAt(r5)
            if (r1 != 0) goto L98
            int r7 = r0.mTotalLength
            int r26 = r0.measureNullChild(r5)
            int r7 = r7 + r26
            r0.mTotalLength = r7
            r6 = r5
            r34 = r8
            r32 = r9
            r33 = r13
            r30 = r15
            r31 = r21
            r1 = r29
            r5 = r48
            r21 = r14
            r14 = r3
            r3 = r47
            goto L25c
        L98:
            int r6 = r1.getVisibility()
            if (r6 != r7) goto Lb9
            int r6 = r0.getChildrenSkipCount(r1, r5)
            int r5 = r5 + r6
            r6 = r5
            r34 = r8
            r32 = r9
            r33 = r13
            r30 = r15
            r31 = r21
            r1 = r29
            r5 = r48
            r21 = r14
            r14 = r3
            r3 = r47
            goto L25c
        Lb9:
            boolean r6 = r0.hasDividerBeforeChildAt(r5)
            if (r6 == 0) goto Lc6
            int r6 = r0.mTotalLength
            int r7 = r0.mDividerWidth
            int r6 = r6 + r7
            r0.mTotalLength = r6
        Lc6:
            android.view.ViewGroup$LayoutParams r6 = r1.getLayoutParams()
            r7 = r6
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r7 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) r7
            float r6 = r7.weight
            float r29 = r29 + r6
            r6 = 1073741824(0x40000000, float:2.0)
            if (r9 != r6) goto L142
            int r6 = r7.width
            if (r6 != 0) goto L142
            float r6 = r7.weight
            int r6 = (r6 > r28 ? 1 : (r6 == r28 ? 0 : -1))
            if (r6 <= 0) goto L142
            if (r22 == 0) goto Lf4
            int r6 = r0.mTotalLength
            r31 = r2
            int r2 = r7.leftMargin
            r26 = r2
            int r2 = r7.rightMargin
            int r2 = r26 + r2
            int r6 = r6 + r2
            r0.mTotalLength = r6
            r32 = r3
            goto L106
        Lf4:
            r31 = r2
            int r2 = r0.mTotalLength
            int r6 = r7.leftMargin
            int r6 = r6 + r2
            r32 = r3
            int r3 = r7.rightMargin
            int r6 = r6 + r3
            int r3 = java.lang.Math.max(r2, r6)
            r0.mTotalLength = r3
        L106:
            if (r15 == 0) goto L128
            r2 = 0
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r2)
            r1.measure(r3, r3)
            r3 = r47
            r2 = r5
            r34 = r8
            r33 = r13
            r30 = r15
            r13 = r31
            r5 = r48
            r15 = r4
            r31 = r21
            r21 = r14
            r14 = r32
            r32 = r9
            goto L1c5
        L128:
            r24 = 1
            r3 = r47
            r2 = r5
            r34 = r8
            r33 = r13
            r30 = r15
            r13 = r31
            r5 = r48
            r15 = r4
            r31 = r21
            r21 = r14
            r14 = r32
            r32 = r9
            goto L1c5
        L142:
            r31 = r2
            r32 = r3
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r3 = r7.width
            if (r3 != 0) goto L156
            float r3 = r7.weight
            int r3 = (r3 > r28 ? 1 : (r3 == r28 ? 0 : -1))
            if (r3 <= 0) goto L156
            r2 = 0
            r3 = -2
            r7.width = r3
        L156:
            int r3 = (r29 > r28 ? 1 : (r29 == r28 ? 0 : -1))
            if (r3 != 0) goto L163
            int r3 = r0.mTotalLength
            r45 = r4
            r4 = r3
            r3 = r45
            goto L165
        L163:
            r3 = r4
            r4 = 0
        L165:
            r6 = 0
            r34 = r8
            r33 = r13
            r30 = r15
            r13 = r31
            r8 = 1073741824(0x40000000, float:2.0)
            r15 = r3
            r31 = r21
            r3 = r47
            r21 = r14
            r14 = r32
            r32 = r9
            r9 = r2
            r2 = r5
            r5 = r48
            r0.measureChildBeforeLayout(r1, r2, r3, r4, r5, r6)
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r9 == r4) goto L188
            r7.width = r9
        L188:
            int r4 = r1.getMeasuredWidth()
            if (r22 == 0) goto L1a2
            int r6 = r0.mTotalLength
            int r8 = r7.leftMargin
            int r8 = r8 + r4
            r26 = r6
            int r6 = r7.rightMargin
            int r8 = r8 + r6
            int r6 = r0.getNextLocationOffset(r1)
            int r8 = r8 + r6
            int r6 = r26 + r8
            r0.mTotalLength = r6
            goto L1be
        L1a2:
            int r6 = r0.mTotalLength
            int r8 = r6 + r4
            r26 = r8
            int r8 = r7.leftMargin
            int r8 = r26 + r8
            r26 = r8
            int r8 = r7.rightMargin
            int r8 = r26 + r8
            int r26 = r0.getNextLocationOffset(r1)
            int r8 = r8 + r26
            int r8 = java.lang.Math.max(r6, r8)
            r0.mTotalLength = r8
        L1be:
            if (r31 == 0) goto L1c5
            int r6 = java.lang.Math.max(r4, r13)
            r13 = r6
        L1c5:
            r4 = 0
            r6 = 1073741824(0x40000000, float:2.0)
            if (r10 == r6) goto L1d2
            int r6 = r7.height
            r8 = -1
            if (r6 != r8) goto L1d2
            r23 = 1
            r4 = 1
        L1d2:
            int r6 = r7.topMargin
            int r8 = r7.bottomMargin
            int r6 = r6 + r8
            int r8 = r1.getMeasuredHeight()
            int r8 = r8 + r6
            int r9 = r1.getMeasuredState()
            int r9 = android.view.View.combineMeasuredStates(r12, r9)
            if (r30 == 0) goto L21c
            int r12 = r1.getBaseline()
            r26 = r4
            r4 = -1
            if (r12 == r4) goto L219
            int r4 = r7.gravity
            if (r4 >= 0) goto L1f6
            int r4 = r0.mGravity
            goto L1f8
        L1f6:
            int r4 = r7.gravity
        L1f8:
            r4 = r4 & 112(0x70, float:1.57E-43)
            int r35 = r4 >> 4
            r27 = -2
            r27 = r35 & (-2)
            int r27 = r27 >> 1
            r35 = r4
            r4 = r33[r27]
            int r4 = java.lang.Math.max(r4, r12)
            r33[r27] = r4
            r4 = r21[r27]
            r36 = r6
            int r6 = r8 - r12
            int r4 = java.lang.Math.max(r4, r6)
            r21[r27] = r4
            goto L220
        L219:
            r36 = r6
            goto L220
        L21c:
            r26 = r4
            r36 = r6
        L220:
            int r4 = java.lang.Math.max(r11, r8)
            if (r20 == 0) goto L22e
            int r6 = r7.height
            r11 = -1
            if (r6 != r11) goto L22e
            r6 = r18
            goto L22f
        L22e:
            r6 = 0
        L22f:
            float r11 = r7.weight
            int r11 = (r11 > r28 ? 1 : (r11 == r28 ? 0 : -1))
            if (r11 <= 0) goto L242
        L236:
            if (r26 == 0) goto L23b
            r11 = r36
            goto L23c
        L23b:
            r11 = r8
        L23c:
            int r11 = java.lang.Math.max(r15, r11)
            r15 = r11
            goto L24e
        L242:
            if (r26 == 0) goto L248
            r11 = r36
            goto L249
        L248:
            r11 = r8
        L249:
            int r11 = java.lang.Math.max(r14, r11)
            r14 = r11
        L24e:
            int r11 = r0.getChildrenSkipCount(r1, r2)
            int r2 = r2 + r11
            r11 = r4
            r20 = r6
            r12 = r9
            r4 = r15
            r1 = r29
            r6 = r2
            r2 = r13
        L25c:
            int r6 = r6 + 1
            r5 = r6
            r3 = r14
            r14 = r21
            r15 = r30
            r21 = r31
            r9 = r32
            r13 = r33
            r8 = r34
            r6 = 1073741824(0x40000000, float:2.0)
            r7 = 0
            goto L6a
        L271:
            r29 = r1
            r34 = r8
            r32 = r9
            r33 = r13
            r30 = r15
            r31 = r21
            r13 = r2
            r15 = r4
            r2 = r5
            r21 = r14
            r5 = r48
            r14 = r3
            r3 = r47
            int r1 = r0.mTotalLength
            if (r1 <= 0) goto L29b
            r1 = r34
            boolean r2 = r0.hasDividerBeforeChildAt(r1)
            if (r2 == 0) goto L29d
            int r2 = r0.mTotalLength
            int r4 = r0.mDividerWidth
            int r2 = r2 + r4
            r0.mTotalLength = r2
            goto L29d
        L29b:
            r1 = r34
        L29d:
            r2 = r33[r18]
            r4 = -1
            if (r2 != r4) goto L2b0
            r25 = 0
            r2 = r33[r25]
            if (r2 != r4) goto L2b0
            r2 = r33[r17]
            if (r2 != r4) goto L2b0
            r2 = r33[r16]
            if (r2 == r4) goto L2e0
        L2b0:
            r2 = r33[r16]
            r25 = 0
            r4 = r33[r25]
            r6 = r33[r18]
            r8 = r33[r17]
            int r6 = java.lang.Math.max(r6, r8)
            int r4 = java.lang.Math.max(r4, r6)
            int r2 = java.lang.Math.max(r2, r4)
            r4 = r21[r16]
            r6 = r21[r25]
            r8 = r21[r18]
            r9 = r21[r17]
            int r8 = java.lang.Math.max(r8, r9)
            int r6 = java.lang.Math.max(r6, r8)
            int r4 = java.lang.Math.max(r4, r6)
            int r6 = r2 + r4
            int r11 = java.lang.Math.max(r11, r6)
        L2e0:
            if (r31 == 0) goto L34b
            r2 = r32
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r2 == r4) goto L2ea
            if (r2 != 0) goto L34d
        L2ea:
            r4 = 0
            r0.mTotalLength = r4
            r4 = 0
        L2ee:
            if (r4 >= r1) goto L348
            android.view.View r6 = r0.getVirtualChildAt(r4)
            if (r6 != 0) goto L302
            int r8 = r0.mTotalLength
            int r9 = r0.measureNullChild(r4)
            int r8 = r8 + r9
            r0.mTotalLength = r8
            r32 = r4
            goto L341
        L302:
            int r8 = r6.getVisibility()
            if (r8 != r7) goto L30e
            int r8 = r0.getChildrenSkipCount(r6, r4)
            int r4 = r4 + r8
            goto L343
        L30e:
            android.view.ViewGroup$LayoutParams r8 = r6.getLayoutParams()
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r8 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) r8
            if (r22 == 0) goto L32a
            int r9 = r0.mTotalLength
            int r7 = r8.leftMargin
            int r7 = r7 + r13
            r32 = r4
            int r4 = r8.rightMargin
            int r7 = r7 + r4
            int r4 = r0.getNextLocationOffset(r6)
            int r7 = r7 + r4
            int r9 = r9 + r7
            r0.mTotalLength = r9
            goto L341
        L32a:
            r32 = r4
            int r4 = r0.mTotalLength
            int r7 = r4 + r13
            int r9 = r8.leftMargin
            int r7 = r7 + r9
            int r9 = r8.rightMargin
            int r7 = r7 + r9
            int r9 = r0.getNextLocationOffset(r6)
            int r7 = r7 + r9
            int r7 = java.lang.Math.max(r4, r7)
            r0.mTotalLength = r7
        L341:
            r4 = r32
        L343:
            int r4 = r4 + 1
            r7 = 8
            goto L2ee
        L348:
            r32 = r4
            goto L34d
        L34b:
            r2 = r32
        L34d:
            int r4 = r0.mTotalLength
            int r6 = r0.getPaddingLeft()
            int r7 = r0.getPaddingRight()
            int r6 = r6 + r7
            int r4 = r4 + r6
            r0.mTotalLength = r4
            int r4 = r0.mTotalLength
            int r6 = r0.getSuggestedMinimumWidth()
            int r4 = java.lang.Math.max(r4, r6)
            r6 = 0
            int r7 = android.view.View.resolveSizeAndState(r4, r3, r6)
            r6 = 16777215(0xffffff, float:2.3509886E-38)
            r4 = r7 & r6
            int r6 = r0.mTotalLength
            int r6 = r4 - r6
            if (r24 != 0) goto L3fc
            if (r6 == 0) goto L385
            int r9 = (r29 > r28 ? 1 : (r29 == r28 ? 0 : -1))
            if (r9 <= 0) goto L385
            r34 = r4
            r35 = r6
            r36 = r7
            r32 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            goto L404
        L385:
            int r9 = java.lang.Math.max(r14, r15)
            if (r31 == 0) goto L3ee
            r14 = 1073741824(0x40000000, float:2.0)
            if (r2 == r14) goto L3ee
            r14 = 0
        L390:
            if (r14 >= r1) goto L3e5
            r32 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            android.view.View r8 = r0.getVirtualChildAt(r14)
            if (r8 == 0) goto L3d6
            r34 = r4
            int r4 = r8.getVisibility()
            r35 = r6
            r6 = 8
            if (r4 != r6) goto L3a9
            r36 = r7
            goto L3dc
        L3a9:
            android.view.ViewGroup$LayoutParams r4 = r8.getLayoutParams()
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r4 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) r4
            float r6 = r4.weight
            int r16 = (r6 > r28 ? 1 : (r6 == r28 ? 0 : -1))
            if (r16 <= 0) goto L3cf
        L3b7:
            r16 = r4
            r17 = r6
            r4 = 1073741824(0x40000000, float:2.0)
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r13, r4)
            r36 = r7
            int r7 = r8.getMeasuredHeight()
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r4)
            r8.measure(r6, r7)
            goto L3dc
        L3cf:
            r16 = r4
            r17 = r6
            r36 = r7
            goto L3dc
        L3d6:
            r34 = r4
            r35 = r6
            r36 = r7
        L3dc:
            int r14 = r14 + 1
            r4 = r34
            r6 = r35
            r7 = r36
            goto L390
        L3e5:
            r34 = r4
            r35 = r6
            r36 = r7
            r32 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            goto L3f6
        L3ee:
            r34 = r4
            r35 = r6
            r36 = r7
            r32 = -16777216(0xffffffffff000000, float:-1.7014118E38)
        L3f6:
            r40 = r2
            r6 = r35
            goto L5e6
        L3fc:
            r34 = r4
            r35 = r6
            r36 = r7
            r32 = -16777216(0xffffffffff000000, float:-1.7014118E38)
        L404:
            float r4 = r0.mWeightSum
            int r4 = (r4 > r28 ? 1 : (r4 == r28 ? 0 : -1))
            if (r4 <= 0) goto L40d
            float r4 = r0.mWeightSum
            goto L40f
        L40d:
            r4 = r29
        L40f:
            r19 = -1
            r33[r16] = r19
            r33[r17] = r19
            r33[r18] = r19
            r6 = 0
            r33[r6] = r19
            r21[r16] = r19
            r21[r17] = r19
            r21[r18] = r19
            r21[r6] = r19
            r7 = -1
            r0.mTotalLength = r6
            r6 = 0
            r8 = r7
            r7 = r35
        L429:
            if (r6 >= r1) goto L589
            android.view.View r9 = r0.getVirtualChildAt(r6)
            if (r9 == 0) goto L579
            int r11 = r9.getVisibility()
            r35 = r4
            r4 = 8
            if (r11 != r4) goto L443
            r40 = r2
            r38 = r6
            r27 = -2
            goto L581
        L443:
            android.view.ViewGroup$LayoutParams r11 = r9.getLayoutParams()
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r11 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) r11
            float r4 = r11.weight
            int r37 = (r4 > r28 ? 1 : (r4 == r28 ? 0 : -1))
            if (r37 <= 0) goto L4c0
            r37 = r4
            float r4 = (float) r7
            float r4 = r4 * r37
            float r4 = r4 / r35
            int r4 = (int) r4
            float r35 = r35 - r37
            int r7 = r7 - r4
            int r38 = r0.getPaddingTop()
            int r39 = r0.getPaddingBottom()
            int r38 = r38 + r39
            r39 = r4
            int r4 = r11.topMargin
            int r38 = r38 + r4
            int r4 = r11.bottomMargin
            int r4 = r38 + r4
            r38 = r6
            int r6 = r11.height
            int r4 = getChildMeasureSpec(r5, r4, r6)
            int r6 = r11.width
            if (r6 != 0) goto L498
            r6 = 1073741824(0x40000000, float:2.0)
            if (r2 == r6) goto L483
            r40 = r2
            goto L49a
        L483:
            if (r39 <= 0) goto L489
            r6 = r39
            goto L48a
        L489:
            r6 = 0
        L48a:
            r40 = r2
            r2 = 1073741824(0x40000000, float:2.0)
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r2)
            r9.measure(r6, r4)
            r41 = r7
            goto L4b0
        L498:
            r40 = r2
        L49a:
            int r2 = r9.getMeasuredWidth()
            int r2 = r2 + r39
            if (r2 >= 0) goto L4a3
            r2 = 0
        L4a3:
            r41 = r7
            r6 = 1073741824(0x40000000, float:2.0)
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r6)
            r9.measure(r7, r4)
        L4b0:
            int r2 = r9.getMeasuredState()
            r2 = r2 & r32
            int r12 = android.view.View.combineMeasuredStates(r12, r2)
            r7 = r41
            r4 = r35
            goto L4c8
        L4c0:
            r40 = r2
            r37 = r4
            r38 = r6
            r4 = r35
        L4c8:
            if (r22 == 0) goto L4e4
            int r2 = r0.mTotalLength
            int r6 = r9.getMeasuredWidth()
            r35 = r2
            int r2 = r11.leftMargin
            int r6 = r6 + r2
            int r2 = r11.rightMargin
            int r6 = r6 + r2
            int r2 = r0.getNextLocationOffset(r9)
            int r6 = r6 + r2
            int r2 = r35 + r6
            r0.mTotalLength = r2
            r35 = r4
            goto L4fe
        L4e4:
            int r2 = r0.mTotalLength
            int r6 = r9.getMeasuredWidth()
            int r6 = r6 + r2
            r35 = r4
            int r4 = r11.leftMargin
            int r6 = r6 + r4
            int r4 = r11.rightMargin
            int r6 = r6 + r4
            int r4 = r0.getNextLocationOffset(r9)
            int r6 = r6 + r4
            int r4 = java.lang.Math.max(r2, r6)
            r0.mTotalLength = r4
        L4fe:
            r6 = 1073741824(0x40000000, float:2.0)
            if (r10 == r6) goto L50a
            int r2 = r11.height
            r4 = -1
            if (r2 != r4) goto L50a
            r2 = r18
            goto L50b
        L50a:
            r2 = 0
        L50b:
            int r4 = r11.topMargin
            int r6 = r11.bottomMargin
            int r4 = r4 + r6
            int r6 = r9.getMeasuredHeight()
            int r6 = r6 + r4
            int r8 = java.lang.Math.max(r8, r6)
            r39 = r2
            if (r2 == 0) goto L520
            r2 = r4
            goto L521
        L520:
            r2 = r6
        L521:
            int r2 = java.lang.Math.max(r14, r2)
            if (r20 == 0) goto L531
            int r14 = r11.height
            r41 = r2
            r2 = -1
            if (r14 != r2) goto L533
            r2 = r18
            goto L534
        L531:
            r41 = r2
        L533:
            r2 = 0
        L534:
            if (r30 == 0) goto L56e
            int r14 = r9.getBaseline()
            r20 = r2
            r2 = -1
            if (r14 == r2) goto L569
            int r2 = r11.gravity
            if (r2 >= 0) goto L546
            int r2 = r0.mGravity
            goto L548
        L546:
            int r2 = r11.gravity
        L548:
            r2 = r2 & 112(0x70, float:1.57E-43)
            int r42 = r2 >> 4
            r27 = -2
            r42 = r42 & (-2)
            int r42 = r42 >> 1
            r43 = r2
            r2 = r33[r42]
            int r2 = java.lang.Math.max(r2, r14)
            r33[r42] = r2
            r2 = r21[r42]
            r44 = r4
            int r4 = r6 - r14
            int r2 = java.lang.Math.max(r2, r4)
            r21[r42] = r2
            goto L574
        L569:
            r44 = r4
            r27 = -2
            goto L574
        L56e:
            r20 = r2
            r44 = r4
            r27 = -2
        L574:
            r14 = r41
            r4 = r35
            goto L583
        L579:
            r40 = r2
            r35 = r4
            r38 = r6
            r27 = -2
        L581:
            r4 = r35
        L583:
            int r6 = r38 + 1
            r2 = r40
            goto L429
        L589:
            r40 = r2
            r35 = r4
            r38 = r6
            int r2 = r0.mTotalLength
            int r4 = r0.getPaddingLeft()
            int r6 = r0.getPaddingRight()
            int r4 = r4 + r6
            int r2 = r2 + r4
            r0.mTotalLength = r2
            r2 = r33[r18]
            r4 = -1
            if (r2 != r4) goto L5b3
            r25 = 0
            r2 = r33[r25]
            if (r2 != r4) goto L5b3
            r2 = r33[r17]
            if (r2 != r4) goto L5b3
            r2 = r33[r16]
            if (r2 == r4) goto L5b1
            goto L5b3
        L5b1:
            r11 = r8
            goto L5e4
        L5b3:
            r2 = r33[r16]
            r25 = 0
            r4 = r33[r25]
            r6 = r33[r18]
            r9 = r33[r17]
            int r6 = java.lang.Math.max(r6, r9)
            int r4 = java.lang.Math.max(r4, r6)
            int r2 = java.lang.Math.max(r2, r4)
            r4 = r21[r16]
            r6 = r21[r25]
            r9 = r21[r18]
            r11 = r21[r17]
            int r9 = java.lang.Math.max(r9, r11)
            int r6 = java.lang.Math.max(r6, r9)
            int r4 = java.lang.Math.max(r4, r6)
            int r6 = r2 + r4
            int r6 = java.lang.Math.max(r8, r6)
            r11 = r6
        L5e4:
            r6 = r7
            r9 = r14
        L5e6:
            if (r20 != 0) goto L5ed
            r14 = 1073741824(0x40000000, float:2.0)
            if (r10 == r14) goto L5ed
            r11 = r9
        L5ed:
            int r2 = r0.getPaddingTop()
            int r4 = r0.getPaddingBottom()
            int r2 = r2 + r4
            int r11 = r11 + r2
            int r2 = r0.getSuggestedMinimumHeight()
            int r2 = java.lang.Math.max(r11, r2)
            r4 = r12 & r32
            r4 = r36 | r4
            int r7 = r12 << 16
            int r7 = android.view.View.resolveSizeAndState(r2, r5, r7)
            r0.setMeasuredDimension(r4, r7)
            if (r23 == 0) goto L611
            r0.forceUniformHeight(r1, r3)
        L611:
            return
    }

    int measureNullChild(int r2) {
            r1 = this;
            r0 = 0
            return r0
    }

    void measureVertical(int r39, int r40) {
            r38 = this;
            r0 = r38
            r7 = 0
            r0.mTotalLength = r7
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 1
            r6 = 0
            int r8 = r0.getVirtualChildCount()
            int r9 = android.view.View.MeasureSpec.getMode(r39)
            int r10 = android.view.View.MeasureSpec.getMode(r40)
            r11 = 0
            r12 = 0
            int r13 = r0.mBaselineAlignedChildIndex
            boolean r14 = r0.mUseLargestChild
            r15 = 0
            r16 = 0
            r17 = r11
            r18 = r12
            r11 = r1
            r12 = r2
            r1 = r15
            r2 = r16
            r15 = r3
            r16 = r5
        L2c:
            r3 = 8
            r20 = 1
            r21 = 0
            r7 = 1073741824(0x40000000, float:2.0)
            if (r2 >= r8) goto L19d
            r23 = r1
            android.view.View r1 = r0.getVirtualChildAt(r2)
            if (r1 != 0) goto L55
            int r3 = r0.mTotalLength
            int r5 = r0.measureNullChild(r2)
            int r3 = r3 + r5
            r0.mTotalLength = r3
            r1 = r39
            r5 = r40
            r19 = r10
            r27 = r14
            r14 = r23
            r23 = r8
            goto L191
        L55:
            int r5 = r1.getVisibility()
            if (r5 != r3) goto L6e
            int r3 = r0.getChildrenSkipCount(r1, r2)
            int r2 = r2 + r3
            r1 = r39
            r5 = r40
            r19 = r10
            r27 = r14
            r14 = r23
            r23 = r8
            goto L191
        L6e:
            boolean r3 = r0.hasDividerBeforeChildAt(r2)
            if (r3 == 0) goto L7b
            int r3 = r0.mTotalLength
            int r5 = r0.mDividerHeight
            int r3 = r3 + r5
            r0.mTotalLength = r3
        L7b:
            android.view.ViewGroup$LayoutParams r3 = r1.getLayoutParams()
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r3 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) r3
            float r5 = r3.weight
            float r25 = r6 + r5
            if (r10 != r7) goto Lb4
            int r5 = r3.height
            if (r5 != 0) goto Lb4
            float r5 = r3.weight
            int r5 = (r5 > r21 ? 1 : (r5 == r21 ? 0 : -1))
            if (r5 <= 0) goto Lb4
            int r5 = r0.mTotalLength
            int r6 = r3.topMargin
            int r6 = r6 + r5
            int r7 = r3.bottomMargin
            int r6 = r6 + r7
            int r6 = java.lang.Math.max(r5, r6)
            r0.mTotalLength = r6
            r18 = 1
            r5 = r40
            r19 = r10
            r27 = r14
            r24 = r15
            r14 = r23
            r10 = r4
            r23 = r8
            r8 = r3
            r3 = r1
            r1 = r39
            goto L113
        Lb4:
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            int r6 = r3.height
            if (r6 != 0) goto Lc6
            float r6 = r3.weight
            int r6 = (r6 > r21 ? 1 : (r6 == r21 ? 0 : -1))
            if (r6 <= 0) goto Lc6
            r5 = 0
            r6 = -2
            r3.height = r6
            r7 = r5
            goto Lc7
        Lc6:
            r7 = r5
        Lc7:
            int r5 = (r25 > r21 ? 1 : (r25 == r21 ? 0 : -1))
            if (r5 != 0) goto Ld0
            int r5 = r0.mTotalLength
            r6 = r5
            goto Ld1
        Ld0:
            r6 = 0
        Ld1:
            r5 = r4
            r4 = 0
            r19 = r10
            r27 = r14
            r24 = r15
            r14 = r23
            r15 = -2147483648(0xffffffff80000000, float:-0.0)
            r10 = r5
            r23 = r8
            r5 = r40
            r8 = r3
            r3 = r39
            r0.measureChildBeforeLayout(r1, r2, r3, r4, r5, r6)
            r37 = r3
            r3 = r1
            r1 = r37
            if (r7 == r15) goto Lf1
            r8.height = r7
        Lf1:
            int r4 = r3.getMeasuredHeight()
            int r6 = r0.mTotalLength
            int r15 = r6 + r4
            r29 = r7
            int r7 = r8.topMargin
            int r15 = r15 + r7
            int r7 = r8.bottomMargin
            int r15 = r15 + r7
            int r7 = r0.getNextLocationOffset(r3)
            int r15 = r15 + r7
            int r7 = java.lang.Math.max(r6, r15)
            r0.mTotalLength = r7
            if (r27 == 0) goto L113
            int r7 = java.lang.Math.max(r4, r14)
            r14 = r7
        L113:
            if (r13 < 0) goto L11d
            int r4 = r2 + 1
            if (r13 != r4) goto L11d
            int r4 = r0.mTotalLength
            r0.mBaselineChildTop = r4
        L11d:
            if (r2 >= r13) goto L12e
            float r4 = r8.weight
            int r4 = (r4 > r21 ? 1 : (r4 == r21 ? 0 : -1))
            if (r4 > 0) goto L126
            goto L12e
        L126:
            java.lang.RuntimeException r4 = new java.lang.RuntimeException
            java.lang.String r6 = "A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex."
            r4.<init>(r6)
            throw r4
        L12e:
            r4 = 0
            r6 = 1073741824(0x40000000, float:2.0)
            if (r9 == r6) goto L13c
            int r6 = r8.width
            r7 = -1
            if (r6 != r7) goto L13d
            r17 = 1
            r4 = 1
            goto L13d
        L13c:
            r7 = -1
        L13d:
            int r6 = r8.leftMargin
            int r15 = r8.rightMargin
            int r6 = r6 + r15
            int r15 = r3.getMeasuredWidth()
            int r15 = r15 + r6
            int r11 = java.lang.Math.max(r11, r15)
            int r7 = r3.getMeasuredState()
            int r7 = android.view.View.combineMeasuredStates(r12, r7)
            if (r16 == 0) goto L160
            int r12 = r8.width
            r26 = r4
            r4 = -1
            if (r12 != r4) goto L162
            r4 = r20
            goto L163
        L160:
            r26 = r4
        L162:
            r4 = 0
        L163:
            float r12 = r8.weight
            int r12 = (r12 > r21 ? 1 : (r12 == r21 ? 0 : -1))
            if (r12 <= 0) goto L178
        L16a:
            if (r26 == 0) goto L16e
            r12 = r6
            goto L16f
        L16e:
            r12 = r15
        L16f:
            int r10 = java.lang.Math.max(r10, r12)
            r28 = r15
            r15 = r24
            goto L186
        L178:
            if (r26 == 0) goto L17d
            r12 = r6
            goto L17e
        L17d:
            r12 = r15
        L17e:
            r28 = r15
            r15 = r24
            int r15 = java.lang.Math.max(r15, r12)
        L186:
            int r12 = r0.getChildrenSkipCount(r3, r2)
            int r2 = r2 + r12
            r16 = r4
            r12 = r7
            r4 = r10
            r6 = r25
        L191:
            int r2 = r2 + 1
            r1 = r14
            r10 = r19
            r8 = r23
            r14 = r27
            r7 = 0
            goto L2c
        L19d:
            r5 = r40
            r23 = r8
            r19 = r10
            r27 = r14
            r14 = r1
            r10 = r4
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r39
            int r2 = r0.mTotalLength
            if (r2 <= 0) goto L1bf
            r2 = r23
            boolean r7 = r0.hasDividerBeforeChildAt(r2)
            if (r7 == 0) goto L1c1
            int r7 = r0.mTotalLength
            int r8 = r0.mDividerHeight
            int r7 = r7 + r8
            r0.mTotalLength = r7
            goto L1c1
        L1bf:
            r2 = r23
        L1c1:
            if (r27 == 0) goto L227
            r7 = r19
            if (r7 == r4) goto L1cd
            if (r7 != 0) goto L1ca
            goto L1cd
        L1ca:
            r23 = r6
            goto L22b
        L1cd:
            r4 = 0
            r0.mTotalLength = r4
            r4 = 0
        L1d1:
            if (r4 >= r2) goto L222
            android.view.View r8 = r0.getVirtualChildAt(r4)
            if (r8 != 0) goto L1e8
            int r3 = r0.mTotalLength
            int r23 = r0.measureNullChild(r4)
            int r3 = r3 + r23
            r0.mTotalLength = r3
            r25 = r4
            r23 = r6
            goto L219
        L1e8:
            int r3 = r8.getVisibility()
            r23 = r6
            r6 = 8
            if (r3 != r6) goto L1f8
            int r3 = r0.getChildrenSkipCount(r8, r4)
            int r4 = r4 + r3
            goto L21b
        L1f8:
            android.view.ViewGroup$LayoutParams r3 = r8.getLayoutParams()
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r3 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) r3
            int r6 = r0.mTotalLength
            int r24 = r6 + r14
            r25 = r4
            int r4 = r3.topMargin
            int r24 = r24 + r4
            int r4 = r3.bottomMargin
            int r24 = r24 + r4
            int r4 = r0.getNextLocationOffset(r8)
            int r4 = r24 + r4
            int r4 = java.lang.Math.max(r6, r4)
            r0.mTotalLength = r4
        L219:
            r4 = r25
        L21b:
            int r4 = r4 + 1
            r6 = r23
            r3 = 8
            goto L1d1
        L222:
            r25 = r4
            r23 = r6
            goto L22b
        L227:
            r23 = r6
            r7 = r19
        L22b:
            int r3 = r0.mTotalLength
            int r4 = r0.getPaddingTop()
            int r6 = r0.getPaddingBottom()
            int r4 = r4 + r6
            int r3 = r3 + r4
            r0.mTotalLength = r3
            int r3 = r0.mTotalLength
            int r4 = r0.getSuggestedMinimumHeight()
            int r3 = java.lang.Math.max(r3, r4)
            r4 = 0
            int r6 = android.view.View.resolveSizeAndState(r3, r5, r4)
            r4 = 16777215(0xffffff, float:2.3509886E-38)
            r3 = r6 & r4
            int r4 = r0.mTotalLength
            int r4 = r3 - r4
            if (r18 != 0) goto L2de
            if (r4 == 0) goto L261
            int r8 = (r23 > r21 ? 1 : (r23 == r21 ? 0 : -1))
            if (r8 <= 0) goto L261
            r24 = r3
            r25 = r4
            r29 = r10
            goto L2e4
        L261:
            int r8 = java.lang.Math.max(r15, r10)
            if (r27 == 0) goto L2cc
            r15 = 1073741824(0x40000000, float:2.0)
            if (r7 == r15) goto L2cc
            r15 = 0
        L26c:
            if (r15 >= r2) goto L2c3
            r24 = r3
            android.view.View r3 = r0.getVirtualChildAt(r15)
            if (r3 == 0) goto L2b2
            r25 = r4
            int r4 = r3.getVisibility()
            r20 = r8
            r8 = 8
            if (r4 != r8) goto L285
            r29 = r10
            goto L2b8
        L285:
            android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r4 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) r4
            float r8 = r4.weight
            int r22 = (r8 > r21 ? 1 : (r8 == r21 ? 0 : -1))
            if (r22 <= 0) goto L2ab
        L293:
            r22 = r4
            int r4 = r3.getMeasuredWidth()
            r28 = r8
            r8 = 1073741824(0x40000000, float:2.0)
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r8)
            r29 = r10
            int r10 = android.view.View.MeasureSpec.makeMeasureSpec(r14, r8)
            r3.measure(r4, r10)
            goto L2b8
        L2ab:
            r22 = r4
            r28 = r8
            r29 = r10
            goto L2b8
        L2b2:
            r25 = r4
            r20 = r8
            r29 = r10
        L2b8:
            int r15 = r15 + 1
            r8 = r20
            r3 = r24
            r4 = r25
            r10 = r29
            goto L26c
        L2c3:
            r24 = r3
            r25 = r4
            r20 = r8
            r29 = r10
            goto L2d4
        L2cc:
            r24 = r3
            r25 = r4
            r20 = r8
            r29 = r10
        L2d4:
            r34 = r7
            r35 = r13
            r8 = r20
            r4 = r25
            goto L40e
        L2de:
            r24 = r3
            r25 = r4
            r29 = r10
        L2e4:
            float r3 = r0.mWeightSum
            int r3 = (r3 > r21 ? 1 : (r3 == r21 ? 0 : -1))
            if (r3 <= 0) goto L2ed
            float r3 = r0.mWeightSum
            goto L2ef
        L2ed:
            r3 = r23
        L2ef:
            r4 = 0
            r0.mTotalLength = r4
            r8 = 0
            r10 = r8
            r8 = r25
        L2f6:
            if (r10 >= r2) goto L3f6
            android.view.View r4 = r0.getVirtualChildAt(r10)
            r25 = r3
            int r3 = r4.getVisibility()
            r30 = r10
            r10 = 8
            if (r3 != r10) goto L310
            r34 = r7
            r35 = r13
            r3 = r25
            goto L3ed
        L310:
            android.view.ViewGroup$LayoutParams r3 = r4.getLayoutParams()
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r3 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) r3
            float r10 = r3.weight
            int r31 = (r10 > r21 ? 1 : (r10 == r21 ? 0 : -1))
            if (r31 <= 0) goto L388
            r31 = r10
            float r10 = (float) r8
            float r10 = r10 * r31
            float r10 = r10 / r25
            int r10 = (int) r10
            float r25 = r25 - r31
            int r8 = r8 - r10
            int r32 = r0.getPaddingLeft()
            int r33 = r0.getPaddingRight()
            int r32 = r32 + r33
            r33 = r8
            int r8 = r3.leftMargin
            int r32 = r32 + r8
            int r8 = r3.rightMargin
            int r8 = r32 + r8
            r32 = r10
            int r10 = r3.width
            int r8 = getChildMeasureSpec(r1, r8, r10)
            int r10 = r3.height
            if (r10 != 0) goto L362
            r10 = 1073741824(0x40000000, float:2.0)
            if (r7 == r10) goto L34f
            r34 = r7
            goto L364
        L34f:
            r34 = r7
            if (r32 <= 0) goto L357
            r7 = r32
            goto L358
        L357:
            r7 = 0
        L358:
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r10)
            r4.measure(r8, r7)
            r35 = r13
            goto L37a
        L362:
            r34 = r7
        L364:
            int r7 = r4.getMeasuredHeight()
            int r7 = r7 + r32
            if (r7 >= 0) goto L36d
            r7 = 0
        L36d:
            r35 = r13
            r10 = 1073741824(0x40000000, float:2.0)
            int r13 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r10)
            r4.measure(r8, r13)
        L37a:
            int r7 = r4.getMeasuredState()
            r7 = r7 & (-256(0xffffffffffffff00, float:NaN))
            int r12 = android.view.View.combineMeasuredStates(r12, r7)
            r8 = r33
            goto L38e
        L388:
            r34 = r7
            r31 = r10
            r35 = r13
        L38e:
            int r7 = r3.leftMargin
            int r10 = r3.rightMargin
            int r7 = r7 + r10
            int r10 = r4.getMeasuredWidth()
            int r10 = r10 + r7
            int r11 = java.lang.Math.max(r11, r10)
            r13 = 1073741824(0x40000000, float:2.0)
            if (r9 == r13) goto L3aa
            int r13 = r3.width
            r32 = r7
            r7 = -1
            if (r13 != r7) goto L3ac
            r7 = r20
            goto L3ad
        L3aa:
            r32 = r7
        L3ac:
            r7 = 0
        L3ad:
            if (r7 == 0) goto L3b3
            r13 = r32
            goto L3b4
        L3b3:
            r13 = r10
        L3b4:
            int r13 = java.lang.Math.max(r15, r13)
            if (r16 == 0) goto L3c4
            int r15 = r3.width
            r33 = r7
            r7 = -1
            if (r15 != r7) goto L3c7
            r15 = r20
            goto L3c8
        L3c4:
            r33 = r7
            r7 = -1
        L3c7:
            r15 = 0
        L3c8:
            int r7 = r0.mTotalLength
            int r16 = r4.getMeasuredHeight()
            int r16 = r7 + r16
            r36 = r8
            int r8 = r3.topMargin
            int r16 = r16 + r8
            int r8 = r3.bottomMargin
            int r16 = r16 + r8
            int r8 = r0.getNextLocationOffset(r4)
            int r8 = r16 + r8
            int r8 = java.lang.Math.max(r7, r8)
            r0.mTotalLength = r8
            r16 = r15
            r8 = r36
            r15 = r13
            r3 = r25
        L3ed:
            int r10 = r30 + 1
            r7 = r34
            r13 = r35
            r4 = 0
            goto L2f6
        L3f6:
            r25 = r3
            r34 = r7
            r30 = r10
            r35 = r13
            int r3 = r0.mTotalLength
            int r4 = r0.getPaddingTop()
            int r7 = r0.getPaddingBottom()
            int r4 = r4 + r7
            int r3 = r3 + r4
            r0.mTotalLength = r3
            r4 = r8
            r8 = r15
        L40e:
            if (r16 != 0) goto L415
            r10 = 1073741824(0x40000000, float:2.0)
            if (r9 == r10) goto L415
            r11 = r8
        L415:
            int r3 = r0.getPaddingLeft()
            int r7 = r0.getPaddingRight()
            int r3 = r3 + r7
            int r11 = r11 + r3
            int r3 = r0.getSuggestedMinimumWidth()
            int r3 = java.lang.Math.max(r11, r3)
            int r7 = android.view.View.resolveSizeAndState(r3, r1, r12)
            r0.setMeasuredDimension(r7, r6)
            if (r17 == 0) goto L433
            r0.forceUniformWidth(r2, r5)
        L433:
            return
    }

    @Override // android.view.View
    protected void onDraw(android.graphics.Canvas r3) {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.mDivider
            if (r0 != 0) goto L5
            return
        L5:
            int r0 = r2.mOrientation
            r1 = 1
            if (r0 != r1) goto Le
            r2.drawDividersVertical(r3)
            goto L11
        Le:
            r2.drawDividersHorizontal(r3)
        L11:
            return
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(android.view.accessibility.AccessibilityEvent r2) {
            r1 = this;
            super.onInitializeAccessibilityEvent(r2)
            java.lang.String r0 = "androidx.appcompat.widget.LinearLayoutCompat"
            r2.setClassName(r0)
            return
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo r2) {
            r1 = this;
            super.onInitializeAccessibilityNodeInfo(r2)
            java.lang.String r0 = "androidx.appcompat.widget.LinearLayoutCompat"
            r2.setClassName(r0)
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean r3, int r4, int r5, int r6, int r7) {
            r2 = this;
            int r0 = r2.mOrientation
            r1 = 1
            if (r0 != r1) goto L9
            r2.layoutVertical(r4, r5, r6, r7)
            goto Lc
        L9:
            r2.layoutHorizontal(r4, r5, r6, r7)
        Lc:
            return
    }

    @Override // android.view.View
    protected void onMeasure(int r3, int r4) {
            r2 = this;
            int r0 = r2.mOrientation
            r1 = 1
            if (r0 != r1) goto L9
            r2.measureVertical(r3, r4)
            goto Lc
        L9:
            r2.measureHorizontal(r3, r4)
        Lc:
            return
    }

    public void setBaselineAligned(boolean r1) {
            r0 = this;
            r0.mBaselineAligned = r1
            return
    }

    public void setBaselineAlignedChildIndex(int r4) {
            r3 = this;
            if (r4 < 0) goto Lb
            int r0 = r3.getChildCount()
            if (r4 >= r0) goto Lb
            r3.mBaselineAlignedChildIndex = r4
            return
        Lb:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "base aligned child index out of range (0, "
            java.lang.StringBuilder r1 = r1.append(r2)
            int r2 = r3.getChildCount()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = ")"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public void setDividerDrawable(android.graphics.drawable.Drawable r3) {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.mDivider
            if (r3 != r0) goto L5
            return
        L5:
            r2.mDivider = r3
            r0 = 0
            if (r3 == 0) goto L17
            int r1 = r3.getIntrinsicWidth()
            r2.mDividerWidth = r1
            int r1 = r3.getIntrinsicHeight()
            r2.mDividerHeight = r1
            goto L1b
        L17:
            r2.mDividerWidth = r0
            r2.mDividerHeight = r0
        L1b:
            if (r3 != 0) goto L1e
            r0 = 1
        L1e:
            r2.setWillNotDraw(r0)
            r2.requestLayout()
            return
    }

    public void setDividerPadding(int r1) {
            r0 = this;
            r0.mDividerPadding = r1
            return
    }

    public void setGravity(int r2) {
            r1 = this;
            int r0 = r1.mGravity
            if (r0 == r2) goto L19
            r0 = 8388615(0x800007, float:1.1754953E-38)
            r0 = r0 & r2
            if (r0 != 0) goto Le
            r0 = 8388611(0x800003, float:1.1754948E-38)
            r2 = r2 | r0
        Le:
            r0 = r2 & 112(0x70, float:1.57E-43)
            if (r0 != 0) goto L14
            r2 = r2 | 48
        L14:
            r1.mGravity = r2
            r1.requestLayout()
        L19:
            return
    }

    public void setHorizontalGravity(int r4) {
            r3 = this;
            r0 = 8388615(0x800007, float:1.1754953E-38)
            r1 = r4 & r0
            int r2 = r3.mGravity
            r0 = r0 & r2
            if (r0 == r1) goto L16
            int r0 = r3.mGravity
            r2 = -8388616(0xffffffffff7ffff8, float:-3.402822E38)
            r0 = r0 & r2
            r0 = r0 | r1
            r3.mGravity = r0
            r3.requestLayout()
        L16:
            return
    }

    public void setMeasureWithLargestChildEnabled(boolean r1) {
            r0 = this;
            r0.mUseLargestChild = r1
            return
    }

    public void setOrientation(int r2) {
            r1 = this;
            int r0 = r1.mOrientation
            if (r0 == r2) goto L9
            r1.mOrientation = r2
            r1.requestLayout()
        L9:
            return
    }

    public void setShowDividers(int r2) {
            r1 = this;
            int r0 = r1.mShowDividers
            if (r2 == r0) goto L7
            r1.requestLayout()
        L7:
            r1.mShowDividers = r2
            return
    }

    public void setVerticalGravity(int r3) {
            r2 = this;
            r0 = r3 & 112(0x70, float:1.57E-43)
            int r1 = r2.mGravity
            r1 = r1 & 112(0x70, float:1.57E-43)
            if (r1 == r0) goto L12
            int r1 = r2.mGravity
            r1 = r1 & (-113(0xffffffffffffff8f, float:NaN))
            r1 = r1 | r0
            r2.mGravity = r1
            r2.requestLayout()
        L12:
            return
    }

    public void setWeightSum(float r2) {
            r1 = this;
            r0 = 0
            float r0 = java.lang.Math.max(r0, r2)
            r1.mWeightSum = r0
            return
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
            r1 = this;
            r0 = 0
            return r0
    }
}
