package kotlinx.coroutines;

/* JADX INFO: compiled from: DispatchedTask.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u000f\b!\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00060\u0002j\u0002`\u0003B\u000f\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0010¢\u0006\u0002\b\u0011J\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u000eH\u0010¢\u0006\u0002\b\u0014J\u001f\u0010\u0015\u001a\u0002H\u0001\"\u0004\b\u0001\u0010\u00012\b\u0010\u0013\u001a\u0004\u0018\u00010\u000eH\u0010¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u0018\u001a\u00020\f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u00102\b\u0010\u001a\u001a\u0004\u0018\u00010\u0010H\u0000¢\u0006\u0002\b\u001bJ\u0006\u0010\u001c\u001a\u00020\fJ\u000f\u0010\u001d\u001a\u0004\u0018\u00010\u000eH ¢\u0006\u0002\b\u001eR\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\bX \u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0012\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lkotlinx/coroutines/DispatchedTask;", "T", "Lkotlinx/coroutines/scheduling/Task;", "Lkotlinx/coroutines/SchedulerTask;", "resumeMode", "", "(I)V", "delegate", "Lkotlin/coroutines/Continuation;", "getDelegate$kotlinx_coroutines_core", "()Lkotlin/coroutines/Continuation;", "cancelCompletedResult", "", "takenState", "", "cause", "", "cancelCompletedResult$kotlinx_coroutines_core", "getExceptionalResult", "state", "getExceptionalResult$kotlinx_coroutines_core", "getSuccessfulResult", "getSuccessfulResult$kotlinx_coroutines_core", "(Ljava/lang/Object;)Ljava/lang/Object;", "handleFatalException", "exception", "finallyException", "handleFatalException$kotlinx_coroutines_core", "run", "takeState", "takeState$kotlinx_coroutines_core", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class DispatchedTask<T> extends kotlinx.coroutines.scheduling.Task {
    public int resumeMode;

    public DispatchedTask(int r1) {
            r0 = this;
            r0.<init>()
            r0.resumeMode = r1
            return
    }

    public void cancelCompletedResult$kotlinx_coroutines_core(java.lang.Object r1, java.lang.Throwable r2) {
            r0 = this;
            return
    }

    public abstract kotlin.coroutines.Continuation<T> getDelegate$kotlinx_coroutines_core();

    public java.lang.Throwable getExceptionalResult$kotlinx_coroutines_core(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof kotlinx.coroutines.CompletedExceptionally
            r1 = 0
            if (r0 == 0) goto L9
            r0 = r3
            kotlinx.coroutines.CompletedExceptionally r0 = (kotlinx.coroutines.CompletedExceptionally) r0
            goto La
        L9:
            r0 = r1
        La:
            if (r0 == 0) goto Le
            java.lang.Throwable r1 = r0.cause
        Le:
            return r1
    }

    public <T> T getSuccessfulResult$kotlinx_coroutines_core(java.lang.Object r1) {
            r0 = this;
            return r1
    }

    public final void handleFatalException$kotlinx_coroutines_core(java.lang.Throwable r5, java.lang.Throwable r6) {
            r4 = this;
            if (r5 != 0) goto L5
            if (r6 != 0) goto L5
            return
        L5:
            if (r5 == 0) goto Lc
            if (r6 == 0) goto Lc
            kotlin.ExceptionsKt.addSuppressed(r5, r6)
        Lc:
            if (r5 != 0) goto L10
            r0 = r6
            goto L11
        L10:
            r0 = r5
        L11:
            kotlinx.coroutines.CoroutinesInternalError r1 = new kotlinx.coroutines.CoroutinesInternalError
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Fatal exception in coroutines machinery for "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r4)
            java.lang.String r3 = ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers"
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            r1.<init>(r2, r0)
            kotlin.coroutines.Continuation r2 = r4.getDelegate$kotlinx_coroutines_core()
            kotlin.coroutines.CoroutineContext r2 = r2.getContext()
            r3 = r1
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            kotlinx.coroutines.CoroutineExceptionHandlerKt.handleCoroutineException(r2, r3)
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r21 = this;
            r1 = r21
            boolean r0 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            if (r0 == 0) goto L1a
            r0 = 0
            int r2 = r1.resumeMode
            r3 = -1
            if (r2 == r3) goto L10
            r2 = 1
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
            kotlinx.coroutines.scheduling.TaskContext r2 = r1.taskContext
            r3 = 0
            kotlin.coroutines.Continuation r0 = r1.getDelegate$kotlinx_coroutines_core()     // Catch: java.lang.Throwable -> L120
            java.lang.String r4 = "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0, r4)     // Catch: java.lang.Throwable -> L120
            kotlinx.coroutines.internal.DispatchedContinuation r0 = (kotlinx.coroutines.internal.DispatchedContinuation) r0     // Catch: java.lang.Throwable -> L120
            r4 = r0
            kotlin.coroutines.Continuation<T> r0 = r4.continuation     // Catch: java.lang.Throwable -> L120
            r5 = r0
            java.lang.Object r0 = r4.countOrElement     // Catch: java.lang.Throwable -> L120
            r6 = r0
            r7 = 0
            kotlin.coroutines.CoroutineContext r0 = r5.getContext()     // Catch: java.lang.Throwable -> L120
            r8 = r0
            java.lang.Object r0 = kotlinx.coroutines.internal.ThreadContextKt.updateThreadContext(r8, r6)     // Catch: java.lang.Throwable -> L120
            r9 = r0
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.internal.ThreadContextKt.NO_THREAD_ELEMENTS     // Catch: java.lang.Throwable -> L120
            r10 = 0
            if (r9 == r0) goto L4a
            kotlinx.coroutines.UndispatchedCoroutine r0 = kotlinx.coroutines.CoroutineContextKt.updateUndispatchedCompletion(r5, r8, r9)     // Catch: java.lang.Throwable -> L45
            goto L4b
        L45:
            r0 = move-exception
            r19 = r2
            goto L123
        L4a:
            r0 = r10
        L4b:
            r11 = r0
            r0 = 0
            kotlin.coroutines.CoroutineContext r12 = r5.getContext()     // Catch: java.lang.Throwable -> L10c
            java.lang.Object r13 = r1.takeState$kotlinx_coroutines_core()     // Catch: java.lang.Throwable -> L10c
            java.lang.Throwable r14 = r1.getExceptionalResult$kotlinx_coroutines_core(r13)     // Catch: java.lang.Throwable -> L10c
            if (r14 != 0) goto L76
            int r15 = r1.resumeMode     // Catch: java.lang.Throwable -> L6f
            boolean r15 = kotlinx.coroutines.DispatchedTaskKt.isCancellableMode(r15)     // Catch: java.lang.Throwable -> L6f
            if (r15 == 0) goto L76
            kotlinx.coroutines.Job$Key r10 = kotlinx.coroutines.Job.Key     // Catch: java.lang.Throwable -> L6f
            kotlin.coroutines.CoroutineContext$Key r10 = (kotlin.coroutines.CoroutineContext.Key) r10     // Catch: java.lang.Throwable -> L6f
            kotlin.coroutines.CoroutineContext$Element r10 = r12.get(r10)     // Catch: java.lang.Throwable -> L6f
            kotlinx.coroutines.Job r10 = (kotlinx.coroutines.Job) r10     // Catch: java.lang.Throwable -> L6f
            goto L76
        L6f:
            r0 = move-exception
            r19 = r2
            r20 = r4
            goto L111
        L76:
            if (r10 == 0) goto Lc5
            boolean r15 = r10.isActive()     // Catch: java.lang.Throwable -> L10c
            if (r15 != 0) goto Lc5
            java.util.concurrent.CancellationException r15 = r10.getCancellationException()     // Catch: java.lang.Throwable -> L10c
            r16 = r0
            r0 = r15
            java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch: java.lang.Throwable -> L10c
            r1.cancelCompletedResult$kotlinx_coroutines_core(r13, r0)     // Catch: java.lang.Throwable -> L10c
            r0 = r5
            r17 = 0
            kotlin.Result$Companion r18 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L10c
            r18 = 0
            boolean r19 = kotlinx.coroutines.DebugKt.getRECOVER_STACK_TRACES()     // Catch: java.lang.Throwable -> L10c
            if (r19 == 0) goto Lb1
            r19 = r2
            boolean r2 = r0 instanceof kotlin.coroutines.jvm.internal.CoroutineStackFrame     // Catch: java.lang.Throwable -> Lad
            if (r2 != 0) goto La0
            r20 = r4
            goto Lb5
        La0:
            r2 = r15
            java.lang.Throwable r2 = (java.lang.Throwable) r2     // Catch: java.lang.Throwable -> Lad
            r20 = r4
            r4 = r0
            kotlin.coroutines.jvm.internal.CoroutineStackFrame r4 = (kotlin.coroutines.jvm.internal.CoroutineStackFrame) r4     // Catch: java.lang.Throwable -> L10a
            java.lang.Throwable r2 = kotlinx.coroutines.internal.StackTraceRecoveryKt.access$recoverFromStackFrame(r2, r4)     // Catch: java.lang.Throwable -> L10a
            goto Lb8
        Lad:
            r0 = move-exception
            r20 = r4
            goto L111
        Lb1:
            r19 = r2
            r20 = r4
        Lb5:
            r2 = r15
            java.lang.Throwable r2 = (java.lang.Throwable) r2     // Catch: java.lang.Throwable -> L10a
        Lb8:
            java.lang.Object r2 = kotlin.ResultKt.createFailure(r2)     // Catch: java.lang.Throwable -> L10a
            java.lang.Object r2 = kotlin.Result.m153constructorimpl(r2)     // Catch: java.lang.Throwable -> L10a
            r0.resumeWith(r2)     // Catch: java.lang.Throwable -> L10a
            goto Le8
        Lc5:
            r16 = r0
            r19 = r2
            r20 = r4
            if (r14 == 0) goto Ldb
            kotlin.Result$Companion r0 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L10a
            java.lang.Object r0 = kotlin.ResultKt.createFailure(r14)     // Catch: java.lang.Throwable -> L10a
            java.lang.Object r0 = kotlin.Result.m153constructorimpl(r0)     // Catch: java.lang.Throwable -> L10a
            r5.resumeWith(r0)     // Catch: java.lang.Throwable -> L10a
            goto Le8
        Ldb:
            kotlin.Result$Companion r0 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L10a
            java.lang.Object r0 = r1.getSuccessfulResult$kotlinx_coroutines_core(r13)     // Catch: java.lang.Throwable -> L10a
            java.lang.Object r0 = kotlin.Result.m153constructorimpl(r0)     // Catch: java.lang.Throwable -> L10a
            r5.resumeWith(r0)     // Catch: java.lang.Throwable -> L10a
        Le8:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L10a
            if (r11 == 0) goto Lf4
            boolean r0 = r11.clearThreadContext()     // Catch: java.lang.Throwable -> L11e
            if (r0 == 0) goto Lf7
        Lf4:
            kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(r8, r9)     // Catch: java.lang.Throwable -> L11e
        Lf7:
            kotlin.Result$Companion r0 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L108
            r0 = r1
            kotlinx.coroutines.DispatchedTask r0 = (kotlinx.coroutines.DispatchedTask) r0     // Catch: java.lang.Throwable -> L108
            r2 = 0
            r19.afterTask()     // Catch: java.lang.Throwable -> L108
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L108
            java.lang.Object r0 = kotlin.Result.m153constructorimpl(r0)     // Catch: java.lang.Throwable -> L108
            goto L13e
        L108:
            r0 = move-exception
            goto L134
        L10a:
            r0 = move-exception
            goto L111
        L10c:
            r0 = move-exception
            r19 = r2
            r20 = r4
        L111:
            if (r11 == 0) goto L119
            boolean r2 = r11.clearThreadContext()     // Catch: java.lang.Throwable -> L11e
            if (r2 == 0) goto L11c
        L119:
            kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(r8, r9)     // Catch: java.lang.Throwable -> L11e
        L11c:
            throw r0     // Catch: java.lang.Throwable -> L11e
        L11e:
            r0 = move-exception
            goto L123
        L120:
            r0 = move-exception
            r19 = r2
        L123:
            r3 = r0
            kotlin.Result$Companion r0 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L133
            r0 = r21
            r2 = 0
            r19.afterTask()     // Catch: java.lang.Throwable -> L133
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L133
            java.lang.Object r0 = kotlin.Result.m153constructorimpl(r0)     // Catch: java.lang.Throwable -> L133
            goto L13e
        L133:
            r0 = move-exception
        L134:
            kotlin.Result$Companion r2 = kotlin.Result.Companion
            java.lang.Object r0 = kotlin.ResultKt.createFailure(r0)
            java.lang.Object r0 = kotlin.Result.m153constructorimpl(r0)
        L13e:
            java.lang.Throwable r2 = kotlin.Result.m156exceptionOrNullimpl(r0)
            r1.handleFatalException$kotlinx_coroutines_core(r3, r2)
            return
    }

    public abstract java.lang.Object takeState$kotlinx_coroutines_core();
}
