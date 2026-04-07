package kotlinx.coroutines.debug.internal;

/* JADX INFO: compiled from: DebugCoroutineInfoImpl.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B#\b\u0000\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0002J\u0013\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0000¢\u0006\u0002\b&J\b\u0010'\u001a\u00020\u000eH\u0016J)\u0010(\u001a\u00020)2\u0006\u0010 \u001a\u00020\u000e2\n\u0010*\u001a\u0006\u0012\u0002\b\u00030+2\u0006\u0010,\u001a\u00020-H\u0000¢\u0006\u0002\b.J\"\u0010/\u001a\u00020)*\b\u0012\u0004\u0012\u00020\u0015002\b\u0010*\u001a\u0004\u0018\u00010\fH\u0082P¢\u0006\u0002\u00101R\u0016\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\r\u001a\u00020\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R(\u0010\u0019\u001a\u0004\u0018\u00010\f2\b\u0010\u0018\u001a\u0004\u0018\u00010\f8@@@X\u0080\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u0004\u0018\u00010\u001f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010 \u001a\u00020\u000e8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u000e\u0010#\u001a\u00020$X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00062"}, d2 = {"Lkotlinx/coroutines/debug/internal/DebugCoroutineInfoImpl;", "", "context", "Lkotlin/coroutines/CoroutineContext;", "creationStackBottom", "Lkotlinx/coroutines/debug/internal/StackTraceFrame;", "sequenceNumber", "", "(Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/debug/internal/StackTraceFrame;J)V", "_context", "Ljava/lang/ref/WeakReference;", "_lastObservedFrame", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "_state", "", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "getCreationStackBottom$kotlinx_coroutines_core", "()Lkotlinx/coroutines/debug/internal/StackTraceFrame;", "creationStackTrace", "", "Ljava/lang/StackTraceElement;", "getCreationStackTrace", "()Ljava/util/List;", "value", "lastObservedFrame", "getLastObservedFrame$kotlinx_coroutines_core", "()Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "setLastObservedFrame$kotlinx_coroutines_core", "(Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;)V", "lastObservedThread", "Ljava/lang/Thread;", "state", "getState$kotlinx_coroutines_core", "()Ljava/lang/String;", "unmatchedResume", "", "lastObservedStackTrace", "lastObservedStackTrace$kotlinx_coroutines_core", "toString", "updateState", "", "frame", "Lkotlin/coroutines/Continuation;", "shouldBeMatched", "", "updateState$kotlinx_coroutines_core", "yieldFrames", "Lkotlin/sequences/SequenceScope;", "(Lkotlin/sequences/SequenceScope;Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class DebugCoroutineInfoImpl {
    private final java.lang.ref.WeakReference<kotlin.coroutines.CoroutineContext> _context;
    public volatile java.lang.ref.WeakReference<kotlin.coroutines.jvm.internal.CoroutineStackFrame> _lastObservedFrame;
    public volatile java.lang.String _state;
    private final kotlinx.coroutines.debug.internal.StackTraceFrame creationStackBottom;
    public volatile java.lang.Thread lastObservedThread;
    public final long sequenceNumber;
    private int unmatchedResume;

    /* JADX INFO: renamed from: kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl$creationStackTrace$1, reason: invalid class name */
    /* JADX INFO: compiled from: DebugCoroutineInfoImpl.kt */
    @kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlin/sequences/SequenceScope;", "Ljava/lang/StackTraceElement;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl$creationStackTrace$1", f = "DebugCoroutineInfoImpl.kt", i = {}, l = {162}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.RestrictedSuspendLambda implements kotlin.jvm.functions.Function2<kotlin.sequences.SequenceScope<? super java.lang.StackTraceElement>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ kotlinx.coroutines.debug.internal.StackTraceFrame $bottom;
        private /* synthetic */ java.lang.Object L$0;
        int label;
        final /* synthetic */ kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl this$0;

        AnonymousClass1(kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl r2, kotlinx.coroutines.debug.internal.StackTraceFrame r3, kotlin.coroutines.Continuation<? super kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl.AnonymousClass1> r4) {
                r1 = this;
                r1.this$0 = r2
                r1.$bottom = r3
                r0 = 2
                r1.<init>(r0, r4)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object r4, kotlin.coroutines.Continuation<?> r5) {
                r3 = this;
                kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl$creationStackTrace$1 r0 = new kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl$creationStackTrace$1
                kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl r1 = r3.this$0
                kotlinx.coroutines.debug.internal.StackTraceFrame r2 = r3.$bottom
                r0.<init>(r1, r2, r5)
                r0.L$0 = r4
                kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
                return r0
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(kotlin.sequences.SequenceScope<? super java.lang.StackTraceElement> r2, kotlin.coroutines.Continuation<? super kotlin.Unit> r3) {
                r1 = this;
                kotlin.sequences.SequenceScope r2 = (kotlin.sequences.SequenceScope) r2
                kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
                java.lang.Object r0 = r1.invoke2(r2, r3)
                return r0
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final java.lang.Object invoke2(kotlin.sequences.SequenceScope<? super java.lang.StackTraceElement> r3, kotlin.coroutines.Continuation<? super kotlin.Unit> r4) {
                r2 = this;
                kotlin.coroutines.Continuation r0 = r2.create(r3, r4)
                kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl$creationStackTrace$1 r0 = (kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl.AnonymousClass1) r0
                kotlin.Unit r1 = kotlin.Unit.INSTANCE
                java.lang.Object r0 = r0.invokeSuspend(r1)
                return r0
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
                r7 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r7.label
                switch(r1) {
                    case 0: goto L16;
                    case 1: goto L11;
                    default: goto L9;
                }
            L9:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L11:
                r0 = r7
                kotlin.ResultKt.throwOnFailure(r8)
                goto L34
            L16:
                kotlin.ResultKt.throwOnFailure(r8)
                r1 = r7
                java.lang.Object r2 = r1.L$0
                kotlin.sequences.SequenceScope r2 = (kotlin.sequences.SequenceScope) r2
                kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl r3 = r1.this$0
                kotlinx.coroutines.debug.internal.StackTraceFrame r4 = r1.$bottom
                kotlin.coroutines.jvm.internal.CoroutineStackFrame r4 = r4.getCallerFrame()
                r5 = r1
                kotlin.coroutines.Continuation r5 = (kotlin.coroutines.Continuation) r5
                r6 = 1
                r1.label = r6
                java.lang.Object r2 = kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl.access$yieldFrames(r3, r2, r4, r5)
                if (r2 != r0) goto L33
                return r0
            L33:
                r0 = r1
            L34:
                kotlin.Unit r1 = kotlin.Unit.INSTANCE
                return r1
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl$yieldFrames$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: DebugCoroutineInfoImpl.kt */
    @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl", f = "DebugCoroutineInfoImpl.kt", i = {0, 0, 0}, l = {167}, m = "yieldFrames", n = {"this", "$this$yieldFrames", "frame"}, s = {"L$0", "L$1", "L$2"})
    static final class C01111 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        int label;
        /* synthetic */ java.lang.Object result;
        final /* synthetic */ kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl this$0;

        C01111(kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl r1, kotlin.coroutines.Continuation<? super kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl.C01111> r2) {
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
                kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl r0 = r3.this$0
                r1 = 0
                r2 = r3
                kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
                java.lang.Object r0 = kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl.access$yieldFrames(r0, r1, r1, r2)
                return r0
        }
    }

    public DebugCoroutineInfoImpl(kotlin.coroutines.CoroutineContext r2, kotlinx.coroutines.debug.internal.StackTraceFrame r3, long r4) {
            r1 = this;
            r1.<init>()
            r1.creationStackBottom = r3
            r1.sequenceNumber = r4
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r2)
            r1._context = r0
            java.lang.String r0 = "CREATED"
            r1._state = r0
            return
    }

    public static final /* synthetic */ java.lang.Object access$yieldFrames(kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl r1, kotlin.sequences.SequenceScope r2, kotlin.coroutines.jvm.internal.CoroutineStackFrame r3, kotlin.coroutines.Continuation r4) {
            java.lang.Object r0 = r1.yieldFrames(r2, r3, r4)
            return r0
    }

    private final java.util.List<java.lang.StackTraceElement> creationStackTrace() {
            r3 = this;
            kotlinx.coroutines.debug.internal.StackTraceFrame r0 = r3.creationStackBottom
            if (r0 != 0) goto L9
            java.util.List r0 = kotlin.collections.CollectionsKt.emptyList()
            return r0
        L9:
            kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl$creationStackTrace$1 r1 = new kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl$creationStackTrace$1
            r2 = 0
            r1.<init>(r3, r0, r2)
            kotlin.jvm.functions.Function2 r1 = (kotlin.jvm.functions.Function2) r1
            kotlin.sequences.Sequence r1 = kotlin.sequences.SequencesKt.sequence(r1)
            java.util.List r1 = kotlin.sequences.SequencesKt.toList(r1)
            return r1
    }

    private final java.lang.Object yieldFrames(kotlin.sequences.SequenceScope<? super java.lang.StackTraceElement> r7, kotlin.coroutines.jvm.internal.CoroutineStackFrame r8, kotlin.coroutines.Continuation<? super kotlin.Unit> r9) {
            r6 = this;
            boolean r0 = r9 instanceof kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl.C01111
            if (r0 == 0) goto L14
            r0 = r9
            kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl$yieldFrames$1 r0 = (kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl.C01111) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r9 = r0.label
            int r9 = r9 - r2
            r0.label = r9
            goto L19
        L14:
            kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl$yieldFrames$1 r0 = new kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl$yieldFrames$1
            r0.<init>(r6, r9)
        L19:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            switch(r2) {
                case 0: goto L3d;
                case 1: goto L2c;
                default: goto L24;
            }
        L24:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L2c:
            r7 = 0
            java.lang.Object r8 = r0.L$2
            kotlin.coroutines.jvm.internal.CoroutineStackFrame r8 = (kotlin.coroutines.jvm.internal.CoroutineStackFrame) r8
            java.lang.Object r2 = r0.L$1
            kotlin.sequences.SequenceScope r2 = (kotlin.sequences.SequenceScope) r2
            java.lang.Object r3 = r0.L$0
            kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl r3 = (kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl) r3
            kotlin.ResultKt.throwOnFailure(r9)
            goto L60
        L3d:
            kotlin.ResultKt.throwOnFailure(r9)
            r2 = r6
            r3 = r2
            r2 = r7
        L43:
            if (r8 != 0) goto L48
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        L48:
            java.lang.StackTraceElement r7 = r8.getStackTraceElement()
            if (r7 == 0) goto L61
            r4 = 0
            r0.L$0 = r3
            r0.L$1 = r2
            r0.L$2 = r8
            r5 = 1
            r0.label = r5
            java.lang.Object r7 = r2.yield(r7, r0)
            if (r7 != r1) goto L5f
            return r1
        L5f:
            r7 = r4
        L60:
        L61:
            kotlin.coroutines.jvm.internal.CoroutineStackFrame r7 = r8.getCallerFrame()
            if (r7 == 0) goto L6a
        L68:
            r8 = r7
            goto L43
        L6a:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
    }

    public final kotlin.coroutines.CoroutineContext getContext() {
            r1 = this;
            java.lang.ref.WeakReference<kotlin.coroutines.CoroutineContext> r0 = r1._context
            java.lang.Object r0 = r0.get()
            kotlin.coroutines.CoroutineContext r0 = (kotlin.coroutines.CoroutineContext) r0
            return r0
    }

    public final kotlinx.coroutines.debug.internal.StackTraceFrame getCreationStackBottom$kotlinx_coroutines_core() {
            r1 = this;
            kotlinx.coroutines.debug.internal.StackTraceFrame r0 = r1.creationStackBottom
            return r0
    }

    public final java.util.List<java.lang.StackTraceElement> getCreationStackTrace() {
            r1 = this;
            java.util.List r0 = r1.creationStackTrace()
            return r0
    }

    public final kotlin.coroutines.jvm.internal.CoroutineStackFrame getLastObservedFrame$kotlinx_coroutines_core() {
            r1 = this;
            java.lang.ref.WeakReference<kotlin.coroutines.jvm.internal.CoroutineStackFrame> r0 = r1._lastObservedFrame
            if (r0 == 0) goto Lb
            java.lang.Object r0 = r0.get()
            kotlin.coroutines.jvm.internal.CoroutineStackFrame r0 = (kotlin.coroutines.jvm.internal.CoroutineStackFrame) r0
            goto Lc
        Lb:
            r0 = 0
        Lc:
            return r0
    }

    public final java.lang.String getState$kotlinx_coroutines_core() {
            r1 = this;
            java.lang.String r0 = r1._state
            return r0
    }

    public final java.util.List<java.lang.StackTraceElement> lastObservedStackTrace$kotlinx_coroutines_core() {
            r4 = this;
            kotlin.coroutines.jvm.internal.CoroutineStackFrame r0 = r4.getLastObservedFrame$kotlinx_coroutines_core()
            if (r0 != 0) goto Lb
            java.util.List r0 = kotlin.collections.CollectionsKt.emptyList()
            return r0
        Lb:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        L10:
            if (r0 == 0) goto L21
            java.lang.StackTraceElement r2 = r0.getStackTraceElement()
            if (r2 == 0) goto L1c
            r3 = 0
            r1.add(r2)
        L1c:
            kotlin.coroutines.jvm.internal.CoroutineStackFrame r0 = r0.getCallerFrame()
            goto L10
        L21:
            r2 = r1
            java.util.List r2 = (java.util.List) r2
            return r2
    }

    public final void setLastObservedFrame$kotlinx_coroutines_core(kotlin.coroutines.jvm.internal.CoroutineStackFrame r4) {
            r3 = this;
            if (r4 == 0) goto La
            r0 = r4
            r1 = 0
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference
            r2.<init>(r0)
            goto Lb
        La:
            r2 = 0
        Lb:
            r3._lastObservedFrame = r2
            return
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "DebugCoroutineInfo(state="
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = r2.getState$kotlinx_coroutines_core()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ",context="
            java.lang.StringBuilder r0 = r0.append(r1)
            kotlin.coroutines.CoroutineContext r1 = r2.getContext()
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = 41
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public final synchronized void updateState$kotlinx_coroutines_core(java.lang.String r3, kotlin.coroutines.Continuation<?> r4, boolean r5) {
            r2 = this;
            monitor-enter(r2)
            java.lang.String r0 = r2._state     // Catch: java.lang.Throwable -> L69
            java.lang.String r1 = "RUNNING"
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)     // Catch: java.lang.Throwable -> L69
            if (r0 == 0) goto L1c
            java.lang.String r0 = "RUNNING"
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r0)     // Catch: java.lang.Throwable -> L69
            if (r0 == 0) goto L1c
            if (r5 == 0) goto L1c
            int r0 = r2.unmatchedResume     // Catch: java.lang.Throwable -> L69
            int r0 = r0 + 1
            r2.unmatchedResume = r0     // Catch: java.lang.Throwable -> L69
            goto L30
        L1c:
            int r0 = r2.unmatchedResume     // Catch: java.lang.Throwable -> L69
            if (r0 <= 0) goto L30
            java.lang.String r0 = "SUSPENDED"
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r0)     // Catch: java.lang.Throwable -> L69
            if (r0 == 0) goto L30
            int r0 = r2.unmatchedResume     // Catch: java.lang.Throwable -> L69
            int r0 = r0 + (-1)
            r2.unmatchedResume = r0     // Catch: java.lang.Throwable -> L69
            monitor-exit(r2)
            return
        L30:
            java.lang.String r0 = r2._state     // Catch: java.lang.Throwable -> L69
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r3)     // Catch: java.lang.Throwable -> L69
            if (r0 == 0) goto L48
            java.lang.String r0 = "SUSPENDED"
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r0)     // Catch: java.lang.Throwable -> L69
            if (r0 == 0) goto L48
            kotlin.coroutines.jvm.internal.CoroutineStackFrame r0 = r2.getLastObservedFrame$kotlinx_coroutines_core()     // Catch: java.lang.Throwable -> L69
            if (r0 == 0) goto L48
            monitor-exit(r2)
            return
        L48:
            r2._state = r3     // Catch: java.lang.Throwable -> L69
            boolean r0 = r4 instanceof kotlin.coroutines.jvm.internal.CoroutineStackFrame     // Catch: java.lang.Throwable -> L69
            r1 = 0
            if (r0 == 0) goto L53
            r0 = r4
            kotlin.coroutines.jvm.internal.CoroutineStackFrame r0 = (kotlin.coroutines.jvm.internal.CoroutineStackFrame) r0     // Catch: java.lang.Throwable -> L69
            goto L54
        L53:
            r0 = r1
        L54:
            r2.setLastObservedFrame$kotlinx_coroutines_core(r0)     // Catch: java.lang.Throwable -> L69
            java.lang.String r0 = "RUNNING"
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r0)     // Catch: java.lang.Throwable -> L69
            if (r0 == 0) goto L64
            java.lang.Thread r1 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L69
            goto L65
        L64:
        L65:
            r2.lastObservedThread = r1     // Catch: java.lang.Throwable -> L69
            monitor-exit(r2)
            return
        L69:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L69
            throw r3
    }
}
