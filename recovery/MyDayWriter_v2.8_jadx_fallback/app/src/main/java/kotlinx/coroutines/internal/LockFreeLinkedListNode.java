package kotlinx.coroutines.internal;

/* JADX INFO: compiled from: LockFreeLinkedList.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0017\u0018\u00002\u00020\u0001:\u00010B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0014\u001a\u00020\u00152\n\u0010\u0016\u001a\u00060\u0000j\u0002`\u000fJ%\u0010\u0017\u001a\u00020\t2\n\u0010\u0016\u001a\u00060\u0000j\u0002`\u000f2\u000e\b\u0004\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\t0\u0019H\u0086\bJ \u0010\u001a\u001a\u00020\t2\n\u0010\u0016\u001a\u00060\u0000j\u0002`\u000f2\n\u0010\u000b\u001a\u00060\u0000j\u0002`\u000fH\u0001J\u0012\u0010\u001b\u001a\u00020\t2\n\u0010\u0016\u001a\u00060\u0000j\u0002`\u000fJ\u001b\u0010\u001c\u001a\n\u0018\u00010\u0000j\u0004\u0018\u0001`\u000f2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0082\u0010J\u0019\u0010\u001f\u001a\u00060\u0000j\u0002`\u000f2\n\u0010 \u001a\u00060\u0000j\u0002`\u000fH\u0082\u0010J\u0014\u0010!\u001a\u00020\u00152\n\u0010\u000b\u001a\u00060\u0000j\u0002`\u000fH\u0002J%\u0010\"\u001a\u00020#2\n\u0010\u0016\u001a\u00060\u0000j\u0002`\u000f2\u000e\b\u0004\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\t0\u0019H\u0081\bJ\u0010\u0010$\u001a\n\u0018\u00010\u0000j\u0004\u0018\u0001`\u000fH\u0014J\b\u0010%\u001a\u00020\tH\u0016J\u0010\u0010&\u001a\n\u0018\u00010\u0000j\u0004\u0018\u0001`\u000fH\u0001J\b\u0010'\u001a\u00020\u0007H\u0002J\b\u0010(\u001a\u00020)H\u0016J(\u0010*\u001a\u00020+2\n\u0010\u0016\u001a\u00060\u0000j\u0002`\u000f2\n\u0010\u000b\u001a\u00060\u0000j\u0002`\u000f2\u0006\u0010,\u001a\u00020#H\u0001J%\u0010-\u001a\u00020\u00152\n\u0010.\u001a\u00060\u0000j\u0002`\u000f2\n\u0010\u000b\u001a\u00060\u0000j\u0002`\u000fH\u0000¢\u0006\u0002\b/R\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004X\u0082\u0004R\u000f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004X\u0082\u0004R\u0011\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004X\u0082\u0004R\u0014\u0010\b\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\nR\u0011\u0010\u000b\u001a\u00020\u00018F¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0015\u0010\u000e\u001a\u00060\u0000j\u0002`\u000f8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\u0012\u001a\u00060\u0000j\u0002`\u000f8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011¨\u00061"}, d2 = {"Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "", "()V", "_next", "Lkotlinx/atomicfu/AtomicRef;", "_prev", "_removedRef", "Lkotlinx/coroutines/internal/Removed;", "isRemoved", "", "()Z", "next", "getNext", "()Ljava/lang/Object;", "nextNode", "Lkotlinx/coroutines/internal/Node;", "getNextNode", "()Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "prevNode", "getPrevNode", "addLast", "", "node", "addLastIf", "condition", "Lkotlin/Function0;", "addNext", "addOneIfEmpty", "correctPrev", "op", "Lkotlinx/coroutines/internal/OpDescriptor;", "findPrevNonRemoved", "current", "finishAdd", "makeCondAddOp", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$CondAddOp;", "nextIfRemoved", "remove", "removeOrNext", "removed", "toString", "", "tryCondAddNext", "", "condAdd", "validateNode", "prev", "validateNode$kotlinx_coroutines_core", "CondAddOp", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class LockFreeLinkedListNode {
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater _next$volatile$FU = null;
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater _prev$volatile$FU = null;
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater _removedRef$volatile$FU = null;
    private volatile /* synthetic */ java.lang.Object _next$volatile;
    private volatile /* synthetic */ java.lang.Object _prev$volatile;
    private volatile /* synthetic */ java.lang.Object _removedRef$volatile;

    /* JADX INFO: compiled from: LockFreeLinkedList.kt */
    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\b!\u0018\u00002\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u0001B\u0011\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0002\u0010\u0005J\u001e\u0010\u0007\u001a\u00020\b2\n\u0010\t\u001a\u00060\u0002j\u0002`\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016R\u0014\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lkotlinx/coroutines/internal/LockFreeLinkedListNode$CondAddOp;", "Lkotlinx/coroutines/internal/AtomicOp;", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "Lkotlinx/coroutines/internal/Node;", "newNode", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)V", "oldNext", "complete", "", "affected", "failure", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class CondAddOp extends kotlinx.coroutines.internal.AtomicOp<kotlinx.coroutines.internal.LockFreeLinkedListNode> {
        public final kotlinx.coroutines.internal.LockFreeLinkedListNode newNode;
        public kotlinx.coroutines.internal.LockFreeLinkedListNode oldNext;

        public CondAddOp(kotlinx.coroutines.internal.LockFreeLinkedListNode r1) {
                r0 = this;
                r0.<init>()
                r0.newNode = r1
                return
        }

        @Override // kotlinx.coroutines.internal.AtomicOp
        public /* bridge */ /* synthetic */ void complete(kotlinx.coroutines.internal.LockFreeLinkedListNode r2, java.lang.Object r3) {
                r1 = this;
                r0 = r2
                kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r0
                r1.complete2(r0, r3)
                return
        }

        /* JADX INFO: renamed from: complete, reason: avoid collision after fix types in other method */
        public void complete2(kotlinx.coroutines.internal.LockFreeLinkedListNode r5, java.lang.Object r6) {
                r4 = this;
                if (r6 != 0) goto L4
                r0 = 1
                goto L5
            L4:
                r0 = 0
            L5:
                if (r0 == 0) goto La
                kotlinx.coroutines.internal.LockFreeLinkedListNode r1 = r4.newNode
                goto Lc
            La:
                kotlinx.coroutines.internal.LockFreeLinkedListNode r1 = r4.oldNext
            Lc:
                if (r1 == 0) goto L24
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = kotlinx.coroutines.internal.LockFreeLinkedListNode.access$get_next$volatile$FU()
                boolean r2 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r2, r5, r4, r1)
                if (r2 == 0) goto L24
                if (r0 == 0) goto L24
                kotlinx.coroutines.internal.LockFreeLinkedListNode r2 = r4.newNode
                kotlinx.coroutines.internal.LockFreeLinkedListNode r3 = r4.oldNext
                kotlin.jvm.internal.Intrinsics.checkNotNull(r3)
                kotlinx.coroutines.internal.LockFreeLinkedListNode.access$finishAdd(r2, r3)
            L24:
                return
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.internal.LockFreeLinkedListNode$makeCondAddOp$1, reason: invalid class name */
    /* JADX INFO: compiled from: LockFreeLinkedList.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0016¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/internal/LockFreeLinkedListNode$makeCondAddOp$1", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$CondAddOp;", "prepare", "", "affected", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "Lkotlinx/coroutines/internal/Node;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 176)
    public static final class AnonymousClass1 extends kotlinx.coroutines.internal.LockFreeLinkedListNode.CondAddOp {
        final /* synthetic */ kotlin.jvm.functions.Function0<java.lang.Boolean> $condition;

        public AnonymousClass1(kotlinx.coroutines.internal.LockFreeLinkedListNode r1, kotlin.jvm.functions.Function0<java.lang.Boolean> r2) {
                r0 = this;
                r0.$condition = r2
                r0.<init>(r1)
                return
        }

        @Override // kotlinx.coroutines.internal.AtomicOp
        public /* bridge */ /* synthetic */ java.lang.Object prepare(kotlinx.coroutines.internal.LockFreeLinkedListNode r2) {
                r1 = this;
                r0 = r2
                kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r0
                java.lang.Object r0 = r1.prepare2(r0)
                return r0
        }

        /* JADX INFO: renamed from: prepare, reason: avoid collision after fix types in other method */
        public java.lang.Object prepare2(kotlinx.coroutines.internal.LockFreeLinkedListNode r2) {
                r1 = this;
                kotlin.jvm.functions.Function0<java.lang.Boolean> r0 = r1.$condition
                java.lang.Object r0 = r0.invoke()
                java.lang.Boolean r0 = (java.lang.Boolean) r0
                boolean r0 = r0.booleanValue()
                if (r0 == 0) goto L10
                r0 = 0
                goto L14
            L10:
                java.lang.Object r0 = kotlinx.coroutines.internal.LockFreeLinkedListKt.getCONDITION_FALSE()
            L14:
                return r0
        }
    }


    static {
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.String r1 = "_next$volatile"
            java.lang.Class<kotlinx.coroutines.internal.LockFreeLinkedListNode> r2 = kotlinx.coroutines.internal.LockFreeLinkedListNode.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r0, r1)
            kotlinx.coroutines.internal.LockFreeLinkedListNode._next$volatile$FU = r0
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.String r1 = "_prev$volatile"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r0, r1)
            kotlinx.coroutines.internal.LockFreeLinkedListNode._prev$volatile$FU = r0
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.String r1 = "_removedRef$volatile"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r0, r1)
            kotlinx.coroutines.internal.LockFreeLinkedListNode._removedRef$volatile$FU = r0
            return
    }

    public LockFreeLinkedListNode() {
            r0 = this;
            r0.<init>()
            r0._next$volatile = r0
            r0._prev$volatile = r0
            return
    }

    public static final /* synthetic */ void access$finishAdd(kotlinx.coroutines.internal.LockFreeLinkedListNode r0, kotlinx.coroutines.internal.LockFreeLinkedListNode r1) {
            r0.finishAdd(r1)
            return
    }

    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater access$get_next$volatile$FU() {
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = get_next$volatile$FU()
            return r0
    }

    private final kotlinx.coroutines.internal.LockFreeLinkedListNode correctPrev(kotlinx.coroutines.internal.OpDescriptor r7) {
            r6 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = get_prev$volatile$FU()
            java.lang.Object r0 = r0.get(r6)
            kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r0
            r1 = r0
            r2 = 0
        Lc:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = get_next$volatile$FU()
            java.lang.Object r3 = r3.get(r1)
            if (r3 != r6) goto L26
            if (r0 != r1) goto L1a
            return r1
        L1a:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = get_prev$volatile$FU()
            boolean r4 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r4, r6, r0, r1)
            if (r4 != 0) goto L25
            goto L0
        L25:
            return r1
        L26:
            boolean r4 = r6.isRemoved()
            if (r4 == 0) goto L2e
            r4 = 0
            return r4
        L2e:
            if (r3 != r7) goto L31
            return r1
        L31:
            boolean r4 = r3 instanceof kotlinx.coroutines.internal.OpDescriptor
            if (r4 == 0) goto L3c
            r4 = r3
            kotlinx.coroutines.internal.OpDescriptor r4 = (kotlinx.coroutines.internal.OpDescriptor) r4
            r4.perform(r1)
            goto L0
        L3c:
            boolean r4 = r3 instanceof kotlinx.coroutines.internal.Removed
            if (r4 == 0) goto L61
            if (r2 == 0) goto L55
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = get_next$volatile$FU()
            r5 = r3
            kotlinx.coroutines.internal.Removed r5 = (kotlinx.coroutines.internal.Removed) r5
            kotlinx.coroutines.internal.LockFreeLinkedListNode r5 = r5.ref
            boolean r4 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r4, r2, r1, r5)
            if (r4 != 0) goto L52
            goto L0
        L52:
            r1 = r2
            r2 = 0
            goto Lc
        L55:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = get_prev$volatile$FU()
            java.lang.Object r4 = r4.get(r1)
            r1 = r4
            kotlinx.coroutines.internal.LockFreeLinkedListNode r1 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r1
            goto Lc
        L61:
            r2 = r1
            java.lang.String r4 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3, r4)
            r1 = r3
            kotlinx.coroutines.internal.LockFreeLinkedListNode r1 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r1
            goto Lc
    }

    private final kotlinx.coroutines.internal.LockFreeLinkedListNode findPrevNonRemoved(kotlinx.coroutines.internal.LockFreeLinkedListNode r2) {
            r1 = this;
        L1:
            boolean r0 = r2.isRemoved()
            if (r0 != 0) goto L8
            return r2
        L8:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = get_prev$volatile$FU()
            java.lang.Object r0 = r0.get(r2)
            r2 = r0
            kotlinx.coroutines.internal.LockFreeLinkedListNode r2 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r2
            goto L1
    }

    private final void finishAdd(kotlinx.coroutines.internal.LockFreeLinkedListNode r6) {
            r5 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = get_prev$volatile$FU()
            r1 = r5
        L5:
            java.lang.Object r2 = r0.get(r6)
            kotlinx.coroutines.internal.LockFreeLinkedListNode r2 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r2
            r3 = 0
            java.lang.Object r4 = r5.getNext()
            if (r4 == r6) goto L13
            return
        L13:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = get_prev$volatile$FU()
            boolean r4 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r4, r6, r2, r5)
            if (r4 == 0) goto L28
            boolean r4 = r5.isRemoved()
            if (r4 == 0) goto L27
            r4 = 0
            r6.correctPrev(r4)
        L27:
            return
        L28:
            goto L5
    }

    private final /* synthetic */ java.lang.Object get_next$volatile() {
            r1 = this;
            java.lang.Object r0 = r1._next$volatile
            return r0
    }

    private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater get_next$volatile$FU() {
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.internal.LockFreeLinkedListNode._next$volatile$FU
            return r0
    }

    private final /* synthetic */ java.lang.Object get_prev$volatile() {
            r1 = this;
            java.lang.Object r0 = r1._prev$volatile
            return r0
    }

    private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater get_prev$volatile$FU() {
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.internal.LockFreeLinkedListNode._prev$volatile$FU
            return r0
    }

    private final /* synthetic */ java.lang.Object get_removedRef$volatile() {
            r1 = this;
            java.lang.Object r0 = r1._removedRef$volatile
            return r0
    }

    private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater get_removedRef$volatile$FU() {
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.internal.LockFreeLinkedListNode._removedRef$volatile$FU
            return r0
    }

    private final /* synthetic */ void loop$atomicfu(java.lang.Object r2, java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3, kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit> r4) {
            r1 = this;
        L0:
            java.lang.Object r0 = r3.get(r2)
            r4.invoke(r0)
            goto L0
    }

    private final kotlinx.coroutines.internal.Removed removed() {
            r4 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = get_removedRef$volatile$FU()
            java.lang.Object r0 = r0.get(r4)
            kotlinx.coroutines.internal.Removed r0 = (kotlinx.coroutines.internal.Removed) r0
            if (r0 != 0) goto L1a
            kotlinx.coroutines.internal.Removed r0 = new kotlinx.coroutines.internal.Removed
            r0.<init>(r4)
            r1 = r0
            r2 = 0
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = get_removedRef$volatile$FU()
            r3.set(r4, r1)
        L1a:
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

    private final /* synthetic */ void set_removedRef$volatile(java.lang.Object r1) {
            r0 = this;
            r0._removedRef$volatile = r1
            return
    }

    public final void addLast(kotlinx.coroutines.internal.LockFreeLinkedListNode r2) {
            r1 = this;
        L1:
            kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = r1.getPrevNode()
            boolean r0 = r0.addNext(r2, r1)
            if (r0 == 0) goto L1
            return
    }

    public final boolean addLastIf(kotlinx.coroutines.internal.LockFreeLinkedListNode r5, kotlin.jvm.functions.Function0<java.lang.Boolean> r6) {
            r4 = this;
            r0 = 0
            r1 = r4
            r2 = 0
            kotlinx.coroutines.internal.LockFreeLinkedListNode$makeCondAddOp$1 r3 = new kotlinx.coroutines.internal.LockFreeLinkedListNode$makeCondAddOp$1
            r3.<init>(r5, r6)
            kotlinx.coroutines.internal.LockFreeLinkedListNode$CondAddOp r3 = (kotlinx.coroutines.internal.LockFreeLinkedListNode.CondAddOp) r3
        Lc:
            kotlinx.coroutines.internal.LockFreeLinkedListNode r1 = r4.getPrevNode()
            int r2 = r1.tryCondAddNext(r5, r4, r3)
            switch(r2) {
                case 1: goto L1b;
                case 2: goto L19;
                default: goto L18;
            }
        L18:
            goto Lc
        L19:
            r2 = 0
            return r2
        L1b:
            r2 = 1
            return r2
    }

    public final boolean addNext(kotlinx.coroutines.internal.LockFreeLinkedListNode r2, kotlinx.coroutines.internal.LockFreeLinkedListNode r3) {
            r1 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = get_prev$volatile$FU()
            r0.set(r2, r1)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = get_next$volatile$FU()
            r0.set(r2, r3)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = get_next$volatile$FU()
            boolean r0 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r0, r1, r3, r2)
            if (r0 != 0) goto L1a
            r0 = 0
            return r0
        L1a:
            r2.finishAdd(r3)
            r0 = 1
            return r0
    }

    public final boolean addOneIfEmpty(kotlinx.coroutines.internal.LockFreeLinkedListNode r3) {
            r2 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = get_prev$volatile$FU()
            r0.set(r3, r2)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = get_next$volatile$FU()
            r0.set(r3, r2)
        Le:
            java.lang.Object r0 = r2.getNext()
            if (r0 == r2) goto L17
            r1 = 0
            return r1
        L17:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = get_next$volatile$FU()
            boolean r1 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r1, r2, r2, r3)
            if (r1 == 0) goto Le
            r3.finishAdd(r2)
            r1 = 1
            return r1
    }

    public final java.lang.Object getNext() {
            r5 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = get_next$volatile$FU()
            r1 = r5
        L5:
            java.lang.Object r2 = r0.get(r5)
            r3 = 0
            boolean r4 = r2 instanceof kotlinx.coroutines.internal.OpDescriptor
            if (r4 != 0) goto Lf
            return r2
        Lf:
            r4 = r2
            kotlinx.coroutines.internal.OpDescriptor r4 = (kotlinx.coroutines.internal.OpDescriptor) r4
            r4.perform(r5)
            goto L5
    }

    public final kotlinx.coroutines.internal.LockFreeLinkedListNode getNextNode() {
            r3 = this;
            java.lang.Object r0 = r3.getNext()
            r1 = 0
            boolean r2 = r0 instanceof kotlinx.coroutines.internal.Removed
            if (r2 == 0) goto Ld
            r2 = r0
            kotlinx.coroutines.internal.Removed r2 = (kotlinx.coroutines.internal.Removed) r2
            goto Le
        Ld:
            r2 = 0
        Le:
            if (r2 == 0) goto L14
            kotlinx.coroutines.internal.LockFreeLinkedListNode r2 = r2.ref
            if (r2 != 0) goto L1c
        L14:
            java.lang.String r2 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0, r2)
            r2 = r0
            kotlinx.coroutines.internal.LockFreeLinkedListNode r2 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r2
        L1c:
            return r2
    }

    public final kotlinx.coroutines.internal.LockFreeLinkedListNode getPrevNode() {
            r1 = this;
            r0 = 0
            kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = r1.correctPrev(r0)
            if (r0 != 0) goto L15
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = get_prev$volatile$FU()
            java.lang.Object r0 = r0.get(r1)
            kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r0
            kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = r1.findPrevNonRemoved(r0)
        L15:
            return r0
    }

    public boolean isRemoved() {
            r1 = this;
            java.lang.Object r0 = r1.getNext()
            boolean r0 = r0 instanceof kotlinx.coroutines.internal.Removed
            return r0
    }

    public final kotlinx.coroutines.internal.LockFreeLinkedListNode.CondAddOp makeCondAddOp(kotlinx.coroutines.internal.LockFreeLinkedListNode r3, kotlin.jvm.functions.Function0<java.lang.Boolean> r4) {
            r2 = this;
            r0 = 0
            kotlinx.coroutines.internal.LockFreeLinkedListNode$makeCondAddOp$1 r1 = new kotlinx.coroutines.internal.LockFreeLinkedListNode$makeCondAddOp$1
            r1.<init>(r3, r4)
            kotlinx.coroutines.internal.LockFreeLinkedListNode$CondAddOp r1 = (kotlinx.coroutines.internal.LockFreeLinkedListNode.CondAddOp) r1
            return r1
    }

    protected kotlinx.coroutines.internal.LockFreeLinkedListNode nextIfRemoved() {
            r3 = this;
            java.lang.Object r0 = r3.getNext()
            boolean r1 = r0 instanceof kotlinx.coroutines.internal.Removed
            r2 = 0
            if (r1 == 0) goto Lc
            kotlinx.coroutines.internal.Removed r0 = (kotlinx.coroutines.internal.Removed) r0
            goto Ld
        Lc:
            r0 = r2
        Ld:
            if (r0 == 0) goto L11
            kotlinx.coroutines.internal.LockFreeLinkedListNode r2 = r0.ref
        L11:
            return r2
    }

    /* JADX INFO: renamed from: remove */
    public boolean mo1711remove() {
            r1 = this;
            kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = r1.removeOrNext()
            if (r0 != 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    public final kotlinx.coroutines.internal.LockFreeLinkedListNode removeOrNext() {
            r4 = this;
        L1:
            java.lang.Object r0 = r4.getNext()
            boolean r1 = r0 instanceof kotlinx.coroutines.internal.Removed
            if (r1 == 0) goto L10
            r1 = r0
            kotlinx.coroutines.internal.Removed r1 = (kotlinx.coroutines.internal.Removed) r1
            kotlinx.coroutines.internal.LockFreeLinkedListNode r1 = r1.ref
            return r1
        L10:
            if (r0 != r4) goto L16
            r1 = r0
            kotlinx.coroutines.internal.LockFreeLinkedListNode r1 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r1
            return r1
        L16:
            java.lang.String r1 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0, r1)
            r1 = r0
            kotlinx.coroutines.internal.LockFreeLinkedListNode r1 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r1
            kotlinx.coroutines.internal.Removed r1 = r1.removed()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = get_next$volatile$FU()
            boolean r2 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r2, r4, r0, r1)
            if (r2 == 0) goto L1
            r2 = r0
            kotlinx.coroutines.internal.LockFreeLinkedListNode r2 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r2
            r3 = 0
            r2.correctPrev(r3)
            return r3
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            kotlinx.coroutines.internal.LockFreeLinkedListNode$toString$1 r1 = new kotlinx.coroutines.internal.LockFreeLinkedListNode$toString$1
            r1.<init>(r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = 64
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = kotlinx.coroutines.DebugStringsKt.getHexAddress(r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public final int tryCondAddNext(kotlinx.coroutines.internal.LockFreeLinkedListNode r2, kotlinx.coroutines.internal.LockFreeLinkedListNode r3, kotlinx.coroutines.internal.LockFreeLinkedListNode.CondAddOp r4) {
            r1 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = get_prev$volatile$FU()
            r0.set(r2, r1)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = get_next$volatile$FU()
            r0.set(r2, r3)
            r4.oldNext = r3
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = get_next$volatile$FU()
            boolean r0 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r0, r1, r3, r4)
            if (r0 != 0) goto L1c
            r0 = 0
            return r0
        L1c:
            java.lang.Object r0 = r4.perform(r1)
            if (r0 != 0) goto L24
            r0 = 1
            goto L25
        L24:
            r0 = 2
        L25:
            return r0
    }

    public final void validateNode$kotlinx_coroutines_core(kotlinx.coroutines.internal.LockFreeLinkedListNode r5, kotlinx.coroutines.internal.LockFreeLinkedListNode r6) {
            r4 = this;
            boolean r0 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L1f
            r0 = 0
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = get_prev$volatile$FU()
            java.lang.Object r3 = r3.get(r4)
            if (r5 != r3) goto L15
            r0 = r1
            goto L16
        L15:
            r0 = r2
        L16:
            if (r0 == 0) goto L19
            goto L1f
        L19:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L1f:
            boolean r0 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            if (r0 == 0) goto L3b
            r0 = 0
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = get_next$volatile$FU()
            java.lang.Object r3 = r3.get(r4)
            if (r6 != r3) goto L31
            goto L32
        L31:
            r1 = r2
        L32:
            if (r1 == 0) goto L35
            goto L3b
        L35:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L3b:
            return
    }
}
