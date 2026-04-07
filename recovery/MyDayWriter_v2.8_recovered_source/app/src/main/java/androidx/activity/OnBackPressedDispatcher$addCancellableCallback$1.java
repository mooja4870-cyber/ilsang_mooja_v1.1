package androidx.activity;

/* JADX INFO: compiled from: OnBackPressedDispatcher.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* synthetic */ class OnBackPressedDispatcher$addCancellableCallback$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function0<kotlin.Unit> {
    OnBackPressedDispatcher$addCancellableCallback$1(java.lang.Object r8) {
            r7 = this;
            java.lang.Class<androidx.activity.OnBackPressedDispatcher> r3 = androidx.activity.OnBackPressedDispatcher.class
            java.lang.String r5 = "updateEnabledCallbacks()V"
            r6 = 0
            r1 = 0
            java.lang.String r4 = "updateEnabledCallbacks"
            r0 = r7
            r2 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ kotlin.Unit invoke() {
            r1 = this;
            r1.invoke2()
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
            r1 = this;
            java.lang.Object r0 = r1.receiver
            androidx.activity.OnBackPressedDispatcher r0 = (androidx.activity.OnBackPressedDispatcher) r0
            androidx.activity.OnBackPressedDispatcher.access$updateEnabledCallbacks(r0)
            return
    }
}
