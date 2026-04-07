package androidx.appcompat.view.menu;

/* JADX INFO: loaded from: classes.dex */
public class ActionMenuItemView extends androidx.appcompat.widget.AppCompatTextView implements androidx.appcompat.view.menu.MenuView.ItemView, android.view.View.OnClickListener, androidx.appcompat.widget.ActionMenuView.ActionMenuChildView {
    private static final int MAX_ICON_SIZE = 32;
    private static final java.lang.String TAG = "ActionMenuItemView";
    private boolean mAllowTextWithIcon;
    private boolean mExpandedFormat;
    private androidx.appcompat.widget.ForwardingListener mForwardingListener;
    private android.graphics.drawable.Drawable mIcon;
    androidx.appcompat.view.menu.MenuItemImpl mItemData;
    androidx.appcompat.view.menu.MenuBuilder.ItemInvoker mItemInvoker;
    private int mMaxIconSize;
    private int mMinWidth;
    androidx.appcompat.view.menu.ActionMenuItemView.PopupCallback mPopupCallback;
    private int mSavedPaddingLeft;
    private java.lang.CharSequence mTitle;

    private class ActionMenuItemForwardingListener extends androidx.appcompat.widget.ForwardingListener {
        final /* synthetic */ androidx.appcompat.view.menu.ActionMenuItemView this$0;

        public ActionMenuItemForwardingListener(androidx.appcompat.view.menu.ActionMenuItemView r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r1)
                return
        }

        @Override // androidx.appcompat.widget.ForwardingListener
        public androidx.appcompat.view.menu.ShowableListMenu getPopup() {
                r1 = this;
                androidx.appcompat.view.menu.ActionMenuItemView r0 = r1.this$0
                androidx.appcompat.view.menu.ActionMenuItemView$PopupCallback r0 = r0.mPopupCallback
                if (r0 == 0) goto Lf
                androidx.appcompat.view.menu.ActionMenuItemView r0 = r1.this$0
                androidx.appcompat.view.menu.ActionMenuItemView$PopupCallback r0 = r0.mPopupCallback
                androidx.appcompat.view.menu.ShowableListMenu r0 = r0.getPopup()
                return r0
            Lf:
                r0 = 0
                return r0
        }

