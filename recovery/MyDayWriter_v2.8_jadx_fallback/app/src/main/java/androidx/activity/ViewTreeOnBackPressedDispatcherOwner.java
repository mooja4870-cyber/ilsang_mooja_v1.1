package androidx.activity;

/* JADX INFO: compiled from: ViewTreeOnBackPressedDispatcherOwner.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0019\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0007¢\u0006\u0002\b\u0005\u001a\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0004*\u00020\u0002H\u0007¢\u0006\u0002\b\u0007¨\u0006\b"}, d2 = {"setViewTreeOnBackPressedDispatcherOwner", "", "Landroid/view/View;", "onBackPressedDispatcherOwner", "Landroidx/activity/OnBackPressedDispatcherOwner;", "set", "findViewTreeOnBackPressedDispatcherOwner", "get", "activity_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ViewTreeOnBackPressedDispatcherOwner {
    public static final androidx.activity.OnBackPressedDispatcherOwner get(android.view.View r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = r5
        L6:
            r1 = 0
            if (r0 == 0) goto L28
            int r2 = androidx.activity.R.id.view_tree_on_back_pressed_dispatcher_owner
            java.lang.Object r2 = r0.getTag(r2)
            boolean r3 = r2 instanceof androidx.activity.OnBackPressedDispatcherOwner
            if (r3 == 0) goto L16
            androidx.activity.OnBackPressedDispatcherOwner r2 = (androidx.activity.OnBackPressedDispatcherOwner) r2
            goto L17
        L16:
            r2 = r1
        L17:
            if (r2 == 0) goto L1b
            return r2
        L1b:
            android.view.ViewParent r3 = androidx.core.viewtree.ViewTree.getParentOrViewTreeDisjointParent(r0)
            boolean r4 = r3 instanceof android.view.View
            if (r4 == 0) goto L26
            r1 = r3
            android.view.View r1 = (android.view.View) r1
        L26:
            r0 = r1
            goto L6
        L28:
            return r1
    }

    public static final void set(android.view.View r1, androidx.activity.OnBackPressedDispatcherOwner r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "onBackPressedDispatcherOwner"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            int r0 = androidx.activity.R.id.view_tree_on_back_pressed_dispatcher_owner
            r1.setTag(r0, r2)
            return
    }
}
