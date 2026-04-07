package kotlinx.coroutines.debug.internal;

/* JADX INFO: compiled from: DebuggerInfo.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0001\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0013\u0010\u0017\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000fR\u0013\u0010\u0019\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u000fR\u0011\u0010\u001b\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u001e\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u000f¨\u0006 "}, d2 = {"Lkotlinx/coroutines/debug/internal/DebuggerInfo;", "Ljava/io/Serializable;", "source", "Lkotlinx/coroutines/debug/internal/DebugCoroutineInfoImpl;", "context", "Lkotlin/coroutines/CoroutineContext;", "(Lkotlinx/coroutines/debug/internal/DebugCoroutineInfoImpl;Lkotlin/coroutines/CoroutineContext;)V", "coroutineId", "", "getCoroutineId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "dispatcher", "", "getDispatcher", "()Ljava/lang/String;", "lastObservedStackTrace", "", "Ljava/lang/StackTraceElement;", "getLastObservedStackTrace", "()Ljava/util/List;", "lastObservedThreadName", "getLastObservedThreadName", "lastObservedThreadState", "getLastObservedThreadState", "name", "getName", "sequenceNumber", "getSequenceNumber", "()J", "state", "getState", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class DebuggerInfo implements java.io.Serializable {
    private final java.lang.Long coroutineId;
    private final java.lang.String dispatcher;
    private final java.util.List<java.lang.StackTraceElement> lastObservedStackTrace;
    private final java.lang.String lastObservedThreadName;
    private final java.lang.String lastObservedThreadState;
    private final java.lang.String name;
    private final long sequenceNumber;
    private final java.lang.String state;

    public DebuggerInfo(kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl r5, kotlin.coroutines.CoroutineContext r6) {
            r4 = this;
            r4.<init>()
            kotlinx.coroutines.CoroutineId$Key r0 = kotlinx.coroutines.CoroutineId.Key
            kotlin.coroutines.CoroutineContext$Key r0 = (kotlin.coroutines.CoroutineContext.Key) r0
            kotlin.coroutines.CoroutineContext$Element r0 = r6.get(r0)
            kotlinx.coroutines.CoroutineId r0 = (kotlinx.coroutines.CoroutineId) r0
            r1 = 0
            if (r0 == 0) goto L19
            long r2 = r0.getId()
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            goto L1a
        L19:
            r0 = r1
        L1a:
            r4.coroutineId = r0
            kotlin.coroutines.ContinuationInterceptor$Key r0 = kotlin.coroutines.ContinuationInterceptor.Key
            kotlin.coroutines.CoroutineContext$Key r0 = (kotlin.coroutines.CoroutineContext.Key) r0
            kotlin.coroutines.CoroutineContext$Element r0 = r6.get(r0)
            kotlin.coroutines.ContinuationInterceptor r0 = (kotlin.coroutines.ContinuationInterceptor) r0
            if (r0 == 0) goto L2d
            java.lang.String r0 = r0.toString()
            goto L2e
        L2d:
            r0 = r1
        L2e:
            r4.dispatcher = r0
            kotlinx.coroutines.CoroutineName$Key r0 = kotlinx.coroutines.CoroutineName.Key
            kotlin.coroutines.CoroutineContext$Key r0 = (kotlin.coroutines.CoroutineContext.Key) r0
            kotlin.coroutines.CoroutineContext$Element r0 = r6.get(r0)
            kotlinx.coroutines.CoroutineName r0 = (kotlinx.coroutines.CoroutineName) r0
            if (r0 == 0) goto L41
            java.lang.String r0 = r0.getName()
            goto L42
        L41:
            r0 = r1
        L42:
            r4.name = r0
            java.lang.String r0 = r5.getState$kotlinx_coroutines_core()
            r4.state = r0
            java.lang.Thread r0 = r5.lastObservedThread
            if (r0 == 0) goto L59
            java.lang.Thread$State r0 = r0.getState()
            if (r0 == 0) goto L59
            java.lang.String r0 = r0.toString()
            goto L5a
        L59:
            r0 = r1
        L5a:
            r4.lastObservedThreadState = r0
            java.lang.Thread r0 = r5.lastObservedThread
            if (r0 == 0) goto L64
            java.lang.String r1 = r0.getName()
        L64:
            r4.lastObservedThreadName = r1
            java.util.List r0 = r5.lastObservedStackTrace$kotlinx_coroutines_core()
            r4.lastObservedStackTrace = r0
            long r0 = r5.sequenceNumber
            r4.sequenceNumber = r0
            return
    }

    public final java.lang.Long getCoroutineId() {
            r1 = this;
            java.lang.Long r0 = r1.coroutineId
            return r0
    }

    public final java.lang.String getDispatcher() {
            r1 = this;
            java.lang.String r0 = r1.dispatcher
            return r0
    }

    public final java.util.List<java.lang.StackTraceElement> getLastObservedStackTrace() {
            r1 = this;
            java.util.List<java.lang.StackTraceElement> r0 = r1.lastObservedStackTrace
            return r0
    }

    public final java.lang.String getLastObservedThreadName() {
            r1 = this;
            java.lang.String r0 = r1.lastObservedThreadName
            return r0
    }

    public final java.lang.String getLastObservedThreadState() {
            r1 = this;
            java.lang.String r0 = r1.lastObservedThreadState
            return r0
    }

    public final java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = r1.name
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
}
