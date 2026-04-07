package androidx.appcompat.view.menu;

/* JADX INFO: loaded from: classes.dex */
public class ListMenuItemView extends android.widget.LinearLayout implements androidx.appcompat.view.menu.MenuView.ItemView, android.widget.AbsListView.SelectionBoundsAdjuster {
    private static final java.lang.String TAG = "ListMenuItemView";
    private android.graphics.drawable.Drawable mBackground;
    private android.widget.CheckBox mCheckBox;
    private android.widget.LinearLayout mContent;
    private boolean mForceShowIcon;
    private android.widget.ImageView mGroupDivider;
    private boolean mHasListDivider;
    private android.widget.ImageView mIconView;
    private android.view.LayoutInflater mInflater;
    private androidx.appcompat.view.menu.MenuItemImpl mItemData;
    private boolean mPreserveIconSpacing;
    private android.widget.RadioButton mRadioButton;
    private android.widget.TextView mShortcutView;
    private android.graphics.drawable.Drawable mSubMenuArrow;
    private android.widget.ImageView mSubMenuArrowView;
    private int mTextAppearance;
    private android.content.Context mTextAppearanceContext;
    private android.widget.TextView mTitleView;

    public ListMenuItemView(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            int r0 = androidx.appcompat.R.attr.listMenuViewStyle
            r1.<init>(r2, r3, r0)
            return
    }

    public ListMenuItemView(android.content.Context r7, android.util.AttributeSet r8, int r9) {
            r6 = this;
            r6.<init>(r7, r8)
            android.content.Context r0 = r6.getContext()
            int[] r1 = androidx.appcompat.R.styleable.MenuView
            r2 = 0
            androidx.appcompat.widget.TintTypedArray r0 = androidx.appcompat.widget.TintTypedArray.obtainStyledAttributes(r0, r8, r1, r9, r2)
            int r1 = androidx.appcompat.R.styleable.MenuView_android_itemBackground
            android.graphics.drawable.Drawable r1 = r0.getDrawable(r1)
            r6.mBackground = r1
            int r1 = androidx.appcompat.R.styleable.MenuView_android_itemTextAppearance
            r3 = -1
            int r1 = r0.getResourceId(r1, r3)
            r6.mTextAppearance = r1
            int r1 = androidx.appcompat.R.styleable.MenuView_preserveIconSpacing
            boolean r1 = r0.getBoolean(r1, r2)
            r6.mPreserveIconSpacing = r1
            r6.mTextAppearanceContext = r7
            int r1 = androidx.appcompat.R.styleable.MenuView_subMenuArrow
            android.graphics.drawable.Drawable r1 = r0.getDrawable(r1)
            r6.mSubMenuArrow = r1
            android.content.res.Resources$Theme r1 = r7.getTheme()
            r3 = 16843049(0x1010129, float:2.369439E-38)
            int[] r3 = new int[]{r3}
            int r4 = androidx.appcompat.R.attr.dropDownListViewStyle
            r5 = 0
            android.content.res.TypedArray r1 = r1.obtainStyledAttributes(r5, r3, r4, r2)
            boolean r2 = r1.hasValue(r2)
            r6.mHasListDivider = r2
            r0.recycle()
            r1.recycle()
            return
    }

    private void addContentView(android.view.View r2) {
            r1 = this;
            r0 = -1
            r1.addContentView(r2, r0)
            return
    }

    private void addContentView(android.view.View r2, int r3) {
            r1 = this;
            android.widget.LinearLayout r0 = r1.mContent
            if (r0 == 0) goto La
            android.widget.LinearLayout r0 = r1.mContent
            r0.addView(r2, r3)
            goto Ld
        La:
            r1.addView(r2, r3)
        Ld:
            return
    }

    private android.view.LayoutInflater getInflater() {
            r1 = this;
            android.view.LayoutInflater r0 = r1.mInflater
            if (r0 != 0) goto Le
            android.content.Context r0 = r1.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            r1.mInflater = r0
        Le:
            android.view.LayoutInflater r0 = r1.mInflater
            return r0
    }

    private void insertCheckBox() {
            r3 = this;
            android.view.LayoutInflater r0 = r3.getInflater()
            int r1 = androidx.appcompat.R.layout.abc_list_menu_item_checkbox
            r2 = 0
            android.view.View r1 = r0.inflate(r1, r3, r2)
            android.widget.CheckBox r1 = (android.widget.CheckBox) r1
            r3.mCheckBox = r1
            android.widget.CheckBox r1 = r3.mCheckBox
            r3.addContentView(r1)
            return
    }

