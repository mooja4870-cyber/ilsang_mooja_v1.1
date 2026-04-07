package kotlinx.coroutines.flow;

/* JADX INFO: compiled from: Share.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharingDeferred$1", f = "Share.kt", i = {}, l = {336}, m = "invokeSuspend", n = {}, s = {})
final class FlowKt__ShareKt$launchSharingDeferred$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlinx.coroutines.CompletableDeferred<kotlinx.coroutines.flow.StateFlow<T>> $result;
    final /* synthetic */ kotlinx.coroutines.flow.Flow<T> $upstream;
    private /* synthetic */ java.lang.Object L$0;
    int label;


    FlowKt__ShareKt$launchSharingDeferred$1(kotlinx.coroutines.flow.Flow<? extends T> r2, kotlinx.coroutines.CompletableDeferred<kotlinx.coroutines.flow.StateFlow<T>> r3, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharingDeferred$1> r4) {
            r1 = this;
            r1.$upstream = r2
            r1.$result = r3
            r0 = 2
            r1.<init>(r0, r4)
            return
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object r4, kotlin.coroutines.Continuation<?> r5) {
            r3 = this;
            kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharingDeferred$1 r0 = new kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharingDeferred$1
            kotlinx.coroutines.flow.Flow<T> r1 = r3.$upstream
            kotlinx.coroutines.CompletableDeferred<kotlinx.coroutines.flow.StateFlow<T>> r2 = r3.$result
            r0.<init>(r1, r2, r5)
            r0.L$0 = r4
            kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
            return r0
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope r2, kotlin.coroutines.Continuation<? super kotlin.Unit> r3) {
            r1 = this;
            kotlinx.coroutines.CoroutineScope r2 = (kotlinx.coroutines.CoroutineScope) r2
            kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
            java.lang.Object r0 = r1.invoke2(r2, r3)
            return r0
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final java.lang.Object invoke2(kotlinx.coroutines.CoroutineScope r3, kotlin.coroutines.Continuation<? super kotlin.Unit> r4) {
            r2 = this;
            kotlin.coroutines.Continuation r0 = r2.create(r3, r4)
            kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharingDeferred$1 r0 = (kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharingDeferred$1) r0
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            java.lang.Object r0 = r0.invokeSuspend(r1)
            return r0
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            r9 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r9.label
            switch(r1) {
                case 0: goto L18;
                case 1: goto L11;
                default: goto L9;
            }
        L9:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L11:
            r0 = r9
            kotlin.ResultKt.throwOnFailure(r10)     // Catch: java.lang.Throwable -> L16
            goto L3f
        L16:
            r1 = move-exception
            goto L47
        L18:
            kotlin.ResultKt.throwOnFailure(r10)
            r1 = r9
            java.lang.Object r2 = r1.L$0
            kotlinx.coroutines.CoroutineScope r2 = (kotlinx.coroutines.CoroutineScope) r2
            kotlin.jvm.internal.Ref$ObjectRef r3 = new kotlin.jvm.internal.Ref$ObjectRef     // Catch: java.lang.Throwable -> L43
            r3.<init>()     // Catch: java.lang.Throwable -> L43
            kotlinx.coroutines.flow.Flow<T> r4 = r1.$upstream     // Catch: java.lang.Throwable -> L43
            kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharingDeferred$1$1 r5 = new kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharingDeferred$1$1     // Catch: java.lang.Throwable -> L43
            kotlinx.coroutines.CompletableDeferred<kotlinx.coroutines.flow.StateFlow<T>> r6 = r1.$result     // Catch: java.lang.Throwable -> L43
            r5.<init>(r3, r2, r6)     // Catch: java.lang.Throwable -> L43
            kotlinx.coroutines.flow.FlowCollector r5 = (kotlinx.coroutines.flow.FlowCollector) r5     // Catch: java.lang.Throwable -> L43
            r6 = r1
            kotlin.coroutines.Continuation r6 = (kotlin.coroutines.Continuation) r6     // Catch: java.lang.Throwable -> L43
            r7 = 1
            r1.label = r7     // Catch: java.lang.Throwable -> L43
            java.lang.Object r4 = r4.collect(r5, r6)     // Catch: java.lang.Throwable -> L43
            if (r4 != r0) goto L3e
            return r0
        L3e:
            r0 = r1
        L3f:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            return r1
        L43:
            r0 = move-exception
            r8 = r1
            r1 = r0
            r0 = r8
        L47:
            kotlinx.coroutines.CompletableDeferred<kotlinx.coroutines.flow.StateFlow<T>> r2 = r0.$result
            r2.completeExceptionally(r1)
            throw r1
    }
}
