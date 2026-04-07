package kotlinx.coroutines.flow;

/* JADX INFO: compiled from: SharedFlow.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000J\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a0\u0010\u0002\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0003\"\u0004\b\u0000\u0010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t\u001a6\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00040\u000b\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0000\u001a#\u0010\u0010\u001a\u0004\u0018\u00010\u0011*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002¢\u0006\u0002\u0010\u0015\u001a+\u0010\u0016\u001a\u00020\u0017*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0018\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0002\u0010\u0019\"\u0010\u0010\u0000\u001a\u00020\u00018\u0000X\u0081\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"NO_VALUE", "Lkotlinx/coroutines/internal/Symbol;", "MutableSharedFlow", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "T", "replay", "", "extraBufferCapacity", "onBufferOverflow", "Lkotlinx/coroutines/channels/BufferOverflow;", "fuseSharedFlow", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/coroutines/flow/SharedFlow;", "context", "Lkotlin/coroutines/CoroutineContext;", "capacity", "getBufferAt", "", "", "index", "", "([Ljava/lang/Object;J)Ljava/lang/Object;", "setBufferAt", "", "item", "([Ljava/lang/Object;JLjava/lang/Object;)V", "kotlinx-coroutines-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class SharedFlowKt {
    public static final kotlinx.coroutines.internal.Symbol NO_VALUE = null;

    static {
            kotlinx.coroutines.internal.Symbol r0 = new kotlinx.coroutines.internal.Symbol
            java.lang.String r1 = "NO_VALUE"
            r0.<init>(r1)
            kotlinx.coroutines.flow.SharedFlowKt.NO_VALUE = r0
            return
    }

    public static final <T> kotlinx.coroutines.flow.MutableSharedFlow<T> MutableSharedFlow(int r3, int r4, kotlinx.coroutines.channels.BufferOverflow r5) {
            r0 = 1
            r1 = 0
            if (r3 < 0) goto L6
            r2 = r0
            goto L7
        L6:
            r2 = r1
        L7:
            if (r2 == 0) goto L69
            if (r4 < 0) goto Ld
            r2 = r0
            goto Le
        Ld:
            r2 = r1
        Le:
            if (r2 == 0) goto L4b
            if (r3 > 0) goto L1a
            if (r4 > 0) goto L1a
            kotlinx.coroutines.channels.BufferOverflow r2 = kotlinx.coroutines.channels.BufferOverflow.SUSPEND
            if (r5 != r2) goto L19
            goto L1a
        L19:
            r0 = r1
        L1a:
            if (r0 == 0) goto L2d
            int r0 = r3 + r4
            if (r0 >= 0) goto L24
            r1 = 2147483647(0x7fffffff, float:NaN)
            goto L25
        L24:
            r1 = r0
        L25:
            kotlinx.coroutines.flow.SharedFlowImpl r2 = new kotlinx.coroutines.flow.SharedFlowImpl
            r2.<init>(r3, r1, r5)
            kotlinx.coroutines.flow.MutableSharedFlow r2 = (kotlinx.coroutines.flow.MutableSharedFlow) r2
            return r2
        L2d:
            r0 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r5)
            java.lang.String r0 = r1.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L4b:
            r0 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "extraBufferCapacity cannot be negative, but was "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r4)
            java.lang.String r0 = r1.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L69:
            r0 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "replay cannot be negative, but was "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r0 = r1.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
    }

    public static /* synthetic */ kotlinx.coroutines.flow.MutableSharedFlow MutableSharedFlow$default(int r1, int r2, kotlinx.coroutines.channels.BufferOverflow r3, int r4, java.lang.Object r5) {
            r5 = r4 & 1
            r0 = 0
            if (r5 == 0) goto L6
            r1 = r0
        L6:
            r5 = r4 & 2
            if (r5 == 0) goto Lb
            r2 = r0
        Lb:
            r4 = r4 & 4
            if (r4 == 0) goto L11
            kotlinx.coroutines.channels.BufferOverflow r3 = kotlinx.coroutines.channels.BufferOverflow.SUSPEND
        L11:
            kotlinx.coroutines.flow.MutableSharedFlow r1 = MutableSharedFlow(r1, r2, r3)
            return r1
    }

    public static final /* synthetic */ java.lang.Object access$getBufferAt(java.lang.Object[] r1, long r2) {
            java.lang.Object r0 = getBufferAt(r1, r2)
            return r0
    }

    public static final /* synthetic */ void access$setBufferAt(java.lang.Object[] r0, long r1, java.lang.Object r3) {
            setBufferAt(r0, r1, r3)
            return
    }

    public static final <T> kotlinx.coroutines.flow.Flow<T> fuseSharedFlow(kotlinx.coroutines.flow.SharedFlow<? extends T> r2, kotlin.coroutines.CoroutineContext r3, int r4, kotlinx.coroutines.channels.BufferOverflow r5) {
            if (r4 == 0) goto L5
            r0 = -3
            if (r4 != r0) goto Ld
        L5:
            kotlinx.coroutines.channels.BufferOverflow r0 = kotlinx.coroutines.channels.BufferOverflow.SUSPEND
            if (r5 != r0) goto Ld
            r0 = r2
            kotlinx.coroutines.flow.Flow r0 = (kotlinx.coroutines.flow.Flow) r0
            return r0
        Ld:
            kotlinx.coroutines.flow.internal.ChannelFlowOperatorImpl r0 = new kotlinx.coroutines.flow.internal.ChannelFlowOperatorImpl
            r1 = r2
            kotlinx.coroutines.flow.Flow r1 = (kotlinx.coroutines.flow.Flow) r1
            r0.<init>(r1, r3, r4, r5)
            kotlinx.coroutines.flow.Flow r0 = (kotlinx.coroutines.flow.Flow) r0
            return r0
    }

    private static final java.lang.Object getBufferAt(java.lang.Object[] r2, long r3) {
            int r0 = (int) r3
            int r1 = r2.length
            int r1 = r1 + (-1)
            r0 = r0 & r1
            r0 = r2[r0]
            return r0
    }

    private static final void setBufferAt(java.lang.Object[] r2, long r3, java.lang.Object r5) {
            int r0 = (int) r3
            int r1 = r2.length
            int r1 = r1 + (-1)
            r0 = r0 & r1
            r2[r0] = r5
            return
    }
}
