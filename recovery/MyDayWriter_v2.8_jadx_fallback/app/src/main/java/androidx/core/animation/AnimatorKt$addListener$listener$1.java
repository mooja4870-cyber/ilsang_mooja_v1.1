package androidx.core.animation;

/* JADX INFO: compiled from: Animator.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\t"}, d2 = {"androidx/core/animation/AnimatorKt$addListener$listener$1", "Landroid/animation/Animator$AnimatorListener;", "onAnimationRepeat", "", "animator", "Landroid/animation/Animator;", "onAnimationEnd", "onAnimationCancel", "onAnimationStart", "core-ktx_release"}, k = 1, mv = {2, 0, 0}, xi = 176)
public final class AnimatorKt$addListener$listener$1 implements android.animation.Animator.AnimatorListener {
    final /* synthetic */ kotlin.jvm.functions.Function1<android.animation.Animator, kotlin.Unit> $onCancel;
    final /* synthetic */ kotlin.jvm.functions.Function1<android.animation.Animator, kotlin.Unit> $onEnd;
    final /* synthetic */ kotlin.jvm.functions.Function1<android.animation.Animator, kotlin.Unit> $onRepeat;
    final /* synthetic */ kotlin.jvm.functions.Function1<android.animation.Animator, kotlin.Unit> $onStart;

    public AnimatorKt$addListener$listener$1(kotlin.jvm.functions.Function1<? super android.animation.Animator, kotlin.Unit> r1, kotlin.jvm.functions.Function1<? super android.animation.Animator, kotlin.Unit> r2, kotlin.jvm.functions.Function1<? super android.animation.Animator, kotlin.Unit> r3, kotlin.jvm.functions.Function1<? super android.animation.Animator, kotlin.Unit> r4) {
            r0 = this;
            r0.$onRepeat = r1
            r0.$onEnd = r2
            r0.$onCancel = r3
            r0.$onStart = r4
            r0.<init>()
            return
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator r2) {
            r1 = this;
            kotlin.jvm.functions.Function1<android.animation.Animator, kotlin.Unit> r0 = r1.$onCancel
            r0.invoke(r2)
            return
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator r2) {
            r1 = this;
            kotlin.jvm.functions.Function1<android.animation.Animator, kotlin.Unit> r0 = r1.$onEnd
            r0.invoke(r2)
            return
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator r2) {
            r1 = this;
            kotlin.jvm.functions.Function1<android.animation.Animator, kotlin.Unit> r0 = r1.$onRepeat
            r0.invoke(r2)
            return
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator r2) {
            r1 = this;
            kotlin.jvm.functions.Function1<android.animation.Animator, kotlin.Unit> r0 = r1.$onStart
            r0.invoke(r2)
            return
    }
}
