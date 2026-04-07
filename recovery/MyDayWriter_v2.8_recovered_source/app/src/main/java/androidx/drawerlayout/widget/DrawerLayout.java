package androidx.drawerlayout.widget;

/* JADX INFO: loaded from: classes.dex */
public class DrawerLayout extends android.view.ViewGroup {
    private static final boolean ALLOW_EDGE_LOCK = false;
    static final boolean CAN_HIDE_DESCENDANTS = false;
    private static final boolean CHILDREN_DISALLOW_INTERCEPT = true;
    private static final int DEFAULT_SCRIM_COLOR = -1728053248;
    private static final int DRAWER_ELEVATION = 10;
    static final int[] LAYOUT_ATTRS = null;
    public static final int LOCK_MODE_LOCKED_CLOSED = 1;
    public static final int LOCK_MODE_LOCKED_OPEN = 2;
    public static final int LOCK_MODE_UNDEFINED = 3;
    public static final int LOCK_MODE_UNLOCKED = 0;
    private static final int MIN_DRAWER_MARGIN = 64;
    private static final int MIN_FLING_VELOCITY = 400;
    private static final int PEEK_DELAY = 160;
    private static final boolean SET_DRAWER_SHADOW_FROM_ELEVATION = false;
    public static final int STATE_DRAGGING = 1;
    public static final int STATE_IDLE = 0;
    public static final int STATE_SETTLING = 2;
    private static final java.lang.String TAG = "DrawerLayout";
    private static final int[] THEME_ATTRS = null;
    private static final float TOUCH_SLOP_SENSITIVITY = 1.0f;
    private final androidx.drawerlayout.widget.DrawerLayout.ChildAccessibilityDelegate mChildAccessibilityDelegate;
    private android.graphics.Rect mChildHitRect;
    private android.graphics.Matrix mChildInvertedMatrix;
    private boolean mChildrenCanceledTouch;
    private boolean mDisallowInterceptRequested;
    private boolean mDrawStatusBarBackground;
    private float mDrawerElevation;
    private int mDrawerState;
    private boolean mFirstLayout;
    private boolean mInLayout;
    private float mInitialMotionX;
    private float mInitialMotionY;
    private java.lang.Object mLastInsets;
    private final androidx.drawerlayout.widget.DrawerLayout.ViewDragCallback mLeftCallback;
    private final androidx.customview.widget.ViewDragHelper mLeftDragger;
    private androidx.drawerlayout.widget.DrawerLayout.DrawerListener mListener;
    private java.util.List<androidx.drawerlayout.widget.DrawerLayout.DrawerListener> mListeners;
    private int mLockModeEnd;
    private int mLockModeLeft;
    private int mLockModeRight;
    private int mLockModeStart;
    private int mMinDrawerMargin;
    private final java.util.ArrayList<android.view.View> mNonDrawerViews;
    private final androidx.drawerlayout.widget.DrawerLayout.ViewDragCallback mRightCallback;
    private final androidx.customview.widget.ViewDragHelper mRightDragger;
    private int mScrimColor;
    private float mScrimOpacity;
    private android.graphics.Paint mScrimPaint;
    private android.graphics.drawable.Drawable mShadowEnd;
    private android.graphics.drawable.Drawable mShadowLeft;
    private android.graphics.drawable.Drawable mShadowLeftResolved;
    private android.graphics.drawable.Drawable mShadowRight;
    private android.graphics.drawable.Drawable mShadowRightResolved;
    private android.graphics.drawable.Drawable mShadowStart;
    private android.graphics.drawable.Drawable mStatusBarBackground;
    private java.lang.CharSequence mTitleLeft;
    private java.lang.CharSequence mTitleRight;


    class AccessibilityDelegate extends androidx.core.view.AccessibilityDelegateCompat {
        private final android.graphics.Rect mTmpRect;
        final /* synthetic */ androidx.drawerlayout.widget.DrawerLayout this$0;

        AccessibilityDelegate(androidx.drawerlayout.widget.DrawerLayout r2) {
                r1 = this;
                r1.this$0 = r2
                r1.<init>()
                android.graphics.Rect r0 = new android.graphics.Rect
                r0.<init>()
                r1.mTmpRect = r0
                return
        }

        private void addChildrenForAccessibility(androidx.core.view.accessibility.AccessibilityNodeInfoCompat r5, android.view.ViewGroup r6) {
                r4 = this;
                int r0 = r6.getChildCount()
                r1 = 0
            L5:
                if (r1 >= r0) goto L17
                android.view.View r2 = r6.getChildAt(r1)
                boolean r3 = androidx.drawerlayout.widget.DrawerLayout.includeChildForAccessibility(r2)
                if (r3 == 0) goto L14
                r5.addChild(r2)
            L14:
                int r1 = r1 + 1
                goto L5
            L17:
                return
        }

