package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
public class ActionBarContextView extends androidx.appcompat.widget.AbsActionBarView {
    private android.view.View mClose;
    private android.view.View mCloseButton;
    private int mCloseItemLayout;
    private android.view.View mCustomView;
    private java.lang.CharSequence mSubtitle;
    private int mSubtitleStyleRes;
    private android.widget.TextView mSubtitleView;
    private java.lang.CharSequence mTitle;
    private android.widget.LinearLayout mTitleLayout;
    private boolean mTitleOptional;
    private int mTitleStyleRes;
    private android.widget.TextView mTitleView;


    public ActionBarContextView(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public ActionBarContextView(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            int r0 = androidx.appcompat.R.attr.actionModeStyle
            r1.<init>(r2, r3, r0)
            return
    }

    public ActionBarContextView(android.content.Context r4, android.util.AttributeSet r5, int r6) {
            r3 = this;
            r3.<init>(r4, r5, r6)
            int[] r0 = androidx.appcompat.R.styleable.ActionMode
            r1 = 0
            androidx.appcompat.widget.TintTypedArray r0 = androidx.appcompat.widget.TintTypedArray.obtainStyledAttributes(r4, r5, r0, r6, r1)
            int r2 = androidx.appcompat.R.styleable.ActionMode_background
            android.graphics.drawable.Drawable r2 = r0.getDrawable(r2)
            r3.setBackground(r2)
            int r2 = androidx.appcompat.R.styleable.ActionMode_titleTextStyle
            int r2 = r0.getResourceId(r2, r1)
            r3.mTitleStyleRes = r2
            int r2 = androidx.appcompat.R.styleable.ActionMode_subtitleTextStyle
            int r2 = r0.getResourceId(r2, r1)
            r3.mSubtitleStyleRes = r2
            int r2 = androidx.appcompat.R.styleable.ActionMode_height
            int r1 = r0.getLayoutDimension(r2, r1)
            r3.mContentHeight = r1
            int r1 = androidx.appcompat.R.styleable.ActionMode_closeItemLayout
            int r2 = androidx.appcompat.R.layout.abc_action_mode_close_item_material
            int r1 = r0.getResourceId(r1, r2)
            r3.mCloseItemLayout = r1
            r0.recycle()
            return
    }

    private void initTitle() {
            r6 = this;
            android.widget.LinearLayout r0 = r6.mTitleLayout
            if (r0 != 0) goto L55
            android.content.Context r0 = r6.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            int r1 = androidx.appcompat.R.layout.abc_action_bar_title_item
            r0.inflate(r1, r6)
            int r1 = r6.getChildCount()
            int r1 = r1 + (-1)
            android.view.View r1 = r6.getChildAt(r1)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r6.mTitleLayout = r1
            android.widget.LinearLayout r1 = r6.mTitleLayout
            int r2 = androidx.appcompat.R.id.action_bar_title
            android.view.View r1 = r1.findViewById(r2)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r6.mTitleView = r1
            android.widget.LinearLayout r1 = r6.mTitleLayout
            int r2 = androidx.appcompat.R.id.action_bar_subtitle
            android.view.View r1 = r1.findViewById(r2)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r6.mSubtitleView = r1
            int r1 = r6.mTitleStyleRes
            if (r1 == 0) goto L46
            android.widget.TextView r1 = r6.mTitleView
            android.content.Context r2 = r6.getContext()
            int r3 = r6.mTitleStyleRes
            r1.setTextAppearance(r2, r3)
        L46:
            int r1 = r6.mSubtitleStyleRes
            if (r1 == 0) goto L55
            android.widget.TextView r1 = r6.mSubtitleView
            android.content.Context r2 = r6.getContext()
            int r3 = r6.mSubtitleStyleRes
            r1.setTextAppearance(r2, r3)
        L55:
            android.widget.TextView r0 = r6.mTitleView
            java.lang.CharSequence r1 = r6.mTitle
            r0.setText(r1)
            android.widget.TextView r0 = r6.mSubtitleView
            java.lang.CharSequence r1 = r6.mSubtitle
            r0.setText(r1)
            java.lang.CharSequence r0 = r6.mTitle
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r0 = r0 ^ 1
            java.lang.CharSequence r1 = r6.mSubtitle
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            r1 = r1 ^ 1
            android.widget.TextView r2 = r6.mSubtitleView
            r3 = 0
            r4 = 8
            if (r1 == 0) goto L7c
            r5 = r3
            goto L7d
        L7c:
            r5 = r4
        L7d:
            r2.setVisibility(r5)
            android.widget.LinearLayout r2 = r6.mTitleLayout
            if (r0 != 0) goto L88
            if (r1 == 0) goto L87
            goto L88
        L87:
            r3 = r4
        L88:
            r2.setVisibility(r3)
            android.widget.LinearLayout r2 = r6.mTitleLayout
            android.view.ViewParent r2 = r2.getParent()
            if (r2 != 0) goto L98
            android.widget.LinearLayout r2 = r6.mTitleLayout
            r6.addView(r2)
        L98:
            return
    }

    @Override // androidx.appcompat.widget.AbsActionBarView
    public /* bridge */ /* synthetic */ void animateToVisibility(int r1) {
            r0 = this;
            super.animateToVisibility(r1)
            return
    }

    @Override // androidx.appcompat.widget.AbsActionBarView
    public /* bridge */ /* synthetic */ boolean canShowOverflowMenu() {
            r1 = this;
            boolean r0 = super.canShowOverflowMenu()
            return r0
    }

    public void closeMode() {
            r1 = this;
            android.view.View r0 = r1.mClose
            if (r0 != 0) goto L8
            r1.killMode()
            return
        L8:
            return
    }

    @Override // androidx.appcompat.widget.AbsActionBarView
    public /* bridge */ /* synthetic */ void dismissPopupMenus() {
            r0 = this;
            super.dismissPopupMenus()
            return
    }

    @Override // android.view.ViewGroup
    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
            r3 = this;
            android.view.ViewGroup$MarginLayoutParams r0 = new android.view.ViewGroup$MarginLayoutParams
            r1 = -1
            r2 = -2
            r0.<init>(r1, r2)
            return r0
    }

