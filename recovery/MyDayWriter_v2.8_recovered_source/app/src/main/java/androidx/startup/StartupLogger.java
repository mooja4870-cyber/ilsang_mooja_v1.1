package androidx.startup;

/* JADX INFO: loaded from: classes.dex */
public final class StartupLogger {
    static final boolean DEBUG = false;
    private static final java.lang.String TAG = "StartupLogger";

    private StartupLogger() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void e(java.lang.String r1, java.lang.Throwable r2) {
            java.lang.String r0 = "StartupLogger"
            android.util.Log.e(r0, r1, r2)
            return
    }

    public static void i(java.lang.String r1) {
            java.lang.String r0 = "StartupLogger"
            android.util.Log.i(r0, r1)
            return
    }

    public static void w(java.lang.String r1) {
            java.lang.String r0 = "StartupLogger"
            android.util.Log.w(r0, r1)
            return
    }
}
