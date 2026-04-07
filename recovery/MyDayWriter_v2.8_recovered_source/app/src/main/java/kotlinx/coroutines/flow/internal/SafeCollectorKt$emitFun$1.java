package kotlinx.coroutines.flow.internal;

/* JADX INFO: compiled from: SafeCollector.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* synthetic */ class SafeCollectorKt$emitFun$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function3<kotlinx.coroutines.flow.FlowCollector<? super java.lang.Object>, java.lang.Object, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object>, kotlin.coroutines.jvm.internal.SuspendFunction {
    public static final kotlinx.coroutines.flow.internal.SafeCollectorKt$emitFun$1 INSTANCE = null;

    static {
            kotlinx.coroutines.flow.internal.SafeCollectorKt$emitFun$1 r0 = new kotlinx.coroutines.flow.internal.SafeCollectorKt$emitFun$1
            r0.<init>()
            kotlinx.coroutines.flow.internal.SafeCollectorKt$emitFun$1.INSTANCE = r0
            return
    }

    SafeCollectorKt$emitFun$1() {
            r6 = this;
            java.lang.Class<kotlinx.coroutines.flow.FlowCollector> r2 = kotlinx.coroutines.flow.FlowCollector.class
            java.lang.String r4 = "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"
            r5 = 0
            r1 = 3
            java.lang.String r3 = "emit"
            r0 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super java.lang.Object> r3, java.lang.Object r4, kotlin.coroutines.Continuation<? super kotlin.Unit> r5) {
            r2 = this;
            r0 = r3
            kotlinx.coroutines.flow.FlowCollector r0 = (kotlinx.coroutines.flow.FlowCollector) r0
            r1 = r5
            kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
            java.lang.Object r0 = r2.invoke2(r0, r4, r1)
            return r0
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final java.lang.Object invoke2(kotlinx.coroutines.flow.FlowCollector<java.lang.Object> r2, java.lang.Object r3, kotlin.coroutines.Continuation<? super kotlin.Unit> r4) {
            r1 = this;
            java.lang.Object r0 = r2.emit(r3, r4)
            return r0
    }
}
