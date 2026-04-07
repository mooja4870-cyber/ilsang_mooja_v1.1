package androidx.appcompat.view;

/* JADX INFO: loaded from: classes.dex */
public class SupportMenuInflater extends android.view.MenuInflater {
    static final java.lang.Class<?>[] ACTION_PROVIDER_CONSTRUCTOR_SIGNATURE = null;
    static final java.lang.Class<?>[] ACTION_VIEW_CONSTRUCTOR_SIGNATURE = null;
    static final java.lang.String LOG_TAG = "SupportMenuInflater";
    static final int NO_ID = 0;
    private static final java.lang.String XML_GROUP = "group";
    private static final java.lang.String XML_ITEM = "item";
    private static final java.lang.String XML_MENU = "menu";
    final java.lang.Object[] mActionProviderConstructorArguments;
    final java.lang.Object[] mActionViewConstructorArguments;
    android.content.Context mContext;
    private java.lang.Object mRealOwner;

    private static class InflatedOnMenuItemClickListener implements android.view.MenuItem.OnMenuItemClickListener {
        private static final java.lang.Class<?>[] PARAM_TYPES = null;
        private java.lang.reflect.Method mMethod;
        private java.lang.Object mRealOwner;

        static {
                r0 = 1
                java.lang.Class[] r0 = new java.lang.Class[r0]
                r1 = 0
                java.lang.Class<android.view.MenuItem> r2 = android.view.MenuItem.class
                r0[r1] = r2
                androidx.appcompat.view.SupportMenuInflater.InflatedOnMenuItemClickListener.PARAM_TYPES = r0
                return
        }

        public InflatedOnMenuItemClickListener(java.lang.Object r6, java.lang.String r7) {
                r5 = this;
                r5.<init>()
                r5.mRealOwner = r6
                java.lang.Class r0 = r6.getClass()
                java.lang.Class<?>[] r1 = androidx.appcompat.view.SupportMenuInflater.InflatedOnMenuItemClickListener.PARAM_TYPES     // Catch: java.lang.Exception -> L13
                java.lang.reflect.Method r1 = r0.getMethod(r7, r1)     // Catch: java.lang.Exception -> L13
                r5.mMethod = r1     // Catch: java.lang.Exception -> L13
                return
            L13:
                r1 = move-exception
                android.view.InflateException r2 = new android.view.InflateException
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "Couldn't resolve menu item onClick handler "
                java.lang.StringBuilder r3 = r3.append(r4)
                java.lang.StringBuilder r3 = r3.append(r7)
                java.lang.String r4 = " in class "
                java.lang.StringBuilder r3 = r3.append(r4)
                java.lang.String r4 = r0.getName()
                java.lang.StringBuilder r3 = r3.append(r4)
                java.lang.String r3 = r3.toString()
                r2.<init>(r3)
                r2.initCause(r1)
                throw r2
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(android.view.MenuItem r4) {
                r3 = this;
                java.lang.reflect.Method r0 = r3.mMethod     // Catch: java.lang.Exception -> L2a
                java.lang.Class r0 = r0.getReturnType()     // Catch: java.lang.Exception -> L2a
                java.lang.Class r1 = java.lang.Boolean.TYPE     // Catch: java.lang.Exception -> L2a
                if (r0 != r1) goto L1d
                java.lang.reflect.Method r0 = r3.mMethod     // Catch: java.lang.Exception -> L2a
                java.lang.Object r1 = r3.mRealOwner     // Catch: java.lang.Exception -> L2a
                java.lang.Object[] r2 = new java.lang.Object[]{r4}     // Catch: java.lang.Exception -> L2a
                java.lang.Object r0 = r0.invoke(r1, r2)     // Catch: java.lang.Exception -> L2a
                java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Exception -> L2a
                boolean r0 = r0.booleanValue()     // Catch: java.lang.Exception -> L2a
                return r0
            L1d:
                java.lang.reflect.Method r0 = r3.mMethod     // Catch: java.lang.Exception -> L2a
                java.lang.Object r1 = r3.mRealOwner     // Catch: java.lang.Exception -> L2a
                java.lang.Object[] r2 = new java.lang.Object[]{r4}     // Catch: java.lang.Exception -> L2a
                r0.invoke(r1, r2)     // Catch: java.lang.Exception -> L2a
                r0 = 1
                return r0
            L2a:
                r0 = move-exception
                java.lang.RuntimeException r1 = new java.lang.RuntimeException
                r1.<init>(r0)
                throw r1
        }
    }

