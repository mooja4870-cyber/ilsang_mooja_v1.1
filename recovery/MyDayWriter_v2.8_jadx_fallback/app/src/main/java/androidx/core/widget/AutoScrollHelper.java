package androidx.core.widget;

/* JADX INFO: loaded from: classes.dex */
public abstract class AutoScrollHelper implements android.view.View.OnTouchListener {
    private static final int DEFAULT_ACTIVATION_DELAY = 0;
    private static final int DEFAULT_EDGE_TYPE = 1;
    private static final float DEFAULT_MAXIMUM_EDGE = Float.MAX_VALUE;
    private static final int DEFAULT_MAXIMUM_VELOCITY_DIPS = 1575;
    private static final int DEFAULT_MINIMUM_VELOCITY_DIPS = 315;
    private static final int DEFAULT_RAMP_DOWN_DURATION = 500;
    private static final int DEFAULT_RAMP_UP_DURATION = 500;
    private static final float DEFAULT_RELATIVE_EDGE = 0.2f;
    private static final float DEFAULT_RELATIVE_VELOCITY = 1.0f;
    public static final int EDGE_TYPE_INSIDE = 0;
    public static final int EDGE_TYPE_INSIDE_EXTEND = 1;
    public static final int EDGE_TYPE_OUTSIDE = 2;
    private static final int HORIZONTAL = 0;
    public static final float NO_MAX = Float.MAX_VALUE;
    public static final float NO_MIN = 0.0f;
    public static final float RELATIVE_UNSPECIFIED = 0.0f;
    private static final int VERTICAL = 1;
    private int mActivationDelay;
    private boolean mAlreadyDelayed;
    boolean mAnimating;
    private final android.view.animation.Interpolator mEdgeInterpolator;
    private int mEdgeType;
    private boolean mEnabled;
    private boolean mExclusive;
    private float[] mMaximumEdges;
    private float[] mMaximumVelocity;
    private float[] mMinimumVelocity;
    boolean mNeedsCancel;
    boolean mNeedsReset;
    private float[] mRelativeEdges;
    private float[] mRelativeVelocity;
    private java.lang.Runnable mRunnable;
    final androidx.core.widget.AutoScrollHelper.ClampedScroller mScroller;
    final android.view.View mTarget;

    private static class ClampedScroller {
        private long mDeltaTime;
        private int mDeltaX;
        private int mDeltaY;
        private int mEffectiveRampDown;
        private int mRampDownDuration;
        private int mRampUpDuration;
        private long mStartTime;
        private long mStopTime;
        private float mStopValue;
        private float mTargetVelocityX;
        private float mTargetVelocityY;

        ClampedScroller() {
                r2 = this;
                r2.<init>()
                r0 = -9223372036854775808
                r2.mStartTime = r0
                r0 = -1
                r2.mStopTime = r0
                r0 = 0
                r2.mDeltaTime = r0
                r0 = 0
                r2.mDeltaX = r0
                r2.mDeltaY = r0
                return
        }

        private float getValueAt(long r9) {
                r8 = this;
                long r0 = r8.mStartTime
                int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
                r1 = 0
                if (r0 >= 0) goto L8
                return r1
            L8:
                long r2 = r8.mStopTime
                r4 = 0
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                r2 = 1065353216(0x3f800000, float:1.0)
                if (r0 < 0) goto L2f
                long r3 = r8.mStopTime
                int r0 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
                if (r0 >= 0) goto L19
                goto L2f
            L19:
                long r3 = r8.mStopTime
                long r3 = r9 - r3
                float r0 = r8.mStopValue
                float r0 = r2 - r0
                float r5 = r8.mStopValue
                float r6 = (float) r3
                int r7 = r8.mEffectiveRampDown
                float r7 = (float) r7
                float r6 = r6 / r7
                float r1 = androidx.core.widget.AutoScrollHelper.constrain(r6, r1, r2)
                float r5 = r5 * r1
                float r0 = r0 + r5
                return r0
            L2f:
                long r3 = r8.mStartTime
                long r3 = r9 - r3
                float r0 = (float) r3
                int r5 = r8.mRampUpDuration
                float r5 = (float) r5
                float r0 = r0 / r5
                float r0 = androidx.core.widget.AutoScrollHelper.constrain(r0, r1, r2)
                r1 = 1056964608(0x3f000000, float:0.5)
                float r0 = r0 * r1
                return r0
        }

