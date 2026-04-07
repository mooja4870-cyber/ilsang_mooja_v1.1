package androidx.appcompat.graphics.drawable;

/* JADX INFO: loaded from: classes.dex */
public class StateListDrawableCompat extends androidx.appcompat.graphics.drawable.DrawableContainerCompat {
    private static final boolean DEBUG = false;
    private static final java.lang.String TAG = "StateListDrawableCompat";
    private boolean mMutated;
    private androidx.appcompat.graphics.drawable.StateListDrawableCompat.StateListState mStateListState;

    static class StateListState extends androidx.appcompat.graphics.drawable.DrawableContainerCompat.DrawableContainerState {
        int[][] mStateSets;

        StateListState(androidx.appcompat.graphics.drawable.StateListDrawableCompat.StateListState r2, androidx.appcompat.graphics.drawable.StateListDrawableCompat r3, android.content.res.Resources r4) {
                r1 = this;
                r1.<init>(r2, r3, r4)
                if (r2 == 0) goto La
                int[][] r0 = r2.mStateSets
                r1.mStateSets = r0
                goto L12
            La:
                int r0 = r1.getCapacity()
                int[][] r0 = new int[r0][]
                r1.mStateSets = r0
            L12:
                return
        }

        int addStateSet(int[] r3, android.graphics.drawable.Drawable r4) {
                r2 = this;
                int r0 = r2.addChild(r4)
                int[][] r1 = r2.mStateSets
                r1[r0] = r3
                return r0
        }

        @Override // androidx.appcompat.graphics.drawable.DrawableContainerCompat.DrawableContainerState
        public void growArray(int r4, int r5) {
                r3 = this;
                super.growArray(r4, r5)
                int[][] r0 = new int[r5][]
                int[][] r1 = r3.mStateSets
                r2 = 0
                java.lang.System.arraycopy(r1, r2, r0, r2, r4)
                r3.mStateSets = r0
                return
        }

        int indexOfStateSet(int[] r5) {
                r4 = this;
                int[][] r0 = r4.mStateSets
                int r1 = r4.getChildCount()
                r2 = 0
            L7:
                if (r2 >= r1) goto L15
                r3 = r0[r2]
                boolean r3 = android.util.StateSet.stateSetMatches(r3, r5)
                if (r3 == 0) goto L12
                return r2
            L12:
                int r2 = r2 + 1
                goto L7
            L15:
                r2 = -1
                return r2
        }

