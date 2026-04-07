package androidx.core.app;

/* JADX INFO: loaded from: classes.dex */
public final class ActivityManagerCompat {
    private ActivityManagerCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.ReplaceWith(expression = "activityManager.isLowRamDevice()")
    @java.lang.Deprecated
    public static boolean isLowRamDevice(android.app.ActivityManager r1) {
            boolean r0 = r1.isLowRamDevice()
            return r0
    }
}
