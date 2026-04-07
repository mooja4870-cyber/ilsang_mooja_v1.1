package androidx.fragment.app;

/* JADX INFO: loaded from: classes.dex */
final class FragmentManagerViewModel extends androidx.lifecycle.ViewModel {
    private static final androidx.lifecycle.ViewModelProvider.Factory FACTORY = null;
    private static final java.lang.String TAG = "FragmentManager";
    private final java.util.HashMap<java.lang.String, androidx.fragment.app.FragmentManagerViewModel> mChildNonConfigs;
    private boolean mHasBeenCleared;
    private boolean mHasSavedSnapshot;
    private boolean mIsStateSaved;
    private final java.util.HashMap<java.lang.String, androidx.fragment.app.Fragment> mRetainedFragments;
    private final boolean mStateAutomaticallySaved;
    private final java.util.HashMap<java.lang.String, androidx.lifecycle.ViewModelStore> mViewModelStores;


    static {
            androidx.fragment.app.FragmentManagerViewModel$1 r0 = new androidx.fragment.app.FragmentManagerViewModel$1
            r0.<init>()
            androidx.fragment.app.FragmentManagerViewModel.FACTORY = r0
            return
    }

    FragmentManagerViewModel(boolean r2) {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.mRetainedFragments = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.mChildNonConfigs = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.mViewModelStores = r0
            r0 = 0
            r1.mHasBeenCleared = r0
            r1.mHasSavedSnapshot = r0
            r1.mIsStateSaved = r0
            r1.mStateAutomaticallySaved = r2
            return
    }

    private void clearNonConfigStateInternal(java.lang.String r6, boolean r7) {
            r5 = this;
            java.util.HashMap<java.lang.String, androidx.fragment.app.FragmentManagerViewModel> r0 = r5.mChildNonConfigs
            java.lang.Object r0 = r0.get(r6)
            androidx.fragment.app.FragmentManagerViewModel r0 = (androidx.fragment.app.FragmentManagerViewModel) r0
            if (r0 == 0) goto L37
            if (r7 == 0) goto L2f
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.HashMap<java.lang.String, androidx.fragment.app.FragmentManagerViewModel> r2 = r0.mChildNonConfigs
            java.util.Set r2 = r2.keySet()
            r1.addAll(r2)
            java.util.Iterator r2 = r1.iterator()
        L1e:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L2f
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            r4 = 1
            r0.clearNonConfigState(r3, r4)
            goto L1e
        L2f:
            r0.onCleared()
            java.util.HashMap<java.lang.String, androidx.fragment.app.FragmentManagerViewModel> r1 = r5.mChildNonConfigs
            r1.remove(r6)
        L37:
            java.util.HashMap<java.lang.String, androidx.lifecycle.ViewModelStore> r1 = r5.mViewModelStores
            java.lang.Object r1 = r1.get(r6)
            androidx.lifecycle.ViewModelStore r1 = (androidx.lifecycle.ViewModelStore) r1
            if (r1 == 0) goto L49
            r1.clear()
            java.util.HashMap<java.lang.String, androidx.lifecycle.ViewModelStore> r2 = r5.mViewModelStores
            r2.remove(r6)
        L49:
            return
    }

    static androidx.fragment.app.FragmentManagerViewModel getInstance(androidx.lifecycle.ViewModelStore r2) {
            androidx.lifecycle.ViewModelProvider r0 = new androidx.lifecycle.ViewModelProvider
            androidx.lifecycle.ViewModelProvider$Factory r1 = androidx.fragment.app.FragmentManagerViewModel.FACTORY
            r0.<init>(r2, r1)
            java.lang.Class<androidx.fragment.app.FragmentManagerViewModel> r1 = androidx.fragment.app.FragmentManagerViewModel.class
            androidx.lifecycle.ViewModel r1 = r0.get(r1)
            androidx.fragment.app.FragmentManagerViewModel r1 = (androidx.fragment.app.FragmentManagerViewModel) r1
            return r1
    }

