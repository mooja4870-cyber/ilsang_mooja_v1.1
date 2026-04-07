package androidx.core.app;

/* JADX INFO: loaded from: classes.dex */
@java.lang.Deprecated
public final class BundleCompat {
    private BundleCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.ReplaceWith(expression = "bundle.getBinder(key)")
    @java.lang.Deprecated
    public static android.os.IBinder getBinder(android.os.Bundle r1, java.lang.String r2) {
            android.os.IBinder r0 = r1.getBinder(r2)
            return r0
    }

    @androidx.annotation.ReplaceWith(expression = "bundle.putBinder(key, binder)")
    @java.lang.Deprecated
    public static void putBinder(android.os.Bundle r0, java.lang.String r1, android.os.IBinder r2) {
            r0.putBinder(r1, r2)
            return
    }
}
