package androidx.appcompat.view.menu;

/* JADX INFO: loaded from: classes.dex */
abstract class MenuPopup implements androidx.appcompat.view.menu.ShowableListMenu, androidx.appcompat.view.menu.MenuPresenter, android.widget.AdapterView.OnItemClickListener {
    private android.graphics.Rect mEpicenterBounds;

    MenuPopup() {
            r0 = this;
            r0.<init>()
            return
    }

    protected static int measureIndividualMenuWidth(android.widget.ListAdapter r9, android.view.ViewGroup r10, android.content.Context r11, int r12) {
            r0 = 0
            r1 = 0
            r2 = 0
            r3 = 0
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r3)
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r3)
            int r5 = r9.getCount()
            r6 = 0
        L11:
            if (r6 >= r5) goto L37
            int r7 = r9.getItemViewType(r6)
            if (r7 == r2) goto L1b
            r2 = r7
            r1 = 0
        L1b:
            if (r10 != 0) goto L23
            android.widget.FrameLayout r8 = new android.widget.FrameLayout
            r8.<init>(r11)
            r10 = r8
        L23:
            android.view.View r1 = r9.getView(r6, r1, r10)
            r1.measure(r4, r3)
            int r8 = r1.getMeasuredWidth()
            if (r8 < r12) goto L31
            return r12
        L31:
            if (r8 <= r0) goto L34
            r0 = r8
        L34:
            int r6 = r6 + 1
            goto L11
        L37:
            return r0
    }

    protected static boolean shouldPreserveIconSpacing(androidx.appcompat.view.menu.MenuBuilder r5) {
            r0 = 0
            int r1 = r5.size()
            r2 = 0
        L6:
            if (r2 >= r1) goto L1d
            android.view.MenuItem r3 = r5.getItem(r2)
            boolean r4 = r3.isVisible()
            if (r4 == 0) goto L1a
            android.graphics.drawable.Drawable r4 = r3.getIcon()
            if (r4 == 0) goto L1a
            r0 = 1
            goto L1d
        L1a:
            int r2 = r2 + 1
            goto L6
        L1d:
            return r0
    }

    protected static androidx.appcompat.view.menu.MenuAdapter toMenuAdapter(android.widget.ListAdapter r1) {
            boolean r0 = r1 instanceof android.widget.HeaderViewListAdapter
            if (r0 == 0) goto Le
            r0 = r1
            android.widget.HeaderViewListAdapter r0 = (android.widget.HeaderViewListAdapter) r0
            android.widget.ListAdapter r0 = r0.getWrappedAdapter()
            androidx.appcompat.view.menu.MenuAdapter r0 = (androidx.appcompat.view.menu.MenuAdapter) r0
            return r0
        Le:
            r0 = r1
            androidx.appcompat.view.menu.MenuAdapter r0 = (androidx.appcompat.view.menu.MenuAdapter) r0
            return r0
    }

    public abstract void addMenu(androidx.appcompat.view.menu.MenuBuilder r1);

    protected boolean closeMenuOnSubMenuOpened() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public boolean collapseItemActionView(androidx.appcompat.view.menu.MenuBuilder r2, androidx.appcompat.view.menu.MenuItemImpl r3) {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public boolean expandItemActionView(androidx.appcompat.view.menu.MenuBuilder r2, androidx.appcompat.view.menu.MenuItemImpl r3) {
            r1 = this;
            r0 = 0
            return r0
    }

    public android.graphics.Rect getEpicenterBounds() {
            r1 = this;
            android.graphics.Rect r0 = r1.mEpicenterBounds
            return r0
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public int getId() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public androidx.appcompat.view.menu.MenuView getMenuView(android.view.ViewGroup r3) {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "MenuPopups manage their own views"
            r0.<init>(r1)
            throw r0
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void initForMenu(android.content.Context r1, androidx.appcompat.view.menu.MenuBuilder r2) {
            r0 = this;
            return
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView<?> r6, android.view.View r7, int r8, long r9) {
            r5 = this;
            android.widget.Adapter r0 = r6.getAdapter()
            android.widget.ListAdapter r0 = (android.widget.ListAdapter) r0
            androidx.appcompat.view.menu.MenuAdapter r1 = toMenuAdapter(r0)
            androidx.appcompat.view.menu.MenuBuilder r2 = r1.mAdapterMenu
            java.lang.Object r3 = r0.getItem(r8)
            android.view.MenuItem r3 = (android.view.MenuItem) r3
            boolean r4 = r5.closeMenuOnSubMenuOpened()
            if (r4 == 0) goto L1a
            r4 = 0
            goto L1b
        L1a:
            r4 = 4
        L1b:
            r2.performItemAction(r3, r5, r4)
            return
    }

    public abstract void setAnchorView(android.view.View r1);

    public void setEpicenterBounds(android.graphics.Rect r1) {
            r0 = this;
            r0.mEpicenterBounds = r1
            return
    }

    public abstract void setForceShowIcon(boolean r1);

    public abstract void setGravity(int r1);

    public abstract void setHorizontalOffset(int r1);

    public abstract void setOnDismissListener(android.widget.PopupWindow.OnDismissListener r1);

    public abstract void setShowTitle(boolean r1);

    public abstract void setVerticalOffset(int r1);
}
