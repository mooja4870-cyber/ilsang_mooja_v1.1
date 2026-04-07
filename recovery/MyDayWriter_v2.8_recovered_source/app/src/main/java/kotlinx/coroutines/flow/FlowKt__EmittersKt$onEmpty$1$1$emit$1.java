package kotlinx.coroutines.flow;

/* JADX INFO: compiled from: Emitters.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$onEmpty$1$1", f = "Emitters.kt", i = {}, l = {181}, m = "emit", n = {}, s = {})
final class FlowKt__EmittersKt$onEmpty$1$1$emit$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int label;
    /* synthetic */ java.lang.Object result;
    final /* synthetic */ kotlinx.coroutines.flow.FlowKt__EmittersKt$onEmpty$1$1<T> this$0;

    FlowKt__EmittersKt$onEmpty$1$1$emit$1(kotlinx.coroutines.flow.FlowKt__EmittersKt$onEmpty$1$1<? super T> r1, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.FlowKt__EmittersKt$onEmpty$1$1$emit$1> r2) {
            r0 = this;
            r0.this$0 = r1
            r0.<init>(r2)
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
            kotlinx.coroutines.flow.FlowKt__EmittersKt$onEmpty$1$1<T> r0 = r3.this$0
            r1 = 0
            r2 = r3
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            java.lang.Object r0 = r0.emit(r1, r2)
            return r0
    }
}
