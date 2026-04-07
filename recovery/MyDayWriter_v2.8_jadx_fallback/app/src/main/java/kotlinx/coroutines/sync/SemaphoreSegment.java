package kotlinx.coroutines.sync;

/* JADX INFO: compiled from: Semaphore.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J%\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\nH\u0086\bJ\u0013\u0010\u0013\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0010\u001a\u00020\u0006H\u0086\bJ\u001d\u0010\u0014\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0010\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\nH\u0086\bJ\"\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u001b\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\nH\u0086\bJ\b\u0010\u001c\u001a\u00020\u001dH\u0016R\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\tR\u0014\u0010\u000b\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u001e"}, d2 = {"Lkotlinx/coroutines/sync/SemaphoreSegment;", "Lkotlinx/coroutines/internal/Segment;", "id", "", "prev", "pointers", "", "(JLkotlinx/coroutines/sync/SemaphoreSegment;I)V", "acquirers", "Lkotlinx/atomicfu/AtomicArray;", "", "numberOfSlots", "getNumberOfSlots", "()I", "cas", "", "index", "expected", "value", "get", "getAndSet", "onCancellation", "", "cause", "", "context", "Lkotlin/coroutines/CoroutineContext;", "set", "toString", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class SemaphoreSegment extends kotlinx.coroutines.internal.Segment<kotlinx.coroutines.sync.SemaphoreSegment> {
    private final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceArray acquirers;

    public SemaphoreSegment(long r3, kotlinx.coroutines.sync.SemaphoreSegment r5, int r6) {
            r2 = this;
            r0 = r5
            kotlinx.coroutines.internal.Segment r0 = (kotlinx.coroutines.internal.Segment) r0
            r2.<init>(r3, r0, r6)
            java.util.concurrent.atomic.AtomicReferenceArray r0 = new java.util.concurrent.atomic.AtomicReferenceArray
            int r1 = kotlinx.coroutines.sync.SemaphoreKt.access$getSEGMENT_SIZE$p()
            r0.<init>(r1)
            r2.acquirers = r0
            return
    }

    public final boolean cas(int r3, java.lang.Object r4, java.lang.Object r5) {
            r2 = this;
            r0 = 0
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r2.getAcquirers()
            boolean r1 = kotlinx.coroutines.channels.ChannelSegment$$ExternalSyntheticBackportWithForwarding0.m(r1, r3, r4, r5)
            return r1
    }

    public final java.lang.Object get(int r3) {
            r2 = this;
            r0 = 0
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r2.getAcquirers()
            java.lang.Object r1 = r1.get(r3)
            return r1
    }

    public final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceArray getAcquirers() {
            r1 = this;
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r1.acquirers
            return r0
    }

    public final java.lang.Object getAndSet(int r3, java.lang.Object r4) {
            r2 = this;
            r0 = 0
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r2.getAcquirers()
            java.lang.Object r1 = r1.getAndSet(r3, r4)
            return r1
    }

    @Override // kotlinx.coroutines.internal.Segment
    public int getNumberOfSlots() {
            r1 = this;
            int r0 = kotlinx.coroutines.sync.SemaphoreKt.access$getSEGMENT_SIZE$p()
            return r0
    }

    @Override // kotlinx.coroutines.internal.Segment
    public void onCancellation(int r5, java.lang.Throwable r6, kotlin.coroutines.CoroutineContext r7) {
            r4 = this;
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.sync.SemaphoreKt.access$getCANCELLED$p()
            r1 = r4
            r2 = 0
            java.util.concurrent.atomic.AtomicReferenceArray r3 = r1.getAcquirers()
            r3.set(r5, r0)
            r4.onSlotCleaned()
            return
    }

    public final void set(int r3, java.lang.Object r4) {
            r2 = this;
            r0 = 0
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r2.getAcquirers()
            r1.set(r3, r4)
            return
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "SemaphoreSegment[id="
            java.lang.StringBuilder r0 = r0.append(r1)
            long r1 = r3.id
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", hashCode="
            java.lang.StringBuilder r0 = r0.append(r1)
            int r1 = r3.hashCode()
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = 93
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
