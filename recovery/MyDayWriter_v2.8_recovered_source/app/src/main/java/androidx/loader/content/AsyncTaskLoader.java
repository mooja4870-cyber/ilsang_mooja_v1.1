package androidx.loader.content;

/* JADX INFO: loaded from: classes.dex */
public abstract class AsyncTaskLoader<D> extends androidx.loader.content.Loader<D> {
    static final boolean DEBUG = false;
    static final java.lang.String TAG = "AsyncTaskLoader";
    volatile androidx.loader.content.AsyncTaskLoader<D>.LoadTask mCancellingTask;
    private final java.util.concurrent.Executor mExecutor;
    android.os.Handler mHandler;
    long mLastLoadCompleteTime;
    volatile androidx.loader.content.AsyncTaskLoader<D>.LoadTask mTask;
    long mUpdateThrottle;

    final class LoadTask extends androidx.loader.content.ModernAsyncTask<java.lang.Void, java.lang.Void, D> implements java.lang.Runnable {
        private final java.util.concurrent.CountDownLatch mDone;
        final /* synthetic */ androidx.loader.content.AsyncTaskLoader this$0;
        boolean waiting;

        LoadTask(androidx.loader.content.AsyncTaskLoader r3) {
                r2 = this;
                r2.this$0 = r3
                r2.<init>()
                java.util.concurrent.CountDownLatch r0 = new java.util.concurrent.CountDownLatch
                r1 = 1
                r0.<init>(r1)
                r2.mDone = r0
                return
        }

        @Override // androidx.loader.content.ModernAsyncTask
        protected /* bridge */ /* synthetic */ java.lang.Object doInBackground(java.lang.Void[] r1) {
                r0 = this;
                java.lang.Void[] r1 = (java.lang.Void[]) r1
                java.lang.Object r1 = r0.doInBackground2(r1)
                return r1
        }

        /* JADX INFO: renamed from: doInBackground, reason: avoid collision after fix types in other method */
        protected D doInBackground2(java.lang.Void... r3) {
                r2 = this;
                androidx.loader.content.AsyncTaskLoader r0 = r2.this$0     // Catch: androidx.core.os.OperationCanceledException -> L7
                java.lang.Object r0 = r0.onLoadInBackground()     // Catch: androidx.core.os.OperationCanceledException -> L7
                return r0
            L7:
                r0 = move-exception
                boolean r1 = r2.isCancelled()
                if (r1 == 0) goto L10
                r1 = 0
                return r1
            L10:
                throw r0
        }

        @Override // androidx.loader.content.ModernAsyncTask
        protected void onCancelled(D r3) {
                r2 = this;
                androidx.loader.content.AsyncTaskLoader r0 = r2.this$0     // Catch: java.lang.Throwable -> Lc
                r0.dispatchOnCancelled(r2, r3)     // Catch: java.lang.Throwable -> Lc
                java.util.concurrent.CountDownLatch r0 = r2.mDone
                r0.countDown()
                return
            Lc:
                r0 = move-exception
                java.util.concurrent.CountDownLatch r1 = r2.mDone
                r1.countDown()
                throw r0
        }

        @Override // androidx.loader.content.ModernAsyncTask
        protected void onPostExecute(D r3) {
                r2 = this;
                androidx.loader.content.AsyncTaskLoader r0 = r2.this$0     // Catch: java.lang.Throwable -> Lc
                r0.dispatchOnLoadComplete(r2, r3)     // Catch: java.lang.Throwable -> Lc
                java.util.concurrent.CountDownLatch r0 = r2.mDone
                r0.countDown()
                return
            Lc:
                r0 = move-exception
                java.util.concurrent.CountDownLatch r1 = r2.mDone
                r1.countDown()
                throw r0
        }

        @Override // java.lang.Runnable
        public void run() {
                r1 = this;
                r0 = 0
                r1.waiting = r0
                androidx.loader.content.AsyncTaskLoader r0 = r1.this$0
                r0.executePendingTask()
                return
        }

        public void waitForLoader() {
                r1 = this;
                java.util.concurrent.CountDownLatch r0 = r1.mDone     // Catch: java.lang.InterruptedException -> L6
                r0.await()     // Catch: java.lang.InterruptedException -> L6
                goto L7
            L6:
                r0 = move-exception
            L7:
                return
        }
    }

    public AsyncTaskLoader(android.content.Context r2) {
            r1 = this;
            java.util.concurrent.Executor r0 = androidx.loader.content.ModernAsyncTask.THREAD_POOL_EXECUTOR
            r1.<init>(r2, r0)
            return
    }

