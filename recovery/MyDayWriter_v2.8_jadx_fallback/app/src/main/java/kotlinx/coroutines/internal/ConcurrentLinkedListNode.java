package kotlinx.coroutines.internal;

import kotlinx.coroutines.internal.ConcurrentLinkedListNode;

/* JADX INFO: compiled from: ConcurrentLinkedList.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0006\b \u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00002\u00020\u0002B\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0017\u001a\u00020\u0018J\u0006\u0010\u0019\u001a\u00020\u000eJ\u001e\u0010\u001a\u001a\u0004\u0018\u00018\u00002\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cH\u0086\b¢\u0006\u0002\u0010\u001eJ\u0006\u0010\u001f\u001a\u00020\u0018J\u0013\u0010 \u001a\u00020\u000e2\u0006\u0010!\u001a\u00028\u0000¢\u0006\u0002\u0010\"R\u0011\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0006X\u0082\u0004R\u0011\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0006X\u0082\u0004R\u0016\u0010\b\u001a\u0004\u0018\u00018\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00028\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\nR\u0012\u0010\r\u001a\u00020\u000eX¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\u0011\u001a\u0004\u0018\u00018\u00008F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\nR\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0003\u001a\u0004\u0018\u00018\u00008F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\n¨\u0006#"}, d2 = {"Lkotlinx/coroutines/internal/ConcurrentLinkedListNode;", "N", "", "prev", "(Lkotlinx/coroutines/internal/ConcurrentLinkedListNode;)V", "_next", "Lkotlinx/atomicfu/AtomicRef;", "_prev", "aliveSegmentLeft", "getAliveSegmentLeft", "()Lkotlinx/coroutines/internal/ConcurrentLinkedListNode;", "aliveSegmentRight", "getAliveSegmentRight", "isRemoved", "", "()Z", "isTail", "next", "getNext", "nextOrClosed", "getNextOrClosed", "()Ljava/lang/Object;", "getPrev", "cleanPrev", "", "markAsClosed", "nextOrIfClosed", "onClosedAction", "Lkotlin/Function0;", "", "(Lkotlin/jvm/functions/Function0;)Lkotlinx/coroutines/internal/ConcurrentLinkedListNode;", "remove", "trySetNext", "value", "(Lkotlinx/coroutines/internal/ConcurrentLinkedListNode;)Z", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class ConcurrentLinkedListNode<N extends kotlinx.coroutines.internal.ConcurrentLinkedListNode<N>> {
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater _next$volatile$FU = null;
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater _prev$volatile$FU = null;
    private volatile /* synthetic */ java.lang.Object _next$volatile;
    private volatile /* synthetic */ java.lang.Object _prev$volatile;

    static {
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.String r1 = "_next$volatile"
            java.lang.Class<kotlinx.coroutines.internal.ConcurrentLinkedListNode> r2 = kotlinx.coroutines.internal.ConcurrentLinkedListNode.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r0, r1)
            kotlinx.coroutines.internal.ConcurrentLinkedListNode._next$volatile$FU = r0
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.String r1 = "_prev$volatile"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r0, r1)
            kotlinx.coroutines.internal.ConcurrentLinkedListNode._prev$volatile$FU = r0
            return
    }

    public ConcurrentLinkedListNode(N r1) {
            r0 = this;
            r0.<init>()
            r0._prev$volatile = r1
            return
    }

    public static final /* synthetic */ java.lang.Object access$getNextOrClosed(kotlinx.coroutines.internal.ConcurrentLinkedListNode r1) {
            java.lang.Object r0 = r1.getNextOrClosed()
            return r0
    }

    private final N getAliveSegmentLeft() {
            r2 = this;
            kotlinx.coroutines.internal.ConcurrentLinkedListNode r0 = r2.getPrev()
        L4:
            if (r0 == 0) goto L18
            boolean r1 = r0.isRemoved()
            if (r1 == 0) goto L18
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = get_prev$volatile$FU()
            java.lang.Object r1 = r1.get(r0)
            r0 = r1
            kotlinx.coroutines.internal.ConcurrentLinkedListNode r0 = (kotlinx.coroutines.internal.ConcurrentLinkedListNode) r0
            goto L4
        L18:
            return r0
    }

    private final N getAliveSegmentRight() {
            r2 = this;
            boolean r0 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            if (r0 == 0) goto L14
            r0 = 0
            boolean r1 = r2.isTail()
            if (r1 != 0) goto Le
            goto L14
        Le:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L14:
            kotlinx.coroutines.internal.ConcurrentLinkedListNode r0 = r2.getNext()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
        L1b:
            boolean r1 = r0.isRemoved()
            if (r1 == 0) goto L2a
            kotlinx.coroutines.internal.ConcurrentLinkedListNode r1 = r0.getNext()
            if (r1 != 0) goto L28
            return r0
        L28:
            r0 = r1
            goto L1b
        L2a:
            return r0
    }

    private final java.lang.Object getNextOrClosed() {
            r1 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = get_next$volatile$FU()
            java.lang.Object r0 = r0.get(r1)
            return r0
    }

    private final /* synthetic */ java.lang.Object get_next$volatile() {
            r1 = this;
            java.lang.Object r0 = r1._next$volatile
            return r0
    }

    private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater get_next$volatile$FU() {
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.internal.ConcurrentLinkedListNode._next$volatile$FU
            return r0
    }

    private final /* synthetic */ java.lang.Object get_prev$volatile() {
            r1 = this;
            java.lang.Object r0 = r1._prev$volatile
            return r0
    }

    private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater get_prev$volatile$FU() {
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.internal.ConcurrentLinkedListNode._prev$volatile$FU
            return r0
    }

    private final /* synthetic */ void set_next$volatile(java.lang.Object r1) {
            r0 = this;
            r0._next$volatile = r1
            return
    }

    private final /* synthetic */ void set_prev$volatile(java.lang.Object r1) {
            r0 = this;
            r0._prev$volatile = r1
            return
    }

    private final /* synthetic */ void update$atomicfu(java.lang.Object r3, java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4, kotlin.jvm.functions.Function1<java.lang.Object, ? extends java.lang.Object> r5) {
            r2 = this;
        L0:
            java.lang.Object r0 = r4.get(r3)
            java.lang.Object r1 = r5.invoke(r0)
            boolean r0 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r4, r3, r0, r1)
            if (r0 == 0) goto L0
            return
    }

    public final void cleanPrev() {
            r2 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = get_prev$volatile$FU()
            r1 = 0
            r0.set(r2, r1)
            return
    }

    public final N getNext() {
            r6 = this;
            r0 = r6
            r1 = 0
            java.lang.Object r2 = access$getNextOrClosed(r0)
            r3 = 0
            kotlinx.coroutines.internal.Symbol r4 = kotlinx.coroutines.internal.ConcurrentLinkedListKt.access$getCLOSED$p()
            if (r2 != r4) goto L10
            r4 = 0
            r5 = 0
            return r5
        L10:
            r4 = r2
            kotlinx.coroutines.internal.ConcurrentLinkedListNode r4 = (kotlinx.coroutines.internal.ConcurrentLinkedListNode) r4
            return r4
    }

    public final N getPrev() {
            r1 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = get_prev$volatile$FU()
            java.lang.Object r0 = r0.get(r1)
            kotlinx.coroutines.internal.ConcurrentLinkedListNode r0 = (kotlinx.coroutines.internal.ConcurrentLinkedListNode) r0
            return r0
    }

    public abstract boolean isRemoved();

    public final boolean isTail() {
            r1 = this;
            kotlinx.coroutines.internal.ConcurrentLinkedListNode r0 = r1.getNext()
            if (r0 != 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    public final boolean markAsClosed() {
            r3 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = get_next$volatile$FU()
            r1 = 0
            kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.internal.ConcurrentLinkedListKt.access$getCLOSED$p()
            boolean r0 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r0, r3, r1, r2)
            return r0
    }

    public final N nextOrIfClosed(kotlin.jvm.functions.Function0 r5) {
            r4 = this;
            r0 = 0
            java.lang.Object r1 = access$getNextOrClosed(r4)
            r2 = 0
            kotlinx.coroutines.internal.Symbol r3 = kotlinx.coroutines.internal.ConcurrentLinkedListKt.access$getCLOSED$p()
            if (r1 == r3) goto L12
            r3 = r1
            kotlinx.coroutines.internal.ConcurrentLinkedListNode r3 = (kotlinx.coroutines.internal.ConcurrentLinkedListNode) r3
            return r3
        L12:
            r5.invoke()
            kotlin.KotlinNothingValueException r3 = new kotlin.KotlinNothingValueException
            r3.<init>()
            throw r3
    }

    public final void remove() {
            r8 = this;
            boolean r0 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            if (r0 == 0) goto L20
            r0 = 0
            boolean r1 = r8.isRemoved()
            if (r1 != 0) goto L16
            boolean r1 = r8.isTail()
            if (r1 == 0) goto L14
            goto L16
        L14:
            r1 = 0
            goto L17
        L16:
            r1 = 1
        L17:
            if (r1 == 0) goto L1a
            goto L20
        L1a:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L20:
            boolean r0 = r8.isTail()
            if (r0 == 0) goto L27
            return
        L27:
            kotlinx.coroutines.internal.ConcurrentLinkedListNode r0 = r8.getAliveSegmentLeft()
            kotlinx.coroutines.internal.ConcurrentLinkedListNode r1 = r8.getAliveSegmentRight()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = get_prev$volatile$FU()
            r3 = r8
        L35:
            java.lang.Object r4 = r2.get(r1)
            r5 = r4
            kotlinx.coroutines.internal.ConcurrentLinkedListNode r5 = (kotlinx.coroutines.internal.ConcurrentLinkedListNode) r5
            r6 = 0
            if (r5 != 0) goto L41
            r7 = 0
            goto L42
        L41:
            r7 = r0
        L42:
            boolean r4 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r2, r1, r4, r7)
            if (r4 == 0) goto L35
            if (r0 == 0) goto L51
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = get_next$volatile$FU()
            r2.set(r0, r1)
        L51:
            boolean r2 = r1.isRemoved()
            if (r2 == 0) goto L5d
            boolean r2 = r1.isTail()
            if (r2 == 0) goto L27
        L5d:
            if (r0 == 0) goto L65
            boolean r2 = r0.isRemoved()
            if (r2 != 0) goto L27
        L65:
            return
    }

    public final boolean trySetNext(N r3) {
            r2 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = get_next$volatile$FU()
            r1 = 0
            boolean r0 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r0, r2, r1, r3)
            return r0
    }
}
