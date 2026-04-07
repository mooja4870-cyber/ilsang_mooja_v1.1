package androidx.core.os;

/* JADX INFO: loaded from: classes.dex */
public final class ExecutorCompat {

    private static class HandlerExecutor implements java.util.concurrent.Executor {
        private final android.os.Handler mHandler;

        HandlerExecutor(android.os.Handler r2) {
                r1 = this;
                r1.<init>()
                java.lang.Object r0 = androidx.core.util.Preconditions.checkNotNull(r2)
                android.os.Handler r0 = (android.os.Handler) r0
                r1.mHandler = r0
                return
        }

        @Override // java.util.concurrent.Executor
        public void execute(java.lang.Runnable r4) {
                r3 = this;
                android.os.Handler r0 = r3.mHandler
                java.lang.Object r1 = androidx.core.util.Preconditions.checkNotNull(r4)
                java.lang.Runnable r1 = (java.lang.Runnable) r1
                boolean r0 = r0.post(r1)
                if (r0 == 0) goto Lf
                return
            Lf:
                java.util.concurrent.RejectedExecutionException r0 = new java.util.concurrent.RejectedExecutionException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                android.os.Handler r2 = r3.mHandler
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.String r2 = " is shutting down"
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
        }
    }

    private ExecutorCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.util.concurrent.Executor create(android.os.Handler r1) {
            androidx.core.os.ExecutorCompat$HandlerExecutor r0 = new androidx.core.os.ExecutorCompat$HandlerExecutor
            r0.<init>(r1)
            return r0
    }
}
