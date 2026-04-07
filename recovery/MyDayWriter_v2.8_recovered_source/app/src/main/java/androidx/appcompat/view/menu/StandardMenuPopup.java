package androidx.appcompat.view.menu;

/* JADX INFO: loaded from: classes.dex */
final class StandardMenuPopup extends androidx.appcompat.view.menu.MenuPopup implements android.widget.PopupWindow.OnDismissListener, android.widget.AdapterView.OnItemClickListener, androidx.appcompat.view.menu.MenuPresenter, android.view.View.OnKeyListener {
    private static final int ITEM_LAYOUT = 0;
    private final androidx.appcompat.view.menu.MenuAdapter mAdapter;
    private android.view.View mAnchorView;
    private final android.view.View.OnAttachStateChangeListener mAttachStateChangeListener;
    private int mContentWidth;
    private final android.content.Context mContext;
    private int mDropDownGravity;
    final android.view.ViewTreeObserver.OnGlobalLayoutListener mGlobalLayoutListener;
    private boolean mHasContentWidth;
    private final androidx.appcompat.view.menu.MenuBuilder mMenu;
    private android.widget.PopupWindow.OnDismissListener mOnDismissListener;
    private final boolean mOverflowOnly;
    final androidx.appcompat.widget.MenuPopupWindow mPopup;
    private final int mPopupMaxWidth;
    private final int mPopupStyleAttr;
    private final int mPopupStyleRes;
    private androidx.appcompat.view.menu.MenuPresenter.Callback mPresenterCallback;
    private boolean mShowTitle;
    android.view.View mShownAnchorView;
    android.view.ViewTreeObserver mTreeObserver;
    private boolean mWasDismissed;



    static {
            int r0 = androidx.appcompat.R.layout.abc_popup_menu_item_layout
            androidx.appcompat.view.menu.StandardMenuPopup.ITEM_LAYOUT = r0
            return
    }

