package androidx.core.view;

/* JADX INFO: loaded from: classes.dex */
public class ViewCompat {
    private static final int[] ACCESSIBILITY_ACTIONS_RESOURCE_IDS = null;
    public static final int ACCESSIBILITY_LIVE_REGION_ASSERTIVE = 2;
    public static final int ACCESSIBILITY_LIVE_REGION_NONE = 0;
    public static final int ACCESSIBILITY_LIVE_REGION_POLITE = 1;

    @java.lang.Deprecated
    public static final int IMPORTANT_FOR_ACCESSIBILITY_AUTO = 0;

    @java.lang.Deprecated
    public static final int IMPORTANT_FOR_ACCESSIBILITY_NO = 2;

    @java.lang.Deprecated
    public static final int IMPORTANT_FOR_ACCESSIBILITY_NO_HIDE_DESCENDANTS = 4;

    @java.lang.Deprecated
    public static final int IMPORTANT_FOR_ACCESSIBILITY_YES = 1;
    public static final int IMPORTANT_FOR_CONTENT_CAPTURE_AUTO = 0;
    public static final int IMPORTANT_FOR_CONTENT_CAPTURE_NO = 2;
    public static final int IMPORTANT_FOR_CONTENT_CAPTURE_NO_EXCLUDE_DESCENDANTS = 8;
    public static final int IMPORTANT_FOR_CONTENT_CAPTURE_YES = 1;
    public static final int IMPORTANT_FOR_CONTENT_CAPTURE_YES_EXCLUDE_DESCENDANTS = 4;

    @java.lang.Deprecated
    public static final int LAYER_TYPE_HARDWARE = 2;

    @java.lang.Deprecated
    public static final int LAYER_TYPE_NONE = 0;

    @java.lang.Deprecated
    public static final int LAYER_TYPE_SOFTWARE = 1;

    @java.lang.Deprecated
    public static final int LAYOUT_DIRECTION_INHERIT = 2;

    @java.lang.Deprecated
    public static final int LAYOUT_DIRECTION_LOCALE = 3;

    @java.lang.Deprecated
    public static final int LAYOUT_DIRECTION_LTR = 0;

    @java.lang.Deprecated
    public static final int LAYOUT_DIRECTION_RTL = 1;

    @java.lang.Deprecated
    public static final int MEASURED_HEIGHT_STATE_SHIFT = 16;

    @java.lang.Deprecated
    public static final int MEASURED_SIZE_MASK = 16777215;

    @java.lang.Deprecated
    public static final int MEASURED_STATE_MASK = -16777216;

    @java.lang.Deprecated
    public static final int MEASURED_STATE_TOO_SMALL = 16777216;
    private static final androidx.core.view.OnReceiveContentViewBehavior NO_OP_ON_RECEIVE_CONTENT_VIEW_BEHAVIOR = null;

    @java.lang.Deprecated
    public static final int OVER_SCROLL_ALWAYS = 0;

    @java.lang.Deprecated
    public static final int OVER_SCROLL_IF_CONTENT_SCROLLS = 1;

    @java.lang.Deprecated
    public static final int OVER_SCROLL_NEVER = 2;
    public static final int SCROLL_AXIS_HORIZONTAL = 1;
    public static final int SCROLL_AXIS_NONE = 0;
    public static final int SCROLL_AXIS_VERTICAL = 2;
    public static final int SCROLL_INDICATOR_BOTTOM = 2;
    public static final int SCROLL_INDICATOR_END = 32;
    public static final int SCROLL_INDICATOR_LEFT = 4;
    public static final int SCROLL_INDICATOR_RIGHT = 8;
    public static final int SCROLL_INDICATOR_START = 16;
    public static final int SCROLL_INDICATOR_TOP = 1;
    private static final java.lang.String TAG = "ViewCompat";
    public static final int TYPE_NON_TOUCH = 1;
    public static final int TYPE_TOUCH = 0;
    private static boolean sAccessibilityDelegateCheckFailed;
    private static java.lang.reflect.Field sAccessibilityDelegateField;
    private static final androidx.core.view.ViewCompat.AccessibilityPaneVisibilityManager sAccessibilityPaneVisibilityManager = null;
    private static java.lang.reflect.Method sChildrenDrawingOrderMethod;
    private static java.lang.reflect.Method sDispatchFinishTemporaryDetach;
    private static java.lang.reflect.Method sDispatchStartTemporaryDetach;
    private static boolean sTempDetachBound;
    private static java.lang.ThreadLocal<android.graphics.Rect> sThreadLocalRect;
    private static java.util.WeakHashMap<android.view.View, java.lang.String> sTransitionNameMap;
    private static boolean sTryHiddenViewTransformMatrixToGlobal;
    private static java.util.WeakHashMap<android.view.View, androidx.core.view.ViewPropertyAnimatorCompat> sViewPropertyAnimatorMap;





    static class AccessibilityPaneVisibilityManager implements android.view.ViewTreeObserver.OnGlobalLayoutListener, android.view.View.OnAttachStateChangeListener {
        private final java.util.WeakHashMap<android.view.View, java.lang.Boolean> mPanesToVisible;

        AccessibilityPaneVisibilityManager() {
                r1 = this;
                r1.<init>()
                java.util.WeakHashMap r0 = new java.util.WeakHashMap
                r0.<init>()
                r1.mPanesToVisible = r0
                return
        }

        private void checkPaneVisibility(java.util.Map.Entry<android.view.View, java.lang.Boolean> r6) {
                r5 = this;
                java.lang.Object r0 = r6.getKey()
                android.view.View r0 = (android.view.View) r0
                java.lang.Object r1 = r6.getValue()
                java.lang.Boolean r1 = (java.lang.Boolean) r1
                boolean r1 = r1.booleanValue()
                boolean r2 = r0.isShown()
                if (r2 == 0) goto L1e
                int r2 = r0.getWindowVisibility()
                if (r2 != 0) goto L1e
                r2 = 1
                goto L1f
            L1e:
                r2 = 0
            L1f:
                if (r1 == r2) goto L33
                if (r2 == 0) goto L26
                r3 = 16
                goto L28
            L26:
                r3 = 32
            L28:
                androidx.core.view.ViewCompat.notifyViewAccessibilityStateChangedIfNeeded(r0, r3)
                java.lang.Boolean r4 = java.lang.Boolean.valueOf(r2)
                r6.setValue(r4)
            L33:
                return
        }

        private void registerForLayoutCallback(android.view.View r2) {
                r1 = this;
                android.view.ViewTreeObserver r0 = r2.getViewTreeObserver()
                r0.addOnGlobalLayoutListener(r1)
                return
        }

        private void unregisterForLayoutCallback(android.view.View r2) {
                r1 = this;
                android.view.ViewTreeObserver r0 = r2.getViewTreeObserver()
                r0.removeOnGlobalLayoutListener(r1)
                return
        }

