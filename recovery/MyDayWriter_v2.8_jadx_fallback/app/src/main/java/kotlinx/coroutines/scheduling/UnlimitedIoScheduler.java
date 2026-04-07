package kotlinx.coroutines.scheduling;

/* JADX INFO: compiled from: Dispatcher.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\n\u0010\u0007\u001a\u00060\bj\u0002`\tH\u0016J\u001c\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\n\u0010\u0007\u001a\u00060\bj\u0002`\tH\u0017J\u0010\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\rH\u0017¨\u0006\u000e"}, d2 = {"Lkotlinx/coroutines/scheduling/UnlimitedIoScheduler;", "Lkotlinx/coroutines/CoroutineDispatcher;", "()V", "dispatch", "", "context", "Lkotlin/coroutines/CoroutineContext;", "block", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "dispatchYield", "limitedParallelism", "parallelism", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class UnlimitedIoScheduler extends kotlinx.coroutines.CoroutineDispatcher {
    public static final kotlinx.coroutines.scheduling.UnlimitedIoScheduler INSTANCE = null;

    static {
            kotlinx.coroutines.scheduling.UnlimitedIoScheduler r0 = new kotlinx.coroutines.scheduling.UnlimitedIoScheduler
            r0.<init>()
            kotlinx.coroutines.scheduling.UnlimitedIoScheduler.INSTANCE = r0
            return
    }

    private UnlimitedIoScheduler() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* JADX INFO: renamed from: dispatch */
    public void mo1712dispatch(kotlin.coroutines.CoroutineContext r4, java.lang.Runnable r5) {
            r3 = this;
            kotlinx.coroutines.scheduling.DefaultScheduler r0 = kotlinx.coroutines.scheduling.DefaultScheduler.INSTANCE
            kotlinx.coroutines.scheduling.TaskContext r1 = kotlinx.coroutines.scheduling.TasksKt.BlockingContext
            r2 = 0
            r0.dispatchWithContext$kotlinx_coroutines_core(r5, r1, r2)
            return
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public void dispatchYield(kotlin.coroutines.CoroutineContext r4, java.lang.Runnable r5) {
            r3 = this;
            kotlinx.coroutines.scheduling.DefaultScheduler r0 = kotlinx.coroutines.scheduling.DefaultScheduler.INSTANCE
            kotlinx.coroutines.scheduling.TaskContext r1 = kotlinx.coroutines.scheduling.TasksKt.BlockingContext
            r2 = 1
            r0.dispatchWithContext$kotlinx_coroutines_core(r5, r1, r2)
            return
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public kotlinx.coroutines.CoroutineDispatcher limitedParallelism(int r2) {
            r1 = this;
            kotlinx.coroutines.internal.LimitedDispatcherKt.checkParallelism(r2)
            int r0 = kotlinx.coroutines.scheduling.TasksKt.MAX_POOL_SIZE
            if (r2 < r0) goto Lb
            r0 = r1
            kotlinx.coroutines.CoroutineDispatcher r0 = (kotlinx.coroutines.CoroutineDispatcher) r0
            return r0
        Lb:
            kotlinx.coroutines.CoroutineDispatcher r0 = super.limitedParallelism(r2)
            return r0
    }
}