    private class MenuState {
        private static final int defaultGroupId = 0;
        private static final int defaultItemCategory = 0;
        private static final int defaultItemCheckable = 0;
        private static final boolean defaultItemChecked = false;
        private static final boolean defaultItemEnabled = true;
        private static final int defaultItemId = 0;
        private static final int defaultItemOrder = 0;
        private static final boolean defaultItemVisible = true;
        private int groupCategory;
        private int groupCheckable;
        private boolean groupEnabled;
        private int groupId;
        private int groupOrder;
        private boolean groupVisible;
        androidx.core.view.ActionProvider itemActionProvider;
        private java.lang.String itemActionProviderClassName;
        private java.lang.String itemActionViewClassName;
        private int itemActionViewLayout;
        private boolean itemAdded;
        private int itemAlphabeticModifiers;
        private char itemAlphabeticShortcut;
        private int itemCategoryOrder;
        private int itemCheckable;
        private boolean itemChecked;
        private java.lang.CharSequence itemContentDescription;
        private boolean itemEnabled;
        private int itemIconResId;
        private android.content.res.ColorStateList itemIconTintList;
        private android.graphics.PorterDuff.Mode itemIconTintMode;
        private int itemId;
        private java.lang.String itemListenerMethodName;
        private int itemNumericModifiers;
        private char itemNumericShortcut;
        private int itemShowAsAction;
        private java.lang.CharSequence itemTitle;
        private java.lang.CharSequence itemTitleCondensed;
        private java.lang.CharSequence itemTooltipText;
        private boolean itemVisible;
        private android.view.Menu menu;
        final /* synthetic */ androidx.appcompat.view.SupportMenuInflater this$0;

        public MenuState(androidx.appcompat.view.SupportMenuInflater r1, android.view.Menu r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r1 = 0
                r0.itemIconTintList = r1
                r0.itemIconTintMode = r1
                r0.menu = r2
                r0.resetGroup()
                return
        }

        private char getShortcut(java.lang.String r2) {
                r1 = this;
                r0 = 0
                if (r2 != 0) goto L4
                return r0
            L4:
                char r0 = r2.charAt(r0)
                return r0
        }

        private <T> T newInstance(java.lang.String r4, java.lang.Class<?>[] r5, java.lang.Object[] r6) {
                r3 = this;
                androidx.appcompat.view.SupportMenuInflater r0 = r3.this$0     // Catch: java.lang.Exception -> L1a
                android.content.Context r0 = r0.mContext     // Catch: java.lang.Exception -> L1a
                java.lang.ClassLoader r0 = r0.getClassLoader()     // Catch: java.lang.Exception -> L1a
                r1 = 0
                java.lang.Class r0 = java.lang.Class.forName(r4, r1, r0)     // Catch: java.lang.Exception -> L1a
                java.lang.reflect.Constructor r1 = r0.getConstructor(r5)     // Catch: java.lang.Exception -> L1a
                r2 = 1
                r1.setAccessible(r2)     // Catch: java.lang.Exception -> L1a
                java.lang.Object r2 = r1.newInstance(r6)     // Catch: java.lang.Exception -> L1a
                return r2
            L1a:
                r0 = move-exception
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Cannot instantiate class: "
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.StringBuilder r1 = r1.append(r4)
                java.lang.String r1 = r1.toString()
                java.lang.String r2 = "SupportMenuInflater"
                android.util.Log.w(r2, r1, r0)
                r0 = 0
                return r0
        }

