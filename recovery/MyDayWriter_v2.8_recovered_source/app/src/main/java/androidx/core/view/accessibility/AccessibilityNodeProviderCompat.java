package androidx.core.view.accessibility;

/* JADX INFO: loaded from: classes.dex */
public class AccessibilityNodeProviderCompat {
    public static final int HOST_VIEW_ID = -1;
    private final java.lang.Object mProvider;

    static class AccessibilityNodeProviderApi19 extends android.view.accessibility.AccessibilityNodeProvider {
        final androidx.core.view.accessibility.AccessibilityNodeProviderCompat mCompat;

        AccessibilityNodeProviderApi19(androidx.core.view.accessibility.AccessibilityNodeProviderCompat r1) {
                r0 = this;
                r0.<init>()
                r0.mCompat = r1
                return
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public android.view.accessibility.AccessibilityNodeInfo createAccessibilityNodeInfo(int r3) {
                r2 = this;
                androidx.core.view.accessibility.AccessibilityNodeProviderCompat r0 = r2.mCompat
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat r0 = r0.createAccessibilityNodeInfo(r3)
                if (r0 != 0) goto La
                r1 = 0
                return r1
            La:
                android.view.accessibility.AccessibilityNodeInfo r1 = r0.unwrap()
                return r1
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public java.util.List<android.view.accessibility.AccessibilityNodeInfo> findAccessibilityNodeInfosByText(java.lang.String r7, int r8) {
                r6 = this;
                androidx.core.view.accessibility.AccessibilityNodeProviderCompat r0 = r6.mCompat
                java.util.List r0 = r0.findAccessibilityNodeInfosByText(r7, r8)
                if (r0 != 0) goto La
                r1 = 0
                return r1
            La:
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                int r2 = r0.size()
                r3 = 0
            L14:
                if (r3 >= r2) goto L26
                java.lang.Object r4 = r0.get(r3)
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat r4 = (androidx.core.view.accessibility.AccessibilityNodeInfoCompat) r4
                android.view.accessibility.AccessibilityNodeInfo r5 = r4.unwrap()
                r1.add(r5)
                int r3 = r3 + 1
                goto L14
            L26:
                return r1
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public android.view.accessibility.AccessibilityNodeInfo findFocus(int r3) {
                r2 = this;
                androidx.core.view.accessibility.AccessibilityNodeProviderCompat r0 = r2.mCompat
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat r0 = r0.findFocus(r3)
                if (r0 != 0) goto La
                r1 = 0
                return r1
            La:
                android.view.accessibility.AccessibilityNodeInfo r1 = r0.unwrap()
                return r1
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public boolean performAction(int r2, int r3, android.os.Bundle r4) {
                r1 = this;
                androidx.core.view.accessibility.AccessibilityNodeProviderCompat r0 = r1.mCompat
                boolean r0 = r0.performAction(r2, r3, r4)
                return r0
        }
    }

    static class AccessibilityNodeProviderApi26 extends androidx.core.view.accessibility.AccessibilityNodeProviderCompat.AccessibilityNodeProviderApi19 {
        AccessibilityNodeProviderApi26(androidx.core.view.accessibility.AccessibilityNodeProviderCompat r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public void addExtraDataToAccessibilityNodeInfo(int r3, android.view.accessibility.AccessibilityNodeInfo r4, java.lang.String r5, android.os.Bundle r6) {
                r2 = this;
                androidx.core.view.accessibility.AccessibilityNodeProviderCompat r0 = r2.mCompat
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat r1 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.wrap(r4)
                r0.addExtraDataToAccessibilityNodeInfo(r3, r1, r5, r6)
                return
        }
    }

    public AccessibilityNodeProviderCompat() {
            r2 = this;
            r2.<init>()
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L11
            androidx.core.view.accessibility.AccessibilityNodeProviderCompat$AccessibilityNodeProviderApi26 r0 = new androidx.core.view.accessibility.AccessibilityNodeProviderCompat$AccessibilityNodeProviderApi26
            r0.<init>(r2)
            r2.mProvider = r0
            goto L18
        L11:
            androidx.core.view.accessibility.AccessibilityNodeProviderCompat$AccessibilityNodeProviderApi19 r0 = new androidx.core.view.accessibility.AccessibilityNodeProviderCompat$AccessibilityNodeProviderApi19
            r0.<init>(r2)
            r2.mProvider = r0
        L18:
            return
    }

    public AccessibilityNodeProviderCompat(java.lang.Object r1) {
            r0 = this;
            r0.<init>()
            r0.mProvider = r1
            return
    }

    public void addExtraDataToAccessibilityNodeInfo(int r1, androidx.core.view.accessibility.AccessibilityNodeInfoCompat r2, java.lang.String r3, android.os.Bundle r4) {
            r0 = this;
            return
    }

    public androidx.core.view.accessibility.AccessibilityNodeInfoCompat createAccessibilityNodeInfo(int r2) {
            r1 = this;
            r0 = 0
            return r0
    }

    public java.util.List<androidx.core.view.accessibility.AccessibilityNodeInfoCompat> findAccessibilityNodeInfosByText(java.lang.String r2, int r3) {
            r1 = this;
            r0 = 0
            return r0
    }

    public androidx.core.view.accessibility.AccessibilityNodeInfoCompat findFocus(int r2) {
            r1 = this;
            r0 = 0
            return r0
    }

    public java.lang.Object getProvider() {
            r1 = this;
            java.lang.Object r0 = r1.mProvider
            return r0
    }

    public boolean performAction(int r2, int r3, android.os.Bundle r4) {
            r1 = this;
            r0 = 0
            return r0
    }
}
