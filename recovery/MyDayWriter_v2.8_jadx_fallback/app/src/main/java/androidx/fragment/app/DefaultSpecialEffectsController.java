package androidx.fragment.app;

/* JADX INFO: compiled from: DefaultSpecialEffectsController.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001:\b\u001f !\"#$%&B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0003J\u001e\u0010\n\u001a\u00020\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\b2\u0006\u0010\r\u001a\u00020\u000eH\u0016J2\u0010\u000f\u001a\u00020\u00062\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\b2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\f2\b\u0010\u0013\u001a\u0004\u0018\u00010\fH\u0002J$\u0010\u0014\u001a\u00020\u00062\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0002J\u0016\u0010\u001a\u001a\u00020\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\bH\u0002J&\u0010\u001b\u001a\u00020\u0006*\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u001c2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00170\u001eH\u0002¨\u0006'"}, d2 = {"Landroidx/fragment/app/DefaultSpecialEffectsController;", "Landroidx/fragment/app/SpecialEffectsController;", "container", "Landroid/view/ViewGroup;", "(Landroid/view/ViewGroup;)V", "collectAnimEffects", "", "animationInfos", "", "Landroidx/fragment/app/DefaultSpecialEffectsController$AnimationInfo;", "collectEffects", "operations", "Landroidx/fragment/app/SpecialEffectsController$Operation;", "isPop", "", "createTransitionEffect", "transitionInfos", "Landroidx/fragment/app/DefaultSpecialEffectsController$TransitionInfo;", "firstOut", "lastIn", "findNamedViews", "namedViews", "", "", "Landroid/view/View;", "view", "syncAnimations", "retainMatchingViews", "Landroidx/collection/ArrayMap;", "names", "", "AnimationEffect", "AnimationInfo", "AnimatorEffect", "Api24Impl", "Api26Impl", "SpecialEffectsInfo", "TransitionEffect", "TransitionInfo", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DefaultSpecialEffectsController extends androidx.fragment.app.SpecialEffectsController {

    /* JADX INFO: compiled from: DefaultSpecialEffectsController.kt */
    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\f"}, d2 = {"Landroidx/fragment/app/DefaultSpecialEffectsController$AnimationEffect;", "Landroidx/fragment/app/SpecialEffectsController$Effect;", "animationInfo", "Landroidx/fragment/app/DefaultSpecialEffectsController$AnimationInfo;", "(Landroidx/fragment/app/DefaultSpecialEffectsController$AnimationInfo;)V", "getAnimationInfo", "()Landroidx/fragment/app/DefaultSpecialEffectsController$AnimationInfo;", "onCancel", "", "container", "Landroid/view/ViewGroup;", "onCommit", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class AnimationEffect extends androidx.fragment.app.SpecialEffectsController.Effect {
        private final androidx.fragment.app.DefaultSpecialEffectsController.AnimationInfo animationInfo;

        public AnimationEffect(androidx.fragment.app.DefaultSpecialEffectsController.AnimationInfo r2) {
                r1 = this;
                java.lang.String r0 = "animationInfo"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                r1.<init>()
                r1.animationInfo = r2
                return
        }

        public final androidx.fragment.app.DefaultSpecialEffectsController.AnimationInfo getAnimationInfo() {
                r1 = this;
                androidx.fragment.app.DefaultSpecialEffectsController$AnimationInfo r0 = r1.animationInfo
                return r0
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Effect
        public void onCancel(android.view.ViewGroup r6) {
                r5 = this;
                java.lang.String r0 = "container"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
                androidx.fragment.app.DefaultSpecialEffectsController$AnimationInfo r0 = r5.animationInfo
                androidx.fragment.app.SpecialEffectsController$Operation r0 = r0.getOperation()
                androidx.fragment.app.Fragment r1 = r0.getFragment()
                android.view.View r2 = r1.mView
                r2.clearAnimation()
                r6.endViewTransition(r2)
                androidx.fragment.app.DefaultSpecialEffectsController$AnimationInfo r3 = r5.animationInfo
                androidx.fragment.app.SpecialEffectsController$Operation r3 = r3.getOperation()
                r4 = r5
                androidx.fragment.app.SpecialEffectsController$Effect r4 = (androidx.fragment.app.SpecialEffectsController.Effect) r4
                r3.completeEffect(r4)
                r3 = 2
                boolean r3 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r3)
                if (r3 == 0) goto L49
            L2b:
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "Animation from operation "
                java.lang.StringBuilder r3 = r3.append(r4)
                java.lang.StringBuilder r3 = r3.append(r0)
                java.lang.String r4 = " has been cancelled."
                java.lang.StringBuilder r3 = r3.append(r4)
                java.lang.String r3 = r3.toString()
                java.lang.String r4 = "FragmentManager"
                android.util.Log.v(r4, r3)
            L49:
                return
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Effect
        public void onCommit(android.view.ViewGroup r10) {
                r9 = this;
                java.lang.String r0 = "container"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
                androidx.fragment.app.DefaultSpecialEffectsController$AnimationInfo r0 = r9.animationInfo
                boolean r0 = r0.isVisibilityUnchanged()
                if (r0 == 0) goto L1a
                androidx.fragment.app.DefaultSpecialEffectsController$AnimationInfo r0 = r9.animationInfo
                androidx.fragment.app.SpecialEffectsController$Operation r0 = r0.getOperation()
                r1 = r9
                androidx.fragment.app.SpecialEffectsController$Effect r1 = (androidx.fragment.app.SpecialEffectsController.Effect) r1
                r0.completeEffect(r1)
                return
            L1a:
                android.content.Context r0 = r10.getContext()
                androidx.fragment.app.DefaultSpecialEffectsController$AnimationInfo r1 = r9.animationInfo
                androidx.fragment.app.SpecialEffectsController$Operation r1 = r1.getOperation()
                androidx.fragment.app.Fragment r2 = r1.getFragment()
                android.view.View r3 = r2.mView
                androidx.fragment.app.DefaultSpecialEffectsController$AnimationInfo r4 = r9.animationInfo
                java.lang.String r5 = "context"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r5)
                androidx.fragment.app.FragmentAnim$AnimationOrAnimator r4 = r4.getAnimation(r0)
                java.lang.String r5 = "Required value was null."
                if (r4 == 0) goto L9e
                android.view.animation.Animation r4 = r4.animation
                if (r4 == 0) goto L94
                androidx.fragment.app.SpecialEffectsController$Operation$State r5 = r1.getFinalState()
                androidx.fragment.app.SpecialEffectsController$Operation$State r6 = androidx.fragment.app.SpecialEffectsController.Operation.State.REMOVED
                if (r5 == r6) goto L55
                r3.startAnimation(r4)
                androidx.fragment.app.DefaultSpecialEffectsController$AnimationInfo r6 = r9.animationInfo
                androidx.fragment.app.SpecialEffectsController$Operation r6 = r6.getOperation()
                r7 = r9
                androidx.fragment.app.SpecialEffectsController$Effect r7 = (androidx.fragment.app.SpecialEffectsController.Effect) r7
                r6.completeEffect(r7)
                goto L93
            L55:
                r10.startViewTransition(r3)
                androidx.fragment.app.FragmentAnim$EndViewTransitionAnimation r6 = new androidx.fragment.app.FragmentAnim$EndViewTransitionAnimation
                r6.<init>(r4, r10, r3)
                android.view.animation.Animation r6 = (android.view.animation.Animation) r6
                androidx.fragment.app.DefaultSpecialEffectsController$AnimationEffect$onCommit$1 r7 = new androidx.fragment.app.DefaultSpecialEffectsController$AnimationEffect$onCommit$1
                r7.<init>(r1, r10, r3, r9)
                android.view.animation.Animation$AnimationListener r7 = (android.view.animation.Animation.AnimationListener) r7
                r6.setAnimationListener(r7)
                r3.startAnimation(r6)
                r7 = 2
                boolean r7 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r7)
                if (r7 == 0) goto L93
            L75:
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                java.lang.String r8 = "Animation from operation "
                java.lang.StringBuilder r7 = r7.append(r8)
                java.lang.StringBuilder r7 = r7.append(r1)
                java.lang.String r8 = " has started."
                java.lang.StringBuilder r7 = r7.append(r8)
                java.lang.String r7 = r7.toString()
                java.lang.String r8 = "FragmentManager"
                android.util.Log.v(r8, r7)
            L93:
                return
            L94:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r5 = r5.toString()
                r4.<init>(r5)
                throw r4
            L9e:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r5 = r5.toString()
                r4.<init>(r5)
                throw r4
        }
    }

    /* JADX INFO: compiled from: DefaultSpecialEffectsController.kt */
    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\n\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\fR\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Landroidx/fragment/app/DefaultSpecialEffectsController$AnimationInfo;", "Landroidx/fragment/app/DefaultSpecialEffectsController$SpecialEffectsInfo;", "operation", "Landroidx/fragment/app/SpecialEffectsController$Operation;", "isPop", "", "(Landroidx/fragment/app/SpecialEffectsController$Operation;Z)V", "animation", "Landroidx/fragment/app/FragmentAnim$AnimationOrAnimator;", "isAnimLoaded", "getAnimation", "context", "Landroid/content/Context;", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class AnimationInfo extends androidx.fragment.app.DefaultSpecialEffectsController.SpecialEffectsInfo {
        private androidx.fragment.app.FragmentAnim.AnimationOrAnimator animation;
        private boolean isAnimLoaded;
        private final boolean isPop;

        public AnimationInfo(androidx.fragment.app.SpecialEffectsController.Operation r2, boolean r3) {
                r1 = this;
                java.lang.String r0 = "operation"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                r1.<init>(r2)
                r1.isPop = r3
                return
        }

        public final androidx.fragment.app.FragmentAnim.AnimationOrAnimator getAnimation(android.content.Context r5) {
                r4 = this;
                java.lang.String r0 = "context"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                boolean r0 = r4.isAnimLoaded
                if (r0 == 0) goto Lc
                androidx.fragment.app.FragmentAnim$AnimationOrAnimator r0 = r4.animation
                goto L33
            Lc:
                androidx.fragment.app.SpecialEffectsController$Operation r0 = r4.getOperation()
                androidx.fragment.app.Fragment r0 = r0.getFragment()
                androidx.fragment.app.SpecialEffectsController$Operation r1 = r4.getOperation()
                androidx.fragment.app.SpecialEffectsController$Operation$State r1 = r1.getFinalState()
                androidx.fragment.app.SpecialEffectsController$Operation$State r2 = androidx.fragment.app.SpecialEffectsController.Operation.State.VISIBLE
                r3 = 1
                if (r1 != r2) goto L24
                r1 = r3
                goto L25
            L24:
                r1 = 0
            L25:
                boolean r2 = r4.isPop
                androidx.fragment.app.FragmentAnim$AnimationOrAnimator r0 = androidx.fragment.app.FragmentAnim.loadAnimation(r5, r0, r1, r2)
                r1 = r0
                r2 = 0
                r4.animation = r1
                r4.isAnimLoaded = r3
            L33:
                return r0
        }
    }

    /* JADX INFO: compiled from: DefaultSpecialEffectsController.kt */
    @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0018\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000f¨\u0006\u0019"}, d2 = {"Landroidx/fragment/app/DefaultSpecialEffectsController$AnimatorEffect;", "Landroidx/fragment/app/SpecialEffectsController$Effect;", "animatorInfo", "Landroidx/fragment/app/DefaultSpecialEffectsController$AnimationInfo;", "(Landroidx/fragment/app/DefaultSpecialEffectsController$AnimationInfo;)V", "animator", "Landroid/animation/AnimatorSet;", "getAnimator", "()Landroid/animation/AnimatorSet;", "setAnimator", "(Landroid/animation/AnimatorSet;)V", "getAnimatorInfo", "()Landroidx/fragment/app/DefaultSpecialEffectsController$AnimationInfo;", "isSeekingSupported", "", "()Z", "onCancel", "", "container", "Landroid/view/ViewGroup;", "onCommit", "onProgress", "backEvent", "Landroidx/activity/BackEventCompat;", "onStart", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class AnimatorEffect extends androidx.fragment.app.SpecialEffectsController.Effect {
        private android.animation.AnimatorSet animator;
        private final androidx.fragment.app.DefaultSpecialEffectsController.AnimationInfo animatorInfo;

        public AnimatorEffect(androidx.fragment.app.DefaultSpecialEffectsController.AnimationInfo r2) {
                r1 = this;
                java.lang.String r0 = "animatorInfo"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                r1.<init>()
                r1.animatorInfo = r2
                return
        }

        public final android.animation.AnimatorSet getAnimator() {
                r1 = this;
                android.animation.AnimatorSet r0 = r1.animator
                return r0
        }

        public final androidx.fragment.app.DefaultSpecialEffectsController.AnimationInfo getAnimatorInfo() {
                r1 = this;
                androidx.fragment.app.DefaultSpecialEffectsController$AnimationInfo r0 = r1.animatorInfo
                return r0
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Effect
        public boolean isSeekingSupported() {
                r1 = this;
                r0 = 1
                return r0
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Effect
        public void onCancel(android.view.ViewGroup r5) {
                r4 = this;
                java.lang.String r0 = "container"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                android.animation.AnimatorSet r0 = r4.animator
                if (r0 != 0) goto L16
                androidx.fragment.app.DefaultSpecialEffectsController$AnimationInfo r1 = r4.animatorInfo
                androidx.fragment.app.SpecialEffectsController$Operation r1 = r1.getOperation()
                r2 = r4
                androidx.fragment.app.SpecialEffectsController$Effect r2 = (androidx.fragment.app.SpecialEffectsController.Effect) r2
                r1.completeEffect(r2)
                goto L6c
            L16:
                androidx.fragment.app.DefaultSpecialEffectsController$AnimationInfo r1 = r4.animatorInfo
                androidx.fragment.app.SpecialEffectsController$Operation r1 = r1.getOperation()
                boolean r2 = r1.isSeeking()
                if (r2 == 0) goto L2e
                int r2 = android.os.Build.VERSION.SDK_INT
                r3 = 26
                if (r2 < r3) goto L31
                androidx.fragment.app.DefaultSpecialEffectsController$Api26Impl r2 = androidx.fragment.app.DefaultSpecialEffectsController.Api26Impl.INSTANCE
                r2.reverse(r0)
                goto L31
            L2e:
                r0.end()
            L31:
                r2 = 2
                boolean r2 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r2)
                if (r2 == 0) goto L6c
            L39:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Animator from operation "
                java.lang.StringBuilder r2 = r2.append(r3)
                java.lang.StringBuilder r2 = r2.append(r1)
                java.lang.String r3 = " has been canceled"
                java.lang.StringBuilder r2 = r2.append(r3)
                boolean r3 = r1.isSeeking()
                if (r3 == 0) goto L57
                java.lang.String r3 = " with seeking."
                goto L59
            L57:
                java.lang.String r3 = "."
            L59:
                java.lang.StringBuilder r2 = r2.append(r3)
                r3 = 32
                java.lang.StringBuilder r2 = r2.append(r3)
                java.lang.String r2 = r2.toString()
                java.lang.String r3 = "FragmentManager"
                android.util.Log.v(r3, r2)
            L6c:
                return
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Effect
        public void onCommit(android.view.ViewGroup r5) {
                r4 = this;
                java.lang.String r0 = "container"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                androidx.fragment.app.DefaultSpecialEffectsController$AnimationInfo r0 = r4.animatorInfo
                androidx.fragment.app.SpecialEffectsController$Operation r0 = r0.getOperation()
                android.animation.AnimatorSet r1 = r4.animator
                if (r1 != 0) goto L1c
                androidx.fragment.app.DefaultSpecialEffectsController$AnimationInfo r2 = r4.animatorInfo
                androidx.fragment.app.SpecialEffectsController$Operation r2 = r2.getOperation()
                r3 = r4
                androidx.fragment.app.SpecialEffectsController$Effect r3 = (androidx.fragment.app.SpecialEffectsController.Effect) r3
                r2.completeEffect(r3)
                return
            L1c:
                r1.start()
                r2 = 2
                boolean r2 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r2)
                if (r2 == 0) goto L45
            L27:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Animator from operation "
                java.lang.StringBuilder r2 = r2.append(r3)
                java.lang.StringBuilder r2 = r2.append(r0)
                java.lang.String r3 = " has started."
                java.lang.StringBuilder r2 = r2.append(r3)
                java.lang.String r2 = r2.toString()
                java.lang.String r3 = "FragmentManager"
                android.util.Log.v(r3, r2)
            L45:
                return
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Effect
        public void onProgress(androidx.activity.BackEventCompat r12, android.view.ViewGroup r13) {
                r11 = this;
                java.lang.String r0 = "backEvent"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
                java.lang.String r0 = "container"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
                androidx.fragment.app.DefaultSpecialEffectsController$AnimationInfo r0 = r11.animatorInfo
                androidx.fragment.app.SpecialEffectsController$Operation r0 = r0.getOperation()
                android.animation.AnimatorSet r1 = r11.animator
                if (r1 != 0) goto L21
                androidx.fragment.app.DefaultSpecialEffectsController$AnimationInfo r2 = r11.animatorInfo
                androidx.fragment.app.SpecialEffectsController$Operation r2 = r2.getOperation()
                r3 = r11
                androidx.fragment.app.SpecialEffectsController$Effect r3 = (androidx.fragment.app.SpecialEffectsController.Effect) r3
                r2.completeEffect(r3)
                return
            L21:
                int r2 = android.os.Build.VERSION.SDK_INT
                r3 = 34
                if (r2 < r3) goto La3
                androidx.fragment.app.Fragment r2 = r0.getFragment()
                boolean r2 = r2.mTransitioning
                if (r2 == 0) goto La3
                r2 = 2
                boolean r3 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r2)
                java.lang.String r4 = "FragmentManager"
                if (r3 == 0) goto L4f
            L39:
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r5 = "Adding BackProgressCallbacks for Animators to operation "
                java.lang.StringBuilder r3 = r3.append(r5)
                java.lang.StringBuilder r3 = r3.append(r0)
                java.lang.String r3 = r3.toString()
                android.util.Log.v(r4, r3)
            L4f:
                androidx.fragment.app.DefaultSpecialEffectsController$Api24Impl r3 = androidx.fragment.app.DefaultSpecialEffectsController.Api24Impl.INSTANCE
                long r5 = r3.totalDuration(r1)
                float r3 = r12.getProgress()
                float r7 = (float) r5
                float r3 = r3 * r7
                long r7 = (long) r3
                r9 = 0
                int r3 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
                if (r3 != 0) goto L64
                r7 = 1
            L64:
                int r3 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
                if (r3 != 0) goto L6c
                r9 = 1
                long r7 = r5 - r9
            L6c:
                boolean r2 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r2)
                if (r2 == 0) goto L9e
            L73:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Setting currentPlayTime to "
                java.lang.StringBuilder r2 = r2.append(r3)
                java.lang.StringBuilder r2 = r2.append(r7)
                java.lang.String r3 = " for Animator "
                java.lang.StringBuilder r2 = r2.append(r3)
                java.lang.StringBuilder r2 = r2.append(r1)
                java.lang.String r3 = " on operation "
                java.lang.StringBuilder r2 = r2.append(r3)
                java.lang.StringBuilder r2 = r2.append(r0)
                java.lang.String r2 = r2.toString()
                android.util.Log.v(r4, r2)
            L9e:
                androidx.fragment.app.DefaultSpecialEffectsController$Api26Impl r2 = androidx.fragment.app.DefaultSpecialEffectsController.Api26Impl.INSTANCE
                r2.setCurrentPlayTime(r1, r7)
            La3:
                return
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Effect
        public void onStart(android.view.ViewGroup r10) {
                r9 = this;
                java.lang.String r0 = "container"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
                androidx.fragment.app.DefaultSpecialEffectsController$AnimationInfo r0 = r9.animatorInfo
                boolean r0 = r0.isVisibilityUnchanged()
                if (r0 == 0) goto Le
                return
            Le:
                android.content.Context r0 = r10.getContext()
                androidx.fragment.app.DefaultSpecialEffectsController$AnimationInfo r1 = r9.animatorInfo
                java.lang.String r2 = "context"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)
                androidx.fragment.app.FragmentAnim$AnimationOrAnimator r1 = r1.getAnimation(r0)
                if (r1 == 0) goto L22
                android.animation.AnimatorSet r1 = r1.animator
                goto L23
            L22:
                r1 = 0
            L23:
                r9.animator = r1
                androidx.fragment.app.DefaultSpecialEffectsController$AnimationInfo r1 = r9.animatorInfo
                androidx.fragment.app.SpecialEffectsController$Operation r6 = r1.getOperation()
                androidx.fragment.app.Fragment r1 = r6.getFragment()
                androidx.fragment.app.SpecialEffectsController$Operation$State r2 = r6.getFinalState()
                androidx.fragment.app.SpecialEffectsController$Operation$State r3 = androidx.fragment.app.SpecialEffectsController.Operation.State.GONE
                if (r2 != r3) goto L39
                r2 = 1
                goto L3a
            L39:
                r2 = 0
            L3a:
                r5 = r2
                android.view.View r4 = r1.mView
                r10.startViewTransition(r4)
                android.animation.AnimatorSet r8 = r9.animator
                if (r8 == 0) goto L51
                androidx.fragment.app.DefaultSpecialEffectsController$AnimatorEffect$onStart$1 r2 = new androidx.fragment.app.DefaultSpecialEffectsController$AnimatorEffect$onStart$1
                r7 = r9
                r3 = r10
                r2.<init>(r3, r4, r5, r6, r7)
                android.animation.Animator$AnimatorListener r2 = (android.animation.Animator.AnimatorListener) r2
                r8.addListener(r2)
                goto L53
            L51:
                r7 = r9
                r3 = r10
            L53:
                android.animation.AnimatorSet r10 = r7.animator
                if (r10 == 0) goto L5a
                r10.setTarget(r4)
            L5a:
                return
        }

        public final void setAnimator(android.animation.AnimatorSet r1) {
                r0 = this;
                r0.animator = r1
                return
        }
    }

    /* JADX INFO: compiled from: DefaultSpecialEffectsController.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Landroidx/fragment/app/DefaultSpecialEffectsController$Api24Impl;", "", "()V", "totalDuration", "", "animatorSet", "Landroid/animation/AnimatorSet;", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Api24Impl {
        public static final androidx.fragment.app.DefaultSpecialEffectsController.Api24Impl INSTANCE = null;

        static {
                androidx.fragment.app.DefaultSpecialEffectsController$Api24Impl r0 = new androidx.fragment.app.DefaultSpecialEffectsController$Api24Impl
                r0.<init>()
                androidx.fragment.app.DefaultSpecialEffectsController.Api24Impl.INSTANCE = r0
                return
        }

        private Api24Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        public final long totalDuration(android.animation.AnimatorSet r3) {
                r2 = this;
                java.lang.String r0 = "animatorSet"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                long r0 = r3.getTotalDuration()
                return r0
        }
    }

    /* JADX INFO: compiled from: DefaultSpecialEffectsController.kt */
    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0018\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0007¨\u0006\n"}, d2 = {"Landroidx/fragment/app/DefaultSpecialEffectsController$Api26Impl;", "", "()V", "reverse", "", "animatorSet", "Landroid/animation/AnimatorSet;", "setCurrentPlayTime", "time", "", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Api26Impl {
        public static final androidx.fragment.app.DefaultSpecialEffectsController.Api26Impl INSTANCE = null;

        static {
                androidx.fragment.app.DefaultSpecialEffectsController$Api26Impl r0 = new androidx.fragment.app.DefaultSpecialEffectsController$Api26Impl
                r0.<init>()
                androidx.fragment.app.DefaultSpecialEffectsController.Api26Impl.INSTANCE = r0
                return
        }

        private Api26Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        public final void reverse(android.animation.AnimatorSet r2) {
                r1 = this;
                java.lang.String r0 = "animatorSet"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                r2.reverse()
                return
        }

        public final void setCurrentPlayTime(android.animation.AnimatorSet r2, long r3) {
                r1 = this;
                java.lang.String r0 = "animatorSet"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                r2.setCurrentPlayTime(r3)
                return
        }
    }

    /* JADX INFO: compiled from: DefaultSpecialEffectsController.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/fragment/app/DefaultSpecialEffectsController$SpecialEffectsInfo;", "", "operation", "Landroidx/fragment/app/SpecialEffectsController$Operation;", "(Landroidx/fragment/app/SpecialEffectsController$Operation;)V", "isVisibilityUnchanged", "", "()Z", "getOperation", "()Landroidx/fragment/app/SpecialEffectsController$Operation;", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static class SpecialEffectsInfo {
        private final androidx.fragment.app.SpecialEffectsController.Operation operation;

        public SpecialEffectsInfo(androidx.fragment.app.SpecialEffectsController.Operation r2) {
                r1 = this;
                java.lang.String r0 = "operation"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                r1.<init>()
                r1.operation = r2
                return
        }

        public final androidx.fragment.app.SpecialEffectsController.Operation getOperation() {
                r1 = this;
                androidx.fragment.app.SpecialEffectsController$Operation r0 = r1.operation
                return r0
        }

        public final boolean isVisibilityUnchanged() {
                r3 = this;
                androidx.fragment.app.SpecialEffectsController$Operation r0 = r3.operation
                androidx.fragment.app.Fragment r0 = r0.getFragment()
                android.view.View r0 = r0.mView
                if (r0 == 0) goto L11
                androidx.fragment.app.SpecialEffectsController$Operation$State$Companion r1 = androidx.fragment.app.SpecialEffectsController.Operation.State.Companion
                androidx.fragment.app.SpecialEffectsController$Operation$State r0 = r1.asOperationState(r0)
                goto L12
            L11:
                r0 = 0
            L12:
                androidx.fragment.app.SpecialEffectsController$Operation r1 = r3.operation
                androidx.fragment.app.SpecialEffectsController$Operation$State r1 = r1.getFinalState()
                if (r0 == r1) goto L25
                androidx.fragment.app.SpecialEffectsController$Operation$State r2 = androidx.fragment.app.SpecialEffectsController.Operation.State.VISIBLE
                if (r0 == r2) goto L23
                androidx.fragment.app.SpecialEffectsController$Operation$State r2 = androidx.fragment.app.SpecialEffectsController.Operation.State.VISIBLE
                if (r1 == r2) goto L23
                goto L25
            L23:
                r2 = 0
                goto L26
            L25:
                r2 = 1
            L26:
                return r2
        }
    }

    /* JADX INFO: compiled from: DefaultSpecialEffectsController.kt */
    @kotlin.Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001BÝ\u0001\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0016\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000f\u0012\u0016\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000f\u0012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00130\u0012\u0012\u0016\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u00130\rj\b\u0012\u0004\u0012\u00020\u0013`\u000f\u0012\u0016\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u00130\rj\b\u0012\u0004\u0012\u00020\u0013`\u000f\u0012\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u000e0\u0012\u0012\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u000e0\u0012\u0012\u0006\u0010\u0018\u001a\u00020\u0019¢\u0006\u0002\u0010\u001aJ(\u0010?\u001a\u00020@2\u0016\u0010A\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000f2\u0006\u0010B\u001a\u00020\u000eH\u0002J@\u0010C\u001a\u001e\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000f\u0012\u0004\u0012\u00020\u000b0D2\u0006\u0010E\u001a\u00020F2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0002J\u0010\u0010G\u001a\u00020@2\u0006\u0010E\u001a\u00020FH\u0016J\u0010\u0010H\u001a\u00020@2\u0006\u0010E\u001a\u00020FH\u0016J\u0018\u0010I\u001a\u00020@2\u0006\u0010J\u001a\u00020K2\u0006\u0010E\u001a\u00020FH\u0016J\u0010\u0010L\u001a\u00020@2\u0006\u0010E\u001a\u00020FH\u0016J6\u0010M\u001a\u00020@2\u0016\u0010N\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000f2\u0006\u0010E\u001a\u00020F2\f\u0010O\u001a\b\u0012\u0004\u0012\u00020@0PH\u0002R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR!\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u00130\rj\b\u0012\u0004\u0012\u00020\u0013`\u000f¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R!\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u00130\rj\b\u0012\u0004\u0012\u00020\u0013`\u000f¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010!R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u001d\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u000e0\u0012¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\u0018\u001a\u00020\u0019¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010'R\u0014\u0010(\u001a\u00020\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010'R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b)\u0010$R\u001d\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u000e0\u0012¢\u0006\b\n\u0000\u001a\u0004\b*\u0010&R\u001a\u0010+\u001a\u00020\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010'\"\u0004\b-\u0010.R!\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000f¢\u0006\b\n\u0000\u001a\u0004\b/\u0010!R!\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000f¢\u0006\b\n\u0000\u001a\u0004\b0\u0010!R\u001d\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\b\n\u0000\u001a\u0004\b1\u0010&R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b2\u0010\u001dR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0017\u00107\u001a\u000208¢\u0006\u000e\n\u0000\u0012\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u0011\u0010=\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b>\u0010'¨\u0006Q"}, d2 = {"Landroidx/fragment/app/DefaultSpecialEffectsController$TransitionEffect;", "Landroidx/fragment/app/SpecialEffectsController$Effect;", "transitionInfos", "", "Landroidx/fragment/app/DefaultSpecialEffectsController$TransitionInfo;", "firstOut", "Landroidx/fragment/app/SpecialEffectsController$Operation;", "lastIn", "transitionImpl", "Landroidx/fragment/app/FragmentTransitionImpl;", "sharedElementTransition", "", "sharedElementFirstOutViews", "Ljava/util/ArrayList;", "Landroid/view/View;", "Lkotlin/collections/ArrayList;", "sharedElementLastInViews", "sharedElementNameMapping", "Landroidx/collection/ArrayMap;", "", "enteringNames", "exitingNames", "firstOutViews", "lastInViews", "isPop", "", "(Ljava/util/List;Landroidx/fragment/app/SpecialEffectsController$Operation;Landroidx/fragment/app/SpecialEffectsController$Operation;Landroidx/fragment/app/FragmentTransitionImpl;Ljava/lang/Object;Ljava/util/ArrayList;Ljava/util/ArrayList;Landroidx/collection/ArrayMap;Ljava/util/ArrayList;Ljava/util/ArrayList;Landroidx/collection/ArrayMap;Landroidx/collection/ArrayMap;Z)V", "controller", "getController", "()Ljava/lang/Object;", "setController", "(Ljava/lang/Object;)V", "getEnteringNames", "()Ljava/util/ArrayList;", "getExitingNames", "getFirstOut", "()Landroidx/fragment/app/SpecialEffectsController$Operation;", "getFirstOutViews", "()Landroidx/collection/ArrayMap;", "()Z", "isSeekingSupported", "getLastIn", "getLastInViews", "noControllerReturned", "getNoControllerReturned", "setNoControllerReturned", "(Z)V", "getSharedElementFirstOutViews", "getSharedElementLastInViews", "getSharedElementNameMapping", "getSharedElementTransition", "getTransitionImpl", "()Landroidx/fragment/app/FragmentTransitionImpl;", "getTransitionInfos", "()Ljava/util/List;", "transitionSignal", "Landroidx/core/os/CancellationSignal;", "getTransitionSignal$annotations", "()V", "getTransitionSignal", "()Landroidx/core/os/CancellationSignal;", "transitioning", "getTransitioning", "captureTransitioningViews", "", "transitioningViews", "view", "createMergedTransition", "Lkotlin/Pair;", "container", "Landroid/view/ViewGroup;", "onCancel", "onCommit", "onProgress", "backEvent", "Landroidx/activity/BackEventCompat;", "onStart", "runTransition", "enteringViews", "executeTransition", "Lkotlin/Function0;", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class TransitionEffect extends androidx.fragment.app.SpecialEffectsController.Effect {
        private java.lang.Object controller;
        private final java.util.ArrayList<java.lang.String> enteringNames;
        private final java.util.ArrayList<java.lang.String> exitingNames;
        private final androidx.fragment.app.SpecialEffectsController.Operation firstOut;
        private final androidx.collection.ArrayMap<java.lang.String, android.view.View> firstOutViews;
        private final boolean isPop;
        private final androidx.fragment.app.SpecialEffectsController.Operation lastIn;
        private final androidx.collection.ArrayMap<java.lang.String, android.view.View> lastInViews;
        private boolean noControllerReturned;
        private final java.util.ArrayList<android.view.View> sharedElementFirstOutViews;
        private final java.util.ArrayList<android.view.View> sharedElementLastInViews;
        private final androidx.collection.ArrayMap<java.lang.String, java.lang.String> sharedElementNameMapping;
        private final java.lang.Object sharedElementTransition;
        private final androidx.fragment.app.FragmentTransitionImpl transitionImpl;
        private final java.util.List<androidx.fragment.app.DefaultSpecialEffectsController.TransitionInfo> transitionInfos;
        private final androidx.core.os.CancellationSignal transitionSignal;

        public static /* synthetic */ void $r8$lambda$6p4zO3CB6aA8dlD9N_23P2qLSv8(androidx.fragment.app.SpecialEffectsController.Operation r0, androidx.fragment.app.SpecialEffectsController.Operation r1, androidx.fragment.app.DefaultSpecialEffectsController.TransitionEffect r2) {
                createMergedTransition$lambda$12(r0, r1, r2)
                return
        }

        public static /* synthetic */ void $r8$lambda$Sr4J70a3QauSgpeDyw0ZL_OWiKc(androidx.fragment.app.FragmentTransitionImpl r0, android.view.View r1, android.graphics.Rect r2) {
                createMergedTransition$lambda$13(r0, r1, r2)
                return
        }

        public static /* synthetic */ void $r8$lambda$TNb3E8YkXhm2Bo5GwEDODMQqXVA(java.util.ArrayList r0) {
                createMergedTransition$lambda$14(r0)
                return
        }

        /* JADX INFO: renamed from: $r8$lambda$YDvTpOYgMyrNARpW-xssIvuN550, reason: not valid java name */
        public static /* synthetic */ void m82$r8$lambda$YDvTpOYgMyrNARpWxssIvuN550(kotlin.jvm.internal.Ref.ObjectRef r0) {
                onStart$lambda$6$lambda$4(r0)
                return
        }

        public static /* synthetic */ void $r8$lambda$qsydSOYBmoz9_kn6YMgHu5Je2nQ(androidx.fragment.app.SpecialEffectsController.Operation r0, androidx.fragment.app.DefaultSpecialEffectsController.TransitionEffect r1) {
                onCommit$lambda$11$lambda$10(r0, r1)
                return
        }

        public static /* synthetic */ void $r8$lambda$s3hmaGzL_feT3WmrQ4go_MPSSPE(androidx.fragment.app.SpecialEffectsController.Operation r0, androidx.fragment.app.DefaultSpecialEffectsController.TransitionEffect r1) {
                onStart$lambda$6$lambda$5(r0, r1)
                return
        }

        public TransitionEffect(java.util.List<androidx.fragment.app.DefaultSpecialEffectsController.TransitionInfo> r2, androidx.fragment.app.SpecialEffectsController.Operation r3, androidx.fragment.app.SpecialEffectsController.Operation r4, androidx.fragment.app.FragmentTransitionImpl r5, java.lang.Object r6, java.util.ArrayList<android.view.View> r7, java.util.ArrayList<android.view.View> r8, androidx.collection.ArrayMap<java.lang.String, java.lang.String> r9, java.util.ArrayList<java.lang.String> r10, java.util.ArrayList<java.lang.String> r11, androidx.collection.ArrayMap<java.lang.String, android.view.View> r12, androidx.collection.ArrayMap<java.lang.String, android.view.View> r13, boolean r14) {
                r1 = this;
                java.lang.String r0 = "transitionInfos"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                java.lang.String r0 = "transitionImpl"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                java.lang.String r0 = "sharedElementFirstOutViews"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
                java.lang.String r0 = "sharedElementLastInViews"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
                java.lang.String r0 = "sharedElementNameMapping"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
                java.lang.String r0 = "enteringNames"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
                java.lang.String r0 = "exitingNames"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
                java.lang.String r0 = "firstOutViews"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
                java.lang.String r0 = "lastInViews"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
                r1.<init>()
                r1.transitionInfos = r2
                r1.firstOut = r3
                r1.lastIn = r4
                r1.transitionImpl = r5
                r1.sharedElementTransition = r6
                r1.sharedElementFirstOutViews = r7
                r1.sharedElementLastInViews = r8
                r1.sharedElementNameMapping = r9
                r1.enteringNames = r10
                r1.exitingNames = r11
                r1.firstOutViews = r12
                r1.lastInViews = r13
                r1.isPop = r14
                androidx.core.os.CancellationSignal r0 = new androidx.core.os.CancellationSignal
                r0.<init>()
                r1.transitionSignal = r0
                return
        }

        private final void captureTransitioningViews(java.util.ArrayList<android.view.View> r5, android.view.View r6) {
                r4 = this;
                boolean r0 = r6 instanceof android.view.ViewGroup
                if (r0 == 0) goto L39
                r0 = r6
                android.view.ViewGroup r0 = (android.view.ViewGroup) r0
                boolean r0 = androidx.core.view.ViewGroupCompat.isTransitionGroup(r0)
                if (r0 == 0) goto L17
                boolean r0 = r5.contains(r6)
                if (r0 != 0) goto L42
                r5.add(r6)
                goto L42
            L17:
                r0 = r6
                android.view.ViewGroup r0 = (android.view.ViewGroup) r0
                int r0 = r0.getChildCount()
                r1 = 0
            L1f:
                if (r1 >= r0) goto L42
                r2 = r6
                android.view.ViewGroup r2 = (android.view.ViewGroup) r2
                android.view.View r2 = r2.getChildAt(r1)
                int r3 = r2.getVisibility()
                if (r3 != 0) goto L36
                java.lang.String r3 = "child"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
                r4.captureTransitioningViews(r5, r2)
            L36:
                int r1 = r1 + 1
                goto L1f
            L39:
                boolean r0 = r5.contains(r6)
                if (r0 != 0) goto L42
                r5.add(r6)
            L42:
                return
        }

        private final kotlin.Pair<java.util.ArrayList<android.view.View>, java.lang.Object> createMergedTransition(android.view.ViewGroup r31, androidx.fragment.app.SpecialEffectsController.Operation r32, androidx.fragment.app.SpecialEffectsController.Operation r33) {
                r30 = this;
                r0 = r30
                r1 = r31
                r2 = r32
                r3 = r33
                android.view.View r4 = new android.view.View
                android.content.Context r5 = r1.getContext()
                r4.<init>(r5)
                r5 = 0
                r6 = 0
                android.graphics.Rect r7 = new android.graphics.Rect
                r7.<init>()
                java.util.List<androidx.fragment.app.DefaultSpecialEffectsController$TransitionInfo> r8 = r0.transitionInfos
                java.util.Iterator r8 = r8.iterator()
            L1e:
                boolean r9 = r8.hasNext()
                r10 = 1
                if (r9 == 0) goto Led
                java.lang.Object r9 = r8.next()
                androidx.fragment.app.DefaultSpecialEffectsController$TransitionInfo r9 = (androidx.fragment.app.DefaultSpecialEffectsController.TransitionInfo) r9
                boolean r12 = r9.hasSharedElementTransition()
                if (r12 == 0) goto L1e
                if (r3 == 0) goto L1e
                if (r2 == 0) goto L1e
                androidx.collection.ArrayMap<java.lang.String, java.lang.String> r13 = r0.sharedElementNameMapping
                java.util.Map r13 = (java.util.Map) r13
                boolean r13 = r13.isEmpty()
                if (r13 != 0) goto L1e
                java.lang.Object r13 = r0.sharedElementTransition
                if (r13 == 0) goto L1e
                androidx.fragment.app.Fragment r13 = r2.getFragment()
                androidx.fragment.app.Fragment r14 = r3.getFragment()
                boolean r15 = r0.isPop
                androidx.collection.ArrayMap<java.lang.String, android.view.View> r11 = r0.firstOutViews
                androidx.fragment.app.FragmentTransition.callSharedElementStartEnd(r13, r14, r15, r11, r10)
                r10 = r1
                android.view.View r10 = (android.view.View) r10
                androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect$$ExternalSyntheticLambda0 r11 = new androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect$$ExternalSyntheticLambda0
                r11.<init>(r2, r3, r0)
                androidx.core.view.OneShotPreDrawListener.add(r10, r11)
                java.util.ArrayList<android.view.View> r10 = r0.sharedElementFirstOutViews
                androidx.collection.ArrayMap<java.lang.String, android.view.View> r11 = r0.firstOutViews
                java.util.Collection r11 = r11.values()
                r10.addAll(r11)
                java.util.ArrayList<java.lang.String> r10 = r0.exitingNames
                java.util.Collection r10 = (java.util.Collection) r10
                boolean r10 = r10.isEmpty()
                if (r10 != 0) goto L90
                java.util.ArrayList<java.lang.String> r10 = r0.exitingNames
                r11 = 0
                java.lang.Object r10 = r10.get(r11)
                java.lang.String r11 = "exitingNames[0]"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r11)
                java.lang.String r10 = (java.lang.String) r10
                androidx.collection.ArrayMap<java.lang.String, android.view.View> r11 = r0.firstOutViews
                java.lang.Object r11 = r11.get(r10)
                r5 = r11
                android.view.View r5 = (android.view.View) r5
                androidx.fragment.app.FragmentTransitionImpl r11 = r0.transitionImpl
                java.lang.Object r13 = r0.sharedElementTransition
                r11.setEpicenter(r13, r5)
            L90:
                java.util.ArrayList<android.view.View> r10 = r0.sharedElementLastInViews
                androidx.collection.ArrayMap<java.lang.String, android.view.View> r11 = r0.lastInViews
                java.util.Collection r11 = r11.values()
                r10.addAll(r11)
                java.util.ArrayList<java.lang.String> r10 = r0.enteringNames
                java.util.Collection r10 = (java.util.Collection) r10
                boolean r10 = r10.isEmpty()
                if (r10 != 0) goto Lcb
                java.util.ArrayList<java.lang.String> r10 = r0.enteringNames
                r11 = 0
                java.lang.Object r10 = r10.get(r11)
                java.lang.String r11 = "enteringNames[0]"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r11)
                java.lang.String r10 = (java.lang.String) r10
                androidx.collection.ArrayMap<java.lang.String, android.view.View> r11 = r0.lastInViews
                java.lang.Object r11 = r11.get(r10)
                android.view.View r11 = (android.view.View) r11
                if (r11 == 0) goto Lcb
                r6 = 1
                androidx.fragment.app.FragmentTransitionImpl r13 = r0.transitionImpl
                r14 = r1
                android.view.View r14 = (android.view.View) r14
                androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect$$ExternalSyntheticLambda1 r15 = new androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect$$ExternalSyntheticLambda1
                r15.<init>(r13, r11, r7)
                androidx.core.view.OneShotPreDrawListener.add(r14, r15)
            Lcb:
                androidx.fragment.app.FragmentTransitionImpl r10 = r0.transitionImpl
                java.lang.Object r11 = r0.sharedElementTransition
                java.util.ArrayList<android.view.View> r13 = r0.sharedElementFirstOutViews
                r10.setSharedElementTargets(r11, r4, r13)
                androidx.fragment.app.FragmentTransitionImpl r14 = r0.transitionImpl
                java.lang.Object r15 = r0.sharedElementTransition
                java.lang.Object r10 = r0.sharedElementTransition
                java.util.ArrayList<android.view.View> r11 = r0.sharedElementLastInViews
                r16 = 0
                r17 = 0
                r18 = 0
                r19 = 0
                r20 = r10
                r21 = r11
                r14.scheduleRemoveTargets(r15, r16, r17, r18, r19, r20, r21)
                goto L1e
            Led:
                java.util.ArrayList r8 = new java.util.ArrayList
                r8.<init>()
                r9 = 0
                r11 = 0
                java.util.List<androidx.fragment.app.DefaultSpecialEffectsController$TransitionInfo> r12 = r0.transitionInfos
                java.util.Iterator r12 = r12.iterator()
            Lfa:
                boolean r13 = r12.hasNext()
                java.lang.String r15 = "FragmentManager"
                if (r13 == 0) goto L2b7
                java.lang.Object r13 = r12.next()
                androidx.fragment.app.DefaultSpecialEffectsController$TransitionInfo r13 = (androidx.fragment.app.DefaultSpecialEffectsController.TransitionInfo) r13
                androidx.fragment.app.SpecialEffectsController$Operation r10 = r13.getOperation()
                r18 = 2
                androidx.fragment.app.FragmentTransitionImpl r14 = r0.transitionImpl
                r19 = r6
                java.lang.Object r6 = r13.getTransition()
                java.lang.Object r6 = r14.cloneTransition(r6)
                if (r6 == 0) goto L2a8
                java.util.ArrayList r23 = new java.util.ArrayList
                r23.<init>()
                r14 = r23
                r28 = r12
                androidx.fragment.app.Fragment r12 = r10.getFragment()
                android.view.View r12 = r12.mView
                r29 = r13
                java.lang.String r13 = "operation.fragment.mView"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r12, r13)
                r0.captureTransitioningViews(r14, r12)
                java.lang.Object r12 = r0.sharedElementTransition
                if (r12 == 0) goto L13f
                if (r10 == r3) goto L13d
                if (r10 != r2) goto L13f
            L13d:
                r12 = 1
                goto L140
            L13f:
                r12 = 0
            L140:
                if (r12 == 0) goto L160
                if (r10 != r3) goto L153
                java.util.ArrayList<android.view.View> r13 = r0.sharedElementFirstOutViews
                java.lang.Iterable r13 = (java.lang.Iterable) r13
                java.util.Set r13 = kotlin.collections.CollectionsKt.toSet(r13)
                java.util.Collection r13 = (java.util.Collection) r13
                r14.removeAll(r13)
                goto L160
            L153:
                java.util.ArrayList<android.view.View> r13 = r0.sharedElementLastInViews
                java.lang.Iterable r13 = (java.lang.Iterable) r13
                java.util.Set r13 = kotlin.collections.CollectionsKt.toSet(r13)
                java.util.Collection r13 = (java.util.Collection) r13
                r14.removeAll(r13)
            L160:
                boolean r13 = r14.isEmpty()
                if (r13 == 0) goto L16d
                androidx.fragment.app.FragmentTransitionImpl r13 = r0.transitionImpl
                r13.addTarget(r6, r4)
                r13 = r14
                goto L1bf
            L16d:
                androidx.fragment.app.FragmentTransitionImpl r13 = r0.transitionImpl
                r13.addTargets(r6, r14)
                androidx.fragment.app.FragmentTransitionImpl r13 = r0.transitionImpl
                r24 = 0
                r25 = 0
                r26 = 0
                r27 = 0
                r22 = r6
                r21 = r6
                r20 = r13
                r23 = r14
                r20.scheduleRemoveTargets(r21, r22, r23, r24, r25, r26, r27)
                r13 = r23
                androidx.fragment.app.SpecialEffectsController$Operation$State r14 = r10.getFinalState()
                androidx.fragment.app.SpecialEffectsController$Operation$State r2 = androidx.fragment.app.SpecialEffectsController.Operation.State.GONE
                if (r14 != r2) goto L1bf
                r2 = 0
                r10.setAwaitingContainerChanges(r2)
                java.util.ArrayList r14 = new java.util.ArrayList
                r2 = r13
                java.util.Collection r2 = (java.util.Collection) r2
                r14.<init>(r2)
                androidx.fragment.app.Fragment r2 = r10.getFragment()
                android.view.View r2 = r2.mView
                r14.remove(r2)
                androidx.fragment.app.FragmentTransitionImpl r2 = r0.transitionImpl
                androidx.fragment.app.Fragment r3 = r10.getFragment()
                android.view.View r3 = r3.mView
                r2.scheduleHideFragmentView(r6, r3, r14)
                r2 = r1
                android.view.View r2 = (android.view.View) r2
                androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect$$ExternalSyntheticLambda2 r3 = new androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect$$ExternalSyntheticLambda2
                r3.<init>(r13)
                androidx.core.view.OneShotPreDrawListener.add(r2, r3)
            L1bf:
                androidx.fragment.app.SpecialEffectsController$Operation$State r2 = r10.getFinalState()
                androidx.fragment.app.SpecialEffectsController$Operation$State r3 = androidx.fragment.app.SpecialEffectsController.Operation.State.VISIBLE
                java.lang.String r14 = "View: "
                r20 = r4
                java.lang.String r4 = "transitioningViews"
                if (r2 != r3) goto L227
                r2 = r13
                java.util.Collection r2 = (java.util.Collection) r2
                r8.addAll(r2)
                if (r19 == 0) goto L1da
                androidx.fragment.app.FragmentTransitionImpl r2 = r0.transitionImpl
                r2.setEpicenter(r6, r7)
            L1da:
                boolean r2 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r18)
                if (r2 == 0) goto L279
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Entering Transition: "
                java.lang.StringBuilder r2 = r2.append(r3)
                java.lang.StringBuilder r2 = r2.append(r6)
                java.lang.String r2 = r2.toString()
                android.util.Log.v(r15, r2)
                java.lang.String r2 = ">>>>> EnteringViews <<<<<"
                android.util.Log.v(r15, r2)
                java.util.Iterator r2 = r13.iterator()
            L1ff:
                boolean r3 = r2.hasNext()
                if (r3 == 0) goto L279
                java.lang.Object r3 = r2.next()
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
                android.view.View r3 = (android.view.View) r3
                r18 = r2
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.StringBuilder r2 = r2.append(r14)
                java.lang.StringBuilder r2 = r2.append(r3)
                java.lang.String r2 = r2.toString()
                android.util.Log.v(r15, r2)
                r2 = r18
                goto L1ff
            L227:
                androidx.fragment.app.FragmentTransitionImpl r2 = r0.transitionImpl
                r2.setEpicenter(r6, r5)
                boolean r2 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r18)
                if (r2 == 0) goto L279
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Exiting Transition: "
                java.lang.StringBuilder r2 = r2.append(r3)
                java.lang.StringBuilder r2 = r2.append(r6)
                java.lang.String r2 = r2.toString()
                android.util.Log.v(r15, r2)
                java.lang.String r2 = ">>>>> ExitingViews <<<<<"
                android.util.Log.v(r15, r2)
                java.util.Iterator r2 = r13.iterator()
            L251:
                boolean r3 = r2.hasNext()
                if (r3 == 0) goto L279
                java.lang.Object r3 = r2.next()
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
                android.view.View r3 = (android.view.View) r3
                r18 = r2
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.StringBuilder r2 = r2.append(r14)
                java.lang.StringBuilder r2 = r2.append(r3)
                java.lang.String r2 = r2.toString()
                android.util.Log.v(r15, r2)
                r2 = r18
                goto L251
            L279:
                boolean r2 = r29.isOverlapAllowed()
                r3 = 0
                if (r2 == 0) goto L294
                androidx.fragment.app.FragmentTransitionImpl r2 = r0.transitionImpl
                java.lang.Object r9 = r2.mergeTransitionsTogether(r9, r6, r3)
                r2 = r32
                r3 = r33
                r6 = r19
                r4 = r20
                r12 = r28
                r10 = 1
                goto Lfa
            L294:
                androidx.fragment.app.FragmentTransitionImpl r2 = r0.transitionImpl
                java.lang.Object r11 = r2.mergeTransitionsTogether(r11, r6, r3)
                r2 = r32
                r3 = r33
                r6 = r19
                r4 = r20
                r12 = r28
                r10 = 1
                goto Lfa
            L2a8:
                r20 = r4
                r28 = r12
                r29 = r13
                r2 = r32
                r3 = r33
                r6 = r19
                r10 = 1
                goto Lfa
            L2b7:
                r20 = r4
                r19 = r6
                r18 = 2
                androidx.fragment.app.FragmentTransitionImpl r2 = r0.transitionImpl
                java.lang.Object r3 = r0.sharedElementTransition
                java.lang.Object r2 = r2.mergeTransitionsInSequence(r9, r11, r3)
                boolean r3 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r18)
                if (r3 == 0) goto L2ec
            L2cc:
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "Final merged transition: "
                java.lang.StringBuilder r3 = r3.append(r4)
                java.lang.StringBuilder r3 = r3.append(r2)
                java.lang.String r4 = " for container "
                java.lang.StringBuilder r3 = r3.append(r4)
                java.lang.StringBuilder r3 = r3.append(r1)
                java.lang.String r3 = r3.toString()
                android.util.Log.v(r15, r3)
            L2ec:
                kotlin.Pair r3 = new kotlin.Pair
                r3.<init>(r8, r2)
                return r3
        }

        private static final void createMergedTransition$lambda$12(androidx.fragment.app.SpecialEffectsController.Operation r5, androidx.fragment.app.SpecialEffectsController.Operation r6, androidx.fragment.app.DefaultSpecialEffectsController.TransitionEffect r7) {
                java.lang.String r0 = "this$0"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
                androidx.fragment.app.Fragment r0 = r5.getFragment()
                androidx.fragment.app.Fragment r1 = r6.getFragment()
                boolean r2 = r7.isPop
                androidx.collection.ArrayMap<java.lang.String, android.view.View> r3 = r7.lastInViews
                r4 = 0
                androidx.fragment.app.FragmentTransition.callSharedElementStartEnd(r0, r1, r2, r3, r4)
                return
        }

        private static final void createMergedTransition$lambda$13(androidx.fragment.app.FragmentTransitionImpl r1, android.view.View r2, android.graphics.Rect r3) {
                java.lang.String r0 = "$impl"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
                java.lang.String r0 = "$lastInEpicenterRect"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                r1.getBoundsOnScreen(r2, r3)
                return
        }

        private static final void createMergedTransition$lambda$14(java.util.ArrayList r2) {
                java.lang.String r0 = "$transitioningViews"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                r0 = r2
                java.util.List r0 = (java.util.List) r0
                r1 = 4
                androidx.fragment.app.FragmentTransition.setViewVisibility(r0, r1)
                return
        }

        public static /* synthetic */ void getTransitionSignal$annotations() {
                return
        }

        private static final void onCommit$lambda$11$lambda$10(androidx.fragment.app.SpecialEffectsController.Operation r2, androidx.fragment.app.DefaultSpecialEffectsController.TransitionEffect r3) {
                java.lang.String r0 = "$operation"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                java.lang.String r0 = "this$0"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                r0 = 2
                boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r0)
                if (r0 == 0) goto L30
            L12:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Transition for operation "
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.StringBuilder r0 = r0.append(r2)
                java.lang.String r1 = " has completed"
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "FragmentManager"
                android.util.Log.v(r1, r0)
            L30:
                r0 = r3
                androidx.fragment.app.SpecialEffectsController$Effect r0 = (androidx.fragment.app.SpecialEffectsController.Effect) r0
                r2.completeEffect(r0)
                return
        }

        private static final void onStart$lambda$6$lambda$4(kotlin.jvm.internal.Ref.ObjectRef r1) {
                java.lang.String r0 = "$seekCancelLambda"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
                T r0 = r1.element
                kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
                if (r0 == 0) goto Le
                r0.invoke()
            Le:
                return
        }

        private static final void onStart$lambda$6$lambda$5(androidx.fragment.app.SpecialEffectsController.Operation r2, androidx.fragment.app.DefaultSpecialEffectsController.TransitionEffect r3) {
                java.lang.String r0 = "$operation"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                java.lang.String r0 = "this$0"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                r0 = 2
                boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r0)
                if (r0 == 0) goto L30
            L12:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Transition for operation "
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.StringBuilder r0 = r0.append(r2)
                java.lang.String r1 = " has completed"
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "FragmentManager"
                android.util.Log.v(r1, r0)
            L30:
                r0 = r3
                androidx.fragment.app.SpecialEffectsController$Effect r0 = (androidx.fragment.app.SpecialEffectsController.Effect) r0
                r2.completeEffect(r0)
                return
        }

        private final void runTransition(java.util.ArrayList<android.view.View> r9, android.view.ViewGroup r10, kotlin.jvm.functions.Function0<kotlin.Unit> r11) {
                r8 = this;
                r0 = r9
                java.util.List r0 = (java.util.List) r0
                r1 = 4
                androidx.fragment.app.FragmentTransition.setViewVisibility(r0, r1)
                androidx.fragment.app.FragmentTransitionImpl r0 = r8.transitionImpl
                java.util.ArrayList<android.view.View> r1 = r8.sharedElementLastInViews
                java.util.ArrayList r6 = r0.prepareSetNameOverridesReordered(r1)
                r0 = 2
                boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r0)
                if (r0 == 0) goto L9d
                java.lang.String r0 = ">>>>> Beginning transition <<<<<"
                java.lang.String r1 = "FragmentManager"
                android.util.Log.v(r1, r0)
                java.lang.String r0 = ">>>>> SharedElementFirstOutViews <<<<<"
                android.util.Log.v(r1, r0)
                java.util.ArrayList<android.view.View> r0 = r8.sharedElementFirstOutViews
                java.util.Iterator r0 = r0.iterator()
            L28:
                boolean r2 = r0.hasNext()
                java.lang.String r3 = " Name: "
                java.lang.String r4 = "View: "
                if (r2 == 0) goto L5f
                java.lang.Object r2 = r0.next()
                java.lang.String r5 = "sharedElementFirstOutViews"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r5)
                android.view.View r2 = (android.view.View) r2
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.StringBuilder r4 = r5.append(r4)
                java.lang.StringBuilder r4 = r4.append(r2)
                java.lang.StringBuilder r3 = r4.append(r3)
                java.lang.String r4 = androidx.core.view.ViewCompat.getTransitionName(r2)
                java.lang.StringBuilder r3 = r3.append(r4)
                java.lang.String r3 = r3.toString()
                android.util.Log.v(r1, r3)
                goto L28
            L5f:
                java.lang.String r0 = ">>>>> SharedElementLastInViews <<<<<"
                android.util.Log.v(r1, r0)
                java.util.ArrayList<android.view.View> r0 = r8.sharedElementLastInViews
                java.util.Iterator r0 = r0.iterator()
            L6a:
                boolean r2 = r0.hasNext()
                if (r2 == 0) goto L9d
                java.lang.Object r2 = r0.next()
                java.lang.String r5 = "sharedElementLastInViews"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r5)
                android.view.View r2 = (android.view.View) r2
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.StringBuilder r5 = r5.append(r4)
                java.lang.StringBuilder r5 = r5.append(r2)
                java.lang.StringBuilder r5 = r5.append(r3)
                java.lang.String r7 = androidx.core.view.ViewCompat.getTransitionName(r2)
                java.lang.StringBuilder r5 = r5.append(r7)
                java.lang.String r5 = r5.toString()
                android.util.Log.v(r1, r5)
                goto L6a
            L9d:
                r11.invoke()
                androidx.fragment.app.FragmentTransitionImpl r2 = r8.transitionImpl
                r3 = r10
                android.view.View r3 = (android.view.View) r3
                java.util.ArrayList<android.view.View> r4 = r8.sharedElementFirstOutViews
                java.util.ArrayList<android.view.View> r5 = r8.sharedElementLastInViews
                androidx.collection.ArrayMap<java.lang.String, java.lang.String> r0 = r8.sharedElementNameMapping
                r7 = r0
                java.util.Map r7 = (java.util.Map) r7
                r2.setNameOverridesReordered(r3, r4, r5, r6, r7)
                r0 = r9
                java.util.List r0 = (java.util.List) r0
                r1 = 0
                androidx.fragment.app.FragmentTransition.setViewVisibility(r0, r1)
                androidx.fragment.app.FragmentTransitionImpl r0 = r8.transitionImpl
                java.lang.Object r1 = r8.sharedElementTransition
                java.util.ArrayList<android.view.View> r2 = r8.sharedElementFirstOutViews
                java.util.ArrayList<android.view.View> r3 = r8.sharedElementLastInViews
                r0.swapSharedElementTargets(r1, r2, r3)
                return
        }

        public final java.lang.Object getController() {
                r1 = this;
                java.lang.Object r0 = r1.controller
                return r0
        }

        public final java.util.ArrayList<java.lang.String> getEnteringNames() {
                r1 = this;
                java.util.ArrayList<java.lang.String> r0 = r1.enteringNames
                return r0
        }

        public final java.util.ArrayList<java.lang.String> getExitingNames() {
                r1 = this;
                java.util.ArrayList<java.lang.String> r0 = r1.exitingNames
                return r0
        }

        public final androidx.fragment.app.SpecialEffectsController.Operation getFirstOut() {
                r1 = this;
                androidx.fragment.app.SpecialEffectsController$Operation r0 = r1.firstOut
                return r0
        }

        public final androidx.collection.ArrayMap<java.lang.String, android.view.View> getFirstOutViews() {
                r1 = this;
                androidx.collection.ArrayMap<java.lang.String, android.view.View> r0 = r1.firstOutViews
                return r0
        }

        public final androidx.fragment.app.SpecialEffectsController.Operation getLastIn() {
                r1 = this;
                androidx.fragment.app.SpecialEffectsController$Operation r0 = r1.lastIn
                return r0
        }

        public final androidx.collection.ArrayMap<java.lang.String, android.view.View> getLastInViews() {
                r1 = this;
                androidx.collection.ArrayMap<java.lang.String, android.view.View> r0 = r1.lastInViews
                return r0
        }

        public final boolean getNoControllerReturned() {
                r1 = this;
                boolean r0 = r1.noControllerReturned
                return r0
        }

        public final java.util.ArrayList<android.view.View> getSharedElementFirstOutViews() {
                r1 = this;
                java.util.ArrayList<android.view.View> r0 = r1.sharedElementFirstOutViews
                return r0
        }

        public final java.util.ArrayList<android.view.View> getSharedElementLastInViews() {
                r1 = this;
                java.util.ArrayList<android.view.View> r0 = r1.sharedElementLastInViews
                return r0
        }

        public final androidx.collection.ArrayMap<java.lang.String, java.lang.String> getSharedElementNameMapping() {
                r1 = this;
                androidx.collection.ArrayMap<java.lang.String, java.lang.String> r0 = r1.sharedElementNameMapping
                return r0
        }

        public final java.lang.Object getSharedElementTransition() {
                r1 = this;
                java.lang.Object r0 = r1.sharedElementTransition
                return r0
        }

        public final androidx.fragment.app.FragmentTransitionImpl getTransitionImpl() {
                r1 = this;
                androidx.fragment.app.FragmentTransitionImpl r0 = r1.transitionImpl
                return r0
        }

        public final java.util.List<androidx.fragment.app.DefaultSpecialEffectsController.TransitionInfo> getTransitionInfos() {
                r1 = this;
                java.util.List<androidx.fragment.app.DefaultSpecialEffectsController$TransitionInfo> r0 = r1.transitionInfos
                return r0
        }

        public final androidx.core.os.CancellationSignal getTransitionSignal() {
                r1 = this;
                androidx.core.os.CancellationSignal r0 = r1.transitionSignal
                return r0
        }

        public final boolean getTransitioning() {
                r8 = this;
                java.util.List<androidx.fragment.app.DefaultSpecialEffectsController$TransitionInfo> r0 = r8.transitionInfos
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                r1 = 0
                boolean r2 = r0 instanceof java.util.Collection
                r3 = 1
                if (r2 == 0) goto L14
                r2 = r0
                java.util.Collection r2 = (java.util.Collection) r2
                boolean r2 = r2.isEmpty()
                if (r2 == 0) goto L14
                goto L35
            L14:
                java.util.Iterator r2 = r0.iterator()
            L18:
                boolean r4 = r2.hasNext()
                if (r4 == 0) goto L34
                java.lang.Object r4 = r2.next()
                r5 = r4
                androidx.fragment.app.DefaultSpecialEffectsController$TransitionInfo r5 = (androidx.fragment.app.DefaultSpecialEffectsController.TransitionInfo) r5
                r6 = 0
                androidx.fragment.app.SpecialEffectsController$Operation r7 = r5.getOperation()
                androidx.fragment.app.Fragment r7 = r7.getFragment()
                boolean r5 = r7.mTransitioning
                if (r5 != 0) goto L18
                r3 = 0
                goto L35
            L34:
            L35:
                return r3
        }

        public final boolean isPop() {
                r1 = this;
                boolean r0 = r1.isPop
                return r0
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Effect
        public boolean isSeekingSupported() {
                r10 = this;
                androidx.fragment.app.FragmentTransitionImpl r0 = r10.transitionImpl
                boolean r0 = r0.isSeekingSupported()
                r1 = 0
                if (r0 == 0) goto L63
                java.util.List<androidx.fragment.app.DefaultSpecialEffectsController$TransitionInfo> r0 = r10.transitionInfos
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                r2 = 0
                boolean r3 = r0 instanceof java.util.Collection
                r4 = 1
                if (r3 == 0) goto L1e
                r3 = r0
                java.util.Collection r3 = (java.util.Collection) r3
                boolean r3 = r3.isEmpty()
                if (r3 == 0) goto L1e
                r0 = r4
                goto L51
            L1e:
                java.util.Iterator r3 = r0.iterator()
            L22:
                boolean r5 = r3.hasNext()
                if (r5 == 0) goto L50
                java.lang.Object r5 = r3.next()
                r6 = r5
                androidx.fragment.app.DefaultSpecialEffectsController$TransitionInfo r6 = (androidx.fragment.app.DefaultSpecialEffectsController.TransitionInfo) r6
                r7 = 0
                int r8 = android.os.Build.VERSION.SDK_INT
                r9 = 34
                if (r8 < r9) goto L4a
                java.lang.Object r8 = r6.getTransition()
                if (r8 == 0) goto L4a
                androidx.fragment.app.FragmentTransitionImpl r8 = r10.transitionImpl
                java.lang.Object r9 = r6.getTransition()
                boolean r8 = r8.isSeekingSupported(r9)
                if (r8 == 0) goto L4a
                r8 = r4
                goto L4b
            L4a:
                r8 = r1
            L4b:
                if (r8 != 0) goto L22
                r0 = r1
                goto L51
            L50:
                r0 = r4
            L51:
                if (r0 == 0) goto L63
                java.lang.Object r0 = r10.sharedElementTransition
                if (r0 == 0) goto L61
                androidx.fragment.app.FragmentTransitionImpl r0 = r10.transitionImpl
                java.lang.Object r2 = r10.sharedElementTransition
                boolean r0 = r0.isSeekingSupported(r2)
                if (r0 == 0) goto L63
            L61:
                r1 = r4
                goto L64
            L63:
            L64:
                return r1
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Effect
        public void onCancel(android.view.ViewGroup r2) {
                r1 = this;
                java.lang.String r0 = "container"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                androidx.core.os.CancellationSignal r0 = r1.transitionSignal
                r0.cancel()
                return
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Effect
        public void onCommit(android.view.ViewGroup r18) {
                r17 = this;
                r0 = r17
                r1 = r18
                java.lang.String r2 = "container"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
                boolean r2 = r1.isLaidOut()
                r3 = 2
                java.lang.String r4 = "FragmentManager"
                if (r2 == 0) goto Lfd
                boolean r2 = r0.noControllerReturned
                if (r2 == 0) goto L1a
                r16 = r3
                goto Lff
            L1a:
                java.lang.Object r2 = r0.controller
                java.lang.String r5 = " to "
                if (r2 == 0) goto L55
                androidx.fragment.app.FragmentTransitionImpl r2 = r0.transitionImpl
                java.lang.Object r6 = r0.controller
                kotlin.jvm.internal.Intrinsics.checkNotNull(r6)
                r2.animateToEnd(r6)
                boolean r2 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r3)
                if (r2 == 0) goto Lfc
            L31:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Ending execution of operations from "
                java.lang.StringBuilder r2 = r2.append(r3)
                androidx.fragment.app.SpecialEffectsController$Operation r3 = r0.firstOut
                java.lang.StringBuilder r2 = r2.append(r3)
                java.lang.StringBuilder r2 = r2.append(r5)
                androidx.fragment.app.SpecialEffectsController$Operation r3 = r0.lastIn
                java.lang.StringBuilder r2 = r2.append(r3)
                java.lang.String r2 = r2.toString()
                android.util.Log.v(r4, r2)
                goto Lfc
            L55:
                androidx.fragment.app.SpecialEffectsController$Operation r2 = r0.lastIn
                androidx.fragment.app.SpecialEffectsController$Operation r6 = r0.firstOut
                kotlin.Pair r2 = r0.createMergedTransition(r1, r2, r6)
                java.lang.Object r6 = r2.component1()
                java.util.ArrayList r6 = (java.util.ArrayList) r6
                java.lang.Object r2 = r2.component2()
                java.util.List<androidx.fragment.app.DefaultSpecialEffectsController$TransitionInfo> r7 = r0.transitionInfos
                java.lang.Iterable r7 = (java.lang.Iterable) r7
                r8 = 0
                java.util.ArrayList r9 = new java.util.ArrayList
                r10 = 10
                int r10 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r7, r10)
                r9.<init>(r10)
                java.util.Collection r9 = (java.util.Collection) r9
                r10 = r7
                r11 = 0
                java.util.Iterator r12 = r10.iterator()
            L80:
                boolean r13 = r12.hasNext()
                if (r13 == 0) goto L96
                java.lang.Object r13 = r12.next()
                r14 = r13
                androidx.fragment.app.DefaultSpecialEffectsController$TransitionInfo r14 = (androidx.fragment.app.DefaultSpecialEffectsController.TransitionInfo) r14
                r15 = 0
                androidx.fragment.app.SpecialEffectsController$Operation r14 = r14.getOperation()
                r9.add(r14)
                goto L80
            L96:
                java.util.List r9 = (java.util.List) r9
                java.lang.Iterable r9 = (java.lang.Iterable) r9
                r7 = 0
                java.util.Iterator r8 = r9.iterator()
            La2:
                boolean r10 = r8.hasNext()
                if (r10 == 0) goto Lc7
                java.lang.Object r10 = r8.next()
                r11 = r10
                androidx.fragment.app.SpecialEffectsController$Operation r11 = (androidx.fragment.app.SpecialEffectsController.Operation) r11
                r12 = 0
                androidx.fragment.app.FragmentTransitionImpl r13 = r0.transitionImpl
                androidx.fragment.app.Fragment r14 = r11.getFragment()
                androidx.core.os.CancellationSignal r15 = r0.transitionSignal
                r16 = r3
                androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect$$ExternalSyntheticLambda5 r3 = new androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect$$ExternalSyntheticLambda5
                r3.<init>(r11, r0)
                r13.setListenerForTransitionEnd(r14, r2, r15, r3)
                r3 = r16
                goto La2
            Lc7:
                r16 = r3
                androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect$onCommit$4 r3 = new androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect$onCommit$4
                r3.<init>(r0, r1, r2)
                kotlin.jvm.functions.Function0 r3 = (kotlin.jvm.functions.Function0) r3
                r0.runTransition(r6, r1, r3)
                boolean r3 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r16)
                if (r3 == 0) goto Lfc
            Lda:
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r7 = "Completed executing operations from "
                java.lang.StringBuilder r3 = r3.append(r7)
                androidx.fragment.app.SpecialEffectsController$Operation r7 = r0.firstOut
                java.lang.StringBuilder r3 = r3.append(r7)
                java.lang.StringBuilder r3 = r3.append(r5)
                androidx.fragment.app.SpecialEffectsController$Operation r5 = r0.lastIn
                java.lang.StringBuilder r3 = r3.append(r5)
                java.lang.String r3 = r3.toString()
                android.util.Log.v(r4, r3)
            Lfc:
                return
            Lfd:
                r16 = r3
            Lff:
                java.util.List<androidx.fragment.app.DefaultSpecialEffectsController$TransitionInfo> r2 = r0.transitionInfos
                java.lang.Iterable r2 = (java.lang.Iterable) r2
                r3 = 0
                java.util.Iterator r5 = r2.iterator()
            L108:
                boolean r6 = r5.hasNext()
                if (r6 == 0) goto L16c
                java.lang.Object r6 = r5.next()
                r7 = r6
                androidx.fragment.app.DefaultSpecialEffectsController$TransitionInfo r7 = (androidx.fragment.app.DefaultSpecialEffectsController.TransitionInfo) r7
                r8 = 0
                androidx.fragment.app.SpecialEffectsController$Operation r9 = r7.getOperation()
                boolean r10 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r16)
                if (r10 == 0) goto L15f
                boolean r10 = r0.noControllerReturned
                if (r10 == 0) goto L13d
            L125:
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                java.lang.String r11 = "SpecialEffectsController: TransitionSeekController was not created. Completing operation "
                java.lang.StringBuilder r10 = r10.append(r11)
                java.lang.StringBuilder r10 = r10.append(r9)
                java.lang.String r10 = r10.toString()
                android.util.Log.v(r4, r10)
                goto L15f
            L13d:
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                java.lang.String r11 = "SpecialEffectsController: Container "
                java.lang.StringBuilder r10 = r10.append(r11)
                java.lang.StringBuilder r10 = r10.append(r1)
                java.lang.String r11 = " has not been laid out. Completing operation "
                java.lang.StringBuilder r10 = r10.append(r11)
                java.lang.StringBuilder r10 = r10.append(r9)
                java.lang.String r10 = r10.toString()
                android.util.Log.v(r4, r10)
            L15f:
                androidx.fragment.app.SpecialEffectsController$Operation r10 = r7.getOperation()
                r11 = r0
                androidx.fragment.app.SpecialEffectsController$Effect r11 = (androidx.fragment.app.SpecialEffectsController.Effect) r11
                r10.completeEffect(r11)
                goto L108
            L16c:
                r2 = 0
                r0.noControllerReturned = r2
                return
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Effect
        public void onProgress(androidx.activity.BackEventCompat r5, android.view.ViewGroup r6) {
                r4 = this;
                java.lang.String r0 = "backEvent"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                java.lang.String r0 = "container"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
                java.lang.Object r0 = r4.controller
                if (r0 == 0) goto L18
                r1 = 0
                androidx.fragment.app.FragmentTransitionImpl r2 = r4.transitionImpl
                float r3 = r5.getProgress()
                r2.setCurrentPlayTime(r0, r3)
            L18:
                return
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Effect
        public void onStart(android.view.ViewGroup r15) {
                r14 = this;
                java.lang.String r0 = "container"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
                boolean r0 = r15.isLaidOut()
                java.lang.String r1 = "FragmentManager"
                if (r0 != 0) goto L56
                java.util.List<androidx.fragment.app.DefaultSpecialEffectsController$TransitionInfo> r0 = r14.transitionInfos
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                r2 = 0
                java.util.Iterator r3 = r0.iterator()
            L16:
                boolean r4 = r3.hasNext()
                if (r4 == 0) goto L54
                java.lang.Object r4 = r3.next()
                r5 = r4
                androidx.fragment.app.DefaultSpecialEffectsController$TransitionInfo r5 = (androidx.fragment.app.DefaultSpecialEffectsController.TransitionInfo) r5
                r6 = 0
                androidx.fragment.app.SpecialEffectsController$Operation r7 = r5.getOperation()
                r8 = 2
                boolean r8 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r8)
                if (r8 == 0) goto L51
            L30:
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                java.lang.String r9 = "SpecialEffectsController: Container "
                java.lang.StringBuilder r8 = r8.append(r9)
                java.lang.StringBuilder r8 = r8.append(r15)
                java.lang.String r9 = " has not been laid out. Skipping onStart for operation "
                java.lang.StringBuilder r8 = r8.append(r9)
                java.lang.StringBuilder r8 = r8.append(r7)
                java.lang.String r8 = r8.toString()
                android.util.Log.v(r1, r8)
            L51:
                goto L16
            L54:
                return
            L56:
                boolean r0 = r14.getTransitioning()
                if (r0 == 0) goto L9f
                java.lang.Object r0 = r14.sharedElementTransition
                if (r0 == 0) goto L9f
                boolean r0 = r14.isSeekingSupported()
                if (r0 != 0) goto L9f
            L67:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = "Ignoring shared elements transition "
                java.lang.StringBuilder r0 = r0.append(r2)
                java.lang.Object r2 = r14.sharedElementTransition
                java.lang.StringBuilder r0 = r0.append(r2)
                java.lang.String r2 = " between "
                java.lang.StringBuilder r0 = r0.append(r2)
                androidx.fragment.app.SpecialEffectsController$Operation r2 = r14.firstOut
                java.lang.StringBuilder r0 = r0.append(r2)
                java.lang.String r2 = " and "
                java.lang.StringBuilder r0 = r0.append(r2)
                androidx.fragment.app.SpecialEffectsController$Operation r2 = r14.lastIn
                java.lang.StringBuilder r0 = r0.append(r2)
                java.lang.String r2 = " as neither fragment has set a Transition. In order to run a SharedElementTransition, you must also set either an enter or exit transition on a fragment involved in the transaction. The sharedElementTransition will run after the back gesture has been committed."
                java.lang.StringBuilder r0 = r0.append(r2)
                java.lang.String r0 = r0.toString()
                android.util.Log.i(r1, r0)
            L9f:
                boolean r0 = r14.isSeekingSupported()
                if (r0 == 0) goto L130
                boolean r0 = r14.getTransitioning()
                if (r0 == 0) goto L130
                kotlin.jvm.internal.Ref$ObjectRef r0 = new kotlin.jvm.internal.Ref$ObjectRef
                r0.<init>()
                androidx.fragment.app.SpecialEffectsController$Operation r1 = r14.lastIn
                androidx.fragment.app.SpecialEffectsController$Operation r2 = r14.firstOut
                kotlin.Pair r1 = r14.createMergedTransition(r15, r1, r2)
                java.lang.Object r2 = r1.component1()
                java.util.ArrayList r2 = (java.util.ArrayList) r2
                java.lang.Object r5 = r1.component2()
                java.util.List<androidx.fragment.app.DefaultSpecialEffectsController$TransitionInfo> r1 = r14.transitionInfos
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                r3 = 0
                java.util.ArrayList r4 = new java.util.ArrayList
                r6 = 10
                int r6 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r1, r6)
                r4.<init>(r6)
                java.util.Collection r4 = (java.util.Collection) r4
                r6 = r1
                r7 = 0
                java.util.Iterator r8 = r6.iterator()
            Ldb:
                boolean r9 = r8.hasNext()
                if (r9 == 0) goto Lf1
                java.lang.Object r9 = r8.next()
                r10 = r9
                androidx.fragment.app.DefaultSpecialEffectsController$TransitionInfo r10 = (androidx.fragment.app.DefaultSpecialEffectsController.TransitionInfo) r10
                r11 = 0
                androidx.fragment.app.SpecialEffectsController$Operation r10 = r10.getOperation()
                r4.add(r10)
                goto Ldb
            Lf1:
                java.util.List r4 = (java.util.List) r4
                java.lang.Iterable r4 = (java.lang.Iterable) r4
                r1 = r4
                r9 = 0
                java.util.Iterator r10 = r1.iterator()
            Lfd:
                boolean r3 = r10.hasNext()
                if (r3 == 0) goto L125
                java.lang.Object r11 = r10.next()
                r12 = r11
                androidx.fragment.app.SpecialEffectsController$Operation r12 = (androidx.fragment.app.SpecialEffectsController.Operation) r12
                r13 = 0
                androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect$$ExternalSyntheticLambda3 r7 = new androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect$$ExternalSyntheticLambda3
                r7.<init>(r0)
                androidx.fragment.app.FragmentTransitionImpl r3 = r14.transitionImpl
                androidx.fragment.app.Fragment r4 = r12.getFragment()
                androidx.core.os.CancellationSignal r6 = r14.transitionSignal
                androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect$$ExternalSyntheticLambda4 r8 = new androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect$$ExternalSyntheticLambda4
                r8.<init>(r12, r14)
                r3.setListenerForTransitionEnd(r4, r5, r6, r7, r8)
                goto Lfd
            L125:
                androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect$onStart$4 r1 = new androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect$onStart$4
                r1.<init>(r14, r15, r5, r0)
                kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
                r14.runTransition(r2, r15, r1)
            L130:
                return
        }

        public final void setController(java.lang.Object r1) {
                r0 = this;
                r0.controller = r1
                return
        }

        public final void setNoControllerReturned(boolean r1) {
                r0 = this;
                r0.noControllerReturned = r1
                return
        }
    }

    /* JADX INFO: compiled from: DefaultSpecialEffectsController.kt */
    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\u0014\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\u000fH\u0002J\u0006\u0010\u0014\u001a\u00020\u0005R\u0013\u0010\b\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011¨\u0006\u0015"}, d2 = {"Landroidx/fragment/app/DefaultSpecialEffectsController$TransitionInfo;", "Landroidx/fragment/app/DefaultSpecialEffectsController$SpecialEffectsInfo;", "operation", "Landroidx/fragment/app/SpecialEffectsController$Operation;", "isPop", "", "providesSharedElementTransition", "(Landroidx/fragment/app/SpecialEffectsController$Operation;ZZ)V", "handlingImpl", "Landroidx/fragment/app/FragmentTransitionImpl;", "getHandlingImpl", "()Landroidx/fragment/app/FragmentTransitionImpl;", "isOverlapAllowed", "()Z", "sharedElementTransition", "", "getSharedElementTransition", "()Ljava/lang/Object;", "transition", "getTransition", "hasSharedElementTransition", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class TransitionInfo extends androidx.fragment.app.DefaultSpecialEffectsController.SpecialEffectsInfo {
        private final boolean isOverlapAllowed;
        private final java.lang.Object sharedElementTransition;
        private final java.lang.Object transition;

        public TransitionInfo(androidx.fragment.app.SpecialEffectsController.Operation r3, boolean r4, boolean r5) {
                r2 = this;
                java.lang.String r0 = "operation"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                r2.<init>(r3)
                androidx.fragment.app.SpecialEffectsController$Operation$State r0 = r3.getFinalState()
                androidx.fragment.app.SpecialEffectsController$Operation$State r1 = androidx.fragment.app.SpecialEffectsController.Operation.State.VISIBLE
                if (r0 != r1) goto L20
                androidx.fragment.app.Fragment r0 = r3.getFragment()
                if (r4 == 0) goto L1b
                java.lang.Object r0 = r0.getReenterTransition()
                goto L2f
            L1b:
                java.lang.Object r0 = r0.getEnterTransition()
                goto L2f
            L20:
                androidx.fragment.app.Fragment r0 = r3.getFragment()
                if (r4 == 0) goto L2b
                java.lang.Object r0 = r0.getReturnTransition()
                goto L2f
            L2b:
                java.lang.Object r0 = r0.getExitTransition()
            L2f:
                r2.transition = r0
                androidx.fragment.app.SpecialEffectsController$Operation$State r0 = r3.getFinalState()
                androidx.fragment.app.SpecialEffectsController$Operation$State r1 = androidx.fragment.app.SpecialEffectsController.Operation.State.VISIBLE
                if (r0 != r1) goto L4d
                if (r4 == 0) goto L44
                androidx.fragment.app.Fragment r0 = r3.getFragment()
                boolean r0 = r0.getAllowReturnTransitionOverlap()
                goto L4e
            L44:
                androidx.fragment.app.Fragment r0 = r3.getFragment()
                boolean r0 = r0.getAllowEnterTransitionOverlap()
                goto L4e
            L4d:
                r0 = 1
            L4e:
                r2.isOverlapAllowed = r0
                if (r5 == 0) goto L66
                if (r4 == 0) goto L5d
                androidx.fragment.app.Fragment r0 = r3.getFragment()
                java.lang.Object r0 = r0.getSharedElementReturnTransition()
                goto L67
            L5d:
                androidx.fragment.app.Fragment r0 = r3.getFragment()
                java.lang.Object r0 = r0.getSharedElementEnterTransition()
                goto L67
            L66:
                r0 = 0
            L67:
                r2.sharedElementTransition = r0
                return
        }

        private final androidx.fragment.app.FragmentTransitionImpl getHandlingImpl(java.lang.Object r4) {
                r3 = this;
                if (r4 != 0) goto L4
                r0 = 0
                return r0
            L4:
                androidx.fragment.app.FragmentTransitionImpl r0 = androidx.fragment.app.FragmentTransition.PLATFORM_IMPL
                if (r0 == 0) goto L13
                androidx.fragment.app.FragmentTransitionImpl r0 = androidx.fragment.app.FragmentTransition.PLATFORM_IMPL
                boolean r0 = r0.canHandle(r4)
                if (r0 == 0) goto L13
                androidx.fragment.app.FragmentTransitionImpl r0 = androidx.fragment.app.FragmentTransition.PLATFORM_IMPL
                return r0
            L13:
                androidx.fragment.app.FragmentTransitionImpl r0 = androidx.fragment.app.FragmentTransition.SUPPORT_IMPL
                if (r0 == 0) goto L22
                androidx.fragment.app.FragmentTransitionImpl r0 = androidx.fragment.app.FragmentTransition.SUPPORT_IMPL
                boolean r0 = r0.canHandle(r4)
                if (r0 == 0) goto L22
                androidx.fragment.app.FragmentTransitionImpl r0 = androidx.fragment.app.FragmentTransition.SUPPORT_IMPL
                return r0
            L22:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Transition "
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.StringBuilder r1 = r1.append(r4)
                java.lang.String r2 = " for fragment "
                java.lang.StringBuilder r1 = r1.append(r2)
                androidx.fragment.app.SpecialEffectsController$Operation r2 = r3.getOperation()
                androidx.fragment.app.Fragment r2 = r2.getFragment()
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.String r2 = " is not a valid framework Transition or AndroidX Transition"
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
        }

        public final androidx.fragment.app.FragmentTransitionImpl getHandlingImpl() {
                r5 = this;
                java.lang.Object r0 = r5.transition
                androidx.fragment.app.FragmentTransitionImpl r0 = r5.getHandlingImpl(r0)
                java.lang.Object r1 = r5.sharedElementTransition
                androidx.fragment.app.FragmentTransitionImpl r1 = r5.getHandlingImpl(r1)
                if (r0 == 0) goto L15
                if (r1 == 0) goto L15
                if (r0 != r1) goto L13
                goto L15
            L13:
                r2 = 0
                goto L16
            L15:
                r2 = 1
            L16:
                if (r2 == 0) goto L1e
                if (r0 != 0) goto L1c
                r2 = r1
                goto L1d
            L1c:
                r2 = r0
            L1d:
                return r2
            L1e:
                r2 = 0
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "Mixing framework transitions and AndroidX transitions is not allowed. Fragment "
                java.lang.StringBuilder r3 = r3.append(r4)
                androidx.fragment.app.SpecialEffectsController$Operation r4 = r5.getOperation()
                androidx.fragment.app.Fragment r4 = r4.getFragment()
                java.lang.StringBuilder r3 = r3.append(r4)
                java.lang.String r4 = " returned Transition "
                java.lang.StringBuilder r3 = r3.append(r4)
                java.lang.Object r4 = r5.transition
                java.lang.StringBuilder r3 = r3.append(r4)
                java.lang.String r4 = " which uses a different Transition  type than its shared element transition "
                java.lang.StringBuilder r3 = r3.append(r4)
                java.lang.Object r4 = r5.sharedElementTransition
                java.lang.StringBuilder r3 = r3.append(r4)
                java.lang.String r2 = r3.toString()
                java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
                java.lang.String r2 = r2.toString()
                r3.<init>(r2)
                throw r3
        }

        public final java.lang.Object getSharedElementTransition() {
                r1 = this;
                java.lang.Object r0 = r1.sharedElementTransition
                return r0
        }

        public final java.lang.Object getTransition() {
                r1 = this;
                java.lang.Object r0 = r1.transition
                return r0
        }

        public final boolean hasSharedElementTransition() {
                r1 = this;
                java.lang.Object r0 = r1.sharedElementTransition
                if (r0 == 0) goto L6
                r0 = 1
                goto L7
            L6:
                r0 = 0
            L7:
                return r0
        }

        public final boolean isOverlapAllowed() {
                r1 = this;
                boolean r0 = r1.isOverlapAllowed
                return r0
        }
    }


    /* JADX INFO: renamed from: $r8$lambda$d3w-9IvNeMua7NQR_JFd0slR_vo, reason: not valid java name */
    public static /* synthetic */ void m80$r8$lambda$d3w9IvNeMua7NQR_JFd0slR_vo(androidx.fragment.app.DefaultSpecialEffectsController r0, androidx.fragment.app.SpecialEffectsController.Operation r1) {
            collectEffects$lambda$2(r0, r1)
            return
    }

    public DefaultSpecialEffectsController(android.view.ViewGroup r2) {
            r1 = this;
            java.lang.String r0 = "container"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.<init>(r2)
            return
    }

    private final void collectAnimEffects(java.util.List<androidx.fragment.app.DefaultSpecialEffectsController.AnimationInfo> r16) {
            r15 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List r0 = (java.util.List) r0
            r1 = r16
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            r2 = 0
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Collection r3 = (java.util.Collection) r3
            r4 = r1
            r5 = 0
            java.util.Iterator r6 = r4.iterator()
        L19:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L35
            java.lang.Object r7 = r6.next()
            r8 = r7
            androidx.fragment.app.DefaultSpecialEffectsController$AnimationInfo r8 = (androidx.fragment.app.DefaultSpecialEffectsController.AnimationInfo) r8
            r9 = 0
            androidx.fragment.app.SpecialEffectsController$Operation r10 = r8.getOperation()
            java.util.List r8 = r10.getEffects$fragment_release()
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            kotlin.collections.CollectionsKt.addAll(r3, r8)
            goto L19
        L35:
            java.util.List r3 = (java.util.List) r3
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r1 = r3.isEmpty()
            r2 = 1
            r1 = r1 ^ r2
            r3 = 0
            java.util.Iterator r4 = r16.iterator()
        L47:
            boolean r5 = r4.hasNext()
            java.lang.String r6 = "FragmentManager"
            r7 = 2
            if (r5 == 0) goto Lc9
            java.lang.Object r5 = r4.next()
            androidx.fragment.app.DefaultSpecialEffectsController$AnimationInfo r5 = (androidx.fragment.app.DefaultSpecialEffectsController.AnimationInfo) r5
            android.view.ViewGroup r8 = r15.getContainer()
            android.content.Context r8 = r8.getContext()
            androidx.fragment.app.SpecialEffectsController$Operation r9 = r5.getOperation()
            java.lang.String r10 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r10)
            androidx.fragment.app.FragmentAnim$AnimationOrAnimator r10 = r5.getAnimation(r8)
            if (r10 != 0) goto L6e
            goto L47
        L6e:
            android.animation.AnimatorSet r11 = r10.animator
            if (r11 != 0) goto L76
            r0.add(r5)
            goto L47
        L76:
            androidx.fragment.app.Fragment r12 = r9.getFragment()
            java.util.List r13 = r9.getEffects$fragment_release()
            java.util.Collection r13 = (java.util.Collection) r13
            boolean r13 = r13.isEmpty()
            r13 = r13 ^ r2
            if (r13 == 0) goto Lab
            boolean r7 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r7)
            if (r7 == 0) goto Laa
        L8e:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r14 = "Ignoring Animator set on "
            java.lang.StringBuilder r7 = r7.append(r14)
            java.lang.StringBuilder r7 = r7.append(r12)
            java.lang.String r14 = " as this Fragment was involved in a Transition."
            java.lang.StringBuilder r7 = r7.append(r14)
            java.lang.String r7 = r7.toString()
            android.util.Log.v(r6, r7)
        Laa:
            goto L47
        Lab:
            r3 = 1
            androidx.fragment.app.SpecialEffectsController$Operation$State r6 = r9.getFinalState()
            androidx.fragment.app.SpecialEffectsController$Operation$State r7 = androidx.fragment.app.SpecialEffectsController.Operation.State.GONE
            r14 = 0
            if (r6 != r7) goto Lb7
            r6 = r2
            goto Lb8
        Lb7:
            r6 = r14
        Lb8:
            if (r6 == 0) goto Lbd
            r9.setAwaitingContainerChanges(r14)
        Lbd:
            androidx.fragment.app.DefaultSpecialEffectsController$AnimatorEffect r7 = new androidx.fragment.app.DefaultSpecialEffectsController$AnimatorEffect
            r7.<init>(r5)
            androidx.fragment.app.SpecialEffectsController$Effect r7 = (androidx.fragment.app.SpecialEffectsController.Effect) r7
            r9.addEffect(r7)
            goto L47
        Lc9:
            java.util.Iterator r2 = r0.iterator()
        Lcd:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L136
            java.lang.Object r4 = r2.next()
            androidx.fragment.app.DefaultSpecialEffectsController$AnimationInfo r4 = (androidx.fragment.app.DefaultSpecialEffectsController.AnimationInfo) r4
            androidx.fragment.app.SpecialEffectsController$Operation r5 = r4.getOperation()
            androidx.fragment.app.Fragment r8 = r5.getFragment()
            java.lang.String r9 = "Ignoring Animation set on "
            if (r1 == 0) goto L107
            boolean r10 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r7)
            if (r10 == 0) goto L106
        Lec:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.StringBuilder r9 = r10.append(r9)
            java.lang.StringBuilder r9 = r9.append(r8)
            java.lang.String r10 = " as Animations cannot run alongside Transitions."
            java.lang.StringBuilder r9 = r9.append(r10)
            java.lang.String r9 = r9.toString()
            android.util.Log.v(r6, r9)
        L106:
            goto Lcd
        L107:
            if (r3 == 0) goto L12b
            boolean r10 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r7)
            if (r10 == 0) goto L12a
        L110:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.StringBuilder r9 = r10.append(r9)
            java.lang.StringBuilder r9 = r9.append(r8)
            java.lang.String r10 = " as Animations cannot run alongside Animators."
            java.lang.StringBuilder r9 = r9.append(r10)
            java.lang.String r9 = r9.toString()
            android.util.Log.v(r6, r9)
        L12a:
            goto Lcd
        L12b:
            androidx.fragment.app.DefaultSpecialEffectsController$AnimationEffect r9 = new androidx.fragment.app.DefaultSpecialEffectsController$AnimationEffect
            r9.<init>(r4)
            androidx.fragment.app.SpecialEffectsController$Effect r9 = (androidx.fragment.app.SpecialEffectsController.Effect) r9
            r5.addEffect(r9)
            goto Lcd
        L136:
            return
    }

    private static final void collectEffects$lambda$2(androidx.fragment.app.DefaultSpecialEffectsController r1, androidx.fragment.app.SpecialEffectsController.Operation r2) {
            java.lang.String r0 = "this$0"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "$operation"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.applyContainerChangesToOperation$fragment_release(r2)
            return
    }

    private final void createTransitionEffect(java.util.List<androidx.fragment.app.DefaultSpecialEffectsController.TransitionInfo> r36, boolean r37, androidx.fragment.app.SpecialEffectsController.Operation r38, androidx.fragment.app.SpecialEffectsController.Operation r39) {
            r35 = this;
            r0 = r35
            r3 = r38
            r4 = r39
            r1 = r36
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            r2 = 0
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Collection r5 = (java.util.Collection) r5
            r6 = r1
            r7 = 0
            java.util.Iterator r8 = r6.iterator()
        L18:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L30
            java.lang.Object r9 = r8.next()
            r10 = r9
            androidx.fragment.app.DefaultSpecialEffectsController$TransitionInfo r10 = (androidx.fragment.app.DefaultSpecialEffectsController.TransitionInfo) r10
            r11 = 0
            boolean r10 = r10.isVisibilityUnchanged()
            if (r10 != 0) goto L18
            r5.add(r9)
            goto L18
        L30:
            java.util.List r5 = (java.util.List) r5
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            r1 = 0
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Collection r2 = (java.util.Collection) r2
            r6 = r5
            r7 = 0
            java.util.Iterator r8 = r6.iterator()
        L45:
            boolean r9 = r8.hasNext()
            r10 = 0
            if (r9 == 0) goto L61
            java.lang.Object r9 = r8.next()
            r12 = r9
            androidx.fragment.app.DefaultSpecialEffectsController$TransitionInfo r12 = (androidx.fragment.app.DefaultSpecialEffectsController.TransitionInfo) r12
            r13 = 0
            androidx.fragment.app.FragmentTransitionImpl r14 = r12.getHandlingImpl()
            if (r14 == 0) goto L5b
            r10 = 1
        L5b:
            if (r10 == 0) goto L45
            r2.add(r9)
            goto L45
        L61:
            java.util.List r2 = (java.util.List) r2
            r1 = r2
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            r5 = 0
            r6 = 0
            r7 = r5
            java.util.Iterator r8 = r1.iterator()
        L73:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto Ld1
            java.lang.Object r9 = r8.next()
            r12 = r9
            androidx.fragment.app.DefaultSpecialEffectsController$TransitionInfo r12 = (androidx.fragment.app.DefaultSpecialEffectsController.TransitionInfo) r12
            r13 = r7
            r14 = 0
            androidx.fragment.app.FragmentTransitionImpl r15 = r12.getHandlingImpl()
            if (r13 == 0) goto L8e
            if (r15 != r13) goto L8b
            goto L8e
        L8b:
            r16 = r10
            goto L90
        L8e:
            r16 = 1
        L90:
            if (r16 == 0) goto L95
        L93:
            r7 = r15
            goto L73
        L95:
            r8 = 0
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "Mixing framework transitions and AndroidX transitions is not allowed. Fragment "
            java.lang.StringBuilder r10 = r10.append(r11)
            androidx.fragment.app.SpecialEffectsController$Operation r11 = r12.getOperation()
            androidx.fragment.app.Fragment r11 = r11.getFragment()
            java.lang.StringBuilder r10 = r10.append(r11)
            java.lang.String r11 = " returned Transition "
            java.lang.StringBuilder r10 = r10.append(r11)
            java.lang.Object r11 = r12.getTransition()
            java.lang.StringBuilder r10 = r10.append(r11)
            java.lang.String r11 = " which uses a different Transition type than other Fragments."
            java.lang.StringBuilder r10 = r10.append(r11)
            java.lang.String r8 = r10.toString()
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r8 = r8.toString()
            r10.<init>(r8)
            throw r10
        Ld1:
            if (r7 != 0) goto Ld5
            return
        Ld5:
            r5 = r7
            r1 = 0
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            androidx.collection.ArrayMap r9 = new androidx.collection.ArrayMap
            r9.<init>()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            androidx.collection.ArrayMap r13 = new androidx.collection.ArrayMap
            r13.<init>()
            androidx.collection.ArrayMap r14 = new androidx.collection.ArrayMap
            r14.<init>()
            java.util.Iterator r15 = r2.iterator()
            r34 = r6
            r6 = r1
            r1 = r10
            r10 = r34
        L104:
            boolean r16 = r15.hasNext()
            if (r16 == 0) goto L45a
            java.lang.Object r16 = r15.next()
            androidx.fragment.app.DefaultSpecialEffectsController$TransitionInfo r16 = (androidx.fragment.app.DefaultSpecialEffectsController.TransitionInfo) r16
            boolean r17 = r16.hasSharedElementTransition()
            if (r17 == 0) goto L443
            if (r3 == 0) goto L443
            if (r4 == 0) goto L443
        L11b:
            java.lang.Object r1 = r16.getSharedElementTransition()
            java.lang.Object r1 = r5.cloneTransition(r1)
            java.lang.Object r6 = r5.wrapTransitionInSet(r1)
            androidx.fragment.app.Fragment r1 = r4.getFragment()
            java.util.ArrayList r1 = r1.getSharedElementSourceNames()
            java.lang.String r11 = "lastIn.fragment.sharedElementSourceNames"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r11)
            r12 = r1
            androidx.fragment.app.Fragment r1 = r3.getFragment()
            java.util.ArrayList r1 = r1.getSharedElementSourceNames()
            java.lang.String r11 = "firstOut.fragment.sharedElementSourceNames"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r11)
            androidx.fragment.app.Fragment r11 = r3.getFragment()
            java.util.ArrayList r11 = r11.getSharedElementTargetNames()
            r19 = r2
            java.lang.String r2 = "firstOut.fragment.sharedElementTargetNames"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r2)
            r2 = 0
            r20 = r2
            int r2 = r11.size()
            r21 = r5
            r5 = r20
        L15c:
            r20 = r7
            if (r5 >= r2) goto L17b
            java.lang.Object r7 = r11.get(r5)
            int r7 = r12.indexOf(r7)
            r23 = r2
            r2 = -1
            if (r7 == r2) goto L174
            java.lang.Object r2 = r1.get(r5)
            r12.set(r7, r2)
        L174:
            int r5 = r5 + 1
            r7 = r20
            r2 = r23
            goto L15c
        L17b:
            androidx.fragment.app.Fragment r2 = r4.getFragment()
            java.util.ArrayList r2 = r2.getSharedElementTargetNames()
            java.lang.String r5 = "lastIn.fragment.sharedElementTargetNames"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r5)
            r10 = r2
            if (r37 != 0) goto L1a0
            androidx.fragment.app.Fragment r2 = r3.getFragment()
            androidx.core.app.SharedElementCallback r2 = r2.getExitTransitionCallback()
            androidx.fragment.app.Fragment r5 = r4.getFragment()
            androidx.core.app.SharedElementCallback r5 = r5.getEnterTransitionCallback()
            kotlin.Pair r2 = kotlin.TuplesKt.to(r2, r5)
            goto L1b4
        L1a0:
            androidx.fragment.app.Fragment r2 = r3.getFragment()
            androidx.core.app.SharedElementCallback r2 = r2.getEnterTransitionCallback()
            androidx.fragment.app.Fragment r5 = r4.getFragment()
            androidx.core.app.SharedElementCallback r5 = r5.getExitTransitionCallback()
            kotlin.Pair r2 = kotlin.TuplesKt.to(r2, r5)
        L1b4:
            java.lang.Object r5 = r2.component1()
            androidx.core.app.SharedElementCallback r5 = (androidx.core.app.SharedElementCallback) r5
            java.lang.Object r2 = r2.component2()
            androidx.core.app.SharedElementCallback r2 = (androidx.core.app.SharedElementCallback) r2
            int r7 = r12.size()
            r23 = 0
            r24 = r1
            r1 = r23
        L1ca:
            r23 = r8
            java.lang.String r8 = "enteringNames[i]"
            r25 = r11
            java.lang.String r11 = "exitingNames[i]"
            if (r1 >= r7) goto L1f8
            r26 = r7
            java.lang.Object r7 = r12.get(r1)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r11)
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r11 = r10.get(r1)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r8)
            r8 = r11
            java.lang.String r8 = (java.lang.String) r8
            r11 = r9
            java.util.Map r11 = (java.util.Map) r11
            r11.put(r7, r8)
            int r1 = r1 + 1
            r8 = r23
            r11 = r25
            r7 = r26
            goto L1ca
        L1f8:
            r26 = r7
            r1 = 2
            boolean r7 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r1)
            r27 = r1
            java.lang.String r1 = "FragmentManager"
            if (r7 == 0) goto L271
            java.lang.String r7 = ">>> entering view names <<<"
            android.util.Log.v(r1, r7)
            java.util.Iterator r7 = r10.iterator()
        L20e:
            boolean r28 = r7.hasNext()
            r29 = r7
            java.lang.String r7 = "Name: "
            if (r28 == 0) goto L23f
            java.lang.Object r28 = r29.next()
            r30 = r15
            r15 = r28
            java.lang.String r15 = (java.lang.String) r15
            r28 = r6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.StringBuilder r6 = r6.append(r7)
            java.lang.StringBuilder r6 = r6.append(r15)
            java.lang.String r6 = r6.toString()
            android.util.Log.v(r1, r6)
            r6 = r28
            r7 = r29
            r15 = r30
            goto L20e
        L23f:
            r28 = r6
            r30 = r15
            java.lang.String r6 = ">>> exiting view names <<<"
            android.util.Log.v(r1, r6)
            java.util.Iterator r6 = r12.iterator()
        L24c:
            boolean r15 = r6.hasNext()
            if (r15 == 0) goto L275
            java.lang.Object r15 = r6.next()
            java.lang.String r15 = (java.lang.String) r15
            r29 = r6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.StringBuilder r6 = r6.append(r7)
            java.lang.StringBuilder r6 = r6.append(r15)
            java.lang.String r6 = r6.toString()
            android.util.Log.v(r1, r6)
            r6 = r29
            goto L24c
        L271:
            r28 = r6
            r30 = r15
        L275:
            r6 = r13
            java.util.Map r6 = (java.util.Map) r6
            androidx.fragment.app.Fragment r7 = r3.getFragment()
            android.view.View r7 = r7.mView
            java.lang.String r15 = "firstOut.fragment.mView"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r15)
            r0.findNamedViews(r6, r7)
            r6 = r12
            java.util.Collection r6 = (java.util.Collection) r6
            r13.retainAll(r6)
            if (r5 == 0) goto L30e
            boolean r6 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r27)
            if (r6 == 0) goto L2ab
        L295:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "Executing exit callback for operation "
            java.lang.StringBuilder r6 = r6.append(r7)
            java.lang.StringBuilder r6 = r6.append(r3)
            java.lang.String r6 = r6.toString()
            android.util.Log.v(r1, r6)
        L2ab:
            r6 = r12
            java.util.List r6 = (java.util.List) r6
            r7 = r13
            java.util.Map r7 = (java.util.Map) r7
            r5.onMapSharedElements(r6, r7)
            int r6 = r12.size()
            r22 = -1
            int r6 = r6 + (-1)
            if (r6 < 0) goto L30b
        L2be:
            r7 = r6
            int r6 = r6 + (-1)
            java.lang.Object r15 = r12.get(r7)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r15, r11)
            java.lang.String r15 = (java.lang.String) r15
            java.lang.Object r29 = r13.get(r15)
            android.view.View r29 = (android.view.View) r29
            if (r29 != 0) goto L2dc
            r9.remove(r15)
            r31 = r5
            r32 = r6
            r33 = r7
            goto L301
        L2dc:
            r31 = r5
            java.lang.String r5 = androidx.core.view.ViewCompat.getTransitionName(r29)
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual(r15, r5)
            if (r5 != 0) goto L2fd
            java.lang.Object r5 = r9.remove(r15)
            java.lang.String r5 = (java.lang.String) r5
            r32 = r6
            r6 = r9
            java.util.Map r6 = (java.util.Map) r6
            r33 = r7
            java.lang.String r7 = androidx.core.view.ViewCompat.getTransitionName(r29)
            r6.put(r7, r5)
            goto L301
        L2fd:
            r32 = r6
            r33 = r7
        L301:
            if (r32 >= 0) goto L304
            goto L319
        L304:
            r5 = r31
            r6 = r32
            r22 = -1
            goto L2be
        L30b:
            r31 = r5
            goto L319
        L30e:
            r31 = r5
            java.util.Set r5 = r13.keySet()
            java.util.Collection r5 = (java.util.Collection) r5
            r9.retainAll(r5)
        L319:
            r5 = r14
            java.util.Map r5 = (java.util.Map) r5
            androidx.fragment.app.Fragment r6 = r4.getFragment()
            android.view.View r6 = r6.mView
            java.lang.String r7 = "lastIn.fragment.mView"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r7)
            r0.findNamedViews(r5, r6)
            r5 = r10
            java.util.Collection r5 = (java.util.Collection) r5
            r14.retainAll(r5)
            java.util.Collection r5 = r9.values()
            r14.retainAll(r5)
            if (r2 == 0) goto L3c3
            boolean r5 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r27)
            if (r5 == 0) goto L356
        L340:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Executing enter callback for operation "
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.StringBuilder r5 = r5.append(r4)
            java.lang.String r5 = r5.toString()
            android.util.Log.v(r1, r5)
        L356:
            r5 = r10
            java.util.List r5 = (java.util.List) r5
            r6 = r14
            java.util.Map r6 = (java.util.Map) r6
            r2.onMapSharedElements(r5, r6)
            int r5 = r10.size()
            r22 = -1
            int r5 = r5 + (-1)
            if (r5 < 0) goto L3c0
        L369:
            r6 = r5
            int r5 = r5 + (-1)
            java.lang.Object r7 = r10.get(r6)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r8)
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r11 = r14.get(r7)
            android.view.View r11 = (android.view.View) r11
            if (r11 != 0) goto L390
            java.lang.String r15 = androidx.fragment.app.FragmentTransition.findKeyForValue(r9, r7)
            if (r15 == 0) goto L38b
            r9.remove(r15)
            r27 = r2
            r29 = r5
            goto L3b8
        L38b:
            r27 = r2
            r29 = r5
            goto L3b8
        L390:
            java.lang.String r15 = androidx.core.view.ViewCompat.getTransitionName(r11)
            boolean r15 = kotlin.jvm.internal.Intrinsics.areEqual(r7, r15)
            if (r15 != 0) goto L3b4
            java.lang.String r15 = androidx.fragment.app.FragmentTransition.findKeyForValue(r9, r7)
            if (r15 == 0) goto L3af
            r27 = r2
            r2 = r9
            java.util.Map r2 = (java.util.Map) r2
            r29 = r5
            java.lang.String r5 = androidx.core.view.ViewCompat.getTransitionName(r11)
            r2.put(r15, r5)
            goto L3b8
        L3af:
            r27 = r2
            r29 = r5
            goto L3b8
        L3b4:
            r27 = r2
            r29 = r5
        L3b8:
            if (r29 >= 0) goto L3bb
            goto L3c8
        L3bb:
            r2 = r27
            r5 = r29
            goto L369
        L3c0:
            r27 = r2
            goto L3c8
        L3c3:
            r27 = r2
            androidx.fragment.app.FragmentTransition.retainValues(r9, r14)
        L3c8:
            java.util.Set r2 = r9.keySet()
            java.lang.String r5 = "sharedElementNameMapping.keys"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r5)
            java.util.Collection r2 = (java.util.Collection) r2
            r0.retainMatchingViews(r13, r2)
            java.util.Collection r2 = r9.values()
            java.lang.String r5 = "sharedElementNameMapping.values"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r5)
            r0.retainMatchingViews(r14, r2)
            boolean r2 = r9.isEmpty()
            if (r2 == 0) goto L433
        L3e9:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r5 = "Ignoring shared elements transition "
            java.lang.StringBuilder r2 = r2.append(r5)
            r5 = r28
            java.lang.StringBuilder r2 = r2.append(r5)
            java.lang.String r6 = " between "
            java.lang.StringBuilder r2 = r2.append(r6)
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r6 = " and "
            java.lang.StringBuilder r2 = r2.append(r6)
            java.lang.StringBuilder r2 = r2.append(r4)
            java.lang.String r6 = " as there are no matching elements in both the entering and exiting fragment. In order to run a SharedElementTransition, both fragments involved must have the element."
            java.lang.StringBuilder r2 = r2.append(r6)
            java.lang.String r2 = r2.toString()
            android.util.Log.i(r1, r2)
            r6 = 0
            r20.clear()
            r23.clear()
            r2 = r19
            r7 = r20
            r5 = r21
            r8 = r23
            r15 = r30
            r1 = 0
            goto L104
        L433:
            r5 = r28
            r6 = r5
            r2 = r19
            r7 = r20
            r5 = r21
            r8 = r23
            r15 = r30
            r1 = 0
            goto L104
        L443:
            r19 = r2
            r21 = r5
            r20 = r7
            r23 = r8
            r30 = r15
            r2 = r19
            r7 = r20
            r5 = r21
            r8 = r23
            r15 = r30
            r1 = 0
            goto L104
        L45a:
            r19 = r2
            r21 = r5
            r20 = r7
            r23 = r8
            if (r6 != 0) goto L49e
            r1 = r19
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            r2 = 0
            boolean r5 = r1 instanceof java.util.Collection
            if (r5 == 0) goto L479
            r5 = r1
            java.util.Collection r5 = (java.util.Collection) r5
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L479
            r18 = 1
            goto L49b
        L479:
            java.util.Iterator r5 = r1.iterator()
        L47d:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L499
            java.lang.Object r7 = r5.next()
            r8 = r7
            androidx.fragment.app.DefaultSpecialEffectsController$TransitionInfo r8 = (androidx.fragment.app.DefaultSpecialEffectsController.TransitionInfo) r8
            r11 = 0
            java.lang.Object r15 = r8.getTransition()
            if (r15 != 0) goto L493
            r8 = 1
            goto L494
        L493:
            r8 = 0
        L494:
            if (r8 != 0) goto L47d
            r18 = 0
            goto L49b
        L499:
            r18 = 1
        L49b:
            if (r18 == 0) goto L49e
            return
        L49e:
            androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect r1 = new androidx.fragment.app.DefaultSpecialEffectsController$TransitionEffect
            r11 = r12
            r12 = r13
            r13 = r14
            r2 = r19
            r7 = r20
            r5 = r21
            r8 = r23
            r14 = r37
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r3 = r2
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            r4 = 0
            java.util.Iterator r7 = r3.iterator()
        L4bb:
            boolean r14 = r7.hasNext()
            if (r14 == 0) goto L4dd
            java.lang.Object r14 = r7.next()
            r15 = r14
            androidx.fragment.app.DefaultSpecialEffectsController$TransitionInfo r15 = (androidx.fragment.app.DefaultSpecialEffectsController.TransitionInfo) r15
            r16 = 0
            androidx.fragment.app.SpecialEffectsController$Operation r0 = r15.getOperation()
            r17 = r1
            r1 = r17
            androidx.fragment.app.SpecialEffectsController$Effect r1 = (androidx.fragment.app.SpecialEffectsController.Effect) r1
            r0.addEffect(r1)
            r0 = r35
            r1 = r17
            goto L4bb
        L4dd:
            return
    }

    private final void findNamedViews(java.util.Map<java.lang.String, android.view.View> r6, android.view.View r7) {
            r5 = this;
            java.lang.String r0 = androidx.core.view.ViewCompat.getTransitionName(r7)
            if (r0 == 0) goto L9
            r6.put(r0, r7)
        L9:
            boolean r1 = r7 instanceof android.view.ViewGroup
            if (r1 == 0) goto L2f
            r1 = r7
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            int r1 = r1.getChildCount()
            r2 = 0
        L15:
            if (r2 >= r1) goto L2f
            r3 = r7
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            android.view.View r3 = r3.getChildAt(r2)
            int r4 = r3.getVisibility()
            if (r4 != 0) goto L2c
            java.lang.String r4 = "child"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            r5.findNamedViews(r6, r3)
        L2c:
            int r2 = r2 + 1
            goto L15
        L2f:
            return
    }

    private final void retainMatchingViews(androidx.collection.ArrayMap<java.lang.String, android.view.View> r3, java.util.Collection<java.lang.String> r4) {
            r2 = this;
            java.util.Set r0 = r3.entrySet()
            java.lang.String r1 = "entries"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            androidx.fragment.app.DefaultSpecialEffectsController$retainMatchingViews$1 r1 = new androidx.fragment.app.DefaultSpecialEffectsController$retainMatchingViews$1
            r1.<init>(r4)
            kotlin.jvm.functions.Function1 r1 = (kotlin.jvm.functions.Function1) r1
            kotlin.collections.CollectionsKt.retainAll(r0, r1)
            return
    }

    private final void syncAnimations(java.util.List<? extends androidx.fragment.app.SpecialEffectsController.Operation> r6) {
            r5 = this;
            java.lang.Object r0 = kotlin.collections.CollectionsKt.last(r6)
            androidx.fragment.app.SpecialEffectsController$Operation r0 = (androidx.fragment.app.SpecialEffectsController.Operation) r0
            androidx.fragment.app.Fragment r0 = r0.getFragment()
            java.util.Iterator r1 = r6.iterator()
        Le:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L4b
            java.lang.Object r2 = r1.next()
            androidx.fragment.app.SpecialEffectsController$Operation r2 = (androidx.fragment.app.SpecialEffectsController.Operation) r2
            androidx.fragment.app.Fragment r3 = r2.getFragment()
            androidx.fragment.app.Fragment$AnimationInfo r3 = r3.mAnimationInfo
            androidx.fragment.app.Fragment$AnimationInfo r4 = r0.mAnimationInfo
            int r4 = r4.mEnterAnim
            r3.mEnterAnim = r4
            androidx.fragment.app.Fragment r3 = r2.getFragment()
            androidx.fragment.app.Fragment$AnimationInfo r3 = r3.mAnimationInfo
            androidx.fragment.app.Fragment$AnimationInfo r4 = r0.mAnimationInfo
            int r4 = r4.mExitAnim
            r3.mExitAnim = r4
            androidx.fragment.app.Fragment r3 = r2.getFragment()
            androidx.fragment.app.Fragment$AnimationInfo r3 = r3.mAnimationInfo
            androidx.fragment.app.Fragment$AnimationInfo r4 = r0.mAnimationInfo
            int r4 = r4.mPopEnterAnim
            r3.mPopEnterAnim = r4
            androidx.fragment.app.Fragment r3 = r2.getFragment()
            androidx.fragment.app.Fragment$AnimationInfo r3 = r3.mAnimationInfo
            androidx.fragment.app.Fragment$AnimationInfo r4 = r0.mAnimationInfo
            int r4 = r4.mPopExitAnim
            r3.mPopExitAnim = r4
            goto Le
        L4b:
            return
    }

    @Override // androidx.fragment.app.SpecialEffectsController
    public void collectEffects(java.util.List<? extends androidx.fragment.app.SpecialEffectsController.Operation> r18, boolean r19) {
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            java.lang.String r3 = "operations"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r3)
            r3 = 2
            boolean r4 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r3)
            java.lang.String r5 = "FragmentManager"
            if (r4 == 0) goto L19
            java.lang.String r4 = "Collecting Effects"
            android.util.Log.v(r5, r4)
        L19:
            r4 = r1
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            r6 = 0
            java.util.Iterator r7 = r4.iterator()
        L21:
            boolean r8 = r7.hasNext()
            java.lang.String r9 = "operation.fragment.mView"
            r12 = 0
            if (r8 == 0) goto L59
            java.lang.Object r8 = r7.next()
            r13 = r8
            androidx.fragment.app.SpecialEffectsController$Operation r13 = (androidx.fragment.app.SpecialEffectsController.Operation) r13
            r14 = 0
            androidx.fragment.app.SpecialEffectsController$Operation$State$Companion r15 = androidx.fragment.app.SpecialEffectsController.Operation.State.Companion
            r16 = r3
            androidx.fragment.app.Fragment r3 = r13.getFragment()
            android.view.View r3 = r3.mView
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r9)
            androidx.fragment.app.SpecialEffectsController$Operation$State r3 = r15.asOperationState(r3)
            androidx.fragment.app.SpecialEffectsController$Operation$State r15 = androidx.fragment.app.SpecialEffectsController.Operation.State.VISIBLE
            if (r3 != r15) goto L51
            androidx.fragment.app.SpecialEffectsController$Operation$State r15 = r13.getFinalState()
            androidx.fragment.app.SpecialEffectsController$Operation$State r10 = androidx.fragment.app.SpecialEffectsController.Operation.State.VISIBLE
            if (r15 == r10) goto L51
            r10 = 1
            goto L52
        L51:
            r10 = r12
        L52:
            if (r10 == 0) goto L56
            goto L5c
        L56:
            r3 = r16
            goto L21
        L59:
            r16 = r3
            r8 = 0
        L5c:
            r3 = r8
            androidx.fragment.app.SpecialEffectsController$Operation r3 = (androidx.fragment.app.SpecialEffectsController.Operation) r3
            r4 = r18
            r6 = 0
            int r7 = r4.size()
            java.util.ListIterator r7 = r4.listIterator(r7)
        L6a:
            boolean r8 = r7.hasPrevious()
            if (r8 == 0) goto L9b
            java.lang.Object r8 = r7.previous()
            r10 = r8
            androidx.fragment.app.SpecialEffectsController$Operation r10 = (androidx.fragment.app.SpecialEffectsController.Operation) r10
            r13 = 0
            androidx.fragment.app.SpecialEffectsController$Operation$State$Companion r14 = androidx.fragment.app.SpecialEffectsController.Operation.State.Companion
            androidx.fragment.app.Fragment r15 = r10.getFragment()
            android.view.View r15 = r15.mView
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r15, r9)
            androidx.fragment.app.SpecialEffectsController$Operation$State r14 = r14.asOperationState(r15)
            androidx.fragment.app.SpecialEffectsController$Operation$State r15 = androidx.fragment.app.SpecialEffectsController.Operation.State.VISIBLE
            if (r14 == r15) goto L95
            androidx.fragment.app.SpecialEffectsController$Operation$State r15 = r10.getFinalState()
            androidx.fragment.app.SpecialEffectsController$Operation$State r11 = androidx.fragment.app.SpecialEffectsController.Operation.State.VISIBLE
            if (r15 != r11) goto L95
            r11 = 1
            goto L96
        L95:
            r11 = r12
        L96:
            if (r11 == 0) goto L6a
            r10 = r8
            goto L9c
        L9b:
            r10 = 0
        L9c:
            r4 = r10
            androidx.fragment.app.SpecialEffectsController$Operation r4 = (androidx.fragment.app.SpecialEffectsController.Operation) r4
            boolean r6 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r16)
            if (r6 == 0) goto Lc5
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "Executing operations from "
            java.lang.StringBuilder r6 = r6.append(r7)
            java.lang.StringBuilder r6 = r6.append(r3)
            java.lang.String r7 = " to "
            java.lang.StringBuilder r6 = r6.append(r7)
            java.lang.StringBuilder r6 = r6.append(r4)
            java.lang.String r6 = r6.toString()
            android.util.Log.v(r5, r6)
        Lc5:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.List r5 = (java.util.List) r5
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.List r6 = (java.util.List) r6
            r17.syncAnimations(r18)
            java.util.Iterator r7 = r1.iterator()
        Lda:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L109
            java.lang.Object r8 = r7.next()
            androidx.fragment.app.SpecialEffectsController$Operation r8 = (androidx.fragment.app.SpecialEffectsController.Operation) r8
            androidx.fragment.app.DefaultSpecialEffectsController$AnimationInfo r9 = new androidx.fragment.app.DefaultSpecialEffectsController$AnimationInfo
            r9.<init>(r8, r2)
            r5.add(r9)
            androidx.fragment.app.DefaultSpecialEffectsController$TransitionInfo r9 = new androidx.fragment.app.DefaultSpecialEffectsController$TransitionInfo
            if (r2 == 0) goto Lf5
            if (r8 != r3) goto Lf9
            goto Lf7
        Lf5:
            if (r8 != r4) goto Lf9
        Lf7:
            r10 = 1
            goto Lfa
        Lf9:
            r10 = r12
        Lfa:
            r9.<init>(r8, r2, r10)
            r6.add(r9)
            androidx.fragment.app.DefaultSpecialEffectsController$$ExternalSyntheticLambda0 r9 = new androidx.fragment.app.DefaultSpecialEffectsController$$ExternalSyntheticLambda0
            r9.<init>(r0, r8)
            r8.addCompletionListener(r9)
            goto Lda
        L109:
            r0.createTransitionEffect(r6, r2, r3, r4)
            r0.collectAnimEffects(r5)
            return
    }
}
