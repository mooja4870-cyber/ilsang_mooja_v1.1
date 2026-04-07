package androidx.fragment.app;

/* JADX INFO: loaded from: classes.dex */
@java.lang.Deprecated
public abstract class FragmentStatePagerAdapter extends androidx.viewpager.widget.PagerAdapter {
    public static final int BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT = 1;

    @java.lang.Deprecated
    public static final int BEHAVIOR_SET_USER_VISIBLE_HINT = 0;
    private static final boolean DEBUG = false;
    private static final java.lang.String TAG = "FragmentStatePagerAdapt";
    private final int mBehavior;
    private androidx.fragment.app.FragmentTransaction mCurTransaction;
    private androidx.fragment.app.Fragment mCurrentPrimaryItem;
    private boolean mExecutingFinishUpdate;
    private final androidx.fragment.app.FragmentManager mFragmentManager;
    private java.util.ArrayList<androidx.fragment.app.Fragment> mFragments;
    private java.util.ArrayList<androidx.fragment.app.Fragment.SavedState> mSavedState;

    @java.lang.Deprecated
    public FragmentStatePagerAdapter(androidx.fragment.app.FragmentManager r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public FragmentStatePagerAdapter(androidx.fragment.app.FragmentManager r3, int r4) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.mCurTransaction = r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2.mSavedState = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2.mFragments = r1
            r2.mCurrentPrimaryItem = r0
            r2.mFragmentManager = r3
            r2.mBehavior = r4
            return
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void destroyItem(android.view.ViewGroup r5, int r6, java.lang.Object r7) {
            r4 = this;
            r0 = r7
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            androidx.fragment.app.FragmentTransaction r1 = r4.mCurTransaction
            if (r1 != 0) goto Lf
            androidx.fragment.app.FragmentManager r1 = r4.mFragmentManager
            androidx.fragment.app.FragmentTransaction r1 = r1.beginTransaction()
            r4.mCurTransaction = r1
        Lf:
            java.util.ArrayList<androidx.fragment.app.Fragment$SavedState> r1 = r4.mSavedState
            int r1 = r1.size()
            r2 = 0
            if (r1 > r6) goto L1e
            java.util.ArrayList<androidx.fragment.app.Fragment$SavedState> r1 = r4.mSavedState
            r1.add(r2)
            goto Lf
        L1e:
            java.util.ArrayList<androidx.fragment.app.Fragment$SavedState> r1 = r4.mSavedState
            boolean r3 = r0.isAdded()
            if (r3 == 0) goto L2d
            androidx.fragment.app.FragmentManager r3 = r4.mFragmentManager
            androidx.fragment.app.Fragment$SavedState r3 = r3.saveFragmentInstanceState(r0)
            goto L2e
        L2d:
            r3 = r2
        L2e:
            r1.set(r6, r3)
            java.util.ArrayList<androidx.fragment.app.Fragment> r1 = r4.mFragments
            r1.set(r6, r2)
            androidx.fragment.app.FragmentTransaction r1 = r4.mCurTransaction
            r1.remove(r0)
            androidx.fragment.app.Fragment r1 = r4.mCurrentPrimaryItem
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L45
            r4.mCurrentPrimaryItem = r2
        L45:
            return
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void finishUpdate(android.view.ViewGroup r3) {
            r2 = this;
            androidx.fragment.app.FragmentTransaction r0 = r2.mCurTransaction
            if (r0 == 0) goto L1b
            boolean r0 = r2.mExecutingFinishUpdate
            if (r0 != 0) goto L18
            r0 = 1
            r1 = 0
            r2.mExecutingFinishUpdate = r0     // Catch: java.lang.Throwable -> L14
            androidx.fragment.app.FragmentTransaction r0 = r2.mCurTransaction     // Catch: java.lang.Throwable -> L14
            r0.commitNowAllowingStateLoss()     // Catch: java.lang.Throwable -> L14
            r2.mExecutingFinishUpdate = r1
            goto L18
        L14:
            r0 = move-exception
            r2.mExecutingFinishUpdate = r1
            throw r0
        L18:
            r0 = 0
            r2.mCurTransaction = r0
        L1b:
            return
    }

    public abstract androidx.fragment.app.Fragment getItem(int r1);

    @Override // androidx.viewpager.widget.PagerAdapter
    public java.lang.Object instantiateItem(android.view.ViewGroup r4, int r5) {
            r3 = this;
            java.util.ArrayList<androidx.fragment.app.Fragment> r0 = r3.mFragments
            int r0 = r0.size()
            if (r0 <= r5) goto L13
            java.util.ArrayList<androidx.fragment.app.Fragment> r0 = r3.mFragments
            java.lang.Object r0 = r0.get(r5)
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            if (r0 == 0) goto L13
            return r0
        L13:
            androidx.fragment.app.FragmentTransaction r0 = r3.mCurTransaction
            if (r0 != 0) goto L1f
            androidx.fragment.app.FragmentManager r0 = r3.mFragmentManager
            androidx.fragment.app.FragmentTransaction r0 = r0.beginTransaction()
            r3.mCurTransaction = r0
        L1f:
            androidx.fragment.app.Fragment r0 = r3.getItem(r5)
            java.util.ArrayList<androidx.fragment.app.Fragment$SavedState> r1 = r3.mSavedState
            int r1 = r1.size()
            if (r1 <= r5) goto L38
            java.util.ArrayList<androidx.fragment.app.Fragment$SavedState> r1 = r3.mSavedState
            java.lang.Object r1 = r1.get(r5)
            androidx.fragment.app.Fragment$SavedState r1 = (androidx.fragment.app.Fragment.SavedState) r1
            if (r1 == 0) goto L38
            r0.setInitialSavedState(r1)
        L38:
            java.util.ArrayList<androidx.fragment.app.Fragment> r1 = r3.mFragments
            int r1 = r1.size()
            if (r1 > r5) goto L47
            java.util.ArrayList<androidx.fragment.app.Fragment> r1 = r3.mFragments
            r2 = 0
            r1.add(r2)
            goto L38
        L47:
            r1 = 0
            r0.setMenuVisibility(r1)
            int r2 = r3.mBehavior
            if (r2 != 0) goto L52
            r0.setUserVisibleHint(r1)
        L52:
            java.util.ArrayList<androidx.fragment.app.Fragment> r1 = r3.mFragments
            r1.set(r5, r0)
            androidx.fragment.app.FragmentTransaction r1 = r3.mCurTransaction
            int r2 = r4.getId()
            r1.add(r2, r0)
            int r1 = r3.mBehavior
            r2 = 1
            if (r1 != r2) goto L6c
            androidx.fragment.app.FragmentTransaction r1 = r3.mCurTransaction
            androidx.lifecycle.Lifecycle$State r2 = androidx.lifecycle.Lifecycle.State.STARTED
            r1.setMaxLifecycle(r0, r2)
        L6c:
            return r0
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public boolean isViewFromObject(android.view.View r2, java.lang.Object r3) {
            r1 = this;
            r0 = r3
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            android.view.View r0 = r0.getView()
            if (r0 != r2) goto Lb
            r0 = 1
            goto Lc
        Lb:
            r0 = 0
        Lc:
            return r0
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void restoreState(android.os.Parcelable r10, java.lang.ClassLoader r11) {
            r9 = this;
            if (r10 == 0) goto L89
            r0 = r10
            android.os.Bundle r0 = (android.os.Bundle) r0
            r0.setClassLoader(r11)
            java.lang.String r1 = "states"
            android.os.Parcelable[] r1 = r0.getParcelableArray(r1)
            java.util.ArrayList<androidx.fragment.app.Fragment$SavedState> r2 = r9.mSavedState
            r2.clear()
            java.util.ArrayList<androidx.fragment.app.Fragment> r2 = r9.mFragments
            r2.clear()
            if (r1 == 0) goto L2a
            r2 = 0
        L1b:
            int r3 = r1.length
            if (r2 >= r3) goto L2a
            java.util.ArrayList<androidx.fragment.app.Fragment$SavedState> r3 = r9.mSavedState
            r4 = r1[r2]
            androidx.fragment.app.Fragment$SavedState r4 = (androidx.fragment.app.Fragment.SavedState) r4
            r3.add(r4)
            int r2 = r2 + 1
            goto L1b
        L2a:
            java.util.Set r2 = r0.keySet()
            java.util.Iterator r3 = r2.iterator()
        L32:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L89
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r5 = "f"
            boolean r5 = r4.startsWith(r5)
            if (r5 == 0) goto L88
            r5 = 1
            java.lang.String r5 = r4.substring(r5)
            int r5 = java.lang.Integer.parseInt(r5)
            androidx.fragment.app.FragmentManager r6 = r9.mFragmentManager
            androidx.fragment.app.Fragment r6 = r6.getFragment(r0, r4)
            if (r6 == 0) goto L70
        L57:
            java.util.ArrayList<androidx.fragment.app.Fragment> r7 = r9.mFragments
            int r7 = r7.size()
            if (r7 > r5) goto L66
            java.util.ArrayList<androidx.fragment.app.Fragment> r7 = r9.mFragments
            r8 = 0
            r7.add(r8)
            goto L57
        L66:
            r7 = 0
            r6.setMenuVisibility(r7)
            java.util.ArrayList<androidx.fragment.app.Fragment> r7 = r9.mFragments
            r7.set(r5, r6)
            goto L88
        L70:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "Bad fragment at key "
            java.lang.StringBuilder r7 = r7.append(r8)
            java.lang.StringBuilder r7 = r7.append(r4)
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = "FragmentStatePagerAdapt"
            android.util.Log.w(r8, r7)
        L88:
            goto L32
        L89:
            return
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public android.os.Parcelable saveState() {
            r5 = this;
            r0 = 0
            java.util.ArrayList<androidx.fragment.app.Fragment$SavedState> r1 = r5.mSavedState
            int r1 = r1.size()
            if (r1 <= 0) goto L21
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            r0 = r1
            java.util.ArrayList<androidx.fragment.app.Fragment$SavedState> r1 = r5.mSavedState
            int r1 = r1.size()
            androidx.fragment.app.Fragment$SavedState[] r1 = new androidx.fragment.app.Fragment.SavedState[r1]
            java.util.ArrayList<androidx.fragment.app.Fragment$SavedState> r2 = r5.mSavedState
            r2.toArray(r1)
            java.lang.String r2 = "states"
            r0.putParcelableArray(r2, r1)
        L21:
            r1 = 0
        L22:
            java.util.ArrayList<androidx.fragment.app.Fragment> r2 = r5.mFragments
            int r2 = r2.size()
            if (r1 >= r2) goto L5d
            java.util.ArrayList<androidx.fragment.app.Fragment> r2 = r5.mFragments
            java.lang.Object r2 = r2.get(r1)
            androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
            if (r2 == 0) goto L5a
            boolean r3 = r2.isAdded()
            if (r3 == 0) goto L5a
            if (r0 != 0) goto L42
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            r0 = r3
        L42:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "f"
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r3 = r3.append(r1)
            java.lang.String r3 = r3.toString()
            androidx.fragment.app.FragmentManager r4 = r5.mFragmentManager
            r4.putFragment(r0, r3, r2)
        L5a:
            int r1 = r1 + 1
            goto L22
        L5d:
            return r0
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void setPrimaryItem(android.view.ViewGroup r6, int r7, java.lang.Object r8) {
            r5 = this;
            r0 = r8
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            androidx.fragment.app.Fragment r1 = r5.mCurrentPrimaryItem
            if (r0 == r1) goto L51
            androidx.fragment.app.Fragment r1 = r5.mCurrentPrimaryItem
            r2 = 1
            if (r1 == 0) goto L31
            androidx.fragment.app.Fragment r1 = r5.mCurrentPrimaryItem
            r3 = 0
            r1.setMenuVisibility(r3)
            int r1 = r5.mBehavior
            if (r1 != r2) goto L2c
            androidx.fragment.app.FragmentTransaction r1 = r5.mCurTransaction
            if (r1 != 0) goto L22
            androidx.fragment.app.FragmentManager r1 = r5.mFragmentManager
            androidx.fragment.app.FragmentTransaction r1 = r1.beginTransaction()
            r5.mCurTransaction = r1
        L22:
            androidx.fragment.app.FragmentTransaction r1 = r5.mCurTransaction
            androidx.fragment.app.Fragment r3 = r5.mCurrentPrimaryItem
            androidx.lifecycle.Lifecycle$State r4 = androidx.lifecycle.Lifecycle.State.STARTED
            r1.setMaxLifecycle(r3, r4)
            goto L31
        L2c:
            androidx.fragment.app.Fragment r1 = r5.mCurrentPrimaryItem
            r1.setUserVisibleHint(r3)
        L31:
            r0.setMenuVisibility(r2)
            int r1 = r5.mBehavior
            if (r1 != r2) goto L4c
            androidx.fragment.app.FragmentTransaction r1 = r5.mCurTransaction
            if (r1 != 0) goto L44
            androidx.fragment.app.FragmentManager r1 = r5.mFragmentManager
            androidx.fragment.app.FragmentTransaction r1 = r1.beginTransaction()
            r5.mCurTransaction = r1
        L44:
            androidx.fragment.app.FragmentTransaction r1 = r5.mCurTransaction
            androidx.lifecycle.Lifecycle$State r2 = androidx.lifecycle.Lifecycle.State.RESUMED
            r1.setMaxLifecycle(r0, r2)
            goto L4f
        L4c:
            r0.setUserVisibleHint(r2)
        L4f:
            r5.mCurrentPrimaryItem = r0
        L51:
            return
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void startUpdate(android.view.ViewGroup r4) {
            r3 = this;
            int r0 = r4.getId()
            r1 = -1
            if (r0 == r1) goto L8
            return
        L8:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "ViewPager with adapter "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r2 = " requires a view id"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }
}
