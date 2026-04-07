package androidx.core.viewtree;

/* JADX INFO: compiled from: ViewTree.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\f\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002\u001a\u0014\u0010\u0003\u001a\u00020\u0004*\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001¨\u0006\u0006"}, d2 = {"getParentOrViewTreeDisjointParent", "Landroid/view/ViewParent;", "Landroid/view/View;", "setViewTreeDisjointParent", "", "parent", "core-viewtree_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ViewTree {
    public static final android.view.ViewParent getParentOrViewTreeDisjointParent(android.view.View r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            android.view.ViewParent r0 = r3.getParent()
            if (r0 == 0) goto Lc
            return r0
        Lc:
            int r1 = androidx.core.viewtree.R.id.view_tree_disjoint_parent
            java.lang.Object r1 = r3.getTag(r1)
            boolean r2 = r1 instanceof android.view.ViewParent
            if (r2 == 0) goto L1a
            r2 = r1
            android.view.ViewParent r2 = (android.view.ViewParent) r2
            goto L1b
        L1a:
            r2 = 0
        L1b:
            return r2
    }

    public static final void setViewTreeDisjointParent(android.view.View r1, android.view.ViewParent r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            int r0 = androidx.core.viewtree.R.id.view_tree_disjoint_parent
            r1.setTag(r0, r2)
            return
    }
}
