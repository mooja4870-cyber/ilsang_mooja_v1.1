package androidx.appcompat.view;

/* JADX INFO: loaded from: classes.dex */
public class SupportActionModeWrapper extends android.view.ActionMode {
    final android.content.Context mContext;
    final androidx.appcompat.view.ActionMode mWrappedObject;

    public static class CallbackWrapper implements androidx.appcompat.view.ActionMode.Callback {
        final java.util.ArrayList<androidx.appcompat.view.SupportActionModeWrapper> mActionModes;
        final android.content.Context mContext;
        final androidx.collection.SimpleArrayMap<android.view.Menu, android.view.Menu> mMenus;
        final android.view.ActionMode.Callback mWrappedCallback;

        public CallbackWrapper(android.content.Context r2, android.view.ActionMode.Callback r3) {
                r1 = this;
                r1.<init>()
                r1.mContext = r2
                r1.mWrappedCallback = r3
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.mActionModes = r0
                androidx.collection.SimpleArrayMap r0 = new androidx.collection.SimpleArrayMap
                r0.<init>()
                r1.mMenus = r0
                return
        }

        private android.view.Menu getMenuWrapper(android.view.Menu r5) {
                r4 = this;
                androidx.collection.SimpleArrayMap<android.view.Menu, android.view.Menu> r0 = r4.mMenus
                java.lang.Object r0 = r0.get(r5)
                android.view.Menu r0 = (android.view.Menu) r0
                if (r0 != 0) goto L1a
                androidx.appcompat.view.menu.MenuWrapperICS r1 = new androidx.appcompat.view.menu.MenuWrapperICS
                android.content.Context r2 = r4.mContext
                r3 = r5
                androidx.core.internal.view.SupportMenu r3 = (androidx.core.internal.view.SupportMenu) r3
                r1.<init>(r2, r3)
                r0 = r1
                androidx.collection.SimpleArrayMap<android.view.Menu, android.view.Menu> r1 = r4.mMenus
                r1.put(r5, r0)
            L1a:
                return r0
        }

        public android.view.ActionMode getActionModeWrapper(androidx.appcompat.view.ActionMode r5) {
                r4 = this;
                r0 = 0
                java.util.ArrayList<androidx.appcompat.view.SupportActionModeWrapper> r1 = r4.mActionModes
                int r1 = r1.size()
            L7:
                if (r0 >= r1) goto L1b
                java.util.ArrayList<androidx.appcompat.view.SupportActionModeWrapper> r2 = r4.mActionModes
                java.lang.Object r2 = r2.get(r0)
                androidx.appcompat.view.SupportActionModeWrapper r2 = (androidx.appcompat.view.SupportActionModeWrapper) r2
                if (r2 == 0) goto L18
                androidx.appcompat.view.ActionMode r3 = r2.mWrappedObject
                if (r3 != r5) goto L18
                return r2
            L18:
                int r0 = r0 + 1
                goto L7
            L1b:
                androidx.appcompat.view.SupportActionModeWrapper r0 = new androidx.appcompat.view.SupportActionModeWrapper
                android.content.Context r1 = r4.mContext
                r0.<init>(r1, r5)
                java.util.ArrayList<androidx.appcompat.view.SupportActionModeWrapper> r1 = r4.mActionModes
                r1.add(r0)
                return r0
        }

        @Override // androidx.appcompat.view.ActionMode.Callback
        public boolean onActionItemClicked(androidx.appcompat.view.ActionMode r6, android.view.MenuItem r7) {
                r5 = this;
                android.view.ActionMode$Callback r0 = r5.mWrappedCallback
                android.view.ActionMode r1 = r5.getActionModeWrapper(r6)
                androidx.appcompat.view.menu.MenuItemWrapperICS r2 = new androidx.appcompat.view.menu.MenuItemWrapperICS
                android.content.Context r3 = r5.mContext
                r4 = r7
                androidx.core.internal.view.SupportMenuItem r4 = (androidx.core.internal.view.SupportMenuItem) r4
                r2.<init>(r3, r4)
                boolean r0 = r0.onActionItemClicked(r1, r2)
                return r0
        }

        @Override // androidx.appcompat.view.ActionMode.Callback
        public boolean onCreateActionMode(androidx.appcompat.view.ActionMode r4, android.view.Menu r5) {
                r3 = this;
                android.view.ActionMode$Callback r0 = r3.mWrappedCallback
                android.view.ActionMode r1 = r3.getActionModeWrapper(r4)
                android.view.Menu r2 = r3.getMenuWrapper(r5)
                boolean r0 = r0.onCreateActionMode(r1, r2)
                return r0
        }

        @Override // androidx.appcompat.view.ActionMode.Callback
        public void onDestroyActionMode(androidx.appcompat.view.ActionMode r3) {
                r2 = this;
                android.view.ActionMode$Callback r0 = r2.mWrappedCallback
                android.view.ActionMode r1 = r2.getActionModeWrapper(r3)
                r0.onDestroyActionMode(r1)
                return
        }

