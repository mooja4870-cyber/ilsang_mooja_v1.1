package androidx.fragment.app;

/* JADX INFO: loaded from: classes.dex */
class FragmentStore {
    private static final java.lang.String TAG = "FragmentManager";
    private final java.util.HashMap<java.lang.String, androidx.fragment.app.FragmentStateManager> mActive;
    private final java.util.ArrayList<androidx.fragment.app.Fragment> mAdded;
    private androidx.fragment.app.FragmentManagerViewModel mNonConfig;
    private final java.util.HashMap<java.lang.String, android.os.Bundle> mSavedState;

    FragmentStore() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.mAdded = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.mActive = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.mSavedState = r0
            return
    }

    void addFragment(androidx.fragment.app.Fragment r4) {
            r3 = this;
            java.util.ArrayList<androidx.fragment.app.Fragment> r0 = r3.mAdded
            boolean r0 = r0.contains(r4)
            if (r0 != 0) goto L18
            java.util.ArrayList<androidx.fragment.app.Fragment> r0 = r3.mAdded
            monitor-enter(r0)
            java.util.ArrayList<androidx.fragment.app.Fragment> r1 = r3.mAdded     // Catch: java.lang.Throwable -> L15
            r1.add(r4)     // Catch: java.lang.Throwable -> L15
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
            r0 = 1
            r4.mAdded = r0
            return
        L15:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
            throw r1
        L18:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Fragment already added: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r4)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    void burpActive() {
            r2 = this;
            java.util.HashMap<java.lang.String, androidx.fragment.app.FragmentStateManager> r0 = r2.mActive
            java.util.Collection r0 = r0.values()
            r1 = 0
            java.util.Set r1 = java.util.Collections.singleton(r1)
            r0.removeAll(r1)
            return
    }

    boolean containsActiveFragment(java.lang.String r2) {
            r1 = this;
            java.util.HashMap<java.lang.String, androidx.fragment.app.FragmentStateManager> r0 = r1.mActive
            java.lang.Object r0 = r0.get(r2)
            if (r0 == 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            return r0
    }

    void dispatchStateChange(int r3) {
            r2 = this;
            java.util.HashMap<java.lang.String, androidx.fragment.app.FragmentStateManager> r0 = r2.mActive
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1c
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.FragmentStateManager r1 = (androidx.fragment.app.FragmentStateManager) r1
            if (r1 == 0) goto L1b
            r1.setFragmentManagerState(r3)
        L1b:
            goto La
        L1c:
            return
    }

    void dump(java.lang.String r6, java.io.FileDescriptor r7, java.io.PrintWriter r8, java.lang.String[] r9) {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.StringBuilder r0 = r0.append(r6)
            java.lang.String r1 = "    "
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.util.HashMap<java.lang.String, androidx.fragment.app.FragmentStateManager> r1 = r5.mActive
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L4f
            r8.print(r6)
            java.lang.String r1 = "Active Fragments:"
            r8.println(r1)
            java.util.HashMap<java.lang.String, androidx.fragment.app.FragmentStateManager> r1 = r5.mActive
            java.util.Collection r1 = r1.values()
            java.util.Iterator r1 = r1.iterator()
        L2d:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L4f
            java.lang.Object r2 = r1.next()
            androidx.fragment.app.FragmentStateManager r2 = (androidx.fragment.app.FragmentStateManager) r2
            r8.print(r6)
            if (r2 == 0) goto L49
            androidx.fragment.app.Fragment r3 = r2.getFragment()
            r8.println(r3)
            r3.dump(r0, r7, r8, r9)
            goto L4e
        L49:
            java.lang.String r3 = "null"
            r8.println(r3)
        L4e:
            goto L2d
        L4f:
            java.util.ArrayList<androidx.fragment.app.Fragment> r1 = r5.mAdded
            int r1 = r1.size()
            if (r1 <= 0) goto L84
            r8.print(r6)
            java.lang.String r2 = "Added Fragments:"
            r8.println(r2)
            r2 = 0
        L60:
            if (r2 >= r1) goto L84
            java.util.ArrayList<androidx.fragment.app.Fragment> r3 = r5.mAdded
            java.lang.Object r3 = r3.get(r2)
            androidx.fragment.app.Fragment r3 = (androidx.fragment.app.Fragment) r3
            r8.print(r6)
            java.lang.String r4 = "  #"
            r8.print(r4)
            r8.print(r2)
            java.lang.String r4 = ": "
            r8.print(r4)
            java.lang.String r4 = r3.toString()
            r8.println(r4)
            int r2 = r2 + 1
            goto L60
        L84:
            return
    }

    androidx.fragment.app.Fragment findActiveFragment(java.lang.String r3) {
            r2 = this;
            java.util.HashMap<java.lang.String, androidx.fragment.app.FragmentStateManager> r0 = r2.mActive
            java.lang.Object r0 = r0.get(r3)
            androidx.fragment.app.FragmentStateManager r0 = (androidx.fragment.app.FragmentStateManager) r0
            if (r0 == 0) goto Lf
            androidx.fragment.app.Fragment r1 = r0.getFragment()
            return r1
        Lf:
            r1 = 0
            return r1
    }

    androidx.fragment.app.Fragment findFragmentById(int r5) {
            r4 = this;
            java.util.ArrayList<androidx.fragment.app.Fragment> r0 = r4.mAdded
            int r0 = r0.size()
            int r0 = r0 + (-1)
        L8:
            if (r0 < 0) goto L1c
            java.util.ArrayList<androidx.fragment.app.Fragment> r1 = r4.mAdded
            java.lang.Object r1 = r1.get(r0)
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            if (r1 == 0) goto L19
            int r2 = r1.mFragmentId
            if (r2 != r5) goto L19
            return r1
        L19:
            int r0 = r0 + (-1)
            goto L8
        L1c:
            java.util.HashMap<java.lang.String, androidx.fragment.app.FragmentStateManager> r0 = r4.mActive
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        L26:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L3e
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.FragmentStateManager r1 = (androidx.fragment.app.FragmentStateManager) r1
            if (r1 == 0) goto L3d
            androidx.fragment.app.Fragment r2 = r1.getFragment()
            int r3 = r2.mFragmentId
            if (r3 != r5) goto L3d
            return r2
        L3d:
            goto L26
        L3e:
            r0 = 0
            return r0
    }

    androidx.fragment.app.Fragment findFragmentByTag(java.lang.String r5) {
            r4 = this;
            if (r5 == 0) goto L22
            java.util.ArrayList<androidx.fragment.app.Fragment> r0 = r4.mAdded
            int r0 = r0.size()
            int r0 = r0 + (-1)
        La:
            if (r0 < 0) goto L22
            java.util.ArrayList<androidx.fragment.app.Fragment> r1 = r4.mAdded
            java.lang.Object r1 = r1.get(r0)
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            if (r1 == 0) goto L1f
            java.lang.String r2 = r1.mTag
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L1f
            return r1
        L1f:
            int r0 = r0 + (-1)
            goto La
        L22:
            if (r5 == 0) goto L4a
            java.util.HashMap<java.lang.String, androidx.fragment.app.FragmentStateManager> r0 = r4.mActive
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        L2e:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L4a
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.FragmentStateManager r1 = (androidx.fragment.app.FragmentStateManager) r1
            if (r1 == 0) goto L49
            androidx.fragment.app.Fragment r2 = r1.getFragment()
            java.lang.String r3 = r2.mTag
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L49
            return r2
        L49:
            goto L2e
        L4a:
            r0 = 0
            return r0
    }

    androidx.fragment.app.Fragment findFragmentByWho(java.lang.String r5) {
            r4 = this;
            java.util.HashMap<java.lang.String, androidx.fragment.app.FragmentStateManager> r0 = r4.mActive
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L25
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.FragmentStateManager r1 = (androidx.fragment.app.FragmentStateManager) r1
            if (r1 == 0) goto L24
            androidx.fragment.app.Fragment r2 = r1.getFragment()
            androidx.fragment.app.Fragment r3 = r2.findFragmentByWho(r5)
            r2 = r3
            if (r3 == 0) goto L24
            return r2
        L24:
            goto La
        L25:
            r0 = 0
            return r0
    }

    int findFragmentIndexInContainer(androidx.fragment.app.Fragment r7) {
            r6 = this;
            android.view.ViewGroup r0 = r7.mContainer
            r1 = -1
            if (r0 != 0) goto L6
            return r1
        L6:
            java.util.ArrayList<androidx.fragment.app.Fragment> r2 = r6.mAdded
            int r2 = r2.indexOf(r7)
            int r3 = r2 + (-1)
        Le:
            if (r3 < 0) goto L2c
            java.util.ArrayList<androidx.fragment.app.Fragment> r4 = r6.mAdded
            java.lang.Object r4 = r4.get(r3)
            androidx.fragment.app.Fragment r4 = (androidx.fragment.app.Fragment) r4
            android.view.ViewGroup r5 = r4.mContainer
            if (r5 != r0) goto L29
            android.view.View r5 = r4.mView
            if (r5 == 0) goto L29
            android.view.View r1 = r4.mView
            int r1 = r0.indexOfChild(r1)
            int r5 = r1 + 1
            return r5
        L29:
            int r3 = r3 + (-1)
            goto Le
        L2c:
            int r3 = r2 + 1
        L2e:
            java.util.ArrayList<androidx.fragment.app.Fragment> r4 = r6.mAdded
            int r4 = r4.size()
            if (r3 >= r4) goto L50
            java.util.ArrayList<androidx.fragment.app.Fragment> r4 = r6.mAdded
            java.lang.Object r4 = r4.get(r3)
            androidx.fragment.app.Fragment r4 = (androidx.fragment.app.Fragment) r4
            android.view.ViewGroup r5 = r4.mContainer
            if (r5 != r0) goto L4d
            android.view.View r5 = r4.mView
            if (r5 == 0) goto L4d
            android.view.View r1 = r4.mView
            int r1 = r0.indexOfChild(r1)
            return r1
        L4d:
            int r3 = r3 + 1
            goto L2e
        L50:
            return r1
    }

    int getActiveFragmentCount() {
            r1 = this;
            java.util.HashMap<java.lang.String, androidx.fragment.app.FragmentStateManager> r0 = r1.mActive
            int r0 = r0.size()
            return r0
    }

    java.util.List<androidx.fragment.app.FragmentStateManager> getActiveFragmentStateManagers() {
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.HashMap<java.lang.String, androidx.fragment.app.FragmentStateManager> r1 = r3.mActive
            java.util.Collection r1 = r1.values()
            java.util.Iterator r1 = r1.iterator()
        Lf:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L21
            java.lang.Object r2 = r1.next()
            androidx.fragment.app.FragmentStateManager r2 = (androidx.fragment.app.FragmentStateManager) r2
            if (r2 == 0) goto L20
            r0.add(r2)
        L20:
            goto Lf
        L21:
            return r0
    }

    java.util.List<androidx.fragment.app.Fragment> getActiveFragments() {
            r4 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.HashMap<java.lang.String, androidx.fragment.app.FragmentStateManager> r1 = r4.mActive
            java.util.Collection r1 = r1.values()
            java.util.Iterator r1 = r1.iterator()
        Lf:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L2a
            java.lang.Object r2 = r1.next()
            androidx.fragment.app.FragmentStateManager r2 = (androidx.fragment.app.FragmentStateManager) r2
            if (r2 == 0) goto L25
            androidx.fragment.app.Fragment r3 = r2.getFragment()
            r0.add(r3)
            goto L29
        L25:
            r3 = 0
            r0.add(r3)
        L29:
            goto Lf
        L2a:
            return r0
    }

    java.util.HashMap<java.lang.String, android.os.Bundle> getAllSavedState() {
            r1 = this;
            java.util.HashMap<java.lang.String, android.os.Bundle> r0 = r1.mSavedState
            return r0
    }

    androidx.fragment.app.FragmentStateManager getFragmentStateManager(java.lang.String r2) {
            r1 = this;
            java.util.HashMap<java.lang.String, androidx.fragment.app.FragmentStateManager> r0 = r1.mActive
            java.lang.Object r0 = r0.get(r2)
            androidx.fragment.app.FragmentStateManager r0 = (androidx.fragment.app.FragmentStateManager) r0
            return r0
    }

    java.util.List<androidx.fragment.app.Fragment> getFragments() {
            r3 = this;
            java.util.ArrayList<androidx.fragment.app.Fragment> r0 = r3.mAdded
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Ld
            java.util.List r0 = java.util.Collections.emptyList()
            return r0
        Ld:
            java.util.ArrayList<androidx.fragment.app.Fragment> r0 = r3.mAdded
            monitor-enter(r0)
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L19
            java.util.ArrayList<androidx.fragment.app.Fragment> r2 = r3.mAdded     // Catch: java.lang.Throwable -> L19
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L19
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
            return r1
        L19:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
            throw r1
    }

    androidx.fragment.app.FragmentManagerViewModel getNonConfig() {
            r1 = this;
            androidx.fragment.app.FragmentManagerViewModel r0 = r1.mNonConfig
            return r0
    }

    android.os.Bundle getSavedState(java.lang.String r2) {
            r1 = this;
            java.util.HashMap<java.lang.String, android.os.Bundle> r0 = r1.mSavedState
            java.lang.Object r0 = r0.get(r2)
            android.os.Bundle r0 = (android.os.Bundle) r0
            return r0
    }

    void makeActive(androidx.fragment.app.FragmentStateManager r4) {
            r3 = this;
            androidx.fragment.app.Fragment r0 = r4.getFragment()
            java.lang.String r1 = r0.mWho
            boolean r1 = r3.containsActiveFragment(r1)
            if (r1 == 0) goto Ld
            return
        Ld:
            java.util.HashMap<java.lang.String, androidx.fragment.app.FragmentStateManager> r1 = r3.mActive
            java.lang.String r2 = r0.mWho
            r1.put(r2, r4)
            boolean r1 = r0.mRetainInstanceChangedWhileDetached
            if (r1 == 0) goto L2a
            boolean r1 = r0.mRetainInstance
            if (r1 == 0) goto L22
            androidx.fragment.app.FragmentManagerViewModel r1 = r3.mNonConfig
            r1.addRetainedFragment(r0)
            goto L27
        L22:
            androidx.fragment.app.FragmentManagerViewModel r1 = r3.mNonConfig
            r1.removeRetainedFragment(r0)
        L27:
            r1 = 0
            r0.mRetainInstanceChangedWhileDetached = r1
        L2a:
            r1 = 2
            boolean r1 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r1)
            if (r1 == 0) goto L49
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Added fragment to active set "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "FragmentManager"
            android.util.Log.v(r2, r1)
        L49:
            return
    }

    void makeInactive(androidx.fragment.app.FragmentStateManager r5) {
            r4 = this;
            androidx.fragment.app.Fragment r0 = r5.getFragment()
            boolean r1 = r0.mRetainInstance
            if (r1 == 0) goto Ld
            androidx.fragment.app.FragmentManagerViewModel r1 = r4.mNonConfig
            r1.removeRetainedFragment(r0)
        Ld:
            java.util.HashMap<java.lang.String, androidx.fragment.app.FragmentStateManager> r1 = r4.mActive
            java.lang.String r2 = r0.mWho
            java.lang.Object r1 = r1.get(r2)
            if (r1 == r5) goto L18
            return
        L18:
            java.util.HashMap<java.lang.String, androidx.fragment.app.FragmentStateManager> r1 = r4.mActive
            java.lang.String r2 = r0.mWho
            r3 = 0
            java.lang.Object r1 = r1.put(r2, r3)
            androidx.fragment.app.FragmentStateManager r1 = (androidx.fragment.app.FragmentStateManager) r1
            if (r1 != 0) goto L26
            return
        L26:
            r2 = 2
            boolean r2 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r2)
            if (r2 == 0) goto L45
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Removed fragment from active set "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r0)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "FragmentManager"
            android.util.Log.v(r3, r2)
        L45:
            return
    }

    void moveToExpectedState() {
            r6 = this;
            java.util.ArrayList<androidx.fragment.app.Fragment> r0 = r6.mAdded
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L22
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            java.util.HashMap<java.lang.String, androidx.fragment.app.FragmentStateManager> r2 = r6.mActive
            java.lang.String r3 = r1.mWho
            java.lang.Object r2 = r2.get(r3)
            androidx.fragment.app.FragmentStateManager r2 = (androidx.fragment.app.FragmentStateManager) r2
            if (r2 == 0) goto L21
            r2.moveToExpectedState()
        L21:
            goto L6
        L22:
            java.util.HashMap<java.lang.String, androidx.fragment.app.FragmentStateManager> r0 = r6.mActive
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        L2c:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L6b
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.FragmentStateManager r1 = (androidx.fragment.app.FragmentStateManager) r1
            if (r1 == 0) goto L6a
            r1.moveToExpectedState()
            androidx.fragment.app.Fragment r2 = r1.getFragment()
            boolean r3 = r2.mRemoving
            if (r3 == 0) goto L4d
            boolean r3 = r2.isInBackStack()
            if (r3 != 0) goto L4d
            r3 = 1
            goto L4e
        L4d:
            r3 = 0
        L4e:
            if (r3 == 0) goto L6a
            boolean r4 = r2.mBeingSaved
            if (r4 == 0) goto L67
            java.util.HashMap<java.lang.String, android.os.Bundle> r4 = r6.mSavedState
            java.lang.String r5 = r2.mWho
            boolean r4 = r4.containsKey(r5)
            if (r4 != 0) goto L67
            java.lang.String r4 = r2.mWho
            android.os.Bundle r5 = r1.saveState()
            r6.setSavedState(r4, r5)
        L67:
            r6.makeInactive(r1)
        L6a:
            goto L2c
        L6b:
            return
    }

    void removeFragment(androidx.fragment.app.Fragment r3) {
            r2 = this;
            java.util.ArrayList<androidx.fragment.app.Fragment> r0 = r2.mAdded
            monitor-enter(r0)
            java.util.ArrayList<androidx.fragment.app.Fragment> r1 = r2.mAdded     // Catch: java.lang.Throwable -> Ld
            r1.remove(r3)     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            r0 = 0
            r3.mAdded = r0
            return
        Ld:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            throw r1
    }

    void resetActiveFragments() {
            r1 = this;
            java.util.HashMap<java.lang.String, androidx.fragment.app.FragmentStateManager> r0 = r1.mActive
            r0.clear()
            return
    }

    void restoreAddedFragments(java.util.List<java.lang.String> r6) {
            r5 = this;
            java.util.ArrayList<androidx.fragment.app.Fragment> r0 = r5.mAdded
            r0.clear()
            if (r6 == 0) goto L69
            java.util.Iterator r0 = r6.iterator()
        Lb:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L69
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            androidx.fragment.app.Fragment r2 = r5.findActiveFragment(r1)
            if (r2 == 0) goto L4a
            r3 = 2
            boolean r3 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r3)
            if (r3 == 0) goto L46
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "restoreSaveState: added ("
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r3 = r3.append(r1)
            java.lang.String r4 = "): "
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r3 = r3.append(r2)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "FragmentManager"
            android.util.Log.v(r4, r3)
        L46:
            r5.addFragment(r2)
            goto Lb
        L4a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "No instantiated fragment for ("
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r3 = r3.append(r1)
            java.lang.String r4 = ")"
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            r0.<init>(r3)
            throw r0
        L69:
            return
    }

    void restoreSaveState(java.util.HashMap<java.lang.String, android.os.Bundle> r2) {
            r1 = this;
            java.util.HashMap<java.lang.String, android.os.Bundle> r0 = r1.mSavedState
            r0.clear()
            java.util.HashMap<java.lang.String, android.os.Bundle> r0 = r1.mSavedState
            r0.putAll(r2)
            return
    }

    java.util.ArrayList<java.lang.String> saveActiveFragments() {
            r6 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.HashMap<java.lang.String, androidx.fragment.app.FragmentStateManager> r1 = r6.mActive
            int r1 = r1.size()
            r0.<init>(r1)
            java.util.HashMap<java.lang.String, androidx.fragment.app.FragmentStateManager> r1 = r6.mActive
            java.util.Collection r1 = r1.values()
            java.util.Iterator r1 = r1.iterator()
        L15:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L61
            java.lang.Object r2 = r1.next()
            androidx.fragment.app.FragmentStateManager r2 = (androidx.fragment.app.FragmentStateManager) r2
            if (r2 == 0) goto L60
            androidx.fragment.app.Fragment r3 = r2.getFragment()
            java.lang.String r4 = r3.mWho
            android.os.Bundle r5 = r2.saveState()
            r6.setSavedState(r4, r5)
            java.lang.String r4 = r3.mWho
            r0.add(r4)
            r4 = 2
            boolean r4 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r4)
            if (r4 == 0) goto L60
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Saved state of "
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.StringBuilder r4 = r4.append(r3)
            java.lang.String r5 = ": "
            java.lang.StringBuilder r4 = r4.append(r5)
            android.os.Bundle r5 = r3.mSavedFragmentState
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = "FragmentManager"
            android.util.Log.v(r5, r4)
        L60:
            goto L15
        L61:
            return r0
    }

    java.util.ArrayList<java.lang.String> saveAddedFragments() {
            r7 = this;
            java.util.ArrayList<androidx.fragment.app.Fragment> r0 = r7.mAdded
            monitor-enter(r0)
            java.util.ArrayList<androidx.fragment.app.Fragment> r1 = r7.mAdded     // Catch: java.lang.Throwable -> L5e
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L5e
            if (r1 == 0) goto Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5e
            r0 = 0
            return r0
        Le:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L5e
            java.util.ArrayList<androidx.fragment.app.Fragment> r2 = r7.mAdded     // Catch: java.lang.Throwable -> L5e
            int r2 = r2.size()     // Catch: java.lang.Throwable -> L5e
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L5e
            java.util.ArrayList<androidx.fragment.app.Fragment> r2 = r7.mAdded     // Catch: java.lang.Throwable -> L5e
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L5e
        L1f:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L5e
            if (r3 == 0) goto L5c
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L5e
            androidx.fragment.app.Fragment r3 = (androidx.fragment.app.Fragment) r3     // Catch: java.lang.Throwable -> L5e
            java.lang.String r4 = r3.mWho     // Catch: java.lang.Throwable -> L5e
            r1.add(r4)     // Catch: java.lang.Throwable -> L5e
            r4 = 2
            boolean r4 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r4)     // Catch: java.lang.Throwable -> L5e
            if (r4 == 0) goto L5b
            java.lang.String r4 = "FragmentManager"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5e
            r5.<init>()     // Catch: java.lang.Throwable -> L5e
            java.lang.String r6 = "saveAllState: adding fragment ("
            java.lang.StringBuilder r5 = r5.append(r6)     // Catch: java.lang.Throwable -> L5e
            java.lang.String r6 = r3.mWho     // Catch: java.lang.Throwable -> L5e
            java.lang.StringBuilder r5 = r5.append(r6)     // Catch: java.lang.Throwable -> L5e
            java.lang.String r6 = "): "
            java.lang.StringBuilder r5 = r5.append(r6)     // Catch: java.lang.Throwable -> L5e
            java.lang.StringBuilder r5 = r5.append(r3)     // Catch: java.lang.Throwable -> L5e
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L5e
            android.util.Log.v(r4, r5)     // Catch: java.lang.Throwable -> L5e
        L5b:
            goto L1f
        L5c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5e
            return r1
        L5e:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5e
            throw r1
    }

    void setNonConfig(androidx.fragment.app.FragmentManagerViewModel r1) {
            r0 = this;
            r0.mNonConfig = r1
            return
    }

    android.os.Bundle setSavedState(java.lang.String r2, android.os.Bundle r3) {
            r1 = this;
            if (r3 == 0) goto Lb
            java.util.HashMap<java.lang.String, android.os.Bundle> r0 = r1.mSavedState
            java.lang.Object r0 = r0.put(r2, r3)
            android.os.Bundle r0 = (android.os.Bundle) r0
            return r0
        Lb:
            java.util.HashMap<java.lang.String, android.os.Bundle> r0 = r1.mSavedState
            java.lang.Object r0 = r0.remove(r2)
            android.os.Bundle r0 = (android.os.Bundle) r0
            return r0
    }
}
