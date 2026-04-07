package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
public class MenuPopupWindow extends androidx.appcompat.widget.ListPopupWindow implements androidx.appcompat.widget.MenuItemHoverListener {
    private static final java.lang.String TAG = "MenuPopupWindow";
    private static java.lang.reflect.Method sSetTouchModalMethod;
    private androidx.appcompat.widget.MenuItemHoverListener mHoverListener;

    static class Api23Impl {
        private Api23Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static void setEnterTransition(android.widget.PopupWindow r0, android.transition.Transition r1) {
                r0.setEnterTransition(r1)
                return
        }

        static void setExitTransition(android.widget.PopupWindow r0, android.transition.Transition r1) {
                r0.setExitTransition(r1)
                return
        }
    }

    static class Api29Impl {
        private Api29Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static void setTouchModal(android.widget.PopupWindow r0, boolean r1) {
                r0.setTouchModal(r1)
                return
        }
    }

    public static class MenuDropDownListView extends androidx.appcompat.widget.DropDownListView {
        final int mAdvanceKey;
        private androidx.appcompat.widget.MenuItemHoverListener mHoverListener;
        private android.view.MenuItem mHoveredMenuItem;
        final int mRetreatKey;

        public MenuDropDownListView(android.content.Context r7, boolean r8) {
                r6 = this;
                r6.<init>(r7, r8)
                android.content.res.Resources r0 = r7.getResources()
                android.content.res.Configuration r1 = r0.getConfiguration()
                r2 = 1
                int r3 = r1.getLayoutDirection()
                r4 = 21
                r5 = 22
                if (r2 != r3) goto L1b
                r6.mAdvanceKey = r4
                r6.mRetreatKey = r5
                goto L1f
            L1b:
                r6.mAdvanceKey = r5
                r6.mRetreatKey = r4
            L1f:
                return
        }

        public void clearSelection() {
                r1 = this;
                r0 = -1
                r1.setSelection(r0)
                return
        }

        @Override // androidx.appcompat.widget.DropDownListView, android.view.ViewGroup, android.view.View
        public /* bridge */ /* synthetic */ boolean hasFocus() {
                r1 = this;
                boolean r0 = super.hasFocus()
                return r0
        }

        @Override // androidx.appcompat.widget.DropDownListView, android.view.View
        public /* bridge */ /* synthetic */ boolean hasWindowFocus() {
                r1 = this;
                boolean r0 = super.hasWindowFocus()
                return r0
        }

        @Override // androidx.appcompat.widget.DropDownListView, android.view.View
        public /* bridge */ /* synthetic */ boolean isFocused() {
                r1 = this;
                boolean r0 = super.isFocused()
                return r0
        }

        @Override // androidx.appcompat.widget.DropDownListView, android.view.View
        public /* bridge */ /* synthetic */ boolean isInTouchMode() {
                r1 = this;
                boolean r0 = super.isInTouchMode()
                return r0
        }

        @Override // androidx.appcompat.widget.DropDownListView
        public /* bridge */ /* synthetic */ int lookForSelectablePosition(int r1, boolean r2) {
                r0 = this;
                int r1 = super.lookForSelectablePosition(r1, r2)
                return r1
        }

        @Override // androidx.appcompat.widget.DropDownListView
        public /* bridge */ /* synthetic */ int measureHeightOfChildrenCompat(int r1, int r2, int r3, int r4, int r5) {
                r0 = this;
                int r1 = super.measureHeightOfChildrenCompat(r1, r2, r3, r4, r5)
                return r1
        }

        @Override // androidx.appcompat.widget.DropDownListView
        public /* bridge */ /* synthetic */ boolean onForwardedEvent(android.view.MotionEvent r1, int r2) {
                r0 = this;
                boolean r1 = super.onForwardedEvent(r1, r2)
                return r1
        }

