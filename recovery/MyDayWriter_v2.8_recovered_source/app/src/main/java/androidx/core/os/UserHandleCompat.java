package androidx.core.os;

/* JADX INFO: loaded from: classes.dex */
public class UserHandleCompat {
    private static java.lang.reflect.Method sGetUserIdMethod;
    private static java.lang.reflect.Constructor<android.os.UserHandle> sUserHandleConstructor;

    private static class Api24Impl {
        private Api24Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static android.os.UserHandle getUserHandleForUid(int r1) {
                android.os.UserHandle r0 = android.os.UserHandle.getUserHandleForUid(r1)
                return r0
        }
    }

    private UserHandleCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    private static java.lang.reflect.Method getGetUserIdMethod() throws java.lang.NoSuchMethodException {
            java.lang.reflect.Method r0 = androidx.core.os.UserHandleCompat.sGetUserIdMethod
            if (r0 != 0) goto L1b
            java.lang.Class<android.os.UserHandle> r0 = android.os.UserHandle.class
            r1 = 1
            java.lang.Class[] r2 = new java.lang.Class[r1]
            r3 = 0
            java.lang.Class r4 = java.lang.Integer.TYPE
            r2[r3] = r4
            java.lang.String r3 = "getUserId"
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r3, r2)
            androidx.core.os.UserHandleCompat.sGetUserIdMethod = r0
            java.lang.reflect.Method r0 = androidx.core.os.UserHandleCompat.sGetUserIdMethod
            r0.setAccessible(r1)
        L1b:
            java.lang.reflect.Method r0 = androidx.core.os.UserHandleCompat.sGetUserIdMethod
            return r0
    }

    private static java.lang.reflect.Constructor<android.os.UserHandle> getUserHandleConstructor() throws java.lang.NoSuchMethodException {
            java.lang.reflect.Constructor<android.os.UserHandle> r0 = androidx.core.os.UserHandleCompat.sUserHandleConstructor
            if (r0 != 0) goto L19
            java.lang.Class<android.os.UserHandle> r0 = android.os.UserHandle.class
            r1 = 1
            java.lang.Class[] r2 = new java.lang.Class[r1]
            r3 = 0
            java.lang.Class r4 = java.lang.Integer.TYPE
            r2[r3] = r4
            java.lang.reflect.Constructor r0 = r0.getDeclaredConstructor(r2)
            androidx.core.os.UserHandleCompat.sUserHandleConstructor = r0
            java.lang.reflect.Constructor<android.os.UserHandle> r0 = androidx.core.os.UserHandleCompat.sUserHandleConstructor
            r0.setAccessible(r1)
        L19:
            java.lang.reflect.Constructor<android.os.UserHandle> r0 = androidx.core.os.UserHandleCompat.sUserHandleConstructor
            return r0
    }

    public static android.os.UserHandle getUserHandleForUid(int r1) {
            android.os.UserHandle r0 = androidx.core.os.UserHandleCompat.Api24Impl.getUserHandleForUid(r1)
            return r0
    }
}
