package kotlinx.coroutines.flow;

/* JADX INFO: compiled from: StateFlow.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\u001f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0006\u001a\u0002H\u0005¢\u0006\u0002\u0010\u0007\u001a6\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00050\t\"\u0004\b\u0000\u0010\u0005*\b\u0012\u0004\u0012\u0002H\u00050\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0000\u001a2\u0010\u0011\u001a\u0002H\u0005\"\u0004\b\u0000\u0010\u0005*\b\u0012\u0004\u0012\u0002H\u00050\u00042\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u0002H\u00050\u0013H\u0086\b¢\u0006\u0002\u0010\u0014\u001a-\u0010\u0015\u001a\u00020\u0016\"\u0004\b\u0000\u0010\u0005*\b\u0012\u0004\u0012\u0002H\u00050\u00042\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u0002H\u00050\u0013H\u0086\b\u001a2\u0010\u0017\u001a\u0002H\u0005\"\u0004\b\u0000\u0010\u0005*\b\u0012\u0004\u0012\u0002H\u00050\u00042\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u0002H\u00050\u0013H\u0086\b¢\u0006\u0002\u0010\u0014\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"NONE", "Lkotlinx/coroutines/internal/Symbol;", "PENDING", "MutableStateFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "T", "value", "(Ljava/lang/Object;)Lkotlinx/coroutines/flow/MutableStateFlow;", "fuseStateFlow", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/coroutines/flow/StateFlow;", "context", "Lkotlin/coroutines/CoroutineContext;", "capacity", "", "onBufferOverflow", "Lkotlinx/coroutines/channels/BufferOverflow;", "getAndUpdate", "function", "Lkotlin/Function1;", "(Lkotlinx/coroutines/flow/MutableStateFlow;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "update", "", "updateAndGet", "kotlinx-coroutines-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class StateFlowKt {
    private static final kotlinx.coroutines.internal.Symbol NONE = null;
    private static final kotlinx.coroutines.internal.Symbol PENDING = null;

    static {
            kotlinx.coroutines.internal.Symbol r0 = new kotlinx.coroutines.internal.Symbol
            java.lang.String r1 = "NONE"
            r0.<init>(r1)
            kotlinx.coroutines.flow.StateFlowKt.NONE = r0
            kotlinx.coroutines.internal.Symbol r0 = new kotlinx.coroutines.internal.Symbol
            java.lang.String r1 = "PENDING"
            r0.<init>(r1)
            kotlinx.coroutines.flow.StateFlowKt.PENDING = r0
            return
    }

    public static final <T> kotlinx.coroutines.flow.MutableStateFlow<T> MutableStateFlow(T r2) {
            kotlinx.coroutines.flow.StateFlowImpl r0 = new kotlinx.coroutines.flow.StateFlowImpl
            if (r2 != 0) goto L7
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.flow.internal.NullSurrogateKt.NULL
            goto L8
        L7:
            r1 = r2
        L8:
            r0.<init>(r1)
            kotlinx.coroutines.flow.MutableStateFlow r0 = (kotlinx.coroutines.flow.MutableStateFlow) r0
            return r0
    }

    public static final /* synthetic */ kotlinx.coroutines.internal.Symbol access$getNONE$p() {
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.flow.StateFlowKt.NONE
            return r0
    }

    public static final /* synthetic */ kotlinx.coroutines.internal.Symbol access$getPENDING$p() {
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.flow.StateFlowKt.PENDING
            return r0
    }

    public static final <T> kotlinx.coroutines.flow.Flow<T> fuseStateFlow(kotlinx.coroutines.flow.StateFlow<? extends T> r4, kotlin.coroutines.CoroutineContext r5, int r6, kotlinx.coroutines.channels.BufferOverflow r7) {
            boolean r0 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L18
            r0 = 0
            r3 = -1
            if (r6 == r3) goto Le
            r0 = r1
            goto Lf
        Le:
            r0 = r2
        Lf:
            if (r0 == 0) goto L12
            goto L18
        L12:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L18:
            if (r6 < 0) goto L1e
            r0 = 2
            if (r6 >= r0) goto L1e
            goto L1f
        L1e:
            r1 = r2
        L1f:
            if (r1 != 0) goto L24
            r0 = -2
            if (r6 != r0) goto L2c
        L24:
            kotlinx.coroutines.channels.BufferOverflow r0 = kotlinx.coroutines.channels.BufferOverflow.DROP_OLDEST
            if (r7 != r0) goto L2c
            r0 = r4
            kotlinx.coroutines.flow.Flow r0 = (kotlinx.coroutines.flow.Flow) r0
            return r0
        L2c:
            r0 = r4
            kotlinx.coroutines.flow.SharedFlow r0 = (kotlinx.coroutines.flow.SharedFlow) r0
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.SharedFlowKt.fuseSharedFlow(r0, r5, r6, r7)
            return r0
    }

    public static final <T> T getAndUpdate(kotlinx.coroutines.flow.MutableStateFlow<T> r4, kotlin.jvm.functions.Function1<? super T, ? extends T> r5) {
            r0 = 0
        L1:
            java.lang.Object r1 = r4.getValue()
            java.lang.Object r2 = r5.invoke(r1)
            boolean r3 = r4.compareAndSet(r1, r2)
            if (r3 == 0) goto L1
            return r1
    }

    public static final <T> void update(kotlinx.coroutines.flow.MutableStateFlow<T> r4, kotlin.jvm.functions.Function1<? super T, ? extends T> r5) {
            r0 = 0
        L1:
            java.lang.Object r1 = r4.getValue()
            java.lang.Object r2 = r5.invoke(r1)
            boolean r3 = r4.compareAndSet(r1, r2)
            if (r3 == 0) goto L1
            return
    }

    public static final <T> T updateAndGet(kotlinx.coroutines.flow.MutableStateFlow<T> r4, kotlin.jvm.functions.Function1<? super T, ? extends T> r5) {
            r0 = 0
        L1:
            java.lang.Object r1 = r4.getValue()
            java.lang.Object r2 = r5.invoke(r1)
            boolean r3 = r4.compareAndSet(r1, r2)
            if (r3 == 0) goto L1
            return r2
    }
}
