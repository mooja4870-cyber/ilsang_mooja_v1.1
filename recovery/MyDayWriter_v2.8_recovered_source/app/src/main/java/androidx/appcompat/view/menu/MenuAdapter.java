package androidx.appcompat.view.menu;

/* JADX INFO: loaded from: classes.dex */
public class MenuAdapter extends android.widget.BaseAdapter {
    androidx.appcompat.view.menu.MenuBuilder mAdapterMenu;
    private int mExpandedIndex;
    private boolean mForceShowIcon;
    private final android.view.LayoutInflater mInflater;
    private final int mItemLayoutRes;
    private final boolean mOverflowOnly;

    public MenuAdapter(androidx.appcompat.view.menu.MenuBuilder r2, android.view.LayoutInflater r3, boolean r4, int r5) {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.mExpandedIndex = r0
            r1.mOverflowOnly = r4
            r1.mInflater = r3
            r1.mAdapterMenu = r2
            r1.mItemLayoutRes = r5
            r1.findExpandedIndex()
            return
    }

    void findExpandedIndex() {
            r5 = this;
            androidx.appcompat.view.menu.MenuBuilder r0 = r5.mAdapterMenu
            androidx.appcompat.view.menu.MenuItemImpl r0 = r0.getExpandedItem()
            if (r0 == 0) goto L23
            androidx.appcompat.view.menu.MenuBuilder r1 = r5.mAdapterMenu
            java.util.ArrayList r1 = r1.getNonActionItems()
            int r2 = r1.size()
            r3 = 0
        L13:
            if (r3 >= r2) goto L23
            java.lang.Object r4 = r1.get(r3)
            androidx.appcompat.view.menu.MenuItemImpl r4 = (androidx.appcompat.view.menu.MenuItemImpl) r4
            if (r4 != r0) goto L20
            r5.mExpandedIndex = r3
            return
        L20:
            int r3 = r3 + 1
            goto L13
        L23:
            r1 = -1
            r5.mExpandedIndex = r1
            return
    }

    public androidx.appcompat.view.menu.MenuBuilder getAdapterMenu() {
            r1 = this;
            androidx.appcompat.view.menu.MenuBuilder r0 = r1.mAdapterMenu
            return r0
    }

    @Override // android.widget.Adapter
    public int getCount() {
            r2 = this;
            boolean r0 = r2.mOverflowOnly
            if (r0 == 0) goto Lb
            androidx.appcompat.view.menu.MenuBuilder r0 = r2.mAdapterMenu
            java.util.ArrayList r0 = r0.getNonActionItems()
            goto L11
        Lb:
            androidx.appcompat.view.menu.MenuBuilder r0 = r2.mAdapterMenu
            java.util.ArrayList r0 = r0.getVisibleItems()
        L11:
            int r1 = r2.mExpandedIndex
            if (r1 >= 0) goto L1a
            int r1 = r0.size()
            return r1
        L1a:
            int r1 = r0.size()
            int r1 = r1 + (-1)
            return r1
    }

    public boolean getForceShowIcon() {
            r1 = this;
            boolean r0 = r1.mForceShowIcon
            return r0
    }

    @Override // android.widget.Adapter
    public androidx.appcompat.view.menu.MenuItemImpl getItem(int r3) {
            r2 = this;
            boolean r0 = r2.mOverflowOnly
            if (r0 == 0) goto Lb
            androidx.appcompat.view.menu.MenuBuilder r0 = r2.mAdapterMenu
            java.util.ArrayList r0 = r0.getNonActionItems()
            goto L11
        Lb:
            androidx.appcompat.view.menu.MenuBuilder r0 = r2.mAdapterMenu
            java.util.ArrayList r0 = r0.getVisibleItems()
        L11:
            int r1 = r2.mExpandedIndex
            if (r1 < 0) goto L1b
            int r1 = r2.mExpandedIndex
            if (r3 < r1) goto L1b
            int r3 = r3 + 1
        L1b:
            java.lang.Object r1 = r0.get(r3)
            androidx.appcompat.view.menu.MenuItemImpl r1 = (androidx.appcompat.view.menu.MenuItemImpl) r1
            return r1
    }

    @Override // android.widget.Adapter
    public /* bridge */ /* synthetic */ java.lang.Object getItem(int r1) {
            r0 = this;
            androidx.appcompat.view.menu.MenuItemImpl r1 = r0.getItem(r1)
            return r1
    }

    @Override // android.widget.Adapter
    public long getItemId(int r3) {
            r2 = this;
            long r0 = (long) r3
            return r0
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int r7, android.view.View r8, android.view.ViewGroup r9) {
            r6 = this;
            r0 = 0
            if (r8 != 0) goto Lb
            android.view.LayoutInflater r1 = r6.mInflater
            int r2 = r6.mItemLayoutRes
            android.view.View r8 = r1.inflate(r2, r9, r0)
        Lb:
            androidx.appcompat.view.menu.MenuItemImpl r1 = r6.getItem(r7)
            int r1 = r1.getGroupId()
            int r2 = r7 + (-1)
            if (r2 < 0) goto L22
            int r2 = r7 + (-1)
            androidx.appcompat.view.menu.MenuItemImpl r2 = r6.getItem(r2)
            int r2 = r2.getGroupId()
            goto L23
        L22:
            r2 = r1
        L23:
            r3 = r8
            androidx.appcompat.view.menu.ListMenuItemView r3 = (androidx.appcompat.view.menu.ListMenuItemView) r3
            androidx.appcompat.view.menu.MenuBuilder r4 = r6.mAdapterMenu
            boolean r4 = r4.isGroupDividerEnabled()
            r5 = 1
            if (r4 == 0) goto L33
            if (r1 == r2) goto L33
            r4 = r5
            goto L34
        L33:
            r4 = r0
        L34:
            r3.setGroupDividerEnabled(r4)
            r3 = r8
            androidx.appcompat.view.menu.MenuView$ItemView r3 = (androidx.appcompat.view.menu.MenuView.ItemView) r3
            boolean r4 = r6.mForceShowIcon
            if (r4 == 0) goto L44
            r4 = r8
            androidx.appcompat.view.menu.ListMenuItemView r4 = (androidx.appcompat.view.menu.ListMenuItemView) r4
            r4.setForceShowIcon(r5)
        L44:
            androidx.appcompat.view.menu.MenuItemImpl r4 = r6.getItem(r7)
            r3.initialize(r4, r0)
            return r8
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
            r0 = this;
            r0.findExpandedIndex()
            super.notifyDataSetChanged()
            return
    }

    public void setForceShowIcon(boolean r1) {
            r0 = this;
            r0.mForceShowIcon = r1
            return
    }
}
