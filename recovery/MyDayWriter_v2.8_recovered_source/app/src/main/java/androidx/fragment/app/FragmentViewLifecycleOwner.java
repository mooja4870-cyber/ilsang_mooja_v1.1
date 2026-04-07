package androidx.fragment.app;

/* JADX INFO: loaded from: classes.dex */
class FragmentViewLifecycleOwner implements androidx.lifecycle.HasDefaultViewModelProviderFactory, androidx.savedstate.SavedStateRegistryOwner, androidx.lifecycle.ViewModelStoreOwner {
    private androidx.lifecycle.ViewModelProvider.Factory mDefaultFactory;
    private final androidx.fragment.app.Fragment mFragment;
    private androidx.lifecycle.LifecycleRegistry mLifecycleRegistry;
    private final java.lang.Runnable mRestoreViewSavedStateRunnable;
    private androidx.savedstate.SavedStateRegistryController mSavedStateRegistryController;
    private final androidx.lifecycle.ViewModelStore mViewModelStore;

    FragmentViewLifecycleOwner(androidx.fragment.app.Fragment r2, androidx.lifecycle.ViewModelStore r3, java.lang.Runnable r4) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.mLifecycleRegistry = r0
            r1.mSavedStateRegistryController = r0
            r1.mFragment = r2
            r1.mViewModelStore = r3
            r1.mRestoreViewSavedStateRunnable = r4
            return
    }

    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    public androidx.lifecycle.viewmodel.CreationExtras getDefaultViewModelCreationExtras() {
            r5 = this;
            r0 = 0
            androidx.fragment.app.Fragment r1 = r5.mFragment
            android.content.Context r1 = r1.requireContext()
            android.content.Context r1 = r1.getApplicationContext()
        Lb:
            boolean r2 = r1 instanceof android.content.ContextWrapper
            if (r2 == 0) goto L1f
            boolean r2 = r1 instanceof android.app.Application
            if (r2 == 0) goto L17
            r0 = r1
            android.app.Application r0 = (android.app.Application) r0
            goto L1f
        L17:
            r2 = r1
            android.content.ContextWrapper r2 = (android.content.ContextWrapper) r2
            android.content.Context r1 = r2.getBaseContext()
            goto Lb
        L1f:
            androidx.lifecycle.viewmodel.MutableCreationExtras r2 = new androidx.lifecycle.viewmodel.MutableCreationExtras
            r2.<init>()
            if (r0 == 0) goto L2b
            androidx.lifecycle.viewmodel.CreationExtras$Key<android.app.Application> r3 = androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY
            r2.set(r3, r0)
        L2b:
            androidx.lifecycle.viewmodel.CreationExtras$Key<androidx.savedstate.SavedStateRegistryOwner> r3 = androidx.lifecycle.SavedStateHandleSupport.SAVED_STATE_REGISTRY_OWNER_KEY
            androidx.fragment.app.Fragment r4 = r5.mFragment
            r2.set(r3, r4)
            androidx.lifecycle.viewmodel.CreationExtras$Key<androidx.lifecycle.ViewModelStoreOwner> r3 = androidx.lifecycle.SavedStateHandleSupport.VIEW_MODEL_STORE_OWNER_KEY
            r2.set(r3, r5)
            androidx.fragment.app.Fragment r3 = r5.mFragment
            android.os.Bundle r3 = r3.getArguments()
            if (r3 == 0) goto L4a
            androidx.lifecycle.viewmodel.CreationExtras$Key<android.os.Bundle> r3 = androidx.lifecycle.SavedStateHandleSupport.DEFAULT_ARGS_KEY
            androidx.fragment.app.Fragment r4 = r5.mFragment
            android.os.Bundle r4 = r4.getArguments()
            r2.set(r3, r4)
        L4a:
            return r2
    }

    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    public androidx.lifecycle.ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
            r6 = this;
            androidx.fragment.app.Fragment r0 = r6.mFragment
            androidx.lifecycle.ViewModelProvider$Factory r0 = r0.getDefaultViewModelProviderFactory()
            androidx.fragment.app.Fragment r1 = r6.mFragment
            androidx.lifecycle.ViewModelProvider$Factory r1 = r1.mDefaultFactory
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L13
            r6.mDefaultFactory = r0
            return r0
        L13:
            androidx.lifecycle.ViewModelProvider$Factory r1 = r6.mDefaultFactory
            if (r1 != 0) goto L45
            r1 = 0
            androidx.fragment.app.Fragment r2 = r6.mFragment
            android.content.Context r2 = r2.requireContext()
            android.content.Context r2 = r2.getApplicationContext()
        L22:
            boolean r3 = r2 instanceof android.content.ContextWrapper
            if (r3 == 0) goto L36
            boolean r3 = r2 instanceof android.app.Application
            if (r3 == 0) goto L2e
            r1 = r2
            android.app.Application r1 = (android.app.Application) r1
            goto L36
        L2e:
            r3 = r2
            android.content.ContextWrapper r3 = (android.content.ContextWrapper) r3
            android.content.Context r2 = r3.getBaseContext()
            goto L22
        L36:
            androidx.lifecycle.SavedStateViewModelFactory r3 = new androidx.lifecycle.SavedStateViewModelFactory
            androidx.fragment.app.Fragment r4 = r6.mFragment
            androidx.fragment.app.Fragment r5 = r6.mFragment
            android.os.Bundle r5 = r5.getArguments()
            r3.<init>(r1, r4, r5)
            r6.mDefaultFactory = r3
        L45:
            androidx.lifecycle.ViewModelProvider$Factory r1 = r6.mDefaultFactory
            return r1
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public androidx.lifecycle.Lifecycle getLifecycle() {
            r1 = this;
            r1.initialize()
            androidx.lifecycle.LifecycleRegistry r0 = r1.mLifecycleRegistry
            return r0
    }

    @Override // androidx.savedstate.SavedStateRegistryOwner
    public androidx.savedstate.SavedStateRegistry getSavedStateRegistry() {
            r1 = this;
            r1.initialize()
            androidx.savedstate.SavedStateRegistryController r0 = r1.mSavedStateRegistryController
            androidx.savedstate.SavedStateRegistry r0 = r0.getSavedStateRegistry()
            return r0
    }

    @Override // androidx.lifecycle.ViewModelStoreOwner
    public androidx.lifecycle.ViewModelStore getViewModelStore() {
            r1 = this;
            r1.initialize()
            androidx.lifecycle.ViewModelStore r0 = r1.mViewModelStore
            return r0
    }

    void handleLifecycleEvent(androidx.lifecycle.Lifecycle.Event r2) {
            r1 = this;
            androidx.lifecycle.LifecycleRegistry r0 = r1.mLifecycleRegistry
            r0.handleLifecycleEvent(r2)
            return
    }

    void initialize() {
            r1 = this;
            androidx.lifecycle.LifecycleRegistry r0 = r1.mLifecycleRegistry
            if (r0 != 0) goto L1b
            androidx.lifecycle.LifecycleRegistry r0 = new androidx.lifecycle.LifecycleRegistry
            r0.<init>(r1)
            r1.mLifecycleRegistry = r0
            androidx.savedstate.SavedStateRegistryController r0 = androidx.savedstate.SavedStateRegistryController.create(r1)
            r1.mSavedStateRegistryController = r0
            androidx.savedstate.SavedStateRegistryController r0 = r1.mSavedStateRegistryController
            r0.performAttach()
            java.lang.Runnable r0 = r1.mRestoreViewSavedStateRunnable
            r0.run()
        L1b:
            return
    }

    boolean isInitialized() {
            r1 = this;
            androidx.lifecycle.LifecycleRegistry r0 = r1.mLifecycleRegistry
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    void performRestore(android.os.Bundle r2) {
            r1 = this;
            androidx.savedstate.SavedStateRegistryController r0 = r1.mSavedStateRegistryController
            r0.performRestore(r2)
            return
    }

    void performSave(android.os.Bundle r2) {
            r1 = this;
            androidx.savedstate.SavedStateRegistryController r0 = r1.mSavedStateRegistryController
            r0.performSave(r2)
            return
    }

    void setCurrentState(androidx.lifecycle.Lifecycle.State r2) {
            r1 = this;
            androidx.lifecycle.LifecycleRegistry r0 = r1.mLifecycleRegistry
            r0.setCurrentState(r2)
            return
    }
}
