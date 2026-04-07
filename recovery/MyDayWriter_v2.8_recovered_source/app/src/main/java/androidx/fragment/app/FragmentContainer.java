package androidx.fragment.app;

/* JADX INFO: loaded from: classes.dex */
public abstract class FragmentContainer {
    public FragmentContainer() {
            r0 = this;
            r0.<init>()
            return
    }

    @java.lang.Deprecated
    public androidx.fragment.app.Fragment instantiate(android.content.Context r2, java.lang.String r3, android.os.Bundle r4) {
            r1 = this;
            androidx.fragment.app.Fragment r0 = androidx.fragment.app.Fragment.instantiate(r2, r3, r4)
            return r0
    }

    public abstract android.view.View onFindViewById(int r1);

    public abstract boolean onHasView();
}
