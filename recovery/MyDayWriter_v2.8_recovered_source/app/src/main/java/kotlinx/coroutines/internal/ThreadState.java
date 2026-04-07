package kotlinx.coroutines.internal;

/* JADX INFO: compiled from: ThreadContext.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001c\u0010\u000e\u001a\u00020\u000f2\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\t2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001J\u000e\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0002\u001a\u00020\u0003R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R \u0010\u0007\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\t0\bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\nR\u000e\u0010\u000b\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\r¨\u0006\u0013"}, d2 = {"Lkotlinx/coroutines/internal/ThreadState;", "", "context", "Lkotlin/coroutines/CoroutineContext;", "n", "", "(Lkotlin/coroutines/CoroutineContext;I)V", "elements", "", "Lkotlinx/coroutines/ThreadContextElement;", "[Lkotlinx/coroutines/ThreadContextElement;", "i", "values", "[Ljava/lang/Object;", "append", "", "element", "value", "restore", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class ThreadState {
    public final kotlin.coroutines.CoroutineContext context;
    private final kotlinx.coroutines.ThreadContextElement<java.lang.Object>[] elements;
    private int i;
    private final java.lang.Object[] values;

    public ThreadState(kotlin.coroutines.CoroutineContext r2, int r3) {
            r1 = this;
            r1.<init>()
            r1.context = r2
            java.lang.Object[] r0 = new java.lang.Object[r3]
            r1.values = r0
            kotlinx.coroutines.ThreadContextElement[] r0 = new kotlinx.coroutines.ThreadContextElement[r3]
            r1.elements = r0
            return
    }

    public final void append(kotlinx.coroutines.ThreadContextElement<?> r4, java.lang.Object r5) {
            r3 = this;
            java.lang.Object[] r0 = r3.values
            int r1 = r3.i
            r0[r1] = r5
            kotlinx.coroutines.ThreadContextElement<java.lang.Object>[] r0 = r3.elements
            int r1 = r3.i
            int r2 = r1 + 1
            r3.i = r2
            java.lang.String r2 = "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4, r2)
            r0[r1] = r4
            return
    }

    public final void restore(kotlin.coroutines.CoroutineContext r5) {
            r4 = this;
            kotlinx.coroutines.ThreadContextElement<java.lang.Object>[] r0 = r4.elements
            int r0 = r0.length
            int r0 = r0 + (-1)
            if (r0 < 0) goto L1a
        L7:
            r1 = r0
            int r0 = r0 + (-1)
            kotlinx.coroutines.ThreadContextElement<java.lang.Object>[] r2 = r4.elements
            r2 = r2[r1]
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            java.lang.Object[] r3 = r4.values
            r3 = r3[r1]
            r2.restoreThreadContext(r5, r3)
            if (r0 >= 0) goto L7
        L1a:
            return
    }
}
