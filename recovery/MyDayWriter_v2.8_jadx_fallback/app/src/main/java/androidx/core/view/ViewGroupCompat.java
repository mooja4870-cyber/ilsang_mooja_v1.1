package androidx.core.view;

/* JADX INFO: loaded from: classes.dex */
public final class ViewGroupCompat {
    private static final android.view.WindowInsets CONSUMED = null;
    public static final int LAYOUT_MODE_CLIP_BOUNDS = 0;
    public static final int LAYOUT_MODE_OPTICAL_BOUNDS = 1;
    static boolean sCompatInsetsDispatchInstalled;

    static class Api21Impl {
        private Api21Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static int getNestedScrollAxes(android.view.ViewGroup r1) {
                int r0 = r1.getNestedScrollAxes()
                return r0
        }

        static boolean isTransitionGroup(android.view.ViewGroup r1) {
                boolean r0 = r1.isTransitionGroup()
                return r0
        }

        static void setTransitionGroup(android.view.ViewGroup r0, boolean r1) {
                r0.setTransitionGroup(r1)
                return
        }
    }

    static {
            androidx.core.view.WindowInsetsCompat r0 = androidx.core.view.WindowInsetsCompat.CONSUMED
            android.view.WindowInsets r0 = r0.toWindowInsets()
            androidx.core.view.ViewGroupCompat.CONSUMED = r0
            r0 = 0
            androidx.core.view.ViewGroupCompat.sCompatInsetsDispatchInstalled = r0
            return
    }

    private ViewGroupCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    static android.view.WindowInsets dispatchApplyWindowInsets(android.view.View r11, android.view.WindowInsets r12) {
            int r0 = androidx.core.R.id.tag_on_apply_window_listener
            java.lang.Object r0 = r11.getTag(r0)
            int r1 = androidx.core.R.id.tag_window_insets_animation_callback
            java.lang.Object r1 = r11.getTag(r1)
            boolean r2 = r0 instanceof android.view.View.OnApplyWindowInsetsListener
            if (r2 == 0) goto L14
            r2 = r0
            android.view.View$OnApplyWindowInsetsListener r2 = (android.view.View.OnApplyWindowInsetsListener) r2
            goto L1d
        L14:
            boolean r2 = r1 instanceof android.view.View.OnApplyWindowInsetsListener
            if (r2 == 0) goto L1c
            r2 = r1
            android.view.View$OnApplyWindowInsetsListener r2 = (android.view.View.OnApplyWindowInsetsListener) r2
            goto L1d
        L1c:
            r2 = 0
        L1d:
            r3 = 1
            android.view.WindowInsets[] r3 = new android.view.WindowInsets[r3]
            android.view.WindowInsets r4 = androidx.core.view.ViewGroupCompat.CONSUMED
            r5 = 0
            r3[r5] = r4
            androidx.core.view.ViewGroupCompat$$ExternalSyntheticLambda0 r4 = new androidx.core.view.ViewGroupCompat$$ExternalSyntheticLambda0
            r4.<init>(r3, r2)
            r11.setOnApplyWindowInsetsListener(r4)
            r11.dispatchApplyWindowInsets(r12)
            int r4 = androidx.core.R.id.tag_compat_insets_dispatch
            java.lang.Object r4 = r11.getTag(r4)
            boolean r6 = r4 instanceof android.view.View.OnApplyWindowInsetsListener
            if (r6 == 0) goto L40
            r6 = r4
            android.view.View$OnApplyWindowInsetsListener r6 = (android.view.View.OnApplyWindowInsetsListener) r6
            goto L41
        L40:
            r6 = r2
        L41:
            r11.setOnApplyWindowInsetsListener(r6)
            r6 = r3[r5]
            if (r6 == 0) goto L6a
            r6 = r3[r5]
            boolean r6 = r6.isConsumed()
            if (r6 != 0) goto L6a
            boolean r6 = r11 instanceof android.view.ViewGroup
            if (r6 == 0) goto L6a
            r6 = r11
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            int r7 = r6.getChildCount()
            r8 = 0
        L5c:
            if (r8 >= r7) goto L6a
            android.view.View r9 = r6.getChildAt(r8)
            r10 = r3[r5]
            dispatchApplyWindowInsets(r9, r10)
            int r8 = r8 + 1
            goto L5c
        L6a:
            r6 = r3[r5]
            if (r6 == 0) goto L71
            r5 = r3[r5]
            goto L73
        L71:
            android.view.WindowInsets r5 = androidx.core.view.ViewGroupCompat.CONSUMED
        L73:
            return r5
    }

