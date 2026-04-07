package androidx.fragment.app;

/* JADX INFO: loaded from: classes.dex */
public class FragmentController {
    private final androidx.fragment.app.FragmentHostCallback<?> mHost;

    private FragmentController(androidx.fragment.app.FragmentHostCallback<?> r1) {
            r0 = this;
            r0.<init>()
            r0.mHost = r1
            return
    }

    public static androidx.fragment.app.FragmentController createController(androidx.fragment.app.FragmentHostCallback<?> r2) {
            androidx.fragment.app.FragmentController r0 = new androidx.fragment.app.FragmentController
            java.lang.String r1 = "callbacks == null"
            java.lang.Object r1 = androidx.core.util.Preconditions.checkNotNull(r2, r1)
            androidx.fragment.app.FragmentHostCallback r1 = (androidx.fragment.app.FragmentHostCallback) r1
            r0.<init>(r1)
            return r0
    }

    public void attachHost(androidx.fragment.app.Fragment r4) {
            r3 = this;
            androidx.fragment.app.FragmentHostCallback<?> r0 = r3.mHost
            androidx.fragment.app.FragmentManager r0 = r0.getFragmentManager()
            androidx.fragment.app.FragmentHostCallback<?> r1 = r3.mHost
            androidx.fragment.app.FragmentHostCallback<?> r2 = r3.mHost
            r0.attachController(r1, r2, r4)
            return
    }

    public void dispatchActivityCreated() {
            r1 = this;
            androidx.fragment.app.FragmentHostCallback<?> r0 = r1.mHost
            androidx.fragment.app.FragmentManager r0 = r0.getFragmentManager()
            r0.dispatchActivityCreated()
            return
    }

    @java.lang.Deprecated
    public void dispatchConfigurationChanged(android.content.res.Configuration r3) {
            r2 = this;
            androidx.fragment.app.FragmentHostCallback<?> r0 = r2.mHost
            androidx.fragment.app.FragmentManager r0 = r0.getFragmentManager()
            r1 = 1
            r0.dispatchConfigurationChanged(r3, r1)
            return
    }

    public boolean dispatchContextItemSelected(android.view.MenuItem r2) {
            r1 = this;
            androidx.fragment.app.FragmentHostCallback<?> r0 = r1.mHost
            androidx.fragment.app.FragmentManager r0 = r0.getFragmentManager()
            boolean r0 = r0.dispatchContextItemSelected(r2)
            return r0
    }

    public void dispatchCreate() {
            r1 = this;
            androidx.fragment.app.FragmentHostCallback<?> r0 = r1.mHost
            androidx.fragment.app.FragmentManager r0 = r0.getFragmentManager()
            r0.dispatchCreate()
            return
    }

    @java.lang.Deprecated
    public boolean dispatchCreateOptionsMenu(android.view.Menu r2, android.view.MenuInflater r3) {
            r1 = this;
            androidx.fragment.app.FragmentHostCallback<?> r0 = r1.mHost
            androidx.fragment.app.FragmentManager r0 = r0.getFragmentManager()
            boolean r0 = r0.dispatchCreateOptionsMenu(r2, r3)
            return r0
    }

    public void dispatchDestroy() {
            r1 = this;
            androidx.fragment.app.FragmentHostCallback<?> r0 = r1.mHost
            androidx.fragment.app.FragmentManager r0 = r0.getFragmentManager()
            r0.dispatchDestroy()
            return
    }

    public void dispatchDestroyView() {
            r1 = this;
            androidx.fragment.app.FragmentHostCallback<?> r0 = r1.mHost
            androidx.fragment.app.FragmentManager r0 = r0.getFragmentManager()
            r0.dispatchDestroyView()
            return
    }

    @java.lang.Deprecated
    public void dispatchLowMemory() {
            r2 = this;
            androidx.fragment.app.FragmentHostCallback<?> r0 = r2.mHost
            androidx.fragment.app.FragmentManager r0 = r0.getFragmentManager()
            r1 = 1
            r0.dispatchLowMemory(r1)
            return
    }

    @java.lang.Deprecated
    public void dispatchMultiWindowModeChanged(boolean r3) {
            r2 = this;
            androidx.fragment.app.FragmentHostCallback<?> r0 = r2.mHost
            androidx.fragment.app.FragmentManager r0 = r0.getFragmentManager()
            r1 = 1
            r0.dispatchMultiWindowModeChanged(r3, r1)
            return
    }

    @java.lang.Deprecated
    public boolean dispatchOptionsItemSelected(android.view.MenuItem r2) {
            r1 = this;
            androidx.fragment.app.FragmentHostCallback<?> r0 = r1.mHost
            androidx.fragment.app.FragmentManager r0 = r0.getFragmentManager()
            boolean r0 = r0.dispatchOptionsItemSelected(r2)
            return r0
    }

