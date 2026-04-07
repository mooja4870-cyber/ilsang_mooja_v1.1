package androidx.appcompat.app;

/* JADX INFO: loaded from: classes.dex */
public class WindowDecorActionBar extends androidx.appcompat.app.ActionBar implements androidx.appcompat.widget.ActionBarOverlayLayout.ActionBarVisibilityCallback {
    private static final long FADE_IN_DURATION_MS = 200;
    private static final long FADE_OUT_DURATION_MS = 100;
    private static final int INVALID_POSITION = -1;
    private static final java.lang.String TAG = "WindowDecorActionBar";
    private static final android.view.animation.Interpolator sHideInterpolator = null;
    private static final android.view.animation.Interpolator sShowInterpolator = null;
    androidx.appcompat.app.WindowDecorActionBar.ActionModeImpl mActionMode;
    private android.app.Activity mActivity;
    androidx.appcompat.widget.ActionBarContainer mContainerView;
    boolean mContentAnimations;
    android.view.View mContentView;
    android.content.Context mContext;
    androidx.appcompat.widget.ActionBarContextView mContextView;
    private int mCurWindowVisibility;
    androidx.appcompat.view.ViewPropertyAnimatorCompatSet mCurrentShowAnim;
    androidx.appcompat.widget.DecorToolbar mDecorToolbar;
    androidx.appcompat.view.ActionMode mDeferredDestroyActionMode;
    androidx.appcompat.view.ActionMode.Callback mDeferredModeDestroyCallback;
    private boolean mDisplayHomeAsUpSet;
    private boolean mHasEmbeddedTabs;
    boolean mHiddenByApp;
    boolean mHiddenBySystem;
    final androidx.core.view.ViewPropertyAnimatorListener mHideListener;
    boolean mHideOnContentScroll;
    private boolean mLastMenuVisibility;
    private java.util.ArrayList<androidx.appcompat.app.ActionBar.OnMenuVisibilityListener> mMenuVisibilityListeners;
    private boolean mNowShowing;
    androidx.appcompat.widget.ActionBarOverlayLayout mOverlayLayout;
    private int mSavedTabPosition;
    private androidx.appcompat.app.WindowDecorActionBar.TabImpl mSelectedTab;
    private boolean mShowHideAnimationEnabled;
    final androidx.core.view.ViewPropertyAnimatorListener mShowListener;
    private boolean mShowingForMode;
    androidx.appcompat.widget.ScrollingTabContainerView mTabScrollView;
    private java.util.ArrayList<androidx.appcompat.app.WindowDecorActionBar.TabImpl> mTabs;
    private android.content.Context mThemedContext;
    final androidx.core.view.ViewPropertyAnimatorUpdateListener mUpdateListener;




    public class ActionModeImpl extends androidx.appcompat.view.ActionMode implements androidx.appcompat.view.menu.MenuBuilder.Callback {
        private final android.content.Context mActionModeContext;
        private androidx.appcompat.view.ActionMode.Callback mCallback;
        private java.lang.ref.WeakReference<android.view.View> mCustomView;
        private final androidx.appcompat.view.menu.MenuBuilder mMenu;
        final /* synthetic */ androidx.appcompat.app.WindowDecorActionBar this$0;

        public ActionModeImpl(androidx.appcompat.app.WindowDecorActionBar r3, android.content.Context r4, androidx.appcompat.view.ActionMode.Callback r5) {
                r2 = this;
                r2.this$0 = r3
                r2.<init>()
                r2.mActionModeContext = r4
                r2.mCallback = r5
                androidx.appcompat.view.menu.MenuBuilder r0 = new androidx.appcompat.view.menu.MenuBuilder
                r0.<init>(r4)
                r1 = 1
                androidx.appcompat.view.menu.MenuBuilder r0 = r0.setDefaultShowAsAction(r1)
                r2.mMenu = r0
                androidx.appcompat.view.menu.MenuBuilder r0 = r2.mMenu
                r0.setCallback(r2)
                return
        }

        public boolean dispatchOnCreate() {
                r2 = this;
                androidx.appcompat.view.menu.MenuBuilder r0 = r2.mMenu
                r0.stopDispatchingItemsChanged()
                androidx.appcompat.view.ActionMode$Callback r0 = r2.mCallback     // Catch: java.lang.Throwable -> L13
                androidx.appcompat.view.menu.MenuBuilder r1 = r2.mMenu     // Catch: java.lang.Throwable -> L13
                boolean r0 = r0.onCreateActionMode(r2, r1)     // Catch: java.lang.Throwable -> L13
                androidx.appcompat.view.menu.MenuBuilder r1 = r2.mMenu
                r1.startDispatchingItemsChanged()
                return r0
            L13:
                r0 = move-exception
                androidx.appcompat.view.menu.MenuBuilder r1 = r2.mMenu
                r1.startDispatchingItemsChanged()
                throw r0
        }

        @Override // androidx.appcompat.view.ActionMode
        public void finish() {
                r3 = this;
                androidx.appcompat.app.WindowDecorActionBar r0 = r3.this$0
                androidx.appcompat.app.WindowDecorActionBar$ActionModeImpl r0 = r0.mActionMode
                if (r0 == r3) goto L7
                return
            L7:
                androidx.appcompat.app.WindowDecorActionBar r0 = r3.this$0
                boolean r0 = r0.mHiddenByApp
                androidx.appcompat.app.WindowDecorActionBar r1 = r3.this$0
                boolean r1 = r1.mHiddenBySystem
                r2 = 0
                boolean r0 = androidx.appcompat.app.WindowDecorActionBar.checkShowingFlags(r0, r1, r2)
                if (r0 != 0) goto L21
                androidx.appcompat.app.WindowDecorActionBar r0 = r3.this$0
                r0.mDeferredDestroyActionMode = r3
                androidx.appcompat.app.WindowDecorActionBar r0 = r3.this$0
                androidx.appcompat.view.ActionMode$Callback r1 = r3.mCallback
                r0.mDeferredModeDestroyCallback = r1
                goto L26
            L21:
                androidx.appcompat.view.ActionMode$Callback r0 = r3.mCallback
                r0.onDestroyActionMode(r3)
            L26:
                r0 = 0
                r3.mCallback = r0
                androidx.appcompat.app.WindowDecorActionBar r1 = r3.this$0
                r1.animateToMode(r2)
                androidx.appcompat.app.WindowDecorActionBar r1 = r3.this$0
                androidx.appcompat.widget.ActionBarContextView r1 = r1.mContextView
                r1.closeMode()
                androidx.appcompat.app.WindowDecorActionBar r1 = r3.this$0
                androidx.appcompat.widget.ActionBarOverlayLayout r1 = r1.mOverlayLayout
                androidx.appcompat.app.WindowDecorActionBar r2 = r3.this$0
                boolean r2 = r2.mHideOnContentScroll
                r1.setHideOnContentScrollEnabled(r2)
                androidx.appcompat.app.WindowDecorActionBar r1 = r3.this$0
                r1.mActionMode = r0
                return
        }

        @Override // androidx.appcompat.view.ActionMode
        public android.view.View getCustomView() {
                r1 = this;
                java.lang.ref.WeakReference<android.view.View> r0 = r1.mCustomView
                if (r0 == 0) goto Ld
                java.lang.ref.WeakReference<android.view.View> r0 = r1.mCustomView
                java.lang.Object r0 = r0.get()
                android.view.View r0 = (android.view.View) r0
                goto Le
            Ld:
                r0 = 0
            Le:
                return r0
        }

        @Override // androidx.appcompat.view.ActionMode
        public android.view.Menu getMenu() {
                r1 = this;
                androidx.appcompat.view.menu.MenuBuilder r0 = r1.mMenu
                return r0
        }

        @Override // androidx.appcompat.view.ActionMode
        public android.view.MenuInflater getMenuInflater() {
                r2 = this;
                androidx.appcompat.view.SupportMenuInflater r0 = new androidx.appcompat.view.SupportMenuInflater
                android.content.Context r1 = r2.mActionModeContext
                r0.<init>(r1)
                return r0
        }

        @Override // androidx.appcompat.view.ActionMode
        public java.lang.CharSequence getSubtitle() {
                r1 = this;
                androidx.appcompat.app.WindowDecorActionBar r0 = r1.this$0
                androidx.appcompat.widget.ActionBarContextView r0 = r0.mContextView
                java.lang.CharSequence r0 = r0.getSubtitle()
                return r0
        }

        @Override // androidx.appcompat.view.ActionMode
        public java.lang.CharSequence getTitle() {
                r1 = this;
                androidx.appcompat.app.WindowDecorActionBar r0 = r1.this$0
                androidx.appcompat.widget.ActionBarContextView r0 = r0.mContextView
                java.lang.CharSequence r0 = r0.getTitle()
                return r0
        }

        @Override // androidx.appcompat.view.ActionMode
        public void invalidate() {
                r2 = this;
                androidx.appcompat.app.WindowDecorActionBar r0 = r2.this$0
                androidx.appcompat.app.WindowDecorActionBar$ActionModeImpl r0 = r0.mActionMode
                if (r0 == r2) goto L7
                return
            L7:
                androidx.appcompat.view.menu.MenuBuilder r0 = r2.mMenu
                r0.stopDispatchingItemsChanged()
                androidx.appcompat.view.ActionMode$Callback r0 = r2.mCallback     // Catch: java.lang.Throwable -> L1a
                androidx.appcompat.view.menu.MenuBuilder r1 = r2.mMenu     // Catch: java.lang.Throwable -> L1a
                r0.onPrepareActionMode(r2, r1)     // Catch: java.lang.Throwable -> L1a
                androidx.appcompat.view.menu.MenuBuilder r0 = r2.mMenu
                r0.startDispatchingItemsChanged()
                return
            L1a:
                r0 = move-exception
                androidx.appcompat.view.menu.MenuBuilder r1 = r2.mMenu
                r1.startDispatchingItemsChanged()
                throw r0
        }

        @Override // androidx.appcompat.view.ActionMode
        public boolean isTitleOptional() {
                r1 = this;
                androidx.appcompat.app.WindowDecorActionBar r0 = r1.this$0
                androidx.appcompat.widget.ActionBarContextView r0 = r0.mContextView
                boolean r0 = r0.isTitleOptional()
                return r0
        }

        public void onCloseMenu(androidx.appcompat.view.menu.MenuBuilder r1, boolean r2) {
                r0 = this;
                return
        }

        public void onCloseSubMenu(androidx.appcompat.view.menu.SubMenuBuilder r1) {
                r0 = this;
                return
        }

