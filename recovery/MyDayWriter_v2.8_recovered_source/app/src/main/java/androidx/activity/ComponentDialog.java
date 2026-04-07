package androidx.activity;

/* JADX INFO: compiled from: ComponentDialog.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u001b\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0003\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u001a\u001a\u00020\u001bH\u0016J\u0012\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001bH\u0015J\b\u0010\u001f\u001a\u00020\u001dH\u0015J\b\u0010 \u001a\u00020\u001dH\u0015J\b\u0010'\u001a\u00020\u001dH\u0017J\u0010\u0010(\u001a\u00020\u001d2\u0006\u0010)\u001a\u00020\bH\u0016J\u0010\u0010(\u001a\u00020\u001d2\u0006\u0010*\u001a\u00020+H\u0016J\u001a\u0010(\u001a\u00020\u001d2\u0006\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-H\u0016J\u001a\u0010.\u001a\u00020\u001d2\u0006\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-H\u0016J\b\u0010/\u001a\u00020\u001dH\u0017R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010!\u001a\u00020\"¢\u0006\u000e\n\u0000\u0012\u0004\b#\u0010$\u001a\u0004\b%\u0010&¨\u00060"}, d2 = {"Landroidx/activity/ComponentDialog;", "Landroid/app/Dialog;", "Landroidx/lifecycle/LifecycleOwner;", "Landroidx/activity/OnBackPressedDispatcherOwner;", "Landroidx/savedstate/SavedStateRegistryOwner;", "context", "Landroid/content/Context;", "themeResId", "", "<init>", "(Landroid/content/Context;I)V", "_lifecycleRegistry", "Landroidx/lifecycle/LifecycleRegistry;", "lifecycleRegistry", "getLifecycleRegistry", "()Landroidx/lifecycle/LifecycleRegistry;", "savedStateRegistryController", "Landroidx/savedstate/SavedStateRegistryController;", "savedStateRegistry", "Landroidx/savedstate/SavedStateRegistry;", "getSavedStateRegistry", "()Landroidx/savedstate/SavedStateRegistry;", "lifecycle", "Landroidx/lifecycle/Lifecycle;", "getLifecycle", "()Landroidx/lifecycle/Lifecycle;", "onSaveInstanceState", "Landroid/os/Bundle;", "onCreate", "", "savedInstanceState", "onStart", "onStop", "onBackPressedDispatcher", "Landroidx/activity/OnBackPressedDispatcher;", "getOnBackPressedDispatcher$annotations", "()V", "getOnBackPressedDispatcher", "()Landroidx/activity/OnBackPressedDispatcher;", "onBackPressed", "setContentView", "layoutResID", "view", "Landroid/view/View;", "params", "Landroid/view/ViewGroup$LayoutParams;", "addContentView", "initializeViewTreeOwners", "activity_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class ComponentDialog extends android.app.Dialog implements androidx.lifecycle.LifecycleOwner, androidx.activity.OnBackPressedDispatcherOwner, androidx.savedstate.SavedStateRegistryOwner {
    private androidx.lifecycle.LifecycleRegistry _lifecycleRegistry;
    private final androidx.activity.OnBackPressedDispatcher onBackPressedDispatcher;
    private final androidx.savedstate.SavedStateRegistryController savedStateRegistryController;

    public static /* synthetic */ void $r8$lambda$qrzmfDOyDuplJFtpJLozn3P9EZI(androidx.activity.ComponentDialog r0) {
            onBackPressedDispatcher$lambda$1(r0)
            return
    }

    public ComponentDialog(android.content.Context r4) {
            r3 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = 2
            r1 = 0
            r2 = 0
            r3.<init>(r4, r2, r0, r1)
            return
    }

    public ComponentDialog(android.content.Context r3, int r4) {
            r2 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r2.<init>(r3, r4)
            androidx.savedstate.SavedStateRegistryController$Companion r0 = androidx.savedstate.SavedStateRegistryController.Companion
            r1 = r2
            androidx.savedstate.SavedStateRegistryOwner r1 = (androidx.savedstate.SavedStateRegistryOwner) r1
            androidx.savedstate.SavedStateRegistryController r0 = r0.create(r1)
            r2.savedStateRegistryController = r0
            androidx.activity.OnBackPressedDispatcher r0 = new androidx.activity.OnBackPressedDispatcher
            androidx.activity.ComponentDialog$$ExternalSyntheticLambda0 r1 = new androidx.activity.ComponentDialog$$ExternalSyntheticLambda0
            r1.<init>(r2)
            r0.<init>(r1)
            r2.onBackPressedDispatcher = r0
            return
    }

    public /* synthetic */ ComponentDialog(android.content.Context r1, int r2, int r3, kotlin.jvm.internal.DefaultConstructorMarker r4) {
            r0 = this;
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = 0
        L5:
            r0.<init>(r1, r2)
            return
    }

    private final androidx.lifecycle.LifecycleRegistry getLifecycleRegistry() {
            r3 = this;
            androidx.lifecycle.LifecycleRegistry r0 = r3._lifecycleRegistry
            if (r0 != 0) goto L10
            androidx.lifecycle.LifecycleRegistry r0 = new androidx.lifecycle.LifecycleRegistry
            r1 = r3
            androidx.lifecycle.LifecycleOwner r1 = (androidx.lifecycle.LifecycleOwner) r1
            r0.<init>(r1)
            r1 = r0
            r2 = 0
            r3._lifecycleRegistry = r1
        L10:
            return r0
    }

    public static /* synthetic */ void getOnBackPressedDispatcher$annotations() {
            return
    }

    private static final void onBackPressedDispatcher$lambda$1(androidx.activity.ComponentDialog r0) {
            super.onBackPressed()
            return
    }

    @Override // android.app.Dialog
    public void addContentView(android.view.View r2, android.view.ViewGroup.LayoutParams r3) {
            r1 = this;
            java.lang.String r0 = "view"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.initializeViewTreeOwners()
            super.addContentView(r2, r3)
            return
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public androidx.lifecycle.Lifecycle getLifecycle() {
            r1 = this;
            androidx.lifecycle.LifecycleRegistry r0 = r1.getLifecycleRegistry()
            androidx.lifecycle.Lifecycle r0 = (androidx.lifecycle.Lifecycle) r0
            return r0
    }

    @Override // androidx.activity.OnBackPressedDispatcherOwner
    public final androidx.activity.OnBackPressedDispatcher getOnBackPressedDispatcher() {
            r1 = this;
            androidx.activity.OnBackPressedDispatcher r0 = r1.onBackPressedDispatcher
            return r0
    }

    @Override // androidx.savedstate.SavedStateRegistryOwner
    public androidx.savedstate.SavedStateRegistry getSavedStateRegistry() {
            r1 = this;
            androidx.savedstate.SavedStateRegistryController r0 = r1.savedStateRegistryController
            androidx.savedstate.SavedStateRegistry r0 = r0.getSavedStateRegistry()
            return r0
    }

    public void initializeViewTreeOwners() {
            r3 = this;
            android.view.Window r0 = r3.getWindow()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            android.view.View r0 = r0.getDecorView()
            java.lang.String r1 = "getDecorView(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r2 = r3
            androidx.lifecycle.LifecycleOwner r2 = (androidx.lifecycle.LifecycleOwner) r2
            androidx.lifecycle.ViewTreeLifecycleOwner.set(r0, r2)
            android.view.Window r0 = r3.getWindow()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            android.view.View r0 = r0.getDecorView()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r2 = r3
            androidx.activity.OnBackPressedDispatcherOwner r2 = (androidx.activity.OnBackPressedDispatcherOwner) r2
            androidx.activity.ViewTreeOnBackPressedDispatcherOwner.set(r0, r2)
            android.view.Window r0 = r3.getWindow()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            android.view.View r0 = r0.getDecorView()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r1 = r3
            androidx.savedstate.SavedStateRegistryOwner r1 = (androidx.savedstate.SavedStateRegistryOwner) r1
            androidx.savedstate.ViewTreeSavedStateRegistryOwner.set(r0, r1)
            return
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
            r1 = this;
            androidx.activity.OnBackPressedDispatcher r0 = r1.onBackPressedDispatcher
            r0.onBackPressed()
            return
    }

    @Override // android.app.Dialog
    protected void onCreate(android.os.Bundle r4) {
            r3 = this;
            super.onCreate(r4)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 < r1) goto L17
            androidx.activity.OnBackPressedDispatcher r0 = r3.onBackPressedDispatcher
            android.window.OnBackInvokedDispatcher r1 = r3.getOnBackInvokedDispatcher()
            java.lang.String r2 = "getOnBackInvokedDispatcher(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            r0.setOnBackInvokedDispatcher(r1)
        L17:
            androidx.savedstate.SavedStateRegistryController r0 = r3.savedStateRegistryController
            r0.performRestore(r4)
            androidx.lifecycle.LifecycleRegistry r0 = r3.getLifecycleRegistry()
            androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_CREATE
            r0.handleLifecycleEvent(r1)
            return
    }

    @Override // android.app.Dialog
    public android.os.Bundle onSaveInstanceState() {
            r2 = this;
            android.os.Bundle r0 = super.onSaveInstanceState()
            java.lang.String r1 = "onSaveInstanceState(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            androidx.savedstate.SavedStateRegistryController r1 = r2.savedStateRegistryController
            r1.performSave(r0)
            return r0
    }

    @Override // android.app.Dialog
    protected void onStart() {
            r2 = this;
            super.onStart()
            androidx.lifecycle.LifecycleRegistry r0 = r2.getLifecycleRegistry()
            androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_RESUME
            r0.handleLifecycleEvent(r1)
            return
    }

    @Override // android.app.Dialog
    protected void onStop() {
            r2 = this;
            androidx.lifecycle.LifecycleRegistry r0 = r2.getLifecycleRegistry()
            androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_DESTROY
            r0.handleLifecycleEvent(r1)
            r0 = 0
            r2._lifecycleRegistry = r0
            super.onStop()
            return
    }

    @Override // android.app.Dialog
    public void setContentView(int r1) {
            r0 = this;
            r0.initializeViewTreeOwners()
            super.setContentView(r1)
            return
    }

    @Override // android.app.Dialog
    public void setContentView(android.view.View r2) {
            r1 = this;
            java.lang.String r0 = "view"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.initializeViewTreeOwners()
            super.setContentView(r2)
            return
    }

    @Override // android.app.Dialog
    public void setContentView(android.view.View r2, android.view.ViewGroup.LayoutParams r3) {
            r1 = this;
            java.lang.String r0 = "view"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.initializeViewTreeOwners()
            super.setContentView(r2, r3)
            return
    }
}
