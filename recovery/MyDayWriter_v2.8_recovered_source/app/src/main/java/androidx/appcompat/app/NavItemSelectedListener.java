package androidx.appcompat.app;

/* JADX INFO: loaded from: classes.dex */
class NavItemSelectedListener implements android.widget.AdapterView.OnItemSelectedListener {
    private final androidx.appcompat.app.ActionBar.OnNavigationListener mListener;

    public NavItemSelectedListener(androidx.appcompat.app.ActionBar.OnNavigationListener r1) {
            r0 = this;
            r0.<init>()
            r0.mListener = r1
            return
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(android.widget.AdapterView<?> r2, android.view.View r3, int r4, long r5) {
            r1 = this;
            androidx.appcompat.app.ActionBar$OnNavigationListener r0 = r1.mListener
            if (r0 == 0) goto L9
            androidx.appcompat.app.ActionBar$OnNavigationListener r0 = r1.mListener
            r0.onNavigationItemSelected(r4, r5)
        L9:
            return
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(android.widget.AdapterView<?> r1) {
            r0 = this;
            return
    }
}
