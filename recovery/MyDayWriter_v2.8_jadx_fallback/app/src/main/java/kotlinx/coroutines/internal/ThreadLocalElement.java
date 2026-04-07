package kotlinx.coroutines.internal;

/* JADX INFO: compiled from: ThreadContext.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u001b\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0002\u0010\u0006J(\u0010\f\u001a\u0004\u0018\u0001H\r\"\b\b\u0001\u0010\r*\u00020\u000e2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\r0\bH\u0096\u0002¢\u0006\u0002\u0010\u000fJ\u0014\u0010\u0010\u001a\u00020\u00112\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\bH\u0016J\u001d\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\u0015\u0010\u0019\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00020\u0011H\u0016¢\u0006\u0002\u0010\u001aR\u0018\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0003\u001a\u00028\u0000X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000b¨\u0006\u001b"}, d2 = {"Lkotlinx/coroutines/internal/ThreadLocalElement;", "T", "Lkotlinx/coroutines/ThreadContextElement;", "value", "threadLocal", "Ljava/lang/ThreadLocal;", "(Ljava/lang/Object;Ljava/lang/ThreadLocal;)V", "key", "Lkotlin/coroutines/CoroutineContext$Key;", "getKey", "()Lkotlin/coroutines/CoroutineContext$Key;", "Ljava/lang/Object;", "get", "E", "Lkotlin/coroutines/CoroutineContext$Element;", "(Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext$Element;", "minusKey", "Lkotlin/coroutines/CoroutineContext;", "restoreThreadContext", "", "context", "oldState", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;)V", "toString", "", "updateThreadContext", "(Lkotlin/coroutines/CoroutineContext;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ThreadLocalElement<T> implements kotlinx.coroutines.ThreadContextElement<T> {
    private final kotlin.coroutines.CoroutineContext.Key<?> key;
    private final java.lang.ThreadLocal<T> threadLocal;
    private final T value;

    public ThreadLocalElement(T r3, java.lang.ThreadLocal<T> r4) {
            r2 = this;
            r2.<init>()
            r2.value = r3
            r2.threadLocal = r4
            kotlinx.coroutines.internal.ThreadLocalKey r0 = new kotlinx.coroutines.internal.ThreadLocalKey
            java.lang.ThreadLocal<T> r1 = r2.threadLocal
            r0.<init>(r1)
            kotlin.coroutines.CoroutineContext$Key r0 = (kotlin.coroutines.CoroutineContext.Key) r0
            r2.key = r0
            return
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public <R> R fold(R r2, kotlin.jvm.functions.Function2<? super R, ? super kotlin.coroutines.CoroutineContext.Element, ? extends R> r3) {
            r1 = this;
            java.lang.Object r0 = kotlinx.coroutines.ThreadContextElement.DefaultImpls.fold(r1, r2, r3)
            return r0
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public <E extends kotlin.coroutines.CoroutineContext.Element> E get(kotlin.coroutines.CoroutineContext.Key<E> r2) {
            r1 = this;
            kotlin.coroutines.CoroutineContext$Key r0 = r1.getKey()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r2)
            if (r0 == 0) goto L13
            java.lang.String r0 = "null cannot be cast to non-null type E of kotlinx.coroutines.internal.ThreadLocalElement.get"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1, r0)
            r0 = r1
            kotlin.coroutines.CoroutineContext$Element r0 = (kotlin.coroutines.CoroutineContext.Element) r0
            goto L14
        L13:
            r0 = 0
        L14:
            return r0
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    public kotlin.coroutines.CoroutineContext.Key<?> getKey() {
            r1 = this;
            kotlin.coroutines.CoroutineContext$Key<?> r0 = r1.key
            return r0
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public kotlin.coroutines.CoroutineContext minusKey(kotlin.coroutines.CoroutineContext.Key<?> r2) {
            r1 = this;
            kotlin.coroutines.CoroutineContext$Key r0 = r1.getKey()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r2)
            if (r0 == 0) goto Lf
            kotlin.coroutines.EmptyCoroutineContext r0 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
            kotlin.coroutines.CoroutineContext r0 = (kotlin.coroutines.CoroutineContext) r0
            goto L12
        Lf:
            r0 = r1
            kotlin.coroutines.CoroutineContext r0 = (kotlin.coroutines.CoroutineContext) r0
        L12:
            return r0
    }

    @Override // kotlin.coroutines.CoroutineContext
    public kotlin.coroutines.CoroutineContext plus(kotlin.coroutines.CoroutineContext r2) {
            r1 = this;
            kotlin.coroutines.CoroutineContext r0 = kotlinx.coroutines.ThreadContextElement.DefaultImpls.plus(r1, r2)
            return r0
    }

    @Override // kotlinx.coroutines.ThreadContextElement
    public void restoreThreadContext(kotlin.coroutines.CoroutineContext r2, T r3) {
            r1 = this;
            java.lang.ThreadLocal<T> r0 = r1.threadLocal
            r0.set(r3)
            return
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "ThreadLocal(value="
            java.lang.StringBuilder r0 = r0.append(r1)
            T r1 = r2.value
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", threadLocal = "
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.ThreadLocal<T> r1 = r2.threadLocal
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = 41
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // kotlinx.coroutines.ThreadContextElement
    public T updateThreadContext(kotlin.coroutines.CoroutineContext r4) {
            r3 = this;
            java.lang.ThreadLocal<T> r0 = r3.threadLocal
            java.lang.Object r0 = r0.get()
            java.lang.ThreadLocal<T> r1 = r3.threadLocal
            T r2 = r3.value
            r1.set(r2)
            return r0
    }
}
