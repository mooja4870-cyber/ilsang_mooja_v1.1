package androidx.vectordrawable.graphics.drawable;

/* JADX INFO: loaded from: classes.dex */
public class AnimatedVectorDrawableCompat extends androidx.vectordrawable.graphics.drawable.VectorDrawableCommon implements androidx.vectordrawable.graphics.drawable.Animatable2Compat {
    private static final java.lang.String ANIMATED_VECTOR = "animated-vector";
    private static final boolean DBG_ANIMATION_VECTOR_DRAWABLE = false;
    private static final java.lang.String LOGTAG = "AnimatedVDCompat";
    private static final java.lang.String TARGET = "target";
    private androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat.AnimatedVectorDrawableCompatState mAnimatedVectorState;
    java.util.ArrayList<androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback> mAnimationCallbacks;
    private android.animation.Animator.AnimatorListener mAnimatorListener;
    private android.animation.ArgbEvaluator mArgbEvaluator;
    androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat.AnimatedVectorDrawableDelegateState mCachedConstantStateDelegate;
    final android.graphics.drawable.Drawable.Callback mCallback;
    private android.content.Context mContext;



    private static class AnimatedVectorDrawableCompatState extends android.graphics.drawable.Drawable.ConstantState {
        android.animation.AnimatorSet mAnimatorSet;
        java.util.ArrayList<android.animation.Animator> mAnimators;
        int mChangingConfigurations;
        androidx.collection.ArrayMap<android.animation.Animator, java.lang.String> mTargetNameMap;
        androidx.vectordrawable.graphics.drawable.VectorDrawableCompat mVectorDrawable;

