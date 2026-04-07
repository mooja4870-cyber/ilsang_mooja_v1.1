package androidx.fragment.app;

/* JADX INFO: loaded from: classes.dex */
final class BackStackRecord extends androidx.fragment.app.FragmentTransaction implements androidx.fragment.app.FragmentManager.BackStackEntry, androidx.fragment.app.FragmentManager.OpGenerator {
    private static final java.lang.String TAG = "FragmentManager";
    boolean mBeingSaved;
    boolean mCommitted;
    int mIndex;
    final androidx.fragment.app.FragmentManager mManager;

    BackStackRecord(androidx.fragment.app.BackStackRecord r3) {
            r2 = this;
            androidx.fragment.app.FragmentManager r0 = r3.mManager
            androidx.fragment.app.FragmentFactory r0 = r0.getFragmentFactory()
            androidx.fragment.app.FragmentManager r1 = r3.mManager
            androidx.fragment.app.FragmentHostCallback r1 = r1.getHost()
            if (r1 == 0) goto L1d
            androidx.fragment.app.FragmentManager r1 = r3.mManager
            androidx.fragment.app.FragmentHostCallback r1 = r1.getHost()
            android.content.Context r1 = r1.getContext()
            java.lang.ClassLoader r1 = r1.getClassLoader()
            goto L1e
        L1d:
            r1 = 0
        L1e:
            r2.<init>(r0, r1, r3)
            r0 = -1
            r2.mIndex = r0
            r0 = 0
            r2.mBeingSaved = r0
            androidx.fragment.app.FragmentManager r0 = r3.mManager
            r2.mManager = r0
            boolean r0 = r3.mCommitted
            r2.mCommitted = r0
            int r0 = r3.mIndex
            r2.mIndex = r0
            boolean r0 = r3.mBeingSaved
            r2.mBeingSaved = r0
            return
    }

    BackStackRecord(androidx.fragment.app.FragmentManager r3) {
            r2 = this;
            androidx.fragment.app.FragmentFactory r0 = r3.getFragmentFactory()
            androidx.fragment.app.FragmentHostCallback r1 = r3.getHost()
            if (r1 == 0) goto L17
            androidx.fragment.app.FragmentHostCallback r1 = r3.getHost()
            android.content.Context r1 = r1.getContext()
            java.lang.ClassLoader r1 = r1.getClassLoader()
            goto L18
        L17:
            r1 = 0
        L18:
            r2.<init>(r0, r1)
            r0 = -1
            r2.mIndex = r0
            r0 = 0
            r2.mBeingSaved = r0
            r2.mManager = r3
            return
    }

