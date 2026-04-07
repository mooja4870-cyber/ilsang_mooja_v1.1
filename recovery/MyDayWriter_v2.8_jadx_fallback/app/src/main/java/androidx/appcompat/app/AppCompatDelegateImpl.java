package androidx.appcompat.app;

/* JADX INFO: loaded from: classes.dex */
class AppCompatDelegateImpl extends androidx.appcompat.app.AppCompatDelegate implements androidx.appcompat.view.menu.MenuBuilder.Callback, android.view.LayoutInflater.Factory2 {
    static final java.lang.String EXCEPTION_HANDLER_MESSAGE_SUFFIX = ". If the resource you are trying to use is a vector resource, you may be referencing it in an unsupported way. See AppCompatDelegate.setCompatVectorFromResourcesEnabled() for more info.";
    private static final boolean IS_PRE_LOLLIPOP = false;
    private static final boolean sCanReturnDifferentContext = false;
    private static boolean sInstalledExceptionHandler;
    private static final androidx.collection.SimpleArrayMap<java.lang.String, java.lang.Integer> sLocalNightModes = null;
    private static final int[] sWindowBackgroundStyleable = null;
    androidx.appcompat.app.ActionBar mActionBar;
    private androidx.appcompat.app.AppCompatDelegateImpl.ActionMenuPresenterCallback mActionMenuPresenterCallback;
    androidx.appcompat.view.ActionMode mActionMode;
    android.widget.PopupWindow mActionModePopup;
    androidx.appcompat.widget.ActionBarContextView mActionModeView;
    private int mActivityHandlesConfigFlags;
    private boolean mActivityHandlesConfigFlagsChecked;
    final androidx.appcompat.app.AppCompatCallback mAppCompatCallback;
    private androidx.appcompat.app.AppCompatViewInflater mAppCompatViewInflater;
    private androidx.appcompat.app.AppCompatDelegateImpl.AppCompatWindowCallback mAppCompatWindowCallback;
    private androidx.appcompat.app.AppCompatDelegateImpl.AutoNightModeManager mAutoBatteryNightModeManager;
    private androidx.appcompat.app.AppCompatDelegateImpl.AutoNightModeManager mAutoTimeNightModeManager;
    private android.window.OnBackInvokedCallback mBackCallback;
    private boolean mBaseContextAttached;
    private boolean mClosingActionMenu;
    final android.content.Context mContext;
    private boolean mCreated;
    private androidx.appcompat.widget.DecorContentParent mDecorContentParent;
    boolean mDestroyed;
    private android.window.OnBackInvokedDispatcher mDispatcher;
    private android.content.res.Configuration mEffectiveConfiguration;
    private boolean mEnableDefaultActionBarUp;
    androidx.core.view.ViewPropertyAnimatorCompat mFadeAnim;
    private boolean mFeatureIndeterminateProgress;
    private boolean mFeatureProgress;
    private boolean mHandleNativeActionModes;
    boolean mHasActionBar;
    final java.lang.Object mHost;
    int mInvalidatePanelMenuFeatures;
    boolean mInvalidatePanelMenuPosted;
    private final java.lang.Runnable mInvalidatePanelMenuRunnable;
    boolean mIsFloating;
    private androidx.appcompat.app.LayoutIncludeDetector mLayoutIncludeDetector;
    private int mLocalNightMode;
    private boolean mLongPressBackDown;
    android.view.MenuInflater mMenuInflater;
    boolean mOverlayActionBar;
    boolean mOverlayActionMode;
    private androidx.appcompat.app.AppCompatDelegateImpl.PanelMenuPresenterCallback mPanelMenuPresenterCallback;
    private androidx.appcompat.app.AppCompatDelegateImpl.PanelFeatureState[] mPanels;
    private androidx.appcompat.app.AppCompatDelegateImpl.PanelFeatureState mPreparedPanel;
    java.lang.Runnable mShowActionModePopup;
    private android.view.View mStatusGuard;
    android.view.ViewGroup mSubDecor;
    private boolean mSubDecorInstalled;
    private android.graphics.Rect mTempRect1;
    private android.graphics.Rect mTempRect2;
    private int mThemeResId;
    private java.lang.CharSequence mTitle;
    private android.widget.TextView mTitleView;
    android.view.Window mWindow;
    boolean mWindowNoTitle;




    /* JADX INFO: renamed from: androidx.appcompat.app.AppCompatDelegateImpl$4, reason: invalid class name */
    class AnonymousClass4 implements androidx.appcompat.widget.FitWindowsViewGroup.OnFitSystemWindowsListener {
        final /* synthetic */ androidx.appcompat.app.AppCompatDelegateImpl this$0;

        AnonymousClass4(androidx.appcompat.app.AppCompatDelegateImpl r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // androidx.appcompat.widget.FitWindowsViewGroup.OnFitSystemWindowsListener
        public void onFitSystemWindows(android.graphics.Rect r3) {
                r2 = this;
                androidx.appcompat.app.AppCompatDelegateImpl r0 = r2.this$0
                r1 = 0
                int r0 = r0.updateStatusGuard(r1, r3)
                r3.top = r0
                return
        }
    }




    private class ActionBarDrawableToggleImpl implements androidx.appcompat.app.ActionBarDrawerToggle.Delegate {
        final /* synthetic */ androidx.appcompat.app.AppCompatDelegateImpl this$0;

        ActionBarDrawableToggleImpl(androidx.appcompat.app.AppCompatDelegateImpl r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // androidx.appcompat.app.ActionBarDrawerToggle.Delegate
        public android.content.Context getActionBarThemedContext() {
                r1 = this;
                androidx.appcompat.app.AppCompatDelegateImpl r0 = r1.this$0
                android.content.Context r0 = r0.getActionBarThemedContext()
                return r0
        }

        @Override // androidx.appcompat.app.ActionBarDrawerToggle.Delegate
        public android.graphics.drawable.Drawable getThemeUpIndicator() {
                r3 = this;
                android.content.Context r0 = r3.getActionBarThemedContext()
                int r1 = androidx.appcompat.R.attr.homeAsUpIndicator
                int[] r1 = new int[]{r1}
                r2 = 0
                androidx.appcompat.widget.TintTypedArray r0 = androidx.appcompat.widget.TintTypedArray.obtainStyledAttributes(r0, r2, r1)
                r1 = 0
                android.graphics.drawable.Drawable r1 = r0.getDrawable(r1)
                r0.recycle()
                return r1
        }

        @Override // androidx.appcompat.app.ActionBarDrawerToggle.Delegate
        public boolean isNavigationVisible() {
                r2 = this;
                androidx.appcompat.app.AppCompatDelegateImpl r0 = r2.this$0
                androidx.appcompat.app.ActionBar r0 = r0.getSupportActionBar()
                if (r0 == 0) goto L12
                int r1 = r0.getDisplayOptions()
                r1 = r1 & 4
                if (r1 == 0) goto L12
                r1 = 1
                goto L13
            L12:
                r1 = 0
            L13:
                return r1
        }

        @Override // androidx.appcompat.app.ActionBarDrawerToggle.Delegate
        public void setActionBarDescription(int r2) {
                r1 = this;
                androidx.appcompat.app.AppCompatDelegateImpl r0 = r1.this$0
                androidx.appcompat.app.ActionBar r0 = r0.getSupportActionBar()
                if (r0 == 0) goto Lb
                r0.setHomeActionContentDescription(r2)
            Lb:
                return
        }

        @Override // androidx.appcompat.app.ActionBarDrawerToggle.Delegate
        public void setActionBarUpIndicator(android.graphics.drawable.Drawable r2, int r3) {
                r1 = this;
                androidx.appcompat.app.AppCompatDelegateImpl r0 = r1.this$0
                androidx.appcompat.app.ActionBar r0 = r0.getSupportActionBar()
                if (r0 == 0) goto Le
                r0.setHomeAsUpIndicator(r2)
                r0.setHomeActionContentDescription(r3)
            Le:
                return
        }
    }

    interface ActionBarMenuCallback {
        android.view.View onCreatePanelView(int r1);

        boolean onPreparePanel(int r1);
    }

    private final class ActionMenuPresenterCallback implements androidx.appcompat.view.menu.MenuPresenter.Callback {
        final /* synthetic */ androidx.appcompat.app.AppCompatDelegateImpl this$0;

