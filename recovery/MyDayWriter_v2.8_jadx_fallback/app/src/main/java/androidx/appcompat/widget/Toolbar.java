package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
public class Toolbar extends android.view.ViewGroup implements androidx.core.view.MenuHost {
    private static final java.lang.String TAG = "Toolbar";
    private androidx.appcompat.view.menu.MenuPresenter.Callback mActionMenuPresenterCallback;
    private android.window.OnBackInvokedCallback mBackInvokedCallback;
    private boolean mBackInvokedCallbackEnabled;
    private android.window.OnBackInvokedDispatcher mBackInvokedDispatcher;
    int mButtonGravity;
    android.widget.ImageButton mCollapseButtonView;
    private java.lang.CharSequence mCollapseDescription;
    private android.graphics.drawable.Drawable mCollapseIcon;
    private boolean mCollapsible;
    private int mContentInsetEndWithActions;
    private int mContentInsetStartWithNavigation;
    private androidx.appcompat.widget.RtlSpacingHelper mContentInsets;
    private boolean mEatingHover;
    private boolean mEatingTouch;
    android.view.View mExpandedActionView;
    private androidx.appcompat.widget.Toolbar.ExpandedActionViewMenuPresenter mExpandedMenuPresenter;
    private int mGravity;
    private final java.util.ArrayList<android.view.View> mHiddenViews;
    private android.widget.ImageView mLogoView;
    private int mMaxButtonHeight;
    androidx.appcompat.view.menu.MenuBuilder.Callback mMenuBuilderCallback;
    final androidx.core.view.MenuHostHelper mMenuHostHelper;
    androidx.appcompat.widget.ActionMenuView mMenuView;
    private final androidx.appcompat.widget.ActionMenuView.OnMenuItemClickListener mMenuViewItemClickListener;
    private android.widget.ImageButton mNavButtonView;
    androidx.appcompat.widget.Toolbar.OnMenuItemClickListener mOnMenuItemClickListener;
    private androidx.appcompat.widget.ActionMenuPresenter mOuterActionMenuPresenter;
    private android.content.Context mPopupContext;
    private int mPopupTheme;
    private java.util.ArrayList<android.view.MenuItem> mProvidedMenuItems;
    private final java.lang.Runnable mShowOverflowMenuRunnable;
    private java.lang.CharSequence mSubtitleText;
    private int mSubtitleTextAppearance;
    private android.content.res.ColorStateList mSubtitleTextColor;
    private android.widget.TextView mSubtitleTextView;
    private final int[] mTempMargins;
    private final java.util.ArrayList<android.view.View> mTempViews;
    private int mTitleMarginBottom;
    private int mTitleMarginEnd;
    private int mTitleMarginStart;
    private int mTitleMarginTop;
    private java.lang.CharSequence mTitleText;
    private int mTitleTextAppearance;
    private android.content.res.ColorStateList mTitleTextColor;
    private android.widget.TextView mTitleTextView;
    private androidx.appcompat.widget.ToolbarWidgetWrapper mWrapper;





    static class Api33Impl {
        private Api33Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static android.window.OnBackInvokedDispatcher findOnBackInvokedDispatcher(android.view.View r1) {
                android.window.OnBackInvokedDispatcher r0 = r1.findOnBackInvokedDispatcher()
                return r0
        }

        static android.window.OnBackInvokedCallback newOnBackInvokedCallback(java.lang.Runnable r1) {
                java.util.Objects.requireNonNull(r1)
                androidx.appcompat.widget.Toolbar$Api33Impl$$ExternalSyntheticLambda0 r0 = new androidx.appcompat.widget.Toolbar$Api33Impl$$ExternalSyntheticLambda0
                r0.<init>(r1)
                return r0
        }

        static void tryRegisterOnBackInvokedCallback(java.lang.Object r3, java.lang.Object r4) {
                r0 = r3
                android.window.OnBackInvokedDispatcher r0 = (android.window.OnBackInvokedDispatcher) r0
                r1 = 1000000(0xf4240, float:1.401298E-39)
                r2 = r4
                android.window.OnBackInvokedCallback r2 = (android.window.OnBackInvokedCallback) r2
                r0.registerOnBackInvokedCallback(r1, r2)
                return
        }

        static void tryUnregisterOnBackInvokedCallback(java.lang.Object r2, java.lang.Object r3) {
                r0 = r2
                android.window.OnBackInvokedDispatcher r0 = (android.window.OnBackInvokedDispatcher) r0
                r1 = r3
                android.window.OnBackInvokedCallback r1 = (android.window.OnBackInvokedCallback) r1
                r0.unregisterOnBackInvokedCallback(r1)
                return
        }
    }

    private class ExpandedActionViewMenuPresenter implements androidx.appcompat.view.menu.MenuPresenter {
        androidx.appcompat.view.menu.MenuItemImpl mCurrentExpandedItem;
        androidx.appcompat.view.menu.MenuBuilder mMenu;
        final /* synthetic */ androidx.appcompat.widget.Toolbar this$0;