        private void setItem(android.view.MenuItem r5) {
                r4 = this;
                boolean r0 = r4.itemChecked
                android.view.MenuItem r0 = r5.setChecked(r0)
                boolean r1 = r4.itemVisible
                android.view.MenuItem r0 = r0.setVisible(r1)
                boolean r1 = r4.itemEnabled
                android.view.MenuItem r0 = r0.setEnabled(r1)
                int r1 = r4.itemCheckable
                r2 = 1
                if (r1 < r2) goto L19
                r1 = r2
                goto L1a
            L19:
                r1 = 0
            L1a:
                android.view.MenuItem r0 = r0.setCheckable(r1)
                java.lang.CharSequence r1 = r4.itemTitleCondensed
                android.view.MenuItem r0 = r0.setTitleCondensed(r1)
                int r1 = r4.itemIconResId
                r0.setIcon(r1)
                int r0 = r4.itemShowAsAction
                if (r0 < 0) goto L32
                int r0 = r4.itemShowAsAction
                r5.setShowAsAction(r0)
            L32:
                java.lang.String r0 = r4.itemListenerMethodName
                if (r0 == 0) goto L59
                androidx.appcompat.view.SupportMenuInflater r0 = r4.this$0
                android.content.Context r0 = r0.mContext
                boolean r0 = r0.isRestricted()
                if (r0 != 0) goto L51
                androidx.appcompat.view.SupportMenuInflater$InflatedOnMenuItemClickListener r0 = new androidx.appcompat.view.SupportMenuInflater$InflatedOnMenuItemClickListener
                androidx.appcompat.view.SupportMenuInflater r1 = r4.this$0
                java.lang.Object r1 = r1.getRealOwner()
                java.lang.String r3 = r4.itemListenerMethodName
                r0.<init>(r1, r3)
                r5.setOnMenuItemClickListener(r0)
                goto L59
            L51:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "The android:onClick attribute cannot be used within a restricted context"
                r0.<init>(r1)
                throw r0
            L59:
                int r0 = r4.itemCheckable
                r1 = 2
                if (r0 < r1) goto L73
                boolean r0 = r5 instanceof androidx.appcompat.view.menu.MenuItemImpl
                if (r0 == 0) goto L69
                r0 = r5
                androidx.appcompat.view.menu.MenuItemImpl r0 = (androidx.appcompat.view.menu.MenuItemImpl) r0
                r0.setExclusiveCheckable(r2)
                goto L73
            L69:
                boolean r0 = r5 instanceof androidx.appcompat.view.menu.MenuItemWrapperICS
                if (r0 == 0) goto L73
                r0 = r5
                androidx.appcompat.view.menu.MenuItemWrapperICS r0 = (androidx.appcompat.view.menu.MenuItemWrapperICS) r0
                r0.setExclusiveCheckable(r2)
            L73:
                r0 = 0
                java.lang.String r1 = r4.itemActionViewClassName
                if (r1 == 0) goto L8a
                java.lang.String r1 = r4.itemActionViewClassName
                java.lang.Class<?>[] r2 = androidx.appcompat.view.SupportMenuInflater.ACTION_VIEW_CONSTRUCTOR_SIGNATURE
                androidx.appcompat.view.SupportMenuInflater r3 = r4.this$0
                java.lang.Object[] r3 = r3.mActionViewConstructorArguments
                java.lang.Object r1 = r4.newInstance(r1, r2, r3)
                android.view.View r1 = (android.view.View) r1
                r5.setActionView(r1)
                r0 = 1
            L8a:
                int r1 = r4.itemActionViewLayout
                if (r1 <= 0) goto L9e
                if (r0 != 0) goto L97
                int r1 = r4.itemActionViewLayout
                r5.setActionView(r1)
                r0 = 1
                goto L9e
            L97:
                java.lang.String r1 = "SupportMenuInflater"
                java.lang.String r2 = "Ignoring attribute 'itemActionViewLayout'. Action view already specified."
                android.util.Log.w(r1, r2)
            L9e:
                androidx.core.view.ActionProvider r1 = r4.itemActionProvider
                if (r1 == 0) goto La7
                androidx.core.view.ActionProvider r1 = r4.itemActionProvider
                androidx.core.view.MenuItemCompat.setActionProvider(r5, r1)
            La7:
                java.lang.CharSequence r1 = r4.itemContentDescription
                androidx.core.view.MenuItemCompat.setContentDescription(r5, r1)
                java.lang.CharSequence r1 = r4.itemTooltipText
                androidx.core.view.MenuItemCompat.setTooltipText(r5, r1)
                char r1 = r4.itemAlphabeticShortcut
                int r2 = r4.itemAlphabeticModifiers
                androidx.core.view.MenuItemCompat.setAlphabeticShortcut(r5, r1, r2)
                char r1 = r4.itemNumericShortcut
                int r2 = r4.itemNumericModifiers
                androidx.core.view.MenuItemCompat.setNumericShortcut(r5, r1, r2)
                android.graphics.PorterDuff$Mode r1 = r4.itemIconTintMode
                if (r1 == 0) goto Lc8
                android.graphics.PorterDuff$Mode r1 = r4.itemIconTintMode
                androidx.core.view.MenuItemCompat.setIconTintMode(r5, r1)
            Lc8:
                android.content.res.ColorStateList r1 = r4.itemIconTintList
                if (r1 == 0) goto Ld1
                android.content.res.ColorStateList r1 = r4.itemIconTintList
                androidx.core.view.MenuItemCompat.setIconTintList(r5, r1)
            Ld1:
                return
        }

