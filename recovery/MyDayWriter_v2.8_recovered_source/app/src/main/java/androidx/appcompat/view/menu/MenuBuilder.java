package androidx.appcompat.view.menu;

/* JADX INFO: loaded from: classes.dex */
public class MenuBuilder implements androidx.core.internal.view.SupportMenu {
    private static final java.lang.String ACTION_VIEW_STATES_KEY = "android:menu:actionviewstates";
    private static final java.lang.String EXPANDED_ACTION_VIEW_ID = "android:menu:expandedactionview";
    private static final java.lang.String PRESENTER_KEY = "android:menu:presenters";
    private static final java.lang.String TAG = "MenuBuilder";
    private static final int[] sCategoryToOrder = null;
    private java.util.ArrayList<androidx.appcompat.view.menu.MenuItemImpl> mActionItems;
    private androidx.appcompat.view.menu.MenuBuilder.Callback mCallback;
    private final android.content.Context mContext;
    private android.view.ContextMenu.ContextMenuInfo mCurrentMenuInfo;
    private int mDefaultShowAsAction;
    private androidx.appcompat.view.menu.MenuItemImpl mExpandedItem;
    private boolean mGroupDividerEnabled;
    android.graphics.drawable.Drawable mHeaderIcon;
    java.lang.CharSequence mHeaderTitle;
    android.view.View mHeaderView;
    private boolean mIsActionItemsStale;
    private boolean mIsClosing;
    private boolean mIsVisibleItemsStale;
    private java.util.ArrayList<androidx.appcompat.view.menu.MenuItemImpl> mItems;
    private boolean mItemsChangedWhileDispatchPrevented;
    private java.util.ArrayList<androidx.appcompat.view.menu.MenuItemImpl> mNonActionItems;
    private boolean mOptionalIconsVisible;
    private boolean mOverrideVisibleItems;
    private java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<androidx.appcompat.view.menu.MenuPresenter>> mPresenters;
    private boolean mPreventDispatchingItemsChanged;
    private boolean mQwertyMode;
    private final android.content.res.Resources mResources;
    private boolean mShortcutsVisible;
    private boolean mStructureChangedWhileDispatchPrevented;
    private java.util.ArrayList<androidx.appcompat.view.menu.MenuItemImpl> mTempShortcutItemList;
    private java.util.ArrayList<androidx.appcompat.view.menu.MenuItemImpl> mVisibleItems;

    public interface Callback {
        boolean onMenuItemSelected(androidx.appcompat.view.menu.MenuBuilder r1, android.view.MenuItem r2);

        void onMenuModeChange(androidx.appcompat.view.menu.MenuBuilder r1);
    }

    public interface ItemInvoker {
        boolean invokeItem(androidx.appcompat.view.menu.MenuItemImpl r1);
    }

    static {
            r0 = 6
            int[] r0 = new int[r0]
            r0 = {x000a: FILL_ARRAY_DATA , data: [1, 4, 5, 3, 2, 0} // fill-array
            androidx.appcompat.view.menu.MenuBuilder.sCategoryToOrder = r0
            return
    }

    public MenuBuilder(android.content.Context r3) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.mDefaultShowAsAction = r0
            r2.mPreventDispatchingItemsChanged = r0
            r2.mItemsChangedWhileDispatchPrevented = r0
            r2.mStructureChangedWhileDispatchPrevented = r0
            r2.mOptionalIconsVisible = r0
            r2.mIsClosing = r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2.mTempShortcutItemList = r1
            java.util.concurrent.CopyOnWriteArrayList r1 = new java.util.concurrent.CopyOnWriteArrayList
            r1.<init>()
            r2.mPresenters = r1
            r2.mGroupDividerEnabled = r0
            r2.mContext = r3
            android.content.res.Resources r0 = r3.getResources()
            r2.mResources = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.mItems = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.mVisibleItems = r0
            r0 = 1
            r2.mIsVisibleItemsStale = r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2.mActionItems = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2.mNonActionItems = r1
            r2.mIsActionItemsStale = r0
            r2.setShortcutsVisibleInner(r0)
            return
    }

    private androidx.appcompat.view.menu.MenuItemImpl createNewMenuItem(int r9, int r10, int r11, int r12, java.lang.CharSequence r13, int r14) {
            r8 = this;
            androidx.appcompat.view.menu.MenuItemImpl r0 = new androidx.appcompat.view.menu.MenuItemImpl
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r0
    }

    private void dispatchPresenterUpdate(boolean r5) {
            r4 = this;
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<androidx.appcompat.view.menu.MenuPresenter>> r0 = r4.mPresenters
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L9
            return
        L9:
            r4.stopDispatchingItemsChanged()
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<androidx.appcompat.view.menu.MenuPresenter>> r0 = r4.mPresenters
            java.util.Iterator r0 = r0.iterator()
        L12:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L30
            java.lang.Object r1 = r0.next()
            java.lang.ref.WeakReference r1 = (java.lang.ref.WeakReference) r1
            java.lang.Object r2 = r1.get()
            androidx.appcompat.view.menu.MenuPresenter r2 = (androidx.appcompat.view.menu.MenuPresenter) r2
            if (r2 != 0) goto L2c
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<androidx.appcompat.view.menu.MenuPresenter>> r3 = r4.mPresenters
            r3.remove(r1)
            goto L2f
        L2c:
            r2.updateMenuView(r5)
        L2f:
            goto L12
        L30:
            r4.startDispatchingItemsChanged()
            return
    }

    private void dispatchRestoreInstanceState(android.os.Bundle r7) {
            r6 = this;
            java.lang.String r0 = "android:menu:presenters"
            android.util.SparseArray r0 = r7.getSparseParcelableArray(r0)
            if (r0 == 0) goto L44
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<androidx.appcompat.view.menu.MenuPresenter>> r1 = r6.mPresenters
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L11
            goto L44
        L11:
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<androidx.appcompat.view.menu.MenuPresenter>> r1 = r6.mPresenters
            java.util.Iterator r1 = r1.iterator()
        L17:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L43
            java.lang.Object r2 = r1.next()
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2
            java.lang.Object r3 = r2.get()
            androidx.appcompat.view.menu.MenuPresenter r3 = (androidx.appcompat.view.menu.MenuPresenter) r3
            if (r3 != 0) goto L31
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<androidx.appcompat.view.menu.MenuPresenter>> r4 = r6.mPresenters
            r4.remove(r2)
            goto L42
        L31:
            int r4 = r3.getId()
            if (r4 <= 0) goto L42
            java.lang.Object r5 = r0.get(r4)
            android.os.Parcelable r5 = (android.os.Parcelable) r5
            if (r5 == 0) goto L42
            r3.onRestoreInstanceState(r5)
        L42:
            goto L17
        L43:
            return
        L44:
            return
    }

    private void dispatchSaveInstanceState(android.os.Bundle r7) {
            r6 = this;
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<androidx.appcompat.view.menu.MenuPresenter>> r0 = r6.mPresenters
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L9
            return
        L9:
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<androidx.appcompat.view.menu.MenuPresenter>> r1 = r6.mPresenters
            java.util.Iterator r1 = r1.iterator()
        L14:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L3e
            java.lang.Object r2 = r1.next()
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2
            java.lang.Object r3 = r2.get()
            androidx.appcompat.view.menu.MenuPresenter r3 = (androidx.appcompat.view.menu.MenuPresenter) r3
            if (r3 != 0) goto L2e
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<androidx.appcompat.view.menu.MenuPresenter>> r4 = r6.mPresenters
            r4.remove(r2)
            goto L3d
        L2e:
            int r4 = r3.getId()
            if (r4 <= 0) goto L3d
            android.os.Parcelable r5 = r3.onSaveInstanceState()
            if (r5 == 0) goto L3d
            r0.put(r4, r5)
        L3d:
            goto L14
        L3e:
            java.lang.String r1 = "android:menu:presenters"
            r7.putSparseParcelableArray(r1, r0)
            return
    }

