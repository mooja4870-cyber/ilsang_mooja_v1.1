package androidx.core.widget;

/* JADX INFO: loaded from: classes.dex */
public final class ListPopupWindowCompat {
    private ListPopupWindowCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.ReplaceWith(expression = "listPopupWindow.createDragToOpenListener(src)")
    @java.lang.Deprecated
    public static android.view.View.OnTouchListener createDragToOpenListener(android.widget.ListPopupWindow r1, android.view.View r2) {
            android.view.View$OnTouchListener r0 = r1.createDragToOpenListener(r2)
            return r0
    }

    @java.lang.Deprecated
    public static android.view.View.OnTouchListener createDragToOpenListener(java.lang.Object r1, android.view.View r2) {
            r0 = r1
            android.widget.ListPopupWindow r0 = (android.widget.ListPopupWindow) r0
            android.view.View$OnTouchListener r0 = createDragToOpenListener(r0, r2)
            return r0
    }
}
