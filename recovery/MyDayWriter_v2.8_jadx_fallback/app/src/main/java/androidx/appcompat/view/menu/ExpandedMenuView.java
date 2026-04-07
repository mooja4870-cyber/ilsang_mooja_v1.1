package androidx.appcompat.view.menu;

/* JADX INFO: loaded from: classes.dex */
public final class ExpandedMenuView extends android.widget.ListView implements androidx.appcompat.view.menu.MenuBuilder.ItemInvoker, androidx.appcompat.view.menu.MenuView, android.widget.AdapterView.OnItemClickListener {
    private static final int[] TINT_ATTRS = null;
    private int mAnimations;
    private androidx.appcompat.view.menu.MenuBuilder mMenu;

    static {
            r0 = 16842964(0x10100d4, float:2.3694152E-38)
            r1 = 16843049(0x1010129, float:2.369439E-38)
            int[] r0 = new int[]{r0, r1}
            androidx.appcompat.view.menu.ExpandedMenuView.TINT_ATTRS = r0
            return
    }

    public ExpandedMenuView(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 16842868(0x1010074, float:2.3693883E-38)
            r1.<init>(r2, r3, r0)
            return
    }

    public ExpandedMenuView(android.content.Context r4, android.util.AttributeSet r5, int r6) {
            r3 = this;
            r3.<init>(r4, r5)
            r3.setOnItemClickListener(r3)
            int[] r0 = androidx.appcompat.view.menu.ExpandedMenuView.TINT_ATTRS
            r1 = 0
            androidx.appcompat.widget.TintTypedArray r0 = androidx.appcompat.widget.TintTypedArray.obtainStyledAttributes(r4, r5, r0, r6, r1)
            boolean r2 = r0.hasValue(r1)
            if (r2 == 0) goto L1a
            android.graphics.drawable.Drawable r1 = r0.getDrawable(r1)
            r3.setBackgroundDrawable(r1)
        L1a:
            r1 = 1
            boolean r2 = r0.hasValue(r1)
            if (r2 == 0) goto L28
            android.graphics.drawable.Drawable r1 = r0.getDrawable(r1)
            r3.setDivider(r1)
        L28:
            r0.recycle()
            return
    }

    @Override // androidx.appcompat.view.menu.MenuView
    public int getWindowAnimations() {
            r1 = this;
            int r0 = r1.mAnimations
            return r0
    }

    @Override // androidx.appcompat.view.menu.MenuView
    public void initialize(androidx.appcompat.view.menu.MenuBuilder r1) {
            r0 = this;
            r0.mMenu = r1
            return
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder.ItemInvoker
    public boolean invokeItem(androidx.appcompat.view.menu.MenuItemImpl r3) {
            r2 = this;
            androidx.appcompat.view.menu.MenuBuilder r0 = r2.mMenu
            r1 = 0
            boolean r0 = r0.performItemAction(r3, r1)
            return r0
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
            r1 = this;
            super.onDetachedFromWindow()
            r0 = 0
            r1.setChildrenDrawingCacheEnabled(r0)
            return
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView r2, android.view.View r3, int r4, long r5) {
            r1 = this;
            android.widget.ListAdapter r0 = r1.getAdapter()
            java.lang.Object r0 = r0.getItem(r4)
            androidx.appcompat.view.menu.MenuItemImpl r0 = (androidx.appcompat.view.menu.MenuItemImpl) r0
            r1.invokeItem(r0)
            return
    }
}