        @Override // androidx.appcompat.view.ActionMode.Callback
        public boolean onPrepareActionMode(androidx.appcompat.view.ActionMode r4, android.view.Menu r5) {
                r3 = this;
                android.view.ActionMode$Callback r0 = r3.mWrappedCallback
                android.view.ActionMode r1 = r3.getActionModeWrapper(r4)
                android.view.Menu r2 = r3.getMenuWrapper(r5)
                boolean r0 = r0.onPrepareActionMode(r1, r2)
                return r0
        }
    }

    public SupportActionModeWrapper(android.content.Context r1, androidx.appcompat.view.ActionMode r2) {
            r0 = this;
            r0.<init>()
            r0.mContext = r1
            r0.mWrappedObject = r2
            return
    }

    @Override // android.view.ActionMode
    public void finish() {
            r1 = this;
            androidx.appcompat.view.ActionMode r0 = r1.mWrappedObject
            r0.finish()
            return
    }

    @Override // android.view.ActionMode
    public android.view.View getCustomView() {
            r1 = this;
            androidx.appcompat.view.ActionMode r0 = r1.mWrappedObject
            android.view.View r0 = r0.getCustomView()
            return r0
    }

    @Override // android.view.ActionMode
    public android.view.Menu getMenu() {
            r3 = this;
            androidx.appcompat.view.menu.MenuWrapperICS r0 = new androidx.appcompat.view.menu.MenuWrapperICS
            android.content.Context r1 = r3.mContext
            androidx.appcompat.view.ActionMode r2 = r3.mWrappedObject
            android.view.Menu r2 = r2.getMenu()
            androidx.core.internal.view.SupportMenu r2 = (androidx.core.internal.view.SupportMenu) r2
            r0.<init>(r1, r2)
            return r0
    }

    @Override // android.view.ActionMode
    public android.view.MenuInflater getMenuInflater() {
            r1 = this;
            androidx.appcompat.view.ActionMode r0 = r1.mWrappedObject
            android.view.MenuInflater r0 = r0.getMenuInflater()
            return r0
    }

    @Override // android.view.ActionMode
    public java.lang.CharSequence getSubtitle() {
            r1 = this;
            androidx.appcompat.view.ActionMode r0 = r1.mWrappedObject
            java.lang.CharSequence r0 = r0.getSubtitle()
            return r0
    }

    @Override // android.view.ActionMode
    public java.lang.Object getTag() {
            r1 = this;
            androidx.appcompat.view.ActionMode r0 = r1.mWrappedObject
            java.lang.Object r0 = r0.getTag()
            return r0
    }

    @Override // android.view.ActionMode
    public java.lang.CharSequence getTitle() {
            r1 = this;
            androidx.appcompat.view.ActionMode r0 = r1.mWrappedObject
            java.lang.CharSequence r0 = r0.getTitle()
            return r0
    }

    @Override // android.view.ActionMode
    public boolean getTitleOptionalHint() {
            r1 = this;
            androidx.appcompat.view.ActionMode r0 = r1.mWrappedObject
            boolean r0 = r0.getTitleOptionalHint()
            return r0
    }

    @Override // android.view.ActionMode
    public void invalidate() {
            r1 = this;
            androidx.appcompat.view.ActionMode r0 = r1.mWrappedObject
            r0.invalidate()
            return
    }

    @Override // android.view.ActionMode
    public boolean isTitleOptional() {
            r1 = this;
            androidx.appcompat.view.ActionMode r0 = r1.mWrappedObject
            boolean r0 = r0.isTitleOptional()
            return r0
    }

    @Override // android.view.ActionMode
    public void setCustomView(android.view.View r2) {
            r1 = this;
            androidx.appcompat.view.ActionMode r0 = r1.mWrappedObject
            r0.setCustomView(r2)
            return
    }

    @Override // android.view.ActionMode
    public void setSubtitle(int r2) {
            r1 = this;
            androidx.appcompat.view.ActionMode r0 = r1.mWrappedObject
            r0.setSubtitle(r2)
            return
    }

    @Override // android.view.ActionMode
    public void setSubtitle(java.lang.CharSequence r2) {
            r1 = this;
            androidx.appcompat.view.ActionMode r0 = r1.mWrappedObject
            r0.setSubtitle(r2)
            return
    }

    @Override // android.view.ActionMode
    public void setTag(java.lang.Object r2) {
            r1 = this;
            androidx.appcompat.view.ActionMode r0 = r1.mWrappedObject
            r0.setTag(r2)
            return
    }

    @Override // android.view.ActionMode
    public void setTitle(int r2) {
            r1 = this;
            androidx.appcompat.view.ActionMode r0 = r1.mWrappedObject
            r0.setTitle(r2)
            return
    }

    @Override // android.view.ActionMode
    public void setTitle(java.lang.CharSequence r2) {
            r1 = this;
            androidx.appcompat.view.ActionMode r0 = r1.mWrappedObject
            r0.setTitle(r2)
            return
    }

    @Override // android.view.ActionMode
    public void setTitleOptionalHint(boolean r2) {
            r1 = this;
            androidx.appcompat.view.ActionMode r0 = r1.mWrappedObject
            r0.setTitleOptionalHint(r2)
            return
    }
}