        private void copyNodeInfoNoChildren(androidx.core.view.accessibility.AccessibilityNodeInfoCompat r3, androidx.core.view.accessibility.AccessibilityNodeInfoCompat r4) {
                r2 = this;
                android.graphics.Rect r0 = r2.mTmpRect
                r4.getBoundsInParent(r0)
                r3.setBoundsInParent(r0)
                r4.getBoundsInScreen(r0)
                r3.setBoundsInScreen(r0)
                boolean r1 = r4.isVisibleToUser()
                r3.setVisibleToUser(r1)
                java.lang.CharSequence r1 = r4.getPackageName()
                r3.setPackageName(r1)
                java.lang.CharSequence r1 = r4.getClassName()
                r3.setClassName(r1)
                java.lang.CharSequence r1 = r4.getContentDescription()
                r3.setContentDescription(r1)
                boolean r1 = r4.isEnabled()
                r3.setEnabled(r1)
                boolean r1 = r4.isClickable()
                r3.setClickable(r1)
                boolean r1 = r4.isFocusable()
                r3.setFocusable(r1)
                boolean r1 = r4.isFocused()
                r3.setFocused(r1)
                boolean r1 = r4.isAccessibilityFocused()
                r3.setAccessibilityFocused(r1)
                boolean r1 = r4.isSelected()
                r3.setSelected(r1)
                boolean r1 = r4.isLongClickable()
                r3.setLongClickable(r1)
                int r1 = r4.getActions()
                r3.addAction(r1)
                return
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public boolean dispatchPopulateAccessibilityEvent(android.view.View r5, android.view.accessibility.AccessibilityEvent r6) {
                r4 = this;
                int r0 = r6.getEventType()
                r1 = 32
                if (r0 != r1) goto L27
                java.util.List r0 = r6.getText()
                androidx.drawerlayout.widget.DrawerLayout r1 = r4.this$0
                android.view.View r1 = r1.findVisibleDrawer()
                if (r1 == 0) goto L25
                androidx.drawerlayout.widget.DrawerLayout r2 = r4.this$0
                int r2 = r2.getDrawerViewAbsoluteGravity(r1)
                androidx.drawerlayout.widget.DrawerLayout r3 = r4.this$0
                java.lang.CharSequence r3 = r3.getDrawerTitle(r2)
                if (r3 == 0) goto L25
                r0.add(r3)
            L25:
                r2 = 1
                return r2
            L27:
                boolean r0 = super.dispatchPopulateAccessibilityEvent(r5, r6)
                return r0
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityEvent(android.view.View r2, android.view.accessibility.AccessibilityEvent r3) {
                r1 = this;
                super.onInitializeAccessibilityEvent(r2, r3)
                java.lang.Class<androidx.drawerlayout.widget.DrawerLayout> r0 = androidx.drawerlayout.widget.DrawerLayout.class
                java.lang.String r0 = r0.getName()
                r3.setClassName(r0)
                return
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityNodeInfo(android.view.View r4, androidx.core.view.accessibility.AccessibilityNodeInfoCompat r5) {
                r3 = this;
                boolean r0 = androidx.drawerlayout.widget.DrawerLayout.CAN_HIDE_DESCENDANTS
                if (r0 == 0) goto L8
                super.onInitializeAccessibilityNodeInfo(r4, r5)
                goto L2d
            L8:
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat r0 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.obtain(r5)
                super.onInitializeAccessibilityNodeInfo(r4, r0)
                r5.setSource(r4)
                android.view.ViewParent r1 = androidx.core.view.ViewCompat.getParentForAccessibility(r4)
                boolean r2 = r1 instanceof android.view.View
                if (r2 == 0) goto L21
                r2 = r1
                android.view.View r2 = (android.view.View) r2
                r5.setParent(r2)
            L21:
                r3.copyNodeInfoNoChildren(r5, r0)
                r0.recycle()
                r2 = r4
                android.view.ViewGroup r2 = (android.view.ViewGroup) r2
                r3.addChildrenForAccessibility(r5, r2)
            L2d:
                java.lang.Class<androidx.drawerlayout.widget.DrawerLayout> r0 = androidx.drawerlayout.widget.DrawerLayout.class
                java.lang.String r0 = r0.getName()
                r5.setClassName(r0)
                r0 = 0
                r5.setFocusable(r0)
                r5.setFocused(r0)
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r0 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_FOCUS
                r5.removeAction(r0)
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r0 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_CLEAR_FOCUS
                r5.removeAction(r0)
                return
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public boolean onRequestSendAccessibilityEvent(android.view.ViewGroup r2, android.view.View r3, android.view.accessibility.AccessibilityEvent r4) {
                r1 = this;
                boolean r0 = androidx.drawerlayout.widget.DrawerLayout.CAN_HIDE_DESCENDANTS
                if (r0 != 0) goto Ld
                boolean r0 = androidx.drawerlayout.widget.DrawerLayout.includeChildForAccessibility(r3)
                if (r0 == 0) goto Lb
                goto Ld
            Lb:
                r0 = 0
                return r0
            Ld:
                boolean r0 = super.onRequestSendAccessibilityEvent(r2, r3, r4)
                return r0
        }
    }

    static final class ChildAccessibilityDelegate extends androidx.core.view.AccessibilityDelegateCompat {
        ChildAccessibilityDelegate() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityNodeInfo(android.view.View r2, androidx.core.view.accessibility.AccessibilityNodeInfoCompat r3) {
                r1 = this;
                super.onInitializeAccessibilityNodeInfo(r2, r3)
                boolean r0 = androidx.drawerlayout.widget.DrawerLayout.includeChildForAccessibility(r2)
                if (r0 != 0) goto Ld
                r0 = 0
                r3.setParent(r0)
            Ld:
                return
        }
    }

    public interface DrawerListener {
        void onDrawerClosed(android.view.View r1);

        void onDrawerOpened(android.view.View r1);

        void onDrawerSlide(android.view.View r1, float r2);

        void onDrawerStateChanged(int r1);
    }

    public static class LayoutParams extends android.view.ViewGroup.MarginLayoutParams {
        private static final int FLAG_IS_CLOSING = 4;
        private static final int FLAG_IS_OPENED = 1;
        private static final int FLAG_IS_OPENING = 2;
        public int gravity;
        boolean isPeeking;
        float onScreen;
        int openState;

        public LayoutParams(int r2, int r3) {
                r1 = this;
                r1.<init>(r2, r3)
                r0 = 0
                r1.gravity = r0
                return
        }

        public LayoutParams(int r1, int r2, int r3) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.gravity = r3
                return
        }

        public LayoutParams(android.content.Context r3, android.util.AttributeSet r4) {
                r2 = this;
                r2.<init>(r3, r4)
                r0 = 0
                r2.gravity = r0
                int[] r1 = androidx.drawerlayout.widget.DrawerLayout.LAYOUT_ATTRS
                android.content.res.TypedArray r1 = r3.obtainStyledAttributes(r4, r1)
                int r0 = r1.getInt(r0, r0)
                r2.gravity = r0
                r1.recycle()
                return
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams r2) {
                r1 = this;
                r1.<init>(r2)
                r0 = 0
                r1.gravity = r0
                return
        }

        public LayoutParams(android.view.ViewGroup.MarginLayoutParams r2) {
                r1 = this;
                r1.<init>(r2)
                r0 = 0
                r1.gravity = r0
                return
        }

        public LayoutParams(androidx.drawerlayout.widget.DrawerLayout.LayoutParams r2) {
                r1 = this;
                r1.<init>(r2)
                r0 = 0
                r1.gravity = r0
                int r0 = r2.gravity
                r1.gravity = r0
                return
        }
    }

    protected static class SavedState extends androidx.customview.view.AbsSavedState {
        public static final android.os.Parcelable.Creator<androidx.drawerlayout.widget.DrawerLayout.SavedState> CREATOR = null;
        int lockModeEnd;
        int lockModeLeft;
        int lockModeRight;
        int lockModeStart;
        int openDrawerGravity;


        static {
                androidx.drawerlayout.widget.DrawerLayout$SavedState$1 r0 = new androidx.drawerlayout.widget.DrawerLayout$SavedState$1
                r0.<init>()
                androidx.drawerlayout.widget.DrawerLayout.SavedState.CREATOR = r0
                return
        }

        public SavedState(android.os.Parcel r2, java.lang.ClassLoader r3) {
                r1 = this;
                r1.<init>(r2, r3)
                r0 = 0
                r1.openDrawerGravity = r0
                int r0 = r2.readInt()
                r1.openDrawerGravity = r0
                int r0 = r2.readInt()
                r1.lockModeLeft = r0
                int r0 = r2.readInt()
                r1.lockModeRight = r0
                int r0 = r2.readInt()
                r1.lockModeStart = r0
                int r0 = r2.readInt()
                r1.lockModeEnd = r0
                return
        }

        public SavedState(android.os.Parcelable r2) {
                r1 = this;
                r1.<init>(r2)
                r0 = 0
                r1.openDrawerGravity = r0
                return
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(android.os.Parcel r2, int r3) {
                r1 = this;
                super.writeToParcel(r2, r3)
                int r0 = r1.openDrawerGravity
                r2.writeInt(r0)
                int r0 = r1.lockModeLeft
                r2.writeInt(r0)
                int r0 = r1.lockModeRight
                r2.writeInt(r0)
                int r0 = r1.lockModeStart
                r2.writeInt(r0)
                int r0 = r1.lockModeEnd
                r2.writeInt(r0)
                return
        }
    }

    public static abstract class SimpleDrawerListener implements androidx.drawerlayout.widget.DrawerLayout.DrawerListener {
        public SimpleDrawerListener() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.DrawerListener
        public void onDrawerClosed(android.view.View r1) {
                r0 = this;
                return
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.DrawerListener
        public void onDrawerOpened(android.view.View r1) {
                r0 = this;
                return
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.DrawerListener
        public void onDrawerSlide(android.view.View r1, float r2) {
                r0 = this;
                return
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.DrawerListener
        public void onDrawerStateChanged(int r1) {
                r0 = this;
                return
        }
    }

    private class ViewDragCallback extends androidx.customview.widget.ViewDragHelper.Callback {
        private final int mAbsGravity;
        private androidx.customview.widget.ViewDragHelper mDragger;
        private final java.lang.Runnable mPeekRunnable;
        final /* synthetic */ androidx.drawerlayout.widget.DrawerLayout this$0;


        ViewDragCallback(androidx.drawerlayout.widget.DrawerLayout r1, int r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                androidx.drawerlayout.widget.DrawerLayout$ViewDragCallback$1 r1 = new androidx.drawerlayout.widget.DrawerLayout$ViewDragCallback$1
                r1.<init>(r0)
                r0.mPeekRunnable = r1
                r0.mAbsGravity = r2
                return
        }

        private void closeOtherDrawer() {
                r3 = this;
                int r0 = r3.mAbsGravity
                r1 = 3
                if (r0 != r1) goto L6
                r1 = 5
            L6:
                androidx.drawerlayout.widget.DrawerLayout r0 = r3.this$0
                android.view.View r0 = r0.findDrawerWithGravity(r1)
                if (r0 == 0) goto L13
                androidx.drawerlayout.widget.DrawerLayout r2 = r3.this$0
                r2.closeDrawer(r0)
            L13:
                return
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public int clampViewPositionHorizontal(android.view.View r4, int r5, int r6) {
                r3 = this;
                androidx.drawerlayout.widget.DrawerLayout r0 = r3.this$0
                r1 = 3
                boolean r0 = r0.checkDrawerViewAbsoluteGravity(r4, r1)
                if (r0 == 0) goto L18
                int r0 = r4.getWidth()
                int r0 = -r0
                r1 = 0
                int r1 = java.lang.Math.min(r5, r1)
                int r0 = java.lang.Math.max(r0, r1)
                return r0
            L18:
                androidx.drawerlayout.widget.DrawerLayout r0 = r3.this$0
                int r0 = r0.getWidth()
                int r1 = r4.getWidth()
                int r1 = r0 - r1
                int r2 = java.lang.Math.min(r5, r0)
                int r1 = java.lang.Math.max(r1, r2)
                return r1
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public int clampViewPositionVertical(android.view.View r2, int r3, int r4) {
                r1 = this;
                int r0 = r2.getTop()
                return r0
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public int getViewHorizontalDragRange(android.view.View r2) {
                r1 = this;
                androidx.drawerlayout.widget.DrawerLayout r0 = r1.this$0
                boolean r0 = r0.isDrawerView(r2)
                if (r0 == 0) goto Ld
                int r0 = r2.getWidth()
                goto Le
            Ld:
                r0 = 0
            Le:
                return r0
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onEdgeDragStarted(int r3, int r4) {
                r2 = this;
                r0 = r3 & 1
                r1 = 1
                if (r0 != r1) goto Ld
                androidx.drawerlayout.widget.DrawerLayout r0 = r2.this$0
                r1 = 3
                android.view.View r0 = r0.findDrawerWithGravity(r1)
                goto L14
            Ld:
                androidx.drawerlayout.widget.DrawerLayout r0 = r2.this$0
                r1 = 5
                android.view.View r0 = r0.findDrawerWithGravity(r1)
            L14:
                if (r0 == 0) goto L23
                androidx.drawerlayout.widget.DrawerLayout r1 = r2.this$0
                int r1 = r1.getDrawerLockMode(r0)
                if (r1 != 0) goto L23
                androidx.customview.widget.ViewDragHelper r1 = r2.mDragger
                r1.captureChildView(r0, r4)
            L23:
                return
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public boolean onEdgeLock(int r2) {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onEdgeTouched(int r5, int r6) {
                r4 = this;
                androidx.drawerlayout.widget.DrawerLayout r0 = r4.this$0
                java.lang.Runnable r1 = r4.mPeekRunnable
                r2 = 160(0xa0, double:7.9E-322)
                r0.postDelayed(r1, r2)
                return
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onViewCaptured(android.view.View r3, int r4) {
                r2 = this;
                android.view.ViewGroup$LayoutParams r0 = r3.getLayoutParams()
                androidx.drawerlayout.widget.DrawerLayout$LayoutParams r0 = (androidx.drawerlayout.widget.DrawerLayout.LayoutParams) r0
                r1 = 0
                r0.isPeeking = r1
                r2.closeOtherDrawer()
                return
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onViewDragStateChanged(int r4) {
                r3 = this;
                androidx.drawerlayout.widget.DrawerLayout r0 = r3.this$0
                int r1 = r3.mAbsGravity
                androidx.customview.widget.ViewDragHelper r2 = r3.mDragger
                android.view.View r2 = r2.getCapturedView()
                r0.updateDrawerState(r1, r4, r2)
                return
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onViewPositionChanged(android.view.View r5, int r6, int r7, int r8, int r9) {
                r4 = this;
                int r0 = r5.getWidth()
                androidx.drawerlayout.widget.DrawerLayout r1 = r4.this$0
                r2 = 3
                boolean r1 = r1.checkDrawerViewAbsoluteGravity(r5, r2)
                if (r1 == 0) goto L13
                int r1 = r0 + r6
                float r1 = (float) r1
                float r2 = (float) r0
                float r1 = r1 / r2
                goto L1f
            L13:
                androidx.drawerlayout.widget.DrawerLayout r1 = r4.this$0
                int r1 = r1.getWidth()
                int r2 = r1 - r6
                float r2 = (float) r2
                float r3 = (float) r0
                float r2 = r2 / r3
                r1 = r2
            L1f:
                androidx.drawerlayout.widget.DrawerLayout r2 = r4.this$0
                r2.setDrawerViewOffset(r5, r1)
                r2 = 0
                int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
                if (r2 != 0) goto L2b
                r2 = 4
                goto L2c
            L2b:
                r2 = 0
            L2c:
                r5.setVisibility(r2)
                androidx.drawerlayout.widget.DrawerLayout r2 = r4.this$0
                r2.invalidate()
                return
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onViewReleased(android.view.View r7, float r8, float r9) {
                r6 = this;
                androidx.drawerlayout.widget.DrawerLayout r0 = r6.this$0
                float r0 = r0.getDrawerViewOffset(r7)
                int r1 = r7.getWidth()
                androidx.drawerlayout.widget.DrawerLayout r2 = r6.this$0
                r3 = 3
                boolean r2 = r2.checkDrawerViewAbsoluteGravity(r7, r3)
                r3 = 1056964608(0x3f000000, float:0.5)
                r4 = 0
                if (r2 == 0) goto L27
                int r2 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
                if (r2 > 0) goto L25
                int r2 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
                if (r2 != 0) goto L23
                int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
                if (r2 <= 0) goto L23
                goto L25
            L23:
                int r2 = -r1
                goto L26
            L25:
                r2 = 0
            L26:
                goto L3f
            L27:
                androidx.drawerlayout.widget.DrawerLayout r2 = r6.this$0
                int r2 = r2.getWidth()
                int r5 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
                if (r5 < 0) goto L3c
                int r4 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
                if (r4 != 0) goto L3a
                int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
                if (r3 <= 0) goto L3a
                goto L3c
            L3a:
                r3 = r2
                goto L3e
            L3c:
                int r3 = r2 - r1
            L3e:
                r2 = r3
            L3f:
                androidx.customview.widget.ViewDragHelper r3 = r6.mDragger
                int r4 = r7.getTop()
                r3.settleCapturedViewAt(r2, r4)
                androidx.drawerlayout.widget.DrawerLayout r3 = r6.this$0
                r3.invalidate()
                return
        }

        void peekDrawer() {
                r8 = this;
                androidx.customview.widget.ViewDragHelper r0 = r8.mDragger
                int r0 = r0.getEdgeSize()
                int r1 = r8.mAbsGravity
                r2 = 1
                r3 = 0
                r4 = 3
                if (r1 != r4) goto Lf
                r1 = r2
                goto L10
            Lf:
                r1 = r3
            L10:
                if (r1 == 0) goto L21
                androidx.drawerlayout.widget.DrawerLayout r5 = r8.this$0
                android.view.View r4 = r5.findDrawerWithGravity(r4)
                if (r4 == 0) goto L1f
                int r3 = r4.getWidth()
                int r3 = -r3
            L1f:
                int r3 = r3 + r0
                goto L2f
            L21:
                androidx.drawerlayout.widget.DrawerLayout r3 = r8.this$0
                r4 = 5
                android.view.View r4 = r3.findDrawerWithGravity(r4)
                androidx.drawerlayout.widget.DrawerLayout r3 = r8.this$0
                int r3 = r3.getWidth()
                int r3 = r3 - r0
            L2f:
                if (r4 == 0) goto L67
                if (r1 == 0) goto L39
                int r5 = r4.getLeft()
                if (r5 < r3) goto L41
            L39:
                if (r1 != 0) goto L67
                int r5 = r4.getLeft()
                if (r5 <= r3) goto L67
            L41:
                androidx.drawerlayout.widget.DrawerLayout r5 = r8.this$0
                int r5 = r5.getDrawerLockMode(r4)
                if (r5 != 0) goto L67
                android.view.ViewGroup$LayoutParams r5 = r4.getLayoutParams()
                androidx.drawerlayout.widget.DrawerLayout$LayoutParams r5 = (androidx.drawerlayout.widget.DrawerLayout.LayoutParams) r5
                androidx.customview.widget.ViewDragHelper r6 = r8.mDragger
                int r7 = r4.getTop()
                r6.smoothSlideViewTo(r4, r3, r7)
                r5.isPeeking = r2
                androidx.drawerlayout.widget.DrawerLayout r2 = r8.this$0
                r2.invalidate()
                r8.closeOtherDrawer()
                androidx.drawerlayout.widget.DrawerLayout r2 = r8.this$0
                r2.cancelChildViewTouch()
            L67:
                return
        }

        public void removeCallbacks() {
                r2 = this;
                androidx.drawerlayout.widget.DrawerLayout r0 = r2.this$0
                java.lang.Runnable r1 = r2.mPeekRunnable
                r0.removeCallbacks(r1)
                return
        }

        public void setDragger(androidx.customview.widget.ViewDragHelper r1) {
                r0 = this;
                r0.mDragger = r1
                return
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public boolean tryCaptureView(android.view.View r3, int r4) {
                r2 = this;
                androidx.drawerlayout.widget.DrawerLayout r0 = r2.this$0
                boolean r0 = r0.isDrawerView(r3)
                if (r0 == 0) goto L1c
                androidx.drawerlayout.widget.DrawerLayout r0 = r2.this$0
                int r1 = r2.mAbsGravity
                boolean r0 = r0.checkDrawerViewAbsoluteGravity(r3, r1)
                if (r0 == 0) goto L1c
                androidx.drawerlayout.widget.DrawerLayout r0 = r2.this$0
                int r0 = r0.getDrawerLockMode(r3)
                if (r0 != 0) goto L1c
                r0 = 1
                goto L1d
            L1c:
                r0 = 0
            L1d:
                return r0
        }
    }

    static {
            r0 = 16843828(0x1010434, float:2.3696574E-38)
            int[] r0 = new int[]{r0}
            androidx.drawerlayout.widget.DrawerLayout.THEME_ATTRS = r0
            r0 = 16842931(0x10100b3, float:2.369406E-38)
            int[] r0 = new int[]{r0}
            androidx.drawerlayout.widget.DrawerLayout.LAYOUT_ATTRS = r0
            r0 = 1
            androidx.drawerlayout.widget.DrawerLayout.CAN_HIDE_DESCENDANTS = r0
            androidx.drawerlayout.widget.DrawerLayout.SET_DRAWER_SHADOW_FROM_ELEVATION = r0
            return
    }

    public DrawerLayout(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public DrawerLayout(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public DrawerLayout(android.content.Context r7, android.util.AttributeSet r8, int r9) {
            r6 = this;
            r6.<init>(r7, r8, r9)
            androidx.drawerlayout.widget.DrawerLayout$ChildAccessibilityDelegate r0 = new androidx.drawerlayout.widget.DrawerLayout$ChildAccessibilityDelegate
            r0.<init>()
            r6.mChildAccessibilityDelegate = r0
            r0 = -1728053248(0xffffffff99000000, float:-6.617445E-24)
            r6.mScrimColor = r0
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>()
            r6.mScrimPaint = r0
            r0 = 1
            r6.mFirstLayout = r0
            r1 = 3
            r6.mLockModeLeft = r1
            r6.mLockModeRight = r1
            r6.mLockModeStart = r1
            r6.mLockModeEnd = r1
            r2 = 0
            r6.mShadowStart = r2
            r6.mShadowEnd = r2
            r6.mShadowLeft = r2
            r6.mShadowRight = r2
            r2 = 262144(0x40000, float:3.67342E-40)
            r6.setDescendantFocusability(r2)
            android.content.res.Resources r2 = r6.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            r3 = 1115684864(0x42800000, float:64.0)
            float r3 = r3 * r2
            r4 = 1056964608(0x3f000000, float:0.5)
            float r3 = r3 + r4
            int r3 = (int) r3
            r6.mMinDrawerMargin = r3
            r3 = 1137180672(0x43c80000, float:400.0)
            float r3 = r3 * r2
            androidx.drawerlayout.widget.DrawerLayout$ViewDragCallback r4 = new androidx.drawerlayout.widget.DrawerLayout$ViewDragCallback
            r4.<init>(r6, r1)
            r6.mLeftCallback = r4
            androidx.drawerlayout.widget.DrawerLayout$ViewDragCallback r1 = new androidx.drawerlayout.widget.DrawerLayout$ViewDragCallback
            r4 = 5
            r1.<init>(r6, r4)
            r6.mRightCallback = r1
            androidx.drawerlayout.widget.DrawerLayout$ViewDragCallback r1 = r6.mLeftCallback
            r4 = 1065353216(0x3f800000, float:1.0)
            androidx.customview.widget.ViewDragHelper r1 = androidx.customview.widget.ViewDragHelper.create(r6, r4, r1)
            r6.mLeftDragger = r1
            androidx.customview.widget.ViewDragHelper r1 = r6.mLeftDragger
            r1.setEdgeTrackingEnabled(r0)
            androidx.customview.widget.ViewDragHelper r1 = r6.mLeftDragger
            r1.setMinVelocity(r3)
            androidx.drawerlayout.widget.DrawerLayout$ViewDragCallback r1 = r6.mLeftCallback
            androidx.customview.widget.ViewDragHelper r5 = r6.mLeftDragger
            r1.setDragger(r5)
            androidx.drawerlayout.widget.DrawerLayout$ViewDragCallback r1 = r6.mRightCallback
            androidx.customview.widget.ViewDragHelper r1 = androidx.customview.widget.ViewDragHelper.create(r6, r4, r1)
            r6.mRightDragger = r1
            androidx.customview.widget.ViewDragHelper r1 = r6.mRightDragger
            r4 = 2
            r1.setEdgeTrackingEnabled(r4)
            androidx.customview.widget.ViewDragHelper r1 = r6.mRightDragger
            r1.setMinVelocity(r3)
            androidx.drawerlayout.widget.DrawerLayout$ViewDragCallback r1 = r6.mRightCallback
            androidx.customview.widget.ViewDragHelper r4 = r6.mRightDragger
            r1.setDragger(r4)
            r6.setFocusableInTouchMode(r0)
            androidx.core.view.ViewCompat.setImportantForAccessibility(r6, r0)
            androidx.drawerlayout.widget.DrawerLayout$AccessibilityDelegate r0 = new androidx.drawerlayout.widget.DrawerLayout$AccessibilityDelegate
            r0.<init>(r6)
            androidx.core.view.ViewCompat.setAccessibilityDelegate(r6, r0)
            r0 = 0
            r6.setMotionEventSplittingEnabled(r0)
            boolean r1 = androidx.core.view.ViewCompat.getFitsSystemWindows(r6)
            if (r1 == 0) goto Lc5
        La2:
            androidx.drawerlayout.widget.DrawerLayout$1 r1 = new androidx.drawerlayout.widget.DrawerLayout$1
            r1.<init>(r6)
            r6.setOnApplyWindowInsetsListener(r1)
            r1 = 1280(0x500, float:1.794E-42)
            r6.setSystemUiVisibility(r1)
            int[] r1 = androidx.drawerlayout.widget.DrawerLayout.THEME_ATTRS
            android.content.res.TypedArray r1 = r7.obtainStyledAttributes(r1)
            android.graphics.drawable.Drawable r0 = r1.getDrawable(r0)     // Catch: java.lang.Throwable -> Lc0
            r6.mStatusBarBackground = r0     // Catch: java.lang.Throwable -> Lc0
            r1.recycle()
            goto Lc5
        Lc0:
            r0 = move-exception
            r1.recycle()
            throw r0
        Lc5:
            r0 = 1092616192(0x41200000, float:10.0)
            float r0 = r0 * r2
            r6.mDrawerElevation = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r6.mNonDrawerViews = r0
            return
    }

    private boolean dispatchTransformedGenericPointerEvent(android.view.MotionEvent r7, android.view.View r8) {
            r6 = this;
            android.graphics.Matrix r0 = r8.getMatrix()
            boolean r1 = r0.isIdentity()
            if (r1 != 0) goto L16
            android.view.MotionEvent r1 = r6.getTransformedMotionEvent(r7, r8)
            boolean r2 = r8.dispatchGenericMotionEvent(r1)
            r1.recycle()
            goto L37
        L16:
            int r1 = r6.getScrollX()
            int r2 = r8.getLeft()
            int r1 = r1 - r2
            float r1 = (float) r1
            int r2 = r6.getScrollY()
            int r3 = r8.getTop()
            int r2 = r2 - r3
            float r2 = (float) r2
            r7.offsetLocation(r1, r2)
            boolean r3 = r8.dispatchGenericMotionEvent(r7)
            float r4 = -r1
            float r5 = -r2
            r7.offsetLocation(r4, r5)
            r2 = r3
        L37:
            return r2
    }

    private android.view.MotionEvent getTransformedMotionEvent(android.view.MotionEvent r6, android.view.View r7) {
            r5 = this;
            int r0 = r5.getScrollX()
            int r1 = r7.getLeft()
            int r0 = r0 - r1
            float r0 = (float) r0
            int r1 = r5.getScrollY()
            int r2 = r7.getTop()
            int r1 = r1 - r2
            float r1 = (float) r1
            android.view.MotionEvent r2 = android.view.MotionEvent.obtain(r6)
            r2.offsetLocation(r0, r1)
            android.graphics.Matrix r3 = r7.getMatrix()
            boolean r4 = r3.isIdentity()
            if (r4 != 0) goto L3a
            android.graphics.Matrix r4 = r5.mChildInvertedMatrix
            if (r4 != 0) goto L30
            android.graphics.Matrix r4 = new android.graphics.Matrix
            r4.<init>()
            r5.mChildInvertedMatrix = r4
        L30:
            android.graphics.Matrix r4 = r5.mChildInvertedMatrix
            r3.invert(r4)
            android.graphics.Matrix r4 = r5.mChildInvertedMatrix
            r2.transform(r4)
        L3a:
            return r2
    }

    static java.lang.String gravityToString(int r2) {
            r0 = r2 & 3
            r1 = 3
            if (r0 != r1) goto L8
            java.lang.String r0 = "LEFT"
            return r0
        L8:
            r0 = r2 & 5
            r1 = 5
            if (r0 != r1) goto L10
            java.lang.String r0 = "RIGHT"
            return r0
        L10:
            java.lang.String r0 = java.lang.Integer.toHexString(r2)
            return r0
    }

    private static boolean hasOpaqueBackground(android.view.View r4) {
            android.graphics.drawable.Drawable r0 = r4.getBackground()
            r1 = 0
            if (r0 == 0) goto L10
            int r2 = r0.getOpacity()
            r3 = -1
            if (r2 != r3) goto Lf
            r1 = 1
        Lf:
            return r1
        L10:
            return r1
    }

    private boolean hasPeekingDrawer() {
            r4 = this;
            int r0 = r4.getChildCount()
            r1 = 0
        L5:
            if (r1 >= r0) goto L1a
            android.view.View r2 = r4.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            androidx.drawerlayout.widget.DrawerLayout$LayoutParams r2 = (androidx.drawerlayout.widget.DrawerLayout.LayoutParams) r2
            boolean r3 = r2.isPeeking
            if (r3 == 0) goto L17
            r3 = 1
            return r3
        L17:
            int r1 = r1 + 1
            goto L5
        L1a:
            r1 = 0
            return r1
    }

    private boolean hasVisibleDrawer() {
            r1 = this;
            android.view.View r0 = r1.findVisibleDrawer()
            if (r0 == 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    static boolean includeChildForAccessibility(android.view.View r2) {
            int r0 = androidx.core.view.ViewCompat.getImportantForAccessibility(r2)
            r1 = 4
            if (r0 == r1) goto L10
            int r0 = androidx.core.view.ViewCompat.getImportantForAccessibility(r2)
            r1 = 2
            if (r0 == r1) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            return r0
    }

    private boolean isInBoundsOfChild(float r4, float r5, android.view.View r6) {
            r3 = this;
            android.graphics.Rect r0 = r3.mChildHitRect
            if (r0 != 0) goto Lb
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r3.mChildHitRect = r0
        Lb:
            android.graphics.Rect r0 = r3.mChildHitRect
            r6.getHitRect(r0)
            android.graphics.Rect r0 = r3.mChildHitRect
            int r1 = (int) r4
            int r2 = (int) r5
            boolean r0 = r0.contains(r1, r2)
            return r0
    }

    private boolean mirror(android.graphics.drawable.Drawable r2, int r3) {
            r1 = this;
            if (r2 == 0) goto Le
            boolean r0 = androidx.core.graphics.drawable.DrawableCompat.isAutoMirrored(r2)
            if (r0 != 0) goto L9
            goto Le
        L9:
            androidx.core.graphics.drawable.DrawableCompat.setLayoutDirection(r2, r3)
            r0 = 1
            return r0
        Le:
            r0 = 0
            return r0
    }

    private android.graphics.drawable.Drawable resolveLeftShadow() {
            r2 = this;
            int r0 = androidx.core.view.ViewCompat.getLayoutDirection(r2)
            if (r0 != 0) goto L12
            android.graphics.drawable.Drawable r1 = r2.mShadowStart
            if (r1 == 0) goto L1e
            android.graphics.drawable.Drawable r1 = r2.mShadowStart
            r2.mirror(r1, r0)
            android.graphics.drawable.Drawable r1 = r2.mShadowStart
            return r1
        L12:
            android.graphics.drawable.Drawable r1 = r2.mShadowEnd
            if (r1 == 0) goto L1e
            android.graphics.drawable.Drawable r1 = r2.mShadowEnd
            r2.mirror(r1, r0)
            android.graphics.drawable.Drawable r1 = r2.mShadowEnd
            return r1
        L1e:
            android.graphics.drawable.Drawable r1 = r2.mShadowLeft
            return r1
    }

    private android.graphics.drawable.Drawable resolveRightShadow() {
            r2 = this;
            int r0 = androidx.core.view.ViewCompat.getLayoutDirection(r2)
            if (r0 != 0) goto L12
            android.graphics.drawable.Drawable r1 = r2.mShadowEnd
            if (r1 == 0) goto L1e
            android.graphics.drawable.Drawable r1 = r2.mShadowEnd
            r2.mirror(r1, r0)
            android.graphics.drawable.Drawable r1 = r2.mShadowEnd
            return r1
        L12:
            android.graphics.drawable.Drawable r1 = r2.mShadowStart
            if (r1 == 0) goto L1e
            android.graphics.drawable.Drawable r1 = r2.mShadowStart
            r2.mirror(r1, r0)
            android.graphics.drawable.Drawable r1 = r2.mShadowStart
            return r1
        L1e:
            android.graphics.drawable.Drawable r1 = r2.mShadowRight
            return r1
    }

    private void resolveShadowDrawables() {
            r1 = this;
            boolean r0 = androidx.drawerlayout.widget.DrawerLayout.SET_DRAWER_SHADOW_FROM_ELEVATION
            if (r0 == 0) goto L5
            return
        L5:
            android.graphics.drawable.Drawable r0 = r1.resolveLeftShadow()
            r1.mShadowLeftResolved = r0
            android.graphics.drawable.Drawable r0 = r1.resolveRightShadow()
            r1.mShadowRightResolved = r0
            return
    }

    private void updateChildrenImportantForAccessibility(android.view.View r5, boolean r6) {
            r4 = this;
            int r0 = r4.getChildCount()
            r1 = 0
        L5:
            if (r1 >= r0) goto L23
            android.view.View r2 = r4.getChildAt(r1)
            if (r6 != 0) goto L13
            boolean r3 = r4.isDrawerView(r2)
            if (r3 == 0) goto L17
        L13:
            if (r6 == 0) goto L1c
            if (r2 != r5) goto L1c
        L17:
            r3 = 1
            androidx.core.view.ViewCompat.setImportantForAccessibility(r2, r3)
            goto L20
        L1c:
            r3 = 4
            androidx.core.view.ViewCompat.setImportantForAccessibility(r2, r3)
        L20:
            int r1 = r1 + 1
            goto L5
        L23:
            return
    }

    public void addDrawerListener(androidx.drawerlayout.widget.DrawerLayout.DrawerListener r2) {
            r1 = this;
            if (r2 != 0) goto L3
            return
        L3:
            java.util.List<androidx.drawerlayout.widget.DrawerLayout$DrawerListener> r0 = r1.mListeners
            if (r0 != 0) goto Le
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.mListeners = r0
        Le:
            java.util.List<androidx.drawerlayout.widget.DrawerLayout$DrawerListener> r0 = r1.mListeners
            r0.add(r2)
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(java.util.ArrayList<android.view.View> r7, int r8, int r9) {
            r6 = this;
            int r0 = r6.getDescendantFocusability()
            r1 = 393216(0x60000, float:5.51013E-40)
            if (r0 != r1) goto L9
            return
        L9:
            int r0 = r6.getChildCount()
            r1 = 0
            r2 = 0
        Lf:
            if (r2 >= r0) goto L2e
            android.view.View r3 = r6.getChildAt(r2)
            boolean r4 = r6.isDrawerView(r3)
            if (r4 == 0) goto L26
            boolean r4 = r6.isDrawerOpen(r3)
            if (r4 == 0) goto L2b
            r1 = 1
            r3.addFocusables(r7, r8, r9)
            goto L2b
        L26:
            java.util.ArrayList<android.view.View> r4 = r6.mNonDrawerViews
            r4.add(r3)
        L2b:
            int r2 = r2 + 1
            goto Lf
        L2e:
            if (r1 != 0) goto L4d
            java.util.ArrayList<android.view.View> r2 = r6.mNonDrawerViews
            int r2 = r2.size()
            r3 = 0
        L37:
            if (r3 >= r2) goto L4d
            java.util.ArrayList<android.view.View> r4 = r6.mNonDrawerViews
            java.lang.Object r4 = r4.get(r3)
            android.view.View r4 = (android.view.View) r4
            int r5 = r4.getVisibility()
            if (r5 != 0) goto L4a
            r4.addFocusables(r7, r8, r9)
        L4a:
            int r3 = r3 + 1
            goto L37
        L4d:
            java.util.ArrayList<android.view.View> r2 = r6.mNonDrawerViews
            r2.clear()
            return
    }

    @Override // android.view.ViewGroup
    public void addView(android.view.View r3, int r4, android.view.ViewGroup.LayoutParams r5) {
            r2 = this;
            super.addView(r3, r4, r5)
            android.view.View r0 = r2.findOpenDrawer()
            if (r0 != 0) goto L15
            boolean r1 = r2.isDrawerView(r3)
            if (r1 == 0) goto L10
            goto L15
        L10:
            r1 = 1
            androidx.core.view.ViewCompat.setImportantForAccessibility(r3, r1)
            goto L19
        L15:
            r1 = 4
            androidx.core.view.ViewCompat.setImportantForAccessibility(r3, r1)
        L19:
            boolean r1 = androidx.drawerlayout.widget.DrawerLayout.CAN_HIDE_DESCENDANTS
            if (r1 != 0) goto L22
            androidx.drawerlayout.widget.DrawerLayout$ChildAccessibilityDelegate r1 = r2.mChildAccessibilityDelegate
            androidx.core.view.ViewCompat.setAccessibilityDelegate(r3, r1)
        L22:
            return
    }

    void cancelChildViewTouch() {
            r9 = this;
            boolean r0 = r9.mChildrenCanceledTouch
            if (r0 != 0) goto L28
            long r1 = android.os.SystemClock.uptimeMillis()
            r7 = 0
            r8 = 0
            r5 = 3
            r6 = 0
            r3 = r1
            android.view.MotionEvent r0 = android.view.MotionEvent.obtain(r1, r3, r5, r6, r7, r8)
            int r3 = r9.getChildCount()
            r4 = 0
        L16:
            if (r4 >= r3) goto L22
            android.view.View r5 = r9.getChildAt(r4)
            r5.dispatchTouchEvent(r0)
            int r4 = r4 + 1
            goto L16
        L22:
            r0.recycle()
            r4 = 1
            r9.mChildrenCanceledTouch = r4
        L28:
            return
    }

    boolean checkDrawerViewAbsoluteGravity(android.view.View r3, int r4) {
            r2 = this;
            int r0 = r2.getDrawerViewAbsoluteGravity(r3)
            r1 = r0 & r4
            if (r1 != r4) goto La
            r1 = 1
            goto Lb
        La:
            r1 = 0
        Lb:
            return r1
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams r2) {
            r1 = this;
            boolean r0 = r2 instanceof androidx.drawerlayout.widget.DrawerLayout.LayoutParams
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

    public void closeDrawer(int r2) {
            r1 = this;
            r0 = 1
            r1.closeDrawer(r2, r0)
            return
    }

    public void closeDrawer(int r5, boolean r6) {
            r4 = this;
            android.view.View r0 = r4.findDrawerWithGravity(r5)
            if (r0 == 0) goto La
            r4.closeDrawer(r0, r6)
            return
        La:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "No drawer view found with gravity "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = gravityToString(r5)
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    public void closeDrawer(android.view.View r2) {
            r1 = this;
            r0 = 1
            r1.closeDrawer(r2, r0)
            return
    }

    public void closeDrawer(android.view.View r5, boolean r6) {
            r4 = this;
            boolean r0 = r4.isDrawerView(r5)
            if (r0 == 0) goto L52
            android.view.ViewGroup$LayoutParams r0 = r5.getLayoutParams()
            androidx.drawerlayout.widget.DrawerLayout$LayoutParams r0 = (androidx.drawerlayout.widget.DrawerLayout.LayoutParams) r0
            boolean r1 = r4.mFirstLayout
            r2 = 0
            r3 = 0
            if (r1 == 0) goto L17
            r0.onScreen = r3
            r0.openState = r2
            goto L4e
        L17:
            r1 = 4
            if (r6 == 0) goto L43
            int r2 = r0.openState
            r1 = r1 | r2
            r0.openState = r1
            r1 = 3
            boolean r1 = r4.checkDrawerViewAbsoluteGravity(r5, r1)
            if (r1 == 0) goto L35
            androidx.customview.widget.ViewDragHelper r1 = r4.mLeftDragger
            int r2 = r5.getWidth()
            int r2 = -r2
            int r3 = r5.getTop()
            r1.smoothSlideViewTo(r5, r2, r3)
            goto L4e
        L35:
            androidx.customview.widget.ViewDragHelper r1 = r4.mRightDragger
            int r2 = r4.getWidth()
            int r3 = r5.getTop()
            r1.smoothSlideViewTo(r5, r2, r3)
            goto L4e
        L43:
            r4.moveDrawerToOffset(r5, r3)
            int r3 = r0.gravity
            r4.updateDrawerState(r3, r2, r5)
            r5.setVisibility(r1)
        L4e:
            r4.invalidate()
            return
        L52:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "View "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r5)
            java.lang.String r2 = " is not a sliding drawer"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public void closeDrawers() {
            r1 = this;
            r0 = 0
            r1.closeDrawers(r0)
            return
    }

    void closeDrawers(boolean r10) {
            r9 = this;
            r0 = 0
            int r1 = r9.getChildCount()
            r2 = 0
        L6:
            if (r2 >= r1) goto L4c
            android.view.View r3 = r9.getChildAt(r2)
            android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
            androidx.drawerlayout.widget.DrawerLayout$LayoutParams r4 = (androidx.drawerlayout.widget.DrawerLayout.LayoutParams) r4
            boolean r5 = r9.isDrawerView(r3)
            if (r5 == 0) goto L49
            if (r10 == 0) goto L1f
            boolean r5 = r4.isPeeking
            if (r5 != 0) goto L1f
            goto L49
        L1f:
            int r5 = r3.getWidth()
            r6 = 3
            boolean r6 = r9.checkDrawerViewAbsoluteGravity(r3, r6)
            if (r6 == 0) goto L37
            androidx.customview.widget.ViewDragHelper r6 = r9.mLeftDragger
            int r7 = -r5
            int r8 = r3.getTop()
            boolean r6 = r6.smoothSlideViewTo(r3, r7, r8)
            r0 = r0 | r6
            goto L46
        L37:
            androidx.customview.widget.ViewDragHelper r6 = r9.mRightDragger
            int r7 = r9.getWidth()
            int r8 = r3.getTop()
            boolean r6 = r6.smoothSlideViewTo(r3, r7, r8)
            r0 = r0 | r6
        L46:
            r6 = 0
            r4.isPeeking = r6
        L49:
            int r2 = r2 + 1
            goto L6
        L4c:
            androidx.drawerlayout.widget.DrawerLayout$ViewDragCallback r2 = r9.mLeftCallback
            r2.removeCallbacks()
            androidx.drawerlayout.widget.DrawerLayout$ViewDragCallback r2 = r9.mRightCallback
            r2.removeCallbacks()
            if (r0 == 0) goto L5b
            r9.invalidate()
        L5b:
            return
    }

    @Override // android.view.View
    public void computeScroll() {
            r5 = this;
            int r0 = r5.getChildCount()
            r1 = 0
            r2 = 0
        L6:
            if (r2 >= r0) goto L1b
            android.view.View r3 = r5.getChildAt(r2)
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            androidx.drawerlayout.widget.DrawerLayout$LayoutParams r3 = (androidx.drawerlayout.widget.DrawerLayout.LayoutParams) r3
            float r3 = r3.onScreen
            float r1 = java.lang.Math.max(r1, r3)
            int r2 = r2 + 1
            goto L6
        L1b:
            r5.mScrimOpacity = r1
            androidx.customview.widget.ViewDragHelper r2 = r5.mLeftDragger
            r3 = 1
            boolean r2 = r2.continueSettling(r3)
            androidx.customview.widget.ViewDragHelper r4 = r5.mRightDragger
            boolean r3 = r4.continueSettling(r3)
            if (r2 != 0) goto L2e
            if (r3 == 0) goto L31
        L2e:
            androidx.core.view.ViewCompat.postInvalidateOnAnimation(r5)
        L31:
            return
    }

    @Override // android.view.View
    public boolean dispatchGenericMotionEvent(android.view.MotionEvent r7) {
            r6 = this;
            int r0 = r7.getSource()
            r0 = r0 & 2
            if (r0 == 0) goto L48
            int r0 = r7.getAction()
            r1 = 10
            if (r0 == r1) goto L48
            float r0 = r6.mScrimOpacity
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L18
            goto L48
        L18:
            int r0 = r6.getChildCount()
            if (r0 == 0) goto L46
            float r1 = r7.getX()
            float r2 = r7.getY()
            int r3 = r0 + (-1)
        L28:
            if (r3 < 0) goto L46
            android.view.View r4 = r6.getChildAt(r3)
            boolean r5 = r6.isInBoundsOfChild(r1, r2, r4)
            if (r5 == 0) goto L43
            boolean r5 = r6.isContentView(r4)
            if (r5 == 0) goto L3b
            goto L43
        L3b:
            boolean r5 = r6.dispatchTransformedGenericPointerEvent(r7, r4)
            if (r5 == 0) goto L43
            r5 = 1
            return r5
        L43:
            int r3 = r3 + (-1)
            goto L28
        L46:
            r1 = 0
            return r1
        L48:
            boolean r0 = super.dispatchGenericMotionEvent(r7)
            return r0
    }

    void dispatchOnDrawerClosed(android.view.View r6) {
            r5 = this;
            android.view.ViewGroup$LayoutParams r0 = r6.getLayoutParams()
            androidx.drawerlayout.widget.DrawerLayout$LayoutParams r0 = (androidx.drawerlayout.widget.DrawerLayout.LayoutParams) r0
            int r1 = r0.openState
            r2 = 1
            r1 = r1 & r2
            if (r1 != r2) goto L3f
            r1 = 0
            r0.openState = r1
            java.util.List<androidx.drawerlayout.widget.DrawerLayout$DrawerListener> r2 = r5.mListeners
            if (r2 == 0) goto L2b
            java.util.List<androidx.drawerlayout.widget.DrawerLayout$DrawerListener> r2 = r5.mListeners
            int r2 = r2.size()
            int r3 = r2 + (-1)
        L1b:
            if (r3 < 0) goto L2b
            java.util.List<androidx.drawerlayout.widget.DrawerLayout$DrawerListener> r4 = r5.mListeners
            java.lang.Object r4 = r4.get(r3)
            androidx.drawerlayout.widget.DrawerLayout$DrawerListener r4 = (androidx.drawerlayout.widget.DrawerLayout.DrawerListener) r4
            r4.onDrawerClosed(r6)
            int r3 = r3 + (-1)
            goto L1b
        L2b:
            r5.updateChildrenImportantForAccessibility(r6, r1)
            boolean r1 = r5.hasWindowFocus()
            if (r1 == 0) goto L3f
            android.view.View r1 = r5.getRootView()
            if (r1 == 0) goto L3f
            r2 = 32
            r1.sendAccessibilityEvent(r2)
        L3f:
            return
    }

    void dispatchOnDrawerOpened(android.view.View r6) {
            r5 = this;
            android.view.ViewGroup$LayoutParams r0 = r6.getLayoutParams()
            androidx.drawerlayout.widget.DrawerLayout$LayoutParams r0 = (androidx.drawerlayout.widget.DrawerLayout.LayoutParams) r0
            int r1 = r0.openState
            r2 = 1
            r1 = r1 & r2
            if (r1 != 0) goto L38
            r0.openState = r2
            java.util.List<androidx.drawerlayout.widget.DrawerLayout$DrawerListener> r1 = r5.mListeners
            if (r1 == 0) goto L2a
            java.util.List<androidx.drawerlayout.widget.DrawerLayout$DrawerListener> r1 = r5.mListeners
            int r1 = r1.size()
            int r3 = r1 + (-1)
        L1a:
            if (r3 < 0) goto L2a
            java.util.List<androidx.drawerlayout.widget.DrawerLayout$DrawerListener> r4 = r5.mListeners
            java.lang.Object r4 = r4.get(r3)
            androidx.drawerlayout.widget.DrawerLayout$DrawerListener r4 = (androidx.drawerlayout.widget.DrawerLayout.DrawerListener) r4
            r4.onDrawerOpened(r6)
            int r3 = r3 + (-1)
            goto L1a
        L2a:
            r5.updateChildrenImportantForAccessibility(r6, r2)
            boolean r1 = r5.hasWindowFocus()
            if (r1 == 0) goto L38
            r1 = 32
            r5.sendAccessibilityEvent(r1)
        L38:
            return
    }

    void dispatchOnDrawerSlide(android.view.View r4, float r5) {
            r3 = this;
            java.util.List<androidx.drawerlayout.widget.DrawerLayout$DrawerListener> r0 = r3.mListeners
            if (r0 == 0) goto L1c
            java.util.List<androidx.drawerlayout.widget.DrawerLayout$DrawerListener> r0 = r3.mListeners
            int r0 = r0.size()
            int r1 = r0 + (-1)
        Lc:
            if (r1 < 0) goto L1c
            java.util.List<androidx.drawerlayout.widget.DrawerLayout$DrawerListener> r2 = r3.mListeners
            java.lang.Object r2 = r2.get(r1)
            androidx.drawerlayout.widget.DrawerLayout$DrawerListener r2 = (androidx.drawerlayout.widget.DrawerLayout.DrawerListener) r2
            r2.onDrawerSlide(r4, r5)
            int r1 = r1 + (-1)
            goto Lc
        L1c:
            return
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(android.graphics.Canvas r20, android.view.View r21, long r22) {
            r19 = this;
            r0 = r19
            r1 = r20
            r7 = r21
            int r8 = r0.getHeight()
            boolean r9 = r0.isContentView(r7)
            r2 = 0
            int r3 = r0.getWidth()
            int r10 = r1.save()
            r4 = 3
            if (r9 == 0) goto L63
            int r5 = r0.getChildCount()
            r6 = 0
        L1f:
            if (r6 >= r5) goto L58
            android.view.View r11 = r0.getChildAt(r6)
            if (r11 == r7) goto L55
            int r12 = r11.getVisibility()
            if (r12 != 0) goto L55
            boolean r12 = hasOpaqueBackground(r11)
            if (r12 == 0) goto L55
            boolean r12 = r0.isDrawerView(r11)
            if (r12 == 0) goto L55
            int r12 = r11.getHeight()
            if (r12 >= r8) goto L40
            goto L55
        L40:
            boolean r12 = r0.checkDrawerViewAbsoluteGravity(r11, r4)
            if (r12 == 0) goto L4e
            int r12 = r11.getRight()
            if (r12 <= r2) goto L4d
            r2 = r12
        L4d:
            goto L55
        L4e:
            int r12 = r11.getLeft()
            if (r12 >= r3) goto L55
            r3 = r12
        L55:
            int r6 = r6 + 1
            goto L1f
        L58:
            r6 = 0
            int r11 = r0.getHeight()
            r1.clipRect(r2, r6, r3, r11)
            r11 = r2
            r12 = r3
            goto L65
        L63:
            r11 = r2
            r12 = r3
        L65:
            boolean r13 = super.drawChild(r20, r21, r22)
            r1.restoreToCount(r10)
            float r2 = r0.mScrimOpacity
            r3 = 0
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 <= 0) goto La1
            if (r9 == 0) goto La1
            int r2 = r0.mScrimColor
            r3 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r2 = r2 & r3
            int r14 = r2 >>> 24
            float r2 = (float) r14
            float r3 = r0.mScrimOpacity
            float r2 = r2 * r3
            int r15 = (int) r2
            int r2 = r15 << 24
            int r3 = r0.mScrimColor
            r4 = 16777215(0xffffff, float:2.3509886E-38)
            r3 = r3 & r4
            r2 = r2 | r3
            android.graphics.Paint r3 = r0.mScrimPaint
            r3.setColor(r2)
            r3 = r2
            float r2 = (float) r11
            float r4 = (float) r12
            int r5 = r0.getHeight()
            float r5 = (float) r5
            android.graphics.Paint r6 = r0.mScrimPaint
            r16 = r3
            r3 = 0
            r1.drawRect(r2, r3, r4, r5, r6)
            goto L13a
        La1:
            android.graphics.drawable.Drawable r2 = r0.mShadowLeftResolved
            r6 = 1065353216(0x3f800000, float:1.0)
            if (r2 == 0) goto Lec
            boolean r2 = r0.checkDrawerViewAbsoluteGravity(r7, r4)
            if (r2 == 0) goto Le9
            android.graphics.drawable.Drawable r2 = r0.mShadowLeftResolved
            int r2 = r2.getIntrinsicWidth()
            int r4 = r7.getRight()
            androidx.customview.widget.ViewDragHelper r14 = r0.mLeftDragger
            int r14 = r14.getEdgeSize()
            float r15 = (float) r4
            r16 = 1132396544(0x437f0000, float:255.0)
            float r5 = (float) r14
            float r15 = r15 / r5
            float r5 = java.lang.Math.min(r15, r6)
            float r3 = java.lang.Math.max(r3, r5)
            android.graphics.drawable.Drawable r5 = r0.mShadowLeftResolved
            int r6 = r7.getTop()
            int r15 = r4 + r2
            r17 = r2
            int r2 = r7.getBottom()
            r5.setBounds(r4, r6, r15, r2)
            android.graphics.drawable.Drawable r2 = r0.mShadowLeftResolved
            float r5 = r3 * r16
            int r5 = (int) r5
            r2.setAlpha(r5)
            android.graphics.drawable.Drawable r2 = r0.mShadowLeftResolved
            r2.draw(r1)
            goto L13a
        Le9:
            r16 = 1132396544(0x437f0000, float:255.0)
            goto Lee
        Lec:
            r16 = 1132396544(0x437f0000, float:255.0)
        Lee:
            android.graphics.drawable.Drawable r2 = r0.mShadowRightResolved
            if (r2 == 0) goto L13a
            r2 = 5
            boolean r2 = r0.checkDrawerViewAbsoluteGravity(r7, r2)
            if (r2 == 0) goto L13a
            android.graphics.drawable.Drawable r2 = r0.mShadowRightResolved
            int r2 = r2.getIntrinsicWidth()
            int r4 = r7.getLeft()
            int r5 = r0.getWidth()
            int r5 = r5 - r4
            androidx.customview.widget.ViewDragHelper r14 = r0.mRightDragger
            int r14 = r14.getEdgeSize()
            float r15 = (float) r5
            float r3 = (float) r14
            float r15 = r15 / r3
            float r3 = java.lang.Math.min(r15, r6)
            r6 = 0
            float r3 = java.lang.Math.max(r6, r3)
            android.graphics.drawable.Drawable r6 = r0.mShadowRightResolved
            int r15 = r4 - r2
            r17 = r2
            int r2 = r7.getTop()
            r18 = r3
            int r3 = r7.getBottom()
            r6.setBounds(r15, r2, r4, r3)
            android.graphics.drawable.Drawable r2 = r0.mShadowRightResolved
            float r3 = r18 * r16
            int r3 = (int) r3
            r2.setAlpha(r3)
            android.graphics.drawable.Drawable r2 = r0.mShadowRightResolved
            r2.draw(r1)
        L13a:
            return r13
    }

    android.view.View findDrawerWithGravity(int r7) {
            r6 = this;
            int r0 = androidx.core.view.ViewCompat.getLayoutDirection(r6)
            int r0 = androidx.core.view.GravityCompat.getAbsoluteGravity(r7, r0)
            r0 = r0 & 7
            int r1 = r6.getChildCount()
            r2 = 0
        L10:
            if (r2 >= r1) goto L22
            android.view.View r3 = r6.getChildAt(r2)
            int r4 = r6.getDrawerViewAbsoluteGravity(r3)
            r5 = r4 & 7
            if (r5 != r0) goto L1f
            return r3
        L1f:
            int r2 = r2 + 1
            goto L10
        L22:
            r2 = 0
            return r2
    }

    android.view.View findOpenDrawer() {
            r6 = this;
            int r0 = r6.getChildCount()
            r1 = 0
        L5:
            if (r1 >= r0) goto L1b
            android.view.View r2 = r6.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r3 = r2.getLayoutParams()
            androidx.drawerlayout.widget.DrawerLayout$LayoutParams r3 = (androidx.drawerlayout.widget.DrawerLayout.LayoutParams) r3
            int r4 = r3.openState
            r5 = 1
            r4 = r4 & r5
            if (r4 != r5) goto L18
            return r2
        L18:
            int r1 = r1 + 1
            goto L5
        L1b:
            r1 = 0
            return r1
    }

    android.view.View findVisibleDrawer() {
            r4 = this;
            int r0 = r4.getChildCount()
            r1 = 0
        L5:
            if (r1 >= r0) goto L1b
            android.view.View r2 = r4.getChildAt(r1)
            boolean r3 = r4.isDrawerView(r2)
            if (r3 == 0) goto L18
            boolean r3 = r4.isDrawerVisible(r2)
            if (r3 == 0) goto L18
            return r2
        L18:
            int r1 = r1 + 1
            goto L5
        L1b:
            r1 = 0
            return r1
    }

    @Override // android.view.ViewGroup
    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
            r2 = this;
            androidx.drawerlayout.widget.DrawerLayout$LayoutParams r0 = new androidx.drawerlayout.widget.DrawerLayout$LayoutParams
            r1 = -1
            r0.<init>(r1, r1)
            return r0
    }

    @Override // android.view.ViewGroup
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet r3) {
            r2 = this;
            androidx.drawerlayout.widget.DrawerLayout$LayoutParams r0 = new androidx.drawerlayout.widget.DrawerLayout$LayoutParams
            android.content.Context r1 = r2.getContext()
            r0.<init>(r1, r3)
            return r0
    }

    @Override // android.view.ViewGroup
    protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams r3) {
            r2 = this;
            boolean r0 = r3 instanceof androidx.drawerlayout.widget.DrawerLayout.LayoutParams
            if (r0 == 0) goto Ld
            androidx.drawerlayout.widget.DrawerLayout$LayoutParams r0 = new androidx.drawerlayout.widget.DrawerLayout$LayoutParams
            r1 = r3
            androidx.drawerlayout.widget.DrawerLayout$LayoutParams r1 = (androidx.drawerlayout.widget.DrawerLayout.LayoutParams) r1
            r0.<init>(r1)
            goto L1f
        Ld:
            boolean r0 = r3 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L1a
            androidx.drawerlayout.widget.DrawerLayout$LayoutParams r0 = new androidx.drawerlayout.widget.DrawerLayout$LayoutParams
            r1 = r3
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            r0.<init>(r1)
            goto L1f
        L1a:
            androidx.drawerlayout.widget.DrawerLayout$LayoutParams r0 = new androidx.drawerlayout.widget.DrawerLayout$LayoutParams
            r0.<init>(r3)
        L1f:
            return r0
    }

    public float getDrawerElevation() {
            r1 = this;
            boolean r0 = androidx.drawerlayout.widget.DrawerLayout.SET_DRAWER_SHADOW_FROM_ELEVATION
            if (r0 == 0) goto L7
            float r0 = r1.mDrawerElevation
            return r0
        L7:
            r0 = 0
            return r0
    }

    public int getDrawerLockMode(int r4) {
            r3 = this;
            int r0 = androidx.core.view.ViewCompat.getLayoutDirection(r3)
            r1 = 3
            switch(r4) {
                case 3: goto L3c;
                case 5: goto L2b;
                case 8388611: goto L1a;
                case 8388613: goto L9;
                default: goto L8;
            }
        L8:
            goto L4d
        L9:
            int r2 = r3.mLockModeEnd
            if (r2 == r1) goto L10
            int r1 = r3.mLockModeEnd
            return r1
        L10:
            if (r0 != 0) goto L15
            int r2 = r3.mLockModeRight
            goto L17
        L15:
            int r2 = r3.mLockModeLeft
        L17:
            if (r2 == r1) goto L4d
            return r2
        L1a:
            int r2 = r3.mLockModeStart
            if (r2 == r1) goto L21
            int r1 = r3.mLockModeStart
            return r1
        L21:
            if (r0 != 0) goto L26
            int r2 = r3.mLockModeLeft
            goto L28
        L26:
            int r2 = r3.mLockModeRight
        L28:
            if (r2 == r1) goto L4d
            return r2
        L2b:
            int r2 = r3.mLockModeRight
            if (r2 == r1) goto L32
            int r1 = r3.mLockModeRight
            return r1
        L32:
            if (r0 != 0) goto L37
            int r2 = r3.mLockModeEnd
            goto L39
        L37:
            int r2 = r3.mLockModeStart
        L39:
            if (r2 == r1) goto L4d
            return r2
        L3c:
            int r2 = r3.mLockModeLeft
            if (r2 == r1) goto L43
            int r1 = r3.mLockModeLeft
            return r1
        L43:
            if (r0 != 0) goto L48
            int r2 = r3.mLockModeStart
            goto L4a
        L48:
            int r2 = r3.mLockModeEnd
        L4a:
            if (r2 == r1) goto L4d
            return r2
        L4d:
            r1 = 0
            return r1
    }

    public int getDrawerLockMode(android.view.View r4) {
            r3 = this;
            boolean r0 = r3.isDrawerView(r4)
            if (r0 == 0) goto L13
            android.view.ViewGroup$LayoutParams r0 = r4.getLayoutParams()
            androidx.drawerlayout.widget.DrawerLayout$LayoutParams r0 = (androidx.drawerlayout.widget.DrawerLayout.LayoutParams) r0
            int r0 = r0.gravity
            int r1 = r3.getDrawerLockMode(r0)
            return r1
        L13:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "View "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r4)
            java.lang.String r2 = " is not a drawer"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public java.lang.CharSequence getDrawerTitle(int r3) {
            r2 = this;
            int r0 = androidx.core.view.ViewCompat.getLayoutDirection(r2)
            int r0 = androidx.core.view.GravityCompat.getAbsoluteGravity(r3, r0)
            r1 = 3
            if (r0 != r1) goto Lf
            java.lang.CharSequence r1 = r2.mTitleLeft
            return r1
        Lf:
            r1 = 5
            if (r0 != r1) goto L15
            java.lang.CharSequence r1 = r2.mTitleRight
            return r1
        L15:
            r1 = 0
            return r1
    }

    int getDrawerViewAbsoluteGravity(android.view.View r3) {
            r2 = this;
            android.view.ViewGroup$LayoutParams r0 = r3.getLayoutParams()
            androidx.drawerlayout.widget.DrawerLayout$LayoutParams r0 = (androidx.drawerlayout.widget.DrawerLayout.LayoutParams) r0
            int r0 = r0.gravity
            int r1 = androidx.core.view.ViewCompat.getLayoutDirection(r2)
            int r1 = androidx.core.view.GravityCompat.getAbsoluteGravity(r0, r1)
            return r1
    }

    float getDrawerViewOffset(android.view.View r2) {
            r1 = this;
            android.view.ViewGroup$LayoutParams r0 = r2.getLayoutParams()
            androidx.drawerlayout.widget.DrawerLayout$LayoutParams r0 = (androidx.drawerlayout.widget.DrawerLayout.LayoutParams) r0
            float r0 = r0.onScreen
            return r0
    }

    public android.graphics.drawable.Drawable getStatusBarBackgroundDrawable() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mStatusBarBackground
            return r0
    }

    boolean isContentView(android.view.View r2) {
            r1 = this;
            android.view.ViewGroup$LayoutParams r0 = r2.getLayoutParams()
            androidx.drawerlayout.widget.DrawerLayout$LayoutParams r0 = (androidx.drawerlayout.widget.DrawerLayout.LayoutParams) r0
            int r0 = r0.gravity
            if (r0 != 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    public boolean isDrawerOpen(int r3) {
            r2 = this;
            android.view.View r0 = r2.findDrawerWithGravity(r3)
            if (r0 == 0) goto Lb
            boolean r1 = r2.isDrawerOpen(r0)
            return r1
        Lb:
            r1 = 0
            return r1
    }

    public boolean isDrawerOpen(android.view.View r4) {
            r3 = this;
            boolean r0 = r3.isDrawerView(r4)
            if (r0 == 0) goto L15
            android.view.ViewGroup$LayoutParams r0 = r4.getLayoutParams()
            androidx.drawerlayout.widget.DrawerLayout$LayoutParams r0 = (androidx.drawerlayout.widget.DrawerLayout.LayoutParams) r0
            int r1 = r0.openState
            r2 = 1
            r1 = r1 & r2
            if (r1 != r2) goto L13
            goto L14
        L13:
            r2 = 0
        L14:
            return r2
        L15:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "View "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r4)
            java.lang.String r2 = " is not a drawer"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    boolean isDrawerView(android.view.View r5) {
            r4 = this;
            android.view.ViewGroup$LayoutParams r0 = r5.getLayoutParams()
            androidx.drawerlayout.widget.DrawerLayout$LayoutParams r0 = (androidx.drawerlayout.widget.DrawerLayout.LayoutParams) r0
            int r0 = r0.gravity
            int r1 = androidx.core.view.ViewCompat.getLayoutDirection(r5)
            int r1 = androidx.core.view.GravityCompat.getAbsoluteGravity(r0, r1)
            r2 = r1 & 3
            r3 = 1
            if (r2 == 0) goto L17
            return r3
        L17:
            r2 = r1 & 5
            if (r2 == 0) goto L1c
            return r3
        L1c:
            r2 = 0
            return r2
    }

    public boolean isDrawerVisible(int r3) {
            r2 = this;
            android.view.View r0 = r2.findDrawerWithGravity(r3)
            if (r0 == 0) goto Lb
            boolean r1 = r2.isDrawerVisible(r0)
            return r1
        Lb:
            r1 = 0
            return r1
    }

    public boolean isDrawerVisible(android.view.View r4) {
            r3 = this;
            boolean r0 = r3.isDrawerView(r4)
            if (r0 == 0) goto L17
            android.view.ViewGroup$LayoutParams r0 = r4.getLayoutParams()
            androidx.drawerlayout.widget.DrawerLayout$LayoutParams r0 = (androidx.drawerlayout.widget.DrawerLayout.LayoutParams) r0
            float r0 = r0.onScreen
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L15
            r0 = 1
            goto L16
        L15:
            r0 = 0
        L16:
            return r0
        L17:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "View "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r4)
            java.lang.String r2 = " is not a drawer"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    void moveDrawerToOffset(android.view.View r7, float r8) {
            r6 = this;
            float r0 = r6.getDrawerViewOffset(r7)
            int r1 = r7.getWidth()
            float r2 = (float) r1
            float r2 = r2 * r0
            int r2 = (int) r2
            float r3 = (float) r1
            float r3 = r3 * r8
            int r3 = (int) r3
            int r4 = r3 - r2
            r5 = 3
            boolean r5 = r6.checkDrawerViewAbsoluteGravity(r7, r5)
            if (r5 == 0) goto L1a
            r5 = r4
            goto L1b
        L1a:
            int r5 = -r4
        L1b:
            r7.offsetLeftAndRight(r5)
            r6.setDrawerViewOffset(r7, r8)
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
            r1 = this;
            super.onAttachedToWindow()
            r0 = 1
            r1.mFirstLayout = r0
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
            r1 = this;
            super.onDetachedFromWindow()
            r0 = 1
            r1.mFirstLayout = r0
            return
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas r5) {
            r4 = this;
            super.onDraw(r5)
            boolean r0 = r4.mDrawStatusBarBackground
            if (r0 == 0) goto L2b
            android.graphics.drawable.Drawable r0 = r4.mStatusBarBackground
            if (r0 == 0) goto L2b
        Lc:
            java.lang.Object r0 = r4.mLastInsets
            r1 = 0
            if (r0 == 0) goto L1a
            java.lang.Object r0 = r4.mLastInsets
            android.view.WindowInsets r0 = (android.view.WindowInsets) r0
            int r0 = r0.getSystemWindowInsetTop()
            goto L1b
        L1a:
            r0 = r1
        L1b:
            if (r0 <= 0) goto L2b
            android.graphics.drawable.Drawable r2 = r4.mStatusBarBackground
            int r3 = r4.getWidth()
            r2.setBounds(r1, r1, r3, r0)
            android.graphics.drawable.Drawable r1 = r4.mStatusBarBackground
            r1.draw(r5)
        L2b:
            return
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent r11) {
            r10 = this;
            int r0 = r11.getActionMasked()
            androidx.customview.widget.ViewDragHelper r1 = r10.mLeftDragger
            boolean r1 = r1.shouldInterceptTouchEvent(r11)
            androidx.customview.widget.ViewDragHelper r2 = r10.mRightDragger
            boolean r2 = r2.shouldInterceptTouchEvent(r11)
            r1 = r1 | r2
            r2 = 0
            r3 = 1
            r4 = 0
            switch(r0) {
                case 0: goto L34;
                case 1: goto L2c;
                case 2: goto L18;
                case 3: goto L2c;
                default: goto L17;
            }
        L17:
            goto L5d
        L18:
            androidx.customview.widget.ViewDragHelper r5 = r10.mLeftDragger
            r6 = 3
            boolean r5 = r5.checkTouchSlop(r6)
            if (r5 == 0) goto L5d
            androidx.drawerlayout.widget.DrawerLayout$ViewDragCallback r5 = r10.mLeftCallback
            r5.removeCallbacks()
            androidx.drawerlayout.widget.DrawerLayout$ViewDragCallback r5 = r10.mRightCallback
            r5.removeCallbacks()
            goto L5d
        L2c:
            r10.closeDrawers(r3)
            r10.mDisallowInterceptRequested = r4
            r10.mChildrenCanceledTouch = r4
            goto L5d
        L34:
            float r5 = r11.getX()
            float r6 = r11.getY()
            r10.mInitialMotionX = r5
            r10.mInitialMotionY = r6
            float r7 = r10.mScrimOpacity
            r8 = 0
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 <= 0) goto L58
            androidx.customview.widget.ViewDragHelper r7 = r10.mLeftDragger
            int r8 = (int) r5
            int r9 = (int) r6
            android.view.View r7 = r7.findTopChildUnder(r8, r9)
            if (r7 == 0) goto L58
            boolean r8 = r10.isContentView(r7)
            if (r8 == 0) goto L58
            r2 = 1
        L58:
            r10.mDisallowInterceptRequested = r4
            r10.mChildrenCanceledTouch = r4
        L5d:
            if (r1 != 0) goto L6d
            if (r2 != 0) goto L6d
            boolean r5 = r10.hasPeekingDrawer()
            if (r5 != 0) goto L6d
            boolean r5 = r10.mChildrenCanceledTouch
            if (r5 == 0) goto L6c
            goto L6d
        L6c:
            r3 = r4
        L6d:
            return r3
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int r2, android.view.KeyEvent r3) {
            r1 = this;
            r0 = 4
            if (r2 != r0) goto Le
            boolean r0 = r1.hasVisibleDrawer()
            if (r0 == 0) goto Le
            r3.startTracking()
            r0 = 1
            return r0
        Le:
            boolean r0 = super.onKeyDown(r2, r3)
            return r0
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int r3, android.view.KeyEvent r4) {
            r2 = this;
            r0 = 4
            if (r3 != r0) goto L18
            android.view.View r0 = r2.findVisibleDrawer()
            if (r0 == 0) goto L12
            int r1 = r2.getDrawerLockMode(r0)
            if (r1 != 0) goto L12
            r2.closeDrawers()
        L12:
            if (r0 == 0) goto L16
            r1 = 1
            goto L17
        L16:
            r1 = 0
        L17:
            return r1
        L18:
            boolean r0 = super.onKeyUp(r3, r4)
            return r0
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean r18, int r19, int r20, int r21, int r22) {
            r17 = this;
            r0 = r17
            r1 = 1
            r0.mInLayout = r1
            int r2 = r21 - r19
            int r3 = r0.getChildCount()
            r4 = 0
        Lc:
            if (r4 >= r3) goto Ld8
            android.view.View r6 = r0.getChildAt(r4)
            int r7 = r6.getVisibility()
            r8 = 8
            if (r7 != r8) goto L1c
            goto Ld3
        L1c:
            android.view.ViewGroup$LayoutParams r7 = r6.getLayoutParams()
            androidx.drawerlayout.widget.DrawerLayout$LayoutParams r7 = (androidx.drawerlayout.widget.DrawerLayout.LayoutParams) r7
            boolean r8 = r0.isContentView(r6)
            if (r8 == 0) goto L3f
            int r5 = r7.leftMargin
            int r8 = r7.topMargin
            int r9 = r7.leftMargin
            int r10 = r6.getMeasuredWidth()
            int r9 = r9 + r10
            int r10 = r7.topMargin
            int r11 = r6.getMeasuredHeight()
            int r10 = r10 + r11
            r6.layout(r5, r8, r9, r10)
            goto Ld3
        L3f:
            int r8 = r6.getMeasuredWidth()
            int r9 = r6.getMeasuredHeight()
            r10 = 3
            boolean r10 = r0.checkDrawerViewAbsoluteGravity(r6, r10)
            if (r10 == 0) goto L5b
            int r10 = -r8
            float r11 = (float) r8
            float r12 = r7.onScreen
            float r11 = r11 * r12
            int r11 = (int) r11
            int r10 = r10 + r11
            int r11 = r8 + r10
            float r11 = (float) r11
            float r12 = (float) r8
            float r11 = r11 / r12
            goto L67
        L5b:
            float r10 = (float) r8
            float r11 = r7.onScreen
            float r10 = r10 * r11
            int r10 = (int) r10
            int r10 = r2 - r10
            int r11 = r2 - r10
            float r11 = (float) r11
            float r12 = (float) r8
            float r11 = r11 / r12
        L67:
            float r12 = r7.onScreen
            int r12 = (r11 > r12 ? 1 : (r11 == r12 ? 0 : -1))
            if (r12 == 0) goto L6f
            r12 = r1
            goto L70
        L6f:
            r12 = 0
        L70:
            int r13 = r7.gravity
            r13 = r13 & 112(0x70, float:1.57E-43)
            switch(r13) {
                case 16: goto L98;
                case 80: goto L82;
                default: goto L77;
            }
        L77:
            int r1 = r7.topMargin
            int r5 = r10 + r8
            int r14 = r7.topMargin
            int r14 = r14 + r9
            r6.layout(r10, r1, r5, r14)
            goto Lbb
        L82:
            int r14 = r22 - r20
            int r15 = r7.bottomMargin
            int r15 = r14 - r15
            int r16 = r6.getMeasuredHeight()
            int r15 = r15 - r16
            int r1 = r10 + r8
            int r5 = r7.bottomMargin
            int r5 = r14 - r5
            r6.layout(r10, r15, r1, r5)
            goto Lbb
        L98:
            int r1 = r22 - r20
            int r5 = r1 - r9
            int r5 = r5 / 2
            int r14 = r7.topMargin
            if (r5 >= r14) goto La5
            int r5 = r7.topMargin
            goto Lb3
        La5:
            int r14 = r5 + r9
            int r15 = r7.bottomMargin
            int r15 = r1 - r15
            if (r14 <= r15) goto Lb3
            int r14 = r7.bottomMargin
            int r14 = r1 - r14
            int r5 = r14 - r9
        Lb3:
            int r14 = r10 + r8
            int r15 = r5 + r9
            r6.layout(r10, r5, r14, r15)
        Lbb:
            if (r12 == 0) goto Lc0
            r0.setDrawerViewOffset(r6, r11)
        Lc0:
            float r1 = r7.onScreen
            r5 = 0
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 <= 0) goto Lc9
            r5 = 0
            goto Lca
        Lc9:
            r5 = 4
        Lca:
            int r1 = r6.getVisibility()
            if (r1 == r5) goto Ld3
            r6.setVisibility(r5)
        Ld3:
            int r4 = r4 + 1
            r1 = 1
            goto Lc
        Ld8:
            r1 = 0
            r0.mInLayout = r1
            r0.mFirstLayout = r1
            return
    }

    @Override // android.view.View
    protected void onMeasure(int r21, int r22) {
            r20 = this;
            r0 = r20
            int r1 = android.view.View.MeasureSpec.getMode(r21)
            int r2 = android.view.View.MeasureSpec.getMode(r22)
            int r3 = android.view.View.MeasureSpec.getSize(r21)
            int r4 = android.view.View.MeasureSpec.getSize(r22)
            r5 = 1073741824(0x40000000, float:2.0)
            if (r1 != r5) goto L18
            if (r2 == r5) goto L36
        L18:
            boolean r6 = r0.isInEditMode()
            if (r6 == 0) goto L205
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 != r6) goto L25
            r1 = 1073741824(0x40000000, float:2.0)
            goto L2b
        L25:
            if (r1 != 0) goto L2b
            r1 = 1073741824(0x40000000, float:2.0)
            r3 = 300(0x12c, float:4.2E-43)
        L2b:
            if (r2 != r6) goto L30
            r2 = 1073741824(0x40000000, float:2.0)
            goto L36
        L30:
            if (r2 != 0) goto L36
            r2 = 1073741824(0x40000000, float:2.0)
            r4 = 300(0x12c, float:4.2E-43)
        L36:
            r0.setMeasuredDimension(r3, r4)
            java.lang.Object r6 = r0.mLastInsets
            if (r6 == 0) goto L45
            boolean r6 = androidx.core.view.ViewCompat.getFitsSystemWindows(r0)
            if (r6 == 0) goto L45
            r6 = 1
            goto L46
        L45:
            r6 = 0
        L46:
            int r9 = androidx.core.view.ViewCompat.getLayoutDirection(r0)
            r10 = 0
            r11 = 0
            int r12 = r0.getChildCount()
            r13 = 0
        L51:
            if (r13 >= r12) goto L204
            android.view.View r14 = r0.getChildAt(r13)
            int r15 = r14.getVisibility()
            r7 = 8
            if (r15 != r7) goto L69
            r17 = r1
            r18 = r2
            r19 = r3
            r1 = r5
            r15 = 0
            goto L131
        L69:
            android.view.ViewGroup$LayoutParams r7 = r14.getLayoutParams()
            androidx.drawerlayout.widget.DrawerLayout$LayoutParams r7 = (androidx.drawerlayout.widget.DrawerLayout.LayoutParams) r7
            r15 = 3
            if (r6 == 0) goto L108
            int r5 = r7.gravity
            int r5 = androidx.core.view.GravityCompat.getAbsoluteGravity(r5, r9)
            boolean r16 = androidx.core.view.ViewCompat.getFitsSystemWindows(r14)
            if (r16 == 0) goto Lbc
        L7f:
            java.lang.Object r8 = r0.mLastInsets
            android.view.WindowInsets r8 = (android.view.WindowInsets) r8
            if (r5 != r15) goto L9d
            int r15 = r8.getSystemWindowInsetLeft()
            r17 = r1
            int r1 = r8.getSystemWindowInsetTop()
            r18 = r2
            int r2 = r8.getSystemWindowInsetBottom()
            r19 = r3
            r3 = 0
            android.view.WindowInsets r8 = r8.replaceSystemWindowInsets(r15, r1, r3, r2)
            goto Lb7
        L9d:
            r17 = r1
            r18 = r2
            r19 = r3
            r3 = 0
            r1 = 5
            if (r5 != r1) goto Lb7
            int r1 = r8.getSystemWindowInsetTop()
            int r2 = r8.getSystemWindowInsetRight()
            int r15 = r8.getSystemWindowInsetBottom()
            android.view.WindowInsets r8 = r8.replaceSystemWindowInsets(r3, r1, r2, r15)
        Lb7:
            r14.dispatchApplyWindowInsets(r8)
            r15 = 0
            goto L10f
        Lbc:
            r17 = r1
            r18 = r2
            r19 = r3
            java.lang.Object r1 = r0.mLastInsets
            android.view.WindowInsets r1 = (android.view.WindowInsets) r1
            r2 = 3
            if (r5 != r2) goto Ldb
            int r2 = r1.getSystemWindowInsetLeft()
            int r3 = r1.getSystemWindowInsetTop()
            int r8 = r1.getSystemWindowInsetBottom()
            r15 = 0
            android.view.WindowInsets r1 = r1.replaceSystemWindowInsets(r2, r3, r15, r8)
            goto Lef
        Ldb:
            r15 = 0
            r2 = 5
            if (r5 != r2) goto Lef
            int r2 = r1.getSystemWindowInsetTop()
            int r3 = r1.getSystemWindowInsetRight()
            int r8 = r1.getSystemWindowInsetBottom()
            android.view.WindowInsets r1 = r1.replaceSystemWindowInsets(r15, r2, r3, r8)
        Lef:
            int r2 = r1.getSystemWindowInsetLeft()
            r7.leftMargin = r2
            int r2 = r1.getSystemWindowInsetTop()
            r7.topMargin = r2
            int r2 = r1.getSystemWindowInsetRight()
            r7.rightMargin = r2
            int r2 = r1.getSystemWindowInsetBottom()
            r7.bottomMargin = r2
            goto L10f
        L108:
            r17 = r1
            r18 = r2
            r19 = r3
            r15 = 0
        L10f:
            boolean r1 = r0.isContentView(r14)
            if (r1 == 0) goto L137
            int r1 = r7.leftMargin
            int r3 = r19 - r1
            int r1 = r7.rightMargin
            int r3 = r3 - r1
            r1 = 1073741824(0x40000000, float:2.0)
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r1)
            int r3 = r7.topMargin
            int r3 = r4 - r3
            int r5 = r7.bottomMargin
            int r3 = r3 - r5
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r1)
            r14.measure(r2, r3)
        L131:
            r1 = r21
            r0 = r22
            goto L1c3
        L137:
            r1 = 1073741824(0x40000000, float:2.0)
            boolean r2 = r0.isDrawerView(r14)
            if (r2 == 0) goto L1d1
            boolean r2 = androidx.drawerlayout.widget.DrawerLayout.SET_DRAWER_SHADOW_FROM_ELEVATION
            if (r2 == 0) goto L152
            float r2 = androidx.core.view.ViewCompat.getElevation(r14)
            float r3 = r0.mDrawerElevation
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 == 0) goto L152
            float r2 = r0.mDrawerElevation
            androidx.core.view.ViewCompat.setElevation(r14, r2)
        L152:
            int r2 = r0.getDrawerViewAbsoluteGravity(r14)
            r2 = r2 & 7
            r3 = 3
            if (r2 != r3) goto L15e
            r3 = 1
            goto L15f
        L15e:
            r3 = r15
        L15f:
            if (r3 == 0) goto L163
            if (r10 != 0) goto L168
        L163:
            if (r3 != 0) goto L19d
            if (r11 != 0) goto L168
            goto L19d
        L168:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r8 = "Child drawer has absolute gravity "
            java.lang.StringBuilder r5 = r5.append(r8)
            java.lang.String r8 = gravityToString(r2)
            java.lang.StringBuilder r5 = r5.append(r8)
            java.lang.String r8 = " but this "
            java.lang.StringBuilder r5 = r5.append(r8)
            java.lang.String r8 = "DrawerLayout"
            java.lang.StringBuilder r5 = r5.append(r8)
            java.lang.String r8 = " already has a "
            java.lang.StringBuilder r5 = r5.append(r8)
            java.lang.String r8 = "drawer view along that edge"
            java.lang.StringBuilder r5 = r5.append(r8)
            java.lang.String r5 = r5.toString()
            r1.<init>(r5)
            throw r1
        L19d:
            if (r3 == 0) goto L1a1
            r10 = 1
            goto L1a2
        L1a1:
            r11 = 1
        L1a2:
            int r5 = r0.mMinDrawerMargin
            int r8 = r7.leftMargin
            int r5 = r5 + r8
            int r8 = r7.rightMargin
            int r5 = r5 + r8
            int r8 = r7.width
            r1 = r21
            int r5 = getChildMeasureSpec(r1, r5, r8)
            int r8 = r7.topMargin
            int r15 = r7.bottomMargin
            int r8 = r8 + r15
            int r15 = r7.height
            r0 = r22
            int r8 = getChildMeasureSpec(r0, r8, r15)
            r14.measure(r5, r8)
        L1c3:
            int r13 = r13 + 1
            r0 = r20
            r1 = r17
            r2 = r18
            r3 = r19
            r5 = 1073741824(0x40000000, float:2.0)
            goto L51
        L1d1:
            r1 = r21
            r0 = r22
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "Child "
            java.lang.StringBuilder r3 = r3.append(r5)
            java.lang.StringBuilder r3 = r3.append(r14)
            java.lang.String r5 = " at index "
            java.lang.StringBuilder r3 = r3.append(r5)
            java.lang.StringBuilder r3 = r3.append(r13)
            java.lang.String r5 = " does not have a valid layout_gravity - must be Gravity.LEFT, "
            java.lang.StringBuilder r3 = r3.append(r5)
            java.lang.String r5 = "Gravity.RIGHT or Gravity.NO_GRAVITY"
            java.lang.StringBuilder r3 = r3.append(r5)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
        L204:
            return
        L205:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "DrawerLayout must be measured with MeasureSpec.EXACTLY."
            r6.<init>(r7)
            throw r6
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(android.os.Parcelable r5) {
            r4 = this;
            boolean r0 = r5 instanceof androidx.drawerlayout.widget.DrawerLayout.SavedState
            if (r0 != 0) goto L8
            super.onRestoreInstanceState(r5)
            return
        L8:
            r0 = r5
            androidx.drawerlayout.widget.DrawerLayout$SavedState r0 = (androidx.drawerlayout.widget.DrawerLayout.SavedState) r0
            android.os.Parcelable r1 = r0.getSuperState()
            super.onRestoreInstanceState(r1)
            int r1 = r0.openDrawerGravity
            if (r1 == 0) goto L21
            int r1 = r0.openDrawerGravity
            android.view.View r1 = r4.findDrawerWithGravity(r1)
            if (r1 == 0) goto L21
            r4.openDrawer(r1)
        L21:
            int r1 = r0.lockModeLeft
            r2 = 3
            if (r1 == r2) goto L2b
            int r1 = r0.lockModeLeft
            r4.setDrawerLockMode(r1, r2)
        L2b:
            int r1 = r0.lockModeRight
            if (r1 == r2) goto L35
            int r1 = r0.lockModeRight
            r3 = 5
            r4.setDrawerLockMode(r1, r3)
        L35:
            int r1 = r0.lockModeStart
            if (r1 == r2) goto L41
            int r1 = r0.lockModeStart
            r3 = 8388611(0x800003, float:1.1754948E-38)
            r4.setDrawerLockMode(r1, r3)
        L41:
            int r1 = r0.lockModeEnd
            if (r1 == r2) goto L4d
            int r1 = r0.lockModeEnd
            r2 = 8388613(0x800005, float:1.175495E-38)
            r4.setDrawerLockMode(r1, r2)
        L4d:
            return
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int r1) {
            r0 = this;
            r0.resolveShadowDrawables()
            return
    }

    @Override // android.view.View
    protected android.os.Parcelable onSaveInstanceState() {
            r11 = this;
            android.os.Parcelable r0 = super.onSaveInstanceState()
            androidx.drawerlayout.widget.DrawerLayout$SavedState r1 = new androidx.drawerlayout.widget.DrawerLayout$SavedState
            r1.<init>(r0)
            int r2 = r11.getChildCount()
            r3 = 0
        Le:
            if (r3 >= r2) goto L36
            android.view.View r4 = r11.getChildAt(r3)
            android.view.ViewGroup$LayoutParams r5 = r4.getLayoutParams()
            androidx.drawerlayout.widget.DrawerLayout$LayoutParams r5 = (androidx.drawerlayout.widget.DrawerLayout.LayoutParams) r5
            int r6 = r5.openState
            r7 = 0
            r8 = 1
            if (r6 != r8) goto L22
            r6 = r8
            goto L23
        L22:
            r6 = r7
        L23:
            int r9 = r5.openState
            r10 = 2
            if (r9 != r10) goto L29
            r7 = r8
        L29:
            if (r6 != 0) goto L31
            if (r7 == 0) goto L2e
            goto L31
        L2e:
            int r3 = r3 + 1
            goto Le
        L31:
            int r8 = r5.gravity
            r1.openDrawerGravity = r8
        L36:
            int r3 = r11.mLockModeLeft
            r1.lockModeLeft = r3
            int r3 = r11.mLockModeRight
            r1.lockModeRight = r3
            int r3 = r11.mLockModeStart
            r1.lockModeStart = r3
            int r3 = r11.mLockModeEnd
            r1.lockModeEnd = r3
            return r1
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent r15) {
            r14 = this;
            androidx.customview.widget.ViewDragHelper r0 = r14.mLeftDragger
            r0.processTouchEvent(r15)
            androidx.customview.widget.ViewDragHelper r0 = r14.mRightDragger
            r0.processTouchEvent(r15)
            int r0 = r15.getAction()
            r1 = 1
            r2 = r0 & 255(0xff, float:3.57E-43)
            r3 = 1
            r4 = 0
            switch(r2) {
                case 0: goto L68;
                case 1: goto L1f;
                case 2: goto L16;
                case 3: goto L17;
                default: goto L16;
            }
        L16:
            goto L79
        L17:
            r14.closeDrawers(r3)
            r14.mDisallowInterceptRequested = r4
            r14.mChildrenCanceledTouch = r4
            goto L79
        L1f:
            float r2 = r15.getX()
            float r5 = r15.getY()
            r6 = 1
            androidx.customview.widget.ViewDragHelper r7 = r14.mLeftDragger
            int r8 = (int) r2
            int r9 = (int) r5
            android.view.View r7 = r7.findTopChildUnder(r8, r9)
            if (r7 == 0) goto L62
            boolean r8 = r14.isContentView(r7)
            if (r8 == 0) goto L62
            float r8 = r14.mInitialMotionX
            float r8 = r2 - r8
            float r9 = r14.mInitialMotionY
            float r9 = r5 - r9
            androidx.customview.widget.ViewDragHelper r10 = r14.mLeftDragger
            int r10 = r10.getTouchSlop()
            float r11 = r8 * r8
            float r12 = r9 * r9
            float r11 = r11 + r12
            int r12 = r10 * r10
            float r12 = (float) r12
            int r11 = (r11 > r12 ? 1 : (r11 == r12 ? 0 : -1))
            if (r11 >= 0) goto L62
            android.view.View r11 = r14.findOpenDrawer()
            if (r11 == 0) goto L62
            int r12 = r14.getDrawerLockMode(r11)
            r13 = 2
            if (r12 != r13) goto L60
            goto L61
        L60:
            r3 = r4
        L61:
            r6 = r3
        L62:
            r14.closeDrawers(r6)
            r14.mDisallowInterceptRequested = r4
            goto L79
        L68:
            float r2 = r15.getX()
            float r3 = r15.getY()
            r14.mInitialMotionX = r2
            r14.mInitialMotionY = r3
            r14.mDisallowInterceptRequested = r4
            r14.mChildrenCanceledTouch = r4
        L79:
            return r1
    }

    public void openDrawer(int r2) {
            r1 = this;
            r0 = 1
            r1.openDrawer(r2, r0)
            return
    }

    public void openDrawer(int r5, boolean r6) {
            r4 = this;
            android.view.View r0 = r4.findDrawerWithGravity(r5)
            if (r0 == 0) goto La
            r4.openDrawer(r0, r6)
            return
        La:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "No drawer view found with gravity "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = gravityToString(r5)
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    public void openDrawer(android.view.View r2) {
            r1 = this;
            r0 = 1
            r1.openDrawer(r2, r0)
            return
    }

    public void openDrawer(android.view.View r5, boolean r6) {
            r4 = this;
            boolean r0 = r4.isDrawerView(r5)
            if (r0 == 0) goto L57
            android.view.ViewGroup$LayoutParams r0 = r5.getLayoutParams()
            androidx.drawerlayout.widget.DrawerLayout$LayoutParams r0 = (androidx.drawerlayout.widget.DrawerLayout.LayoutParams) r0
            boolean r1 = r4.mFirstLayout
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r1 == 0) goto L1b
            r0.onScreen = r2
            r1 = 1
            r0.openState = r1
            r4.updateChildrenImportantForAccessibility(r5, r1)
            goto L53
        L1b:
            r1 = 0
            if (r6 == 0) goto L48
            int r2 = r0.openState
            r2 = r2 | 2
            r0.openState = r2
            r2 = 3
            boolean r2 = r4.checkDrawerViewAbsoluteGravity(r5, r2)
            if (r2 == 0) goto L35
            androidx.customview.widget.ViewDragHelper r2 = r4.mLeftDragger
            int r3 = r5.getTop()
            r2.smoothSlideViewTo(r5, r1, r3)
            goto L53
        L35:
            androidx.customview.widget.ViewDragHelper r1 = r4.mRightDragger
            int r2 = r4.getWidth()
            int r3 = r5.getWidth()
            int r2 = r2 - r3
            int r3 = r5.getTop()
            r1.smoothSlideViewTo(r5, r2, r3)
            goto L53
        L48:
            r4.moveDrawerToOffset(r5, r2)
            int r2 = r0.gravity
            r4.updateDrawerState(r2, r1, r5)
            r5.setVisibility(r1)
        L53:
            r4.invalidate()
            return
        L57:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "View "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r5)
            java.lang.String r2 = " is not a sliding drawer"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public void removeDrawerListener(androidx.drawerlayout.widget.DrawerLayout.DrawerListener r2) {
            r1 = this;
            if (r2 != 0) goto L3
            return
        L3:
            java.util.List<androidx.drawerlayout.widget.DrawerLayout$DrawerListener> r0 = r1.mListeners
            if (r0 != 0) goto L8
            return
        L8:
            java.util.List<androidx.drawerlayout.widget.DrawerLayout$DrawerListener> r0 = r1.mListeners
            r0.remove(r2)
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean r2) {
            r1 = this;
            super.requestDisallowInterceptTouchEvent(r2)
            r1.mDisallowInterceptRequested = r2
            if (r2 == 0) goto Lb
            r0 = 1
            r1.closeDrawers(r0)
        Lb:
            return
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
            r1 = this;
            boolean r0 = r1.mInLayout
            if (r0 != 0) goto L7
            super.requestLayout()
        L7:
            return
    }

    public void setChildInsets(java.lang.Object r2, boolean r3) {
            r1 = this;
            r1.mLastInsets = r2
            r1.mDrawStatusBarBackground = r3
            if (r3 != 0) goto Le
            android.graphics.drawable.Drawable r0 = r1.getBackground()
            if (r0 != 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            r1.setWillNotDraw(r0)
            r1.requestLayout()
            return
    }

    public void setDrawerElevation(float r4) {
            r3 = this;
            r3.mDrawerElevation = r4
            r0 = 0
        L3:
            int r1 = r3.getChildCount()
            if (r0 >= r1) goto L1b
            android.view.View r1 = r3.getChildAt(r0)
            boolean r2 = r3.isDrawerView(r1)
            if (r2 == 0) goto L18
            float r2 = r3.mDrawerElevation
            androidx.core.view.ViewCompat.setElevation(r1, r2)
        L18:
            int r0 = r0 + 1
            goto L3
        L1b:
            return
    }

    @java.lang.Deprecated
    public void setDrawerListener(androidx.drawerlayout.widget.DrawerLayout.DrawerListener r2) {
            r1 = this;
            androidx.drawerlayout.widget.DrawerLayout$DrawerListener r0 = r1.mListener
            if (r0 == 0) goto L9
            androidx.drawerlayout.widget.DrawerLayout$DrawerListener r0 = r1.mListener
            r1.removeDrawerListener(r0)
        L9:
            if (r2 == 0) goto Le
            r1.addDrawerListener(r2)
        Le:
            r1.mListener = r2
            return
    }

    public void setDrawerLockMode(int r2) {
            r1 = this;
            r0 = 3
            r1.setDrawerLockMode(r2, r0)
            r0 = 5
            r1.setDrawerLockMode(r2, r0)
            return
    }

    public void setDrawerLockMode(int r3, int r4) {
            r2 = this;
            int r0 = androidx.core.view.ViewCompat.getLayoutDirection(r2)
            int r0 = androidx.core.view.GravityCompat.getAbsoluteGravity(r4, r0)
            switch(r4) {
                case 3: goto L16;
                case 5: goto L13;
                case 8388611: goto L10;
                case 8388613: goto Ld;
                default: goto Lc;
            }
        Lc:
            goto L19
        Ld:
            r2.mLockModeEnd = r3
            goto L19
        L10:
            r2.mLockModeStart = r3
            goto L19
        L13:
            r2.mLockModeRight = r3
            goto L19
        L16:
            r2.mLockModeLeft = r3
        L19:
            if (r3 == 0) goto L26
            r1 = 3
            if (r0 != r1) goto L21
            androidx.customview.widget.ViewDragHelper r1 = r2.mLeftDragger
            goto L23
        L21:
            androidx.customview.widget.ViewDragHelper r1 = r2.mRightDragger
        L23:
            r1.cancel()
        L26:
            switch(r3) {
                case 1: goto L34;
                case 2: goto L2a;
                default: goto L29;
            }
        L29:
            goto L3d
        L2a:
            android.view.View r1 = r2.findDrawerWithGravity(r0)
            if (r1 == 0) goto L3d
            r2.openDrawer(r1)
            goto L3d
        L34:
            android.view.View r1 = r2.findDrawerWithGravity(r0)
            if (r1 == 0) goto L3d
            r2.closeDrawer(r1)
        L3d:
            return
    }

    public void setDrawerLockMode(int r4, android.view.View r5) {
            r3 = this;
            boolean r0 = r3.isDrawerView(r5)
            if (r0 == 0) goto L12
            android.view.ViewGroup$LayoutParams r0 = r5.getLayoutParams()
            androidx.drawerlayout.widget.DrawerLayout$LayoutParams r0 = (androidx.drawerlayout.widget.DrawerLayout.LayoutParams) r0
            int r0 = r0.gravity
            r3.setDrawerLockMode(r4, r0)
            return
        L12:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "View "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r5)
            java.lang.String r2 = " is not a "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = "drawer with appropriate layout_gravity"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public void setDrawerShadow(int r2, int r3) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            android.graphics.drawable.Drawable r0 = androidx.core.content.ContextCompat.getDrawable(r0, r2)
            r1.setDrawerShadow(r0, r3)
            return
    }

    public void setDrawerShadow(android.graphics.drawable.Drawable r3, int r4) {
            r2 = this;
            boolean r0 = androidx.drawerlayout.widget.DrawerLayout.SET_DRAWER_SHADOW_FROM_ELEVATION
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 8388611(0x800003, float:1.1754948E-38)
            r1 = r4 & r0
            if (r1 != r0) goto Lf
            r2.mShadowStart = r3
            goto L28
        Lf:
            r0 = 8388613(0x800005, float:1.175495E-38)
            r1 = r4 & r0
            if (r1 != r0) goto L19
            r2.mShadowEnd = r3
            goto L28
        L19:
            r0 = r4 & 3
            r1 = 3
            if (r0 != r1) goto L21
            r2.mShadowLeft = r3
            goto L28
        L21:
            r0 = r4 & 5
            r1 = 5
            if (r0 != r1) goto L2f
            r2.mShadowRight = r3
        L28:
            r2.resolveShadowDrawables()
            r2.invalidate()
            return
        L2f:
            return
    }

    public void setDrawerTitle(int r3, java.lang.CharSequence r4) {
            r2 = this;
            int r0 = androidx.core.view.ViewCompat.getLayoutDirection(r2)
            int r0 = androidx.core.view.GravityCompat.getAbsoluteGravity(r3, r0)
            r1 = 3
            if (r0 != r1) goto Lf
            r2.mTitleLeft = r4
            goto L14
        Lf:
            r1 = 5
            if (r0 != r1) goto L14
            r2.mTitleRight = r4
        L14:
            return
    }

    void setDrawerViewOffset(android.view.View r3, float r4) {
            r2 = this;
            android.view.ViewGroup$LayoutParams r0 = r3.getLayoutParams()
            androidx.drawerlayout.widget.DrawerLayout$LayoutParams r0 = (androidx.drawerlayout.widget.DrawerLayout.LayoutParams) r0
            float r1 = r0.onScreen
            int r1 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r1 != 0) goto Ld
            return
        Ld:
            r0.onScreen = r4
            r2.dispatchOnDrawerSlide(r3, r4)
            return
    }

    public void setScrimColor(int r1) {
            r0 = this;
            r0.mScrimColor = r1
            r0.invalidate()
            return
    }

    public void setStatusBarBackground(int r2) {
            r1 = this;
            if (r2 == 0) goto Lb
            android.content.Context r0 = r1.getContext()
            android.graphics.drawable.Drawable r0 = androidx.core.content.ContextCompat.getDrawable(r0, r2)
            goto Lc
        Lb:
            r0 = 0
        Lc:
            r1.mStatusBarBackground = r0
            r1.invalidate()
            return
    }

    public void setStatusBarBackground(android.graphics.drawable.Drawable r1) {
            r0 = this;
            r0.mStatusBarBackground = r1
            r0.invalidate()
            return
    }

    public void setStatusBarBackgroundColor(int r2) {
            r1 = this;
            android.graphics.drawable.ColorDrawable r0 = new android.graphics.drawable.ColorDrawable
            r0.<init>(r2)
            r1.mStatusBarBackground = r0
            r1.invalidate()
            return
    }

    void updateDrawerState(int r7, int r8, android.view.View r9) {
            r6 = this;
            androidx.customview.widget.ViewDragHelper r0 = r6.mLeftDragger
            int r0 = r0.getViewDragState()
            androidx.customview.widget.ViewDragHelper r1 = r6.mRightDragger
            int r1 = r1.getViewDragState()
            r2 = 1
            if (r0 == r2) goto L1c
            if (r1 != r2) goto L12
            goto L1c
        L12:
            r2 = 2
            if (r0 == r2) goto L1a
            if (r1 != r2) goto L18
            goto L1a
        L18:
            r2 = 0
            goto L1d
        L1a:
            r2 = 2
            goto L1d
        L1c:
            r2 = 1
        L1d:
            if (r9 == 0) goto L3d
            if (r8 != 0) goto L3d
            android.view.ViewGroup$LayoutParams r3 = r9.getLayoutParams()
            androidx.drawerlayout.widget.DrawerLayout$LayoutParams r3 = (androidx.drawerlayout.widget.DrawerLayout.LayoutParams) r3
            float r4 = r3.onScreen
            r5 = 0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 != 0) goto L32
            r6.dispatchOnDrawerClosed(r9)
            goto L3d
        L32:
            float r4 = r3.onScreen
            r5 = 1065353216(0x3f800000, float:1.0)
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 != 0) goto L3d
            r6.dispatchOnDrawerOpened(r9)
        L3d:
            int r3 = r6.mDrawerState
            if (r2 == r3) goto L5f
            r6.mDrawerState = r2
            java.util.List<androidx.drawerlayout.widget.DrawerLayout$DrawerListener> r3 = r6.mListeners
            if (r3 == 0) goto L5f
            java.util.List<androidx.drawerlayout.widget.DrawerLayout$DrawerListener> r3 = r6.mListeners
            int r3 = r3.size()
            int r4 = r3 + (-1)
        L4f:
            if (r4 < 0) goto L5f
            java.util.List<androidx.drawerlayout.widget.DrawerLayout$DrawerListener> r5 = r6.mListeners
            java.lang.Object r5 = r5.get(r4)
            androidx.drawerlayout.widget.DrawerLayout$DrawerListener r5 = (androidx.drawerlayout.widget.DrawerLayout.DrawerListener) r5
            r5.onDrawerStateChanged(r2)
            int r4 = r4 + (-1)
            goto L4f
        L5f:
            return
    }
}
