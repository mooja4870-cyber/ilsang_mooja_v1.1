package androidx.lifecycle;

/* JADX INFO: compiled from: SavedStateHandleSupport.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a*\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002H\u0002\u001a\f\u0010\u0012\u001a\u00020\u0013*\u00020\u0018H\u0007\u001a\u001f\u0010\u0019\u001a\u00020\u001a\"\f\b\u0000\u0010\u001b*\u00020\u0006*\u00020\t*\u0002H\u001bH\u0007¢\u0006\u0002\u0010\u001c\"\u0016\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00018\u0006X\u0087\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000\"\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00018\u0006X\u0087\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000\"\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00018\u0006X\u0087\u0004¢\u0006\u0002\n\u0000\"\u0018\u0010\n\u001a\u00020\u000b*\u00020\u00068@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r\"\u0018\u0010\u000e\u001a\u00020\u000f*\u00020\t8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, d2 = {"DEFAULT_ARGS_KEY", "Landroidx/lifecycle/viewmodel/CreationExtras$Key;", "Landroid/os/Bundle;", "SAVED_STATE_KEY", "", "SAVED_STATE_REGISTRY_OWNER_KEY", "Landroidx/savedstate/SavedStateRegistryOwner;", "VIEWMODEL_KEY", "VIEW_MODEL_STORE_OWNER_KEY", "Landroidx/lifecycle/ViewModelStoreOwner;", "savedStateHandlesProvider", "Landroidx/lifecycle/SavedStateHandlesProvider;", "getSavedStateHandlesProvider", "(Landroidx/savedstate/SavedStateRegistryOwner;)Landroidx/lifecycle/SavedStateHandlesProvider;", "savedStateHandlesVM", "Landroidx/lifecycle/SavedStateHandlesVM;", "getSavedStateHandlesVM", "(Landroidx/lifecycle/ViewModelStoreOwner;)Landroidx/lifecycle/SavedStateHandlesVM;", "createSavedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "savedStateRegistryOwner", "viewModelStoreOwner", "key", "defaultArgs", "Landroidx/lifecycle/viewmodel/CreationExtras;", "enableSavedStateHandles", "", "T", "(Landroidx/savedstate/SavedStateRegistryOwner;)V", "lifecycle-viewmodel-savedstate_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class SavedStateHandleSupport {
    public static final androidx.lifecycle.viewmodel.CreationExtras.Key<android.os.Bundle> DEFAULT_ARGS_KEY = null;
    private static final java.lang.String SAVED_STATE_KEY = "androidx.lifecycle.internal.SavedStateHandlesProvider";
    public static final androidx.lifecycle.viewmodel.CreationExtras.Key<androidx.savedstate.SavedStateRegistryOwner> SAVED_STATE_REGISTRY_OWNER_KEY = null;
    private static final java.lang.String VIEWMODEL_KEY = "androidx.lifecycle.internal.SavedStateHandlesVM";
    public static final androidx.lifecycle.viewmodel.CreationExtras.Key<androidx.lifecycle.ViewModelStoreOwner> VIEW_MODEL_STORE_OWNER_KEY = null;

    static {
            androidx.lifecycle.SavedStateHandleSupport$SAVED_STATE_REGISTRY_OWNER_KEY$1 r0 = new androidx.lifecycle.SavedStateHandleSupport$SAVED_STATE_REGISTRY_OWNER_KEY$1
            r0.<init>()
            androidx.lifecycle.viewmodel.CreationExtras$Key r0 = (androidx.lifecycle.viewmodel.CreationExtras.Key) r0
            androidx.lifecycle.SavedStateHandleSupport.SAVED_STATE_REGISTRY_OWNER_KEY = r0
            androidx.lifecycle.SavedStateHandleSupport$VIEW_MODEL_STORE_OWNER_KEY$1 r0 = new androidx.lifecycle.SavedStateHandleSupport$VIEW_MODEL_STORE_OWNER_KEY$1
            r0.<init>()
            androidx.lifecycle.viewmodel.CreationExtras$Key r0 = (androidx.lifecycle.viewmodel.CreationExtras.Key) r0
            androidx.lifecycle.SavedStateHandleSupport.VIEW_MODEL_STORE_OWNER_KEY = r0
            androidx.lifecycle.SavedStateHandleSupport$DEFAULT_ARGS_KEY$1 r0 = new androidx.lifecycle.SavedStateHandleSupport$DEFAULT_ARGS_KEY$1
            r0.<init>()
            androidx.lifecycle.viewmodel.CreationExtras$Key r0 = (androidx.lifecycle.viewmodel.CreationExtras.Key) r0
            androidx.lifecycle.SavedStateHandleSupport.DEFAULT_ARGS_KEY = r0
            return
    }

    public static final androidx.lifecycle.SavedStateHandle createSavedStateHandle(androidx.lifecycle.viewmodel.CreationExtras r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            androidx.lifecycle.viewmodel.CreationExtras$Key<androidx.savedstate.SavedStateRegistryOwner> r0 = androidx.lifecycle.SavedStateHandleSupport.SAVED_STATE_REGISTRY_OWNER_KEY
            java.lang.Object r0 = r5.get(r0)
            androidx.savedstate.SavedStateRegistryOwner r0 = (androidx.savedstate.SavedStateRegistryOwner) r0
            if (r0 == 0) goto L43
            androidx.lifecycle.viewmodel.CreationExtras$Key<androidx.lifecycle.ViewModelStoreOwner> r1 = androidx.lifecycle.SavedStateHandleSupport.VIEW_MODEL_STORE_OWNER_KEY
            java.lang.Object r1 = r5.get(r1)
            androidx.lifecycle.ViewModelStoreOwner r1 = (androidx.lifecycle.ViewModelStoreOwner) r1
            if (r1 == 0) goto L3a
            androidx.lifecycle.viewmodel.CreationExtras$Key<android.os.Bundle> r2 = androidx.lifecycle.SavedStateHandleSupport.DEFAULT_ARGS_KEY
            java.lang.Object r2 = r5.get(r2)
            android.os.Bundle r2 = (android.os.Bundle) r2
            androidx.lifecycle.viewmodel.CreationExtras$Key<java.lang.String> r3 = androidx.lifecycle.ViewModelProvider.NewInstanceFactory.VIEW_MODEL_KEY
            java.lang.Object r3 = r5.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto L31
        L2c:
            androidx.lifecycle.SavedStateHandle r4 = createSavedStateHandle(r0, r1, r3, r2)
            return r4
        L31:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "CreationExtras must have a value by `VIEW_MODEL_KEY`"
            r3.<init>(r4)
            throw r3
        L3a:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`"
            r1.<init>(r2)
            throw r1
        L43:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`"
            r0.<init>(r1)
            throw r0
    }

    private static final androidx.lifecycle.SavedStateHandle createSavedStateHandle(androidx.savedstate.SavedStateRegistryOwner r6, androidx.lifecycle.ViewModelStoreOwner r7, java.lang.String r8, android.os.Bundle r9) {
            androidx.lifecycle.SavedStateHandlesProvider r0 = getSavedStateHandlesProvider(r6)
            androidx.lifecycle.SavedStateHandlesVM r1 = getSavedStateHandlesVM(r7)
            java.util.Map r2 = r1.getHandles()
            java.lang.Object r2 = r2.get(r8)
            androidx.lifecycle.SavedStateHandle r2 = (androidx.lifecycle.SavedStateHandle) r2
            if (r2 != 0) goto L27
            androidx.lifecycle.SavedStateHandle$Companion r2 = androidx.lifecycle.SavedStateHandle.Companion
            android.os.Bundle r3 = r0.consumeRestoredStateForKey(r8)
            androidx.lifecycle.SavedStateHandle r2 = r2.createHandle(r3, r9)
            r3 = r2
            r4 = 0
            java.util.Map r5 = r1.getHandles()
            r5.put(r8, r3)
        L27:
            return r2
    }

    public static final <T extends androidx.savedstate.SavedStateRegistryOwner & androidx.lifecycle.ViewModelStoreOwner> void enableSavedStateHandles(T r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            androidx.lifecycle.Lifecycle r0 = r5.getLifecycle()
            androidx.lifecycle.Lifecycle$State r0 = r0.getCurrentState()
            androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.INITIALIZED
            if (r0 == r1) goto L19
            androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.CREATED
            if (r0 != r1) goto L17
            goto L19
        L17:
            r1 = 0
            goto L1a
        L19:
            r1 = 1
        L1a:
            if (r1 == 0) goto L4d
            androidx.savedstate.SavedStateRegistry r1 = r5.getSavedStateRegistry()
            java.lang.String r2 = "androidx.lifecycle.internal.SavedStateHandlesProvider"
            androidx.savedstate.SavedStateRegistry$SavedStateProvider r1 = r1.getSavedStateProvider(r2)
            if (r1 != 0) goto L4c
            androidx.lifecycle.SavedStateHandlesProvider r1 = new androidx.lifecycle.SavedStateHandlesProvider
            androidx.savedstate.SavedStateRegistry r3 = r5.getSavedStateRegistry()
            r4 = r5
            androidx.lifecycle.ViewModelStoreOwner r4 = (androidx.lifecycle.ViewModelStoreOwner) r4
            r1.<init>(r3, r4)
            androidx.savedstate.SavedStateRegistry r3 = r5.getSavedStateRegistry()
            r4 = r1
            androidx.savedstate.SavedStateRegistry$SavedStateProvider r4 = (androidx.savedstate.SavedStateRegistry.SavedStateProvider) r4
            r3.registerSavedStateProvider(r2, r4)
            androidx.lifecycle.Lifecycle r2 = r5.getLifecycle()
            androidx.lifecycle.SavedStateHandleAttacher r3 = new androidx.lifecycle.SavedStateHandleAttacher
            r3.<init>(r1)
            androidx.lifecycle.LifecycleObserver r3 = (androidx.lifecycle.LifecycleObserver) r3
            r2.addObserver(r3)
        L4c:
            return
        L4d:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Failed requirement."
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    public static final androidx.lifecycle.SavedStateHandlesProvider getSavedStateHandlesProvider(androidx.savedstate.SavedStateRegistryOwner r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            androidx.savedstate.SavedStateRegistry r0 = r2.getSavedStateRegistry()
            java.lang.String r1 = "androidx.lifecycle.internal.SavedStateHandlesProvider"
            androidx.savedstate.SavedStateRegistry$SavedStateProvider r0 = r0.getSavedStateProvider(r1)
            boolean r1 = r0 instanceof androidx.lifecycle.SavedStateHandlesProvider
            if (r1 == 0) goto L16
            androidx.lifecycle.SavedStateHandlesProvider r0 = (androidx.lifecycle.SavedStateHandlesProvider) r0
            goto L17
        L16:
            r0 = 0
        L17:
            if (r0 == 0) goto L1a
            return r0
        L1a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call"
            r0.<init>(r1)
            throw r0
    }

    public static final androidx.lifecycle.SavedStateHandlesVM getSavedStateHandlesVM(androidx.lifecycle.ViewModelStoreOwner r8) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r0 = 0
            androidx.lifecycle.viewmodel.InitializerViewModelFactoryBuilder r1 = new androidx.lifecycle.viewmodel.InitializerViewModelFactoryBuilder
            r1.<init>()
            r2 = r1
            r3 = 0
            androidx.lifecycle.SavedStateHandleSupport$savedStateHandlesVM$1$1 r4 = androidx.lifecycle.SavedStateHandleSupport$savedStateHandlesVM$1$1.INSTANCE
            kotlin.jvm.functions.Function1 r4 = (kotlin.jvm.functions.Function1) r4
            r5 = r2
            r6 = 0
            java.lang.Class<androidx.lifecycle.SavedStateHandlesVM> r7 = androidx.lifecycle.SavedStateHandlesVM.class
            kotlin.reflect.KClass r7 = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(r7)
            r5.addInitializer(r7, r4)
            androidx.lifecycle.ViewModelProvider$Factory r0 = r1.build()
            androidx.lifecycle.ViewModelProvider r1 = new androidx.lifecycle.ViewModelProvider
            r1.<init>(r8, r0)
            java.lang.Class<androidx.lifecycle.SavedStateHandlesVM> r0 = androidx.lifecycle.SavedStateHandlesVM.class
            java.lang.String r2 = "androidx.lifecycle.internal.SavedStateHandlesVM"
            androidx.lifecycle.ViewModel r0 = r1.get(r2, r0)
            androidx.lifecycle.SavedStateHandlesVM r0 = (androidx.lifecycle.SavedStateHandlesVM) r0
            return r0
    }
}
