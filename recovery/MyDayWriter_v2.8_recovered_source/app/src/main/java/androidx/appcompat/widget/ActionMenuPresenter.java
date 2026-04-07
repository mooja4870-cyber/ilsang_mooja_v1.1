package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
class ActionMenuPresenter extends androidx.appcompat.view.menu.BaseMenuPresenter implements androidx.core.view.ActionProvider.SubUiVisibilityListener {
    private static final java.lang.String TAG = "ActionMenuPresenter";
    private final android.util.SparseBooleanArray mActionButtonGroups;
    androidx.appcompat.widget.ActionMenuPresenter.ActionButtonSubmenu mActionButtonPopup;
    private int mActionItemWidthLimit;
    private boolean mExpandedActionViewsExclusive;
    private int mMaxItems;
    private boolean mMaxItemsSet;
    private int mMinCellSize;
    int mOpenSubMenuId;
    androidx.appcompat.widget.ActionMenuPresenter.OverflowMenuButton mOverflowButton;
    androidx.appcompat.widget.ActionMenuPresenter.OverflowPopup mOverflowPopup;
    private android.graphics.drawable.Drawable mPendingOverflowIcon;
    private boolean mPendingOverflowIconSet;
    private androidx.appcompat.widget.ActionMenuPresenter.ActionMenuPopupCallback mPopupCallback;
    final androidx.appcompat.widget.ActionMenuPresenter.PopupPresenterCallback mPopupPresenterCallback;
    androidx.appcompat.widget.ActionMenuPresenter.OpenOverflowRunnable mPostedOpenRunnable;
    private boolean mReserveOverflow;
    private boolean mReserveOverflowSet;
    private boolean mStrictWidthLimit;
    private int mWidthLimit;
    private boolean mWidthLimitSet;

    private class ActionButtonSubmenu extends androidx.appcompat.view.menu.MenuPopupHelper {
        final /* synthetic */ androidx.appcompat.widget.ActionMenuPresenter this$0;

        public ActionButtonSubmenu(androidx.appcompat.widget.ActionMenuPresenter r7, android.content.Context r8, androidx.appcompat.view.menu.SubMenuBuilder r9, android.view.View r10) {
                r6 = this;
                r6.this$0 = r7
                r4 = 0
                int r5 = androidx.appcompat.R.attr.actionOverflowMenuStyle
                r0 = r6
                r1 = r8
                r2 = r9
                r3 = r10
                r0.<init>(r1, r2, r3, r4, r5)
                android.view.MenuItem r8 = r2.getItem()
                androidx.appcompat.view.menu.MenuItemImpl r8 = (androidx.appcompat.view.menu.MenuItemImpl) r8
                boolean r9 = r8.isActionButton()
                if (r9 != 0) goto L28
                androidx.appcompat.widget.ActionMenuPresenter$OverflowMenuButton r9 = r7.mOverflowButton
                if (r9 != 0) goto L23
                androidx.appcompat.view.menu.MenuView r9 = androidx.appcompat.widget.ActionMenuPresenter.access$200(r7)
                android.view.View r9 = (android.view.View) r9
                goto L25
            L23:
                androidx.appcompat.widget.ActionMenuPresenter$OverflowMenuButton r9 = r7.mOverflowButton
            L25:
                r6.setAnchorView(r9)
            L28:
                androidx.appcompat.widget.ActionMenuPresenter$PopupPresenterCallback r7 = r7.mPopupPresenterCallback
                r6.setPresenterCallback(r7)
                return
        }

        @Override // androidx.appcompat.view.menu.MenuPopupHelper
        protected void onDismiss() {
                r2 = this;
                androidx.appcompat.widget.ActionMenuPresenter r0 = r2.this$0
                r1 = 0
                r0.mActionButtonPopup = r1
                androidx.appcompat.widget.ActionMenuPresenter r0 = r2.this$0
                r1 = 0
                r0.mOpenSubMenuId = r1
                super.onDismiss()
                return
        }
    }

    private class ActionMenuPopupCallback extends androidx.appcompat.view.menu.ActionMenuItemView.PopupCallback {
        final /* synthetic */ androidx.appcompat.widget.ActionMenuPresenter this$0;

        ActionMenuPopupCallback(androidx.appcompat.widget.ActionMenuPresenter r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // androidx.appcompat.view.menu.ActionMenuItemView.PopupCallback
        public androidx.appcompat.view.menu.ShowableListMenu getPopup() {
                r1 = this;
                androidx.appcompat.widget.ActionMenuPresenter r0 = r1.this$0
                androidx.appcompat.widget.ActionMenuPresenter$ActionButtonSubmenu r0 = r0.mActionButtonPopup
                if (r0 == 0) goto Lf
                androidx.appcompat.widget.ActionMenuPresenter r0 = r1.this$0
                androidx.appcompat.widget.ActionMenuPresenter$ActionButtonSubmenu r0 = r0.mActionButtonPopup
                androidx.appcompat.view.menu.MenuPopup r0 = r0.getPopup()
                goto L10
            Lf:
                r0 = 0
            L10:
                return r0
        }
    }

    private class OpenOverflowRunnable implements java.lang.Runnable {
        private androidx.appcompat.widget.ActionMenuPresenter.OverflowPopup mPopup;
        final /* synthetic */ androidx.appcompat.widget.ActionMenuPresenter this$0;

        public OpenOverflowRunnable(androidx.appcompat.widget.ActionMenuPresenter r1, androidx.appcompat.widget.ActionMenuPresenter.OverflowPopup r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.mPopup = r2
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r3 = this;
                androidx.appcompat.widget.ActionMenuPresenter r0 = r3.this$0
                androidx.appcompat.view.menu.MenuBuilder r0 = androidx.appcompat.widget.ActionMenuPresenter.access$400(r0)
                if (r0 == 0) goto L11
                androidx.appcompat.widget.ActionMenuPresenter r0 = r3.this$0
                androidx.appcompat.view.menu.MenuBuilder r0 = androidx.appcompat.widget.ActionMenuPresenter.access$500(r0)
                r0.changeMenuMode()
            L11:
                androidx.appcompat.widget.ActionMenuPresenter r0 = r3.this$0
                androidx.appcompat.view.menu.MenuView r0 = androidx.appcompat.widget.ActionMenuPresenter.access$600(r0)
                android.view.View r0 = (android.view.View) r0
                if (r0 == 0) goto L2f
                android.os.IBinder r1 = r0.getWindowToken()
                if (r1 == 0) goto L2f
                androidx.appcompat.widget.ActionMenuPresenter$OverflowPopup r1 = r3.mPopup
                boolean r1 = r1.tryShow()
                if (r1 == 0) goto L2f
                androidx.appcompat.widget.ActionMenuPresenter r1 = r3.this$0
                androidx.appcompat.widget.ActionMenuPresenter$OverflowPopup r2 = r3.mPopup
                r1.mOverflowPopup = r2
            L2f:
                androidx.appcompat.widget.ActionMenuPresenter r1 = r3.this$0
                r2 = 0
                r1.mPostedOpenRunnable = r2
                return
        }
    }

