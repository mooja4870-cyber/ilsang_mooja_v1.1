package androidx.core.view.accessibility;

/* JADX INFO: loaded from: classes.dex */
public class AccessibilityWindowInfoCompat {
    public static final int TYPE_ACCESSIBILITY_OVERLAY = 4;
    public static final int TYPE_APPLICATION = 1;
    public static final int TYPE_INPUT_METHOD = 2;
    public static final int TYPE_MAGNIFICATION_OVERLAY = 6;
    public static final int TYPE_SPLIT_SCREEN_DIVIDER = 5;
    public static final int TYPE_SYSTEM = 3;
    private static final int UNDEFINED = -1;
    private final java.lang.Object mInfo;

    private static class Api21Impl {
        private Api21Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static void getBoundsInScreen(android.view.accessibility.AccessibilityWindowInfo r0, android.graphics.Rect r1) {
                r0.getBoundsInScreen(r1)
                return
        }

        static android.view.accessibility.AccessibilityWindowInfo getChild(android.view.accessibility.AccessibilityWindowInfo r1, int r2) {
                android.view.accessibility.AccessibilityWindowInfo r0 = r1.getChild(r2)
                return r0
        }

        static int getChildCount(android.view.accessibility.AccessibilityWindowInfo r1) {
                int r0 = r1.getChildCount()
                return r0
        }

        static int getId(android.view.accessibility.AccessibilityWindowInfo r1) {
                int r0 = r1.getId()
                return r0
        }

        static int getLayer(android.view.accessibility.AccessibilityWindowInfo r1) {
                int r0 = r1.getLayer()
                return r0
        }

        static android.view.accessibility.AccessibilityWindowInfo getParent(android.view.accessibility.AccessibilityWindowInfo r1) {
                android.view.accessibility.AccessibilityWindowInfo r0 = r1.getParent()
                return r0
        }

        static android.view.accessibility.AccessibilityNodeInfo getRoot(android.view.accessibility.AccessibilityWindowInfo r1) {
                android.view.accessibility.AccessibilityNodeInfo r0 = r1.getRoot()
                return r0
        }

        static int getType(android.view.accessibility.AccessibilityWindowInfo r1) {
                int r0 = r1.getType()
                return r0
        }

        static boolean isAccessibilityFocused(android.view.accessibility.AccessibilityWindowInfo r1) {
                boolean r0 = r1.isAccessibilityFocused()
                return r0
        }

        static boolean isActive(android.view.accessibility.AccessibilityWindowInfo r1) {
                boolean r0 = r1.isActive()
                return r0
        }

        static boolean isFocused(android.view.accessibility.AccessibilityWindowInfo r1) {
                boolean r0 = r1.isFocused()
                return r0
        }

        static android.view.accessibility.AccessibilityWindowInfo obtain() {
                android.view.accessibility.AccessibilityWindowInfo r0 = android.view.accessibility.AccessibilityWindowInfo.obtain()
                return r0
        }

        static android.view.accessibility.AccessibilityWindowInfo obtain(android.view.accessibility.AccessibilityWindowInfo r1) {
                android.view.accessibility.AccessibilityWindowInfo r0 = android.view.accessibility.AccessibilityWindowInfo.obtain(r1)
                return r0
        }
    }

    private static class Api24Impl {
        private Api24Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static android.view.accessibility.AccessibilityNodeInfo getAnchor(android.view.accessibility.AccessibilityWindowInfo r1) {
                android.view.accessibility.AccessibilityNodeInfo r0 = r1.getAnchor()
                return r0
        }

        static java.lang.CharSequence getTitle(android.view.accessibility.AccessibilityWindowInfo r1) {
                java.lang.CharSequence r0 = r1.getTitle()
                return r0
        }
    }

    private static class Api26Impl {
        private Api26Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static boolean isInPictureInPictureMode(android.view.accessibility.AccessibilityWindowInfo r1) {
                boolean r0 = r1.isInPictureInPictureMode()
                return r0
        }
    }

    private static class Api30Impl {
        private Api30Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static android.view.accessibility.AccessibilityWindowInfo instantiateAccessibilityWindowInfo() {
                android.view.accessibility.AccessibilityWindowInfo r0 = new android.view.accessibility.AccessibilityWindowInfo
                r0.<init>()
                return r0
        }
    }

