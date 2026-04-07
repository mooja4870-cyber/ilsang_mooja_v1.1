package androidx.fragment.app;

/* JADX INFO: loaded from: classes.dex */
class FragmentAnim {

    static class AnimationOrAnimator {
        public final android.view.animation.Animation animation;
        public final android.animation.AnimatorSet animator;

        AnimationOrAnimator(android.animation.Animator r3) {
                r2 = this;
                r2.<init>()
                r0 = 0
                r2.animation = r0
                android.animation.AnimatorSet r0 = new android.animation.AnimatorSet
                r0.<init>()
                r2.animator = r0
                android.animation.AnimatorSet r0 = r2.animator
                r0.play(r3)
                if (r3 == 0) goto L15
                return
            L15:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "Animator cannot be null"
                r0.<init>(r1)
                throw r0
        }

        AnimationOrAnimator(android.view.animation.Animation r3) {
                r2 = this;
                r2.<init>()
                r2.animation = r3
                r0 = 0
                r2.animator = r0
                if (r3 == 0) goto Lb
                return
            Lb:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "Animation cannot be null"
                r0.<init>(r1)
                throw r0
        }
    }

    static class EndViewTransitionAnimation extends android.view.animation.AnimationSet implements java.lang.Runnable {
        private boolean mAnimating;
        private final android.view.View mChild;
        private boolean mEnded;
        private final android.view.ViewGroup mParent;
        private boolean mTransitionEnded;

        EndViewTransitionAnimation(android.view.animation.Animation r2, android.view.ViewGroup r3, android.view.View r4) {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                r0 = 1
                r1.mAnimating = r0
                r1.mParent = r3
                r1.mChild = r4
                r1.addAnimation(r2)
                android.view.ViewGroup r0 = r1.mParent
                r0.post(r1)
                return
        }

        @Override // android.view.animation.AnimationSet, android.view.animation.Animation
        public boolean getTransformation(long r4, android.view.animation.Transformation r6) {
                r3 = this;
                r0 = 1
                r3.mAnimating = r0
                boolean r1 = r3.mEnded
                if (r1 == 0) goto Lb
                boolean r1 = r3.mTransitionEnded
                r0 = r0 ^ r1
                return r0
            Lb:
                boolean r1 = super.getTransformation(r4, r6)
                if (r1 != 0) goto L18
                r3.mEnded = r0
                android.view.ViewGroup r2 = r3.mParent
                androidx.core.view.OneShotPreDrawListener.add(r2, r3)
            L18:
                return r0
        }

        @Override // android.view.animation.Animation
        public boolean getTransformation(long r4, android.view.animation.Transformation r6, float r7) {
                r3 = this;
                r0 = 1
                r3.mAnimating = r0
                boolean r1 = r3.mEnded
                if (r1 == 0) goto Lb
                boolean r1 = r3.mTransitionEnded
                r0 = r0 ^ r1
                return r0
            Lb:
                boolean r1 = super.getTransformation(r4, r6, r7)
                if (r1 != 0) goto L18
                r3.mEnded = r0
                android.view.ViewGroup r2 = r3.mParent
                androidx.core.view.OneShotPreDrawListener.add(r2, r3)
            L18:
                return r0
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                boolean r0 = r2.mEnded
                if (r0 != 0) goto L11
                boolean r0 = r2.mAnimating
                if (r0 == 0) goto L11
                r0 = 0
                r2.mAnimating = r0
                android.view.ViewGroup r0 = r2.mParent
                r0.post(r2)
                goto L1b
            L11:
                android.view.ViewGroup r0 = r2.mParent
                android.view.View r1 = r2.mChild
                r0.endViewTransition(r1)
                r0 = 1
                r2.mTransitionEnded = r0
            L1b:
                return
        }
    }

    private FragmentAnim() {
            r0 = this;
            r0.<init>()
            return
    }

    private static int getNextAnim(androidx.fragment.app.Fragment r1, boolean r2, boolean r3) {
            if (r3 == 0) goto Le
            if (r2 == 0) goto L9
            int r0 = r1.getPopEnterAnim()
            return r0
        L9:
            int r0 = r1.getPopExitAnim()
            return r0
        Le:
            if (r2 == 0) goto L15
            int r0 = r1.getEnterAnim()
            return r0
        L15:
            int r0 = r1.getExitAnim()
            return r0
    }

