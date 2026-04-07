package kotlin.coroutines.jvm.internal;

/* JADX INFO: compiled from: ContinuationImpl.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b!\u0018\u00002\u00020\u0001B\u0017\u0012\u0010\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lkotlin/coroutines/jvm/internal/RestrictedContinuationImpl;", "Lkotlin/coroutines/jvm/internal/BaseContinuationImpl;", "completion", "Lkotlin/coroutines/Continuation;", "", "(Lkotlin/coroutines/Continuation;)V", "context", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class RestrictedContinuationImpl extends kotlin.coroutines.jvm.internal.BaseContinuationImpl {
    public RestrictedContinuationImpl(kotlin.coroutines.Continuation<java.lang.Object> r5) {
            r4 = this;
            r4.<init>(r5)
            if (r5 == 0) goto L25
            r0 = r5
            r1 = 0
            kotlin.coroutines.CoroutineContext r2 = r0.getContext()
            kotlin.coroutines.EmptyCoroutineContext r3 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
            if (r2 != r3) goto L12
            r2 = 1
            goto L13
        L12:
            r2 = 0
        L13:
            if (r2 == 0) goto L17
        L16:
            goto L25
        L17:
            r2 = 0
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Coroutines with restricted suspension must have EmptyCoroutineContext"
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
        L25:
            return
    }

    @Override // kotlin.coroutines.Continuation
    public kotlin.coroutines.CoroutineContext getContext() {
            r1 = this;
            kotlin.coroutines.EmptyCoroutineContext r0 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
            kotlin.coroutines.CoroutineContext r0 = (kotlin.coroutines.CoroutineContext) r0
            return r0
    }
}