    void addRetainedFragment(androidx.fragment.app.Fragment r5) {
            r4 = this;
            boolean r0 = r4.mIsStateSaved
            java.lang.String r1 = "FragmentManager"
            r2 = 2
            if (r0 == 0) goto L13
            boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r2)
            if (r0 == 0) goto L12
            java.lang.String r0 = "Ignoring addRetainedFragment as the state is already saved"
            android.util.Log.v(r1, r0)
        L12:
            return
        L13:
            java.util.HashMap<java.lang.String, androidx.fragment.app.Fragment> r0 = r4.mRetainedFragments
            java.lang.String r3 = r5.mWho
            boolean r0 = r0.containsKey(r3)
            if (r0 == 0) goto L1e
            return
        L1e:
            java.util.HashMap<java.lang.String, androidx.fragment.app.Fragment> r0 = r4.mRetainedFragments
            java.lang.String r3 = r5.mWho
            r0.put(r3, r5)
            boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r2)
            if (r0 == 0) goto L41
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Updating retained Fragments: Added "
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.StringBuilder r0 = r0.append(r5)
            java.lang.String r0 = r0.toString()
            android.util.Log.v(r1, r0)
        L41:
            return
    }

    void clearNonConfigState(androidx.fragment.app.Fragment r3, boolean r4) {
            r2 = this;
            r0 = 3
            boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r0)
            if (r0 == 0) goto L1f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Clearing non-config state for "
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.d(r1, r0)
        L1f:
            java.lang.String r0 = r3.mWho
            r2.clearNonConfigStateInternal(r0, r4)
            return
    }

    void clearNonConfigState(java.lang.String r3, boolean r4) {
            r2 = this;
            r0 = 3
            boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r0)
            if (r0 == 0) goto L1f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Clearing non-config state for saved state of Fragment "
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.d(r1, r0)
        L1f:
            r2.clearNonConfigStateInternal(r3, r4)
            return
    }

    public boolean equals(java.lang.Object r6) {
            r5 = this;
            r0 = 1
            if (r5 != r6) goto L4
            return r0
        L4:
            r1 = 0
            if (r6 == 0) goto L36
            java.lang.Class r2 = r5.getClass()
            java.lang.Class r3 = r6.getClass()
            if (r2 == r3) goto L12
            goto L36
        L12:
            r2 = r6
            androidx.fragment.app.FragmentManagerViewModel r2 = (androidx.fragment.app.FragmentManagerViewModel) r2
            java.util.HashMap<java.lang.String, androidx.fragment.app.Fragment> r3 = r5.mRetainedFragments
            java.util.HashMap<java.lang.String, androidx.fragment.app.Fragment> r4 = r2.mRetainedFragments
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L34
            java.util.HashMap<java.lang.String, androidx.fragment.app.FragmentManagerViewModel> r3 = r5.mChildNonConfigs
            java.util.HashMap<java.lang.String, androidx.fragment.app.FragmentManagerViewModel> r4 = r2.mChildNonConfigs
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L34
            java.util.HashMap<java.lang.String, androidx.lifecycle.ViewModelStore> r3 = r5.mViewModelStores
            java.util.HashMap<java.lang.String, androidx.lifecycle.ViewModelStore> r4 = r2.mViewModelStores
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L34
            goto L35
        L34:
            r0 = r1
        L35:
            return r0
        L36:
            return r1
    }

    androidx.fragment.app.Fragment findRetainedFragmentByWho(java.lang.String r2) {
            r1 = this;
            java.util.HashMap<java.lang.String, androidx.fragment.app.Fragment> r0 = r1.mRetainedFragments
            java.lang.Object r0 = r0.get(r2)
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            return r0
    }

    androidx.fragment.app.FragmentManagerViewModel getChildNonConfig(androidx.fragment.app.Fragment r4) {
            r3 = this;
            java.util.HashMap<java.lang.String, androidx.fragment.app.FragmentManagerViewModel> r0 = r3.mChildNonConfigs
            java.lang.String r1 = r4.mWho
            java.lang.Object r0 = r0.get(r1)
            androidx.fragment.app.FragmentManagerViewModel r0 = (androidx.fragment.app.FragmentManagerViewModel) r0
            if (r0 != 0) goto L1b
            androidx.fragment.app.FragmentManagerViewModel r1 = new androidx.fragment.app.FragmentManagerViewModel
            boolean r2 = r3.mStateAutomaticallySaved
            r1.<init>(r2)
            r0 = r1
            java.util.HashMap<java.lang.String, androidx.fragment.app.FragmentManagerViewModel> r1 = r3.mChildNonConfigs
            java.lang.String r2 = r4.mWho
            r1.put(r2, r0)
        L1b:
            return r0
    }

    java.util.Collection<androidx.fragment.app.Fragment> getRetainedFragments() {
            r2 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.HashMap<java.lang.String, androidx.fragment.app.Fragment> r1 = r2.mRetainedFragments
            java.util.Collection r1 = r1.values()
            r0.<init>(r1)
            return r0
    }

    @java.lang.Deprecated
    androidx.fragment.app.FragmentManagerNonConfig getSnapshot() {
            r6 = this;
            java.util.HashMap<java.lang.String, androidx.fragment.app.Fragment> r0 = r6.mRetainedFragments
            boolean r0 = r0.isEmpty()
            r1 = 0
            if (r0 == 0) goto L1a
            java.util.HashMap<java.lang.String, androidx.fragment.app.FragmentManagerViewModel> r0 = r6.mChildNonConfigs
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L1a
            java.util.HashMap<java.lang.String, androidx.lifecycle.ViewModelStore> r0 = r6.mViewModelStores
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L1a
            return r1
        L1a:
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.HashMap<java.lang.String, androidx.fragment.app.FragmentManagerViewModel> r2 = r6.mChildNonConfigs
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L29:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L4b
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getValue()
            androidx.fragment.app.FragmentManagerViewModel r4 = (androidx.fragment.app.FragmentManagerViewModel) r4
            androidx.fragment.app.FragmentManagerNonConfig r4 = r4.getSnapshot()
            if (r4 == 0) goto L4a
            java.lang.Object r5 = r3.getKey()
            java.lang.String r5 = (java.lang.String) r5
            r0.put(r5, r4)
        L4a:
            goto L29
        L4b:
            r2 = 1
            r6.mHasSavedSnapshot = r2
            java.util.HashMap<java.lang.String, androidx.fragment.app.Fragment> r2 = r6.mRetainedFragments
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L65
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L65
            java.util.HashMap<java.lang.String, androidx.lifecycle.ViewModelStore> r2 = r6.mViewModelStores
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L65
            return r1
        L65:
            androidx.fragment.app.FragmentManagerNonConfig r1 = new androidx.fragment.app.FragmentManagerNonConfig
            java.util.ArrayList r2 = new java.util.ArrayList
            java.util.HashMap<java.lang.String, androidx.fragment.app.Fragment> r3 = r6.mRetainedFragments
            java.util.Collection r3 = r3.values()
            r2.<init>(r3)
            java.util.HashMap r3 = new java.util.HashMap
            java.util.HashMap<java.lang.String, androidx.lifecycle.ViewModelStore> r4 = r6.mViewModelStores
            r3.<init>(r4)
            r1.<init>(r2, r0, r3)
            return r1
    }

    androidx.lifecycle.ViewModelStore getViewModelStore(androidx.fragment.app.Fragment r4) {
            r3 = this;
            java.util.HashMap<java.lang.String, androidx.lifecycle.ViewModelStore> r0 = r3.mViewModelStores
            java.lang.String r1 = r4.mWho
            java.lang.Object r0 = r0.get(r1)
            androidx.lifecycle.ViewModelStore r0 = (androidx.lifecycle.ViewModelStore) r0
            if (r0 != 0) goto L19
            androidx.lifecycle.ViewModelStore r1 = new androidx.lifecycle.ViewModelStore
            r1.<init>()
            r0 = r1
            java.util.HashMap<java.lang.String, androidx.lifecycle.ViewModelStore> r1 = r3.mViewModelStores
            java.lang.String r2 = r4.mWho
            r1.put(r2, r0)
        L19:
            return r0
    }

    public int hashCode() {
            r3 = this;
            java.util.HashMap<java.lang.String, androidx.fragment.app.Fragment> r0 = r3.mRetainedFragments
            int r0 = r0.hashCode()
            int r1 = r0 * 31
            java.util.HashMap<java.lang.String, androidx.fragment.app.FragmentManagerViewModel> r2 = r3.mChildNonConfigs
            int r2 = r2.hashCode()
            int r1 = r1 + r2
            int r0 = r1 * 31
            java.util.HashMap<java.lang.String, androidx.lifecycle.ViewModelStore> r2 = r3.mViewModelStores
            int r2 = r2.hashCode()
            int r0 = r0 + r2
            return r0
    }

    boolean isCleared() {
            r1 = this;
            boolean r0 = r1.mHasBeenCleared
            return r0
    }

    @Override // androidx.lifecycle.ViewModel
    protected void onCleared() {
            r2 = this;
            r0 = 3
            boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r0)
            if (r0 == 0) goto L1f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "onCleared called for "
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.d(r1, r0)
        L1f:
            r0 = 1
            r2.mHasBeenCleared = r0
            return
    }

    void removeRetainedFragment(androidx.fragment.app.Fragment r5) {
            r4 = this;
            boolean r0 = r4.mIsStateSaved
            java.lang.String r1 = "FragmentManager"
            r2 = 2
            if (r0 == 0) goto L13
            boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r2)
            if (r0 == 0) goto L12
            java.lang.String r0 = "Ignoring removeRetainedFragment as the state is already saved"
            android.util.Log.v(r1, r0)
        L12:
            return
        L13:
            java.util.HashMap<java.lang.String, androidx.fragment.app.Fragment> r0 = r4.mRetainedFragments
            java.lang.String r3 = r5.mWho
            java.lang.Object r0 = r0.remove(r3)
            if (r0 == 0) goto L1f
            r0 = 1
            goto L20
        L1f:
            r0 = 0
        L20:
            if (r0 == 0) goto L3e
            boolean r2 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r2)
            if (r2 == 0) goto L3e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Updating retained Fragments: Removed "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r5)
            java.lang.String r2 = r2.toString()
            android.util.Log.v(r1, r2)
        L3e:
            return
    }

    @java.lang.Deprecated
    void restoreFromSnapshot(androidx.fragment.app.FragmentManagerNonConfig r8) {
            r7 = this;
            java.util.HashMap<java.lang.String, androidx.fragment.app.Fragment> r0 = r7.mRetainedFragments
            r0.clear()
            java.util.HashMap<java.lang.String, androidx.fragment.app.FragmentManagerViewModel> r0 = r7.mChildNonConfigs
            r0.clear()
            java.util.HashMap<java.lang.String, androidx.lifecycle.ViewModelStore> r0 = r7.mViewModelStores
            r0.clear()
            if (r8 == 0) goto L72
            java.util.Collection r0 = r8.getFragments()
            if (r0 == 0) goto L31
            java.util.Iterator r1 = r0.iterator()
        L1b:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L31
            java.lang.Object r2 = r1.next()
            androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
            if (r2 == 0) goto L30
            java.util.HashMap<java.lang.String, androidx.fragment.app.Fragment> r3 = r7.mRetainedFragments
            java.lang.String r4 = r2.mWho
            r3.put(r4, r2)
        L30:
            goto L1b
        L31:
            java.util.Map r1 = r8.getChildNonConfigs()
            if (r1 == 0) goto L67
            java.util.Set r2 = r1.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L3f:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L67
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            androidx.fragment.app.FragmentManagerViewModel r4 = new androidx.fragment.app.FragmentManagerViewModel
            boolean r5 = r7.mStateAutomaticallySaved
            r4.<init>(r5)
            java.lang.Object r5 = r3.getValue()
            androidx.fragment.app.FragmentManagerNonConfig r5 = (androidx.fragment.app.FragmentManagerNonConfig) r5
            r4.restoreFromSnapshot(r5)
            java.util.HashMap<java.lang.String, androidx.fragment.app.FragmentManagerViewModel> r5 = r7.mChildNonConfigs
            java.lang.Object r6 = r3.getKey()
            java.lang.String r6 = (java.lang.String) r6
            r5.put(r6, r4)
            goto L3f
        L67:
            java.util.Map r2 = r8.getViewModelStores()
            if (r2 == 0) goto L72
            java.util.HashMap<java.lang.String, androidx.lifecycle.ViewModelStore> r3 = r7.mViewModelStores
            r3.putAll(r2)
        L72:
            r0 = 0
            r7.mHasSavedSnapshot = r0
            return
    }

    void setIsStateSaved(boolean r1) {
            r0 = this;
            r0.mIsStateSaved = r1
            return
    }

    boolean shouldDestroy(androidx.fragment.app.Fragment r3) {
            r2 = this;
            java.util.HashMap<java.lang.String, androidx.fragment.app.Fragment> r0 = r2.mRetainedFragments
            java.lang.String r1 = r3.mWho
            boolean r0 = r0.containsKey(r1)
            r1 = 1
            if (r0 != 0) goto Lc
            return r1
        Lc:
            boolean r0 = r2.mStateAutomaticallySaved
            if (r0 == 0) goto L13
            boolean r0 = r2.mHasBeenCleared
            return r0
        L13:
            boolean r0 = r2.mHasSavedSnapshot
            r0 = r0 ^ r1
            return r0
    }

    public java.lang.String toString() {
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "FragmentManagerViewModel{"
            r0.<init>(r1)
            int r1 = java.lang.System.identityHashCode(r6)
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
            java.lang.String r1 = "} Fragments ("
            r0.append(r1)
            java.util.HashMap<java.lang.String, androidx.fragment.app.Fragment> r1 = r6.mRetainedFragments
            java.util.Collection r1 = r1.values()
            java.util.Iterator r1 = r1.iterator()
        L21:
            boolean r2 = r1.hasNext()
            java.lang.String r3 = ", "
            if (r2 == 0) goto L3a
            java.lang.Object r2 = r1.next()
            r0.append(r2)
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L21
            r0.append(r3)
            goto L21
        L3a:
            java.lang.String r2 = ") Child Non Config ("
            r0.append(r2)
            java.util.HashMap<java.lang.String, androidx.fragment.app.FragmentManagerViewModel> r2 = r6.mChildNonConfigs
            java.util.Set r2 = r2.keySet()
            java.util.Iterator r2 = r2.iterator()
        L49:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L62
            java.lang.Object r4 = r2.next()
            java.lang.String r4 = (java.lang.String) r4
            r0.append(r4)
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L49
            r0.append(r3)
            goto L49
        L62:
            java.lang.String r4 = ") ViewModelStores ("
            r0.append(r4)
            java.util.HashMap<java.lang.String, androidx.lifecycle.ViewModelStore> r4 = r6.mViewModelStores
            java.util.Set r4 = r4.keySet()
            java.util.Iterator r4 = r4.iterator()
        L71:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L8a
            java.lang.Object r5 = r4.next()
            java.lang.String r5 = (java.lang.String) r5
            r0.append(r5)
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L71
            r0.append(r3)
            goto L71
        L8a:
            r3 = 41
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }
}