    private void insertIconView() {
            r3 = this;
            android.view.LayoutInflater r0 = r3.getInflater()
            int r1 = androidx.appcompat.R.layout.abc_list_menu_item_icon
            r2 = 0
            android.view.View r1 = r0.inflate(r1, r3, r2)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r3.mIconView = r1
            android.widget.ImageView r1 = r3.mIconView
            r3.addContentView(r1, r2)
            return
    }

    private void insertRadioButton() {
            r3 = this;
            android.view.LayoutInflater r0 = r3.getInflater()
            int r1 = androidx.appcompat.R.layout.abc_list_menu_item_radio
            r2 = 0
            android.view.View r1 = r0.inflate(r1, r3, r2)
            android.widget.RadioButton r1 = (android.widget.RadioButton) r1
            r3.mRadioButton = r1
            android.widget.RadioButton r1 = r3.mRadioButton
            r3.addContentView(r1)
            return
    }

    private void setSubMenuArrowVisible(boolean r3) {
            r2 = this;
            android.widget.ImageView r0 = r2.mSubMenuArrowView
            if (r0 == 0) goto Lf
            android.widget.ImageView r0 = r2.mSubMenuArrowView
            if (r3 == 0) goto La
            r1 = 0
            goto Lc
        La:
            r1 = 8
        Lc:
            r0.setVisibility(r1)
        Lf:
            return
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public void adjustListItemSelectionBounds(android.graphics.Rect r5) {
            r4 = this;
            android.widget.ImageView r0 = r4.mGroupDivider
            if (r0 == 0) goto L25
            android.widget.ImageView r0 = r4.mGroupDivider
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L25
            android.widget.ImageView r0 = r4.mGroupDivider
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r0 = (android.widget.LinearLayout.LayoutParams) r0
            int r1 = r5.top
            android.widget.ImageView r2 = r4.mGroupDivider
            int r2 = r2.getHeight()
            int r3 = r0.topMargin
            int r2 = r2 + r3
            int r3 = r0.bottomMargin
            int r2 = r2 + r3
            int r1 = r1 + r2
            r5.top = r1
        L25:
            return
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public androidx.appcompat.view.menu.MenuItemImpl getItemData() {
            r1 = this;
            androidx.appcompat.view.menu.MenuItemImpl r0 = r1.mItemData
            return r0
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void initialize(androidx.appcompat.view.menu.MenuItemImpl r3, int r4) {
            r2 = this;
            r2.mItemData = r3
            boolean r0 = r3.isVisible()
            if (r0 == 0) goto La
            r0 = 0
            goto Lc
        La:
            r0 = 8
        Lc:
            r2.setVisibility(r0)
            java.lang.CharSequence r0 = r3.getTitleForItemView(r2)
            r2.setTitle(r0)
            boolean r0 = r3.isCheckable()
            r2.setCheckable(r0)
            boolean r0 = r3.shouldShowShortcut()
            char r1 = r3.getShortcut()
            r2.setShortcut(r0, r1)
            android.graphics.drawable.Drawable r0 = r3.getIcon()
            r2.setIcon(r0)
            boolean r0 = r3.isEnabled()
            r2.setEnabled(r0)
            boolean r0 = r3.hasSubMenu()
            r2.setSubMenuArrowVisible(r0)
            java.lang.CharSequence r0 = r3.getContentDescription()
            r2.setContentDescription(r0)
            return
    }

    @Override // android.view.View
    protected void onFinishInflate() {
            r3 = this;
            super.onFinishInflate()
            android.graphics.drawable.Drawable r0 = r3.mBackground
            r3.setBackground(r0)
            int r0 = androidx.appcompat.R.id.title
            android.view.View r0 = r3.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r3.mTitleView = r0
            int r0 = r3.mTextAppearance
            r1 = -1
            if (r0 == r1) goto L20
            android.widget.TextView r0 = r3.mTitleView
            android.content.Context r1 = r3.mTextAppearanceContext
            int r2 = r3.mTextAppearance
            r0.setTextAppearance(r1, r2)
        L20:
            int r0 = androidx.appcompat.R.id.shortcut
            android.view.View r0 = r3.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r3.mShortcutView = r0
            int r0 = androidx.appcompat.R.id.submenuarrow
            android.view.View r0 = r3.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r3.mSubMenuArrowView = r0
            android.widget.ImageView r0 = r3.mSubMenuArrowView
            if (r0 == 0) goto L3f
            android.widget.ImageView r0 = r3.mSubMenuArrowView
            android.graphics.drawable.Drawable r1 = r3.mSubMenuArrow
            r0.setImageDrawable(r1)
        L3f:
            int r0 = androidx.appcompat.R.id.group_divider
            android.view.View r0 = r3.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r3.mGroupDivider = r0
            int r0 = androidx.appcompat.R.id.content
            android.view.View r0 = r3.findViewById(r0)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r3.mContent = r0
            return
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int r4, int r5) {
            r3 = this;
            android.widget.ImageView r0 = r3.mIconView
            if (r0 == 0) goto L20
            boolean r0 = r3.mPreserveIconSpacing
            if (r0 == 0) goto L20
            android.view.ViewGroup$LayoutParams r0 = r3.getLayoutParams()
            android.widget.ImageView r1 = r3.mIconView
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r1 = (android.widget.LinearLayout.LayoutParams) r1
            int r2 = r0.height
            if (r2 <= 0) goto L20
            int r2 = r1.width
            if (r2 > 0) goto L20
            int r2 = r0.height
            r1.width = r2
        L20:
            super.onMeasure(r4, r5)
            return
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public boolean prefersCondensedTitle() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setCheckable(boolean r5) {
            r4 = this;
            if (r5 != 0) goto Lb
            android.widget.RadioButton r0 = r4.mRadioButton
            if (r0 != 0) goto Lb
            android.widget.CheckBox r0 = r4.mCheckBox
            if (r0 != 0) goto Lb
            return
        Lb:
            androidx.appcompat.view.menu.MenuItemImpl r0 = r4.mItemData
            boolean r0 = r0.isExclusiveCheckable()
            if (r0 == 0) goto L1f
            android.widget.RadioButton r0 = r4.mRadioButton
            if (r0 != 0) goto L1a
            r4.insertRadioButton()
        L1a:
            android.widget.RadioButton r0 = r4.mRadioButton
            android.widget.CheckBox r1 = r4.mCheckBox
            goto L2a
        L1f:
            android.widget.CheckBox r0 = r4.mCheckBox
            if (r0 != 0) goto L26
            r4.insertCheckBox()
        L26:
            android.widget.CheckBox r0 = r4.mCheckBox
            android.widget.RadioButton r1 = r4.mRadioButton
        L2a:
            r2 = 8
            if (r5 == 0) goto L4d
            androidx.appcompat.view.menu.MenuItemImpl r3 = r4.mItemData
            boolean r3 = r3.isChecked()
            r0.setChecked(r3)
            int r3 = r0.getVisibility()
            if (r3 == 0) goto L41
            r3 = 0
            r0.setVisibility(r3)
        L41:
            if (r1 == 0) goto L5f
            int r3 = r1.getVisibility()
            if (r3 == r2) goto L5f
            r1.setVisibility(r2)
            goto L5f
        L4d:
            android.widget.CheckBox r3 = r4.mCheckBox
            if (r3 == 0) goto L56
            android.widget.CheckBox r3 = r4.mCheckBox
            r3.setVisibility(r2)
        L56:
            android.widget.RadioButton r3 = r4.mRadioButton
            if (r3 == 0) goto L5f
            android.widget.RadioButton r3 = r4.mRadioButton
            r3.setVisibility(r2)
        L5f:
            return
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setChecked(boolean r2) {
            r1 = this;
            androidx.appcompat.view.menu.MenuItemImpl r0 = r1.mItemData
            boolean r0 = r0.isExclusiveCheckable()
            if (r0 == 0) goto L12
            android.widget.RadioButton r0 = r1.mRadioButton
            if (r0 != 0) goto Lf
            r1.insertRadioButton()
        Lf:
            android.widget.RadioButton r0 = r1.mRadioButton
            goto L1b
        L12:
            android.widget.CheckBox r0 = r1.mCheckBox
            if (r0 != 0) goto L19
            r1.insertCheckBox()
        L19:
            android.widget.CheckBox r0 = r1.mCheckBox
        L1b:
            r0.setChecked(r2)
            return
    }

    public void setForceShowIcon(boolean r1) {
            r0 = this;
            r0.mForceShowIcon = r1
            r0.mPreserveIconSpacing = r1
            return
    }

    public void setGroupDividerEnabled(boolean r3) {
            r2 = this;
            android.widget.ImageView r0 = r2.mGroupDivider
            if (r0 == 0) goto L13
            android.widget.ImageView r0 = r2.mGroupDivider
            boolean r1 = r2.mHasListDivider
            if (r1 != 0) goto Le
            if (r3 == 0) goto Le
            r1 = 0
            goto L10
        Le:
            r1 = 8
        L10:
            r0.setVisibility(r1)
        L13:
            return
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setIcon(android.graphics.drawable.Drawable r5) {
            r4 = this;
            androidx.appcompat.view.menu.MenuItemImpl r0 = r4.mItemData
            boolean r0 = r0.shouldShowIcon()
            r1 = 0
            if (r0 != 0) goto L10
            boolean r0 = r4.mForceShowIcon
            if (r0 == 0) goto Le
            goto L10
        Le:
            r0 = r1
            goto L11
        L10:
            r0 = 1
        L11:
            if (r0 != 0) goto L18
            boolean r2 = r4.mPreserveIconSpacing
            if (r2 != 0) goto L18
            return
        L18:
            android.widget.ImageView r2 = r4.mIconView
            if (r2 != 0) goto L23
            if (r5 != 0) goto L23
            boolean r2 = r4.mPreserveIconSpacing
            if (r2 != 0) goto L23
            return
        L23:
            android.widget.ImageView r2 = r4.mIconView
            if (r2 != 0) goto L2a
            r4.insertIconView()
        L2a:
            if (r5 != 0) goto L39
            boolean r2 = r4.mPreserveIconSpacing
            if (r2 == 0) goto L31
            goto L39
        L31:
            android.widget.ImageView r1 = r4.mIconView
            r2 = 8
            r1.setVisibility(r2)
            goto L50
        L39:
            android.widget.ImageView r2 = r4.mIconView
            if (r0 == 0) goto L3f
            r3 = r5
            goto L40
        L3f:
            r3 = 0
        L40:
            r2.setImageDrawable(r3)
            android.widget.ImageView r2 = r4.mIconView
            int r2 = r2.getVisibility()
            if (r2 == 0) goto L50
            android.widget.ImageView r2 = r4.mIconView
            r2.setVisibility(r1)
        L50:
            return
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setShortcut(boolean r4, char r5) {
            r3 = this;
            if (r4 == 0) goto Lc
            androidx.appcompat.view.menu.MenuItemImpl r0 = r3.mItemData
            boolean r0 = r0.shouldShowShortcut()
            if (r0 == 0) goto Lc
            r0 = 0
            goto Le
        Lc:
            r0 = 8
        Le:
            if (r0 != 0) goto L1b
            android.widget.TextView r1 = r3.mShortcutView
            androidx.appcompat.view.menu.MenuItemImpl r2 = r3.mItemData
            java.lang.String r2 = r2.getShortcutLabel()
            r1.setText(r2)
        L1b:
            android.widget.TextView r1 = r3.mShortcutView
            int r1 = r1.getVisibility()
            if (r1 == r0) goto L28
            android.widget.TextView r1 = r3.mShortcutView
            r1.setVisibility(r0)
        L28:
            return
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setTitle(java.lang.CharSequence r3) {
            r2 = this;
            if (r3 == 0) goto L16
            android.widget.TextView r0 = r2.mTitleView
            r0.setText(r3)
            android.widget.TextView r0 = r2.mTitleView
            int r0 = r0.getVisibility()
            if (r0 == 0) goto L25
            android.widget.TextView r0 = r2.mTitleView
            r1 = 0
            r0.setVisibility(r1)
            goto L25
        L16:
            android.widget.TextView r0 = r2.mTitleView
            int r0 = r0.getVisibility()
            r1 = 8
            if (r0 == r1) goto L25
            android.widget.TextView r0 = r2.mTitleView
            r0.setVisibility(r1)
        L25:
            return
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public boolean showsIcon() {
            r1 = this;
            boolean r0 = r1.mForceShowIcon
            return r0
    }
}
