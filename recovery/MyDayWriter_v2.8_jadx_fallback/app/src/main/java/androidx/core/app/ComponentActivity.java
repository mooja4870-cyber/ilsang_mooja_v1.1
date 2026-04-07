package androidx.core.app;

/* JADX INFO: compiled from: ComponentActivity.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001*B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\tH\u0017J\u0012\u0010\u0011\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0014J\u0010\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0013H\u0015J'\u0010\u0016\u001a\u0004\u0018\u0001H\u0017\"\b\b\u0000\u0010\u0017*\u00020\t2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u00170\bH\u0017¢\u0006\u0002\u0010\u0019J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0017J\u0010\u0010\"\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0016J\u0010\u0010#\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0016J\u001d\u0010$\u001a\u00020\u001f2\u000e\u0010%\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010&H\u0004¢\u0006\u0002\u0010(J\u001d\u0010)\u001a\u00020\u001f2\u000e\u0010%\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010&H\u0002¢\u0006\u0002\u0010(R(\u0010\u0006\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\t0\b\u0012\u0004\u0012\u00020\t0\u0007X\u0082\u0004¢\u0006\b\n\u0000\u0012\u0004\b\n\u0010\u0005R\u0014\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\b\n\u0000\u0012\u0004\b\r\u0010\u0005R\u0014\u0010\u001a\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006+"}, d2 = {"Landroidx/core/app/ComponentActivity;", "Landroid/app/Activity;", "Landroidx/lifecycle/LifecycleOwner;", "Landroidx/core/view/KeyEventDispatcher$Component;", "<init>", "()V", "extraDataMap", "Landroidx/collection/SimpleArrayMap;", "Ljava/lang/Class;", "Landroidx/core/app/ComponentActivity$ExtraData;", "getExtraDataMap$annotations", "lifecycleRegistry", "Landroidx/lifecycle/LifecycleRegistry;", "getLifecycleRegistry$annotations", "putExtraData", "", "extraData", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onSaveInstanceState", "outState", "getExtraData", "T", "extraDataClass", "(Ljava/lang/Class;)Landroidx/core/app/ComponentActivity$ExtraData;", "lifecycle", "Landroidx/lifecycle/Lifecycle;", "getLifecycle", "()Landroidx/lifecycle/Lifecycle;", "superDispatchKeyEvent", "", "event", "Landroid/view/KeyEvent;", "dispatchKeyShortcutEvent", "dispatchKeyEvent", "shouldDumpInternalState", "args", "", "", "([Ljava/lang/String;)Z", "shouldSkipDump", "ExtraData", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class ComponentActivity extends android.app.Activity implements androidx.lifecycle.LifecycleOwner, androidx.core.view.KeyEventDispatcher.Component {
    private final androidx.collection.SimpleArrayMap<java.lang.Class<? extends androidx.core.app.ComponentActivity.ExtraData>, androidx.core.app.ComponentActivity.ExtraData> extraDataMap;
    private final androidx.lifecycle.LifecycleRegistry lifecycleRegistry;

    /* JADX INFO: compiled from: ComponentActivity.kt */
    @kotlin.Deprecated(message = "Store the object you want to save directly by using\n      {@link View#setTag(int, Object)} with the window's decor view.")
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/core/app/ComponentActivity$ExtraData;", "", "<init>", "()V", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static class ExtraData {
        public ExtraData() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    public ComponentActivity() {
            r4 = this;
            r4.<init>()
            androidx.collection.SimpleArrayMap r0 = new androidx.collection.SimpleArrayMap
            r1 = 1
            r2 = 0
            r3 = 0
            r0.<init>(r3, r1, r2)
            r4.extraDataMap = r0
            androidx.lifecycle.LifecycleRegistry r0 = new androidx.lifecycle.LifecycleRegistry
            r1 = r4
            androidx.lifecycle.LifecycleOwner r1 = (androidx.lifecycle.LifecycleOwner) r1
            r0.<init>(r1)
            r4.lifecycleRegistry = r0
            return
    }

    private static /* synthetic */ void getExtraDataMap$annotations() {
            return
    }

    private static /* synthetic */ void getLifecycleRegistry$annotations() {
            return
    }

    private final boolean shouldSkipDump(java.lang.String[] r5) {
            r4 = this;
            r0 = 1
            r1 = 0
            if (r5 == 0) goto Lf
            int r2 = r5.length
            if (r2 != 0) goto L9
            r2 = r0
            goto La
        L9:
            r2 = r1
        La:
            if (r2 == 0) goto Ld
            goto Lf
        Ld:
            r2 = r1
            goto L10
        Lf:
            r2 = r0
        L10:
            if (r2 != 0) goto L6d
            r2 = r5[r1]
            int r3 = r2.hashCode()
            switch(r3) {
                case -645125871: goto L5b;
                case 100470631: goto L49;
                case 472614934: goto L40;
                case 1159329357: goto L2e;
                case 1455016274: goto L1c;
                default: goto L1b;
            }
        L1b:
            goto L6d
        L1c:
            java.lang.String r3 = "--autofill"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L25
            goto L1b
        L25:
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 26
            if (r2 < r3) goto L2c
            goto L2d
        L2c:
            r0 = r1
        L2d:
            return r0
        L2e:
            java.lang.String r3 = "--contentcapture"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L37
            goto L1b
        L37:
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 29
            if (r2 < r3) goto L3e
            goto L3f
        L3e:
            r0 = r1
        L3f:
            return r0
        L40:
            java.lang.String r3 = "--list-dumpables"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L52
            goto L1b
        L49:
            java.lang.String r3 = "--dump-dumpable"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L52
            goto L1b
        L52:
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 33
            if (r2 < r3) goto L59
            goto L5a
        L59:
            r0 = r1
        L5a:
            return r0
        L5b:
            java.lang.String r3 = "--translation"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L64
            goto L1b
        L64:
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 31
            if (r2 < r3) goto L6b
            goto L6c
        L6b:
            r0 = r1
        L6c:
            return r0
        L6d:
            return r1
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(android.view.KeyEvent r4) {
            r3 = this;
            java.lang.String r0 = "event"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            android.view.Window r0 = r3.getWindow()
            android.view.View r0 = r0.getDecorView()
            java.lang.String r1 = "getDecorView(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            boolean r1 = androidx.core.view.KeyEventDispatcher.dispatchBeforeHierarchy(r0, r4)
            if (r1 == 0) goto L1a
            r1 = 1
            goto L24
        L1a:
            r1 = r3
            androidx.core.view.KeyEventDispatcher$Component r1 = (androidx.core.view.KeyEventDispatcher.Component) r1
            r2 = r3
            android.view.Window$Callback r2 = (android.view.Window.Callback) r2
            boolean r1 = androidx.core.view.KeyEventDispatcher.dispatchKeyEvent(r1, r0, r2, r4)
        L24:
            return r1
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(android.view.KeyEvent r3) {
            r2 = this;
            java.lang.String r0 = "event"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            android.view.Window r0 = r2.getWindow()
            android.view.View r0 = r0.getDecorView()
            java.lang.String r1 = "getDecorView(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            boolean r1 = androidx.core.view.KeyEventDispatcher.dispatchBeforeHierarchy(r0, r3)
            if (r1 == 0) goto L1a
            r1 = 1
            goto L1e
        L1a:
            boolean r1 = super.dispatchKeyShortcutEvent(r3)
        L1e:
            return r1
    }

    @kotlin.Deprecated(message = "Use {@link View#getTag(int)} with the window's decor view.")
    public <T extends androidx.core.app.ComponentActivity.ExtraData> T getExtraData(java.lang.Class<T> r2) {
            r1 = this;
            java.lang.String r0 = "extraDataClass"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            androidx.collection.SimpleArrayMap<java.lang.Class<? extends androidx.core.app.ComponentActivity$ExtraData>, androidx.core.app.ComponentActivity$ExtraData> r0 = r1.extraDataMap
            java.lang.Object r0 = r0.get(r2)
            androidx.core.app.ComponentActivity$ExtraData r0 = (androidx.core.app.ComponentActivity.ExtraData) r0
            return r0
    }

    public androidx.lifecycle.Lifecycle getLifecycle() {
            r1 = this;
            androidx.lifecycle.LifecycleRegistry r0 = r1.lifecycleRegistry
            androidx.lifecycle.Lifecycle r0 = (androidx.lifecycle.Lifecycle) r0
            return r0
    }

    @Override // android.app.Activity
    protected void onCreate(android.os.Bundle r3) {
            r2 = this;
            super.onCreate(r3)
            androidx.lifecycle.ReportFragment$Companion r0 = androidx.lifecycle.ReportFragment.Companion
            r1 = r2
            android.app.Activity r1 = (android.app.Activity) r1
            r0.injectIfNeededIn(r1)
            return
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(android.os.Bundle r3) {
            r2 = this;
            java.lang.String r0 = "outState"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            androidx.lifecycle.LifecycleRegistry r0 = r2.lifecycleRegistry
            androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.CREATED
            r0.setCurrentState(r1)
            super.onSaveInstanceState(r3)
            return
    }

    @kotlin.Deprecated(message = "Use {@link View#setTag(int, Object)} with the window's decor view.")
    public void putExtraData(androidx.core.app.ComponentActivity.ExtraData r3) {
            r2 = this;
            java.lang.String r0 = "extraData"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            androidx.collection.SimpleArrayMap<java.lang.Class<? extends androidx.core.app.ComponentActivity$ExtraData>, androidx.core.app.ComponentActivity$ExtraData> r0 = r2.extraDataMap
            java.lang.Class r1 = r3.getClass()
            r0.put(r1, r3)
            return
    }

    protected final boolean shouldDumpInternalState(java.lang.String[] r2) {
            r1 = this;
            boolean r0 = r1.shouldSkipDump(r2)
            r0 = r0 ^ 1
            return r0
    }

    @Override // androidx.core.view.KeyEventDispatcher.Component
    public boolean superDispatchKeyEvent(android.view.KeyEvent r2) {
            r1 = this;
            java.lang.String r0 = "event"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            boolean r0 = super.dispatchKeyEvent(r2)
            return r0
    }
}
