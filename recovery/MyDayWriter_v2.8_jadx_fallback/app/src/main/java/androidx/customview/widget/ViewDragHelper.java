package androidx.customview.widget;

/* JADX INFO: loaded from: classes.dex */
public class ViewDragHelper {
    private static final int BASE_SETTLE_DURATION = 256;
    public static final int DIRECTION_ALL = 3;
    public static final int DIRECTION_HORIZONTAL = 1;
    public static final int DIRECTION_VERTICAL = 2;
    public static final int EDGE_ALL = 15;
    public static final int EDGE_BOTTOM = 8;
    public static final int EDGE_LEFT = 1;
    public static final int EDGE_RIGHT = 2;
    private static final int EDGE_SIZE = 20;
    public static final int EDGE_TOP = 4;
    public static final int INVALID_POINTER = -1;
    private static final int MAX_SETTLE_DURATION = 600;
    public static final int STATE_DRAGGING = 1;
    public static final int STATE_IDLE = 0;
    public static final int STATE_SETTLING = 2;
    private static final java.lang.String TAG = "ViewDragHelper";
    private static final android.view.animation.Interpolator sInterpolator = null;
    private int mActivePointerId;
    private final androidx.customview.widget.ViewDragHelper.Callback mCallback;
    private android.view.View mCapturedView;
    private int mDragState;
    private int[] mEdgeDragsInProgress;
    private int[] mEdgeDragsLocked;
    private int mEdgeSize;
    private int[] mInitialEdgesTouched;
    private float[] mInitialMotionX;
    private float[] mInitialMotionY;
    private float[] mLastMotionX;
    private float[] mLastMotionY;
    private float mMaxVelocity;
    private float mMinVelocity;
    private final android.view.ViewGroup mParentView;
    private int mPointersDown;
    private boolean mReleaseInProgress;
    private android.widget.OverScroller mScroller;
    private final java.lang.Runnable mSetIdleRunnable;
    private int mTouchSlop;
    private int mTrackingEdges;
    private android.view.VelocityTracker mVelocityTracker;



    public static abstract class Callback {
        public Callback() {
                r0 = this;
                r0.<init>()
                return
        }

        public int clampViewPositionHorizontal(android.view.View r2, int r3, int r4) {
                r1 = this;
                r0 = 0
                return r0
        }

        public int clampViewPositionVertical(android.view.View r2, int r3, int r4) {
                r1 = this;
                r0 = 0
                return r0
        }

        public int getOrderedChildIndex(int r1) {
                r0 = this;
                return r1
        }

        public int getViewHorizontalDragRange(android.view.View r2) {
                r1 = this;
                r0 = 0
                return r0
        }

        public int getViewVerticalDragRange(android.view.View r2) {
                r1 = this;
                r0 = 0
                return r0
        }

        public void onEdgeDragStarted(int r1, int r2) {
                r0 = this;
                return
        }

        public boolean onEdgeLock(int r2) {
                r1 = this;
                r0 = 0
                return r0
        }

        public void onEdgeTouched(int r1, int r2) {
                r0 = this;
                return
        }

        public void onViewCaptured(android.view.View r1, int r2) {
                r0 = this;
                return
        }

        public void onViewDragStateChanged(int r1) {
                r0 = this;
                return
        }

        public void onViewPositionChanged(android.view.View r1, int r2, int r3, int r4, int r5) {
                r0 = this;
                return
        }

        public void onViewReleased(android.view.View r1, float r2, float r3) {
                r0 = this;
                return
        }

        public abstract boolean tryCaptureView(android.view.View r1, int r2);
    }

    static {
            androidx.customview.widget.ViewDragHelper$1 r0 = new androidx.customview.widget.ViewDragHelper$1
            r0.<init>()
            androidx.customview.widget.ViewDragHelper.sInterpolator = r0
            return
    }