        void addAccessibilityPane(android.view.View r3) {
                r2 = this;
                java.util.WeakHashMap<android.view.View, java.lang.Boolean> r0 = r2.mPanesToVisible
                boolean r1 = r3.isShown()
                if (r1 == 0) goto L10
                int r1 = r3.getWindowVisibility()
                if (r1 != 0) goto L10
                r1 = 1
                goto L11
            L10:
                r1 = 0
            L11:
                java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
                r0.put(r3, r1)
                r3.addOnAttachStateChangeListener(r2)
                boolean r0 = r3.isAttachedToWindow()
                if (r0 == 0) goto L24
                r2.registerForLayoutCallback(r3)
            L24:
                return
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
                r2 = this;
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 28
                if (r0 >= r1) goto L20
                java.util.WeakHashMap<android.view.View, java.lang.Boolean> r0 = r2.mPanesToVisible
                java.util.Set r0 = r0.entrySet()
                java.util.Iterator r0 = r0.iterator()
            L10:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L20
                java.lang.Object r1 = r0.next()
                java.util.Map$Entry r1 = (java.util.Map.Entry) r1
                r2.checkPaneVisibility(r1)
                goto L10
            L20:
                return
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(android.view.View r1) {
                r0 = this;
                r0.registerForLayoutCallback(r1)
                return
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(android.view.View r1) {
                r0 = this;
                return
        }

        void removeAccessibilityPane(android.view.View r2) {
                r1 = this;
                java.util.WeakHashMap<android.view.View, java.lang.Boolean> r0 = r1.mPanesToVisible
                r0.remove(r2)
                r2.removeOnAttachStateChangeListener(r1)
                r1.unregisterForLayoutCallback(r2)
                return
        }
    }

    static abstract class AccessibilityViewProperty<T> {
        private final int mContentChangeType;
        private final int mFrameworkMinimumSdk;
        private final int mTagKey;
        private final java.lang.Class<T> mType;

        AccessibilityViewProperty(int r2, java.lang.Class<T> r3, int r4) {
                r1 = this;
                r0 = 0
                r1.<init>(r2, r3, r0, r4)
                return
        }

        AccessibilityViewProperty(int r1, java.lang.Class<T> r2, int r3, int r4) {
                r0 = this;
                r0.<init>()
                r0.mTagKey = r1
                r0.mType = r2
                r0.mContentChangeType = r3
                r0.mFrameworkMinimumSdk = r4
                return
        }

        private boolean frameworkAvailable() {
                r2 = this;
                int r0 = android.os.Build.VERSION.SDK_INT
                int r1 = r2.mFrameworkMinimumSdk
                if (r0 < r1) goto L8
                r0 = 1
                goto L9
            L8:
                r0 = 0
            L9:
                return r0
        }

        boolean booleanNullToFalseEquals(java.lang.Boolean r5, java.lang.Boolean r6) {
                r4 = this;
                r0 = 1
                r1 = 0
                if (r5 == 0) goto Lc
                boolean r2 = r5.booleanValue()
                if (r2 == 0) goto Lc
                r2 = r0
                goto Ld
            Lc:
                r2 = r1
            Ld:
                if (r6 == 0) goto L17
                boolean r3 = r6.booleanValue()
                if (r3 == 0) goto L17
                r3 = r0
                goto L18
            L17:
                r3 = r1
            L18:
                if (r2 != r3) goto L1b
                goto L1c
            L1b:
                r0 = r1
            L1c:
                return r0
        }

        abstract T frameworkGet(android.view.View r1);

        abstract void frameworkSet(android.view.View r1, T r2);

        T get(android.view.View r3) {
                r2 = this;
                boolean r0 = r2.frameworkAvailable()
                if (r0 == 0) goto Lb
                java.lang.Object r0 = r2.frameworkGet(r3)
                return r0
            Lb:
                int r0 = r2.mTagKey
                java.lang.Object r0 = r3.getTag(r0)
                java.lang.Class<T> r1 = r2.mType
                boolean r1 = r1.isInstance(r0)
                if (r1 == 0) goto L1a
                return r0
            L1a:
                r0 = 0
                return r0
        }

        void set(android.view.View r2, T r3) {
                r1 = this;
                boolean r0 = r1.frameworkAvailable()
                if (r0 == 0) goto La
                r1.frameworkSet(r2, r3)
                goto L21
            La:
                java.lang.Object r0 = r1.get(r2)
                boolean r0 = r1.shouldUpdate(r0, r3)
                if (r0 == 0) goto L21
                androidx.core.view.ViewCompat.ensureAccessibilityDelegateCompat(r2)
                int r0 = r1.mTagKey
                r2.setTag(r0, r3)
                int r0 = r1.mContentChangeType
                androidx.core.view.ViewCompat.notifyViewAccessibilityStateChangedIfNeeded(r2, r0)
            L21:
                return
        }

        boolean shouldUpdate(T r2, T r3) {
                r1 = this;
                boolean r0 = r3.equals(r2)
                r0 = r0 ^ 1
                return r0
        }
    }

    static class Api20Impl {
        private Api20Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static android.view.WindowInsets dispatchApplyWindowInsets(android.view.View r1, android.view.WindowInsets r2) {
                boolean r0 = androidx.core.view.ViewGroupCompat.sCompatInsetsDispatchInstalled
                if (r0 == 0) goto L9
                android.view.WindowInsets r0 = androidx.core.view.ViewGroupCompat.dispatchApplyWindowInsets(r1, r2)
                goto Ld
            L9:
                android.view.WindowInsets r0 = r1.dispatchApplyWindowInsets(r2)
            Ld:
                return r0
        }

        static android.view.WindowInsets onApplyWindowInsets(android.view.View r1, android.view.WindowInsets r2) {
                android.view.WindowInsets r0 = r1.onApplyWindowInsets(r2)
                return r0
        }

        static void requestApplyInsets(android.view.View r0) {
                r0.requestApplyInsets()
                return
        }
    }

    private static class Api21Impl {


        private Api21Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static void callCompatInsetAnimationCallback(android.view.WindowInsets r1, android.view.View r2) {
                int r0 = androidx.core.R.id.tag_window_insets_animation_callback
                java.lang.Object r0 = r2.getTag(r0)
                android.view.View$OnApplyWindowInsetsListener r0 = (android.view.View.OnApplyWindowInsetsListener) r0
                if (r0 == 0) goto Ld
                r0.onApplyWindowInsets(r2, r1)
            Ld:
                return
        }

        static androidx.core.view.WindowInsetsCompat computeSystemWindowInsets(android.view.View r2, androidx.core.view.WindowInsetsCompat r3, android.graphics.Rect r4) {
                android.view.WindowInsets r0 = r3.toWindowInsets()
                if (r0 == 0) goto L10
            L7:
                android.view.WindowInsets r1 = r2.computeSystemWindowInsets(r0, r4)
                androidx.core.view.WindowInsetsCompat r1 = androidx.core.view.WindowInsetsCompat.toWindowInsetsCompat(r1, r2)
                return r1
            L10:
                r4.setEmpty()
                return r3
        }

        static boolean dispatchNestedFling(android.view.View r1, float r2, float r3, boolean r4) {
                boolean r0 = r1.dispatchNestedFling(r2, r3, r4)
                return r0
        }

        static boolean dispatchNestedPreFling(android.view.View r1, float r2, float r3) {
                boolean r0 = r1.dispatchNestedPreFling(r2, r3)
                return r0
        }

        static boolean dispatchNestedPreScroll(android.view.View r1, int r2, int r3, int[] r4, int[] r5) {
                boolean r0 = r1.dispatchNestedPreScroll(r2, r3, r4, r5)
                return r0
        }

        static boolean dispatchNestedScroll(android.view.View r1, int r2, int r3, int r4, int r5, int[] r6) {
                boolean r0 = r1.dispatchNestedScroll(r2, r3, r4, r5, r6)
                return r0
        }

        static android.content.res.ColorStateList getBackgroundTintList(android.view.View r1) {
                android.content.res.ColorStateList r0 = r1.getBackgroundTintList()
                return r0
        }

        static android.graphics.PorterDuff.Mode getBackgroundTintMode(android.view.View r1) {
                android.graphics.PorterDuff$Mode r0 = r1.getBackgroundTintMode()
                return r0
        }

        static float getElevation(android.view.View r1) {
                float r0 = r1.getElevation()
                return r0
        }

        public static androidx.core.view.WindowInsetsCompat getRootWindowInsets(android.view.View r1) {
                androidx.core.view.WindowInsetsCompat r0 = androidx.core.view.WindowInsetsCompat.Api21ReflectionHolder.getRootWindowInsets(r1)
                return r0
        }

        static java.lang.String getTransitionName(android.view.View r1) {
                java.lang.String r0 = r1.getTransitionName()
                return r0
        }

        static float getTranslationZ(android.view.View r1) {
                float r0 = r1.getTranslationZ()
                return r0
        }

        static float getZ(android.view.View r1) {
                float r0 = r1.getZ()
                return r0
        }

        static boolean hasNestedScrollingParent(android.view.View r1) {
                boolean r0 = r1.hasNestedScrollingParent()
                return r0
        }

        static boolean isImportantForAccessibility(android.view.View r1) {
                boolean r0 = r1.isImportantForAccessibility()
                return r0
        }

        static boolean isNestedScrollingEnabled(android.view.View r1) {
                boolean r0 = r1.isNestedScrollingEnabled()
                return r0
        }

        static void setBackgroundTintList(android.view.View r0, android.content.res.ColorStateList r1) {
                r0.setBackgroundTintList(r1)
                return
        }

        static void setBackgroundTintMode(android.view.View r0, android.graphics.PorterDuff.Mode r1) {
                r0.setBackgroundTintMode(r1)
                return
        }

        static void setElevation(android.view.View r0, float r1) {
                r0.setElevation(r1)
                return
        }

        static void setNestedScrollingEnabled(android.view.View r0, boolean r1) {
                r0.setNestedScrollingEnabled(r1)
                return
        }

        static void setOnApplyWindowInsetsListener(android.view.View r3, androidx.core.view.OnApplyWindowInsetsListener r4) {
                if (r4 == 0) goto L8
                androidx.core.view.ViewCompat$Api21Impl$1 r0 = new androidx.core.view.ViewCompat$Api21Impl$1
                r0.<init>(r3, r4)
                goto L9
            L8:
                r0 = 0
            L9:
                int r1 = android.os.Build.VERSION.SDK_INT
                r2 = 30
                if (r1 >= r2) goto L15
                int r1 = androidx.core.R.id.tag_on_apply_window_listener
                r3.setTag(r1, r0)
            L15:
                int r1 = androidx.core.R.id.tag_compat_insets_dispatch
                java.lang.Object r1 = r3.getTag(r1)
                if (r1 == 0) goto L1e
                return
            L1e:
                if (r0 == 0) goto L24
                r3.setOnApplyWindowInsetsListener(r0)
                goto L2f
            L24:
                int r2 = androidx.core.R.id.tag_window_insets_animation_callback
                java.lang.Object r2 = r3.getTag(r2)
                android.view.View$OnApplyWindowInsetsListener r2 = (android.view.View.OnApplyWindowInsetsListener) r2
                r3.setOnApplyWindowInsetsListener(r2)
            L2f:
                return
        }

        static void setTransitionName(android.view.View r0, java.lang.String r1) {
                r0.setTransitionName(r1)
                return
        }

        static void setTranslationZ(android.view.View r0, float r1) {
                r0.setTranslationZ(r1)
                return
        }

        static void setZ(android.view.View r0, float r1) {
                r0.setZ(r1)
                return
        }

        static boolean startNestedScroll(android.view.View r1, int r2) {
                boolean r0 = r1.startNestedScroll(r2)
                return r0
        }

        static void stopNestedScroll(android.view.View r0) {
                r0.stopNestedScroll()
                return
        }
    }

    private static class Api23Impl {
        private Api23Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        public static androidx.core.view.WindowInsetsCompat getRootWindowInsets(android.view.View r3) {
                android.view.WindowInsets r0 = r3.getRootWindowInsets()
                if (r0 != 0) goto L8
                r1 = 0
                return r1
            L8:
                androidx.core.view.WindowInsetsCompat r1 = androidx.core.view.WindowInsetsCompat.toWindowInsetsCompat(r0)
                r1.setRootWindowInsets(r1)
                android.view.View r2 = r3.getRootView()
                r1.copyRootViewBounds(r2)
                return r1
        }

        static int getScrollIndicators(android.view.View r1) {
                int r0 = r1.getScrollIndicators()
                return r0
        }

        static void setScrollIndicators(android.view.View r0, int r1) {
                r0.setScrollIndicators(r1)
                return
        }

        static void setScrollIndicators(android.view.View r0, int r1, int r2) {
                r0.setScrollIndicators(r1, r2)
                return
        }
    }

    static class Api24Impl {
        private Api24Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static void cancelDragAndDrop(android.view.View r0) {
                r0.cancelDragAndDrop()
                return
        }

        static void dispatchFinishTemporaryDetach(android.view.View r0) {
                r0.dispatchFinishTemporaryDetach()
                return
        }

        static void dispatchStartTemporaryDetach(android.view.View r0) {
                r0.dispatchStartTemporaryDetach()
                return
        }

        static void setPointerIcon(android.view.View r0, android.view.PointerIcon r1) {
                r0.setPointerIcon(r1)
                return
        }

        static boolean startDragAndDrop(android.view.View r1, android.content.ClipData r2, android.view.View.DragShadowBuilder r3, java.lang.Object r4, int r5) {
                boolean r0 = r1.startDragAndDrop(r2, r3, r4, r5)
                return r0
        }

        static void updateDragShadow(android.view.View r0, android.view.View.DragShadowBuilder r1) {
                r0.updateDragShadow(r1)
                return
        }
    }

    static class Api26Impl {
        private Api26Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static void addKeyboardNavigationClusters(android.view.View r0, java.util.Collection<android.view.View> r1, int r2) {
                r0.addKeyboardNavigationClusters(r1, r2)
                return
        }

        public static android.view.autofill.AutofillId getAutofillId(android.view.View r1) {
                android.view.autofill.AutofillId r0 = r1.getAutofillId()
                return r0
        }

        static int getImportantForAutofill(android.view.View r1) {
                int r0 = r1.getImportantForAutofill()
                return r0
        }

        static int getNextClusterForwardId(android.view.View r1) {
                int r0 = r1.getNextClusterForwardId()
                return r0
        }

        static boolean hasExplicitFocusable(android.view.View r1) {
                boolean r0 = r1.hasExplicitFocusable()
                return r0
        }

        static boolean isFocusedByDefault(android.view.View r1) {
                boolean r0 = r1.isFocusedByDefault()
                return r0
        }

        static boolean isImportantForAutofill(android.view.View r1) {
                boolean r0 = r1.isImportantForAutofill()
                return r0
        }

        static boolean isKeyboardNavigationCluster(android.view.View r1) {
                boolean r0 = r1.isKeyboardNavigationCluster()
                return r0
        }

        static android.view.View keyboardNavigationClusterSearch(android.view.View r1, android.view.View r2, int r3) {
                android.view.View r0 = r1.keyboardNavigationClusterSearch(r2, r3)
                return r0
        }

        static boolean restoreDefaultFocus(android.view.View r1) {
                boolean r0 = r1.restoreDefaultFocus()
                return r0
        }

        static void setAutofillHints(android.view.View r0, java.lang.String... r1) {
                r0.setAutofillHints(r1)
                return
        }

        static void setFocusedByDefault(android.view.View r0, boolean r1) {
                r0.setFocusedByDefault(r1)
                return
        }

        static void setImportantForAutofill(android.view.View r0, int r1) {
                r0.setImportantForAutofill(r1)
                return
        }

        static void setKeyboardNavigationCluster(android.view.View r0, boolean r1) {
                r0.setKeyboardNavigationCluster(r1)
                return
        }

        static void setNextClusterForwardId(android.view.View r0, int r1) {
                r0.setNextClusterForwardId(r1)
                return
        }

        static void setTooltipText(android.view.View r0, java.lang.CharSequence r1) {
                r0.setTooltipText(r1)
                return
        }
    }

    static class Api28Impl {
        private Api28Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static void addOnUnhandledKeyEventListener(android.view.View r2, androidx.core.view.ViewCompat.OnUnhandledKeyEventListenerCompat r3) {
                int r0 = androidx.core.R.id.tag_unhandled_key_listeners
                java.lang.Object r0 = r2.getTag(r0)
                androidx.collection.SimpleArrayMap r0 = (androidx.collection.SimpleArrayMap) r0
                if (r0 != 0) goto L15
                androidx.collection.SimpleArrayMap r1 = new androidx.collection.SimpleArrayMap
                r1.<init>()
                r0 = r1
                int r1 = androidx.core.R.id.tag_unhandled_key_listeners
                r2.setTag(r1, r0)
            L15:
                java.util.Objects.requireNonNull(r3)
                androidx.core.view.ViewCompat$Api28Impl$$ExternalSyntheticLambda0 r1 = new androidx.core.view.ViewCompat$Api28Impl$$ExternalSyntheticLambda0
                r1.<init>(r3)
                r0.put(r3, r1)
                r2.addOnUnhandledKeyEventListener(r1)
                return
        }

        static java.lang.CharSequence getAccessibilityPaneTitle(android.view.View r1) {
                java.lang.CharSequence r0 = r1.getAccessibilityPaneTitle()
                return r0
        }

        static boolean isAccessibilityHeading(android.view.View r1) {
                boolean r0 = r1.isAccessibilityHeading()
                return r0
        }

        static boolean isScreenReaderFocusable(android.view.View r1) {
                boolean r0 = r1.isScreenReaderFocusable()
                return r0
        }

        static void removeOnUnhandledKeyEventListener(android.view.View r2, androidx.core.view.ViewCompat.OnUnhandledKeyEventListenerCompat r3) {
                int r0 = androidx.core.R.id.tag_unhandled_key_listeners
                java.lang.Object r0 = r2.getTag(r0)
                androidx.collection.SimpleArrayMap r0 = (androidx.collection.SimpleArrayMap) r0
                if (r0 != 0) goto Lb
                return
            Lb:
                java.lang.Object r1 = r0.get(r3)
                android.view.View$OnUnhandledKeyEventListener r1 = (android.view.View.OnUnhandledKeyEventListener) r1
                if (r1 == 0) goto L16
                r2.removeOnUnhandledKeyEventListener(r1)
            L16:
                return
        }

        static <T> T requireViewById(android.view.View r1, int r2) {
                android.view.View r0 = r1.requireViewById(r2)
                return r0
        }

        static void setAccessibilityHeading(android.view.View r0, boolean r1) {
                r0.setAccessibilityHeading(r1)
                return
        }

        static void setAccessibilityPaneTitle(android.view.View r0, java.lang.CharSequence r1) {
                r0.setAccessibilityPaneTitle(r1)
                return
        }

        public static void setAutofillId(android.view.View r1, androidx.core.view.autofill.AutofillIdCompat r2) {
                if (r2 != 0) goto L4
                r0 = 0
                goto L8
            L4:
                android.view.autofill.AutofillId r0 = r2.toAutofillId()
            L8:
                r1.setAutofillId(r0)
                return
        }

        static void setScreenReaderFocusable(android.view.View r0, boolean r1) {
                r0.setScreenReaderFocusable(r1)
                return
        }
    }

    private static class Api29Impl {
        private Api29Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static android.view.View.AccessibilityDelegate getAccessibilityDelegate(android.view.View r1) {
                android.view.View$AccessibilityDelegate r0 = r1.getAccessibilityDelegate()
                return r0
        }

        static android.view.contentcapture.ContentCaptureSession getContentCaptureSession(android.view.View r1) {
                android.view.contentcapture.ContentCaptureSession r0 = r1.getContentCaptureSession()
                return r0
        }

        static java.util.List<android.graphics.Rect> getSystemGestureExclusionRects(android.view.View r1) {
                java.util.List r0 = r1.getSystemGestureExclusionRects()
                return r0
        }

        static void saveAttributeDataForStyleable(android.view.View r0, android.content.Context r1, int[] r2, android.util.AttributeSet r3, android.content.res.TypedArray r4, int r5, int r6) {
                r0.saveAttributeDataForStyleable(r1, r2, r3, r4, r5, r6)
                return
        }

        static void setContentCaptureSession(android.view.View r1, androidx.core.view.contentcapture.ContentCaptureSessionCompat r2) {
                if (r2 != 0) goto L4
                r0 = 0
                goto L8
            L4:
                android.view.contentcapture.ContentCaptureSession r0 = r2.toContentCaptureSession()
            L8:
                r1.setContentCaptureSession(r0)
                return
        }

        static void setSystemGestureExclusionRects(android.view.View r0, java.util.List<android.graphics.Rect> r1) {
                r0.setSystemGestureExclusionRects(r1)
                return
        }

        static void transformMatrixToGlobal(android.view.View r0, android.graphics.Matrix r1) {
                r0.transformMatrixToGlobal(r1)
                return
        }
    }

    private static class Api30Impl {
        private Api30Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static android.view.WindowInsets dispatchApplyWindowInsets(android.view.View r1, android.view.WindowInsets r2) {
                android.view.WindowInsets r0 = r1.dispatchApplyWindowInsets(r2)
                return r0
        }

        static int getImportantForContentCapture(android.view.View r1) {
                int r0 = r1.getImportantForContentCapture()
                return r0
        }

        static java.lang.CharSequence getStateDescription(android.view.View r1) {
                java.lang.CharSequence r0 = r1.getStateDescription()
                return r0
        }

        public static androidx.core.view.WindowInsetsControllerCompat getWindowInsetsController(android.view.View r2) {
                android.view.WindowInsetsController r0 = r2.getWindowInsetsController()
                if (r0 == 0) goto Lb
                androidx.core.view.WindowInsetsControllerCompat r1 = androidx.core.view.WindowInsetsControllerCompat.toWindowInsetsControllerCompat(r0)
                goto Lc
            Lb:
                r1 = 0
            Lc:
                return r1
        }

        static boolean isImportantForContentCapture(android.view.View r1) {
                boolean r0 = r1.isImportantForContentCapture()
                return r0
        }

        static void setImportantForContentCapture(android.view.View r0, int r1) {
                r0.setImportantForContentCapture(r1)
                return
        }

        static void setStateDescription(android.view.View r0, java.lang.CharSequence r1) {
                r0.setStateDescription(r1)
                return
        }
    }

    private static final class Api31Impl {
        private Api31Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        public static java.lang.String[] getReceiveContentMimeTypes(android.view.View r1) {
                java.lang.String[] r0 = r1.getReceiveContentMimeTypes()
                return r0
        }

        public static androidx.core.view.ContentInfoCompat performReceiveContent(android.view.View r3, androidx.core.view.ContentInfoCompat r4) {
                android.view.ContentInfo r0 = r4.toContentInfo()
                android.view.ContentInfo r1 = r3.performReceiveContent(r0)
                if (r1 != 0) goto Lc
                r2 = 0
                return r2
            Lc:
                if (r1 != r0) goto Lf
                return r4
            Lf:
                androidx.core.view.ContentInfoCompat r2 = androidx.core.view.ContentInfoCompat.toContentInfoCompat(r1)
                return r2
        }

        public static void setOnReceiveContentListener(android.view.View r1, java.lang.String[] r2, androidx.core.view.OnReceiveContentListener r3) {
                if (r3 != 0) goto L7
                r0 = 0
                r1.setOnReceiveContentListener(r2, r0)
                goto Lf
            L7:
                androidx.core.view.ViewCompat$OnReceiveContentListenerAdapter r0 = new androidx.core.view.ViewCompat$OnReceiveContentListenerAdapter
                r0.<init>(r3)
                r1.setOnReceiveContentListener(r2, r0)
            Lf:
                return
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface FocusDirection {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface FocusRealDirection {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface FocusRelativeDirection {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface NestedScrollType {
    }

    private static final class OnReceiveContentListenerAdapter implements android.view.OnReceiveContentListener {
        private final androidx.core.view.OnReceiveContentListener mJetpackListener;

        OnReceiveContentListenerAdapter(androidx.core.view.OnReceiveContentListener r1) {
                r0 = this;
                r0.<init>()
                r0.mJetpackListener = r1
                return
        }

        @Override // android.view.OnReceiveContentListener
        public android.view.ContentInfo onReceiveContent(android.view.View r4, android.view.ContentInfo r5) {
                r3 = this;
                androidx.core.view.ContentInfoCompat r0 = androidx.core.view.ContentInfoCompat.toContentInfoCompat(r5)
                androidx.core.view.OnReceiveContentListener r1 = r3.mJetpackListener
                androidx.core.view.ContentInfoCompat r1 = r1.onReceiveContent(r4, r0)
                if (r1 != 0) goto Le
                r2 = 0
                return r2
            Le:
                if (r1 != r0) goto L11
                return r5
            L11:
                android.view.ContentInfo r2 = r1.toContentInfo()
                return r2
        }
    }

    public interface OnUnhandledKeyEventListenerCompat {
        boolean onUnhandledKeyEvent(android.view.View r1, android.view.KeyEvent r2);
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface ScrollAxis {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface ScrollIndicators {
    }

    static class UnhandledKeyEventManager {
        private static final java.util.ArrayList<java.lang.ref.WeakReference<android.view.View>> sViewsWithListeners = null;
        private android.util.SparseArray<java.lang.ref.WeakReference<android.view.View>> mCapturedKeys;
        private java.lang.ref.WeakReference<android.view.KeyEvent> mLastDispatchedPreViewKeyEvent;
        private java.util.WeakHashMap<android.view.View, java.lang.Boolean> mViewsContainingListeners;

        static {
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                androidx.core.view.ViewCompat.UnhandledKeyEventManager.sViewsWithListeners = r0
                return
        }

        UnhandledKeyEventManager() {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.mViewsContainingListeners = r0
                r1.mCapturedKeys = r0
                r1.mLastDispatchedPreViewKeyEvent = r0
                return
        }

        static androidx.core.view.ViewCompat.UnhandledKeyEventManager at(android.view.View r2) {
                int r0 = androidx.core.R.id.tag_unhandled_key_event_manager
                java.lang.Object r0 = r2.getTag(r0)
                androidx.core.view.ViewCompat$UnhandledKeyEventManager r0 = (androidx.core.view.ViewCompat.UnhandledKeyEventManager) r0
                if (r0 != 0) goto L15
                androidx.core.view.ViewCompat$UnhandledKeyEventManager r1 = new androidx.core.view.ViewCompat$UnhandledKeyEventManager
                r1.<init>()
                r0 = r1
                int r1 = androidx.core.R.id.tag_unhandled_key_event_manager
                r2.setTag(r1, r0)
            L15:
                return r0
        }

        private android.view.View dispatchInOrder(android.view.View r6, android.view.KeyEvent r7) {
                r5 = this;
                java.util.WeakHashMap<android.view.View, java.lang.Boolean> r0 = r5.mViewsContainingListeners
                r1 = 0
                if (r0 == 0) goto L33
                java.util.WeakHashMap<android.view.View, java.lang.Boolean> r0 = r5.mViewsContainingListeners
                boolean r0 = r0.containsKey(r6)
                if (r0 != 0) goto Le
                goto L33
            Le:
                boolean r0 = r6 instanceof android.view.ViewGroup
                if (r0 == 0) goto L2b
                r0 = r6
                android.view.ViewGroup r0 = (android.view.ViewGroup) r0
                int r2 = r0.getChildCount()
                int r2 = r2 + (-1)
            L1b:
                if (r2 < 0) goto L2b
                android.view.View r3 = r0.getChildAt(r2)
                android.view.View r4 = r5.dispatchInOrder(r3, r7)
                if (r4 == 0) goto L28
                return r4
            L28:
                int r2 = r2 + (-1)
                goto L1b
            L2b:
                boolean r0 = r5.onUnhandledKeyEvent(r6, r7)
                if (r0 == 0) goto L32
                return r6
            L32:
                return r1
            L33:
                return r1
        }

        private android.util.SparseArray<java.lang.ref.WeakReference<android.view.View>> getCapturedKeys() {
                r1 = this;
                android.util.SparseArray<java.lang.ref.WeakReference<android.view.View>> r0 = r1.mCapturedKeys
                if (r0 != 0) goto Lb
                android.util.SparseArray r0 = new android.util.SparseArray
                r0.<init>()
                r1.mCapturedKeys = r0
            Lb:
                android.util.SparseArray<java.lang.ref.WeakReference<android.view.View>> r0 = r1.mCapturedKeys
                return r0
        }

        private boolean onUnhandledKeyEvent(android.view.View r5, android.view.KeyEvent r6) {
                r4 = this;
                int r0 = androidx.core.R.id.tag_unhandled_key_listeners
                java.lang.Object r0 = r5.getTag(r0)
                java.util.ArrayList r0 = (java.util.ArrayList) r0
                if (r0 == 0) goto L22
                int r1 = r0.size()
                r2 = 1
                int r1 = r1 - r2
            L10:
                if (r1 < 0) goto L22
                java.lang.Object r3 = r0.get(r1)
                androidx.core.view.ViewCompat$OnUnhandledKeyEventListenerCompat r3 = (androidx.core.view.ViewCompat.OnUnhandledKeyEventListenerCompat) r3
                boolean r3 = r3.onUnhandledKeyEvent(r5, r6)
                if (r3 == 0) goto L1f
                return r2
            L1f:
                int r1 = r1 + (-1)
                goto L10
            L22:
                r1 = 0
                return r1
        }

        private void recalcViewsWithUnhandled() {
                r8 = this;
                java.util.WeakHashMap<android.view.View, java.lang.Boolean> r0 = r8.mViewsContainingListeners
                if (r0 == 0) goto L9
                java.util.WeakHashMap<android.view.View, java.lang.Boolean> r0 = r8.mViewsContainingListeners
                r0.clear()
            L9:
                java.util.ArrayList<java.lang.ref.WeakReference<android.view.View>> r0 = androidx.core.view.ViewCompat.UnhandledKeyEventManager.sViewsWithListeners
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto L12
                return
            L12:
                java.util.ArrayList<java.lang.ref.WeakReference<android.view.View>> r0 = androidx.core.view.ViewCompat.UnhandledKeyEventManager.sViewsWithListeners
                monitor-enter(r0)
                java.util.WeakHashMap<android.view.View, java.lang.Boolean> r1 = r8.mViewsContainingListeners     // Catch: java.lang.Throwable -> L64
                if (r1 != 0) goto L20
                java.util.WeakHashMap r1 = new java.util.WeakHashMap     // Catch: java.lang.Throwable -> L64
                r1.<init>()     // Catch: java.lang.Throwable -> L64
                r8.mViewsContainingListeners = r1     // Catch: java.lang.Throwable -> L64
            L20:
                java.util.ArrayList<java.lang.ref.WeakReference<android.view.View>> r1 = androidx.core.view.ViewCompat.UnhandledKeyEventManager.sViewsWithListeners     // Catch: java.lang.Throwable -> L64
                int r1 = r1.size()     // Catch: java.lang.Throwable -> L64
                int r1 = r1 + (-1)
            L28:
                if (r1 < 0) goto L62
                java.util.ArrayList<java.lang.ref.WeakReference<android.view.View>> r2 = androidx.core.view.ViewCompat.UnhandledKeyEventManager.sViewsWithListeners     // Catch: java.lang.Throwable -> L64
                java.lang.Object r2 = r2.get(r1)     // Catch: java.lang.Throwable -> L64
                java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2     // Catch: java.lang.Throwable -> L64
                java.lang.Object r3 = r2.get()     // Catch: java.lang.Throwable -> L64
                android.view.View r3 = (android.view.View) r3     // Catch: java.lang.Throwable -> L64
                if (r3 != 0) goto L40
                java.util.ArrayList<java.lang.ref.WeakReference<android.view.View>> r4 = androidx.core.view.ViewCompat.UnhandledKeyEventManager.sViewsWithListeners     // Catch: java.lang.Throwable -> L64
                r4.remove(r1)     // Catch: java.lang.Throwable -> L64
                goto L5f
            L40:
                java.util.WeakHashMap<android.view.View, java.lang.Boolean> r4 = r8.mViewsContainingListeners     // Catch: java.lang.Throwable -> L64
                java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L64
                r4.put(r3, r5)     // Catch: java.lang.Throwable -> L64
                android.view.ViewParent r4 = r3.getParent()     // Catch: java.lang.Throwable -> L64
            L4b:
                boolean r5 = r4 instanceof android.view.View     // Catch: java.lang.Throwable -> L64
                if (r5 == 0) goto L5f
                java.util.WeakHashMap<android.view.View, java.lang.Boolean> r5 = r8.mViewsContainingListeners     // Catch: java.lang.Throwable -> L64
                r6 = r4
                android.view.View r6 = (android.view.View) r6     // Catch: java.lang.Throwable -> L64
                java.lang.Boolean r7 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L64
                r5.put(r6, r7)     // Catch: java.lang.Throwable -> L64
                android.view.ViewParent r5 = r4.getParent()     // Catch: java.lang.Throwable -> L64
                r4 = r5
                goto L4b
            L5f:
                int r1 = r1 + (-1)
                goto L28
            L62:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L64
                return
            L64:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L64
                throw r1
        }

        static void registerListeningView(android.view.View r4) {
                java.util.ArrayList<java.lang.ref.WeakReference<android.view.View>> r0 = androidx.core.view.ViewCompat.UnhandledKeyEventManager.sViewsWithListeners
                monitor-enter(r0)
                java.util.ArrayList<java.lang.ref.WeakReference<android.view.View>> r1 = androidx.core.view.ViewCompat.UnhandledKeyEventManager.sViewsWithListeners     // Catch: java.lang.Throwable -> L2a
                java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L2a
            L9:
                boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L2a
                if (r2 == 0) goto L1e
                java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L2a
                java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2     // Catch: java.lang.Throwable -> L2a
                java.lang.Object r3 = r2.get()     // Catch: java.lang.Throwable -> L2a
                if (r3 != r4) goto L1d
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L2a
                return
            L1d:
                goto L9
            L1e:
                java.util.ArrayList<java.lang.ref.WeakReference<android.view.View>> r1 = androidx.core.view.ViewCompat.UnhandledKeyEventManager.sViewsWithListeners     // Catch: java.lang.Throwable -> L2a
                java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference     // Catch: java.lang.Throwable -> L2a
                r2.<init>(r4)     // Catch: java.lang.Throwable -> L2a
                r1.add(r2)     // Catch: java.lang.Throwable -> L2a
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L2a
                return
            L2a:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L2a
                throw r1
        }

        static void unregisterListeningView(android.view.View r3) {
                java.util.ArrayList<java.lang.ref.WeakReference<android.view.View>> r0 = androidx.core.view.ViewCompat.UnhandledKeyEventManager.sViewsWithListeners
                monitor-enter(r0)
                r1 = 0
            L4:
                java.util.ArrayList<java.lang.ref.WeakReference<android.view.View>> r2 = androidx.core.view.ViewCompat.UnhandledKeyEventManager.sViewsWithListeners     // Catch: java.lang.Throwable -> L26
                int r2 = r2.size()     // Catch: java.lang.Throwable -> L26
                if (r1 >= r2) goto L24
                java.util.ArrayList<java.lang.ref.WeakReference<android.view.View>> r2 = androidx.core.view.ViewCompat.UnhandledKeyEventManager.sViewsWithListeners     // Catch: java.lang.Throwable -> L26
                java.lang.Object r2 = r2.get(r1)     // Catch: java.lang.Throwable -> L26
                java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2     // Catch: java.lang.Throwable -> L26
                java.lang.Object r2 = r2.get()     // Catch: java.lang.Throwable -> L26
                if (r2 != r3) goto L21
                java.util.ArrayList<java.lang.ref.WeakReference<android.view.View>> r2 = androidx.core.view.ViewCompat.UnhandledKeyEventManager.sViewsWithListeners     // Catch: java.lang.Throwable -> L26
                r2.remove(r1)     // Catch: java.lang.Throwable -> L26
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L26
                return
            L21:
                int r1 = r1 + 1
                goto L4
            L24:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L26
                return
            L26:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L26
                throw r1
        }

        boolean dispatch(android.view.View r5, android.view.KeyEvent r6) {
                r4 = this;
                int r0 = r6.getAction()
                if (r0 != 0) goto L9
                r4.recalcViewsWithUnhandled()
            L9:
                android.view.View r0 = r4.dispatchInOrder(r5, r6)
                int r1 = r6.getAction()
                if (r1 != 0) goto L2b
                int r1 = r6.getKeyCode()
                if (r0 == 0) goto L2b
                boolean r2 = android.view.KeyEvent.isModifierKey(r1)
                if (r2 != 0) goto L2b
                android.util.SparseArray r2 = r4.getCapturedKeys()
                java.lang.ref.WeakReference r3 = new java.lang.ref.WeakReference
                r3.<init>(r0)
                r2.put(r1, r3)
            L2b:
                if (r0 == 0) goto L2f
                r1 = 1
                goto L30
            L2f:
                r1 = 0
            L30:
                return r1
        }

        boolean preDispatch(android.view.KeyEvent r7) {
                r6 = this;
                java.lang.ref.WeakReference<android.view.KeyEvent> r0 = r6.mLastDispatchedPreViewKeyEvent
                r1 = 0
                if (r0 == 0) goto Le
                java.lang.ref.WeakReference<android.view.KeyEvent> r0 = r6.mLastDispatchedPreViewKeyEvent
                java.lang.Object r0 = r0.get()
                if (r0 != r7) goto Le
                return r1
            Le:
                java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
                r0.<init>(r7)
                r6.mLastDispatchedPreViewKeyEvent = r0
                r0 = 0
                android.util.SparseArray r2 = r6.getCapturedKeys()
                int r3 = r7.getAction()
                r4 = 1
                if (r3 != r4) goto L35
                int r3 = r7.getKeyCode()
                int r3 = r2.indexOfKey(r3)
                if (r3 < 0) goto L35
                java.lang.Object r5 = r2.valueAt(r3)
                r0 = r5
                java.lang.ref.WeakReference r0 = (java.lang.ref.WeakReference) r0
                r2.removeAt(r3)
            L35:
                if (r0 != 0) goto L42
                int r3 = r7.getKeyCode()
                java.lang.Object r3 = r2.get(r3)
                r0 = r3
                java.lang.ref.WeakReference r0 = (java.lang.ref.WeakReference) r0
            L42:
                if (r0 == 0) goto L56
                java.lang.Object r1 = r0.get()
                android.view.View r1 = (android.view.View) r1
                if (r1 == 0) goto L55
                boolean r3 = r1.isAttachedToWindow()
                if (r3 == 0) goto L55
                r6.onUnhandledKeyEvent(r1, r7)
            L55:
                return r4
            L56:
                return r1
        }
    }

    static {
            r0 = 0
            androidx.core.view.ViewCompat.sViewPropertyAnimatorMap = r0
            r0 = 0
            androidx.core.view.ViewCompat.sAccessibilityDelegateCheckFailed = r0
            r0 = 1
            androidx.core.view.ViewCompat.sTryHiddenViewTransformMatrixToGlobal = r0
            int r1 = androidx.core.R.id.accessibility_custom_action_0
            int r2 = androidx.core.R.id.accessibility_custom_action_1
            int r3 = androidx.core.R.id.accessibility_custom_action_2
            int r4 = androidx.core.R.id.accessibility_custom_action_3
            int r5 = androidx.core.R.id.accessibility_custom_action_4
            int r6 = androidx.core.R.id.accessibility_custom_action_5
            int r7 = androidx.core.R.id.accessibility_custom_action_6
            int r8 = androidx.core.R.id.accessibility_custom_action_7
            int r9 = androidx.core.R.id.accessibility_custom_action_8
            int r10 = androidx.core.R.id.accessibility_custom_action_9
            int r11 = androidx.core.R.id.accessibility_custom_action_10
            int r12 = androidx.core.R.id.accessibility_custom_action_11
            int r13 = androidx.core.R.id.accessibility_custom_action_12
            int r14 = androidx.core.R.id.accessibility_custom_action_13
            int r15 = androidx.core.R.id.accessibility_custom_action_14
            int r16 = androidx.core.R.id.accessibility_custom_action_15
            int r17 = androidx.core.R.id.accessibility_custom_action_16
            int r18 = androidx.core.R.id.accessibility_custom_action_17
            int r19 = androidx.core.R.id.accessibility_custom_action_18
            int r20 = androidx.core.R.id.accessibility_custom_action_19
            int r21 = androidx.core.R.id.accessibility_custom_action_20
            int r22 = androidx.core.R.id.accessibility_custom_action_21
            int r23 = androidx.core.R.id.accessibility_custom_action_22
            int r24 = androidx.core.R.id.accessibility_custom_action_23
            int r25 = androidx.core.R.id.accessibility_custom_action_24
            int r26 = androidx.core.R.id.accessibility_custom_action_25
            int r27 = androidx.core.R.id.accessibility_custom_action_26
            int r28 = androidx.core.R.id.accessibility_custom_action_27
            int r29 = androidx.core.R.id.accessibility_custom_action_28
            int r30 = androidx.core.R.id.accessibility_custom_action_29
            int r31 = androidx.core.R.id.accessibility_custom_action_30
            int r32 = androidx.core.R.id.accessibility_custom_action_31
            int[] r0 = new int[]{r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32}
            androidx.core.view.ViewCompat.ACCESSIBILITY_ACTIONS_RESOURCE_IDS = r0
            androidx.core.view.ViewCompat$$ExternalSyntheticLambda0 r0 = new androidx.core.view.ViewCompat$$ExternalSyntheticLambda0
            r0.<init>()
            androidx.core.view.ViewCompat.NO_OP_ON_RECEIVE_CONTENT_VIEW_BEHAVIOR = r0
            androidx.core.view.ViewCompat$AccessibilityPaneVisibilityManager r0 = new androidx.core.view.ViewCompat$AccessibilityPaneVisibilityManager
            r0.<init>()
            androidx.core.view.ViewCompat.sAccessibilityPaneVisibilityManager = r0
            return
    }

    @java.lang.Deprecated
    protected ViewCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    private static androidx.core.view.ViewCompat.AccessibilityViewProperty<java.lang.Boolean> accessibilityHeadingProperty() {
            androidx.core.view.ViewCompat$4 r0 = new androidx.core.view.ViewCompat$4
            int r1 = androidx.core.R.id.tag_accessibility_heading
            java.lang.Class<java.lang.Boolean> r2 = java.lang.Boolean.class
            r3 = 28
            r0.<init>(r1, r2, r3)
            return r0
    }

    public static int addAccessibilityAction(android.view.View r2, java.lang.CharSequence r3, androidx.core.view.accessibility.AccessibilityViewCommand r4) {
            int r0 = getAvailableActionIdFromResources(r2, r3)
            r1 = -1
            if (r0 == r1) goto Lf
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r1 = new androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat
            r1.<init>(r0, r3, r4)
            addAccessibilityAction(r2, r1)
        Lf:
            return r0
    }

    private static void addAccessibilityAction(android.view.View r1, androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat r2) {
            ensureAccessibilityDelegateCompat(r1)
            int r0 = r2.getId()
            removeActionWithId(r0, r1)
            java.util.List r0 = getActionList(r1)
            r0.add(r2)
            r0 = 0
            notifyViewAccessibilityStateChangedIfNeeded(r1, r0)
            return
    }

    public static void addKeyboardNavigationClusters(android.view.View r2, java.util.Collection<android.view.View> r3, int r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L9
            androidx.core.view.ViewCompat.Api26Impl.addKeyboardNavigationClusters(r2, r3, r4)
        L9:
            return
    }

    public static void addOnUnhandledKeyEventListener(android.view.View r3, androidx.core.view.ViewCompat.OnUnhandledKeyEventListenerCompat r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto La
            androidx.core.view.ViewCompat.Api28Impl.addOnUnhandledKeyEventListener(r3, r4)
            return
        La:
            int r0 = androidx.core.R.id.tag_unhandled_key_listeners
            java.lang.Object r0 = r3.getTag(r0)
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            if (r0 != 0) goto L1f
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0 = r1
            int r1 = androidx.core.R.id.tag_unhandled_key_listeners
            r3.setTag(r1, r0)
        L1f:
            r0.add(r4)
            int r1 = r0.size()
            r2 = 1
            if (r1 != r2) goto L2c
            androidx.core.view.ViewCompat.UnhandledKeyEventManager.registerListeningView(r3)
        L2c:
            return
    }

    public static void addOverlayView(android.view.ViewGroup r1, android.view.View r2) {
            android.view.ViewGroupOverlay r0 = r1.getOverlay()
            r0.add(r2)
            android.view.ViewParent r0 = r2.getParent()
            android.view.View r0 = (android.view.View) r0
            androidx.core.viewtree.ViewTree.setViewTreeDisjointParent(r0, r1)
            return
    }

    @java.lang.Deprecated
    public static androidx.core.view.ViewPropertyAnimatorCompat animate(android.view.View r2) {
            java.util.WeakHashMap<android.view.View, androidx.core.view.ViewPropertyAnimatorCompat> r0 = androidx.core.view.ViewCompat.sViewPropertyAnimatorMap
            if (r0 != 0) goto Lb
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            androidx.core.view.ViewCompat.sViewPropertyAnimatorMap = r0
        Lb:
            java.util.WeakHashMap<android.view.View, androidx.core.view.ViewPropertyAnimatorCompat> r0 = androidx.core.view.ViewCompat.sViewPropertyAnimatorMap
            java.lang.Object r0 = r0.get(r2)
            androidx.core.view.ViewPropertyAnimatorCompat r0 = (androidx.core.view.ViewPropertyAnimatorCompat) r0
            if (r0 != 0) goto L20
            androidx.core.view.ViewPropertyAnimatorCompat r1 = new androidx.core.view.ViewPropertyAnimatorCompat
            r1.<init>(r2)
            r0 = r1
            java.util.WeakHashMap<android.view.View, androidx.core.view.ViewPropertyAnimatorCompat> r1 = androidx.core.view.ViewCompat.sViewPropertyAnimatorMap
            r1.put(r2, r0)
        L20:
            return r0
    }

    private static void bindTempDetach() {
            java.lang.Class<android.view.View> r0 = android.view.View.class
            java.lang.String r1 = "dispatchStartTemporaryDetach"
            r2 = 0
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch: java.lang.NoSuchMethodException -> L1a
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r3)     // Catch: java.lang.NoSuchMethodException -> L1a
            androidx.core.view.ViewCompat.sDispatchStartTemporaryDetach = r0     // Catch: java.lang.NoSuchMethodException -> L1a
            java.lang.Class<android.view.View> r0 = android.view.View.class
            java.lang.String r1 = "dispatchFinishTemporaryDetach"
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.NoSuchMethodException -> L1a
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r2)     // Catch: java.lang.NoSuchMethodException -> L1a
            androidx.core.view.ViewCompat.sDispatchFinishTemporaryDetach = r0     // Catch: java.lang.NoSuchMethodException -> L1a
            goto L22
        L1a:
            r0 = move-exception
            java.lang.String r1 = "ViewCompat"
            java.lang.String r2 = "Couldn't find method"
            android.util.Log.e(r1, r2, r0)
        L22:
            r0 = 1
            androidx.core.view.ViewCompat.sTempDetachBound = r0
            return
    }

    @androidx.annotation.ReplaceWith(expression = "view.canScrollHorizontally(direction)")
    @java.lang.Deprecated
    public static boolean canScrollHorizontally(android.view.View r1, int r2) {
            boolean r0 = r1.canScrollHorizontally(r2)
            return r0
    }

    @androidx.annotation.ReplaceWith(expression = "view.canScrollVertically(direction)")
    @java.lang.Deprecated
    public static boolean canScrollVertically(android.view.View r1, int r2) {
            boolean r0 = r1.canScrollVertically(r2)
            return r0
    }

    public static void cancelDragAndDrop(android.view.View r0) {
            androidx.core.view.ViewCompat.Api24Impl.cancelDragAndDrop(r0)
            return
    }

    @java.lang.Deprecated
    public static int combineMeasuredStates(int r1, int r2) {
            int r0 = android.view.View.combineMeasuredStates(r1, r2)
            return r0
    }

    private static void compatOffsetLeftAndRight(android.view.View r2, int r3) {
            r2.offsetLeftAndRight(r3)
            int r0 = r2.getVisibility()
            if (r0 != 0) goto L1a
            tickleInvalidationFlag(r2)
            android.view.ViewParent r0 = r2.getParent()
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L1a
            r1 = r0
            android.view.View r1 = (android.view.View) r1
            tickleInvalidationFlag(r1)
        L1a:
            return
    }

    private static void compatOffsetTopAndBottom(android.view.View r2, int r3) {
            r2.offsetTopAndBottom(r3)
            int r0 = r2.getVisibility()
            if (r0 != 0) goto L1a
            tickleInvalidationFlag(r2)
            android.view.ViewParent r0 = r2.getParent()
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L1a
            r1 = r0
            android.view.View r1 = (android.view.View) r1
            tickleInvalidationFlag(r1)
        L1a:
            return
    }

    public static androidx.core.view.WindowInsetsCompat computeSystemWindowInsets(android.view.View r1, androidx.core.view.WindowInsetsCompat r2, android.graphics.Rect r3) {
            androidx.core.view.WindowInsetsCompat r0 = androidx.core.view.ViewCompat.Api21Impl.computeSystemWindowInsets(r1, r2, r3)
            return r0
    }

    public static androidx.core.view.WindowInsetsCompat dispatchApplyWindowInsets(android.view.View r3, androidx.core.view.WindowInsetsCompat r4) {
            android.view.WindowInsets r0 = r4.toWindowInsets()
            if (r0 == 0) goto L22
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 30
            if (r1 < r2) goto L12
            android.view.WindowInsets r1 = androidx.core.view.ViewCompat.Api30Impl.dispatchApplyWindowInsets(r3, r0)
            goto L16
        L12:
            android.view.WindowInsets r1 = androidx.core.view.ViewCompat.Api20Impl.dispatchApplyWindowInsets(r3, r0)
        L16:
            boolean r2 = r1.equals(r0)
            if (r2 != 0) goto L22
            androidx.core.view.WindowInsetsCompat r2 = androidx.core.view.WindowInsetsCompat.toWindowInsetsCompat(r1, r3)
            return r2
        L22:
            return r4
    }

    public static void dispatchFinishTemporaryDetach(android.view.View r0) {
            androidx.core.view.ViewCompat.Api24Impl.dispatchFinishTemporaryDetach(r0)
            return
    }

    public static boolean dispatchNestedFling(android.view.View r1, float r2, float r3, boolean r4) {
            boolean r0 = androidx.core.view.ViewCompat.Api21Impl.dispatchNestedFling(r1, r2, r3, r4)
            return r0
    }

    public static boolean dispatchNestedPreFling(android.view.View r1, float r2, float r3) {
            boolean r0 = androidx.core.view.ViewCompat.Api21Impl.dispatchNestedPreFling(r1, r2, r3)
            return r0
    }

    public static boolean dispatchNestedPreScroll(android.view.View r1, int r2, int r3, int[] r4, int[] r5) {
            boolean r0 = androidx.core.view.ViewCompat.Api21Impl.dispatchNestedPreScroll(r1, r2, r3, r4, r5)
            return r0
    }

    public static boolean dispatchNestedPreScroll(android.view.View r7, int r8, int r9, int[] r10, int[] r11, int r12) {
            boolean r0 = r7 instanceof androidx.core.view.NestedScrollingChild2
            if (r0 == 0) goto L11
            r1 = r7
            androidx.core.view.NestedScrollingChild2 r1 = (androidx.core.view.NestedScrollingChild2) r1
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            boolean r8 = r1.dispatchNestedPreScroll(r2, r3, r4, r5, r6)
            return r8
        L11:
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            if (r6 != 0) goto L1d
            boolean r8 = dispatchNestedPreScroll(r7, r2, r3, r4, r5)
            return r8
        L1d:
            r8 = 0
            return r8
    }

    public static void dispatchNestedScroll(android.view.View r9, int r10, int r11, int r12, int r13, int[] r14, int r15, int[] r16) {
            boolean r0 = r9 instanceof androidx.core.view.NestedScrollingChild3
            if (r0 == 0) goto L13
            r1 = r9
            androidx.core.view.NestedScrollingChild3 r1 = (androidx.core.view.NestedScrollingChild3) r1
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            r7 = r15
            r8 = r16
            r1.dispatchNestedScroll(r2, r3, r4, r5, r6, r7, r8)
            goto L16
        L13:
            dispatchNestedScroll(r9, r10, r11, r12, r13, r14, r15)
        L16:
            return
    }

    public static boolean dispatchNestedScroll(android.view.View r1, int r2, int r3, int r4, int r5, int[] r6) {
            boolean r0 = androidx.core.view.ViewCompat.Api21Impl.dispatchNestedScroll(r1, r2, r3, r4, r5, r6)
            return r0
    }

    public static boolean dispatchNestedScroll(android.view.View r8, int r9, int r10, int r11, int r12, int[] r13, int r14) {
            boolean r0 = r8 instanceof androidx.core.view.NestedScrollingChild2
            if (r0 == 0) goto L17
            r1 = r8
            androidx.core.view.NestedScrollingChild2 r1 = (androidx.core.view.NestedScrollingChild2) r1
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            boolean r9 = r1.dispatchNestedScroll(r2, r3, r4, r5, r6, r7)
            r1 = r2
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            return r9
        L17:
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r7 = r14
            if (r7 != 0) goto L25
            r0 = r8
            boolean r8 = dispatchNestedScroll(r0, r1, r2, r3, r4, r5)
            return r8
        L25:
            r0 = r8
            r8 = 0
            return r8
    }

    public static void dispatchStartTemporaryDetach(android.view.View r0) {
            androidx.core.view.ViewCompat.Api24Impl.dispatchStartTemporaryDetach(r0)
            return
    }

    static boolean dispatchUnhandledKeyEventBeforeCallback(android.view.View r2, android.view.KeyEvent r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L8
            r0 = 0
            return r0
        L8:
            androidx.core.view.ViewCompat$UnhandledKeyEventManager r0 = androidx.core.view.ViewCompat.UnhandledKeyEventManager.at(r2)
            boolean r0 = r0.dispatch(r2, r3)
            return r0
    }

    static boolean dispatchUnhandledKeyEventBeforeHierarchy(android.view.View r2, android.view.KeyEvent r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L8
            r0 = 0
            return r0
        L8:
            androidx.core.view.ViewCompat$UnhandledKeyEventManager r0 = androidx.core.view.ViewCompat.UnhandledKeyEventManager.at(r2)
            boolean r0 = r0.preDispatch(r3)
            return r0
    }

    public static void enableAccessibleClickableSpanSupport(android.view.View r0) {
            ensureAccessibilityDelegateCompat(r0)
            return
    }

    static void ensureAccessibilityDelegateCompat(android.view.View r2) {
            androidx.core.view.AccessibilityDelegateCompat r0 = getAccessibilityDelegate(r2)
            if (r0 != 0) goto Lc
            androidx.core.view.AccessibilityDelegateCompat r1 = new androidx.core.view.AccessibilityDelegateCompat
            r1.<init>()
            r0 = r1
        Lc:
            setAccessibilityDelegate(r2, r0)
            return
    }

    static void fallbackTransformMatrixToGlobal(android.view.View r4, android.graphics.Matrix r5) {
            android.view.ViewParent r0 = r4.getParent()
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L1d
            r1 = r0
            android.view.View r1 = (android.view.View) r1
            fallbackTransformMatrixToGlobal(r1, r5)
            int r2 = r1.getScrollX()
            int r2 = -r2
            float r2 = (float) r2
            int r3 = r1.getScrollY()
            int r3 = -r3
            float r3 = (float) r3
            r5.preTranslate(r2, r3)
        L1d:
            int r1 = r4.getLeft()
            float r1 = (float) r1
            int r2 = r4.getTop()
            float r2 = (float) r2
            r5.preTranslate(r1, r2)
            android.graphics.Matrix r1 = r4.getMatrix()
            r5.preConcat(r1)
            return
    }

    @java.lang.Deprecated
    public static int generateViewId() {
            int r0 = android.view.View.generateViewId()
            return r0
    }

    public static androidx.core.view.AccessibilityDelegateCompat getAccessibilityDelegate(android.view.View r2) {
            android.view.View$AccessibilityDelegate r0 = getAccessibilityDelegateInternal(r2)
            if (r0 != 0) goto L8
            r1 = 0
            return r1
        L8:
            boolean r1 = r0 instanceof androidx.core.view.AccessibilityDelegateCompat.AccessibilityDelegateAdapter
            if (r1 == 0) goto L12
            r1 = r0
            androidx.core.view.AccessibilityDelegateCompat$AccessibilityDelegateAdapter r1 = (androidx.core.view.AccessibilityDelegateCompat.AccessibilityDelegateAdapter) r1
            androidx.core.view.AccessibilityDelegateCompat r1 = r1.mCompat
            return r1
        L12:
            androidx.core.view.AccessibilityDelegateCompat r1 = new androidx.core.view.AccessibilityDelegateCompat
            r1.<init>(r0)
            return r1
    }

    private static android.view.View.AccessibilityDelegate getAccessibilityDelegateInternal(android.view.View r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto Lb
            android.view.View$AccessibilityDelegate r0 = androidx.core.view.ViewCompat.Api29Impl.getAccessibilityDelegate(r2)
            return r0
        Lb:
            android.view.View$AccessibilityDelegate r0 = getAccessibilityDelegateThroughReflection(r2)
            return r0
    }

    private static android.view.View.AccessibilityDelegate getAccessibilityDelegateThroughReflection(android.view.View r4) {
            boolean r0 = androidx.core.view.ViewCompat.sAccessibilityDelegateCheckFailed
            r1 = 0
            if (r0 == 0) goto L6
            return r1
        L6:
            java.lang.reflect.Field r0 = androidx.core.view.ViewCompat.sAccessibilityDelegateField
            r2 = 1
            if (r0 != 0) goto L1f
            java.lang.Class<android.view.View> r0 = android.view.View.class
            java.lang.String r3 = "mAccessibilityDelegate"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r3)     // Catch: java.lang.Throwable -> L1b
            androidx.core.view.ViewCompat.sAccessibilityDelegateField = r0     // Catch: java.lang.Throwable -> L1b
            java.lang.reflect.Field r0 = androidx.core.view.ViewCompat.sAccessibilityDelegateField     // Catch: java.lang.Throwable -> L1b
            r0.setAccessible(r2)     // Catch: java.lang.Throwable -> L1b
            goto L1f
        L1b:
            r0 = move-exception
            androidx.core.view.ViewCompat.sAccessibilityDelegateCheckFailed = r2
            return r1
        L1f:
            java.lang.reflect.Field r0 = androidx.core.view.ViewCompat.sAccessibilityDelegateField     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r0 = r0.get(r4)     // Catch: java.lang.Throwable -> L2e
            boolean r3 = r0 instanceof android.view.View.AccessibilityDelegate     // Catch: java.lang.Throwable -> L2e
            if (r3 == 0) goto L2d
            r3 = r0
            android.view.View$AccessibilityDelegate r3 = (android.view.View.AccessibilityDelegate) r3     // Catch: java.lang.Throwable -> L2e
            return r3
        L2d:
            return r1
        L2e:
            r0 = move-exception
            androidx.core.view.ViewCompat.sAccessibilityDelegateCheckFailed = r2
            return r1
    }

    @androidx.annotation.ReplaceWith(expression = "view.getAccessibilityLiveRegion()")
    @java.lang.Deprecated
    public static int getAccessibilityLiveRegion(android.view.View r1) {
            int r0 = r1.getAccessibilityLiveRegion()
            return r0
    }

    public static androidx.core.view.accessibility.AccessibilityNodeProviderCompat getAccessibilityNodeProvider(android.view.View r2) {
            android.view.accessibility.AccessibilityNodeProvider r0 = r2.getAccessibilityNodeProvider()
            if (r0 == 0) goto Lc
            androidx.core.view.accessibility.AccessibilityNodeProviderCompat r1 = new androidx.core.view.accessibility.AccessibilityNodeProviderCompat
            r1.<init>(r0)
            return r1
        Lc:
            r1 = 0
            return r1
    }

    public static java.lang.CharSequence getAccessibilityPaneTitle(android.view.View r1) {
            androidx.core.view.ViewCompat$AccessibilityViewProperty r0 = paneTitleProperty()
            java.lang.Object r0 = r0.get(r1)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            return r0
    }

    private static java.util.List<androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat> getActionList(android.view.View r2) {
            int r0 = androidx.core.R.id.tag_accessibility_actions
            java.lang.Object r0 = r2.getTag(r0)
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            if (r0 != 0) goto L15
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0 = r1
            int r1 = androidx.core.R.id.tag_accessibility_actions
            r2.setTag(r1, r0)
        L15:
            return r0
    }

    @androidx.annotation.ReplaceWith(expression = "view.getAlpha()")
    @java.lang.Deprecated
    public static float getAlpha(android.view.View r1) {
            float r0 = r1.getAlpha()
            return r0
    }

    public static androidx.core.view.autofill.AutofillIdCompat getAutofillId(android.view.View r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto Lf
            android.view.autofill.AutofillId r0 = androidx.core.view.ViewCompat.Api26Impl.getAutofillId(r2)
            androidx.core.view.autofill.AutofillIdCompat r0 = androidx.core.view.autofill.AutofillIdCompat.toAutofillIdCompat(r0)
            return r0
        Lf:
            r0 = 0
            return r0
    }

    private static int getAvailableActionIdFromResources(android.view.View r7, java.lang.CharSequence r8) {
            r0 = -1
            java.util.List r1 = getActionList(r7)
            r2 = 0
        L6:
            int r3 = r1.size()
            if (r2 >= r3) goto L2a
            java.lang.Object r3 = r1.get(r2)
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r3 = (androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat) r3
            java.lang.CharSequence r3 = r3.getLabel()
            boolean r3 = android.text.TextUtils.equals(r8, r3)
            if (r3 == 0) goto L27
            java.lang.Object r3 = r1.get(r2)
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r3 = (androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat) r3
            int r3 = r3.getId()
            return r3
        L27:
            int r2 = r2 + 1
            goto L6
        L2a:
            r2 = 0
        L2b:
            int[] r3 = androidx.core.view.ViewCompat.ACCESSIBILITY_ACTIONS_RESOURCE_IDS
            int r3 = r3.length
            if (r2 >= r3) goto L58
            r3 = -1
            if (r0 != r3) goto L58
            int[] r3 = androidx.core.view.ViewCompat.ACCESSIBILITY_ACTIONS_RESOURCE_IDS
            r3 = r3[r2]
            r4 = 1
            r5 = 0
        L39:
            int r6 = r1.size()
            if (r5 >= r6) goto L52
            java.lang.Object r6 = r1.get(r5)
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r6 = (androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat) r6
            int r6 = r6.getId()
            if (r6 == r3) goto L4d
            r6 = 1
            goto L4e
        L4d:
            r6 = 0
        L4e:
            r4 = r4 & r6
            int r5 = r5 + 1
            goto L39
        L52:
            if (r4 == 0) goto L55
            r0 = r3
        L55:
            int r2 = r2 + 1
            goto L2b
        L58:
            return r0
    }

    public static android.content.res.ColorStateList getBackgroundTintList(android.view.View r1) {
            android.content.res.ColorStateList r0 = androidx.core.view.ViewCompat.Api21Impl.getBackgroundTintList(r1)
            return r0
    }

    public static android.graphics.PorterDuff.Mode getBackgroundTintMode(android.view.View r1) {
            android.graphics.PorterDuff$Mode r0 = androidx.core.view.ViewCompat.Api21Impl.getBackgroundTintMode(r1)
            return r0
    }

    @androidx.annotation.ReplaceWith(expression = "view.getClipBounds()")
    @java.lang.Deprecated
    public static android.graphics.Rect getClipBounds(android.view.View r1) {
            android.graphics.Rect r0 = r1.getClipBounds()
            return r0
    }

    public static androidx.core.view.contentcapture.ContentCaptureSessionCompat getContentCaptureSession(android.view.View r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            r2 = 0
            if (r0 < r1) goto L13
            android.view.contentcapture.ContentCaptureSession r0 = androidx.core.view.ViewCompat.Api29Impl.getContentCaptureSession(r3)
            if (r0 != 0) goto Le
            return r2
        Le:
            androidx.core.view.contentcapture.ContentCaptureSessionCompat r1 = androidx.core.view.contentcapture.ContentCaptureSessionCompat.toContentCaptureSessionCompat(r0, r3)
            return r1
        L13:
            return r2
    }

    @androidx.annotation.ReplaceWith(expression = "view.getDisplay()")
    @java.lang.Deprecated
    public static android.view.Display getDisplay(android.view.View r1) {
            android.view.Display r0 = r1.getDisplay()
            return r0
    }

    public static float getElevation(android.view.View r1) {
            float r0 = androidx.core.view.ViewCompat.Api21Impl.getElevation(r1)
            return r0
    }

    private static android.graphics.Rect getEmptyTempRect() {
            java.lang.ThreadLocal<android.graphics.Rect> r0 = androidx.core.view.ViewCompat.sThreadLocalRect
            if (r0 != 0) goto Lb
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            androidx.core.view.ViewCompat.sThreadLocalRect = r0
        Lb:
            java.lang.ThreadLocal<android.graphics.Rect> r0 = androidx.core.view.ViewCompat.sThreadLocalRect
            java.lang.Object r0 = r0.get()
            android.graphics.Rect r0 = (android.graphics.Rect) r0
            if (r0 != 0) goto L20
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0 = r1
            java.lang.ThreadLocal<android.graphics.Rect> r1 = androidx.core.view.ViewCompat.sThreadLocalRect
            r1.set(r0)
        L20:
            r0.setEmpty()
            return r0
    }

    private static androidx.core.view.OnReceiveContentViewBehavior getFallback(android.view.View r1) {
            boolean r0 = r1 instanceof androidx.core.view.OnReceiveContentViewBehavior
            if (r0 == 0) goto L8
            r0 = r1
            androidx.core.view.OnReceiveContentViewBehavior r0 = (androidx.core.view.OnReceiveContentViewBehavior) r0
            return r0
        L8:
            androidx.core.view.OnReceiveContentViewBehavior r0 = androidx.core.view.ViewCompat.NO_OP_ON_RECEIVE_CONTENT_VIEW_BEHAVIOR
            return r0
    }

    @androidx.annotation.ReplaceWith(expression = "view.getFitsSystemWindows()")
    @java.lang.Deprecated
    public static boolean getFitsSystemWindows(android.view.View r1) {
            boolean r0 = r1.getFitsSystemWindows()
            return r0
    }

    @androidx.annotation.ReplaceWith(expression = "view.getImportantForAccessibility()")
    @java.lang.Deprecated
    public static int getImportantForAccessibility(android.view.View r1) {
            int r0 = r1.getImportantForAccessibility()
            return r0
    }

    public static int getImportantForAutofill(android.view.View r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto Lb
            int r0 = androidx.core.view.ViewCompat.Api26Impl.getImportantForAutofill(r2)
            return r0
        Lb:
            r0 = 0
            return r0
    }

    public static int getImportantForContentCapture(android.view.View r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto Lb
            int r0 = androidx.core.view.ViewCompat.Api30Impl.getImportantForContentCapture(r2)
            return r0
        Lb:
            r0 = 0
            return r0
    }

    @androidx.annotation.ReplaceWith(expression = "view.getLabelFor()")
    @java.lang.Deprecated
    public static int getLabelFor(android.view.View r1) {
            int r0 = r1.getLabelFor()
            return r0
    }

    @androidx.annotation.ReplaceWith(expression = "view.getLayerType()")
    @java.lang.Deprecated
    public static int getLayerType(android.view.View r1) {
            int r0 = r1.getLayerType()
            return r0
    }

    @androidx.annotation.ReplaceWith(expression = "view.getLayoutDirection()")
    @java.lang.Deprecated
    public static int getLayoutDirection(android.view.View r1) {
            int r0 = r1.getLayoutDirection()
            return r0
    }

    @androidx.annotation.ReplaceWith(expression = "view.getMatrix()")
    @java.lang.Deprecated
    public static android.graphics.Matrix getMatrix(android.view.View r1) {
            android.graphics.Matrix r0 = r1.getMatrix()
            return r0
    }

    @androidx.annotation.ReplaceWith(expression = "view.getMeasuredHeightAndState()")
    @java.lang.Deprecated
    public static int getMeasuredHeightAndState(android.view.View r1) {
            int r0 = r1.getMeasuredHeightAndState()
            return r0
    }

    @androidx.annotation.ReplaceWith(expression = "view.getMeasuredState()")
    @java.lang.Deprecated
    public static int getMeasuredState(android.view.View r1) {
            int r0 = r1.getMeasuredState()
            return r0
    }

    @androidx.annotation.ReplaceWith(expression = "view.getMeasuredWidthAndState()")
    @java.lang.Deprecated
    public static int getMeasuredWidthAndState(android.view.View r1) {
            int r0 = r1.getMeasuredWidthAndState()
            return r0
    }

    @androidx.annotation.ReplaceWith(expression = "view.getMinimumHeight()")
    @java.lang.Deprecated
    public static int getMinimumHeight(android.view.View r1) {
            int r0 = r1.getMinimumHeight()
            return r0
    }

    @androidx.annotation.ReplaceWith(expression = "view.getMinimumWidth()")
    @java.lang.Deprecated
    public static int getMinimumWidth(android.view.View r1) {
            int r0 = r1.getMinimumWidth()
            return r0
    }

    public static int getNextClusterForwardId(android.view.View r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto Lb
            int r0 = androidx.core.view.ViewCompat.Api26Impl.getNextClusterForwardId(r2)
            return r0
        Lb:
            r0 = -1
            return r0
    }

    public static java.lang.String[] getOnReceiveContentMimeTypes(android.view.View r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r0 < r1) goto Lb
            java.lang.String[] r0 = androidx.core.view.ViewCompat.Api31Impl.getReceiveContentMimeTypes(r2)
            return r0
        Lb:
            int r0 = androidx.core.R.id.tag_on_receive_content_mime_types
            java.lang.Object r0 = r2.getTag(r0)
            java.lang.String[] r0 = (java.lang.String[]) r0
            return r0
    }

    @androidx.annotation.ReplaceWith(expression = "view.getOverScrollMode()")
    @java.lang.Deprecated
    public static int getOverScrollMode(android.view.View r1) {
            int r0 = r1.getOverScrollMode()
            return r0
    }

    @androidx.annotation.ReplaceWith(expression = "view.getPaddingEnd()")
    @java.lang.Deprecated
    public static int getPaddingEnd(android.view.View r1) {
            int r0 = r1.getPaddingEnd()
            return r0
    }

    @androidx.annotation.ReplaceWith(expression = "view.getPaddingStart()")
    @java.lang.Deprecated
    public static int getPaddingStart(android.view.View r1) {
            int r0 = r1.getPaddingStart()
            return r0
    }

    @androidx.annotation.ReplaceWith(expression = "view.getParentForAccessibility()")
    @java.lang.Deprecated
    public static android.view.ViewParent getParentForAccessibility(android.view.View r1) {
            android.view.ViewParent r0 = r1.getParentForAccessibility()
            return r0
    }

    @androidx.annotation.ReplaceWith(expression = "view.getPivotX()")
    @java.lang.Deprecated
    public static float getPivotX(android.view.View r1) {
            float r0 = r1.getPivotX()
            return r0
    }

    @androidx.annotation.ReplaceWith(expression = "view.getPivotY()")
    @java.lang.Deprecated
    public static float getPivotY(android.view.View r1) {
            float r0 = r1.getPivotY()
            return r0
    }

    public static androidx.core.view.WindowInsetsCompat getRootWindowInsets(android.view.View r1) {
            androidx.core.view.WindowInsetsCompat r0 = androidx.core.view.ViewCompat.Api23Impl.getRootWindowInsets(r1)
            return r0
    }

    @androidx.annotation.ReplaceWith(expression = "view.getRotation()")
    @java.lang.Deprecated
    public static float getRotation(android.view.View r1) {
            float r0 = r1.getRotation()
            return r0
    }

    @androidx.annotation.ReplaceWith(expression = "view.getRotationX()")
    @java.lang.Deprecated
    public static float getRotationX(android.view.View r1) {
            float r0 = r1.getRotationX()
            return r0
    }

    @androidx.annotation.ReplaceWith(expression = "view.getRotationY()")
    @java.lang.Deprecated
    public static float getRotationY(android.view.View r1) {
            float r0 = r1.getRotationY()
            return r0
    }

    @androidx.annotation.ReplaceWith(expression = "view.getScaleX()")
    @java.lang.Deprecated
    public static float getScaleX(android.view.View r1) {
            float r0 = r1.getScaleX()
            return r0
    }

    @androidx.annotation.ReplaceWith(expression = "view.getScaleY()")
    @java.lang.Deprecated
    public static float getScaleY(android.view.View r1) {
            float r0 = r1.getScaleY()
            return r0
    }

    public static int getScrollIndicators(android.view.View r1) {
            int r0 = androidx.core.view.ViewCompat.Api23Impl.getScrollIndicators(r1)
            return r0
    }

    public static java.lang.CharSequence getStateDescription(android.view.View r1) {
            androidx.core.view.ViewCompat$AccessibilityViewProperty r0 = stateDescriptionProperty()
            java.lang.Object r0 = r0.get(r1)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            return r0
    }

    public static java.util.List<android.graphics.Rect> getSystemGestureExclusionRects(android.view.View r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto Lb
            java.util.List r0 = androidx.core.view.ViewCompat.Api29Impl.getSystemGestureExclusionRects(r2)
            return r0
        Lb:
            java.util.List r0 = java.util.Collections.emptyList()
            return r0
    }

    public static java.lang.String getTransitionName(android.view.View r1) {
            java.lang.String r0 = androidx.core.view.ViewCompat.Api21Impl.getTransitionName(r1)
            return r0
    }

    @androidx.annotation.ReplaceWith(expression = "view.getTranslationX()")
    @java.lang.Deprecated
    public static float getTranslationX(android.view.View r1) {
            float r0 = r1.getTranslationX()
            return r0
    }

    @androidx.annotation.ReplaceWith(expression = "view.getTranslationY()")
    @java.lang.Deprecated
    public static float getTranslationY(android.view.View r1) {
            float r0 = r1.getTranslationY()
            return r0
    }

    public static float getTranslationZ(android.view.View r1) {
            float r0 = androidx.core.view.ViewCompat.Api21Impl.getTranslationZ(r1)
            return r0
    }

    @java.lang.Deprecated
    public static androidx.core.view.WindowInsetsControllerCompat getWindowInsetsController(android.view.View r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto Lb
            androidx.core.view.WindowInsetsControllerCompat r0 = androidx.core.view.ViewCompat.Api30Impl.getWindowInsetsController(r3)
            return r0
        Lb:
            android.content.Context r0 = r3.getContext()
        Lf:
            boolean r1 = r0 instanceof android.content.ContextWrapper
            r2 = 0
            if (r1 == 0) goto L2e
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L26
            r1 = r0
            android.app.Activity r1 = (android.app.Activity) r1
            android.view.Window r1 = r1.getWindow()
            if (r1 == 0) goto L25
            androidx.core.view.WindowInsetsControllerCompat r2 = androidx.core.view.WindowCompat.getInsetsController(r1, r3)
        L25:
            return r2
        L26:
            r1 = r0
            android.content.ContextWrapper r1 = (android.content.ContextWrapper) r1
            android.content.Context r0 = r1.getBaseContext()
            goto Lf
        L2e:
            return r2
    }

    @androidx.annotation.ReplaceWith(expression = "view.getWindowSystemUiVisibility()")
    @java.lang.Deprecated
    public static int getWindowSystemUiVisibility(android.view.View r1) {
            int r0 = r1.getWindowSystemUiVisibility()
            return r0
    }

    @androidx.annotation.ReplaceWith(expression = "view.getX()")
    @java.lang.Deprecated
    public static float getX(android.view.View r1) {
            float r0 = r1.getX()
            return r0
    }

    @androidx.annotation.ReplaceWith(expression = "view.getY()")
    @java.lang.Deprecated
    public static float getY(android.view.View r1) {
            float r0 = r1.getY()
            return r0
    }

    public static float getZ(android.view.View r1) {
            float r0 = androidx.core.view.ViewCompat.Api21Impl.getZ(r1)
            return r0
    }

    public static boolean hasAccessibilityDelegate(android.view.View r1) {
            android.view.View$AccessibilityDelegate r0 = getAccessibilityDelegateInternal(r1)
            if (r0 == 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    public static boolean hasExplicitFocusable(android.view.View r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto Lb
            boolean r0 = androidx.core.view.ViewCompat.Api26Impl.hasExplicitFocusable(r2)
            return r0
        Lb:
            boolean r0 = r2.hasFocusable()
            return r0
    }

    public static boolean hasNestedScrollingParent(android.view.View r1) {
            boolean r0 = androidx.core.view.ViewCompat.Api21Impl.hasNestedScrollingParent(r1)
            return r0
    }

    public static boolean hasNestedScrollingParent(android.view.View r1, int r2) {
            boolean r0 = r1 instanceof androidx.core.view.NestedScrollingChild2
            if (r0 == 0) goto Lb
            r0 = r1
            androidx.core.view.NestedScrollingChild2 r0 = (androidx.core.view.NestedScrollingChild2) r0
            r0.hasNestedScrollingParent(r2)
            goto L12
        Lb:
            if (r2 != 0) goto L12
            boolean r0 = hasNestedScrollingParent(r1)
            return r0
        L12:
            r0 = 0
            return r0
    }

    @androidx.annotation.ReplaceWith(expression = "view.hasOnClickListeners()")
    @java.lang.Deprecated
    public static boolean hasOnClickListeners(android.view.View r1) {
            boolean r0 = r1.hasOnClickListeners()
            return r0
    }

    @androidx.annotation.ReplaceWith(expression = "view.hasOverlappingRendering()")
    @java.lang.Deprecated
    public static boolean hasOverlappingRendering(android.view.View r1) {
            boolean r0 = r1.hasOverlappingRendering()
            return r0
    }

    @androidx.annotation.ReplaceWith(expression = "view.hasTransientState()")
    @java.lang.Deprecated
    public static boolean hasTransientState(android.view.View r1) {
            boolean r0 = r1.hasTransientState()
            return r0
    }

    public static boolean isAccessibilityHeading(android.view.View r2) {
            androidx.core.view.ViewCompat$AccessibilityViewProperty r0 = accessibilityHeadingProperty()
            java.lang.Object r0 = r0.get(r2)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 == 0) goto L14
            boolean r1 = r0.booleanValue()
            if (r1 == 0) goto L14
            r1 = 1
            goto L15
        L14:
            r1 = 0
        L15:
            return r1
    }

    @androidx.annotation.ReplaceWith(expression = "view.isAttachedToWindow()")
    @java.lang.Deprecated
    public static boolean isAttachedToWindow(android.view.View r1) {
            boolean r0 = r1.isAttachedToWindow()
            return r0
    }

    public static boolean isFocusedByDefault(android.view.View r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto Lb
            boolean r0 = androidx.core.view.ViewCompat.Api26Impl.isFocusedByDefault(r2)
            return r0
        Lb:
            r0 = 0
            return r0
    }

    public static boolean isImportantForAccessibility(android.view.View r1) {
            boolean r0 = androidx.core.view.ViewCompat.Api21Impl.isImportantForAccessibility(r1)
            return r0
    }

    public static boolean isImportantForAutofill(android.view.View r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto Lb
            boolean r0 = androidx.core.view.ViewCompat.Api26Impl.isImportantForAutofill(r2)
            return r0
        Lb:
            r0 = 1
            return r0
    }

    public static boolean isImportantForContentCapture(android.view.View r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto Lb
            boolean r0 = androidx.core.view.ViewCompat.Api30Impl.isImportantForContentCapture(r2)
            return r0
        Lb:
            r0 = 0
            return r0
    }

    @androidx.annotation.ReplaceWith(expression = "view.isInLayout()")
    @java.lang.Deprecated
    public static boolean isInLayout(android.view.View r1) {
            boolean r0 = r1.isInLayout()
            return r0
    }

    public static boolean isKeyboardNavigationCluster(android.view.View r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto Lb
            boolean r0 = androidx.core.view.ViewCompat.Api26Impl.isKeyboardNavigationCluster(r2)
            return r0
        Lb:
            r0 = 0
            return r0
    }

    @androidx.annotation.ReplaceWith(expression = "view.isLaidOut()")
    @java.lang.Deprecated
    public static boolean isLaidOut(android.view.View r1) {
            boolean r0 = r1.isLaidOut()
            return r0
    }

    @androidx.annotation.ReplaceWith(expression = "view.isLayoutDirectionResolved()")
    @java.lang.Deprecated
    public static boolean isLayoutDirectionResolved(android.view.View r1) {
            boolean r0 = r1.isLayoutDirectionResolved()
            return r0
    }

    public static boolean isNestedScrollingEnabled(android.view.View r1) {
            boolean r0 = androidx.core.view.ViewCompat.Api21Impl.isNestedScrollingEnabled(r1)
            return r0
    }

    @androidx.annotation.ReplaceWith(expression = "view.isOpaque()")
    @java.lang.Deprecated
    public static boolean isOpaque(android.view.View r1) {
            boolean r0 = r1.isOpaque()
            return r0
    }

    @androidx.annotation.ReplaceWith(expression = "view.isPaddingRelative()")
    @java.lang.Deprecated
    public static boolean isPaddingRelative(android.view.View r1) {
            boolean r0 = r1.isPaddingRelative()
            return r0
    }

    public static boolean isScreenReaderFocusable(android.view.View r2) {
            androidx.core.view.ViewCompat$AccessibilityViewProperty r0 = screenReaderFocusableProperty()
            java.lang.Object r0 = r0.get(r2)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 == 0) goto L14
            boolean r1 = r0.booleanValue()
            if (r1 == 0) goto L14
            r1 = 1
            goto L15
        L14:
            r1 = 0
        L15:
            return r1
    }

    @androidx.annotation.ReplaceWith(expression = "view.jumpDrawablesToCurrentState()")
    @java.lang.Deprecated
    public static void jumpDrawablesToCurrentState(android.view.View r0) {
            r0.jumpDrawablesToCurrentState()
            return
    }

    public static android.view.View keyboardNavigationClusterSearch(android.view.View r2, android.view.View r3, int r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto Lb
            android.view.View r0 = androidx.core.view.ViewCompat.Api26Impl.keyboardNavigationClusterSearch(r2, r3, r4)
            return r0
        Lb:
            r0 = 0
            return r0
    }

    static /* synthetic */ androidx.core.view.ContentInfoCompat lambda$static$0(androidx.core.view.ContentInfoCompat r0) {
            return r0
    }

    static void notifyViewAccessibilityStateChangedIfNeeded(android.view.View r6, int r7) {
            android.content.Context r0 = r6.getContext()
            java.lang.String r1 = "accessibility"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.accessibility.AccessibilityManager r0 = (android.view.accessibility.AccessibilityManager) r0
            boolean r1 = r0.isEnabled()
            if (r1 != 0) goto L14
            return
        L14:
            java.lang.CharSequence r1 = getAccessibilityPaneTitle(r6)
            if (r1 == 0) goto L28
            boolean r1 = r6.isShown()
            if (r1 == 0) goto L28
            int r1 = r6.getWindowVisibility()
            if (r1 != 0) goto L28
            r1 = 1
            goto L29
        L28:
            r1 = 0
        L29:
            int r2 = r6.getAccessibilityLiveRegion()
            r3 = 32
            if (r2 != 0) goto L8d
            if (r1 == 0) goto L34
            goto L8d
        L34:
            if (r7 != r3) goto L58
            android.view.accessibility.AccessibilityEvent r2 = android.view.accessibility.AccessibilityEvent.obtain()
            r6.onInitializeAccessibilityEvent(r2)
            r2.setEventType(r3)
            r2.setContentChangeTypes(r7)
            r2.setSource(r6)
            r6.onPopulateAccessibilityEvent(r2)
            java.util.List r3 = r2.getText()
            java.lang.CharSequence r4 = getAccessibilityPaneTitle(r6)
            r3.add(r4)
            r0.sendAccessibilityEvent(r2)
            goto L8c
        L58:
            android.view.ViewParent r2 = r6.getParent()
            if (r2 == 0) goto L8c
            android.view.ViewParent r2 = r6.getParent()
            r2.notifySubtreeAccessibilityStateChanged(r6, r6, r7)     // Catch: java.lang.AbstractMethodError -> L66
            goto Lb0
        L66:
            r3 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            android.view.ViewParent r5 = r6.getParent()
            java.lang.Class r5 = r5.getClass()
            java.lang.String r5 = r5.getSimpleName()
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r5 = " does not fully implement ViewParent"
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = "ViewCompat"
            android.util.Log.e(r5, r4, r3)
            goto Lb0
        L8c:
            goto Lb0
        L8d:
            android.view.accessibility.AccessibilityEvent r2 = android.view.accessibility.AccessibilityEvent.obtain()
            if (r1 == 0) goto L94
            goto L96
        L94:
            r3 = 2048(0x800, float:2.87E-42)
        L96:
            r2.setEventType(r3)
            r2.setContentChangeTypes(r7)
            if (r1 == 0) goto Lac
            java.util.List r3 = r2.getText()
            java.lang.CharSequence r4 = getAccessibilityPaneTitle(r6)
            r3.add(r4)
            setImportantForAccessibilityIfNeeded(r6)
        Lac:
            r6.sendAccessibilityEventUnchecked(r2)
        Lb0:
            return
    }

    public static void offsetLeftAndRight(android.view.View r0, int r1) {
            r0.offsetLeftAndRight(r1)
            return
    }

    public static void offsetTopAndBottom(android.view.View r0, int r1) {
            r0.offsetTopAndBottom(r1)
            return
    }

    public static androidx.core.view.WindowInsetsCompat onApplyWindowInsets(android.view.View r3, androidx.core.view.WindowInsetsCompat r4) {
            android.view.WindowInsets r0 = r4.toWindowInsets()
            if (r0 == 0) goto L16
            android.view.WindowInsets r1 = androidx.core.view.ViewCompat.Api20Impl.onApplyWindowInsets(r3, r0)
            boolean r2 = r1.equals(r0)
            if (r2 != 0) goto L16
            androidx.core.view.WindowInsetsCompat r2 = androidx.core.view.WindowInsetsCompat.toWindowInsetsCompat(r1, r3)
            return r2
        L16:
            return r4
    }

    @androidx.annotation.ReplaceWith(expression = "v.onInitializeAccessibilityEvent(event)")
    @java.lang.Deprecated
    public static void onInitializeAccessibilityEvent(android.view.View r0, android.view.accessibility.AccessibilityEvent r1) {
            r0.onInitializeAccessibilityEvent(r1)
            return
    }

    @androidx.annotation.ReplaceWith(expression = "v.onInitializeAccessibilityNodeInfo(info.unwrap())")
    @java.lang.Deprecated
    public static void onInitializeAccessibilityNodeInfo(android.view.View r1, androidx.core.view.accessibility.AccessibilityNodeInfoCompat r2) {
            android.view.accessibility.AccessibilityNodeInfo r0 = r2.unwrap()
            r1.onInitializeAccessibilityNodeInfo(r0)
            return
    }

    @androidx.annotation.ReplaceWith(expression = "v.onPopulateAccessibilityEvent(event)")
    @java.lang.Deprecated
    public static void onPopulateAccessibilityEvent(android.view.View r0, android.view.accessibility.AccessibilityEvent r1) {
            r0.onPopulateAccessibilityEvent(r1)
            return
    }

    private static androidx.core.view.ViewCompat.AccessibilityViewProperty<java.lang.CharSequence> paneTitleProperty() {
            androidx.core.view.ViewCompat$2 r0 = new androidx.core.view.ViewCompat$2
            int r1 = androidx.core.R.id.tag_accessibility_pane_title
            java.lang.Class<java.lang.CharSequence> r2 = java.lang.CharSequence.class
            r3 = 8
            r4 = 28
            r0.<init>(r1, r2, r3, r4)
            return r0
    }

    @androidx.annotation.ReplaceWith(expression = "view.performAccessibilityAction(action, arguments)")
    @java.lang.Deprecated
    public static boolean performAccessibilityAction(android.view.View r1, int r2, android.os.Bundle r3) {
            boolean r0 = r1.performAccessibilityAction(r2, r3)
            return r0
    }

    public static boolean performHapticFeedback(android.view.View r1, int r2) {
            int r2 = androidx.core.view.HapticFeedbackConstantsCompat.getFeedbackConstantOrFallback(r2)
            r0 = -1
            if (r2 != r0) goto La
            r0 = 0
            return r0
        La:
            boolean r0 = r1.performHapticFeedback(r2)
            return r0
    }

    public static boolean performHapticFeedback(android.view.View r1, int r2, int r3) {
            int r2 = androidx.core.view.HapticFeedbackConstantsCompat.getFeedbackConstantOrFallback(r2)
            r0 = -1
            if (r2 != r0) goto La
            r0 = 0
            return r0
        La:
            boolean r0 = r1.performHapticFeedback(r2, r3)
            return r0
    }

    public static androidx.core.view.ContentInfoCompat performReceiveContent(android.view.View r3, androidx.core.view.ContentInfoCompat r4) {
            r0 = 3
            java.lang.String r1 = "ViewCompat"
            boolean r0 = android.util.Log.isLoggable(r1, r0)
            if (r0 == 0) goto L45
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "performReceiveContent: "
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.StringBuilder r0 = r0.append(r4)
            java.lang.String r2 = ", view="
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.Class r2 = r3.getClass()
            java.lang.String r2 = r2.getSimpleName()
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r2 = "["
            java.lang.StringBuilder r0 = r0.append(r2)
            int r2 = r3.getId()
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r2 = "]"
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r1, r0)
        L45:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r0 < r1) goto L50
            androidx.core.view.ContentInfoCompat r0 = androidx.core.view.ViewCompat.Api31Impl.performReceiveContent(r3, r4)
            return r0
        L50:
            int r0 = androidx.core.R.id.tag_on_receive_content_listener
            java.lang.Object r0 = r3.getTag(r0)
            androidx.core.view.OnReceiveContentListener r0 = (androidx.core.view.OnReceiveContentListener) r0
            if (r0 == 0) goto L6b
            androidx.core.view.ContentInfoCompat r1 = r0.onReceiveContent(r3, r4)
            if (r1 != 0) goto L62
            r2 = 0
            goto L6a
        L62:
            androidx.core.view.OnReceiveContentViewBehavior r2 = getFallback(r3)
            androidx.core.view.ContentInfoCompat r2 = r2.onReceiveContent(r1)
        L6a:
            return r2
        L6b:
            androidx.core.view.OnReceiveContentViewBehavior r1 = getFallback(r3)
            androidx.core.view.ContentInfoCompat r1 = r1.onReceiveContent(r4)
            return r1
    }

    @androidx.annotation.ReplaceWith(expression = "view.postInvalidateOnAnimation()")
    @java.lang.Deprecated
    public static void postInvalidateOnAnimation(android.view.View r0) {
            r0.postInvalidateOnAnimation()
            return
    }

    @androidx.annotation.ReplaceWith(expression = "view.postInvalidateOnAnimation(left, top, right, bottom)")
    @java.lang.Deprecated
    public static void postInvalidateOnAnimation(android.view.View r0, int r1, int r2, int r3, int r4) {
            r0.postInvalidateOnAnimation(r1, r2, r3, r4)
            return
    }

    @androidx.annotation.ReplaceWith(expression = "view.postOnAnimation(action)")
    @java.lang.Deprecated
    public static void postOnAnimation(android.view.View r0, java.lang.Runnable r1) {
            r0.postOnAnimation(r1)
            return
    }

    @androidx.annotation.ReplaceWith(expression = "view.postOnAnimationDelayed(action, delayMillis)")
    @java.lang.Deprecated
    public static void postOnAnimationDelayed(android.view.View r0, java.lang.Runnable r1, long r2) {
            r0.postOnAnimationDelayed(r1, r2)
            return
    }

    public static void removeAccessibilityAction(android.view.View r1, int r2) {
            removeActionWithId(r2, r1)
            r0 = 0
            notifyViewAccessibilityStateChangedIfNeeded(r1, r0)
            return
    }

    private static void removeActionWithId(int r3, android.view.View r4) {
            java.util.List r0 = getActionList(r4)
            r1 = 0
        L5:
            int r2 = r0.size()
            if (r1 >= r2) goto L1e
            java.lang.Object r2 = r0.get(r1)
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r2 = (androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat) r2
            int r2 = r2.getId()
            if (r2 != r3) goto L1b
            r0.remove(r1)
            goto L1e
        L1b:
            int r1 = r1 + 1
            goto L5
        L1e:
            return
    }

    public static void removeOnUnhandledKeyEventListener(android.view.View r2, androidx.core.view.ViewCompat.OnUnhandledKeyEventListenerCompat r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto La
            androidx.core.view.ViewCompat.Api28Impl.removeOnUnhandledKeyEventListener(r2, r3)
            return
        La:
            int r0 = androidx.core.R.id.tag_unhandled_key_listeners
            java.lang.Object r0 = r2.getTag(r0)
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            if (r0 == 0) goto L20
            r0.remove(r3)
            int r1 = r0.size()
            if (r1 != 0) goto L20
            androidx.core.view.ViewCompat.UnhandledKeyEventManager.unregisterListeningView(r2)
        L20:
            return
    }

    public static void replaceAccessibilityAction(android.view.View r1, androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat r2, java.lang.CharSequence r3, androidx.core.view.accessibility.AccessibilityViewCommand r4) {
            if (r4 != 0) goto Lc
            if (r3 != 0) goto Lc
            int r0 = r2.getId()
            removeAccessibilityAction(r1, r0)
            goto L13
        Lc:
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r0 = r2.createReplacementAction(r3, r4)
            addAccessibilityAction(r1, r0)
        L13:
            return
    }

    public static void requestApplyInsets(android.view.View r0) {
            androidx.core.view.ViewCompat.Api20Impl.requestApplyInsets(r0)
            return
    }

    public static <T extends android.view.View> T requireViewById(android.view.View r3, int r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Ld
            java.lang.Object r0 = androidx.core.view.ViewCompat.Api28Impl.requireViewById(r3, r4)
            android.view.View r0 = (android.view.View) r0
            return r0
        Ld:
            android.view.View r0 = r3.findViewById(r4)
            if (r0 == 0) goto L14
            return r0
        L14:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "ID does not reference a View inside this View"
            r1.<init>(r2)
            throw r1
    }

    @java.lang.Deprecated
    public static int resolveSizeAndState(int r1, int r2, int r3) {
            int r0 = android.view.View.resolveSizeAndState(r1, r2, r3)
            return r0
    }

    public static boolean restoreDefaultFocus(android.view.View r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto Lb
            boolean r0 = androidx.core.view.ViewCompat.Api26Impl.restoreDefaultFocus(r2)
            return r0
        Lb:
            boolean r0 = r2.requestFocus()
            return r0
    }

    public static void saveAttributeDataForStyleable(android.view.View r2, android.content.Context r3, int[] r4, android.util.AttributeSet r5, android.content.res.TypedArray r6, int r7, int r8) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L9
            androidx.core.view.ViewCompat.Api29Impl.saveAttributeDataForStyleable(r2, r3, r4, r5, r6, r7, r8)
        L9:
            return
    }

    private static androidx.core.view.ViewCompat.AccessibilityViewProperty<java.lang.Boolean> screenReaderFocusableProperty() {
            androidx.core.view.ViewCompat$1 r0 = new androidx.core.view.ViewCompat$1
            int r1 = androidx.core.R.id.tag_screen_reader_focusable
            java.lang.Class<java.lang.Boolean> r2 = java.lang.Boolean.class
            r3 = 28
            r0.<init>(r1, r2, r3)
            return r0
    }

    public static void setAccessibilityDelegate(android.view.View r1, androidx.core.view.AccessibilityDelegateCompat r2) {
            if (r2 != 0) goto L10
            android.view.View$AccessibilityDelegate r0 = getAccessibilityDelegateInternal(r1)
            boolean r0 = r0 instanceof androidx.core.view.AccessibilityDelegateCompat.AccessibilityDelegateAdapter
            if (r0 == 0) goto L10
            androidx.core.view.AccessibilityDelegateCompat r0 = new androidx.core.view.AccessibilityDelegateCompat
            r0.<init>()
            r2 = r0
        L10:
            setImportantForAccessibilityIfNeeded(r1)
            if (r2 != 0) goto L17
            r0 = 0
            goto L1b
        L17:
            android.view.View$AccessibilityDelegate r0 = r2.getBridge()
        L1b:
            r1.setAccessibilityDelegate(r0)
            return
    }

    public static void setAccessibilityHeading(android.view.View r2, boolean r3) {
            androidx.core.view.ViewCompat$AccessibilityViewProperty r0 = accessibilityHeadingProperty()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r3)
            r0.set(r2, r1)
            return
    }

