package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
public class ToolbarWidgetWrapper implements androidx.appcompat.widget.DecorToolbar {
    private static final int AFFECTS_LOGO_MASK = 3;
    private static final long DEFAULT_FADE_DURATION_MS = 200;
    private static final java.lang.String TAG = "ToolbarWidgetWrapper";
    private androidx.appcompat.widget.ActionMenuPresenter mActionMenuPresenter;
    private android.view.View mCustomView;
    private int mDefaultNavigationContentDescription;
    private android.graphics.drawable.Drawable mDefaultNavigationIcon;
    private int mDisplayOpts;
    private java.lang.CharSequence mHomeDescription;
    private android.graphics.drawable.Drawable mIcon;
    private android.graphics.drawable.Drawable mLogo;
    boolean mMenuPrepared;
    private android.graphics.drawable.Drawable mNavIcon;
    private int mNavigationMode;
    private android.widget.Spinner mSpinner;
    private java.lang.CharSequence mSubtitle;
    private android.view.View mTabView;
    java.lang.CharSequence mTitle;
    private boolean mTitleSet;
    androidx.appcompat.widget.Toolbar mToolbar;
    android.view.Window.Callback mWindowCallback;



    public ToolbarWidgetWrapper(androidx.appcompat.widget.Toolbar r3, boolean r4) {
            r2 = this;
            int r0 = androidx.appcompat.R.string.abc_action_bar_up_description
            int r1 = androidx.appcompat.R.drawable.abc_ic_ab_back_material
            r2.<init>(r3, r4, r0, r1)
            return
    }