        @Override // androidx.appcompat.graphics.drawable.DrawableContainerCompat.DrawableContainerState
        void mutate() {
                r3 = this;
                int[][] r0 = r3.mStateSets
                int r0 = r0.length
                int[][] r0 = new int[r0][]
                int[][] r1 = r3.mStateSets
                int r1 = r1.length
                int r1 = r1 + (-1)
            La:
                if (r1 < 0) goto L23
                int[][] r2 = r3.mStateSets
                r2 = r2[r1]
                if (r2 == 0) goto L1d
                int[][] r2 = r3.mStateSets
                r2 = r2[r1]
                java.lang.Object r2 = r2.clone()
                int[] r2 = (int[]) r2
                goto L1e
            L1d:
                r2 = 0
            L1e:
                r0[r1] = r2
                int r1 = r1 + (-1)
                goto La
            L23:
                r3.mStateSets = r0
                return
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public android.graphics.drawable.Drawable newDrawable() {
                r2 = this;
                androidx.appcompat.graphics.drawable.StateListDrawableCompat r0 = new androidx.appcompat.graphics.drawable.StateListDrawableCompat
                r1 = 0
                r0.<init>(r2, r1)
                return r0
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public android.graphics.drawable.Drawable newDrawable(android.content.res.Resources r2) {
                r1 = this;
                androidx.appcompat.graphics.drawable.StateListDrawableCompat r0 = new androidx.appcompat.graphics.drawable.StateListDrawableCompat
                r0.<init>(r1, r2)
                return r0
        }
    }

    public StateListDrawableCompat() {
            r1 = this;
            r0 = 0
            r1.<init>(r0, r0)
            return
    }

    StateListDrawableCompat(androidx.appcompat.graphics.drawable.StateListDrawableCompat.StateListState r1) {
            r0 = this;
            r0.<init>()
            if (r1 == 0) goto L8
            r0.setConstantState(r1)
        L8:
            return
    }

    StateListDrawableCompat(androidx.appcompat.graphics.drawable.StateListDrawableCompat.StateListState r3, android.content.res.Resources r4) {
            r2 = this;
            r2.<init>()
            androidx.appcompat.graphics.drawable.StateListDrawableCompat$StateListState r0 = new androidx.appcompat.graphics.drawable.StateListDrawableCompat$StateListState
            r0.<init>(r3, r2, r4)
            r2.setConstantState(r0)
            int[] r1 = r2.getState()
            r2.onStateChange(r1)
            return
    }

    private void inflateChildElements(android.content.Context r17, android.content.res.Resources r18, org.xmlpull.v1.XmlPullParser r19, android.util.AttributeSet r20, android.content.res.Resources.Theme r21) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
            r16 = this;
            r0 = r16
            r1 = r20
            androidx.appcompat.graphics.drawable.StateListDrawableCompat$StateListState r2 = r0.mStateListState
            int r3 = r19.getDepth()
            r4 = 1
            int r3 = r3 + r4
        Lc:
            int r5 = r19.next()
            r6 = r5
            if (r5 == r4) goto La1
            int r5 = r19.getDepth()
            r7 = r5
            if (r5 >= r3) goto L26
            r5 = 3
            if (r6 == r5) goto L1e
            goto L26
        L1e:
            r14 = r17
            r9 = r18
            r10 = r21
            goto La7
        L26:
            r5 = 2
            if (r6 == r5) goto L2a
            goto Lc
        L2a:
            if (r7 > r3) goto L98
            java.lang.String r8 = r19.getName()
            java.lang.String r9 = "item"
            boolean r8 = r8.equals(r9)
            if (r8 != 0) goto L39
            goto Lc
        L39:
            int[] r8 = androidx.appcompat.resources.R.styleable.StateListDrawableItem
            r9 = r18
            r10 = r21
            android.content.res.TypedArray r8 = androidx.core.content.res.TypedArrayUtils.obtainAttributes(r9, r10, r1, r8)
            r11 = 0
            int r12 = androidx.appcompat.resources.R.styleable.StateListDrawableItem_android_drawable
            r13 = -1
            int r12 = r8.getResourceId(r12, r13)
            if (r12 <= 0) goto L58
            androidx.appcompat.widget.ResourceManagerInternal r13 = androidx.appcompat.widget.ResourceManagerInternal.get()
            r14 = r17
            android.graphics.drawable.Drawable r11 = r13.getDrawable(r14, r12)
            goto L5a
        L58:
            r14 = r17
        L5a:
            r8.recycle()
            int[] r13 = r0.extractStateSet(r1)
            if (r11 != 0) goto L92
        L63:
            int r15 = r19.next()
            r6 = r15
            r4 = 4
            if (r15 != r4) goto L6d
            r4 = 1
            goto L63
        L6d:
            if (r6 != r5) goto L75
        L70:
            android.graphics.drawable.Drawable r11 = androidx.appcompat.resources.Compatibility.Api21Impl.createFromXmlInner(r18, r19, r20, r21)
            goto L92
        L75:
            org.xmlpull.v1.XmlPullParserException r4 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r15 = r19.getPositionDescription()
            java.lang.StringBuilder r5 = r5.append(r15)
            java.lang.String r15 = ": <item> tag requires a 'drawable' attribute or child tag defining a drawable"
            java.lang.StringBuilder r5 = r5.append(r15)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L92:
            r2.addStateSet(r13, r11)
            r4 = 1
            goto Lc
        L98:
            r14 = r17
            r9 = r18
            r10 = r21
            r4 = 1
            goto Lc
        La1:
            r14 = r17
            r9 = r18
            r10 = r21
        La7:
            return
    }

