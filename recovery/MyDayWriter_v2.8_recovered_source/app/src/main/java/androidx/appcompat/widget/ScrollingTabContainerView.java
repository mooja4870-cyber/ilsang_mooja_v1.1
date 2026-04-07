package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
public class ScrollingTabContainerView extends android.widget.HorizontalScrollView implements android.widget.AdapterView.OnItemSelectedListener {
    private static final int FADE_DURATION = 200;
    private static final java.lang.String TAG = "ScrollingTabContainerView";
    private static final android.view.animation.Interpolator sAlphaInterpolator = null;
    private boolean mAllowCollapse;
    private int mContentHeight;
    int mMaxTabWidth;
    private int mSelectedTabIndex;
    int mStackedTabMaxWidth;
    private androidx.appcompat.widget.ScrollingTabContainerView.TabClickListener mTabClickListener;
    androidx.appcompat.widget.LinearLayoutCompat mTabLayout;
    java.lang.Runnable mTabSelector;
    private android.widget.Spinner mTabSpinner;
    protected final androidx.appcompat.widget.ScrollingTabContainerView.VisibilityAnimListener mVisAnimListener;
    protected android.view.ViewPropertyAnimator mVisibilityAnim;


    private class TabAdapter extends android.widget.BaseAdapter {
        final /* synthetic */ androidx.appcompat.widget.ScrollingTabContainerView this$0;

        TabAdapter(androidx.appcompat.widget.ScrollingTabContainerView r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // android.widget.Adapter
        public int getCount() {
                r1 = this;
                androidx.appcompat.widget.ScrollingTabContainerView r0 = r1.this$0
                androidx.appcompat.widget.LinearLayoutCompat r0 = r0.mTabLayout
                int r0 = r0.getChildCount()
                return r0
        }

        @Override // android.widget.Adapter
        public java.lang.Object getItem(int r2) {
                r1 = this;
                androidx.appcompat.widget.ScrollingTabContainerView r0 = r1.this$0
                androidx.appcompat.widget.LinearLayoutCompat r0 = r0.mTabLayout
                android.view.View r0 = r0.getChildAt(r2)
                androidx.appcompat.widget.ScrollingTabContainerView$TabView r0 = (androidx.appcompat.widget.ScrollingTabContainerView.TabView) r0
                androidx.appcompat.app.ActionBar$Tab r0 = r0.getTab()
                return r0
        }

        @Override // android.widget.Adapter
        public long getItemId(int r3) {
                r2 = this;
                long r0 = (long) r3
                return r0
        }

        @Override // android.widget.Adapter
        public android.view.View getView(int r4, android.view.View r5, android.view.ViewGroup r6) {
                r3 = this;
                if (r5 != 0) goto L10
                androidx.appcompat.widget.ScrollingTabContainerView r0 = r3.this$0
                java.lang.Object r1 = r3.getItem(r4)
                androidx.appcompat.app.ActionBar$Tab r1 = (androidx.appcompat.app.ActionBar.Tab) r1
                r2 = 1
                androidx.appcompat.widget.ScrollingTabContainerView$TabView r5 = r0.createTabView(r1, r2)
                goto L1c
            L10:
                r0 = r5
                androidx.appcompat.widget.ScrollingTabContainerView$TabView r0 = (androidx.appcompat.widget.ScrollingTabContainerView.TabView) r0
                java.lang.Object r1 = r3.getItem(r4)
                androidx.appcompat.app.ActionBar$Tab r1 = (androidx.appcompat.app.ActionBar.Tab) r1
                r0.bindTab(r1)
            L1c:
                return r5
        }
    }

    private class TabClickListener implements android.view.View.OnClickListener {
        final /* synthetic */ androidx.appcompat.widget.ScrollingTabContainerView this$0;

        TabClickListener(androidx.appcompat.widget.ScrollingTabContainerView r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r6) {
                r5 = this;
                r0 = r6
                androidx.appcompat.widget.ScrollingTabContainerView$TabView r0 = (androidx.appcompat.widget.ScrollingTabContainerView.TabView) r0
                androidx.appcompat.app.ActionBar$Tab r1 = r0.getTab()
                r1.select()
                androidx.appcompat.widget.ScrollingTabContainerView r1 = r5.this$0
                androidx.appcompat.widget.LinearLayoutCompat r1 = r1.mTabLayout
                int r1 = r1.getChildCount()
                r2 = 0
            L13:
                if (r2 >= r1) goto L28
                androidx.appcompat.widget.ScrollingTabContainerView r3 = r5.this$0
                androidx.appcompat.widget.LinearLayoutCompat r3 = r3.mTabLayout
                android.view.View r3 = r3.getChildAt(r2)
                if (r3 != r6) goto L21
                r4 = 1
                goto L22
            L21:
                r4 = 0
            L22:
                r3.setSelected(r4)
                int r2 = r2 + 1
                goto L13
            L28:
                return
        }
    }

