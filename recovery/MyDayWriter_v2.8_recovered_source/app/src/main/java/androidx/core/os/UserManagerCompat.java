package androidx.core.os;

/* JADX INFO: loaded from: classes.dex */
public class UserManagerCompat {

    static class Api24Impl {
        private Api24Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static boolean isUserUnlocked(android.content.Context r1) {
                java.lang.Class<android.os.UserManager> r0 = android.os.UserManager.class
                java.lang.Object r0 = r1.getSystemService(r0)
                android.os.UserManager r0 = (android.os.UserManager) r0
                boolean r0 = r0.isUserUnlocked()
                return r0
        }
    }

    private UserManagerCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean isUserUnlocked(android.content.Context r1) {
            boolean r0 = androidx.core.os.UserManagerCompat.Api24Impl.isUserUnlocked(r1)
            return r0
    }
}
