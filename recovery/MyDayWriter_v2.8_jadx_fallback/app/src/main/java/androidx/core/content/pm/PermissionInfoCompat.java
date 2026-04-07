package androidx.core.content.pm;

/* JADX INFO: loaded from: classes.dex */
public final class PermissionInfoCompat {

    static class Api28Impl {
        private Api28Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static int getProtection(android.content.pm.PermissionInfo r1) {
                int r0 = r1.getProtection()
                return r0
        }

        static int getProtectionFlags(android.content.pm.PermissionInfo r1) {
                int r0 = r1.getProtectionFlags()
                return r0
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface Protection {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface ProtectionFlags {
    }

    private PermissionInfoCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static int getProtection(android.content.pm.PermissionInfo r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Lb
            int r0 = androidx.core.content.pm.PermissionInfoCompat.Api28Impl.getProtection(r2)
            return r0
        Lb:
            int r0 = r2.protectionLevel
            r0 = r0 & 15
            return r0
    }

    public static int getProtectionFlags(android.content.pm.PermissionInfo r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Lb
            int r0 = androidx.core.content.pm.PermissionInfoCompat.Api28Impl.getProtectionFlags(r2)
            return r0
        Lb:
            int r0 = r2.protectionLevel
            r0 = r0 & (-16)
            return r0
    }
}
