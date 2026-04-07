package kotlinx.coroutines;

/* JADX INFO: compiled from: AbstractCoroutine.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u00022\u00020\u00032\b\u0012\u0004\u0012\u0002H\u00010\u00042\u00020\u0005B\u001d\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0002\u0010\u000bJ\u0012\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0014J\b\u0010\u0019\u001a\u00020\u001aH\u0014J\u0015\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u001dH\u0000¢\u0006\u0002\b\u001eJ\r\u0010\u001f\u001a\u00020\u001aH\u0010¢\u0006\u0002\b J\u0018\u0010!\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020\u001d2\u0006\u0010#\u001a\u00020\tH\u0014J\u0015\u0010$\u001a\u00020\u00162\u0006\u0010%\u001a\u00028\u0000H\u0014¢\u0006\u0002\u0010&J\u0012\u0010'\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0004J\u0019\u0010(\u001a\u00020\u00162\f\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000*¢\u0006\u0002\u0010&JJ\u0010+\u001a\u00020\u0016\"\u0004\b\u0001\u0010,2\u0006\u0010+\u001a\u00020-2\u0006\u0010.\u001a\u0002H,2'\u0010/\u001a#\b\u0001\u0012\u0004\u0012\u0002H,\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u001800¢\u0006\u0002\b1¢\u0006\u0002\u00102R\u0017\u0010\f\u001a\u00020\u0007¢\u0006\u000e\n\u0000\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u00063"}, d2 = {"Lkotlinx/coroutines/AbstractCoroutine;", "T", "Lkotlinx/coroutines/JobSupport;", "Lkotlinx/coroutines/Job;", "Lkotlin/coroutines/Continuation;", "Lkotlinx/coroutines/CoroutineScope;", "parentContext", "Lkotlin/coroutines/CoroutineContext;", "initParentJob", "", "active", "(Lkotlin/coroutines/CoroutineContext;ZZ)V", "context", "getContext$annotations", "()V", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "getCoroutineContext", "isActive", "()Z", "afterResume", "", "state", "", "cancellationExceptionMessage", "", "handleOnCompletionException", "exception", "", "handleOnCompletionException$kotlinx_coroutines_core", "nameString", "nameString$kotlinx_coroutines_core", "onCancelled", "cause", "handled", "onCompleted", "value", "(Ljava/lang/Object;)V", "onCompletionInternal", "resumeWith", "result", "Lkotlin/Result;", "start", "R", "Lkotlinx/coroutines/CoroutineStart;", "receiver", "block", "Lkotlin/Function2;", "Lkotlin/ExtensionFunctionType;", "(Lkotlinx/coroutines/CoroutineStart;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class AbstractCoroutine<T> extends kotlinx.coroutines.JobSupport implements kotlinx.coroutines.Job, kotlin.coroutines.Continuation<T>, kotlinx.coroutines.CoroutineScope {
    private final kotlin.coroutines.CoroutineContext context;

    public AbstractCoroutine(kotlin.coroutines.CoroutineContext r2, boolean r3, boolean r4) {
            r1 = this;
            r1.<init>(r4)
            if (r3 == 0) goto L13
            kotlinx.coroutines.Job$Key r0 = kotlinx.coroutines.Job.Key
            kotlin.coroutines.CoroutineContext$Key r0 = (kotlin.coroutines.CoroutineContext.Key) r0
            kotlin.coroutines.CoroutineContext$Element r0 = r2.get(r0)
            kotlinx.coroutines.Job r0 = (kotlinx.coroutines.Job) r0
            r1.initParentJob(r0)
        L13:
            r0 = r1
            kotlin.coroutines.CoroutineContext r0 = (kotlin.coroutines.CoroutineContext) r0
            kotlin.coroutines.CoroutineContext r0 = r2.plus(r0)
            r1.context = r0
            return
    }

    public static /* synthetic */ void getContext$annotations() {
            return
    }

    protected void afterResume(java.lang.Object r1) {
            r0 = this;
            r0.afterCompletion(r1)
            return
    }

    @Override // kotlinx.coroutines.JobSupport
    protected java.lang.String cancellationExceptionMessage() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = kotlinx.coroutines.DebugStringsKt.getClassSimpleName(r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " was cancelled"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // kotlin.coroutines.Continuation
    public final kotlin.coroutines.CoroutineContext getContext() {
            r1 = this;
            kotlin.coroutines.CoroutineContext r0 = r1.context
            return r0
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public kotlin.coroutines.CoroutineContext getCoroutineContext() {
            r1 = this;
            kotlin.coroutines.CoroutineContext r0 = r1.context
            return r0
    }

    @Override // kotlinx.coroutines.JobSupport
    public final void handleOnCompletionException$kotlinx_coroutines_core(java.lang.Throwable r2) {
            r1 = this;
            kotlin.coroutines.CoroutineContext r0 = r1.context
            kotlinx.coroutines.CoroutineExceptionHandlerKt.handleCoroutineException(r0, r2)
            return
    }

    @Override // kotlinx.coroutines.JobSupport, kotlinx.coroutines.Job
    public boolean isActive() {
            r1 = this;
            boolean r0 = super.isActive()
            return r0
    }

    @Override // kotlinx.coroutines.JobSupport
    public java.lang.String nameString$kotlinx_coroutines_core() {
            r3 = this;
            kotlin.coroutines.CoroutineContext r0 = r3.context
            java.lang.String r0 = kotlinx.coroutines.CoroutineContextKt.getCoroutineName(r0)
            if (r0 != 0) goto Ld
            java.lang.String r0 = super.nameString$kotlinx_coroutines_core()
            return r0
        Ld:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r2 = 34
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r0)
            java.lang.String r2 = "\":"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = super.nameString$kotlinx_coroutines_core()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            return r1
    }

    protected void onCancelled(java.lang.Throwable r1, boolean r2) {
            r0 = this;
            return
    }

    protected void onCompleted(T r1) {
            r0 = this;
            return
    }

    @Override // kotlinx.coroutines.JobSupport
    protected final void onCompletionInternal(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof kotlinx.coroutines.CompletedExceptionally
            if (r0 == 0) goto L14
            r0 = r3
            kotlinx.coroutines.CompletedExceptionally r0 = (kotlinx.coroutines.CompletedExceptionally) r0
            java.lang.Throwable r0 = r0.cause
            r1 = r3
            kotlinx.coroutines.CompletedExceptionally r1 = (kotlinx.coroutines.CompletedExceptionally) r1
            boolean r1 = r1.getHandled()
            r2.onCancelled(r0, r1)
            goto L17
        L14:
            r2.onCompleted(r3)
        L17:
            return
    }

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(java.lang.Object r3) {
            r2 = this;
            r0 = 0
            r1 = 1
            java.lang.Object r0 = kotlinx.coroutines.CompletionStateKt.toState$default(r3, r0, r1, r0)
            java.lang.Object r0 = r2.makeCompletingOnce$kotlinx_coroutines_core(r0)
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.JobSupportKt.COMPLETING_WAITING_CHILDREN
            if (r0 != r1) goto Lf
            return
        Lf:
            r2.afterResume(r0)
            return
    }

    public final <R> void start(kotlinx.coroutines.CoroutineStart r2, R r3, kotlin.jvm.functions.Function2<? super R, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> r4) {
            r1 = this;
            r0 = r1
            kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
            r2.invoke(r4, r3, r0)
            return
    }
}