    @androidx.annotation.ReplaceWith(expression = "view.setAccessibilityLiveRegion(mode)")
    @java.lang.Deprecated
    public static void setAccessibilityLiveRegion(android.view.View r0, int r1) {
            r0.setAccessibilityLiveRegion(r1)
            return
    }

    public static void setAccessibilityPaneTitle(android.view.View r1, java.lang.CharSequence r2) {
            androidx.core.view.ViewCompat$AccessibilityViewProperty r0 = paneTitleProperty()
            r0.set(r1, r2)
            if (r2 == 0) goto Lf
            androidx.core.view.ViewCompat$AccessibilityPaneVisibilityManager r0 = androidx.core.view.ViewCompat.sAccessibilityPaneVisibilityManager
            r0.addAccessibilityPane(r1)
            goto L14
        Lf:
            androidx.core.view.ViewCompat$AccessibilityPaneVisibilityManager r0 = androidx.core.view.ViewCompat.sAccessibilityPaneVisibilityManager
            r0.removeAccessibilityPane(r1)
        L14:
            return
    }

    @androidx.annotation.ReplaceWith(expression = "view.setActivated(activated)")
    @java.lang.Deprecated
    public static void setActivated(android.view.View r0, boolean r1) {
            r0.setActivated(r1)
            return
    }