    static androidx.fragment.app.FragmentAnim.AnimationOrAnimator loadAnimation(android.content.Context r9, androidx.fragment.app.Fragment r10, boolean r11, boolean r12) {
            int r0 = r10.getNextTransition()
            int r1 = getNextAnim(r10, r11, r12)
            r2 = 0
            r10.setAnimations(r2, r2, r2, r2)
            android.view.ViewGroup r2 = r10.mContainer
            r3 = 0
            if (r2 == 0) goto L22
            android.view.ViewGroup r2 = r10.mContainer
            int r4 = androidx.fragment.R.id.visible_removing_fragment_view_tag
            java.lang.Object r2 = r2.getTag(r4)
            if (r2 == 0) goto L22
            android.view.ViewGroup r2 = r10.mContainer
            int r4 = androidx.fragment.R.id.visible_removing_fragment_view_tag
            r2.setTag(r4, r3)
        L22:
            android.view.ViewGroup r2 = r10.mContainer
            if (r2 == 0) goto L2f
            android.view.ViewGroup r2 = r10.mContainer
            android.animation.LayoutTransition r2 = r2.getLayoutTransition()
            if (r2 == 0) goto L2f
            return r3
        L2f:
            android.view.animation.Animation r2 = r10.onCreateAnimation(r0, r11, r1)
            if (r2 == 0) goto L3b
            androidx.fragment.app.FragmentAnim$AnimationOrAnimator r3 = new androidx.fragment.app.FragmentAnim$AnimationOrAnimator
            r3.<init>(r2)
            return r3
        L3b:
            android.animation.Animator r4 = r10.onCreateAnimator(r0, r11, r1)
            if (r4 == 0) goto L47
            androidx.fragment.app.FragmentAnim$AnimationOrAnimator r3 = new androidx.fragment.app.FragmentAnim$AnimationOrAnimator
            r3.<init>(r4)
            return r3
        L47:
            if (r1 != 0) goto L4f
            if (r0 == 0) goto L4f
            int r1 = transitToAnimResourceId(r9, r0, r11)
        L4f:
            if (r1 == 0) goto L95
            android.content.res.Resources r5 = r9.getResources()
            java.lang.String r5 = r5.getResourceTypeName(r1)
            java.lang.String r6 = "anim"
            boolean r6 = r6.equals(r5)
            r7 = 0
            if (r6 == 0) goto L75
            android.view.animation.Animation r8 = android.view.animation.AnimationUtils.loadAnimation(r9, r1)     // Catch: java.lang.RuntimeException -> L71 android.content.res.Resources.NotFoundException -> L73
            r2 = r8
            if (r2 == 0) goto L6f
            androidx.fragment.app.FragmentAnim$AnimationOrAnimator r8 = new androidx.fragment.app.FragmentAnim$AnimationOrAnimator     // Catch: java.lang.RuntimeException -> L71 android.content.res.Resources.NotFoundException -> L73
            r8.<init>(r2)     // Catch: java.lang.RuntimeException -> L71 android.content.res.Resources.NotFoundException -> L73
            return r8
        L6f:
            r7 = 1
            goto L75
        L71:
            r8 = move-exception
            goto L75
        L73:
            r3 = move-exception
            throw r3
        L75:
            if (r7 != 0) goto L95
            android.animation.Animator r8 = android.animation.AnimatorInflater.loadAnimator(r9, r1)     // Catch: java.lang.RuntimeException -> L85
            r4 = r8
            if (r4 == 0) goto L84
            androidx.fragment.app.FragmentAnim$AnimationOrAnimator r8 = new androidx.fragment.app.FragmentAnim$AnimationOrAnimator     // Catch: java.lang.RuntimeException -> L85
            r8.<init>(r4)     // Catch: java.lang.RuntimeException -> L85
            return r8
        L84:
            goto L95
        L85:
            r8 = move-exception
            if (r6 != 0) goto L94
            android.view.animation.Animation r2 = android.view.animation.AnimationUtils.loadAnimation(r9, r1)
            if (r2 == 0) goto L95
            androidx.fragment.app.FragmentAnim$AnimationOrAnimator r3 = new androidx.fragment.app.FragmentAnim$AnimationOrAnimator
            r3.<init>(r2)
            return r3
        L94:
            throw r8
        L95:
            return r3
    }

    private static int toActivityTransitResId(android.content.Context r3, int r4) {
            r0 = 16973825(0x1030001, float:2.4060903E-38)
            int[] r1 = new int[]{r4}
            android.content.res.TypedArray r0 = r3.obtainStyledAttributes(r0, r1)
            r1 = 0
            r2 = -1
            int r1 = r0.getResourceId(r1, r2)
            r0.recycle()
            return r1
    }

    private static int transitToAnimResourceId(android.content.Context r2, int r3, boolean r4) {
            r0 = -1
            switch(r3) {
                case 4097: goto L3d;
                case 4099: goto L34;
                case 4100: goto L21;
                case 8194: goto L18;
                case 8197: goto L5;
                default: goto L4;
            }
        L4:
            goto L46
        L5:
            if (r4 == 0) goto Lf
            r1 = 16842938(0x10100ba, float:2.369408E-38)
            int r1 = toActivityTransitResId(r2, r1)
            goto L16
        Lf:
            r1 = 16842939(0x10100bb, float:2.3694082E-38)
            int r1 = toActivityTransitResId(r2, r1)
        L16:
            r0 = r1
            goto L46
        L18:
            if (r4 == 0) goto L1d
            int r1 = androidx.fragment.R.animator.fragment_close_enter
            goto L1f
        L1d:
            int r1 = androidx.fragment.R.animator.fragment_close_exit
        L1f:
            r0 = r1
            goto L46
        L21:
            if (r4 == 0) goto L2b
            r1 = 16842936(0x10100b8, float:2.3694074E-38)
            int r1 = toActivityTransitResId(r2, r1)
            goto L32
        L2b:
            r1 = 16842937(0x10100b9, float:2.3694076E-38)
            int r1 = toActivityTransitResId(r2, r1)
        L32:
            r0 = r1
            goto L46
        L34:
            if (r4 == 0) goto L39
            int r1 = androidx.fragment.R.animator.fragment_fade_enter
            goto L3b
        L39:
            int r1 = androidx.fragment.R.animator.fragment_fade_exit
        L3b:
            r0 = r1
            goto L46
        L3d:
            if (r4 == 0) goto L42
            int r1 = androidx.fragment.R.animator.fragment_open_enter
            goto L44
        L42:
            int r1 = androidx.fragment.R.animator.fragment_open_exit
        L44:
            r0 = r1
        L46:
            return r0
    }
}