    void bumpBackStackNesting(int r8) {
            r7 = this;
            boolean r0 = r7.mAddToBackStack
            if (r0 != 0) goto L5
            return
        L5:
            r0 = 2
            boolean r1 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r0)
            java.lang.String r2 = "FragmentManager"
            if (r1 == 0) goto L2e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Bump nesting in "
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.StringBuilder r1 = r1.append(r7)
            java.lang.String r3 = " by "
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.StringBuilder r1 = r1.append(r8)
            java.lang.String r1 = r1.toString()
            android.util.Log.v(r2, r1)
        L2e:
            java.util.ArrayList<androidx.fragment.app.FragmentTransaction$Op> r1 = r7.mOps
            int r1 = r1.size()
            r3 = 0
        L35:
            if (r3 >= r1) goto L79
            java.util.ArrayList<androidx.fragment.app.FragmentTransaction$Op> r4 = r7.mOps
            java.lang.Object r4 = r4.get(r3)
            androidx.fragment.app.FragmentTransaction$Op r4 = (androidx.fragment.app.FragmentTransaction.Op) r4
            androidx.fragment.app.Fragment r5 = r4.mFragment
            if (r5 == 0) goto L76
            androidx.fragment.app.Fragment r5 = r4.mFragment
            int r6 = r5.mBackStackNesting
            int r6 = r6 + r8
            r5.mBackStackNesting = r6
            boolean r5 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r0)
            if (r5 == 0) goto L76
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Bump nesting of "
            java.lang.StringBuilder r5 = r5.append(r6)
            androidx.fragment.app.Fragment r6 = r4.mFragment
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r6 = " to "
            java.lang.StringBuilder r5 = r5.append(r6)
            androidx.fragment.app.Fragment r6 = r4.mFragment
            int r6 = r6.mBackStackNesting
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r5 = r5.toString()
            android.util.Log.v(r2, r5)
        L76:
            int r3 = r3 + 1
            goto L35
        L79:
            return
    }

    void collapseOps() {
            r6 = this;
            java.util.ArrayList<androidx.fragment.app.FragmentTransaction$Op> r0 = r6.mOps
            int r0 = r0.size()
            int r0 = r0 + (-1)
        L8:
            if (r0 < 0) goto L56
            java.util.ArrayList<androidx.fragment.app.FragmentTransaction$Op> r1 = r6.mOps
            java.lang.Object r1 = r1.get(r0)
            androidx.fragment.app.FragmentTransaction$Op r1 = (androidx.fragment.app.FragmentTransaction.Op) r1
            boolean r2 = r1.mFromExpandedOp
            if (r2 != 0) goto L17
            goto L53
        L17:
            int r2 = r1.mCmd
            r3 = 8
            r4 = 0
            if (r2 != r3) goto L2a
            r1.mFromExpandedOp = r4
            java.util.ArrayList<androidx.fragment.app.FragmentTransaction$Op> r2 = r6.mOps
            int r3 = r0 + (-1)
            r2.remove(r3)
            int r0 = r0 + (-1)
            goto L53
        L2a:
            androidx.fragment.app.Fragment r2 = r1.mFragment
            int r2 = r2.mContainerId
            r3 = 2
            r1.mCmd = r3
            r1.mFromExpandedOp = r4
            int r3 = r0 + (-1)
        L35:
            if (r3 < 0) goto L53
            java.util.ArrayList<androidx.fragment.app.FragmentTransaction$Op> r4 = r6.mOps
            java.lang.Object r4 = r4.get(r3)
            androidx.fragment.app.FragmentTransaction$Op r4 = (androidx.fragment.app.FragmentTransaction.Op) r4
            boolean r5 = r4.mFromExpandedOp
            if (r5 == 0) goto L50
            androidx.fragment.app.Fragment r5 = r4.mFragment
            int r5 = r5.mContainerId
            if (r5 != r2) goto L50
            java.util.ArrayList<androidx.fragment.app.FragmentTransaction$Op> r5 = r6.mOps
            r5.remove(r3)
            int r0 = r0 + (-1)
        L50:
            int r3 = r3 + (-1)
            goto L35
        L53:
            int r0 = r0 + (-1)
            goto L8
        L56:
            return
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public int commit() {
            r2 = this;
            r0 = 0
            r1 = 1
            int r0 = r2.commitInternal(r0, r1)
            return r0
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public int commitAllowingStateLoss() {
            r1 = this;
            r0 = 1
            int r0 = r1.commitInternal(r0, r0)
            return r0
    }

    int commitInternal(boolean r4, boolean r5) {
            r3 = this;
            boolean r0 = r3.mCommitted
            if (r0 != 0) goto L52
            r0 = 2
            boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r0)
            if (r0 == 0) goto L35
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Commit: "
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.v(r1, r0)
            androidx.fragment.app.LogWriter r0 = new androidx.fragment.app.LogWriter
            r0.<init>(r1)
            java.io.PrintWriter r1 = new java.io.PrintWriter
            r1.<init>(r0)
            java.lang.String r2 = "  "
            r3.dump(r2, r1)
            r1.close()
        L35:
            r0 = 1
            r3.mCommitted = r0
            boolean r0 = r3.mAddToBackStack
            if (r0 == 0) goto L45
            androidx.fragment.app.FragmentManager r0 = r3.mManager
            int r0 = r0.allocBackStackIndex()
            r3.mIndex = r0
            goto L48
        L45:
            r0 = -1
            r3.mIndex = r0
        L48:
            if (r5 == 0) goto L4f
            androidx.fragment.app.FragmentManager r0 = r3.mManager
            r0.enqueueAction(r3, r4)
        L4f:
            int r0 = r3.mIndex
            return r0
        L52:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "commit already called"
            r0.<init>(r1)
            throw r0
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public void commitNow() {
            r2 = this;
            r2.disallowAddToBackStack()
            androidx.fragment.app.FragmentManager r0 = r2.mManager
            r1 = 0
            r0.execSingleAction(r2, r1)
            return
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public void commitNowAllowingStateLoss() {
            r2 = this;
            r2.disallowAddToBackStack()
            androidx.fragment.app.FragmentManager r0 = r2.mManager
            r1 = 1
            r0.execSingleAction(r2, r1)
            return
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public androidx.fragment.app.FragmentTransaction detach(androidx.fragment.app.Fragment r4) {
            r3 = this;
            androidx.fragment.app.FragmentManager r0 = r4.mFragmentManager
            if (r0 == 0) goto L2e
            androidx.fragment.app.FragmentManager r0 = r4.mFragmentManager
            androidx.fragment.app.FragmentManager r1 = r3.mManager
            if (r0 != r1) goto Lb
            goto L2e
        Lb:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Cannot detach Fragment attached to a different FragmentManager. Fragment "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = r4.toString()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " is already attached to a FragmentManager."
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L2e:
            androidx.fragment.app.FragmentTransaction r0 = super.detach(r4)
            return r0
    }

    @Override // androidx.fragment.app.FragmentTransaction
    void doAddOp(int r2, androidx.fragment.app.Fragment r3, java.lang.String r4, int r5) {
            r1 = this;
            super.doAddOp(r2, r3, r4, r5)
            androidx.fragment.app.FragmentManager r0 = r1.mManager
            r3.mFragmentManager = r0
            return
    }

    public void dump(java.lang.String r2, java.io.PrintWriter r3) {
            r1 = this;
            r0 = 1
            r1.dump(r2, r3, r0)
            return
    }

    public void dump(java.lang.String r6, java.io.PrintWriter r7, boolean r8) {
            r5 = this;
            if (r8 == 0) goto Lcc
            r7.print(r6)
            java.lang.String r0 = "mName="
            r7.print(r0)
            java.lang.String r0 = r5.mName
            r7.print(r0)
            java.lang.String r0 = " mIndex="
            r7.print(r0)
            int r0 = r5.mIndex
            r7.print(r0)
            java.lang.String r0 = " mCommitted="
            r7.print(r0)
            boolean r0 = r5.mCommitted
            r7.println(r0)
            int r0 = r5.mTransition
            if (r0 == 0) goto L38
            r7.print(r6)
            java.lang.String r0 = "mTransition=#"
            r7.print(r0)
            int r0 = r5.mTransition
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            r7.print(r0)
        L38:
            int r0 = r5.mEnterAnim
            if (r0 != 0) goto L40
            int r0 = r5.mExitAnim
            if (r0 == 0) goto L5f
        L40:
            r7.print(r6)
            java.lang.String r0 = "mEnterAnim=#"
            r7.print(r0)
            int r0 = r5.mEnterAnim
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            r7.print(r0)
            java.lang.String r0 = " mExitAnim=#"
            r7.print(r0)
            int r0 = r5.mExitAnim
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            r7.println(r0)
        L5f:
            int r0 = r5.mPopEnterAnim
            if (r0 != 0) goto L67
            int r0 = r5.mPopExitAnim
            if (r0 == 0) goto L86
        L67:
            r7.print(r6)
            java.lang.String r0 = "mPopEnterAnim=#"
            r7.print(r0)
            int r0 = r5.mPopEnterAnim
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            r7.print(r0)
            java.lang.String r0 = " mPopExitAnim=#"
            r7.print(r0)
            int r0 = r5.mPopExitAnim
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            r7.println(r0)
        L86:
            int r0 = r5.mBreadCrumbTitleRes
            if (r0 != 0) goto L8e
            java.lang.CharSequence r0 = r5.mBreadCrumbTitleText
            if (r0 == 0) goto La9
        L8e:
            r7.print(r6)
            java.lang.String r0 = "mBreadCrumbTitleRes=#"
            r7.print(r0)
            int r0 = r5.mBreadCrumbTitleRes
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            r7.print(r0)
            java.lang.String r0 = " mBreadCrumbTitleText="
            r7.print(r0)
            java.lang.CharSequence r0 = r5.mBreadCrumbTitleText
            r7.println(r0)
        La9:
            int r0 = r5.mBreadCrumbShortTitleRes
            if (r0 != 0) goto Lb1
            java.lang.CharSequence r0 = r5.mBreadCrumbShortTitleText
            if (r0 == 0) goto Lcc
        Lb1:
            r7.print(r6)
            java.lang.String r0 = "mBreadCrumbShortTitleRes=#"
            r7.print(r0)
            int r0 = r5.mBreadCrumbShortTitleRes
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            r7.print(r0)
            java.lang.String r0 = " mBreadCrumbShortTitleText="
            r7.print(r0)
            java.lang.CharSequence r0 = r5.mBreadCrumbShortTitleText
            r7.println(r0)
        Lcc:
            java.util.ArrayList<androidx.fragment.app.FragmentTransaction$Op> r0 = r5.mOps
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L199
            r7.print(r6)
            java.lang.String r0 = "Operations:"
            r7.println(r0)
            java.util.ArrayList<androidx.fragment.app.FragmentTransaction$Op> r0 = r5.mOps
            int r0 = r0.size()
            r1 = 0
        Le3:
            if (r1 >= r0) goto L199
            java.util.ArrayList<androidx.fragment.app.FragmentTransaction$Op> r2 = r5.mOps
            java.lang.Object r2 = r2.get(r1)
            androidx.fragment.app.FragmentTransaction$Op r2 = (androidx.fragment.app.FragmentTransaction.Op) r2
            int r3 = r2.mCmd
            switch(r3) {
                case 0: goto L126;
                case 1: goto L123;
                case 2: goto L120;
                case 3: goto L11d;
                case 4: goto L11a;
                case 5: goto L117;
                case 6: goto L114;
                case 7: goto L111;
                case 8: goto L10e;
                case 9: goto L10b;
                case 10: goto L108;
                default: goto Lf2;
            }
        Lf2:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "cmd="
            java.lang.StringBuilder r3 = r3.append(r4)
            int r4 = r2.mCmd
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            goto L128
        L108:
            java.lang.String r3 = "OP_SET_MAX_LIFECYCLE"
            goto L128
        L10b:
            java.lang.String r3 = "UNSET_PRIMARY_NAV"
            goto L128
        L10e:
            java.lang.String r3 = "SET_PRIMARY_NAV"
            goto L128
        L111:
            java.lang.String r3 = "ATTACH"
            goto L128
        L114:
            java.lang.String r3 = "DETACH"
            goto L128
        L117:
            java.lang.String r3 = "SHOW"
            goto L128
        L11a:
            java.lang.String r3 = "HIDE"
            goto L128
        L11d:
            java.lang.String r3 = "REMOVE"
            goto L128
        L120:
            java.lang.String r3 = "REPLACE"
            goto L128
        L123:
            java.lang.String r3 = "ADD"
            goto L128
        L126:
            java.lang.String r3 = "NULL"
        L128:
            r7.print(r6)
            java.lang.String r4 = "  Op #"
            r7.print(r4)
            r7.print(r1)
            java.lang.String r4 = ": "
            r7.print(r4)
            r7.print(r3)
            java.lang.String r4 = " "
            r7.print(r4)
            androidx.fragment.app.Fragment r4 = r2.mFragment
            r7.println(r4)
            if (r8 == 0) goto L195
            int r4 = r2.mEnterAnim
            if (r4 != 0) goto L14f
            int r4 = r2.mExitAnim
            if (r4 == 0) goto L16e
        L14f:
            r7.print(r6)
            java.lang.String r4 = "enterAnim=#"
            r7.print(r4)
            int r4 = r2.mEnterAnim
            java.lang.String r4 = java.lang.Integer.toHexString(r4)
            r7.print(r4)
            java.lang.String r4 = " exitAnim=#"
            r7.print(r4)
            int r4 = r2.mExitAnim
            java.lang.String r4 = java.lang.Integer.toHexString(r4)
            r7.println(r4)
        L16e:
            int r4 = r2.mPopEnterAnim
            if (r4 != 0) goto L176
            int r4 = r2.mPopExitAnim
            if (r4 == 0) goto L195
        L176:
            r7.print(r6)
            java.lang.String r4 = "popEnterAnim=#"
            r7.print(r4)
            int r4 = r2.mPopEnterAnim
            java.lang.String r4 = java.lang.Integer.toHexString(r4)
            r7.print(r4)
            java.lang.String r4 = " popExitAnim=#"
            r7.print(r4)
            int r4 = r2.mPopExitAnim
            java.lang.String r4 = java.lang.Integer.toHexString(r4)
            r7.println(r4)
        L195:
            int r1 = r1 + 1
            goto Le3
        L199:
            return
    }

    void executeOps() {
            r9 = this;
            java.util.ArrayList<androidx.fragment.app.FragmentTransaction$Op> r0 = r9.mOps
            int r0 = r0.size()
            r1 = 0
        L7:
            if (r1 >= r0) goto Lde
            java.util.ArrayList<androidx.fragment.app.FragmentTransaction$Op> r2 = r9.mOps
            java.lang.Object r2 = r2.get(r1)
            androidx.fragment.app.FragmentTransaction$Op r2 = (androidx.fragment.app.FragmentTransaction.Op) r2
            androidx.fragment.app.Fragment r3 = r2.mFragment
            r4 = 0
            if (r3 == 0) goto L29
            boolean r5 = r9.mBeingSaved
            r3.mBeingSaved = r5
            r3.setPopDirection(r4)
            int r5 = r9.mTransition
            r3.setNextTransition(r5)
            java.util.ArrayList<java.lang.String> r5 = r9.mSharedElementSourceNames
            java.util.ArrayList<java.lang.String> r6 = r9.mSharedElementTargetNames
            r3.setSharedElementNames(r5, r6)
        L29:
            int r5 = r2.mCmd
            switch(r5) {
                case 1: goto Lc4;
                case 2: goto L2e;
                case 3: goto Lb3;
                case 4: goto La2;
                case 5: goto L8c;
                case 6: goto L7b;
                case 7: goto L65;
                case 8: goto L5e;
                case 9: goto L56;
                case 10: goto L49;
                default: goto L2e;
            }
        L2e:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Unknown cmd: "
            java.lang.StringBuilder r5 = r5.append(r6)
            int r6 = r2.mCmd
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L49:
            androidx.lifecycle.Lifecycle$State r4 = r3.mMaxState
            r2.mOldMaxState = r4
            androidx.fragment.app.FragmentManager r4 = r9.mManager
            androidx.lifecycle.Lifecycle$State r5 = r2.mCurrentMaxState
            r4.setMaxLifecycle(r3, r5)
            goto Lda
        L56:
            androidx.fragment.app.FragmentManager r4 = r9.mManager
            r5 = 0
            r4.setPrimaryNavigationFragment(r5)
            goto Lda
        L5e:
            androidx.fragment.app.FragmentManager r4 = r9.mManager
            r4.setPrimaryNavigationFragment(r3)
            goto Lda
        L65:
            int r5 = r2.mEnterAnim
            int r6 = r2.mExitAnim
            int r7 = r2.mPopEnterAnim
            int r8 = r2.mPopExitAnim
            r3.setAnimations(r5, r6, r7, r8)
            androidx.fragment.app.FragmentManager r5 = r9.mManager
            r5.setExitAnimationOrder(r3, r4)
            androidx.fragment.app.FragmentManager r4 = r9.mManager
            r4.attachFragment(r3)
            goto Lda
        L7b:
            int r4 = r2.mEnterAnim
            int r5 = r2.mExitAnim
            int r6 = r2.mPopEnterAnim
            int r7 = r2.mPopExitAnim
            r3.setAnimations(r4, r5, r6, r7)
            androidx.fragment.app.FragmentManager r4 = r9.mManager
            r4.detachFragment(r3)
            goto Lda
        L8c:
            int r5 = r2.mEnterAnim
            int r6 = r2.mExitAnim
            int r7 = r2.mPopEnterAnim
            int r8 = r2.mPopExitAnim
            r3.setAnimations(r5, r6, r7, r8)
            androidx.fragment.app.FragmentManager r5 = r9.mManager
            r5.setExitAnimationOrder(r3, r4)
            androidx.fragment.app.FragmentManager r4 = r9.mManager
            r4.showFragment(r3)
            goto Lda
        La2:
            int r4 = r2.mEnterAnim
            int r5 = r2.mExitAnim
            int r6 = r2.mPopEnterAnim
            int r7 = r2.mPopExitAnim
            r3.setAnimations(r4, r5, r6, r7)
            androidx.fragment.app.FragmentManager r4 = r9.mManager
            r4.hideFragment(r3)
            goto Lda
        Lb3:
            int r4 = r2.mEnterAnim
            int r5 = r2.mExitAnim
            int r6 = r2.mPopEnterAnim
            int r7 = r2.mPopExitAnim
            r3.setAnimations(r4, r5, r6, r7)
            androidx.fragment.app.FragmentManager r4 = r9.mManager
            r4.removeFragment(r3)
            goto Lda
        Lc4:
            int r5 = r2.mEnterAnim
            int r6 = r2.mExitAnim
            int r7 = r2.mPopEnterAnim
            int r8 = r2.mPopExitAnim
            r3.setAnimations(r5, r6, r7, r8)
            androidx.fragment.app.FragmentManager r5 = r9.mManager
            r5.setExitAnimationOrder(r3, r4)
            androidx.fragment.app.FragmentManager r4 = r9.mManager
            r4.addFragment(r3)
        Lda:
            int r1 = r1 + 1
            goto L7
        Lde:
            return
    }

    void executePopOps() {
            r8 = this;
            java.util.ArrayList<androidx.fragment.app.FragmentTransaction$Op> r0 = r8.mOps
            int r0 = r0.size()
            r1 = 1
            int r0 = r0 - r1
        L8:
            if (r0 < 0) goto Le2
            java.util.ArrayList<androidx.fragment.app.FragmentTransaction$Op> r2 = r8.mOps
            java.lang.Object r2 = r2.get(r0)
            androidx.fragment.app.FragmentTransaction$Op r2 = (androidx.fragment.app.FragmentTransaction.Op) r2
            androidx.fragment.app.Fragment r3 = r2.mFragment
            if (r3 == 0) goto L2d
            boolean r4 = r8.mBeingSaved
            r3.mBeingSaved = r4
            r3.setPopDirection(r1)
            int r4 = r8.mTransition
            int r4 = androidx.fragment.app.FragmentManager.reverseTransit(r4)
            r3.setNextTransition(r4)
            java.util.ArrayList<java.lang.String> r4 = r8.mSharedElementTargetNames
            java.util.ArrayList<java.lang.String> r5 = r8.mSharedElementSourceNames
            r3.setSharedElementNames(r4, r5)
        L2d:
            int r4 = r2.mCmd
            switch(r4) {
                case 1: goto Lc8;
                case 2: goto L32;
                case 3: goto Lb7;
                case 4: goto La6;
                case 5: goto L90;
                case 6: goto L7f;
                case 7: goto L69;
                case 8: goto L61;
                case 9: goto L5a;
                case 10: goto L4d;
                default: goto L32;
            }
        L32:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Unknown cmd: "
            java.lang.StringBuilder r4 = r4.append(r5)
            int r5 = r2.mCmd
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r4 = r4.toString()
            r1.<init>(r4)
            throw r1
        L4d:
            androidx.lifecycle.Lifecycle$State r4 = r3.mMaxState
            r2.mCurrentMaxState = r4
            androidx.fragment.app.FragmentManager r4 = r8.mManager
            androidx.lifecycle.Lifecycle$State r5 = r2.mOldMaxState
            r4.setMaxLifecycle(r3, r5)
            goto Lde
        L5a:
            androidx.fragment.app.FragmentManager r4 = r8.mManager
            r4.setPrimaryNavigationFragment(r3)
            goto Lde
        L61:
            androidx.fragment.app.FragmentManager r4 = r8.mManager
            r5 = 0
            r4.setPrimaryNavigationFragment(r5)
            goto Lde
        L69:
            int r4 = r2.mEnterAnim
            int r5 = r2.mExitAnim
            int r6 = r2.mPopEnterAnim
            int r7 = r2.mPopExitAnim
            r3.setAnimations(r4, r5, r6, r7)
            androidx.fragment.app.FragmentManager r4 = r8.mManager
            r4.setExitAnimationOrder(r3, r1)
            androidx.fragment.app.FragmentManager r4 = r8.mManager
            r4.detachFragment(r3)
            goto Lde
        L7f:
            int r4 = r2.mEnterAnim
            int r5 = r2.mExitAnim
            int r6 = r2.mPopEnterAnim
            int r7 = r2.mPopExitAnim
            r3.setAnimations(r4, r5, r6, r7)
            androidx.fragment.app.FragmentManager r4 = r8.mManager
            r4.attachFragment(r3)
            goto Lde
        L90:
            int r4 = r2.mEnterAnim
            int r5 = r2.mExitAnim
            int r6 = r2.mPopEnterAnim
            int r7 = r2.mPopExitAnim
            r3.setAnimations(r4, r5, r6, r7)
            androidx.fragment.app.FragmentManager r4 = r8.mManager
            r4.setExitAnimationOrder(r3, r1)
            androidx.fragment.app.FragmentManager r4 = r8.mManager
            r4.hideFragment(r3)
            goto Lde
        La6:
            int r4 = r2.mEnterAnim
            int r5 = r2.mExitAnim
            int r6 = r2.mPopEnterAnim
            int r7 = r2.mPopExitAnim
            r3.setAnimations(r4, r5, r6, r7)
            androidx.fragment.app.FragmentManager r4 = r8.mManager
            r4.showFragment(r3)
            goto Lde
        Lb7:
            int r4 = r2.mEnterAnim
            int r5 = r2.mExitAnim
            int r6 = r2.mPopEnterAnim
            int r7 = r2.mPopExitAnim
            r3.setAnimations(r4, r5, r6, r7)
            androidx.fragment.app.FragmentManager r4 = r8.mManager
            r4.addFragment(r3)
            goto Lde
        Lc8:
            int r4 = r2.mEnterAnim
            int r5 = r2.mExitAnim
            int r6 = r2.mPopEnterAnim
            int r7 = r2.mPopExitAnim
            r3.setAnimations(r4, r5, r6, r7)
            androidx.fragment.app.FragmentManager r4 = r8.mManager
            r4.setExitAnimationOrder(r3, r1)
            androidx.fragment.app.FragmentManager r4 = r8.mManager
            r4.removeFragment(r3)
        Lde:
            int r0 = r0 + (-1)
            goto L8
        Le2:
            return
    }

    androidx.fragment.app.Fragment expandOps(java.util.ArrayList<androidx.fragment.app.Fragment> r12, androidx.fragment.app.Fragment r13) {
            r11 = this;
            r0 = 0
        L1:
            java.util.ArrayList<androidx.fragment.app.FragmentTransaction$Op> r1 = r11.mOps
            int r1 = r1.size()
            if (r0 >= r1) goto Lac
            java.util.ArrayList<androidx.fragment.app.FragmentTransaction$Op> r1 = r11.mOps
            java.lang.Object r1 = r1.get(r0)
            androidx.fragment.app.FragmentTransaction$Op r1 = (androidx.fragment.app.FragmentTransaction.Op) r1
            int r2 = r1.mCmd
            r3 = 9
            r4 = 1
            switch(r2) {
                case 1: goto La3;
                case 2: goto L46;
                case 3: goto L2d;
                case 4: goto L19;
                case 5: goto L19;
                case 6: goto L2d;
                case 7: goto La3;
                case 8: goto L1b;
                default: goto L19;
            }
        L19:
            goto La9
        L1b:
            java.util.ArrayList<androidx.fragment.app.FragmentTransaction$Op> r2 = r11.mOps
            androidx.fragment.app.FragmentTransaction$Op r5 = new androidx.fragment.app.FragmentTransaction$Op
            r5.<init>(r3, r13, r4)
            r2.add(r0, r5)
            r1.mFromExpandedOp = r4
            int r0 = r0 + 1
            androidx.fragment.app.Fragment r13 = r1.mFragment
            goto La9
        L2d:
            androidx.fragment.app.Fragment r2 = r1.mFragment
            r12.remove(r2)
            androidx.fragment.app.Fragment r2 = r1.mFragment
            if (r2 != r13) goto La9
            java.util.ArrayList<androidx.fragment.app.FragmentTransaction$Op> r2 = r11.mOps
            androidx.fragment.app.FragmentTransaction$Op r5 = new androidx.fragment.app.FragmentTransaction$Op
            androidx.fragment.app.Fragment r6 = r1.mFragment
            r5.<init>(r3, r6)
            r2.add(r0, r5)
            int r0 = r0 + 1
            r13 = 0
            goto La9
        L46:
            androidx.fragment.app.Fragment r2 = r1.mFragment
            int r5 = r2.mContainerId
            r6 = 0
            int r7 = r12.size()
            int r7 = r7 - r4
        L50:
            if (r7 < 0) goto L91
            java.lang.Object r8 = r12.get(r7)
            androidx.fragment.app.Fragment r8 = (androidx.fragment.app.Fragment) r8
            int r9 = r8.mContainerId
            if (r9 != r5) goto L8e
            if (r8 != r2) goto L60
            r6 = 1
            goto L8e
        L60:
            if (r8 != r13) goto L6f
            java.util.ArrayList<androidx.fragment.app.FragmentTransaction$Op> r9 = r11.mOps
            androidx.fragment.app.FragmentTransaction$Op r10 = new androidx.fragment.app.FragmentTransaction$Op
            r10.<init>(r3, r8, r4)
            r9.add(r0, r10)
            int r0 = r0 + 1
            r13 = 0
        L6f:
            androidx.fragment.app.FragmentTransaction$Op r9 = new androidx.fragment.app.FragmentTransaction$Op
            r10 = 3
            r9.<init>(r10, r8, r4)
            int r10 = r1.mEnterAnim
            r9.mEnterAnim = r10
            int r10 = r1.mPopEnterAnim
            r9.mPopEnterAnim = r10
            int r10 = r1.mExitAnim
            r9.mExitAnim = r10
            int r10 = r1.mPopExitAnim
            r9.mPopExitAnim = r10
            java.util.ArrayList<androidx.fragment.app.FragmentTransaction$Op> r10 = r11.mOps
            r10.add(r0, r9)
            r12.remove(r8)
            int r0 = r0 + r4
        L8e:
            int r7 = r7 + (-1)
            goto L50
        L91:
            if (r6 == 0) goto L9b
            java.util.ArrayList<androidx.fragment.app.FragmentTransaction$Op> r3 = r11.mOps
            r3.remove(r0)
            int r0 = r0 + (-1)
            goto La2
        L9b:
            r1.mCmd = r4
            r1.mFromExpandedOp = r4
            r12.add(r2)
        La2:
            goto La9
        La3:
            androidx.fragment.app.Fragment r2 = r1.mFragment
            r12.add(r2)
        La9:
            int r0 = r0 + r4
            goto L1
        Lac:
            return r13
    }

    @Override // androidx.fragment.app.FragmentManager.OpGenerator
    public boolean generateOps(java.util.ArrayList<androidx.fragment.app.BackStackRecord> r3, java.util.ArrayList<java.lang.Boolean> r4) {
            r2 = this;
            r0 = 2
            boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r0)
            if (r0 == 0) goto L1f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Run: "
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.v(r1, r0)
        L1f:
            r3.add(r2)
            r0 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r4.add(r0)
            boolean r0 = r2.mAddToBackStack
            if (r0 == 0) goto L33
            androidx.fragment.app.FragmentManager r0 = r2.mManager
            r0.addBackStackState(r2)
        L33:
            r0 = 1
            return r0
    }

    @Override // androidx.fragment.app.FragmentManager.BackStackEntry
    public java.lang.CharSequence getBreadCrumbShortTitle() {
            r2 = this;
            int r0 = r2.mBreadCrumbShortTitleRes
            if (r0 == 0) goto L15
            androidx.fragment.app.FragmentManager r0 = r2.mManager
            androidx.fragment.app.FragmentHostCallback r0 = r0.getHost()
            android.content.Context r0 = r0.getContext()
            int r1 = r2.mBreadCrumbShortTitleRes
            java.lang.CharSequence r0 = r0.getText(r1)
            return r0
        L15:
            java.lang.CharSequence r0 = r2.mBreadCrumbShortTitleText
            return r0
    }

    @Override // androidx.fragment.app.FragmentManager.BackStackEntry
    public int getBreadCrumbShortTitleRes() {
            r1 = this;
            int r0 = r1.mBreadCrumbShortTitleRes
            return r0
    }

    @Override // androidx.fragment.app.FragmentManager.BackStackEntry
    public java.lang.CharSequence getBreadCrumbTitle() {
            r2 = this;
            int r0 = r2.mBreadCrumbTitleRes
            if (r0 == 0) goto L15
            androidx.fragment.app.FragmentManager r0 = r2.mManager
            androidx.fragment.app.FragmentHostCallback r0 = r0.getHost()
            android.content.Context r0 = r0.getContext()
            int r1 = r2.mBreadCrumbTitleRes
            java.lang.CharSequence r0 = r0.getText(r1)
            return r0
        L15:
            java.lang.CharSequence r0 = r2.mBreadCrumbTitleText
            return r0
    }

    @Override // androidx.fragment.app.FragmentManager.BackStackEntry
    public int getBreadCrumbTitleRes() {
            r1 = this;
            int r0 = r1.mBreadCrumbTitleRes
            return r0
    }

    @Override // androidx.fragment.app.FragmentManager.BackStackEntry
    public int getId() {
            r1 = this;
            int r0 = r1.mIndex
            return r0
    }

    @Override // androidx.fragment.app.FragmentManager.BackStackEntry
    public java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = r1.mName
            return r0
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public androidx.fragment.app.FragmentTransaction hide(androidx.fragment.app.Fragment r4) {
            r3 = this;
            androidx.fragment.app.FragmentManager r0 = r4.mFragmentManager
            if (r0 == 0) goto L2e
            androidx.fragment.app.FragmentManager r0 = r4.mFragmentManager
            androidx.fragment.app.FragmentManager r1 = r3.mManager
            if (r0 != r1) goto Lb
            goto L2e
        Lb:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Cannot hide Fragment attached to a different FragmentManager. Fragment "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = r4.toString()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " is already attached to a FragmentManager."
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L2e:
            androidx.fragment.app.FragmentTransaction r0 = super.hide(r4)
            return r0
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public boolean isEmpty() {
            r1 = this;
            java.util.ArrayList<androidx.fragment.app.FragmentTransaction$Op> r0 = r1.mOps
            boolean r0 = r0.isEmpty()
            return r0
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public androidx.fragment.app.FragmentTransaction remove(androidx.fragment.app.Fragment r4) {
            r3 = this;
            androidx.fragment.app.FragmentManager r0 = r4.mFragmentManager
            if (r0 == 0) goto L2e
            androidx.fragment.app.FragmentManager r0 = r4.mFragmentManager
            androidx.fragment.app.FragmentManager r1 = r3.mManager
            if (r0 != r1) goto Lb
            goto L2e
        Lb:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Cannot remove Fragment attached to a different FragmentManager. Fragment "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = r4.toString()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " is already attached to a FragmentManager."
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L2e:
            androidx.fragment.app.FragmentTransaction r0 = super.remove(r4)
            return r0
    }

    public void runOnCommitRunnables() {
            r2 = this;
            java.util.ArrayList<java.lang.Runnable> r0 = r2.mCommitRunnables
            if (r0 == 0) goto L1e
            r0 = 0
        L5:
            java.util.ArrayList<java.lang.Runnable> r1 = r2.mCommitRunnables
            int r1 = r1.size()
            if (r0 >= r1) goto L1b
            java.util.ArrayList<java.lang.Runnable> r1 = r2.mCommitRunnables
            java.lang.Object r1 = r1.get(r0)
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            r1.run()
            int r0 = r0 + 1
            goto L5
        L1b:
            r0 = 0
            r2.mCommitRunnables = r0
        L1e:
            return
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public androidx.fragment.app.FragmentTransaction setMaxLifecycle(androidx.fragment.app.Fragment r4, androidx.lifecycle.Lifecycle.State r5) {
            r3 = this;
            androidx.fragment.app.FragmentManager r0 = r4.mFragmentManager
            androidx.fragment.app.FragmentManager r1 = r3.mManager
            if (r0 != r1) goto L55
            androidx.lifecycle.Lifecycle$State r0 = androidx.lifecycle.Lifecycle.State.INITIALIZED
            java.lang.String r1 = "Cannot set maximum Lifecycle to "
            if (r5 != r0) goto L2f
            int r0 = r4.mState
            r2 = -1
            if (r0 > r2) goto L12
            goto L2f
        L12:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.StringBuilder r1 = r2.append(r1)
            java.lang.StringBuilder r1 = r1.append(r5)
            java.lang.String r2 = " after the Fragment has been created"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L2f:
            androidx.lifecycle.Lifecycle$State r0 = androidx.lifecycle.Lifecycle.State.DESTROYED
            if (r5 == r0) goto L38
            androidx.fragment.app.FragmentTransaction r0 = super.setMaxLifecycle(r4, r5)
            return r0
        L38:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.StringBuilder r1 = r2.append(r1)
            java.lang.StringBuilder r1 = r1.append(r5)
            java.lang.String r2 = ". Use remove() to remove the fragment from the FragmentManager and trigger its destruction."
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L55:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Cannot setMaxLifecycle for Fragment not attached to FragmentManager "
            java.lang.StringBuilder r1 = r1.append(r2)
            androidx.fragment.app.FragmentManager r2 = r3.mManager
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public androidx.fragment.app.FragmentTransaction setPrimaryNavigationFragment(androidx.fragment.app.Fragment r4) {
            r3 = this;
            if (r4 == 0) goto L30
            androidx.fragment.app.FragmentManager r0 = r4.mFragmentManager
            if (r0 == 0) goto L30
            androidx.fragment.app.FragmentManager r0 = r4.mFragmentManager
            androidx.fragment.app.FragmentManager r1 = r3.mManager
            if (r0 != r1) goto Ld
            goto L30
        Ld:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Cannot setPrimaryNavigation for Fragment attached to a different FragmentManager. Fragment "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = r4.toString()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " is already attached to a FragmentManager."
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L30:
            androidx.fragment.app.FragmentTransaction r0 = super.setPrimaryNavigationFragment(r4)
            return r0
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public androidx.fragment.app.FragmentTransaction show(androidx.fragment.app.Fragment r4) {
            r3 = this;
            androidx.fragment.app.FragmentManager r0 = r4.mFragmentManager
            if (r0 == 0) goto L2e
            androidx.fragment.app.FragmentManager r0 = r4.mFragmentManager
            androidx.fragment.app.FragmentManager r1 = r3.mManager
            if (r0 != r1) goto Lb
            goto L2e
        Lb:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Cannot show Fragment attached to a different FragmentManager. Fragment "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = r4.toString()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " is already attached to a FragmentManager."
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L2e:
            androidx.fragment.app.FragmentTransaction r0 = super.show(r4)
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 128(0x80, float:1.8E-43)
            r0.<init>(r1)
            java.lang.String r1 = "BackStackEntry{"
            r0.append(r1)
            int r1 = java.lang.System.identityHashCode(r2)
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
            int r1 = r2.mIndex
            if (r1 < 0) goto L25
            java.lang.String r1 = " #"
            r0.append(r1)
            int r1 = r2.mIndex
            r0.append(r1)
        L25:
            java.lang.String r1 = r2.mName
            if (r1 == 0) goto L33
            java.lang.String r1 = " "
            r0.append(r1)
            java.lang.String r1 = r2.mName
            r0.append(r1)
        L33:
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r1 = r0.toString()
            return r1
    }

    androidx.fragment.app.Fragment trackAddedFragmentsInPop(java.util.ArrayList<androidx.fragment.app.Fragment> r4, androidx.fragment.app.Fragment r5) {
            r3 = this;
            java.util.ArrayList<androidx.fragment.app.FragmentTransaction$Op> r0 = r3.mOps
            int r0 = r0.size()
            int r0 = r0 + (-1)
        L8:
            if (r0 < 0) goto L31
            java.util.ArrayList<androidx.fragment.app.FragmentTransaction$Op> r1 = r3.mOps
            java.lang.Object r1 = r1.get(r0)
            androidx.fragment.app.FragmentTransaction$Op r1 = (androidx.fragment.app.FragmentTransaction.Op) r1
            int r2 = r1.mCmd
            switch(r2) {
                case 1: goto L28;
                case 2: goto L17;
                case 3: goto L22;
                case 4: goto L17;
                case 5: goto L17;
                case 6: goto L22;
                case 7: goto L28;
                case 8: goto L20;
                case 9: goto L1d;
                case 10: goto L18;
                default: goto L17;
            }
        L17:
            goto L2e
        L18:
            androidx.lifecycle.Lifecycle$State r2 = r1.mOldMaxState
            r1.mCurrentMaxState = r2
            goto L2e
        L1d:
            androidx.fragment.app.Fragment r5 = r1.mFragment
            goto L2e
        L20:
            r5 = 0
            goto L2e
        L22:
            androidx.fragment.app.Fragment r2 = r1.mFragment
            r4.add(r2)
            goto L2e
        L28:
            androidx.fragment.app.Fragment r2 = r1.mFragment
            r4.remove(r2)
        L2e:
            int r0 = r0 + (-1)
            goto L8
        L31:
            return r5
    }
}
