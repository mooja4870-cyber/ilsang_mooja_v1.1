package androidx.lifecycle;

/* JADX INFO: compiled from: LegacySavedStateHandleController.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\u0013B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007J,\u0010\r\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0007J\u0018\u0010\u0012\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Landroidx/lifecycle/LegacySavedStateHandleController;", "", "()V", "TAG_SAVED_STATE_HANDLE_CONTROLLER", "", "attachHandleIfNeeded", "", "viewModel", "Landroidx/lifecycle/ViewModel;", "registry", "Landroidx/savedstate/SavedStateRegistry;", "lifecycle", "Landroidx/lifecycle/Lifecycle;", "create", "Landroidx/lifecycle/SavedStateHandleController;", "key", "defaultArgs", "Landroid/os/Bundle;", "tryToAddRecreator", "OnRecreation", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class LegacySavedStateHandleController {
    public static final androidx.lifecycle.LegacySavedStateHandleController INSTANCE = null;
    public static final java.lang.String TAG_SAVED_STATE_HANDLE_CONTROLLER = "androidx.lifecycle.savedstate.vm.tag";

    /* JADX INFO: compiled from: LegacySavedStateHandleController.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Landroidx/lifecycle/LegacySavedStateHandleController$OnRecreation;", "Landroidx/savedstate/SavedStateRegistry$AutoRecreated;", "()V", "onRecreated", "", "owner", "Landroidx/savedstate/SavedStateRegistryOwner;", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class OnRecreation implements androidx.savedstate.SavedStateRegistry.AutoRecreated {
        public OnRecreation() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.savedstate.SavedStateRegistry.AutoRecreated
        public void onRecreated(androidx.savedstate.SavedStateRegistryOwner r7) {
                r6 = this;
                java.lang.String r0 = "owner"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
                boolean r0 = r7 instanceof androidx.lifecycle.ViewModelStoreOwner
                if (r0 == 0) goto L49
                r0 = r7
                androidx.lifecycle.ViewModelStoreOwner r0 = (androidx.lifecycle.ViewModelStoreOwner) r0
                androidx.lifecycle.ViewModelStore r0 = r0.getViewModelStore()
                androidx.savedstate.SavedStateRegistry r1 = r7.getSavedStateRegistry()
                java.util.Set r2 = r0.keys()
                java.util.Iterator r2 = r2.iterator()
            L1c:
                boolean r3 = r2.hasNext()
                if (r3 == 0) goto L37
                java.lang.Object r3 = r2.next()
                java.lang.String r3 = (java.lang.String) r3
                androidx.lifecycle.ViewModel r4 = r0.get(r3)
                kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
                androidx.lifecycle.Lifecycle r5 = r7.getLifecycle()
                androidx.lifecycle.LegacySavedStateHandleController.attachHandleIfNeeded(r4, r1, r5)
                goto L1c
            L37:
                java.util.Set r2 = r0.keys()
                java.util.Collection r2 = (java.util.Collection) r2
                boolean r2 = r2.isEmpty()
                if (r2 != 0) goto L48
                java.lang.Class<androidx.lifecycle.LegacySavedStateHandleController$OnRecreation> r2 = androidx.lifecycle.LegacySavedStateHandleController.OnRecreation.class
                r1.runOnNextRecreation(r2)
            L48:
                return
            L49:
                r0 = 0
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner"
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
        }
    }


    static {
            androidx.lifecycle.LegacySavedStateHandleController r0 = new androidx.lifecycle.LegacySavedStateHandleController
            r0.<init>()
            androidx.lifecycle.LegacySavedStateHandleController.INSTANCE = r0
            return
    }

    private LegacySavedStateHandleController() {
            r0 = this;
            r0.<init>()
            return
    }

    @kotlin.jvm.JvmStatic
    public static final void attachHandleIfNeeded(androidx.lifecycle.ViewModel r2, androidx.savedstate.SavedStateRegistry r3, androidx.lifecycle.Lifecycle r4) {
            java.lang.String r0 = "viewModel"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "registry"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "lifecycle"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "androidx.lifecycle.savedstate.vm.tag"
            java.lang.Object r0 = r2.getTag(r0)
            androidx.lifecycle.SavedStateHandleController r0 = (androidx.lifecycle.SavedStateHandleController) r0
            if (r0 == 0) goto L29
            boolean r1 = r0.isAttached()
            if (r1 != 0) goto L29
            r0.attachToLifecycle(r3, r4)
            androidx.lifecycle.LegacySavedStateHandleController r1 = androidx.lifecycle.LegacySavedStateHandleController.INSTANCE
            r1.tryToAddRecreator(r3, r4)
        L29:
            return
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.lifecycle.SavedStateHandleController create(androidx.savedstate.SavedStateRegistry r4, androidx.lifecycle.Lifecycle r5, java.lang.String r6, android.os.Bundle r7) {
            java.lang.String r0 = "registry"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "lifecycle"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r6)
            android.os.Bundle r0 = r4.consumeRestoredStateForKey(r6)
            androidx.lifecycle.SavedStateHandle$Companion r1 = androidx.lifecycle.SavedStateHandle.Companion
            androidx.lifecycle.SavedStateHandle r1 = r1.createHandle(r0, r7)
            androidx.lifecycle.SavedStateHandleController r2 = new androidx.lifecycle.SavedStateHandleController
            r2.<init>(r6, r1)
            r2.attachToLifecycle(r4, r5)
            androidx.lifecycle.LegacySavedStateHandleController r3 = androidx.lifecycle.LegacySavedStateHandleController.INSTANCE
            r3.tryToAddRecreator(r4, r5)
            return r2
    }

    private final void tryToAddRecreator(androidx.savedstate.SavedStateRegistry r3, androidx.lifecycle.Lifecycle r4) {
            r2 = this;
            androidx.lifecycle.Lifecycle$State r0 = r4.getCurrentState()
            androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.INITIALIZED
            if (r0 == r1) goto L1c
            androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.STARTED
            boolean r1 = r0.isAtLeast(r1)
            if (r1 == 0) goto L11
            goto L1c
        L11:
            androidx.lifecycle.LegacySavedStateHandleController$tryToAddRecreator$1 r1 = new androidx.lifecycle.LegacySavedStateHandleController$tryToAddRecreator$1
            r1.<init>(r4, r3)
            androidx.lifecycle.LifecycleObserver r1 = (androidx.lifecycle.LifecycleObserver) r1
            r4.addObserver(r1)
            goto L21
        L1c:
            java.lang.Class<androidx.lifecycle.LegacySavedStateHandleController$OnRecreation> r1 = androidx.lifecycle.LegacySavedStateHandleController.OnRecreation.class
            r3.runOnNextRecreation(r1)
        L21:
            return
    }
}
