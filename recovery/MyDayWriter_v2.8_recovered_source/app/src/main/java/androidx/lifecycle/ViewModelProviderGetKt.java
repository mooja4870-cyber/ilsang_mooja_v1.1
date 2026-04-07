package androidx.lifecycle;

/* JADX INFO: compiled from: ViewModelProvider.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000\u001a\u001e\u0010\u0004\u001a\u0002H\u0005\"\n\b\u0000\u0010\u0005\u0018\u0001*\u00020\u0006*\u00020\u0007H\u0087\b¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"defaultCreationExtras", "Landroidx/lifecycle/viewmodel/CreationExtras;", "owner", "Landroidx/lifecycle/ViewModelStoreOwner;", "get", "VM", "Landroidx/lifecycle/ViewModel;", "Landroidx/lifecycle/ViewModelProvider;", "(Landroidx/lifecycle/ViewModelProvider;)Landroidx/lifecycle/ViewModel;", "lifecycle-viewmodel_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ViewModelProviderGetKt {
    public static final androidx.lifecycle.viewmodel.CreationExtras defaultCreationExtras(androidx.lifecycle.ViewModelStoreOwner r1) {
            java.lang.String r0 = "owner"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            boolean r0 = r1 instanceof androidx.lifecycle.HasDefaultViewModelProviderFactory
            if (r0 == 0) goto L11
            r0 = r1
            androidx.lifecycle.HasDefaultViewModelProviderFactory r0 = (androidx.lifecycle.HasDefaultViewModelProviderFactory) r0
            androidx.lifecycle.viewmodel.CreationExtras r0 = r0.getDefaultViewModelCreationExtras()
            goto L15
        L11:
            androidx.lifecycle.viewmodel.CreationExtras$Empty r0 = androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE
            androidx.lifecycle.viewmodel.CreationExtras r0 = (androidx.lifecycle.viewmodel.CreationExtras) r0
        L15:
            return r0
    }

    public static final /* synthetic */ <VM extends androidx.lifecycle.ViewModel> VM get(androidx.lifecycle.ViewModelProvider r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = 0
            r1 = 4
            java.lang.String r2 = "VM"
            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(r1, r2)
            java.lang.Class<androidx.lifecycle.ViewModel> r1 = androidx.lifecycle.ViewModel.class
            r2 = r1
            java.lang.Class r2 = (java.lang.Class) r2
            androidx.lifecycle.ViewModel r1 = r3.get(r1)
            return r1
    }
}
