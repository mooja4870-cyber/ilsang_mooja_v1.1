package androidx.fragment.app;

/* JADX INFO: loaded from: classes.dex */
public class Fragment implements android.content.ComponentCallbacks, android.view.View.OnCreateContextMenuListener, androidx.lifecycle.LifecycleOwner, androidx.lifecycle.ViewModelStoreOwner, androidx.lifecycle.HasDefaultViewModelProviderFactory, androidx.savedstate.SavedStateRegistryOwner, androidx.activity.result.ActivityResultCaller {
    static final int ACTIVITY_CREATED = 4;
    static final int ATTACHED = 0;
    static final int AWAITING_ENTER_EFFECTS = 6;
    static final int AWAITING_EXIT_EFFECTS = 3;
    static final int CREATED = 1;
    static final int INITIALIZING = -1;
    static final int RESUMED = 7;
    static final int STARTED = 5;
    static final java.lang.Object USE_DEFAULT_TRANSITION = null;
    static final int VIEW_CREATED = 2;
    boolean mAdded;
    androidx.fragment.app.Fragment.AnimationInfo mAnimationInfo;
    android.os.Bundle mArguments;
    int mBackStackNesting;
    boolean mBeingSaved;
    private boolean mCalled;
    androidx.fragment.app.FragmentManager mChildFragmentManager;
    android.view.ViewGroup mContainer;
    int mContainerId;
    private int mContentLayoutId;
    androidx.lifecycle.ViewModelProvider.Factory mDefaultFactory;
    boolean mDeferStart;
    boolean mDetached;
    int mFragmentId;
    androidx.fragment.app.FragmentManager mFragmentManager;
    boolean mFromLayout;
    boolean mHasMenu;
    boolean mHidden;
    boolean mHiddenChanged;
    androidx.fragment.app.FragmentHostCallback<?> mHost;
    boolean mInDynamicContainer;
    boolean mInLayout;
    boolean mIsCreated;
    private java.lang.Boolean mIsPrimaryNavigationFragment;
    android.view.LayoutInflater mLayoutInflater;
    androidx.lifecycle.LifecycleRegistry mLifecycleRegistry;
    androidx.lifecycle.Lifecycle.State mMaxState;
    boolean mMenuVisible;
    private final java.util.concurrent.atomic.AtomicInteger mNextLocalRequestCode;
    private final java.util.ArrayList<androidx.fragment.app.Fragment.OnPreAttachedListener> mOnPreAttachedListeners;
    androidx.fragment.app.Fragment mParentFragment;
    boolean mPerformedCreateView;
    java.lang.Runnable mPostponedDurationRunnable;
    android.os.Handler mPostponedHandler;
    public java.lang.String mPreviousWho;
    boolean mRemoving;
    boolean mRestored;
    boolean mRetainInstance;
    boolean mRetainInstanceChangedWhileDetached;
    android.os.Bundle mSavedFragmentState;
    private final androidx.fragment.app.Fragment.OnPreAttachedListener mSavedStateAttachListener;
    androidx.savedstate.SavedStateRegistryController mSavedStateRegistryController;
    java.lang.Boolean mSavedUserVisibleHint;
    android.os.Bundle mSavedViewRegistryState;
    android.util.SparseArray<android.os.Parcelable> mSavedViewState;
    int mState;
    java.lang.String mTag;
    androidx.fragment.app.Fragment mTarget;
    int mTargetRequestCode;
    java.lang.String mTargetWho;
    boolean mTransitioning;
    boolean mUserVisibleHint;
    android.view.View mView;
    androidx.fragment.app.FragmentViewLifecycleOwner mViewLifecycleOwner;
    androidx.lifecycle.MutableLiveData<androidx.lifecycle.LifecycleOwner> mViewLifecycleOwnerLiveData;
    java.lang.String mWho;











    static class AnimationInfo {
        java.lang.Boolean mAllowEnterTransitionOverlap;
        java.lang.Boolean mAllowReturnTransitionOverlap;
        android.view.View mAnimatingAway;
        int mEnterAnim;
        java.lang.Object mEnterTransition;
        androidx.core.app.SharedElementCallback mEnterTransitionCallback;
        boolean mEnterTransitionPostponed;
        int mExitAnim;
        java.lang.Object mExitTransition;
        androidx.core.app.SharedElementCallback mExitTransitionCallback;
        android.view.View mFocusedView;
        boolean mIsPop;
        int mNextTransition;
        int mPopEnterAnim;
        int mPopExitAnim;
        float mPostOnViewCreatedAlpha;
        java.lang.Object mReenterTransition;
        java.lang.Object mReturnTransition;
        java.lang.Object mSharedElementEnterTransition;
        java.lang.Object mSharedElementReturnTransition;
        java.util.ArrayList<java.lang.String> mSharedElementSourceNames;
        java.util.ArrayList<java.lang.String> mSharedElementTargetNames;

        AnimationInfo() {
                r2 = this;
                r2.<init>()
                r0 = 0
                r2.mEnterTransition = r0
                java.lang.Object r1 = androidx.fragment.app.Fragment.USE_DEFAULT_TRANSITION
                r2.mReturnTransition = r1
                r2.mExitTransition = r0
                java.lang.Object r1 = androidx.fragment.app.Fragment.USE_DEFAULT_TRANSITION
                r2.mReenterTransition = r1
                r2.mSharedElementEnterTransition = r0
                java.lang.Object r1 = androidx.fragment.app.Fragment.USE_DEFAULT_TRANSITION
                r2.mSharedElementReturnTransition = r1
                r2.mEnterTransitionCallback = r0
                r2.mExitTransitionCallback = r0
                r1 = 1065353216(0x3f800000, float:1.0)
                r2.mPostOnViewCreatedAlpha = r1
                r2.mFocusedView = r0
                return
        }
    }

    public static class InstantiationException extends java.lang.RuntimeException {
        public InstantiationException(java.lang.String r1, java.lang.Exception r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }
    }

    private static abstract class OnPreAttachedListener {
        private OnPreAttachedListener() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ OnPreAttachedListener(androidx.fragment.app.Fragment.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        abstract void onPreAttached();
    }

    public static class SavedState implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<androidx.fragment.app.Fragment.SavedState> CREATOR = null;
        final android.os.Bundle mState;


        static {
                androidx.fragment.app.Fragment$SavedState$1 r0 = new androidx.fragment.app.Fragment$SavedState$1
                r0.<init>()
                androidx.fragment.app.Fragment.SavedState.CREATOR = r0
                return
        }

        SavedState(android.os.Bundle r1) {
                r0 = this;
                r0.<init>()
                r0.mState = r1
                return
        }

        SavedState(android.os.Parcel r2, java.lang.ClassLoader r3) {
                r1 = this;
                r1.<init>()
                android.os.Bundle r0 = r2.readBundle()
                r1.mState = r0
                if (r3 == 0) goto L14
                android.os.Bundle r0 = r1.mState
                if (r0 == 0) goto L14
                android.os.Bundle r0 = r1.mState
                r0.setClassLoader(r3)
            L14:
                return
        }

