package androidx.arch.core.executor;

/* JADX INFO: loaded from: classes.dex */
public class DefaultTaskExecutor extends androidx.arch.core.executor.TaskExecutor {
    private final java.util.concurrent.ExecutorService mDiskIO;
    private final java.lang.Object mLock;
    private volatile android.os.Handler mMainHandler;


    private static class Api28Impl {
        private Api28Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        public static android.os.Handler createAsync(android.os.Looper r1) {
                android.os.Handler r0 = android.os.Handler.createAsync(r1)
                return r0
        }
    }

    public DefaultTaskExecutor() {
            r2 = this;
            r2.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r2.mLock = r0
            androidx.arch.core.executor.DefaultTaskExecutor$1 r0 = new androidx.arch.core.executor.DefaultTaskExecutor$1
            r0.<init>(r2)
            r1 = 4
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.newFixedThreadPool(r1, r0)
            r2.mDiskIO = r0
            return
    }

    private static android.os.Handler createAsync(android.os.Looper r5) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Lb
            android.os.Handler r0 = androidx.arch.core.executor.DefaultTaskExecutor.Api28Impl.createAsync(r5)
            return r0
        Lb:
            java.lang.Class<android.os.Handler> r0 = android.os.Handler.class
            r1 = 3
            java.lang.Class[] r1 = new java.lang.Class[r1]     // Catch: java.lang.reflect.InvocationTargetException -> L34 java.lang.NoSuchMethodException -> L3b java.lang.InstantiationException -> L3d java.lang.IllegalAccessException -> L3f
            java.lang.Class<android.os.Looper> r2 = android.os.Looper.class
            r3 = 0
            r1[r3] = r2     // Catch: java.lang.reflect.InvocationTargetException -> L34 java.lang.NoSuchMethodException -> L3b java.lang.InstantiationException -> L3d java.lang.IllegalAccessException -> L3f
            java.lang.Class<android.os.Handler$Callback> r2 = android.os.Handler.Callback.class
            r3 = 1
            r1[r3] = r2     // Catch: java.lang.reflect.InvocationTargetException -> L34 java.lang.NoSuchMethodException -> L3b java.lang.InstantiationException -> L3d java.lang.IllegalAccessException -> L3f
            java.lang.Class r2 = java.lang.Boolean.TYPE     // Catch: java.lang.reflect.InvocationTargetException -> L34 java.lang.NoSuchMethodException -> L3b java.lang.InstantiationException -> L3d java.lang.IllegalAccessException -> L3f
            r4 = 2
            r1[r4] = r2     // Catch: java.lang.reflect.InvocationTargetException -> L34 java.lang.NoSuchMethodException -> L3b java.lang.InstantiationException -> L3d java.lang.IllegalAccessException -> L3f
            java.lang.reflect.Constructor r0 = r0.getDeclaredConstructor(r1)     // Catch: java.lang.reflect.InvocationTargetException -> L34 java.lang.NoSuchMethodException -> L3b java.lang.InstantiationException -> L3d java.lang.IllegalAccessException -> L3f
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r3)     // Catch: java.lang.reflect.InvocationTargetException -> L34 java.lang.NoSuchMethodException -> L3b java.lang.InstantiationException -> L3d java.lang.IllegalAccessException -> L3f
            r2 = 0
            java.lang.Object[] r1 = new java.lang.Object[]{r5, r2, r1}     // Catch: java.lang.reflect.InvocationTargetException -> L34 java.lang.NoSuchMethodException -> L3b java.lang.InstantiationException -> L3d java.lang.IllegalAccessException -> L3f
            java.lang.Object r0 = r0.newInstance(r1)     // Catch: java.lang.reflect.InvocationTargetException -> L34 java.lang.NoSuchMethodException -> L3b java.lang.InstantiationException -> L3d java.lang.IllegalAccessException -> L3f
            android.os.Handler r0 = (android.os.Handler) r0     // Catch: java.lang.reflect.InvocationTargetException -> L34 java.lang.NoSuchMethodException -> L3b java.lang.InstantiationException -> L3d java.lang.IllegalAccessException -> L3f
            return r0
        L34:
            r0 = move-exception
            android.os.Handler r1 = new android.os.Handler
            r1.<init>(r5)
            return r1
        L3b:
            r0 = move-exception
            goto L40
        L3d:
            r0 = move-exception
            goto L40
        L3f:
            r0 = move-exception
        L40:
            android.os.Handler r0 = new android.os.Handler
            r0.<init>(r5)
            return r0
    }

    @Override // androidx.arch.core.executor.TaskExecutor
    public void executeOnDiskIO(java.lang.Runnable r2) {
            r1 = this;
            java.util.concurrent.ExecutorService r0 = r1.mDiskIO
            r0.execute(r2)
            return
    }

    @Override // androidx.arch.core.executor.TaskExecutor
    public boolean isMainThread() {
            r2 = this;
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            java.lang.Thread r0 = r0.getThread()
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            if (r0 != r1) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            return r0
    }

    @Override // androidx.arch.core.executor.TaskExecutor
    public void postToMainThread(java.lang.Runnable r3) {
            r2 = this;
            android.os.Handler r0 = r2.mMainHandler
            if (r0 != 0) goto L1a
            java.lang.Object r0 = r2.mLock
            monitor-enter(r0)
            android.os.Handler r1 = r2.mMainHandler     // Catch: java.lang.Throwable -> L17
            if (r1 != 0) goto L15
            android.os.Looper r1 = android.os.Looper.getMainLooper()     // Catch: java.lang.Throwable -> L17
            android.os.Handler r1 = createAsync(r1)     // Catch: java.lang.Throwable -> L17
            r2.mMainHandler = r1     // Catch: java.lang.Throwable -> L17
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            goto L1a
        L17:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            throw r1
        L1a:
            android.os.Handler r0 = r2.mMainHandler
            r0.post(r3)
            return
    }
}