        ExpandedActionViewMenuPresenter(androidx.appcompat.widget.Toolbar r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter
        public boolean collapseItemActionView(androidx.appcompat.view.menu.MenuBuilder r3, androidx.appcompat.view.menu.MenuItemImpl r4) {
                r2 = this;
                androidx.appcompat.widget.Toolbar r0 = r2.this$0
                android.view.View r0 = r0.mExpandedActionView
                boolean r0 = r0 instanceof androidx.appcompat.view.CollapsibleActionView
                if (r0 == 0) goto L11
                androidx.appcompat.widget.Toolbar r0 = r2.this$0
                android.view.View r0 = r0.mExpandedActionView
                androidx.appcompat.view.CollapsibleActionView r0 = (androidx.appcompat.view.CollapsibleActionView) r0
                r0.onActionViewCollapsed()
            L11:
                androidx.appcompat.widget.Toolbar r0 = r2.this$0
                androidx.appcompat.widget.Toolbar r1 = r2.this$0
                android.view.View r1 = r1.mExpandedActionView
                r0.removeView(r1)
                androidx.appcompat.widget.Toolbar r0 = r2.this$0
                androidx.appcompat.widget.Toolbar r1 = r2.this$0
                android.widget.ImageButton r1 = r1.mCollapseButtonView
                r0.removeView(r1)
                androidx.appcompat.widget.Toolbar r0 = r2.this$0
                r1 = 0
                r0.mExpandedActionView = r1
                androidx.appcompat.widget.Toolbar r0 = r2.this$0
                r0.addChildrenForExpandedActionView()
                r2.mCurrentExpandedItem = r1
                androidx.appcompat.widget.Toolbar r0 = r2.this$0
                r0.requestLayout()
                r0 = 0
                r4.setActionViewExpanded(r0)
                androidx.appcompat.widget.Toolbar r0 = r2.this$0
                r0.updateBackInvokedCallbackState()
                r0 = 1
                return r0
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter
        public boolean expandItemActionView(androidx.appcompat.view.menu.MenuBuilder r6, androidx.appcompat.view.menu.MenuItemImpl r7) {
                r5 = this;
                androidx.appcompat.widget.Toolbar r0 = r5.this$0
                r0.ensureCollapseButtonView()
                androidx.appcompat.widget.Toolbar r0 = r5.this$0
                android.widget.ImageButton r0 = r0.mCollapseButtonView
                android.view.ViewParent r0 = r0.getParent()
                androidx.appcompat.widget.Toolbar r1 = r5.this$0
                if (r0 == r1) goto L28
                boolean r1 = r0 instanceof android.view.ViewGroup
                if (r1 == 0) goto L1f
                r1 = r0
                android.view.ViewGroup r1 = (android.view.ViewGroup) r1
                androidx.appcompat.widget.Toolbar r2 = r5.this$0
                android.widget.ImageButton r2 = r2.mCollapseButtonView
                r1.removeView(r2)
            L1f:
                androidx.appcompat.widget.Toolbar r1 = r5.this$0
                androidx.appcompat.widget.Toolbar r2 = r5.this$0
                android.widget.ImageButton r2 = r2.mCollapseButtonView
                r1.addView(r2)
            L28:
                androidx.appcompat.widget.Toolbar r1 = r5.this$0
                android.view.View r2 = r7.getActionView()
                r1.mExpandedActionView = r2
                r5.mCurrentExpandedItem = r7
                androidx.appcompat.widget.Toolbar r1 = r5.this$0
                android.view.View r1 = r1.mExpandedActionView
                android.view.ViewParent r1 = r1.getParent()
                androidx.appcompat.widget.Toolbar r2 = r5.this$0
                if (r1 == r2) goto L71
                boolean r2 = r1 instanceof android.view.ViewGroup
                if (r2 == 0) goto L4c
                r2 = r1
                android.view.ViewGroup r2 = (android.view.ViewGroup) r2
                androidx.appcompat.widget.Toolbar r3 = r5.this$0
                android.view.View r3 = r3.mExpandedActionView
                r2.removeView(r3)
            L4c:
                androidx.appcompat.widget.Toolbar r2 = r5.this$0
                androidx.appcompat.widget.Toolbar$LayoutParams r2 = r2.generateDefaultLayoutParams()
                androidx.appcompat.widget.Toolbar r3 = r5.this$0
                int r3 = r3.mButtonGravity
                r3 = r3 & 112(0x70, float:1.57E-43)
                r4 = 8388611(0x800003, float:1.1754948E-38)
                r3 = r3 | r4
                r2.gravity = r3
                r3 = 2
                r2.mViewType = r3
                androidx.appcompat.widget.Toolbar r3 = r5.this$0
                android.view.View r3 = r3.mExpandedActionView
                r3.setLayoutParams(r2)
                androidx.appcompat.widget.Toolbar r3 = r5.this$0
                androidx.appcompat.widget.Toolbar r4 = r5.this$0
                android.view.View r4 = r4.mExpandedActionView
                r3.addView(r4)
            L71:
                androidx.appcompat.widget.Toolbar r2 = r5.this$0
                r2.removeChildrenForExpandedActionView()
                androidx.appcompat.widget.Toolbar r2 = r5.this$0
                r2.requestLayout()
                r2 = 1
                r7.setActionViewExpanded(r2)
                androidx.appcompat.widget.Toolbar r3 = r5.this$0
                android.view.View r3 = r3.mExpandedActionView
                boolean r3 = r3 instanceof androidx.appcompat.view.CollapsibleActionView
                if (r3 == 0) goto L90
                androidx.appcompat.widget.Toolbar r3 = r5.this$0
                android.view.View r3 = r3.mExpandedActionView
                androidx.appcompat.view.CollapsibleActionView r3 = (androidx.appcompat.view.CollapsibleActionView) r3
                r3.onActionViewExpanded()
            L90:
                androidx.appcompat.widget.Toolbar r3 = r5.this$0
                r3.updateBackInvokedCallbackState()
                return r2
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter
        public boolean flagActionItems() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter
        public int getId() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter
        public androidx.appcompat.view.menu.MenuView getMenuView(android.view.ViewGroup r2) {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter
        public void initForMenu(android.content.Context r3, androidx.appcompat.view.menu.MenuBuilder r4) {
                r2 = this;
                androidx.appcompat.view.menu.MenuBuilder r0 = r2.mMenu
                if (r0 == 0) goto Lf
                androidx.appcompat.view.menu.MenuItemImpl r0 = r2.mCurrentExpandedItem
                if (r0 == 0) goto Lf
                androidx.appcompat.view.menu.MenuBuilder r0 = r2.mMenu
                androidx.appcompat.view.menu.MenuItemImpl r1 = r2.mCurrentExpandedItem
                r0.collapseItemActionView(r1)
            Lf:
                r2.mMenu = r4
                return
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter
        public void onCloseMenu(androidx.appcompat.view.menu.MenuBuilder r1, boolean r2) {
                r0 = this;
                return
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
        public boolean onSubMenuSelected(androidx.appcompat.view.menu.SubMenuBuilder r2) {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter
        public void setCallback(androidx.appcompat.view.menu.MenuPresenter.Callback r1) {
                r0 = this;
                return
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter
        public void updateMenuView(boolean r6) {
                r5 = this;
                androidx.appcompat.view.menu.MenuItemImpl r0 = r5.mCurrentExpandedItem
                if (r0 == 0) goto L2a
                r0 = 0
                androidx.appcompat.view.menu.MenuBuilder r1 = r5.mMenu
                if (r1 == 0) goto L21
                androidx.appcompat.view.menu.MenuBuilder r1 = r5.mMenu
                int r1 = r1.size()
                r2 = 0
            L10:
                if (r2 >= r1) goto L21
                androidx.appcompat.view.menu.MenuBuilder r3 = r5.mMenu
                android.view.MenuItem r3 = r3.getItem(r2)
                androidx.appcompat.view.menu.MenuItemImpl r4 = r5.mCurrentExpandedItem
                if (r3 != r4) goto L1e
                r0 = 1
                goto L21
            L1e:
                int r2 = r2 + 1
                goto L10
            L21:
                if (r0 != 0) goto L2a
                androidx.appcompat.view.menu.MenuBuilder r1 = r5.mMenu
                androidx.appcompat.view.menu.MenuItemImpl r2 = r5.mCurrentExpandedItem
                r5.collapseItemActionView(r1, r2)
            L2a:
                return
        }
    }

    public final class InspectionCompanion implements android.view.inspector.InspectionCompanion<androidx.appcompat.widget.Toolbar> {
        private int mCollapseContentDescriptionId;
        private int mCollapseIconId;
        private int mContentInsetEndId;
        private int mContentInsetEndWithActionsId;
        private int mContentInsetLeftId;
        private int mContentInsetRightId;
        private int mContentInsetStartId;
        private int mContentInsetStartWithNavigationId;
        private int mLogoDescriptionId;
        private int mLogoId;
        private int mMenuId;
        private int mNavigationContentDescriptionId;
        private int mNavigationIconId;
        private int mPopupThemeId;
        private boolean mPropertiesMapped;
        private int mSubtitleId;
        private int mTitleId;
        private int mTitleMarginBottomId;
        private int mTitleMarginEndId;
        private int mTitleMarginStartId;
        private int mTitleMarginTopId;

        public InspectionCompanion() {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.mPropertiesMapped = r0
                return
        }

        @Override // android.view.inspector.InspectionCompanion
        public void mapProperties(android.view.inspector.PropertyMapper r3) {
                r2 = this;
                java.lang.String r0 = "collapseContentDescription"
                int r1 = androidx.appcompat.R.attr.collapseContentDescription
                int r0 = r3.mapObject(r0, r1)
                r2.mCollapseContentDescriptionId = r0
                java.lang.String r0 = "collapseIcon"
                int r1 = androidx.appcompat.R.attr.collapseIcon
                int r0 = r3.mapObject(r0, r1)
                r2.mCollapseIconId = r0
                java.lang.String r0 = "contentInsetEnd"
                int r1 = androidx.appcompat.R.attr.contentInsetEnd
                int r0 = r3.mapInt(r0, r1)
                r2.mContentInsetEndId = r0
                java.lang.String r0 = "contentInsetEndWithActions"
                int r1 = androidx.appcompat.R.attr.contentInsetEndWithActions
                int r0 = r3.mapInt(r0, r1)
                r2.mContentInsetEndWithActionsId = r0
                java.lang.String r0 = "contentInsetLeft"
                int r1 = androidx.appcompat.R.attr.contentInsetLeft
                int r0 = r3.mapInt(r0, r1)
                r2.mContentInsetLeftId = r0
                java.lang.String r0 = "contentInsetRight"
                int r1 = androidx.appcompat.R.attr.contentInsetRight
                int r0 = r3.mapInt(r0, r1)
                r2.mContentInsetRightId = r0
                java.lang.String r0 = "contentInsetStart"
                int r1 = androidx.appcompat.R.attr.contentInsetStart
                int r0 = r3.mapInt(r0, r1)
                r2.mContentInsetStartId = r0
                java.lang.String r0 = "contentInsetStartWithNavigation"
                int r1 = androidx.appcompat.R.attr.contentInsetStartWithNavigation
                int r0 = r3.mapInt(r0, r1)
                r2.mContentInsetStartWithNavigationId = r0
                java.lang.String r0 = "logo"
                int r1 = androidx.appcompat.R.attr.logo
                int r0 = r3.mapObject(r0, r1)
                r2.mLogoId = r0
                java.lang.String r0 = "logoDescription"
                int r1 = androidx.appcompat.R.attr.logoDescription
                int r0 = r3.mapObject(r0, r1)
                r2.mLogoDescriptionId = r0
                java.lang.String r0 = "menu"
                int r1 = androidx.appcompat.R.attr.menu
                int r0 = r3.mapObject(r0, r1)
                r2.mMenuId = r0
                java.lang.String r0 = "navigationContentDescription"
                int r1 = androidx.appcompat.R.attr.navigationContentDescription
                int r0 = r3.mapObject(r0, r1)
                r2.mNavigationContentDescriptionId = r0
                java.lang.String r0 = "navigationIcon"
                int r1 = androidx.appcompat.R.attr.navigationIcon
                int r0 = r3.mapObject(r0, r1)
                r2.mNavigationIconId = r0
                java.lang.String r0 = "popupTheme"
                int r1 = androidx.appcompat.R.attr.popupTheme
                int r0 = r3.mapResourceId(r0, r1)
                r2.mPopupThemeId = r0
                java.lang.String r0 = "subtitle"
                int r1 = androidx.appcompat.R.attr.subtitle
                int r0 = r3.mapObject(r0, r1)
                r2.mSubtitleId = r0
                java.lang.String r0 = "title"
                int r1 = androidx.appcompat.R.attr.title
                int r0 = r3.mapObject(r0, r1)
                r2.mTitleId = r0
                java.lang.String r0 = "titleMarginBottom"
                int r1 = androidx.appcompat.R.attr.titleMarginBottom
                int r0 = r3.mapInt(r0, r1)
                r2.mTitleMarginBottomId = r0
                java.lang.String r0 = "titleMarginEnd"
                int r1 = androidx.appcompat.R.attr.titleMarginEnd
                int r0 = r3.mapInt(r0, r1)
                r2.mTitleMarginEndId = r0
                java.lang.String r0 = "titleMarginStart"
                int r1 = androidx.appcompat.R.attr.titleMarginStart
                int r0 = r3.mapInt(r0, r1)
                r2.mTitleMarginStartId = r0
                java.lang.String r0 = "titleMarginTop"
                int r1 = androidx.appcompat.R.attr.titleMarginTop
                int r0 = r3.mapInt(r0, r1)
                r2.mTitleMarginTopId = r0
                r0 = 1
                r2.mPropertiesMapped = r0
                return
        }

        /* JADX INFO: renamed from: readProperties, reason: avoid collision after fix types in other method */
        public void readProperties2(androidx.appcompat.widget.Toolbar r3, android.view.inspector.PropertyReader r4) {
                r2 = this;
                boolean r0 = r2.mPropertiesMapped
                if (r0 == 0) goto Lb9
                int r0 = r2.mCollapseContentDescriptionId
                java.lang.CharSequence r1 = r3.getCollapseContentDescription()
                r4.readObject(r0, r1)
                int r0 = r2.mCollapseIconId
                android.graphics.drawable.Drawable r1 = r3.getCollapseIcon()
                r4.readObject(r0, r1)
                int r0 = r2.mContentInsetEndId
                int r1 = r3.getContentInsetEnd()
                r4.readInt(r0, r1)
                int r0 = r2.mContentInsetEndWithActionsId
                int r1 = r3.getContentInsetEndWithActions()
                r4.readInt(r0, r1)
                int r0 = r2.mContentInsetLeftId
                int r1 = r3.getContentInsetLeft()
                r4.readInt(r0, r1)
                int r0 = r2.mContentInsetRightId
                int r1 = r3.getContentInsetRight()
                r4.readInt(r0, r1)
                int r0 = r2.mContentInsetStartId
                int r1 = r3.getContentInsetStart()
                r4.readInt(r0, r1)
                int r0 = r2.mContentInsetStartWithNavigationId
                int r1 = r3.getContentInsetStartWithNavigation()
                r4.readInt(r0, r1)
                int r0 = r2.mLogoId
                android.graphics.drawable.Drawable r1 = r3.getLogo()
                r4.readObject(r0, r1)
                int r0 = r2.mLogoDescriptionId
                java.lang.CharSequence r1 = r3.getLogoDescription()
                r4.readObject(r0, r1)
                int r0 = r2.mMenuId
                android.view.Menu r1 = r3.getMenu()
                r4.readObject(r0, r1)
                int r0 = r2.mNavigationContentDescriptionId
                java.lang.CharSequence r1 = r3.getNavigationContentDescription()
                r4.readObject(r0, r1)
                int r0 = r2.mNavigationIconId
                android.graphics.drawable.Drawable r1 = r3.getNavigationIcon()
                r4.readObject(r0, r1)
                int r0 = r2.mPopupThemeId
                int r1 = r3.getPopupTheme()
                r4.readResourceId(r0, r1)
                int r0 = r2.mSubtitleId
                java.lang.CharSequence r1 = r3.getSubtitle()
                r4.readObject(r0, r1)
                int r0 = r2.mTitleId
                java.lang.CharSequence r1 = r3.getTitle()
                r4.readObject(r0, r1)
                int r0 = r2.mTitleMarginBottomId
                int r1 = r3.getTitleMarginBottom()
                r4.readInt(r0, r1)
                int r0 = r2.mTitleMarginEndId
                int r1 = r3.getTitleMarginEnd()
                r4.readInt(r0, r1)
                int r0 = r2.mTitleMarginStartId
                int r1 = r3.getTitleMarginStart()
                r4.readInt(r0, r1)
                int r0 = r2.mTitleMarginTopId
                int r1 = r3.getTitleMarginTop()
                r4.readInt(r0, r1)
                return
            Lb9:
                android.view.inspector.InspectionCompanion$UninitializedPropertyMapException r0 = new android.view.inspector.InspectionCompanion$UninitializedPropertyMapException
                r0.<init>()
                throw r0
        }

        @Override // android.view.inspector.InspectionCompanion
        public /* bridge */ /* synthetic */ void readProperties(androidx.appcompat.widget.Toolbar r1, android.view.inspector.PropertyReader r2) {
                r0 = this;
                androidx.appcompat.widget.Toolbar r1 = (androidx.appcompat.widget.Toolbar) r1
                r0.readProperties2(r1, r2)
                return
        }
    }

    public static class LayoutParams extends androidx.appcompat.app.ActionBar.LayoutParams {
        static final int CUSTOM = 0;
        static final int EXPANDED = 2;
        static final int SYSTEM = 1;
        int mViewType;

        public LayoutParams(int r3) {
                r2 = this;
                r0 = -2
                r1 = -1
                r2.<init>(r0, r1, r3)
                return
        }

        public LayoutParams(int r2, int r3) {
                r1 = this;
                r1.<init>(r2, r3)
                r0 = 0
                r1.mViewType = r0
                r0 = 8388627(0x800013, float:1.175497E-38)
                r1.gravity = r0
                return
        }

        public LayoutParams(int r2, int r3, int r4) {
                r1 = this;
                r1.<init>(r2, r3)
                r0 = 0
                r1.mViewType = r0
                r1.gravity = r4
                return
        }

        public LayoutParams(android.content.Context r2, android.util.AttributeSet r3) {
                r1 = this;
                r1.<init>(r2, r3)
                r0 = 0
                r1.mViewType = r0
                return
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams r2) {
                r1 = this;
                r1.<init>(r2)
                r0 = 0
                r1.mViewType = r0
                return
        }

        public LayoutParams(android.view.ViewGroup.MarginLayoutParams r2) {
                r1 = this;
                r1.<init>(r2)
                r0 = 0
                r1.mViewType = r0
                r1.copyMarginsFromCompat(r2)
                return
        }

        public LayoutParams(androidx.appcompat.app.ActionBar.LayoutParams r2) {
                r1 = this;
                r1.<init>(r2)
                r0 = 0
                r1.mViewType = r0
                return
        }

        public LayoutParams(androidx.appcompat.widget.Toolbar.LayoutParams r2) {
                r1 = this;
                r1.<init>(r2)
                r0 = 0
                r1.mViewType = r0
                int r0 = r2.mViewType
                r1.mViewType = r0
                return
        }

        void copyMarginsFromCompat(android.view.ViewGroup.MarginLayoutParams r2) {
                r1 = this;
                int r0 = r2.leftMargin
                r1.leftMargin = r0
                int r0 = r2.topMargin
                r1.topMargin = r0
                int r0 = r2.rightMargin
                r1.rightMargin = r0
                int r0 = r2.bottomMargin
                r1.bottomMargin = r0
                return
        }
    }

    public interface OnMenuItemClickListener {
        boolean onMenuItemClick(android.view.MenuItem r1);
    }

    public static class SavedState extends androidx.customview.view.AbsSavedState {
        public static final android.os.Parcelable.Creator<androidx.appcompat.widget.Toolbar.SavedState> CREATOR = null;
        int expandedMenuItemId;
        boolean isOverflowOpen;


        static {
                androidx.appcompat.widget.Toolbar$SavedState$1 r0 = new androidx.appcompat.widget.Toolbar$SavedState$1
                r0.<init>()
                androidx.appcompat.widget.Toolbar.SavedState.CREATOR = r0
                return
        }

        public SavedState(android.os.Parcel r2) {
                r1 = this;
                r0 = 0
                r1.<init>(r2, r0)
                return
        }

        public SavedState(android.os.Parcel r2, java.lang.ClassLoader r3) {
                r1 = this;
                r1.<init>(r2, r3)
                int r0 = r2.readInt()
                r1.expandedMenuItemId = r0
                int r0 = r2.readInt()
                if (r0 == 0) goto L11
                r0 = 1
                goto L12
            L11:
                r0 = 0
            L12:
                r1.isOverflowOpen = r0
                return
        }

        public SavedState(android.os.Parcelable r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(android.os.Parcel r2, int r3) {
                r1 = this;
                super.writeToParcel(r2, r3)
                int r0 = r1.expandedMenuItemId
                r2.writeInt(r0)
                boolean r0 = r1.isOverflowOpen
                r2.writeInt(r0)
                return
        }
    }

    public Toolbar(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public Toolbar(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            int r0 = androidx.appcompat.R.attr.toolbarStyle
            r1.<init>(r2, r3, r0)
            return
    }

    public Toolbar(android.content.Context r21, android.util.AttributeSet r22, int r23) {
            r20 = this;
            r0 = r20
            r20.<init>(r21, r22, r23)
            r1 = 8388627(0x800013, float:1.175497E-38)
            r0.mGravity = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.mTempViews = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.mHiddenViews = r1
            r1 = 2
            int[] r1 = new int[r1]
            r0.mTempMargins = r1
            androidx.core.view.MenuHostHelper r1 = new androidx.core.view.MenuHostHelper
            androidx.appcompat.widget.Toolbar$$ExternalSyntheticLambda1 r2 = new androidx.appcompat.widget.Toolbar$$ExternalSyntheticLambda1
            r2.<init>(r0)
            r1.<init>(r2)
            r0.mMenuHostHelper = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.mProvidedMenuItems = r1
            androidx.appcompat.widget.Toolbar$1 r1 = new androidx.appcompat.widget.Toolbar$1
            r1.<init>(r0)
            r0.mMenuViewItemClickListener = r1
            androidx.appcompat.widget.Toolbar$2 r1 = new androidx.appcompat.widget.Toolbar$2
            r1.<init>(r0)
            r0.mShowOverflowMenuRunnable = r1
            android.content.Context r1 = r0.getContext()
            int[] r2 = androidx.appcompat.R.styleable.Toolbar
            r7 = 0
            r3 = r22
            r5 = r23
            androidx.appcompat.widget.TintTypedArray r8 = androidx.appcompat.widget.TintTypedArray.obtainStyledAttributes(r1, r3, r2, r5, r7)
            int[] r2 = androidx.appcompat.R.styleable.Toolbar
            android.content.res.TypedArray r4 = r8.getWrappedTypeArray()
            r6 = 0
            r1 = r21
            androidx.core.view.ViewCompat.saveAttributeDataForStyleable(r0, r1, r2, r3, r4, r5, r6)
            int r1 = androidx.appcompat.R.styleable.Toolbar_titleTextAppearance
            int r1 = r8.getResourceId(r1, r7)
            r0.mTitleTextAppearance = r1
            int r1 = androidx.appcompat.R.styleable.Toolbar_subtitleTextAppearance
            int r1 = r8.getResourceId(r1, r7)
            r0.mSubtitleTextAppearance = r1
            int r1 = androidx.appcompat.R.styleable.Toolbar_android_gravity
            int r2 = r0.mGravity
            int r1 = r8.getInteger(r1, r2)
            r0.mGravity = r1
            int r1 = androidx.appcompat.R.styleable.Toolbar_buttonGravity
            r2 = 48
            int r1 = r8.getInteger(r1, r2)
            r0.mButtonGravity = r1
            int r1 = androidx.appcompat.R.styleable.Toolbar_titleMargin
            int r1 = r8.getDimensionPixelOffset(r1, r7)
            int r2 = androidx.appcompat.R.styleable.Toolbar_titleMargins
            boolean r2 = r8.hasValue(r2)
            if (r2 == 0) goto L91
            int r2 = androidx.appcompat.R.styleable.Toolbar_titleMargins
            int r1 = r8.getDimensionPixelOffset(r2, r1)
        L91:
            r0.mTitleMarginBottom = r1
            r0.mTitleMarginTop = r1
            r0.mTitleMarginEnd = r1
            r0.mTitleMarginStart = r1
            int r2 = androidx.appcompat.R.styleable.Toolbar_titleMarginStart
            r3 = -1
            int r2 = r8.getDimensionPixelOffset(r2, r3)
            if (r2 < 0) goto La4
            r0.mTitleMarginStart = r2
        La4:
            int r4 = androidx.appcompat.R.styleable.Toolbar_titleMarginEnd
            int r4 = r8.getDimensionPixelOffset(r4, r3)
            if (r4 < 0) goto Lae
            r0.mTitleMarginEnd = r4
        Lae:
            int r5 = androidx.appcompat.R.styleable.Toolbar_titleMarginTop
            int r5 = r8.getDimensionPixelOffset(r5, r3)
            if (r5 < 0) goto Lb8
            r0.mTitleMarginTop = r5
        Lb8:
            int r6 = androidx.appcompat.R.styleable.Toolbar_titleMarginBottom
            int r6 = r8.getDimensionPixelOffset(r6, r3)
            if (r6 < 0) goto Lc2
            r0.mTitleMarginBottom = r6
        Lc2:
            int r9 = androidx.appcompat.R.styleable.Toolbar_maxButtonHeight
            int r3 = r8.getDimensionPixelSize(r9, r3)
            r0.mMaxButtonHeight = r3
            int r3 = androidx.appcompat.R.styleable.Toolbar_contentInsetStart
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
            int r3 = r8.getDimensionPixelOffset(r3, r9)
            int r10 = androidx.appcompat.R.styleable.Toolbar_contentInsetEnd
            int r10 = r8.getDimensionPixelOffset(r10, r9)
            int r11 = androidx.appcompat.R.styleable.Toolbar_contentInsetLeft
            int r11 = r8.getDimensionPixelSize(r11, r7)
            int r12 = androidx.appcompat.R.styleable.Toolbar_contentInsetRight
            int r12 = r8.getDimensionPixelSize(r12, r7)
            r0.ensureContentInsets()
            androidx.appcompat.widget.RtlSpacingHelper r13 = r0.mContentInsets
            r13.setAbsolute(r11, r12)
            if (r3 != r9) goto Lf0
            if (r10 == r9) goto Lf5
        Lf0:
            androidx.appcompat.widget.RtlSpacingHelper r13 = r0.mContentInsets
            r13.setRelative(r3, r10)
        Lf5:
            int r13 = androidx.appcompat.R.styleable.Toolbar_contentInsetStartWithNavigation
            int r13 = r8.getDimensionPixelOffset(r13, r9)
            r0.mContentInsetStartWithNavigation = r13
            int r13 = androidx.appcompat.R.styleable.Toolbar_contentInsetEndWithActions
            int r9 = r8.getDimensionPixelOffset(r13, r9)
            r0.mContentInsetEndWithActions = r9
            int r9 = androidx.appcompat.R.styleable.Toolbar_collapseIcon
            android.graphics.drawable.Drawable r9 = r8.getDrawable(r9)
            r0.mCollapseIcon = r9
            int r9 = androidx.appcompat.R.styleable.Toolbar_collapseContentDescription
            java.lang.CharSequence r9 = r8.getText(r9)
            r0.mCollapseDescription = r9
            int r9 = androidx.appcompat.R.styleable.Toolbar_title
            java.lang.CharSequence r9 = r8.getText(r9)
            boolean r13 = android.text.TextUtils.isEmpty(r9)
            if (r13 != 0) goto L124
            r0.setTitle(r9)
        L124:
            int r13 = androidx.appcompat.R.styleable.Toolbar_subtitle
            java.lang.CharSequence r13 = r8.getText(r13)
            boolean r14 = android.text.TextUtils.isEmpty(r13)
            if (r14 != 0) goto L133
            r0.setSubtitle(r13)
        L133:
            android.content.Context r14 = r0.getContext()
            r0.mPopupContext = r14
            int r14 = androidx.appcompat.R.styleable.Toolbar_popupTheme
            int r14 = r8.getResourceId(r14, r7)
            r0.setPopupTheme(r14)
            int r14 = androidx.appcompat.R.styleable.Toolbar_navigationIcon
            android.graphics.drawable.Drawable r14 = r8.getDrawable(r14)
            if (r14 == 0) goto L14d
            r0.setNavigationIcon(r14)
        L14d:
            int r15 = androidx.appcompat.R.styleable.Toolbar_navigationContentDescription
            java.lang.CharSequence r15 = r8.getText(r15)
            boolean r16 = android.text.TextUtils.isEmpty(r15)
            if (r16 != 0) goto L15c
            r0.setNavigationContentDescription(r15)
        L15c:
            int r7 = androidx.appcompat.R.styleable.Toolbar_logo
            android.graphics.drawable.Drawable r7 = r8.getDrawable(r7)
            if (r7 == 0) goto L167
            r0.setLogo(r7)
        L167:
            r17 = r1
            int r1 = androidx.appcompat.R.styleable.Toolbar_logoDescription
            java.lang.CharSequence r1 = r8.getText(r1)
            boolean r18 = android.text.TextUtils.isEmpty(r1)
            if (r18 != 0) goto L178
            r0.setLogoDescription(r1)
        L178:
            r18 = r1
            int r1 = androidx.appcompat.R.styleable.Toolbar_titleTextColor
            boolean r1 = r8.hasValue(r1)
            if (r1 == 0) goto L18b
            int r1 = androidx.appcompat.R.styleable.Toolbar_titleTextColor
            android.content.res.ColorStateList r1 = r8.getColorStateList(r1)
            r0.setTitleTextColor(r1)
        L18b:
            int r1 = androidx.appcompat.R.styleable.Toolbar_subtitleTextColor
            boolean r1 = r8.hasValue(r1)
            if (r1 == 0) goto L19c
            int r1 = androidx.appcompat.R.styleable.Toolbar_subtitleTextColor
            android.content.res.ColorStateList r1 = r8.getColorStateList(r1)
            r0.setSubtitleTextColor(r1)
        L19c:
            int r1 = androidx.appcompat.R.styleable.Toolbar_menu
            boolean r1 = r8.hasValue(r1)
            if (r1 == 0) goto L1b1
            int r1 = androidx.appcompat.R.styleable.Toolbar_menu
            r19 = r2
            r2 = 0
            int r1 = r8.getResourceId(r1, r2)
            r0.inflateMenu(r1)
            goto L1b3
        L1b1:
            r19 = r2
        L1b3:
            r8.recycle()
            return
    }

    private void addCustomViewsWithGravity(java.util.List<android.view.View> r8, int r9) {
            r7 = this;
            int r0 = r7.getLayoutDirection()
            r1 = 1
            if (r0 != r1) goto L8
            goto L9
        L8:
            r1 = 0
        L9:
            int r0 = r7.getChildCount()
            int r2 = r7.getLayoutDirection()
            int r2 = androidx.core.view.GravityCompat.getAbsoluteGravity(r9, r2)
            r8.clear()
            if (r1 == 0) goto L42
            int r3 = r0 + (-1)
        L1d:
            if (r3 < 0) goto L41
            android.view.View r4 = r7.getChildAt(r3)
            android.view.ViewGroup$LayoutParams r5 = r4.getLayoutParams()
            androidx.appcompat.widget.Toolbar$LayoutParams r5 = (androidx.appcompat.widget.Toolbar.LayoutParams) r5
            int r6 = r5.mViewType
            if (r6 != 0) goto L3e
            boolean r6 = r7.shouldLayout(r4)
            if (r6 == 0) goto L3e
            int r6 = r5.gravity
            int r6 = r7.getChildHorizontalGravity(r6)
            if (r6 != r2) goto L3e
            r8.add(r4)
        L3e:
            int r3 = r3 + (-1)
            goto L1d
        L41:
            goto L67
        L42:
            r3 = 0
        L43:
            if (r3 >= r0) goto L67
            android.view.View r4 = r7.getChildAt(r3)
            android.view.ViewGroup$LayoutParams r5 = r4.getLayoutParams()
            androidx.appcompat.widget.Toolbar$LayoutParams r5 = (androidx.appcompat.widget.Toolbar.LayoutParams) r5
            int r6 = r5.mViewType
            if (r6 != 0) goto L64
            boolean r6 = r7.shouldLayout(r4)
            if (r6 == 0) goto L64
            int r6 = r5.gravity
            int r6 = r7.getChildHorizontalGravity(r6)
            if (r6 != r2) goto L64
            r8.add(r4)
        L64:
            int r3 = r3 + 1
            goto L43
        L67:
            return
    }

    private void addSystemView(android.view.View r4, boolean r5) {
            r3 = this;
            android.view.ViewGroup$LayoutParams r0 = r4.getLayoutParams()
            if (r0 != 0) goto Lb
            androidx.appcompat.widget.Toolbar$LayoutParams r1 = r3.generateDefaultLayoutParams()
            goto L19
        Lb:
            boolean r1 = r3.checkLayoutParams(r0)
            if (r1 != 0) goto L16
            androidx.appcompat.widget.Toolbar$LayoutParams r1 = r3.generateLayoutParams(r0)
            goto L19
        L16:
            r1 = r0
            androidx.appcompat.widget.Toolbar$LayoutParams r1 = (androidx.appcompat.widget.Toolbar.LayoutParams) r1
        L19:
            r2 = 1
            r1.mViewType = r2
            if (r5 == 0) goto L2b
            android.view.View r2 = r3.mExpandedActionView
            if (r2 == 0) goto L2b
            r4.setLayoutParams(r1)
            java.util.ArrayList<android.view.View> r2 = r3.mHiddenViews
            r2.add(r4)
            goto L2e
        L2b:
            r3.addView(r4, r1)
        L2e:
            return
    }

    private void ensureContentInsets() {
            r1 = this;
            androidx.appcompat.widget.RtlSpacingHelper r0 = r1.mContentInsets
            if (r0 != 0) goto Lb
            androidx.appcompat.widget.RtlSpacingHelper r0 = new androidx.appcompat.widget.RtlSpacingHelper
            r0.<init>()
            r1.mContentInsets = r0
        Lb:
            return
    }

    private void ensureLogoView() {
            r2 = this;
            android.widget.ImageView r0 = r2.mLogoView
            if (r0 != 0) goto Lf
            androidx.appcompat.widget.AppCompatImageView r0 = new androidx.appcompat.widget.AppCompatImageView
            android.content.Context r1 = r2.getContext()
            r0.<init>(r1)
            r2.mLogoView = r0
        Lf:
            return
    }

    private void ensureMenu() {
            r3 = this;
            r3.ensureMenuView()
            androidx.appcompat.widget.ActionMenuView r0 = r3.mMenuView
            androidx.appcompat.view.menu.MenuBuilder r0 = r0.peekMenu()
            if (r0 != 0) goto L2e
            androidx.appcompat.widget.ActionMenuView r0 = r3.mMenuView
            android.view.Menu r0 = r0.getMenu()
            androidx.appcompat.view.menu.MenuBuilder r0 = (androidx.appcompat.view.menu.MenuBuilder) r0
            androidx.appcompat.widget.Toolbar$ExpandedActionViewMenuPresenter r1 = r3.mExpandedMenuPresenter
            if (r1 != 0) goto L1e
            androidx.appcompat.widget.Toolbar$ExpandedActionViewMenuPresenter r1 = new androidx.appcompat.widget.Toolbar$ExpandedActionViewMenuPresenter
            r1.<init>(r3)
            r3.mExpandedMenuPresenter = r1
        L1e:
            androidx.appcompat.widget.ActionMenuView r1 = r3.mMenuView
            r2 = 1
            r1.setExpandedActionViewsExclusive(r2)
            androidx.appcompat.widget.Toolbar$ExpandedActionViewMenuPresenter r1 = r3.mExpandedMenuPresenter
            android.content.Context r2 = r3.mPopupContext
            r0.addMenuPresenter(r1, r2)
            r3.updateBackInvokedCallbackState()
        L2e:
            return
    }

    private void ensureMenuView() {
            r3 = this;
            androidx.appcompat.widget.ActionMenuView r0 = r3.mMenuView
            if (r0 != 0) goto L42
            androidx.appcompat.widget.ActionMenuView r0 = new androidx.appcompat.widget.ActionMenuView
            android.content.Context r1 = r3.getContext()
            r0.<init>(r1)
            r3.mMenuView = r0
            androidx.appcompat.widget.ActionMenuView r0 = r3.mMenuView
            int r1 = r3.mPopupTheme
            r0.setPopupTheme(r1)
            androidx.appcompat.widget.ActionMenuView r0 = r3.mMenuView
            androidx.appcompat.widget.ActionMenuView$OnMenuItemClickListener r1 = r3.mMenuViewItemClickListener
            r0.setOnMenuItemClickListener(r1)
            androidx.appcompat.widget.ActionMenuView r0 = r3.mMenuView
            androidx.appcompat.view.menu.MenuPresenter$Callback r1 = r3.mActionMenuPresenterCallback
            androidx.appcompat.widget.Toolbar$3 r2 = new androidx.appcompat.widget.Toolbar$3
            r2.<init>(r3)
            r0.setMenuCallbacks(r1, r2)
            androidx.appcompat.widget.Toolbar$LayoutParams r0 = r3.generateDefaultLayoutParams()
            int r1 = r3.mButtonGravity
            r1 = r1 & 112(0x70, float:1.57E-43)
            r2 = 8388613(0x800005, float:1.175495E-38)
            r1 = r1 | r2
            r0.gravity = r1
            androidx.appcompat.widget.ActionMenuView r1 = r3.mMenuView
            r1.setLayoutParams(r0)
            androidx.appcompat.widget.ActionMenuView r1 = r3.mMenuView
            r2 = 0
            r3.addSystemView(r1, r2)
        L42:
            return
    }

    private void ensureNavButtonView() {
            r4 = this;
            android.widget.ImageButton r0 = r4.mNavButtonView
            if (r0 != 0) goto L25
            androidx.appcompat.widget.AppCompatImageButton r0 = new androidx.appcompat.widget.AppCompatImageButton
            android.content.Context r1 = r4.getContext()
            r2 = 0
            int r3 = androidx.appcompat.R.attr.toolbarNavigationButtonStyle
            r0.<init>(r1, r2, r3)
            r4.mNavButtonView = r0
            androidx.appcompat.widget.Toolbar$LayoutParams r0 = r4.generateDefaultLayoutParams()
            int r1 = r4.mButtonGravity
            r1 = r1 & 112(0x70, float:1.57E-43)
            r2 = 8388611(0x800003, float:1.1754948E-38)
            r1 = r1 | r2
            r0.gravity = r1
            android.widget.ImageButton r1 = r4.mNavButtonView
            r1.setLayoutParams(r0)
        L25:
            return
    }

    private int getChildHorizontalGravity(int r5) {
            r4 = this;
            int r0 = r4.getLayoutDirection()
            int r1 = androidx.core.view.GravityCompat.getAbsoluteGravity(r5, r0)
            r2 = r1 & 7
            switch(r2) {
                case 1: goto L12;
                case 2: goto Ld;
                case 3: goto L12;
                case 4: goto Ld;
                case 5: goto L12;
                default: goto Ld;
            }
        Ld:
            r3 = 1
            if (r0 != r3) goto L13
            r3 = 5
            goto L14
        L12:
            return r2
        L13:
            r3 = 3
        L14:
            return r3
    }

    private int getChildTop(android.view.View r12, int r13) {
            r11 = this;
            android.view.ViewGroup$LayoutParams r0 = r12.getLayoutParams()
            androidx.appcompat.widget.Toolbar$LayoutParams r0 = (androidx.appcompat.widget.Toolbar.LayoutParams) r0
            int r1 = r12.getMeasuredHeight()
            r2 = 0
            if (r13 <= 0) goto L12
            int r3 = r1 - r13
            int r3 = r3 / 2
            goto L13
        L12:
            r3 = r2
        L13:
            int r4 = r0.gravity
            int r4 = r11.getChildVerticalGravity(r4)
            switch(r4) {
                case 48: goto L45;
                case 80: goto L36;
                default: goto L1c;
            }
        L1c:
            int r4 = r11.getPaddingTop()
            int r5 = r11.getPaddingBottom()
            int r6 = r11.getHeight()
            int r7 = r6 - r4
            int r7 = r7 - r5
            int r8 = r7 - r1
            int r8 = r8 / 2
            int r9 = r0.topMargin
            if (r8 >= r9) goto L4b
            int r8 = r0.topMargin
            goto L5d
        L36:
            int r2 = r11.getHeight()
            int r4 = r11.getPaddingBottom()
            int r2 = r2 - r4
            int r2 = r2 - r1
            int r4 = r0.bottomMargin
            int r2 = r2 - r4
            int r2 = r2 - r3
            return r2
        L45:
            int r2 = r11.getPaddingTop()
            int r2 = r2 - r3
            return r2
        L4b:
            int r9 = r6 - r5
            int r9 = r9 - r1
            int r9 = r9 - r8
            int r9 = r9 - r4
            int r10 = r0.bottomMargin
            if (r9 >= r10) goto L5d
            int r10 = r0.bottomMargin
            int r10 = r10 - r9
            int r10 = r8 - r10
            int r8 = java.lang.Math.max(r2, r10)
        L5d:
            int r2 = r4 + r8
            return r2
    }

    private int getChildVerticalGravity(int r3) {
            r2 = this;
            r0 = r3 & 112(0x70, float:1.57E-43)
            switch(r0) {
                case 16: goto La;
                case 48: goto La;
                case 80: goto La;
                default: goto L5;
            }
        L5:
            int r1 = r2.mGravity
            r1 = r1 & 112(0x70, float:1.57E-43)
            return r1
        La:
            return r0
    }

    private java.util.ArrayList<android.view.MenuItem> getCurrentMenuItems() {
            r4 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            android.view.Menu r1 = r4.getMenu()
            r2 = 0
        La:
            int r3 = r1.size()
            if (r2 >= r3) goto L1a
            android.view.MenuItem r3 = r1.getItem(r2)
            r0.add(r3)
            int r2 = r2 + 1
            goto La
        L1a:
            return r0
    }

    private int getHorizontalMargins(android.view.View r4) {
            r3 = this;
            android.view.ViewGroup$LayoutParams r0 = r4.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            int r1 = r0.getMarginStart()
            int r2 = r0.getMarginEnd()
            int r1 = r1 + r2
            return r1
    }

    private android.view.MenuInflater getMenuInflater() {
            r2 = this;
            androidx.appcompat.view.SupportMenuInflater r0 = new androidx.appcompat.view.SupportMenuInflater
            android.content.Context r1 = r2.getContext()
            r0.<init>(r1)
            return r0
    }

    private int getVerticalMargins(android.view.View r4) {
            r3 = this;
            android.view.ViewGroup$LayoutParams r0 = r4.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            int r1 = r0.topMargin
            int r2 = r0.bottomMargin
            int r1 = r1 + r2
            return r1
    }

    private int getViewListMeasuredWidth(java.util.List<android.view.View> r14, int[] r15) {
            r13 = this;
            r0 = 0
            r1 = r15[r0]
            r2 = 1
            r2 = r15[r2]
            r3 = 0
            int r4 = r14.size()
            r5 = 0
        Lc:
            if (r5 >= r4) goto L3c
            java.lang.Object r6 = r14.get(r5)
            android.view.View r6 = (android.view.View) r6
            android.view.ViewGroup$LayoutParams r7 = r6.getLayoutParams()
            androidx.appcompat.widget.Toolbar$LayoutParams r7 = (androidx.appcompat.widget.Toolbar.LayoutParams) r7
            int r8 = r7.leftMargin
            int r8 = r8 - r1
            int r9 = r7.rightMargin
            int r9 = r9 - r2
            int r10 = java.lang.Math.max(r0, r8)
            int r11 = java.lang.Math.max(r0, r9)
            int r12 = -r8
            int r1 = java.lang.Math.max(r0, r12)
            int r12 = -r9
            int r2 = java.lang.Math.max(r0, r12)
            int r12 = r6.getMeasuredWidth()
            int r12 = r12 + r10
            int r12 = r12 + r11
            int r3 = r3 + r12
            int r5 = r5 + 1
            goto Lc
        L3c:
            return r3
    }

    private boolean isChildOrHidden(android.view.View r2) {
            r1 = this;
            android.view.ViewParent r0 = r2.getParent()
            if (r0 == r1) goto L11
            java.util.ArrayList<android.view.View> r0 = r1.mHiddenViews
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto Lf
            goto L11
        Lf:
            r0 = 0
            goto L12
        L11:
            r0 = 1
        L12:
            return r0
    }

    private int layoutChildLeft(android.view.View r7, int r8, int[] r9, int r10) {
            r6 = this;
            android.view.ViewGroup$LayoutParams r0 = r7.getLayoutParams()
            androidx.appcompat.widget.Toolbar$LayoutParams r0 = (androidx.appcompat.widget.Toolbar.LayoutParams) r0
            int r1 = r0.leftMargin
            r2 = 0
            r3 = r9[r2]
            int r1 = r1 - r3
            int r3 = java.lang.Math.max(r2, r1)
            int r8 = r8 + r3
            int r3 = -r1
            int r3 = java.lang.Math.max(r2, r3)
            r9[r2] = r3
            int r2 = r6.getChildTop(r7, r10)
            int r3 = r7.getMeasuredWidth()
            int r4 = r8 + r3
            int r5 = r7.getMeasuredHeight()
            int r5 = r5 + r2
            r7.layout(r8, r2, r4, r5)
            int r4 = r0.rightMargin
            int r4 = r4 + r3
            int r8 = r8 + r4
            return r8
    }

    private int layoutChildRight(android.view.View r7, int r8, int[] r9, int r10) {
            r6 = this;
            android.view.ViewGroup$LayoutParams r0 = r7.getLayoutParams()
            androidx.appcompat.widget.Toolbar$LayoutParams r0 = (androidx.appcompat.widget.Toolbar.LayoutParams) r0
            int r1 = r0.rightMargin
            r2 = 1
            r3 = r9[r2]
            int r1 = r1 - r3
            r3 = 0
            int r4 = java.lang.Math.max(r3, r1)
            int r8 = r8 - r4
            int r4 = -r1
            int r3 = java.lang.Math.max(r3, r4)
            r9[r2] = r3
            int r2 = r6.getChildTop(r7, r10)
            int r3 = r7.getMeasuredWidth()
            int r4 = r8 - r3
            int r5 = r7.getMeasuredHeight()
            int r5 = r5 + r2
            r7.layout(r4, r2, r8, r5)
            int r4 = r0.leftMargin
            int r4 = r4 + r3
            int r8 = r8 - r4
            return r8
    }

    private int measureChildCollapseMargins(android.view.View r10, int r11, int r12, int r13, int r14, int[] r15) {
            r9 = this;
            android.view.ViewGroup$LayoutParams r0 = r10.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            int r1 = r0.leftMargin
            r2 = 0
            r3 = r15[r2]
            int r1 = r1 - r3
            int r3 = r0.rightMargin
            r4 = 1
            r5 = r15[r4]
            int r3 = r3 - r5
            int r5 = java.lang.Math.max(r2, r1)
            int r6 = java.lang.Math.max(r2, r3)
            int r7 = r5 + r6
            int r8 = -r1
            int r8 = java.lang.Math.max(r2, r8)
            r15[r2] = r8
            int r8 = -r3
            int r2 = java.lang.Math.max(r2, r8)
            r15[r4] = r2
            int r2 = r9.getPaddingLeft()
            int r4 = r9.getPaddingRight()
            int r2 = r2 + r4
            int r2 = r2 + r7
            int r2 = r2 + r12
            int r4 = r0.width
            int r2 = getChildMeasureSpec(r11, r2, r4)
            int r4 = r9.getPaddingTop()
            int r8 = r9.getPaddingBottom()
            int r4 = r4 + r8
            int r8 = r0.topMargin
            int r4 = r4 + r8
            int r8 = r0.bottomMargin
            int r4 = r4 + r8
            int r4 = r4 + r14
            int r8 = r0.height
            int r4 = getChildMeasureSpec(r13, r4, r8)
            r10.measure(r2, r4)
            int r8 = r10.getMeasuredWidth()
            int r8 = r8 + r7
            return r8
    }

    private void measureChildConstrained(android.view.View r7, int r8, int r9, int r10, int r11, int r12) {
            r6 = this;
            android.view.ViewGroup$LayoutParams r0 = r7.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            int r1 = r6.getPaddingLeft()
            int r2 = r6.getPaddingRight()
            int r1 = r1 + r2
            int r2 = r0.leftMargin
            int r1 = r1 + r2
            int r2 = r0.rightMargin
            int r1 = r1 + r2
            int r1 = r1 + r9
            int r2 = r0.width
            int r1 = getChildMeasureSpec(r8, r1, r2)
            int r2 = r6.getPaddingTop()
            int r3 = r6.getPaddingBottom()
            int r2 = r2 + r3
            int r3 = r0.topMargin
            int r2 = r2 + r3
            int r3 = r0.bottomMargin
            int r2 = r2 + r3
            int r2 = r2 + r11
            int r3 = r0.height
            int r2 = getChildMeasureSpec(r10, r2, r3)
            int r3 = android.view.View.MeasureSpec.getMode(r2)
            r4 = 1073741824(0x40000000, float:2.0)
            if (r3 == r4) goto L4f
            if (r12 < 0) goto L4f
            if (r3 == 0) goto L49
            int r5 = android.view.View.MeasureSpec.getSize(r2)
            int r5 = java.lang.Math.min(r5, r12)
            goto L4a
        L49:
            r5 = r12
        L4a:
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r4)
        L4f:
            r7.measure(r1, r2)
            return
    }

    private void onCreateMenu() {
            r4 = this;
            android.view.Menu r0 = r4.getMenu()
            java.util.ArrayList r1 = r4.getCurrentMenuItems()
            androidx.core.view.MenuHostHelper r2 = r4.mMenuHostHelper
            android.view.MenuInflater r3 = r4.getMenuInflater()
            r2.onCreateMenu(r0, r3)
            java.util.ArrayList r2 = r4.getCurrentMenuItems()
            r2.removeAll(r1)
            r4.mProvidedMenuItems = r2
            return
    }

    private void postShowOverflowMenu() {
            r1 = this;
            java.lang.Runnable r0 = r1.mShowOverflowMenuRunnable
            r1.removeCallbacks(r0)
            java.lang.Runnable r0 = r1.mShowOverflowMenuRunnable
            r1.post(r0)
            return
    }

    private boolean shouldCollapse() {
            r5 = this;
            boolean r0 = r5.mCollapsible
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            int r0 = r5.getChildCount()
            r2 = 0
        Lb:
            if (r2 >= r0) goto L27
            android.view.View r3 = r5.getChildAt(r2)
            boolean r4 = r5.shouldLayout(r3)
            if (r4 == 0) goto L24
            int r4 = r3.getMeasuredWidth()
            if (r4 <= 0) goto L24
            int r4 = r3.getMeasuredHeight()
            if (r4 <= 0) goto L24
            return r1
        L24:
            int r2 = r2 + 1
            goto Lb
        L27:
            r1 = 1
            return r1
    }

    private boolean shouldLayout(android.view.View r3) {
            r2 = this;
            if (r3 == 0) goto L12
            android.view.ViewParent r0 = r3.getParent()
            if (r0 != r2) goto L12
            int r0 = r3.getVisibility()
            r1 = 8
            if (r0 == r1) goto L12
            r0 = 1
            goto L13
        L12:
            r0 = 0
        L13:
            return r0
    }

    void addChildrenForExpandedActionView() {
            r3 = this;
            java.util.ArrayList<android.view.View> r0 = r3.mHiddenViews
            int r0 = r0.size()
            int r1 = r0 + (-1)
        L8:
            if (r1 < 0) goto L18
            java.util.ArrayList<android.view.View> r2 = r3.mHiddenViews
            java.lang.Object r2 = r2.get(r1)
            android.view.View r2 = (android.view.View) r2
            r3.addView(r2)
            int r1 = r1 + (-1)
            goto L8
        L18:
            java.util.ArrayList<android.view.View> r1 = r3.mHiddenViews
            r1.clear()
            return
    }

    @Override // androidx.core.view.MenuHost
    public void addMenuProvider(androidx.core.view.MenuProvider r2) {
            r1 = this;
            androidx.core.view.MenuHostHelper r0 = r1.mMenuHostHelper
            r0.addMenuProvider(r2)
            return
    }

    @Override // androidx.core.view.MenuHost
    public void addMenuProvider(androidx.core.view.MenuProvider r2, androidx.lifecycle.LifecycleOwner r3) {
            r1 = this;
            androidx.core.view.MenuHostHelper r0 = r1.mMenuHostHelper
            r0.addMenuProvider(r2, r3)
            return
    }

    @Override // androidx.core.view.MenuHost
    public void addMenuProvider(androidx.core.view.MenuProvider r2, androidx.lifecycle.LifecycleOwner r3, androidx.lifecycle.Lifecycle.State r4) {
            r1 = this;
            androidx.core.view.MenuHostHelper r0 = r1.mMenuHostHelper
            r0.addMenuProvider(r2, r3, r4)
            return
    }

    public boolean canShowOverflowMenu() {
            r1 = this;
            int r0 = r1.getVisibility()
            if (r0 != 0) goto L14
            androidx.appcompat.widget.ActionMenuView r0 = r1.mMenuView
            if (r0 == 0) goto L14
            androidx.appcompat.widget.ActionMenuView r0 = r1.mMenuView
            boolean r0 = r0.isOverflowReserved()
            if (r0 == 0) goto L14
            r0 = 1
            goto L15
        L14:
            r0 = 0
        L15:
            return r0
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams r2) {
            r1 = this;
            boolean r0 = super.checkLayoutParams(r2)
            if (r0 == 0) goto Lc
            boolean r0 = r2 instanceof androidx.appcompat.widget.Toolbar.LayoutParams
            if (r0 == 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    public void collapseActionView() {
            r1 = this;
            androidx.appcompat.widget.Toolbar$ExpandedActionViewMenuPresenter r0 = r1.mExpandedMenuPresenter
            if (r0 != 0) goto L6
            r0 = 0
            goto La
        L6:
            androidx.appcompat.widget.Toolbar$ExpandedActionViewMenuPresenter r0 = r1.mExpandedMenuPresenter
            androidx.appcompat.view.menu.MenuItemImpl r0 = r0.mCurrentExpandedItem
        La:
            if (r0 == 0) goto L10
            r0.collapseActionView()
        L10:
            return
    }

    public void dismissPopupMenus() {
            r1 = this;
            androidx.appcompat.widget.ActionMenuView r0 = r1.mMenuView
            if (r0 == 0) goto L9
            androidx.appcompat.widget.ActionMenuView r0 = r1.mMenuView
            r0.dismissPopupMenus()
        L9:
            return
    }

    void ensureCollapseButtonView() {
            r4 = this;
            android.widget.ImageButton r0 = r4.mCollapseButtonView
            if (r0 != 0) goto L40
            androidx.appcompat.widget.AppCompatImageButton r0 = new androidx.appcompat.widget.AppCompatImageButton
            android.content.Context r1 = r4.getContext()
            r2 = 0
            int r3 = androidx.appcompat.R.attr.toolbarNavigationButtonStyle
            r0.<init>(r1, r2, r3)
            r4.mCollapseButtonView = r0
            android.widget.ImageButton r0 = r4.mCollapseButtonView
            android.graphics.drawable.Drawable r1 = r4.mCollapseIcon
            r0.setImageDrawable(r1)
            android.widget.ImageButton r0 = r4.mCollapseButtonView
            java.lang.CharSequence r1 = r4.mCollapseDescription
            r0.setContentDescription(r1)
            androidx.appcompat.widget.Toolbar$LayoutParams r0 = r4.generateDefaultLayoutParams()
            int r1 = r4.mButtonGravity
            r1 = r1 & 112(0x70, float:1.57E-43)
            r2 = 8388611(0x800003, float:1.1754948E-38)
            r1 = r1 | r2
            r0.gravity = r1
            r1 = 2
            r0.mViewType = r1
            android.widget.ImageButton r1 = r4.mCollapseButtonView
            r1.setLayoutParams(r0)
            android.widget.ImageButton r1 = r4.mCollapseButtonView
            androidx.appcompat.widget.Toolbar$4 r2 = new androidx.appcompat.widget.Toolbar$4
            r2.<init>(r4)
            r1.setOnClickListener(r2)
        L40:
            return
    }

    @Override // android.view.ViewGroup
    protected /* bridge */ /* synthetic */ android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
            r1 = this;
            androidx.appcompat.widget.Toolbar$LayoutParams r0 = r1.generateDefaultLayoutParams()
            return r0
    }

    @Override // android.view.ViewGroup
    protected androidx.appcompat.widget.Toolbar.LayoutParams generateDefaultLayoutParams() {
            r2 = this;
            androidx.appcompat.widget.Toolbar$LayoutParams r0 = new androidx.appcompat.widget.Toolbar$LayoutParams
            r1 = -2
            r0.<init>(r1, r1)
            return r0
    }

    @Override // android.view.ViewGroup
    public /* bridge */ /* synthetic */ android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet r1) {
            r0 = this;
            androidx.appcompat.widget.Toolbar$LayoutParams r1 = r0.generateLayoutParams(r1)
            return r1
    }

    @Override // android.view.ViewGroup
    protected /* bridge */ /* synthetic */ android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams r1) {
            r0 = this;
            androidx.appcompat.widget.Toolbar$LayoutParams r1 = r0.generateLayoutParams(r1)
            return r1
    }

    @Override // android.view.ViewGroup
    public androidx.appcompat.widget.Toolbar.LayoutParams generateLayoutParams(android.util.AttributeSet r3) {
            r2 = this;
            androidx.appcompat.widget.Toolbar$LayoutParams r0 = new androidx.appcompat.widget.Toolbar$LayoutParams
            android.content.Context r1 = r2.getContext()
            r0.<init>(r1, r3)
            return r0
    }

    @Override // android.view.ViewGroup
    protected androidx.appcompat.widget.Toolbar.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams r3) {
            r2 = this;
            boolean r0 = r3 instanceof androidx.appcompat.widget.Toolbar.LayoutParams
            if (r0 == 0) goto Ld
            androidx.appcompat.widget.Toolbar$LayoutParams r0 = new androidx.appcompat.widget.Toolbar$LayoutParams
            r1 = r3
            androidx.appcompat.widget.Toolbar$LayoutParams r1 = (androidx.appcompat.widget.Toolbar.LayoutParams) r1
            r0.<init>(r1)
            return r0
        Ld:
            boolean r0 = r3 instanceof androidx.appcompat.app.ActionBar.LayoutParams
            if (r0 == 0) goto L1a
            androidx.appcompat.widget.Toolbar$LayoutParams r0 = new androidx.appcompat.widget.Toolbar$LayoutParams
            r1 = r3
            androidx.appcompat.app.ActionBar$LayoutParams r1 = (androidx.appcompat.app.ActionBar.LayoutParams) r1
            r0.<init>(r1)
            return r0
        L1a:
            boolean r0 = r3 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L27
            androidx.appcompat.widget.Toolbar$LayoutParams r0 = new androidx.appcompat.widget.Toolbar$LayoutParams
            r1 = r3
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            r0.<init>(r1)
            return r0
        L27:
            androidx.appcompat.widget.Toolbar$LayoutParams r0 = new androidx.appcompat.widget.Toolbar$LayoutParams
            r0.<init>(r3)
            return r0
    }

    public java.lang.CharSequence getCollapseContentDescription() {
            r1 = this;
            android.widget.ImageButton r0 = r1.mCollapseButtonView
            if (r0 == 0) goto Lb
            android.widget.ImageButton r0 = r1.mCollapseButtonView
            java.lang.CharSequence r0 = r0.getContentDescription()
            goto Lc
        Lb:
            r0 = 0
        Lc:
            return r0
    }

    public android.graphics.drawable.Drawable getCollapseIcon() {
            r1 = this;
            android.widget.ImageButton r0 = r1.mCollapseButtonView
            if (r0 == 0) goto Lb
            android.widget.ImageButton r0 = r1.mCollapseButtonView
            android.graphics.drawable.Drawable r0 = r0.getDrawable()
            goto Lc
        Lb:
            r0 = 0
        Lc:
            return r0
    }

    public int getContentInsetEnd() {
            r1 = this;
            androidx.appcompat.widget.RtlSpacingHelper r0 = r1.mContentInsets
            if (r0 == 0) goto Lb
            androidx.appcompat.widget.RtlSpacingHelper r0 = r1.mContentInsets
            int r0 = r0.getEnd()
            goto Lc
        Lb:
            r0 = 0
        Lc:
            return r0
    }

    public int getContentInsetEndWithActions() {
            r2 = this;
            int r0 = r2.mContentInsetEndWithActions
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r1) goto L9
            int r0 = r2.mContentInsetEndWithActions
            goto Ld
        L9:
            int r0 = r2.getContentInsetEnd()
        Ld:
            return r0
    }

    public int getContentInsetLeft() {
            r1 = this;
            androidx.appcompat.widget.RtlSpacingHelper r0 = r1.mContentInsets
            if (r0 == 0) goto Lb
            androidx.appcompat.widget.RtlSpacingHelper r0 = r1.mContentInsets
            int r0 = r0.getLeft()
            goto Lc
        Lb:
            r0 = 0
        Lc:
            return r0
    }

    public int getContentInsetRight() {
            r1 = this;
            androidx.appcompat.widget.RtlSpacingHelper r0 = r1.mContentInsets
            if (r0 == 0) goto Lb
            androidx.appcompat.widget.RtlSpacingHelper r0 = r1.mContentInsets
            int r0 = r0.getRight()
            goto Lc
        Lb:
            r0 = 0
        Lc:
            return r0
    }

    public int getContentInsetStart() {
            r1 = this;
            androidx.appcompat.widget.RtlSpacingHelper r0 = r1.mContentInsets
            if (r0 == 0) goto Lb
            androidx.appcompat.widget.RtlSpacingHelper r0 = r1.mContentInsets
            int r0 = r0.getStart()
            goto Lc
        Lb:
            r0 = 0
        Lc:
            return r0
    }

    public int getContentInsetStartWithNavigation() {
            r2 = this;
            int r0 = r2.mContentInsetStartWithNavigation
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r1) goto L9
            int r0 = r2.mContentInsetStartWithNavigation
            goto Ld
        L9:
            int r0 = r2.getContentInsetStart()
        Ld:
            return r0
    }

    public int getCurrentContentInsetEnd() {
            r4 = this;
            r0 = 0
            androidx.appcompat.widget.ActionMenuView r1 = r4.mMenuView
            r2 = 0
            if (r1 == 0) goto L18
            androidx.appcompat.widget.ActionMenuView r1 = r4.mMenuView
            androidx.appcompat.view.menu.MenuBuilder r1 = r1.peekMenu()
            if (r1 == 0) goto L16
            boolean r3 = r1.hasVisibleItems()
            if (r3 == 0) goto L16
            r3 = 1
            goto L17
        L16:
            r3 = r2
        L17:
            r0 = r3
        L18:
            if (r0 == 0) goto L29
            int r1 = r4.getContentInsetEnd()
            int r3 = r4.mContentInsetEndWithActions
            int r2 = java.lang.Math.max(r3, r2)
            int r1 = java.lang.Math.max(r1, r2)
            goto L2d
        L29:
            int r1 = r4.getContentInsetEnd()
        L2d:
            return r1
    }

    public int getCurrentContentInsetLeft() {
            r2 = this;
            int r0 = r2.getLayoutDirection()
            r1 = 1
            if (r0 != r1) goto Lc
            int r0 = r2.getCurrentContentInsetEnd()
            goto L10
        Lc:
            int r0 = r2.getCurrentContentInsetStart()
        L10:
            return r0
    }

    public int getCurrentContentInsetRight() {
            r2 = this;
            int r0 = r2.getLayoutDirection()
            r1 = 1
            if (r0 != r1) goto Lc
            int r0 = r2.getCurrentContentInsetStart()
            goto L10
        Lc:
            int r0 = r2.getCurrentContentInsetEnd()
        L10:
            return r0
    }

    public int getCurrentContentInsetStart() {
            r3 = this;
            android.graphics.drawable.Drawable r0 = r3.getNavigationIcon()
            if (r0 == 0) goto L16
            int r0 = r3.getContentInsetStart()
            int r1 = r3.mContentInsetStartWithNavigation
            r2 = 0
            int r1 = java.lang.Math.max(r1, r2)
            int r0 = java.lang.Math.max(r0, r1)
            goto L1a
        L16:
            int r0 = r3.getContentInsetStart()
        L1a:
            return r0
    }

    public android.graphics.drawable.Drawable getLogo() {
            r1 = this;
            android.widget.ImageView r0 = r1.mLogoView
            if (r0 == 0) goto Lb
            android.widget.ImageView r0 = r1.mLogoView
            android.graphics.drawable.Drawable r0 = r0.getDrawable()
            goto Lc
        Lb:
            r0 = 0
        Lc:
            return r0
    }

    public java.lang.CharSequence getLogoDescription() {
            r1 = this;
            android.widget.ImageView r0 = r1.mLogoView
            if (r0 == 0) goto Lb
            android.widget.ImageView r0 = r1.mLogoView
            java.lang.CharSequence r0 = r0.getContentDescription()
            goto Lc
        Lb:
            r0 = 0
        Lc:
            return r0
    }

    public android.view.Menu getMenu() {
            r1 = this;
            r1.ensureMenu()
            androidx.appcompat.widget.ActionMenuView r0 = r1.mMenuView
            android.view.Menu r0 = r0.getMenu()
            return r0
    }

    android.view.View getNavButtonView() {
            r1 = this;
            android.widget.ImageButton r0 = r1.mNavButtonView
            return r0
    }

    public java.lang.CharSequence getNavigationContentDescription() {
            r1 = this;
            android.widget.ImageButton r0 = r1.mNavButtonView
            if (r0 == 0) goto Lb
            android.widget.ImageButton r0 = r1.mNavButtonView
            java.lang.CharSequence r0 = r0.getContentDescription()
            goto Lc
        Lb:
            r0 = 0
        Lc:
            return r0
    }

    public android.graphics.drawable.Drawable getNavigationIcon() {
            r1 = this;
            android.widget.ImageButton r0 = r1.mNavButtonView
            if (r0 == 0) goto Lb
            android.widget.ImageButton r0 = r1.mNavButtonView
            android.graphics.drawable.Drawable r0 = r0.getDrawable()
            goto Lc
        Lb:
            r0 = 0
        Lc:
            return r0
    }

    androidx.appcompat.widget.ActionMenuPresenter getOuterActionMenuPresenter() {
            r1 = this;
            androidx.appcompat.widget.ActionMenuPresenter r0 = r1.mOuterActionMenuPresenter
            return r0
    }

    public android.graphics.drawable.Drawable getOverflowIcon() {
            r1 = this;
            r1.ensureMenu()
            androidx.appcompat.widget.ActionMenuView r0 = r1.mMenuView
            android.graphics.drawable.Drawable r0 = r0.getOverflowIcon()
            return r0
    }

    android.content.Context getPopupContext() {
            r1 = this;
            android.content.Context r0 = r1.mPopupContext
            return r0
    }

    public int getPopupTheme() {
            r1 = this;
            int r0 = r1.mPopupTheme
            return r0
    }

    public java.lang.CharSequence getSubtitle() {
            r1 = this;
            java.lang.CharSequence r0 = r1.mSubtitleText
            return r0
    }

    final android.widget.TextView getSubtitleTextView() {
            r1 = this;
            android.widget.TextView r0 = r1.mSubtitleTextView
            return r0
    }

    public java.lang.CharSequence getTitle() {
            r1 = this;
            java.lang.CharSequence r0 = r1.mTitleText
            return r0
    }

    public int getTitleMarginBottom() {
            r1 = this;
            int r0 = r1.mTitleMarginBottom
            return r0
    }

    public int getTitleMarginEnd() {
            r1 = this;
            int r0 = r1.mTitleMarginEnd
            return r0
    }

    public int getTitleMarginStart() {
            r1 = this;
            int r0 = r1.mTitleMarginStart
            return r0
    }

    public int getTitleMarginTop() {
            r1 = this;
            int r0 = r1.mTitleMarginTop
            return r0
    }

    final android.widget.TextView getTitleTextView() {
            r1 = this;
            android.widget.TextView r0 = r1.mTitleTextView
            return r0
    }

    public androidx.appcompat.widget.DecorToolbar getWrapper() {
            r2 = this;
            androidx.appcompat.widget.ToolbarWidgetWrapper r0 = r2.mWrapper
            if (r0 != 0) goto Lc
            androidx.appcompat.widget.ToolbarWidgetWrapper r0 = new androidx.appcompat.widget.ToolbarWidgetWrapper
            r1 = 1
            r0.<init>(r2, r1)
            r2.mWrapper = r0
        Lc:
            androidx.appcompat.widget.ToolbarWidgetWrapper r0 = r2.mWrapper
            return r0
    }

    public boolean hasExpandedActionView() {
            r1 = this;
            androidx.appcompat.widget.Toolbar$ExpandedActionViewMenuPresenter r0 = r1.mExpandedMenuPresenter
            if (r0 == 0) goto Lc
            androidx.appcompat.widget.Toolbar$ExpandedActionViewMenuPresenter r0 = r1.mExpandedMenuPresenter
            androidx.appcompat.view.menu.MenuItemImpl r0 = r0.mCurrentExpandedItem
            if (r0 == 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    public boolean hideOverflowMenu() {
            r1 = this;
            androidx.appcompat.widget.ActionMenuView r0 = r1.mMenuView
            if (r0 == 0) goto Le
            androidx.appcompat.widget.ActionMenuView r0 = r1.mMenuView
            boolean r0 = r0.hideOverflowMenu()
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    public void inflateMenu(int r3) {
            r2 = this;
            android.view.MenuInflater r0 = r2.getMenuInflater()
            android.view.Menu r1 = r2.getMenu()
            r0.inflate(r3, r1)
            return
    }

    @Override // androidx.core.view.MenuHost
    public void invalidateMenu() {
            r4 = this;
            java.util.ArrayList<android.view.MenuItem> r0 = r4.mProvidedMenuItems
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1e
            java.lang.Object r1 = r0.next()
            android.view.MenuItem r1 = (android.view.MenuItem) r1
            android.view.Menu r2 = r4.getMenu()
            int r3 = r1.getItemId()
            r2.removeItem(r3)
            goto L6
        L1e:
            r4.onCreateMenu()
            return
    }

    public boolean isBackInvokedCallbackEnabled() {
            r1 = this;
            boolean r0 = r1.mBackInvokedCallbackEnabled
            return r0
    }

    public boolean isOverflowMenuShowPending() {
            r1 = this;
            androidx.appcompat.widget.ActionMenuView r0 = r1.mMenuView
            if (r0 == 0) goto Le
            androidx.appcompat.widget.ActionMenuView r0 = r1.mMenuView
            boolean r0 = r0.isOverflowMenuShowPending()
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    public boolean isOverflowMenuShowing() {
            r1 = this;
            androidx.appcompat.widget.ActionMenuView r0 = r1.mMenuView
            if (r0 == 0) goto Le
            androidx.appcompat.widget.ActionMenuView r0 = r1.mMenuView
            boolean r0 = r0.isOverflowMenuShowing()
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    public boolean isTitleTruncated() {
            r5 = this;
            android.widget.TextView r0 = r5.mTitleTextView
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            android.widget.TextView r0 = r5.mTitleTextView
            android.text.Layout r0 = r0.getLayout()
            if (r0 != 0) goto Lf
            return r1
        Lf:
            int r2 = r0.getLineCount()
            r3 = 0
        L14:
            if (r3 >= r2) goto L21
            int r4 = r0.getEllipsisCount(r3)
            if (r4 <= 0) goto L1e
            r1 = 1
            return r1
        L1e:
            int r3 = r3 + 1
            goto L14
        L21:
            return r1
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
            r0 = this;
            super.onAttachedToWindow()
            r0.updateBackInvokedCallbackState()
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
            r1 = this;
            super.onDetachedFromWindow()
            java.lang.Runnable r0 = r1.mShowOverflowMenuRunnable
            r1.removeCallbacks(r0)
            r1.updateBackInvokedCallbackState()
            return
    }

    @Override // android.view.View
    public boolean onHoverEvent(android.view.MotionEvent r6) {
            r5 = this;
            int r0 = r6.getActionMasked()
            r1 = 0
            r2 = 9
            if (r0 != r2) goto Lb
            r5.mEatingHover = r1
        Lb:
            boolean r3 = r5.mEatingHover
            r4 = 1
            if (r3 != 0) goto L1a
            boolean r3 = super.onHoverEvent(r6)
            if (r0 != r2) goto L1a
            if (r3 != 0) goto L1a
            r5.mEatingHover = r4
        L1a:
            r2 = 10
            if (r0 == r2) goto L21
            r2 = 3
            if (r0 != r2) goto L23
        L21:
            r5.mEatingHover = r1
        L23:
            return r4
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean r34, int r35, int r36, int r37, int r38) {
            r33 = this;
            r0 = r33
            int r1 = r0.getLayoutDirection()
            r2 = 0
            r3 = 1
            if (r1 != r3) goto Lc
            r1 = r3
            goto Ld
        Lc:
            r1 = r2
        Ld:
            int r4 = r0.getWidth()
            int r5 = r0.getHeight()
            int r6 = r0.getPaddingLeft()
            int r7 = r0.getPaddingRight()
            int r8 = r0.getPaddingTop()
            int r9 = r0.getPaddingBottom()
            r10 = r6
            int r11 = r4 - r7
            int[] r12 = r0.mTempMargins
            r12[r3] = r2
            r12[r2] = r2
            int r13 = androidx.core.view.ViewCompat.getMinimumHeight(r0)
            if (r13 < 0) goto L3b
            int r14 = r38 - r36
            int r14 = java.lang.Math.min(r13, r14)
            goto L3c
        L3b:
            r14 = r2
        L3c:
            android.widget.ImageButton r15 = r0.mNavButtonView
            boolean r15 = r0.shouldLayout(r15)
            if (r15 == 0) goto L53
            if (r1 == 0) goto L4d
            android.widget.ImageButton r15 = r0.mNavButtonView
            int r11 = r0.layoutChildRight(r15, r11, r12, r14)
            goto L53
        L4d:
            android.widget.ImageButton r15 = r0.mNavButtonView
            int r10 = r0.layoutChildLeft(r15, r10, r12, r14)
        L53:
            android.widget.ImageButton r15 = r0.mCollapseButtonView
            boolean r15 = r0.shouldLayout(r15)
            if (r15 == 0) goto L6a
            if (r1 == 0) goto L64
            android.widget.ImageButton r15 = r0.mCollapseButtonView
            int r11 = r0.layoutChildRight(r15, r11, r12, r14)
            goto L6a
        L64:
            android.widget.ImageButton r15 = r0.mCollapseButtonView
            int r10 = r0.layoutChildLeft(r15, r10, r12, r14)
        L6a:
            androidx.appcompat.widget.ActionMenuView r15 = r0.mMenuView
            boolean r15 = r0.shouldLayout(r15)
            if (r15 == 0) goto L81
            if (r1 == 0) goto L7b
            androidx.appcompat.widget.ActionMenuView r15 = r0.mMenuView
            int r10 = r0.layoutChildLeft(r15, r10, r12, r14)
            goto L81
        L7b:
            androidx.appcompat.widget.ActionMenuView r15 = r0.mMenuView
            int r11 = r0.layoutChildRight(r15, r11, r12, r14)
        L81:
            int r15 = r0.getCurrentContentInsetLeft()
            int r16 = r0.getCurrentContentInsetRight()
            r17 = r3
            int r3 = r15 - r10
            int r3 = java.lang.Math.max(r2, r3)
            r12[r2] = r3
            int r3 = r4 - r7
            int r3 = r3 - r11
            int r3 = r16 - r3
            int r3 = java.lang.Math.max(r2, r3)
            r12[r17] = r3
            int r3 = java.lang.Math.max(r10, r15)
            int r10 = r4 - r7
            int r10 = r10 - r16
            int r10 = java.lang.Math.min(r11, r10)
            android.view.View r11 = r0.mExpandedActionView
            boolean r11 = r0.shouldLayout(r11)
            if (r11 == 0) goto Lc1
            if (r1 == 0) goto Lbb
            android.view.View r11 = r0.mExpandedActionView
            int r10 = r0.layoutChildRight(r11, r10, r12, r14)
            goto Lc1
        Lbb:
            android.view.View r11 = r0.mExpandedActionView
            int r3 = r0.layoutChildLeft(r11, r3, r12, r14)
        Lc1:
            android.widget.ImageView r11 = r0.mLogoView
            boolean r11 = r0.shouldLayout(r11)
            if (r11 == 0) goto Ld8
            if (r1 == 0) goto Ld2
            android.widget.ImageView r11 = r0.mLogoView
            int r10 = r0.layoutChildRight(r11, r10, r12, r14)
            goto Ld8
        Ld2:
            android.widget.ImageView r11 = r0.mLogoView
            int r3 = r0.layoutChildLeft(r11, r3, r12, r14)
        Ld8:
            android.widget.TextView r11 = r0.mTitleTextView
            boolean r11 = r0.shouldLayout(r11)
            android.widget.TextView r2 = r0.mSubtitleTextView
            boolean r2 = r0.shouldLayout(r2)
            r19 = 0
            if (r11 == 0) goto L109
            r20 = r1
            android.widget.TextView r1 = r0.mTitleTextView
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$LayoutParams r1 = (androidx.appcompat.widget.Toolbar.LayoutParams) r1
            r21 = r2
            int r2 = r1.topMargin
            r22 = r2
            android.widget.TextView r2 = r0.mTitleTextView
            int r2 = r2.getMeasuredHeight()
            int r2 = r22 + r2
            r22 = r2
            int r2 = r1.bottomMargin
            int r2 = r22 + r2
            int r19 = r19 + r2
            goto L10d
        L109:
            r20 = r1
            r21 = r2
        L10d:
            if (r21 == 0) goto L12b
            android.widget.TextView r1 = r0.mSubtitleTextView
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$LayoutParams r1 = (androidx.appcompat.widget.Toolbar.LayoutParams) r1
            int r2 = r1.topMargin
            r22 = r2
            android.widget.TextView r2 = r0.mSubtitleTextView
            int r2 = r2.getMeasuredHeight()
            int r2 = r22 + r2
            r22 = r2
            int r2 = r1.bottomMargin
            int r2 = r22 + r2
            int r19 = r19 + r2
        L12b:
            if (r11 != 0) goto L13a
            if (r21 == 0) goto L130
            goto L13a
        L130:
            r26 = r4
            r28 = r5
            r30 = r6
            r31 = r7
            goto L2f9
        L13a:
            if (r11 == 0) goto L13f
            android.widget.TextView r1 = r0.mTitleTextView
            goto L141
        L13f:
            android.widget.TextView r1 = r0.mSubtitleTextView
        L141:
            if (r21 == 0) goto L146
            android.widget.TextView r2 = r0.mSubtitleTextView
            goto L148
        L146:
            android.widget.TextView r2 = r0.mTitleTextView
        L148:
            android.view.ViewGroup$LayoutParams r22 = r1.getLayoutParams()
            r23 = r1
            r1 = r22
            androidx.appcompat.widget.Toolbar$LayoutParams r1 = (androidx.appcompat.widget.Toolbar.LayoutParams) r1
            android.view.ViewGroup$LayoutParams r22 = r2.getLayoutParams()
            r24 = r2
            r2 = r22
            androidx.appcompat.widget.Toolbar$LayoutParams r2 = (androidx.appcompat.widget.Toolbar.LayoutParams) r2
            if (r11 == 0) goto L169
            r22 = r3
            android.widget.TextView r3 = r0.mTitleTextView
            int r3 = r3.getMeasuredWidth()
            if (r3 > 0) goto L175
            goto L16b
        L169:
            r22 = r3
        L16b:
            if (r21 == 0) goto L178
            android.widget.TextView r3 = r0.mSubtitleTextView
            int r3 = r3.getMeasuredWidth()
            if (r3 <= 0) goto L178
        L175:
            r3 = r17
            goto L179
        L178:
            r3 = 0
        L179:
            r25 = r3
            int r3 = r0.mGravity
            r3 = r3 & 112(0x70, float:1.57E-43)
            switch(r3) {
                case 48: goto L1b6;
                case 80: goto L1a1;
                default: goto L182;
            }
        L182:
            int r3 = r5 - r8
            int r3 = r3 - r9
            int r26 = r3 - r19
            r27 = r3
            int r3 = r26 / 2
            r26 = r4
            int r4 = r1.topMargin
            r28 = r4
            int r4 = r0.mTitleMarginTop
            int r4 = r28 + r4
            if (r3 >= r4) goto L1cb
            int r4 = r1.topMargin
            r28 = r3
            int r3 = r0.mTitleMarginTop
            int r3 = r3 + r4
            r29 = r1
            goto L1ee
        L1a1:
            int r3 = r5 - r9
            r26 = r3
            int r3 = r2.bottomMargin
            int r3 = r26 - r3
            r26 = r3
            int r3 = r0.mTitleMarginBottom
            int r3 = r26 - r3
            int r3 = r3 - r19
            r29 = r1
            r26 = r4
            goto L1f1
        L1b6:
            int r3 = r0.getPaddingTop()
            r26 = r3
            int r3 = r1.topMargin
            int r3 = r26 + r3
            r26 = r3
            int r3 = r0.mTitleMarginTop
            int r3 = r26 + r3
            r29 = r1
            r26 = r4
            goto L1f1
        L1cb:
            r28 = r3
            int r3 = r5 - r9
            int r3 = r3 - r19
            int r3 = r3 - r28
            int r3 = r3 - r8
            int r4 = r1.bottomMargin
            r29 = r1
            int r1 = r0.mTitleMarginBottom
            int r4 = r4 + r1
            if (r3 >= r4) goto L1ec
            int r1 = r2.bottomMargin
            int r4 = r0.mTitleMarginBottom
            int r1 = r1 + r4
            int r1 = r1 - r3
            int r1 = r28 - r1
            r4 = 0
            int r1 = java.lang.Math.max(r4, r1)
            r3 = r1
            goto L1ee
        L1ec:
            r3 = r28
        L1ee:
            int r1 = r8 + r3
            r3 = r1
        L1f1:
            if (r20 == 0) goto L278
            if (r25 == 0) goto L1f8
            int r1 = r0.mTitleMarginStart
            goto L1f9
        L1f8:
            r1 = 0
        L1f9:
            r4 = r12[r17]
            int r1 = r1 - r4
            r4 = 0
            int r18 = java.lang.Math.max(r4, r1)
            int r10 = r10 - r18
            r27 = r2
            int r2 = -r1
            int r2 = java.lang.Math.max(r4, r2)
            r12[r17] = r2
            r2 = r10
            r4 = r10
            if (r11 == 0) goto L23d
            r18 = r1
            android.widget.TextView r1 = r0.mTitleTextView
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$LayoutParams r1 = (androidx.appcompat.widget.Toolbar.LayoutParams) r1
            r28 = r5
            android.widget.TextView r5 = r0.mTitleTextView
            int r5 = r5.getMeasuredWidth()
            int r5 = r2 - r5
            r30 = r6
            android.widget.TextView r6 = r0.mTitleTextView
            int r6 = r6.getMeasuredHeight()
            int r6 = r6 + r3
            r31 = r7
            android.widget.TextView r7 = r0.mTitleTextView
            r7.layout(r5, r3, r2, r6)
            int r7 = r0.mTitleMarginEnd
            int r2 = r5 - r7
            int r7 = r1.bottomMargin
            int r3 = r6 + r7
            goto L245
        L23d:
            r18 = r1
            r28 = r5
            r30 = r6
            r31 = r7
        L245:
            if (r21 == 0) goto L26d
            android.widget.TextView r1 = r0.mSubtitleTextView
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$LayoutParams r1 = (androidx.appcompat.widget.Toolbar.LayoutParams) r1
            int r5 = r1.topMargin
            int r3 = r3 + r5
            android.widget.TextView r5 = r0.mSubtitleTextView
            int r5 = r5.getMeasuredWidth()
            int r5 = r4 - r5
            android.widget.TextView r6 = r0.mSubtitleTextView
            int r6 = r6.getMeasuredHeight()
            int r6 = r6 + r3
            android.widget.TextView r7 = r0.mSubtitleTextView
            r7.layout(r5, r3, r4, r6)
            int r7 = r0.mTitleMarginEnd
            int r4 = r4 - r7
            int r7 = r1.bottomMargin
            int r3 = r6 + r7
        L26d:
            if (r25 == 0) goto L274
            int r1 = java.lang.Math.min(r2, r4)
            r10 = r1
        L274:
            r3 = r22
            goto L2f9
        L278:
            r27 = r2
            r28 = r5
            r30 = r6
            r31 = r7
            if (r25 == 0) goto L285
            int r4 = r0.mTitleMarginStart
            goto L286
        L285:
            r4 = 0
        L286:
            r1 = 0
            r2 = r12[r1]
            int r4 = r4 - r2
            int r2 = java.lang.Math.max(r1, r4)
            int r2 = r22 + r2
            int r5 = -r4
            int r5 = java.lang.Math.max(r1, r5)
            r12[r1] = r5
            r1 = r2
            r5 = r2
            if (r11 == 0) goto L2c3
            android.widget.TextView r6 = r0.mTitleTextView
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            androidx.appcompat.widget.Toolbar$LayoutParams r6 = (androidx.appcompat.widget.Toolbar.LayoutParams) r6
            android.widget.TextView r7 = r0.mTitleTextView
            int r7 = r7.getMeasuredWidth()
            int r7 = r7 + r1
            r18 = r2
            android.widget.TextView r2 = r0.mTitleTextView
            int r2 = r2.getMeasuredHeight()
            int r2 = r2 + r3
            r22 = r4
            android.widget.TextView r4 = r0.mTitleTextView
            r4.layout(r1, r3, r7, r2)
            int r4 = r0.mTitleMarginEnd
            int r1 = r7 + r4
            int r4 = r6.bottomMargin
            int r3 = r2 + r4
            goto L2c7
        L2c3:
            r18 = r2
            r22 = r4
        L2c7:
            if (r21 == 0) goto L2ef
            android.widget.TextView r2 = r0.mSubtitleTextView
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            androidx.appcompat.widget.Toolbar$LayoutParams r2 = (androidx.appcompat.widget.Toolbar.LayoutParams) r2
            int r4 = r2.topMargin
            int r3 = r3 + r4
            android.widget.TextView r4 = r0.mSubtitleTextView
            int r4 = r4.getMeasuredWidth()
            int r4 = r4 + r5
            android.widget.TextView r6 = r0.mSubtitleTextView
            int r6 = r6.getMeasuredHeight()
            int r6 = r6 + r3
            android.widget.TextView r7 = r0.mSubtitleTextView
            r7.layout(r5, r3, r4, r6)
            int r7 = r0.mTitleMarginEnd
            int r5 = r4 + r7
            int r7 = r2.bottomMargin
            int r3 = r6 + r7
        L2ef:
            if (r25 == 0) goto L2f7
            int r2 = java.lang.Math.max(r1, r5)
            r3 = r2
            goto L2f9
        L2f7:
            r3 = r18
        L2f9:
            java.util.ArrayList<android.view.View> r1 = r0.mTempViews
            r2 = 3
            r0.addCustomViewsWithGravity(r1, r2)
            java.util.ArrayList<android.view.View> r1 = r0.mTempViews
            int r1 = r1.size()
            r2 = 0
        L306:
            if (r2 >= r1) goto L317
            java.util.ArrayList<android.view.View> r4 = r0.mTempViews
            java.lang.Object r4 = r4.get(r2)
            android.view.View r4 = (android.view.View) r4
            int r3 = r0.layoutChildLeft(r4, r3, r12, r14)
            int r2 = r2 + 1
            goto L306
        L317:
            java.util.ArrayList<android.view.View> r2 = r0.mTempViews
            r4 = 5
            r0.addCustomViewsWithGravity(r2, r4)
            java.util.ArrayList<android.view.View> r2 = r0.mTempViews
            int r2 = r2.size()
            r4 = 0
        L324:
            if (r4 >= r2) goto L335
            java.util.ArrayList<android.view.View> r5 = r0.mTempViews
            java.lang.Object r5 = r5.get(r4)
            android.view.View r5 = (android.view.View) r5
            int r10 = r0.layoutChildRight(r5, r10, r12, r14)
            int r4 = r4 + 1
            goto L324
        L335:
            java.util.ArrayList<android.view.View> r4 = r0.mTempViews
            r5 = r17
            r0.addCustomViewsWithGravity(r4, r5)
            java.util.ArrayList<android.view.View> r4 = r0.mTempViews
            int r4 = r0.getViewListMeasuredWidth(r4, r12)
            int r5 = r26 - r30
            int r5 = r5 - r31
            int r5 = r5 / 2
            int r6 = r30 + r5
            int r5 = r4 / 2
            int r7 = r6 - r5
            r17 = r1
            int r1 = r7 + r4
            if (r7 >= r3) goto L356
            r7 = r3
            goto L35c
        L356:
            if (r1 <= r10) goto L35c
            int r18 = r1 - r10
            int r7 = r7 - r18
        L35c:
            r18 = r1
            java.util.ArrayList<android.view.View> r1 = r0.mTempViews
            int r1 = r1.size()
            r22 = 0
            r32 = r22
            r22 = r2
            r2 = r32
        L36c:
            if (r2 >= r1) goto L381
            r23 = r1
            java.util.ArrayList<android.view.View> r1 = r0.mTempViews
            java.lang.Object r1 = r1.get(r2)
            android.view.View r1 = (android.view.View) r1
            int r7 = r0.layoutChildLeft(r1, r7, r12, r14)
            int r2 = r2 + 1
            r1 = r23
            goto L36c
        L381:
            r23 = r1
            java.util.ArrayList<android.view.View> r1 = r0.mTempViews
            r1.clear()
            return
    }

    @Override // android.view.View
    protected void onMeasure(int r23, int r24) {
            r22 = this;
            r0 = r22
            r3 = 0
            r7 = 0
            r8 = 0
            int[] r9 = r0.mTempMargins
            boolean r1 = androidx.appcompat.widget.ViewUtils.isLayoutRtl(r0)
            if (r1 == 0) goto L12
            r1 = 1
            r2 = 0
            r10 = r1
            r11 = r2
            goto L16
        L12:
            r1 = 0
            r2 = 1
            r10 = r1
            r11 = r2
        L16:
            r12 = 0
            android.widget.ImageButton r1 = r0.mNavButtonView
            boolean r1 = r0.shouldLayout(r1)
            if (r1 == 0) goto L54
            android.widget.ImageButton r1 = r0.mNavButtonView
            r5 = 0
            int r6 = r0.mMaxButtonHeight
            r2 = r23
            r4 = r24
            r0.measureChildConstrained(r1, r2, r3, r4, r5, r6)
            android.widget.ImageButton r1 = r0.mNavButtonView
            int r1 = r1.getMeasuredWidth()
            android.widget.ImageButton r2 = r0.mNavButtonView
            int r2 = r0.getHorizontalMargins(r2)
            int r12 = r1 + r2
            android.widget.ImageButton r1 = r0.mNavButtonView
            int r1 = r1.getMeasuredHeight()
            android.widget.ImageButton r2 = r0.mNavButtonView
            int r2 = r0.getVerticalMargins(r2)
            int r1 = r1 + r2
            int r7 = java.lang.Math.max(r7, r1)
            android.widget.ImageButton r1 = r0.mNavButtonView
            int r1 = r1.getMeasuredState()
            int r8 = android.view.View.combineMeasuredStates(r8, r1)
        L54:
            android.widget.ImageButton r1 = r0.mCollapseButtonView
            boolean r1 = r0.shouldLayout(r1)
            if (r1 == 0) goto L91
            android.widget.ImageButton r1 = r0.mCollapseButtonView
            r5 = 0
            int r6 = r0.mMaxButtonHeight
            r2 = r23
            r4 = r24
            r0.measureChildConstrained(r1, r2, r3, r4, r5, r6)
            android.widget.ImageButton r1 = r0.mCollapseButtonView
            int r1 = r1.getMeasuredWidth()
            android.widget.ImageButton r2 = r0.mCollapseButtonView
            int r2 = r0.getHorizontalMargins(r2)
            int r12 = r1 + r2
            android.widget.ImageButton r1 = r0.mCollapseButtonView
            int r1 = r1.getMeasuredHeight()
            android.widget.ImageButton r2 = r0.mCollapseButtonView
            int r2 = r0.getVerticalMargins(r2)
            int r1 = r1 + r2
            int r7 = java.lang.Math.max(r7, r1)
            android.widget.ImageButton r1 = r0.mCollapseButtonView
            int r1 = r1.getMeasuredState()
            int r8 = android.view.View.combineMeasuredStates(r8, r1)
        L91:
            int r13 = r0.getCurrentContentInsetStart()
            int r1 = java.lang.Math.max(r13, r12)
            int r3 = r3 + r1
            int r1 = r13 - r12
            r14 = 0
            int r1 = java.lang.Math.max(r14, r1)
            r9[r10] = r1
            r15 = 0
            androidx.appcompat.widget.ActionMenuView r1 = r0.mMenuView
            boolean r1 = r0.shouldLayout(r1)
            if (r1 == 0) goto Le1
            androidx.appcompat.widget.ActionMenuView r1 = r0.mMenuView
            r5 = 0
            int r6 = r0.mMaxButtonHeight
            r2 = r23
            r4 = r24
            r0.measureChildConstrained(r1, r2, r3, r4, r5, r6)
            androidx.appcompat.widget.ActionMenuView r1 = r0.mMenuView
            int r1 = r1.getMeasuredWidth()
            androidx.appcompat.widget.ActionMenuView r2 = r0.mMenuView
            int r2 = r0.getHorizontalMargins(r2)
            int r15 = r1 + r2
            androidx.appcompat.widget.ActionMenuView r1 = r0.mMenuView
            int r1 = r1.getMeasuredHeight()
            androidx.appcompat.widget.ActionMenuView r2 = r0.mMenuView
            int r2 = r0.getVerticalMargins(r2)
            int r1 = r1 + r2
            int r7 = java.lang.Math.max(r7, r1)
            androidx.appcompat.widget.ActionMenuView r1 = r0.mMenuView
            int r1 = r1.getMeasuredState()
            int r8 = android.view.View.combineMeasuredStates(r8, r1)
        Le1:
            int r1 = r0.getCurrentContentInsetEnd()
            int r2 = java.lang.Math.max(r1, r15)
            int r3 = r3 + r2
            int r2 = r1 - r15
            int r2 = java.lang.Math.max(r14, r2)
            r9[r11] = r2
            android.view.View r2 = r0.mExpandedActionView
            boolean r2 = r0.shouldLayout(r2)
            if (r2 == 0) goto L125
            r2 = r1
            android.view.View r1 = r0.mExpandedActionView
            r5 = 0
            r4 = r24
            r6 = r9
            r9 = r2
            r2 = r23
            int r1 = r0.measureChildCollapseMargins(r1, r2, r3, r4, r5, r6)
            int r3 = r3 + r1
            android.view.View r1 = r0.mExpandedActionView
            int r1 = r1.getMeasuredHeight()
            android.view.View r2 = r0.mExpandedActionView
            int r2 = r0.getVerticalMargins(r2)
            int r1 = r1 + r2
            int r7 = java.lang.Math.max(r7, r1)
            android.view.View r1 = r0.mExpandedActionView
            int r1 = r1.getMeasuredState()
            int r8 = android.view.View.combineMeasuredStates(r8, r1)
            goto L127
        L125:
            r6 = r9
            r9 = r1
        L127:
            android.widget.ImageView r1 = r0.mLogoView
            boolean r1 = r0.shouldLayout(r1)
            if (r1 == 0) goto L156
            android.widget.ImageView r1 = r0.mLogoView
            r5 = 0
            r2 = r23
            r4 = r24
            int r1 = r0.measureChildCollapseMargins(r1, r2, r3, r4, r5, r6)
            int r3 = r3 + r1
            android.widget.ImageView r1 = r0.mLogoView
            int r1 = r1.getMeasuredHeight()
            android.widget.ImageView r2 = r0.mLogoView
            int r2 = r0.getVerticalMargins(r2)
            int r1 = r1 + r2
            int r7 = java.lang.Math.max(r7, r1)
            android.widget.ImageView r1 = r0.mLogoView
            int r1 = r1.getMeasuredState()
            int r8 = android.view.View.combineMeasuredStates(r8, r1)
        L156:
            int r1 = r0.getChildCount()
            r2 = 0
            r21 = r7
            r7 = r2
            r2 = r8
            r8 = r21
        L161:
            if (r7 >= r1) goto L1b9
            r4 = r1
            android.view.View r1 = r0.getChildAt(r7)
            android.view.ViewGroup$LayoutParams r5 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$LayoutParams r5 = (androidx.appcompat.widget.Toolbar.LayoutParams) r5
            int r14 = r5.mViewType
            if (r14 != 0) goto L1a9
            boolean r14 = r0.shouldLayout(r1)
            if (r14 != 0) goto L17e
            r14 = r2
            r18 = r3
            r16 = r4
            goto L1b0
        L17e:
            r14 = r5
            r5 = 0
            r16 = r4
            r17 = r14
            r4 = r24
            r14 = r2
            r2 = r23
            int r5 = r0.measureChildCollapseMargins(r1, r2, r3, r4, r5, r6)
            r18 = r3
            int r3 = r18 + r5
            int r2 = r1.getMeasuredHeight()
            int r4 = r0.getVerticalMargins(r1)
            int r2 = r2 + r4
            int r2 = java.lang.Math.max(r8, r2)
            int r4 = r1.getMeasuredState()
            int r4 = android.view.View.combineMeasuredStates(r14, r4)
            r8 = r2
            r2 = r4
            goto L1b3
        L1a9:
            r14 = r2
            r18 = r3
            r16 = r4
            r17 = r5
        L1b0:
            r2 = r14
            r3 = r18
        L1b3:
            int r7 = r7 + 1
            r1 = r16
            r14 = 0
            goto L161
        L1b9:
            r16 = r1
            r14 = r2
            r18 = r3
            r7 = 0
            r17 = 0
            int r1 = r0.mTitleMarginTop
            int r2 = r0.mTitleMarginBottom
            int r5 = r1 + r2
            int r1 = r0.mTitleMarginStart
            int r2 = r0.mTitleMarginEnd
            int r19 = r1 + r2
            android.widget.TextView r1 = r0.mTitleTextView
            boolean r1 = r0.shouldLayout(r1)
            if (r1 == 0) goto L20b
            android.widget.TextView r1 = r0.mTitleTextView
            int r3 = r18 + r19
            r2 = r23
            r4 = r24
            int r1 = r0.measureChildCollapseMargins(r1, r2, r3, r4, r5, r6)
            r20 = r5
            android.widget.TextView r2 = r0.mTitleTextView
            int r2 = r2.getMeasuredWidth()
            android.widget.TextView r3 = r0.mTitleTextView
            int r3 = r0.getHorizontalMargins(r3)
            int r7 = r2 + r3
            android.widget.TextView r1 = r0.mTitleTextView
            int r1 = r1.getMeasuredHeight()
            android.widget.TextView r2 = r0.mTitleTextView
            int r2 = r0.getVerticalMargins(r2)
            int r17 = r1 + r2
            android.widget.TextView r1 = r0.mTitleTextView
            int r1 = r1.getMeasuredState()
            int r2 = android.view.View.combineMeasuredStates(r14, r1)
            r14 = r2
            goto L20d
        L20b:
            r20 = r5
        L20d:
            android.widget.TextView r1 = r0.mSubtitleTextView
            boolean r1 = r0.shouldLayout(r1)
            if (r1 == 0) goto L243
            android.widget.TextView r1 = r0.mSubtitleTextView
            int r3 = r18 + r19
            int r5 = r17 + r20
            r2 = r23
            r4 = r24
            int r1 = r0.measureChildCollapseMargins(r1, r2, r3, r4, r5, r6)
            int r7 = java.lang.Math.max(r7, r1)
            android.widget.TextView r1 = r0.mSubtitleTextView
            int r1 = r1.getMeasuredHeight()
            android.widget.TextView r2 = r0.mSubtitleTextView
            int r2 = r0.getVerticalMargins(r2)
            int r1 = r1 + r2
            int r17 = r17 + r1
            android.widget.TextView r1 = r0.mSubtitleTextView
            int r1 = r1.getMeasuredState()
            int r14 = android.view.View.combineMeasuredStates(r14, r1)
            r1 = r17
            goto L245
        L243:
            r1 = r17
        L245:
            int r3 = r18 + r7
            int r2 = java.lang.Math.max(r8, r1)
            int r4 = r0.getPaddingLeft()
            int r5 = r0.getPaddingRight()
            int r4 = r4 + r5
            int r3 = r3 + r4
            int r4 = r0.getPaddingTop()
            int r5 = r0.getPaddingBottom()
            int r4 = r4 + r5
            int r2 = r2 + r4
            int r4 = r0.getSuggestedMinimumWidth()
            int r4 = java.lang.Math.max(r3, r4)
            r5 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r5 = r5 & r14
            r8 = r23
            int r4 = android.view.View.resolveSizeAndState(r4, r8, r5)
            int r5 = r0.getSuggestedMinimumHeight()
            int r5 = java.lang.Math.max(r2, r5)
            r17 = r1
            int r1 = r14 << 16
            r18 = r2
            r2 = r24
            int r1 = android.view.View.resolveSizeAndState(r5, r2, r1)
            boolean r5 = r0.shouldCollapse()
            if (r5 == 0) goto L28e
            r5 = 0
            goto L28f
        L28e:
            r5 = r1
        L28f:
            r0.setMeasuredDimension(r4, r5)
            return
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(android.os.Parcelable r4) {
            r3 = this;
            boolean r0 = r4 instanceof androidx.appcompat.widget.Toolbar.SavedState
            if (r0 != 0) goto L8
            super.onRestoreInstanceState(r4)
            return
        L8:
            r0 = r4
            androidx.appcompat.widget.Toolbar$SavedState r0 = (androidx.appcompat.widget.Toolbar.SavedState) r0
            android.os.Parcelable r1 = r0.getSuperState()
            super.onRestoreInstanceState(r1)
            androidx.appcompat.widget.ActionMenuView r1 = r3.mMenuView
            if (r1 == 0) goto L1d
            androidx.appcompat.widget.ActionMenuView r1 = r3.mMenuView
            androidx.appcompat.view.menu.MenuBuilder r1 = r1.peekMenu()
            goto L1e
        L1d:
            r1 = 0
        L1e:
            int r2 = r0.expandedMenuItemId
            if (r2 == 0) goto L33
            androidx.appcompat.widget.Toolbar$ExpandedActionViewMenuPresenter r2 = r3.mExpandedMenuPresenter
            if (r2 == 0) goto L33
            if (r1 == 0) goto L33
            int r2 = r0.expandedMenuItemId
            android.view.MenuItem r2 = r1.findItem(r2)
            if (r2 == 0) goto L33
            r2.expandActionView()
        L33:
            boolean r2 = r0.isOverflowOpen
            if (r2 == 0) goto L3a
            r3.postShowOverflowMenu()
        L3a:
            return
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int r3) {
            r2 = this;
            super.onRtlPropertiesChanged(r3)
            r2.ensureContentInsets()
            androidx.appcompat.widget.RtlSpacingHelper r0 = r2.mContentInsets
            r1 = 1
            if (r3 != r1) goto Lc
            goto Ld
        Lc:
            r1 = 0
        Ld:
            r0.setDirection(r1)
            return
    }

    @Override // android.view.View
    protected android.os.Parcelable onSaveInstanceState() {
            r2 = this;
            androidx.appcompat.widget.Toolbar$SavedState r0 = new androidx.appcompat.widget.Toolbar$SavedState
            android.os.Parcelable r1 = super.onSaveInstanceState()
            r0.<init>(r1)
            androidx.appcompat.widget.Toolbar$ExpandedActionViewMenuPresenter r1 = r2.mExpandedMenuPresenter
            if (r1 == 0) goto L1d
            androidx.appcompat.widget.Toolbar$ExpandedActionViewMenuPresenter r1 = r2.mExpandedMenuPresenter
            androidx.appcompat.view.menu.MenuItemImpl r1 = r1.mCurrentExpandedItem
            if (r1 == 0) goto L1d
            androidx.appcompat.widget.Toolbar$ExpandedActionViewMenuPresenter r1 = r2.mExpandedMenuPresenter
            androidx.appcompat.view.menu.MenuItemImpl r1 = r1.mCurrentExpandedItem
            int r1 = r1.getItemId()
            r0.expandedMenuItemId = r1
        L1d:
            boolean r1 = r2.isOverflowMenuShowing()
            r0.isOverflowOpen = r1
            return r0
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent r5) {
            r4 = this;
            int r0 = r5.getActionMasked()
            r1 = 0
            if (r0 != 0) goto L9
            r4.mEatingTouch = r1
        L9:
            boolean r2 = r4.mEatingTouch
            r3 = 1
            if (r2 != 0) goto L18
            boolean r2 = super.onTouchEvent(r5)
            if (r0 != 0) goto L18
            if (r2 != 0) goto L18
            r4.mEatingTouch = r3
        L18:
            if (r0 == r3) goto L1d
            r2 = 3
            if (r0 != r2) goto L1f
        L1d:
            r4.mEatingTouch = r1
        L1f:
            return r3
    }

    void removeChildrenForExpandedActionView() {
            r6 = this;
            int r0 = r6.getChildCount()
            int r1 = r0 + (-1)
        L6:
            if (r1 < 0) goto L26
            android.view.View r2 = r6.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r3 = r2.getLayoutParams()
            androidx.appcompat.widget.Toolbar$LayoutParams r3 = (androidx.appcompat.widget.Toolbar.LayoutParams) r3
            int r4 = r3.mViewType
            r5 = 2
            if (r4 == r5) goto L23
            androidx.appcompat.widget.ActionMenuView r4 = r6.mMenuView
            if (r2 == r4) goto L23
            r6.removeViewAt(r1)
            java.util.ArrayList<android.view.View> r4 = r6.mHiddenViews
            r4.add(r2)
        L23:
            int r1 = r1 + (-1)
            goto L6
        L26:
            return
    }

    @Override // androidx.core.view.MenuHost
    public void removeMenuProvider(androidx.core.view.MenuProvider r2) {
            r1 = this;
            androidx.core.view.MenuHostHelper r0 = r1.mMenuHostHelper
            r0.removeMenuProvider(r2)
            return
    }

    public void setBackInvokedCallbackEnabled(boolean r2) {
            r1 = this;
            boolean r0 = r1.mBackInvokedCallbackEnabled
            if (r0 == r2) goto L9
            r1.mBackInvokedCallbackEnabled = r2
            r1.updateBackInvokedCallbackState()
        L9:
            return
    }

    public void setCollapseContentDescription(int r2) {
            r1 = this;
            if (r2 == 0) goto Lb
            android.content.Context r0 = r1.getContext()
            java.lang.CharSequence r0 = r0.getText(r2)
            goto Lc
        Lb:
            r0 = 0
        Lc:
            r1.setCollapseContentDescription(r0)
            return
    }

    public void setCollapseContentDescription(java.lang.CharSequence r2) {
            r1 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L9
            r1.ensureCollapseButtonView()
        L9:
            android.widget.ImageButton r0 = r1.mCollapseButtonView
            if (r0 == 0) goto L12
            android.widget.ImageButton r0 = r1.mCollapseButtonView
            r0.setContentDescription(r2)
        L12:
            return
    }

    public void setCollapseIcon(int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            android.graphics.drawable.Drawable r0 = androidx.appcompat.content.res.AppCompatResources.getDrawable(r0, r2)
            r1.setCollapseIcon(r0)
            return
    }

    public void setCollapseIcon(android.graphics.drawable.Drawable r3) {
            r2 = this;
            if (r3 == 0) goto Lb
            r2.ensureCollapseButtonView()
            android.widget.ImageButton r0 = r2.mCollapseButtonView
            r0.setImageDrawable(r3)
            goto L16
        Lb:
            android.widget.ImageButton r0 = r2.mCollapseButtonView
            if (r0 == 0) goto L16
            android.widget.ImageButton r0 = r2.mCollapseButtonView
            android.graphics.drawable.Drawable r1 = r2.mCollapseIcon
            r0.setImageDrawable(r1)
        L16:
            return
    }

    public void setCollapsible(boolean r1) {
            r0 = this;
            r0.mCollapsible = r1
            r0.requestLayout()
            return
    }

    public void setContentInsetEndWithActions(int r2) {
            r1 = this;
            if (r2 >= 0) goto L4
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
        L4:
            int r0 = r1.mContentInsetEndWithActions
            if (r2 == r0) goto L13
            r1.mContentInsetEndWithActions = r2
            android.graphics.drawable.Drawable r0 = r1.getNavigationIcon()
            if (r0 == 0) goto L13
            r1.requestLayout()
        L13:
            return
    }

    public void setContentInsetStartWithNavigation(int r2) {
            r1 = this;
            if (r2 >= 0) goto L4
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
        L4:
            int r0 = r1.mContentInsetStartWithNavigation
            if (r2 == r0) goto L13
            r1.mContentInsetStartWithNavigation = r2
            android.graphics.drawable.Drawable r0 = r1.getNavigationIcon()
            if (r0 == 0) goto L13
            r1.requestLayout()
        L13:
            return
    }

    public void setContentInsetsAbsolute(int r2, int r3) {
            r1 = this;
            r1.ensureContentInsets()
            androidx.appcompat.widget.RtlSpacingHelper r0 = r1.mContentInsets
            r0.setAbsolute(r2, r3)
            return
    }

    public void setContentInsetsRelative(int r2, int r3) {
            r1 = this;
            r1.ensureContentInsets()
            androidx.appcompat.widget.RtlSpacingHelper r0 = r1.mContentInsets
            r0.setRelative(r2, r3)
            return
    }

    public void setLogo(int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            android.graphics.drawable.Drawable r0 = androidx.appcompat.content.res.AppCompatResources.getDrawable(r0, r2)
            r1.setLogo(r0)
            return
    }

    public void setLogo(android.graphics.drawable.Drawable r3) {
            r2 = this;
            if (r3 == 0) goto L14
            r2.ensureLogoView()
            android.widget.ImageView r0 = r2.mLogoView
            boolean r0 = r2.isChildOrHidden(r0)
            if (r0 != 0) goto L2c
            android.widget.ImageView r0 = r2.mLogoView
            r1 = 1
            r2.addSystemView(r0, r1)
            goto L2c
        L14:
            android.widget.ImageView r0 = r2.mLogoView
            if (r0 == 0) goto L2c
            android.widget.ImageView r0 = r2.mLogoView
            boolean r0 = r2.isChildOrHidden(r0)
            if (r0 == 0) goto L2c
            android.widget.ImageView r0 = r2.mLogoView
            r2.removeView(r0)
            java.util.ArrayList<android.view.View> r0 = r2.mHiddenViews
            android.widget.ImageView r1 = r2.mLogoView
            r0.remove(r1)
        L2c:
            android.widget.ImageView r0 = r2.mLogoView
            if (r0 == 0) goto L35
            android.widget.ImageView r0 = r2.mLogoView
            r0.setImageDrawable(r3)
        L35:
            return
    }

    public void setLogoDescription(int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            java.lang.CharSequence r0 = r0.getText(r2)
            r1.setLogoDescription(r0)
            return
    }

    public void setLogoDescription(java.lang.CharSequence r2) {
            r1 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L9
            r1.ensureLogoView()
        L9:
            android.widget.ImageView r0 = r1.mLogoView
            if (r0 == 0) goto L12
            android.widget.ImageView r0 = r1.mLogoView
            r0.setContentDescription(r2)
        L12:
            return
    }

    public void setMenu(androidx.appcompat.view.menu.MenuBuilder r6, androidx.appcompat.widget.ActionMenuPresenter r7) {
            r5 = this;
            if (r6 != 0) goto L7
            androidx.appcompat.widget.ActionMenuView r0 = r5.mMenuView
            if (r0 != 0) goto L7
            return
        L7:
            r5.ensureMenuView()
            androidx.appcompat.widget.ActionMenuView r0 = r5.mMenuView
            androidx.appcompat.view.menu.MenuBuilder r0 = r0.peekMenu()
            if (r0 != r6) goto L13
            return
        L13:
            if (r0 == 0) goto L1f
            androidx.appcompat.widget.ActionMenuPresenter r1 = r5.mOuterActionMenuPresenter
            r0.removeMenuPresenter(r1)
            androidx.appcompat.widget.Toolbar$ExpandedActionViewMenuPresenter r1 = r5.mExpandedMenuPresenter
            r0.removeMenuPresenter(r1)
        L1f:
            androidx.appcompat.widget.Toolbar$ExpandedActionViewMenuPresenter r1 = r5.mExpandedMenuPresenter
            if (r1 != 0) goto L2a
            androidx.appcompat.widget.Toolbar$ExpandedActionViewMenuPresenter r1 = new androidx.appcompat.widget.Toolbar$ExpandedActionViewMenuPresenter
            r1.<init>(r5)
            r5.mExpandedMenuPresenter = r1
        L2a:
            r1 = 1
            r7.setExpandedActionViewsExclusive(r1)
            if (r6 == 0) goto L3d
            android.content.Context r1 = r5.mPopupContext
            r6.addMenuPresenter(r7, r1)
            androidx.appcompat.widget.Toolbar$ExpandedActionViewMenuPresenter r1 = r5.mExpandedMenuPresenter
            android.content.Context r2 = r5.mPopupContext
            r6.addMenuPresenter(r1, r2)
            goto L52
        L3d:
            android.content.Context r2 = r5.mPopupContext
            r3 = 0
            r7.initForMenu(r2, r3)
            androidx.appcompat.widget.Toolbar$ExpandedActionViewMenuPresenter r2 = r5.mExpandedMenuPresenter
            android.content.Context r4 = r5.mPopupContext
            r2.initForMenu(r4, r3)
            r7.updateMenuView(r1)
            androidx.appcompat.widget.Toolbar$ExpandedActionViewMenuPresenter r2 = r5.mExpandedMenuPresenter
            r2.updateMenuView(r1)
        L52:
            androidx.appcompat.widget.ActionMenuView r1 = r5.mMenuView
            int r2 = r5.mPopupTheme
            r1.setPopupTheme(r2)
            androidx.appcompat.widget.ActionMenuView r1 = r5.mMenuView
            r1.setPresenter(r7)
            r5.mOuterActionMenuPresenter = r7
            r5.updateBackInvokedCallbackState()
            return
    }

    public void setMenuCallbacks(androidx.appcompat.view.menu.MenuPresenter.Callback r2, androidx.appcompat.view.menu.MenuBuilder.Callback r3) {
            r1 = this;
            r1.mActionMenuPresenterCallback = r2
            r1.mMenuBuilderCallback = r3
            androidx.appcompat.widget.ActionMenuView r0 = r1.mMenuView
            if (r0 == 0) goto Ld
            androidx.appcompat.widget.ActionMenuView r0 = r1.mMenuView
            r0.setMenuCallbacks(r2, r3)
        Ld:
            return
    }

    public void setNavigationContentDescription(int r2) {
            r1 = this;
            if (r2 == 0) goto Lb
            android.content.Context r0 = r1.getContext()
            java.lang.CharSequence r0 = r0.getText(r2)
            goto Lc
        Lb:
            r0 = 0
        Lc:
            r1.setNavigationContentDescription(r0)
            return
    }

    public void setNavigationContentDescription(java.lang.CharSequence r2) {
            r1 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L9
            r1.ensureNavButtonView()
        L9:
            android.widget.ImageButton r0 = r1.mNavButtonView
            if (r0 == 0) goto L17
            android.widget.ImageButton r0 = r1.mNavButtonView
            r0.setContentDescription(r2)
            android.widget.ImageButton r0 = r1.mNavButtonView
            androidx.appcompat.widget.TooltipCompat.setTooltipText(r0, r2)
        L17:
            return
    }

    public void setNavigationIcon(int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            android.graphics.drawable.Drawable r0 = androidx.appcompat.content.res.AppCompatResources.getDrawable(r0, r2)
            r1.setNavigationIcon(r0)
            return
    }

    public void setNavigationIcon(android.graphics.drawable.Drawable r3) {
            r2 = this;
            if (r3 == 0) goto L14
            r2.ensureNavButtonView()
            android.widget.ImageButton r0 = r2.mNavButtonView
            boolean r0 = r2.isChildOrHidden(r0)
            if (r0 != 0) goto L2c
            android.widget.ImageButton r0 = r2.mNavButtonView
            r1 = 1
            r2.addSystemView(r0, r1)
            goto L2c
        L14:
            android.widget.ImageButton r0 = r2.mNavButtonView
            if (r0 == 0) goto L2c
            android.widget.ImageButton r0 = r2.mNavButtonView
            boolean r0 = r2.isChildOrHidden(r0)
            if (r0 == 0) goto L2c
            android.widget.ImageButton r0 = r2.mNavButtonView
            r2.removeView(r0)
            java.util.ArrayList<android.view.View> r0 = r2.mHiddenViews
            android.widget.ImageButton r1 = r2.mNavButtonView
            r0.remove(r1)
        L2c:
            android.widget.ImageButton r0 = r2.mNavButtonView
            if (r0 == 0) goto L35
            android.widget.ImageButton r0 = r2.mNavButtonView
            r0.setImageDrawable(r3)
        L35:
            return
    }

    public void setNavigationOnClickListener(android.view.View.OnClickListener r2) {
            r1 = this;
            r1.ensureNavButtonView()
            android.widget.ImageButton r0 = r1.mNavButtonView
            r0.setOnClickListener(r2)
            return
    }

    public void setOnMenuItemClickListener(androidx.appcompat.widget.Toolbar.OnMenuItemClickListener r1) {
            r0 = this;
            r0.mOnMenuItemClickListener = r1
            return
    }

    public void setOverflowIcon(android.graphics.drawable.Drawable r2) {
            r1 = this;
            r1.ensureMenu()
            androidx.appcompat.widget.ActionMenuView r0 = r1.mMenuView
            r0.setOverflowIcon(r2)
            return
    }

    public void setPopupTheme(int r3) {
            r2 = this;
            int r0 = r2.mPopupTheme
            if (r0 == r3) goto L1a
            r2.mPopupTheme = r3
            if (r3 != 0) goto Lf
            android.content.Context r0 = r2.getContext()
            r2.mPopupContext = r0
            goto L1a
        Lf:
            android.view.ContextThemeWrapper r0 = new android.view.ContextThemeWrapper
            android.content.Context r1 = r2.getContext()
            r0.<init>(r1, r3)
            r2.mPopupContext = r0
        L1a:
            return
    }

    public void setSubtitle(int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            java.lang.CharSequence r0 = r0.getText(r2)
            r1.setSubtitle(r0)
            return
    }

    public void setSubtitle(java.lang.CharSequence r4) {
            r3 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L46
            android.widget.TextView r0 = r3.mSubtitleTextView
            if (r0 != 0) goto L37
            android.content.Context r0 = r3.getContext()
            androidx.appcompat.widget.AppCompatTextView r1 = new androidx.appcompat.widget.AppCompatTextView
            r1.<init>(r0)
            r3.mSubtitleTextView = r1
            android.widget.TextView r1 = r3.mSubtitleTextView
            r1.setSingleLine()
            android.widget.TextView r1 = r3.mSubtitleTextView
            android.text.TextUtils$TruncateAt r2 = android.text.TextUtils.TruncateAt.END
            r1.setEllipsize(r2)
            int r1 = r3.mSubtitleTextAppearance
            if (r1 == 0) goto L2c
            android.widget.TextView r1 = r3.mSubtitleTextView
            int r2 = r3.mSubtitleTextAppearance
            r1.setTextAppearance(r0, r2)
        L2c:
            android.content.res.ColorStateList r1 = r3.mSubtitleTextColor
            if (r1 == 0) goto L37
            android.widget.TextView r1 = r3.mSubtitleTextView
            android.content.res.ColorStateList r2 = r3.mSubtitleTextColor
            r1.setTextColor(r2)
        L37:
            android.widget.TextView r0 = r3.mSubtitleTextView
            boolean r0 = r3.isChildOrHidden(r0)
            if (r0 != 0) goto L5e
            android.widget.TextView r0 = r3.mSubtitleTextView
            r1 = 1
            r3.addSystemView(r0, r1)
            goto L5e
        L46:
            android.widget.TextView r0 = r3.mSubtitleTextView
            if (r0 == 0) goto L5e
            android.widget.TextView r0 = r3.mSubtitleTextView
            boolean r0 = r3.isChildOrHidden(r0)
            if (r0 == 0) goto L5e
            android.widget.TextView r0 = r3.mSubtitleTextView
            r3.removeView(r0)
            java.util.ArrayList<android.view.View> r0 = r3.mHiddenViews
            android.widget.TextView r1 = r3.mSubtitleTextView
            r0.remove(r1)
        L5e:
            android.widget.TextView r0 = r3.mSubtitleTextView
            if (r0 == 0) goto L67
            android.widget.TextView r0 = r3.mSubtitleTextView
            r0.setText(r4)
        L67:
            r3.mSubtitleText = r4
            return
    }

    public void setSubtitleTextAppearance(android.content.Context r2, int r3) {
            r1 = this;
            r1.mSubtitleTextAppearance = r3
            android.widget.TextView r0 = r1.mSubtitleTextView
            if (r0 == 0) goto Lb
            android.widget.TextView r0 = r1.mSubtitleTextView
            r0.setTextAppearance(r2, r3)
        Lb:
            return
    }

    public void setSubtitleTextColor(int r2) {
            r1 = this;
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r2)
            r1.setSubtitleTextColor(r0)
            return
    }

    public void setSubtitleTextColor(android.content.res.ColorStateList r2) {
            r1 = this;
            r1.mSubtitleTextColor = r2
            android.widget.TextView r0 = r1.mSubtitleTextView
            if (r0 == 0) goto Lb
            android.widget.TextView r0 = r1.mSubtitleTextView
            r0.setTextColor(r2)
        Lb:
            return
    }

    public void setTitle(int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            java.lang.CharSequence r0 = r0.getText(r2)
            r1.setTitle(r0)
            return
    }

    public void setTitle(java.lang.CharSequence r4) {
            r3 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L46
            android.widget.TextView r0 = r3.mTitleTextView
            if (r0 != 0) goto L37
            android.content.Context r0 = r3.getContext()
            androidx.appcompat.widget.AppCompatTextView r1 = new androidx.appcompat.widget.AppCompatTextView
            r1.<init>(r0)
            r3.mTitleTextView = r1
            android.widget.TextView r1 = r3.mTitleTextView
            r1.setSingleLine()
            android.widget.TextView r1 = r3.mTitleTextView
            android.text.TextUtils$TruncateAt r2 = android.text.TextUtils.TruncateAt.END
            r1.setEllipsize(r2)
            int r1 = r3.mTitleTextAppearance
            if (r1 == 0) goto L2c
            android.widget.TextView r1 = r3.mTitleTextView
            int r2 = r3.mTitleTextAppearance
            r1.setTextAppearance(r0, r2)
        L2c:
            android.content.res.ColorStateList r1 = r3.mTitleTextColor
            if (r1 == 0) goto L37
            android.widget.TextView r1 = r3.mTitleTextView
            android.content.res.ColorStateList r2 = r3.mTitleTextColor
            r1.setTextColor(r2)
        L37:
            android.widget.TextView r0 = r3.mTitleTextView
            boolean r0 = r3.isChildOrHidden(r0)
            if (r0 != 0) goto L5e
            android.widget.TextView r0 = r3.mTitleTextView
            r1 = 1
            r3.addSystemView(r0, r1)
            goto L5e
        L46:
            android.widget.TextView r0 = r3.mTitleTextView
            if (r0 == 0) goto L5e
            android.widget.TextView r0 = r3.mTitleTextView
            boolean r0 = r3.isChildOrHidden(r0)
            if (r0 == 0) goto L5e
            android.widget.TextView r0 = r3.mTitleTextView
            r3.removeView(r0)
            java.util.ArrayList<android.view.View> r0 = r3.mHiddenViews
            android.widget.TextView r1 = r3.mTitleTextView
            r0.remove(r1)
        L5e:
            android.widget.TextView r0 = r3.mTitleTextView
            if (r0 == 0) goto L67
            android.widget.TextView r0 = r3.mTitleTextView
            r0.setText(r4)
        L67:
            r3.mTitleText = r4
            return
    }

    public void setTitleMargin(int r1, int r2, int r3, int r4) {
            r0 = this;
            r0.mTitleMarginStart = r1
            r0.mTitleMarginTop = r2
            r0.mTitleMarginEnd = r3
            r0.mTitleMarginBottom = r4
            r0.requestLayout()
            return
    }

    public void setTitleMarginBottom(int r1) {
            r0 = this;
            r0.mTitleMarginBottom = r1
            r0.requestLayout()
            return
    }

    public void setTitleMarginEnd(int r1) {
            r0 = this;
            r0.mTitleMarginEnd = r1
            r0.requestLayout()
            return
    }

    public void setTitleMarginStart(int r1) {
            r0 = this;
            r0.mTitleMarginStart = r1
            r0.requestLayout()
            return
    }

    public void setTitleMarginTop(int r1) {
            r0 = this;
            r0.mTitleMarginTop = r1
            r0.requestLayout()
            return
    }

    public void setTitleTextAppearance(android.content.Context r2, int r3) {
            r1 = this;
            r1.mTitleTextAppearance = r3
            android.widget.TextView r0 = r1.mTitleTextView
            if (r0 == 0) goto Lb
            android.widget.TextView r0 = r1.mTitleTextView
            r0.setTextAppearance(r2, r3)
        Lb:
            return
    }

    public void setTitleTextColor(int r2) {
            r1 = this;
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r2)
            r1.setTitleTextColor(r0)
            return
    }

    public void setTitleTextColor(android.content.res.ColorStateList r2) {
            r1 = this;
            r1.mTitleTextColor = r2
            android.widget.TextView r0 = r1.mTitleTextView
            if (r0 == 0) goto Lb
            android.widget.TextView r0 = r1.mTitleTextView
            r0.setTextColor(r2)
        Lb:
            return
    }

    public boolean showOverflowMenu() {
            r1 = this;
            androidx.appcompat.widget.ActionMenuView r0 = r1.mMenuView
            if (r0 == 0) goto Le
            androidx.appcompat.widget.ActionMenuView r0 = r1.mMenuView
            boolean r0 = r0.showOverflowMenu()
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    void updateBackInvokedCallbackState() {
            r4 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 < r1) goto L4d
        L7:
            android.window.OnBackInvokedDispatcher r0 = androidx.appcompat.widget.Toolbar.Api33Impl.findOnBackInvokedDispatcher(r4)
            boolean r1 = r4.hasExpandedActionView()
            if (r1 == 0) goto L1f
            if (r0 == 0) goto L1f
            boolean r1 = r4.isAttachedToWindow()
            if (r1 == 0) goto L1f
            boolean r1 = r4.mBackInvokedCallbackEnabled
            if (r1 == 0) goto L1f
            r1 = 1
            goto L20
        L1f:
            r1 = 0
        L20:
            if (r1 == 0) goto L3d
            android.window.OnBackInvokedDispatcher r2 = r4.mBackInvokedDispatcher
            if (r2 != 0) goto L3d
            android.window.OnBackInvokedCallback r2 = r4.mBackInvokedCallback
            if (r2 != 0) goto L35
            androidx.appcompat.widget.Toolbar$$ExternalSyntheticLambda0 r2 = new androidx.appcompat.widget.Toolbar$$ExternalSyntheticLambda0
            r2.<init>(r4)
            android.window.OnBackInvokedCallback r2 = androidx.appcompat.widget.Toolbar.Api33Impl.newOnBackInvokedCallback(r2)
            r4.mBackInvokedCallback = r2
        L35:
            android.window.OnBackInvokedCallback r2 = r4.mBackInvokedCallback
            androidx.appcompat.widget.Toolbar.Api33Impl.tryRegisterOnBackInvokedCallback(r0, r2)
            r4.mBackInvokedDispatcher = r0
            goto L4d
        L3d:
            if (r1 != 0) goto L4d
            android.window.OnBackInvokedDispatcher r2 = r4.mBackInvokedDispatcher
            if (r2 == 0) goto L4d
            android.window.OnBackInvokedDispatcher r2 = r4.mBackInvokedDispatcher
            android.window.OnBackInvokedCallback r3 = r4.mBackInvokedCallback
            androidx.appcompat.widget.Toolbar.Api33Impl.tryUnregisterOnBackInvokedCallback(r2, r3)
            r2 = 0
            r4.mBackInvokedDispatcher = r2
        L4d:
            return
    }
}