        public AnimatedVectorDrawableCompatState(android.content.Context r8, androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat.AnimatedVectorDrawableCompatState r9, android.graphics.drawable.Drawable.Callback r10, android.content.res.Resources r11) {
                r7 = this;
                r7.<init>()
                if (r9 == 0) goto L8e
                int r0 = r9.mChangingConfigurations
                r7.mChangingConfigurations = r0
                androidx.vectordrawable.graphics.drawable.VectorDrawableCompat r0 = r9.mVectorDrawable
                if (r0 == 0) goto L46
                androidx.vectordrawable.graphics.drawable.VectorDrawableCompat r0 = r9.mVectorDrawable
                android.graphics.drawable.Drawable$ConstantState r0 = r0.getConstantState()
                if (r11 == 0) goto L1e
                android.graphics.drawable.Drawable r1 = r0.newDrawable(r11)
                androidx.vectordrawable.graphics.drawable.VectorDrawableCompat r1 = (androidx.vectordrawable.graphics.drawable.VectorDrawableCompat) r1
                r7.mVectorDrawable = r1
                goto L26
            L1e:
                android.graphics.drawable.Drawable r1 = r0.newDrawable()
                androidx.vectordrawable.graphics.drawable.VectorDrawableCompat r1 = (androidx.vectordrawable.graphics.drawable.VectorDrawableCompat) r1
                r7.mVectorDrawable = r1
            L26:
                androidx.vectordrawable.graphics.drawable.VectorDrawableCompat r1 = r7.mVectorDrawable
                android.graphics.drawable.Drawable r1 = r1.mutate()
                androidx.vectordrawable.graphics.drawable.VectorDrawableCompat r1 = (androidx.vectordrawable.graphics.drawable.VectorDrawableCompat) r1
                r7.mVectorDrawable = r1
                androidx.vectordrawable.graphics.drawable.VectorDrawableCompat r1 = r7.mVectorDrawable
                r1.setCallback(r10)
                androidx.vectordrawable.graphics.drawable.VectorDrawableCompat r1 = r7.mVectorDrawable
                androidx.vectordrawable.graphics.drawable.VectorDrawableCompat r2 = r9.mVectorDrawable
                android.graphics.Rect r2 = r2.getBounds()
                r1.setBounds(r2)
                androidx.vectordrawable.graphics.drawable.VectorDrawableCompat r1 = r7.mVectorDrawable
                r2 = 0
                r1.setAllowCaching(r2)
            L46:
                java.util.ArrayList<android.animation.Animator> r0 = r9.mAnimators
                if (r0 == 0) goto L8e
                java.util.ArrayList<android.animation.Animator> r0 = r9.mAnimators
                int r0 = r0.size()
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>(r0)
                r7.mAnimators = r1
                androidx.collection.ArrayMap r1 = new androidx.collection.ArrayMap
                r1.<init>(r0)
                r7.mTargetNameMap = r1
                r1 = 0
            L5f:
                if (r1 >= r0) goto L8b
                java.util.ArrayList<android.animation.Animator> r2 = r9.mAnimators
                java.lang.Object r2 = r2.get(r1)
                android.animation.Animator r2 = (android.animation.Animator) r2
                android.animation.Animator r3 = r2.clone()
                androidx.collection.ArrayMap<android.animation.Animator, java.lang.String> r4 = r9.mTargetNameMap
                java.lang.Object r4 = r4.get(r2)
                java.lang.String r4 = (java.lang.String) r4
                androidx.vectordrawable.graphics.drawable.VectorDrawableCompat r5 = r7.mVectorDrawable
                java.lang.Object r5 = r5.getTargetByName(r4)
                r3.setTarget(r5)
                java.util.ArrayList<android.animation.Animator> r6 = r7.mAnimators
                r6.add(r3)
                androidx.collection.ArrayMap<android.animation.Animator, java.lang.String> r6 = r7.mTargetNameMap
                r6.put(r3, r4)
                int r1 = r1 + 1
                goto L5f
            L8b:
                r7.setupAnimatorSet()
            L8e:
                return
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
                r1 = this;
                int r0 = r1.mChangingConfigurations
                return r0
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public android.graphics.drawable.Drawable newDrawable() {
                r2 = this;
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "No constant state support for SDK < 24."
                r0.<init>(r1)
                throw r0
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public android.graphics.drawable.Drawable newDrawable(android.content.res.Resources r3) {
                r2 = this;
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "No constant state support for SDK < 24."
                r0.<init>(r1)
                throw r0
        }

        public void setupAnimatorSet() {
                r2 = this;
                android.animation.AnimatorSet r0 = r2.mAnimatorSet
                if (r0 != 0) goto Lb
                android.animation.AnimatorSet r0 = new android.animation.AnimatorSet
                r0.<init>()
                r2.mAnimatorSet = r0
            Lb:
                android.animation.AnimatorSet r0 = r2.mAnimatorSet
                java.util.ArrayList<android.animation.Animator> r1 = r2.mAnimators
                r0.playTogether(r1)
                return
        }
    }

    private static class AnimatedVectorDrawableDelegateState extends android.graphics.drawable.Drawable.ConstantState {
        private final android.graphics.drawable.Drawable.ConstantState mDelegateState;

        public AnimatedVectorDrawableDelegateState(android.graphics.drawable.Drawable.ConstantState r1) {
                r0 = this;
                r0.<init>()
                r0.mDelegateState = r1
                return
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
                r1 = this;
                android.graphics.drawable.Drawable$ConstantState r0 = r1.mDelegateState
                boolean r0 = r0.canApplyTheme()
                return r0
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
                r1 = this;
                android.graphics.drawable.Drawable$ConstantState r0 = r1.mDelegateState
                int r0 = r0.getChangingConfigurations()
                return r0
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public android.graphics.drawable.Drawable newDrawable() {
                r3 = this;
                androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat r0 = new androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat
                r0.<init>()
                android.graphics.drawable.Drawable$ConstantState r1 = r3.mDelegateState
                android.graphics.drawable.Drawable r1 = r1.newDrawable()
                r0.mDelegateDrawable = r1
                android.graphics.drawable.Drawable r1 = r0.mDelegateDrawable
                android.graphics.drawable.Drawable$Callback r2 = r0.mCallback
                r1.setCallback(r2)
                return r0
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public android.graphics.drawable.Drawable newDrawable(android.content.res.Resources r4) {
                r3 = this;
                androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat r0 = new androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat
                r0.<init>()
                android.graphics.drawable.Drawable$ConstantState r1 = r3.mDelegateState
                android.graphics.drawable.Drawable r1 = r1.newDrawable(r4)
                r0.mDelegateDrawable = r1
                android.graphics.drawable.Drawable r1 = r0.mDelegateDrawable
                android.graphics.drawable.Drawable$Callback r2 = r0.mCallback
                r1.setCallback(r2)
                return r0
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public android.graphics.drawable.Drawable newDrawable(android.content.res.Resources r4, android.content.res.Resources.Theme r5) {
                r3 = this;
                androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat r0 = new androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat
                r0.<init>()
                android.graphics.drawable.Drawable$ConstantState r1 = r3.mDelegateState
                android.graphics.drawable.Drawable r1 = r1.newDrawable(r4, r5)
                r0.mDelegateDrawable = r1
                android.graphics.drawable.Drawable r1 = r0.mDelegateDrawable
                android.graphics.drawable.Drawable$Callback r2 = r0.mCallback
                r1.setCallback(r2)
                return r0
        }
    }

    AnimatedVectorDrawableCompat() {
            r1 = this;
            r0 = 0
            r1.<init>(r0, r0, r0)
            return
    }

    private AnimatedVectorDrawableCompat(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0, r0)
            return
    }

    private AnimatedVectorDrawableCompat(android.content.Context r3, androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat.AnimatedVectorDrawableCompatState r4, android.content.res.Resources r5) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.mArgbEvaluator = r0
            r2.mAnimatorListener = r0
            r2.mAnimationCallbacks = r0
            androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat$1 r0 = new androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat$1
            r0.<init>(r2)
            r2.mCallback = r0
            r2.mContext = r3
            if (r4 == 0) goto L18
            r2.mAnimatedVectorState = r4
            goto L21
        L18:
            androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState r0 = new androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState
            android.graphics.drawable.Drawable$Callback r1 = r2.mCallback
            r0.<init>(r3, r4, r1, r5)
            r2.mAnimatedVectorState = r0
        L21:
            return
    }

    public static void clearAnimationCallbacks(android.graphics.drawable.Drawable r1) {
            boolean r0 = r1 instanceof android.graphics.drawable.Animatable
            if (r0 != 0) goto L5
            return
        L5:
            r0 = r1
            android.graphics.drawable.AnimatedVectorDrawable r0 = (android.graphics.drawable.AnimatedVectorDrawable) r0
            r0.clearAnimationCallbacks()
            return
    }

    public static androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat create(android.content.Context r3, int r4) {
            androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat r0 = new androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat
            r0.<init>(r3)
            android.content.res.Resources r1 = r3.getResources()
            android.content.res.Resources$Theme r2 = r3.getTheme()
            android.graphics.drawable.Drawable r1 = androidx.core.content.res.ResourcesCompat.getDrawable(r1, r4, r2)
            r0.mDelegateDrawable = r1
            android.graphics.drawable.Drawable r1 = r0.mDelegateDrawable
            android.graphics.drawable.Drawable$Callback r2 = r0.mCallback
            r1.setCallback(r2)
            androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat$AnimatedVectorDrawableDelegateState r1 = new androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat$AnimatedVectorDrawableDelegateState
            android.graphics.drawable.Drawable r2 = r0.mDelegateDrawable
            android.graphics.drawable.Drawable$ConstantState r2 = r2.getConstantState()
            r1.<init>(r2)
            r0.mCachedConstantStateDelegate = r1
            return r0
    }

    public static androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat createFromXmlInner(android.content.Context r1, android.content.res.Resources r2, org.xmlpull.v1.XmlPullParser r3, android.util.AttributeSet r4, android.content.res.Resources.Theme r5) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
            androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat r0 = new androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat
            r0.<init>(r1)
            r0.inflate(r2, r3, r4, r5)
            return r0
    }

    public static void registerAnimationCallback(android.graphics.drawable.Drawable r1, androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback r2) {
            if (r1 == 0) goto L12
            if (r2 != 0) goto L5
            goto L12
        L5:
            boolean r0 = r1 instanceof android.graphics.drawable.Animatable
            if (r0 != 0) goto La
            return
        La:
            r0 = r1
            android.graphics.drawable.AnimatedVectorDrawable r0 = (android.graphics.drawable.AnimatedVectorDrawable) r0
            registerPlatformCallback(r0, r2)
            return
        L12:
            return
    }

    private static void registerPlatformCallback(android.graphics.drawable.AnimatedVectorDrawable r1, androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback r2) {
            android.graphics.drawable.Animatable2$AnimationCallback r0 = r2.getPlatformCallback()
            r1.registerAnimationCallback(r0)
            return
    }

    private void removeAnimatorSetListener() {
            r2 = this;
            android.animation.Animator$AnimatorListener r0 = r2.mAnimatorListener
            if (r0 == 0) goto L10
            androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState r0 = r2.mAnimatedVectorState
            android.animation.AnimatorSet r0 = r0.mAnimatorSet
            android.animation.Animator$AnimatorListener r1 = r2.mAnimatorListener
            r0.removeListener(r1)
            r0 = 0
            r2.mAnimatorListener = r0
        L10:
            return
    }

    private void setupAnimatorsForTarget(java.lang.String r4, android.animation.Animator r5) {
            r3 = this;
            androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState r0 = r3.mAnimatedVectorState
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat r0 = r0.mVectorDrawable
            java.lang.Object r0 = r0.getTargetByName(r4)
            r5.setTarget(r0)
            androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState r1 = r3.mAnimatedVectorState
            java.util.ArrayList<android.animation.Animator> r1 = r1.mAnimators
            if (r1 != 0) goto L24
            androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState r1 = r3.mAnimatedVectorState
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.mAnimators = r2
            androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState r1 = r3.mAnimatedVectorState
            androidx.collection.ArrayMap r2 = new androidx.collection.ArrayMap
            r2.<init>()
            r1.mTargetNameMap = r2
        L24:
            androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState r1 = r3.mAnimatedVectorState
            java.util.ArrayList<android.animation.Animator> r1 = r1.mAnimators
            r1.add(r5)
            androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState r1 = r3.mAnimatedVectorState
            androidx.collection.ArrayMap<android.animation.Animator, java.lang.String> r1 = r1.mTargetNameMap
            r1.put(r5, r4)
            return
    }

    private void setupColorAnimator(android.animation.Animator r4) {
            r3 = this;
            boolean r0 = r4 instanceof android.animation.AnimatorSet
            if (r0 == 0) goto L20
            r0 = r4
            android.animation.AnimatorSet r0 = (android.animation.AnimatorSet) r0
            java.util.ArrayList r0 = r0.getChildAnimations()
            if (r0 == 0) goto L20
            r1 = 0
        Le:
            int r2 = r0.size()
            if (r1 >= r2) goto L20
            java.lang.Object r2 = r0.get(r1)
            android.animation.Animator r2 = (android.animation.Animator) r2
            r3.setupColorAnimator(r2)
            int r1 = r1 + 1
            goto Le
        L20:
            boolean r0 = r4 instanceof android.animation.ObjectAnimator
            if (r0 == 0) goto L4b
            r0 = r4
            android.animation.ObjectAnimator r0 = (android.animation.ObjectAnimator) r0
            java.lang.String r1 = r0.getPropertyName()
            java.lang.String r2 = "fillColor"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L3b
            java.lang.String r2 = "strokeColor"
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L4b
        L3b:
            android.animation.ArgbEvaluator r2 = r3.mArgbEvaluator
            if (r2 != 0) goto L46
            android.animation.ArgbEvaluator r2 = new android.animation.ArgbEvaluator
            r2.<init>()
            r3.mArgbEvaluator = r2
        L46:
            android.animation.ArgbEvaluator r2 = r3.mArgbEvaluator
            r0.setEvaluator(r2)
        L4b:
            return
    }

    public static boolean unregisterAnimationCallback(android.graphics.drawable.Drawable r2, androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback r3) {
            r0 = 0
            if (r2 == 0) goto L14
            if (r3 != 0) goto L6
            goto L14
        L6:
            boolean r1 = r2 instanceof android.graphics.drawable.Animatable
            if (r1 != 0) goto Lb
            return r0
        Lb:
            r0 = r2
            android.graphics.drawable.AnimatedVectorDrawable r0 = (android.graphics.drawable.AnimatedVectorDrawable) r0
            boolean r0 = unregisterPlatformCallback(r0, r3)
            return r0
        L14:
            return r0
    }

    private static boolean unregisterPlatformCallback(android.graphics.drawable.AnimatedVectorDrawable r1, androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback r2) {
            android.graphics.drawable.Animatable2$AnimationCallback r0 = r2.getPlatformCallback()
            boolean r0 = r1.unregisterAnimationCallback(r0)
            return r0
    }

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public void applyTheme(android.content.res.Resources.Theme r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            if (r0 == 0) goto La
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            androidx.core.graphics.drawable.DrawableCompat.applyTheme(r0, r2)
            return
        La:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            if (r0 == 0) goto Lb
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            boolean r0 = androidx.core.graphics.drawable.DrawableCompat.canApplyTheme(r0)
            return r0
        Lb:
            r0 = 0
            return r0
    }

    @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public void clearAnimationCallbacks() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            if (r0 == 0) goto Lc
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            android.graphics.drawable.AnimatedVectorDrawable r0 = (android.graphics.drawable.AnimatedVectorDrawable) r0
            r0.clearAnimationCallbacks()
            return
        Lc:
            r1.removeAnimatorSetListener()
            java.util.ArrayList<androidx.vectordrawable.graphics.drawable.Animatable2Compat$AnimationCallback> r0 = r1.mAnimationCallbacks
            if (r0 != 0) goto L14
            return
        L14:
            java.util.ArrayList<androidx.vectordrawable.graphics.drawable.Animatable2Compat$AnimationCallback> r0 = r1.mAnimationCallbacks
            r0.clear()
            return
    }

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void clearColorFilter() {
            r0 = this;
            super.clearColorFilter()
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            if (r0 == 0) goto La
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            r0.draw(r2)
            return
        La:
            androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState r0 = r1.mAnimatedVectorState
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat r0 = r0.mVectorDrawable
            r0.draw(r2)
            androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState r0 = r1.mAnimatedVectorState
            android.animation.AnimatorSet r0 = r0.mAnimatorSet
            boolean r0 = r0.isStarted()
            if (r0 == 0) goto L1e
            r1.invalidateSelf()
        L1e:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            if (r0 == 0) goto Lb
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            int r0 = androidx.core.graphics.drawable.DrawableCompat.getAlpha(r0)
            return r0
        Lb:
            androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState r0 = r1.mAnimatedVectorState
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat r0 = r0.mVectorDrawable
            int r0 = r0.getAlpha()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.mDelegateDrawable
            if (r0 == 0) goto Lb
            android.graphics.drawable.Drawable r0 = r2.mDelegateDrawable
            int r0 = r0.getChangingConfigurations()
            return r0
        Lb:
            int r0 = super.getChangingConfigurations()
            androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState r1 = r2.mAnimatedVectorState
            int r1 = r1.mChangingConfigurations
            r0 = r0 | r1
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public android.graphics.ColorFilter getColorFilter() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            if (r0 == 0) goto Lb
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            android.graphics.ColorFilter r0 = androidx.core.graphics.drawable.DrawableCompat.getColorFilter(r0)
            return r0
        Lb:
            androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState r0 = r1.mAnimatedVectorState
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat r0 = r0.mVectorDrawable
            android.graphics.ColorFilter r0 = r0.getColorFilter()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public android.graphics.drawable.Drawable.ConstantState getConstantState() {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.mDelegateDrawable
            if (r0 == 0) goto L10
            androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat$AnimatedVectorDrawableDelegateState r0 = new androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat$AnimatedVectorDrawableDelegateState
            android.graphics.drawable.Drawable r1 = r2.mDelegateDrawable
            android.graphics.drawable.Drawable$ConstantState r1 = r1.getConstantState()
            r0.<init>(r1)
            return r0
        L10:
            r0 = 0
            return r0
    }

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ android.graphics.drawable.Drawable getCurrent() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = super.getCurrent()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            if (r0 == 0) goto Lb
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            int r0 = r0.getIntrinsicHeight()
            return r0
        Lb:
            androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState r0 = r1.mAnimatedVectorState
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat r0 = r0.mVectorDrawable
            int r0 = r0.getIntrinsicHeight()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            if (r0 == 0) goto Lb
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            int r0 = r0.getIntrinsicWidth()
            return r0
        Lb:
            androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState r0 = r1.mAnimatedVectorState
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat r0 = r0.mVectorDrawable
            int r0 = r0.getIntrinsicWidth()
            return r0
    }

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
            r1 = this;
            int r0 = super.getMinimumHeight()
            return r0
    }

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
            r1 = this;
            int r0 = super.getMinimumWidth()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            if (r0 == 0) goto Lb
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            int r0 = r0.getOpacity()
            return r0
        Lb:
            androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState r0 = r1.mAnimatedVectorState
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat r0 = r0.mVectorDrawable
            int r0 = r0.getOpacity()
            return r0
    }

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(android.graphics.Rect r2) {
            r1 = this;
            boolean r0 = super.getPadding(r2)
            return r0
    }

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int[] getState() {
            r1 = this;
            int[] r0 = super.getState()
            return r0
    }

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ android.graphics.Region getTransparentRegion() {
            r1 = this;
            android.graphics.Region r0 = super.getTransparentRegion()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(android.content.res.Resources r2, org.xmlpull.v1.XmlPullParser r3, android.util.AttributeSet r4) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
            r1 = this;
            r0 = 0
            r1.inflate(r2, r3, r4, r0)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(android.content.res.Resources r10, org.xmlpull.v1.XmlPullParser r11, android.util.AttributeSet r12, android.content.res.Resources.Theme r13) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
            r9 = this;
            android.graphics.drawable.Drawable r0 = r9.mDelegateDrawable
            if (r0 == 0) goto La
            android.graphics.drawable.Drawable r0 = r9.mDelegateDrawable
            androidx.core.graphics.drawable.DrawableCompat.inflate(r0, r10, r11, r12, r13)
            return
        La:
            int r0 = r11.getEventType()
            int r1 = r11.getDepth()
            r2 = 1
            int r1 = r1 + r2
        L14:
            if (r0 == r2) goto L99
            int r3 = r11.getDepth()
            if (r3 >= r1) goto L1f
            r3 = 3
            if (r0 == r3) goto L99
        L1f:
            r3 = 2
            if (r0 != r3) goto L93
            java.lang.String r3 = r11.getName()
            java.lang.String r4 = "animated-vector"
            boolean r4 = r4.equals(r3)
            r5 = 0
            if (r4 == 0) goto L5d
            int[] r4 = androidx.vectordrawable.graphics.drawable.AndroidResources.STYLEABLE_ANIMATED_VECTOR_DRAWABLE
            android.content.res.TypedArray r4 = androidx.core.content.res.TypedArrayUtils.obtainAttributes(r10, r13, r12, r4)
            int r6 = r4.getResourceId(r5, r5)
            if (r6 == 0) goto L59
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat r7 = androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.create(r10, r6, r13)
            r7.setAllowCaching(r5)
            android.graphics.drawable.Drawable$Callback r5 = r9.mCallback
            r7.setCallback(r5)
            androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState r5 = r9.mAnimatedVectorState
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat r5 = r5.mVectorDrawable
            if (r5 == 0) goto L55
            androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState r5 = r9.mAnimatedVectorState
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat r5 = r5.mVectorDrawable
            r8 = 0
            r5.setCallback(r8)
        L55:
            androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState r5 = r9.mAnimatedVectorState
            r5.mVectorDrawable = r7
        L59:
            r4.recycle()
            goto L92
        L5d:
            java.lang.String r4 = "target"
            boolean r4 = r4.equals(r3)
            if (r4 == 0) goto L92
            int[] r4 = androidx.vectordrawable.graphics.drawable.AndroidResources.STYLEABLE_ANIMATED_VECTOR_DRAWABLE_TARGET
            android.content.res.TypedArray r4 = r10.obtainAttributes(r12, r4)
            java.lang.String r6 = r4.getString(r5)
            int r5 = r4.getResourceId(r2, r5)
            if (r5 == 0) goto L8e
            android.content.Context r7 = r9.mContext
            if (r7 == 0) goto L83
            android.content.Context r7 = r9.mContext
            android.animation.Animator r7 = androidx.vectordrawable.graphics.drawable.AnimatorInflaterCompat.loadAnimator(r7, r5)
            r9.setupAnimatorsForTarget(r6, r7)
            goto L8e
        L83:
            r4.recycle()
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r7 = "Context can't be null when inflating animators"
            r2.<init>(r7)
            throw r2
        L8e:
            r4.recycle()
            goto L93
        L92:
        L93:
            int r0 = r11.next()
            goto L14
        L99:
            androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState r2 = r9.mAnimatedVectorState
            r2.setupAnimatorSet()
            return
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            if (r0 == 0) goto Lb
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            boolean r0 = androidx.core.graphics.drawable.DrawableCompat.isAutoMirrored(r0)
            return r0
        Lb:
            androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState r0 = r1.mAnimatedVectorState
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat r0 = r0.mVectorDrawable
            boolean r0 = r0.isAutoMirrored()
            return r0
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            if (r0 == 0) goto Ld
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            android.graphics.drawable.AnimatedVectorDrawable r0 = (android.graphics.drawable.AnimatedVectorDrawable) r0
            boolean r0 = r0.isRunning()
            return r0
        Ld:
            androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState r0 = r1.mAnimatedVectorState
            android.animation.AnimatorSet r0 = r0.mAnimatorSet
            boolean r0 = r0.isRunning()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            if (r0 == 0) goto Lb
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            boolean r0 = r0.isStateful()
            return r0
        Lb:
            androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState r0 = r1.mAnimatedVectorState
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat r0 = r0.mVectorDrawable
            boolean r0 = r0.isStateful()
            return r0
    }

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
            r0 = this;
            super.jumpToCurrentState()
            return
    }

    @Override // android.graphics.drawable.Drawable
    public android.graphics.drawable.Drawable mutate() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            if (r0 == 0) goto L9
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            r0.mutate()
        L9:
            return r1
    }

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    protected void onBoundsChange(android.graphics.Rect r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            if (r0 == 0) goto La
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            r0.setBounds(r2)
            return
        La:
            androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState r0 = r1.mAnimatedVectorState
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat r0 = r0.mVectorDrawable
            r0.setBounds(r2)
            return
    }

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    protected boolean onLevelChange(int r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            if (r0 == 0) goto Lb
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            boolean r0 = r0.setLevel(r2)
            return r0
        Lb:
            androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState r0 = r1.mAnimatedVectorState
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat r0 = r0.mVectorDrawable
            boolean r0 = r0.setLevel(r2)
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            if (r0 == 0) goto Lb
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            boolean r0 = r0.setState(r2)
            return r0
        Lb:
            androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState r0 = r1.mAnimatedVectorState
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat r0 = r0.mVectorDrawable
            boolean r0 = r0.setState(r2)
            return r0
    }

    @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public void registerAnimationCallback(androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback r3) {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.mDelegateDrawable
            if (r0 == 0) goto Lc
            android.graphics.drawable.Drawable r0 = r2.mDelegateDrawable
            android.graphics.drawable.AnimatedVectorDrawable r0 = (android.graphics.drawable.AnimatedVectorDrawable) r0
            registerPlatformCallback(r0, r3)
            return
        Lc:
            if (r3 != 0) goto Lf
            return
        Lf:
            java.util.ArrayList<androidx.vectordrawable.graphics.drawable.Animatable2Compat$AnimationCallback> r0 = r2.mAnimationCallbacks
            if (r0 != 0) goto L1a
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.mAnimationCallbacks = r0
        L1a:
            java.util.ArrayList<androidx.vectordrawable.graphics.drawable.Animatable2Compat$AnimationCallback> r0 = r2.mAnimationCallbacks
            boolean r0 = r0.contains(r3)
            if (r0 == 0) goto L23
            return
        L23:
            java.util.ArrayList<androidx.vectordrawable.graphics.drawable.Animatable2Compat$AnimationCallback> r0 = r2.mAnimationCallbacks
            r0.add(r3)
            android.animation.Animator$AnimatorListener r0 = r2.mAnimatorListener
            if (r0 != 0) goto L33
            androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat$2 r0 = new androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat$2
            r0.<init>(r2)
            r2.mAnimatorListener = r0
        L33:
            androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState r0 = r2.mAnimatedVectorState
            android.animation.AnimatorSet r0 = r0.mAnimatorSet
            android.animation.Animator$AnimatorListener r1 = r2.mAnimatorListener
            r0.addListener(r1)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            if (r0 == 0) goto La
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            r0.setAlpha(r2)
            return
        La:
            androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState r0 = r1.mAnimatedVectorState
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat r0 = r0.mVectorDrawable
            r0.setAlpha(r2)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            if (r0 == 0) goto La
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            androidx.core.graphics.drawable.DrawableCompat.setAutoMirrored(r0, r2)
            return
        La:
            androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState r0 = r1.mAnimatedVectorState
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat r0 = r0.mVectorDrawable
            r0.setAutoMirrored(r2)
            return
    }

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setChangingConfigurations(int r1) {
            r0 = this;
            super.setChangingConfigurations(r1)
            return
    }

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(int r1, android.graphics.PorterDuff.Mode r2) {
            r0 = this;
            super.setColorFilter(r1, r2)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            if (r0 == 0) goto La
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            r0.setColorFilter(r2)
            return
        La:
            androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState r0 = r1.mAnimatedVectorState
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat r0 = r0.mVectorDrawable
            r0.setColorFilter(r2)
            return
    }

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean r1) {
            r0 = this;
            super.setFilterBitmap(r1)
            return
    }

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float r1, float r2) {
            r0 = this;
            super.setHotspot(r1, r2)
            return
    }

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int r1, int r2, int r3, int r4) {
            r0 = this;
            super.setHotspotBounds(r1, r2, r3, r4)
            return
    }

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setState(int[] r2) {
            r1 = this;
            boolean r0 = super.setState(r2)
            return r0
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTint(int r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            if (r0 == 0) goto La
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            androidx.core.graphics.drawable.DrawableCompat.setTint(r0, r2)
            return
        La:
            androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState r0 = r1.mAnimatedVectorState
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat r0 = r0.mVectorDrawable
            r0.setTint(r2)
            return
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTintList(android.content.res.ColorStateList r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            if (r0 == 0) goto La
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            androidx.core.graphics.drawable.DrawableCompat.setTintList(r0, r2)
            return
        La:
            androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState r0 = r1.mAnimatedVectorState
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat r0 = r0.mVectorDrawable
            r0.setTintList(r2)
            return
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTintMode(android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            if (r0 == 0) goto La
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            androidx.core.graphics.drawable.DrawableCompat.setTintMode(r0, r2)
            return
        La:
            androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState r0 = r1.mAnimatedVectorState
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat r0 = r0.mVectorDrawable
            r0.setTintMode(r2)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean r2, boolean r3) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            if (r0 == 0) goto Lb
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            boolean r0 = r0.setVisible(r2, r3)
            return r0
        Lb:
            androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState r0 = r1.mAnimatedVectorState
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat r0 = r0.mVectorDrawable
            r0.setVisible(r2, r3)
            boolean r0 = super.setVisible(r2, r3)
            return r0
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            if (r0 == 0) goto Lc
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            android.graphics.drawable.AnimatedVectorDrawable r0 = (android.graphics.drawable.AnimatedVectorDrawable) r0
            r0.start()
            return
        Lc:
            androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState r0 = r1.mAnimatedVectorState
            android.animation.AnimatorSet r0 = r0.mAnimatorSet
            boolean r0 = r0.isStarted()
            if (r0 == 0) goto L17
            return
        L17:
            androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState r0 = r1.mAnimatedVectorState
            android.animation.AnimatorSet r0 = r0.mAnimatorSet
            r0.start()
            r1.invalidateSelf()
            return
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            if (r0 == 0) goto Lc
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            android.graphics.drawable.AnimatedVectorDrawable r0 = (android.graphics.drawable.AnimatedVectorDrawable) r0
            r0.stop()
            return
        Lc:
            androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState r0 = r1.mAnimatedVectorState
            android.animation.AnimatorSet r0 = r0.mAnimatorSet
            r0.end()
            return
    }

    @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public boolean unregisterAnimationCallback(androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback r3) {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.mDelegateDrawable
            if (r0 == 0) goto Lb
            android.graphics.drawable.Drawable r0 = r2.mDelegateDrawable
            android.graphics.drawable.AnimatedVectorDrawable r0 = (android.graphics.drawable.AnimatedVectorDrawable) r0
            unregisterPlatformCallback(r0, r3)
        Lb:
            java.util.ArrayList<androidx.vectordrawable.graphics.drawable.Animatable2Compat$AnimationCallback> r0 = r2.mAnimationCallbacks
            if (r0 == 0) goto L24
            if (r3 != 0) goto L12
            goto L24
        L12:
            java.util.ArrayList<androidx.vectordrawable.graphics.drawable.Animatable2Compat$AnimationCallback> r0 = r2.mAnimationCallbacks
            boolean r0 = r0.remove(r3)
            java.util.ArrayList<androidx.vectordrawable.graphics.drawable.Animatable2Compat$AnimationCallback> r1 = r2.mAnimationCallbacks
            int r1 = r1.size()
            if (r1 != 0) goto L23
            r2.removeAnimatorSetListener()
        L23:
            return r0
        L24:
            r0 = 0
            return r0
    }
}
