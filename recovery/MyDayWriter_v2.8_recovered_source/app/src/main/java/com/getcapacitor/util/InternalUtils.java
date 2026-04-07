package com.getcapacitor.util;

/* JADX INFO: loaded from: classes2.dex */
public class InternalUtils {
    public InternalUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static android.content.pm.PackageInfo getPackageInfo(android.content.pm.PackageManager r2, java.lang.String r3) throws android.content.pm.PackageManager.NameNotFoundException {
            r0 = 0
            android.content.pm.PackageInfo r0 = getPackageInfo(r2, r3, r0)
            return r0
    }

    public static android.content.pm.PackageInfo getPackageInfo(android.content.pm.PackageManager r2, java.lang.String r3, long r4) throws android.content.pm.PackageManager.NameNotFoundException {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 < r1) goto Lf
            android.content.pm.PackageManager$PackageInfoFlags r0 = android.content.pm.PackageManager.PackageInfoFlags.of(r4)
            android.content.pm.PackageInfo r0 = r2.getPackageInfo(r3, r0)
            return r0
        Lf:
            int r0 = (int) r4
            long r0 = (long) r0
            android.content.pm.PackageInfo r0 = getPackageInfoLegacy(r2, r3, r0)
            return r0
    }

    private static android.content.pm.PackageInfo getPackageInfoLegacy(android.content.pm.PackageManager r1, java.lang.String r2, long r3) throws android.content.pm.PackageManager.NameNotFoundException {
            int r0 = (int) r3
            android.content.pm.PackageInfo r0 = r1.getPackageInfo(r2, r0)
            return r0
    }
}