    private class TabView extends android.widget.LinearLayout {
        private static final java.lang.String ACCESSIBILITY_CLASS_NAME = "androidx.appcompat.app.ActionBar$Tab";
        private final int[] BG_ATTRS;
        private android.view.View mCustomView;
        private android.widget.ImageView mIconView;
        private androidx.appcompat.app.ActionBar.Tab mTab;
        private android.widget.TextView mTextView;
        final /* synthetic */ androidx.appcompat.widget.ScrollingTabContainerView this$0;

        public TabView(androidx.appcompat.widget.ScrollingTabContainerView r4, android.content.Context r5, androidx.appcompat.app.ActionBar.Tab r6, boolean r7) {
                r3 = this;
                r3.this$0 = r4
                int r4 = androidx.appcompat.R.attr.actionBarTabStyle
                r0 = 0
                r3.<init>(r5, r0, r4)
                r4 = 16842964(0x10100d4, float:2.3694152E-38)
                int[] r4 = new int[]{r4}
                r3.BG_ATTRS = r4
                r3.mTab = r6
                int[] r4 = r3.BG_ATTRS
                int r1 = androidx.appcompat.R.attr.actionBarTabStyle
                r2 = 0
                androidx.appcompat.widget.TintTypedArray r4 = androidx.appcompat.widget.TintTypedArray.obtainStyledAttributes(r5, r0, r4, r1, r2)
                boolean r0 = r4.hasValue(r2)
                if (r0 == 0) goto L29
                android.graphics.drawable.Drawable r0 = r4.getDrawable(r2)
                r3.setBackgroundDrawable(r0)
            L29:
                r4.recycle()
                if (r7 == 0) goto L34
                r0 = 8388627(0x800013, float:1.175497E-38)
                r3.setGravity(r0)
            L34:
                r3.update()
                return
        }

        public void bindTab(androidx.appcompat.app.ActionBar.Tab r1) {
                r0 = this;
                r0.mTab = r1
                r0.update()
                return
        }

        public androidx.appcompat.app.ActionBar.Tab getTab() {
                r1 = this;
                androidx.appcompat.app.ActionBar$Tab r0 = r1.mTab
                return r0
        }

        @Override // android.view.View
        public void onInitializeAccessibilityEvent(android.view.accessibility.AccessibilityEvent r2) {
                r1 = this;
                super.onInitializeAccessibilityEvent(r2)
                java.lang.String r0 = "androidx.appcompat.app.ActionBar$Tab"
                r2.setClassName(r0)
                return
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo r2) {
                r1 = this;
                super.onInitializeAccessibilityNodeInfo(r2)
                java.lang.String r0 = "androidx.appcompat.app.ActionBar$Tab"
                r2.setClassName(r0)
                return
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int r3, int r4) {
                r2 = this;
                super.onMeasure(r3, r4)
                androidx.appcompat.widget.ScrollingTabContainerView r0 = r2.this$0
                int r0 = r0.mMaxTabWidth
                if (r0 <= 0) goto L20
                int r0 = r2.getMeasuredWidth()
                androidx.appcompat.widget.ScrollingTabContainerView r1 = r2.this$0
                int r1 = r1.mMaxTabWidth
                if (r0 <= r1) goto L20
                androidx.appcompat.widget.ScrollingTabContainerView r0 = r2.this$0
                int r0 = r0.mMaxTabWidth
                r1 = 1073741824(0x40000000, float:2.0)
                int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r1)
                super.onMeasure(r0, r4)
            L20:
                return
        }

        @Override // android.view.View
        public void setSelected(boolean r3) {
                r2 = this;
                boolean r0 = r2.isSelected()
                if (r0 == r3) goto L8
                r0 = 1
                goto L9
            L8:
                r0 = 0
            L9:
                super.setSelected(r3)
                if (r0 == 0) goto L14
                if (r3 == 0) goto L14
                r1 = 4
                r2.sendAccessibilityEvent(r1)
            L14:
                return
        }