        ActionMenuPresenterCallback(androidx.appcompat.app.AppCompatDelegateImpl r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter.Callback
        public void onCloseMenu(androidx.appcompat.view.menu.MenuBuilder r2, boolean r3) {
                r1 = this;
                androidx.appcompat.app.AppCompatDelegateImpl r0 = r1.this$0
                r0.checkCloseActionMenu(r2)
                return
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter.Callback
        public boolean onOpenSubMenu(androidx.appcompat.view.menu.MenuBuilder r3) {
                r2 = this;
                androidx.appcompat.app.AppCompatDelegateImpl r0 = r2.this$0
                android.view.Window$Callback r0 = r0.getWindowCallback()
                if (r0 == 0) goto Ld
                r1 = 108(0x6c, float:1.51E-43)
                r0.onMenuOpened(r1, r3)
            Ld:
                r1 = 1
                return r1
        }
    }

    class ActionModeCallbackWrapperV9 implements androidx.appcompat.view.ActionMode.Callback {
        private androidx.appcompat.view.ActionMode.Callback mWrapped;
        final /* synthetic */ androidx.appcompat.app.AppCompatDelegateImpl this$0;


        public ActionModeCallbackWrapperV9(androidx.appcompat.app.AppCompatDelegateImpl r1, androidx.appcompat.view.ActionMode.Callback r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.mWrapped = r2
                return
        }

        @Override // androidx.appcompat.view.ActionMode.Callback
        public boolean onActionItemClicked(androidx.appcompat.view.ActionMode r2, android.view.MenuItem r3) {
                r1 = this;
                androidx.appcompat.view.ActionMode$Callback r0 = r1.mWrapped
                boolean r0 = r0.onActionItemClicked(r2, r3)
                return r0
        }

        @Override // androidx.appcompat.view.ActionMode.Callback
        public boolean onCreateActionMode(androidx.appcompat.view.ActionMode r2, android.view.Menu r3) {
                r1 = this;
                androidx.appcompat.view.ActionMode$Callback r0 = r1.mWrapped
                boolean r0 = r0.onCreateActionMode(r2, r3)
                return r0
        }

        @Override // androidx.appcompat.view.ActionMode.Callback
        public void onDestroyActionMode(androidx.appcompat.view.ActionMode r4) {
                r3 = this;
                androidx.appcompat.view.ActionMode$Callback r0 = r3.mWrapped
                r0.onDestroyActionMode(r4)
                androidx.appcompat.app.AppCompatDelegateImpl r0 = r3.this$0
                android.widget.PopupWindow r0 = r0.mActionModePopup
                if (r0 == 0) goto L1a
                androidx.appcompat.app.AppCompatDelegateImpl r0 = r3.this$0
                android.view.Window r0 = r0.mWindow
                android.view.View r0 = r0.getDecorView()
                androidx.appcompat.app.AppCompatDelegateImpl r1 = r3.this$0
                java.lang.Runnable r1 = r1.mShowActionModePopup
                r0.removeCallbacks(r1)
            L1a:
                androidx.appcompat.app.AppCompatDelegateImpl r0 = r3.this$0
                androidx.appcompat.widget.ActionBarContextView r0 = r0.mActionModeView
                if (r0 == 0) goto L42
                androidx.appcompat.app.AppCompatDelegateImpl r0 = r3.this$0
                r0.endOnGoingFadeAnimation()
                androidx.appcompat.app.AppCompatDelegateImpl r0 = r3.this$0
                androidx.appcompat.app.AppCompatDelegateImpl r1 = r3.this$0
                androidx.appcompat.widget.ActionBarContextView r1 = r1.mActionModeView
                androidx.core.view.ViewPropertyAnimatorCompat r1 = androidx.core.view.ViewCompat.animate(r1)
                r2 = 0
                androidx.core.view.ViewPropertyAnimatorCompat r1 = r1.alpha(r2)
                r0.mFadeAnim = r1
                androidx.appcompat.app.AppCompatDelegateImpl r0 = r3.this$0
                androidx.core.view.ViewPropertyAnimatorCompat r0 = r0.mFadeAnim
                androidx.appcompat.app.AppCompatDelegateImpl$ActionModeCallbackWrapperV9$1 r1 = new androidx.appcompat.app.AppCompatDelegateImpl$ActionModeCallbackWrapperV9$1
                r1.<init>(r3)
                r0.setListener(r1)
            L42:
                androidx.appcompat.app.AppCompatDelegateImpl r0 = r3.this$0
                androidx.appcompat.app.AppCompatCallback r0 = r0.mAppCompatCallback
                if (r0 == 0) goto L53
                androidx.appcompat.app.AppCompatDelegateImpl r0 = r3.this$0
                androidx.appcompat.app.AppCompatCallback r0 = r0.mAppCompatCallback
                androidx.appcompat.app.AppCompatDelegateImpl r1 = r3.this$0
                androidx.appcompat.view.ActionMode r1 = r1.mActionMode
                r0.onSupportActionModeFinished(r1)
            L53:
                androidx.appcompat.app.AppCompatDelegateImpl r0 = r3.this$0
                r1 = 0
                r0.mActionMode = r1
                androidx.appcompat.app.AppCompatDelegateImpl r0 = r3.this$0
                android.view.ViewGroup r0 = r0.mSubDecor
                androidx.core.view.ViewCompat.requestApplyInsets(r0)
                androidx.appcompat.app.AppCompatDelegateImpl r0 = r3.this$0
                r0.updateBackInvokedCallbackState()
                return
        }

        @Override // androidx.appcompat.view.ActionMode.Callback
        public boolean onPrepareActionMode(androidx.appcompat.view.ActionMode r2, android.view.Menu r3) {
                r1 = this;
                androidx.appcompat.app.AppCompatDelegateImpl r0 = r1.this$0
                android.view.ViewGroup r0 = r0.mSubDecor
                androidx.core.view.ViewCompat.requestApplyInsets(r0)
                androidx.appcompat.view.ActionMode$Callback r0 = r1.mWrapped
                boolean r0 = r0.onPrepareActionMode(r2, r3)
                return r0
        }
    }

    static class Api21Impl {
        private Api21Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static boolean isPowerSaveMode(android.os.PowerManager r1) {
                boolean r0 = r1.isPowerSaveMode()
                return r0
        }

        static java.lang.String toLanguageTag(java.util.Locale r1) {
                java.lang.String r0 = r1.toLanguageTag()
                return r0
        }
    }

    static class Api24Impl {
        private Api24Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static void generateConfigDelta_locale(android.content.res.Configuration r3, android.content.res.Configuration r4, android.content.res.Configuration r5) {
                android.os.LocaleList r0 = r3.getLocales()
                android.os.LocaleList r1 = r4.getLocales()
                boolean r2 = r0.equals(r1)
                if (r2 != 0) goto L15
                r5.setLocales(r1)
                java.util.Locale r2 = r4.locale
                r5.locale = r2
            L15:
                return
        }

        static androidx.core.os.LocaleListCompat getLocales(android.content.res.Configuration r1) {
                android.os.LocaleList r0 = r1.getLocales()
                java.lang.String r0 = r0.toLanguageTags()
                androidx.core.os.LocaleListCompat r0 = androidx.core.os.LocaleListCompat.forLanguageTags(r0)
                return r0
        }

        public static void setDefaultLocales(androidx.core.os.LocaleListCompat r1) {
                java.lang.String r0 = r1.toLanguageTags()
                android.os.LocaleList r0 = android.os.LocaleList.forLanguageTags(r0)
                android.os.LocaleList.setDefault(r0)
                return
        }

        static void setLocales(android.content.res.Configuration r1, androidx.core.os.LocaleListCompat r2) {
                java.lang.String r0 = r2.toLanguageTags()
                android.os.LocaleList r0 = android.os.LocaleList.forLanguageTags(r0)
                r1.setLocales(r0)
                return
        }
    }

    static class Api26Impl {
        private Api26Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static void generateConfigDelta_colorMode(android.content.res.Configuration r2, android.content.res.Configuration r3, android.content.res.Configuration r4) {
                int r0 = r2.colorMode
                r0 = r0 & 3
                int r1 = r3.colorMode
                r1 = r1 & 3
                if (r0 == r1) goto L13
                int r0 = r4.colorMode
                int r1 = r3.colorMode
                r1 = r1 & 3
                r0 = r0 | r1
                r4.colorMode = r0
            L13:
                int r0 = r2.colorMode
                r0 = r0 & 12
                int r1 = r3.colorMode
                r1 = r1 & 12
                if (r0 == r1) goto L26
                int r0 = r4.colorMode
                int r1 = r3.colorMode
                r1 = r1 & 12
                r0 = r0 | r1
                r4.colorMode = r0
            L26:
                return
        }
    }

    static class Api33Impl {
        private Api33Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static android.window.OnBackInvokedDispatcher getOnBackInvokedDispatcher(android.app.Activity r1) {
                android.window.OnBackInvokedDispatcher r0 = r1.getOnBackInvokedDispatcher()
                return r0
        }

        static android.window.OnBackInvokedCallback registerOnBackPressedCallback(java.lang.Object r3, androidx.appcompat.app.AppCompatDelegateImpl r4) {
                java.util.Objects.requireNonNull(r4)
                androidx.appcompat.app.AppCompatDelegateImpl$Api33Impl$$ExternalSyntheticLambda0 r0 = new androidx.appcompat.app.AppCompatDelegateImpl$Api33Impl$$ExternalSyntheticLambda0
                r0.<init>(r4)
                r1 = r3
                android.window.OnBackInvokedDispatcher r1 = (android.window.OnBackInvokedDispatcher) r1
                r2 = 1000000(0xf4240, float:1.401298E-39)
                r1.registerOnBackInvokedCallback(r2, r0)
                return r0
        }

        static void unregisterOnBackInvokedCallback(java.lang.Object r2, java.lang.Object r3) {
                r0 = r3
                android.window.OnBackInvokedCallback r0 = (android.window.OnBackInvokedCallback) r0
                r1 = r2
                android.window.OnBackInvokedDispatcher r1 = (android.window.OnBackInvokedDispatcher) r1
                r1.unregisterOnBackInvokedCallback(r0)
                return
        }
    }

    class AppCompatWindowCallback extends androidx.appcompat.view.WindowCallbackWrapper {
        private androidx.appcompat.app.AppCompatDelegateImpl.ActionBarMenuCallback mActionBarCallback;
        private boolean mDispatchKeyEventBypassEnabled;
        private boolean mOnContentChangedBypassEnabled;
        private boolean mOnPanelClosedBypassEnabled;
        final /* synthetic */ androidx.appcompat.app.AppCompatDelegateImpl this$0;

        AppCompatWindowCallback(androidx.appcompat.app.AppCompatDelegateImpl r1, android.view.Window.Callback r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r2)
                return
        }

        public boolean bypassDispatchKeyEvent(android.view.Window.Callback r3, android.view.KeyEvent r4) {
                r2 = this;
                r0 = 1
                r1 = 0
                r2.mDispatchKeyEventBypassEnabled = r0     // Catch: java.lang.Throwable -> Lb
                boolean r0 = r3.dispatchKeyEvent(r4)     // Catch: java.lang.Throwable -> Lb
                r2.mDispatchKeyEventBypassEnabled = r1
                return r0
            Lb:
                r0 = move-exception
                r2.mDispatchKeyEventBypassEnabled = r1
                throw r0
        }

        public void bypassOnContentChanged(android.view.Window.Callback r3) {
                r2 = this;
                r0 = 1
                r1 = 0
                r2.mOnContentChangedBypassEnabled = r0     // Catch: java.lang.Throwable -> Lb
                r3.onContentChanged()     // Catch: java.lang.Throwable -> Lb
                r2.mOnContentChangedBypassEnabled = r1
                return
            Lb:
                r0 = move-exception
                r2.mOnContentChangedBypassEnabled = r1
                throw r0
        }

        public void bypassOnPanelClosed(android.view.Window.Callback r3, int r4, android.view.Menu r5) {
                r2 = this;
                r0 = 1
                r1 = 0
                r2.mOnPanelClosedBypassEnabled = r0     // Catch: java.lang.Throwable -> Lb
                r3.onPanelClosed(r4, r5)     // Catch: java.lang.Throwable -> Lb
                r2.mOnPanelClosedBypassEnabled = r1
                return
            Lb:
                r0 = move-exception
                r2.mOnPanelClosedBypassEnabled = r1
                throw r0
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public boolean dispatchKeyEvent(android.view.KeyEvent r2) {
                r1 = this;
                boolean r0 = r1.mDispatchKeyEventBypassEnabled
                if (r0 == 0) goto Ld
                android.view.Window$Callback r0 = r1.getWrapped()
                boolean r0 = r0.dispatchKeyEvent(r2)
                return r0
            Ld:
                androidx.appcompat.app.AppCompatDelegateImpl r0 = r1.this$0
                boolean r0 = r0.dispatchKeyEvent(r2)
                if (r0 != 0) goto L1e
                boolean r0 = super.dispatchKeyEvent(r2)
                if (r0 == 0) goto L1c
                goto L1e
            L1c:
                r0 = 0
                goto L1f
            L1e:
                r0 = 1
            L1f:
                return r0
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public boolean dispatchKeyShortcutEvent(android.view.KeyEvent r3) {
                r2 = this;
                boolean r0 = super.dispatchKeyShortcutEvent(r3)
                if (r0 != 0) goto L15
                androidx.appcompat.app.AppCompatDelegateImpl r0 = r2.this$0
                int r1 = r3.getKeyCode()
                boolean r0 = r0.onKeyShortcut(r1, r3)
                if (r0 == 0) goto L13
                goto L15
            L13:
                r0 = 0
                goto L16
            L15:
                r0 = 1
            L16:
                return r0
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public void onContentChanged() {
                r1 = this;
                boolean r0 = r1.mOnContentChangedBypassEnabled
                if (r0 == 0) goto Lc
                android.view.Window$Callback r0 = r1.getWrapped()
                r0.onContentChanged()
                return
            Lc:
                return
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public boolean onCreatePanelMenu(int r2, android.view.Menu r3) {
                r1 = this;
                if (r2 != 0) goto L8
                boolean r0 = r3 instanceof androidx.appcompat.view.menu.MenuBuilder
                if (r0 != 0) goto L8
                r0 = 0
                return r0
            L8:
                boolean r0 = super.onCreatePanelMenu(r2, r3)
                return r0
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public android.view.View onCreatePanelView(int r2) {
                r1 = this;
                androidx.appcompat.app.AppCompatDelegateImpl$ActionBarMenuCallback r0 = r1.mActionBarCallback
                if (r0 == 0) goto Ld
                androidx.appcompat.app.AppCompatDelegateImpl$ActionBarMenuCallback r0 = r1.mActionBarCallback
                android.view.View r0 = r0.onCreatePanelView(r2)
                if (r0 == 0) goto Ld
                return r0
            Ld:
                android.view.View r0 = super.onCreatePanelView(r2)
                return r0
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public boolean onMenuOpened(int r2, android.view.Menu r3) {
                r1 = this;
                super.onMenuOpened(r2, r3)
                androidx.appcompat.app.AppCompatDelegateImpl r0 = r1.this$0
                r0.onMenuOpened(r2)
                r0 = 1
                return r0
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public void onPanelClosed(int r2, android.view.Menu r3) {
                r1 = this;
                boolean r0 = r1.mOnPanelClosedBypassEnabled
                if (r0 == 0) goto Lc
                android.view.Window$Callback r0 = r1.getWrapped()
                r0.onPanelClosed(r2, r3)
                return
            Lc:
                super.onPanelClosed(r2, r3)
                androidx.appcompat.app.AppCompatDelegateImpl r0 = r1.this$0
                r0.onPanelClosed(r2)
                return
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public boolean onPreparePanel(int r5, android.view.View r6, android.view.Menu r7) {
                r4 = this;
                boolean r0 = r7 instanceof androidx.appcompat.view.menu.MenuBuilder
                if (r0 == 0) goto L8
                r0 = r7
                androidx.appcompat.view.menu.MenuBuilder r0 = (androidx.appcompat.view.menu.MenuBuilder) r0
                goto L9
            L8:
                r0 = 0
            L9:
                r1 = 0
                if (r5 != 0) goto Lf
                if (r0 != 0) goto Lf
                return r1
            Lf:
                if (r0 == 0) goto L15
                r2 = 1
                r0.setOverrideVisibleItems(r2)
            L15:
                r2 = 0
                androidx.appcompat.app.AppCompatDelegateImpl$ActionBarMenuCallback r3 = r4.mActionBarCallback
                if (r3 == 0) goto L23
                androidx.appcompat.app.AppCompatDelegateImpl$ActionBarMenuCallback r3 = r4.mActionBarCallback
                boolean r3 = r3.onPreparePanel(r5)
                if (r3 == 0) goto L23
                r2 = 1
            L23:
                if (r2 != 0) goto L29
                boolean r2 = super.onPreparePanel(r5, r6, r7)
            L29:
                if (r0 == 0) goto L2e
                r0.setOverrideVisibleItems(r1)
            L2e:
                return r2
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public void onProvideKeyboardShortcuts(java.util.List<android.view.KeyboardShortcutGroup> r4, android.view.Menu r5, int r6) {
                r3 = this;
                androidx.appcompat.app.AppCompatDelegateImpl r0 = r3.this$0
                r1 = 0
                r2 = 1
                androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState r0 = r0.getPanelState(r1, r2)
                if (r0 == 0) goto L14
                androidx.appcompat.view.menu.MenuBuilder r1 = r0.menu
                if (r1 == 0) goto L14
                androidx.appcompat.view.menu.MenuBuilder r1 = r0.menu
                super.onProvideKeyboardShortcuts(r4, r1, r6)
                goto L17
            L14:
                super.onProvideKeyboardShortcuts(r4, r5, r6)
            L17:
                return
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public android.view.ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback r2) {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // androidx.appcompat.view.WindowCallbackWrapper, android.view.Window.Callback
        public android.view.ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback r2, int r3) {
                r1 = this;
                androidx.appcompat.app.AppCompatDelegateImpl r0 = r1.this$0
                boolean r0 = r0.isHandleNativeActionModesEnabled()
                if (r0 == 0) goto L11
                switch(r3) {
                    case 0: goto Lc;
                    default: goto Lb;
                }
            Lb:
                goto L11
            Lc:
                android.view.ActionMode r0 = r1.startAsSupportActionMode(r2)
                return r0
            L11:
                android.view.ActionMode r0 = super.onWindowStartingActionMode(r2, r3)
                return r0
        }

        void setActionBarCallback(androidx.appcompat.app.AppCompatDelegateImpl.ActionBarMenuCallback r1) {
                r0 = this;
                r0.mActionBarCallback = r1
                return
        }

        final android.view.ActionMode startAsSupportActionMode(android.view.ActionMode.Callback r4) {
                r3 = this;
                androidx.appcompat.view.SupportActionModeWrapper$CallbackWrapper r0 = new androidx.appcompat.view.SupportActionModeWrapper$CallbackWrapper
                androidx.appcompat.app.AppCompatDelegateImpl r1 = r3.this$0
                android.content.Context r1 = r1.mContext
                r0.<init>(r1, r4)
                androidx.appcompat.app.AppCompatDelegateImpl r1 = r3.this$0
                androidx.appcompat.view.ActionMode r1 = r1.startSupportActionMode(r0)
                if (r1 == 0) goto L16
                android.view.ActionMode r2 = r0.getActionModeWrapper(r1)
                return r2
            L16:
                r2 = 0
                return r2
        }
    }

    private class AutoBatteryNightModeManager extends androidx.appcompat.app.AppCompatDelegateImpl.AutoNightModeManager {
        private final android.os.PowerManager mPowerManager;
        final /* synthetic */ androidx.appcompat.app.AppCompatDelegateImpl this$0;

        AutoBatteryNightModeManager(androidx.appcompat.app.AppCompatDelegateImpl r2, android.content.Context r3) {
                r1 = this;
                r1.this$0 = r2
                r1.<init>(r2)
                android.content.Context r2 = r3.getApplicationContext()
                java.lang.String r0 = "power"
                java.lang.Object r2 = r2.getSystemService(r0)
                android.os.PowerManager r2 = (android.os.PowerManager) r2
                r1.mPowerManager = r2
                return
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.AutoNightModeManager
        android.content.IntentFilter createIntentFilterForBroadcastReceiver() {
                r2 = this;
                android.content.IntentFilter r0 = new android.content.IntentFilter
                r0.<init>()
                java.lang.String r1 = "android.os.action.POWER_SAVE_MODE_CHANGED"
                r0.addAction(r1)
                return r0
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.AutoNightModeManager
        public int getApplyableNightMode() {
                r1 = this;
                android.os.PowerManager r0 = r1.mPowerManager
                boolean r0 = androidx.appcompat.app.AppCompatDelegateImpl.Api21Impl.isPowerSaveMode(r0)
                if (r0 == 0) goto Lb
                r0 = 2
                goto Lc
            Lb:
                r0 = 1
            Lc:
                return r0
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.AutoNightModeManager
        public void onChange() {
                r1 = this;
                androidx.appcompat.app.AppCompatDelegateImpl r0 = r1.this$0
                r0.applyDayNight()
                return
        }
    }

    abstract class AutoNightModeManager {
        private android.content.BroadcastReceiver mReceiver;
        final /* synthetic */ androidx.appcompat.app.AppCompatDelegateImpl this$0;


        AutoNightModeManager(androidx.appcompat.app.AppCompatDelegateImpl r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        void cleanup() {
                r2 = this;
                android.content.BroadcastReceiver r0 = r2.mReceiver
                if (r0 == 0) goto L12
                androidx.appcompat.app.AppCompatDelegateImpl r0 = r2.this$0     // Catch: java.lang.IllegalArgumentException -> Le
                android.content.Context r0 = r0.mContext     // Catch: java.lang.IllegalArgumentException -> Le
                android.content.BroadcastReceiver r1 = r2.mReceiver     // Catch: java.lang.IllegalArgumentException -> Le
                r0.unregisterReceiver(r1)     // Catch: java.lang.IllegalArgumentException -> Le
                goto Lf
            Le:
                r0 = move-exception
            Lf:
                r0 = 0
                r2.mReceiver = r0
            L12:
                return
        }

        abstract android.content.IntentFilter createIntentFilterForBroadcastReceiver();

        abstract int getApplyableNightMode();

        boolean isListening() {
                r1 = this;
                android.content.BroadcastReceiver r0 = r1.mReceiver
                if (r0 == 0) goto L6
                r0 = 1
                goto L7
            L6:
                r0 = 0
            L7:
                return r0
        }

        abstract void onChange();

        void setup() {
                r3 = this;
                r3.cleanup()
                android.content.IntentFilter r0 = r3.createIntentFilterForBroadcastReceiver()
                if (r0 == 0) goto L25
                int r1 = r0.countActions()
                if (r1 != 0) goto L10
                goto L25
            L10:
                android.content.BroadcastReceiver r1 = r3.mReceiver
                if (r1 != 0) goto L1b
                androidx.appcompat.app.AppCompatDelegateImpl$AutoNightModeManager$1 r1 = new androidx.appcompat.app.AppCompatDelegateImpl$AutoNightModeManager$1
                r1.<init>(r3)
                r3.mReceiver = r1
            L1b:
                androidx.appcompat.app.AppCompatDelegateImpl r1 = r3.this$0
                android.content.Context r1 = r1.mContext
                android.content.BroadcastReceiver r2 = r3.mReceiver
                r1.registerReceiver(r2, r0)
                return
            L25:
                return
        }
    }

    private class AutoTimeNightModeManager extends androidx.appcompat.app.AppCompatDelegateImpl.AutoNightModeManager {
        private final androidx.appcompat.app.TwilightManager mTwilightManager;
        final /* synthetic */ androidx.appcompat.app.AppCompatDelegateImpl this$0;

        AutoTimeNightModeManager(androidx.appcompat.app.AppCompatDelegateImpl r1, androidx.appcompat.app.TwilightManager r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r1)
                r0.mTwilightManager = r2
                return
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.AutoNightModeManager
        android.content.IntentFilter createIntentFilterForBroadcastReceiver() {
                r2 = this;
                android.content.IntentFilter r0 = new android.content.IntentFilter
                r0.<init>()
                java.lang.String r1 = "android.intent.action.TIME_SET"
                r0.addAction(r1)
                java.lang.String r1 = "android.intent.action.TIMEZONE_CHANGED"
                r0.addAction(r1)
                java.lang.String r1 = "android.intent.action.TIME_TICK"
                r0.addAction(r1)
                return r0
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.AutoNightModeManager
        public int getApplyableNightMode() {
                r1 = this;
                androidx.appcompat.app.TwilightManager r0 = r1.mTwilightManager
                boolean r0 = r0.isNight()
                if (r0 == 0) goto La
                r0 = 2
                goto Lb
            La:
                r0 = 1
            Lb:
                return r0
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.AutoNightModeManager
        public void onChange() {
                r1 = this;
                androidx.appcompat.app.AppCompatDelegateImpl r0 = r1.this$0
                r0.applyDayNight()
                return
        }
    }

    private class ListMenuDecorView extends androidx.appcompat.widget.ContentFrameLayout {
        final /* synthetic */ androidx.appcompat.app.AppCompatDelegateImpl this$0;

        public ListMenuDecorView(androidx.appcompat.app.AppCompatDelegateImpl r1, android.content.Context r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r2)
                return
        }

        private boolean isOutOfBounds(int r2, int r3) {
                r1 = this;
                r0 = -5
                if (r2 < r0) goto L18
                if (r3 < r0) goto L18
                int r0 = r1.getWidth()
                int r0 = r0 + 5
                if (r2 > r0) goto L18
                int r0 = r1.getHeight()
                int r0 = r0 + 5
                if (r3 <= r0) goto L16
                goto L18
            L16:
                r0 = 0
                goto L19
            L18:
                r0 = 1
            L19:
                return r0
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchKeyEvent(android.view.KeyEvent r2) {
                r1 = this;
                androidx.appcompat.app.AppCompatDelegateImpl r0 = r1.this$0
                boolean r0 = r0.dispatchKeyEvent(r2)
                if (r0 != 0) goto L11
                boolean r0 = super.dispatchKeyEvent(r2)
                if (r0 == 0) goto Lf
                goto L11
            Lf:
                r0 = 0
                goto L12
            L11:
                r0 = 1
            L12:
                return r0
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(android.view.MotionEvent r6) {
                r5 = this;
                int r0 = r6.getAction()
                if (r0 != 0) goto L1e
                float r1 = r6.getX()
                int r1 = (int) r1
                float r2 = r6.getY()
                int r2 = (int) r2
                boolean r3 = r5.isOutOfBounds(r1, r2)
                if (r3 == 0) goto L1e
                androidx.appcompat.app.AppCompatDelegateImpl r3 = r5.this$0
                r4 = 0
                r3.closePanel(r4)
                r3 = 1
                return r3
            L1e:
                boolean r1 = super.onInterceptTouchEvent(r6)
                return r1
        }

        @Override // android.view.View
        public void setBackgroundResource(int r2) {
                r1 = this;
                android.content.Context r0 = r1.getContext()
                android.graphics.drawable.Drawable r0 = androidx.appcompat.content.res.AppCompatResources.getDrawable(r0, r2)
                r1.setBackgroundDrawable(r0)
                return
        }
    }

    protected static final class PanelFeatureState {
        int background;
        android.view.View createdPanelView;
        android.view.ViewGroup decorView;
        int featureId;
        android.os.Bundle frozenActionViewState;
        android.os.Bundle frozenMenuState;
        int gravity;
        boolean isHandled;
        boolean isOpen;
        boolean isPrepared;
        androidx.appcompat.view.menu.ListMenuPresenter listMenuPresenter;
        android.content.Context listPresenterContext;
        androidx.appcompat.view.menu.MenuBuilder menu;
        public boolean qwertyMode;
        boolean refreshDecorView;
        boolean refreshMenuContent;
        android.view.View shownPanelView;
        boolean wasLastOpen;
        int windowAnimations;
        int x;
        int y;

        private static class SavedState implements android.os.Parcelable {
            public static final android.os.Parcelable.Creator<androidx.appcompat.app.AppCompatDelegateImpl.PanelFeatureState.SavedState> CREATOR = null;
            int featureId;
            boolean isOpen;
            android.os.Bundle menuState;


            static {
                    androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState$SavedState$1 r0 = new androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState$SavedState$1
                    r0.<init>()
                    androidx.appcompat.app.AppCompatDelegateImpl.PanelFeatureState.SavedState.CREATOR = r0
                    return
            }

            SavedState() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            static androidx.appcompat.app.AppCompatDelegateImpl.PanelFeatureState.SavedState readFromParcel(android.os.Parcel r3, java.lang.ClassLoader r4) {
                    androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState$SavedState r0 = new androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState$SavedState
                    r0.<init>()
                    int r1 = r3.readInt()
                    r0.featureId = r1
                    int r1 = r3.readInt()
                    r2 = 1
                    if (r1 != r2) goto L13
                    goto L14
                L13:
                    r2 = 0
                L14:
                    r0.isOpen = r2
                    boolean r1 = r0.isOpen
                    if (r1 == 0) goto L20
                    android.os.Bundle r1 = r3.readBundle(r4)
                    r0.menuState = r1
                L20:
                    return r0
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                    r1 = this;
                    r0 = 0
                    return r0
            }

            @Override // android.os.Parcelable
            public void writeToParcel(android.os.Parcel r2, int r3) {
                    r1 = this;
                    int r0 = r1.featureId
                    r2.writeInt(r0)
                    boolean r0 = r1.isOpen
                    r2.writeInt(r0)
                    boolean r0 = r1.isOpen
                    if (r0 == 0) goto L13
                    android.os.Bundle r0 = r1.menuState
                    r2.writeBundle(r0)
                L13:
                    return
            }
        }

        PanelFeatureState(int r2) {
                r1 = this;
                r1.<init>()
                r1.featureId = r2
                r0 = 0
                r1.refreshDecorView = r0
                return
        }

        void applyFrozenState() {
                r2 = this;
                androidx.appcompat.view.menu.MenuBuilder r0 = r2.menu
                if (r0 == 0) goto L12
                android.os.Bundle r0 = r2.frozenMenuState
                if (r0 == 0) goto L12
                androidx.appcompat.view.menu.MenuBuilder r0 = r2.menu
                android.os.Bundle r1 = r2.frozenMenuState
                r0.restorePresenterStates(r1)
                r0 = 0
                r2.frozenMenuState = r0
            L12:
                return
        }

        public void clearMenuPresenters() {
                r2 = this;
                androidx.appcompat.view.menu.MenuBuilder r0 = r2.menu
                if (r0 == 0) goto Lb
                androidx.appcompat.view.menu.MenuBuilder r0 = r2.menu
                androidx.appcompat.view.menu.ListMenuPresenter r1 = r2.listMenuPresenter
                r0.removeMenuPresenter(r1)
            Lb:
                r0 = 0
                r2.listMenuPresenter = r0
                return
        }

        androidx.appcompat.view.menu.MenuView getListMenuView(androidx.appcompat.view.menu.MenuPresenter.Callback r4) {
                r3 = this;
                androidx.appcompat.view.menu.MenuBuilder r0 = r3.menu
                if (r0 != 0) goto L6
                r0 = 0
                return r0
            L6:
                androidx.appcompat.view.menu.ListMenuPresenter r0 = r3.listMenuPresenter
                if (r0 != 0) goto L21
                androidx.appcompat.view.menu.ListMenuPresenter r0 = new androidx.appcompat.view.menu.ListMenuPresenter
                android.content.Context r1 = r3.listPresenterContext
                int r2 = androidx.appcompat.R.layout.abc_list_menu_item_layout
                r0.<init>(r1, r2)
                r3.listMenuPresenter = r0
                androidx.appcompat.view.menu.ListMenuPresenter r0 = r3.listMenuPresenter
                r0.setCallback(r4)
                androidx.appcompat.view.menu.MenuBuilder r0 = r3.menu
                androidx.appcompat.view.menu.ListMenuPresenter r1 = r3.listMenuPresenter
                r0.addMenuPresenter(r1)
            L21:
                androidx.appcompat.view.menu.ListMenuPresenter r0 = r3.listMenuPresenter
                android.view.ViewGroup r1 = r3.decorView
                androidx.appcompat.view.menu.MenuView r0 = r0.getMenuView(r1)
                return r0
        }

        public boolean hasPanelItems() {
                r3 = this;
                android.view.View r0 = r3.shownPanelView
                r1 = 0
                if (r0 != 0) goto L6
                return r1
            L6:
                android.view.View r0 = r3.createdPanelView
                r2 = 1
                if (r0 == 0) goto Lc
                return r2
            Lc:
                androidx.appcompat.view.menu.ListMenuPresenter r0 = r3.listMenuPresenter
                android.widget.ListAdapter r0 = r0.getAdapter()
                int r0 = r0.getCount()
                if (r0 <= 0) goto L19
                r1 = r2
            L19:
                return r1
        }

        void onRestoreInstanceState(android.os.Parcelable r3) {
                r2 = this;
                r0 = r3
                androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState$SavedState r0 = (androidx.appcompat.app.AppCompatDelegateImpl.PanelFeatureState.SavedState) r0
                int r1 = r0.featureId
                r2.featureId = r1
                boolean r1 = r0.isOpen
                r2.wasLastOpen = r1
                android.os.Bundle r1 = r0.menuState
                r2.frozenMenuState = r1
                r1 = 0
                r2.shownPanelView = r1
                r2.decorView = r1
                return
        }

        android.os.Parcelable onSaveInstanceState() {
                r3 = this;
                androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState$SavedState r0 = new androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState$SavedState
                r0.<init>()
                int r1 = r3.featureId
                r0.featureId = r1
                boolean r1 = r3.isOpen
                r0.isOpen = r1
                androidx.appcompat.view.menu.MenuBuilder r1 = r3.menu
                if (r1 == 0) goto L1f
                android.os.Bundle r1 = new android.os.Bundle
                r1.<init>()
                r0.menuState = r1
                androidx.appcompat.view.menu.MenuBuilder r1 = r3.menu
                android.os.Bundle r2 = r0.menuState
                r1.savePresenterStates(r2)
            L1f:
                return r0
        }

        void setMenu(androidx.appcompat.view.menu.MenuBuilder r3) {
                r2 = this;
                androidx.appcompat.view.menu.MenuBuilder r0 = r2.menu
                if (r3 != r0) goto L5
                return
            L5:
                androidx.appcompat.view.menu.MenuBuilder r0 = r2.menu
                if (r0 == 0) goto L10
                androidx.appcompat.view.menu.MenuBuilder r0 = r2.menu
                androidx.appcompat.view.menu.ListMenuPresenter r1 = r2.listMenuPresenter
                r0.removeMenuPresenter(r1)
            L10:
                r2.menu = r3
                if (r3 == 0) goto L1d
                androidx.appcompat.view.menu.ListMenuPresenter r0 = r2.listMenuPresenter
                if (r0 == 0) goto L1d
                androidx.appcompat.view.menu.ListMenuPresenter r0 = r2.listMenuPresenter
                r3.addMenuPresenter(r0)
            L1d:
                return
        }

        void setStyle(android.content.Context r6) {
                r5 = this;
                android.util.TypedValue r0 = new android.util.TypedValue
                r0.<init>()
                android.content.res.Resources r1 = r6.getResources()
                android.content.res.Resources$Theme r1 = r1.newTheme()
                android.content.res.Resources$Theme r2 = r6.getTheme()
                r1.setTo(r2)
                int r2 = androidx.appcompat.R.attr.actionBarPopupTheme
                r3 = 1
                r1.resolveAttribute(r2, r0, r3)
                int r2 = r0.resourceId
                if (r2 == 0) goto L23
                int r2 = r0.resourceId
                r1.applyStyle(r2, r3)
            L23:
                int r2 = androidx.appcompat.R.attr.panelMenuListTheme
                r1.resolveAttribute(r2, r0, r3)
                int r2 = r0.resourceId
                if (r2 == 0) goto L32
                int r2 = r0.resourceId
                r1.applyStyle(r2, r3)
                goto L37
            L32:
                int r2 = androidx.appcompat.R.style.Theme_AppCompat_CompactMenu
                r1.applyStyle(r2, r3)
            L37:
                androidx.appcompat.view.ContextThemeWrapper r2 = new androidx.appcompat.view.ContextThemeWrapper
                r3 = 0
                r2.<init>(r6, r3)
                android.content.res.Resources$Theme r6 = r2.getTheme()
                r6.setTo(r1)
                r5.listPresenterContext = r2
                int[] r6 = androidx.appcompat.R.styleable.AppCompatTheme
                android.content.res.TypedArray r6 = r2.obtainStyledAttributes(r6)
                int r4 = androidx.appcompat.R.styleable.AppCompatTheme_panelBackground
                int r4 = r6.getResourceId(r4, r3)
                r5.background = r4
                int r4 = androidx.appcompat.R.styleable.AppCompatTheme_android_windowAnimationStyle
                int r3 = r6.getResourceId(r4, r3)
                r5.windowAnimations = r3
                r6.recycle()
                return
        }
    }

    private final class PanelMenuPresenterCallback implements androidx.appcompat.view.menu.MenuPresenter.Callback {
        final /* synthetic */ androidx.appcompat.app.AppCompatDelegateImpl this$0;

        PanelMenuPresenterCallback(androidx.appcompat.app.AppCompatDelegateImpl r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter.Callback
        public void onCloseMenu(androidx.appcompat.view.menu.MenuBuilder r7, boolean r8) {
                r6 = this;
                androidx.appcompat.view.menu.MenuBuilder r0 = r7.getRootMenu()
                r1 = 1
                if (r0 == r7) goto L9
                r2 = r1
                goto La
            L9:
                r2 = 0
            La:
                androidx.appcompat.app.AppCompatDelegateImpl r3 = r6.this$0
                if (r2 == 0) goto L10
                r4 = r0
                goto L11
            L10:
                r4 = r7
            L11:
                androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState r3 = r3.findMenuPanel(r4)
                if (r3 == 0) goto L2b
                if (r2 == 0) goto L26
                androidx.appcompat.app.AppCompatDelegateImpl r4 = r6.this$0
                int r5 = r3.featureId
                r4.callOnPanelClosed(r5, r3, r0)
                androidx.appcompat.app.AppCompatDelegateImpl r4 = r6.this$0
                r4.closePanel(r3, r1)
                goto L2b
            L26:
                androidx.appcompat.app.AppCompatDelegateImpl r1 = r6.this$0
                r1.closePanel(r3, r8)
            L2b:
                return
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter.Callback
        public boolean onOpenSubMenu(androidx.appcompat.view.menu.MenuBuilder r3) {
                r2 = this;
                androidx.appcompat.view.menu.MenuBuilder r0 = r3.getRootMenu()
                if (r3 != r0) goto L1f
                androidx.appcompat.app.AppCompatDelegateImpl r0 = r2.this$0
                boolean r0 = r0.mHasActionBar
                if (r0 == 0) goto L1f
                androidx.appcompat.app.AppCompatDelegateImpl r0 = r2.this$0
                android.view.Window$Callback r0 = r0.getWindowCallback()
                if (r0 == 0) goto L1f
                androidx.appcompat.app.AppCompatDelegateImpl r1 = r2.this$0
                boolean r1 = r1.mDestroyed
                if (r1 != 0) goto L1f
                r1 = 108(0x6c, float:1.51E-43)
                r0.onMenuOpened(r1, r3)
            L1f:
                r0 = 1
                return r0
        }
    }

    static {
            androidx.collection.SimpleArrayMap r0 = new androidx.collection.SimpleArrayMap
            r0.<init>()
            androidx.appcompat.app.AppCompatDelegateImpl.sLocalNightModes = r0
            r0 = 0
            androidx.appcompat.app.AppCompatDelegateImpl.IS_PRE_LOLLIPOP = r0
            r0 = 16842836(0x1010054, float:2.3693793E-38)
            int[] r0 = new int[]{r0}
            androidx.appcompat.app.AppCompatDelegateImpl.sWindowBackgroundStyleable = r0
            java.lang.String r0 = android.os.Build.FINGERPRINT
            java.lang.String r1 = "robolectric"
            boolean r0 = r1.equals(r0)
            r1 = 1
            r0 = r0 ^ r1
            androidx.appcompat.app.AppCompatDelegateImpl.sCanReturnDifferentContext = r0
            boolean r0 = androidx.appcompat.app.AppCompatDelegateImpl.IS_PRE_LOLLIPOP
            if (r0 == 0) goto L35
            boolean r0 = androidx.appcompat.app.AppCompatDelegateImpl.sInstalledExceptionHandler
            if (r0 != 0) goto L35
            java.lang.Thread$UncaughtExceptionHandler r0 = java.lang.Thread.getDefaultUncaughtExceptionHandler()
            androidx.appcompat.app.AppCompatDelegateImpl$1 r2 = new androidx.appcompat.app.AppCompatDelegateImpl$1
            r2.<init>(r0)
            java.lang.Thread.setDefaultUncaughtExceptionHandler(r2)
            androidx.appcompat.app.AppCompatDelegateImpl.sInstalledExceptionHandler = r1
        L35:
            return
    }

    AppCompatDelegateImpl(android.app.Activity r2, androidx.appcompat.app.AppCompatCallback r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0, r3, r2)
            return
    }

    AppCompatDelegateImpl(android.app.Dialog r3, androidx.appcompat.app.AppCompatCallback r4) {
            r2 = this;
            android.content.Context r0 = r3.getContext()
            android.view.Window r1 = r3.getWindow()
            r2.<init>(r0, r1, r4, r3)
            return
    }

    AppCompatDelegateImpl(android.content.Context r2, android.app.Activity r3, androidx.appcompat.app.AppCompatCallback r4) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0, r4, r3)
            return
    }

    AppCompatDelegateImpl(android.content.Context r1, android.view.Window r2, androidx.appcompat.app.AppCompatCallback r3) {
            r0 = this;
            r0.<init>(r1, r2, r3, r1)
            return
    }

    private AppCompatDelegateImpl(android.content.Context r4, android.view.Window r5, androidx.appcompat.app.AppCompatCallback r6, java.lang.Object r7) {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.mFadeAnim = r0
            r0 = 1
            r3.mHandleNativeActionModes = r0
            r0 = -100
            r3.mLocalNightMode = r0
            androidx.appcompat.app.AppCompatDelegateImpl$2 r1 = new androidx.appcompat.app.AppCompatDelegateImpl$2
            r1.<init>(r3)
            r3.mInvalidatePanelMenuRunnable = r1
            r3.mContext = r4
            r3.mAppCompatCallback = r6
            r3.mHost = r7
            int r1 = r3.mLocalNightMode
            if (r1 != r0) goto L34
            java.lang.Object r1 = r3.mHost
            boolean r1 = r1 instanceof android.app.Dialog
            if (r1 == 0) goto L34
            androidx.appcompat.app.AppCompatActivity r1 = r3.tryUnwrapContext()
            if (r1 == 0) goto L34
            androidx.appcompat.app.AppCompatDelegate r2 = r1.getDelegate()
            int r2 = r2.getLocalNightMode()
            r3.mLocalNightMode = r2
        L34:
            int r1 = r3.mLocalNightMode
            if (r1 != r0) goto L61
            androidx.collection.SimpleArrayMap<java.lang.String, java.lang.Integer> r0 = androidx.appcompat.app.AppCompatDelegateImpl.sLocalNightModes
            java.lang.Object r1 = r3.mHost
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            java.lang.Object r0 = r0.get(r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto L61
            int r1 = r0.intValue()
            r3.mLocalNightMode = r1
            androidx.collection.SimpleArrayMap<java.lang.String, java.lang.Integer> r1 = androidx.appcompat.app.AppCompatDelegateImpl.sLocalNightModes
            java.lang.Object r2 = r3.mHost
            java.lang.Class r2 = r2.getClass()
            java.lang.String r2 = r2.getName()
            r1.remove(r2)
        L61:
            if (r5 == 0) goto L66
            r3.attachToWindow(r5)
        L66:
            androidx.appcompat.widget.AppCompatDrawableManager.preload()
            return
    }

    private boolean applyApplicationSpecificConfig(boolean r2) {
            r1 = this;
            r0 = 1
            boolean r0 = r1.applyApplicationSpecificConfig(r2, r0)
            return r0
    }

    private boolean applyApplicationSpecificConfig(boolean r6, boolean r7) {
            r5 = this;
            boolean r0 = r5.mDestroyed
            if (r0 == 0) goto L6
            r0 = 0
            return r0
        L6:
            int r0 = r5.calculateNightMode()
            android.content.Context r1 = r5.mContext
            int r1 = r5.mapNightMode(r1, r0)
            r2 = 0
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 33
            if (r3 >= r4) goto L1d
            android.content.Context r3 = r5.mContext
            androidx.core.os.LocaleListCompat r2 = r5.calculateApplicationLocales(r3)
        L1d:
            if (r7 != 0) goto L2f
            if (r2 == 0) goto L2f
            android.content.Context r3 = r5.mContext
            android.content.res.Resources r3 = r3.getResources()
            android.content.res.Configuration r3 = r3.getConfiguration()
            androidx.core.os.LocaleListCompat r2 = r5.getConfigurationLocales(r3)
        L2f:
            boolean r3 = r5.updateAppConfiguration(r1, r2, r6)
            if (r0 != 0) goto L3f
            android.content.Context r4 = r5.mContext
            androidx.appcompat.app.AppCompatDelegateImpl$AutoNightModeManager r4 = r5.getAutoTimeNightModeManager(r4)
            r4.setup()
            goto L48
        L3f:
            androidx.appcompat.app.AppCompatDelegateImpl$AutoNightModeManager r4 = r5.mAutoTimeNightModeManager
            if (r4 == 0) goto L48
            androidx.appcompat.app.AppCompatDelegateImpl$AutoNightModeManager r4 = r5.mAutoTimeNightModeManager
            r4.cleanup()
        L48:
            r4 = 3
            if (r0 != r4) goto L55
            android.content.Context r4 = r5.mContext
            androidx.appcompat.app.AppCompatDelegateImpl$AutoNightModeManager r4 = r5.getAutoBatteryNightModeManager(r4)
            r4.setup()
            goto L5e
        L55:
            androidx.appcompat.app.AppCompatDelegateImpl$AutoNightModeManager r4 = r5.mAutoBatteryNightModeManager
            if (r4 == 0) goto L5e
            androidx.appcompat.app.AppCompatDelegateImpl$AutoNightModeManager r4 = r5.mAutoBatteryNightModeManager
            r4.cleanup()
        L5e:
            return r3
    }

    private void applyFixedSizeWindow() {
            r6 = this;
            android.view.ViewGroup r0 = r6.mSubDecor
            r1 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r0 = r0.findViewById(r1)
            androidx.appcompat.widget.ContentFrameLayout r0 = (androidx.appcompat.widget.ContentFrameLayout) r0
            android.view.Window r1 = r6.mWindow
            android.view.View r1 = r1.getDecorView()
            int r2 = r1.getPaddingLeft()
            int r3 = r1.getPaddingTop()
            int r4 = r1.getPaddingRight()
            int r5 = r1.getPaddingBottom()
            r0.setDecorPadding(r2, r3, r4, r5)
            android.content.Context r2 = r6.mContext
            int[] r3 = androidx.appcompat.R.styleable.AppCompatTheme
            android.content.res.TypedArray r2 = r2.obtainStyledAttributes(r3)
            int r3 = androidx.appcompat.R.styleable.AppCompatTheme_windowMinWidthMajor
            android.util.TypedValue r4 = r0.getMinWidthMajor()
            r2.getValue(r3, r4)
            int r3 = androidx.appcompat.R.styleable.AppCompatTheme_windowMinWidthMinor
            android.util.TypedValue r4 = r0.getMinWidthMinor()
            r2.getValue(r3, r4)
            int r3 = androidx.appcompat.R.styleable.AppCompatTheme_windowFixedWidthMajor
            boolean r3 = r2.hasValue(r3)
            if (r3 == 0) goto L4f
            int r3 = androidx.appcompat.R.styleable.AppCompatTheme_windowFixedWidthMajor
            android.util.TypedValue r4 = r0.getFixedWidthMajor()
            r2.getValue(r3, r4)
        L4f:
            int r3 = androidx.appcompat.R.styleable.AppCompatTheme_windowFixedWidthMinor
            boolean r3 = r2.hasValue(r3)
            if (r3 == 0) goto L60
            int r3 = androidx.appcompat.R.styleable.AppCompatTheme_windowFixedWidthMinor
            android.util.TypedValue r4 = r0.getFixedWidthMinor()
            r2.getValue(r3, r4)
        L60:
            int r3 = androidx.appcompat.R.styleable.AppCompatTheme_windowFixedHeightMajor
            boolean r3 = r2.hasValue(r3)
            if (r3 == 0) goto L71
            int r3 = androidx.appcompat.R.styleable.AppCompatTheme_windowFixedHeightMajor
            android.util.TypedValue r4 = r0.getFixedHeightMajor()
            r2.getValue(r3, r4)
        L71:
            int r3 = androidx.appcompat.R.styleable.AppCompatTheme_windowFixedHeightMinor
            boolean r3 = r2.hasValue(r3)
            if (r3 == 0) goto L82
            int r3 = androidx.appcompat.R.styleable.AppCompatTheme_windowFixedHeightMinor
            android.util.TypedValue r4 = r0.getFixedHeightMinor()
            r2.getValue(r3, r4)
        L82:
            r2.recycle()
            r0.requestLayout()
            return
    }

    private void attachToWindow(android.view.Window r7) {
            r6 = this;
            android.view.Window r0 = r6.mWindow
            java.lang.String r1 = "AppCompat has already installed itself into the Window"
            if (r0 != 0) goto L46
            android.view.Window$Callback r0 = r7.getCallback()
            boolean r2 = r0 instanceof androidx.appcompat.app.AppCompatDelegateImpl.AppCompatWindowCallback
            if (r2 != 0) goto L40
            androidx.appcompat.app.AppCompatDelegateImpl$AppCompatWindowCallback r1 = new androidx.appcompat.app.AppCompatDelegateImpl$AppCompatWindowCallback
            r1.<init>(r6, r0)
            r6.mAppCompatWindowCallback = r1
            androidx.appcompat.app.AppCompatDelegateImpl$AppCompatWindowCallback r1 = r6.mAppCompatWindowCallback
            r7.setCallback(r1)
            android.content.Context r1 = r6.mContext
            int[] r2 = androidx.appcompat.app.AppCompatDelegateImpl.sWindowBackgroundStyleable
            r3 = 0
            androidx.appcompat.widget.TintTypedArray r1 = androidx.appcompat.widget.TintTypedArray.obtainStyledAttributes(r1, r3, r2)
            r2 = 0
            android.graphics.drawable.Drawable r2 = r1.getDrawableIfKnown(r2)
            if (r2 == 0) goto L2d
            r7.setBackgroundDrawable(r2)
        L2d:
            r1.recycle()
            r6.mWindow = r7
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 33
            if (r4 < r5) goto L3f
            android.window.OnBackInvokedDispatcher r4 = r6.mDispatcher
            if (r4 != 0) goto L3f
            r6.setOnBackInvokedDispatcher(r3)
        L3f:
            return
        L40:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            r2.<init>(r1)
            throw r2
        L46:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
    }

    private int calculateNightMode() {
            r2 = this;
            int r0 = r2.mLocalNightMode
            r1 = -100
            if (r0 == r1) goto L9
            int r0 = r2.mLocalNightMode
            goto Ld
        L9:
            int r0 = getDefaultNightMode()
        Ld:
            return r0
    }

    private void cleanupAutoManagers() {
            r1 = this;
            androidx.appcompat.app.AppCompatDelegateImpl$AutoNightModeManager r0 = r1.mAutoTimeNightModeManager
            if (r0 == 0) goto L9
            androidx.appcompat.app.AppCompatDelegateImpl$AutoNightModeManager r0 = r1.mAutoTimeNightModeManager
            r0.cleanup()
        L9:
            androidx.appcompat.app.AppCompatDelegateImpl$AutoNightModeManager r0 = r1.mAutoBatteryNightModeManager
            if (r0 == 0) goto L12
            androidx.appcompat.app.AppCompatDelegateImpl$AutoNightModeManager r0 = r1.mAutoBatteryNightModeManager
            r0.cleanup()
        L12:
            return
    }

    private android.content.res.Configuration createOverrideAppConfiguration(android.content.Context r4, int r5, androidx.core.os.LocaleListCompat r6, android.content.res.Configuration r7, boolean r8) {
            r3 = this;
            switch(r5) {
                case 1: goto La;
                case 2: goto L7;
                default: goto L3;
            }
        L3:
            if (r8 == 0) goto Ld
            r0 = 0
            goto L1f
        L7:
            r0 = 32
            goto L1f
        La:
            r0 = 16
            goto L1f
        Ld:
            android.content.Context r0 = r4.getApplicationContext()
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r1 = r0.uiMode
            r1 = r1 & 48
            r0 = r1
        L1f:
            android.content.res.Configuration r1 = new android.content.res.Configuration
            r1.<init>()
            r2 = 0
            r1.fontScale = r2
            if (r7 == 0) goto L2c
            r1.setTo(r7)
        L2c:
            int r2 = r1.uiMode
            r2 = r2 & (-49)
            r2 = r2 | r0
            r1.uiMode = r2
            if (r6 == 0) goto L38
            r3.setConfigurationLocales(r1, r6)
        L38:
            return r1
    }

    private android.view.ViewGroup createSubDecor() {
            r10 = this;
            android.content.Context r0 = r10.mContext
            int[] r1 = androidx.appcompat.R.styleable.AppCompatTheme
            android.content.res.TypedArray r0 = r0.obtainStyledAttributes(r1)
            int r1 = androidx.appcompat.R.styleable.AppCompatTheme_windowActionBar
            boolean r1 = r0.hasValue(r1)
            if (r1 == 0) goto L1a2
            int r1 = androidx.appcompat.R.styleable.AppCompatTheme_windowNoTitle
            r2 = 0
            boolean r1 = r0.getBoolean(r1, r2)
            r3 = 1
            if (r1 == 0) goto L1e
            r10.requestWindowFeature(r3)
            goto L2b
        L1e:
            int r1 = androidx.appcompat.R.styleable.AppCompatTheme_windowActionBar
            boolean r1 = r0.getBoolean(r1, r2)
            if (r1 == 0) goto L2b
            r1 = 108(0x6c, float:1.51E-43)
            r10.requestWindowFeature(r1)
        L2b:
            int r1 = androidx.appcompat.R.styleable.AppCompatTheme_windowActionBarOverlay
            boolean r1 = r0.getBoolean(r1, r2)
            r4 = 109(0x6d, float:1.53E-43)
            if (r1 == 0) goto L38
            r10.requestWindowFeature(r4)
        L38:
            int r1 = androidx.appcompat.R.styleable.AppCompatTheme_windowActionModeOverlay
            boolean r1 = r0.getBoolean(r1, r2)
            if (r1 == 0) goto L45
            r1 = 10
            r10.requestWindowFeature(r1)
        L45:
            int r1 = androidx.appcompat.R.styleable.AppCompatTheme_android_windowIsFloating
            boolean r1 = r0.getBoolean(r1, r2)
            r10.mIsFloating = r1
            r0.recycle()
            r10.ensureWindow()
            android.view.Window r1 = r10.mWindow
            r1.getDecorView()
            android.content.Context r1 = r10.mContext
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r1)
            r5 = 0
            boolean r6 = r10.mWindowNoTitle
            r7 = 0
            if (r6 != 0) goto Ld9
            boolean r6 = r10.mIsFloating
            if (r6 == 0) goto L77
            int r3 = androidx.appcompat.R.layout.abc_dialog_title_material
            android.view.View r3 = r1.inflate(r3, r7)
            r5 = r3
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            r10.mOverlayActionBar = r2
            r10.mHasActionBar = r2
            goto Lf0
        L77:
            boolean r6 = r10.mHasActionBar
            if (r6 == 0) goto Lf0
            android.util.TypedValue r6 = new android.util.TypedValue
            r6.<init>()
            android.content.Context r8 = r10.mContext
            android.content.res.Resources$Theme r8 = r8.getTheme()
            int r9 = androidx.appcompat.R.attr.actionBarTheme
            r8.resolveAttribute(r9, r6, r3)
            int r3 = r6.resourceId
            if (r3 == 0) goto L99
            androidx.appcompat.view.ContextThemeWrapper r3 = new androidx.appcompat.view.ContextThemeWrapper
            android.content.Context r8 = r10.mContext
            int r9 = r6.resourceId
            r3.<init>(r8, r9)
            goto L9b
        L99:
            android.content.Context r3 = r10.mContext
        L9b:
            android.view.LayoutInflater r8 = android.view.LayoutInflater.from(r3)
            int r9 = androidx.appcompat.R.layout.abc_screen_toolbar
            android.view.View r8 = r8.inflate(r9, r7)
            r5 = r8
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            int r8 = androidx.appcompat.R.id.decor_content_parent
            android.view.View r8 = r5.findViewById(r8)
            androidx.appcompat.widget.DecorContentParent r8 = (androidx.appcompat.widget.DecorContentParent) r8
            r10.mDecorContentParent = r8
            androidx.appcompat.widget.DecorContentParent r8 = r10.mDecorContentParent
            android.view.Window$Callback r9 = r10.getWindowCallback()
            r8.setWindowCallback(r9)
            boolean r8 = r10.mOverlayActionBar
            if (r8 == 0) goto Lc4
            androidx.appcompat.widget.DecorContentParent r8 = r10.mDecorContentParent
            r8.initFeature(r4)
        Lc4:
            boolean r4 = r10.mFeatureProgress
            if (r4 == 0) goto Lce
            androidx.appcompat.widget.DecorContentParent r4 = r10.mDecorContentParent
            r8 = 2
            r4.initFeature(r8)
        Lce:
            boolean r4 = r10.mFeatureIndeterminateProgress
            if (r4 == 0) goto Ld8
            androidx.appcompat.widget.DecorContentParent r4 = r10.mDecorContentParent
            r8 = 5
            r4.initFeature(r8)
        Ld8:
            goto Lf0
        Ld9:
            boolean r3 = r10.mOverlayActionMode
            if (r3 == 0) goto Le7
            int r3 = androidx.appcompat.R.layout.abc_screen_simple_overlay_action_mode
            android.view.View r3 = r1.inflate(r3, r7)
            r5 = r3
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            goto Lf0
        Le7:
            int r3 = androidx.appcompat.R.layout.abc_screen_simple
            android.view.View r3 = r1.inflate(r3, r7)
            r5 = r3
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
        Lf0:
            if (r5 == 0) goto L151
        Lf3:
            androidx.appcompat.app.AppCompatDelegateImpl$3 r3 = new androidx.appcompat.app.AppCompatDelegateImpl$3
            r3.<init>(r10)
            androidx.core.view.ViewCompat.setOnApplyWindowInsetsListener(r5, r3)
            androidx.appcompat.widget.DecorContentParent r3 = r10.mDecorContentParent
            if (r3 != 0) goto L109
            int r3 = androidx.appcompat.R.id.title
            android.view.View r3 = r5.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r10.mTitleView = r3
        L109:
            androidx.appcompat.widget.ViewUtils.makeOptionalFitsSystemWindows(r5)
            int r3 = androidx.appcompat.R.id.action_bar_activity_content
            android.view.View r3 = r5.findViewById(r3)
            androidx.appcompat.widget.ContentFrameLayout r3 = (androidx.appcompat.widget.ContentFrameLayout) r3
            android.view.Window r4 = r10.mWindow
            r6 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r4 = r4.findViewById(r6)
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            if (r4 == 0) goto L143
        L121:
            int r8 = r4.getChildCount()
            if (r8 <= 0) goto L132
            android.view.View r8 = r4.getChildAt(r2)
            r4.removeViewAt(r2)
            r3.addView(r8)
            goto L121
        L132:
            r2 = -1
            r4.setId(r2)
            r3.setId(r6)
            boolean r2 = r4 instanceof android.widget.FrameLayout
            if (r2 == 0) goto L143
            r2 = r4
            android.widget.FrameLayout r2 = (android.widget.FrameLayout) r2
            r2.setForeground(r7)
        L143:
            android.view.Window r2 = r10.mWindow
            r2.setContentView(r5)
            androidx.appcompat.app.AppCompatDelegateImpl$5 r2 = new androidx.appcompat.app.AppCompatDelegateImpl$5
            r2.<init>(r10)
            r3.setAttachListener(r2)
            return r5
        L151:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "AppCompat does not support the current theme features: { windowActionBar: "
            java.lang.StringBuilder r3 = r3.append(r4)
            boolean r4 = r10.mHasActionBar
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r4 = ", windowActionBarOverlay: "
            java.lang.StringBuilder r3 = r3.append(r4)
            boolean r4 = r10.mOverlayActionBar
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r4 = ", android:windowIsFloating: "
            java.lang.StringBuilder r3 = r3.append(r4)
            boolean r4 = r10.mIsFloating
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r4 = ", windowActionModeOverlay: "
            java.lang.StringBuilder r3 = r3.append(r4)
            boolean r4 = r10.mOverlayActionMode
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r4 = ", windowNoTitle: "
            java.lang.StringBuilder r3 = r3.append(r4)
            boolean r4 = r10.mWindowNoTitle
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r4 = " }"
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
        L1a2:
            r0.recycle()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "You need to use a Theme.AppCompat theme (or descendant) with this activity."
            r1.<init>(r2)
            throw r1
    }

    private void ensureSubDecor() {
            r3 = this;
            boolean r0 = r3.mSubDecorInstalled
            if (r0 != 0) goto L54
            android.view.ViewGroup r0 = r3.createSubDecor()
            r3.mSubDecor = r0
            java.lang.CharSequence r0 = r3.getTitle()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L35
            androidx.appcompat.widget.DecorContentParent r1 = r3.mDecorContentParent
            if (r1 == 0) goto L1e
            androidx.appcompat.widget.DecorContentParent r1 = r3.mDecorContentParent
            r1.setWindowTitle(r0)
            goto L35
        L1e:
            androidx.appcompat.app.ActionBar r1 = r3.peekSupportActionBar()
            if (r1 == 0) goto L2c
            androidx.appcompat.app.ActionBar r1 = r3.peekSupportActionBar()
            r1.setWindowTitle(r0)
            goto L35
        L2c:
            android.widget.TextView r1 = r3.mTitleView
            if (r1 == 0) goto L35
            android.widget.TextView r1 = r3.mTitleView
            r1.setText(r0)
        L35:
            r3.applyFixedSizeWindow()
            android.view.ViewGroup r1 = r3.mSubDecor
            r3.onSubDecorInstalled(r1)
            r1 = 1
            r3.mSubDecorInstalled = r1
            r1 = 0
            androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState r1 = r3.getPanelState(r1, r1)
            boolean r2 = r3.mDestroyed
            if (r2 != 0) goto L54
            if (r1 == 0) goto L4f
            androidx.appcompat.view.menu.MenuBuilder r2 = r1.menu
            if (r2 != 0) goto L54
        L4f:
            r2 = 108(0x6c, float:1.51E-43)
            r3.invalidatePanelMenu(r2)
        L54:
            return
    }

    private void ensureWindow() {
            r2 = this;
            android.view.Window r0 = r2.mWindow
            if (r0 != 0) goto L15
            java.lang.Object r0 = r2.mHost
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L15
            java.lang.Object r0 = r2.mHost
            android.app.Activity r0 = (android.app.Activity) r0
            android.view.Window r0 = r0.getWindow()
            r2.attachToWindow(r0)
        L15:
            android.view.Window r0 = r2.mWindow
            if (r0 == 0) goto L1a
            return
        L1a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "We have not been given a Window"
            r0.<init>(r1)
            throw r0
    }

    private static android.content.res.Configuration generateConfigDelta(android.content.res.Configuration r3, android.content.res.Configuration r4) {
            android.content.res.Configuration r0 = new android.content.res.Configuration
            r0.<init>()
            r1 = 0
            r0.fontScale = r1
            if (r4 == 0) goto L116
            int r1 = r3.diff(r4)
            if (r1 != 0) goto L12
            goto L116
        L12:
            float r1 = r3.fontScale
            float r2 = r4.fontScale
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 == 0) goto L1e
            float r1 = r4.fontScale
            r0.fontScale = r1
        L1e:
            int r1 = r3.mcc
            int r2 = r4.mcc
            if (r1 == r2) goto L28
            int r1 = r4.mcc
            r0.mcc = r1
        L28:
            int r1 = r3.mnc
            int r2 = r4.mnc
            if (r1 == r2) goto L32
            int r1 = r4.mnc
            r0.mnc = r1
        L32:
            androidx.appcompat.app.AppCompatDelegateImpl.Api24Impl.generateConfigDelta_locale(r3, r4, r0)
            int r1 = r3.touchscreen
            int r2 = r4.touchscreen
            if (r1 == r2) goto L40
            int r1 = r4.touchscreen
            r0.touchscreen = r1
        L40:
            int r1 = r3.keyboard
            int r2 = r4.keyboard
            if (r1 == r2) goto L4a
            int r1 = r4.keyboard
            r0.keyboard = r1
        L4a:
            int r1 = r3.keyboardHidden
            int r2 = r4.keyboardHidden
            if (r1 == r2) goto L54
            int r1 = r4.keyboardHidden
            r0.keyboardHidden = r1
        L54:
            int r1 = r3.navigation
            int r2 = r4.navigation
            if (r1 == r2) goto L5e
            int r1 = r4.navigation
            r0.navigation = r1
        L5e:
            int r1 = r3.navigationHidden
            int r2 = r4.navigationHidden
            if (r1 == r2) goto L68
            int r1 = r4.navigationHidden
            r0.navigationHidden = r1
        L68:
            int r1 = r3.orientation
            int r2 = r4.orientation
            if (r1 == r2) goto L72
            int r1 = r4.orientation
            r0.orientation = r1
        L72:
            int r1 = r3.screenLayout
            r1 = r1 & 15
            int r2 = r4.screenLayout
            r2 = r2 & 15
            if (r1 == r2) goto L85
            int r1 = r0.screenLayout
            int r2 = r4.screenLayout
            r2 = r2 & 15
            r1 = r1 | r2
            r0.screenLayout = r1
        L85:
            int r1 = r3.screenLayout
            r1 = r1 & 192(0xc0, float:2.69E-43)
            int r2 = r4.screenLayout
            r2 = r2 & 192(0xc0, float:2.69E-43)
            if (r1 == r2) goto L98
            int r1 = r0.screenLayout
            int r2 = r4.screenLayout
            r2 = r2 & 192(0xc0, float:2.69E-43)
            r1 = r1 | r2
            r0.screenLayout = r1
        L98:
            int r1 = r3.screenLayout
            r1 = r1 & 48
            int r2 = r4.screenLayout
            r2 = r2 & 48
            if (r1 == r2) goto Lab
            int r1 = r0.screenLayout
            int r2 = r4.screenLayout
            r2 = r2 & 48
            r1 = r1 | r2
            r0.screenLayout = r1
        Lab:
            int r1 = r3.screenLayout
            r1 = r1 & 768(0x300, float:1.076E-42)
            int r2 = r4.screenLayout
            r2 = r2 & 768(0x300, float:1.076E-42)
            if (r1 == r2) goto Lbe
            int r1 = r0.screenLayout
            int r2 = r4.screenLayout
            r2 = r2 & 768(0x300, float:1.076E-42)
            r1 = r1 | r2
            r0.screenLayout = r1
        Lbe:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 26
            if (r1 < r2) goto Lc7
            androidx.appcompat.app.AppCompatDelegateImpl.Api26Impl.generateConfigDelta_colorMode(r3, r4, r0)
        Lc7:
            int r1 = r3.uiMode
            r1 = r1 & 15
            int r2 = r4.uiMode
            r2 = r2 & 15
            if (r1 == r2) goto Lda
            int r1 = r0.uiMode
            int r2 = r4.uiMode
            r2 = r2 & 15
            r1 = r1 | r2
            r0.uiMode = r1
        Lda:
            int r1 = r3.uiMode
            r1 = r1 & 48
            int r2 = r4.uiMode
            r2 = r2 & 48
            if (r1 == r2) goto Led
            int r1 = r0.uiMode
            int r2 = r4.uiMode
            r2 = r2 & 48
            r1 = r1 | r2
            r0.uiMode = r1
        Led:
            int r1 = r3.screenWidthDp
            int r2 = r4.screenWidthDp
            if (r1 == r2) goto Lf7
            int r1 = r4.screenWidthDp
            r0.screenWidthDp = r1
        Lf7:
            int r1 = r3.screenHeightDp
            int r2 = r4.screenHeightDp
            if (r1 == r2) goto L101
            int r1 = r4.screenHeightDp
            r0.screenHeightDp = r1
        L101:
            int r1 = r3.smallestScreenWidthDp
            int r2 = r4.smallestScreenWidthDp
            if (r1 == r2) goto L10b
            int r1 = r4.smallestScreenWidthDp
            r0.smallestScreenWidthDp = r1
        L10b:
            int r1 = r3.densityDpi
            int r2 = r4.densityDpi
            if (r1 == r2) goto L115
            int r1 = r4.densityDpi
            r0.densityDpi = r1
        L115:
            return r0
        L116:
            return r0
    }

    private int getActivityHandlesConfigChangesFlags(android.content.Context r6) {
            r5 = this;
            boolean r0 = r5.mActivityHandlesConfigFlagsChecked
            if (r0 != 0) goto L3f
            java.lang.Object r0 = r5.mHost
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L3f
            android.content.pm.PackageManager r0 = r6.getPackageManager()
            r1 = 0
            if (r0 != 0) goto L12
            return r1
        L12:
            r2 = 0
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L35
            r4 = 29
            if (r3 < r4) goto L1c
            r2 = 269221888(0x100c0000, float:2.7610132E-29)
            goto L1f
        L1c:
            r2 = 786432(0xc0000, float:1.102026E-39)
        L1f:
            android.content.ComponentName r3 = new android.content.ComponentName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L35
            java.lang.Object r4 = r5.mHost     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L35
            java.lang.Class r4 = r4.getClass()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L35
            r3.<init>(r6, r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L35
            android.content.pm.ActivityInfo r3 = r0.getActivityInfo(r3, r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L35
            if (r3 == 0) goto L34
            int r4 = r3.configChanges     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L35
            r5.mActivityHandlesConfigFlags = r4     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L35
        L34:
            goto L3f
        L35:
            r2 = move-exception
            java.lang.String r3 = "AppCompatDelegate"
            java.lang.String r4 = "Exception while getting ActivityInfo"
            android.util.Log.d(r3, r4, r2)
            r5.mActivityHandlesConfigFlags = r1
        L3f:
            r0 = 1
            r5.mActivityHandlesConfigFlagsChecked = r0
            int r0 = r5.mActivityHandlesConfigFlags
            return r0
    }

    private androidx.appcompat.app.AppCompatDelegateImpl.AutoNightModeManager getAutoBatteryNightModeManager(android.content.Context r2) {
            r1 = this;
            androidx.appcompat.app.AppCompatDelegateImpl$AutoNightModeManager r0 = r1.mAutoBatteryNightModeManager
            if (r0 != 0) goto Lb
            androidx.appcompat.app.AppCompatDelegateImpl$AutoBatteryNightModeManager r0 = new androidx.appcompat.app.AppCompatDelegateImpl$AutoBatteryNightModeManager
            r0.<init>(r1, r2)
            r1.mAutoBatteryNightModeManager = r0
        Lb:
            androidx.appcompat.app.AppCompatDelegateImpl$AutoNightModeManager r0 = r1.mAutoBatteryNightModeManager
            return r0
    }

    private androidx.appcompat.app.AppCompatDelegateImpl.AutoNightModeManager getAutoTimeNightModeManager(android.content.Context r3) {
            r2 = this;
            androidx.appcompat.app.AppCompatDelegateImpl$AutoNightModeManager r0 = r2.mAutoTimeNightModeManager
            if (r0 != 0) goto Lf
            androidx.appcompat.app.AppCompatDelegateImpl$AutoTimeNightModeManager r0 = new androidx.appcompat.app.AppCompatDelegateImpl$AutoTimeNightModeManager
            androidx.appcompat.app.TwilightManager r1 = androidx.appcompat.app.TwilightManager.getInstance(r3)
            r0.<init>(r2, r1)
            r2.mAutoTimeNightModeManager = r0
        Lf:
            androidx.appcompat.app.AppCompatDelegateImpl$AutoNightModeManager r0 = r2.mAutoTimeNightModeManager
            return r0
    }

    private void initWindowDecorActionBar() {
            r3 = this;
            r3.ensureSubDecor()
            boolean r0 = r3.mHasActionBar
            if (r0 == 0) goto L3d
            androidx.appcompat.app.ActionBar r0 = r3.mActionBar
            if (r0 == 0) goto Lc
            goto L3d
        Lc:
            java.lang.Object r0 = r3.mHost
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L20
            androidx.appcompat.app.WindowDecorActionBar r0 = new androidx.appcompat.app.WindowDecorActionBar
            java.lang.Object r1 = r3.mHost
            android.app.Activity r1 = (android.app.Activity) r1
            boolean r2 = r3.mOverlayActionBar
            r0.<init>(r1, r2)
            r3.mActionBar = r0
            goto L31
        L20:
            java.lang.Object r0 = r3.mHost
            boolean r0 = r0 instanceof android.app.Dialog
            if (r0 == 0) goto L31
            androidx.appcompat.app.WindowDecorActionBar r0 = new androidx.appcompat.app.WindowDecorActionBar
            java.lang.Object r1 = r3.mHost
            android.app.Dialog r1 = (android.app.Dialog) r1
            r0.<init>(r1)
            r3.mActionBar = r0
        L31:
            androidx.appcompat.app.ActionBar r0 = r3.mActionBar
            if (r0 == 0) goto L3c
            androidx.appcompat.app.ActionBar r0 = r3.mActionBar
            boolean r1 = r3.mEnableDefaultActionBarUp
            r0.setDefaultDisplayHomeAsUpEnabled(r1)
        L3c:
            return
        L3d:
            return
    }

    private boolean initializePanelContent(androidx.appcompat.app.AppCompatDelegateImpl.PanelFeatureState r5) {
            r4 = this;
            android.view.View r0 = r5.createdPanelView
            r1 = 1
            if (r0 == 0) goto La
            android.view.View r0 = r5.createdPanelView
            r5.shownPanelView = r0
            return r1
        La:
            androidx.appcompat.view.menu.MenuBuilder r0 = r5.menu
            r2 = 0
            if (r0 != 0) goto L10
            return r2
        L10:
            androidx.appcompat.app.AppCompatDelegateImpl$PanelMenuPresenterCallback r0 = r4.mPanelMenuPresenterCallback
            if (r0 != 0) goto L1b
            androidx.appcompat.app.AppCompatDelegateImpl$PanelMenuPresenterCallback r0 = new androidx.appcompat.app.AppCompatDelegateImpl$PanelMenuPresenterCallback
            r0.<init>(r4)
            r4.mPanelMenuPresenterCallback = r0
        L1b:
            androidx.appcompat.app.AppCompatDelegateImpl$PanelMenuPresenterCallback r0 = r4.mPanelMenuPresenterCallback
            androidx.appcompat.view.menu.MenuView r0 = r5.getListMenuView(r0)
            r3 = r0
            android.view.View r3 = (android.view.View) r3
            r5.shownPanelView = r3
            android.view.View r3 = r5.shownPanelView
            if (r3 == 0) goto L2b
            goto L2c
        L2b:
            r1 = r2
        L2c:
            return r1
    }

    private boolean initializePanelDecor(androidx.appcompat.app.AppCompatDelegateImpl.PanelFeatureState r3) {
            r2 = this;
            android.content.Context r0 = r2.getActionBarThemedContext()
            r3.setStyle(r0)
            androidx.appcompat.app.AppCompatDelegateImpl$ListMenuDecorView r0 = new androidx.appcompat.app.AppCompatDelegateImpl$ListMenuDecorView
            android.content.Context r1 = r3.listPresenterContext
            r0.<init>(r2, r1)
            r3.decorView = r0
            r0 = 81
            r3.gravity = r0
            r0 = 1
            return r0
    }

    private boolean initializePanelMenu(androidx.appcompat.app.AppCompatDelegateImpl.PanelFeatureState r8) {
            r7 = this;
            android.content.Context r0 = r7.mContext
            int r1 = r8.featureId
            r2 = 1
            if (r1 == 0) goto Ld
            int r1 = r8.featureId
            r3 = 108(0x6c, float:1.51E-43)
            if (r1 != r3) goto L65
        Ld:
            androidx.appcompat.widget.DecorContentParent r1 = r7.mDecorContentParent
            if (r1 == 0) goto L65
            android.util.TypedValue r1 = new android.util.TypedValue
            r1.<init>()
            android.content.res.Resources$Theme r3 = r0.getTheme()
            int r4 = androidx.appcompat.R.attr.actionBarTheme
            r3.resolveAttribute(r4, r1, r2)
            r4 = 0
            int r5 = r1.resourceId
            if (r5 == 0) goto L3a
            android.content.res.Resources r5 = r0.getResources()
            android.content.res.Resources$Theme r4 = r5.newTheme()
            r4.setTo(r3)
            int r5 = r1.resourceId
            r4.applyStyle(r5, r2)
            int r5 = androidx.appcompat.R.attr.actionBarWidgetTheme
            r4.resolveAttribute(r5, r1, r2)
            goto L3f
        L3a:
            int r5 = androidx.appcompat.R.attr.actionBarWidgetTheme
            r3.resolveAttribute(r5, r1, r2)
        L3f:
            int r5 = r1.resourceId
            if (r5 == 0) goto L55
            if (r4 != 0) goto L50
            android.content.res.Resources r5 = r0.getResources()
            android.content.res.Resources$Theme r4 = r5.newTheme()
            r4.setTo(r3)
        L50:
            int r5 = r1.resourceId
            r4.applyStyle(r5, r2)
        L55:
            if (r4 == 0) goto L65
            androidx.appcompat.view.ContextThemeWrapper r5 = new androidx.appcompat.view.ContextThemeWrapper
            r6 = 0
            r5.<init>(r0, r6)
            r0 = r5
            android.content.res.Resources$Theme r5 = r0.getTheme()
            r5.setTo(r4)
        L65:
            androidx.appcompat.view.menu.MenuBuilder r1 = new androidx.appcompat.view.menu.MenuBuilder
            r1.<init>(r0)
            r1.setCallback(r7)
            r8.setMenu(r1)
            return r2
    }

    private void invalidatePanelMenu(int r4) {
            r3 = this;
            int r0 = r3.mInvalidatePanelMenuFeatures
            r1 = 1
            int r2 = r1 << r4
            r0 = r0 | r2
            r3.mInvalidatePanelMenuFeatures = r0
            boolean r0 = r3.mInvalidatePanelMenuPosted
            if (r0 != 0) goto L19
            android.view.Window r0 = r3.mWindow
            android.view.View r0 = r0.getDecorView()
            java.lang.Runnable r2 = r3.mInvalidatePanelMenuRunnable
            androidx.core.view.ViewCompat.postOnAnimation(r0, r2)
            r3.mInvalidatePanelMenuPosted = r1
        L19:
            return
    }

    private boolean onKeyDownPanel(int r3, android.view.KeyEvent r4) {
            r2 = this;
            int r0 = r4.getRepeatCount()
            if (r0 != 0) goto L14
            r0 = 1
            androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState r0 = r2.getPanelState(r3, r0)
            boolean r1 = r0.isOpen
            if (r1 != 0) goto L14
            boolean r1 = r2.preparePanel(r0, r4)
            return r1
        L14:
            r0 = 0
            return r0
    }

    private boolean onKeyUpPanel(int r6, android.view.KeyEvent r7) {
            r5 = this;
            androidx.appcompat.view.ActionMode r0 = r5.mActionMode
            r1 = 0
            if (r0 == 0) goto L6
            return r1
        L6:
            r0 = 0
            r2 = 1
            androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState r3 = r5.getPanelState(r6, r2)
            if (r6 != 0) goto L46
            androidx.appcompat.widget.DecorContentParent r4 = r5.mDecorContentParent
            if (r4 == 0) goto L46
            androidx.appcompat.widget.DecorContentParent r4 = r5.mDecorContentParent
            boolean r4 = r4.canShowOverflowMenu()
            if (r4 == 0) goto L46
            android.content.Context r4 = r5.mContext
            android.view.ViewConfiguration r4 = android.view.ViewConfiguration.get(r4)
            boolean r4 = r4.hasPermanentMenuKey()
            if (r4 != 0) goto L46
            androidx.appcompat.widget.DecorContentParent r2 = r5.mDecorContentParent
            boolean r2 = r2.isOverflowMenuShowing()
            if (r2 != 0) goto L3f
            boolean r2 = r5.mDestroyed
            if (r2 != 0) goto L6a
            boolean r2 = r5.preparePanel(r3, r7)
            if (r2 == 0) goto L6a
            androidx.appcompat.widget.DecorContentParent r2 = r5.mDecorContentParent
            boolean r0 = r2.showOverflowMenu()
            goto L6a
        L3f:
            androidx.appcompat.widget.DecorContentParent r2 = r5.mDecorContentParent
            boolean r0 = r2.hideOverflowMenu()
            goto L6a
        L46:
            boolean r4 = r3.isOpen
            if (r4 != 0) goto L65
            boolean r4 = r3.isHandled
            if (r4 == 0) goto L4f
            goto L65
        L4f:
            boolean r2 = r3.isPrepared
            if (r2 == 0) goto L6a
            r2 = 1
            boolean r4 = r3.refreshMenuContent
            if (r4 == 0) goto L5e
            r3.isPrepared = r1
            boolean r2 = r5.preparePanel(r3, r7)
        L5e:
            if (r2 == 0) goto L6a
            r5.openPanel(r3, r7)
            r0 = 1
            goto L6a
        L65:
            boolean r0 = r3.isOpen
            r5.closePanel(r3, r2)
        L6a:
            if (r0 == 0) goto L87
            android.content.Context r2 = r5.mContext
            android.content.Context r2 = r2.getApplicationContext()
            java.lang.String r4 = "audio"
            java.lang.Object r2 = r2.getSystemService(r4)
            android.media.AudioManager r2 = (android.media.AudioManager) r2
            if (r2 == 0) goto L80
            r2.playSoundEffect(r1)
            goto L87
        L80:
            java.lang.String r1 = "AppCompatDelegate"
            java.lang.String r4 = "Couldn't get audio manager"
            android.util.Log.w(r1, r4)
        L87:
            return r0
    }

    private void openPanel(androidx.appcompat.app.AppCompatDelegateImpl.PanelFeatureState r20, android.view.KeyEvent r21) {
            r19 = this;
            r0 = r19
            r1 = r20
            boolean r2 = r1.isOpen
            if (r2 != 0) goto L10a
            boolean r2 = r0.mDestroyed
            if (r2 == 0) goto Le
            goto L10a
        Le:
            int r2 = r1.featureId
            r3 = 0
            r4 = 1
            if (r2 != 0) goto L2b
            android.content.Context r2 = r0.mContext
            android.content.res.Resources r2 = r2.getResources()
            android.content.res.Configuration r2 = r2.getConfiguration()
            int r5 = r2.screenLayout
            r5 = r5 & 15
            r6 = 4
            if (r5 != r6) goto L27
            r5 = r4
            goto L28
        L27:
            r5 = r3
        L28:
            if (r5 == 0) goto L2b
            return
        L2b:
            android.view.Window$Callback r2 = r0.getWindowCallback()
            if (r2 == 0) goto L3f
            int r5 = r1.featureId
            androidx.appcompat.view.menu.MenuBuilder r6 = r1.menu
            boolean r5 = r2.onMenuOpened(r5, r6)
            if (r5 != 0) goto L3f
            r0.closePanel(r1, r4)
            return
        L3f:
            android.content.Context r5 = r0.mContext
            java.lang.String r6 = "window"
            java.lang.Object r5 = r5.getSystemService(r6)
            android.view.WindowManager r5 = (android.view.WindowManager) r5
            if (r5 != 0) goto L4c
            return
        L4c:
            boolean r6 = r19.preparePanel(r20, r21)
            if (r6 != 0) goto L53
            return
        L53:
            r6 = -2
            android.view.ViewGroup r7 = r1.decorView
            if (r7 == 0) goto L73
            boolean r7 = r1.refreshDecorView
            if (r7 == 0) goto L5d
            goto L73
        L5d:
            android.view.View r7 = r1.createdPanelView
            if (r7 == 0) goto L72
            android.view.View r7 = r1.createdPanelView
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            if (r7 == 0) goto Ldd
            int r8 = r7.width
            r9 = -1
            if (r8 != r9) goto Ldd
            r6 = -1
            r12 = r6
            goto Lde
        L72:
            goto Ldd
        L73:
            android.view.ViewGroup r7 = r1.decorView
            if (r7 != 0) goto L82
            boolean r7 = r19.initializePanelDecor(r20)
            if (r7 == 0) goto L81
            android.view.ViewGroup r7 = r1.decorView
            if (r7 != 0) goto L93
        L81:
            return
        L82:
            boolean r7 = r1.refreshDecorView
            if (r7 == 0) goto L93
            android.view.ViewGroup r7 = r1.decorView
            int r7 = r7.getChildCount()
            if (r7 <= 0) goto L93
            android.view.ViewGroup r7 = r1.decorView
            r7.removeAllViews()
        L93:
            boolean r7 = r19.initializePanelContent(r20)
            if (r7 == 0) goto L107
            boolean r7 = r1.hasPanelItems()
            if (r7 != 0) goto La0
            goto L107
        La0:
            android.view.View r7 = r1.shownPanelView
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            if (r7 != 0) goto Laf
            android.view.ViewGroup$LayoutParams r8 = new android.view.ViewGroup$LayoutParams
            r9 = -2
            r8.<init>(r9, r9)
            r7 = r8
        Laf:
            int r8 = r1.background
            android.view.ViewGroup r9 = r1.decorView
            r9.setBackgroundResource(r8)
            android.view.View r9 = r1.shownPanelView
            android.view.ViewParent r9 = r9.getParent()
            boolean r10 = r9 instanceof android.view.ViewGroup
            if (r10 == 0) goto Lc8
            r10 = r9
            android.view.ViewGroup r10 = (android.view.ViewGroup) r10
            android.view.View r11 = r1.shownPanelView
            r10.removeView(r11)
        Lc8:
            android.view.ViewGroup r10 = r1.decorView
            android.view.View r11 = r1.shownPanelView
            r10.addView(r11, r7)
            android.view.View r10 = r1.shownPanelView
            boolean r10 = r10.hasFocus()
            if (r10 != 0) goto L72
            android.view.View r10 = r1.shownPanelView
            r10.requestFocus()
            goto L72
        Ldd:
            r12 = r6
        Lde:
            r1.isHandled = r3
            android.view.WindowManager$LayoutParams r11 = new android.view.WindowManager$LayoutParams
            int r14 = r1.x
            int r15 = r1.y
            r17 = 8519680(0x820000, float:1.1938615E-38)
            r18 = -3
            r13 = -2
            r16 = 1002(0x3ea, float:1.404E-42)
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)
            int r3 = r1.gravity
            r11.gravity = r3
            int r3 = r1.windowAnimations
            r11.windowAnimations = r3
            android.view.ViewGroup r3 = r1.decorView
            r5.addView(r3, r11)
            r1.isOpen = r4
            int r3 = r1.featureId
            if (r3 != 0) goto L106
            r0.updateBackInvokedCallbackState()
        L106:
            return
        L107:
            r1.refreshDecorView = r4
            return
        L10a:
            return
    }

    private boolean performPanelShortcut(androidx.appcompat.app.AppCompatDelegateImpl.PanelFeatureState r3, int r4, android.view.KeyEvent r5, int r6) {
            r2 = this;
            boolean r0 = r5.isSystem()
            if (r0 == 0) goto L8
            r0 = 0
            return r0
        L8:
            r0 = 0
            boolean r1 = r3.isPrepared
            if (r1 != 0) goto L13
            boolean r1 = r2.preparePanel(r3, r5)
            if (r1 == 0) goto L1d
        L13:
            androidx.appcompat.view.menu.MenuBuilder r1 = r3.menu
            if (r1 == 0) goto L1d
            androidx.appcompat.view.menu.MenuBuilder r1 = r3.menu
            boolean r0 = r1.performShortcut(r4, r5, r6)
        L1d:
            if (r0 == 0) goto L2b
            r1 = r6 & 1
            if (r1 != 0) goto L2b
            androidx.appcompat.widget.DecorContentParent r1 = r2.mDecorContentParent
            if (r1 != 0) goto L2b
            r1 = 1
            r2.closePanel(r3, r1)
        L2b:
            return r0
    }

    private boolean preparePanel(androidx.appcompat.app.AppCompatDelegateImpl.PanelFeatureState r9, android.view.KeyEvent r10) {
            r8 = this;
            boolean r0 = r8.mDestroyed
            r1 = 0
            if (r0 == 0) goto L6
            return r1
        L6:
            boolean r0 = r9.isPrepared
            r2 = 1
            if (r0 == 0) goto Lc
            return r2
        Lc:
            androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState r0 = r8.mPreparedPanel
            if (r0 == 0) goto L19
            androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState r0 = r8.mPreparedPanel
            if (r0 == r9) goto L19
            androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState r0 = r8.mPreparedPanel
            r8.closePanel(r0, r1)
        L19:
            android.view.Window$Callback r0 = r8.getWindowCallback()
            if (r0 == 0) goto L27
            int r3 = r9.featureId
            android.view.View r3 = r0.onCreatePanelView(r3)
            r9.createdPanelView = r3
        L27:
            int r3 = r9.featureId
            if (r3 == 0) goto L34
            int r3 = r9.featureId
            r4 = 108(0x6c, float:1.51E-43)
            if (r3 != r4) goto L32
            goto L34
        L32:
            r3 = r1
            goto L35
        L34:
            r3 = r2
        L35:
            if (r3 == 0) goto L40
            androidx.appcompat.widget.DecorContentParent r4 = r8.mDecorContentParent
            if (r4 == 0) goto L40
            androidx.appcompat.widget.DecorContentParent r4 = r8.mDecorContentParent
            r4.setMenuPrepared()
        L40:
            android.view.View r4 = r9.createdPanelView
            if (r4 != 0) goto Lf4
            if (r3 == 0) goto L4e
            androidx.appcompat.app.ActionBar r4 = r8.peekSupportActionBar()
            boolean r4 = r4 instanceof androidx.appcompat.app.ToolbarActionBar
            if (r4 != 0) goto Lf4
        L4e:
            androidx.appcompat.view.menu.MenuBuilder r4 = r9.menu
            r5 = 0
            if (r4 == 0) goto L57
            boolean r4 = r9.refreshMenuContent
            if (r4 == 0) goto La2
        L57:
            androidx.appcompat.view.menu.MenuBuilder r4 = r9.menu
            if (r4 != 0) goto L66
            boolean r4 = r8.initializePanelMenu(r9)
            if (r4 == 0) goto L65
            androidx.appcompat.view.menu.MenuBuilder r4 = r9.menu
            if (r4 != 0) goto L66
        L65:
            return r1
        L66:
            if (r3 == 0) goto L80
            androidx.appcompat.widget.DecorContentParent r4 = r8.mDecorContentParent
            if (r4 == 0) goto L80
            androidx.appcompat.app.AppCompatDelegateImpl$ActionMenuPresenterCallback r4 = r8.mActionMenuPresenterCallback
            if (r4 != 0) goto L77
            androidx.appcompat.app.AppCompatDelegateImpl$ActionMenuPresenterCallback r4 = new androidx.appcompat.app.AppCompatDelegateImpl$ActionMenuPresenterCallback
            r4.<init>(r8)
            r8.mActionMenuPresenterCallback = r4
        L77:
            androidx.appcompat.widget.DecorContentParent r4 = r8.mDecorContentParent
            androidx.appcompat.view.menu.MenuBuilder r6 = r9.menu
            androidx.appcompat.app.AppCompatDelegateImpl$ActionMenuPresenterCallback r7 = r8.mActionMenuPresenterCallback
            r4.setMenu(r6, r7)
        L80:
            androidx.appcompat.view.menu.MenuBuilder r4 = r9.menu
            r4.stopDispatchingItemsChanged()
            int r4 = r9.featureId
            androidx.appcompat.view.menu.MenuBuilder r6 = r9.menu
            boolean r4 = r0.onCreatePanelMenu(r4, r6)
            if (r4 != 0) goto La0
            r9.setMenu(r5)
            if (r3 == 0) goto L9f
            androidx.appcompat.widget.DecorContentParent r2 = r8.mDecorContentParent
            if (r2 == 0) goto L9f
            androidx.appcompat.widget.DecorContentParent r2 = r8.mDecorContentParent
            androidx.appcompat.app.AppCompatDelegateImpl$ActionMenuPresenterCallback r4 = r8.mActionMenuPresenterCallback
            r2.setMenu(r5, r4)
        L9f:
            return r1
        La0:
            r9.refreshMenuContent = r1
        La2:
            androidx.appcompat.view.menu.MenuBuilder r4 = r9.menu
            r4.stopDispatchingItemsChanged()
            android.os.Bundle r4 = r9.frozenActionViewState
            if (r4 == 0) goto Lb4
            androidx.appcompat.view.menu.MenuBuilder r4 = r9.menu
            android.os.Bundle r6 = r9.frozenActionViewState
            r4.restoreActionViewStates(r6)
            r9.frozenActionViewState = r5
        Lb4:
            android.view.View r4 = r9.createdPanelView
            androidx.appcompat.view.menu.MenuBuilder r6 = r9.menu
            boolean r4 = r0.onPreparePanel(r1, r4, r6)
            if (r4 != 0) goto Ld1
            if (r3 == 0) goto Lcb
            androidx.appcompat.widget.DecorContentParent r2 = r8.mDecorContentParent
            if (r2 == 0) goto Lcb
            androidx.appcompat.widget.DecorContentParent r2 = r8.mDecorContentParent
            androidx.appcompat.app.AppCompatDelegateImpl$ActionMenuPresenterCallback r4 = r8.mActionMenuPresenterCallback
            r2.setMenu(r5, r4)
        Lcb:
            androidx.appcompat.view.menu.MenuBuilder r2 = r9.menu
            r2.startDispatchingItemsChanged()
            return r1
        Ld1:
            if (r10 == 0) goto Ld8
            int r4 = r10.getDeviceId()
            goto Ld9
        Ld8:
            r4 = -1
        Ld9:
            android.view.KeyCharacterMap r4 = android.view.KeyCharacterMap.load(r4)
            int r5 = r4.getKeyboardType()
            if (r5 == r2) goto Le5
            r5 = r2
            goto Le6
        Le5:
            r5 = r1
        Le6:
            r9.qwertyMode = r5
            androidx.appcompat.view.menu.MenuBuilder r5 = r9.menu
            boolean r6 = r9.qwertyMode
            r5.setQwertyMode(r6)
            androidx.appcompat.view.menu.MenuBuilder r5 = r9.menu
            r5.startDispatchingItemsChanged()
        Lf4:
            r9.isPrepared = r2
            r9.isHandled = r1
            r8.mPreparedPanel = r9
            return r2
    }

    private void reopenMenu(boolean r7) {
            r6 = this;
            androidx.appcompat.widget.DecorContentParent r0 = r6.mDecorContentParent
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L87
            androidx.appcompat.widget.DecorContentParent r0 = r6.mDecorContentParent
            boolean r0 = r0.canShowOverflowMenu()
            if (r0 == 0) goto L87
            android.content.Context r0 = r6.mContext
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r0)
            boolean r0 = r0.hasPermanentMenuKey()
            if (r0 == 0) goto L22
            androidx.appcompat.widget.DecorContentParent r0 = r6.mDecorContentParent
            boolean r0 = r0.isOverflowMenuShowPending()
            if (r0 == 0) goto L87
        L22:
            android.view.Window$Callback r0 = r6.getWindowCallback()
            androidx.appcompat.widget.DecorContentParent r3 = r6.mDecorContentParent
            boolean r3 = r3.isOverflowMenuShowing()
            r4 = 108(0x6c, float:1.51E-43)
            if (r3 == 0) goto L46
            if (r7 != 0) goto L33
            goto L46
        L33:
            androidx.appcompat.widget.DecorContentParent r3 = r6.mDecorContentParent
            r3.hideOverflowMenu()
            boolean r3 = r6.mDestroyed
            if (r3 != 0) goto L86
            androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState r1 = r6.getPanelState(r2, r1)
            androidx.appcompat.view.menu.MenuBuilder r2 = r1.menu
            r0.onPanelClosed(r4, r2)
            goto L86
        L46:
            if (r0 == 0) goto L86
            boolean r3 = r6.mDestroyed
            if (r3 != 0) goto L86
            boolean r3 = r6.mInvalidatePanelMenuPosted
            if (r3 == 0) goto L65
            int r3 = r6.mInvalidatePanelMenuFeatures
            r3 = r3 & r1
            if (r3 == 0) goto L65
            android.view.Window r3 = r6.mWindow
            android.view.View r3 = r3.getDecorView()
            java.lang.Runnable r5 = r6.mInvalidatePanelMenuRunnable
            r3.removeCallbacks(r5)
            java.lang.Runnable r3 = r6.mInvalidatePanelMenuRunnable
            r3.run()
        L65:
            androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState r1 = r6.getPanelState(r2, r1)
            androidx.appcompat.view.menu.MenuBuilder r3 = r1.menu
            if (r3 == 0) goto L85
            boolean r3 = r1.refreshMenuContent
            if (r3 != 0) goto L85
            android.view.View r3 = r1.createdPanelView
            androidx.appcompat.view.menu.MenuBuilder r5 = r1.menu
            boolean r2 = r0.onPreparePanel(r2, r3, r5)
            if (r2 == 0) goto L85
            androidx.appcompat.view.menu.MenuBuilder r2 = r1.menu
            r0.onMenuOpened(r4, r2)
            androidx.appcompat.widget.DecorContentParent r2 = r6.mDecorContentParent
            r2.showOverflowMenu()
        L85:
        L86:
            return
        L87:
            androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState r0 = r6.getPanelState(r2, r1)
            r0.refreshDecorView = r1
            r6.closePanel(r0, r2)
            r1 = 0
            r6.openPanel(r0, r1)
            return
    }

    private int sanitizeWindowFeatureId(int r3) {
            r2 = this;
            r0 = 8
            java.lang.String r1 = "AppCompatDelegate"
            if (r3 != r0) goto Le
            java.lang.String r0 = "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature."
            android.util.Log.i(r1, r0)
            r0 = 108(0x6c, float:1.51E-43)
            return r0
        Le:
            r0 = 9
            if (r3 != r0) goto L1a
            java.lang.String r0 = "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature."
            android.util.Log.i(r1, r0)
            r0 = 109(0x6d, float:1.53E-43)
            return r0
        L1a:
            return r3
    }

    private boolean shouldInheritContext(android.view.ViewParent r4) {
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            android.view.Window r1 = r3.mWindow
            android.view.View r1 = r1.getDecorView()
        La:
            if (r4 != 0) goto Le
            r0 = 1
            return r0
        Le:
            if (r4 == r1) goto L23
            boolean r2 = r4 instanceof android.view.View
            if (r2 == 0) goto L23
            r2 = r4
            android.view.View r2 = (android.view.View) r2
            boolean r2 = r2.isAttachedToWindow()
            if (r2 == 0) goto L1e
            goto L23
        L1e:
            android.view.ViewParent r4 = r4.getParent()
            goto La
        L23:
            return r0
    }

    private void throwFeatureRequestIfSubDecorInstalled() {
            r2 = this;
            boolean r0 = r2.mSubDecorInstalled
            if (r0 != 0) goto L5
            return
        L5:
            android.util.AndroidRuntimeException r0 = new android.util.AndroidRuntimeException
            java.lang.String r1 = "Window feature must be requested before adding content"
            r0.<init>(r1)
            throw r0
    }

    private androidx.appcompat.app.AppCompatActivity tryUnwrapContext() {
            r3 = this;
            android.content.Context r0 = r3.mContext
        L2:
            r1 = 0
            if (r0 == 0) goto L1a
            boolean r2 = r0 instanceof androidx.appcompat.app.AppCompatActivity
            if (r2 == 0) goto Ld
            r1 = r0
            androidx.appcompat.app.AppCompatActivity r1 = (androidx.appcompat.app.AppCompatActivity) r1
            return r1
        Ld:
            boolean r2 = r0 instanceof android.content.ContextWrapper
            if (r2 == 0) goto L19
            r1 = r0
            android.content.ContextWrapper r1 = (android.content.ContextWrapper) r1
            android.content.Context r0 = r1.getBaseContext()
            goto L2
        L19:
            return r1
        L1a:
            return r1
    }

    private void updateActivityConfiguration(android.content.res.Configuration r5) {
            r4 = this;
            java.lang.Object r0 = r4.mHost
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r1 = r0 instanceof androidx.lifecycle.LifecycleOwner
            if (r1 == 0) goto L1f
            r1 = r0
            androidx.lifecycle.LifecycleOwner r1 = (androidx.lifecycle.LifecycleOwner) r1
            androidx.lifecycle.Lifecycle r1 = r1.getLifecycle()
            androidx.lifecycle.Lifecycle$State r2 = r1.getCurrentState()
            androidx.lifecycle.Lifecycle$State r3 = androidx.lifecycle.Lifecycle.State.CREATED
            boolean r2 = r2.isAtLeast(r3)
            if (r2 == 0) goto L1e
            r0.onConfigurationChanged(r5)
        L1e:
            goto L2a
        L1f:
            boolean r1 = r4.mCreated
            if (r1 == 0) goto L2a
            boolean r1 = r4.mDestroyed
            if (r1 != 0) goto L2a
            r0.onConfigurationChanged(r5)
        L2a:
            return
    }

    private boolean updateAppConfiguration(int r13, androidx.core.os.LocaleListCompat r14, boolean r15) {
            r12 = this;
            r0 = 0
            android.content.Context r2 = r12.mContext
            r5 = 0
            r6 = 0
            r1 = r12
            r3 = r13
            r4 = r14
            android.content.res.Configuration r13 = r1.createOverrideAppConfiguration(r2, r3, r4, r5, r6)
            android.content.Context r14 = r1.mContext
            int r14 = r12.getActivityHandlesConfigChangesFlags(r14)
            android.content.res.Configuration r2 = r1.mEffectiveConfiguration
            if (r2 != 0) goto L21
            android.content.Context r2 = r1.mContext
            android.content.res.Resources r2 = r2.getResources()
            android.content.res.Configuration r2 = r2.getConfiguration()
            goto L23
        L21:
            android.content.res.Configuration r2 = r1.mEffectiveConfiguration
        L23:
            int r5 = r2.uiMode
            r5 = r5 & 48
            int r6 = r13.uiMode
            r6 = r6 & 48
            androidx.core.os.LocaleListCompat r7 = r12.getConfigurationLocales(r2)
            if (r4 != 0) goto L33
            r8 = 0
            goto L37
        L33:
            androidx.core.os.LocaleListCompat r8 = r12.getConfigurationLocales(r13)
        L37:
            r9 = 0
            if (r5 == r6) goto L3c
            r9 = r9 | 512(0x200, float:7.17E-43)
        L3c:
            if (r8 == 0) goto L48
            boolean r10 = r7.equals(r8)
            if (r10 != 0) goto L48
            r9 = r9 | 4
            r9 = r9 | 8192(0x2000, float:1.148E-41)
        L48:
            int r10 = ~r14
            r10 = r10 & r9
            if (r10 == 0) goto L8f
            if (r15 == 0) goto L8f
            boolean r10 = r1.mBaseContextAttached
            if (r10 == 0) goto L8f
            boolean r10 = androidx.appcompat.app.AppCompatDelegateImpl.sCanReturnDifferentContext
            if (r10 != 0) goto L5a
            boolean r10 = r1.mCreated
            if (r10 == 0) goto L8f
        L5a:
            java.lang.Object r10 = r1.mHost
            boolean r10 = r10 instanceof android.app.Activity
            if (r10 == 0) goto L8f
            java.lang.Object r10 = r1.mHost
            android.app.Activity r10 = (android.app.Activity) r10
            boolean r10 = r10.isChild()
            if (r10 != 0) goto L8f
            int r10 = android.os.Build.VERSION.SDK_INT
            r11 = 31
            if (r10 < r11) goto L87
            r10 = r9 & 8192(0x2000, float:1.148E-41)
            if (r10 == 0) goto L87
            java.lang.Object r10 = r1.mHost
            android.app.Activity r10 = (android.app.Activity) r10
            android.view.Window r10 = r10.getWindow()
            android.view.View r10 = r10.getDecorView()
            int r11 = r13.getLayoutDirection()
            r10.setLayoutDirection(r11)
        L87:
            java.lang.Object r10 = r1.mHost
            android.app.Activity r10 = (android.app.Activity) r10
            androidx.core.app.ActivityCompat.recreate(r10)
            r0 = 1
        L8f:
            if (r0 != 0) goto L9f
            if (r9 == 0) goto L9f
            r10 = r9 & r14
            if (r10 != r9) goto L99
            r10 = 1
            goto L9a
        L99:
            r10 = 0
        L9a:
            r11 = 0
            r12.updateResourcesConfiguration(r6, r8, r10, r11)
            r0 = 1
        L9f:
            if (r0 == 0) goto Lbd
            java.lang.Object r10 = r1.mHost
            boolean r10 = r10 instanceof androidx.appcompat.app.AppCompatActivity
            if (r10 == 0) goto Lbd
            r10 = r9 & 512(0x200, float:7.17E-43)
            if (r10 == 0) goto Lb2
            java.lang.Object r10 = r1.mHost
            androidx.appcompat.app.AppCompatActivity r10 = (androidx.appcompat.app.AppCompatActivity) r10
            r10.onNightModeChanged(r3)
        Lb2:
            r10 = r9 & 4
            if (r10 == 0) goto Lbd
            java.lang.Object r10 = r1.mHost
            androidx.appcompat.app.AppCompatActivity r10 = (androidx.appcompat.app.AppCompatActivity) r10
            r10.onLocalesChanged(r4)
        Lbd:
            if (r8 == 0) goto Ld0
            android.content.Context r10 = r1.mContext
            android.content.res.Resources r10 = r10.getResources()
            android.content.res.Configuration r10 = r10.getConfiguration()
            androidx.core.os.LocaleListCompat r10 = r12.getConfigurationLocales(r10)
            r12.setDefaultLocalesForLocaleList(r10)
        Ld0:
            return r0
    }

    private void updateResourcesConfiguration(int r6, androidx.core.os.LocaleListCompat r7, boolean r8, android.content.res.Configuration r9) {
            r5 = this;
            android.content.Context r0 = r5.mContext
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.Configuration r1 = new android.content.res.Configuration
            android.content.res.Configuration r2 = r0.getConfiguration()
            r1.<init>(r2)
            if (r9 == 0) goto L14
            r1.updateFrom(r9)
        L14:
            android.content.res.Configuration r2 = r0.getConfiguration()
            int r2 = r2.uiMode
            r2 = r2 & (-49)
            r2 = r2 | r6
            r1.uiMode = r2
            if (r7 == 0) goto L25
            r5.setConfigurationLocales(r1, r7)
        L25:
            r2 = 0
            r0.updateConfiguration(r1, r2)
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 26
            if (r2 >= r3) goto L32
            androidx.appcompat.app.ResourcesFlusher.flush(r0)
        L32:
            int r2 = r5.mThemeResId
            if (r2 == 0) goto L4a
            android.content.Context r2 = r5.mContext
            int r3 = r5.mThemeResId
            r2.setTheme(r3)
            android.content.Context r2 = r5.mContext
            android.content.res.Resources$Theme r2 = r2.getTheme()
            int r3 = r5.mThemeResId
            r4 = 1
            r2.applyStyle(r3, r4)
        L4a:
            if (r8 == 0) goto L55
            java.lang.Object r2 = r5.mHost
            boolean r2 = r2 instanceof android.app.Activity
            if (r2 == 0) goto L55
            r5.updateActivityConfiguration(r1)
        L55:
            return
    }

    private void updateStatusGuardColor(android.view.View r4) {
            r3 = this;
            int r0 = androidx.core.view.ViewCompat.getWindowSystemUiVisibility(r4)
            r0 = r0 & 8192(0x2000, float:1.148E-41)
            if (r0 == 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            if (r0 == 0) goto L16
            android.content.Context r1 = r3.mContext
            int r2 = androidx.appcompat.R.color.abc_decor_view_status_guard_light
            int r1 = androidx.core.content.ContextCompat.getColor(r1, r2)
            goto L1e
        L16:
            android.content.Context r1 = r3.mContext
            int r2 = androidx.appcompat.R.color.abc_decor_view_status_guard
            int r1 = androidx.core.content.ContextCompat.getColor(r1, r2)
        L1e:
            r4.setBackgroundColor(r1)
            return
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void addContentView(android.view.View r4, android.view.ViewGroup.LayoutParams r5) {
            r3 = this;
            r3.ensureSubDecor()
            android.view.ViewGroup r0 = r3.mSubDecor
            r1 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r0 = r0.findViewById(r1)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r0.addView(r4, r5)
            androidx.appcompat.app.AppCompatDelegateImpl$AppCompatWindowCallback r1 = r3.mAppCompatWindowCallback
            android.view.Window r2 = r3.mWindow
            android.view.Window$Callback r2 = r2.getCallback()
            r1.bypassOnContentChanged(r2)
            return
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    boolean applyAppLocales() {
            r2 = this;
            android.content.Context r0 = r2.mContext
            boolean r0 = isAutoStorageOptedIn(r0)
            if (r0 == 0) goto L21
            androidx.core.os.LocaleListCompat r0 = getRequestedAppLocales()
            if (r0 == 0) goto L21
            androidx.core.os.LocaleListCompat r0 = getRequestedAppLocales()
            androidx.core.os.LocaleListCompat r1 = getStoredAppLocales()
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L21
            android.content.Context r0 = r2.mContext
            r2.asyncExecuteSyncRequestedAndStoredLocales(r0)
        L21:
            r0 = 1
            boolean r0 = r2.applyApplicationSpecificConfig(r0)
            return r0
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public boolean applyDayNight() {
            r1 = this;
            r0 = 1
            boolean r0 = r1.applyApplicationSpecificConfig(r0)
            return r0
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public android.content.Context attachBaseContext2(android.content.Context r12) {
            r11 = this;
            r1 = 1
            r11.mBaseContextAttached = r1
            int r0 = r11.calculateNightMode()
            int r4 = r11.mapNightMode(r12, r0)
            boolean r0 = isAutoStorageOptedIn(r12)
            if (r0 == 0) goto L14
            syncRequestedAndStoredLocales(r12)
        L14:
            androidx.core.os.LocaleListCompat r5 = r11.calculateApplicationLocales(r12)
            boolean r0 = r12 instanceof android.view.ContextThemeWrapper
            if (r0 == 0) goto L2d
            r6 = 0
            r7 = 0
            r2 = r11
            r3 = r12
            android.content.res.Configuration r12 = r2.createOverrideAppConfiguration(r3, r4, r5, r6, r7)
            r0 = r3
            android.view.ContextThemeWrapper r0 = (android.view.ContextThemeWrapper) r0     // Catch: java.lang.IllegalStateException -> L2b
            r0.applyOverrideConfiguration(r12)     // Catch: java.lang.IllegalStateException -> L2b
            return r3
        L2b:
            r0 = move-exception
            goto L2e
        L2d:
            r3 = r12
        L2e:
            boolean r12 = r3 instanceof androidx.appcompat.view.ContextThemeWrapper
            if (r12 == 0) goto L42
            r6 = 0
            r7 = 0
            r2 = r11
            android.content.res.Configuration r12 = r2.createOverrideAppConfiguration(r3, r4, r5, r6, r7)
            r0 = r3
            androidx.appcompat.view.ContextThemeWrapper r0 = (androidx.appcompat.view.ContextThemeWrapper) r0     // Catch: java.lang.IllegalStateException -> L41
            r0.applyOverrideConfiguration(r12)     // Catch: java.lang.IllegalStateException -> L41
            return r3
        L41:
            r0 = move-exception
        L42:
            boolean r12 = androidx.appcompat.app.AppCompatDelegateImpl.sCanReturnDifferentContext
            if (r12 != 0) goto L4b
            android.content.Context r12 = super.attachBaseContext2(r3)
            return r12
        L4b:
            r12 = 0
            android.content.res.Configuration r0 = new android.content.res.Configuration
            r0.<init>()
            r8 = r0
            r0 = -1
            r8.uiMode = r0
            r0 = 0
            r8.fontScale = r0
            android.content.Context r0 = r3.createConfigurationContext(r8)
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.Configuration r9 = r0.getConfiguration()
            android.content.res.Resources r0 = r3.getResources()
            android.content.res.Configuration r10 = r0.getConfiguration()
            int r0 = r10.uiMode
            r9.uiMode = r0
            boolean r0 = r9.equals(r10)
            if (r0 != 0) goto L7d
            android.content.res.Configuration r12 = generateConfigDelta(r9, r10)
            r6 = r12
            goto L7e
        L7d:
            r6 = r12
        L7e:
            r7 = 1
            r2 = r11
            android.content.res.Configuration r12 = r2.createOverrideAppConfiguration(r3, r4, r5, r6, r7)
            androidx.appcompat.view.ContextThemeWrapper r0 = new androidx.appcompat.view.ContextThemeWrapper
            int r7 = androidx.appcompat.R.style.Theme_AppCompat_Empty
            r0.<init>(r3, r7)
            r7 = r0
            r7.applyOverrideConfiguration(r12)
            android.content.res.Resources$Theme r0 = r3.getTheme()     // Catch: java.lang.NullPointerException -> L98
            if (r0 == 0) goto L96
            goto L97
        L96:
            r1 = 0
        L97:
            goto L9a
        L98:
            r0 = move-exception
            r1 = 0
        L9a:
            if (r1 == 0) goto La3
            android.content.res.Resources$Theme r0 = r7.getTheme()
            androidx.core.content.res.ResourcesCompat.ThemeCompat.rebase(r0)
        La3:
            android.content.Context r0 = super.attachBaseContext2(r7)
            return r0
    }

    androidx.core.os.LocaleListCompat calculateApplicationLocales(android.content.Context r5) {
            r4 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            r2 = 0
            if (r0 < r1) goto L8
            return r2
        L8:
            androidx.core.os.LocaleListCompat r0 = getRequestedAppLocales()
            if (r0 != 0) goto Lf
            return r2
        Lf:
            android.content.Context r1 = r5.getApplicationContext()
            android.content.res.Resources r1 = r1.getResources()
            android.content.res.Configuration r1 = r1.getConfiguration()
            androidx.core.os.LocaleListCompat r1 = r4.getConfigurationLocales(r1)
            androidx.core.os.LocaleListCompat r2 = androidx.appcompat.app.LocaleOverlayHelper.combineLocalesIfOverlayExists(r0, r1)
            boolean r3 = r2.isEmpty()
            if (r3 == 0) goto L2c
            r2 = r1
        L2c:
            return r2
    }

    void callOnPanelClosed(int r3, androidx.appcompat.app.AppCompatDelegateImpl.PanelFeatureState r4, android.view.Menu r5) {
            r2 = this;
            if (r5 != 0) goto L13
            if (r4 != 0) goto Lf
            if (r3 < 0) goto Lf
            androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState[] r0 = r2.mPanels
            int r0 = r0.length
            if (r3 >= r0) goto Lf
            androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState[] r0 = r2.mPanels
            r4 = r0[r3]
        Lf:
            if (r4 == 0) goto L13
            androidx.appcompat.view.menu.MenuBuilder r5 = r4.menu
        L13:
            if (r4 == 0) goto L1a
            boolean r0 = r4.isOpen
            if (r0 != 0) goto L1a
            return
        L1a:
            boolean r0 = r2.mDestroyed
            if (r0 != 0) goto L29
            androidx.appcompat.app.AppCompatDelegateImpl$AppCompatWindowCallback r0 = r2.mAppCompatWindowCallback
            android.view.Window r1 = r2.mWindow
            android.view.Window$Callback r1 = r1.getCallback()
            r0.bypassOnPanelClosed(r1, r3, r5)
        L29:
            return
    }

    void checkCloseActionMenu(androidx.appcompat.view.menu.MenuBuilder r3) {
            r2 = this;
            boolean r0 = r2.mClosingActionMenu
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r2.mClosingActionMenu = r0
            androidx.appcompat.widget.DecorContentParent r0 = r2.mDecorContentParent
            r0.dismissPopups()
            android.view.Window$Callback r0 = r2.getWindowCallback()
            if (r0 == 0) goto L1c
            boolean r1 = r2.mDestroyed
            if (r1 != 0) goto L1c
            r1 = 108(0x6c, float:1.51E-43)
            r0.onPanelClosed(r1, r3)
        L1c:
            r1 = 0
            r2.mClosingActionMenu = r1
            return
    }

    void closePanel(int r3) {
            r2 = this;
            r0 = 1
            androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState r1 = r2.getPanelState(r3, r0)
            r2.closePanel(r1, r0)
            return
    }

    void closePanel(androidx.appcompat.app.AppCompatDelegateImpl.PanelFeatureState r4, boolean r5) {
            r3 = this;
            if (r5 == 0) goto L18
            int r0 = r4.featureId
            if (r0 != 0) goto L18
            androidx.appcompat.widget.DecorContentParent r0 = r3.mDecorContentParent
            if (r0 == 0) goto L18
            androidx.appcompat.widget.DecorContentParent r0 = r3.mDecorContentParent
            boolean r0 = r0.isOverflowMenuShowing()
            if (r0 == 0) goto L18
            androidx.appcompat.view.menu.MenuBuilder r0 = r4.menu
            r3.checkCloseActionMenu(r0)
            return
        L18:
            android.content.Context r0 = r3.mContext
            java.lang.String r1 = "window"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            r1 = 0
            if (r0 == 0) goto L39
            boolean r2 = r4.isOpen
            if (r2 == 0) goto L39
            android.view.ViewGroup r2 = r4.decorView
            if (r2 == 0) goto L39
            android.view.ViewGroup r2 = r4.decorView
            r0.removeView(r2)
            if (r5 == 0) goto L39
            int r2 = r4.featureId
            r3.callOnPanelClosed(r2, r4, r1)
        L39:
            r2 = 0
            r4.isPrepared = r2
            r4.isHandled = r2
            r4.isOpen = r2
            r4.shownPanelView = r1
            r2 = 1
            r4.refreshDecorView = r2
            androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState r2 = r3.mPreparedPanel
            if (r2 != r4) goto L4b
            r3.mPreparedPanel = r1
        L4b:
            int r1 = r4.featureId
            if (r1 != 0) goto L52
            r3.updateBackInvokedCallbackState()
        L52:
            return
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public android.view.View createView(android.view.View r11, java.lang.String r12, android.content.Context r13, android.util.AttributeSet r14) {
            r10 = this;
            androidx.appcompat.app.AppCompatViewInflater r0 = r10.mAppCompatViewInflater
            r1 = 0
            if (r0 != 0) goto L61
            android.content.Context r0 = r10.mContext
            int[] r2 = androidx.appcompat.R.styleable.AppCompatTheme
            android.content.res.TypedArray r2 = r0.obtainStyledAttributes(r2)
            int r0 = androidx.appcompat.R.styleable.AppCompatTheme_viewInflaterClass
            java.lang.String r3 = r2.getString(r0)
            r2.recycle()
            if (r3 != 0) goto L20
            androidx.appcompat.app.AppCompatViewInflater r0 = new androidx.appcompat.app.AppCompatViewInflater
            r0.<init>()
            r10.mAppCompatViewInflater = r0
            goto L61
        L20:
            android.content.Context r0 = r10.mContext     // Catch: java.lang.Throwable -> L3b
            java.lang.ClassLoader r0 = r0.getClassLoader()     // Catch: java.lang.Throwable -> L3b
            java.lang.Class r0 = r0.loadClass(r3)     // Catch: java.lang.Throwable -> L3b
            java.lang.Class[] r4 = new java.lang.Class[r1]     // Catch: java.lang.Throwable -> L3b
            java.lang.reflect.Constructor r4 = r0.getDeclaredConstructor(r4)     // Catch: java.lang.Throwable -> L3b
            java.lang.Object[] r5 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L3b
            java.lang.Object r4 = r4.newInstance(r5)     // Catch: java.lang.Throwable -> L3b
            androidx.appcompat.app.AppCompatViewInflater r4 = (androidx.appcompat.app.AppCompatViewInflater) r4     // Catch: java.lang.Throwable -> L3b
            r10.mAppCompatViewInflater = r4     // Catch: java.lang.Throwable -> L3b
            goto L61
        L3b:
            r0 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Failed to instantiate custom view inflater "
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.StringBuilder r4 = r4.append(r3)
            java.lang.String r5 = ". Falling back to default."
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = "AppCompatDelegate"
            android.util.Log.i(r5, r4, r0)
            androidx.appcompat.app.AppCompatViewInflater r4 = new androidx.appcompat.app.AppCompatViewInflater
            r4.<init>()
            r10.mAppCompatViewInflater = r4
        L61:
            r0 = 0
            boolean r2 = androidx.appcompat.app.AppCompatDelegateImpl.IS_PRE_LOLLIPOP
            if (r2 == 0) goto L96
            androidx.appcompat.app.LayoutIncludeDetector r2 = r10.mLayoutIncludeDetector
            if (r2 != 0) goto L71
            androidx.appcompat.app.LayoutIncludeDetector r2 = new androidx.appcompat.app.LayoutIncludeDetector
            r2.<init>()
            r10.mLayoutIncludeDetector = r2
        L71:
            androidx.appcompat.app.LayoutIncludeDetector r2 = r10.mLayoutIncludeDetector
            boolean r2 = r2.detect(r14)
            if (r2 == 0) goto L7c
            r0 = 1
            r6 = r0
            goto L97
        L7c:
            boolean r2 = r14 instanceof org.xmlpull.v1.XmlPullParser
            if (r2 == 0) goto L8c
            r2 = r14
            org.xmlpull.v1.XmlPullParser r2 = (org.xmlpull.v1.XmlPullParser) r2
            int r2 = r2.getDepth()
            r3 = 1
            if (r2 <= r3) goto L93
            r1 = r3
            goto L93
        L8c:
            r1 = r11
            android.view.ViewParent r1 = (android.view.ViewParent) r1
            boolean r1 = r10.shouldInheritContext(r1)
        L93:
            r0 = r1
            r6 = r0
            goto L97
        L96:
            r6 = r0
        L97:
            androidx.appcompat.app.AppCompatViewInflater r1 = r10.mAppCompatViewInflater
            boolean r7 = androidx.appcompat.app.AppCompatDelegateImpl.IS_PRE_LOLLIPOP
            boolean r9 = androidx.appcompat.widget.VectorEnabledTintResources.shouldBeUsed()
            r8 = 1
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            android.view.View r11 = r1.createView(r2, r3, r4, r5, r6, r7, r8, r9)
            return r11
    }

    void dismissPopups() {
            r2 = this;
            androidx.appcompat.widget.DecorContentParent r0 = r2.mDecorContentParent
            if (r0 == 0) goto L9
            androidx.appcompat.widget.DecorContentParent r0 = r2.mDecorContentParent
            r0.dismissPopups()
        L9:
            android.widget.PopupWindow r0 = r2.mActionModePopup
            if (r0 == 0) goto L2a
            android.view.Window r0 = r2.mWindow
            android.view.View r0 = r0.getDecorView()
            java.lang.Runnable r1 = r2.mShowActionModePopup
            r0.removeCallbacks(r1)
            android.widget.PopupWindow r0 = r2.mActionModePopup
            boolean r0 = r0.isShowing()
            if (r0 == 0) goto L27
            android.widget.PopupWindow r0 = r2.mActionModePopup     // Catch: java.lang.IllegalArgumentException -> L26
            r0.dismiss()     // Catch: java.lang.IllegalArgumentException -> L26
            goto L27
        L26:
            r0 = move-exception
        L27:
            r0 = 0
            r2.mActionModePopup = r0
        L2a:
            r2.endOnGoingFadeAnimation()
            r0 = 0
            androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState r0 = r2.getPanelState(r0, r0)
            if (r0 == 0) goto L3d
            androidx.appcompat.view.menu.MenuBuilder r1 = r0.menu
            if (r1 == 0) goto L3d
            androidx.appcompat.view.menu.MenuBuilder r1 = r0.menu
            r1.close()
        L3d:
            return
    }

    boolean dispatchKeyEvent(android.view.KeyEvent r5) {
            r4 = this;
            java.lang.Object r0 = r4.mHost
            boolean r0 = r0 instanceof androidx.core.view.KeyEventDispatcher.Component
            r1 = 1
            if (r0 != 0) goto Ld
            java.lang.Object r0 = r4.mHost
            boolean r0 = r0 instanceof androidx.appcompat.app.AppCompatDialog
            if (r0 == 0) goto L1c
        Ld:
            android.view.Window r0 = r4.mWindow
            android.view.View r0 = r0.getDecorView()
            if (r0 == 0) goto L1c
            boolean r2 = androidx.core.view.KeyEventDispatcher.dispatchBeforeHierarchy(r0, r5)
            if (r2 == 0) goto L1c
            return r1
        L1c:
            int r0 = r5.getKeyCode()
            r2 = 82
            if (r0 != r2) goto L33
            androidx.appcompat.app.AppCompatDelegateImpl$AppCompatWindowCallback r0 = r4.mAppCompatWindowCallback
            android.view.Window r2 = r4.mWindow
            android.view.Window$Callback r2 = r2.getCallback()
            boolean r0 = r0.bypassDispatchKeyEvent(r2, r5)
            if (r0 == 0) goto L33
            return r1
        L33:
            int r0 = r5.getKeyCode()
            int r2 = r5.getAction()
            if (r2 != 0) goto L3e
            goto L3f
        L3e:
            r1 = 0
        L3f:
            if (r1 == 0) goto L46
            boolean r3 = r4.onKeyDown(r0, r5)
            goto L4a
        L46:
            boolean r3 = r4.onKeyUp(r0, r5)
        L4a:
            return r3
    }

    void doInvalidatePanelMenu(int r5) {
            r4 = this;
            r0 = 1
            androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState r1 = r4.getPanelState(r5, r0)
            r2 = 0
            androidx.appcompat.view.menu.MenuBuilder r3 = r1.menu
            if (r3 == 0) goto L27
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            r2 = r3
            androidx.appcompat.view.menu.MenuBuilder r3 = r1.menu
            r3.saveActionViewStates(r2)
            int r3 = r2.size()
            if (r3 <= 0) goto L1d
            r1.frozenActionViewState = r2
        L1d:
            androidx.appcompat.view.menu.MenuBuilder r3 = r1.menu
            r3.stopDispatchingItemsChanged()
            androidx.appcompat.view.menu.MenuBuilder r3 = r1.menu
            r3.clear()
        L27:
            r1.refreshMenuContent = r0
            r1.refreshDecorView = r0
            r0 = 108(0x6c, float:1.51E-43)
            if (r5 == r0) goto L31
            if (r5 != 0) goto L42
        L31:
            androidx.appcompat.widget.DecorContentParent r0 = r4.mDecorContentParent
            if (r0 == 0) goto L42
            r0 = 0
            androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState r1 = r4.getPanelState(r0, r0)
            if (r1 == 0) goto L42
            r1.isPrepared = r0
            r0 = 0
            r4.preparePanel(r1, r0)
        L42:
            return
    }

    void endOnGoingFadeAnimation() {
            r1 = this;
            androidx.core.view.ViewPropertyAnimatorCompat r0 = r1.mFadeAnim
            if (r0 == 0) goto L9
            androidx.core.view.ViewPropertyAnimatorCompat r0 = r1.mFadeAnim
            r0.cancel()
        L9:
            return
    }

    androidx.appcompat.app.AppCompatDelegateImpl.PanelFeatureState findMenuPanel(android.view.Menu r6) {
            r5 = this;
            androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState[] r0 = r5.mPanels
            if (r0 == 0) goto L6
            int r1 = r0.length
            goto L7
        L6:
            r1 = 0
        L7:
            r2 = 0
        L8:
            if (r2 >= r1) goto L16
            r3 = r0[r2]
            if (r3 == 0) goto L13
            androidx.appcompat.view.menu.MenuBuilder r4 = r3.menu
            if (r4 != r6) goto L13
            return r3
        L13:
            int r2 = r2 + 1
            goto L8
        L16:
            r2 = 0
            return r2
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public <T extends android.view.View> T findViewById(int r2) {
            r1 = this;
            r1.ensureSubDecor()
            android.view.Window r0 = r1.mWindow
            android.view.View r0 = r0.findViewById(r2)
            return r0
    }

    final android.content.Context getActionBarThemedContext() {
            r2 = this;
            r0 = 0
            androidx.appcompat.app.ActionBar r1 = r2.getSupportActionBar()
            if (r1 == 0) goto Lb
            android.content.Context r0 = r1.getThemedContext()
        Lb:
            if (r0 != 0) goto Lf
            android.content.Context r0 = r2.mContext
        Lf:
            return r0
    }

    final androidx.appcompat.app.AppCompatDelegateImpl.AutoNightModeManager getAutoTimeNightModeManager() {
            r1 = this;
            android.content.Context r0 = r1.mContext
            androidx.appcompat.app.AppCompatDelegateImpl$AutoNightModeManager r0 = r1.getAutoTimeNightModeManager(r0)
            return r0
    }

    androidx.core.os.LocaleListCompat getConfigurationLocales(android.content.res.Configuration r2) {
            r1 = this;
            androidx.core.os.LocaleListCompat r0 = androidx.appcompat.app.AppCompatDelegateImpl.Api24Impl.getLocales(r2)
            return r0
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public android.content.Context getContextForDelegate() {
            r1 = this;
            android.content.Context r0 = r1.mContext
            return r0
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final androidx.appcompat.app.ActionBarDrawerToggle.Delegate getDrawerToggleDelegate() {
            r1 = this;
            androidx.appcompat.app.AppCompatDelegateImpl$ActionBarDrawableToggleImpl r0 = new androidx.appcompat.app.AppCompatDelegateImpl$ActionBarDrawableToggleImpl
            r0.<init>(r1)
            return r0
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public int getLocalNightMode() {
            r1 = this;
            int r0 = r1.mLocalNightMode
            return r0
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public android.view.MenuInflater getMenuInflater() {
            r2 = this;
            android.view.MenuInflater r0 = r2.mMenuInflater
            if (r0 != 0) goto L1b
            r2.initWindowDecorActionBar()
            androidx.appcompat.view.SupportMenuInflater r0 = new androidx.appcompat.view.SupportMenuInflater
            androidx.appcompat.app.ActionBar r1 = r2.mActionBar
            if (r1 == 0) goto L14
            androidx.appcompat.app.ActionBar r1 = r2.mActionBar
            android.content.Context r1 = r1.getThemedContext()
            goto L16
        L14:
            android.content.Context r1 = r2.mContext
        L16:
            r0.<init>(r1)
            r2.mMenuInflater = r0
        L1b:
            android.view.MenuInflater r0 = r2.mMenuInflater
            return r0
    }

    protected androidx.appcompat.app.AppCompatDelegateImpl.PanelFeatureState getPanelState(int r5, boolean r6) {
            r4 = this;
            androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState[] r0 = r4.mPanels
            r1 = r0
            if (r0 == 0) goto L8
            int r0 = r1.length
            if (r0 > r5) goto L16
        L8:
            int r0 = r5 + 1
            androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState[] r0 = new androidx.appcompat.app.AppCompatDelegateImpl.PanelFeatureState[r0]
            if (r1 == 0) goto L13
            int r2 = r1.length
            r3 = 0
            java.lang.System.arraycopy(r1, r3, r0, r3, r2)
        L13:
            r1 = r0
            r4.mPanels = r0
        L16:
            r0 = r1[r5]
            if (r0 != 0) goto L22
            androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState r2 = new androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState
            r2.<init>(r5)
            r0 = r2
            r1[r5] = r2
        L22:
            return r0
    }

    android.view.ViewGroup getSubDecor() {
            r1 = this;
            android.view.ViewGroup r0 = r1.mSubDecor
            return r0
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public androidx.appcompat.app.ActionBar getSupportActionBar() {
            r1 = this;
            r1.initWindowDecorActionBar()
            androidx.appcompat.app.ActionBar r0 = r1.mActionBar
            return r0
    }

    final java.lang.CharSequence getTitle() {
            r1 = this;
            java.lang.Object r0 = r1.mHost
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto Lf
            java.lang.Object r0 = r1.mHost
            android.app.Activity r0 = (android.app.Activity) r0
            java.lang.CharSequence r0 = r0.getTitle()
            return r0
        Lf:
            java.lang.CharSequence r0 = r1.mTitle
            return r0
    }

    final android.view.Window.Callback getWindowCallback() {
            r1 = this;
            android.view.Window r0 = r1.mWindow
            android.view.Window$Callback r0 = r0.getCallback()
            return r0
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public boolean hasWindowFeature(int r3) {
            r2 = this;
            r0 = 0
            int r1 = r2.sanitizeWindowFeatureId(r3)
            switch(r1) {
                case 1: goto L18;
                case 2: goto L15;
                case 5: goto L12;
                case 10: goto Lf;
                case 108: goto Lc;
                case 109: goto L9;
                default: goto L8;
            }
        L8:
            goto L1a
        L9:
            boolean r0 = r2.mOverlayActionBar
            goto L1a
        Lc:
            boolean r0 = r2.mHasActionBar
            goto L1a
        Lf:
            boolean r0 = r2.mOverlayActionMode
            goto L1a
        L12:
            boolean r0 = r2.mFeatureIndeterminateProgress
            goto L1a
        L15:
            boolean r0 = r2.mFeatureProgress
            goto L1a
        L18:
            boolean r0 = r2.mWindowNoTitle
        L1a:
            if (r0 != 0) goto L27
            android.view.Window r1 = r2.mWindow
            boolean r1 = r1.hasFeature(r3)
            if (r1 == 0) goto L25
            goto L27
        L25:
            r1 = 0
            goto L28
        L27:
            r1 = 1
        L28:
            return r1
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void installViewFactory() {
            r3 = this;
            android.content.Context r0 = r3.mContext
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            android.view.LayoutInflater$Factory r1 = r0.getFactory()
            if (r1 != 0) goto L10
            androidx.core.view.LayoutInflaterCompat.setFactory2(r0, r3)
            goto L1f
        L10:
            android.view.LayoutInflater$Factory2 r1 = r0.getFactory2()
            boolean r1 = r1 instanceof androidx.appcompat.app.AppCompatDelegateImpl
            if (r1 != 0) goto L1f
            java.lang.String r1 = "AppCompatDelegate"
            java.lang.String r2 = "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's"
            android.util.Log.i(r1, r2)
        L1f:
            return
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void invalidateOptionsMenu() {
            r1 = this;
            androidx.appcompat.app.ActionBar r0 = r1.peekSupportActionBar()
            if (r0 == 0) goto L16
            androidx.appcompat.app.ActionBar r0 = r1.getSupportActionBar()
            boolean r0 = r0.invalidateOptionsMenu()
            if (r0 == 0) goto L11
            goto L16
        L11:
            r0 = 0
            r1.invalidatePanelMenu(r0)
            return
        L16:
            return
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public boolean isHandleNativeActionModesEnabled() {
            r1 = this;
            boolean r0 = r1.mHandleNativeActionModes
            return r0
    }

    int mapNightMode(android.content.Context r4, int r5) {
            r3 = this;
            r0 = -1
            switch(r5) {
                case -100: goto L33;
                case -1: goto L32;
                case 0: goto L15;
                case 1: goto L32;
                case 2: goto L32;
                case 3: goto Lc;
                default: goto L4;
            }
        L4:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate."
            r0.<init>(r1)
            throw r0
        Lc:
            androidx.appcompat.app.AppCompatDelegateImpl$AutoNightModeManager r0 = r3.getAutoBatteryNightModeManager(r4)
            int r0 = r0.getApplyableNightMode()
            return r0
        L15:
            android.content.Context r1 = r4.getApplicationContext()
            java.lang.String r2 = "uimode"
            java.lang.Object r1 = r1.getSystemService(r2)
            android.app.UiModeManager r1 = (android.app.UiModeManager) r1
            int r2 = r1.getNightMode()
            if (r2 != 0) goto L29
            return r0
        L29:
            androidx.appcompat.app.AppCompatDelegateImpl$AutoNightModeManager r0 = r3.getAutoTimeNightModeManager(r4)
            int r0 = r0.getApplyableNightMode()
            return r0
        L32:
            return r5
        L33:
            return r0
    }

    boolean onBackPressed() {
            r6 = this;
            boolean r0 = r6.mLongPressBackDown
            r1 = 0
            r6.mLongPressBackDown = r1
            androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState r2 = r6.getPanelState(r1, r1)
            r3 = 1
            if (r2 == 0) goto L16
            boolean r4 = r2.isOpen
            if (r4 == 0) goto L16
            if (r0 != 0) goto L15
            r6.closePanel(r2, r3)
        L15:
            return r3
        L16:
            androidx.appcompat.view.ActionMode r4 = r6.mActionMode
            if (r4 == 0) goto L20
            androidx.appcompat.view.ActionMode r1 = r6.mActionMode
            r1.finish()
            return r3
        L20:
            androidx.appcompat.app.ActionBar r4 = r6.getSupportActionBar()
            if (r4 == 0) goto L2d
            boolean r5 = r4.collapseActionView()
            if (r5 == 0) goto L2d
            return r3
        L2d:
            return r1
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void onConfigurationChanged(android.content.res.Configuration r3) {
            r2 = this;
            boolean r0 = r2.mHasActionBar
            if (r0 == 0) goto L11
            boolean r0 = r2.mSubDecorInstalled
            if (r0 == 0) goto L11
            androidx.appcompat.app.ActionBar r0 = r2.getSupportActionBar()
            if (r0 == 0) goto L11
            r0.onConfigurationChanged(r3)
        L11:
            androidx.appcompat.widget.AppCompatDrawableManager r0 = androidx.appcompat.widget.AppCompatDrawableManager.get()
            android.content.Context r1 = r2.mContext
            r0.onConfigurationChanged(r1)
            android.content.res.Configuration r0 = new android.content.res.Configuration
            android.content.Context r1 = r2.mContext
            android.content.res.Resources r1 = r1.getResources()
            android.content.res.Configuration r1 = r1.getConfiguration()
            r0.<init>(r1)
            r2.mEffectiveConfiguration = r0
            r0 = 0
            r2.applyApplicationSpecificConfig(r0, r0)
            return
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void onCreate(android.os.Bundle r4) {
            r3 = this;
            r0 = 1
            r3.mBaseContextAttached = r0
            r1 = 0
            r3.applyApplicationSpecificConfig(r1)
            r3.ensureWindow()
            java.lang.Object r1 = r3.mHost
            boolean r1 = r1 instanceof android.app.Activity
            if (r1 == 0) goto L2d
            r1 = 0
            java.lang.Object r2 = r3.mHost     // Catch: java.lang.IllegalArgumentException -> L1b
            android.app.Activity r2 = (android.app.Activity) r2     // Catch: java.lang.IllegalArgumentException -> L1b
            java.lang.String r2 = androidx.core.app.NavUtils.getParentActivityName(r2)     // Catch: java.lang.IllegalArgumentException -> L1b
            r1 = r2
            goto L1c
        L1b:
            r2 = move-exception
        L1c:
            if (r1 == 0) goto L2a
            androidx.appcompat.app.ActionBar r2 = r3.peekSupportActionBar()
            if (r2 != 0) goto L27
            r3.mEnableDefaultActionBarUp = r0
            goto L2a
        L27:
            r2.setDefaultDisplayHomeAsUpEnabled(r0)
        L2a:
            addActiveDelegate(r3)
        L2d:
            android.content.res.Configuration r1 = new android.content.res.Configuration
            android.content.Context r2 = r3.mContext
            android.content.res.Resources r2 = r2.getResources()
            android.content.res.Configuration r2 = r2.getConfiguration()
            r1.<init>(r2)
            r3.mEffectiveConfiguration = r1
            r3.mCreated = r0
            return
    }

    @Override // android.view.LayoutInflater.Factory2
    public final android.view.View onCreateView(android.view.View r2, java.lang.String r3, android.content.Context r4, android.util.AttributeSet r5) {
            r1 = this;
            android.view.View r0 = r1.createView(r2, r3, r4, r5)
            return r0
    }

    @Override // android.view.LayoutInflater.Factory
    public android.view.View onCreateView(java.lang.String r2, android.content.Context r3, android.util.AttributeSet r4) {
            r1 = this;
            r0 = 0
            android.view.View r0 = r1.onCreateView(r0, r2, r3, r4)
            return r0
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void onDestroy() {
            r3 = this;
            java.lang.Object r0 = r3.mHost
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L9
            removeActivityDelegate(r3)
        L9:
            boolean r0 = r3.mInvalidatePanelMenuPosted
            if (r0 == 0) goto L18
            android.view.Window r0 = r3.mWindow
            android.view.View r0 = r0.getDecorView()
            java.lang.Runnable r1 = r3.mInvalidatePanelMenuRunnable
            r0.removeCallbacks(r1)
        L18:
            r0 = 1
            r3.mDestroyed = r0
            int r0 = r3.mLocalNightMode
            r1 = -100
            if (r0 == r1) goto L47
            java.lang.Object r0 = r3.mHost
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L47
            java.lang.Object r0 = r3.mHost
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L47
            androidx.collection.SimpleArrayMap<java.lang.String, java.lang.Integer> r0 = androidx.appcompat.app.AppCompatDelegateImpl.sLocalNightModes
            java.lang.Object r1 = r3.mHost
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.mLocalNightMode
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L56
        L47:
            androidx.collection.SimpleArrayMap<java.lang.String, java.lang.Integer> r0 = androidx.appcompat.app.AppCompatDelegateImpl.sLocalNightModes
            java.lang.Object r1 = r3.mHost
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L56:
            androidx.appcompat.app.ActionBar r0 = r3.mActionBar
            if (r0 == 0) goto L5f
            androidx.appcompat.app.ActionBar r0 = r3.mActionBar
            r0.onDestroy()
        L5f:
            r3.cleanupAutoManagers()
            return
    }

    boolean onKeyDown(int r4, android.view.KeyEvent r5) {
            r3 = this;
            r0 = 1
            r1 = 0
            switch(r4) {
                case 4: goto La;
                case 82: goto L6;
                default: goto L5;
            }
        L5:
            goto L16
        L6:
            r3.onKeyDownPanel(r1, r5)
            return r0
        La:
            int r2 = r5.getFlags()
            r2 = r2 & 128(0x80, float:1.8E-43)
            if (r2 == 0) goto L13
            goto L14
        L13:
            r0 = r1
        L14:
            r3.mLongPressBackDown = r0
        L16:
            return r1
    }

    boolean onKeyShortcut(int r6, android.view.KeyEvent r7) {
            r5 = this;
            androidx.appcompat.app.ActionBar r0 = r5.getSupportActionBar()
            r1 = 1
            if (r0 == 0) goto Le
            boolean r2 = r0.onKeyShortcut(r6, r7)
            if (r2 == 0) goto Le
            return r1
        Le:
            androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState r2 = r5.mPreparedPanel
            if (r2 == 0) goto L27
            androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState r2 = r5.mPreparedPanel
            int r3 = r7.getKeyCode()
            boolean r2 = r5.performPanelShortcut(r2, r3, r7, r1)
            if (r2 == 0) goto L27
            androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState r3 = r5.mPreparedPanel
            if (r3 == 0) goto L26
            androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState r3 = r5.mPreparedPanel
            r3.isHandled = r1
        L26:
            return r1
        L27:
            androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState r2 = r5.mPreparedPanel
            r3 = 0
            if (r2 != 0) goto L40
            androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState r2 = r5.getPanelState(r3, r1)
            r5.preparePanel(r2, r7)
            int r4 = r7.getKeyCode()
            boolean r4 = r5.performPanelShortcut(r2, r4, r7, r1)
            r2.isPrepared = r3
            if (r4 == 0) goto L40
            return r1
        L40:
            return r3
    }

    boolean onKeyUp(int r4, android.view.KeyEvent r5) {
            r3 = this;
            r0 = 1
            r1 = 0
            switch(r4) {
                case 4: goto La;
                case 82: goto L6;
                default: goto L5;
            }
        L5:
            goto L11
        L6:
            r3.onKeyUpPanel(r1, r5)
            return r0
        La:
            boolean r2 = r3.onBackPressed()
            if (r2 == 0) goto L11
            return r0
        L11:
            return r1
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
    public boolean onMenuItemSelected(androidx.appcompat.view.menu.MenuBuilder r4, android.view.MenuItem r5) {
            r3 = this;
            android.view.Window$Callback r0 = r3.getWindowCallback()
            if (r0 == 0) goto L1b
            boolean r1 = r3.mDestroyed
            if (r1 != 0) goto L1b
            androidx.appcompat.view.menu.MenuBuilder r1 = r4.getRootMenu()
            androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState r1 = r3.findMenuPanel(r1)
            if (r1 == 0) goto L1b
            int r2 = r1.featureId
            boolean r2 = r0.onMenuItemSelected(r2, r5)
            return r2
        L1b:
            r1 = 0
            return r1
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
    public void onMenuModeChange(androidx.appcompat.view.menu.MenuBuilder r2) {
            r1 = this;
            r0 = 1
            r1.reopenMenu(r0)
            return
    }

    void onMenuOpened(int r3) {
            r2 = this;
            r0 = 108(0x6c, float:1.51E-43)
            if (r3 != r0) goto Le
            androidx.appcompat.app.ActionBar r0 = r2.getSupportActionBar()
            if (r0 == 0) goto Le
            r1 = 1
            r0.dispatchMenuVisibilityChanged(r1)
        Le:
            return
    }

    void onPanelClosed(int r4) {
            r3 = this;
            r0 = 108(0x6c, float:1.51E-43)
            r1 = 0
            if (r4 != r0) goto Lf
            androidx.appcompat.app.ActionBar r0 = r3.getSupportActionBar()
            if (r0 == 0) goto L1e
            r0.dispatchMenuVisibilityChanged(r1)
            goto L1e
        Lf:
            if (r4 != 0) goto L1e
            r0 = 1
            androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState r0 = r3.getPanelState(r4, r0)
            boolean r2 = r0.isOpen
            if (r2 == 0) goto L1f
            r3.closePanel(r0, r1)
            goto L1f
        L1e:
        L1f:
            return
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void onPostCreate(android.os.Bundle r1) {
            r0 = this;
            r0.ensureSubDecor()
            return
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void onPostResume() {
            r2 = this;
            androidx.appcompat.app.ActionBar r0 = r2.getSupportActionBar()
            if (r0 == 0) goto La
            r1 = 1
            r0.setShowHideAnimationEnabled(r1)
        La:
            return
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void onSaveInstanceState(android.os.Bundle r1) {
            r0 = this;
            return
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void onStart() {
            r2 = this;
            r0 = 1
            r1 = 0
            r2.applyApplicationSpecificConfig(r0, r1)
            return
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void onStop() {
            r2 = this;
            androidx.appcompat.app.ActionBar r0 = r2.getSupportActionBar()
            if (r0 == 0) goto La
            r1 = 0
            r0.setShowHideAnimationEnabled(r1)
        La:
            return
    }

    void onSubDecorInstalled(android.view.ViewGroup r1) {
            r0 = this;
            return
    }

    final androidx.appcompat.app.ActionBar peekSupportActionBar() {
            r1 = this;
            androidx.appcompat.app.ActionBar r0 = r1.mActionBar
            return r0
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public boolean requestWindowFeature(int r4) {
            r3 = this;
            int r4 = r3.sanitizeWindowFeatureId(r4)
            boolean r0 = r3.mWindowNoTitle
            r1 = 0
            if (r0 == 0) goto Le
            r0 = 108(0x6c, float:1.51E-43)
            if (r4 != r0) goto Le
            return r1
        Le:
            boolean r0 = r3.mHasActionBar
            r2 = 1
            if (r0 == 0) goto L17
            if (r4 != r2) goto L17
            r3.mHasActionBar = r1
        L17:
            switch(r4) {
                case 1: goto L3f;
                case 2: goto L39;
                case 5: goto L33;
                case 10: goto L2d;
                case 108: goto L27;
                case 109: goto L21;
                default: goto L1a;
            }
        L1a:
            android.view.Window r0 = r3.mWindow
            boolean r0 = r0.requestFeature(r4)
            return r0
        L21:
            r3.throwFeatureRequestIfSubDecorInstalled()
            r3.mOverlayActionBar = r2
            return r2
        L27:
            r3.throwFeatureRequestIfSubDecorInstalled()
            r3.mHasActionBar = r2
            return r2
        L2d:
            r3.throwFeatureRequestIfSubDecorInstalled()
            r3.mOverlayActionMode = r2
            return r2
        L33:
            r3.throwFeatureRequestIfSubDecorInstalled()
            r3.mFeatureIndeterminateProgress = r2
            return r2
        L39:
            r3.throwFeatureRequestIfSubDecorInstalled()
            r3.mFeatureProgress = r2
            return r2
        L3f:
            r3.throwFeatureRequestIfSubDecorInstalled()
            r3.mWindowNoTitle = r2
            return r2
    }

    void setConfigurationLocales(android.content.res.Configuration r1, androidx.core.os.LocaleListCompat r2) {
            r0 = this;
            androidx.appcompat.app.AppCompatDelegateImpl.Api24Impl.setLocales(r1, r2)
            return
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void setContentView(int r4) {
            r3 = this;
            r3.ensureSubDecor()
            android.view.ViewGroup r0 = r3.mSubDecor
            r1 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r0 = r0.findViewById(r1)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r0.removeAllViews()
            android.content.Context r1 = r3.mContext
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r1)
            r1.inflate(r4, r0)
            androidx.appcompat.app.AppCompatDelegateImpl$AppCompatWindowCallback r1 = r3.mAppCompatWindowCallback
            android.view.Window r2 = r3.mWindow
            android.view.Window$Callback r2 = r2.getCallback()
            r1.bypassOnContentChanged(r2)
            return
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void setContentView(android.view.View r4) {
            r3 = this;
            r3.ensureSubDecor()
            android.view.ViewGroup r0 = r3.mSubDecor
            r1 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r0 = r0.findViewById(r1)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r0.removeAllViews()
            r0.addView(r4)
            androidx.appcompat.app.AppCompatDelegateImpl$AppCompatWindowCallback r1 = r3.mAppCompatWindowCallback
            android.view.Window r2 = r3.mWindow
            android.view.Window$Callback r2 = r2.getCallback()
            r1.bypassOnContentChanged(r2)
            return
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void setContentView(android.view.View r4, android.view.ViewGroup.LayoutParams r5) {
            r3 = this;
            r3.ensureSubDecor()
            android.view.ViewGroup r0 = r3.mSubDecor
            r1 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r0 = r0.findViewById(r1)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r0.removeAllViews()
            r0.addView(r4, r5)
            androidx.appcompat.app.AppCompatDelegateImpl$AppCompatWindowCallback r1 = r3.mAppCompatWindowCallback
            android.view.Window r2 = r3.mWindow
            android.view.Window$Callback r2 = r2.getCallback()
            r1.bypassOnContentChanged(r2)
            return
    }

    void setDefaultLocalesForLocaleList(androidx.core.os.LocaleListCompat r1) {
            r0 = this;
            androidx.appcompat.app.AppCompatDelegateImpl.Api24Impl.setDefaultLocales(r1)
            return
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void setHandleNativeActionModesEnabled(boolean r1) {
            r0 = this;
            r0.mHandleNativeActionModes = r1
            return
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void setLocalNightMode(int r2) {
            r1 = this;
            int r0 = r1.mLocalNightMode
            if (r0 == r2) goto Ld
            r1.mLocalNightMode = r2
            boolean r0 = r1.mBaseContextAttached
            if (r0 == 0) goto Ld
            r1.applyDayNight()
        Ld:
            return
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void setOnBackInvokedDispatcher(android.window.OnBackInvokedDispatcher r3) {
            r2 = this;
            super.setOnBackInvokedDispatcher(r3)
            android.window.OnBackInvokedDispatcher r0 = r2.mDispatcher
            if (r0 == 0) goto L15
            android.window.OnBackInvokedCallback r0 = r2.mBackCallback
            if (r0 == 0) goto L15
            android.window.OnBackInvokedDispatcher r0 = r2.mDispatcher
            android.window.OnBackInvokedCallback r1 = r2.mBackCallback
            androidx.appcompat.app.AppCompatDelegateImpl.Api33Impl.unregisterOnBackInvokedCallback(r0, r1)
            r0 = 0
            r2.mBackCallback = r0
        L15:
            if (r3 != 0) goto L32
            java.lang.Object r0 = r2.mHost
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L32
            java.lang.Object r0 = r2.mHost
            android.app.Activity r0 = (android.app.Activity) r0
            android.view.Window r0 = r0.getWindow()
            if (r0 == 0) goto L32
            java.lang.Object r0 = r2.mHost
            android.app.Activity r0 = (android.app.Activity) r0
            android.window.OnBackInvokedDispatcher r0 = androidx.appcompat.app.AppCompatDelegateImpl.Api33Impl.getOnBackInvokedDispatcher(r0)
            r2.mDispatcher = r0
            goto L34
        L32:
            r2.mDispatcher = r3
        L34:
            r2.updateBackInvokedCallbackState()
            return
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void setSupportActionBar(androidx.appcompat.widget.Toolbar r5) {
            r4 = this;
            java.lang.Object r0 = r4.mHost
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 != 0) goto L7
            return
        L7:
            androidx.appcompat.app.ActionBar r0 = r4.getSupportActionBar()
            boolean r1 = r0 instanceof androidx.appcompat.app.WindowDecorActionBar
            if (r1 != 0) goto L3d
            r1 = 0
            r4.mMenuInflater = r1
            if (r0 == 0) goto L17
            r0.onDestroy()
        L17:
            r4.mActionBar = r1
            if (r5 == 0) goto L34
            androidx.appcompat.app.ToolbarActionBar r1 = new androidx.appcompat.app.ToolbarActionBar
            java.lang.CharSequence r2 = r4.getTitle()
            androidx.appcompat.app.AppCompatDelegateImpl$AppCompatWindowCallback r3 = r4.mAppCompatWindowCallback
            r1.<init>(r5, r2, r3)
            r4.mActionBar = r1
            androidx.appcompat.app.AppCompatDelegateImpl$AppCompatWindowCallback r2 = r4.mAppCompatWindowCallback
            androidx.appcompat.app.AppCompatDelegateImpl$ActionBarMenuCallback r3 = r1.mMenuCallback
            r2.setActionBarCallback(r3)
            r2 = 1
            r5.setBackInvokedCallbackEnabled(r2)
            goto L39
        L34:
            androidx.appcompat.app.AppCompatDelegateImpl$AppCompatWindowCallback r2 = r4.mAppCompatWindowCallback
            r2.setActionBarCallback(r1)
        L39:
            r4.invalidateOptionsMenu()
            return
        L3d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead."
            r1.<init>(r2)
            throw r1
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public void setTheme(int r1) {
            r0 = this;
            r0.mThemeResId = r1
            return
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final void setTitle(java.lang.CharSequence r2) {
            r1 = this;
            r1.mTitle = r2
            androidx.appcompat.widget.DecorContentParent r0 = r1.mDecorContentParent
            if (r0 == 0) goto Lc
            androidx.appcompat.widget.DecorContentParent r0 = r1.mDecorContentParent
            r0.setWindowTitle(r2)
            goto L23
        Lc:
            androidx.appcompat.app.ActionBar r0 = r1.peekSupportActionBar()
            if (r0 == 0) goto L1a
            androidx.appcompat.app.ActionBar r0 = r1.peekSupportActionBar()
            r0.setWindowTitle(r2)
            goto L23
        L1a:
            android.widget.TextView r0 = r1.mTitleView
            if (r0 == 0) goto L23
            android.widget.TextView r0 = r1.mTitleView
            r0.setText(r2)
        L23:
            return
    }

    final boolean shouldAnimateActionModeView() {
            r1 = this;
            boolean r0 = r1.mSubDecorInstalled
            if (r0 == 0) goto L12
            android.view.ViewGroup r0 = r1.mSubDecor
            if (r0 == 0) goto L12
            android.view.ViewGroup r0 = r1.mSubDecor
            boolean r0 = r0.isLaidOut()
            if (r0 == 0) goto L12
            r0 = 1
            goto L13
        L12:
            r0 = 0
        L13:
            return r0
    }

    boolean shouldRegisterBackInvokedCallback() {
            r4 = this;
            android.window.OnBackInvokedDispatcher r0 = r4.mDispatcher
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState r0 = r4.getPanelState(r1, r1)
            r2 = 1
            if (r0 == 0) goto L12
            boolean r3 = r0.isOpen
            if (r3 == 0) goto L12
            return r2
        L12:
            androidx.appcompat.view.ActionMode r3 = r4.mActionMode
            if (r3 == 0) goto L17
            return r2
        L17:
            return r1
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public androidx.appcompat.view.ActionMode startSupportActionMode(androidx.appcompat.view.ActionMode.Callback r5) {
            r4 = this;
            if (r5 == 0) goto L3b
            androidx.appcompat.view.ActionMode r0 = r4.mActionMode
            if (r0 == 0) goto Lb
            androidx.appcompat.view.ActionMode r0 = r4.mActionMode
            r0.finish()
        Lb:
            androidx.appcompat.app.AppCompatDelegateImpl$ActionModeCallbackWrapperV9 r0 = new androidx.appcompat.app.AppCompatDelegateImpl$ActionModeCallbackWrapperV9
            r0.<init>(r4, r5)
            androidx.appcompat.app.ActionBar r1 = r4.getSupportActionBar()
            if (r1 == 0) goto L2b
            androidx.appcompat.view.ActionMode r2 = r1.startActionMode(r0)
            r4.mActionMode = r2
            androidx.appcompat.view.ActionMode r2 = r4.mActionMode
            if (r2 == 0) goto L2b
            androidx.appcompat.app.AppCompatCallback r2 = r4.mAppCompatCallback
            if (r2 == 0) goto L2b
            androidx.appcompat.app.AppCompatCallback r2 = r4.mAppCompatCallback
            androidx.appcompat.view.ActionMode r3 = r4.mActionMode
            r2.onSupportActionModeStarted(r3)
        L2b:
            androidx.appcompat.view.ActionMode r2 = r4.mActionMode
            if (r2 != 0) goto L35
            androidx.appcompat.view.ActionMode r2 = r4.startSupportActionModeFromWindow(r0)
            r4.mActionMode = r2
        L35:
            r4.updateBackInvokedCallbackState()
            androidx.appcompat.view.ActionMode r2 = r4.mActionMode
            return r2
        L3b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "ActionMode callback can not be null."
            r0.<init>(r1)
            throw r0
    }

    androidx.appcompat.view.ActionMode startSupportActionModeFromWindow(androidx.appcompat.view.ActionMode.Callback r11) {
            r10 = this;
            r10.endOnGoingFadeAnimation()
            androidx.appcompat.view.ActionMode r0 = r10.mActionMode
            if (r0 == 0) goto Lc
            androidx.appcompat.view.ActionMode r0 = r10.mActionMode
            r0.finish()
        Lc:
            boolean r0 = r11 instanceof androidx.appcompat.app.AppCompatDelegateImpl.ActionModeCallbackWrapperV9
            if (r0 != 0) goto L16
            androidx.appcompat.app.AppCompatDelegateImpl$ActionModeCallbackWrapperV9 r0 = new androidx.appcompat.app.AppCompatDelegateImpl$ActionModeCallbackWrapperV9
            r0.<init>(r10, r11)
            r11 = r0
        L16:
            r0 = 0
            androidx.appcompat.app.AppCompatCallback r1 = r10.mAppCompatCallback
            if (r1 == 0) goto L28
            boolean r1 = r10.mDestroyed
            if (r1 != 0) goto L28
            androidx.appcompat.app.AppCompatCallback r1 = r10.mAppCompatCallback     // Catch: java.lang.AbstractMethodError -> L27
            androidx.appcompat.view.ActionMode r1 = r1.onWindowStartingSupportActionMode(r11)     // Catch: java.lang.AbstractMethodError -> L27
            r0 = r1
            goto L28
        L27:
            r1 = move-exception
        L28:
            if (r0 == 0) goto L2e
            r10.mActionMode = r0
            goto L166
        L2e:
            androidx.appcompat.widget.ActionBarContextView r1 = r10.mActionModeView
            r2 = 0
            r3 = 0
            r4 = 1
            if (r1 != 0) goto Ldc
            boolean r1 = r10.mIsFloating
            if (r1 == 0) goto Lbd
            android.util.TypedValue r1 = new android.util.TypedValue
            r1.<init>()
            android.content.Context r5 = r10.mContext
            android.content.res.Resources$Theme r5 = r5.getTheme()
            int r6 = androidx.appcompat.R.attr.actionBarTheme
            r5.resolveAttribute(r6, r1, r4)
            int r6 = r1.resourceId
            if (r6 == 0) goto L6e
            android.content.Context r6 = r10.mContext
            android.content.res.Resources r6 = r6.getResources()
            android.content.res.Resources$Theme r6 = r6.newTheme()
            r6.setTo(r5)
            int r7 = r1.resourceId
            r6.applyStyle(r7, r4)
            androidx.appcompat.view.ContextThemeWrapper r7 = new androidx.appcompat.view.ContextThemeWrapper
            android.content.Context r8 = r10.mContext
            r7.<init>(r8, r3)
            android.content.res.Resources$Theme r8 = r7.getTheme()
            r8.setTo(r6)
            goto L70
        L6e:
            android.content.Context r7 = r10.mContext
        L70:
            androidx.appcompat.widget.ActionBarContextView r6 = new androidx.appcompat.widget.ActionBarContextView
            r6.<init>(r7)
            r10.mActionModeView = r6
            android.widget.PopupWindow r6 = new android.widget.PopupWindow
            int r8 = androidx.appcompat.R.attr.actionModePopupWindowStyle
            r6.<init>(r7, r2, r8)
            r10.mActionModePopup = r6
            android.widget.PopupWindow r6 = r10.mActionModePopup
            r8 = 2
            androidx.core.widget.PopupWindowCompat.setWindowLayoutType(r6, r8)
            android.widget.PopupWindow r6 = r10.mActionModePopup
            androidx.appcompat.widget.ActionBarContextView r8 = r10.mActionModeView
            r6.setContentView(r8)
            android.widget.PopupWindow r6 = r10.mActionModePopup
            r8 = -1
            r6.setWidth(r8)
            android.content.res.Resources$Theme r6 = r7.getTheme()
            int r8 = androidx.appcompat.R.attr.actionBarSize
            r6.resolveAttribute(r8, r1, r4)
            int r6 = r1.data
            android.content.res.Resources r8 = r7.getResources()
            android.util.DisplayMetrics r8 = r8.getDisplayMetrics()
            int r6 = android.util.TypedValue.complexToDimensionPixelSize(r6, r8)
            androidx.appcompat.widget.ActionBarContextView r8 = r10.mActionModeView
            r8.setContentHeight(r6)
            android.widget.PopupWindow r8 = r10.mActionModePopup
            r9 = -2
            r8.setHeight(r9)
            androidx.appcompat.app.AppCompatDelegateImpl$6 r8 = new androidx.appcompat.app.AppCompatDelegateImpl$6
            r8.<init>(r10)
            r10.mShowActionModePopup = r8
            goto Ldc
        Lbd:
            android.view.ViewGroup r1 = r10.mSubDecor
            int r5 = androidx.appcompat.R.id.action_mode_bar_stub
            android.view.View r1 = r1.findViewById(r5)
            androidx.appcompat.widget.ViewStubCompat r1 = (androidx.appcompat.widget.ViewStubCompat) r1
            if (r1 == 0) goto Ldc
            android.content.Context r5 = r10.getActionBarThemedContext()
            android.view.LayoutInflater r5 = android.view.LayoutInflater.from(r5)
            r1.setLayoutInflater(r5)
            android.view.View r5 = r1.inflate()
            androidx.appcompat.widget.ActionBarContextView r5 = (androidx.appcompat.widget.ActionBarContextView) r5
            r10.mActionModeView = r5
        Ldc:
            androidx.appcompat.widget.ActionBarContextView r1 = r10.mActionModeView
            if (r1 == 0) goto L166
            r10.endOnGoingFadeAnimation()
            androidx.appcompat.widget.ActionBarContextView r1 = r10.mActionModeView
            r1.killMode()
            androidx.appcompat.view.StandaloneActionMode r1 = new androidx.appcompat.view.StandaloneActionMode
            androidx.appcompat.widget.ActionBarContextView r5 = r10.mActionModeView
            android.content.Context r5 = r5.getContext()
            androidx.appcompat.widget.ActionBarContextView r6 = r10.mActionModeView
            android.widget.PopupWindow r7 = r10.mActionModePopup
            if (r7 != 0) goto Lf7
            goto Lf8
        Lf7:
            r4 = r3
        Lf8:
            r1.<init>(r5, r6, r11, r4)
            r0 = r1
            android.view.Menu r1 = r0.getMenu()
            boolean r1 = r11.onCreateActionMode(r0, r1)
            if (r1 == 0) goto L164
            r0.invalidate()
            androidx.appcompat.widget.ActionBarContextView r1 = r10.mActionModeView
            r1.initForMode(r0)
            r10.mActionMode = r0
            boolean r1 = r10.shouldAnimateActionModeView()
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r1 == 0) goto L135
            androidx.appcompat.widget.ActionBarContextView r1 = r10.mActionModeView
            r3 = 0
            r1.setAlpha(r3)
            androidx.appcompat.widget.ActionBarContextView r1 = r10.mActionModeView
            androidx.core.view.ViewPropertyAnimatorCompat r1 = androidx.core.view.ViewCompat.animate(r1)
            androidx.core.view.ViewPropertyAnimatorCompat r1 = r1.alpha(r2)
            r10.mFadeAnim = r1
            androidx.core.view.ViewPropertyAnimatorCompat r1 = r10.mFadeAnim
            androidx.appcompat.app.AppCompatDelegateImpl$7 r2 = new androidx.appcompat.app.AppCompatDelegateImpl$7
            r2.<init>(r10)
            r1.setListener(r2)
            goto L154
        L135:
            androidx.appcompat.widget.ActionBarContextView r1 = r10.mActionModeView
            r1.setAlpha(r2)
            androidx.appcompat.widget.ActionBarContextView r1 = r10.mActionModeView
            r1.setVisibility(r3)
            androidx.appcompat.widget.ActionBarContextView r1 = r10.mActionModeView
            android.view.ViewParent r1 = r1.getParent()
            boolean r1 = r1 instanceof android.view.View
            if (r1 == 0) goto L154
            androidx.appcompat.widget.ActionBarContextView r1 = r10.mActionModeView
            android.view.ViewParent r1 = r1.getParent()
            android.view.View r1 = (android.view.View) r1
            androidx.core.view.ViewCompat.requestApplyInsets(r1)
        L154:
            android.widget.PopupWindow r1 = r10.mActionModePopup
            if (r1 == 0) goto L166
            android.view.Window r1 = r10.mWindow
            android.view.View r1 = r1.getDecorView()
            java.lang.Runnable r2 = r10.mShowActionModePopup
            r1.post(r2)
            goto L166
        L164:
            r10.mActionMode = r2
        L166:
            androidx.appcompat.view.ActionMode r1 = r10.mActionMode
            if (r1 == 0) goto L175
            androidx.appcompat.app.AppCompatCallback r1 = r10.mAppCompatCallback
            if (r1 == 0) goto L175
            androidx.appcompat.app.AppCompatCallback r1 = r10.mAppCompatCallback
            androidx.appcompat.view.ActionMode r2 = r10.mActionMode
            r1.onSupportActionModeStarted(r2)
        L175:
            r10.updateBackInvokedCallbackState()
            androidx.appcompat.view.ActionMode r1 = r10.mActionMode
            return r1
    }

    void updateBackInvokedCallbackState() {
            r3 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 < r1) goto L29
            boolean r0 = r3.shouldRegisterBackInvokedCallback()
            if (r0 == 0) goto L19
            android.window.OnBackInvokedCallback r1 = r3.mBackCallback
            if (r1 != 0) goto L19
            android.window.OnBackInvokedDispatcher r1 = r3.mDispatcher
            android.window.OnBackInvokedCallback r1 = androidx.appcompat.app.AppCompatDelegateImpl.Api33Impl.registerOnBackPressedCallback(r1, r3)
            r3.mBackCallback = r1
            goto L29
        L19:
            if (r0 != 0) goto L29
            android.window.OnBackInvokedCallback r1 = r3.mBackCallback
            if (r1 == 0) goto L29
            android.window.OnBackInvokedDispatcher r1 = r3.mDispatcher
            android.window.OnBackInvokedCallback r2 = r3.mBackCallback
            androidx.appcompat.app.AppCompatDelegateImpl.Api33Impl.unregisterOnBackInvokedCallback(r1, r2)
            r1 = 0
            r3.mBackCallback = r1
        L29:
            return
    }

    final int updateStatusGuard(androidx.core.view.WindowInsetsCompat r18, android.graphics.Rect r19) {
            r17 = this;
            r0 = r17
            r1 = r19
            r2 = 0
            if (r18 == 0) goto Lc
            int r2 = r18.getSystemWindowInsetTop()
            goto L10
        Lc:
            if (r1 == 0) goto L10
            int r2 = r1.top
        L10:
            r3 = 0
            androidx.appcompat.widget.ActionBarContextView r4 = r0.mActionModeView
            if (r4 == 0) goto L12d
            androidx.appcompat.widget.ActionBarContextView r4 = r0.mActionModeView
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            boolean r4 = r4 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r4 == 0) goto L129
            androidx.appcompat.widget.ActionBarContextView r4 = r0.mActionModeView
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r4 = (android.view.ViewGroup.MarginLayoutParams) r4
            r7 = 0
            androidx.appcompat.widget.ActionBarContextView r8 = r0.mActionModeView
            boolean r8 = r8.isShown()
            if (r8 == 0) goto L111
            android.graphics.Rect r8 = r0.mTempRect1
            if (r8 != 0) goto L42
            android.graphics.Rect r8 = new android.graphics.Rect
            r8.<init>()
            r0.mTempRect1 = r8
            android.graphics.Rect r8 = new android.graphics.Rect
            r8.<init>()
            r0.mTempRect2 = r8
        L42:
            android.graphics.Rect r8 = r0.mTempRect1
            android.graphics.Rect r9 = r0.mTempRect2
            if (r18 != 0) goto L4c
            r8.set(r1)
            goto L60
        L4c:
            int r10 = r18.getSystemWindowInsetLeft()
            int r11 = r18.getSystemWindowInsetTop()
            int r12 = r18.getSystemWindowInsetRight()
            int r13 = r18.getSystemWindowInsetBottom()
            r8.set(r10, r11, r12, r13)
        L60:
            android.view.ViewGroup r10 = r0.mSubDecor
            androidx.appcompat.widget.ViewUtils.computeFitSystemWindows(r10, r8, r9)
            int r10 = r8.top
            int r11 = r8.left
            int r12 = r8.right
            android.view.ViewGroup r13 = r0.mSubDecor
            androidx.core.view.WindowInsetsCompat r13 = androidx.core.view.ViewCompat.getRootWindowInsets(r13)
            if (r13 != 0) goto L75
            r14 = 0
            goto L79
        L75:
            int r14 = r13.getSystemWindowInsetLeft()
        L79:
            if (r13 != 0) goto L7d
            r15 = 0
            goto L81
        L7d:
            int r15 = r13.getSystemWindowInsetRight()
        L81:
            int r6 = r4.topMargin
            if (r6 != r10) goto L8d
            int r6 = r4.leftMargin
            if (r6 != r11) goto L8d
            int r6 = r4.rightMargin
            if (r6 == r12) goto L95
        L8d:
            r6 = 1
            r4.topMargin = r10
            r4.leftMargin = r11
            r4.rightMargin = r12
            r7 = r6
        L95:
            if (r10 <= 0) goto Lc3
            android.view.View r6 = r0.mStatusGuard
            if (r6 != 0) goto Lc3
            android.view.View r6 = new android.view.View
            android.content.Context r5 = r0.mContext
            r6.<init>(r5)
            r0.mStatusGuard = r6
            android.view.View r5 = r0.mStatusGuard
            r6 = 8
            r5.setVisibility(r6)
            android.widget.FrameLayout$LayoutParams r5 = new android.widget.FrameLayout$LayoutParams
            int r6 = r4.topMargin
            r1 = 51
            r16 = r2
            r2 = -1
            r5.<init>(r2, r6, r1)
            r5.leftMargin = r14
            r5.rightMargin = r15
            android.view.ViewGroup r1 = r0.mSubDecor
            android.view.View r6 = r0.mStatusGuard
            r1.addView(r6, r2, r5)
            goto Led
        Lc3:
            r16 = r2
            android.view.View r1 = r0.mStatusGuard
            if (r1 == 0) goto Led
            android.view.View r1 = r0.mStatusGuard
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            int r2 = r1.height
            int r5 = r4.topMargin
            if (r2 != r5) goto Ldf
            int r2 = r1.leftMargin
            if (r2 != r14) goto Ldf
            int r2 = r1.rightMargin
            if (r2 == r15) goto Lee
        Ldf:
            int r2 = r4.topMargin
            r1.height = r2
            r1.leftMargin = r14
            r1.rightMargin = r15
            android.view.View r2 = r0.mStatusGuard
            r2.setLayoutParams(r1)
            goto Lee
        Led:
        Lee:
            android.view.View r1 = r0.mStatusGuard
            if (r1 == 0) goto Lf4
            r1 = 1
            goto Lf5
        Lf4:
            r1 = 0
        Lf5:
            if (r1 == 0) goto L104
            android.view.View r2 = r0.mStatusGuard
            int r2 = r2.getVisibility()
            if (r2 == 0) goto L104
            android.view.View r2 = r0.mStatusGuard
            r0.updateStatusGuardColor(r2)
        L104:
            boolean r2 = r0.mOverlayActionMode
            if (r2 != 0) goto L10c
            if (r1 == 0) goto L10c
            r2 = 0
            goto L10e
        L10c:
            r2 = r16
        L10e:
            r3 = r1
            r1 = 0
            goto L121
        L111:
            r16 = r2
            int r1 = r4.topMargin
            if (r1 == 0) goto L11e
            r7 = 1
            r1 = 0
            r4.topMargin = r1
            r2 = r16
            goto L121
        L11e:
            r1 = 0
            r2 = r16
        L121:
            if (r7 == 0) goto L132
            androidx.appcompat.widget.ActionBarContextView r5 = r0.mActionModeView
            r5.setLayoutParams(r4)
            goto L132
        L129:
            r16 = r2
            r1 = 0
            goto L130
        L12d:
            r16 = r2
            r1 = 0
        L130:
            r2 = r16
        L132:
            android.view.View r4 = r0.mStatusGuard
            if (r4 == 0) goto L141
            android.view.View r4 = r0.mStatusGuard
            if (r3 == 0) goto L13c
            r5 = r1
            goto L13e
        L13c:
            r5 = 8
        L13e:
            r4.setVisibility(r5)
        L141:
            return r2
    }
}
