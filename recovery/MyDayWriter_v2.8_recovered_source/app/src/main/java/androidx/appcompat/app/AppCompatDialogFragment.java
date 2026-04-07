package androidx.appcompat.app;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatDialogFragment extends androidx.fragment.app.DialogFragment {
    public AppCompatDialogFragment() {
            r0 = this;
            r0.<init>()
            return
    }

    public AppCompatDialogFragment(int r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // androidx.fragment.app.DialogFragment
    public android.app.Dialog onCreateDialog(android.os.Bundle r4) {
            r3 = this;
            androidx.appcompat.app.AppCompatDialog r0 = new androidx.appcompat.app.AppCompatDialog
            android.content.Context r1 = r3.getContext()
            int r2 = r3.getTheme()
            r0.<init>(r1, r2)
            return r0
    }

    @Override // androidx.fragment.app.DialogFragment
    public void setupDialog(android.app.Dialog r4, int r5) {
            r3 = this;
            boolean r0 = r4 instanceof androidx.appcompat.app.AppCompatDialog
            if (r0 == 0) goto L19
            r0 = r4
            androidx.appcompat.app.AppCompatDialog r0 = (androidx.appcompat.app.AppCompatDialog) r0
            switch(r5) {
                case 1: goto L14;
                case 2: goto L14;
                case 3: goto Lb;
                default: goto La;
            }
        La:
            goto L18
        Lb:
            android.view.Window r1 = r4.getWindow()
            r2 = 24
            r1.addFlags(r2)
        L14:
            r1 = 1
            r0.supportRequestWindowFeature(r1)
        L18:
            goto L1c
        L19:
            super.setupDialog(r4, r5)
        L1c:
            return
    }
}
