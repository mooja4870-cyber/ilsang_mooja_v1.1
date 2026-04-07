package com.getcapacitor.util;

/* JADX INFO: loaded from: classes2.dex */
public class PermissionHelper {
    public PermissionHelper() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String[] getManifestPermissions(android.content.Context r5) {
            r0 = 0
            android.content.pm.PackageManager r1 = r5.getPackageManager()     // Catch: java.lang.Exception -> L15
            java.lang.String r2 = r5.getPackageName()     // Catch: java.lang.Exception -> L15
            r3 = 4096(0x1000, double:2.0237E-320)
            android.content.pm.PackageInfo r2 = com.getcapacitor.util.InternalUtils.getPackageInfo(r1, r2, r3)     // Catch: java.lang.Exception -> L15
            if (r2 == 0) goto L16
            java.lang.String[] r3 = r2.requestedPermissions     // Catch: java.lang.Exception -> L15
            r0 = r3
            goto L16
        L15:
            r1 = move-exception
        L16:
            return r0
    }

    public static java.lang.String[] getUndefinedPermissions(android.content.Context r8, java.lang.String[] r9) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String[] r1 = getManifestPermissions(r8)
            if (r1 == 0) goto L37
            int r2 = r1.length
            if (r2 <= 0) goto L37
            java.util.List r2 = java.util.Arrays.asList(r1)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r2)
            int r4 = r9.length
            r5 = 0
        L19:
            if (r5 >= r4) goto L29
            r6 = r9[r5]
            boolean r7 = r3.contains(r6)
            if (r7 != 0) goto L26
            r0.add(r6)
        L26:
            int r5 = r5 + 1
            goto L19
        L29:
            int r4 = r0.size()
            java.lang.String[] r4 = new java.lang.String[r4]
            java.lang.Object[] r5 = r0.toArray(r4)
            r4 = r5
            java.lang.String[] r4 = (java.lang.String[]) r4
            return r4
        L37:
            return r9
    }

    public static boolean hasDefinedPermission(android.content.Context r5, java.lang.String r6) {
            r0 = 0
            java.lang.String[] r1 = getManifestPermissions(r5)
            if (r1 == 0) goto L1a
            int r2 = r1.length
            if (r2 <= 0) goto L1a
            java.util.List r2 = java.util.Arrays.asList(r1)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r2)
            boolean r4 = r3.contains(r6)
            if (r4 == 0) goto L1a
            r0 = 1
        L1a:
            return r0
    }

    public static boolean hasDefinedPermissions(android.content.Context r5, java.lang.String[] r6) {
            int r0 = r6.length
            r1 = 0
            r2 = r1
        L3:
            if (r2 >= r0) goto L11
            r3 = r6[r2]
            boolean r4 = hasDefinedPermission(r5, r3)
            if (r4 != 0) goto Le
            return r1
        Le:
            int r2 = r2 + 1
            goto L3
        L11:
            r0 = 1
            return r0
    }

    public static boolean hasPermissions(android.content.Context r5, java.lang.String[] r6) {
            int r0 = r6.length
            r1 = 0
            r2 = r1
        L3:
            if (r2 >= r0) goto L11
            r3 = r6[r2]
            int r4 = androidx.core.app.ActivityCompat.checkSelfPermission(r5, r3)
            if (r4 == 0) goto Le
            return r1
        Le:
            int r2 = r2 + 1
            goto L3
        L11:
            r0 = 1
            return r0
    }
}