        public void addItem() {
                r5 = this;
                r0 = 1
                r5.itemAdded = r0
                android.view.Menu r0 = r5.menu
                int r1 = r5.groupId
                int r2 = r5.itemId
                int r3 = r5.itemCategoryOrder
                java.lang.CharSequence r4 = r5.itemTitle
                android.view.MenuItem r0 = r0.add(r1, r2, r3, r4)
                r5.setItem(r0)
                return
        }

        public android.view.SubMenu addSubMenuItem() {
                r5 = this;
                r0 = 1
                r5.itemAdded = r0
                android.view.Menu r0 = r5.menu
                int r1 = r5.groupId
                int r2 = r5.itemId
                int r3 = r5.itemCategoryOrder
                java.lang.CharSequence r4 = r5.itemTitle
                android.view.SubMenu r0 = r0.addSubMenu(r1, r2, r3, r4)
                android.view.MenuItem r1 = r0.getItem()
                r5.setItem(r1)
                return r0
        }

        public boolean hasAddedItem() {
                r1 = this;
                boolean r0 = r1.itemAdded
                return r0
        }

        public void readGroup(android.util.AttributeSet r4) {
                r3 = this;
                androidx.appcompat.view.SupportMenuInflater r0 = r3.this$0
                android.content.Context r0 = r0.mContext
                int[] r1 = androidx.appcompat.R.styleable.MenuGroup
                android.content.res.TypedArray r0 = r0.obtainStyledAttributes(r4, r1)
                int r1 = androidx.appcompat.R.styleable.MenuGroup_android_id
                r2 = 0
                int r1 = r0.getResourceId(r1, r2)
                r3.groupId = r1
                int r1 = androidx.appcompat.R.styleable.MenuGroup_android_menuCategory
                int r1 = r0.getInt(r1, r2)
                r3.groupCategory = r1
                int r1 = androidx.appcompat.R.styleable.MenuGroup_android_orderInCategory
                int r1 = r0.getInt(r1, r2)
                r3.groupOrder = r1
                int r1 = androidx.appcompat.R.styleable.MenuGroup_android_checkableBehavior
                int r1 = r0.getInt(r1, r2)
                r3.groupCheckable = r1
                int r1 = androidx.appcompat.R.styleable.MenuGroup_android_visible
                r2 = 1
                boolean r1 = r0.getBoolean(r1, r2)
                r3.groupVisible = r1
                int r1 = androidx.appcompat.R.styleable.MenuGroup_android_enabled
                boolean r1 = r0.getBoolean(r1, r2)
                r3.groupEnabled = r1
                r0.recycle()
                return
        }