    private class OverflowMenuButton extends androidx.appcompat.widget.AppCompatImageView implements androidx.appcompat.widget.ActionMenuView.ActionMenuChildView {
        final /* synthetic */ androidx.appcompat.widget.ActionMenuPresenter this$0;


        public OverflowMenuButton(androidx.appcompat.widget.ActionMenuPresenter r3, android.content.Context r4) {
                r2 = this;
                r2.this$0 = r3
                r0 = 0
                int r1 = androidx.appcompat.R.attr.actionOverflowButtonStyle
                r2.<init>(r4, r0, r1)
                r0 = 1
                r2.setClickable(r0)
                r2.setFocusable(r0)
                r1 = 0
                r2.setVisibility(r1)
                r2.setEnabled(r0)
                java.lang.CharSequence r0 = r2.getContentDescription()
                androidx.appcompat.widget.TooltipCompat.setTooltipText(r2, r0)
                androidx.appcompat.widget.ActionMenuPresenter$OverflowMenuButton$1 r0 = new androidx.appcompat.widget.ActionMenuPresenter$OverflowMenuButton$1
                r0.<init>(r2, r2, r3)
                r2.setOnTouchListener(r0)
                return
        }

        @Override // androidx.appcompat.widget.ActionMenuView.ActionMenuChildView
        public boolean needsDividerAfter() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // androidx.appcompat.widget.ActionMenuView.ActionMenuChildView
        public boolean needsDividerBefore() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // android.view.View
        public boolean performClick() {
                r2 = this;
                boolean r0 = super.performClick()
                r1 = 1
                if (r0 == 0) goto L8
                return r1
            L8:
                r0 = 0
                r2.playSoundEffect(r0)
                androidx.appcompat.widget.ActionMenuPresenter r0 = r2.this$0
                r0.showOverflowMenu()
                return r1
        }

        @Override // android.widget.ImageView
        protected boolean setFrame(int r15, int r16, int r17, int r18) {
                r14 = this;
                boolean r0 = super.setFrame(r15, r16, r17, r18)
                android.graphics.drawable.Drawable r1 = r14.getDrawable()
                android.graphics.drawable.Drawable r2 = r14.getBackground()
                if (r1 == 0) goto L43
                if (r2 == 0) goto L43
                int r3 = r14.getWidth()
                int r4 = r14.getHeight()
                int r5 = java.lang.Math.max(r3, r4)
                int r5 = r5 / 2
                int r6 = r14.getPaddingLeft()
                int r7 = r14.getPaddingRight()
                int r6 = r6 - r7
                int r7 = r14.getPaddingTop()
                int r8 = r14.getPaddingBottom()
                int r7 = r7 - r8
                int r8 = r3 + r6
                int r8 = r8 / 2
                int r9 = r4 + r7
                int r9 = r9 / 2
                int r10 = r8 - r5
                int r11 = r9 - r5
                int r12 = r8 + r5
                int r13 = r9 + r5
                androidx.core.graphics.drawable.DrawableCompat.setHotspotBounds(r2, r10, r11, r12, r13)
            L43:
                return r0
        }
    }

    private class OverflowPopup extends androidx.appcompat.view.menu.MenuPopupHelper {
        final /* synthetic */ androidx.appcompat.widget.ActionMenuPresenter this$0;

        public OverflowPopup(androidx.appcompat.widget.ActionMenuPresenter r7, android.content.Context r8, androidx.appcompat.view.menu.MenuBuilder r9, android.view.View r10, boolean r11) {
                r6 = this;
                r6.this$0 = r7
                int r5 = androidx.appcompat.R.attr.actionOverflowMenuStyle
                r0 = r6
                r1 = r8
                r2 = r9
                r3 = r10
                r4 = r11
                r0.<init>(r1, r2, r3, r4, r5)
                r8 = 8388613(0x800005, float:1.175495E-38)
                r6.setGravity(r8)
                androidx.appcompat.widget.ActionMenuPresenter$PopupPresenterCallback r7 = r7.mPopupPresenterCallback
                r6.setPresenterCallback(r7)
                return
        }

        @Override // androidx.appcompat.view.menu.MenuPopupHelper
        protected void onDismiss() {
                r2 = this;
                androidx.appcompat.widget.ActionMenuPresenter r0 = r2.this$0
                androidx.appcompat.view.menu.MenuBuilder r0 = androidx.appcompat.widget.ActionMenuPresenter.access$000(r0)
                if (r0 == 0) goto L11
                androidx.appcompat.widget.ActionMenuPresenter r0 = r2.this$0
                androidx.appcompat.view.menu.MenuBuilder r0 = androidx.appcompat.widget.ActionMenuPresenter.access$100(r0)
                r0.close()
            L11:
                androidx.appcompat.widget.ActionMenuPresenter r0 = r2.this$0
                r1 = 0
                r0.mOverflowPopup = r1
                super.onDismiss()
                return
        }
    }

    private class PopupPresenterCallback implements androidx.appcompat.view.menu.MenuPresenter.Callback {
        final /* synthetic */ androidx.appcompat.widget.ActionMenuPresenter this$0;