        @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
        public boolean onMenuItemSelected(androidx.appcompat.view.menu.MenuBuilder r2, android.view.MenuItem r3) {
                r1 = this;
                androidx.appcompat.view.ActionMode$Callback r0 = r1.mCallback
                if (r0 == 0) goto Lb
                androidx.appcompat.view.ActionMode$Callback r0 = r1.mCallback
                boolean r0 = r0.onActionItemClicked(r1, r3)
                return r0
            Lb:
                r0 = 0
                return r0
        }

        @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
        public void onMenuModeChange(androidx.appcompat.view.menu.MenuBuilder r2) {
                r1 = this;
                androidx.appcompat.view.ActionMode$Callback r0 = r1.mCallback
                if (r0 != 0) goto L5
                return
            L5:
                r1.invalidate()
                androidx.appcompat.app.WindowDecorActionBar r0 = r1.this$0
                androidx.appcompat.widget.ActionBarContextView r0 = r0.mContextView
                r0.showOverflowMenu()
                return
        }

        public boolean onSubMenuSelected(androidx.appcompat.view.menu.SubMenuBuilder r4) {
                r3 = this;
                androidx.appcompat.view.ActionMode$Callback r0 = r3.mCallback
                if (r0 != 0) goto L6
                r0 = 0
                return r0
            L6:
                boolean r0 = r4.hasVisibleItems()
                r1 = 1
                if (r0 != 0) goto Le
                return r1
            Le:
                androidx.appcompat.view.menu.MenuPopupHelper r0 = new androidx.appcompat.view.menu.MenuPopupHelper
                androidx.appcompat.app.WindowDecorActionBar r2 = r3.this$0
                android.content.Context r2 = r2.getThemedContext()
                r0.<init>(r2, r4)
                r0.show()
                return r1
        }

        @Override // androidx.appcompat.view.ActionMode
        public void setCustomView(android.view.View r2) {
                r1 = this;
                androidx.appcompat.app.WindowDecorActionBar r0 = r1.this$0
                androidx.appcompat.widget.ActionBarContextView r0 = r0.mContextView
                r0.setCustomView(r2)
                java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
                r0.<init>(r2)
                r1.mCustomView = r0
                return
        }

        @Override // androidx.appcompat.view.ActionMode
        public void setSubtitle(int r2) {
                r1 = this;
                androidx.appcompat.app.WindowDecorActionBar r0 = r1.this$0
                android.content.Context r0 = r0.mContext
                android.content.res.Resources r0 = r0.getResources()
                java.lang.String r0 = r0.getString(r2)
                r1.setSubtitle(r0)
                return
        }

        @Override // androidx.appcompat.view.ActionMode
        public void setSubtitle(java.lang.CharSequence r2) {
                r1 = this;
                androidx.appcompat.app.WindowDecorActionBar r0 = r1.this$0
                androidx.appcompat.widget.ActionBarContextView r0 = r0.mContextView
                r0.setSubtitle(r2)
                return
        }

        @Override // androidx.appcompat.view.ActionMode
        public void setTitle(int r2) {
                r1 = this;
                androidx.appcompat.app.WindowDecorActionBar r0 = r1.this$0
                android.content.Context r0 = r0.mContext
                android.content.res.Resources r0 = r0.getResources()
                java.lang.String r0 = r0.getString(r2)
                r1.setTitle(r0)
                return
        }

        @Override // androidx.appcompat.view.ActionMode
        public void setTitle(java.lang.CharSequence r2) {
                r1 = this;
                androidx.appcompat.app.WindowDecorActionBar r0 = r1.this$0
                androidx.appcompat.widget.ActionBarContextView r0 = r0.mContextView
                r0.setTitle(r2)
                return
        }

        @Override // androidx.appcompat.view.ActionMode
        public void setTitleOptionalHint(boolean r2) {
                r1 = this;
                super.setTitleOptionalHint(r2)
                androidx.appcompat.app.WindowDecorActionBar r0 = r1.this$0
                androidx.appcompat.widget.ActionBarContextView r0 = r0.mContextView
                r0.setTitleOptional(r2)
                return
        }
    }

    public class TabImpl extends androidx.appcompat.app.ActionBar.Tab {
        private androidx.appcompat.app.ActionBar.TabListener mCallback;
        private java.lang.CharSequence mContentDesc;
        private android.view.View mCustomView;
        private android.graphics.drawable.Drawable mIcon;
        private int mPosition;
        private java.lang.Object mTag;
        private java.lang.CharSequence mText;
        final /* synthetic */ androidx.appcompat.app.WindowDecorActionBar this$0;

        public TabImpl(androidx.appcompat.app.WindowDecorActionBar r2) {
                r1 = this;
                r1.this$0 = r2
                r1.<init>()
                r0 = -1
                r1.mPosition = r0
                return
        }

        public androidx.appcompat.app.ActionBar.TabListener getCallback() {
                r1 = this;
                androidx.appcompat.app.ActionBar$TabListener r0 = r1.mCallback
                return r0
        }

        @Override // androidx.appcompat.app.ActionBar.Tab
        public java.lang.CharSequence getContentDescription() {
                r1 = this;
                java.lang.CharSequence r0 = r1.mContentDesc
                return r0
        }

        @Override // androidx.appcompat.app.ActionBar.Tab
        public android.view.View getCustomView() {
                r1 = this;
                android.view.View r0 = r1.mCustomView
                return r0
        }

        @Override // androidx.appcompat.app.ActionBar.Tab
        public android.graphics.drawable.Drawable getIcon() {
                r1 = this;
                android.graphics.drawable.Drawable r0 = r1.mIcon
                return r0
        }

        @Override // androidx.appcompat.app.ActionBar.Tab
        public int getPosition() {
                r1 = this;
                int r0 = r1.mPosition
                return r0
        }

        @Override // androidx.appcompat.app.ActionBar.Tab
        public java.lang.Object getTag() {
                r1 = this;
                java.lang.Object r0 = r1.mTag
                return r0
        }

        @Override // androidx.appcompat.app.ActionBar.Tab
        public java.lang.CharSequence getText() {
                r1 = this;
                java.lang.CharSequence r0 = r1.mText
                return r0
        }

        @Override // androidx.appcompat.app.ActionBar.Tab
        public void select() {
                r1 = this;
                androidx.appcompat.app.WindowDecorActionBar r0 = r1.this$0
                r0.selectTab(r1)
                return
        }

        @Override // androidx.appcompat.app.ActionBar.Tab
        public androidx.appcompat.app.ActionBar.Tab setContentDescription(int r2) {
                r1 = this;
                androidx.appcompat.app.WindowDecorActionBar r0 = r1.this$0
                android.content.Context r0 = r0.mContext
                android.content.res.Resources r0 = r0.getResources()
                java.lang.CharSequence r0 = r0.getText(r2)
                androidx.appcompat.app.ActionBar$Tab r0 = r1.setContentDescription(r0)
                return r0
        }

        @Override // androidx.appcompat.app.ActionBar.Tab
        public androidx.appcompat.app.ActionBar.Tab setContentDescription(java.lang.CharSequence r3) {
                r2 = this;
                r2.mContentDesc = r3
                int r0 = r2.mPosition
                if (r0 < 0) goto Lf
                androidx.appcompat.app.WindowDecorActionBar r0 = r2.this$0
                androidx.appcompat.widget.ScrollingTabContainerView r0 = r0.mTabScrollView
                int r1 = r2.mPosition
                r0.updateTab(r1)
            Lf:
                return r2
        }

        @Override // androidx.appcompat.app.ActionBar.Tab
        public androidx.appcompat.app.ActionBar.Tab setCustomView(int r3) {
                r2 = this;
                androidx.appcompat.app.WindowDecorActionBar r0 = r2.this$0
                android.content.Context r0 = r0.getThemedContext()
                android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
                r1 = 0
                android.view.View r0 = r0.inflate(r3, r1)
                androidx.appcompat.app.ActionBar$Tab r0 = r2.setCustomView(r0)
                return r0
        }

        @Override // androidx.appcompat.app.ActionBar.Tab
        public androidx.appcompat.app.ActionBar.Tab setCustomView(android.view.View r3) {
                r2 = this;
                r2.mCustomView = r3
                int r0 = r2.mPosition
                if (r0 < 0) goto Lf
                androidx.appcompat.app.WindowDecorActionBar r0 = r2.this$0
                androidx.appcompat.widget.ScrollingTabContainerView r0 = r0.mTabScrollView
                int r1 = r2.mPosition
                r0.updateTab(r1)
            Lf:
                return r2
        }

        @Override // androidx.appcompat.app.ActionBar.Tab
        public androidx.appcompat.app.ActionBar.Tab setIcon(int r2) {
                r1 = this;
                androidx.appcompat.app.WindowDecorActionBar r0 = r1.this$0
                android.content.Context r0 = r0.mContext
                android.graphics.drawable.Drawable r0 = androidx.appcompat.content.res.AppCompatResources.getDrawable(r0, r2)
                androidx.appcompat.app.ActionBar$Tab r0 = r1.setIcon(r0)
                return r0
        }

        @Override // androidx.appcompat.app.ActionBar.Tab
        public androidx.appcompat.app.ActionBar.Tab setIcon(android.graphics.drawable.Drawable r3) {
                r2 = this;
                r2.mIcon = r3
                int r0 = r2.mPosition
                if (r0 < 0) goto Lf
                androidx.appcompat.app.WindowDecorActionBar r0 = r2.this$0
                androidx.appcompat.widget.ScrollingTabContainerView r0 = r0.mTabScrollView
                int r1 = r2.mPosition
                r0.updateTab(r1)
            Lf:
                return r2
        }

        public void setPosition(int r1) {
                r0 = this;
                r0.mPosition = r1
                return
        }

        @Override // androidx.appcompat.app.ActionBar.Tab
        public androidx.appcompat.app.ActionBar.Tab setTabListener(androidx.appcompat.app.ActionBar.TabListener r1) {
                r0 = this;
                r0.mCallback = r1
                return r0
        }

        @Override // androidx.appcompat.app.ActionBar.Tab
        public androidx.appcompat.app.ActionBar.Tab setTag(java.lang.Object r1) {
                r0 = this;
                r0.mTag = r1
                return r0
        }

        @Override // androidx.appcompat.app.ActionBar.Tab
        public androidx.appcompat.app.ActionBar.Tab setText(int r2) {
                r1 = this;
                androidx.appcompat.app.WindowDecorActionBar r0 = r1.this$0
                android.content.Context r0 = r0.mContext
                android.content.res.Resources r0 = r0.getResources()
                java.lang.CharSequence r0 = r0.getText(r2)
                androidx.appcompat.app.ActionBar$Tab r0 = r1.setText(r0)
                return r0
        }