    public ToolbarWidgetWrapper(androidx.appcompat.widget.Toolbar r17, boolean r18, int r19, int r20) {
            r16 = this;
            r0 = r16
            r0.<init>()
            r1 = 0
            r0.mNavigationMode = r1
            r0.mDefaultNavigationContentDescription = r1
            r2 = r17
            r0.mToolbar = r2
            java.lang.CharSequence r3 = r2.getTitle()
            r0.mTitle = r3
            java.lang.CharSequence r3 = r2.getSubtitle()
            r0.mSubtitle = r3
            java.lang.CharSequence r3 = r0.mTitle
            if (r3 == 0) goto L20
            r3 = 1
            goto L21
        L20:
            r3 = r1
        L21:
            r0.mTitleSet = r3
            android.graphics.drawable.Drawable r3 = r2.getNavigationIcon()
            r0.mNavIcon = r3
            android.content.Context r3 = r2.getContext()
            int[] r4 = androidx.appcompat.R.styleable.ActionBar
            int r5 = androidx.appcompat.R.attr.actionBarStyle
            r6 = 0
            androidx.appcompat.widget.TintTypedArray r3 = androidx.appcompat.widget.TintTypedArray.obtainStyledAttributes(r3, r6, r4, r5, r1)
            int r4 = androidx.appcompat.R.styleable.ActionBar_homeAsUpIndicator
            android.graphics.drawable.Drawable r4 = r3.getDrawable(r4)
            r0.mDefaultNavigationIcon = r4
            if (r18 == 0) goto L113
            int r4 = androidx.appcompat.R.styleable.ActionBar_title
            java.lang.CharSequence r4 = r3.getText(r4)
            boolean r5 = android.text.TextUtils.isEmpty(r4)
            if (r5 != 0) goto L4f
            r0.setTitle(r4)
        L4f:
            int r5 = androidx.appcompat.R.styleable.ActionBar_subtitle
            java.lang.CharSequence r5 = r3.getText(r5)
            boolean r6 = android.text.TextUtils.isEmpty(r5)
            if (r6 != 0) goto L5e
            r0.setSubtitle(r5)
        L5e:
            int r6 = androidx.appcompat.R.styleable.ActionBar_logo
            android.graphics.drawable.Drawable r6 = r3.getDrawable(r6)
            if (r6 == 0) goto L69
            r0.setLogo(r6)
        L69:
            int r7 = androidx.appcompat.R.styleable.ActionBar_icon
            android.graphics.drawable.Drawable r7 = r3.getDrawable(r7)
            if (r7 == 0) goto L74
            r0.setIcon(r7)
        L74:
            android.graphics.drawable.Drawable r8 = r0.mNavIcon
            if (r8 != 0) goto L81
            android.graphics.drawable.Drawable r8 = r0.mDefaultNavigationIcon
            if (r8 == 0) goto L81
            android.graphics.drawable.Drawable r8 = r0.mDefaultNavigationIcon
            r0.setNavigationIcon(r8)
        L81:
            int r8 = androidx.appcompat.R.styleable.ActionBar_displayOptions
            int r8 = r3.getInt(r8, r1)
            r0.setDisplayOptions(r8)
            int r8 = androidx.appcompat.R.styleable.ActionBar_customNavigationLayout
            int r8 = r3.getResourceId(r8, r1)
            if (r8 == 0) goto Lac
            androidx.appcompat.widget.Toolbar r9 = r0.mToolbar
            android.content.Context r9 = r9.getContext()
            android.view.LayoutInflater r9 = android.view.LayoutInflater.from(r9)
            androidx.appcompat.widget.Toolbar r10 = r0.mToolbar
            android.view.View r9 = r9.inflate(r8, r10, r1)
            r0.setCustomView(r9)
            int r9 = r0.mDisplayOpts
            r9 = r9 | 16
            r0.setDisplayOptions(r9)
        Lac:
            int r9 = androidx.appcompat.R.styleable.ActionBar_height
            int r9 = r3.getLayoutDimension(r9, r1)
            if (r9 <= 0) goto Lc1
            androidx.appcompat.widget.Toolbar r10 = r0.mToolbar
            android.view.ViewGroup$LayoutParams r10 = r10.getLayoutParams()
            r10.height = r9
            androidx.appcompat.widget.Toolbar r11 = r0.mToolbar
            r11.setLayoutParams(r10)
        Lc1:
            int r10 = androidx.appcompat.R.styleable.ActionBar_contentInsetStart
            r11 = -1
            int r10 = r3.getDimensionPixelOffset(r10, r11)
            int r12 = androidx.appcompat.R.styleable.ActionBar_contentInsetEnd
            int r11 = r3.getDimensionPixelOffset(r12, r11)
            if (r10 >= 0) goto Ld2
            if (r11 < 0) goto Ldf
        Ld2:
            androidx.appcompat.widget.Toolbar r12 = r0.mToolbar
            int r13 = java.lang.Math.max(r10, r1)
            int r14 = java.lang.Math.max(r11, r1)
            r12.setContentInsetsRelative(r13, r14)
        Ldf:
            int r12 = androidx.appcompat.R.styleable.ActionBar_titleTextStyle
            int r12 = r3.getResourceId(r12, r1)
            if (r12 == 0) goto Lf2
            androidx.appcompat.widget.Toolbar r13 = r0.mToolbar
            androidx.appcompat.widget.Toolbar r14 = r0.mToolbar
            android.content.Context r14 = r14.getContext()
            r13.setTitleTextAppearance(r14, r12)
        Lf2:
            int r13 = androidx.appcompat.R.styleable.ActionBar_subtitleTextStyle
            int r13 = r3.getResourceId(r13, r1)
            if (r13 == 0) goto L105
            androidx.appcompat.widget.Toolbar r14 = r0.mToolbar
            androidx.appcompat.widget.Toolbar r15 = r0.mToolbar
            android.content.Context r15 = r15.getContext()
            r14.setSubtitleTextAppearance(r15, r13)
        L105:
            int r14 = androidx.appcompat.R.styleable.ActionBar_popupTheme
            int r1 = r3.getResourceId(r14, r1)
            if (r1 == 0) goto L112
            androidx.appcompat.widget.Toolbar r14 = r0.mToolbar
            r14.setPopupTheme(r1)
        L112:
            goto L119
        L113:
            int r1 = r0.detectDisplayOptions()
            r0.mDisplayOpts = r1
        L119:
            r3.recycle()
            r1 = r19
            r0.setDefaultNavigationContentDescription(r1)
            androidx.appcompat.widget.Toolbar r4 = r0.mToolbar
            java.lang.CharSequence r4 = r4.getNavigationContentDescription()
            r0.mHomeDescription = r4
            androidx.appcompat.widget.Toolbar r4 = r0.mToolbar
            androidx.appcompat.widget.ToolbarWidgetWrapper$1 r5 = new androidx.appcompat.widget.ToolbarWidgetWrapper$1
            r5.<init>(r0)
            r4.setNavigationOnClickListener(r5)
            return
    }

