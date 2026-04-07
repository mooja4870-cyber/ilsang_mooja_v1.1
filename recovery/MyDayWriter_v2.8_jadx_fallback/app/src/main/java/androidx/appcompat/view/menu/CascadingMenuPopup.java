package androidx.appcompat.view.menu;

/* JADX INFO: loaded from: classes.dex */
final class CascadingMenuPopup extends androidx.appcompat.view.menu.MenuPopup implements androidx.appcompat.view.menu.MenuPresenter, android.view.View.OnKeyListener, android.widget.PopupWindow.OnDismissListener {
    static final int HORIZ_POSITION_LEFT = 0;
    static final int HORIZ_POSITION_RIGHT = 1;
    private static final int ITEM_LAYOUT = 0;
    static final int SUBMENU_TIMEOUT_MS = 200;
    private android.view.View mAnchorView;
    private final android.view.View.OnAttachStateChangeListener mAttachStateChangeListener;
    private final android.content.Context mContext;
    private int mDropDownGravity;
    private boolean mForceShowIcon;
    final android.view.ViewTreeObserver.OnGlobalLayoutListener mGlobalLayoutListener;
    private boolean mHasXOffset;
    private boolean mHasYOffset;
    private int mLastPosition;
    private final androidx.appcompat.widget.MenuItemHoverListener mMenuItemHoverListener;
    private final int mMenuMaxWidth;
    private android.widget.PopupWindow.OnDismissListener mOnDismissListener;
    private final boolean mOverflowOnly;
    private final java.util.List<androidx.appcompat.view.menu.MenuBuilder> mPendingMenus;
    private final int mPopupStyleAttr;
    private final int mPopupStyleRes;
    private androidx.appcompat.view.menu.MenuPresenter.Callback mPresenterCallback;
    private int mRawDropDownGravity;
    boolean mShouldCloseImmediately;
    private boolean mShowTitle;
    final java.util.List<androidx.appcompat.view.menu.CascadingMenuPopup.CascadingMenuInfo> mShowingMenus;
    android.view.View mShownAnchorView;
    final android.os.Handler mSubMenuHoverHandler;
    android.view.ViewTreeObserver mTreeObserver;
    private int mXOffset;
    private int mYOffset;




    private static class CascadingMenuInfo {
        public final androidx.appcompat.view.menu.MenuBuilder menu;
        public final int position;
        public final androidx.appcompat.widget.MenuPopupWindow window;

        public CascadingMenuInfo(androidx.appcompat.widget.MenuPopupWindow r1, androidx.appcompat.view.menu.MenuBuilder r2, int r3) {
                r0 = this;
                r0.<init>()
                r0.window = r1
                r0.menu = r2
                r0.position = r3
                return
        }