    @androidx.annotation.ReplaceWith(expression = "view.setAlpha(value)")
    @java.lang.Deprecated
    public static void setAlpha(android.view.View r0, float r1) {
            r0.setAlpha(r1)
            return
    }

    public static void setAutofillHints(android.view.View r2, java.lang.String... r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L9
            androidx.core.view.ViewCompat.Api26Impl.setAutofillHints(r2, r3)
        L9:
            return
    }

    public static void setAutofillId(android.view.View r2, androidx.core.view.autofill.AutofillIdCompat r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L9
            androidx.core.view.ViewCompat.Api28Impl.setAutofillId(r2, r3)
        L9:
            return
    }

    @androidx.annotation.ReplaceWith(expression = "view.setBackground(background)")
    @java.lang.Deprecated
    public static void setBackground(android.view.View r0, android.graphics.drawable.Drawable r1) {
            r0.setBackground(r1)
            return
    }

    public static void setBackgroundTintList(android.view.View r0, android.content.res.ColorStateList r1) {
            androidx.core.view.ViewCompat.Api21Impl.setBackgroundTintList(r0, r1)
            return
    }

    public static void setBackgroundTintMode(android.view.View r0, android.graphics.PorterDuff.Mode r1) {
            androidx.core.view.ViewCompat.Api21Impl.setBackgroundTintMode(r0, r1)
            return
    }

