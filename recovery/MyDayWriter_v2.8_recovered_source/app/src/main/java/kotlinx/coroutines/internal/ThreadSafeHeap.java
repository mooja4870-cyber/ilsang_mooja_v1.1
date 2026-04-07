package kotlinx.coroutines.internal;

import java.lang.Comparable;
import kotlinx.coroutines.internal.ThreadSafeHeapNode;

/* JADX INFO: compiled from: ThreadSafeHeap.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0017\u0018\u0000*\u0012\b\u0000\u0010\u0001*\u00020\u0002*\b\u0012\u0004\u0012\u0002H\u00010\u00032\u00060\u0004j\u0002`\u0005B\u0005¢\u0006\u0002\u0010\u0006J\u0015\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00028\u0000H\u0001¢\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00028\u0000¢\u0006\u0002\u0010\u0019J,\u0010\u001b\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00028\u00002\u0014\u0010\u001c\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00020\r0\u001dH\u0086\b¢\u0006\u0002\u0010\u001eJ0\u0010\u001f\u001a\u0004\u0018\u00018\u00002!\u0010 \u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\r0\u001d¢\u0006\u0002\u0010#J\u000f\u0010$\u001a\u0004\u0018\u00018\u0000H\u0001¢\u0006\u0002\u0010%J\r\u0010&\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010%J\u0015\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\nH\u0002¢\u0006\u0002\u0010(J\u0013\u0010)\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00028\u0000¢\u0006\u0002\u0010*J\u0015\u0010+\u001a\u00028\u00002\u0006\u0010,\u001a\u00020\u0010H\u0001¢\u0006\u0002\u0010-J$\u0010.\u001a\u0004\u0018\u00018\u00002\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\r0\u001dH\u0086\b¢\u0006\u0002\u0010#J\r\u0010/\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010%J\u0011\u00100\u001a\u00020\u00172\u0006\u00101\u001a\u00020\u0010H\u0082\u0010J\u0011\u00102\u001a\u00020\u00172\u0006\u00101\u001a\u00020\u0010H\u0082\u0010J\u0018\u00103\u001a\u00020\u00172\u0006\u00101\u001a\u00020\u00102\u0006\u00104\u001a\u00020\u0010H\u0002R\t\u0010\u0007\u001a\u00020\bX\u0082\u0004R\u001a\u0010\t\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\f\u0010\u000eR$\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00108F@BX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u00065"}, d2 = {"Lkotlinx/coroutines/internal/ThreadSafeHeap;", "T", "Lkotlinx/coroutines/internal/ThreadSafeHeapNode;", "", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "()V", "_size", "Lkotlinx/atomicfu/AtomicInt;", "a", "", "[Lkotlinx/coroutines/internal/ThreadSafeHeapNode;", "isEmpty", "", "()Z", "value", "", "size", "getSize", "()I", "setSize", "(I)V", "addImpl", "", "node", "(Lkotlinx/coroutines/internal/ThreadSafeHeapNode;)V", "addLast", "addLastIf", "cond", "Lkotlin/Function1;", "(Lkotlinx/coroutines/internal/ThreadSafeHeapNode;Lkotlin/jvm/functions/Function1;)Z", "find", "predicate", "Lkotlin/ParameterName;", "name", "(Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/internal/ThreadSafeHeapNode;", "firstImpl", "()Lkotlinx/coroutines/internal/ThreadSafeHeapNode;", "peek", "realloc", "()[Lkotlinx/coroutines/internal/ThreadSafeHeapNode;", "remove", "(Lkotlinx/coroutines/internal/ThreadSafeHeapNode;)Z", "removeAtImpl", "index", "(I)Lkotlinx/coroutines/internal/ThreadSafeHeapNode;", "removeFirstIf", "removeFirstOrNull", "siftDownFrom", "i", "siftUpFrom", "swap", "j", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class ThreadSafeHeap<T extends kotlinx.coroutines.internal.ThreadSafeHeapNode & java.lang.Comparable<? super T>> {
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater _size$volatile$FU = null;
    private volatile /* synthetic */ int _size$volatile;
    private T[] a;

    static {
            java.lang.Class<kotlinx.coroutines.internal.ThreadSafeHeap> r0 = kotlinx.coroutines.internal.ThreadSafeHeap.class
            java.lang.String r1 = "_size$volatile"
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r0, r1)
            kotlinx.coroutines.internal.ThreadSafeHeap._size$volatile$FU = r0
            return
    }

    public ThreadSafeHeap() {
            r0 = this;
            r0.<init>()
            return
    }

    private final /* synthetic */ int get_size$volatile() {
            r1 = this;
            int r0 = r1._size$volatile
            return r0
    }

    private static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater get_size$volatile$FU() {
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = kotlinx.coroutines.internal.ThreadSafeHeap._size$volatile$FU
            return r0
    }

    private final T[] realloc() {
            r4 = this;
            T extends kotlinx.coroutines.internal.ThreadSafeHeapNode & java.lang.Comparable<? super T>[] r0 = r4.a
            if (r0 != 0) goto Ld
            r1 = 4
            kotlinx.coroutines.internal.ThreadSafeHeapNode[] r1 = new kotlinx.coroutines.internal.ThreadSafeHeapNode[r1]
            r2 = r1
            r3 = 0
            r4.a = r2
            goto L2d
        Ld:
            int r1 = r4.getSize()
            int r2 = r0.length
            if (r1 < r2) goto L2c
            int r1 = r4.getSize()
            int r1 = r1 * 2
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r0, r1)
            java.lang.String r2 = "copyOf(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            r2 = r1
            kotlinx.coroutines.internal.ThreadSafeHeapNode[] r2 = (kotlinx.coroutines.internal.ThreadSafeHeapNode[]) r2
            r3 = 0
            r4.a = r2
            kotlinx.coroutines.internal.ThreadSafeHeapNode[] r1 = (kotlinx.coroutines.internal.ThreadSafeHeapNode[]) r1
            goto L2d
        L2c:
            r1 = r0
        L2d:
            return r1
    }

    private final void setSize(int r2) {
            r1 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = get_size$volatile$FU()
            r0.set(r1, r2)
            return
    }

    private final /* synthetic */ void set_size$volatile(int r1) {
            r0 = this;
            r0._size$volatile = r1
            return
    }

    private final void siftDownFrom(int r5) {
            r4 = this;
        L1:
            int r0 = r5 * 2
            int r0 = r0 + 1
            int r1 = r4.getSize()
            if (r0 < r1) goto Lc
            return
        Lc:
            T extends kotlinx.coroutines.internal.ThreadSafeHeapNode & java.lang.Comparable<? super T>[] r1 = r4.a
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            int r2 = r0 + 1
            int r3 = r4.getSize()
            if (r2 >= r3) goto L2f
            int r2 = r0 + 1
            r2 = r1[r2]
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            java.lang.Comparable r2 = (java.lang.Comparable) r2
            r3 = r1[r0]
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3)
            int r2 = r2.compareTo(r3)
            if (r2 >= 0) goto L2f
            int r0 = r0 + 1
        L2f:
            r2 = r1[r5]
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            java.lang.Comparable r2 = (java.lang.Comparable) r2
            r3 = r1[r0]
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3)
            int r2 = r2.compareTo(r3)
            if (r2 > 0) goto L42
            return
        L42:
            r4.swap(r5, r0)
            r5 = r0
            goto L1
    }

    private final void siftUpFrom(int r5) {
            r4 = this;
        L1:
            if (r5 > 0) goto L4
            return
        L4:
            T extends kotlinx.coroutines.internal.ThreadSafeHeapNode & java.lang.Comparable<? super T>[] r0 = r4.a
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            int r1 = r5 + (-1)
            int r1 = r1 / 2
            r2 = r0[r1]
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            java.lang.Comparable r2 = (java.lang.Comparable) r2
            r3 = r0[r5]
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3)
            int r2 = r2.compareTo(r3)
            if (r2 > 0) goto L20
            return
        L20:
            r4.swap(r5, r1)
            r5 = r1
            goto L1
    }

    private final void swap(int r4, int r5) {
            r3 = this;
            T extends kotlinx.coroutines.internal.ThreadSafeHeapNode & java.lang.Comparable<? super T>[] r0 = r3.a
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            r1 = r0[r5]
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            r2 = r0[r4]
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            r0[r4] = r1
            r0[r5] = r2
            r1.setIndex(r4)
            r2.setIndex(r5)
            return
    }

    public final void addImpl(T r4) {
            r3 = this;
            boolean r0 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            if (r0 == 0) goto L19
            r0 = 0
            kotlinx.coroutines.internal.ThreadSafeHeap r1 = r4.getHeap()
            if (r1 != 0) goto Lf
            r1 = 1
            goto L10
        Lf:
            r1 = 0
        L10:
            if (r1 == 0) goto L13
            goto L19
        L13:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L19:
            r4.setHeap(r3)
            kotlinx.coroutines.internal.ThreadSafeHeapNode[] r0 = r3.realloc()
            int r1 = r3.getSize()
            int r2 = r1 + 1
            r3.setSize(r2)
            r0[r1] = r4
            r4.setIndex(r1)
            r3.siftUpFrom(r1)
            return
    }

    public final void addLast(T r4) {
            r3 = this;
            r0 = 0
            r1 = 0
            monitor-enter(r3)
            r2 = 0
            r3.addImpl(r4)     // Catch: java.lang.Throwable -> Ld
            kotlin.Unit r2 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r3)
            return
        Ld:
            r2 = move-exception
            monitor-exit(r3)
            throw r2
    }

    public final boolean addLastIf(T r6, kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> r7) {
            r5 = this;
            r0 = 0
            r1 = 0
            r2 = 0
            monitor-enter(r5)
            r3 = 0
            kotlinx.coroutines.internal.ThreadSafeHeapNode r4 = r5.firstImpl()     // Catch: java.lang.Throwable -> L20
            java.lang.Object r4 = r7.invoke(r4)     // Catch: java.lang.Throwable -> L20
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch: java.lang.Throwable -> L20
            boolean r4 = r4.booleanValue()     // Catch: java.lang.Throwable -> L20
            if (r4 == 0) goto L1b
            r5.addImpl(r6)     // Catch: java.lang.Throwable -> L20
            r4 = 1
            goto L1c
        L1b:
            r4 = 0
        L1c:
            monitor-exit(r5)
            return r4
        L20:
            r3 = move-exception
            monitor-exit(r5)
            throw r3
    }

    public final T find(kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> r8) {
            r7 = this;
            r0 = 0
            r1 = 0
            monitor-enter(r7)
            r2 = 0
            r3 = 0
            int r4 = r7.getSize()     // Catch: java.lang.Throwable -> L2a
        La:
            r5 = 0
            if (r3 >= r4) goto L26
            T extends kotlinx.coroutines.internal.ThreadSafeHeapNode & java.lang.Comparable<? super T>[] r6 = r7.a     // Catch: java.lang.Throwable -> L2a
            if (r6 == 0) goto L13
            r5 = r6[r3]     // Catch: java.lang.Throwable -> L2a
        L13:
            kotlin.jvm.internal.Intrinsics.checkNotNull(r5)     // Catch: java.lang.Throwable -> L2a
            java.lang.Object r6 = r8.invoke(r5)     // Catch: java.lang.Throwable -> L2a
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch: java.lang.Throwable -> L2a
            boolean r6 = r6.booleanValue()     // Catch: java.lang.Throwable -> L2a
            if (r6 == 0) goto L23
            goto L27
        L23:
            int r3 = r3 + 1
            goto La
        L26:
        L27:
            monitor-exit(r7)
            return r5
        L2a:
            r2 = move-exception
            monitor-exit(r7)
            throw r2
    }

    public final T firstImpl() {
            r2 = this;
            T extends kotlinx.coroutines.internal.ThreadSafeHeapNode & java.lang.Comparable<? super T>[] r0 = r2.a
            if (r0 == 0) goto L8
            r1 = 0
            r0 = r0[r1]
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    public final int getSize() {
            r1 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = get_size$volatile$FU()
            int r0 = r0.get(r1)
            return r0
    }

    public final boolean isEmpty() {
            r1 = this;
            int r0 = r1.getSize()
            if (r0 != 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    public final T peek() {
            r4 = this;
            r0 = 0
            r1 = 0
            monitor-enter(r4)
            r2 = 0
            kotlinx.coroutines.internal.ThreadSafeHeapNode r3 = r4.firstImpl()     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r4)
            return r3
        Lc:
            r2 = move-exception
            monitor-exit(r4)
            throw r2
    }

    public final boolean remove(T r8) {
            r7 = this;
            r0 = 0
            r1 = 0
            monitor-enter(r7)
            r2 = 0
            kotlinx.coroutines.internal.ThreadSafeHeap r3 = r8.getHeap()     // Catch: java.lang.Throwable -> L2b
            r4 = 0
            if (r3 != 0) goto Ld
            goto L29
        Ld:
            int r3 = r8.getIndex()     // Catch: java.lang.Throwable -> L2b
            boolean r5 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()     // Catch: java.lang.Throwable -> L2b
            r6 = 1
            if (r5 == 0) goto L25
            r5 = 0
            if (r3 < 0) goto L1c
            r4 = r6
        L1c:
            if (r4 == 0) goto L1f
            goto L25
        L1f:
            java.lang.AssertionError r4 = new java.lang.AssertionError     // Catch: java.lang.Throwable -> L2b
            r4.<init>()     // Catch: java.lang.Throwable -> L2b
            throw r4     // Catch: java.lang.Throwable -> L2b
        L25:
            r7.removeAtImpl(r3)     // Catch: java.lang.Throwable -> L2b
            r4 = r6
        L29:
            monitor-exit(r7)
            return r4
        L2b:
            r2 = move-exception
            monitor-exit(r7)
            throw r2
    }

    public final T removeAtImpl(int r8) {
            r7 = this;
            boolean r0 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L1b
            r0 = 0
            int r3 = r7.getSize()
            if (r3 <= 0) goto L11
            r0 = r2
            goto L12
        L11:
            r0 = r1
        L12:
            if (r0 == 0) goto L15
            goto L1b
        L15:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L1b:
            T extends kotlinx.coroutines.internal.ThreadSafeHeapNode & java.lang.Comparable<? super T>[] r0 = r7.a
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            int r3 = r7.getSize()
            r4 = -1
            int r3 = r3 + r4
            r7.setSize(r3)
            int r3 = r7.getSize()
            if (r8 >= r3) goto L58
            int r3 = r7.getSize()
            r7.swap(r8, r3)
            int r3 = r8 + (-1)
            int r3 = r3 / 2
            if (r8 <= 0) goto L55
            r5 = r0[r8]
            kotlin.jvm.internal.Intrinsics.checkNotNull(r5)
            java.lang.Comparable r5 = (java.lang.Comparable) r5
            r6 = r0[r3]
            kotlin.jvm.internal.Intrinsics.checkNotNull(r6)
            int r5 = r5.compareTo(r6)
            if (r5 >= 0) goto L55
            r7.swap(r8, r3)
            r7.siftUpFrom(r3)
            goto L58
        L55:
            r7.siftDownFrom(r8)
        L58:
            int r3 = r7.getSize()
            r3 = r0[r3]
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3)
            boolean r5 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            if (r5 == 0) goto L78
            r5 = 0
            kotlinx.coroutines.internal.ThreadSafeHeap r6 = r3.getHeap()
            if (r6 != r7) goto L6f
            r1 = r2
        L6f:
            if (r1 == 0) goto L72
            goto L78
        L72:
            java.lang.AssertionError r1 = new java.lang.AssertionError
            r1.<init>()
            throw r1
        L78:
            r1 = 0
            r3.setHeap(r1)
            r3.setIndex(r4)
            int r2 = r7.getSize()
            r0[r2] = r1
            return r3
    }

    public final T removeFirstIf(kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> r8) {
            r7 = this;
            r0 = 0
            r1 = 0
            r2 = 0
            monitor-enter(r7)
            r3 = 0
            kotlinx.coroutines.internal.ThreadSafeHeapNode r4 = r7.firstImpl()     // Catch: java.lang.Throwable -> L26
            r5 = 0
            if (r4 != 0) goto Lf
            monitor-exit(r7)
            return r5
        Lf:
            java.lang.Object r6 = r8.invoke(r4)     // Catch: java.lang.Throwable -> L26
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch: java.lang.Throwable -> L26
            boolean r6 = r6.booleanValue()     // Catch: java.lang.Throwable -> L26
            if (r6 == 0) goto L21
            r5 = 0
            kotlinx.coroutines.internal.ThreadSafeHeapNode r5 = r7.removeAtImpl(r5)     // Catch: java.lang.Throwable -> L26
            goto L22
        L21:
        L22:
            monitor-exit(r7)
            return r5
        L26:
            r3 = move-exception
            monitor-exit(r7)
            throw r3
    }

    public final T removeFirstOrNull() {
            r4 = this;
            r0 = 0
            r1 = 0
            monitor-enter(r4)
            r2 = 0
            int r3 = r4.getSize()     // Catch: java.lang.Throwable -> L16
            if (r3 <= 0) goto L11
            r3 = 0
            kotlinx.coroutines.internal.ThreadSafeHeapNode r3 = r4.removeAtImpl(r3)     // Catch: java.lang.Throwable -> L16
            goto L12
        L11:
            r3 = 0
        L12:
            monitor-exit(r4)
            return r3
        L16:
            r2 = move-exception
            monitor-exit(r4)
            throw r2
    }
}