        PopupPresenterCallback(androidx.appcompat.widget.ActionMenuPresenter r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter.Callback
        public void onCloseMenu(androidx.appcompat.view.menu.MenuBuilder r3, boolean r4) {
                r2 = this;
                boolean r0 = r3 instanceof androidx.appcompat.view.menu.SubMenuBuilder
                if (r0 == 0) goto Lc
                androidx.appcompat.view.menu.MenuBuilder r0 = r3.getRootMenu()
                r1 = 0
                r0.close(r1)
            Lc:
                androidx.appcompat.widget.ActionMenuPresenter r0 = r2.this$0
                androidx.appcompat.view.menu.MenuPresenter$Callback r0 = r0.getCallback()
                if (r0 == 0) goto L17
                r0.onCloseMenu(r3, r4)
            L17:
                return
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter.Callback
        public boolean onOpenSubMenu(androidx.appcompat.view.menu.MenuBuilder r4) {
                r3 = this;
                androidx.appcompat.widget.ActionMenuPresenter r0 = r3.this$0
                androidx.appcompat.view.menu.MenuBuilder r0 = androidx.appcompat.widget.ActionMenuPresenter.access$300(r0)
                r1 = 0
                if (r4 != r0) goto La
                return r1
            La:
                androidx.appcompat.widget.ActionMenuPresenter r0 = r3.this$0
                r2 = r4
                androidx.appcompat.view.menu.SubMenuBuilder r2 = (androidx.appcompat.view.menu.SubMenuBuilder) r2
                android.view.MenuItem r2 = r2.getItem()
                int r2 = r2.getItemId()
                r0.mOpenSubMenuId = r2
                androidx.appcompat.widget.ActionMenuPresenter r0 = r3.this$0
                androidx.appcompat.view.menu.MenuPresenter$Callback r0 = r0.getCallback()
                if (r0 == 0) goto L25
                boolean r1 = r0.onOpenSubMenu(r4)
            L25:
                return r1
        }
    }

    private static class SavedState implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<androidx.appcompat.widget.ActionMenuPresenter.SavedState> CREATOR = null;
        public int openSubMenuId;


        static {
                androidx.appcompat.widget.ActionMenuPresenter$SavedState$1 r0 = new androidx.appcompat.widget.ActionMenuPresenter$SavedState$1
                r0.<init>()
                androidx.appcompat.widget.ActionMenuPresenter.SavedState.CREATOR = r0
                return
        }

        SavedState() {
                r0 = this;
                r0.<init>()
                return
        }

        SavedState(android.os.Parcel r2) {
                r1 = this;
                r1.<init>()
                int r0 = r2.readInt()
                r1.openSubMenuId = r0
                return
        }

        @Override // android.os.Parcelable
        public int describeContents() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel r2, int r3) {
                r1 = this;
                int r0 = r1.openSubMenuId
                r2.writeInt(r0)
                return
        }
    }

    public ActionMenuPresenter(android.content.Context r3) {
            r2 = this;
            int r0 = androidx.appcompat.R.layout.abc_action_menu_layout
            int r1 = androidx.appcompat.R.layout.abc_action_menu_item_layout
            r2.<init>(r3, r0, r1)
            android.util.SparseBooleanArray r0 = new android.util.SparseBooleanArray
            r0.<init>()
            r2.mActionButtonGroups = r0
            androidx.appcompat.widget.ActionMenuPresenter$PopupPresenterCallback r0 = new androidx.appcompat.widget.ActionMenuPresenter$PopupPresenterCallback
            r0.<init>(r2)
            r2.mPopupPresenterCallback = r0
            return
    }

    static /* synthetic */ androidx.appcompat.view.menu.MenuBuilder access$000(androidx.appcompat.widget.ActionMenuPresenter r1) {
            androidx.appcompat.view.menu.MenuBuilder r0 = r1.mMenu
            return r0
    }

    static /* synthetic */ androidx.appcompat.view.menu.MenuBuilder access$100(androidx.appcompat.widget.ActionMenuPresenter r1) {
            androidx.appcompat.view.menu.MenuBuilder r0 = r1.mMenu
            return r0
    }

    static /* synthetic */ androidx.appcompat.view.menu.MenuView access$200(androidx.appcompat.widget.ActionMenuPresenter r1) {
            androidx.appcompat.view.menu.MenuView r0 = r1.mMenuView
            return r0
    }

    static /* synthetic */ androidx.appcompat.view.menu.MenuBuilder access$300(androidx.appcompat.widget.ActionMenuPresenter r1) {
            androidx.appcompat.view.menu.MenuBuilder r0 = r1.mMenu
            return r0
    }

    static /* synthetic */ androidx.appcompat.view.menu.MenuBuilder access$400(androidx.appcompat.widget.ActionMenuPresenter r1) {
            androidx.appcompat.view.menu.MenuBuilder r0 = r1.mMenu
            return r0
    }

    static /* synthetic */ androidx.appcompat.view.menu.MenuBuilder access$500(androidx.appcompat.widget.ActionMenuPresenter r1) {
            androidx.appcompat.view.menu.MenuBuilder r0 = r1.mMenu
            return r0
    }

    static /* synthetic */ androidx.appcompat.view.menu.MenuView access$600(androidx.appcompat.widget.ActionMenuPresenter r1) {
            androidx.appcompat.view.menu.MenuView r0 = r1.mMenuView
            return r0
    }

    private android.view.View findViewForItem(android.view.MenuItem r7) {
            r6 = this;
            androidx.appcompat.view.menu.MenuView r0 = r6.mMenuView
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            int r2 = r0.getChildCount()
            r3 = 0
        Ld:
            if (r3 >= r2) goto L24
            android.view.View r4 = r0.getChildAt(r3)
            boolean r5 = r4 instanceof androidx.appcompat.view.menu.MenuView.ItemView
            if (r5 == 0) goto L21
            r5 = r4
            androidx.appcompat.view.menu.MenuView$ItemView r5 = (androidx.appcompat.view.menu.MenuView.ItemView) r5
            androidx.appcompat.view.menu.MenuItemImpl r5 = r5.getItemData()
            if (r5 != r7) goto L21
            return r4
        L21:
            int r3 = r3 + 1
            goto Ld
        L24:
            return r1
    }

