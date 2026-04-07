package androidx.core.view;

/* JADX INFO: loaded from: classes.dex */
public final class MenuItemCompat {

    @java.lang.Deprecated
    public static final int SHOW_AS_ACTION_ALWAYS = 2;

    @java.lang.Deprecated
    public static final int SHOW_AS_ACTION_COLLAPSE_ACTION_VIEW = 8;

    @java.lang.Deprecated
    public static final int SHOW_AS_ACTION_IF_ROOM = 1;

    @java.lang.Deprecated
    public static final int SHOW_AS_ACTION_NEVER = 0;

    @java.lang.Deprecated
    public static final int SHOW_AS_ACTION_WITH_TEXT = 4;
    private static final java.lang.String TAG = "MenuItemCompat";


    static class Api26Impl {
        private Api26Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static int getAlphabeticModifiers(android.view.MenuItem r1) {
                int r0 = r1.getAlphabeticModifiers()
                return r0
        }

        static java.lang.CharSequence getContentDescription(android.view.MenuItem r1) {
                java.lang.CharSequence r0 = r1.getContentDescription()
                return r0
        }

        static android.content.res.ColorStateList getIconTintList(android.view.MenuItem r1) {
                android.content.res.ColorStateList r0 = r1.getIconTintList()
                return r0
        }

        static android.graphics.PorterDuff.Mode getIconTintMode(android.view.MenuItem r1) {
                android.graphics.PorterDuff$Mode r0 = r1.getIconTintMode()
                return r0
        }

        static int getNumericModifiers(android.view.MenuItem r1) {
                int r0 = r1.getNumericModifiers()
                return r0
        }

        static java.lang.CharSequence getTooltipText(android.view.MenuItem r1) {
                java.lang.CharSequence r0 = r1.getTooltipText()
                return r0
        }

        static android.view.MenuItem setAlphabeticShortcut(android.view.MenuItem r1, char r2, int r3) {
                android.view.MenuItem r0 = r1.setAlphabeticShortcut(r2, r3)
                return r0
        }

        static android.view.MenuItem setContentDescription(android.view.MenuItem r1, java.lang.CharSequence r2) {
                android.view.MenuItem r0 = r1.setContentDescription(r2)
                return r0
        }

        static android.view.MenuItem setIconTintList(android.view.MenuItem r1, android.content.res.ColorStateList r2) {
                android.view.MenuItem r0 = r1.setIconTintList(r2)
                return r0
        }

        static android.view.MenuItem setIconTintMode(android.view.MenuItem r1, android.graphics.PorterDuff.Mode r2) {
                android.view.MenuItem r0 = r1.setIconTintMode(r2)
                return r0
        }

        static android.view.MenuItem setNumericShortcut(android.view.MenuItem r1, char r2, int r3) {
                android.view.MenuItem r0 = r1.setNumericShortcut(r2, r3)
                return r0
        }

        static android.view.MenuItem setShortcut(android.view.MenuItem r1, char r2, char r3, int r4, int r5) {
                android.view.MenuItem r0 = r1.setShortcut(r2, r3, r4, r5)
                return r0
        }

        static android.view.MenuItem setTooltipText(android.view.MenuItem r1, java.lang.CharSequence r2) {
                android.view.MenuItem r0 = r1.setTooltipText(r2)
                return r0
        }
    }

    @java.lang.Deprecated
    public interface OnActionExpandListener {
        boolean onMenuItemActionCollapse(android.view.MenuItem r1);

        boolean onMenuItemActionExpand(android.view.MenuItem r1);
    }

    private MenuItemCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.ReplaceWith(expression = "item.collapseActionView()")
    @java.lang.Deprecated
    public static boolean collapseActionView(android.view.MenuItem r1) {
            boolean r0 = r1.collapseActionView()
            return r0
    }

    @androidx.annotation.ReplaceWith(expression = "item.expandActionView()")
    @java.lang.Deprecated
    public static boolean expandActionView(android.view.MenuItem r1) {
            boolean r0 = r1.expandActionView()
            return r0
    }

    public static androidx.core.view.ActionProvider getActionProvider(android.view.MenuItem r2) {
            boolean r0 = r2 instanceof androidx.core.internal.view.SupportMenuItem
            if (r0 == 0) goto Lc
            r0 = r2
            androidx.core.internal.view.SupportMenuItem r0 = (androidx.core.internal.view.SupportMenuItem) r0
            androidx.core.view.ActionProvider r0 = r0.getSupportActionProvider()
            return r0
        Lc:
            java.lang.String r0 = "MenuItemCompat"
            java.lang.String r1 = "getActionProvider: item does not implement SupportMenuItem; returning null"
            android.util.Log.w(r0, r1)
            r0 = 0
            return r0
    }

    @androidx.annotation.ReplaceWith(expression = "item.getActionView()")
    @java.lang.Deprecated
    public static android.view.View getActionView(android.view.MenuItem r1) {
            android.view.View r0 = r1.getActionView()
            return r0
    }

