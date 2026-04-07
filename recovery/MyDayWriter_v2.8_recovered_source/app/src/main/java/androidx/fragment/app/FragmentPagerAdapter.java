package androidx.fragment.app;

/* JADX INFO: loaded from: classes.dex */
@java.lang.Deprecated
public abstract class FragmentPagerAdapter extends androidx.viewpager.widget.PagerAdapter {
    public static final int BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT = 1;

    @java.lang.Deprecated
    public static final int BEHAVIOR_SET_USER_VISIBLE_HINT = 0;
    private static final boolean DEBUG = false;
    private static final java.lang.String TAG = "FragmentPagerAdapter";
    private final int mBehavior;
    private androidx.fragment.app.FragmentTransaction mCurTransaction;
    private androidx.fragment.app.Fragment mCurrentPrimaryItem;
    private boolean mExecutingFinishUpdate;
    private final androidx.fragment.app.FragmentManager mFragmentManager;

    @java.lang.Deprecated
    public FragmentPagerAdapter(androidx.fragment.app.FragmentManager r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public FragmentPagerAdapter(androidx.fragment.app.FragmentManager r2, int r3) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.mCurTransaction = r0
            r1.mCurrentPrimaryItem = r0
            r1.mFragmentManager = r2
            r1.mBehavior = r3
            return
    }

    private static java.lang.String makeFragmentName(int r2, long r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "android:switcher:"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r1 = ":"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void destroyItem(android.view.ViewGroup r3, int r4, java.lang.Object r5) {
            r2 = this;
            r0 = r5
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            androidx.fragment.app.FragmentTransaction r1 = r2.mCurTransaction
            if (r1 != 0) goto Lf
            androidx.fragment.app.FragmentManager r1 = r2.mFragmentManager
            androidx.fragment.app.FragmentTransaction r1 = r1.beginTransaction()
            r2.mCurTransaction = r1
        Lf:
            androidx.fragment.app.FragmentTransaction r1 = r2.mCurTransaction
            r1.detach(r0)
            androidx.fragment.app.Fragment r1 = r2.mCurrentPrimaryItem
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L1f
            r1 = 0
            r2.mCurrentPrimaryItem = r1
        L1f:
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

    public long getItemId(int r3) {
            r2 = this;
            long r0 = (long) r3
            return r0
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public java.lang.Object instantiateItem(android.view.ViewGroup r8, int r9) {
            r7 = this;
            androidx.fragment.app.FragmentTransaction r0 = r7.mCurTransaction
            if (r0 != 0) goto Lc
            androidx.fragment.app.FragmentManager r0 = r7.mFragmentManager
            androidx.fragment.app.FragmentTransaction r0 = r0.beginTransaction()
            r7.mCurTransaction = r0
        Lc:
            long r0 = r7.getItemId(r9)
            int r2 = r8.getId()
            java.lang.String r2 = makeFragmentName(r2, r0)
            androidx.fragment.app.FragmentManager r3 = r7.mFragmentManager
            androidx.fragment.app.Fragment r3 = r3.findFragmentByTag(r2)
            if (r3 == 0) goto L26
            androidx.fragment.app.FragmentTransaction r4 = r7.mCurTransaction
            r4.attach(r3)
            goto L3b
        L26:
            androidx.fragment.app.Fragment r3 = r7.getItem(r9)
            androidx.fragment.app.FragmentTransaction r4 = r7.mCurTransaction
            int r5 = r8.getId()
            int r6 = r8.getId()
            java.lang.String r6 = makeFragmentName(r6, r0)
            r4.add(r5, r3, r6)
        L3b:
            androidx.fragment.app.Fragment r4 = r7.mCurrentPrimaryItem
            if (r3 == r4) goto L53
            r4 = 0
            r3.setMenuVisibility(r4)
            int r5 = r7.mBehavior
            r6 = 1
            if (r5 != r6) goto L50
            androidx.fragment.app.FragmentTransaction r4 = r7.mCurTransaction
            androidx.lifecycle.Lifecycle$State r5 = androidx.lifecycle.Lifecycle.State.STARTED
            r4.setMaxLifecycle(r3, r5)
            goto L53
        L50:
            r3.setUserVisibleHint(r4)
        L53:
            return r3
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
    public void restoreState(android.os.Parcelable r1, java.lang.ClassLoader r2) {
            r0 = this;
            return
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public android.os.Parcelable saveState() {
            r1 = this;
            r0 = 0
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