    @Override // androidx.appcompat.view.menu.BaseMenuPresenter
    public void bindItemView(androidx.appcompat.view.menu.MenuItemImpl r4, androidx.appcompat.view.menu.MenuView.ItemView r5) {
            r3 = this;
            r0 = 0
            r5.initialize(r4, r0)
            androidx.appcompat.view.menu.MenuView r0 = r3.mMenuView
            androidx.appcompat.widget.ActionMenuView r0 = (androidx.appcompat.widget.ActionMenuView) r0
            r1 = r5
            androidx.appcompat.view.menu.ActionMenuItemView r1 = (androidx.appcompat.view.menu.ActionMenuItemView) r1
            r1.setItemInvoker(r0)
            androidx.appcompat.widget.ActionMenuPresenter$ActionMenuPopupCallback r2 = r3.mPopupCallback
            if (r2 != 0) goto L19
            androidx.appcompat.widget.ActionMenuPresenter$ActionMenuPopupCallback r2 = new androidx.appcompat.widget.ActionMenuPresenter$ActionMenuPopupCallback
            r2.<init>(r3)
            r3.mPopupCallback = r2
        L19:
            androidx.appcompat.widget.ActionMenuPresenter$ActionMenuPopupCallback r2 = r3.mPopupCallback
            r1.setPopupCallback(r2)
            return
    }

    public boolean dismissPopupMenus() {
            r2 = this;
            boolean r0 = r2.hideOverflowMenu()
            boolean r1 = r2.hideSubMenus()
            r0 = r0 | r1
            return r0
    }

    @Override // androidx.appcompat.view.menu.BaseMenuPresenter
    public boolean filterLeftoverView(android.view.ViewGroup r3, int r4) {
            r2 = this;
            android.view.View r0 = r3.getChildAt(r4)
            androidx.appcompat.widget.ActionMenuPresenter$OverflowMenuButton r1 = r2.mOverflowButton
            if (r0 != r1) goto La
            r0 = 0
            return r0
        La:
            boolean r0 = super.filterLeftoverView(r3, r4)
            return r0
    }

    @Override // androidx.appcompat.view.menu.BaseMenuPresenter, androidx.appcompat.view.menu.MenuPresenter
    public boolean flagActionItems() {
            r23 = this;
            r0 = r23
            androidx.appcompat.view.menu.MenuBuilder r1 = r0.mMenu
            if (r1 == 0) goto L11
            androidx.appcompat.view.menu.MenuBuilder r1 = r0.mMenu
            java.util.ArrayList r1 = r1.getVisibleItems()
            int r2 = r1.size()
            goto L13
        L11:
            r1 = 0
            r2 = 0
        L13:
            int r3 = r0.mMaxItems
            int r4 = r0.mActionItemWidthLimit
            r5 = 0
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r5)
            androidx.appcompat.view.menu.MenuView r7 = r0.mMenuView
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
        L25:
            if (r12 >= r2) goto L4e
            java.lang.Object r13 = r1.get(r12)
            androidx.appcompat.view.menu.MenuItemImpl r13 = (androidx.appcompat.view.menu.MenuItemImpl) r13
            boolean r14 = r13.requiresActionButton()
            if (r14 == 0) goto L36
            int r8 = r8 + 1
            goto L40
        L36:
            boolean r14 = r13.requestsActionButton()
            if (r14 == 0) goto L3f
            int r9 = r9 + 1
            goto L40
        L3f:
            r11 = 1
        L40:
            boolean r14 = r0.mExpandedActionViewsExclusive
            if (r14 == 0) goto L4b
            boolean r14 = r13.isActionViewExpanded()
            if (r14 == 0) goto L4b
            r3 = 0
        L4b:
            int r12 = r12 + 1
            goto L25
        L4e:
            boolean r12 = r0.mReserveOverflow
            if (r12 == 0) goto L5a
            if (r11 != 0) goto L58
            int r12 = r8 + r9
            if (r12 <= r3) goto L5a
        L58:
            int r3 = r3 + (-1)
        L5a:
            int r3 = r3 - r8
            android.util.SparseBooleanArray r12 = r0.mActionButtonGroups
            r12.clear()
            r13 = 0
            r14 = 0
            boolean r15 = r0.mStrictWidthLimit
            if (r15 == 0) goto L74
            int r15 = r0.mMinCellSize
            int r14 = r4 / r15
            int r15 = r0.mMinCellSize
            int r15 = r4 % r15
            int r5 = r0.mMinCellSize
            int r16 = r15 / r14
            int r13 = r5 + r16
        L74:
            r5 = 0
        L75:
            if (r5 >= r2) goto L187
            java.lang.Object r16 = r1.get(r5)
            r15 = r16
            androidx.appcompat.view.menu.MenuItemImpl r15 = (androidx.appcompat.view.menu.MenuItemImpl) r15
            boolean r16 = r15.requiresActionButton()
            r18 = r2
            r2 = 0
            if (r16 == 0) goto Lc1
            android.view.View r2 = r0.getItemView(r15, r2, r7)
            r16 = r3
            boolean r3 = r0.mStrictWidthLimit
            if (r3 == 0) goto L9a
            r3 = 0
            int r19 = androidx.appcompat.widget.ActionMenuView.measureChildForCells(r2, r13, r14, r6, r3)
            int r14 = r14 - r19
            goto L9d
        L9a:
            r2.measure(r6, r6)
        L9d:
            int r3 = r2.getMeasuredWidth()
            int r4 = r4 - r3
            if (r10 != 0) goto La5
            r10 = r3
        La5:
            r19 = r2
            int r2 = r15.getGroupId()
            if (r2 == 0) goto Lb4
            r20 = r3
            r3 = 1
            r12.put(r2, r3)
            goto Lb7
        Lb4:
            r20 = r3
            r3 = 1
        Lb7:
            r15.setIsActionButton(r3)
            r21 = r1
            r3 = r16
            r0 = 0
            goto L17d
        Lc1:
            r16 = r3
            boolean r3 = r15.requestsActionButton()
            if (r3 == 0) goto L173
            int r3 = r15.getGroupId()
            boolean r19 = r12.get(r3)
            if (r16 > 0) goto Ld5
            if (r19 == 0) goto Ldf
        Ld5:
            if (r4 <= 0) goto Ldf
            boolean r2 = r0.mStrictWidthLimit
            if (r2 == 0) goto Ldd
            if (r14 <= 0) goto Ldf
        Ldd:
            r2 = 1
            goto Le0
        Ldf:
            r2 = 0
        Le0:
            if (r2 == 0) goto L126
            r21 = r2
            r2 = 0
            android.view.View r2 = r0.getItemView(r15, r2, r7)
            r20 = r4
            boolean r4 = r0.mStrictWidthLimit
            if (r4 == 0) goto Lfd
            r4 = 0
            int r22 = androidx.appcompat.widget.ActionMenuView.measureChildForCells(r2, r13, r14, r6, r4)
            int r14 = r14 - r22
            if (r22 != 0) goto Lfa
            r4 = 0
            goto Lfc
        Lfa:
            r4 = r21
        Lfc:
            goto L102
        Lfd:
            r2.measure(r6, r6)
            r4 = r21
        L102:
            int r21 = r2.getMeasuredWidth()
            int r20 = r20 - r21
            if (r10 != 0) goto L10c
            r10 = r21
        L10c:
            r22 = r2
            boolean r2 = r0.mStrictWidthLimit
            if (r2 == 0) goto L11b
            if (r20 < 0) goto L116
            r2 = 1
            goto L117
        L116:
            r2 = 0
        L117:
            r2 = r2 & r4
            r4 = r20
            goto L12a
        L11b:
            int r2 = r20 + r10
            if (r2 <= 0) goto L121
            r2 = 1
            goto L122
        L121:
            r2 = 0
        L122:
            r2 = r2 & r4
            r4 = r20
            goto L12a
        L126:
            r21 = r2
            r20 = r4
        L12a:
            if (r2 == 0) goto L135
            if (r3 == 0) goto L135
            r0 = 1
            r12.put(r3, r0)
            r21 = r1
            goto L168
        L135:
            if (r19 == 0) goto L166
            r0 = 0
            r12.put(r3, r0)
            r0 = 0
        L13c:
            if (r0 >= r5) goto L161
            java.lang.Object r17 = r1.get(r0)
            r20 = r0
            r0 = r17
            androidx.appcompat.view.menu.MenuItemImpl r0 = (androidx.appcompat.view.menu.MenuItemImpl) r0
            r21 = r1
            int r1 = r0.getGroupId()
            if (r1 != r3) goto L15c
            boolean r1 = r0.isActionButton()
            if (r1 == 0) goto L158
            int r16 = r16 + 1
        L158:
            r1 = 0
            r0.setIsActionButton(r1)
        L15c:
            int r0 = r20 + 1
            r1 = r21
            goto L13c
        L161:
            r20 = r0
            r21 = r1
            goto L168
        L166:
            r21 = r1
        L168:
            if (r2 == 0) goto L16c
            int r16 = r16 + (-1)
        L16c:
            r15.setIsActionButton(r2)
            r3 = r16
            r0 = 0
            goto L17d
        L173:
            r21 = r1
            r20 = r4
            r0 = 0
            r15.setIsActionButton(r0)
            r3 = r16
        L17d:
            int r5 = r5 + 1
            r0 = r23
            r2 = r18
            r1 = r21
            goto L75
        L187:
            r17 = 1
            return r17
    }

