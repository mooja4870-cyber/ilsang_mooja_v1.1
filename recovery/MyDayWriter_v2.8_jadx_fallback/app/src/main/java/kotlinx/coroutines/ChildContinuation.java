package kotlinx.coroutines;

/* JADX INFO: compiled from: JobSupport.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0011\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016R\u0014\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lkotlinx/coroutines/ChildContinuation;", "Lkotlinx/coroutines/JobCancellingNode;", "child", "Lkotlinx/coroutines/CancellableContinuationImpl;", "(Lkotlinx/coroutines/CancellableContinuationImpl;)V", "invoke", "", "cause", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ChildContinuation extends kotlinx.coroutines.JobCancellingNode {
    public final kotlinx.coroutines.CancellableContinuationImpl<?> child;

    public ChildContinuation(kotlinx.coroutines.CancellableContinuationImpl<?> r1) {
            r0 = this;
            r0.<init>()
            r0.child = r1
            return
    }

    @Override // kotlinx.coroutines.InternalCompletionHandler
    public void invoke(java.lang.Throwable r4) {
            r3 = this;
            kotlinx.coroutines.CancellableContinuationImpl<?> r0 = r3.child
            kotlinx.coroutines.CancellableContinuationImpl<?> r1 = r3.child
            kotlinx.coroutines.JobSupport r2 = r3.getJob()
            kotlinx.coroutines.Job r2 = (kotlinx.coroutines.Job) r2
            java.lang.Throwable r1 = r1.getContinuationCancellationCause(r2)
            r0.parentCancelled$kotlinx_coroutines_core(r1)
            return
    }
}
