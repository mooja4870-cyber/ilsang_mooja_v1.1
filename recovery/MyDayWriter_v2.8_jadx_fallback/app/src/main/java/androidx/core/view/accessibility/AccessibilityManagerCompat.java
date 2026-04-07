package androidx.core.view.accessibility;

/* JADX INFO: loaded from: classes.dex */
public final class AccessibilityManagerCompat {

    @java.lang.Deprecated
    public interface AccessibilityStateChangeListener {
        @java.lang.Deprecated
        void onAccessibilityStateChanged(boolean r1);
    }

    @java.lang.Deprecated
    public static abstract class AccessibilityStateChangeListenerCompat implements androidx.core.view.accessibility.AccessibilityManagerCompat.AccessibilityStateChangeListener {
        public AccessibilityStateChangeListenerCompat() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    private static class AccessibilityStateChangeListenerWrapper implements android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener {
        androidx.core.view.accessibility.AccessibilityManagerCompat.AccessibilityStateChangeListener mListener;

        AccessibilityStateChangeListenerWrapper(androidx.core.view.accessibility.AccessibilityManagerCompat.AccessibilityStateChangeListener r1) {
                r0 = this;
                r0.<init>()
                r0.mListener = r1
                return
        }

        public boolean equals(java.lang.Object r4) {
                r3 = this;
                if (r3 != r4) goto L4
                r0 = 1
                return r0
            L4:
                boolean r0 = r4 instanceof androidx.core.view.accessibility.AccessibilityManagerCompat.AccessibilityStateChangeListenerWrapper
                if (r0 != 0) goto La
                r0 = 0
                return r0
            La:
                r0 = r4
                androidx.core.view.accessibility.AccessibilityManagerCompat$AccessibilityStateChangeListenerWrapper r0 = (androidx.core.view.accessibility.AccessibilityManagerCompat.AccessibilityStateChangeListenerWrapper) r0
                androidx.core.view.accessibility.AccessibilityManagerCompat$AccessibilityStateChangeListener r1 = r3.mListener
                androidx.core.view.accessibility.AccessibilityManagerCompat$AccessibilityStateChangeListener r2 = r0.mListener
                boolean r1 = r1.equals(r2)
                return r1
        }

        public int hashCode() {
                r1 = this;
                androidx.core.view.accessibility.AccessibilityManagerCompat$AccessibilityStateChangeListener r0 = r1.mListener
                int r0 = r0.hashCode()
                return r0
        }

        @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
        public void onAccessibilityStateChanged(boolean r2) {
                r1 = this;
                androidx.core.view.accessibility.AccessibilityManagerCompat$AccessibilityStateChangeListener r0 = r1.mListener
                r0.onAccessibilityStateChanged(r2)
                return
        }
    }

    static class Api34Impl {
        private Api34Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static boolean isRequestFromAccessibilityTool(android.view.accessibility.AccessibilityManager r1) {
                boolean r0 = r1.isRequestFromAccessibilityTool()
                return r0
        }
    }

    public interface TouchExplorationStateChangeListener {
        void onTouchExplorationStateChanged(boolean r1);
    }

    private static final class TouchExplorationStateChangeListenerWrapper implements android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener {
        final androidx.core.view.accessibility.AccessibilityManagerCompat.TouchExplorationStateChangeListener mListener;

        TouchExplorationStateChangeListenerWrapper(androidx.core.view.accessibility.AccessibilityManagerCompat.TouchExplorationStateChangeListener r1) {
                r0 = this;
                r0.<init>()
                r0.mListener = r1
                return
        }

        public boolean equals(java.lang.Object r4) {
                r3 = this;
                if (r3 != r4) goto L4
                r0 = 1
                return r0
            L4:
                boolean r0 = r4 instanceof androidx.core.view.accessibility.AccessibilityManagerCompat.TouchExplorationStateChangeListenerWrapper
                if (r0 != 0) goto La
                r0 = 0
                return r0
            La:
                r0 = r4
                androidx.core.view.accessibility.AccessibilityManagerCompat$TouchExplorationStateChangeListenerWrapper r0 = (androidx.core.view.accessibility.AccessibilityManagerCompat.TouchExplorationStateChangeListenerWrapper) r0
                androidx.core.view.accessibility.AccessibilityManagerCompat$TouchExplorationStateChangeListener r1 = r3.mListener
                androidx.core.view.accessibility.AccessibilityManagerCompat$TouchExplorationStateChangeListener r2 = r0.mListener
                boolean r1 = r1.equals(r2)
                return r1
        }

        public int hashCode() {
                r1 = this;
                androidx.core.view.accessibility.AccessibilityManagerCompat$TouchExplorationStateChangeListener r0 = r1.mListener
                int r0 = r0.hashCode()
                return r0
        }