    @java.lang.Deprecated
    public static void setChildrenDrawingOrderEnabled(android.view.ViewGroup r8, boolean r9) {
            java.lang.String r0 = "Unable to invoke childrenDrawingOrderEnabled"
            java.lang.reflect.Method r1 = androidx.core.view.ViewCompat.sChildrenDrawingOrderMethod
            java.lang.String r2 = "ViewCompat"
            if (r1 != 0) goto L26
            r1 = 1
            java.lang.Class<android.view.ViewGroup> r3 = android.view.ViewGroup.class
            java.lang.String r4 = "setChildrenDrawingOrderEnabled"
            java.lang.Class[] r5 = new java.lang.Class[r1]     // Catch: java.lang.NoSuchMethodException -> L1b
            java.lang.Class r6 = java.lang.Boolean.TYPE     // Catch: java.lang.NoSuchMethodException -> L1b
            r7 = 0
            r5[r7] = r6     // Catch: java.lang.NoSuchMethodException -> L1b
            java.lang.reflect.Method r3 = r3.getDeclaredMethod(r4, r5)     // Catch: java.lang.NoSuchMethodException -> L1b
            androidx.core.view.ViewCompat.sChildrenDrawingOrderMethod = r3     // Catch: java.lang.NoSuchMethodException -> L1b
            goto L21
        L1b:
            r3 = move-exception
            java.lang.String r4 = "Unable to find childrenDrawingOrderEnabled"
            android.util.Log.e(r2, r4, r3)
        L21:
            java.lang.reflect.Method r3 = androidx.core.view.ViewCompat.sChildrenDrawingOrderMethod
            r3.setAccessible(r1)
        L26:
            java.lang.reflect.Method r1 = androidx.core.view.ViewCompat.sChildrenDrawingOrderMethod     // Catch: java.lang.reflect.InvocationTargetException -> L34 java.lang.IllegalArgumentException -> L39 java.lang.IllegalAccessException -> L3e
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r9)     // Catch: java.lang.reflect.InvocationTargetException -> L34 java.lang.IllegalArgumentException -> L39 java.lang.IllegalAccessException -> L3e
            java.lang.Object[] r3 = new java.lang.Object[]{r3}     // Catch: java.lang.reflect.InvocationTargetException -> L34 java.lang.IllegalArgumentException -> L39 java.lang.IllegalAccessException -> L3e
            r1.invoke(r8, r3)     // Catch: java.lang.reflect.InvocationTargetException -> L34 java.lang.IllegalArgumentException -> L39 java.lang.IllegalAccessException -> L3e
            goto L42
        L34:
            r1 = move-exception
            android.util.Log.e(r2, r0, r1)
            goto L43
        L39:
            r1 = move-exception
            android.util.Log.e(r2, r0, r1)
            goto L42
        L3e:
            r1 = move-exception
            android.util.Log.e(r2, r0, r1)
        L42:
        L43:
            return
    }

