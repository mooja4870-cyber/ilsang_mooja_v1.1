package androidx.core.view;

/* JADX INFO: loaded from: classes.dex */
public final class MenuCompat {

    static class Api28Impl {
        private Api28Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static void setGroupDividerEnabled(android.view.Menu r0, boolean r1) {
                r0.setGroupDividerEnabled(r1)
                return
        }
    }

    private MenuCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void setGroupDividerEnabled(android.view.Menu r2, boolean r3) {
            boolean r0 = r2 instanceof androidx.core.internal.view.SupportMenu
            if (r0 == 0) goto Lb
            r0 = r2
            androidx.core.internal.view.SupportMenu r0 = (androidx.core.internal.view.SupportMenu) r0
            r0.setGroupDividerEnabled(r3)
            goto L14
        Lb:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L14
            androidx.core.view.MenuCompat.Api28Impl.setGroupDividerEnabled(r2, r3)
        L14:
            return
    }

    @androidx.annotation.ReplaceWith(expression = "item.setShowAsAction(actionEnum)")
    @java.lang.Deprecated
    public static void setShowAsAction(android.view.MenuItem r0, int r1) {
            r0.setShowAsAction(r1)
            return
    }
}