    @androidx.annotation.ReplaceWith(expression = "group.getLayoutMode()")
    @java.lang.Deprecated
    public static int getLayoutMode(android.view.ViewGroup r1) {
            int r0 = r1.getLayoutMode()
            return r0
    }

    public static int getNestedScrollAxes(android.view.ViewGroup r1) {
            int r0 = androidx.core.view.ViewGroupCompat.Api21Impl.getNestedScrollAxes(r1)
            return r0
    }

    public static void installCompatInsetsDispatch(android.view.View r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto L7
            return
        L7:
            androidx.core.view.ViewGroupCompat$$ExternalSyntheticLambda1 r0 = new androidx.core.view.ViewGroupCompat$$ExternalSyntheticLambda1
            r0.<init>()
            int r1 = androidx.core.R.id.tag_compat_insets_dispatch
            r2.setTag(r1, r0)
            r2.setOnApplyWindowInsetsListener(r0)
            r1 = 1
            androidx.core.view.ViewGroupCompat.sCompatInsetsDispatchInstalled = r1
            return
    }

    public static boolean isTransitionGroup(android.view.ViewGroup r1) {
            boolean r0 = androidx.core.view.ViewGroupCompat.Api21Impl.isTransitionGroup(r1)
            return r0
    }

    static /* synthetic */ android.view.WindowInsets lambda$dispatchApplyWindowInsets$1(android.view.WindowInsets[] r2, android.view.View.OnApplyWindowInsetsListener r3, android.view.View r4, android.view.WindowInsets r5) {
            if (r3 == 0) goto L7
            android.view.WindowInsets r0 = r3.onApplyWindowInsets(r4, r5)
            goto Lb
        L7:
            android.view.WindowInsets r0 = r4.onApplyWindowInsets(r5)
        Lb:
            r1 = 0
            r2[r1] = r0
            android.view.WindowInsets r0 = androidx.core.view.ViewGroupCompat.CONSUMED
            return r0
    }

    static /* synthetic */ android.view.WindowInsets lambda$installCompatInsetsDispatch$0(android.view.View r1, android.view.WindowInsets r2) {
            dispatchApplyWindowInsets(r1, r2)
            android.view.WindowInsets r0 = androidx.core.view.ViewGroupCompat.CONSUMED
            return r0
    }

    @androidx.annotation.ReplaceWith(expression = "group.onRequestSendAccessibilityEvent(child, event)")
    @java.lang.Deprecated
    public static boolean onRequestSendAccessibilityEvent(android.view.ViewGroup r1, android.view.View r2, android.view.accessibility.AccessibilityEvent r3) {
            boolean r0 = r1.onRequestSendAccessibilityEvent(r2, r3)
            return r0
    }

    @androidx.annotation.ReplaceWith(expression = "group.setLayoutMode(mode)")
    @java.lang.Deprecated
    public static void setLayoutMode(android.view.ViewGroup r0, int r1) {
            r0.setLayoutMode(r1)
            return
    }

    @androidx.annotation.ReplaceWith(expression = "group.setMotionEventSplittingEnabled(split)")
    @java.lang.Deprecated
    public static void setMotionEventSplittingEnabled(android.view.ViewGroup r0, boolean r1) {
            r0.setMotionEventSplittingEnabled(r1)
            return
    }

    public static void setTransitionGroup(android.view.ViewGroup r0, boolean r1) {
            androidx.core.view.ViewGroupCompat.Api21Impl.setTransitionGroup(r0, r1)
            return
    }
}
