package androidx.savedstate;

/* JADX INFO: compiled from: SavedStateRegistry.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 )2\u00020\u0001:\u0003()*B\u0007\b\u0000¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0015\u001a\u00020\u0007H\u0007J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0015\u001a\u00020\u0007J\u0015\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0001¢\u0006\u0002\b\u001bJ\u0017\u0010\u001c\u001a\u00020\u00182\b\u0010\u001d\u001a\u0004\u0018\u00010\u0013H\u0001¢\u0006\u0002\b\u001eJ\u0010\u0010\u001f\u001a\u00020\u00182\u0006\u0010 \u001a\u00020\u0013H\u0007J\u0018\u0010!\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\bH\u0007J\u0018\u0010#\u001a\u00020\u00182\u000e\u0010$\u001a\n\u0012\u0006\b\u0001\u0012\u00020&0%H\u0007J\u0010\u0010'\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u0007H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u00020\u0004X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR \u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00048G@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006+"}, d2 = {"Landroidx/savedstate/SavedStateRegistry;", "", "()V", "attached", "", "components", "Landroidx/arch/core/internal/SafeIterableMap;", "", "Landroidx/savedstate/SavedStateRegistry$SavedStateProvider;", "isAllowingSavingState", "isAllowingSavingState$savedstate_release", "()Z", "setAllowingSavingState$savedstate_release", "(Z)V", "<set-?>", "isRestored", "recreatorProvider", "Landroidx/savedstate/Recreator$SavedStateProvider;", "restoredState", "Landroid/os/Bundle;", "consumeRestoredStateForKey", "key", "getSavedStateProvider", "performAttach", "", "lifecycle", "Landroidx/lifecycle/Lifecycle;", "performAttach$savedstate_release", "performRestore", "savedState", "performRestore$savedstate_release", "performSave", "outBundle", "registerSavedStateProvider", "provider", "runOnNextRecreation", "clazz", "Ljava/lang/Class;", "Landroidx/savedstate/SavedStateRegistry$AutoRecreated;", "unregisterSavedStateProvider", "AutoRecreated", "Companion", "SavedStateProvider", "savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SavedStateRegistry {
    private static final androidx.savedstate.SavedStateRegistry.Companion Companion = null;

    @java.lang.Deprecated
    private static final java.lang.String SAVED_COMPONENTS_KEY = "androidx.lifecycle.BundlableSavedStateRegistry.key";
    private boolean attached;
    private final androidx.arch.core.internal.SafeIterableMap<java.lang.String, androidx.savedstate.SavedStateRegistry.SavedStateProvider> components;
    private boolean isAllowingSavingState;
    private boolean isRestored;
    private androidx.savedstate.Recreator.SavedStateProvider recreatorProvider;
    private android.os.Bundle restoredState;

    /* JADX INFO: compiled from: SavedStateRegistry.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Landroidx/savedstate/SavedStateRegistry$AutoRecreated;", "", "onRecreated", "", "owner", "Landroidx/savedstate/SavedStateRegistryOwner;", "savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface AutoRecreated {
        void onRecreated(androidx.savedstate.SavedStateRegistryOwner r1);
    }

    /* JADX INFO: compiled from: SavedStateRegistry.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Landroidx/savedstate/SavedStateRegistry$Companion;", "", "()V", "SAVED_COMPONENTS_KEY", "", "savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class Companion {
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

    /* JADX INFO: compiled from: SavedStateRegistry.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Landroidx/savedstate/SavedStateRegistry$SavedStateProvider;", "", "saveState", "Landroid/os/Bundle;", "savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface SavedStateProvider {
        android.os.Bundle saveState();
    }

    public static /* synthetic */ void $r8$lambda$eDF1FsaoUa1afQFv2y5LNvCkYm4(androidx.savedstate.SavedStateRegistry r0, androidx.lifecycle.LifecycleOwner r1, androidx.lifecycle.Lifecycle.Event r2) {
            performAttach$lambda$4(r0, r1, r2)
            return
    }

    static {
            androidx.savedstate.SavedStateRegistry$Companion r0 = new androidx.savedstate.SavedStateRegistry$Companion
            r1 = 0
            r0.<init>(r1)
            androidx.savedstate.SavedStateRegistry.Companion = r0
            return
    }

    public SavedStateRegistry() {
            r1 = this;
            r1.<init>()
            androidx.arch.core.internal.SafeIterableMap r0 = new androidx.arch.core.internal.SafeIterableMap
            r0.<init>()
            r1.components = r0
            r0 = 1
            r1.isAllowingSavingState = r0
            return
    }

    private static final void performAttach$lambda$4(androidx.savedstate.SavedStateRegistry r1, androidx.lifecycle.LifecycleOwner r2, androidx.lifecycle.Lifecycle.Event r3) {
            java.lang.String r0 = "this$0"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "<anonymous parameter 0>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r2 = "event"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r2)
            androidx.lifecycle.Lifecycle$Event r2 = androidx.lifecycle.Lifecycle.Event.ON_START
            if (r3 != r2) goto L17
            r2 = 1
            r1.isAllowingSavingState = r2
            goto L1e
        L17:
            androidx.lifecycle.Lifecycle$Event r2 = androidx.lifecycle.Lifecycle.Event.ON_STOP
            if (r3 != r2) goto L1e
            r2 = 0
            r1.isAllowingSavingState = r2
        L1e:
            return
    }

    public final android.os.Bundle consumeRestoredStateForKey(java.lang.String r5) {
            r4 = this;
            java.lang.String r0 = "key"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            boolean r0 = r4.isRestored
            if (r0 == 0) goto L31
            android.os.Bundle r0 = r4.restoredState
            r1 = 0
            if (r0 == 0) goto L30
            android.os.Bundle r0 = r4.restoredState
            if (r0 == 0) goto L17
            android.os.Bundle r0 = r0.getBundle(r5)
            goto L18
        L17:
            r0 = r1
        L18:
            android.os.Bundle r2 = r4.restoredState
            if (r2 == 0) goto L1f
            r2.remove(r5)
        L1f:
            android.os.Bundle r2 = r4.restoredState
            r3 = 0
            if (r2 == 0) goto L2b
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L2b
            r3 = 1
        L2b:
            if (r3 != 0) goto L2f
            r4.restoredState = r1
        L2f:
            return r0
        L30:
            return r1
        L31:
            r0 = 0
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "You can consumeRestoredStateForKey only after super.onCreate of corresponding component"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public final androidx.savedstate.SavedStateRegistry.SavedStateProvider getSavedStateProvider(java.lang.String r6) {
            r5 = this;
            java.lang.String r0 = "key"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            r0 = 0
            androidx.arch.core.internal.SafeIterableMap<java.lang.String, androidx.savedstate.SavedStateRegistry$SavedStateProvider> r1 = r5.components
            java.util.Iterator r1 = r1.iterator()
        Lc:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L31
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.String r3 = "components"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            java.lang.Object r3 = r2.getKey()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r2 = r2.getValue()
            androidx.savedstate.SavedStateRegistry$SavedStateProvider r2 = (androidx.savedstate.SavedStateRegistry.SavedStateProvider) r2
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r6)
            if (r4 == 0) goto Lc
            r0 = r2
        L31:
            return r0
    }

    public final boolean isAllowingSavingState$savedstate_release() {
            r1 = this;
            boolean r0 = r1.isAllowingSavingState
            return r0
    }

    public final boolean isRestored() {
            r1 = this;
            boolean r0 = r1.isRestored
            return r0
    }

    public final void performAttach$savedstate_release(androidx.lifecycle.Lifecycle r3) {
            r2 = this;
            java.lang.String r0 = "lifecycle"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            boolean r0 = r2.attached
            if (r0 != 0) goto L17
            androidx.savedstate.SavedStateRegistry$$ExternalSyntheticLambda0 r0 = new androidx.savedstate.SavedStateRegistry$$ExternalSyntheticLambda0
            r0.<init>(r2)
            androidx.lifecycle.LifecycleObserver r0 = (androidx.lifecycle.LifecycleObserver) r0
            r3.addObserver(r0)
            r0 = 1
            r2.attached = r0
            return
        L17:
            r0 = 0
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "SavedStateRegistry was already attached."
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public final void performRestore$savedstate_release(android.os.Bundle r3) {
            r2 = this;
            boolean r0 = r2.attached
            if (r0 == 0) goto L26
            boolean r0 = r2.isRestored
            if (r0 != 0) goto L18
            if (r3 == 0) goto L11
            java.lang.String r0 = "androidx.lifecycle.BundlableSavedStateRegistry.key"
            android.os.Bundle r0 = r3.getBundle(r0)
            goto L12
        L11:
            r0 = 0
        L12:
            r2.restoredState = r0
            r0 = 1
            r2.isRestored = r0
            return
        L18:
            r0 = 0
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "SavedStateRegistry was already restored."
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L26:
            r0 = 0
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "You must call performAttach() before calling performRestore(Bundle)."
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public final void performSave(android.os.Bundle r6) {
            r5 = this;
            java.lang.String r0 = "outBundle"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            android.os.Bundle r1 = r5.restoredState
            if (r1 == 0) goto L13
            android.os.Bundle r1 = r5.restoredState
            r0.putAll(r1)
        L13:
            androidx.arch.core.internal.SafeIterableMap<java.lang.String, androidx.savedstate.SavedStateRegistry$SavedStateProvider> r1 = r5.components
            androidx.arch.core.internal.SafeIterableMap$IteratorWithAdditions r1 = r1.iteratorWithAdditions()
            java.lang.String r2 = "this.components.iteratorWithAdditions()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            java.util.Iterator r1 = (java.util.Iterator) r1
        L21:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L41
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r2 = r2.getValue()
            androidx.savedstate.SavedStateRegistry$SavedStateProvider r2 = (androidx.savedstate.SavedStateRegistry.SavedStateProvider) r2
            android.os.Bundle r4 = r2.saveState()
            r0.putBundle(r3, r4)
            goto L21
        L41:
            boolean r2 = r0.isEmpty()
            if (r2 != 0) goto L4c
            java.lang.String r2 = "androidx.lifecycle.BundlableSavedStateRegistry.key"
            r6.putBundle(r2, r0)
        L4c:
            return
    }

    public final void registerSavedStateProvider(java.lang.String r4, androidx.savedstate.SavedStateRegistry.SavedStateProvider r5) {
            r3 = this;
            java.lang.String r0 = "key"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "provider"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            androidx.arch.core.internal.SafeIterableMap<java.lang.String, androidx.savedstate.SavedStateRegistry$SavedStateProvider> r0 = r3.components
            java.lang.Object r0 = r0.putIfAbsent(r4, r5)
            androidx.savedstate.SavedStateRegistry$SavedStateProvider r0 = (androidx.savedstate.SavedStateRegistry.SavedStateProvider) r0
            if (r0 != 0) goto L16
            r1 = 1
            goto L17
        L16:
            r1 = 0
        L17:
            if (r1 == 0) goto L1a
            return
        L1a:
            r1 = 0
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "SavedStateProvider with the given key is already registered"
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    public final void runOnNextRecreation(java.lang.Class<? extends androidx.savedstate.SavedStateRegistry.AutoRecreated> r5) {
            r4 = this;
            java.lang.String r0 = "clazz"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            boolean r0 = r4.isAllowingSavingState
            if (r0 == 0) goto L53
            androidx.savedstate.Recreator$SavedStateProvider r0 = r4.recreatorProvider
            if (r0 != 0) goto L12
            androidx.savedstate.Recreator$SavedStateProvider r0 = new androidx.savedstate.Recreator$SavedStateProvider
            r0.<init>(r4)
        L12:
            r4.recreatorProvider = r0
            r0 = 0
            java.lang.Class[] r0 = new java.lang.Class[r0]     // Catch: java.lang.NoSuchMethodException -> L2c
            r5.getDeclaredConstructor(r0)     // Catch: java.lang.NoSuchMethodException -> L2c
            androidx.savedstate.Recreator$SavedStateProvider r0 = r4.recreatorProvider
            if (r0 == 0) goto L2b
            java.lang.String r1 = r5.getName()
            java.lang.String r2 = "clazz.name"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            r0.add(r1)
        L2b:
            return
        L2c:
            r0 = move-exception
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Class "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = r5.getSimpleName()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = " must have default constructor in order to be automatically recreated"
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r3 = r0
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            r1.<init>(r2, r3)
            throw r1
        L53:
            r0 = 0
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Can not perform this action after onSaveInstanceState"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public final void setAllowingSavingState$savedstate_release(boolean r1) {
            r0 = this;
            r0.isAllowingSavingState = r1
            return
    }

    public final void unregisterSavedStateProvider(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "key"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            androidx.arch.core.internal.SafeIterableMap<java.lang.String, androidx.savedstate.SavedStateRegistry$SavedStateProvider> r0 = r1.components
            r0.remove(r2)
            return
    }
}