        public void readItem(android.util.AttributeSet r11) {
                r10 = this;
                androidx.appcompat.view.SupportMenuInflater r0 = r10.this$0
                android.content.Context r0 = r0.mContext
                int[] r1 = androidx.appcompat.R.styleable.MenuItem
                androidx.appcompat.widget.TintTypedArray r0 = androidx.appcompat.widget.TintTypedArray.obtainStyledAttributes(r0, r11, r1)
                int r1 = androidx.appcompat.R.styleable.MenuItem_android_id
                r2 = 0
                int r1 = r0.getResourceId(r1, r2)
                r10.itemId = r1
                int r1 = androidx.appcompat.R.styleable.MenuItem_android_menuCategory
                int r3 = r10.groupCategory
                int r1 = r0.getInt(r1, r3)
                int r3 = androidx.appcompat.R.styleable.MenuItem_android_orderInCategory
                int r4 = r10.groupOrder
                int r3 = r0.getInt(r3, r4)
                r4 = -65536(0xffffffffffff0000, float:NaN)
                r4 = r4 & r1
                r5 = 65535(0xffff, float:9.1834E-41)
                r5 = r5 & r3
                r4 = r4 | r5
                r10.itemCategoryOrder = r4
                int r4 = androidx.appcompat.R.styleable.MenuItem_android_title
                java.lang.CharSequence r4 = r0.getText(r4)
                r10.itemTitle = r4
                int r4 = androidx.appcompat.R.styleable.MenuItem_android_titleCondensed
                java.lang.CharSequence r4 = r0.getText(r4)
                r10.itemTitleCondensed = r4
                int r4 = androidx.appcompat.R.styleable.MenuItem_android_icon
                int r4 = r0.getResourceId(r4, r2)
                r10.itemIconResId = r4
                int r4 = androidx.appcompat.R.styleable.MenuItem_android_alphabeticShortcut
                java.lang.String r4 = r0.getString(r4)
                char r4 = r10.getShortcut(r4)
                r10.itemAlphabeticShortcut = r4
                int r4 = androidx.appcompat.R.styleable.MenuItem_alphabeticModifiers
                r5 = 4096(0x1000, float:5.74E-42)
                int r4 = r0.getInt(r4, r5)
                r10.itemAlphabeticModifiers = r4
                int r4 = androidx.appcompat.R.styleable.MenuItem_android_numericShortcut
                java.lang.String r4 = r0.getString(r4)
                char r4 = r10.getShortcut(r4)
                r10.itemNumericShortcut = r4
                int r4 = androidx.appcompat.R.styleable.MenuItem_numericModifiers
                int r4 = r0.getInt(r4, r5)
                r10.itemNumericModifiers = r4
                int r4 = androidx.appcompat.R.styleable.MenuItem_android_checkable
                boolean r4 = r0.hasValue(r4)
                if (r4 == 0) goto L80
                int r4 = androidx.appcompat.R.styleable.MenuItem_android_checkable
                boolean r4 = r0.getBoolean(r4, r2)
                r10.itemCheckable = r4
                goto L84
            L80:
                int r4 = r10.groupCheckable
                r10.itemCheckable = r4
            L84:
                int r4 = androidx.appcompat.R.styleable.MenuItem_android_checked
                boolean r4 = r0.getBoolean(r4, r2)
                r10.itemChecked = r4
                int r4 = androidx.appcompat.R.styleable.MenuItem_android_visible
                boolean r5 = r10.groupVisible
                boolean r4 = r0.getBoolean(r4, r5)
                r10.itemVisible = r4
                int r4 = androidx.appcompat.R.styleable.MenuItem_android_enabled
                boolean r5 = r10.groupEnabled
                boolean r4 = r0.getBoolean(r4, r5)
                r10.itemEnabled = r4
                int r4 = androidx.appcompat.R.styleable.MenuItem_showAsAction
                r5 = -1
                int r4 = r0.getInt(r4, r5)
                r10.itemShowAsAction = r4
                int r4 = androidx.appcompat.R.styleable.MenuItem_android_onClick
                java.lang.String r4 = r0.getString(r4)
                r10.itemListenerMethodName = r4
                int r4 = androidx.appcompat.R.styleable.MenuItem_actionLayout
                int r4 = r0.getResourceId(r4, r2)
                r10.itemActionViewLayout = r4
                int r4 = androidx.appcompat.R.styleable.MenuItem_actionViewClass
                java.lang.String r4 = r0.getString(r4)
                r10.itemActionViewClassName = r4
                int r4 = androidx.appcompat.R.styleable.MenuItem_actionProviderClass
                java.lang.String r4 = r0.getString(r4)
                r10.itemActionProviderClassName = r4
                java.lang.String r4 = r10.itemActionProviderClassName
                if (r4 == 0) goto Lcf
                r4 = 1
                goto Ld0
            Lcf:
                r4 = r2
            Ld0:
                r6 = 0
                if (r4 == 0) goto Lec
                int r7 = r10.itemActionViewLayout
                if (r7 != 0) goto Lec
                java.lang.String r7 = r10.itemActionViewClassName
                if (r7 != 0) goto Lec
                java.lang.String r7 = r10.itemActionProviderClassName
                java.lang.Class<?>[] r8 = androidx.appcompat.view.SupportMenuInflater.ACTION_PROVIDER_CONSTRUCTOR_SIGNATURE
                androidx.appcompat.view.SupportMenuInflater r9 = r10.this$0
                java.lang.Object[] r9 = r9.mActionProviderConstructorArguments
                java.lang.Object r7 = r10.newInstance(r7, r8, r9)
                androidx.core.view.ActionProvider r7 = (androidx.core.view.ActionProvider) r7
                r10.itemActionProvider = r7
                goto Lf7
            Lec:
                if (r4 == 0) goto Lf5
                java.lang.String r7 = "SupportMenuInflater"
                java.lang.String r8 = "Ignoring attribute 'actionProviderClass'. Action view already specified."
                android.util.Log.w(r7, r8)
            Lf5:
                r10.itemActionProvider = r6
            Lf7:
                int r7 = androidx.appcompat.R.styleable.MenuItem_contentDescription
                java.lang.CharSequence r7 = r0.getText(r7)
                r10.itemContentDescription = r7
                int r7 = androidx.appcompat.R.styleable.MenuItem_tooltipText
                java.lang.CharSequence r7 = r0.getText(r7)
                r10.itemTooltipText = r7
                int r7 = androidx.appcompat.R.styleable.MenuItem_iconTintMode
                boolean r7 = r0.hasValue(r7)
                if (r7 == 0) goto L11e
                int r7 = androidx.appcompat.R.styleable.MenuItem_iconTintMode
                int r5 = r0.getInt(r7, r5)
                android.graphics.PorterDuff$Mode r7 = r10.itemIconTintMode
                android.graphics.PorterDuff$Mode r5 = androidx.appcompat.widget.DrawableUtils.parseTintMode(r5, r7)
                r10.itemIconTintMode = r5
                goto L120
            L11e:
                r10.itemIconTintMode = r6
            L120:
                int r5 = androidx.appcompat.R.styleable.MenuItem_iconTint
                boolean r5 = r0.hasValue(r5)
                if (r5 == 0) goto L131
                int r5 = androidx.appcompat.R.styleable.MenuItem_iconTint
                android.content.res.ColorStateList r5 = r0.getColorStateList(r5)
                r10.itemIconTintList = r5
                goto L133
            L131:
                r10.itemIconTintList = r6
            L133:
                r0.recycle()
                r10.itemAdded = r2
                return
        }

