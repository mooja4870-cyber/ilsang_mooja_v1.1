package kotlinx.coroutines.scheduling;

/* JADX INFO: compiled from: CoroutineScheduler.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b!\b\u0000\u0018\u0000 I2\u00020\u00012\u00020\u0002:\u0003IJKB)\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0010\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020 H\u0002J\u0011\u0010\r\u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u0007H\u0086\bJ\u0011\u0010\"\u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u0007H\u0082\bJ\b\u0010#\u001a\u00020$H\u0016J\b\u0010%\u001a\u00020\u0004H\u0002J\u001a\u0010&\u001a\u00020 2\n\u0010'\u001a\u00060(j\u0002`)2\u0006\u0010*\u001a\u00020+J\u0011\u0010\u0012\u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u0007H\u0082\bJ\u000e\u0010,\u001a\b\u0018\u00010\u001dR\u00020\u0000H\u0002J\t\u0010-\u001a\u00020$H\u0082\bJ\t\u0010.\u001a\u00020\u0004H\u0082\bJ&\u0010/\u001a\u00020$2\n\u0010'\u001a\u00060(j\u0002`)2\b\b\u0002\u0010*\u001a\u00020+2\b\b\u0002\u00100\u001a\u00020\u0018J\u0014\u00101\u001a\u00020$2\n\u00102\u001a\u00060(j\u0002`)H\u0016J\t\u00103\u001a\u00020\u0007H\u0082\bJ\t\u00104\u001a\u00020\u0004H\u0082\bJ\u0014\u00105\u001a\u00020\u00042\n\u00106\u001a\u00060\u001dR\u00020\u0000H\u0002J\u000e\u00107\u001a\b\u0018\u00010\u001dR\u00020\u0000H\u0002J\u0012\u00108\u001a\u00020\u00182\n\u00106\u001a\u00060\u001dR\u00020\u0000J\"\u00109\u001a\u00020$2\n\u00106\u001a\u00060\u001dR\u00020\u00002\u0006\u0010:\u001a\u00020\u00042\u0006\u0010;\u001a\u00020\u0004J\t\u0010<\u001a\u00020\u0007H\u0082\bJ\u000e\u0010=\u001a\u00020$2\u0006\u0010\u001f\u001a\u00020 J\u000e\u0010>\u001a\u00020$2\u0006\u0010?\u001a\u00020\u0007J\u0018\u0010@\u001a\u00020$2\u0006\u0010A\u001a\u00020\u00072\u0006\u0010B\u001a\u00020\u0018H\u0002J\u0006\u0010C\u001a\u00020$J\b\u0010D\u001a\u00020\tH\u0016J\t\u0010E\u001a\u00020\u0018H\u0082\bJ\u0012\u0010F\u001a\u00020\u00182\b\b\u0002\u0010!\u001a\u00020\u0007H\u0002J\b\u0010G\u001a\u00020\u0018H\u0002J$\u0010H\u001a\u0004\u0018\u00010 *\b\u0018\u00010\u001dR\u00020\u00002\u0006\u0010\u001f\u001a\u00020 2\u0006\u00100\u001a\u00020\u0018H\u0002R\t\u0010\u000b\u001a\u00020\fX\u0082\u0004R\u0015\u0010\r\u001a\u00020\u00048Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\t\u0010\u0010\u001a\u00020\u0011X\u0082\u0004R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0015\u0010\u0012\u001a\u00020\u00048Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u000fR\u0010\u0010\u0014\u001a\u00020\u00158\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u00020\u00158\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0017\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0019R\u0010\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\t\u0010\u001a\u001a\u00020\u0011X\u0082\u0004R\u0010\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001b\u001a\f\u0012\b\u0012\u00060\u001dR\u00020\u00000\u001c8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006L"}, d2 = {"Lkotlinx/coroutines/scheduling/CoroutineScheduler;", "Ljava/util/concurrent/Executor;", "Ljava/io/Closeable;", "corePoolSize", "", "maxPoolSize", "idleWorkerKeepAliveNs", "", "schedulerName", "", "(IIJLjava/lang/String;)V", "_isTerminated", "Lkotlinx/atomicfu/AtomicBoolean;", "availableCpuPermits", "getAvailableCpuPermits", "()I", "controlState", "Lkotlinx/atomicfu/AtomicLong;", "createdWorkers", "getCreatedWorkers", "globalBlockingQueue", "Lkotlinx/coroutines/scheduling/GlobalQueue;", "globalCpuQueue", "isTerminated", "", "()Z", "parkedWorkersStack", "workers", "Lkotlinx/coroutines/internal/ResizableAtomicArray;", "Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;", "addToGlobalQueue", "task", "Lkotlinx/coroutines/scheduling/Task;", "state", "blockingTasks", "close", "", "createNewWorker", "createTask", "block", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "taskContext", "Lkotlinx/coroutines/scheduling/TaskContext;", "currentWorker", "decrementBlockingTasks", "decrementCreatedWorkers", "dispatch", "tailDispatch", "execute", "command", "incrementBlockingTasks", "incrementCreatedWorkers", "parkedWorkersStackNextIndex", "worker", "parkedWorkersStackPop", "parkedWorkersStackPush", "parkedWorkersStackTopUpdate", "oldIndex", "newIndex", "releaseCpuPermit", "runSafely", "shutdown", "timeout", "signalBlockingWork", "stateSnapshot", "skipUnpark", "signalCpuWork", "toString", "tryAcquireCpuPermit", "tryCreateWorker", "tryUnpark", "submitToLocalQueue", "Companion", "Worker", "WorkerState", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class CoroutineScheduler implements java.util.concurrent.Executor, java.io.Closeable {
    private static final long BLOCKING_MASK = 4398044413952L;
    private static final int BLOCKING_SHIFT = 21;
    private static final int CLAIMED = 0;
    private static final long CPU_PERMITS_MASK = 9223367638808264704L;
    private static final int CPU_PERMITS_SHIFT = 42;
    private static final long CREATED_MASK = 2097151;
    public static final kotlinx.coroutines.scheduling.CoroutineScheduler.Companion Companion = null;
    public static final int MAX_SUPPORTED_POOL_SIZE = 2097150;
    public static final int MIN_SUPPORTED_POOL_SIZE = 1;
    public static final kotlinx.coroutines.internal.Symbol NOT_IN_STACK = null;
    private static final int PARKED = -1;
    private static final long PARKED_INDEX_MASK = 2097151;
    private static final long PARKED_VERSION_INC = 2097152;
    private static final long PARKED_VERSION_MASK = -2097152;
    private static final int TERMINATED = 1;
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater _isTerminated$volatile$FU = null;
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicLongFieldUpdater controlState$volatile$FU = null;
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicLongFieldUpdater parkedWorkersStack$volatile$FU = null;
    private volatile /* synthetic */ int _isTerminated$volatile;
    private volatile /* synthetic */ long controlState$volatile;
    public final int corePoolSize;
    public final kotlinx.coroutines.scheduling.GlobalQueue globalBlockingQueue;
    public final kotlinx.coroutines.scheduling.GlobalQueue globalCpuQueue;
    public final long idleWorkerKeepAliveNs;
    public final int maxPoolSize;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;
    public final java.lang.String schedulerName;
    public final kotlinx.coroutines.internal.ResizableAtomicArray<kotlinx.coroutines.scheduling.CoroutineScheduler.Worker> workers;

    /* JADX INFO: compiled from: CoroutineScheduler.kt */
    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0006X\u0080T¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lkotlinx/coroutines/scheduling/CoroutineScheduler$Companion;", "", "()V", "BLOCKING_MASK", "", "BLOCKING_SHIFT", "", "CLAIMED", "CPU_PERMITS_MASK", "CPU_PERMITS_SHIFT", "CREATED_MASK", "MAX_SUPPORTED_POOL_SIZE", "MIN_SUPPORTED_POOL_SIZE", "NOT_IN_STACK", "Lkotlinx/coroutines/internal/Symbol;", "PARKED", "PARKED_INDEX_MASK", "PARKED_VERSION_INC", "PARKED_VERSION_MASK", "TERMINATED", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
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
    }

    /* JADX INFO: compiled from: CoroutineScheduler.kt */
    @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;

        static {
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState[] r0 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r1 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.PARKING     // Catch: java.lang.NoSuchFieldError -> L11
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L11
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L11
                goto L12
            L11:
                r1 = move-exception
            L12:
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r1 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.BLOCKING     // Catch: java.lang.NoSuchFieldError -> L1c
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1c
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1c
                goto L1d
            L1c:
                r1 = move-exception
            L1d:
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r1 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.CPU_ACQUIRED     // Catch: java.lang.NoSuchFieldError -> L27
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L27
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L27
                goto L28
            L27:
                r1 = move-exception
            L28:
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r1 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.DORMANT     // Catch: java.lang.NoSuchFieldError -> L32
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L32
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L32
                goto L33
            L32:
                r1 = move-exception
            L33:
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r1 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.TERMINATED     // Catch: java.lang.NoSuchFieldError -> L3d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3d
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3d
                goto L3e
            L3d:
                r1 = move-exception
            L3e:
                kotlinx.coroutines.scheduling.CoroutineScheduler.WhenMappings.$EnumSwitchMapping$0 = r0
                return
        }
    }

    /* JADX INFO: compiled from: CoroutineScheduler.kt */
    @kotlin.Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\u0004\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0007\b\u0002¢\u0006\u0002\u0010\u0005J\u0010\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u0003H\u0002J\u0010\u0010'\u001a\u00020%2\u0006\u0010&\u001a\u00020\u0003H\u0002J\u0010\u0010(\u001a\u00020%2\u0006\u0010)\u001a\u00020 H\u0002J\u0012\u0010*\u001a\u0004\u0018\u00010 2\u0006\u0010+\u001a\u00020\u000eH\u0002J\n\u0010,\u001a\u0004\u0018\u00010 H\u0002J\n\u0010-\u001a\u0004\u0018\u00010 H\u0002J\u0010\u0010.\u001a\u0004\u0018\u00010 2\u0006\u0010\r\u001a\u00020\u000eJ\u0010\u0010/\u001a\u00020%2\u0006\u00100\u001a\u00020\u0003H\u0002J\b\u00101\u001a\u00020\u000eH\u0002J\u0006\u00102\u001a\u00020\u000eJ\u000e\u00103\u001a\u00020\u00032\u0006\u00104\u001a\u00020\u0003J\b\u00105\u001a\u00020%H\u0002J\n\u00106\u001a\u0004\u0018\u00010 H\u0002J\b\u00107\u001a\u00020%H\u0016J\u0006\u00108\u001a\u00020\u0010J\b\u00109\u001a\u00020%H\u0002J\b\u0010:\u001a\u00020\u000eH\u0002J\b\u0010;\u001a\u00020%H\u0002J\u000e\u0010<\u001a\u00020\u000e2\u0006\u0010=\u001a\u00020\u001dJ\u0016\u0010>\u001a\u0004\u0018\u00010 2\n\u0010?\u001a\u00060\u0003j\u0002`@H\u0002J\b\u0010A\u001a\u00020%H\u0002R$\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0003@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0010\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\r\u001a\u00020\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0017\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0018\u001a\u00020\u00198Æ\u0002¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0012\u0010\u001c\u001a\u00020\u001d8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u001fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0006\u0010\"\u001a\u00020#¨\u0006B"}, d2 = {"Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;", "Ljava/lang/Thread;", "index", "", "(Lkotlinx/coroutines/scheduling/CoroutineScheduler;I)V", "(Lkotlinx/coroutines/scheduling/CoroutineScheduler;)V", "indexInArray", "getIndexInArray", "()I", "setIndexInArray", "(I)V", "localQueue", "Lkotlinx/coroutines/scheduling/WorkQueue;", "mayHaveLocalTasks", "", "minDelayUntilStealableTaskNs", "", "nextParkedWorker", "", "getNextParkedWorker", "()Ljava/lang/Object;", "setNextParkedWorker", "(Ljava/lang/Object;)V", "rngState", "scheduler", "Lkotlinx/coroutines/scheduling/CoroutineScheduler;", "getScheduler", "()Lkotlinx/coroutines/scheduling/CoroutineScheduler;", "state", "Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;", "stolenTask", "Lkotlin/jvm/internal/Ref$ObjectRef;", "Lkotlinx/coroutines/scheduling/Task;", "terminationDeadline", "workerCtl", "Lkotlinx/atomicfu/AtomicInt;", "afterTask", "", "taskMode", "beforeTask", "executeTask", "task", "findAnyTask", "scanLocalQueue", "findBlockingTask", "findCpuTask", "findTask", "idleReset", "mode", "inStack", "isIo", "nextInt", "upperBound", "park", "pollGlobalQueues", "run", "runSingleTask", "runWorker", "tryAcquireCpuPermit", "tryPark", "tryReleaseCpu", "newState", "trySteal", "stealingMode", "Lkotlinx/coroutines/scheduling/StealingMode;", "tryTerminateWorker", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class Worker extends java.lang.Thread {
        private static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater workerCtl$volatile$FU = null;
        private volatile int indexInArray;
        public final kotlinx.coroutines.scheduling.WorkQueue localQueue;
        public boolean mayHaveLocalTasks;
        private long minDelayUntilStealableTaskNs;
        private volatile java.lang.Object nextParkedWorker;
        private int rngState;
        public kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState state;
        private final kotlin.jvm.internal.Ref.ObjectRef<kotlinx.coroutines.scheduling.Task> stolenTask;
        private long terminationDeadline;
        final /* synthetic */ kotlinx.coroutines.scheduling.CoroutineScheduler this$0;
        private volatile /* synthetic */ int workerCtl$volatile;

        static {
                java.lang.Class<kotlinx.coroutines.scheduling.CoroutineScheduler$Worker> r0 = kotlinx.coroutines.scheduling.CoroutineScheduler.Worker.class
                java.lang.String r1 = "workerCtl$volatile"
                java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r0, r1)
                kotlinx.coroutines.scheduling.CoroutineScheduler.Worker.workerCtl$volatile$FU = r0
                return
        }

        private Worker(kotlinx.coroutines.scheduling.CoroutineScheduler r5) {
                r4 = this;
                r4.this$0 = r5
                r4.<init>()
                r0 = 1
                r4.setDaemon(r0)
                kotlinx.coroutines.scheduling.CoroutineScheduler r0 = r4.this$0
                java.lang.Class r0 = r0.getClass()
                java.lang.ClassLoader r0 = r0.getClassLoader()
                r4.setContextClassLoader(r0)
                kotlinx.coroutines.scheduling.WorkQueue r0 = new kotlinx.coroutines.scheduling.WorkQueue
                r0.<init>()
                r4.localQueue = r0
                kotlin.jvm.internal.Ref$ObjectRef r0 = new kotlin.jvm.internal.Ref$ObjectRef
                r0.<init>()
                r4.stolenTask = r0
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r0 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.DORMANT
                r4.state = r0
                kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.scheduling.CoroutineScheduler.NOT_IN_STACK
                r4.nextParkedWorker = r0
                r0 = r4
                kotlinx.coroutines.scheduling.CoroutineScheduler$Worker r0 = (kotlinx.coroutines.scheduling.CoroutineScheduler.Worker) r0
                r1 = 0
                long r2 = java.lang.System.nanoTime()
                int r2 = (int) r2
                if (r2 == 0) goto L3a
                goto L3d
            L3a:
                r3 = 42
                r2 = r3
            L3d:
                r4.rngState = r2
                return
        }

        public Worker(kotlinx.coroutines.scheduling.CoroutineScheduler r1, int r2) {
                r0 = this;
                r0.<init>(r1)
                r0.setIndexInArray(r2)
                return
        }

        public static final /* synthetic */ kotlinx.coroutines.scheduling.CoroutineScheduler access$getThis$0$p(kotlinx.coroutines.scheduling.CoroutineScheduler.Worker r1) {
                kotlinx.coroutines.scheduling.CoroutineScheduler r0 = r1.this$0
                return r0
        }

        private final void afterTask(int r6) {
                r5 = this;
                if (r6 != 0) goto L3
                return
            L3:
                kotlinx.coroutines.scheduling.CoroutineScheduler r0 = r5.this$0
                r1 = 0
                java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = kotlinx.coroutines.scheduling.CoroutineScheduler.access$getControlState$volatile$FU()
                r3 = -2097152(0xffffffffffe00000, double:NaN)
                r2.addAndGet(r0, r3)
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r0 = r5.state
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r1 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.TERMINATED
                if (r0 == r1) goto L32
                boolean r1 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
                if (r1 == 0) goto L2e
                r1 = 0
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r2 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.BLOCKING
                if (r0 != r2) goto L24
                r2 = 1
                goto L25
            L24:
                r2 = 0
            L25:
                if (r2 == 0) goto L28
                goto L2e
            L28:
                java.lang.AssertionError r1 = new java.lang.AssertionError
                r1.<init>()
                throw r1
            L2e:
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r1 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.DORMANT
                r5.state = r1
            L32:
                return
        }

        private final void beforeTask(int r2) {
                r1 = this;
                if (r2 != 0) goto L3
                return
            L3:
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r0 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.BLOCKING
                boolean r0 = r1.tryReleaseCpu(r0)
                if (r0 == 0) goto L10
                kotlinx.coroutines.scheduling.CoroutineScheduler r0 = r1.this$0
                r0.signalCpuWork()
            L10:
                return
        }

        private final void executeTask(kotlinx.coroutines.scheduling.Task r4) {
                r3 = this;
                r0 = r4
                r1 = 0
                kotlinx.coroutines.scheduling.TaskContext r2 = r0.taskContext
                int r0 = r2.getTaskMode()
                r3.idleReset(r0)
                r3.beforeTask(r0)
                kotlinx.coroutines.scheduling.CoroutineScheduler r1 = r3.this$0
                r1.runSafely(r4)
                r3.afterTask(r0)
                return
        }

        private final kotlinx.coroutines.scheduling.Task findAnyTask(boolean r4) {
                r3 = this;
                if (r4 == 0) goto L2f
                kotlinx.coroutines.scheduling.CoroutineScheduler r0 = r3.this$0
                int r0 = r0.corePoolSize
                int r0 = r0 * 2
                int r0 = r3.nextInt(r0)
                if (r0 != 0) goto L10
                r0 = 1
                goto L11
            L10:
                r0 = 0
            L11:
                if (r0 == 0) goto L1b
                kotlinx.coroutines.scheduling.Task r1 = r3.pollGlobalQueues()
                if (r1 == 0) goto L1b
                r2 = 0
                return r1
            L1b:
                kotlinx.coroutines.scheduling.WorkQueue r1 = r3.localQueue
                kotlinx.coroutines.scheduling.Task r1 = r1.poll()
                if (r1 == 0) goto L25
                r2 = 0
                return r1
            L25:
                if (r0 != 0) goto L37
                kotlinx.coroutines.scheduling.Task r1 = r3.pollGlobalQueues()
                if (r1 == 0) goto L37
                r2 = 0
                return r1
            L2f:
                kotlinx.coroutines.scheduling.Task r0 = r3.pollGlobalQueues()
                if (r0 == 0) goto L37
                r1 = 0
                return r0
            L37:
                r0 = 3
                kotlinx.coroutines.scheduling.Task r0 = r3.trySteal(r0)
                return r0
        }

        private final kotlinx.coroutines.scheduling.Task findBlockingTask() {
                r1 = this;
                kotlinx.coroutines.scheduling.WorkQueue r0 = r1.localQueue
                kotlinx.coroutines.scheduling.Task r0 = r0.pollBlocking()
                if (r0 != 0) goto L19
                kotlinx.coroutines.scheduling.CoroutineScheduler r0 = r1.this$0
                kotlinx.coroutines.scheduling.GlobalQueue r0 = r0.globalBlockingQueue
                java.lang.Object r0 = r0.removeFirstOrNull()
                kotlinx.coroutines.scheduling.Task r0 = (kotlinx.coroutines.scheduling.Task) r0
                if (r0 != 0) goto L19
                r0 = 1
                kotlinx.coroutines.scheduling.Task r0 = r1.trySteal(r0)
            L19:
                return r0
        }

        private final kotlinx.coroutines.scheduling.Task findCpuTask() {
                r1 = this;
                kotlinx.coroutines.scheduling.WorkQueue r0 = r1.localQueue
                kotlinx.coroutines.scheduling.Task r0 = r0.pollCpu()
                if (r0 != 0) goto L19
                kotlinx.coroutines.scheduling.CoroutineScheduler r0 = r1.this$0
                kotlinx.coroutines.scheduling.GlobalQueue r0 = r0.globalBlockingQueue
                java.lang.Object r0 = r0.removeFirstOrNull()
                kotlinx.coroutines.scheduling.Task r0 = (kotlinx.coroutines.scheduling.Task) r0
                if (r0 != 0) goto L19
                r0 = 2
                kotlinx.coroutines.scheduling.Task r0 = r1.trySteal(r0)
            L19:
                return r0
        }

        private final /* synthetic */ int getWorkerCtl$volatile() {
                r1 = this;
                int r0 = r1.workerCtl$volatile
                return r0
        }

        public static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater getWorkerCtl$volatile$FU$kotlinx_coroutines_core() {
                java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = kotlinx.coroutines.scheduling.CoroutineScheduler.Worker.workerCtl$volatile$FU
                return r0
        }

        private final void idleReset(int r3) {
                r2 = this;
                r0 = 0
                r2.terminationDeadline = r0
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r0 = r2.state
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r1 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.PARKING
                if (r0 != r1) goto L23
                boolean r0 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
                if (r0 == 0) goto L1f
                r0 = 0
                r1 = 1
                if (r3 != r1) goto L15
                goto L16
            L15:
                r1 = 0
            L16:
                if (r1 == 0) goto L19
                goto L1f
            L19:
                java.lang.AssertionError r0 = new java.lang.AssertionError
                r0.<init>()
                throw r0
            L1f:
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r0 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.BLOCKING
                r2.state = r0
            L23:
                return
        }

        private final boolean inStack() {
                r2 = this;
                java.lang.Object r0 = r2.nextParkedWorker
                kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.scheduling.CoroutineScheduler.NOT_IN_STACK
                if (r0 == r1) goto L8
                r0 = 1
                goto L9
            L8:
                r0 = 0
            L9:
                return r0
        }

        private final void park() {
                r6 = this;
                long r0 = r6.terminationDeadline
                r2 = 0
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 != 0) goto L13
                long r0 = java.lang.System.nanoTime()
                kotlinx.coroutines.scheduling.CoroutineScheduler r4 = r6.this$0
                long r4 = r4.idleWorkerKeepAliveNs
                long r0 = r0 + r4
                r6.terminationDeadline = r0
            L13:
                kotlinx.coroutines.scheduling.CoroutineScheduler r0 = r6.this$0
                long r0 = r0.idleWorkerKeepAliveNs
                java.util.concurrent.locks.LockSupport.parkNanos(r0)
                long r0 = java.lang.System.nanoTime()
                long r4 = r6.terminationDeadline
                long r0 = r0 - r4
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 < 0) goto L2a
                r6.terminationDeadline = r2
                r6.tryTerminateWorker()
            L2a:
                return
        }

        private final kotlinx.coroutines.scheduling.Task pollGlobalQueues() {
                r2 = this;
                r0 = 2
                int r0 = r2.nextInt(r0)
                if (r0 != 0) goto L20
                kotlinx.coroutines.scheduling.CoroutineScheduler r0 = r2.this$0
                kotlinx.coroutines.scheduling.GlobalQueue r0 = r0.globalCpuQueue
                java.lang.Object r0 = r0.removeFirstOrNull()
                kotlinx.coroutines.scheduling.Task r0 = (kotlinx.coroutines.scheduling.Task) r0
                if (r0 == 0) goto L15
                r1 = 0
                return r0
            L15:
                kotlinx.coroutines.scheduling.CoroutineScheduler r0 = r2.this$0
                kotlinx.coroutines.scheduling.GlobalQueue r0 = r0.globalBlockingQueue
                java.lang.Object r0 = r0.removeFirstOrNull()
                kotlinx.coroutines.scheduling.Task r0 = (kotlinx.coroutines.scheduling.Task) r0
                return r0
            L20:
                kotlinx.coroutines.scheduling.CoroutineScheduler r0 = r2.this$0
                kotlinx.coroutines.scheduling.GlobalQueue r0 = r0.globalBlockingQueue
                java.lang.Object r0 = r0.removeFirstOrNull()
                kotlinx.coroutines.scheduling.Task r0 = (kotlinx.coroutines.scheduling.Task) r0
                if (r0 == 0) goto L2e
                r1 = 0
                return r0
            L2e:
                kotlinx.coroutines.scheduling.CoroutineScheduler r0 = r2.this$0
                kotlinx.coroutines.scheduling.GlobalQueue r0 = r0.globalCpuQueue
                java.lang.Object r0 = r0.removeFirstOrNull()
                kotlinx.coroutines.scheduling.Task r0 = (kotlinx.coroutines.scheduling.Task) r0
                return r0
        }

        private final void runWorker() {
                r6 = this;
                r0 = 0
            L1:
                kotlinx.coroutines.scheduling.CoroutineScheduler r1 = r6.this$0
                boolean r1 = r1.isTerminated()
                if (r1 != 0) goto L42
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r1 = r6.state
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r2 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.TERMINATED
                if (r1 == r2) goto L42
                boolean r1 = r6.mayHaveLocalTasks
                kotlinx.coroutines.scheduling.Task r1 = r6.findTask(r1)
                r2 = 0
                if (r1 == 0) goto L20
                r0 = 0
                r6.minDelayUntilStealableTaskNs = r2
                r6.executeTask(r1)
                goto L1
            L20:
                r4 = 0
                r6.mayHaveLocalTasks = r4
                long r4 = r6.minDelayUntilStealableTaskNs
                int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
                if (r4 == 0) goto L3e
                if (r0 != 0) goto L2d
                r0 = 1
                goto L3d
            L2d:
                r0 = 0
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r4 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.PARKING
                r6.tryReleaseCpu(r4)
                java.lang.Thread.interrupted()
                long r4 = r6.minDelayUntilStealableTaskNs
                java.util.concurrent.locks.LockSupport.parkNanos(r4)
                r6.minDelayUntilStealableTaskNs = r2
            L3d:
                goto L1
            L3e:
                r6.tryPark()
                goto L1
            L42:
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r1 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.TERMINATED
                r6.tryReleaseCpu(r1)
                return
        }

        private final /* synthetic */ void setWorkerCtl$volatile(int r1) {
                r0 = this;
                r0.workerCtl$volatile = r1
                return
        }

        private final boolean tryAcquireCpuPermit() {
                r13 = this;
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r0 = r13.state
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r1 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.CPU_ACQUIRED
                r2 = 1
                if (r0 != r1) goto L9
                goto L42
            L9:
                kotlinx.coroutines.scheduling.CoroutineScheduler r4 = r13.this$0
                r0 = 0
                java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = kotlinx.coroutines.scheduling.CoroutineScheduler.access$getControlState$volatile$FU()
                r9 = r4
            L11:
                long r5 = r1.get(r4)
                r10 = 0
                r3 = r4
                r7 = 0
                r11 = 9223367638808264704(0x7ffffc0000000000, double:NaN)
                long r11 = r11 & r5
                r8 = 42
                long r11 = r11 >> r8
                int r3 = (int) r11
                r11 = r3
                r12 = 0
                if (r11 != 0) goto L28
                r0 = r12
                goto L3a
            L28:
                r7 = 4398046511104(0x40000000000, double:2.1729236899484E-311)
                long r7 = r5 - r7
                java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = kotlinx.coroutines.scheduling.CoroutineScheduler.access$getControlState$volatile$FU()
                boolean r3 = r3.compareAndSet(r4, r5, r7)
                if (r3 == 0) goto L43
                r0 = r2
            L3a:
                if (r0 == 0) goto L41
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r0 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.CPU_ACQUIRED
                r13.state = r0
                goto L42
            L41:
                r2 = r12
            L42:
                return r2
            L43:
                goto L11
        }

        private final void tryPark() {
                r3 = this;
                boolean r0 = r3.inStack()
                if (r0 != 0) goto Lc
                kotlinx.coroutines.scheduling.CoroutineScheduler r0 = r3.this$0
                r0.parkedWorkersStackPush(r3)
                return
            Lc:
                java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = getWorkerCtl$volatile$FU$kotlinx_coroutines_core()
                r1 = -1
                r0.set(r3, r1)
            L14:
                boolean r0 = r3.inStack()
                if (r0 == 0) goto L3f
                java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = getWorkerCtl$volatile$FU$kotlinx_coroutines_core()
                int r0 = r0.get(r3)
                if (r0 != r1) goto L3f
                kotlinx.coroutines.scheduling.CoroutineScheduler r0 = r3.this$0
                boolean r0 = r0.isTerminated()
                if (r0 != 0) goto L3f
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r0 = r3.state
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r2 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.TERMINATED
                if (r0 != r2) goto L33
                goto L3f
            L33:
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r0 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.PARKING
                r3.tryReleaseCpu(r0)
                java.lang.Thread.interrupted()
                r3.park()
                goto L14
            L3f:
                return
        }

        private final kotlinx.coroutines.scheduling.Task trySteal(int r19) {
                r18 = this;
                r0 = r18
                kotlinx.coroutines.scheduling.CoroutineScheduler r1 = r0.this$0
                r2 = 0
                java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = kotlinx.coroutines.scheduling.CoroutineScheduler.access$getControlState$volatile$FU()
                long r3 = r3.get(r1)
                r5 = 2097151(0x1fffff, double:1.0361303E-317)
                long r3 = r3 & r5
                int r1 = (int) r3
                r2 = 2
                r3 = 0
                if (r1 >= r2) goto L18
                return r3
            L18:
                r2 = 0
                int r2 = r0.nextInt(r1)
                r4 = 0
                r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                kotlinx.coroutines.scheduling.CoroutineScheduler r6 = r0.this$0
                r7 = 0
            L27:
                r8 = 0
                if (r7 >= r1) goto L68
                r10 = r7
                r11 = 0
                int r2 = r2 + 1
                if (r2 <= r1) goto L32
                r2 = 1
            L32:
                kotlinx.coroutines.internal.ResizableAtomicArray<kotlinx.coroutines.scheduling.CoroutineScheduler$Worker> r12 = r6.workers
                java.lang.Object r12 = r12.get(r2)
                kotlinx.coroutines.scheduling.CoroutineScheduler$Worker r12 = (kotlinx.coroutines.scheduling.CoroutineScheduler.Worker) r12
                if (r12 == 0) goto L62
                if (r12 == r0) goto L62
                kotlinx.coroutines.scheduling.WorkQueue r13 = r12.localQueue
                kotlin.jvm.internal.Ref$ObjectRef<kotlinx.coroutines.scheduling.Task> r14 = r0.stolenTask
                r15 = r19
                long r13 = r13.trySteal(r15, r14)
                r16 = -1
                int r16 = (r13 > r16 ? 1 : (r13 == r16 ? 0 : -1))
                if (r16 != 0) goto L59
                kotlin.jvm.internal.Ref$ObjectRef<kotlinx.coroutines.scheduling.Task> r6 = r0.stolenTask
                T r6 = r6.element
                kotlinx.coroutines.scheduling.Task r6 = (kotlinx.coroutines.scheduling.Task) r6
                kotlin.jvm.internal.Ref$ObjectRef<kotlinx.coroutines.scheduling.Task> r7 = r0.stolenTask
                r7.element = r3
                return r6
            L59:
                int r8 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1))
                if (r8 <= 0) goto L64
                long r4 = java.lang.Math.min(r4, r13)
                goto L64
            L62:
                r15 = r19
            L64:
                int r7 = r7 + 1
                goto L27
            L68:
                r15 = r19
                r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r6 == 0) goto L74
                r8 = r4
            L74:
                r0.minDelayUntilStealableTaskNs = r8
                return r3
        }

        private final void tryTerminateWorker() {
                r14 = this;
                kotlinx.coroutines.scheduling.CoroutineScheduler r0 = r14.this$0
                kotlinx.coroutines.internal.ResizableAtomicArray<kotlinx.coroutines.scheduling.CoroutineScheduler$Worker> r0 = r0.workers
                kotlinx.coroutines.scheduling.CoroutineScheduler r1 = r14.this$0
                r2 = 0
                r3 = 0
                monitor-enter(r0)
                r4 = 0
                boolean r5 = r1.isTerminated()     // Catch: java.lang.Throwable -> L77
                if (r5 == 0) goto L13
                monitor-exit(r0)
                return
            L13:
                r5 = r1
                r6 = 0
                java.util.concurrent.atomic.AtomicLongFieldUpdater r7 = kotlinx.coroutines.scheduling.CoroutineScheduler.access$getControlState$volatile$FU()     // Catch: java.lang.Throwable -> L77
                long r7 = r7.get(r5)     // Catch: java.lang.Throwable -> L77
                r9 = 2097151(0x1fffff, double:1.0361303E-317)
                long r7 = r7 & r9
                int r5 = (int) r7     // Catch: java.lang.Throwable -> L77
                int r6 = r1.corePoolSize     // Catch: java.lang.Throwable -> L77
                if (r5 > r6) goto L28
                monitor-exit(r0)
                return
            L28:
                java.util.concurrent.atomic.AtomicIntegerFieldUpdater r5 = getWorkerCtl$volatile$FU$kotlinx_coroutines_core()     // Catch: java.lang.Throwable -> L77
                r6 = -1
                r7 = 1
                boolean r5 = r5.compareAndSet(r14, r6, r7)     // Catch: java.lang.Throwable -> L77
                if (r5 != 0) goto L36
                monitor-exit(r0)
                return
            L36:
                int r5 = r14.indexInArray     // Catch: java.lang.Throwable -> L77
                r6 = 0
                r14.setIndexInArray(r6)     // Catch: java.lang.Throwable -> L77
                r1.parkedWorkersStackTopUpdate(r14, r5, r6)     // Catch: java.lang.Throwable -> L77
                r6 = r1
                r7 = 0
                java.util.concurrent.atomic.AtomicLongFieldUpdater r8 = kotlinx.coroutines.scheduling.CoroutineScheduler.access$getControlState$volatile$FU()     // Catch: java.lang.Throwable -> L77
                long r11 = r8.getAndDecrement(r6)     // Catch: java.lang.Throwable -> L77
                r8 = r6
                r13 = 0
                long r9 = r9 & r11
                int r8 = (int) r9     // Catch: java.lang.Throwable -> L77
                if (r8 == r5) goto L67
                kotlinx.coroutines.internal.ResizableAtomicArray<kotlinx.coroutines.scheduling.CoroutineScheduler$Worker> r6 = r1.workers     // Catch: java.lang.Throwable -> L77
                java.lang.Object r6 = r6.get(r8)     // Catch: java.lang.Throwable -> L77
                kotlin.jvm.internal.Intrinsics.checkNotNull(r6)     // Catch: java.lang.Throwable -> L77
                kotlinx.coroutines.scheduling.CoroutineScheduler$Worker r6 = (kotlinx.coroutines.scheduling.CoroutineScheduler.Worker) r6     // Catch: java.lang.Throwable -> L77
                kotlinx.coroutines.internal.ResizableAtomicArray<kotlinx.coroutines.scheduling.CoroutineScheduler$Worker> r7 = r1.workers     // Catch: java.lang.Throwable -> L77
                r7.setSynchronized(r5, r6)     // Catch: java.lang.Throwable -> L77
                r6.setIndexInArray(r5)     // Catch: java.lang.Throwable -> L77
                r1.parkedWorkersStackTopUpdate(r6, r8, r5)     // Catch: java.lang.Throwable -> L77
            L67:
                kotlinx.coroutines.internal.ResizableAtomicArray<kotlinx.coroutines.scheduling.CoroutineScheduler$Worker> r1 = r1.workers     // Catch: java.lang.Throwable -> L77
                r6 = 0
                r1.setSynchronized(r8, r6)     // Catch: java.lang.Throwable -> L77
                kotlin.Unit r1 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L77
                monitor-exit(r0)
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r0 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.TERMINATED
                r14.state = r0
                return
            L77:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
        }

        public final kotlinx.coroutines.scheduling.Task findTask(boolean r2) {
                r1 = this;
                boolean r0 = r1.tryAcquireCpuPermit()
                if (r0 == 0) goto Lb
                kotlinx.coroutines.scheduling.Task r0 = r1.findAnyTask(r2)
                return r0
            Lb:
                kotlinx.coroutines.scheduling.Task r0 = r1.findBlockingTask()
                return r0
        }

        public final int getIndexInArray() {
                r1 = this;
                int r0 = r1.indexInArray
                return r0
        }

        public final java.lang.Object getNextParkedWorker() {
                r1 = this;
                java.lang.Object r0 = r1.nextParkedWorker
                return r0
        }

        public final kotlinx.coroutines.scheduling.CoroutineScheduler getScheduler() {
                r2 = this;
                r0 = 0
                kotlinx.coroutines.scheduling.CoroutineScheduler r1 = access$getThis$0$p(r2)
                return r1
        }

        public final boolean isIo() {
                r2 = this;
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r0 = r2.state
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r1 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.BLOCKING
                if (r0 != r1) goto L8
                r0 = 1
                goto L9
            L8:
                r0 = 0
            L9:
                return r0
        }

        public final int nextInt(int r4) {
                r3 = this;
                int r0 = r3.rngState
                int r1 = r0 << 13
                r0 = r0 ^ r1
                int r1 = r0 >> 17
                r0 = r0 ^ r1
                int r1 = r0 << 5
                r0 = r0 ^ r1
                r3.rngState = r0
                int r1 = r4 + (-1)
                r2 = r1 & r4
                if (r2 != 0) goto L16
                r2 = r0 & r1
                return r2
            L16:
                r2 = 2147483647(0x7fffffff, float:NaN)
                r2 = r2 & r0
                int r2 = r2 % r4
                return r2
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
                r0 = this;
                r0.runWorker()
                return
        }

        public final long runSingleTask() {
                r12 = this;
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r0 = r12.state
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r1 = r12.state
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r2 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.CPU_ACQUIRED
                r3 = 1
                r4 = 0
                if (r1 != r2) goto Lc
                r1 = r3
                goto Ld
            Lc:
                r1 = r4
            Ld:
                if (r1 == 0) goto L14
                kotlinx.coroutines.scheduling.Task r2 = r12.findCpuTask()
                goto L18
            L14:
                kotlinx.coroutines.scheduling.Task r2 = r12.findBlockingTask()
            L18:
                r5 = 0
                if (r2 != 0) goto L29
                long r3 = r12.minDelayUntilStealableTaskNs
                int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r3 != 0) goto L26
                r3 = -1
                return r3
            L26:
                long r3 = r12.minDelayUntilStealableTaskNs
                return r3
            L29:
                kotlinx.coroutines.scheduling.CoroutineScheduler r7 = r12.this$0
                r7.runSafely(r2)
                if (r1 != 0) goto L3e
                kotlinx.coroutines.scheduling.CoroutineScheduler r7 = r12.this$0
                r8 = 0
                java.util.concurrent.atomic.AtomicLongFieldUpdater r9 = kotlinx.coroutines.scheduling.CoroutineScheduler.access$getControlState$volatile$FU()
                r10 = -2097152(0xffffffffffe00000, double:NaN)
                r9.addAndGet(r7, r10)
            L3e:
                boolean r7 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
                if (r7 == 0) goto L54
                r7 = 0
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r8 = r12.state
                if (r8 != r0) goto L4a
                goto L4b
            L4a:
                r3 = r4
            L4b:
                if (r3 == 0) goto L4e
                goto L54
            L4e:
                java.lang.AssertionError r3 = new java.lang.AssertionError
                r3.<init>()
                throw r3
            L54:
                return r5
        }

        public final void setIndexInArray(int r3) {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                kotlinx.coroutines.scheduling.CoroutineScheduler r1 = r2.this$0
                java.lang.String r1 = r1.schedulerName
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = "-worker-"
                java.lang.StringBuilder r0 = r0.append(r1)
                if (r3 != 0) goto L18
                java.lang.String r1 = "TERMINATED"
                goto L1c
            L18:
                java.lang.String r1 = java.lang.String.valueOf(r3)
            L1c:
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                r2.setName(r0)
                r2.indexInArray = r3
                return
        }

        public final void setNextParkedWorker(java.lang.Object r1) {
                r0 = this;
                r0.nextParkedWorker = r1
                return
        }

        public final boolean tryReleaseCpu(kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState r8) {
                r7 = this;
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r0 = r7.state
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r1 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.CPU_ACQUIRED
                if (r0 != r1) goto L8
                r1 = 1
                goto L9
            L8:
                r1 = 0
            L9:
                if (r1 == 0) goto L1a
                kotlinx.coroutines.scheduling.CoroutineScheduler r2 = r7.this$0
                r3 = 0
                java.util.concurrent.atomic.AtomicLongFieldUpdater r4 = kotlinx.coroutines.scheduling.CoroutineScheduler.access$getControlState$volatile$FU()
                r5 = 4398046511104(0x40000000000, double:2.1729236899484E-311)
                r4.addAndGet(r2, r5)
            L1a:
                if (r0 == r8) goto L1e
                r7.state = r8
            L1e:
                return r1
        }
    }

    /* JADX INFO: compiled from: CoroutineScheduler.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;", "", "(Ljava/lang/String;I)V", "CPU_ACQUIRED", "BLOCKING", "PARKING", "DORMANT", "TERMINATED", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public enum WorkerState extends java.lang.Enum<kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState> {
        private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES = null;
        private static final /* synthetic */ kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState[] $VALUES = null;
        public static final kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState BLOCKING = null;
        public static final kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState CPU_ACQUIRED = null;
        public static final kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState DORMANT = null;
        public static final kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState PARKING = null;
        public static final kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState TERMINATED = null;

        private static final /* synthetic */ kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState[] $values() {
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r0 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.CPU_ACQUIRED
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r1 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.BLOCKING
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r2 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.PARKING
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r3 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.DORMANT
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r4 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.TERMINATED
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState[] r0 = new kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState[]{r0, r1, r2, r3, r4}
                return r0
        }

        static {
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r0 = new kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState
                java.lang.String r1 = "CPU_ACQUIRED"
                r2 = 0
                r0.<init>(r1, r2)
                kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.CPU_ACQUIRED = r0
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r0 = new kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState
                java.lang.String r1 = "BLOCKING"
                r2 = 1
                r0.<init>(r1, r2)
                kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.BLOCKING = r0
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r0 = new kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState
                java.lang.String r1 = "PARKING"
                r2 = 2
                r0.<init>(r1, r2)
                kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.PARKING = r0
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r0 = new kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState
                java.lang.String r1 = "DORMANT"
                r2 = 3
                r0.<init>(r1, r2)
                kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.DORMANT = r0
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r0 = new kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState
                java.lang.String r1 = "TERMINATED"
                r2 = 4
                r0.<init>(r1, r2)
                kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.TERMINATED = r0
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState[] r0 = $values()
                kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.$VALUES = r0
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState[] r0 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.$VALUES
                java.lang.Enum[] r0 = (java.lang.Enum[]) r0
                kotlin.enums.EnumEntries r0 = kotlin.enums.EnumEntriesKt.enumEntries(r0)
                kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.$ENTRIES = r0
                return
        }

        WorkerState(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static kotlin.enums.EnumEntries<kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState> getEntries() {
                kotlin.enums.EnumEntries r0 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.$ENTRIES
                return r0
        }

        public static kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState valueOf(java.lang.String r1) {
                java.lang.Class<kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState> r0 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.class
                java.lang.Enum r0 = java.lang.Enum.valueOf(r0, r1)
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r0 = (kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState) r0
                return r0
        }

        public static kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState[] values() {
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState[] r0 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.$VALUES
                java.lang.Object r0 = r0.clone()
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState[] r0 = (kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState[]) r0
                return r0
        }
    }

    static {
            kotlinx.coroutines.scheduling.CoroutineScheduler$Companion r0 = new kotlinx.coroutines.scheduling.CoroutineScheduler$Companion
            r1 = 0
            r0.<init>(r1)
            kotlinx.coroutines.scheduling.CoroutineScheduler.Companion = r0
            java.lang.String r0 = "parkedWorkersStack$volatile"
            java.lang.Class<kotlinx.coroutines.scheduling.CoroutineScheduler> r1 = kotlinx.coroutines.scheduling.CoroutineScheduler.class
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(r1, r0)
            kotlinx.coroutines.scheduling.CoroutineScheduler.parkedWorkersStack$volatile$FU = r0
            java.lang.String r0 = "controlState$volatile"
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(r1, r0)
            kotlinx.coroutines.scheduling.CoroutineScheduler.controlState$volatile$FU = r0
            java.lang.String r0 = "_isTerminated$volatile"
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r1, r0)
            kotlinx.coroutines.scheduling.CoroutineScheduler._isTerminated$volatile$FU = r0
            kotlinx.coroutines.internal.Symbol r0 = new kotlinx.coroutines.internal.Symbol
            java.lang.String r1 = "NOT_IN_STACK"
            r0.<init>(r1)
            kotlinx.coroutines.scheduling.CoroutineScheduler.NOT_IN_STACK = r0
            return
    }

    public CoroutineScheduler(int r8, int r9, long r10, java.lang.String r12) {
            r7 = this;
            r7.<init>()
            r7.corePoolSize = r8
            r7.maxPoolSize = r9
            r7.idleWorkerKeepAliveNs = r10
            r7.schedulerName = r12
            int r0 = r7.corePoolSize
            r1 = 0
            r2 = 1
            if (r0 < r2) goto L14
            r0 = r2
            goto L15
        L14:
            r0 = r1
        L15:
            if (r0 == 0) goto Ld7
            int r0 = r7.maxPoolSize
            int r3 = r7.corePoolSize
            if (r0 < r3) goto L1f
            r0 = r2
            goto L20
        L1f:
            r0 = r1
        L20:
            java.lang.String r3 = "Max pool size "
            if (r0 == 0) goto Lad
            int r0 = r7.maxPoolSize
            r4 = 2097150(0x1ffffe, float:2.938733E-39)
            if (r0 > r4) goto L2d
            r0 = r2
            goto L2e
        L2d:
            r0 = r1
        L2e:
            if (r0 == 0) goto L89
            long r3 = r7.idleWorkerKeepAliveNs
            r5 = 0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 <= 0) goto L3a
            r0 = r2
            goto L3b
        L3a:
            r0 = r1
        L3b:
            if (r0 == 0) goto L63
        L3e:
            kotlinx.coroutines.scheduling.GlobalQueue r0 = new kotlinx.coroutines.scheduling.GlobalQueue
            r0.<init>()
            r7.globalCpuQueue = r0
            kotlinx.coroutines.scheduling.GlobalQueue r0 = new kotlinx.coroutines.scheduling.GlobalQueue
            r0.<init>()
            r7.globalBlockingQueue = r0
            kotlinx.coroutines.internal.ResizableAtomicArray r0 = new kotlinx.coroutines.internal.ResizableAtomicArray
            int r3 = r7.corePoolSize
            int r3 = r3 + r2
            int r3 = r3 * 2
            r0.<init>(r3)
            r7.workers = r0
            int r0 = r7.corePoolSize
            long r2 = (long) r0
            r0 = 42
            long r2 = r2 << r0
            r7.controlState$volatile = r2
            r7._isTerminated$volatile = r1
            return
        L63:
            r0 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Idle worker keep alive time "
            java.lang.StringBuilder r1 = r1.append(r2)
            long r2 = r7.idleWorkerKeepAliveNs
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " must be positive"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r0 = r1.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L89:
            r0 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r1 = r1.append(r3)
            int r2 = r7.maxPoolSize
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " should not exceed maximal supported number of threads 2097150"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r0 = r1.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        Lad:
            r0 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r1 = r1.append(r3)
            int r2 = r7.maxPoolSize
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " should be greater than or equals to core pool size "
            java.lang.StringBuilder r1 = r1.append(r2)
            int r2 = r7.corePoolSize
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r0 = r1.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        Ld7:
            r0 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Core pool size "
            java.lang.StringBuilder r1 = r1.append(r2)
            int r2 = r7.corePoolSize
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " should be at least 1"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r0 = r1.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
    }

    public /* synthetic */ CoroutineScheduler(int r7, int r8, long r9, java.lang.String r11, int r12, kotlin.jvm.internal.DefaultConstructorMarker r13) {
            r6 = this;
            r13 = r12 & 4
            if (r13 == 0) goto L8
            long r9 = kotlinx.coroutines.scheduling.TasksKt.IDLE_WORKER_KEEP_ALIVE_NS
            r3 = r9
            goto L9
        L8:
            r3 = r9
        L9:
            r9 = r12 & 8
            if (r9 == 0) goto L11
            java.lang.String r11 = kotlinx.coroutines.scheduling.TasksKt.DEFAULT_SCHEDULER_NAME
            r5 = r11
            goto L12
        L11:
            r5 = r11
        L12:
            r0 = r6
            r1 = r7
            r2 = r8
            r0.<init>(r1, r2, r3, r5)
            return
    }

    public static final /* synthetic */ java.util.concurrent.atomic.AtomicLongFieldUpdater access$getControlState$volatile$FU() {
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = getControlState$volatile$FU()
            return r0
    }

    private final boolean addToGlobalQueue(kotlinx.coroutines.scheduling.Task r5) {
            r4 = this;
            r0 = r5
            r1 = 0
            kotlinx.coroutines.scheduling.TaskContext r2 = r0.taskContext
            int r2 = r2.getTaskMode()
            r3 = 1
            if (r2 != r3) goto Lc
            goto Ld
        Lc:
            r3 = 0
        Ld:
            if (r3 == 0) goto L16
            kotlinx.coroutines.scheduling.GlobalQueue r0 = r4.globalBlockingQueue
            boolean r0 = r0.addLast(r5)
            goto L1c
        L16:
            kotlinx.coroutines.scheduling.GlobalQueue r0 = r4.globalCpuQueue
            boolean r0 = r0.addLast(r5)
        L1c:
            return r0
    }

    private final int blockingTasks(long r5) {
            r4 = this;
            r0 = 0
            r1 = 4398044413952(0x3ffffe00000, double:2.1729226538177E-311)
            long r1 = r1 & r5
            r3 = 21
            long r1 = r1 >> r3
            int r1 = (int) r1
            return r1
    }

    private final int createNewWorker() {
            r23 = this;
            r1 = r23
            r2 = 0
            kotlinx.coroutines.internal.ResizableAtomicArray<kotlinx.coroutines.scheduling.CoroutineScheduler$Worker> r3 = r1.workers
            r4 = 0
            r5 = 0
            monitor-enter(r3)
            r0 = 0
            boolean r6 = r1.isTerminated()     // Catch: java.lang.Throwable -> Lb2
            if (r6 == 0) goto L13
            monitor-exit(r3)
            r0 = -1
            return r0
        L13:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r6 = getControlState$volatile$FU()     // Catch: java.lang.Throwable -> Lb2
            long r6 = r6.get(r1)     // Catch: java.lang.Throwable -> Lb2
            r8 = r23
            r9 = 0
            r10 = 2097151(0x1fffff, double:1.0361303E-317)
            long r12 = r6 & r10
            int r8 = (int) r12     // Catch: java.lang.Throwable -> Lb2
            r9 = r23
            r12 = 0
            r13 = 4398044413952(0x3ffffe00000, double:2.1729226538177E-311)
            long r13 = r13 & r6
            r15 = 21
            long r13 = r13 >> r15
            int r9 = (int) r13     // Catch: java.lang.Throwable -> Lb2
            int r12 = r8 - r9
            r13 = 0
            int r12 = kotlin.ranges.RangesKt.coerceAtLeast(r12, r13)     // Catch: java.lang.Throwable -> Lb2
            int r14 = r1.corePoolSize     // Catch: java.lang.Throwable -> Lb2
            if (r12 < r14) goto L40
            monitor-exit(r3)
            return r13
        L40:
            int r14 = r1.maxPoolSize     // Catch: java.lang.Throwable -> Lb2
            if (r8 < r14) goto L46
            monitor-exit(r3)
            return r13
        L46:
            r14 = r23
            r15 = 0
            r16 = r10
            java.util.concurrent.atomic.AtomicLongFieldUpdater r10 = access$getControlState$volatile$FU()     // Catch: java.lang.Throwable -> Lb2
            long r10 = r10.get(r14)     // Catch: java.lang.Throwable -> Lb2
            long r10 = r10 & r16
            int r10 = (int) r10     // Catch: java.lang.Throwable -> Lb2
            r11 = 1
            int r10 = r10 + r11
            if (r10 <= 0) goto L64
            kotlinx.coroutines.internal.ResizableAtomicArray<kotlinx.coroutines.scheduling.CoroutineScheduler$Worker> r14 = r1.workers     // Catch: java.lang.Throwable -> Lb2
            java.lang.Object r14 = r14.get(r10)     // Catch: java.lang.Throwable -> Lb2
            if (r14 != 0) goto L64
            r14 = r11
            goto L65
        L64:
            r14 = r13
        L65:
            if (r14 == 0) goto La6
            kotlinx.coroutines.scheduling.CoroutineScheduler$Worker r14 = new kotlinx.coroutines.scheduling.CoroutineScheduler$Worker     // Catch: java.lang.Throwable -> Lb2
            r14.<init>(r1, r10)     // Catch: java.lang.Throwable -> Lb2
            r2 = r14
            kotlinx.coroutines.internal.ResizableAtomicArray<kotlinx.coroutines.scheduling.CoroutineScheduler$Worker> r14 = r1.workers     // Catch: java.lang.Throwable -> Lb2
            r14.setSynchronized(r10, r2)     // Catch: java.lang.Throwable -> Lb2
            r14 = r23
            r15 = 0
            r18 = r11
            java.util.concurrent.atomic.AtomicLongFieldUpdater r11 = getControlState$volatile$FU()     // Catch: java.lang.Throwable -> Lb2
            long r19 = r11.incrementAndGet(r14)     // Catch: java.lang.Throwable -> Lb2
            r11 = r14
            r21 = 0
            r22 = r14
            long r13 = r19 & r16
            int r11 = (int) r13
            if (r10 != r11) goto L8d
            r13 = r18
            goto L8e
        L8d:
            r13 = 0
        L8e:
            if (r13 == 0) goto L9a
            int r12 = r12 + 1
            monitor-exit(r3)
            r0 = r12
            r3 = 0
            r2.start()
            return r12
        L9a:
            java.lang.String r11 = "Failed requirement."
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r11 = r11.toString()     // Catch: java.lang.Throwable -> Lb2
            r13.<init>(r11)     // Catch: java.lang.Throwable -> Lb2
            throw r13     // Catch: java.lang.Throwable -> Lb2
        La6:
            java.lang.String r11 = "Failed requirement."
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r11 = r11.toString()     // Catch: java.lang.Throwable -> Lb2
            r13.<init>(r11)     // Catch: java.lang.Throwable -> Lb2
            throw r13     // Catch: java.lang.Throwable -> Lb2
        Lb2:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
    }

    private final int createdWorkers(long r4) {
            r3 = this;
            r0 = 0
            r1 = 2097151(0x1fffff, double:1.0361303E-317)
            long r1 = r1 & r4
            int r1 = (int) r1
            return r1
    }

    private final kotlinx.coroutines.scheduling.CoroutineScheduler.Worker currentWorker() {
            r6 = this;
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            boolean r1 = r0 instanceof kotlinx.coroutines.scheduling.CoroutineScheduler.Worker
            r2 = 0
            if (r1 == 0) goto Lc
            kotlinx.coroutines.scheduling.CoroutineScheduler$Worker r0 = (kotlinx.coroutines.scheduling.CoroutineScheduler.Worker) r0
            goto Ld
        Lc:
            r0 = r2
        Ld:
            if (r0 == 0) goto L1e
            r1 = r0
            r3 = 0
            r4 = r1
            r5 = 0
            kotlinx.coroutines.scheduling.CoroutineScheduler r4 = kotlinx.coroutines.scheduling.CoroutineScheduler.Worker.access$getThis$0$p(r4)
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r4, r6)
            if (r1 == 0) goto L1e
            r2 = r0
        L1e:
            return r2
    }

    private final void decrementBlockingTasks() {
            r4 = this;
            r0 = 0
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = access$getControlState$volatile$FU()
            r2 = -2097152(0xffffffffffe00000, double:NaN)
            r1.addAndGet(r4, r2)
            return
    }

    private final int decrementCreatedWorkers() {
            r7 = this;
            r0 = 0
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = access$getControlState$volatile$FU()
            long r1 = r1.getAndDecrement(r7)
            r3 = r7
            r4 = 0
            r5 = 2097151(0x1fffff, double:1.0361303E-317)
            long r5 = r5 & r1
            int r1 = (int) r5
            return r1
    }

    public static /* synthetic */ void dispatch$default(kotlinx.coroutines.scheduling.CoroutineScheduler r0, java.lang.Runnable r1, kotlinx.coroutines.scheduling.TaskContext r2, boolean r3, int r4, java.lang.Object r5) {
            r5 = r4 & 2
            if (r5 == 0) goto L6
            kotlinx.coroutines.scheduling.TaskContext r2 = kotlinx.coroutines.scheduling.TasksKt.NonBlockingContext
        L6:
            r4 = r4 & 4
            if (r4 == 0) goto Lb
            r3 = 0
        Lb:
            r0.dispatch(r1, r2, r3)
            return
    }

    private final int getAvailableCpuPermits() {
            r8 = this;
            r0 = 0
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = getControlState$volatile$FU()
            long r1 = r1.get(r8)
            r3 = r8
            r4 = 0
            r5 = 9223367638808264704(0x7ffffc0000000000, double:NaN)
            long r5 = r5 & r1
            r7 = 42
            long r5 = r5 >> r7
            int r1 = (int) r5
            return r1
    }

    private final /* synthetic */ long getControlState$volatile() {
            r2 = this;
            long r0 = r2.controlState$volatile
            return r0
    }

    private static final /* synthetic */ java.util.concurrent.atomic.AtomicLongFieldUpdater getControlState$volatile$FU() {
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = kotlinx.coroutines.scheduling.CoroutineScheduler.controlState$volatile$FU
            return r0
    }

    private final int getCreatedWorkers() {
            r5 = this;
            r0 = 0
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = access$getControlState$volatile$FU()
            long r1 = r1.get(r5)
            r3 = 2097151(0x1fffff, double:1.0361303E-317)
            long r1 = r1 & r3
            int r1 = (int) r1
            return r1
    }

    private final /* synthetic */ long getParkedWorkersStack$volatile() {
            r2 = this;
            long r0 = r2.parkedWorkersStack$volatile
            return r0
    }

    private static final /* synthetic */ java.util.concurrent.atomic.AtomicLongFieldUpdater getParkedWorkersStack$volatile$FU() {
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = kotlinx.coroutines.scheduling.CoroutineScheduler.parkedWorkersStack$volatile$FU
            return r0
    }

    private final /* synthetic */ int get_isTerminated$volatile() {
            r1 = this;
            int r0 = r1._isTerminated$volatile
            return r0
    }

    private static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater get_isTerminated$volatile$FU() {
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = kotlinx.coroutines.scheduling.CoroutineScheduler._isTerminated$volatile$FU
            return r0
    }

    private final long incrementBlockingTasks() {
            r4 = this;
            r0 = 0
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = getControlState$volatile$FU()
            r2 = 2097152(0x200000, double:1.036131E-317)
            long r1 = r1.addAndGet(r4, r2)
            return r1
    }

    private final int incrementCreatedWorkers() {
            r7 = this;
            r0 = 0
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = getControlState$volatile$FU()
            long r1 = r1.incrementAndGet(r7)
            r3 = r7
            r4 = 0
            r5 = 2097151(0x1fffff, double:1.0361303E-317)
            long r5 = r5 & r1
            int r1 = (int) r5
            return r1
    }

    private final /* synthetic */ void loop$atomicfu(java.lang.Object r3, java.util.concurrent.atomic.AtomicLongFieldUpdater r4, kotlin.jvm.functions.Function1<? super java.lang.Long, kotlin.Unit> r5) {
            r2 = this;
        L0:
            long r0 = r4.get(r3)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r5.invoke(r0)
            goto L0
    }

    private final int parkedWorkersStackNextIndex(kotlinx.coroutines.scheduling.CoroutineScheduler.Worker r4) {
            r3 = this;
            java.lang.Object r0 = r4.getNextParkedWorker()
        L4:
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.scheduling.CoroutineScheduler.NOT_IN_STACK
            if (r0 != r1) goto Lc
            r1 = -1
            return r1
        Lc:
            if (r0 != 0) goto L10
            r1 = 0
            return r1
        L10:
            r1 = r0
            kotlinx.coroutines.scheduling.CoroutineScheduler$Worker r1 = (kotlinx.coroutines.scheduling.CoroutineScheduler.Worker) r1
            int r2 = r1.getIndexInArray()
            if (r2 == 0) goto L1a
            return r2
        L1a:
            java.lang.Object r0 = r1.getNextParkedWorker()
            goto L4
    }

    private final kotlinx.coroutines.scheduling.CoroutineScheduler.Worker parkedWorkersStackPop() {
            r14 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = getParkedWorkersStack$volatile$FU()
            r1 = r14
        L5:
            long r4 = r0.get(r14)
            r8 = 0
            r2 = 2097151(0x1fffff, double:1.0361303E-317)
            long r2 = r2 & r4
            int r9 = (int) r2
            kotlinx.coroutines.internal.ResizableAtomicArray<kotlinx.coroutines.scheduling.CoroutineScheduler$Worker> r2 = r14.workers
            java.lang.Object r2 = r2.get(r9)
            kotlinx.coroutines.scheduling.CoroutineScheduler$Worker r2 = (kotlinx.coroutines.scheduling.CoroutineScheduler.Worker) r2
            if (r2 != 0) goto L1b
            r2 = 0
            return r2
        L1b:
            r10 = r2
            r2 = 2097152(0x200000, double:1.036131E-317)
            long r2 = r2 + r4
            r6 = -2097152(0xffffffffffe00000, double:NaN)
            long r11 = r2 & r6
            int r13 = r14.parkedWorkersStackNextIndex(r10)
            if (r13 < 0) goto L5
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = getParkedWorkersStack$volatile$FU()
            long r6 = (long) r13
            long r6 = r6 | r11
            r3 = r14
            boolean r2 = r2.compareAndSet(r3, r4, r6)
            if (r2 == 0) goto L3e
            kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.scheduling.CoroutineScheduler.NOT_IN_STACK
            r10.setNextParkedWorker(r2)
            return r10
        L3e:
            goto L5
    }

    private final long releaseCpuPermit() {
            r4 = this;
            r0 = 0
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = access$getControlState$volatile$FU()
            r2 = 4398046511104(0x40000000000, double:2.1729236899484E-311)
            long r1 = r1.addAndGet(r4, r2)
            return r1
    }

    private final /* synthetic */ void setControlState$volatile(long r1) {
            r0 = this;
            r0.controlState$volatile = r1
            return
    }

    private final /* synthetic */ void setParkedWorkersStack$volatile(long r1) {
            r0 = this;
            r0.parkedWorkersStack$volatile = r1
            return
    }

    private final /* synthetic */ void set_isTerminated$volatile(int r1) {
            r0 = this;
            r0._isTerminated$volatile = r1
            return
    }

    private final void signalBlockingWork(long r2, boolean r4) {
            r1 = this;
            if (r4 == 0) goto L3
            return
        L3:
            boolean r0 = r1.tryUnpark()
            if (r0 == 0) goto La
            return
        La:
            boolean r0 = r1.tryCreateWorker(r2)
            if (r0 == 0) goto L11
            return
        L11:
            r1.tryUnpark()
            return
    }

    private final kotlinx.coroutines.scheduling.Task submitToLocalQueue(kotlinx.coroutines.scheduling.CoroutineScheduler.Worker r4, kotlinx.coroutines.scheduling.Task r5, boolean r6) {
            r3 = this;
            if (r4 != 0) goto L3
            return r5
        L3:
            kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r0 = r4.state
            kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r1 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.TERMINATED
            if (r0 != r1) goto La
            return r5
        La:
            r0 = r5
            r1 = 0
            kotlinx.coroutines.scheduling.TaskContext r2 = r0.taskContext
            int r0 = r2.getTaskMode()
            if (r0 != 0) goto L1b
            kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r0 = r4.state
            kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r1 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.BLOCKING
            if (r0 != r1) goto L1b
            return r5
        L1b:
            r0 = 1
            r4.mayHaveLocalTasks = r0
            kotlinx.coroutines.scheduling.WorkQueue r0 = r4.localQueue
            kotlinx.coroutines.scheduling.Task r0 = r0.add(r5, r6)
            return r0
    }

    private final boolean tryAcquireCpuPermit() {
            r11 = this;
            r0 = 0
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = access$getControlState$volatile$FU()
            r2 = r11
        L6:
            long r5 = r1.get(r11)
            r9 = 0
            r3 = r11
            r4 = 0
            r7 = 9223367638808264704(0x7ffffc0000000000, double:NaN)
            long r7 = r7 & r5
            r10 = 42
            long r7 = r7 >> r10
            int r3 = (int) r7
            r10 = r3
            if (r10 != 0) goto L1c
            r3 = 0
            return r3
        L1c:
            r3 = 4398046511104(0x40000000000, double:2.1729236899484E-311)
            long r7 = r5 - r3
            java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = access$getControlState$volatile$FU()
            r4 = r11
            boolean r3 = r3.compareAndSet(r4, r5, r7)
            if (r3 == 0) goto L30
            r3 = 1
            return r3
        L30:
            goto L6
    }

    private final boolean tryCreateWorker(long r8) {
            r7 = this;
            r0 = r7
            r1 = 0
            r2 = 2097151(0x1fffff, double:1.0361303E-317)
            long r2 = r2 & r8
            int r0 = (int) r2
            r1 = r7
            r2 = 0
            r3 = 4398044413952(0x3ffffe00000, double:2.1729226538177E-311)
            long r3 = r3 & r8
            r5 = 21
            long r3 = r3 >> r5
            int r1 = (int) r3
            int r2 = r0 - r1
            r3 = 0
            int r2 = kotlin.ranges.RangesKt.coerceAtLeast(r2, r3)
            int r4 = r7.corePoolSize
            if (r2 >= r4) goto L31
            int r4 = r7.createNewWorker()
            r5 = 1
            if (r4 != r5) goto L2e
            int r6 = r7.corePoolSize
            if (r6 <= r5) goto L2e
            r7.createNewWorker()
        L2e:
            if (r4 <= 0) goto L31
            return r5
        L31:
            return r3
    }

    static /* synthetic */ boolean tryCreateWorker$default(kotlinx.coroutines.scheduling.CoroutineScheduler r0, long r1, int r3, java.lang.Object r4) {
            r3 = r3 & 1
            if (r3 == 0) goto Lc
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = getControlState$volatile$FU()
            long r1 = r1.get(r0)
        Lc:
            boolean r0 = r0.tryCreateWorker(r1)
            return r0
    }

    private final boolean tryUnpark() {
            r4 = this;
        L1:
            kotlinx.coroutines.scheduling.CoroutineScheduler$Worker r0 = r4.parkedWorkersStackPop()
            r1 = 0
            if (r0 != 0) goto La
            return r1
        La:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = kotlinx.coroutines.scheduling.CoroutineScheduler.Worker.getWorkerCtl$volatile$FU$kotlinx_coroutines_core()
            r3 = -1
            boolean r1 = r2.compareAndSet(r0, r3, r1)
            if (r1 == 0) goto L1
            r1 = r0
            java.lang.Thread r1 = (java.lang.Thread) r1
            java.util.concurrent.locks.LockSupport.unpark(r1)
            r1 = 1
            return r1
    }

    public final int availableCpuPermits(long r5) {
            r4 = this;
            r0 = 0
            r1 = 9223367638808264704(0x7ffffc0000000000, double:NaN)
            long r1 = r1 & r5
            r3 = 42
            long r1 = r1 >> r3
            int r1 = (int) r1
            return r1
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r2 = this;
            r0 = 10000(0x2710, double:4.9407E-320)
            r2.shutdown(r0)
            return
    }

    public final kotlinx.coroutines.scheduling.Task createTask(java.lang.Runnable r4, kotlinx.coroutines.scheduling.TaskContext r5) {
            r3 = this;
            kotlinx.coroutines.scheduling.SchedulerTimeSource r0 = kotlinx.coroutines.scheduling.TasksKt.schedulerTimeSource
            long r0 = r0.nanoTime()
            boolean r2 = r4 instanceof kotlinx.coroutines.scheduling.Task
            if (r2 == 0) goto L18
            r2 = r4
            kotlinx.coroutines.scheduling.Task r2 = (kotlinx.coroutines.scheduling.Task) r2
            r2.submissionTime = r0
            r2 = r4
            kotlinx.coroutines.scheduling.Task r2 = (kotlinx.coroutines.scheduling.Task) r2
            r2.taskContext = r5
            r2 = r4
            kotlinx.coroutines.scheduling.Task r2 = (kotlinx.coroutines.scheduling.Task) r2
            return r2
        L18:
            kotlinx.coroutines.scheduling.TaskImpl r2 = new kotlinx.coroutines.scheduling.TaskImpl
            r2.<init>(r4, r0, r5)
            kotlinx.coroutines.scheduling.Task r2 = (kotlinx.coroutines.scheduling.Task) r2
            return r2
    }

    public final void dispatch(java.lang.Runnable r10, kotlinx.coroutines.scheduling.TaskContext r11, boolean r12) {
            r9 = this;
            kotlinx.coroutines.AbstractTimeSource r0 = kotlinx.coroutines.AbstractTimeSourceKt.access$getTimeSource$p()
            if (r0 == 0) goto L9
            r0.trackTask()
        L9:
            kotlinx.coroutines.scheduling.Task r0 = r9.createTask(r10, r11)
            r1 = r0
            r2 = 0
            kotlinx.coroutines.scheduling.TaskContext r3 = r1.taskContext
            int r3 = r3.getTaskMode()
            r4 = 0
            r5 = 1
            if (r3 != r5) goto L1b
            r1 = r5
            goto L1c
        L1b:
            r1 = r4
        L1c:
            if (r1 == 0) goto L2d
            r2 = r9
            r3 = 0
            java.util.concurrent.atomic.AtomicLongFieldUpdater r6 = getControlState$volatile$FU()
            r7 = 2097152(0x200000, double:1.036131E-317)
            long r2 = r6.addAndGet(r2, r7)
            goto L2f
        L2d:
            r2 = 0
        L2f:
            kotlinx.coroutines.scheduling.CoroutineScheduler$Worker r6 = r9.currentWorker()
            kotlinx.coroutines.scheduling.Task r7 = r9.submitToLocalQueue(r6, r0, r12)
            if (r7 == 0) goto L5c
            boolean r8 = r9.addToGlobalQueue(r7)
            if (r8 == 0) goto L41
            goto L5c
        L41:
            java.util.concurrent.RejectedExecutionException r4 = new java.util.concurrent.RejectedExecutionException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r8 = r9.schedulerName
            java.lang.StringBuilder r5 = r5.append(r8)
            java.lang.String r8 = " was terminated"
            java.lang.StringBuilder r5 = r5.append(r8)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L5c:
            if (r12 == 0) goto L61
            if (r6 == 0) goto L61
            r4 = r5
        L61:
            if (r1 == 0) goto L67
            r9.signalBlockingWork(r2, r4)
            goto L6d
        L67:
            if (r4 == 0) goto L6a
            return
        L6a:
            r9.signalCpuWork()
        L6d:
            return
    }

    @Override // java.util.concurrent.Executor
    public void execute(java.lang.Runnable r7) {
            r6 = this;
            r4 = 6
            r5 = 0
            r2 = 0
            r3 = 0
            r0 = r6
            r1 = r7
            dispatch$default(r0, r1, r2, r3, r4, r5)
            return
    }

    public final boolean isTerminated() {
            r1 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = get_isTerminated$volatile$FU()
            int r0 = r0.get(r1)
            if (r0 == 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    public final boolean parkedWorkersStackPush(kotlinx.coroutines.scheduling.CoroutineScheduler.Worker r17) {
            r16 = this;
            r1 = r16
            java.lang.Object r0 = r17.getNextParkedWorker()
            kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.scheduling.CoroutineScheduler.NOT_IN_STACK
            r6 = 0
            if (r0 == r2) goto Lc
            return r6
        Lc:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = getParkedWorkersStack$volatile$FU()
            r7 = r16
            r8 = r0
        L13:
            long r2 = r8.get(r1)
            r9 = 0
            r4 = 2097151(0x1fffff, double:1.0361303E-317)
            long r4 = r4 & r2
            int r10 = (int) r4
            r4 = 2097152(0x200000, double:1.036131E-317)
            long r4 = r4 + r2
            r11 = -2097152(0xffffffffffe00000, double:NaN)
            long r11 = r11 & r4
            int r13 = r17.getIndexInArray()
            boolean r0 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            r14 = 1
            if (r0 == 0) goto L3f
            r0 = 0
            if (r13 == 0) goto L35
            r0 = r14
            goto L36
        L35:
            r0 = r6
        L36:
            if (r0 == 0) goto L39
            goto L3f
        L39:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L3f:
            kotlinx.coroutines.internal.ResizableAtomicArray<kotlinx.coroutines.scheduling.CoroutineScheduler$Worker> r0 = r1.workers
            java.lang.Object r0 = r0.get(r10)
            r15 = r17
            r15.setNextParkedWorker(r0)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = getParkedWorkersStack$volatile$FU()
            long r4 = (long) r13
            long r4 = r4 | r11
            boolean r0 = r0.compareAndSet(r1, r2, r4)
            if (r0 == 0) goto L57
            return r14
        L57:
            r1 = r16
            goto L13
    }

    public final void parkedWorkersStackTopUpdate(kotlinx.coroutines.scheduling.CoroutineScheduler.Worker r15, int r16, int r17) {
            r14 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = getParkedWorkersStack$volatile$FU()
            r1 = r14
        L5:
            long r4 = r0.get(r14)
            r8 = 0
            r2 = 2097151(0x1fffff, double:1.0361303E-317)
            long r2 = r2 & r4
            int r9 = (int) r2
            r2 = 2097152(0x200000, double:1.036131E-317)
            long r2 = r2 + r4
            r6 = -2097152(0xffffffffffe00000, double:NaN)
            long r10 = r2 & r6
            r12 = r16
            if (r9 != r12) goto L26
            if (r17 != 0) goto L23
            int r2 = r14.parkedWorkersStackNextIndex(r15)
            goto L27
        L23:
            r2 = r17
            goto L27
        L26:
            r2 = r9
        L27:
            r13 = r2
            if (r13 < 0) goto L5
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = getParkedWorkersStack$volatile$FU()
            long r6 = (long) r13
            long r6 = r6 | r10
            r3 = r14
            boolean r2 = r2.compareAndSet(r3, r4, r6)
            if (r2 == 0) goto L38
            return
        L38:
            goto L5
    }

    public final void runSafely(kotlinx.coroutines.scheduling.Task r4) {
            r3 = this;
            r4.run()     // Catch: java.lang.Throwable -> Le
            kotlinx.coroutines.AbstractTimeSource r0 = kotlinx.coroutines.AbstractTimeSourceKt.access$getTimeSource$p()
            if (r0 == 0) goto Ld
        La:
            r0.unTrackTask()
        Ld:
            goto L21
        Le:
            r0 = move-exception
            java.lang.Thread r1 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L22
            java.lang.Thread$UncaughtExceptionHandler r2 = r1.getUncaughtExceptionHandler()     // Catch: java.lang.Throwable -> L22
            r2.uncaughtException(r1, r0)     // Catch: java.lang.Throwable -> L22
            kotlinx.coroutines.AbstractTimeSource r0 = kotlinx.coroutines.AbstractTimeSourceKt.access$getTimeSource$p()
            if (r0 == 0) goto Ld
            goto La
        L21:
            return
        L22:
            r0 = move-exception
            kotlinx.coroutines.AbstractTimeSource r1 = kotlinx.coroutines.AbstractTimeSourceKt.access$getTimeSource$p()
            if (r1 == 0) goto L2c
            r1.unTrackTask()
        L2c:
            throw r0
    }

    public final void shutdown(long r18) {
            r17 = this;
            r1 = r17
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = get_isTerminated$volatile$FU()
            r2 = 0
            r3 = 1
            boolean r0 = r0.compareAndSet(r1, r2, r3)
            if (r0 != 0) goto Lf
            return
        Lf:
            kotlinx.coroutines.scheduling.CoroutineScheduler$Worker r4 = r1.currentWorker()
            kotlinx.coroutines.internal.ResizableAtomicArray<kotlinx.coroutines.scheduling.CoroutineScheduler$Worker> r5 = r1.workers
            r6 = 0
            r7 = 0
            monitor-enter(r5)
            r0 = 0
            r8 = r17
            r9 = 0
            java.util.concurrent.atomic.AtomicLongFieldUpdater r10 = access$getControlState$volatile$FU()     // Catch: java.lang.Throwable -> Lf0
            long r10 = r10.get(r8)     // Catch: java.lang.Throwable -> Lf0
            r12 = 2097151(0x1fffff, double:1.0361303E-317)
            long r10 = r10 & r12
            int r8 = (int) r10
            monitor-exit(r5)
            r0 = 1
            if (r0 > r8) goto L7c
        L31:
            kotlinx.coroutines.internal.ResizableAtomicArray<kotlinx.coroutines.scheduling.CoroutineScheduler$Worker> r5 = r1.workers
            java.lang.Object r5 = r5.get(r0)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r5)
            kotlinx.coroutines.scheduling.CoroutineScheduler$Worker r5 = (kotlinx.coroutines.scheduling.CoroutineScheduler.Worker) r5
            if (r5 == r4) goto L75
        L3e:
            java.lang.Thread$State r6 = r5.getState()
            java.lang.Thread$State r7 = java.lang.Thread.State.TERMINATED
            if (r6 == r7) goto L52
            r6 = r5
            java.lang.Thread r6 = (java.lang.Thread) r6
            java.util.concurrent.locks.LockSupport.unpark(r6)
            r9 = r18
            r5.join(r9)
            goto L3e
        L52:
            r9 = r18
            boolean r6 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            if (r6 == 0) goto L6d
            r6 = 0
            kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r7 = r5.state
            kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r11 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.TERMINATED
            if (r7 != r11) goto L63
            r6 = r3
            goto L64
        L63:
            r6 = r2
        L64:
            if (r6 == 0) goto L67
            goto L6d
        L67:
            java.lang.AssertionError r2 = new java.lang.AssertionError
            r2.<init>()
            throw r2
        L6d:
            kotlinx.coroutines.scheduling.WorkQueue r6 = r5.localQueue
            kotlinx.coroutines.scheduling.GlobalQueue r7 = r1.globalBlockingQueue
            r6.offloadAllWorkTo(r7)
            goto L77
        L75:
            r9 = r18
        L77:
            if (r0 == r8) goto L7e
            int r0 = r0 + 1
            goto L31
        L7c:
            r9 = r18
        L7e:
            kotlinx.coroutines.scheduling.GlobalQueue r0 = r1.globalBlockingQueue
            r0.close()
            kotlinx.coroutines.scheduling.GlobalQueue r0 = r1.globalCpuQueue
            r0.close()
        L88:
            if (r4 == 0) goto L91
            kotlinx.coroutines.scheduling.Task r0 = r4.findTask(r3)
            if (r0 != 0) goto Lec
        L91:
            kotlinx.coroutines.scheduling.GlobalQueue r0 = r1.globalCpuQueue
            java.lang.Object r0 = r0.removeFirstOrNull()
            kotlinx.coroutines.scheduling.Task r0 = (kotlinx.coroutines.scheduling.Task) r0
            if (r0 != 0) goto Lec
            kotlinx.coroutines.scheduling.GlobalQueue r0 = r1.globalBlockingQueue
            java.lang.Object r0 = r0.removeFirstOrNull()
            kotlinx.coroutines.scheduling.Task r0 = (kotlinx.coroutines.scheduling.Task) r0
            if (r0 != 0) goto Lec
        La6:
            if (r4 == 0) goto Lad
            kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r0 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.TERMINATED
            r4.tryReleaseCpu(r0)
        Lad:
            boolean r0 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            if (r0 == 0) goto Ldb
            r0 = 0
            r5 = r17
            r6 = 0
            java.util.concurrent.atomic.AtomicLongFieldUpdater r7 = getControlState$volatile$FU()
            long r11 = r7.get(r5)
            r7 = r5
            r13 = 0
            r14 = 9223367638808264704(0x7ffffc0000000000, double:NaN)
            long r14 = r14 & r11
            r16 = 42
            long r14 = r14 >> r16
            int r7 = (int) r14
            int r5 = r1.corePoolSize
            if (r7 != r5) goto Ld2
            r2 = r3
        Ld2:
            if (r2 == 0) goto Ld5
            goto Ldb
        Ld5:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        Ldb:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = getParkedWorkersStack$volatile$FU()
            r2 = 0
            r0.set(r1, r2)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = getControlState$volatile$FU()
            r0.set(r1, r2)
            return
        Lec:
            r1.runSafely(r0)
            goto L88
        Lf0:
            r0 = move-exception
            r9 = r18
            monitor-exit(r5)
            throw r0
    }

    public final void signalCpuWork() {
            r4 = this;
            boolean r0 = r4.tryUnpark()
            if (r0 == 0) goto L7
            return
        L7:
            r0 = 1
            r1 = 0
            r2 = 0
            boolean r0 = tryCreateWorker$default(r4, r2, r0, r1)
            if (r0 == 0) goto L12
            return
        L12:
            r4.tryUnpark()
            return
    }

    public java.lang.String toString() {
            r17 = this;
            r0 = r17
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r7 = 1
            kotlinx.coroutines.internal.ResizableAtomicArray<kotlinx.coroutines.scheduling.CoroutineScheduler$Worker> r8 = r0.workers
            int r8 = r8.currentLength()
        L13:
            if (r7 >= r8) goto L98
            kotlinx.coroutines.internal.ResizableAtomicArray<kotlinx.coroutines.scheduling.CoroutineScheduler$Worker> r9 = r0.workers
            java.lang.Object r9 = r9.get(r7)
            kotlinx.coroutines.scheduling.CoroutineScheduler$Worker r9 = (kotlinx.coroutines.scheduling.CoroutineScheduler.Worker) r9
            if (r9 != 0) goto L21
            goto L94
        L21:
            kotlinx.coroutines.scheduling.WorkQueue r10 = r9.localQueue
            int r10 = r10.getSize$kotlinx_coroutines_core()
            kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r11 = r9.state
            int[] r12 = kotlinx.coroutines.scheduling.CoroutineScheduler.WhenMappings.$EnumSwitchMapping$0
            int r11 = r11.ordinal()
            r11 = r12[r11]
            switch(r11) {
                case 1: goto L91;
                case 2: goto L74;
                case 3: goto L57;
                case 4: goto L38;
                case 5: goto L35;
                default: goto L34;
            }
        L34:
            goto L94
        L35:
            int r5 = r5 + 1
            goto L94
        L38:
            int r4 = r4 + 1
            if (r10 <= 0) goto L94
            r11 = r6
            java.util.Collection r11 = (java.util.Collection) r11
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.StringBuilder r12 = r12.append(r10)
            r13 = 100
            java.lang.StringBuilder r12 = r12.append(r13)
            java.lang.String r12 = r12.toString()
            r11.add(r12)
            goto L94
        L57:
            int r3 = r3 + 1
            r11 = r6
            java.util.Collection r11 = (java.util.Collection) r11
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.StringBuilder r12 = r12.append(r10)
            r13 = 99
            java.lang.StringBuilder r12 = r12.append(r13)
            java.lang.String r12 = r12.toString()
            r11.add(r12)
            goto L94
        L74:
            int r2 = r2 + 1
            r11 = r6
            java.util.Collection r11 = (java.util.Collection) r11
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.StringBuilder r12 = r12.append(r10)
            r13 = 98
            java.lang.StringBuilder r12 = r12.append(r13)
            java.lang.String r12 = r12.toString()
            r11.add(r12)
            goto L94
        L91:
            int r1 = r1 + 1
        L94:
            int r7 = r7 + 1
            goto L13
        L98:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r7 = getControlState$volatile$FU()
            long r7 = r7.get(r0)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = r0.schedulerName
            java.lang.StringBuilder r10 = r9.append(r10)
            r11 = 64
            java.lang.StringBuilder r10 = r10.append(r11)
            java.lang.String r11 = kotlinx.coroutines.DebugStringsKt.getHexAddress(r0)
            java.lang.StringBuilder r10 = r10.append(r11)
            java.lang.String r11 = "[Pool Size {core = "
            java.lang.StringBuilder r10 = r10.append(r11)
            int r11 = r0.corePoolSize
            java.lang.StringBuilder r10 = r10.append(r11)
            java.lang.String r11 = ", max = "
            java.lang.StringBuilder r10 = r10.append(r11)
            int r11 = r0.maxPoolSize
            java.lang.StringBuilder r10 = r10.append(r11)
            java.lang.String r11 = "}, Worker States {CPU = "
            java.lang.StringBuilder r10 = r10.append(r11)
            java.lang.StringBuilder r10 = r10.append(r3)
            java.lang.String r11 = ", blocking = "
            java.lang.StringBuilder r10 = r10.append(r11)
            java.lang.StringBuilder r10 = r10.append(r2)
            java.lang.String r11 = ", parked = "
            java.lang.StringBuilder r10 = r10.append(r11)
            java.lang.StringBuilder r10 = r10.append(r1)
            java.lang.String r11 = ", dormant = "
            java.lang.StringBuilder r10 = r10.append(r11)
            java.lang.StringBuilder r10 = r10.append(r4)
            java.lang.String r11 = ", terminated = "
            java.lang.StringBuilder r10 = r10.append(r11)
            java.lang.StringBuilder r10 = r10.append(r5)
            java.lang.String r11 = "}, running workers queues = "
            java.lang.StringBuilder r10 = r10.append(r11)
            java.lang.StringBuilder r10 = r10.append(r6)
            java.lang.String r11 = ", global CPU queue size = "
            java.lang.StringBuilder r10 = r10.append(r11)
            kotlinx.coroutines.scheduling.GlobalQueue r11 = r0.globalCpuQueue
            int r11 = r11.getSize()
            java.lang.StringBuilder r10 = r10.append(r11)
            java.lang.String r11 = ", global blocking queue size = "
            java.lang.StringBuilder r10 = r10.append(r11)
            kotlinx.coroutines.scheduling.GlobalQueue r11 = r0.globalBlockingQueue
            int r11 = r11.getSize()
            r10.append(r11)
            java.lang.String r10 = ", Control State {created workers= "
            java.lang.StringBuilder r10 = r9.append(r10)
            r11 = r17
            r12 = 0
            r13 = 2097151(0x1fffff, double:1.0361303E-317)
            long r13 = r13 & r7
            int r11 = (int) r13
            java.lang.StringBuilder r10 = r10.append(r11)
            java.lang.String r11 = ", blocking tasks = "
            java.lang.StringBuilder r10 = r10.append(r11)
            r11 = r17
            r12 = 0
            r13 = 4398044413952(0x3ffffe00000, double:2.1729226538177E-311)
            long r13 = r13 & r7
            r15 = 21
            long r13 = r13 >> r15
            int r11 = (int) r13
            java.lang.StringBuilder r10 = r10.append(r11)
            java.lang.String r11 = ", CPUs acquired = "
            java.lang.StringBuilder r10 = r10.append(r11)
            int r11 = r0.corePoolSize
            r12 = r17
            r13 = 0
            r14 = 9223367638808264704(0x7ffffc0000000000, double:NaN)
            long r14 = r14 & r7
            r16 = 42
            long r14 = r14 >> r16
            int r12 = (int) r14
            int r11 = r11 - r12
            java.lang.StringBuilder r10 = r10.append(r11)
            java.lang.String r11 = "}]"
            r10.append(r11)
            java.lang.String r9 = r9.toString()
            return r9
    }
}
