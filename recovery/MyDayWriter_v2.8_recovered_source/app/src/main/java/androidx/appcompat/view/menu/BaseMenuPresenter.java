package androidx.appcompat.view.menu;

/* JADX INFO: loaded from: classes.dex */
public abstract class BaseMenuPresenter implements androidx.appcompat.view.menu.MenuPresenter {
    private androidx.appcompat.view.menu.MenuPresenter.Callback mCallback;
    protected android.content.Context mContext;
    private int mId;
    protected android.view.LayoutInflater mInflater;
    private int mItemLayoutRes;
    protected androidx.appcompat.view.menu.MenuBuilder mMenu;
    private int mMenuLayoutRes;
    protected androidx.appcompat.view.menu.MenuView mMenuView;
    protected android.content.Context mSystemContext;
    protected android.view.LayoutInflater mSystemInflater;

    public BaseMenuPresenter(android.content.Context r2, int r3, int r4) {
            r1 = this;
            r1.<init>()
            r1.mSystemContext = r2
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r2)
            r1.mSystemInflater = r0
            r1.mMenuLayoutRes = r3
            r1.mItemLayoutRes = r4
            return
    }

    protected void addItemView(android.view.View r3, int r4) {
            r2 = this;
            android.view.ViewParent r0 = r3.getParent()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            if (r0 == 0) goto Lb
            r0.removeView(r3)
        Lb:
            androidx.appcompat.view.menu.MenuView r1 = r2.mMenuView
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r1.addView(r3, r4)
            return
    }

    public abstract void bindItemView(androidx.appcompat.view.menu.MenuItemImpl r1, androidx.appcompat.view.menu.MenuView.ItemView r2);

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public boolean collapseItemActionView(androidx.appcompat.view.menu.MenuBuilder r2, androidx.appcompat.view.menu.MenuItemImpl r3) {
            r1 = this;
            r0 = 0
            return r0
    }

    public androidx.appcompat.view.menu.MenuView.ItemView createItemView(android.view.ViewGroup r4) {
            r3 = this;
            android.view.LayoutInflater r0 = r3.mSystemInflater
            int r1 = r3.mItemLayoutRes
            r2 = 0
            android.view.View r0 = r0.inflate(r1, r4, r2)
            androidx.appcompat.view.menu.MenuView$ItemView r0 = (androidx.appcompat.view.menu.MenuView.ItemView) r0
            return r0
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public boolean expandItemActionView(androidx.appcompat.view.menu.MenuBuilder r2, androidx.appcompat.view.menu.MenuItemImpl r3) {
            r1 = this;
            r0 = 0
            return r0
    }

    protected boolean filterLeftoverView(android.view.ViewGroup r2, int r3) {
            r1 = this;
            r2.removeViewAt(r3)
            r0 = 1
            return r0
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public boolean flagActionItems() {
            r1 = this;
            r0 = 0
            return r0
    }

    public androidx.appcompat.view.menu.MenuPresenter.Callback getCallback() {
            r1 = this;
            androidx.appcompat.view.menu.MenuPresenter$Callback r0 = r1.mCallback
            return r0
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public int getId() {
            r1 = this;
            int r0 = r1.mId
            return r0
    }

    public android.view.View getItemView(androidx.appcompat.view.menu.MenuItemImpl r3, android.view.View r4, android.view.ViewGroup r5) {
            r2 = this;
            boolean r0 = r4 instanceof androidx.appcompat.view.menu.MenuView.ItemView
            if (r0 == 0) goto L8
            r0 = r4
            androidx.appcompat.view.menu.MenuView$ItemView r0 = (androidx.appcompat.view.menu.MenuView.ItemView) r0
            goto Lc
        L8:
            androidx.appcompat.view.menu.MenuView$ItemView r0 = r2.createItemView(r5)
        Lc:
            r2.bindItemView(r3, r0)
            r1 = r0
            android.view.View r1 = (android.view.View) r1
            return r1
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public androidx.appcompat.view.menu.MenuView getMenuView(android.view.ViewGroup r4) {
            r3 = this;
            androidx.appcompat.view.menu.MenuView r0 = r3.mMenuView
            if (r0 != 0) goto L1c
            android.view.LayoutInflater r0 = r3.mSystemInflater
            int r1 = r3.mMenuLayoutRes
            r2 = 0
            android.view.View r0 = r0.inflate(r1, r4, r2)
            androidx.appcompat.view.menu.MenuView r0 = (androidx.appcompat.view.menu.MenuView) r0
            r3.mMenuView = r0
            androidx.appcompat.view.menu.MenuView r0 = r3.mMenuView
            androidx.appcompat.view.menu.MenuBuilder r1 = r3.mMenu
            r0.initialize(r1)
            r0 = 1
            r3.updateMenuView(r0)
        L1c:
            androidx.appcompat.view.menu.MenuView r0 = r3.mMenuView
            return r0
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void initForMenu(android.content.Context r2, androidx.appcompat.view.menu.MenuBuilder r3) {
            r1 = this;
            r1.mContext = r2
            android.content.Context r0 = r1.mContext
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            r1.mInflater = r0
            r1.mMenu = r3
            return
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void onCloseMenu(androidx.appcompat.view.menu.MenuBuilder r2, boolean r3) {
            r1 = this;
            androidx.appcompat.view.menu.MenuPresenter$Callback r0 = r1.mCallback
            if (r0 == 0) goto L9
            androidx.appcompat.view.menu.MenuPresenter$Callback r0 = r1.mCallback
            r0.onCloseMenu(r2, r3)
        L9:
            return
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public boolean onSubMenuSelected(androidx.appcompat.view.menu.SubMenuBuilder r3) {
            r2 = this;
            androidx.appcompat.view.menu.MenuPresenter$Callback r0 = r2.mCallback
            if (r0 == 0) goto L11
            androidx.appcompat.view.menu.MenuPresenter$Callback r0 = r2.mCallback
            if (r3 == 0) goto La
            r1 = r3
            goto Lc
        La:
            androidx.appcompat.view.menu.MenuBuilder r1 = r2.mMenu
        Lc:
            boolean r0 = r0.onOpenSubMenu(r1)
            return r0
        L11:
            r0 = 0
            return r0
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void setCallback(androidx.appcompat.view.menu.MenuPresenter.Callback r1) {
            r0 = this;
            r0.mCallback = r1
            return
    }

    public void setId(int r1) {
            r0 = this;
            r0.mId = r1
            return
    }

    public boolean shouldIncludeItem(int r2, androidx.appcompat.view.menu.MenuItemImpl r3) {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void updateMenuView(boolean r11) {
            r10 = this;
            androidx.appcompat.view.menu.MenuView r0 = r10.mMenuView
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            if (r0 != 0) goto L7
            return
        L7:
            r1 = 0
            androidx.appcompat.view.menu.MenuBuilder r2 = r10.mMenu
            if (r2 == 0) goto L52
            androidx.appcompat.view.menu.MenuBuilder r2 = r10.mMenu
            r2.flagActionItems()
            androidx.appcompat.view.menu.MenuBuilder r2 = r10.mMenu
            java.util.ArrayList r2 = r2.getVisibleItems()
            int r3 = r2.size()
            r4 = 0
        L1c:
            if (r4 >= r3) goto L52
            java.lang.Object r5 = r2.get(r4)
            androidx.appcompat.view.menu.MenuItemImpl r5 = (androidx.appcompat.view.menu.MenuItemImpl) r5
            boolean r6 = r10.shouldIncludeItem(r1, r5)
            if (r6 == 0) goto L4f
            android.view.View r6 = r0.getChildAt(r1)
            boolean r7 = r6 instanceof androidx.appcompat.view.menu.MenuView.ItemView
            if (r7 == 0) goto L3a
            r7 = r6
            androidx.appcompat.view.menu.MenuView$ItemView r7 = (androidx.appcompat.view.menu.MenuView.ItemView) r7
            androidx.appcompat.view.menu.MenuItemImpl r7 = r7.getItemData()
            goto L3b
        L3a:
            r7 = 0
        L3b:
            android.view.View r8 = r10.getItemView(r5, r6, r0)
            if (r5 == r7) goto L48
            r9 = 0
            r8.setPressed(r9)
            r8.jumpDrawablesToCurrentState()
        L48:
            if (r8 == r6) goto L4d
            r10.addItemView(r8, r1)
        L4d:
            int r1 = r1 + 1
        L4f:
            int r4 = r4 + 1
            goto L1c
        L52:
            int r2 = r0.getChildCount()
            if (r1 >= r2) goto L61
            boolean r2 = r10.filterLeftoverView(r0, r1)
            if (r2 != 0) goto L52
            int r1 = r1 + 1
            goto L52
        L61:
            return
    }
}