        @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
        public void onTouchExplorationStateChanged(boolean r2) {
                r1 = this;
                androidx.core.view.accessibility.AccessibilityManagerCompat$TouchExplorationStateChangeListener r0 = r1.mListener
                r0.onTouchExplorationStateChanged(r2)
                return
        }
    }

    private AccessibilityManagerCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    @java.lang.Deprecated
    public static boolean addAccessibilityStateChangeListener(android.view.accessibility.AccessibilityManager r1, androidx.core.view.accessibility.AccessibilityManagerCompat.AccessibilityStateChangeListener r2) {
            if (r2 != 0) goto L4
            r0 = 0
            return r0
        L4:
            androidx.core.view.accessibility.AccessibilityManagerCompat$AccessibilityStateChangeListenerWrapper r0 = new androidx.core.view.accessibility.AccessibilityManagerCompat$AccessibilityStateChangeListenerWrapper
            r0.<init>(r2)
            boolean r0 = r1.addAccessibilityStateChangeListener(r0)
            return r0
    }

    @androidx.annotation.ReplaceWith(expression = "manager.addTouchExplorationStateChangeListener(listener)")
    @java.lang.Deprecated
    public static boolean addTouchExplorationStateChangeListener(android.view.accessibility.AccessibilityManager r1, androidx.core.view.accessibility.AccessibilityManagerCompat.TouchExplorationStateChangeListener r2) {
            androidx.core.view.accessibility.AccessibilityManagerCompat$TouchExplorationStateChangeListenerWrapper r0 = new androidx.core.view.accessibility.AccessibilityManagerCompat$TouchExplorationStateChangeListenerWrapper
            r0.<init>(r2)
            boolean r0 = r1.addTouchExplorationStateChangeListener(r0)
            return r0
    }

    @androidx.annotation.ReplaceWith(expression = "manager.getEnabledAccessibilityServiceList(feedbackTypeFlags)")
    @java.lang.Deprecated
    public static java.util.List<android.accessibilityservice.AccessibilityServiceInfo> getEnabledAccessibilityServiceList(android.view.accessibility.AccessibilityManager r1, int r2) {
            java.util.List r0 = r1.getEnabledAccessibilityServiceList(r2)
            return r0
    }

    @androidx.annotation.ReplaceWith(expression = "manager.getInstalledAccessibilityServiceList()")
    @java.lang.Deprecated
    public static java.util.List<android.accessibilityservice.AccessibilityServiceInfo> getInstalledAccessibilityServiceList(android.view.accessibility.AccessibilityManager r1) {
            java.util.List r0 = r1.getInstalledAccessibilityServiceList()
            return r0
    }

    public static boolean isRequestFromAccessibilityTool(android.view.accessibility.AccessibilityManager r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto Lb
            boolean r0 = androidx.core.view.accessibility.AccessibilityManagerCompat.Api34Impl.isRequestFromAccessibilityTool(r2)
            return r0
        Lb:
            r0 = 1
            return r0
    }

    @androidx.annotation.ReplaceWith(expression = "manager.isTouchExplorationEnabled()")
    @java.lang.Deprecated
    public static boolean isTouchExplorationEnabled(android.view.accessibility.AccessibilityManager r1) {
            boolean r0 = r1.isTouchExplorationEnabled()
            return r0
    }

    @java.lang.Deprecated
    public static boolean removeAccessibilityStateChangeListener(android.view.accessibility.AccessibilityManager r1, androidx.core.view.accessibility.AccessibilityManagerCompat.AccessibilityStateChangeListener r2) {
            if (r2 != 0) goto L4
            r0 = 0
            return r0
        L4:
            androidx.core.view.accessibility.AccessibilityManagerCompat$AccessibilityStateChangeListenerWrapper r0 = new androidx.core.view.accessibility.AccessibilityManagerCompat$AccessibilityStateChangeListenerWrapper
            r0.<init>(r2)
            boolean r0 = r1.removeAccessibilityStateChangeListener(r0)
            return r0
    }

    @androidx.annotation.ReplaceWith(expression = "manager.removeTouchExplorationStateChangeListener(listener)")
    @java.lang.Deprecated
    public static boolean removeTouchExplorationStateChangeListener(android.view.accessibility.AccessibilityManager r1, androidx.core.view.accessibility.AccessibilityManagerCompat.TouchExplorationStateChangeListener r2) {
            androidx.core.view.accessibility.AccessibilityManagerCompat$TouchExplorationStateChangeListenerWrapper r0 = new androidx.core.view.accessibility.AccessibilityManagerCompat$TouchExplorationStateChangeListenerWrapper
            r0.<init>(r2)
            boolean r0 = r1.removeTouchExplorationStateChangeListener(r0)
            return r0
    }
}