        public void resetGroup() {
                r1 = this;
                r0 = 0
                r1.groupId = r0
                r1.groupCategory = r0
                r1.groupOrder = r0
                r1.groupCheckable = r0
                r0 = 1
                r1.groupVisible = r0
                r1.groupEnabled = r0
                return
        }
    }

    static {
            r0 = 1
            java.lang.Class[] r0 = new java.lang.Class[r0]
            r1 = 0
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r0[r1] = r2
            androidx.appcompat.view.SupportMenuInflater.ACTION_VIEW_CONSTRUCTOR_SIGNATURE = r0
            java.lang.Class<?>[] r0 = androidx.appcompat.view.SupportMenuInflater.ACTION_VIEW_CONSTRUCTOR_SIGNATURE
            androidx.appcompat.view.SupportMenuInflater.ACTION_PROVIDER_CONSTRUCTOR_SIGNATURE = r0
            return
    }

    public SupportMenuInflater(android.content.Context r2) {
            r1 = this;
            r1.<init>(r2)
            r1.mContext = r2
            java.lang.Object[] r0 = new java.lang.Object[]{r2}
            r1.mActionViewConstructorArguments = r0
            java.lang.Object[] r0 = r1.mActionViewConstructorArguments
            r1.mActionProviderConstructorArguments = r0
            return
    }

