package androidx.cursoradapter.widget;

/* JADX INFO: loaded from: classes.dex */
public abstract class ResourceCursorAdapter extends androidx.cursoradapter.widget.CursorAdapter {
    private int mDropDownLayout;
    private android.view.LayoutInflater mInflater;
    private int mLayout;

    @java.lang.Deprecated
    public ResourceCursorAdapter(android.content.Context r2, int r3, android.database.Cursor r4) {
            r1 = this;
            r1.<init>(r2, r4)
            r1.mDropDownLayout = r3
            r1.mLayout = r3
            java.lang.String r0 = "layout_inflater"
            java.lang.Object r0 = r2.getSystemService(r0)
            android.view.LayoutInflater r0 = (android.view.LayoutInflater) r0
            r1.mInflater = r0
            return
    }

    public ResourceCursorAdapter(android.content.Context r2, int r3, android.database.Cursor r4, int r5) {
            r1 = this;
            r1.<init>(r2, r4, r5)
            r1.mDropDownLayout = r3
            r1.mLayout = r3
            java.lang.String r0 = "layout_inflater"
            java.lang.Object r0 = r2.getSystemService(r0)
            android.view.LayoutInflater r0 = (android.view.LayoutInflater) r0
            r1.mInflater = r0
            return
    }

    @java.lang.Deprecated
    public ResourceCursorAdapter(android.content.Context r2, int r3, android.database.Cursor r4, boolean r5) {
            r1 = this;
            r1.<init>(r2, r4, r5)
            r1.mDropDownLayout = r3
            r1.mLayout = r3
            java.lang.String r0 = "layout_inflater"
            java.lang.Object r0 = r2.getSystemService(r0)
            android.view.LayoutInflater r0 = (android.view.LayoutInflater) r0
            r1.mInflater = r0
            return
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter
    public android.view.View newDropDownView(android.content.Context r4, android.database.Cursor r5, android.view.ViewGroup r6) {
            r3 = this;
            android.view.LayoutInflater r0 = r3.mInflater
            int r1 = r3.mDropDownLayout
            r2 = 0
            android.view.View r0 = r0.inflate(r1, r6, r2)
            return r0
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter
    public android.view.View newView(android.content.Context r4, android.database.Cursor r5, android.view.ViewGroup r6) {
            r3 = this;
            android.view.LayoutInflater r0 = r3.mInflater
            int r1 = r3.mLayout
            r2 = 0
            android.view.View r0 = r0.inflate(r1, r6, r2)
            return r0
    }

    public void setDropDownViewResource(int r1) {
            r0 = this;
            r0.mDropDownLayout = r1
            return
    }

    public void setViewResource(int r1) {
            r0 = this;
            r0.mLayout = r1
            return
    }
}
