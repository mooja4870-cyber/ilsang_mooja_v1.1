package androidx.core.provider;

/* JADX INFO: loaded from: classes.dex */
class RequestExecutor {

    private static class DefaultThreadFactory implements java.util.concurrent.ThreadFactory {
        private int mPriority;
        private java.lang.String mThreadName;

        private static class ProcessPriorityThread extends java.lang.Thread {
            private final int mPriority;

            ProcessPriorityThread(java.lang.Runnable r1, java.lang.String r2, int r3) {
                    r0 = this;
                    r0.<init>(r1, r2)
                    r0.mPriority = r3
                    return
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                    r1 = this;
                    int r0 = r1.mPriority
                    android.os.Process.setThreadPriority(r0)
                    super.run()
                    return
            }
        }

        DefaultThreadFactory(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>()
                r0.mThreadName = r1
                r0.mPriority = r2
                return
        }

        @Override // java.util.concurrent.ThreadFactory
        public java.lang.Thread newThread(java.lang.Runnable r4) {
                r3 = this;
                androidx.core.provider.RequestExecutor$DefaultThreadFactory$ProcessPriorityThread r0 = new androidx.core.provider.RequestExecutor$DefaultThreadFactory$ProcessPriorityThread
                java.lang.String r1 = r3.mThreadName
                int r2 = r3.mPriority
                r0.<init>(r4, r1, r2)
                return r0
        }
    }

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

    private static class ReplyRunnable<T> implements java.lang.Runnable {
        private java.util.concurrent.Callable<T> mCallable;
        private androidx.core.util.Consumer<T> mConsumer;
        private android.os.Handler mHandler;


        ReplyRunnable(android.os.Handler r1, java.util.concurrent.Callable<T> r2, androidx.core.util.Consumer<T> r3) {
                r0 = this;
                r0.<init>()
                r0.mCallable = r2
                r0.mConsumer = r3
                r0.mHandler = r1
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r5 = this;
                java.util.concurrent.Callable<T> r0 = r5.mCallable     // Catch: java.lang.Exception -> L7
                java.lang.Object r0 = r0.call()     // Catch: java.lang.Exception -> L7
                goto La
            L7:
                r0 = move-exception
                r1 = 0
                r0 = r1
            La:
                r1 = r0
                androidx.core.util.Consumer<T> r2 = r5.mConsumer
                android.os.Handler r3 = r5.mHandler
                androidx.core.provider.RequestExecutor$ReplyRunnable$1 r4 = new androidx.core.provider.RequestExecutor$ReplyRunnable$1
                r4.<init>(r5, r2, r1)
                r3.post(r4)
                return
        }
    }

    private RequestExecutor() {
            r0 = this;
            r0.<init>()
            return
    }

    static java.util.concurrent.ThreadPoolExecutor createDefaultExecutor(java.lang.String r9, int r10, int r11) {
            androidx.core.provider.RequestExecutor$DefaultThreadFactory r0 = new androidx.core.provider.RequestExecutor$DefaultThreadFactory
            r0.<init>(r9, r10)
            r8 = r0
            java.util.concurrent.ThreadPoolExecutor r1 = new java.util.concurrent.ThreadPoolExecutor
            long r4 = (long) r11
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.util.concurrent.LinkedBlockingDeque r7 = new java.util.concurrent.LinkedBlockingDeque
            r7.<init>()
            r2 = 0
            r3 = 1
            r1.<init>(r2, r3, r4, r6, r7, r8)
            r0 = 1
            r1.allowCoreThreadTimeOut(r0)
            return r1
    }

    static java.util.concurrent.Executor createHandlerExecutor(android.os.Handler r1) {
            androidx.core.provider.RequestExecutor$HandlerExecutor r0 = new androidx.core.provider.RequestExecutor$HandlerExecutor
            r0.<init>(r1)
            return r0
    }

    static <T> void execute(java.util.concurrent.Executor r2, java.util.concurrent.Callable<T> r3, androidx.core.util.Consumer<T> r4) {
            android.os.Handler r0 = androidx.core.provider.CalleeHandler.create()
            androidx.core.provider.RequestExecutor$ReplyRunnable r1 = new androidx.core.provider.RequestExecutor$ReplyRunnable
            r1.<init>(r0, r3, r4)
            r2.execute(r1)
            return
    }

    static <T> T submit(java.util.concurrent.ExecutorService r4, java.util.concurrent.Callable<T> r5, int r6) throws java.lang.InterruptedException {
            java.util.concurrent.Future r0 = r4.submit(r5)
            long r1 = (long) r6
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.util.concurrent.TimeoutException -> Lc java.lang.InterruptedException -> L15 java.util.concurrent.ExecutionException -> L17
            java.lang.Object r1 = r0.get(r1, r3)     // Catch: java.util.concurrent.TimeoutException -> Lc java.lang.InterruptedException -> L15 java.util.concurrent.ExecutionException -> L17
            return r1
        Lc:
            r1 = move-exception
            java.lang.InterruptedException r2 = new java.lang.InterruptedException
            java.lang.String r3 = "timeout"
            r2.<init>(r3)
            throw r2
        L15:
            r1 = move-exception
            throw r1
        L17:
            r1 = move-exception
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            r2.<init>(r1)
            throw r2
    }
}