    @androidx.annotation.ReplaceWith(expression = "view.setClipBounds(clipBounds)")
    @java.lang.Deprecated
    public static void setClipBounds(android.view.View r0, android.graphics.Rect r1) {
            r0.setClipBounds(r1)
            return
    }

    public static void setContentCaptureSession(android.view.View r2, androidx.core.view.contentcapture.ContentCaptureSessionCompat r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L9
            androidx.core.view.ViewCompat.Api29Impl.setContentCaptureSession(r2, r3)
        L9:
            return
    }

    public static void setElevation(android.view.View r0, float r1) {
            androidx.core.view.ViewCompat.Api21Impl.setElevation(r0, r1)
            return
    }

    @androidx.annotation.ReplaceWith(expression = "view.setFitsSystemWindows(fitSystemWindows)")
    @java.lang.Deprecated
    public static void setFitsSystemWindows(android.view.View r0, boolean r1) {
            r0.setFitsSystemWindows(r1)
            return
    }

    public static void setFocusedByDefault(android.view.View r2, boolean r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L9
            androidx.core.view.ViewCompat.Api26Impl.setFocusedByDefault(r2, r3)
        L9:
            return
    }

    @androidx.annotation.ReplaceWith(expression = "view.setHasTransientState(hasTransientState)")
    @java.lang.Deprecated
    public static void setHasTransientState(android.view.View r0, boolean r1) {
            r0.setHasTransientState(r1)
            return
    }

