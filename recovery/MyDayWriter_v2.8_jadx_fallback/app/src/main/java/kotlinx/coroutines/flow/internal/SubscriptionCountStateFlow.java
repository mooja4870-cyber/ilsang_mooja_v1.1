package kotlinx.coroutines.flow.internal;

/* JADX INFO: compiled from: AbstractSharedFlow.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0002\u0010\u0005J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0002R\u0014\u0010\u0006\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lkotlinx/coroutines/flow/internal/SubscriptionCountStateFlow;", "Lkotlinx/coroutines/flow/StateFlow;", "", "Lkotlinx/coroutines/flow/SharedFlowImpl;", "initialValue", "(I)V", "value", "getValue", "()Ljava/lang/Integer;", "increment", "", "delta", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class SubscriptionCountStateFlow extends kotlinx.coroutines.flow.SharedFlowImpl<java.lang.Integer> implements kotlinx.coroutines.flow.StateFlow<java.lang.Integer> {
    public SubscriptionCountStateFlow(int r4) {
            r3 = this;
            r0 = 2147483647(0x7fffffff, float:NaN)
            kotlinx.coroutines.channels.BufferOverflow r1 = kotlinx.coroutines.channels.BufferOverflow.DROP_OLDEST
            r2 = 1
            r3.<init>(r2, r0, r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            r3.tryEmit(r0)
            return
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlinx.coroutines.flow.StateFlow
    public java.lang.Integer getValue() {
            r4 = this;
            r0 = 0
            r1 = 0
            monitor-enter(r4)
            r2 = 0
            java.lang.Object r3 = r4.getLastReplayedLocked()     // Catch: java.lang.Throwable -> L16
            java.lang.Number r3 = (java.lang.Number) r3     // Catch: java.lang.Throwable -> L16
            int r3 = r3.intValue()     // Catch: java.lang.Throwable -> L16
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L16
            monitor-exit(r4)
            return r2
        L16:
            r2 = move-exception
            monitor-exit(r4)
            throw r2
    }

    @Override // kotlinx.coroutines.flow.StateFlow
    public /* bridge */ /* synthetic */ java.lang.Integer getValue() {
            r1 = this;
            java.lang.Integer r0 = r1.getValue()
            return r0
    }

    public final boolean increment(int r5) {
            r4 = this;
            r0 = 0
            r1 = 0
            monitor-enter(r4)
            r2 = 0
            java.lang.Object r3 = r4.getLastReplayedLocked()     // Catch: java.lang.Throwable -> L1b
            java.lang.Number r3 = (java.lang.Number) r3     // Catch: java.lang.Throwable -> L1b
            int r3 = r3.intValue()     // Catch: java.lang.Throwable -> L1b
            int r3 = r3 + r5
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L1b
            boolean r3 = r4.tryEmit(r3)     // Catch: java.lang.Throwable -> L1b
            monitor-exit(r4)
            return r3
        L1b:
            r2 = move-exception
            monitor-exit(r4)
            throw r2
    }
}
