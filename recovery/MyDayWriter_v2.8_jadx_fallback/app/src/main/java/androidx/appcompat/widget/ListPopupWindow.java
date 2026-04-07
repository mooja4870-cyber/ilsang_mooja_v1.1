package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
public class ListPopupWindow implements androidx.appcompat.view.menu.ShowableListMenu {
    private static final boolean DEBUG = false;
    static final int EXPAND_LIST_TIMEOUT = 250;
    public static final int INPUT_METHOD_FROM_FOCUSABLE = 0;
    public static final int INPUT_METHOD_NEEDED = 1;
    public static final int INPUT_METHOD_NOT_NEEDED = 2;
    public static final int MATCH_PARENT = -1;
    public static final int POSITION_PROMPT_ABOVE = 0;
    public static final int POSITION_PROMPT_BELOW = 1;
    private static final java.lang.String TAG = "ListPopupWindow";
    public static final int WRAP_CONTENT = -2;
    private static java.lang.reflect.Method sGetMaxAvailableHeightMethod;
    private static java.lang.reflect.Method sSetClipToWindowEnabledMethod;
    private static java.lang.reflect.Method sSetEpicenterBoundsMethod;
    private android.widget.ListAdapter mAdapter;
    private android.content.Context mContext;
    private boolean mDropDownAlwaysVisible;
    private android.view.View mDropDownAnchorView;
    private int mDropDownGravity;
    private int mDropDownHeight;
    private int mDropDownHorizontalOffset;
    androidx.appcompat.widget.DropDownListView mDropDownList;
    private android.graphics.drawable.Drawable mDropDownListHighlight;
    private int mDropDownVerticalOffset;
    private boolean mDropDownVerticalOffsetSet;
    private int mDropDownWidth;
    private int mDropDownWindowLayoutType;
    private android.graphics.Rect mEpicenterBounds;
    private boolean mForceIgnoreOutsideTouch;
    final android.os.Handler mHandler;
    private final androidx.appcompat.widget.ListPopupWindow.ListSelectorHider mHideSelector;
    private android.widget.AdapterView.OnItemClickListener mItemClickListener;
    private android.widget.AdapterView.OnItemSelectedListener mItemSelectedListener;
    int mListItemExpandMaximum;
    private boolean mModal;
    private android.database.DataSetObserver mObserver;
    private boolean mOverlapAnchor;
    private boolean mOverlapAnchorSet;
    android.widget.PopupWindow mPopup;
    private int mPromptPosition;
    private android.view.View mPromptView;
    final androidx.appcompat.widget.ListPopupWindow.ResizePopupRunnable mResizePopupRunnable;
    private final androidx.appcompat.widget.ListPopupWindow.PopupScrollListener mScrollListener;
    private java.lang.Runnable mShowDropDownRunnable;
    private final android.graphics.Rect mTempRect;
    private final androidx.appcompat.widget.ListPopupWindow.PopupTouchInterceptor mTouchInterceptor;




    static class Api24Impl {
        private Api24Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static int getMaxAvailableHeight(android.widget.PopupWindow r1, android.view.View r2, int r3, boolean r4) {
                int r0 = r1.getMaxAvailableHeight(r2, r3, r4)
                return r0
        }
    }

    static class Api29Impl {
        private Api29Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static void setEpicenterBounds(android.widget.PopupWindow r0, android.graphics.Rect r1) {
                r0.setEpicenterBounds(r1)
                return
        }

        static void setIsClippedToScreen(android.widget.PopupWindow r0, boolean r1) {
                r0.setIsClippedToScreen(r1)
                return
        }
    }

    private class ListSelectorHider implements java.lang.Runnable {
        final /* synthetic */ androidx.appcompat.widget.ListPopupWindow this$0;

        ListSelectorHider(androidx.appcompat.widget.ListPopupWindow r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r1 = this;
                androidx.appcompat.widget.ListPopupWindow r0 = r1.this$0
                r0.clearListSelection()
                return
        }
    }

    private class PopupDataSetObserver extends android.database.DataSetObserver {
        final /* synthetic */ androidx.appcompat.widget.ListPopupWindow this$0;

        PopupDataSetObserver(androidx.appcompat.widget.ListPopupWindow r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
                r1 = this;
                androidx.appcompat.widget.ListPopupWindow r0 = r1.this$0
                boolean r0 = r0.isShowing()
                if (r0 == 0) goto Ld
                androidx.appcompat.widget.ListPopupWindow r0 = r1.this$0
                r0.show()
            Ld:
                return
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
                r1 = this;
                androidx.appcompat.widget.ListPopupWindow r0 = r1.this$0
                r0.dismiss()
                return
        }
    }

    private class PopupScrollListener implements android.widget.AbsListView.OnScrollListener {
        final /* synthetic */ androidx.appcompat.widget.ListPopupWindow this$0;

