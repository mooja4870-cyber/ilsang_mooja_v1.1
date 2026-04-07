package androidx.core.view;

/* JADX INFO: loaded from: classes.dex */
public final class WindowInsetsAnimationCompat {
    private static final boolean DEBUG = false;
    private static final java.lang.String TAG = "WindowInsetsAnimCompat";
    private androidx.core.view.WindowInsetsAnimationCompat.Impl mImpl;

    public static final class BoundsCompat {
        private final androidx.core.graphics.Insets mLowerBound;
        private final androidx.core.graphics.Insets mUpperBound;

        private BoundsCompat(android.view.WindowInsetsAnimation.Bounds r2) {
                r1 = this;
                r1.<init>()
                androidx.core.graphics.Insets r0 = androidx.core.view.WindowInsetsAnimationCompat.Impl30.getLowerBounds(r2)
                r1.mLowerBound = r0
                androidx.core.graphics.Insets r0 = androidx.core.view.WindowInsetsAnimationCompat.Impl30.getHigherBounds(r2)
                r1.mUpperBound = r0
                return
        }

        public BoundsCompat(androidx.core.graphics.Insets r1, androidx.core.graphics.Insets r2) {
                r0 = this;
                r0.<init>()
                r0.mLowerBound = r1
                r0.mUpperBound = r2
                return
        }

        public static androidx.core.view.WindowInsetsAnimationCompat.BoundsCompat toBoundsCompat(android.view.WindowInsetsAnimation.Bounds r1) {
                androidx.core.view.WindowInsetsAnimationCompat$BoundsCompat r0 = new androidx.core.view.WindowInsetsAnimationCompat$BoundsCompat
                r0.<init>(r1)
                return r0
        }

        public androidx.core.graphics.Insets getLowerBound() {
                r1 = this;
                androidx.core.graphics.Insets r0 = r1.mLowerBound
                return r0
        }

        public androidx.core.graphics.Insets getUpperBound() {
                r1 = this;
                androidx.core.graphics.Insets r0 = r1.mUpperBound
                return r0
        }

        public androidx.core.view.WindowInsetsAnimationCompat.BoundsCompat inset(androidx.core.graphics.Insets r8) {
                r7 = this;
                androidx.core.view.WindowInsetsAnimationCompat$BoundsCompat r0 = new androidx.core.view.WindowInsetsAnimationCompat$BoundsCompat
                androidx.core.graphics.Insets r1 = r7.mLowerBound
                int r2 = r8.left
                int r3 = r8.top
                int r4 = r8.right
                int r5 = r8.bottom
                androidx.core.graphics.Insets r1 = androidx.core.view.WindowInsetsCompat.insetInsets(r1, r2, r3, r4, r5)
                androidx.core.graphics.Insets r2 = r7.mUpperBound
                int r3 = r8.left
                int r4 = r8.top
                int r5 = r8.right
                int r6 = r8.bottom
                androidx.core.graphics.Insets r2 = androidx.core.view.WindowInsetsCompat.insetInsets(r2, r3, r4, r5, r6)
                r0.<init>(r1, r2)
                return r0
        }