        @Override // androidx.appcompat.widget.DropDownListView, android.view.View
        public boolean onHoverEvent(android.view.MotionEvent r8) {
                r7 = this;
                androidx.appcompat.widget.MenuItemHoverListener r0 = r7.mHoverListener
                if (r0 == 0) goto L5f
                android.widget.ListAdapter r0 = r7.getAdapter()
                boolean r1 = r0 instanceof android.widget.HeaderViewListAdapter
                if (r1 == 0) goto L1b
                r1 = r0
                android.widget.HeaderViewListAdapter r1 = (android.widget.HeaderViewListAdapter) r1
                int r2 = r1.getHeadersCount()
                android.widget.ListAdapter r3 = r1.getWrappedAdapter()
                r1 = r3
                androidx.appcompat.view.menu.MenuAdapter r1 = (androidx.appcompat.view.menu.MenuAdapter) r1
                goto L1f
            L1b:
                r2 = 0
                r1 = r0
                androidx.appcompat.view.menu.MenuAdapter r1 = (androidx.appcompat.view.menu.MenuAdapter) r1
            L1f:
                r3 = 0
                int r4 = r8.getAction()
                r5 = 10
                if (r4 == r5) goto L47
                float r4 = r8.getX()
                int r4 = (int) r4
                float r5 = r8.getY()
                int r5 = (int) r5
                int r4 = r7.pointToPosition(r4, r5)
                r5 = -1
                if (r4 == r5) goto L47
                int r5 = r4 - r2
                if (r5 < 0) goto L47
                int r6 = r1.getCount()
                if (r5 >= r6) goto L47
                androidx.appcompat.view.menu.MenuItemImpl r3 = r1.getItem(r5)
            L47:
                android.view.MenuItem r4 = r7.mHoveredMenuItem
                if (r4 == r3) goto L5f
                androidx.appcompat.view.menu.MenuBuilder r5 = r1.getAdapterMenu()
                if (r4 == 0) goto L56
                androidx.appcompat.widget.MenuItemHoverListener r6 = r7.mHoverListener
                r6.onItemHoverExit(r5, r4)
            L56:
                r7.mHoveredMenuItem = r3
                if (r3 == 0) goto L5f
                androidx.appcompat.widget.MenuItemHoverListener r6 = r7.mHoverListener
                r6.onItemHoverEnter(r5, r3)
            L5f:
                boolean r0 = super.onHoverEvent(r8)
                return r0
        }

        @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
        public boolean onKeyDown(int r7, android.view.KeyEvent r8) {
                r6 = this;
                android.view.View r0 = r6.getSelectedView()
                androidx.appcompat.view.menu.ListMenuItemView r0 = (androidx.appcompat.view.menu.ListMenuItemView) r0
                r1 = 1
                if (r0 == 0) goto L2a
                int r2 = r6.mAdvanceKey
                if (r7 != r2) goto L2a
                boolean r2 = r0.isEnabled()
                if (r2 == 0) goto L29
                androidx.appcompat.view.menu.MenuItemImpl r2 = r0.getItemData()
                boolean r2 = r2.hasSubMenu()
                if (r2 == 0) goto L29
            L1e:
                int r2 = r6.getSelectedItemPosition()
                long r3 = r6.getSelectedItemId()
                r6.performItemClick(r0, r2, r3)
            L29:
                return r1
            L2a:
                if (r0 == 0) goto L52
                int r2 = r6.mRetreatKey
                if (r7 != r2) goto L52
                r2 = -1
                r6.setSelection(r2)
                android.widget.ListAdapter r2 = r6.getAdapter()
                boolean r3 = r2 instanceof android.widget.HeaderViewListAdapter
                if (r3 == 0) goto L46
                r3 = r2
                android.widget.HeaderViewListAdapter r3 = (android.widget.HeaderViewListAdapter) r3
                android.widget.ListAdapter r3 = r3.getWrappedAdapter()
                androidx.appcompat.view.menu.MenuAdapter r3 = (androidx.appcompat.view.menu.MenuAdapter) r3
                goto L49
            L46:
                r3 = r2
                androidx.appcompat.view.menu.MenuAdapter r3 = (androidx.appcompat.view.menu.MenuAdapter) r3
            L49:
                androidx.appcompat.view.menu.MenuBuilder r4 = r3.getAdapterMenu()
                r5 = 0
                r4.close(r5)
                return r1
            L52:
                boolean r1 = super.onKeyDown(r7, r8)
                return r1
        }

        @Override // androidx.appcompat.widget.DropDownListView, android.widget.AbsListView, android.view.View
        public /* bridge */ /* synthetic */ boolean onTouchEvent(android.view.MotionEvent r1) {
                r0 = this;
                boolean r1 = super.onTouchEvent(r1)
                return r1
        }

        public void setHoverListener(androidx.appcompat.widget.MenuItemHoverListener r1) {
                r0 = this;
                r0.mHoverListener = r1
                return
        }

        @Override // androidx.appcompat.widget.DropDownListView, android.widget.AbsListView
        public /* bridge */ /* synthetic */ void setSelector(android.graphics.drawable.Drawable r1) {
                r0 = this;
                super.setSelector(r1)
                return
        }
    }