    private boolean dispatchSubMenuSelected(androidx.appcompat.view.menu.SubMenuBuilder r6, androidx.appcompat.view.menu.MenuPresenter r7) {
            r5 = this;
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<androidx.appcompat.view.menu.MenuPresenter>> r0 = r5.mPresenters
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto La
            r0 = 0
            return r0
        La:
            r0 = 0
            if (r7 == 0) goto L11
            boolean r0 = r7.onSubMenuSelected(r6)
        L11:
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<androidx.appcompat.view.menu.MenuPresenter>> r1 = r5.mPresenters
            java.util.Iterator r1 = r1.iterator()
        L17:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L38
            java.lang.Object r2 = r1.next()
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2
            java.lang.Object r3 = r2.get()
            androidx.appcompat.view.menu.MenuPresenter r3 = (androidx.appcompat.view.menu.MenuPresenter) r3
            if (r3 != 0) goto L31
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<androidx.appcompat.view.menu.MenuPresenter>> r4 = r5.mPresenters
            r4.remove(r2)
            goto L37
        L31:
            if (r0 != 0) goto L37
            boolean r0 = r3.onSubMenuSelected(r6)
        L37:
            goto L17
        L38:
            return r0
    }

    private static int findInsertIndex(java.util.ArrayList<androidx.appcompat.view.menu.MenuItemImpl> r3, int r4) {
            int r0 = r3.size()
            int r0 = r0 + (-1)
        L6:
            if (r0 < 0) goto L1a
            java.lang.Object r1 = r3.get(r0)
            androidx.appcompat.view.menu.MenuItemImpl r1 = (androidx.appcompat.view.menu.MenuItemImpl) r1
            int r2 = r1.getOrdering()
            if (r2 > r4) goto L17
            int r2 = r0 + 1
            return r2
        L17:
            int r0 = r0 + (-1)
            goto L6
        L1a:
            r0 = 0
            return r0
    }

    private static int getOrdering(int r3) {
            r0 = -65536(0xffffffffffff0000, float:NaN)
            r0 = r0 & r3
            int r0 = r0 >> 16
            if (r0 < 0) goto L18
            int[] r1 = androidx.appcompat.view.menu.MenuBuilder.sCategoryToOrder
            int r1 = r1.length
            if (r0 >= r1) goto L18
            int[] r1 = androidx.appcompat.view.menu.MenuBuilder.sCategoryToOrder
            r1 = r1[r0]
            int r1 = r1 << 16
            r2 = 65535(0xffff, float:9.1834E-41)
            r2 = r2 & r3
            r1 = r1 | r2
            return r1
        L18:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "order does not contain a valid category."
            r1.<init>(r2)
            throw r1
    }

    private void removeItemAtInt(int r2, boolean r3) {
            r1 = this;
            if (r2 < 0) goto L17
            java.util.ArrayList<androidx.appcompat.view.menu.MenuItemImpl> r0 = r1.mItems
            int r0 = r0.size()
            if (r2 < r0) goto Lb
            goto L17
        Lb:
            java.util.ArrayList<androidx.appcompat.view.menu.MenuItemImpl> r0 = r1.mItems
            r0.remove(r2)
            if (r3 == 0) goto L16
            r0 = 1
            r1.onItemsChanged(r0)
        L16:
            return
        L17:
            return
    }

    private void setHeaderInternal(int r4, java.lang.CharSequence r5, int r6, android.graphics.drawable.Drawable r7, android.view.View r8) {
            r3 = this;
            android.content.res.Resources r0 = r3.getResources()
            r1 = 0
            if (r8 == 0) goto Le
            r3.mHeaderView = r8
            r3.mHeaderTitle = r1
            r3.mHeaderIcon = r1
            goto L2e
        Le:
            if (r4 <= 0) goto L17
            java.lang.CharSequence r2 = r0.getText(r4)
            r3.mHeaderTitle = r2
            goto L1b
        L17:
            if (r5 == 0) goto L1b
            r3.mHeaderTitle = r5
        L1b:
            if (r6 <= 0) goto L28
            android.content.Context r2 = r3.getContext()
            android.graphics.drawable.Drawable r2 = androidx.core.content.ContextCompat.getDrawable(r2, r6)
            r3.mHeaderIcon = r2
            goto L2c
        L28:
            if (r7 == 0) goto L2c
            r3.mHeaderIcon = r7
        L2c:
            r3.mHeaderView = r1
        L2e:
            r1 = 0
            r3.onItemsChanged(r1)
            return
    }

