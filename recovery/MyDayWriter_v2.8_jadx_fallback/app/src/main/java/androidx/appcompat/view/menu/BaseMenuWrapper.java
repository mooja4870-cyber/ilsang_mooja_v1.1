package androidx.appcompat.view.menu;

/* JADX INFO: loaded from: classes.dex */
abstract class BaseMenuWrapper {
    final android.content.Context mContext;
    private androidx.collection.SimpleArrayMap<androidx.core.internal.view.SupportMenuItem, android.view.MenuItem> mMenuItems;
    private androidx.collection.SimpleArrayMap<androidx.core.internal.view.SupportSubMenu, android.view.SubMenu> mSubMenus;

    BaseMenuWrapper(android.content.Context r1) {
            r0 = this;
            r0.<init>()
            r0.mContext = r1
            return
    }

    final android.view.MenuItem getMenuItemWrapper(android.view.MenuItem r5) {
            r4 = this;
            boolean r0 = r5 instanceof androidx.core.internal.view.SupportMenuItem
            if (r0 == 0) goto L2a
            r0 = r5
            androidx.core.internal.view.SupportMenuItem r0 = (androidx.core.internal.view.SupportMenuItem) r0
            androidx.collection.SimpleArrayMap<androidx.core.internal.view.SupportMenuItem, android.view.MenuItem> r1 = r4.mMenuItems
            if (r1 != 0) goto L12
            androidx.collection.SimpleArrayMap r1 = new androidx.collection.SimpleArrayMap
            r1.<init>()
            r4.mMenuItems = r1
        L12:
            androidx.collection.SimpleArrayMap<androidx.core.internal.view.SupportMenuItem, android.view.MenuItem> r1 = r4.mMenuItems
            java.lang.Object r1 = r1.get(r0)
            android.view.MenuItem r1 = (android.view.MenuItem) r1
            if (r1 != 0) goto L29
            androidx.appcompat.view.menu.MenuItemWrapperICS r2 = new androidx.appcompat.view.menu.MenuItemWrapperICS
            android.content.Context r3 = r4.mContext
            r2.<init>(r3, r0)
            r1 = r2
            androidx.collection.SimpleArrayMap<androidx.core.internal.view.SupportMenuItem, android.view.MenuItem> r2 = r4.mMenuItems
            r2.put(r0, r1)
        L29:
            return r1
        L2a:
            return r5
    }

    final android.view.SubMenu getSubMenuWrapper(android.view.SubMenu r5) {
            r4 = this;
            boolean r0 = r5 instanceof androidx.core.internal.view.SupportSubMenu
            if (r0 == 0) goto L2a
            r0 = r5
            androidx.core.internal.view.SupportSubMenu r0 = (androidx.core.internal.view.SupportSubMenu) r0
            androidx.collection.SimpleArrayMap<androidx.core.internal.view.SupportSubMenu, android.view.SubMenu> r1 = r4.mSubMenus
            if (r1 != 0) goto L12
            androidx.collection.SimpleArrayMap r1 = new androidx.collection.SimpleArrayMap
            r1.<init>()
            r4.mSubMenus = r1
        L12:
            androidx.collection.SimpleArrayMap<androidx.core.internal.view.SupportSubMenu, android.view.SubMenu> r1 = r4.mSubMenus
            java.lang.Object r1 = r1.get(r0)
            android.view.SubMenu r1 = (android.view.SubMenu) r1
            if (r1 != 0) goto L29
            androidx.appcompat.view.menu.SubMenuWrapperICS r2 = new androidx.appcompat.view.menu.SubMenuWrapperICS
            android.content.Context r3 = r4.mContext
            r2.<init>(r3, r0)
            r1 = r2
            androidx.collection.SimpleArrayMap<androidx.core.internal.view.SupportSubMenu, android.view.SubMenu> r2 = r4.mSubMenus
            r2.put(r0, r1)
        L29:
            return r1
        L2a:
            return r5
    }

    final void internalClear() {
            r1 = this;
            androidx.collection.SimpleArrayMap<androidx.core.internal.view.SupportMenuItem, android.view.MenuItem> r0 = r1.mMenuItems
            if (r0 == 0) goto L9
            androidx.collection.SimpleArrayMap<androidx.core.internal.view.SupportMenuItem, android.view.MenuItem> r0 = r1.mMenuItems
            r0.clear()
        L9:
            androidx.collection.SimpleArrayMap<androidx.core.internal.view.SupportSubMenu, android.view.SubMenu> r0 = r1.mSubMenus
            if (r0 == 0) goto L12
            androidx.collection.SimpleArrayMap<androidx.core.internal.view.SupportSubMenu, android.view.SubMenu> r0 = r1.mSubMenus
            r0.clear()
        L12:
            return
    }

    final void internalRemoveGroup(int r3) {
            r2 = this;
            androidx.collection.SimpleArrayMap<androidx.core.internal.view.SupportMenuItem, android.view.MenuItem> r0 = r2.mMenuItems
            if (r0 != 0) goto L5
            return
        L5:
            r0 = 0
        L6:
            androidx.collection.SimpleArrayMap<androidx.core.internal.view.SupportMenuItem, android.view.MenuItem> r1 = r2.mMenuItems
            int r1 = r1.size()
            if (r0 >= r1) goto L26
            androidx.collection.SimpleArrayMap<androidx.core.internal.view.SupportMenuItem, android.view.MenuItem> r1 = r2.mMenuItems
            java.lang.Object r1 = r1.keyAt(r0)
            androidx.core.internal.view.SupportMenuItem r1 = (androidx.core.internal.view.SupportMenuItem) r1
            int r1 = r1.getGroupId()
            if (r1 != r3) goto L23
            androidx.collection.SimpleArrayMap<androidx.core.internal.view.SupportMenuItem, android.view.MenuItem> r1 = r2.mMenuItems
            r1.removeAt(r0)
            int r0 = r0 + (-1)
        L23:
            int r0 = r0 + 1
            goto L6
        L26:
            return
    }

    final void internalRemoveItem(int r3) {
            r2 = this;
            androidx.collection.SimpleArrayMap<androidx.core.internal.view.SupportMenuItem, android.view.MenuItem> r0 = r2.mMenuItems
            if (r0 != 0) goto L5
            return
        L5:
            r0 = 0
        L6:
            androidx.collection.SimpleArrayMap<androidx.core.internal.view.SupportMenuItem, android.view.MenuItem> r1 = r2.mMenuItems
            int r1 = r1.size()
            if (r0 >= r1) goto L25
            androidx.collection.SimpleArrayMap<androidx.core.internal.view.SupportMenuItem, android.view.MenuItem> r1 = r2.mMenuItems
            java.lang.Object r1 = r1.keyAt(r0)
            androidx.core.internal.view.SupportMenuItem r1 = (androidx.core.internal.view.SupportMenuItem) r1
            int r1 = r1.getItemId()
            if (r1 != r3) goto L22
            androidx.collection.SimpleArrayMap<androidx.core.internal.view.SupportMenuItem, android.view.MenuItem> r1 = r2.mMenuItems
            r1.removeAt(r0)
            goto L25
        L22:
            int r0 = r0 + 1
            goto L6
        L25:
            return
    }
}
