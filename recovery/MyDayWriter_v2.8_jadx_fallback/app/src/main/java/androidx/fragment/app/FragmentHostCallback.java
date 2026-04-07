package androidx.fragment.app;

/* JADX INFO: compiled from: FragmentHostCallback.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u001f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tB\u000f\b\u0010\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fB)\b\u0000\u0012\b\u0010\n\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\u000eJ7\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001f\u001a\u00020 2\u000e\u0010!\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\"H\u0016¢\u0006\u0002\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010%2\u0006\u0010&\u001a\u00020\bH\u0016J\r\u0010'\u001a\u00028\u0000H&¢\u0006\u0002\u0010(J\b\u0010)\u001a\u00020*H\u0016J\b\u0010+\u001a\u00020\bH\u0016J\b\u0010,\u001a\u00020-H\u0016J\b\u0010.\u001a\u00020-H\u0016J+\u0010/\u001a\u00020\u001a2\u0006\u00100\u001a\u0002012\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u001c0\"2\u0006\u00103\u001a\u00020\bH\u0017¢\u0006\u0002\u00104J\u0010\u00105\u001a\u00020-2\u0006\u00100\u001a\u000201H\u0016J\u0010\u00106\u001a\u00020-2\u0006\u00107\u001a\u00020\u001cH\u0016J \u00108\u001a\u00020\u001a2\u0006\u00100\u001a\u0002012\u0006\u00109\u001a\u00020:2\u0006\u00103\u001a\u00020\bH\u0016J*\u00108\u001a\u00020\u001a2\u0006\u00100\u001a\u0002012\u0006\u00109\u001a\u00020:2\u0006\u00103\u001a\u00020\b2\b\u0010;\u001a\u0004\u0018\u00010<H\u0016JL\u0010=\u001a\u00020\u001a2\u0006\u00100\u001a\u0002012\u0006\u00109\u001a\u00020>2\u0006\u00103\u001a\u00020\b2\b\u0010?\u001a\u0004\u0018\u00010:2\u0006\u0010@\u001a\u00020\b2\u0006\u0010A\u001a\u00020\b2\u0006\u0010B\u001a\u00020\b2\b\u0010;\u001a\u0004\u0018\u00010<H\u0017J\b\u0010C\u001a\u00020\u001aH\u0016R\u0015\u0010\n\u001a\u0004\u0018\u00010\r8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0003\u001a\u00020\u00048\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0013\u001a\u00020\u00148G¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0005\u001a\u00020\u00068\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006D"}, d2 = {"Landroidx/fragment/app/FragmentHostCallback;", "H", "Landroidx/fragment/app/FragmentContainer;", "context", "Landroid/content/Context;", "handler", "Landroid/os/Handler;", "windowAnimations", "", "(Landroid/content/Context;Landroid/os/Handler;I)V", "activity", "Landroidx/fragment/app/FragmentActivity;", "(Landroidx/fragment/app/FragmentActivity;)V", "Landroid/app/Activity;", "(Landroid/app/Activity;Landroid/content/Context;Landroid/os/Handler;I)V", "getActivity", "()Landroid/app/Activity;", "getContext", "()Landroid/content/Context;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "getFragmentManager", "()Landroidx/fragment/app/FragmentManager;", "getHandler", "()Landroid/os/Handler;", "onDump", "", "prefix", "", "fd", "Ljava/io/FileDescriptor;", "writer", "Ljava/io/PrintWriter;", "args", "", "(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V", "onFindViewById", "Landroid/view/View;", "id", "onGetHost", "()Ljava/lang/Object;", "onGetLayoutInflater", "Landroid/view/LayoutInflater;", "onGetWindowAnimations", "onHasView", "", "onHasWindowAnimations", "onRequestPermissionsFromFragment", "fragment", "Landroidx/fragment/app/Fragment;", "permissions", "requestCode", "(Landroidx/fragment/app/Fragment;[Ljava/lang/String;I)V", "onShouldSaveFragmentState", "onShouldShowRequestPermissionRationale", "permission", "onStartActivityFromFragment", "intent", "Landroid/content/Intent;", "options", "Landroid/os/Bundle;", "onStartIntentSenderFromFragment", "Landroid/content/IntentSender;", "fillInIntent", "flagsMask", "flagsValues", "extraFlags", "onSupportInvalidateOptionsMenu", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class FragmentHostCallback<H> extends androidx.fragment.app.FragmentContainer {
    private final android.app.Activity activity;
    private final android.content.Context context;
    private final androidx.fragment.app.FragmentManager fragmentManager;
    private final android.os.Handler handler;
    private final int windowAnimations;

    public FragmentHostCallback(android.app.Activity r2, android.content.Context r3, android.os.Handler r4, int r5) {
            r1 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "handler"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r1.<init>()
            r1.activity = r2
            r1.context = r3
            r1.handler = r4
            r1.windowAnimations = r5
            androidx.fragment.app.FragmentManagerImpl r0 = new androidx.fragment.app.FragmentManagerImpl
            r0.<init>()
            androidx.fragment.app.FragmentManager r0 = (androidx.fragment.app.FragmentManager) r0
            r1.fragmentManager = r0
            return
    }

    public FragmentHostCallback(android.content.Context r2, android.os.Handler r3, int r4) {
            r1 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "handler"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            boolean r0 = r2 instanceof android.app.Activity
            if (r0 == 0) goto L13
            r0 = r2
            android.app.Activity r0 = (android.app.Activity) r0
            goto L14
        L13:
            r0 = 0
        L14:
            r1.<init>(r0, r2, r3, r4)
            return
    }

    public FragmentHostCallback(androidx.fragment.app.FragmentActivity r5) {
            r4 = this;
            java.lang.String r0 = "activity"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = r5
            android.app.Activity r0 = (android.app.Activity) r0
            r1 = r5
            android.content.Context r1 = (android.content.Context) r1
            android.os.Handler r2 = new android.os.Handler
            r2.<init>()
            r3 = 0
            r4.<init>(r0, r1, r2, r3)
            return
    }

    public final android.app.Activity getActivity() {
            r1 = this;
            android.app.Activity r0 = r1.activity
            return r0
    }

    public final android.content.Context getContext() {
            r1 = this;
            android.content.Context r0 = r1.context
            return r0
    }

    public final androidx.fragment.app.FragmentManager getFragmentManager() {
            r1 = this;
            androidx.fragment.app.FragmentManager r0 = r1.fragmentManager
            return r0
    }

    public final android.os.Handler getHandler() {
            r1 = this;
            android.os.Handler r0 = r1.handler
            return r0
    }

    public void onDump(java.lang.String r2, java.io.FileDescriptor r3, java.io.PrintWriter r4, java.lang.String[] r5) {
            r1 = this;
            java.lang.String r0 = "prefix"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "writer"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            return
    }

    @Override // androidx.fragment.app.FragmentContainer
    public android.view.View onFindViewById(int r2) {
            r1 = this;
            r0 = 0
            return r0
    }

    public abstract H onGetHost();

    public android.view.LayoutInflater onGetLayoutInflater() {
            r2 = this;
            android.content.Context r0 = r2.context
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            java.lang.String r1 = "from(context)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    public int onGetWindowAnimations() {
            r1 = this;
            int r0 = r1.windowAnimations
            return r0
    }

    @Override // androidx.fragment.app.FragmentContainer
    public boolean onHasView() {
            r1 = this;
            r0 = 1
            return r0
    }

    public boolean onHasWindowAnimations() {
            r1 = this;
            r0 = 1
            return r0
    }

    @kotlin.Deprecated(message = "Have your FragmentHostCallback implement {@link ActivityResultRegistryOwner}\n      to allow Fragments to use\n      {@link Fragment#registerForActivityResult(ActivityResultContract, ActivityResultCallback)}\n      with {@link RequestMultiplePermissions}. This method will still be called when Fragments\n      call the deprecated <code>requestPermissions()</code> method.")
    public void onRequestPermissionsFromFragment(androidx.fragment.app.Fragment r2, java.lang.String[] r3, int r4) {
            r1 = this;
            java.lang.String r0 = "fragment"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "permissions"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            return
    }

    public boolean onShouldSaveFragmentState(androidx.fragment.app.Fragment r2) {
            r1 = this;
            java.lang.String r0 = "fragment"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r0 = 1
            return r0
    }

    public boolean onShouldShowRequestPermissionRationale(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "permission"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r0 = 0
            return r0
    }

    public void onStartActivityFromFragment(androidx.fragment.app.Fragment r2, android.content.Intent r3, int r4) {
            r1 = this;
            java.lang.String r0 = "fragment"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "intent"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = 0
            r1.onStartActivityFromFragment(r2, r3, r4, r0)
            return
    }

    public void onStartActivityFromFragment(androidx.fragment.app.Fragment r3, android.content.Intent r4, int r5, android.os.Bundle r6) {
            r2 = this;
            java.lang.String r0 = "fragment"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "intent"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = -1
            if (r5 != r0) goto Lf
            r0 = 1
            goto L10
        Lf:
            r0 = 0
        L10:
            if (r0 == 0) goto L18
            android.content.Context r0 = r2.context
            androidx.core.content.ContextCompat.startActivity(r0, r4, r6)
            return
        L18:
            r0 = 0
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Starting activity with a requestCode requires a FragmentActivity host"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    @kotlin.Deprecated(message = "Have your FragmentHostCallback implement {@link ActivityResultRegistryOwner}\n      to allow Fragments to use\n      {@link Fragment#registerForActivityResult(ActivityResultContract, ActivityResultCallback)}\n      with {@link StartIntentSenderForResult}. This method will still be called when Fragments\n      call the deprecated <code>startIntentSenderForResult()</code> method.")
    public void onStartIntentSenderFromFragment(androidx.fragment.app.Fragment r10, android.content.IntentSender r11, int r12, android.content.Intent r13, int r14, int r15, int r16, android.os.Bundle r17) throws android.content.IntentSender.SendIntentException {
            r9 = this;
            java.lang.String r0 = "fragment"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.lang.String r0 = "intent"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            r0 = -1
            if (r12 != r0) goto Lf
            r0 = 1
            goto L10
        Lf:
            r0 = 0
        L10:
            java.lang.String r1 = "Starting intent sender with a requestCode requires a FragmentActivity host"
            if (r0 == 0) goto L34
            android.app.Activity r4 = r9.activity
            if (r4 == 0) goto L28
            r1 = r4
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            r8 = r17
            androidx.core.app.ActivityCompat.startIntentSenderForResult(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        L28:
            r2 = 0
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r1 = r1.toString()
            r2.<init>(r1)
            throw r2
        L34:
            r2 = 0
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r1 = r1.toString()
            r2.<init>(r1)
            throw r2
    }

    public void onSupportInvalidateOptionsMenu() {
            r0 = this;
            return
    }
}