        @Override // android.os.Parcelable
        public int describeContents() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel r2, int r3) {
                r1 = this;
                android.os.Bundle r0 = r1.mState
                r2.writeBundle(r0)
                return
        }
    }

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            androidx.fragment.app.Fragment.USE_DEFAULT_TRANSITION = r0
            return
    }

    public Fragment() {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.mState = r0
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r0 = r0.toString()
            r1.mWho = r0
            r0 = 0
            r1.mTargetWho = r0
            r1.mIsPrimaryNavigationFragment = r0
            androidx.fragment.app.FragmentManagerImpl r0 = new androidx.fragment.app.FragmentManagerImpl
            r0.<init>()
            r1.mChildFragmentManager = r0
            r0 = 1
            r1.mMenuVisible = r0
            r1.mUserVisibleHint = r0
            androidx.fragment.app.Fragment$1 r0 = new androidx.fragment.app.Fragment$1
            r0.<init>(r1)
            r1.mPostponedDurationRunnable = r0
            androidx.lifecycle.Lifecycle$State r0 = androidx.lifecycle.Lifecycle.State.RESUMED
            r1.mMaxState = r0
            androidx.lifecycle.MutableLiveData r0 = new androidx.lifecycle.MutableLiveData
            r0.<init>()
            r1.mViewLifecycleOwnerLiveData = r0
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r0.<init>()
            r1.mNextLocalRequestCode = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.mOnPreAttachedListeners = r0
            androidx.fragment.app.Fragment$2 r0 = new androidx.fragment.app.Fragment$2
            r0.<init>(r1)
            r1.mSavedStateAttachListener = r0
            r1.initLifecycle()
            return
    }

    public Fragment(int r1) {
            r0 = this;
            r0.<init>()
            r0.mContentLayoutId = r1
            return
    }

    private androidx.fragment.app.Fragment.AnimationInfo ensureAnimationInfo() {
            r1 = this;
            androidx.fragment.app.Fragment$AnimationInfo r0 = r1.mAnimationInfo
            if (r0 != 0) goto Lb
            androidx.fragment.app.Fragment$AnimationInfo r0 = new androidx.fragment.app.Fragment$AnimationInfo
            r0.<init>()
            r1.mAnimationInfo = r0
        Lb:
            androidx.fragment.app.Fragment$AnimationInfo r0 = r1.mAnimationInfo
            return r0
    }

    private int getMinimumMaxLifecycleState() {
            r2 = this;
            androidx.lifecycle.Lifecycle$State r0 = r2.mMaxState
            androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.INITIALIZED
            if (r0 == r1) goto L1c
            androidx.fragment.app.Fragment r0 = r2.mParentFragment
            if (r0 != 0) goto Lb
            goto L1c
        Lb:
            androidx.lifecycle.Lifecycle$State r0 = r2.mMaxState
            int r0 = r0.ordinal()
            androidx.fragment.app.Fragment r1 = r2.mParentFragment
            int r1 = r1.getMinimumMaxLifecycleState()
            int r0 = java.lang.Math.min(r0, r1)
            return r0
        L1c:
            androidx.lifecycle.Lifecycle$State r0 = r2.mMaxState
            int r0 = r0.ordinal()
            return r0
    }

    private androidx.fragment.app.Fragment getTargetFragment(boolean r3) {
            r2 = this;
            if (r3 == 0) goto L5
            androidx.fragment.app.strictmode.FragmentStrictMode.onGetTargetFragmentUsage(r2)
        L5:
            androidx.fragment.app.Fragment r0 = r2.mTarget
            if (r0 == 0) goto Lc
            androidx.fragment.app.Fragment r0 = r2.mTarget
            return r0
        Lc:
            androidx.fragment.app.FragmentManager r0 = r2.mFragmentManager
            if (r0 == 0) goto L1d
            java.lang.String r0 = r2.mTargetWho
            if (r0 == 0) goto L1d
            androidx.fragment.app.FragmentManager r0 = r2.mFragmentManager
            java.lang.String r1 = r2.mTargetWho
            androidx.fragment.app.Fragment r0 = r0.findActiveFragment(r1)
            return r0
        L1d:
            r0 = 0
            return r0
    }

    private void initLifecycle() {
            r2 = this;
            androidx.lifecycle.LifecycleRegistry r0 = new androidx.lifecycle.LifecycleRegistry
            r0.<init>(r2)
            r2.mLifecycleRegistry = r0
            androidx.savedstate.SavedStateRegistryController r0 = androidx.savedstate.SavedStateRegistryController.create(r2)
            r2.mSavedStateRegistryController = r0
            r0 = 0
            r2.mDefaultFactory = r0
            java.util.ArrayList<androidx.fragment.app.Fragment$OnPreAttachedListener> r0 = r2.mOnPreAttachedListeners
            androidx.fragment.app.Fragment$OnPreAttachedListener r1 = r2.mSavedStateAttachListener
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L1f
            androidx.fragment.app.Fragment$OnPreAttachedListener r0 = r2.mSavedStateAttachListener
            r2.registerOnPreAttachListener(r0)
        L1f:
            return
    }

    @java.lang.Deprecated
    public static androidx.fragment.app.Fragment instantiate(android.content.Context r1, java.lang.String r2) {
            r0 = 0
            androidx.fragment.app.Fragment r0 = instantiate(r1, r2, r0)
            return r0
    }

    @java.lang.Deprecated
    public static androidx.fragment.app.Fragment instantiate(android.content.Context r5, java.lang.String r6, android.os.Bundle r7) {
            java.lang.String r0 = ": make sure class name exists, is public, and has an empty constructor that is public"
            java.lang.String r1 = "Unable to instantiate fragment "
            java.lang.ClassLoader r2 = r5.getClassLoader()     // Catch: java.lang.reflect.InvocationTargetException -> L2c java.lang.NoSuchMethodException -> L4a java.lang.IllegalAccessException -> L68 java.lang.InstantiationException -> L84
            java.lang.Class r2 = androidx.fragment.app.FragmentFactory.loadFragmentClass(r2, r6)     // Catch: java.lang.reflect.InvocationTargetException -> L2c java.lang.NoSuchMethodException -> L4a java.lang.IllegalAccessException -> L68 java.lang.InstantiationException -> L84
            r3 = 0
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch: java.lang.reflect.InvocationTargetException -> L2c java.lang.NoSuchMethodException -> L4a java.lang.IllegalAccessException -> L68 java.lang.InstantiationException -> L84
            java.lang.reflect.Constructor r4 = r2.getConstructor(r4)     // Catch: java.lang.reflect.InvocationTargetException -> L2c java.lang.NoSuchMethodException -> L4a java.lang.IllegalAccessException -> L68 java.lang.InstantiationException -> L84
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.reflect.InvocationTargetException -> L2c java.lang.NoSuchMethodException -> L4a java.lang.IllegalAccessException -> L68 java.lang.InstantiationException -> L84
            java.lang.Object r3 = r4.newInstance(r3)     // Catch: java.lang.reflect.InvocationTargetException -> L2c java.lang.NoSuchMethodException -> L4a java.lang.IllegalAccessException -> L68 java.lang.InstantiationException -> L84
            androidx.fragment.app.Fragment r3 = (androidx.fragment.app.Fragment) r3     // Catch: java.lang.reflect.InvocationTargetException -> L2c java.lang.NoSuchMethodException -> L4a java.lang.IllegalAccessException -> L68 java.lang.InstantiationException -> L84
            if (r7 == 0) goto L2b
            java.lang.Class r4 = r3.getClass()     // Catch: java.lang.reflect.InvocationTargetException -> L2c java.lang.NoSuchMethodException -> L4a java.lang.IllegalAccessException -> L68 java.lang.InstantiationException -> L84
            java.lang.ClassLoader r4 = r4.getClassLoader()     // Catch: java.lang.reflect.InvocationTargetException -> L2c java.lang.NoSuchMethodException -> L4a java.lang.IllegalAccessException -> L68 java.lang.InstantiationException -> L84
            r7.setClassLoader(r4)     // Catch: java.lang.reflect.InvocationTargetException -> L2c java.lang.NoSuchMethodException -> L4a java.lang.IllegalAccessException -> L68 java.lang.InstantiationException -> L84
            r3.setArguments(r7)     // Catch: java.lang.reflect.InvocationTargetException -> L2c java.lang.NoSuchMethodException -> L4a java.lang.IllegalAccessException -> L68 java.lang.InstantiationException -> L84
        L2b:
            return r3
        L2c:
            r0 = move-exception
            androidx.fragment.app.Fragment$InstantiationException r2 = new androidx.fragment.app.Fragment$InstantiationException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.StringBuilder r1 = r3.append(r1)
            java.lang.StringBuilder r1 = r1.append(r6)
            java.lang.String r3 = ": calling Fragment constructor caused an exception"
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r1 = r1.toString()
            r2.<init>(r1, r0)
            throw r2
        L4a:
            r0 = move-exception
            androidx.fragment.app.Fragment$InstantiationException r2 = new androidx.fragment.app.Fragment$InstantiationException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.StringBuilder r1 = r3.append(r1)
            java.lang.StringBuilder r1 = r1.append(r6)
            java.lang.String r3 = ": could not find Fragment constructor"
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r1 = r1.toString()
            r2.<init>(r1, r0)
            throw r2
        L68:
            r2 = move-exception
            androidx.fragment.app.Fragment$InstantiationException r3 = new androidx.fragment.app.Fragment$InstantiationException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.StringBuilder r1 = r4.append(r1)
            java.lang.StringBuilder r1 = r1.append(r6)
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r0 = r0.toString()
            r3.<init>(r0, r2)
            throw r3
        L84:
            r2 = move-exception
            androidx.fragment.app.Fragment$InstantiationException r3 = new androidx.fragment.app.Fragment$InstantiationException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.StringBuilder r1 = r4.append(r1)
            java.lang.StringBuilder r1 = r1.append(r6)
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r0 = r0.toString()
            r3.<init>(r0, r2)
            throw r3
    }

    private <I, O> androidx.activity.result.ActivityResultLauncher<I> prepareCallInternal(androidx.activity.result.contract.ActivityResultContract<I, O> r8, androidx.arch.core.util.Function<java.lang.Void, androidx.activity.result.ActivityResultRegistry> r9, androidx.activity.result.ActivityResultCallback<O> r10) {
            r7 = this;
            int r0 = r7.mState
            r1 = 1
            if (r0 > r1) goto L1d
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            r4 = r0
            androidx.fragment.app.Fragment$9 r1 = new androidx.fragment.app.Fragment$9
            r2 = r7
            r5 = r8
            r3 = r9
            r6 = r10
            r1.<init>(r2, r3, r4, r5, r6)
            r7.registerOnPreAttachListener(r1)
            androidx.fragment.app.Fragment$10 r8 = new androidx.fragment.app.Fragment$10
            r8.<init>(r7, r4, r5)
            return r8
        L1d:
            r2 = r7
            r5 = r8
            r3 = r9
            r6 = r10
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "Fragment "
            java.lang.StringBuilder r9 = r9.append(r10)
            java.lang.StringBuilder r9 = r9.append(r7)
            java.lang.String r10 = " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate())."
            java.lang.StringBuilder r9 = r9.append(r10)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
    }

    private void registerOnPreAttachListener(androidx.fragment.app.Fragment.OnPreAttachedListener r2) {
            r1 = this;
            int r0 = r1.mState
            if (r0 < 0) goto L8
            r2.onPreAttached()
            goto Ld
        L8:
            java.util.ArrayList<androidx.fragment.app.Fragment$OnPreAttachedListener> r0 = r1.mOnPreAttachedListeners
            r0.add(r2)
        Ld:
            return
    }

    private void restoreViewState() {
            r3 = this;
            r0 = 3
            boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r0)
            if (r0 == 0) goto L1f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "moveto RESTORE_VIEW_STATE: "
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.d(r1, r0)
        L1f:
            android.view.View r0 = r3.mView
            if (r0 == 0) goto L33
            r0 = 0
            android.os.Bundle r1 = r3.mSavedFragmentState
            if (r1 == 0) goto L30
            android.os.Bundle r1 = r3.mSavedFragmentState
            java.lang.String r2 = "savedInstanceState"
            android.os.Bundle r0 = r1.getBundle(r2)
        L30:
            r3.restoreViewState(r0)
        L33:
            r0 = 0
            r3.mSavedFragmentState = r0
            return
    }

    void callStartTransitionListener(boolean r4) {
            r3 = this;
            androidx.fragment.app.Fragment$AnimationInfo r0 = r3.mAnimationInfo
            if (r0 == 0) goto L9
            androidx.fragment.app.Fragment$AnimationInfo r0 = r3.mAnimationInfo
            r1 = 0
            r0.mEnterTransitionPostponed = r1
        L9:
            android.view.View r0 = r3.mView
            if (r0 == 0) goto L42
            android.view.ViewGroup r0 = r3.mContainer
            if (r0 == 0) goto L42
            androidx.fragment.app.FragmentManager r0 = r3.mFragmentManager
            if (r0 == 0) goto L42
            android.view.ViewGroup r0 = r3.mContainer
            androidx.fragment.app.FragmentManager r1 = r3.mFragmentManager
            androidx.fragment.app.SpecialEffectsController r0 = androidx.fragment.app.SpecialEffectsController.getOrCreateController(r0, r1)
            r0.markPostponedState()
            if (r4 == 0) goto L31
            androidx.fragment.app.FragmentHostCallback<?> r1 = r3.mHost
            android.os.Handler r1 = r1.getHandler()
            androidx.fragment.app.Fragment$4 r2 = new androidx.fragment.app.Fragment$4
            r2.<init>(r3, r0)
            r1.post(r2)
            goto L34
        L31:
            r0.executePendingOperations()
        L34:
            android.os.Handler r1 = r3.mPostponedHandler
            if (r1 == 0) goto L42
            android.os.Handler r1 = r3.mPostponedHandler
            java.lang.Runnable r2 = r3.mPostponedDurationRunnable
            r1.removeCallbacks(r2)
            r1 = 0
            r3.mPostponedHandler = r1
        L42:
            return
    }

    androidx.fragment.app.FragmentContainer createFragmentContainer() {
            r1 = this;
            androidx.fragment.app.Fragment$5 r0 = new androidx.fragment.app.Fragment$5
            r0.<init>(r1)
            return r0
    }

    public void dump(java.lang.String r5, java.io.FileDescriptor r6, java.io.PrintWriter r7, java.lang.String[] r8) {
            r4 = this;
            r7.print(r5)
            java.lang.String r0 = "mFragmentId=#"
            r7.print(r0)
            int r0 = r4.mFragmentId
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            r7.print(r0)
            java.lang.String r0 = " mContainerId=#"
            r7.print(r0)
            int r0 = r4.mContainerId
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            r7.print(r0)
            java.lang.String r0 = " mTag="
            r7.print(r0)
            java.lang.String r0 = r4.mTag
            r7.println(r0)
            r7.print(r5)
            java.lang.String r0 = "mState="
            r7.print(r0)
            int r0 = r4.mState
            r7.print(r0)
            java.lang.String r0 = " mWho="
            r7.print(r0)
            java.lang.String r0 = r4.mWho
            r7.print(r0)
            java.lang.String r0 = " mBackStackNesting="
            r7.print(r0)
            int r0 = r4.mBackStackNesting
            r7.println(r0)
            r7.print(r5)
            java.lang.String r0 = "mAdded="
            r7.print(r0)
            boolean r0 = r4.mAdded
            r7.print(r0)
            java.lang.String r0 = " mRemoving="
            r7.print(r0)
            boolean r0 = r4.mRemoving
            r7.print(r0)
            java.lang.String r0 = " mFromLayout="
            r7.print(r0)
            boolean r0 = r4.mFromLayout
            r7.print(r0)
            java.lang.String r0 = " mInLayout="
            r7.print(r0)
            boolean r0 = r4.mInLayout
            r7.println(r0)
            r7.print(r5)
            java.lang.String r0 = "mHidden="
            r7.print(r0)
            boolean r0 = r4.mHidden
            r7.print(r0)
            java.lang.String r0 = " mDetached="
            r7.print(r0)
            boolean r0 = r4.mDetached
            r7.print(r0)
            java.lang.String r0 = " mMenuVisible="
            r7.print(r0)
            boolean r0 = r4.mMenuVisible
            r7.print(r0)
            java.lang.String r0 = " mHasMenu="
            r7.print(r0)
            boolean r0 = r4.mHasMenu
            r7.println(r0)
            r7.print(r5)
            java.lang.String r0 = "mRetainInstance="
            r7.print(r0)
            boolean r0 = r4.mRetainInstance
            r7.print(r0)
            java.lang.String r0 = " mUserVisibleHint="
            r7.print(r0)
            boolean r0 = r4.mUserVisibleHint
            r7.println(r0)
            androidx.fragment.app.FragmentManager r0 = r4.mFragmentManager
            if (r0 == 0) goto Lc8
            r7.print(r5)
            java.lang.String r0 = "mFragmentManager="
            r7.print(r0)
            androidx.fragment.app.FragmentManager r0 = r4.mFragmentManager
            r7.println(r0)
        Lc8:
            androidx.fragment.app.FragmentHostCallback<?> r0 = r4.mHost
            if (r0 == 0) goto Ld9
            r7.print(r5)
            java.lang.String r0 = "mHost="
            r7.print(r0)
            androidx.fragment.app.FragmentHostCallback<?> r0 = r4.mHost
            r7.println(r0)
        Ld9:
            androidx.fragment.app.Fragment r0 = r4.mParentFragment
            if (r0 == 0) goto Lea
            r7.print(r5)
            java.lang.String r0 = "mParentFragment="
            r7.print(r0)
            androidx.fragment.app.Fragment r0 = r4.mParentFragment
            r7.println(r0)
        Lea:
            android.os.Bundle r0 = r4.mArguments
            if (r0 == 0) goto Lfb
            r7.print(r5)
            java.lang.String r0 = "mArguments="
            r7.print(r0)
            android.os.Bundle r0 = r4.mArguments
            r7.println(r0)
        Lfb:
            android.os.Bundle r0 = r4.mSavedFragmentState
            if (r0 == 0) goto L10c
            r7.print(r5)
            java.lang.String r0 = "mSavedFragmentState="
            r7.print(r0)
            android.os.Bundle r0 = r4.mSavedFragmentState
            r7.println(r0)
        L10c:
            android.util.SparseArray<android.os.Parcelable> r0 = r4.mSavedViewState
            if (r0 == 0) goto L11d
            r7.print(r5)
            java.lang.String r0 = "mSavedViewState="
            r7.print(r0)
            android.util.SparseArray<android.os.Parcelable> r0 = r4.mSavedViewState
            r7.println(r0)
        L11d:
            android.os.Bundle r0 = r4.mSavedViewRegistryState
            if (r0 == 0) goto L12e
            r7.print(r5)
            java.lang.String r0 = "mSavedViewRegistryState="
            r7.print(r0)
            android.os.Bundle r0 = r4.mSavedViewRegistryState
            r7.println(r0)
        L12e:
            r0 = 0
            androidx.fragment.app.Fragment r0 = r4.getTargetFragment(r0)
            if (r0 == 0) goto L14a
            r7.print(r5)
            java.lang.String r1 = "mTarget="
            r7.print(r1)
            r7.print(r0)
            java.lang.String r1 = " mTargetRequestCode="
            r7.print(r1)
            int r1 = r4.mTargetRequestCode
            r7.println(r1)
        L14a:
            r7.print(r5)
            java.lang.String r1 = "mPopDirection="
            r7.print(r1)
            boolean r1 = r4.getPopDirection()
            r7.println(r1)
            int r1 = r4.getEnterAnim()
            if (r1 == 0) goto L16e
            r7.print(r5)
            java.lang.String r1 = "getEnterAnim="
            r7.print(r1)
            int r1 = r4.getEnterAnim()
            r7.println(r1)
        L16e:
            int r1 = r4.getExitAnim()
            if (r1 == 0) goto L183
            r7.print(r5)
            java.lang.String r1 = "getExitAnim="
            r7.print(r1)
            int r1 = r4.getExitAnim()
            r7.println(r1)
        L183:
            int r1 = r4.getPopEnterAnim()
            if (r1 == 0) goto L198
            r7.print(r5)
            java.lang.String r1 = "getPopEnterAnim="
            r7.print(r1)
            int r1 = r4.getPopEnterAnim()
            r7.println(r1)
        L198:
            int r1 = r4.getPopExitAnim()
            if (r1 == 0) goto L1ad
            r7.print(r5)
            java.lang.String r1 = "getPopExitAnim="
            r7.print(r1)
            int r1 = r4.getPopExitAnim()
            r7.println(r1)
        L1ad:
            android.view.ViewGroup r1 = r4.mContainer
            if (r1 == 0) goto L1be
            r7.print(r5)
            java.lang.String r1 = "mContainer="
            r7.print(r1)
            android.view.ViewGroup r1 = r4.mContainer
            r7.println(r1)
        L1be:
            android.view.View r1 = r4.mView
            if (r1 == 0) goto L1cf
            r7.print(r5)
            java.lang.String r1 = "mView="
            r7.print(r1)
            android.view.View r1 = r4.mView
            r7.println(r1)
        L1cf:
            android.view.View r1 = r4.getAnimatingAway()
            if (r1 == 0) goto L1e4
            r7.print(r5)
            java.lang.String r1 = "mAnimatingAway="
            r7.print(r1)
            android.view.View r1 = r4.getAnimatingAway()
            r7.println(r1)
        L1e4:
            android.content.Context r1 = r4.getContext()
            if (r1 == 0) goto L1f1
            androidx.loader.app.LoaderManager r1 = androidx.loader.app.LoaderManager.getInstance(r4)
            r1.dump(r5, r6, r7, r8)
        L1f1:
            r7.print(r5)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Child "
            java.lang.StringBuilder r1 = r1.append(r2)
            androidx.fragment.app.FragmentManager r2 = r4.mChildFragmentManager
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = ":"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r7.println(r1)
            androidx.fragment.app.FragmentManager r1 = r4.mChildFragmentManager
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.StringBuilder r2 = r2.append(r5)
            java.lang.String r3 = "  "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.dump(r2, r6, r7, r8)
            return
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = super.equals(r2)
            return r0
    }

    androidx.fragment.app.Fragment findFragmentByWho(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = r1.mWho
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L9
            return r1
        L9:
            androidx.fragment.app.FragmentManager r0 = r1.mChildFragmentManager
            androidx.fragment.app.Fragment r0 = r0.findFragmentByWho(r2)
            return r0
    }

    java.lang.String generateActivityResultKey() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "fragment_"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = r2.mWho
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "_rq#"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.util.concurrent.atomic.AtomicInteger r1 = r2.mNextLocalRequestCode
            int r1 = r1.getAndIncrement()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public final androidx.fragment.app.FragmentActivity getActivity() {
            r1 = this;
            androidx.fragment.app.FragmentHostCallback<?> r0 = r1.mHost
            if (r0 != 0) goto L6
            r0 = 0
            goto Le
        L6:
            androidx.fragment.app.FragmentHostCallback<?> r0 = r1.mHost
            android.app.Activity r0 = r0.getActivity()
            androidx.fragment.app.FragmentActivity r0 = (androidx.fragment.app.FragmentActivity) r0
        Le:
            return r0
    }

    public boolean getAllowEnterTransitionOverlap() {
            r1 = this;
            androidx.fragment.app.Fragment$AnimationInfo r0 = r1.mAnimationInfo
            if (r0 == 0) goto L14
            androidx.fragment.app.Fragment$AnimationInfo r0 = r1.mAnimationInfo
            java.lang.Boolean r0 = r0.mAllowEnterTransitionOverlap
            if (r0 != 0) goto Lb
            goto L14
        Lb:
            androidx.fragment.app.Fragment$AnimationInfo r0 = r1.mAnimationInfo
            java.lang.Boolean r0 = r0.mAllowEnterTransitionOverlap
            boolean r0 = r0.booleanValue()
            goto L15
        L14:
            r0 = 1
        L15:
            return r0
    }

    public boolean getAllowReturnTransitionOverlap() {
            r1 = this;
            androidx.fragment.app.Fragment$AnimationInfo r0 = r1.mAnimationInfo
            if (r0 == 0) goto L14
            androidx.fragment.app.Fragment$AnimationInfo r0 = r1.mAnimationInfo
            java.lang.Boolean r0 = r0.mAllowReturnTransitionOverlap
            if (r0 != 0) goto Lb
            goto L14
        Lb:
            androidx.fragment.app.Fragment$AnimationInfo r0 = r1.mAnimationInfo
            java.lang.Boolean r0 = r0.mAllowReturnTransitionOverlap
            boolean r0 = r0.booleanValue()
            goto L15
        L14:
            r0 = 1
        L15:
            return r0
    }

    android.view.View getAnimatingAway() {
            r1 = this;
            androidx.fragment.app.Fragment$AnimationInfo r0 = r1.mAnimationInfo
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            androidx.fragment.app.Fragment$AnimationInfo r0 = r1.mAnimationInfo
            android.view.View r0 = r0.mAnimatingAway
            return r0
    }

    public final android.os.Bundle getArguments() {
            r1 = this;
            android.os.Bundle r0 = r1.mArguments
            return r0
    }

    public final androidx.fragment.app.FragmentManager getChildFragmentManager() {
            r3 = this;
            androidx.fragment.app.FragmentHostCallback<?> r0 = r3.mHost
            if (r0 == 0) goto L7
            androidx.fragment.app.FragmentManager r0 = r3.mChildFragmentManager
            return r0
        L7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Fragment "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r2 = " has not been attached yet."
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public android.content.Context getContext() {
            r1 = this;
            androidx.fragment.app.FragmentHostCallback<?> r0 = r1.mHost
            if (r0 != 0) goto L6
            r0 = 0
            goto Lc
        L6:
            androidx.fragment.app.FragmentHostCallback<?> r0 = r1.mHost
            android.content.Context r0 = r0.getContext()
        Lc:
            return r0
    }

    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    public androidx.lifecycle.viewmodel.CreationExtras getDefaultViewModelCreationExtras() {
            r5 = this;
            r0 = 0
            android.content.Context r1 = r5.requireContext()
            android.content.Context r1 = r1.getApplicationContext()
        L9:
            boolean r2 = r1 instanceof android.content.ContextWrapper
            if (r2 == 0) goto L1d
            boolean r2 = r1 instanceof android.app.Application
            if (r2 == 0) goto L15
            r0 = r1
            android.app.Application r0 = (android.app.Application) r0
            goto L1d
        L15:
            r2 = r1
            android.content.ContextWrapper r2 = (android.content.ContextWrapper) r2
            android.content.Context r1 = r2.getBaseContext()
            goto L9
        L1d:
            if (r0 != 0) goto L4c
            r2 = 3
            boolean r2 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r2)
            if (r2 == 0) goto L4c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Could not find Application instance from Context "
            java.lang.StringBuilder r2 = r2.append(r3)
            android.content.Context r3 = r5.requireContext()
            android.content.Context r3 = r3.getApplicationContext()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory"
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "FragmentManager"
            android.util.Log.d(r3, r2)
        L4c:
            androidx.lifecycle.viewmodel.MutableCreationExtras r2 = new androidx.lifecycle.viewmodel.MutableCreationExtras
            r2.<init>()
            if (r0 == 0) goto L58
            androidx.lifecycle.viewmodel.CreationExtras$Key<android.app.Application> r3 = androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY
            r2.set(r3, r0)
        L58:
            androidx.lifecycle.viewmodel.CreationExtras$Key<androidx.savedstate.SavedStateRegistryOwner> r3 = androidx.lifecycle.SavedStateHandleSupport.SAVED_STATE_REGISTRY_OWNER_KEY
            r2.set(r3, r5)
            androidx.lifecycle.viewmodel.CreationExtras$Key<androidx.lifecycle.ViewModelStoreOwner> r3 = androidx.lifecycle.SavedStateHandleSupport.VIEW_MODEL_STORE_OWNER_KEY
            r2.set(r3, r5)
            android.os.Bundle r3 = r5.getArguments()
            if (r3 == 0) goto L71
            androidx.lifecycle.viewmodel.CreationExtras$Key<android.os.Bundle> r3 = androidx.lifecycle.SavedStateHandleSupport.DEFAULT_ARGS_KEY
            android.os.Bundle r4 = r5.getArguments()
            r2.set(r3, r4)
        L71:
            return r2
    }

    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    public androidx.lifecycle.ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
            r4 = this;
            androidx.fragment.app.FragmentManager r0 = r4.mFragmentManager
            if (r0 == 0) goto L62
            androidx.lifecycle.ViewModelProvider$Factory r0 = r4.mDefaultFactory
            if (r0 != 0) goto L5f
            r0 = 0
            android.content.Context r1 = r4.requireContext()
            android.content.Context r1 = r1.getApplicationContext()
        L11:
            boolean r2 = r1 instanceof android.content.ContextWrapper
            if (r2 == 0) goto L25
            boolean r2 = r1 instanceof android.app.Application
            if (r2 == 0) goto L1d
            r0 = r1
            android.app.Application r0 = (android.app.Application) r0
            goto L25
        L1d:
            r2 = r1
            android.content.ContextWrapper r2 = (android.content.ContextWrapper) r2
            android.content.Context r1 = r2.getBaseContext()
            goto L11
        L25:
            if (r0 != 0) goto L54
            r2 = 3
            boolean r2 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r2)
            if (r2 == 0) goto L54
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Could not find Application instance from Context "
            java.lang.StringBuilder r2 = r2.append(r3)
            android.content.Context r3 = r4.requireContext()
            android.content.Context r3 = r3.getApplicationContext()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = ", you will need CreationExtras to use AndroidViewModel with the default ViewModelProvider.Factory"
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "FragmentManager"
            android.util.Log.d(r3, r2)
        L54:
            androidx.lifecycle.SavedStateViewModelFactory r2 = new androidx.lifecycle.SavedStateViewModelFactory
            android.os.Bundle r3 = r4.getArguments()
            r2.<init>(r0, r4, r3)
            r4.mDefaultFactory = r2
        L5f:
            androidx.lifecycle.ViewModelProvider$Factory r0 = r4.mDefaultFactory
            return r0
        L62:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Can't access ViewModels from detached fragment"
            r0.<init>(r1)
            throw r0
    }

    int getEnterAnim() {
            r1 = this;
            androidx.fragment.app.Fragment$AnimationInfo r0 = r1.mAnimationInfo
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            androidx.fragment.app.Fragment$AnimationInfo r0 = r1.mAnimationInfo
            int r0 = r0.mEnterAnim
            return r0
    }

    public java.lang.Object getEnterTransition() {
            r1 = this;
            androidx.fragment.app.Fragment$AnimationInfo r0 = r1.mAnimationInfo
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            androidx.fragment.app.Fragment$AnimationInfo r0 = r1.mAnimationInfo
            java.lang.Object r0 = r0.mEnterTransition
            return r0
    }

    androidx.core.app.SharedElementCallback getEnterTransitionCallback() {
            r1 = this;
            androidx.fragment.app.Fragment$AnimationInfo r0 = r1.mAnimationInfo
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            androidx.fragment.app.Fragment$AnimationInfo r0 = r1.mAnimationInfo
            androidx.core.app.SharedElementCallback r0 = r0.mEnterTransitionCallback
            return r0
    }

    int getExitAnim() {
            r1 = this;
            androidx.fragment.app.Fragment$AnimationInfo r0 = r1.mAnimationInfo
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            androidx.fragment.app.Fragment$AnimationInfo r0 = r1.mAnimationInfo
            int r0 = r0.mExitAnim
            return r0
    }

    public java.lang.Object getExitTransition() {
            r1 = this;
            androidx.fragment.app.Fragment$AnimationInfo r0 = r1.mAnimationInfo
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            androidx.fragment.app.Fragment$AnimationInfo r0 = r1.mAnimationInfo
            java.lang.Object r0 = r0.mExitTransition
            return r0
    }

    androidx.core.app.SharedElementCallback getExitTransitionCallback() {
            r1 = this;
            androidx.fragment.app.Fragment$AnimationInfo r0 = r1.mAnimationInfo
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            androidx.fragment.app.Fragment$AnimationInfo r0 = r1.mAnimationInfo
            androidx.core.app.SharedElementCallback r0 = r0.mExitTransitionCallback
            return r0
    }

    android.view.View getFocusedView() {
            r1 = this;
            androidx.fragment.app.Fragment$AnimationInfo r0 = r1.mAnimationInfo
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            androidx.fragment.app.Fragment$AnimationInfo r0 = r1.mAnimationInfo
            android.view.View r0 = r0.mFocusedView
            return r0
    }

    @java.lang.Deprecated
    public final androidx.fragment.app.FragmentManager getFragmentManager() {
            r1 = this;
            androidx.fragment.app.FragmentManager r0 = r1.mFragmentManager
            return r0
    }

    public final java.lang.Object getHost() {
            r1 = this;
            androidx.fragment.app.FragmentHostCallback<?> r0 = r1.mHost
            if (r0 != 0) goto L6
            r0 = 0
            goto Lc
        L6:
            androidx.fragment.app.FragmentHostCallback<?> r0 = r1.mHost
            java.lang.Object r0 = r0.onGetHost()
        Lc:
            return r0
    }

    public final int getId() {
            r1 = this;
            int r0 = r1.mFragmentId
            return r0
    }

    public final android.view.LayoutInflater getLayoutInflater() {
            r1 = this;
            android.view.LayoutInflater r0 = r1.mLayoutInflater
            if (r0 != 0) goto La
            r0 = 0
            android.view.LayoutInflater r0 = r1.performGetLayoutInflater(r0)
            return r0
        La:
            android.view.LayoutInflater r0 = r1.mLayoutInflater
            return r0
    }

    @java.lang.Deprecated
    public android.view.LayoutInflater getLayoutInflater(android.os.Bundle r3) {
            r2 = this;
            androidx.fragment.app.FragmentHostCallback<?> r0 = r2.mHost
            if (r0 == 0) goto L14
            androidx.fragment.app.FragmentHostCallback<?> r0 = r2.mHost
            android.view.LayoutInflater r0 = r0.onGetLayoutInflater()
            androidx.fragment.app.FragmentManager r1 = r2.mChildFragmentManager
            android.view.LayoutInflater$Factory2 r1 = r1.getLayoutInflaterFactory()
            androidx.core.view.LayoutInflaterCompat.setFactory2(r0, r1)
            return r0
        L14:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager."
            r0.<init>(r1)
            throw r0
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public androidx.lifecycle.Lifecycle getLifecycle() {
            r1 = this;
            androidx.lifecycle.LifecycleRegistry r0 = r1.mLifecycleRegistry
            return r0
    }

    @java.lang.Deprecated
    public androidx.loader.app.LoaderManager getLoaderManager() {
            r1 = this;
            androidx.loader.app.LoaderManager r0 = androidx.loader.app.LoaderManager.getInstance(r1)
            return r0
    }

    int getNextTransition() {
            r1 = this;
            androidx.fragment.app.Fragment$AnimationInfo r0 = r1.mAnimationInfo
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            androidx.fragment.app.Fragment$AnimationInfo r0 = r1.mAnimationInfo
            int r0 = r0.mNextTransition
            return r0
    }

    public final androidx.fragment.app.Fragment getParentFragment() {
            r1 = this;
            androidx.fragment.app.Fragment r0 = r1.mParentFragment
            return r0
    }

    public final androidx.fragment.app.FragmentManager getParentFragmentManager() {
            r4 = this;
            androidx.fragment.app.FragmentManager r0 = r4.mFragmentManager
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Fragment "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r4)
            java.lang.String r3 = " not associated with a fragment manager."
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    boolean getPopDirection() {
            r1 = this;
            androidx.fragment.app.Fragment$AnimationInfo r0 = r1.mAnimationInfo
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            androidx.fragment.app.Fragment$AnimationInfo r0 = r1.mAnimationInfo
            boolean r0 = r0.mIsPop
            return r0
    }

    int getPopEnterAnim() {
            r1 = this;
            androidx.fragment.app.Fragment$AnimationInfo r0 = r1.mAnimationInfo
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            androidx.fragment.app.Fragment$AnimationInfo r0 = r1.mAnimationInfo
            int r0 = r0.mPopEnterAnim
            return r0
    }

    int getPopExitAnim() {
            r1 = this;
            androidx.fragment.app.Fragment$AnimationInfo r0 = r1.mAnimationInfo
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            androidx.fragment.app.Fragment$AnimationInfo r0 = r1.mAnimationInfo
            int r0 = r0.mPopExitAnim
            return r0
    }

    float getPostOnViewCreatedAlpha() {
            r1 = this;
            androidx.fragment.app.Fragment$AnimationInfo r0 = r1.mAnimationInfo
            if (r0 != 0) goto L7
            r0 = 1065353216(0x3f800000, float:1.0)
            return r0
        L7:
            androidx.fragment.app.Fragment$AnimationInfo r0 = r1.mAnimationInfo
            float r0 = r0.mPostOnViewCreatedAlpha
            return r0
    }

    public java.lang.Object getReenterTransition() {
            r2 = this;
            androidx.fragment.app.Fragment$AnimationInfo r0 = r2.mAnimationInfo
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            androidx.fragment.app.Fragment$AnimationInfo r0 = r2.mAnimationInfo
            java.lang.Object r0 = r0.mReenterTransition
            java.lang.Object r1 = androidx.fragment.app.Fragment.USE_DEFAULT_TRANSITION
            if (r0 != r1) goto L13
            java.lang.Object r0 = r2.getExitTransition()
            goto L17
        L13:
            androidx.fragment.app.Fragment$AnimationInfo r0 = r2.mAnimationInfo
            java.lang.Object r0 = r0.mReenterTransition
        L17:
            return r0
    }

    public final android.content.res.Resources getResources() {
            r1 = this;
            android.content.Context r0 = r1.requireContext()
            android.content.res.Resources r0 = r0.getResources()
            return r0
    }

    @java.lang.Deprecated
    public final boolean getRetainInstance() {
            r1 = this;
            androidx.fragment.app.strictmode.FragmentStrictMode.onGetRetainInstanceUsage(r1)
            boolean r0 = r1.mRetainInstance
            return r0
    }

    public java.lang.Object getReturnTransition() {
            r2 = this;
            androidx.fragment.app.Fragment$AnimationInfo r0 = r2.mAnimationInfo
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            androidx.fragment.app.Fragment$AnimationInfo r0 = r2.mAnimationInfo
            java.lang.Object r0 = r0.mReturnTransition
            java.lang.Object r1 = androidx.fragment.app.Fragment.USE_DEFAULT_TRANSITION
            if (r0 != r1) goto L13
            java.lang.Object r0 = r2.getEnterTransition()
            goto L17
        L13:
            androidx.fragment.app.Fragment$AnimationInfo r0 = r2.mAnimationInfo
            java.lang.Object r0 = r0.mReturnTransition
        L17:
            return r0
    }

    @Override // androidx.savedstate.SavedStateRegistryOwner
    public final androidx.savedstate.SavedStateRegistry getSavedStateRegistry() {
            r1 = this;
            androidx.savedstate.SavedStateRegistryController r0 = r1.mSavedStateRegistryController
            androidx.savedstate.SavedStateRegistry r0 = r0.getSavedStateRegistry()
            return r0
    }

    public java.lang.Object getSharedElementEnterTransition() {
            r1 = this;
            androidx.fragment.app.Fragment$AnimationInfo r0 = r1.mAnimationInfo
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            androidx.fragment.app.Fragment$AnimationInfo r0 = r1.mAnimationInfo
            java.lang.Object r0 = r0.mSharedElementEnterTransition
            return r0
    }

    public java.lang.Object getSharedElementReturnTransition() {
            r2 = this;
            androidx.fragment.app.Fragment$AnimationInfo r0 = r2.mAnimationInfo
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            androidx.fragment.app.Fragment$AnimationInfo r0 = r2.mAnimationInfo
            java.lang.Object r0 = r0.mSharedElementReturnTransition
            java.lang.Object r1 = androidx.fragment.app.Fragment.USE_DEFAULT_TRANSITION
            if (r0 != r1) goto L13
            java.lang.Object r0 = r2.getSharedElementEnterTransition()
            goto L17
        L13:
            androidx.fragment.app.Fragment$AnimationInfo r0 = r2.mAnimationInfo
            java.lang.Object r0 = r0.mSharedElementReturnTransition
        L17:
            return r0
    }

    java.util.ArrayList<java.lang.String> getSharedElementSourceNames() {
            r1 = this;
            androidx.fragment.app.Fragment$AnimationInfo r0 = r1.mAnimationInfo
            if (r0 == 0) goto L10
            androidx.fragment.app.Fragment$AnimationInfo r0 = r1.mAnimationInfo
            java.util.ArrayList<java.lang.String> r0 = r0.mSharedElementSourceNames
            if (r0 != 0) goto Lb
            goto L10
        Lb:
            androidx.fragment.app.Fragment$AnimationInfo r0 = r1.mAnimationInfo
            java.util.ArrayList<java.lang.String> r0 = r0.mSharedElementSourceNames
            return r0
        L10:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            return r0
    }

    java.util.ArrayList<java.lang.String> getSharedElementTargetNames() {
            r1 = this;
            androidx.fragment.app.Fragment$AnimationInfo r0 = r1.mAnimationInfo
            if (r0 == 0) goto L10
            androidx.fragment.app.Fragment$AnimationInfo r0 = r1.mAnimationInfo
            java.util.ArrayList<java.lang.String> r0 = r0.mSharedElementTargetNames
            if (r0 != 0) goto Lb
            goto L10
        Lb:
            androidx.fragment.app.Fragment$AnimationInfo r0 = r1.mAnimationInfo
            java.util.ArrayList<java.lang.String> r0 = r0.mSharedElementTargetNames
            return r0
        L10:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            return r0
    }

    public final java.lang.String getString(int r2) {
            r1 = this;
            android.content.res.Resources r0 = r1.getResources()
            java.lang.String r0 = r0.getString(r2)
            return r0
    }

    public final java.lang.String getString(int r2, java.lang.Object... r3) {
            r1 = this;
            android.content.res.Resources r0 = r1.getResources()
            java.lang.String r0 = r0.getString(r2, r3)
            return r0
    }

    public final java.lang.String getTag() {
            r1 = this;
            java.lang.String r0 = r1.mTag
            return r0
    }

    @java.lang.Deprecated
    public final androidx.fragment.app.Fragment getTargetFragment() {
            r1 = this;
            r0 = 1
            androidx.fragment.app.Fragment r0 = r1.getTargetFragment(r0)
            return r0
    }

    @java.lang.Deprecated
    public final int getTargetRequestCode() {
            r1 = this;
            androidx.fragment.app.strictmode.FragmentStrictMode.onGetTargetFragmentRequestCodeUsage(r1)
            int r0 = r1.mTargetRequestCode
            return r0
    }

    public final java.lang.CharSequence getText(int r2) {
            r1 = this;
            android.content.res.Resources r0 = r1.getResources()
            java.lang.CharSequence r0 = r0.getText(r2)
            return r0
    }

    @java.lang.Deprecated
    public boolean getUserVisibleHint() {
            r1 = this;
            boolean r0 = r1.mUserVisibleHint
            return r0
    }

    public android.view.View getView() {
            r1 = this;
            android.view.View r0 = r1.mView
            return r0
    }

    public androidx.lifecycle.LifecycleOwner getViewLifecycleOwner() {
            r3 = this;
            androidx.fragment.app.FragmentViewLifecycleOwner r0 = r3.mViewLifecycleOwner
            if (r0 == 0) goto L7
            androidx.fragment.app.FragmentViewLifecycleOwner r0 = r3.mViewLifecycleOwner
            return r0
        L7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Can't access the Fragment View's LifecycleOwner for "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r2 = " when getView() is null i.e., before onCreateView() or after onDestroyView()"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public androidx.lifecycle.LiveData<androidx.lifecycle.LifecycleOwner> getViewLifecycleOwnerLiveData() {
            r1 = this;
            androidx.lifecycle.MutableLiveData<androidx.lifecycle.LifecycleOwner> r0 = r1.mViewLifecycleOwnerLiveData
            return r0
    }

    @Override // androidx.lifecycle.ViewModelStoreOwner
    public androidx.lifecycle.ViewModelStore getViewModelStore() {
            r2 = this;
            androidx.fragment.app.FragmentManager r0 = r2.mFragmentManager
            if (r0 == 0) goto L1f
            int r0 = r2.getMinimumMaxLifecycleState()
            androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.INITIALIZED
            int r1 = r1.ordinal()
            if (r0 == r1) goto L17
            androidx.fragment.app.FragmentManager r0 = r2.mFragmentManager
            androidx.lifecycle.ViewModelStore r0 = r0.getViewModelStore(r2)
            return r0
        L17:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported"
            r0.<init>(r1)
            throw r0
        L1f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Can't access ViewModels from detached fragment"
            r0.<init>(r1)
            throw r0
    }

    public final boolean hasOptionsMenu() {
            r1 = this;
            boolean r0 = r1.mHasMenu
            return r0
    }

    public final int hashCode() {
            r1 = this;
            int r0 = super.hashCode()
            return r0
    }

    void initState() {
            r3 = this;
            r3.initLifecycle()
            java.lang.String r0 = r3.mWho
            r3.mPreviousWho = r0
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r0 = r0.toString()
            r3.mWho = r0
            r0 = 0
            r3.mAdded = r0
            r3.mRemoving = r0
            r3.mFromLayout = r0
            r3.mInLayout = r0
            r3.mRestored = r0
            r3.mBackStackNesting = r0
            r1 = 0
            r3.mFragmentManager = r1
            androidx.fragment.app.FragmentManagerImpl r2 = new androidx.fragment.app.FragmentManagerImpl
            r2.<init>()
            r3.mChildFragmentManager = r2
            r3.mHost = r1
            r3.mFragmentId = r0
            r3.mContainerId = r0
            r3.mTag = r1
            r3.mHidden = r0
            r3.mDetached = r0
            return
    }

    public final boolean isAdded() {
            r1 = this;
            androidx.fragment.app.FragmentHostCallback<?> r0 = r1.mHost
            if (r0 == 0) goto La
            boolean r0 = r1.mAdded
            if (r0 == 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            return r0
    }

    public final boolean isDetached() {
            r1 = this;
            boolean r0 = r1.mDetached
            return r0
    }

    public final boolean isHidden() {
            r2 = this;
            boolean r0 = r2.mHidden
            if (r0 != 0) goto L15
            androidx.fragment.app.FragmentManager r0 = r2.mFragmentManager
            if (r0 == 0) goto L13
            androidx.fragment.app.FragmentManager r0 = r2.mFragmentManager
            androidx.fragment.app.Fragment r1 = r2.mParentFragment
            boolean r0 = r0.isParentHidden(r1)
            if (r0 == 0) goto L13
            goto L15
        L13:
            r0 = 0
            goto L16
        L15:
            r0 = 1
        L16:
            return r0
    }

    final boolean isInBackStack() {
            r1 = this;
            int r0 = r1.mBackStackNesting
            if (r0 <= 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    public final boolean isInLayout() {
            r1 = this;
            boolean r0 = r1.mInLayout
            return r0
    }

    public final boolean isMenuVisible() {
            r2 = this;
            boolean r0 = r2.mMenuVisible
            if (r0 == 0) goto L14
            androidx.fragment.app.FragmentManager r0 = r2.mFragmentManager
            if (r0 == 0) goto L12
            androidx.fragment.app.FragmentManager r0 = r2.mFragmentManager
            androidx.fragment.app.Fragment r1 = r2.mParentFragment
            boolean r0 = r0.isParentMenuVisible(r1)
            if (r0 == 0) goto L14
        L12:
            r0 = 1
            goto L15
        L14:
            r0 = 0
        L15:
            return r0
    }

    boolean isPostponed() {
            r1 = this;
            androidx.fragment.app.Fragment$AnimationInfo r0 = r1.mAnimationInfo
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            androidx.fragment.app.Fragment$AnimationInfo r0 = r1.mAnimationInfo
            boolean r0 = r0.mEnterTransitionPostponed
            return r0
    }

    public final boolean isRemoving() {
            r1 = this;
            boolean r0 = r1.mRemoving
            return r0
    }

    public final boolean isResumed() {
            r2 = this;
            int r0 = r2.mState
            r1 = 7
            if (r0 < r1) goto L7
            r0 = 1
            goto L8
        L7:
            r0 = 0
        L8:
            return r0
    }

    public final boolean isStateSaved() {
            r1 = this;
            androidx.fragment.app.FragmentManager r0 = r1.mFragmentManager
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            androidx.fragment.app.FragmentManager r0 = r1.mFragmentManager
            boolean r0 = r0.isStateSaved()
            return r0
    }

    public final boolean isVisible() {
            r1 = this;
            boolean r0 = r1.isAdded()
            if (r0 == 0) goto L22
            boolean r0 = r1.isHidden()
            if (r0 != 0) goto L22
            android.view.View r0 = r1.mView
            if (r0 == 0) goto L22
            android.view.View r0 = r1.mView
            android.os.IBinder r0 = r0.getWindowToken()
            if (r0 == 0) goto L22
            android.view.View r0 = r1.mView
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L22
            r0 = 1
            goto L23
        L22:
            r0 = 0
        L23:
            return r0
    }

    /* JADX INFO: renamed from: lambda$performCreateView$0$androidx-fragment-app-Fragment, reason: not valid java name */
    /* synthetic */ void m84lambda$performCreateView$0$androidxfragmentappFragment() {
            r2 = this;
            androidx.fragment.app.FragmentViewLifecycleOwner r0 = r2.mViewLifecycleOwner
            android.os.Bundle r1 = r2.mSavedViewRegistryState
            r0.performRestore(r1)
            r0 = 0
            r2.mSavedViewRegistryState = r0
            return
    }

    void noteStateNotSaved() {
            r1 = this;
            androidx.fragment.app.FragmentManager r0 = r1.mChildFragmentManager
            r0.noteStateNotSaved()
            return
    }

    @java.lang.Deprecated
    public void onActivityCreated(android.os.Bundle r2) {
            r1 = this;
            r0 = 1
            r1.mCalled = r0
            return
    }

    @java.lang.Deprecated
    public void onActivityResult(int r3, int r4, android.content.Intent r5) {
            r2 = this;
            r0 = 2
            boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r0)
            if (r0 == 0) goto L3d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Fragment "
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r1 = " received the following in onActivityResult(): requestCode: "
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.String r1 = " resultCode: "
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r4)
            java.lang.String r1 = " data: "
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r5)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.v(r1, r0)
        L3d:
            return
    }

    @java.lang.Deprecated
    public void onAttach(android.app.Activity r2) {
            r1 = this;
            r0 = 1
            r1.mCalled = r0
            return
    }

    public void onAttach(android.content.Context r3) {
            r2 = this;
            r0 = 1
            r2.mCalled = r0
            androidx.fragment.app.FragmentHostCallback<?> r0 = r2.mHost
            if (r0 != 0) goto L9
            r0 = 0
            goto Lf
        L9:
            androidx.fragment.app.FragmentHostCallback<?> r0 = r2.mHost
            android.app.Activity r0 = r0.getActivity()
        Lf:
            if (r0 == 0) goto L17
            r1 = 0
            r2.mCalled = r1
            r2.onAttach(r0)
        L17:
            return
    }

    @java.lang.Deprecated
    public void onAttachFragment(androidx.fragment.app.Fragment r1) {
            r0 = this;
            return
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration r2) {
            r1 = this;
            r0 = 1
            r1.mCalled = r0
            return
    }

    public boolean onContextItemSelected(android.view.MenuItem r2) {
            r1 = this;
            r0 = 0
            return r0
    }

    public void onCreate(android.os.Bundle r3) {
            r2 = this;
            r0 = 1
            r2.mCalled = r0
            r2.restoreChildFragmentState()
            androidx.fragment.app.FragmentManager r1 = r2.mChildFragmentManager
            boolean r0 = r1.isStateAtLeast(r0)
            if (r0 != 0) goto L13
            androidx.fragment.app.FragmentManager r0 = r2.mChildFragmentManager
            r0.dispatchCreate()
        L13:
            return
    }

    public android.view.animation.Animation onCreateAnimation(int r2, boolean r3, int r4) {
            r1 = this;
            r0 = 0
            return r0
    }

    public android.animation.Animator onCreateAnimator(int r2, boolean r3, int r4) {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(android.view.ContextMenu r2, android.view.View r3, android.view.ContextMenu.ContextMenuInfo r4) {
            r1 = this;
            androidx.fragment.app.FragmentActivity r0 = r1.requireActivity()
            r0.onCreateContextMenu(r2, r3, r4)
            return
    }

    @java.lang.Deprecated
    public void onCreateOptionsMenu(android.view.Menu r1, android.view.MenuInflater r2) {
            r0 = this;
            return
    }

    public android.view.View onCreateView(android.view.LayoutInflater r3, android.view.ViewGroup r4, android.os.Bundle r5) {
            r2 = this;
            int r0 = r2.mContentLayoutId
            if (r0 == 0) goto Lc
            int r0 = r2.mContentLayoutId
            r1 = 0
            android.view.View r0 = r3.inflate(r0, r4, r1)
            return r0
        Lc:
            r0 = 0
            return r0
    }

    public void onDestroy() {
            r1 = this;
            r0 = 1
            r1.mCalled = r0
            return
    }

    @java.lang.Deprecated
    public void onDestroyOptionsMenu() {
            r0 = this;
            return
    }

    public void onDestroyView() {
            r1 = this;
            r0 = 1
            r1.mCalled = r0
            return
    }

    public void onDetach() {
            r1 = this;
            r0 = 1
            r1.mCalled = r0
            return
    }

    public android.view.LayoutInflater onGetLayoutInflater(android.os.Bundle r2) {
            r1 = this;
            android.view.LayoutInflater r0 = r1.getLayoutInflater(r2)
            return r0
    }

    public void onHiddenChanged(boolean r1) {
            r0 = this;
            return
    }

    @java.lang.Deprecated
    public void onInflate(android.app.Activity r2, android.util.AttributeSet r3, android.os.Bundle r4) {
            r1 = this;
            r0 = 1
            r1.mCalled = r0
            return
    }

    public void onInflate(android.content.Context r3, android.util.AttributeSet r4, android.os.Bundle r5) {
            r2 = this;
            r0 = 1
            r2.mCalled = r0
            androidx.fragment.app.FragmentHostCallback<?> r0 = r2.mHost
            if (r0 != 0) goto L9
            r0 = 0
            goto Lf
        L9:
            androidx.fragment.app.FragmentHostCallback<?> r0 = r2.mHost
            android.app.Activity r0 = r0.getActivity()
        Lf:
            if (r0 == 0) goto L17
            r1 = 0
            r2.mCalled = r1
            r2.onInflate(r0, r4, r5)
        L17:
            return
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
            r1 = this;
            r0 = 1
            r1.mCalled = r0
            return
    }

    public void onMultiWindowModeChanged(boolean r1) {
            r0 = this;
            return
    }

    @java.lang.Deprecated
    public boolean onOptionsItemSelected(android.view.MenuItem r2) {
            r1 = this;
            r0 = 0
            return r0
    }

    @java.lang.Deprecated
    public void onOptionsMenuClosed(android.view.Menu r1) {
            r0 = this;
            return
    }

    public void onPause() {
            r1 = this;
            r0 = 1
            r1.mCalled = r0
            return
    }

    public void onPictureInPictureModeChanged(boolean r1) {
            r0 = this;
            return
    }

    @java.lang.Deprecated
    public void onPrepareOptionsMenu(android.view.Menu r1) {
            r0 = this;
            return
    }

    public void onPrimaryNavigationFragmentChanged(boolean r1) {
            r0 = this;
            return
    }

    @java.lang.Deprecated
    public void onRequestPermissionsResult(int r1, java.lang.String[] r2, int[] r3) {
            r0 = this;
            return
    }

    public void onResume() {
            r1 = this;
            r0 = 1
            r1.mCalled = r0
            return
    }

    public void onSaveInstanceState(android.os.Bundle r1) {
            r0 = this;
            return
    }

    public void onStart() {
            r1 = this;
            r0 = 1
            r1.mCalled = r0
            return
    }

    public void onStop() {
            r1 = this;
            r0 = 1
            r1.mCalled = r0
            return
    }

    public void onViewCreated(android.view.View r1, android.os.Bundle r2) {
            r0 = this;
            return
    }

    public void onViewStateRestored(android.os.Bundle r2) {
            r1 = this;
            r0 = 1
            r1.mCalled = r0
            return
    }

    void performActivityCreated(android.os.Bundle r4) {
            r3 = this;
            androidx.fragment.app.FragmentManager r0 = r3.mChildFragmentManager
            r0.noteStateNotSaved()
            r0 = 3
            r3.mState = r0
            r0 = 0
            r3.mCalled = r0
            r3.onActivityCreated(r4)
            boolean r0 = r3.mCalled
            if (r0 == 0) goto L1b
            r3.restoreViewState()
            androidx.fragment.app.FragmentManager r0 = r3.mChildFragmentManager
            r0.dispatchActivityCreated()
            return
        L1b:
            androidx.fragment.app.SuperNotCalledException r0 = new androidx.fragment.app.SuperNotCalledException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Fragment "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r2 = " did not call through to super.onActivityCreated()"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    void performAttach() {
            r3 = this;
            java.util.ArrayList<androidx.fragment.app.Fragment$OnPreAttachedListener> r0 = r3.mOnPreAttachedListeners
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.Fragment$OnPreAttachedListener r1 = (androidx.fragment.app.Fragment.OnPreAttachedListener) r1
            r1.onPreAttached()
            goto L6
        L16:
            java.util.ArrayList<androidx.fragment.app.Fragment$OnPreAttachedListener> r0 = r3.mOnPreAttachedListeners
            r0.clear()
            androidx.fragment.app.FragmentManager r0 = r3.mChildFragmentManager
            androidx.fragment.app.FragmentHostCallback<?> r1 = r3.mHost
            androidx.fragment.app.FragmentContainer r2 = r3.createFragmentContainer()
            r0.attachController(r1, r2, r3)
            r0 = 0
            r3.mState = r0
            r3.mCalled = r0
            androidx.fragment.app.FragmentHostCallback<?> r0 = r3.mHost
            android.content.Context r0 = r0.getContext()
            r3.onAttach(r0)
            boolean r0 = r3.mCalled
            if (r0 == 0) goto L43
            androidx.fragment.app.FragmentManager r0 = r3.mFragmentManager
            r0.dispatchOnAttachFragment(r3)
            androidx.fragment.app.FragmentManager r0 = r3.mChildFragmentManager
            r0.dispatchAttach()
            return
        L43:
            androidx.fragment.app.SuperNotCalledException r0 = new androidx.fragment.app.SuperNotCalledException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Fragment "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r2 = " did not call through to super.onAttach()"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    void performConfigurationChanged(android.content.res.Configuration r1) {
            r0 = this;
            r0.onConfigurationChanged(r1)
            return
    }

    boolean performContextItemSelected(android.view.MenuItem r2) {
            r1 = this;
            boolean r0 = r1.mHidden
            if (r0 != 0) goto L13
            boolean r0 = r1.onContextItemSelected(r2)
            if (r0 == 0) goto Lc
            r0 = 1
            return r0
        Lc:
            androidx.fragment.app.FragmentManager r0 = r1.mChildFragmentManager
            boolean r0 = r0.dispatchContextItemSelected(r2)
            return r0
        L13:
            r0 = 0
            return r0
    }

    void performCreate(android.os.Bundle r4) {
            r3 = this;
            androidx.fragment.app.FragmentManager r0 = r3.mChildFragmentManager
            r0.noteStateNotSaved()
            r0 = 1
            r3.mState = r0
            r1 = 0
            r3.mCalled = r1
            androidx.lifecycle.LifecycleRegistry r1 = r3.mLifecycleRegistry
            androidx.fragment.app.Fragment$6 r2 = new androidx.fragment.app.Fragment$6
            r2.<init>(r3)
            r1.addObserver(r2)
            r3.onCreate(r4)
            r3.mIsCreated = r0
            boolean r0 = r3.mCalled
            if (r0 == 0) goto L26
            androidx.lifecycle.LifecycleRegistry r0 = r3.mLifecycleRegistry
            androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_CREATE
            r0.handleLifecycleEvent(r1)
            return
        L26:
            androidx.fragment.app.SuperNotCalledException r0 = new androidx.fragment.app.SuperNotCalledException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Fragment "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r2 = " did not call through to super.onCreate()"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    boolean performCreateOptionsMenu(android.view.Menu r3, android.view.MenuInflater r4) {
            r2 = this;
            r0 = 0
            boolean r1 = r2.mHidden
            if (r1 != 0) goto L18
            boolean r1 = r2.mHasMenu
            if (r1 == 0) goto L11
            boolean r1 = r2.mMenuVisible
            if (r1 == 0) goto L11
            r0 = 1
            r2.onCreateOptionsMenu(r3, r4)
        L11:
            androidx.fragment.app.FragmentManager r1 = r2.mChildFragmentManager
            boolean r1 = r1.dispatchCreateOptionsMenu(r3, r4)
            r0 = r0 | r1
        L18:
            return r0
    }

    void performCreateView(android.view.LayoutInflater r4, android.view.ViewGroup r5, android.os.Bundle r6) {
            r3 = this;
            androidx.fragment.app.FragmentManager r0 = r3.mChildFragmentManager
            r0.noteStateNotSaved()
            r0 = 1
            r3.mPerformedCreateView = r0
            androidx.fragment.app.FragmentViewLifecycleOwner r0 = new androidx.fragment.app.FragmentViewLifecycleOwner
            androidx.lifecycle.ViewModelStore r1 = r3.getViewModelStore()
            androidx.fragment.app.Fragment$$ExternalSyntheticLambda0 r2 = new androidx.fragment.app.Fragment$$ExternalSyntheticLambda0
            r2.<init>(r3)
            r0.<init>(r3, r1, r2)
            r3.mViewLifecycleOwner = r0
            android.view.View r0 = r3.onCreateView(r4, r5, r6)
            r3.mView = r0
            android.view.View r0 = r3.mView
            if (r0 == 0) goto L6f
            androidx.fragment.app.FragmentViewLifecycleOwner r0 = r3.mViewLifecycleOwner
            r0.initialize()
            r0 = 3
            boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r0)
            if (r0 == 0) goto L52
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Setting ViewLifecycleOwner on View "
            java.lang.StringBuilder r0 = r0.append(r1)
            android.view.View r1 = r3.mView
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " for Fragment "
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.d(r1, r0)
        L52:
            android.view.View r0 = r3.mView
            androidx.fragment.app.FragmentViewLifecycleOwner r1 = r3.mViewLifecycleOwner
            androidx.lifecycle.ViewTreeLifecycleOwner.set(r0, r1)
            android.view.View r0 = r3.mView
            androidx.fragment.app.FragmentViewLifecycleOwner r1 = r3.mViewLifecycleOwner
            androidx.lifecycle.ViewTreeViewModelStoreOwner.set(r0, r1)
            android.view.View r0 = r3.mView
            androidx.fragment.app.FragmentViewLifecycleOwner r1 = r3.mViewLifecycleOwner
            androidx.savedstate.ViewTreeSavedStateRegistryOwner.set(r0, r1)
            androidx.lifecycle.MutableLiveData<androidx.lifecycle.LifecycleOwner> r0 = r3.mViewLifecycleOwnerLiveData
            androidx.fragment.app.FragmentViewLifecycleOwner r1 = r3.mViewLifecycleOwner
            r0.setValue(r1)
            goto L7a
        L6f:
            androidx.fragment.app.FragmentViewLifecycleOwner r0 = r3.mViewLifecycleOwner
            boolean r0 = r0.isInitialized()
            if (r0 != 0) goto L7b
            r0 = 0
            r3.mViewLifecycleOwner = r0
        L7a:
            return
        L7b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Called getViewLifecycleOwner() but onCreateView() returned null"
            r0.<init>(r1)
            throw r0
    }

    void performDestroy() {
            r3 = this;
            androidx.fragment.app.FragmentManager r0 = r3.mChildFragmentManager
            r0.dispatchDestroy()
            androidx.lifecycle.LifecycleRegistry r0 = r3.mLifecycleRegistry
            androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_DESTROY
            r0.handleLifecycleEvent(r1)
            r0 = 0
            r3.mState = r0
            r3.mCalled = r0
            r3.mIsCreated = r0
            r3.onDestroy()
            boolean r0 = r3.mCalled
            if (r0 == 0) goto L1b
            return
        L1b:
            androidx.fragment.app.SuperNotCalledException r0 = new androidx.fragment.app.SuperNotCalledException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Fragment "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r2 = " did not call through to super.onDestroy()"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    void performDestroyView() {
            r3 = this;
            androidx.fragment.app.FragmentManager r0 = r3.mChildFragmentManager
            r0.dispatchDestroyView()
            android.view.View r0 = r3.mView
            if (r0 == 0) goto L22
            androidx.fragment.app.FragmentViewLifecycleOwner r0 = r3.mViewLifecycleOwner
            androidx.lifecycle.Lifecycle r0 = r0.getLifecycle()
            androidx.lifecycle.Lifecycle$State r0 = r0.getCurrentState()
            androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.CREATED
            boolean r0 = r0.isAtLeast(r1)
            if (r0 == 0) goto L22
            androidx.fragment.app.FragmentViewLifecycleOwner r0 = r3.mViewLifecycleOwner
            androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_DESTROY
            r0.handleLifecycleEvent(r1)
        L22:
            r0 = 1
            r3.mState = r0
            r0 = 0
            r3.mCalled = r0
            r3.onDestroyView()
            boolean r1 = r3.mCalled
            if (r1 == 0) goto L39
            androidx.loader.app.LoaderManager r1 = androidx.loader.app.LoaderManager.getInstance(r3)
            r1.markForRedelivery()
            r3.mPerformedCreateView = r0
            return
        L39:
            androidx.fragment.app.SuperNotCalledException r0 = new androidx.fragment.app.SuperNotCalledException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Fragment "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r2 = " did not call through to super.onDestroyView()"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    void performDetach() {
            r3 = this;
            r0 = -1
            r3.mState = r0
            r0 = 0
            r3.mCalled = r0
            r3.onDetach()
            r0 = 0
            r3.mLayoutInflater = r0
            boolean r0 = r3.mCalled
            if (r0 == 0) goto L25
            androidx.fragment.app.FragmentManager r0 = r3.mChildFragmentManager
            boolean r0 = r0.isDestroyed()
            if (r0 != 0) goto L24
            androidx.fragment.app.FragmentManager r0 = r3.mChildFragmentManager
            r0.dispatchDestroy()
            androidx.fragment.app.FragmentManagerImpl r0 = new androidx.fragment.app.FragmentManagerImpl
            r0.<init>()
            r3.mChildFragmentManager = r0
        L24:
            return
        L25:
            androidx.fragment.app.SuperNotCalledException r0 = new androidx.fragment.app.SuperNotCalledException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Fragment "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r2 = " did not call through to super.onDetach()"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    android.view.LayoutInflater performGetLayoutInflater(android.os.Bundle r2) {
            r1 = this;
            android.view.LayoutInflater r0 = r1.onGetLayoutInflater(r2)
            r1.mLayoutInflater = r0
            android.view.LayoutInflater r0 = r1.mLayoutInflater
            return r0
    }

    void performLowMemory() {
            r0 = this;
            r0.onLowMemory()
            return
    }

    void performMultiWindowModeChanged(boolean r1) {
            r0 = this;
            r0.onMultiWindowModeChanged(r1)
            return
    }

    boolean performOptionsItemSelected(android.view.MenuItem r2) {
            r1 = this;
            boolean r0 = r1.mHidden
            if (r0 != 0) goto L1b
            boolean r0 = r1.mHasMenu
            if (r0 == 0) goto L14
            boolean r0 = r1.mMenuVisible
            if (r0 == 0) goto L14
            boolean r0 = r1.onOptionsItemSelected(r2)
            if (r0 == 0) goto L14
            r0 = 1
            return r0
        L14:
            androidx.fragment.app.FragmentManager r0 = r1.mChildFragmentManager
            boolean r0 = r0.dispatchOptionsItemSelected(r2)
            return r0
        L1b:
            r0 = 0
            return r0
    }

    void performOptionsMenuClosed(android.view.Menu r2) {
            r1 = this;
            boolean r0 = r1.mHidden
            if (r0 != 0) goto L14
            boolean r0 = r1.mHasMenu
            if (r0 == 0) goto Lf
            boolean r0 = r1.mMenuVisible
            if (r0 == 0) goto Lf
            r1.onOptionsMenuClosed(r2)
        Lf:
            androidx.fragment.app.FragmentManager r0 = r1.mChildFragmentManager
            r0.dispatchOptionsMenuClosed(r2)
        L14:
            return
    }

    void performPause() {
            r3 = this;
            androidx.fragment.app.FragmentManager r0 = r3.mChildFragmentManager
            r0.dispatchPause()
            android.view.View r0 = r3.mView
            if (r0 == 0) goto L10
            androidx.fragment.app.FragmentViewLifecycleOwner r0 = r3.mViewLifecycleOwner
            androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_PAUSE
            r0.handleLifecycleEvent(r1)
        L10:
            androidx.lifecycle.LifecycleRegistry r0 = r3.mLifecycleRegistry
            androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_PAUSE
            r0.handleLifecycleEvent(r1)
            r0 = 6
            r3.mState = r0
            r0 = 0
            r3.mCalled = r0
            r3.onPause()
            boolean r0 = r3.mCalled
            if (r0 == 0) goto L25
            return
        L25:
            androidx.fragment.app.SuperNotCalledException r0 = new androidx.fragment.app.SuperNotCalledException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Fragment "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r2 = " did not call through to super.onPause()"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    void performPictureInPictureModeChanged(boolean r1) {
            r0 = this;
            r0.onPictureInPictureModeChanged(r1)
            return
    }

    boolean performPrepareOptionsMenu(android.view.Menu r3) {
            r2 = this;
            r0 = 0
            boolean r1 = r2.mHidden
            if (r1 != 0) goto L18
            boolean r1 = r2.mHasMenu
            if (r1 == 0) goto L11
            boolean r1 = r2.mMenuVisible
            if (r1 == 0) goto L11
            r0 = 1
            r2.onPrepareOptionsMenu(r3)
        L11:
            androidx.fragment.app.FragmentManager r1 = r2.mChildFragmentManager
            boolean r1 = r1.dispatchPrepareOptionsMenu(r3)
            r0 = r0 | r1
        L18:
            return r0
    }

    void performPrimaryNavigationFragmentChanged() {
            r2 = this;
            androidx.fragment.app.FragmentManager r0 = r2.mFragmentManager
            boolean r0 = r0.isPrimaryNavigation(r2)
            java.lang.Boolean r1 = r2.mIsPrimaryNavigationFragment
            if (r1 == 0) goto L12
            java.lang.Boolean r1 = r2.mIsPrimaryNavigationFragment
            boolean r1 = r1.booleanValue()
            if (r1 == r0) goto L20
        L12:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            r2.mIsPrimaryNavigationFragment = r1
            r2.onPrimaryNavigationFragmentChanged(r0)
            androidx.fragment.app.FragmentManager r1 = r2.mChildFragmentManager
            r1.dispatchPrimaryNavigationFragmentChanged()
        L20:
            return
    }

    void performResume() {
            r3 = this;
            androidx.fragment.app.FragmentManager r0 = r3.mChildFragmentManager
            r0.noteStateNotSaved()
            androidx.fragment.app.FragmentManager r0 = r3.mChildFragmentManager
            r1 = 1
            r0.execPendingActions(r1)
            r0 = 7
            r3.mState = r0
            r0 = 0
            r3.mCalled = r0
            r3.onResume()
            boolean r0 = r3.mCalled
            if (r0 == 0) goto L30
            androidx.lifecycle.LifecycleRegistry r0 = r3.mLifecycleRegistry
            androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_RESUME
            r0.handleLifecycleEvent(r1)
            android.view.View r0 = r3.mView
            if (r0 == 0) goto L2a
            androidx.fragment.app.FragmentViewLifecycleOwner r0 = r3.mViewLifecycleOwner
            androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_RESUME
            r0.handleLifecycleEvent(r1)
        L2a:
            androidx.fragment.app.FragmentManager r0 = r3.mChildFragmentManager
            r0.dispatchResume()
            return
        L30:
            androidx.fragment.app.SuperNotCalledException r0 = new androidx.fragment.app.SuperNotCalledException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Fragment "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r2 = " did not call through to super.onResume()"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    void performSaveInstanceState(android.os.Bundle r1) {
            r0 = this;
            r0.onSaveInstanceState(r1)
            return
    }

    void performStart() {
            r3 = this;
            androidx.fragment.app.FragmentManager r0 = r3.mChildFragmentManager
            r0.noteStateNotSaved()
            androidx.fragment.app.FragmentManager r0 = r3.mChildFragmentManager
            r1 = 1
            r0.execPendingActions(r1)
            r0 = 5
            r3.mState = r0
            r0 = 0
            r3.mCalled = r0
            r3.onStart()
            boolean r0 = r3.mCalled
            if (r0 == 0) goto L30
            androidx.lifecycle.LifecycleRegistry r0 = r3.mLifecycleRegistry
            androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_START
            r0.handleLifecycleEvent(r1)
            android.view.View r0 = r3.mView
            if (r0 == 0) goto L2a
            androidx.fragment.app.FragmentViewLifecycleOwner r0 = r3.mViewLifecycleOwner
            androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_START
            r0.handleLifecycleEvent(r1)
        L2a:
            androidx.fragment.app.FragmentManager r0 = r3.mChildFragmentManager
            r0.dispatchStart()
            return
        L30:
            androidx.fragment.app.SuperNotCalledException r0 = new androidx.fragment.app.SuperNotCalledException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Fragment "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r2 = " did not call through to super.onStart()"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    void performStop() {
            r3 = this;
            androidx.fragment.app.FragmentManager r0 = r3.mChildFragmentManager
            r0.dispatchStop()
            android.view.View r0 = r3.mView
            if (r0 == 0) goto L10
            androidx.fragment.app.FragmentViewLifecycleOwner r0 = r3.mViewLifecycleOwner
            androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_STOP
            r0.handleLifecycleEvent(r1)
        L10:
            androidx.lifecycle.LifecycleRegistry r0 = r3.mLifecycleRegistry
            androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_STOP
            r0.handleLifecycleEvent(r1)
            r0 = 4
            r3.mState = r0
            r0 = 0
            r3.mCalled = r0
            r3.onStop()
            boolean r0 = r3.mCalled
            if (r0 == 0) goto L25
            return
        L25:
            androidx.fragment.app.SuperNotCalledException r0 = new androidx.fragment.app.SuperNotCalledException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Fragment "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r2 = " did not call through to super.onStop()"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    void performViewCreated() {
            r3 = this;
            r0 = 0
            android.os.Bundle r1 = r3.mSavedFragmentState
            if (r1 == 0) goto Ld
            android.os.Bundle r1 = r3.mSavedFragmentState
            java.lang.String r2 = "savedInstanceState"
            android.os.Bundle r0 = r1.getBundle(r2)
        Ld:
            android.view.View r1 = r3.mView
            r3.onViewCreated(r1, r0)
            androidx.fragment.app.FragmentManager r1 = r3.mChildFragmentManager
            r1.dispatchViewCreated()
            return
    }

    public void postponeEnterTransition() {
            r2 = this;
            androidx.fragment.app.Fragment$AnimationInfo r0 = r2.ensureAnimationInfo()
            r1 = 1
            r0.mEnterTransitionPostponed = r1
            return
    }

    public final void postponeEnterTransition(long r5, java.util.concurrent.TimeUnit r7) {
            r4 = this;
            androidx.fragment.app.Fragment$AnimationInfo r0 = r4.ensureAnimationInfo()
            r1 = 1
            r0.mEnterTransitionPostponed = r1
            android.os.Handler r0 = r4.mPostponedHandler
            if (r0 == 0) goto L12
            android.os.Handler r0 = r4.mPostponedHandler
            java.lang.Runnable r1 = r4.mPostponedDurationRunnable
            r0.removeCallbacks(r1)
        L12:
            androidx.fragment.app.FragmentManager r0 = r4.mFragmentManager
            if (r0 == 0) goto L23
            androidx.fragment.app.FragmentManager r0 = r4.mFragmentManager
            androidx.fragment.app.FragmentHostCallback r0 = r0.getHost()
            android.os.Handler r0 = r0.getHandler()
            r4.mPostponedHandler = r0
            goto L2e
        L23:
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            r4.mPostponedHandler = r0
        L2e:
            android.os.Handler r0 = r4.mPostponedHandler
            java.lang.Runnable r1 = r4.mPostponedDurationRunnable
            r0.removeCallbacks(r1)
            android.os.Handler r0 = r4.mPostponedHandler
            java.lang.Runnable r1 = r4.mPostponedDurationRunnable
            long r2 = r7.toMillis(r5)
            r0.postDelayed(r1, r2)
            return
    }

    @Override // androidx.activity.result.ActivityResultCaller
    public final <I, O> androidx.activity.result.ActivityResultLauncher<I> registerForActivityResult(androidx.activity.result.contract.ActivityResultContract<I, O> r2, androidx.activity.result.ActivityResultCallback<O> r3) {
            r1 = this;
            androidx.fragment.app.Fragment$7 r0 = new androidx.fragment.app.Fragment$7
            r0.<init>(r1)
            androidx.activity.result.ActivityResultLauncher r0 = r1.prepareCallInternal(r2, r0, r3)
            return r0
    }

    @Override // androidx.activity.result.ActivityResultCaller
    public final <I, O> androidx.activity.result.ActivityResultLauncher<I> registerForActivityResult(androidx.activity.result.contract.ActivityResultContract<I, O> r2, androidx.activity.result.ActivityResultRegistry r3, androidx.activity.result.ActivityResultCallback<O> r4) {
            r1 = this;
            androidx.fragment.app.Fragment$8 r0 = new androidx.fragment.app.Fragment$8
            r0.<init>(r1, r3)
            androidx.activity.result.ActivityResultLauncher r0 = r1.prepareCallInternal(r2, r0, r4)
            return r0
    }

    public void registerForContextMenu(android.view.View r1) {
            r0 = this;
            r1.setOnCreateContextMenuListener(r0)
            return
    }

    @java.lang.Deprecated
    public final void requestPermissions(java.lang.String[] r4, int r5) {
            r3 = this;
            androidx.fragment.app.FragmentHostCallback<?> r0 = r3.mHost
            if (r0 == 0) goto Lc
            androidx.fragment.app.FragmentManager r0 = r3.getParentFragmentManager()
            r0.launchRequestPermissions(r3, r4, r5)
            return
        Lc:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Fragment "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r2 = " not attached to Activity"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public final androidx.fragment.app.FragmentActivity requireActivity() {
            r4 = this;
            androidx.fragment.app.FragmentActivity r0 = r4.getActivity()
            if (r0 == 0) goto L7
            return r0
        L7:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Fragment "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r4)
            java.lang.String r3 = " not attached to an activity."
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    public final android.os.Bundle requireArguments() {
            r4 = this;
            android.os.Bundle r0 = r4.getArguments()
            if (r0 == 0) goto L7
            return r0
        L7:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Fragment "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r4)
            java.lang.String r3 = " does not have any arguments."
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    public final android.content.Context requireContext() {
            r4 = this;
            android.content.Context r0 = r4.getContext()
            if (r0 == 0) goto L7
            return r0
        L7:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Fragment "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r4)
            java.lang.String r3 = " not attached to a context."
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    @java.lang.Deprecated
    public final androidx.fragment.app.FragmentManager requireFragmentManager() {
            r1 = this;
            androidx.fragment.app.FragmentManager r0 = r1.getParentFragmentManager()
            return r0
    }

    public final java.lang.Object requireHost() {
            r4 = this;
            java.lang.Object r0 = r4.getHost()
            if (r0 == 0) goto L7
            return r0
        L7:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Fragment "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r4)
            java.lang.String r3 = " not attached to a host."
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    public final androidx.fragment.app.Fragment requireParentFragment() {
            r5 = this;
            androidx.fragment.app.Fragment r0 = r5.getParentFragment()
            if (r0 != 0) goto L50
            android.content.Context r1 = r5.getContext()
            java.lang.String r2 = "Fragment "
            if (r1 != 0) goto L2b
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.StringBuilder r2 = r4.append(r2)
            java.lang.StringBuilder r2 = r2.append(r5)
            java.lang.String r4 = " is not attached to any Fragment or host"
            java.lang.StringBuilder r2 = r2.append(r4)
            java.lang.String r2 = r2.toString()
            r3.<init>(r2)
            throw r3
        L2b:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.StringBuilder r2 = r4.append(r2)
            java.lang.StringBuilder r2 = r2.append(r5)
            java.lang.String r4 = " is not a child Fragment, it is directly attached to "
            java.lang.StringBuilder r2 = r2.append(r4)
            android.content.Context r4 = r5.getContext()
            java.lang.StringBuilder r2 = r2.append(r4)
            java.lang.String r2 = r2.toString()
            r3.<init>(r2)
            throw r3
        L50:
            return r0
    }

    public final android.view.View requireView() {
            r4 = this;
            android.view.View r0 = r4.getView()
            if (r0 == 0) goto L7
            return r0
        L7:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Fragment "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r4)
            java.lang.String r3 = " did not return a View from onCreateView() or this was called before onCreateView()."
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    void restoreChildFragmentState() {
            r2 = this;
            android.os.Bundle r0 = r2.mSavedFragmentState
            if (r0 == 0) goto L18
            android.os.Bundle r0 = r2.mSavedFragmentState
            java.lang.String r1 = "childFragmentManager"
            android.os.Bundle r0 = r0.getBundle(r1)
            if (r0 == 0) goto L18
            androidx.fragment.app.FragmentManager r1 = r2.mChildFragmentManager
            r1.restoreSaveStateInternal(r0)
            androidx.fragment.app.FragmentManager r1 = r2.mChildFragmentManager
            r1.dispatchCreate()
        L18:
            return
    }

    final void restoreViewState(android.os.Bundle r4) {
            r3 = this;
            android.util.SparseArray<android.os.Parcelable> r0 = r3.mSavedViewState
            if (r0 == 0) goto Le
            android.view.View r0 = r3.mView
            android.util.SparseArray<android.os.Parcelable> r1 = r3.mSavedViewState
            r0.restoreHierarchyState(r1)
            r0 = 0
            r3.mSavedViewState = r0
        Le:
            r0 = 0
            r3.mCalled = r0
            r3.onViewStateRestored(r4)
            boolean r0 = r3.mCalled
            if (r0 == 0) goto L24
            android.view.View r0 = r3.mView
            if (r0 == 0) goto L23
            androidx.fragment.app.FragmentViewLifecycleOwner r0 = r3.mViewLifecycleOwner
            androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_CREATE
            r0.handleLifecycleEvent(r1)
        L23:
            return
        L24:
            androidx.fragment.app.SuperNotCalledException r0 = new androidx.fragment.app.SuperNotCalledException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Fragment "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r2 = " did not call through to super.onViewStateRestored()"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public void setAllowEnterTransitionOverlap(boolean r3) {
            r2 = this;
            androidx.fragment.app.Fragment$AnimationInfo r0 = r2.ensureAnimationInfo()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r3)
            r0.mAllowEnterTransitionOverlap = r1
            return
    }

    public void setAllowReturnTransitionOverlap(boolean r3) {
            r2 = this;
            androidx.fragment.app.Fragment$AnimationInfo r0 = r2.ensureAnimationInfo()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r3)
            r0.mAllowReturnTransitionOverlap = r1
            return
    }

    void setAnimations(int r2, int r3, int r4, int r5) {
            r1 = this;
            androidx.fragment.app.Fragment$AnimationInfo r0 = r1.mAnimationInfo
            if (r0 != 0) goto Ld
            if (r2 != 0) goto Ld
            if (r3 != 0) goto Ld
            if (r4 != 0) goto Ld
            if (r5 != 0) goto Ld
            return
        Ld:
            androidx.fragment.app.Fragment$AnimationInfo r0 = r1.ensureAnimationInfo()
            r0.mEnterAnim = r2
            androidx.fragment.app.Fragment$AnimationInfo r0 = r1.ensureAnimationInfo()
            r0.mExitAnim = r3
            androidx.fragment.app.Fragment$AnimationInfo r0 = r1.ensureAnimationInfo()
            r0.mPopEnterAnim = r4
            androidx.fragment.app.Fragment$AnimationInfo r0 = r1.ensureAnimationInfo()
            r0.mPopExitAnim = r5
            return
    }

    public void setArguments(android.os.Bundle r3) {
            r2 = this;
            androidx.fragment.app.FragmentManager r0 = r2.mFragmentManager
            if (r0 == 0) goto L13
            boolean r0 = r2.isStateSaved()
            if (r0 != 0) goto Lb
            goto L13
        Lb:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Fragment already added and state has been saved"
            r0.<init>(r1)
            throw r0
        L13:
            r2.mArguments = r3
            return
    }

    public void setEnterSharedElementCallback(androidx.core.app.SharedElementCallback r2) {
            r1 = this;
            androidx.fragment.app.Fragment$AnimationInfo r0 = r1.ensureAnimationInfo()
            r0.mEnterTransitionCallback = r2
            return
    }

    public void setEnterTransition(java.lang.Object r2) {
            r1 = this;
            androidx.fragment.app.Fragment$AnimationInfo r0 = r1.ensureAnimationInfo()
            r0.mEnterTransition = r2
            return
    }

    public void setExitSharedElementCallback(androidx.core.app.SharedElementCallback r2) {
            r1 = this;
            androidx.fragment.app.Fragment$AnimationInfo r0 = r1.ensureAnimationInfo()
            r0.mExitTransitionCallback = r2
            return
    }

    public void setExitTransition(java.lang.Object r2) {
            r1 = this;
            androidx.fragment.app.Fragment$AnimationInfo r0 = r1.ensureAnimationInfo()
            r0.mExitTransition = r2
            return
    }

    void setFocusedView(android.view.View r2) {
            r1 = this;
            androidx.fragment.app.Fragment$AnimationInfo r0 = r1.ensureAnimationInfo()
            r0.mFocusedView = r2
            return
    }

    @java.lang.Deprecated
    public void setHasOptionsMenu(boolean r2) {
            r1 = this;
            boolean r0 = r1.mHasMenu
            if (r0 == r2) goto L17
            r1.mHasMenu = r2
            boolean r0 = r1.isAdded()
            if (r0 == 0) goto L17
            boolean r0 = r1.isHidden()
            if (r0 != 0) goto L17
            androidx.fragment.app.FragmentHostCallback<?> r0 = r1.mHost
            r0.onSupportInvalidateOptionsMenu()
        L17:
            return
    }

    public void setInitialSavedState(androidx.fragment.app.Fragment.SavedState r3) {
            r2 = this;
            androidx.fragment.app.FragmentManager r0 = r2.mFragmentManager
            if (r0 != 0) goto L11
            if (r3 == 0) goto Ld
            android.os.Bundle r0 = r3.mState
            if (r0 == 0) goto Ld
            android.os.Bundle r0 = r3.mState
            goto Le
        Ld:
            r0 = 0
        Le:
            r2.mSavedFragmentState = r0
            return
        L11:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Fragment already added"
            r0.<init>(r1)
            throw r0
    }

    public void setMenuVisibility(boolean r2) {
            r1 = this;
            boolean r0 = r1.mMenuVisible
            if (r0 == r2) goto L1b
            r1.mMenuVisible = r2
            boolean r0 = r1.mHasMenu
            if (r0 == 0) goto L1b
            boolean r0 = r1.isAdded()
            if (r0 == 0) goto L1b
            boolean r0 = r1.isHidden()
            if (r0 != 0) goto L1b
            androidx.fragment.app.FragmentHostCallback<?> r0 = r1.mHost
            r0.onSupportInvalidateOptionsMenu()
        L1b:
            return
    }

    void setNextTransition(int r2) {
            r1 = this;
            androidx.fragment.app.Fragment$AnimationInfo r0 = r1.mAnimationInfo
            if (r0 != 0) goto L7
            if (r2 != 0) goto L7
            return
        L7:
            r1.ensureAnimationInfo()
            androidx.fragment.app.Fragment$AnimationInfo r0 = r1.mAnimationInfo
            r0.mNextTransition = r2
            return
    }

    void setPopDirection(boolean r2) {
            r1 = this;
            androidx.fragment.app.Fragment$AnimationInfo r0 = r1.mAnimationInfo
            if (r0 != 0) goto L5
            return
        L5:
            androidx.fragment.app.Fragment$AnimationInfo r0 = r1.ensureAnimationInfo()
            r0.mIsPop = r2
            return
    }

    void setPostOnViewCreatedAlpha(float r2) {
            r1 = this;
            androidx.fragment.app.Fragment$AnimationInfo r0 = r1.ensureAnimationInfo()
            r0.mPostOnViewCreatedAlpha = r2
            return
    }

    public void setReenterTransition(java.lang.Object r2) {
            r1 = this;
            androidx.fragment.app.Fragment$AnimationInfo r0 = r1.ensureAnimationInfo()
            r0.mReenterTransition = r2
            return
    }

    @java.lang.Deprecated
    public void setRetainInstance(boolean r2) {
            r1 = this;
            androidx.fragment.app.strictmode.FragmentStrictMode.onSetRetainInstanceUsage(r1)
            r1.mRetainInstance = r2
            androidx.fragment.app.FragmentManager r0 = r1.mFragmentManager
            if (r0 == 0) goto L17
            if (r2 == 0) goto L11
            androidx.fragment.app.FragmentManager r0 = r1.mFragmentManager
            r0.addRetainedFragment(r1)
            goto L1a
        L11:
            androidx.fragment.app.FragmentManager r0 = r1.mFragmentManager
            r0.removeRetainedFragment(r1)
            goto L1a
        L17:
            r0 = 1
            r1.mRetainInstanceChangedWhileDetached = r0
        L1a:
            return
    }

    public void setReturnTransition(java.lang.Object r2) {
            r1 = this;
            androidx.fragment.app.Fragment$AnimationInfo r0 = r1.ensureAnimationInfo()
            r0.mReturnTransition = r2
            return
    }

    public void setSharedElementEnterTransition(java.lang.Object r2) {
            r1 = this;
            androidx.fragment.app.Fragment$AnimationInfo r0 = r1.ensureAnimationInfo()
            r0.mSharedElementEnterTransition = r2
            return
    }

    void setSharedElementNames(java.util.ArrayList<java.lang.String> r2, java.util.ArrayList<java.lang.String> r3) {
            r1 = this;
            r1.ensureAnimationInfo()
            androidx.fragment.app.Fragment$AnimationInfo r0 = r1.mAnimationInfo
            r0.mSharedElementSourceNames = r2
            androidx.fragment.app.Fragment$AnimationInfo r0 = r1.mAnimationInfo
            r0.mSharedElementTargetNames = r3
            return
    }

    public void setSharedElementReturnTransition(java.lang.Object r2) {
            r1 = this;
            androidx.fragment.app.Fragment$AnimationInfo r0 = r1.ensureAnimationInfo()
            r0.mSharedElementReturnTransition = r2
            return
    }

    @java.lang.Deprecated
    public void setTargetFragment(androidx.fragment.app.Fragment r7, int r8) {
            r6 = this;
            if (r7 == 0) goto L5
            androidx.fragment.app.strictmode.FragmentStrictMode.onSetTargetFragmentUsage(r6, r7, r8)
        L5:
            androidx.fragment.app.FragmentManager r0 = r6.mFragmentManager
            r1 = 0
            if (r7 == 0) goto Ld
            androidx.fragment.app.FragmentManager r2 = r7.mFragmentManager
            goto Le
        Ld:
            r2 = r1
        Le:
            if (r0 == 0) goto L35
            if (r2 == 0) goto L35
            if (r0 != r2) goto L16
            goto L35
        L16:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Fragment "
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r3 = r3.append(r7)
            java.lang.String r4 = " must share the same FragmentManager to be set as a target fragment"
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            r1.<init>(r3)
            throw r1
        L35:
            r3 = r7
        L36:
            if (r3 == 0) goto L6d
            boolean r4 = r3.equals(r6)
            if (r4 != 0) goto L44
            r4 = 0
            androidx.fragment.app.Fragment r3 = r3.getTargetFragment(r4)
            goto L36
        L44:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Setting "
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.StringBuilder r4 = r4.append(r7)
            java.lang.String r5 = " as the target of "
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.StringBuilder r4 = r4.append(r6)
            java.lang.String r5 = " would create a target cycle"
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r4 = r4.toString()
            r1.<init>(r4)
            throw r1
        L6d:
            if (r7 != 0) goto L74
            r6.mTargetWho = r1
            r6.mTarget = r1
            goto L87
        L74:
            androidx.fragment.app.FragmentManager r3 = r6.mFragmentManager
            if (r3 == 0) goto L83
            androidx.fragment.app.FragmentManager r3 = r7.mFragmentManager
            if (r3 == 0) goto L83
            java.lang.String r3 = r7.mWho
            r6.mTargetWho = r3
            r6.mTarget = r1
            goto L87
        L83:
            r6.mTargetWho = r1
            r6.mTarget = r7
        L87:
            r6.mTargetRequestCode = r8
            return
    }

    @java.lang.Deprecated
    public void setUserVisibleHint(boolean r4) {
            r3 = this;
            androidx.fragment.app.strictmode.FragmentStrictMode.onSetUserVisibleHint(r3, r4)
            boolean r0 = r3.mUserVisibleHint
            r1 = 5
            if (r0 != 0) goto L27
            if (r4 == 0) goto L27
            int r0 = r3.mState
            if (r0 >= r1) goto L27
            androidx.fragment.app.FragmentManager r0 = r3.mFragmentManager
            if (r0 == 0) goto L27
            boolean r0 = r3.isAdded()
            if (r0 == 0) goto L27
            boolean r0 = r3.mIsCreated
            if (r0 == 0) goto L27
            androidx.fragment.app.FragmentManager r0 = r3.mFragmentManager
            androidx.fragment.app.FragmentManager r2 = r3.mFragmentManager
            androidx.fragment.app.FragmentStateManager r2 = r2.createOrGetFragmentStateManager(r3)
            r0.performPendingDeferredStart(r2)
        L27:
            r3.mUserVisibleHint = r4
            int r0 = r3.mState
            if (r0 >= r1) goto L31
            if (r4 != 0) goto L31
            r0 = 1
            goto L32
        L31:
            r0 = 0
        L32:
            r3.mDeferStart = r0
            android.os.Bundle r0 = r3.mSavedFragmentState
            if (r0 == 0) goto L3e
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            r3.mSavedUserVisibleHint = r0
        L3e:
            return
    }

    public boolean shouldShowRequestPermissionRationale(java.lang.String r2) {
            r1 = this;
            androidx.fragment.app.FragmentHostCallback<?> r0 = r1.mHost
            if (r0 == 0) goto Lb
            androidx.fragment.app.FragmentHostCallback<?> r0 = r1.mHost
            boolean r0 = r0.onShouldShowRequestPermissionRationale(r2)
            return r0
        Lb:
            r0 = 0
            return r0
    }

    public void startActivity(android.content.Intent r2) {
            r1 = this;
            r0 = 0
            r1.startActivity(r2, r0)
            return
    }

    public void startActivity(android.content.Intent r4, android.os.Bundle r5) {
            r3 = this;
            androidx.fragment.app.FragmentHostCallback<?> r0 = r3.mHost
            if (r0 == 0) goto Lb
            androidx.fragment.app.FragmentHostCallback<?> r0 = r3.mHost
            r1 = -1
            r0.onStartActivityFromFragment(r3, r4, r1, r5)
            return
        Lb:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Fragment "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r2 = " not attached to Activity"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    @java.lang.Deprecated
    public void startActivityForResult(android.content.Intent r2, int r3) {
            r1 = this;
            r0 = 0
            r1.startActivityForResult(r2, r3, r0)
            return
    }

    @java.lang.Deprecated
    public void startActivityForResult(android.content.Intent r4, int r5, android.os.Bundle r6) {
            r3 = this;
            androidx.fragment.app.FragmentHostCallback<?> r0 = r3.mHost
            if (r0 == 0) goto Lc
            androidx.fragment.app.FragmentManager r0 = r3.getParentFragmentManager()
            r0.launchStartActivityForResult(r3, r4, r5, r6)
            return
        Lc:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Fragment "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r2 = " not attached to Activity"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    @java.lang.Deprecated
    public void startIntentSenderForResult(android.content.IntentSender r10, int r11, android.content.Intent r12, int r13, int r14, int r15, android.os.Bundle r16) throws android.content.IntentSender.SendIntentException {
            r9 = this;
            androidx.fragment.app.FragmentHostCallback<?> r0 = r9.mHost
            java.lang.String r2 = "Fragment "
            if (r0 == 0) goto L5f
            r0 = 2
            boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r0)
            if (r0 == 0) goto L4e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.StringBuilder r0 = r0.append(r9)
            java.lang.String r2 = " received the following in startIntentSenderForResult() requestCode: "
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.StringBuilder r0 = r0.append(r11)
            java.lang.String r2 = " IntentSender: "
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.StringBuilder r0 = r0.append(r10)
            java.lang.String r4 = " fillInIntent: "
            java.lang.StringBuilder r0 = r0.append(r4)
            java.lang.StringBuilder r0 = r0.append(r12)
            java.lang.String r5 = " options: "
            java.lang.StringBuilder r0 = r0.append(r5)
            r8 = r16
            java.lang.StringBuilder r0 = r0.append(r8)
            java.lang.String r0 = r0.toString()
            java.lang.String r5 = "FragmentManager"
            android.util.Log.v(r5, r0)
            goto L50
        L4e:
            r8 = r16
        L50:
            androidx.fragment.app.FragmentManager r0 = r9.getParentFragmentManager()
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            r7 = r15
            r0.launchStartIntentSenderForResult(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        L5f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.StringBuilder r2 = r3.append(r2)
            java.lang.StringBuilder r2 = r2.append(r9)
            java.lang.String r3 = " not attached to Activity"
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
    }

    public void startPostponedEnterTransition() {
            r2 = this;
            androidx.fragment.app.Fragment$AnimationInfo r0 = r2.mAnimationInfo
            if (r0 == 0) goto L3d
            androidx.fragment.app.Fragment$AnimationInfo r0 = r2.ensureAnimationInfo()
            boolean r0 = r0.mEnterTransitionPostponed
            if (r0 != 0) goto Ld
            goto L3d
        Ld:
            androidx.fragment.app.FragmentHostCallback<?> r0 = r2.mHost
            if (r0 != 0) goto L19
            androidx.fragment.app.Fragment$AnimationInfo r0 = r2.ensureAnimationInfo()
            r1 = 0
            r0.mEnterTransitionPostponed = r1
            goto L3c
        L19:
            android.os.Looper r0 = android.os.Looper.myLooper()
            androidx.fragment.app.FragmentHostCallback<?> r1 = r2.mHost
            android.os.Handler r1 = r1.getHandler()
            android.os.Looper r1 = r1.getLooper()
            if (r0 == r1) goto L38
            androidx.fragment.app.FragmentHostCallback<?> r0 = r2.mHost
            android.os.Handler r0 = r0.getHandler()
            androidx.fragment.app.Fragment$3 r1 = new androidx.fragment.app.Fragment$3
            r1.<init>(r2)
            r0.postAtFrontOfQueue(r1)
            goto L3c
        L38:
            r0 = 1
            r2.callStartTransitionListener(r0)
        L3c:
            return
        L3d:
            return
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 128(0x80, float:1.8E-43)
            r0.<init>(r1)
            java.lang.Class r1 = r3.getClass()
            java.lang.String r2 = r1.getSimpleName()
            r0.append(r2)
            java.lang.String r2 = "{"
            r0.append(r2)
            int r2 = java.lang.System.identityHashCode(r3)
            java.lang.String r2 = java.lang.Integer.toHexString(r2)
            r0.append(r2)
            java.lang.String r2 = "}"
            r0.append(r2)
            java.lang.String r2 = " ("
            r0.append(r2)
            java.lang.String r2 = r3.mWho
            r0.append(r2)
            int r2 = r3.mFragmentId
            if (r2 == 0) goto L43
            java.lang.String r2 = " id=0x"
            r0.append(r2)
            int r2 = r3.mFragmentId
            java.lang.String r2 = java.lang.Integer.toHexString(r2)
            r0.append(r2)
        L43:
            java.lang.String r2 = r3.mTag
            if (r2 == 0) goto L51
            java.lang.String r2 = " tag="
            r0.append(r2)
            java.lang.String r2 = r3.mTag
            r0.append(r2)
        L51:
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    public void unregisterForContextMenu(android.view.View r2) {
            r1 = this;
            r0 = 0
            r2.setOnCreateContextMenuListener(r0)
            return
    }
}