    @Override // android.view.ViewGroup
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet r3) {
            r2 = this;
            android.view.ViewGroup$MarginLayoutParams r0 = new android.view.ViewGroup$MarginLayoutParams
            android.content.Context r1 = r2.getContext()
            r0.<init>(r1, r3)
            return r0
    }

    @Override // androidx.appcompat.widget.AbsActionBarView
    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
            r1 = this;
            int r0 = super.getAnimatedVisibility()
            return r0
    }

    @Override // androidx.appcompat.widget.AbsActionBarView
    public /* bridge */ /* synthetic */ int getContentHeight() {
            r1 = this;
            int r0 = super.getContentHeight()
            return r0
    }

    public java.lang.CharSequence getSubtitle() {
            r1 = this;
            java.lang.CharSequence r0 = r1.mSubtitle
            return r0
    }

    public java.lang.CharSequence getTitle() {
            r1 = this;
            java.lang.CharSequence r0 = r1.mTitle
            return r0
    }

    @Override // androidx.appcompat.widget.AbsActionBarView
    public boolean hideOverflowMenu() {
            r1 = this;
            androidx.appcompat.widget.ActionMenuPresenter r0 = r1.mActionMenuPresenter
            if (r0 == 0) goto Lb
            androidx.appcompat.widget.ActionMenuPresenter r0 = r1.mActionMenuPresenter
            boolean r0 = r0.hideOverflowMenu()
            return r0
        Lb:
            r0 = 0
            return r0
    }

    public void initForMode(androidx.appcompat.view.ActionMode r5) {
            r4 = this;
            android.view.View r0 = r4.mClose
            if (r0 != 0) goto L1b
            android.content.Context r0 = r4.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            int r1 = r4.mCloseItemLayout
            r2 = 0
            android.view.View r1 = r0.inflate(r1, r4, r2)
            r4.mClose = r1
            android.view.View r1 = r4.mClose
            r4.addView(r1)
            goto L29
        L1b:
            android.view.View r0 = r4.mClose
            android.view.ViewParent r0 = r0.getParent()
            if (r0 != 0) goto L29
            android.view.View r0 = r4.mClose
            r4.addView(r0)
            goto L2a
        L29:
        L2a:
            android.view.View r0 = r4.mClose
            int r1 = androidx.appcompat.R.id.action_mode_close_button
            android.view.View r0 = r0.findViewById(r1)
            r4.mCloseButton = r0
            android.view.View r0 = r4.mCloseButton
            androidx.appcompat.widget.ActionBarContextView$1 r1 = new androidx.appcompat.widget.ActionBarContextView$1
            r1.<init>(r4, r5)
            r0.setOnClickListener(r1)
            android.view.Menu r0 = r5.getMenu()
            androidx.appcompat.view.menu.MenuBuilder r0 = (androidx.appcompat.view.menu.MenuBuilder) r0
            androidx.appcompat.widget.ActionMenuPresenter r1 = r4.mActionMenuPresenter
            if (r1 == 0) goto L4d
            androidx.appcompat.widget.ActionMenuPresenter r1 = r4.mActionMenuPresenter
            r1.dismissPopupMenus()
        L4d:
            androidx.appcompat.widget.ActionMenuPresenter r1 = new androidx.appcompat.widget.ActionMenuPresenter
            android.content.Context r2 = r4.getContext()
            r1.<init>(r2)
            r4.mActionMenuPresenter = r1
            androidx.appcompat.widget.ActionMenuPresenter r1 = r4.mActionMenuPresenter
            r2 = 1
            r1.setReserveOverflow(r2)
            android.view.ViewGroup$LayoutParams r1 = new android.view.ViewGroup$LayoutParams
            r2 = -2
            r3 = -1
            r1.<init>(r2, r3)
            androidx.appcompat.widget.ActionMenuPresenter r2 = r4.mActionMenuPresenter
            android.content.Context r3 = r4.mPopupContext
            r0.addMenuPresenter(r2, r3)
            androidx.appcompat.widget.ActionMenuPresenter r2 = r4.mActionMenuPresenter
            androidx.appcompat.view.menu.MenuView r2 = r2.getMenuView(r4)
            androidx.appcompat.widget.ActionMenuView r2 = (androidx.appcompat.widget.ActionMenuView) r2
            r4.mMenuView = r2
            androidx.appcompat.widget.ActionMenuView r2 = r4.mMenuView
            r3 = 0
            r2.setBackground(r3)
            androidx.appcompat.widget.ActionMenuView r2 = r4.mMenuView
            r4.addView(r2, r1)
            return
    }

    @Override // androidx.appcompat.widget.AbsActionBarView
    public /* bridge */ /* synthetic */ boolean isOverflowMenuShowPending() {
            r1 = this;
            boolean r0 = super.isOverflowMenuShowPending()
            return r0
    }

    @Override // androidx.appcompat.widget.AbsActionBarView
    public boolean isOverflowMenuShowing() {
            r1 = this;
            androidx.appcompat.widget.ActionMenuPresenter r0 = r1.mActionMenuPresenter
            if (r0 == 0) goto Lb
            androidx.appcompat.widget.ActionMenuPresenter r0 = r1.mActionMenuPresenter
            boolean r0 = r0.isOverflowMenuShowing()
            return r0
        Lb:
            r0 = 0
            return r0
    }

    @Override // androidx.appcompat.widget.AbsActionBarView
    public /* bridge */ /* synthetic */ boolean isOverflowReserved() {
            r1 = this;
            boolean r0 = super.isOverflowReserved()
            return r0
    }

    public boolean isTitleOptional() {
            r1 = this;
            boolean r0 = r1.mTitleOptional
            return r0
    }

    public void killMode() {
            r2 = this;
            r2.removeAllViews()
            r0 = 0
            r2.mCustomView = r0
            r2.mMenuView = r0
            r2.mActionMenuPresenter = r0
            android.view.View r1 = r2.mCloseButton
            if (r1 == 0) goto L13
            android.view.View r1 = r2.mCloseButton
            r1.setOnClickListener(r0)
        L13:
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
            r1 = this;
            super.onDetachedFromWindow()
            androidx.appcompat.widget.ActionMenuPresenter r0 = r1.mActionMenuPresenter
            if (r0 == 0) goto L11
            androidx.appcompat.widget.ActionMenuPresenter r0 = r1.mActionMenuPresenter
            r0.hideOverflowMenu()
            androidx.appcompat.widget.ActionMenuPresenter r0 = r1.mActionMenuPresenter
            r0.hideSubMenus()
        L11:
            return
    }

    @Override // androidx.appcompat.widget.AbsActionBarView, android.view.View
    public /* bridge */ /* synthetic */ boolean onHoverEvent(android.view.MotionEvent r1) {
            r0 = this;
            boolean r1 = super.onHoverEvent(r1)
            return r1
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean r11, int r12, int r13, int r14, int r15) {
            r10 = this;
            boolean r5 = androidx.appcompat.widget.ViewUtils.isLayoutRtl(r10)
            if (r5 == 0) goto Le
            int r1 = r14 - r12
            int r2 = r10.getPaddingRight()
            int r1 = r1 - r2
            goto L12
        Le:
            int r1 = r10.getPaddingLeft()
        L12:
            int r3 = r10.getPaddingTop()
            int r2 = r15 - r13
            int r4 = r10.getPaddingTop()
            int r2 = r2 - r4
            int r4 = r10.getPaddingBottom()
            int r4 = r2 - r4
            android.view.View r2 = r10.mClose
            r6 = 8
            if (r2 == 0) goto L5c
            android.view.View r2 = r10.mClose
            int r2 = r2.getVisibility()
            if (r2 == r6) goto L5c
            android.view.View r2 = r10.mClose
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            r7 = r2
            android.view.ViewGroup$MarginLayoutParams r7 = (android.view.ViewGroup.MarginLayoutParams) r7
            if (r5 == 0) goto L3f
            int r2 = r7.rightMargin
            goto L41
        L3f:
            int r2 = r7.leftMargin
        L41:
            r8 = r2
            if (r5 == 0) goto L47
            int r2 = r7.leftMargin
            goto L49
        L47:
            int r2 = r7.rightMargin
        L49:
            r9 = r2
            int r2 = next(r1, r8, r5)
            android.view.View r1 = r10.mClose
            r0 = r10
            int r1 = r0.positionChild(r1, r2, r3, r4, r5)
            int r2 = r2 + r1
            int r1 = next(r2, r9, r5)
            r2 = r1
            goto L5d
        L5c:
            r2 = r1
        L5d:
            android.widget.LinearLayout r1 = r10.mTitleLayout
            if (r1 == 0) goto L75
            android.view.View r1 = r10.mCustomView
            if (r1 != 0) goto L75
            android.widget.LinearLayout r1 = r10.mTitleLayout
            int r1 = r1.getVisibility()
            if (r1 == r6) goto L75
            android.widget.LinearLayout r1 = r10.mTitleLayout
            r0 = r10
            int r1 = r0.positionChild(r1, r2, r3, r4, r5)
            int r2 = r2 + r1
        L75:
            android.view.View r1 = r10.mCustomView
            if (r1 == 0) goto L83
            android.view.View r1 = r10.mCustomView
            r0 = r10
            int r1 = r0.positionChild(r1, r2, r3, r4, r5)
            r6 = r5
            int r2 = r2 + r1
            goto L84
        L83:
            r6 = r5
        L84:
            if (r6 == 0) goto L8b
            int r1 = r10.getPaddingLeft()
            goto L92
        L8b:
            int r1 = r14 - r12
            int r5 = r10.getPaddingRight()
            int r1 = r1 - r5
        L92:
            r2 = r1
            androidx.appcompat.widget.ActionMenuView r1 = r10.mMenuView
            if (r1 == 0) goto La1
            androidx.appcompat.widget.ActionMenuView r1 = r10.mMenuView
            r5 = r6 ^ 1
            r0 = r10
            int r1 = r0.positionChild(r1, r2, r3, r4, r5)
            int r2 = r2 + r1
        La1:
            return
    }

    @Override // android.view.View
    protected void onMeasure(int r18, int r19) {
            r17 = this;
            r0 = r17
            int r1 = android.view.View.MeasureSpec.getMode(r18)
            r2 = 1073741824(0x40000000, float:2.0)
            if (r1 != r2) goto L122
            int r3 = android.view.View.MeasureSpec.getMode(r19)
            if (r3 == 0) goto Lff
            int r4 = android.view.View.MeasureSpec.getSize(r18)
            int r5 = r0.mContentHeight
            if (r5 <= 0) goto L1b
            int r5 = r0.mContentHeight
            goto L1f
        L1b:
            int r5 = android.view.View.MeasureSpec.getSize(r19)
        L1f:
            int r6 = r0.getPaddingTop()
            int r7 = r0.getPaddingBottom()
            int r6 = r6 + r7
            int r7 = r0.getPaddingLeft()
            int r7 = r4 - r7
            int r8 = r0.getPaddingRight()
            int r7 = r7 - r8
            int r8 = r5 - r6
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
            int r10 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r9)
            android.view.View r11 = r0.mClose
            r12 = 0
            if (r11 == 0) goto L54
            android.view.View r11 = r0.mClose
            int r7 = r0.measureChildView(r11, r7, r10, r12)
            android.view.View r11 = r0.mClose
            android.view.ViewGroup$LayoutParams r11 = r11.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r11 = (android.view.ViewGroup.MarginLayoutParams) r11
            int r13 = r11.leftMargin
            int r14 = r11.rightMargin
            int r13 = r13 + r14
            int r7 = r7 - r13
        L54:
            androidx.appcompat.widget.ActionMenuView r11 = r0.mMenuView
            if (r11 == 0) goto L66
            androidx.appcompat.widget.ActionMenuView r11 = r0.mMenuView
            android.view.ViewParent r11 = r11.getParent()
            if (r11 != r0) goto L66
            androidx.appcompat.widget.ActionMenuView r11 = r0.mMenuView
            int r7 = r0.measureChildView(r11, r7, r10, r12)
        L66:
            android.widget.LinearLayout r11 = r0.mTitleLayout
            if (r11 == 0) goto L9a
            android.view.View r11 = r0.mCustomView
            if (r11 != 0) goto L9a
            boolean r11 = r0.mTitleOptional
            if (r11 == 0) goto L94
            int r11 = android.view.View.MeasureSpec.makeMeasureSpec(r12, r12)
            android.widget.LinearLayout r13 = r0.mTitleLayout
            r13.measure(r11, r10)
            android.widget.LinearLayout r13 = r0.mTitleLayout
            int r13 = r13.getMeasuredWidth()
            if (r13 > r7) goto L85
            r14 = 1
            goto L86
        L85:
            r14 = r12
        L86:
            if (r14 == 0) goto L89
            int r7 = r7 - r13
        L89:
            android.widget.LinearLayout r15 = r0.mTitleLayout
            if (r14 == 0) goto L8e
            goto L90
        L8e:
            r12 = 8
        L90:
            r15.setVisibility(r12)
            goto L9a
        L94:
            android.widget.LinearLayout r11 = r0.mTitleLayout
            int r7 = r0.measureChildView(r11, r7, r10, r12)
        L9a:
            android.view.View r11 = r0.mCustomView
            if (r11 == 0) goto Lda
            android.view.View r11 = r0.mCustomView
            android.view.ViewGroup$LayoutParams r11 = r11.getLayoutParams()
            int r12 = r11.width
            r13 = -2
            if (r12 == r13) goto Lab
            r12 = r2
            goto Lac
        Lab:
            r12 = r9
        Lac:
            int r14 = r11.width
            if (r14 < 0) goto Lb7
            int r14 = r11.width
            int r14 = java.lang.Math.min(r14, r7)
            goto Lb8
        Lb7:
            r14 = r7
        Lb8:
            int r15 = r11.height
            if (r15 == r13) goto Lbd
            goto Lbe
        Lbd:
            r2 = r9
        Lbe:
            int r9 = r11.height
            if (r9 < 0) goto Lc9
            int r9 = r11.height
            int r9 = java.lang.Math.min(r9, r8)
            goto Lca
        Lc9:
            r9 = r8
        Lca:
            android.view.View r13 = r0.mCustomView
            int r15 = android.view.View.MeasureSpec.makeMeasureSpec(r14, r12)
            r16 = r1
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r2)
            r13.measure(r15, r1)
            goto Ldc
        Lda:
            r16 = r1
        Ldc:
            int r1 = r0.mContentHeight
            if (r1 > 0) goto Lfb
            r1 = 0
            int r2 = r0.getChildCount()
            r9 = 0
        Le6:
            if (r9 >= r2) goto Lf7
            android.view.View r11 = r0.getChildAt(r9)
            int r12 = r11.getMeasuredHeight()
            int r12 = r12 + r6
            if (r12 <= r1) goto Lf4
            r1 = r12
        Lf4:
            int r9 = r9 + 1
            goto Le6
        Lf7:
            r0.setMeasuredDimension(r4, r1)
            goto Lfe
        Lfb:
            r0.setMeasuredDimension(r4, r5)
        Lfe:
            return
        Lff:
            r16 = r1
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.Class r4 = r0.getClass()
            java.lang.String r4 = r4.getSimpleName()
            java.lang.StringBuilder r2 = r2.append(r4)
            java.lang.String r4 = " can only be used with android:layout_height=\"wrap_content\""
            java.lang.StringBuilder r2 = r2.append(r4)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L122:
            r16 = r1
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.Class r3 = r0.getClass()
            java.lang.String r3 = r3.getSimpleName()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = " can only be used with android:layout_width=\"match_parent\" (or fill_parent)"
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    @Override // androidx.appcompat.widget.AbsActionBarView, android.view.View
    public /* bridge */ /* synthetic */ boolean onTouchEvent(android.view.MotionEvent r1) {
            r0 = this;
            boolean r1 = super.onTouchEvent(r1)
            return r1
    }

    @Override // androidx.appcompat.widget.AbsActionBarView
    public /* bridge */ /* synthetic */ void postShowOverflowMenu() {
            r0 = this;
            super.postShowOverflowMenu()
            return
    }

    @Override // androidx.appcompat.widget.AbsActionBarView
    public void setContentHeight(int r1) {
            r0 = this;
            r0.mContentHeight = r1
            return
    }

    public void setCustomView(android.view.View r2) {
            r1 = this;
            android.view.View r0 = r1.mCustomView
            if (r0 == 0) goto L9
            android.view.View r0 = r1.mCustomView
            r1.removeView(r0)
        L9:
            r1.mCustomView = r2
            if (r2 == 0) goto L19
            android.widget.LinearLayout r0 = r1.mTitleLayout
            if (r0 == 0) goto L19
            android.widget.LinearLayout r0 = r1.mTitleLayout
            r1.removeView(r0)
            r0 = 0
            r1.mTitleLayout = r0
        L19:
            if (r2 == 0) goto L1e
            r1.addView(r2)
        L1e:
            r1.requestLayout()
            return
    }

    public void setSubtitle(java.lang.CharSequence r1) {
            r0 = this;
            r0.mSubtitle = r1
            r0.initTitle()
            return
    }

    public void setTitle(java.lang.CharSequence r1) {
            r0 = this;
            r0.mTitle = r1
            r0.initTitle()
            androidx.core.view.ViewCompat.setAccessibilityPaneTitle(r0, r1)
            return
    }

    public void setTitleOptional(boolean r2) {
            r1 = this;
            boolean r0 = r1.mTitleOptional
            if (r2 == r0) goto L7
            r1.requestLayout()
        L7:
            r1.mTitleOptional = r2
            return
    }

    @Override // androidx.appcompat.widget.AbsActionBarView, android.view.View
    public /* bridge */ /* synthetic */ void setVisibility(int r1) {
            r0 = this;
            super.setVisibility(r1)
            return
    }

    @Override // androidx.appcompat.widget.AbsActionBarView
    public /* bridge */ /* synthetic */ androidx.core.view.ViewPropertyAnimatorCompat setupAnimatorToVisibility(int r1, long r2) {
            r0 = this;
            androidx.core.view.ViewPropertyAnimatorCompat r1 = super.setupAnimatorToVisibility(r1, r2)
            return r1
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // androidx.appcompat.widget.AbsActionBarView
    public boolean showOverflowMenu() {
            r1 = this;
            androidx.appcompat.widget.ActionMenuPresenter r0 = r1.mActionMenuPresenter
            if (r0 == 0) goto Lb
            androidx.appcompat.widget.ActionMenuPresenter r0 = r1.mActionMenuPresenter
            boolean r0 = r0.showOverflowMenu()
            return r0
        Lb:
            r0 = 0
            return r0
    }
}
