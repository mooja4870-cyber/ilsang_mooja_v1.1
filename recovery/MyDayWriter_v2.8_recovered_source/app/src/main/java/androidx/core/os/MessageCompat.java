package androidx.core.os;

/* JADX INFO: loaded from: classes.dex */
public final class MessageCompat {
    private static boolean sTryIsAsynchronous;
    private static boolean sTrySetAsynchronous;

    static class Api22Impl {
        private Api22Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static boolean isAsynchronous(android.os.Message r1) {
                boolean r0 = r1.isAsynchronous()
                return r0
        }

        static void setAsynchronous(android.os.Message r0, boolean r1) {
                r0.setAsynchronous(r1)
                return
        }
    }

    static {
            r0 = 1
            androidx.core.os.MessageCompat.sTrySetAsynchronous = r0
            androidx.core.os.MessageCompat.sTryIsAsynchronous = r0
            return
    }

    private MessageCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean isAsynchronous(android.os.Message r1) {
            boolean r0 = androidx.core.os.MessageCompat.Api22Impl.isAsynchronous(r1)
            return r0
    }

    public static void setAsynchronous(android.os.Message r0, boolean r1) {
            androidx.core.os.MessageCompat.Api22Impl.setAsynchronous(r0, r1)
            return
    }
}