        PopupScrollListener(androidx.appcompat.widget.ListPopupWindow r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(android.widget.AbsListView r1, int r2, int r3, int r4) {
                r0 = this;
                return
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(android.widget.AbsListView r3, int r4) {
                r2 = this;
                r0 = 1
                if (r4 != r0) goto L27
                androidx.appcompat.widget.ListPopupWindow r0 = r2.this$0
                boolean r0 = r0.isInputMethodNotNeeded()
                if (r0 != 0) goto L27
                androidx.appcompat.widget.ListPopupWindow r0 = r2.this$0
                android.widget.PopupWindow r0 = r0.mPopup
                android.view.View r0 = r0.getContentView()
                if (r0 == 0) goto L27
                androidx.appcompat.widget.ListPopupWindow r0 = r2.this$0
                android.os.Handler r0 = r0.mHandler
                androidx.appcompat.widget.ListPopupWindow r1 = r2.this$0
                androidx.appcompat.widget.ListPopupWindow$ResizePopupRunnable r1 = r1.mResizePopupRunnable
                r0.removeCallbacks(r1)
                androidx.appcompat.widget.ListPopupWindow r0 = r2.this$0
                androidx.appcompat.widget.ListPopupWindow$ResizePopupRunnable r0 = r0.mResizePopupRunnable
                r0.run()
            L27:
                return
        }
    }

    private class PopupTouchInterceptor implements android.view.View.OnTouchListener {
        final /* synthetic */ androidx.appcompat.widget.ListPopupWindow this$0;

        PopupTouchInterceptor(androidx.appcompat.widget.ListPopupWindow r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(android.view.View r8, android.view.MotionEvent r9) {
                r7 = this;
                int r0 = r9.getAction()
                float r1 = r9.getX()
                int r1 = (int) r1
                float r2 = r9.getY()
                int r2 = (int) r2
                if (r0 != 0) goto L46
                androidx.appcompat.widget.ListPopupWindow r3 = r7.this$0
                android.widget.PopupWindow r3 = r3.mPopup
                if (r3 == 0) goto L46
                androidx.appcompat.widget.ListPopupWindow r3 = r7.this$0
                android.widget.PopupWindow r3 = r3.mPopup
                boolean r3 = r3.isShowing()
                if (r3 == 0) goto L46
                if (r1 < 0) goto L46
                androidx.appcompat.widget.ListPopupWindow r3 = r7.this$0
                android.widget.PopupWindow r3 = r3.mPopup
                int r3 = r3.getWidth()
                if (r1 >= r3) goto L46
                if (r2 < 0) goto L46
                androidx.appcompat.widget.ListPopupWindow r3 = r7.this$0
                android.widget.PopupWindow r3 = r3.mPopup
                int r3 = r3.getHeight()
                if (r2 >= r3) goto L46
                androidx.appcompat.widget.ListPopupWindow r3 = r7.this$0
                android.os.Handler r3 = r3.mHandler
                androidx.appcompat.widget.ListPopupWindow r4 = r7.this$0
                androidx.appcompat.widget.ListPopupWindow$ResizePopupRunnable r4 = r4.mResizePopupRunnable
                r5 = 250(0xfa, double:1.235E-321)
                r3.postDelayed(r4, r5)
                goto L54
            L46:
                r3 = 1
                if (r0 != r3) goto L54
                androidx.appcompat.widget.ListPopupWindow r3 = r7.this$0
                android.os.Handler r3 = r3.mHandler
                androidx.appcompat.widget.ListPopupWindow r4 = r7.this$0
                androidx.appcompat.widget.ListPopupWindow$ResizePopupRunnable r4 = r4.mResizePopupRunnable
                r3.removeCallbacks(r4)
            L54:
                r3 = 0
                return r3
        }
    }

    private class ResizePopupRunnable implements java.lang.Runnable {
        final /* synthetic */ androidx.appcompat.widget.ListPopupWindow this$0;

        ResizePopupRunnable(androidx.appcompat.widget.ListPopupWindow r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                androidx.appcompat.widget.ListPopupWindow r0 = r2.this$0
                androidx.appcompat.widget.DropDownListView r0 = r0.mDropDownList
                if (r0 == 0) goto L3d
                androidx.appcompat.widget.ListPopupWindow r0 = r2.this$0
                androidx.appcompat.widget.DropDownListView r0 = r0.mDropDownList
                boolean r0 = r0.isAttachedToWindow()
                if (r0 == 0) goto L3d
                androidx.appcompat.widget.ListPopupWindow r0 = r2.this$0
                androidx.appcompat.widget.DropDownListView r0 = r0.mDropDownList
                int r0 = r0.getCount()
                androidx.appcompat.widget.ListPopupWindow r1 = r2.this$0
                androidx.appcompat.widget.DropDownListView r1 = r1.mDropDownList
                int r1 = r1.getChildCount()
                if (r0 <= r1) goto L3d
                androidx.appcompat.widget.ListPopupWindow r0 = r2.this$0
                androidx.appcompat.widget.DropDownListView r0 = r0.mDropDownList
                int r0 = r0.getChildCount()
                androidx.appcompat.widget.ListPopupWindow r1 = r2.this$0
                int r1 = r1.mListItemExpandMaximum
                if (r0 > r1) goto L3d
                androidx.appcompat.widget.ListPopupWindow r0 = r2.this$0
                android.widget.PopupWindow r0 = r0.mPopup
                r1 = 2
                r0.setInputMethodMode(r1)
                androidx.appcompat.widget.ListPopupWindow r0 = r2.this$0
                r0.show()
            L3d:
                return
        }
    }

    static {
            java.lang.String r0 = "ListPopupWindow"
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 28
            if (r1 > r2) goto L38
            r1 = 0
            r2 = 1
            java.lang.Class<android.widget.PopupWindow> r3 = android.widget.PopupWindow.class
            java.lang.String r4 = "setClipToScreenEnabled"
            java.lang.Class[] r5 = new java.lang.Class[r2]     // Catch: java.lang.NoSuchMethodException -> L1b
            java.lang.Class r6 = java.lang.Boolean.TYPE     // Catch: java.lang.NoSuchMethodException -> L1b
            r5[r1] = r6     // Catch: java.lang.NoSuchMethodException -> L1b
            java.lang.reflect.Method r3 = r3.getDeclaredMethod(r4, r5)     // Catch: java.lang.NoSuchMethodException -> L1b
            androidx.appcompat.widget.ListPopupWindow.sSetClipToWindowEnabledMethod = r3     // Catch: java.lang.NoSuchMethodException -> L1b
            goto L21
        L1b:
            r3 = move-exception
            java.lang.String r4 = "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well."
            android.util.Log.i(r0, r4)
        L21:
            java.lang.Class<android.widget.PopupWindow> r3 = android.widget.PopupWindow.class
            java.lang.String r4 = "setEpicenterBounds"
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.NoSuchMethodException -> L32
            java.lang.Class<android.graphics.Rect> r5 = android.graphics.Rect.class
            r2[r1] = r5     // Catch: java.lang.NoSuchMethodException -> L32
            java.lang.reflect.Method r1 = r3.getDeclaredMethod(r4, r2)     // Catch: java.lang.NoSuchMethodException -> L32
            androidx.appcompat.widget.ListPopupWindow.sSetEpicenterBoundsMethod = r1     // Catch: java.lang.NoSuchMethodException -> L32
            goto L38
        L32:
            r1 = move-exception
            java.lang.String r2 = "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well."
            android.util.Log.i(r0, r2)
        L38:
            return
    }

    public ListPopupWindow(android.content.Context r3) {
            r2 = this;
            r0 = 0
            int r1 = androidx.appcompat.R.attr.listPopupWindowStyle
            r2.<init>(r3, r0, r1)
            return
    }

    public ListPopupWindow(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            int r0 = androidx.appcompat.R.attr.listPopupWindowStyle
            r1.<init>(r2, r3, r0)
            return
    }

    public ListPopupWindow(android.content.Context r2, android.util.AttributeSet r3, int r4) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r4, r0)
            return
    }

