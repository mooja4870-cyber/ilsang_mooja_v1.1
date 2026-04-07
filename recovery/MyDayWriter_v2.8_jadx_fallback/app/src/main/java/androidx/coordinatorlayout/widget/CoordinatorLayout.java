package androidx.coordinatorlayout.widget;

/* JADX INFO: loaded from: classes.dex */
public class CoordinatorLayout extends android.view.ViewGroup implements androidx.core.view.NestedScrollingParent2, androidx.core.view.NestedScrollingParent3 {
    static final java.lang.Class<?>[] CONSTRUCTOR_PARAMS = null;
    static final int EVENT_NESTED_SCROLL = 1;
    static final int EVENT_PRE_DRAW = 0;
    static final int EVENT_VIEW_REMOVED = 2;
    private static final float KEY_SCROLL_FRACTION_AMOUNT = 0.2f;
    static final java.lang.String TAG = "CoordinatorLayout";
    static final java.util.Comparator<android.view.View> TOP_SORTED_CHILDREN_COMPARATOR = null;
    private static final int TYPE_ON_INTERCEPT = 0;
    private static final int TYPE_ON_TOUCH = 1;
    static final java.lang.String WIDGET_PACKAGE_NAME = null;
    static final java.lang.ThreadLocal<java.util.Map<java.lang.String, java.lang.reflect.Constructor<androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior>>> sConstructors = null;
    private static final androidx.core.util.Pools.Pool<android.graphics.Rect> sRectPool = null;
    private androidx.core.view.OnApplyWindowInsetsListener mApplyWindowInsetsListener;
    private final int[] mBehaviorConsumed;
    private android.view.View mBehaviorTouchView;
    private final androidx.coordinatorlayout.widget.DirectedAcyclicGraph<android.view.View> mChildDag;
    private final java.util.List<android.view.View> mDependencySortedChildren;
    private boolean mDisallowInterceptReset;
    private boolean mDrawStatusBarBackground;
    private boolean mIsAttachedToWindow;
    private final int[] mKeyTriggeredScrollConsumed;
    private int[] mKeylines;
    private androidx.core.view.WindowInsetsCompat mLastInsets;
    private boolean mNeedsPreDrawListener;
    private final androidx.core.view.NestedScrollingParentHelper mNestedScrollingParentHelper;
    private android.view.View mNestedScrollingTarget;
    private final int[] mNestedScrollingV2ConsumedCompat;
    android.view.ViewGroup.OnHierarchyChangeListener mOnHierarchyChangeListener;
    private androidx.coordinatorlayout.widget.CoordinatorLayout.OnPreDrawListener mOnPreDrawListener;
    private android.graphics.Paint mScrimPaint;
    private android.graphics.drawable.Drawable mStatusBarBackground;
    private final java.util.List<android.view.View> mTempList1;


    public interface AttachedBehavior {
        androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior getBehavior();
    }

    public static abstract class Behavior<V extends android.view.View> {
        public Behavior() {
                r0 = this;
                r0.<init>()
                return
        }

        public Behavior(android.content.Context r1, android.util.AttributeSet r2) {
                r0 = this;
                r0.<init>()
                return
        }

        public static java.lang.Object getTag(android.view.View r2) {
                android.view.ViewGroup$LayoutParams r0 = r2.getLayoutParams()
                androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) r0
                java.lang.Object r1 = r0.mBehaviorTag
                return r1
        }

