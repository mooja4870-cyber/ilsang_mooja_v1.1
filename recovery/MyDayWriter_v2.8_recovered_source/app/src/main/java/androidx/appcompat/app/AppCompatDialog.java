package androidx.appcompat.app;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatDialog extends androidx.activity.ComponentDialog implements androidx.appcompat.app.AppCompatCallback {
    private androidx.appcompat.app.AppCompatDelegate mDelegate;
    private final androidx.core.view.KeyEventDispatcher.Component mKeyDispatcher;

    public AppCompatDialog(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public AppCompatDialog(android.content.Context r3, int r4) {
            r2 = this;
            int r0 = getThemeResId(r3, r4)
            r2.<init>(r3, r0)
            androidx.appcompat.app.AppCompatDialog$$ExternalSyntheticLambda0 r0 = new androidx.appcompat.app.AppCompatDialog$$ExternalSyntheticLambda0
            r0.<init>(r2)
            r2.mKeyDispatcher = r0
            androidx.appcompat.app.AppCompatDelegate r0 = r2.getDelegate()
            int r1 = getThemeResId(r3, r4)
            r0.setTheme(r1)
            r1 = 0
            r0.onCreate(r1)
            return
    }

    protected AppCompatDialog(android.content.Context r2, boolean r3, android.content.DialogInterface.OnCancelListener r4) {
            r1 = this;
            r1.<init>(r2)
            androidx.appcompat.app.AppCompatDialog$$ExternalSyntheticLambda0 r0 = new androidx.appcompat.app.AppCompatDialog$$ExternalSyntheticLambda0
            r0.<init>(r1)
            r1.mKeyDispatcher = r0
            r1.setCancelable(r3)
            r1.setOnCancelListener(r4)
            return
    }

    private static int getThemeResId(android.content.Context r4, int r5) {
            if (r5 != 0) goto L13
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            android.content.res.Resources$Theme r1 = r4.getTheme()
            int r2 = androidx.appcompat.R.attr.dialogTheme
            r3 = 1
            r1.resolveAttribute(r2, r0, r3)
            int r5 = r0.resourceId
        L13:
            return r5
    }

    @Override // androidx.activity.ComponentDialog, android.app.Dialog
    public void addContentView(android.view.View r2, android.view.ViewGroup.LayoutParams r3) {
            r1 = this;
            r1.initializeViewTreeOwners()
            androidx.appcompat.app.AppCompatDelegate r0 = r1.getDelegate()
            r0.addContentView(r2, r3)
            return
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
            r1 = this;
            super.dismiss()
            androidx.appcompat.app.AppCompatDelegate r0 = r1.getDelegate()
            r0.onDestroy()
            return
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchKeyEvent(android.view.KeyEvent r3) {
            r2 = this;
            android.view.Window r0 = r2.getWindow()
            android.view.View r0 = r0.getDecorView()
            androidx.core.view.KeyEventDispatcher$Component r1 = r2.mKeyDispatcher
            boolean r1 = androidx.core.view.KeyEventDispatcher.dispatchKeyEvent(r1, r0, r2, r3)
            return r1
    }

    @Override // android.app.Dialog
    public <T extends android.view.View> T findViewById(int r2) {
            r1 = this;
            androidx.appcompat.app.AppCompatDelegate r0 = r1.getDelegate()
            android.view.View r0 = r0.findViewById(r2)
            return r0
    }

    public androidx.appcompat.app.AppCompatDelegate getDelegate() {
            r1 = this;
            androidx.appcompat.app.AppCompatDelegate r0 = r1.mDelegate
            if (r0 != 0) goto La
            androidx.appcompat.app.AppCompatDelegate r0 = androidx.appcompat.app.AppCompatDelegate.create(r1, r1)
            r1.mDelegate = r0
        La:
            androidx.appcompat.app.AppCompatDelegate r0 = r1.mDelegate
            return r0
    }

    public androidx.appcompat.app.ActionBar getSupportActionBar() {
            r1 = this;
            androidx.appcompat.app.AppCompatDelegate r0 = r1.getDelegate()
            androidx.appcompat.app.ActionBar r0 = r0.getSupportActionBar()
            return r0
    }

    @Override // android.app.Dialog
    public void invalidateOptionsMenu() {
            r1 = this;
            androidx.appcompat.app.AppCompatDelegate r0 = r1.getDelegate()
            r0.invalidateOptionsMenu()
            return
    }

    @Override // androidx.activity.ComponentDialog, android.app.Dialog
    protected void onCreate(android.os.Bundle r2) {
            r1 = this;
            androidx.appcompat.app.AppCompatDelegate r0 = r1.getDelegate()
            r0.installViewFactory()
            super.onCreate(r2)
            androidx.appcompat.app.AppCompatDelegate r0 = r1.getDelegate()
            r0.onCreate(r2)
            return
    }

    @Override // androidx.activity.ComponentDialog, android.app.Dialog
    protected void onStop() {
            r1 = this;
            super.onStop()
            androidx.appcompat.app.AppCompatDelegate r0 = r1.getDelegate()
            r0.onStop()
            return
    }

    @Override // androidx.appcompat.app.AppCompatCallback
    public void onSupportActionModeFinished(androidx.appcompat.view.ActionMode r1) {
            r0 = this;
            return
    }

    @Override // androidx.appcompat.app.AppCompatCallback
    public void onSupportActionModeStarted(androidx.appcompat.view.ActionMode r1) {
            r0 = this;
            return
    }

    @Override // androidx.appcompat.app.AppCompatCallback
    public androidx.appcompat.view.ActionMode onWindowStartingSupportActionMode(androidx.appcompat.view.ActionMode.Callback r2) {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // androidx.activity.ComponentDialog, android.app.Dialog
    public void setContentView(int r2) {
            r1 = this;
            r1.initializeViewTreeOwners()
            androidx.appcompat.app.AppCompatDelegate r0 = r1.getDelegate()
            r0.setContentView(r2)
            return
    }

    @Override // androidx.activity.ComponentDialog, android.app.Dialog
    public void setContentView(android.view.View r2) {
            r1 = this;
            r1.initializeViewTreeOwners()
            androidx.appcompat.app.AppCompatDelegate r0 = r1.getDelegate()
            r0.setContentView(r2)
            return
    }

    @Override // androidx.activity.ComponentDialog, android.app.Dialog
    public void setContentView(android.view.View r2, android.view.ViewGroup.LayoutParams r3) {
            r1 = this;
            r1.initializeViewTreeOwners()
            androidx.appcompat.app.AppCompatDelegate r0 = r1.getDelegate()
            r0.setContentView(r2, r3)
            return
    }

    @Override // android.app.Dialog
    public void setTitle(int r3) {
            r2 = this;
            super.setTitle(r3)
            androidx.appcompat.app.AppCompatDelegate r0 = r2.getDelegate()
            android.content.Context r1 = r2.getContext()
            java.lang.String r1 = r1.getString(r3)
            r0.setTitle(r1)
            return
    }

    @Override // android.app.Dialog
    public void setTitle(java.lang.CharSequence r2) {
            r1 = this;
            super.setTitle(r2)
            androidx.appcompat.app.AppCompatDelegate r0 = r1.getDelegate()
            r0.setTitle(r2)
            return
    }

    boolean superDispatchKeyEvent(android.view.KeyEvent r2) {
            r1 = this;
            boolean r0 = super.dispatchKeyEvent(r2)
            return r0
    }

    public boolean supportRequestWindowFeature(int r2) {
            r1 = this;
            androidx.appcompat.app.AppCompatDelegate r0 = r1.getDelegate()
            boolean r0 = r0.requestWindowFeature(r2)
            return r0
    }
}
