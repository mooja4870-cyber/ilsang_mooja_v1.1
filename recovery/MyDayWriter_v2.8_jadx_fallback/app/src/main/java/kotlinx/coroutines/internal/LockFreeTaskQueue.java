package kotlinx.coroutines.internal;

/* JADX INFO: compiled from: LockFreeTaskQueue.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0010\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0013\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00028\u0000¢\u0006\u0002\u0010\u0012J\u0006\u0010\u0013\u001a\u00020\u0014J\u0006\u0010\u0015\u001a\u00020\u0004J&\u0010\u0016\u001a\b\u0012\u0004\u0012\u0002H\u00180\u0017\"\u0004\b\u0001\u0010\u00182\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H\u00180\u001aJ\r\u0010\u001b\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010\u001cR\u001f\u0010\u0006\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00028\u00000\bj\b\u0012\u0004\u0012\u00028\u0000`\t0\u0007X\u0082\u0004R\u0011\u0010\n\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001d"}, d2 = {"Lkotlinx/coroutines/internal/LockFreeTaskQueue;", "E", "", "singleConsumer", "", "(Z)V", "_cur", "Lkotlinx/atomicfu/AtomicRef;", "Lkotlinx/coroutines/internal/LockFreeTaskQueueCore;", "Lkotlinx/coroutines/internal/Core;", "isEmpty", "()Z", "size", "", "getSize", "()I", "addLast", "element", "(Ljava/lang/Object;)Z", "close", "", "isClosed", "map", "", "R", "transform", "Lkotlin/Function1;", "removeFirstOrNull", "()Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class LockFreeTaskQueue<E> {
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater _cur$volatile$FU = null;
    private volatile /* synthetic */ java.lang.Object _cur$volatile;

    static {
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.String r1 = "_cur$volatile"
            java.lang.Class<kotlinx.coroutines.internal.LockFreeTaskQueue> r2 = kotlinx.coroutines.internal.LockFreeTaskQueue.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r0, r1)
            kotlinx.coroutines.internal.LockFreeTaskQueue._cur$volatile$FU = r0
            return
    }

    public LockFreeTaskQueue(boolean r3) {
            r2 = this;
            r2.<init>()
            kotlinx.coroutines.internal.LockFreeTaskQueueCore r0 = new kotlinx.coroutines.internal.LockFreeTaskQueueCore
            r1 = 8
            r0.<init>(r1, r3)
            r2._cur$volatile = r0
            return
    }

    private final /* synthetic */ java.lang.Object get_cur$volatile() {
            r1 = this;
            java.lang.Object r0 = r1._cur$volatile
            return r0
    }

    private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater get_cur$volatile$FU() {
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.internal.LockFreeTaskQueue._cur$volatile$FU
            return r0
    }

    private final /* synthetic */ void loop$atomicfu(java.lang.Object r2, java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3, kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit> r4) {
            r1 = this;
        L0:
            java.lang.Object r0 = r3.get(r2)
            r4.invoke(r0)
            goto L0
    }

    private final /* synthetic */ void set_cur$volatile(java.lang.Object r1) {
            r0 = this;
            r0._cur$volatile = r1
            return
    }

    public final boolean addLast(E r7) {
            r6 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = get_cur$volatile$FU()
            r1 = r6
        L5:
            java.lang.Object r2 = r0.get(r6)
            kotlinx.coroutines.internal.LockFreeTaskQueueCore r2 = (kotlinx.coroutines.internal.LockFreeTaskQueueCore) r2
            r3 = 0
            int r4 = r2.addLast(r7)
            switch(r4) {
                case 0: goto L22;
                case 1: goto L16;
                case 2: goto L14;
                default: goto L13;
            }
        L13:
            goto L24
        L14:
            r4 = 0
            return r4
        L16:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = get_cur$volatile$FU()
            kotlinx.coroutines.internal.LockFreeTaskQueueCore r5 = r2.next()
            androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r4, r6, r2, r5)
            goto L24
        L22:
            r4 = 1
            return r4
        L24:
            goto L5
    }

    public final void close() {
            r6 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = get_cur$volatile$FU()
            r1 = r6
        L5:
            java.lang.Object r2 = r0.get(r6)
            kotlinx.coroutines.internal.LockFreeTaskQueueCore r2 = (kotlinx.coroutines.internal.LockFreeTaskQueueCore) r2
            r3 = 0
            boolean r4 = r2.close()
            if (r4 == 0) goto L13
            return
        L13:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = get_cur$volatile$FU()
            kotlinx.coroutines.internal.LockFreeTaskQueueCore r5 = r2.next()
            androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r4, r6, r2, r5)
            goto L5
    }

    public final int getSize() {
            r1 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = get_cur$volatile$FU()
            java.lang.Object r0 = r0.get(r1)
            kotlinx.coroutines.internal.LockFreeTaskQueueCore r0 = (kotlinx.coroutines.internal.LockFreeTaskQueueCore) r0
            int r0 = r0.getSize()
            return r0
    }

    public final boolean isClosed() {
            r1 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = get_cur$volatile$FU()
            java.lang.Object r0 = r0.get(r1)
            kotlinx.coroutines.internal.LockFreeTaskQueueCore r0 = (kotlinx.coroutines.internal.LockFreeTaskQueueCore) r0
            boolean r0 = r0.isClosed()
            return r0
    }

    public final boolean isEmpty() {
            r1 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = get_cur$volatile$FU()
            java.lang.Object r0 = r0.get(r1)
            kotlinx.coroutines.internal.LockFreeTaskQueueCore r0 = (kotlinx.coroutines.internal.LockFreeTaskQueueCore) r0
            boolean r0 = r0.isEmpty()
            return r0
    }

    public final <R> java.util.List<R> map(kotlin.jvm.functions.Function1<? super E, ? extends R> r2) {
            r1 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = get_cur$volatile$FU()
            java.lang.Object r0 = r0.get(r1)
            kotlinx.coroutines.internal.LockFreeTaskQueueCore r0 = (kotlinx.coroutines.internal.LockFreeTaskQueueCore) r0
            java.util.List r0 = r0.map(r2)
            return r0
    }

    public final E removeFirstOrNull() {
            r7 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = get_cur$volatile$FU()
            r1 = r7
        L5:
            java.lang.Object r2 = r0.get(r7)
            kotlinx.coroutines.internal.LockFreeTaskQueueCore r2 = (kotlinx.coroutines.internal.LockFreeTaskQueueCore) r2
            r3 = 0
            java.lang.Object r4 = r2.removeFirstOrNull()
            kotlinx.coroutines.internal.Symbol r5 = kotlinx.coroutines.internal.LockFreeTaskQueueCore.REMOVE_FROZEN
            if (r4 == r5) goto L15
            return r4
        L15:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = get_cur$volatile$FU()
            kotlinx.coroutines.internal.LockFreeTaskQueueCore r6 = r2.next()
            androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r5, r7, r2, r6)
            goto L5
    }
}
