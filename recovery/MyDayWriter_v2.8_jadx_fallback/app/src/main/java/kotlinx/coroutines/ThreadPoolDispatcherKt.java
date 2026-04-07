package kotlinx.coroutines;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"kotlinx/coroutines/ThreadPoolDispatcherKt__MultithreadedDispatchers_commonKt", "kotlinx/coroutines/ThreadPoolDispatcherKt__ThreadPoolDispatcherKt"}, k = 4, mv = {1, 9, 0}, xi = 48)
public final class ThreadPoolDispatcherKt {
    public static final kotlinx.coroutines.ExecutorCoroutineDispatcher newFixedThreadPoolContext(int r1, java.lang.String r2) {
            kotlinx.coroutines.ExecutorCoroutineDispatcher r0 = kotlinx.coroutines.ThreadPoolDispatcherKt__ThreadPoolDispatcherKt.newFixedThreadPoolContext(r1, r2)
            return r0
    }

    public static final kotlinx.coroutines.ExecutorCoroutineDispatcher newSingleThreadContext(java.lang.String r1) {
            kotlinx.coroutines.ExecutorCoroutineDispatcher r0 = kotlinx.coroutines.ThreadPoolDispatcherKt__MultithreadedDispatchers_commonKt.newSingleThreadContext(r1)
            return r0
    }
}
