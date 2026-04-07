package androidx.lifecycle;

/* JADX INFO: compiled from: SavedStateHandleController.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\u0018\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001e\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Landroidx/lifecycle/SavedStateHandleController;", "Landroidx/lifecycle/LifecycleEventObserver;", "key", "", "handle", "Landroidx/lifecycle/SavedStateHandle;", "(Ljava/lang/String;Landroidx/lifecycle/SavedStateHandle;)V", "getHandle", "()Landroidx/lifecycle/SavedStateHandle;", "<set-?>", "", "isAttached", "()Z", "attachToLifecycle", "", "registry", "Landroidx/savedstate/SavedStateRegistry;", "lifecycle", "Landroidx/lifecycle/Lifecycle;", "onStateChanged", "source", "Landroidx/lifecycle/LifecycleOwner;", "event", "Landroidx/lifecycle/Lifecycle$Event;", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SavedStateHandleController implements androidx.lifecycle.LifecycleEventObserver {
    private final androidx.lifecycle.SavedStateHandle handle;
    private boolean isAttached;
    private final java.lang.String key;

    public SavedStateHandleController(java.lang.String r2, androidx.lifecycle.SavedStateHandle r3) {
            r1 = this;
            java.lang.String r0 = "key"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "handle"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r1.<init>()
            r1.key = r2
            r1.handle = r3
            return
    }

    public final void attachToLifecycle(androidx.savedstate.SavedStateRegistry r3, androidx.lifecycle.Lifecycle r4) {
            r2 = this;
            java.lang.String r0 = "registry"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "lifecycle"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            boolean r0 = r2.isAttached
            if (r0 != 0) goto L23
            r0 = 1
            r2.isAttached = r0
            r0 = r2
            androidx.lifecycle.LifecycleObserver r0 = (androidx.lifecycle.LifecycleObserver) r0
            r4.addObserver(r0)
            java.lang.String r0 = r2.key
            androidx.lifecycle.SavedStateHandle r1 = r2.handle
            androidx.savedstate.SavedStateRegistry$SavedStateProvider r1 = r1.savedStateProvider()
            r3.registerSavedStateProvider(r0, r1)
            return
        L23:
            r0 = 0
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Already attached to lifecycleOwner"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public final androidx.lifecycle.SavedStateHandle getHandle() {
            r1 = this;
            androidx.lifecycle.SavedStateHandle r0 = r1.handle
            return r0
    }

    public final boolean isAttached() {
            r1 = this;
            boolean r0 = r1.isAttached
            return r0
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(androidx.lifecycle.LifecycleOwner r3, androidx.lifecycle.Lifecycle.Event r4) {
            r2 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "event"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            androidx.lifecycle.Lifecycle$Event r0 = androidx.lifecycle.Lifecycle.Event.ON_DESTROY
            if (r4 != r0) goto L1b
            r0 = 0
            r2.isAttached = r0
            androidx.lifecycle.Lifecycle r0 = r3.getLifecycle()
            r1 = r2
            androidx.lifecycle.LifecycleObserver r1 = (androidx.lifecycle.LifecycleObserver) r1
            r0.removeObserver(r1)
        L1b:
            return
    }
}
