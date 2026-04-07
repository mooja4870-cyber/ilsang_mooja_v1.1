package androidx.core.widget;

/* JADX INFO: loaded from: classes.dex */
public class NestedScrollView extends android.widget.FrameLayout implements androidx.core.view.NestedScrollingParent3, androidx.core.view.NestedScrollingChild3, androidx.core.view.ScrollingView {
    private static final androidx.core.widget.NestedScrollView.AccessibilityDelegate ACCESSIBILITY_DELEGATE = null;
    static final int ANIMATED_SCROLL_GAP = 250;
    private static final float DECELERATION_RATE = 0.0f;
    private static final int DEFAULT_SMOOTH_SCROLL_DURATION = 250;
    private static final float FLING_DESTRETCH_FACTOR = 4.0f;
    private static final float INFLEXION = 0.35f;
    private static final int INVALID_POINTER = -1;
    static final float MAX_SCROLL_FACTOR = 0.5f;
    private static final int[] SCROLLVIEW_STYLEABLE = null;
    private static final float SCROLL_FRICTION = 0.015f;
    private static final java.lang.String TAG = "NestedScrollView";
    private int mActivePointerId;
    private final androidx.core.view.NestedScrollingChildHelper mChildHelper;
    private android.view.View mChildToScrollTo;
    androidx.core.view.DifferentialMotionFlingController mDifferentialMotionFlingController;
    final androidx.core.widget.NestedScrollView.DifferentialMotionFlingTargetImpl mDifferentialMotionFlingTarget;
    public android.widget.EdgeEffect mEdgeGlowBottom;
    public android.widget.EdgeEffect mEdgeGlowTop;
    private boolean mFillViewport;
    private boolean mIsBeingDragged;
    private boolean mIsLaidOut;
    private boolean mIsLayoutDirty;
    private int mLastMotionY;
    private long mLastScroll;
    private int mLastScrollerY;
    private int mMaximumVelocity;
    private int mMinimumVelocity;
    private int mNestedYOffset;
    private androidx.core.widget.NestedScrollView.OnScrollChangeListener mOnScrollChangeListener;
    private final androidx.core.view.NestedScrollingParentHelper mParentHelper;
    private final float mPhysicalCoeff;
    private androidx.core.widget.NestedScrollView.SavedState mSavedState;
    private final int[] mScrollConsumed;
    androidx.core.view.ScrollFeedbackProviderCompat mScrollFeedbackProvider;
    private final int[] mScrollOffset;
    private android.widget.OverScroller mScroller;
    private boolean mSmoothScrollingEnabled;
    private final android.graphics.Rect mTempRect;
    private int mTouchSlop;
    private android.view.VelocityTracker mVelocityTracker;
    private float mVerticalScrollFactor;

