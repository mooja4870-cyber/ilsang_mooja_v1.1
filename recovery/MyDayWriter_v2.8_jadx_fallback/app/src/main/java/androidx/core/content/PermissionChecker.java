package androidx.core.content;

/* JADX INFO: loaded from: classes.dex */
public final class PermissionChecker {
    public static final int PERMISSION_DENIED = -1;
    public static final int PERMISSION_DENIED_APP_OP = -2;
    public static final int PERMISSION_GRANTED = 0;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface PermissionResult {
    }

    private PermissionChecker() {
            r0 = this;
            r0.<init>()
            return
    }

    public static int checkCallingOrSelfPermission(android.content.Context r3, java.lang.String r4) {
            int r0 = android.os.Binder.getCallingPid()
            int r1 = android.os.Process.myPid()
            if (r0 != r1) goto Lf
            java.lang.String r0 = r3.getPackageName()
            goto L10
        Lf:
            r0 = 0
        L10:
            int r1 = android.os.Binder.getCallingPid()
            int r2 = android.os.Binder.getCallingUid()
            int r1 = checkPermission(r3, r4, r1, r2, r0)
            return r1
    }

    public static int checkCallingPermission(android.content.Context r2, java.lang.String r3, java.lang.String r4) {
            int r0 = android.os.Binder.getCallingPid()
            int r1 = android.os.Process.myPid()
            if (r0 != r1) goto Lc
            r0 = -1
            return r0
        Lc:
            int r0 = android.os.Binder.getCallingPid()
            int r1 = android.os.Binder.getCallingUid()
            int r0 = checkPermission(r2, r3, r0, r1, r4)
            return r0
    }

    public static int checkPermission(android.content.Context r6, java.lang.String r7, int r8, int r9, java.lang.String r10) {
            int r0 = r6.checkPermission(r7, r8, r9)
            r1 = -1
            if (r0 != r1) goto L8
            return r1
        L8:
            java.lang.String r0 = androidx.core.app.AppOpsManagerCompat.permissionToOp(r7)
            r2 = 0
            if (r0 != 0) goto L10
            return r2
        L10:
            if (r10 != 0) goto L24
            android.content.pm.PackageManager r3 = r6.getPackageManager()
            java.lang.String[] r3 = r3.getPackagesForUid(r9)
            if (r3 == 0) goto L23
            int r4 = r3.length
            if (r4 > 0) goto L20
            goto L23
        L20:
            r10 = r3[r2]
            goto L24
        L23:
            return r1
        L24:
            int r1 = android.os.Process.myUid()
            java.lang.String r3 = r6.getPackageName()
            if (r1 != r9) goto L36
            boolean r4 = androidx.core.util.ObjectsCompat.equals(r3, r10)
            if (r4 == 0) goto L36
            r4 = 1
            goto L37
        L36:
            r4 = r2
        L37:
            if (r4 == 0) goto L3e
            int r5 = androidx.core.app.AppOpsManagerCompat.checkOrNoteProxyOp(r6, r9, r0, r10)
            goto L42
        L3e:
            int r5 = androidx.core.app.AppOpsManagerCompat.noteProxyOpNoThrow(r6, r0, r10)
        L42:
            if (r5 != 0) goto L45
            goto L46
        L45:
            r2 = -2
        L46:
            return r2
    }

    public static int checkSelfPermission(android.content.Context r3, java.lang.String r4) {
            int r0 = android.os.Process.myPid()
            int r1 = android.os.Process.myUid()
            java.lang.String r2 = r3.getPackageName()
            int r0 = checkPermission(r3, r4, r0, r1, r2)
            return r0
    }
}