    @androidx.annotation.ReplaceWith(expression = "view.setImportantForAccessibility(mode)")
    @java.lang.Deprecated
    public static void setImportantForAccessibility(android.view.View r0, int r1) {
            r0.setImportantForAccessibility(r1)
            return
    }

    private static void setImportantForAccessibilityIfNeeded(android.view.View r1) {
            int r0 = r1.getImportantForAccessibility()
            if (r0 != 0) goto La
            r0 = 1
            r1.setImportantForAccessibility(r0)
        La:
            return
    }

    public static void setImportantForAutofill(android.view.View r2, int r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L9
            androidx.core.view.ViewCompat.Api26Impl.setImportantForAutofill(r2, r3)
        L9:
            return
    }

    public static void setImportantForContentCapture(android.view.View r2, int r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto L9
            androidx.core.view.ViewCompat.Api30Impl.setImportantForContentCapture(r2, r3)
        L9:
            return
    }

    public static void setKeyboardNavigationCluster(android.view.View r2, boolean r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L9
            androidx.core.view.ViewCompat.Api26Impl.setKeyboardNavigationCluster(r2, r3)
        L9:
            return
    }

    @androidx.annotation.ReplaceWith(expression = "view.setLabelFor(labeledId)")
    @java.lang.Deprecated
    public static void setLabelFor(android.view.View r0, int r1) {
            r0.setLabelFor(r1)
            return
    }