        @Override // androidx.appcompat.app.ActionBar.Tab
        public androidx.appcompat.app.ActionBar.Tab setText(java.lang.CharSequence r3) {
                r2 = this;
                r2.mText = r3
                int r0 = r2.mPosition
                if (r0 < 0) goto Lf
                androidx.appcompat.app.WindowDecorActionBar r0 = r2.this$0
                androidx.appcompat.widget.ScrollingTabContainerView r0 = r0.mTabScrollView
                int r1 = r2.mPosition
                r0.updateTab(r1)
            Lf:
                return r2
        }
    }

    static {
            android.view.animation.AccelerateInterpolator r0 = new android.view.animation.AccelerateInterpolator
            r0.<init>()
            androidx.appcompat.app.WindowDecorActionBar.sHideInterpolator = r0
            android.view.animation.DecelerateInterpolator r0 = new android.view.animation.DecelerateInterpolator
            r0.<init>()
            androidx.appcompat.app.WindowDecorActionBar.sShowInterpolator = r0
            return
    }

    public WindowDecorActionBar(android.app.Activity r4, boolean r5) {
            r3 = this;
            r3.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.mTabs = r0
            r0 = -1
            r3.mSavedTabPosition = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.mMenuVisibilityListeners = r0
            r0 = 0
            r3.mCurWindowVisibility = r0
            r0 = 1
            r3.mContentAnimations = r0
            r3.mNowShowing = r0
            androidx.appcompat.app.WindowDecorActionBar$1 r0 = new androidx.appcompat.app.WindowDecorActionBar$1
            r0.<init>(r3)
            r3.mHideListener = r0
            androidx.appcompat.app.WindowDecorActionBar$2 r0 = new androidx.appcompat.app.WindowDecorActionBar$2
            r0.<init>(r3)
            r3.mShowListener = r0
            androidx.appcompat.app.WindowDecorActionBar$3 r0 = new androidx.appcompat.app.WindowDecorActionBar$3
            r0.<init>(r3)
            r3.mUpdateListener = r0
            r3.mActivity = r4
            android.view.Window r0 = r4.getWindow()
            android.view.View r1 = r0.getDecorView()
            r3.init(r1)
            if (r5 != 0) goto L49
            r2 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r2 = r1.findViewById(r2)
            r3.mContentView = r2
        L49:
            return
    }

