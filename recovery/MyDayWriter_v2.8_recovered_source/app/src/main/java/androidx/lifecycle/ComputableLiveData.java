package androidx.lifecycle;

/* JADX INFO: compiled from: ComputableLiveData.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0011\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\r\u0010\u0019\u001a\u00028\u0000H%¢\u0006\u0002\u0010\u001aJ\b\u0010\u001b\u001a\u00020\u001cH\u0016R\u0016\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\tX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\tX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0016\u0010\u0010\u001a\u00020\u00118\u0000X\u0081\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0017\u001a\u00020\u00118\u0000X\u0081\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0018\u0010\u0013¨\u0006\u001d"}, d2 = {"Landroidx/lifecycle/ComputableLiveData;", "T", "", "executor", "Ljava/util/concurrent/Executor;", "(Ljava/util/concurrent/Executor;)V", "_liveData", "Landroidx/lifecycle/LiveData;", "computing", "Ljava/util/concurrent/atomic/AtomicBoolean;", "getComputing$lifecycle_livedata_release", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "getExecutor$lifecycle_livedata_release", "()Ljava/util/concurrent/Executor;", "invalid", "getInvalid$lifecycle_livedata_release", "invalidationRunnable", "Ljava/lang/Runnable;", "getInvalidationRunnable$lifecycle_livedata_release$annotations", "()V", "liveData", "getLiveData", "()Landroidx/lifecycle/LiveData;", "refreshRunnable", "getRefreshRunnable$lifecycle_livedata_release$annotations", "compute", "()Ljava/lang/Object;", "invalidate", "", "lifecycle-livedata_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class ComputableLiveData<T> {
    private final androidx.lifecycle.LiveData<T> _liveData;
    private final java.util.concurrent.atomic.AtomicBoolean computing;
    private final java.util.concurrent.Executor executor;
    private final java.util.concurrent.atomic.AtomicBoolean invalid;
    public final java.lang.Runnable invalidationRunnable;
    private final androidx.lifecycle.LiveData<T> liveData;
    public final java.lang.Runnable refreshRunnable;

    /* JADX INFO: renamed from: $r8$lambda$3YPDTAMNTCGT-z9DkpLbjudOC6w, reason: not valid java name */
    public static /* synthetic */ void m95$r8$lambda$3YPDTAMNTCGTz9DkpLbjudOC6w(androidx.lifecycle.ComputableLiveData r0) {
            refreshRunnable$lambda$0(r0)
            return
    }

    public static /* synthetic */ void $r8$lambda$7oABH0_b7KfpQ6DlyqjjKM5jdaU(androidx.lifecycle.ComputableLiveData r0) {
            invalidationRunnable$lambda$1(r0)
            return
    }

    public ComputableLiveData() {
            r2 = this;
            r0 = 0
            r1 = 1
            r2.<init>(r0, r1, r0)
            return
    }

    public ComputableLiveData(java.util.concurrent.Executor r3) {
            r2 = this;
            java.lang.String r0 = "executor"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r2.<init>()
            r2.executor = r3
            androidx.lifecycle.ComputableLiveData$_liveData$1 r0 = new androidx.lifecycle.ComputableLiveData$_liveData$1
            r0.<init>(r2)
            androidx.lifecycle.LiveData r0 = (androidx.lifecycle.LiveData) r0
            r2._liveData = r0
            androidx.lifecycle.LiveData<T> r0 = r2._liveData
            r2.liveData = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 1
            r0.<init>(r1)
            r2.invalid = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            r2.computing = r0
            androidx.lifecycle.ComputableLiveData$$ExternalSyntheticLambda0 r0 = new androidx.lifecycle.ComputableLiveData$$ExternalSyntheticLambda0
            r0.<init>(r2)
            r2.refreshRunnable = r0
            androidx.lifecycle.ComputableLiveData$$ExternalSyntheticLambda1 r0 = new androidx.lifecycle.ComputableLiveData$$ExternalSyntheticLambda1
            r0.<init>(r2)
            r2.invalidationRunnable = r0
            return
    }

    public /* synthetic */ ComputableLiveData(java.util.concurrent.Executor r1, int r2, kotlin.jvm.internal.DefaultConstructorMarker r3) {
            r0 = this;
            r2 = r2 & 1
            if (r2 == 0) goto Ld
            java.util.concurrent.Executor r1 = androidx.arch.core.executor.ArchTaskExecutor.getIOThreadExecutor()
            java.lang.String r2 = "getIOThreadExecutor()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
        Ld:
            r0.<init>(r1)
            return
    }

    public static /* synthetic */ void getInvalidationRunnable$lifecycle_livedata_release$annotations() {
            return
    }

    public static /* synthetic */ void getRefreshRunnable$lifecycle_livedata_release$annotations() {
            return
    }

    private static final void invalidationRunnable$lambda$1(androidx.lifecycle.ComputableLiveData r4) {
            java.lang.String r0 = "this$0"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            androidx.lifecycle.LiveData r0 = r4.getLiveData()
            boolean r0 = r0.hasActiveObservers()
            java.util.concurrent.atomic.AtomicBoolean r1 = r4.invalid
            r2 = 0
            r3 = 1
            boolean r1 = r1.compareAndSet(r2, r3)
            if (r1 == 0) goto L20
            if (r0 == 0) goto L20
            java.util.concurrent.Executor r1 = r4.executor
            java.lang.Runnable r2 = r4.refreshRunnable
            r1.execute(r2)
        L20:
            return
    }

    private static final void refreshRunnable$lambda$0(androidx.lifecycle.ComputableLiveData r5) {
            java.lang.String r0 = "this$0"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = 0
        L6:
            r0 = 0
            java.util.concurrent.atomic.AtomicBoolean r1 = r5.computing
            r2 = 0
            r3 = 1
            boolean r1 = r1.compareAndSet(r2, r3)
            if (r1 == 0) goto L38
        L12:
            r1 = 0
        L13:
            java.util.concurrent.atomic.AtomicBoolean r4 = r5.invalid     // Catch: java.lang.Throwable -> L31
            boolean r4 = r4.compareAndSet(r3, r2)     // Catch: java.lang.Throwable -> L31
            if (r4 == 0) goto L22
            r0 = 1
            java.lang.Object r4 = r5.compute()     // Catch: java.lang.Throwable -> L31
            r1 = r4
            goto L13
        L22:
            if (r0 == 0) goto L2b
            androidx.lifecycle.LiveData r3 = r5.getLiveData()     // Catch: java.lang.Throwable -> L31
            r3.postValue(r1)     // Catch: java.lang.Throwable -> L31
        L2b:
            java.util.concurrent.atomic.AtomicBoolean r1 = r5.computing
            r1.set(r2)
            goto L38
        L31:
            r1 = move-exception
            java.util.concurrent.atomic.AtomicBoolean r3 = r5.computing
            r3.set(r2)
            throw r1
        L38:
            if (r0 == 0) goto L42
            java.util.concurrent.atomic.AtomicBoolean r1 = r5.invalid
            boolean r1 = r1.get()
            if (r1 != 0) goto L6
        L42:
            return
    }

    protected abstract T compute();

    public final java.util.concurrent.atomic.AtomicBoolean getComputing$lifecycle_livedata_release() {
            r1 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.computing
            return r0
    }

    public final java.util.concurrent.Executor getExecutor$lifecycle_livedata_release() {
            r1 = this;
            java.util.concurrent.Executor r0 = r1.executor
            return r0
    }

    public final java.util.concurrent.atomic.AtomicBoolean getInvalid$lifecycle_livedata_release() {
            r1 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.invalid
            return r0
    }

    public androidx.lifecycle.LiveData<T> getLiveData() {
            r1 = this;
            androidx.lifecycle.LiveData<T> r0 = r1.liveData
            return r0
    }

    public void invalidate() {
            r2 = this;
            androidx.arch.core.executor.ArchTaskExecutor r0 = androidx.arch.core.executor.ArchTaskExecutor.getInstance()
            java.lang.Runnable r1 = r2.invalidationRunnable
            r0.executeOnMainThread(r1)
            return
    }
}
