package androidx.activity;

/* JADX INFO: compiled from: PipHintTracker.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0087@¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"trackPipAnimationHintView", "", "Landroid/app/Activity;", "view", "Landroid/view/View;", "(Landroid/app/Activity;Landroid/view/View;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "activity_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class PipHintTrackerKt {


    public static final /* synthetic */ android.graphics.Rect access$trackPipAnimationHintView$positionInWindow(android.view.View r1) {
            android.graphics.Rect r0 = trackPipAnimationHintView$positionInWindow(r1)
            return r0
    }

    public static final java.lang.Object trackPipAnimationHintView(android.app.Activity r3, android.view.View r4, kotlin.coroutines.Continuation<? super kotlin.Unit> r5) {
            androidx.activity.PipHintTrackerKt$trackPipAnimationHintView$flow$1 r0 = new androidx.activity.PipHintTrackerKt$trackPipAnimationHintView$flow$1
            r1 = 0
            r0.<init>(r4, r1)
            kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt.callbackFlow(r0)
            androidx.activity.PipHintTrackerKt$trackPipAnimationHintView$2 r1 = new androidx.activity.PipHintTrackerKt$trackPipAnimationHintView$2
            r1.<init>(r3)
            kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
            java.lang.Object r1 = r0.collect(r1, r5)
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r1 != r2) goto L1f
            return r1
        L1f:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            return r1
    }

    private static final android.graphics.Rect trackPipAnimationHintView$positionInWindow(android.view.View r1) {
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r1.getGlobalVisibleRect(r0)
            return r0
    }
}
