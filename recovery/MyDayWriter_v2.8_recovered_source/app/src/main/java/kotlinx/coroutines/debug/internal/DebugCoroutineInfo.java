package kotlinx.coroutines.debug.internal;

/* JADX INFO: compiled from: DebugCoroutineInfo.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0017\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u0004\u0018\u00010\nX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\fR\u0019\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8G¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0019\u001a\u00020\u001a¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u001d\u001a\u00020\u001e¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lkotlinx/coroutines/debug/internal/DebugCoroutineInfo;", "", "source", "Lkotlinx/coroutines/debug/internal/DebugCoroutineInfoImpl;", "context", "Lkotlin/coroutines/CoroutineContext;", "(Lkotlinx/coroutines/debug/internal/DebugCoroutineInfoImpl;Lkotlin/coroutines/CoroutineContext;)V", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "creationStackBottom", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "getCreationStackBottom$kotlinx_coroutines_core", "()Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "creationStackTrace", "", "Ljava/lang/StackTraceElement;", "getCreationStackTrace", "()Ljava/util/List;", "lastObservedFrame", "getLastObservedFrame", "lastObservedStackTrace", "lastObservedThread", "Ljava/lang/Thread;", "getLastObservedThread", "()Ljava/lang/Thread;", "sequenceNumber", "", "getSequenceNumber", "()J", "state", "", "getState", "()Ljava/lang/String;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class DebugCoroutineInfo {
    private final kotlin.coroutines.CoroutineContext context;
    private final kotlin.coroutines.jvm.internal.CoroutineStackFrame creationStackBottom;
    private final java.util.List<java.lang.StackTraceElement> creationStackTrace;
    private final kotlin.coroutines.jvm.internal.CoroutineStackFrame lastObservedFrame;
    private final java.util.List<java.lang.StackTraceElement> lastObservedStackTrace;
    private final java.lang.Thread lastObservedThread;
    private final long sequenceNumber;
    private final java.lang.String state;

    public DebugCoroutineInfo(kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl r3, kotlin.coroutines.CoroutineContext r4) {
            r2 = this;
            r2.<init>()
            r2.context = r4
            kotlinx.coroutines.debug.internal.StackTraceFrame r0 = r3.getCreationStackBottom$kotlinx_coroutines_core()
            kotlin.coroutines.jvm.internal.CoroutineStackFrame r0 = (kotlin.coroutines.jvm.internal.CoroutineStackFrame) r0
            r2.creationStackBottom = r0
            long r0 = r3.sequenceNumber
            r2.sequenceNumber = r0
            java.util.List r0 = r3.getCreationStackTrace()
            r2.creationStackTrace = r0
            java.lang.String r0 = r3.getState$kotlinx_coroutines_core()
            r2.state = r0
            java.lang.Thread r0 = r3.lastObservedThread
            r2.lastObservedThread = r0
            kotlin.coroutines.jvm.internal.CoroutineStackFrame r0 = r3.getLastObservedFrame$kotlinx_coroutines_core()
            r2.lastObservedFrame = r0
            java.util.List r0 = r3.lastObservedStackTrace$kotlinx_coroutines_core()
            r2.lastObservedStackTrace = r0
            return
    }

    public final kotlin.coroutines.CoroutineContext getContext() {
            r1 = this;
            kotlin.coroutines.CoroutineContext r0 = r1.context
            return r0
    }

    public final kotlin.coroutines.jvm.internal.CoroutineStackFrame getCreationStackBottom$kotlinx_coroutines_core() {
            r1 = this;
            kotlin.coroutines.jvm.internal.CoroutineStackFrame r0 = r1.creationStackBottom
            return r0
    }

    public final java.util.List<java.lang.StackTraceElement> getCreationStackTrace() {
            r1 = this;
            java.util.List<java.lang.StackTraceElement> r0 = r1.creationStackTrace
            return r0
    }

    public final kotlin.coroutines.jvm.internal.CoroutineStackFrame getLastObservedFrame() {
            r1 = this;
            kotlin.coroutines.jvm.internal.CoroutineStackFrame r0 = r1.lastObservedFrame
            return r0
    }

    public final java.lang.Thread getLastObservedThread() {
            r1 = this;
            java.lang.Thread r0 = r1.lastObservedThread
            return r0
    }

    public final long getSequenceNumber() {
            r2 = this;
            long r0 = r2.sequenceNumber
            return r0
    }

    public final java.lang.String getState() {
            r1 = this;
            java.lang.String r0 = r1.state
            return r0
    }

    public final java.util.List<java.lang.StackTraceElement> lastObservedStackTrace() {
            r1 = this;
            java.util.List<java.lang.StackTraceElement> r0 = r1.lastObservedStackTrace
            return r0
    }
}
