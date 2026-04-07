package kotlinx.coroutines;

/* JADX INFO: compiled from: Executors.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0011\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0007¢\u0006\u0002\b\u0003\u001a\u0011\u0010\u0000\u001a\u00020\u0004*\u00020\u0005H\u0007¢\u0006\u0002\b\u0003\u001a\n\u0010\u0006\u001a\u00020\u0002*\u00020\u0001*\u0010\b\u0007\u0010\u0007\"\u00020\u00042\u00020\u0004B\u0002\b\b¨\u0006\t"}, d2 = {"asCoroutineDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "Ljava/util/concurrent/Executor;", "from", "Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "Ljava/util/concurrent/ExecutorService;", "asExecutor", "CloseableCoroutineDispatcher", "Lkotlinx/coroutines/ExperimentalCoroutinesApi;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class ExecutorsKt {
    public static /* synthetic */ void CloseableCoroutineDispatcher$annotations() {
            return
    }

    public static final java.util.concurrent.Executor asExecutor(kotlinx.coroutines.CoroutineDispatcher r1) {
            boolean r0 = r1 instanceof kotlinx.coroutines.ExecutorCoroutineDispatcher
            if (r0 == 0) goto L8
            r0 = r1
            kotlinx.coroutines.ExecutorCoroutineDispatcher r0 = (kotlinx.coroutines.ExecutorCoroutineDispatcher) r0
            goto L9
        L8:
            r0 = 0
        L9:
            if (r0 == 0) goto L11
            java.util.concurrent.Executor r0 = r0.getExecutor()
            if (r0 != 0) goto L18
        L11:
            kotlinx.coroutines.DispatcherExecutor r0 = new kotlinx.coroutines.DispatcherExecutor
            r0.<init>(r1)
            java.util.concurrent.Executor r0 = (java.util.concurrent.Executor) r0
        L18:
            return r0
    }

    public static final kotlinx.coroutines.CoroutineDispatcher from(java.util.concurrent.Executor r1) {
            boolean r0 = r1 instanceof kotlinx.coroutines.DispatcherExecutor
            if (r0 == 0) goto L8
            r0 = r1
            kotlinx.coroutines.DispatcherExecutor r0 = (kotlinx.coroutines.DispatcherExecutor) r0
            goto L9
        L8:
            r0 = 0
        L9:
            if (r0 == 0) goto Lf
            kotlinx.coroutines.CoroutineDispatcher r0 = r0.dispatcher
            if (r0 != 0) goto L16
        Lf:
            kotlinx.coroutines.ExecutorCoroutineDispatcherImpl r0 = new kotlinx.coroutines.ExecutorCoroutineDispatcherImpl
            r0.<init>(r1)
            kotlinx.coroutines.CoroutineDispatcher r0 = (kotlinx.coroutines.CoroutineDispatcher) r0
        L16:
            return r0
    }

    public static final kotlinx.coroutines.ExecutorCoroutineDispatcher from(java.util.concurrent.ExecutorService r2) {
            kotlinx.coroutines.ExecutorCoroutineDispatcherImpl r0 = new kotlinx.coroutines.ExecutorCoroutineDispatcherImpl
            r1 = r2
            java.util.concurrent.Executor r1 = (java.util.concurrent.Executor) r1
            r0.<init>(r1)
            kotlinx.coroutines.ExecutorCoroutineDispatcher r0 = (kotlinx.coroutines.ExecutorCoroutineDispatcher) r0
            return r0
    }
}
