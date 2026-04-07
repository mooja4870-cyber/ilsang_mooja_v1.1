package kotlinx.coroutines;

/* JADX INFO: compiled from: JobSupport.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0003\n\u0000\b\u0011\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\f\u001a\u00020\u0007H\u0016J\u0010\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0006\u001a\u00020\u0007H\u0003R\u0014\u0010\u0006\u001a\u00020\u0007X\u0090\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\t¨\u0006\u0010"}, d2 = {"Lkotlinx/coroutines/JobImpl;", "Lkotlinx/coroutines/JobSupport;", "Lkotlinx/coroutines/CompletableJob;", "parent", "Lkotlinx/coroutines/Job;", "(Lkotlinx/coroutines/Job;)V", "handlesException", "", "getHandlesException$kotlinx_coroutines_core", "()Z", "onCancelComplete", "getOnCancelComplete$kotlinx_coroutines_core", "complete", "completeExceptionally", "exception", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class JobImpl extends kotlinx.coroutines.JobSupport implements kotlinx.coroutines.CompletableJob {
    private final boolean handlesException;

    public JobImpl(kotlinx.coroutines.Job r2) {
            r1 = this;
            r0 = 1
            r1.<init>(r0)
            r1.initParentJob(r2)
            boolean r0 = r1.handlesException()
            r1.handlesException = r0
            return
    }

    private final boolean handlesException() {
            r5 = this;
            kotlinx.coroutines.ChildHandle r0 = r5.getParentHandle$kotlinx_coroutines_core()
            boolean r1 = r0 instanceof kotlinx.coroutines.ChildHandleNode
            r2 = 0
            if (r1 == 0) goto Lc
            kotlinx.coroutines.ChildHandleNode r0 = (kotlinx.coroutines.ChildHandleNode) r0
            goto Ld
        Lc:
            r0 = r2
        Ld:
            r1 = 0
            if (r0 == 0) goto L38
            kotlinx.coroutines.JobSupport r0 = r0.getJob()
            if (r0 != 0) goto L17
            goto L38
        L17:
            boolean r3 = r0.getHandlesException$kotlinx_coroutines_core()
            if (r3 == 0) goto L20
            r1 = 1
            return r1
        L20:
            kotlinx.coroutines.ChildHandle r3 = r0.getParentHandle$kotlinx_coroutines_core()
            boolean r4 = r3 instanceof kotlinx.coroutines.ChildHandleNode
            if (r4 == 0) goto L2b
            kotlinx.coroutines.ChildHandleNode r3 = (kotlinx.coroutines.ChildHandleNode) r3
            goto L2c
        L2b:
            r3 = r2
        L2c:
            if (r3 == 0) goto L37
            kotlinx.coroutines.JobSupport r3 = r3.getJob()
            if (r3 != 0) goto L35
            goto L37
        L35:
            r0 = r3
            goto L17
        L37:
            return r1
        L38:
            return r1
    }

    @Override // kotlinx.coroutines.CompletableJob
    public boolean complete() {
            r1 = this;
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            boolean r0 = r1.makeCompleting$kotlinx_coroutines_core(r0)
            return r0
    }

    @Override // kotlinx.coroutines.CompletableJob
    public boolean completeExceptionally(java.lang.Throwable r5) {
            r4 = this;
            kotlinx.coroutines.CompletedExceptionally r0 = new kotlinx.coroutines.CompletedExceptionally
            r1 = 2
            r2 = 0
            r3 = 0
            r0.<init>(r5, r3, r1, r2)
            boolean r0 = r4.makeCompleting$kotlinx_coroutines_core(r0)
            return r0
    }

    @Override // kotlinx.coroutines.JobSupport
    public boolean getHandlesException$kotlinx_coroutines_core() {
            r1 = this;
            boolean r0 = r1.handlesException
            return r0
    }

    @Override // kotlinx.coroutines.JobSupport
    public boolean getOnCancelComplete$kotlinx_coroutines_core() {
            r1 = this;
            r0 = 1
            return r0
    }
}
