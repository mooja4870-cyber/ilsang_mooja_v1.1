package kotlinx.coroutines.scheduling;

/* JADX INFO: compiled from: Tasks.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\"\u0010\u0010\u0000\u001a\u00020\u00018\u0000X\u0081\u0004¢\u0006\u0002\n\u0000\"\u0010\u0010\u0002\u001a\u00020\u00038\u0000X\u0081\u0004¢\u0006\u0002\n\u0000\"\u0010\u0010\u0004\u001a\u00020\u00058\u0000X\u0081\u0004¢\u0006\u0002\n\u0000\"\u0010\u0010\u0006\u001a\u00020\u00078\u0000X\u0081\u0004¢\u0006\u0002\n\u0000\"\u0010\u0010\b\u001a\u00020\u00038\u0000X\u0081\u0004¢\u0006\u0002\n\u0000\"\u0010\u0010\t\u001a\u00020\u00018\u0000X\u0081\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0003X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\u0003X\u0080T¢\u0006\u0002\n\u0000\"\u0010\u0010\f\u001a\u00020\u00078\u0000X\u0081\u0004¢\u0006\u0002\n\u0000\"\u0012\u0010\r\u001a\u00020\u000e8\u0000@\u0000X\u0081\u000e¢\u0006\u0002\n\u0000\"\u0019\u0010\u000f\u001a\u00020\u0010*\u00020\u00118À\u0002X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0012¨\u0006\u0013"}, d2 = {"BlockingContext", "Lkotlinx/coroutines/scheduling/TaskContext;", "CORE_POOL_SIZE", "", "DEFAULT_SCHEDULER_NAME", "", "IDLE_WORKER_KEEP_ALIVE_NS", "", "MAX_POOL_SIZE", "NonBlockingContext", "TASK_NON_BLOCKING", "TASK_PROBABLY_BLOCKING", "WORK_STEALING_TIME_RESOLUTION_NS", "schedulerTimeSource", "Lkotlinx/coroutines/scheduling/SchedulerTimeSource;", "isBlocking", "", "Lkotlinx/coroutines/scheduling/Task;", "(Lkotlinx/coroutines/scheduling/Task;)Z", "kotlinx-coroutines-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class TasksKt {
    public static final kotlinx.coroutines.scheduling.TaskContext BlockingContext = null;
    public static final int CORE_POOL_SIZE = 0;
    public static final java.lang.String DEFAULT_SCHEDULER_NAME = null;
    public static final long IDLE_WORKER_KEEP_ALIVE_NS = 0;
    public static final int MAX_POOL_SIZE = 0;
    public static final kotlinx.coroutines.scheduling.TaskContext NonBlockingContext = null;
    public static final int TASK_NON_BLOCKING = 0;
    public static final int TASK_PROBABLY_BLOCKING = 1;
    public static final long WORK_STEALING_TIME_RESOLUTION_NS = 0;
    public static kotlinx.coroutines.scheduling.SchedulerTimeSource schedulerTimeSource;

    static {
            java.lang.String r0 = "kotlinx.coroutines.scheduler.default.name"
            java.lang.String r1 = "DefaultDispatcher"
            java.lang.String r0 = kotlinx.coroutines.internal.SystemPropsKt.systemProp(r0, r1)
            kotlinx.coroutines.scheduling.TasksKt.DEFAULT_SCHEDULER_NAME = r0
            r8 = 12
            r9 = 0
            java.lang.String r1 = "kotlinx.coroutines.scheduler.resolution.ns"
            r2 = 100000(0x186a0, double:4.94066E-319)
            r4 = 0
            r6 = 0
            long r0 = kotlinx.coroutines.internal.SystemPropsKt.systemProp$default(r1, r2, r4, r6, r8, r9)
            kotlinx.coroutines.scheduling.TasksKt.WORK_STEALING_TIME_RESOLUTION_NS = r0
            int r0 = kotlinx.coroutines.internal.SystemPropsKt.getAVAILABLE_PROCESSORS()
            r1 = 2
            int r3 = kotlin.ranges.RangesKt.coerceAtLeast(r0, r1)
            r6 = 8
            r7 = 0
            java.lang.String r2 = "kotlinx.coroutines.scheduler.core.pool.size"
            r4 = 1
            r5 = 0
            int r0 = kotlinx.coroutines.internal.SystemPropsKt.systemProp$default(r2, r3, r4, r5, r6, r7)
            kotlinx.coroutines.scheduling.TasksKt.CORE_POOL_SIZE = r0
            r5 = 4
            r6 = 0
            java.lang.String r1 = "kotlinx.coroutines.scheduler.max.pool.size"
            r2 = 2097150(0x1ffffe, float:2.938733E-39)
            r3 = 0
            r4 = 2097150(0x1ffffe, float:2.938733E-39)
            int r0 = kotlinx.coroutines.internal.SystemPropsKt.systemProp$default(r1, r2, r3, r4, r5, r6)
            kotlinx.coroutines.scheduling.TasksKt.MAX_POOL_SIZE = r0
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS
            java.lang.String r1 = "kotlinx.coroutines.scheduler.keep.alive.sec"
            r2 = 60
            r4 = 0
            r6 = 0
            long r1 = kotlinx.coroutines.internal.SystemPropsKt.systemProp$default(r1, r2, r4, r6, r8, r9)
            long r0 = r0.toNanos(r1)
            kotlinx.coroutines.scheduling.TasksKt.IDLE_WORKER_KEEP_ALIVE_NS = r0
            kotlinx.coroutines.scheduling.NanoTimeSource r0 = kotlinx.coroutines.scheduling.NanoTimeSource.INSTANCE
            kotlinx.coroutines.scheduling.SchedulerTimeSource r0 = (kotlinx.coroutines.scheduling.SchedulerTimeSource) r0
            kotlinx.coroutines.scheduling.TasksKt.schedulerTimeSource = r0
            kotlinx.coroutines.scheduling.TaskContextImpl r0 = new kotlinx.coroutines.scheduling.TaskContextImpl
            r1 = 0
            r0.<init>(r1)
            kotlinx.coroutines.scheduling.TaskContext r0 = (kotlinx.coroutines.scheduling.TaskContext) r0
            kotlinx.coroutines.scheduling.TasksKt.NonBlockingContext = r0
            kotlinx.coroutines.scheduling.TaskContextImpl r0 = new kotlinx.coroutines.scheduling.TaskContextImpl
            r1 = 1
            r0.<init>(r1)
            kotlinx.coroutines.scheduling.TaskContext r0 = (kotlinx.coroutines.scheduling.TaskContext) r0
            kotlinx.coroutines.scheduling.TasksKt.BlockingContext = r0
            return
    }

    public static final boolean isBlocking(kotlinx.coroutines.scheduling.Task r3) {
            r0 = 0
            kotlinx.coroutines.scheduling.TaskContext r1 = r3.taskContext
            int r1 = r1.getTaskMode()
            r2 = 1
            if (r1 != r2) goto Lb
            goto Lc
        Lb:
            r2 = 0
        Lc:
            return r2
    }
}
