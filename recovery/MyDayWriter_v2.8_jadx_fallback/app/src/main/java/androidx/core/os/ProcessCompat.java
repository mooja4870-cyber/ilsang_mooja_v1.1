package androidx.core.os;

/* JADX INFO: loaded from: classes.dex */
public final class ProcessCompat {

    static class Api19Impl {
        private static java.lang.reflect.Method sMethodUserHandleIsAppMethod;
        private static boolean sResolved;
        private static final java.lang.Object sResolvedLock = null;

        static {
                java.lang.Object r0 = new java.lang.Object
                r0.<init>()
                androidx.core.os.ProcessCompat.Api19Impl.sResolvedLock = r0
                return
        }

        private Api19Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static boolean isApplicationUid(int r7) {
                r0 = 1
                java.lang.Object r1 = androidx.core.os.ProcessCompat.Api19Impl.sResolvedLock     // Catch: java.lang.Exception -> L42
                monitor-enter(r1)     // Catch: java.lang.Exception -> L42
                boolean r2 = androidx.core.os.ProcessCompat.Api19Impl.sResolved     // Catch: java.lang.Throwable -> L3f
                if (r2 != 0) goto L1b
                androidx.core.os.ProcessCompat.Api19Impl.sResolved = r0     // Catch: java.lang.Throwable -> L3f
                java.lang.Class<android.os.UserHandle> r2 = android.os.UserHandle.class
                java.lang.String r3 = "isApp"
                java.lang.Class[] r4 = new java.lang.Class[r0]     // Catch: java.lang.Throwable -> L3f
                java.lang.Class r5 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L3f
                r6 = 0
                r4[r6] = r5     // Catch: java.lang.Throwable -> L3f
                java.lang.reflect.Method r2 = r2.getDeclaredMethod(r3, r4)     // Catch: java.lang.Throwable -> L3f
                androidx.core.os.ProcessCompat.Api19Impl.sMethodUserHandleIsAppMethod = r2     // Catch: java.lang.Throwable -> L3f
            L1b:
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L3f
                java.lang.reflect.Method r1 = androidx.core.os.ProcessCompat.Api19Impl.sMethodUserHandleIsAppMethod     // Catch: java.lang.Exception -> L42
                if (r1 == 0) goto L3e
                java.lang.reflect.Method r1 = androidx.core.os.ProcessCompat.Api19Impl.sMethodUserHandleIsAppMethod     // Catch: java.lang.Exception -> L42
                java.lang.Integer r2 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Exception -> L42
                java.lang.Object[] r2 = new java.lang.Object[]{r2}     // Catch: java.lang.Exception -> L42
                r3 = 0
                java.lang.Object r1 = r1.invoke(r3, r2)     // Catch: java.lang.Exception -> L42
                java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Exception -> L42
                if (r1 == 0) goto L38
                boolean r0 = r1.booleanValue()     // Catch: java.lang.Exception -> L42
                return r0
            L38:
                java.lang.NullPointerException r2 = new java.lang.NullPointerException     // Catch: java.lang.Exception -> L42
                r2.<init>()     // Catch: java.lang.Exception -> L42
                throw r2     // Catch: java.lang.Exception -> L42
            L3e:
                goto L46
            L3f:
                r2 = move-exception
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L3f
                throw r2     // Catch: java.lang.Exception -> L42
            L42:
                r1 = move-exception
                r1.printStackTrace()
            L46:
                return r0
        }
    }

    static class Api24Impl {
        private Api24Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static boolean isApplicationUid(int r1) {
                boolean r0 = android.os.Process.isApplicationUid(r1)
                return r0
        }
    }

    private ProcessCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean isApplicationUid(int r1) {
            boolean r0 = androidx.core.os.ProcessCompat.Api24Impl.isApplicationUid(r1)
            return r0
    }
}