    @java.lang.Deprecated
    public void dispatchOptionsMenuClosed(android.view.Menu r2) {
            r1 = this;
            androidx.fragment.app.FragmentHostCallback<?> r0 = r1.mHost
            androidx.fragment.app.FragmentManager r0 = r0.getFragmentManager()
            r0.dispatchOptionsMenuClosed(r2)
            return
    }

    public void dispatchPause() {
            r1 = this;
            androidx.fragment.app.FragmentHostCallback<?> r0 = r1.mHost
            androidx.fragment.app.FragmentManager r0 = r0.getFragmentManager()
            r0.dispatchPause()
            return
    }

    @java.lang.Deprecated
    public void dispatchPictureInPictureModeChanged(boolean r3) {
            r2 = this;
            androidx.fragment.app.FragmentHostCallback<?> r0 = r2.mHost
            androidx.fragment.app.FragmentManager r0 = r0.getFragmentManager()
            r1 = 1
            r0.dispatchPictureInPictureModeChanged(r3, r1)
            return
    }

    @java.lang.Deprecated
    public boolean dispatchPrepareOptionsMenu(android.view.Menu r2) {
            r1 = this;
            androidx.fragment.app.FragmentHostCallback<?> r0 = r1.mHost
            androidx.fragment.app.FragmentManager r0 = r0.getFragmentManager()
            boolean r0 = r0.dispatchPrepareOptionsMenu(r2)
            return r0
    }

    @java.lang.Deprecated
    public void dispatchReallyStop() {
            r0 = this;
            return
    }

    public void dispatchResume() {
            r1 = this;
            androidx.fragment.app.FragmentHostCallback<?> r0 = r1.mHost
            androidx.fragment.app.FragmentManager r0 = r0.getFragmentManager()
            r0.dispatchResume()
            return
    }

    public void dispatchStart() {
            r1 = this;
            androidx.fragment.app.FragmentHostCallback<?> r0 = r1.mHost
            androidx.fragment.app.FragmentManager r0 = r0.getFragmentManager()
            r0.dispatchStart()
            return
    }

    public void dispatchStop() {
            r1 = this;
            androidx.fragment.app.FragmentHostCallback<?> r0 = r1.mHost
            androidx.fragment.app.FragmentManager r0 = r0.getFragmentManager()
            r0.dispatchStop()
            return
    }

    @java.lang.Deprecated
    public void doLoaderDestroy() {
            r0 = this;
            return
    }

    @java.lang.Deprecated
    public void doLoaderRetain() {
            r0 = this;
            return
    }

    @java.lang.Deprecated
    public void doLoaderStart() {
            r0 = this;
            return
    }

    @java.lang.Deprecated
    public void doLoaderStop(boolean r1) {
            r0 = this;
            return
    }

    @java.lang.Deprecated
    public void dumpLoaders(java.lang.String r1, java.io.FileDescriptor r2, java.io.PrintWriter r3, java.lang.String[] r4) {
            r0 = this;
            return
    }

    public boolean execPendingActions() {
            r2 = this;
            androidx.fragment.app.FragmentHostCallback<?> r0 = r2.mHost
            androidx.fragment.app.FragmentManager r0 = r0.getFragmentManager()
            r1 = 1
            boolean r0 = r0.execPendingActions(r1)
            return r0
    }

    public androidx.fragment.app.Fragment findFragmentByWho(java.lang.String r2) {
            r1 = this;
            androidx.fragment.app.FragmentHostCallback<?> r0 = r1.mHost
            androidx.fragment.app.FragmentManager r0 = r0.getFragmentManager()
            androidx.fragment.app.Fragment r0 = r0.findFragmentByWho(r2)
            return r0
    }

    public java.util.List<androidx.fragment.app.Fragment> getActiveFragments(java.util.List<androidx.fragment.app.Fragment> r2) {
            r1 = this;
            androidx.fragment.app.FragmentHostCallback<?> r0 = r1.mHost
            androidx.fragment.app.FragmentManager r0 = r0.getFragmentManager()
            java.util.List r0 = r0.getActiveFragments()
            return r0
    }

    public int getActiveFragmentsCount() {
            r1 = this;
            androidx.fragment.app.FragmentHostCallback<?> r0 = r1.mHost
            androidx.fragment.app.FragmentManager r0 = r0.getFragmentManager()
            int r0 = r0.getActiveFragmentCount()
            return r0
    }

    public androidx.fragment.app.FragmentManager getSupportFragmentManager() {
            r1 = this;
            androidx.fragment.app.FragmentHostCallback<?> r0 = r1.mHost
            androidx.fragment.app.FragmentManager r0 = r0.getFragmentManager()
            return r0
    }