    private void updateStateFromTypedArray(android.content.res.TypedArray r4) {
            r3 = this;
            androidx.appcompat.graphics.drawable.StateListDrawableCompat$StateListState r0 = r3.mStateListState
            int r1 = r0.mChangingConfigurations
            int r2 = androidx.appcompat.resources.Compatibility.Api21Impl.getChangingConfigurations(r4)
            r1 = r1 | r2
            r0.mChangingConfigurations = r1
            int r1 = androidx.appcompat.resources.R.styleable.StateListDrawable_android_variablePadding
            boolean r2 = r0.mVariablePadding
            boolean r1 = r4.getBoolean(r1, r2)
            r0.mVariablePadding = r1
            int r1 = androidx.appcompat.resources.R.styleable.StateListDrawable_android_constantSize
            boolean r2 = r0.mConstantSize
            boolean r1 = r4.getBoolean(r1, r2)
            r0.mConstantSize = r1
            int r1 = androidx.appcompat.resources.R.styleable.StateListDrawable_android_enterFadeDuration
            int r2 = r0.mEnterFadeDuration
            int r1 = r4.getInt(r1, r2)
            r0.mEnterFadeDuration = r1
            int r1 = androidx.appcompat.resources.R.styleable.StateListDrawable_android_exitFadeDuration
            int r2 = r0.mExitFadeDuration
            int r1 = r4.getInt(r1, r2)
            r0.mExitFadeDuration = r1
            int r1 = androidx.appcompat.resources.R.styleable.StateListDrawable_android_dither
            boolean r2 = r0.mDither
            boolean r1 = r4.getBoolean(r1, r2)
            r0.mDither = r1
            return
    }

    public void addState(int[] r2, android.graphics.drawable.Drawable r3) {
            r1 = this;
            if (r3 == 0) goto Le
            androidx.appcompat.graphics.drawable.StateListDrawableCompat$StateListState r0 = r1.mStateListState
            r0.addStateSet(r2, r3)
            int[] r0 = r1.getState()
            r1.onStateChange(r0)
        Le:
            return
    }

    @Override // androidx.appcompat.graphics.drawable.DrawableContainerCompat, android.graphics.drawable.Drawable
    public void applyTheme(android.content.res.Resources.Theme r2) {
            r1 = this;
            super.applyTheme(r2)
            int[] r0 = r1.getState()
            r1.onStateChange(r0)
            return
    }

    @Override // androidx.appcompat.graphics.drawable.DrawableContainerCompat
    void clearMutated() {
            r1 = this;
            super.clearMutated()
            r0 = 0
            r1.mMutated = r0
            return
    }

    @Override // androidx.appcompat.graphics.drawable.DrawableContainerCompat
    /* bridge */ /* synthetic */ androidx.appcompat.graphics.drawable.DrawableContainerCompat.DrawableContainerState cloneConstantState() {
            r1 = this;
            androidx.appcompat.graphics.drawable.StateListDrawableCompat$StateListState r0 = r1.cloneConstantState()
            return r0
    }

    @Override // androidx.appcompat.graphics.drawable.DrawableContainerCompat
    androidx.appcompat.graphics.drawable.StateListDrawableCompat.StateListState cloneConstantState() {
            r3 = this;
            androidx.appcompat.graphics.drawable.StateListDrawableCompat$StateListState r0 = new androidx.appcompat.graphics.drawable.StateListDrawableCompat$StateListState
            androidx.appcompat.graphics.drawable.StateListDrawableCompat$StateListState r1 = r3.mStateListState
            r2 = 0
            r0.<init>(r1, r3, r2)
            return r0
    }

    int[] extractStateSet(android.util.AttributeSet r8) {
            r7 = this;
            r0 = 0
            int r1 = r8.getAttributeCount()
            int[] r2 = new int[r1]
            r3 = 0
        L8:
            if (r3 >= r1) goto L25
            int r4 = r8.getAttributeNameResource(r3)
            switch(r4) {
                case 0: goto L1d;
                case 16842960: goto L1c;
                case 16843161: goto L1c;
                default: goto L11;
            }
        L11:
            int r5 = r0 + 1
            r6 = 0
            boolean r6 = r8.getAttributeBooleanValue(r3, r6)
            if (r6 == 0) goto L1e
            r6 = r4
            goto L1f
        L1c:
            goto L22
        L1d:
            goto L22
        L1e:
            int r6 = -r4
        L1f:
            r2[r0] = r6
            r0 = r5
        L22:
            int r3 = r3 + 1
            goto L8
        L25:
            int[] r2 = android.util.StateSet.trimStateSet(r2, r0)
            return r2
    }

    int getStateCount() {
            r1 = this;
            androidx.appcompat.graphics.drawable.StateListDrawableCompat$StateListState r0 = r1.mStateListState
            int r0 = r0.getChildCount()
            return r0
    }