    private int detectDisplayOptions() {
            r2 = this;
            r0 = 11
            androidx.appcompat.widget.Toolbar r1 = r2.mToolbar
            android.graphics.drawable.Drawable r1 = r1.getNavigationIcon()
            if (r1 == 0) goto L14
            r0 = r0 | 4
            androidx.appcompat.widget.Toolbar r1 = r2.mToolbar
            android.graphics.drawable.Drawable r1 = r1.getNavigationIcon()
            r2.mDefaultNavigationIcon = r1
        L14:
            return r0
    }

    private void ensureSpinner() {
            r4 = this;
            android.widget.Spinner r0 = r4.mSpinner
            if (r0 != 0) goto L20
            androidx.appcompat.widget.AppCompatSpinner r0 = new androidx.appcompat.widget.AppCompatSpinner
            android.content.Context r1 = r4.getContext()
            r2 = 0
            int r3 = androidx.appcompat.R.attr.actionDropDownStyle
            r0.<init>(r1, r2, r3)
            r4.mSpinner = r0
            androidx.appcompat.widget.Toolbar$LayoutParams r0 = new androidx.appcompat.widget.Toolbar$LayoutParams
            r1 = 8388627(0x800013, float:1.175497E-38)
            r2 = -2
            r0.<init>(r2, r2, r1)
            android.widget.Spinner r1 = r4.mSpinner
            r1.setLayoutParams(r0)
        L20:
            return
    }

    private void setTitleInt(java.lang.CharSequence r2) {
            r1 = this;
            r1.mTitle = r2
            int r0 = r1.mDisplayOpts
            r0 = r0 & 8
            if (r0 == 0) goto L1a
            androidx.appcompat.widget.Toolbar r0 = r1.mToolbar
            r0.setTitle(r2)
            boolean r0 = r1.mTitleSet
            if (r0 == 0) goto L1a
            androidx.appcompat.widget.Toolbar r0 = r1.mToolbar
            android.view.View r0 = r0.getRootView()
            androidx.core.view.ViewCompat.setAccessibilityPaneTitle(r0, r2)
        L1a:
            return
    }

    private void updateHomeAccessibility() {
            r2 = this;
            int r0 = r2.mDisplayOpts
            r0 = r0 & 4
            if (r0 == 0) goto L1d
            java.lang.CharSequence r0 = r2.mHomeDescription
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L16
            androidx.appcompat.widget.Toolbar r0 = r2.mToolbar
            int r1 = r2.mDefaultNavigationContentDescription
            r0.setNavigationContentDescription(r1)
            goto L1d
        L16:
            androidx.appcompat.widget.Toolbar r0 = r2.mToolbar
            java.lang.CharSequence r1 = r2.mHomeDescription
            r0.setNavigationContentDescription(r1)
        L1d:
            return
    }

    private void updateNavigationIcon() {
            r2 = this;
            int r0 = r2.mDisplayOpts
            r0 = r0 & 4
            if (r0 == 0) goto L15
            androidx.appcompat.widget.Toolbar r0 = r2.mToolbar
            android.graphics.drawable.Drawable r1 = r2.mNavIcon
            if (r1 == 0) goto Lf
            android.graphics.drawable.Drawable r1 = r2.mNavIcon
            goto L11
        Lf:
            android.graphics.drawable.Drawable r1 = r2.mDefaultNavigationIcon
        L11:
            r0.setNavigationIcon(r1)
            goto L1b
        L15:
            androidx.appcompat.widget.Toolbar r0 = r2.mToolbar
            r1 = 0
            r0.setNavigationIcon(r1)
        L1b:
            return
    }

