package kotlinx.coroutines;

/* JADX INFO: compiled from: JobSupport.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b \u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0005¢\u0006\u0002\u0010\u0005J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016R\u0014\u0010\u0006\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0017"}, d2 = {"Lkotlinx/coroutines/JobNode;", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "Lkotlinx/coroutines/InternalCompletionHandler;", "Lkotlinx/coroutines/DisposableHandle;", "Lkotlinx/coroutines/Incomplete;", "()V", "isActive", "", "()Z", "job", "Lkotlinx/coroutines/JobSupport;", "getJob", "()Lkotlinx/coroutines/JobSupport;", "setJob", "(Lkotlinx/coroutines/JobSupport;)V", "list", "Lkotlinx/coroutines/NodeList;", "getList", "()Lkotlinx/coroutines/NodeList;", "dispose", "", "toString", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class JobNode extends kotlinx.coroutines.internal.LockFreeLinkedListNode implements kotlinx.coroutines.InternalCompletionHandler, kotlinx.coroutines.DisposableHandle, kotlinx.coroutines.Incomplete {
    public kotlinx.coroutines.JobSupport job;

    public JobNode() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // kotlinx.coroutines.DisposableHandle
    public void dispose() {
            r1 = this;
            kotlinx.coroutines.JobSupport r0 = r1.getJob()
            r0.removeNode$kotlinx_coroutines_core(r1)
            return
    }

    public final kotlinx.coroutines.JobSupport getJob() {
            r1 = this;
            kotlinx.coroutines.JobSupport r0 = r1.job
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.String r0 = "job"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)
            r0 = 0
            return r0
    }

    @Override // kotlinx.coroutines.Incomplete
    public kotlinx.coroutines.NodeList getList() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // kotlinx.coroutines.Incomplete
    public boolean isActive() {
            r1 = this;
            r0 = 1
            return r0
    }

    public final void setJob(kotlinx.coroutines.JobSupport r1) {
            r0 = this;
            r0.job = r1
            return
    }

    @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = kotlinx.coroutines.DebugStringsKt.getClassSimpleName(r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = 64
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = kotlinx.coroutines.DebugStringsKt.getHexAddress(r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "[job@"
            java.lang.StringBuilder r0 = r0.append(r1)
            kotlinx.coroutines.JobSupport r1 = r2.getJob()
            java.lang.String r1 = kotlinx.coroutines.DebugStringsKt.getHexAddress(r1)
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = 93
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