    public ListPopupWindow(android.content.Context r4, android.util.AttributeSet r5, int r6, int r7) {
            r3 = this;
            r3.<init>()
            r0 = -2
            r3.mDropDownHeight = r0
            r3.mDropDownWidth = r0
            r0 = 1002(0x3ea, float:1.404E-42)
            r3.mDropDownWindowLayoutType = r0
            r0 = 0
            r3.mDropDownGravity = r0
            r3.mDropDownAlwaysVisible = r0
            r3.mForceIgnoreOutsideTouch = r0
            r1 = 2147483647(0x7fffffff, float:NaN)
            r3.mListItemExpandMaximum = r1
            r3.mPromptPosition = r0
            androidx.appcompat.widget.ListPopupWindow$ResizePopupRunnable r1 = new androidx.appcompat.widget.ListPopupWindow$ResizePopupRunnable
            r1.<init>(r3)
            r3.mResizePopupRunnable = r1
            androidx.appcompat.widget.ListPopupWindow$PopupTouchInterceptor r1 = new androidx.appcompat.widget.ListPopupWindow$PopupTouchInterceptor
            r1.<init>(r3)
            r3.mTouchInterceptor = r1
            androidx.appcompat.widget.ListPopupWindow$PopupScrollListener r1 = new androidx.appcompat.widget.ListPopupWindow$PopupScrollListener
            r1.<init>(r3)
            r3.mScrollListener = r1
            androidx.appcompat.widget.ListPopupWindow$ListSelectorHider r1 = new androidx.appcompat.widget.ListPopupWindow$ListSelectorHider
            r1.<init>(r3)
            r3.mHideSelector = r1
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r3.mTempRect = r1
            r3.mContext = r4
            android.os.Handler r1 = new android.os.Handler
            android.os.Looper r2 = r4.getMainLooper()
            r1.<init>(r2)
            r3.mHandler = r1
            int[] r1 = androidx.appcompat.R.styleable.ListPopupWindow
            android.content.res.TypedArray r1 = r4.obtainStyledAttributes(r5, r1, r6, r7)
            int r2 = androidx.appcompat.R.styleable.ListPopupWindow_android_dropDownHorizontalOffset
            int r2 = r1.getDimensionPixelOffset(r2, r0)
            r3.mDropDownHorizontalOffset = r2
            int r2 = androidx.appcompat.R.styleable.ListPopupWindow_android_dropDownVerticalOffset
            int r0 = r1.getDimensionPixelOffset(r2, r0)
            r3.mDropDownVerticalOffset = r0
            int r0 = r3.mDropDownVerticalOffset
            r2 = 1
            if (r0 == 0) goto L67
            r3.mDropDownVerticalOffsetSet = r2
        L67:
            r1.recycle()
            androidx.appcompat.widget.AppCompatPopupWindow r0 = new androidx.appcompat.widget.AppCompatPopupWindow
            r0.<init>(r4, r5, r6, r7)
            r3.mPopup = r0
            android.widget.PopupWindow r0 = r3.mPopup
            r0.setInputMethodMode(r2)
            return
    }