    private AsyncTaskLoader(android.content.Context r3, java.util.concurrent.Executor r4) {
            r2 = this;
            r2.<init>(r3)
            r0 = -10000(0xffffffffffffd8f0, double:NaN)
            r2.mLastLoadCompleteTime = r0
            r2.mExecutor = r4
            return
    }

    public void cancelLoadInBackground() {
            r0 = this;
            return
    }

    void dispatchOnCancelled(androidx.loader.content.AsyncTaskLoader<D>.LoadTask r3, D r4) {
            r2 = this;
            r2.onCanceled(r4)
            androidx.loader.content.AsyncTaskLoader<D>$LoadTask r0 = r2.mCancellingTask
            if (r0 != r3) goto L19
            r2.rollbackContentChanged()
            long r0 = android.os.SystemClock.uptimeMillis()
            r2.mLastLoadCompleteTime = r0
            r0 = 0
            r2.mCancellingTask = r0
            r2.deliverCancellation()
            r2.executePendingTask()
        L19:
            return
    }

    void dispatchOnLoadComplete(androidx.loader.content.AsyncTaskLoader<D>.LoadTask r3, D r4) {
            r2 = this;
            androidx.loader.content.AsyncTaskLoader<D>$LoadTask r0 = r2.mTask
            if (r0 == r3) goto L8
            r2.dispatchOnCancelled(r3, r4)
            goto L21
        L8:
            boolean r0 = r2.isAbandoned()
            if (r0 == 0) goto L12
            r2.onCanceled(r4)
            goto L21
        L12:
            r2.commitContentChanged()
            long r0 = android.os.SystemClock.uptimeMillis()
            r2.mLastLoadCompleteTime = r0
            r0 = 0
            r2.mTask = r0
            r2.deliverResult(r4)
        L21:
            return
    }

    @Override // androidx.loader.content.Loader
    @java.lang.Deprecated
    public void dump(java.lang.String r5, java.io.FileDescriptor r6, java.io.PrintWriter r7, java.lang.String[] r8) {
            r4 = this;
            super.dump(r5, r6, r7, r8)
            androidx.loader.content.AsyncTaskLoader<D>$LoadTask r0 = r4.mTask
            java.lang.String r1 = " waiting="
            if (r0 == 0) goto L20
            r7.print(r5)
            java.lang.String r0 = "mTask="
            r7.print(r0)
            androidx.loader.content.AsyncTaskLoader<D>$LoadTask r0 = r4.mTask
            r7.print(r0)
            r7.print(r1)
            androidx.loader.content.AsyncTaskLoader<D>$LoadTask r0 = r4.mTask
            boolean r0 = r0.waiting
            r7.println(r0)
        L20:
            androidx.loader.content.AsyncTaskLoader<D>$LoadTask r0 = r4.mCancellingTask
            if (r0 == 0) goto L3b
            r7.print(r5)
            java.lang.String r0 = "mCancellingTask="
            r7.print(r0)
            androidx.loader.content.AsyncTaskLoader<D>$LoadTask r0 = r4.mCancellingTask
            r7.print(r0)
            r7.print(r1)
            androidx.loader.content.AsyncTaskLoader<D>$LoadTask r0 = r4.mCancellingTask
            boolean r0 = r0.waiting
            r7.println(r0)
        L3b:
            long r0 = r4.mUpdateThrottle
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L61
            r7.print(r5)
            java.lang.String r0 = "mUpdateThrottle="
            r7.print(r0)
            long r0 = r4.mUpdateThrottle
            androidx.core.util.TimeUtils.formatDuration(r0, r7)
            java.lang.String r0 = " mLastLoadCompleteTime="
            r7.print(r0)
            long r0 = r4.mLastLoadCompleteTime
            long r2 = android.os.SystemClock.uptimeMillis()
            androidx.core.util.TimeUtils.formatDuration(r0, r2, r7)
            r7.println()
        L61:
            return
    }

