package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
public class ActionBarOverlayLayout extends android.view.ViewGroup implements androidx.appcompat.widget.DecorContentParent, androidx.core.view.NestedScrollingParent, androidx.core.view.NestedScrollingParent2, androidx.core.view.NestedScrollingParent3 {
    private static final int ACTION_BAR_ANIMATE_DELAY = 600;
    static final int[] ATTRS = null;
    private static final androidx.core.view.WindowInsetsCompat NON_EMPTY_SYSTEM_WINDOW_INSETS = null;
    private static final java.lang.String TAG = "ActionBarOverlayLayout";
    private static final android.graphics.Rect ZERO_INSETS = null;
    private int mActionBarHeight;
    androidx.appcompat.widget.ActionBarContainer mActionBarTop;
    private androidx.appcompat.widget.ActionBarOverlayLayout.ActionBarVisibilityCallback mActionBarVisibilityCallback;
    private final java.lang.Runnable mAddActionBarHideOffset;
    boolean mAnimatingForFling;
    private final android.graphics.Rect mBaseContentInsets;
    private androidx.core.view.WindowInsetsCompat mBaseInnerInsets;
    private final android.graphics.Rect mBaseInnerInsetsRect;
    private androidx.appcompat.widget.ContentFrameLayout mContent;
    private final android.graphics.Rect mContentInsets;
    android.view.ViewPropertyAnimator mCurrentActionBarTopAnimator;
    private androidx.appcompat.widget.DecorToolbar mDecorToolbar;
    private android.widget.OverScroller mFlingEstimator;
    private boolean mHasNonEmbeddedTabs;
    private boolean mHideOnContentScroll;
    private int mHideOnContentScrollReference;
    private androidx.core.view.WindowInsetsCompat mInnerInsets;
    private final android.graphics.Rect mInnerInsetsRect;
    private final android.graphics.Rect mLastBaseContentInsets;
    private androidx.core.view.WindowInsetsCompat mLastBaseInnerInsets;
    private final android.graphics.Rect mLastBaseInnerInsetsRect;
    private androidx.core.view.WindowInsetsCompat mLastInnerInsets;
    private final android.graphics.Rect mLastInnerInsetsRect;
    private int mLastSystemUiVisibility;
    private final androidx.appcompat.widget.ActionBarOverlayLayout.NoSystemUiLayoutFlagView mNoSystemUiLayoutFlagView;
    private boolean mOverlayMode;
    private final androidx.core.view.NestedScrollingParentHelper mParentHelper;
    private final java.lang.Runnable mRemoveActionBarHideOffset;
    private final android.graphics.Rect mTmpRect;
    final android.animation.AnimatorListenerAdapter mTopAnimatorListener;
    private android.graphics.drawable.Drawable mWindowContentOverlay;
    private int mWindowVisibility;




    public interface ActionBarVisibilityCallback {
        void enableContentAnimations(boolean r1);

        void hideForSystem();

        void onContentScrollStarted();

        void onContentScrollStopped();

        void onWindowVisibilityChanged(int r1);

        void showForSystem();
    }

