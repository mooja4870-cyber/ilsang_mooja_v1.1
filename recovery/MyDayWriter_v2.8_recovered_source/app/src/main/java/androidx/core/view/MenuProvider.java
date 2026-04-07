package androidx.core.view;

/* JADX INFO: loaded from: classes.dex */
public interface MenuProvider {
    void onCreateMenu(android.view.Menu r1, android.view.MenuInflater r2);

    default void onMenuClosed(android.view.Menu r1) {
            r0 = this;
            return
    }

    boolean onMenuItemSelected(android.view.MenuItem r1);

    default void onPrepareMenu(android.view.Menu r1) {
            r0 = this;
            return
    }
}