    @Override // androidx.appcompat.view.menu.BaseMenuPresenter
    public android.view.View getItemView(androidx.appcompat.view.menu.MenuItemImpl r5, android.view.View r6, android.view.ViewGroup r7) {
            r4 = this;
            android.view.View r0 = r5.getActionView()
            if (r0 == 0) goto Lc
            boolean r1 = r5.hasCollapsibleActionView()
            if (r1 == 0) goto L10
        Lc:
            android.view.View r0 = super.getItemView(r5, r6, r7)
        L10:
            boolean r1 = r5.isActionViewExpanded()
            if (r1 == 0) goto L19
            r1 = 8
            goto L1a
        L19:
            r1 = 0
        L1a:
            r0.setVisibility(r1)
            r1 = r7
            androidx.appcompat.widget.ActionMenuView r1 = (androidx.appcompat.widget.ActionMenuView) r1
            android.view.ViewGroup$LayoutParams r2 = r0.getLayoutParams()
            boolean r3 = r1.checkLayoutParams(r2)
            if (r3 != 0) goto L31
            androidx.appcompat.widget.ActionMenuView$LayoutParams r3 = r1.generateLayoutParams(r2)
            r0.setLayoutParams(r3)
        L31:
            return r0
    }

    @Override // androidx.appcompat.view.menu.BaseMenuPresenter, androidx.appcompat.view.menu.MenuPresenter
    public androidx.appcompat.view.menu.MenuView getMenuView(android.view.ViewGroup r4) {
            r3 = this;
            androidx.appcompat.view.menu.MenuView r0 = r3.mMenuView
            androidx.appcompat.view.menu.MenuView r1 = super.getMenuView(r4)
            if (r0 == r1) goto Le
            r2 = r1
            androidx.appcompat.widget.ActionMenuView r2 = (androidx.appcompat.widget.ActionMenuView) r2
            r2.setPresenter(r3)
        Le:
            return r1
    }

    public android.graphics.drawable.Drawable getOverflowIcon() {
            r1 = this;
            androidx.appcompat.widget.ActionMenuPresenter$OverflowMenuButton r0 = r1.mOverflowButton
            if (r0 == 0) goto Lb
            androidx.appcompat.widget.ActionMenuPresenter$OverflowMenuButton r0 = r1.mOverflowButton
            android.graphics.drawable.Drawable r0 = r0.getDrawable()
            return r0
        Lb:
            boolean r0 = r1.mPendingOverflowIconSet
            if (r0 == 0) goto L12
            android.graphics.drawable.Drawable r0 = r1.mPendingOverflowIcon
            return r0
        L12:
            r0 = 0
            return r0
    }

    public boolean hideOverflowMenu() {
            r3 = this;
            androidx.appcompat.widget.ActionMenuPresenter$OpenOverflowRunnable r0 = r3.mPostedOpenRunnable
            r1 = 1
            if (r0 == 0) goto L16
            androidx.appcompat.view.menu.MenuView r0 = r3.mMenuView
            if (r0 == 0) goto L16
            androidx.appcompat.view.menu.MenuView r0 = r3.mMenuView
            android.view.View r0 = (android.view.View) r0
            androidx.appcompat.widget.ActionMenuPresenter$OpenOverflowRunnable r2 = r3.mPostedOpenRunnable
            r0.removeCallbacks(r2)
            r0 = 0
            r3.mPostedOpenRunnable = r0
            return r1
        L16:
            androidx.appcompat.widget.ActionMenuPresenter$OverflowPopup r0 = r3.mOverflowPopup
            if (r0 == 0) goto L1e
            r0.dismiss()
            return r1
        L1e:
            r1 = 0
            return r1
    }