    public static class LayoutParams extends android.view.ViewGroup.MarginLayoutParams {
        public LayoutParams(int r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
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

    private static final class NoSystemUiLayoutFlagView extends android.view.View {
        NoSystemUiLayoutFlagView(android.content.Context r2) {
                r1 = this;
                r1.<init>(r2)
                r0 = 1
                r1.setWillNotDraw(r0)
                return
        }

        @Override // android.view.View
        public int getWindowSystemUiVisibility() {
                r1 = this;
                r0 = 0
                return r0
        }
    }

    static {
            int r0 = androidx.appcompat.R.attr.actionBarSize
            r1 = 16842841(0x1010059, float:2.3693807E-38)
            int[] r0 = new int[]{r0, r1}
            androidx.appcompat.widget.ActionBarOverlayLayout.ATTRS = r0
            androidx.core.view.WindowInsetsCompat$Builder r0 = new androidx.core.view.WindowInsetsCompat$Builder
            r0.<init>()
            r1 = 0
            r2 = 1
            androidx.core.graphics.Insets r1 = androidx.core.graphics.Insets.of(r1, r2, r1, r2)
            androidx.core.view.WindowInsetsCompat$Builder r0 = r0.setSystemWindowInsets(r1)
            androidx.core.view.WindowInsetsCompat r0 = r0.build()
            androidx.appcompat.widget.ActionBarOverlayLayout.NON_EMPTY_SYSTEM_WINDOW_INSETS = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            androidx.appcompat.widget.ActionBarOverlayLayout.ZERO_INSETS = r0
            return
    }

    public ActionBarOverlayLayout(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public ActionBarOverlayLayout(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r1.<init>(r2, r3)
            r0 = 0
            r1.mWindowVisibility = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r1.mBaseContentInsets = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r1.mLastBaseContentInsets = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r1.mContentInsets = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r1.mTmpRect = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r1.mBaseInnerInsetsRect = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r1.mLastBaseInnerInsetsRect = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r1.mInnerInsetsRect = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r1.mLastInnerInsetsRect = r0
            androidx.core.view.WindowInsetsCompat r0 = androidx.core.view.WindowInsetsCompat.CONSUMED
            r1.mBaseInnerInsets = r0
            androidx.core.view.WindowInsetsCompat r0 = androidx.core.view.WindowInsetsCompat.CONSUMED
            r1.mLastBaseInnerInsets = r0
            androidx.core.view.WindowInsetsCompat r0 = androidx.core.view.WindowInsetsCompat.CONSUMED
            r1.mInnerInsets = r0
            androidx.core.view.WindowInsetsCompat r0 = androidx.core.view.WindowInsetsCompat.CONSUMED
            r1.mLastInnerInsets = r0
            androidx.appcompat.widget.ActionBarOverlayLayout$1 r0 = new androidx.appcompat.widget.ActionBarOverlayLayout$1
            r0.<init>(r1)
            r1.mTopAnimatorListener = r0
            androidx.appcompat.widget.ActionBarOverlayLayout$2 r0 = new androidx.appcompat.widget.ActionBarOverlayLayout$2
            r0.<init>(r1)
            r1.mRemoveActionBarHideOffset = r0
            androidx.appcompat.widget.ActionBarOverlayLayout$3 r0 = new androidx.appcompat.widget.ActionBarOverlayLayout$3
            r0.<init>(r1)
            r1.mAddActionBarHideOffset = r0
            r1.init(r2)
            androidx.core.view.NestedScrollingParentHelper r0 = new androidx.core.view.NestedScrollingParentHelper
            r0.<init>(r1)
            r1.mParentHelper = r0
            androidx.appcompat.widget.ActionBarOverlayLayout$NoSystemUiLayoutFlagView r0 = new androidx.appcompat.widget.ActionBarOverlayLayout$NoSystemUiLayoutFlagView
            r0.<init>(r2)
            r1.mNoSystemUiLayoutFlagView = r0
            androidx.appcompat.widget.ActionBarOverlayLayout$NoSystemUiLayoutFlagView r0 = r1.mNoSystemUiLayoutFlagView
            r1.addView(r0)
            return
    }

    private void addActionBarHideOffset() {
            r1 = this;
            r1.haltActionBarHideOffsetAnimations()
            java.lang.Runnable r0 = r1.mAddActionBarHideOffset
            r0.run()
            return
    }

    private boolean applyInsets(android.view.View r5, android.graphics.Rect r6, boolean r7, boolean r8, boolean r9, boolean r10) {
            r4 = this;
            r0 = 0
            android.view.ViewGroup$LayoutParams r1 = r5.getLayoutParams()
            androidx.appcompat.widget.ActionBarOverlayLayout$LayoutParams r1 = (androidx.appcompat.widget.ActionBarOverlayLayout.LayoutParams) r1
            if (r7 == 0) goto L14
            int r2 = r1.leftMargin
            int r3 = r6.left
            if (r2 == r3) goto L14
            r0 = 1
            int r2 = r6.left
            r1.leftMargin = r2
        L14:
            if (r8 == 0) goto L21
            int r2 = r1.topMargin
            int r3 = r6.top
            if (r2 == r3) goto L21
            r0 = 1
            int r2 = r6.top
            r1.topMargin = r2
        L21:
            if (r10 == 0) goto L2e
            int r2 = r1.rightMargin
            int r3 = r6.right
            if (r2 == r3) goto L2e
            r0 = 1
            int r2 = r6.right
            r1.rightMargin = r2
        L2e:
            if (r9 == 0) goto L3b
            int r2 = r1.bottomMargin
            int r3 = r6.bottom
            if (r2 == r3) goto L3b
            r0 = 1
            int r2 = r6.bottom
            r1.bottomMargin = r2
        L3b:
            return r0
    }

    private boolean decorFitsSystemWindows() {
            r3 = this;
            androidx.appcompat.widget.ActionBarOverlayLayout$NoSystemUiLayoutFlagView r0 = r3.mNoSystemUiLayoutFlagView
            androidx.core.view.WindowInsetsCompat r1 = androidx.appcompat.widget.ActionBarOverlayLayout.NON_EMPTY_SYSTEM_WINDOW_INSETS
            android.graphics.Rect r2 = r3.mTmpRect
            androidx.core.view.ViewCompat.computeSystemWindowInsets(r0, r1, r2)
            android.graphics.Rect r0 = r3.mTmpRect
            android.graphics.Rect r1 = androidx.appcompat.widget.ActionBarOverlayLayout.ZERO_INSETS
            boolean r0 = r0.equals(r1)
            r0 = r0 ^ 1
            return r0
    }

    private androidx.appcompat.widget.DecorToolbar getDecorToolbar(android.view.View r4) {
            r3 = this;
            boolean r0 = r4 instanceof androidx.appcompat.widget.DecorToolbar
            if (r0 == 0) goto L8
            r0 = r4
            androidx.appcompat.widget.DecorToolbar r0 = (androidx.appcompat.widget.DecorToolbar) r0
            return r0
        L8:
            boolean r0 = r4 instanceof androidx.appcompat.widget.Toolbar
            if (r0 == 0) goto L14
            r0 = r4
            androidx.appcompat.widget.Toolbar r0 = (androidx.appcompat.widget.Toolbar) r0
            androidx.appcompat.widget.DecorToolbar r0 = r0.getWrapper()
            return r0
        L14:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Can't make a decor toolbar out of "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.Class r2 = r4.getClass()
            java.lang.String r2 = r2.getSimpleName()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    private void init(android.content.Context r5) {
            r4 = this;
            android.content.Context r0 = r4.getContext()
            android.content.res.Resources$Theme r0 = r0.getTheme()
            int[] r1 = androidx.appcompat.widget.ActionBarOverlayLayout.ATTRS
            android.content.res.TypedArray r0 = r0.obtainStyledAttributes(r1)
            r1 = 0
            int r2 = r0.getDimensionPixelSize(r1, r1)
            r4.mActionBarHeight = r2
            r2 = 1
            android.graphics.drawable.Drawable r3 = r0.getDrawable(r2)
            r4.mWindowContentOverlay = r3
            android.graphics.drawable.Drawable r3 = r4.mWindowContentOverlay
            if (r3 != 0) goto L21
            r1 = r2
        L21:
            r4.setWillNotDraw(r1)
            r0.recycle()
            android.widget.OverScroller r1 = new android.widget.OverScroller
            r1.<init>(r5)
            r4.mFlingEstimator = r1
            return
    }

    private void postAddActionBarHideOffset() {
            r3 = this;
            r3.haltActionBarHideOffsetAnimations()
            java.lang.Runnable r0 = r3.mAddActionBarHideOffset
            r1 = 600(0x258, double:2.964E-321)
            r3.postDelayed(r0, r1)
            return
    }

    private void postRemoveActionBarHideOffset() {
            r3 = this;
            r3.haltActionBarHideOffsetAnimations()
            java.lang.Runnable r0 = r3.mRemoveActionBarHideOffset
            r1 = 600(0x258, double:2.964E-321)
            r3.postDelayed(r0, r1)
            return
    }

    private void removeActionBarHideOffset() {
            r1 = this;
            r1.haltActionBarHideOffsetAnimations()
            java.lang.Runnable r0 = r1.mRemoveActionBarHideOffset
            r0.run()
            return
    }

    private boolean shouldHideActionBarOnFling(float r10) {
            r9 = this;
            android.widget.OverScroller r0 = r9.mFlingEstimator
            int r4 = (int) r10
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r8 = 2147483647(0x7fffffff, float:NaN)
            r1 = 0
            r2 = 0
            r3 = 0
            r5 = 0
            r6 = 0
            r0.fling(r1, r2, r3, r4, r5, r6, r7, r8)
            android.widget.OverScroller r0 = r9.mFlingEstimator
            int r0 = r0.getFinalY()
            androidx.appcompat.widget.ActionBarContainer r1 = r9.mActionBarTop
            int r1 = r1.getHeight()
            if (r0 <= r1) goto L20
            r1 = 1
            goto L21
        L20:
            r1 = 0
        L21:
            return r1
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public boolean canShowOverflowMenu() {
            r1 = this;
            r1.pullChildren()
            androidx.appcompat.widget.DecorToolbar r0 = r1.mDecorToolbar
            boolean r0 = r0.canShowOverflowMenu()
            return r0
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams r2) {
            r1 = this;
            boolean r0 = r2 instanceof androidx.appcompat.widget.ActionBarOverlayLayout.LayoutParams
            return r0
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public void dismissPopups() {
            r1 = this;
            r1.pullChildren()
            androidx.appcompat.widget.DecorToolbar r0 = r1.mDecorToolbar
            r0.dismissPopupMenus()
            return
    }

    @Override // android.view.View
    public void draw(android.graphics.Canvas r6) {
            r5 = this;
            super.draw(r6)
            android.graphics.drawable.Drawable r0 = r5.mWindowContentOverlay
            if (r0 == 0) goto L3a
            androidx.appcompat.widget.ActionBarContainer r0 = r5.mActionBarTop
            int r0 = r0.getVisibility()
            r1 = 0
            if (r0 != 0) goto L23
            androidx.appcompat.widget.ActionBarContainer r0 = r5.mActionBarTop
            int r0 = r0.getBottom()
            float r0 = (float) r0
            androidx.appcompat.widget.ActionBarContainer r2 = r5.mActionBarTop
            float r2 = r2.getTranslationY()
            float r0 = r0 + r2
            r2 = 1056964608(0x3f000000, float:0.5)
            float r0 = r0 + r2
            int r0 = (int) r0
            goto L24
        L23:
            r0 = r1
        L24:
            android.graphics.drawable.Drawable r2 = r5.mWindowContentOverlay
            int r3 = r5.getWidth()
            android.graphics.drawable.Drawable r4 = r5.mWindowContentOverlay
            int r4 = r4.getIntrinsicHeight()
            int r4 = r4 + r0
            r2.setBounds(r1, r0, r3, r4)
            android.graphics.drawable.Drawable r1 = r5.mWindowContentOverlay
            r1.draw(r6)
        L3a:
            return
    }

    @Override // android.view.View
    protected boolean fitSystemWindows(android.graphics.Rect r2) {
            r1 = this;
            boolean r0 = super.fitSystemWindows(r2)
            return r0
    }

    @Override // android.view.ViewGroup
    protected /* bridge */ /* synthetic */ android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
            r1 = this;
            androidx.appcompat.widget.ActionBarOverlayLayout$LayoutParams r0 = r1.generateDefaultLayoutParams()
            return r0
    }

    @Override // android.view.ViewGroup
    protected androidx.appcompat.widget.ActionBarOverlayLayout.LayoutParams generateDefaultLayoutParams() {
            r2 = this;
            androidx.appcompat.widget.ActionBarOverlayLayout$LayoutParams r0 = new androidx.appcompat.widget.ActionBarOverlayLayout$LayoutParams
            r1 = -1
            r0.<init>(r1, r1)
            return r0
    }

    @Override // android.view.ViewGroup
    public /* bridge */ /* synthetic */ android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet r1) {
            r0 = this;
            androidx.appcompat.widget.ActionBarOverlayLayout$LayoutParams r1 = r0.generateLayoutParams(r1)
            return r1
    }

    @Override // android.view.ViewGroup
    protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams r2) {
            r1 = this;
            androidx.appcompat.widget.ActionBarOverlayLayout$LayoutParams r0 = new androidx.appcompat.widget.ActionBarOverlayLayout$LayoutParams
            r0.<init>(r2)
            return r0
    }

    @Override // android.view.ViewGroup
    public androidx.appcompat.widget.ActionBarOverlayLayout.LayoutParams generateLayoutParams(android.util.AttributeSet r3) {
            r2 = this;
            androidx.appcompat.widget.ActionBarOverlayLayout$LayoutParams r0 = new androidx.appcompat.widget.ActionBarOverlayLayout$LayoutParams
            android.content.Context r1 = r2.getContext()
            r0.<init>(r1, r3)
            return r0
    }

    public int getActionBarHideOffset() {
            r1 = this;
            androidx.appcompat.widget.ActionBarContainer r0 = r1.mActionBarTop
            if (r0 == 0) goto Ld
            androidx.appcompat.widget.ActionBarContainer r0 = r1.mActionBarTop
            float r0 = r0.getTranslationY()
            int r0 = (int) r0
            int r0 = -r0
            goto Le
        Ld:
            r0 = 0
        Le:
            return r0
    }

    @Override // android.view.ViewGroup, androidx.core.view.NestedScrollingParent
    public int getNestedScrollAxes() {
            r1 = this;
            androidx.core.view.NestedScrollingParentHelper r0 = r1.mParentHelper
            int r0 = r0.getNestedScrollAxes()
            return r0
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public java.lang.CharSequence getTitle() {
            r1 = this;
            r1.pullChildren()
            androidx.appcompat.widget.DecorToolbar r0 = r1.mDecorToolbar
            java.lang.CharSequence r0 = r0.getTitle()
            return r0
    }

    void haltActionBarHideOffsetAnimations() {
            r1 = this;
            java.lang.Runnable r0 = r1.mRemoveActionBarHideOffset
            r1.removeCallbacks(r0)
            java.lang.Runnable r0 = r1.mAddActionBarHideOffset
            r1.removeCallbacks(r0)
            android.view.ViewPropertyAnimator r0 = r1.mCurrentActionBarTopAnimator
            if (r0 == 0) goto L13
            android.view.ViewPropertyAnimator r0 = r1.mCurrentActionBarTopAnimator
            r0.cancel()
        L13:
            return
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public boolean hasIcon() {
            r1 = this;
            r1.pullChildren()
            androidx.appcompat.widget.DecorToolbar r0 = r1.mDecorToolbar
            boolean r0 = r0.hasIcon()
            return r0
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public boolean hasLogo() {
            r1 = this;
            r1.pullChildren()
            androidx.appcompat.widget.DecorToolbar r0 = r1.mDecorToolbar
            boolean r0 = r0.hasLogo()
            return r0
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public boolean hideOverflowMenu() {
            r1 = this;
            r1.pullChildren()
            androidx.appcompat.widget.DecorToolbar r0 = r1.mDecorToolbar
            boolean r0 = r0.hideOverflowMenu()
            return r0
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public void initFeature(int r2) {
            r1 = this;
            r1.pullChildren()
            switch(r2) {
                case 2: goto L12;
                case 5: goto Lc;
                case 109: goto L7;
                default: goto L6;
            }
        L6:
            goto L18
        L7:
            r0 = 1
            r1.setOverlayMode(r0)
            goto L18
        Lc:
            androidx.appcompat.widget.DecorToolbar r0 = r1.mDecorToolbar
            r0.initIndeterminateProgress()
            goto L18
        L12:
            androidx.appcompat.widget.DecorToolbar r0 = r1.mDecorToolbar
            r0.initProgress()
        L18:
            return
    }

    public boolean isHideOnContentScrollEnabled() {
            r1 = this;
            boolean r0 = r1.mHideOnContentScroll
            return r0
    }

    public boolean isInOverlayMode() {
            r1 = this;
            boolean r0 = r1.mOverlayMode
            return r0
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public boolean isOverflowMenuShowPending() {
            r1 = this;
            r1.pullChildren()
            androidx.appcompat.widget.DecorToolbar r0 = r1.mDecorToolbar
            boolean r0 = r0.isOverflowMenuShowPending()
            return r0
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public boolean isOverflowMenuShowing() {
            r1 = this;
            r1.pullChildren()
            androidx.appcompat.widget.DecorToolbar r0 = r1.mDecorToolbar
            boolean r0 = r0.isOverflowMenuShowing()
            return r0
    }

    @Override // android.view.View
    public android.view.WindowInsets onApplyWindowInsets(android.view.WindowInsets r14) {
            r13 = this;
            r13.pullChildren()
            androidx.core.view.WindowInsetsCompat r0 = androidx.core.view.WindowInsetsCompat.toWindowInsetsCompat(r14, r13)
            android.graphics.Rect r1 = new android.graphics.Rect
            int r2 = r0.getSystemWindowInsetLeft()
            int r3 = r0.getSystemWindowInsetTop()
            int r4 = r0.getSystemWindowInsetRight()
            int r5 = r0.getSystemWindowInsetBottom()
            r1.<init>(r2, r3, r4, r5)
            r8 = r1
            androidx.appcompat.widget.ActionBarContainer r7 = r13.mActionBarTop
            r11 = 0
            r12 = 1
            r9 = 1
            r10 = 1
            r6 = r13
            boolean r1 = r6.applyInsets(r7, r8, r9, r10, r11, r12)
            android.graphics.Rect r2 = r6.mBaseContentInsets
            androidx.core.view.ViewCompat.computeSystemWindowInsets(r13, r0, r2)
            android.graphics.Rect r2 = r6.mBaseContentInsets
            int r2 = r2.left
            android.graphics.Rect r3 = r6.mBaseContentInsets
            int r3 = r3.top
            android.graphics.Rect r4 = r6.mBaseContentInsets
            int r4 = r4.right
            android.graphics.Rect r5 = r6.mBaseContentInsets
            int r5 = r5.bottom
            androidx.core.view.WindowInsetsCompat r2 = r0.inset(r2, r3, r4, r5)
            r6.mBaseInnerInsets = r2
            androidx.core.view.WindowInsetsCompat r2 = r6.mLastBaseInnerInsets
            androidx.core.view.WindowInsetsCompat r3 = r6.mBaseInnerInsets
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L52
            r1 = 1
            androidx.core.view.WindowInsetsCompat r2 = r6.mBaseInnerInsets
            r6.mLastBaseInnerInsets = r2
        L52:
            android.graphics.Rect r2 = r6.mLastBaseContentInsets
            android.graphics.Rect r3 = r6.mBaseContentInsets
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L64
            r1 = 1
            android.graphics.Rect r2 = r6.mLastBaseContentInsets
            android.graphics.Rect r3 = r6.mBaseContentInsets
            r2.set(r3)
        L64:
            if (r1 == 0) goto L69
            r13.requestLayout()
        L69:
            androidx.core.view.WindowInsetsCompat r2 = r0.consumeDisplayCutout()
            androidx.core.view.WindowInsetsCompat r2 = r2.consumeSystemWindowInsets()
            androidx.core.view.WindowInsetsCompat r2 = r2.consumeStableInsets()
            android.view.WindowInsets r2 = r2.toWindowInsets()
            return r2
    }

    @Override // android.view.View
    protected void onConfigurationChanged(android.content.res.Configuration r2) {
            r1 = this;
            super.onConfigurationChanged(r2)
            android.content.Context r0 = r1.getContext()
            r1.init(r0)
            androidx.core.view.ViewCompat.requestApplyInsets(r1)
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
            r0 = this;
            super.onDetachedFromWindow()
            r0.haltActionBarHideOffsetAnimations()
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean r13, int r14, int r15, int r16, int r17) {
            r12 = this;
            int r0 = r12.getChildCount()
            int r1 = r12.getPaddingLeft()
            int r2 = r12.getPaddingTop()
            r3 = 0
        Ld:
            if (r3 >= r0) goto L39
            android.view.View r4 = r12.getChildAt(r3)
            int r5 = r4.getVisibility()
            r6 = 8
            if (r5 == r6) goto L36
            android.view.ViewGroup$LayoutParams r5 = r4.getLayoutParams()
            androidx.appcompat.widget.ActionBarOverlayLayout$LayoutParams r5 = (androidx.appcompat.widget.ActionBarOverlayLayout.LayoutParams) r5
            int r6 = r4.getMeasuredWidth()
            int r7 = r4.getMeasuredHeight()
            int r8 = r5.leftMargin
            int r8 = r8 + r1
            int r9 = r5.topMargin
            int r9 = r9 + r2
            int r10 = r8 + r6
            int r11 = r9 + r7
            r4.layout(r8, r9, r10, r11)
        L36:
            int r3 = r3 + 1
            goto Ld
        L39:
            return
    }

    @Override // android.view.View
    protected void onMeasure(int r16, int r17) {
            r15 = this;
            r15.pullChildren()
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            androidx.appcompat.widget.ActionBarContainer r1 = r15.mActionBarTop
            r3 = 0
            r5 = 0
            r0 = r15
            r2 = r16
            r4 = r17
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
            androidx.appcompat.widget.ActionBarContainer r1 = r15.mActionBarTop
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            r11 = r1
            androidx.appcompat.widget.ActionBarOverlayLayout$LayoutParams r11 = (androidx.appcompat.widget.ActionBarOverlayLayout.LayoutParams) r11
            androidx.appcompat.widget.ActionBarContainer r1 = r15.mActionBarTop
            int r1 = r1.getMeasuredWidth()
            int r2 = r11.leftMargin
            int r1 = r1 + r2
            int r2 = r11.rightMargin
            int r1 = r1 + r2
            int r7 = java.lang.Math.max(r7, r1)
            androidx.appcompat.widget.ActionBarContainer r1 = r15.mActionBarTop
            int r1 = r1.getMeasuredHeight()
            int r2 = r11.topMargin
            int r1 = r1 + r2
            int r2 = r11.bottomMargin
            int r1 = r1 + r2
            int r12 = java.lang.Math.max(r6, r1)
            androidx.appcompat.widget.ActionBarContainer r1 = r15.mActionBarTop
            int r1 = r1.getMeasuredState()
            int r8 = android.view.View.combineMeasuredStates(r8, r1)
            int r13 = androidx.core.view.ViewCompat.getWindowSystemUiVisibility(r15)
            r1 = r13 & 256(0x100, float:3.59E-43)
            r2 = 0
            if (r1 == 0) goto L52
            r1 = 1
            goto L53
        L52:
            r1 = r2
        L53:
            r14 = r1
            if (r14 == 0) goto L68
            int r9 = r15.mActionBarHeight
            boolean r1 = r15.mHasNonEmbeddedTabs
            if (r1 == 0) goto L78
            androidx.appcompat.widget.ActionBarContainer r1 = r15.mActionBarTop
            android.view.View r1 = r1.getTabContainer()
            if (r1 == 0) goto L67
            int r3 = r15.mActionBarHeight
            int r9 = r9 + r3
        L67:
            goto L78
        L68:
            androidx.appcompat.widget.ActionBarContainer r1 = r15.mActionBarTop
            int r1 = r1.getVisibility()
            r3 = 8
            if (r1 == r3) goto L78
            androidx.appcompat.widget.ActionBarContainer r1 = r15.mActionBarTop
            int r9 = r1.getMeasuredHeight()
        L78:
            android.graphics.Rect r1 = r15.mContentInsets
            android.graphics.Rect r3 = r15.mBaseContentInsets
            r1.set(r3)
            androidx.core.view.WindowInsetsCompat r1 = r15.mBaseInnerInsets
            r15.mInnerInsets = r1
            boolean r1 = r15.mOverlayMode
            if (r1 != 0) goto La8
            if (r14 != 0) goto La8
            boolean r1 = r15.decorFitsSystemWindows()
            if (r1 == 0) goto La8
            android.graphics.Rect r1 = r15.mContentInsets
            int r3 = r1.top
            int r3 = r3 + r9
            r1.top = r3
            android.graphics.Rect r1 = r15.mContentInsets
            int r3 = r1.bottom
            int r3 = r3 + r10
            r1.bottom = r3
            androidx.core.view.WindowInsetsCompat r1 = r15.mInnerInsets
            androidx.core.view.WindowInsetsCompat r1 = r1.inset(r2, r9, r2, r10)
            r15.mInnerInsets = r1
            goto Ld9
        La8:
            androidx.core.view.WindowInsetsCompat r1 = r15.mInnerInsets
            int r1 = r1.getSystemWindowInsetLeft()
            androidx.core.view.WindowInsetsCompat r2 = r15.mInnerInsets
            int r2 = r2.getSystemWindowInsetTop()
            int r2 = r2 + r9
            androidx.core.view.WindowInsetsCompat r3 = r15.mInnerInsets
            int r3 = r3.getSystemWindowInsetRight()
            androidx.core.view.WindowInsetsCompat r4 = r15.mInnerInsets
            int r4 = r4.getSystemWindowInsetBottom()
            int r4 = r4 + r10
            androidx.core.graphics.Insets r1 = androidx.core.graphics.Insets.of(r1, r2, r3, r4)
            androidx.core.view.WindowInsetsCompat$Builder r2 = new androidx.core.view.WindowInsetsCompat$Builder
            androidx.core.view.WindowInsetsCompat r3 = r15.mInnerInsets
            r2.<init>(r3)
            androidx.core.view.WindowInsetsCompat$Builder r2 = r2.setSystemWindowInsets(r1)
            androidx.core.view.WindowInsetsCompat r2 = r2.build()
            r15.mInnerInsets = r2
        Ld9:
            androidx.appcompat.widget.ContentFrameLayout r1 = r15.mContent
            android.graphics.Rect r2 = r15.mContentInsets
            r5 = 1
            r6 = 1
            r3 = 1
            r4 = 1
            r0 = r15
            r0.applyInsets(r1, r2, r3, r4, r5, r6)
            androidx.core.view.WindowInsetsCompat r1 = r15.mLastInnerInsets
            androidx.core.view.WindowInsetsCompat r2 = r15.mInnerInsets
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto Lfb
            androidx.core.view.WindowInsetsCompat r1 = r15.mInnerInsets
            r15.mLastInnerInsets = r1
            androidx.appcompat.widget.ContentFrameLayout r1 = r15.mContent
            androidx.core.view.WindowInsetsCompat r2 = r15.mInnerInsets
            androidx.core.view.ViewCompat.dispatchApplyWindowInsets(r1, r2)
            goto Lfc
        Lfb:
        Lfc:
            androidx.appcompat.widget.ContentFrameLayout r1 = r15.mContent
            r3 = 0
            r5 = 0
            r0 = r15
            r2 = r16
            r4 = r17
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
            androidx.appcompat.widget.ContentFrameLayout r1 = r15.mContent
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.ActionBarOverlayLayout$LayoutParams r1 = (androidx.appcompat.widget.ActionBarOverlayLayout.LayoutParams) r1
            androidx.appcompat.widget.ContentFrameLayout r2 = r15.mContent
            int r2 = r2.getMeasuredWidth()
            int r3 = r1.leftMargin
            int r2 = r2 + r3
            int r3 = r1.rightMargin
            int r2 = r2 + r3
            int r2 = java.lang.Math.max(r7, r2)
            androidx.appcompat.widget.ContentFrameLayout r3 = r15.mContent
            int r3 = r3.getMeasuredHeight()
            int r4 = r1.topMargin
            int r3 = r3 + r4
            int r4 = r1.bottomMargin
            int r3 = r3 + r4
            int r3 = java.lang.Math.max(r12, r3)
            androidx.appcompat.widget.ContentFrameLayout r4 = r15.mContent
            int r4 = r4.getMeasuredState()
            int r4 = android.view.View.combineMeasuredStates(r8, r4)
            int r5 = r15.getPaddingLeft()
            int r6 = r15.getPaddingRight()
            int r5 = r5 + r6
            int r2 = r2 + r5
            int r5 = r15.getPaddingTop()
            int r6 = r15.getPaddingBottom()
            int r5 = r5 + r6
            int r3 = r3 + r5
            int r5 = r15.getSuggestedMinimumHeight()
            int r3 = java.lang.Math.max(r3, r5)
            int r5 = r15.getSuggestedMinimumWidth()
            int r2 = java.lang.Math.max(r2, r5)
            r5 = r16
            int r6 = android.view.View.resolveSizeAndState(r2, r5, r4)
            int r7 = r4 << 16
            r8 = r17
            int r7 = android.view.View.resolveSizeAndState(r3, r8, r7)
            r15.setMeasuredDimension(r6, r7)
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onNestedFling(android.view.View r2, float r3, float r4, boolean r5) {
            r1 = this;
            boolean r0 = r1.mHideOnContentScroll
            if (r0 == 0) goto L18
            if (r5 != 0) goto L7
            goto L18
        L7:
            boolean r0 = r1.shouldHideActionBarOnFling(r4)
            if (r0 == 0) goto L11
            r1.addActionBarHideOffset()
            goto L14
        L11:
            r1.removeActionBarHideOffset()
        L14:
            r0 = 1
            r1.mAnimatingForFling = r0
            return r0
        L18:
            r0 = 0
            return r0
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onNestedPreFling(android.view.View r2, float r3, float r4) {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onNestedPreScroll(android.view.View r1, int r2, int r3, int[] r4) {
            r0 = this;
            return
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedPreScroll(android.view.View r1, int r2, int r3, int[] r4, int r5) {
            r0 = this;
            if (r5 != 0) goto L5
            r0.onNestedPreScroll(r1, r2, r3, r4)
        L5:
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onNestedScroll(android.view.View r2, int r3, int r4, int r5, int r6) {
            r1 = this;
            int r0 = r1.mHideOnContentScrollReference
            int r0 = r0 + r4
            r1.mHideOnContentScrollReference = r0
            int r0 = r1.mHideOnContentScrollReference
            r1.setActionBarHideOffset(r0)
            return
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedScroll(android.view.View r1, int r2, int r3, int r4, int r5, int r6) {
            r0 = this;
            if (r6 != 0) goto L5
            r0.onNestedScroll(r1, r2, r3, r4, r5)
        L5:
            return
    }

    @Override // androidx.core.view.NestedScrollingParent3
    public void onNestedScroll(android.view.View r1, int r2, int r3, int r4, int r5, int r6, int[] r7) {
            r0 = this;
            r0.onNestedScroll(r1, r2, r3, r4, r5, r6)
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onNestedScrollAccepted(android.view.View r2, android.view.View r3, int r4) {
            r1 = this;
            androidx.core.view.NestedScrollingParentHelper r0 = r1.mParentHelper
            r0.onNestedScrollAccepted(r2, r3, r4)
            int r0 = r1.getActionBarHideOffset()
            r1.mHideOnContentScrollReference = r0
            r1.haltActionBarHideOffsetAnimations()
            androidx.appcompat.widget.ActionBarOverlayLayout$ActionBarVisibilityCallback r0 = r1.mActionBarVisibilityCallback
            if (r0 == 0) goto L17
            androidx.appcompat.widget.ActionBarOverlayLayout$ActionBarVisibilityCallback r0 = r1.mActionBarVisibilityCallback
            r0.onContentScrollStarted()
        L17:
            return
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedScrollAccepted(android.view.View r1, android.view.View r2, int r3, int r4) {
            r0 = this;
            if (r4 != 0) goto L5
            r0.onNestedScrollAccepted(r1, r2, r3)
        L5:
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onStartNestedScroll(android.view.View r2, android.view.View r3, int r4) {
            r1 = this;
            r0 = r4 & 2
            if (r0 == 0) goto L10
            androidx.appcompat.widget.ActionBarContainer r0 = r1.mActionBarTop
            int r0 = r0.getVisibility()
            if (r0 == 0) goto Ld
            goto L10
        Ld:
            boolean r0 = r1.mHideOnContentScroll
            return r0
        L10:
            r0 = 0
            return r0
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public boolean onStartNestedScroll(android.view.View r2, android.view.View r3, int r4, int r5) {
            r1 = this;
            if (r5 != 0) goto La
            boolean r0 = r1.onStartNestedScroll(r2, r3, r4)
            if (r0 == 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            return r0
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onStopNestedScroll(android.view.View r3) {
            r2 = this;
            boolean r0 = r2.mHideOnContentScroll
            if (r0 == 0) goto L19
            boolean r0 = r2.mAnimatingForFling
            if (r0 != 0) goto L19
            int r0 = r2.mHideOnContentScrollReference
            androidx.appcompat.widget.ActionBarContainer r1 = r2.mActionBarTop
            int r1 = r1.getHeight()
            if (r0 > r1) goto L16
            r2.postRemoveActionBarHideOffset()
            goto L19
        L16:
            r2.postAddActionBarHideOffset()
        L19:
            androidx.appcompat.widget.ActionBarOverlayLayout$ActionBarVisibilityCallback r0 = r2.mActionBarVisibilityCallback
            if (r0 == 0) goto L22
            androidx.appcompat.widget.ActionBarOverlayLayout$ActionBarVisibilityCallback r0 = r2.mActionBarVisibilityCallback
            r0.onContentScrollStopped()
        L22:
            return
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onStopNestedScroll(android.view.View r1, int r2) {
            r0 = this;
            if (r2 != 0) goto L5
            r0.onStopNestedScroll(r1)
        L5:
            return
    }

    @Override // android.view.View
    @java.lang.Deprecated
    public void onWindowSystemUiVisibilityChanged(int r7) {
            r6 = this;
            super.onWindowSystemUiVisibilityChanged(r7)
            r6.pullChildren()
            int r0 = r6.mLastSystemUiVisibility
            r0 = r0 ^ r7
            r6.mLastSystemUiVisibility = r7
            r1 = r7 & 4
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L13
            r1 = r2
            goto L14
        L13:
            r1 = r3
        L14:
            r4 = r7 & 256(0x100, float:3.59E-43)
            if (r4 == 0) goto L1a
            r4 = r2
            goto L1b
        L1a:
            r4 = r3
        L1b:
            androidx.appcompat.widget.ActionBarOverlayLayout$ActionBarVisibilityCallback r5 = r6.mActionBarVisibilityCallback
            if (r5 == 0) goto L38
            androidx.appcompat.widget.ActionBarOverlayLayout$ActionBarVisibilityCallback r5 = r6.mActionBarVisibilityCallback
            if (r4 != 0) goto L24
            goto L25
        L24:
            r2 = r3
        L25:
            r5.enableContentAnimations(r2)
            if (r1 != 0) goto L33
            if (r4 != 0) goto L2d
            goto L33
        L2d:
            androidx.appcompat.widget.ActionBarOverlayLayout$ActionBarVisibilityCallback r2 = r6.mActionBarVisibilityCallback
            r2.hideForSystem()
            goto L38
        L33:
            androidx.appcompat.widget.ActionBarOverlayLayout$ActionBarVisibilityCallback r2 = r6.mActionBarVisibilityCallback
            r2.showForSystem()
        L38:
            r2 = r0 & 256(0x100, float:3.59E-43)
            if (r2 == 0) goto L43
            androidx.appcompat.widget.ActionBarOverlayLayout$ActionBarVisibilityCallback r2 = r6.mActionBarVisibilityCallback
            if (r2 == 0) goto L43
            androidx.core.view.ViewCompat.requestApplyInsets(r6)
        L43:
            return
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int r2) {
            r1 = this;
            super.onWindowVisibilityChanged(r2)
            r1.mWindowVisibility = r2
            androidx.appcompat.widget.ActionBarOverlayLayout$ActionBarVisibilityCallback r0 = r1.mActionBarVisibilityCallback
            if (r0 == 0) goto Le
            androidx.appcompat.widget.ActionBarOverlayLayout$ActionBarVisibilityCallback r0 = r1.mActionBarVisibilityCallback
            r0.onWindowVisibilityChanged(r2)
        Le:
            return
    }

    void pullChildren() {
            r1 = this;
            androidx.appcompat.widget.ContentFrameLayout r0 = r1.mContent
            if (r0 != 0) goto L24
            int r0 = androidx.appcompat.R.id.action_bar_activity_content
            android.view.View r0 = r1.findViewById(r0)
            androidx.appcompat.widget.ContentFrameLayout r0 = (androidx.appcompat.widget.ContentFrameLayout) r0
            r1.mContent = r0
            int r0 = androidx.appcompat.R.id.action_bar_container
            android.view.View r0 = r1.findViewById(r0)
            androidx.appcompat.widget.ActionBarContainer r0 = (androidx.appcompat.widget.ActionBarContainer) r0
            r1.mActionBarTop = r0
            int r0 = androidx.appcompat.R.id.action_bar
            android.view.View r0 = r1.findViewById(r0)
            androidx.appcompat.widget.DecorToolbar r0 = r1.getDecorToolbar(r0)
            r1.mDecorToolbar = r0
        L24:
            return
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public void restoreToolbarHierarchyState(android.util.SparseArray<android.os.Parcelable> r2) {
            r1 = this;
            r1.pullChildren()
            androidx.appcompat.widget.DecorToolbar r0 = r1.mDecorToolbar
            r0.restoreHierarchyState(r2)
            return
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public void saveToolbarHierarchyState(android.util.SparseArray<android.os.Parcelable> r2) {
            r1 = this;
            r1.pullChildren()
            androidx.appcompat.widget.DecorToolbar r0 = r1.mDecorToolbar
            r0.saveHierarchyState(r2)
            return
    }

    public void setActionBarHideOffset(int r4) {
            r3 = this;
            r3.haltActionBarHideOffsetAnimations()
            androidx.appcompat.widget.ActionBarContainer r0 = r3.mActionBarTop
            int r0 = r0.getHeight()
            r1 = 0
            int r2 = java.lang.Math.min(r4, r0)
            int r4 = java.lang.Math.max(r1, r2)
            androidx.appcompat.widget.ActionBarContainer r1 = r3.mActionBarTop
            int r2 = -r4
            float r2 = (float) r2
            r1.setTranslationY(r2)
            return
    }

    public void setActionBarVisibilityCallback(androidx.appcompat.widget.ActionBarOverlayLayout.ActionBarVisibilityCallback r3) {
            r2 = this;
            r2.mActionBarVisibilityCallback = r3
            android.os.IBinder r0 = r2.getWindowToken()
            if (r0 == 0) goto L1b
            androidx.appcompat.widget.ActionBarOverlayLayout$ActionBarVisibilityCallback r0 = r2.mActionBarVisibilityCallback
            int r1 = r2.mWindowVisibility
            r0.onWindowVisibilityChanged(r1)
            int r0 = r2.mLastSystemUiVisibility
            if (r0 == 0) goto L1b
            int r0 = r2.mLastSystemUiVisibility
            r2.onWindowSystemUiVisibilityChanged(r0)
            androidx.core.view.ViewCompat.requestApplyInsets(r2)
        L1b:
            return
    }

    public void setHasNonEmbeddedTabs(boolean r1) {
            r0 = this;
            r0.mHasNonEmbeddedTabs = r1
            return
    }

    public void setHideOnContentScrollEnabled(boolean r2) {
            r1 = this;
            boolean r0 = r1.mHideOnContentScroll
            if (r2 == r0) goto Lf
            r1.mHideOnContentScroll = r2
            if (r2 != 0) goto Lf
            r1.haltActionBarHideOffsetAnimations()
            r0 = 0
            r1.setActionBarHideOffset(r0)
        Lf:
            return
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public void setIcon(int r2) {
            r1 = this;
            r1.pullChildren()
            androidx.appcompat.widget.DecorToolbar r0 = r1.mDecorToolbar
            r0.setIcon(r2)
            return
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public void setIcon(android.graphics.drawable.Drawable r2) {
            r1 = this;
            r1.pullChildren()
            androidx.appcompat.widget.DecorToolbar r0 = r1.mDecorToolbar
            r0.setIcon(r2)
            return
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public void setLogo(int r2) {
            r1 = this;
            r1.pullChildren()
            androidx.appcompat.widget.DecorToolbar r0 = r1.mDecorToolbar
            r0.setLogo(r2)
            return
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public void setMenu(android.view.Menu r2, androidx.appcompat.view.menu.MenuPresenter.Callback r3) {
            r1 = this;
            r1.pullChildren()
            androidx.appcompat.widget.DecorToolbar r0 = r1.mDecorToolbar
            r0.setMenu(r2, r3)
            return
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public void setMenuPrepared() {
            r1 = this;
            r1.pullChildren()
            androidx.appcompat.widget.DecorToolbar r0 = r1.mDecorToolbar
            r0.setMenuPrepared()
            return
    }

    public void setOverlayMode(boolean r1) {
            r0 = this;
            r0.mOverlayMode = r1
            return
    }

    public void setShowingForActionMode(boolean r1) {
            r0 = this;
            return
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public void setUiOptions(int r1) {
            r0 = this;
            return
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public void setWindowCallback(android.view.Window.Callback r2) {
            r1 = this;
            r1.pullChildren()
            androidx.appcompat.widget.DecorToolbar r0 = r1.mDecorToolbar
            r0.setWindowCallback(r2)
            return
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public void setWindowTitle(java.lang.CharSequence r2) {
            r1 = this;
            r1.pullChildren()
            androidx.appcompat.widget.DecorToolbar r0 = r1.mDecorToolbar
            r0.setWindowTitle(r2)
            return
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public boolean showOverflowMenu() {
            r1 = this;
            r1.pullChildren()
            androidx.appcompat.widget.DecorToolbar r0 = r1.mDecorToolbar
            boolean r0 = r0.showOverflowMenu()
            return r0
    }
}