    private static class Api33Impl {
        private Api33Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static int getDisplayId(android.view.accessibility.AccessibilityWindowInfo r1) {
                int r0 = r1.getDisplayId()
                return r0
        }

        static void getRegionInScreen(android.view.accessibility.AccessibilityWindowInfo r0, android.graphics.Region r1) {
                r0.getRegionInScreen(r1)
                return
        }

        public static androidx.core.view.accessibility.AccessibilityNodeInfoCompat getRoot(java.lang.Object r1, int r2) {
                r0 = r1
                android.view.accessibility.AccessibilityWindowInfo r0 = (android.view.accessibility.AccessibilityWindowInfo) r0
                android.view.accessibility.AccessibilityNodeInfo r0 = r0.getRoot(r2)
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat r0 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.wrapNonNullInstance(r0)
                return r0
        }
    }

    private static class Api34Impl {
        private Api34Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static android.os.LocaleList getLocales(android.view.accessibility.AccessibilityWindowInfo r1) {
                android.os.LocaleList r0 = r1.getLocales()
                return r0
        }

        public static long getTransitionTimeMillis(android.view.accessibility.AccessibilityWindowInfo r2) {
                long r0 = r2.getTransitionTimeMillis()
                return r0
        }
    }

    public AccessibilityWindowInfoCompat() {
            r2 = this;
            r2.<init>()
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto L10
            android.view.accessibility.AccessibilityWindowInfo r0 = androidx.core.view.accessibility.AccessibilityWindowInfoCompat.Api30Impl.instantiateAccessibilityWindowInfo()
            r2.mInfo = r0
            goto L13
        L10:
            r0 = 0
            r2.mInfo = r0
        L13:
            return
    }

    private AccessibilityWindowInfoCompat(java.lang.Object r1) {
            r0 = this;
            r0.<init>()
            r0.mInfo = r1
            return
    }

    public static androidx.core.view.accessibility.AccessibilityWindowInfoCompat obtain() {
            android.view.accessibility.AccessibilityWindowInfo r0 = androidx.core.view.accessibility.AccessibilityWindowInfoCompat.Api21Impl.obtain()
            androidx.core.view.accessibility.AccessibilityWindowInfoCompat r0 = wrapNonNullInstance(r0)
            return r0
    }

    public static androidx.core.view.accessibility.AccessibilityWindowInfoCompat obtain(androidx.core.view.accessibility.AccessibilityWindowInfoCompat r1) {
            if (r1 != 0) goto L5
            r0 = 0
            goto L11
        L5:
            java.lang.Object r0 = r1.mInfo
            android.view.accessibility.AccessibilityWindowInfo r0 = (android.view.accessibility.AccessibilityWindowInfo) r0
            android.view.accessibility.AccessibilityWindowInfo r0 = androidx.core.view.accessibility.AccessibilityWindowInfoCompat.Api21Impl.obtain(r0)
            androidx.core.view.accessibility.AccessibilityWindowInfoCompat r0 = wrapNonNullInstance(r0)
        L11:
            return r0
    }

    private static java.lang.String typeToString(int r1) {
            switch(r1) {
                case 1: goto Lf;
                case 2: goto Lc;
                case 3: goto L9;
                case 4: goto L6;
                default: goto L3;
            }
        L3:
            java.lang.String r0 = "<UNKNOWN>"
            return r0
        L6:
            java.lang.String r0 = "TYPE_ACCESSIBILITY_OVERLAY"
            return r0
        L9:
            java.lang.String r0 = "TYPE_SYSTEM"
            return r0
        Lc:
            java.lang.String r0 = "TYPE_INPUT_METHOD"
            return r0
        Lf:
            java.lang.String r0 = "TYPE_APPLICATION"
            return r0
    }

