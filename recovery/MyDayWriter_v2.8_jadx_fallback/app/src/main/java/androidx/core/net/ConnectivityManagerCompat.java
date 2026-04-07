package androidx.core.net;

/* JADX INFO: loaded from: classes.dex */
public final class ConnectivityManagerCompat {
    public static final int RESTRICT_BACKGROUND_STATUS_DISABLED = 1;
    public static final int RESTRICT_BACKGROUND_STATUS_ENABLED = 3;
    public static final int RESTRICT_BACKGROUND_STATUS_WHITELISTED = 2;

    static class Api24Impl {
        private Api24Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static int getRestrictBackgroundStatus(android.net.ConnectivityManager r1) {
                int r0 = r1.getRestrictBackgroundStatus()
                return r0
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface RestrictBackgroundStatus {
    }

    private ConnectivityManagerCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static android.net.NetworkInfo getNetworkInfoFromBroadcast(android.net.ConnectivityManager r2, android.content.Intent r3) {
            java.lang.String r0 = "networkInfo"
            android.os.Parcelable r0 = r3.getParcelableExtra(r0)
            android.net.NetworkInfo r0 = (android.net.NetworkInfo) r0
            if (r0 == 0) goto L13
            int r1 = r0.getType()
            android.net.NetworkInfo r1 = r2.getNetworkInfo(r1)
            return r1
        L13:
            r1 = 0
            return r1
    }

    public static int getRestrictBackgroundStatus(android.net.ConnectivityManager r1) {
            int r0 = androidx.core.net.ConnectivityManagerCompat.Api24Impl.getRestrictBackgroundStatus(r1)
            return r0
    }

    @androidx.annotation.ReplaceWith(expression = "cm.isActiveNetworkMetered()")
    @java.lang.Deprecated
    public static boolean isActiveNetworkMetered(android.net.ConnectivityManager r1) {
            boolean r0 = r1.isActiveNetworkMetered()
            return r0
    }
}