    public static int getAlphabeticModifiers(android.view.MenuItem r2) {
            boolean r0 = r2 instanceof androidx.core.internal.view.SupportMenuItem
            if (r0 == 0) goto Lc
            r0 = r2
            androidx.core.internal.view.SupportMenuItem r0 = (androidx.core.internal.view.SupportMenuItem) r0
            int r0 = r0.getAlphabeticModifiers()
            return r0
        Lc:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L17
            int r0 = androidx.core.view.MenuItemCompat.Api26Impl.getAlphabeticModifiers(r2)
            return r0
        L17:
            r0 = 0
            return r0
    }

    public static java.lang.CharSequence getContentDescription(android.view.MenuItem r2) {
            boolean r0 = r2 instanceof androidx.core.internal.view.SupportMenuItem
            if (r0 == 0) goto Lc
            r0 = r2
            androidx.core.internal.view.SupportMenuItem r0 = (androidx.core.internal.view.SupportMenuItem) r0
            java.lang.CharSequence r0 = r0.getContentDescription()
            return r0
        Lc:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L17
            java.lang.CharSequence r0 = androidx.core.view.MenuItemCompat.Api26Impl.getContentDescription(r2)
            return r0
        L17:
            r0 = 0
            return r0
    }

    public static android.content.res.ColorStateList getIconTintList(android.view.MenuItem r2) {
            boolean r0 = r2 instanceof androidx.core.internal.view.SupportMenuItem
            if (r0 == 0) goto Lc
            r0 = r2
            androidx.core.internal.view.SupportMenuItem r0 = (androidx.core.internal.view.SupportMenuItem) r0
            android.content.res.ColorStateList r0 = r0.getIconTintList()
            return r0
        Lc:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L17
            android.content.res.ColorStateList r0 = androidx.core.view.MenuItemCompat.Api26Impl.getIconTintList(r2)
            return r0
        L17:
            r0 = 0
            return r0
    }

    public static android.graphics.PorterDuff.Mode getIconTintMode(android.view.MenuItem r2) {
            boolean r0 = r2 instanceof androidx.core.internal.view.SupportMenuItem
            if (r0 == 0) goto Lc
            r0 = r2
            androidx.core.internal.view.SupportMenuItem r0 = (androidx.core.internal.view.SupportMenuItem) r0
            android.graphics.PorterDuff$Mode r0 = r0.getIconTintMode()
            return r0
        Lc:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L17
            android.graphics.PorterDuff$Mode r0 = androidx.core.view.MenuItemCompat.Api26Impl.getIconTintMode(r2)
            return r0
        L17:
            r0 = 0
            return r0
    }

    public static int getNumericModifiers(android.view.MenuItem r2) {
            boolean r0 = r2 instanceof androidx.core.internal.view.SupportMenuItem
            if (r0 == 0) goto Lc
            r0 = r2
            androidx.core.internal.view.SupportMenuItem r0 = (androidx.core.internal.view.SupportMenuItem) r0
            int r0 = r0.getNumericModifiers()
            return r0
        Lc:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L17
            int r0 = androidx.core.view.MenuItemCompat.Api26Impl.getNumericModifiers(r2)
            return r0
        L17:
            r0 = 0
            return r0
    }

    public static java.lang.CharSequence getTooltipText(android.view.MenuItem r2) {
            boolean r0 = r2 instanceof androidx.core.internal.view.SupportMenuItem
            if (r0 == 0) goto Lc
            r0 = r2
            androidx.core.internal.view.SupportMenuItem r0 = (androidx.core.internal.view.SupportMenuItem) r0
            java.lang.CharSequence r0 = r0.getTooltipText()
            return r0
        Lc:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L17
            java.lang.CharSequence r0 = androidx.core.view.MenuItemCompat.Api26Impl.getTooltipText(r2)
            return r0
        L17:
            r0 = 0
            return r0
    }

    @androidx.annotation.ReplaceWith(expression = "item.isActionViewExpanded()")
    @java.lang.Deprecated
    public static boolean isActionViewExpanded(android.view.MenuItem r1) {
            boolean r0 = r1.isActionViewExpanded()
            return r0
    }

    public static android.view.MenuItem setActionProvider(android.view.MenuItem r2, androidx.core.view.ActionProvider r3) {
            boolean r0 = r2 instanceof androidx.core.internal.view.SupportMenuItem
            if (r0 == 0) goto Lc
            r0 = r2
            androidx.core.internal.view.SupportMenuItem r0 = (androidx.core.internal.view.SupportMenuItem) r0
            androidx.core.internal.view.SupportMenuItem r0 = r0.setSupportActionProvider(r3)
            return r0
        Lc:
            java.lang.String r0 = "MenuItemCompat"
            java.lang.String r1 = "setActionProvider: item does not implement SupportMenuItem; ignoring"
            android.util.Log.w(r0, r1)
            return r2
    }

    @androidx.annotation.ReplaceWith(expression = "item.setActionView(resId)")
    @java.lang.Deprecated
    public static android.view.MenuItem setActionView(android.view.MenuItem r1, int r2) {
            android.view.MenuItem r0 = r1.setActionView(r2)
            return r0
    }