    @androidx.annotation.ReplaceWith(expression = "view.setLayerPaint(paint)")
    @java.lang.Deprecated
    public static void setLayerPaint(android.view.View r0, android.graphics.Paint r1) {
            r0.setLayerPaint(r1)
            return
    }

    @androidx.annotation.ReplaceWith(expression = "view.setLayerType(layerType, paint)")
    @java.lang.Deprecated
    public static void setLayerType(android.view.View r0, int r1, android.graphics.Paint r2) {
            r0.setLayerType(r1, r2)
            return
    }

    @androidx.annotation.ReplaceWith(expression = "view.setLayoutDirection(layoutDirection)")
    @java.lang.Deprecated
    public static void setLayoutDirection(android.view.View r0, int r1) {
            r0.setLayoutDirection(r1)
            return
    }

    public static void setNestedScrollingEnabled(android.view.View r0, boolean r1) {
            androidx.core.view.ViewCompat.Api21Impl.setNestedScrollingEnabled(r0, r1)
            return
    }

    public static void setNextClusterForwardId(android.view.View r2, int r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L9
            androidx.core.view.ViewCompat.Api26Impl.setNextClusterForwardId(r2, r3)
        L9:
            return
    }

    public static void setOnApplyWindowInsetsListener(android.view.View r0, androidx.core.view.OnApplyWindowInsetsListener r1) {
            androidx.core.view.ViewCompat.Api21Impl.setOnApplyWindowInsetsListener(r0, r1)
            return
    }

    public static void setOnReceiveContentListener(android.view.View r5, java.lang.String[] r6, androidx.core.view.OnReceiveContentListener r7) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r0 < r1) goto La
            androidx.core.view.ViewCompat.Api31Impl.setOnReceiveContentListener(r5, r6, r7)
            return
        La:
            if (r6 == 0) goto L12
            int r0 = r6.length
            if (r0 != 0) goto L10
            goto L12
        L10:
            r0 = r6
            goto L13
        L12:
            r0 = 0
        L13:
            r6 = 0
            if (r7 == 0) goto L20
            if (r0 == 0) goto L1a
            r1 = 1
            goto L1b
        L1a:
            r1 = r6
        L1b:
            java.lang.String r2 = "When the listener is set, MIME types must also be set"
            androidx.core.util.Preconditions.checkArgument(r1, r2)
        L20:
            if (r0 == 0) goto L51
            r1 = 0
            int r2 = r0.length
        L24:
            if (r6 >= r2) goto L35
            r3 = r0[r6]
            java.lang.String r4 = "*"
            boolean r4 = r3.startsWith(r4)
            if (r4 == 0) goto L32
            r1 = 1
            goto L35
        L32:
            int r6 = r6 + 1
            goto L24
        L35:
            r6 = r1 ^ 1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "A MIME type set here must not start with *: "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = java.util.Arrays.toString(r0)
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            androidx.core.util.Preconditions.checkArgument(r6, r2)
        L51:
            int r6 = androidx.core.R.id.tag_on_receive_content_mime_types
            r5.setTag(r6, r0)
            int r6 = androidx.core.R.id.tag_on_receive_content_listener
            r5.setTag(r6, r7)
            return
    }

    @androidx.annotation.ReplaceWith(expression = "view.setOverScrollMode(overScrollMode)")
    @java.lang.Deprecated
    public static void setOverScrollMode(android.view.View r0, int r1) {
            r0.setOverScrollMode(r1)
            return
    }

    @androidx.annotation.ReplaceWith(expression = "view.setPaddingRelative(start, top, end, bottom)")
    @java.lang.Deprecated
    public static void setPaddingRelative(android.view.View r0, int r1, int r2, int r3, int r4) {
            r0.setPaddingRelative(r1, r2, r3, r4)
            return
    }

    @androidx.annotation.ReplaceWith(expression = "view.setPivotX(value)")
    @java.lang.Deprecated
    public static void setPivotX(android.view.View r0, float r1) {
            r0.setPivotX(r1)
            return
    }

    @androidx.annotation.ReplaceWith(expression = "view.setPivotY(value)")
    @java.lang.Deprecated
    public static void setPivotY(android.view.View r0, float r1) {
            r0.setPivotY(r1)
            return
    }

    public static void setPointerIcon(android.view.View r1, androidx.core.view.PointerIconCompat r2) {
            if (r2 == 0) goto L8
            java.lang.Object r0 = r2.getPointerIcon()
            goto L9
        L8:
            r0 = 0
        L9:
            android.view.PointerIcon r0 = (android.view.PointerIcon) r0
            androidx.core.view.ViewCompat.Api24Impl.setPointerIcon(r1, r0)
            return
    }

    @androidx.annotation.ReplaceWith(expression = "view.setRotation(value)")
    @java.lang.Deprecated
    public static void setRotation(android.view.View r0, float r1) {
            r0.setRotation(r1)
            return
    }

    @androidx.annotation.ReplaceWith(expression = "view.setRotationX(value)")
    @java.lang.Deprecated
    public static void setRotationX(android.view.View r0, float r1) {
            r0.setRotationX(r1)
            return
    }

    @androidx.annotation.ReplaceWith(expression = "view.setRotationY(value)")
    @java.lang.Deprecated
    public static void setRotationY(android.view.View r0, float r1) {
            r0.setRotationY(r1)
            return
    }

    @androidx.annotation.ReplaceWith(expression = "view.setSaveFromParentEnabled(enabled)")
    @java.lang.Deprecated
    public static void setSaveFromParentEnabled(android.view.View r0, boolean r1) {
            r0.setSaveFromParentEnabled(r1)
            return
    }

    @androidx.annotation.ReplaceWith(expression = "view.setScaleX(value)")
    @java.lang.Deprecated
    public static void setScaleX(android.view.View r0, float r1) {
            r0.setScaleX(r1)
            return
    }

    @androidx.annotation.ReplaceWith(expression = "view.setScaleY(value)")
    @java.lang.Deprecated
    public static void setScaleY(android.view.View r0, float r1) {
            r0.setScaleY(r1)
            return
    }

    public static void setScreenReaderFocusable(android.view.View r2, boolean r3) {
            androidx.core.view.ViewCompat$AccessibilityViewProperty r0 = screenReaderFocusableProperty()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r3)
            r0.set(r2, r1)
            return
    }

    public static void setScrollIndicators(android.view.View r0, int r1) {
            androidx.core.view.ViewCompat.Api23Impl.setScrollIndicators(r0, r1)
            return
    }

    public static void setScrollIndicators(android.view.View r0, int r1, int r2) {
            androidx.core.view.ViewCompat.Api23Impl.setScrollIndicators(r0, r1, r2)
            return
    }

    public static void setStateDescription(android.view.View r1, java.lang.CharSequence r2) {
            androidx.core.view.ViewCompat$AccessibilityViewProperty r0 = stateDescriptionProperty()
            r0.set(r1, r2)
            return
    }

    public static void setSystemGestureExclusionRects(android.view.View r2, java.util.List<android.graphics.Rect> r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L9
            androidx.core.view.ViewCompat.Api29Impl.setSystemGestureExclusionRects(r2, r3)
        L9:
            return
    }

    public static void setTooltipText(android.view.View r2, java.lang.CharSequence r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L9
            androidx.core.view.ViewCompat.Api26Impl.setTooltipText(r2, r3)
        L9:
            return
    }

    public static void setTransitionName(android.view.View r0, java.lang.String r1) {
            androidx.core.view.ViewCompat.Api21Impl.setTransitionName(r0, r1)
            return
    }

    @androidx.annotation.ReplaceWith(expression = "view.setTranslationX(value)")
    @java.lang.Deprecated
    public static void setTranslationX(android.view.View r0, float r1) {
            r0.setTranslationX(r1)
            return
    }

    @androidx.annotation.ReplaceWith(expression = "view.setTranslationY(value)")
    @java.lang.Deprecated
    public static void setTranslationY(android.view.View r0, float r1) {
            r0.setTranslationY(r1)
            return
    }

    public static void setTranslationZ(android.view.View r0, float r1) {
            androidx.core.view.ViewCompat.Api21Impl.setTranslationZ(r0, r1)
            return
    }

    public static void setWindowInsetsAnimationCallback(android.view.View r0, androidx.core.view.WindowInsetsAnimationCompat.Callback r1) {
            androidx.core.view.WindowInsetsAnimationCompat.setCallback(r0, r1)
            return
    }

    @androidx.annotation.ReplaceWith(expression = "view.setX(value)")
    @java.lang.Deprecated
    public static void setX(android.view.View r0, float r1) {
            r0.setX(r1)
            return
    }

    @androidx.annotation.ReplaceWith(expression = "view.setY(value)")
    @java.lang.Deprecated
    public static void setY(android.view.View r0, float r1) {
            r0.setY(r1)
            return
    }

    public static void setZ(android.view.View r0, float r1) {
            androidx.core.view.ViewCompat.Api21Impl.setZ(r0, r1)
            return
    }

    public static boolean startDragAndDrop(android.view.View r1, android.content.ClipData r2, android.view.View.DragShadowBuilder r3, java.lang.Object r4, int r5) {
            boolean r0 = androidx.core.view.ViewCompat.Api24Impl.startDragAndDrop(r1, r2, r3, r4, r5)
            return r0
    }

    public static boolean startNestedScroll(android.view.View r1, int r2) {
            boolean r0 = androidx.core.view.ViewCompat.Api21Impl.startNestedScroll(r1, r2)
            return r0
    }

    public static boolean startNestedScroll(android.view.View r1, int r2, int r3) {
            boolean r0 = r1 instanceof androidx.core.view.NestedScrollingChild2
            if (r0 == 0) goto Lc
            r0 = r1
            androidx.core.view.NestedScrollingChild2 r0 = (androidx.core.view.NestedScrollingChild2) r0
            boolean r0 = r0.startNestedScroll(r2, r3)
            return r0
        Lc:
            if (r3 != 0) goto L13
            boolean r0 = startNestedScroll(r1, r2)
            return r0
        L13:
            r0 = 0
            return r0
    }

    private static androidx.core.view.ViewCompat.AccessibilityViewProperty<java.lang.CharSequence> stateDescriptionProperty() {
            androidx.core.view.ViewCompat$3 r0 = new androidx.core.view.ViewCompat$3
            int r1 = androidx.core.R.id.tag_state_description
            java.lang.Class<java.lang.CharSequence> r2 = java.lang.CharSequence.class
            r3 = 64
            r4 = 30
            r0.<init>(r1, r2, r3, r4)
            return r0
    }

    public static void stopNestedScroll(android.view.View r0) {
            androidx.core.view.ViewCompat.Api21Impl.stopNestedScroll(r0)
            return
    }

    public static void stopNestedScroll(android.view.View r1, int r2) {
            boolean r0 = r1 instanceof androidx.core.view.NestedScrollingChild2
            if (r0 == 0) goto Lb
            r0 = r1
            androidx.core.view.NestedScrollingChild2 r0 = (androidx.core.view.NestedScrollingChild2) r0
            r0.stopNestedScroll(r2)
            goto L10
        Lb:
            if (r2 != 0) goto L10
            stopNestedScroll(r1)
        L10:
            return
    }

    private static void tickleInvalidationFlag(android.view.View r2) {
            float r0 = r2.getTranslationY()
            r1 = 1065353216(0x3f800000, float:1.0)
            float r1 = r1 + r0
            r2.setTranslationY(r1)
            r2.setTranslationY(r0)
            return
    }

    public static void transformMatrixToGlobal(android.view.View r2, android.graphics.Matrix r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto La
            androidx.core.view.ViewCompat.Api29Impl.transformMatrixToGlobal(r2, r3)
            goto L19
        La:
            boolean r0 = androidx.core.view.ViewCompat.sTryHiddenViewTransformMatrixToGlobal
            if (r0 == 0) goto L16
            androidx.core.view.ViewCompat.Api29Impl.transformMatrixToGlobal(r2, r3)     // Catch: java.lang.NoSuchMethodError -> L12
            return
        L12:
            r0 = move-exception
            r1 = 0
            androidx.core.view.ViewCompat.sTryHiddenViewTransformMatrixToGlobal = r1
        L16:
            fallbackTransformMatrixToGlobal(r2, r3)
        L19:
            return
    }

    public static void updateDragShadow(android.view.View r0, android.view.View.DragShadowBuilder r1) {
            androidx.core.view.ViewCompat.Api24Impl.updateDragShadow(r0, r1)
            return
    }
}