    android.graphics.drawable.Drawable getStateDrawable(int r2) {
            r1 = this;
            androidx.appcompat.graphics.drawable.StateListDrawableCompat$StateListState r0 = r1.mStateListState
            android.graphics.drawable.Drawable r0 = r0.getChild(r2)
            return r0
    }

    int getStateDrawableIndex(int[] r2) {
            r1 = this;
            androidx.appcompat.graphics.drawable.StateListDrawableCompat$StateListState r0 = r1.mStateListState
            int r0 = r0.indexOfStateSet(r2)
            return r0
    }

    androidx.appcompat.graphics.drawable.StateListDrawableCompat.StateListState getStateListState() {
            r1 = this;
            androidx.appcompat.graphics.drawable.StateListDrawableCompat$StateListState r0 = r1.mStateListState
            return r0
    }

    int[] getStateSet(int r2) {
            r1 = this;
            androidx.appcompat.graphics.drawable.StateListDrawableCompat$StateListState r0 = r1.mStateListState
            int[][] r0 = r0.mStateSets
            r0 = r0[r2]
            return r0
    }

    public void inflate(android.content.Context r4, android.content.res.Resources r5, org.xmlpull.v1.XmlPullParser r6, android.util.AttributeSet r7, android.content.res.Resources.Theme r8) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
            r3 = this;
            int[] r0 = androidx.appcompat.resources.R.styleable.StateListDrawable
            android.content.res.TypedArray r0 = androidx.core.content.res.TypedArrayUtils.obtainAttributes(r5, r8, r7, r0)
            int r1 = androidx.appcompat.resources.R.styleable.StateListDrawable_android_visible
            r2 = 1
            boolean r1 = r0.getBoolean(r1, r2)
            r3.setVisible(r1, r2)
            r3.updateStateFromTypedArray(r0)
            r3.updateDensity(r5)
            r0.recycle()
            r3.inflateChildElements(r4, r5, r6, r7, r8)
            r1 = r8
            r8 = r7
            r7 = r6
            r6 = r5
            r5 = r4
            r4 = r3
            int[] r2 = r3.getState()
            r3.onStateChange(r2)
            return
    }

    @Override // androidx.appcompat.graphics.drawable.DrawableContainerCompat, android.graphics.drawable.Drawable
    public boolean isStateful() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // androidx.appcompat.graphics.drawable.DrawableContainerCompat, android.graphics.drawable.Drawable
    public android.graphics.drawable.Drawable mutate() {
            r1 = this;
            boolean r0 = r1.mMutated
            if (r0 != 0) goto L12
            android.graphics.drawable.Drawable r0 = super.mutate()
            if (r0 != r1) goto L12
            androidx.appcompat.graphics.drawable.StateListDrawableCompat$StateListState r0 = r1.mStateListState
            r0.mutate()
            r0 = 1
            r1.mMutated = r0
        L12:
            return r1
    }

    @Override // androidx.appcompat.graphics.drawable.DrawableContainerCompat, android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] r5) {
            r4 = this;
            boolean r0 = super.onStateChange(r5)
            androidx.appcompat.graphics.drawable.StateListDrawableCompat$StateListState r1 = r4.mStateListState
            int r1 = r1.indexOfStateSet(r5)
            if (r1 >= 0) goto L14
            androidx.appcompat.graphics.drawable.StateListDrawableCompat$StateListState r2 = r4.mStateListState
            int[] r3 = android.util.StateSet.WILD_CARD
            int r1 = r2.indexOfStateSet(r3)
        L14:
            boolean r2 = r4.selectDrawable(r1)
            if (r2 != 0) goto L1f
            if (r0 == 0) goto L1d
            goto L1f
        L1d:
            r2 = 0
            goto L20
        L1f:
            r2 = 1
        L20:
            return r2
    }

    @Override // androidx.appcompat.graphics.drawable.DrawableContainerCompat
    void setConstantState(androidx.appcompat.graphics.drawable.DrawableContainerCompat.DrawableContainerState r2) {
            r1 = this;
            super.setConstantState(r2)
            boolean r0 = r2 instanceof androidx.appcompat.graphics.drawable.StateListDrawableCompat.StateListState
            if (r0 == 0) goto Lc
            r0 = r2
            androidx.appcompat.graphics.drawable.StateListDrawableCompat$StateListState r0 = (androidx.appcompat.graphics.drawable.StateListDrawableCompat.StateListState) r0
            r1.mStateListState = r0
        Lc:
            return
    }
}
