package kotlinx.coroutines.flow;

/* JADX INFO: compiled from: SharedFlow.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u0002H\u00010\u00042\b\u0012\u0004\u0012\u0002H\u00010\u00052\b\u0012\u0004\u0012\u0002H\u00010\u0006:\u0001hB\u001d\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0016\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\u0003H\u0082@¢\u0006\u0002\u0010.J\u0010\u0010/\u001a\u00020,2\u0006\u00100\u001a\u000201H\u0002J\b\u00102\u001a\u00020,H\u0002J\u001c\u00103\u001a\u0002042\f\u00105\u001a\b\u0012\u0004\u0012\u00028\u000006H\u0096@¢\u0006\u0002\u00107J\u0010\u00108\u001a\u00020,2\u0006\u00109\u001a\u00020\u0012H\u0002J\b\u0010:\u001a\u00020\u0003H\u0014J\u001d\u0010;\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u000e2\u0006\u0010<\u001a\u00020\bH\u0014¢\u0006\u0002\u0010=J\b\u0010>\u001a\u00020,H\u0002J\u0016\u0010?\u001a\u00020,2\u0006\u0010@\u001a\u00028\u0000H\u0096@¢\u0006\u0002\u0010AJ\u0016\u0010B\u001a\u00020,2\u0006\u0010@\u001a\u00028\u0000H\u0082@¢\u0006\u0002\u0010AJ\u0012\u0010C\u001a\u00020,2\b\u0010D\u001a\u0004\u0018\u00010\u000fH\u0002J1\u0010E\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020,\u0018\u00010F0\u000e2\u0014\u0010G\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020,\u0018\u00010F0\u000eH\u0002¢\u0006\u0002\u0010HJ&\u0010I\u001a\b\u0012\u0004\u0012\u00028\u00000J2\u0006\u0010K\u001a\u00020L2\u0006\u0010M\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0012\u0010N\u001a\u0004\u0018\u00010\u000f2\u0006\u0010O\u001a\u00020\u0012H\u0002J7\u0010P\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000e2\u0010\u0010Q\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0018\u00010\u000e2\u0006\u0010R\u001a\u00020\b2\u0006\u0010S\u001a\u00020\bH\u0002¢\u0006\u0002\u0010TJ\b\u0010U\u001a\u00020,H\u0016J\u0015\u0010V\u001a\u00020W2\u0006\u0010@\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010XJ\u0015\u0010Y\u001a\u00020W2\u0006\u0010@\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010XJ\u0015\u0010Z\u001a\u00020W2\u0006\u0010@\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010XJ\u0010\u0010[\u001a\u00020\u00122\u0006\u0010-\u001a\u00020\u0003H\u0002J\u0012\u0010\\\u001a\u0004\u0018\u00010\u000f2\u0006\u0010-\u001a\u00020\u0003H\u0002J(\u0010]\u001a\u00020,2\u0006\u0010^\u001a\u00020\u00122\u0006\u0010_\u001a\u00020\u00122\u0006\u0010`\u001a\u00020\u00122\u0006\u0010a\u001a\u00020\u0012H\u0002J%\u0010b\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020,\u0018\u00010F0\u000e2\u0006\u0010c\u001a\u00020\u0012H\u0000¢\u0006\u0004\bd\u0010eJ\r\u0010f\u001a\u00020\u0012H\u0000¢\u0006\u0002\bgR\u001a\u0010\r\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0010R\u000e\u0010\t\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u00020\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\u00020\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0014R\u001a\u0010\u0018\u001a\u00028\u00008DX\u0084\u0004¢\u0006\f\u0012\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u000e\u0010\u001d\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\u00020\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0014R\u000e\u0010 \u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\"8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u000e\u0010%\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010&\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0014\u0010)\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b*\u0010(¨\u0006i"}, d2 = {"Lkotlinx/coroutines/flow/SharedFlowImpl;", "T", "Lkotlinx/coroutines/flow/internal/AbstractSharedFlow;", "Lkotlinx/coroutines/flow/SharedFlowSlot;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lkotlinx/coroutines/flow/CancellableFlow;", "Lkotlinx/coroutines/flow/internal/FusibleFlow;", "replay", "", "bufferCapacity", "onBufferOverflow", "Lkotlinx/coroutines/channels/BufferOverflow;", "(IILkotlinx/coroutines/channels/BufferOverflow;)V", "buffer", "", "", "[Ljava/lang/Object;", "bufferEndIndex", "", "getBufferEndIndex", "()J", "bufferSize", "head", "getHead", "lastReplayedLocked", "getLastReplayedLocked$annotations", "()V", "getLastReplayedLocked", "()Ljava/lang/Object;", "minCollectorIndex", "queueEndIndex", "getQueueEndIndex", "queueSize", "replayCache", "", "getReplayCache", "()Ljava/util/List;", "replayIndex", "replaySize", "getReplaySize", "()I", "totalSize", "getTotalSize", "awaitValue", "", "slot", "(Lkotlinx/coroutines/flow/SharedFlowSlot;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cancelEmitter", "emitter", "Lkotlinx/coroutines/flow/SharedFlowImpl$Emitter;", "cleanupTailLocked", "collect", "", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "correctCollectorIndexesOnDropOldest", "newHead", "createSlot", "createSlotArray", "size", "(I)[Lkotlinx/coroutines/flow/SharedFlowSlot;", "dropOldestLocked", "emit", "value", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "emitSuspend", "enqueueLocked", "item", "findSlotsToResumeLocked", "Lkotlin/coroutines/Continuation;", "resumesIn", "([Lkotlin/coroutines/Continuation;)[Lkotlin/coroutines/Continuation;", "fuse", "Lkotlinx/coroutines/flow/Flow;", "context", "Lkotlin/coroutines/CoroutineContext;", "capacity", "getPeekedValueLockedAt", "index", "growBuffer", "curBuffer", "curSize", "newSize", "([Ljava/lang/Object;II)[Ljava/lang/Object;", "resetReplayCache", "tryEmit", "", "(Ljava/lang/Object;)Z", "tryEmitLocked", "tryEmitNoCollectorsLocked", "tryPeekLocked", "tryTakeValue", "updateBufferLocked", "newReplayIndex", "newMinCollectorIndex", "newBufferEndIndex", "newQueueEndIndex", "updateCollectorIndexLocked", "oldIndex", "updateCollectorIndexLocked$kotlinx_coroutines_core", "(J)[Lkotlin/coroutines/Continuation;", "updateNewCollectorIndexLocked", "updateNewCollectorIndexLocked$kotlinx_coroutines_core", "Emitter", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class SharedFlowImpl<T> extends kotlinx.coroutines.flow.internal.AbstractSharedFlow<kotlinx.coroutines.flow.SharedFlowSlot> implements kotlinx.coroutines.flow.MutableSharedFlow<T>, kotlinx.coroutines.flow.CancellableFlow<T>, kotlinx.coroutines.flow.internal.FusibleFlow<T> {
    private java.lang.Object[] buffer;
    private final int bufferCapacity;
    private int bufferSize;
    private long minCollectorIndex;
    private final kotlinx.coroutines.channels.BufferOverflow onBufferOverflow;
    private int queueSize;
    private final int replay;
    private long replayIndex;

    /* JADX INFO: compiled from: SharedFlow.kt */
    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B1\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\u0010\u000bJ\b\u0010\f\u001a\u00020\nH\u0016R\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lkotlinx/coroutines/flow/SharedFlowImpl$Emitter;", "Lkotlinx/coroutines/DisposableHandle;", "flow", "Lkotlinx/coroutines/flow/SharedFlowImpl;", "index", "", "value", "", "cont", "Lkotlin/coroutines/Continuation;", "", "(Lkotlinx/coroutines/flow/SharedFlowImpl;JLjava/lang/Object;Lkotlin/coroutines/Continuation;)V", "dispose", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class Emitter implements kotlinx.coroutines.DisposableHandle {
        public final kotlin.coroutines.Continuation<kotlin.Unit> cont;
        public final kotlinx.coroutines.flow.SharedFlowImpl<?> flow;
        public long index;
        public final java.lang.Object value;

        public Emitter(kotlinx.coroutines.flow.SharedFlowImpl<?> r1, long r2, java.lang.Object r4, kotlin.coroutines.Continuation<? super kotlin.Unit> r5) {
                r0 = this;
                r0.<init>()
                r0.flow = r1
                r0.index = r2
                r0.value = r4
                r0.cont = r5
                return
        }

        @Override // kotlinx.coroutines.DisposableHandle
        public void dispose() {
                r1 = this;
                kotlinx.coroutines.flow.SharedFlowImpl<?> r0 = r1.flow
                kotlinx.coroutines.flow.SharedFlowImpl.access$cancelEmitter(r0, r1)
                return
        }
    }

    /* JADX INFO: compiled from: SharedFlow.kt */
    @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;

        static {
                kotlinx.coroutines.channels.BufferOverflow[] r0 = kotlinx.coroutines.channels.BufferOverflow.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                kotlinx.coroutines.channels.BufferOverflow r1 = kotlinx.coroutines.channels.BufferOverflow.SUSPEND     // Catch: java.lang.NoSuchFieldError -> L11
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L11
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L11
                goto L12
            L11:
                r1 = move-exception
            L12:
                kotlinx.coroutines.channels.BufferOverflow r1 = kotlinx.coroutines.channels.BufferOverflow.DROP_LATEST     // Catch: java.lang.NoSuchFieldError -> L1c
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1c
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1c
                goto L1d
            L1c:
                r1 = move-exception
            L1d:
                kotlinx.coroutines.channels.BufferOverflow r1 = kotlinx.coroutines.channels.BufferOverflow.DROP_OLDEST     // Catch: java.lang.NoSuchFieldError -> L27
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L27
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L27
                goto L28
            L27:
                r1 = move-exception
            L28:
                kotlinx.coroutines.flow.SharedFlowImpl.WhenMappings.$EnumSwitchMapping$0 = r0
                return
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.SharedFlowImpl$collect$1, reason: invalid class name */
    /* JADX INFO: compiled from: SharedFlow.kt */
    @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.SharedFlowImpl", f = "SharedFlow.kt", i = {0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2}, l = {382, 389, 392}, m = "collect$suspendImpl", n = {"$this", "collector", "slot", "$this", "collector", "slot", "collectorJob", "$this", "collector", "slot", "collectorJob"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3"})
    static final class AnonymousClass1<T> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        java.lang.Object L$3;
        int label;
        /* synthetic */ java.lang.Object result;
        final /* synthetic */ kotlinx.coroutines.flow.SharedFlowImpl<T> this$0;

        AnonymousClass1(kotlinx.coroutines.flow.SharedFlowImpl<T> r1, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.SharedFlowImpl.AnonymousClass1> r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r2)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r4) {
                r3 = this;
                r3.result = r4
                int r0 = r3.label
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r0 = r0 | r1
                r3.label = r0
                kotlinx.coroutines.flow.SharedFlowImpl<T> r0 = r3.this$0
                r1 = 0
                r2 = r3
                kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
                java.lang.Object r0 = kotlinx.coroutines.flow.SharedFlowImpl.collect$suspendImpl(r0, r1, r2)
                return r0
        }
    }

    public SharedFlowImpl(int r1, int r2, kotlinx.coroutines.channels.BufferOverflow r3) {
            r0 = this;
            r0.<init>()
            r0.replay = r1
            r0.bufferCapacity = r2
            r0.onBufferOverflow = r3
            return
    }

    public static final /* synthetic */ java.lang.Object access$awaitValue(kotlinx.coroutines.flow.SharedFlowImpl r1, kotlinx.coroutines.flow.SharedFlowSlot r2, kotlin.coroutines.Continuation r3) {
            java.lang.Object r0 = r1.awaitValue(r2, r3)
            return r0
    }

    public static final /* synthetic */ void access$cancelEmitter(kotlinx.coroutines.flow.SharedFlowImpl r0, kotlinx.coroutines.flow.SharedFlowImpl.Emitter r1) {
            r0.cancelEmitter(r1)
            return
    }

    public static final /* synthetic */ java.lang.Object access$emitSuspend(kotlinx.coroutines.flow.SharedFlowImpl r1, java.lang.Object r2, kotlin.coroutines.Continuation r3) {
            java.lang.Object r0 = r1.emitSuspend(r2, r3)
            return r0
    }

    public static final /* synthetic */ void access$enqueueLocked(kotlinx.coroutines.flow.SharedFlowImpl r0, java.lang.Object r1) {
            r0.enqueueLocked(r1)
            return
    }

    public static final /* synthetic */ kotlin.coroutines.Continuation[] access$findSlotsToResumeLocked(kotlinx.coroutines.flow.SharedFlowImpl r1, kotlin.coroutines.Continuation[] r2) {
            kotlin.coroutines.Continuation[] r0 = r1.findSlotsToResumeLocked(r2)
            return r0
    }

    public static final /* synthetic */ int access$getBufferCapacity$p(kotlinx.coroutines.flow.SharedFlowImpl r1) {
            int r0 = r1.bufferCapacity
            return r0
    }

    public static final /* synthetic */ long access$getHead(kotlinx.coroutines.flow.SharedFlowImpl r2) {
            long r0 = r2.getHead()
            return r0
    }

    public static final /* synthetic */ int access$getQueueSize$p(kotlinx.coroutines.flow.SharedFlowImpl r1) {
            int r0 = r1.queueSize
            return r0
    }

    public static final /* synthetic */ int access$getTotalSize(kotlinx.coroutines.flow.SharedFlowImpl r1) {
            int r0 = r1.getTotalSize()
            return r0
    }

    public static final /* synthetic */ void access$setQueueSize$p(kotlinx.coroutines.flow.SharedFlowImpl r0, int r1) {
            r0.queueSize = r1
            return
    }

    public static final /* synthetic */ boolean access$tryEmitLocked(kotlinx.coroutines.flow.SharedFlowImpl r1, java.lang.Object r2) {
            boolean r0 = r1.tryEmitLocked(r2)
            return r0
    }

    public static final /* synthetic */ long access$tryPeekLocked(kotlinx.coroutines.flow.SharedFlowImpl r2, kotlinx.coroutines.flow.SharedFlowSlot r3) {
            long r0 = r2.tryPeekLocked(r3)
            return r0
    }

    private final java.lang.Object awaitValue(kotlinx.coroutines.flow.SharedFlowSlot r14, kotlin.coroutines.Continuation<? super kotlin.Unit> r15) {
            r13 = this;
            r0 = 0
            r1 = r15
            r2 = 0
            kotlinx.coroutines.CancellableContinuationImpl r3 = new kotlinx.coroutines.CancellableContinuationImpl
            kotlin.coroutines.Continuation r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r1)
            r5 = 1
            r3.<init>(r4, r5)
            r3.initCancellability()
            r4 = r3
            kotlinx.coroutines.CancellableContinuation r4 = (kotlinx.coroutines.CancellableContinuation) r4
            r5 = 0
            r6 = 0
            r7 = 0
            monitor-enter(r13)
            r8 = 0
            long r9 = access$tryPeekLocked(r13, r14)     // Catch: java.lang.Throwable -> L5b
            r11 = 0
            int r11 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r11 >= 0) goto L2e
            r11 = r4
            kotlin.coroutines.Continuation r11 = (kotlin.coroutines.Continuation) r11     // Catch: java.lang.Throwable -> L5b
            r14.cont = r11     // Catch: java.lang.Throwable -> L5b
            r11 = r4
            kotlin.coroutines.Continuation r11 = (kotlin.coroutines.Continuation) r11     // Catch: java.lang.Throwable -> L5b
            r14.cont = r11     // Catch: java.lang.Throwable -> L5b
            goto L3d
        L2e:
            r11 = r4
            kotlin.coroutines.Continuation r11 = (kotlin.coroutines.Continuation) r11     // Catch: java.lang.Throwable -> L5b
            kotlin.Result$Companion r12 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L5b
            kotlin.Unit r12 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L5b
            java.lang.Object r12 = kotlin.Result.m153constructorimpl(r12)     // Catch: java.lang.Throwable -> L5b
            r11.resumeWith(r12)     // Catch: java.lang.Throwable -> L5b
        L3d:
            kotlin.Unit r8 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L5b
            monitor-exit(r13)
            java.lang.Object r1 = r3.getResult()
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r1 != r2) goto L50
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r15)
        L50:
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r1 != r2) goto L57
            return r1
        L57:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L5b:
            r8 = move-exception
            monitor-exit(r13)
            throw r8
    }

    private final void cancelEmitter(kotlinx.coroutines.flow.SharedFlowImpl.Emitter r8) {
            r7 = this;
            r0 = 0
            r1 = 0
            monitor-enter(r7)
            r2 = 0
            long r3 = r8.index     // Catch: java.lang.Throwable -> L30
            long r5 = r7.getHead()     // Catch: java.lang.Throwable -> L30
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 >= 0) goto L11
            monitor-exit(r7)
            return
        L11:
            java.lang.Object[] r3 = r7.buffer     // Catch: java.lang.Throwable -> L30
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3)     // Catch: java.lang.Throwable -> L30
            long r4 = r8.index     // Catch: java.lang.Throwable -> L30
            java.lang.Object r4 = kotlinx.coroutines.flow.SharedFlowKt.access$getBufferAt(r3, r4)     // Catch: java.lang.Throwable -> L30
            if (r4 == r8) goto L20
            monitor-exit(r7)
            return
        L20:
            long r4 = r8.index     // Catch: java.lang.Throwable -> L30
            kotlinx.coroutines.internal.Symbol r6 = kotlinx.coroutines.flow.SharedFlowKt.NO_VALUE     // Catch: java.lang.Throwable -> L30
            kotlinx.coroutines.flow.SharedFlowKt.access$setBufferAt(r3, r4, r6)     // Catch: java.lang.Throwable -> L30
            r7.cleanupTailLocked()     // Catch: java.lang.Throwable -> L30
            kotlin.Unit r2 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L30
            monitor-exit(r7)
            return
        L30:
            r2 = move-exception
            monitor-exit(r7)
            throw r2
    }

    private final void cleanupTailLocked() {
            r5 = this;
            int r0 = r5.bufferCapacity
            if (r0 != 0) goto La
            int r0 = r5.queueSize
            r1 = 1
            if (r0 > r1) goto La
            return
        La:
            java.lang.Object[] r0 = r5.buffer
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
        Lf:
            int r1 = r5.queueSize
            if (r1 <= 0) goto L3d
            long r1 = r5.getHead()
            int r3 = r5.getTotalSize()
            long r3 = (long) r3
            long r1 = r1 + r3
            r3 = 1
            long r1 = r1 - r3
            java.lang.Object r1 = kotlinx.coroutines.flow.SharedFlowKt.access$getBufferAt(r0, r1)
            kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.flow.SharedFlowKt.NO_VALUE
            if (r1 != r2) goto L3d
            int r1 = r5.queueSize
            int r1 = r1 + (-1)
            r5.queueSize = r1
            long r1 = r5.getHead()
            int r3 = r5.getTotalSize()
            long r3 = (long) r3
            long r1 = r1 + r3
            r3 = 0
            kotlinx.coroutines.flow.SharedFlowKt.access$setBufferAt(r0, r1, r3)
            goto Lf
        L3d:
            return
    }

    static /* synthetic */ <T> java.lang.Object collect$suspendImpl(kotlinx.coroutines.flow.SharedFlowImpl<T> r7, kotlinx.coroutines.flow.FlowCollector<? super T> r8, kotlin.coroutines.Continuation<?> r9) {
            boolean r0 = r9 instanceof kotlinx.coroutines.flow.SharedFlowImpl.AnonymousClass1
            if (r0 == 0) goto L14
            r0 = r9
            kotlinx.coroutines.flow.SharedFlowImpl$collect$1 r0 = (kotlinx.coroutines.flow.SharedFlowImpl.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r9 = r0.label
            int r9 = r9 - r2
            r0.label = r9
            goto L19
        L14:
            kotlinx.coroutines.flow.SharedFlowImpl$collect$1 r0 = new kotlinx.coroutines.flow.SharedFlowImpl$collect$1
            r0.<init>(r7, r9)
        L19:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            switch(r2) {
                case 0: goto L6a;
                case 1: goto L58;
                case 2: goto L44;
                case 3: goto L2c;
                default: goto L24;
            }
        L24:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L2c:
            java.lang.Object r7 = r0.L$3
            kotlinx.coroutines.Job r7 = (kotlinx.coroutines.Job) r7
            java.lang.Object r8 = r0.L$2
            kotlinx.coroutines.flow.SharedFlowSlot r8 = (kotlinx.coroutines.flow.SharedFlowSlot) r8
            java.lang.Object r2 = r0.L$1
            kotlinx.coroutines.flow.FlowCollector r2 = (kotlinx.coroutines.flow.FlowCollector) r2
            java.lang.Object r3 = r0.L$0
            kotlinx.coroutines.flow.SharedFlowImpl r3 = (kotlinx.coroutines.flow.SharedFlowImpl) r3
            kotlin.ResultKt.throwOnFailure(r9)     // Catch: java.lang.Throwable -> Ld8
            r6 = r2
            r2 = r7
            r7 = r6
            goto Ld7
        L44:
            java.lang.Object r7 = r0.L$3
            kotlinx.coroutines.Job r7 = (kotlinx.coroutines.Job) r7
            java.lang.Object r8 = r0.L$2
            kotlinx.coroutines.flow.SharedFlowSlot r8 = (kotlinx.coroutines.flow.SharedFlowSlot) r8
            java.lang.Object r2 = r0.L$1
            kotlinx.coroutines.flow.FlowCollector r2 = (kotlinx.coroutines.flow.FlowCollector) r2
            java.lang.Object r3 = r0.L$0
            kotlinx.coroutines.flow.SharedFlowImpl r3 = (kotlinx.coroutines.flow.SharedFlowImpl) r3
            kotlin.ResultKt.throwOnFailure(r9)     // Catch: java.lang.Throwable -> Ld8
            goto Lbc
        L58:
            java.lang.Object r7 = r0.L$2
            r8 = r7
            kotlinx.coroutines.flow.SharedFlowSlot r8 = (kotlinx.coroutines.flow.SharedFlowSlot) r8
            java.lang.Object r7 = r0.L$1
            kotlinx.coroutines.flow.FlowCollector r7 = (kotlinx.coroutines.flow.FlowCollector) r7
            java.lang.Object r2 = r0.L$0
            r3 = r2
            kotlinx.coroutines.flow.SharedFlowImpl r3 = (kotlinx.coroutines.flow.SharedFlowImpl) r3
            kotlin.ResultKt.throwOnFailure(r9)     // Catch: java.lang.Throwable -> Ld8
            goto L8d
        L6a:
            kotlin.ResultKt.throwOnFailure(r9)
            r3 = r7
            r7 = r8
            kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot r8 = r3.allocateSlot()
            kotlinx.coroutines.flow.SharedFlowSlot r8 = (kotlinx.coroutines.flow.SharedFlowSlot) r8
            boolean r2 = r7 instanceof kotlinx.coroutines.flow.SubscribedFlowCollector     // Catch: java.lang.Throwable -> Ld8
            if (r2 == 0) goto L8e
            r2 = r7
            kotlinx.coroutines.flow.SubscribedFlowCollector r2 = (kotlinx.coroutines.flow.SubscribedFlowCollector) r2     // Catch: java.lang.Throwable -> Ld8
            r0.L$0 = r3     // Catch: java.lang.Throwable -> Ld8
            r0.L$1 = r7     // Catch: java.lang.Throwable -> Ld8
            r0.L$2 = r8     // Catch: java.lang.Throwable -> Ld8
            r4 = 1
            r0.label = r4     // Catch: java.lang.Throwable -> Ld8
            java.lang.Object r2 = r2.onSubscription(r0)     // Catch: java.lang.Throwable -> Ld8
            if (r2 != r1) goto L8d
            return r1
        L8d:
        L8e:
            r2 = 0
            kotlin.coroutines.CoroutineContext r4 = r0.getContext()     // Catch: java.lang.Throwable -> Ld8
            kotlinx.coroutines.Job$Key r2 = kotlinx.coroutines.Job.Key     // Catch: java.lang.Throwable -> Ld8
            kotlin.coroutines.CoroutineContext$Key r2 = (kotlin.coroutines.CoroutineContext.Key) r2     // Catch: java.lang.Throwable -> Ld8
            kotlin.coroutines.CoroutineContext$Element r2 = r4.get(r2)     // Catch: java.lang.Throwable -> Ld8
            kotlinx.coroutines.Job r2 = (kotlinx.coroutines.Job) r2     // Catch: java.lang.Throwable -> Ld8
        L9d:
            r6 = r2
            r2 = r7
            r7 = r6
        La1:
            java.lang.Object r4 = r3.tryTakeValue(r8)     // Catch: java.lang.Throwable -> Ld8
            kotlinx.coroutines.internal.Symbol r5 = kotlinx.coroutines.flow.SharedFlowKt.NO_VALUE     // Catch: java.lang.Throwable -> Ld8
            if (r4 != r5) goto Lbd
            r0.L$0 = r3     // Catch: java.lang.Throwable -> Ld8
            r0.L$1 = r2     // Catch: java.lang.Throwable -> Ld8
            r0.L$2 = r8     // Catch: java.lang.Throwable -> Ld8
            r0.L$3 = r7     // Catch: java.lang.Throwable -> Ld8
            r4 = 2
            r0.label = r4     // Catch: java.lang.Throwable -> Ld8
            java.lang.Object r4 = r3.awaitValue(r8, r0)     // Catch: java.lang.Throwable -> Ld8
            if (r4 != r1) goto Lbc
            return r1
        Lbc:
            goto La1
        Lbd:
            if (r7 == 0) goto Lc2
            kotlinx.coroutines.JobKt.ensureActive(r7)     // Catch: java.lang.Throwable -> Ld8
        Lc2:
            r0.L$0 = r3     // Catch: java.lang.Throwable -> Ld8
            r0.L$1 = r2     // Catch: java.lang.Throwable -> Ld8
            r0.L$2 = r8     // Catch: java.lang.Throwable -> Ld8
            r0.L$3 = r7     // Catch: java.lang.Throwable -> Ld8
            r5 = 3
            r0.label = r5     // Catch: java.lang.Throwable -> Ld8
            java.lang.Object r5 = r2.emit(r4, r0)     // Catch: java.lang.Throwable -> Ld8
            if (r5 != r1) goto Ld4
            return r1
        Ld4:
            r6 = r2
            r2 = r7
            r7 = r6
        Ld7:
            goto L9d
        Ld8:
            r7 = move-exception
            r1 = r8
            kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot r1 = (kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot) r1
            r3.freeSlot(r1)
            throw r7
    }

    private final void correctCollectorIndexesOnDropOldest(long r19) {
            r18 = this;
            r0 = r18
            r1 = r19
            r3 = r0
            kotlinx.coroutines.flow.internal.AbstractSharedFlow r3 = (kotlinx.coroutines.flow.internal.AbstractSharedFlow) r3
            r4 = 0
            int r5 = kotlinx.coroutines.flow.internal.AbstractSharedFlow.access$getNCollectors(r3)
            if (r5 == 0) goto L3c
            kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot[] r5 = kotlinx.coroutines.flow.internal.AbstractSharedFlow.access$getSlots(r3)
            if (r5 == 0) goto L3b
            r6 = 0
            int r7 = r5.length
            r8 = 0
        L17:
            if (r8 >= r7) goto L3a
            r9 = r5[r8]
            r10 = r9
            r11 = 0
            if (r10 == 0) goto L35
            r12 = r10
            kotlinx.coroutines.flow.SharedFlowSlot r12 = (kotlinx.coroutines.flow.SharedFlowSlot) r12
            r13 = 0
            long r14 = r12.index
            r16 = 0
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 < 0) goto L33
            long r14 = r12.index
            int r14 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            if (r14 >= 0) goto L33
            r12.index = r1
        L33:
        L35:
            int r8 = r8 + 1
            goto L17
        L3a:
        L3b:
        L3c:
            r0.minCollectorIndex = r1
            return
    }

    private final void dropOldestLocked() {
            r5 = this;
            java.lang.Object[] r0 = r5.buffer
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            long r1 = r5.getHead()
            r3 = 0
            kotlinx.coroutines.flow.SharedFlowKt.access$setBufferAt(r0, r1, r3)
            int r0 = r5.bufferSize
            int r0 = r0 + (-1)
            r5.bufferSize = r0
            long r0 = r5.getHead()
            r2 = 1
            long r0 = r0 + r2
            long r2 = r5.replayIndex
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 >= 0) goto L22
            r5.replayIndex = r0
        L22:
            long r2 = r5.minCollectorIndex
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 >= 0) goto L2b
            r5.correctCollectorIndexesOnDropOldest(r0)
        L2b:
            boolean r2 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            if (r2 == 0) goto L46
            r2 = 0
            long r3 = r5.getHead()
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 != 0) goto L3c
            r3 = 1
            goto L3d
        L3c:
            r3 = 0
        L3d:
            if (r3 == 0) goto L40
            goto L46
        L40:
            java.lang.AssertionError r2 = new java.lang.AssertionError
            r2.<init>()
            throw r2
        L46:
            return
    }

    static /* synthetic */ <T> java.lang.Object emit$suspendImpl(kotlinx.coroutines.flow.SharedFlowImpl<T> r2, T r3, kotlin.coroutines.Continuation<? super kotlin.Unit> r4) {
            boolean r0 = r2.tryEmit(r3)
            if (r0 == 0) goto L9
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L9:
            java.lang.Object r0 = r2.emitSuspend(r3, r4)
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r0 != r1) goto L14
            return r0
        L14:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
    }

    private final java.lang.Object emitSuspend(T r18, kotlin.coroutines.Continuation<? super kotlin.Unit> r19) {
            r17 = this;
            r1 = r17
            r6 = 0
            r7 = r19
            r8 = 0
            kotlinx.coroutines.CancellableContinuationImpl r0 = new kotlinx.coroutines.CancellableContinuationImpl
            kotlin.coroutines.Continuation r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r7)
            r9 = 1
            r0.<init>(r2, r9)
            r10 = r0
            r10.initCancellability()
            r11 = r10
            kotlinx.coroutines.CancellableContinuation r11 = (kotlinx.coroutines.CancellableContinuation) r11
            r12 = 0
            r0 = 0
            kotlin.coroutines.Continuation<kotlin.Unit>[] r13 = kotlinx.coroutines.flow.internal.AbstractSharedFlowKt.EMPTY_RESUMES
            r14 = 0
            r15 = 0
            monitor-enter(r17)
            r16 = 0
            boolean r0 = access$tryEmitLocked(r17, r18)     // Catch: java.lang.Throwable -> La7
            if (r0 == 0) goto L3b
            r0 = r11
            kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0     // Catch: java.lang.Throwable -> La7
            kotlin.Result$Companion r2 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> La7
            kotlin.Unit r2 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> La7
            java.lang.Object r2 = kotlin.Result.m153constructorimpl(r2)     // Catch: java.lang.Throwable -> La7
            r0.resumeWith(r2)     // Catch: java.lang.Throwable -> La7
            kotlin.coroutines.Continuation[] r0 = access$findSlotsToResumeLocked(r1, r13)     // Catch: java.lang.Throwable -> La7
            r2 = 0
            goto L6a
        L3b:
            kotlinx.coroutines.flow.SharedFlowImpl$Emitter r0 = new kotlinx.coroutines.flow.SharedFlowImpl$Emitter     // Catch: java.lang.Throwable -> La7
            long r2 = access$getHead(r1)     // Catch: java.lang.Throwable -> La7
            int r4 = access$getTotalSize(r1)     // Catch: java.lang.Throwable -> La7
            long r4 = (long) r4     // Catch: java.lang.Throwable -> La7
            long r2 = r2 + r4
            r5 = r11
            kotlin.coroutines.Continuation r5 = (kotlin.coroutines.Continuation) r5     // Catch: java.lang.Throwable -> La7
            r4 = r18
            r0.<init>(r1, r2, r4, r5)     // Catch: java.lang.Throwable -> La7
            r2 = r0
            r3 = 0
            access$enqueueLocked(r1, r2)     // Catch: java.lang.Throwable -> La7
            int r4 = access$getQueueSize$p(r1)     // Catch: java.lang.Throwable -> La7
            int r4 = r4 + r9
            access$setQueueSize$p(r1, r4)     // Catch: java.lang.Throwable -> La7
            int r4 = access$getBufferCapacity$p(r1)     // Catch: java.lang.Throwable -> La7
            if (r4 != 0) goto L67
            kotlin.coroutines.Continuation[] r4 = access$findSlotsToResumeLocked(r1, r13)     // Catch: java.lang.Throwable -> La7
            r13 = r4
        L67:
            r2 = r0
            r0 = r13
        L6a:
            monitor-exit(r17)
            if (r2 == 0) goto L77
            r3 = r2
            r4 = 0
            r5 = r3
            kotlinx.coroutines.DisposableHandle r5 = (kotlinx.coroutines.DisposableHandle) r5
            kotlinx.coroutines.CancellableContinuationKt.disposeOnCancellation(r11, r5)
        L77:
            int r3 = r0.length
            r4 = 0
        L79:
            if (r4 >= r3) goto L8d
            r5 = r0[r4]
            if (r5 == 0) goto L8a
            kotlin.Result$Companion r9 = kotlin.Result.Companion
            kotlin.Unit r9 = kotlin.Unit.INSTANCE
            java.lang.Object r9 = kotlin.Result.m153constructorimpl(r9)
            r5.resumeWith(r9)
        L8a:
            int r4 = r4 + 1
            goto L79
        L8d:
            java.lang.Object r0 = r10.getResult()
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r0 != r2) goto L9c
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r19)
        L9c:
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r0 != r2) goto La3
            return r0
        La3:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        La7:
            r0 = move-exception
            monitor-exit(r17)
            throw r0
    }

    private final void enqueueLocked(java.lang.Object r7) {
            r6 = this;
            int r0 = r6.getTotalSize()
            java.lang.Object[] r1 = r6.buffer
            r2 = 2
            if (r1 != 0) goto L11
            r3 = 0
            r4 = 0
            java.lang.Object[] r2 = r6.growBuffer(r3, r4, r2)
            r1 = r2
            goto L1b
        L11:
            int r3 = r1.length
            if (r0 < r3) goto L1b
            int r3 = r1.length
            int r3 = r3 * r2
            java.lang.Object[] r2 = r6.growBuffer(r1, r0, r3)
            r1 = r2
        L1b:
            long r2 = r6.getHead()
            long r4 = (long) r0
            long r2 = r2 + r4
            kotlinx.coroutines.flow.SharedFlowKt.access$setBufferAt(r1, r2, r7)
            return
    }

    private final kotlin.coroutines.Continuation<kotlin.Unit>[] findSlotsToResumeLocked(kotlin.coroutines.Continuation<kotlin.Unit>[] r21) {
            r20 = this;
            r0 = r20
            r1 = 0
            r1 = r21
            r2 = 0
            r3 = r21
            int r2 = r3.length
            r4 = r0
            kotlinx.coroutines.flow.internal.AbstractSharedFlow r4 = (kotlinx.coroutines.flow.internal.AbstractSharedFlow) r4
            r5 = 0
            int r6 = kotlinx.coroutines.flow.internal.AbstractSharedFlow.access$getNCollectors(r4)
            if (r6 == 0) goto L71
            kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot[] r6 = kotlinx.coroutines.flow.internal.AbstractSharedFlow.access$getSlots(r4)
            if (r6 == 0) goto L70
            r7 = 0
            int r8 = r6.length
            r9 = 0
        L1c:
            if (r9 >= r8) goto L6e
            r10 = r6[r9]
            r11 = r10
            r12 = 0
            if (r11 == 0) goto L65
            r13 = r11
            kotlinx.coroutines.flow.SharedFlowSlot r13 = (kotlinx.coroutines.flow.SharedFlowSlot) r13
            r14 = 0
            kotlin.coroutines.Continuation<? super kotlin.Unit> r15 = r13.cont
            if (r15 != 0) goto L2f
            r17 = r2
            goto L62
        L2f:
            long r16 = r0.tryPeekLocked(r13)
            r18 = 0
            int r16 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r16 < 0) goto L60
            int r0 = r1.length
            if (r2 < r0) goto L53
            int r0 = r1.length
            r16 = r0
            r0 = 2
            r17 = r2
            int r2 = r16 * 2
            int r0 = java.lang.Math.max(r0, r2)
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r1, r0)
            java.lang.String r2 = "copyOf(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)
            r1 = r0
            goto L55
        L53:
            r17 = r2
        L55:
            r0 = r1
            kotlin.coroutines.Continuation[] r0 = (kotlin.coroutines.Continuation[]) r0
            int r2 = r17 + 1
            r0[r17] = r15
            r0 = 0
            r13.cont = r0
            goto L64
        L60:
            r17 = r2
        L62:
            r2 = r17
        L64:
            goto L67
        L65:
            r17 = r2
        L67:
            int r9 = r9 + 1
            r0 = r20
            goto L1c
        L6e:
            r17 = r2
        L70:
        L71:
            r0 = r1
            kotlin.coroutines.Continuation[] r0 = (kotlin.coroutines.Continuation[]) r0
            return r0
    }

    private final long getBufferEndIndex() {
            r4 = this;
            long r0 = r4.getHead()
            int r2 = r4.bufferSize
            long r2 = (long) r2
            long r0 = r0 + r2
            return r0
    }

    private final long getHead() {
            r4 = this;
            long r0 = r4.minCollectorIndex
            long r2 = r4.replayIndex
            long r0 = java.lang.Math.min(r0, r2)
            return r0
    }

    protected static /* synthetic */ void getLastReplayedLocked$annotations() {
            return
    }

    private final java.lang.Object getPeekedValueLockedAt(long r3) {
            r2 = this;
            java.lang.Object[] r0 = r2.buffer
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            java.lang.Object r0 = kotlinx.coroutines.flow.SharedFlowKt.access$getBufferAt(r0, r3)
            boolean r1 = r0 instanceof kotlinx.coroutines.flow.SharedFlowImpl.Emitter
            if (r1 == 0) goto L14
            r1 = r0
            kotlinx.coroutines.flow.SharedFlowImpl$Emitter r1 = (kotlinx.coroutines.flow.SharedFlowImpl.Emitter) r1
            java.lang.Object r1 = r1.value
            r0 = r1
            goto L15
        L14:
        L15:
            return r0
    }

    private final long getQueueEndIndex() {
            r4 = this;
            long r0 = r4.getHead()
            int r2 = r4.bufferSize
            long r2 = (long) r2
            long r0 = r0 + r2
            int r2 = r4.queueSize
            long r2 = (long) r2
            long r0 = r0 + r2
            return r0
    }

    private final int getReplaySize() {
            r4 = this;
            long r0 = r4.getHead()
            int r2 = r4.bufferSize
            long r2 = (long) r2
            long r0 = r0 + r2
            long r2 = r4.replayIndex
            long r0 = r0 - r2
            int r0 = (int) r0
            return r0
    }

    private final int getTotalSize() {
            r2 = this;
            int r0 = r2.bufferSize
            int r1 = r2.queueSize
            int r0 = r0 + r1
            return r0
    }

    private final java.lang.Object[] growBuffer(java.lang.Object[] r9, int r10, int r11) {
            r8 = this;
            if (r11 <= 0) goto L4
            r0 = 1
            goto L5
        L4:
            r0 = 0
        L5:
            if (r0 == 0) goto L26
            java.lang.Object[] r0 = new java.lang.Object[r11]
            r1 = r0
            r2 = 0
            r8.buffer = r1
            if (r9 != 0) goto L10
            return r0
        L10:
            long r1 = r8.getHead()
            r3 = 0
        L15:
            if (r3 >= r10) goto L25
            long r4 = (long) r3
            long r4 = r4 + r1
            long r6 = (long) r3
            long r6 = r6 + r1
            java.lang.Object r6 = kotlinx.coroutines.flow.SharedFlowKt.access$getBufferAt(r9, r6)
            kotlinx.coroutines.flow.SharedFlowKt.access$setBufferAt(r0, r4, r6)
            int r3 = r3 + 1
            goto L15
        L25:
            return r0
        L26:
            r0 = 0
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Buffer size overflow"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    private final boolean tryEmitLocked(T r15) {
            r14 = this;
            int r0 = r14.getNCollectors()
            if (r0 != 0) goto Lb
            boolean r0 = r14.tryEmitNoCollectorsLocked(r15)
            return r0
        Lb:
            int r0 = r14.bufferSize
            int r1 = r14.bufferCapacity
            r2 = 1
            if (r0 < r1) goto L2b
            long r0 = r14.minCollectorIndex
            long r3 = r14.replayIndex
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 > 0) goto L2b
            kotlinx.coroutines.channels.BufferOverflow r0 = r14.onBufferOverflow
            int[] r1 = kotlinx.coroutines.flow.SharedFlowImpl.WhenMappings.$EnumSwitchMapping$0
            int r0 = r0.ordinal()
            r0 = r1[r0]
            switch(r0) {
                case 1: goto L29;
                case 2: goto L28;
                default: goto L27;
            }
        L27:
            goto L2b
        L28:
            return r2
        L29:
            r0 = 0
            return r0
        L2b:
            r14.enqueueLocked(r15)
            int r0 = r14.bufferSize
            int r0 = r0 + r2
            r14.bufferSize = r0
            int r0 = r14.bufferSize
            int r1 = r14.bufferCapacity
            if (r0 <= r1) goto L3c
            r14.dropOldestLocked()
        L3c:
            int r0 = r14.getReplaySize()
            int r1 = r14.replay
            if (r0 <= r1) goto L58
            long r0 = r14.replayIndex
            r3 = 1
            long r6 = r0 + r3
            long r8 = r14.minCollectorIndex
            long r10 = r14.getBufferEndIndex()
            long r12 = r14.getQueueEndIndex()
            r5 = r14
            r5.updateBufferLocked(r6, r8, r10, r12)
        L58:
            return r2
    }

    private final boolean tryEmitNoCollectorsLocked(T r7) {
            r6 = this;
            boolean r0 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            r1 = 1
            if (r0 == 0) goto L1a
            r0 = 0
            int r2 = r6.getNCollectors()
            if (r2 != 0) goto L10
            r2 = r1
            goto L11
        L10:
            r2 = 0
        L11:
            if (r2 == 0) goto L14
            goto L1a
        L14:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L1a:
            int r0 = r6.replay
            if (r0 != 0) goto L1f
            return r1
        L1f:
            r6.enqueueLocked(r7)
            int r0 = r6.bufferSize
            int r0 = r0 + r1
            r6.bufferSize = r0
            int r0 = r6.bufferSize
            int r2 = r6.replay
            if (r0 <= r2) goto L30
            r6.dropOldestLocked()
        L30:
            long r2 = r6.getHead()
            int r0 = r6.bufferSize
            long r4 = (long) r0
            long r2 = r2 + r4
            r6.minCollectorIndex = r2
            return r1
    }

    private final long tryPeekLocked(kotlinx.coroutines.flow.SharedFlowSlot r8) {
            r7 = this;
            long r0 = r8.index
            long r2 = r7.getBufferEndIndex()
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 >= 0) goto Lb
            return r0
        Lb:
            int r2 = r7.bufferCapacity
            r3 = -1
            if (r2 <= 0) goto L12
            return r3
        L12:
            long r5 = r7.getHead()
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 <= 0) goto L1b
            return r3
        L1b:
            int r2 = r7.queueSize
            if (r2 != 0) goto L20
            return r3
        L20:
            return r0
    }

    private final java.lang.Object tryTakeValue(kotlinx.coroutines.flow.SharedFlowSlot r12) {
            r11 = this;
            r0 = 0
            kotlin.coroutines.Continuation<kotlin.Unit>[] r0 = kotlinx.coroutines.flow.internal.AbstractSharedFlowKt.EMPTY_RESUMES
            r1 = 0
            r2 = 0
            monitor-enter(r11)
            r3 = 0
            long r4 = r11.tryPeekLocked(r12)     // Catch: java.lang.Throwable -> L41
            r6 = 0
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 >= 0) goto L15
            kotlinx.coroutines.internal.Symbol r6 = kotlinx.coroutines.flow.SharedFlowKt.NO_VALUE     // Catch: java.lang.Throwable -> L41
            goto L26
        L15:
            long r6 = r12.index     // Catch: java.lang.Throwable -> L41
            java.lang.Object r8 = r11.getPeekedValueLockedAt(r4)     // Catch: java.lang.Throwable -> L41
            r9 = 1
            long r9 = r9 + r4
            r12.index = r9     // Catch: java.lang.Throwable -> L41
            kotlin.coroutines.Continuation[] r9 = r11.updateCollectorIndexLocked$kotlinx_coroutines_core(r6)     // Catch: java.lang.Throwable -> L41
            r0 = r9
            r6 = r8
        L26:
            monitor-exit(r11)
            int r1 = r0.length
            r2 = 0
        L2c:
            if (r2 >= r1) goto L40
            r3 = r0[r2]
            if (r3 == 0) goto L3d
            kotlin.Result$Companion r4 = kotlin.Result.Companion
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            java.lang.Object r4 = kotlin.Result.m153constructorimpl(r4)
            r3.resumeWith(r4)
        L3d:
            int r2 = r2 + 1
            goto L2c
        L40:
            return r6
        L41:
            r3 = move-exception
            monitor-exit(r11)
            throw r3
    }

    private final void updateBufferLocked(long r17, long r19, long r21, long r23) {
            r16 = this;
            r0 = r16
            r1 = r17
            r3 = r19
            long r5 = java.lang.Math.min(r3, r1)
            boolean r7 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            r8 = 1
            r9 = 0
            if (r7 == 0) goto L27
            r7 = 0
            long r10 = r0.getHead()
            int r10 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r10 < 0) goto L1d
            r7 = r8
            goto L1e
        L1d:
            r7 = r9
        L1e:
            if (r7 == 0) goto L21
            goto L27
        L21:
            java.lang.AssertionError r7 = new java.lang.AssertionError
            r7.<init>()
            throw r7
        L27:
            long r10 = r0.getHead()
        L2b:
            int r7 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r7 >= 0) goto L3c
            java.lang.Object[] r7 = r0.buffer
            kotlin.jvm.internal.Intrinsics.checkNotNull(r7)
            r12 = 0
            kotlinx.coroutines.flow.SharedFlowKt.access$setBufferAt(r7, r10, r12)
            r12 = 1
            long r10 = r10 + r12
            goto L2b
        L3c:
            r0.replayIndex = r1
            r0.minCollectorIndex = r3
            long r10 = r21 - r5
            int r7 = (int) r10
            r0.bufferSize = r7
            long r10 = r23 - r21
            int r7 = (int) r10
            r0.queueSize = r7
            boolean r7 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            if (r7 == 0) goto L61
            r7 = 0
            int r10 = r0.bufferSize
            if (r10 < 0) goto L57
            r7 = r8
            goto L58
        L57:
            r7 = r9
        L58:
            if (r7 == 0) goto L5b
            goto L61
        L5b:
            java.lang.AssertionError r7 = new java.lang.AssertionError
            r7.<init>()
            throw r7
        L61:
            boolean r7 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            if (r7 == 0) goto L78
            r7 = 0
            int r10 = r0.queueSize
            if (r10 < 0) goto L6e
            r7 = r8
            goto L6f
        L6e:
            r7 = r9
        L6f:
            if (r7 == 0) goto L72
            goto L78
        L72:
            java.lang.AssertionError r7 = new java.lang.AssertionError
            r7.<init>()
            throw r7
        L78:
            boolean r7 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            if (r7 == 0) goto L98
            r7 = 0
            long r10 = r0.replayIndex
            long r12 = r0.getHead()
            int r14 = r0.bufferSize
            long r14 = (long) r14
            long r12 = r12 + r14
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 > 0) goto L8e
            goto L8f
        L8e:
            r8 = r9
        L8f:
            if (r8 == 0) goto L92
            goto L98
        L92:
            java.lang.AssertionError r7 = new java.lang.AssertionError
            r7.<init>()
            throw r7
        L98:
            return
    }

    @Override // kotlinx.coroutines.flow.SharedFlow, kotlinx.coroutines.flow.Flow
    public java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super T> r2, kotlin.coroutines.Continuation<?> r3) {
            r1 = this;
            java.lang.Object r0 = collect$suspendImpl(r1, r2, r3)
            return r0
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractSharedFlow
    protected kotlinx.coroutines.flow.SharedFlowSlot createSlot() {
            r1 = this;
            kotlinx.coroutines.flow.SharedFlowSlot r0 = new kotlinx.coroutines.flow.SharedFlowSlot
            r0.<init>()
            return r0
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractSharedFlow
    public /* bridge */ /* synthetic */ kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot createSlot() {
            r1 = this;
            kotlinx.coroutines.flow.SharedFlowSlot r0 = r1.createSlot()
            kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot r0 = (kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot) r0
            return r0
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractSharedFlow
    protected kotlinx.coroutines.flow.SharedFlowSlot[] createSlotArray(int r2) {
            r1 = this;
            kotlinx.coroutines.flow.SharedFlowSlot[] r0 = new kotlinx.coroutines.flow.SharedFlowSlot[r2]
            return r0
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractSharedFlow
    public /* bridge */ /* synthetic */ kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot[] createSlotArray(int r2) {
            r1 = this;
            kotlinx.coroutines.flow.SharedFlowSlot[] r0 = r1.createSlotArray(r2)
            kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot[] r0 = (kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot[]) r0
            return r0
    }

    @Override // kotlinx.coroutines.flow.MutableSharedFlow, kotlinx.coroutines.flow.FlowCollector
    public java.lang.Object emit(T r2, kotlin.coroutines.Continuation<? super kotlin.Unit> r3) {
            r1 = this;
            java.lang.Object r0 = emit$suspendImpl(r1, r2, r3)
            return r0
    }

    @Override // kotlinx.coroutines.flow.internal.FusibleFlow
    public kotlinx.coroutines.flow.Flow<T> fuse(kotlin.coroutines.CoroutineContext r2, int r3, kotlinx.coroutines.channels.BufferOverflow r4) {
            r1 = this;
            r0 = r1
            kotlinx.coroutines.flow.SharedFlow r0 = (kotlinx.coroutines.flow.SharedFlow) r0
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.SharedFlowKt.fuseSharedFlow(r0, r2, r3, r4)
            return r0
    }

    protected final T getLastReplayedLocked() {
            r5 = this;
            java.lang.Object[] r0 = r5.buffer
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            long r1 = r5.replayIndex
            int r3 = r5.getReplaySize()
            long r3 = (long) r3
            long r1 = r1 + r3
            r3 = 1
            long r1 = r1 - r3
            java.lang.Object r0 = kotlinx.coroutines.flow.SharedFlowKt.access$getBufferAt(r0, r1)
            return r0
    }

    @Override // kotlinx.coroutines.flow.SharedFlow
    public java.util.List<T> getReplayCache() {
            r12 = this;
            r0 = 0
            r1 = 0
            monitor-enter(r12)
            r2 = 0
            int r3 = r12.getReplaySize()     // Catch: java.lang.Throwable -> L36
            if (r3 != 0) goto L11
            java.util.List r4 = kotlin.collections.CollectionsKt.emptyList()     // Catch: java.lang.Throwable -> L36
            monitor-exit(r12)
            return r4
        L11:
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L36
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L36
            java.lang.Object[] r5 = r12.buffer     // Catch: java.lang.Throwable -> L36
            kotlin.jvm.internal.Intrinsics.checkNotNull(r5)     // Catch: java.lang.Throwable -> L36
            r6 = 0
        L1c:
            if (r6 >= r3) goto L2f
            r7 = r4
            java.util.Collection r7 = (java.util.Collection) r7     // Catch: java.lang.Throwable -> L36
            long r8 = r12.replayIndex     // Catch: java.lang.Throwable -> L36
            long r10 = (long) r6     // Catch: java.lang.Throwable -> L36
            long r8 = r8 + r10
            java.lang.Object r8 = kotlinx.coroutines.flow.SharedFlowKt.access$getBufferAt(r5, r8)     // Catch: java.lang.Throwable -> L36
            r7.add(r8)     // Catch: java.lang.Throwable -> L36
            int r6 = r6 + 1
            goto L1c
        L2f:
            monitor-exit(r12)
            r0 = r4
            java.util.List r0 = (java.util.List) r0
            return r0
        L36:
            r2 = move-exception
            monitor-exit(r12)
            throw r2
    }

    @Override // kotlinx.coroutines.flow.MutableSharedFlow
    public void resetReplayCache() {
            r12 = this;
            r1 = 0
            r2 = 0
            monitor-enter(r12)
            r0 = 0
            long r4 = r12.getBufferEndIndex()     // Catch: java.lang.Throwable -> L20
            long r6 = r12.minCollectorIndex     // Catch: java.lang.Throwable -> L20
            long r8 = r12.getBufferEndIndex()     // Catch: java.lang.Throwable -> L20
            long r10 = r12.getQueueEndIndex()     // Catch: java.lang.Throwable -> L20
            r3 = r12
            r3.updateBufferLocked(r4, r6, r8, r10)     // Catch: java.lang.Throwable -> L1e
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L1e
            monitor-exit(r12)
            return
        L1e:
            r0 = move-exception
            goto L22
        L20:
            r0 = move-exception
            r3 = r12
        L22:
            monitor-exit(r12)
            throw r0
    }

    @Override // kotlinx.coroutines.flow.MutableSharedFlow
    public boolean tryEmit(T r7) {
            r6 = this;
            r0 = 0
            kotlin.coroutines.Continuation<kotlin.Unit>[] r0 = kotlinx.coroutines.flow.internal.AbstractSharedFlowKt.EMPTY_RESUMES
            r1 = 0
            r2 = 0
            monitor-enter(r6)
            r3 = 0
            boolean r4 = r6.tryEmitLocked(r7)     // Catch: java.lang.Throwable -> L31
            r5 = 0
            if (r4 == 0) goto L16
            kotlin.coroutines.Continuation[] r4 = r6.findSlotsToResumeLocked(r0)     // Catch: java.lang.Throwable -> L31
            r0 = r4
            r4 = 1
            goto L17
        L16:
            r4 = r5
        L17:
            monitor-exit(r6)
            int r1 = r0.length
        L1c:
            if (r5 >= r1) goto L30
            r2 = r0[r5]
            if (r2 == 0) goto L2d
            kotlin.Result$Companion r3 = kotlin.Result.Companion
            kotlin.Unit r3 = kotlin.Unit.INSTANCE
            java.lang.Object r3 = kotlin.Result.m153constructorimpl(r3)
            r2.resumeWith(r3)
        L2d:
            int r5 = r5 + 1
            goto L1c
        L30:
            return r4
        L31:
            r3 = move-exception
            monitor-exit(r6)
            throw r3
    }

    public final kotlin.coroutines.Continuation<kotlin.Unit>[] updateCollectorIndexLocked$kotlinx_coroutines_core(long r26) {
            r25 = this;
            r0 = r25
            boolean r1 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            if (r1 == 0) goto L1b
            r1 = 0
            long r2 = r0.minCollectorIndex
            int r2 = (r26 > r2 ? 1 : (r26 == r2 ? 0 : -1))
            if (r2 < 0) goto L11
            r1 = 1
            goto L12
        L11:
            r1 = 0
        L12:
            if (r1 == 0) goto L15
            goto L1b
        L15:
            java.lang.AssertionError r1 = new java.lang.AssertionError
            r1.<init>()
            throw r1
        L1b:
            long r1 = r0.minCollectorIndex
            int r1 = (r26 > r1 ? 1 : (r26 == r1 ? 0 : -1))
            if (r1 <= 0) goto L24
            kotlin.coroutines.Continuation<kotlin.Unit>[] r1 = kotlinx.coroutines.flow.internal.AbstractSharedFlowKt.EMPTY_RESUMES
            return r1
        L24:
            long r11 = r0.getHead()
            r1 = 0
            int r3 = r0.bufferSize
            long r3 = (long) r3
            long r3 = r3 + r11
            int r1 = r0.bufferCapacity
            r5 = 1
            if (r1 != 0) goto L39
            int r1 = r0.queueSize
            if (r1 <= 0) goto L39
            long r3 = r3 + r5
        L39:
            r1 = r0
            kotlinx.coroutines.flow.internal.AbstractSharedFlow r1 = (kotlinx.coroutines.flow.internal.AbstractSharedFlow) r1
            r2 = 0
            int r7 = kotlinx.coroutines.flow.internal.AbstractSharedFlow.access$getNCollectors(r1)
            if (r7 == 0) goto L7f
            kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot[] r7 = kotlinx.coroutines.flow.internal.AbstractSharedFlow.access$getSlots(r1)
            if (r7 == 0) goto L7c
            r8 = 0
            int r13 = r7.length
            r14 = 0
        L4c:
            if (r14 >= r13) goto L79
            r15 = r7[r14]
            r16 = r15
            r17 = 0
            if (r16 == 0) goto L6f
            r18 = r5
            r5 = r16
            kotlinx.coroutines.flow.SharedFlowSlot r5 = (kotlinx.coroutines.flow.SharedFlowSlot) r5
            r6 = 0
            long r9 = r5.index
            r21 = 0
            int r9 = (r9 > r21 ? 1 : (r9 == r21 ? 0 : -1))
            if (r9 < 0) goto L6d
            long r9 = r5.index
            int r9 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r9 >= 0) goto L6d
            long r3 = r5.index
        L6d:
            goto L71
        L6f:
            r18 = r5
        L71:
            int r14 = r14 + 1
            r5 = r18
            goto L4c
        L79:
            r18 = r5
            goto L7e
        L7c:
            r18 = r5
        L7e:
            goto L81
        L7f:
            r18 = r5
        L81:
            boolean r1 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            if (r1 == 0) goto L9a
            r1 = 0
            long r5 = r0.minCollectorIndex
            int r2 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r2 < 0) goto L90
            r1 = 1
            goto L91
        L90:
            r1 = 0
        L91:
            if (r1 == 0) goto L94
            goto L9a
        L94:
            java.lang.AssertionError r1 = new java.lang.AssertionError
            r1.<init>()
            throw r1
        L9a:
            long r1 = r0.minCollectorIndex
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 > 0) goto La3
            kotlin.coroutines.Continuation<kotlin.Unit>[] r1 = kotlinx.coroutines.flow.internal.AbstractSharedFlowKt.EMPTY_RESUMES
            return r1
        La3:
            long r1 = r0.getBufferEndIndex()
            int r5 = r0.getNCollectors()
            if (r5 <= 0) goto Lba
            long r5 = r1 - r3
            int r5 = (int) r5
            int r6 = r0.queueSize
            int r7 = r0.bufferCapacity
            int r7 = r7 - r5
            int r5 = java.lang.Math.min(r6, r7)
            goto Lbc
        Lba:
            int r5 = r0.queueSize
        Lbc:
            r9 = r5
            kotlin.coroutines.Continuation<kotlin.Unit>[] r5 = kotlinx.coroutines.flow.internal.AbstractSharedFlowKt.EMPTY_RESUMES
            int r6 = r0.queueSize
            long r6 = (long) r6
            long r7 = r1 + r6
            if (r9 <= 0) goto L10c
            kotlin.coroutines.Continuation[] r5 = new kotlin.coroutines.Continuation[r9]
            r6 = 0
            java.lang.Object[] r10 = r0.buffer
            kotlin.jvm.internal.Intrinsics.checkNotNull(r10)
            r13 = r1
        Lcf:
            int r15 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r15 >= 0) goto L108
            java.lang.Object r15 = kotlinx.coroutines.flow.SharedFlowKt.access$getBufferAt(r10, r13)
            r16 = r3
            kotlinx.coroutines.internal.Symbol r3 = kotlinx.coroutines.flow.SharedFlowKt.NO_VALUE
            if (r15 == r3) goto L103
            java.lang.String r3 = "null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r15, r3)
            r3 = r15
            kotlinx.coroutines.flow.SharedFlowImpl$Emitter r3 = (kotlinx.coroutines.flow.SharedFlowImpl.Emitter) r3
            int r3 = r6 + 1
            r4 = r15
            kotlinx.coroutines.flow.SharedFlowImpl$Emitter r4 = (kotlinx.coroutines.flow.SharedFlowImpl.Emitter) r4
            kotlin.coroutines.Continuation<kotlin.Unit> r4 = r4.cont
            r5[r6] = r4
            kotlinx.coroutines.internal.Symbol r4 = kotlinx.coroutines.flow.SharedFlowKt.NO_VALUE
            kotlinx.coroutines.flow.SharedFlowKt.access$setBufferAt(r10, r13, r4)
            r4 = r15
            kotlinx.coroutines.flow.SharedFlowImpl$Emitter r4 = (kotlinx.coroutines.flow.SharedFlowImpl.Emitter) r4
            java.lang.Object r4 = r4.value
            kotlinx.coroutines.flow.SharedFlowKt.access$setBufferAt(r10, r1, r4)
            long r1 = r1 + r18
            if (r3 >= r9) goto L101
            r6 = r3
            goto L103
        L101:
            r10 = r5
            goto L10f
        L103:
            long r13 = r13 + r18
            r3 = r16
            goto Lcf
        L108:
            r16 = r3
            r10 = r5
            goto L10f
        L10c:
            r16 = r3
            r10 = r5
        L10f:
            long r3 = r1 - r11
            int r13 = (int) r3
            int r3 = r0.getNCollectors()
            if (r3 != 0) goto L11a
            r3 = r1
            goto L11c
        L11a:
            r3 = r16
        L11c:
            long r5 = r0.replayIndex
            int r14 = r0.replay
            int r14 = java.lang.Math.min(r14, r13)
            long r14 = (long) r14
            long r14 = r1 - r14
            long r5 = java.lang.Math.max(r5, r14)
            int r14 = r0.bufferCapacity
            if (r14 != 0) goto L14e
            int r14 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r14 >= 0) goto L14e
            java.lang.Object[] r14 = r0.buffer
            kotlin.jvm.internal.Intrinsics.checkNotNull(r14)
            java.lang.Object r14 = kotlinx.coroutines.flow.SharedFlowKt.access$getBufferAt(r14, r5)
            kotlinx.coroutines.internal.Symbol r15 = kotlinx.coroutines.flow.SharedFlowKt.NO_VALUE
            boolean r14 = kotlin.jvm.internal.Intrinsics.areEqual(r14, r15)
            if (r14 == 0) goto L14e
            long r1 = r1 + r18
            long r5 = r5 + r18
            r23 = r5
            r5 = r1
            r1 = r23
            goto L153
        L14e:
            r23 = r5
            r5 = r1
            r1 = r23
        L153:
            r0.updateBufferLocked(r1, r3, r5, r7)
            r0.cleanupTailLocked()
            int r14 = r10.length
            if (r14 != 0) goto L15f
            r20 = 1
            goto L161
        L15f:
            r20 = 0
        L161:
            if (r20 != 0) goto L167
            kotlin.coroutines.Continuation[] r10 = r0.findSlotsToResumeLocked(r10)
        L167:
            return r10
    }

    public final long updateNewCollectorIndexLocked$kotlinx_coroutines_core() {
            r4 = this;
            long r0 = r4.replayIndex
            long r2 = r4.minCollectorIndex
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 >= 0) goto La
            r4.minCollectorIndex = r0
        La:
            return r0
    }
}