        private float interpolateValue(float r3) {
                r2 = this;
                r0 = -1065353216(0xffffffffc0800000, float:-4.0)
                float r0 = r0 * r3
                float r0 = r0 * r3
                r1 = 1082130432(0x40800000, float:4.0)
                float r1 = r1 * r3
                float r0 = r0 + r1
                return r0
        }

        public void computeScrollDelta() {
                r8 = this;
                long r0 = r8.mDeltaTime
                r2 = 0
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 == 0) goto L2b
                long r0 = android.view.animation.AnimationUtils.currentAnimationTimeMillis()
                float r2 = r8.getValueAt(r0)
                float r3 = r8.interpolateValue(r2)
                long r4 = r8.mDeltaTime
                long r4 = r0 - r4
                r8.mDeltaTime = r0
                float r6 = (float) r4
                float r6 = r6 * r3
                float r7 = r8.mTargetVelocityX
                float r6 = r6 * r7
                int r6 = (int) r6
                r8.mDeltaX = r6
                float r6 = (float) r4
                float r6 = r6 * r3
                float r7 = r8.mTargetVelocityY
                float r6 = r6 * r7
                int r6 = (int) r6
                r8.mDeltaY = r6
                return
            L2b:
                java.lang.RuntimeException r0 = new java.lang.RuntimeException
                java.lang.String r1 = "Cannot compute scroll delta before calling start()"
                r0.<init>(r1)
                throw r0
        }

        public int getDeltaX() {
                r1 = this;
                int r0 = r1.mDeltaX
                return r0
        }

        public int getDeltaY() {
                r1 = this;
                int r0 = r1.mDeltaY
                return r0
        }

        public int getHorizontalDirection() {
                r2 = this;
                float r0 = r2.mTargetVelocityX
                float r1 = r2.mTargetVelocityX
                float r1 = java.lang.Math.abs(r1)
                float r0 = r0 / r1
                int r0 = (int) r0
                return r0
        }

        public int getVerticalDirection() {
                r2 = this;
                float r0 = r2.mTargetVelocityY
                float r1 = r2.mTargetVelocityY
                float r1 = java.lang.Math.abs(r1)
                float r0 = r0 / r1
                int r0 = (int) r0
                return r0
        }