    @java.lang.Deprecated
    public androidx.loader.app.LoaderManager getSupportLoaderManager() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Loaders are managed separately from FragmentController, use LoaderManager.getInstance() to obtain a LoaderManager."
            r0.<init>(r1)
            throw r0
    }

    public void noteStateNotSaved() {
            r1 = this;
            androidx.fragment.app.FragmentHostCallback<?> r0 = r1.mHost
            androidx.fragment.app.FragmentManager r0 = r0.getFragmentManager()
            r0.noteStateNotSaved()
            return
    }

    public android.view.View onCreateView(android.view.View r2, java.lang.String r3, android.content.Context r4, android.util.AttributeSet r5) {
            r1 = this;
            androidx.fragment.app.FragmentHostCallback<?> r0 = r1.mHost
            androidx.fragment.app.FragmentManager r0 = r0.getFragmentManager()
            android.view.LayoutInflater$Factory2 r0 = r0.getLayoutInflaterFactory()
            android.view.View r0 = r0.onCreateView(r2, r3, r4, r5)
            return r0
    }

    @java.lang.Deprecated
    public void reportLoaderStart() {
            r0 = this;
            return
    }

    @java.lang.Deprecated
    public void restoreAllState(android.os.Parcelable r2, androidx.fragment.app.FragmentManagerNonConfig r3) {
            r1 = this;
            androidx.fragment.app.FragmentHostCallback<?> r0 = r1.mHost
            androidx.fragment.app.FragmentManager r0 = r0.getFragmentManager()
            r0.restoreAllState(r2, r3)
            return
    }

    @java.lang.Deprecated
    public void restoreAllState(android.os.Parcelable r4, java.util.List<androidx.fragment.app.Fragment> r5) {
            r3 = this;
            androidx.fragment.app.FragmentHostCallback<?> r0 = r3.mHost
            androidx.fragment.app.FragmentManager r0 = r0.getFragmentManager()
            androidx.fragment.app.FragmentManagerNonConfig r1 = new androidx.fragment.app.FragmentManagerNonConfig
            r2 = 0
            r1.<init>(r5, r2, r2)
            r0.restoreAllState(r4, r1)
            return
    }

    @java.lang.Deprecated
    public void restoreLoaderNonConfig(androidx.collection.SimpleArrayMap<java.lang.String, androidx.loader.app.LoaderManager> r1) {
            r0 = this;
            return
    }

    @java.lang.Deprecated
    public void restoreSaveState(android.os.Parcelable r3) {
            r2 = this;
            androidx.fragment.app.FragmentHostCallback<?> r0 = r2.mHost
            boolean r0 = r0 instanceof androidx.lifecycle.ViewModelStoreOwner
            if (r0 == 0) goto L10
            androidx.fragment.app.FragmentHostCallback<?> r0 = r2.mHost
            androidx.fragment.app.FragmentManager r0 = r0.getFragmentManager()
            r0.restoreSaveState(r3)
            return
        L10:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Your FragmentHostCallback must implement ViewModelStoreOwner to call restoreSaveState(). Call restoreAllState()  if you're still using retainNestedNonConfig()."
            r0.<init>(r1)
            throw r0
    }

    @java.lang.Deprecated
    public androidx.collection.SimpleArrayMap<java.lang.String, androidx.loader.app.LoaderManager> retainLoaderNonConfig() {
            r1 = this;
            r0 = 0
            return r0
    }

    @java.lang.Deprecated
    public androidx.fragment.app.FragmentManagerNonConfig retainNestedNonConfig() {
            r1 = this;
            androidx.fragment.app.FragmentHostCallback<?> r0 = r1.mHost
            androidx.fragment.app.FragmentManager r0 = r0.getFragmentManager()
            androidx.fragment.app.FragmentManagerNonConfig r0 = r0.retainNonConfig()
            return r0
    }

    @java.lang.Deprecated
    public java.util.List<androidx.fragment.app.Fragment> retainNonConfig() {
            r3 = this;
            androidx.fragment.app.FragmentHostCallback<?> r0 = r3.mHost
            androidx.fragment.app.FragmentManager r0 = r0.getFragmentManager()
            androidx.fragment.app.FragmentManagerNonConfig r0 = r0.retainNonConfig()
            if (r0 == 0) goto L1c
            java.util.Collection r1 = r0.getFragments()
            if (r1 == 0) goto L1c
            java.util.ArrayList r1 = new java.util.ArrayList
            java.util.Collection r2 = r0.getFragments()
            r1.<init>(r2)
            goto L1d
        L1c:
            r1 = 0
        L1d:
            return r1
    }

    @java.lang.Deprecated
    public android.os.Parcelable saveAllState() {
            r1 = this;
            androidx.fragment.app.FragmentHostCallback<?> r0 = r1.mHost
            androidx.fragment.app.FragmentManager r0 = r0.getFragmentManager()
            android.os.Parcelable r0 = r0.saveAllState()
            return r0
    }
}