        public void update() {
                r12 = this;
                androidx.appcompat.app.ActionBar$Tab r0 = r12.mTab
                android.view.View r1 = r0.getCustomView()
                r2 = 8
                r3 = 0
                if (r1 == 0) goto L37
                android.view.ViewParent r4 = r1.getParent()
                if (r4 == r12) goto L1c
                if (r4 == 0) goto L19
                r5 = r4
                android.view.ViewGroup r5 = (android.view.ViewGroup) r5
                r5.removeView(r1)
            L19:
                r12.addView(r1)
            L1c:
                r12.mCustomView = r1
                android.widget.TextView r5 = r12.mTextView
                if (r5 == 0) goto L27
                android.widget.TextView r5 = r12.mTextView
                r5.setVisibility(r2)
            L27:
                android.widget.ImageView r5 = r12.mIconView
                if (r5 == 0) goto L35
                android.widget.ImageView r5 = r12.mIconView
                r5.setVisibility(r2)
                android.widget.ImageView r2 = r12.mIconView
                r2.setImageDrawable(r3)
            L35:
                goto Le0
            L37:
                android.view.View r4 = r12.mCustomView
                if (r4 == 0) goto L42
                android.view.View r4 = r12.mCustomView
                r12.removeView(r4)
                r12.mCustomView = r3
            L42:
                android.graphics.drawable.Drawable r4 = r0.getIcon()
                java.lang.CharSequence r5 = r0.getText()
                r6 = 16
                r7 = 0
                r8 = -2
                if (r4 == 0) goto L77
                android.widget.ImageView r9 = r12.mIconView
                if (r9 != 0) goto L6c
                androidx.appcompat.widget.AppCompatImageView r9 = new androidx.appcompat.widget.AppCompatImageView
                android.content.Context r10 = r12.getContext()
                r9.<init>(r10)
                android.widget.LinearLayout$LayoutParams r10 = new android.widget.LinearLayout$LayoutParams
                r10.<init>(r8, r8)
                r10.gravity = r6
                r9.setLayoutParams(r10)
                r12.addView(r9, r7)
                r12.mIconView = r9
            L6c:
                android.widget.ImageView r9 = r12.mIconView
                r9.setImageDrawable(r4)
                android.widget.ImageView r9 = r12.mIconView
                r9.setVisibility(r7)
                goto L85
            L77:
                android.widget.ImageView r9 = r12.mIconView
                if (r9 == 0) goto L85
                android.widget.ImageView r9 = r12.mIconView
                r9.setVisibility(r2)
                android.widget.ImageView r9 = r12.mIconView
                r9.setImageDrawable(r3)
            L85:
                boolean r9 = android.text.TextUtils.isEmpty(r5)
                r9 = r9 ^ 1
                if (r9 == 0) goto Lbb
                android.widget.TextView r2 = r12.mTextView
                if (r2 != 0) goto Lb0
                androidx.appcompat.widget.AppCompatTextView r2 = new androidx.appcompat.widget.AppCompatTextView
                android.content.Context r10 = r12.getContext()
                int r11 = androidx.appcompat.R.attr.actionBarTabTextStyle
                r2.<init>(r10, r3, r11)
                android.text.TextUtils$TruncateAt r10 = android.text.TextUtils.TruncateAt.END
                r2.setEllipsize(r10)
                android.widget.LinearLayout$LayoutParams r10 = new android.widget.LinearLayout$LayoutParams
                r10.<init>(r8, r8)
                r10.gravity = r6
                r2.setLayoutParams(r10)
                r12.addView(r2)
                r12.mTextView = r2
            Lb0:
                android.widget.TextView r2 = r12.mTextView
                r2.setText(r5)
                android.widget.TextView r2 = r12.mTextView
                r2.setVisibility(r7)
                goto Lc9
            Lbb:
                android.widget.TextView r6 = r12.mTextView
                if (r6 == 0) goto Lc9
                android.widget.TextView r6 = r12.mTextView
                r6.setVisibility(r2)
                android.widget.TextView r2 = r12.mTextView
                r2.setText(r3)
            Lc9:
                android.widget.ImageView r2 = r12.mIconView
                if (r2 == 0) goto Ld6
                android.widget.ImageView r2 = r12.mIconView
                java.lang.CharSequence r6 = r0.getContentDescription()
                r2.setContentDescription(r6)
            Ld6:
                if (r9 == 0) goto Ld9
                goto Ldd
            Ld9:
                java.lang.CharSequence r3 = r0.getContentDescription()
            Ldd:
                androidx.appcompat.widget.TooltipCompat.setTooltipText(r12, r3)
            Le0:
                return
        }
    }

