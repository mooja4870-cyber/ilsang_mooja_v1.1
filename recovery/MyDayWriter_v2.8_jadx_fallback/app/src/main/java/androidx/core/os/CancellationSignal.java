package androidx.core.os;

/* JADX INFO: loaded from: classes.dex */
@java.lang.Deprecated
public final class CancellationSignal {
    private boolean mCancelInProgress;
    private java.lang.Object mCancellationSignalObj;
    private boolean mIsCanceled;
    private androidx.core.os.CancellationSignal.OnCancelListener mOnCancelListener;

    public interface OnCancelListener {
        void onCancel();
    }

    public CancellationSignal() {
            r0 = this;
            r0.<init>()
            return
    }

    private void waitForCancelFinishedLocked() {
            r1 = this;
        L1:
            boolean r0 = r1.mCancelInProgress
            if (r0 == 0) goto Lb
            r1.wait()     // Catch: java.lang.InterruptedException -> L9
        L8:
            goto L1
        L9:
            r0 = move-exception
            goto L8
        Lb:
            return
    }

    public void cancel() {
            r4 = this;
            monitor-enter(r4)
            boolean r0 = r4.mIsCanceled     // Catch: java.lang.Throwable -> L3a
            if (r0 == 0) goto L7
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L3a
            return
        L7:
            r0 = 1
            r4.mIsCanceled = r0     // Catch: java.lang.Throwable -> L3a
            r4.mCancelInProgress = r0     // Catch: java.lang.Throwable -> L3a
            androidx.core.os.CancellationSignal$OnCancelListener r0 = r4.mOnCancelListener     // Catch: java.lang.Throwable -> L3a
            java.lang.Object r1 = r4.mCancellationSignalObj     // Catch: java.lang.Throwable -> L3a
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L3a
            r2 = 0
            if (r0 == 0) goto L1a
            r0.onCancel()     // Catch: java.lang.Throwable -> L18
            goto L1a
        L18:
            r3 = move-exception
            goto L23
        L1a:
            if (r1 == 0) goto L2e
            r3 = r1
            android.os.CancellationSignal r3 = (android.os.CancellationSignal) r3     // Catch: java.lang.Throwable -> L18
            r3.cancel()     // Catch: java.lang.Throwable -> L18
            goto L2e
        L23:
            monitor-enter(r4)
            r4.mCancelInProgress = r2     // Catch: java.lang.Throwable -> L2b
            r4.notifyAll()     // Catch: java.lang.Throwable -> L2b
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L2b
            throw r3
        L2b:
            r2 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L2b
            throw r2
        L2e:
            monitor-enter(r4)
            r4.mCancelInProgress = r2     // Catch: java.lang.Throwable -> L37
            r4.notifyAll()     // Catch: java.lang.Throwable -> L37
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L37
            return
        L37:
            r2 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L37
            throw r2
        L3a:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L3a
            throw r0
    }

    public java.lang.Object getCancellationSignalObject() {
            r1 = this;
            monitor-enter(r1)
            java.lang.Object r0 = r1.mCancellationSignalObj     // Catch: java.lang.Throwable -> L1b
            if (r0 != 0) goto L17
            android.os.CancellationSignal r0 = new android.os.CancellationSignal     // Catch: java.lang.Throwable -> L1b
            r0.<init>()     // Catch: java.lang.Throwable -> L1b
            r1.mCancellationSignalObj = r0     // Catch: java.lang.Throwable -> L1b
            boolean r0 = r1.mIsCanceled     // Catch: java.lang.Throwable -> L1b
            if (r0 == 0) goto L17
            java.lang.Object r0 = r1.mCancellationSignalObj     // Catch: java.lang.Throwable -> L1b
            android.os.CancellationSignal r0 = (android.os.CancellationSignal) r0     // Catch: java.lang.Throwable -> L1b
            r0.cancel()     // Catch: java.lang.Throwable -> L1b
        L17:
            java.lang.Object r0 = r1.mCancellationSignalObj     // Catch: java.lang.Throwable -> L1b
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1b
            return r0
        L1b:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1b
            throw r0
    }

    public boolean isCanceled() {
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.mIsCanceled     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L5
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L5
            throw r0
    }

    public void setOnCancelListener(androidx.core.os.CancellationSignal.OnCancelListener r2) {
            r1 = this;
            monitor-enter(r1)
            r1.waitForCancelFinishedLocked()     // Catch: java.lang.Throwable -> L1a
            androidx.core.os.CancellationSignal$OnCancelListener r0 = r1.mOnCancelListener     // Catch: java.lang.Throwable -> L1a
            if (r0 != r2) goto La
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1a
            return
        La:
            r1.mOnCancelListener = r2     // Catch: java.lang.Throwable -> L1a
            boolean r0 = r1.mIsCanceled     // Catch: java.lang.Throwable -> L1a
            if (r0 == 0) goto L18
            if (r2 != 0) goto L13
            goto L18
        L13:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1a
            r2.onCancel()
            return
        L18:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1a
            return
        L1a:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1a
            throw r0
    }

    public void throwIfCanceled() {
            r1 = this;
            boolean r0 = r1.isCanceled()
            if (r0 != 0) goto L7
            return
        L7:
            androidx.core.os.OperationCanceledException r0 = new androidx.core.os.OperationCanceledException
            r0.<init>()
            throw r0
    }
}