    private void updateToolbarLogo() {
            r2 = this;
            r0 = 0
            int r1 = r2.mDisplayOpts
            r1 = r1 & 2
            if (r1 == 0) goto L1a
            int r1 = r2.mDisplayOpts
            r1 = r1 & 1
            if (r1 == 0) goto L18
            android.graphics.drawable.Drawable r1 = r2.mLogo
            if (r1 == 0) goto L14
            android.graphics.drawable.Drawable r1 = r2.mLogo
            goto L16
        L14:
            android.graphics.drawable.Drawable r1 = r2.mIcon
        L16:
            r0 = r1
            goto L1a
        L18:
            android.graphics.drawable.Drawable r0 = r2.mIcon
        L1a:
            androidx.appcompat.widget.Toolbar r1 = r2.mToolbar
            r1.setLogo(r0)
            return
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void animateToVisibility(int r3) {
            r2 = this;
            r0 = 200(0xc8, double:9.9E-322)
            androidx.core.view.ViewPropertyAnimatorCompat r0 = r2.setupAnimatorToVisibility(r3, r0)
            if (r0 == 0) goto Lb
            r0.start()
        Lb:
            return
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public boolean canShowOverflowMenu() {
            r1 = this;
            androidx.appcompat.widget.Toolbar r0 = r1.mToolbar
            boolean r0 = r0.canShowOverflowMenu()
            return r0
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void collapseActionView() {
            r1 = this;
            androidx.appcompat.widget.Toolbar r0 = r1.mToolbar
            r0.collapseActionView()
            return
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void dismissPopupMenus() {
            r1 = this;
            androidx.appcompat.widget.Toolbar r0 = r1.mToolbar
            r0.dismissPopupMenus()
            return
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public android.content.Context getContext() {
            r1 = this;
            androidx.appcompat.widget.Toolbar r0 = r1.mToolbar
            android.content.Context r0 = r0.getContext()
            return r0
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public android.view.View getCustomView() {
            r1 = this;
            android.view.View r0 = r1.mCustomView
            return r0
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public int getDisplayOptions() {
            r1 = this;
            int r0 = r1.mDisplayOpts
            return r0
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public int getDropdownItemCount() {
            r1 = this;
            android.widget.Spinner r0 = r1.mSpinner
            if (r0 == 0) goto Lb
            android.widget.Spinner r0 = r1.mSpinner
            int r0 = r0.getCount()
            goto Lc
        Lb:
            r0 = 0
        Lc:
            return r0
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public int getDropdownSelectedPosition() {
            r1 = this;
            android.widget.Spinner r0 = r1.mSpinner
            if (r0 == 0) goto Lb
            android.widget.Spinner r0 = r1.mSpinner
            int r0 = r0.getSelectedItemPosition()
            goto Lc
        Lb:
            r0 = 0
        Lc:
            return r0
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public int getHeight() {
            r1 = this;
            androidx.appcompat.widget.Toolbar r0 = r1.mToolbar
            int r0 = r0.getHeight()
            return r0
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public android.view.Menu getMenu() {
            r1 = this;
            androidx.appcompat.widget.Toolbar r0 = r1.mToolbar
            android.view.Menu r0 = r0.getMenu()
            return r0
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public int getNavigationMode() {
            r1 = this;
            int r0 = r1.mNavigationMode
            return r0
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public java.lang.CharSequence getSubtitle() {
            r1 = this;
            androidx.appcompat.widget.Toolbar r0 = r1.mToolbar
            java.lang.CharSequence r0 = r0.getSubtitle()
            return r0
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public java.lang.CharSequence getTitle() {
            r1 = this;
            androidx.appcompat.widget.Toolbar r0 = r1.mToolbar
            java.lang.CharSequence r0 = r0.getTitle()
            return r0
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public android.view.ViewGroup getViewGroup() {
            r1 = this;
            androidx.appcompat.widget.Toolbar r0 = r1.mToolbar
            return r0
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public int getVisibility() {
            r1 = this;
            androidx.appcompat.widget.Toolbar r0 = r1.mToolbar
            int r0 = r0.getVisibility()
            return r0
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public boolean hasEmbeddedTabs() {
            r1 = this;
            android.view.View r0 = r1.mTabView
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public boolean hasExpandedActionView() {
            r1 = this;
            androidx.appcompat.widget.Toolbar r0 = r1.mToolbar
            boolean r0 = r0.hasExpandedActionView()
            return r0
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public boolean hasIcon() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mIcon
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public boolean hasLogo() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mLogo
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public boolean hideOverflowMenu() {
            r1 = this;
            androidx.appcompat.widget.Toolbar r0 = r1.mToolbar
            boolean r0 = r0.hideOverflowMenu()
            return r0
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void initIndeterminateProgress() {
            r2 = this;
            java.lang.String r0 = "ToolbarWidgetWrapper"
            java.lang.String r1 = "Progress display unsupported"
            android.util.Log.i(r0, r1)
            return
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void initProgress() {
            r2 = this;
            java.lang.String r0 = "ToolbarWidgetWrapper"
            java.lang.String r1 = "Progress display unsupported"
            android.util.Log.i(r0, r1)
            return
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public boolean isOverflowMenuShowPending() {
            r1 = this;
            androidx.appcompat.widget.Toolbar r0 = r1.mToolbar
            boolean r0 = r0.isOverflowMenuShowPending()
            return r0
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public boolean isOverflowMenuShowing() {
            r1 = this;
            androidx.appcompat.widget.Toolbar r0 = r1.mToolbar
            boolean r0 = r0.isOverflowMenuShowing()
            return r0
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public boolean isTitleTruncated() {
            r1 = this;
            androidx.appcompat.widget.Toolbar r0 = r1.mToolbar
            boolean r0 = r0.isTitleTruncated()
            return r0
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void restoreHierarchyState(android.util.SparseArray<android.os.Parcelable> r2) {
            r1 = this;
            androidx.appcompat.widget.Toolbar r0 = r1.mToolbar
            r0.restoreHierarchyState(r2)
            return
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void saveHierarchyState(android.util.SparseArray<android.os.Parcelable> r2) {
            r1 = this;
            androidx.appcompat.widget.Toolbar r0 = r1.mToolbar
            r0.saveHierarchyState(r2)
            return
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setBackgroundDrawable(android.graphics.drawable.Drawable r2) {
            r1 = this;
            androidx.appcompat.widget.Toolbar r0 = r1.mToolbar
            r0.setBackground(r2)
            return
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setCollapsible(boolean r2) {
            r1 = this;
            androidx.appcompat.widget.Toolbar r0 = r1.mToolbar
            r0.setCollapsible(r2)
            return
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setCustomView(android.view.View r3) {
            r2 = this;
            android.view.View r0 = r2.mCustomView
            if (r0 == 0) goto L11
            int r0 = r2.mDisplayOpts
            r0 = r0 & 16
            if (r0 == 0) goto L11
            androidx.appcompat.widget.Toolbar r0 = r2.mToolbar
            android.view.View r1 = r2.mCustomView
            r0.removeView(r1)
        L11:
            r2.mCustomView = r3
            if (r3 == 0) goto L22
            int r0 = r2.mDisplayOpts
            r0 = r0 & 16
            if (r0 == 0) goto L22
            androidx.appcompat.widget.Toolbar r0 = r2.mToolbar
            android.view.View r1 = r2.mCustomView
            r0.addView(r1)
        L22:
            return
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setDefaultNavigationContentDescription(int r2) {
            r1 = this;
            int r0 = r1.mDefaultNavigationContentDescription
            if (r2 != r0) goto L5
            return
        L5:
            r1.mDefaultNavigationContentDescription = r2
            androidx.appcompat.widget.Toolbar r0 = r1.mToolbar
            java.lang.CharSequence r0 = r0.getNavigationContentDescription()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L18
            int r0 = r1.mDefaultNavigationContentDescription
            r1.setNavigationContentDescription(r0)
        L18:
            return
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setDefaultNavigationIcon(android.graphics.drawable.Drawable r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mDefaultNavigationIcon
            if (r0 == r2) goto L9
            r1.mDefaultNavigationIcon = r2
            r1.updateNavigationIcon()
        L9:
            return
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setDisplayOptions(int r5) {
            r4 = this;
            int r0 = r4.mDisplayOpts
            r1 = r0 ^ r5
            r4.mDisplayOpts = r5
            if (r1 == 0) goto L5a
            r2 = r1 & 4
            if (r2 == 0) goto L16
            r2 = r5 & 4
            if (r2 == 0) goto L13
            r4.updateHomeAccessibility()
        L13:
            r4.updateNavigationIcon()
        L16:
            r2 = r1 & 3
            if (r2 == 0) goto L1d
            r4.updateToolbarLogo()
        L1d:
            r2 = r1 & 8
            if (r2 == 0) goto L3f
            r2 = r5 & 8
            if (r2 == 0) goto L34
            androidx.appcompat.widget.Toolbar r2 = r4.mToolbar
            java.lang.CharSequence r3 = r4.mTitle
            r2.setTitle(r3)
            androidx.appcompat.widget.Toolbar r2 = r4.mToolbar
            java.lang.CharSequence r3 = r4.mSubtitle
            r2.setSubtitle(r3)
            goto L3f
        L34:
            androidx.appcompat.widget.Toolbar r2 = r4.mToolbar
            r3 = 0
            r2.setTitle(r3)
            androidx.appcompat.widget.Toolbar r2 = r4.mToolbar
            r2.setSubtitle(r3)
        L3f:
            r2 = r1 & 16
            if (r2 == 0) goto L5a
            android.view.View r2 = r4.mCustomView
            if (r2 == 0) goto L5a
            r2 = r5 & 16
            if (r2 == 0) goto L53
            androidx.appcompat.widget.Toolbar r2 = r4.mToolbar
            android.view.View r3 = r4.mCustomView
            r2.addView(r3)
            goto L5a
        L53:
            androidx.appcompat.widget.Toolbar r2 = r4.mToolbar
            android.view.View r3 = r4.mCustomView
            r2.removeView(r3)
        L5a:
            return
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setDropdownParams(android.widget.SpinnerAdapter r2, android.widget.AdapterView.OnItemSelectedListener r3) {
            r1 = this;
            r1.ensureSpinner()
            android.widget.Spinner r0 = r1.mSpinner
            r0.setAdapter(r2)
            android.widget.Spinner r0 = r1.mSpinner
            r0.setOnItemSelectedListener(r3)
            return
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setDropdownSelectedPosition(int r3) {
            r2 = this;
            android.widget.Spinner r0 = r2.mSpinner
            if (r0 == 0) goto La
            android.widget.Spinner r0 = r2.mSpinner
            r0.setSelection(r3)
            return
        La:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Can't set dropdown selected position without an adapter"
            r0.<init>(r1)
            throw r0
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setEmbeddedTabView(androidx.appcompat.widget.ScrollingTabContainerView r4) {
            r3 = this;
            android.view.View r0 = r3.mTabView
            if (r0 == 0) goto L15
            android.view.View r0 = r3.mTabView
            android.view.ViewParent r0 = r0.getParent()
            androidx.appcompat.widget.Toolbar r1 = r3.mToolbar
            if (r0 != r1) goto L15
            androidx.appcompat.widget.Toolbar r0 = r3.mToolbar
            android.view.View r1 = r3.mTabView
            r0.removeView(r1)
        L15:
            r3.mTabView = r4
            if (r4 == 0) goto L3c
            int r0 = r3.mNavigationMode
            r1 = 2
            if (r0 != r1) goto L3c
            androidx.appcompat.widget.Toolbar r0 = r3.mToolbar
            android.view.View r1 = r3.mTabView
            r2 = 0
            r0.addView(r1, r2)
            android.view.View r0 = r3.mTabView
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            androidx.appcompat.widget.Toolbar$LayoutParams r0 = (androidx.appcompat.widget.Toolbar.LayoutParams) r0
            r1 = -2
            r0.width = r1
            r0.height = r1
            r1 = 8388691(0x800053, float:1.175506E-38)
            r0.gravity = r1
            r1 = 1
            r4.setAllowCollapse(r1)
        L3c:
            return
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setHomeButtonEnabled(boolean r1) {
            r0 = this;
            return
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setIcon(int r2) {
            r1 = this;
            if (r2 == 0) goto Lb
            android.content.Context r0 = r1.getContext()
            android.graphics.drawable.Drawable r0 = androidx.appcompat.content.res.AppCompatResources.getDrawable(r0, r2)
            goto Lc
        Lb:
            r0 = 0
        Lc:
            r1.setIcon(r0)
            return
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setIcon(android.graphics.drawable.Drawable r1) {
            r0 = this;
            r0.mIcon = r1
            r0.updateToolbarLogo()
            return
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setLogo(int r2) {
            r1 = this;
            if (r2 == 0) goto Lb
            android.content.Context r0 = r1.getContext()
            android.graphics.drawable.Drawable r0 = androidx.appcompat.content.res.AppCompatResources.getDrawable(r0, r2)
            goto Lc
        Lb:
            r0 = 0
        Lc:
            r1.setLogo(r0)
            return
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setLogo(android.graphics.drawable.Drawable r1) {
            r0 = this;
            r0.mLogo = r1
            r0.updateToolbarLogo()
            return
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setMenu(android.view.Menu r4, androidx.appcompat.view.menu.MenuPresenter.Callback r5) {
            r3 = this;
            androidx.appcompat.widget.ActionMenuPresenter r0 = r3.mActionMenuPresenter
            if (r0 != 0) goto L18
            androidx.appcompat.widget.ActionMenuPresenter r0 = new androidx.appcompat.widget.ActionMenuPresenter
            androidx.appcompat.widget.Toolbar r1 = r3.mToolbar
            android.content.Context r1 = r1.getContext()
            r0.<init>(r1)
            r3.mActionMenuPresenter = r0
            androidx.appcompat.widget.ActionMenuPresenter r0 = r3.mActionMenuPresenter
            int r1 = androidx.appcompat.R.id.action_menu_presenter
            r0.setId(r1)
        L18:
            androidx.appcompat.widget.ActionMenuPresenter r0 = r3.mActionMenuPresenter
            r0.setCallback(r5)
            androidx.appcompat.widget.Toolbar r0 = r3.mToolbar
            r1 = r4
            androidx.appcompat.view.menu.MenuBuilder r1 = (androidx.appcompat.view.menu.MenuBuilder) r1
            androidx.appcompat.widget.ActionMenuPresenter r2 = r3.mActionMenuPresenter
            r0.setMenu(r1, r2)
            return
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setMenuCallbacks(androidx.appcompat.view.menu.MenuPresenter.Callback r2, androidx.appcompat.view.menu.MenuBuilder.Callback r3) {
            r1 = this;
            androidx.appcompat.widget.Toolbar r0 = r1.mToolbar
            r0.setMenuCallbacks(r2, r3)
            return
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setMenuPrepared() {
            r1 = this;
            r0 = 1
            r1.mMenuPrepared = r0
            return
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setNavigationContentDescription(int r2) {
            r1 = this;
            if (r2 != 0) goto L4
            r0 = 0
            goto Lc
        L4:
            android.content.Context r0 = r1.getContext()
            java.lang.String r0 = r0.getString(r2)
        Lc:
            r1.setNavigationContentDescription(r0)
            return
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setNavigationContentDescription(java.lang.CharSequence r1) {
            r0 = this;
            r0.mHomeDescription = r1
            r0.updateHomeAccessibility()
            return
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setNavigationIcon(int r2) {
            r1 = this;
            if (r2 == 0) goto Lb
            android.content.Context r0 = r1.getContext()
            android.graphics.drawable.Drawable r0 = androidx.appcompat.content.res.AppCompatResources.getDrawable(r0, r2)
            goto Lc
        Lb:
            r0 = 0
        Lc:
            r1.setNavigationIcon(r0)
            return
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setNavigationIcon(android.graphics.drawable.Drawable r1) {
            r0 = this;
            r0.mNavIcon = r1
            r0.updateNavigationIcon()
            return
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setNavigationMode(int r5) {
            r4 = this;
            int r0 = r4.mNavigationMode
            if (r5 == r0) goto L7c
            switch(r0) {
                case 1: goto L1e;
                case 2: goto L8;
                default: goto L7;
            }
        L7:
            goto L33
        L8:
            android.view.View r1 = r4.mTabView
            if (r1 == 0) goto L33
            android.view.View r1 = r4.mTabView
            android.view.ViewParent r1 = r1.getParent()
            androidx.appcompat.widget.Toolbar r2 = r4.mToolbar
            if (r1 != r2) goto L33
            androidx.appcompat.widget.Toolbar r1 = r4.mToolbar
            android.view.View r2 = r4.mTabView
            r1.removeView(r2)
            goto L33
        L1e:
            android.widget.Spinner r1 = r4.mSpinner
            if (r1 == 0) goto L33
            android.widget.Spinner r1 = r4.mSpinner
            android.view.ViewParent r1 = r1.getParent()
            androidx.appcompat.widget.Toolbar r2 = r4.mToolbar
            if (r1 != r2) goto L33
            androidx.appcompat.widget.Toolbar r1 = r4.mToolbar
            android.widget.Spinner r2 = r4.mSpinner
            r1.removeView(r2)
        L33:
            r4.mNavigationMode = r5
            r1 = 0
            switch(r5) {
                case 0: goto L7b;
                case 1: goto L70;
                case 2: goto L52;
                default: goto L39;
            }
        L39:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Invalid navigation mode "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r5)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L52:
            android.view.View r2 = r4.mTabView
            if (r2 == 0) goto L7c
            androidx.appcompat.widget.Toolbar r2 = r4.mToolbar
            android.view.View r3 = r4.mTabView
            r2.addView(r3, r1)
            android.view.View r1 = r4.mTabView
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$LayoutParams r1 = (androidx.appcompat.widget.Toolbar.LayoutParams) r1
            r2 = -2
            r1.width = r2
            r1.height = r2
            r2 = 8388691(0x800053, float:1.175506E-38)
            r1.gravity = r2
            goto L7c
        L70:
            r4.ensureSpinner()
            androidx.appcompat.widget.Toolbar r2 = r4.mToolbar
            android.widget.Spinner r3 = r4.mSpinner
            r2.addView(r3, r1)
            goto L7c
        L7b:
        L7c:
            return
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setSubtitle(java.lang.CharSequence r2) {
            r1 = this;
            r1.mSubtitle = r2
            int r0 = r1.mDisplayOpts
            r0 = r0 & 8
            if (r0 == 0) goto Ld
            androidx.appcompat.widget.Toolbar r0 = r1.mToolbar
            r0.setSubtitle(r2)
        Ld:
            return
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setTitle(java.lang.CharSequence r2) {
            r1 = this;
            r0 = 1
            r1.mTitleSet = r0
            r1.setTitleInt(r2)
            return
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setVisibility(int r2) {
            r1 = this;
            androidx.appcompat.widget.Toolbar r0 = r1.mToolbar
            r0.setVisibility(r2)
            return
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setWindowCallback(android.view.Window.Callback r1) {
            r0 = this;
            r0.mWindowCallback = r1
            return
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public void setWindowTitle(java.lang.CharSequence r2) {
            r1 = this;
            boolean r0 = r1.mTitleSet
            if (r0 != 0) goto L7
            r1.setTitleInt(r2)
        L7:
            return
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public androidx.core.view.ViewPropertyAnimatorCompat setupAnimatorToVisibility(int r3, long r4) {
            r2 = this;
            androidx.appcompat.widget.Toolbar r0 = r2.mToolbar
            androidx.core.view.ViewPropertyAnimatorCompat r0 = androidx.core.view.ViewCompat.animate(r0)
            if (r3 != 0) goto Lb
            r1 = 1065353216(0x3f800000, float:1.0)
            goto Lc
        Lb:
            r1 = 0
        Lc:
            androidx.core.view.ViewPropertyAnimatorCompat r0 = r0.alpha(r1)
            androidx.core.view.ViewPropertyAnimatorCompat r0 = r0.setDuration(r4)
            androidx.appcompat.widget.ToolbarWidgetWrapper$2 r1 = new androidx.appcompat.widget.ToolbarWidgetWrapper$2
            r1.<init>(r2, r3)
            androidx.core.view.ViewPropertyAnimatorCompat r0 = r0.setListener(r1)
            return r0
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public boolean showOverflowMenu() {
            r1 = this;
            androidx.appcompat.widget.Toolbar r0 = r1.mToolbar
            boolean r0 = r0.showOverflowMenu()
            return r0
    }
}