    public WindowDecorActionBar(android.app.Dialog r2) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.mTabs = r0
            r0 = -1
            r1.mSavedTabPosition = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.mMenuVisibilityListeners = r0
            r0 = 0
            r1.mCurWindowVisibility = r0
            r0 = 1
            r1.mContentAnimations = r0
            r1.mNowShowing = r0
            androidx.appcompat.app.WindowDecorActionBar$1 r0 = new androidx.appcompat.app.WindowDecorActionBar$1
            r0.<init>(r1)
            r1.mHideListener = r0
            androidx.appcompat.app.WindowDecorActionBar$2 r0 = new androidx.appcompat.app.WindowDecorActionBar$2
            r0.<init>(r1)
            r1.mShowListener = r0
            androidx.appcompat.app.WindowDecorActionBar$3 r0 = new androidx.appcompat.app.WindowDecorActionBar$3
            r0.<init>(r1)
            r1.mUpdateListener = r0
            android.view.Window r0 = r2.getWindow()
            android.view.View r0 = r0.getDecorView()
            r1.init(r0)
            return
    }

    public WindowDecorActionBar(android.view.View r2) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.mTabs = r0
            r0 = -1
            r1.mSavedTabPosition = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.mMenuVisibilityListeners = r0
            r0 = 0
            r1.mCurWindowVisibility = r0
            r0 = 1
            r1.mContentAnimations = r0
            r1.mNowShowing = r0
            androidx.appcompat.app.WindowDecorActionBar$1 r0 = new androidx.appcompat.app.WindowDecorActionBar$1
            r0.<init>(r1)
            r1.mHideListener = r0
            androidx.appcompat.app.WindowDecorActionBar$2 r0 = new androidx.appcompat.app.WindowDecorActionBar$2
            r0.<init>(r1)
            r1.mShowListener = r0
            androidx.appcompat.app.WindowDecorActionBar$3 r0 = new androidx.appcompat.app.WindowDecorActionBar$3
            r0.<init>(r1)
            r1.mUpdateListener = r0
            r1.init(r2)
            return
    }

    static boolean checkShowingFlags(boolean r1, boolean r2, boolean r3) {
            r0 = 1
            if (r3 == 0) goto L4
            return r0
        L4:
            if (r1 != 0) goto La
            if (r2 == 0) goto L9
            goto La
        L9:
            return r0
        La:
            r0 = 0
            return r0
    }

    private void cleanupTabs() {
            r1 = this;
            androidx.appcompat.app.WindowDecorActionBar$TabImpl r0 = r1.mSelectedTab
            if (r0 == 0) goto L8
            r0 = 0
            r1.selectTab(r0)
        L8:
            java.util.ArrayList<androidx.appcompat.app.WindowDecorActionBar$TabImpl> r0 = r1.mTabs
            r0.clear()
            androidx.appcompat.widget.ScrollingTabContainerView r0 = r1.mTabScrollView
            if (r0 == 0) goto L16
            androidx.appcompat.widget.ScrollingTabContainerView r0 = r1.mTabScrollView
            r0.removeAllTabs()
        L16:
            r0 = -1
            r1.mSavedTabPosition = r0
            return
    }

    private void configureTab(androidx.appcompat.app.ActionBar.Tab r6, int r7) {
            r5 = this;
            r0 = r6
            androidx.appcompat.app.WindowDecorActionBar$TabImpl r0 = (androidx.appcompat.app.WindowDecorActionBar.TabImpl) r0
            androidx.appcompat.app.ActionBar$TabListener r1 = r0.getCallback()
            if (r1 == 0) goto L2a
            r0.setPosition(r7)
            java.util.ArrayList<androidx.appcompat.app.WindowDecorActionBar$TabImpl> r2 = r5.mTabs
            r2.add(r7, r0)
            java.util.ArrayList<androidx.appcompat.app.WindowDecorActionBar$TabImpl> r2 = r5.mTabs
            int r2 = r2.size()
            int r3 = r7 + 1
        L19:
            if (r3 >= r2) goto L29
            java.util.ArrayList<androidx.appcompat.app.WindowDecorActionBar$TabImpl> r4 = r5.mTabs
            java.lang.Object r4 = r4.get(r3)
            androidx.appcompat.app.WindowDecorActionBar$TabImpl r4 = (androidx.appcompat.app.WindowDecorActionBar.TabImpl) r4
            r4.setPosition(r3)
            int r3 = r3 + 1
            goto L19
        L29:
            return
        L2a:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "Action Bar Tab must have a Callback"
            r2.<init>(r3)
            throw r2
    }

    private void ensureTabsExist() {
            r4 = this;
            androidx.appcompat.widget.ScrollingTabContainerView r0 = r4.mTabScrollView
            if (r0 == 0) goto L5
            return
        L5:
            androidx.appcompat.widget.ScrollingTabContainerView r0 = new androidx.appcompat.widget.ScrollingTabContainerView
            android.content.Context r1 = r4.mContext
            r0.<init>(r1)
            boolean r1 = r4.mHasEmbeddedTabs
            r2 = 0
            if (r1 == 0) goto L1a
            r0.setVisibility(r2)
            androidx.appcompat.widget.DecorToolbar r1 = r4.mDecorToolbar
            r1.setEmbeddedTabView(r0)
            goto L38
        L1a:
            int r1 = r4.getNavigationMode()
            r3 = 2
            if (r1 != r3) goto L2e
            r0.setVisibility(r2)
            androidx.appcompat.widget.ActionBarOverlayLayout r1 = r4.mOverlayLayout
            if (r1 == 0) goto L33
            androidx.appcompat.widget.ActionBarOverlayLayout r1 = r4.mOverlayLayout
            androidx.core.view.ViewCompat.requestApplyInsets(r1)
            goto L33
        L2e:
            r1 = 8
            r0.setVisibility(r1)
        L33:
            androidx.appcompat.widget.ActionBarContainer r1 = r4.mContainerView
            r1.setTabContainer(r0)
        L38:
            r4.mTabScrollView = r0
            return
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
            if (r4 == 0) goto L2c
            java.lang.Class r2 = r4.getClass()
            java.lang.String r2 = r2.getSimpleName()
            goto L2e
        L2c:
            java.lang.String r2 = "null"
        L2e:
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    private void hideForActionMode() {
            r2 = this;
            boolean r0 = r2.mShowingForMode
            if (r0 == 0) goto L13
            r0 = 0
            r2.mShowingForMode = r0
            androidx.appcompat.widget.ActionBarOverlayLayout r1 = r2.mOverlayLayout
            if (r1 == 0) goto L10
            androidx.appcompat.widget.ActionBarOverlayLayout r1 = r2.mOverlayLayout
            r1.setShowingForActionMode(r0)
        L10:
            r2.updateVisibility(r0)
        L13:
            return
    }

    private void init(android.view.View r10) {
            r9 = this;
            int r0 = androidx.appcompat.R.id.decor_content_parent
            android.view.View r0 = r10.findViewById(r0)
            androidx.appcompat.widget.ActionBarOverlayLayout r0 = (androidx.appcompat.widget.ActionBarOverlayLayout) r0
            r9.mOverlayLayout = r0
            androidx.appcompat.widget.ActionBarOverlayLayout r0 = r9.mOverlayLayout
            if (r0 == 0) goto L13
            androidx.appcompat.widget.ActionBarOverlayLayout r0 = r9.mOverlayLayout
            r0.setActionBarVisibilityCallback(r9)
        L13:
            int r0 = androidx.appcompat.R.id.action_bar
            android.view.View r0 = r10.findViewById(r0)
            androidx.appcompat.widget.DecorToolbar r0 = r9.getDecorToolbar(r0)
            r9.mDecorToolbar = r0
            int r0 = androidx.appcompat.R.id.action_context_bar
            android.view.View r0 = r10.findViewById(r0)
            androidx.appcompat.widget.ActionBarContextView r0 = (androidx.appcompat.widget.ActionBarContextView) r0
            r9.mContextView = r0
            int r0 = androidx.appcompat.R.id.action_bar_container
            android.view.View r0 = r10.findViewById(r0)
            androidx.appcompat.widget.ActionBarContainer r0 = (androidx.appcompat.widget.ActionBarContainer) r0
            r9.mContainerView = r0
            androidx.appcompat.widget.DecorToolbar r0 = r9.mDecorToolbar
            if (r0 == 0) goto L9c
            androidx.appcompat.widget.ActionBarContextView r0 = r9.mContextView
            if (r0 == 0) goto L9c
            androidx.appcompat.widget.ActionBarContainer r0 = r9.mContainerView
            if (r0 == 0) goto L9c
            androidx.appcompat.widget.DecorToolbar r0 = r9.mDecorToolbar
            android.content.Context r0 = r0.getContext()
            r9.mContext = r0
            androidx.appcompat.widget.DecorToolbar r0 = r9.mDecorToolbar
            int r0 = r0.getDisplayOptions()
            r1 = r0 & 4
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L55
            r1 = r2
            goto L56
        L55:
            r1 = r3
        L56:
            if (r1 == 0) goto L5a
            r9.mDisplayHomeAsUpSet = r2
        L5a:
            android.content.Context r4 = r9.mContext
            androidx.appcompat.view.ActionBarPolicy r4 = androidx.appcompat.view.ActionBarPolicy.get(r4)
            boolean r5 = r4.enableHomeButtonByDefault()
            if (r5 != 0) goto L6b
            if (r1 == 0) goto L69
            goto L6b
        L69:
            r5 = r3
            goto L6c
        L6b:
            r5 = r2
        L6c:
            r9.setHomeButtonEnabled(r5)
            boolean r5 = r4.hasEmbeddedTabs()
            r9.setHasEmbeddedTabs(r5)
            android.content.Context r5 = r9.mContext
            int[] r6 = androidx.appcompat.R.styleable.ActionBar
            int r7 = androidx.appcompat.R.attr.actionBarStyle
            r8 = 0
            android.content.res.TypedArray r5 = r5.obtainStyledAttributes(r8, r6, r7, r3)
            int r6 = androidx.appcompat.R.styleable.ActionBar_hideOnContentScroll
            boolean r6 = r5.getBoolean(r6, r3)
            if (r6 == 0) goto L8c
            r9.setHideOnContentScrollEnabled(r2)
        L8c:
            int r2 = androidx.appcompat.R.styleable.ActionBar_elevation
            int r2 = r5.getDimensionPixelSize(r2, r3)
            if (r2 == 0) goto L98
            float r3 = (float) r2
            r9.setElevation(r3)
        L98:
            r5.recycle()
            return
        L9c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.Class r2 = r9.getClass()
            java.lang.String r2 = r2.getSimpleName()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " can only be used with a compatible window decor layout"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    private void setHasEmbeddedTabs(boolean r6) {
            r5 = this;
            r5.mHasEmbeddedTabs = r6
            boolean r0 = r5.mHasEmbeddedTabs
            r1 = 0
            if (r0 != 0) goto L14
            androidx.appcompat.widget.DecorToolbar r0 = r5.mDecorToolbar
            r0.setEmbeddedTabView(r1)
            androidx.appcompat.widget.ActionBarContainer r0 = r5.mContainerView
            androidx.appcompat.widget.ScrollingTabContainerView r1 = r5.mTabScrollView
            r0.setTabContainer(r1)
            goto L20
        L14:
            androidx.appcompat.widget.ActionBarContainer r0 = r5.mContainerView
            r0.setTabContainer(r1)
            androidx.appcompat.widget.DecorToolbar r0 = r5.mDecorToolbar
            androidx.appcompat.widget.ScrollingTabContainerView r1 = r5.mTabScrollView
            r0.setEmbeddedTabView(r1)
        L20:
            int r0 = r5.getNavigationMode()
            r1 = 2
            r2 = 1
            r3 = 0
            if (r0 != r1) goto L2b
            r0 = r2
            goto L2c
        L2b:
            r0 = r3
        L2c:
            androidx.appcompat.widget.ScrollingTabContainerView r1 = r5.mTabScrollView
            if (r1 == 0) goto L48
            if (r0 == 0) goto L41
            androidx.appcompat.widget.ScrollingTabContainerView r1 = r5.mTabScrollView
            r1.setVisibility(r3)
            androidx.appcompat.widget.ActionBarOverlayLayout r1 = r5.mOverlayLayout
            if (r1 == 0) goto L48
            androidx.appcompat.widget.ActionBarOverlayLayout r1 = r5.mOverlayLayout
            androidx.core.view.ViewCompat.requestApplyInsets(r1)
            goto L48
        L41:
            androidx.appcompat.widget.ScrollingTabContainerView r1 = r5.mTabScrollView
            r4 = 8
            r1.setVisibility(r4)
        L48:
            androidx.appcompat.widget.DecorToolbar r1 = r5.mDecorToolbar
            boolean r4 = r5.mHasEmbeddedTabs
            if (r4 != 0) goto L52
            if (r0 == 0) goto L52
            r4 = r2
            goto L53
        L52:
            r4 = r3
        L53:
            r1.setCollapsible(r4)
            androidx.appcompat.widget.ActionBarOverlayLayout r1 = r5.mOverlayLayout
            boolean r4 = r5.mHasEmbeddedTabs
            if (r4 != 0) goto L5f
            if (r0 == 0) goto L5f
            goto L60
        L5f:
            r2 = r3
        L60:
            r1.setHasNonEmbeddedTabs(r2)
            return
    }

    private boolean shouldAnimateContextView() {
            r1 = this;
            androidx.appcompat.widget.ActionBarContainer r0 = r1.mContainerView
            boolean r0 = r0.isLaidOut()
            return r0
    }

    private void showForActionMode() {
            r2 = this;
            boolean r0 = r2.mShowingForMode
            if (r0 != 0) goto L14
            r0 = 1
            r2.mShowingForMode = r0
            androidx.appcompat.widget.ActionBarOverlayLayout r1 = r2.mOverlayLayout
            if (r1 == 0) goto L10
            androidx.appcompat.widget.ActionBarOverlayLayout r1 = r2.mOverlayLayout
            r1.setShowingForActionMode(r0)
        L10:
            r0 = 0
            r2.updateVisibility(r0)
        L14:
            return
    }

    private void updateVisibility(boolean r4) {
            r3 = this;
            boolean r0 = r3.mHiddenByApp
            boolean r1 = r3.mHiddenBySystem
            boolean r2 = r3.mShowingForMode
            boolean r0 = checkShowingFlags(r0, r1, r2)
            if (r0 == 0) goto L17
            boolean r1 = r3.mNowShowing
            if (r1 != 0) goto L21
            r1 = 1
            r3.mNowShowing = r1
            r3.doShow(r4)
            goto L21
        L17:
            boolean r1 = r3.mNowShowing
            if (r1 == 0) goto L21
            r1 = 0
            r3.mNowShowing = r1
            r3.doHide(r4)
        L21:
            return
    }

    @Override // androidx.appcompat.app.ActionBar
    public void addOnMenuVisibilityListener(androidx.appcompat.app.ActionBar.OnMenuVisibilityListener r2) {
            r1 = this;
            java.util.ArrayList<androidx.appcompat.app.ActionBar$OnMenuVisibilityListener> r0 = r1.mMenuVisibilityListeners
            r0.add(r2)
            return
    }

    @Override // androidx.appcompat.app.ActionBar
    public void addTab(androidx.appcompat.app.ActionBar.Tab r2) {
            r1 = this;
            java.util.ArrayList<androidx.appcompat.app.WindowDecorActionBar$TabImpl> r0 = r1.mTabs
            boolean r0 = r0.isEmpty()
            r1.addTab(r2, r0)
            return
    }

    @Override // androidx.appcompat.app.ActionBar
    public void addTab(androidx.appcompat.app.ActionBar.Tab r2, int r3) {
            r1 = this;
            java.util.ArrayList<androidx.appcompat.app.WindowDecorActionBar$TabImpl> r0 = r1.mTabs
            boolean r0 = r0.isEmpty()
            r1.addTab(r2, r3, r0)
            return
    }

    @Override // androidx.appcompat.app.ActionBar
    public void addTab(androidx.appcompat.app.ActionBar.Tab r2, int r3, boolean r4) {
            r1 = this;
            r1.ensureTabsExist()
            androidx.appcompat.widget.ScrollingTabContainerView r0 = r1.mTabScrollView
            r0.addTab(r2, r3, r4)
            r1.configureTab(r2, r3)
            if (r4 == 0) goto L10
            r1.selectTab(r2)
        L10:
            return
    }

    @Override // androidx.appcompat.app.ActionBar
    public void addTab(androidx.appcompat.app.ActionBar.Tab r2, boolean r3) {
            r1 = this;
            r1.ensureTabsExist()
            androidx.appcompat.widget.ScrollingTabContainerView r0 = r1.mTabScrollView
            r0.addTab(r2, r3)
            java.util.ArrayList<androidx.appcompat.app.WindowDecorActionBar$TabImpl> r0 = r1.mTabs
            int r0 = r0.size()
            r1.configureTab(r2, r0)
            if (r3 == 0) goto L16
            r1.selectTab(r2)
        L16:
            return
    }

    public void animateToMode(boolean r9) {
            r8 = this;
            if (r9 == 0) goto L6
            r8.showForActionMode()
            goto L9
        L6:
            r8.hideForActionMode()
        L9:
            boolean r0 = r8.shouldAnimateContextView()
            r1 = 4
            r2 = 8
            r3 = 0
            if (r0 == 0) goto L3e
            r4 = 100
            r6 = 200(0xc8, double:9.9E-322)
            if (r9 == 0) goto L26
            androidx.appcompat.widget.DecorToolbar r0 = r8.mDecorToolbar
            androidx.core.view.ViewPropertyAnimatorCompat r0 = r0.setupAnimatorToVisibility(r1, r4)
            androidx.appcompat.widget.ActionBarContextView r1 = r8.mContextView
            androidx.core.view.ViewPropertyAnimatorCompat r1 = r1.setupAnimatorToVisibility(r3, r6)
            goto L32
        L26:
            androidx.appcompat.widget.DecorToolbar r0 = r8.mDecorToolbar
            androidx.core.view.ViewPropertyAnimatorCompat r1 = r0.setupAnimatorToVisibility(r3, r6)
            androidx.appcompat.widget.ActionBarContextView r0 = r8.mContextView
            androidx.core.view.ViewPropertyAnimatorCompat r0 = r0.setupAnimatorToVisibility(r2, r4)
        L32:
            androidx.appcompat.view.ViewPropertyAnimatorCompatSet r2 = new androidx.appcompat.view.ViewPropertyAnimatorCompatSet
            r2.<init>()
            r2.playSequentially(r0, r1)
            r2.start()
            goto L55
        L3e:
            if (r9 == 0) goto L4b
            androidx.appcompat.widget.DecorToolbar r0 = r8.mDecorToolbar
            r0.setVisibility(r1)
            androidx.appcompat.widget.ActionBarContextView r0 = r8.mContextView
            r0.setVisibility(r3)
            goto L55
        L4b:
            androidx.appcompat.widget.DecorToolbar r0 = r8.mDecorToolbar
            r0.setVisibility(r3)
            androidx.appcompat.widget.ActionBarContextView r0 = r8.mContextView
            r0.setVisibility(r2)
        L55:
            return
    }

    @Override // androidx.appcompat.app.ActionBar
    public boolean collapseActionView() {
            r1 = this;
            androidx.appcompat.widget.DecorToolbar r0 = r1.mDecorToolbar
            if (r0 == 0) goto L13
            androidx.appcompat.widget.DecorToolbar r0 = r1.mDecorToolbar
            boolean r0 = r0.hasExpandedActionView()
            if (r0 == 0) goto L13
            androidx.appcompat.widget.DecorToolbar r0 = r1.mDecorToolbar
            r0.collapseActionView()
            r0 = 1
            return r0
        L13:
            r0 = 0
            return r0
    }

    void completeDeferredDestroyActionMode() {
            r2 = this;
            androidx.appcompat.view.ActionMode$Callback r0 = r2.mDeferredModeDestroyCallback
            if (r0 == 0) goto L10
            androidx.appcompat.view.ActionMode$Callback r0 = r2.mDeferredModeDestroyCallback
            androidx.appcompat.view.ActionMode r1 = r2.mDeferredDestroyActionMode
            r0.onDestroyActionMode(r1)
            r0 = 0
            r2.mDeferredDestroyActionMode = r0
            r2.mDeferredModeDestroyCallback = r0
        L10:
            return
    }

    @Override // androidx.appcompat.app.ActionBar
    public void dispatchMenuVisibilityChanged(boolean r4) {
            r3 = this;
            boolean r0 = r3.mLastMenuVisibility
            if (r4 != r0) goto L5
            return
        L5:
            r3.mLastMenuVisibility = r4
            java.util.ArrayList<androidx.appcompat.app.ActionBar$OnMenuVisibilityListener> r0 = r3.mMenuVisibilityListeners
            int r0 = r0.size()
            r1 = 0
        Le:
            if (r1 >= r0) goto L1e
            java.util.ArrayList<androidx.appcompat.app.ActionBar$OnMenuVisibilityListener> r2 = r3.mMenuVisibilityListeners
            java.lang.Object r2 = r2.get(r1)
            androidx.appcompat.app.ActionBar$OnMenuVisibilityListener r2 = (androidx.appcompat.app.ActionBar.OnMenuVisibilityListener) r2
            r2.onMenuVisibilityChanged(r4)
            int r1 = r1 + 1
            goto Le
        L1e:
            return
    }

    public void doHide(boolean r6) {
            r5 = this;
            androidx.appcompat.view.ViewPropertyAnimatorCompatSet r0 = r5.mCurrentShowAnim
            if (r0 == 0) goto L9
            androidx.appcompat.view.ViewPropertyAnimatorCompatSet r0 = r5.mCurrentShowAnim
            r0.cancel()
        L9:
            int r0 = r5.mCurWindowVisibility
            if (r0 != 0) goto L79
            boolean r0 = r5.mShowHideAnimationEnabled
            if (r0 != 0) goto L13
            if (r6 == 0) goto L79
        L13:
            androidx.appcompat.widget.ActionBarContainer r0 = r5.mContainerView
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.setAlpha(r1)
            androidx.appcompat.widget.ActionBarContainer r0 = r5.mContainerView
            r1 = 1
            r0.setTransitioning(r1)
            androidx.appcompat.view.ViewPropertyAnimatorCompatSet r0 = new androidx.appcompat.view.ViewPropertyAnimatorCompatSet
            r0.<init>()
            androidx.appcompat.widget.ActionBarContainer r2 = r5.mContainerView
            int r2 = r2.getHeight()
            int r2 = -r2
            float r2 = (float) r2
            if (r6 == 0) goto L3d
            r3 = 0
            int[] r3 = new int[]{r3, r3}
            androidx.appcompat.widget.ActionBarContainer r4 = r5.mContainerView
            r4.getLocationInWindow(r3)
            r1 = r3[r1]
            float r1 = (float) r1
            float r2 = r2 - r1
        L3d:
            androidx.appcompat.widget.ActionBarContainer r1 = r5.mContainerView
            androidx.core.view.ViewPropertyAnimatorCompat r1 = androidx.core.view.ViewCompat.animate(r1)
            androidx.core.view.ViewPropertyAnimatorCompat r1 = r1.translationY(r2)
            androidx.core.view.ViewPropertyAnimatorUpdateListener r3 = r5.mUpdateListener
            r1.setUpdateListener(r3)
            r0.play(r1)
            boolean r3 = r5.mContentAnimations
            if (r3 == 0) goto L64
            android.view.View r3 = r5.mContentView
            if (r3 == 0) goto L64
            android.view.View r3 = r5.mContentView
            androidx.core.view.ViewPropertyAnimatorCompat r3 = androidx.core.view.ViewCompat.animate(r3)
            androidx.core.view.ViewPropertyAnimatorCompat r3 = r3.translationY(r2)
            r0.play(r3)
        L64:
            android.view.animation.Interpolator r3 = androidx.appcompat.app.WindowDecorActionBar.sHideInterpolator
            r0.setInterpolator(r3)
            r3 = 250(0xfa, double:1.235E-321)
            r0.setDuration(r3)
            androidx.core.view.ViewPropertyAnimatorListener r3 = r5.mHideListener
            r0.setListener(r3)
            r5.mCurrentShowAnim = r0
            r0.start()
            goto L7f
        L79:
            androidx.core.view.ViewPropertyAnimatorListener r0 = r5.mHideListener
            r1 = 0
            r0.onAnimationEnd(r1)
        L7f:
            return
    }

    public void doShow(boolean r7) {
            r6 = this;
            androidx.appcompat.view.ViewPropertyAnimatorCompatSet r0 = r6.mCurrentShowAnim
            if (r0 == 0) goto L9
            androidx.appcompat.view.ViewPropertyAnimatorCompatSet r0 = r6.mCurrentShowAnim
            r0.cancel()
        L9:
            androidx.appcompat.widget.ActionBarContainer r0 = r6.mContainerView
            r1 = 0
            r0.setVisibility(r1)
            int r0 = r6.mCurWindowVisibility
            r2 = 0
            if (r0 != 0) goto L82
            boolean r0 = r6.mShowHideAnimationEnabled
            if (r0 != 0) goto L1a
            if (r7 == 0) goto L82
        L1a:
            androidx.appcompat.widget.ActionBarContainer r0 = r6.mContainerView
            r0.setTranslationY(r2)
            androidx.appcompat.widget.ActionBarContainer r0 = r6.mContainerView
            int r0 = r0.getHeight()
            int r0 = -r0
            float r0 = (float) r0
            if (r7 == 0) goto L37
            int[] r1 = new int[]{r1, r1}
            androidx.appcompat.widget.ActionBarContainer r3 = r6.mContainerView
            r3.getLocationInWindow(r1)
            r3 = 1
            r3 = r1[r3]
            float r3 = (float) r3
            float r0 = r0 - r3
        L37:
            androidx.appcompat.widget.ActionBarContainer r1 = r6.mContainerView
            r1.setTranslationY(r0)
            androidx.appcompat.view.ViewPropertyAnimatorCompatSet r1 = new androidx.appcompat.view.ViewPropertyAnimatorCompatSet
            r1.<init>()
            androidx.appcompat.widget.ActionBarContainer r3 = r6.mContainerView
            androidx.core.view.ViewPropertyAnimatorCompat r3 = androidx.core.view.ViewCompat.animate(r3)
            androidx.core.view.ViewPropertyAnimatorCompat r3 = r3.translationY(r2)
            androidx.core.view.ViewPropertyAnimatorUpdateListener r4 = r6.mUpdateListener
            r3.setUpdateListener(r4)
            r1.play(r3)
            boolean r4 = r6.mContentAnimations
            if (r4 == 0) goto L6d
            android.view.View r4 = r6.mContentView
            if (r4 == 0) goto L6d
            android.view.View r4 = r6.mContentView
            r4.setTranslationY(r0)
            android.view.View r4 = r6.mContentView
            androidx.core.view.ViewPropertyAnimatorCompat r4 = androidx.core.view.ViewCompat.animate(r4)
            androidx.core.view.ViewPropertyAnimatorCompat r2 = r4.translationY(r2)
            r1.play(r2)
        L6d:
            android.view.animation.Interpolator r2 = androidx.appcompat.app.WindowDecorActionBar.sShowInterpolator
            r1.setInterpolator(r2)
            r4 = 250(0xfa, double:1.235E-321)
            r1.setDuration(r4)
            androidx.core.view.ViewPropertyAnimatorListener r2 = r6.mShowListener
            r1.setListener(r2)
            r6.mCurrentShowAnim = r1
            r1.start()
            goto La1
        L82:
            androidx.appcompat.widget.ActionBarContainer r0 = r6.mContainerView
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.setAlpha(r1)
            androidx.appcompat.widget.ActionBarContainer r0 = r6.mContainerView
            r0.setTranslationY(r2)
            boolean r0 = r6.mContentAnimations
            if (r0 == 0) goto L9b
            android.view.View r0 = r6.mContentView
            if (r0 == 0) goto L9b
            android.view.View r0 = r6.mContentView
            r0.setTranslationY(r2)
        L9b:
            androidx.core.view.ViewPropertyAnimatorListener r0 = r6.mShowListener
            r1 = 0
            r0.onAnimationEnd(r1)
        La1:
            androidx.appcompat.widget.ActionBarOverlayLayout r0 = r6.mOverlayLayout
            if (r0 == 0) goto Laa
            androidx.appcompat.widget.ActionBarOverlayLayout r0 = r6.mOverlayLayout
            androidx.core.view.ViewCompat.requestApplyInsets(r0)
        Laa:
            return
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.ActionBarVisibilityCallback
    public void enableContentAnimations(boolean r1) {
            r0 = this;
            r0.mContentAnimations = r1
            return
    }

    @Override // androidx.appcompat.app.ActionBar
    public android.view.View getCustomView() {
            r1 = this;
            androidx.appcompat.widget.DecorToolbar r0 = r1.mDecorToolbar
            android.view.View r0 = r0.getCustomView()
            return r0
    }

    @Override // androidx.appcompat.app.ActionBar
    public int getDisplayOptions() {
            r1 = this;
            androidx.appcompat.widget.DecorToolbar r0 = r1.mDecorToolbar
            int r0 = r0.getDisplayOptions()
            return r0
    }

    @Override // androidx.appcompat.app.ActionBar
    public float getElevation() {
            r1 = this;
            androidx.appcompat.widget.ActionBarContainer r0 = r1.mContainerView
            float r0 = androidx.core.view.ViewCompat.getElevation(r0)
            return r0
    }

    @Override // androidx.appcompat.app.ActionBar
    public int getHeight() {
            r1 = this;
            androidx.appcompat.widget.ActionBarContainer r0 = r1.mContainerView
            int r0 = r0.getHeight()
            return r0
    }

    @Override // androidx.appcompat.app.ActionBar
    public int getHideOffset() {
            r1 = this;
            androidx.appcompat.widget.ActionBarOverlayLayout r0 = r1.mOverlayLayout
            int r0 = r0.getActionBarHideOffset()
            return r0
    }

    @Override // androidx.appcompat.app.ActionBar
    public int getNavigationItemCount() {
            r1 = this;
            androidx.appcompat.widget.DecorToolbar r0 = r1.mDecorToolbar
            int r0 = r0.getNavigationMode()
            switch(r0) {
                case 1: goto L12;
                case 2: goto Lb;
                default: goto L9;
            }
        L9:
            r0 = 0
            return r0
        Lb:
            java.util.ArrayList<androidx.appcompat.app.WindowDecorActionBar$TabImpl> r0 = r1.mTabs
            int r0 = r0.size()
            return r0
        L12:
            androidx.appcompat.widget.DecorToolbar r0 = r1.mDecorToolbar
            int r0 = r0.getDropdownItemCount()
            return r0
    }

    @Override // androidx.appcompat.app.ActionBar
    public int getNavigationMode() {
            r1 = this;
            androidx.appcompat.widget.DecorToolbar r0 = r1.mDecorToolbar
            int r0 = r0.getNavigationMode()
            return r0
    }

    @Override // androidx.appcompat.app.ActionBar
    public int getSelectedNavigationIndex() {
            r2 = this;
            androidx.appcompat.widget.DecorToolbar r0 = r2.mDecorToolbar
            int r0 = r0.getNavigationMode()
            r1 = -1
            switch(r0) {
                case 1: goto L16;
                case 2: goto Lb;
                default: goto La;
            }
        La:
            return r1
        Lb:
            androidx.appcompat.app.WindowDecorActionBar$TabImpl r0 = r2.mSelectedTab
            if (r0 == 0) goto L15
            androidx.appcompat.app.WindowDecorActionBar$TabImpl r0 = r2.mSelectedTab
            int r1 = r0.getPosition()
        L15:
            return r1
        L16:
            androidx.appcompat.widget.DecorToolbar r0 = r2.mDecorToolbar
            int r0 = r0.getDropdownSelectedPosition()
            return r0
    }

    @Override // androidx.appcompat.app.ActionBar
    public androidx.appcompat.app.ActionBar.Tab getSelectedTab() {
            r1 = this;
            androidx.appcompat.app.WindowDecorActionBar$TabImpl r0 = r1.mSelectedTab
            return r0
    }

    @Override // androidx.appcompat.app.ActionBar
    public java.lang.CharSequence getSubtitle() {
            r1 = this;
            androidx.appcompat.widget.DecorToolbar r0 = r1.mDecorToolbar
            java.lang.CharSequence r0 = r0.getSubtitle()
            return r0
    }

    @Override // androidx.appcompat.app.ActionBar
    public androidx.appcompat.app.ActionBar.Tab getTabAt(int r2) {
            r1 = this;
            java.util.ArrayList<androidx.appcompat.app.WindowDecorActionBar$TabImpl> r0 = r1.mTabs
            java.lang.Object r0 = r0.get(r2)
            androidx.appcompat.app.ActionBar$Tab r0 = (androidx.appcompat.app.ActionBar.Tab) r0
            return r0
    }

    @Override // androidx.appcompat.app.ActionBar
    public int getTabCount() {
            r1 = this;
            java.util.ArrayList<androidx.appcompat.app.WindowDecorActionBar$TabImpl> r0 = r1.mTabs
            int r0 = r0.size()
            return r0
    }

    @Override // androidx.appcompat.app.ActionBar
    public android.content.Context getThemedContext() {
            r5 = this;
            android.content.Context r0 = r5.mThemedContext
            if (r0 != 0) goto L27
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            android.content.Context r1 = r5.mContext
            android.content.res.Resources$Theme r1 = r1.getTheme()
            int r2 = androidx.appcompat.R.attr.actionBarWidgetTheme
            r3 = 1
            r1.resolveAttribute(r2, r0, r3)
            int r2 = r0.resourceId
            if (r2 == 0) goto L23
            android.view.ContextThemeWrapper r3 = new android.view.ContextThemeWrapper
            android.content.Context r4 = r5.mContext
            r3.<init>(r4, r2)
            r5.mThemedContext = r3
            goto L27
        L23:
            android.content.Context r3 = r5.mContext
            r5.mThemedContext = r3
        L27:
            android.content.Context r0 = r5.mThemedContext
            return r0
    }

    @Override // androidx.appcompat.app.ActionBar
    public java.lang.CharSequence getTitle() {
            r1 = this;
            androidx.appcompat.widget.DecorToolbar r0 = r1.mDecorToolbar
            java.lang.CharSequence r0 = r0.getTitle()
            return r0
    }

    public boolean hasIcon() {
            r1 = this;
            androidx.appcompat.widget.DecorToolbar r0 = r1.mDecorToolbar
            boolean r0 = r0.hasIcon()
            return r0
    }

    public boolean hasLogo() {
            r1 = this;
            androidx.appcompat.widget.DecorToolbar r0 = r1.mDecorToolbar
            boolean r0 = r0.hasLogo()
            return r0
    }

    @Override // androidx.appcompat.app.ActionBar
    public void hide() {
            r1 = this;
            boolean r0 = r1.mHiddenByApp
            if (r0 != 0) goto Lb
            r0 = 1
            r1.mHiddenByApp = r0
            r0 = 0
            r1.updateVisibility(r0)
        Lb:
            return
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.ActionBarVisibilityCallback
    public void hideForSystem() {
            r1 = this;
            boolean r0 = r1.mHiddenBySystem
            if (r0 != 0) goto La
            r0 = 1
            r1.mHiddenBySystem = r0
            r1.updateVisibility(r0)
        La:
            return
    }

    @Override // androidx.appcompat.app.ActionBar
    public boolean isHideOnContentScrollEnabled() {
            r1 = this;
            androidx.appcompat.widget.ActionBarOverlayLayout r0 = r1.mOverlayLayout
            boolean r0 = r0.isHideOnContentScrollEnabled()
            return r0
    }

    @Override // androidx.appcompat.app.ActionBar
    public boolean isShowing() {
            r2 = this;
            int r0 = r2.getHeight()
            boolean r1 = r2.mNowShowing
            if (r1 == 0) goto L12
            if (r0 == 0) goto L10
            int r1 = r2.getHideOffset()
            if (r1 >= r0) goto L12
        L10:
            r1 = 1
            goto L13
        L12:
            r1 = 0
        L13:
            return r1
    }

    @Override // androidx.appcompat.app.ActionBar
    public boolean isTitleTruncated() {
            r1 = this;
            androidx.appcompat.widget.DecorToolbar r0 = r1.mDecorToolbar
            if (r0 == 0) goto Le
            androidx.appcompat.widget.DecorToolbar r0 = r1.mDecorToolbar
            boolean r0 = r0.isTitleTruncated()
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @Override // androidx.appcompat.app.ActionBar
    public androidx.appcompat.app.ActionBar.Tab newTab() {
            r1 = this;
            androidx.appcompat.app.WindowDecorActionBar$TabImpl r0 = new androidx.appcompat.app.WindowDecorActionBar$TabImpl
            r0.<init>(r1)
            return r0
    }

    @Override // androidx.appcompat.app.ActionBar
    public void onConfigurationChanged(android.content.res.Configuration r2) {
            r1 = this;
            android.content.Context r0 = r1.mContext
            androidx.appcompat.view.ActionBarPolicy r0 = androidx.appcompat.view.ActionBarPolicy.get(r0)
            boolean r0 = r0.hasEmbeddedTabs()
            r1.setHasEmbeddedTabs(r0)
            return
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.ActionBarVisibilityCallback
    public void onContentScrollStarted() {
            r1 = this;
            androidx.appcompat.view.ViewPropertyAnimatorCompatSet r0 = r1.mCurrentShowAnim
            if (r0 == 0) goto Lc
            androidx.appcompat.view.ViewPropertyAnimatorCompatSet r0 = r1.mCurrentShowAnim
            r0.cancel()
            r0 = 0
            r1.mCurrentShowAnim = r0
        Lc:
            return
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.ActionBarVisibilityCallback
    public void onContentScrollStopped() {
            r0 = this;
            return
    }

    @Override // androidx.appcompat.app.ActionBar
    public boolean onKeyShortcut(int r6, android.view.KeyEvent r7) {
            r5 = this;
            androidx.appcompat.app.WindowDecorActionBar$ActionModeImpl r0 = r5.mActionMode
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            androidx.appcompat.app.WindowDecorActionBar$ActionModeImpl r0 = r5.mActionMode
            android.view.Menu r0 = r0.getMenu()
            if (r0 == 0) goto L2b
            if (r7 == 0) goto L15
            int r2 = r7.getDeviceId()
            goto L16
        L15:
            r2 = -1
        L16:
            android.view.KeyCharacterMap r2 = android.view.KeyCharacterMap.load(r2)
            int r3 = r2.getKeyboardType()
            r4 = 1
            if (r3 == r4) goto L22
            goto L23
        L22:
            r4 = r1
        L23:
            r0.setQwertyMode(r4)
            boolean r1 = r0.performShortcut(r6, r7, r1)
            return r1
        L2b:
            return r1
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.ActionBarVisibilityCallback
    public void onWindowVisibilityChanged(int r1) {
            r0 = this;
            r0.mCurWindowVisibility = r1
            return
    }

    @Override // androidx.appcompat.app.ActionBar
    public void removeAllTabs() {
            r0 = this;
            r0.cleanupTabs()
            return
    }

    @Override // androidx.appcompat.app.ActionBar
    public void removeOnMenuVisibilityListener(androidx.appcompat.app.ActionBar.OnMenuVisibilityListener r2) {
            r1 = this;
            java.util.ArrayList<androidx.appcompat.app.ActionBar$OnMenuVisibilityListener> r0 = r1.mMenuVisibilityListeners
            r0.remove(r2)
            return
    }

    @Override // androidx.appcompat.app.ActionBar
    public void removeTab(androidx.appcompat.app.ActionBar.Tab r2) {
            r1 = this;
            int r0 = r2.getPosition()
            r1.removeTabAt(r0)
            return
    }

    @Override // androidx.appcompat.app.ActionBar
    public void removeTabAt(int r7) {
            r6 = this;
            androidx.appcompat.widget.ScrollingTabContainerView r0 = r6.mTabScrollView
            if (r0 != 0) goto L5
            return
        L5:
            androidx.appcompat.app.WindowDecorActionBar$TabImpl r0 = r6.mSelectedTab
            if (r0 == 0) goto L10
            androidx.appcompat.app.WindowDecorActionBar$TabImpl r0 = r6.mSelectedTab
            int r0 = r0.getPosition()
            goto L12
        L10:
            int r0 = r6.mSavedTabPosition
        L12:
            androidx.appcompat.widget.ScrollingTabContainerView r1 = r6.mTabScrollView
            r1.removeTabAt(r7)
            java.util.ArrayList<androidx.appcompat.app.WindowDecorActionBar$TabImpl> r1 = r6.mTabs
            java.lang.Object r1 = r1.remove(r7)
            androidx.appcompat.app.WindowDecorActionBar$TabImpl r1 = (androidx.appcompat.app.WindowDecorActionBar.TabImpl) r1
            if (r1 == 0) goto L25
            r2 = -1
            r1.setPosition(r2)
        L25:
            java.util.ArrayList<androidx.appcompat.app.WindowDecorActionBar$TabImpl> r2 = r6.mTabs
            int r2 = r2.size()
            r3 = r7
        L2c:
            if (r3 >= r2) goto L3c
            java.util.ArrayList<androidx.appcompat.app.WindowDecorActionBar$TabImpl> r4 = r6.mTabs
            java.lang.Object r4 = r4.get(r3)
            androidx.appcompat.app.WindowDecorActionBar$TabImpl r4 = (androidx.appcompat.app.WindowDecorActionBar.TabImpl) r4
            r4.setPosition(r3)
            int r3 = r3 + 1
            goto L2c
        L3c:
            if (r0 != r7) goto L5a
            java.util.ArrayList<androidx.appcompat.app.WindowDecorActionBar$TabImpl> r3 = r6.mTabs
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L48
            r3 = 0
            goto L57
        L48:
            java.util.ArrayList<androidx.appcompat.app.WindowDecorActionBar$TabImpl> r3 = r6.mTabs
            r4 = 0
            int r5 = r7 + (-1)
            int r4 = java.lang.Math.max(r4, r5)
            java.lang.Object r3 = r3.get(r4)
            androidx.appcompat.app.ActionBar$Tab r3 = (androidx.appcompat.app.ActionBar.Tab) r3
        L57:
            r6.selectTab(r3)
        L5a:
            return
    }

    @Override // androidx.appcompat.app.ActionBar
    public boolean requestFocus() {
            r2 = this;
            androidx.appcompat.widget.DecorToolbar r0 = r2.mDecorToolbar
            android.view.ViewGroup r0 = r0.getViewGroup()
            if (r0 == 0) goto L13
            boolean r1 = r0.hasFocus()
            if (r1 != 0) goto L13
            r0.requestFocus()
            r1 = 1
            return r1
        L13:
            r1 = 0
            return r1
    }

    @Override // androidx.appcompat.app.ActionBar
    public void selectTab(androidx.appcompat.app.ActionBar.Tab r4) {
            r3 = this;
            int r0 = r3.getNavigationMode()
            r1 = 2
            r2 = -1
            if (r0 == r1) goto L11
            if (r4 == 0) goto Le
            int r2 = r4.getPosition()
        Le:
            r3.mSavedTabPosition = r2
            return
        L11:
            android.app.Activity r0 = r3.mActivity
            boolean r0 = r0 instanceof androidx.fragment.app.FragmentActivity
            if (r0 == 0) goto L34
            androidx.appcompat.widget.DecorToolbar r0 = r3.mDecorToolbar
            android.view.ViewGroup r0 = r0.getViewGroup()
            boolean r0 = r0.isInEditMode()
            if (r0 != 0) goto L34
            android.app.Activity r0 = r3.mActivity
            androidx.fragment.app.FragmentActivity r0 = (androidx.fragment.app.FragmentActivity) r0
            androidx.fragment.app.FragmentManager r0 = r0.getSupportFragmentManager()
            androidx.fragment.app.FragmentTransaction r0 = r0.beginTransaction()
            androidx.fragment.app.FragmentTransaction r0 = r0.disallowAddToBackStack()
            goto L35
        L34:
            r0 = 0
        L35:
            androidx.appcompat.app.WindowDecorActionBar$TabImpl r1 = r3.mSelectedTab
            if (r1 != r4) goto L52
            androidx.appcompat.app.WindowDecorActionBar$TabImpl r1 = r3.mSelectedTab
            if (r1 == 0) goto L80
            androidx.appcompat.app.WindowDecorActionBar$TabImpl r1 = r3.mSelectedTab
            androidx.appcompat.app.ActionBar$TabListener r1 = r1.getCallback()
            androidx.appcompat.app.WindowDecorActionBar$TabImpl r2 = r3.mSelectedTab
            r1.onTabReselected(r2, r0)
            androidx.appcompat.widget.ScrollingTabContainerView r1 = r3.mTabScrollView
            int r2 = r4.getPosition()
            r1.animateToTab(r2)
            goto L80
        L52:
            androidx.appcompat.widget.ScrollingTabContainerView r1 = r3.mTabScrollView
            if (r4 == 0) goto L5a
            int r2 = r4.getPosition()
        L5a:
            r1.setTabSelected(r2)
            androidx.appcompat.app.WindowDecorActionBar$TabImpl r1 = r3.mSelectedTab
            if (r1 == 0) goto L6c
            androidx.appcompat.app.WindowDecorActionBar$TabImpl r1 = r3.mSelectedTab
            androidx.appcompat.app.ActionBar$TabListener r1 = r1.getCallback()
            androidx.appcompat.app.WindowDecorActionBar$TabImpl r2 = r3.mSelectedTab
            r1.onTabUnselected(r2, r0)
        L6c:
            r1 = r4
            androidx.appcompat.app.WindowDecorActionBar$TabImpl r1 = (androidx.appcompat.app.WindowDecorActionBar.TabImpl) r1
            r3.mSelectedTab = r1
            androidx.appcompat.app.WindowDecorActionBar$TabImpl r1 = r3.mSelectedTab
            if (r1 == 0) goto L80
            androidx.appcompat.app.WindowDecorActionBar$TabImpl r1 = r3.mSelectedTab
            androidx.appcompat.app.ActionBar$TabListener r1 = r1.getCallback()
            androidx.appcompat.app.WindowDecorActionBar$TabImpl r2 = r3.mSelectedTab
            r1.onTabSelected(r2, r0)
        L80:
            if (r0 == 0) goto L8b
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L8b
            r0.commit()
        L8b:
            return
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setBackgroundDrawable(android.graphics.drawable.Drawable r2) {
            r1 = this;
            androidx.appcompat.widget.ActionBarContainer r0 = r1.mContainerView
            r0.setPrimaryBackground(r2)
            return
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setCustomView(int r4) {
            r3 = this;
            android.content.Context r0 = r3.getThemedContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            androidx.appcompat.widget.DecorToolbar r1 = r3.mDecorToolbar
            android.view.ViewGroup r1 = r1.getViewGroup()
            r2 = 0
            android.view.View r0 = r0.inflate(r4, r1, r2)
            r3.setCustomView(r0)
            return
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setCustomView(android.view.View r2) {
            r1 = this;
            androidx.appcompat.widget.DecorToolbar r0 = r1.mDecorToolbar
            r0.setCustomView(r2)
            return
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setCustomView(android.view.View r2, androidx.appcompat.app.ActionBar.LayoutParams r3) {
            r1 = this;
            r2.setLayoutParams(r3)
            androidx.appcompat.widget.DecorToolbar r0 = r1.mDecorToolbar
            r0.setCustomView(r2)
            return
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setDefaultDisplayHomeAsUpEnabled(boolean r2) {
            r1 = this;
            boolean r0 = r1.mDisplayHomeAsUpSet
            if (r0 != 0) goto L7
            r1.setDisplayHomeAsUpEnabled(r2)
        L7:
            return
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setDisplayHomeAsUpEnabled(boolean r3) {
            r2 = this;
            r0 = 4
            if (r3 == 0) goto L5
            r1 = r0
            goto L6
        L5:
            r1 = 0
        L6:
            r2.setDisplayOptions(r1, r0)
            return
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setDisplayOptions(int r2) {
            r1 = this;
            r0 = r2 & 4
            if (r0 == 0) goto L7
            r0 = 1
            r1.mDisplayHomeAsUpSet = r0
        L7:
            androidx.appcompat.widget.DecorToolbar r0 = r1.mDecorToolbar
            r0.setDisplayOptions(r2)
            return
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setDisplayOptions(int r5, int r6) {
            r4 = this;
            androidx.appcompat.widget.DecorToolbar r0 = r4.mDecorToolbar
            int r0 = r0.getDisplayOptions()
            r1 = r6 & 4
            if (r1 == 0) goto Ld
            r1 = 1
            r4.mDisplayHomeAsUpSet = r1
        Ld:
            androidx.appcompat.widget.DecorToolbar r1 = r4.mDecorToolbar
            r2 = r5 & r6
            int r3 = ~r6
            r3 = r3 & r0
            r2 = r2 | r3
            r1.setDisplayOptions(r2)
            return
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setDisplayShowCustomEnabled(boolean r3) {
            r2 = this;
            r0 = 16
            if (r3 == 0) goto L6
            r1 = r0
            goto L7
        L6:
            r1 = 0
        L7:
            r2.setDisplayOptions(r1, r0)
            return
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setDisplayShowHomeEnabled(boolean r3) {
            r2 = this;
            r0 = 2
            if (r3 == 0) goto L5
            r1 = r0
            goto L6
        L5:
            r1 = 0
        L6:
            r2.setDisplayOptions(r1, r0)
            return
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setDisplayShowTitleEnabled(boolean r3) {
            r2 = this;
            r0 = 8
            if (r3 == 0) goto L6
            r1 = r0
            goto L7
        L6:
            r1 = 0
        L7:
            r2.setDisplayOptions(r1, r0)
            return
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setDisplayUseLogoEnabled(boolean r2) {
            r1 = this;
            r0 = 1
            r1.setDisplayOptions(r2, r0)
            return
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setElevation(float r2) {
            r1 = this;
            androidx.appcompat.widget.ActionBarContainer r0 = r1.mContainerView
            androidx.core.view.ViewCompat.setElevation(r0, r2)
            return
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setHideOffset(int r3) {
            r2 = this;
            if (r3 == 0) goto L13
            androidx.appcompat.widget.ActionBarOverlayLayout r0 = r2.mOverlayLayout
            boolean r0 = r0.isInOverlayMode()
            if (r0 == 0) goto Lb
            goto L13
        Lb:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to set a non-zero hide offset"
            r0.<init>(r1)
            throw r0
        L13:
            androidx.appcompat.widget.ActionBarOverlayLayout r0 = r2.mOverlayLayout
            r0.setActionBarHideOffset(r3)
            return
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setHideOnContentScrollEnabled(boolean r3) {
            r2 = this;
            if (r3 == 0) goto L13
            androidx.appcompat.widget.ActionBarOverlayLayout r0 = r2.mOverlayLayout
            boolean r0 = r0.isInOverlayMode()
            if (r0 == 0) goto Lb
            goto L13
        Lb:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll"
            r0.<init>(r1)
            throw r0
        L13:
            r2.mHideOnContentScroll = r3
            androidx.appcompat.widget.ActionBarOverlayLayout r0 = r2.mOverlayLayout
            r0.setHideOnContentScrollEnabled(r3)
            return
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setHomeActionContentDescription(int r2) {
            r1 = this;
            androidx.appcompat.widget.DecorToolbar r0 = r1.mDecorToolbar
            r0.setNavigationContentDescription(r2)
            return
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setHomeActionContentDescription(java.lang.CharSequence r2) {
            r1 = this;
            androidx.appcompat.widget.DecorToolbar r0 = r1.mDecorToolbar
            r0.setNavigationContentDescription(r2)
            return
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setHomeAsUpIndicator(int r2) {
            r1 = this;
            androidx.appcompat.widget.DecorToolbar r0 = r1.mDecorToolbar
            r0.setNavigationIcon(r2)
            return
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setHomeAsUpIndicator(android.graphics.drawable.Drawable r2) {
            r1 = this;
            androidx.appcompat.widget.DecorToolbar r0 = r1.mDecorToolbar
            r0.setNavigationIcon(r2)
            return
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setHomeButtonEnabled(boolean r2) {
            r1 = this;
            androidx.appcompat.widget.DecorToolbar r0 = r1.mDecorToolbar
            r0.setHomeButtonEnabled(r2)
            return
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setIcon(int r2) {
            r1 = this;
            androidx.appcompat.widget.DecorToolbar r0 = r1.mDecorToolbar
            r0.setIcon(r2)
            return
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setIcon(android.graphics.drawable.Drawable r2) {
            r1 = this;
            androidx.appcompat.widget.DecorToolbar r0 = r1.mDecorToolbar
            r0.setIcon(r2)
            return
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setListNavigationCallbacks(android.widget.SpinnerAdapter r3, androidx.appcompat.app.ActionBar.OnNavigationListener r4) {
            r2 = this;
            androidx.appcompat.widget.DecorToolbar r0 = r2.mDecorToolbar
            androidx.appcompat.app.NavItemSelectedListener r1 = new androidx.appcompat.app.NavItemSelectedListener
            r1.<init>(r4)
            r0.setDropdownParams(r3, r1)
            return
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setLogo(int r2) {
            r1 = this;
            androidx.appcompat.widget.DecorToolbar r0 = r1.mDecorToolbar
            r0.setLogo(r2)
            return
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setLogo(android.graphics.drawable.Drawable r2) {
            r1 = this;
            androidx.appcompat.widget.DecorToolbar r0 = r1.mDecorToolbar
            r0.setLogo(r2)
            return
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setNavigationMode(int r7) {
            r6 = this;
            androidx.appcompat.widget.DecorToolbar r0 = r6.mDecorToolbar
            int r0 = r0.getNavigationMode()
            switch(r0) {
                case 2: goto La;
                default: goto L9;
            }
        L9:
            goto L1b
        La:
            int r1 = r6.getSelectedNavigationIndex()
            r6.mSavedTabPosition = r1
            r1 = 0
            r6.selectTab(r1)
            androidx.appcompat.widget.ScrollingTabContainerView r1 = r6.mTabScrollView
            r2 = 8
            r1.setVisibility(r2)
        L1b:
            if (r0 == r7) goto L2a
            boolean r1 = r6.mHasEmbeddedTabs
            if (r1 != 0) goto L2a
            androidx.appcompat.widget.ActionBarOverlayLayout r1 = r6.mOverlayLayout
            if (r1 == 0) goto L2a
            androidx.appcompat.widget.ActionBarOverlayLayout r1 = r6.mOverlayLayout
            androidx.core.view.ViewCompat.requestApplyInsets(r1)
        L2a:
            androidx.appcompat.widget.DecorToolbar r1 = r6.mDecorToolbar
            r1.setNavigationMode(r7)
            r1 = 0
            switch(r7) {
                case 2: goto L34;
                default: goto L33;
            }
        L33:
            goto L48
        L34:
            r6.ensureTabsExist()
            androidx.appcompat.widget.ScrollingTabContainerView r2 = r6.mTabScrollView
            r2.setVisibility(r1)
            int r2 = r6.mSavedTabPosition
            r3 = -1
            if (r2 == r3) goto L48
            int r2 = r6.mSavedTabPosition
            r6.setSelectedNavigationItem(r2)
            r6.mSavedTabPosition = r3
        L48:
            androidx.appcompat.widget.DecorToolbar r2 = r6.mDecorToolbar
            r3 = 1
            r4 = 2
            if (r7 != r4) goto L54
            boolean r5 = r6.mHasEmbeddedTabs
            if (r5 != 0) goto L54
            r5 = r3
            goto L55
        L54:
            r5 = r1
        L55:
            r2.setCollapsible(r5)
            androidx.appcompat.widget.ActionBarOverlayLayout r2 = r6.mOverlayLayout
            if (r7 != r4) goto L61
            boolean r4 = r6.mHasEmbeddedTabs
            if (r4 != 0) goto L61
            r1 = r3
        L61:
            r2.setHasNonEmbeddedTabs(r1)
            return
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setSelectedNavigationItem(int r3) {
            r2 = this;
            androidx.appcompat.widget.DecorToolbar r0 = r2.mDecorToolbar
            int r0 = r0.getNavigationMode()
            switch(r0) {
                case 1: goto L1d;
                case 2: goto L11;
                default: goto L9;
            }
        L9:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "setSelectedNavigationIndex not valid for current navigation mode"
            r0.<init>(r1)
            throw r0
        L11:
            java.util.ArrayList<androidx.appcompat.app.WindowDecorActionBar$TabImpl> r0 = r2.mTabs
            java.lang.Object r0 = r0.get(r3)
            androidx.appcompat.app.ActionBar$Tab r0 = (androidx.appcompat.app.ActionBar.Tab) r0
            r2.selectTab(r0)
            goto L23
        L1d:
            androidx.appcompat.widget.DecorToolbar r0 = r2.mDecorToolbar
            r0.setDropdownSelectedPosition(r3)
        L23:
            return
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setShowHideAnimationEnabled(boolean r2) {
            r1 = this;
            r1.mShowHideAnimationEnabled = r2
            if (r2 != 0) goto Ld
            androidx.appcompat.view.ViewPropertyAnimatorCompatSet r0 = r1.mCurrentShowAnim
            if (r0 == 0) goto Ld
            androidx.appcompat.view.ViewPropertyAnimatorCompatSet r0 = r1.mCurrentShowAnim
            r0.cancel()
        Ld:
            return
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setSplitBackgroundDrawable(android.graphics.drawable.Drawable r1) {
            r0 = this;
            return
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setStackedBackgroundDrawable(android.graphics.drawable.Drawable r2) {
            r1 = this;
            androidx.appcompat.widget.ActionBarContainer r0 = r1.mContainerView
            r0.setStackedBackground(r2)
            return
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setSubtitle(int r2) {
            r1 = this;
            android.content.Context r0 = r1.mContext
            java.lang.String r0 = r0.getString(r2)
            r1.setSubtitle(r0)
            return
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setSubtitle(java.lang.CharSequence r2) {
            r1 = this;
            androidx.appcompat.widget.DecorToolbar r0 = r1.mDecorToolbar
            r0.setSubtitle(r2)
            return
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setTitle(int r2) {
            r1 = this;
            android.content.Context r0 = r1.mContext
            java.lang.String r0 = r0.getString(r2)
            r1.setTitle(r0)
            return
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setTitle(java.lang.CharSequence r2) {
            r1 = this;
            androidx.appcompat.widget.DecorToolbar r0 = r1.mDecorToolbar
            r0.setTitle(r2)
            return
    }

    @Override // androidx.appcompat.app.ActionBar
    public void setWindowTitle(java.lang.CharSequence r2) {
            r1 = this;
            androidx.appcompat.widget.DecorToolbar r0 = r1.mDecorToolbar
            r0.setWindowTitle(r2)
            return
    }

    @Override // androidx.appcompat.app.ActionBar
    public void show() {
            r1 = this;
            boolean r0 = r1.mHiddenByApp
            if (r0 == 0) goto La
            r0 = 0
            r1.mHiddenByApp = r0
            r1.updateVisibility(r0)
        La:
            return
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.ActionBarVisibilityCallback
    public void showForSystem() {
            r1 = this;
            boolean r0 = r1.mHiddenBySystem
            if (r0 == 0) goto Lb
            r0 = 0
            r1.mHiddenBySystem = r0
            r0 = 1
            r1.updateVisibility(r0)
        Lb:
            return
    }

    @Override // androidx.appcompat.app.ActionBar
    public androidx.appcompat.view.ActionMode startActionMode(androidx.appcompat.view.ActionMode.Callback r3) {
            r2 = this;
            androidx.appcompat.app.WindowDecorActionBar$ActionModeImpl r0 = r2.mActionMode
            if (r0 == 0) goto L9
            androidx.appcompat.app.WindowDecorActionBar$ActionModeImpl r0 = r2.mActionMode
            r0.finish()
        L9:
            androidx.appcompat.widget.ActionBarOverlayLayout r0 = r2.mOverlayLayout
            r1 = 0
            r0.setHideOnContentScrollEnabled(r1)
            androidx.appcompat.widget.ActionBarContextView r0 = r2.mContextView
            r0.killMode()
            androidx.appcompat.app.WindowDecorActionBar$ActionModeImpl r0 = new androidx.appcompat.app.WindowDecorActionBar$ActionModeImpl
            androidx.appcompat.widget.ActionBarContextView r1 = r2.mContextView
            android.content.Context r1 = r1.getContext()
            r0.<init>(r2, r1, r3)
            boolean r1 = r0.dispatchOnCreate()
            if (r1 == 0) goto L34
            r2.mActionMode = r0
            r0.invalidate()
            androidx.appcompat.widget.ActionBarContextView r1 = r2.mContextView
            r1.initForMode(r0)
            r1 = 1
            r2.animateToMode(r1)
            return r0
        L34:
            r1 = 0
            return r1
    }
}