    protected class VisibilityAnimListener extends android.animation.AnimatorListenerAdapter {
        private boolean mCanceled;
        private int mFinalVisibility;
        final /* synthetic */ androidx.appcompat.widget.ScrollingTabContainerView this$0;

        protected VisibilityAnimListener(androidx.appcompat.widget.ScrollingTabContainerView r2) {
                r1 = this;
                r1.this$0 = r2
                r1.<init>()
                r0 = 0
                r1.mCanceled = r0
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(android.animation.Animator r2) {
                r1 = this;
                r0 = 1
                r1.mCanceled = r0
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator r3) {
                r2 = this;
                boolean r0 = r2.mCanceled
                if (r0 == 0) goto L5
                return
            L5:
                androidx.appcompat.widget.ScrollingTabContainerView r0 = r2.this$0
                r1 = 0
                r0.mVisibilityAnim = r1
                androidx.appcompat.widget.ScrollingTabContainerView r0 = r2.this$0
                int r1 = r2.mFinalVisibility
                r0.setVisibility(r1)
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(android.animation.Animator r3) {
                r2 = this;
                androidx.appcompat.widget.ScrollingTabContainerView r0 = r2.this$0
                r1 = 0
                r0.setVisibility(r1)
                r2.mCanceled = r1
                return
        }

        public androidx.appcompat.widget.ScrollingTabContainerView.VisibilityAnimListener withFinalVisibility(android.view.ViewPropertyAnimator r2, int r3) {
                r1 = this;
                r1.mFinalVisibility = r3
                androidx.appcompat.widget.ScrollingTabContainerView r0 = r1.this$0
                r0.mVisibilityAnim = r2
                return r1
        }
    }

    static {
            android.view.animation.DecelerateInterpolator r0 = new android.view.animation.DecelerateInterpolator
            r0.<init>()
            androidx.appcompat.widget.ScrollingTabContainerView.sAlphaInterpolator = r0
            return
    }

    public ScrollingTabContainerView(android.content.Context r6) {
            r5 = this;
            r5.<init>(r6)
            androidx.appcompat.widget.ScrollingTabContainerView$VisibilityAnimListener r0 = new androidx.appcompat.widget.ScrollingTabContainerView$VisibilityAnimListener
            r0.<init>(r5)
            r5.mVisAnimListener = r0
            r0 = 0
            r5.setHorizontalScrollBarEnabled(r0)
            androidx.appcompat.view.ActionBarPolicy r0 = androidx.appcompat.view.ActionBarPolicy.get(r6)
            int r1 = r0.getTabContainerHeight()
            r5.setContentHeight(r1)
            int r1 = r0.getStackedTabMaxWidth()
            r5.mStackedTabMaxWidth = r1
            androidx.appcompat.widget.LinearLayoutCompat r1 = r5.createTabLayout()
            r5.mTabLayout = r1
            androidx.appcompat.widget.LinearLayoutCompat r1 = r5.mTabLayout
            android.view.ViewGroup$LayoutParams r2 = new android.view.ViewGroup$LayoutParams
            r3 = -2
            r4 = -1
            r2.<init>(r3, r4)
            r5.addView(r1, r2)
            return
    }

    private android.widget.Spinner createSpinner() {
            r4 = this;
            androidx.appcompat.widget.AppCompatSpinner r0 = new androidx.appcompat.widget.AppCompatSpinner
            android.content.Context r1 = r4.getContext()
            r2 = 0
            int r3 = androidx.appcompat.R.attr.actionDropDownStyle
            r0.<init>(r1, r2, r3)
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r1 = new androidx.appcompat.widget.LinearLayoutCompat$LayoutParams
            r2 = -2
            r3 = -1
            r1.<init>(r2, r3)
            r0.setLayoutParams(r1)
            r0.setOnItemSelectedListener(r4)
            return r0
    }

    private androidx.appcompat.widget.LinearLayoutCompat createTabLayout() {
            r4 = this;
            androidx.appcompat.widget.LinearLayoutCompat r0 = new androidx.appcompat.widget.LinearLayoutCompat
            android.content.Context r1 = r4.getContext()
            r2 = 0
            int r3 = androidx.appcompat.R.attr.actionBarTabBarStyle
            r0.<init>(r1, r2, r3)
            r1 = 1
            r0.setMeasureWithLargestChildEnabled(r1)
            r1 = 17
            r0.setGravity(r1)
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r1 = new androidx.appcompat.widget.LinearLayoutCompat$LayoutParams
            r2 = -2
            r3 = -1
            r1.<init>(r2, r3)
            r0.setLayoutParams(r1)
            return r0
    }

    private boolean isCollapsed() {
            r1 = this;
            android.widget.Spinner r0 = r1.mTabSpinner
            if (r0 == 0) goto Le
            android.widget.Spinner r0 = r1.mTabSpinner
            android.view.ViewParent r0 = r0.getParent()
            if (r0 != r1) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    private void performCollapse() {
            r4 = this;
            boolean r0 = r4.isCollapsed()
            if (r0 == 0) goto L7
            return
        L7:
            android.widget.Spinner r0 = r4.mTabSpinner
            if (r0 != 0) goto L11
            android.widget.Spinner r0 = r4.createSpinner()
            r4.mTabSpinner = r0
        L11:
            androidx.appcompat.widget.LinearLayoutCompat r0 = r4.mTabLayout
            r4.removeView(r0)
            android.widget.Spinner r0 = r4.mTabSpinner
            android.view.ViewGroup$LayoutParams r1 = new android.view.ViewGroup$LayoutParams
            r2 = -2
            r3 = -1
            r1.<init>(r2, r3)
            r4.addView(r0, r1)
            android.widget.Spinner r0 = r4.mTabSpinner
            android.widget.SpinnerAdapter r0 = r0.getAdapter()
            if (r0 != 0) goto L34
            android.widget.Spinner r0 = r4.mTabSpinner
            androidx.appcompat.widget.ScrollingTabContainerView$TabAdapter r1 = new androidx.appcompat.widget.ScrollingTabContainerView$TabAdapter
            r1.<init>(r4)
            r0.setAdapter(r1)
        L34:
            java.lang.Runnable r0 = r4.mTabSelector
            if (r0 == 0) goto L40
            java.lang.Runnable r0 = r4.mTabSelector
            r4.removeCallbacks(r0)
            r0 = 0
            r4.mTabSelector = r0
        L40:
            android.widget.Spinner r0 = r4.mTabSpinner
            int r1 = r4.mSelectedTabIndex
            r0.setSelection(r1)
            return
    }

    private boolean performExpand() {
            r5 = this;
            boolean r0 = r5.isCollapsed()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            android.widget.Spinner r0 = r5.mTabSpinner
            r5.removeView(r0)
            androidx.appcompat.widget.LinearLayoutCompat r0 = r5.mTabLayout
            android.view.ViewGroup$LayoutParams r2 = new android.view.ViewGroup$LayoutParams
            r3 = -2
            r4 = -1
            r2.<init>(r3, r4)
            r5.addView(r0, r2)
            android.widget.Spinner r0 = r5.mTabSpinner
            int r0 = r0.getSelectedItemPosition()
            r5.setTabSelected(r0)
            return r1
    }

    public void addTab(androidx.appcompat.app.ActionBar.Tab r7, int r8, boolean r9) {
            r6 = this;
            r0 = 0
            androidx.appcompat.widget.ScrollingTabContainerView$TabView r1 = r6.createTabView(r7, r0)
            androidx.appcompat.widget.LinearLayoutCompat r2 = r6.mTabLayout
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r3 = new androidx.appcompat.widget.LinearLayoutCompat$LayoutParams
            r4 = -1
            r5 = 1065353216(0x3f800000, float:1.0)
            r3.<init>(r0, r4, r5)
            r2.addView(r1, r8, r3)
            android.widget.Spinner r0 = r6.mTabSpinner
            if (r0 == 0) goto L21
            android.widget.Spinner r0 = r6.mTabSpinner
            android.widget.SpinnerAdapter r0 = r0.getAdapter()
            androidx.appcompat.widget.ScrollingTabContainerView$TabAdapter r0 = (androidx.appcompat.widget.ScrollingTabContainerView.TabAdapter) r0
            r0.notifyDataSetChanged()
        L21:
            if (r9 == 0) goto L27
            r0 = 1
            r1.setSelected(r0)
        L27:
            boolean r0 = r6.mAllowCollapse
            if (r0 == 0) goto L2e
            r6.requestLayout()
        L2e:
            return
    }

    public void addTab(androidx.appcompat.app.ActionBar.Tab r7, boolean r8) {
            r6 = this;
            r0 = 0
            androidx.appcompat.widget.ScrollingTabContainerView$TabView r1 = r6.createTabView(r7, r0)
            androidx.appcompat.widget.LinearLayoutCompat r2 = r6.mTabLayout
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r3 = new androidx.appcompat.widget.LinearLayoutCompat$LayoutParams
            r4 = -1
            r5 = 1065353216(0x3f800000, float:1.0)
            r3.<init>(r0, r4, r5)
            r2.addView(r1, r3)
            android.widget.Spinner r0 = r6.mTabSpinner
            if (r0 == 0) goto L21
            android.widget.Spinner r0 = r6.mTabSpinner
            android.widget.SpinnerAdapter r0 = r0.getAdapter()
            androidx.appcompat.widget.ScrollingTabContainerView$TabAdapter r0 = (androidx.appcompat.widget.ScrollingTabContainerView.TabAdapter) r0
            r0.notifyDataSetChanged()
        L21:
            if (r8 == 0) goto L27
            r0 = 1
            r1.setSelected(r0)
        L27:
            boolean r0 = r6.mAllowCollapse
            if (r0 == 0) goto L2e
            r6.requestLayout()
        L2e:
            return
    }

    public void animateToTab(int r3) {
            r2 = this;
            androidx.appcompat.widget.LinearLayoutCompat r0 = r2.mTabLayout
            android.view.View r0 = r0.getChildAt(r3)
            java.lang.Runnable r1 = r2.mTabSelector
            if (r1 == 0) goto Lf
            java.lang.Runnable r1 = r2.mTabSelector
            r2.removeCallbacks(r1)
        Lf:
            androidx.appcompat.widget.ScrollingTabContainerView$1 r1 = new androidx.appcompat.widget.ScrollingTabContainerView$1
            r1.<init>(r2, r0)
            r2.mTabSelector = r1
            java.lang.Runnable r1 = r2.mTabSelector
            r2.post(r1)
            return
    }

    public void animateToVisibility(int r5) {
            r4 = this;
            android.view.ViewPropertyAnimator r0 = r4.mVisibilityAnim
            if (r0 == 0) goto L9
            android.view.ViewPropertyAnimator r0 = r4.mVisibilityAnim
            r0.cancel()
        L9:
            r0 = 200(0xc8, double:9.9E-322)
            r2 = 0
            if (r5 != 0) goto L36
            int r3 = r4.getVisibility()
            if (r3 == 0) goto L17
            r4.setAlpha(r2)
        L17:
            android.view.ViewPropertyAnimator r2 = r4.animate()
            r3 = 1065353216(0x3f800000, float:1.0)
            android.view.ViewPropertyAnimator r2 = r2.alpha(r3)
            r2.setDuration(r0)
            android.view.animation.Interpolator r0 = androidx.appcompat.widget.ScrollingTabContainerView.sAlphaInterpolator
            r2.setInterpolator(r0)
            androidx.appcompat.widget.ScrollingTabContainerView$VisibilityAnimListener r0 = r4.mVisAnimListener
            androidx.appcompat.widget.ScrollingTabContainerView$VisibilityAnimListener r0 = r0.withFinalVisibility(r2, r5)
            r2.setListener(r0)
            r2.start()
            goto L52
        L36:
            android.view.ViewPropertyAnimator r3 = r4.animate()
            android.view.ViewPropertyAnimator r2 = r3.alpha(r2)
            r2.setDuration(r0)
            android.view.animation.Interpolator r0 = androidx.appcompat.widget.ScrollingTabContainerView.sAlphaInterpolator
            r2.setInterpolator(r0)
            androidx.appcompat.widget.ScrollingTabContainerView$VisibilityAnimListener r0 = r4.mVisAnimListener
            androidx.appcompat.widget.ScrollingTabContainerView$VisibilityAnimListener r0 = r0.withFinalVisibility(r2, r5)
            r2.setListener(r0)
            r2.start()
        L52:
            return
    }

    androidx.appcompat.widget.ScrollingTabContainerView.TabView createTabView(androidx.appcompat.app.ActionBar.Tab r5, boolean r6) {
            r4 = this;
            androidx.appcompat.widget.ScrollingTabContainerView$TabView r0 = new androidx.appcompat.widget.ScrollingTabContainerView$TabView
            android.content.Context r1 = r4.getContext()
            r0.<init>(r4, r1, r5, r6)
            if (r6 == 0) goto L1b
            r1 = 0
            r0.setBackgroundDrawable(r1)
            android.widget.AbsListView$LayoutParams r1 = new android.widget.AbsListView$LayoutParams
            r2 = -1
            int r3 = r4.mContentHeight
            r1.<init>(r2, r3)
            r0.setLayoutParams(r1)
            goto L2f
        L1b:
            r1 = 1
            r0.setFocusable(r1)
            androidx.appcompat.widget.ScrollingTabContainerView$TabClickListener r1 = r4.mTabClickListener
            if (r1 != 0) goto L2a
            androidx.appcompat.widget.ScrollingTabContainerView$TabClickListener r1 = new androidx.appcompat.widget.ScrollingTabContainerView$TabClickListener
            r1.<init>(r4)
            r4.mTabClickListener = r1
        L2a:
            androidx.appcompat.widget.ScrollingTabContainerView$TabClickListener r1 = r4.mTabClickListener
            r0.setOnClickListener(r1)
        L2f:
            return r0
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
            r1 = this;
            super.onAttachedToWindow()
            java.lang.Runnable r0 = r1.mTabSelector
            if (r0 == 0) goto Lc
            java.lang.Runnable r0 = r1.mTabSelector
            r1.post(r0)
        Lc:
            return
    }

    @Override // android.view.View
    protected void onConfigurationChanged(android.content.res.Configuration r3) {
            r2 = this;
            super.onConfigurationChanged(r3)
            android.content.Context r0 = r2.getContext()
            androidx.appcompat.view.ActionBarPolicy r0 = androidx.appcompat.view.ActionBarPolicy.get(r0)
            int r1 = r0.getTabContainerHeight()
            r2.setContentHeight(r1)
            int r1 = r0.getStackedTabMaxWidth()
            r2.mStackedTabMaxWidth = r1
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
            r1 = this;
            super.onDetachedFromWindow()
            java.lang.Runnable r0 = r1.mTabSelector
            if (r0 == 0) goto Lc
            java.lang.Runnable r0 = r1.mTabSelector
            r1.removeCallbacks(r0)
        Lc:
            return
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(android.widget.AdapterView<?> r3, android.view.View r4, int r5, long r6) {
            r2 = this;
            r0 = r4
            androidx.appcompat.widget.ScrollingTabContainerView$TabView r0 = (androidx.appcompat.widget.ScrollingTabContainerView.TabView) r0
            androidx.appcompat.app.ActionBar$Tab r1 = r0.getTab()
            r1.select()
            return
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int r9, int r10) {
            r8 = this;
            int r0 = android.view.View.MeasureSpec.getMode(r9)
            r1 = 1
            r2 = 0
            r3 = 1073741824(0x40000000, float:2.0)
            if (r0 != r3) goto Lc
            r4 = r1
            goto Ld
        Lc:
            r4 = r2
        Ld:
            r8.setFillViewport(r4)
            androidx.appcompat.widget.LinearLayoutCompat r5 = r8.mTabLayout
            int r5 = r5.getChildCount()
            if (r5 <= r1) goto L40
            if (r0 == r3) goto L1e
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != r6) goto L40
        L1e:
            r6 = 2
            if (r5 <= r6) goto L2e
            int r6 = android.view.View.MeasureSpec.getSize(r9)
            float r6 = (float) r6
            r7 = 1053609165(0x3ecccccd, float:0.4)
            float r6 = r6 * r7
            int r6 = (int) r6
            r8.mMaxTabWidth = r6
            goto L35
        L2e:
            int r7 = android.view.View.MeasureSpec.getSize(r9)
            int r7 = r7 / r6
            r8.mMaxTabWidth = r7
        L35:
            int r6 = r8.mMaxTabWidth
            int r7 = r8.mStackedTabMaxWidth
            int r6 = java.lang.Math.min(r6, r7)
            r8.mMaxTabWidth = r6
            goto L43
        L40:
            r6 = -1
            r8.mMaxTabWidth = r6
        L43:
            int r6 = r8.mContentHeight
            int r10 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r3)
            if (r4 != 0) goto L50
            boolean r3 = r8.mAllowCollapse
            if (r3 == 0) goto L50
            goto L51
        L50:
            r1 = r2
        L51:
            if (r1 == 0) goto L6c
            androidx.appcompat.widget.LinearLayoutCompat r3 = r8.mTabLayout
            r3.measure(r2, r10)
            androidx.appcompat.widget.LinearLayoutCompat r2 = r8.mTabLayout
            int r2 = r2.getMeasuredWidth()
            int r3 = android.view.View.MeasureSpec.getSize(r9)
            if (r2 <= r3) goto L68
            r8.performCollapse()
            goto L6f
        L68:
            r8.performExpand()
            goto L6f
        L6c:
            r8.performExpand()
        L6f:
            int r2 = r8.getMeasuredWidth()
            super.onMeasure(r9, r10)
            int r3 = r8.getMeasuredWidth()
            if (r4 == 0) goto L83
            if (r2 == r3) goto L83
            int r6 = r8.mSelectedTabIndex
            r8.setTabSelected(r6)
        L83:
            return
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(android.widget.AdapterView<?> r1) {
            r0 = this;
            return
    }

    public void removeAllTabs() {
            r1 = this;
            androidx.appcompat.widget.LinearLayoutCompat r0 = r1.mTabLayout
            r0.removeAllViews()
            android.widget.Spinner r0 = r1.mTabSpinner
            if (r0 == 0) goto L14
            android.widget.Spinner r0 = r1.mTabSpinner
            android.widget.SpinnerAdapter r0 = r0.getAdapter()
            androidx.appcompat.widget.ScrollingTabContainerView$TabAdapter r0 = (androidx.appcompat.widget.ScrollingTabContainerView.TabAdapter) r0
            r0.notifyDataSetChanged()
        L14:
            boolean r0 = r1.mAllowCollapse
            if (r0 == 0) goto L1b
            r1.requestLayout()
        L1b:
            return
    }

    public void removeTabAt(int r2) {
            r1 = this;
            androidx.appcompat.widget.LinearLayoutCompat r0 = r1.mTabLayout
            r0.removeViewAt(r2)
            android.widget.Spinner r0 = r1.mTabSpinner
            if (r0 == 0) goto L14
            android.widget.Spinner r0 = r1.mTabSpinner
            android.widget.SpinnerAdapter r0 = r0.getAdapter()
            androidx.appcompat.widget.ScrollingTabContainerView$TabAdapter r0 = (androidx.appcompat.widget.ScrollingTabContainerView.TabAdapter) r0
            r0.notifyDataSetChanged()
        L14:
            boolean r0 = r1.mAllowCollapse
            if (r0 == 0) goto L1b
            r1.requestLayout()
        L1b:
            return
    }

    public void setAllowCollapse(boolean r1) {
            r0 = this;
            r0.mAllowCollapse = r1
            return
    }

    public void setContentHeight(int r1) {
            r0 = this;
            r0.mContentHeight = r1
            r0.requestLayout()
            return
    }

    public void setTabSelected(int r5) {
            r4 = this;
            r4.mSelectedTabIndex = r5
            androidx.appcompat.widget.LinearLayoutCompat r0 = r4.mTabLayout
            int r0 = r0.getChildCount()
            r1 = 0
        L9:
            if (r1 >= r0) goto L21
            androidx.appcompat.widget.LinearLayoutCompat r2 = r4.mTabLayout
            android.view.View r2 = r2.getChildAt(r1)
            if (r1 != r5) goto L15
            r3 = 1
            goto L16
        L15:
            r3 = 0
        L16:
            r2.setSelected(r3)
            if (r3 == 0) goto L1e
            r4.animateToTab(r5)
        L1e:
            int r1 = r1 + 1
            goto L9
        L21:
            android.widget.Spinner r1 = r4.mTabSpinner
            if (r1 == 0) goto L2c
            if (r5 < 0) goto L2c
            android.widget.Spinner r1 = r4.mTabSpinner
            r1.setSelection(r5)
        L2c:
            return
    }

    public void updateTab(int r2) {
            r1 = this;
            androidx.appcompat.widget.LinearLayoutCompat r0 = r1.mTabLayout
            android.view.View r0 = r0.getChildAt(r2)
            androidx.appcompat.widget.ScrollingTabContainerView$TabView r0 = (androidx.appcompat.widget.ScrollingTabContainerView.TabView) r0
            r0.update()
            android.widget.Spinner r0 = r1.mTabSpinner
            if (r0 == 0) goto L1a
            android.widget.Spinner r0 = r1.mTabSpinner
            android.widget.SpinnerAdapter r0 = r0.getAdapter()
            androidx.appcompat.widget.ScrollingTabContainerView$TabAdapter r0 = (androidx.appcompat.widget.ScrollingTabContainerView.TabAdapter) r0
            r0.notifyDataSetChanged()
        L1a:
            boolean r0 = r1.mAllowCollapse
            if (r0 == 0) goto L21
            r1.requestLayout()
        L21:
            return
    }
}
