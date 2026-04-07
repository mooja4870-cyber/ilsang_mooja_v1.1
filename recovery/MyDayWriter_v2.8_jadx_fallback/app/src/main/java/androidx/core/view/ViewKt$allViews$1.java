package androidx.core.view;

/* JADX INFO: compiled from: View.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlin/sequences/SequenceScope;", "Landroid/view/View;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.core.view.ViewKt$allViews$1", f = "View.kt", i = {0}, l = {410, 412}, m = "invokeSuspend", n = {"$this$sequence"}, s = {"L$0"})
final class ViewKt$allViews$1 extends kotlin.coroutines.jvm.internal.RestrictedSuspendLambda implements kotlin.jvm.functions.Function2<kotlin.sequences.SequenceScope<? super android.view.View>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ android.view.View $this_allViews;
    private /* synthetic */ java.lang.Object L$0;
    int label;

    ViewKt$allViews$1(android.view.View r2, kotlin.coroutines.Continuation<? super androidx.core.view.ViewKt$allViews$1> r3) {
            r1 = this;
            r1.$this_allViews = r2
            r0 = 2
            r1.<init>(r0, r3)
            return
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object r3, kotlin.coroutines.Continuation<?> r4) {
            r2 = this;
            androidx.core.view.ViewKt$allViews$1 r0 = new androidx.core.view.ViewKt$allViews$1
            android.view.View r1 = r2.$this_allViews
            r0.<init>(r1, r4)
            r0.L$0 = r3
            kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
            return r0
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ java.lang.Object invoke(kotlin.sequences.SequenceScope<? super android.view.View> r2, kotlin.coroutines.Continuation<? super kotlin.Unit> r3) {
            r1 = this;
            kotlin.sequences.SequenceScope r2 = (kotlin.sequences.SequenceScope) r2
            kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
            java.lang.Object r0 = r1.invoke2(r2, r3)
            return r0
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final java.lang.Object invoke2(kotlin.sequences.SequenceScope<? super android.view.View> r3, kotlin.coroutines.Continuation<? super kotlin.Unit> r4) {
            r2 = this;
            kotlin.coroutines.Continuation r0 = r2.create(r3, r4)
            androidx.core.view.ViewKt$allViews$1 r0 = (androidx.core.view.ViewKt$allViews$1) r0
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            java.lang.Object r0 = r0.invokeSuspend(r1)
            return r0
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            r5 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r5.label
            switch(r1) {
                case 0: goto L1d;
                case 1: goto L15;
                case 2: goto L11;
                default: goto L9;
            }
        L9:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L11:
            kotlin.ResultKt.throwOnFailure(r6)
            goto L53
        L15:
            java.lang.Object r1 = r5.L$0
            kotlin.sequences.SequenceScope r1 = (kotlin.sequences.SequenceScope) r1
            kotlin.ResultKt.throwOnFailure(r6)
            goto L35
        L1d:
            kotlin.ResultKt.throwOnFailure(r6)
            java.lang.Object r1 = r5.L$0
            kotlin.sequences.SequenceScope r1 = (kotlin.sequences.SequenceScope) r1
            android.view.View r2 = r5.$this_allViews
            r3 = r5
            kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
            r5.L$0 = r1
            r4 = 1
            r5.label = r4
            java.lang.Object r2 = r1.yield(r2, r3)
            if (r2 != r0) goto L35
            return r0
        L35:
            android.view.View r2 = r5.$this_allViews
            boolean r2 = r2 instanceof android.view.ViewGroup
            if (r2 == 0) goto L54
            android.view.View r2 = r5.$this_allViews
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            kotlin.sequences.Sequence r2 = androidx.core.view.ViewGroupKt.getDescendants(r2)
            r3 = r5
            kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
            r4 = 0
            r5.L$0 = r4
            r4 = 2
            r5.label = r4
            java.lang.Object r1 = r1.yieldAll(r2, r3)
            if (r1 != r0) goto L53
            return r0
        L53:
        L54:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
    }
}