    private java.lang.Object findRealOwner(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof android.app.Activity
            if (r0 == 0) goto L5
            return r2
        L5:
            boolean r0 = r2 instanceof android.content.ContextWrapper
            if (r0 == 0) goto L15
            r0 = r2
            android.content.ContextWrapper r0 = (android.content.ContextWrapper) r0
            android.content.Context r0 = r0.getBaseContext()
            java.lang.Object r0 = r1.findRealOwner(r0)
            return r0
        L15:
            return r2
    }

    private void parseMenu(org.xmlpull.v1.XmlPullParser r11, android.util.AttributeSet r12, android.view.Menu r13) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
            r10 = this;
            androidx.appcompat.view.SupportMenuInflater$MenuState r0 = new androidx.appcompat.view.SupportMenuInflater$MenuState
            r0.<init>(r10, r13)
            int r1 = r11.getEventType()
            r2 = 0
            r3 = 0
        Lb:
            r4 = 2
            java.lang.String r5 = "menu"
            if (r1 != r4) goto L38
            java.lang.String r4 = r11.getName()
            boolean r6 = r4.equals(r5)
            if (r6 == 0) goto L1f
            int r1 = r11.next()
            goto L3f
        L1f:
            java.lang.RuntimeException r5 = new java.lang.RuntimeException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "Expecting menu, got "
            java.lang.StringBuilder r6 = r6.append(r7)
            java.lang.StringBuilder r6 = r6.append(r4)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        L38:
            int r1 = r11.next()
            r4 = 1
            if (r1 != r4) goto Lb
        L3f:
            r4 = 0
        L40:
            if (r4 != 0) goto Lc7
            java.lang.String r6 = "item"
            java.lang.String r7 = "group"
            switch(r1) {
                case 1: goto Lb9;
                case 2: goto L8d;
                case 3: goto L4b;
                default: goto L49;
            }
        L49:
            goto Lc1
        L4b:
            java.lang.String r8 = r11.getName()
            if (r2 == 0) goto L5b
            boolean r9 = r8.equals(r3)
            if (r9 == 0) goto L5b
            r2 = 0
            r3 = 0
            goto Lc1
        L5b:
            boolean r7 = r8.equals(r7)
            if (r7 == 0) goto L65
            r0.resetGroup()
            goto Lc1
        L65:
            boolean r6 = r8.equals(r6)
            if (r6 == 0) goto L85
            boolean r6 = r0.hasAddedItem()
            if (r6 != 0) goto Lc1
            androidx.core.view.ActionProvider r6 = r0.itemActionProvider
            if (r6 == 0) goto L81
            androidx.core.view.ActionProvider r6 = r0.itemActionProvider
            boolean r6 = r6.hasSubMenu()
            if (r6 == 0) goto L81
            r0.addSubMenuItem()
            goto Lc1
        L81:
            r0.addItem()
            goto Lc1
        L85:
            boolean r6 = r8.equals(r5)
            if (r6 == 0) goto Lc1
            r4 = 1
            goto Lc1
        L8d:
            if (r2 == 0) goto L90
            goto Lc1
        L90:
            java.lang.String r8 = r11.getName()
            boolean r7 = r8.equals(r7)
            if (r7 == 0) goto L9e
            r0.readGroup(r12)
            goto Lc1
        L9e:
            boolean r6 = r8.equals(r6)
            if (r6 == 0) goto La8
            r0.readItem(r12)
            goto Lc1
        La8:
            boolean r6 = r8.equals(r5)
            if (r6 == 0) goto Lb6
            android.view.SubMenu r6 = r0.addSubMenuItem()
            r10.parseMenu(r11, r12, r6)
            goto Lc1
        Lb6:
            r2 = 1
            r3 = r8
            goto Lc1
        Lb9:
            java.lang.RuntimeException r5 = new java.lang.RuntimeException
            java.lang.String r6 = "Unexpected end of document"
            r5.<init>(r6)
            throw r5
        Lc1:
            int r1 = r11.next()
            goto L40
        Lc7:
            return
    }

