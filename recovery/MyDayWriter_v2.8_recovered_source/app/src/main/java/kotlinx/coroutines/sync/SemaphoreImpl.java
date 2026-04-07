package kotlinx.coroutines.sync;

/* JADX INFO: compiled from: Semaphore.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0010\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\u000e\u0010\u0016\u001a\u00020\u0014H\u0096@¢\u0006\u0002\u0010\u0017Jb\u0010\u0016\u001a\u00020\u0014\"\u0004\b\u0000\u0010\u00182\u0006\u0010\u0019\u001a\u0002H\u00182!\u0010\u001a\u001a\u001d\u0012\u0013\u0012\u0011H\u0018¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u001d0\u00122!\u0010\u001e\u001a\u001d\u0012\u0013\u0012\u0011H\u0018¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u00140\u0012H\u0083\b¢\u0006\u0002\u0010\u001fJ\u0016\u0010\u0016\u001a\u00020\u00142\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00140 H\u0005J\u000e\u0010!\u001a\u00020\u0014H\u0082@¢\u0006\u0002\u0010\u0017J\u0010\u0010\"\u001a\u00020\u001d2\u0006\u0010\u0019\u001a\u00020#H\u0002J\b\u0010$\u001a\u00020\u0014H\u0002J\b\u0010%\u001a\u00020\u0003H\u0002J\u001e\u0010&\u001a\u00020\u00142\n\u0010'\u001a\u0006\u0012\u0002\b\u00030(2\b\u0010)\u001a\u0004\u0018\u00010*H\u0004J\b\u0010+\u001a\u00020\u0014H\u0016J\b\u0010,\u001a\u00020\u001dH\u0016J\b\u0010-\u001a\u00020\u001dH\u0002J\f\u0010.\u001a\u00020\u001d*\u00020*H\u0002R\t\u0010\u0006\u001a\u00020\u0007X\u0082\u0004R\u0014\u0010\b\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\t\u0010\u000b\u001a\u00020\fX\u0082\u0004R\t\u0010\r\u001a\u00020\fX\u0082\u0004R\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004R\u001a\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004¨\u0006/"}, d2 = {"Lkotlinx/coroutines/sync/SemaphoreImpl;", "Lkotlinx/coroutines/sync/Semaphore;", "permits", "", "acquiredPermits", "(II)V", "_availablePermits", "Lkotlinx/atomicfu/AtomicInt;", "availablePermits", "getAvailablePermits", "()I", "deqIdx", "Lkotlinx/atomicfu/AtomicLong;", "enqIdx", "head", "Lkotlinx/atomicfu/AtomicRef;", "Lkotlinx/coroutines/sync/SemaphoreSegment;", "onCancellationRelease", "Lkotlin/Function1;", "", "", "tail", "acquire", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "W", "waiter", "suspend", "Lkotlin/ParameterName;", "name", "", "onAcquired", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Lkotlinx/coroutines/CancellableContinuation;", "acquireSlowPath", "addAcquireToQueue", "Lkotlinx/coroutines/Waiter;", "coerceAvailablePermitsAtMaximum", "decPermits", "onAcquireRegFunction", "select", "Lkotlinx/coroutines/selects/SelectInstance;", "ignoredParam", "", "release", "tryAcquire", "tryResumeNextFromQueue", "tryResumeAcquire", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class SemaphoreImpl implements kotlinx.coroutines.sync.Semaphore {
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater _availablePermits$volatile$FU = null;
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicLongFieldUpdater deqIdx$volatile$FU = null;
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicLongFieldUpdater enqIdx$volatile$FU = null;
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater head$volatile$FU = null;
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater tail$volatile$FU = null;
    private volatile /* synthetic */ int _availablePermits$volatile;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ java.lang.Object head$volatile;
    private final kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit> onCancellationRelease;
    private final int permits;
    private volatile /* synthetic */ java.lang.Object tail$volatile;

    static {
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.String r1 = "head$volatile"
            java.lang.Class<kotlinx.coroutines.sync.SemaphoreImpl> r2 = kotlinx.coroutines.sync.SemaphoreImpl.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r0, r1)
            kotlinx.coroutines.sync.SemaphoreImpl.head$volatile$FU = r0
            java.lang.String r0 = "deqIdx$volatile"
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(r2, r0)
            kotlinx.coroutines.sync.SemaphoreImpl.deqIdx$volatile$FU = r0
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.String r1 = "tail$volatile"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r0, r1)
            kotlinx.coroutines.sync.SemaphoreImpl.tail$volatile$FU = r0
            java.lang.String r0 = "enqIdx$volatile"
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(r2, r0)
            kotlinx.coroutines.sync.SemaphoreImpl.enqIdx$volatile$FU = r0
            java.lang.String r0 = "_availablePermits$volatile"
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r2, r0)
            kotlinx.coroutines.sync.SemaphoreImpl._availablePermits$volatile$FU = r0
            return
    }

    public SemaphoreImpl(int r6, int r7) {
            r5 = this;
            r5.<init>()
            r5.permits = r6
            int r0 = r5.permits
            r1 = 1
            r2 = 0
            if (r0 <= 0) goto Le
            r0 = r1
            goto Lf
        Le:
            r0 = r2
        Lf:
            if (r0 == 0) goto L58
            if (r7 < 0) goto L18
            int r0 = r5.permits
            if (r7 > r0) goto L18
            goto L19
        L18:
            r1 = r2
        L19:
            if (r1 == 0) goto L38
            kotlinx.coroutines.sync.SemaphoreSegment r0 = new kotlinx.coroutines.sync.SemaphoreSegment
            r1 = 0
            r2 = 2
            r3 = 0
            r0.<init>(r3, r1, r2)
            r5.head$volatile = r0
            r5.tail$volatile = r0
            int r0 = r5.permits
            int r0 = r0 - r7
            r5._availablePermits$volatile = r0
            kotlinx.coroutines.sync.SemaphoreImpl$onCancellationRelease$1 r0 = new kotlinx.coroutines.sync.SemaphoreImpl$onCancellationRelease$1
            r0.<init>(r5)
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
            r5.onCancellationRelease = r0
            return
        L38:
            r0 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "The number of acquired permits should be in 0.."
            java.lang.StringBuilder r1 = r1.append(r2)
            int r2 = r5.permits
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r0 = r1.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L58:
            r0 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Semaphore should have at least 1 permit, but had "
            java.lang.StringBuilder r1 = r1.append(r2)
            int r2 = r5.permits
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r0 = r1.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
    }

    public static final /* synthetic */ java.lang.Object access$acquireSlowPath(kotlinx.coroutines.sync.SemaphoreImpl r1, kotlin.coroutines.Continuation r2) {
            java.lang.Object r0 = r1.acquireSlowPath(r2)
            return r0
    }

    public static final /* synthetic */ boolean access$addAcquireToQueue(kotlinx.coroutines.sync.SemaphoreImpl r1, kotlinx.coroutines.Waiter r2) {
            boolean r0 = r1.addAcquireToQueue(r2)
            return r0
    }

    private final <W> void acquire(W r4, kotlin.jvm.functions.Function1<? super W, java.lang.Boolean> r5, kotlin.jvm.functions.Function1<? super W, kotlin.Unit> r6) {
            r3 = this;
            r0 = 0
        L1:
            int r1 = r3.decPermits()
            if (r1 <= 0) goto Lc
            r6.invoke(r4)
            return
        Lc:
            java.lang.Object r2 = r5.invoke(r4)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L1
            return
    }

    static /* synthetic */ java.lang.Object acquire$suspendImpl(kotlinx.coroutines.sync.SemaphoreImpl r3, kotlin.coroutines.Continuation<? super kotlin.Unit> r4) {
            int r0 = r3.decPermits()
            if (r0 <= 0) goto L9
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            return r1
        L9:
            java.lang.Object r1 = r3.acquireSlowPath(r4)
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r1 != r2) goto L14
            return r1
        L14:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            return r1
    }

    private final java.lang.Object acquireSlowPath(kotlin.coroutines.Continuation<? super kotlin.Unit> r8) {
            r7 = this;
            r0 = 0
            r1 = r8
            r2 = 0
            kotlin.coroutines.Continuation r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r1)
            kotlinx.coroutines.CancellableContinuationImpl r3 = kotlinx.coroutines.CancellableContinuationKt.getOrCreateCancellableContinuation(r3)
            r4 = r3
            r5 = 0
            r6 = r4
            kotlinx.coroutines.Waiter r6 = (kotlinx.coroutines.Waiter) r6     // Catch: java.lang.Throwable -> L37
            boolean r6 = access$addAcquireToQueue(r7, r6)     // Catch: java.lang.Throwable -> L37
            if (r6 != 0) goto L1e
            r6 = r4
            kotlinx.coroutines.CancellableContinuation r6 = (kotlinx.coroutines.CancellableContinuation) r6     // Catch: java.lang.Throwable -> L37
            r7.acquire(r6)     // Catch: java.lang.Throwable -> L37
        L1e:
            java.lang.Object r1 = r3.getResult()
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r1 != r2) goto L2c
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r8)
        L2c:
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r1 != r2) goto L33
            return r1
        L33:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L37:
            r4 = move-exception
            r3.releaseClaimedReusableContinuation$kotlinx_coroutines_core()
            throw r4
    }

    private final boolean addAcquireToQueue(kotlinx.coroutines.Waiter r21) {
            r20 = this;
            r0 = r20
            r1 = r21
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = getTail$volatile$FU()
            java.lang.Object r2 = r2.get(r0)
            kotlinx.coroutines.sync.SemaphoreSegment r2 = (kotlinx.coroutines.sync.SemaphoreSegment) r2
            java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = getEnqIdx$volatile$FU()
            long r3 = r3.getAndIncrement(r0)
            kotlinx.coroutines.sync.SemaphoreImpl$addAcquireToQueue$createNewSegment$1 r5 = kotlinx.coroutines.sync.SemaphoreImpl$addAcquireToQueue$createNewSegment$1.INSTANCE
            kotlin.reflect.KFunction r5 = (kotlin.reflect.KFunction) r5
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = getTail$volatile$FU()
            int r7 = kotlinx.coroutines.sync.SemaphoreKt.access$getSEGMENT_SIZE$p()
            long r7 = (long) r7
            long r7 = r3 / r7
        L25:
            r9 = r2
            kotlinx.coroutines.internal.Segment r9 = (kotlinx.coroutines.internal.Segment) r9
            r10 = r5
            kotlin.jvm.functions.Function2 r10 = (kotlin.jvm.functions.Function2) r10
            java.lang.Object r9 = kotlinx.coroutines.internal.ConcurrentLinkedListKt.findSegmentInternal(r9, r7, r10)
            boolean r10 = kotlinx.coroutines.internal.SegmentOrClosed.m1720isClosedimpl(r9)
            if (r10 != 0) goto L81
            kotlinx.coroutines.internal.Segment r10 = kotlinx.coroutines.internal.SegmentOrClosed.m1718getSegmentimpl(r9)
        L39:
            java.lang.Object r13 = r6.get(r0)
            kotlinx.coroutines.internal.Segment r13 = (kotlinx.coroutines.internal.Segment) r13
            r14 = 0
            r15 = 0
            r16 = 1
            long r11 = r13.id
            r17 = r2
            r18 = r3
            long r2 = r10.id
            int r2 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r2 < 0) goto L52
            r2 = r16
            goto L6b
        L52:
            boolean r2 = r10.tryIncPointers$kotlinx_coroutines_core()
            if (r2 != 0) goto L5a
            r2 = r15
            goto L6b
        L5a:
            boolean r2 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r6, r0, r13, r10)
            if (r2 == 0) goto L73
            boolean r2 = r13.decPointers$kotlinx_coroutines_core()
            if (r2 == 0) goto L69
            r13.remove()
        L69:
            r2 = r16
        L6b:
            if (r2 == 0) goto L6e
            goto L88
        L6e:
            r2 = r17
            r3 = r18
            goto L25
        L73:
            boolean r2 = r10.decPointers$kotlinx_coroutines_core()
            if (r2 == 0) goto L7c
            r10.remove()
        L7c:
            r2 = r17
            r3 = r18
            goto L39
        L81:
            r17 = r2
            r18 = r3
            r15 = 0
            r16 = 1
        L88:
            kotlinx.coroutines.internal.Segment r2 = kotlinx.coroutines.internal.SegmentOrClosed.m1718getSegmentimpl(r9)
            kotlinx.coroutines.sync.SemaphoreSegment r2 = (kotlinx.coroutines.sync.SemaphoreSegment) r2
            int r3 = kotlinx.coroutines.sync.SemaphoreKt.access$getSEGMENT_SIZE$p()
            long r3 = (long) r3
            long r3 = r18 % r3
            int r3 = (int) r3
            r4 = 0
            r6 = r2
            r7 = 0
            java.util.concurrent.atomic.AtomicReferenceArray r8 = r6.getAcquirers()
            boolean r4 = kotlinx.coroutines.channels.ChannelSegment$$ExternalSyntheticBackportWithForwarding0.m(r8, r3, r4, r1)
            if (r4 == 0) goto Lab
            r4 = r2
            kotlinx.coroutines.internal.Segment r4 = (kotlinx.coroutines.internal.Segment) r4
            r1.invokeOnCancellation(r4, r3)
            return r16
        Lab:
            kotlinx.coroutines.internal.Symbol r4 = kotlinx.coroutines.sync.SemaphoreKt.access$getPERMIT$p()
            kotlinx.coroutines.internal.Symbol r6 = kotlinx.coroutines.sync.SemaphoreKt.access$getTAKEN$p()
            r7 = r2
            r8 = 0
            java.util.concurrent.atomic.AtomicReferenceArray r9 = r7.getAcquirers()
            boolean r4 = kotlinx.coroutines.channels.ChannelSegment$$ExternalSyntheticBackportWithForwarding0.m(r9, r3, r4, r6)
            if (r4 == 0) goto L101
        Lc0:
            boolean r4 = r1 instanceof kotlinx.coroutines.CancellableContinuation
            if (r4 == 0) goto Ld7
            java.lang.String r4 = "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1, r4)
            r4 = r1
            kotlinx.coroutines.CancellableContinuation r4 = (kotlinx.coroutines.CancellableContinuation) r4
            r4 = r1
            kotlinx.coroutines.CancellableContinuation r4 = (kotlinx.coroutines.CancellableContinuation) r4
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit> r7 = r0.onCancellationRelease
            r4.resume(r6, r7)
            goto Le3
        Ld7:
            boolean r4 = r1 instanceof kotlinx.coroutines.selects.SelectInstance
            if (r4 == 0) goto Le4
            r4 = r1
            kotlinx.coroutines.selects.SelectInstance r4 = (kotlinx.coroutines.selects.SelectInstance) r4
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            r4.selectInRegistrationPhase(r6)
        Le3:
            return r16
        Le4:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "unexpected: "
            java.lang.StringBuilder r6 = r6.append(r7)
            java.lang.StringBuilder r6 = r6.append(r1)
            java.lang.String r6 = r6.toString()
            java.lang.String r6 = r6.toString()
            r4.<init>(r6)
            throw r4
        L101:
            boolean r4 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            if (r4 == 0) goto L125
            r4 = 0
            r6 = r2
            r7 = 0
            java.util.concurrent.atomic.AtomicReferenceArray r8 = r6.getAcquirers()
            java.lang.Object r6 = r8.get(r3)
            kotlinx.coroutines.internal.Symbol r7 = kotlinx.coroutines.sync.SemaphoreKt.access$getBROKEN$p()
            if (r6 != r7) goto L11b
            r12 = r16
            goto L11c
        L11b:
            r12 = r15
        L11c:
            if (r12 == 0) goto L11f
            goto L125
        L11f:
            java.lang.AssertionError r4 = new java.lang.AssertionError
            r4.<init>()
            throw r4
        L125:
            return r15
    }

    private final void coerceAvailablePermitsAtMaximum() {
            r3 = this;
        L1:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = get_availablePermits$volatile$FU()
            int r0 = r0.get(r3)
            int r1 = r3.permits
            if (r0 <= r1) goto L19
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = get_availablePermits$volatile$FU()
            int r2 = r3.permits
            boolean r1 = r1.compareAndSet(r3, r0, r2)
            if (r1 == 0) goto L1
        L19:
            return
    }

    private final int decPermits() {
            r2 = this;
        L1:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = get_availablePermits$volatile$FU()
            int r0 = r0.getAndDecrement(r2)
            int r1 = r2.permits
            if (r0 > r1) goto L1
            return r0
    }

    private final /* synthetic */ long getDeqIdx$volatile() {
            r2 = this;
            long r0 = r2.deqIdx$volatile
            return r0
    }

    private static final /* synthetic */ java.util.concurrent.atomic.AtomicLongFieldUpdater getDeqIdx$volatile$FU() {
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = kotlinx.coroutines.sync.SemaphoreImpl.deqIdx$volatile$FU
            return r0
    }

    private final /* synthetic */ long getEnqIdx$volatile() {
            r2 = this;
            long r0 = r2.enqIdx$volatile
            return r0
    }

    private static final /* synthetic */ java.util.concurrent.atomic.AtomicLongFieldUpdater getEnqIdx$volatile$FU() {
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = kotlinx.coroutines.sync.SemaphoreImpl.enqIdx$volatile$FU
            return r0
    }

    private final /* synthetic */ java.lang.Object getHead$volatile() {
            r1 = this;
            java.lang.Object r0 = r1.head$volatile
            return r0
    }

    private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater getHead$volatile$FU() {
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.sync.SemaphoreImpl.head$volatile$FU
            return r0
    }

    private final /* synthetic */ java.lang.Object getTail$volatile() {
            r1 = this;
            java.lang.Object r0 = r1.tail$volatile
            return r0
    }

    private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater getTail$volatile$FU() {
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.sync.SemaphoreImpl.tail$volatile$FU
            return r0
    }

    private final /* synthetic */ int get_availablePermits$volatile() {
            r1 = this;
            int r0 = r1._availablePermits$volatile
            return r0
    }

    private static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater get_availablePermits$volatile$FU() {
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = kotlinx.coroutines.sync.SemaphoreImpl._availablePermits$volatile$FU
            return r0
    }

    private final /* synthetic */ void setDeqIdx$volatile(long r1) {
            r0 = this;
            r0.deqIdx$volatile = r1
            return
    }

    private final /* synthetic */ void setEnqIdx$volatile(long r1) {
            r0 = this;
            r0.enqIdx$volatile = r1
            return
    }

    private final /* synthetic */ void setHead$volatile(java.lang.Object r1) {
            r0 = this;
            r0.head$volatile = r1
            return
    }

    private final /* synthetic */ void setTail$volatile(java.lang.Object r1) {
            r0 = this;
            r0.tail$volatile = r1
            return
    }

    private final /* synthetic */ void set_availablePermits$volatile(int r1) {
            r0 = this;
            r0._availablePermits$volatile = r1
            return
    }

    private final boolean tryResumeAcquire(java.lang.Object r5) {
            r4 = this;
            boolean r0 = r5 instanceof kotlinx.coroutines.CancellableContinuation
            if (r0 == 0) goto L26
            java.lang.String r0 = "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r5, r0)
            r0 = r5
            kotlinx.coroutines.CancellableContinuation r0 = (kotlinx.coroutines.CancellableContinuation) r0
            r0 = r5
            kotlinx.coroutines.CancellableContinuation r0 = (kotlinx.coroutines.CancellableContinuation) r0
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            r2 = 0
            kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit> r3 = r4.onCancellationRelease
            java.lang.Object r0 = r0.tryResume(r1, r2, r3)
            if (r0 == 0) goto L23
            r1 = r5
            kotlinx.coroutines.CancellableContinuation r1 = (kotlinx.coroutines.CancellableContinuation) r1
            r1.completeResume(r0)
            r1 = 1
            goto L33
        L23:
            r1 = 0
            goto L33
        L26:
            boolean r0 = r5 instanceof kotlinx.coroutines.selects.SelectInstance
            if (r0 == 0) goto L34
            r0 = r5
            kotlinx.coroutines.selects.SelectInstance r0 = (kotlinx.coroutines.selects.SelectInstance) r0
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            boolean r1 = r0.trySelect(r4, r1)
        L33:
            return r1
        L34:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "unexpected: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r5)
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    private final boolean tryResumeNextFromQueue() {
            r19 = this;
            r0 = r19
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = getHead$volatile$FU()
            java.lang.Object r1 = r1.get(r0)
            kotlinx.coroutines.sync.SemaphoreSegment r1 = (kotlinx.coroutines.sync.SemaphoreSegment) r1
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = getDeqIdx$volatile$FU()
            long r2 = r2.getAndIncrement(r0)
            int r4 = kotlinx.coroutines.sync.SemaphoreKt.access$getSEGMENT_SIZE$p()
            long r4 = (long) r4
            long r4 = r2 / r4
            kotlinx.coroutines.sync.SemaphoreImpl$tryResumeNextFromQueue$createNewSegment$1 r6 = kotlinx.coroutines.sync.SemaphoreImpl$tryResumeNextFromQueue$createNewSegment$1.INSTANCE
            kotlin.reflect.KFunction r6 = (kotlin.reflect.KFunction) r6
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = getHead$volatile$FU()
        L23:
            r8 = r1
            kotlinx.coroutines.internal.Segment r8 = (kotlinx.coroutines.internal.Segment) r8
            r9 = r6
            kotlin.jvm.functions.Function2 r9 = (kotlin.jvm.functions.Function2) r9
            java.lang.Object r8 = kotlinx.coroutines.internal.ConcurrentLinkedListKt.findSegmentInternal(r8, r4, r9)
            boolean r9 = kotlinx.coroutines.internal.SegmentOrClosed.m1720isClosedimpl(r8)
            if (r9 != 0) goto L75
            kotlinx.coroutines.internal.Segment r9 = kotlinx.coroutines.internal.SegmentOrClosed.m1718getSegmentimpl(r8)
        L37:
            java.lang.Object r12 = r7.get(r0)
            kotlinx.coroutines.internal.Segment r12 = (kotlinx.coroutines.internal.Segment) r12
            r13 = 0
            long r14 = r12.id
            r16 = 0
            r17 = 1
            long r10 = r9.id
            int r10 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
            if (r10 < 0) goto L4d
            r9 = r17
            goto L67
        L4d:
            boolean r10 = r9.tryIncPointers$kotlinx_coroutines_core()
            if (r10 != 0) goto L56
            r9 = r16
            goto L67
        L56:
            boolean r10 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r7, r0, r12, r9)
            if (r10 == 0) goto L6a
            boolean r10 = r12.decPointers$kotlinx_coroutines_core()
            if (r10 == 0) goto L65
            r12.remove()
        L65:
            r9 = r17
        L67:
            if (r9 == 0) goto L23
            goto L79
        L6a:
            boolean r10 = r9.decPointers$kotlinx_coroutines_core()
            if (r10 == 0) goto L73
            r9.remove()
        L73:
            goto L37
        L75:
            r16 = 0
            r17 = 1
        L79:
            kotlinx.coroutines.internal.Segment r7 = kotlinx.coroutines.internal.SegmentOrClosed.m1718getSegmentimpl(r8)
            kotlinx.coroutines.sync.SemaphoreSegment r7 = (kotlinx.coroutines.sync.SemaphoreSegment) r7
            r7.cleanPrev()
            long r8 = r7.id
            int r8 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r8 <= 0) goto L8a
            return r16
        L8a:
            int r8 = kotlinx.coroutines.sync.SemaphoreKt.access$getSEGMENT_SIZE$p()
            long r8 = (long) r8
            long r8 = r2 % r8
            int r8 = (int) r8
            kotlinx.coroutines.internal.Symbol r9 = kotlinx.coroutines.sync.SemaphoreKt.access$getPERMIT$p()
            r10 = r7
            r11 = 0
            java.util.concurrent.atomic.AtomicReferenceArray r12 = r10.getAcquirers()
            java.lang.Object r9 = r12.getAndSet(r8, r9)
            if (r9 != 0) goto Lde
            int r10 = kotlinx.coroutines.sync.SemaphoreKt.access$getMAX_SPIN_CYCLES$p()
            r11 = r16
        Laa:
            if (r11 >= r10) goto Lc7
            r12 = r11
            r13 = 0
            r14 = r7
            r15 = 0
            r18 = r1
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r14.getAcquirers()
            java.lang.Object r1 = r1.get(r8)
            kotlinx.coroutines.internal.Symbol r14 = kotlinx.coroutines.sync.SemaphoreKt.access$getTAKEN$p()
            if (r1 != r14) goto Lc1
            return r17
        Lc1:
            int r11 = r11 + 1
            r1 = r18
            goto Laa
        Lc7:
            r18 = r1
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.sync.SemaphoreKt.access$getPERMIT$p()
            kotlinx.coroutines.internal.Symbol r10 = kotlinx.coroutines.sync.SemaphoreKt.access$getBROKEN$p()
            r11 = r7
            r12 = 0
            java.util.concurrent.atomic.AtomicReferenceArray r13 = r11.getAcquirers()
            boolean r1 = kotlinx.coroutines.channels.ChannelSegment$$ExternalSyntheticBackportWithForwarding0.m(r13, r8, r1, r10)
            r1 = r1 ^ 1
            return r1
        Lde:
            r18 = r1
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.sync.SemaphoreKt.access$getCANCELLED$p()
            if (r9 != r1) goto Le7
            return r16
        Le7:
            boolean r1 = r0.tryResumeAcquire(r9)
            return r1
    }

    @Override // kotlinx.coroutines.sync.Semaphore
    public java.lang.Object acquire(kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
            r1 = this;
            java.lang.Object r0 = acquire$suspendImpl(r1, r2)
            return r0
    }

    protected final void acquire(kotlinx.coroutines.CancellableContinuation<? super kotlin.Unit> r8) {
            r7 = this;
            r0 = r7
            r1 = 0
        L2:
            int r2 = r0.decPermits()
            if (r2 <= 0) goto L14
            r3 = r8
            r4 = 0
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit> r6 = r7.onCancellationRelease
            r3.resume(r5, r6)
            goto L24
        L14:
            r3 = r8
            r4 = 0
            java.lang.String r5 = "null cannot be cast to non-null type kotlinx.coroutines.Waiter"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3, r5)
            r5 = r3
            kotlinx.coroutines.Waiter r5 = (kotlinx.coroutines.Waiter) r5
            boolean r3 = r7.addAcquireToQueue(r5)
            if (r3 == 0) goto L2
        L24:
            return
    }

    @Override // kotlinx.coroutines.sync.Semaphore
    public int getAvailablePermits() {
            r2 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = get_availablePermits$volatile$FU()
            int r0 = r0.get(r2)
            r1 = 0
            int r0 = java.lang.Math.max(r0, r1)
            return r0
    }

    protected final void onAcquireRegFunction(kotlinx.coroutines.selects.SelectInstance<?> r7, java.lang.Object r8) {
            r6 = this;
            r0 = r6
            r1 = 0
        L2:
            int r2 = r0.decPermits()
            if (r2 <= 0) goto L12
            r3 = r7
            r4 = 0
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            r3.selectInRegistrationPhase(r5)
            goto L22
        L12:
            r3 = r7
            r4 = 0
            java.lang.String r5 = "null cannot be cast to non-null type kotlinx.coroutines.Waiter"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3, r5)
            r5 = r3
            kotlinx.coroutines.Waiter r5 = (kotlinx.coroutines.Waiter) r5
            boolean r3 = r6.addAcquireToQueue(r5)
            if (r3 == 0) goto L2
        L22:
            return
    }

    @Override // kotlinx.coroutines.sync.Semaphore
    public void release() {
            r4 = this;
        L1:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = get_availablePermits$volatile$FU()
            int r0 = r0.getAndIncrement(r4)
            int r1 = r4.permits
            if (r0 >= r1) goto L17
            if (r0 < 0) goto L10
            return
        L10:
            boolean r1 = r4.tryResumeNextFromQueue()
            if (r1 == 0) goto L1
            return
        L17:
            r4.coerceAvailablePermitsAtMaximum()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "The number of released permits cannot be greater than "
            java.lang.StringBuilder r2 = r2.append(r3)
            int r3 = r4.permits
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    @Override // kotlinx.coroutines.sync.Semaphore
    public boolean tryAcquire() {
            r3 = this;
        L1:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = get_availablePermits$volatile$FU()
            int r0 = r0.get(r3)
            int r1 = r3.permits
            if (r0 <= r1) goto L11
            r3.coerceAvailablePermitsAtMaximum()
            goto L1
        L11:
            if (r0 > 0) goto L15
            r1 = 0
            return r1
        L15:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = get_availablePermits$volatile$FU()
            int r2 = r0 + (-1)
            boolean r1 = r1.compareAndSet(r3, r0, r2)
            if (r1 == 0) goto L1
            r1 = 1
            return r1
    }
}
