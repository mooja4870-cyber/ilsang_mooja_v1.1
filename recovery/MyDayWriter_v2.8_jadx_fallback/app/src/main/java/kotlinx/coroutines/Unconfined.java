package kotlinx.coroutines;

/* JADX INFO: compiled from: Unconfined.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\n\u0010\u0007\u001a\u00060\bj\u0002`\tH\u0016J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u000eH\u0017J\b\u0010\u000f\u001a\u00020\u0010H\u0016¨\u0006\u0011"}, d2 = {"Lkotlinx/coroutines/Unconfined;", "Lkotlinx/coroutines/CoroutineDispatcher;", "()V", "dispatch", "", "context", "Lkotlin/coroutines/CoroutineContext;", "block", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "isDispatchNeeded", "", "limitedParallelism", "parallelism", "", "toString", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class Unconfined extends kotlinx.coroutines.CoroutineDispatcher {
    public static final kotlinx.coroutines.Unconfined INSTANCE = null;

    static {
            kotlinx.coroutines.Unconfined r0 = new kotlinx.coroutines.Unconfined
            r0.<init>()
            kotlinx.coroutines.Unconfined.INSTANCE = r0
            return
    }

    private Unconfined() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* JADX INFO: renamed from: dispatch */
    public void mo1712dispatch(kotlin.coroutines.CoroutineContext r4, java.lang.Runnable r5) {
            r3 = this;
            kotlinx.coroutines.YieldContext$Key r0 = kotlinx.coroutines.YieldContext.Key
            kotlin.coroutines.CoroutineContext$Key r0 = (kotlin.coroutines.CoroutineContext.Key) r0
            kotlin.coroutines.CoroutineContext$Element r0 = r4.get(r0)
            kotlinx.coroutines.YieldContext r0 = (kotlinx.coroutines.YieldContext) r0
            if (r0 == 0) goto L10
            r1 = 1
            r0.dispatcherWasUnconfined = r1
            return
        L10:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls."
            r1.<init>(r2)
            throw r1
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public boolean isDispatchNeeded(kotlin.coroutines.CoroutineContext r2) {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public kotlinx.coroutines.CoroutineDispatcher limitedParallelism(int r3) {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "limitedParallelism is not supported for Dispatchers.Unconfined"
            r0.<init>(r1)
            throw r0
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = "Dispatchers.Unconfined"
            return r0
    }
}
