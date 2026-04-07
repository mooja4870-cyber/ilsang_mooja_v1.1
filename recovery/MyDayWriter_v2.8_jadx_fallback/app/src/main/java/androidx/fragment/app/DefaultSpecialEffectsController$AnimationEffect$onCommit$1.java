package androidx.fragment.app;

/* JADX INFO: compiled from: DefaultSpecialEffectsController.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\b"}, d2 = {"androidx/fragment/app/DefaultSpecialEffectsController$AnimationEffect$onCommit$1", "Landroid/view/animation/Animation$AnimationListener;", "onAnimationEnd", "", "animation", "Landroid/view/animation/Animation;", "onAnimationRepeat", "onAnimationStart", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DefaultSpecialEffectsController$AnimationEffect$onCommit$1 implements android.view.animation.Animation.AnimationListener {
    final /* synthetic */ android.view.ViewGroup $container;
    final /* synthetic */ androidx.fragment.app.SpecialEffectsController.Operation $operation;
    final /* synthetic */ android.view.View $viewToAnimate;
    final /* synthetic */ androidx.fragment.app.DefaultSpecialEffectsController.AnimationEffect this$0;

    /* JADX INFO: renamed from: $r8$lambda$6fa8Ib9U-odOeQPVWaNv8aZmow0, reason: not valid java name */
    public static /* synthetic */ void m81$r8$lambda$6fa8Ib9UodOeQPVWaNv8aZmow0(android.view.ViewGroup r0, android.view.View r1, androidx.fragment.app.DefaultSpecialEffectsController.AnimationEffect r2) {
            onAnimationEnd$lambda$0(r0, r1, r2)
            return
    }

    DefaultSpecialEffectsController$AnimationEffect$onCommit$1(androidx.fragment.app.SpecialEffectsController.Operation r1, android.view.ViewGroup r2, android.view.View r3, androidx.fragment.app.DefaultSpecialEffectsController.AnimationEffect r4) {
            r0 = this;
            r0.$operation = r1
            r0.$container = r2
            r0.$viewToAnimate = r3
            r0.this$0 = r4
            r0.<init>()
            return
    }

    private static final void onAnimationEnd$lambda$0(android.view.ViewGroup r2, android.view.View r3, androidx.fragment.app.DefaultSpecialEffectsController.AnimationEffect r4) {
            java.lang.String r0 = "$container"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "this$0"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r2.endViewTransition(r3)
            androidx.fragment.app.DefaultSpecialEffectsController$AnimationInfo r0 = r4.getAnimationInfo()
            androidx.fragment.app.SpecialEffectsController$Operation r0 = r0.getOperation()
            r1 = r4
            androidx.fragment.app.SpecialEffectsController$Effect r1 = (androidx.fragment.app.SpecialEffectsController.Effect) r1
            r0.completeEffect(r1)
            return
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation r6) {
            r5 = this;
            java.lang.String r0 = "animation"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            android.view.ViewGroup r0 = r5.$container
            android.view.ViewGroup r1 = r5.$container
            android.view.View r2 = r5.$viewToAnimate
            androidx.fragment.app.DefaultSpecialEffectsController$AnimationEffect r3 = r5.this$0
            androidx.fragment.app.DefaultSpecialEffectsController$AnimationEffect$onCommit$1$$ExternalSyntheticLambda0 r4 = new androidx.fragment.app.DefaultSpecialEffectsController$AnimationEffect$onCommit$1$$ExternalSyntheticLambda0
            r4.<init>(r1, r2, r3)
            r0.post(r4)
            r0 = 2
            boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r0)
            if (r0 == 0) goto L3d
        L1d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Animation from operation "
            java.lang.StringBuilder r0 = r0.append(r1)
            androidx.fragment.app.SpecialEffectsController$Operation r1 = r5.$operation
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " has ended."
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.v(r1, r0)
        L3d:
            return
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(android.view.animation.Animation r2) {
            r1 = this;
            java.lang.String r0 = "animation"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            return
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(android.view.animation.Animation r3) {
            r2 = this;
            java.lang.String r0 = "animation"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = 2
            boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r0)
            if (r0 == 0) goto L2d
        Ld:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Animation from operation "
            java.lang.StringBuilder r0 = r0.append(r1)
            androidx.fragment.app.SpecialEffectsController$Operation r1 = r2.$operation
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " has reached onAnimationStart."
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.v(r1, r0)
        L2d:
            return
    }
}