    public StandardMenuPopup(android.content.Context r8, androidx.appcompat.view.menu.MenuBuilder r9, android.view.View r10, int r11, int r12, boolean r13) {
            r7 = this;
            r7.<init>()
            androidx.appcompat.view.menu.StandardMenuPopup$1 r0 = new androidx.appcompat.view.menu.StandardMenuPopup$1
            r0.<init>(r7)
            r7.mGlobalLayoutListener = r0
            androidx.appcompat.view.menu.StandardMenuPopup$2 r0 = new androidx.appcompat.view.menu.StandardMenuPopup$2
            r0.<init>(r7)
            r7.mAttachStateChangeListener = r0
            r0 = 0
            r7.mDropDownGravity = r0
            r7.mContext = r8
            r7.mMenu = r9
            r7.mOverflowOnly = r13
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r8)
            androidx.appcompat.view.menu.MenuAdapter r1 = new androidx.appcompat.view.menu.MenuAdapter
            boolean r2 = r7.mOverflowOnly
            int r3 = androidx.appcompat.view.menu.StandardMenuPopup.ITEM_LAYOUT
            r1.<init>(r9, r0, r2, r3)
            r7.mAdapter = r1
            r7.mPopupStyleAttr = r11
            r7.mPopupStyleRes = r12
            android.content.res.Resources r1 = r8.getResources()
            android.util.DisplayMetrics r2 = r1.getDisplayMetrics()
            int r2 = r2.widthPixels
            int r2 = r2 / 2
            int r3 = androidx.appcompat.R.dimen.abc_config_prefDialogWidth
            int r3 = r1.getDimensionPixelSize(r3)
            int r2 = java.lang.Math.max(r2, r3)
            r7.mPopupMaxWidth = r2
            r7.mAnchorView = r10
            androidx.appcompat.widget.MenuPopupWindow r2 = new androidx.appcompat.widget.MenuPopupWindow
            android.content.Context r3 = r7.mContext
            int r4 = r7.mPopupStyleAttr
            int r5 = r7.mPopupStyleRes
            r6 = 0
            r2.<init>(r3, r6, r4, r5)
            r7.mPopup = r2
            r9.addMenuPresenter(r7, r8)
            return
    }

    private boolean tryShow() {
            r9 = this;
            boolean r0 = r9.isShowing()
            r1 = 1
            if (r0 == 0) goto L8
            return r1
        L8:
            boolean r0 = r9.mWasDismissed
            r2 = 0
            if (r0 != 0) goto Lc7
            android.view.View r0 = r9.mAnchorView
            if (r0 != 0) goto L13
            goto Lc7
        L13:
            android.view.View r0 = r9.mAnchorView
            r9.mShownAnchorView = r0
            androidx.appcompat.widget.MenuPopupWindow r0 = r9.mPopup
            r0.setOnDismissListener(r9)
            androidx.appcompat.widget.MenuPopupWindow r0 = r9.mPopup
            r0.setOnItemClickListener(r9)
            androidx.appcompat.widget.MenuPopupWindow r0 = r9.mPopup
            r0.setModal(r1)
            android.view.View r0 = r9.mShownAnchorView
            android.view.ViewTreeObserver r3 = r9.mTreeObserver
            if (r3 != 0) goto L2e
            r3 = r1
            goto L2f
        L2e:
            r3 = r2
        L2f:
            android.view.ViewTreeObserver r4 = r0.getViewTreeObserver()
            r9.mTreeObserver = r4
            if (r3 == 0) goto L3e
            android.view.ViewTreeObserver r4 = r9.mTreeObserver
            android.view.ViewTreeObserver$OnGlobalLayoutListener r5 = r9.mGlobalLayoutListener
            r4.addOnGlobalLayoutListener(r5)
        L3e:
            android.view.View$OnAttachStateChangeListener r4 = r9.mAttachStateChangeListener
            r0.addOnAttachStateChangeListener(r4)
            androidx.appcompat.widget.MenuPopupWindow r4 = r9.mPopup
            r4.setAnchorView(r0)
            androidx.appcompat.widget.MenuPopupWindow r4 = r9.mPopup
            int r5 = r9.mDropDownGravity
            r4.setDropDownGravity(r5)
            boolean r4 = r9.mHasContentWidth
            r5 = 0
            if (r4 != 0) goto L62
            androidx.appcompat.view.menu.MenuAdapter r4 = r9.mAdapter
            android.content.Context r6 = r9.mContext
            int r7 = r9.mPopupMaxWidth
            int r4 = measureIndividualMenuWidth(r4, r5, r6, r7)
            r9.mContentWidth = r4
            r9.mHasContentWidth = r1
        L62:
            androidx.appcompat.widget.MenuPopupWindow r4 = r9.mPopup
            int r6 = r9.mContentWidth
            r4.setContentWidth(r6)
            androidx.appcompat.widget.MenuPopupWindow r4 = r9.mPopup
            r6 = 2
            r4.setInputMethodMode(r6)
            androidx.appcompat.widget.MenuPopupWindow r4 = r9.mPopup
            android.graphics.Rect r6 = r9.getEpicenterBounds()
            r4.setEpicenterBounds(r6)
            androidx.appcompat.widget.MenuPopupWindow r4 = r9.mPopup
            r4.show()
            androidx.appcompat.widget.MenuPopupWindow r4 = r9.mPopup
            android.widget.ListView r4 = r4.getListView()
            r4.setOnKeyListener(r9)
            boolean r6 = r9.mShowTitle
            if (r6 == 0) goto Lba
            androidx.appcompat.view.menu.MenuBuilder r6 = r9.mMenu
            java.lang.CharSequence r6 = r6.getHeaderTitle()
            if (r6 == 0) goto Lba
            android.content.Context r6 = r9.mContext
            android.view.LayoutInflater r6 = android.view.LayoutInflater.from(r6)
            int r7 = androidx.appcompat.R.layout.abc_popup_menu_header_item_layout
            android.view.View r6 = r6.inflate(r7, r4, r2)
            android.widget.FrameLayout r6 = (android.widget.FrameLayout) r6
            r7 = 16908310(0x1020016, float:2.387729E-38)
            android.view.View r7 = r6.findViewById(r7)
            android.widget.TextView r7 = (android.widget.TextView) r7
            if (r7 == 0) goto Lb4
            androidx.appcompat.view.menu.MenuBuilder r8 = r9.mMenu
            java.lang.CharSequence r8 = r8.getHeaderTitle()
            r7.setText(r8)
        Lb4:
            r6.setEnabled(r2)
            r4.addHeaderView(r6, r5, r2)
        Lba:
            androidx.appcompat.widget.MenuPopupWindow r2 = r9.mPopup
            androidx.appcompat.view.menu.MenuAdapter r5 = r9.mAdapter
            r2.setAdapter(r5)
            androidx.appcompat.widget.MenuPopupWindow r2 = r9.mPopup
            r2.show()
            return r1
        Lc7:
            return r2
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    public void addMenu(androidx.appcompat.view.menu.MenuBuilder r1) {
            r0 = this;
            return
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public void dismiss() {
            r1 = this;
            boolean r0 = r1.isShowing()
            if (r0 == 0) goto Lb
            androidx.appcompat.widget.MenuPopupWindow r0 = r1.mPopup
            r0.dismiss()
        Lb:
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
            r1 = this;
            androidx.appcompat.widget.MenuPopupWindow r0 = r1.mPopup
            android.widget.ListView r0 = r0.getListView()
            return r0
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public boolean isShowing() {
            r1 = this;
            boolean r0 = r1.mWasDismissed
            if (r0 != 0) goto Le
            androidx.appcompat.widget.MenuPopupWindow r0 = r1.mPopup
            boolean r0 = r0.isShowing()
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void onCloseMenu(androidx.appcompat.view.menu.MenuBuilder r2, boolean r3) {
            r1 = this;
            androidx.appcompat.view.menu.MenuBuilder r0 = r1.mMenu
            if (r2 == r0) goto L5
            return
        L5:
            r1.dismiss()
            androidx.appcompat.view.menu.MenuPresenter$Callback r0 = r1.mPresenterCallback
            if (r0 == 0) goto L11
            androidx.appcompat.view.menu.MenuPresenter$Callback r0 = r1.mPresenterCallback
            r0.onCloseMenu(r2, r3)
        L11:
            return
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
            r2 = this;
            r0 = 1
            r2.mWasDismissed = r0
            androidx.appcompat.view.menu.MenuBuilder r0 = r2.mMenu
            r0.close()
            android.view.ViewTreeObserver r0 = r2.mTreeObserver
            if (r0 == 0) goto L26
            android.view.ViewTreeObserver r0 = r2.mTreeObserver
            boolean r0 = r0.isAlive()
            if (r0 != 0) goto L1c
            android.view.View r0 = r2.mShownAnchorView
            android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
            r2.mTreeObserver = r0
        L1c:
            android.view.ViewTreeObserver r0 = r2.mTreeObserver
            android.view.ViewTreeObserver$OnGlobalLayoutListener r1 = r2.mGlobalLayoutListener
            r0.removeGlobalOnLayoutListener(r1)
            r0 = 0
            r2.mTreeObserver = r0
        L26:
            android.view.View r0 = r2.mShownAnchorView
            android.view.View$OnAttachStateChangeListener r1 = r2.mAttachStateChangeListener
            r0.removeOnAttachStateChangeListener(r1)
            android.widget.PopupWindow$OnDismissListener r0 = r2.mOnDismissListener
            if (r0 == 0) goto L36
            android.widget.PopupWindow$OnDismissListener r0 = r2.mOnDismissListener
            r0.onDismiss()
        L36:
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
    public boolean onSubMenuSelected(androidx.appcompat.view.menu.SubMenuBuilder r10) {
            r9 = this;
            boolean r0 = r10.hasVisibleItems()
            r1 = 0
            if (r0 == 0) goto L65
            androidx.appcompat.view.menu.MenuPopupHelper r2 = new androidx.appcompat.view.menu.MenuPopupHelper
            android.content.Context r3 = r9.mContext
            android.view.View r5 = r9.mShownAnchorView
            boolean r6 = r9.mOverflowOnly
            int r7 = r9.mPopupStyleAttr
            int r8 = r9.mPopupStyleRes
            r4 = r10
            r2.<init>(r3, r4, r5, r6, r7, r8)
            androidx.appcompat.view.menu.MenuPresenter$Callback r10 = r9.mPresenterCallback
            r2.setPresenterCallback(r10)
            boolean r10 = androidx.appcompat.view.menu.MenuPopup.shouldPreserveIconSpacing(r4)
            r2.setForceShowIcon(r10)
            android.widget.PopupWindow$OnDismissListener r10 = r9.mOnDismissListener
            r2.setOnDismissListener(r10)
            r10 = 0
            r9.mOnDismissListener = r10
            androidx.appcompat.view.menu.MenuBuilder r10 = r9.mMenu
            r10.close(r1)
            androidx.appcompat.widget.MenuPopupWindow r10 = r9.mPopup
            int r10 = r10.getHorizontalOffset()
            androidx.appcompat.widget.MenuPopupWindow r0 = r9.mPopup
            int r0 = r0.getVerticalOffset()
            int r3 = r9.mDropDownGravity
            android.view.View r5 = r9.mAnchorView
            int r5 = r5.getLayoutDirection()
            int r3 = android.view.Gravity.getAbsoluteGravity(r3, r5)
            r3 = r3 & 7
            r5 = 5
            if (r3 != r5) goto L54
            android.view.View r5 = r9.mAnchorView
            int r5 = r5.getWidth()
            int r10 = r10 + r5
        L54:
            boolean r5 = r2.tryShow(r10, r0)
            if (r5 == 0) goto L66
            androidx.appcompat.view.menu.MenuPresenter$Callback r1 = r9.mPresenterCallback
            if (r1 == 0) goto L63
            androidx.appcompat.view.menu.MenuPresenter$Callback r1 = r9.mPresenterCallback
            r1.onOpenSubMenu(r4)
        L63:
            r1 = 1
            return r1
        L65:
            r4 = r10
        L66:
            return r1
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    public void setAnchorView(android.view.View r1) {
            r0 = this;
            r0.mAnchorView = r1
            return
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void setCallback(androidx.appcompat.view.menu.MenuPresenter.Callback r1) {
            r0 = this;
            r0.mPresenterCallback = r1
            return
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    public void setForceShowIcon(boolean r2) {
            r1 = this;
            androidx.appcompat.view.menu.MenuAdapter r0 = r1.mAdapter
            r0.setForceShowIcon(r2)
            return
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    public void setGravity(int r1) {
            r0 = this;
            r0.mDropDownGravity = r1
            return
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    public void setHorizontalOffset(int r2) {
            r1 = this;
            androidx.appcompat.widget.MenuPopupWindow r0 = r1.mPopup
            r0.setHorizontalOffset(r2)
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
            androidx.appcompat.widget.MenuPopupWindow r0 = r1.mPopup
            r0.setVerticalOffset(r2)
            return
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public void show() {
            r2 = this;
            boolean r0 = r2.tryShow()
            if (r0 == 0) goto L7
            return
        L7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "StandardMenuPopup cannot be used without an anchor"
            r0.<init>(r1)
            throw r0
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void updateMenuView(boolean r2) {
            r1 = this;
            r0 = 0
            r1.mHasContentWidth = r0
            androidx.appcompat.view.menu.MenuAdapter r0 = r1.mAdapter
            if (r0 == 0) goto Lc
            androidx.appcompat.view.menu.MenuAdapter r0 = r1.mAdapter
            r0.notifyDataSetChanged()
        Lc:
            return
    }
}
