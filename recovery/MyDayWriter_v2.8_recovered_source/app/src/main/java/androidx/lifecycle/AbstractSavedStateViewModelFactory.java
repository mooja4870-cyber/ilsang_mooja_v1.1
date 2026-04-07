package androidx.lifecycle;

/* JADX INFO: compiled from: AbstractSavedStateViewModelFactory.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b&\u0018\u0000 \u001f2\u00020\u00012\u00020\u0002:\u0001\u001fB\u0007\b\u0016¢\u0006\u0002\u0010\u0003B\u0019\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ%\u0010\r\u001a\u0002H\u000e\"\b\b\u0000\u0010\u000e*\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u000e0\u0011H\u0016¢\u0006\u0002\u0010\u0012J-\u0010\r\u001a\u0002H\u000e\"\b\b\u0000\u0010\u000e*\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u000e0\u00112\u0006\u0010\u0013\u001a\u00020\u0014H\u0016¢\u0006\u0002\u0010\u0015J-\u0010\r\u001a\u0002H\u000e\"\b\b\u0000\u0010\u000e*\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u00172\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u000e0\u0011H\u0002¢\u0006\u0002\u0010\u0018J5\u0010\r\u001a\u0002H\u000e\"\b\b\u0000\u0010\u000e*\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u00172\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u000e0\u00112\u0006\u0010\u0019\u001a\u00020\u001aH$¢\u0006\u0002\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u000fH\u0017R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Landroidx/lifecycle/AbstractSavedStateViewModelFactory;", "Landroidx/lifecycle/ViewModelProvider$OnRequeryFactory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "()V", "owner", "Landroidx/savedstate/SavedStateRegistryOwner;", "defaultArgs", "Landroid/os/Bundle;", "(Landroidx/savedstate/SavedStateRegistryOwner;Landroid/os/Bundle;)V", "lifecycle", "Landroidx/lifecycle/Lifecycle;", "savedStateRegistry", "Landroidx/savedstate/SavedStateRegistry;", "create", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "extras", "Landroidx/lifecycle/viewmodel/CreationExtras;", "(Ljava/lang/Class;Landroidx/lifecycle/viewmodel/CreationExtras;)Landroidx/lifecycle/ViewModel;", "key", "", "(Ljava/lang/String;Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "handle", "Landroidx/lifecycle/SavedStateHandle;", "(Ljava/lang/String;Ljava/lang/Class;Landroidx/lifecycle/SavedStateHandle;)Landroidx/lifecycle/ViewModel;", "onRequery", "", "viewModel", "Companion", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class AbstractSavedStateViewModelFactory extends androidx.lifecycle.ViewModelProvider.OnRequeryFactory implements androidx.lifecycle.ViewModelProvider.Factory {
    public static final androidx.lifecycle.AbstractSavedStateViewModelFactory.Companion Companion = null;
    public static final java.lang.String TAG_SAVED_STATE_HANDLE_CONTROLLER = "androidx.lifecycle.savedstate.vm.tag";
    private android.os.Bundle defaultArgs;
    private androidx.lifecycle.Lifecycle lifecycle;
    private androidx.savedstate.SavedStateRegistry savedStateRegistry;

    /* JADX INFO: compiled from: AbstractSavedStateViewModelFactory.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/AbstractSavedStateViewModelFactory$Companion;", "", "()V", "TAG_SAVED_STATE_HANDLE_CONTROLLER", "", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker r1) {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            androidx.lifecycle.AbstractSavedStateViewModelFactory$Companion r0 = new androidx.lifecycle.AbstractSavedStateViewModelFactory$Companion
            r1 = 0
            r0.<init>(r1)
            androidx.lifecycle.AbstractSavedStateViewModelFactory.Companion = r0
            return
    }

    public AbstractSavedStateViewModelFactory() {
            r0 = this;
            r0.<init>()
            return
    }

    public AbstractSavedStateViewModelFactory(androidx.savedstate.SavedStateRegistryOwner r2, android.os.Bundle r3) {
            r1 = this;
            java.lang.String r0 = "owner"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.<init>()
            androidx.savedstate.SavedStateRegistry r0 = r2.getSavedStateRegistry()
            r1.savedStateRegistry = r0
            androidx.lifecycle.Lifecycle r0 = r2.getLifecycle()
            r1.lifecycle = r0
            r1.defaultArgs = r3
            return
    }

    private final <T extends androidx.lifecycle.ViewModel> T create(java.lang.String r4, java.lang.Class<T> r5) {
            r3 = this;
            androidx.savedstate.SavedStateRegistry r0 = r3.savedStateRegistry
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            androidx.lifecycle.Lifecycle r1 = r3.lifecycle
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            android.os.Bundle r2 = r3.defaultArgs
            androidx.lifecycle.SavedStateHandleController r0 = androidx.lifecycle.LegacySavedStateHandleController.create(r0, r1, r4, r2)
            androidx.lifecycle.SavedStateHandle r1 = r0.getHandle()
            androidx.lifecycle.ViewModel r1 = r3.create(r4, r5, r1)
            java.lang.String r2 = "androidx.lifecycle.savedstate.vm.tag"
            r1.setTagIfAbsent(r2, r0)
            return r1
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public <T extends androidx.lifecycle.ViewModel> T create(java.lang.Class<T> r4) {
            r3 = this;
            java.lang.String r0 = "modelClass"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = r4.getCanonicalName()
            if (r0 == 0) goto L1d
            androidx.lifecycle.Lifecycle r1 = r3.lifecycle
            if (r1 == 0) goto L14
            androidx.lifecycle.ViewModel r1 = r3.create(r0, r4)
            return r1
        L14:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "AbstractSavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras)."
            r1.<init>(r2)
            throw r1
        L1d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Local and anonymous classes can not be ViewModels"
            r0.<init>(r1)
            throw r0
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public <T extends androidx.lifecycle.ViewModel> T create(java.lang.Class<T> r3, androidx.lifecycle.viewmodel.CreationExtras r4) {
            r2 = this;
            java.lang.String r0 = "modelClass"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "extras"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            androidx.lifecycle.viewmodel.CreationExtras$Key<java.lang.String> r0 = androidx.lifecycle.ViewModelProvider.NewInstanceFactory.VIEW_MODEL_KEY
            java.lang.Object r0 = r4.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L26
            androidx.savedstate.SavedStateRegistry r1 = r2.savedStateRegistry
            if (r1 == 0) goto L1d
            androidx.lifecycle.ViewModel r1 = r2.create(r0, r3)
            goto L25
        L1d:
            androidx.lifecycle.SavedStateHandle r1 = androidx.lifecycle.SavedStateHandleSupport.createSavedStateHandle(r4)
            androidx.lifecycle.ViewModel r1 = r2.create(r0, r3, r1)
        L25:
            return r1
        L26:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "VIEW_MODEL_KEY must always be provided by ViewModelProvider"
            r0.<init>(r1)
            throw r0
    }

    protected abstract <T extends androidx.lifecycle.ViewModel> T create(java.lang.String r1, java.lang.Class<T> r2, androidx.lifecycle.SavedStateHandle r3);

    @Override // androidx.lifecycle.ViewModelProvider.OnRequeryFactory
    public void onRequery(androidx.lifecycle.ViewModel r3) {
            r2 = this;
            java.lang.String r0 = "viewModel"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            androidx.savedstate.SavedStateRegistry r0 = r2.savedStateRegistry
            if (r0 == 0) goto L16
            androidx.savedstate.SavedStateRegistry r0 = r2.savedStateRegistry
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            androidx.lifecycle.Lifecycle r1 = r2.lifecycle
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            androidx.lifecycle.LegacySavedStateHandleController.attachHandleIfNeeded(r3, r0, r1)
        L16:
            return
    }
}
