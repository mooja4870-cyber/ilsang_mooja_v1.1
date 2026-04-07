package androidx.activity.contextaware;

/* JADX INFO: compiled from: ContextAware.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"androidx/activity/contextaware/ContextAwareKt$withContextAvailable$2$listener$1", "Landroidx/activity/contextaware/OnContextAvailableListener;", "onContextAvailable", "", "context", "Landroid/content/Context;", "activity_release"}, k = 1, mv = {2, 0, 0}, xi = 176)
public final class ContextAwareKt$withContextAvailable$2$listener$1 implements androidx.activity.contextaware.OnContextAvailableListener {
    final /* synthetic */ kotlinx.coroutines.CancellableContinuation<R> $co;
    final /* synthetic */ kotlin.jvm.functions.Function1<android.content.Context, R> $onContextAvailable;

    public ContextAwareKt$withContextAvailable$2$listener$1(kotlinx.coroutines.CancellableContinuation<R> r1, kotlin.jvm.functions.Function1<android.content.Context, R> r2) {
            r0 = this;
            r0.$co = r1
            r0.$onContextAvailable = r2
            r0.<init>()
            return
    }

    @Override // androidx.activity.contextaware.OnContextAvailableListener
    public void onContextAvailable(android.content.Context r5) {
            r4 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            kotlinx.coroutines.CancellableContinuation<R> r0 = r4.$co
            kotlin.jvm.functions.Function1<android.content.Context, R> r1 = r4.$onContextAvailable
            kotlin.Result$Companion r2 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L18
            r2 = r4
            androidx.activity.contextaware.ContextAwareKt$withContextAvailable$2$listener$1 r2 = (androidx.activity.contextaware.ContextAwareKt$withContextAvailable$2$listener$1) r2     // Catch: java.lang.Throwable -> L18
            r3 = 0
            java.lang.Object r1 = r1.invoke(r5)     // Catch: java.lang.Throwable -> L18
            java.lang.Object r1 = kotlin.Result.m153constructorimpl(r1)     // Catch: java.lang.Throwable -> L18
            goto L23
        L18:
            r1 = move-exception
            kotlin.Result$Companion r2 = kotlin.Result.Companion
            java.lang.Object r1 = kotlin.ResultKt.createFailure(r1)
            java.lang.Object r1 = kotlin.Result.m153constructorimpl(r1)
        L23:
            r0.resumeWith(r1)
            return
    }
}
