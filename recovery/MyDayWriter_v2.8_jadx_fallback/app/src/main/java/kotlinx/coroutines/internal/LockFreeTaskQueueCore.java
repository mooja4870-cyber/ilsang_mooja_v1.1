package kotlinx.coroutines.internal;

/* JADX INFO: compiled from: LockFreeTaskQueue.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 ,*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0002:\u0002,-B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0013\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00028\u0000¢\u0006\u0002\u0010\u0017J \u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0000j\b\u0012\u0004\u0012\u00028\u0000`\n2\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J \u0010\u001b\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0000j\b\u0012\u0004\u0012\u00028\u0000`\n2\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u0006\u0010\u001c\u001a\u00020\u0006J1\u0010\u001d\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0000j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\n2\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010\u001fJ\u0006\u0010 \u001a\u00020\u0006J&\u0010!\u001a\b\u0012\u0004\u0012\u0002H#0\"\"\u0004\b\u0001\u0010#2\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H#0%J\b\u0010&\u001a\u00020\u001aH\u0002J\f\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000J\b\u0010(\u001a\u0004\u0018\u00010\u0002J,\u0010)\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0000j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\n2\u0006\u0010*\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0004H\u0002R#\u0010\b\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0000j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\n0\tX\u0082\u0004R\t\u0010\u000b\u001a\u00020\fX\u0082\u0004R\u0011\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000eX\u0082\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u000f\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0012\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006."}, d2 = {"Lkotlinx/coroutines/internal/LockFreeTaskQueueCore;", "E", "", "capacity", "", "singleConsumer", "", "(IZ)V", "_next", "Lkotlinx/atomicfu/AtomicRef;", "Lkotlinx/coroutines/internal/Core;", "_state", "Lkotlinx/atomicfu/AtomicLong;", "array", "Lkotlinx/atomicfu/AtomicArray;", "isEmpty", "()Z", "mask", "size", "getSize", "()I", "addLast", "element", "(Ljava/lang/Object;)I", "allocateNextCopy", "state", "", "allocateOrGetNextCopy", "close", "fillPlaceholder", "index", "(ILjava/lang/Object;)Lkotlinx/coroutines/internal/LockFreeTaskQueueCore;", "isClosed", "map", "", "R", "transform", "Lkotlin/Function1;", "markFrozen", "next", "removeFirstOrNull", "removeSlowPath", "oldHead", "newHead", "Companion", "Placeholder", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class LockFreeTaskQueueCore<E> {
    public static final int ADD_CLOSED = 2;
    public static final int ADD_FROZEN = 1;
    public static final int ADD_SUCCESS = 0;
    public static final int CAPACITY_BITS = 30;
    public static final long CLOSED_MASK = 2305843009213693952L;
    public static final int CLOSED_SHIFT = 61;
    public static final kotlinx.coroutines.internal.LockFreeTaskQueueCore.Companion Companion = null;
    public static final long FROZEN_MASK = 1152921504606846976L;
    public static final int FROZEN_SHIFT = 60;
    public static final long HEAD_MASK = 1073741823;
    public static final int HEAD_SHIFT = 0;
    public static final int INITIAL_CAPACITY = 8;
    public static final int MAX_CAPACITY_MASK = 1073741823;
    public static final int MIN_ADD_SPIN_CAPACITY = 1024;
    public static final kotlinx.coroutines.internal.Symbol REMOVE_FROZEN = null;
    public static final long TAIL_MASK = 1152921503533105152L;
    public static final int TAIL_SHIFT = 30;
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater _next$volatile$FU = null;
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicLongFieldUpdater _state$volatile$FU = null;
    private volatile /* synthetic */ java.lang.Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;
    private final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceArray array;
    private final int capacity;
    private final int mask;
    private final boolean singleConsumer;

    /* JADX INFO: compiled from: LockFreeTaskQueue.kt */
    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\n\u0010\u0016\u001a\u00020\u0004*\u00020\tJ\u0012\u0010\u0017\u001a\u00020\t*\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0004J\u0012\u0010\u0019\u001a\u00020\t*\u00020\t2\u0006\u0010\u001a\u001a\u00020\u0004JP\u0010\u001b\u001a\u0002H\u001c\"\u0004\b\u0001\u0010\u001c*\u00020\t26\u0010\u001d\u001a2\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(!\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u001f\u0012\b\b \u0012\u0004\b\b(\"\u0012\u0004\u0012\u0002H\u001c0\u001eH\u0086\b¢\u0006\u0002\u0010#J\u0015\u0010$\u001a\u00020\t*\u00020\t2\u0006\u0010%\u001a\u00020\tH\u0086\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lkotlinx/coroutines/internal/LockFreeTaskQueueCore$Companion;", "", "()V", "ADD_CLOSED", "", "ADD_FROZEN", "ADD_SUCCESS", "CAPACITY_BITS", "CLOSED_MASK", "", "CLOSED_SHIFT", "FROZEN_MASK", "FROZEN_SHIFT", "HEAD_MASK", "HEAD_SHIFT", "INITIAL_CAPACITY", "MAX_CAPACITY_MASK", "MIN_ADD_SPIN_CAPACITY", "REMOVE_FROZEN", "Lkotlinx/coroutines/internal/Symbol;", "TAIL_MASK", "TAIL_SHIFT", "addFailReason", "updateHead", "newHead", "updateTail", "newTail", "withState", "T", "block", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "head", "tail", "(JLkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "wo", "other", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public final int addFailReason(long r5) {
                r4 = this;
                r0 = 2305843009213693952(0x2000000000000000, double:1.4916681462400413E-154)
                long r0 = r0 & r5
                r2 = 0
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 == 0) goto Lb
                r0 = 2
                goto Lc
            Lb:
                r0 = 1
            Lc:
                return r0
        }

        public final long updateHead(long r6, int r8) {
                r5 = this;
                r0 = 1073741823(0x3fffffff, double:5.304989472E-315)
                long r0 = r5.wo(r6, r0)
                long r2 = (long) r8
                r4 = 0
                long r2 = r2 << r4
                long r0 = r0 | r2
                return r0
        }

        public final long updateTail(long r6, int r8) {
                r5 = this;
                r0 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
                long r0 = r5.wo(r6, r0)
                long r2 = (long) r8
                r4 = 30
                long r2 = r2 << r4
                long r0 = r0 | r2
                return r0
        }

        public final <T> T withState(long r6, kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super java.lang.Integer, ? extends T> r8) {
                r5 = this;
                r0 = 0
                r1 = 1073741823(0x3fffffff, double:5.304989472E-315)
                long r1 = r1 & r6
                r3 = 0
                long r1 = r1 >> r3
                int r1 = (int) r1
                r2 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
                long r2 = r2 & r6
                r4 = 30
                long r2 = r2 >> r4
                int r2 = (int) r2
                java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
                java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
                java.lang.Object r3 = r8.invoke(r3, r4)
                return r3
        }

        public final long wo(long r3, long r5) {
                r2 = this;
                long r0 = ~r5
                long r0 = r0 & r3
                return r0
        }
    }

    /* JADX INFO: compiled from: LockFreeTaskQueue.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lkotlinx/coroutines/internal/LockFreeTaskQueueCore$Placeholder;", "", "index", "", "(I)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Placeholder {
        public final int index;

        public Placeholder(int r1) {
                r0 = this;
                r0.<init>()
                r0.index = r1
                return
        }
    }

    static {
            kotlinx.coroutines.internal.LockFreeTaskQueueCore$Companion r0 = new kotlinx.coroutines.internal.LockFreeTaskQueueCore$Companion
            r1 = 0
            r0.<init>(r1)
            kotlinx.coroutines.internal.LockFreeTaskQueueCore.Companion = r0
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.String r1 = "_next$volatile"
            java.lang.Class<kotlinx.coroutines.internal.LockFreeTaskQueueCore> r2 = kotlinx.coroutines.internal.LockFreeTaskQueueCore.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r0, r1)
            kotlinx.coroutines.internal.LockFreeTaskQueueCore._next$volatile$FU = r0
            java.lang.String r0 = "_state$volatile"
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(r2, r0)
            kotlinx.coroutines.internal.LockFreeTaskQueueCore._state$volatile$FU = r0
            kotlinx.coroutines.internal.Symbol r0 = new kotlinx.coroutines.internal.Symbol
            java.lang.String r1 = "REMOVE_FROZEN"
            r0.<init>(r1)
            kotlinx.coroutines.internal.LockFreeTaskQueueCore.REMOVE_FROZEN = r0
            return
    }

    public LockFreeTaskQueueCore(int r6, boolean r7) {
            r5 = this;
            r5.<init>()
            r5.capacity = r6
            r5.singleConsumer = r7
            int r0 = r5.capacity
            r1 = 1
            int r0 = r0 - r1
            r5.mask = r0
            java.util.concurrent.atomic.AtomicReferenceArray r0 = new java.util.concurrent.atomic.AtomicReferenceArray
            int r2 = r5.capacity
            r0.<init>(r2)
            r5.array = r0
            int r0 = r5.mask
            r2 = 1073741823(0x3fffffff, float:1.9999999)
            r3 = 0
            if (r0 > r2) goto L21
            r0 = r1
            goto L22
        L21:
            r0 = r3
        L22:
            java.lang.String r2 = "Check failed."
            if (r0 == 0) goto L3d
            int r0 = r5.capacity
            int r4 = r5.mask
            r0 = r0 & r4
            if (r0 != 0) goto L2e
            goto L2f
        L2e:
            r1 = r3
        L2f:
            if (r1 == 0) goto L33
        L32:
            return
        L33:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        L3d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
    }

    private final kotlinx.coroutines.internal.LockFreeTaskQueueCore<E> allocateNextCopy(long r20) {
            r19 = this;
            r0 = r19
            kotlinx.coroutines.internal.LockFreeTaskQueueCore r1 = new kotlinx.coroutines.internal.LockFreeTaskQueueCore
            int r2 = r0.capacity
            int r2 = r2 * 2
            boolean r3 = r0.singleConsumer
            r1.<init>(r2, r3)
            kotlinx.coroutines.internal.LockFreeTaskQueueCore$Companion r2 = kotlinx.coroutines.internal.LockFreeTaskQueueCore.Companion
            r3 = r20
            r5 = 0
            r6 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r6 = r6 & r3
            r8 = 0
            long r6 = r6 >> r8
            int r6 = (int) r6
            r7 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r7 = r7 & r3
            r9 = 30
            long r7 = r7 >> r9
            int r7 = (int) r7
            r8 = r6
            r9 = r7
            r10 = 0
            r11 = r8
        L27:
            int r12 = r0.mask
            r12 = r12 & r11
            int r13 = r0.mask
            r13 = r13 & r9
            if (r12 == r13) goto L4f
            java.util.concurrent.atomic.AtomicReferenceArray r12 = r0.getArray()
            int r13 = r0.mask
            r13 = r13 & r11
            java.lang.Object r12 = r12.get(r13)
            if (r12 != 0) goto L41
            kotlinx.coroutines.internal.LockFreeTaskQueueCore$Placeholder r12 = new kotlinx.coroutines.internal.LockFreeTaskQueueCore$Placeholder
            r12.<init>(r11)
        L41:
            java.util.concurrent.atomic.AtomicReferenceArray r13 = r1.getArray()
            int r14 = r1.mask
            r14 = r14 & r11
            r13.set(r14, r12)
            int r11 = r11 + 1
            goto L27
        L4f:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r12 = get_state$volatile$FU()
            kotlinx.coroutines.internal.LockFreeTaskQueueCore$Companion r13 = kotlinx.coroutines.internal.LockFreeTaskQueueCore.Companion
            r14 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            r16 = r2
            r17 = r3
            r2 = r20
            long r13 = r13.wo(r2, r14)
            r12.set(r1, r13)
            return r1
    }

    private final kotlinx.coroutines.internal.LockFreeTaskQueueCore<E> allocateOrGetNextCopy(long r8) {
            r7 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = get_next$volatile$FU()
            r1 = r7
        L5:
            java.lang.Object r2 = r0.get(r7)
            kotlinx.coroutines.internal.LockFreeTaskQueueCore r2 = (kotlinx.coroutines.internal.LockFreeTaskQueueCore) r2
            r3 = 0
            if (r2 == 0) goto Lf
            return r2
        Lf:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = get_next$volatile$FU()
            r5 = 0
            kotlinx.coroutines.internal.LockFreeTaskQueueCore r6 = r7.allocateNextCopy(r8)
            androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r4, r7, r5, r6)
            goto L5
    }

    private final kotlinx.coroutines.internal.LockFreeTaskQueueCore<E> fillPlaceholder(int r4, E r5) {
            r3 = this;
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r3.getArray()
            int r1 = r3.mask
            r1 = r1 & r4
            java.lang.Object r0 = r0.get(r1)
            boolean r1 = r0 instanceof kotlinx.coroutines.internal.LockFreeTaskQueueCore.Placeholder
            if (r1 == 0) goto L21
            r1 = r0
            kotlinx.coroutines.internal.LockFreeTaskQueueCore$Placeholder r1 = (kotlinx.coroutines.internal.LockFreeTaskQueueCore.Placeholder) r1
            int r1 = r1.index
            if (r1 != r4) goto L21
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r3.getArray()
            int r2 = r3.mask
            r2 = r2 & r4
            r1.set(r2, r5)
            return r3
        L21:
            r1 = 0
            return r1
    }

    private final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceArray getArray() {
            r1 = this;
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r1.array
            return r0
    }

    private final /* synthetic */ java.lang.Object get_next$volatile() {
            r1 = this;
            java.lang.Object r0 = r1._next$volatile
            return r0
    }

    private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater get_next$volatile$FU() {
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.internal.LockFreeTaskQueueCore._next$volatile$FU
            return r0
    }

    private final /* synthetic */ long get_state$volatile() {
            r2 = this;
            long r0 = r2._state$volatile
            return r0
    }

    private static final /* synthetic */ java.util.concurrent.atomic.AtomicLongFieldUpdater get_state$volatile$FU() {
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = kotlinx.coroutines.internal.LockFreeTaskQueueCore._state$volatile$FU
            return r0
    }

    private final /* synthetic */ void loop$atomicfu(java.lang.Object r3, java.util.concurrent.atomic.AtomicLongFieldUpdater r4, kotlin.jvm.functions.Function1<? super java.lang.Long, kotlin.Unit> r5) {
            r2 = this;
        L0:
            long r0 = r4.get(r3)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r5.invoke(r0)
            goto L0
    }

    private final /* synthetic */ void loop$atomicfu(java.lang.Object r2, java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3, kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit> r4) {
            r1 = this;
        L0:
            java.lang.Object r0 = r3.get(r2)
            r4.invoke(r0)
            goto L0
    }

    private final long markFrozen() {
            r13 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = get_state$volatile$FU()
            r6 = r13
        L5:
            long r2 = r0.get(r13)
            r4 = r2
            r1 = 0
            r7 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r9 = r4 & r7
            r11 = 0
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 == 0) goto L16
            return r4
        L16:
            long r4 = r4 | r7
            r1 = r13
            boolean r2 = r0.compareAndSet(r1, r2, r4)
            if (r2 == 0) goto L5
            return r4
    }

    private final kotlinx.coroutines.internal.LockFreeTaskQueueCore<E> removeSlowPath(int r22, int r23) {
            r21 = this;
            r1 = r21
            java.util.concurrent.atomic.AtomicLongFieldUpdater r6 = get_state$volatile$FU()
            r7 = r21
        L8:
            long r2 = r6.get(r1)
            r8 = 0
            kotlinx.coroutines.internal.LockFreeTaskQueueCore$Companion r9 = kotlinx.coroutines.internal.LockFreeTaskQueueCore.Companion
            r4 = r2
            r10 = r4
            r12 = 0
            r4 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r4 = r4 & r10
            r0 = 0
            long r4 = r4 >> r0
            int r13 = (int) r4
            r4 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r4 = r4 & r10
            r14 = 30
            long r4 = r4 >> r14
            int r14 = (int) r4
            r15 = r13
            r16 = 0
            boolean r4 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            if (r4 == 0) goto L3b
            r4 = 0
            r5 = r22
            if (r15 != r5) goto L32
            r0 = 1
        L32:
            if (r0 == 0) goto L35
            goto L3d
        L35:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L3b:
            r5 = r22
        L3d:
            r17 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r17 = r2 & r17
            r19 = 0
            int r0 = (r17 > r19 ? 1 : (r17 == r19 ? 0 : -1))
            if (r0 == 0) goto L4c
            kotlinx.coroutines.internal.LockFreeTaskQueueCore r0 = r1.next()
            return r0
        L4c:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = get_state$volatile$FU()
            kotlinx.coroutines.internal.LockFreeTaskQueueCore$Companion r4 = kotlinx.coroutines.internal.LockFreeTaskQueueCore.Companion
            r17 = r6
            r6 = r23
            long r18 = r4.updateHead(r2, r6)
            r4 = r18
            boolean r0 = r0.compareAndSet(r1, r2, r4)
            if (r0 == 0) goto L6e
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r1.getArray()
            int r4 = r1.mask
            r4 = r4 & r15
            r5 = 0
            r0.set(r4, r5)
            return r5
        L6e:
            r6 = r17
            goto L8
    }

    private final /* synthetic */ void set_next$volatile(java.lang.Object r1) {
            r0 = this;
            r0._next$volatile = r1
            return
    }

    private final /* synthetic */ void set_state$volatile(long r1) {
            r0 = this;
            r0._state$volatile = r1
            return
    }

    private final /* synthetic */ void update$atomicfu(java.lang.Object r7, java.util.concurrent.atomic.AtomicLongFieldUpdater r8, kotlin.jvm.functions.Function1<? super java.lang.Long, java.lang.Long> r9) {
            r6 = this;
        L0:
            long r2 = r8.get(r7)
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            java.lang.Object r0 = r9.invoke(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            long r4 = r0.longValue()
            r1 = r7
            r0 = r8
            boolean r7 = r0.compareAndSet(r1, r2, r4)
            if (r7 == 0) goto L1b
            return
        L1b:
            r8 = r0
            r7 = r1
            goto L0
    }

    private final /* synthetic */ long updateAndGet$atomicfu(java.lang.Object r8, java.util.concurrent.atomic.AtomicLongFieldUpdater r9, kotlin.jvm.functions.Function1<? super java.lang.Long, java.lang.Long> r10) {
            r7 = this;
        L0:
            long r2 = r9.get(r8)
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            java.lang.Object r0 = r10.invoke(r0)
            r6 = r0
            java.lang.Number r6 = (java.lang.Number) r6
            long r4 = r6.longValue()
            r1 = r8
            r0 = r9
            boolean r8 = r0.compareAndSet(r1, r2, r4)
            if (r8 == 0) goto L20
            long r8 = r6.longValue()
            return r8
        L20:
            r9 = r0
            r8 = r1
            goto L0
    }

    public final int addLast(E r28) {
            r27 = this;
            r1 = r27
            r6 = r28
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = get_state$volatile$FU()
            r7 = r27
            r8 = r0
        Lb:
            long r2 = r8.get(r1)
            r9 = 0
            r4 = 3458764513820540928(0x3000000000000000, double:1.727233711018889E-77)
            long r4 = r4 & r2
            r10 = 0
            int r0 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r0 == 0) goto L20
            kotlinx.coroutines.internal.LockFreeTaskQueueCore$Companion r0 = kotlinx.coroutines.internal.LockFreeTaskQueueCore.Companion
            int r0 = r0.addFailReason(r2)
            return r0
        L20:
            kotlinx.coroutines.internal.LockFreeTaskQueueCore$Companion r12 = kotlinx.coroutines.internal.LockFreeTaskQueueCore.Companion
            r13 = r2
            r15 = 0
            r4 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r4 = r4 & r13
            r16 = 0
            long r4 = r4 >> r16
            int r0 = (int) r4
            r4 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r4 = r4 & r13
            r17 = 30
            long r4 = r4 >> r17
            int r4 = (int) r4
            r17 = r0
            r5 = r4
            r18 = 0
            r19 = r10
            int r10 = r1.mask
            int r11 = r5 + 2
            r11 = r11 & r10
            r21 = r0
            r0 = r17 & r10
            r22 = 1
            if (r11 != r0) goto L4d
            return r22
        L4d:
            boolean r0 = r1.singleConsumer
            if (r0 != 0) goto L73
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r1.getArray()
            r23 = 1073741823(0x3fffffff, float:1.9999999)
            r11 = r5 & r10
            java.lang.Object r0 = r0.get(r11)
            if (r0 == 0) goto L76
            int r0 = r1.capacity
            r11 = 1024(0x400, float:1.435E-42)
            if (r0 < r11) goto L72
            int r0 = r5 - r17
            r0 = r0 & r23
            int r11 = r1.capacity
            int r11 = r11 >> 1
            if (r0 <= r11) goto L71
            goto L72
        L71:
            goto Lb
        L72:
            return r22
        L73:
            r23 = 1073741823(0x3fffffff, float:1.9999999)
        L76:
            int r0 = r5 + 1
            r11 = r0 & r23
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = get_state$volatile$FU()
            r22 = r0
            kotlinx.coroutines.internal.LockFreeTaskQueueCore$Companion r0 = kotlinx.coroutines.internal.LockFreeTaskQueueCore.Companion
            long r23 = r0.updateTail(r2, r11)
            r0 = r22
            r22 = r4
            r26 = r7
            r7 = r5
            r4 = r23
            r23 = r26
            boolean r0 = r0.compareAndSet(r1, r2, r4)
            if (r0 == 0) goto Lc1
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r27.getArray()
            r1 = r7 & r10
            r0.set(r1, r6)
            r0 = r27
        La2:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = get_state$volatile$FU()
            long r4 = r1.get(r0)
            r24 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r4 = r4 & r24
            int r1 = (r4 > r19 ? 1 : (r4 == r19 ? 0 : -1))
            if (r1 == 0) goto Lc0
            kotlinx.coroutines.internal.LockFreeTaskQueueCore r1 = r0.next()
            kotlinx.coroutines.internal.LockFreeTaskQueueCore r1 = r1.fillPlaceholder(r7, r6)
            if (r1 != 0) goto Lbe
            goto Lc0
        Lbe:
            r0 = r1
            goto La2
        Lc0:
            return r16
        Lc1:
            r1 = r27
            r7 = r23
            goto Lb
    }

    public final boolean close() {
            r15 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = get_state$volatile$FU()
            r6 = r15
        L5:
            long r2 = r0.get(r15)
            r4 = r2
            r1 = 0
            r7 = 2305843009213693952(0x2000000000000000, double:1.4916681462400413E-154)
            long r9 = r4 & r7
            r11 = 0
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            r10 = 1
            if (r9 == 0) goto L17
            return r10
        L17:
            r13 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r13 = r13 & r4
            int r9 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r9 == 0) goto L20
            r2 = 0
            return r2
        L20:
            long r4 = r4 | r7
            r1 = r15
            boolean r2 = r0.compareAndSet(r1, r2, r4)
            if (r2 == 0) goto L5
            return r10
    }

    public final int getSize() {
            r11 = this;
            kotlinx.coroutines.internal.LockFreeTaskQueueCore$Companion r0 = kotlinx.coroutines.internal.LockFreeTaskQueueCore.Companion
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = get_state$volatile$FU()
            long r1 = r1.get(r11)
            r3 = 0
            r4 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r4 = r4 & r1
            r6 = 0
            long r4 = r4 >> r6
            int r4 = (int) r4
            r5 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r5 = r5 & r1
            r7 = 30
            long r5 = r5 >> r7
            int r5 = (int) r5
            r6 = r4
            r7 = r5
            r8 = 0
            int r9 = r7 - r6
            r10 = 1073741823(0x3fffffff, float:1.9999999)
            r6 = r9 & r10
            return r6
    }

    public final boolean isClosed() {
            r4 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = get_state$volatile$FU()
            long r0 = r0.get(r4)
            r2 = 2305843009213693952(0x2000000000000000, double:1.4916681462400413E-154)
            long r0 = r0 & r2
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L13
            r0 = 1
            goto L14
        L13:
            r0 = 0
        L14:
            return r0
    }

    public final boolean isEmpty() {
            r10 = this;
            kotlinx.coroutines.internal.LockFreeTaskQueueCore$Companion r0 = kotlinx.coroutines.internal.LockFreeTaskQueueCore.Companion
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = get_state$volatile$FU()
            long r1 = r1.get(r10)
            r3 = 0
            r4 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r4 = r4 & r1
            r6 = 0
            long r4 = r4 >> r6
            int r4 = (int) r4
            r7 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r7 = r7 & r1
            r5 = 30
            long r7 = r7 >> r5
            int r5 = (int) r7
            r7 = r4
            r8 = r5
            r9 = 0
            if (r7 != r8) goto L22
            r6 = 1
        L22:
            return r6
    }

    public final <R> java.util.List<R> map(kotlin.jvm.functions.Function1<? super E, ? extends R> r14) {
            r13 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r13.capacity
            r0.<init>(r1)
            kotlinx.coroutines.internal.LockFreeTaskQueueCore$Companion r1 = kotlinx.coroutines.internal.LockFreeTaskQueueCore.Companion
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = get_state$volatile$FU()
            long r2 = r2.get(r13)
            r4 = 0
            r5 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r5 = r5 & r2
            r7 = 0
            long r5 = r5 >> r7
            int r5 = (int) r5
            r6 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r6 = r6 & r2
            r8 = 30
            long r6 = r6 >> r8
            int r6 = (int) r6
            r7 = r5
            r8 = r6
            r9 = 0
            r10 = r7
        L27:
            int r11 = r13.mask
            r11 = r11 & r10
            int r12 = r13.mask
            r12 = r12 & r8
            if (r11 == r12) goto L4b
            java.util.concurrent.atomic.AtomicReferenceArray r11 = r13.getArray()
            int r12 = r13.mask
            r12 = r12 & r10
            java.lang.Object r11 = r11.get(r12)
            if (r11 == 0) goto L47
            boolean r12 = r11 instanceof kotlinx.coroutines.internal.LockFreeTaskQueueCore.Placeholder
            if (r12 != 0) goto L47
            java.lang.Object r12 = r14.invoke(r11)
            r0.add(r12)
        L47:
            int r10 = r10 + 1
            goto L27
        L4b:
            r1 = r0
            java.util.List r1 = (java.util.List) r1
            return r1
    }

    public final kotlinx.coroutines.internal.LockFreeTaskQueueCore<E> next() {
            r2 = this;
            long r0 = r2.markFrozen()
            kotlinx.coroutines.internal.LockFreeTaskQueueCore r0 = r2.allocateOrGetNextCopy(r0)
            return r0
    }

    public final java.lang.Object removeFirstOrNull() {
            r22 = this;
            r1 = r22
            java.util.concurrent.atomic.AtomicLongFieldUpdater r6 = get_state$volatile$FU()
            r7 = r22
        L8:
            long r2 = r6.get(r1)
            r8 = 0
            r4 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r4 = r4 & r2
            r9 = 0
            int r0 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r0 == 0) goto L19
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.internal.LockFreeTaskQueueCore.REMOVE_FROZEN
            return r0
        L19:
            kotlinx.coroutines.internal.LockFreeTaskQueueCore$Companion r9 = kotlinx.coroutines.internal.LockFreeTaskQueueCore.Companion
            r4 = r2
            r10 = r4
            r12 = 0
            r4 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r4 = r4 & r10
            r0 = 0
            long r4 = r4 >> r0
            int r13 = (int) r4
            r4 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r4 = r4 & r10
            r0 = 30
            long r4 = r4 >> r0
            int r14 = (int) r4
            r0 = r13
            r15 = r14
            r16 = 0
            int r4 = r1.mask
            r4 = r4 & r15
            int r5 = r1.mask
            r5 = r5 & r0
            r17 = r6
            r6 = 0
            if (r4 != r5) goto L3f
            return r6
        L3f:
            java.util.concurrent.atomic.AtomicReferenceArray r4 = r1.getArray()
            int r5 = r1.mask
            r5 = r5 & r0
            java.lang.Object r4 = r4.get(r5)
            if (r4 != 0) goto L54
            boolean r5 = r1.singleConsumer
            if (r5 == 0) goto L51
            return r6
        L51:
            r6 = r17
            goto L8
        L54:
            boolean r5 = r4 instanceof kotlinx.coroutines.internal.LockFreeTaskQueueCore.Placeholder
            if (r5 == 0) goto L59
            return r6
        L59:
            int r5 = r0 + 1
            r18 = 1073741823(0x3fffffff, float:1.9999999)
            r5 = r5 & r18
            r18 = r0
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = get_state$volatile$FU()
            kotlinx.coroutines.internal.LockFreeTaskQueueCore$Companion r6 = kotlinx.coroutines.internal.LockFreeTaskQueueCore.Companion
            long r19 = r6.updateHead(r2, r5)
            r6 = r18
            r18 = r4
            r21 = r7
            r7 = r5
            r4 = r19
            r19 = r21
            boolean r0 = r0.compareAndSet(r1, r2, r4)
            if (r0 == 0) goto L89
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r1.getArray()
            int r4 = r1.mask
            r4 = r4 & r6
            r5 = 0
            r0.set(r4, r5)
            return r18
        L89:
            boolean r0 = r1.singleConsumer
            if (r0 == 0) goto L99
            r0 = r22
        L8f:
            kotlinx.coroutines.internal.LockFreeTaskQueueCore r4 = r0.removeSlowPath(r6, r7)
            if (r4 != 0) goto L97
            return r18
        L97:
            r0 = r4
            goto L8f
        L99:
            r6 = r17
            r7 = r19
            goto L8
    }
}