    static {
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.NoSuchMethodException -> L19
            r1 = 28
            if (r0 > r1) goto L18
            java.lang.Class<android.widget.PopupWindow> r0 = android.widget.PopupWindow.class
            java.lang.String r1 = "setTouchModal"
            r2 = 1
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.NoSuchMethodException -> L19
            java.lang.Class r3 = java.lang.Boolean.TYPE     // Catch: java.lang.NoSuchMethodException -> L19
            r4 = 0
            r2[r4] = r3     // Catch: java.lang.NoSuchMethodException -> L19
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r2)     // Catch: java.lang.NoSuchMethodException -> L19
            androidx.appcompat.widget.MenuPopupWindow.sSetTouchModalMethod = r0     // Catch: java.lang.NoSuchMethodException -> L19
        L18:
            goto L21
        L19:
            r0 = move-exception
            java.lang.String r1 = "MenuPopupWindow"
            java.lang.String r2 = "Could not find method setTouchModal() on PopupWindow. Oh well."
            android.util.Log.i(r1, r2)
        L21:
            return
    }

    public MenuPopupWindow(android.content.Context r1, android.util.AttributeSet r2, int r3, int r4) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4)
            return
    }

    @Override // androidx.appcompat.widget.ListPopupWindow
    androidx.appcompat.widget.DropDownListView createDropDownListView(android.content.Context r2, boolean r3) {
            r1 = this;
            androidx.appcompat.widget.MenuPopupWindow$MenuDropDownListView r0 = new androidx.appcompat.widget.MenuPopupWindow$MenuDropDownListView
            r0.<init>(r2, r3)
            r0.setHoverListener(r1)
            return r0
    }

    @Override // androidx.appcompat.widget.MenuItemHoverListener
    public void onItemHoverEnter(androidx.appcompat.view.menu.MenuBuilder r2, android.view.MenuItem r3) {
            r1 = this;
            androidx.appcompat.widget.MenuItemHoverListener r0 = r1.mHoverListener
            if (r0 == 0) goto L9
            androidx.appcompat.widget.MenuItemHoverListener r0 = r1.mHoverListener
            r0.onItemHoverEnter(r2, r3)
        L9:
            return
    }

    @Override // androidx.appcompat.widget.MenuItemHoverListener
    public void onItemHoverExit(androidx.appcompat.view.menu.MenuBuilder r2, android.view.MenuItem r3) {
            r1 = this;
            androidx.appcompat.widget.MenuItemHoverListener r0 = r1.mHoverListener
            if (r0 == 0) goto L9
            androidx.appcompat.widget.MenuItemHoverListener r0 = r1.mHoverListener
            r0.onItemHoverExit(r2, r3)
        L9:
            return
    }

    public void setEnterTransition(java.lang.Object r3) {
            r2 = this;
            android.widget.PopupWindow r0 = r2.mPopup
            r1 = r3
            android.transition.Transition r1 = (android.transition.Transition) r1
            androidx.appcompat.widget.MenuPopupWindow.Api23Impl.setEnterTransition(r0, r1)
            return
    }

    public void setExitTransition(java.lang.Object r3) {
            r2 = this;
            android.widget.PopupWindow r0 = r2.mPopup
            r1 = r3
            android.transition.Transition r1 = (android.transition.Transition) r1
            androidx.appcompat.widget.MenuPopupWindow.Api23Impl.setExitTransition(r0, r1)
            return
    }

    public void setHoverListener(androidx.appcompat.widget.MenuItemHoverListener r1) {
            r0 = this;
            r0.mHoverListener = r1
            return
    }

    public void setTouchModal(boolean r4) {
            r3 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 > r1) goto L23
            java.lang.reflect.Method r0 = androidx.appcompat.widget.MenuPopupWindow.sSetTouchModalMethod
            if (r0 == 0) goto L28
            java.lang.reflect.Method r0 = androidx.appcompat.widget.MenuPopupWindow.sSetTouchModalMethod     // Catch: java.lang.Exception -> L1a
            android.widget.PopupWindow r1 = r3.mPopup     // Catch: java.lang.Exception -> L1a
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r4)     // Catch: java.lang.Exception -> L1a
            java.lang.Object[] r2 = new java.lang.Object[]{r2}     // Catch: java.lang.Exception -> L1a
            r0.invoke(r1, r2)     // Catch: java.lang.Exception -> L1a
            goto L22
        L1a:
            r0 = move-exception
            java.lang.String r1 = "MenuPopupWindow"
            java.lang.String r2 = "Could not invoke setTouchModal() on PopupWindow. Oh well."
            android.util.Log.i(r1, r2)
        L22:
            goto L28
        L23:
            android.widget.PopupWindow r0 = r3.mPopup
            androidx.appcompat.widget.MenuPopupWindow.Api29Impl.setTouchModal(r0, r4)
        L28:
            return
    }
}
