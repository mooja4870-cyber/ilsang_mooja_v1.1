package kotlinx.coroutines.flow;

/* JADX INFO: compiled from: Distinct.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002Be\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005\u0012:\u0010\u0007\u001a6\u0012\u0015\u0012\u0013\u0018\u00010\u0006¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0015\u0012\u0013\u0018\u00010\u0006¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\b¢\u0006\u0002\u0010\u000eJ\u001c\u0010\u000f\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H\u0096@¢\u0006\u0002\u0010\u0013RD\u0010\u0007\u001a6\u0012\u0015\u0012\u0013\u0018\u00010\u0006¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0015\u0012\u0013\u0018\u00010\u0006¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lkotlinx/coroutines/flow/DistinctFlowImpl;", "T", "Lkotlinx/coroutines/flow/Flow;", "upstream", "keySelector", "Lkotlin/Function1;", "", "areEquivalent", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "old", "new", "", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)V", "collect", "", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class DistinctFlowImpl<T> implements kotlinx.coroutines.flow.Flow<T> {
    public final kotlin.jvm.functions.Function2<java.lang.Object, java.lang.Object, java.lang.Boolean> areEquivalent;
    public final kotlin.jvm.functions.Function1<T, java.lang.Object> keySelector;
    private final kotlinx.coroutines.flow.Flow<T> upstream;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.DistinctFlowImpl$collect$2, reason: invalid class name */
    /* JADX INFO: compiled from: Distinct.kt */
    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "T", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {
        final /* synthetic */ kotlinx.coroutines.flow.FlowCollector<T> $collector;
        final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef<java.lang.Object> $previousKey;
        final /* synthetic */ kotlinx.coroutines.flow.DistinctFlowImpl<T> this$0;

        AnonymousClass2(kotlinx.coroutines.flow.DistinctFlowImpl<T> r1, kotlin.jvm.internal.Ref.ObjectRef<java.lang.Object> r2, kotlinx.coroutines.flow.FlowCollector<? super T> r3) {
                r0 = this;
                r0.this$0 = r1
                r0.$previousKey = r2
                r0.$collector = r3
                r0.<init>()
                return
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final java.lang.Object emit(T r7, kotlin.coroutines.Continuation<? super kotlin.Unit> r8) {
                r6 = this;
                boolean r0 = r8 instanceof kotlinx.coroutines.flow.DistinctFlowImpl$collect$2$emit$1
                if (r0 == 0) goto L14
                r0 = r8
                kotlinx.coroutines.flow.DistinctFlowImpl$collect$2$emit$1 r0 = (kotlinx.coroutines.flow.DistinctFlowImpl$collect$2$emit$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r1 = r1 & r2
                if (r1 == 0) goto L14
                int r8 = r0.label
                int r8 = r8 - r2
                r0.label = r8
                goto L19
            L14:
                kotlinx.coroutines.flow.DistinctFlowImpl$collect$2$emit$1 r0 = new kotlinx.coroutines.flow.DistinctFlowImpl$collect$2$emit$1
                r0.<init>(r6, r8)
            L19:
                java.lang.Object r8 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.label
                switch(r2) {
                    case 0: goto L30;
                    case 1: goto L2c;
                    default: goto L24;
                }
            L24:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L2c:
                kotlin.ResultKt.throwOnFailure(r8)
                goto L59
            L30:
                kotlin.ResultKt.throwOnFailure(r8)
                r2 = r6
                kotlinx.coroutines.flow.DistinctFlowImpl<T> r3 = r2.this$0
                kotlin.jvm.functions.Function1<T, java.lang.Object> r3 = r3.keySelector
                java.lang.Object r3 = r3.invoke(r7)
                kotlin.jvm.internal.Ref$ObjectRef<java.lang.Object> r4 = r2.$previousKey
                T r4 = r4.element
                kotlinx.coroutines.internal.Symbol r5 = kotlinx.coroutines.flow.internal.NullSurrogateKt.NULL
                if (r4 == r5) goto L5c
                kotlinx.coroutines.flow.DistinctFlowImpl<T> r4 = r2.this$0
                kotlin.jvm.functions.Function2<java.lang.Object, java.lang.Object, java.lang.Boolean> r4 = r4.areEquivalent
                kotlin.jvm.internal.Ref$ObjectRef<java.lang.Object> r5 = r2.$previousKey
                T r5 = r5.element
                java.lang.Object r4 = r4.invoke(r5, r3)
                java.lang.Boolean r4 = (java.lang.Boolean) r4
                boolean r4 = r4.booleanValue()
                if (r4 != 0) goto L59
                goto L5c
            L59:
                kotlin.Unit r7 = kotlin.Unit.INSTANCE
                return r7
            L5c:
                kotlin.jvm.internal.Ref$ObjectRef<java.lang.Object> r4 = r2.$previousKey
                r4.element = r3
                kotlinx.coroutines.flow.FlowCollector<T> r3 = r2.$collector
                r4 = 1
                r0.label = r4
                java.lang.Object r7 = r3.emit(r7, r0)
                if (r7 != r1) goto L59
                return r1
        }
    }

    public DistinctFlowImpl(kotlinx.coroutines.flow.Flow<? extends T> r1, kotlin.jvm.functions.Function1<? super T, ? extends java.lang.Object> r2, kotlin.jvm.functions.Function2<java.lang.Object, java.lang.Object, java.lang.Boolean> r3) {
            r0 = this;
            r0.<init>()
            r0.upstream = r1
            r0.keySelector = r2
            r0.areEquivalent = r3
            return
    }

    @Override // kotlinx.coroutines.flow.Flow
    public java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super T> r4, kotlin.coroutines.Continuation<? super kotlin.Unit> r5) {
            r3 = this;
            kotlin.jvm.internal.Ref$ObjectRef r0 = new kotlin.jvm.internal.Ref$ObjectRef
            r0.<init>()
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.flow.internal.NullSurrogateKt.NULL
            r0.element = r1
            kotlinx.coroutines.flow.Flow<T> r1 = r3.upstream
            kotlinx.coroutines.flow.DistinctFlowImpl$collect$2 r2 = new kotlinx.coroutines.flow.DistinctFlowImpl$collect$2
            r2.<init>(r3, r0, r4)
            kotlinx.coroutines.flow.FlowCollector r2 = (kotlinx.coroutines.flow.FlowCollector) r2
            java.lang.Object r1 = r1.collect(r2, r5)
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r1 != r2) goto L1d
            return r1
        L1d:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            return r1
    }
}
