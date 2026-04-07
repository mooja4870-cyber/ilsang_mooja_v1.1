package androidx.core.widget;

/* JADX INFO: loaded from: classes.dex */
@java.lang.Deprecated
public final class ListViewCompat {
    private ListViewCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.ReplaceWith(expression = "listView.canScrollList(direction)")
    @java.lang.Deprecated
    public static boolean canScrollList(android.widget.ListView r1, int r2) {
            boolean r0 = r1.canScrollList(r2)
            return r0
    }

    @androidx.annotation.ReplaceWith(expression = "listView.scrollListBy(y)")
    @java.lang.Deprecated
    public static void scrollListBy(android.widget.ListView r0, int r1) {
            r0.scrollListBy(r1)
            return
    }
}