        @Override // androidx.appcompat.widget.ForwardingListener
        protected boolean onForwardingStarted() {
                r3 = this;
                androidx.appcompat.view.menu.ActionMenuItemView r0 = r3.this$0
                androidx.appcompat.view.menu.MenuBuilder$ItemInvoker r0 = r0.mItemInvoker
                r1 = 0
                if (r0 == 0) goto L23
                androidx.appcompat.view.menu.ActionMenuItemView r0 = r3.this$0
                androidx.appcompat.view.menu.MenuBuilder$ItemInvoker r0 = r0.mItemInvoker
                androidx.appcompat.view.menu.ActionMenuItemView r2 = r3.this$0
                androidx.appcompat.view.menu.MenuItemImpl r2 = r2.mItemData
                boolean r0 = r0.invokeItem(r2)
                if (r0 == 0) goto L23
                androidx.appcompat.view.menu.ShowableListMenu r0 = r3.getPopup()
                if (r0 == 0) goto L22
                boolean r2 = r0.isShowing()
                if (r2 == 0) goto L22
                r1 = 1
            L22:
                return r1
            L23:
                return r1
        }
    }

    public static abstract class PopupCallback {
        public PopupCallback() {
                r0 = this;
                r0.<init>()
                return
        }

        public abstract androidx.appcompat.view.menu.ShowableListMenu getPopup();
    }

    public ActionMenuItemView(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public ActionMenuItemView(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public ActionMenuItemView(android.content.Context r7, android.util.AttributeSet r8, int r9) {
            r6 = this;
            r6.<init>(r7, r8, r9)
            android.content.res.Resources r0 = r7.getResources()
            boolean r1 = r6.shouldAllowTextWithIcon()
            r6.mAllowTextWithIcon = r1
            int[] r1 = androidx.appcompat.R.styleable.ActionMenuItemView
            r2 = 0
            android.content.res.TypedArray r1 = r7.obtainStyledAttributes(r8, r1, r9, r2)
            int r3 = androidx.appcompat.R.styleable.ActionMenuItemView_android_minWidth
            int r3 = r1.getDimensionPixelSize(r3, r2)
            r6.mMinWidth = r3
            r1.recycle()
            android.util.DisplayMetrics r3 = r0.getDisplayMetrics()
            float r3 = r3.density
            r4 = 1107296256(0x42000000, float:32.0)
            float r4 = r4 * r3
            r5 = 1056964608(0x3f000000, float:0.5)
            float r4 = r4 + r5
            int r4 = (int) r4
            r6.mMaxIconSize = r4
            r6.setOnClickListener(r6)
            r4 = -1
            r6.mSavedPaddingLeft = r4
            r6.setSaveEnabled(r2)
            return
    }

    private boolean shouldAllowTextWithIcon() {
            r5 = this;
            android.content.Context r0 = r5.getContext()
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r1 = r0.screenWidthDp
            int r2 = r0.screenHeightDp
            r3 = 480(0x1e0, float:6.73E-43)
            if (r1 >= r3) goto L22
            r4 = 640(0x280, float:8.97E-43)
            if (r1 < r4) goto L1a
            if (r2 >= r3) goto L22
        L1a:
            int r3 = r0.orientation
            r4 = 2
            if (r3 != r4) goto L20
            goto L22
        L20:
            r3 = 0
            goto L23
        L22:
            r3 = 1
        L23:
            return r3
    }

    private void updateTextButtonVisibility() {
            r5 = this;
            java.lang.CharSequence r0 = r5.mTitle
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r1 = 1
            r0 = r0 ^ r1
            android.graphics.drawable.Drawable r2 = r5.mIcon
            if (r2 == 0) goto L1f
            androidx.appcompat.view.menu.MenuItemImpl r2 = r5.mItemData
            boolean r2 = r2.showsTextAsAction()
            if (r2 == 0) goto L1d
            boolean r2 = r5.mAllowTextWithIcon
            if (r2 != 0) goto L1c
            boolean r2 = r5.mExpandedFormat
            if (r2 == 0) goto L1d
        L1c:
            goto L1f
        L1d:
            r1 = 0
            goto L20
        L1f:
        L20:
            r0 = r0 & r1
            r1 = 0
            if (r0 == 0) goto L27
            java.lang.CharSequence r2 = r5.mTitle
            goto L28
        L27:
            r2 = r1
        L28:
            r5.setText(r2)
            androidx.appcompat.view.menu.MenuItemImpl r2 = r5.mItemData
            java.lang.CharSequence r2 = r2.getContentDescription()
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 == 0) goto L45
            if (r0 == 0) goto L3b
            r3 = r1
            goto L41
        L3b:
            androidx.appcompat.view.menu.MenuItemImpl r3 = r5.mItemData
            java.lang.CharSequence r3 = r3.getTitle()
        L41:
            r5.setContentDescription(r3)
            goto L48
        L45:
            r5.setContentDescription(r2)
        L48:
            androidx.appcompat.view.menu.MenuItemImpl r3 = r5.mItemData
            java.lang.CharSequence r3 = r3.getTooltipText()
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 == 0) goto L61
            if (r0 == 0) goto L57
            goto L5d
        L57:
            androidx.appcompat.view.menu.MenuItemImpl r1 = r5.mItemData
            java.lang.CharSequence r1 = r1.getTitle()
        L5d:
            androidx.appcompat.widget.TooltipCompat.setTooltipText(r5, r1)
            goto L64
        L61:
            androidx.appcompat.widget.TooltipCompat.setTooltipText(r5, r3)
        L64:
            return
    }

    @Override // android.widget.TextView, android.view.View
    public java.lang.CharSequence getAccessibilityClassName() {
            r1 = this;
            java.lang.Class<android.widget.Button> r0 = android.widget.Button.class
            java.lang.String r0 = r0.getName()
            return r0
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public androidx.appcompat.view.menu.MenuItemImpl getItemData() {
            r1 = this;
            androidx.appcompat.view.menu.MenuItemImpl r0 = r1.mItemData
            return r0
    }

    public boolean hasText() {
            r1 = this;
            java.lang.CharSequence r0 = r1.getText()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r0 = r0 ^ 1
            return r0
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void initialize(androidx.appcompat.view.menu.MenuItemImpl r2, int r3) {
            r1 = this;
            r1.mItemData = r2
            android.graphics.drawable.Drawable r0 = r2.getIcon()
            r1.setIcon(r0)
            java.lang.CharSequence r0 = r2.getTitleForItemView(r1)
            r1.setTitle(r0)
            int r0 = r2.getItemId()
            r1.setId(r0)
            boolean r0 = r2.isVisible()
            if (r0 == 0) goto L1f
            r0 = 0
            goto L21
        L1f:
            r0 = 8
        L21:
            r1.setVisibility(r0)
            boolean r0 = r2.isEnabled()
            r1.setEnabled(r0)
            boolean r0 = r2.hasSubMenu()
            if (r0 == 0) goto L3c
            androidx.appcompat.widget.ForwardingListener r0 = r1.mForwardingListener
            if (r0 != 0) goto L3c
            androidx.appcompat.view.menu.ActionMenuItemView$ActionMenuItemForwardingListener r0 = new androidx.appcompat.view.menu.ActionMenuItemView$ActionMenuItemForwardingListener
            r0.<init>(r1)
            r1.mForwardingListener = r0
        L3c:
            return
    }

    @Override // androidx.appcompat.widget.ActionMenuView.ActionMenuChildView
    public boolean needsDividerAfter() {
            r1 = this;
            boolean r0 = r1.hasText()
            return r0
    }

    @Override // androidx.appcompat.widget.ActionMenuView.ActionMenuChildView
    public boolean needsDividerBefore() {
            r1 = this;
            boolean r0 = r1.hasText()
            if (r0 == 0) goto L10
            androidx.appcompat.view.menu.MenuItemImpl r0 = r1.mItemData
            android.graphics.drawable.Drawable r0 = r0.getIcon()
            if (r0 != 0) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            return r0
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View r3) {
            r2 = this;
            androidx.appcompat.view.menu.MenuBuilder$ItemInvoker r0 = r2.mItemInvoker
            if (r0 == 0) goto Lb
            androidx.appcompat.view.menu.MenuBuilder$ItemInvoker r0 = r2.mItemInvoker
            androidx.appcompat.view.menu.MenuItemImpl r1 = r2.mItemData
            r0.invokeItem(r1)
        Lb:
            return
    }

    @Override // android.widget.TextView, android.view.View
    public void onConfigurationChanged(android.content.res.Configuration r2) {
            r1 = this;
            super.onConfigurationChanged(r2)
            boolean r0 = r1.shouldAllowTextWithIcon()
            r1.mAllowTextWithIcon = r0
            r1.updateTextButtonVisibility()
            return
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    protected void onMeasure(int r12, int r13) {
            r11 = this;
            boolean r0 = r11.hasText()
            if (r0 == 0) goto L1b
            int r1 = r11.mSavedPaddingLeft
            if (r1 < 0) goto L1b
            int r1 = r11.mSavedPaddingLeft
            int r2 = r11.getPaddingTop()
            int r3 = r11.getPaddingRight()
            int r4 = r11.getPaddingBottom()
            super.setPadding(r1, r2, r3, r4)
        L1b:
            super.onMeasure(r12, r13)
            int r1 = android.view.View.MeasureSpec.getMode(r12)
            int r2 = android.view.View.MeasureSpec.getSize(r12)
            int r3 = r11.getMeasuredWidth()
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 != r4) goto L35
            int r4 = r11.mMinWidth
            int r4 = java.lang.Math.min(r2, r4)
            goto L37
        L35:
            int r4 = r11.mMinWidth
        L37:
            r5 = 1073741824(0x40000000, float:2.0)
            if (r1 == r5) goto L49
            int r6 = r11.mMinWidth
            if (r6 <= 0) goto L49
            if (r3 >= r4) goto L49
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r5)
            super.onMeasure(r5, r13)
        L49:
            if (r0 != 0) goto L70
            android.graphics.drawable.Drawable r5 = r11.mIcon
            if (r5 == 0) goto L70
            int r5 = r11.getMeasuredWidth()
            android.graphics.drawable.Drawable r6 = r11.mIcon
            android.graphics.Rect r6 = r6.getBounds()
            int r6 = r6.width()
            int r7 = r5 - r6
            int r7 = r7 / 2
            int r8 = r11.getPaddingTop()
            int r9 = r11.getPaddingRight()
            int r10 = r11.getPaddingBottom()
            super.setPadding(r7, r8, r9, r10)
        L70:
            return
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(android.os.Parcelable r2) {
            r1 = this;
            r0 = 0
            super.onRestoreInstanceState(r0)
            return
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(android.view.MotionEvent r2) {
            r1 = this;
            androidx.appcompat.view.menu.MenuItemImpl r0 = r1.mItemData
            boolean r0 = r0.hasSubMenu()
            if (r0 == 0) goto L16
            androidx.appcompat.widget.ForwardingListener r0 = r1.mForwardingListener
            if (r0 == 0) goto L16
            androidx.appcompat.widget.ForwardingListener r0 = r1.mForwardingListener
            boolean r0 = r0.onTouch(r1, r2)
            if (r0 == 0) goto L16
            r0 = 1
            return r0
        L16:
            boolean r0 = super.onTouchEvent(r2)
            return r0
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public boolean prefersCondensedTitle() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setCheckable(boolean r1) {
            r0 = this;
            return
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setChecked(boolean r1) {
            r0 = this;
            return
    }

    public void setExpandedFormat(boolean r2) {
            r1 = this;
            boolean r0 = r1.mExpandedFormat
            if (r0 == r2) goto Lf
            r1.mExpandedFormat = r2
            androidx.appcompat.view.menu.MenuItemImpl r0 = r1.mItemData
            if (r0 == 0) goto Lf
            androidx.appcompat.view.menu.MenuItemImpl r0 = r1.mItemData
            r0.actionFormatChanged()
        Lf:
            return
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setIcon(android.graphics.drawable.Drawable r5) {
            r4 = this;
            r4.mIcon = r5
            if (r5 == 0) goto L2c
            int r0 = r5.getIntrinsicWidth()
            int r1 = r5.getIntrinsicHeight()
            int r2 = r4.mMaxIconSize
            if (r0 <= r2) goto L1a
            int r2 = r4.mMaxIconSize
            float r2 = (float) r2
            float r3 = (float) r0
            float r2 = r2 / r3
            int r0 = r4.mMaxIconSize
            float r3 = (float) r1
            float r3 = r3 * r2
            int r1 = (int) r3
        L1a:
            int r2 = r4.mMaxIconSize
            if (r1 <= r2) goto L28
            int r2 = r4.mMaxIconSize
            float r2 = (float) r2
            float r3 = (float) r1
            float r2 = r2 / r3
            int r1 = r4.mMaxIconSize
            float r3 = (float) r0
            float r3 = r3 * r2
            int r0 = (int) r3
        L28:
            r2 = 0
            r5.setBounds(r2, r2, r0, r1)
        L2c:
            r0 = 0
            r4.setCompoundDrawables(r5, r0, r0, r0)
            r4.updateTextButtonVisibility()
            return
    }

    public void setItemInvoker(androidx.appcompat.view.menu.MenuBuilder.ItemInvoker r1) {
            r0 = this;
            r0.mItemInvoker = r1
            return
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int r1, int r2, int r3, int r4) {
            r0 = this;
            r0.mSavedPaddingLeft = r1
            super.setPadding(r1, r2, r3, r4)
            return
    }

    public void setPopupCallback(androidx.appcompat.view.menu.ActionMenuItemView.PopupCallback r1) {
            r0 = this;
            r0.mPopupCallback = r1
            return
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setShortcut(boolean r1, char r2) {
            r0 = this;
            return
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setTitle(java.lang.CharSequence r1) {
            r0 = this;
            r0.mTitle = r1
            r0.updateTextButtonVisibility()
            return
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public boolean showsIcon() {
            r1 = this;
            r0 = 1
            return r0
    }
}
