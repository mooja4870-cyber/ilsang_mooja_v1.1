package androidx.core.widget;

/* JADX INFO: loaded from: classes.dex */
public final class PopupWindowCompat {
    private static final java.lang.String TAG = "PopupWindowCompatApi21";
    private static java.lang.reflect.Method sGetWindowLayoutTypeMethod;
    private static boolean sGetWindowLayoutTypeMethodAttempted;
    private static java.lang.reflect.Field sOverlapAnchorField;
    private static boolean sOverlapAnchorFieldAttempted;
    private static java.lang.reflect.Method sSetWindowLayoutTypeMethod;
    private static boolean sSetWindowLayoutTypeMethodAttempted;

    static class Api23Impl {
        private Api23Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static boolean getOverlapAnchor(android.widget.PopupWindow r1) {
                boolean r0 = r1.getOverlapAnchor()
                return r0
        }

        static int getWindowLayoutType(android.widget.PopupWindow r1) {
                int r0 = r1.getWindowLayoutType()
                return r0
        }

        static void setOverlapAnchor(android.widget.PopupWindow r0, boolean r1) {
                r0.setOverlapAnchor(r1)
                return
        }

        static void setWindowLayoutType(android.widget.PopupWindow r0, int r1) {
                r0.setWindowLayoutType(r1)
                return
        }
    }

    private PopupWindowCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean getOverlapAnchor(android.widget.PopupWindow r1) {
            boolean r0 = androidx.core.widget.PopupWindowCompat.Api23Impl.getOverlapAnchor(r1)
            return r0
    }

    public static int getWindowLayoutType(android.widget.PopupWindow r1) {
            int r0 = androidx.core.widget.PopupWindowCompat.Api23Impl.getWindowLayoutType(r1)
            return r0
    }

    public static void setOverlapAnchor(android.widget.PopupWindow r0, boolean r1) {
            androidx.core.widget.PopupWindowCompat.Api23Impl.setOverlapAnchor(r0, r1)
            return
    }

    public static void setWindowLayoutType(android.widget.PopupWindow r0, int r1) {
            androidx.core.widget.PopupWindowCompat.Api23Impl.setWindowLayoutType(r0, r1)
            return
    }

    @androidx.annotation.ReplaceWith(expression = "popup.showAsDropDown(anchor, xoff, yoff, gravity)")
    @java.lang.Deprecated
    public static void showAsDropDown(android.widget.PopupWindow r0, android.view.View r1, int r2, int r3, int r4) {
            r0.showAsDropDown(r1, r2, r3, r4)
            return
    }
}