        public android.view.WindowInsetsAnimation.Bounds toBounds() {
                r1 = this;
                android.view.WindowInsetsAnimation$Bounds r0 = androidx.core.view.WindowInsetsAnimationCompat.Impl30.createPlatformBounds(r1)
                return r0
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Bounds{lower="
                java.lang.StringBuilder r0 = r0.append(r1)
                androidx.core.graphics.Insets r1 = r2.mLowerBound
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = " upper="
                java.lang.StringBuilder r0 = r0.append(r1)
                androidx.core.graphics.Insets r1 = r2.mUpperBound
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = "}"
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    public static abstract class Callback {
        public static final int DISPATCH_MODE_CONTINUE_ON_SUBTREE = 1;
        public static final int DISPATCH_MODE_STOP = 0;
        androidx.core.view.WindowInsetsCompat mDispachedInsets;
        private final int mDispatchMode;

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public @interface DispatchMode {
        }

        public Callback(int r1) {
                r0 = this;
                r0.<init>()
                r0.mDispatchMode = r1
                return
        }

        public final int getDispatchMode() {
                r1 = this;
                int r0 = r1.mDispatchMode
                return r0
        }

        public void onEnd(androidx.core.view.WindowInsetsAnimationCompat r1) {
                r0 = this;
                return
        }

        public void onPrepare(androidx.core.view.WindowInsetsAnimationCompat r1) {
                r0 = this;
                return
        }

        public abstract androidx.core.view.WindowInsetsCompat onProgress(androidx.core.view.WindowInsetsCompat r1, java.util.List<androidx.core.view.WindowInsetsAnimationCompat> r2);

        public androidx.core.view.WindowInsetsAnimationCompat.BoundsCompat onStart(androidx.core.view.WindowInsetsAnimationCompat r1, androidx.core.view.WindowInsetsAnimationCompat.BoundsCompat r2) {
                r0 = this;
                return r2
        }
    }

    private static class Impl {
        private float mAlpha;
        private final long mDurationMillis;
        private float mFraction;
        private final android.view.animation.Interpolator mInterpolator;
        private final int mTypeMask;

        Impl(int r2, android.view.animation.Interpolator r3, long r4) {
                r1 = this;
                r1.<init>()
                r0 = 1065353216(0x3f800000, float:1.0)
                r1.mAlpha = r0
                r1.mTypeMask = r2
                r1.mInterpolator = r3
                r1.mDurationMillis = r4
                return
        }

        public float getAlpha() {
                r1 = this;
                float r0 = r1.mAlpha
                return r0
        }

        public long getDurationMillis() {
                r2 = this;
                long r0 = r2.mDurationMillis
                return r0
        }

        public float getFraction() {
                r1 = this;
                float r0 = r1.mFraction
                return r0
        }

        public float getInterpolatedFraction() {
                r2 = this;
                android.view.animation.Interpolator r0 = r2.mInterpolator
                if (r0 == 0) goto Ld
                android.view.animation.Interpolator r0 = r2.mInterpolator
                float r1 = r2.mFraction
                float r0 = r0.getInterpolation(r1)
                return r0
            Ld:
                float r0 = r2.mFraction
                return r0
        }

        public android.view.animation.Interpolator getInterpolator() {
                r1 = this;
                android.view.animation.Interpolator r0 = r1.mInterpolator
                return r0
        }

        public int getTypeMask() {
                r1 = this;
                int r0 = r1.mTypeMask
                return r0
        }

        public void setAlpha(float r1) {
                r0 = this;
                r0.mAlpha = r1
                return
        }

        public void setFraction(float r1) {
                r0 = this;
                r0.mFraction = r1
                return
        }
    }

    private static class Impl21 extends androidx.core.view.WindowInsetsAnimationCompat.Impl {
        private static final android.view.animation.Interpolator HIDE_IME_INTERPOLATOR = null;
        private static final android.view.animation.Interpolator HIDE_SYSTEM_BAR_INTERPOLATOR = null;
        private static final android.view.animation.Interpolator SHOW_IME_INTERPOLATOR = null;
        private static final android.view.animation.Interpolator SHOW_SYSTEM_BAR_INTERPOLATOR = null;

        private static class Impl21OnApplyWindowInsetsListener implements android.view.View.OnApplyWindowInsetsListener {
            private static final int COMPAT_ANIMATION_DURATION_IME = 160;
            private static final int COMPAT_ANIMATION_DURATION_SYSTEM_BAR = 250;
            final androidx.core.view.WindowInsetsAnimationCompat.Callback mCallback;
            private androidx.core.view.WindowInsetsCompat mLastInsets;




            Impl21OnApplyWindowInsetsListener(android.view.View r3, androidx.core.view.WindowInsetsAnimationCompat.Callback r4) {
                    r2 = this;
                    r2.<init>()
                    r2.mCallback = r4
                    androidx.core.view.WindowInsetsCompat r0 = androidx.core.view.ViewCompat.getRootWindowInsets(r3)
                    if (r0 == 0) goto L15
                    androidx.core.view.WindowInsetsCompat$Builder r1 = new androidx.core.view.WindowInsetsCompat$Builder
                    r1.<init>(r0)
                    androidx.core.view.WindowInsetsCompat r1 = r1.build()
                    goto L16
                L15:
                    r1 = 0
                L16:
                    r2.mLastInsets = r1
                    return
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public android.view.WindowInsets onApplyWindowInsets(android.view.View r18, android.view.WindowInsets r19) {
                    r17 = this;
                    r1 = r17
                    r2 = r18
                    r7 = r19
                    boolean r0 = r2.isLaidOut()
                    if (r0 != 0) goto L17
                    androidx.core.view.WindowInsetsCompat r0 = androidx.core.view.WindowInsetsCompat.toWindowInsetsCompat(r7, r2)
                    r1.mLastInsets = r0
                    android.view.WindowInsets r0 = androidx.core.view.WindowInsetsAnimationCompat.Impl21.forwardToViewIfNeeded(r18, r19)
                    return r0
                L17:
                    androidx.core.view.WindowInsetsCompat r3 = androidx.core.view.WindowInsetsCompat.toWindowInsetsCompat(r7, r2)
                    androidx.core.view.WindowInsetsCompat r0 = r1.mLastInsets
                    if (r0 != 0) goto L25
                    androidx.core.view.WindowInsetsCompat r0 = androidx.core.view.ViewCompat.getRootWindowInsets(r2)
                    r1.mLastInsets = r0
                L25:
                    androidx.core.view.WindowInsetsCompat r0 = r1.mLastInsets
                    if (r0 != 0) goto L30
                    r1.mLastInsets = r3
                    android.view.WindowInsets r0 = androidx.core.view.WindowInsetsAnimationCompat.Impl21.forwardToViewIfNeeded(r18, r19)
                    return r0
                L30:
                    androidx.core.view.WindowInsetsAnimationCompat$Callback r8 = androidx.core.view.WindowInsetsAnimationCompat.Impl21.getCallback(r2)
                    if (r8 == 0) goto L43
                    androidx.core.view.WindowInsetsCompat r0 = r8.mDispachedInsets
                    boolean r0 = java.util.Objects.equals(r0, r3)
                    if (r0 == 0) goto L43
                    android.view.WindowInsets r0 = androidx.core.view.WindowInsetsAnimationCompat.Impl21.forwardToViewIfNeeded(r18, r19)
                    return r0
                L43:
                    r0 = 1
                    int[] r9 = new int[r0]
                    int[] r10 = new int[r0]
                    androidx.core.view.WindowInsetsCompat r0 = r1.mLastInsets
                    androidx.core.view.WindowInsetsAnimationCompat.Impl21.buildAnimationMask(r3, r0, r9, r10)
                    r0 = 0
                    r4 = r9[r0]
                    r5 = r10[r0]
                    r5 = r5 | r4
                    if (r5 != 0) goto L5c
                    r1.mLastInsets = r3
                    android.view.WindowInsets r0 = androidx.core.view.WindowInsetsAnimationCompat.Impl21.forwardToViewIfNeeded(r18, r19)
                    return r0
                L5c:
                    androidx.core.view.WindowInsetsCompat r4 = r1.mLastInsets
                    r6 = r9[r0]
                    r11 = r10[r0]
                    android.view.animation.Interpolator r11 = androidx.core.view.WindowInsetsAnimationCompat.Impl21.createInsetInterpolator(r6, r11)
                    androidx.core.view.WindowInsetsAnimationCompat r6 = new androidx.core.view.WindowInsetsAnimationCompat
                    int r12 = androidx.core.view.WindowInsetsCompat.Type.ime()
                    r12 = r12 & r5
                    if (r12 == 0) goto L72
                    r12 = 160(0xa0, double:7.9E-322)
                    goto L74
                L72:
                    r12 = 250(0xfa, double:1.235E-321)
                L74:
                    r6.<init>(r5, r11, r12)
                    r12 = 0
                    r6.setFraction(r12)
                    r12 = 2
                    float[] r12 = new float[r12]
                    r12 = {x00c0: FILL_ARRAY_DATA , data: [0, 1065353216} // fill-array
                    android.animation.ValueAnimator r12 = android.animation.ValueAnimator.ofFloat(r12)
                    long r13 = r6.getDurationMillis()
                    android.animation.ValueAnimator r12 = r12.setDuration(r13)
                    androidx.core.view.WindowInsetsAnimationCompat$BoundsCompat r13 = androidx.core.view.WindowInsetsAnimationCompat.Impl21.computeAnimationBounds(r3, r4, r5)
                    androidx.core.view.WindowInsetsAnimationCompat.Impl21.dispatchOnPrepare(r2, r6, r3, r0)
                    androidx.core.view.WindowInsetsAnimationCompat$Impl21$Impl21OnApplyWindowInsetsListener$1 r0 = new androidx.core.view.WindowInsetsAnimationCompat$Impl21$Impl21OnApplyWindowInsetsListener$1
                    r16 = r6
                    r6 = r2
                    r2 = r16
                    r0.<init>(r1, r2, r3, r4, r5, r6)
                    r14 = r3
                    r3 = r2
                    r2 = r6
                    r6 = r14
                    r15 = r4
                    r14 = r5
                    r12.addUpdateListener(r0)
                    androidx.core.view.WindowInsetsAnimationCompat$Impl21$Impl21OnApplyWindowInsetsListener$2 r0 = new androidx.core.view.WindowInsetsAnimationCompat$Impl21$Impl21OnApplyWindowInsetsListener$2
                    r0.<init>(r1, r3, r2)
                    r12.addListener(r0)
                    androidx.core.view.WindowInsetsAnimationCompat$Impl21$Impl21OnApplyWindowInsetsListener$3 r0 = new androidx.core.view.WindowInsetsAnimationCompat$Impl21$Impl21OnApplyWindowInsetsListener$3
                    r5 = r12
                    r4 = r13
                    r0.<init>(r1, r2, r3, r4, r5)
                    androidx.core.view.OneShotPreDrawListener.add(r2, r0)
                    r1.mLastInsets = r6
                    android.view.WindowInsets r0 = androidx.core.view.WindowInsetsAnimationCompat.Impl21.forwardToViewIfNeeded(r18, r19)
                    return r0
            }
        }

        static {
                android.view.animation.PathInterpolator r0 = new android.view.animation.PathInterpolator
                r1 = 1066192077(0x3f8ccccd, float:1.1)
                r2 = 1065353216(0x3f800000, float:1.0)
                r3 = 0
                r0.<init>(r3, r1, r3, r2)
                androidx.core.view.WindowInsetsAnimationCompat.Impl21.SHOW_IME_INTERPOLATOR = r0
                androidx.interpolator.view.animation.FastOutLinearInInterpolator r0 = new androidx.interpolator.view.animation.FastOutLinearInInterpolator
                r0.<init>()
                androidx.core.view.WindowInsetsAnimationCompat.Impl21.HIDE_IME_INTERPOLATOR = r0
                android.view.animation.DecelerateInterpolator r0 = new android.view.animation.DecelerateInterpolator
                r1 = 1069547520(0x3fc00000, float:1.5)
                r0.<init>(r1)
                androidx.core.view.WindowInsetsAnimationCompat.Impl21.SHOW_SYSTEM_BAR_INTERPOLATOR = r0
                android.view.animation.AccelerateInterpolator r0 = new android.view.animation.AccelerateInterpolator
                r0.<init>(r1)
                androidx.core.view.WindowInsetsAnimationCompat.Impl21.HIDE_SYSTEM_BAR_INTERPOLATOR = r0
                return
        }

        Impl21(int r1, android.view.animation.Interpolator r2, long r3) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                return
        }

        static void buildAnimationMask(androidx.core.view.WindowInsetsCompat r8, androidx.core.view.WindowInsetsCompat r9, int[] r10, int[] r11) {
                r0 = 1
            L1:
                r1 = 512(0x200, float:7.17E-43)
                if (r0 > r1) goto L57
                androidx.core.graphics.Insets r1 = r8.getInsets(r0)
                androidx.core.graphics.Insets r2 = r9.getInsets(r0)
                int r3 = r1.left
                int r4 = r2.left
                r5 = 1
                r6 = 0
                if (r3 > r4) goto L2a
                int r3 = r1.top
                int r4 = r2.top
                if (r3 > r4) goto L2a
                int r3 = r1.right
                int r4 = r2.right
                if (r3 > r4) goto L2a
                int r3 = r1.bottom
                int r4 = r2.bottom
                if (r3 <= r4) goto L28
                goto L2a
            L28:
                r3 = r6
                goto L2b
            L2a:
                r3 = r5
            L2b:
                int r4 = r1.left
                int r7 = r2.left
                if (r4 < r7) goto L45
                int r4 = r1.top
                int r7 = r2.top
                if (r4 < r7) goto L45
                int r4 = r1.right
                int r7 = r2.right
                if (r4 < r7) goto L45
                int r4 = r1.bottom
                int r7 = r2.bottom
                if (r4 >= r7) goto L44
                goto L45
            L44:
                r5 = r6
            L45:
                if (r3 == r5) goto L54
                if (r3 == 0) goto L4f
                r4 = r10[r6]
                r4 = r4 | r0
                r10[r6] = r4
                goto L54
            L4f:
                r4 = r11[r6]
                r4 = r4 | r0
                r11[r6] = r4
            L54:
                int r0 = r0 << 1
                goto L1
            L57:
                return
        }

        static androidx.core.view.WindowInsetsAnimationCompat.BoundsCompat computeAnimationBounds(androidx.core.view.WindowInsetsCompat r8, androidx.core.view.WindowInsetsCompat r9, int r10) {
                androidx.core.graphics.Insets r0 = r8.getInsets(r10)
                androidx.core.graphics.Insets r1 = r9.getInsets(r10)
                int r2 = r0.left
                int r3 = r1.left
                int r2 = java.lang.Math.min(r2, r3)
                int r3 = r0.top
                int r4 = r1.top
                int r3 = java.lang.Math.min(r3, r4)
                int r4 = r0.right
                int r5 = r1.right
                int r4 = java.lang.Math.min(r4, r5)
                int r5 = r0.bottom
                int r6 = r1.bottom
                int r5 = java.lang.Math.min(r5, r6)
                androidx.core.graphics.Insets r2 = androidx.core.graphics.Insets.of(r2, r3, r4, r5)
                int r3 = r0.left
                int r4 = r1.left
                int r3 = java.lang.Math.max(r3, r4)
                int r4 = r0.top
                int r5 = r1.top
                int r4 = java.lang.Math.max(r4, r5)
                int r5 = r0.right
                int r6 = r1.right
                int r5 = java.lang.Math.max(r5, r6)
                int r6 = r0.bottom
                int r7 = r1.bottom
                int r6 = java.lang.Math.max(r6, r7)
                androidx.core.graphics.Insets r3 = androidx.core.graphics.Insets.of(r3, r4, r5, r6)
                androidx.core.view.WindowInsetsAnimationCompat$BoundsCompat r4 = new androidx.core.view.WindowInsetsAnimationCompat$BoundsCompat
                r4.<init>(r2, r3)
                return r4
        }

        static android.view.animation.Interpolator createInsetInterpolator(int r1, int r2) {
                int r0 = androidx.core.view.WindowInsetsCompat.Type.ime()
                r0 = r0 & r1
                if (r0 == 0) goto La
                android.view.animation.Interpolator r0 = androidx.core.view.WindowInsetsAnimationCompat.Impl21.SHOW_IME_INTERPOLATOR
                return r0
            La:
                int r0 = androidx.core.view.WindowInsetsCompat.Type.ime()
                r0 = r0 & r2
                if (r0 == 0) goto L14
                android.view.animation.Interpolator r0 = androidx.core.view.WindowInsetsAnimationCompat.Impl21.HIDE_IME_INTERPOLATOR
                return r0
            L14:
                int r0 = androidx.core.view.WindowInsetsCompat.Type.systemBars()
                r0 = r0 & r1
                if (r0 == 0) goto L1e
                android.view.animation.Interpolator r0 = androidx.core.view.WindowInsetsAnimationCompat.Impl21.SHOW_SYSTEM_BAR_INTERPOLATOR
                return r0
            L1e:
                int r0 = androidx.core.view.WindowInsetsCompat.Type.systemBars()
                r0 = r0 & r2
                if (r0 == 0) goto L28
                android.view.animation.Interpolator r0 = androidx.core.view.WindowInsetsAnimationCompat.Impl21.HIDE_SYSTEM_BAR_INTERPOLATOR
                return r0
            L28:
                r0 = 0
                return r0
        }

        private static android.view.View.OnApplyWindowInsetsListener createProxyListener(android.view.View r1, androidx.core.view.WindowInsetsAnimationCompat.Callback r2) {
                androidx.core.view.WindowInsetsAnimationCompat$Impl21$Impl21OnApplyWindowInsetsListener r0 = new androidx.core.view.WindowInsetsAnimationCompat$Impl21$Impl21OnApplyWindowInsetsListener
                r0.<init>(r1, r2)
                return r0
        }

        static void dispatchOnEnd(android.view.View r4, androidx.core.view.WindowInsetsAnimationCompat r5) {
                androidx.core.view.WindowInsetsAnimationCompat$Callback r0 = getCallback(r4)
                if (r0 == 0) goto L10
                r0.onEnd(r5)
                int r1 = r0.getDispatchMode()
                if (r1 != 0) goto L10
                return
            L10:
                boolean r1 = r4 instanceof android.view.ViewGroup
                if (r1 == 0) goto L28
                r1 = r4
                android.view.ViewGroup r1 = (android.view.ViewGroup) r1
                r2 = 0
            L18:
                int r3 = r1.getChildCount()
                if (r2 >= r3) goto L28
                android.view.View r3 = r1.getChildAt(r2)
                dispatchOnEnd(r3, r5)
                int r2 = r2 + 1
                goto L18
            L28:
                return
        }

        static void dispatchOnPrepare(android.view.View r4, androidx.core.view.WindowInsetsAnimationCompat r5, androidx.core.view.WindowInsetsCompat r6, boolean r7) {
                androidx.core.view.WindowInsetsAnimationCompat$Callback r0 = getCallback(r4)
                if (r0 == 0) goto L17
                r0.mDispachedInsets = r6
                if (r7 != 0) goto L17
                r0.onPrepare(r5)
                int r1 = r0.getDispatchMode()
                if (r1 != 0) goto L15
                r1 = 1
                goto L16
            L15:
                r1 = 0
            L16:
                r7 = r1
            L17:
                boolean r1 = r4 instanceof android.view.ViewGroup
                if (r1 == 0) goto L2f
                r1 = r4
                android.view.ViewGroup r1 = (android.view.ViewGroup) r1
                r2 = 0
            L1f:
                int r3 = r1.getChildCount()
                if (r2 >= r3) goto L2f
                android.view.View r3 = r1.getChildAt(r2)
                dispatchOnPrepare(r3, r5, r6, r7)
                int r2 = r2 + 1
                goto L1f
            L2f:
                return
        }

        static void dispatchOnProgress(android.view.View r5, androidx.core.view.WindowInsetsCompat r6, java.util.List<androidx.core.view.WindowInsetsAnimationCompat> r7) {
                androidx.core.view.WindowInsetsAnimationCompat$Callback r0 = getCallback(r5)
                r1 = r6
                if (r0 == 0) goto L12
                androidx.core.view.WindowInsetsCompat r1 = r0.onProgress(r1, r7)
                int r2 = r0.getDispatchMode()
                if (r2 != 0) goto L12
                return
            L12:
                boolean r2 = r5 instanceof android.view.ViewGroup
                if (r2 == 0) goto L2a
                r2 = r5
                android.view.ViewGroup r2 = (android.view.ViewGroup) r2
                r3 = 0
            L1a:
                int r4 = r2.getChildCount()
                if (r3 >= r4) goto L2a
                android.view.View r4 = r2.getChildAt(r3)
                dispatchOnProgress(r4, r1, r7)
                int r3 = r3 + 1
                goto L1a
            L2a:
                return
        }

        static void dispatchOnStart(android.view.View r4, androidx.core.view.WindowInsetsAnimationCompat r5, androidx.core.view.WindowInsetsAnimationCompat.BoundsCompat r6) {
                androidx.core.view.WindowInsetsAnimationCompat$Callback r0 = getCallback(r4)
                if (r0 == 0) goto L10
                r0.onStart(r5, r6)
                int r1 = r0.getDispatchMode()
                if (r1 != 0) goto L10
                return
            L10:
                boolean r1 = r4 instanceof android.view.ViewGroup
                if (r1 == 0) goto L28
                r1 = r4
                android.view.ViewGroup r1 = (android.view.ViewGroup) r1
                r2 = 0
            L18:
                int r3 = r1.getChildCount()
                if (r2 >= r3) goto L28
                android.view.View r3 = r1.getChildAt(r2)
                dispatchOnStart(r3, r5, r6)
                int r2 = r2 + 1
                goto L18
            L28:
                return
        }

        static android.view.WindowInsets forwardToViewIfNeeded(android.view.View r1, android.view.WindowInsets r2) {
                int r0 = androidx.core.R.id.tag_on_apply_window_listener
                java.lang.Object r0 = r1.getTag(r0)
                if (r0 == 0) goto L9
                return r2
            L9:
                android.view.WindowInsets r0 = r1.onApplyWindowInsets(r2)
                return r0
        }

        static androidx.core.view.WindowInsetsAnimationCompat.Callback getCallback(android.view.View r3) {
                int r0 = androidx.core.R.id.tag_window_insets_animation_callback
                java.lang.Object r0 = r3.getTag(r0)
                r1 = 0
                boolean r2 = r0 instanceof androidx.core.view.WindowInsetsAnimationCompat.Impl21.Impl21OnApplyWindowInsetsListener
                if (r2 == 0) goto L10
                r2 = r0
                androidx.core.view.WindowInsetsAnimationCompat$Impl21$Impl21OnApplyWindowInsetsListener r2 = (androidx.core.view.WindowInsetsAnimationCompat.Impl21.Impl21OnApplyWindowInsetsListener) r2
                androidx.core.view.WindowInsetsAnimationCompat$Callback r1 = r2.mCallback
            L10:
                return r1
        }

        static androidx.core.view.WindowInsetsCompat interpolateInsets(androidx.core.view.WindowInsetsCompat r12, androidx.core.view.WindowInsetsCompat r13, float r14, int r15) {
                androidx.core.view.WindowInsetsCompat$Builder r0 = new androidx.core.view.WindowInsetsCompat$Builder
                r0.<init>(r12)
                r1 = 1
            L6:
                r2 = 512(0x200, float:7.17E-43)
                if (r1 > r2) goto L5b
                r2 = r15 & r1
                if (r2 != 0) goto L16
                androidx.core.graphics.Insets r2 = r12.getInsets(r1)
                r0.setInsets(r1, r2)
                goto L58
            L16:
                androidx.core.graphics.Insets r2 = r12.getInsets(r1)
                androidx.core.graphics.Insets r3 = r13.getInsets(r1)
                int r4 = r2.left
                int r5 = r3.left
                int r4 = r4 - r5
                float r4 = (float) r4
                r5 = 1065353216(0x3f800000, float:1.0)
                float r6 = r5 - r14
                float r4 = r4 * r6
                double r6 = (double) r4
                r8 = 4602678819172646912(0x3fe0000000000000, double:0.5)
                double r6 = r6 + r8
                int r4 = (int) r6
                int r6 = r2.top
                int r7 = r3.top
                int r6 = r6 - r7
                float r6 = (float) r6
                float r7 = r5 - r14
                float r6 = r6 * r7
                double r6 = (double) r6
                double r6 = r6 + r8
                int r6 = (int) r6
                int r7 = r2.right
                int r10 = r3.right
                int r7 = r7 - r10
                float r7 = (float) r7
                float r10 = r5 - r14
                float r7 = r7 * r10
                double r10 = (double) r7
                double r10 = r10 + r8
                int r7 = (int) r10
                int r10 = r2.bottom
                int r11 = r3.bottom
                int r10 = r10 - r11
                float r10 = (float) r10
                float r5 = r5 - r14
                float r10 = r10 * r5
                double r10 = (double) r10
                double r10 = r10 + r8
                int r5 = (int) r10
                androidx.core.graphics.Insets r4 = androidx.core.view.WindowInsetsCompat.insetInsets(r2, r4, r6, r7, r5)
                r0.setInsets(r1, r4)
            L58:
                int r1 = r1 << 1
                goto L6
            L5b:
                androidx.core.view.WindowInsetsCompat r1 = r0.build()
                return r1
        }

        static void setCallback(android.view.View r2, androidx.core.view.WindowInsetsAnimationCompat.Callback r3) {
                if (r3 == 0) goto L7
                android.view.View$OnApplyWindowInsetsListener r0 = createProxyListener(r2, r3)
                goto L8
            L7:
                r0 = 0
            L8:
                int r1 = androidx.core.R.id.tag_window_insets_animation_callback
                r2.setTag(r1, r0)
                int r1 = androidx.core.R.id.tag_compat_insets_dispatch
                java.lang.Object r1 = r2.getTag(r1)
                if (r1 != 0) goto L21
                int r1 = androidx.core.R.id.tag_on_apply_window_listener
                java.lang.Object r1 = r2.getTag(r1)
                if (r1 != 0) goto L21
                r2.setOnApplyWindowInsetsListener(r0)
            L21:
                return
        }
    }

    private static class Impl30 extends androidx.core.view.WindowInsetsAnimationCompat.Impl {
        private final android.view.WindowInsetsAnimation mWrapped;

        private static class ProxyCallback extends android.view.WindowInsetsAnimation.Callback {
            private final java.util.HashMap<android.view.WindowInsetsAnimation, androidx.core.view.WindowInsetsAnimationCompat> mAnimations;
            private final androidx.core.view.WindowInsetsAnimationCompat.Callback mCompat;
            private java.util.List<androidx.core.view.WindowInsetsAnimationCompat> mRORunningAnimations;
            private java.util.ArrayList<androidx.core.view.WindowInsetsAnimationCompat> mTmpRunningAnimations;

            ProxyCallback(androidx.core.view.WindowInsetsAnimationCompat.Callback r2) {
                    r1 = this;
                    int r0 = r2.getDispatchMode()
                    r1.<init>(r0)
                    java.util.HashMap r0 = new java.util.HashMap
                    r0.<init>()
                    r1.mAnimations = r0
                    r1.mCompat = r2
                    return
            }

            private androidx.core.view.WindowInsetsAnimationCompat getWindowInsetsAnimationCompat(android.view.WindowInsetsAnimation r3) {
                    r2 = this;
                    java.util.HashMap<android.view.WindowInsetsAnimation, androidx.core.view.WindowInsetsAnimationCompat> r0 = r2.mAnimations
                    java.lang.Object r0 = r0.get(r3)
                    androidx.core.view.WindowInsetsAnimationCompat r0 = (androidx.core.view.WindowInsetsAnimationCompat) r0
                    if (r0 != 0) goto L13
                    androidx.core.view.WindowInsetsAnimationCompat r0 = androidx.core.view.WindowInsetsAnimationCompat.toWindowInsetsAnimationCompat(r3)
                    java.util.HashMap<android.view.WindowInsetsAnimation, androidx.core.view.WindowInsetsAnimationCompat> r1 = r2.mAnimations
                    r1.put(r3, r0)
                L13:
                    return r0
            }

            @Override // android.view.WindowInsetsAnimation.Callback
            public void onEnd(android.view.WindowInsetsAnimation r3) {
                    r2 = this;
                    androidx.core.view.WindowInsetsAnimationCompat$Callback r0 = r2.mCompat
                    androidx.core.view.WindowInsetsAnimationCompat r1 = r2.getWindowInsetsAnimationCompat(r3)
                    r0.onEnd(r1)
                    java.util.HashMap<android.view.WindowInsetsAnimation, androidx.core.view.WindowInsetsAnimationCompat> r0 = r2.mAnimations
                    r0.remove(r3)
                    return
            }

            @Override // android.view.WindowInsetsAnimation.Callback
            public void onPrepare(android.view.WindowInsetsAnimation r3) {
                    r2 = this;
                    androidx.core.view.WindowInsetsAnimationCompat$Callback r0 = r2.mCompat
                    androidx.core.view.WindowInsetsAnimationCompat r1 = r2.getWindowInsetsAnimationCompat(r3)
                    r0.onPrepare(r1)
                    return
            }

            @Override // android.view.WindowInsetsAnimation.Callback
            public android.view.WindowInsets onProgress(android.view.WindowInsets r5, java.util.List<android.view.WindowInsetsAnimation> r6) {
                    r4 = this;
                    java.util.ArrayList<androidx.core.view.WindowInsetsAnimationCompat> r0 = r4.mTmpRunningAnimations
                    if (r0 != 0) goto L18
                    java.util.ArrayList r0 = new java.util.ArrayList
                    int r1 = r6.size()
                    r0.<init>(r1)
                    r4.mTmpRunningAnimations = r0
                    java.util.ArrayList<androidx.core.view.WindowInsetsAnimationCompat> r0 = r4.mTmpRunningAnimations
                    java.util.List r0 = java.util.Collections.unmodifiableList(r0)
                    r4.mRORunningAnimations = r0
                    goto L1d
                L18:
                    java.util.ArrayList<androidx.core.view.WindowInsetsAnimationCompat> r0 = r4.mTmpRunningAnimations
                    r0.clear()
                L1d:
                    int r0 = r6.size()
                    int r0 = r0 + (-1)
                L23:
                    if (r0 < 0) goto L3f
                    java.lang.Object r1 = r6.get(r0)
                    android.view.WindowInsetsAnimation r1 = (android.view.WindowInsetsAnimation) r1
                    androidx.core.view.WindowInsetsAnimationCompat r2 = r4.getWindowInsetsAnimationCompat(r1)
                    float r3 = r1.getFraction()
                    r2.setFraction(r3)
                    java.util.ArrayList<androidx.core.view.WindowInsetsAnimationCompat> r3 = r4.mTmpRunningAnimations
                    r3.add(r2)
                    int r0 = r0 + (-1)
                    goto L23
                L3f:
                    androidx.core.view.WindowInsetsAnimationCompat$Callback r0 = r4.mCompat
                    androidx.core.view.WindowInsetsCompat r1 = androidx.core.view.WindowInsetsCompat.toWindowInsetsCompat(r5)
                    java.util.List<androidx.core.view.WindowInsetsAnimationCompat> r2 = r4.mRORunningAnimations
                    androidx.core.view.WindowInsetsCompat r0 = r0.onProgress(r1, r2)
                    android.view.WindowInsets r0 = r0.toWindowInsets()
                    return r0
            }

            @Override // android.view.WindowInsetsAnimation.Callback
            public android.view.WindowInsetsAnimation.Bounds onStart(android.view.WindowInsetsAnimation r4, android.view.WindowInsetsAnimation.Bounds r5) {
                    r3 = this;
                    androidx.core.view.WindowInsetsAnimationCompat$Callback r0 = r3.mCompat
                    androidx.core.view.WindowInsetsAnimationCompat r1 = r3.getWindowInsetsAnimationCompat(r4)
                    androidx.core.view.WindowInsetsAnimationCompat$BoundsCompat r2 = androidx.core.view.WindowInsetsAnimationCompat.BoundsCompat.toBoundsCompat(r5)
                    androidx.core.view.WindowInsetsAnimationCompat$BoundsCompat r0 = r0.onStart(r1, r2)
                    android.view.WindowInsetsAnimation$Bounds r0 = r0.toBounds()
                    return r0
            }
        }

        Impl30(int r2, android.view.animation.Interpolator r3, long r4) {
                r1 = this;
                android.view.WindowInsetsAnimation r0 = new android.view.WindowInsetsAnimation
                r0.<init>(r2, r3, r4)
                r1.<init>(r0)
                return
        }

        Impl30(android.view.WindowInsetsAnimation r5) {
                r4 = this;
                r0 = 0
                r1 = 0
                r3 = 0
                r4.<init>(r3, r0, r1)
                r4.mWrapped = r5
                return
        }

        public static android.view.WindowInsetsAnimation.Bounds createPlatformBounds(androidx.core.view.WindowInsetsAnimationCompat.BoundsCompat r3) {
                android.view.WindowInsetsAnimation$Bounds r0 = new android.view.WindowInsetsAnimation$Bounds
                androidx.core.graphics.Insets r1 = r3.getLowerBound()
                android.graphics.Insets r1 = r1.toPlatformInsets()
                androidx.core.graphics.Insets r2 = r3.getUpperBound()
                android.graphics.Insets r2 = r2.toPlatformInsets()
                r0.<init>(r1, r2)
                return r0
        }

        public static androidx.core.graphics.Insets getHigherBounds(android.view.WindowInsetsAnimation.Bounds r1) {
                android.graphics.Insets r0 = r1.getUpperBound()
                androidx.core.graphics.Insets r0 = androidx.core.graphics.Insets.toCompatInsets(r0)
                return r0
        }

        public static androidx.core.graphics.Insets getLowerBounds(android.view.WindowInsetsAnimation.Bounds r1) {
                android.graphics.Insets r0 = r1.getLowerBound()
                androidx.core.graphics.Insets r0 = androidx.core.graphics.Insets.toCompatInsets(r0)
                return r0
        }

        public static void setCallback(android.view.View r1, androidx.core.view.WindowInsetsAnimationCompat.Callback r2) {
                if (r2 == 0) goto L8
                androidx.core.view.WindowInsetsAnimationCompat$Impl30$ProxyCallback r0 = new androidx.core.view.WindowInsetsAnimationCompat$Impl30$ProxyCallback
                r0.<init>(r2)
                goto L9
            L8:
                r0 = 0
            L9:
                r1.setWindowInsetsAnimationCallback(r0)
                return
        }

        @Override // androidx.core.view.WindowInsetsAnimationCompat.Impl
        public float getAlpha() {
                r1 = this;
                android.view.WindowInsetsAnimation r0 = r1.mWrapped
                float r0 = r0.getAlpha()
                return r0
        }

        @Override // androidx.core.view.WindowInsetsAnimationCompat.Impl
        public long getDurationMillis() {
                r2 = this;
                android.view.WindowInsetsAnimation r0 = r2.mWrapped
                long r0 = r0.getDurationMillis()
                return r0
        }

        @Override // androidx.core.view.WindowInsetsAnimationCompat.Impl
        public float getFraction() {
                r1 = this;
                android.view.WindowInsetsAnimation r0 = r1.mWrapped
                float r0 = r0.getFraction()
                return r0
        }

        @Override // androidx.core.view.WindowInsetsAnimationCompat.Impl
        public float getInterpolatedFraction() {
                r1 = this;
                android.view.WindowInsetsAnimation r0 = r1.mWrapped
                float r0 = r0.getInterpolatedFraction()
                return r0
        }

        @Override // androidx.core.view.WindowInsetsAnimationCompat.Impl
        public android.view.animation.Interpolator getInterpolator() {
                r1 = this;
                android.view.WindowInsetsAnimation r0 = r1.mWrapped
                android.view.animation.Interpolator r0 = r0.getInterpolator()
                return r0
        }

        @Override // androidx.core.view.WindowInsetsAnimationCompat.Impl
        public int getTypeMask() {
                r1 = this;
                android.view.WindowInsetsAnimation r0 = r1.mWrapped
                int r0 = r0.getTypeMask()
                return r0
        }

        @Override // androidx.core.view.WindowInsetsAnimationCompat.Impl
        public void setAlpha(float r2) {
                r1 = this;
                android.view.WindowInsetsAnimation r0 = r1.mWrapped
                r0.setAlpha(r2)
                return
        }

        @Override // androidx.core.view.WindowInsetsAnimationCompat.Impl
        public void setFraction(float r2) {
                r1 = this;
                android.view.WindowInsetsAnimation r0 = r1.mWrapped
                r0.setFraction(r2)
                return
        }
    }

    public WindowInsetsAnimationCompat(int r3, android.view.animation.Interpolator r4, long r5) {
            r2 = this;
            r2.<init>()
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto L11
            androidx.core.view.WindowInsetsAnimationCompat$Impl30 r0 = new androidx.core.view.WindowInsetsAnimationCompat$Impl30
            r0.<init>(r3, r4, r5)
            r2.mImpl = r0
            goto L19
        L11:
            androidx.core.view.WindowInsetsAnimationCompat$Impl21 r0 = new androidx.core.view.WindowInsetsAnimationCompat$Impl21
            r0.<init>(r3, r4, r5)
            r2.mImpl = r0
        L19:
            return
    }

    private WindowInsetsAnimationCompat(android.view.WindowInsetsAnimation r5) {
            r4 = this;
            r0 = 0
            r1 = 0
            r3 = 0
            r4.<init>(r3, r0, r1)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto L14
            androidx.core.view.WindowInsetsAnimationCompat$Impl30 r0 = new androidx.core.view.WindowInsetsAnimationCompat$Impl30
            r0.<init>(r5)
            r4.mImpl = r0
        L14:
            return
    }

    static void setCallback(android.view.View r2, androidx.core.view.WindowInsetsAnimationCompat.Callback r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto La
            androidx.core.view.WindowInsetsAnimationCompat.Impl30.setCallback(r2, r3)
            goto Le
        La:
            androidx.core.view.WindowInsetsAnimationCompat.Impl21.setCallback(r2, r3)
        Le:
            return
    }

    static androidx.core.view.WindowInsetsAnimationCompat toWindowInsetsAnimationCompat(android.view.WindowInsetsAnimation r1) {
            androidx.core.view.WindowInsetsAnimationCompat r0 = new androidx.core.view.WindowInsetsAnimationCompat
            r0.<init>(r1)
            return r0
    }

    public float getAlpha() {
            r1 = this;
            androidx.core.view.WindowInsetsAnimationCompat$Impl r0 = r1.mImpl
            float r0 = r0.getAlpha()
            return r0
    }

    public long getDurationMillis() {
            r2 = this;
            androidx.core.view.WindowInsetsAnimationCompat$Impl r0 = r2.mImpl
            long r0 = r0.getDurationMillis()
            return r0
    }

    public float getFraction() {
            r1 = this;
            androidx.core.view.WindowInsetsAnimationCompat$Impl r0 = r1.mImpl
            float r0 = r0.getFraction()
            return r0
    }

    public float getInterpolatedFraction() {
            r1 = this;
            androidx.core.view.WindowInsetsAnimationCompat$Impl r0 = r1.mImpl
            float r0 = r0.getInterpolatedFraction()
            return r0
    }

    public android.view.animation.Interpolator getInterpolator() {
            r1 = this;
            androidx.core.view.WindowInsetsAnimationCompat$Impl r0 = r1.mImpl
            android.view.animation.Interpolator r0 = r0.getInterpolator()
            return r0
    }

    public int getTypeMask() {
            r1 = this;
            androidx.core.view.WindowInsetsAnimationCompat$Impl r0 = r1.mImpl
            int r0 = r0.getTypeMask()
            return r0
    }

    public void setAlpha(float r2) {
            r1 = this;
            androidx.core.view.WindowInsetsAnimationCompat$Impl r0 = r1.mImpl
            r0.setAlpha(r2)
            return
    }

    public void setFraction(float r2) {
            r1 = this;
            androidx.core.view.WindowInsetsAnimationCompat$Impl r0 = r1.mImpl
            r0.setFraction(r2)
            return
    }
}
