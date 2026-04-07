package androidx.activity;

/* JADX INFO: compiled from: PipHintTracker.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", "Landroid/graphics/Rect;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.activity.PipHintTrackerKt$trackPipAnimationHintView$flow$1", f = "PipHintTracker.kt", i = {}, l = {86}, m = "invokeSuspend", n = {}, s = {})
final class PipHintTrackerKt$trackPipAnimationHintView$flow$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ProducerScope<? super android.graphics.Rect>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ android.view.View $view;
    private /* synthetic */ java.lang.Object L$0;
    int label;

    public static /* synthetic */ void $r8$lambda$EzNCIbjtfjz3Ar8jZpBbve6Davg(kotlinx.coroutines.channels.ProducerScope r0, android.view.View r1, int r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9) {
            invokeSuspend$lambda$0(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$JlDmmAtrK939XIgV9x1wNcsCteM(android.view.View r0, android.view.ViewTreeObserver.OnScrollChangedListener r1, android.view.View.OnLayoutChangeListener r2, androidx.activity.PipHintTrackerKt$trackPipAnimationHintView$flow$1$attachStateChangeListener$1 r3) {
            kotlin.Unit r0 = invokeSuspend$lambda$2(r0, r1, r2, r3)
            return r0
    }

    public static /* synthetic */ void $r8$lambda$noXGr5XZ6ZQiw0NE_bFNhh3sxIQ(kotlinx.coroutines.channels.ProducerScope r0, android.view.View r1) {
            invokeSuspend$lambda$1(r0, r1)
            return
    }

    PipHintTrackerKt$trackPipAnimationHintView$flow$1(android.view.View r2, kotlin.coroutines.Continuation<? super androidx.activity.PipHintTrackerKt$trackPipAnimationHintView$flow$1> r3) {
            r1 = this;
            r1.$view = r2
            r0 = 2
            r1.<init>(r0, r3)
            return
    }

    private static final void invokeSuspend$lambda$0(kotlinx.coroutines.channels.ProducerScope r1, android.view.View r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9, int r10) {
            if (r3 != r7) goto L8
            if (r5 != r9) goto L8
            if (r4 != r8) goto L8
            if (r6 == r10) goto L12
        L8:
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            android.graphics.Rect r0 = androidx.activity.PipHintTrackerKt.access$trackPipAnimationHintView$positionInWindow(r2)
            r1.mo1656trySendJP2dKIU(r0)
        L12:
            return
    }

    private static final void invokeSuspend$lambda$1(kotlinx.coroutines.channels.ProducerScope r1, android.view.View r2) {
            android.graphics.Rect r0 = androidx.activity.PipHintTrackerKt.access$trackPipAnimationHintView$positionInWindow(r2)
            r1.mo1656trySendJP2dKIU(r0)
            return
    }

    private static final kotlin.Unit invokeSuspend$lambda$2(android.view.View r1, android.view.ViewTreeObserver.OnScrollChangedListener r2, android.view.View.OnLayoutChangeListener r3, androidx.activity.PipHintTrackerKt$trackPipAnimationHintView$flow$1$attachStateChangeListener$1 r4) {
            android.view.ViewTreeObserver r0 = r1.getViewTreeObserver()
            r0.removeOnScrollChangedListener(r2)
            r1.removeOnLayoutChangeListener(r3)
            r0 = r4
            android.view.View$OnAttachStateChangeListener r0 = (android.view.View.OnAttachStateChangeListener) r0
            r1.removeOnAttachStateChangeListener(r0)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object r3, kotlin.coroutines.Continuation<?> r4) {
            r2 = this;
            androidx.activity.PipHintTrackerKt$trackPipAnimationHintView$flow$1 r0 = new androidx.activity.PipHintTrackerKt$trackPipAnimationHintView$flow$1
            android.view.View r1 = r2.$view
            r0.<init>(r1, r4)
            r0.L$0 = r3
            kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
            return r0
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.channels.ProducerScope<? super android.graphics.Rect> r2, kotlin.coroutines.Continuation<? super kotlin.Unit> r3) {
            r1 = this;
            kotlinx.coroutines.channels.ProducerScope r2 = (kotlinx.coroutines.channels.ProducerScope) r2
            kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
            java.lang.Object r0 = r1.invoke2(r2, r3)
            return r0
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final java.lang.Object invoke2(kotlinx.coroutines.channels.ProducerScope<? super android.graphics.Rect> r3, kotlin.coroutines.Continuation<? super kotlin.Unit> r4) {
            r2 = this;
            kotlin.coroutines.Continuation r0 = r2.create(r3, r4)
            androidx.activity.PipHintTrackerKt$trackPipAnimationHintView$flow$1 r0 = (androidx.activity.PipHintTrackerKt$trackPipAnimationHintView$flow$1) r0
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            java.lang.Object r0 = r0.invokeSuspend(r1)
            return r0
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            r8 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r8.label
            switch(r1) {
                case 0: goto L15;
                case 1: goto L11;
                default: goto L9;
            }
        L9:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L11:
            kotlin.ResultKt.throwOnFailure(r9)
            goto L6d
        L15:
            kotlin.ResultKt.throwOnFailure(r9)
            java.lang.Object r1 = r8.L$0
            kotlinx.coroutines.channels.ProducerScope r1 = (kotlinx.coroutines.channels.ProducerScope) r1
            androidx.activity.PipHintTrackerKt$trackPipAnimationHintView$flow$1$$ExternalSyntheticLambda0 r2 = new androidx.activity.PipHintTrackerKt$trackPipAnimationHintView$flow$1$$ExternalSyntheticLambda0
            r2.<init>(r1)
            android.view.View r3 = r8.$view
            androidx.activity.PipHintTrackerKt$trackPipAnimationHintView$flow$1$$ExternalSyntheticLambda1 r4 = new androidx.activity.PipHintTrackerKt$trackPipAnimationHintView$flow$1$$ExternalSyntheticLambda1
            r4.<init>(r1, r3)
            androidx.activity.PipHintTrackerKt$trackPipAnimationHintView$flow$1$attachStateChangeListener$1 r3 = new androidx.activity.PipHintTrackerKt$trackPipAnimationHintView$flow$1$attachStateChangeListener$1
            android.view.View r5 = r8.$view
            r3.<init>(r1, r5, r4, r2)
            android.view.View r5 = r8.$view
            boolean r5 = r5.isAttachedToWindow()
            if (r5 == 0) goto L51
            android.view.View r5 = r8.$view
            android.graphics.Rect r5 = androidx.activity.PipHintTrackerKt.access$trackPipAnimationHintView$positionInWindow(r5)
            r1.mo1656trySendJP2dKIU(r5)
            android.view.View r5 = r8.$view
            android.view.ViewTreeObserver r5 = r5.getViewTreeObserver()
            r5.addOnScrollChangedListener(r4)
            android.view.View r5 = r8.$view
            r5.addOnLayoutChangeListener(r2)
        L51:
            android.view.View r5 = r8.$view
            r6 = r3
            android.view.View$OnAttachStateChangeListener r6 = (android.view.View.OnAttachStateChangeListener) r6
            r5.addOnAttachStateChangeListener(r6)
            android.view.View r5 = r8.$view
            androidx.activity.PipHintTrackerKt$trackPipAnimationHintView$flow$1$$ExternalSyntheticLambda2 r6 = new androidx.activity.PipHintTrackerKt$trackPipAnimationHintView$flow$1$$ExternalSyntheticLambda2
            r6.<init>(r5, r4, r2, r3)
            r5 = r8
            kotlin.coroutines.Continuation r5 = (kotlin.coroutines.Continuation) r5
            r7 = 1
            r8.label = r7
            java.lang.Object r1 = kotlinx.coroutines.channels.ProduceKt.awaitClose(r1, r6, r5)
            if (r1 != r0) goto L6d
            return r0
        L6d:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
    }
}
