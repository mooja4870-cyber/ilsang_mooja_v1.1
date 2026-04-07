package androidx.appcompat.view.menu;

/* JADX INFO: loaded from: classes.dex */
class MenuDialogHelper implements android.content.DialogInterface.OnKeyListener, android.content.DialogInterface.OnClickListener, android.content.DialogInterface.OnDismissListener, androidx.appcompat.view.menu.MenuPresenter.Callback {
    private androidx.appcompat.app.AlertDialog mDialog;
    private androidx.appcompat.view.menu.MenuBuilder mMenu;
    androidx.appcompat.view.menu.ListMenuPresenter mPresenter;
    private androidx.appcompat.view.menu.MenuPresenter.Callback mPresenterCallback;

    public MenuDialogHelper(androidx.appcompat.view.menu.MenuBuilder r1) {
            r0 = this;
            r0.<init>()
            r0.mMenu = r1
            return
    }

    public void dismiss() {
            r1 = this;
            androidx.appcompat.app.AlertDialog r0 = r1.mDialog
            if (r0 == 0) goto L9
            androidx.appcompat.app.AlertDialog r0 = r1.mDialog
            r0.dismiss()
        L9:
            return
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface r4, int r5) {
            r3 = this;
            androidx.appcompat.view.menu.MenuBuilder r0 = r3.mMenu
            androidx.appcompat.view.menu.ListMenuPresenter r1 = r3.mPresenter
            android.widget.ListAdapter r1 = r1.getAdapter()
            java.lang.Object r1 = r1.getItem(r5)
            androidx.appcompat.view.menu.MenuItemImpl r1 = (androidx.appcompat.view.menu.MenuItemImpl) r1
            r2 = 0
            r0.performItemAction(r1, r2)
            return
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter.Callback
    public void onCloseMenu(androidx.appcompat.view.menu.MenuBuilder r2, boolean r3) {
            r1 = this;
            if (r3 != 0) goto L6
            androidx.appcompat.view.menu.MenuBuilder r0 = r1.mMenu
            if (r2 != r0) goto L9
        L6:
            r1.dismiss()
        L9:
            androidx.appcompat.view.menu.MenuPresenter$Callback r0 = r1.mPresenterCallback
            if (r0 == 0) goto L12
            androidx.appcompat.view.menu.MenuPresenter$Callback r0 = r1.mPresenterCallback
            r0.onCloseMenu(r2, r3)
        L12:
            return
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(android.content.DialogInterface r4) {
            r3 = this;
            androidx.appcompat.view.menu.ListMenuPresenter r0 = r3.mPresenter
            androidx.appcompat.view.menu.MenuBuilder r1 = r3.mMenu
            r2 = 1
            r0.onCloseMenu(r1, r2)
            return
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public boolean onKey(android.content.DialogInterface r6, int r7, android.view.KeyEvent r8) {
            r5 = this;
            r0 = 82
            if (r7 == r0) goto L7
            r0 = 4
            if (r7 != r0) goto L5c
        L7:
            int r0 = r8.getAction()
            r1 = 1
            if (r0 != 0) goto L2c
            int r0 = r8.getRepeatCount()
            if (r0 != 0) goto L2c
            androidx.appcompat.app.AlertDialog r0 = r5.mDialog
            android.view.Window r0 = r0.getWindow()
            if (r0 == 0) goto L5b
            android.view.View r2 = r0.getDecorView()
            if (r2 == 0) goto L5b
            android.view.KeyEvent$DispatcherState r3 = r2.getKeyDispatcherState()
            if (r3 == 0) goto L5b
            r3.startTracking(r8, r5)
            return r1
        L2c:
            int r0 = r8.getAction()
            if (r0 != r1) goto L5b
            boolean r0 = r8.isCanceled()
            if (r0 != 0) goto L5b
            androidx.appcompat.app.AlertDialog r0 = r5.mDialog
            android.view.Window r0 = r0.getWindow()
            if (r0 == 0) goto L5c
            android.view.View r2 = r0.getDecorView()
            if (r2 == 0) goto L5c
            android.view.KeyEvent$DispatcherState r3 = r2.getKeyDispatcherState()
            if (r3 == 0) goto L5c
            boolean r4 = r3.isTracking(r8)
            if (r4 == 0) goto L5c
            androidx.appcompat.view.menu.MenuBuilder r4 = r5.mMenu
            r4.close(r1)
            r6.dismiss()
            return r1
        L5b:
        L5c:
            androidx.appcompat.view.menu.MenuBuilder r0 = r5.mMenu
            r1 = 0
            boolean r0 = r0.performShortcut(r7, r8, r1)
            return r0
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter.Callback
    public boolean onOpenSubMenu(androidx.appcompat.view.menu.MenuBuilder r2) {
            r1 = this;
            androidx.appcompat.view.menu.MenuPresenter$Callback r0 = r1.mPresenterCallback
            if (r0 == 0) goto Lb
            androidx.appcompat.view.menu.MenuPresenter$Callback r0 = r1.mPresenterCallback
            boolean r0 = r0.onOpenSubMenu(r2)
            return r0
        Lb:
            r0 = 0
            return r0
    }

    public void setPresenterCallback(androidx.appcompat.view.menu.MenuPresenter.Callback r1) {
            r0 = this;
            r0.mPresenterCallback = r1
            return
    }

    public void show(android.os.IBinder r7) {
            r6 = this;
            androidx.appcompat.view.menu.MenuBuilder r0 = r6.mMenu
            androidx.appcompat.app.AlertDialog$Builder r1 = new androidx.appcompat.app.AlertDialog$Builder
            android.content.Context r2 = r0.getContext()
            r1.<init>(r2)
            androidx.appcompat.view.menu.ListMenuPresenter r2 = new androidx.appcompat.view.menu.ListMenuPresenter
            android.content.Context r3 = r1.getContext()
            int r4 = androidx.appcompat.R.layout.abc_list_menu_item_layout
            r2.<init>(r3, r4)
            r6.mPresenter = r2
            androidx.appcompat.view.menu.ListMenuPresenter r2 = r6.mPresenter
            r2.setCallback(r6)
            androidx.appcompat.view.menu.MenuBuilder r2 = r6.mMenu
            androidx.appcompat.view.menu.ListMenuPresenter r3 = r6.mPresenter
            r2.addMenuPresenter(r3)
            androidx.appcompat.view.menu.ListMenuPresenter r2 = r6.mPresenter
            android.widget.ListAdapter r2 = r2.getAdapter()
            r1.setAdapter(r2, r6)
            android.view.View r2 = r0.getHeaderView()
            if (r2 == 0) goto L37
            r1.setCustomTitle(r2)
            goto L46
        L37:
            android.graphics.drawable.Drawable r3 = r0.getHeaderIcon()
            androidx.appcompat.app.AlertDialog$Builder r3 = r1.setIcon(r3)
            java.lang.CharSequence r4 = r0.getHeaderTitle()
            r3.setTitle(r4)
        L46:
            r1.setOnKeyListener(r6)
            androidx.appcompat.app.AlertDialog r3 = r1.create()
            r6.mDialog = r3
            androidx.appcompat.app.AlertDialog r3 = r6.mDialog
            r3.setOnDismissListener(r6)
            androidx.appcompat.app.AlertDialog r3 = r6.mDialog
            android.view.Window r3 = r3.getWindow()
            android.view.WindowManager$LayoutParams r3 = r3.getAttributes()
            r4 = 1003(0x3eb, float:1.406E-42)
            r3.type = r4
            if (r7 == 0) goto L66
            r3.token = r7
        L66:
            int r4 = r3.flags
            r5 = 131072(0x20000, float:1.83671E-40)
            r4 = r4 | r5
            r3.flags = r4
            androidx.appcompat.app.AlertDialog r4 = r6.mDialog
            r4.show()
            return
    }
}
