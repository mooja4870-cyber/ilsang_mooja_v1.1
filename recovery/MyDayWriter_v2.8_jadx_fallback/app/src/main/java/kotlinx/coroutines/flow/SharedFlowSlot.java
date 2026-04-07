package kotlinx.coroutines.flow;

/* JADX INFO: compiled from: SharedFlow.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\b\u0000\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0014\u0010\t\u001a\u00020\n2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016J'\u0010\f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\r2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0002\u0010\u000eR\u001a\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lkotlinx/coroutines/flow/SharedFlowSlot;", "Lkotlinx/coroutines/flow/internal/AbstractSharedFlowSlot;", "Lkotlinx/coroutines/flow/SharedFlowImpl;", "()V", "cont", "Lkotlin/coroutines/Continuation;", "", "index", "", "allocateLocked", "", "flow", "freeLocked", "", "(Lkotlinx/coroutines/flow/SharedFlowImpl;)[Lkotlin/coroutines/Continuation;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class SharedFlowSlot extends kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlinx.coroutines.flow.SharedFlowImpl<?>> {
    public kotlin.coroutines.Continuation<? super kotlin.Unit> cont;
    public long index;

    public SharedFlowSlot() {
            r2 = this;
            r2.<init>()
            r0 = -1
            r2.index = r0
            return
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot
    public /* bridge */ /* synthetic */ boolean allocateLocked(kotlinx.coroutines.flow.SharedFlowImpl<?> r2) {
            r1 = this;
            r0 = r2
            kotlinx.coroutines.flow.SharedFlowImpl r0 = (kotlinx.coroutines.flow.SharedFlowImpl) r0
            boolean r0 = r1.allocateLocked2(r0)
            return r0
    }

    /* JADX INFO: renamed from: allocateLocked, reason: avoid collision after fix types in other method */
    public boolean allocateLocked2(kotlinx.coroutines.flow.SharedFlowImpl<?> r5) {
            r4 = this;
            long r0 = r4.index
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto La
            r0 = 0
            return r0
        La:
            long r0 = r5.updateNewCollectorIndexLocked$kotlinx_coroutines_core()
            r4.index = r0
            r0 = 1
            return r0
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot
    public /* bridge */ /* synthetic */ kotlin.coroutines.Continuation[] freeLocked(kotlinx.coroutines.flow.SharedFlowImpl<?> r2) {
            r1 = this;
            r0 = r2
            kotlinx.coroutines.flow.SharedFlowImpl r0 = (kotlinx.coroutines.flow.SharedFlowImpl) r0
            kotlin.coroutines.Continuation[] r0 = r1.freeLocked2(r0)
            return r0
    }

    /* JADX INFO: renamed from: freeLocked, reason: avoid collision after fix types in other method */
    public kotlin.coroutines.Continuation<kotlin.Unit>[] freeLocked2(kotlinx.coroutines.flow.SharedFlowImpl<?> r6) {
            r5 = this;
            boolean r0 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            if (r0 == 0) goto L1b
            r0 = 0
            long r1 = r5.index
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 < 0) goto L11
            r1 = 1
            goto L12
        L11:
            r1 = 0
        L12:
            if (r1 == 0) goto L15
            goto L1b
        L15:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L1b:
            long r0 = r5.index
            r2 = -1
            r5.index = r2
            r2 = 0
            r5.cont = r2
            kotlin.coroutines.Continuation[] r2 = r6.updateCollectorIndexLocked$kotlinx_coroutines_core(r0)
            return r2
    }
}
