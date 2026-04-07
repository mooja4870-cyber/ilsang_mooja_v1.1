package kotlinx.coroutines.debug.internal;

/* JADX INFO: compiled from: DebugProbesImpl.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000Æ\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0010\u0003\n\u0002\b\n\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÁ\u0002\u0018\u00002\u00020\u0001:\u0001}B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J,\u00101\u001a\b\u0012\u0004\u0012\u0002H302\"\u0004\b\u0000\u001032\f\u00104\u001a\b\u0012\u0004\u0012\u0002H3022\b\u00105\u001a\u0004\u0018\u000106H\u0002J\u0010\u00107\u001a\u00020\u00142\u0006\u00108\u001a\u000209H\u0001J\f\u0010:\u001a\b\u0012\u0004\u0012\u00020<0;J\u0011\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00010>¢\u0006\u0002\u0010?J9\u0010@\u001a\b\u0012\u0004\u0012\u0002HA0;\"\b\b\u0000\u0010A*\u00020\u00012\u001e\b\u0004\u0010B\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b\u0012\u0004\u0012\u00020D\u0012\u0004\u0012\u0002HA0CH\u0082\bJ\u0010\u0010E\u001a\u00020\u00142\u0006\u00108\u001a\u000209H\u0002J\f\u0010F\u001a\b\u0012\u0004\u0012\u00020G0;J\"\u0010H\u001a\b\u0012\u0004\u0012\u00020\u00040;2\u0006\u0010I\u001a\u00020<2\f\u0010J\u001a\b\u0012\u0004\u0012\u00020\u00040;J\u000e\u0010K\u001a\u00020)2\u0006\u0010I\u001a\u00020<J.\u0010L\u001a\b\u0012\u0004\u0012\u00020\u00040;2\u0006\u0010M\u001a\u00020)2\b\u0010N\u001a\u0004\u0018\u00010'2\f\u0010J\u001a\b\u0012\u0004\u0012\u00020\u00040;H\u0002J=\u0010O\u001a\u000e\u0012\u0004\u0012\u00020Q\u0012\u0004\u0012\u00020Q0P2\u0006\u0010R\u001a\u00020Q2\f\u0010S\u001a\b\u0012\u0004\u0012\u00020\u00040>2\f\u0010J\u001a\b\u0012\u0004\u0012\u00020\u00040;H\u0002¢\u0006\u0002\u0010TJ1\u0010U\u001a\u00020Q2\u0006\u0010V\u001a\u00020Q2\f\u0010S\u001a\b\u0012\u0004\u0012\u00020\u00040>2\f\u0010J\u001a\b\u0012\u0004\u0012\u00020\u00040;H\u0002¢\u0006\u0002\u0010WJ\u0016\u0010X\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013H\u0002J\u0015\u0010Y\u001a\u00020)2\u0006\u0010Z\u001a\u00020*H\u0000¢\u0006\u0002\b[J\r\u0010\\\u001a\u00020\u0014H\u0000¢\u0006\u0002\b]J\u001e\u0010^\u001a\u00020\u00142\u0006\u00108\u001a\u0002092\f\u0010_\u001a\b\u0012\u0004\u0012\u00020\u00040;H\u0002J\u0014\u0010`\u001a\u00020\u00142\n\u0010a\u001a\u0006\u0012\u0002\b\u00030\u000bH\u0002J'\u0010b\u001a\b\u0012\u0004\u0012\u0002H302\"\u0004\b\u0000\u001032\f\u00104\u001a\b\u0012\u0004\u0012\u0002H302H\u0000¢\u0006\u0002\bcJ\u0019\u0010d\u001a\u00020\u00142\n\u00105\u001a\u0006\u0012\u0002\b\u000302H\u0000¢\u0006\u0002\beJ\u0019\u0010f\u001a\u00020\u00142\n\u00105\u001a\u0006\u0012\u0002\b\u000302H\u0000¢\u0006\u0002\bgJ%\u0010h\u001a\b\u0012\u0004\u0012\u00020\u00040;\"\b\b\u0000\u00103*\u00020i2\u0006\u0010j\u001a\u0002H3H\u0002¢\u0006\u0002\u0010kJ\b\u0010l\u001a\u00020\u0014H\u0002J\b\u0010m\u001a\u00020\u0014H\u0002J\r\u0010n\u001a\u00020\u0014H\u0000¢\u0006\u0002\boJ\u0018\u0010p\u001a\u00020\u00142\u0006\u00105\u001a\u00020\u00072\u0006\u0010M\u001a\u00020)H\u0002J\u001c\u0010q\u001a\u00020\u00142\n\u00105\u001a\u0006\u0012\u0002\b\u0003022\u0006\u0010M\u001a\u00020)H\u0002J(\u0010q\u001a\u00020\u00142\n\u0010a\u001a\u0006\u0012\u0002\b\u00030\u000b2\n\u00105\u001a\u0006\u0012\u0002\b\u0003022\u0006\u0010M\u001a\u00020)H\u0002J4\u0010r\u001a\u00020\u0014*\u00020*2\u0012\u0010s\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\b0t2\n\u0010u\u001a\u00060vj\u0002`w2\u0006\u0010x\u001a\u00020)H\u0002J\u0010\u0010y\u001a\u00020\u000f*\u0006\u0012\u0002\b\u00030\u000bH\u0002J\u0016\u0010a\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000b*\u0006\u0012\u0002\b\u000302H\u0002J\u0013\u0010a\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000b*\u00020\u0007H\u0082\u0010J\u000f\u0010z\u001a\u0004\u0018\u00010\u0007*\u00020\u0007H\u0082\u0010J\u0012\u0010{\u001a\u000206*\b\u0012\u0004\u0012\u00020\u00040;H\u0002J\f\u0010|\u001a\u00020)*\u00020\u0001H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\t\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b0\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u001e\u0010\u000e\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b\u0012\u0004\u0012\u00020\u000f0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0015\u001a\u00020\u000fX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0017\"\u0004\b\u001c\u0010\u0019R\t\u0010\u001d\u001a\u00020\u001eX\u0082\u0004R\u0011\u0010\u001f\u001a\u00020\u000f8G¢\u0006\u0006\u001a\u0004\b \u0010\u0017R\u001a\u0010!\u001a\u00020\u000fX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0017\"\u0004\b#\u0010\u0019R\t\u0010$\u001a\u00020%X\u0082\u0004R\u0010\u0010&\u001a\u0004\u0018\u00010'X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010(\u001a\u00020)*\u00020*8BX\u0082\u0004¢\u0006\f\u0012\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0018\u0010/\u001a\u00020\u000f*\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b/\u00100¨\u0006~"}, d2 = {"Lkotlinx/coroutines/debug/internal/DebugProbesImpl;", "", "()V", "ARTIFICIAL_FRAME", "Ljava/lang/StackTraceElement;", "callerInfoCache", "Lkotlinx/coroutines/debug/internal/ConcurrentWeakMap;", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "Lkotlinx/coroutines/debug/internal/DebugCoroutineInfoImpl;", "capturedCoroutines", "", "Lkotlinx/coroutines/debug/internal/DebugProbesImpl$CoroutineOwner;", "getCapturedCoroutines", "()Ljava/util/Set;", "capturedCoroutinesMap", "", "dateFormat", "Ljava/text/SimpleDateFormat;", "dynamicAttach", "Lkotlin/Function1;", "", "enableCreationStackTraces", "getEnableCreationStackTraces$kotlinx_coroutines_core", "()Z", "setEnableCreationStackTraces$kotlinx_coroutines_core", "(Z)V", "ignoreCoroutinesWithEmptyContext", "getIgnoreCoroutinesWithEmptyContext", "setIgnoreCoroutinesWithEmptyContext", "installations", "Lkotlinx/atomicfu/AtomicInt;", "isInstalled", "isInstalled$kotlinx_coroutines_debug", "sanitizeStackTraces", "getSanitizeStackTraces$kotlinx_coroutines_core", "setSanitizeStackTraces$kotlinx_coroutines_core", "sequenceNumber", "Lkotlinx/atomicfu/AtomicLong;", "weakRefCleanerThread", "Ljava/lang/Thread;", "debugString", "", "Lkotlinx/coroutines/Job;", "getDebugString$annotations", "(Lkotlinx/coroutines/Job;)V", "getDebugString", "(Lkotlinx/coroutines/Job;)Ljava/lang/String;", "isInternalMethod", "(Ljava/lang/StackTraceElement;)Z", "createOwner", "Lkotlin/coroutines/Continuation;", "T", "completion", "frame", "Lkotlinx/coroutines/debug/internal/StackTraceFrame;", "dumpCoroutines", "out", "Ljava/io/PrintStream;", "dumpCoroutinesInfo", "", "Lkotlinx/coroutines/debug/internal/DebugCoroutineInfo;", "dumpCoroutinesInfoAsJsonAndReferences", "", "()[Ljava/lang/Object;", "dumpCoroutinesInfoImpl", "R", "create", "Lkotlin/Function2;", "Lkotlin/coroutines/CoroutineContext;", "dumpCoroutinesSynchronized", "dumpDebuggerInfo", "Lkotlinx/coroutines/debug/internal/DebuggerInfo;", "enhanceStackTraceWithThreadDump", "info", "coroutineTrace", "enhanceStackTraceWithThreadDumpAsJson", "enhanceStackTraceWithThreadDumpImpl", "state", "thread", "findContinuationStartIndex", "Lkotlin/Pair;", "", "indexOfResumeWith", "actualTrace", "(I[Ljava/lang/StackTraceElement;Ljava/util/List;)Lkotlin/Pair;", "findIndexOfFrame", "frameIndex", "(I[Ljava/lang/StackTraceElement;Ljava/util/List;)I", "getDynamicAttach", "hierarchyToString", "job", "hierarchyToString$kotlinx_coroutines_core", "install", "install$kotlinx_coroutines_core", "printStackTrace", "frames", "probeCoroutineCompleted", "owner", "probeCoroutineCreated", "probeCoroutineCreated$kotlinx_coroutines_core", "probeCoroutineResumed", "probeCoroutineResumed$kotlinx_coroutines_core", "probeCoroutineSuspended", "probeCoroutineSuspended$kotlinx_coroutines_core", "sanitizeStackTrace", "", "throwable", "(Ljava/lang/Throwable;)Ljava/util/List;", "startWeakRefCleanerThread", "stopWeakRefCleanerThread", "uninstall", "uninstall$kotlinx_coroutines_core", "updateRunningState", "updateState", "build", "map", "", "builder", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "indent", "isFinished", "realCaller", "toStackTraceFrame", "toStringRepr", "CoroutineOwner", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class DebugProbesImpl {
    private static final java.lang.StackTraceElement ARTIFICIAL_FRAME = null;
    public static final kotlinx.coroutines.debug.internal.DebugProbesImpl INSTANCE = null;
    private static final kotlinx.coroutines.debug.internal.ConcurrentWeakMap<kotlin.coroutines.jvm.internal.CoroutineStackFrame, kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl> callerInfoCache = null;
    private static final kotlinx.coroutines.debug.internal.ConcurrentWeakMap<kotlinx.coroutines.debug.internal.DebugProbesImpl.CoroutineOwner<?>, java.lang.Boolean> capturedCoroutinesMap = null;
    private static final java.text.SimpleDateFormat dateFormat = null;
    private static final /* synthetic */ kotlinx.coroutines.debug.internal.DebugProbesImpl$DebugProbesImpl$VolatileWrapper$atomicfu$private debugProbesImpl$VolatileWrapper$atomicfu$private = null;
    private static final kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> dynamicAttach = null;
    private static boolean enableCreationStackTraces;
    private static boolean ignoreCoroutinesWithEmptyContext;
    private static boolean sanitizeStackTraces;
    private static java.lang.Thread weakRefCleanerThread;

    /* JADX INFO: compiled from: DebugProbesImpl.kt */
    @kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00020\u0003B\u001d\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\n\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\u001b\u0010\u0015\u001a\u00020\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0016¢\u0006\u0002\u0010\u0019J\b\u0010\u001a\u001a\u00020\u001bH\u0016R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0012\u0010\u000b\u001a\u00020\fX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0000X\u0081\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0010\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lkotlinx/coroutines/debug/internal/DebugProbesImpl$CoroutineOwner;", "T", "Lkotlin/coroutines/Continuation;", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "delegate", "info", "Lkotlinx/coroutines/debug/internal/DebugCoroutineInfoImpl;", "(Lkotlin/coroutines/Continuation;Lkotlinx/coroutines/debug/internal/DebugCoroutineInfoImpl;)V", "callerFrame", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "context", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "frame", "Lkotlinx/coroutines/debug/internal/StackTraceFrame;", "getFrame", "()Lkotlinx/coroutines/debug/internal/StackTraceFrame;", "getStackTraceElement", "Ljava/lang/StackTraceElement;", "resumeWith", "", "result", "Lkotlin/Result;", "(Ljava/lang/Object;)V", "toString", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class CoroutineOwner<T> implements kotlin.coroutines.Continuation<T>, kotlin.coroutines.jvm.internal.CoroutineStackFrame {
        public final kotlin.coroutines.Continuation<T> delegate;
        public final kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl info;

        public CoroutineOwner(kotlin.coroutines.Continuation<? super T> r1, kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl r2) {
                r0 = this;
                r0.<init>()
                r0.delegate = r1
                r0.info = r2
                return
        }

        private final kotlinx.coroutines.debug.internal.StackTraceFrame getFrame() {
                r1 = this;
                kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl r0 = r1.info
                kotlinx.coroutines.debug.internal.StackTraceFrame r0 = r0.getCreationStackBottom$kotlinx_coroutines_core()
                return r0
        }

        @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
        public kotlin.coroutines.jvm.internal.CoroutineStackFrame getCallerFrame() {
                r1 = this;
                kotlinx.coroutines.debug.internal.StackTraceFrame r0 = r1.getFrame()
                if (r0 == 0) goto Lb
                kotlin.coroutines.jvm.internal.CoroutineStackFrame r0 = r0.getCallerFrame()
                goto Lc
            Lb:
                r0 = 0
            Lc:
                return r0
        }

        @Override // kotlin.coroutines.Continuation
        public kotlin.coroutines.CoroutineContext getContext() {
                r1 = this;
                kotlin.coroutines.Continuation<T> r0 = r1.delegate
                kotlin.coroutines.CoroutineContext r0 = r0.getContext()
                return r0
        }

        @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
        public java.lang.StackTraceElement getStackTraceElement() {
                r1 = this;
                kotlinx.coroutines.debug.internal.StackTraceFrame r0 = r1.getFrame()
                if (r0 == 0) goto Lb
                java.lang.StackTraceElement r0 = r0.getStackTraceElement()
                goto Lc
            Lb:
                r0 = 0
            Lc:
                return r0
        }

        @Override // kotlin.coroutines.Continuation
        public void resumeWith(java.lang.Object r2) {
                r1 = this;
                kotlinx.coroutines.debug.internal.DebugProbesImpl r0 = kotlinx.coroutines.debug.internal.DebugProbesImpl.INSTANCE
                kotlinx.coroutines.debug.internal.DebugProbesImpl.access$probeCoroutineCompleted(r0, r1)
                kotlin.coroutines.Continuation<T> r0 = r1.delegate
                r0.resumeWith(r2)
                return
        }

        public java.lang.String toString() {
                r1 = this;
                kotlin.coroutines.Continuation<T> r0 = r1.delegate
                java.lang.String r0 = r0.toString()
                return r0
        }
    }




    static {
            kotlinx.coroutines.debug.internal.DebugProbesImpl r0 = new kotlinx.coroutines.debug.internal.DebugProbesImpl
            r0.<init>()
            kotlinx.coroutines.debug.internal.DebugProbesImpl.INSTANCE = r0
            _COROUTINE.ArtificialStackFrames r0 = new _COROUTINE.ArtificialStackFrames
            r0.<init>()
            java.lang.StackTraceElement r0 = r0.coroutineCreation()
            kotlinx.coroutines.debug.internal.DebugProbesImpl.ARTIFICIAL_FRAME = r0
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            java.lang.String r1 = "yyyy/MM/dd HH:mm:ss"
            r0.<init>(r1)
            kotlinx.coroutines.debug.internal.DebugProbesImpl.dateFormat = r0
            kotlinx.coroutines.debug.internal.ConcurrentWeakMap r0 = new kotlinx.coroutines.debug.internal.ConcurrentWeakMap
            r1 = 0
            r2 = 1
            r3 = 0
            r0.<init>(r1, r2, r3)
            kotlinx.coroutines.debug.internal.DebugProbesImpl.capturedCoroutinesMap = r0
            kotlinx.coroutines.debug.internal.DebugProbesImpl.sanitizeStackTraces = r2
            kotlinx.coroutines.debug.internal.DebugProbesImpl.ignoreCoroutinesWithEmptyContext = r2
            kotlinx.coroutines.debug.internal.DebugProbesImpl r0 = kotlinx.coroutines.debug.internal.DebugProbesImpl.INSTANCE
            kotlin.jvm.functions.Function1 r0 = r0.getDynamicAttach()
            kotlinx.coroutines.debug.internal.DebugProbesImpl.dynamicAttach = r0
            kotlinx.coroutines.debug.internal.ConcurrentWeakMap r0 = new kotlinx.coroutines.debug.internal.ConcurrentWeakMap
            r0.<init>(r2)
            kotlinx.coroutines.debug.internal.DebugProbesImpl.callerInfoCache = r0
            kotlinx.coroutines.debug.internal.DebugProbesImpl$DebugProbesImpl$VolatileWrapper$atomicfu$private r0 = new kotlinx.coroutines.debug.internal.DebugProbesImpl$DebugProbesImpl$VolatileWrapper$atomicfu$private
            r0.<init>(r3)
            kotlinx.coroutines.debug.internal.DebugProbesImpl.debugProbesImpl$VolatileWrapper$atomicfu$private = r0
            return
    }

    private DebugProbesImpl() {
            r0 = this;
            r0.<init>()
            return
    }

    public static final /* synthetic */ kotlinx.coroutines.debug.internal.ConcurrentWeakMap access$getCallerInfoCache$p() {
            kotlinx.coroutines.debug.internal.ConcurrentWeakMap<kotlin.coroutines.jvm.internal.CoroutineStackFrame, kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl> r0 = kotlinx.coroutines.debug.internal.DebugProbesImpl.callerInfoCache
            return r0
    }

    public static final /* synthetic */ boolean access$isFinished(kotlinx.coroutines.debug.internal.DebugProbesImpl r1, kotlinx.coroutines.debug.internal.DebugProbesImpl.CoroutineOwner r2) {
            boolean r0 = r1.isFinished(r2)
            return r0
    }

    public static final /* synthetic */ void access$probeCoroutineCompleted(kotlinx.coroutines.debug.internal.DebugProbesImpl r0, kotlinx.coroutines.debug.internal.DebugProbesImpl.CoroutineOwner r1) {
            r0.probeCoroutineCompleted(r1)
            return
    }

    private final void build(kotlinx.coroutines.Job r9, java.util.Map<kotlinx.coroutines.Job, kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl> r10, java.lang.StringBuilder r11, java.lang.String r12) {
            r8 = this;
            java.lang.Object r0 = r10.get(r9)
            kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl r0 = (kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl) r0
            r1 = 0
            r2 = 9
            r3 = 10
            if (r0 != 0) goto L41
            boolean r4 = r9 instanceof kotlinx.coroutines.internal.ScopeCoroutine
            if (r4 != 0) goto L3f
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.StringBuilder r4 = r4.append(r12)
            java.lang.String r5 = r8.getDebugString(r9)
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.StringBuilder r3 = r4.append(r3)
            java.lang.String r3 = r3.toString()
            r11.append(r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.StringBuilder r3 = r3.append(r12)
            java.lang.StringBuilder r2 = r3.append(r2)
            java.lang.String r1 = r2.toString()
            goto L90
        L3f:
            r1 = r12
            goto L90
        L41:
            java.util.List r4 = r0.lastObservedStackTrace$kotlinx_coroutines_core()
            java.lang.Object r4 = kotlin.collections.CollectionsKt.firstOrNull(r4)
            java.lang.StackTraceElement r4 = (java.lang.StackTraceElement) r4
            java.lang.String r5 = r0.getState$kotlinx_coroutines_core()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.StringBuilder r6 = r6.append(r12)
            java.lang.String r7 = r8.getDebugString(r9)
            java.lang.StringBuilder r6 = r6.append(r7)
            java.lang.String r7 = ", continuation is "
            java.lang.StringBuilder r6 = r6.append(r7)
            java.lang.StringBuilder r6 = r6.append(r5)
            java.lang.String r7 = " at line "
            java.lang.StringBuilder r6 = r6.append(r7)
            java.lang.StringBuilder r6 = r6.append(r4)
            java.lang.StringBuilder r3 = r6.append(r3)
            java.lang.String r3 = r3.toString()
            r11.append(r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.StringBuilder r3 = r3.append(r12)
            java.lang.StringBuilder r2 = r3.append(r2)
            java.lang.String r1 = r2.toString()
        L90:
            kotlin.sequences.Sequence r2 = r9.getChildren()
            java.util.Iterator r2 = r2.iterator()
        L98:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto La8
            java.lang.Object r3 = r2.next()
            kotlinx.coroutines.Job r3 = (kotlinx.coroutines.Job) r3
            r8.build(r3, r10, r11, r1)
            goto L98
        La8:
            return
    }

    private final <T> kotlin.coroutines.Continuation<T> createOwner(kotlin.coroutines.Continuation<? super T> r5, kotlinx.coroutines.debug.internal.StackTraceFrame r6) {
            r4 = this;
            boolean r0 = r4.isInstalled$kotlinx_coroutines_debug()
            if (r0 != 0) goto L7
            return r5
        L7:
            kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl r0 = new kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl
            kotlin.coroutines.CoroutineContext r1 = r5.getContext()
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = kotlinx.coroutines.debug.internal.DebugProbesImpl$DebugProbesImpl$VolatileWrapper$atomicfu$private.access$getSequenceNumber$volatile$FU()
            kotlinx.coroutines.debug.internal.DebugProbesImpl$DebugProbesImpl$VolatileWrapper$atomicfu$private r3 = getDebugProbesImpl$VolatileWrapper$atomicfu$private()
            long r2 = r2.incrementAndGet(r3)
            r0.<init>(r1, r6, r2)
            kotlinx.coroutines.debug.internal.DebugProbesImpl$CoroutineOwner r1 = new kotlinx.coroutines.debug.internal.DebugProbesImpl$CoroutineOwner
            r1.<init>(r5, r0)
            kotlinx.coroutines.debug.internal.ConcurrentWeakMap<kotlinx.coroutines.debug.internal.DebugProbesImpl$CoroutineOwner<?>, java.lang.Boolean> r2 = kotlinx.coroutines.debug.internal.DebugProbesImpl.capturedCoroutinesMap
            java.util.Map r2 = (java.util.Map) r2
            r3 = 1
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r2.put(r1, r3)
            boolean r2 = r4.isInstalled$kotlinx_coroutines_debug()
            if (r2 != 0) goto L38
            kotlinx.coroutines.debug.internal.ConcurrentWeakMap<kotlinx.coroutines.debug.internal.DebugProbesImpl$CoroutineOwner<?>, java.lang.Boolean> r2 = kotlinx.coroutines.debug.internal.DebugProbesImpl.capturedCoroutinesMap
            r2.clear()
        L38:
            r2 = r1
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            return r2
    }

    private final <R> java.util.List<R> dumpCoroutinesInfoImpl(kotlin.jvm.functions.Function2<? super kotlinx.coroutines.debug.internal.DebugProbesImpl.CoroutineOwner<?>, ? super kotlin.coroutines.CoroutineContext, ? extends R> r5) {
            r4 = this;
            r0 = 0
            boolean r1 = r4.isInstalled$kotlinx_coroutines_debug()
            if (r1 == 0) goto L2e
            java.util.Set r1 = r4.getCapturedCoroutines()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            kotlin.sequences.Sequence r1 = kotlin.collections.CollectionsKt.asSequence(r1)
            r2 = 0
            kotlinx.coroutines.debug.internal.DebugProbesImpl$dumpCoroutinesInfoImpl$$inlined$sortedBy$1 r3 = new kotlinx.coroutines.debug.internal.DebugProbesImpl$dumpCoroutinesInfoImpl$$inlined$sortedBy$1
            r3.<init>()
            java.util.Comparator r3 = (java.util.Comparator) r3
            kotlin.sequences.Sequence r1 = kotlin.sequences.SequencesKt.sortedWith(r1, r3)
            kotlinx.coroutines.debug.internal.DebugProbesImpl$dumpCoroutinesInfoImpl$3 r2 = new kotlinx.coroutines.debug.internal.DebugProbesImpl$dumpCoroutinesInfoImpl$3
            r2.<init>(r5)
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            kotlin.sequences.Sequence r1 = kotlin.sequences.SequencesKt.mapNotNull(r1, r2)
            java.util.List r1 = kotlin.sequences.SequencesKt.toList(r1)
            return r1
        L2e:
            r1 = 0
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Debug probes are not installed"
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    private final void dumpCoroutinesSynchronized(java.io.PrintStream r13) {
            r12 = this;
            boolean r0 = r12.isInstalled$kotlinx_coroutines_debug()
            if (r0 == 0) goto Lef
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Coroutines dump "
            java.lang.StringBuilder r0 = r0.append(r1)
            java.text.SimpleDateFormat r1 = kotlinx.coroutines.debug.internal.DebugProbesImpl.dateFormat
            long r2 = java.lang.System.currentTimeMillis()
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.String r1 = r1.format(r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r13.print(r0)
            java.util.Set r0 = r12.getCapturedCoroutines()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            kotlin.sequences.Sequence r0 = kotlin.collections.CollectionsKt.asSequence(r0)
            kotlinx.coroutines.debug.internal.DebugProbesImpl$dumpCoroutinesSynchronized$2 r1 = kotlinx.coroutines.debug.internal.DebugProbesImpl.AnonymousClass2.INSTANCE
            kotlin.jvm.functions.Function1 r1 = (kotlin.jvm.functions.Function1) r1
            kotlin.sequences.Sequence r0 = kotlin.sequences.SequencesKt.filter(r0, r1)
            r1 = 0
            kotlinx.coroutines.debug.internal.DebugProbesImpl$dumpCoroutinesSynchronized$$inlined$sortedBy$1 r2 = new kotlinx.coroutines.debug.internal.DebugProbesImpl$dumpCoroutinesSynchronized$$inlined$sortedBy$1
            r2.<init>()
            java.util.Comparator r2 = (java.util.Comparator) r2
            kotlin.sequences.Sequence r0 = kotlin.sequences.SequencesKt.sortedWith(r0, r2)
            r1 = 0
            java.util.Iterator r2 = r0.iterator()
        L4f:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto Led
            java.lang.Object r3 = r2.next()
            r4 = r3
            kotlinx.coroutines.debug.internal.DebugProbesImpl$CoroutineOwner r4 = (kotlinx.coroutines.debug.internal.DebugProbesImpl.CoroutineOwner) r4
            r5 = 0
            kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl r6 = r4.info
            java.util.List r7 = r6.lastObservedStackTrace$kotlinx_coroutines_core()
            kotlinx.coroutines.debug.internal.DebugProbesImpl r8 = kotlinx.coroutines.debug.internal.DebugProbesImpl.INSTANCE
            java.lang.String r9 = r6.getState$kotlinx_coroutines_core()
            java.lang.Thread r10 = r6.lastObservedThread
            java.util.List r8 = r8.enhanceStackTraceWithThreadDumpImpl(r9, r10, r7)
            java.lang.String r9 = r6.getState$kotlinx_coroutines_core()
            java.lang.String r10 = "RUNNING"
            boolean r9 = kotlin.jvm.internal.Intrinsics.areEqual(r9, r10)
            if (r9 == 0) goto L95
            if (r8 != r7) goto L95
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = r6.getState$kotlinx_coroutines_core()
            java.lang.StringBuilder r9 = r9.append(r10)
            java.lang.String r10 = " (Last suspension stacktrace, not an actual stacktrace)"
            java.lang.StringBuilder r9 = r9.append(r10)
            java.lang.String r9 = r9.toString()
            goto L99
        L95:
            java.lang.String r9 = r6.getState$kotlinx_coroutines_core()
        L99:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "\n\nCoroutine "
            java.lang.StringBuilder r10 = r10.append(r11)
            kotlin.coroutines.Continuation<T> r11 = r4.delegate
            java.lang.StringBuilder r10 = r10.append(r11)
            java.lang.String r11 = ", state: "
            java.lang.StringBuilder r10 = r10.append(r11)
            java.lang.StringBuilder r10 = r10.append(r9)
            java.lang.String r10 = r10.toString()
            r13.print(r10)
            boolean r10 = r7.isEmpty()
            if (r10 == 0) goto Le4
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "\n\tat "
            java.lang.StringBuilder r10 = r10.append(r11)
            java.lang.StackTraceElement r11 = kotlinx.coroutines.debug.internal.DebugProbesImpl.ARTIFICIAL_FRAME
            java.lang.StringBuilder r10 = r10.append(r11)
            java.lang.String r10 = r10.toString()
            r13.print(r10)
            kotlinx.coroutines.debug.internal.DebugProbesImpl r10 = kotlinx.coroutines.debug.internal.DebugProbesImpl.INSTANCE
            java.util.List r11 = r6.getCreationStackTrace()
            r10.printStackTrace(r13, r11)
            goto Le9
        Le4:
            kotlinx.coroutines.debug.internal.DebugProbesImpl r10 = kotlinx.coroutines.debug.internal.DebugProbesImpl.INSTANCE
            r10.printStackTrace(r13, r8)
        Le9:
            goto L4f
        Led:
            return
        Lef:
            r0 = 0
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Debug probes are not installed"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    private final java.util.List<java.lang.StackTraceElement> enhanceStackTraceWithThreadDumpImpl(java.lang.String r12, java.lang.Thread r13, java.util.List<java.lang.StackTraceElement> r14) {
            r11 = this;
            java.lang.String r0 = "RUNNING"
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r12, r0)
            if (r0 == 0) goto Lc2
            if (r13 != 0) goto Lc
            goto Lc2
        Lc:
            kotlin.Result$Companion r0 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L1b
            r0 = r11
            kotlinx.coroutines.debug.internal.DebugProbesImpl r0 = (kotlinx.coroutines.debug.internal.DebugProbesImpl) r0     // Catch: java.lang.Throwable -> L1b
            r1 = 0
            java.lang.StackTraceElement[] r2 = r13.getStackTrace()     // Catch: java.lang.Throwable -> L1b
            java.lang.Object r0 = kotlin.Result.m153constructorimpl(r2)     // Catch: java.lang.Throwable -> L1b
            goto L26
        L1b:
            r0 = move-exception
            kotlin.Result$Companion r1 = kotlin.Result.Companion
            java.lang.Object r0 = kotlin.ResultKt.createFailure(r0)
            java.lang.Object r0 = kotlin.Result.m153constructorimpl(r0)
        L26:
            boolean r1 = kotlin.Result.m159isFailureimpl(r0)
            if (r1 == 0) goto L2d
            r0 = 0
        L2d:
            java.lang.StackTraceElement[] r0 = (java.lang.StackTraceElement[]) r0
            if (r0 != 0) goto L32
            return r14
        L32:
            r1 = r0
            r2 = 0
            r3 = 0
            int r4 = r1.length
        L36:
            r5 = -1
            r6 = 1
            if (r3 >= r4) goto L6b
            r7 = r1[r3]
            r8 = 0
            java.lang.String r9 = r7.getClassName()
            java.lang.String r10 = "kotlin.coroutines.jvm.internal.BaseContinuationImpl"
            boolean r9 = kotlin.jvm.internal.Intrinsics.areEqual(r9, r10)
            if (r9 == 0) goto L63
            java.lang.String r9 = r7.getMethodName()
            java.lang.String r10 = "resumeWith"
            boolean r9 = kotlin.jvm.internal.Intrinsics.areEqual(r9, r10)
            if (r9 == 0) goto L63
            java.lang.String r9 = r7.getFileName()
            java.lang.String r10 = "ContinuationImpl.kt"
            boolean r9 = kotlin.jvm.internal.Intrinsics.areEqual(r9, r10)
            if (r9 == 0) goto L63
            r9 = r6
            goto L64
        L63:
            r9 = 0
        L64:
            if (r9 == 0) goto L68
            goto L6c
        L68:
            int r3 = r3 + 1
            goto L36
        L6b:
            r3 = r5
        L6c:
            kotlin.Pair r1 = r11.findContinuationStartIndex(r3, r0, r14)
            java.lang.Object r2 = r1.component1()
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            java.lang.Object r1 = r1.component2()
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            if (r2 != r5) goto L8c
            return r14
        L8c:
            int r4 = r14.size()
            int r4 = r4 + r3
            int r4 = r4 - r2
            int r4 = r4 - r6
            int r4 = r4 - r1
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>(r4)
            r6 = 0
            int r7 = r3 - r1
        L9c:
            if (r6 >= r7) goto La9
            r8 = r5
            java.util.Collection r8 = (java.util.Collection) r8
            r9 = r0[r6]
            r8.add(r9)
            int r6 = r6 + 1
            goto L9c
        La9:
            int r6 = r2 + 1
            int r7 = r14.size()
        Laf:
            if (r6 >= r7) goto Lbe
            r8 = r5
            java.util.Collection r8 = (java.util.Collection) r8
            java.lang.Object r9 = r14.get(r6)
            r8.add(r9)
            int r6 = r6 + 1
            goto Laf
        Lbe:
            r6 = r5
            java.util.List r6 = (java.util.List) r6
            return r6
        Lc2:
            return r14
    }

    private final kotlin.Pair<java.lang.Integer, java.lang.Integer> findContinuationStartIndex(int r8, java.lang.StackTraceElement[] r9, java.util.List<java.lang.StackTraceElement> r10) {
            r7 = this;
            r0 = 0
            r1 = r0
        L2:
            r2 = -1
            r3 = 3
            if (r1 >= r3) goto L24
            r3 = r1
            r4 = 0
            kotlinx.coroutines.debug.internal.DebugProbesImpl r5 = kotlinx.coroutines.debug.internal.DebugProbesImpl.INSTANCE
            int r6 = r8 + (-1)
            int r6 = r6 - r3
            int r5 = r5.findIndexOfFrame(r6, r9, r10)
            if (r5 == r2) goto L20
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            kotlin.Pair r0 = kotlin.TuplesKt.to(r0, r1)
            return r0
        L20:
            int r1 = r1 + 1
            goto L2
        L24:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            kotlin.Pair r0 = kotlin.TuplesKt.to(r1, r0)
            return r0
    }

    private final int findIndexOfFrame(int r12, java.lang.StackTraceElement[] r13, java.util.List<java.lang.StackTraceElement> r14) {
            r11 = this;
            java.lang.Object r0 = kotlin.collections.ArraysKt.getOrNull(r13, r12)
            java.lang.StackTraceElement r0 = (java.lang.StackTraceElement) r0
            r1 = -1
            if (r0 != 0) goto La
            return r1
        La:
            r2 = r14
            r3 = 0
            r4 = 0
            java.util.Iterator r5 = r2.iterator()
        L11:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L55
            java.lang.Object r6 = r5.next()
            r7 = r6
            java.lang.StackTraceElement r7 = (java.lang.StackTraceElement) r7
            r8 = 0
            java.lang.String r9 = r7.getFileName()
            java.lang.String r10 = r0.getFileName()
            boolean r9 = kotlin.jvm.internal.Intrinsics.areEqual(r9, r10)
            if (r9 == 0) goto L4b
            java.lang.String r9 = r7.getClassName()
            java.lang.String r10 = r0.getClassName()
            boolean r9 = kotlin.jvm.internal.Intrinsics.areEqual(r9, r10)
            if (r9 == 0) goto L4b
            java.lang.String r9 = r7.getMethodName()
            java.lang.String r10 = r0.getMethodName()
            boolean r9 = kotlin.jvm.internal.Intrinsics.areEqual(r9, r10)
            if (r9 == 0) goto L4b
            r9 = 1
            goto L4c
        L4b:
            r9 = 0
        L4c:
            if (r9 == 0) goto L51
            r1 = r4
            goto L56
        L51:
            int r4 = r4 + 1
            goto L11
        L55:
        L56:
            return r1
    }

    private final java.util.Set<kotlinx.coroutines.debug.internal.DebugProbesImpl.CoroutineOwner<?>> getCapturedCoroutines() {
            r1 = this;
            kotlinx.coroutines.debug.internal.ConcurrentWeakMap<kotlinx.coroutines.debug.internal.DebugProbesImpl$CoroutineOwner<?>, java.lang.Boolean> r0 = kotlinx.coroutines.debug.internal.DebugProbesImpl.capturedCoroutinesMap
            java.util.Set r0 = r0.keySet()
            return r0
    }

    private static final /* synthetic */ kotlinx.coroutines.debug.internal.DebugProbesImpl$DebugProbesImpl$VolatileWrapper$atomicfu$private getDebugProbesImpl$VolatileWrapper$atomicfu$private() {
            kotlinx.coroutines.debug.internal.DebugProbesImpl$DebugProbesImpl$VolatileWrapper$atomicfu$private r0 = kotlinx.coroutines.debug.internal.DebugProbesImpl.debugProbesImpl$VolatileWrapper$atomicfu$private
            return r0
    }

    private final java.lang.String getDebugString(kotlinx.coroutines.Job r2) {
            r1 = this;
            boolean r0 = r2 instanceof kotlinx.coroutines.JobSupport
            if (r0 == 0) goto Lc
            r0 = r2
            kotlinx.coroutines.JobSupport r0 = (kotlinx.coroutines.JobSupport) r0
            java.lang.String r0 = r0.toDebugString()
            goto L10
        Lc:
            java.lang.String r0 = r2.toString()
        L10:
            return r0
    }

    private static /* synthetic */ void getDebugString$annotations(kotlinx.coroutines.Job r0) {
            return
    }

    private final kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> getDynamicAttach() {
            r6 = this;
            kotlin.Result$Companion r0 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L2a
            r0 = r6
            kotlinx.coroutines.debug.internal.DebugProbesImpl r0 = (kotlinx.coroutines.debug.internal.DebugProbesImpl) r0     // Catch: java.lang.Throwable -> L2a
            r1 = 0
            java.lang.String r2 = "kotlinx.coroutines.debug.internal.ByteBuddyDynamicAttach"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch: java.lang.Throwable -> L2a
            java.lang.reflect.Constructor[] r3 = r2.getConstructors()     // Catch: java.lang.Throwable -> L2a
            r4 = 0
            r3 = r3[r4]     // Catch: java.lang.Throwable -> L2a
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L2a
            java.lang.Object r4 = r3.newInstance(r4)     // Catch: java.lang.Throwable -> L2a
            java.lang.String r5 = "null cannot be cast to non-null type kotlin.Function1<kotlin.Boolean, kotlin.Unit>"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4, r5)     // Catch: java.lang.Throwable -> L2a
            r5 = 1
            java.lang.Object r4 = kotlin.jvm.internal.TypeIntrinsics.beforeCheckcastToFunctionOfArity(r4, r5)     // Catch: java.lang.Throwable -> L2a
            kotlin.jvm.functions.Function1 r4 = (kotlin.jvm.functions.Function1) r4     // Catch: java.lang.Throwable -> L2a
            java.lang.Object r0 = kotlin.Result.m153constructorimpl(r4)     // Catch: java.lang.Throwable -> L2a
            goto L35
        L2a:
            r0 = move-exception
            kotlin.Result$Companion r1 = kotlin.Result.Companion
            java.lang.Object r0 = kotlin.ResultKt.createFailure(r0)
            java.lang.Object r0 = kotlin.Result.m153constructorimpl(r0)
        L35:
            boolean r1 = kotlin.Result.m159isFailureimpl(r0)
            if (r1 == 0) goto L3c
            r0 = 0
        L3c:
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
            return r0
    }

    private final boolean isFinished(kotlinx.coroutines.debug.internal.DebugProbesImpl.CoroutineOwner<?> r4) {
            r3 = this;
            kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl r0 = r4.info
            kotlin.coroutines.CoroutineContext r0 = r0.getContext()
            r1 = 0
            if (r0 == 0) goto L24
            kotlinx.coroutines.Job$Key r2 = kotlinx.coroutines.Job.Key
            kotlin.coroutines.CoroutineContext$Key r2 = (kotlin.coroutines.CoroutineContext.Key) r2
            kotlin.coroutines.CoroutineContext$Element r0 = r0.get(r2)
            kotlinx.coroutines.Job r0 = (kotlinx.coroutines.Job) r0
            if (r0 != 0) goto L16
            goto L24
        L16:
            boolean r2 = r0.isCompleted()
            if (r2 != 0) goto L1d
            return r1
        L1d:
            kotlinx.coroutines.debug.internal.ConcurrentWeakMap<kotlinx.coroutines.debug.internal.DebugProbesImpl$CoroutineOwner<?>, java.lang.Boolean> r1 = kotlinx.coroutines.debug.internal.DebugProbesImpl.capturedCoroutinesMap
            r1.remove(r4)
            r1 = 1
            return r1
        L24:
            return r1
    }

    private final boolean isInternalMethod(java.lang.StackTraceElement r6) {
            r5 = this;
            java.lang.String r0 = r6.getClassName()
            r1 = 2
            r2 = 0
            java.lang.String r3 = "kotlinx.coroutines"
            r4 = 0
            boolean r0 = kotlin.text.StringsKt.startsWith$default(r0, r3, r4, r1, r2)
            return r0
    }

    private final kotlinx.coroutines.debug.internal.DebugProbesImpl.CoroutineOwner<?> owner(kotlin.coroutines.Continuation<?> r3) {
            r2 = this;
            boolean r0 = r3 instanceof kotlin.coroutines.jvm.internal.CoroutineStackFrame
            r1 = 0
            if (r0 == 0) goto L9
            r0 = r3
            kotlin.coroutines.jvm.internal.CoroutineStackFrame r0 = (kotlin.coroutines.jvm.internal.CoroutineStackFrame) r0
            goto La
        L9:
            r0 = r1
        La:
            if (r0 == 0) goto L10
            kotlinx.coroutines.debug.internal.DebugProbesImpl$CoroutineOwner r1 = r2.owner(r0)
        L10:
            return r1
    }

    private final kotlinx.coroutines.debug.internal.DebugProbesImpl.CoroutineOwner<?> owner(kotlin.coroutines.jvm.internal.CoroutineStackFrame r2) {
            r1 = this;
        L1:
            boolean r0 = r2 instanceof kotlinx.coroutines.debug.internal.DebugProbesImpl.CoroutineOwner
            if (r0 == 0) goto L9
            r0 = r2
            kotlinx.coroutines.debug.internal.DebugProbesImpl$CoroutineOwner r0 = (kotlinx.coroutines.debug.internal.DebugProbesImpl.CoroutineOwner) r0
            goto L12
        L9:
            kotlin.coroutines.jvm.internal.CoroutineStackFrame r0 = r2.getCallerFrame()
            if (r0 == 0) goto L11
            r2 = r0
            goto L1
        L11:
            r0 = 0
        L12:
            return r0
    }

    private final void printStackTrace(java.io.PrintStream r9, java.util.List<java.lang.StackTraceElement> r10) {
            r8 = this;
            r0 = r10
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            r1 = 0
            java.util.Iterator r2 = r0.iterator()
        L8:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L2f
            java.lang.Object r3 = r2.next()
            r4 = r3
            java.lang.StackTraceElement r4 = (java.lang.StackTraceElement) r4
            r5 = 0
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "\n\tat "
            java.lang.StringBuilder r6 = r6.append(r7)
            java.lang.StringBuilder r6 = r6.append(r4)
            java.lang.String r6 = r6.toString()
            r9.print(r6)
            goto L8
        L2f:
            return
    }

    private final void probeCoroutineCompleted(kotlinx.coroutines.debug.internal.DebugProbesImpl.CoroutineOwner<?> r3) {
            r2 = this;
            kotlinx.coroutines.debug.internal.ConcurrentWeakMap<kotlinx.coroutines.debug.internal.DebugProbesImpl$CoroutineOwner<?>, java.lang.Boolean> r0 = kotlinx.coroutines.debug.internal.DebugProbesImpl.capturedCoroutinesMap
            r0.remove(r3)
            kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl r0 = r3.info
            kotlin.coroutines.jvm.internal.CoroutineStackFrame r0 = r0.getLastObservedFrame$kotlinx_coroutines_core()
            if (r0 == 0) goto L1a
            kotlin.coroutines.jvm.internal.CoroutineStackFrame r0 = r2.realCaller(r0)
            if (r0 != 0) goto L14
            goto L1a
        L14:
            kotlinx.coroutines.debug.internal.ConcurrentWeakMap<kotlin.coroutines.jvm.internal.CoroutineStackFrame, kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl> r1 = kotlinx.coroutines.debug.internal.DebugProbesImpl.callerInfoCache
            r1.remove(r0)
            return
        L1a:
            return
    }

    private final kotlin.coroutines.jvm.internal.CoroutineStackFrame realCaller(kotlin.coroutines.jvm.internal.CoroutineStackFrame r3) {
            r2 = this;
        L1:
            kotlin.coroutines.jvm.internal.CoroutineStackFrame r0 = r3.getCallerFrame()
            if (r0 != 0) goto L9
            r0 = 0
            return r0
        L9:
            java.lang.StackTraceElement r1 = r0.getStackTraceElement()
            if (r1 == 0) goto L10
            return r0
        L10:
            r3 = r0
            goto L1
    }

    private final <T extends java.lang.Throwable> java.util.List<java.lang.StackTraceElement> sanitizeStackTrace(T r12) {
            r11 = this;
            java.lang.StackTraceElement[] r0 = r12.getStackTrace()
            int r1 = r0.length
            r2 = r0
            r3 = 0
            int r4 = r2.length
            r5 = -1
            int r4 = r4 + r5
            if (r4 < 0) goto L21
        Lc:
            r6 = r4
            int r4 = r4 + r5
            r7 = r2[r6]
            r8 = 0
            java.lang.String r9 = r7.getClassName()
            java.lang.String r10 = "kotlin.coroutines.jvm.internal.DebugProbesKt"
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual(r9, r10)
            if (r7 == 0) goto L1f
            r5 = r6
            goto L22
        L1f:
            if (r4 >= 0) goto Lc
        L21:
        L22:
            r2 = 1
            int r5 = r5 + r2
            boolean r3 = kotlinx.coroutines.debug.internal.DebugProbesImpl.sanitizeStackTraces
            if (r3 != 0) goto L41
            int r2 = r1 - r5
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r2)
            r4 = 0
        L30:
            if (r4 >= r2) goto L3e
            r6 = r4
            r7 = 0
            int r8 = r6 + r5
            r6 = r0[r8]
            r3.add(r6)
            int r4 = r4 + 1
            goto L30
        L3e:
            java.util.List r3 = (java.util.List) r3
            return r3
        L41:
            java.util.ArrayList r3 = new java.util.ArrayList
            int r4 = r1 - r5
            int r4 = r4 + r2
            r3.<init>(r4)
            r2 = r5
        L4a:
            if (r2 >= r1) goto L9f
            r4 = r0[r2]
            boolean r4 = r11.isInternalMethod(r4)
            if (r4 == 0) goto L94
            r4 = r3
            java.util.Collection r4 = (java.util.Collection) r4
            r6 = r0[r2]
            r4.add(r6)
            int r4 = r2 + 1
        L5e:
            if (r4 >= r1) goto L6b
            r6 = r0[r4]
            boolean r6 = r11.isInternalMethod(r6)
            if (r6 == 0) goto L6b
            int r4 = r4 + 1
            goto L5e
        L6b:
            int r6 = r4 + (-1)
        L6d:
            if (r6 <= r2) goto L7a
            r7 = r0[r6]
            java.lang.String r7 = r7.getFileName()
            if (r7 != 0) goto L7a
            int r6 = r6 + (-1)
            goto L6d
        L7a:
            if (r6 <= r2) goto L88
            int r7 = r4 + (-1)
            if (r6 >= r7) goto L88
            r7 = r3
            java.util.Collection r7 = (java.util.Collection) r7
            r8 = r0[r6]
            r7.add(r8)
        L88:
            r7 = r3
            java.util.Collection r7 = (java.util.Collection) r7
            int r8 = r4 + (-1)
            r8 = r0[r8]
            r7.add(r8)
            r2 = r4
            goto L4a
        L94:
            r4 = r3
            java.util.Collection r4 = (java.util.Collection) r4
            r6 = r0[r2]
            r4.add(r6)
            int r2 = r2 + 1
            goto L4a
        L9f:
            r4 = r3
            java.util.List r4 = (java.util.List) r4
            return r4
    }

    private final void startWeakRefCleanerThread() {
            r9 = this;
            kotlinx.coroutines.debug.internal.DebugProbesImpl$startWeakRefCleanerThread$1 r0 = kotlinx.coroutines.debug.internal.DebugProbesImpl.AnonymousClass1.INSTANCE
            r6 = r0
            kotlin.jvm.functions.Function0 r6 = (kotlin.jvm.functions.Function0) r6
            r7 = 21
            r8 = 0
            r1 = 0
            r2 = 1
            r3 = 0
            java.lang.String r4 = "Coroutines Debugger Cleaner"
            r5 = 0
            java.lang.Thread r0 = kotlin.concurrent.ThreadsKt.thread$default(r1, r2, r3, r4, r5, r6, r7, r8)
            kotlinx.coroutines.debug.internal.DebugProbesImpl.weakRefCleanerThread = r0
            return
    }

    private final void stopWeakRefCleanerThread() {
            r2 = this;
            java.lang.Thread r0 = kotlinx.coroutines.debug.internal.DebugProbesImpl.weakRefCleanerThread
            if (r0 != 0) goto L5
            return
        L5:
            r1 = 0
            kotlinx.coroutines.debug.internal.DebugProbesImpl.weakRefCleanerThread = r1
            r0.interrupt()
            r0.join()
            return
    }

    private final kotlinx.coroutines.debug.internal.StackTraceFrame toStackTraceFrame(java.util.List<java.lang.StackTraceElement> r11) {
            r10 = this;
            r0 = 0
            r1 = r11
            r2 = 0
            r3 = r0
            boolean r4 = r1.isEmpty()
            if (r4 != 0) goto L2b
            int r4 = r1.size()
            java.util.ListIterator r4 = r1.listIterator(r4)
        L13:
            boolean r5 = r4.hasPrevious()
            if (r5 == 0) goto L2b
            java.lang.Object r5 = r4.previous()
            java.lang.StackTraceElement r5 = (java.lang.StackTraceElement) r5
            r6 = r3
            r7 = 0
            kotlinx.coroutines.debug.internal.StackTraceFrame r8 = new kotlinx.coroutines.debug.internal.StackTraceFrame
            r9 = r6
            kotlin.coroutines.jvm.internal.CoroutineStackFrame r9 = (kotlin.coroutines.jvm.internal.CoroutineStackFrame) r9
            r8.<init>(r9, r5)
            r3 = r8
            goto L13
        L2b:
            r0 = r3
            kotlin.coroutines.jvm.internal.CoroutineStackFrame r0 = (kotlin.coroutines.jvm.internal.CoroutineStackFrame) r0
            java.lang.StackTraceElement r1 = kotlinx.coroutines.debug.internal.DebugProbesImpl.ARTIFICIAL_FRAME
            kotlinx.coroutines.debug.internal.StackTraceFrame r2 = new kotlinx.coroutines.debug.internal.StackTraceFrame
            r2.<init>(r0, r1)
            return r2
    }

    private final java.lang.String toStringRepr(java.lang.Object r2) {
            r1 = this;
            java.lang.String r0 = r2.toString()
            java.lang.String r0 = kotlinx.coroutines.debug.internal.DebugProbesImplKt.access$repr(r0)
            return r0
    }

    private final void updateRunningState(kotlin.coroutines.jvm.internal.CoroutineStackFrame r6, java.lang.String r7) {
            r5 = this;
            boolean r0 = r5.isInstalled$kotlinx_coroutines_debug()
            if (r0 != 0) goto L7
            return
        L7:
            r0 = 0
            kotlinx.coroutines.debug.internal.ConcurrentWeakMap<kotlin.coroutines.jvm.internal.CoroutineStackFrame, kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl> r1 = kotlinx.coroutines.debug.internal.DebugProbesImpl.callerInfoCache
            java.lang.Object r1 = r1.remove(r6)
            kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl r1 = (kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl) r1
            r2 = 0
            if (r1 == 0) goto L16
            r0 = r1
            r2 = 0
            goto L36
        L16:
            kotlinx.coroutines.debug.internal.DebugProbesImpl$CoroutineOwner r3 = r5.owner(r6)
            if (r3 == 0) goto L50
            kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl r3 = r3.info
            if (r3 != 0) goto L21
            goto L50
        L21:
            r0 = r3
            r2 = 1
            kotlin.coroutines.jvm.internal.CoroutineStackFrame r3 = r0.getLastObservedFrame$kotlinx_coroutines_core()
            if (r3 == 0) goto L2e
            kotlin.coroutines.jvm.internal.CoroutineStackFrame r3 = r5.realCaller(r3)
            goto L2f
        L2e:
            r3 = 0
        L2f:
            if (r3 == 0) goto L36
            kotlinx.coroutines.debug.internal.ConcurrentWeakMap<kotlin.coroutines.jvm.internal.CoroutineStackFrame, kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl> r4 = kotlinx.coroutines.debug.internal.DebugProbesImpl.callerInfoCache
            r4.remove(r3)
        L36:
            java.lang.String r3 = "null cannot be cast to non-null type kotlin.coroutines.Continuation<*>"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r6, r3)
            r3 = r6
            kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
            r0.updateState$kotlinx_coroutines_core(r7, r3, r2)
            kotlin.coroutines.jvm.internal.CoroutineStackFrame r3 = r5.realCaller(r6)
            if (r3 != 0) goto L48
            return
        L48:
            kotlinx.coroutines.debug.internal.ConcurrentWeakMap<kotlin.coroutines.jvm.internal.CoroutineStackFrame, kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl> r4 = kotlinx.coroutines.debug.internal.DebugProbesImpl.callerInfoCache
            java.util.Map r4 = (java.util.Map) r4
            r4.put(r3, r0)
            return
        L50:
            return
    }

    private final void updateState(kotlin.coroutines.Continuation<?> r3, java.lang.String r4) {
            r2 = this;
            boolean r0 = r2.isInstalled$kotlinx_coroutines_debug()
            if (r0 != 0) goto L7
            return
        L7:
            boolean r0 = kotlinx.coroutines.debug.internal.DebugProbesImpl.ignoreCoroutinesWithEmptyContext
            if (r0 == 0) goto L14
            kotlin.coroutines.CoroutineContext r0 = r3.getContext()
            kotlin.coroutines.EmptyCoroutineContext r1 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
            if (r0 != r1) goto L14
            return
        L14:
            java.lang.String r0 = "RUNNING"
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r4, r0)
            if (r0 == 0) goto L2c
            boolean r0 = r3 instanceof kotlin.coroutines.jvm.internal.CoroutineStackFrame
            if (r0 == 0) goto L24
            r0 = r3
            kotlin.coroutines.jvm.internal.CoroutineStackFrame r0 = (kotlin.coroutines.jvm.internal.CoroutineStackFrame) r0
            goto L25
        L24:
            r0 = 0
        L25:
            if (r0 != 0) goto L28
            return
        L28:
            r2.updateRunningState(r0, r4)
            return
        L2c:
            kotlinx.coroutines.debug.internal.DebugProbesImpl$CoroutineOwner r0 = r2.owner(r3)
            if (r0 != 0) goto L33
            return
        L33:
            r2.updateState(r0, r3, r4)
            return
    }

    private final void updateState(kotlinx.coroutines.debug.internal.DebugProbesImpl.CoroutineOwner<?> r3, kotlin.coroutines.Continuation<?> r4, java.lang.String r5) {
            r2 = this;
            boolean r0 = r2.isInstalled$kotlinx_coroutines_debug()
            if (r0 != 0) goto L7
            return
        L7:
            kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl r0 = r3.info
            r1 = 1
            r0.updateState$kotlinx_coroutines_core(r5, r4, r1)
            return
    }

    public final void dumpCoroutines(java.io.PrintStream r3) {
            r2 = this;
            monitor-enter(r3)
            r0 = 0
            kotlinx.coroutines.debug.internal.DebugProbesImpl r1 = kotlinx.coroutines.debug.internal.DebugProbesImpl.INSTANCE     // Catch: java.lang.Throwable -> Lc
            r1.dumpCoroutinesSynchronized(r3)     // Catch: java.lang.Throwable -> Lc
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r3)
            return
        Lc:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
    }

    public final java.util.List<kotlinx.coroutines.debug.internal.DebugCoroutineInfo> dumpCoroutinesInfo() {
            r5 = this;
            r0 = r5
            r1 = 0
            boolean r2 = r0.isInstalled$kotlinx_coroutines_debug()
            if (r2 == 0) goto L30
            java.util.Set r2 = r0.getCapturedCoroutines()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            kotlin.sequences.Sequence r2 = kotlin.collections.CollectionsKt.asSequence(r2)
            r3 = 0
            kotlinx.coroutines.debug.internal.DebugProbesImpl$dumpCoroutinesInfoImpl$$inlined$sortedBy$1 r4 = new kotlinx.coroutines.debug.internal.DebugProbesImpl$dumpCoroutinesInfoImpl$$inlined$sortedBy$1
            r4.<init>()
            java.util.Comparator r4 = (java.util.Comparator) r4
            kotlin.sequences.Sequence r2 = kotlin.sequences.SequencesKt.sortedWith(r2, r4)
            kotlinx.coroutines.debug.internal.DebugProbesImpl$dumpCoroutinesInfo$$inlined$dumpCoroutinesInfoImpl$1 r3 = new kotlinx.coroutines.debug.internal.DebugProbesImpl$dumpCoroutinesInfo$$inlined$dumpCoroutinesInfoImpl$1
            r3.<init>()
            kotlin.jvm.functions.Function1 r3 = (kotlin.jvm.functions.Function1) r3
            kotlin.sequences.Sequence r2 = kotlin.sequences.SequencesKt.mapNotNull(r2, r3)
            java.util.List r2 = kotlin.sequences.SequencesKt.toList(r2)
            return r2
        L30:
            r2 = 0
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "Debug probes are not installed"
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
    }

    public final java.lang.Object[] dumpCoroutinesInfoAsJsonAndReferences() {
            r15 = this;
            java.util.List r0 = r15.dumpCoroutinesInfo()
            int r1 = r0.size()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r1)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r1)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r1)
            java.util.Iterator r5 = r0.iterator()
        L1b:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto Ld2
            java.lang.Object r6 = r5.next()
            kotlinx.coroutines.debug.internal.DebugCoroutineInfo r6 = (kotlinx.coroutines.debug.internal.DebugCoroutineInfo) r6
            kotlin.coroutines.CoroutineContext r7 = r6.getContext()
            kotlinx.coroutines.CoroutineName$Key r8 = kotlinx.coroutines.CoroutineName.Key
            kotlin.coroutines.CoroutineContext$Key r8 = (kotlin.coroutines.CoroutineContext.Key) r8
            kotlin.coroutines.CoroutineContext$Element r8 = r7.get(r8)
            kotlinx.coroutines.CoroutineName r8 = (kotlinx.coroutines.CoroutineName) r8
            r9 = 0
            if (r8 == 0) goto L43
            java.lang.String r8 = r8.getName()
            if (r8 == 0) goto L43
            java.lang.String r8 = r15.toStringRepr(r8)
            goto L44
        L43:
            r8 = r9
        L44:
            kotlinx.coroutines.CoroutineDispatcher$Key r10 = kotlinx.coroutines.CoroutineDispatcher.Key
            kotlin.coroutines.CoroutineContext$Key r10 = (kotlin.coroutines.CoroutineContext.Key) r10
            kotlin.coroutines.CoroutineContext$Element r10 = r7.get(r10)
            kotlinx.coroutines.CoroutineDispatcher r10 = (kotlinx.coroutines.CoroutineDispatcher) r10
            if (r10 == 0) goto L55
            java.lang.String r10 = r15.toStringRepr(r10)
            goto L56
        L55:
            r10 = r9
        L56:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "\n                {\n                    \"name\": "
            java.lang.StringBuilder r11 = r11.append(r12)
            java.lang.StringBuilder r11 = r11.append(r8)
            java.lang.String r12 = ",\n                    \"id\": "
            java.lang.StringBuilder r11 = r11.append(r12)
            kotlinx.coroutines.CoroutineId$Key r12 = kotlinx.coroutines.CoroutineId.Key
            kotlin.coroutines.CoroutineContext$Key r12 = (kotlin.coroutines.CoroutineContext.Key) r12
            kotlin.coroutines.CoroutineContext$Element r12 = r7.get(r12)
            kotlinx.coroutines.CoroutineId r12 = (kotlinx.coroutines.CoroutineId) r12
            if (r12 == 0) goto L82
            long r12 = r12.getId()
            java.lang.Long r9 = java.lang.Long.valueOf(r12)
        L82:
            java.lang.StringBuilder r9 = r11.append(r9)
            java.lang.String r11 = ",\n                    \"dispatcher\": "
            java.lang.StringBuilder r9 = r9.append(r11)
            java.lang.StringBuilder r9 = r9.append(r10)
            java.lang.String r11 = ",\n                    \"sequenceNumber\": "
            java.lang.StringBuilder r9 = r9.append(r11)
            long r11 = r6.getSequenceNumber()
            java.lang.StringBuilder r9 = r9.append(r11)
            java.lang.String r11 = ",\n                    \"state\": \""
            java.lang.StringBuilder r9 = r9.append(r11)
            java.lang.String r11 = r6.getState()
            java.lang.StringBuilder r9 = r9.append(r11)
            java.lang.String r11 = "\"\n                } \n                "
            java.lang.StringBuilder r9 = r9.append(r11)
            java.lang.String r9 = r9.toString()
            java.lang.String r9 = kotlin.text.StringsKt.trimIndent(r9)
            r4.add(r9)
            kotlin.coroutines.jvm.internal.CoroutineStackFrame r9 = r6.getLastObservedFrame()
            r3.add(r9)
            java.lang.Thread r9 = r6.getLastObservedThread()
            r2.add(r9)
            goto L1b
        Ld2:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r6 = 91
            java.lang.StringBuilder r5 = r5.append(r6)
            r6 = r4
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            r13 = 63
            r14 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            java.lang.String r6 = kotlin.collections.CollectionsKt.joinToString$default(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            java.lang.StringBuilder r5 = r5.append(r6)
            r6 = 93
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r5 = r5.toString()
            r6 = r2
            java.util.Collection r6 = (java.util.Collection) r6
            r7 = 0
            r8 = r6
            r9 = 0
            java.lang.Thread[] r10 = new java.lang.Thread[r9]
            java.lang.Object[] r6 = r8.toArray(r10)
            r7 = r3
            java.util.Collection r7 = (java.util.Collection) r7
            r8 = 0
            r10 = r7
            kotlin.coroutines.jvm.internal.CoroutineStackFrame[] r11 = new kotlin.coroutines.jvm.internal.CoroutineStackFrame[r9]
            java.lang.Object[] r7 = r10.toArray(r11)
            r8 = r0
            java.util.Collection r8 = (java.util.Collection) r8
            r10 = 0
            r11 = r8
            kotlinx.coroutines.debug.internal.DebugCoroutineInfo[] r9 = new kotlinx.coroutines.debug.internal.DebugCoroutineInfo[r9]
            java.lang.Object[] r8 = r11.toArray(r9)
            java.lang.Object[] r5 = new java.lang.Object[]{r5, r6, r7, r8}
            return r5
    }

    public final java.util.List<kotlinx.coroutines.debug.internal.DebuggerInfo> dumpDebuggerInfo() {
            r5 = this;
            r0 = r5
            r1 = 0
            boolean r2 = r0.isInstalled$kotlinx_coroutines_debug()
            if (r2 == 0) goto L30
            java.util.Set r2 = r0.getCapturedCoroutines()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            kotlin.sequences.Sequence r2 = kotlin.collections.CollectionsKt.asSequence(r2)
            r3 = 0
            kotlinx.coroutines.debug.internal.DebugProbesImpl$dumpCoroutinesInfoImpl$$inlined$sortedBy$1 r4 = new kotlinx.coroutines.debug.internal.DebugProbesImpl$dumpCoroutinesInfoImpl$$inlined$sortedBy$1
            r4.<init>()
            java.util.Comparator r4 = (java.util.Comparator) r4
            kotlin.sequences.Sequence r2 = kotlin.sequences.SequencesKt.sortedWith(r2, r4)
            kotlinx.coroutines.debug.internal.DebugProbesImpl$dumpDebuggerInfo$$inlined$dumpCoroutinesInfoImpl$1 r3 = new kotlinx.coroutines.debug.internal.DebugProbesImpl$dumpDebuggerInfo$$inlined$dumpCoroutinesInfoImpl$1
            r3.<init>()
            kotlin.jvm.functions.Function1 r3 = (kotlin.jvm.functions.Function1) r3
            kotlin.sequences.Sequence r2 = kotlin.sequences.SequencesKt.mapNotNull(r2, r3)
            java.util.List r2 = kotlin.sequences.SequencesKt.toList(r2)
            return r2
        L30:
            r2 = 0
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "Debug probes are not installed"
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
    }

    public final java.util.List<java.lang.StackTraceElement> enhanceStackTraceWithThreadDump(kotlinx.coroutines.debug.internal.DebugCoroutineInfo r3, java.util.List<java.lang.StackTraceElement> r4) {
            r2 = this;
            java.lang.String r0 = r3.getState()
            java.lang.Thread r1 = r3.getLastObservedThread()
            java.util.List r0 = r2.enhanceStackTraceWithThreadDumpImpl(r0, r1, r4)
            return r0
    }

    public final java.lang.String enhanceStackTraceWithThreadDumpAsJson(kotlinx.coroutines.debug.internal.DebugCoroutineInfo r13) {
            r12 = this;
            java.util.List r0 = r13.lastObservedStackTrace()
            java.util.List r0 = r12.enhanceStackTraceWithThreadDump(r13, r0)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.List r1 = (java.util.List) r1
            java.util.Iterator r2 = r0.iterator()
        L13:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L7b
            java.lang.Object r3 = r2.next()
            java.lang.StackTraceElement r3 = (java.lang.StackTraceElement) r3
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "\n                {\n                    \"declaringClass\": \""
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r5 = r3.getClassName()
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r5 = "\",\n                    \"methodName\": \""
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r5 = r3.getMethodName()
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r5 = "\",\n                    \"fileName\": "
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r5 = r3.getFileName()
            if (r5 == 0) goto L54
            java.lang.String r5 = r12.toStringRepr(r5)
            goto L55
        L54:
            r5 = 0
        L55:
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r5 = ",\n                    \"lineNumber\": "
            java.lang.StringBuilder r4 = r4.append(r5)
            int r5 = r3.getLineNumber()
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r5 = "\n                }\n                "
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.String r4 = kotlin.text.StringsKt.trimIndent(r4)
            r1.add(r4)
            goto L13
        L7b:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r3 = 91
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r1
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            r10 = 63
            r11 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            java.lang.String r3 = kotlin.collections.CollectionsKt.joinToString$default(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = 93
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            return r2
    }

    public final boolean getEnableCreationStackTraces$kotlinx_coroutines_core() {
            r1 = this;
            boolean r0 = kotlinx.coroutines.debug.internal.DebugProbesImpl.enableCreationStackTraces
            return r0
    }

    public final boolean getIgnoreCoroutinesWithEmptyContext() {
            r1 = this;
            boolean r0 = kotlinx.coroutines.debug.internal.DebugProbesImpl.ignoreCoroutinesWithEmptyContext
            return r0
    }

    public final boolean getSanitizeStackTraces$kotlinx_coroutines_core() {
            r1 = this;
            boolean r0 = kotlinx.coroutines.debug.internal.DebugProbesImpl.sanitizeStackTraces
            return r0
    }

    public final java.lang.String hierarchyToString$kotlinx_coroutines_core(kotlinx.coroutines.Job r12) {
            r11 = this;
            boolean r0 = r11.isInstalled$kotlinx_coroutines_debug()
            if (r0 == 0) goto La6
            java.util.Set r0 = r11.getCapturedCoroutines()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            r1 = 0
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Collection r2 = (java.util.Collection) r2
            r3 = r0
            r4 = 0
            java.util.Iterator r5 = r3.iterator()
        L1b:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L42
            java.lang.Object r6 = r5.next()
            r7 = r6
            kotlinx.coroutines.debug.internal.DebugProbesImpl$CoroutineOwner r7 = (kotlinx.coroutines.debug.internal.DebugProbesImpl.CoroutineOwner) r7
            r8 = 0
            kotlin.coroutines.Continuation<T> r9 = r7.delegate
            kotlin.coroutines.CoroutineContext r9 = r9.getContext()
            kotlinx.coroutines.Job$Key r10 = kotlinx.coroutines.Job.Key
            kotlin.coroutines.CoroutineContext$Key r10 = (kotlin.coroutines.CoroutineContext.Key) r10
            kotlin.coroutines.CoroutineContext$Element r9 = r9.get(r10)
            if (r9 == 0) goto L3b
            r9 = 1
            goto L3c
        L3b:
            r9 = 0
        L3c:
            if (r9 == 0) goto L1b
            r2.add(r6)
            goto L1b
        L42:
            java.util.List r2 = (java.util.List) r2
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            r0 = 0
            r1 = 10
            int r1 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r2, r1)
            int r1 = kotlin.collections.MapsKt.mapCapacity(r1)
            r3 = 16
            int r1 = kotlin.ranges.RangesKt.coerceAtLeast(r1, r3)
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>(r1)
            java.util.Map r3 = (java.util.Map) r3
            r4 = r2
            r5 = 0
            java.util.Iterator r6 = r4.iterator()
        L67:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L89
            java.lang.Object r7 = r6.next()
            r8 = r7
            kotlinx.coroutines.debug.internal.DebugProbesImpl$CoroutineOwner r8 = (kotlinx.coroutines.debug.internal.DebugProbesImpl.CoroutineOwner) r8
            r9 = 0
            kotlin.coroutines.Continuation<T> r10 = r8.delegate
            kotlin.coroutines.CoroutineContext r10 = r10.getContext()
            kotlinx.coroutines.Job r8 = kotlinx.coroutines.JobKt.getJob(r10)
            r9 = r7
            kotlinx.coroutines.debug.internal.DebugProbesImpl$CoroutineOwner r9 = (kotlinx.coroutines.debug.internal.DebugProbesImpl.CoroutineOwner) r9
            r10 = 0
            kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl r9 = r9.info
            r3.put(r8, r9)
            goto L67
        L89:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = r0
            r2 = 0
            kotlinx.coroutines.debug.internal.DebugProbesImpl r4 = kotlinx.coroutines.debug.internal.DebugProbesImpl.INSTANCE
            java.lang.String r5 = ""
            r4.build(r12, r3, r1, r5)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "toString(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
        La6:
            r0 = 0
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Debug probes are not installed"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public final void install$kotlinx_coroutines_core() {
            r2 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = kotlinx.coroutines.debug.internal.DebugProbesImpl$DebugProbesImpl$VolatileWrapper$atomicfu$private.access$getInstallations$volatile$FU()
            kotlinx.coroutines.debug.internal.DebugProbesImpl$DebugProbesImpl$VolatileWrapper$atomicfu$private r1 = getDebugProbesImpl$VolatileWrapper$atomicfu$private()
            int r0 = r0.incrementAndGet(r1)
            r1 = 1
            if (r0 <= r1) goto L10
            return
        L10:
            r2.startWeakRefCleanerThread()
            kotlinx.coroutines.debug.internal.AgentInstallationType r0 = kotlinx.coroutines.debug.internal.AgentInstallationType.INSTANCE
            boolean r0 = r0.isInstalledStatically$kotlinx_coroutines_core()
            if (r0 == 0) goto L1c
            return
        L1c:
            kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> r0 = kotlinx.coroutines.debug.internal.DebugProbesImpl.dynamicAttach
            if (r0 == 0) goto L27
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r0.invoke(r1)
        L27:
            return
    }

    public final boolean isInstalled$kotlinx_coroutines_debug() {
            r2 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = kotlinx.coroutines.debug.internal.DebugProbesImpl$DebugProbesImpl$VolatileWrapper$atomicfu$private.access$getInstallations$volatile$FU()
            kotlinx.coroutines.debug.internal.DebugProbesImpl$DebugProbesImpl$VolatileWrapper$atomicfu$private r1 = getDebugProbesImpl$VolatileWrapper$atomicfu$private()
            int r0 = r0.get(r1)
            if (r0 <= 0) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            return r0
    }

    public final <T> kotlin.coroutines.Continuation<T> probeCoroutineCreated$kotlinx_coroutines_core(kotlin.coroutines.Continuation<? super T> r4) {
            r3 = this;
            boolean r0 = r3.isInstalled$kotlinx_coroutines_debug()
            if (r0 != 0) goto L7
            return r4
        L7:
            boolean r0 = kotlinx.coroutines.debug.internal.DebugProbesImpl.ignoreCoroutinesWithEmptyContext
            if (r0 == 0) goto L14
            kotlin.coroutines.CoroutineContext r0 = r4.getContext()
            kotlin.coroutines.EmptyCoroutineContext r1 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
            if (r0 != r1) goto L14
            return r4
        L14:
            kotlinx.coroutines.debug.internal.DebugProbesImpl$CoroutineOwner r0 = r3.owner(r4)
            if (r0 == 0) goto L1b
            return r4
        L1b:
            boolean r1 = kotlinx.coroutines.debug.internal.DebugProbesImpl.enableCreationStackTraces
            if (r1 == 0) goto L2f
            java.lang.Exception r1 = new java.lang.Exception
            r1.<init>()
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            java.util.List r1 = r3.sanitizeStackTrace(r1)
            kotlinx.coroutines.debug.internal.StackTraceFrame r1 = r3.toStackTraceFrame(r1)
            goto L30
        L2f:
            r1 = 0
        L30:
            kotlin.coroutines.Continuation r2 = r3.createOwner(r4, r1)
            return r2
    }

    public final void probeCoroutineResumed$kotlinx_coroutines_core(kotlin.coroutines.Continuation<?> r2) {
            r1 = this;
            java.lang.String r0 = "RUNNING"
            r1.updateState(r2, r0)
            return
    }

    public final void probeCoroutineSuspended$kotlinx_coroutines_core(kotlin.coroutines.Continuation<?> r2) {
            r1 = this;
            java.lang.String r0 = "SUSPENDED"
            r1.updateState(r2, r0)
            return
    }

    public final void setEnableCreationStackTraces$kotlinx_coroutines_core(boolean r1) {
            r0 = this;
            kotlinx.coroutines.debug.internal.DebugProbesImpl.enableCreationStackTraces = r1
            return
    }

    public final void setIgnoreCoroutinesWithEmptyContext(boolean r1) {
            r0 = this;
            kotlinx.coroutines.debug.internal.DebugProbesImpl.ignoreCoroutinesWithEmptyContext = r1
            return
    }

    public final void setSanitizeStackTraces$kotlinx_coroutines_core(boolean r1) {
            r0 = this;
            kotlinx.coroutines.debug.internal.DebugProbesImpl.sanitizeStackTraces = r1
            return
    }

    public final void uninstall$kotlinx_coroutines_core() {
            r2 = this;
            boolean r0 = r2.isInstalled$kotlinx_coroutines_debug()
            if (r0 == 0) goto L38
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = kotlinx.coroutines.debug.internal.DebugProbesImpl$DebugProbesImpl$VolatileWrapper$atomicfu$private.access$getInstallations$volatile$FU()
            kotlinx.coroutines.debug.internal.DebugProbesImpl$DebugProbesImpl$VolatileWrapper$atomicfu$private r1 = getDebugProbesImpl$VolatileWrapper$atomicfu$private()
            int r0 = r0.decrementAndGet(r1)
            if (r0 == 0) goto L15
            return
        L15:
            r2.stopWeakRefCleanerThread()
            kotlinx.coroutines.debug.internal.ConcurrentWeakMap<kotlinx.coroutines.debug.internal.DebugProbesImpl$CoroutineOwner<?>, java.lang.Boolean> r0 = kotlinx.coroutines.debug.internal.DebugProbesImpl.capturedCoroutinesMap
            r0.clear()
            kotlinx.coroutines.debug.internal.ConcurrentWeakMap<kotlin.coroutines.jvm.internal.CoroutineStackFrame, kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl> r0 = kotlinx.coroutines.debug.internal.DebugProbesImpl.callerInfoCache
            r0.clear()
            kotlinx.coroutines.debug.internal.AgentInstallationType r0 = kotlinx.coroutines.debug.internal.AgentInstallationType.INSTANCE
            boolean r0 = r0.isInstalledStatically$kotlinx_coroutines_core()
            if (r0 == 0) goto L2b
            return
        L2b:
            kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> r0 = kotlinx.coroutines.debug.internal.DebugProbesImpl.dynamicAttach
            if (r0 == 0) goto L37
            r1 = 0
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r0.invoke(r1)
        L37:
            return
        L38:
            r0 = 0
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Agent was not installed"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }
}