    @androidx.annotation.ReplaceWith(expression = "item.setActionView(view)")
    @java.lang.Deprecated
    public static android.view.MenuItem setActionView(android.view.MenuItem r1, android.view.View r2) {
            android.view.MenuItem r0 = r1.setActionView(r2)
            return r0
    }

    public static void setAlphabeticShortcut(android.view.MenuItem r2, char r3, int r4) {
            boolean r0 = r2 instanceof androidx.core.internal.view.SupportMenuItem
            if (r0 == 0) goto Lb
            r0 = r2
            androidx.core.internal.view.SupportMenuItem r0 = (androidx.core.internal.view.SupportMenuItem) r0
            r0.setAlphabeticShortcut(r3, r4)
            goto L14
        Lb:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L14
            androidx.core.view.MenuItemCompat.Api26Impl.setAlphabeticShortcut(r2, r3, r4)
        L14:
            return
    }

    public static void setContentDescription(android.view.MenuItem r2, java.lang.CharSequence r3) {
            boolean r0 = r2 instanceof androidx.core.internal.view.SupportMenuItem
            if (r0 == 0) goto Lb
            r0 = r2
            androidx.core.internal.view.SupportMenuItem r0 = (androidx.core.internal.view.SupportMenuItem) r0
            r0.setContentDescription(r3)
            goto L14
        Lb:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L14
            androidx.core.view.MenuItemCompat.Api26Impl.setContentDescription(r2, r3)
        L14:
            return
    }

    public static void setIconTintList(android.view.MenuItem r2, android.content.res.ColorStateList r3) {
            boolean r0 = r2 instanceof androidx.core.internal.view.SupportMenuItem
            if (r0 == 0) goto Lb
            r0 = r2
            androidx.core.internal.view.SupportMenuItem r0 = (androidx.core.internal.view.SupportMenuItem) r0
            r0.setIconTintList(r3)
            goto L14
        Lb:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L14
            androidx.core.view.MenuItemCompat.Api26Impl.setIconTintList(r2, r3)
        L14:
            return
    }

    public static void setIconTintMode(android.view.MenuItem r2, android.graphics.PorterDuff.Mode r3) {
            boolean r0 = r2 instanceof androidx.core.internal.view.SupportMenuItem
            if (r0 == 0) goto Lb
            r0 = r2
            androidx.core.internal.view.SupportMenuItem r0 = (androidx.core.internal.view.SupportMenuItem) r0
            r0.setIconTintMode(r3)
            goto L14
        Lb:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L14
            androidx.core.view.MenuItemCompat.Api26Impl.setIconTintMode(r2, r3)
        L14:
            return
    }

    public static void setNumericShortcut(android.view.MenuItem r2, char r3, int r4) {
            boolean r0 = r2 instanceof androidx.core.internal.view.SupportMenuItem
            if (r0 == 0) goto Lb
            r0 = r2
            androidx.core.internal.view.SupportMenuItem r0 = (androidx.core.internal.view.SupportMenuItem) r0
            r0.setNumericShortcut(r3, r4)
            goto L14
        Lb:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L14
            androidx.core.view.MenuItemCompat.Api26Impl.setNumericShortcut(r2, r3, r4)
        L14:
            return
    }

    @java.lang.Deprecated
    public static android.view.MenuItem setOnActionExpandListener(android.view.MenuItem r1, androidx.core.view.MenuItemCompat.OnActionExpandListener r2) {
            androidx.core.view.MenuItemCompat$1 r0 = new androidx.core.view.MenuItemCompat$1
            r0.<init>(r2)
            android.view.MenuItem r0 = r1.setOnActionExpandListener(r0)
            return r0
    }

    public static void setShortcut(android.view.MenuItem r2, char r3, char r4, int r5, int r6) {
            boolean r0 = r2 instanceof androidx.core.internal.view.SupportMenuItem
            if (r0 == 0) goto Lb
            r0 = r2
            androidx.core.internal.view.SupportMenuItem r0 = (androidx.core.internal.view.SupportMenuItem) r0
            r0.setShortcut(r3, r4, r5, r6)
            goto L14
        Lb:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L14
            androidx.core.view.MenuItemCompat.Api26Impl.setShortcut(r2, r3, r4, r5, r6)
        L14:
            return
    }

    @androidx.annotation.ReplaceWith(expression = "item.setShowAsAction(actionEnum)")
    @java.lang.Deprecated
    public static void setShowAsAction(android.view.MenuItem r0, int r1) {
            r0.setShowAsAction(r1)
            return
    }

    public static void setTooltipText(android.view.MenuItem r2, java.lang.CharSequence r3) {
            boolean r0 = r2 instanceof androidx.core.internal.view.SupportMenuItem
            if (r0 == 0) goto Lb
            r0 = r2
            androidx.core.internal.view.SupportMenuItem r0 = (androidx.core.internal.view.SupportMenuItem) r0
            r0.setTooltipText(r3)
            goto L14
        Lb:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L14
            androidx.core.view.MenuItemCompat.Api26Impl.setTooltipText(r2, r3)
        L14:
            return
    }
}
