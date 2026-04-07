package androidx.lifecycle;

/* JADX INFO: compiled from: ViewTreeViewModelStoreOwner.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0007¢\u0006\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0005*\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0002\b\u0007¨\u0006\b"}, d2 = {"findViewTreeViewModelStoreOwner", "Landroidx/lifecycle/ViewModelStoreOwner;", "Landroid/view/View;", "get", "setViewTreeViewModelStoreOwner", "", "viewModelStoreOwner", "set", "lifecycle-viewmodel_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ViewTreeViewModelStoreOwner {
    public static final androidx.lifecycle.ViewModelStoreOwner get(android.view.View r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            androidx.lifecycle.ViewTreeViewModelStoreOwner$findViewTreeViewModelStoreOwner$1 r0 = androidx.lifecycle.ViewTreeViewModelStoreOwner$findViewTreeViewModelStoreOwner$1.INSTANCE
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
            kotlin.sequences.Sequence r0 = kotlin.sequences.SequencesKt.generateSequence(r2, r0)
            androidx.lifecycle.ViewTreeViewModelStoreOwner$findViewTreeViewModelStoreOwner$2 r1 = androidx.lifecycle.ViewTreeViewModelStoreOwner$findViewTreeViewModelStoreOwner$2.INSTANCE
            kotlin.jvm.functions.Function1 r1 = (kotlin.jvm.functions.Function1) r1
            kotlin.sequences.Sequence r0 = kotlin.sequences.SequencesKt.mapNotNull(r0, r1)
            java.lang.Object r0 = kotlin.sequences.SequencesKt.firstOrNull(r0)
            androidx.lifecycle.ViewModelStoreOwner r0 = (androidx.lifecycle.ViewModelStoreOwner) r0
            return r0
    }

    public static final void set(android.view.View r1, androidx.lifecycle.ViewModelStoreOwner r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            int r0 = androidx.lifecycle.viewmodel.R.id.view_tree_view_model_store_owner
            r1.setTag(r0, r2)
            return
    }
}