    void executePendingTask() {
            r8 = this;
            androidx.loader.content.AsyncTaskLoader<D>$LoadTask r0 = r8.mCancellingTask
            if (r0 != 0) goto L4c
            androidx.loader.content.AsyncTaskLoader<D>$LoadTask r0 = r8.mTask
            if (r0 == 0) goto L4c
            androidx.loader.content.AsyncTaskLoader<D>$LoadTask r0 = r8.mTask
            boolean r0 = r0.waiting
            if (r0 == 0) goto L1a
            androidx.loader.content.AsyncTaskLoader<D>$LoadTask r0 = r8.mTask
            r1 = 0
            r0.waiting = r1
            android.os.Handler r0 = r8.mHandler
            androidx.loader.content.AsyncTaskLoader<D>$LoadTask r1 = r8.mTask
            r0.removeCallbacks(r1)
        L1a:
            long r0 = r8.mUpdateThrottle
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L41
            long r0 = android.os.SystemClock.uptimeMillis()
            long r2 = r8.mLastLoadCompleteTime
            long r4 = r8.mUpdateThrottle
            long r2 = r2 + r4
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 >= 0) goto L41
            androidx.loader.content.AsyncTaskLoader<D>$LoadTask r2 = r8.mTask
            r3 = 1
            r2.waiting = r3
            android.os.Handler r2 = r8.mHandler
            androidx.loader.content.AsyncTaskLoader<D>$LoadTask r3 = r8.mTask
            long r4 = r8.mLastLoadCompleteTime
            long r6 = r8.mUpdateThrottle
            long r4 = r4 + r6
            r2.postAtTime(r3, r4)
            return
        L41:
            androidx.loader.content.AsyncTaskLoader<D>$LoadTask r0 = r8.mTask
            java.util.concurrent.Executor r1 = r8.mExecutor
            r2 = 0
            r3 = r2
            java.lang.Void[] r3 = (java.lang.Void[]) r3
            r0.executeOnExecutor(r1, r2)
        L4c:
            return
    }

    public boolean isLoadInBackgroundCanceled() {
            r1 = this;
            androidx.loader.content.AsyncTaskLoader<D>$LoadTask r0 = r1.mCancellingTask
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    public abstract D loadInBackground();

    @Override // androidx.loader.content.Loader
    protected boolean onCancelLoad() {
            r4 = this;
            androidx.loader.content.AsyncTaskLoader<D>$LoadTask r0 = r4.mTask
            r1 = 0
            if (r0 == 0) goto L4b
            boolean r0 = r4.mStarted
            if (r0 != 0) goto Lc
            r0 = 1
            r4.mContentChanged = r0
        Lc:
            androidx.loader.content.AsyncTaskLoader<D>$LoadTask r0 = r4.mCancellingTask
            r2 = 0
            if (r0 == 0) goto L25
            androidx.loader.content.AsyncTaskLoader<D>$LoadTask r0 = r4.mTask
            boolean r0 = r0.waiting
            if (r0 == 0) goto L22
            androidx.loader.content.AsyncTaskLoader<D>$LoadTask r0 = r4.mTask
            r0.waiting = r1
            android.os.Handler r0 = r4.mHandler
            androidx.loader.content.AsyncTaskLoader<D>$LoadTask r3 = r4.mTask
            r0.removeCallbacks(r3)
        L22:
            r4.mTask = r2
            return r1
        L25:
            androidx.loader.content.AsyncTaskLoader<D>$LoadTask r0 = r4.mTask
            boolean r0 = r0.waiting
            if (r0 == 0) goto L39
            androidx.loader.content.AsyncTaskLoader<D>$LoadTask r0 = r4.mTask
            r0.waiting = r1
            android.os.Handler r0 = r4.mHandler
            androidx.loader.content.AsyncTaskLoader<D>$LoadTask r3 = r4.mTask
            r0.removeCallbacks(r3)
            r4.mTask = r2
            return r1
        L39:
            androidx.loader.content.AsyncTaskLoader<D>$LoadTask r0 = r4.mTask
            boolean r0 = r0.cancel(r1)
            if (r0 == 0) goto L48
            androidx.loader.content.AsyncTaskLoader<D>$LoadTask r1 = r4.mTask
            r4.mCancellingTask = r1
            r4.cancelLoadInBackground()
        L48:
            r4.mTask = r2
            return r0
        L4b:
            return r1
    }

    public void onCanceled(D r1) {
            r0 = this;
            return
    }

    @Override // androidx.loader.content.Loader
    protected void onForceLoad() {
            r1 = this;
            super.onForceLoad()
            r1.cancelLoad()
            androidx.loader.content.AsyncTaskLoader$LoadTask r0 = new androidx.loader.content.AsyncTaskLoader$LoadTask
            r0.<init>(r1)
            r1.mTask = r0
            r1.executePendingTask()
            return
    }

    protected D onLoadInBackground() {
            r1 = this;
            java.lang.Object r0 = r1.loadInBackground()
            return r0
    }

    public void setUpdateThrottle(long r3) {
            r2 = this;
            r2.mUpdateThrottle = r3
            r0 = 0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 == 0) goto Lf
            android.os.Handler r0 = new android.os.Handler
            r0.<init>()
            r2.mHandler = r0
        Lf:
            return
    }

    public void waitForLoader() {
            r1 = this;
            androidx.loader.content.AsyncTaskLoader<D>$LoadTask r0 = r1.mTask
            if (r0 == 0) goto L7
            r0.waitForLoader()
        L7:
            return
    }
}
