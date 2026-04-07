package kotlinx.coroutines.internal;

/* JADX INFO: compiled from: ConcurrentLinkedList.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000N\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a8\u0010\u0004\u001a\u00020\u0005*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00032!\u0010\b\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u00050\tH\u0082\b\u001a!\u0010\r\u001a\u0002H\u000e\"\u000e\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\u000f*\u0002H\u000eH\u0000¢\u0006\u0002\u0010\u0010\u001as\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u00130\u0012\"\u000e\b\u0000\u0010\u0013*\b\u0012\u0004\u0012\u0002H\u00130\u0014*\b\u0012\u0004\u0012\u0002H\u00130\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u0002H\u001328\b\b\u0010\u0019\u001a2\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0016\u0012\u0013\u0012\u0011H\u0013¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u0002H\u00130\u001aH\u0080\b\u001ag\u0010\u001c\u001a\b\u0012\u0004\u0012\u0002H\u00130\u0012\"\u000e\b\u0000\u0010\u0013*\b\u0012\u0004\u0012\u0002H\u00130\u0014*\u0002H\u00132\u0006\u0010\u0016\u001a\u00020\u001726\u0010\u0019\u001a2\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0016\u0012\u0013\u0012\u0011H\u0013¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u0002H\u00130\u001aH\u0000¢\u0006\u0002\u0010\u001d\u001a+\u0010\u001e\u001a\u00020\u0005\"\u000e\b\u0000\u0010\u0013*\b\u0012\u0004\u0012\u0002H\u00130\u0014*\b\u0012\u0004\u0012\u0002H\u00130\u00152\u0006\u0010\u001f\u001a\u0002H\u0013H\u0080\b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"CLOSED", "Lkotlinx/coroutines/internal/Symbol;", "POINTERS_SHIFT", "", "addConditionally", "", "Lkotlinx/atomicfu/AtomicInt;", "delta", "condition", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "cur", "close", "N", "Lkotlinx/coroutines/internal/ConcurrentLinkedListNode;", "(Lkotlinx/coroutines/internal/ConcurrentLinkedListNode;)Lkotlinx/coroutines/internal/ConcurrentLinkedListNode;", "findSegmentAndMoveForward", "Lkotlinx/coroutines/internal/SegmentOrClosed;", "S", "Lkotlinx/coroutines/internal/Segment;", "Lkotlinx/atomicfu/AtomicRef;", "id", "", "startFrom", "createNewSegment", "Lkotlin/Function2;", "prev", "findSegmentInternal", "(Lkotlinx/coroutines/internal/Segment;JLkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "moveForward", "to", "kotlinx-coroutines-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class ConcurrentLinkedListKt {
    private static final kotlinx.coroutines.internal.Symbol CLOSED = null;
    private static final int POINTERS_SHIFT = 16;

    static {
            kotlinx.coroutines.internal.Symbol r0 = new kotlinx.coroutines.internal.Symbol
            java.lang.String r1 = "CLOSED"
            r0.<init>(r1)
            kotlinx.coroutines.internal.ConcurrentLinkedListKt.CLOSED = r0
            return
    }

    public static final /* synthetic */ kotlinx.coroutines.internal.Symbol access$getCLOSED$p() {
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.internal.ConcurrentLinkedListKt.CLOSED
            return r0
    }

    private static final /* synthetic */ boolean addConditionally$atomicfu(java.lang.Object r2, java.util.concurrent.atomic.AtomicIntegerFieldUpdater r3, int r4, kotlin.jvm.functions.Function1<? super java.lang.Integer, java.lang.Boolean> r5) {
        L1:
            int r0 = r3.get(r2)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.Object r1 = r5.invoke(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L18
            r1 = 0
            return r1
        L18:
            int r1 = r0 + r4
            boolean r1 = r3.compareAndSet(r2, r0, r1)
            if (r1 == 0) goto L1
            r1 = 1
            return r1
    }

    private static final /* synthetic */ boolean addConditionally$atomicfu$array(java.util.concurrent.atomic.AtomicIntegerArray r2, int r3, int r4, kotlin.jvm.functions.Function1<? super java.lang.Integer, java.lang.Boolean> r5) {
        L1:
            int r0 = r2.get(r3)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.Object r1 = r5.invoke(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L18
            r1 = 0
            return r1
        L18:
            int r1 = r0 + r4
            boolean r1 = r2.compareAndSet(r3, r0, r1)
            if (r1 == 0) goto L1
            r1 = 1
            return r1
    }

    public static final <N extends kotlinx.coroutines.internal.ConcurrentLinkedListNode<N>> N close(N r6) {
            r0 = 0
            r0 = r6
        L2:
            r1 = r0
            r2 = 0
            java.lang.Object r3 = kotlinx.coroutines.internal.ConcurrentLinkedListNode.access$getNextOrClosed(r1)
            r4 = 0
            kotlinx.coroutines.internal.Symbol r5 = access$getCLOSED$p()
            if (r3 != r5) goto L12
            r5 = 0
            return r0
        L12:
            r5 = r3
            kotlinx.coroutines.internal.ConcurrentLinkedListNode r5 = (kotlinx.coroutines.internal.ConcurrentLinkedListNode) r5
            if (r5 != 0) goto L22
            boolean r1 = r0.markAsClosed()
            if (r1 == 0) goto L2
            return r0
        L22:
            r0 = r5
            goto L2
    }

    public static final /* synthetic */ <S extends kotlinx.coroutines.internal.Segment<S>> java.lang.Object findSegmentAndMoveForward$atomicfu(java.lang.Object r8, java.util.concurrent.atomic.AtomicReferenceFieldUpdater r9, long r10, S r12, kotlin.jvm.functions.Function2<? super java.lang.Long, ? super S, ? extends S> r13) {
        L1:
            java.lang.Object r0 = findSegmentInternal(r12, r10, r13)
            boolean r1 = kotlinx.coroutines.internal.SegmentOrClosed.m1720isClosedimpl(r0)
            if (r1 != 0) goto L47
            kotlinx.coroutines.internal.Segment r1 = kotlinx.coroutines.internal.SegmentOrClosed.m1718getSegmentimpl(r0)
        L10:
            java.lang.Object r2 = r9.get(r8)
            kotlinx.coroutines.internal.Segment r2 = (kotlinx.coroutines.internal.Segment) r2
            r3 = 0
            long r4 = r2.id
            long r6 = r1.id
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            r5 = 1
            if (r4 < 0) goto L21
            goto L39
        L21:
            boolean r4 = r1.tryIncPointers$kotlinx_coroutines_core()
            if (r4 != 0) goto L29
            r5 = 0
            goto L39
        L29:
            boolean r4 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r9, r8, r2, r1)
            if (r4 == 0) goto L3c
            boolean r4 = r2.decPointers$kotlinx_coroutines_core()
            if (r4 == 0) goto L38
            r2.remove()
        L38:
        L39:
            if (r5 == 0) goto L1
            goto L47
        L3c:
            boolean r4 = r1.decPointers$kotlinx_coroutines_core()
            if (r4 == 0) goto L45
            r1.remove()
        L45:
            goto L10
        L47:
            return r0
    }

    public static final /* synthetic */ <S extends kotlinx.coroutines.internal.Segment<S>> java.lang.Object findSegmentAndMoveForward$atomicfu$array(java.util.concurrent.atomic.AtomicReferenceArray r8, int r9, long r10, S r12, kotlin.jvm.functions.Function2<? super java.lang.Long, ? super S, ? extends S> r13) {
        L1:
            java.lang.Object r0 = findSegmentInternal(r12, r10, r13)
            boolean r1 = kotlinx.coroutines.internal.SegmentOrClosed.m1720isClosedimpl(r0)
            if (r1 != 0) goto L47
            kotlinx.coroutines.internal.Segment r1 = kotlinx.coroutines.internal.SegmentOrClosed.m1718getSegmentimpl(r0)
        L10:
            java.lang.Object r2 = r8.get(r9)
            kotlinx.coroutines.internal.Segment r2 = (kotlinx.coroutines.internal.Segment) r2
            r3 = 0
            long r4 = r2.id
            long r6 = r1.id
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            r5 = 1
            if (r4 < 0) goto L21
            goto L39
        L21:
            boolean r4 = r1.tryIncPointers$kotlinx_coroutines_core()
            if (r4 != 0) goto L29
            r5 = 0
            goto L39
        L29:
            boolean r4 = kotlinx.coroutines.channels.ChannelSegment$$ExternalSyntheticBackportWithForwarding0.m(r8, r9, r2, r1)
            if (r4 == 0) goto L3c
            boolean r4 = r2.decPointers$kotlinx_coroutines_core()
            if (r4 == 0) goto L38
            r2.remove()
        L38:
        L39:
            if (r5 == 0) goto L1
            goto L47
        L3c:
            boolean r4 = r1.decPointers$kotlinx_coroutines_core()
            if (r4 == 0) goto L45
            r1.remove()
        L45:
            goto L10
        L47:
            return r0
    }

    public static final <S extends kotlinx.coroutines.internal.Segment<S>> java.lang.Object findSegmentInternal(S r7, long r8, kotlin.jvm.functions.Function2<? super java.lang.Long, ? super S, ? extends S> r10) {
            r0 = r7
        L1:
            long r1 = r0.id
            int r1 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r1 < 0) goto L13
            boolean r1 = r0.isRemoved()
            if (r1 == 0) goto Le
            goto L13
        Le:
            java.lang.Object r1 = kotlinx.coroutines.internal.SegmentOrClosed.m1715constructorimpl(r0)
            return r1
        L13:
            r1 = r0
            kotlinx.coroutines.internal.ConcurrentLinkedListNode r1 = (kotlinx.coroutines.internal.ConcurrentLinkedListNode) r1
            r2 = 0
            java.lang.Object r3 = kotlinx.coroutines.internal.ConcurrentLinkedListNode.access$getNextOrClosed(r1)
            r4 = 0
            kotlinx.coroutines.internal.Symbol r5 = access$getCLOSED$p()
            if (r3 != r5) goto L2a
            r5 = 0
            kotlinx.coroutines.internal.Symbol r6 = kotlinx.coroutines.internal.ConcurrentLinkedListKt.CLOSED
            java.lang.Object r6 = kotlinx.coroutines.internal.SegmentOrClosed.m1715constructorimpl(r6)
            return r6
        L2a:
            r5 = r3
            kotlinx.coroutines.internal.ConcurrentLinkedListNode r5 = (kotlinx.coroutines.internal.ConcurrentLinkedListNode) r5
            r1 = r5
            kotlinx.coroutines.internal.Segment r1 = (kotlinx.coroutines.internal.Segment) r1
            if (r1 == 0) goto L37
            r0 = r1
            goto L1
        L37:
            long r2 = r0.id
            r4 = 1
            long r2 = r2 + r4
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.Object r2 = r10.invoke(r2, r0)
            kotlinx.coroutines.internal.Segment r2 = (kotlinx.coroutines.internal.Segment) r2
            r3 = r2
            kotlinx.coroutines.internal.ConcurrentLinkedListNode r3 = (kotlinx.coroutines.internal.ConcurrentLinkedListNode) r3
            boolean r3 = r0.trySetNext(r3)
            if (r3 == 0) goto L1
            boolean r3 = r0.isRemoved()
            if (r3 == 0) goto L58
            r0.remove()
        L58:
            r0 = r2
            goto L1
    }

    private static final /* synthetic */ void loop$atomicfu(java.lang.Object r1, java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2, kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit> r3) {
        L0:
            java.lang.Object r0 = r2.get(r1)
            r3.invoke(r0)
            goto L0
    }

    private static final /* synthetic */ void loop$atomicfu$array(java.util.concurrent.atomic.AtomicReferenceArray r1, int r2, kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit> r3) {
        L0:
            java.lang.Object r0 = r1.get(r2)
            r3.invoke(r0)
            goto L0
    }

    public static final /* synthetic */ <S extends kotlinx.coroutines.internal.Segment<S>> boolean moveForward$atomicfu(java.lang.Object r6, java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7, S r8) {
        L0:
            java.lang.Object r0 = r7.get(r6)
            kotlinx.coroutines.internal.Segment r0 = (kotlinx.coroutines.internal.Segment) r0
            r1 = 0
            long r2 = r0.id
            long r4 = r8.id
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r3 = 1
            if (r2 < 0) goto L11
            return r3
        L11:
            boolean r2 = r8.tryIncPointers$kotlinx_coroutines_core()
            if (r2 != 0) goto L19
            r2 = 0
            return r2
        L19:
            boolean r2 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r7, r6, r0, r8)
            if (r2 == 0) goto L29
            boolean r2 = r0.decPointers$kotlinx_coroutines_core()
            if (r2 == 0) goto L28
            r0.remove()
        L28:
            return r3
        L29:
            boolean r2 = r8.decPointers$kotlinx_coroutines_core()
            if (r2 == 0) goto L32
            r8.remove()
        L32:
            goto L0
    }

    public static final /* synthetic */ <S extends kotlinx.coroutines.internal.Segment<S>> boolean moveForward$atomicfu$array(java.util.concurrent.atomic.AtomicReferenceArray r6, int r7, S r8) {
        L0:
            java.lang.Object r0 = r6.get(r7)
            kotlinx.coroutines.internal.Segment r0 = (kotlinx.coroutines.internal.Segment) r0
            r1 = 0
            long r2 = r0.id
            long r4 = r8.id
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r3 = 1
            if (r2 < 0) goto L11
            return r3
        L11:
            boolean r2 = r8.tryIncPointers$kotlinx_coroutines_core()
            if (r2 != 0) goto L19
            r2 = 0
            return r2
        L19:
            boolean r2 = kotlinx.coroutines.channels.ChannelSegment$$ExternalSyntheticBackportWithForwarding0.m(r6, r7, r0, r8)
            if (r2 == 0) goto L29
            boolean r2 = r0.decPointers$kotlinx_coroutines_core()
            if (r2 == 0) goto L28
            r0.remove()
        L28:
            return r3
        L29:
            boolean r2 = r8.decPointers$kotlinx_coroutines_core()
            if (r2 == 0) goto L32
            r8.remove()
        L32:
            goto L0
    }
}
