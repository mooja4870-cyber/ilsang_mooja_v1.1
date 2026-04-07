package kotlinx.coroutines.flow;

/* JADX INFO: Add missing generic type declarations: [R, T] */
/* JADX INFO: compiled from: Zip.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0006H\u008a@"}, d2 = {"<anonymous>", "", "T", "R", "Lkotlinx/coroutines/flow/FlowCollector;", "it", ""}, k = 3, mv = {1, 9, 0}, xi = 176)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$6$2", f = "Zip.kt", i = {}, l = {288, 288}, m = "invokeSuspend", n = {}, s = {})
public final class FlowKt__ZipKt$combine$6$2<R, T> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<kotlinx.coroutines.flow.FlowCollector<? super R>, T[], kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.functions.Function2<T[], kotlin.coroutines.Continuation<? super R>, java.lang.Object> $transform;
    private /* synthetic */ java.lang.Object L$0;
    /* synthetic */ java.lang.Object L$1;
    int label;

    public FlowKt__ZipKt$combine$6$2(kotlin.jvm.functions.Function2<? super T[], ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r2, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.FlowKt__ZipKt$combine$6$2> r3) {
            r1 = this;
            r1.$transform = r2
            r0 = 3
            r1.<init>(r0, r3)
            return
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r2, java.lang.Object r3, kotlin.coroutines.Continuation<? super kotlin.Unit> r4) {
            r1 = this;
            kotlinx.coroutines.flow.FlowCollector r2 = (kotlinx.coroutines.flow.FlowCollector) r2
            java.lang.Object[] r3 = (java.lang.Object[]) r3
            kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation) r4
            java.lang.Object r0 = r1.invoke(r2, r3, r4)
            return r0
    }

    public final java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super R> r3, T[] r4, kotlin.coroutines.Continuation<? super kotlin.Unit> r5) {
            r2 = this;
            kotlin.jvm.internal.Intrinsics.needClassReification()
            kotlinx.coroutines.flow.FlowKt__ZipKt$combine$6$2 r0 = new kotlinx.coroutines.flow.FlowKt__ZipKt$combine$6$2
            kotlin.jvm.functions.Function2<T[], kotlin.coroutines.Continuation<? super R>, java.lang.Object> r1 = r2.$transform
            r0.<init>(r1, r5)
            r0.L$0 = r3
            r0.L$1 = r4
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            java.lang.Object r0 = r0.invokeSuspend(r1)
            return r0
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            r7 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r7.label
            switch(r1) {
                case 0: goto L22;
                case 1: goto L16;
                case 2: goto L11;
                default: goto L9;
            }
        L9:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L11:
            r0 = r7
            kotlin.ResultKt.throwOnFailure(r8)
            goto L53
        L16:
            r1 = r7
            java.lang.Object r2 = r1.L$0
            kotlinx.coroutines.flow.FlowCollector r2 = (kotlinx.coroutines.flow.FlowCollector) r2
            kotlin.ResultKt.throwOnFailure(r8)
            r3 = r2
            r2 = r1
            r1 = r8
            goto L41
        L22:
            kotlin.ResultKt.throwOnFailure(r8)
            r1 = r7
            java.lang.Object r2 = r1.L$0
            kotlinx.coroutines.flow.FlowCollector r2 = (kotlinx.coroutines.flow.FlowCollector) r2
            java.lang.Object r3 = r1.L$1
            java.lang.Object[] r3 = (java.lang.Object[]) r3
            kotlin.jvm.functions.Function2<T[], kotlin.coroutines.Continuation<? super R>, java.lang.Object> r4 = r1.$transform
            r1.L$0 = r2
            r5 = 1
            r1.label = r5
            java.lang.Object r3 = r4.invoke(r3, r1)
            if (r3 != r0) goto L3c
            return r0
        L3c:
            r6 = r1
            r1 = r8
            r8 = r3
            r3 = r2
            r2 = r6
        L41:
            r4 = r2
            kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation) r4
            r5 = 0
            r2.L$0 = r5
            r5 = 2
            r2.label = r5
            java.lang.Object r8 = r3.emit(r8, r4)
            if (r8 != r0) goto L51
            return r0
        L51:
            r8 = r1
            r0 = r2
        L53:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            return r1
    }

    public final java.lang.Object invokeSuspend$$forInline(java.lang.Object r5) {
            r4 = this;
            java.lang.Object r0 = r4.L$0
            kotlinx.coroutines.flow.FlowCollector r0 = (kotlinx.coroutines.flow.FlowCollector) r0
            java.lang.Object r1 = r4.L$1
            java.lang.Object[] r1 = (java.lang.Object[]) r1
            kotlin.jvm.functions.Function2<T[], kotlin.coroutines.Continuation<? super R>, java.lang.Object> r2 = r4.$transform
            java.lang.Object r2 = r2.invoke(r1, r4)
            r3 = r4
            kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
            r0.emit(r2, r3)
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            return r2
    }
}
