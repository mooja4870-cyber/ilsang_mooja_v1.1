package kotlinx.coroutines.flow;

/* JADX INFO: compiled from: Limit.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__LimitKt", f = "Limit.kt", i = {0}, l = {70}, m = "emitAbort$FlowKt__LimitKt", n = {"ownershipMarker"}, s = {"L$0"})
final class FlowKt__LimitKt$emitAbort$1<T> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object L$0;
    int label;
    /* synthetic */ java.lang.Object result;

    FlowKt__LimitKt$emitAbort$1(kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.FlowKt__LimitKt$emitAbort$1> r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r3) {
            r2 = this;
            r2.result = r3
            int r0 = r2.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 | r1
            r2.label = r0
            r0 = 0
            r1 = r2
            kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
            java.lang.Object r0 = kotlinx.coroutines.flow.FlowKt__LimitKt.access$emitAbort$FlowKt__LimitKt(r0, r0, r0, r1)
            return r0
    }
}
