package kotlinx.coroutines.internal;

import kotlinx.coroutines.internal.Segment;

/* JADX INFO: compiled from: ConcurrentLinkedList.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00002\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00020\u0003B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00018\u0000\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\r\u0010\u0012\u001a\u00020\rH\u0000¢\u0006\u0002\b\u0013J\"\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0019\u001a\u00020\u001aH&J\u0006\u0010\u001b\u001a\u00020\u0015J\r\u0010\u001c\u001a\u00020\rH\u0000¢\u0006\u0002\b\u001dR\t\u0010\n\u001a\u00020\u000bX\u0082\u0004R\u0010\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u000eR\u0012\u0010\u000f\u001a\u00020\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, d2 = {"Lkotlinx/coroutines/internal/Segment;", "S", "Lkotlinx/coroutines/internal/ConcurrentLinkedListNode;", "Lkotlinx/coroutines/NotCompleted;", "id", "", "prev", "pointers", "", "(JLkotlinx/coroutines/internal/Segment;I)V", "cleanedAndPointers", "Lkotlinx/atomicfu/AtomicInt;", "isRemoved", "", "()Z", "numberOfSlots", "getNumberOfSlots", "()I", "decPointers", "decPointers$kotlinx_coroutines_core", "onCancellation", "", "index", "cause", "", "context", "Lkotlin/coroutines/CoroutineContext;", "onSlotCleaned", "tryIncPointers", "tryIncPointers$kotlinx_coroutines_core", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class Segment<S extends kotlinx.coroutines.internal.Segment<S>> extends kotlinx.coroutines.internal.ConcurrentLinkedListNode<S> implements kotlinx.coroutines.NotCompleted {
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater cleanedAndPointers$volatile$FU = null;
    private volatile /* synthetic */ int cleanedAndPointers$volatile;
    public final long id;

    static {
            java.lang.Class<kotlinx.coroutines.internal.Segment> r0 = kotlinx.coroutines.internal.Segment.class
            java.lang.String r1 = "cleanedAndPointers$volatile"
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r0, r1)
            kotlinx.coroutines.internal.Segment.cleanedAndPointers$volatile$FU = r0
            return
    }

    public Segment(long r2, S r4, int r5) {
            r1 = this;
            r0 = r4
            kotlinx.coroutines.internal.ConcurrentLinkedListNode r0 = (kotlinx.coroutines.internal.ConcurrentLinkedListNode) r0
            r1.<init>(r0)
            r1.id = r2
            int r0 = r5 << 16
            r1.cleanedAndPointers$volatile = r0
            return
    }

    private final /* synthetic */ int getCleanedAndPointers$volatile() {
            r1 = this;
            int r0 = r1.cleanedAndPointers$volatile
            return r0
    }

    private static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater getCleanedAndPointers$volatile$FU() {
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = kotlinx.coroutines.internal.Segment.cleanedAndPointers$volatile$FU
            return r0
    }

    private final /* synthetic */ void setCleanedAndPointers$volatile(int r1) {
            r0 = this;
            r0.cleanedAndPointers$volatile = r1
            return
    }

    public final boolean decPointers$kotlinx_coroutines_core() {
            r2 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = getCleanedAndPointers$volatile$FU()
            r1 = -65536(0xffffffffffff0000, float:NaN)
            int r0 = r0.addAndGet(r2, r1)
            int r1 = r2.getNumberOfSlots()
            if (r0 != r1) goto L18
            boolean r0 = r2.isTail()
            if (r0 != 0) goto L18
            r0 = 1
            goto L19
        L18:
            r0 = 0
        L19:
            return r0
    }

    public abstract int getNumberOfSlots();

    @Override // kotlinx.coroutines.internal.ConcurrentLinkedListNode
    public boolean isRemoved() {
            r2 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = getCleanedAndPointers$volatile$FU()
            int r0 = r0.get(r2)
            int r1 = r2.getNumberOfSlots()
            if (r0 != r1) goto L16
            boolean r0 = r2.isTail()
            if (r0 != 0) goto L16
            r0 = 1
            goto L17
        L16:
            r0 = 0
        L17:
            return r0
    }

    public abstract void onCancellation(int r1, java.lang.Throwable r2, kotlin.coroutines.CoroutineContext r3);

    public final void onSlotCleaned() {
            r2 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = getCleanedAndPointers$volatile$FU()
            int r0 = r0.incrementAndGet(r2)
            int r1 = r2.getNumberOfSlots()
            if (r0 != r1) goto L11
            r2.remove()
        L11:
            return
    }

    public final boolean tryIncPointers$kotlinx_coroutines_core() {
            r8 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = getCleanedAndPointers$volatile$FU()
            r1 = 65536(0x10000, float:9.1835E-41)
        L6:
            int r2 = r0.get(r8)
            r3 = r2
            r4 = 0
            int r5 = r8.getNumberOfSlots()
            r6 = 0
            r7 = 1
            if (r3 != r5) goto L1e
            boolean r5 = r8.isTail()
            if (r5 == 0) goto L1c
            goto L1e
        L1c:
            r3 = r6
            goto L1f
        L1e:
            r3 = r7
        L1f:
            if (r3 != 0) goto L22
            goto L2b
        L22:
            int r3 = r2 + r1
            boolean r3 = r0.compareAndSet(r8, r2, r3)
            if (r3 == 0) goto L6
            r6 = r7
        L2b:
            return r6
    }
}