    private ViewDragHelper(android.content.Context r5, android.view.ViewGroup r6, androidx.customview.widget.ViewDragHelper.Callback r7) {
            r4 = this;
            r4.<init>()
            r0 = -1
            r4.mActivePointerId = r0
            androidx.customview.widget.ViewDragHelper$2 r0 = new androidx.customview.widget.ViewDragHelper$2
            r0.<init>(r4)
            r4.mSetIdleRunnable = r0
            if (r6 == 0) goto L52
            if (r7 == 0) goto L4a
            r4.mParentView = r6
            r4.mCallback = r7
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r5)
            android.content.res.Resources r1 = r5.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r1 = r1.density
            r2 = 1101004800(0x41a00000, float:20.0)
            float r2 = r2 * r1
            r3 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 + r3
            int r2 = (int) r2
            r4.mEdgeSize = r2
            int r2 = r0.getScaledTouchSlop()
            r4.mTouchSlop = r2
            int r2 = r0.getScaledMaximumFlingVelocity()
            float r2 = (float) r2
            r4.mMaxVelocity = r2
            int r2 = r0.getScaledMinimumFlingVelocity()
            float r2 = (float) r2
            r4.mMinVelocity = r2
            android.widget.OverScroller r2 = new android.widget.OverScroller
            android.view.animation.Interpolator r3 = androidx.customview.widget.ViewDragHelper.sInterpolator
            r2.<init>(r5, r3)
            r4.mScroller = r2
            return
        L4a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Callback may not be null"
            r0.<init>(r1)
            throw r0
        L52:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Parent view may not be null"
            r0.<init>(r1)
            throw r0
    }

    private boolean checkNewEdgeDrag(float r6, float r7, int r8, int r9) {
            r5 = this;
            float r0 = java.lang.Math.abs(r6)
            float r1 = java.lang.Math.abs(r7)
            int[] r2 = r5.mInitialEdgesTouched
            r2 = r2[r8]
            r2 = r2 & r9
            r3 = 0
            if (r2 != r9) goto L59
            int r2 = r5.mTrackingEdges
            r2 = r2 & r9
            if (r2 == 0) goto L59
            int[] r2 = r5.mEdgeDragsLocked
            r2 = r2[r8]
            r2 = r2 & r9
            if (r2 == r9) goto L59
            int[] r2 = r5.mEdgeDragsInProgress
            r2 = r2[r8]
            r2 = r2 & r9
            if (r2 == r9) goto L59
            int r2 = r5.mTouchSlop
            float r2 = (float) r2
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 > 0) goto L32
            int r2 = r5.mTouchSlop
            float r2 = (float) r2
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 > 0) goto L32
            goto L59
        L32:
            r2 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 * r1
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 >= 0) goto L49
            androidx.customview.widget.ViewDragHelper$Callback r2 = r5.mCallback
            boolean r2 = r2.onEdgeLock(r9)
            if (r2 == 0) goto L49
            int[] r2 = r5.mEdgeDragsLocked
            r4 = r2[r8]
            r4 = r4 | r9
            r2[r8] = r4
            return r3
        L49:
            int[] r2 = r5.mEdgeDragsInProgress
            r2 = r2[r8]
            r2 = r2 & r9
            if (r2 != 0) goto L58
            int r2 = r5.mTouchSlop
            float r2 = (float) r2
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 <= 0) goto L58
            r3 = 1
        L58:
            return r3
        L59:
            return r3
    }

    private boolean checkTouchSlop(android.view.View r8, float r9, float r10) {
            r7 = this;
            r0 = 0
            if (r8 != 0) goto L4
            return r0
        L4:
            androidx.customview.widget.ViewDragHelper$Callback r1 = r7.mCallback
            int r1 = r1.getViewHorizontalDragRange(r8)
            r2 = 1
            if (r1 <= 0) goto Lf
            r1 = r2
            goto L10
        Lf:
            r1 = r0
        L10:
            androidx.customview.widget.ViewDragHelper$Callback r3 = r7.mCallback
            int r3 = r3.getViewVerticalDragRange(r8)
            if (r3 <= 0) goto L1a
            r3 = r2
            goto L1b
        L1a:
            r3 = r0
        L1b:
            if (r1 == 0) goto L30
            if (r3 == 0) goto L30
            float r4 = r9 * r9
            float r5 = r10 * r10
            float r4 = r4 + r5
            int r5 = r7.mTouchSlop
            int r6 = r7.mTouchSlop
            int r5 = r5 * r6
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L2f
            r0 = r2
        L2f:
            return r0
        L30:
            if (r1 == 0) goto L3f
            float r4 = java.lang.Math.abs(r9)
            int r5 = r7.mTouchSlop
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L3e
            r0 = r2
        L3e:
            return r0
        L3f:
            if (r3 == 0) goto L4e
            float r4 = java.lang.Math.abs(r10)
            int r5 = r7.mTouchSlop
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L4d
            r0 = r2
        L4d:
            return r0
        L4e:
            return r0
    }

    private float clampMag(float r4, float r5, float r6) {
            r3 = this;
            float r0 = java.lang.Math.abs(r4)
            int r1 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            r2 = 0
            if (r1 >= 0) goto La
            return r2
        La:
            int r1 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r1 <= 0) goto L16
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 <= 0) goto L14
            r1 = r6
            goto L15
        L14:
            float r1 = -r6
        L15:
            return r1
        L16:
            return r4
    }

    private int clampMag(int r3, int r4, int r5) {
            r2 = this;
            int r0 = java.lang.Math.abs(r3)
            if (r0 >= r4) goto L8
            r1 = 0
            return r1
        L8:
            if (r0 <= r5) goto L10
            if (r3 <= 0) goto Le
            r1 = r5
            goto Lf
        Le:
            int r1 = -r5
        Lf:
            return r1
        L10:
            return r3
    }

    private void clearMotionHistory() {
            r2 = this;
            float[] r0 = r2.mInitialMotionX
            if (r0 != 0) goto L5
            return
        L5:
            float[] r0 = r2.mInitialMotionX
            r1 = 0
            java.util.Arrays.fill(r0, r1)
            float[] r0 = r2.mInitialMotionY
            java.util.Arrays.fill(r0, r1)
            float[] r0 = r2.mLastMotionX
            java.util.Arrays.fill(r0, r1)
            float[] r0 = r2.mLastMotionY
            java.util.Arrays.fill(r0, r1)
            int[] r0 = r2.mInitialEdgesTouched
            r1 = 0
            java.util.Arrays.fill(r0, r1)
            int[] r0 = r2.mEdgeDragsInProgress
            java.util.Arrays.fill(r0, r1)
            int[] r0 = r2.mEdgeDragsLocked
            java.util.Arrays.fill(r0, r1)
            r2.mPointersDown = r1
            return
    }

    private void clearMotionHistory(int r3) {
            r2 = this;
            float[] r0 = r2.mInitialMotionX
            if (r0 == 0) goto L32
            boolean r0 = r2.isPointerDown(r3)
            if (r0 != 0) goto Lb
            goto L32
        Lb:
            float[] r0 = r2.mInitialMotionX
            r1 = 0
            r0[r3] = r1
            float[] r0 = r2.mInitialMotionY
            r0[r3] = r1
            float[] r0 = r2.mLastMotionX
            r0[r3] = r1
            float[] r0 = r2.mLastMotionY
            r0[r3] = r1
            int[] r0 = r2.mInitialEdgesTouched
            r1 = 0
            r0[r3] = r1
            int[] r0 = r2.mEdgeDragsInProgress
            r0[r3] = r1
            int[] r0 = r2.mEdgeDragsLocked
            r0[r3] = r1
            int r0 = r2.mPointersDown
            r1 = 1
            int r1 = r1 << r3
            int r1 = ~r1
            r0 = r0 & r1
            r2.mPointersDown = r0
            return
        L32:
            return
    }

    private int computeAxisDuration(int r8, int r9, int r10) {
            r7 = this;
            if (r8 != 0) goto L4
            r0 = 0
            return r0
        L4:
            android.view.ViewGroup r0 = r7.mParentView
            int r0 = r0.getWidth()
            int r1 = r0 / 2
            int r2 = java.lang.Math.abs(r8)
            float r2 = (float) r2
            float r3 = (float) r0
            float r2 = r2 / r3
            r3 = 1065353216(0x3f800000, float:1.0)
            float r2 = java.lang.Math.min(r3, r2)
            float r4 = (float) r1
            float r5 = (float) r1
            float r6 = r7.distanceInfluenceForSnapDuration(r2)
            float r5 = r5 * r6
            float r4 = r4 + r5
            int r9 = java.lang.Math.abs(r9)
            if (r9 <= 0) goto L38
            float r3 = (float) r9
            float r3 = r4 / r3
            float r3 = java.lang.Math.abs(r3)
            r5 = 1148846080(0x447a0000, float:1000.0)
            float r3 = r3 * r5
            int r3 = java.lang.Math.round(r3)
            int r3 = r3 * 4
            goto L44
        L38:
            int r5 = java.lang.Math.abs(r8)
            float r5 = (float) r5
            float r6 = (float) r10
            float r5 = r5 / r6
            float r3 = r3 + r5
            r6 = 1132462080(0x43800000, float:256.0)
            float r3 = r3 * r6
            int r3 = (int) r3
        L44:
            r5 = 600(0x258, float:8.41E-43)
            int r5 = java.lang.Math.min(r3, r5)
            return r5
    }

    private int computeSettleDuration(android.view.View r17, int r18, int r19, int r20, int r21) {
            r16 = this;
            r0 = r16
            r1 = r17
            float r2 = r0.mMinVelocity
            int r2 = (int) r2
            float r3 = r0.mMaxVelocity
            int r3 = (int) r3
            r4 = r20
            int r2 = r0.clampMag(r4, r2, r3)
            float r3 = r0.mMinVelocity
            int r3 = (int) r3
            float r4 = r0.mMaxVelocity
            int r4 = (int) r4
            r5 = r21
            int r3 = r0.clampMag(r5, r3, r4)
            int r4 = java.lang.Math.abs(r18)
            int r5 = java.lang.Math.abs(r19)
            int r6 = java.lang.Math.abs(r2)
            int r7 = java.lang.Math.abs(r3)
            int r8 = r6 + r7
            int r9 = r4 + r5
            if (r2 == 0) goto L35
            float r10 = (float) r6
            float r11 = (float) r8
            goto L37
        L35:
            float r10 = (float) r4
            float r11 = (float) r9
        L37:
            float r10 = r10 / r11
            if (r3 == 0) goto L3d
            float r11 = (float) r7
            float r12 = (float) r8
            goto L3f
        L3d:
            float r11 = (float) r5
            float r12 = (float) r9
        L3f:
            float r11 = r11 / r12
            androidx.customview.widget.ViewDragHelper$Callback r12 = r0.mCallback
            int r12 = r12.getViewHorizontalDragRange(r1)
            r13 = r18
            int r12 = r0.computeAxisDuration(r13, r2, r12)
            androidx.customview.widget.ViewDragHelper$Callback r14 = r0.mCallback
            int r14 = r14.getViewVerticalDragRange(r1)
            r15 = r19
            int r14 = r0.computeAxisDuration(r15, r3, r14)
            float r0 = (float) r12
            float r0 = r0 * r10
            r20 = r0
            float r0 = (float) r14
            float r0 = r0 * r11
            float r0 = r20 + r0
            int r0 = (int) r0
            return r0
    }

    public static androidx.customview.widget.ViewDragHelper create(android.view.ViewGroup r3, float r4, androidx.customview.widget.ViewDragHelper.Callback r5) {
            androidx.customview.widget.ViewDragHelper r0 = create(r3, r5)
            int r1 = r0.mTouchSlop
            float r1 = (float) r1
            r2 = 1065353216(0x3f800000, float:1.0)
            float r2 = r2 / r4
            float r1 = r1 * r2
            int r1 = (int) r1
            r0.mTouchSlop = r1
            return r0
    }

    public static androidx.customview.widget.ViewDragHelper create(android.view.ViewGroup r2, androidx.customview.widget.ViewDragHelper.Callback r3) {
            androidx.customview.widget.ViewDragHelper r0 = new androidx.customview.widget.ViewDragHelper
            android.content.Context r1 = r2.getContext()
            r0.<init>(r1, r2, r3)
            return r0
    }

    private void dispatchViewReleased(float r4, float r5) {
            r3 = this;
            r0 = 1
            r3.mReleaseInProgress = r0
            androidx.customview.widget.ViewDragHelper$Callback r1 = r3.mCallback
            android.view.View r2 = r3.mCapturedView
            r1.onViewReleased(r2, r4, r5)
            r1 = 0
            r3.mReleaseInProgress = r1
            int r2 = r3.mDragState
            if (r2 != r0) goto L14
            r3.setDragState(r1)
        L14:
            return
    }

    private float distanceInfluenceForSnapDuration(float r3) {
            r2 = this;
            r0 = 1056964608(0x3f000000, float:0.5)
            float r3 = r3 - r0
            r0 = 1055999547(0x3ef1463b, float:0.47123894)
            float r3 = r3 * r0
            double r0 = (double) r3
            double r0 = java.lang.Math.sin(r0)
            float r0 = (float) r0
            return r0
    }

    private void dragTo(int r17, int r18, int r19, int r20) {
            r16 = this;
            r0 = r16
            r1 = r19
            r2 = r20
            r3 = r17
            r4 = r18
            android.view.View r5 = r0.mCapturedView
            int r5 = r5.getLeft()
            android.view.View r6 = r0.mCapturedView
            int r6 = r6.getTop()
            if (r1 == 0) goto L2b
            androidx.customview.widget.ViewDragHelper$Callback r7 = r0.mCallback
            android.view.View r8 = r0.mCapturedView
            r9 = r17
            int r3 = r7.clampViewPositionHorizontal(r8, r9, r1)
            android.view.View r7 = r0.mCapturedView
            int r8 = r3 - r5
            androidx.core.view.ViewCompat.offsetLeftAndRight(r7, r8)
            r12 = r3
            goto L2e
        L2b:
            r9 = r17
            r12 = r3
        L2e:
            if (r2 == 0) goto L43
            androidx.customview.widget.ViewDragHelper$Callback r3 = r0.mCallback
            android.view.View r7 = r0.mCapturedView
            r8 = r18
            int r4 = r3.clampViewPositionVertical(r7, r8, r2)
            android.view.View r3 = r0.mCapturedView
            int r7 = r4 - r6
            androidx.core.view.ViewCompat.offsetTopAndBottom(r3, r7)
            r13 = r4
            goto L46
        L43:
            r8 = r18
            r13 = r4
        L46:
            if (r1 != 0) goto L4a
            if (r2 == 0) goto L55
        L4a:
            int r14 = r12 - r5
            int r15 = r13 - r6
            androidx.customview.widget.ViewDragHelper$Callback r10 = r0.mCallback
            android.view.View r11 = r0.mCapturedView
            r10.onViewPositionChanged(r11, r12, r13, r14, r15)
        L55:
            return
    }

    private void ensureMotionHistorySizeForId(int r11) {
            r10 = this;
            float[] r0 = r10.mInitialMotionX
            if (r0 == 0) goto L9
            float[] r0 = r10.mInitialMotionX
            int r0 = r0.length
            if (r0 > r11) goto L70
        L9:
            int r0 = r11 + 1
            float[] r0 = new float[r0]
            int r1 = r11 + 1
            float[] r1 = new float[r1]
            int r2 = r11 + 1
            float[] r2 = new float[r2]
            int r3 = r11 + 1
            float[] r3 = new float[r3]
            int r4 = r11 + 1
            int[] r4 = new int[r4]
            int r5 = r11 + 1
            int[] r5 = new int[r5]
            int r6 = r11 + 1
            int[] r6 = new int[r6]
            float[] r7 = r10.mInitialMotionX
            if (r7 == 0) goto L62
            float[] r7 = r10.mInitialMotionX
            float[] r8 = r10.mInitialMotionX
            int r8 = r8.length
            r9 = 0
            java.lang.System.arraycopy(r7, r9, r0, r9, r8)
            float[] r7 = r10.mInitialMotionY
            float[] r8 = r10.mInitialMotionY
            int r8 = r8.length
            java.lang.System.arraycopy(r7, r9, r1, r9, r8)
            float[] r7 = r10.mLastMotionX
            float[] r8 = r10.mLastMotionX
            int r8 = r8.length
            java.lang.System.arraycopy(r7, r9, r2, r9, r8)
            float[] r7 = r10.mLastMotionY
            float[] r8 = r10.mLastMotionY
            int r8 = r8.length
            java.lang.System.arraycopy(r7, r9, r3, r9, r8)
            int[] r7 = r10.mInitialEdgesTouched
            int[] r8 = r10.mInitialEdgesTouched
            int r8 = r8.length
            java.lang.System.arraycopy(r7, r9, r4, r9, r8)
            int[] r7 = r10.mEdgeDragsInProgress
            int[] r8 = r10.mEdgeDragsInProgress
            int r8 = r8.length
            java.lang.System.arraycopy(r7, r9, r5, r9, r8)
            int[] r7 = r10.mEdgeDragsLocked
            int[] r8 = r10.mEdgeDragsLocked
            int r8 = r8.length
            java.lang.System.arraycopy(r7, r9, r6, r9, r8)
        L62:
            r10.mInitialMotionX = r0
            r10.mInitialMotionY = r1
            r10.mLastMotionX = r2
            r10.mLastMotionY = r3
            r10.mInitialEdgesTouched = r4
            r10.mEdgeDragsInProgress = r5
            r10.mEdgeDragsLocked = r6
        L70:
            return
    }

    private boolean forceSettleCapturedViewAt(int r11, int r12, int r13, int r14) {
            r10 = this;
            android.view.View r0 = r10.mCapturedView
            int r2 = r0.getLeft()
            android.view.View r0 = r10.mCapturedView
            int r3 = r0.getTop()
            int r4 = r11 - r2
            int r5 = r12 - r3
            if (r4 != 0) goto L1e
            if (r5 != 0) goto L1e
            android.widget.OverScroller r0 = r10.mScroller
            r0.abortAnimation()
            r0 = 0
            r10.setDragState(r0)
            return r0
        L1e:
            r7 = r5
            android.view.View r5 = r10.mCapturedView
            r8 = r13
            r9 = r14
            r6 = r4
            r4 = r10
            int r13 = r4.computeSettleDuration(r5, r6, r7, r8, r9)
            r14 = r4
            r4 = r6
            android.widget.OverScroller r1 = r14.mScroller
            r6 = r13
            r5 = r7
            r1.startScroll(r2, r3, r4, r5, r6)
            r13 = 2
            r10.setDragState(r13)
            r13 = 1
            return r13
    }

    private int getEdgesTouched(int r4, int r5) {
            r3 = this;
            r0 = 0
            android.view.ViewGroup r1 = r3.mParentView
            int r1 = r1.getLeft()
            int r2 = r3.mEdgeSize
            int r1 = r1 + r2
            if (r4 >= r1) goto Le
            r0 = r0 | 1
        Le:
            android.view.ViewGroup r1 = r3.mParentView
            int r1 = r1.getTop()
            int r2 = r3.mEdgeSize
            int r1 = r1 + r2
            if (r5 >= r1) goto L1b
            r0 = r0 | 4
        L1b:
            android.view.ViewGroup r1 = r3.mParentView
            int r1 = r1.getRight()
            int r2 = r3.mEdgeSize
            int r1 = r1 - r2
            if (r4 <= r1) goto L28
            r0 = r0 | 2
        L28:
            android.view.ViewGroup r1 = r3.mParentView
            int r1 = r1.getBottom()
            int r2 = r3.mEdgeSize
            int r1 = r1 - r2
            if (r5 <= r1) goto L35
            r0 = r0 | 8
        L35:
            return r0
    }

    private boolean isValidPointerForActionMove(int r3) {
            r2 = this;
            boolean r0 = r2.isPointerDown(r3)
            if (r0 != 0) goto L32
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Ignoring pointerId="
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.String r1 = " because ACTION_DOWN was not received "
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "for this pointer before ACTION_MOVE. It likely happened because "
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " ViewDragHelper did not receive all the events in the event stream."
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "ViewDragHelper"
            android.util.Log.e(r1, r0)
            r0 = 0
            return r0
        L32:
            r0 = 1
            return r0
    }

    private void releaseViewForPointerUp() {
            r4 = this;
            android.view.VelocityTracker r0 = r4.mVelocityTracker
            r1 = 1000(0x3e8, float:1.401E-42)
            float r2 = r4.mMaxVelocity
            r0.computeCurrentVelocity(r1, r2)
            android.view.VelocityTracker r0 = r4.mVelocityTracker
            int r1 = r4.mActivePointerId
            float r0 = r0.getXVelocity(r1)
            float r1 = r4.mMinVelocity
            float r2 = r4.mMaxVelocity
            float r0 = r4.clampMag(r0, r1, r2)
            android.view.VelocityTracker r1 = r4.mVelocityTracker
            int r2 = r4.mActivePointerId
            float r1 = r1.getYVelocity(r2)
            float r2 = r4.mMinVelocity
            float r3 = r4.mMaxVelocity
            float r1 = r4.clampMag(r1, r2, r3)
            r4.dispatchViewReleased(r0, r1)
            return
    }

    private void reportNewEdgeDrags(float r4, float r5, int r6) {
            r3 = this;
            r0 = 0
            r1 = 1
            boolean r1 = r3.checkNewEdgeDrag(r4, r5, r6, r1)
            if (r1 == 0) goto La
            r0 = r0 | 1
        La:
            r1 = 4
            boolean r1 = r3.checkNewEdgeDrag(r5, r4, r6, r1)
            if (r1 == 0) goto L13
            r0 = r0 | 4
        L13:
            r1 = 2
            boolean r1 = r3.checkNewEdgeDrag(r4, r5, r6, r1)
            if (r1 == 0) goto L1c
            r0 = r0 | 2
        L1c:
            r1 = 8
            boolean r1 = r3.checkNewEdgeDrag(r5, r4, r6, r1)
            if (r1 == 0) goto L26
            r0 = r0 | 8
        L26:
            if (r0 == 0) goto L34
            int[] r1 = r3.mEdgeDragsInProgress
            r2 = r1[r6]
            r2 = r2 | r0
            r1[r6] = r2
            androidx.customview.widget.ViewDragHelper$Callback r1 = r3.mCallback
            r1.onEdgeDragStarted(r0, r6)
        L34:
            return
    }

    private void saveInitialMotion(float r4, float r5, int r6) {
            r3 = this;
            r3.ensureMotionHistorySizeForId(r6)
            float[] r0 = r3.mInitialMotionX
            float[] r1 = r3.mLastMotionX
            r1[r6] = r4
            r0[r6] = r4
            float[] r0 = r3.mInitialMotionY
            float[] r1 = r3.mLastMotionY
            r1[r6] = r5
            r0[r6] = r5
            int[] r0 = r3.mInitialEdgesTouched
            int r1 = (int) r4
            int r2 = (int) r5
            int r1 = r3.getEdgesTouched(r1, r2)
            r0[r6] = r1
            int r0 = r3.mPointersDown
            r1 = 1
            int r1 = r1 << r6
            r0 = r0 | r1
            r3.mPointersDown = r0
            return
    }

    private void saveLastMotion(android.view.MotionEvent r7) {
            r6 = this;
            int r0 = r7.getPointerCount()
            r1 = 0
        L5:
            if (r1 >= r0) goto L25
            int r2 = r7.getPointerId(r1)
            boolean r3 = r6.isValidPointerForActionMove(r2)
            if (r3 != 0) goto L12
            goto L22
        L12:
            float r3 = r7.getX(r1)
            float r4 = r7.getY(r1)
            float[] r5 = r6.mLastMotionX
            r5[r2] = r3
            float[] r5 = r6.mLastMotionY
            r5[r2] = r4
        L22:
            int r1 = r1 + 1
            goto L5
        L25:
            return
    }

    public void abort() {
            r9 = this;
            r9.cancel()
            int r0 = r9.mDragState
            r1 = 2
            if (r0 != r1) goto L30
            android.widget.OverScroller r0 = r9.mScroller
            int r0 = r0.getCurrX()
            android.widget.OverScroller r1 = r9.mScroller
            int r1 = r1.getCurrY()
            android.widget.OverScroller r2 = r9.mScroller
            r2.abortAnimation()
            android.widget.OverScroller r2 = r9.mScroller
            int r5 = r2.getCurrX()
            android.widget.OverScroller r2 = r9.mScroller
            int r6 = r2.getCurrY()
            androidx.customview.widget.ViewDragHelper$Callback r3 = r9.mCallback
            android.view.View r4 = r9.mCapturedView
            int r7 = r5 - r0
            int r8 = r6 - r1
            r3.onViewPositionChanged(r4, r5, r6, r7, r8)
        L30:
            r0 = 0
            r9.setDragState(r0)
            return
    }

    protected boolean canScroll(android.view.View r14, boolean r15, int r16, int r17, int r18, int r19) {
            r13 = this;
            boolean r0 = r14 instanceof android.view.ViewGroup
            r1 = 1
            if (r0 == 0) goto L5c
            r0 = r14
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            int r2 = r14.getScrollX()
            int r3 = r14.getScrollY()
            int r4 = r0.getChildCount()
            int r5 = r4 + (-1)
        L16:
            if (r5 < 0) goto L5c
            android.view.View r7 = r0.getChildAt(r5)
            int r6 = r18 + r2
            int r8 = r7.getLeft()
            if (r6 < r8) goto L59
            int r6 = r18 + r2
            int r8 = r7.getRight()
            if (r6 >= r8) goto L59
            int r6 = r19 + r3
            int r8 = r7.getTop()
            if (r6 < r8) goto L59
            int r6 = r19 + r3
            int r8 = r7.getBottom()
            if (r6 >= r8) goto L59
            int r6 = r18 + r2
            int r8 = r7.getLeft()
            int r11 = r6 - r8
            int r6 = r19 + r3
            int r8 = r7.getTop()
            int r12 = r6 - r8
            r8 = 1
            r6 = r13
            r9 = r16
            r10 = r17
            boolean r8 = r6.canScroll(r7, r8, r9, r10, r11, r12)
            if (r8 == 0) goto L59
            return r1
        L59:
            int r5 = r5 + (-1)
            goto L16
        L5c:
            if (r15 == 0) goto L74
            r9 = r16
            int r0 = -r9
            boolean r0 = r14.canScrollHorizontally(r0)
            if (r0 != 0) goto L71
            r10 = r17
            int r0 = -r10
            boolean r0 = r14.canScrollVertically(r0)
            if (r0 == 0) goto L78
            goto L79
        L71:
            r10 = r17
            goto L79
        L74:
            r9 = r16
            r10 = r17
        L78:
            r1 = 0
        L79:
            return r1
    }

    public void cancel() {
            r1 = this;
            r0 = -1
            r1.mActivePointerId = r0
            r1.clearMotionHistory()
            android.view.VelocityTracker r0 = r1.mVelocityTracker
            if (r0 == 0) goto L12
            android.view.VelocityTracker r0 = r1.mVelocityTracker
            r0.recycle()
            r0 = 0
            r1.mVelocityTracker = r0
        L12:
            return
    }

    public void captureChildView(android.view.View r4, int r5) {
            r3 = this;
            android.view.ViewParent r0 = r4.getParent()
            android.view.ViewGroup r1 = r3.mParentView
            if (r0 != r1) goto L16
            r3.mCapturedView = r4
            r3.mActivePointerId = r5
            androidx.customview.widget.ViewDragHelper$Callback r0 = r3.mCallback
            r0.onViewCaptured(r4, r5)
            r0 = 1
            r3.setDragState(r0)
            return
        L16:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view ("
            java.lang.StringBuilder r1 = r1.append(r2)
            android.view.ViewGroup r2 = r3.mParentView
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = ")"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public boolean checkTouchSlop(int r4) {
            r3 = this;
            float[] r0 = r3.mInitialMotionX
            int r0 = r0.length
            r1 = 0
        L4:
            if (r1 >= r0) goto L11
            boolean r2 = r3.checkTouchSlop(r4, r1)
            if (r2 == 0) goto Le
            r2 = 1
            return r2
        Le:
            int r1 = r1 + 1
            goto L4
        L11:
            r1 = 0
            return r1
    }

    public boolean checkTouchSlop(int r10, int r11) {
            r9 = this;
            boolean r0 = r9.isPointerDown(r11)
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            r0 = r10 & 1
            r2 = 1
            if (r0 != r2) goto Lf
            r0 = r2
            goto L10
        Lf:
            r0 = r1
        L10:
            r3 = r10 & 2
            r4 = 2
            if (r3 != r4) goto L17
            r3 = r2
            goto L18
        L17:
            r3 = r1
        L18:
            float[] r4 = r9.mLastMotionX
            r4 = r4[r11]
            float[] r5 = r9.mInitialMotionX
            r5 = r5[r11]
            float r4 = r4 - r5
            float[] r5 = r9.mLastMotionY
            r5 = r5[r11]
            float[] r6 = r9.mInitialMotionY
            r6 = r6[r11]
            float r5 = r5 - r6
            if (r0 == 0) goto L3f
            if (r3 == 0) goto L3f
            float r6 = r4 * r4
            float r7 = r5 * r5
            float r6 = r6 + r7
            int r7 = r9.mTouchSlop
            int r8 = r9.mTouchSlop
            int r7 = r7 * r8
            float r7 = (float) r7
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 <= 0) goto L3e
            r1 = r2
        L3e:
            return r1
        L3f:
            if (r0 == 0) goto L4e
            float r6 = java.lang.Math.abs(r4)
            int r7 = r9.mTouchSlop
            float r7 = (float) r7
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 <= 0) goto L4d
            r1 = r2
        L4d:
            return r1
        L4e:
            if (r3 == 0) goto L5d
            float r6 = java.lang.Math.abs(r5)
            int r7 = r9.mTouchSlop
            float r7 = (float) r7
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 <= 0) goto L5c
            r1 = r2
        L5c:
            return r1
        L5d:
            return r1
    }

    public boolean continueSettling(boolean r11) {
            r10 = this;
            int r0 = r10.mDragState
            r1 = 0
            r2 = 2
            if (r0 != r2) goto L68
            android.widget.OverScroller r0 = r10.mScroller
            boolean r0 = r0.computeScrollOffset()
            android.widget.OverScroller r3 = r10.mScroller
            int r6 = r3.getCurrX()
            android.widget.OverScroller r3 = r10.mScroller
            int r7 = r3.getCurrY()
            android.view.View r3 = r10.mCapturedView
            int r3 = r3.getLeft()
            int r8 = r6 - r3
            android.view.View r3 = r10.mCapturedView
            int r3 = r3.getTop()
            int r9 = r7 - r3
            if (r8 == 0) goto L2f
            android.view.View r3 = r10.mCapturedView
            androidx.core.view.ViewCompat.offsetLeftAndRight(r3, r8)
        L2f:
            if (r9 == 0) goto L36
            android.view.View r3 = r10.mCapturedView
            androidx.core.view.ViewCompat.offsetTopAndBottom(r3, r9)
        L36:
            if (r8 != 0) goto L3a
            if (r9 == 0) goto L41
        L3a:
            androidx.customview.widget.ViewDragHelper$Callback r4 = r10.mCallback
            android.view.View r5 = r10.mCapturedView
            r4.onViewPositionChanged(r5, r6, r7, r8, r9)
        L41:
            if (r0 == 0) goto L59
            android.widget.OverScroller r3 = r10.mScroller
            int r3 = r3.getFinalX()
            if (r6 != r3) goto L59
            android.widget.OverScroller r3 = r10.mScroller
            int r3 = r3.getFinalY()
            if (r7 != r3) goto L59
            android.widget.OverScroller r3 = r10.mScroller
            r3.abortAnimation()
            r0 = 0
        L59:
            if (r0 != 0) goto L68
            if (r11 == 0) goto L65
            android.view.ViewGroup r3 = r10.mParentView
            java.lang.Runnable r4 = r10.mSetIdleRunnable
            r3.post(r4)
            goto L68
        L65:
            r10.setDragState(r1)
        L68:
            int r0 = r10.mDragState
            if (r0 != r2) goto L6d
            r1 = 1
        L6d:
            return r1
    }

    public android.view.View findTopChildUnder(int r5, int r6) {
            r4 = this;
            android.view.ViewGroup r0 = r4.mParentView
            int r0 = r0.getChildCount()
            int r1 = r0 + (-1)
        L8:
            if (r1 < 0) goto L32
            android.view.ViewGroup r2 = r4.mParentView
            androidx.customview.widget.ViewDragHelper$Callback r3 = r4.mCallback
            int r3 = r3.getOrderedChildIndex(r1)
            android.view.View r2 = r2.getChildAt(r3)
            int r3 = r2.getLeft()
            if (r5 < r3) goto L2f
            int r3 = r2.getRight()
            if (r5 >= r3) goto L2f
            int r3 = r2.getTop()
            if (r6 < r3) goto L2f
            int r3 = r2.getBottom()
            if (r6 >= r3) goto L2f
            return r2
        L2f:
            int r1 = r1 + (-1)
            goto L8
        L32:
            r1 = 0
            return r1
    }

    public void flingCapturedView(int r11, int r12, int r13, int r14) {
            r10 = this;
            boolean r0 = r10.mReleaseInProgress
            if (r0 == 0) goto L30
            android.widget.OverScroller r1 = r10.mScroller
            android.view.View r0 = r10.mCapturedView
            int r2 = r0.getLeft()
            android.view.View r0 = r10.mCapturedView
            int r3 = r0.getTop()
            android.view.VelocityTracker r0 = r10.mVelocityTracker
            int r4 = r10.mActivePointerId
            float r0 = r0.getXVelocity(r4)
            int r4 = (int) r0
            android.view.VelocityTracker r0 = r10.mVelocityTracker
            int r5 = r10.mActivePointerId
            float r0 = r0.getYVelocity(r5)
            int r5 = (int) r0
            r6 = r11
            r8 = r12
            r7 = r13
            r9 = r14
            r1.fling(r2, r3, r4, r5, r6, r7, r8, r9)
            r11 = 2
            r10.setDragState(r11)
            return
        L30:
            r6 = r11
            r8 = r12
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "Cannot flingCapturedView outside of a call to Callback#onViewReleased"
            r11.<init>(r12)
            throw r11
    }

    public int getActivePointerId() {
            r1 = this;
            int r0 = r1.mActivePointerId
            return r0
    }

    public android.view.View getCapturedView() {
            r1 = this;
            android.view.View r0 = r1.mCapturedView
            return r0
    }

    public int getEdgeSize() {
            r1 = this;
            int r0 = r1.mEdgeSize
            return r0
    }

    public float getMinVelocity() {
            r1 = this;
            float r0 = r1.mMinVelocity
            return r0
    }

    public int getTouchSlop() {
            r1 = this;
            int r0 = r1.mTouchSlop
            return r0
    }

    public int getViewDragState() {
            r1 = this;
            int r0 = r1.mDragState
            return r0
    }

    public boolean isCapturedViewUnder(int r2, int r3) {
            r1 = this;
            android.view.View r0 = r1.mCapturedView
            boolean r0 = r1.isViewUnder(r0, r2, r3)
            return r0
    }

    public boolean isEdgeTouched(int r4) {
            r3 = this;
            int[] r0 = r3.mInitialEdgesTouched
            int r0 = r0.length
            r1 = 0
        L4:
            if (r1 >= r0) goto L11
            boolean r2 = r3.isEdgeTouched(r4, r1)
            if (r2 == 0) goto Le
            r2 = 1
            return r2
        Le:
            int r1 = r1 + 1
            goto L4
        L11:
            r1 = 0
            return r1
    }

    public boolean isEdgeTouched(int r2, int r3) {
            r1 = this;
            boolean r0 = r1.isPointerDown(r3)
            if (r0 == 0) goto Lf
            int[] r0 = r1.mInitialEdgesTouched
            r0 = r0[r3]
            r0 = r0 & r2
            if (r0 == 0) goto Lf
            r0 = 1
            goto L10
        Lf:
            r0 = 0
        L10:
            return r0
    }

    public boolean isPointerDown(int r4) {
            r3 = this;
            int r0 = r3.mPointersDown
            r1 = 1
            int r2 = r1 << r4
            r0 = r0 & r2
            if (r0 == 0) goto L9
            goto La
        L9:
            r1 = 0
        La:
            return r1
    }

    public boolean isViewUnder(android.view.View r3, int r4, int r5) {
            r2 = this;
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            int r1 = r3.getLeft()
            if (r4 < r1) goto L1e
            int r1 = r3.getRight()
            if (r4 >= r1) goto L1e
            int r1 = r3.getTop()
            if (r5 < r1) goto L1e
            int r1 = r3.getBottom()
            if (r5 >= r1) goto L1e
            r0 = 1
            goto L1f
        L1e:
        L1f:
            return r0
    }

    public void processTouchEvent(android.view.MotionEvent r13) {
            r12 = this;
            int r0 = r13.getActionMasked()
            int r1 = r13.getActionIndex()
            if (r0 != 0) goto Ld
            r12.cancel()
        Ld:
            android.view.VelocityTracker r2 = r12.mVelocityTracker
            if (r2 != 0) goto L17
            android.view.VelocityTracker r2 = android.view.VelocityTracker.obtain()
            r12.mVelocityTracker = r2
        L17:
            android.view.VelocityTracker r2 = r12.mVelocityTracker
            r2.addMovement(r13)
            r2 = 1
            switch(r0) {
                case 0: goto L14d;
                case 1: goto L142;
                case 2: goto Lb6;
                case 3: goto La9;
                case 4: goto L20;
                case 5: goto L6a;
                case 6: goto L22;
                default: goto L20;
            }
        L20:
            goto L177
        L22:
            int r3 = r13.getPointerId(r1)
            int r4 = r12.mDragState
            if (r4 != r2) goto L65
            int r2 = r12.mActivePointerId
            if (r3 != r2) goto L65
            r2 = -1
            int r4 = r13.getPointerCount()
            r5 = 0
        L34:
            if (r5 >= r4) goto L5f
            int r6 = r13.getPointerId(r5)
            int r7 = r12.mActivePointerId
            if (r6 != r7) goto L3f
            goto L5c
        L3f:
            float r7 = r13.getX(r5)
            float r8 = r13.getY(r5)
            int r9 = (int) r7
            int r10 = (int) r8
            android.view.View r9 = r12.findTopChildUnder(r9, r10)
            android.view.View r10 = r12.mCapturedView
            if (r9 != r10) goto L5c
            android.view.View r9 = r12.mCapturedView
            boolean r9 = r12.tryCaptureViewForDrag(r9, r6)
            if (r9 == 0) goto L5c
            int r2 = r12.mActivePointerId
            goto L5f
        L5c:
            int r5 = r5 + 1
            goto L34
        L5f:
            r5 = -1
            if (r2 != r5) goto L65
            r12.releaseViewForPointerUp()
        L65:
            r12.clearMotionHistory(r3)
            goto L177
        L6a:
            int r2 = r13.getPointerId(r1)
            float r3 = r13.getX(r1)
            float r4 = r13.getY(r1)
            r12.saveInitialMotion(r3, r4, r2)
            int r5 = r12.mDragState
            if (r5 != 0) goto L98
            int r5 = (int) r3
            int r6 = (int) r4
            android.view.View r5 = r12.findTopChildUnder(r5, r6)
            r12.tryCaptureViewForDrag(r5, r2)
            int[] r6 = r12.mInitialEdgesTouched
            r6 = r6[r2]
            int r7 = r12.mTrackingEdges
            r7 = r7 & r6
            if (r7 == 0) goto La7
            androidx.customview.widget.ViewDragHelper$Callback r7 = r12.mCallback
            int r8 = r12.mTrackingEdges
            r8 = r8 & r6
            r7.onEdgeTouched(r8, r2)
            goto La7
        L98:
            int r5 = (int) r3
            int r6 = (int) r4
            boolean r5 = r12.isCapturedViewUnder(r5, r6)
            if (r5 == 0) goto La7
            android.view.View r5 = r12.mCapturedView
            r12.tryCaptureViewForDrag(r5, r2)
            goto L177
        La7:
            goto L177
        La9:
            int r3 = r12.mDragState
            if (r3 != r2) goto Lb1
            r2 = 0
            r12.dispatchViewReleased(r2, r2)
        Lb1:
            r12.cancel()
            goto L177
        Lb6:
            int r3 = r12.mDragState
            if (r3 != r2) goto Lfa
            int r2 = r12.mActivePointerId
            boolean r2 = r12.isValidPointerForActionMove(r2)
            if (r2 != 0) goto Lc4
            goto L177
        Lc4:
            int r2 = r12.mActivePointerId
            int r2 = r13.findPointerIndex(r2)
            float r3 = r13.getX(r2)
            float r4 = r13.getY(r2)
            float[] r5 = r12.mLastMotionX
            int r6 = r12.mActivePointerId
            r5 = r5[r6]
            float r5 = r3 - r5
            int r5 = (int) r5
            float[] r6 = r12.mLastMotionY
            int r7 = r12.mActivePointerId
            r6 = r6[r7]
            float r6 = r4 - r6
            int r6 = (int) r6
            android.view.View r7 = r12.mCapturedView
            int r7 = r7.getLeft()
            int r7 = r7 + r5
            android.view.View r8 = r12.mCapturedView
            int r8 = r8.getTop()
            int r8 = r8 + r6
            r12.dragTo(r7, r8, r5, r6)
            r12.saveLastMotion(r13)
            goto L177
        Lfa:
            int r3 = r13.getPointerCount()
            r4 = 0
        Lff:
            if (r4 >= r3) goto L13e
            int r5 = r13.getPointerId(r4)
            boolean r6 = r12.isValidPointerForActionMove(r5)
            if (r6 != 0) goto L10c
            goto L13b
        L10c:
            float r6 = r13.getX(r4)
            float r7 = r13.getY(r4)
            float[] r8 = r12.mInitialMotionX
            r8 = r8[r5]
            float r8 = r6 - r8
            float[] r9 = r12.mInitialMotionY
            r9 = r9[r5]
            float r9 = r7 - r9
            r12.reportNewEdgeDrags(r8, r9, r5)
            int r10 = r12.mDragState
            if (r10 != r2) goto L128
            goto L13e
        L128:
            int r10 = (int) r6
            int r11 = (int) r7
            android.view.View r10 = r12.findTopChildUnder(r10, r11)
            boolean r11 = r12.checkTouchSlop(r10, r8, r9)
            if (r11 == 0) goto L13b
            boolean r11 = r12.tryCaptureViewForDrag(r10, r5)
            if (r11 == 0) goto L13b
            goto L13e
        L13b:
            int r4 = r4 + 1
            goto Lff
        L13e:
            r12.saveLastMotion(r13)
            goto L177
        L142:
            int r3 = r12.mDragState
            if (r3 != r2) goto L149
            r12.releaseViewForPointerUp()
        L149:
            r12.cancel()
            goto L177
        L14d:
            float r2 = r13.getX()
            float r3 = r13.getY()
            r4 = 0
            int r4 = r13.getPointerId(r4)
            int r5 = (int) r2
            int r6 = (int) r3
            android.view.View r5 = r12.findTopChildUnder(r5, r6)
            r12.saveInitialMotion(r2, r3, r4)
            r12.tryCaptureViewForDrag(r5, r4)
            int[] r6 = r12.mInitialEdgesTouched
            r6 = r6[r4]
            int r7 = r12.mTrackingEdges
            r7 = r7 & r6
            if (r7 == 0) goto L177
            androidx.customview.widget.ViewDragHelper$Callback r7 = r12.mCallback
            int r8 = r12.mTrackingEdges
            r8 = r8 & r6
            r7.onEdgeTouched(r8, r4)
        L177:
            return
    }

    void setDragState(int r3) {
            r2 = this;
            android.view.ViewGroup r0 = r2.mParentView
            java.lang.Runnable r1 = r2.mSetIdleRunnable
            r0.removeCallbacks(r1)
            int r0 = r2.mDragState
            if (r0 == r3) goto L19
            r2.mDragState = r3
            androidx.customview.widget.ViewDragHelper$Callback r0 = r2.mCallback
            r0.onViewDragStateChanged(r3)
            int r0 = r2.mDragState
            if (r0 != 0) goto L19
            r0 = 0
            r2.mCapturedView = r0
        L19:
            return
    }

    public void setEdgeTrackingEnabled(int r1) {
            r0 = this;
            r0.mTrackingEdges = r1
            return
    }

    public void setMinVelocity(float r1) {
            r0 = this;
            r0.mMinVelocity = r1
            return
    }

    public boolean settleCapturedViewAt(int r4, int r5) {
            r3 = this;
            boolean r0 = r3.mReleaseInProgress
            if (r0 == 0) goto L1b
            android.view.VelocityTracker r0 = r3.mVelocityTracker
            int r1 = r3.mActivePointerId
            float r0 = r0.getXVelocity(r1)
            int r0 = (int) r0
            android.view.VelocityTracker r1 = r3.mVelocityTracker
            int r2 = r3.mActivePointerId
            float r1 = r1.getYVelocity(r2)
            int r1 = (int) r1
            boolean r0 = r3.forceSettleCapturedViewAt(r4, r5, r0, r1)
            return r0
        L1b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased"
            r0.<init>(r1)
            throw r0
    }

    public boolean shouldInterceptTouchEvent(android.view.MotionEvent r22) {
            r21 = this;
            r0 = r21
            r1 = r22
            int r2 = r1.getActionMasked()
            int r3 = r1.getActionIndex()
            if (r2 != 0) goto L11
            r0.cancel()
        L11:
            android.view.VelocityTracker r4 = r0.mVelocityTracker
            if (r4 != 0) goto L1b
            android.view.VelocityTracker r4 = android.view.VelocityTracker.obtain()
            r0.mVelocityTracker = r4
        L1b:
            android.view.VelocityTracker r4 = r0.mVelocityTracker
            r4.addMovement(r1)
            r4 = 2
            switch(r2) {
                case 0: goto L145;
                case 1: goto L13c;
                case 2: goto L7d;
                case 3: goto L13c;
                case 4: goto L24;
                case 5: goto L39;
                case 6: goto L2b;
                default: goto L24;
            }
        L24:
            r16 = r2
            r17 = r3
            r5 = 0
            goto L17b
        L2b:
            int r4 = r1.getPointerId(r3)
            r0.clearMotionHistory(r4)
            r16 = r2
            r17 = r3
            r5 = 0
            goto L17b
        L39:
            int r7 = r1.getPointerId(r3)
            float r8 = r1.getX(r3)
            float r9 = r1.getY(r3)
            r0.saveInitialMotion(r8, r9, r7)
            int r10 = r0.mDragState
            if (r10 != 0) goto L5e
            int[] r4 = r0.mInitialEdgesTouched
            r4 = r4[r7]
            int r10 = r0.mTrackingEdges
            r10 = r10 & r4
            if (r10 == 0) goto L76
            androidx.customview.widget.ViewDragHelper$Callback r10 = r0.mCallback
            int r11 = r0.mTrackingEdges
            r11 = r11 & r4
            r10.onEdgeTouched(r11, r7)
            goto L76
        L5e:
            int r10 = r0.mDragState
            if (r10 != r4) goto L76
            int r4 = (int) r8
            int r10 = (int) r9
            android.view.View r4 = r0.findTopChildUnder(r4, r10)
            android.view.View r10 = r0.mCapturedView
            if (r4 != r10) goto L6f
            r0.tryCaptureViewForDrag(r4, r7)
        L6f:
            r16 = r2
            r17 = r3
            r5 = 0
            goto L17b
        L76:
            r16 = r2
            r17 = r3
            r5 = 0
            goto L17b
        L7d:
            float[] r4 = r0.mInitialMotionX
            if (r4 == 0) goto L136
            float[] r4 = r0.mInitialMotionY
            if (r4 != 0) goto L8c
            r16 = r2
            r17 = r3
            r5 = 0
            goto L17b
        L8c:
            int r4 = r1.getPointerCount()
            r7 = 0
        L91:
            if (r7 >= r4) goto L12b
            int r8 = r1.getPointerId(r7)
            boolean r9 = r0.isValidPointerForActionMove(r8)
            if (r9 != 0) goto La5
            r16 = r2
            r17 = r3
            r18 = r4
            goto L121
        La5:
            float r9 = r1.getX(r7)
            float r10 = r1.getY(r7)
            float[] r11 = r0.mInitialMotionX
            r11 = r11[r8]
            float r11 = r9 - r11
            float[] r12 = r0.mInitialMotionY
            r12 = r12[r8]
            float r12 = r10 - r12
            int r13 = (int) r9
            int r14 = (int) r10
            android.view.View r13 = r0.findTopChildUnder(r13, r14)
            if (r13 == 0) goto Lc9
            boolean r14 = r0.checkTouchSlop(r13, r11, r12)
            if (r14 == 0) goto Lc9
            r14 = 1
            goto Lca
        Lc9:
            r14 = 0
        Lca:
            if (r14 == 0) goto L109
            int r15 = r13.getLeft()
            int r5 = (int) r11
            int r5 = r5 + r15
            androidx.customview.widget.ViewDragHelper$Callback r6 = r0.mCallback
            r16 = r2
            int r2 = (int) r11
            int r2 = r6.clampViewPositionHorizontal(r13, r5, r2)
            int r6 = r13.getTop()
            r17 = r3
            int r3 = (int) r12
            int r3 = r3 + r6
            r18 = r4
            androidx.customview.widget.ViewDragHelper$Callback r4 = r0.mCallback
            r19 = r5
            int r5 = (int) r12
            int r4 = r4.clampViewPositionVertical(r13, r3, r5)
            androidx.customview.widget.ViewDragHelper$Callback r5 = r0.mCallback
            int r5 = r5.getViewHorizontalDragRange(r13)
            r20 = r3
            androidx.customview.widget.ViewDragHelper$Callback r3 = r0.mCallback
            int r3 = r3.getViewVerticalDragRange(r13)
            if (r5 == 0) goto L102
            if (r5 <= 0) goto L10f
            if (r2 != r15) goto L10f
        L102:
            if (r3 == 0) goto L131
            if (r3 <= 0) goto L10f
            if (r4 != r6) goto L10f
            goto L131
        L109:
            r16 = r2
            r17 = r3
            r18 = r4
        L10f:
            r0.reportNewEdgeDrags(r11, r12, r8)
            int r2 = r0.mDragState
            r3 = 1
            if (r2 != r3) goto L118
            goto L131
        L118:
            if (r14 == 0) goto L121
            boolean r2 = r0.tryCaptureViewForDrag(r13, r8)
            if (r2 == 0) goto L121
            goto L131
        L121:
            int r7 = r7 + 1
            r2 = r16
            r3 = r17
            r4 = r18
            goto L91
        L12b:
            r16 = r2
            r17 = r3
            r18 = r4
        L131:
            r21.saveLastMotion(r22)
            r5 = 0
            goto L17b
        L136:
            r16 = r2
            r17 = r3
            r5 = 0
            goto L17b
        L13c:
            r16 = r2
            r17 = r3
            r0.cancel()
            r5 = 0
            goto L17b
        L145:
            r16 = r2
            r17 = r3
            float r2 = r1.getX()
            float r3 = r1.getY()
            r5 = 0
            int r6 = r1.getPointerId(r5)
            r0.saveInitialMotion(r2, r3, r6)
            int r7 = (int) r2
            int r8 = (int) r3
            android.view.View r7 = r0.findTopChildUnder(r7, r8)
            android.view.View r8 = r0.mCapturedView
            if (r7 != r8) goto L16a
            int r8 = r0.mDragState
            if (r8 != r4) goto L16a
            r0.tryCaptureViewForDrag(r7, r6)
        L16a:
            int[] r4 = r0.mInitialEdgesTouched
            r4 = r4[r6]
            int r8 = r0.mTrackingEdges
            r8 = r8 & r4
            if (r8 == 0) goto L17b
            androidx.customview.widget.ViewDragHelper$Callback r8 = r0.mCallback
            int r9 = r0.mTrackingEdges
            r9 = r9 & r4
            r8.onEdgeTouched(r9, r6)
        L17b:
            int r2 = r0.mDragState
            r3 = 1
            if (r2 != r3) goto L181
            r5 = r3
        L181:
            return r5
    }

    public boolean smoothSlideViewTo(android.view.View r3, int r4, int r5) {
            r2 = this;
            r2.mCapturedView = r3
            r0 = -1
            r2.mActivePointerId = r0
            r0 = 0
            boolean r0 = r2.forceSettleCapturedViewAt(r4, r5, r0, r0)
            if (r0 != 0) goto L17
            int r1 = r2.mDragState
            if (r1 != 0) goto L17
            android.view.View r1 = r2.mCapturedView
            if (r1 == 0) goto L17
            r1 = 0
            r2.mCapturedView = r1
        L17:
            return r0
    }

    boolean tryCaptureViewForDrag(android.view.View r3, int r4) {
            r2 = this;
            android.view.View r0 = r2.mCapturedView
            r1 = 1
            if (r3 != r0) goto La
            int r0 = r2.mActivePointerId
            if (r0 != r4) goto La
            return r1
        La:
            if (r3 == 0) goto L1a
            androidx.customview.widget.ViewDragHelper$Callback r0 = r2.mCallback
            boolean r0 = r0.tryCaptureView(r3, r4)
            if (r0 == 0) goto L1a
            r2.mActivePointerId = r4
            r2.captureChildView(r3, r4)
            return r1
        L1a:
            r0 = 0
            return r0
    }
}