        public android.widget.ListView getListView() {
                r1 = this;
                androidx.appcompat.widget.MenuPopupWindow r0 = r1.window
                android.widget.ListView r0 = r0.getListView()
                return r0
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface HorizPosition {
    }

    static {
            int r0 = androidx.appcompat.R.layout.abc_cascading_menu_item_layout
            androidx.appcompat.view.menu.CascadingMenuPopup.ITEM_LAYOUT = r0
            return
    }

    public CascadingMenuPopup(android.content.Context r4, android.view.View r5, int r6, int r7, boolean r8) {
            r3 = this;
            r3.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.mPendingMenus = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.mShowingMenus = r0
            androidx.appcompat.view.menu.CascadingMenuPopup$1 r0 = new androidx.appcompat.view.menu.CascadingMenuPopup$1
            r0.<init>(r3)
            r3.mGlobalLayoutListener = r0
            androidx.appcompat.view.menu.CascadingMenuPopup$2 r0 = new androidx.appcompat.view.menu.CascadingMenuPopup$2
            r0.<init>(r3)
            r3.mAttachStateChangeListener = r0
            androidx.appcompat.view.menu.CascadingMenuPopup$3 r0 = new androidx.appcompat.view.menu.CascadingMenuPopup$3
            r0.<init>(r3)
            r3.mMenuItemHoverListener = r0
            r0 = 0
            r3.mRawDropDownGravity = r0
            r3.mDropDownGravity = r0
            r3.mContext = r4
            r3.mAnchorView = r5
            r3.mPopupStyleAttr = r6
            r3.mPopupStyleRes = r7
            r3.mOverflowOnly = r8
            r3.mForceShowIcon = r0
            int r0 = r3.getInitialMenuPosition()
            r3.mLastPosition = r0
            android.content.res.Resources r0 = r4.getResources()
            android.util.DisplayMetrics r1 = r0.getDisplayMetrics()
            int r1 = r1.widthPixels
            int r1 = r1 / 2
            int r2 = androidx.appcompat.R.dimen.abc_config_prefDialogWidth
            int r2 = r0.getDimensionPixelSize(r2)
            int r1 = java.lang.Math.max(r1, r2)
            r3.mMenuMaxWidth = r1
            android.os.Handler r1 = new android.os.Handler
            r1.<init>()
            r3.mSubMenuHoverHandler = r1
            return
    }

    private androidx.appcompat.widget.MenuPopupWindow createPopupWindow() {
            r5 = this;
            androidx.appcompat.widget.MenuPopupWindow r0 = new androidx.appcompat.widget.MenuPopupWindow
            android.content.Context r1 = r5.mContext
            int r2 = r5.mPopupStyleAttr
            int r3 = r5.mPopupStyleRes
            r4 = 0
            r0.<init>(r1, r4, r2, r3)
            androidx.appcompat.widget.MenuItemHoverListener r1 = r5.mMenuItemHoverListener
            r0.setHoverListener(r1)
            r0.setOnItemClickListener(r5)
            r0.setOnDismissListener(r5)
            android.view.View r1 = r5.mAnchorView
            r0.setAnchorView(r1)
            int r1 = r5.mDropDownGravity
            r0.setDropDownGravity(r1)
            r1 = 1
            r0.setModal(r1)
            r1 = 2
            r0.setInputMethodMode(r1)
            return r0
    }

    private int findIndexOfAddedMenu(androidx.appcompat.view.menu.MenuBuilder r5) {
            r4 = this;
            r0 = 0
            java.util.List<androidx.appcompat.view.menu.CascadingMenuPopup$CascadingMenuInfo> r1 = r4.mShowingMenus
            int r1 = r1.size()
        L7:
            if (r0 >= r1) goto L19
            java.util.List<androidx.appcompat.view.menu.CascadingMenuPopup$CascadingMenuInfo> r2 = r4.mShowingMenus
            java.lang.Object r2 = r2.get(r0)
            androidx.appcompat.view.menu.CascadingMenuPopup$CascadingMenuInfo r2 = (androidx.appcompat.view.menu.CascadingMenuPopup.CascadingMenuInfo) r2
            androidx.appcompat.view.menu.MenuBuilder r3 = r2.menu
            if (r5 != r3) goto L16
            return r0
        L16:
            int r0 = r0 + 1
            goto L7
        L19:
            r0 = -1
            return r0
    }

    private android.view.MenuItem findMenuItemForSubmenu(androidx.appcompat.view.menu.MenuBuilder r5, androidx.appcompat.view.menu.MenuBuilder r6) {
            r4 = this;
            r0 = 0
            int r1 = r5.size()
        L5:
            if (r0 >= r1) goto L1b
            android.view.MenuItem r2 = r5.getItem(r0)
            boolean r3 = r2.hasSubMenu()
            if (r3 == 0) goto L18
            android.view.SubMenu r3 = r2.getSubMenu()
            if (r6 != r3) goto L18
            return r2
        L18:
            int r0 = r0 + 1
            goto L5
        L1b:
            r0 = 0
            return r0
    }

    private android.view.View findParentViewForSubmenu(androidx.appcompat.view.menu.CascadingMenuPopup.CascadingMenuInfo r11, androidx.appcompat.view.menu.MenuBuilder r12) {
            r10 = this;
            androidx.appcompat.view.menu.MenuBuilder r0 = r11.menu
            android.view.MenuItem r0 = r10.findMenuItemForSubmenu(r0, r12)
            r1 = 0
            if (r0 != 0) goto La
            return r1
        La:
            android.widget.ListView r2 = r11.getListView()
            android.widget.ListAdapter r3 = r2.getAdapter()
            boolean r4 = r3 instanceof android.widget.HeaderViewListAdapter
            if (r4 == 0) goto L25
            r4 = r3
            android.widget.HeaderViewListAdapter r4 = (android.widget.HeaderViewListAdapter) r4
            int r5 = r4.getHeadersCount()
            android.widget.ListAdapter r6 = r4.getWrappedAdapter()
            r4 = r6
            androidx.appcompat.view.menu.MenuAdapter r4 = (androidx.appcompat.view.menu.MenuAdapter) r4
            goto L29
        L25:
            r5 = 0
            r4 = r3
            androidx.appcompat.view.menu.MenuAdapter r4 = (androidx.appcompat.view.menu.MenuAdapter) r4
        L29:
            r6 = -1
            r7 = 0
            int r8 = r4.getCount()
        L2f:
            if (r7 >= r8) goto L3c
            androidx.appcompat.view.menu.MenuItemImpl r9 = r4.getItem(r7)
            if (r0 != r9) goto L39
            r6 = r7
            goto L3c
        L39:
            int r7 = r7 + 1
            goto L2f
        L3c:
            r7 = -1
            if (r6 != r7) goto L40
            return r1
        L40:
            int r6 = r6 + r5
            int r7 = r2.getFirstVisiblePosition()
            int r7 = r6 - r7
            if (r7 < 0) goto L55
            int r8 = r2.getChildCount()
            if (r7 < r8) goto L50
            goto L55
        L50:
            android.view.View r1 = r2.getChildAt(r7)
            return r1
        L55:
            return r1
    }

    private int getInitialMenuPosition() {
            r2 = this;
            android.view.View r0 = r2.mAnchorView
            int r0 = r0.getLayoutDirection()
            r1 = 1
            if (r0 != r1) goto Lb
            r1 = 0
            goto Lc
        Lb:
        Lc:
            return r1
    }

    private int getNextMenuPosition(int r8) {
            r7 = this;
            java.util.List<androidx.appcompat.view.menu.CascadingMenuPopup$CascadingMenuInfo> r0 = r7.mShowingMenus
            java.util.List<androidx.appcompat.view.menu.CascadingMenuPopup$CascadingMenuInfo> r1 = r7.mShowingMenus
            int r1 = r1.size()
            r2 = 1
            int r1 = r1 - r2
            java.lang.Object r0 = r0.get(r1)
            androidx.appcompat.view.menu.CascadingMenuPopup$CascadingMenuInfo r0 = (androidx.appcompat.view.menu.CascadingMenuPopup.CascadingMenuInfo) r0
            android.widget.ListView r0 = r0.getListView()
            r1 = 2
            int[] r1 = new int[r1]
            r0.getLocationOnScreen(r1)
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>()
            android.view.View r4 = r7.mShownAnchorView
            r4.getWindowVisibleDisplayFrame(r3)
            int r4 = r7.mLastPosition
            r5 = 0
            if (r4 != r2) goto L37
            r4 = r1[r5]
            int r6 = r0.getWidth()
            int r4 = r4 + r6
            int r4 = r4 + r8
            int r6 = r3.right
            if (r4 <= r6) goto L36
            return r5
        L36:
            return r2
        L37:
            r4 = r1[r5]
            int r4 = r4 - r8
            if (r4 >= 0) goto L3d
            return r2
        L3d:
            return r5
    }

    private void showMenu(androidx.appcompat.view.menu.MenuBuilder r19) {
            r18 = this;
            r0 = r18
            r1 = r19
            android.content.Context r2 = r0.mContext
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r2)
            androidx.appcompat.view.menu.MenuAdapter r3 = new androidx.appcompat.view.menu.MenuAdapter
            boolean r4 = r0.mOverflowOnly
            int r5 = androidx.appcompat.view.menu.CascadingMenuPopup.ITEM_LAYOUT
            r3.<init>(r1, r2, r4, r5)
            boolean r4 = r0.isShowing()
            r5 = 1
            if (r4 != 0) goto L22
            boolean r4 = r0.mForceShowIcon
            if (r4 == 0) goto L22
            r3.setForceShowIcon(r5)
            goto L2f
        L22:
            boolean r4 = r0.isShowing()
            if (r4 == 0) goto L2f
            boolean r4 = androidx.appcompat.view.menu.MenuPopup.shouldPreserveIconSpacing(r1)
            r3.setForceShowIcon(r4)
        L2f:
            android.content.Context r4 = r0.mContext
            int r6 = r0.mMenuMaxWidth
            r7 = 0
            int r4 = measureIndividualMenuWidth(r3, r7, r4, r6)
            androidx.appcompat.widget.MenuPopupWindow r6 = r0.createPopupWindow()
            r6.setAdapter(r3)
            r6.setContentWidth(r4)
            int r8 = r0.mDropDownGravity
            r6.setDropDownGravity(r8)
            java.util.List<androidx.appcompat.view.menu.CascadingMenuPopup$CascadingMenuInfo> r8 = r0.mShowingMenus
            int r8 = r8.size()
            if (r8 <= 0) goto L63
            java.util.List<androidx.appcompat.view.menu.CascadingMenuPopup$CascadingMenuInfo> r8 = r0.mShowingMenus
            java.util.List<androidx.appcompat.view.menu.CascadingMenuPopup$CascadingMenuInfo> r9 = r0.mShowingMenus
            int r9 = r9.size()
            int r9 = r9 - r5
            java.lang.Object r8 = r8.get(r9)
            androidx.appcompat.view.menu.CascadingMenuPopup$CascadingMenuInfo r8 = (androidx.appcompat.view.menu.CascadingMenuPopup.CascadingMenuInfo) r8
            android.view.View r9 = r0.findParentViewForSubmenu(r8, r1)
            goto L65
        L63:
            r8 = 0
            r9 = 0
        L65:
            r10 = 0
            if (r9 == 0) goto Le6
            r6.setTouchModal(r10)
            r6.setEnterTransition(r7)
            int r11 = r0.getNextMenuPosition(r4)
            if (r11 != r5) goto L76
            r12 = r5
            goto L77
        L76:
            r12 = r10
        L77:
            r0.mLastPosition = r11
            int r13 = android.os.Build.VERSION.SDK_INT
            r14 = 26
            r15 = 5
            if (r13 < r14) goto L88
            r6.setAnchorView(r9)
            r13 = 0
            r14 = 0
            r16 = r10
            goto Lc1
        L88:
            r13 = 2
            int[] r14 = new int[r13]
            android.view.View r7 = r0.mAnchorView
            r7.getLocationOnScreen(r14)
            int[] r7 = new int[r13]
            r9.getLocationOnScreen(r7)
            int r13 = r0.mDropDownGravity
            r13 = r13 & 7
            if (r13 != r15) goto Lb2
            r13 = r14[r10]
            r16 = r10
            android.view.View r10 = r0.mAnchorView
            int r10 = r10.getWidth()
            int r13 = r13 + r10
            r14[r16] = r13
            r10 = r7[r16]
            int r13 = r9.getWidth()
            int r10 = r10 + r13
            r7[r16] = r10
            goto Lb4
        Lb2:
            r16 = r10
        Lb4:
            r10 = r7[r16]
            r13 = r14[r16]
            int r13 = r10 - r13
            r10 = r7[r5]
            r17 = r14[r5]
            int r10 = r10 - r17
            r14 = r10
        Lc1:
            int r7 = r0.mDropDownGravity
            r7 = r7 & r15
            if (r7 != r15) goto Ld2
            if (r12 == 0) goto Lcb
            int r7 = r13 + r4
            goto Ldc
        Lcb:
            int r7 = r9.getWidth()
            int r7 = r13 - r7
            goto Ldc
        Ld2:
            if (r12 == 0) goto Lda
            int r7 = r9.getWidth()
            int r7 = r7 + r13
            goto Ldc
        Lda:
            int r7 = r13 - r4
        Ldc:
            r6.setHorizontalOffset(r7)
            r6.setOverlapAnchor(r5)
            r6.setVerticalOffset(r14)
            goto L101
        Le6:
            r16 = r10
            boolean r5 = r0.mHasXOffset
            if (r5 == 0) goto Lf1
            int r5 = r0.mXOffset
            r6.setHorizontalOffset(r5)
        Lf1:
            boolean r5 = r0.mHasYOffset
            if (r5 == 0) goto Lfa
            int r5 = r0.mYOffset
            r6.setVerticalOffset(r5)
        Lfa:
            android.graphics.Rect r5 = r0.getEpicenterBounds()
            r6.setEpicenterBounds(r5)
        L101:
            androidx.appcompat.view.menu.CascadingMenuPopup$CascadingMenuInfo r5 = new androidx.appcompat.view.menu.CascadingMenuPopup$CascadingMenuInfo
            int r7 = r0.mLastPosition
            r5.<init>(r6, r1, r7)
            java.util.List<androidx.appcompat.view.menu.CascadingMenuPopup$CascadingMenuInfo> r7 = r0.mShowingMenus
            r7.add(r5)
            r6.show()
            android.widget.ListView r7 = r6.getListView()
            r7.setOnKeyListener(r0)
            if (r8 != 0) goto L147
            boolean r10 = r0.mShowTitle
            if (r10 == 0) goto L147
            java.lang.CharSequence r10 = r1.getHeaderTitle()
            if (r10 == 0) goto L147
            int r10 = androidx.appcompat.R.layout.abc_popup_menu_header_item_layout
            r11 = r16
            android.view.View r10 = r2.inflate(r10, r7, r11)
            android.widget.FrameLayout r10 = (android.widget.FrameLayout) r10
            r12 = 16908310(0x1020016, float:2.387729E-38)
            android.view.View r12 = r10.findViewById(r12)
            android.widget.TextView r12 = (android.widget.TextView) r12
            r10.setEnabled(r11)
            java.lang.CharSequence r13 = r1.getHeaderTitle()
            r12.setText(r13)
            r13 = 0
            r7.addHeaderView(r10, r13, r11)
            r6.show()
        L147:
            return
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    public void addMenu(androidx.appcompat.view.menu.MenuBuilder r2) {
            r1 = this;
            android.content.Context r0 = r1.mContext
            r2.addMenuPresenter(r1, r0)
            boolean r0 = r1.isShowing()
            if (r0 == 0) goto Lf
            r1.showMenu(r2)
            goto L14
        Lf:
            java.util.List<androidx.appcompat.view.menu.MenuBuilder> r0 = r1.mPendingMenus
            r0.add(r2)
        L14:
            return
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    protected boolean closeMenuOnSubMenuOpened() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public void dismiss() {
            r5 = this;
            java.util.List<androidx.appcompat.view.menu.CascadingMenuPopup$CascadingMenuInfo> r0 = r5.mShowingMenus
            int r0 = r0.size()
            if (r0 <= 0) goto L28
            java.util.List<androidx.appcompat.view.menu.CascadingMenuPopup$CascadingMenuInfo> r1 = r5.mShowingMenus
            androidx.appcompat.view.menu.CascadingMenuPopup$CascadingMenuInfo[] r2 = new androidx.appcompat.view.menu.CascadingMenuPopup.CascadingMenuInfo[r0]
            java.lang.Object[] r1 = r1.toArray(r2)
            androidx.appcompat.view.menu.CascadingMenuPopup$CascadingMenuInfo[] r1 = (androidx.appcompat.view.menu.CascadingMenuPopup.CascadingMenuInfo[]) r1
            int r2 = r0 + (-1)
        L14:
            if (r2 < 0) goto L28
            r3 = r1[r2]
            androidx.appcompat.widget.MenuPopupWindow r4 = r3.window
            boolean r4 = r4.isShowing()
            if (r4 == 0) goto L25
            androidx.appcompat.widget.MenuPopupWindow r4 = r3.window
            r4.dismiss()
        L25:
            int r2 = r2 + (-1)
            goto L14
        L28:
            return
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public boolean flagActionItems() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public android.widget.ListView getListView() {
            r2 = this;
            java.util.List<androidx.appcompat.view.menu.CascadingMenuPopup$CascadingMenuInfo> r0 = r2.mShowingMenus
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto La
            r0 = 0
            goto L1e
        La:
            java.util.List<androidx.appcompat.view.menu.CascadingMenuPopup$CascadingMenuInfo> r0 = r2.mShowingMenus
            java.util.List<androidx.appcompat.view.menu.CascadingMenuPopup$CascadingMenuInfo> r1 = r2.mShowingMenus
            int r1 = r1.size()
            int r1 = r1 + (-1)
            java.lang.Object r0 = r0.get(r1)
            androidx.appcompat.view.menu.CascadingMenuPopup$CascadingMenuInfo r0 = (androidx.appcompat.view.menu.CascadingMenuPopup.CascadingMenuInfo) r0
            android.widget.ListView r0 = r0.getListView()
        L1e:
            return r0
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public boolean isShowing() {
            r2 = this;
            java.util.List<androidx.appcompat.view.menu.CascadingMenuPopup$CascadingMenuInfo> r0 = r2.mShowingMenus
            int r0 = r0.size()
            r1 = 0
            if (r0 <= 0) goto L1a
            java.util.List<androidx.appcompat.view.menu.CascadingMenuPopup$CascadingMenuInfo> r0 = r2.mShowingMenus
            java.lang.Object r0 = r0.get(r1)
            androidx.appcompat.view.menu.CascadingMenuPopup$CascadingMenuInfo r0 = (androidx.appcompat.view.menu.CascadingMenuPopup.CascadingMenuInfo) r0
            androidx.appcompat.widget.MenuPopupWindow r0 = r0.window
            boolean r0 = r0.isShowing()
            if (r0 == 0) goto L1a
            r1 = 1
        L1a:
            return r1
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void onCloseMenu(androidx.appcompat.view.menu.MenuBuilder r9, boolean r10) {
            r8 = this;
            int r0 = r8.findIndexOfAddedMenu(r9)
            if (r0 >= 0) goto L7
            return
        L7:
            int r1 = r0 + 1
            java.util.List<androidx.appcompat.view.menu.CascadingMenuPopup$CascadingMenuInfo> r2 = r8.mShowingMenus
            int r2 = r2.size()
            r3 = 0
            if (r1 >= r2) goto L1f
            java.util.List<androidx.appcompat.view.menu.CascadingMenuPopup$CascadingMenuInfo> r2 = r8.mShowingMenus
            java.lang.Object r2 = r2.get(r1)
            androidx.appcompat.view.menu.CascadingMenuPopup$CascadingMenuInfo r2 = (androidx.appcompat.view.menu.CascadingMenuPopup.CascadingMenuInfo) r2
            androidx.appcompat.view.menu.MenuBuilder r4 = r2.menu
            r4.close(r3)
        L1f:
            java.util.List<androidx.appcompat.view.menu.CascadingMenuPopup$CascadingMenuInfo> r2 = r8.mShowingMenus
            java.lang.Object r2 = r2.remove(r0)
            androidx.appcompat.view.menu.CascadingMenuPopup$CascadingMenuInfo r2 = (androidx.appcompat.view.menu.CascadingMenuPopup.CascadingMenuInfo) r2
            androidx.appcompat.view.menu.MenuBuilder r4 = r2.menu
            r4.removeMenuPresenter(r8)
            boolean r4 = r8.mShouldCloseImmediately
            r5 = 0
            if (r4 == 0) goto L3b
            androidx.appcompat.widget.MenuPopupWindow r4 = r2.window
            r4.setExitTransition(r5)
            androidx.appcompat.widget.MenuPopupWindow r4 = r2.window
            r4.setAnimationStyle(r3)
        L3b:
            androidx.appcompat.widget.MenuPopupWindow r4 = r2.window
            r4.dismiss()
            java.util.List<androidx.appcompat.view.menu.CascadingMenuPopup$CascadingMenuInfo> r4 = r8.mShowingMenus
            int r4 = r4.size()
            if (r4 <= 0) goto L57
            java.util.List<androidx.appcompat.view.menu.CascadingMenuPopup$CascadingMenuInfo> r6 = r8.mShowingMenus
            int r7 = r4 + (-1)
            java.lang.Object r6 = r6.get(r7)
            androidx.appcompat.view.menu.CascadingMenuPopup$CascadingMenuInfo r6 = (androidx.appcompat.view.menu.CascadingMenuPopup.CascadingMenuInfo) r6
            int r6 = r6.position
            r8.mLastPosition = r6
            goto L5d
        L57:
            int r6 = r8.getInitialMenuPosition()
            r8.mLastPosition = r6
        L5d:
            if (r4 != 0) goto L8e
            r8.dismiss()
            androidx.appcompat.view.menu.MenuPresenter$Callback r3 = r8.mPresenterCallback
            if (r3 == 0) goto L6c
            androidx.appcompat.view.menu.MenuPresenter$Callback r3 = r8.mPresenterCallback
            r6 = 1
            r3.onCloseMenu(r9, r6)
        L6c:
            android.view.ViewTreeObserver r3 = r8.mTreeObserver
            if (r3 == 0) goto L81
            android.view.ViewTreeObserver r3 = r8.mTreeObserver
            boolean r3 = r3.isAlive()
            if (r3 == 0) goto L7f
            android.view.ViewTreeObserver r3 = r8.mTreeObserver
            android.view.ViewTreeObserver$OnGlobalLayoutListener r6 = r8.mGlobalLayoutListener
            r3.removeGlobalOnLayoutListener(r6)
        L7f:
            r8.mTreeObserver = r5
        L81:
            android.view.View r3 = r8.mShownAnchorView
            android.view.View$OnAttachStateChangeListener r5 = r8.mAttachStateChangeListener
            r3.removeOnAttachStateChangeListener(r5)
            android.widget.PopupWindow$OnDismissListener r3 = r8.mOnDismissListener
            r3.onDismiss()
            goto L9d
        L8e:
            if (r10 == 0) goto L9d
            java.util.List<androidx.appcompat.view.menu.CascadingMenuPopup$CascadingMenuInfo> r5 = r8.mShowingMenus
            java.lang.Object r5 = r5.get(r3)
            androidx.appcompat.view.menu.CascadingMenuPopup$CascadingMenuInfo r5 = (androidx.appcompat.view.menu.CascadingMenuPopup.CascadingMenuInfo) r5
            androidx.appcompat.view.menu.MenuBuilder r6 = r5.menu
            r6.close(r3)
        L9d:
            return
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
            r5 = this;
            r0 = 0
            r1 = 0
            java.util.List<androidx.appcompat.view.menu.CascadingMenuPopup$CascadingMenuInfo> r2 = r5.mShowingMenus
            int r2 = r2.size()
        L8:
            if (r1 >= r2) goto L1f
            java.util.List<androidx.appcompat.view.menu.CascadingMenuPopup$CascadingMenuInfo> r3 = r5.mShowingMenus
            java.lang.Object r3 = r3.get(r1)
            androidx.appcompat.view.menu.CascadingMenuPopup$CascadingMenuInfo r3 = (androidx.appcompat.view.menu.CascadingMenuPopup.CascadingMenuInfo) r3
            androidx.appcompat.widget.MenuPopupWindow r4 = r3.window
            boolean r4 = r4.isShowing()
            if (r4 != 0) goto L1c
            r0 = r3
            goto L1f
        L1c:
            int r1 = r1 + 1
            goto L8
        L1f:
            if (r0 == 0) goto L27
            androidx.appcompat.view.menu.MenuBuilder r1 = r0.menu
            r2 = 0
            r1.close(r2)
        L27:
            return
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(android.view.View r3, int r4, android.view.KeyEvent r5) {
            r2 = this;
            int r0 = r5.getAction()
            r1 = 1
            if (r0 != r1) goto Lf
            r0 = 82
            if (r4 != r0) goto Lf
            r2.dismiss()
            return r1
        Lf:
            r0 = 0
            return r0
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void onRestoreInstanceState(android.os.Parcelable r1) {
            r0 = this;
            return
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public android.os.Parcelable onSaveInstanceState() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public boolean onSubMenuSelected(androidx.appcompat.view.menu.SubMenuBuilder r5) {
            r4 = this;
            java.util.List<androidx.appcompat.view.menu.CascadingMenuPopup$CascadingMenuInfo> r0 = r4.mShowingMenus
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            r2 = 1
            if (r1 == 0) goto L20
            java.lang.Object r1 = r0.next()
            androidx.appcompat.view.menu.CascadingMenuPopup$CascadingMenuInfo r1 = (androidx.appcompat.view.menu.CascadingMenuPopup.CascadingMenuInfo) r1
            androidx.appcompat.view.menu.MenuBuilder r3 = r1.menu
            if (r5 != r3) goto L1f
            android.widget.ListView r0 = r1.getListView()
            r0.requestFocus()
            return r2
        L1f:
            goto L6
        L20:
            boolean r0 = r5.hasVisibleItems()
            if (r0 == 0) goto L33
            r4.addMenu(r5)
            androidx.appcompat.view.menu.MenuPresenter$Callback r0 = r4.mPresenterCallback
            if (r0 == 0) goto L32
            androidx.appcompat.view.menu.MenuPresenter$Callback r0 = r4.mPresenterCallback
            r0.onOpenSubMenu(r5)
        L32:
            return r2
        L33:
            r0 = 0
            return r0
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    public void setAnchorView(android.view.View r3) {
            r2 = this;
            android.view.View r0 = r2.mAnchorView
            if (r0 == r3) goto L14
            r2.mAnchorView = r3
            int r0 = r2.mRawDropDownGravity
            android.view.View r1 = r2.mAnchorView
            int r1 = r1.getLayoutDirection()
            int r0 = androidx.core.view.GravityCompat.getAbsoluteGravity(r0, r1)
            r2.mDropDownGravity = r0
        L14:
            return
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void setCallback(androidx.appcompat.view.menu.MenuPresenter.Callback r1) {
            r0 = this;
            r0.mPresenterCallback = r1
            return
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    public void setForceShowIcon(boolean r1) {
            r0 = this;
            r0.mForceShowIcon = r1
            return
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    public void setGravity(int r2) {
            r1 = this;
            int r0 = r1.mRawDropDownGravity
            if (r0 == r2) goto L12
            r1.mRawDropDownGravity = r2
            android.view.View r0 = r1.mAnchorView
            int r0 = r0.getLayoutDirection()
            int r0 = androidx.core.view.GravityCompat.getAbsoluteGravity(r2, r0)
            r1.mDropDownGravity = r0
        L12:
            return
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    public void setHorizontalOffset(int r2) {
            r1 = this;
            r0 = 1
            r1.mHasXOffset = r0
            r1.mXOffset = r2
            return
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    public void setOnDismissListener(android.widget.PopupWindow.OnDismissListener r1) {
            r0 = this;
            r0.mOnDismissListener = r1
            return
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    public void setShowTitle(boolean r1) {
            r0 = this;
            r0.mShowTitle = r1
            return
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    public void setVerticalOffset(int r2) {
            r1 = this;
            r0 = 1
            r1.mHasYOffset = r0
            r1.mYOffset = r2
            return
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public void show() {
            r3 = this;
            boolean r0 = r3.isShowing()
            if (r0 == 0) goto L7
            return
        L7:
            java.util.List<androidx.appcompat.view.menu.MenuBuilder> r0 = r3.mPendingMenus
            java.util.Iterator r0 = r0.iterator()
        Ld:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1d
            java.lang.Object r1 = r0.next()
            androidx.appcompat.view.menu.MenuBuilder r1 = (androidx.appcompat.view.menu.MenuBuilder) r1
            r3.showMenu(r1)
            goto Ld
        L1d:
            java.util.List<androidx.appcompat.view.menu.MenuBuilder> r0 = r3.mPendingMenus
            r0.clear()
            android.view.View r0 = r3.mAnchorView
            r3.mShownAnchorView = r0
            android.view.View r0 = r3.mShownAnchorView
            if (r0 == 0) goto L49
            android.view.ViewTreeObserver r0 = r3.mTreeObserver
            if (r0 != 0) goto L30
            r0 = 1
            goto L31
        L30:
            r0 = 0
        L31:
            android.view.View r1 = r3.mShownAnchorView
            android.view.ViewTreeObserver r1 = r1.getViewTreeObserver()
            r3.mTreeObserver = r1
            if (r0 == 0) goto L42
            android.view.ViewTreeObserver r1 = r3.mTreeObserver
            android.view.ViewTreeObserver$OnGlobalLayoutListener r2 = r3.mGlobalLayoutListener
            r1.addOnGlobalLayoutListener(r2)
        L42:
            android.view.View r1 = r3.mShownAnchorView
            android.view.View$OnAttachStateChangeListener r2 = r3.mAttachStateChangeListener
            r1.addOnAttachStateChangeListener(r2)
        L49:
            return
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void updateMenuView(boolean r4) {
            r3 = this;
            java.util.List<androidx.appcompat.view.menu.CascadingMenuPopup$CascadingMenuInfo> r0 = r3.mShowingMenus
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L22
            java.lang.Object r1 = r0.next()
            androidx.appcompat.view.menu.CascadingMenuPopup$CascadingMenuInfo r1 = (androidx.appcompat.view.menu.CascadingMenuPopup.CascadingMenuInfo) r1
            android.widget.ListView r2 = r1.getListView()
            android.widget.ListAdapter r2 = r2.getAdapter()
            androidx.appcompat.view.menu.MenuAdapter r2 = toMenuAdapter(r2)
            r2.notifyDataSetChanged()
            goto L6
        L22:
            return
    }
}
