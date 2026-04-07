package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
public class ActionBarContainer extends android.widget.FrameLayout {
    private android.view.View mActionBarView;
    android.graphics.drawable.Drawable mBackground;
    private android.view.View mContextView;
    private int mHeight;
    boolean mIsSplit;
    boolean mIsStacked;
    private boolean mIsTransitioning;
    android.graphics.drawable.Drawable mSplitBackground;
    android.graphics.drawable.Drawable mStackedBackground;
    private android.view.View mTabContainer;

    private static class Api21Impl {
        private Api21Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        public static void invalidateOutline(androidx.appcompat.widget.ActionBarContainer r0) {
                r0.invalidateOutline()
                return
        }
    }

    public ActionBarContainer(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public ActionBarContainer(android.content.Context r6, android.util.AttributeSet r7) {
            r5 = this;
            r5.<init>(r6, r7)
            androidx.appcompat.widget.ActionBarBackgroundDrawable r0 = new androidx.appcompat.widget.ActionBarBackgroundDrawable
            r0.<init>(r5)
            r5.setBackground(r0)
            int[] r1 = androidx.appcompat.R.styleable.ActionBar
            android.content.res.TypedArray r1 = r6.obtainStyledAttributes(r7, r1)
            int r2 = androidx.appcompat.R.styleable.ActionBar_background
            android.graphics.drawable.Drawable r2 = r1.getDrawable(r2)
            r5.mBackground = r2
            int r2 = androidx.appcompat.R.styleable.ActionBar_backgroundStacked
            android.graphics.drawable.Drawable r2 = r1.getDrawable(r2)
            r5.mStackedBackground = r2
            int r2 = androidx.appcompat.R.styleable.ActionBar_height
            r3 = -1
            int r2 = r1.getDimensionPixelSize(r2, r3)
            r5.mHeight = r2
            int r2 = r5.getId()
            int r3 = androidx.appcompat.R.id.split_action_bar
            r4 = 1
            if (r2 != r3) goto L3d
            r5.mIsSplit = r4
            int r2 = androidx.appcompat.R.styleable.ActionBar_backgroundSplit
            android.graphics.drawable.Drawable r2 = r1.getDrawable(r2)
            r5.mSplitBackground = r2
        L3d:
            r1.recycle()
            boolean r2 = r5.mIsSplit
            r3 = 0
            if (r2 == 0) goto L4c
            android.graphics.drawable.Drawable r2 = r5.mSplitBackground
            if (r2 != 0) goto L4a
            goto L56
        L4a:
            r4 = r3
            goto L56
        L4c:
            android.graphics.drawable.Drawable r2 = r5.mBackground
            if (r2 != 0) goto L55
            android.graphics.drawable.Drawable r2 = r5.mStackedBackground
            if (r2 != 0) goto L55
            goto L56
        L55:
            r4 = r3
        L56:
            r5.setWillNotDraw(r4)
            return
    }

    private int getMeasuredHeightWithMargins(android.view.View r4) {
            r3 = this;
            android.view.ViewGroup$LayoutParams r0 = r4.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r0 = (android.widget.FrameLayout.LayoutParams) r0
            int r1 = r4.getMeasuredHeight()
            int r2 = r0.topMargin
            int r1 = r1 + r2
            int r2 = r0.bottomMargin
            int r1 = r1 + r2
            return r1
    }

    private boolean isCollapsed(android.view.View r3) {
            r2 = this;
            if (r3 == 0) goto L13
            int r0 = r3.getVisibility()
            r1 = 8
            if (r0 == r1) goto L13
            int r0 = r3.getMeasuredHeight()
            if (r0 != 0) goto L11
            goto L13
        L11:
            r0 = 0
            goto L14
        L13:
            r0 = 1
        L14:
            return r0
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
            r2 = this;
            super.drawableStateChanged()
            android.graphics.drawable.Drawable r0 = r2.mBackground
            if (r0 == 0) goto L18
            android.graphics.drawable.Drawable r0 = r2.mBackground
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L18
            android.graphics.drawable.Drawable r0 = r2.mBackground
            int[] r1 = r2.getDrawableState()
            r0.setState(r1)
        L18:
            android.graphics.drawable.Drawable r0 = r2.mStackedBackground
            if (r0 == 0) goto L2d
            android.graphics.drawable.Drawable r0 = r2.mStackedBackground
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L2d
            android.graphics.drawable.Drawable r0 = r2.mStackedBackground
            int[] r1 = r2.getDrawableState()
            r0.setState(r1)
        L2d:
            android.graphics.drawable.Drawable r0 = r2.mSplitBackground
            if (r0 == 0) goto L42
            android.graphics.drawable.Drawable r0 = r2.mSplitBackground
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L42
            android.graphics.drawable.Drawable r0 = r2.mSplitBackground
            int[] r1 = r2.getDrawableState()
            r0.setState(r1)
        L42:
            return
    }

    public android.view.View getTabContainer() {
            r1 = this;
            android.view.View r0 = r1.mTabContainer
            return r0
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
            r1 = this;
            super.jumpDrawablesToCurrentState()
            android.graphics.drawable.Drawable r0 = r1.mBackground
            if (r0 == 0) goto Lc
            android.graphics.drawable.Drawable r0 = r1.mBackground
            r0.jumpToCurrentState()
        Lc:
            android.graphics.drawable.Drawable r0 = r1.mStackedBackground
            if (r0 == 0) goto L15
            android.graphics.drawable.Drawable r0 = r1.mStackedBackground
            r0.jumpToCurrentState()
        L15:
            android.graphics.drawable.Drawable r0 = r1.mSplitBackground
            if (r0 == 0) goto L1e
            android.graphics.drawable.Drawable r0 = r1.mSplitBackground
            r0.jumpToCurrentState()
        L1e:
            return
    }

    @Override // android.view.View
    public void onFinishInflate() {
            r1 = this;
            super.onFinishInflate()
            int r0 = androidx.appcompat.R.id.action_bar
            android.view.View r0 = r1.findViewById(r0)
            r1.mActionBarView = r0
            int r0 = androidx.appcompat.R.id.action_context_bar
            android.view.View r0 = r1.findViewById(r0)
            r1.mContextView = r0
            return
    }

    @Override // android.view.View
    public boolean onHoverEvent(android.view.MotionEvent r2) {
            r1 = this;
            super.onHoverEvent(r2)
            r0 = 1
            return r0
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent r2) {
            r1 = this;
            boolean r0 = r1.mIsTransitioning
            if (r0 != 0) goto Ld
            boolean r0 = super.onInterceptTouchEvent(r2)
            if (r0 == 0) goto Lb
            goto Ld
        Lb:
            r0 = 0
            goto Le
        Ld:
            r0 = 1
        Le:
            return r0
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean r10, int r11, int r12, int r13, int r14) {
            r9 = this;
            super.onLayout(r10, r11, r12, r13, r14)
            r0 = r14
            r14 = r13
            r13 = r12
            r12 = r11
            r11 = r10
            r10 = r9
            android.view.View r1 = r10.mTabContainer
            r2 = 8
            r3 = 0
            if (r1 == 0) goto L18
            int r4 = r1.getVisibility()
            if (r4 == r2) goto L18
            r4 = 1
            goto L19
        L18:
            r4 = r3
        L19:
            if (r1 == 0) goto L3b
            int r5 = r1.getVisibility()
            if (r5 == r2) goto L3b
            int r2 = r9.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r5 = r1.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r5 = (android.widget.FrameLayout.LayoutParams) r5
            int r6 = r1.getMeasuredHeight()
            int r7 = r2 - r6
            int r8 = r5.bottomMargin
            int r7 = r7 - r8
            int r8 = r5.bottomMargin
            int r8 = r2 - r8
            r1.layout(r12, r7, r14, r8)
        L3b:
            r2 = 0
            boolean r5 = r10.mIsSplit
            if (r5 == 0) goto L54
            android.graphics.drawable.Drawable r5 = r10.mSplitBackground
            if (r5 == 0) goto Lcc
            android.graphics.drawable.Drawable r5 = r10.mSplitBackground
            int r6 = r9.getMeasuredWidth()
            int r7 = r9.getMeasuredHeight()
            r5.setBounds(r3, r3, r6, r7)
            r2 = 1
            goto Lcc
        L54:
            android.graphics.drawable.Drawable r5 = r10.mBackground
            if (r5 == 0) goto Lae
            android.view.View r5 = r10.mActionBarView
            int r5 = r5.getVisibility()
            if (r5 != 0) goto L7e
            android.graphics.drawable.Drawable r3 = r10.mBackground
            android.view.View r5 = r10.mActionBarView
            int r5 = r5.getLeft()
            android.view.View r6 = r10.mActionBarView
            int r6 = r6.getTop()
            android.view.View r7 = r10.mActionBarView
            int r7 = r7.getRight()
            android.view.View r8 = r10.mActionBarView
            int r8 = r8.getBottom()
            r3.setBounds(r5, r6, r7, r8)
            goto Lad
        L7e:
            android.view.View r5 = r10.mContextView
            if (r5 == 0) goto La8
            android.view.View r5 = r10.mContextView
            int r5 = r5.getVisibility()
            if (r5 != 0) goto La8
            android.graphics.drawable.Drawable r3 = r10.mBackground
            android.view.View r5 = r10.mContextView
            int r5 = r5.getLeft()
            android.view.View r6 = r10.mContextView
            int r6 = r6.getTop()
            android.view.View r7 = r10.mContextView
            int r7 = r7.getRight()
            android.view.View r8 = r10.mContextView
            int r8 = r8.getBottom()
            r3.setBounds(r5, r6, r7, r8)
            goto Lad
        La8:
            android.graphics.drawable.Drawable r5 = r10.mBackground
            r5.setBounds(r3, r3, r3, r3)
        Lad:
            r2 = 1
        Lae:
            r10.mIsStacked = r4
            if (r4 == 0) goto Lcc
            android.graphics.drawable.Drawable r3 = r10.mStackedBackground
            if (r3 == 0) goto Lcc
            android.graphics.drawable.Drawable r3 = r10.mStackedBackground
            int r5 = r1.getLeft()
            int r6 = r1.getTop()
            int r7 = r1.getRight()
            int r8 = r1.getBottom()
            r3.setBounds(r5, r6, r7, r8)
            r2 = 1
        Lcc:
            if (r2 == 0) goto Ld1
            r9.invalidate()
        Ld1:
            return
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int r6, int r7) {
            r5 = this;
            android.view.View r0 = r5.mActionBarView
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != 0) goto L1e
            int r0 = android.view.View.MeasureSpec.getMode(r7)
            if (r0 != r1) goto L1e
            int r0 = r5.mHeight
            if (r0 < 0) goto L1e
            int r0 = r5.mHeight
            int r2 = android.view.View.MeasureSpec.getSize(r7)
            int r0 = java.lang.Math.min(r0, r2)
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r1)
        L1e:
            super.onMeasure(r6, r7)
            android.view.View r0 = r5.mActionBarView
            if (r0 != 0) goto L26
            return
        L26:
            int r0 = android.view.View.MeasureSpec.getMode(r7)
            android.view.View r2 = r5.mTabContainer
            if (r2 == 0) goto L77
            android.view.View r2 = r5.mTabContainer
            int r2 = r2.getVisibility()
            r3 = 8
            if (r2 == r3) goto L77
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 == r2) goto L77
            android.view.View r2 = r5.mActionBarView
            boolean r2 = r5.isCollapsed(r2)
            if (r2 != 0) goto L4b
            android.view.View r2 = r5.mActionBarView
            int r2 = r5.getMeasuredHeightWithMargins(r2)
            goto L5b
        L4b:
            android.view.View r2 = r5.mContextView
            boolean r2 = r5.isCollapsed(r2)
            if (r2 != 0) goto L5a
            android.view.View r2 = r5.mContextView
            int r2 = r5.getMeasuredHeightWithMargins(r2)
            goto L5b
        L5a:
            r2 = 0
        L5b:
            if (r0 != r1) goto L62
            int r1 = android.view.View.MeasureSpec.getSize(r7)
            goto L65
        L62:
            r1 = 2147483647(0x7fffffff, float:NaN)
        L65:
            int r3 = r5.getMeasuredWidth()
            android.view.View r4 = r5.mTabContainer
            int r4 = r5.getMeasuredHeightWithMargins(r4)
            int r4 = r4 + r2
            int r4 = java.lang.Math.min(r4, r1)
            r5.setMeasuredDimension(r3, r4)
        L77:
            return
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent r2) {
            r1 = this;
            super.onTouchEvent(r2)
            r0 = 1
            return r0
    }

    public void setPrimaryBackground(android.graphics.drawable.Drawable r6) {
            r5 = this;
            android.graphics.drawable.Drawable r0 = r5.mBackground
            if (r0 == 0) goto Lf
            android.graphics.drawable.Drawable r0 = r5.mBackground
            r1 = 0
            r0.setCallback(r1)
            android.graphics.drawable.Drawable r0 = r5.mBackground
            r5.unscheduleDrawable(r0)
        Lf:
            r5.mBackground = r6
            if (r6 == 0) goto L37
            r6.setCallback(r5)
            android.view.View r0 = r5.mActionBarView
            if (r0 == 0) goto L37
            android.graphics.drawable.Drawable r0 = r5.mBackground
            android.view.View r1 = r5.mActionBarView
            int r1 = r1.getLeft()
            android.view.View r2 = r5.mActionBarView
            int r2 = r2.getTop()
            android.view.View r3 = r5.mActionBarView
            int r3 = r3.getRight()
            android.view.View r4 = r5.mActionBarView
            int r4 = r4.getBottom()
            r0.setBounds(r1, r2, r3, r4)
        L37:
            boolean r0 = r5.mIsSplit
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L44
            android.graphics.drawable.Drawable r0 = r5.mSplitBackground
            if (r0 != 0) goto L42
            goto L4e
        L42:
            r1 = r2
            goto L4e
        L44:
            android.graphics.drawable.Drawable r0 = r5.mBackground
            if (r0 != 0) goto L4d
            android.graphics.drawable.Drawable r0 = r5.mStackedBackground
            if (r0 != 0) goto L4d
            goto L4e
        L4d:
            r1 = r2
        L4e:
            r5.setWillNotDraw(r1)
            r5.invalidate()
            androidx.appcompat.widget.ActionBarContainer.Api21Impl.invalidateOutline(r5)
            return
    }

    public void setSplitBackground(android.graphics.drawable.Drawable r5) {
            r4 = this;
            android.graphics.drawable.Drawable r0 = r4.mSplitBackground
            if (r0 == 0) goto Lf
            android.graphics.drawable.Drawable r0 = r4.mSplitBackground
            r1 = 0
            r0.setCallback(r1)
            android.graphics.drawable.Drawable r0 = r4.mSplitBackground
            r4.unscheduleDrawable(r0)
        Lf:
            r4.mSplitBackground = r5
            r0 = 0
            if (r5 == 0) goto L2c
            r5.setCallback(r4)
            boolean r1 = r4.mIsSplit
            if (r1 == 0) goto L2c
            android.graphics.drawable.Drawable r1 = r4.mSplitBackground
            if (r1 == 0) goto L2c
            android.graphics.drawable.Drawable r1 = r4.mSplitBackground
            int r2 = r4.getMeasuredWidth()
            int r3 = r4.getMeasuredHeight()
            r1.setBounds(r0, r0, r2, r3)
        L2c:
            boolean r1 = r4.mIsSplit
            r2 = 1
            if (r1 == 0) goto L37
            android.graphics.drawable.Drawable r1 = r4.mSplitBackground
            if (r1 != 0) goto L40
            r0 = r2
            goto L40
        L37:
            android.graphics.drawable.Drawable r1 = r4.mBackground
            if (r1 != 0) goto L40
            android.graphics.drawable.Drawable r1 = r4.mStackedBackground
            if (r1 != 0) goto L40
            r0 = r2
        L40:
            r4.setWillNotDraw(r0)
            r4.invalidate()
            androidx.appcompat.widget.ActionBarContainer.Api21Impl.invalidateOutline(r4)
            return
    }

    public void setStackedBackground(android.graphics.drawable.Drawable r6) {
            r5 = this;
            android.graphics.drawable.Drawable r0 = r5.mStackedBackground
            if (r0 == 0) goto Lf
            android.graphics.drawable.Drawable r0 = r5.mStackedBackground
            r1 = 0
            r0.setCallback(r1)
            android.graphics.drawable.Drawable r0 = r5.mStackedBackground
            r5.unscheduleDrawable(r0)
        Lf:
            r5.mStackedBackground = r6
            if (r6 == 0) goto L3b
            r6.setCallback(r5)
            boolean r0 = r5.mIsStacked
            if (r0 == 0) goto L3b
            android.graphics.drawable.Drawable r0 = r5.mStackedBackground
            if (r0 == 0) goto L3b
            android.graphics.drawable.Drawable r0 = r5.mStackedBackground
            android.view.View r1 = r5.mTabContainer
            int r1 = r1.getLeft()
            android.view.View r2 = r5.mTabContainer
            int r2 = r2.getTop()
            android.view.View r3 = r5.mTabContainer
            int r3 = r3.getRight()
            android.view.View r4 = r5.mTabContainer
            int r4 = r4.getBottom()
            r0.setBounds(r1, r2, r3, r4)
        L3b:
            boolean r0 = r5.mIsSplit
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L48
            android.graphics.drawable.Drawable r0 = r5.mSplitBackground
            if (r0 != 0) goto L46
            goto L52
        L46:
            r1 = r2
            goto L52
        L48:
            android.graphics.drawable.Drawable r0 = r5.mBackground
            if (r0 != 0) goto L51
            android.graphics.drawable.Drawable r0 = r5.mStackedBackground
            if (r0 != 0) goto L51
            goto L52
        L51:
            r1 = r2
        L52:
            r5.setWillNotDraw(r1)
            r5.invalidate()
            androidx.appcompat.widget.ActionBarContainer.Api21Impl.invalidateOutline(r5)
            return
    }

    public void setTabContainer(androidx.appcompat.widget.ScrollingTabContainerView r3) {
            r2 = this;
            android.view.View r0 = r2.mTabContainer
            if (r0 == 0) goto L9
            android.view.View r0 = r2.mTabContainer
            r2.removeView(r0)
        L9:
            r2.mTabContainer = r3
            if (r3 == 0) goto L1e
            r2.addView(r3)
            android.view.ViewGroup$LayoutParams r0 = r3.getLayoutParams()
            r1 = -1
            r0.width = r1
            r1 = -2
            r0.height = r1
            r1 = 0
            r3.setAllowCollapse(r1)
        L1e:
            return
    }

    public void setTransitioning(boolean r2) {
            r1 = this;
            r1.mIsTransitioning = r2
            if (r2 == 0) goto L7
            r0 = 393216(0x60000, float:5.51013E-40)
            goto L9
        L7:
            r0 = 262144(0x40000, float:3.67342E-40)
        L9:
            r1.setDescendantFocusability(r0)
            return
    }

    @Override // android.view.View
    public void setVisibility(int r4) {
            r3 = this;
            super.setVisibility(r4)
            r0 = 0
            if (r4 != 0) goto L8
            r1 = 1
            goto L9
        L8:
            r1 = r0
        L9:
            android.graphics.drawable.Drawable r2 = r3.mBackground
            if (r2 == 0) goto L12
            android.graphics.drawable.Drawable r2 = r3.mBackground
            r2.setVisible(r1, r0)
        L12:
            android.graphics.drawable.Drawable r2 = r3.mStackedBackground
            if (r2 == 0) goto L1b
            android.graphics.drawable.Drawable r2 = r3.mStackedBackground
            r2.setVisible(r1, r0)
        L1b:
            android.graphics.drawable.Drawable r2 = r3.mSplitBackground
            if (r2 == 0) goto L24
            android.graphics.drawable.Drawable r2 = r3.mSplitBackground
            r2.setVisible(r1, r0)
        L24:
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public android.view.ActionMode startActionModeForChild(android.view.View r2, android.view.ActionMode.Callback r3) {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public android.view.ActionMode startActionModeForChild(android.view.View r2, android.view.ActionMode.Callback r3, int r4) {
            r1 = this;
            if (r4 == 0) goto L7
            android.view.ActionMode r0 = super.startActionModeForChild(r2, r3, r4)
            return r0
        L7:
            r0 = 0
            return r0
    }

    @Override // android.view.View
    protected boolean verifyDrawable(android.graphics.drawable.Drawable r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mBackground
            if (r2 != r0) goto L8
            boolean r0 = r1.mIsSplit
            if (r0 == 0) goto L1e
        L8:
            android.graphics.drawable.Drawable r0 = r1.mStackedBackground
            if (r2 != r0) goto L10
            boolean r0 = r1.mIsStacked
            if (r0 != 0) goto L1e
        L10:
            android.graphics.drawable.Drawable r0 = r1.mSplitBackground
            if (r2 != r0) goto L18
            boolean r0 = r1.mIsSplit
            if (r0 != 0) goto L1e
        L18:
            boolean r0 = super.verifyDrawable(r2)
            if (r0 == 0) goto L20
        L1e:
            r0 = 1
            goto L21
        L20:
            r0 = 0
        L21:
            return r0
    }
}
