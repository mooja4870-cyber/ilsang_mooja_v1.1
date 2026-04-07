package androidx.lifecycle;

/* JADX INFO: compiled from: SavedStateViewModelFactory.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\b\u0016¢\u0006\u0002\u0010\u0003B\u0019\b\u0016\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB#\b\u0017\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ%\u0010\u0011\u001a\u0002H\u0012\"\b\b\u0000\u0010\u0012*\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00120\u0015H\u0016¢\u0006\u0002\u0010\u0016J-\u0010\u0011\u001a\u0002H\u0012\"\b\b\u0000\u0010\u0012*\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00120\u00152\u0006\u0010\u0017\u001a\u00020\u0018H\u0016¢\u0006\u0002\u0010\u0019J+\u0010\u0011\u001a\u0002H\u0012\"\b\b\u0000\u0010\u0012*\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u001b2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00120\u0015¢\u0006\u0002\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0013H\u0017R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Landroidx/lifecycle/SavedStateViewModelFactory;", "Landroidx/lifecycle/ViewModelProvider$OnRequeryFactory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "()V", "application", "Landroid/app/Application;", "owner", "Landroidx/savedstate/SavedStateRegistryOwner;", "(Landroid/app/Application;Landroidx/savedstate/SavedStateRegistryOwner;)V", "defaultArgs", "Landroid/os/Bundle;", "(Landroid/app/Application;Landroidx/savedstate/SavedStateRegistryOwner;Landroid/os/Bundle;)V", "factory", "lifecycle", "Landroidx/lifecycle/Lifecycle;", "savedStateRegistry", "Landroidx/savedstate/SavedStateRegistry;", "create", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "extras", "Landroidx/lifecycle/viewmodel/CreationExtras;", "(Ljava/lang/Class;Landroidx/lifecycle/viewmodel/CreationExtras;)Landroidx/lifecycle/ViewModel;", "key", "", "(Ljava/lang/String;Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "onRequery", "", "viewModel", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SavedStateViewModelFactory extends androidx.lifecycle.ViewModelProvider.OnRequeryFactory implements androidx.lifecycle.ViewModelProvider.Factory {
    private android.app.Application application;
    private android.os.Bundle defaultArgs;
    private final androidx.lifecycle.ViewModelProvider.Factory factory;
    private androidx.lifecycle.Lifecycle lifecycle;
    private androidx.savedstate.SavedStateRegistry savedStateRegistry;

    public SavedStateViewModelFactory() {
            r1 = this;
            r1.<init>()
            androidx.lifecycle.ViewModelProvider$AndroidViewModelFactory r0 = new androidx.lifecycle.ViewModelProvider$AndroidViewModelFactory
            r0.<init>()
            androidx.lifecycle.ViewModelProvider$Factory r0 = (androidx.lifecycle.ViewModelProvider.Factory) r0
            r1.factory = r0
            return
    }

    public SavedStateViewModelFactory(android.app.Application r2, androidx.savedstate.SavedStateRegistryOwner r3) {
            r1 = this;
            java.lang.String r0 = "owner"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public SavedStateViewModelFactory(android.app.Application r2, androidx.savedstate.SavedStateRegistryOwner r3, android.os.Bundle r4) {
            r1 = this;
            java.lang.String r0 = "owner"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r1.<init>()
            androidx.savedstate.SavedStateRegistry r0 = r3.getSavedStateRegistry()
            r1.savedStateRegistry = r0
            androidx.lifecycle.Lifecycle r0 = r3.getLifecycle()
            r1.lifecycle = r0
            r1.defaultArgs = r4
            r1.application = r2
            if (r2 == 0) goto L23
            androidx.lifecycle.ViewModelProvider$AndroidViewModelFactory$Companion r0 = androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.Companion
            androidx.lifecycle.ViewModelProvider$AndroidViewModelFactory r0 = r0.getInstance(r2)
            androidx.lifecycle.ViewModelProvider$Factory r0 = (androidx.lifecycle.ViewModelProvider.Factory) r0
            goto L2a
        L23:
            androidx.lifecycle.ViewModelProvider$AndroidViewModelFactory r0 = new androidx.lifecycle.ViewModelProvider$AndroidViewModelFactory
            r0.<init>()
            androidx.lifecycle.ViewModelProvider$Factory r0 = (androidx.lifecycle.ViewModelProvider.Factory) r0
        L2a:
            r1.factory = r0
            return
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public <T extends androidx.lifecycle.ViewModel> T create(java.lang.Class<T> r3) {
            r2 = this;
            java.lang.String r0 = "modelClass"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = r3.getCanonicalName()
            if (r0 == 0) goto L10
            androidx.lifecycle.ViewModel r1 = r2.create(r0, r3)
            return r1
        L10:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Local and anonymous classes can not be ViewModels"
            r0.<init>(r1)
            throw r0
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public <T extends androidx.lifecycle.ViewModel> T create(java.lang.Class<T> r6, androidx.lifecycle.viewmodel.CreationExtras r7) {
            r5 = this;
            java.lang.String r0 = "modelClass"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "extras"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            androidx.lifecycle.viewmodel.CreationExtras$Key<java.lang.String> r0 = androidx.lifecycle.ViewModelProvider.NewInstanceFactory.VIEW_MODEL_KEY
            java.lang.Object r0 = r7.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L84
            androidx.lifecycle.viewmodel.CreationExtras$Key<androidx.savedstate.SavedStateRegistryOwner> r1 = androidx.lifecycle.SavedStateHandleSupport.SAVED_STATE_REGISTRY_OWNER_KEY
            java.lang.Object r1 = r7.get(r1)
            if (r1 == 0) goto L71
            androidx.lifecycle.viewmodel.CreationExtras$Key<androidx.lifecycle.ViewModelStoreOwner> r1 = androidx.lifecycle.SavedStateHandleSupport.VIEW_MODEL_STORE_OWNER_KEY
            java.lang.Object r1 = r7.get(r1)
            if (r1 == 0) goto L71
            androidx.lifecycle.viewmodel.CreationExtras$Key<android.app.Application> r1 = androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY
            java.lang.Object r1 = r7.get(r1)
            android.app.Application r1 = (android.app.Application) r1
            java.lang.Class<androidx.lifecycle.AndroidViewModel> r2 = androidx.lifecycle.AndroidViewModel.class
            boolean r2 = r2.isAssignableFrom(r6)
            if (r2 == 0) goto L3f
            if (r1 == 0) goto L3f
            java.util.List r3 = androidx.lifecycle.SavedStateViewModelFactoryKt.access$getANDROID_VIEWMODEL_SIGNATURE$p()
            java.lang.reflect.Constructor r3 = androidx.lifecycle.SavedStateViewModelFactoryKt.findMatchingConstructor(r6, r3)
            goto L47
        L3f:
            java.util.List r3 = androidx.lifecycle.SavedStateViewModelFactoryKt.access$getVIEWMODEL_SIGNATURE$p()
            java.lang.reflect.Constructor r3 = androidx.lifecycle.SavedStateViewModelFactoryKt.findMatchingConstructor(r6, r3)
        L47:
            if (r3 != 0) goto L51
            androidx.lifecycle.ViewModelProvider$Factory r4 = r5.factory
            androidx.lifecycle.ViewModel r4 = r4.create(r6, r7)
            return r4
        L51:
            if (r2 == 0) goto L62
            if (r1 == 0) goto L62
            androidx.lifecycle.SavedStateHandle r4 = androidx.lifecycle.SavedStateHandleSupport.createSavedStateHandle(r7)
            java.lang.Object[] r4 = new java.lang.Object[]{r1, r4}
            androidx.lifecycle.ViewModel r4 = androidx.lifecycle.SavedStateViewModelFactoryKt.newInstance(r6, r3, r4)
            goto L6e
        L62:
            androidx.lifecycle.SavedStateHandle r4 = androidx.lifecycle.SavedStateHandleSupport.createSavedStateHandle(r7)
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            androidx.lifecycle.ViewModel r4 = androidx.lifecycle.SavedStateViewModelFactoryKt.newInstance(r6, r3, r4)
        L6e:
            goto L7b
        L71:
            androidx.lifecycle.Lifecycle r1 = r5.lifecycle
            if (r1 == 0) goto L7c
            androidx.lifecycle.ViewModel r1 = r5.create(r0, r6)
            r4 = r1
        L7b:
            return r4
        L7c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel."
            r1.<init>(r2)
            throw r1
        L84:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "VIEW_MODEL_KEY must always be provided by ViewModelProvider"
            r0.<init>(r1)
            throw r0
    }

    public final <T extends androidx.lifecycle.ViewModel> T create(java.lang.String r7, java.lang.Class<T> r8) {
            r6 = this;
            java.lang.String r0 = "key"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "modelClass"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            androidx.lifecycle.Lifecycle r0 = r6.lifecycle
            if (r0 == 0) goto L7c
            java.lang.Class<androidx.lifecycle.AndroidViewModel> r1 = androidx.lifecycle.AndroidViewModel.class
            boolean r1 = r1.isAssignableFrom(r8)
            if (r1 == 0) goto L23
            android.app.Application r2 = r6.application
            if (r2 == 0) goto L23
            java.util.List r2 = androidx.lifecycle.SavedStateViewModelFactoryKt.access$getANDROID_VIEWMODEL_SIGNATURE$p()
            java.lang.reflect.Constructor r2 = androidx.lifecycle.SavedStateViewModelFactoryKt.findMatchingConstructor(r8, r2)
            goto L2b
        L23:
            java.util.List r2 = androidx.lifecycle.SavedStateViewModelFactoryKt.access$getVIEWMODEL_SIGNATURE$p()
            java.lang.reflect.Constructor r2 = androidx.lifecycle.SavedStateViewModelFactoryKt.findMatchingConstructor(r8, r2)
        L2b:
            if (r2 != 0) goto L44
            android.app.Application r3 = r6.application
            if (r3 == 0) goto L39
            androidx.lifecycle.ViewModelProvider$Factory r3 = r6.factory
            androidx.lifecycle.ViewModel r3 = r3.create(r8)
            goto L43
        L39:
            androidx.lifecycle.ViewModelProvider$NewInstanceFactory$Companion r3 = androidx.lifecycle.ViewModelProvider.NewInstanceFactory.Companion
            androidx.lifecycle.ViewModelProvider$NewInstanceFactory r3 = r3.getInstance()
            androidx.lifecycle.ViewModel r3 = r3.create(r8)
        L43:
            return r3
        L44:
            androidx.savedstate.SavedStateRegistry r3 = r6.savedStateRegistry
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3)
            android.os.Bundle r4 = r6.defaultArgs
            androidx.lifecycle.SavedStateHandleController r3 = androidx.lifecycle.LegacySavedStateHandleController.create(r3, r0, r7, r4)
            if (r1 == 0) goto L67
            android.app.Application r4 = r6.application
            if (r4 == 0) goto L67
            android.app.Application r4 = r6.application
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
            androidx.lifecycle.SavedStateHandle r5 = r3.getHandle()
            java.lang.Object[] r4 = new java.lang.Object[]{r4, r5}
            androidx.lifecycle.ViewModel r4 = androidx.lifecycle.SavedStateViewModelFactoryKt.newInstance(r8, r2, r4)
            goto L73
        L67:
            androidx.lifecycle.SavedStateHandle r4 = r3.getHandle()
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            androidx.lifecycle.ViewModel r4 = androidx.lifecycle.SavedStateViewModelFactoryKt.newInstance(r8, r2, r4)
        L73:
            java.lang.String r5 = "androidx.lifecycle.savedstate.vm.tag"
            r4.setTagIfAbsent(r5, r3)
            return r4
        L7c:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras)."
            r0.<init>(r1)
            throw r0
    }

    @Override // androidx.lifecycle.ViewModelProvider.OnRequeryFactory
    public void onRequery(androidx.lifecycle.ViewModel r3) {
            r2 = this;
            java.lang.String r0 = "viewModel"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            androidx.lifecycle.Lifecycle r0 = r2.lifecycle
            if (r0 == 0) goto L17
        La:
            androidx.savedstate.SavedStateRegistry r0 = r2.savedStateRegistry
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            androidx.lifecycle.Lifecycle r1 = r2.lifecycle
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            androidx.lifecycle.LegacySavedStateHandleController.attachHandleIfNeeded(r3, r0, r1)
        L17:
            return
    }
}