    public boolean hideSubMenus() {
            r1 = this;
            androidx.appcompat.widget.ActionMenuPresenter$ActionButtonSubmenu r0 = r1.mActionButtonPopup
            if (r0 == 0) goto Lb
            androidx.appcompat.widget.ActionMenuPresenter$ActionButtonSubmenu r0 = r1.mActionButtonPopup
            r0.dismiss()
            r0 = 1
            return r0
        Lb:
            r0 = 0
            return r0
    }

    @Override // androidx.appcompat.view.menu.BaseMenuPresenter, androidx.appcompat.view.menu.MenuPresenter
    public void initForMenu(android.content.Context r8, androidx.appcompat.view.menu.MenuBuilder r9) {
            r7 = this;
            super.initForMenu(r8, r9)
            android.content.res.Resources r0 = r8.getResources()
            androidx.appcompat.view.ActionBarPolicy r1 = androidx.appcompat.view.ActionBarPolicy.get(r8)
            boolean r2 = r7.mReserveOverflowSet
            if (r2 != 0) goto L15
            boolean r2 = r1.showsOverflowMenuButton()
            r7.mReserveOverflow = r2
        L15:
            boolean r2 = r7.mWidthLimitSet
            if (r2 != 0) goto L1f
            int r2 = r1.getEmbeddedMenuWidthLimit()
            r7.mWidthLimit = r2
        L1f:
            boolean r2 = r7.mMaxItemsSet
            if (r2 != 0) goto L29
            int r2 = r1.getMaxActionButtons()
            r7.mMaxItems = r2
        L29:
            int r2 = r7.mWidthLimit
            boolean r3 = r7.mReserveOverflow
            r4 = 0
            if (r3 == 0) goto L5e
            androidx.appcompat.widget.ActionMenuPresenter$OverflowMenuButton r3 = r7.mOverflowButton
            if (r3 != 0) goto L56
            androidx.appcompat.widget.ActionMenuPresenter$OverflowMenuButton r3 = new androidx.appcompat.widget.ActionMenuPresenter$OverflowMenuButton
            android.content.Context r5 = r7.mSystemContext
            r3.<init>(r7, r5)
            r7.mOverflowButton = r3
            boolean r3 = r7.mPendingOverflowIconSet
            r5 = 0
            if (r3 == 0) goto L4d
            androidx.appcompat.widget.ActionMenuPresenter$OverflowMenuButton r3 = r7.mOverflowButton
            android.graphics.drawable.Drawable r6 = r7.mPendingOverflowIcon
            r3.setImageDrawable(r6)
            r7.mPendingOverflowIcon = r4
            r7.mPendingOverflowIconSet = r5
        L4d:
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r5)
            androidx.appcompat.widget.ActionMenuPresenter$OverflowMenuButton r4 = r7.mOverflowButton
            r4.measure(r3, r3)
        L56:
            androidx.appcompat.widget.ActionMenuPresenter$OverflowMenuButton r3 = r7.mOverflowButton
            int r3 = r3.getMeasuredWidth()
            int r2 = r2 - r3
            goto L60
        L5e:
            r7.mOverflowButton = r4
        L60:
            r7.mActionItemWidthLimit = r2
            android.util.DisplayMetrics r3 = r0.getDisplayMetrics()
            float r3 = r3.density
            r4 = 1113587712(0x42600000, float:56.0)
            float r3 = r3 * r4
            int r3 = (int) r3
            r7.mMinCellSize = r3
            return
    }

    public boolean isOverflowMenuShowPending() {
            r1 = this;
            androidx.appcompat.widget.ActionMenuPresenter$OpenOverflowRunnable r0 = r1.mPostedOpenRunnable
            if (r0 != 0) goto Ld
            boolean r0 = r1.isOverflowMenuShowing()
            if (r0 == 0) goto Lb
            goto Ld
        Lb:
            r0 = 0
            goto Le
        Ld:
            r0 = 1
        Le:
            return r0
    }

    public boolean isOverflowMenuShowing() {
            r1 = this;
            androidx.appcompat.widget.ActionMenuPresenter$OverflowPopup r0 = r1.mOverflowPopup
            if (r0 == 0) goto Le
            androidx.appcompat.widget.ActionMenuPresenter$OverflowPopup r0 = r1.mOverflowPopup
            boolean r0 = r0.isShowing()
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    public boolean isOverflowReserved() {
            r1 = this;
            boolean r0 = r1.mReserveOverflow
            return r0
    }

    @Override // androidx.appcompat.view.menu.BaseMenuPresenter, androidx.appcompat.view.menu.MenuPresenter
    public void onCloseMenu(androidx.appcompat.view.menu.MenuBuilder r1, boolean r2) {
            r0 = this;
            r0.dismissPopupMenus()
            super.onCloseMenu(r1, r2)
            return
    }

    public void onConfigurationChanged(android.content.res.Configuration r3) {
            r2 = this;
            boolean r0 = r2.mMaxItemsSet
            if (r0 != 0) goto L10
            android.content.Context r0 = r2.mContext
            androidx.appcompat.view.ActionBarPolicy r0 = androidx.appcompat.view.ActionBarPolicy.get(r0)
            int r0 = r0.getMaxActionButtons()
            r2.mMaxItems = r0
        L10:
            androidx.appcompat.view.menu.MenuBuilder r0 = r2.mMenu
            if (r0 == 0) goto L1a
            androidx.appcompat.view.menu.MenuBuilder r0 = r2.mMenu
            r1 = 1
            r0.onItemsChanged(r1)
        L1a:
            return
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void onRestoreInstanceState(android.os.Parcelable r4) {
            r3 = this;
            boolean r0 = r4 instanceof androidx.appcompat.widget.ActionMenuPresenter.SavedState
            if (r0 != 0) goto L5
            return
        L5:
            r0 = r4
            androidx.appcompat.widget.ActionMenuPresenter$SavedState r0 = (androidx.appcompat.widget.ActionMenuPresenter.SavedState) r0
            int r1 = r0.openSubMenuId
            if (r1 <= 0) goto L1f
            androidx.appcompat.view.menu.MenuBuilder r1 = r3.mMenu
            int r2 = r0.openSubMenuId
            android.view.MenuItem r1 = r1.findItem(r2)
            if (r1 == 0) goto L1f
            android.view.SubMenu r2 = r1.getSubMenu()
            androidx.appcompat.view.menu.SubMenuBuilder r2 = (androidx.appcompat.view.menu.SubMenuBuilder) r2
            r3.onSubMenuSelected(r2)
        L1f:
            return
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public android.os.Parcelable onSaveInstanceState() {
            r2 = this;
            androidx.appcompat.widget.ActionMenuPresenter$SavedState r0 = new androidx.appcompat.widget.ActionMenuPresenter$SavedState
            r0.<init>()
            int r1 = r2.mOpenSubMenuId
            r0.openSubMenuId = r1
            return r0
    }

    @Override // androidx.appcompat.view.menu.BaseMenuPresenter, androidx.appcompat.view.menu.MenuPresenter
    public boolean onSubMenuSelected(androidx.appcompat.view.menu.SubMenuBuilder r8) {
            r7 = this;
            boolean r0 = r8.hasVisibleItems()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            r0 = r8
        L9:
            android.view.Menu r2 = r0.getParentMenu()
            androidx.appcompat.view.menu.MenuBuilder r3 = r7.mMenu
            if (r2 == r3) goto L19
            android.view.Menu r2 = r0.getParentMenu()
            r0 = r2
            androidx.appcompat.view.menu.SubMenuBuilder r0 = (androidx.appcompat.view.menu.SubMenuBuilder) r0
            goto L9
        L19:
            android.view.MenuItem r2 = r0.getItem()
            android.view.View r2 = r7.findViewForItem(r2)
            if (r2 != 0) goto L24
            return r1
        L24:
            android.view.MenuItem r1 = r8.getItem()
            int r1 = r1.getItemId()
            r7.mOpenSubMenuId = r1
            r1 = 0
            int r3 = r8.size()
            r4 = 0
        L34:
            if (r4 >= r3) goto L4b
            android.view.MenuItem r5 = r8.getItem(r4)
            boolean r6 = r5.isVisible()
            if (r6 == 0) goto L48
            android.graphics.drawable.Drawable r6 = r5.getIcon()
            if (r6 == 0) goto L48
            r1 = 1
            goto L4b
        L48:
            int r4 = r4 + 1
            goto L34
        L4b:
            androidx.appcompat.widget.ActionMenuPresenter$ActionButtonSubmenu r4 = new androidx.appcompat.widget.ActionMenuPresenter$ActionButtonSubmenu
            android.content.Context r5 = r7.mContext
            r4.<init>(r7, r5, r8, r2)
            r7.mActionButtonPopup = r4
            androidx.appcompat.widget.ActionMenuPresenter$ActionButtonSubmenu r4 = r7.mActionButtonPopup
            r4.setForceShowIcon(r1)
            androidx.appcompat.widget.ActionMenuPresenter$ActionButtonSubmenu r4 = r7.mActionButtonPopup
            r4.show()
            super.onSubMenuSelected(r8)
            r4 = 1
            return r4
    }

    @Override // androidx.core.view.ActionProvider.SubUiVisibilityListener
    public void onSubUiVisibilityChanged(boolean r3) {
            r2 = this;
            if (r3 == 0) goto L7
            r0 = 0
            super.onSubMenuSelected(r0)
            goto L11
        L7:
            androidx.appcompat.view.menu.MenuBuilder r0 = r2.mMenu
            if (r0 == 0) goto L11
            androidx.appcompat.view.menu.MenuBuilder r0 = r2.mMenu
            r1 = 0
            r0.close(r1)
        L11:
            return
    }

    public void setExpandedActionViewsExclusive(boolean r1) {
            r0 = this;
            r0.mExpandedActionViewsExclusive = r1
            return
    }

    public void setItemLimit(int r2) {
            r1 = this;
            r1.mMaxItems = r2
            r0 = 1
            r1.mMaxItemsSet = r0
            return
    }

    public void setMenuView(androidx.appcompat.widget.ActionMenuView r2) {
            r1 = this;
            r1.mMenuView = r2
            androidx.appcompat.view.menu.MenuBuilder r0 = r1.mMenu
            r2.initialize(r0)
            return
    }

    public void setOverflowIcon(android.graphics.drawable.Drawable r2) {
            r1 = this;
            androidx.appcompat.widget.ActionMenuPresenter$OverflowMenuButton r0 = r1.mOverflowButton
            if (r0 == 0) goto La
            androidx.appcompat.widget.ActionMenuPresenter$OverflowMenuButton r0 = r1.mOverflowButton
            r0.setImageDrawable(r2)
            goto Lf
        La:
            r0 = 1
            r1.mPendingOverflowIconSet = r0
            r1.mPendingOverflowIcon = r2
        Lf:
            return
    }

    public void setReserveOverflow(boolean r2) {
            r1 = this;
            r1.mReserveOverflow = r2
            r0 = 1
            r1.mReserveOverflowSet = r0
            return
    }

    public void setWidthLimit(int r2, boolean r3) {
            r1 = this;
            r1.mWidthLimit = r2
            r1.mStrictWidthLimit = r3
            r0 = 1
            r1.mWidthLimitSet = r0
            return
    }

    @Override // androidx.appcompat.view.menu.BaseMenuPresenter
    public boolean shouldIncludeItem(int r2, androidx.appcompat.view.menu.MenuItemImpl r3) {
            r1 = this;
            boolean r0 = r3.isActionButton()
            return r0
    }

    public boolean showOverflowMenu() {
            r7 = this;
            boolean r0 = r7.mReserveOverflow
            if (r0 == 0) goto L43
            boolean r0 = r7.isOverflowMenuShowing()
            if (r0 != 0) goto L43
            androidx.appcompat.view.menu.MenuBuilder r0 = r7.mMenu
            if (r0 == 0) goto L43
            androidx.appcompat.view.menu.MenuView r0 = r7.mMenuView
            if (r0 == 0) goto L43
            androidx.appcompat.widget.ActionMenuPresenter$OpenOverflowRunnable r0 = r7.mPostedOpenRunnable
            if (r0 != 0) goto L43
            androidx.appcompat.view.menu.MenuBuilder r0 = r7.mMenu
            java.util.ArrayList r0 = r0.getNonActionItems()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L41
            androidx.appcompat.widget.ActionMenuPresenter$OverflowPopup r1 = new androidx.appcompat.widget.ActionMenuPresenter$OverflowPopup
            android.content.Context r3 = r7.mContext
            androidx.appcompat.view.menu.MenuBuilder r4 = r7.mMenu
            androidx.appcompat.widget.ActionMenuPresenter$OverflowMenuButton r5 = r7.mOverflowButton
            r6 = 1
            r2 = r7
            r1.<init>(r2, r3, r4, r5, r6)
            androidx.appcompat.widget.ActionMenuPresenter$OpenOverflowRunnable r0 = new androidx.appcompat.widget.ActionMenuPresenter$OpenOverflowRunnable
            r0.<init>(r7, r1)
            r2.mPostedOpenRunnable = r0
            androidx.appcompat.view.menu.MenuView r0 = r2.mMenuView
            android.view.View r0 = (android.view.View) r0
            androidx.appcompat.widget.ActionMenuPresenter$OpenOverflowRunnable r3 = r2.mPostedOpenRunnable
            r0.post(r3)
            r0 = 1
            return r0
        L41:
            r2 = r7
            goto L44
        L43:
            r2 = r7
        L44:
            r0 = 0
            return r0
    }

    @Override // androidx.appcompat.view.menu.BaseMenuPresenter, androidx.appcompat.view.menu.MenuPresenter
    public void updateMenuView(boolean r7) {
            r6 = this;
            super.updateMenuView(r7)
            androidx.appcompat.view.menu.MenuView r0 = r6.mMenuView
            android.view.View r0 = (android.view.View) r0
            r0.requestLayout()
            androidx.appcompat.view.menu.MenuBuilder r0 = r6.mMenu
            if (r0 == 0) goto L2d
            androidx.appcompat.view.menu.MenuBuilder r0 = r6.mMenu
            java.util.ArrayList r0 = r0.getActionItems()
            int r1 = r0.size()
            r2 = 0
        L19:
            if (r2 >= r1) goto L2d
            java.lang.Object r3 = r0.get(r2)
            androidx.appcompat.view.menu.MenuItemImpl r3 = (androidx.appcompat.view.menu.MenuItemImpl) r3
            androidx.core.view.ActionProvider r3 = r3.getSupportActionProvider()
            if (r3 == 0) goto L2a
            r3.setSubUiVisibilityListener(r6)
        L2a:
            int r2 = r2 + 1
            goto L19
        L2d:
            androidx.appcompat.view.menu.MenuBuilder r0 = r6.mMenu
            if (r0 == 0) goto L38
            androidx.appcompat.view.menu.MenuBuilder r0 = r6.mMenu
            java.util.ArrayList r0 = r0.getNonActionItems()
            goto L39
        L38:
            r0 = 0
        L39:
            r1 = 0
            boolean r2 = r6.mReserveOverflow
            if (r2 == 0) goto L59
            if (r0 == 0) goto L59
            int r2 = r0.size()
            r3 = 0
            r4 = 1
            if (r2 != r4) goto L55
            java.lang.Object r3 = r0.get(r3)
            androidx.appcompat.view.menu.MenuItemImpl r3 = (androidx.appcompat.view.menu.MenuItemImpl) r3
            boolean r3 = r3.isActionViewExpanded()
            r3 = r3 ^ r4
            r1 = r3
            goto L59
        L55:
            if (r2 <= 0) goto L58
            r3 = r4
        L58:
            r1 = r3
        L59:
            if (r1 == 0) goto L89
            androidx.appcompat.widget.ActionMenuPresenter$OverflowMenuButton r2 = r6.mOverflowButton
            if (r2 != 0) goto L68
            androidx.appcompat.widget.ActionMenuPresenter$OverflowMenuButton r2 = new androidx.appcompat.widget.ActionMenuPresenter$OverflowMenuButton
            android.content.Context r3 = r6.mSystemContext
            r2.<init>(r6, r3)
            r6.mOverflowButton = r2
        L68:
            androidx.appcompat.widget.ActionMenuPresenter$OverflowMenuButton r2 = r6.mOverflowButton
            android.view.ViewParent r2 = r2.getParent()
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            androidx.appcompat.view.menu.MenuView r3 = r6.mMenuView
            if (r2 == r3) goto La1
            if (r2 == 0) goto L7b
            androidx.appcompat.widget.ActionMenuPresenter$OverflowMenuButton r3 = r6.mOverflowButton
            r2.removeView(r3)
        L7b:
            androidx.appcompat.view.menu.MenuView r3 = r6.mMenuView
            androidx.appcompat.widget.ActionMenuView r3 = (androidx.appcompat.widget.ActionMenuView) r3
            androidx.appcompat.widget.ActionMenuPresenter$OverflowMenuButton r4 = r6.mOverflowButton
            androidx.appcompat.widget.ActionMenuView$LayoutParams r5 = r3.generateOverflowButtonLayoutParams()
            r3.addView(r4, r5)
            goto La1
        L89:
            androidx.appcompat.widget.ActionMenuPresenter$OverflowMenuButton r2 = r6.mOverflowButton
            if (r2 == 0) goto La1
            androidx.appcompat.widget.ActionMenuPresenter$OverflowMenuButton r2 = r6.mOverflowButton
            android.view.ViewParent r2 = r2.getParent()
            androidx.appcompat.view.menu.MenuView r3 = r6.mMenuView
            if (r2 != r3) goto La1
            androidx.appcompat.view.menu.MenuView r2 = r6.mMenuView
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            androidx.appcompat.widget.ActionMenuPresenter$OverflowMenuButton r3 = r6.mOverflowButton
            r2.removeView(r3)
            goto La2
        La1:
        La2:
            androidx.appcompat.view.menu.MenuView r2 = r6.mMenuView
            androidx.appcompat.widget.ActionMenuView r2 = (androidx.appcompat.widget.ActionMenuView) r2
            boolean r3 = r6.mReserveOverflow
            r2.setOverflowReserved(r3)
            return
    }
}