        public static void setTag(android.view.View r1, java.lang.Object r2) {
                android.view.ViewGroup$LayoutParams r0 = r1.getLayoutParams()
                androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) r0
                r0.mBehaviorTag = r2
                return
        }

        public boolean blocksInteractionBelow(androidx.coordinatorlayout.widget.CoordinatorLayout r3, V r4) {
                r2 = this;
                float r0 = r2.getScrimOpacity(r3, r4)
                r1 = 0
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 <= 0) goto Lb
                r0 = 1
                goto Lc
            Lb:
                r0 = 0
            Lc:
                return r0
        }

        public boolean getInsetDodgeRect(androidx.coordinatorlayout.widget.CoordinatorLayout r2, V r3, android.graphics.Rect r4) {
                r1 = this;
                r0 = 0
                return r0
        }

        public int getScrimColor(androidx.coordinatorlayout.widget.CoordinatorLayout r2, V r3) {
                r1 = this;
                r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
                return r0
        }

        public float getScrimOpacity(androidx.coordinatorlayout.widget.CoordinatorLayout r2, V r3) {
                r1 = this;
                r0 = 0
                return r0
        }

        public boolean layoutDependsOn(androidx.coordinatorlayout.widget.CoordinatorLayout r2, V r3, android.view.View r4) {
                r1 = this;
                r0 = 0
                return r0
        }

        public androidx.core.view.WindowInsetsCompat onApplyWindowInsets(androidx.coordinatorlayout.widget.CoordinatorLayout r1, V r2, androidx.core.view.WindowInsetsCompat r3) {
                r0 = this;
                return r3
        }

        public void onAttachedToLayoutParams(androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams r1) {
                r0 = this;
                return
        }

        public boolean onDependentViewChanged(androidx.coordinatorlayout.widget.CoordinatorLayout r2, V r3, android.view.View r4) {
                r1 = this;
                r0 = 0
                return r0
        }

        public void onDependentViewRemoved(androidx.coordinatorlayout.widget.CoordinatorLayout r1, V r2, android.view.View r3) {
                r0 = this;
                return
        }

        public void onDetachedFromLayoutParams() {
                r0 = this;
                return
        }

        public boolean onInterceptTouchEvent(androidx.coordinatorlayout.widget.CoordinatorLayout r2, V r3, android.view.MotionEvent r4) {
                r1 = this;
                r0 = 0
                return r0
        }

        public boolean onLayoutChild(androidx.coordinatorlayout.widget.CoordinatorLayout r2, V r3, int r4) {
                r1 = this;
                r0 = 0
                return r0
        }

        public boolean onMeasureChild(androidx.coordinatorlayout.widget.CoordinatorLayout r2, V r3, int r4, int r5, int r6, int r7) {
                r1 = this;
                r0 = 0
                return r0
        }

        public boolean onNestedFling(androidx.coordinatorlayout.widget.CoordinatorLayout r2, V r3, android.view.View r4, float r5, float r6, boolean r7) {
                r1 = this;
                r0 = 0
                return r0
        }

        public boolean onNestedPreFling(androidx.coordinatorlayout.widget.CoordinatorLayout r2, V r3, android.view.View r4, float r5, float r6) {
                r1 = this;
                r0 = 0
                return r0
        }

        @java.lang.Deprecated
        public void onNestedPreScroll(androidx.coordinatorlayout.widget.CoordinatorLayout r1, V r2, android.view.View r3, int r4, int r5, int[] r6) {
                r0 = this;
                return
        }

        public void onNestedPreScroll(androidx.coordinatorlayout.widget.CoordinatorLayout r1, V r2, android.view.View r3, int r4, int r5, int[] r6, int r7) {
                r0 = this;
                if (r7 != 0) goto L5
                r0.onNestedPreScroll(r1, r2, r3, r4, r5, r6)
            L5:
                return
        }

        @java.lang.Deprecated
        public void onNestedScroll(androidx.coordinatorlayout.widget.CoordinatorLayout r1, V r2, android.view.View r3, int r4, int r5, int r6, int r7) {
                r0 = this;
                return
        }

        @java.lang.Deprecated
        public void onNestedScroll(androidx.coordinatorlayout.widget.CoordinatorLayout r1, V r2, android.view.View r3, int r4, int r5, int r6, int r7, int r8) {
                r0 = this;
                if (r8 != 0) goto L5
                r0.onNestedScroll(r1, r2, r3, r4, r5, r6, r7)
            L5:
                return
        }

        public void onNestedScroll(androidx.coordinatorlayout.widget.CoordinatorLayout r3, V r4, android.view.View r5, int r6, int r7, int r8, int r9, int r10, int[] r11) {
                r2 = this;
                r0 = 0
                r1 = r11[r0]
                int r1 = r1 + r8
                r11[r0] = r1
                r0 = 1
                r1 = r11[r0]
                int r1 = r1 + r9
                r11[r0] = r1
                r2.onNestedScroll(r3, r4, r5, r6, r7, r8, r9, r10)
                return
        }

        @java.lang.Deprecated
        public void onNestedScrollAccepted(androidx.coordinatorlayout.widget.CoordinatorLayout r1, V r2, android.view.View r3, android.view.View r4, int r5) {
                r0 = this;
                return
        }

        public void onNestedScrollAccepted(androidx.coordinatorlayout.widget.CoordinatorLayout r1, V r2, android.view.View r3, android.view.View r4, int r5, int r6) {
                r0 = this;
                if (r6 != 0) goto L5
                r0.onNestedScrollAccepted(r1, r2, r3, r4, r5)
            L5:
                return
        }

        public boolean onRequestChildRectangleOnScreen(androidx.coordinatorlayout.widget.CoordinatorLayout r2, V r3, android.graphics.Rect r4, boolean r5) {
                r1 = this;
                r0 = 0
                return r0
        }

        public void onRestoreInstanceState(androidx.coordinatorlayout.widget.CoordinatorLayout r1, V r2, android.os.Parcelable r3) {
                r0 = this;
                return
        }

        public android.os.Parcelable onSaveInstanceState(androidx.coordinatorlayout.widget.CoordinatorLayout r2, V r3) {
                r1 = this;
                android.view.AbsSavedState r0 = android.view.View.BaseSavedState.EMPTY_STATE
                return r0
        }

        @java.lang.Deprecated
        public boolean onStartNestedScroll(androidx.coordinatorlayout.widget.CoordinatorLayout r2, V r3, android.view.View r4, android.view.View r5, int r6) {
                r1 = this;
                r0 = 0
                return r0
        }

        public boolean onStartNestedScroll(androidx.coordinatorlayout.widget.CoordinatorLayout r2, V r3, android.view.View r4, android.view.View r5, int r6, int r7) {
                r1 = this;
                if (r7 != 0) goto L7
                boolean r0 = r1.onStartNestedScroll(r2, r3, r4, r5, r6)
                return r0
            L7:
                r0 = 0
                return r0
        }

        @java.lang.Deprecated
        public void onStopNestedScroll(androidx.coordinatorlayout.widget.CoordinatorLayout r1, V r2, android.view.View r3) {
                r0 = this;
                return
        }

        public void onStopNestedScroll(androidx.coordinatorlayout.widget.CoordinatorLayout r1, V r2, android.view.View r3, int r4) {
                r0 = this;
                if (r4 != 0) goto L5
                r0.onStopNestedScroll(r1, r2, r3)
            L5:
                return
        }

        public boolean onTouchEvent(androidx.coordinatorlayout.widget.CoordinatorLayout r2, V r3, android.view.MotionEvent r4) {
                r1 = this;
                r0 = 0
                return r0
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
    @java.lang.Deprecated
    public @interface DefaultBehavior {
        java.lang.Class<? extends androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior> value();
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface DispatchChangeEvent {
    }

    private class HierarchyChangeListener implements android.view.ViewGroup.OnHierarchyChangeListener {
        final /* synthetic */ androidx.coordinatorlayout.widget.CoordinatorLayout this$0;

        HierarchyChangeListener(androidx.coordinatorlayout.widget.CoordinatorLayout r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(android.view.View r2, android.view.View r3) {
                r1 = this;
                androidx.coordinatorlayout.widget.CoordinatorLayout r0 = r1.this$0
                android.view.ViewGroup$OnHierarchyChangeListener r0 = r0.mOnHierarchyChangeListener
                if (r0 == 0) goto Ld
                androidx.coordinatorlayout.widget.CoordinatorLayout r0 = r1.this$0
                android.view.ViewGroup$OnHierarchyChangeListener r0 = r0.mOnHierarchyChangeListener
                r0.onChildViewAdded(r2, r3)
            Ld:
                return
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(android.view.View r3, android.view.View r4) {
                r2 = this;
                androidx.coordinatorlayout.widget.CoordinatorLayout r0 = r2.this$0
                r1 = 2
                r0.onChildViewsChanged(r1)
                androidx.coordinatorlayout.widget.CoordinatorLayout r0 = r2.this$0
                android.view.ViewGroup$OnHierarchyChangeListener r0 = r0.mOnHierarchyChangeListener
                if (r0 == 0) goto L13
                androidx.coordinatorlayout.widget.CoordinatorLayout r0 = r2.this$0
                android.view.ViewGroup$OnHierarchyChangeListener r0 = r0.mOnHierarchyChangeListener
                r0.onChildViewRemoved(r3, r4)
            L13:
                return
        }
    }

    public static class LayoutParams extends android.view.ViewGroup.MarginLayoutParams {
        public int anchorGravity;
        public int dodgeInsetEdges;
        public int gravity;
        public int insetEdge;
        public int keyline;
        android.view.View mAnchorDirectChild;
        int mAnchorId;
        android.view.View mAnchorView;
        androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior mBehavior;
        boolean mBehaviorResolved;
        java.lang.Object mBehaviorTag;
        private boolean mDidAcceptNestedScrollNonTouch;
        private boolean mDidAcceptNestedScrollTouch;
        private boolean mDidBlockInteraction;
        private boolean mDidChangeAfterNestedScroll;
        int mInsetOffsetX;
        int mInsetOffsetY;
        final android.graphics.Rect mLastChildRect;

        public LayoutParams(int r3, int r4) {
                r2 = this;
                r2.<init>(r3, r4)
                r0 = 0
                r2.mBehaviorResolved = r0
                r2.gravity = r0
                r2.anchorGravity = r0
                r1 = -1
                r2.keyline = r1
                r2.mAnchorId = r1
                r2.insetEdge = r0
                r2.dodgeInsetEdges = r0
                android.graphics.Rect r0 = new android.graphics.Rect
                r0.<init>()
                r2.mLastChildRect = r0
                return
        }

        LayoutParams(android.content.Context r5, android.util.AttributeSet r6) {
                r4 = this;
                r4.<init>(r5, r6)
                r0 = 0
                r4.mBehaviorResolved = r0
                r4.gravity = r0
                r4.anchorGravity = r0
                r1 = -1
                r4.keyline = r1
                r4.mAnchorId = r1
                r4.insetEdge = r0
                r4.dodgeInsetEdges = r0
                android.graphics.Rect r2 = new android.graphics.Rect
                r2.<init>()
                r4.mLastChildRect = r2
                int[] r2 = androidx.coordinatorlayout.R.styleable.CoordinatorLayout_Layout
                android.content.res.TypedArray r2 = r5.obtainStyledAttributes(r6, r2)
                int r3 = androidx.coordinatorlayout.R.styleable.CoordinatorLayout_Layout_android_layout_gravity
                int r3 = r2.getInteger(r3, r0)
                r4.gravity = r3
                int r3 = androidx.coordinatorlayout.R.styleable.CoordinatorLayout_Layout_layout_anchor
                int r3 = r2.getResourceId(r3, r1)
                r4.mAnchorId = r3
                int r3 = androidx.coordinatorlayout.R.styleable.CoordinatorLayout_Layout_layout_anchorGravity
                int r3 = r2.getInteger(r3, r0)
                r4.anchorGravity = r3
                int r3 = androidx.coordinatorlayout.R.styleable.CoordinatorLayout_Layout_layout_keyline
                int r1 = r2.getInteger(r3, r1)
                r4.keyline = r1
                int r1 = androidx.coordinatorlayout.R.styleable.CoordinatorLayout_Layout_layout_insetEdge
                int r1 = r2.getInt(r1, r0)
                r4.insetEdge = r1
                int r1 = androidx.coordinatorlayout.R.styleable.CoordinatorLayout_Layout_layout_dodgeInsetEdges
                int r0 = r2.getInt(r1, r0)
                r4.dodgeInsetEdges = r0
                int r0 = androidx.coordinatorlayout.R.styleable.CoordinatorLayout_Layout_layout_behavior
                boolean r0 = r2.hasValue(r0)
                r4.mBehaviorResolved = r0
                boolean r0 = r4.mBehaviorResolved
                if (r0 == 0) goto L68
                int r0 = androidx.coordinatorlayout.R.styleable.CoordinatorLayout_Layout_layout_behavior
                java.lang.String r0 = r2.getString(r0)
                androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r0 = androidx.coordinatorlayout.widget.CoordinatorLayout.parseBehavior(r5, r6, r0)
                r4.mBehavior = r0
            L68:
                r2.recycle()
                androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r0 = r4.mBehavior
                if (r0 == 0) goto L74
                androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r0 = r4.mBehavior
                r0.onAttachedToLayoutParams(r4)
            L74:
                return
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams r3) {
                r2 = this;
                r2.<init>(r3)
                r0 = 0
                r2.mBehaviorResolved = r0
                r2.gravity = r0
                r2.anchorGravity = r0
                r1 = -1
                r2.keyline = r1
                r2.mAnchorId = r1
                r2.insetEdge = r0
                r2.dodgeInsetEdges = r0
                android.graphics.Rect r0 = new android.graphics.Rect
                r0.<init>()
                r2.mLastChildRect = r0
                return
        }

        public LayoutParams(android.view.ViewGroup.MarginLayoutParams r3) {
                r2 = this;
                r2.<init>(r3)
                r0 = 0
                r2.mBehaviorResolved = r0
                r2.gravity = r0
                r2.anchorGravity = r0
                r1 = -1
                r2.keyline = r1
                r2.mAnchorId = r1
                r2.insetEdge = r0
                r2.dodgeInsetEdges = r0
                android.graphics.Rect r0 = new android.graphics.Rect
                r0.<init>()
                r2.mLastChildRect = r0
                return
        }

        public LayoutParams(androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams r3) {
                r2 = this;
                r2.<init>(r3)
                r0 = 0
                r2.mBehaviorResolved = r0
                r2.gravity = r0
                r2.anchorGravity = r0
                r1 = -1
                r2.keyline = r1
                r2.mAnchorId = r1
                r2.insetEdge = r0
                r2.dodgeInsetEdges = r0
                android.graphics.Rect r0 = new android.graphics.Rect
                r0.<init>()
                r2.mLastChildRect = r0
                return
        }

        private void resolveAnchorView(android.view.View r5, androidx.coordinatorlayout.widget.CoordinatorLayout r6) {
                r4 = this;
                int r0 = r4.mAnchorId
                android.view.View r0 = r6.findViewById(r0)
                r4.mAnchorView = r0
                android.view.View r0 = r4.mAnchorView
                r1 = 0
                if (r0 == 0) goto L55
                android.view.View r0 = r4.mAnchorView
                if (r0 != r6) goto L24
                boolean r0 = r6.isInEditMode()
                if (r0 == 0) goto L1c
                r4.mAnchorDirectChild = r1
                r4.mAnchorView = r1
                return
            L1c:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "View can not be anchored to the the parent CoordinatorLayout"
                r0.<init>(r1)
                throw r0
            L24:
                android.view.View r0 = r4.mAnchorView
                android.view.View r2 = r4.mAnchorView
                android.view.ViewParent r2 = r2.getParent()
            L2c:
                if (r2 == r6) goto L51
                if (r2 == 0) goto L51
                if (r2 != r5) goto L45
                boolean r3 = r6.isInEditMode()
                if (r3 == 0) goto L3d
                r4.mAnchorDirectChild = r1
                r4.mAnchorView = r1
                return
            L3d:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r3 = "Anchor must not be a descendant of the anchored view"
                r1.<init>(r3)
                throw r1
            L45:
                boolean r3 = r2 instanceof android.view.View
                if (r3 == 0) goto L4c
                r0 = r2
                android.view.View r0 = (android.view.View) r0
            L4c:
                android.view.ViewParent r2 = r2.getParent()
                goto L2c
            L51:
                r4.mAnchorDirectChild = r0
                return
            L55:
                boolean r0 = r6.isInEditMode()
                if (r0 == 0) goto L60
                r4.mAnchorDirectChild = r1
                r4.mAnchorView = r1
                return
            L60:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Could not find CoordinatorLayout descendant view with id "
                java.lang.StringBuilder r1 = r1.append(r2)
                android.content.res.Resources r2 = r6.getResources()
                int r3 = r4.mAnchorId
                java.lang.String r2 = r2.getResourceName(r3)
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.String r2 = " to anchor view "
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.StringBuilder r1 = r1.append(r5)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
        }

        private boolean shouldDodge(android.view.View r4, int r5) {
                r3 = this;
                android.view.ViewGroup$LayoutParams r0 = r4.getLayoutParams()
                androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) r0
                int r1 = r0.insetEdge
                int r1 = androidx.core.view.GravityCompat.getAbsoluteGravity(r1, r5)
                if (r1 == 0) goto L19
                int r2 = r3.dodgeInsetEdges
                int r2 = androidx.core.view.GravityCompat.getAbsoluteGravity(r2, r5)
                r2 = r2 & r1
                if (r2 != r1) goto L19
                r2 = 1
                goto L1a
            L19:
                r2 = 0
            L1a:
                return r2
        }

        private boolean verifyAnchorView(android.view.View r5, androidx.coordinatorlayout.widget.CoordinatorLayout r6) {
                r4 = this;
                android.view.View r0 = r4.mAnchorView
                int r0 = r0.getId()
                int r1 = r4.mAnchorId
                r2 = 0
                if (r0 == r1) goto Lc
                return r2
            Lc:
                android.view.View r0 = r4.mAnchorView
                android.view.View r1 = r4.mAnchorView
                android.view.ViewParent r1 = r1.getParent()
            L14:
                if (r1 == r6) goto L2d
                if (r1 == 0) goto L27
                if (r1 != r5) goto L1b
                goto L27
            L1b:
                boolean r3 = r1 instanceof android.view.View
                if (r3 == 0) goto L22
                r0 = r1
                android.view.View r0 = (android.view.View) r0
            L22:
                android.view.ViewParent r1 = r1.getParent()
                goto L14
            L27:
                r3 = 0
                r4.mAnchorDirectChild = r3
                r4.mAnchorView = r3
                return r2
            L2d:
                r4.mAnchorDirectChild = r0
                r1 = 1
                return r1
        }

        boolean checkAnchorChanged() {
                r2 = this;
                android.view.View r0 = r2.mAnchorView
                if (r0 != 0) goto Lb
                int r0 = r2.mAnchorId
                r1 = -1
                if (r0 == r1) goto Lb
                r0 = 1
                goto Lc
            Lb:
                r0 = 0
            Lc:
                return r0
        }

        boolean dependsOn(androidx.coordinatorlayout.widget.CoordinatorLayout r2, android.view.View r3, android.view.View r4) {
                r1 = this;
                android.view.View r0 = r1.mAnchorDirectChild
                if (r4 == r0) goto L1d
                int r0 = r2.getLayoutDirection()
                boolean r0 = r1.shouldDodge(r4, r0)
                if (r0 != 0) goto L1d
                androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r0 = r1.mBehavior
                if (r0 == 0) goto L1b
                androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r0 = r1.mBehavior
                boolean r0 = r0.layoutDependsOn(r2, r3, r4)
                if (r0 == 0) goto L1b
                goto L1d
            L1b:
                r0 = 0
                goto L1e
            L1d:
                r0 = 1
            L1e:
                return r0
        }

        boolean didBlockInteraction() {
                r1 = this;
                androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r0 = r1.mBehavior
                if (r0 != 0) goto L7
                r0 = 0
                r1.mDidBlockInteraction = r0
            L7:
                boolean r0 = r1.mDidBlockInteraction
                return r0
        }

        android.view.View findAnchorView(androidx.coordinatorlayout.widget.CoordinatorLayout r3, android.view.View r4) {
                r2 = this;
                int r0 = r2.mAnchorId
                r1 = -1
                if (r0 != r1) goto Lb
                r0 = 0
                r2.mAnchorDirectChild = r0
                r2.mAnchorView = r0
                return r0
            Lb:
                android.view.View r0 = r2.mAnchorView
                if (r0 == 0) goto L15
                boolean r0 = r2.verifyAnchorView(r4, r3)
                if (r0 != 0) goto L18
            L15:
                r2.resolveAnchorView(r4, r3)
            L18:
                android.view.View r0 = r2.mAnchorView
                return r0
        }

        public int getAnchorId() {
                r1 = this;
                int r0 = r1.mAnchorId
                return r0
        }

        public androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior getBehavior() {
                r1 = this;
                androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r0 = r1.mBehavior
                return r0
        }

        boolean getChangedAfterNestedScroll() {
                r1 = this;
                boolean r0 = r1.mDidChangeAfterNestedScroll
                return r0
        }

        android.graphics.Rect getLastChildRect() {
                r1 = this;
                android.graphics.Rect r0 = r1.mLastChildRect
                return r0
        }

        void invalidateAnchor() {
                r1 = this;
                r0 = 0
                r1.mAnchorDirectChild = r0
                r1.mAnchorView = r0
                return
        }

        boolean isBlockingInteractionBelow(androidx.coordinatorlayout.widget.CoordinatorLayout r3, android.view.View r4) {
                r2 = this;
                boolean r0 = r2.mDidBlockInteraction
                if (r0 == 0) goto L6
                r0 = 1
                return r0
            L6:
                boolean r0 = r2.mDidBlockInteraction
                androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r1 = r2.mBehavior
                if (r1 == 0) goto L13
                androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r1 = r2.mBehavior
                boolean r1 = r1.blocksInteractionBelow(r3, r4)
                goto L14
            L13:
                r1 = 0
            L14:
                r0 = r0 | r1
                r2.mDidBlockInteraction = r0
                return r0
        }

        boolean isNestedScrollAccepted(int r2) {
                r1 = this;
                switch(r2) {
                    case 0: goto L8;
                    case 1: goto L5;
                    default: goto L3;
                }
            L3:
                r0 = 0
                return r0
            L5:
                boolean r0 = r1.mDidAcceptNestedScrollNonTouch
                return r0
            L8:
                boolean r0 = r1.mDidAcceptNestedScrollTouch
                return r0
        }

        void resetChangedAfterNestedScroll() {
                r1 = this;
                r0 = 0
                r1.mDidChangeAfterNestedScroll = r0
                return
        }

        void resetNestedScroll(int r2) {
                r1 = this;
                r0 = 0
                r1.setNestedScrollAccepted(r2, r0)
                return
        }

        void resetTouchBehaviorTracking() {
                r1 = this;
                r0 = 0
                r1.mDidBlockInteraction = r0
                return
        }

        public void setAnchorId(int r1) {
                r0 = this;
                r0.invalidateAnchor()
                r0.mAnchorId = r1
                return
        }

        public void setBehavior(androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior r2) {
                r1 = this;
                androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r0 = r1.mBehavior
                if (r0 == r2) goto L1a
                androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r0 = r1.mBehavior
                if (r0 == 0) goto Ld
                androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r0 = r1.mBehavior
                r0.onDetachedFromLayoutParams()
            Ld:
                r1.mBehavior = r2
                r0 = 0
                r1.mBehaviorTag = r0
                r0 = 1
                r1.mBehaviorResolved = r0
                if (r2 == 0) goto L1a
                r2.onAttachedToLayoutParams(r1)
            L1a:
                return
        }

        void setChangedAfterNestedScroll(boolean r1) {
                r0 = this;
                r0.mDidChangeAfterNestedScroll = r1
                return
        }

        void setLastChildRect(android.graphics.Rect r2) {
                r1 = this;
                android.graphics.Rect r0 = r1.mLastChildRect
                r0.set(r2)
                return
        }

        void setNestedScrollAccepted(int r1, boolean r2) {
                r0 = this;
                switch(r1) {
                    case 0: goto L7;
                    case 1: goto L4;
                    default: goto L3;
                }
            L3:
                goto La
            L4:
                r0.mDidAcceptNestedScrollNonTouch = r2
                goto La
            L7:
                r0.mDidAcceptNestedScrollTouch = r2
            La:
                return
        }
    }

    class OnPreDrawListener implements android.view.ViewTreeObserver.OnPreDrawListener {
        final /* synthetic */ androidx.coordinatorlayout.widget.CoordinatorLayout this$0;

        OnPreDrawListener(androidx.coordinatorlayout.widget.CoordinatorLayout r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
                r2 = this;
                androidx.coordinatorlayout.widget.CoordinatorLayout r0 = r2.this$0
                r1 = 0
                r0.onChildViewsChanged(r1)
                r0 = 1
                return r0
        }
    }

    protected static class SavedState extends androidx.customview.view.AbsSavedState {
        public static final android.os.Parcelable.Creator<androidx.coordinatorlayout.widget.CoordinatorLayout.SavedState> CREATOR = null;
        android.util.SparseArray<android.os.Parcelable> behaviorStates;


        static {
                androidx.coordinatorlayout.widget.CoordinatorLayout$SavedState$1 r0 = new androidx.coordinatorlayout.widget.CoordinatorLayout$SavedState$1
                r0.<init>()
                androidx.coordinatorlayout.widget.CoordinatorLayout.SavedState.CREATOR = r0
                return
        }

        public SavedState(android.os.Parcel r8, java.lang.ClassLoader r9) {
                r7 = this;
                r7.<init>(r8, r9)
                int r0 = r8.readInt()
                int[] r1 = new int[r0]
                r8.readIntArray(r1)
                android.os.Parcelable[] r2 = r8.readParcelableArray(r9)
                android.util.SparseArray r3 = new android.util.SparseArray
                r3.<init>(r0)
                r7.behaviorStates = r3
                r3 = 0
            L18:
                if (r3 >= r0) goto L26
                android.util.SparseArray<android.os.Parcelable> r4 = r7.behaviorStates
                r5 = r1[r3]
                r6 = r2[r3]
                r4.append(r5, r6)
                int r3 = r3 + 1
                goto L18
            L26:
                return
        }

        public SavedState(android.os.Parcelable r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(android.os.Parcel r6, int r7) {
                r5 = this;
                super.writeToParcel(r6, r7)
                android.util.SparseArray<android.os.Parcelable> r0 = r5.behaviorStates
                if (r0 == 0) goto Le
                android.util.SparseArray<android.os.Parcelable> r0 = r5.behaviorStates
                int r0 = r0.size()
                goto Lf
            Le:
                r0 = 0
            Lf:
                r6.writeInt(r0)
                int[] r1 = new int[r0]
                android.os.Parcelable[] r2 = new android.os.Parcelable[r0]
                r3 = 0
            L17:
                if (r3 >= r0) goto L2e
                android.util.SparseArray<android.os.Parcelable> r4 = r5.behaviorStates
                int r4 = r4.keyAt(r3)
                r1[r3] = r4
                android.util.SparseArray<android.os.Parcelable> r4 = r5.behaviorStates
                java.lang.Object r4 = r4.valueAt(r3)
                android.os.Parcelable r4 = (android.os.Parcelable) r4
                r2[r3] = r4
                int r3 = r3 + 1
                goto L17
            L2e:
                r6.writeIntArray(r1)
                r6.writeParcelableArray(r2, r7)
                return
        }
    }

    static class ViewElevationComparator implements java.util.Comparator<android.view.View> {
        ViewElevationComparator() {
                r0 = this;
                r0.<init>()
                return
        }

        /* JADX INFO: renamed from: compare, reason: avoid collision after fix types in other method */
        public int compare2(android.view.View r4, android.view.View r5) {
                r3 = this;
                float r0 = androidx.core.view.ViewCompat.getZ(r4)
                float r1 = androidx.core.view.ViewCompat.getZ(r5)
                int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r2 <= 0) goto Le
                r2 = -1
                return r2
            Le:
                int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r2 >= 0) goto L14
                r2 = 1
                return r2
            L14:
                r2 = 0
                return r2
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(android.view.View r1, android.view.View r2) {
                r0 = this;
                android.view.View r1 = (android.view.View) r1
                android.view.View r2 = (android.view.View) r2
                int r1 = r0.compare2(r1, r2)
                return r1
        }
    }

    static {
            java.lang.Class<androidx.coordinatorlayout.widget.CoordinatorLayout> r0 = androidx.coordinatorlayout.widget.CoordinatorLayout.class
            java.lang.Package r0 = r0.getPackage()
            if (r0 == 0) goto Ld
            java.lang.String r1 = r0.getName()
            goto Le
        Ld:
            r1 = 0
        Le:
            androidx.coordinatorlayout.widget.CoordinatorLayout.WIDGET_PACKAGE_NAME = r1
            androidx.coordinatorlayout.widget.CoordinatorLayout$ViewElevationComparator r0 = new androidx.coordinatorlayout.widget.CoordinatorLayout$ViewElevationComparator
            r0.<init>()
            androidx.coordinatorlayout.widget.CoordinatorLayout.TOP_SORTED_CHILDREN_COMPARATOR = r0
            r0 = 2
            java.lang.Class[] r0 = new java.lang.Class[r0]
            r1 = 0
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r0[r1] = r2
            r1 = 1
            java.lang.Class<android.util.AttributeSet> r2 = android.util.AttributeSet.class
            r0[r1] = r2
            androidx.coordinatorlayout.widget.CoordinatorLayout.CONSTRUCTOR_PARAMS = r0
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            androidx.coordinatorlayout.widget.CoordinatorLayout.sConstructors = r0
            androidx.core.util.Pools$SynchronizedPool r0 = new androidx.core.util.Pools$SynchronizedPool
            r1 = 12
            r0.<init>(r1)
            androidx.coordinatorlayout.widget.CoordinatorLayout.sRectPool = r0
            return
    }

    public CoordinatorLayout(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public CoordinatorLayout(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            int r0 = androidx.coordinatorlayout.R.attr.coordinatorLayoutStyle
            r1.<init>(r2, r3, r0)
            return
    }

    public CoordinatorLayout(android.content.Context r10, android.util.AttributeSet r11, int r12) {
            r9 = this;
            r9.<init>(r10, r11, r12)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r9.mDependencySortedChildren = r0
            androidx.coordinatorlayout.widget.DirectedAcyclicGraph r0 = new androidx.coordinatorlayout.widget.DirectedAcyclicGraph
            r0.<init>()
            r9.mChildDag = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r9.mTempList1 = r0
            r0 = 2
            int[] r1 = new int[r0]
            r9.mBehaviorConsumed = r1
            int[] r1 = new int[r0]
            r9.mNestedScrollingV2ConsumedCompat = r1
            int[] r0 = new int[r0]
            r9.mKeyTriggeredScrollConsumed = r0
            androidx.core.view.NestedScrollingParentHelper r0 = new androidx.core.view.NestedScrollingParentHelper
            r0.<init>(r9)
            r9.mNestedScrollingParentHelper = r0
            r0 = 0
            if (r12 != 0) goto L38
            int[] r1 = androidx.coordinatorlayout.R.styleable.CoordinatorLayout
            int r2 = androidx.coordinatorlayout.R.style.Widget_Support_CoordinatorLayout
            android.content.res.TypedArray r1 = r10.obtainStyledAttributes(r11, r1, r0, r2)
            goto L3e
        L38:
            int[] r1 = androidx.coordinatorlayout.R.styleable.CoordinatorLayout
            android.content.res.TypedArray r1 = r10.obtainStyledAttributes(r11, r1, r12, r0)
        L3e:
            r6 = r1
            if (r12 != 0) goto L4e
            int[] r4 = androidx.coordinatorlayout.R.styleable.CoordinatorLayout
            r7 = 0
            int r8 = androidx.coordinatorlayout.R.style.Widget_Support_CoordinatorLayout
            r2 = r9
            r3 = r10
            r5 = r11
            androidx.core.view.ViewCompat.saveAttributeDataForStyleable(r2, r3, r4, r5, r6, r7, r8)
            r7 = r12
            goto L58
        L4e:
            r3 = r10
            r5 = r11
            int[] r4 = androidx.coordinatorlayout.R.styleable.CoordinatorLayout
            r8 = 0
            r2 = r9
            r7 = r12
            androidx.core.view.ViewCompat.saveAttributeDataForStyleable(r2, r3, r4, r5, r6, r7, r8)
        L58:
            int r10 = androidx.coordinatorlayout.R.styleable.CoordinatorLayout_keylines
            int r10 = r6.getResourceId(r10, r0)
            if (r10 == 0) goto L84
            android.content.res.Resources r11 = r3.getResources()
            int[] r12 = r11.getIntArray(r10)
            r2.mKeylines = r12
            android.util.DisplayMetrics r12 = r11.getDisplayMetrics()
            float r12 = r12.density
            int[] r0 = r2.mKeylines
            int r0 = r0.length
            r1 = 0
        L74:
            if (r1 >= r0) goto L84
            int[] r4 = r2.mKeylines
            int[] r8 = r2.mKeylines
            r8 = r8[r1]
            float r8 = (float) r8
            float r8 = r8 * r12
            int r8 = (int) r8
            r4[r1] = r8
            int r1 = r1 + 1
            goto L74
        L84:
            int r11 = androidx.coordinatorlayout.R.styleable.CoordinatorLayout_statusBarBackground
            android.graphics.drawable.Drawable r11 = r6.getDrawable(r11)
            r2.mStatusBarBackground = r11
            r6.recycle()
            r9.setupForInsets()
            androidx.coordinatorlayout.widget.CoordinatorLayout$HierarchyChangeListener r11 = new androidx.coordinatorlayout.widget.CoordinatorLayout$HierarchyChangeListener
            r11.<init>(r9)
            super.setOnHierarchyChangeListener(r11)
            int r11 = r9.getImportantForAccessibility()
            if (r11 != 0) goto La4
            r11 = 1
            r9.setImportantForAccessibility(r11)
        La4:
            return
    }

    private static android.graphics.Rect acquireTempRect() {
            androidx.core.util.Pools$Pool<android.graphics.Rect> r0 = androidx.coordinatorlayout.widget.CoordinatorLayout.sRectPool
            java.lang.Object r0 = r0.acquire()
            android.graphics.Rect r0 = (android.graphics.Rect) r0
            if (r0 != 0) goto L10
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0 = r1
        L10:
            return r0
    }

    private void cancelInterceptBehaviors() {
            r14 = this;
            r0 = 0
            int r1 = r14.getChildCount()
            r2 = 0
        L6:
            if (r2 >= r1) goto L2d
            android.view.View r3 = r14.getChildAt(r2)
            android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r4 = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) r4
            androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r5 = r4.getBehavior()
            if (r5 == 0) goto L2a
            if (r0 != 0) goto L27
            long r6 = android.os.SystemClock.uptimeMillis()
            r12 = 0
            r13 = 0
            r10 = 3
            r11 = 0
            r8 = r6
            android.view.MotionEvent r0 = android.view.MotionEvent.obtain(r6, r8, r10, r11, r12, r13)
        L27:
            r5.onInterceptTouchEvent(r14, r3, r0)
        L2a:
            int r2 = r2 + 1
            goto L6
        L2d:
            if (r0 == 0) goto L32
            r0.recycle()
        L32:
            return
    }

    private static int clamp(int r0, int r1, int r2) {
            if (r0 >= r1) goto L3
            return r1
        L3:
            if (r0 <= r2) goto L6
            return r2
        L6:
            return r0
    }

    private void constrainChildRect(androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams r8, android.graphics.Rect r9, int r10, int r11) {
            r7 = this;
            int r0 = r7.getWidth()
            int r1 = r7.getHeight()
            int r2 = r7.getPaddingLeft()
            int r3 = r8.leftMargin
            int r2 = r2 + r3
            int r3 = r9.left
            int r4 = r7.getPaddingRight()
            int r4 = r0 - r4
            int r4 = r4 - r10
            int r5 = r8.rightMargin
            int r4 = r4 - r5
            int r3 = java.lang.Math.min(r3, r4)
            int r2 = java.lang.Math.max(r2, r3)
            int r3 = r7.getPaddingTop()
            int r4 = r8.topMargin
            int r3 = r3 + r4
            int r4 = r9.top
            int r5 = r7.getPaddingBottom()
            int r5 = r1 - r5
            int r5 = r5 - r11
            int r6 = r8.bottomMargin
            int r5 = r5 - r6
            int r4 = java.lang.Math.min(r4, r5)
            int r3 = java.lang.Math.max(r3, r4)
            int r4 = r2 + r10
            int r5 = r3 + r11
            r9.set(r2, r3, r4, r5)
            return
    }

    private androidx.core.view.WindowInsetsCompat dispatchApplyWindowInsetsToBehaviors(androidx.core.view.WindowInsetsCompat r7) {
            r6 = this;
            boolean r0 = r7.isConsumed()
            if (r0 == 0) goto L7
            return r7
        L7:
            r0 = 0
            int r1 = r6.getChildCount()
        Lc:
            if (r0 >= r1) goto L32
            android.view.View r2 = r6.getChildAt(r0)
            boolean r3 = androidx.core.view.ViewCompat.getFitsSystemWindows(r2)
            if (r3 == 0) goto L2f
            android.view.ViewGroup$LayoutParams r3 = r2.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r3 = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) r3
            androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r4 = r3.getBehavior()
            if (r4 == 0) goto L2f
            androidx.core.view.WindowInsetsCompat r7 = r4.onApplyWindowInsets(r6, r2, r7)
            boolean r5 = r7.isConsumed()
            if (r5 == 0) goto L2f
            goto L32
        L2f:
            int r0 = r0 + 1
            goto Lc
        L32:
            return r7
    }

    private int distanceToBottom() {
            r2 = this;
            int r0 = r2.getFullContentHeight()
            int r1 = r2.getHeight()
            int r0 = r0 - r1
            return r0
    }

    private int distanceToTop() {
            r1 = this;
            int r0 = r1.getFullContentHeight()
            int r0 = -r0
            return r0
    }

    private android.view.View findDeepestFocusedChild(android.view.View r4) {
            r3 = this;
            r0 = r4
        L1:
            r1 = 0
            if (r0 == 0) goto L1a
            boolean r2 = r0.isFocused()
            if (r2 == 0) goto Lb
            return r0
        Lb:
            boolean r2 = r0 instanceof android.view.ViewGroup
            if (r2 == 0) goto L17
            r1 = r0
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            android.view.View r1 = r1.getFocusedChild()
            goto L18
        L17:
        L18:
            r0 = r1
            goto L1
        L1a:
            return r1
    }

    private void getDesiredAnchoredChildRectWithoutConstraints(int r12, android.graphics.Rect r13, android.graphics.Rect r14, androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams r15, int r16, int r17) {
            r11 = this;
            r0 = r15
            int r1 = r0.gravity
            int r1 = resolveAnchoredChildGravity(r1)
            int r1 = androidx.core.view.GravityCompat.getAbsoluteGravity(r1, r12)
            int r2 = r0.anchorGravity
            int r2 = resolveGravity(r2)
            int r2 = androidx.core.view.GravityCompat.getAbsoluteGravity(r2, r12)
            r3 = r1 & 7
            r4 = r1 & 112(0x70, float:1.57E-43)
            r5 = r2 & 7
            r6 = r2 & 112(0x70, float:1.57E-43)
            switch(r5) {
                case 1: goto L26;
                case 5: goto L23;
                default: goto L20;
            }
        L20:
            int r7 = r13.left
            goto L2f
        L23:
            int r7 = r13.right
            goto L2f
        L26:
            int r7 = r13.left
            int r8 = r13.width()
            int r8 = r8 / 2
            int r7 = r7 + r8
        L2f:
            switch(r6) {
                case 16: goto L38;
                case 80: goto L35;
                default: goto L32;
            }
        L32:
            int r8 = r13.top
            goto L41
        L35:
            int r8 = r13.bottom
            goto L41
        L38:
            int r8 = r13.top
            int r9 = r13.height()
            int r9 = r9 / 2
            int r8 = r8 + r9
        L41:
            switch(r3) {
                case 1: goto L48;
                case 5: goto L47;
                default: goto L44;
            }
        L44:
            int r7 = r7 - r16
            goto L4b
        L47:
            goto L4b
        L48:
            int r9 = r16 / 2
            int r7 = r7 - r9
        L4b:
            switch(r4) {
                case 16: goto L52;
                case 80: goto L51;
                default: goto L4e;
            }
        L4e:
            int r8 = r8 - r17
            goto L55
        L51:
            goto L55
        L52:
            int r9 = r17 / 2
            int r8 = r8 - r9
        L55:
            int r9 = r7 + r16
            int r10 = r8 + r17
            r14.set(r7, r8, r9, r10)
            return
    }

    private int getFullContentHeight() {
            r6 = this;
            r0 = 0
            r1 = 0
        L2:
            int r2 = r6.getChildCount()
            if (r1 >= r2) goto L21
            android.view.View r2 = r6.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r3 = r2.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r3 = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) r3
            int r4 = r2.getHeight()
            int r5 = r3.topMargin
            int r4 = r4 + r5
            int r5 = r3.bottomMargin
            int r4 = r4 + r5
            int r0 = r0 + r4
            int r1 = r1 + 1
            goto L2
        L21:
            return r0
    }

    private int getKeyline(int r5) {
            r4 = this;
            int[] r0 = r4.mKeylines
            r1 = 0
            java.lang.String r2 = "CoordinatorLayout"
            if (r0 != 0) goto L28
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "No keylines defined for "
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.StringBuilder r0 = r0.append(r4)
            java.lang.String r3 = " - attempted index lookup "
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.StringBuilder r0 = r0.append(r5)
            java.lang.String r0 = r0.toString()
            android.util.Log.e(r2, r0)
            return r1
        L28:
            if (r5 < 0) goto L35
            int[] r0 = r4.mKeylines
            int r0 = r0.length
            if (r5 < r0) goto L30
            goto L35
        L30:
            int[] r0 = r4.mKeylines
            r0 = r0[r5]
            return r0
        L35:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "Keyline index "
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.StringBuilder r0 = r0.append(r5)
            java.lang.String r3 = " out of range for "
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.StringBuilder r0 = r0.append(r4)
            java.lang.String r0 = r0.toString()
            android.util.Log.e(r2, r0)
            return r1
    }

    private void getTopSortedChildren(java.util.List<android.view.View> r6) {
            r5 = this;
            r6.clear()
            boolean r0 = r5.isChildrenDrawingOrderEnabled()
            int r1 = r5.getChildCount()
            int r2 = r1 + (-1)
        Ld:
            if (r2 < 0) goto L21
            if (r0 == 0) goto L16
            int r3 = r5.getChildDrawingOrder(r1, r2)
            goto L17
        L16:
            r3 = r2
        L17:
            android.view.View r4 = r5.getChildAt(r3)
            r6.add(r4)
            int r2 = r2 + (-1)
            goto Ld
        L21:
            java.util.Comparator<android.view.View> r2 = androidx.coordinatorlayout.widget.CoordinatorLayout.TOP_SORTED_CHILDREN_COMPARATOR
            if (r2 == 0) goto L2a
            java.util.Comparator<android.view.View> r2 = androidx.coordinatorlayout.widget.CoordinatorLayout.TOP_SORTED_CHILDREN_COMPARATOR
            java.util.Collections.sort(r6, r2)
        L2a:
            return
    }

    private boolean hasDependencies(android.view.View r2) {
            r1 = this;
            androidx.coordinatorlayout.widget.DirectedAcyclicGraph<android.view.View> r0 = r1.mChildDag
            boolean r0 = r0.hasOutgoingEdges(r2)
            return r0
    }

    private void layoutChild(android.view.View r8, int r9) {
            r7 = this;
            android.view.ViewGroup$LayoutParams r0 = r8.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) r0
            android.graphics.Rect r4 = acquireTempRect()
            int r1 = r7.getPaddingLeft()
            int r2 = r0.leftMargin
            int r1 = r1 + r2
            int r2 = r7.getPaddingTop()
            int r3 = r0.topMargin
            int r2 = r2 + r3
            int r3 = r7.getWidth()
            int r5 = r7.getPaddingRight()
            int r3 = r3 - r5
            int r5 = r0.rightMargin
            int r3 = r3 - r5
            int r5 = r7.getHeight()
            int r6 = r7.getPaddingBottom()
            int r5 = r5 - r6
            int r6 = r0.bottomMargin
            int r5 = r5 - r6
            r4.set(r1, r2, r3, r5)
            androidx.core.view.WindowInsetsCompat r1 = r7.mLastInsets
            if (r1 == 0) goto L6f
            boolean r1 = androidx.core.view.ViewCompat.getFitsSystemWindows(r7)
            if (r1 == 0) goto L6f
            boolean r1 = androidx.core.view.ViewCompat.getFitsSystemWindows(r8)
            if (r1 != 0) goto L6f
            int r1 = r4.left
            androidx.core.view.WindowInsetsCompat r2 = r7.mLastInsets
            int r2 = r2.getSystemWindowInsetLeft()
            int r1 = r1 + r2
            r4.left = r1
            int r1 = r4.top
            androidx.core.view.WindowInsetsCompat r2 = r7.mLastInsets
            int r2 = r2.getSystemWindowInsetTop()
            int r1 = r1 + r2
            r4.top = r1
            int r1 = r4.right
            androidx.core.view.WindowInsetsCompat r2 = r7.mLastInsets
            int r2 = r2.getSystemWindowInsetRight()
            int r1 = r1 - r2
            r4.right = r1
            int r1 = r4.bottom
            androidx.core.view.WindowInsetsCompat r2 = r7.mLastInsets
            int r2 = r2.getSystemWindowInsetBottom()
            int r1 = r1 - r2
            r4.bottom = r1
        L6f:
            android.graphics.Rect r5 = acquireTempRect()
            int r1 = r0.gravity
            int r1 = resolveGravity(r1)
            int r2 = r8.getMeasuredWidth()
            int r3 = r8.getMeasuredHeight()
            r6 = r9
            androidx.core.view.GravityCompat.apply(r1, r2, r3, r4, r5, r6)
            int r9 = r5.left
            int r1 = r5.top
            int r2 = r5.right
            int r3 = r5.bottom
            r8.layout(r9, r1, r2, r3)
            releaseTempRect(r4)
            releaseTempRect(r5)
            return
    }

    private void layoutChildWithAnchor(android.view.View r7, android.view.View r8, int r9) {
            r6 = this;
            android.graphics.Rect r0 = acquireTempRect()
            android.graphics.Rect r1 = acquireTempRect()
            r6.getDescendantRect(r8, r0)     // Catch: java.lang.Throwable -> L21
            r6.getDesiredAnchoredChildRect(r7, r9, r0, r1)     // Catch: java.lang.Throwable -> L21
            int r2 = r1.left     // Catch: java.lang.Throwable -> L21
            int r3 = r1.top     // Catch: java.lang.Throwable -> L21
            int r4 = r1.right     // Catch: java.lang.Throwable -> L21
            int r5 = r1.bottom     // Catch: java.lang.Throwable -> L21
            r7.layout(r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L21
            releaseTempRect(r0)
            releaseTempRect(r1)
            return
        L21:
            r2 = move-exception
            releaseTempRect(r0)
            releaseTempRect(r1)
            throw r2
    }

    private void layoutChildWithKeyline(android.view.View r17, int r18, int r19) {
            r16 = this;
            r0 = r19
            android.view.ViewGroup$LayoutParams r1 = r17.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r1 = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) r1
            int r2 = r1.gravity
            int r2 = resolveKeylineGravity(r2)
            int r2 = androidx.core.view.GravityCompat.getAbsoluteGravity(r2, r0)
            r3 = r2 & 7
            r4 = r2 & 112(0x70, float:1.57E-43)
            int r5 = r16.getWidth()
            int r6 = r16.getHeight()
            int r7 = r17.getMeasuredWidth()
            int r8 = r17.getMeasuredHeight()
            r9 = 1
            if (r0 != r9) goto L2c
            int r9 = r5 - r18
            goto L2e
        L2c:
            r9 = r18
        L2e:
            r10 = r16
            int r11 = r10.getKeyline(r9)
            int r11 = r11 - r7
            r12 = 0
            switch(r3) {
                case 1: goto L3c;
                case 5: goto L3a;
                default: goto L39;
            }
        L39:
            goto L3f
        L3a:
            int r11 = r11 + r7
            goto L3f
        L3c:
            int r13 = r7 / 2
            int r11 = r11 + r13
        L3f:
            switch(r4) {
                case 16: goto L45;
                case 80: goto L43;
                default: goto L42;
            }
        L42:
            goto L48
        L43:
            int r12 = r12 + r8
            goto L48
        L45:
            int r13 = r8 / 2
            int r12 = r12 + r13
        L48:
            int r13 = r10.getPaddingLeft()
            int r14 = r1.leftMargin
            int r13 = r13 + r14
            int r14 = r10.getPaddingRight()
            int r14 = r5 - r14
            int r14 = r14 - r7
            int r15 = r1.rightMargin
            int r14 = r14 - r15
            int r14 = java.lang.Math.min(r11, r14)
            int r11 = java.lang.Math.max(r13, r14)
            int r13 = r10.getPaddingTop()
            int r14 = r1.topMargin
            int r13 = r13 + r14
            int r14 = r10.getPaddingBottom()
            int r14 = r6 - r14
            int r14 = r14 - r8
            int r15 = r1.bottomMargin
            int r14 = r14 - r15
            int r14 = java.lang.Math.min(r12, r14)
            int r12 = java.lang.Math.max(r13, r14)
            int r13 = r11 + r7
            int r14 = r12 + r8
            r15 = r17
            r15.layout(r11, r12, r13, r14)
            return
    }

    private int lineDelta() {
            r2 = this;
            int r0 = r2.getHeight()
            float r0 = (float) r0
            r1 = 1045220557(0x3e4ccccd, float:0.2)
            float r0 = r0 * r1
            int r0 = (int) r0
            return r0
    }

    private boolean manuallyTriggersNestedScrollFromKeyEvent(android.view.View r11, int r12) {
            r10 = this;
            r8 = 0
            r2 = 2
            r9 = 1
            r10.onStartNestedScroll(r10, r11, r2, r9)
            int[] r4 = r10.mKeyTriggeredScrollConsumed
            r5 = 1
            r2 = 0
            r0 = r10
            r1 = r11
            r3 = r12
            r0.onNestedPreScroll(r1, r2, r3, r4, r5)
            int[] r1 = r10.mKeyTriggeredScrollConsumed
            r3 = r1[r9]
            int[] r1 = r10.mKeyTriggeredScrollConsumed
            r1[r2] = r2
            int[] r1 = r10.mKeyTriggeredScrollConsumed
            r1[r9] = r2
            r6 = 1
            int[] r7 = r10.mKeyTriggeredScrollConsumed
            r4 = 0
            r1 = r11
            r5 = r12
            r0.onNestedScroll(r1, r2, r3, r4, r5, r6, r7)
            r10.onStopNestedScroll(r11, r9)
            int[] r2 = r10.mKeyTriggeredScrollConsumed
            r2 = r2[r9]
            if (r2 <= 0) goto L2f
            r8 = 1
        L2f:
            return r8
    }

    private boolean moveVertically(int r3) {
            r2 = this;
            android.view.View r0 = r2.findDeepestFocusedChild(r2)
            boolean r1 = r2.manuallyTriggersNestedScrollFromKeyEvent(r0, r3)
            return r1
    }

    private android.view.MotionEvent obtainCancelEvent(android.view.MotionEvent r3) {
            r2 = this;
            android.view.MotionEvent r0 = android.view.MotionEvent.obtain(r3)
            r1 = 3
            r0.setAction(r1)
            return r0
    }

    private void offsetChildByInset(android.view.View r11, android.graphics.Rect r12, int r13) {
            r10 = this;
            boolean r0 = r11.isLaidOut()
            if (r0 != 0) goto L7
            return
        L7:
            int r0 = r11.getWidth()
            if (r0 <= 0) goto L109
            int r0 = r11.getHeight()
            if (r0 > 0) goto L15
            goto L109
        L15:
            android.view.ViewGroup$LayoutParams r0 = r11.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) r0
            androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r1 = r0.getBehavior()
            android.graphics.Rect r2 = acquireTempRect()
            android.graphics.Rect r3 = acquireTempRect()
            int r4 = r11.getLeft()
            int r5 = r11.getTop()
            int r6 = r11.getRight()
            int r7 = r11.getBottom()
            r3.set(r4, r5, r6, r7)
            if (r1 == 0) goto L74
            boolean r4 = r1.getInsetDodgeRect(r10, r11, r2)
            if (r4 == 0) goto L74
            boolean r4 = r3.contains(r2)
            if (r4 == 0) goto L49
            goto L77
        L49:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Rect should be within the child's bounds. Rect:"
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r6 = r2.toShortString()
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r6 = " | Bounds:"
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r6 = r3.toShortString()
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L74:
            r2.set(r3)
        L77:
            releaseTempRect(r3)
            boolean r4 = r2.isEmpty()
            if (r4 == 0) goto L84
            releaseTempRect(r2)
            return
        L84:
            int r4 = r0.dodgeInsetEdges
            int r4 = androidx.core.view.GravityCompat.getAbsoluteGravity(r4, r13)
            r5 = 0
            r6 = r4 & 48
            r7 = 48
            if (r6 != r7) goto La4
            int r6 = r2.top
            int r7 = r0.topMargin
            int r6 = r6 - r7
            int r7 = r0.mInsetOffsetY
            int r6 = r6 - r7
            int r7 = r12.top
            if (r6 >= r7) goto La4
            int r7 = r12.top
            int r7 = r7 - r6
            r10.setInsetOffsetY(r11, r7)
            r5 = 1
        La4:
            r6 = r4 & 80
            r7 = 80
            if (r6 != r7) goto Lc3
            int r6 = r10.getHeight()
            int r7 = r2.bottom
            int r6 = r6 - r7
            int r7 = r0.bottomMargin
            int r6 = r6 - r7
            int r7 = r0.mInsetOffsetY
            int r6 = r6 + r7
            int r7 = r12.bottom
            if (r6 >= r7) goto Lc3
            int r7 = r12.bottom
            int r7 = r6 - r7
            r10.setInsetOffsetY(r11, r7)
            r5 = 1
        Lc3:
            r6 = 0
            if (r5 != 0) goto Lc9
            r10.setInsetOffsetY(r11, r6)
        Lc9:
            r7 = 0
            r8 = r4 & 3
            r9 = 3
            if (r8 != r9) goto Le2
            int r8 = r2.left
            int r9 = r0.leftMargin
            int r8 = r8 - r9
            int r9 = r0.mInsetOffsetX
            int r8 = r8 - r9
            int r9 = r12.left
            if (r8 >= r9) goto Le2
            int r9 = r12.left
            int r9 = r9 - r8
            r10.setInsetOffsetX(r11, r9)
            r7 = 1
        Le2:
            r8 = r4 & 5
            r9 = 5
            if (r8 != r9) goto L100
            int r8 = r10.getWidth()
            int r9 = r2.right
            int r8 = r8 - r9
            int r9 = r0.rightMargin
            int r8 = r8 - r9
            int r9 = r0.mInsetOffsetX
            int r8 = r8 + r9
            int r9 = r12.right
            if (r8 >= r9) goto L100
            int r9 = r12.right
            int r9 = r8 - r9
            r10.setInsetOffsetX(r11, r9)
            r7 = 1
        L100:
            if (r7 != 0) goto L105
            r10.setInsetOffsetX(r11, r6)
        L105:
            releaseTempRect(r2)
            return
        L109:
            return
    }

    private int pageDelta() {
            r1 = this;
            int r0 = r1.getHeight()
            return r0
    }

    static androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior parseBehavior(android.content.Context r5, android.util.AttributeSet r6, java.lang.String r7) {
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 == 0) goto L8
            r0 = 0
            return r0
        L8:
            java.lang.String r0 = "."
            boolean r0 = r7.startsWith(r0)
            if (r0 == 0) goto L26
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r5.getPackageName()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r7)
            java.lang.String r0 = r0.toString()
            goto L52
        L26:
            r0 = 46
            int r1 = r7.indexOf(r0)
            if (r1 < 0) goto L30
            r0 = r7
            goto L52
        L30:
            java.lang.String r1 = androidx.coordinatorlayout.widget.CoordinatorLayout.WIDGET_PACKAGE_NAME
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L50
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = androidx.coordinatorlayout.widget.CoordinatorLayout.WIDGET_PACKAGE_NAME
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.StringBuilder r0 = r0.append(r7)
            java.lang.String r0 = r0.toString()
            goto L51
        L50:
            r0 = r7
        L51:
        L52:
            java.lang.ThreadLocal<java.util.Map<java.lang.String, java.lang.reflect.Constructor<androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior>>> r1 = androidx.coordinatorlayout.widget.CoordinatorLayout.sConstructors     // Catch: java.lang.Exception -> L92
            java.lang.Object r1 = r1.get()     // Catch: java.lang.Exception -> L92
            java.util.Map r1 = (java.util.Map) r1     // Catch: java.lang.Exception -> L92
            if (r1 != 0) goto L67
            java.util.HashMap r2 = new java.util.HashMap     // Catch: java.lang.Exception -> L92
            r2.<init>()     // Catch: java.lang.Exception -> L92
            r1 = r2
            java.lang.ThreadLocal<java.util.Map<java.lang.String, java.lang.reflect.Constructor<androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior>>> r2 = androidx.coordinatorlayout.widget.CoordinatorLayout.sConstructors     // Catch: java.lang.Exception -> L92
            r2.set(r1)     // Catch: java.lang.Exception -> L92
        L67:
            java.lang.Object r2 = r1.get(r0)     // Catch: java.lang.Exception -> L92
            java.lang.reflect.Constructor r2 = (java.lang.reflect.Constructor) r2     // Catch: java.lang.Exception -> L92
            if (r2 != 0) goto L87
        L70:
            java.lang.ClassLoader r3 = r5.getClassLoader()     // Catch: java.lang.Exception -> L92
            r4 = 0
            java.lang.Class r3 = java.lang.Class.forName(r0, r4, r3)     // Catch: java.lang.Exception -> L92
            java.lang.Class<?>[] r4 = androidx.coordinatorlayout.widget.CoordinatorLayout.CONSTRUCTOR_PARAMS     // Catch: java.lang.Exception -> L92
            java.lang.reflect.Constructor r4 = r3.getConstructor(r4)     // Catch: java.lang.Exception -> L92
            r2 = r4
            r4 = 1
            r2.setAccessible(r4)     // Catch: java.lang.Exception -> L92
            r1.put(r0, r2)     // Catch: java.lang.Exception -> L92
        L87:
            java.lang.Object[] r3 = new java.lang.Object[]{r5, r6}     // Catch: java.lang.Exception -> L92
            java.lang.Object r3 = r2.newInstance(r3)     // Catch: java.lang.Exception -> L92
            androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r3 = (androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior) r3     // Catch: java.lang.Exception -> L92
            return r3
        L92:
            r1 = move-exception
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Could not inflate Behavior subclass "
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3, r1)
            throw r2
    }

    private boolean performEvent(androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior r2, android.view.View r3, android.view.MotionEvent r4, int r5) {
            r1 = this;
            switch(r5) {
                case 0: goto Le;
                case 1: goto L9;
                default: goto L3;
            }
        L3:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
        L9:
            boolean r0 = r2.onTouchEvent(r1, r3, r4)
            return r0
        Le:
            boolean r0 = r2.onInterceptTouchEvent(r1, r3, r4)
            return r0
    }

    private boolean performIntercept(android.view.MotionEvent r18, int r19) {
            r17 = this;
            r0 = r17
            r1 = r19
            r2 = 0
            r3 = 0
            int r4 = r18.getActionMasked()
            r5 = 0
            java.util.List<android.view.View> r6 = r0.mTempList1
            r0.getTopSortedChildren(r6)
            int r7 = r6.size()
            r8 = 0
        L15:
            if (r8 >= r7) goto L91
            java.lang.Object r9 = r6.get(r8)
            android.view.View r9 = (android.view.View) r9
            android.view.ViewGroup$LayoutParams r10 = r9.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r10 = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) r10
            androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r11 = r10.getBehavior()
            if (r2 != 0) goto L2b
            if (r3 == 0) goto L3e
        L2b:
            if (r4 == 0) goto L3e
            if (r11 == 0) goto L3b
            if (r5 != 0) goto L35
            android.view.MotionEvent r5 = r17.obtainCancelEvent(r18)
        L35:
            r0.performEvent(r11, r9, r5, r1)
            r13 = r18
            goto L8e
        L3b:
            r13 = r18
            goto L8e
        L3e:
            r12 = 1
            if (r3 != 0) goto L77
            if (r2 != 0) goto L77
            if (r11 == 0) goto L77
            r13 = r18
            boolean r2 = r0.performEvent(r11, r9, r13, r1)
            if (r2 == 0) goto L79
            r0.mBehaviorTouchView = r9
            r14 = 3
            if (r4 == r14) goto L79
            if (r4 == r12) goto L79
            r14 = 0
        L55:
            if (r14 >= r8) goto L79
            java.lang.Object r15 = r6.get(r14)
            android.view.View r15 = (android.view.View) r15
            android.view.ViewGroup$LayoutParams r16 = r15.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r16 = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) r16
            androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r12 = r16.getBehavior()
            if (r12 == 0) goto L73
            if (r5 != 0) goto L70
            android.view.MotionEvent r5 = r17.obtainCancelEvent(r18)
        L70:
            r0.performEvent(r12, r15, r5, r1)
        L73:
            int r14 = r14 + 1
            r12 = 1
            goto L55
        L77:
            r13 = r18
        L79:
            boolean r12 = r10.didBlockInteraction()
            boolean r14 = r10.isBlockingInteractionBelow(r0, r9)
            if (r14 == 0) goto L87
            if (r12 != 0) goto L87
            r15 = 1
            goto L88
        L87:
            r15 = 0
        L88:
            r3 = r15
            if (r14 == 0) goto L8e
            if (r3 != 0) goto L8e
            goto L93
        L8e:
            int r8 = r8 + 1
            goto L15
        L91:
            r13 = r18
        L93:
            r6.clear()
            if (r5 == 0) goto L9b
            r5.recycle()
        L9b:
            return r2
    }

    private void prepareChildren() {
            r7 = this;
            java.util.List<android.view.View> r0 = r7.mDependencySortedChildren
            r0.clear()
            androidx.coordinatorlayout.widget.DirectedAcyclicGraph<android.view.View> r0 = r7.mChildDag
            r0.clear()
            r0 = 0
            int r1 = r7.getChildCount()
        Lf:
            if (r0 >= r1) goto L49
            android.view.View r2 = r7.getChildAt(r0)
            androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r3 = r7.getResolvedLayoutParams(r2)
            r3.findAnchorView(r7, r2)
            androidx.coordinatorlayout.widget.DirectedAcyclicGraph<android.view.View> r4 = r7.mChildDag
            r4.addNode(r2)
            r4 = 0
        L22:
            if (r4 >= r1) goto L46
            if (r4 != r0) goto L27
            goto L43
        L27:
            android.view.View r5 = r7.getChildAt(r4)
            boolean r6 = r3.dependsOn(r7, r2, r5)
            if (r6 == 0) goto L43
            androidx.coordinatorlayout.widget.DirectedAcyclicGraph<android.view.View> r6 = r7.mChildDag
            boolean r6 = r6.contains(r5)
            if (r6 != 0) goto L3e
            androidx.coordinatorlayout.widget.DirectedAcyclicGraph<android.view.View> r6 = r7.mChildDag
            r6.addNode(r5)
        L3e:
            androidx.coordinatorlayout.widget.DirectedAcyclicGraph<android.view.View> r6 = r7.mChildDag
            r6.addEdge(r5, r2)
        L43:
            int r4 = r4 + 1
            goto L22
        L46:
            int r0 = r0 + 1
            goto Lf
        L49:
            java.util.List<android.view.View> r0 = r7.mDependencySortedChildren
            androidx.coordinatorlayout.widget.DirectedAcyclicGraph<android.view.View> r1 = r7.mChildDag
            java.util.ArrayList r1 = r1.getSortedList()
            r0.addAll(r1)
            java.util.List<android.view.View> r0 = r7.mDependencySortedChildren
            java.util.Collections.reverse(r0)
            return
    }

    private static void releaseTempRect(android.graphics.Rect r1) {
            r1.setEmpty()
            androidx.core.util.Pools$Pool<android.graphics.Rect> r0 = androidx.coordinatorlayout.widget.CoordinatorLayout.sRectPool
            r0.release(r1)
            return
    }

    private void resetTouchBehaviors() {
            r10 = this;
            android.view.View r0 = r10.mBehaviorTouchView
            if (r0 == 0) goto L2a
            android.view.View r0 = r10.mBehaviorTouchView
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) r0
            androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r1 = r0.getBehavior()
            if (r1 == 0) goto L27
            long r2 = android.os.SystemClock.uptimeMillis()
            r8 = 0
            r9 = 0
            r6 = 3
            r7 = 0
            r4 = r2
            android.view.MotionEvent r4 = android.view.MotionEvent.obtain(r2, r4, r6, r7, r8, r9)
            android.view.View r5 = r10.mBehaviorTouchView
            r1.onTouchEvent(r10, r5, r4)
            r4.recycle()
        L27:
            r2 = 0
            r10.mBehaviorTouchView = r2
        L2a:
            int r0 = r10.getChildCount()
            r1 = 0
        L2f:
            if (r1 >= r0) goto L41
            android.view.View r2 = r10.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r3 = r2.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r3 = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) r3
            r3.resetTouchBehaviorTracking()
            int r1 = r1 + 1
            goto L2f
        L41:
            r1 = 0
            r10.mDisallowInterceptReset = r1
            return
    }

    private static int resolveAnchoredChildGravity(int r1) {
            if (r1 != 0) goto L5
            r0 = 17
            goto L6
        L5:
            r0 = r1
        L6:
            return r0
    }

    private static int resolveGravity(int r1) {
            r0 = r1 & 7
            if (r0 != 0) goto L8
            r0 = 8388611(0x800003, float:1.1754948E-38)
            r1 = r1 | r0
        L8:
            r0 = r1 & 112(0x70, float:1.57E-43)
            if (r0 != 0) goto Le
            r1 = r1 | 48
        Le:
            return r1
    }

    private static int resolveKeylineGravity(int r1) {
            if (r1 != 0) goto L6
            r0 = 8388661(0x800035, float:1.1755018E-38)
            goto L7
        L6:
            r0 = r1
        L7:
            return r0
    }

    private void setInsetOffsetX(android.view.View r3, int r4) {
            r2 = this;
            android.view.ViewGroup$LayoutParams r0 = r3.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) r0
            int r1 = r0.mInsetOffsetX
            if (r1 == r4) goto L13
            int r1 = r0.mInsetOffsetX
            int r1 = r4 - r1
            androidx.core.view.ViewCompat.offsetLeftAndRight(r3, r1)
            r0.mInsetOffsetX = r4
        L13:
            return
    }

    private void setInsetOffsetY(android.view.View r3, int r4) {
            r2 = this;
            android.view.ViewGroup$LayoutParams r0 = r3.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) r0
            int r1 = r0.mInsetOffsetY
            if (r1 == r4) goto L13
            int r1 = r0.mInsetOffsetY
            int r1 = r4 - r1
            androidx.core.view.ViewCompat.offsetTopAndBottom(r3, r1)
            r0.mInsetOffsetY = r4
        L13:
            return
    }

    private void setupForInsets() {
            r1 = this;
            boolean r0 = androidx.core.view.ViewCompat.getFitsSystemWindows(r1)
            if (r0 == 0) goto L1d
            androidx.core.view.OnApplyWindowInsetsListener r0 = r1.mApplyWindowInsetsListener
            if (r0 != 0) goto L12
            androidx.coordinatorlayout.widget.CoordinatorLayout$1 r0 = new androidx.coordinatorlayout.widget.CoordinatorLayout$1
            r0.<init>(r1)
            r1.mApplyWindowInsetsListener = r0
        L12:
            androidx.core.view.OnApplyWindowInsetsListener r0 = r1.mApplyWindowInsetsListener
            androidx.core.view.ViewCompat.setOnApplyWindowInsetsListener(r1, r0)
            r0 = 1280(0x500, float:1.794E-42)
            r1.setSystemUiVisibility(r0)
            goto L21
        L1d:
            r0 = 0
            androidx.core.view.ViewCompat.setOnApplyWindowInsetsListener(r1, r0)
        L21:
            return
    }

    void addPreDrawListener() {
            r2 = this;
            boolean r0 = r2.mIsAttachedToWindow
            if (r0 == 0) goto L18
            androidx.coordinatorlayout.widget.CoordinatorLayout$OnPreDrawListener r0 = r2.mOnPreDrawListener
            if (r0 != 0) goto Lf
            androidx.coordinatorlayout.widget.CoordinatorLayout$OnPreDrawListener r0 = new androidx.coordinatorlayout.widget.CoordinatorLayout$OnPreDrawListener
            r0.<init>(r2)
            r2.mOnPreDrawListener = r0
        Lf:
            android.view.ViewTreeObserver r0 = r2.getViewTreeObserver()
            androidx.coordinatorlayout.widget.CoordinatorLayout$OnPreDrawListener r1 = r2.mOnPreDrawListener
            r0.addOnPreDrawListener(r1)
        L18:
            r0 = 1
            r2.mNeedsPreDrawListener = r0
            return
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams r2) {
            r1 = this;
            boolean r0 = r2 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams
            if (r0 == 0) goto Lc
            boolean r0 = super.checkLayoutParams(r2)
            if (r0 == 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    public void dispatchDependentViewsChanged(android.view.View r6) {
            r5 = this;
            androidx.coordinatorlayout.widget.DirectedAcyclicGraph<android.view.View> r0 = r5.mChildDag
            java.util.ArrayList r0 = r0.getIncomingEdgesInternal(r6)
            if (r0 == 0) goto L2e
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L2e
            r1 = 0
        Lf:
            int r2 = r0.size()
            if (r1 >= r2) goto L2e
            java.lang.Object r2 = r0.get(r1)
            android.view.View r2 = (android.view.View) r2
            android.view.ViewGroup$LayoutParams r3 = r2.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r3 = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) r3
            androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r4 = r3.getBehavior()
            if (r4 == 0) goto L2b
            r4.onDependentViewChanged(r5, r2, r6)
        L2b:
            int r1 = r1 + 1
            goto Lf
        L2e:
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(android.view.KeyEvent r3) {
            r2 = this;
            boolean r0 = super.dispatchKeyEvent(r3)
            if (r0 != 0) goto L84
            int r1 = r3.getAction()
            if (r1 != 0) goto L84
            int r1 = r3.getKeyCode()
            switch(r1) {
                case 19: goto L6a;
                case 20: goto L52;
                case 62: goto L3a;
                case 92: goto L30;
                case 93: goto L27;
                case 122: goto L1e;
                case 123: goto L15;
                default: goto L13;
            }
        L13:
            goto L84
        L15:
            int r1 = r2.distanceToBottom()
            boolean r0 = r2.moveVertically(r1)
            goto L84
        L1e:
            int r1 = r2.distanceToTop()
            boolean r0 = r2.moveVertically(r1)
            goto L84
        L27:
            int r1 = r2.pageDelta()
            boolean r0 = r2.moveVertically(r1)
            goto L84
        L30:
            int r1 = r2.pageDelta()
            int r1 = -r1
            boolean r0 = r2.moveVertically(r1)
            goto L84
        L3a:
            boolean r1 = r3.isShiftPressed()
            if (r1 == 0) goto L49
            int r1 = r2.distanceToTop()
            boolean r0 = r2.moveVertically(r1)
            goto L84
        L49:
            int r1 = r2.distanceToBottom()
            boolean r0 = r2.moveVertically(r1)
            goto L84
        L52:
            boolean r1 = r3.isAltPressed()
            if (r1 == 0) goto L61
            int r1 = r2.pageDelta()
            boolean r0 = r2.moveVertically(r1)
            goto L84
        L61:
            int r1 = r2.lineDelta()
            boolean r0 = r2.moveVertically(r1)
            goto L84
        L6a:
            boolean r1 = r3.isAltPressed()
            if (r1 == 0) goto L7a
            int r1 = r2.pageDelta()
            int r1 = -r1
            boolean r0 = r2.moveVertically(r1)
            goto L84
        L7a:
            int r1 = r2.lineDelta()
            int r1 = -r1
            boolean r0 = r2.moveVertically(r1)
        L84:
            return r0
    }

    public boolean doViewsOverlap(android.view.View r7, android.view.View r8) {
            r6 = this;
            int r0 = r7.getVisibility()
            r1 = 0
            if (r0 != 0) goto L56
            int r0 = r8.getVisibility()
            if (r0 != 0) goto L56
            android.graphics.Rect r0 = acquireTempRect()
            android.view.ViewParent r2 = r7.getParent()
            r3 = 1
            if (r2 == r6) goto L1a
            r2 = r3
            goto L1b
        L1a:
            r2 = r1
        L1b:
            r6.getChildRect(r7, r2, r0)
            android.graphics.Rect r2 = acquireTempRect()
            android.view.ViewParent r4 = r8.getParent()
            if (r4 == r6) goto L2a
            r4 = r3
            goto L2b
        L2a:
            r4 = r1
        L2b:
            r6.getChildRect(r8, r4, r2)
            int r4 = r0.left     // Catch: java.lang.Throwable -> L4e
            int r5 = r2.right     // Catch: java.lang.Throwable -> L4e
            if (r4 > r5) goto L47
            int r4 = r0.top     // Catch: java.lang.Throwable -> L4e
            int r5 = r2.bottom     // Catch: java.lang.Throwable -> L4e
            if (r4 > r5) goto L47
            int r4 = r0.right     // Catch: java.lang.Throwable -> L4e
            int r5 = r2.left     // Catch: java.lang.Throwable -> L4e
            if (r4 < r5) goto L47
            int r4 = r0.bottom     // Catch: java.lang.Throwable -> L4e
            int r5 = r2.top     // Catch: java.lang.Throwable -> L4e
            if (r4 < r5) goto L47
            r1 = r3
        L47:
            releaseTempRect(r0)
            releaseTempRect(r2)
            return r1
        L4e:
            r1 = move-exception
            releaseTempRect(r0)
            releaseTempRect(r2)
            throw r1
        L56:
            return r1
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(android.graphics.Canvas r19, android.view.View r20, long r21) {
            r18 = this;
            r0 = r18
            r1 = r20
            android.view.ViewGroup$LayoutParams r2 = r1.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r2 = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) r2
            androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r3 = r2.mBehavior
            if (r3 == 0) goto L97
            androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r3 = r2.mBehavior
            float r3 = r3.getScrimOpacity(r0, r1)
            r4 = 0
            int r4 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r4 <= 0) goto L94
            android.graphics.Paint r4 = r0.mScrimPaint
            if (r4 != 0) goto L24
            android.graphics.Paint r4 = new android.graphics.Paint
            r4.<init>()
            r0.mScrimPaint = r4
        L24:
            android.graphics.Paint r4 = r0.mScrimPaint
            androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r5 = r2.mBehavior
            int r5 = r5.getScrimColor(r0, r1)
            r4.setColor(r5)
            android.graphics.Paint r4 = r0.mScrimPaint
            r5 = 1132396544(0x437f0000, float:255.0)
            float r5 = r5 * r3
            int r5 = java.lang.Math.round(r5)
            r6 = 0
            r7 = 255(0xff, float:3.57E-43)
            int r5 = clamp(r5, r6, r7)
            r4.setAlpha(r5)
            int r4 = r19.save()
            boolean r5 = r1.isOpaque()
            if (r5 == 0) goto L67
            int r5 = r1.getLeft()
            float r7 = (float) r5
            int r5 = r1.getTop()
            float r8 = (float) r5
            int r5 = r1.getRight()
            float r9 = (float) r5
            int r5 = r1.getBottom()
            float r10 = (float) r5
            android.graphics.Region$Op r11 = android.graphics.Region.Op.DIFFERENCE
            r6 = r19
            r6.clipRect(r7, r8, r9, r10, r11)
        L67:
            int r5 = r0.getPaddingLeft()
            float r13 = (float) r5
            int r5 = r0.getPaddingTop()
            float r14 = (float) r5
            int r5 = r0.getWidth()
            int r6 = r0.getPaddingRight()
            int r5 = r5 - r6
            float r15 = (float) r5
            int r5 = r0.getHeight()
            int r6 = r0.getPaddingBottom()
            int r5 = r5 - r6
            float r5 = (float) r5
            android.graphics.Paint r6 = r0.mScrimPaint
            r12 = r19
            r16 = r5
            r17 = r6
            r12.drawRect(r13, r14, r15, r16, r17)
            r12.restoreToCount(r4)
            goto L99
        L94:
            r12 = r19
            goto L99
        L97:
            r12 = r19
        L99:
            boolean r3 = super.drawChild(r19, r20, r21)
            return r3
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
            r4 = this;
            super.drawableStateChanged()
            int[] r0 = r4.getDrawableState()
            r1 = 0
            android.graphics.drawable.Drawable r2 = r4.mStatusBarBackground
            if (r2 == 0) goto L17
            boolean r3 = r2.isStateful()
            if (r3 == 0) goto L17
            boolean r3 = r2.setState(r0)
            r1 = r1 | r3
        L17:
            if (r1 == 0) goto L1c
            r4.invalidate()
        L1c:
            return
    }

    void ensurePreDrawListener() {
            r5 = this;
            r0 = 0
            int r1 = r5.getChildCount()
            r2 = 0
        L6:
            if (r2 >= r1) goto L17
            android.view.View r3 = r5.getChildAt(r2)
            boolean r4 = r5.hasDependencies(r3)
            if (r4 == 0) goto L14
            r0 = 1
            goto L17
        L14:
            int r2 = r2 + 1
            goto L6
        L17:
            boolean r2 = r5.mNeedsPreDrawListener
            if (r0 == r2) goto L24
            if (r0 == 0) goto L21
            r5.addPreDrawListener()
            goto L24
        L21:
            r5.removePreDrawListener()
        L24:
            return
    }

    @Override // android.view.ViewGroup
    protected /* bridge */ /* synthetic */ android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
            r1 = this;
            androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r0 = r1.generateDefaultLayoutParams()
            return r0
    }

    @Override // android.view.ViewGroup
    protected androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams generateDefaultLayoutParams() {
            r2 = this;
            androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r0 = new androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams
            r1 = -2
            r0.<init>(r1, r1)
            return r0
    }

    @Override // android.view.ViewGroup
    public /* bridge */ /* synthetic */ android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet r1) {
            r0 = this;
            androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r1 = r0.generateLayoutParams(r1)
            return r1
    }

    @Override // android.view.ViewGroup
    protected /* bridge */ /* synthetic */ android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams r1) {
            r0 = this;
            androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r1 = r0.generateLayoutParams(r1)
            return r1
    }

    @Override // android.view.ViewGroup
    public androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams generateLayoutParams(android.util.AttributeSet r3) {
            r2 = this;
            androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r0 = new androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams
            android.content.Context r1 = r2.getContext()
            r0.<init>(r1, r3)
            return r0
    }

    @Override // android.view.ViewGroup
    protected androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams r3) {
            r2 = this;
            boolean r0 = r3 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams
            if (r0 == 0) goto Ld
            androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r0 = new androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams
            r1 = r3
            androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r1 = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) r1
            r0.<init>(r1)
            return r0
        Ld:
            boolean r0 = r3 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L1a
            androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r0 = new androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams
            r1 = r3
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            r0.<init>(r1)
            return r0
        L1a:
            androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r0 = new androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams
            r0.<init>(r3)
            return r0
    }

    void getChildRect(android.view.View r5, boolean r6, android.graphics.Rect r7) {
            r4 = this;
            boolean r0 = r5.isLayoutRequested()
            if (r0 != 0) goto L29
            int r0 = r5.getVisibility()
            r1 = 8
            if (r0 != r1) goto Lf
            goto L29
        Lf:
            if (r6 == 0) goto L15
            r4.getDescendantRect(r5, r7)
            goto L28
        L15:
            int r0 = r5.getLeft()
            int r1 = r5.getTop()
            int r2 = r5.getRight()
            int r3 = r5.getBottom()
            r7.set(r0, r1, r2, r3)
        L28:
            return
        L29:
            r7.setEmpty()
            return
    }

    public java.util.List<android.view.View> getDependencies(android.view.View r3) {
            r2 = this;
            androidx.coordinatorlayout.widget.DirectedAcyclicGraph<android.view.View> r0 = r2.mChildDag
            java.util.List r0 = r0.getOutgoingEdges(r3)
            if (r0 != 0) goto Ld
            java.util.List r1 = java.util.Collections.emptyList()
            goto Le
        Ld:
            r1 = r0
        Le:
            return r1
    }

    final java.util.List<android.view.View> getDependencySortedChildren() {
            r1 = this;
            r1.prepareChildren()
            java.util.List<android.view.View> r0 = r1.mDependencySortedChildren
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            return r0
    }

    public java.util.List<android.view.View> getDependents(android.view.View r3) {
            r2 = this;
            androidx.coordinatorlayout.widget.DirectedAcyclicGraph<android.view.View> r0 = r2.mChildDag
            java.util.List r0 = r0.getIncomingEdges(r3)
            if (r0 != 0) goto Ld
            java.util.List r1 = java.util.Collections.emptyList()
            goto Le
        Ld:
            r1 = r0
        Le:
            return r1
    }

    void getDescendantRect(android.view.View r1, android.graphics.Rect r2) {
            r0 = this;
            androidx.coordinatorlayout.widget.ViewGroupUtils.getDescendantRect(r0, r1, r2)
            return
    }

    void getDesiredAnchoredChildRect(android.view.View r9, int r10, android.graphics.Rect r11, android.graphics.Rect r12) {
            r8 = this;
            android.view.ViewGroup$LayoutParams r0 = r9.getLayoutParams()
            r5 = r0
            androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r5 = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) r5
            int r6 = r9.getMeasuredWidth()
            int r7 = r9.getMeasuredHeight()
            r1 = r8
            r2 = r10
            r3 = r11
            r4 = r12
            r1.getDesiredAnchoredChildRectWithoutConstraints(r2, r3, r4, r5, r6, r7)
            r8.constrainChildRect(r5, r4, r6, r7)
            return
    }

    void getLastChildRect(android.view.View r3, android.graphics.Rect r4) {
            r2 = this;
            android.view.ViewGroup$LayoutParams r0 = r3.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) r0
            android.graphics.Rect r1 = r0.getLastChildRect()
            r4.set(r1)
            return
    }

    public final androidx.core.view.WindowInsetsCompat getLastWindowInsets() {
            r1 = this;
            androidx.core.view.WindowInsetsCompat r0 = r1.mLastInsets
            return r0
    }

    @Override // android.view.ViewGroup, androidx.core.view.NestedScrollingParent
    public int getNestedScrollAxes() {
            r1 = this;
            androidx.core.view.NestedScrollingParentHelper r0 = r1.mNestedScrollingParentHelper
            int r0 = r0.getNestedScrollAxes()
            return r0
    }

    androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams getResolvedLayoutParams(android.view.View r9) {
            r8 = this;
            android.view.ViewGroup$LayoutParams r0 = r9.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) r0
            boolean r1 = r0.mBehaviorResolved
            if (r1 != 0) goto L7d
            boolean r1 = r9 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout.AttachedBehavior
            java.lang.String r2 = "CoordinatorLayout"
            r3 = 1
            if (r1 == 0) goto L25
            r1 = r9
            androidx.coordinatorlayout.widget.CoordinatorLayout$AttachedBehavior r1 = (androidx.coordinatorlayout.widget.CoordinatorLayout.AttachedBehavior) r1
            androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r1 = r1.getBehavior()
            if (r1 != 0) goto L1f
            java.lang.String r4 = "Attached behavior class is null"
            android.util.Log.e(r2, r4)
        L1f:
            r0.setBehavior(r1)
            r0.mBehaviorResolved = r3
            goto L7d
        L25:
            java.lang.Class r1 = r9.getClass()
            r4 = 0
        L2a:
            if (r1 == 0) goto L3c
            java.lang.Class<androidx.coordinatorlayout.widget.CoordinatorLayout$DefaultBehavior> r5 = androidx.coordinatorlayout.widget.CoordinatorLayout.DefaultBehavior.class
            java.lang.annotation.Annotation r5 = r1.getAnnotation(r5)
            androidx.coordinatorlayout.widget.CoordinatorLayout$DefaultBehavior r5 = (androidx.coordinatorlayout.widget.CoordinatorLayout.DefaultBehavior) r5
            r4 = r5
            if (r5 != 0) goto L3c
            java.lang.Class r1 = r1.getSuperclass()
            goto L2a
        L3c:
            if (r4 == 0) goto L7b
        L3f:
            java.lang.Class r5 = r4.value()     // Catch: java.lang.Exception -> L56
            r6 = 0
            java.lang.Class[] r7 = new java.lang.Class[r6]     // Catch: java.lang.Exception -> L56
            java.lang.reflect.Constructor r5 = r5.getDeclaredConstructor(r7)     // Catch: java.lang.Exception -> L56
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch: java.lang.Exception -> L56
            java.lang.Object r5 = r5.newInstance(r6)     // Catch: java.lang.Exception -> L56
            androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r5 = (androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior) r5     // Catch: java.lang.Exception -> L56
            r0.setBehavior(r5)     // Catch: java.lang.Exception -> L56
            goto L7b
        L56:
            r5 = move-exception
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "Default behavior class "
            java.lang.StringBuilder r6 = r6.append(r7)
            java.lang.Class r7 = r4.value()
            java.lang.String r7 = r7.getName()
            java.lang.StringBuilder r6 = r6.append(r7)
            java.lang.String r7 = " could not be instantiated. Did you forget a default constructor?"
            java.lang.StringBuilder r6 = r6.append(r7)
            java.lang.String r6 = r6.toString()
            android.util.Log.e(r2, r6, r5)
        L7b:
            r0.mBehaviorResolved = r3
        L7d:
            return r0
    }

    public android.graphics.drawable.Drawable getStatusBarBackground() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mStatusBarBackground
            return r0
    }

    @Override // android.view.View
    protected int getSuggestedMinimumHeight() {
            r3 = this;
            int r0 = super.getSuggestedMinimumHeight()
            int r1 = r3.getPaddingTop()
            int r2 = r3.getPaddingBottom()
            int r1 = r1 + r2
            int r0 = java.lang.Math.max(r0, r1)
            return r0
    }

    @Override // android.view.View
    protected int getSuggestedMinimumWidth() {
            r3 = this;
            int r0 = super.getSuggestedMinimumWidth()
            int r1 = r3.getPaddingLeft()
            int r2 = r3.getPaddingRight()
            int r1 = r1 + r2
            int r0 = java.lang.Math.max(r0, r1)
            return r0
    }

    public boolean isPointInChildBounds(android.view.View r3, int r4, int r5) {
            r2 = this;
            android.graphics.Rect r0 = acquireTempRect()
            r2.getDescendantRect(r3, r0)
            boolean r1 = r0.contains(r4, r5)     // Catch: java.lang.Throwable -> Lf
            releaseTempRect(r0)
            return r1
        Lf:
            r1 = move-exception
            releaseTempRect(r0)
            throw r1
    }

    void offsetChildToAnchor(android.view.View r13, int r14) {
            r12 = this;
            android.view.ViewGroup$LayoutParams r0 = r13.getLayoutParams()
            r5 = r0
            androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r5 = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) r5
            android.view.View r0 = r5.mAnchorView
            if (r0 == 0) goto L68
            android.graphics.Rect r3 = acquireTempRect()
            android.graphics.Rect r0 = acquireTempRect()
            android.graphics.Rect r4 = acquireTempRect()
            android.view.View r1 = r5.mAnchorView
            r12.getDescendantRect(r1, r3)
            r8 = 0
            r12.getChildRect(r13, r8, r0)
            int r6 = r13.getMeasuredWidth()
            int r7 = r13.getMeasuredHeight()
            r1 = r12
            r2 = r14
            r1.getDesiredAnchoredChildRectWithoutConstraints(r2, r3, r4, r5, r6, r7)
            int r14 = r4.left
            int r9 = r0.left
            if (r14 != r9) goto L39
            int r14 = r4.top
            int r9 = r0.top
            if (r14 == r9) goto L3a
        L39:
            r8 = 1
        L3a:
            r12.constrainChildRect(r5, r4, r6, r7)
            int r14 = r4.left
            int r9 = r0.left
            int r14 = r14 - r9
            int r9 = r4.top
            int r10 = r0.top
            int r9 = r9 - r10
            if (r14 == 0) goto L4c
            androidx.core.view.ViewCompat.offsetLeftAndRight(r13, r14)
        L4c:
            if (r9 == 0) goto L51
            androidx.core.view.ViewCompat.offsetTopAndBottom(r13, r9)
        L51:
            if (r8 == 0) goto L5e
            androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r10 = r5.getBehavior()
            if (r10 == 0) goto L5e
            android.view.View r11 = r5.mAnchorView
            r10.onDependentViewChanged(r12, r13, r11)
        L5e:
            releaseTempRect(r3)
            releaseTempRect(r0)
            releaseTempRect(r4)
            goto L6a
        L68:
            r1 = r12
            r2 = r14
        L6a:
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
            r2 = this;
            super.onAttachedToWindow()
            r2.resetTouchBehaviors()
            boolean r0 = r2.mNeedsPreDrawListener
            if (r0 == 0) goto L1e
            androidx.coordinatorlayout.widget.CoordinatorLayout$OnPreDrawListener r0 = r2.mOnPreDrawListener
            if (r0 != 0) goto L15
            androidx.coordinatorlayout.widget.CoordinatorLayout$OnPreDrawListener r0 = new androidx.coordinatorlayout.widget.CoordinatorLayout$OnPreDrawListener
            r0.<init>(r2)
            r2.mOnPreDrawListener = r0
        L15:
            android.view.ViewTreeObserver r0 = r2.getViewTreeObserver()
            androidx.coordinatorlayout.widget.CoordinatorLayout$OnPreDrawListener r1 = r2.mOnPreDrawListener
            r0.addOnPreDrawListener(r1)
        L1e:
            androidx.core.view.WindowInsetsCompat r0 = r2.mLastInsets
            if (r0 != 0) goto L2b
            boolean r0 = androidx.core.view.ViewCompat.getFitsSystemWindows(r2)
            if (r0 == 0) goto L2b
            androidx.core.view.ViewCompat.requestApplyInsets(r2)
        L2b:
            r0 = 1
            r2.mIsAttachedToWindow = r0
            return
    }

    final void onChildViewsChanged(int r15) {
            r14 = this;
            int r0 = r14.getLayoutDirection()
            java.util.List<android.view.View> r1 = r14.mDependencySortedChildren
            int r1 = r1.size()
            android.graphics.Rect r2 = acquireTempRect()
            android.graphics.Rect r3 = acquireTempRect()
            android.graphics.Rect r4 = acquireTempRect()
            r5 = 0
        L17:
            if (r5 >= r1) goto Lfe
            java.util.List<android.view.View> r6 = r14.mDependencySortedChildren
            java.lang.Object r6 = r6.get(r5)
            android.view.View r6 = (android.view.View) r6
            android.view.ViewGroup$LayoutParams r7 = r6.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r7 = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) r7
            if (r15 != 0) goto L33
            int r8 = r6.getVisibility()
            r9 = 8
            if (r8 != r9) goto L33
            goto Lfa
        L33:
            r8 = 0
        L34:
            if (r8 >= r5) goto L48
            java.util.List<android.view.View> r9 = r14.mDependencySortedChildren
            java.lang.Object r9 = r9.get(r8)
            android.view.View r9 = (android.view.View) r9
            android.view.View r10 = r7.mAnchorDirectChild
            if (r10 != r9) goto L45
            r14.offsetChildToAnchor(r6, r0)
        L45:
            int r8 = r8 + 1
            goto L34
        L48:
            r8 = 1
            r14.getChildRect(r6, r8, r3)
            int r9 = r7.insetEdge
            if (r9 == 0) goto L9e
            boolean r9 = r3.isEmpty()
            if (r9 != 0) goto L9e
            int r9 = r7.insetEdge
            int r9 = androidx.core.view.GravityCompat.getAbsoluteGravity(r9, r0)
            r10 = r9 & 112(0x70, float:1.57E-43)
            switch(r10) {
                case 48: goto L72;
                case 80: goto L62;
                default: goto L61;
            }
        L61:
            goto L7d
        L62:
            int r10 = r2.bottom
            int r11 = r14.getHeight()
            int r12 = r3.top
            int r11 = r11 - r12
            int r10 = java.lang.Math.max(r10, r11)
            r2.bottom = r10
            goto L7d
        L72:
            int r10 = r2.top
            int r11 = r3.bottom
            int r10 = java.lang.Math.max(r10, r11)
            r2.top = r10
        L7d:
            r10 = r9 & 7
            switch(r10) {
                case 3: goto L93;
                case 4: goto L82;
                case 5: goto L83;
                default: goto L82;
            }
        L82:
            goto L9e
        L83:
            int r10 = r2.right
            int r11 = r14.getWidth()
            int r12 = r3.left
            int r11 = r11 - r12
            int r10 = java.lang.Math.max(r10, r11)
            r2.right = r10
            goto L9e
        L93:
            int r10 = r2.left
            int r11 = r3.right
            int r10 = java.lang.Math.max(r10, r11)
            r2.left = r10
        L9e:
            int r9 = r7.dodgeInsetEdges
            if (r9 == 0) goto Lab
            int r9 = r6.getVisibility()
            if (r9 != 0) goto Lab
            r14.offsetChildByInset(r6, r2, r0)
        Lab:
            r9 = 2
            if (r15 == r9) goto Lbb
            r14.getLastChildRect(r6, r4)
            boolean r9 = r4.equals(r3)
            if (r9 == 0) goto Lb8
            goto Lfa
        Lb8:
            r14.recordLastChildRect(r6, r3)
        Lbb:
            int r9 = r5 + 1
        Lbd:
            if (r9 >= r1) goto Lfa
            java.util.List<android.view.View> r10 = r14.mDependencySortedChildren
            java.lang.Object r10 = r10.get(r9)
            android.view.View r10 = (android.view.View) r10
            android.view.ViewGroup$LayoutParams r11 = r10.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r11 = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) r11
            androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r12 = r11.getBehavior()
            if (r12 == 0) goto Lf7
            boolean r13 = r12.layoutDependsOn(r14, r10, r6)
            if (r13 == 0) goto Lf7
            if (r15 != 0) goto Le5
            boolean r13 = r11.getChangedAfterNestedScroll()
            if (r13 == 0) goto Le5
            r11.resetChangedAfterNestedScroll()
            goto Lf7
        Le5:
            switch(r15) {
                case 2: goto Led;
                default: goto Le8;
            }
        Le8:
            boolean r13 = r12.onDependentViewChanged(r14, r10, r6)
            goto Lf2
        Led:
            r12.onDependentViewRemoved(r14, r10, r6)
            r13 = 1
        Lf2:
            if (r15 != r8) goto Lf7
            r11.setChangedAfterNestedScroll(r13)
        Lf7:
            int r9 = r9 + 1
            goto Lbd
        Lfa:
            int r5 = r5 + 1
            goto L17
        Lfe:
            releaseTempRect(r2)
            releaseTempRect(r3)
            releaseTempRect(r4)
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
            r2 = this;
            super.onDetachedFromWindow()
            r2.resetTouchBehaviors()
            boolean r0 = r2.mNeedsPreDrawListener
            if (r0 == 0) goto L17
            androidx.coordinatorlayout.widget.CoordinatorLayout$OnPreDrawListener r0 = r2.mOnPreDrawListener
            if (r0 == 0) goto L17
            android.view.ViewTreeObserver r0 = r2.getViewTreeObserver()
            androidx.coordinatorlayout.widget.CoordinatorLayout$OnPreDrawListener r1 = r2.mOnPreDrawListener
            r0.removeOnPreDrawListener(r1)
        L17:
            android.view.View r0 = r2.mNestedScrollingTarget
            if (r0 == 0) goto L20
            android.view.View r0 = r2.mNestedScrollingTarget
            r2.onStopNestedScroll(r0)
        L20:
            r0 = 0
            r2.mIsAttachedToWindow = r0
            return
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas r5) {
            r4 = this;
            super.onDraw(r5)
            boolean r0 = r4.mDrawStatusBarBackground
            if (r0 == 0) goto L28
            android.graphics.drawable.Drawable r0 = r4.mStatusBarBackground
            if (r0 == 0) goto L28
            androidx.core.view.WindowInsetsCompat r0 = r4.mLastInsets
            r1 = 0
            if (r0 == 0) goto L17
            androidx.core.view.WindowInsetsCompat r0 = r4.mLastInsets
            int r0 = r0.getSystemWindowInsetTop()
            goto L18
        L17:
            r0 = r1
        L18:
            if (r0 <= 0) goto L28
            android.graphics.drawable.Drawable r2 = r4.mStatusBarBackground
            int r3 = r4.getWidth()
            r2.setBounds(r1, r1, r3, r0)
            android.graphics.drawable.Drawable r1 = r4.mStatusBarBackground
            r1.draw(r5)
        L28:
            return
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent r4) {
            r3 = this;
            int r0 = r4.getActionMasked()
            if (r0 != 0) goto L9
            r3.resetTouchBehaviors()
        L9:
            r1 = 0
            boolean r1 = r3.performIntercept(r4, r1)
            r2 = 1
            if (r0 == r2) goto L14
            r2 = 3
            if (r0 != r2) goto L1a
        L14:
            r2 = 0
            r3.mBehaviorTouchView = r2
            r3.resetTouchBehaviors()
        L1a:
            return r1
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean r8, int r9, int r10, int r11, int r12) {
            r7 = this;
            int r0 = r7.getLayoutDirection()
            java.util.List<android.view.View> r1 = r7.mDependencySortedChildren
            int r1 = r1.size()
            r2 = 0
        Lb:
            if (r2 >= r1) goto L36
            java.util.List<android.view.View> r3 = r7.mDependencySortedChildren
            java.lang.Object r3 = r3.get(r2)
            android.view.View r3 = (android.view.View) r3
            int r4 = r3.getVisibility()
            r5 = 8
            if (r4 != r5) goto L1e
            goto L33
        L1e:
            android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r4 = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) r4
            androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r5 = r4.getBehavior()
            if (r5 == 0) goto L30
            boolean r6 = r5.onLayoutChild(r7, r3, r0)
            if (r6 != 0) goto L33
        L30:
            r7.onLayoutChild(r3, r0)
        L33:
            int r2 = r2 + 1
            goto Lb
        L36:
            return
    }

    public void onLayoutChild(android.view.View r4, int r5) {
            r3 = this;
            android.view.ViewGroup$LayoutParams r0 = r4.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) r0
            boolean r1 = r0.checkAnchorChanged()
            if (r1 != 0) goto L24
            android.view.View r1 = r0.mAnchorView
            if (r1 == 0) goto L16
            android.view.View r1 = r0.mAnchorView
            r3.layoutChildWithAnchor(r4, r1, r5)
            goto L23
        L16:
            int r1 = r0.keyline
            if (r1 < 0) goto L20
            int r1 = r0.keyline
            r3.layoutChildWithKeyline(r4, r1, r5)
            goto L23
        L20:
            r3.layoutChild(r4, r5)
        L23:
            return
        L24:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete."
            r1.<init>(r2)
            throw r1
    }

    @Override // android.view.View
    protected void onMeasure(int r29, int r30) {
            r28 = this;
            r0 = r28
            r0.prepareChildren()
            r0.ensurePreDrawListener()
            int r7 = r0.getPaddingLeft()
            int r8 = r0.getPaddingTop()
            int r9 = r0.getPaddingRight()
            int r10 = r0.getPaddingBottom()
            int r11 = r0.getLayoutDirection()
            r1 = 1
            if (r11 != r1) goto L21
            r2 = r1
            goto L22
        L21:
            r2 = 0
        L22:
            r13 = r2
            int r14 = android.view.View.MeasureSpec.getMode(r29)
            int r15 = android.view.View.MeasureSpec.getSize(r29)
            int r2 = android.view.View.MeasureSpec.getMode(r30)
            int r16 = android.view.View.MeasureSpec.getSize(r30)
            int r17 = r7 + r9
            int r18 = r8 + r10
            int r3 = r0.getSuggestedMinimumWidth()
            int r4 = r0.getSuggestedMinimumHeight()
            r5 = 0
            androidx.core.view.WindowInsetsCompat r6 = r0.mLastInsets
            if (r6 == 0) goto L4b
            boolean r6 = androidx.core.view.ViewCompat.getFitsSystemWindows(r0)
            if (r6 == 0) goto L4b
            goto L4c
        L4b:
            r1 = 0
        L4c:
            r19 = r1
            java.util.List<android.view.View> r1 = r0.mDependencySortedChildren
            int r1 = r1.size()
            r6 = 0
        L55:
            if (r6 >= r1) goto L1b0
            java.util.List<android.view.View> r12 = r0.mDependencySortedChildren
            java.lang.Object r12 = r12.get(r6)
            android.view.View r12 = (android.view.View) r12
            r21 = r1
            int r1 = r12.getVisibility()
            r22 = r3
            r3 = 8
            if (r1 != r3) goto L7c
            r12 = r2
            r20 = r6
            r23 = r8
            r24 = r9
            r25 = r10
            r3 = r22
            r26 = 0
            r22 = r7
            goto L1a1
        L7c:
            android.view.ViewGroup$LayoutParams r1 = r12.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r1 = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) r1
            r3 = 0
            r23 = r3
            int r3 = r1.keyline
            if (r3 < 0) goto Lce
            if (r14 == 0) goto Lce
            int r3 = r1.keyline
            int r3 = r0.getKeyline(r3)
            r24 = r3
            int r3 = r1.gravity
            int r3 = resolveKeylineGravity(r3)
            int r3 = androidx.core.view.GravityCompat.getAbsoluteGravity(r3, r11)
            r3 = r3 & 7
            r25 = r1
            r1 = 3
            if (r3 != r1) goto La6
            if (r13 == 0) goto Lab
        La6:
            r1 = 5
            if (r3 != r1) goto Lb8
            if (r13 == 0) goto Lb8
        Lab:
            int r1 = r15 - r9
            int r1 = r1 - r24
            r27 = r4
            r4 = 0
            int r1 = java.lang.Math.max(r4, r1)
            r3 = r1
            goto Ld5
        Lb8:
            r27 = r4
            if (r3 != r1) goto Lbe
            if (r13 == 0) goto Lc3
        Lbe:
            r1 = 3
            if (r3 != r1) goto Lcc
            if (r13 == 0) goto Lcc
        Lc3:
            int r1 = r24 - r7
            r4 = 0
            int r1 = java.lang.Math.max(r4, r1)
            r3 = r1
            goto Ld5
        Lcc:
            r4 = 0
            goto Ld3
        Lce:
            r25 = r1
            r27 = r4
            r4 = 0
        Ld3:
            r3 = r23
        Ld5:
            r1 = r29
            r20 = r30
            if (r19 == 0) goto L113
            boolean r23 = androidx.core.view.ViewCompat.getFitsSystemWindows(r12)
            if (r23 != 0) goto L113
            androidx.core.view.WindowInsetsCompat r4 = r0.mLastInsets
            int r4 = r4.getSystemWindowInsetLeft()
            r24 = r1
            androidx.core.view.WindowInsetsCompat r1 = r0.mLastInsets
            int r1 = r1.getSystemWindowInsetRight()
            int r4 = r4 + r1
            androidx.core.view.WindowInsetsCompat r1 = r0.mLastInsets
            int r1 = r1.getSystemWindowInsetTop()
            r26 = r1
            androidx.core.view.WindowInsetsCompat r1 = r0.mLastInsets
            int r1 = r1.getSystemWindowInsetBottom()
            int r1 = r26 + r1
            int r0 = r15 - r4
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r14)
            r24 = r0
            int r0 = r16 - r1
            int r20 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r2)
            r4 = r20
            r1 = r24
            goto L119
        L113:
            r24 = r1
            r4 = r20
            r1 = r24
        L119:
            androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r0 = r25.getBehavior()
            if (r0 == 0) goto L151
            r20 = r6
            r6 = 0
            r23 = r12
            r12 = r2
            r2 = r23
            r23 = r22
            r22 = r7
            r7 = r23
            r23 = r25
            r25 = r10
            r10 = r23
            r23 = r8
            r24 = r9
            r9 = r27
            r26 = 0
            r8 = r5
            r5 = r4
            r4 = r3
            r3 = r1
            r1 = r28
            boolean r6 = r0.onMeasureChild(r1, r2, r3, r4, r5, r6)
            r27 = r0
            r1 = r2
            r2 = r3
            r3 = r4
            r4 = r5
            if (r6 != 0) goto L14e
            goto L170
        L14e:
            r0 = r28
            goto L176
        L151:
            r20 = r2
            r2 = r1
            r1 = r12
            r12 = r20
            r20 = r22
            r22 = r7
            r7 = r20
            r20 = r25
            r25 = r10
            r10 = r20
            r20 = r6
            r23 = r8
            r24 = r9
            r9 = r27
            r26 = 0
            r27 = r0
            r8 = r5
        L170:
            r5 = 0
            r0 = r28
            r0.onMeasureChild(r1, r2, r3, r4, r5)
        L176:
            int r5 = r1.getMeasuredWidth()
            int r5 = r17 + r5
            int r6 = r10.leftMargin
            int r5 = r5 + r6
            int r6 = r10.rightMargin
            int r5 = r5 + r6
            int r5 = java.lang.Math.max(r7, r5)
            int r6 = r1.getMeasuredHeight()
            int r6 = r18 + r6
            int r7 = r10.topMargin
            int r6 = r6 + r7
            int r7 = r10.bottomMargin
            int r6 = r6 + r7
            int r6 = java.lang.Math.max(r9, r6)
            int r7 = r1.getMeasuredState()
            int r7 = android.view.View.combineMeasuredStates(r8, r7)
            r3 = r5
            r4 = r6
            r5 = r7
        L1a1:
            int r6 = r20 + 1
            r2 = r12
            r1 = r21
            r7 = r22
            r8 = r23
            r9 = r24
            r10 = r25
            goto L55
        L1b0:
            r21 = r1
            r12 = r2
            r22 = r7
            r23 = r8
            r24 = r9
            r7 = r3
            r9 = r4
            r8 = r5
            r1 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r1 = r1 & r8
            r2 = r29
            int r1 = android.view.View.resolveSizeAndState(r7, r2, r1)
            int r3 = r8 << 16
            r4 = r30
            int r3 = android.view.View.resolveSizeAndState(r9, r4, r3)
            r0.setMeasuredDimension(r1, r3)
            return
    }

    public void onMeasureChild(android.view.View r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onNestedFling(android.view.View r12, float r13, float r14, boolean r15) {
            r11 = this;
            r0 = 0
            int r1 = r11.getChildCount()
            r2 = 0
        L6:
            if (r2 >= r1) goto L4c
            android.view.View r5 = r11.getChildAt(r2)
            int r3 = r5.getVisibility()
            r4 = 8
            if (r3 != r4) goto L1a
            r4 = r11
            r6 = r12
            r7 = r13
            r8 = r14
            r9 = r15
            goto L45
        L1a:
            android.view.ViewGroup$LayoutParams r3 = r5.getLayoutParams()
            r10 = r3
            androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r10 = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) r10
            r3 = 0
            boolean r3 = r10.isNestedScrollAccepted(r3)
            if (r3 != 0) goto L2e
            r4 = r11
            r6 = r12
            r7 = r13
            r8 = r14
            r9 = r15
            goto L45
        L2e:
            androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r3 = r10.getBehavior()
            if (r3 == 0) goto L40
            r4 = r11
            r6 = r12
            r7 = r13
            r8 = r14
            r9 = r15
            boolean r12 = r3.onNestedFling(r4, r5, r6, r7, r8, r9)
            r12 = r12 | r0
            r0 = r12
            goto L45
        L40:
            r4 = r11
            r6 = r12
            r7 = r13
            r8 = r14
            r9 = r15
        L45:
            int r2 = r2 + 1
            r12 = r6
            r13 = r7
            r14 = r8
            r15 = r9
            goto L6
        L4c:
            r4 = r11
            r6 = r12
            r7 = r13
            r8 = r14
            r9 = r15
            if (r0 == 0) goto L57
            r12 = 1
            r11.onChildViewsChanged(r12)
        L57:
            return r0
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onNestedPreFling(android.view.View r11, float r12, float r13) {
            r10 = this;
            r0 = 0
            int r1 = r10.getChildCount()
            r2 = 0
        L6:
            if (r2 >= r1) goto L44
            android.view.View r5 = r10.getChildAt(r2)
            int r3 = r5.getVisibility()
            r4 = 8
            if (r3 != r4) goto L18
            r6 = r11
            r7 = r12
            r8 = r13
            goto L3e
        L18:
            android.view.ViewGroup$LayoutParams r3 = r5.getLayoutParams()
            r9 = r3
            androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r9 = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) r9
            r3 = 0
            boolean r3 = r9.isNestedScrollAccepted(r3)
            if (r3 != 0) goto L2a
            r6 = r11
            r7 = r12
            r8 = r13
            goto L3e
        L2a:
            androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r3 = r9.getBehavior()
            if (r3 == 0) goto L3b
            r4 = r10
            r6 = r11
            r7 = r12
            r8 = r13
            boolean r11 = r3.onNestedPreFling(r4, r5, r6, r7, r8)
            r11 = r11 | r0
            r0 = r11
            goto L3e
        L3b:
            r6 = r11
            r7 = r12
            r8 = r13
        L3e:
            int r2 = r2 + 1
            r11 = r6
            r12 = r7
            r13 = r8
            goto L6
        L44:
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
    public void onNestedPreScroll(android.view.View r17, int r18, int r19, int[] r20, int r21) {
            r16 = this;
            r1 = r16
            r0 = 0
            r2 = 0
            r3 = 0
            int r8 = r1.getChildCount()
            r4 = 0
            r9 = r0
            r10 = r2
            r11 = r3
            r12 = r4
        Le:
            r13 = 1
            r14 = 0
            if (r12 >= r8) goto L77
            android.view.View r2 = r1.getChildAt(r12)
            int r0 = r2.getVisibility()
            r3 = 8
            if (r0 != r3) goto L1f
            goto L74
        L1f:
            android.view.ViewGroup$LayoutParams r0 = r2.getLayoutParams()
            r15 = r0
            androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r15 = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) r15
            r7 = r21
            boolean r0 = r15.isNestedScrollAccepted(r7)
            if (r0 != 0) goto L2f
            goto L74
        L2f:
            androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r0 = r15.getBehavior()
            if (r0 == 0) goto L74
            int[] r3 = r1.mBehaviorConsumed
            r3[r14] = r14
            int[] r3 = r1.mBehaviorConsumed
            r3[r13] = r14
            int[] r6 = r1.mBehaviorConsumed
            r3 = r17
            r4 = r18
            r5 = r19
            r0.onNestedPreScroll(r1, r2, r3, r4, r5, r6, r7)
            if (r18 <= 0) goto L53
            int[] r3 = r1.mBehaviorConsumed
            r3 = r3[r14]
            int r3 = java.lang.Math.max(r9, r3)
            goto L5b
        L53:
            int[] r3 = r1.mBehaviorConsumed
            r3 = r3[r14]
            int r3 = java.lang.Math.min(r9, r3)
        L5b:
            if (r19 <= 0) goto L67
            int[] r4 = r1.mBehaviorConsumed
            r4 = r4[r13]
            int r4 = java.lang.Math.max(r10, r4)
            goto L6f
        L67:
            int[] r4 = r1.mBehaviorConsumed
            r4 = r4[r13]
            int r4 = java.lang.Math.min(r10, r4)
        L6f:
            r5 = 1
            r9 = r3
            r10 = r4
            r11 = r5
        L74:
            int r12 = r12 + 1
            goto Le
        L77:
            r20[r14] = r9
            r20[r13] = r10
            if (r11 == 0) goto L80
            r1.onChildViewsChanged(r13)
        L80:
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onNestedScroll(android.view.View r8, int r9, int r10, int r11, int r12) {
            r7 = this;
            r6 = 0
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r0.onNestedScroll(r1, r2, r3, r4, r5, r6)
            return
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedScroll(android.view.View r9, int r10, int r11, int r12, int r13, int r14) {
            r8 = this;
            r6 = 0
            int[] r7 = r8.mNestedScrollingV2ConsumedCompat
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r0.onNestedScroll(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    @Override // androidx.core.view.NestedScrollingParent3
    public void onNestedScroll(android.view.View r19, int r20, int r21, int r22, int r23, int r24, int[] r25) {
            r18 = this;
            r1 = r18
            int r10 = r1.getChildCount()
            r0 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r11 = r0
            r12 = r2
            r13 = r3
            r14 = r4
        Le:
            r15 = 1
            r16 = 0
            if (r14 >= r10) goto L81
            android.view.View r2 = r1.getChildAt(r14)
            int r0 = r2.getVisibility()
            r3 = 8
            if (r0 != r3) goto L20
            goto L7e
        L20:
            android.view.ViewGroup$LayoutParams r0 = r2.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) r0
            r8 = r24
            boolean r3 = r0.isNestedScrollAccepted(r8)
            if (r3 != 0) goto L2f
            goto L7e
        L2f:
            r3 = r0
            androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r0 = r3.getBehavior()
            if (r0 == 0) goto L7c
            int[] r4 = r1.mBehaviorConsumed
            r4[r16] = r16
            int[] r4 = r1.mBehaviorConsumed
            r4[r15] = r16
            int[] r9 = r1.mBehaviorConsumed
            r4 = r20
            r5 = r21
            r6 = r22
            r7 = r23
            r17 = r3
            r3 = r19
            r0.onNestedScroll(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            if (r22 <= 0) goto L5a
            int[] r3 = r1.mBehaviorConsumed
            r3 = r3[r16]
            int r3 = java.lang.Math.max(r12, r3)
            goto L62
        L5a:
            int[] r3 = r1.mBehaviorConsumed
            r3 = r3[r16]
            int r3 = java.lang.Math.min(r12, r3)
        L62:
            if (r23 <= 0) goto L6e
            int[] r4 = r1.mBehaviorConsumed
            r4 = r4[r15]
            int r4 = java.lang.Math.max(r13, r4)
            goto L76
        L6e:
            int[] r4 = r1.mBehaviorConsumed
            r4 = r4[r15]
            int r4 = java.lang.Math.min(r13, r4)
        L76:
            r5 = 1
            r12 = r3
            r13 = r4
            r11 = r5
            goto L7e
        L7c:
            r17 = r3
        L7e:
            int r14 = r14 + 1
            goto Le
        L81:
            r0 = r25[r16]
            int r0 = r0 + r12
            r25[r16] = r0
            r0 = r25[r15]
            int r0 = r0 + r13
            r25[r15] = r0
            if (r11 == 0) goto L90
            r1.onChildViewsChanged(r15)
        L90:
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
    public void onNestedScrollAccepted(android.view.View r11, android.view.View r12, int r13, int r14) {
            r10 = this;
            androidx.core.view.NestedScrollingParentHelper r0 = r10.mNestedScrollingParentHelper
            r0.onNestedScrollAccepted(r11, r12, r13, r14)
            r10.mNestedScrollingTarget = r12
            int r0 = r10.getChildCount()
            r1 = 0
        Lc:
            if (r1 >= r0) goto L3e
            android.view.View r4 = r10.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r2 = r4.getLayoutParams()
            r9 = r2
            androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r9 = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) r9
            boolean r2 = r9.isNestedScrollAccepted(r14)
            if (r2 != 0) goto L24
            r5 = r11
            r6 = r12
            r7 = r13
            r8 = r14
            goto L37
        L24:
            androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r2 = r9.getBehavior()
            if (r2 == 0) goto L33
            r3 = r10
            r5 = r11
            r6 = r12
            r7 = r13
            r8 = r14
            r2.onNestedScrollAccepted(r3, r4, r5, r6, r7, r8)
            goto L37
        L33:
            r5 = r11
            r6 = r12
            r7 = r13
            r8 = r14
        L37:
            int r1 = r1 + 1
            r11 = r5
            r12 = r6
            r13 = r7
            r14 = r8
            goto Lc
        L3e:
            return
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(android.os.Parcelable r10) {
            r9 = this;
            boolean r0 = r10 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout.SavedState
            if (r0 != 0) goto L8
            super.onRestoreInstanceState(r10)
            return
        L8:
            r0 = r10
            androidx.coordinatorlayout.widget.CoordinatorLayout$SavedState r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout.SavedState) r0
            android.os.Parcelable r1 = r0.getSuperState()
            super.onRestoreInstanceState(r1)
            android.util.SparseArray<android.os.Parcelable> r1 = r0.behaviorStates
            r2 = 0
            int r3 = r9.getChildCount()
        L19:
            if (r2 >= r3) goto L3e
            android.view.View r4 = r9.getChildAt(r2)
            int r5 = r4.getId()
            androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r6 = r9.getResolvedLayoutParams(r4)
            androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r7 = r6.getBehavior()
            r8 = -1
            if (r5 == r8) goto L3b
            if (r7 == 0) goto L3b
            java.lang.Object r8 = r1.get(r5)
            android.os.Parcelable r8 = (android.os.Parcelable) r8
            if (r8 == 0) goto L3b
            r7.onRestoreInstanceState(r9, r4, r8)
        L3b:
            int r2 = r2 + 1
            goto L19
        L3e:
            return
    }

    @Override // android.view.View
    protected android.os.Parcelable onSaveInstanceState() {
            r9 = this;
            androidx.coordinatorlayout.widget.CoordinatorLayout$SavedState r0 = new androidx.coordinatorlayout.widget.CoordinatorLayout$SavedState
            android.os.Parcelable r1 = super.onSaveInstanceState()
            r0.<init>(r1)
            android.util.SparseArray r1 = new android.util.SparseArray
            r1.<init>()
            r2 = 0
            int r3 = r9.getChildCount()
        L13:
            if (r2 >= r3) goto L38
            android.view.View r4 = r9.getChildAt(r2)
            int r5 = r4.getId()
            android.view.ViewGroup$LayoutParams r6 = r4.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r6 = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) r6
            androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r7 = r6.getBehavior()
            r8 = -1
            if (r5 == r8) goto L35
            if (r7 == 0) goto L35
            android.os.Parcelable r8 = r7.onSaveInstanceState(r9, r4)
            if (r8 == 0) goto L35
            r1.append(r5, r8)
        L35:
            int r2 = r2 + 1
            goto L13
        L38:
            r0.behaviorStates = r1
            return r0
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onStartNestedScroll(android.view.View r2, android.view.View r3, int r4) {
            r1 = this;
            r0 = 0
            boolean r0 = r1.onStartNestedScroll(r2, r3, r4, r0)
            return r0
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public boolean onStartNestedScroll(android.view.View r12, android.view.View r13, int r14, int r15) {
            r11 = this;
            r0 = 0
            int r1 = r11.getChildCount()
            r2 = 0
        L6:
            if (r2 >= r1) goto L45
            android.view.View r5 = r11.getChildAt(r2)
            int r3 = r5.getVisibility()
            r4 = 8
            if (r3 != r4) goto L19
            r6 = r12
            r7 = r13
            r8 = r14
            r9 = r15
            goto L3e
        L19:
            android.view.ViewGroup$LayoutParams r3 = r5.getLayoutParams()
            r10 = r3
            androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r10 = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) r10
            androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r3 = r10.getBehavior()
            if (r3 == 0) goto L36
            r4 = r11
            r6 = r12
            r7 = r13
            r8 = r14
            r9 = r15
            boolean r12 = r3.onStartNestedScroll(r4, r5, r6, r7, r8, r9)
            r13 = r0 | r12
            r10.setNestedScrollAccepted(r9, r12)
            r0 = r13
            goto L3e
        L36:
            r6 = r12
            r7 = r13
            r8 = r14
            r9 = r15
            r12 = 0
            r10.setNestedScrollAccepted(r9, r12)
        L3e:
            int r2 = r2 + 1
            r12 = r6
            r13 = r7
            r14 = r8
            r15 = r9
            goto L6
        L45:
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
    public void onStopNestedScroll(android.view.View r6, int r7) {
            r5 = this;
            androidx.core.view.NestedScrollingParentHelper r0 = r5.mNestedScrollingParentHelper
            r0.onStopNestedScroll(r6, r7)
            int r0 = r5.getChildCount()
            r1 = 0
        La:
            if (r1 >= r0) goto L2f
            android.view.View r2 = r5.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r3 = r2.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r3 = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) r3
            boolean r4 = r3.isNestedScrollAccepted(r7)
            if (r4 != 0) goto L1d
            goto L2c
        L1d:
            androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r4 = r3.getBehavior()
            if (r4 == 0) goto L26
            r4.onStopNestedScroll(r5, r2, r6, r7)
        L26:
            r3.resetNestedScroll(r7)
            r3.resetChangedAfterNestedScroll()
        L2c:
            int r1 = r1 + 1
            goto La
        L2f:
            r1 = 0
            r5.mNestedScrollingTarget = r1
            return
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent r8) {
            r7 = this;
            r0 = 0
            r1 = 0
            int r2 = r8.getActionMasked()
            android.view.View r3 = r7.mBehaviorTouchView
            r4 = 1
            if (r3 == 0) goto L20
            android.view.View r3 = r7.mBehaviorTouchView
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r3 = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) r3
            androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r5 = r3.getBehavior()
            if (r5 == 0) goto L1f
            android.view.View r6 = r7.mBehaviorTouchView
            boolean r0 = r5.onTouchEvent(r7, r6, r8)
        L1f:
            goto L2c
        L20:
            boolean r0 = r7.performIntercept(r8, r4)
            if (r2 == 0) goto L2a
            if (r0 == 0) goto L2a
            r3 = r4
            goto L2b
        L2a:
            r3 = 0
        L2b:
            r1 = r3
        L2c:
            android.view.View r3 = r7.mBehaviorTouchView
            r5 = 3
            if (r3 == 0) goto L41
            if (r2 != r5) goto L34
            goto L41
        L34:
            if (r1 == 0) goto L46
            android.view.MotionEvent r3 = r7.obtainCancelEvent(r8)
            super.onTouchEvent(r3)
            r3.recycle()
            goto L46
        L41:
            boolean r3 = super.onTouchEvent(r8)
            r0 = r0 | r3
        L46:
            if (r2 == r4) goto L4a
            if (r2 != r5) goto L50
        L4a:
            r3 = 0
            r7.mBehaviorTouchView = r3
            r7.resetTouchBehaviors()
        L50:
            return r0
    }

    void recordLastChildRect(android.view.View r2, android.graphics.Rect r3) {
            r1 = this;
            android.view.ViewGroup$LayoutParams r0 = r2.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) r0
            r0.setLastChildRect(r3)
            return
    }

    void removePreDrawListener() {
            r2 = this;
            boolean r0 = r2.mIsAttachedToWindow
            if (r0 == 0) goto L11
            androidx.coordinatorlayout.widget.CoordinatorLayout$OnPreDrawListener r0 = r2.mOnPreDrawListener
            if (r0 == 0) goto L11
            android.view.ViewTreeObserver r0 = r2.getViewTreeObserver()
            androidx.coordinatorlayout.widget.CoordinatorLayout$OnPreDrawListener r1 = r2.mOnPreDrawListener
            r0.removeOnPreDrawListener(r1)
        L11:
            r0 = 0
            r2.mNeedsPreDrawListener = r0
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(android.view.View r4, android.graphics.Rect r5, boolean r6) {
            r3 = this;
            android.view.ViewGroup$LayoutParams r0 = r4.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) r0
            androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r1 = r0.getBehavior()
            if (r1 == 0) goto L14
            boolean r2 = r1.onRequestChildRectangleOnScreen(r3, r4, r5, r6)
            if (r2 == 0) goto L14
            r2 = 1
            return r2
        L14:
            boolean r2 = super.requestChildRectangleOnScreen(r4, r5, r6)
            return r2
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean r2) {
            r1 = this;
            super.requestDisallowInterceptTouchEvent(r2)
            if (r2 == 0) goto L16
            boolean r0 = r1.mDisallowInterceptReset
            if (r0 != 0) goto L16
            android.view.View r0 = r1.mBehaviorTouchView
            if (r0 != 0) goto L10
            r1.cancelInterceptBehaviors()
        L10:
            r1.resetTouchBehaviors()
            r0 = 1
            r1.mDisallowInterceptReset = r0
        L16:
            return
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean r1) {
            r0 = this;
            super.setFitsSystemWindows(r1)
            r0.setupForInsets()
            return
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(android.view.ViewGroup.OnHierarchyChangeListener r1) {
            r0 = this;
            r0.mOnHierarchyChangeListener = r1
            return
    }

    public void setStatusBarBackground(android.graphics.drawable.Drawable r4) {
            r3 = this;
            android.graphics.drawable.Drawable r0 = r3.mStatusBarBackground
            if (r0 == r4) goto L4b
            android.graphics.drawable.Drawable r0 = r3.mStatusBarBackground
            r1 = 0
            if (r0 == 0) goto Le
            android.graphics.drawable.Drawable r0 = r3.mStatusBarBackground
            r0.setCallback(r1)
        Le:
            if (r4 == 0) goto L14
            android.graphics.drawable.Drawable r1 = r4.mutate()
        L14:
            r3.mStatusBarBackground = r1
            android.graphics.drawable.Drawable r0 = r3.mStatusBarBackground
            if (r0 == 0) goto L48
            android.graphics.drawable.Drawable r0 = r3.mStatusBarBackground
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L2b
            android.graphics.drawable.Drawable r0 = r3.mStatusBarBackground
            int[] r1 = r3.getDrawableState()
            r0.setState(r1)
        L2b:
            android.graphics.drawable.Drawable r0 = r3.mStatusBarBackground
            int r1 = r3.getLayoutDirection()
            androidx.core.graphics.drawable.DrawableCompat.setLayoutDirection(r0, r1)
            android.graphics.drawable.Drawable r0 = r3.mStatusBarBackground
            int r1 = r3.getVisibility()
            r2 = 0
            if (r1 != 0) goto L3f
            r1 = 1
            goto L40
        L3f:
            r1 = r2
        L40:
            r0.setVisible(r1, r2)
            android.graphics.drawable.Drawable r0 = r3.mStatusBarBackground
            r0.setCallback(r3)
        L48:
            r3.postInvalidateOnAnimation()
        L4b:
            return
    }

    public void setStatusBarBackgroundColor(int r2) {
            r1 = this;
            android.graphics.drawable.ColorDrawable r0 = new android.graphics.drawable.ColorDrawable
            r0.<init>(r2)
            r1.setStatusBarBackground(r0)
            return
    }

    public void setStatusBarBackgroundResource(int r2) {
            r1 = this;
            if (r2 == 0) goto Lb
            android.content.Context r0 = r1.getContext()
            android.graphics.drawable.Drawable r0 = androidx.core.content.ContextCompat.getDrawable(r0, r2)
            goto Lc
        Lb:
            r0 = 0
        Lc:
            r1.setStatusBarBackground(r0)
            return
    }

    @Override // android.view.View
    public void setVisibility(int r4) {
            r3 = this;
            super.setVisibility(r4)
            r0 = 0
            if (r4 != 0) goto L8
            r1 = 1
            goto L9
        L8:
            r1 = r0
        L9:
            android.graphics.drawable.Drawable r2 = r3.mStatusBarBackground
            if (r2 == 0) goto L1a
            android.graphics.drawable.Drawable r2 = r3.mStatusBarBackground
            boolean r2 = r2.isVisible()
            if (r2 == r1) goto L1a
            android.graphics.drawable.Drawable r2 = r3.mStatusBarBackground
            r2.setVisible(r1, r0)
        L1a:
            return
    }

    final androidx.core.view.WindowInsetsCompat setWindowInsets(androidx.core.view.WindowInsetsCompat r4) {
            r3 = this;
            androidx.core.view.WindowInsetsCompat r0 = r3.mLastInsets
            boolean r0 = androidx.core.util.ObjectsCompat.equals(r0, r4)
            if (r0 != 0) goto L2f
            r3.mLastInsets = r4
            r0 = 1
            r1 = 0
            if (r4 == 0) goto L16
            int r2 = r4.getSystemWindowInsetTop()
            if (r2 <= 0) goto L16
            r2 = r0
            goto L17
        L16:
            r2 = r1
        L17:
            r3.mDrawStatusBarBackground = r2
            boolean r2 = r3.mDrawStatusBarBackground
            if (r2 != 0) goto L24
            android.graphics.drawable.Drawable r2 = r3.getBackground()
            if (r2 != 0) goto L24
            goto L25
        L24:
            r0 = r1
        L25:
            r3.setWillNotDraw(r0)
            androidx.core.view.WindowInsetsCompat r4 = r3.dispatchApplyWindowInsetsToBehaviors(r4)
            r3.requestLayout()
        L2f:
            return r4
    }

    @Override // android.view.View
    protected boolean verifyDrawable(android.graphics.drawable.Drawable r2) {
            r1 = this;
            boolean r0 = super.verifyDrawable(r2)
            if (r0 != 0) goto Ld
            android.graphics.drawable.Drawable r0 = r1.mStatusBarBackground
            if (r2 != r0) goto Lb
            goto Ld
        Lb:
            r0 = 0
            goto Le
        Ld:
            r0 = 1
        Le:
            return r0
    }
}
