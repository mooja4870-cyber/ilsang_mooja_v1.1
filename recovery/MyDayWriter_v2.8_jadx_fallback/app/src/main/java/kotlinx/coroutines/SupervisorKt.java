package kotlinx.coroutines;

/* JADX INFO: compiled from: Supervisor.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0012\u0010\u0000\u001a\u00020\u00012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u001a\u0019\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0002\b\u0000\u001aJ\u0010\u0005\u001a\u0002H\u0006\"\u0004\b\u0000\u0010\u00062'\u0010\u0007\u001a#\b\u0001\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00060\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\b¢\u0006\u0002\b\fH\u0086@\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0002\u0010\r¨\u0006\u000e"}, d2 = {"SupervisorJob", "Lkotlinx/coroutines/CompletableJob;", "parent", "Lkotlinx/coroutines/Job;", "SupervisorJob0", "supervisorScope", "R", "block", "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class SupervisorKt {
    public static final kotlinx.coroutines.CompletableJob SupervisorJob(kotlinx.coroutines.Job r1) {
            kotlinx.coroutines.SupervisorJobImpl r0 = new kotlinx.coroutines.SupervisorJobImpl
            r0.<init>(r1)
            kotlinx.coroutines.CompletableJob r0 = (kotlinx.coroutines.CompletableJob) r0
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    /* JADX INFO: renamed from: SupervisorJob, reason: collision with other method in class */
    public static final /* synthetic */ kotlinx.coroutines.Job m1651SupervisorJob(kotlinx.coroutines.Job r1) {
            kotlinx.coroutines.CompletableJob r0 = SupervisorJob(r1)
            kotlinx.coroutines.Job r0 = (kotlinx.coroutines.Job) r0
            return r0
    }

    public static /* synthetic */ kotlinx.coroutines.CompletableJob SupervisorJob$default(kotlinx.coroutines.Job r0, int r1, java.lang.Object r2) {
            r1 = r1 & 1
            if (r1 == 0) goto L5
            r0 = 0
        L5:
            kotlinx.coroutines.CompletableJob r0 = SupervisorJob(r0)
            return r0
    }

    /* JADX INFO: renamed from: SupervisorJob$default, reason: collision with other method in class */
    public static /* synthetic */ kotlinx.coroutines.Job m1652SupervisorJob$default(kotlinx.coroutines.Job r0, int r1, java.lang.Object r2) {
            r1 = r1 & 1
            if (r1 == 0) goto L5
            r0 = 0
        L5:
            kotlinx.coroutines.Job r0 = m1651SupervisorJob(r0)
            return r0
    }

    public static final <R> java.lang.Object supervisorScope(kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r4, kotlin.coroutines.Continuation<? super R> r5) {
            r0 = r5
            r1 = 0
            kotlinx.coroutines.SupervisorCoroutine r2 = new kotlinx.coroutines.SupervisorCoroutine
            kotlin.coroutines.CoroutineContext r3 = r0.getContext()
            r2.<init>(r3, r0)
            r3 = r2
            kotlinx.coroutines.internal.ScopeCoroutine r3 = (kotlinx.coroutines.internal.ScopeCoroutine) r3
            java.lang.Object r0 = kotlinx.coroutines.intrinsics.UndispatchedKt.startUndispatchedOrReturn(r3, r2, r4)
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r0 != r1) goto L1c
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r5)
        L1c:
            return r0
    }
}
