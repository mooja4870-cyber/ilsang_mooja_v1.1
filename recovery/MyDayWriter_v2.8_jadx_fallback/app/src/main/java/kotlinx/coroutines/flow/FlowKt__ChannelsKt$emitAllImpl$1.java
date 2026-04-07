package kotlinx.coroutines.flow;

/* JADX INFO: compiled from: Channels.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ChannelsKt", f = "Channels.kt", i = {0, 0, 0, 1, 1, 1}, l = {32, 33}, m = "emitAllImpl$FlowKt__ChannelsKt", n = {"$this$emitAllImpl", "channel", "consume", "$this$emitAllImpl", "channel", "consume"}, s = {"L$0", "L$1", "Z$0", "L$0", "L$1", "Z$0"})
final class FlowKt__ChannelsKt$emitAllImpl$1<T> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object L$0;
    java.lang.Object L$1;
    java.lang.Object L$2;
    boolean Z$0;
    int label;
    /* synthetic */ java.lang.Object result;

    FlowKt__ChannelsKt$emitAllImpl$1(kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.FlowKt__ChannelsKt$emitAllImpl$1> r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r4) {
            r3 = this;
            r3.result = r4
            int r0 = r3.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 | r1
            r3.label = r0
            r0 = 0
            r1 = r3
            kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
            r2 = 0
            java.lang.Object r0 = kotlinx.coroutines.flow.FlowKt__ChannelsKt.access$emitAllImpl$FlowKt__ChannelsKt(r2, r2, r0, r1)
            return r0
    }
}