    static class AccessibilityDelegate extends androidx.core.view.AccessibilityDelegateCompat {
        AccessibilityDelegate() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityEvent(android.view.View r4, android.view.accessibility.AccessibilityEvent r5) {
                r3 = this;
                super.onInitializeAccessibilityEvent(r4, r5)
                r0 = r4
                androidx.core.widget.NestedScrollView r0 = (androidx.core.widget.NestedScrollView) r0
                java.lang.Class<android.widget.ScrollView> r1 = android.widget.ScrollView.class
                java.lang.String r1 = r1.getName()
                r5.setClassName(r1)
                int r1 = r0.getScrollRange()
                if (r1 <= 0) goto L17
                r1 = 1
                goto L18
            L17:
                r1 = 0
            L18:
                r5.setScrollable(r1)
                int r2 = r0.getScrollX()
                r5.setScrollX(r2)
                int r2 = r0.getScrollY()
                r5.setScrollY(r2)
                int r2 = r0.getScrollX()
                androidx.core.view.accessibility.AccessibilityRecordCompat.setMaxScrollX(r5, r2)
                int r2 = r0.getScrollRange()
                androidx.core.view.accessibility.AccessibilityRecordCompat.setMaxScrollY(r5, r2)
                return
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityNodeInfo(android.view.View r4, androidx.core.view.accessibility.AccessibilityNodeInfoCompat r5) {
                r3 = this;
                super.onInitializeAccessibilityNodeInfo(r4, r5)
                r0 = r4
                androidx.core.widget.NestedScrollView r0 = (androidx.core.widget.NestedScrollView) r0
                java.lang.Class<android.widget.ScrollView> r1 = android.widget.ScrollView.class
                java.lang.String r1 = r1.getName()
                r5.setClassName(r1)
                boolean r1 = r0.isEnabled()
                if (r1 == 0) goto L3f
                int r1 = r0.getScrollRange()
                if (r1 <= 0) goto L3f
                r2 = 1
                r5.setScrollable(r2)
                int r2 = r0.getScrollY()
                if (r2 <= 0) goto L2f
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r2 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_BACKWARD
                r5.addAction(r2)
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r2 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_UP
                r5.addAction(r2)
            L2f:
                int r2 = r0.getScrollY()
                if (r2 >= r1) goto L3f
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r2 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_FORWARD
                r5.addAction(r2)
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r2 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_DOWN
                r5.addAction(r2)
            L3f:
                return
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public boolean performAccessibilityAction(android.view.View r9, int r10, android.os.Bundle r11) {
                r8 = this;
                boolean r0 = super.performAccessibilityAction(r9, r10, r11)
                r1 = 1
                if (r0 == 0) goto L8
                return r1
            L8:
                r0 = r9
                androidx.core.widget.NestedScrollView r0 = (androidx.core.widget.NestedScrollView) r0
                boolean r2 = r0.isEnabled()
                r3 = 0
                if (r2 != 0) goto L13
                return r3
            L13:
                int r2 = r0.getHeight()
                android.graphics.Rect r4 = new android.graphics.Rect
                r4.<init>()
                android.graphics.Matrix r5 = r0.getMatrix()
                boolean r5 = r5.isIdentity()
                if (r5 == 0) goto L30
                boolean r5 = r0.getGlobalVisibleRect(r4)
                if (r5 == 0) goto L30
                int r2 = r4.height()
            L30:
                switch(r10) {
                    case 4096: goto L53;
                    case 8192: goto L34;
                    case 16908344: goto L34;
                    case 16908346: goto L53;
                    default: goto L33;
                }
            L33:
                return r3
            L34:
                int r5 = r0.getPaddingBottom()
                int r5 = r2 - r5
                int r6 = r0.getPaddingTop()
                int r5 = r5 - r6
                int r6 = r0.getScrollY()
                int r6 = r6 - r5
                int r6 = java.lang.Math.max(r6, r3)
                int r7 = r0.getScrollY()
                if (r6 == r7) goto L52
                r0.smoothScrollTo(r3, r6, r1)
                return r1
            L52:
                return r3
            L53:
                int r5 = r0.getPaddingBottom()
                int r5 = r2 - r5
                int r6 = r0.getPaddingTop()
                int r5 = r5 - r6
                int r6 = r0.getScrollY()
                int r6 = r6 + r5
                int r7 = r0.getScrollRange()
                int r6 = java.lang.Math.min(r6, r7)
                int r7 = r0.getScrollY()
                if (r6 == r7) goto L75
                r0.smoothScrollTo(r3, r6, r1)
                return r1
            L75:
                return r3
        }
    }

    static class Api21Impl {
        private Api21Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static boolean getClipToPadding(android.view.ViewGroup r1) {
                boolean r0 = r1.getClipToPadding()
                return r0
        }
    }

    private static final class Api35Impl {
        private Api35Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        public static void setFrameContentVelocity(android.view.View r1, float r2) {
                r1.setFrameContentVelocity(r2)     // Catch: java.lang.LinkageError -> L4
                goto L5
            L4:
                r0 = move-exception
            L5:
                return
        }
    }

    class DifferentialMotionFlingTargetImpl implements androidx.core.view.DifferentialMotionFlingTarget {
        final /* synthetic */ androidx.core.widget.NestedScrollView this$0;

        DifferentialMotionFlingTargetImpl(androidx.core.widget.NestedScrollView r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // androidx.core.view.DifferentialMotionFlingTarget
        public float getScaledScrollFactor() {
                r1 = this;
                androidx.core.widget.NestedScrollView r0 = r1.this$0
                float r0 = r0.getVerticalScrollFactorCompat()
                float r0 = -r0
                return r0
        }

        @Override // androidx.core.view.DifferentialMotionFlingTarget
        public boolean startDifferentialMotionFling(float r3) {
                r2 = this;
                r0 = 0
                int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
                if (r0 != 0) goto L7
                r0 = 0
                return r0
            L7:
                r2.stopDifferentialMotionFling()
                androidx.core.widget.NestedScrollView r0 = r2.this$0
                int r1 = (int) r3
                r0.fling(r1)
                r0 = 1
                return r0
        }

        @Override // androidx.core.view.DifferentialMotionFlingTarget
        public void stopDifferentialMotionFling() {
                r1 = this;
                androidx.core.widget.NestedScrollView r0 = r1.this$0
                android.widget.OverScroller r0 = androidx.core.widget.NestedScrollView.access$000(r0)
                r0.abortAnimation()
                return
        }
    }

    public interface OnScrollChangeListener {
        void onScrollChange(androidx.core.widget.NestedScrollView r1, int r2, int r3, int r4, int r5);
    }

    static class SavedState extends android.view.View.BaseSavedState {
        public static final android.os.Parcelable.Creator<androidx.core.widget.NestedScrollView.SavedState> CREATOR = null;
        public int scrollPosition;


        static {
                androidx.core.widget.NestedScrollView$SavedState$1 r0 = new androidx.core.widget.NestedScrollView$SavedState$1
                r0.<init>()
                androidx.core.widget.NestedScrollView.SavedState.CREATOR = r0
                return
        }

        SavedState(android.os.Parcel r2) {
                r1 = this;
                r1.<init>(r2)
                int r0 = r2.readInt()
                r1.scrollPosition = r0
                return
        }

        SavedState(android.os.Parcelable r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "HorizontalScrollView.SavedState{"
                java.lang.StringBuilder r0 = r0.append(r1)
                int r1 = java.lang.System.identityHashCode(r2)
                java.lang.String r1 = java.lang.Integer.toHexString(r1)
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = " scrollPosition="
                java.lang.StringBuilder r0 = r0.append(r1)
                int r1 = r2.scrollPosition
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = "}"
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(android.os.Parcel r2, int r3) {
                r1 = this;
                super.writeToParcel(r2, r3)
                int r0 = r1.scrollPosition
                r2.writeInt(r0)
                return
        }
    }

    static {
            r0 = 4605200834963974390(0x3fe8f5c28f5c28f6, double:0.78)
            double r0 = java.lang.Math.log(r0)
            r2 = 4606281698874543309(0x3feccccccccccccd, double:0.9)
            double r2 = java.lang.Math.log(r2)
            double r0 = r0 / r2
            float r0 = (float) r0
            androidx.core.widget.NestedScrollView.DECELERATION_RATE = r0
            androidx.core.widget.NestedScrollView$AccessibilityDelegate r0 = new androidx.core.widget.NestedScrollView$AccessibilityDelegate
            r0.<init>()
            androidx.core.widget.NestedScrollView.ACCESSIBILITY_DELEGATE = r0
            r0 = 16843130(0x101017a, float:2.3694617E-38)
            int[] r0 = new int[]{r0}
            androidx.core.widget.NestedScrollView.SCROLLVIEW_STYLEABLE = r0
            return
    }

    public NestedScrollView(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public NestedScrollView(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            int r0 = androidx.core.R.attr.nestedScrollViewStyle
            r1.<init>(r2, r3, r0)
            return
    }

    public NestedScrollView(android.content.Context r6, android.util.AttributeSet r7, int r8) {
            r5 = this;
            r5.<init>(r6, r7, r8)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r5.mTempRect = r0
            r0 = 1
            r5.mIsLayoutDirty = r0
            r1 = 0
            r5.mIsLaidOut = r1
            r2 = 0
            r5.mChildToScrollTo = r2
            r5.mIsBeingDragged = r1
            r5.mSmoothScrollingEnabled = r0
            r2 = -1
            r5.mActivePointerId = r2
            r2 = 2
            int[] r3 = new int[r2]
            r5.mScrollOffset = r3
            int[] r2 = new int[r2]
            r5.mScrollConsumed = r2
            androidx.core.widget.NestedScrollView$DifferentialMotionFlingTargetImpl r2 = new androidx.core.widget.NestedScrollView$DifferentialMotionFlingTargetImpl
            r2.<init>(r5)
            r5.mDifferentialMotionFlingTarget = r2
            androidx.core.view.DifferentialMotionFlingController r2 = new androidx.core.view.DifferentialMotionFlingController
            android.content.Context r3 = r5.getContext()
            androidx.core.widget.NestedScrollView$DifferentialMotionFlingTargetImpl r4 = r5.mDifferentialMotionFlingTarget
            r2.<init>(r3, r4)
            r5.mDifferentialMotionFlingController = r2
            android.widget.EdgeEffect r2 = androidx.core.widget.EdgeEffectCompat.create(r6, r7)
            r5.mEdgeGlowTop = r2
            android.widget.EdgeEffect r2 = androidx.core.widget.EdgeEffectCompat.create(r6, r7)
            r5.mEdgeGlowBottom = r2
            android.content.res.Resources r2 = r6.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            r3 = 1126170624(0x43200000, float:160.0)
            float r2 = r2 * r3
            r3 = 1136724797(0x43c10b3d, float:386.0878)
            float r3 = r3 * r2
            r4 = 1062668861(0x3f570a3d, float:0.84)
            float r3 = r3 * r4
            r5.mPhysicalCoeff = r3
            r5.initScrollView()
            int[] r3 = androidx.core.widget.NestedScrollView.SCROLLVIEW_STYLEABLE
            android.content.res.TypedArray r3 = r6.obtainStyledAttributes(r7, r3, r8, r1)
            boolean r1 = r3.getBoolean(r1, r1)
            r5.setFillViewport(r1)
            r3.recycle()
            androidx.core.view.NestedScrollingParentHelper r1 = new androidx.core.view.NestedScrollingParentHelper
            r1.<init>(r5)
            r5.mParentHelper = r1
            androidx.core.view.NestedScrollingChildHelper r1 = new androidx.core.view.NestedScrollingChildHelper
            r1.<init>(r5)
            r5.mChildHelper = r1
            r5.setNestedScrollingEnabled(r0)
            androidx.core.widget.NestedScrollView$AccessibilityDelegate r0 = androidx.core.widget.NestedScrollView.ACCESSIBILITY_DELEGATE
            androidx.core.view.ViewCompat.setAccessibilityDelegate(r5, r0)
            return
    }

    private void abortAnimatedScroll() {
            r1 = this;
            android.widget.OverScroller r0 = r1.mScroller
            r0.abortAnimation()
            r0 = 1
            r1.stopNestedScroll(r0)
            return
    }

    static /* synthetic */ android.widget.OverScroller access$000(androidx.core.widget.NestedScrollView r1) {
            android.widget.OverScroller r0 = r1.mScroller
            return r0
    }

    private boolean canOverScroll() {
            r3 = this;
            int r0 = r3.getOverScrollMode()
            r1 = 1
            if (r0 == 0) goto L12
            if (r0 != r1) goto L10
            int r2 = r3.getScrollRange()
            if (r2 <= 0) goto L10
            goto L12
        L10:
            r1 = 0
            goto L13
        L12:
        L13:
            return r1
    }

    private boolean canScroll() {
            r6 = this;
            int r0 = r6.getChildCount()
            r1 = 0
            if (r0 <= 0) goto L2d
            android.view.View r0 = r6.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r2 = r0.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r2 = (android.widget.FrameLayout.LayoutParams) r2
            int r3 = r0.getHeight()
            int r4 = r2.topMargin
            int r3 = r3 + r4
            int r4 = r2.bottomMargin
            int r3 = r3 + r4
            int r4 = r6.getHeight()
            int r5 = r6.getPaddingTop()
            int r4 = r4 - r5
            int r5 = r6.getPaddingBottom()
            int r4 = r4 - r5
            if (r3 <= r4) goto L2c
            r1 = 1
        L2c:
            return r1
        L2d:
            return r1
    }

    private static int clamp(int r1, int r2, int r3) {
            if (r2 >= r3) goto Ld
            if (r1 >= 0) goto L5
            goto Ld
        L5:
            int r0 = r2 + r1
            if (r0 <= r3) goto Lc
            int r0 = r3 - r2
            return r0
        Lc:
            return r1
        Ld:
            r0 = 0
            return r0
    }

    private void doScrollY(int r3) {
            r2 = this;
            if (r3 == 0) goto Le
            boolean r0 = r2.mSmoothScrollingEnabled
            r1 = 0
            if (r0 == 0) goto Lb
            r2.smoothScrollBy(r1, r3)
            goto Le
        Lb:
            r2.scrollBy(r1, r3)
        Le:
            return
    }

    private boolean edgeEffectFling(int r4) {
            r3 = this;
            r0 = 1
            android.widget.EdgeEffect r1 = r3.mEdgeGlowTop
            float r1 = androidx.core.widget.EdgeEffectCompat.getDistance(r1)
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 == 0) goto L1f
            android.widget.EdgeEffect r1 = r3.mEdgeGlowTop
            boolean r1 = r3.shouldAbsorb(r1, r4)
            if (r1 == 0) goto L1a
            android.widget.EdgeEffect r1 = r3.mEdgeGlowTop
            r1.onAbsorb(r4)
            goto L3f
        L1a:
            int r1 = -r4
            r3.fling(r1)
            goto L3f
        L1f:
            android.widget.EdgeEffect r1 = r3.mEdgeGlowBottom
            float r1 = androidx.core.widget.EdgeEffectCompat.getDistance(r1)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 == 0) goto L3e
            android.widget.EdgeEffect r1 = r3.mEdgeGlowBottom
            int r2 = -r4
            boolean r1 = r3.shouldAbsorb(r1, r2)
            if (r1 == 0) goto L39
            android.widget.EdgeEffect r1 = r3.mEdgeGlowBottom
            int r2 = -r4
            r1.onAbsorb(r2)
            goto L3f
        L39:
            int r1 = -r4
            r3.fling(r1)
            goto L3f
        L3e:
            r0 = 0
        L3f:
            return r0
    }

    private void endTouchDrag() {
            r1 = this;
            r0 = -1
            r1.mActivePointerId = r0
            r0 = 0
            r1.mIsBeingDragged = r0
            r1.recycleVelocityTracker()
            r1.stopNestedScroll(r0)
            android.widget.EdgeEffect r0 = r1.mEdgeGlowTop
            r0.onRelease()
            android.widget.EdgeEffect r0 = r1.mEdgeGlowBottom
            r0.onRelease()
            return
    }

    private android.view.View findFocusableViewInBounds(boolean r13, int r14, int r15) {
            r12 = this;
            r0 = 2
            java.util.ArrayList r0 = r12.getFocusables(r0)
            r1 = 0
            r2 = 0
            int r3 = r0.size()
            r4 = 0
        Lc:
            if (r4 >= r3) goto L54
            java.lang.Object r5 = r0.get(r4)
            android.view.View r5 = (android.view.View) r5
            int r6 = r5.getTop()
            int r7 = r5.getBottom()
            if (r14 >= r7) goto L51
            if (r6 >= r15) goto L51
            r8 = 0
            r9 = 1
            if (r14 >= r6) goto L28
            if (r7 >= r15) goto L28
            r10 = r9
            goto L29
        L28:
            r10 = r8
        L29:
            if (r1 != 0) goto L2e
            r1 = r5
            r2 = r10
            goto L51
        L2e:
            if (r13 == 0) goto L36
            int r11 = r1.getTop()
            if (r6 < r11) goto L3e
        L36:
            if (r13 != 0) goto L40
            int r11 = r1.getBottom()
            if (r7 <= r11) goto L40
        L3e:
            r8 = r9
            goto L41
        L40:
        L41:
            if (r2 == 0) goto L49
            if (r10 == 0) goto L51
            if (r8 == 0) goto L51
            r1 = r5
            goto L51
        L49:
            if (r10 == 0) goto L4e
            r1 = r5
            r2 = 1
            goto L51
        L4e:
            if (r8 == 0) goto L51
            r1 = r5
        L51:
            int r4 = r4 + 1
            goto Lc
        L54:
            return r1
    }

    private androidx.core.view.ScrollFeedbackProviderCompat getScrollFeedbackProvider() {
            r1 = this;
            androidx.core.view.ScrollFeedbackProviderCompat r0 = r1.mScrollFeedbackProvider
            if (r0 != 0) goto La
            androidx.core.view.ScrollFeedbackProviderCompat r0 = androidx.core.view.ScrollFeedbackProviderCompat.createProvider(r1)
            r1.mScrollFeedbackProvider = r0
        La:
            androidx.core.view.ScrollFeedbackProviderCompat r0 = r1.mScrollFeedbackProvider
            return r0
    }

    private float getSplineFlingDistance(int r10) {
            r9 = this;
            int r0 = java.lang.Math.abs(r10)
            float r0 = (float) r0
            r1 = 1051931443(0x3eb33333, float:0.35)
            float r0 = r0 * r1
            float r1 = r9.mPhysicalCoeff
            r2 = 1014350479(0x3c75c28f, float:0.015)
            float r1 = r1 * r2
            float r0 = r0 / r1
            double r0 = (double) r0
            double r0 = java.lang.Math.log(r0)
            float r3 = androidx.core.widget.NestedScrollView.DECELERATION_RATE
            double r3 = (double) r3
            r5 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r3 = r3 - r5
            float r5 = r9.mPhysicalCoeff
            float r5 = r5 * r2
            double r5 = (double) r5
            float r2 = androidx.core.widget.NestedScrollView.DECELERATION_RATE
            double r7 = (double) r2
            double r7 = r7 / r3
            double r7 = r7 * r0
            double r7 = java.lang.Math.exp(r7)
            double r5 = r5 * r7
            float r2 = (float) r5
            return r2
    }

    private boolean inChild(int r5, int r6) {
            r4 = this;
            int r0 = r4.getChildCount()
            r1 = 0
            if (r0 <= 0) goto L2d
            int r0 = r4.getScrollY()
            android.view.View r2 = r4.getChildAt(r1)
            int r3 = r2.getTop()
            int r3 = r3 - r0
            if (r6 < r3) goto L2b
            int r3 = r2.getBottom()
            int r3 = r3 - r0
            if (r6 >= r3) goto L2b
            int r3 = r2.getLeft()
            if (r5 < r3) goto L2b
            int r3 = r2.getRight()
            if (r5 >= r3) goto L2b
            r1 = 1
            goto L2c
        L2b:
        L2c:
            return r1
        L2d:
            return r1
    }

    private void initOrResetVelocityTracker() {
            r1 = this;
            android.view.VelocityTracker r0 = r1.mVelocityTracker
            if (r0 != 0) goto Lb
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r1.mVelocityTracker = r0
            goto L10
        Lb:
            android.view.VelocityTracker r0 = r1.mVelocityTracker
            r0.clear()
        L10:
            return
    }

    private void initScrollView() {
            r2 = this;
            android.widget.OverScroller r0 = new android.widget.OverScroller
            android.content.Context r1 = r2.getContext()
            r0.<init>(r1)
            r2.mScroller = r0
            r0 = 1
            r2.setFocusable(r0)
            r0 = 262144(0x40000, float:3.67342E-40)
            r2.setDescendantFocusability(r0)
            r0 = 0
            r2.setWillNotDraw(r0)
            android.content.Context r0 = r2.getContext()
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r0)
            int r1 = r0.getScaledTouchSlop()
            r2.mTouchSlop = r1
            int r1 = r0.getScaledMinimumFlingVelocity()
            r2.mMinimumVelocity = r1
            int r1 = r0.getScaledMaximumFlingVelocity()
            r2.mMaximumVelocity = r1
            return
    }

    private void initVelocityTrackerIfNotExists() {
            r1 = this;
            android.view.VelocityTracker r0 = r1.mVelocityTracker
            if (r0 != 0) goto La
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r1.mVelocityTracker = r0
        La:
            return
    }

    private void initializeTouchDrag(int r3, int r4) {
            r2 = this;
            r2.mLastMotionY = r3
            r2.mActivePointerId = r4
            r0 = 2
            r1 = 0
            r2.startNestedScroll(r0, r1)
            return
    }

    private boolean isOffScreen(android.view.View r3) {
            r2 = this;
            r0 = 0
            int r1 = r2.getHeight()
            boolean r0 = r2.isWithinDeltaOfScreen(r3, r0, r1)
            r0 = r0 ^ 1
            return r0
    }

    private static boolean isViewDescendantOf(android.view.View r3, android.view.View r4) {
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            android.view.ViewParent r1 = r3.getParent()
            boolean r2 = r1 instanceof android.view.ViewGroup
            if (r2 == 0) goto L16
            r2 = r1
            android.view.View r2 = (android.view.View) r2
            boolean r2 = isViewDescendantOf(r2, r4)
            if (r2 == 0) goto L16
            goto L17
        L16:
            r0 = 0
        L17:
            return r0
    }

    private boolean isWithinDeltaOfScreen(android.view.View r3, int r4, int r5) {
            r2 = this;
            android.graphics.Rect r0 = r2.mTempRect
            r3.getDrawingRect(r0)
            android.graphics.Rect r0 = r2.mTempRect
            r2.offsetDescendantRectToMyCoords(r3, r0)
            android.graphics.Rect r0 = r2.mTempRect
            int r0 = r0.bottom
            int r0 = r0 + r4
            int r1 = r2.getScrollY()
            if (r0 < r1) goto L23
            android.graphics.Rect r0 = r2.mTempRect
            int r0 = r0.top
            int r0 = r0 - r4
            int r1 = r2.getScrollY()
            int r1 = r1 + r5
            if (r0 > r1) goto L23
            r0 = 1
            goto L24
        L23:
            r0 = 0
        L24:
            return r0
    }

    private void onNestedScrollInternal(int r11, int r12, int[] r13) {
            r10 = this;
            int r0 = r10.getScrollY()
            r1 = 0
            r10.scrollBy(r1, r11)
            int r1 = r10.getScrollY()
            int r4 = r1 - r0
            if (r13 == 0) goto L16
            r1 = 1
            r2 = r13[r1]
            int r2 = r2 + r4
            r13[r1] = r2
        L16:
            int r6 = r11 - r4
            androidx.core.view.NestedScrollingChildHelper r2 = r10.mChildHelper
            r5 = 0
            r7 = 0
            r3 = 0
            r8 = r12
            r9 = r13
            r2.dispatchNestedScroll(r3, r4, r5, r6, r7, r8, r9)
            return
    }

    private void onSecondaryPointerUp(android.view.MotionEvent r5) {
            r4 = this;
            int r0 = r5.getActionIndex()
            int r1 = r5.getPointerId(r0)
            int r2 = r4.mActivePointerId
            if (r1 != r2) goto L27
            if (r0 != 0) goto L10
            r2 = 1
            goto L11
        L10:
            r2 = 0
        L11:
            float r3 = r5.getY(r2)
            int r3 = (int) r3
            r4.mLastMotionY = r3
            int r3 = r5.getPointerId(r2)
            r4.mActivePointerId = r3
            android.view.VelocityTracker r3 = r4.mVelocityTracker
            if (r3 == 0) goto L27
            android.view.VelocityTracker r3 = r4.mVelocityTracker
            r3.clear()
        L27:
            return
    }

    private void recycleVelocityTracker() {
            r1 = this;
            android.view.VelocityTracker r0 = r1.mVelocityTracker
            if (r0 == 0) goto Lc
            android.view.VelocityTracker r0 = r1.mVelocityTracker
            r0.recycle()
            r0 = 0
            r1.mVelocityTracker = r0
        Lc:
            return
    }

    private int releaseVerticalGlow(int r7, float r8) {
            r6 = this;
            r0 = 0
            int r1 = r6.getWidth()
            float r1 = (float) r1
            float r1 = r8 / r1
            float r2 = (float) r7
            int r3 = r6.getHeight()
            float r3 = (float) r3
            float r2 = r2 / r3
            android.widget.EdgeEffect r3 = r6.mEdgeGlowTop
            float r3 = androidx.core.widget.EdgeEffectCompat.getDistance(r3)
            r4 = 0
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 == 0) goto L32
            android.widget.EdgeEffect r3 = r6.mEdgeGlowTop
            float r5 = -r2
            float r3 = androidx.core.widget.EdgeEffectCompat.onPullDistance(r3, r5, r1)
            float r0 = -r3
            android.widget.EdgeEffect r3 = r6.mEdgeGlowTop
            float r3 = androidx.core.widget.EdgeEffectCompat.getDistance(r3)
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 != 0) goto L54
            android.widget.EdgeEffect r3 = r6.mEdgeGlowTop
            r3.onRelease()
            goto L54
        L32:
            android.widget.EdgeEffect r3 = r6.mEdgeGlowBottom
            float r3 = androidx.core.widget.EdgeEffectCompat.getDistance(r3)
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 == 0) goto L54
            android.widget.EdgeEffect r3 = r6.mEdgeGlowBottom
            r5 = 1065353216(0x3f800000, float:1.0)
            float r5 = r5 - r1
            float r0 = androidx.core.widget.EdgeEffectCompat.onPullDistance(r3, r2, r5)
            android.widget.EdgeEffect r3 = r6.mEdgeGlowBottom
            float r3 = androidx.core.widget.EdgeEffectCompat.getDistance(r3)
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 != 0) goto L54
            android.widget.EdgeEffect r3 = r6.mEdgeGlowBottom
            r3.onRelease()
        L54:
            int r3 = r6.getHeight()
            float r3 = (float) r3
            float r3 = r3 * r0
            int r3 = java.lang.Math.round(r3)
            if (r3 == 0) goto L63
            r6.invalidate()
        L63:
            return r3
    }

    private void runAnimatedScroll(boolean r3) {
            r2 = this;
            r0 = 1
            if (r3 == 0) goto L8
            r1 = 2
            r2.startNestedScroll(r1, r0)
            goto Lb
        L8:
            r2.stopNestedScroll(r0)
        Lb:
            int r0 = r2.getScrollY()
            r2.mLastScrollerY = r0
            r2.postInvalidateOnAnimation()
            return
    }

    private boolean scrollAndFocus(int r10, int r11, int r12) {
            r9 = this;
            r0 = 1
            int r1 = r9.getHeight()
            int r2 = r9.getScrollY()
            int r3 = r2 + r1
            r4 = 33
            r5 = 0
            r6 = 1
            if (r10 != r4) goto L13
            r4 = r6
            goto L14
        L13:
            r4 = r5
        L14:
            android.view.View r7 = r9.findFocusableViewInBounds(r4, r11, r12)
            if (r7 != 0) goto L1b
            r7 = r9
        L1b:
            if (r11 < r2) goto L21
            if (r12 > r3) goto L21
            r0 = 0
            goto L2b
        L21:
            if (r4 == 0) goto L26
            int r8 = r11 - r2
            goto L28
        L26:
            int r8 = r12 - r3
        L28:
            r9.scrollBy(r8, r5, r6, r6)
        L2b:
            android.view.View r5 = r9.findFocus()
            if (r7 == r5) goto L34
            r7.requestFocus(r10)
        L34:
            return r0
    }

    private int scrollBy(int r8, int r9, int r10, boolean r11) {
            r7 = this;
            r2 = -1
            r3 = 0
            r0 = r7
            r1 = r8
            r4 = r9
            r5 = r10
            r6 = r11
            int r8 = r0.scrollBy(r1, r2, r3, r4, r5, r6)
            return r8
    }

    private void scrollToChild(android.view.View r3) {
            r2 = this;
            android.graphics.Rect r0 = r2.mTempRect
            r3.getDrawingRect(r0)
            android.graphics.Rect r0 = r2.mTempRect
            r2.offsetDescendantRectToMyCoords(r3, r0)
            android.graphics.Rect r0 = r2.mTempRect
            int r0 = r2.computeScrollDeltaToGetChildRectOnScreen(r0)
            if (r0 == 0) goto L16
            r1 = 0
            r2.scrollBy(r1, r0)
        L16:
            return
    }

    private boolean scrollToChildRect(android.graphics.Rect r4, boolean r5) {
            r3 = this;
            int r0 = r3.computeScrollDeltaToGetChildRectOnScreen(r4)
            r1 = 0
            if (r0 == 0) goto L9
            r2 = 1
            goto La
        L9:
            r2 = r1
        La:
            if (r2 == 0) goto L15
            if (r5 == 0) goto L12
            r3.scrollBy(r1, r0)
            goto L15
        L12:
            r3.smoothScrollBy(r1, r0)
        L15:
            return r2
    }

    private boolean shouldAbsorb(android.widget.EdgeEffect r5, int r6) {
            r4 = this;
            r0 = 1
            if (r6 <= 0) goto L4
            return r0
        L4:
            float r1 = androidx.core.widget.EdgeEffectCompat.getDistance(r5)
            int r2 = r4.getHeight()
            float r2 = (float) r2
            float r1 = r1 * r2
            int r2 = -r6
            float r2 = r4.getSplineFlingDistance(r2)
            int r3 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r3 >= 0) goto L18
            goto L19
        L18:
            r0 = 0
        L19:
            return r0
    }

    private void smoothScrollBy(int r15, int r16, int r17, boolean r18) {
            r14 = this;
            int r0 = r14.getChildCount()
            if (r0 != 0) goto L7
            return
        L7:
            long r0 = android.view.animation.AnimationUtils.currentAnimationTimeMillis()
            long r2 = r14.mLastScroll
            long r0 = r0 - r2
            r2 = 250(0xfa, double:1.235E-321)
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 <= 0) goto L5f
            r2 = 0
            android.view.View r3 = r14.getChildAt(r2)
            android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r4 = (android.widget.FrameLayout.LayoutParams) r4
            int r5 = r3.getHeight()
            int r6 = r4.topMargin
            int r5 = r5 + r6
            int r6 = r4.bottomMargin
            int r5 = r5 + r6
            int r6 = r14.getHeight()
            int r7 = r14.getPaddingTop()
            int r6 = r6 - r7
            int r7 = r14.getPaddingBottom()
            int r6 = r6 - r7
            int r9 = r14.getScrollY()
            int r7 = r5 - r6
            int r13 = java.lang.Math.max(r2, r7)
            int r7 = r9 + r16
            int r7 = java.lang.Math.min(r7, r13)
            int r2 = java.lang.Math.max(r2, r7)
            int r11 = r2 - r9
            android.widget.OverScroller r7 = r14.mScroller
            int r8 = r14.getScrollX()
            r10 = 0
            r12 = r17
            r7.startScroll(r8, r9, r10, r11, r12)
            r2 = r18
            r14.runAnimatedScroll(r2)
            goto L71
        L5f:
            r2 = r18
            android.widget.OverScroller r3 = r14.mScroller
            boolean r3 = r3.isFinished()
            if (r3 != 0) goto L6c
            r14.abortAnimatedScroll()
        L6c:
            r14.scrollBy(r15, r16)
            r11 = r16
        L71:
            long r3 = android.view.animation.AnimationUtils.currentAnimationTimeMillis()
            r14.mLastScroll = r3
            return
    }

    private boolean stopGlowAnimations(android.view.MotionEvent r6) {
            r5 = this;
            r0 = 0
            android.widget.EdgeEffect r1 = r5.mEdgeGlowTop
            float r1 = androidx.core.widget.EdgeEffectCompat.getDistance(r1)
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 == 0) goto L1c
            android.widget.EdgeEffect r1 = r5.mEdgeGlowTop
            float r3 = r6.getX()
            int r4 = r5.getWidth()
            float r4 = (float) r4
            float r3 = r3 / r4
            androidx.core.widget.EdgeEffectCompat.onPullDistance(r1, r2, r3)
            r0 = 1
        L1c:
            android.widget.EdgeEffect r1 = r5.mEdgeGlowBottom
            float r1 = androidx.core.widget.EdgeEffectCompat.getDistance(r1)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 == 0) goto L39
            android.widget.EdgeEffect r1 = r5.mEdgeGlowBottom
            float r3 = r6.getX()
            int r4 = r5.getWidth()
            float r4 = (float) r4
            float r3 = r3 / r4
            r4 = 1065353216(0x3f800000, float:1.0)
            float r4 = r4 - r3
            androidx.core.widget.EdgeEffectCompat.onPullDistance(r1, r2, r4)
            r0 = 1
        L39:
            return r0
    }

    @Override // android.view.ViewGroup
    public void addView(android.view.View r3) {
            r2 = this;
            int r0 = r2.getChildCount()
            if (r0 > 0) goto La
            super.addView(r3)
            return
        La:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "ScrollView can host only one direct child"
            r0.<init>(r1)
            throw r0
    }

    @Override // android.view.ViewGroup
    public void addView(android.view.View r3, int r4) {
            r2 = this;
            int r0 = r2.getChildCount()
            if (r0 > 0) goto La
            super.addView(r3, r4)
            return
        La:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "ScrollView can host only one direct child"
            r0.<init>(r1)
            throw r0
    }

    @Override // android.view.ViewGroup
    public void addView(android.view.View r3, int r4, android.view.ViewGroup.LayoutParams r5) {
            r2 = this;
            int r0 = r2.getChildCount()
            if (r0 > 0) goto La
            super.addView(r3, r4, r5)
            return
        La:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "ScrollView can host only one direct child"
            r0.<init>(r1)
            throw r0
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(android.view.View r3, android.view.ViewGroup.LayoutParams r4) {
            r2 = this;
            int r0 = r2.getChildCount()
            if (r0 > 0) goto La
            super.addView(r3, r4)
            return
        La:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "ScrollView can host only one direct child"
            r0.<init>(r1)
            throw r0
    }

    public boolean arrowScroll(int r13) {
            r12 = this;
            android.view.View r0 = r12.findFocus()
            if (r0 != r12) goto L7
            r0 = 0
        L7:
            android.view.FocusFinder r1 = android.view.FocusFinder.getInstance()
            android.view.View r1 = r1.findNextFocus(r12, r0, r13)
            int r2 = r12.getMaxScrollAmount()
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L38
            int r5 = r12.getHeight()
            boolean r5 = r12.isWithinDeltaOfScreen(r1, r2, r5)
            if (r5 == 0) goto L38
            android.graphics.Rect r5 = r12.mTempRect
            r1.getDrawingRect(r5)
            android.graphics.Rect r5 = r12.mTempRect
            r12.offsetDescendantRectToMyCoords(r1, r5)
            android.graphics.Rect r5 = r12.mTempRect
            int r5 = r12.computeScrollDeltaToGetChildRectOnScreen(r5)
            r12.scrollBy(r5, r3, r4, r4)
            r1.requestFocus(r13)
            goto L82
        L38:
            r5 = r2
            r6 = 33
            r7 = 130(0x82, float:1.82E-43)
            if (r13 != r6) goto L4a
            int r6 = r12.getScrollY()
            if (r6 >= r5) goto L4a
            int r5 = r12.getScrollY()
            goto L77
        L4a:
            if (r13 != r7) goto L77
            int r6 = r12.getChildCount()
            if (r6 <= 0) goto L77
            android.view.View r6 = r12.getChildAt(r3)
            android.view.ViewGroup$LayoutParams r8 = r6.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r8 = (android.widget.FrameLayout.LayoutParams) r8
            int r9 = r6.getBottom()
            int r10 = r8.bottomMargin
            int r9 = r9 + r10
            int r10 = r12.getScrollY()
            int r11 = r12.getHeight()
            int r10 = r10 + r11
            int r11 = r12.getPaddingBottom()
            int r10 = r10 - r11
            int r11 = r9 - r10
            int r5 = java.lang.Math.min(r11, r2)
        L77:
            if (r5 != 0) goto L7a
            return r3
        L7a:
            if (r13 != r7) goto L7e
            r6 = r5
            goto L7f
        L7e:
            int r6 = -r5
        L7f:
            r12.scrollBy(r6, r3, r4, r4)
        L82:
            if (r0 == 0) goto L9f
            boolean r3 = r0.isFocused()
            if (r3 == 0) goto L9f
            boolean r3 = r12.isOffScreen(r0)
            if (r3 == 0) goto L9f
            int r3 = r12.getDescendantFocusability()
            r5 = 131072(0x20000, float:1.83671E-40)
            r12.setDescendantFocusability(r5)
            r12.requestFocus()
            r12.setDescendantFocusability(r3)
        L9f:
            return r4
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeHorizontalScrollExtent() {
            r1 = this;
            int r0 = super.computeHorizontalScrollExtent()
            return r0
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeHorizontalScrollOffset() {
            r1 = this;
            int r0 = super.computeHorizontalScrollOffset()
            return r0
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeHorizontalScrollRange() {
            r1 = this;
            int r0 = super.computeHorizontalScrollRange()
            return r0
    }

    @Override // android.view.View
    public void computeScroll() {
            r13 = this;
            android.widget.OverScroller r1 = r13.mScroller
            boolean r1 = r1.isFinished()
            if (r1 == 0) goto L9
            return
        L9:
            android.widget.OverScroller r1 = r13.mScroller
            r1.computeScrollOffset()
            android.widget.OverScroller r1 = r13.mScroller
            int r10 = r1.getCurrY()
            int r1 = r13.mLastScrollerY
            int r1 = r10 - r1
            int r2 = r13.consumeFlingInVerticalStretch(r1)
            r13.mLastScrollerY = r10
            int[] r1 = r13.mScrollConsumed
            r11 = 1
            r12 = 0
            r1[r11] = r12
            int[] r3 = r13.mScrollConsumed
            r4 = 0
            r5 = 1
            r1 = 0
            r0 = r13
            r0.dispatchNestedPreScroll(r1, r2, r3, r4, r5)
            int[] r1 = r13.mScrollConsumed
            r1 = r1[r11]
            int r2 = r2 - r1
            int r6 = r13.getScrollRange()
            int r1 = android.os.Build.VERSION.SDK_INT
            r3 = 35
            if (r1 < r3) goto L49
            android.widget.OverScroller r1 = r13.mScroller
            float r1 = r1.getCurrVelocity()
            float r1 = java.lang.Math.abs(r1)
            androidx.core.widget.NestedScrollView.Api35Impl.setFrameContentVelocity(r13, r1)
        L49:
            if (r2 == 0) goto L7c
            int r4 = r13.getScrollY()
            int r3 = r13.getScrollX()
            r8 = 0
            r9 = 0
            r1 = 0
            r5 = 0
            r7 = 0
            r0 = r13
            r0.overScrollByCompat(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r9 = r4
            r8 = r6
            int r1 = r13.getScrollY()
            int r1 = r1 - r9
            int r4 = r2 - r1
            int[] r2 = r13.mScrollConsumed
            r2[r11] = r12
            int[] r5 = r13.mScrollOffset
            r6 = 1
            int[] r7 = r13.mScrollConsumed
            r2 = r1
            r1 = 0
            r3 = 0
            r0.dispatchNestedScroll(r1, r2, r3, r4, r5, r6, r7)
            int[] r1 = r13.mScrollConsumed
            r1 = r1[r11]
            int r1 = r4 - r1
            r2 = r1
            goto L7d
        L7c:
            r8 = r6
        L7d:
            if (r2 == 0) goto Lba
            int r1 = r13.getOverScrollMode()
            if (r1 == 0) goto L89
            if (r1 != r11) goto L8a
            if (r8 <= 0) goto L8a
        L89:
            r12 = r11
        L8a:
            if (r12 == 0) goto Lb7
            if (r2 >= 0) goto La3
            android.widget.EdgeEffect r3 = r13.mEdgeGlowTop
            boolean r3 = r3.isFinished()
            if (r3 == 0) goto Lb7
            android.widget.EdgeEffect r3 = r13.mEdgeGlowTop
            android.widget.OverScroller r4 = r13.mScroller
            float r4 = r4.getCurrVelocity()
            int r4 = (int) r4
            r3.onAbsorb(r4)
            goto Lb7
        La3:
            android.widget.EdgeEffect r3 = r13.mEdgeGlowBottom
            boolean r3 = r3.isFinished()
            if (r3 == 0) goto Lb7
            android.widget.EdgeEffect r3 = r13.mEdgeGlowBottom
            android.widget.OverScroller r4 = r13.mScroller
            float r4 = r4.getCurrVelocity()
            int r4 = (int) r4
            r3.onAbsorb(r4)
        Lb7:
            r13.abortAnimatedScroll()
        Lba:
            android.widget.OverScroller r1 = r13.mScroller
            boolean r1 = r1.isFinished()
            if (r1 != 0) goto Lc6
            r13.postInvalidateOnAnimation()
            goto Lc9
        Lc6:
            r13.stopNestedScroll(r11)
        Lc9:
            return
    }

    protected int computeScrollDeltaToGetChildRectOnScreen(android.graphics.Rect r11) {
            r10 = this;
            int r0 = r10.getChildCount()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            int r0 = r10.getHeight()
            int r2 = r10.getScrollY()
            int r3 = r2 + r0
            r4 = r3
            int r5 = r10.getVerticalFadingEdgeLength()
            int r6 = r11.top
            if (r6 <= 0) goto L1c
            int r2 = r2 + r5
        L1c:
            android.view.View r1 = r10.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r6 = r1.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r6 = (android.widget.FrameLayout.LayoutParams) r6
            int r7 = r11.bottom
            int r8 = r1.getHeight()
            int r9 = r6.topMargin
            int r8 = r8 + r9
            int r9 = r6.bottomMargin
            int r8 = r8 + r9
            if (r7 >= r8) goto L35
            int r3 = r3 - r5
        L35:
            r7 = 0
            int r8 = r11.bottom
            if (r8 <= r3) goto L5b
            int r8 = r11.top
            if (r8 <= r2) goto L5b
            int r8 = r11.height()
            if (r8 <= r0) goto L49
            int r8 = r11.top
            int r8 = r8 - r2
            int r7 = r7 + r8
            goto L4d
        L49:
            int r8 = r11.bottom
            int r8 = r8 - r3
            int r7 = r7 + r8
        L4d:
            int r8 = r1.getBottom()
            int r9 = r6.bottomMargin
            int r8 = r8 + r9
            int r9 = r8 - r4
            int r7 = java.lang.Math.min(r7, r9)
        L5a:
            goto L7d
        L5b:
            int r8 = r11.top
            if (r8 >= r2) goto L5a
            int r8 = r11.bottom
            if (r8 >= r3) goto L5a
            int r8 = r11.height()
            if (r8 <= r0) goto L6f
            int r8 = r11.bottom
            int r8 = r3 - r8
            int r7 = r7 - r8
            goto L74
        L6f:
            int r8 = r11.top
            int r8 = r2 - r8
            int r7 = r7 - r8
        L74:
            int r8 = r10.getScrollY()
            int r8 = -r8
            int r7 = java.lang.Math.max(r7, r8)
        L7d:
            return r7
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeVerticalScrollExtent() {
            r1 = this;
            int r0 = super.computeVerticalScrollExtent()
            return r0
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeVerticalScrollOffset() {
            r2 = this;
            r0 = 0
            int r1 = super.computeVerticalScrollOffset()
            int r0 = java.lang.Math.max(r0, r1)
            return r0
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeVerticalScrollRange() {
            r8 = this;
            int r0 = r8.getChildCount()
            int r1 = r8.getHeight()
            int r2 = r8.getPaddingBottom()
            int r1 = r1 - r2
            int r2 = r8.getPaddingTop()
            int r1 = r1 - r2
            if (r0 != 0) goto L15
            return r1
        L15:
            r2 = 0
            android.view.View r3 = r8.getChildAt(r2)
            android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r4 = (android.widget.FrameLayout.LayoutParams) r4
            int r5 = r3.getBottom()
            int r6 = r4.bottomMargin
            int r5 = r5 + r6
            int r6 = r8.getScrollY()
            int r7 = r5 - r1
            int r2 = java.lang.Math.max(r2, r7)
            if (r6 >= 0) goto L35
            int r5 = r5 - r6
            goto L3a
        L35:
            if (r6 <= r2) goto L3a
            int r7 = r6 - r2
            int r5 = r5 + r7
        L3a:
            return r5
    }

    int consumeFlingInVerticalStretch(int r6) {
            r5 = this;
            int r0 = r5.getHeight()
            r1 = 1056964608(0x3f000000, float:0.5)
            r2 = 0
            r3 = 1082130432(0x40800000, float:4.0)
            if (r6 <= 0) goto L32
            android.widget.EdgeEffect r4 = r5.mEdgeGlowTop
            float r4 = androidx.core.widget.EdgeEffectCompat.getDistance(r4)
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 == 0) goto L32
            int r2 = -r6
            float r2 = (float) r2
            float r2 = r2 * r3
            float r4 = (float) r0
            float r2 = r2 / r4
            int r4 = -r0
            float r4 = (float) r4
            float r4 = r4 / r3
            android.widget.EdgeEffect r3 = r5.mEdgeGlowTop
            float r1 = androidx.core.widget.EdgeEffectCompat.onPullDistance(r3, r2, r1)
            float r4 = r4 * r1
            int r1 = java.lang.Math.round(r4)
            if (r1 == r6) goto L2f
            android.widget.EdgeEffect r3 = r5.mEdgeGlowTop
            r3.finish()
        L2f:
            int r3 = r6 - r1
            return r3
        L32:
            if (r6 >= 0) goto L59
            android.widget.EdgeEffect r4 = r5.mEdgeGlowBottom
            float r4 = androidx.core.widget.EdgeEffectCompat.getDistance(r4)
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 == 0) goto L59
            float r2 = (float) r6
            float r2 = r2 * r3
            float r4 = (float) r0
            float r2 = r2 / r4
            float r4 = (float) r0
            float r4 = r4 / r3
            android.widget.EdgeEffect r3 = r5.mEdgeGlowBottom
            float r1 = androidx.core.widget.EdgeEffectCompat.onPullDistance(r3, r2, r1)
            float r4 = r4 * r1
            int r1 = java.lang.Math.round(r4)
            if (r1 == r6) goto L56
            android.widget.EdgeEffect r3 = r5.mEdgeGlowBottom
            r3.finish()
        L56:
            int r3 = r6 - r1
            return r3
        L59:
            return r6
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(android.view.KeyEvent r2) {
            r1 = this;
            boolean r0 = super.dispatchKeyEvent(r2)
            if (r0 != 0) goto Lf
            boolean r0 = r1.executeKeyEvent(r2)
            if (r0 == 0) goto Ld
            goto Lf
        Ld:
            r0 = 0
            goto L10
        Lf:
            r0 = 1
        L10:
            return r0
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedFling(float r2, float r3, boolean r4) {
            r1 = this;
            androidx.core.view.NestedScrollingChildHelper r0 = r1.mChildHelper
            boolean r0 = r0.dispatchNestedFling(r2, r3, r4)
            return r0
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedPreFling(float r2, float r3) {
            r1 = this;
            androidx.core.view.NestedScrollingChildHelper r0 = r1.mChildHelper
            boolean r0 = r0.dispatchNestedPreFling(r2, r3)
            return r0
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedPreScroll(int r7, int r8, int[] r9, int[] r10) {
            r6 = this;
            r5 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            boolean r7 = r0.dispatchNestedPreScroll(r1, r2, r3, r4, r5)
            return r7
    }

    @Override // androidx.core.view.NestedScrollingChild2
    public boolean dispatchNestedPreScroll(int r7, int r8, int[] r9, int[] r10, int r11) {
            r6 = this;
            androidx.core.view.NestedScrollingChildHelper r0 = r6.mChildHelper
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            boolean r7 = r0.dispatchNestedPreScroll(r1, r2, r3, r4, r5)
            return r7
    }

    @Override // androidx.core.view.NestedScrollingChild3
    public void dispatchNestedScroll(int r9, int r10, int r11, int r12, int[] r13, int r14, int[] r15) {
            r8 = this;
            androidx.core.view.NestedScrollingChildHelper r0 = r8.mChildHelper
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            r7 = r15
            r0.dispatchNestedScroll(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedScroll(int r7, int r8, int r9, int r10, int[] r11) {
            r6 = this;
            androidx.core.view.NestedScrollingChildHelper r0 = r6.mChildHelper
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            boolean r7 = r0.dispatchNestedScroll(r1, r2, r3, r4, r5)
            return r7
    }

    @Override // androidx.core.view.NestedScrollingChild2
    public boolean dispatchNestedScroll(int r8, int r9, int r10, int r11, int[] r12, int r13) {
            r7 = this;
            androidx.core.view.NestedScrollingChildHelper r0 = r7.mChildHelper
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            boolean r8 = r0.dispatchNestedScroll(r1, r2, r3, r4, r5, r6)
            return r8
    }

    @Override // android.view.View
    public void draw(android.graphics.Canvas r10) {
            r9 = this;
            super.draw(r10)
            int r0 = r9.getScrollY()
            android.widget.EdgeEffect r1 = r9.mEdgeGlowTop
            boolean r1 = r1.isFinished()
            if (r1 != 0) goto L65
            int r1 = r10.save()
            int r2 = r9.getWidth()
            int r3 = r9.getHeight()
            r4 = 0
            r5 = 0
            int r5 = java.lang.Math.min(r5, r0)
            boolean r6 = androidx.core.widget.NestedScrollView.Api21Impl.getClipToPadding(r9)
            if (r6 == 0) goto L37
            int r6 = r9.getPaddingLeft()
            int r7 = r9.getPaddingRight()
            int r6 = r6 + r7
            int r2 = r2 - r6
            int r6 = r9.getPaddingLeft()
            int r4 = r4 + r6
        L37:
            boolean r6 = androidx.core.widget.NestedScrollView.Api21Impl.getClipToPadding(r9)
            if (r6 == 0) goto L4d
            int r6 = r9.getPaddingTop()
            int r7 = r9.getPaddingBottom()
            int r6 = r6 + r7
            int r3 = r3 - r6
            int r6 = r9.getPaddingTop()
            int r5 = r5 + r6
        L4d:
            float r6 = (float) r4
            float r7 = (float) r5
            r10.translate(r6, r7)
            android.widget.EdgeEffect r6 = r9.mEdgeGlowTop
            r6.setSize(r2, r3)
            android.widget.EdgeEffect r6 = r9.mEdgeGlowTop
            boolean r6 = r6.draw(r10)
            if (r6 == 0) goto L62
            r9.postInvalidateOnAnimation()
        L62:
            r10.restoreToCount(r1)
        L65:
            android.widget.EdgeEffect r1 = r9.mEdgeGlowBottom
            boolean r1 = r1.isFinished()
            if (r1 != 0) goto Ld0
            int r1 = r10.save()
            int r2 = r9.getWidth()
            int r3 = r9.getHeight()
            r4 = 0
            int r5 = r9.getScrollRange()
            int r5 = java.lang.Math.max(r5, r0)
            int r5 = r5 + r3
            boolean r6 = androidx.core.widget.NestedScrollView.Api21Impl.getClipToPadding(r9)
            if (r6 == 0) goto L99
            int r6 = r9.getPaddingLeft()
            int r7 = r9.getPaddingRight()
            int r6 = r6 + r7
            int r2 = r2 - r6
            int r6 = r9.getPaddingLeft()
            int r4 = r4 + r6
        L99:
            boolean r6 = androidx.core.widget.NestedScrollView.Api21Impl.getClipToPadding(r9)
            if (r6 == 0) goto Laf
            int r6 = r9.getPaddingTop()
            int r7 = r9.getPaddingBottom()
            int r6 = r6 + r7
            int r3 = r3 - r6
            int r6 = r9.getPaddingBottom()
            int r5 = r5 - r6
        Laf:
            int r6 = r4 - r2
            float r6 = (float) r6
            float r7 = (float) r5
            r10.translate(r6, r7)
            float r6 = (float) r2
            r7 = 0
            r8 = 1127481344(0x43340000, float:180.0)
            r10.rotate(r8, r6, r7)
            android.widget.EdgeEffect r6 = r9.mEdgeGlowBottom
            r6.setSize(r2, r3)
            android.widget.EdgeEffect r6 = r9.mEdgeGlowBottom
            boolean r6 = r6.draw(r10)
            if (r6 == 0) goto Lcd
            r9.postInvalidateOnAnimation()
        Lcd:
            r10.restoreToCount(r1)
        Ld0:
            return
    }

    public boolean executeKeyEvent(android.view.KeyEvent r5) {
            r4 = this;
            android.graphics.Rect r0 = r4.mTempRect
            r0.setEmpty()
            boolean r0 = r4.canScroll()
            r1 = 130(0x82, float:1.82E-43)
            if (r0 != 0) goto L39
            boolean r0 = r4.isFocused()
            r2 = 0
            if (r0 == 0) goto L38
            int r0 = r5.getKeyCode()
            r3 = 4
            if (r0 == r3) goto L38
            android.view.View r0 = r4.findFocus()
            if (r0 != r4) goto L22
            r0 = 0
        L22:
            android.view.FocusFinder r3 = android.view.FocusFinder.getInstance()
            android.view.View r3 = r3.findNextFocus(r4, r0, r1)
            if (r3 == 0) goto L36
            if (r3 == r4) goto L36
            boolean r1 = r3.requestFocus(r1)
            if (r1 == 0) goto L36
            r2 = 1
            goto L37
        L36:
        L37:
            return r2
        L38:
            return r2
        L39:
            r0 = 0
            int r2 = r5.getAction()
            if (r2 != 0) goto L87
            int r2 = r5.getKeyCode()
            r3 = 33
            switch(r2) {
                case 19: goto L77;
                case 20: goto L67;
                case 62: goto L5c;
                case 92: goto L57;
                case 93: goto L52;
                case 122: goto L4e;
                case 123: goto L4a;
                default: goto L49;
            }
        L49:
            goto L87
        L4a:
            r4.pageScroll(r1)
            goto L87
        L4e:
            r4.pageScroll(r3)
            goto L87
        L52:
            boolean r0 = r4.fullScroll(r1)
            goto L87
        L57:
            boolean r0 = r4.fullScroll(r3)
            goto L87
        L5c:
            boolean r2 = r5.isShiftPressed()
            if (r2 == 0) goto L63
            r1 = r3
        L63:
            r4.pageScroll(r1)
            goto L87
        L67:
            boolean r2 = r5.isAltPressed()
            if (r2 == 0) goto L72
            boolean r0 = r4.fullScroll(r1)
            goto L87
        L72:
            boolean r0 = r4.arrowScroll(r1)
            goto L87
        L77:
            boolean r1 = r5.isAltPressed()
            if (r1 == 0) goto L82
            boolean r0 = r4.fullScroll(r3)
            goto L87
        L82:
            boolean r0 = r4.arrowScroll(r3)
        L87:
            return r0
    }

    public void fling(int r13) {
            r12 = this;
            int r0 = r12.getChildCount()
            if (r0 <= 0) goto L36
            android.widget.OverScroller r1 = r12.mScroller
            int r2 = r12.getScrollX()
            int r3 = r12.getScrollY()
            r10 = 0
            r11 = 0
            r4 = 0
            r6 = 0
            r7 = 0
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            r9 = 2147483647(0x7fffffff, float:NaN)
            r5 = r13
            r1.fling(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r13 = 1
            r12.runAnimatedScroll(r13)
            int r13 = android.os.Build.VERSION.SDK_INT
            r0 = 35
            if (r13 < r0) goto L37
            android.widget.OverScroller r13 = r12.mScroller
            float r13 = r13.getCurrVelocity()
            float r13 = java.lang.Math.abs(r13)
            androidx.core.widget.NestedScrollView.Api35Impl.setFrameContentVelocity(r12, r13)
            goto L37
        L36:
            r5 = r13
        L37:
            return
    }

    public boolean fullScroll(int r9) {
            r8 = this;
            r0 = 130(0x82, float:1.82E-43)
            r1 = 0
            if (r9 != r0) goto L7
            r0 = 1
            goto L8
        L7:
            r0 = r1
        L8:
            int r2 = r8.getHeight()
            android.graphics.Rect r3 = r8.mTempRect
            r3.top = r1
            android.graphics.Rect r1 = r8.mTempRect
            r1.bottom = r2
            if (r0 == 0) goto L41
            int r1 = r8.getChildCount()
            if (r1 <= 0) goto L41
            int r3 = r1 + (-1)
            android.view.View r3 = r8.getChildAt(r3)
            android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r4 = (android.widget.FrameLayout.LayoutParams) r4
            android.graphics.Rect r5 = r8.mTempRect
            int r6 = r3.getBottom()
            int r7 = r4.bottomMargin
            int r6 = r6 + r7
            int r7 = r8.getPaddingBottom()
            int r6 = r6 + r7
            r5.bottom = r6
            android.graphics.Rect r5 = r8.mTempRect
            android.graphics.Rect r6 = r8.mTempRect
            int r6 = r6.bottom
            int r6 = r6 - r2
            r5.top = r6
        L41:
            android.graphics.Rect r1 = r8.mTempRect
            int r1 = r1.top
            android.graphics.Rect r3 = r8.mTempRect
            int r3 = r3.bottom
            boolean r1 = r8.scrollAndFocus(r9, r1, r3)
            return r1
    }

    @Override // android.view.View
    protected float getBottomFadingEdgeStrength() {
            r7 = this;
            int r0 = r7.getChildCount()
            if (r0 != 0) goto L8
            r0 = 0
            return r0
        L8:
            r0 = 0
            android.view.View r0 = r7.getChildAt(r0)
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r1 = (android.widget.FrameLayout.LayoutParams) r1
            int r2 = r7.getVerticalFadingEdgeLength()
            int r3 = r7.getHeight()
            int r4 = r7.getPaddingBottom()
            int r3 = r3 - r4
            int r4 = r0.getBottom()
            int r5 = r1.bottomMargin
            int r4 = r4 + r5
            int r5 = r7.getScrollY()
            int r4 = r4 - r5
            int r4 = r4 - r3
            if (r4 >= r2) goto L33
            float r5 = (float) r4
            float r6 = (float) r2
            float r5 = r5 / r6
            return r5
        L33:
            r5 = 1065353216(0x3f800000, float:1.0)
            return r5
    }

    public int getMaxScrollAmount() {
            r2 = this;
            int r0 = r2.getHeight()
            float r0 = (float) r0
            r1 = 1056964608(0x3f000000, float:0.5)
            float r0 = r0 * r1
            int r0 = (int) r0
            return r0
    }

    @Override // android.view.ViewGroup, androidx.core.view.NestedScrollingParent
    public int getNestedScrollAxes() {
            r1 = this;
            androidx.core.view.NestedScrollingParentHelper r0 = r1.mParentHelper
            int r0 = r0.getNestedScrollAxes()
            return r0
    }

    int getScrollRange() {
            r7 = this;
            r0 = 0
            int r1 = r7.getChildCount()
            if (r1 <= 0) goto L30
            r1 = 0
            android.view.View r2 = r7.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r3 = r2.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r3 = (android.widget.FrameLayout.LayoutParams) r3
            int r4 = r2.getHeight()
            int r5 = r3.topMargin
            int r4 = r4 + r5
            int r5 = r3.bottomMargin
            int r4 = r4 + r5
            int r5 = r7.getHeight()
            int r6 = r7.getPaddingTop()
            int r5 = r5 - r6
            int r6 = r7.getPaddingBottom()
            int r5 = r5 - r6
            int r6 = r4 - r5
            int r0 = java.lang.Math.max(r1, r6)
        L30:
            return r0
    }

    @Override // android.view.View
    protected float getTopFadingEdgeStrength() {
            r4 = this;
            int r0 = r4.getChildCount()
            if (r0 != 0) goto L8
            r0 = 0
            return r0
        L8:
            int r0 = r4.getVerticalFadingEdgeLength()
            int r1 = r4.getScrollY()
            if (r1 >= r0) goto L16
            float r2 = (float) r1
            float r3 = (float) r0
            float r2 = r2 / r3
            return r2
        L16:
            r2 = 1065353216(0x3f800000, float:1.0)
            return r2
    }

    float getVerticalScrollFactorCompat() {
            r5 = this;
            float r0 = r5.mVerticalScrollFactor
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L36
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            android.content.Context r1 = r5.getContext()
            android.content.res.Resources$Theme r2 = r1.getTheme()
            r3 = 16842829(0x101004d, float:2.3693774E-38)
            r4 = 1
            boolean r2 = r2.resolveAttribute(r3, r0, r4)
            if (r2 == 0) goto L2e
        L1f:
            android.content.res.Resources r2 = r1.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r0.getDimension(r2)
            r5.mVerticalScrollFactor = r2
            goto L36
        L2e:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "Expected theme to define listPreferredItemHeight."
            r2.<init>(r3)
            throw r2
        L36:
            float r0 = r5.mVerticalScrollFactor
            return r0
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean hasNestedScrollingParent() {
            r1 = this;
            r0 = 0
            boolean r0 = r1.hasNestedScrollingParent(r0)
            return r0
    }

    @Override // androidx.core.view.NestedScrollingChild2
    public boolean hasNestedScrollingParent(int r2) {
            r1 = this;
            androidx.core.view.NestedScrollingChildHelper r0 = r1.mChildHelper
            boolean r0 = r0.hasNestedScrollingParent(r2)
            return r0
    }

    public boolean isFillViewport() {
            r1 = this;
            boolean r0 = r1.mFillViewport
            return r0
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean isNestedScrollingEnabled() {
            r1 = this;
            androidx.core.view.NestedScrollingChildHelper r0 = r1.mChildHelper
            boolean r0 = r0.isNestedScrollingEnabled()
            return r0
    }

    public boolean isSmoothScrollingEnabled() {
            r1 = this;
            boolean r0 = r1.mSmoothScrollingEnabled
            return r0
    }

    @Override // android.view.ViewGroup
    protected void measureChild(android.view.View r4, int r5, int r6) {
            r3 = this;
            android.view.ViewGroup$LayoutParams r0 = r4.getLayoutParams()
            int r1 = r3.getPaddingLeft()
            int r2 = r3.getPaddingRight()
            int r1 = r1 + r2
            int r2 = r0.width
            int r1 = getChildMeasureSpec(r5, r1, r2)
            r2 = 0
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r2)
            r4.measure(r1, r2)
            return
    }

    @Override // android.view.ViewGroup
    protected void measureChildWithMargins(android.view.View r5, int r6, int r7, int r8, int r9) {
            r4 = this;
            android.view.ViewGroup$LayoutParams r0 = r5.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            int r1 = r4.getPaddingLeft()
            int r2 = r4.getPaddingRight()
            int r1 = r1 + r2
            int r2 = r0.leftMargin
            int r1 = r1 + r2
            int r2 = r0.rightMargin
            int r1 = r1 + r2
            int r1 = r1 + r7
            int r2 = r0.width
            int r1 = getChildMeasureSpec(r6, r1, r2)
            int r2 = r0.topMargin
            int r3 = r0.bottomMargin
            int r2 = r2 + r3
            r3 = 0
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r3)
            r5.measure(r1, r2)
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
            r1 = this;
            super.onAttachedToWindow()
            r0 = 0
            r1.mIsLaidOut = r0
            return
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(android.view.MotionEvent r10) {
            r9 = this;
            int r0 = r10.getAction()
            r1 = 8
            if (r0 != r1) goto L68
            boolean r0 = r9.mIsBeingDragged
            if (r0 != 0) goto L68
            r0 = 2
            boolean r1 = androidx.core.view.MotionEventCompat.isFromSource(r10, r0)
            if (r1 == 0) goto L23
            r0 = 9
            float r0 = r10.getAxisValue(r0)
            float r1 = r10.getX()
            int r1 = (int) r1
            r2 = 9
            r5 = r1
            r3 = r2
            goto L43
        L23:
            r1 = 4194304(0x400000, float:5.877472E-39)
            boolean r1 = androidx.core.view.MotionEventCompat.isFromSource(r10, r1)
            if (r1 == 0) goto L3e
            r1 = 26
            float r1 = r10.getAxisValue(r1)
            int r2 = r9.getWidth()
            int r0 = r2 / 2
            r2 = 26
            r5 = r0
            r0 = r1
            r3 = r2
            goto L43
        L3e:
            r0 = 0
            r1 = 0
            r2 = 0
            r5 = r1
            r3 = r2
        L43:
            r1 = 0
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 == 0) goto L65
            float r1 = r9.getVerticalScrollFactorCompat()
            float r1 = r1 * r0
            int r8 = (int) r1
            r1 = 8194(0x2002, float:1.1482E-41)
            boolean r7 = androidx.core.view.MotionEventCompat.isFromSource(r10, r1)
            int r2 = -r8
            r6 = 1
            r1 = r9
            r4 = r10
            r1.scrollBy(r2, r3, r4, r5, r6, r7)
            if (r3 == 0) goto L63
            androidx.core.view.DifferentialMotionFlingController r10 = r1.mDifferentialMotionFlingController
            r10.onMotionEvent(r4, r3)
        L63:
            r10 = 1
            return r10
        L65:
            r1 = r9
            r4 = r10
            goto L6a
        L68:
            r1 = r9
            r4 = r10
        L6a:
            r10 = 0
            return r10
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent r18) {
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r1.getAction()
            r3 = 1
            r4 = 2
            if (r2 != r4) goto L11
            boolean r5 = r0.mIsBeingDragged
            if (r5 == 0) goto L11
            return r3
        L11:
            r5 = r2 & 255(0xff, float:3.57E-43)
            r6 = -1
            r7 = 0
            switch(r5) {
                case 0: goto La1;
                case 1: goto L7c;
                case 2: goto L1f;
                case 3: goto L7c;
                case 4: goto L18;
                case 5: goto L18;
                case 6: goto L1a;
                default: goto L18;
            }
        L18:
            goto Lf2
        L1a:
            r17.onSecondaryPointerUp(r18)
            goto Lf2
        L1f:
            int r5 = r0.mActivePointerId
            if (r5 != r6) goto L25
            goto Lf2
        L25:
            int r8 = r1.findPointerIndex(r5)
            if (r8 != r6) goto L4b
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Invalid pointerId="
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r3 = r3.append(r5)
            java.lang.String r4 = " in onInterceptTouchEvent"
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "NestedScrollView"
            android.util.Log.e(r4, r3)
            goto Lf2
        L4b:
            float r6 = r1.getY(r8)
            int r6 = (int) r6
            int r9 = r0.mLastMotionY
            int r9 = r6 - r9
            int r9 = java.lang.Math.abs(r9)
            int r10 = r0.mTouchSlop
            if (r9 <= r10) goto Lf2
            int r10 = r0.getNestedScrollAxes()
            r4 = r4 & r10
            if (r4 != 0) goto Lf2
            r0.mIsBeingDragged = r3
            r0.mLastMotionY = r6
            r0.initVelocityTrackerIfNotExists()
            android.view.VelocityTracker r4 = r0.mVelocityTracker
            r4.addMovement(r1)
            r0.mNestedYOffset = r7
            android.view.ViewParent r4 = r0.getParent()
            if (r4 == 0) goto L7a
            r4.requestDisallowInterceptTouchEvent(r3)
        L7a:
            goto Lf2
        L7c:
            r0.mIsBeingDragged = r7
            r0.mActivePointerId = r6
            r0.recycleVelocityTracker()
            android.widget.OverScroller r10 = r0.mScroller
            int r11 = r0.getScrollX()
            int r12 = r0.getScrollY()
            r15 = 0
            int r16 = r0.getScrollRange()
            r13 = 0
            r14 = 0
            boolean r3 = r10.springBack(r11, r12, r13, r14, r15, r16)
            if (r3 == 0) goto L9d
            r0.postInvalidateOnAnimation()
        L9d:
            r0.stopNestedScroll(r7)
            goto Lf2
        La1:
            float r5 = r1.getY()
            int r5 = (int) r5
            float r6 = r1.getX()
            int r6 = (int) r6
            boolean r6 = r0.inChild(r6, r5)
            if (r6 != 0) goto Lc7
            boolean r4 = r17.stopGlowAnimations(r18)
            if (r4 != 0) goto Lc1
            android.widget.OverScroller r4 = r0.mScroller
            boolean r4 = r4.isFinished()
            if (r4 != 0) goto Lc0
            goto Lc1
        Lc0:
            r3 = r7
        Lc1:
            r0.mIsBeingDragged = r3
            r0.recycleVelocityTracker()
            goto Lf2
        Lc7:
            r0.mLastMotionY = r5
            int r6 = r1.getPointerId(r7)
            r0.mActivePointerId = r6
            r0.initOrResetVelocityTracker()
            android.view.VelocityTracker r6 = r0.mVelocityTracker
            r6.addMovement(r1)
            android.widget.OverScroller r6 = r0.mScroller
            r6.computeScrollOffset()
            boolean r6 = r17.stopGlowAnimations(r18)
            if (r6 != 0) goto Lec
            android.widget.OverScroller r6 = r0.mScroller
            boolean r6 = r6.isFinished()
            if (r6 != 0) goto Leb
            goto Lec
        Leb:
            r3 = r7
        Lec:
            r0.mIsBeingDragged = r3
            r0.startNestedScroll(r4, r7)
        Lf2:
            boolean r3 = r0.mIsBeingDragged
            return r3
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean r7, int r8, int r9, int r10, int r11) {
            r6 = this;
            super.onLayout(r7, r8, r9, r10, r11)
            r0 = r11
            r11 = r10
            r10 = r9
            r9 = r8
            r8 = r7
            r7 = r6
            r1 = 0
            r7.mIsLayoutDirty = r1
            android.view.View r2 = r7.mChildToScrollTo
            if (r2 == 0) goto L1d
            android.view.View r2 = r7.mChildToScrollTo
            boolean r2 = isViewDescendantOf(r2, r6)
            if (r2 == 0) goto L1d
            android.view.View r2 = r7.mChildToScrollTo
            r6.scrollToChild(r2)
        L1d:
            r2 = 0
            r7.mChildToScrollTo = r2
            boolean r3 = r7.mIsLaidOut
            if (r3 != 0) goto L6e
            androidx.core.widget.NestedScrollView$SavedState r3 = r7.mSavedState
            if (r3 == 0) goto L35
            int r3 = r6.getScrollX()
            androidx.core.widget.NestedScrollView$SavedState r4 = r7.mSavedState
            int r4 = r4.scrollPosition
            r6.scrollTo(r3, r4)
            r7.mSavedState = r2
        L35:
            r2 = 0
            int r3 = r6.getChildCount()
            if (r3 <= 0) goto L51
            android.view.View r1 = r6.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r3 = r1.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r3 = (android.widget.FrameLayout.LayoutParams) r3
            int r4 = r1.getMeasuredHeight()
            int r5 = r3.topMargin
            int r4 = r4 + r5
            int r5 = r3.bottomMargin
            int r2 = r4 + r5
        L51:
            int r1 = r0 - r10
            int r3 = r6.getPaddingTop()
            int r1 = r1 - r3
            int r3 = r6.getPaddingBottom()
            int r1 = r1 - r3
            int r3 = r6.getScrollY()
            int r4 = clamp(r3, r1, r2)
            if (r4 == r3) goto L6e
            int r5 = r6.getScrollX()
            r6.scrollTo(r5, r4)
        L6e:
            int r1 = r6.getScrollX()
            int r2 = r6.getScrollY()
            r6.scrollTo(r1, r2)
            r1 = 1
            r7.mIsLaidOut = r1
            return
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int r8, int r9) {
            r7 = this;
            super.onMeasure(r8, r9)
            boolean r0 = r7.mFillViewport
            if (r0 != 0) goto L8
            return
        L8:
            int r0 = android.view.View.MeasureSpec.getMode(r9)
            if (r0 != 0) goto Lf
            return
        Lf:
            int r1 = r7.getChildCount()
            if (r1 <= 0) goto L5a
            r1 = 0
            android.view.View r1 = r7.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r2 = r1.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r2 = (android.widget.FrameLayout.LayoutParams) r2
            int r3 = r1.getMeasuredHeight()
            int r4 = r7.getMeasuredHeight()
            int r5 = r7.getPaddingTop()
            int r4 = r4 - r5
            int r5 = r7.getPaddingBottom()
            int r4 = r4 - r5
            int r5 = r2.topMargin
            int r4 = r4 - r5
            int r5 = r2.bottomMargin
            int r4 = r4 - r5
            if (r3 >= r4) goto L5a
        L3b:
            int r5 = r7.getPaddingLeft()
            int r6 = r7.getPaddingRight()
            int r5 = r5 + r6
            int r6 = r2.leftMargin
            int r5 = r5 + r6
            int r6 = r2.rightMargin
            int r5 = r5 + r6
            int r6 = r2.width
            int r5 = getChildMeasureSpec(r8, r5, r6)
            r6 = 1073741824(0x40000000, float:2.0)
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r6)
            r1.measure(r5, r6)
        L5a:
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onNestedFling(android.view.View r3, float r4, float r5, boolean r6) {
            r2 = this;
            if (r6 != 0) goto Lc
            r0 = 0
            r1 = 1
            r2.dispatchNestedFling(r0, r5, r1)
            int r0 = (int) r5
            r2.fling(r0)
            return r1
        Lc:
            r0 = 0
            return r0
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onNestedPreFling(android.view.View r2, float r3, float r4) {
            r1 = this;
            boolean r0 = r1.dispatchNestedPreFling(r3, r4)
            return r0
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onNestedPreScroll(android.view.View r7, int r8, int r9, int[] r10) {
            r6 = this;
            r5 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r0.onNestedPreScroll(r1, r2, r3, r4, r5)
            return
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedPreScroll(android.view.View r7, int r8, int r9, int[] r10, int r11) {
            r6 = this;
            r4 = 0
            r0 = r6
            r1 = r8
            r2 = r9
            r3 = r10
            r5 = r11
            r0.dispatchNestedPreScroll(r1, r2, r3, r4, r5)
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onNestedScroll(android.view.View r3, int r4, int r5, int r6, int r7) {
            r2 = this;
            r0 = 0
            r1 = 0
            r2.onNestedScrollInternal(r7, r0, r1)
            return
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedScroll(android.view.View r2, int r3, int r4, int r5, int r6, int r7) {
            r1 = this;
            r0 = 0
            r1.onNestedScrollInternal(r6, r7, r0)
            return
    }

    @Override // androidx.core.view.NestedScrollingParent3
    public void onNestedScroll(android.view.View r1, int r2, int r3, int r4, int r5, int r6, int[] r7) {
            r0 = this;
            r0.onNestedScrollInternal(r5, r6, r7)
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onNestedScrollAccepted(android.view.View r2, android.view.View r3, int r4) {
            r1 = this;
            r0 = 0
            r1.onNestedScrollAccepted(r2, r3, r4, r0)
            return
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedScrollAccepted(android.view.View r2, android.view.View r3, int r4, int r5) {
            r1 = this;
            androidx.core.view.NestedScrollingParentHelper r0 = r1.mParentHelper
            r0.onNestedScrollAccepted(r2, r3, r4, r5)
            r0 = 2
            r1.startNestedScroll(r0, r5)
            return
    }

    @Override // android.view.View
    protected void onOverScrolled(int r1, int r2, boolean r3, boolean r4) {
            r0 = this;
            super.scrollTo(r1, r2)
            return
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int r4, android.graphics.Rect r5) {
            r3 = this;
            r0 = 2
            if (r4 != r0) goto L6
            r4 = 130(0x82, float:1.82E-43)
            goto Lb
        L6:
            r0 = 1
            if (r4 != r0) goto Lb
            r4 = 33
        Lb:
            if (r5 != 0) goto L17
            android.view.FocusFinder r0 = android.view.FocusFinder.getInstance()
            r1 = 0
            android.view.View r0 = r0.findNextFocus(r3, r1, r4)
            goto L1f
        L17:
            android.view.FocusFinder r0 = android.view.FocusFinder.getInstance()
            android.view.View r0 = r0.findNextFocusFromRect(r3, r5, r4)
        L1f:
            r1 = 0
            if (r0 != 0) goto L24
            return r1
        L24:
            boolean r2 = r3.isOffScreen(r0)
            if (r2 == 0) goto L2b
            return r1
        L2b:
            boolean r1 = r0.requestFocus(r4, r5)
            return r1
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(android.os.Parcelable r3) {
            r2 = this;
            boolean r0 = r3 instanceof androidx.core.widget.NestedScrollView.SavedState
            if (r0 != 0) goto L8
            super.onRestoreInstanceState(r3)
            return
        L8:
            r0 = r3
            androidx.core.widget.NestedScrollView$SavedState r0 = (androidx.core.widget.NestedScrollView.SavedState) r0
            android.os.Parcelable r1 = r0.getSuperState()
            super.onRestoreInstanceState(r1)
            r2.mSavedState = r0
            r2.requestLayout()
            return
    }

    @Override // android.view.View
    protected android.os.Parcelable onSaveInstanceState() {
            r3 = this;
            android.os.Parcelable r0 = super.onSaveInstanceState()
            androidx.core.widget.NestedScrollView$SavedState r1 = new androidx.core.widget.NestedScrollView$SavedState
            r1.<init>(r0)
            int r2 = r3.getScrollY()
            r1.scrollPosition = r2
            return r1
    }

    @Override // android.view.View
    protected void onScrollChanged(int r8, int r9, int r10, int r11) {
            r7 = this;
            super.onScrollChanged(r8, r9, r10, r11)
            androidx.core.widget.NestedScrollView$OnScrollChangeListener r0 = r7.mOnScrollChangeListener
            if (r0 == 0) goto L12
            androidx.core.widget.NestedScrollView$OnScrollChangeListener r1 = r7.mOnScrollChangeListener
            r2 = r7
            r3 = r8
            r4 = r9
            r5 = r10
            r6 = r11
            r1.onScrollChange(r2, r3, r4, r5, r6)
            goto L16
        L12:
            r3 = r8
            r4 = r9
            r5 = r10
            r6 = r11
        L16:
            return
    }

    @Override // android.view.View
    protected void onSizeChanged(int r3, int r4, int r5, int r6) {
            r2 = this;
            super.onSizeChanged(r3, r4, r5, r6)
            android.view.View r0 = r2.findFocus()
            if (r0 == 0) goto L27
            if (r2 != r0) goto Lc
            goto L27
        Lc:
            r1 = 0
            boolean r1 = r2.isWithinDeltaOfScreen(r0, r1, r6)
            if (r1 == 0) goto L26
            android.graphics.Rect r1 = r2.mTempRect
            r0.getDrawingRect(r1)
            android.graphics.Rect r1 = r2.mTempRect
            r2.offsetDescendantRectToMyCoords(r0, r1)
            android.graphics.Rect r1 = r2.mTempRect
            int r1 = r2.computeScrollDeltaToGetChildRectOnScreen(r1)
            r2.doScrollY(r1)
        L26:
            return
        L27:
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onStartNestedScroll(android.view.View r2, android.view.View r3, int r4) {
            r1 = this;
            r0 = 0
            boolean r0 = r1.onStartNestedScroll(r2, r3, r4, r0)
            return r0
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public boolean onStartNestedScroll(android.view.View r2, android.view.View r3, int r4, int r5) {
            r1 = this;
            r0 = r4 & 2
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onStopNestedScroll(android.view.View r2) {
            r1 = this;
            r0 = 0
            r1.onStopNestedScroll(r2, r0)
            return
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onStopNestedScroll(android.view.View r2, int r3) {
            r1 = this;
            androidx.core.view.NestedScrollingParentHelper r0 = r1.mParentHelper
            r0.onStopNestedScroll(r2, r3)
            r1.stopNestedScroll(r3)
            return
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent r18) {
            r17 = this;
            r0 = r17
            r3 = r18
            r0.initVelocityTrackerIfNotExists()
            int r7 = r3.getActionMasked()
            r1 = 0
            if (r7 != 0) goto L10
            r0.mNestedYOffset = r1
        L10:
            android.view.MotionEvent r8 = android.view.MotionEvent.obtain(r3)
            int r2 = r0.mNestedYOffset
            float r2 = (float) r2
            r4 = 0
            r8.offsetLocation(r4, r2)
            r9 = 1
            switch(r7) {
                case 0: goto L136;
                case 1: goto Le7;
                case 2: goto L6f;
                case 3: goto L46;
                case 4: goto L1f;
                case 5: goto L33;
                case 6: goto L21;
                default: goto L1f;
            }
        L1f:
            goto L163
        L21:
            r17.onSecondaryPointerUp(r18)
            int r1 = r0.mActivePointerId
            int r1 = r3.findPointerIndex(r1)
            float r1 = r3.getY(r1)
            int r1 = (int) r1
            r0.mLastMotionY = r1
            goto L163
        L33:
            int r1 = r3.getActionIndex()
            float r2 = r3.getY(r1)
            int r2 = (int) r2
            r0.mLastMotionY = r2
            int r2 = r3.getPointerId(r1)
            r0.mActivePointerId = r2
            goto L163
        L46:
            boolean r1 = r0.mIsBeingDragged
            if (r1 == 0) goto L6a
            int r1 = r0.getChildCount()
            if (r1 <= 0) goto L6a
            android.widget.OverScroller r10 = r0.mScroller
            int r11 = r0.getScrollX()
            int r12 = r0.getScrollY()
            int r16 = r0.getScrollRange()
            r13 = 0
            r14 = 0
            r15 = 0
            boolean r1 = r10.springBack(r11, r12, r13, r14, r15, r16)
            if (r1 == 0) goto L6a
            r0.postInvalidateOnAnimation()
        L6a:
            r0.endTouchDrag()
            goto L163
        L6f:
            int r1 = r0.mActivePointerId
            int r10 = r3.findPointerIndex(r1)
            r1 = -1
            if (r10 != r1) goto L9a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Invalid pointerId="
            java.lang.StringBuilder r1 = r1.append(r2)
            int r2 = r0.mActivePointerId
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " in onTouchEvent"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "NestedScrollView"
            android.util.Log.e(r2, r1)
            goto L163
        L9a:
            float r1 = r3.getY(r10)
            int r11 = (int) r1
            int r1 = r0.mLastMotionY
            int r1 = r1 - r11
            float r2 = r3.getX(r10)
            int r2 = r0.releaseVerticalGlow(r1, r2)
            int r1 = r1 - r2
            boolean r2 = r0.mIsBeingDragged
            if (r2 != 0) goto Lcb
            int r2 = java.lang.Math.abs(r1)
            int r4 = r0.mTouchSlop
            if (r2 <= r4) goto Lcb
            android.view.ViewParent r2 = r0.getParent()
            if (r2 == 0) goto Lc0
            r2.requestDisallowInterceptTouchEvent(r9)
        Lc0:
            r0.mIsBeingDragged = r9
            if (r1 <= 0) goto Lc8
            int r4 = r0.mTouchSlop
            int r1 = r1 - r4
            goto Lcb
        Lc8:
            int r4 = r0.mTouchSlop
            int r1 = r1 + r4
        Lcb:
            boolean r2 = r0.mIsBeingDragged
            if (r2 == 0) goto L163
            float r2 = r3.getX(r10)
            int r4 = (int) r2
            r2 = 1
            r5 = 0
            r6 = 0
            int r2 = r0.scrollBy(r1, r2, r3, r4, r5, r6)
            int r5 = r11 - r2
            r0.mLastMotionY = r5
            int r5 = r0.mNestedYOffset
            int r5 = r5 + r2
            r0.mNestedYOffset = r5
            goto L163
        Le7:
            android.view.VelocityTracker r1 = r0.mVelocityTracker
            int r2 = r0.mMaximumVelocity
            float r2 = (float) r2
            r5 = 1000(0x3e8, float:1.401E-42)
            r1.computeCurrentVelocity(r5, r2)
            int r2 = r0.mActivePointerId
            float r2 = r1.getYVelocity(r2)
            int r2 = (int) r2
            int r5 = java.lang.Math.abs(r2)
            int r6 = r0.mMinimumVelocity
            if (r5 < r6) goto L118
            boolean r5 = r0.edgeEffectFling(r2)
            if (r5 != 0) goto L132
            int r5 = -r2
            float r5 = (float) r5
            boolean r5 = r0.dispatchNestedPreFling(r4, r5)
            if (r5 != 0) goto L132
            int r5 = -r2
            float r5 = (float) r5
            r0.dispatchNestedFling(r4, r5, r9)
            int r4 = -r2
            r0.fling(r4)
            goto L132
        L118:
            android.widget.OverScroller r10 = r0.mScroller
            int r11 = r0.getScrollX()
            int r12 = r0.getScrollY()
            int r16 = r0.getScrollRange()
            r13 = 0
            r14 = 0
            r15 = 0
            boolean r4 = r10.springBack(r11, r12, r13, r14, r15, r16)
            if (r4 == 0) goto L132
            r0.postInvalidateOnAnimation()
        L132:
            r0.endTouchDrag()
            goto L163
        L136:
            int r2 = r0.getChildCount()
            if (r2 != 0) goto L13d
            return r1
        L13d:
            boolean r2 = r0.mIsBeingDragged
            if (r2 == 0) goto L14a
            android.view.ViewParent r2 = r0.getParent()
            if (r2 == 0) goto L14a
            r2.requestDisallowInterceptTouchEvent(r9)
        L14a:
            android.widget.OverScroller r2 = r0.mScroller
            boolean r2 = r2.isFinished()
            if (r2 != 0) goto L155
            r0.abortAnimatedScroll()
        L155:
            float r2 = r3.getY()
            int r2 = (int) r2
            int r1 = r3.getPointerId(r1)
            r0.initializeTouchDrag(r2, r1)
        L163:
            android.view.VelocityTracker r1 = r0.mVelocityTracker
            if (r1 == 0) goto L16c
            android.view.VelocityTracker r1 = r0.mVelocityTracker
            r1.addMovement(r8)
        L16c:
            r8.recycle()
            return r9
    }

    boolean overScrollByCompat(int r25, int r26, int r27, int r28, int r29, int r30, int r31, int r32, boolean r33) {
            r24 = this;
            r0 = r24
            int r1 = r0.getOverScrollMode()
            int r2 = r0.computeHorizontalScrollRange()
            int r3 = r0.computeHorizontalScrollExtent()
            r5 = 1
            if (r2 <= r3) goto L14
            r2 = r5
            goto L15
        L14:
            r2 = 0
        L15:
            int r3 = r0.computeVerticalScrollRange()
            int r6 = r0.computeVerticalScrollExtent()
            if (r3 <= r6) goto L22
            r3 = r5
            goto L23
        L22:
            r3 = 0
        L23:
            if (r1 == 0) goto L2c
            if (r1 != r5) goto L2a
            if (r2 == 0) goto L2a
            goto L2c
        L2a:
            r6 = 0
            goto L2d
        L2c:
            r6 = r5
        L2d:
            if (r1 == 0) goto L36
            if (r1 != r5) goto L34
            if (r3 == 0) goto L34
            goto L36
        L34:
            r7 = 0
            goto L37
        L36:
            r7 = r5
        L37:
            int r8 = r27 + r25
            if (r6 != 0) goto L3d
            r9 = 0
            goto L3f
        L3d:
            r9 = r31
        L3f:
            int r10 = r28 + r26
            if (r7 != 0) goto L45
            r11 = 0
            goto L47
        L45:
            r11 = r32
        L47:
            int r12 = -r9
            int r13 = r9 + r29
            int r14 = -r11
            int r15 = r11 + r30
            r16 = 0
            if (r8 <= r13) goto L59
            r8 = r13
            r16 = 1
            r18 = r8
            r8 = r16
            goto L67
        L59:
            if (r8 >= r12) goto L63
            r8 = r12
            r16 = 1
            r18 = r8
            r8 = r16
            goto L67
        L63:
            r18 = r8
            r8 = r16
        L67:
            r16 = 0
            if (r10 <= r15) goto L73
            r10 = r15
            r16 = 1
            r19 = r10
            r10 = r16
            goto L81
        L73:
            if (r10 >= r14) goto L7d
            r10 = r14
            r16 = 1
            r19 = r10
            r10 = r16
            goto L81
        L7d:
            r19 = r10
            r10 = r16
        L81:
            if (r10 == 0) goto L9f
            boolean r16 = r0.hasNestedScrollingParent(r5)
            if (r16 != 0) goto L9f
            android.widget.OverScroller r4 = r0.mScroller
            r22 = 0
            int r23 = r0.getScrollRange()
            r20 = 0
            r21 = 0
            r17 = r4
            r17.springBack(r18, r19, r20, r21, r22, r23)
            r4 = r18
            r5 = r19
            goto La3
        L9f:
            r4 = r18
            r5 = r19
        La3:
            r0.onOverScrolled(r4, r5, r8, r10)
            if (r8 != 0) goto Lae
            if (r10 == 0) goto Lab
            goto Lae
        Lab:
            r16 = 0
            goto Lb0
        Lae:
            r16 = 1
        Lb0:
            return r16
    }

    public boolean pageScroll(int r9) {
            r8 = this;
            r0 = 130(0x82, float:1.82E-43)
            r1 = 0
            if (r9 != r0) goto L7
            r0 = 1
            goto L8
        L7:
            r0 = r1
        L8:
            int r2 = r8.getHeight()
            if (r0 == 0) goto L43
            android.graphics.Rect r1 = r8.mTempRect
            int r3 = r8.getScrollY()
            int r3 = r3 + r2
            r1.top = r3
            int r1 = r8.getChildCount()
            if (r1 <= 0) goto L42
            int r3 = r1 + (-1)
            android.view.View r3 = r8.getChildAt(r3)
            android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r4 = (android.widget.FrameLayout.LayoutParams) r4
            int r5 = r3.getBottom()
            int r6 = r4.bottomMargin
            int r5 = r5 + r6
            int r6 = r8.getPaddingBottom()
            int r5 = r5 + r6
            android.graphics.Rect r6 = r8.mTempRect
            int r6 = r6.top
            int r6 = r6 + r2
            if (r6 <= r5) goto L42
            android.graphics.Rect r6 = r8.mTempRect
            int r7 = r5 - r2
            r6.top = r7
        L42:
            goto L56
        L43:
            android.graphics.Rect r3 = r8.mTempRect
            int r4 = r8.getScrollY()
            int r4 = r4 - r2
            r3.top = r4
            android.graphics.Rect r3 = r8.mTempRect
            int r3 = r3.top
            if (r3 >= 0) goto L56
            android.graphics.Rect r3 = r8.mTempRect
            r3.top = r1
        L56:
            android.graphics.Rect r1 = r8.mTempRect
            android.graphics.Rect r3 = r8.mTempRect
            int r3 = r3.top
            int r3 = r3 + r2
            r1.bottom = r3
            android.graphics.Rect r1 = r8.mTempRect
            int r1 = r1.top
            android.graphics.Rect r3 = r8.mTempRect
            int r3 = r3.bottom
            boolean r1 = r8.scrollAndFocus(r9, r1, r3)
            return r1
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(android.view.View r2, android.view.View r3) {
            r1 = this;
            boolean r0 = r1.mIsLayoutDirty
            if (r0 != 0) goto L8
            r1.scrollToChild(r3)
            goto La
        L8:
            r1.mChildToScrollTo = r3
        La:
            super.requestChildFocus(r2, r3)
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(android.view.View r4, android.graphics.Rect r5, boolean r6) {
            r3 = this;
            int r0 = r4.getLeft()
            int r1 = r4.getScrollX()
            int r0 = r0 - r1
            int r1 = r4.getTop()
            int r2 = r4.getScrollY()
            int r1 = r1 - r2
            r5.offset(r0, r1)
            boolean r0 = r3.scrollToChildRect(r5, r6)
            return r0
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean r1) {
            r0 = this;
            if (r1 == 0) goto L5
            r0.recycleVelocityTracker()
        L5:
            super.requestDisallowInterceptTouchEvent(r1)
            return
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
            r1 = this;
            r0 = 1
            r1.mIsLayoutDirty = r0
            super.requestLayout()
            return
    }

    int scrollBy(int r20, int r21, android.view.MotionEvent r22, int r23, int r24, boolean r25) {
            r19 = this;
            r0 = r19
            r10 = r21
            r11 = r23
            r5 = r24
            r6 = 0
            r12 = 1
            if (r5 != r12) goto L10
            r1 = 2
            r0.startNestedScroll(r1, r5)
        L10:
            int[] r3 = r0.mScrollConsumed
            int[] r4 = r0.mScrollOffset
            r1 = 0
            r2 = r20
            boolean r1 = r0.dispatchNestedPreScroll(r1, r2, r3, r4, r5)
            r13 = r5
            if (r1 == 0) goto L2c
            int[] r1 = r0.mScrollConsumed
            r1 = r1[r12]
            int r1 = r20 - r1
            int[] r2 = r0.mScrollOffset
            r2 = r2[r12]
            int r6 = r6 + r2
            r2 = r1
            r14 = r6
            goto L2f
        L2c:
            r2 = r20
            r14 = r6
        L2f:
            int r4 = r0.getScrollY()
            int r6 = r0.getScrollRange()
            boolean r1 = r0.canOverScroll()
            r15 = 0
            if (r1 == 0) goto L42
            if (r25 != 0) goto L42
            r1 = r12
            goto L43
        L42:
            r1 = r15
        L43:
            r16 = r1
            r1 = 0
            r3 = 0
            r5 = 0
            r7 = 0
            r8 = 0
            r9 = 1
            boolean r1 = r0.overScrollByCompat(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r17 = r2
            r8 = r4
            r9 = r6
            if (r1 == 0) goto L5e
            boolean r1 = r0.hasNestedScrollingParent(r13)
            if (r1 != 0) goto L5e
            r1 = r12
            goto L5f
        L5e:
            r1 = r15
        L5f:
            r18 = r1
            int r1 = r0.getScrollY()
            int r2 = r1 - r8
            if (r22 == 0) goto L7a
            if (r2 == 0) goto L7a
            androidx.core.view.ScrollFeedbackProviderCompat r1 = r0.getScrollFeedbackProvider()
            int r3 = r22.getDeviceId()
            int r4 = r22.getSource()
            r1.onScrollProgress(r3, r4, r10, r2)
        L7a:
            int r4 = r17 - r2
            int[] r1 = r0.mScrollConsumed
            r1[r12] = r15
            int[] r5 = r0.mScrollOffset
            int[] r7 = r0.mScrollConsumed
            r1 = 0
            r3 = 0
            r6 = r13
            r0.dispatchNestedScroll(r1, r2, r3, r4, r5, r6, r7)
            r5 = r6
            int[] r1 = r0.mScrollOffset
            r1 = r1[r12]
            int r14 = r14 + r1
            int[] r1 = r0.mScrollConsumed
            r1 = r1[r12]
            int r1 = r17 - r1
            int r3 = r8 + r1
            if (r3 >= 0) goto Lcf
            if (r16 == 0) goto L107
            android.widget.EdgeEffect r6 = r0.mEdgeGlowTop
            int r7 = -r1
            float r7 = (float) r7
            int r13 = r0.getHeight()
            float r13 = (float) r13
            float r7 = r7 / r13
            float r13 = (float) r11
            int r15 = r0.getWidth()
            float r15 = (float) r15
            float r13 = r13 / r15
            androidx.core.widget.EdgeEffectCompat.onPullDistance(r6, r7, r13)
            if (r22 == 0) goto Lc1
            androidx.core.view.ScrollFeedbackProviderCompat r6 = r0.getScrollFeedbackProvider()
            int r7 = r22.getDeviceId()
            int r13 = r22.getSource()
            r6.onScrollLimit(r7, r13, r10, r12)
        Lc1:
            android.widget.EdgeEffect r6 = r0.mEdgeGlowBottom
            boolean r6 = r6.isFinished()
            if (r6 != 0) goto L107
            android.widget.EdgeEffect r6 = r0.mEdgeGlowBottom
            r6.onRelease()
            goto L107
        Lcf:
            if (r3 <= r9) goto L107
            if (r16 == 0) goto L107
            android.widget.EdgeEffect r6 = r0.mEdgeGlowBottom
            float r7 = (float) r1
            int r13 = r0.getHeight()
            float r13 = (float) r13
            float r7 = r7 / r13
            float r13 = (float) r11
            int r12 = r0.getWidth()
            float r12 = (float) r12
            float r13 = r13 / r12
            r12 = 1065353216(0x3f800000, float:1.0)
            float r12 = r12 - r13
            androidx.core.widget.EdgeEffectCompat.onPullDistance(r6, r7, r12)
            if (r22 == 0) goto Lfa
            androidx.core.view.ScrollFeedbackProviderCompat r6 = r0.getScrollFeedbackProvider()
            int r7 = r22.getDeviceId()
            int r12 = r22.getSource()
            r6.onScrollLimit(r7, r12, r10, r15)
        Lfa:
            android.widget.EdgeEffect r6 = r0.mEdgeGlowTop
            boolean r6 = r6.isFinished()
            if (r6 != 0) goto L107
            android.widget.EdgeEffect r6 = r0.mEdgeGlowTop
            r6.onRelease()
        L107:
            android.widget.EdgeEffect r6 = r0.mEdgeGlowTop
            boolean r6 = r6.isFinished()
            if (r6 == 0) goto L117
            android.widget.EdgeEffect r6 = r0.mEdgeGlowBottom
            boolean r6 = r6.isFinished()
            if (r6 != 0) goto L11c
        L117:
            r0.postInvalidateOnAnimation()
            r18 = 0
        L11c:
            if (r18 == 0) goto L129
            if (r5 != 0) goto L129
            android.view.VelocityTracker r6 = r0.mVelocityTracker
            if (r6 == 0) goto L129
            android.view.VelocityTracker r6 = r0.mVelocityTracker
            r6.clear()
        L129:
            r6 = 1
            if (r5 != r6) goto L139
            r0.stopNestedScroll(r5)
            android.widget.EdgeEffect r6 = r0.mEdgeGlowTop
            r6.onRelease()
            android.widget.EdgeEffect r6 = r0.mEdgeGlowBottom
            r6.onRelease()
        L139:
            return r14
    }

    @Override // android.view.View
    public void scrollTo(int r8, int r9) {
            r7 = this;
            int r0 = r7.getChildCount()
            if (r0 <= 0) goto L58
            r0 = 0
            android.view.View r0 = r7.getChildAt(r0)
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r1 = (android.widget.FrameLayout.LayoutParams) r1
            int r2 = r7.getWidth()
            int r3 = r7.getPaddingLeft()
            int r2 = r2 - r3
            int r3 = r7.getPaddingRight()
            int r2 = r2 - r3
            int r3 = r0.getWidth()
            int r4 = r1.leftMargin
            int r3 = r3 + r4
            int r4 = r1.rightMargin
            int r3 = r3 + r4
            int r4 = r7.getHeight()
            int r5 = r7.getPaddingTop()
            int r4 = r4 - r5
            int r5 = r7.getPaddingBottom()
            int r4 = r4 - r5
            int r5 = r0.getHeight()
            int r6 = r1.topMargin
            int r5 = r5 + r6
            int r6 = r1.bottomMargin
            int r5 = r5 + r6
            int r8 = clamp(r8, r2, r3)
            int r9 = clamp(r9, r4, r5)
            int r6 = r7.getScrollX()
            if (r8 != r6) goto L55
            int r6 = r7.getScrollY()
            if (r9 == r6) goto L58
        L55:
            super.scrollTo(r8, r9)
        L58:
            return
    }

    public void setFillViewport(boolean r2) {
            r1 = this;
            boolean r0 = r1.mFillViewport
            if (r2 == r0) goto L9
            r1.mFillViewport = r2
            r1.requestLayout()
        L9:
            return
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public void setNestedScrollingEnabled(boolean r2) {
            r1 = this;
            androidx.core.view.NestedScrollingChildHelper r0 = r1.mChildHelper
            r0.setNestedScrollingEnabled(r2)
            return
    }

    public void setOnScrollChangeListener(androidx.core.widget.NestedScrollView.OnScrollChangeListener r1) {
            r0 = this;
            r0.mOnScrollChangeListener = r1
            return
    }

    public void setSmoothScrollingEnabled(boolean r1) {
            r0 = this;
            r0.mSmoothScrollingEnabled = r1
            return
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
            r1 = this;
            r0 = 1
            return r0
    }

    public final void smoothScrollBy(int r3, int r4) {
            r2 = this;
            r0 = 250(0xfa, float:3.5E-43)
            r1 = 0
            r2.smoothScrollBy(r3, r4, r0, r1)
            return
    }

    public final void smoothScrollBy(int r2, int r3, int r4) {
            r1 = this;
            r0 = 0
            r1.smoothScrollBy(r2, r3, r4, r0)
            return
    }

    public final void smoothScrollTo(int r3, int r4) {
            r2 = this;
            r0 = 250(0xfa, float:3.5E-43)
            r1 = 0
            r2.smoothScrollTo(r3, r4, r0, r1)
            return
    }

    public final void smoothScrollTo(int r2, int r3, int r4) {
            r1 = this;
            r0 = 0
            r1.smoothScrollTo(r2, r3, r4, r0)
            return
    }

    void smoothScrollTo(int r3, int r4, int r5, boolean r6) {
            r2 = this;
            int r0 = r2.getScrollX()
            int r0 = r3 - r0
            int r1 = r2.getScrollY()
            int r1 = r4 - r1
            r2.smoothScrollBy(r0, r1, r5, r6)
            return
    }

    void smoothScrollTo(int r2, int r3, boolean r4) {
            r1 = this;
            r0 = 250(0xfa, float:3.5E-43)
            r1.smoothScrollTo(r2, r3, r0, r4)
            return
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean startNestedScroll(int r2) {
            r1 = this;
            r0 = 0
            boolean r0 = r1.startNestedScroll(r2, r0)
            return r0
    }

    @Override // androidx.core.view.NestedScrollingChild2
    public boolean startNestedScroll(int r2, int r3) {
            r1 = this;
            androidx.core.view.NestedScrollingChildHelper r0 = r1.mChildHelper
            boolean r0 = r0.startNestedScroll(r2, r3)
            return r0
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public void stopNestedScroll() {
            r1 = this;
            r0 = 0
            r1.stopNestedScroll(r0)
            return
    }

    @Override // androidx.core.view.NestedScrollingChild2
    public void stopNestedScroll(int r2) {
            r1 = this;
            androidx.core.view.NestedScrollingChildHelper r0 = r1.mChildHelper
            r0.stopNestedScroll(r2)
            return
    }
}
