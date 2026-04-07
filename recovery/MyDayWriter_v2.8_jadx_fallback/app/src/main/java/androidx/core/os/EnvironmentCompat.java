package androidx.core.os;

/* JADX INFO: loaded from: classes.dex */
public final class EnvironmentCompat {

    @java.lang.Deprecated
    public static final java.lang.String MEDIA_UNKNOWN = "unknown";

    static class Api21Impl {
        private Api21Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static java.lang.String getExternalStorageState(java.io.File r1) {
                java.lang.String r0 = android.os.Environment.getExternalStorageState(r1)
                return r0
        }
    }

    private EnvironmentCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String getStorageState(java.io.File r1) {
            java.lang.String r0 = androidx.core.os.EnvironmentCompat.Api21Impl.getExternalStorageState(r1)
            return r0
    }
}
