package androidx.core.app;

/* JADX INFO: loaded from: classes.dex */
public final class ServiceCompat {
    private static final int FOREGROUND_SERVICE_TYPE_ALLOWED_SINCE_Q = 255;
    private static final int FOREGROUND_SERVICE_TYPE_ALLOWED_SINCE_U = 1073745919;
    public static final int START_STICKY = 1;
    public static final int STOP_FOREGROUND_DETACH = 2;
    public static final int STOP_FOREGROUND_REMOVE = 1;

    static class Api24Impl {
        private Api24Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static void stopForeground(android.app.Service r0, int r1) {
                r0.stopForeground(r1)
                return
        }
    }

    static class Api29Impl {
        private Api29Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static void startForeground(android.app.Service r1, int r2, android.app.Notification r3, int r4) {
                if (r4 == 0) goto Lc
                r0 = -1
                if (r4 != r0) goto L6
                goto Lc
            L6:
                r0 = r4 & 255(0xff, float:3.57E-43)
                r1.startForeground(r2, r3, r0)
                goto Lf
            Lc:
                r1.startForeground(r2, r3, r4)
            Lf:
                return
        }
    }

    static class Api34Impl {
        private Api34Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static void startForeground(android.app.Service r1, int r2, android.app.Notification r3, int r4) {
                if (r4 == 0) goto Le
                r0 = -1
                if (r4 != r0) goto L6
                goto Le
            L6:
                r0 = 1073745919(0x40000fff, float:2.0009763)
                r0 = r0 & r4
                r1.startForeground(r2, r3, r0)
                goto L11
            Le:
                r1.startForeground(r2, r3, r4)
            L11:
                return
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface StopForegroundFlags {
    }

    private ServiceCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void startForeground(android.app.Service r2, int r3, android.app.Notification r4, int r5) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto La
            androidx.core.app.ServiceCompat.Api34Impl.startForeground(r2, r3, r4, r5)
            goto L17
        La:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L14
            androidx.core.app.ServiceCompat.Api29Impl.startForeground(r2, r3, r4, r5)
            goto L17
        L14:
            r2.startForeground(r3, r4)
        L17:
            return
    }

    public static void stopForeground(android.app.Service r0, int r1) {
            androidx.core.app.ServiceCompat.Api24Impl.stopForeground(r0, r1)
            return
    }
}
