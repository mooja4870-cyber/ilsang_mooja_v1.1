package androidx.viewpager.widget;

/* JADX INFO: loaded from: classes.dex */
public class ViewPager extends android.view.ViewGroup {
    private static final int CLOSE_ENOUGH = 2;
    private static final java.util.Comparator<androidx.viewpager.widget.ViewPager.ItemInfo> COMPARATOR = null;
    private static final boolean DEBUG = false;
    private static final int DEFAULT_GUTTER_SIZE = 16;
    private static final int DEFAULT_OFFSCREEN_PAGES = 1;
    private static final int DRAW_ORDER_DEFAULT = 0;
    private static final int DRAW_ORDER_FORWARD = 1;
    private static final int DRAW_ORDER_REVERSE = 2;
    private static final int INVALID_POINTER = -1;
    static final int[] LAYOUT_ATTRS = null;
    private static final int MAX_SETTLE_DURATION = 600;
    private static final int MIN_DISTANCE_FOR_FLING = 25;
    private static final int MIN_FLING_VELOCITY = 400;
    public static final int SCROLL_STATE_DRAGGING = 1;
    public static final int SCROLL_STATE_IDLE = 0;
    public static final int SCROLL_STATE_SETTLING = 2;
    private static final java.lang.String TAG = "ViewPager";
    private static final boolean USE_CACHE = false;
    private static final android.view.animation.Interpolator sInterpolator = null;
    private static final androidx.viewpager.widget.ViewPager.ViewPositionComparator sPositionComparator = null;
    private int mActivePointerId;
    androidx.viewpager.widget.PagerAdapter mAdapter;
    private java.util.List<androidx.viewpager.widget.ViewPager.OnAdapterChangeListener> mAdapterChangeListeners;
    private int mBottomPageBounds;
    private boolean mCalledSuper;
    private int mChildHeightMeasureSpec;
    private int mChildWidthMeasureSpec;
    private int mCloseEnough;
    int mCurItem;
    private int mDecorChildCount;
    private int mDefaultGutterSize;
    private int mDrawingOrder;
    private java.util.ArrayList<android.view.View> mDrawingOrderedChildren;
    private final java.lang.Runnable mEndScrollRunnable;
    private int mExpectedAdapterCount;
    private long mFakeDragBeginTime;
    private boolean mFakeDragging;
    private boolean mFirstLayout;
    private float mFirstOffset;
    private int mFlingDistance;
    private int mGutterSize;
    private boolean mInLayout;
    private float mInitialMotionX;
    private float mInitialMotionY;
    private androidx.viewpager.widget.ViewPager.OnPageChangeListener mInternalPageChangeListener;
    private boolean mIsBeingDragged;
    private boolean mIsScrollStarted;
    private boolean mIsUnableToDrag;
    private final java.util.ArrayList<androidx.viewpager.widget.ViewPager.ItemInfo> mItems;
    private float mLastMotionX;
    private float mLastMotionY;
    private float mLastOffset;
    private android.widget.EdgeEffect mLeftEdge;
    private android.graphics.drawable.Drawable mMarginDrawable;
    private int mMaximumVelocity;
    private int mMinimumVelocity;
    private boolean mNeedCalculatePageOffsets;
    private androidx.viewpager.widget.ViewPager.PagerObserver mObserver;
    private int mOffscreenPageLimit;
    private androidx.viewpager.widget.ViewPager.OnPageChangeListener mOnPageChangeListener;
    private java.util.List<androidx.viewpager.widget.ViewPager.OnPageChangeListener> mOnPageChangeListeners;
    private int mPageMargin;
    private androidx.viewpager.widget.ViewPager.PageTransformer mPageTransformer;
    private int mPageTransformerLayerType;
    private boolean mPopulatePending;
    private android.os.Parcelable mRestoredAdapterState;
    private java.lang.ClassLoader mRestoredClassLoader;
    private int mRestoredCurItem;
    private android.widget.EdgeEffect mRightEdge;
    private int mScrollState;
    private android.widget.Scroller mScroller;
    private boolean mScrollingCacheEnabled;
    private final androidx.viewpager.widget.ViewPager.ItemInfo mTempItem;
    private final android.graphics.Rect mTempRect;
    private int mTopPageBounds;
    private int mTouchSlop;
    private android.view.VelocityTracker mVelocityTracker;





    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE})
    @java.lang.annotation.Inherited
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
    public @interface DecorView {
    }

    static class ItemInfo {
        java.lang.Object object;
        float offset;
        int position;
        boolean scrolling;
        float widthFactor;

        ItemInfo() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    public static class LayoutParams extends android.view.ViewGroup.LayoutParams {
        int childIndex;
        public int gravity;
        public boolean isDecor;
        boolean needsMeasure;
        int position;
        float widthFactor;

        public LayoutParams() {
                r1 = this;
                r0 = -1
                r1.<init>(r0, r0)
                r0 = 0
                r1.widthFactor = r0
                return
        }

        public LayoutParams(android.content.Context r4, android.util.AttributeSet r5) {
                r3 = this;
                r3.<init>(r4, r5)
                r0 = 0
                r3.widthFactor = r0
                int[] r0 = androidx.viewpager.widget.ViewPager.LAYOUT_ATTRS
                android.content.res.TypedArray r0 = r4.obtainStyledAttributes(r5, r0)
                r1 = 0
                r2 = 48
                int r1 = r0.getInteger(r1, r2)
                r3.gravity = r1
                r0.recycle()
                return
        }
    }

    class MyAccessibilityDelegate extends androidx.core.view.AccessibilityDelegateCompat {
        final /* synthetic */ androidx.viewpager.widget.ViewPager this$0;

        MyAccessibilityDelegate(androidx.viewpager.widget.ViewPager r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        private boolean canScroll() {
                r2 = this;
                androidx.viewpager.widget.ViewPager r0 = r2.this$0
                androidx.viewpager.widget.PagerAdapter r0 = r0.mAdapter
                if (r0 == 0) goto L12
                androidx.viewpager.widget.ViewPager r0 = r2.this$0
                androidx.viewpager.widget.PagerAdapter r0 = r0.mAdapter
                int r0 = r0.getCount()
                r1 = 1
                if (r0 <= r1) goto L12
                goto L13
            L12:
                r1 = 0
            L13:
                return r1
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityEvent(android.view.View r3, android.view.accessibility.AccessibilityEvent r4) {
                r2 = this;
                super.onInitializeAccessibilityEvent(r3, r4)
                java.lang.Class<androidx.viewpager.widget.ViewPager> r0 = androidx.viewpager.widget.ViewPager.class
                java.lang.String r0 = r0.getName()
                r4.setClassName(r0)
                boolean r0 = r2.canScroll()
                r4.setScrollable(r0)
                int r0 = r4.getEventType()
                r1 = 4096(0x1000, float:5.74E-42)
                if (r0 != r1) goto L3a
                androidx.viewpager.widget.ViewPager r0 = r2.this$0
                androidx.viewpager.widget.PagerAdapter r0 = r0.mAdapter
                if (r0 == 0) goto L3a
                androidx.viewpager.widget.ViewPager r0 = r2.this$0
                androidx.viewpager.widget.PagerAdapter r0 = r0.mAdapter
                int r0 = r0.getCount()
                r4.setItemCount(r0)
                androidx.viewpager.widget.ViewPager r0 = r2.this$0
                int r0 = r0.mCurItem
                r4.setFromIndex(r0)
                androidx.viewpager.widget.ViewPager r0 = r2.this$0
                int r0 = r0.mCurItem
                r4.setToIndex(r0)
            L3a:
                return
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityNodeInfo(android.view.View r3, androidx.core.view.accessibility.AccessibilityNodeInfoCompat r4) {
                r2 = this;
                super.onInitializeAccessibilityNodeInfo(r3, r4)
                java.lang.Class<androidx.viewpager.widget.ViewPager> r0 = androidx.viewpager.widget.ViewPager.class
                java.lang.String r0 = r0.getName()
                r4.setClassName(r0)
                boolean r0 = r2.canScroll()
                r4.setScrollable(r0)
                androidx.viewpager.widget.ViewPager r0 = r2.this$0
                r1 = 1
                boolean r0 = r0.canScrollHorizontally(r1)
                if (r0 == 0) goto L21
                r0 = 4096(0x1000, float:5.74E-42)
                r4.addAction(r0)
            L21:
                androidx.viewpager.widget.ViewPager r0 = r2.this$0
                r1 = -1
                boolean r0 = r0.canScrollHorizontally(r1)
                if (r0 == 0) goto L2f
                r0 = 8192(0x2000, float:1.148E-41)
                r4.addAction(r0)
            L2f:
                return
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public boolean performAccessibilityAction(android.view.View r5, int r6, android.os.Bundle r7) {
                r4 = this;
                boolean r0 = super.performAccessibilityAction(r5, r6, r7)
                r1 = 1
                if (r0 == 0) goto L8
                return r1
            L8:
                r0 = 0
                switch(r6) {
                    case 4096: goto L22;
                    case 8192: goto Ld;
                    default: goto Lc;
                }
            Lc:
                return r0
            Ld:
                androidx.viewpager.widget.ViewPager r2 = r4.this$0
                r3 = -1
                boolean r2 = r2.canScrollHorizontally(r3)
                if (r2 == 0) goto L21
                androidx.viewpager.widget.ViewPager r0 = r4.this$0
                androidx.viewpager.widget.ViewPager r2 = r4.this$0
                int r2 = r2.mCurItem
                int r2 = r2 - r1
                r0.setCurrentItem(r2)
                return r1
            L21:
                return r0
            L22:
                androidx.viewpager.widget.ViewPager r2 = r4.this$0
                boolean r2 = r2.canScrollHorizontally(r1)
                if (r2 == 0) goto L35
                androidx.viewpager.widget.ViewPager r0 = r4.this$0
                androidx.viewpager.widget.ViewPager r2 = r4.this$0
                int r2 = r2.mCurItem
                int r2 = r2 + r1
                r0.setCurrentItem(r2)
                return r1
            L35:
                return r0
        }
    }

    public interface OnAdapterChangeListener {
        void onAdapterChanged(androidx.viewpager.widget.ViewPager r1, androidx.viewpager.widget.PagerAdapter r2, androidx.viewpager.widget.PagerAdapter r3);
    }

    public interface OnPageChangeListener {
        void onPageScrollStateChanged(int r1);

        void onPageScrolled(int r1, float r2, int r3);

        void onPageSelected(int r1);
    }

    public interface PageTransformer {
        void transformPage(android.view.View r1, float r2);
    }

    private class PagerObserver extends android.database.DataSetObserver {
        final /* synthetic */ androidx.viewpager.widget.ViewPager this$0;

        PagerObserver(androidx.viewpager.widget.ViewPager r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
                r1 = this;
                androidx.viewpager.widget.ViewPager r0 = r1.this$0
                r0.dataSetChanged()
                return
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
                r1 = this;
                androidx.viewpager.widget.ViewPager r0 = r1.this$0
                r0.dataSetChanged()
                return
        }
    }

    public static class SavedState extends androidx.customview.view.AbsSavedState {
        public static final android.os.Parcelable.Creator<androidx.viewpager.widget.ViewPager.SavedState> CREATOR = null;
        android.os.Parcelable adapterState;
        java.lang.ClassLoader loader;
        int position;


        static {
                androidx.viewpager.widget.ViewPager$SavedState$1 r0 = new androidx.viewpager.widget.ViewPager$SavedState$1
                r0.<init>()
                androidx.viewpager.widget.ViewPager.SavedState.CREATOR = r0
                return
        }

        SavedState(android.os.Parcel r2, java.lang.ClassLoader r3) {
                r1 = this;
                r1.<init>(r2, r3)
                if (r3 != 0) goto Ld
                java.lang.Class r0 = r1.getClass()
                java.lang.ClassLoader r3 = r0.getClassLoader()
            Ld:
                int r0 = r2.readInt()
                r1.position = r0
                android.os.Parcelable r0 = r2.readParcelable(r3)
                r1.adapterState = r0
                r1.loader = r3
                return
        }

        public SavedState(android.os.Parcelable r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "FragmentPager.SavedState{"
                java.lang.StringBuilder r0 = r0.append(r1)
                int r1 = java.lang.System.identityHashCode(r2)
                java.lang.String r1 = java.lang.Integer.toHexString(r1)
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = " position="
                java.lang.StringBuilder r0 = r0.append(r1)
                int r1 = r2.position
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = "}"
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(android.os.Parcel r2, int r3) {
                r1 = this;
                super.writeToParcel(r2, r3)
                int r0 = r1.position
                r2.writeInt(r0)
                android.os.Parcelable r0 = r1.adapterState
                r2.writeParcelable(r0, r3)
                return
        }
    }

    public static class SimpleOnPageChangeListener implements androidx.viewpager.widget.ViewPager.OnPageChangeListener {
        public SimpleOnPageChangeListener() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int r1) {
                r0 = this;
                return
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int r1, float r2, int r3) {
                r0 = this;
                return
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int r1) {
                r0 = this;
                return
        }
    }

    static class ViewPositionComparator implements java.util.Comparator<android.view.View> {
        ViewPositionComparator() {
                r0 = this;
                r0.<init>()
                return
        }

        /* JADX INFO: renamed from: compare, reason: avoid collision after fix types in other method */
        public int compare2(android.view.View r5, android.view.View r6) {
                r4 = this;
                android.view.ViewGroup$LayoutParams r0 = r5.getLayoutParams()
                androidx.viewpager.widget.ViewPager$LayoutParams r0 = (androidx.viewpager.widget.ViewPager.LayoutParams) r0
                android.view.ViewGroup$LayoutParams r1 = r6.getLayoutParams()
                androidx.viewpager.widget.ViewPager$LayoutParams r1 = (androidx.viewpager.widget.ViewPager.LayoutParams) r1
                boolean r2 = r0.isDecor
                boolean r3 = r1.isDecor
                if (r2 == r3) goto L1a
                boolean r2 = r0.isDecor
                if (r2 == 0) goto L18
                r2 = 1
                goto L19
            L18:
                r2 = -1
            L19:
                return r2
            L1a:
                int r2 = r0.position
                int r3 = r1.position
                int r2 = r2 - r3
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
            r0 = 16842931(0x10100b3, float:2.369406E-38)
            int[] r0 = new int[]{r0}
            androidx.viewpager.widget.ViewPager.LAYOUT_ATTRS = r0
            androidx.viewpager.widget.ViewPager$1 r0 = new androidx.viewpager.widget.ViewPager$1
            r0.<init>()
            androidx.viewpager.widget.ViewPager.COMPARATOR = r0
            androidx.viewpager.widget.ViewPager$2 r0 = new androidx.viewpager.widget.ViewPager$2
            r0.<init>()
            androidx.viewpager.widget.ViewPager.sInterpolator = r0
            androidx.viewpager.widget.ViewPager$ViewPositionComparator r0 = new androidx.viewpager.widget.ViewPager$ViewPositionComparator
            r0.<init>()
            androidx.viewpager.widget.ViewPager.sPositionComparator = r0
            return
    }

    public ViewPager(android.content.Context r3) {
            r2 = this;
            r2.<init>(r3)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.mItems = r0
            androidx.viewpager.widget.ViewPager$ItemInfo r0 = new androidx.viewpager.widget.ViewPager$ItemInfo
            r0.<init>()
            r2.mTempItem = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r2.mTempRect = r0
            r0 = -1
            r2.mRestoredCurItem = r0
            r1 = 0
            r2.mRestoredAdapterState = r1
            r2.mRestoredClassLoader = r1
            r1 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r2.mFirstOffset = r1
            r1 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r2.mLastOffset = r1
            r1 = 1
            r2.mOffscreenPageLimit = r1
            r2.mActivePointerId = r0
            r2.mFirstLayout = r1
            r0 = 0
            r2.mNeedCalculatePageOffsets = r0
            androidx.viewpager.widget.ViewPager$3 r1 = new androidx.viewpager.widget.ViewPager$3
            r1.<init>(r2)
            r2.mEndScrollRunnable = r1
            r2.mScrollState = r0
            r2.initViewPager()
            return
    }

    public ViewPager(android.content.Context r3, android.util.AttributeSet r4) {
            r2 = this;
            r2.<init>(r3, r4)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.mItems = r0
            androidx.viewpager.widget.ViewPager$ItemInfo r0 = new androidx.viewpager.widget.ViewPager$ItemInfo
            r0.<init>()
            r2.mTempItem = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r2.mTempRect = r0
            r0 = -1
            r2.mRestoredCurItem = r0
            r1 = 0
            r2.mRestoredAdapterState = r1
            r2.mRestoredClassLoader = r1
            r1 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r2.mFirstOffset = r1
            r1 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r2.mLastOffset = r1
            r1 = 1
            r2.mOffscreenPageLimit = r1
            r2.mActivePointerId = r0
            r2.mFirstLayout = r1
            r0 = 0
            r2.mNeedCalculatePageOffsets = r0
            androidx.viewpager.widget.ViewPager$3 r1 = new androidx.viewpager.widget.ViewPager$3
            r1.<init>(r2)
            r2.mEndScrollRunnable = r1
            r2.mScrollState = r0
            r2.initViewPager()
            return
    }

    private void calculatePageOffsets(androidx.viewpager.widget.ViewPager.ItemInfo r12, int r13, androidx.viewpager.widget.ViewPager.ItemInfo r14) {
            r11 = this;
            androidx.viewpager.widget.PagerAdapter r0 = r11.mAdapter
            int r0 = r0.getCount()
            int r1 = r11.getClientWidth()
            if (r1 <= 0) goto L12
            int r2 = r11.mPageMargin
            float r2 = (float) r2
            float r3 = (float) r1
            float r2 = r2 / r3
            goto L13
        L12:
            r2 = 0
        L13:
            if (r14 == 0) goto Lb7
            int r3 = r14.position
            int r4 = r12.position
            if (r3 >= r4) goto L6c
            r4 = 0
            r5 = 0
            float r6 = r14.offset
            float r7 = r14.widthFactor
            float r6 = r6 + r7
            float r6 = r6 + r2
            int r7 = r3 + 1
        L25:
            int r8 = r12.position
            if (r7 > r8) goto Lb6
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$ItemInfo> r8 = r11.mItems
            int r8 = r8.size()
            if (r4 >= r8) goto Lb6
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$ItemInfo> r8 = r11.mItems
            java.lang.Object r8 = r8.get(r4)
            r5 = r8
            androidx.viewpager.widget.ViewPager$ItemInfo r5 = (androidx.viewpager.widget.ViewPager.ItemInfo) r5
        L3a:
            int r8 = r5.position
            if (r7 <= r8) goto L54
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$ItemInfo> r8 = r11.mItems
            int r8 = r8.size()
            int r8 = r8 + (-1)
            if (r4 >= r8) goto L54
            int r4 = r4 + 1
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$ItemInfo> r8 = r11.mItems
            java.lang.Object r8 = r8.get(r4)
            r5 = r8
            androidx.viewpager.widget.ViewPager$ItemInfo r5 = (androidx.viewpager.widget.ViewPager.ItemInfo) r5
            goto L3a
        L54:
            int r8 = r5.position
            if (r7 >= r8) goto L63
            androidx.viewpager.widget.PagerAdapter r8 = r11.mAdapter
            float r8 = r8.getPageWidth(r7)
            float r8 = r8 + r2
            float r6 = r6 + r8
            int r7 = r7 + 1
            goto L54
        L63:
            r5.offset = r6
            float r8 = r5.widthFactor
            float r8 = r8 + r2
            float r6 = r6 + r8
            int r7 = r7 + 1
            goto L25
        L6c:
            int r4 = r12.position
            if (r3 <= r4) goto Lb6
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$ItemInfo> r4 = r11.mItems
            int r4 = r4.size()
            int r4 = r4 + (-1)
            r5 = 0
            float r6 = r14.offset
            int r7 = r3 + (-1)
        L7d:
            int r8 = r12.position
            if (r7 < r8) goto Lb7
            if (r4 < 0) goto Lb7
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$ItemInfo> r8 = r11.mItems
            java.lang.Object r8 = r8.get(r4)
            r5 = r8
            androidx.viewpager.widget.ViewPager$ItemInfo r5 = (androidx.viewpager.widget.ViewPager.ItemInfo) r5
        L8c:
            int r8 = r5.position
            if (r7 >= r8) goto L9e
            if (r4 <= 0) goto L9e
            int r4 = r4 + (-1)
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$ItemInfo> r8 = r11.mItems
            java.lang.Object r8 = r8.get(r4)
            r5 = r8
            androidx.viewpager.widget.ViewPager$ItemInfo r5 = (androidx.viewpager.widget.ViewPager.ItemInfo) r5
            goto L8c
        L9e:
            int r8 = r5.position
            if (r7 <= r8) goto Lad
            androidx.viewpager.widget.PagerAdapter r8 = r11.mAdapter
            float r8 = r8.getPageWidth(r7)
            float r8 = r8 + r2
            float r6 = r6 - r8
            int r7 = r7 + (-1)
            goto L9e
        Lad:
            float r8 = r5.widthFactor
            float r8 = r8 + r2
            float r6 = r6 - r8
            r5.offset = r6
            int r7 = r7 + (-1)
            goto L7d
        Lb6:
        Lb7:
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$ItemInfo> r3 = r11.mItems
            int r3 = r3.size()
            float r4 = r12.offset
            int r5 = r12.position
            int r5 = r5 + (-1)
            int r6 = r12.position
            if (r6 != 0) goto Lca
            float r6 = r12.offset
            goto Lcd
        Lca:
            r6 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
        Lcd:
            r11.mFirstOffset = r6
            int r6 = r12.position
            int r7 = r0 + (-1)
            r8 = 1065353216(0x3f800000, float:1.0)
            if (r6 != r7) goto Lde
            float r6 = r12.offset
            float r7 = r12.widthFactor
            float r6 = r6 + r7
            float r6 = r6 - r8
            goto Le1
        Lde:
            r6 = 2139095039(0x7f7fffff, float:3.4028235E38)
        Le1:
            r11.mLastOffset = r6
            int r6 = r13 + (-1)
        Le5:
            if (r6 < 0) goto L110
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$ItemInfo> r7 = r11.mItems
            java.lang.Object r7 = r7.get(r6)
            androidx.viewpager.widget.ViewPager$ItemInfo r7 = (androidx.viewpager.widget.ViewPager.ItemInfo) r7
        Lef:
            int r9 = r7.position
            if (r5 <= r9) goto Lff
            androidx.viewpager.widget.PagerAdapter r9 = r11.mAdapter
            int r10 = r5 + (-1)
            float r5 = r9.getPageWidth(r5)
            float r5 = r5 + r2
            float r4 = r4 - r5
            r5 = r10
            goto Lef
        Lff:
            float r9 = r7.widthFactor
            float r9 = r9 + r2
            float r4 = r4 - r9
            r7.offset = r4
            int r9 = r7.position
            if (r9 != 0) goto L10b
            r11.mFirstOffset = r4
        L10b:
            int r6 = r6 + (-1)
            int r5 = r5 + (-1)
            goto Le5
        L110:
            float r6 = r12.offset
            float r7 = r12.widthFactor
            float r6 = r6 + r7
            float r6 = r6 + r2
            int r4 = r12.position
            int r4 = r4 + 1
            int r5 = r13 + 1
        L11c:
            if (r5 >= r3) goto L14d
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$ItemInfo> r7 = r11.mItems
            java.lang.Object r7 = r7.get(r5)
            androidx.viewpager.widget.ViewPager$ItemInfo r7 = (androidx.viewpager.widget.ViewPager.ItemInfo) r7
        L126:
            int r9 = r7.position
            if (r4 >= r9) goto L136
            androidx.viewpager.widget.PagerAdapter r9 = r11.mAdapter
            int r10 = r4 + 1
            float r4 = r9.getPageWidth(r4)
            float r4 = r4 + r2
            float r6 = r6 + r4
            r4 = r10
            goto L126
        L136:
            int r9 = r7.position
            int r10 = r0 + (-1)
            if (r9 != r10) goto L142
            float r9 = r7.widthFactor
            float r9 = r9 + r6
            float r9 = r9 - r8
            r11.mLastOffset = r9
        L142:
            r7.offset = r6
            float r9 = r7.widthFactor
            float r9 = r9 + r2
            float r6 = r6 + r9
            int r5 = r5 + 1
            int r4 = r4 + 1
            goto L11c
        L14d:
            r5 = 0
            r11.mNeedCalculatePageOffsets = r5
            return
    }

    private void completeScroll(boolean r8) {
            r7 = this;
            int r0 = r7.mScrollState
            r1 = 2
            r2 = 1
            r3 = 0
            if (r0 != r1) goto L9
            r0 = r2
            goto La
        L9:
            r0 = r3
        La:
            if (r0 == 0) goto L3d
            r7.setScrollingCacheEnabled(r3)
            android.widget.Scroller r1 = r7.mScroller
            boolean r1 = r1.isFinished()
            r1 = r1 ^ r2
            if (r1 == 0) goto L3d
            android.widget.Scroller r2 = r7.mScroller
            r2.abortAnimation()
            int r2 = r7.getScrollX()
            int r4 = r7.getScrollY()
            android.widget.Scroller r5 = r7.mScroller
            int r5 = r5.getCurrX()
            android.widget.Scroller r6 = r7.mScroller
            int r6 = r6.getCurrY()
            if (r2 != r5) goto L35
            if (r4 == r6) goto L3d
        L35:
            r7.scrollTo(r5, r6)
            if (r5 == r2) goto L3d
            r7.pageScrolled(r5)
        L3d:
            r7.mPopulatePending = r3
            r1 = 0
        L40:
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$ItemInfo> r2 = r7.mItems
            int r2 = r2.size()
            if (r1 >= r2) goto L5a
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$ItemInfo> r2 = r7.mItems
            java.lang.Object r2 = r2.get(r1)
            androidx.viewpager.widget.ViewPager$ItemInfo r2 = (androidx.viewpager.widget.ViewPager.ItemInfo) r2
            boolean r4 = r2.scrolling
            if (r4 == 0) goto L57
            r0 = 1
            r2.scrolling = r3
        L57:
            int r1 = r1 + 1
            goto L40
        L5a:
            if (r0 == 0) goto L69
            if (r8 == 0) goto L64
            java.lang.Runnable r1 = r7.mEndScrollRunnable
            androidx.core.view.ViewCompat.postOnAnimation(r7, r1)
            goto L69
        L64:
            java.lang.Runnable r1 = r7.mEndScrollRunnable
            r1.run()
        L69:
            return
    }

    private int determineTargetPage(int r6, float r7, int r8, int r9) {
            r5 = this;
            int r0 = java.lang.Math.abs(r9)
            int r1 = r5.mFlingDistance
            if (r0 <= r1) goto L17
            int r0 = java.lang.Math.abs(r8)
            int r1 = r5.mMinimumVelocity
            if (r0 <= r1) goto L17
            if (r8 <= 0) goto L14
            r0 = r6
            goto L16
        L14:
            int r0 = r6 + 1
        L16:
            goto L27
        L17:
            int r0 = r5.mCurItem
            if (r6 < r0) goto L1f
            r0 = 1053609165(0x3ecccccd, float:0.4)
            goto L22
        L1f:
            r0 = 1058642330(0x3f19999a, float:0.6)
        L22:
            float r1 = r7 + r0
            int r1 = (int) r1
            int r1 = r1 + r6
            r0 = r1
        L27:
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$ItemInfo> r1 = r5.mItems
            int r1 = r1.size()
            if (r1 <= 0) goto L54
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$ItemInfo> r1 = r5.mItems
            r2 = 0
            java.lang.Object r1 = r1.get(r2)
            androidx.viewpager.widget.ViewPager$ItemInfo r1 = (androidx.viewpager.widget.ViewPager.ItemInfo) r1
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$ItemInfo> r2 = r5.mItems
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$ItemInfo> r3 = r5.mItems
            int r3 = r3.size()
            int r3 = r3 + (-1)
            java.lang.Object r2 = r2.get(r3)
            androidx.viewpager.widget.ViewPager$ItemInfo r2 = (androidx.viewpager.widget.ViewPager.ItemInfo) r2
            int r3 = r1.position
            int r4 = r2.position
            int r4 = java.lang.Math.min(r0, r4)
            int r0 = java.lang.Math.max(r3, r4)
        L54:
            return r0
    }

    private void dispatchOnPageScrolled(int r4, float r5, int r6) {
            r3 = this;
            androidx.viewpager.widget.ViewPager$OnPageChangeListener r0 = r3.mOnPageChangeListener
            if (r0 == 0) goto L9
            androidx.viewpager.widget.ViewPager$OnPageChangeListener r0 = r3.mOnPageChangeListener
            r0.onPageScrolled(r4, r5, r6)
        L9:
            java.util.List<androidx.viewpager.widget.ViewPager$OnPageChangeListener> r0 = r3.mOnPageChangeListeners
            if (r0 == 0) goto L26
            r0 = 0
            java.util.List<androidx.viewpager.widget.ViewPager$OnPageChangeListener> r1 = r3.mOnPageChangeListeners
            int r1 = r1.size()
        L14:
            if (r0 >= r1) goto L26
            java.util.List<androidx.viewpager.widget.ViewPager$OnPageChangeListener> r2 = r3.mOnPageChangeListeners
            java.lang.Object r2 = r2.get(r0)
            androidx.viewpager.widget.ViewPager$OnPageChangeListener r2 = (androidx.viewpager.widget.ViewPager.OnPageChangeListener) r2
            if (r2 == 0) goto L23
            r2.onPageScrolled(r4, r5, r6)
        L23:
            int r0 = r0 + 1
            goto L14
        L26:
            androidx.viewpager.widget.ViewPager$OnPageChangeListener r0 = r3.mInternalPageChangeListener
            if (r0 == 0) goto L2f
            androidx.viewpager.widget.ViewPager$OnPageChangeListener r0 = r3.mInternalPageChangeListener
            r0.onPageScrolled(r4, r5, r6)
        L2f:
            return
    }

    private void dispatchOnPageSelected(int r4) {
            r3 = this;
            androidx.viewpager.widget.ViewPager$OnPageChangeListener r0 = r3.mOnPageChangeListener
            if (r0 == 0) goto L9
            androidx.viewpager.widget.ViewPager$OnPageChangeListener r0 = r3.mOnPageChangeListener
            r0.onPageSelected(r4)
        L9:
            java.util.List<androidx.viewpager.widget.ViewPager$OnPageChangeListener> r0 = r3.mOnPageChangeListeners
            if (r0 == 0) goto L26
            r0 = 0
            java.util.List<androidx.viewpager.widget.ViewPager$OnPageChangeListener> r1 = r3.mOnPageChangeListeners
            int r1 = r1.size()
        L14:
            if (r0 >= r1) goto L26
            java.util.List<androidx.viewpager.widget.ViewPager$OnPageChangeListener> r2 = r3.mOnPageChangeListeners
            java.lang.Object r2 = r2.get(r0)
            androidx.viewpager.widget.ViewPager$OnPageChangeListener r2 = (androidx.viewpager.widget.ViewPager.OnPageChangeListener) r2
            if (r2 == 0) goto L23
            r2.onPageSelected(r4)
        L23:
            int r0 = r0 + 1
            goto L14
        L26:
            androidx.viewpager.widget.ViewPager$OnPageChangeListener r0 = r3.mInternalPageChangeListener
            if (r0 == 0) goto L2f
            androidx.viewpager.widget.ViewPager$OnPageChangeListener r0 = r3.mInternalPageChangeListener
            r0.onPageSelected(r4)
        L2f:
            return
    }

    private void dispatchOnScrollStateChanged(int r4) {
            r3 = this;
            androidx.viewpager.widget.ViewPager$OnPageChangeListener r0 = r3.mOnPageChangeListener
            if (r0 == 0) goto L9
            androidx.viewpager.widget.ViewPager$OnPageChangeListener r0 = r3.mOnPageChangeListener
            r0.onPageScrollStateChanged(r4)
        L9:
            java.util.List<androidx.viewpager.widget.ViewPager$OnPageChangeListener> r0 = r3.mOnPageChangeListeners
            if (r0 == 0) goto L26
            r0 = 0
            java.util.List<androidx.viewpager.widget.ViewPager$OnPageChangeListener> r1 = r3.mOnPageChangeListeners
            int r1 = r1.size()
        L14:
            if (r0 >= r1) goto L26
            java.util.List<androidx.viewpager.widget.ViewPager$OnPageChangeListener> r2 = r3.mOnPageChangeListeners
            java.lang.Object r2 = r2.get(r0)
            androidx.viewpager.widget.ViewPager$OnPageChangeListener r2 = (androidx.viewpager.widget.ViewPager.OnPageChangeListener) r2
            if (r2 == 0) goto L23
            r2.onPageScrollStateChanged(r4)
        L23:
            int r0 = r0 + 1
            goto L14
        L26:
            androidx.viewpager.widget.ViewPager$OnPageChangeListener r0 = r3.mInternalPageChangeListener
            if (r0 == 0) goto L2f
            androidx.viewpager.widget.ViewPager$OnPageChangeListener r0 = r3.mInternalPageChangeListener
            r0.onPageScrollStateChanged(r4)
        L2f:
            return
    }

    private void enableLayers(boolean r6) {
            r5 = this;
            int r0 = r5.getChildCount()
            r1 = 0
        L5:
            if (r1 >= r0) goto L18
            if (r6 == 0) goto Lc
            int r2 = r5.mPageTransformerLayerType
            goto Ld
        Lc:
            r2 = 0
        Ld:
            android.view.View r3 = r5.getChildAt(r1)
            r4 = 0
            r3.setLayerType(r2, r4)
            int r1 = r1 + 1
            goto L5
        L18:
            return
    }

    private void endDrag() {
            r1 = this;
            r0 = 0
            r1.mIsBeingDragged = r0
            r1.mIsUnableToDrag = r0
            android.view.VelocityTracker r0 = r1.mVelocityTracker
            if (r0 == 0) goto L11
            android.view.VelocityTracker r0 = r1.mVelocityTracker
            r0.recycle()
            r0 = 0
            r1.mVelocityTracker = r0
        L11:
            return
    }

    private android.graphics.Rect getChildRectInPagerCoordinates(android.graphics.Rect r5, android.view.View r6) {
            r4 = this;
            if (r5 != 0) goto L8
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r5 = r0
        L8:
            if (r6 != 0) goto Lf
            r0 = 0
            r5.set(r0, r0, r0, r0)
            return r5
        Lf:
            int r0 = r6.getLeft()
            r5.left = r0
            int r0 = r6.getRight()
            r5.right = r0
            int r0 = r6.getTop()
            r5.top = r0
            int r0 = r6.getBottom()
            r5.bottom = r0
            android.view.ViewParent r0 = r6.getParent()
        L2b:
            boolean r1 = r0 instanceof android.view.ViewGroup
            if (r1 == 0) goto L5d
            if (r0 == r4) goto L5d
            r1 = r0
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            int r2 = r5.left
            int r3 = r1.getLeft()
            int r2 = r2 + r3
            r5.left = r2
            int r2 = r5.right
            int r3 = r1.getRight()
            int r2 = r2 + r3
            r5.right = r2
            int r2 = r5.top
            int r3 = r1.getTop()
            int r2 = r2 + r3
            r5.top = r2
            int r2 = r5.bottom
            int r3 = r1.getBottom()
            int r2 = r2 + r3
            r5.bottom = r2
            android.view.ViewParent r0 = r1.getParent()
            goto L2b
        L5d:
            return r5
    }

    private int getClientWidth() {
            r2 = this;
            int r0 = r2.getMeasuredWidth()
            int r1 = r2.getPaddingLeft()
            int r0 = r0 - r1
            int r1 = r2.getPaddingRight()
            int r0 = r0 - r1
            return r0
    }

    private androidx.viewpager.widget.ViewPager.ItemInfo infoForCurrentScrollPosition() {
            r14 = this;
            int r0 = r14.getClientWidth()
            r1 = 0
            if (r0 <= 0) goto Lf
            int r2 = r14.getScrollX()
            float r2 = (float) r2
            float r3 = (float) r0
            float r2 = r2 / r3
            goto L10
        Lf:
            r2 = r1
        L10:
            if (r0 <= 0) goto L17
            int r1 = r14.mPageMargin
            float r1 = (float) r1
            float r3 = (float) r0
            float r1 = r1 / r3
        L17:
            r3 = -1
            r4 = 0
            r5 = 0
            r6 = 1
            r7 = 0
            r8 = 0
        L1d:
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$ItemInfo> r9 = r14.mItems
            int r9 = r9.size()
            if (r8 >= r9) goto L75
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$ItemInfo> r9 = r14.mItems
            java.lang.Object r9 = r9.get(r8)
            androidx.viewpager.widget.ViewPager$ItemInfo r9 = (androidx.viewpager.widget.ViewPager.ItemInfo) r9
            if (r6 != 0) goto L4c
            int r10 = r9.position
            int r11 = r3 + 1
            if (r10 == r11) goto L4c
            androidx.viewpager.widget.ViewPager$ItemInfo r9 = r14.mTempItem
            float r10 = r4 + r5
            float r10 = r10 + r1
            r9.offset = r10
            int r10 = r3 + 1
            r9.position = r10
            androidx.viewpager.widget.PagerAdapter r10 = r14.mAdapter
            int r11 = r9.position
            float r10 = r10.getPageWidth(r11)
            r9.widthFactor = r10
            int r8 = r8 + (-1)
        L4c:
            float r10 = r9.offset
            r11 = r10
            float r12 = r9.widthFactor
            float r12 = r12 + r10
            float r12 = r12 + r1
            if (r6 != 0) goto L5b
            int r13 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r13 < 0) goto L5a
            goto L5b
        L5a:
            return r7
        L5b:
            int r13 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r13 < 0) goto L74
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$ItemInfo> r13 = r14.mItems
            int r13 = r13.size()
            int r13 = r13 + (-1)
            if (r8 != r13) goto L6a
            goto L74
        L6a:
            r6 = 0
            int r3 = r9.position
            r4 = r10
            float r5 = r9.widthFactor
            r7 = r9
            int r8 = r8 + 1
            goto L1d
        L74:
            return r9
        L75:
            return r7
    }

    private static boolean isDecorView(android.view.View r2) {
            java.lang.Class r0 = r2.getClass()
            java.lang.Class<androidx.viewpager.widget.ViewPager$DecorView> r1 = androidx.viewpager.widget.ViewPager.DecorView.class
            java.lang.annotation.Annotation r1 = r0.getAnnotation(r1)
            if (r1 == 0) goto Le
            r1 = 1
            goto Lf
        Le:
            r1 = 0
        Lf:
            return r1
    }

    private boolean isGutterDrag(float r4, float r5) {
            r3 = this;
            int r0 = r3.mGutterSize
            float r0 = (float) r0
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            r1 = 0
            if (r0 >= 0) goto Lc
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 > 0) goto L1c
        Lc:
            int r0 = r3.getWidth()
            int r2 = r3.mGutterSize
            int r0 = r0 - r2
            float r0 = (float) r0
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 <= 0) goto L1e
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 >= 0) goto L1e
        L1c:
            r0 = 1
            goto L1f
        L1e:
            r0 = 0
        L1f:
            return r0
    }

    private void onSecondaryPointerUp(android.view.MotionEvent r5) {
            r4 = this;
            int r0 = r5.getActionIndex()
            int r1 = r5.getPointerId(r0)
            int r2 = r4.mActivePointerId
            if (r1 != r2) goto L26
            if (r0 != 0) goto L10
            r2 = 1
            goto L11
        L10:
            r2 = 0
        L11:
            float r3 = r5.getX(r2)
            r4.mLastMotionX = r3
            int r3 = r5.getPointerId(r2)
            r4.mActivePointerId = r3
            android.view.VelocityTracker r3 = r4.mVelocityTracker
            if (r3 == 0) goto L26
            android.view.VelocityTracker r3 = r4.mVelocityTracker
            r3.clear()
        L26:
            return
    }

    private boolean pageScrolled(int r10) {
            r9 = this;
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$ItemInfo> r0 = r9.mItems
            int r0 = r0.size()
            java.lang.String r1 = "onPageScrolled did not call superclass implementation"
            r2 = 0
            if (r0 != 0) goto L21
            boolean r0 = r9.mFirstLayout
            if (r0 == 0) goto L10
            return r2
        L10:
            r9.mCalledSuper = r2
            r0 = 0
            r9.onPageScrolled(r2, r0, r2)
            boolean r0 = r9.mCalledSuper
            if (r0 == 0) goto L1b
            return r2
        L1b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L21:
            androidx.viewpager.widget.ViewPager$ItemInfo r0 = r9.infoForCurrentScrollPosition()
            int r3 = r9.getClientWidth()
            int r4 = r9.mPageMargin
            int r4 = r4 + r3
            int r5 = r9.mPageMargin
            float r5 = (float) r5
            float r6 = (float) r3
            float r5 = r5 / r6
            int r6 = r0.position
            float r7 = (float) r10
            float r8 = (float) r3
            float r7 = r7 / r8
            float r8 = r0.offset
            float r7 = r7 - r8
            float r8 = r0.widthFactor
            float r8 = r8 + r5
            float r7 = r7 / r8
            float r8 = (float) r4
            float r8 = r8 * r7
            int r8 = (int) r8
            r9.mCalledSuper = r2
            r9.onPageScrolled(r6, r7, r8)
            boolean r2 = r9.mCalledSuper
            if (r2 == 0) goto L4b
            r1 = 1
            return r1
        L4b:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            r2.<init>(r1)
            throw r2
    }

    private boolean performDrag(float r17) {
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = 0
            float r3 = r0.mLastMotionX
            float r3 = r3 - r1
            r0.mLastMotionX = r1
            int r4 = r0.getScrollX()
            float r4 = (float) r4
            float r5 = r4 + r3
            int r6 = r0.getClientWidth()
            float r7 = (float) r6
            float r8 = r0.mFirstOffset
            float r7 = r7 * r8
            float r8 = (float) r6
            float r9 = r0.mLastOffset
            float r8 = r8 * r9
            r9 = 1
            r10 = 1
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$ItemInfo> r11 = r0.mItems
            r12 = 0
            java.lang.Object r11 = r11.get(r12)
            androidx.viewpager.widget.ViewPager$ItemInfo r11 = (androidx.viewpager.widget.ViewPager.ItemInfo) r11
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$ItemInfo> r12 = r0.mItems
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$ItemInfo> r13 = r0.mItems
            int r13 = r13.size()
            int r13 = r13 + (-1)
            java.lang.Object r12 = r12.get(r13)
            androidx.viewpager.widget.ViewPager$ItemInfo r12 = (androidx.viewpager.widget.ViewPager.ItemInfo) r12
            int r13 = r11.position
            if (r13 == 0) goto L42
            r9 = 0
            float r13 = r11.offset
            float r14 = (float) r6
            float r7 = r13 * r14
        L42:
            int r13 = r12.position
            androidx.viewpager.widget.PagerAdapter r14 = r0.mAdapter
            int r14 = r14.getCount()
            int r14 = r14 + (-1)
            if (r13 == r14) goto L54
            r10 = 0
            float r13 = r12.offset
            float r14 = (float) r6
            float r8 = r13 * r14
        L54:
            int r13 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r13 >= 0) goto L6a
            if (r9 == 0) goto L68
            float r13 = r7 - r5
            android.widget.EdgeEffect r14 = r0.mLeftEdge
            float r15 = java.lang.Math.abs(r13)
            float r1 = (float) r6
            float r15 = r15 / r1
            r14.onPull(r15)
            r2 = 1
        L68:
            r5 = r7
            goto L7f
        L6a:
            int r1 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r1 <= 0) goto L7f
            if (r10 == 0) goto L7e
            float r1 = r5 - r8
            android.widget.EdgeEffect r13 = r0.mRightEdge
            float r14 = java.lang.Math.abs(r1)
            float r15 = (float) r6
            float r14 = r14 / r15
            r13.onPull(r14)
            r2 = 1
        L7e:
            r5 = r8
        L7f:
            float r1 = r0.mLastMotionX
            int r13 = (int) r5
            float r13 = (float) r13
            float r13 = r5 - r13
            float r1 = r1 + r13
            r0.mLastMotionX = r1
            int r1 = (int) r5
            int r13 = r0.getScrollY()
            r0.scrollTo(r1, r13)
            int r1 = (int) r5
            r0.pageScrolled(r1)
            return r2
    }

    private void recomputeScrollPosition(int r7, int r8, int r9, int r10) {
            r6 = this;
            if (r8 <= 0) goto L4b
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$ItemInfo> r0 = r6.mItems
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L4b
            android.widget.Scroller r0 = r6.mScroller
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L21
            android.widget.Scroller r0 = r6.mScroller
            int r1 = r6.getCurrentItem()
            int r2 = r6.getClientWidth()
            int r1 = r1 * r2
            r0.setFinalX(r1)
            goto L7d
        L21:
            int r0 = r6.getPaddingLeft()
            int r0 = r7 - r0
            int r1 = r6.getPaddingRight()
            int r0 = r0 - r1
            int r0 = r0 + r9
            int r1 = r6.getPaddingLeft()
            int r1 = r8 - r1
            int r2 = r6.getPaddingRight()
            int r1 = r1 - r2
            int r1 = r1 + r10
            int r2 = r6.getScrollX()
            float r3 = (float) r2
            float r4 = (float) r1
            float r3 = r3 / r4
            float r4 = (float) r0
            float r4 = r4 * r3
            int r4 = (int) r4
            int r5 = r6.getScrollY()
            r6.scrollTo(r4, r5)
            goto L7d
        L4b:
            int r0 = r6.mCurItem
            androidx.viewpager.widget.ViewPager$ItemInfo r0 = r6.infoForPosition(r0)
            if (r0 == 0) goto L5c
            float r1 = r0.offset
            float r2 = r6.mLastOffset
            float r1 = java.lang.Math.min(r1, r2)
            goto L5d
        L5c:
            r1 = 0
        L5d:
            int r2 = r6.getPaddingLeft()
            int r2 = r7 - r2
            int r3 = r6.getPaddingRight()
            int r2 = r2 - r3
            float r2 = (float) r2
            float r2 = r2 * r1
            int r2 = (int) r2
            int r3 = r6.getScrollX()
            if (r2 == r3) goto L7d
            r3 = 0
            r6.completeScroll(r3)
            int r3 = r6.getScrollY()
            r6.scrollTo(r2, r3)
        L7d:
            return
    }

    private void removeNonDecorViews() {
            r4 = this;
            r0 = 0
        L1:
            int r1 = r4.getChildCount()
            if (r0 >= r1) goto L1d
            android.view.View r1 = r4.getChildAt(r0)
            android.view.ViewGroup$LayoutParams r2 = r1.getLayoutParams()
            androidx.viewpager.widget.ViewPager$LayoutParams r2 = (androidx.viewpager.widget.ViewPager.LayoutParams) r2
            boolean r3 = r2.isDecor
            if (r3 != 0) goto L1a
            r4.removeViewAt(r0)
            int r0 = r0 + (-1)
        L1a:
            int r0 = r0 + 1
            goto L1
        L1d:
            return
    }

    private void requestParentDisallowInterceptTouchEvent(boolean r2) {
            r1 = this;
            android.view.ViewParent r0 = r1.getParent()
            if (r0 == 0) goto L9
            r0.requestDisallowInterceptTouchEvent(r2)
        L9:
            return
    }

    private boolean resetTouch() {
            r1 = this;
            r0 = -1
            r1.mActivePointerId = r0
            r1.endDrag()
            android.widget.EdgeEffect r0 = r1.mLeftEdge
            r0.onRelease()
            android.widget.EdgeEffect r0 = r1.mRightEdge
            r0.onRelease()
            android.widget.EdgeEffect r0 = r1.mLeftEdge
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L23
            android.widget.EdgeEffect r0 = r1.mRightEdge
            boolean r0 = r0.isFinished()
            if (r0 == 0) goto L21
            goto L23
        L21:
            r0 = 0
            goto L24
        L23:
            r0 = 1
        L24:
            return r0
    }

    private void scrollToItem(int r8, boolean r9, int r10, boolean r11) {
            r7 = this;
            androidx.viewpager.widget.ViewPager$ItemInfo r0 = r7.infoForPosition(r8)
            r1 = 0
            if (r0 == 0) goto L1c
            int r2 = r7.getClientWidth()
            float r3 = (float) r2
            float r4 = r7.mFirstOffset
            float r5 = r0.offset
            float r6 = r7.mLastOffset
            float r5 = java.lang.Math.min(r5, r6)
            float r4 = java.lang.Math.max(r4, r5)
            float r3 = r3 * r4
            int r1 = (int) r3
        L1c:
            r2 = 0
            if (r9 == 0) goto L28
            r7.smoothScrollTo(r1, r2, r10)
            if (r11 == 0) goto L36
            r7.dispatchOnPageSelected(r8)
            goto L36
        L28:
            if (r11 == 0) goto L2d
            r7.dispatchOnPageSelected(r8)
        L2d:
            r7.completeScroll(r2)
            r7.scrollTo(r1, r2)
            r7.pageScrolled(r1)
        L36:
            return
    }

    private void setScrollingCacheEnabled(boolean r2) {
            r1 = this;
            boolean r0 = r1.mScrollingCacheEnabled
            if (r0 == r2) goto L6
            r1.mScrollingCacheEnabled = r2
        L6:
            return
    }

    private void sortChildDrawingOrder() {
            r4 = this;
            int r0 = r4.mDrawingOrder
            if (r0 == 0) goto L2f
            java.util.ArrayList<android.view.View> r0 = r4.mDrawingOrderedChildren
            if (r0 != 0) goto L10
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r4.mDrawingOrderedChildren = r0
            goto L15
        L10:
            java.util.ArrayList<android.view.View> r0 = r4.mDrawingOrderedChildren
            r0.clear()
        L15:
            int r0 = r4.getChildCount()
            r1 = 0
        L1a:
            if (r1 >= r0) goto L28
            android.view.View r2 = r4.getChildAt(r1)
            java.util.ArrayList<android.view.View> r3 = r4.mDrawingOrderedChildren
            r3.add(r2)
            int r1 = r1 + 1
            goto L1a
        L28:
            java.util.ArrayList<android.view.View> r1 = r4.mDrawingOrderedChildren
            androidx.viewpager.widget.ViewPager$ViewPositionComparator r2 = androidx.viewpager.widget.ViewPager.sPositionComparator
            java.util.Collections.sort(r1, r2)
        L2f:
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(java.util.ArrayList<android.view.View> r8, int r9, int r10) {
            r7 = this;
            int r0 = r8.size()
            int r1 = r7.getDescendantFocusability()
            r2 = 393216(0x60000, float:5.51013E-40)
            if (r1 == r2) goto L2f
            r2 = 0
        Ld:
            int r3 = r7.getChildCount()
            if (r2 >= r3) goto L2f
            android.view.View r3 = r7.getChildAt(r2)
            int r4 = r3.getVisibility()
            if (r4 != 0) goto L2c
            androidx.viewpager.widget.ViewPager$ItemInfo r4 = r7.infoForChild(r3)
            if (r4 == 0) goto L2c
            int r5 = r4.position
            int r6 = r7.mCurItem
            if (r5 != r6) goto L2c
            r3.addFocusables(r8, r9, r10)
        L2c:
            int r2 = r2 + 1
            goto Ld
        L2f:
            r2 = 262144(0x40000, float:3.67342E-40)
            if (r1 != r2) goto L39
            int r2 = r8.size()
            if (r0 != r2) goto L57
        L39:
            boolean r2 = r7.isFocusable()
            if (r2 != 0) goto L40
            return
        L40:
            r2 = r10 & 1
            r3 = 1
            if (r2 != r3) goto L52
            boolean r2 = r7.isInTouchMode()
            if (r2 == 0) goto L52
            boolean r2 = r7.isFocusableInTouchMode()
            if (r2 != 0) goto L52
            return
        L52:
            if (r8 == 0) goto L57
            r8.add(r7)
        L57:
            return
    }

    androidx.viewpager.widget.ViewPager.ItemInfo addNewItem(int r3, int r4) {
            r2 = this;
            androidx.viewpager.widget.ViewPager$ItemInfo r0 = new androidx.viewpager.widget.ViewPager$ItemInfo
            r0.<init>()
            r0.position = r3
            androidx.viewpager.widget.PagerAdapter r1 = r2.mAdapter
            java.lang.Object r1 = r1.instantiateItem(r2, r3)
            r0.object = r1
            androidx.viewpager.widget.PagerAdapter r1 = r2.mAdapter
            float r1 = r1.getPageWidth(r3)
            r0.widthFactor = r1
            if (r4 < 0) goto L28
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$ItemInfo> r1 = r2.mItems
            int r1 = r1.size()
            if (r4 < r1) goto L22
            goto L28
        L22:
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$ItemInfo> r1 = r2.mItems
            r1.add(r4, r0)
            goto L2d
        L28:
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$ItemInfo> r1 = r2.mItems
            r1.add(r0)
        L2d:
            return r0
    }

    public void addOnAdapterChangeListener(androidx.viewpager.widget.ViewPager.OnAdapterChangeListener r2) {
            r1 = this;
            java.util.List<androidx.viewpager.widget.ViewPager$OnAdapterChangeListener> r0 = r1.mAdapterChangeListeners
            if (r0 != 0) goto Lb
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.mAdapterChangeListeners = r0
        Lb:
            java.util.List<androidx.viewpager.widget.ViewPager$OnAdapterChangeListener> r0 = r1.mAdapterChangeListeners
            r0.add(r2)
            return
    }

    public void addOnPageChangeListener(androidx.viewpager.widget.ViewPager.OnPageChangeListener r2) {
            r1 = this;
            java.util.List<androidx.viewpager.widget.ViewPager$OnPageChangeListener> r0 = r1.mOnPageChangeListeners
            if (r0 != 0) goto Lb
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.mOnPageChangeListeners = r0
        Lb:
            java.util.List<androidx.viewpager.widget.ViewPager$OnPageChangeListener> r0 = r1.mOnPageChangeListeners
            r0.add(r2)
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addTouchables(java.util.ArrayList<android.view.View> r6) {
            r5 = this;
            r0 = 0
        L1:
            int r1 = r5.getChildCount()
            if (r0 >= r1) goto L23
            android.view.View r1 = r5.getChildAt(r0)
            int r2 = r1.getVisibility()
            if (r2 != 0) goto L20
            androidx.viewpager.widget.ViewPager$ItemInfo r2 = r5.infoForChild(r1)
            if (r2 == 0) goto L20
            int r3 = r2.position
            int r4 = r5.mCurItem
            if (r3 != r4) goto L20
            r1.addTouchables(r6)
        L20:
            int r0 = r0 + 1
            goto L1
        L23:
            return
    }

    @Override // android.view.ViewGroup
    public void addView(android.view.View r4, int r5, android.view.ViewGroup.LayoutParams r6) {
            r3 = this;
            boolean r0 = r3.checkLayoutParams(r6)
            if (r0 != 0) goto La
            android.view.ViewGroup$LayoutParams r6 = r3.generateLayoutParams(r6)
        La:
            r0 = r6
            androidx.viewpager.widget.ViewPager$LayoutParams r0 = (androidx.viewpager.widget.ViewPager.LayoutParams) r0
            boolean r1 = r0.isDecor
            boolean r2 = isDecorView(r4)
            r1 = r1 | r2
            r0.isDecor = r1
            boolean r1 = r3.mInLayout
            if (r1 == 0) goto L30
            if (r0 == 0) goto L29
            boolean r1 = r0.isDecor
            if (r1 != 0) goto L21
            goto L29
        L21:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Cannot add pager decor view during layout"
            r1.<init>(r2)
            throw r1
        L29:
            r1 = 1
            r0.needsMeasure = r1
            r3.addViewInLayout(r4, r5, r6)
            goto L33
        L30:
            super.addView(r4, r5, r6)
        L33:
            return
    }

    public boolean arrowScroll(int r7) {
            r6 = this;
            android.view.View r0 = r6.findFocus()
            if (r0 != r6) goto L8
            r0 = 0
            goto L69
        L8:
            if (r0 == 0) goto L69
            r1 = 0
            android.view.ViewParent r2 = r0.getParent()
        Lf:
            boolean r3 = r2 instanceof android.view.ViewGroup
            if (r3 == 0) goto L1c
            if (r2 != r6) goto L17
            r1 = 1
            goto L1c
        L17:
            android.view.ViewParent r2 = r2.getParent()
            goto Lf
        L1c:
            if (r1 != 0) goto L69
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.Class r3 = r0.getClass()
            java.lang.String r3 = r3.getSimpleName()
            r2.append(r3)
            android.view.ViewParent r3 = r0.getParent()
        L32:
            boolean r4 = r3 instanceof android.view.ViewGroup
            if (r4 == 0) goto L4c
            java.lang.String r4 = " => "
            java.lang.StringBuilder r4 = r2.append(r4)
            java.lang.Class r5 = r3.getClass()
            java.lang.String r5 = r5.getSimpleName()
            r4.append(r5)
            android.view.ViewParent r3 = r3.getParent()
            goto L32
        L4c:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "arrowScroll tried to find focus based on non-child current focused view "
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r4 = r2.toString()
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "ViewPager"
            android.util.Log.e(r4, r3)
            r0 = 0
        L69:
            r1 = 0
            android.view.FocusFinder r2 = android.view.FocusFinder.getInstance()
            android.view.View r2 = r2.findNextFocus(r6, r0, r7)
            r3 = 66
            r4 = 17
            if (r2 == 0) goto Lba
            if (r2 == r0) goto Lba
            if (r7 != r4) goto L9a
            android.graphics.Rect r3 = r6.mTempRect
            android.graphics.Rect r3 = r6.getChildRectInPagerCoordinates(r3, r2)
            int r3 = r3.left
            android.graphics.Rect r4 = r6.mTempRect
            android.graphics.Rect r4 = r6.getChildRectInPagerCoordinates(r4, r0)
            int r4 = r4.left
            if (r0 == 0) goto L95
            if (r3 < r4) goto L95
            boolean r1 = r6.pageLeft()
            goto L99
        L95:
            boolean r1 = r2.requestFocus()
        L99:
            goto Lce
        L9a:
            if (r7 != r3) goto L99
            android.graphics.Rect r3 = r6.mTempRect
            android.graphics.Rect r3 = r6.getChildRectInPagerCoordinates(r3, r2)
            int r3 = r3.left
            android.graphics.Rect r4 = r6.mTempRect
            android.graphics.Rect r4 = r6.getChildRectInPagerCoordinates(r4, r0)
            int r4 = r4.left
            if (r0 == 0) goto Lb5
            if (r3 > r4) goto Lb5
            boolean r1 = r6.pageRight()
            goto Lb9
        Lb5:
            boolean r1 = r2.requestFocus()
        Lb9:
            goto Lce
        Lba:
            if (r7 == r4) goto Lca
            r4 = 1
            if (r7 != r4) goto Lc0
            goto Lca
        Lc0:
            if (r7 == r3) goto Lc5
            r3 = 2
            if (r7 != r3) goto Lce
        Lc5:
            boolean r1 = r6.pageRight()
            goto Lce
        Lca:
            boolean r1 = r6.pageLeft()
        Lce:
            if (r1 == 0) goto Ld7
            int r3 = android.view.SoundEffectConstants.getContantForFocusDirection(r7)
            r6.playSoundEffect(r3)
        Ld7:
            return r1
    }

    public boolean beginFakeDrag() {
            r10 = this;
            boolean r0 = r10.mIsBeingDragged
            if (r0 == 0) goto L6
            r0 = 0
            return r0
        L6:
            r0 = 1
            r10.mFakeDragging = r0
            r10.setScrollState(r0)
            r1 = 0
            r10.mLastMotionX = r1
            r10.mInitialMotionX = r1
            android.view.VelocityTracker r1 = r10.mVelocityTracker
            if (r1 != 0) goto L1c
            android.view.VelocityTracker r1 = android.view.VelocityTracker.obtain()
            r10.mVelocityTracker = r1
            goto L21
        L1c:
            android.view.VelocityTracker r1 = r10.mVelocityTracker
            r1.clear()
        L21:
            long r2 = android.os.SystemClock.uptimeMillis()
            r8 = 0
            r9 = 0
            r6 = 0
            r7 = 0
            r4 = r2
            android.view.MotionEvent r1 = android.view.MotionEvent.obtain(r2, r4, r6, r7, r8, r9)
            android.view.VelocityTracker r4 = r10.mVelocityTracker
            r4.addMovement(r1)
            r1.recycle()
            r10.mFakeDragBeginTime = r2
            return r0
    }

    protected boolean canScroll(android.view.View r13, boolean r14, int r15, int r16, int r17) {
            r12 = this;
            boolean r0 = r13 instanceof android.view.ViewGroup
            r1 = 1
            if (r0 == 0) goto L59
            r0 = r13
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            int r2 = r13.getScrollX()
            int r3 = r13.getScrollY()
            int r4 = r0.getChildCount()
            int r5 = r4 + (-1)
        L16:
            if (r5 < 0) goto L59
            android.view.View r7 = r0.getChildAt(r5)
            int r6 = r16 + r2
            int r8 = r7.getLeft()
            if (r6 < r8) goto L56
            int r6 = r16 + r2
            int r8 = r7.getRight()
            if (r6 >= r8) goto L56
            int r6 = r17 + r3
            int r8 = r7.getTop()
            if (r6 < r8) goto L56
            int r6 = r17 + r3
            int r8 = r7.getBottom()
            if (r6 >= r8) goto L56
            int r6 = r16 + r2
            int r8 = r7.getLeft()
            int r10 = r6 - r8
            int r6 = r17 + r3
            int r8 = r7.getTop()
            int r11 = r6 - r8
            r8 = 1
            r6 = r12
            r9 = r15
            boolean r8 = r6.canScroll(r7, r8, r9, r10, r11)
            if (r8 == 0) goto L56
            return r1
        L56:
            int r5 = r5 + (-1)
            goto L16
        L59:
            if (r14 == 0) goto L63
            int r0 = -r15
            boolean r0 = r13.canScrollHorizontally(r0)
            if (r0 == 0) goto L63
            goto L64
        L63:
            r1 = 0
        L64:
            return r1
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int r7) {
            r6 = this;
            androidx.viewpager.widget.PagerAdapter r0 = r6.mAdapter
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            int r0 = r6.getClientWidth()
            int r2 = r6.getScrollX()
            r3 = 1
            if (r7 >= 0) goto L1a
            float r4 = (float) r0
            float r5 = r6.mFirstOffset
            float r4 = r4 * r5
            int r4 = (int) r4
            if (r2 <= r4) goto L19
            r1 = r3
        L19:
            return r1
        L1a:
            if (r7 <= 0) goto L25
            float r4 = (float) r0
            float r5 = r6.mLastOffset
            float r4 = r4 * r5
            int r4 = (int) r4
            if (r2 >= r4) goto L24
            r1 = r3
        L24:
            return r1
        L25:
            return r1
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams r2) {
            r1 = this;
            boolean r0 = r2 instanceof androidx.viewpager.widget.ViewPager.LayoutParams
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

    public void clearOnPageChangeListeners() {
            r1 = this;
            java.util.List<androidx.viewpager.widget.ViewPager$OnPageChangeListener> r0 = r1.mOnPageChangeListeners
            if (r0 == 0) goto L9
            java.util.List<androidx.viewpager.widget.ViewPager$OnPageChangeListener> r0 = r1.mOnPageChangeListeners
            r0.clear()
        L9:
            return
    }

    @Override // android.view.View
    public void computeScroll() {
            r5 = this;
            r0 = 1
            r5.mIsScrollStarted = r0
            android.widget.Scroller r1 = r5.mScroller
            boolean r1 = r1.isFinished()
            if (r1 != 0) goto L41
            android.widget.Scroller r1 = r5.mScroller
            boolean r1 = r1.computeScrollOffset()
            if (r1 == 0) goto L41
            int r0 = r5.getScrollX()
            int r1 = r5.getScrollY()
            android.widget.Scroller r2 = r5.mScroller
            int r2 = r2.getCurrX()
            android.widget.Scroller r3 = r5.mScroller
            int r3 = r3.getCurrY()
            if (r0 != r2) goto L2b
            if (r1 == r3) goto L3d
        L2b:
            r5.scrollTo(r2, r3)
            boolean r4 = r5.pageScrolled(r2)
            if (r4 != 0) goto L3d
            android.widget.Scroller r4 = r5.mScroller
            r4.abortAnimation()
            r4 = 0
            r5.scrollTo(r4, r3)
        L3d:
            androidx.core.view.ViewCompat.postInvalidateOnAnimation(r5)
            return
        L41:
            r5.completeScroll(r0)
            return
    }

    void dataSetChanged() {
            r12 = this;
            androidx.viewpager.widget.PagerAdapter r0 = r12.mAdapter
            int r0 = r0.getCount()
            r12.mExpectedAdapterCount = r0
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$ItemInfo> r1 = r12.mItems
            int r1 = r1.size()
            int r2 = r12.mOffscreenPageLimit
            int r2 = r2 * 2
            r3 = 1
            int r2 = r2 + r3
            r4 = 0
            if (r1 >= r2) goto L21
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$ItemInfo> r1 = r12.mItems
            int r1 = r1.size()
            if (r1 >= r0) goto L21
            r1 = r3
            goto L22
        L21:
            r1 = r4
        L22:
            int r2 = r12.mCurItem
            r5 = 0
            r6 = 0
        L26:
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$ItemInfo> r7 = r12.mItems
            int r7 = r7.size()
            if (r6 >= r7) goto L82
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$ItemInfo> r7 = r12.mItems
            java.lang.Object r7 = r7.get(r6)
            androidx.viewpager.widget.ViewPager$ItemInfo r7 = (androidx.viewpager.widget.ViewPager.ItemInfo) r7
            androidx.viewpager.widget.PagerAdapter r8 = r12.mAdapter
            java.lang.Object r9 = r7.object
            int r8 = r8.getItemPosition(r9)
            r9 = -1
            if (r8 != r9) goto L42
            goto L80
        L42:
            r9 = -2
            if (r8 != r9) goto L72
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$ItemInfo> r9 = r12.mItems
            r9.remove(r6)
            int r6 = r6 + (-1)
            if (r5 != 0) goto L54
            androidx.viewpager.widget.PagerAdapter r9 = r12.mAdapter
            r9.startUpdate(r12)
            r5 = 1
        L54:
            androidx.viewpager.widget.PagerAdapter r9 = r12.mAdapter
            int r10 = r7.position
            java.lang.Object r11 = r7.object
            r9.destroyItem(r12, r10, r11)
            r1 = 1
            int r9 = r12.mCurItem
            int r10 = r7.position
            if (r9 != r10) goto L80
            int r9 = r12.mCurItem
            int r10 = r0 + (-1)
            int r9 = java.lang.Math.min(r9, r10)
            int r2 = java.lang.Math.max(r4, r9)
            r1 = 1
            goto L80
        L72:
            int r9 = r7.position
            if (r9 == r8) goto L80
            int r9 = r7.position
            int r10 = r12.mCurItem
            if (r9 != r10) goto L7d
            r2 = r8
        L7d:
            r7.position = r8
            r1 = 1
        L80:
            int r6 = r6 + r3
            goto L26
        L82:
            if (r5 == 0) goto L89
            androidx.viewpager.widget.PagerAdapter r6 = r12.mAdapter
            r6.finishUpdate(r12)
        L89:
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$ItemInfo> r6 = r12.mItems
            java.util.Comparator<androidx.viewpager.widget.ViewPager$ItemInfo> r7 = androidx.viewpager.widget.ViewPager.COMPARATOR
            java.util.Collections.sort(r6, r7)
            if (r1 == 0) goto Lb3
            int r6 = r12.getChildCount()
            r7 = 0
        L97:
            if (r7 >= r6) goto Lad
            android.view.View r8 = r12.getChildAt(r7)
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            androidx.viewpager.widget.ViewPager$LayoutParams r9 = (androidx.viewpager.widget.ViewPager.LayoutParams) r9
            boolean r10 = r9.isDecor
            if (r10 != 0) goto Laa
            r10 = 0
            r9.widthFactor = r10
        Laa:
            int r7 = r7 + 1
            goto L97
        Lad:
            r12.setCurrentItemInternal(r2, r4, r3)
            r12.requestLayout()
        Lb3:
            return
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

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent r7) {
            r6 = this;
            int r0 = r7.getEventType()
            r1 = 4096(0x1000, float:5.74E-42)
            if (r0 != r1) goto Ld
            boolean r0 = super.dispatchPopulateAccessibilityEvent(r7)
            return r0
        Ld:
            int r0 = r6.getChildCount()
            r1 = 0
        L12:
            if (r1 >= r0) goto L35
            android.view.View r2 = r6.getChildAt(r1)
            int r3 = r2.getVisibility()
            if (r3 != 0) goto L32
            androidx.viewpager.widget.ViewPager$ItemInfo r3 = r6.infoForChild(r2)
            if (r3 == 0) goto L32
            int r4 = r3.position
            int r5 = r6.mCurItem
            if (r4 != r5) goto L32
            boolean r4 = r2.dispatchPopulateAccessibilityEvent(r7)
            if (r4 == 0) goto L32
            r4 = 1
            return r4
        L32:
            int r1 = r1 + 1
            goto L12
        L35:
            r1 = 0
            return r1
    }

    float distanceInfluenceForSnapDuration(float r3) {
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

    @Override // android.view.View
    public void draw(android.graphics.Canvas r9) {
            r8 = this;
            super.draw(r9)
            r0 = 0
            int r1 = r8.getOverScrollMode()
            if (r1 == 0) goto L26
            r2 = 1
            if (r1 != r2) goto L1a
            androidx.viewpager.widget.PagerAdapter r3 = r8.mAdapter
            if (r3 == 0) goto L1a
            androidx.viewpager.widget.PagerAdapter r3 = r8.mAdapter
            int r3 = r3.getCount()
            if (r3 <= r2) goto L1a
            goto L26
        L1a:
            android.widget.EdgeEffect r2 = r8.mLeftEdge
            r2.finish()
            android.widget.EdgeEffect r2 = r8.mRightEdge
            r2.finish()
            goto Laa
        L26:
            android.widget.EdgeEffect r2 = r8.mLeftEdge
            boolean r2 = r2.isFinished()
            if (r2 != 0) goto L66
            int r2 = r9.save()
            int r3 = r8.getHeight()
            int r4 = r8.getPaddingTop()
            int r3 = r3 - r4
            int r4 = r8.getPaddingBottom()
            int r3 = r3 - r4
            int r4 = r8.getWidth()
            r5 = 1132920832(0x43870000, float:270.0)
            r9.rotate(r5)
            int r5 = -r3
            int r6 = r8.getPaddingTop()
            int r5 = r5 + r6
            float r5 = (float) r5
            float r6 = r8.mFirstOffset
            float r7 = (float) r4
            float r6 = r6 * r7
            r9.translate(r5, r6)
            android.widget.EdgeEffect r5 = r8.mLeftEdge
            r5.setSize(r3, r4)
            android.widget.EdgeEffect r5 = r8.mLeftEdge
            boolean r5 = r5.draw(r9)
            r0 = r0 | r5
            r9.restoreToCount(r2)
        L66:
            android.widget.EdgeEffect r2 = r8.mRightEdge
            boolean r2 = r2.isFinished()
            if (r2 != 0) goto Laa
            int r2 = r9.save()
            int r3 = r8.getWidth()
            int r4 = r8.getHeight()
            int r5 = r8.getPaddingTop()
            int r4 = r4 - r5
            int r5 = r8.getPaddingBottom()
            int r4 = r4 - r5
            r5 = 1119092736(0x42b40000, float:90.0)
            r9.rotate(r5)
            int r5 = r8.getPaddingTop()
            int r5 = -r5
            float r5 = (float) r5
            float r6 = r8.mLastOffset
            r7 = 1065353216(0x3f800000, float:1.0)
            float r6 = r6 + r7
            float r6 = -r6
            float r7 = (float) r3
            float r6 = r6 * r7
            r9.translate(r5, r6)
            android.widget.EdgeEffect r5 = r8.mRightEdge
            r5.setSize(r4, r3)
            android.widget.EdgeEffect r5 = r8.mRightEdge
            boolean r5 = r5.draw(r9)
            r0 = r0 | r5
            r9.restoreToCount(r2)
        Laa:
            if (r0 == 0) goto Laf
            androidx.core.view.ViewCompat.postInvalidateOnAnimation(r8)
        Laf:
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
            r2 = this;
            super.drawableStateChanged()
            android.graphics.drawable.Drawable r0 = r2.mMarginDrawable
            if (r0 == 0) goto L14
            boolean r1 = r0.isStateful()
            if (r1 == 0) goto L14
            int[] r1 = r2.getDrawableState()
            r0.setState(r1)
        L14:
            return
    }

    public void endFakeDrag() {
            r10 = this;
            boolean r0 = r10.mFakeDragging
            if (r0 == 0) goto L47
            androidx.viewpager.widget.PagerAdapter r0 = r10.mAdapter
            if (r0 == 0) goto L40
            android.view.VelocityTracker r0 = r10.mVelocityTracker
            int r1 = r10.mMaximumVelocity
            float r1 = (float) r1
            r2 = 1000(0x3e8, float:1.401E-42)
            r0.computeCurrentVelocity(r2, r1)
            int r1 = r10.mActivePointerId
            float r1 = r0.getXVelocity(r1)
            int r1 = (int) r1
            r2 = 1
            r10.mPopulatePending = r2
            int r3 = r10.getClientWidth()
            int r4 = r10.getScrollX()
            androidx.viewpager.widget.ViewPager$ItemInfo r5 = r10.infoForCurrentScrollPosition()
            int r6 = r5.position
            float r7 = (float) r4
            float r8 = (float) r3
            float r7 = r7 / r8
            float r8 = r5.offset
            float r7 = r7 - r8
            float r8 = r5.widthFactor
            float r7 = r7 / r8
            float r8 = r10.mLastMotionX
            float r9 = r10.mInitialMotionX
            float r8 = r8 - r9
            int r8 = (int) r8
            int r9 = r10.determineTargetPage(r6, r7, r1, r8)
            r10.setCurrentItemInternal(r9, r2, r2, r1)
        L40:
            r10.endDrag()
            r0 = 0
            r10.mFakeDragging = r0
            return
        L47:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "No fake drag in progress. Call beginFakeDrag first."
            r0.<init>(r1)
            throw r0
    }

    public boolean executeKeyEvent(android.view.KeyEvent r4) {
            r3 = this;
            r0 = 0
            int r1 = r4.getAction()
            if (r1 != 0) goto L4b
            int r1 = r4.getKeyCode()
            r2 = 2
            switch(r1) {
                case 21: goto L39;
                case 22: goto L27;
                case 61: goto L10;
                default: goto Lf;
            }
        Lf:
            goto L4b
        L10:
            boolean r1 = r4.hasNoModifiers()
            if (r1 == 0) goto L1b
            boolean r0 = r3.arrowScroll(r2)
            goto L4b
        L1b:
            r1 = 1
            boolean r2 = r4.hasModifiers(r1)
            if (r2 == 0) goto L4b
            boolean r0 = r3.arrowScroll(r1)
            goto L4b
        L27:
            boolean r1 = r4.hasModifiers(r2)
            if (r1 == 0) goto L32
            boolean r0 = r3.pageRight()
            goto L4b
        L32:
            r1 = 66
            boolean r0 = r3.arrowScroll(r1)
            goto L4b
        L39:
            boolean r1 = r4.hasModifiers(r2)
            if (r1 == 0) goto L44
            boolean r0 = r3.pageLeft()
            goto L4b
        L44:
            r1 = 17
            boolean r0 = r3.arrowScroll(r1)
        L4b:
            return r0
    }

    public void fakeDragBy(float r18) {
            r17 = this;
            r0 = r17
            boolean r1 = r0.mFakeDragging
            if (r1 == 0) goto L90
            androidx.viewpager.widget.PagerAdapter r1 = r0.mAdapter
            if (r1 != 0) goto Lb
            return
        Lb:
            float r1 = r0.mLastMotionX
            float r1 = r1 + r18
            r0.mLastMotionX = r1
            int r1 = r0.getScrollX()
            float r1 = (float) r1
            float r2 = r1 - r18
            int r3 = r0.getClientWidth()
            float r4 = (float) r3
            float r5 = r0.mFirstOffset
            float r4 = r4 * r5
            float r5 = (float) r3
            float r6 = r0.mLastOffset
            float r5 = r5 * r6
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$ItemInfo> r6 = r0.mItems
            r7 = 0
            java.lang.Object r6 = r6.get(r7)
            androidx.viewpager.widget.ViewPager$ItemInfo r6 = (androidx.viewpager.widget.ViewPager.ItemInfo) r6
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$ItemInfo> r7 = r0.mItems
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$ItemInfo> r8 = r0.mItems
            int r8 = r8.size()
            int r8 = r8 + (-1)
            java.lang.Object r7 = r7.get(r8)
            androidx.viewpager.widget.ViewPager$ItemInfo r7 = (androidx.viewpager.widget.ViewPager.ItemInfo) r7
            int r8 = r6.position
            if (r8 == 0) goto L46
            float r8 = r6.offset
            float r9 = (float) r3
            float r4 = r8 * r9
        L46:
            int r8 = r7.position
            androidx.viewpager.widget.PagerAdapter r9 = r0.mAdapter
            int r9 = r9.getCount()
            int r9 = r9 + (-1)
            if (r8 == r9) goto L57
            float r8 = r7.offset
            float r9 = (float) r3
            float r5 = r8 * r9
        L57:
            int r8 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r8 >= 0) goto L5d
            r2 = r4
            goto L62
        L5d:
            int r8 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r8 <= 0) goto L62
            r2 = r5
        L62:
            float r8 = r0.mLastMotionX
            int r9 = (int) r2
            float r9 = (float) r9
            float r9 = r2 - r9
            float r8 = r8 + r9
            r0.mLastMotionX = r8
            int r8 = (int) r2
            int r9 = r0.getScrollY()
            r0.scrollTo(r8, r9)
            int r8 = (int) r2
            r0.pageScrolled(r8)
            long r11 = android.os.SystemClock.uptimeMillis()
            long r9 = r0.mFakeDragBeginTime
            float r14 = r0.mLastMotionX
            r15 = 0
            r16 = 0
            r13 = 2
            android.view.MotionEvent r8 = android.view.MotionEvent.obtain(r9, r11, r13, r14, r15, r16)
            android.view.VelocityTracker r9 = r0.mVelocityTracker
            r9.addMovement(r8)
            r8.recycle()
            return
        L90:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "No fake drag in progress. Call beginFakeDrag first."
            r1.<init>(r2)
            throw r1
    }

    @Override // android.view.ViewGroup
    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
            r1 = this;
            androidx.viewpager.widget.ViewPager$LayoutParams r0 = new androidx.viewpager.widget.ViewPager$LayoutParams
            r0.<init>()
            return r0
    }

    @Override // android.view.ViewGroup
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet r3) {
            r2 = this;
            androidx.viewpager.widget.ViewPager$LayoutParams r0 = new androidx.viewpager.widget.ViewPager$LayoutParams
            android.content.Context r1 = r2.getContext()
            r0.<init>(r1, r3)
            return r0
    }

    @Override // android.view.ViewGroup
    protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams r2) {
            r1 = this;
            android.view.ViewGroup$LayoutParams r0 = r1.generateDefaultLayoutParams()
            return r0
    }

    public androidx.viewpager.widget.PagerAdapter getAdapter() {
            r1 = this;
            androidx.viewpager.widget.PagerAdapter r0 = r1.mAdapter
            return r0
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int r3, int r4) {
            r2 = this;
            int r0 = r2.mDrawingOrder
            r1 = 2
            if (r0 != r1) goto L9
            int r0 = r3 + (-1)
            int r0 = r0 - r4
            goto La
        L9:
            r0 = r4
        La:
            java.util.ArrayList<android.view.View> r1 = r2.mDrawingOrderedChildren
            java.lang.Object r1 = r1.get(r0)
            android.view.View r1 = (android.view.View) r1
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.viewpager.widget.ViewPager$LayoutParams r1 = (androidx.viewpager.widget.ViewPager.LayoutParams) r1
            int r1 = r1.childIndex
            return r1
    }

    public int getCurrentItem() {
            r1 = this;
            int r0 = r1.mCurItem
            return r0
    }

    public int getOffscreenPageLimit() {
            r1 = this;
            int r0 = r1.mOffscreenPageLimit
            return r0
    }

    public int getPageMargin() {
            r1 = this;
            int r0 = r1.mPageMargin
            return r0
    }

    androidx.viewpager.widget.ViewPager.ItemInfo infoForAnyChild(android.view.View r3) {
            r2 = this;
        L1:
            android.view.ViewParent r0 = r3.getParent()
            r1 = r0
            if (r0 == r2) goto L15
            if (r1 == 0) goto L13
            boolean r0 = r1 instanceof android.view.View
            if (r0 != 0) goto Lf
            goto L13
        Lf:
            r3 = r1
            android.view.View r3 = (android.view.View) r3
            goto L1
        L13:
            r0 = 0
            return r0
        L15:
            androidx.viewpager.widget.ViewPager$ItemInfo r0 = r2.infoForChild(r3)
            return r0
    }

    androidx.viewpager.widget.ViewPager.ItemInfo infoForChild(android.view.View r5) {
            r4 = this;
            r0 = 0
        L1:
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$ItemInfo> r1 = r4.mItems
            int r1 = r1.size()
            if (r0 >= r1) goto L1f
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$ItemInfo> r1 = r4.mItems
            java.lang.Object r1 = r1.get(r0)
            androidx.viewpager.widget.ViewPager$ItemInfo r1 = (androidx.viewpager.widget.ViewPager.ItemInfo) r1
            androidx.viewpager.widget.PagerAdapter r2 = r4.mAdapter
            java.lang.Object r3 = r1.object
            boolean r2 = r2.isViewFromObject(r5, r3)
            if (r2 == 0) goto L1c
            return r1
        L1c:
            int r0 = r0 + 1
            goto L1
        L1f:
            r0 = 0
            return r0
    }

    androidx.viewpager.widget.ViewPager.ItemInfo infoForPosition(int r4) {
            r3 = this;
            r0 = 0
        L1:
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$ItemInfo> r1 = r3.mItems
            int r1 = r1.size()
            if (r0 >= r1) goto L19
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$ItemInfo> r1 = r3.mItems
            java.lang.Object r1 = r1.get(r0)
            androidx.viewpager.widget.ViewPager$ItemInfo r1 = (androidx.viewpager.widget.ViewPager.ItemInfo) r1
            int r2 = r1.position
            if (r2 != r4) goto L16
            return r1
        L16:
            int r0 = r0 + 1
            goto L1
        L19:
            r0 = 0
            return r0
    }

    void initViewPager() {
            r5 = this;
            r0 = 0
            r5.setWillNotDraw(r0)
            r0 = 262144(0x40000, float:3.67342E-40)
            r5.setDescendantFocusability(r0)
            r0 = 1
            r5.setFocusable(r0)
            android.content.Context r1 = r5.getContext()
            android.widget.Scroller r2 = new android.widget.Scroller
            android.view.animation.Interpolator r3 = androidx.viewpager.widget.ViewPager.sInterpolator
            r2.<init>(r1, r3)
            r5.mScroller = r2
            android.view.ViewConfiguration r2 = android.view.ViewConfiguration.get(r1)
            android.content.res.Resources r3 = r1.getResources()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            float r3 = r3.density
            int r4 = r2.getScaledPagingTouchSlop()
            r5.mTouchSlop = r4
            r4 = 1137180672(0x43c80000, float:400.0)
            float r4 = r4 * r3
            int r4 = (int) r4
            r5.mMinimumVelocity = r4
            int r4 = r2.getScaledMaximumFlingVelocity()
            r5.mMaximumVelocity = r4
            android.widget.EdgeEffect r4 = new android.widget.EdgeEffect
            r4.<init>(r1)
            r5.mLeftEdge = r4
            android.widget.EdgeEffect r4 = new android.widget.EdgeEffect
            r4.<init>(r1)
            r5.mRightEdge = r4
            r4 = 1103626240(0x41c80000, float:25.0)
            float r4 = r4 * r3
            int r4 = (int) r4
            r5.mFlingDistance = r4
            r4 = 1073741824(0x40000000, float:2.0)
            float r4 = r4 * r3
            int r4 = (int) r4
            r5.mCloseEnough = r4
            r4 = 1098907648(0x41800000, float:16.0)
            float r4 = r4 * r3
            int r4 = (int) r4
            r5.mDefaultGutterSize = r4
            androidx.viewpager.widget.ViewPager$MyAccessibilityDelegate r4 = new androidx.viewpager.widget.ViewPager$MyAccessibilityDelegate
            r4.<init>(r5)
            androidx.core.view.ViewCompat.setAccessibilityDelegate(r5, r4)
            int r4 = androidx.core.view.ViewCompat.getImportantForAccessibility(r5)
            if (r4 != 0) goto L6b
            androidx.core.view.ViewCompat.setImportantForAccessibility(r5, r0)
        L6b:
            androidx.viewpager.widget.ViewPager$4 r0 = new androidx.viewpager.widget.ViewPager$4
            r0.<init>(r5)
            androidx.core.view.ViewCompat.setOnApplyWindowInsetsListener(r5, r0)
            return
    }

    public boolean isFakeDragging() {
            r1 = this;
            boolean r0 = r1.mFakeDragging
            return r0
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
            java.lang.Runnable r0 = r1.mEndScrollRunnable
            r1.removeCallbacks(r0)
            android.widget.Scroller r0 = r1.mScroller
            if (r0 == 0) goto L16
            android.widget.Scroller r0 = r1.mScroller
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L16
            android.widget.Scroller r0 = r1.mScroller
            r0.abortAnimation()
        L16:
            super.onDetachedFromWindow()
            return
    }

    @Override // android.view.View
    protected void onDraw(android.graphics.Canvas r18) {
            r17 = this;
            r0 = r17
            super.onDraw(r18)
            int r1 = r0.mPageMargin
            if (r1 <= 0) goto Lba
            android.graphics.drawable.Drawable r1 = r0.mMarginDrawable
            if (r1 == 0) goto Lba
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$ItemInfo> r1 = r0.mItems
            int r1 = r1.size()
            if (r1 <= 0) goto Lba
            androidx.viewpager.widget.PagerAdapter r1 = r0.mAdapter
            if (r1 == 0) goto Lba
            int r1 = r0.getScrollX()
            int r2 = r0.getWidth()
            int r3 = r0.mPageMargin
            float r3 = (float) r3
            float r4 = (float) r2
            float r3 = r3 / r4
            r4 = 0
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$ItemInfo> r5 = r0.mItems
            r6 = 0
            java.lang.Object r5 = r5.get(r6)
            androidx.viewpager.widget.ViewPager$ItemInfo r5 = (androidx.viewpager.widget.ViewPager.ItemInfo) r5
            float r6 = r5.offset
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$ItemInfo> r7 = r0.mItems
            int r7 = r7.size()
            int r8 = r5.position
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$ItemInfo> r9 = r0.mItems
            int r10 = r7 + (-1)
            java.lang.Object r9 = r9.get(r10)
            androidx.viewpager.widget.ViewPager$ItemInfo r9 = (androidx.viewpager.widget.ViewPager.ItemInfo) r9
            int r9 = r9.position
            r10 = r8
        L47:
            if (r10 >= r9) goto Lb5
        L49:
            int r11 = r5.position
            if (r10 <= r11) goto L5b
            if (r4 >= r7) goto L5b
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$ItemInfo> r11 = r0.mItems
            int r4 = r4 + 1
            java.lang.Object r11 = r11.get(r4)
            r5 = r11
            androidx.viewpager.widget.ViewPager$ItemInfo r5 = (androidx.viewpager.widget.ViewPager.ItemInfo) r5
            goto L49
        L5b:
            int r11 = r5.position
            if (r10 != r11) goto L6e
            float r11 = r5.offset
            float r12 = r5.widthFactor
            float r11 = r11 + r12
            float r12 = (float) r2
            float r11 = r11 * r12
            float r12 = r5.offset
            float r13 = r5.widthFactor
            float r12 = r12 + r13
            float r12 = r12 + r3
            r6 = r12
            goto L7c
        L6e:
            androidx.viewpager.widget.PagerAdapter r11 = r0.mAdapter
            float r11 = r11.getPageWidth(r10)
            float r12 = r6 + r11
            float r13 = (float) r2
            float r12 = r12 * r13
            float r13 = r11 + r3
            float r6 = r6 + r13
            r11 = r12
        L7c:
            int r12 = r0.mPageMargin
            float r12 = (float) r12
            float r12 = r12 + r11
            float r13 = (float) r1
            int r12 = (r12 > r13 ? 1 : (r12 == r13 ? 0 : -1))
            if (r12 <= 0) goto La4
            android.graphics.drawable.Drawable r12 = r0.mMarginDrawable
            int r13 = java.lang.Math.round(r11)
            int r14 = r0.mTopPageBounds
            int r15 = r0.mPageMargin
            float r15 = (float) r15
            float r15 = r15 + r11
            int r15 = java.lang.Math.round(r15)
            r16 = r1
            int r1 = r0.mBottomPageBounds
            r12.setBounds(r13, r14, r15, r1)
            android.graphics.drawable.Drawable r1 = r0.mMarginDrawable
            r12 = r18
            r1.draw(r12)
            goto La8
        La4:
            r12 = r18
            r16 = r1
        La8:
            int r1 = r16 + r2
            float r1 = (float) r1
            int r1 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r1 <= 0) goto Lb0
            goto Lbc
        Lb0:
            int r10 = r10 + 1
            r1 = r16
            goto L47
        Lb5:
            r12 = r18
            r16 = r1
            goto Lbc
        Lba:
            r12 = r18
        Lbc:
            return
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent r19) {
            r18 = this;
            r0 = r18
            r6 = r19
            int r1 = r6.getAction()
            r7 = r1 & 255(0xff, float:3.57E-43)
            r1 = 3
            r8 = 0
            if (r7 == r1) goto L117
            r9 = 1
            if (r7 != r9) goto L13
            goto L117
        L13:
            if (r7 == 0) goto L1f
            boolean r1 = r0.mIsBeingDragged
            if (r1 == 0) goto L1a
            return r9
        L1a:
            boolean r1 = r0.mIsUnableToDrag
            if (r1 == 0) goto L1f
            return r8
        L1f:
            switch(r7) {
                case 0: goto Lb3;
                case 2: goto L29;
                case 6: goto L24;
                default: goto L22;
            }
        L22:
            goto L105
        L24:
            r18.onSecondaryPointerUp(r19)
            goto L105
        L29:
            int r10 = r0.mActivePointerId
            r1 = -1
            if (r10 != r1) goto L30
            goto L105
        L30:
            int r11 = r6.findPointerIndex(r10)
            float r12 = r6.getX(r11)
            float r1 = r0.mLastMotionX
            float r13 = r12 - r1
            float r14 = java.lang.Math.abs(r13)
            float r15 = r6.getY(r11)
            float r1 = r0.mInitialMotionY
            float r1 = r15 - r1
            float r16 = java.lang.Math.abs(r1)
            r17 = 0
            int r1 = (r13 > r17 ? 1 : (r13 == r17 ? 0 : -1))
            if (r1 == 0) goto L6d
            float r1 = r0.mLastMotionX
            boolean r1 = r0.isGutterDrag(r1, r13)
            if (r1 != 0) goto L6d
            int r3 = (int) r13
            int r4 = (int) r12
            int r5 = (int) r15
            r2 = 0
            r1 = r18
            boolean r1 = r0.canScroll(r1, r2, r3, r4, r5)
            if (r1 == 0) goto L6d
            r0.mLastMotionX = r12
            r0.mLastMotionY = r15
            r0.mIsUnableToDrag = r9
            return r8
        L6d:
            int r1 = r0.mTouchSlop
            float r1 = (float) r1
            int r1 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            if (r1 <= 0) goto L9c
            r1 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 * r14
            int r1 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            if (r1 <= 0) goto L9c
            r0.mIsBeingDragged = r9
            r0.requestParentDisallowInterceptTouchEvent(r9)
            r0.setScrollState(r9)
            int r1 = (r13 > r17 ? 1 : (r13 == r17 ? 0 : -1))
            if (r1 <= 0) goto L8e
            float r1 = r0.mInitialMotionX
            int r2 = r0.mTouchSlop
            float r2 = (float) r2
            float r1 = r1 + r2
            goto L94
        L8e:
            float r1 = r0.mInitialMotionX
            int r2 = r0.mTouchSlop
            float r2 = (float) r2
            float r1 = r1 - r2
        L94:
            r0.mLastMotionX = r1
            r0.mLastMotionY = r15
            r0.setScrollingCacheEnabled(r9)
            goto La5
        L9c:
            int r1 = r0.mTouchSlop
            float r1 = (float) r1
            int r1 = (r16 > r1 ? 1 : (r16 == r1 ? 0 : -1))
            if (r1 <= 0) goto La5
            r0.mIsUnableToDrag = r9
        La5:
            boolean r1 = r0.mIsBeingDragged
            if (r1 == 0) goto L105
            boolean r1 = r0.performDrag(r12)
            if (r1 == 0) goto L105
            androidx.core.view.ViewCompat.postInvalidateOnAnimation(r0)
            goto L105
        Lb3:
            float r1 = r6.getX()
            r0.mInitialMotionX = r1
            r0.mLastMotionX = r1
            float r1 = r6.getY()
            r0.mInitialMotionY = r1
            r0.mLastMotionY = r1
            int r1 = r6.getPointerId(r8)
            r0.mActivePointerId = r1
            r0.mIsUnableToDrag = r8
            r0.mIsScrollStarted = r9
            android.widget.Scroller r1 = r0.mScroller
            r1.computeScrollOffset()
            int r1 = r0.mScrollState
            r2 = 2
            if (r1 != r2) goto Lff
            android.widget.Scroller r1 = r0.mScroller
            int r1 = r1.getFinalX()
            android.widget.Scroller r2 = r0.mScroller
            int r2 = r2.getCurrX()
            int r1 = r1 - r2
            int r1 = java.lang.Math.abs(r1)
            int r2 = r0.mCloseEnough
            if (r1 <= r2) goto Lff
            android.widget.Scroller r1 = r0.mScroller
            r1.abortAnimation()
            r0.mPopulatePending = r8
            r0.populate()
            r0.mIsBeingDragged = r9
            r0.requestParentDisallowInterceptTouchEvent(r9)
            r0.setScrollState(r9)
            goto L105
        Lff:
            r0.completeScroll(r8)
            r0.mIsBeingDragged = r8
        L105:
            android.view.VelocityTracker r1 = r0.mVelocityTracker
            if (r1 != 0) goto L10f
            android.view.VelocityTracker r1 = android.view.VelocityTracker.obtain()
            r0.mVelocityTracker = r1
        L10f:
            android.view.VelocityTracker r1 = r0.mVelocityTracker
            r1.addMovement(r6)
            boolean r1 = r0.mIsBeingDragged
            return r1
        L117:
            r0.resetTouch()
            return r8
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean r24, int r25, int r26, int r27, int r28) {
            r23 = this;
            r0 = r23
            int r1 = r0.getChildCount()
            int r2 = r27 - r25
            int r3 = r28 - r26
            int r4 = r0.getPaddingLeft()
            int r5 = r0.getPaddingTop()
            int r6 = r0.getPaddingRight()
            int r7 = r0.getPaddingBottom()
            int r8 = r0.getScrollX()
            r9 = 0
            r10 = 0
        L20:
            r11 = 8
            if (r10 >= r1) goto Lc2
            android.view.View r12 = r0.getChildAt(r10)
            int r13 = r12.getVisibility()
            if (r13 == r11) goto Lb6
            android.view.ViewGroup$LayoutParams r11 = r12.getLayoutParams()
            androidx.viewpager.widget.ViewPager$LayoutParams r11 = (androidx.viewpager.widget.ViewPager.LayoutParams) r11
            r13 = 0
            r14 = 0
            boolean r15 = r11.isDecor
            if (r15 == 0) goto Lb1
            int r15 = r11.gravity
            r15 = r15 & 7
            r16 = r2
            int r2 = r11.gravity
            r2 = r2 & 112(0x70, float:1.57E-43)
            switch(r15) {
                case 1: goto L66;
                case 2: goto L47;
                case 3: goto L5c;
                case 4: goto L47;
                case 5: goto L4c;
                default: goto L47;
            }
        L47:
            r18 = r2
            r17 = r4
            goto L75
        L4c:
            int r17 = r16 - r6
            int r18 = r12.getMeasuredWidth()
            int r17 = r17 - r18
            int r13 = r12.getMeasuredWidth()
            int r6 = r6 + r13
            r18 = r2
            goto L75
        L5c:
            r17 = r4
            int r13 = r12.getMeasuredWidth()
            int r4 = r4 + r13
            r18 = r2
            goto L75
        L66:
            int r17 = r12.getMeasuredWidth()
            int r17 = r16 - r17
            r18 = r2
            int r2 = r17 / 2
            int r17 = java.lang.Math.max(r2, r4)
        L75:
            switch(r18) {
                case 16: goto L8e;
                case 48: goto L87;
                case 80: goto L7a;
                default: goto L78;
            }
        L78:
            r2 = r5
            goto L9b
        L7a:
            int r2 = r3 - r7
            int r13 = r12.getMeasuredHeight()
            int r2 = r2 - r13
            int r13 = r12.getMeasuredHeight()
            int r7 = r7 + r13
            goto L9b
        L87:
            r2 = r5
            int r13 = r12.getMeasuredHeight()
            int r5 = r5 + r13
            goto L9b
        L8e:
            int r2 = r12.getMeasuredHeight()
            int r2 = r3 - r2
            int r2 = r2 / 2
            int r2 = java.lang.Math.max(r2, r5)
        L9b:
            int r13 = r17 + r8
            int r14 = r12.getMeasuredWidth()
            int r14 = r14 + r13
            int r17 = r12.getMeasuredHeight()
            r19 = r3
            int r3 = r2 + r17
            r12.layout(r13, r2, r14, r3)
            int r9 = r9 + 1
            goto Lba
        Lb1:
            r16 = r2
            r19 = r3
            goto Lba
        Lb6:
            r16 = r2
            r19 = r3
        Lba:
            int r10 = r10 + 1
            r2 = r16
            r3 = r19
            goto L20
        Lc2:
            r16 = r2
            r19 = r3
            int r2 = r16 - r4
            int r2 = r2 - r6
            r3 = 0
        Lca:
            if (r3 >= r1) goto L13f
            android.view.View r12 = r0.getChildAt(r3)
            int r13 = r12.getVisibility()
            if (r13 == r11) goto L132
            android.view.ViewGroup$LayoutParams r13 = r12.getLayoutParams()
            androidx.viewpager.widget.ViewPager$LayoutParams r13 = (androidx.viewpager.widget.ViewPager.LayoutParams) r13
            boolean r14 = r13.isDecor
            if (r14 != 0) goto L12d
            androidx.viewpager.widget.ViewPager$ItemInfo r14 = r0.infoForChild(r12)
            r15 = r14
            if (r14 == 0) goto L128
            float r14 = (float) r2
            float r11 = r15.offset
            float r14 = r14 * r11
            int r11 = (int) r14
            int r14 = r4 + r11
            r18 = r5
            boolean r10 = r13.needsMeasure
            if (r10 == 0) goto L112
            r10 = 0
            r13.needsMeasure = r10
            float r10 = (float) r2
            r21 = r1
            float r1 = r13.widthFactor
            float r10 = r10 * r1
            int r1 = (int) r10
            r10 = 1073741824(0x40000000, float:2.0)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r10)
            int r20 = r19 - r5
            r22 = r2
            int r2 = r20 - r7
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r10)
            r12.measure(r1, r2)
            goto L116
        L112:
            r21 = r1
            r22 = r2
        L116:
            int r1 = r12.getMeasuredWidth()
            int r1 = r1 + r14
            int r2 = r12.getMeasuredHeight()
            int r2 = r18 + r2
            r10 = r18
            r12.layout(r14, r10, r1, r2)
            goto L136
        L128:
            r21 = r1
            r22 = r2
            goto L136
        L12d:
            r21 = r1
            r22 = r2
            goto L136
        L132:
            r21 = r1
            r22 = r2
        L136:
            int r3 = r3 + 1
            r1 = r21
            r2 = r22
            r11 = 8
            goto Lca
        L13f:
            r21 = r1
            r22 = r2
            r0.mTopPageBounds = r5
            int r3 = r19 - r7
            r0.mBottomPageBounds = r3
            r0.mDecorChildCount = r9
            boolean r1 = r0.mFirstLayout
            if (r1 == 0) goto L156
            int r1 = r0.mCurItem
            r10 = 0
            r0.scrollToItem(r1, r10, r10, r10)
            goto L157
        L156:
            r10 = 0
        L157:
            r0.mFirstLayout = r10
            return
    }

    @Override // android.view.View
    protected void onMeasure(int r22, int r23) {
            r21 = this;
            r0 = r21
            r1 = 0
            r2 = r22
            int r3 = getDefaultSize(r1, r2)
            r4 = r23
            int r5 = getDefaultSize(r1, r4)
            r0.setMeasuredDimension(r3, r5)
            int r3 = r0.getMeasuredWidth()
            int r5 = r3 / 10
            int r6 = r0.mDefaultGutterSize
            int r6 = java.lang.Math.min(r5, r6)
            r0.mGutterSize = r6
            int r6 = r0.getPaddingLeft()
            int r6 = r3 - r6
            int r7 = r0.getPaddingRight()
            int r6 = r6 - r7
            int r7 = r0.getMeasuredHeight()
            int r8 = r0.getPaddingTop()
            int r7 = r7 - r8
            int r8 = r0.getPaddingBottom()
            int r7 = r7 - r8
            int r8 = r0.getChildCount()
            r9 = 0
        L3e:
            r10 = 8
            if (r9 >= r8) goto Le9
            android.view.View r12 = r0.getChildAt(r9)
            int r13 = r12.getVisibility()
            if (r13 == r10) goto Ldc
            android.view.ViewGroup$LayoutParams r10 = r12.getLayoutParams()
            androidx.viewpager.widget.ViewPager$LayoutParams r10 = (androidx.viewpager.widget.ViewPager.LayoutParams) r10
            if (r10 == 0) goto Ld9
            boolean r13 = r10.isDecor
            if (r13 == 0) goto Ld9
            int r13 = r10.gravity
            r13 = r13 & 7
            int r14 = r10.gravity
            r14 = r14 & 112(0x70, float:1.57E-43)
            r15 = -2147483648(0xffffffff80000000, float:-0.0)
            r16 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = 48
            if (r14 == r1) goto L6f
            r1 = 80
            if (r14 != r1) goto L6d
            goto L6f
        L6d:
            r1 = 0
            goto L70
        L6f:
            r1 = 1
        L70:
            r11 = 3
            if (r13 == r11) goto L79
            r11 = 5
            if (r13 != r11) goto L77
            goto L79
        L77:
            r11 = 0
            goto L7a
        L79:
            r11 = 1
        L7a:
            if (r1 == 0) goto L7f
            r15 = 1073741824(0x40000000, float:2.0)
            goto L83
        L7f:
            if (r11 == 0) goto L83
            r16 = 1073741824(0x40000000, float:2.0)
        L83:
            r17 = r6
            r18 = r7
            r19 = r1
            int r1 = r10.width
            r2 = -2
            if (r1 == r2) goto L9b
            r15 = 1073741824(0x40000000, float:2.0)
            int r1 = r10.width
            r2 = -1
            if (r1 == r2) goto L98
            int r1 = r10.width
            goto L9d
        L98:
            r1 = r17
            goto L9d
        L9b:
            r1 = r17
        L9d:
            int r2 = r10.height
            r20 = r3
            r3 = -2
            if (r2 == r3) goto Lb6
            r16 = 1073741824(0x40000000, float:2.0)
            int r2 = r10.height
            r3 = -1
            if (r2 == r3) goto Lb1
            int r2 = r10.height
            r3 = r2
            r2 = r16
            goto Lba
        Lb1:
            r2 = r16
            r3 = r18
            goto Lba
        Lb6:
            r2 = r16
            r3 = r18
        Lba:
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r15)
            r16 = r1
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r2)
            r12.measure(r4, r1)
            if (r19 == 0) goto Ld0
            int r17 = r12.getMeasuredHeight()
            int r7 = r7 - r17
            goto Lde
        Ld0:
            if (r11 == 0) goto Lde
            int r17 = r12.getMeasuredWidth()
            int r6 = r6 - r17
            goto Lde
        Ld9:
            r20 = r3
            goto Lde
        Ldc:
            r20 = r3
        Lde:
            int r9 = r9 + 1
            r2 = r22
            r4 = r23
            r3 = r20
            r1 = 0
            goto L3e
        Le9:
            r20 = r3
            r1 = 1073741824(0x40000000, float:2.0)
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r1)
            r0.mChildWidthMeasureSpec = r2
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r1)
            r0.mChildHeightMeasureSpec = r2
            r2 = 1
            r0.mInLayout = r2
            r0.populate()
            r2 = 0
            r0.mInLayout = r2
            int r2 = r0.getChildCount()
            r3 = 0
        L107:
            if (r3 >= r2) goto L130
            android.view.View r4 = r0.getChildAt(r3)
            int r8 = r4.getVisibility()
            if (r8 == r10) goto L12d
            android.view.ViewGroup$LayoutParams r8 = r4.getLayoutParams()
            androidx.viewpager.widget.ViewPager$LayoutParams r8 = (androidx.viewpager.widget.ViewPager.LayoutParams) r8
            if (r8 == 0) goto L11f
            boolean r9 = r8.isDecor
            if (r9 != 0) goto L12d
        L11f:
            float r9 = (float) r6
            float r11 = r8.widthFactor
            float r9 = r9 * r11
            int r9 = (int) r9
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r1)
            int r11 = r0.mChildHeightMeasureSpec
            r4.measure(r9, r11)
        L12d:
            int r3 = r3 + 1
            goto L107
        L130:
            return
    }

    protected void onPageScrolled(int r13, float r14, int r15) {
            r12 = this;
            int r0 = r12.mDecorChildCount
            if (r0 <= 0) goto L64
            int r0 = r12.getScrollX()
            int r1 = r12.getPaddingLeft()
            int r2 = r12.getPaddingRight()
            int r3 = r12.getWidth()
            int r4 = r12.getChildCount()
            r5 = 0
        L19:
            if (r5 >= r4) goto L64
            android.view.View r6 = r12.getChildAt(r5)
            android.view.ViewGroup$LayoutParams r7 = r6.getLayoutParams()
            androidx.viewpager.widget.ViewPager$LayoutParams r7 = (androidx.viewpager.widget.ViewPager.LayoutParams) r7
            boolean r8 = r7.isDecor
            if (r8 != 0) goto L2a
            goto L61
        L2a:
            int r8 = r7.gravity
            r8 = r8 & 7
            r9 = 0
            switch(r8) {
                case 1: goto L48;
                case 2: goto L32;
                case 3: goto L41;
                case 4: goto L32;
                case 5: goto L34;
                default: goto L32;
            }
        L32:
            r10 = r1
            goto L55
        L34:
            int r10 = r3 - r2
            int r11 = r6.getMeasuredWidth()
            int r10 = r10 - r11
            int r9 = r6.getMeasuredWidth()
            int r2 = r2 + r9
            goto L55
        L41:
            r10 = r1
            int r9 = r6.getWidth()
            int r1 = r1 + r9
            goto L55
        L48:
            int r10 = r6.getMeasuredWidth()
            int r10 = r3 - r10
            int r10 = r10 / 2
            int r10 = java.lang.Math.max(r10, r1)
        L55:
            int r10 = r10 + r0
            int r9 = r6.getLeft()
            int r9 = r10 - r9
            if (r9 == 0) goto L61
            r6.offsetLeftAndRight(r9)
        L61:
            int r5 = r5 + 1
            goto L19
        L64:
            r12.dispatchOnPageScrolled(r13, r14, r15)
            androidx.viewpager.widget.ViewPager$PageTransformer r0 = r12.mPageTransformer
            if (r0 == 0) goto L99
            int r0 = r12.getScrollX()
            int r1 = r12.getChildCount()
            r2 = 0
        L74:
            if (r2 >= r1) goto L99
            android.view.View r3 = r12.getChildAt(r2)
            android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
            androidx.viewpager.widget.ViewPager$LayoutParams r4 = (androidx.viewpager.widget.ViewPager.LayoutParams) r4
            boolean r5 = r4.isDecor
            if (r5 == 0) goto L85
            goto L96
        L85:
            int r5 = r3.getLeft()
            int r5 = r5 - r0
            float r5 = (float) r5
            int r6 = r12.getClientWidth()
            float r6 = (float) r6
            float r5 = r5 / r6
            androidx.viewpager.widget.ViewPager$PageTransformer r6 = r12.mPageTransformer
            r6.transformPage(r3, r5)
        L96:
            int r2 = r2 + 1
            goto L74
        L99:
            r0 = 1
            r12.mCalledSuper = r0
            return
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int r10, android.graphics.Rect r11) {
            r9 = this;
            int r0 = r9.getChildCount()
            r1 = r10 & 2
            if (r1 == 0) goto Lc
            r1 = 0
            r2 = 1
            r3 = r0
            goto L10
        Lc:
            int r1 = r0 + (-1)
            r2 = -1
            r3 = -1
        L10:
            r4 = r1
        L11:
            if (r4 == r3) goto L33
            android.view.View r5 = r9.getChildAt(r4)
            int r6 = r5.getVisibility()
            if (r6 != 0) goto L31
            androidx.viewpager.widget.ViewPager$ItemInfo r6 = r9.infoForChild(r5)
            if (r6 == 0) goto L31
            int r7 = r6.position
            int r8 = r9.mCurItem
            if (r7 != r8) goto L31
            boolean r7 = r5.requestFocus(r10, r11)
            if (r7 == 0) goto L31
            r7 = 1
            return r7
        L31:
            int r4 = r4 + r2
            goto L11
        L33:
            r4 = 0
            return r4
    }

    @Override // android.view.View
    public void onRestoreInstanceState(android.os.Parcelable r5) {
            r4 = this;
            boolean r0 = r5 instanceof androidx.viewpager.widget.ViewPager.SavedState
            if (r0 != 0) goto L8
            super.onRestoreInstanceState(r5)
            return
        L8:
            r0 = r5
            androidx.viewpager.widget.ViewPager$SavedState r0 = (androidx.viewpager.widget.ViewPager.SavedState) r0
            android.os.Parcelable r1 = r0.getSuperState()
            super.onRestoreInstanceState(r1)
            androidx.viewpager.widget.PagerAdapter r1 = r4.mAdapter
            if (r1 == 0) goto L27
            androidx.viewpager.widget.PagerAdapter r1 = r4.mAdapter
            android.os.Parcelable r2 = r0.adapterState
            java.lang.ClassLoader r3 = r0.loader
            r1.restoreState(r2, r3)
            int r1 = r0.position
            r2 = 0
            r3 = 1
            r4.setCurrentItemInternal(r1, r2, r3)
            goto L33
        L27:
            int r1 = r0.position
            r4.mRestoredCurItem = r1
            android.os.Parcelable r1 = r0.adapterState
            r4.mRestoredAdapterState = r1
            java.lang.ClassLoader r1 = r0.loader
            r4.mRestoredClassLoader = r1
        L33:
            return
    }

    @Override // android.view.View
    public android.os.Parcelable onSaveInstanceState() {
            r3 = this;
            android.os.Parcelable r0 = super.onSaveInstanceState()
            androidx.viewpager.widget.ViewPager$SavedState r1 = new androidx.viewpager.widget.ViewPager$SavedState
            r1.<init>(r0)
            int r2 = r3.mCurItem
            r1.position = r2
            androidx.viewpager.widget.PagerAdapter r2 = r3.mAdapter
            if (r2 == 0) goto L19
            androidx.viewpager.widget.PagerAdapter r2 = r3.mAdapter
            android.os.Parcelable r2 = r2.saveState()
            r1.adapterState = r2
        L19:
            return r1
    }

    @Override // android.view.View
    protected void onSizeChanged(int r3, int r4, int r5, int r6) {
            r2 = this;
            super.onSizeChanged(r3, r4, r5, r6)
            if (r3 == r5) goto Lc
            int r0 = r2.mPageMargin
            int r1 = r2.mPageMargin
            r2.recomputeScrollPosition(r3, r5, r0, r1)
        Lc:
            return
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent r18) {
            r17 = this;
            r0 = r17
            r1 = r18
            boolean r2 = r0.mFakeDragging
            r3 = 1
            if (r2 == 0) goto La
            return r3
        La:
            int r2 = r1.getAction()
            r4 = 0
            if (r2 != 0) goto L18
            int r2 = r1.getEdgeFlags()
            if (r2 == 0) goto L18
            return r4
        L18:
            androidx.viewpager.widget.PagerAdapter r2 = r0.mAdapter
            if (r2 == 0) goto L17d
            androidx.viewpager.widget.PagerAdapter r2 = r0.mAdapter
            int r2 = r2.getCount()
            if (r2 != 0) goto L26
            goto L17d
        L26:
            android.view.VelocityTracker r2 = r0.mVelocityTracker
            if (r2 != 0) goto L30
            android.view.VelocityTracker r2 = android.view.VelocityTracker.obtain()
            r0.mVelocityTracker = r2
        L30:
            android.view.VelocityTracker r2 = r0.mVelocityTracker
            r2.addMovement(r1)
            int r2 = r1.getAction()
            r5 = 0
            r6 = r2 & 255(0xff, float:3.57E-43)
            switch(r6) {
                case 0: goto L154;
                case 1: goto L100;
                case 2: goto L7f;
                case 3: goto L6a;
                case 4: goto L3f;
                case 5: goto L56;
                case 6: goto L43;
                default: goto L3f;
            }
        L3f:
            r16 = r2
            goto L177
        L43:
            r17.onSecondaryPointerUp(r18)
            int r4 = r0.mActivePointerId
            int r4 = r1.findPointerIndex(r4)
            float r4 = r1.getX(r4)
            r0.mLastMotionX = r4
            r16 = r2
            goto L177
        L56:
            int r4 = r1.getActionIndex()
            float r6 = r1.getX(r4)
            r0.mLastMotionX = r6
            int r7 = r1.getPointerId(r4)
            r0.mActivePointerId = r7
            r16 = r2
            goto L177
        L6a:
            boolean r6 = r0.mIsBeingDragged
            if (r6 == 0) goto L7b
            int r6 = r0.mCurItem
            r0.scrollToItem(r6, r3, r4, r4)
            boolean r5 = r0.resetTouch()
            r16 = r2
            goto L177
        L7b:
            r16 = r2
            goto L177
        L7f:
            boolean r4 = r0.mIsBeingDragged
            if (r4 != 0) goto Le5
            int r4 = r0.mActivePointerId
            int r4 = r1.findPointerIndex(r4)
            r6 = -1
            if (r4 != r6) goto L94
            boolean r5 = r0.resetTouch()
            r16 = r2
            goto L177
        L94:
            float r6 = r1.getX(r4)
            float r7 = r0.mLastMotionX
            float r7 = r6 - r7
            float r7 = java.lang.Math.abs(r7)
            float r8 = r1.getY(r4)
            float r9 = r0.mLastMotionY
            float r9 = r8 - r9
            float r9 = java.lang.Math.abs(r9)
            int r10 = r0.mTouchSlop
            float r10 = (float) r10
            int r10 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r10 <= 0) goto Le5
            int r10 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r10 <= 0) goto Le5
            r0.mIsBeingDragged = r3
            r0.requestParentDisallowInterceptTouchEvent(r3)
            float r10 = r0.mInitialMotionX
            float r10 = r6 - r10
            r11 = 0
            int r10 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r10 <= 0) goto Lcc
            float r10 = r0.mInitialMotionX
            int r11 = r0.mTouchSlop
            float r11 = (float) r11
            float r10 = r10 + r11
            goto Ld2
        Lcc:
            float r10 = r0.mInitialMotionX
            int r11 = r0.mTouchSlop
            float r11 = (float) r11
            float r10 = r10 - r11
        Ld2:
            r0.mLastMotionX = r10
            r0.mLastMotionY = r8
            r0.setScrollState(r3)
            r0.setScrollingCacheEnabled(r3)
            android.view.ViewParent r10 = r0.getParent()
            if (r10 == 0) goto Le5
            r10.requestDisallowInterceptTouchEvent(r3)
        Le5:
            boolean r4 = r0.mIsBeingDragged
            if (r4 == 0) goto Lfc
            int r4 = r0.mActivePointerId
            int r4 = r1.findPointerIndex(r4)
            float r6 = r1.getX(r4)
            boolean r7 = r0.performDrag(r6)
            r5 = r5 | r7
            r16 = r2
            goto L177
        Lfc:
            r16 = r2
            goto L177
        L100:
            boolean r4 = r0.mIsBeingDragged
            if (r4 == 0) goto L151
            android.view.VelocityTracker r4 = r0.mVelocityTracker
            int r6 = r0.mMaximumVelocity
            float r6 = (float) r6
            r7 = 1000(0x3e8, float:1.401E-42)
            r4.computeCurrentVelocity(r7, r6)
            int r6 = r0.mActivePointerId
            float r6 = r4.getXVelocity(r6)
            int r6 = (int) r6
            r0.mPopulatePending = r3
            int r7 = r0.getClientWidth()
            int r8 = r0.getScrollX()
            androidx.viewpager.widget.ViewPager$ItemInfo r9 = r0.infoForCurrentScrollPosition()
            int r10 = r0.mPageMargin
            float r10 = (float) r10
            float r11 = (float) r7
            float r10 = r10 / r11
            int r11 = r9.position
            float r12 = (float) r8
            float r13 = (float) r7
            float r12 = r12 / r13
            float r13 = r9.offset
            float r12 = r12 - r13
            float r13 = r9.widthFactor
            float r13 = r13 + r10
            float r12 = r12 / r13
            int r13 = r0.mActivePointerId
            int r13 = r1.findPointerIndex(r13)
            float r14 = r1.getX(r13)
            float r15 = r0.mInitialMotionX
            float r15 = r14 - r15
            int r15 = (int) r15
            r16 = r2
            int r2 = r0.determineTargetPage(r11, r12, r6, r15)
            r0.setCurrentItemInternal(r2, r3, r3, r6)
            boolean r5 = r0.resetTouch()
            goto L177
        L151:
            r16 = r2
            goto L177
        L154:
            r16 = r2
            android.widget.Scroller r2 = r0.mScroller
            r2.abortAnimation()
            r0.mPopulatePending = r4
            r0.populate()
            float r2 = r1.getX()
            r0.mInitialMotionX = r2
            r0.mLastMotionX = r2
            float r2 = r1.getY()
            r0.mInitialMotionY = r2
            r0.mLastMotionY = r2
            int r2 = r1.getPointerId(r4)
            r0.mActivePointerId = r2
        L177:
            if (r5 == 0) goto L17c
            androidx.core.view.ViewCompat.postInvalidateOnAnimation(r0)
        L17c:
            return r3
        L17d:
            return r4
    }

    boolean pageLeft() {
            r2 = this;
            int r0 = r2.mCurItem
            if (r0 <= 0) goto Lc
            int r0 = r2.mCurItem
            r1 = 1
            int r0 = r0 - r1
            r2.setCurrentItem(r0, r1)
            return r1
        Lc:
            r0 = 0
            return r0
    }

    boolean pageRight() {
            r3 = this;
            androidx.viewpager.widget.PagerAdapter r0 = r3.mAdapter
            if (r0 == 0) goto L17
            int r0 = r3.mCurItem
            androidx.viewpager.widget.PagerAdapter r1 = r3.mAdapter
            int r1 = r1.getCount()
            r2 = 1
            int r1 = r1 - r2
            if (r0 >= r1) goto L17
            int r0 = r3.mCurItem
            int r0 = r0 + r2
            r3.setCurrentItem(r0, r2)
            return r2
        L17:
            r0 = 0
            return r0
    }

    void populate() {
            r1 = this;
            int r0 = r1.mCurItem
            r1.populate(r0)
            return
    }

    void populate(int r20) {
            r19 = this;
            r1 = r19
            r2 = r20
            r0 = 0
            int r3 = r1.mCurItem
            if (r3 == r2) goto L13
            int r3 = r1.mCurItem
            androidx.viewpager.widget.ViewPager$ItemInfo r0 = r1.infoForPosition(r3)
            r1.mCurItem = r2
            r3 = r0
            goto L14
        L13:
            r3 = r0
        L14:
            androidx.viewpager.widget.PagerAdapter r0 = r1.mAdapter
            if (r0 != 0) goto L1c
            r1.sortChildDrawingOrder()
            return
        L1c:
            boolean r0 = r1.mPopulatePending
            if (r0 == 0) goto L24
            r1.sortChildDrawingOrder()
            return
        L24:
            android.os.IBinder r0 = r1.getWindowToken()
            if (r0 != 0) goto L2b
            return
        L2b:
            androidx.viewpager.widget.PagerAdapter r0 = r1.mAdapter
            r0.startUpdate(r1)
            int r4 = r1.mOffscreenPageLimit
            int r0 = r1.mCurItem
            int r0 = r0 - r4
            r5 = 0
            int r5 = java.lang.Math.max(r5, r0)
            androidx.viewpager.widget.PagerAdapter r0 = r1.mAdapter
            int r6 = r0.getCount()
            int r0 = r6 + (-1)
            int r7 = r1.mCurItem
            int r7 = r7 + r4
            int r7 = java.lang.Math.min(r0, r7)
            int r0 = r1.mExpectedAdapterCount
            if (r6 != r0) goto L25a
            r0 = -1
            r8 = 0
            r0 = 0
        L50:
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$ItemInfo> r9 = r1.mItems
            int r9 = r9.size()
            if (r0 >= r9) goto L71
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$ItemInfo> r9 = r1.mItems
            java.lang.Object r9 = r9.get(r0)
            androidx.viewpager.widget.ViewPager$ItemInfo r9 = (androidx.viewpager.widget.ViewPager.ItemInfo) r9
            int r10 = r9.position
            int r11 = r1.mCurItem
            if (r10 < r11) goto L6e
            int r10 = r9.position
            int r11 = r1.mCurItem
            if (r10 != r11) goto L71
            r8 = r9
            goto L71
        L6e:
            int r0 = r0 + 1
            goto L50
        L71:
            if (r8 != 0) goto L7b
            if (r6 <= 0) goto L7b
            int r9 = r1.mCurItem
            androidx.viewpager.widget.ViewPager$ItemInfo r8 = r1.addNewItem(r9, r0)
        L7b:
            if (r8 == 0) goto L1e3
            r11 = 0
            int r12 = r0 + (-1)
            if (r12 < 0) goto L8b
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$ItemInfo> r13 = r1.mItems
            java.lang.Object r13 = r13.get(r12)
            androidx.viewpager.widget.ViewPager$ItemInfo r13 = (androidx.viewpager.widget.ViewPager.ItemInfo) r13
            goto L8c
        L8b:
            r13 = 0
        L8c:
            int r14 = r1.getClientWidth()
            r15 = 1073741824(0x40000000, float:2.0)
            if (r14 > 0) goto L9a
            r17 = r15
            r9 = 0
            r16 = 0
            goto Laa
        L9a:
            r16 = 0
            float r9 = r8.widthFactor
            float r9 = r15 - r9
            int r10 = r1.getPaddingLeft()
            float r10 = (float) r10
            r17 = r15
            float r15 = (float) r14
            float r10 = r10 / r15
            float r9 = r9 + r10
        Laa:
            int r10 = r1.mCurItem
            int r10 = r10 + (-1)
        Laf:
            if (r10 < 0) goto L115
            int r15 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r15 < 0) goto Le0
            if (r10 >= r5) goto Le0
            if (r13 != 0) goto Lba
            goto L115
        Lba:
            int r15 = r13.position
            if (r10 != r15) goto L110
            boolean r15 = r13.scrolling
            if (r15 != 0) goto L110
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$ItemInfo> r15 = r1.mItems
            r15.remove(r12)
            androidx.viewpager.widget.PagerAdapter r15 = r1.mAdapter
            java.lang.Object r2 = r13.object
            r15.destroyItem(r1, r10, r2)
            int r12 = r12 + (-1)
            int r0 = r0 + (-1)
            if (r12 < 0) goto Ldd
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$ItemInfo> r2 = r1.mItems
            java.lang.Object r2 = r2.get(r12)
            androidx.viewpager.widget.ViewPager$ItemInfo r2 = (androidx.viewpager.widget.ViewPager.ItemInfo) r2
            goto Lde
        Ldd:
            r2 = 0
        Lde:
            r13 = r2
            goto L110
        Le0:
            if (r13 == 0) goto Lf9
            int r2 = r13.position
            if (r10 != r2) goto Lf9
            float r2 = r13.widthFactor
            float r11 = r11 + r2
            int r12 = r12 + (-1)
            if (r12 < 0) goto Lf6
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$ItemInfo> r2 = r1.mItems
            java.lang.Object r2 = r2.get(r12)
            androidx.viewpager.widget.ViewPager$ItemInfo r2 = (androidx.viewpager.widget.ViewPager.ItemInfo) r2
            goto Lf7
        Lf6:
            r2 = 0
        Lf7:
            r13 = r2
            goto L110
        Lf9:
            int r2 = r12 + 1
            androidx.viewpager.widget.ViewPager$ItemInfo r2 = r1.addNewItem(r10, r2)
            float r13 = r2.widthFactor
            float r11 = r11 + r13
            int r0 = r0 + 1
            if (r12 < 0) goto L10f
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$ItemInfo> r13 = r1.mItems
            java.lang.Object r13 = r13.get(r12)
            androidx.viewpager.widget.ViewPager$ItemInfo r13 = (androidx.viewpager.widget.ViewPager.ItemInfo) r13
            goto L110
        L10f:
            r13 = 0
        L110:
            int r10 = r10 + (-1)
            r2 = r20
            goto Laf
        L115:
            float r2 = r8.widthFactor
            int r10 = r0 + 1
            int r12 = (r2 > r17 ? 1 : (r2 == r17 ? 0 : -1))
            if (r12 >= 0) goto L1d4
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$ItemInfo> r12 = r1.mItems
            int r12 = r12.size()
            if (r10 >= r12) goto L12e
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$ItemInfo> r12 = r1.mItems
            java.lang.Object r12 = r12.get(r10)
            androidx.viewpager.widget.ViewPager$ItemInfo r12 = (androidx.viewpager.widget.ViewPager.ItemInfo) r12
            goto L12f
        L12e:
            r12 = 0
        L12f:
            if (r14 > 0) goto L134
            r13 = r16
            goto L13d
        L134:
            int r13 = r1.getPaddingRight()
            float r13 = (float) r13
            float r15 = (float) r14
            float r13 = r13 / r15
            float r13 = r13 + r17
        L13d:
            int r15 = r1.mCurItem
            int r15 = r15 + 1
        L142:
            if (r15 >= r6) goto L1cc
            int r17 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r17 < 0) goto L185
            if (r15 <= r7) goto L185
            if (r12 != 0) goto L152
            r17 = r2
            r18 = r4
            goto L1d0
        L152:
            r17 = r2
            int r2 = r12.position
            if (r15 != r2) goto L180
            boolean r2 = r12.scrolling
            if (r2 != 0) goto L180
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$ItemInfo> r2 = r1.mItems
            r2.remove(r10)
            androidx.viewpager.widget.PagerAdapter r2 = r1.mAdapter
            r18 = r4
            java.lang.Object r4 = r12.object
            r2.destroyItem(r1, r15, r4)
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$ItemInfo> r2 = r1.mItems
            int r2 = r2.size()
            if (r10 >= r2) goto L17b
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$ItemInfo> r2 = r1.mItems
            java.lang.Object r2 = r2.get(r10)
            androidx.viewpager.widget.ViewPager$ItemInfo r2 = (androidx.viewpager.widget.ViewPager.ItemInfo) r2
            goto L17c
        L17b:
            r2 = 0
        L17c:
            r12 = r2
            r2 = r17
            goto L1c6
        L180:
            r18 = r4
            r2 = r17
            goto L1c6
        L185:
            r17 = r2
            r18 = r4
            if (r12 == 0) goto L1a9
            int r2 = r12.position
            if (r15 != r2) goto L1a9
            float r2 = r12.widthFactor
            float r2 = r17 + r2
            int r10 = r10 + 1
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$ItemInfo> r4 = r1.mItems
            int r4 = r4.size()
            if (r10 >= r4) goto L1a6
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$ItemInfo> r4 = r1.mItems
            java.lang.Object r4 = r4.get(r10)
            androidx.viewpager.widget.ViewPager$ItemInfo r4 = (androidx.viewpager.widget.ViewPager.ItemInfo) r4
            goto L1a7
        L1a6:
            r4 = 0
        L1a7:
            r12 = r4
            goto L1c6
        L1a9:
            androidx.viewpager.widget.ViewPager$ItemInfo r2 = r1.addNewItem(r15, r10)
            int r10 = r10 + 1
            float r4 = r2.widthFactor
            float r4 = r17 + r4
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$ItemInfo> r12 = r1.mItems
            int r12 = r12.size()
            if (r10 >= r12) goto L1c4
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$ItemInfo> r12 = r1.mItems
            java.lang.Object r12 = r12.get(r10)
            androidx.viewpager.widget.ViewPager$ItemInfo r12 = (androidx.viewpager.widget.ViewPager.ItemInfo) r12
            goto L1c5
        L1c4:
            r12 = 0
        L1c5:
            r2 = r4
        L1c6:
            int r15 = r15 + 1
            r4 = r18
            goto L142
        L1cc:
            r17 = r2
            r18 = r4
        L1d0:
            r13 = r12
            r2 = r17
            goto L1d6
        L1d4:
            r18 = r4
        L1d6:
            r1.calculatePageOffsets(r8, r0, r3)
            androidx.viewpager.widget.PagerAdapter r4 = r1.mAdapter
            int r12 = r1.mCurItem
            java.lang.Object r15 = r8.object
            r4.setPrimaryItem(r1, r12, r15)
            goto L1e7
        L1e3:
            r18 = r4
            r16 = 0
        L1e7:
            androidx.viewpager.widget.PagerAdapter r2 = r1.mAdapter
            r2.finishUpdate(r1)
            int r2 = r1.getChildCount()
            r4 = 0
        L1f1:
            if (r4 >= r2) goto L21a
            android.view.View r9 = r1.getChildAt(r4)
            android.view.ViewGroup$LayoutParams r10 = r9.getLayoutParams()
            androidx.viewpager.widget.ViewPager$LayoutParams r10 = (androidx.viewpager.widget.ViewPager.LayoutParams) r10
            r10.childIndex = r4
            boolean r11 = r10.isDecor
            if (r11 != 0) goto L217
            float r11 = r10.widthFactor
            int r11 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1))
            if (r11 != 0) goto L217
            androidx.viewpager.widget.ViewPager$ItemInfo r11 = r1.infoForChild(r9)
            if (r11 == 0) goto L217
            float r12 = r11.widthFactor
            r10.widthFactor = r12
            int r12 = r11.position
            r10.position = r12
        L217:
            int r4 = r4 + 1
            goto L1f1
        L21a:
            r1.sortChildDrawingOrder()
            boolean r4 = r1.hasFocus()
            if (r4 == 0) goto L259
            android.view.View r4 = r1.findFocus()
            if (r4 == 0) goto L22e
            androidx.viewpager.widget.ViewPager$ItemInfo r10 = r1.infoForAnyChild(r4)
            goto L22f
        L22e:
            r10 = 0
        L22f:
            if (r10 == 0) goto L237
            int r9 = r10.position
            int r11 = r1.mCurItem
            if (r9 == r11) goto L259
        L237:
            r9 = 0
        L238:
            int r11 = r1.getChildCount()
            if (r9 >= r11) goto L259
            android.view.View r11 = r1.getChildAt(r9)
            androidx.viewpager.widget.ViewPager$ItemInfo r10 = r1.infoForChild(r11)
            if (r10 == 0) goto L256
            int r12 = r10.position
            int r13 = r1.mCurItem
            if (r12 != r13) goto L256
            r12 = 2
            boolean r12 = r11.requestFocus(r12)
            if (r12 == 0) goto L256
            goto L259
        L256:
            int r9 = r9 + 1
            goto L238
        L259:
            return
        L25a:
            r18 = r4
            android.content.res.Resources r0 = r1.getResources()     // Catch: android.content.res.Resources.NotFoundException -> L269
            int r2 = r1.getId()     // Catch: android.content.res.Resources.NotFoundException -> L269
            java.lang.String r0 = r0.getResourceName(r2)     // Catch: android.content.res.Resources.NotFoundException -> L269
            goto L273
        L269:
            r0 = move-exception
            int r2 = r1.getId()
            java.lang.String r2 = java.lang.Integer.toHexString(r2)
            r0 = r2
        L273:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r8 = "The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: "
            java.lang.StringBuilder r4 = r4.append(r8)
            int r8 = r1.mExpectedAdapterCount
            java.lang.StringBuilder r4 = r4.append(r8)
            java.lang.String r8 = ", found: "
            java.lang.StringBuilder r4 = r4.append(r8)
            java.lang.StringBuilder r4 = r4.append(r6)
            java.lang.String r8 = " Pager id: "
            java.lang.StringBuilder r4 = r4.append(r8)
            java.lang.StringBuilder r4 = r4.append(r0)
            java.lang.String r8 = " Pager class: "
            java.lang.StringBuilder r4 = r4.append(r8)
            java.lang.Class r8 = r1.getClass()
            java.lang.StringBuilder r4 = r4.append(r8)
            java.lang.String r8 = " Problematic adapter: "
            java.lang.StringBuilder r4 = r4.append(r8)
            androidx.viewpager.widget.PagerAdapter r8 = r1.mAdapter
            java.lang.Class r8 = r8.getClass()
            java.lang.StringBuilder r4 = r4.append(r8)
            java.lang.String r4 = r4.toString()
            r2.<init>(r4)
            throw r2
    }

    public void removeOnAdapterChangeListener(androidx.viewpager.widget.ViewPager.OnAdapterChangeListener r2) {
            r1 = this;
            java.util.List<androidx.viewpager.widget.ViewPager$OnAdapterChangeListener> r0 = r1.mAdapterChangeListeners
            if (r0 == 0) goto L9
            java.util.List<androidx.viewpager.widget.ViewPager$OnAdapterChangeListener> r0 = r1.mAdapterChangeListeners
            r0.remove(r2)
        L9:
            return
    }

    public void removeOnPageChangeListener(androidx.viewpager.widget.ViewPager.OnPageChangeListener r2) {
            r1 = this;
            java.util.List<androidx.viewpager.widget.ViewPager$OnPageChangeListener> r0 = r1.mOnPageChangeListeners
            if (r0 == 0) goto L9
            java.util.List<androidx.viewpager.widget.ViewPager$OnPageChangeListener> r0 = r1.mOnPageChangeListeners
            r0.remove(r2)
        L9:
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(android.view.View r2) {
            r1 = this;
            boolean r0 = r1.mInLayout
            if (r0 == 0) goto L8
            r1.removeViewInLayout(r2)
            goto Lb
        L8:
            super.removeView(r2)
        Lb:
            return
    }

    public void setAdapter(androidx.viewpager.widget.PagerAdapter r9) {
            r8 = this;
            androidx.viewpager.widget.PagerAdapter r0 = r8.mAdapter
            r1 = 0
            r2 = 0
            if (r0 == 0) goto L3f
            androidx.viewpager.widget.PagerAdapter r0 = r8.mAdapter
            r0.setViewPagerObserver(r1)
            androidx.viewpager.widget.PagerAdapter r0 = r8.mAdapter
            r0.startUpdate(r8)
            r0 = 0
        L11:
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$ItemInfo> r3 = r8.mItems
            int r3 = r3.size()
            if (r0 >= r3) goto L2d
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$ItemInfo> r3 = r8.mItems
            java.lang.Object r3 = r3.get(r0)
            androidx.viewpager.widget.ViewPager$ItemInfo r3 = (androidx.viewpager.widget.ViewPager.ItemInfo) r3
            androidx.viewpager.widget.PagerAdapter r4 = r8.mAdapter
            int r5 = r3.position
            java.lang.Object r6 = r3.object
            r4.destroyItem(r8, r5, r6)
            int r0 = r0 + 1
            goto L11
        L2d:
            androidx.viewpager.widget.PagerAdapter r0 = r8.mAdapter
            r0.finishUpdate(r8)
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$ItemInfo> r0 = r8.mItems
            r0.clear()
            r8.removeNonDecorViews()
            r8.mCurItem = r2
            r8.scrollTo(r2, r2)
        L3f:
            androidx.viewpager.widget.PagerAdapter r0 = r8.mAdapter
            r8.mAdapter = r9
            r8.mExpectedAdapterCount = r2
            androidx.viewpager.widget.PagerAdapter r3 = r8.mAdapter
            if (r3 == 0) goto L8d
            androidx.viewpager.widget.ViewPager$PagerObserver r3 = r8.mObserver
            if (r3 != 0) goto L54
            androidx.viewpager.widget.ViewPager$PagerObserver r3 = new androidx.viewpager.widget.ViewPager$PagerObserver
            r3.<init>(r8)
            r8.mObserver = r3
        L54:
            androidx.viewpager.widget.PagerAdapter r3 = r8.mAdapter
            androidx.viewpager.widget.ViewPager$PagerObserver r4 = r8.mObserver
            r3.setViewPagerObserver(r4)
            r8.mPopulatePending = r2
            boolean r3 = r8.mFirstLayout
            r4 = 1
            r8.mFirstLayout = r4
            androidx.viewpager.widget.PagerAdapter r5 = r8.mAdapter
            int r5 = r5.getCount()
            r8.mExpectedAdapterCount = r5
            int r5 = r8.mRestoredCurItem
            if (r5 < 0) goto L84
            androidx.viewpager.widget.PagerAdapter r5 = r8.mAdapter
            android.os.Parcelable r6 = r8.mRestoredAdapterState
            java.lang.ClassLoader r7 = r8.mRestoredClassLoader
            r5.restoreState(r6, r7)
            int r5 = r8.mRestoredCurItem
            r8.setCurrentItemInternal(r5, r2, r4)
            r2 = -1
            r8.mRestoredCurItem = r2
            r8.mRestoredAdapterState = r1
            r8.mRestoredClassLoader = r1
            goto L8d
        L84:
            if (r3 != 0) goto L8a
            r8.populate()
            goto L8d
        L8a:
            r8.requestLayout()
        L8d:
            java.util.List<androidx.viewpager.widget.ViewPager$OnAdapterChangeListener> r1 = r8.mAdapterChangeListeners
            if (r1 == 0) goto Lb0
            java.util.List<androidx.viewpager.widget.ViewPager$OnAdapterChangeListener> r1 = r8.mAdapterChangeListeners
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto Lb0
            r1 = 0
            java.util.List<androidx.viewpager.widget.ViewPager$OnAdapterChangeListener> r2 = r8.mAdapterChangeListeners
            int r2 = r2.size()
        La0:
            if (r1 >= r2) goto Lb0
            java.util.List<androidx.viewpager.widget.ViewPager$OnAdapterChangeListener> r3 = r8.mAdapterChangeListeners
            java.lang.Object r3 = r3.get(r1)
            androidx.viewpager.widget.ViewPager$OnAdapterChangeListener r3 = (androidx.viewpager.widget.ViewPager.OnAdapterChangeListener) r3
            r3.onAdapterChanged(r8, r0, r9)
            int r1 = r1 + 1
            goto La0
        Lb0:
            return
    }

    public void setCurrentItem(int r3) {
            r2 = this;
            r0 = 0
            r2.mPopulatePending = r0
            boolean r1 = r2.mFirstLayout
            r1 = r1 ^ 1
            r2.setCurrentItemInternal(r3, r1, r0)
            return
    }

    public void setCurrentItem(int r2, boolean r3) {
            r1 = this;
            r0 = 0
            r1.mPopulatePending = r0
            r1.setCurrentItemInternal(r2, r3, r0)
            return
    }

    void setCurrentItemInternal(int r2, boolean r3, boolean r4) {
            r1 = this;
            r0 = 0
            r1.setCurrentItemInternal(r2, r3, r4, r0)
            return
    }

    void setCurrentItemInternal(int r6, boolean r7, boolean r8, int r9) {
            r5 = this;
            androidx.viewpager.widget.PagerAdapter r0 = r5.mAdapter
            r1 = 0
            if (r0 == 0) goto L72
            androidx.viewpager.widget.PagerAdapter r0 = r5.mAdapter
            int r0 = r0.getCount()
            if (r0 > 0) goto Le
            goto L72
        Le:
            if (r8 != 0) goto L20
            int r0 = r5.mCurItem
            if (r0 != r6) goto L20
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$ItemInfo> r0 = r5.mItems
            int r0 = r0.size()
            if (r0 == 0) goto L20
            r5.setScrollingCacheEnabled(r1)
            return
        L20:
            r0 = 1
            if (r6 >= 0) goto L25
            r6 = 0
            goto L35
        L25:
            androidx.viewpager.widget.PagerAdapter r2 = r5.mAdapter
            int r2 = r2.getCount()
            if (r6 < r2) goto L35
            androidx.viewpager.widget.PagerAdapter r2 = r5.mAdapter
            int r2 = r2.getCount()
            int r6 = r2 + (-1)
        L35:
            int r2 = r5.mOffscreenPageLimit
            int r3 = r5.mCurItem
            int r3 = r3 + r2
            if (r6 > r3) goto L41
            int r3 = r5.mCurItem
            int r3 = r3 - r2
            if (r6 >= r3) goto L57
        L41:
            r3 = 0
        L42:
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$ItemInfo> r4 = r5.mItems
            int r4 = r4.size()
            if (r3 >= r4) goto L57
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$ItemInfo> r4 = r5.mItems
            java.lang.Object r4 = r4.get(r3)
            androidx.viewpager.widget.ViewPager$ItemInfo r4 = (androidx.viewpager.widget.ViewPager.ItemInfo) r4
            r4.scrolling = r0
            int r3 = r3 + 1
            goto L42
        L57:
            int r3 = r5.mCurItem
            if (r3 == r6) goto L5c
            r1 = r0
        L5c:
            boolean r0 = r5.mFirstLayout
            if (r0 == 0) goto L6b
            r5.mCurItem = r6
            if (r1 == 0) goto L67
            r5.dispatchOnPageSelected(r6)
        L67:
            r5.requestLayout()
            goto L71
        L6b:
            r5.populate(r6)
            r5.scrollToItem(r6, r7, r9, r1)
        L71:
            return
        L72:
            r5.setScrollingCacheEnabled(r1)
            return
    }

    androidx.viewpager.widget.ViewPager.OnPageChangeListener setInternalPageChangeListener(androidx.viewpager.widget.ViewPager.OnPageChangeListener r2) {
            r1 = this;
            androidx.viewpager.widget.ViewPager$OnPageChangeListener r0 = r1.mInternalPageChangeListener
            r1.mInternalPageChangeListener = r2
            return r0
    }

    public void setOffscreenPageLimit(int r4) {
            r3 = this;
            r0 = 1
            if (r4 >= r0) goto L26
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Requested offscreen page limit "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r4)
            java.lang.String r2 = " too small; defaulting to "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "ViewPager"
            android.util.Log.w(r1, r0)
            r4 = 1
        L26:
            int r0 = r3.mOffscreenPageLimit
            if (r4 == r0) goto L2f
            r3.mOffscreenPageLimit = r4
            r3.populate()
        L2f:
            return
    }

    @java.lang.Deprecated
    public void setOnPageChangeListener(androidx.viewpager.widget.ViewPager.OnPageChangeListener r1) {
            r0 = this;
            r0.mOnPageChangeListener = r1
            return
    }

    public void setPageMargin(int r3) {
            r2 = this;
            int r0 = r2.mPageMargin
            r2.mPageMargin = r3
            int r1 = r2.getWidth()
            r2.recomputeScrollPosition(r1, r1, r3, r0)
            r2.requestLayout()
            return
    }

    public void setPageMarginDrawable(int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            android.graphics.drawable.Drawable r0 = androidx.core.content.ContextCompat.getDrawable(r0, r2)
            r1.setPageMarginDrawable(r0)
            return
    }

    public void setPageMarginDrawable(android.graphics.drawable.Drawable r2) {
            r1 = this;
            r1.mMarginDrawable = r2
            if (r2 == 0) goto L7
            r1.refreshDrawableState()
        L7:
            if (r2 != 0) goto Lb
            r0 = 1
            goto Lc
        Lb:
            r0 = 0
        Lc:
            r1.setWillNotDraw(r0)
            r1.invalidate()
            return
    }

    public void setPageTransformer(boolean r2, androidx.viewpager.widget.ViewPager.PageTransformer r3) {
            r1 = this;
            r0 = 2
            r1.setPageTransformer(r2, r3, r0)
            return
    }

    public void setPageTransformer(boolean r5, androidx.viewpager.widget.ViewPager.PageTransformer r6, int r7) {
            r4 = this;
            r0 = 1
            r1 = 0
            if (r6 == 0) goto L6
            r2 = r0
            goto L7
        L6:
            r2 = r1
        L7:
            androidx.viewpager.widget.ViewPager$PageTransformer r3 = r4.mPageTransformer
            if (r3 == 0) goto Ld
            r3 = r0
            goto Le
        Ld:
            r3 = r1
        Le:
            if (r2 == r3) goto L12
            r3 = r0
            goto L13
        L12:
            r3 = r1
        L13:
            r4.mPageTransformer = r6
            r4.setChildrenDrawingOrderEnabled(r2)
            if (r2 == 0) goto L22
            if (r5 == 0) goto L1d
            r0 = 2
        L1d:
            r4.mDrawingOrder = r0
            r4.mPageTransformerLayerType = r7
            goto L24
        L22:
            r4.mDrawingOrder = r1
        L24:
            if (r3 == 0) goto L29
            r4.populate()
        L29:
            return
    }

    void setScrollState(int r2) {
            r1 = this;
            int r0 = r1.mScrollState
            if (r0 != r2) goto L5
            return
        L5:
            r1.mScrollState = r2
            androidx.viewpager.widget.ViewPager$PageTransformer r0 = r1.mPageTransformer
            if (r0 == 0) goto L13
            if (r2 == 0) goto Lf
            r0 = 1
            goto L10
        Lf:
            r0 = 0
        L10:
            r1.enableLayers(r0)
        L13:
            r1.dispatchOnScrollStateChanged(r2)
            return
    }

    void smoothScrollTo(int r2, int r3) {
            r1 = this;
            r0 = 0
            r1.smoothScrollTo(r2, r3, r0)
            return
    }

    void smoothScrollTo(int r17, int r18, int r19) {
            r16 = this;
            r0 = r16
            int r1 = r0.getChildCount()
            r2 = 0
            if (r1 != 0) goto Ld
            r0.setScrollingCacheEnabled(r2)
            return
        Ld:
            android.widget.Scroller r1 = r0.mScroller
            r3 = 1
            if (r1 == 0) goto L1c
            android.widget.Scroller r1 = r0.mScroller
            boolean r1 = r1.isFinished()
            if (r1 != 0) goto L1c
            r1 = r3
            goto L1d
        L1c:
            r1 = r2
        L1d:
            if (r1 == 0) goto L3a
            boolean r4 = r0.mIsScrollStarted
            if (r4 == 0) goto L2a
            android.widget.Scroller r4 = r0.mScroller
            int r4 = r4.getCurrX()
            goto L30
        L2a:
            android.widget.Scroller r4 = r0.mScroller
            int r4 = r4.getStartX()
        L30:
            android.widget.Scroller r5 = r0.mScroller
            r5.abortAnimation()
            r0.setScrollingCacheEnabled(r2)
            r6 = r4
            goto L3f
        L3a:
            int r4 = r0.getScrollX()
            r6 = r4
        L3f:
            int r7 = r0.getScrollY()
            int r8 = r17 - r6
            int r9 = r18 - r7
            if (r8 != 0) goto L55
            if (r9 != 0) goto L55
            r0.completeScroll(r2)
            r0.populate()
            r0.setScrollState(r2)
            return
        L55:
            r0.setScrollingCacheEnabled(r3)
            r3 = 2
            r0.setScrollState(r3)
            int r3 = r0.getClientWidth()
            int r4 = r3 / 2
            int r5 = java.lang.Math.abs(r8)
            float r5 = (float) r5
            r10 = 1065353216(0x3f800000, float:1.0)
            float r5 = r5 * r10
            float r11 = (float) r3
            float r5 = r5 / r11
            float r11 = java.lang.Math.min(r10, r5)
            float r5 = (float) r4
            float r12 = (float) r4
            float r13 = r0.distanceInfluenceForSnapDuration(r11)
            float r12 = r12 * r13
            float r12 = r12 + r5
            int r13 = java.lang.Math.abs(r19)
            if (r13 <= 0) goto L8f
            float r5 = (float) r13
            float r5 = r12 / r5
            float r5 = java.lang.Math.abs(r5)
            r10 = 1148846080(0x447a0000, float:1000.0)
            float r5 = r5 * r10
            int r5 = java.lang.Math.round(r5)
            int r5 = r5 * 4
            goto La9
        L8f:
            float r5 = (float) r3
            androidx.viewpager.widget.PagerAdapter r14 = r0.mAdapter
            int r15 = r0.mCurItem
            float r14 = r14.getPageWidth(r15)
            float r5 = r5 * r14
            int r14 = java.lang.Math.abs(r8)
            float r14 = (float) r14
            int r15 = r0.mPageMargin
            float r15 = (float) r15
            float r15 = r15 + r5
            float r14 = r14 / r15
            float r10 = r10 + r14
            r15 = 1120403456(0x42c80000, float:100.0)
            float r10 = r10 * r15
            int r10 = (int) r10
            r5 = r10
        La9:
            r10 = 600(0x258, float:8.41E-43)
            int r10 = java.lang.Math.min(r5, r10)
            r0.mIsScrollStarted = r2
            android.widget.Scroller r5 = r0.mScroller
            r5.startScroll(r6, r7, r8, r9, r10)
            androidx.core.view.ViewCompat.postInvalidateOnAnimation(r0)
            return
    }

    @Override // android.view.View
    protected boolean verifyDrawable(android.graphics.drawable.Drawable r2) {
            r1 = this;
            boolean r0 = super.verifyDrawable(r2)
            if (r0 != 0) goto Ld
            android.graphics.drawable.Drawable r0 = r1.mMarginDrawable
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