    private int buildDropDown() {
            r15 = this;
            r0 = 0
            androidx.appcompat.widget.DropDownListView r1 = r15.mDropDownList
            r2 = -1
            r3 = 0
            r4 = 1
            if (r1 != 0) goto Lc8
            android.content.Context r1 = r15.mContext
            androidx.appcompat.widget.ListPopupWindow$2 r5 = new androidx.appcompat.widget.ListPopupWindow$2
            r5.<init>(r15)
            r15.mShowDropDownRunnable = r5
            boolean r5 = r15.mModal
            r5 = r5 ^ r4
            androidx.appcompat.widget.DropDownListView r5 = r15.createDropDownListView(r1, r5)
            r15.mDropDownList = r5
            android.graphics.drawable.Drawable r5 = r15.mDropDownListHighlight
            if (r5 == 0) goto L25
            androidx.appcompat.widget.DropDownListView r5 = r15.mDropDownList
            android.graphics.drawable.Drawable r6 = r15.mDropDownListHighlight
            r5.setSelector(r6)
        L25:
            androidx.appcompat.widget.DropDownListView r5 = r15.mDropDownList
            android.widget.ListAdapter r6 = r15.mAdapter
            r5.setAdapter(r6)
            androidx.appcompat.widget.DropDownListView r5 = r15.mDropDownList
            android.widget.AdapterView$OnItemClickListener r6 = r15.mItemClickListener
            r5.setOnItemClickListener(r6)
            androidx.appcompat.widget.DropDownListView r5 = r15.mDropDownList
            r5.setFocusable(r4)
            androidx.appcompat.widget.DropDownListView r5 = r15.mDropDownList
            r5.setFocusableInTouchMode(r4)
            androidx.appcompat.widget.DropDownListView r5 = r15.mDropDownList
            androidx.appcompat.widget.ListPopupWindow$3 r6 = new androidx.appcompat.widget.ListPopupWindow$3
            r6.<init>(r15)
            r5.setOnItemSelectedListener(r6)
            androidx.appcompat.widget.DropDownListView r5 = r15.mDropDownList
            androidx.appcompat.widget.ListPopupWindow$PopupScrollListener r6 = r15.mScrollListener
            r5.setOnScrollListener(r6)
            android.widget.AdapterView$OnItemSelectedListener r5 = r15.mItemSelectedListener
            if (r5 == 0) goto L59
            androidx.appcompat.widget.DropDownListView r5 = r15.mDropDownList
            android.widget.AdapterView$OnItemSelectedListener r6 = r15.mItemSelectedListener
            r5.setOnItemSelectedListener(r6)
        L59:
            androidx.appcompat.widget.DropDownListView r5 = r15.mDropDownList
            android.view.View r6 = r15.mPromptView
            if (r6 == 0) goto Lc2
            android.widget.LinearLayout r7 = new android.widget.LinearLayout
            r7.<init>(r1)
            r7.setOrientation(r4)
            android.widget.LinearLayout$LayoutParams r8 = new android.widget.LinearLayout$LayoutParams
            r9 = 1065353216(0x3f800000, float:1.0)
            r8.<init>(r2, r3, r9)
            int r9 = r15.mPromptPosition
            switch(r9) {
                case 0: goto L95;
                case 1: goto L8e;
                default: goto L73;
            }
        L73:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "Invalid hint position "
            java.lang.StringBuilder r9 = r9.append(r10)
            int r10 = r15.mPromptPosition
            java.lang.StringBuilder r9 = r9.append(r10)
            java.lang.String r9 = r9.toString()
            java.lang.String r10 = "ListPopupWindow"
            android.util.Log.e(r10, r9)
            goto L9c
        L8e:
            r7.addView(r5, r8)
            r7.addView(r6)
            goto L9c
        L95:
            r7.addView(r6)
            r7.addView(r5, r8)
        L9c:
            int r9 = r15.mDropDownWidth
            if (r9 < 0) goto La5
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
            int r10 = r15.mDropDownWidth
            goto La7
        La5:
            r9 = 0
            r10 = 0
        La7:
            int r11 = android.view.View.MeasureSpec.makeMeasureSpec(r10, r9)
            r12 = 0
            r6.measure(r11, r3)
            android.view.ViewGroup$LayoutParams r13 = r6.getLayoutParams()
            r8 = r13
            android.widget.LinearLayout$LayoutParams r8 = (android.widget.LinearLayout.LayoutParams) r8
            int r13 = r6.getMeasuredHeight()
            int r14 = r8.topMargin
            int r13 = r13 + r14
            int r14 = r8.bottomMargin
            int r13 = r13 + r14
            r5 = r7
            r0 = r13
        Lc2:
            android.widget.PopupWindow r7 = r15.mPopup
            r7.setContentView(r5)
            goto Le7
        Lc8:
            android.widget.PopupWindow r1 = r15.mPopup
            android.view.View r1 = r1.getContentView()
            r5 = r1
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            android.view.View r1 = r15.mPromptView
            if (r1 == 0) goto Le7
        Ld6:
            android.view.ViewGroup$LayoutParams r6 = r1.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r6 = (android.widget.LinearLayout.LayoutParams) r6
            int r7 = r1.getMeasuredHeight()
            int r8 = r6.topMargin
            int r7 = r7 + r8
            int r8 = r6.bottomMargin
            int r0 = r7 + r8
        Le7:
            android.widget.PopupWindow r1 = r15.mPopup
            android.graphics.drawable.Drawable r1 = r1.getBackground()
            if (r1 == 0) goto L109
            android.graphics.Rect r6 = r15.mTempRect
            r1.getPadding(r6)
            android.graphics.Rect r6 = r15.mTempRect
            int r6 = r6.top
            android.graphics.Rect r7 = r15.mTempRect
            int r7 = r7.bottom
            int r6 = r6 + r7
            boolean r7 = r15.mDropDownVerticalOffsetSet
            if (r7 != 0) goto L10f
            android.graphics.Rect r7 = r15.mTempRect
            int r7 = r7.top
            int r7 = -r7
            r15.mDropDownVerticalOffset = r7
            goto L10f
        L109:
            android.graphics.Rect r6 = r15.mTempRect
            r6.setEmpty()
            r6 = 0
        L10f:
            android.widget.PopupWindow r7 = r15.mPopup
            int r7 = r7.getInputMethodMode()
            r8 = 2
            if (r7 != r8) goto L119
            r3 = r4
        L119:
            android.view.View r4 = r15.getAnchorView()
            int r7 = r15.mDropDownVerticalOffset
            int r4 = r15.getMaxAvailableHeight(r4, r7, r3)
            boolean r7 = r15.mDropDownAlwaysVisible
            if (r7 != 0) goto L194
            int r7 = r15.mDropDownHeight
            if (r7 != r2) goto L12c
            goto L194
        L12c:
            int r2 = r15.mDropDownWidth
            r7 = 1073741824(0x40000000, float:2.0)
            switch(r2) {
                case -2: goto L157;
                case -1: goto L13b;
                default: goto L133;
            }
        L133:
            int r2 = r15.mDropDownWidth
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r7)
            r8 = r2
            goto L174
        L13b:
            android.content.Context r2 = r15.mContext
            android.content.res.Resources r2 = r2.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            int r2 = r2.widthPixels
            android.graphics.Rect r8 = r15.mTempRect
            int r8 = r8.left
            android.graphics.Rect r9 = r15.mTempRect
            int r9 = r9.right
            int r8 = r8 + r9
            int r2 = r2 - r8
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r7)
            r8 = r2
            goto L174
        L157:
            android.content.Context r2 = r15.mContext
            android.content.res.Resources r2 = r2.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            int r2 = r2.widthPixels
            android.graphics.Rect r7 = r15.mTempRect
            int r7 = r7.left
            android.graphics.Rect r8 = r15.mTempRect
            int r8 = r8.right
            int r7 = r7 + r8
            int r2 = r2 - r7
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r7)
            r8 = r2
        L174:
            androidx.appcompat.widget.DropDownListView r7 = r15.mDropDownList
            int r11 = r4 - r0
            r12 = -1
            r9 = 0
            r10 = -1
            int r2 = r7.measureHeightOfChildrenCompat(r8, r9, r10, r11, r12)
            if (r2 <= 0) goto L191
            androidx.appcompat.widget.DropDownListView r7 = r15.mDropDownList
            int r7 = r7.getPaddingTop()
            androidx.appcompat.widget.DropDownListView r9 = r15.mDropDownList
            int r9 = r9.getPaddingBottom()
            int r7 = r7 + r9
            int r9 = r6 + r7
            int r0 = r0 + r9
        L191:
            int r7 = r2 + r0
            return r7
        L194:
            int r2 = r4 + r6
            return r2
    }

    private int getMaxAvailableHeight(android.view.View r2, int r3, boolean r4) {
            r1 = this;
            android.widget.PopupWindow r0 = r1.mPopup
            int r0 = androidx.appcompat.widget.ListPopupWindow.Api24Impl.getMaxAvailableHeight(r0, r2, r3, r4)
            return r0
    }

    private static boolean isConfirmKey(int r1) {
            r0 = 66
            if (r1 == r0) goto Lb
            r0 = 23
            if (r1 != r0) goto L9
            goto Lb
        L9:
            r0 = 0
            goto Lc
        Lb:
            r0 = 1
        Lc:
            return r0
    }

    private void removePromptView() {
            r3 = this;
            android.view.View r0 = r3.mPromptView
            if (r0 == 0) goto L16
            android.view.View r0 = r3.mPromptView
            android.view.ViewParent r0 = r0.getParent()
            boolean r1 = r0 instanceof android.view.ViewGroup
            if (r1 == 0) goto L16
            r1 = r0
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            android.view.View r2 = r3.mPromptView
            r1.removeView(r2)
        L16:
            return
    }

    private void setPopupClipToScreenEnabled(boolean r4) {
            r3 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 > r1) goto L23
            java.lang.reflect.Method r0 = androidx.appcompat.widget.ListPopupWindow.sSetClipToWindowEnabledMethod
            if (r0 == 0) goto L28
            java.lang.reflect.Method r0 = androidx.appcompat.widget.ListPopupWindow.sSetClipToWindowEnabledMethod     // Catch: java.lang.Exception -> L1a
            android.widget.PopupWindow r1 = r3.mPopup     // Catch: java.lang.Exception -> L1a
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r4)     // Catch: java.lang.Exception -> L1a
            java.lang.Object[] r2 = new java.lang.Object[]{r2}     // Catch: java.lang.Exception -> L1a
            r0.invoke(r1, r2)     // Catch: java.lang.Exception -> L1a
            goto L22
        L1a:
            r0 = move-exception
            java.lang.String r1 = "ListPopupWindow"
            java.lang.String r2 = "Could not call setClipToScreenEnabled() on PopupWindow. Oh well."
            android.util.Log.i(r1, r2)
        L22:
            goto L28
        L23:
            android.widget.PopupWindow r0 = r3.mPopup
            androidx.appcompat.widget.ListPopupWindow.Api29Impl.setIsClippedToScreen(r0, r4)
        L28:
            return
    }

    public void clearListSelection() {
            r2 = this;
            androidx.appcompat.widget.DropDownListView r0 = r2.mDropDownList
            if (r0 == 0) goto Lb
            r1 = 1
            r0.setListSelectionHidden(r1)
            r0.requestLayout()
        Lb:
            return
    }

    public android.view.View.OnTouchListener createDragToOpenListener(android.view.View r2) {
            r1 = this;
            androidx.appcompat.widget.ListPopupWindow$1 r0 = new androidx.appcompat.widget.ListPopupWindow$1
            r0.<init>(r1, r2)
            return r0
    }

    androidx.appcompat.widget.DropDownListView createDropDownListView(android.content.Context r2, boolean r3) {
            r1 = this;
            androidx.appcompat.widget.DropDownListView r0 = new androidx.appcompat.widget.DropDownListView
            r0.<init>(r2, r3)
            return r0
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public void dismiss() {
            r2 = this;
            android.widget.PopupWindow r0 = r2.mPopup
            r0.dismiss()
            r2.removePromptView()
            android.widget.PopupWindow r0 = r2.mPopup
            r1 = 0
            r0.setContentView(r1)
            r2.mDropDownList = r1
            android.os.Handler r0 = r2.mHandler
            androidx.appcompat.widget.ListPopupWindow$ResizePopupRunnable r1 = r2.mResizePopupRunnable
            r0.removeCallbacks(r1)
            return
    }

    public android.view.View getAnchorView() {
            r1 = this;
            android.view.View r0 = r1.mDropDownAnchorView
            return r0
    }

    public int getAnimationStyle() {
            r1 = this;
            android.widget.PopupWindow r0 = r1.mPopup
            int r0 = r0.getAnimationStyle()
            return r0
    }

    public android.graphics.drawable.Drawable getBackground() {
            r1 = this;
            android.widget.PopupWindow r0 = r1.mPopup
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            return r0
    }

    public android.graphics.Rect getEpicenterBounds() {
            r2 = this;
            android.graphics.Rect r0 = r2.mEpicenterBounds
            if (r0 == 0) goto Lc
            android.graphics.Rect r0 = new android.graphics.Rect
            android.graphics.Rect r1 = r2.mEpicenterBounds
            r0.<init>(r1)
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    public int getHeight() {
            r1 = this;
            int r0 = r1.mDropDownHeight
            return r0
    }

    public int getHorizontalOffset() {
            r1 = this;
            int r0 = r1.mDropDownHorizontalOffset
            return r0
    }

    public int getInputMethodMode() {
            r1 = this;
            android.widget.PopupWindow r0 = r1.mPopup
            int r0 = r0.getInputMethodMode()
            return r0
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public android.widget.ListView getListView() {
            r1 = this;
            androidx.appcompat.widget.DropDownListView r0 = r1.mDropDownList
            return r0
    }

    public int getPromptPosition() {
            r1 = this;
            int r0 = r1.mPromptPosition
            return r0
    }

    public java.lang.Object getSelectedItem() {
            r1 = this;
            boolean r0 = r1.isShowing()
            if (r0 != 0) goto L8
            r0 = 0
            return r0
        L8:
            androidx.appcompat.widget.DropDownListView r0 = r1.mDropDownList
            java.lang.Object r0 = r0.getSelectedItem()
            return r0
    }

    public long getSelectedItemId() {
            r2 = this;
            boolean r0 = r2.isShowing()
            if (r0 != 0) goto L9
            r0 = -9223372036854775808
            return r0
        L9:
            androidx.appcompat.widget.DropDownListView r0 = r2.mDropDownList
            long r0 = r0.getSelectedItemId()
            return r0
    }

    public int getSelectedItemPosition() {
            r1 = this;
            boolean r0 = r1.isShowing()
            if (r0 != 0) goto L8
            r0 = -1
            return r0
        L8:
            androidx.appcompat.widget.DropDownListView r0 = r1.mDropDownList
            int r0 = r0.getSelectedItemPosition()
            return r0
    }

    public android.view.View getSelectedView() {
            r1 = this;
            boolean r0 = r1.isShowing()
            if (r0 != 0) goto L8
            r0 = 0
            return r0
        L8:
            androidx.appcompat.widget.DropDownListView r0 = r1.mDropDownList
            android.view.View r0 = r0.getSelectedView()
            return r0
    }

    public int getSoftInputMode() {
            r1 = this;
            android.widget.PopupWindow r0 = r1.mPopup
            int r0 = r0.getSoftInputMode()
            return r0
    }

    public int getVerticalOffset() {
            r1 = this;
            boolean r0 = r1.mDropDownVerticalOffsetSet
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            int r0 = r1.mDropDownVerticalOffset
            return r0
    }

    public int getWidth() {
            r1 = this;
            int r0 = r1.mDropDownWidth
            return r0
    }

    public boolean isDropDownAlwaysVisible() {
            r1 = this;
            boolean r0 = r1.mDropDownAlwaysVisible
            return r0
    }

    public boolean isInputMethodNotNeeded() {
            r2 = this;
            android.widget.PopupWindow r0 = r2.mPopup
            int r0 = r0.getInputMethodMode()
            r1 = 2
            if (r0 != r1) goto Lb
            r0 = 1
            goto Lc
        Lb:
            r0 = 0
        Lc:
            return r0
    }

    public boolean isModal() {
            r1 = this;
            boolean r0 = r1.mModal
            return r0
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public boolean isShowing() {
            r1 = this;
            android.widget.PopupWindow r0 = r1.mPopup
            boolean r0 = r0.isShowing()
            return r0
    }

    public boolean onKeyDown(int r11, android.view.KeyEvent r12) {
            r10 = this;
            boolean r0 = r10.isShowing()
            r1 = 0
            if (r0 == 0) goto L9d
            r0 = 62
            if (r11 == r0) goto L9d
            androidx.appcompat.widget.DropDownListView r0 = r10.mDropDownList
            int r0 = r0.getSelectedItemPosition()
            if (r0 >= 0) goto L19
            boolean r0 = isConfirmKey(r11)
            if (r0 != 0) goto L9d
        L19:
            androidx.appcompat.widget.DropDownListView r0 = r10.mDropDownList
            int r0 = r0.getSelectedItemPosition()
            android.widget.PopupWindow r2 = r10.mPopup
            boolean r2 = r2.isAboveAnchor()
            r3 = 1
            r2 = r2 ^ r3
            android.widget.ListAdapter r4 = r10.mAdapter
            r5 = 2147483647(0x7fffffff, float:NaN)
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r4 == 0) goto L53
            boolean r7 = r4.areAllItemsEnabled()
            if (r7 == 0) goto L38
            r8 = r1
            goto L3e
        L38:
            androidx.appcompat.widget.DropDownListView r8 = r10.mDropDownList
            int r8 = r8.lookForSelectablePosition(r1, r3)
        L3e:
            r5 = r8
            if (r7 == 0) goto L47
            int r8 = r4.getCount()
            int r8 = r8 - r3
            goto L52
        L47:
            androidx.appcompat.widget.DropDownListView r8 = r10.mDropDownList
            int r9 = r4.getCount()
            int r9 = r9 - r3
            int r8 = r8.lookForSelectablePosition(r9, r1)
        L52:
            r6 = r8
        L53:
            r7 = 19
            if (r2 == 0) goto L5b
            if (r11 != r7) goto L5b
            if (r0 <= r5) goto L63
        L5b:
            r8 = 20
            if (r2 != 0) goto L6f
            if (r11 != r8) goto L6f
            if (r0 < r6) goto L6f
        L63:
            r10.clearListSelection()
            android.widget.PopupWindow r1 = r10.mPopup
            r1.setInputMethodMode(r3)
            r10.show()
            return r3
        L6f:
            androidx.appcompat.widget.DropDownListView r9 = r10.mDropDownList
            r9.setListSelectionHidden(r1)
            androidx.appcompat.widget.DropDownListView r9 = r10.mDropDownList
            boolean r9 = r9.onKeyDown(r11, r12)
            if (r9 == 0) goto L8f
            android.widget.PopupWindow r7 = r10.mPopup
            r8 = 2
            r7.setInputMethodMode(r8)
            androidx.appcompat.widget.DropDownListView r7 = r10.mDropDownList
            r7.requestFocusFromTouch()
            r10.show()
            switch(r11) {
                case 19: goto L8e;
                case 20: goto L8e;
                case 23: goto L8e;
                case 66: goto L8e;
                default: goto L8d;
            }
        L8d:
            goto L9d
        L8e:
            return r3
        L8f:
            if (r2 == 0) goto L96
            if (r11 != r8) goto L96
            if (r0 != r6) goto L9d
            return r3
        L96:
            if (r2 != 0) goto L9d
            if (r11 != r7) goto L9d
            if (r0 != r5) goto L9d
            return r3
        L9d:
            return r1
    }

    public boolean onKeyPreIme(int r5, android.view.KeyEvent r6) {
            r4 = this;
            r0 = 4
            if (r5 != r0) goto L41
            boolean r0 = r4.isShowing()
            if (r0 == 0) goto L41
            android.view.View r0 = r4.mDropDownAnchorView
            int r1 = r6.getAction()
            r2 = 1
            if (r1 != 0) goto L22
            int r1 = r6.getRepeatCount()
            if (r1 != 0) goto L22
            android.view.KeyEvent$DispatcherState r1 = r0.getKeyDispatcherState()
            if (r1 == 0) goto L21
            r1.startTracking(r6, r4)
        L21:
            return r2
        L22:
            int r1 = r6.getAction()
            if (r1 != r2) goto L41
            android.view.KeyEvent$DispatcherState r1 = r0.getKeyDispatcherState()
            if (r1 == 0) goto L31
            r1.handleUpEvent(r6)
        L31:
            boolean r3 = r6.isTracking()
            if (r3 == 0) goto L41
            boolean r3 = r6.isCanceled()
            if (r3 != 0) goto L41
            r4.dismiss()
            return r2
        L41:
            r0 = 0
            return r0
    }

    public boolean onKeyUp(int r3, android.view.KeyEvent r4) {
            r2 = this;
            boolean r0 = r2.isShowing()
            if (r0 == 0) goto L20
            androidx.appcompat.widget.DropDownListView r0 = r2.mDropDownList
            int r0 = r0.getSelectedItemPosition()
            if (r0 < 0) goto L20
            androidx.appcompat.widget.DropDownListView r0 = r2.mDropDownList
            boolean r0 = r0.onKeyUp(r3, r4)
            if (r0 == 0) goto L1f
            boolean r1 = isConfirmKey(r3)
            if (r1 == 0) goto L1f
            r2.dismiss()
        L1f:
            return r0
        L20:
            r0 = 0
            return r0
    }

    public boolean performItemClick(int r8) {
            r7 = this;
            boolean r0 = r7.isShowing()
            if (r0 == 0) goto L28
            android.widget.AdapterView$OnItemClickListener r0 = r7.mItemClickListener
            if (r0 == 0) goto L25
            androidx.appcompat.widget.DropDownListView r2 = r7.mDropDownList
            int r0 = r2.getFirstVisiblePosition()
            int r0 = r8 - r0
            android.view.View r3 = r2.getChildAt(r0)
            android.widget.ListAdapter r0 = r2.getAdapter()
            android.widget.AdapterView$OnItemClickListener r1 = r7.mItemClickListener
            long r5 = r0.getItemId(r8)
            r4 = r8
            r1.onItemClick(r2, r3, r4, r5)
            goto L26
        L25:
            r4 = r8
        L26:
            r8 = 1
            return r8
        L28:
            r4 = r8
            r8 = 0
            return r8
    }

    public void postShow() {
            r2 = this;
            android.os.Handler r0 = r2.mHandler
            java.lang.Runnable r1 = r2.mShowDropDownRunnable
            r0.post(r1)
            return
    }

    public void setAdapter(android.widget.ListAdapter r3) {
            r2 = this;
            android.database.DataSetObserver r0 = r2.mObserver
            if (r0 != 0) goto Lc
            androidx.appcompat.widget.ListPopupWindow$PopupDataSetObserver r0 = new androidx.appcompat.widget.ListPopupWindow$PopupDataSetObserver
            r0.<init>(r2)
            r2.mObserver = r0
            goto L17
        Lc:
            android.widget.ListAdapter r0 = r2.mAdapter
            if (r0 == 0) goto L17
            android.widget.ListAdapter r0 = r2.mAdapter
            android.database.DataSetObserver r1 = r2.mObserver
            r0.unregisterDataSetObserver(r1)
        L17:
            r2.mAdapter = r3
            if (r3 == 0) goto L20
            android.database.DataSetObserver r0 = r2.mObserver
            r3.registerDataSetObserver(r0)
        L20:
            androidx.appcompat.widget.DropDownListView r0 = r2.mDropDownList
            if (r0 == 0) goto L2b
            androidx.appcompat.widget.DropDownListView r0 = r2.mDropDownList
            android.widget.ListAdapter r1 = r2.mAdapter
            r0.setAdapter(r1)
        L2b:
            return
    }

    public void setAnchorView(android.view.View r1) {
            r0 = this;
            r0.mDropDownAnchorView = r1
            return
    }

    public void setAnimationStyle(int r2) {
            r1 = this;
            android.widget.PopupWindow r0 = r1.mPopup
            r0.setAnimationStyle(r2)
            return
    }

    public void setBackgroundDrawable(android.graphics.drawable.Drawable r2) {
            r1 = this;
            android.widget.PopupWindow r0 = r1.mPopup
            r0.setBackgroundDrawable(r2)
            return
    }

    public void setContentWidth(int r4) {
            r3 = this;
            android.widget.PopupWindow r0 = r3.mPopup
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            if (r0 == 0) goto L1a
            android.graphics.Rect r1 = r3.mTempRect
            r0.getPadding(r1)
            android.graphics.Rect r1 = r3.mTempRect
            int r1 = r1.left
            android.graphics.Rect r2 = r3.mTempRect
            int r2 = r2.right
            int r1 = r1 + r2
            int r1 = r1 + r4
            r3.mDropDownWidth = r1
            goto L1d
        L1a:
            r3.setWidth(r4)
        L1d:
            return
    }

    public void setDropDownAlwaysVisible(boolean r1) {
            r0 = this;
            r0.mDropDownAlwaysVisible = r1
            return
    }

    public void setDropDownGravity(int r1) {
            r0 = this;
            r0.mDropDownGravity = r1
            return
    }

    public void setEpicenterBounds(android.graphics.Rect r2) {
            r1 = this;
            if (r2 == 0) goto L8
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>(r2)
            goto L9
        L8:
            r0 = 0
        L9:
            r1.mEpicenterBounds = r0
            return
    }

    public void setForceIgnoreOutsideTouch(boolean r1) {
            r0 = this;
            r0.mForceIgnoreOutsideTouch = r1
            return
    }

    public void setHeight(int r3) {
            r2 = this;
            if (r3 >= 0) goto L11
            r0 = -2
            if (r0 == r3) goto L11
            r0 = -1
            if (r0 != r3) goto L9
            goto L11
        L9:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Invalid height. Must be a positive value, MATCH_PARENT, or WRAP_CONTENT."
            r0.<init>(r1)
            throw r0
        L11:
            r2.mDropDownHeight = r3
            return
    }

    public void setHorizontalOffset(int r1) {
            r0 = this;
            r0.mDropDownHorizontalOffset = r1
            return
    }

    public void setInputMethodMode(int r2) {
            r1 = this;
            android.widget.PopupWindow r0 = r1.mPopup
            r0.setInputMethodMode(r2)
            return
    }

    void setListItemExpandMax(int r1) {
            r0 = this;
            r0.mListItemExpandMaximum = r1
            return
    }

    public void setListSelector(android.graphics.drawable.Drawable r1) {
            r0 = this;
            r0.mDropDownListHighlight = r1
            return
    }

    public void setModal(boolean r2) {
            r1 = this;
            r1.mModal = r2
            android.widget.PopupWindow r0 = r1.mPopup
            r0.setFocusable(r2)
            return
    }

    public void setOnDismissListener(android.widget.PopupWindow.OnDismissListener r2) {
            r1 = this;
            android.widget.PopupWindow r0 = r1.mPopup
            r0.setOnDismissListener(r2)
            return
    }

    public void setOnItemClickListener(android.widget.AdapterView.OnItemClickListener r1) {
            r0 = this;
            r0.mItemClickListener = r1
            return
    }

    public void setOnItemSelectedListener(android.widget.AdapterView.OnItemSelectedListener r1) {
            r0 = this;
            r0.mItemSelectedListener = r1
            return
    }

    public void setOverlapAnchor(boolean r2) {
            r1 = this;
            r0 = 1
            r1.mOverlapAnchorSet = r0
            r1.mOverlapAnchor = r2
            return
    }

    public void setPromptPosition(int r1) {
            r0 = this;
            r0.mPromptPosition = r1
            return
    }

    public void setPromptView(android.view.View r2) {
            r1 = this;
            boolean r0 = r1.isShowing()
            if (r0 == 0) goto L9
            r1.removePromptView()
        L9:
            r1.mPromptView = r2
            if (r0 == 0) goto L10
            r1.show()
        L10:
            return
    }

    public void setSelection(int r3) {
            r2 = this;
            androidx.appcompat.widget.DropDownListView r0 = r2.mDropDownList
            boolean r1 = r2.isShowing()
            if (r1 == 0) goto L1b
            if (r0 == 0) goto L1b
            r1 = 0
            r0.setListSelectionHidden(r1)
            r0.setSelection(r3)
            int r1 = r0.getChoiceMode()
            if (r1 == 0) goto L1b
            r1 = 1
            r0.setItemChecked(r3, r1)
        L1b:
            return
    }

    public void setSoftInputMode(int r2) {
            r1 = this;
            android.widget.PopupWindow r0 = r1.mPopup
            r0.setSoftInputMode(r2)
            return
    }

    public void setVerticalOffset(int r2) {
            r1 = this;
            r1.mDropDownVerticalOffset = r2
            r0 = 1
            r1.mDropDownVerticalOffsetSet = r0
            return
    }

    public void setWidth(int r1) {
            r0 = this;
            r0.mDropDownWidth = r1
            return
    }

    public void setWindowLayoutType(int r1) {
            r0 = this;
            r0.mDropDownWindowLayoutType = r1
            return
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public void show() {
            r14 = this;
            int r1 = r14.buildDropDown()
            boolean r2 = r14.isInputMethodNotNeeded()
            android.widget.PopupWindow r0 = r14.mPopup
            int r3 = r14.mDropDownWindowLayoutType
            androidx.core.widget.PopupWindowCompat.setWindowLayoutType(r0, r3)
            android.widget.PopupWindow r0 = r14.mPopup
            boolean r0 = r0.isShowing()
            r3 = 1
            r4 = -2
            r5 = 0
            r6 = -1
            if (r0 == 0) goto L9a
            android.view.View r0 = r14.getAnchorView()
            boolean r0 = r0.isAttachedToWindow()
            if (r0 != 0) goto L26
            return
        L26:
            int r0 = r14.mDropDownWidth
            if (r0 != r6) goto L2c
            r0 = -1
            goto L3b
        L2c:
            int r0 = r14.mDropDownWidth
            if (r0 != r4) goto L39
            android.view.View r0 = r14.getAnchorView()
            int r0 = r0.getWidth()
            goto L3b
        L39:
            int r0 = r14.mDropDownWidth
        L3b:
            int r7 = r14.mDropDownHeight
            if (r7 != r6) goto L6a
            if (r2 == 0) goto L43
            r4 = r1
            goto L44
        L43:
            r4 = r6
        L44:
            if (r2 == 0) goto L58
            android.widget.PopupWindow r7 = r14.mPopup
            int r8 = r14.mDropDownWidth
            if (r8 != r6) goto L4e
            r8 = r6
            goto L4f
        L4e:
            r8 = r5
        L4f:
            r7.setWidth(r8)
            android.widget.PopupWindow r7 = r14.mPopup
            r7.setHeight(r5)
            goto L72
        L58:
            android.widget.PopupWindow r7 = r14.mPopup
            int r8 = r14.mDropDownWidth
            if (r8 != r6) goto L60
            r8 = r6
            goto L61
        L60:
            r8 = r5
        L61:
            r7.setWidth(r8)
            android.widget.PopupWindow r7 = r14.mPopup
            r7.setHeight(r6)
            goto L72
        L6a:
            int r7 = r14.mDropDownHeight
            if (r7 != r4) goto L70
            r4 = r1
            goto L72
        L70:
            int r4 = r14.mDropDownHeight
        L72:
            android.widget.PopupWindow r7 = r14.mPopup
            boolean r8 = r14.mForceIgnoreOutsideTouch
            if (r8 != 0) goto L7d
            boolean r8 = r14.mDropDownAlwaysVisible
            if (r8 != 0) goto L7d
            goto L7e
        L7d:
            r3 = r5
        L7e:
            r7.setOutsideTouchable(r3)
            android.widget.PopupWindow r8 = r14.mPopup
            android.view.View r9 = r14.getAnchorView()
            int r10 = r14.mDropDownHorizontalOffset
            int r11 = r14.mDropDownVerticalOffset
            if (r0 >= 0) goto L8f
            r12 = r6
            goto L90
        L8f:
            r12 = r0
        L90:
            if (r4 >= 0) goto L94
            r13 = r6
            goto L95
        L94:
            r13 = r4
        L95:
            r8.update(r9, r10, r11, r12, r13)
            goto L147
        L9a:
            int r0 = r14.mDropDownWidth
            if (r0 != r6) goto La1
            r0 = -1
            r7 = r0
            goto Lb2
        La1:
            int r0 = r14.mDropDownWidth
            if (r0 != r4) goto Laf
            android.view.View r0 = r14.getAnchorView()
            int r0 = r0.getWidth()
            r7 = r0
            goto Lb2
        Laf:
            int r0 = r14.mDropDownWidth
            r7 = r0
        Lb2:
            int r0 = r14.mDropDownHeight
            if (r0 != r6) goto Lb9
            r0 = -1
            r4 = r0
            goto Lc3
        Lb9:
            int r0 = r14.mDropDownHeight
            if (r0 != r4) goto Lc0
            r0 = r1
            r4 = r0
            goto Lc3
        Lc0:
            int r0 = r14.mDropDownHeight
            r4 = r0
        Lc3:
            android.widget.PopupWindow r0 = r14.mPopup
            r0.setWidth(r7)
            android.widget.PopupWindow r0 = r14.mPopup
            r0.setHeight(r4)
            r14.setPopupClipToScreenEnabled(r3)
            android.widget.PopupWindow r0 = r14.mPopup
            boolean r8 = r14.mForceIgnoreOutsideTouch
            if (r8 != 0) goto Ldb
            boolean r8 = r14.mDropDownAlwaysVisible
            if (r8 != 0) goto Ldb
            goto Ldc
        Ldb:
            r3 = r5
        Ldc:
            r0.setOutsideTouchable(r3)
            android.widget.PopupWindow r0 = r14.mPopup
            androidx.appcompat.widget.ListPopupWindow$PopupTouchInterceptor r3 = r14.mTouchInterceptor
            r0.setTouchInterceptor(r3)
            boolean r0 = r14.mOverlapAnchorSet
            if (r0 == 0) goto Lf1
            android.widget.PopupWindow r0 = r14.mPopup
            boolean r3 = r14.mOverlapAnchor
            androidx.core.widget.PopupWindowCompat.setOverlapAnchor(r0, r3)
        Lf1:
            int r0 = android.os.Build.VERSION.SDK_INT
            r3 = 28
            if (r0 > r3) goto L112
            java.lang.reflect.Method r0 = androidx.appcompat.widget.ListPopupWindow.sSetEpicenterBoundsMethod
            if (r0 == 0) goto L119
            java.lang.reflect.Method r0 = androidx.appcompat.widget.ListPopupWindow.sSetEpicenterBoundsMethod     // Catch: java.lang.Exception -> L109
            android.widget.PopupWindow r3 = r14.mPopup     // Catch: java.lang.Exception -> L109
            android.graphics.Rect r5 = r14.mEpicenterBounds     // Catch: java.lang.Exception -> L109
            java.lang.Object[] r5 = new java.lang.Object[]{r5}     // Catch: java.lang.Exception -> L109
            r0.invoke(r3, r5)     // Catch: java.lang.Exception -> L109
            goto L111
        L109:
            r0 = move-exception
            java.lang.String r3 = "ListPopupWindow"
            java.lang.String r5 = "Could not invoke setEpicenterBounds on PopupWindow"
            android.util.Log.e(r3, r5, r0)
        L111:
            goto L119
        L112:
            android.widget.PopupWindow r0 = r14.mPopup
            android.graphics.Rect r3 = r14.mEpicenterBounds
            androidx.appcompat.widget.ListPopupWindow.Api29Impl.setEpicenterBounds(r0, r3)
        L119:
            android.widget.PopupWindow r0 = r14.mPopup
            android.view.View r3 = r14.getAnchorView()
            int r5 = r14.mDropDownHorizontalOffset
            int r8 = r14.mDropDownVerticalOffset
            int r9 = r14.mDropDownGravity
            androidx.core.widget.PopupWindowCompat.showAsDropDown(r0, r3, r5, r8, r9)
            androidx.appcompat.widget.DropDownListView r0 = r14.mDropDownList
            r0.setSelection(r6)
            boolean r0 = r14.mModal
            if (r0 == 0) goto L139
            androidx.appcompat.widget.DropDownListView r0 = r14.mDropDownList
            boolean r0 = r0.isInTouchMode()
            if (r0 == 0) goto L13c
        L139:
            r14.clearListSelection()
        L13c:
            boolean r0 = r14.mModal
            if (r0 != 0) goto L147
            android.os.Handler r0 = r14.mHandler
            androidx.appcompat.widget.ListPopupWindow$ListSelectorHider r3 = r14.mHideSelector
            r0.post(r3)
        L147:
            return
    }
}
