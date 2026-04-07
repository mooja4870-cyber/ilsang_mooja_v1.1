package kotlinx.coroutines.internal;

/* JADX INFO: compiled from: OnDemandAllocatingPool.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B!\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0002\u0010\u0007J\u0006\u0010\f\u001a\u00020\rJ\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fJ\r\u0010\u0010\u001a\u00020\u0011H\u0000¢\u0006\u0002\b\u0012J\b\u0010\u0013\u001a\u00020\u0011H\u0016J\t\u0010\u0014\u001a\u00020\u0004H\u0082\bJ\r\u0010\u0015\u001a\u00020\r*\u00020\u0004H\u0082\bR\t\u0010\b\u001a\u00020\tX\u0082\u0004R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u000bX\u0082\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lkotlinx/coroutines/internal/OnDemandAllocatingPool;", "T", "", "maxCapacity", "", "create", "Lkotlin/Function1;", "(ILkotlin/jvm/functions/Function1;)V", "controlState", "Lkotlinx/atomicfu/AtomicInt;", "elements", "Lkotlinx/atomicfu/AtomicArray;", "allocate", "", "close", "", "stateRepresentation", "", "stateRepresentation$kotlinx_coroutines_core", "toString", "tryForbidNewElements", "isClosed", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class OnDemandAllocatingPool<T> {
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater controlState$volatile$FU = null;
    private volatile /* synthetic */ int controlState$volatile;
    private final kotlin.jvm.functions.Function1<java.lang.Integer, T> create;
    private final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceArray elements;
    private final int maxCapacity;

    static {
            java.lang.Class<kotlinx.coroutines.internal.OnDemandAllocatingPool> r0 = kotlinx.coroutines.internal.OnDemandAllocatingPool.class
            java.lang.String r1 = "controlState$volatile"
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r0, r1)
            kotlinx.coroutines.internal.OnDemandAllocatingPool.controlState$volatile$FU = r0
            return
    }

    public OnDemandAllocatingPool(int r3, kotlin.jvm.functions.Function1<? super java.lang.Integer, ? extends T> r4) {
            r2 = this;
            r2.<init>()
            r2.maxCapacity = r3
            r2.create = r4
            java.util.concurrent.atomic.AtomicReferenceArray r0 = new java.util.concurrent.atomic.AtomicReferenceArray
            int r1 = r2.maxCapacity
            r0.<init>(r1)
            r2.elements = r0
            return
    }

    private final /* synthetic */ int getControlState$volatile() {
            r1 = this;
            int r0 = r1.controlState$volatile
            return r0
    }

    private static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater getControlState$volatile$FU() {
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = kotlinx.coroutines.internal.OnDemandAllocatingPool.controlState$volatile$FU
            return r0
    }

    private final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceArray getElements() {
            r1 = this;
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r1.elements
            return r0
    }

    private final boolean isClosed(int r3) {
            r2 = this;
            r0 = 0
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r3
            if (r1 == 0) goto L8
            r1 = 1
            goto L9
        L8:
            r1 = 0
        L9:
            return r1
    }

    private final /* synthetic */ void loop$atomicfu(java.lang.Object r2, java.util.concurrent.atomic.AtomicIntegerFieldUpdater r3, kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> r4) {
            r1 = this;
        L0:
            int r0 = r3.get(r2)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4.invoke(r0)
            goto L0
    }

    private final /* synthetic */ void setControlState$volatile(int r1) {
            r0 = this;
            r0.controlState$volatile = r1
            return
    }

    private final int tryForbidNewElements() {
            r11 = this;
            r0 = 0
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = getControlState$volatile$FU()
            r2 = r11
        L6:
            int r3 = r1.get(r11)
            r4 = 0
            r5 = r3
            r6 = r11
            r7 = 0
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            r9 = r5 & r8
            r10 = 0
            if (r9 == 0) goto L17
            r9 = 1
            goto L18
        L17:
            r9 = r10
        L18:
            if (r9 == 0) goto L1b
            return r10
        L1b:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r5 = getControlState$volatile$FU()
            r6 = r3 | r8
            boolean r5 = r5.compareAndSet(r11, r3, r6)
            if (r5 == 0) goto L28
            return r3
        L28:
            goto L6
    }

    public final boolean allocate() {
            r10 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = getControlState$volatile$FU()
            r1 = r10
        L5:
            int r2 = r0.get(r10)
            r3 = 0
            r4 = r2
            r5 = r10
            r6 = 0
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r7 & r4
            r8 = 0
            r9 = 1
            if (r7 == 0) goto L16
            r4 = r9
            goto L17
        L16:
            r4 = r8
        L17:
            if (r4 == 0) goto L1a
            return r8
        L1a:
            int r4 = r10.maxCapacity
            if (r2 < r4) goto L1f
            return r9
        L1f:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r4 = getControlState$volatile$FU()
            int r5 = r2 + 1
            boolean r4 = r4.compareAndSet(r10, r2, r5)
            if (r4 == 0) goto L3d
            java.util.concurrent.atomic.AtomicReferenceArray r4 = r10.getElements()
            kotlin.jvm.functions.Function1<java.lang.Integer, T> r5 = r10.create
            java.lang.Integer r6 = java.lang.Integer.valueOf(r2)
            java.lang.Object r5 = r5.invoke(r6)
            r4.set(r2, r5)
            return r9
        L3d:
            goto L5
    }

    public final java.util.List<T> close() {
            r14 = this;
            r0 = r14
            r1 = 0
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = getControlState$volatile$FU()
            r3 = r0
        L7:
            int r4 = r2.get(r0)
            r5 = 0
            r6 = r4
            r7 = r0
            r8 = 0
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
            r10 = r6 & r9
            r11 = 0
            if (r10 == 0) goto L18
            r10 = 1
            goto L19
        L18:
            r10 = r11
        L19:
            if (r10 == 0) goto L1d
            r4 = r11
            goto L29
        L1d:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r6 = getControlState$volatile$FU()
            r7 = r4 | r9
            boolean r6 = r6.compareAndSet(r0, r4, r7)
            if (r6 == 0) goto L6d
        L29:
        L2a:
            kotlin.ranges.IntRange r0 = kotlin.ranges.RangesKt.until(r11, r4)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            r1 = 0
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 10
            int r3 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r0, r3)
            r2.<init>(r3)
            java.util.Collection r2 = (java.util.Collection) r2
            r3 = r0
            r5 = 0
            java.util.Iterator r6 = r3.iterator()
        L44:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L68
            r7 = r6
            kotlin.collections.IntIterator r7 = (kotlin.collections.IntIterator) r7
            int r7 = r7.nextInt()
            r8 = r7
            r9 = 0
            r10 = 0
        L54:
            r11 = 0
            java.util.concurrent.atomic.AtomicReferenceArray r12 = r14.getElements()
            r13 = 0
            java.lang.Object r12 = r12.getAndSet(r8, r13)
            if (r12 == 0) goto L66
        L62:
            r2.add(r12)
            goto L44
        L66:
            goto L54
        L68:
            java.util.List r2 = (java.util.List) r2
            return r2
        L6d:
            goto L7
    }

    public final java.lang.String stateRepresentation$kotlinx_coroutines_core() {
            r12 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = getControlState$volatile$FU()
            int r0 = r0.get(r12)
            r1 = 2147483647(0x7fffffff, float:NaN)
            r1 = r1 & r0
            r2 = 0
            kotlin.ranges.IntRange r1 = kotlin.ranges.RangesKt.until(r2, r1)
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            r3 = 0
            java.util.ArrayList r4 = new java.util.ArrayList
            r5 = 10
            int r5 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r1, r5)
            r4.<init>(r5)
            java.util.Collection r4 = (java.util.Collection) r4
            r5 = r1
            r6 = 0
            java.util.Iterator r7 = r5.iterator()
        L27:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L42
            r8 = r7
            kotlin.collections.IntIterator r8 = (kotlin.collections.IntIterator) r8
            int r8 = r8.nextInt()
            r9 = r8
            r10 = 0
            java.util.concurrent.atomic.AtomicReferenceArray r11 = r12.getElements()
            java.lang.Object r9 = r11.get(r9)
            r4.add(r9)
            goto L27
        L42:
            java.util.List r4 = (java.util.List) r4
            java.lang.String r1 = r4.toString()
            r3 = r0
            r4 = r12
            r5 = 0
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r6 & r3
            if (r6 == 0) goto L53
            r2 = 1
        L53:
            if (r2 == 0) goto L58
            java.lang.String r2 = "[closed]"
            goto L5a
        L58:
            java.lang.String r2 = ""
        L5a:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.StringBuilder r3 = r3.append(r1)
            java.lang.StringBuilder r3 = r3.append(r2)
            java.lang.String r3 = r3.toString()
            return r3
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "OnDemandAllocatingPool("
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = r2.stateRepresentation$kotlinx_coroutines_core()
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = 41
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
