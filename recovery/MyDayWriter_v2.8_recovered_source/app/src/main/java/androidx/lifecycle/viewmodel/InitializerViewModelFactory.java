package androidx.lifecycle.viewmodel;

/* JADX INFO: compiled from: InitializerViewModelFactory.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u001a\u0010\u0002\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003\"\u0006\u0012\u0002\b\u00030\u0004¢\u0006\u0002\u0010\u0005J-\u0010\u0007\u001a\u0002H\b\"\b\b\u0000\u0010\b*\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\b0\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016¢\u0006\u0002\u0010\u000eR\u001c\u0010\u0002\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006¨\u0006\u000f"}, d2 = {"Landroidx/lifecycle/viewmodel/InitializerViewModelFactory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "initializers", "", "Landroidx/lifecycle/viewmodel/ViewModelInitializer;", "([Landroidx/lifecycle/viewmodel/ViewModelInitializer;)V", "[Landroidx/lifecycle/viewmodel/ViewModelInitializer;", "create", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "extras", "Landroidx/lifecycle/viewmodel/CreationExtras;", "(Ljava/lang/Class;Landroidx/lifecycle/viewmodel/CreationExtras;)Landroidx/lifecycle/ViewModel;", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class InitializerViewModelFactory implements androidx.lifecycle.ViewModelProvider.Factory {
    private final androidx.lifecycle.viewmodel.ViewModelInitializer<?>[] initializers;

    public InitializerViewModelFactory(androidx.lifecycle.viewmodel.ViewModelInitializer<?>... r2) {
            r1 = this;
            java.lang.String r0 = "initializers"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.<init>()
            r1.initializers = r2
            return
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public <T extends androidx.lifecycle.ViewModel> T create(java.lang.Class<T> r11, androidx.lifecycle.viewmodel.CreationExtras r12) {
            r10 = this;
            java.lang.String r0 = "modelClass"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.lang.String r0 = "extras"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            r0 = 0
            androidx.lifecycle.viewmodel.ViewModelInitializer<?>[] r1 = r10.initializers
            r2 = 0
            int r3 = r1.length
            r4 = 0
        L10:
            if (r4 >= r3) goto L36
            r5 = r1[r4]
            r6 = r5
            r7 = 0
            java.lang.Class r8 = r6.getClazz$lifecycle_viewmodel_release()
            boolean r8 = kotlin.jvm.internal.Intrinsics.areEqual(r8, r11)
            if (r8 == 0) goto L31
            kotlin.jvm.functions.Function1 r8 = r6.getInitializer$lifecycle_viewmodel_release()
            java.lang.Object r8 = r8.invoke(r12)
            boolean r9 = r8 instanceof androidx.lifecycle.ViewModel
            if (r9 == 0) goto L2f
            androidx.lifecycle.ViewModel r8 = (androidx.lifecycle.ViewModel) r8
            goto L30
        L2f:
            r8 = 0
        L30:
            r0 = r8
        L31:
            int r4 = r4 + 1
            goto L10
        L36:
            if (r0 == 0) goto L3a
            return r0
        L3a:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "No initializer set for given class "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = r11.getName()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }
}
