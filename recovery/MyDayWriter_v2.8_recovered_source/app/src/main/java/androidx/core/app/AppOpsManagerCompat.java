package androidx.core.app;

/* JADX INFO: loaded from: classes.dex */
public final class AppOpsManagerCompat {
    public static final int MODE_ALLOWED = 0;
    public static final int MODE_DEFAULT = 3;
    public static final int MODE_ERRORED = 2;
    public static final int MODE_IGNORED = 1;

    static class Api23Impl {
        private Api23Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static <T> T getSystemService(android.content.Context r1, java.lang.Class<T> r2) {
                java.lang.Object r0 = r1.getSystemService(r2)
                return r0
        }

        static int noteProxyOp(android.app.AppOpsManager r1, java.lang.String r2, java.lang.String r3) {
                int r0 = r1.noteProxyOp(r2, r3)
                return r0
        }

        static int noteProxyOpNoThrow(android.app.AppOpsManager r1, java.lang.String r2, java.lang.String r3) {
                int r0 = r1.noteProxyOpNoThrow(r2, r3)
                return r0
        }

        static java.lang.String permissionToOp(java.lang.String r1) {
                java.lang.String r0 = android.app.AppOpsManager.permissionToOp(r1)
                return r0
        }
    }

    static class Api29Impl {
        private Api29Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static int checkOpNoThrow(android.app.AppOpsManager r1, java.lang.String r2, int r3, java.lang.String r4) {
                if (r1 != 0) goto L4
                r0 = 1
                return r0
            L4:
                int r0 = r1.checkOpNoThrow(r2, r3, r4)
                return r0
        }

        static java.lang.String getOpPackageName(android.content.Context r1) {
                java.lang.String r0 = r1.getOpPackageName()
                return r0
        }

        static android.app.AppOpsManager getSystemService(android.content.Context r1) {
                java.lang.Class<android.app.AppOpsManager> r0 = android.app.AppOpsManager.class
                java.lang.Object r0 = r1.getSystemService(r0)
                android.app.AppOpsManager r0 = (android.app.AppOpsManager) r0
                return r0
        }
    }

    private AppOpsManagerCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static int checkOrNoteProxyOp(android.content.Context r5, int r6, java.lang.String r7, java.lang.String r8) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L1e
            android.app.AppOpsManager r0 = androidx.core.app.AppOpsManagerCompat.Api29Impl.getSystemService(r5)
            int r1 = android.os.Binder.getCallingUid()
            int r2 = androidx.core.app.AppOpsManagerCompat.Api29Impl.checkOpNoThrow(r0, r7, r1, r8)
            if (r2 == 0) goto L15
            return r2
        L15:
            java.lang.String r3 = androidx.core.app.AppOpsManagerCompat.Api29Impl.getOpPackageName(r5)
            int r4 = androidx.core.app.AppOpsManagerCompat.Api29Impl.checkOpNoThrow(r0, r7, r6, r3)
            return r4
        L1e:
            int r0 = noteProxyOpNoThrow(r5, r7, r8)
            return r0
    }

    public static int noteOp(android.content.Context r2, java.lang.String r3, int r4, java.lang.String r5) {
            java.lang.String r0 = "appops"
            java.lang.Object r0 = r2.getSystemService(r0)
            android.app.AppOpsManager r0 = (android.app.AppOpsManager) r0
            int r1 = r0.noteOp(r3, r4, r5)
            return r1
    }

    public static int noteOpNoThrow(android.content.Context r2, java.lang.String r3, int r4, java.lang.String r5) {
            java.lang.String r0 = "appops"
            java.lang.Object r0 = r2.getSystemService(r0)
            android.app.AppOpsManager r0 = (android.app.AppOpsManager) r0
            int r1 = r0.noteOpNoThrow(r3, r4, r5)
            return r1
    }

    public static int noteProxyOp(android.content.Context r2, java.lang.String r3, java.lang.String r4) {
            java.lang.Class<android.app.AppOpsManager> r0 = android.app.AppOpsManager.class
            java.lang.Object r0 = androidx.core.app.AppOpsManagerCompat.Api23Impl.getSystemService(r2, r0)
            android.app.AppOpsManager r0 = (android.app.AppOpsManager) r0
            int r1 = androidx.core.app.AppOpsManagerCompat.Api23Impl.noteProxyOp(r0, r3, r4)
            return r1
    }

    public static int noteProxyOpNoThrow(android.content.Context r2, java.lang.String r3, java.lang.String r4) {
            java.lang.Class<android.app.AppOpsManager> r0 = android.app.AppOpsManager.class
            java.lang.Object r0 = androidx.core.app.AppOpsManagerCompat.Api23Impl.getSystemService(r2, r0)
            android.app.AppOpsManager r0 = (android.app.AppOpsManager) r0
            int r1 = androidx.core.app.AppOpsManagerCompat.Api23Impl.noteProxyOpNoThrow(r0, r3, r4)
            return r1
    }

    public static java.lang.String permissionToOp(java.lang.String r1) {
            java.lang.String r0 = androidx.core.app.AppOpsManagerCompat.Api23Impl.permissionToOp(r1)
            return r0
    }
}