    static androidx.core.view.accessibility.AccessibilityWindowInfoCompat wrapNonNullInstance(java.lang.Object r1) {
            if (r1 == 0) goto L8
            androidx.core.view.accessibility.AccessibilityWindowInfoCompat r0 = new androidx.core.view.accessibility.AccessibilityWindowInfoCompat
            r0.<init>(r1)
            return r0
        L8:
            r0 = 0
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 != 0) goto L8
            return r1
        L8:
            boolean r2 = r5 instanceof androidx.core.view.accessibility.AccessibilityWindowInfoCompat
            if (r2 != 0) goto Ld
            return r1
        Ld:
            r2 = r5
            androidx.core.view.accessibility.AccessibilityWindowInfoCompat r2 = (androidx.core.view.accessibility.AccessibilityWindowInfoCompat) r2
            java.lang.Object r3 = r4.mInfo
            if (r3 != 0) goto L1b
            java.lang.Object r3 = r2.mInfo
            if (r3 != 0) goto L19
            goto L1a
        L19:
            r0 = r1
        L1a:
            return r0
        L1b:
            java.lang.Object r0 = r4.mInfo
            java.lang.Object r1 = r2.mInfo
            boolean r0 = r0.equals(r1)
            return r0
    }

    public androidx.core.view.accessibility.AccessibilityNodeInfoCompat getAnchor() {
            r1 = this;
            java.lang.Object r0 = r1.mInfo
            android.view.accessibility.AccessibilityWindowInfo r0 = (android.view.accessibility.AccessibilityWindowInfo) r0
            android.view.accessibility.AccessibilityNodeInfo r0 = androidx.core.view.accessibility.AccessibilityWindowInfoCompat.Api24Impl.getAnchor(r0)
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat r0 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.wrapNonNullInstance(r0)
            return r0
    }

    public void getBoundsInScreen(android.graphics.Rect r2) {
            r1 = this;
            java.lang.Object r0 = r1.mInfo
            android.view.accessibility.AccessibilityWindowInfo r0 = (android.view.accessibility.AccessibilityWindowInfo) r0
            androidx.core.view.accessibility.AccessibilityWindowInfoCompat.Api21Impl.getBoundsInScreen(r0, r2)
            return
    }

    public androidx.core.view.accessibility.AccessibilityWindowInfoCompat getChild(int r2) {
            r1 = this;
            java.lang.Object r0 = r1.mInfo
            android.view.accessibility.AccessibilityWindowInfo r0 = (android.view.accessibility.AccessibilityWindowInfo) r0
            android.view.accessibility.AccessibilityWindowInfo r0 = androidx.core.view.accessibility.AccessibilityWindowInfoCompat.Api21Impl.getChild(r0, r2)
            androidx.core.view.accessibility.AccessibilityWindowInfoCompat r0 = wrapNonNullInstance(r0)
            return r0
    }

    public int getChildCount() {
            r1 = this;
            java.lang.Object r0 = r1.mInfo
            android.view.accessibility.AccessibilityWindowInfo r0 = (android.view.accessibility.AccessibilityWindowInfo) r0
            int r0 = androidx.core.view.accessibility.AccessibilityWindowInfoCompat.Api21Impl.getChildCount(r0)
            return r0
    }

    public int getDisplayId() {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 < r1) goto Lf
            java.lang.Object r0 = r2.mInfo
            android.view.accessibility.AccessibilityWindowInfo r0 = (android.view.accessibility.AccessibilityWindowInfo) r0
            int r0 = androidx.core.view.accessibility.AccessibilityWindowInfoCompat.Api33Impl.getDisplayId(r0)
            return r0
        Lf:
            r0 = 0
            return r0
    }

    public int getId() {
            r1 = this;
            java.lang.Object r0 = r1.mInfo
            android.view.accessibility.AccessibilityWindowInfo r0 = (android.view.accessibility.AccessibilityWindowInfo) r0
            int r0 = androidx.core.view.accessibility.AccessibilityWindowInfoCompat.Api21Impl.getId(r0)
            return r0
    }

    public int getLayer() {
            r1 = this;
            java.lang.Object r0 = r1.mInfo
            android.view.accessibility.AccessibilityWindowInfo r0 = (android.view.accessibility.AccessibilityWindowInfo) r0
            int r0 = androidx.core.view.accessibility.AccessibilityWindowInfoCompat.Api21Impl.getLayer(r0)
            return r0
    }

    public androidx.core.os.LocaleListCompat getLocales() {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto L13
            java.lang.Object r0 = r2.mInfo
            android.view.accessibility.AccessibilityWindowInfo r0 = (android.view.accessibility.AccessibilityWindowInfo) r0
            android.os.LocaleList r0 = androidx.core.view.accessibility.AccessibilityWindowInfoCompat.Api34Impl.getLocales(r0)
            androidx.core.os.LocaleListCompat r0 = androidx.core.os.LocaleListCompat.wrap(r0)
            return r0
        L13:
            androidx.core.os.LocaleListCompat r0 = androidx.core.os.LocaleListCompat.getEmptyLocaleList()
            return r0
    }

    public androidx.core.view.accessibility.AccessibilityWindowInfoCompat getParent() {
            r1 = this;
            java.lang.Object r0 = r1.mInfo
            android.view.accessibility.AccessibilityWindowInfo r0 = (android.view.accessibility.AccessibilityWindowInfo) r0
            android.view.accessibility.AccessibilityWindowInfo r0 = androidx.core.view.accessibility.AccessibilityWindowInfoCompat.Api21Impl.getParent(r0)
            androidx.core.view.accessibility.AccessibilityWindowInfoCompat r0 = wrapNonNullInstance(r0)
            return r0
    }

    public void getRegionInScreen(android.graphics.Region r3) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 < r1) goto Le
            java.lang.Object r0 = r2.mInfo
            android.view.accessibility.AccessibilityWindowInfo r0 = (android.view.accessibility.AccessibilityWindowInfo) r0
            androidx.core.view.accessibility.AccessibilityWindowInfoCompat.Api33Impl.getRegionInScreen(r0, r3)
            goto L1e
        Le:
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            java.lang.Object r1 = r2.mInfo
            android.view.accessibility.AccessibilityWindowInfo r1 = (android.view.accessibility.AccessibilityWindowInfo) r1
            androidx.core.view.accessibility.AccessibilityWindowInfoCompat.Api21Impl.getBoundsInScreen(r1, r0)
            r3.set(r0)
        L1e:
            return
    }

    public androidx.core.view.accessibility.AccessibilityNodeInfoCompat getRoot() {
            r1 = this;
            java.lang.Object r0 = r1.mInfo
            android.view.accessibility.AccessibilityWindowInfo r0 = (android.view.accessibility.AccessibilityWindowInfo) r0
            android.view.accessibility.AccessibilityNodeInfo r0 = androidx.core.view.accessibility.AccessibilityWindowInfoCompat.Api21Impl.getRoot(r0)
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat r0 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.wrapNonNullInstance(r0)
            return r0
    }

    public androidx.core.view.accessibility.AccessibilityNodeInfoCompat getRoot(int r3) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 < r1) goto Ld
            java.lang.Object r0 = r2.mInfo
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat r0 = androidx.core.view.accessibility.AccessibilityWindowInfoCompat.Api33Impl.getRoot(r0, r3)
            return r0
        Ld:
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat r0 = r2.getRoot()
            return r0
    }

    public java.lang.CharSequence getTitle() {
            r1 = this;
            java.lang.Object r0 = r1.mInfo
            android.view.accessibility.AccessibilityWindowInfo r0 = (android.view.accessibility.AccessibilityWindowInfo) r0
            java.lang.CharSequence r0 = androidx.core.view.accessibility.AccessibilityWindowInfoCompat.Api24Impl.getTitle(r0)
            return r0
    }

    public long getTransitionTimeMillis() {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto Lf
            java.lang.Object r0 = r2.mInfo
            android.view.accessibility.AccessibilityWindowInfo r0 = (android.view.accessibility.AccessibilityWindowInfo) r0
            long r0 = androidx.core.view.accessibility.AccessibilityWindowInfoCompat.Api34Impl.getTransitionTimeMillis(r0)
            return r0
        Lf:
            r0 = 0
            return r0
    }

    public int getType() {
            r1 = this;
            java.lang.Object r0 = r1.mInfo
            android.view.accessibility.AccessibilityWindowInfo r0 = (android.view.accessibility.AccessibilityWindowInfo) r0
            int r0 = androidx.core.view.accessibility.AccessibilityWindowInfoCompat.Api21Impl.getType(r0)
            return r0
    }

    public int hashCode() {
            r1 = this;
            java.lang.Object r0 = r1.mInfo
            if (r0 != 0) goto L6
            r0 = 0
            goto Lc
        L6:
            java.lang.Object r0 = r1.mInfo
            int r0 = r0.hashCode()
        Lc:
            return r0
    }

    public boolean isAccessibilityFocused() {
            r1 = this;
            java.lang.Object r0 = r1.mInfo
            android.view.accessibility.AccessibilityWindowInfo r0 = (android.view.accessibility.AccessibilityWindowInfo) r0
            boolean r0 = androidx.core.view.accessibility.AccessibilityWindowInfoCompat.Api21Impl.isAccessibilityFocused(r0)
            return r0
    }

    public boolean isActive() {
            r1 = this;
            java.lang.Object r0 = r1.mInfo
            android.view.accessibility.AccessibilityWindowInfo r0 = (android.view.accessibility.AccessibilityWindowInfo) r0
            boolean r0 = androidx.core.view.accessibility.AccessibilityWindowInfoCompat.Api21Impl.isActive(r0)
            return r0
    }

    public boolean isFocused() {
            r1 = this;
            java.lang.Object r0 = r1.mInfo
            android.view.accessibility.AccessibilityWindowInfo r0 = (android.view.accessibility.AccessibilityWindowInfo) r0
            boolean r0 = androidx.core.view.accessibility.AccessibilityWindowInfoCompat.Api21Impl.isFocused(r0)
            return r0
    }

    public boolean isInPictureInPictureMode() {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto Lf
            java.lang.Object r0 = r2.mInfo
            android.view.accessibility.AccessibilityWindowInfo r0 = (android.view.accessibility.AccessibilityWindowInfo) r0
            boolean r0 = androidx.core.view.accessibility.AccessibilityWindowInfoCompat.Api26Impl.isInPictureInPictureMode(r0)
            return r0
        Lf:
            r0 = 0
            return r0
    }

    @java.lang.Deprecated
    public void recycle() {
            r0 = this;
            return
    }

    public java.lang.String toString() {
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r6.getBoundsInScreen(r1)
            java.lang.String r2 = "AccessibilityWindowInfo["
            r0.append(r2)
            java.lang.String r2 = "id="
            java.lang.StringBuilder r2 = r0.append(r2)
            int r3 = r6.getId()
            r2.append(r3)
            java.lang.String r2 = ", type="
            java.lang.StringBuilder r2 = r0.append(r2)
            int r3 = r6.getType()
            java.lang.String r3 = typeToString(r3)
            r2.append(r3)
            java.lang.String r2 = ", layer="
            java.lang.StringBuilder r2 = r0.append(r2)
            int r3 = r6.getLayer()
            r2.append(r3)
            java.lang.String r2 = ", bounds="
            java.lang.StringBuilder r2 = r0.append(r2)
            r2.append(r1)
            java.lang.String r2 = ", focused="
            java.lang.StringBuilder r2 = r0.append(r2)
            boolean r3 = r6.isFocused()
            r2.append(r3)
            java.lang.String r2 = ", active="
            java.lang.StringBuilder r2 = r0.append(r2)
            boolean r3 = r6.isActive()
            r2.append(r3)
            java.lang.String r2 = ", hasParent="
            java.lang.StringBuilder r2 = r0.append(r2)
            androidx.core.view.accessibility.AccessibilityWindowInfoCompat r3 = r6.getParent()
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L70
            r3 = r4
            goto L71
        L70:
            r3 = r5
        L71:
            r2.append(r3)
            java.lang.String r2 = ", hasChildren="
            java.lang.StringBuilder r2 = r0.append(r2)
            int r3 = r6.getChildCount()
            if (r3 <= 0) goto L81
            goto L82
        L81:
            r4 = r5
        L82:
            r2.append(r4)
            java.lang.String r2 = ", transitionTime="
            java.lang.StringBuilder r2 = r0.append(r2)
            long r3 = r6.getTransitionTimeMillis()
            r2.append(r3)
            java.lang.String r2 = ", locales="
            java.lang.StringBuilder r2 = r0.append(r2)
            androidx.core.os.LocaleListCompat r3 = r6.getLocales()
            r2.append(r3)
            r2 = 93
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    public android.view.accessibility.AccessibilityWindowInfo unwrap() {
            r1 = this;
            java.lang.Object r0 = r1.mInfo
            android.view.accessibility.AccessibilityWindowInfo r0 = (android.view.accessibility.AccessibilityWindowInfo) r0
            return r0
    }
}