    private void setShortcutsVisibleInner(boolean r4) {
            r3 = this;
            if (r4 == 0) goto L1c
            android.content.res.Resources r0 = r3.mResources
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r0 = r0.keyboard
            r1 = 1
            if (r0 == r1) goto L1c
            android.content.Context r0 = r3.mContext
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r0)
            android.content.Context r2 = r3.mContext
            boolean r0 = androidx.core.view.ViewConfigurationCompat.shouldShowMenuShortcutsWhenKeyboardPresent(r0, r2)
            if (r0 == 0) goto L1c
            goto L1d
        L1c:
            r1 = 0
        L1d:
            r3.mShortcutsVisible = r1
            return
    }

    @Override // android.view.Menu
    public android.view.MenuItem add(int r3) {
            r2 = this;
            android.content.res.Resources r0 = r2.mResources
            java.lang.String r0 = r0.getString(r3)
            r1 = 0
            android.view.MenuItem r0 = r2.addInternal(r1, r1, r1, r0)
            return r0
    }

    @Override // android.view.Menu
    public android.view.MenuItem add(int r2, int r3, int r4, int r5) {
            r1 = this;
            android.content.res.Resources r0 = r1.mResources
            java.lang.String r0 = r0.getString(r5)
            android.view.MenuItem r0 = r1.addInternal(r2, r3, r4, r0)
            return r0
    }

    @Override // android.view.Menu
    public android.view.MenuItem add(int r2, int r3, int r4, java.lang.CharSequence r5) {
            r1 = this;
            android.view.MenuItem r0 = r1.addInternal(r2, r3, r4, r5)
            return r0
    }

    @Override // android.view.Menu
    public android.view.MenuItem add(java.lang.CharSequence r2) {
            r1 = this;
            r0 = 0
            android.view.MenuItem r0 = r1.addInternal(r0, r0, r0, r2)
            return r0
    }

    @Override // android.view.Menu
    public int addIntentOptions(int r14, int r15, int r16, android.content.ComponentName r17, android.content.Intent[] r18, android.content.Intent r19, int r20, android.view.MenuItem[] r21) {
            r13 = this;
            r0 = r18
            android.content.Context r1 = r13.mContext
            android.content.pm.PackageManager r1 = r1.getPackageManager()
            r2 = 0
            r3 = r17
            r4 = r19
            java.util.List r5 = r1.queryIntentActivityOptions(r3, r0, r4, r2)
            if (r5 == 0) goto L18
            int r2 = r5.size()
        L18:
            r6 = r20 & 1
            if (r6 != 0) goto L1f
            r13.removeGroup(r14)
        L1f:
            r6 = 0
        L20:
            if (r6 >= r2) goto L6c
            java.lang.Object r7 = r5.get(r6)
            android.content.pm.ResolveInfo r7 = (android.content.pm.ResolveInfo) r7
            android.content.Intent r8 = new android.content.Intent
            int r9 = r7.specificIndex
            if (r9 >= 0) goto L30
            r9 = r4
            goto L34
        L30:
            int r9 = r7.specificIndex
            r9 = r0[r9]
        L34:
            r8.<init>(r9)
            android.content.ComponentName r9 = new android.content.ComponentName
            android.content.pm.ActivityInfo r10 = r7.activityInfo
            android.content.pm.ApplicationInfo r10 = r10.applicationInfo
            java.lang.String r10 = r10.packageName
            android.content.pm.ActivityInfo r11 = r7.activityInfo
            java.lang.String r11 = r11.name
            r9.<init>(r10, r11)
            r8.setComponent(r9)
            java.lang.CharSequence r9 = r7.loadLabel(r1)
            r11 = r16
            android.view.MenuItem r9 = r13.add(r14, r15, r11, r9)
            android.graphics.drawable.Drawable r12 = r7.loadIcon(r1)
            android.view.MenuItem r9 = r9.setIcon(r12)
            android.view.MenuItem r9 = r9.setIntent(r8)
            if (r21 == 0) goto L69
            int r12 = r7.specificIndex
            if (r12 < 0) goto L69
            int r12 = r7.specificIndex
            r21[r12] = r9
        L69:
            int r6 = r6 + 1
            goto L20
        L6c:
            r11 = r16
            return r2
    }

    protected android.view.MenuItem addInternal(int r8, int r9, int r10, java.lang.CharSequence r11) {
            r7 = this;
            int r4 = getOrdering(r10)
            int r6 = r7.mDefaultShowAsAction
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r5 = r11
            androidx.appcompat.view.menu.MenuItemImpl r8 = r0.createNewMenuItem(r1, r2, r3, r4, r5, r6)
            android.view.ContextMenu$ContextMenuInfo r9 = r0.mCurrentMenuInfo
            if (r9 == 0) goto L18
            android.view.ContextMenu$ContextMenuInfo r9 = r0.mCurrentMenuInfo
            r8.setMenuInfo(r9)
        L18:
            java.util.ArrayList<androidx.appcompat.view.menu.MenuItemImpl> r9 = r0.mItems
            java.util.ArrayList<androidx.appcompat.view.menu.MenuItemImpl> r10 = r0.mItems
            int r10 = findInsertIndex(r10, r4)
            r9.add(r10, r8)
            r9 = 1
            r7.onItemsChanged(r9)
            return r8
    }

    public void addMenuPresenter(androidx.appcompat.view.menu.MenuPresenter r2) {
            r1 = this;
            android.content.Context r0 = r1.mContext
            r1.addMenuPresenter(r2, r0)
            return
    }

    public void addMenuPresenter(androidx.appcompat.view.menu.MenuPresenter r3, android.content.Context r4) {
            r2 = this;
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<androidx.appcompat.view.menu.MenuPresenter>> r0 = r2.mPresenters
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            r1.<init>(r3)
            r0.add(r1)
            r3.initForMenu(r4, r2)
            r0 = 1
            r2.mIsActionItemsStale = r0
            return
    }

    @Override // android.view.Menu
    public android.view.SubMenu addSubMenu(int r3) {
            r2 = this;
            android.content.res.Resources r0 = r2.mResources
            java.lang.String r0 = r0.getString(r3)
            r1 = 0
            android.view.SubMenu r0 = r2.addSubMenu(r1, r1, r1, r0)
            return r0
    }

    @Override // android.view.Menu
    public android.view.SubMenu addSubMenu(int r2, int r3, int r4, int r5) {
            r1 = this;
            android.content.res.Resources r0 = r1.mResources
            java.lang.String r0 = r0.getString(r5)
            android.view.SubMenu r0 = r1.addSubMenu(r2, r3, r4, r0)
            return r0
    }

    @Override // android.view.Menu
    public android.view.SubMenu addSubMenu(int r4, int r5, int r6, java.lang.CharSequence r7) {
            r3 = this;
            android.view.MenuItem r0 = r3.addInternal(r4, r5, r6, r7)
            androidx.appcompat.view.menu.MenuItemImpl r0 = (androidx.appcompat.view.menu.MenuItemImpl) r0
            androidx.appcompat.view.menu.SubMenuBuilder r1 = new androidx.appcompat.view.menu.SubMenuBuilder
            android.content.Context r2 = r3.mContext
            r1.<init>(r2, r3, r0)
            r0.setSubMenu(r1)
            return r1
    }

    @Override // android.view.Menu
    public android.view.SubMenu addSubMenu(java.lang.CharSequence r2) {
            r1 = this;
            r0 = 0
            android.view.SubMenu r0 = r1.addSubMenu(r0, r0, r0, r2)
            return r0
    }

    public void changeMenuMode() {
            r1 = this;
            androidx.appcompat.view.menu.MenuBuilder$Callback r0 = r1.mCallback
            if (r0 == 0) goto L9
            androidx.appcompat.view.menu.MenuBuilder$Callback r0 = r1.mCallback
            r0.onMenuModeChange(r1)
        L9:
            return
    }

    @Override // android.view.Menu
    public void clear() {
            r1 = this;
            androidx.appcompat.view.menu.MenuItemImpl r0 = r1.mExpandedItem
            if (r0 == 0) goto L9
            androidx.appcompat.view.menu.MenuItemImpl r0 = r1.mExpandedItem
            r1.collapseItemActionView(r0)
        L9:
            java.util.ArrayList<androidx.appcompat.view.menu.MenuItemImpl> r0 = r1.mItems
            r0.clear()
            r0 = 1
            r1.onItemsChanged(r0)
            return
    }

    public void clearAll() {
            r2 = this;
            r0 = 1
            r2.mPreventDispatchingItemsChanged = r0
            r2.clear()
            r2.clearHeader()
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<androidx.appcompat.view.menu.MenuPresenter>> r1 = r2.mPresenters
            r1.clear()
            r1 = 0
            r2.mPreventDispatchingItemsChanged = r1
            r2.mItemsChangedWhileDispatchPrevented = r1
            r2.mStructureChangedWhileDispatchPrevented = r1
            r2.onItemsChanged(r0)
            return
    }

    public void clearHeader() {
            r1 = this;
            r0 = 0
            r1.mHeaderIcon = r0
            r1.mHeaderTitle = r0
            r1.mHeaderView = r0
            r0 = 0
            r1.onItemsChanged(r0)
            return
    }

    @Override // android.view.Menu
    public void close() {
            r1 = this;
            r0 = 1
            r1.close(r0)
            return
    }

    public final void close(boolean r5) {
            r4 = this;
            boolean r0 = r4.mIsClosing
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r4.mIsClosing = r0
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<androidx.appcompat.view.menu.MenuPresenter>> r0 = r4.mPresenters
            java.util.Iterator r0 = r0.iterator()
        Le:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2c
            java.lang.Object r1 = r0.next()
            java.lang.ref.WeakReference r1 = (java.lang.ref.WeakReference) r1
            java.lang.Object r2 = r1.get()
            androidx.appcompat.view.menu.MenuPresenter r2 = (androidx.appcompat.view.menu.MenuPresenter) r2
            if (r2 != 0) goto L28
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<androidx.appcompat.view.menu.MenuPresenter>> r3 = r4.mPresenters
            r3.remove(r1)
            goto L2b
        L28:
            r2.onCloseMenu(r4, r5)
        L2b:
            goto Le
        L2c:
            r0 = 0
            r4.mIsClosing = r0
            return
    }

    public boolean collapseItemActionView(androidx.appcompat.view.menu.MenuItemImpl r6) {
            r5 = this;
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<androidx.appcompat.view.menu.MenuPresenter>> r0 = r5.mPresenters
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L43
            androidx.appcompat.view.menu.MenuItemImpl r0 = r5.mExpandedItem
            if (r0 == r6) goto Ld
            goto L43
        Ld:
            r0 = 0
            r5.stopDispatchingItemsChanged()
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<androidx.appcompat.view.menu.MenuPresenter>> r1 = r5.mPresenters
            java.util.Iterator r1 = r1.iterator()
        L17:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L3a
            java.lang.Object r2 = r1.next()
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2
            java.lang.Object r3 = r2.get()
            androidx.appcompat.view.menu.MenuPresenter r3 = (androidx.appcompat.view.menu.MenuPresenter) r3
            if (r3 != 0) goto L31
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<androidx.appcompat.view.menu.MenuPresenter>> r4 = r5.mPresenters
            r4.remove(r2)
            goto L39
        L31:
            boolean r4 = r3.collapseItemActionView(r5, r6)
            r0 = r4
            if (r4 == 0) goto L39
            goto L3a
        L39:
            goto L17
        L3a:
            r5.startDispatchingItemsChanged()
            if (r0 == 0) goto L42
            r1 = 0
            r5.mExpandedItem = r1
        L42:
            return r0
        L43:
            r0 = 0
            return r0
    }

    boolean dispatchMenuItemSelected(androidx.appcompat.view.menu.MenuBuilder r2, android.view.MenuItem r3) {
            r1 = this;
            androidx.appcompat.view.menu.MenuBuilder$Callback r0 = r1.mCallback
            if (r0 == 0) goto Le
            androidx.appcompat.view.menu.MenuBuilder$Callback r0 = r1.mCallback
            boolean r0 = r0.onMenuItemSelected(r2, r3)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    public boolean expandItemActionView(androidx.appcompat.view.menu.MenuItemImpl r6) {
            r5 = this;
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<androidx.appcompat.view.menu.MenuPresenter>> r0 = r5.mPresenters
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto La
            r0 = 0
            return r0
        La:
            r0 = 0
            r5.stopDispatchingItemsChanged()
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<androidx.appcompat.view.menu.MenuPresenter>> r1 = r5.mPresenters
            java.util.Iterator r1 = r1.iterator()
        L14:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L37
            java.lang.Object r2 = r1.next()
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2
            java.lang.Object r3 = r2.get()
            androidx.appcompat.view.menu.MenuPresenter r3 = (androidx.appcompat.view.menu.MenuPresenter) r3
            if (r3 != 0) goto L2e
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<androidx.appcompat.view.menu.MenuPresenter>> r4 = r5.mPresenters
            r4.remove(r2)
            goto L36
        L2e:
            boolean r4 = r3.expandItemActionView(r5, r6)
            r0 = r4
            if (r4 == 0) goto L36
            goto L37
        L36:
            goto L14
        L37:
            r5.startDispatchingItemsChanged()
            if (r0 == 0) goto L3e
            r5.mExpandedItem = r6
        L3e:
            return r0
    }

    public int findGroupIndex(int r2) {
            r1 = this;
            r0 = 0
            int r0 = r1.findGroupIndex(r2, r0)
            return r0
    }

    public int findGroupIndex(int r5, int r6) {
            r4 = this;
            int r0 = r4.size()
            if (r6 >= 0) goto L7
            r6 = 0
        L7:
            r1 = r6
        L8:
            if (r1 >= r0) goto L1c
            java.util.ArrayList<androidx.appcompat.view.menu.MenuItemImpl> r2 = r4.mItems
            java.lang.Object r2 = r2.get(r1)
            androidx.appcompat.view.menu.MenuItemImpl r2 = (androidx.appcompat.view.menu.MenuItemImpl) r2
            int r3 = r2.getGroupId()
            if (r3 != r5) goto L19
            return r1
        L19:
            int r1 = r1 + 1
            goto L8
        L1c:
            r1 = -1
            return r1
    }

    @Override // android.view.Menu
    public android.view.MenuItem findItem(int r5) {
            r4 = this;
            int r0 = r4.size()
            r1 = 0
        L5:
            if (r1 >= r0) goto L2a
            java.util.ArrayList<androidx.appcompat.view.menu.MenuItemImpl> r2 = r4.mItems
            java.lang.Object r2 = r2.get(r1)
            androidx.appcompat.view.menu.MenuItemImpl r2 = (androidx.appcompat.view.menu.MenuItemImpl) r2
            int r3 = r2.getItemId()
            if (r3 != r5) goto L16
            return r2
        L16:
            boolean r3 = r2.hasSubMenu()
            if (r3 == 0) goto L27
            android.view.SubMenu r3 = r2.getSubMenu()
            android.view.MenuItem r3 = r3.findItem(r5)
            if (r3 == 0) goto L27
            return r3
        L27:
            int r1 = r1 + 1
            goto L5
        L2a:
            r1 = 0
            return r1
    }

    public int findItemIndex(int r5) {
            r4 = this;
            int r0 = r4.size()
            r1 = 0
        L5:
            if (r1 >= r0) goto L19
            java.util.ArrayList<androidx.appcompat.view.menu.MenuItemImpl> r2 = r4.mItems
            java.lang.Object r2 = r2.get(r1)
            androidx.appcompat.view.menu.MenuItemImpl r2 = (androidx.appcompat.view.menu.MenuItemImpl) r2
            int r3 = r2.getItemId()
            if (r3 != r5) goto L16
            return r1
        L16:
            int r1 = r1 + 1
            goto L5
        L19:
            r1 = -1
            return r1
    }

    androidx.appcompat.view.menu.MenuItemImpl findItemWithShortcutForKey(int r13, android.view.KeyEvent r14) {
            r12 = this;
            java.util.ArrayList<androidx.appcompat.view.menu.MenuItemImpl> r0 = r12.mTempShortcutItemList
            r0.clear()
            r12.findItemsWithShortcutForKey(r0, r13, r14)
            boolean r1 = r0.isEmpty()
            r2 = 0
            if (r1 == 0) goto L10
            return r2
        L10:
            int r1 = r14.getMetaState()
            android.view.KeyCharacterMap$KeyData r3 = new android.view.KeyCharacterMap$KeyData
            r3.<init>()
            r14.getKeyData(r3)
            int r4 = r0.size()
            r5 = 0
            r6 = 1
            if (r4 != r6) goto L2b
            java.lang.Object r2 = r0.get(r5)
            androidx.appcompat.view.menu.MenuItemImpl r2 = (androidx.appcompat.view.menu.MenuItemImpl) r2
            return r2
        L2b:
            boolean r6 = r12.isQwertyMode()
            r7 = 0
        L30:
            if (r7 >= r4) goto L67
            java.lang.Object r8 = r0.get(r7)
            androidx.appcompat.view.menu.MenuItemImpl r8 = (androidx.appcompat.view.menu.MenuItemImpl) r8
            if (r6 == 0) goto L3f
            char r9 = r8.getAlphabeticShortcut()
            goto L43
        L3f:
            char r9 = r8.getNumericShortcut()
        L43:
            char[] r10 = r3.meta
            char r10 = r10[r5]
            if (r9 != r10) goto L4e
            r10 = r1 & 2
            if (r10 == 0) goto L63
        L4e:
            char[] r10 = r3.meta
            r11 = 2
            char r10 = r10[r11]
            if (r9 != r10) goto L59
            r10 = r1 & 2
            if (r10 != 0) goto L63
        L59:
            if (r6 == 0) goto L64
            r10 = 8
            if (r9 != r10) goto L64
            r10 = 67
            if (r13 != r10) goto L64
        L63:
            return r8
        L64:
            int r7 = r7 + 1
            goto L30
        L67:
            return r2
    }

    void findItemsWithShortcutForKey(java.util.List<androidx.appcompat.view.menu.MenuItemImpl> r18, int r19, android.view.KeyEvent r20) {
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            boolean r4 = r0.isQwertyMode()
            int r5 = r3.getModifiers()
            android.view.KeyCharacterMap$KeyData r6 = new android.view.KeyCharacterMap$KeyData
            r6.<init>()
            boolean r7 = r3.getKeyData(r6)
            r8 = 67
            if (r7 != 0) goto L20
            if (r2 == r8) goto L20
            return
        L20:
            java.util.ArrayList<androidx.appcompat.view.menu.MenuItemImpl> r9 = r0.mItems
            int r9 = r9.size()
            r10 = 0
        L27:
            if (r10 >= r9) goto L8a
            java.util.ArrayList<androidx.appcompat.view.menu.MenuItemImpl> r11 = r0.mItems
            java.lang.Object r11 = r11.get(r10)
            androidx.appcompat.view.menu.MenuItemImpl r11 = (androidx.appcompat.view.menu.MenuItemImpl) r11
            boolean r12 = r11.hasSubMenu()
            if (r12 == 0) goto L40
            android.view.SubMenu r12 = r11.getSubMenu()
            androidx.appcompat.view.menu.MenuBuilder r12 = (androidx.appcompat.view.menu.MenuBuilder) r12
            r12.findItemsWithShortcutForKey(r1, r2, r3)
        L40:
            if (r4 == 0) goto L47
            char r12 = r11.getAlphabeticShortcut()
            goto L4b
        L47:
            char r12 = r11.getNumericShortcut()
        L4b:
            if (r4 == 0) goto L52
            int r13 = r11.getAlphabeticModifiers()
            goto L56
        L52:
            int r13 = r11.getNumericModifiers()
        L56:
            r14 = 69647(0x1100f, float:9.7596E-41)
            r15 = r5 & r14
            r14 = r14 & r13
            r16 = 0
            if (r15 != r14) goto L62
            r14 = 1
            goto L64
        L62:
            r14 = r16
        L64:
            if (r14 == 0) goto L87
            if (r12 == 0) goto L87
            char[] r15 = r6.meta
            char r15 = r15[r16]
            if (r12 == r15) goto L7e
            char[] r15 = r6.meta
            r16 = 2
            char r15 = r15[r16]
            if (r12 == r15) goto L7e
            if (r4 == 0) goto L87
            r15 = 8
            if (r12 != r15) goto L87
            if (r2 != r8) goto L87
        L7e:
            boolean r15 = r11.isEnabled()
            if (r15 == 0) goto L87
            r1.add(r11)
        L87:
            int r10 = r10 + 1
            goto L27
        L8a:
            return
    }

    public void flagActionItems() {
            r6 = this;
            java.util.ArrayList r0 = r6.getVisibleItems()
            boolean r1 = r6.mIsActionItemsStale
            if (r1 != 0) goto L9
            return
        L9:
            r1 = 0
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<androidx.appcompat.view.menu.MenuPresenter>> r2 = r6.mPresenters
            java.util.Iterator r2 = r2.iterator()
        L10:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L30
            java.lang.Object r3 = r2.next()
            java.lang.ref.WeakReference r3 = (java.lang.ref.WeakReference) r3
            java.lang.Object r4 = r3.get()
            androidx.appcompat.view.menu.MenuPresenter r4 = (androidx.appcompat.view.menu.MenuPresenter) r4
            if (r4 != 0) goto L2a
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<androidx.appcompat.view.menu.MenuPresenter>> r5 = r6.mPresenters
            r5.remove(r3)
            goto L2f
        L2a:
            boolean r5 = r4.flagActionItems()
            r1 = r1 | r5
        L2f:
            goto L10
        L30:
            if (r1 == 0) goto L5e
            java.util.ArrayList<androidx.appcompat.view.menu.MenuItemImpl> r2 = r6.mActionItems
            r2.clear()
            java.util.ArrayList<androidx.appcompat.view.menu.MenuItemImpl> r2 = r6.mNonActionItems
            r2.clear()
            int r2 = r0.size()
            r3 = 0
        L41:
            if (r3 >= r2) goto L5d
            java.lang.Object r4 = r0.get(r3)
            androidx.appcompat.view.menu.MenuItemImpl r4 = (androidx.appcompat.view.menu.MenuItemImpl) r4
            boolean r5 = r4.isActionButton()
            if (r5 == 0) goto L55
            java.util.ArrayList<androidx.appcompat.view.menu.MenuItemImpl> r5 = r6.mActionItems
            r5.add(r4)
            goto L5a
        L55:
            java.util.ArrayList<androidx.appcompat.view.menu.MenuItemImpl> r5 = r6.mNonActionItems
            r5.add(r4)
        L5a:
            int r3 = r3 + 1
            goto L41
        L5d:
            goto L71
        L5e:
            java.util.ArrayList<androidx.appcompat.view.menu.MenuItemImpl> r2 = r6.mActionItems
            r2.clear()
            java.util.ArrayList<androidx.appcompat.view.menu.MenuItemImpl> r2 = r6.mNonActionItems
            r2.clear()
            java.util.ArrayList<androidx.appcompat.view.menu.MenuItemImpl> r2 = r6.mNonActionItems
            java.util.ArrayList r3 = r6.getVisibleItems()
            r2.addAll(r3)
        L71:
            r2 = 0
            r6.mIsActionItemsStale = r2
            return
    }

    public java.util.ArrayList<androidx.appcompat.view.menu.MenuItemImpl> getActionItems() {
            r1 = this;
            r1.flagActionItems()
            java.util.ArrayList<androidx.appcompat.view.menu.MenuItemImpl> r0 = r1.mActionItems
            return r0
    }

    protected java.lang.String getActionViewStatesKey() {
            r1 = this;
            java.lang.String r0 = "android:menu:actionviewstates"
            return r0
    }

    public android.content.Context getContext() {
            r1 = this;
            android.content.Context r0 = r1.mContext
            return r0
    }

    public androidx.appcompat.view.menu.MenuItemImpl getExpandedItem() {
            r1 = this;
            androidx.appcompat.view.menu.MenuItemImpl r0 = r1.mExpandedItem
            return r0
    }

    public android.graphics.drawable.Drawable getHeaderIcon() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mHeaderIcon
            return r0
    }

    public java.lang.CharSequence getHeaderTitle() {
            r1 = this;
            java.lang.CharSequence r0 = r1.mHeaderTitle
            return r0
    }

    public android.view.View getHeaderView() {
            r1 = this;
            android.view.View r0 = r1.mHeaderView
            return r0
    }

    @Override // android.view.Menu
    public android.view.MenuItem getItem(int r2) {
            r1 = this;
            java.util.ArrayList<androidx.appcompat.view.menu.MenuItemImpl> r0 = r1.mItems
            java.lang.Object r0 = r0.get(r2)
            android.view.MenuItem r0 = (android.view.MenuItem) r0
            return r0
    }

    public java.util.ArrayList<androidx.appcompat.view.menu.MenuItemImpl> getNonActionItems() {
            r1 = this;
            r1.flagActionItems()
            java.util.ArrayList<androidx.appcompat.view.menu.MenuItemImpl> r0 = r1.mNonActionItems
            return r0
    }

    boolean getOptionalIconsVisible() {
            r1 = this;
            boolean r0 = r1.mOptionalIconsVisible
            return r0
    }

    android.content.res.Resources getResources() {
            r1 = this;
            android.content.res.Resources r0 = r1.mResources
            return r0
    }

    public androidx.appcompat.view.menu.MenuBuilder getRootMenu() {
            r0 = this;
            return r0
    }

    public java.util.ArrayList<androidx.appcompat.view.menu.MenuItemImpl> getVisibleItems() {
            r4 = this;
            boolean r0 = r4.mIsVisibleItemsStale
            if (r0 != 0) goto L7
            java.util.ArrayList<androidx.appcompat.view.menu.MenuItemImpl> r0 = r4.mVisibleItems
            return r0
        L7:
            java.util.ArrayList<androidx.appcompat.view.menu.MenuItemImpl> r0 = r4.mVisibleItems
            r0.clear()
            java.util.ArrayList<androidx.appcompat.view.menu.MenuItemImpl> r0 = r4.mItems
            int r0 = r0.size()
            r1 = 0
        L13:
            if (r1 >= r0) goto L2b
            java.util.ArrayList<androidx.appcompat.view.menu.MenuItemImpl> r2 = r4.mItems
            java.lang.Object r2 = r2.get(r1)
            androidx.appcompat.view.menu.MenuItemImpl r2 = (androidx.appcompat.view.menu.MenuItemImpl) r2
            boolean r3 = r2.isVisible()
            if (r3 == 0) goto L28
            java.util.ArrayList<androidx.appcompat.view.menu.MenuItemImpl> r3 = r4.mVisibleItems
            r3.add(r2)
        L28:
            int r1 = r1 + 1
            goto L13
        L2b:
            r1 = 0
            r4.mIsVisibleItemsStale = r1
            r1 = 1
            r4.mIsActionItemsStale = r1
            java.util.ArrayList<androidx.appcompat.view.menu.MenuItemImpl> r1 = r4.mVisibleItems
            return r1
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
            r5 = this;
            boolean r0 = r5.mOverrideVisibleItems
            r1 = 1
            if (r0 == 0) goto L6
            return r1
        L6:
            int r0 = r5.size()
            r2 = 0
        Lb:
            if (r2 >= r0) goto L1f
            java.util.ArrayList<androidx.appcompat.view.menu.MenuItemImpl> r3 = r5.mItems
            java.lang.Object r3 = r3.get(r2)
            androidx.appcompat.view.menu.MenuItemImpl r3 = (androidx.appcompat.view.menu.MenuItemImpl) r3
            boolean r4 = r3.isVisible()
            if (r4 == 0) goto L1c
            return r1
        L1c:
            int r2 = r2 + 1
            goto Lb
        L1f:
            r1 = 0
            return r1
    }

    public boolean isDispatchingItemsChanged() {
            r1 = this;
            boolean r0 = r1.mPreventDispatchingItemsChanged
            r0 = r0 ^ 1
            return r0
    }

    public boolean isGroupDividerEnabled() {
            r1 = this;
            boolean r0 = r1.mGroupDividerEnabled
            return r0
    }

    boolean isQwertyMode() {
            r1 = this;
            boolean r0 = r1.mQwertyMode
            return r0
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int r2, android.view.KeyEvent r3) {
            r1 = this;
            androidx.appcompat.view.menu.MenuItemImpl r0 = r1.findItemWithShortcutForKey(r2, r3)
            if (r0 == 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    public boolean isShortcutsVisible() {
            r1 = this;
            boolean r0 = r1.mShortcutsVisible
            return r0
    }

    void onItemActionRequestChanged(androidx.appcompat.view.menu.MenuItemImpl r2) {
            r1 = this;
            r0 = 1
            r1.mIsActionItemsStale = r0
            r1.onItemsChanged(r0)
            return
    }

    void onItemVisibleChanged(androidx.appcompat.view.menu.MenuItemImpl r2) {
            r1 = this;
            r0 = 1
            r1.mIsVisibleItemsStale = r0
            r1.onItemsChanged(r0)
            return
    }

    public void onItemsChanged(boolean r3) {
            r2 = this;
            boolean r0 = r2.mPreventDispatchingItemsChanged
            r1 = 1
            if (r0 != 0) goto Lf
            if (r3 == 0) goto Lb
            r2.mIsVisibleItemsStale = r1
            r2.mIsActionItemsStale = r1
        Lb:
            r2.dispatchPresenterUpdate(r3)
            goto L15
        Lf:
            r2.mItemsChangedWhileDispatchPrevented = r1
            if (r3 == 0) goto L15
            r2.mStructureChangedWhileDispatchPrevented = r1
        L15:
            return
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int r2, int r3) {
            r1 = this;
            android.view.MenuItem r0 = r1.findItem(r2)
            boolean r0 = r1.performItemAction(r0, r3)
            return r0
    }

    public boolean performItemAction(android.view.MenuItem r2, int r3) {
            r1 = this;
            r0 = 0
            boolean r0 = r1.performItemAction(r2, r0, r3)
            return r0
    }

    public boolean performItemAction(android.view.MenuItem r8, androidx.appcompat.view.menu.MenuPresenter r9, int r10) {
            r7 = this;
            r0 = r8
            androidx.appcompat.view.menu.MenuItemImpl r0 = (androidx.appcompat.view.menu.MenuItemImpl) r0
            r1 = 0
            if (r0 == 0) goto L74
            boolean r2 = r0.isEnabled()
            if (r2 != 0) goto Le
            goto L74
        Le:
            boolean r2 = r0.invoke()
            androidx.core.view.ActionProvider r3 = r0.getSupportActionProvider()
            r4 = 1
            if (r3 == 0) goto L21
            boolean r5 = r3.hasSubMenu()
            if (r5 == 0) goto L21
            r5 = r4
            goto L22
        L21:
            r5 = r1
        L22:
            boolean r6 = r0.hasCollapsibleActionView()
            if (r6 == 0) goto L33
            boolean r1 = r0.expandActionView()
            r2 = r2 | r1
            if (r2 == 0) goto L73
            r7.close(r4)
            goto L73
        L33:
            boolean r6 = r0.hasSubMenu()
            if (r6 != 0) goto L44
            if (r5 == 0) goto L3c
            goto L44
        L3c:
            r1 = r10 & 1
            if (r1 != 0) goto L73
            r7.close(r4)
            goto L73
        L44:
            r6 = r10 & 4
            if (r6 != 0) goto L4b
            r7.close(r1)
        L4b:
            boolean r1 = r0.hasSubMenu()
            if (r1 != 0) goto L5d
            androidx.appcompat.view.menu.SubMenuBuilder r1 = new androidx.appcompat.view.menu.SubMenuBuilder
            android.content.Context r6 = r7.getContext()
            r1.<init>(r6, r7, r0)
            r0.setSubMenu(r1)
        L5d:
            android.view.SubMenu r1 = r0.getSubMenu()
            androidx.appcompat.view.menu.SubMenuBuilder r1 = (androidx.appcompat.view.menu.SubMenuBuilder) r1
            if (r5 == 0) goto L68
            r3.onPrepareSubMenu(r1)
        L68:
            boolean r6 = r7.dispatchSubMenuSelected(r1, r9)
            r2 = r2 | r6
            if (r2 != 0) goto L72
            r7.close(r4)
        L72:
        L73:
            return r2
        L74:
            return r1
    }

    @Override // android.view.Menu
    public boolean performShortcut(int r4, android.view.KeyEvent r5, int r6) {
            r3 = this;
            androidx.appcompat.view.menu.MenuItemImpl r0 = r3.findItemWithShortcutForKey(r4, r5)
            r1 = 0
            if (r0 == 0) goto Lb
            boolean r1 = r3.performItemAction(r0, r6)
        Lb:
            r2 = r6 & 2
            if (r2 == 0) goto L13
            r2 = 1
            r3.close(r2)
        L13:
            return r1
    }

    @Override // android.view.Menu
    public void removeGroup(int r5) {
            r4 = this;
            int r0 = r4.findGroupIndex(r5)
            if (r0 < 0) goto L2a
            java.util.ArrayList<androidx.appcompat.view.menu.MenuItemImpl> r1 = r4.mItems
            int r1 = r1.size()
            int r1 = r1 - r0
            r2 = 0
        Le:
            int r3 = r2 + 1
            if (r2 >= r1) goto L26
            java.util.ArrayList<androidx.appcompat.view.menu.MenuItemImpl> r2 = r4.mItems
            java.lang.Object r2 = r2.get(r0)
            androidx.appcompat.view.menu.MenuItemImpl r2 = (androidx.appcompat.view.menu.MenuItemImpl) r2
            int r2 = r2.getGroupId()
            if (r2 != r5) goto L26
            r2 = 0
            r4.removeItemAtInt(r0, r2)
            r2 = r3
            goto Le
        L26:
            r2 = 1
            r4.onItemsChanged(r2)
        L2a:
            return
    }

    @Override // android.view.Menu
    public void removeItem(int r3) {
            r2 = this;
            int r0 = r2.findItemIndex(r3)
            r1 = 1
            r2.removeItemAtInt(r0, r1)
            return
    }

    public void removeItemAt(int r2) {
            r1 = this;
            r0 = 1
            r1.removeItemAtInt(r2, r0)
            return
    }

    public void removeMenuPresenter(androidx.appcompat.view.menu.MenuPresenter r5) {
            r4 = this;
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<androidx.appcompat.view.menu.MenuPresenter>> r0 = r4.mPresenters
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L22
            java.lang.Object r1 = r0.next()
            java.lang.ref.WeakReference r1 = (java.lang.ref.WeakReference) r1
            java.lang.Object r2 = r1.get()
            androidx.appcompat.view.menu.MenuPresenter r2 = (androidx.appcompat.view.menu.MenuPresenter) r2
            if (r2 == 0) goto L1c
            if (r2 != r5) goto L21
        L1c:
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<androidx.appcompat.view.menu.MenuPresenter>> r3 = r4.mPresenters
            r3.remove(r1)
        L21:
            goto L6
        L22:
            return
    }

    public void restoreActionViewStates(android.os.Bundle r8) {
            r7 = this;
            if (r8 != 0) goto L3
            return
        L3:
            java.lang.String r0 = r7.getActionViewStatesKey()
            android.util.SparseArray r0 = r8.getSparseParcelableArray(r0)
            int r1 = r7.size()
            r2 = 0
        L11:
            if (r2 >= r1) goto L39
            android.view.MenuItem r3 = r7.getItem(r2)
            android.view.View r4 = r3.getActionView()
            if (r4 == 0) goto L27
            int r5 = r4.getId()
            r6 = -1
            if (r5 == r6) goto L27
            r4.restoreHierarchyState(r0)
        L27:
            boolean r5 = r3.hasSubMenu()
            if (r5 == 0) goto L36
            android.view.SubMenu r5 = r3.getSubMenu()
            androidx.appcompat.view.menu.SubMenuBuilder r5 = (androidx.appcompat.view.menu.SubMenuBuilder) r5
            r5.restoreActionViewStates(r8)
        L36:
            int r2 = r2 + 1
            goto L11
        L39:
            java.lang.String r2 = "android:menu:expandedactionview"
            int r2 = r8.getInt(r2)
            if (r2 <= 0) goto L4a
            android.view.MenuItem r3 = r7.findItem(r2)
            if (r3 == 0) goto L4a
            r3.expandActionView()
        L4a:
            return
    }

    public void restorePresenterStates(android.os.Bundle r1) {
            r0 = this;
            r0.dispatchRestoreInstanceState(r1)
            return
    }

    public void saveActionViewStates(android.os.Bundle r8) {
            r7 = this;
            r0 = 0
            int r1 = r7.size()
            r2 = 0
        L6:
            if (r2 >= r1) goto L45
            android.view.MenuItem r3 = r7.getItem(r2)
            android.view.View r4 = r3.getActionView()
            if (r4 == 0) goto L33
            int r5 = r4.getId()
            r6 = -1
            if (r5 == r6) goto L33
            if (r0 != 0) goto L21
            android.util.SparseArray r5 = new android.util.SparseArray
            r5.<init>()
            r0 = r5
        L21:
            r4.saveHierarchyState(r0)
            boolean r5 = r3.isActionViewExpanded()
            if (r5 == 0) goto L33
            java.lang.String r5 = "android:menu:expandedactionview"
            int r6 = r3.getItemId()
            r8.putInt(r5, r6)
        L33:
            boolean r5 = r3.hasSubMenu()
            if (r5 == 0) goto L42
            android.view.SubMenu r5 = r3.getSubMenu()
            androidx.appcompat.view.menu.SubMenuBuilder r5 = (androidx.appcompat.view.menu.SubMenuBuilder) r5
            r5.saveActionViewStates(r8)
        L42:
            int r2 = r2 + 1
            goto L6
        L45:
            if (r0 == 0) goto L4e
            java.lang.String r2 = r7.getActionViewStatesKey()
            r8.putSparseParcelableArray(r2, r0)
        L4e:
            return
    }

    public void savePresenterStates(android.os.Bundle r1) {
            r0 = this;
            r0.dispatchSaveInstanceState(r1)
            return
    }

    public void setCallback(androidx.appcompat.view.menu.MenuBuilder.Callback r1) {
            r0 = this;
            r0.mCallback = r1
            return
    }

    public void setCurrentMenuInfo(android.view.ContextMenu.ContextMenuInfo r1) {
            r0 = this;
            r0.mCurrentMenuInfo = r1
            return
    }

    public androidx.appcompat.view.menu.MenuBuilder setDefaultShowAsAction(int r1) {
            r0 = this;
            r0.mDefaultShowAsAction = r1
            return r0
    }

    void setExclusiveItemChecked(android.view.MenuItem r6) {
            r5 = this;
            int r0 = r6.getGroupId()
            java.util.ArrayList<androidx.appcompat.view.menu.MenuItemImpl> r1 = r5.mItems
            int r1 = r1.size()
            r5.stopDispatchingItemsChanged()
            r2 = 0
        Le:
            if (r2 >= r1) goto L37
            java.util.ArrayList<androidx.appcompat.view.menu.MenuItemImpl> r3 = r5.mItems
            java.lang.Object r3 = r3.get(r2)
            androidx.appcompat.view.menu.MenuItemImpl r3 = (androidx.appcompat.view.menu.MenuItemImpl) r3
            int r4 = r3.getGroupId()
            if (r4 != r0) goto L34
            boolean r4 = r3.isExclusiveCheckable()
            if (r4 != 0) goto L25
            goto L34
        L25:
            boolean r4 = r3.isCheckable()
            if (r4 != 0) goto L2c
            goto L34
        L2c:
            if (r3 != r6) goto L30
            r4 = 1
            goto L31
        L30:
            r4 = 0
        L31:
            r3.setCheckedInt(r4)
        L34:
            int r2 = r2 + 1
            goto Le
        L37:
            r5.startDispatchingItemsChanged()
            return
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int r5, boolean r6, boolean r7) {
            r4 = this;
            java.util.ArrayList<androidx.appcompat.view.menu.MenuItemImpl> r0 = r4.mItems
            int r0 = r0.size()
            r1 = 0
        L7:
            if (r1 >= r0) goto L20
            java.util.ArrayList<androidx.appcompat.view.menu.MenuItemImpl> r2 = r4.mItems
            java.lang.Object r2 = r2.get(r1)
            androidx.appcompat.view.menu.MenuItemImpl r2 = (androidx.appcompat.view.menu.MenuItemImpl) r2
            int r3 = r2.getGroupId()
            if (r3 != r5) goto L1d
            r2.setExclusiveCheckable(r7)
            r2.setCheckable(r6)
        L1d:
            int r1 = r1 + 1
            goto L7
        L20:
            return
    }

    @Override // androidx.core.internal.view.SupportMenu, android.view.Menu
    public void setGroupDividerEnabled(boolean r1) {
            r0 = this;
            r0.mGroupDividerEnabled = r1
            return
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int r5, boolean r6) {
            r4 = this;
            java.util.ArrayList<androidx.appcompat.view.menu.MenuItemImpl> r0 = r4.mItems
            int r0 = r0.size()
            r1 = 0
        L7:
            if (r1 >= r0) goto L1d
            java.util.ArrayList<androidx.appcompat.view.menu.MenuItemImpl> r2 = r4.mItems
            java.lang.Object r2 = r2.get(r1)
            androidx.appcompat.view.menu.MenuItemImpl r2 = (androidx.appcompat.view.menu.MenuItemImpl) r2
            int r3 = r2.getGroupId()
            if (r3 != r5) goto L1a
            r2.setEnabled(r6)
        L1a:
            int r1 = r1 + 1
            goto L7
        L1d:
            return
    }

    @Override // android.view.Menu
    public void setGroupVisible(int r6, boolean r7) {
            r5 = this;
            java.util.ArrayList<androidx.appcompat.view.menu.MenuItemImpl> r0 = r5.mItems
            int r0 = r0.size()
            r1 = 0
            r2 = 0
        L8:
            if (r2 >= r0) goto L22
            java.util.ArrayList<androidx.appcompat.view.menu.MenuItemImpl> r3 = r5.mItems
            java.lang.Object r3 = r3.get(r2)
            androidx.appcompat.view.menu.MenuItemImpl r3 = (androidx.appcompat.view.menu.MenuItemImpl) r3
            int r4 = r3.getGroupId()
            if (r4 != r6) goto L1f
            boolean r4 = r3.setVisibleInt(r7)
            if (r4 == 0) goto L1f
            r1 = 1
        L1f:
            int r2 = r2 + 1
            goto L8
        L22:
            if (r1 == 0) goto L28
            r2 = 1
            r5.onItemsChanged(r2)
        L28:
            return
    }

    protected androidx.appcompat.view.menu.MenuBuilder setHeaderIconInt(int r7) {
            r6 = this;
            r4 = 0
            r5 = 0
            r1 = 0
            r2 = 0
            r0 = r6
            r3 = r7
            r0.setHeaderInternal(r1, r2, r3, r4, r5)
            return r0
    }

    protected androidx.appcompat.view.menu.MenuBuilder setHeaderIconInt(android.graphics.drawable.Drawable r7) {
            r6 = this;
            r3 = 0
            r5 = 0
            r1 = 0
            r2 = 0
            r0 = r6
            r4 = r7
            r0.setHeaderInternal(r1, r2, r3, r4, r5)
            return r0
    }

    protected androidx.appcompat.view.menu.MenuBuilder setHeaderTitleInt(int r7) {
            r6 = this;
            r4 = 0
            r5 = 0
            r2 = 0
            r3 = 0
            r0 = r6
            r1 = r7
            r0.setHeaderInternal(r1, r2, r3, r4, r5)
            return r0
    }

    protected androidx.appcompat.view.menu.MenuBuilder setHeaderTitleInt(java.lang.CharSequence r7) {
            r6 = this;
            r4 = 0
            r5 = 0
            r1 = 0
            r3 = 0
            r0 = r6
            r2 = r7
            r0.setHeaderInternal(r1, r2, r3, r4, r5)
            return r0
    }

    protected androidx.appcompat.view.menu.MenuBuilder setHeaderViewInt(android.view.View r7) {
            r6 = this;
            r3 = 0
            r4 = 0
            r1 = 0
            r2 = 0
            r0 = r6
            r5 = r7
            r0.setHeaderInternal(r1, r2, r3, r4, r5)
            return r0
    }

    public void setOptionalIconsVisible(boolean r1) {
            r0 = this;
            r0.mOptionalIconsVisible = r1
            return
    }

    public void setOverrideVisibleItems(boolean r1) {
            r0 = this;
            r0.mOverrideVisibleItems = r1
            return
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean r2) {
            r1 = this;
            r1.mQwertyMode = r2
            r0 = 0
            r1.onItemsChanged(r0)
            return
    }

    public void setShortcutsVisible(boolean r2) {
            r1 = this;
            boolean r0 = r1.mShortcutsVisible
            if (r0 != r2) goto L5
            return
        L5:
            r1.setShortcutsVisibleInner(r2)
            r0 = 0
            r1.onItemsChanged(r0)
            return
    }

    @Override // android.view.Menu
    public int size() {
            r1 = this;
            java.util.ArrayList<androidx.appcompat.view.menu.MenuItemImpl> r0 = r1.mItems
            int r0 = r0.size()
            return r0
    }

    public void startDispatchingItemsChanged() {
            r2 = this;
            r0 = 0
            r2.mPreventDispatchingItemsChanged = r0
            boolean r1 = r2.mItemsChangedWhileDispatchPrevented
            if (r1 == 0) goto Le
            r2.mItemsChangedWhileDispatchPrevented = r0
            boolean r0 = r2.mStructureChangedWhileDispatchPrevented
            r2.onItemsChanged(r0)
        Le:
            return
    }

    public void stopDispatchingItemsChanged() {
            r1 = this;
            boolean r0 = r1.mPreventDispatchingItemsChanged
            if (r0 != 0) goto Lc
            r0 = 1
            r1.mPreventDispatchingItemsChanged = r0
            r0 = 0
            r1.mItemsChangedWhileDispatchPrevented = r0
            r1.mStructureChangedWhileDispatchPrevented = r0
        Lc:
            return
    }
}