    java.lang.Object getRealOwner() {
            r1 = this;
            java.lang.Object r0 = r1.mRealOwner
            if (r0 != 0) goto Lc
            android.content.Context r0 = r1.mContext
            java.lang.Object r0 = r1.findRealOwner(r0)
            r1.mRealOwner = r0
        Lc:
            java.lang.Object r0 = r1.mRealOwner
            return r0
    }

    @Override // android.view.MenuInflater
    public void inflate(int r7, android.view.Menu r8) {
            r6 = this;
            java.lang.String r0 = "Error inflating menu XML"
            boolean r1 = r8 instanceof androidx.core.internal.view.SupportMenu
            if (r1 != 0) goto La
            super.inflate(r7, r8)
            return
        La:
            r1 = 0
            r2 = 0
            android.content.Context r3 = r6.mContext     // Catch: java.lang.Throwable -> L3e java.io.IOException -> L40 org.xmlpull.v1.XmlPullParserException -> L47
            android.content.res.Resources r3 = r3.getResources()     // Catch: java.lang.Throwable -> L3e java.io.IOException -> L40 org.xmlpull.v1.XmlPullParserException -> L47
            android.content.res.XmlResourceParser r3 = r3.getLayout(r7)     // Catch: java.lang.Throwable -> L3e java.io.IOException -> L40 org.xmlpull.v1.XmlPullParserException -> L47
            r1 = r3
            android.util.AttributeSet r3 = android.util.Xml.asAttributeSet(r1)     // Catch: java.lang.Throwable -> L3e java.io.IOException -> L40 org.xmlpull.v1.XmlPullParserException -> L47
            boolean r4 = r8 instanceof androidx.appcompat.view.menu.MenuBuilder     // Catch: java.lang.Throwable -> L3e java.io.IOException -> L40 org.xmlpull.v1.XmlPullParserException -> L47
            if (r4 == 0) goto L2d
            r4 = r8
            androidx.appcompat.view.menu.MenuBuilder r4 = (androidx.appcompat.view.menu.MenuBuilder) r4     // Catch: java.lang.Throwable -> L3e java.io.IOException -> L40 org.xmlpull.v1.XmlPullParserException -> L47
            r5 = r4
            boolean r4 = r4.isDispatchingItemsChanged()     // Catch: java.lang.Throwable -> L3e java.io.IOException -> L40 org.xmlpull.v1.XmlPullParserException -> L47
            if (r4 == 0) goto L2d
            r5.stopDispatchingItemsChanged()     // Catch: java.lang.Throwable -> L3e java.io.IOException -> L40 org.xmlpull.v1.XmlPullParserException -> L47
            r2 = 1
        L2d:
            r6.parseMenu(r1, r3, r8)     // Catch: java.lang.Throwable -> L3e java.io.IOException -> L40 org.xmlpull.v1.XmlPullParserException -> L47
            if (r2 == 0) goto L38
            r0 = r8
            androidx.appcompat.view.menu.MenuBuilder r0 = (androidx.appcompat.view.menu.MenuBuilder) r0
            r0.startDispatchingItemsChanged()
        L38:
            if (r1 == 0) goto L3d
            r1.close()
        L3d:
            return
        L3e:
            r0 = move-exception
            goto L4e
        L40:
            r3 = move-exception
            android.view.InflateException r4 = new android.view.InflateException     // Catch: java.lang.Throwable -> L3e
            r4.<init>(r0, r3)     // Catch: java.lang.Throwable -> L3e
            throw r4     // Catch: java.lang.Throwable -> L3e
        L47:
            r3 = move-exception
            android.view.InflateException r4 = new android.view.InflateException     // Catch: java.lang.Throwable -> L3e
            r4.<init>(r0, r3)     // Catch: java.lang.Throwable -> L3e
            throw r4     // Catch: java.lang.Throwable -> L3e
        L4e:
            if (r2 == 0) goto L56
            r3 = r8
            androidx.appcompat.view.menu.MenuBuilder r3 = (androidx.appcompat.view.menu.MenuBuilder) r3
            r3.startDispatchingItemsChanged()
        L56:
            if (r1 == 0) goto L5b
            r1.close()
        L5b:
            throw r0
    }
}