        public boolean isFinished() {
                r6 = this;
                long r0 = r6.mStopTime
                r2 = 0
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 <= 0) goto L18
                long r0 = android.view.animation.AnimationUtils.currentAnimationTimeMillis()
                long r2 = r6.mStopTime
                int r4 = r6.mEffectiveRampDown
                long r4 = (long) r4
                long r2 = r2 + r4
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 <= 0) goto L18
                r0 = 1
                goto L19
            L18:
                r0 = 0
            L19:
                return r0
        }

        public void requestStop() {
                r5 = this;
                long r0 = android.view.animation.AnimationUtils.currentAnimationTimeMillis()
                long r2 = r5.mStartTime
                long r2 = r0 - r2
                int r2 = (int) r2
                r3 = 0
                int r4 = r5.mRampDownDuration
                int r2 = androidx.core.widget.AutoScrollHelper.constrain(r2, r3, r4)
                r5.mEffectiveRampDown = r2
                float r2 = r5.getValueAt(r0)
                r5.mStopValue = r2
                r5.mStopTime = r0
                return
        }

        public void setRampDownDuration(int r1) {
                r0 = this;
                r0.mRampDownDuration = r1
                return
        }

        public void setRampUpDuration(int r1) {
                r0 = this;
                r0.mRampUpDuration = r1
                return
        }

        public void setTargetVelocity(float r1, float r2) {
                r0 = this;
                r0.mTargetVelocityX = r1
                r0.mTargetVelocityY = r2
                return
        }

        public void start() {
                r2 = this;
                long r0 = android.view.animation.AnimationUtils.currentAnimationTimeMillis()
                r2.mStartTime = r0
                r0 = -1
                r2.mStopTime = r0
                long r0 = r2.mStartTime
                r2.mDeltaTime = r0
                r0 = 1056964608(0x3f000000, float:0.5)
                r2.mStopValue = r0
                r0 = 0
                r2.mDeltaX = r0
                r2.mDeltaY = r0
                return
        }
    }

    private class ScrollAnimationRunnable implements java.lang.Runnable {
        final /* synthetic */ androidx.core.widget.AutoScrollHelper this$0;

        ScrollAnimationRunnable(androidx.core.widget.AutoScrollHelper r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r4 = this;
                androidx.core.widget.AutoScrollHelper r0 = r4.this$0
                boolean r0 = r0.mAnimating
                if (r0 != 0) goto L7
                return
            L7:
                androidx.core.widget.AutoScrollHelper r0 = r4.this$0
                boolean r0 = r0.mNeedsReset
                r1 = 0
                if (r0 == 0) goto L19
                androidx.core.widget.AutoScrollHelper r0 = r4.this$0
                r0.mNeedsReset = r1
                androidx.core.widget.AutoScrollHelper r0 = r4.this$0
                androidx.core.widget.AutoScrollHelper$ClampedScroller r0 = r0.mScroller
                r0.start()
            L19:
                androidx.core.widget.AutoScrollHelper r0 = r4.this$0
                androidx.core.widget.AutoScrollHelper$ClampedScroller r0 = r0.mScroller
                boolean r2 = r0.isFinished()
                if (r2 != 0) goto L53
                androidx.core.widget.AutoScrollHelper r2 = r4.this$0
                boolean r2 = r2.shouldAnimate()
                if (r2 != 0) goto L2c
                goto L53
            L2c:
                androidx.core.widget.AutoScrollHelper r2 = r4.this$0
                boolean r2 = r2.mNeedsCancel
                if (r2 == 0) goto L3b
                androidx.core.widget.AutoScrollHelper r2 = r4.this$0
                r2.mNeedsCancel = r1
                androidx.core.widget.AutoScrollHelper r1 = r4.this$0
                r1.cancelTargetTouch()
            L3b:
                r0.computeScrollDelta()
                int r1 = r0.getDeltaX()
                int r2 = r0.getDeltaY()
                androidx.core.widget.AutoScrollHelper r3 = r4.this$0
                r3.scrollTargetBy(r1, r2)
                androidx.core.widget.AutoScrollHelper r3 = r4.this$0
                android.view.View r3 = r3.mTarget
                androidx.core.view.ViewCompat.postOnAnimation(r3, r4)
                return
            L53:
                androidx.core.widget.AutoScrollHelper r2 = r4.this$0
                r2.mAnimating = r1
                return
        }
    }

    static {
            int r0 = android.view.ViewConfiguration.getTapTimeout()
            androidx.core.widget.AutoScrollHelper.DEFAULT_ACTIVATION_DELAY = r0
            return
    }

    public AutoScrollHelper(android.view.View r6) {
            r5 = this;
            r5.<init>()
            androidx.core.widget.AutoScrollHelper$ClampedScroller r0 = new androidx.core.widget.AutoScrollHelper$ClampedScroller
            r0.<init>()
            r5.mScroller = r0
            android.view.animation.AccelerateInterpolator r0 = new android.view.animation.AccelerateInterpolator
            r0.<init>()
            r5.mEdgeInterpolator = r0
            r0 = 2
            float[] r1 = new float[r0]
            r1 = {x007e: FILL_ARRAY_DATA , data: [0, 0} // fill-array
            r5.mRelativeEdges = r1
            float[] r1 = new float[r0]
            r1 = {x0086: FILL_ARRAY_DATA , data: [2139095039, 2139095039} // fill-array
            r5.mMaximumEdges = r1
            float[] r1 = new float[r0]
            r1 = {x008e: FILL_ARRAY_DATA , data: [0, 0} // fill-array
            r5.mRelativeVelocity = r1
            float[] r1 = new float[r0]
            r1 = {x0096: FILL_ARRAY_DATA , data: [0, 0} // fill-array
            r5.mMinimumVelocity = r1
            float[] r0 = new float[r0]
            r0 = {x009e: FILL_ARRAY_DATA , data: [2139095039, 2139095039} // fill-array
            r5.mMaximumVelocity = r0
            r5.mTarget = r6
            android.content.res.Resources r0 = android.content.res.Resources.getSystem()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            r1 = 1153753088(0x44c4e000, float:1575.0)
            float r2 = r0.density
            float r2 = r2 * r1
            r1 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 + r1
            int r2 = (int) r2
            r3 = 1134395392(0x439d8000, float:315.0)
            float r4 = r0.density
            float r4 = r4 * r3
            float r4 = r4 + r1
            int r1 = (int) r4
            float r3 = (float) r2
            float r4 = (float) r2
            r5.setMaximumVelocity(r3, r4)
            float r3 = (float) r1
            float r4 = (float) r1
            r5.setMinimumVelocity(r3, r4)
            r3 = 1
            r5.setEdgeType(r3)
            r3 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r5.setMaximumEdges(r3, r3)
            r3 = 1045220557(0x3e4ccccd, float:0.2)
            r5.setRelativeEdges(r3, r3)
            r3 = 1065353216(0x3f800000, float:1.0)
            r5.setRelativeVelocity(r3, r3)
            int r3 = androidx.core.widget.AutoScrollHelper.DEFAULT_ACTIVATION_DELAY
            r5.setActivationDelay(r3)
            r3 = 500(0x1f4, float:7.0E-43)
            r5.setRampUpDuration(r3)
            r5.setRampDownDuration(r3)
            return
    }

    private float computeTargetVelocity(int r9, float r10, float r11, float r12) {
            r8 = this;
            float[] r0 = r8.mRelativeEdges
            r0 = r0[r9]
            float[] r1 = r8.mMaximumEdges
            r1 = r1[r9]
            float r2 = r8.getEdgeValue(r0, r11, r1, r10)
            r3 = 0
            int r4 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r4 != 0) goto L12
            return r3
        L12:
            float[] r4 = r8.mRelativeVelocity
            r4 = r4[r9]
            float[] r5 = r8.mMinimumVelocity
            r5 = r5[r9]
            float[] r6 = r8.mMaximumVelocity
            r6 = r6[r9]
            float r7 = r4 * r12
            int r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r3 <= 0) goto L2b
            float r3 = r2 * r7
            float r3 = constrain(r3, r5, r6)
            return r3
        L2b:
            float r3 = -r2
            float r3 = r3 * r7
            float r3 = constrain(r3, r5, r6)
            float r3 = -r3
            return r3
    }

    static float constrain(float r1, float r2, float r3) {
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L5
            return r3
        L5:
            int r0 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r0 >= 0) goto La
            return r2
        La:
            return r1
    }

    static int constrain(int r0, int r1, int r2) {
            if (r0 <= r2) goto L3
            return r2
        L3:
            if (r0 >= r1) goto L6
            return r1
        L6:
            return r0
    }

    private float constrainEdgeValue(float r5, float r6) {
            r4 = this;
            r0 = 0
            int r1 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r1 != 0) goto L6
            return r0
        L6:
            int r1 = r4.mEdgeType
            switch(r1) {
                case 0: goto L14;
                case 1: goto L14;
                case 2: goto Lc;
                default: goto Lb;
            }
        Lb:
            goto L2c
        Lc:
            int r1 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r1 >= 0) goto L2c
            float r0 = -r6
            float r0 = r5 / r0
            return r0
        L14:
            int r1 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r1 >= 0) goto L2c
            int r1 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r1 < 0) goto L22
            float r0 = r5 / r6
            float r2 = r2 - r0
            return r2
        L22:
            boolean r1 = r4.mAnimating
            if (r1 == 0) goto L2c
            int r1 = r4.mEdgeType
            r3 = 1
            if (r1 != r3) goto L2c
            return r2
        L2c:
            return r0
    }

    private float getEdgeValue(float r8, float r9, float r10, float r11) {
            r7 = this;
            float r0 = r8 * r9
            r1 = 0
            float r0 = constrain(r0, r1, r10)
            float r2 = r7.constrainEdgeValue(r11, r0)
            float r3 = r9 - r11
            float r3 = r7.constrainEdgeValue(r3, r0)
            float r4 = r3 - r2
            int r5 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r5 >= 0) goto L20
            android.view.animation.Interpolator r1 = r7.mEdgeInterpolator
            float r5 = -r4
            float r1 = r1.getInterpolation(r5)
            float r1 = -r1
            goto L2a
        L20:
            int r5 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r5 <= 0) goto L33
            android.view.animation.Interpolator r1 = r7.mEdgeInterpolator
            float r1 = r1.getInterpolation(r4)
        L2a:
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            r6 = 1065353216(0x3f800000, float:1.0)
            float r5 = constrain(r1, r5, r6)
            return r5
        L33:
            return r1
    }

    private void requestStop() {
            r1 = this;
            boolean r0 = r1.mNeedsReset
            if (r0 == 0) goto L8
            r0 = 0
            r1.mAnimating = r0
            goto Ld
        L8:
            androidx.core.widget.AutoScrollHelper$ClampedScroller r0 = r1.mScroller
            r0.requestStop()
        Ld:
            return
    }

    private void startAnimating() {
            r5 = this;
            java.lang.Runnable r0 = r5.mRunnable
            if (r0 != 0) goto Lb
            androidx.core.widget.AutoScrollHelper$ScrollAnimationRunnable r0 = new androidx.core.widget.AutoScrollHelper$ScrollAnimationRunnable
            r0.<init>(r5)
            r5.mRunnable = r0
        Lb:
            r0 = 1
            r5.mAnimating = r0
            r5.mNeedsReset = r0
            boolean r1 = r5.mAlreadyDelayed
            if (r1 != 0) goto L23
            int r1 = r5.mActivationDelay
            if (r1 <= 0) goto L23
            android.view.View r1 = r5.mTarget
            java.lang.Runnable r2 = r5.mRunnable
            int r3 = r5.mActivationDelay
            long r3 = (long) r3
            androidx.core.view.ViewCompat.postOnAnimationDelayed(r1, r2, r3)
            goto L28
        L23:
            java.lang.Runnable r1 = r5.mRunnable
            r1.run()
        L28:
            r5.mAlreadyDelayed = r0
            return
    }

    public abstract boolean canTargetScrollHorizontally(int r1);

    public abstract boolean canTargetScrollVertically(int r1);

    void cancelTargetTouch() {
            r8 = this;
            long r0 = android.os.SystemClock.uptimeMillis()
            r6 = 0
            r7 = 0
            r4 = 3
            r5 = 0
            r2 = r0
            android.view.MotionEvent r2 = android.view.MotionEvent.obtain(r0, r2, r4, r5, r6, r7)
            android.view.View r3 = r8.mTarget
            r3.onTouchEvent(r2)
            r2.recycle()
            return
    }

    public boolean isEnabled() {
            r1 = this;
            boolean r0 = r1.mEnabled
            return r0
    }

    public boolean isExclusive() {
            r1 = this;
            boolean r0 = r1.mExclusive
            return r0
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View r8, android.view.MotionEvent r9) {
            r7 = this;
            boolean r0 = r7.mEnabled
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            int r0 = r9.getActionMasked()
            r2 = 1
            switch(r0) {
                case 0: goto L13;
                case 1: goto Lf;
                case 2: goto L17;
                case 3: goto Lf;
                default: goto Le;
            }
        Le:
            goto L53
        Lf:
            r7.requestStop()
            goto L53
        L13:
            r7.mNeedsCancel = r2
            r7.mAlreadyDelayed = r1
        L17:
            float r3 = r9.getX()
            int r4 = r8.getWidth()
            float r4 = (float) r4
            android.view.View r5 = r7.mTarget
            int r5 = r5.getWidth()
            float r5 = (float) r5
            float r3 = r7.computeTargetVelocity(r1, r3, r4, r5)
            float r4 = r9.getY()
            int r5 = r8.getHeight()
            float r5 = (float) r5
            android.view.View r6 = r7.mTarget
            int r6 = r6.getHeight()
            float r6 = (float) r6
            float r4 = r7.computeTargetVelocity(r2, r4, r5, r6)
            androidx.core.widget.AutoScrollHelper$ClampedScroller r5 = r7.mScroller
            r5.setTargetVelocity(r3, r4)
            boolean r5 = r7.mAnimating
            if (r5 != 0) goto L53
            boolean r5 = r7.shouldAnimate()
            if (r5 == 0) goto L53
            r7.startAnimating()
        L53:
            boolean r3 = r7.mExclusive
            if (r3 == 0) goto L5c
            boolean r3 = r7.mAnimating
            if (r3 == 0) goto L5c
            r1 = r2
        L5c:
            return r1
    }

    public abstract void scrollTargetBy(int r1, int r2);

    public androidx.core.widget.AutoScrollHelper setActivationDelay(int r1) {
            r0 = this;
            r0.mActivationDelay = r1
            return r0
    }

    public androidx.core.widget.AutoScrollHelper setEdgeType(int r1) {
            r0 = this;
            r0.mEdgeType = r1
            return r0
    }

    public androidx.core.widget.AutoScrollHelper setEnabled(boolean r2) {
            r1 = this;
            boolean r0 = r1.mEnabled
            if (r0 == 0) goto L9
            if (r2 != 0) goto L9
            r1.requestStop()
        L9:
            r1.mEnabled = r2
            return r1
    }

    public androidx.core.widget.AutoScrollHelper setExclusive(boolean r1) {
            r0 = this;
            r0.mExclusive = r1
            return r0
    }

    public androidx.core.widget.AutoScrollHelper setMaximumEdges(float r3, float r4) {
            r2 = this;
            float[] r0 = r2.mMaximumEdges
            r1 = 0
            r0[r1] = r3
            float[] r0 = r2.mMaximumEdges
            r1 = 1
            r0[r1] = r4
            return r2
    }

    public androidx.core.widget.AutoScrollHelper setMaximumVelocity(float r5, float r6) {
            r4 = this;
            float[] r0 = r4.mMaximumVelocity
            r1 = 1148846080(0x447a0000, float:1000.0)
            float r2 = r5 / r1
            r3 = 0
            r0[r3] = r2
            float[] r0 = r4.mMaximumVelocity
            r2 = 1
            float r1 = r6 / r1
            r0[r2] = r1
            return r4
    }

    public androidx.core.widget.AutoScrollHelper setMinimumVelocity(float r5, float r6) {
            r4 = this;
            float[] r0 = r4.mMinimumVelocity
            r1 = 1148846080(0x447a0000, float:1000.0)
            float r2 = r5 / r1
            r3 = 0
            r0[r3] = r2
            float[] r0 = r4.mMinimumVelocity
            r2 = 1
            float r1 = r6 / r1
            r0[r2] = r1
            return r4
    }

    public androidx.core.widget.AutoScrollHelper setRampDownDuration(int r2) {
            r1 = this;
            androidx.core.widget.AutoScrollHelper$ClampedScroller r0 = r1.mScroller
            r0.setRampDownDuration(r2)
            return r1
    }

    public androidx.core.widget.AutoScrollHelper setRampUpDuration(int r2) {
            r1 = this;
            androidx.core.widget.AutoScrollHelper$ClampedScroller r0 = r1.mScroller
            r0.setRampUpDuration(r2)
            return r1
    }

    public androidx.core.widget.AutoScrollHelper setRelativeEdges(float r3, float r4) {
            r2 = this;
            float[] r0 = r2.mRelativeEdges
            r1 = 0
            r0[r1] = r3
            float[] r0 = r2.mRelativeEdges
            r1 = 1
            r0[r1] = r4
            return r2
    }

    public androidx.core.widget.AutoScrollHelper setRelativeVelocity(float r5, float r6) {
            r4 = this;
            float[] r0 = r4.mRelativeVelocity
            r1 = 1148846080(0x447a0000, float:1000.0)
            float r2 = r5 / r1
            r3 = 0
            r0[r3] = r2
            float[] r0 = r4.mRelativeVelocity
            r2 = 1
            float r1 = r6 / r1
            r0[r2] = r1
            return r4
    }

    boolean shouldAnimate() {
            r4 = this;
            androidx.core.widget.AutoScrollHelper$ClampedScroller r0 = r4.mScroller
            int r1 = r0.getVerticalDirection()
            int r2 = r0.getHorizontalDirection()
            if (r1 == 0) goto L12
            boolean r3 = r4.canTargetScrollVertically(r1)
            if (r3 != 0) goto L1a
        L12:
            if (r2 == 0) goto L1c
            boolean r3 = r4.canTargetScrollHorizontally(r2)
            if (r3 == 0) goto L1c
        L1a:
            r3 = 1
            goto L1d
        L1c:
            r3 = 0
        L1d:
            return r3
    }
}
