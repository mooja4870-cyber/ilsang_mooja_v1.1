package androidx.fragment.app;

/* JADX INFO: loaded from: classes.dex */
class FragmentStateManager {
    static final java.lang.String ARGUMENTS_KEY = "arguments";
    static final java.lang.String CHILD_FRAGMENT_MANAGER_KEY = "childFragmentManager";
    static final java.lang.String FRAGMENT_STATE_KEY = "state";
    static final java.lang.String REGISTRY_STATE_KEY = "registryState";
    static final java.lang.String SAVED_INSTANCE_STATE_KEY = "savedInstanceState";
    private static final java.lang.String TAG = "FragmentManager";
    static final java.lang.String VIEW_REGISTRY_STATE_KEY = "viewRegistryState";
    static final java.lang.String VIEW_STATE_KEY = "viewState";
    private final androidx.fragment.app.FragmentLifecycleCallbacksDispatcher mDispatcher;
    private final androidx.fragment.app.Fragment mFragment;
    private int mFragmentManagerState;
    private final androidx.fragment.app.FragmentStore mFragmentStore;
    private boolean mMovingToState;


    /* JADX INFO: renamed from: androidx.fragment.app.FragmentStateManager$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$androidx$lifecycle$Lifecycle$State = null;

        static {
                androidx.lifecycle.Lifecycle$State[] r0 = androidx.lifecycle.Lifecycle.State.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.fragment.app.FragmentStateManager.AnonymousClass2.$SwitchMap$androidx$lifecycle$Lifecycle$State = r0
                int[] r0 = androidx.fragment.app.FragmentStateManager.AnonymousClass2.$SwitchMap$androidx$lifecycle$Lifecycle$State     // Catch: java.lang.NoSuchFieldError -> L15
                androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.RESUMED     // Catch: java.lang.NoSuchFieldError -> L15
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L15
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L15
                goto L16
            L15:
                r0 = move-exception
            L16:
                int[] r0 = androidx.fragment.app.FragmentStateManager.AnonymousClass2.$SwitchMap$androidx$lifecycle$Lifecycle$State     // Catch: java.lang.NoSuchFieldError -> L22
                androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.STARTED     // Catch: java.lang.NoSuchFieldError -> L22
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L22
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L22
                goto L23
            L22:
                r0 = move-exception
            L23:
                int[] r0 = androidx.fragment.app.FragmentStateManager.AnonymousClass2.$SwitchMap$androidx$lifecycle$Lifecycle$State     // Catch: java.lang.NoSuchFieldError -> L2f
                androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.CREATED     // Catch: java.lang.NoSuchFieldError -> L2f
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L2f
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L2f
                goto L30
            L2f:
                r0 = move-exception
            L30:
                int[] r0 = androidx.fragment.app.FragmentStateManager.AnonymousClass2.$SwitchMap$androidx$lifecycle$Lifecycle$State     // Catch: java.lang.NoSuchFieldError -> L3c
                androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.INITIALIZED     // Catch: java.lang.NoSuchFieldError -> L3c
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3c
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3c
                goto L3d
            L3c:
                r0 = move-exception
            L3d:
                return
        }
    }

    FragmentStateManager(androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r2, androidx.fragment.app.FragmentStore r3, androidx.fragment.app.Fragment r4) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.mMovingToState = r0
            r0 = -1
            r1.mFragmentManagerState = r0
            r1.mDispatcher = r2
            r1.mFragmentStore = r3
            r1.mFragment = r4
            return
    }

    FragmentStateManager(androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r4, androidx.fragment.app.FragmentStore r5, androidx.fragment.app.Fragment r6, android.os.Bundle r7) {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.mMovingToState = r0
            r1 = -1
            r3.mFragmentManagerState = r1
            r3.mDispatcher = r4
            r3.mFragmentStore = r5
            r3.mFragment = r6
            androidx.fragment.app.Fragment r1 = r3.mFragment
            r2 = 0
            r1.mSavedViewState = r2
            androidx.fragment.app.Fragment r1 = r3.mFragment
            r1.mSavedViewRegistryState = r2
            androidx.fragment.app.Fragment r1 = r3.mFragment
            r1.mBackStackNesting = r0
            androidx.fragment.app.Fragment r1 = r3.mFragment
            r1.mInLayout = r0
            androidx.fragment.app.Fragment r1 = r3.mFragment
            r1.mAdded = r0
            androidx.fragment.app.Fragment r0 = r3.mFragment
            androidx.fragment.app.Fragment r1 = r3.mFragment
            androidx.fragment.app.Fragment r1 = r1.mTarget
            if (r1 == 0) goto L33
            androidx.fragment.app.Fragment r1 = r3.mFragment
            androidx.fragment.app.Fragment r1 = r1.mTarget
            java.lang.String r1 = r1.mWho
            goto L34
        L33:
            r1 = r2
        L34:
            r0.mTargetWho = r1
            androidx.fragment.app.Fragment r0 = r3.mFragment
            r0.mTarget = r2
            androidx.fragment.app.Fragment r0 = r3.mFragment
            r0.mSavedFragmentState = r7
            androidx.fragment.app.Fragment r0 = r3.mFragment
            java.lang.String r1 = "arguments"
            android.os.Bundle r1 = r7.getBundle(r1)
            r0.mArguments = r1
            return
    }

    FragmentStateManager(androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r5, androidx.fragment.app.FragmentStore r6, java.lang.ClassLoader r7, androidx.fragment.app.FragmentFactory r8, android.os.Bundle r9) {
            r4 = this;
            r4.<init>()
            r0 = 0
            r4.mMovingToState = r0
            r0 = -1
            r4.mFragmentManagerState = r0
            r4.mDispatcher = r5
            r4.mFragmentStore = r6
            java.lang.String r0 = "state"
            android.os.Parcelable r0 = r9.getParcelable(r0)
            androidx.fragment.app.FragmentState r0 = (androidx.fragment.app.FragmentState) r0
            androidx.fragment.app.Fragment r1 = r0.instantiate(r8, r7)
            r4.mFragment = r1
            androidx.fragment.app.Fragment r1 = r4.mFragment
            r1.mSavedFragmentState = r9
            java.lang.String r1 = "arguments"
            android.os.Bundle r1 = r9.getBundle(r1)
            if (r1 == 0) goto L2a
            r1.setClassLoader(r7)
        L2a:
            androidx.fragment.app.Fragment r2 = r4.mFragment
            r2.setArguments(r1)
            r2 = 2
            boolean r2 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r2)
            if (r2 == 0) goto L50
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Instantiated fragment "
            java.lang.StringBuilder r2 = r2.append(r3)
            androidx.fragment.app.Fragment r3 = r4.mFragment
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "FragmentManager"
            android.util.Log.v(r3, r2)
        L50:
            return
    }

    private boolean isFragmentViewChild(android.view.View r4) {
            r3 = this;
            androidx.fragment.app.Fragment r0 = r3.mFragment
            android.view.View r0 = r0.mView
            r1 = 1
            if (r4 != r0) goto L8
            return r1
        L8:
            android.view.ViewParent r0 = r4.getParent()
        Lc:
            if (r0 == 0) goto L1a
            androidx.fragment.app.Fragment r2 = r3.mFragment
            android.view.View r2 = r2.mView
            if (r0 != r2) goto L15
            return r1
        L15:
            android.view.ViewParent r0 = r0.getParent()
            goto Lc
        L1a:
            r1 = 0
            return r1
    }

    void activityCreated() {
            r4 = this;
            r0 = 3
            boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r0)
            if (r0 == 0) goto L21
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "moveto ACTIVITY_CREATED: "
            java.lang.StringBuilder r0 = r0.append(r1)
            androidx.fragment.app.Fragment r1 = r4.mFragment
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.d(r1, r0)
        L21:
            r0 = 0
            androidx.fragment.app.Fragment r1 = r4.mFragment
            android.os.Bundle r1 = r1.mSavedFragmentState
            if (r1 == 0) goto L32
            androidx.fragment.app.Fragment r1 = r4.mFragment
            android.os.Bundle r1 = r1.mSavedFragmentState
            java.lang.String r2 = "savedInstanceState"
            android.os.Bundle r0 = r1.getBundle(r2)
        L32:
            androidx.fragment.app.Fragment r1 = r4.mFragment
            r1.performActivityCreated(r0)
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r1 = r4.mDispatcher
            androidx.fragment.app.Fragment r2 = r4.mFragment
            r3 = 0
            r1.dispatchOnFragmentActivityCreated(r2, r0, r3)
            return
    }

    void addViewToContainer() {
            r5 = this;
            androidx.fragment.app.Fragment r0 = r5.mFragment
            android.view.ViewGroup r0 = r0.mContainer
            androidx.fragment.app.Fragment r0 = androidx.fragment.app.FragmentManager.findViewFragment(r0)
            androidx.fragment.app.Fragment r1 = r5.mFragment
            androidx.fragment.app.Fragment r1 = r1.getParentFragment()
            if (r0 == 0) goto L1f
            boolean r2 = r0.equals(r1)
            if (r2 != 0) goto L1f
            androidx.fragment.app.Fragment r2 = r5.mFragment
            androidx.fragment.app.Fragment r3 = r5.mFragment
            int r3 = r3.mContainerId
            androidx.fragment.app.strictmode.FragmentStrictMode.onWrongNestedHierarchy(r2, r0, r3)
        L1f:
            androidx.fragment.app.FragmentStore r2 = r5.mFragmentStore
            androidx.fragment.app.Fragment r3 = r5.mFragment
            int r2 = r2.findFragmentIndexInContainer(r3)
            androidx.fragment.app.Fragment r3 = r5.mFragment
            android.view.ViewGroup r3 = r3.mContainer
            androidx.fragment.app.Fragment r4 = r5.mFragment
            android.view.View r4 = r4.mView
            r3.addView(r4, r2)
            return
    }

    void attach() {
            r6 = this;
            r0 = 3
            boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r0)
            if (r0 == 0) goto L21
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "moveto ATTACHED: "
            java.lang.StringBuilder r0 = r0.append(r1)
            androidx.fragment.app.Fragment r1 = r6.mFragment
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.d(r1, r0)
        L21:
            androidx.fragment.app.Fragment r0 = r6.mFragment
            androidx.fragment.app.Fragment r0 = r0.mTarget
            java.lang.String r1 = " that does not belong to this FragmentManager!"
            java.lang.String r2 = " declared target fragment "
            java.lang.String r3 = "Fragment "
            if (r0 == 0) goto L74
            androidx.fragment.app.FragmentStore r0 = r6.mFragmentStore
            androidx.fragment.app.Fragment r4 = r6.mFragment
            androidx.fragment.app.Fragment r4 = r4.mTarget
            java.lang.String r4 = r4.mWho
            androidx.fragment.app.FragmentStateManager r0 = r0.getFragmentStateManager(r4)
            if (r0 == 0) goto L4b
            androidx.fragment.app.Fragment r1 = r6.mFragment
            androidx.fragment.app.Fragment r2 = r6.mFragment
            androidx.fragment.app.Fragment r2 = r2.mTarget
            java.lang.String r2 = r2.mWho
            r1.mTargetWho = r2
            androidx.fragment.app.Fragment r1 = r6.mFragment
            r2 = 0
            r1.mTarget = r2
            goto Lb1
        L4b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.StringBuilder r3 = r5.append(r3)
            androidx.fragment.app.Fragment r5 = r6.mFragment
            java.lang.StringBuilder r3 = r3.append(r5)
            java.lang.StringBuilder r2 = r3.append(r2)
            androidx.fragment.app.Fragment r3 = r6.mFragment
            androidx.fragment.app.Fragment r3 = r3.mTarget
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r1 = r2.append(r1)
            java.lang.String r1 = r1.toString()
            r4.<init>(r1)
            throw r4
        L74:
            androidx.fragment.app.Fragment r0 = r6.mFragment
            java.lang.String r0 = r0.mTargetWho
            if (r0 == 0) goto Lb0
            androidx.fragment.app.FragmentStore r0 = r6.mFragmentStore
            androidx.fragment.app.Fragment r4 = r6.mFragment
            java.lang.String r4 = r4.mTargetWho
            androidx.fragment.app.FragmentStateManager r0 = r0.getFragmentStateManager(r4)
            if (r0 == 0) goto L87
            goto Lb1
        L87:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.StringBuilder r3 = r5.append(r3)
            androidx.fragment.app.Fragment r5 = r6.mFragment
            java.lang.StringBuilder r3 = r3.append(r5)
            java.lang.StringBuilder r2 = r3.append(r2)
            androidx.fragment.app.Fragment r3 = r6.mFragment
            java.lang.String r3 = r3.mTargetWho
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r1 = r2.append(r1)
            java.lang.String r1 = r1.toString()
            r4.<init>(r1)
            throw r4
        Lb0:
            r0 = 0
        Lb1:
            if (r0 == 0) goto Lb6
            r0.moveToExpectedState()
        Lb6:
            androidx.fragment.app.Fragment r1 = r6.mFragment
            androidx.fragment.app.Fragment r2 = r6.mFragment
            androidx.fragment.app.FragmentManager r2 = r2.mFragmentManager
            androidx.fragment.app.FragmentHostCallback r2 = r2.getHost()
            r1.mHost = r2
            androidx.fragment.app.Fragment r1 = r6.mFragment
            androidx.fragment.app.Fragment r2 = r6.mFragment
            androidx.fragment.app.FragmentManager r2 = r2.mFragmentManager
            androidx.fragment.app.Fragment r2 = r2.getParent()
            r1.mParentFragment = r2
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r1 = r6.mDispatcher
            androidx.fragment.app.Fragment r2 = r6.mFragment
            r3 = 0
            r1.dispatchOnFragmentPreAttached(r2, r3)
            androidx.fragment.app.Fragment r1 = r6.mFragment
            r1.performAttach()
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r1 = r6.mDispatcher
            androidx.fragment.app.Fragment r2 = r6.mFragment
            r1.dispatchOnFragmentAttached(r2, r3)
            return
    }

    int computeExpectedState() {
            r9 = this;
            androidx.fragment.app.Fragment r0 = r9.mFragment
            androidx.fragment.app.FragmentManager r0 = r0.mFragmentManager
            if (r0 != 0) goto Lb
            androidx.fragment.app.Fragment r0 = r9.mFragment
            int r0 = r0.mState
            return r0
        Lb:
            int r0 = r9.mFragmentManagerState
            int[] r1 = androidx.fragment.app.FragmentStateManager.AnonymousClass2.$SwitchMap$androidx$lifecycle$Lifecycle$State
            androidx.fragment.app.Fragment r2 = r9.mFragment
            androidx.lifecycle.Lifecycle$State r2 = r2.mMaxState
            int r2 = r2.ordinal()
            r1 = r1[r2]
            r2 = -1
            r3 = 5
            r4 = 1
            switch(r1) {
                case 1: goto L34;
                case 2: goto L2f;
                case 3: goto L2a;
                case 4: goto L24;
                default: goto L1f;
            }
        L1f:
            int r0 = java.lang.Math.min(r0, r2)
            goto L35
        L24:
            r1 = 0
            int r0 = java.lang.Math.min(r0, r1)
            goto L35
        L2a:
            int r0 = java.lang.Math.min(r0, r4)
            goto L35
        L2f:
            int r0 = java.lang.Math.min(r0, r3)
            goto L35
        L34:
        L35:
            androidx.fragment.app.Fragment r1 = r9.mFragment
            boolean r1 = r1.mFromLayout
            r5 = 2
            r6 = 4
            if (r1 == 0) goto L6f
            androidx.fragment.app.Fragment r1 = r9.mFragment
            boolean r1 = r1.mInLayout
            if (r1 == 0) goto L5e
            int r1 = r9.mFragmentManagerState
            int r0 = java.lang.Math.max(r1, r5)
            androidx.fragment.app.Fragment r1 = r9.mFragment
            android.view.View r1 = r1.mView
            if (r1 == 0) goto L6f
            androidx.fragment.app.Fragment r1 = r9.mFragment
            android.view.View r1 = r1.mView
            android.view.ViewParent r1 = r1.getParent()
            if (r1 != 0) goto L6f
            int r0 = java.lang.Math.min(r0, r5)
            goto L6f
        L5e:
            int r1 = r9.mFragmentManagerState
            if (r1 >= r6) goto L6b
            androidx.fragment.app.Fragment r1 = r9.mFragment
            int r1 = r1.mState
            int r0 = java.lang.Math.min(r0, r1)
            goto L6f
        L6b:
            int r0 = java.lang.Math.min(r0, r4)
        L6f:
            androidx.fragment.app.Fragment r1 = r9.mFragment
            boolean r1 = r1.mInDynamicContainer
            if (r1 == 0) goto L7f
            androidx.fragment.app.Fragment r1 = r9.mFragment
            android.view.ViewGroup r1 = r1.mContainer
            if (r1 != 0) goto L7f
            int r0 = java.lang.Math.min(r0, r6)
        L7f:
            androidx.fragment.app.Fragment r1 = r9.mFragment
            boolean r1 = r1.mAdded
            if (r1 != 0) goto L89
            int r0 = java.lang.Math.min(r0, r4)
        L89:
            r1 = 0
            androidx.fragment.app.Fragment r7 = r9.mFragment
            android.view.ViewGroup r7 = r7.mContainer
            if (r7 == 0) goto La2
            androidx.fragment.app.Fragment r7 = r9.mFragment
            android.view.ViewGroup r7 = r7.mContainer
            androidx.fragment.app.Fragment r8 = r9.mFragment
            androidx.fragment.app.FragmentManager r8 = r8.getParentFragmentManager()
            androidx.fragment.app.SpecialEffectsController r7 = androidx.fragment.app.SpecialEffectsController.getOrCreateController(r7, r8)
            androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r1 = r7.getAwaitingCompletionLifecycleImpact(r9)
        La2:
            androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r7 = androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.ADDING
            r8 = 3
            if (r1 != r7) goto Lad
            r2 = 6
            int r0 = java.lang.Math.min(r0, r2)
            goto Lcd
        Lad:
            androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r7 = androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.REMOVING
            if (r1 != r7) goto Lb6
            int r0 = java.lang.Math.max(r0, r8)
            goto Lcd
        Lb6:
            androidx.fragment.app.Fragment r7 = r9.mFragment
            boolean r7 = r7.mRemoving
            if (r7 == 0) goto Lcd
            androidx.fragment.app.Fragment r7 = r9.mFragment
            boolean r7 = r7.isInBackStack()
            if (r7 == 0) goto Lc9
            int r0 = java.lang.Math.min(r0, r4)
            goto Lcd
        Lc9:
            int r0 = java.lang.Math.min(r0, r2)
        Lcd:
            androidx.fragment.app.Fragment r2 = r9.mFragment
            boolean r2 = r2.mDeferStart
            if (r2 == 0) goto Ldd
            androidx.fragment.app.Fragment r2 = r9.mFragment
            int r2 = r2.mState
            if (r2 >= r3) goto Ldd
            int r0 = java.lang.Math.min(r0, r6)
        Ldd:
            androidx.fragment.app.Fragment r2 = r9.mFragment
            boolean r2 = r2.mTransitioning
            if (r2 == 0) goto Le7
            int r0 = java.lang.Math.max(r0, r8)
        Le7:
            boolean r2 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r5)
            if (r2 == 0) goto L111
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "computeExpectedState() of "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r0)
            java.lang.String r3 = " for "
            java.lang.StringBuilder r2 = r2.append(r3)
            androidx.fragment.app.Fragment r3 = r9.mFragment
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "FragmentManager"
            android.util.Log.v(r3, r2)
        L111:
            return r0
    }

    void create() {
            r4 = this;
            r0 = 3
            boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r0)
            if (r0 == 0) goto L21
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "moveto CREATED: "
            java.lang.StringBuilder r0 = r0.append(r1)
            androidx.fragment.app.Fragment r1 = r4.mFragment
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.d(r1, r0)
        L21:
            r0 = 0
            androidx.fragment.app.Fragment r1 = r4.mFragment
            android.os.Bundle r1 = r1.mSavedFragmentState
            if (r1 == 0) goto L32
            androidx.fragment.app.Fragment r1 = r4.mFragment
            android.os.Bundle r1 = r1.mSavedFragmentState
            java.lang.String r2 = "savedInstanceState"
            android.os.Bundle r0 = r1.getBundle(r2)
        L32:
            androidx.fragment.app.Fragment r1 = r4.mFragment
            boolean r1 = r1.mIsCreated
            if (r1 != 0) goto L4d
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r1 = r4.mDispatcher
            androidx.fragment.app.Fragment r2 = r4.mFragment
            r3 = 0
            r1.dispatchOnFragmentPreCreated(r2, r0, r3)
            androidx.fragment.app.Fragment r1 = r4.mFragment
            r1.performCreate(r0)
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r1 = r4.mDispatcher
            androidx.fragment.app.Fragment r2 = r4.mFragment
            r1.dispatchOnFragmentCreated(r2, r0, r3)
            goto L57
        L4d:
            androidx.fragment.app.Fragment r1 = r4.mFragment
            r2 = 1
            r1.mState = r2
            androidx.fragment.app.Fragment r1 = r4.mFragment
            r1.restoreChildFragmentState()
        L57:
            return
    }

    void createView() {
            r10 = this;
            androidx.fragment.app.Fragment r0 = r10.mFragment
            boolean r0 = r0.mFromLayout
            if (r0 == 0) goto L7
            return
        L7:
            r0 = 3
            boolean r1 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r0)
            java.lang.String r2 = "FragmentManager"
            if (r1 == 0) goto L28
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "moveto CREATE_VIEW: "
            java.lang.StringBuilder r1 = r1.append(r3)
            androidx.fragment.app.Fragment r3 = r10.mFragment
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r1 = r1.toString()
            android.util.Log.d(r2, r1)
        L28:
            r1 = 0
            androidx.fragment.app.Fragment r3 = r10.mFragment
            android.os.Bundle r3 = r3.mSavedFragmentState
            if (r3 == 0) goto L39
            androidx.fragment.app.Fragment r3 = r10.mFragment
            android.os.Bundle r3 = r3.mSavedFragmentState
            java.lang.String r4 = "savedInstanceState"
            android.os.Bundle r1 = r3.getBundle(r4)
        L39:
            androidx.fragment.app.Fragment r3 = r10.mFragment
            android.view.LayoutInflater r3 = r3.performGetLayoutInflater(r1)
            r4 = 0
            androidx.fragment.app.Fragment r5 = r10.mFragment
            android.view.ViewGroup r5 = r5.mContainer
            if (r5 == 0) goto L4c
            androidx.fragment.app.Fragment r5 = r10.mFragment
            android.view.ViewGroup r4 = r5.mContainer
            goto Lf0
        L4c:
            androidx.fragment.app.Fragment r5 = r10.mFragment
            int r5 = r5.mContainerId
            if (r5 == 0) goto Lf0
            androidx.fragment.app.Fragment r5 = r10.mFragment
            int r5 = r5.mContainerId
            r6 = -1
            if (r5 == r6) goto Lcf
            androidx.fragment.app.Fragment r5 = r10.mFragment
            androidx.fragment.app.FragmentManager r5 = r5.mFragmentManager
            androidx.fragment.app.FragmentContainer r5 = r5.getContainer()
            androidx.fragment.app.Fragment r6 = r10.mFragment
            int r6 = r6.mContainerId
            android.view.View r6 = r5.onFindViewById(r6)
            r4 = r6
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            if (r4 != 0) goto Lc5
            androidx.fragment.app.Fragment r6 = r10.mFragment
            boolean r6 = r6.mRestored
            if (r6 != 0) goto Lf0
            androidx.fragment.app.Fragment r6 = r10.mFragment
            boolean r6 = r6.mInDynamicContainer
            if (r6 == 0) goto L7b
            goto Lf0
        L7b:
            androidx.fragment.app.Fragment r0 = r10.mFragment     // Catch: android.content.res.Resources.NotFoundException -> L8a
            android.content.res.Resources r0 = r0.getResources()     // Catch: android.content.res.Resources.NotFoundException -> L8a
            androidx.fragment.app.Fragment r2 = r10.mFragment     // Catch: android.content.res.Resources.NotFoundException -> L8a
            int r2 = r2.mContainerId     // Catch: android.content.res.Resources.NotFoundException -> L8a
            java.lang.String r0 = r0.getResourceName(r2)     // Catch: android.content.res.Resources.NotFoundException -> L8a
            goto L8e
        L8a:
            r0 = move-exception
            java.lang.String r2 = "unknown"
            r0 = r2
        L8e:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "No view found for id 0x"
            java.lang.StringBuilder r6 = r6.append(r7)
            androidx.fragment.app.Fragment r7 = r10.mFragment
            int r7 = r7.mContainerId
            java.lang.String r7 = java.lang.Integer.toHexString(r7)
            java.lang.StringBuilder r6 = r6.append(r7)
            java.lang.String r7 = " ("
            java.lang.StringBuilder r6 = r6.append(r7)
            java.lang.StringBuilder r6 = r6.append(r0)
            java.lang.String r7 = ") for fragment "
            java.lang.StringBuilder r6 = r6.append(r7)
            androidx.fragment.app.Fragment r7 = r10.mFragment
            java.lang.StringBuilder r6 = r6.append(r7)
            java.lang.String r6 = r6.toString()
            r2.<init>(r6)
            throw r2
        Lc5:
            boolean r6 = r4 instanceof androidx.fragment.app.FragmentContainerView
            if (r6 != 0) goto Lf0
            androidx.fragment.app.Fragment r6 = r10.mFragment
            androidx.fragment.app.strictmode.FragmentStrictMode.onWrongFragmentContainer(r6, r4)
            goto Lf0
        Lcf:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r5 = "Cannot create fragment "
            java.lang.StringBuilder r2 = r2.append(r5)
            androidx.fragment.app.Fragment r5 = r10.mFragment
            java.lang.StringBuilder r2 = r2.append(r5)
            java.lang.String r5 = " for a container view with no id"
            java.lang.StringBuilder r2 = r2.append(r5)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        Lf0:
            androidx.fragment.app.Fragment r5 = r10.mFragment
            r5.mContainer = r4
            androidx.fragment.app.Fragment r5 = r10.mFragment
            r5.performCreateView(r3, r4, r1)
            androidx.fragment.app.Fragment r5 = r10.mFragment
            android.view.View r5 = r5.mView
            r6 = 2
            if (r5 == 0) goto L1cf
            boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r0)
            if (r0 == 0) goto L11e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = "moveto VIEW_CREATED: "
            java.lang.StringBuilder r0 = r0.append(r5)
            androidx.fragment.app.Fragment r5 = r10.mFragment
            java.lang.StringBuilder r0 = r0.append(r5)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r2, r0)
        L11e:
            androidx.fragment.app.Fragment r0 = r10.mFragment
            android.view.View r0 = r0.mView
            r5 = 0
            r0.setSaveFromParentEnabled(r5)
            androidx.fragment.app.Fragment r0 = r10.mFragment
            android.view.View r0 = r0.mView
            int r7 = androidx.fragment.R.id.fragment_container_view_tag
            androidx.fragment.app.Fragment r8 = r10.mFragment
            r0.setTag(r7, r8)
            if (r4 == 0) goto L136
            r10.addViewToContainer()
        L136:
            androidx.fragment.app.Fragment r0 = r10.mFragment
            boolean r0 = r0.mHidden
            if (r0 == 0) goto L145
            androidx.fragment.app.Fragment r0 = r10.mFragment
            android.view.View r0 = r0.mView
            r7 = 8
            r0.setVisibility(r7)
        L145:
            androidx.fragment.app.Fragment r0 = r10.mFragment
            android.view.View r0 = r0.mView
            boolean r0 = r0.isAttachedToWindow()
            if (r0 == 0) goto L157
            androidx.fragment.app.Fragment r0 = r10.mFragment
            android.view.View r0 = r0.mView
            androidx.core.view.ViewCompat.requestApplyInsets(r0)
            goto L163
        L157:
            androidx.fragment.app.Fragment r0 = r10.mFragment
            android.view.View r0 = r0.mView
            androidx.fragment.app.FragmentStateManager$1 r7 = new androidx.fragment.app.FragmentStateManager$1
            r7.<init>(r10, r0)
            r0.addOnAttachStateChangeListener(r7)
        L163:
            androidx.fragment.app.Fragment r0 = r10.mFragment
            r0.performViewCreated()
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r0 = r10.mDispatcher
            androidx.fragment.app.Fragment r7 = r10.mFragment
            androidx.fragment.app.Fragment r8 = r10.mFragment
            android.view.View r8 = r8.mView
            r0.dispatchOnFragmentViewCreated(r7, r8, r1, r5)
            androidx.fragment.app.Fragment r0 = r10.mFragment
            android.view.View r0 = r0.mView
            int r0 = r0.getVisibility()
            androidx.fragment.app.Fragment r5 = r10.mFragment
            android.view.View r5 = r5.mView
            float r5 = r5.getAlpha()
            androidx.fragment.app.Fragment r7 = r10.mFragment
            r7.setPostOnViewCreatedAlpha(r5)
            androidx.fragment.app.Fragment r7 = r10.mFragment
            android.view.ViewGroup r7 = r7.mContainer
            if (r7 == 0) goto L1cf
            if (r0 != 0) goto L1cf
            androidx.fragment.app.Fragment r7 = r10.mFragment
            android.view.View r7 = r7.mView
            android.view.View r7 = r7.findFocus()
            if (r7 == 0) goto L1c7
            androidx.fragment.app.Fragment r8 = r10.mFragment
            r8.setFocusedView(r7)
            boolean r8 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r6)
            if (r8 == 0) goto L1c7
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "requestFocus: Saved focused view "
            java.lang.StringBuilder r8 = r8.append(r9)
            java.lang.StringBuilder r8 = r8.append(r7)
            java.lang.String r9 = " for Fragment "
            java.lang.StringBuilder r8 = r8.append(r9)
            androidx.fragment.app.Fragment r9 = r10.mFragment
            java.lang.StringBuilder r8 = r8.append(r9)
            java.lang.String r8 = r8.toString()
            android.util.Log.v(r2, r8)
        L1c7:
            androidx.fragment.app.Fragment r2 = r10.mFragment
            android.view.View r2 = r2.mView
            r8 = 0
            r2.setAlpha(r8)
        L1cf:
            androidx.fragment.app.Fragment r0 = r10.mFragment
            r0.mState = r6
            return
    }

    void destroy() {
            r10 = this;
            r0 = 3
            boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r0)
            if (r0 == 0) goto L21
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "movefrom CREATED: "
            java.lang.StringBuilder r0 = r0.append(r1)
            androidx.fragment.app.Fragment r1 = r10.mFragment
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.d(r1, r0)
        L21:
            androidx.fragment.app.Fragment r0 = r10.mFragment
            boolean r0 = r0.mRemoving
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L33
            androidx.fragment.app.Fragment r0 = r10.mFragment
            boolean r0 = r0.isInBackStack()
            if (r0 != 0) goto L33
            r0 = r1
            goto L34
        L33:
            r0 = r2
        L34:
            r3 = 0
            if (r0 == 0) goto L46
            androidx.fragment.app.Fragment r4 = r10.mFragment
            boolean r4 = r4.mBeingSaved
            if (r4 != 0) goto L46
            androidx.fragment.app.FragmentStore r4 = r10.mFragmentStore
            androidx.fragment.app.Fragment r5 = r10.mFragment
            java.lang.String r5 = r5.mWho
            r4.setSavedState(r5, r3)
        L46:
            if (r0 != 0) goto L59
            androidx.fragment.app.FragmentStore r4 = r10.mFragmentStore
            androidx.fragment.app.FragmentManagerViewModel r4 = r4.getNonConfig()
            androidx.fragment.app.Fragment r5 = r10.mFragment
            boolean r4 = r4.shouldDestroy(r5)
            if (r4 == 0) goto L57
            goto L59
        L57:
            r4 = r2
            goto L5a
        L59:
            r4 = r1
        L5a:
            if (r4 == 0) goto Lee
            androidx.fragment.app.Fragment r5 = r10.mFragment
            androidx.fragment.app.FragmentHostCallback<?> r5 = r5.mHost
            boolean r6 = r5 instanceof androidx.lifecycle.ViewModelStoreOwner
            if (r6 == 0) goto L6f
            androidx.fragment.app.FragmentStore r1 = r10.mFragmentStore
            androidx.fragment.app.FragmentManagerViewModel r1 = r1.getNonConfig()
            boolean r1 = r1.isCleared()
            goto L84
        L6f:
            android.content.Context r6 = r5.getContext()
            boolean r6 = r6 instanceof android.app.Activity
            if (r6 == 0) goto L83
            android.content.Context r6 = r5.getContext()
            android.app.Activity r6 = (android.app.Activity) r6
            boolean r7 = r6.isChangingConfigurations()
            r1 = r1 ^ r7
            goto L84
        L83:
            r1 = 1
        L84:
            if (r0 == 0) goto L8c
            androidx.fragment.app.Fragment r6 = r10.mFragment
            boolean r6 = r6.mBeingSaved
            if (r6 == 0) goto L8e
        L8c:
            if (r1 == 0) goto L99
        L8e:
            androidx.fragment.app.FragmentStore r6 = r10.mFragmentStore
            androidx.fragment.app.FragmentManagerViewModel r6 = r6.getNonConfig()
            androidx.fragment.app.Fragment r7 = r10.mFragment
            r6.clearNonConfigState(r7, r2)
        L99:
            androidx.fragment.app.Fragment r6 = r10.mFragment
            r6.performDestroy()
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r6 = r10.mDispatcher
            androidx.fragment.app.Fragment r7 = r10.mFragment
            r6.dispatchOnFragmentDestroyed(r7, r2)
            androidx.fragment.app.FragmentStore r2 = r10.mFragmentStore
            java.util.List r2 = r2.getActiveFragmentStateManagers()
            java.util.Iterator r2 = r2.iterator()
        Laf:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto Ld4
            java.lang.Object r6 = r2.next()
            androidx.fragment.app.FragmentStateManager r6 = (androidx.fragment.app.FragmentStateManager) r6
            if (r6 == 0) goto Ld3
            androidx.fragment.app.Fragment r7 = r6.getFragment()
            androidx.fragment.app.Fragment r8 = r10.mFragment
            java.lang.String r8 = r8.mWho
            java.lang.String r9 = r7.mTargetWho
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto Ld3
            androidx.fragment.app.Fragment r8 = r10.mFragment
            r7.mTarget = r8
            r7.mTargetWho = r3
        Ld3:
            goto Laf
        Ld4:
            androidx.fragment.app.Fragment r2 = r10.mFragment
            java.lang.String r2 = r2.mTargetWho
            if (r2 == 0) goto Le8
            androidx.fragment.app.Fragment r2 = r10.mFragment
            androidx.fragment.app.FragmentStore r3 = r10.mFragmentStore
            androidx.fragment.app.Fragment r6 = r10.mFragment
            java.lang.String r6 = r6.mTargetWho
            androidx.fragment.app.Fragment r3 = r3.findActiveFragment(r6)
            r2.mTarget = r3
        Le8:
            androidx.fragment.app.FragmentStore r2 = r10.mFragmentStore
            r2.makeInactive(r10)
            goto L10c
        Lee:
            androidx.fragment.app.Fragment r1 = r10.mFragment
            java.lang.String r1 = r1.mTargetWho
            if (r1 == 0) goto L108
            androidx.fragment.app.FragmentStore r1 = r10.mFragmentStore
            androidx.fragment.app.Fragment r3 = r10.mFragment
            java.lang.String r3 = r3.mTargetWho
            androidx.fragment.app.Fragment r1 = r1.findActiveFragment(r3)
            if (r1 == 0) goto L108
            boolean r3 = r1.mRetainInstance
            if (r3 == 0) goto L108
            androidx.fragment.app.Fragment r3 = r10.mFragment
            r3.mTarget = r1
        L108:
            androidx.fragment.app.Fragment r1 = r10.mFragment
            r1.mState = r2
        L10c:
            return
    }

    void destroyFragmentView() {
            r3 = this;
            r0 = 3
            boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r0)
            if (r0 == 0) goto L21
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "movefrom CREATE_VIEW: "
            java.lang.StringBuilder r0 = r0.append(r1)
            androidx.fragment.app.Fragment r1 = r3.mFragment
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.d(r1, r0)
        L21:
            androidx.fragment.app.Fragment r0 = r3.mFragment
            android.view.ViewGroup r0 = r0.mContainer
            if (r0 == 0) goto L38
            androidx.fragment.app.Fragment r0 = r3.mFragment
            android.view.View r0 = r0.mView
            if (r0 == 0) goto L38
            androidx.fragment.app.Fragment r0 = r3.mFragment
            android.view.ViewGroup r0 = r0.mContainer
            androidx.fragment.app.Fragment r1 = r3.mFragment
            android.view.View r1 = r1.mView
            r0.removeView(r1)
        L38:
            androidx.fragment.app.Fragment r0 = r3.mFragment
            r0.performDestroyView()
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r0 = r3.mDispatcher
            androidx.fragment.app.Fragment r1 = r3.mFragment
            r2 = 0
            r0.dispatchOnFragmentViewDestroyed(r1, r2)
            androidx.fragment.app.Fragment r0 = r3.mFragment
            r1 = 0
            r0.mContainer = r1
            androidx.fragment.app.Fragment r0 = r3.mFragment
            r0.mView = r1
            androidx.fragment.app.Fragment r0 = r3.mFragment
            r0.mViewLifecycleOwner = r1
            androidx.fragment.app.Fragment r0 = r3.mFragment
            androidx.lifecycle.MutableLiveData<androidx.lifecycle.LifecycleOwner> r0 = r0.mViewLifecycleOwnerLiveData
            r0.setValue(r1)
            androidx.fragment.app.Fragment r0 = r3.mFragment
            r0.mInLayout = r2
            return
    }

    void detach() {
            r5 = this;
            r0 = 3
            boolean r1 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r0)
            java.lang.String r2 = "FragmentManager"
            if (r1 == 0) goto L21
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "movefrom ATTACHED: "
            java.lang.StringBuilder r1 = r1.append(r3)
            androidx.fragment.app.Fragment r3 = r5.mFragment
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r1 = r1.toString()
            android.util.Log.d(r2, r1)
        L21:
            androidx.fragment.app.Fragment r1 = r5.mFragment
            r1.performDetach()
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r1 = r5.mDispatcher
            androidx.fragment.app.Fragment r3 = r5.mFragment
            r4 = 0
            r1.dispatchOnFragmentDetached(r3, r4)
            androidx.fragment.app.Fragment r1 = r5.mFragment
            r3 = -1
            r1.mState = r3
            androidx.fragment.app.Fragment r1 = r5.mFragment
            r3 = 0
            r1.mHost = r3
            androidx.fragment.app.Fragment r1 = r5.mFragment
            r1.mParentFragment = r3
            androidx.fragment.app.Fragment r1 = r5.mFragment
            r1.mFragmentManager = r3
            androidx.fragment.app.Fragment r1 = r5.mFragment
            boolean r1 = r1.mRemoving
            if (r1 == 0) goto L4f
            androidx.fragment.app.Fragment r1 = r5.mFragment
            boolean r1 = r1.isInBackStack()
            if (r1 != 0) goto L4f
            r4 = 1
        L4f:
            if (r4 != 0) goto L5f
            androidx.fragment.app.FragmentStore r1 = r5.mFragmentStore
            androidx.fragment.app.FragmentManagerViewModel r1 = r1.getNonConfig()
            androidx.fragment.app.Fragment r3 = r5.mFragment
            boolean r1 = r1.shouldDestroy(r3)
            if (r1 == 0) goto L82
        L5f:
            boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r0)
            if (r0 == 0) goto L7d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "initState called for fragment: "
            java.lang.StringBuilder r0 = r0.append(r1)
            androidx.fragment.app.Fragment r1 = r5.mFragment
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r2, r0)
        L7d:
            androidx.fragment.app.Fragment r0 = r5.mFragment
            r0.initState()
        L82:
            return
    }

    void ensureInflatedView() {
            r5 = this;
            androidx.fragment.app.Fragment r0 = r5.mFragment
            boolean r0 = r0.mFromLayout
            if (r0 == 0) goto L8d
            androidx.fragment.app.Fragment r0 = r5.mFragment
            boolean r0 = r0.mInLayout
            if (r0 == 0) goto L8d
            androidx.fragment.app.Fragment r0 = r5.mFragment
            boolean r0 = r0.mPerformedCreateView
            if (r0 != 0) goto L8d
            r0 = 3
            boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r0)
            if (r0 == 0) goto L33
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "moveto CREATE_VIEW: "
            java.lang.StringBuilder r0 = r0.append(r1)
            androidx.fragment.app.Fragment r1 = r5.mFragment
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.d(r1, r0)
        L33:
            r0 = 0
            androidx.fragment.app.Fragment r1 = r5.mFragment
            android.os.Bundle r1 = r1.mSavedFragmentState
            if (r1 == 0) goto L44
            androidx.fragment.app.Fragment r1 = r5.mFragment
            android.os.Bundle r1 = r1.mSavedFragmentState
            java.lang.String r2 = "savedInstanceState"
            android.os.Bundle r0 = r1.getBundle(r2)
        L44:
            androidx.fragment.app.Fragment r1 = r5.mFragment
            androidx.fragment.app.Fragment r2 = r5.mFragment
            android.view.LayoutInflater r2 = r2.performGetLayoutInflater(r0)
            r3 = 0
            r1.performCreateView(r2, r3, r0)
            androidx.fragment.app.Fragment r1 = r5.mFragment
            android.view.View r1 = r1.mView
            if (r1 == 0) goto L8d
            androidx.fragment.app.Fragment r1 = r5.mFragment
            android.view.View r1 = r1.mView
            r2 = 0
            r1.setSaveFromParentEnabled(r2)
            androidx.fragment.app.Fragment r1 = r5.mFragment
            android.view.View r1 = r1.mView
            int r3 = androidx.fragment.R.id.fragment_container_view_tag
            androidx.fragment.app.Fragment r4 = r5.mFragment
            r1.setTag(r3, r4)
            androidx.fragment.app.Fragment r1 = r5.mFragment
            boolean r1 = r1.mHidden
            if (r1 == 0) goto L78
            androidx.fragment.app.Fragment r1 = r5.mFragment
            android.view.View r1 = r1.mView
            r3 = 8
            r1.setVisibility(r3)
        L78:
            androidx.fragment.app.Fragment r1 = r5.mFragment
            r1.performViewCreated()
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r1 = r5.mDispatcher
            androidx.fragment.app.Fragment r3 = r5.mFragment
            androidx.fragment.app.Fragment r4 = r5.mFragment
            android.view.View r4 = r4.mView
            r1.dispatchOnFragmentViewCreated(r3, r4, r0, r2)
            androidx.fragment.app.Fragment r1 = r5.mFragment
            r2 = 2
            r1.mState = r2
        L8d:
            return
    }

    androidx.fragment.app.Fragment getFragment() {
            r1 = this;
            androidx.fragment.app.Fragment r0 = r1.mFragment
            return r0
    }

    void moveToExpectedState() {
            r11 = this;
            boolean r0 = r11.mMovingToState
            r1 = 2
            java.lang.String r2 = "FragmentManager"
            if (r0 == 0) goto L28
            boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r1)
            if (r0 == 0) goto L27
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Ignoring re-entrant call to moveToExpectedState() for "
            java.lang.StringBuilder r0 = r0.append(r1)
            androidx.fragment.app.Fragment r1 = r11.getFragment()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.util.Log.v(r2, r0)
        L27:
            return
        L28:
            r0 = 0
            r3 = 1
            r11.mMovingToState = r3     // Catch: java.lang.Throwable -> L214
            r4 = 0
        L2d:
            int r5 = r11.computeExpectedState()     // Catch: java.lang.Throwable -> L214
            r6 = r5
            androidx.fragment.app.Fragment r7 = r11.mFragment     // Catch: java.lang.Throwable -> L214
            int r7 = r7.mState     // Catch: java.lang.Throwable -> L214
            r8 = 3
            if (r5 == r7) goto L152
            r4 = 1
            androidx.fragment.app.Fragment r5 = r11.mFragment     // Catch: java.lang.Throwable -> L214
            int r5 = r5.mState     // Catch: java.lang.Throwable -> L214
            if (r6 <= r5) goto L9b
            androidx.fragment.app.Fragment r5 = r11.mFragment     // Catch: java.lang.Throwable -> L214
            int r5 = r5.mState     // Catch: java.lang.Throwable -> L214
            int r5 = r5 + r3
            switch(r5) {
                case 0: goto L96;
                case 1: goto L92;
                case 2: goto L8b;
                case 3: goto L87;
                case 4: goto L57;
                case 5: goto L53;
                case 6: goto L4d;
                case 7: goto L49;
                default: goto L48;
            }     // Catch: java.lang.Throwable -> L214
        L48:
            goto L9a
        L49:
            r11.resume()     // Catch: java.lang.Throwable -> L214
            goto L9a
        L4d:
            androidx.fragment.app.Fragment r7 = r11.mFragment     // Catch: java.lang.Throwable -> L214
            r8 = 6
            r7.mState = r8     // Catch: java.lang.Throwable -> L214
            goto L9a
        L53:
            r11.start()     // Catch: java.lang.Throwable -> L214
            goto L9a
        L57:
            androidx.fragment.app.Fragment r7 = r11.mFragment     // Catch: java.lang.Throwable -> L214
            android.view.View r7 = r7.mView     // Catch: java.lang.Throwable -> L214
            if (r7 == 0) goto L81
            androidx.fragment.app.Fragment r7 = r11.mFragment     // Catch: java.lang.Throwable -> L214
            android.view.ViewGroup r7 = r7.mContainer     // Catch: java.lang.Throwable -> L214
            if (r7 == 0) goto L81
            androidx.fragment.app.Fragment r7 = r11.mFragment     // Catch: java.lang.Throwable -> L214
            android.view.ViewGroup r7 = r7.mContainer     // Catch: java.lang.Throwable -> L214
            androidx.fragment.app.Fragment r8 = r11.mFragment     // Catch: java.lang.Throwable -> L214
            androidx.fragment.app.FragmentManager r8 = r8.getParentFragmentManager()     // Catch: java.lang.Throwable -> L214
            androidx.fragment.app.SpecialEffectsController r7 = androidx.fragment.app.SpecialEffectsController.getOrCreateController(r7, r8)     // Catch: java.lang.Throwable -> L214
            androidx.fragment.app.Fragment r8 = r11.mFragment     // Catch: java.lang.Throwable -> L214
            android.view.View r8 = r8.mView     // Catch: java.lang.Throwable -> L214
            int r8 = r8.getVisibility()     // Catch: java.lang.Throwable -> L214
            androidx.fragment.app.SpecialEffectsController$Operation$State r9 = androidx.fragment.app.SpecialEffectsController.Operation.State.from(r8)     // Catch: java.lang.Throwable -> L214
            r7.enqueueAdd(r9, r11)     // Catch: java.lang.Throwable -> L214
        L81:
            androidx.fragment.app.Fragment r7 = r11.mFragment     // Catch: java.lang.Throwable -> L214
            r8 = 4
            r7.mState = r8     // Catch: java.lang.Throwable -> L214
            goto L9a
        L87:
            r11.activityCreated()     // Catch: java.lang.Throwable -> L214
            goto L9a
        L8b:
            r11.ensureInflatedView()     // Catch: java.lang.Throwable -> L214
            r11.createView()     // Catch: java.lang.Throwable -> L214
            goto L9a
        L92:
            r11.create()     // Catch: java.lang.Throwable -> L214
            goto L9a
        L96:
            r11.attach()     // Catch: java.lang.Throwable -> L214
        L9a:
            goto L2d
        L9b:
            androidx.fragment.app.Fragment r5 = r11.mFragment     // Catch: java.lang.Throwable -> L214
            int r5 = r5.mState     // Catch: java.lang.Throwable -> L214
            int r5 = r5 - r3
            switch(r5) {
                case -1: goto L14d;
                case 0: goto L12a;
                case 1: goto L122;
                case 2: goto L119;
                case 3: goto Lb6;
                case 4: goto Lb1;
                case 5: goto Laa;
                case 6: goto La5;
                default: goto La3;
            }     // Catch: java.lang.Throwable -> L214
        La3:
            goto L150
        La5:
            r11.pause()     // Catch: java.lang.Throwable -> L214
            goto L150
        Laa:
            androidx.fragment.app.Fragment r7 = r11.mFragment     // Catch: java.lang.Throwable -> L214
            r8 = 5
            r7.mState = r8     // Catch: java.lang.Throwable -> L214
            goto L150
        Lb1:
            r11.stop()     // Catch: java.lang.Throwable -> L214
            goto L150
        Lb6:
            boolean r7 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r8)     // Catch: java.lang.Throwable -> L214
            if (r7 == 0) goto Ld4
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L214
            r7.<init>()     // Catch: java.lang.Throwable -> L214
            java.lang.String r9 = "movefrom ACTIVITY_CREATED: "
            java.lang.StringBuilder r7 = r7.append(r9)     // Catch: java.lang.Throwable -> L214
            androidx.fragment.app.Fragment r9 = r11.mFragment     // Catch: java.lang.Throwable -> L214
            java.lang.StringBuilder r7 = r7.append(r9)     // Catch: java.lang.Throwable -> L214
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L214
            android.util.Log.d(r2, r7)     // Catch: java.lang.Throwable -> L214
        Ld4:
            androidx.fragment.app.Fragment r7 = r11.mFragment     // Catch: java.lang.Throwable -> L214
            boolean r7 = r7.mBeingSaved     // Catch: java.lang.Throwable -> L214
            if (r7 == 0) goto Le8
            androidx.fragment.app.FragmentStore r7 = r11.mFragmentStore     // Catch: java.lang.Throwable -> L214
            androidx.fragment.app.Fragment r9 = r11.mFragment     // Catch: java.lang.Throwable -> L214
            java.lang.String r9 = r9.mWho     // Catch: java.lang.Throwable -> L214
            android.os.Bundle r10 = r11.saveState()     // Catch: java.lang.Throwable -> L214
            r7.setSavedState(r9, r10)     // Catch: java.lang.Throwable -> L214
            goto Lf7
        Le8:
            androidx.fragment.app.Fragment r7 = r11.mFragment     // Catch: java.lang.Throwable -> L214
            android.view.View r7 = r7.mView     // Catch: java.lang.Throwable -> L214
            if (r7 == 0) goto Lf7
            androidx.fragment.app.Fragment r7 = r11.mFragment     // Catch: java.lang.Throwable -> L214
            android.util.SparseArray<android.os.Parcelable> r7 = r7.mSavedViewState     // Catch: java.lang.Throwable -> L214
            if (r7 != 0) goto Lf7
            r11.saveViewState()     // Catch: java.lang.Throwable -> L214
        Lf7:
            androidx.fragment.app.Fragment r7 = r11.mFragment     // Catch: java.lang.Throwable -> L214
            android.view.View r7 = r7.mView     // Catch: java.lang.Throwable -> L214
            if (r7 == 0) goto L114
            androidx.fragment.app.Fragment r7 = r11.mFragment     // Catch: java.lang.Throwable -> L214
            android.view.ViewGroup r7 = r7.mContainer     // Catch: java.lang.Throwable -> L214
            if (r7 == 0) goto L114
            androidx.fragment.app.Fragment r7 = r11.mFragment     // Catch: java.lang.Throwable -> L214
            android.view.ViewGroup r7 = r7.mContainer     // Catch: java.lang.Throwable -> L214
            androidx.fragment.app.Fragment r9 = r11.mFragment     // Catch: java.lang.Throwable -> L214
            androidx.fragment.app.FragmentManager r9 = r9.getParentFragmentManager()     // Catch: java.lang.Throwable -> L214
            androidx.fragment.app.SpecialEffectsController r7 = androidx.fragment.app.SpecialEffectsController.getOrCreateController(r7, r9)     // Catch: java.lang.Throwable -> L214
            r7.enqueueRemove(r11)     // Catch: java.lang.Throwable -> L214
        L114:
            androidx.fragment.app.Fragment r7 = r11.mFragment     // Catch: java.lang.Throwable -> L214
            r7.mState = r8     // Catch: java.lang.Throwable -> L214
            goto L150
        L119:
            androidx.fragment.app.Fragment r7 = r11.mFragment     // Catch: java.lang.Throwable -> L214
            r7.mInLayout = r0     // Catch: java.lang.Throwable -> L214
            androidx.fragment.app.Fragment r7 = r11.mFragment     // Catch: java.lang.Throwable -> L214
            r7.mState = r1     // Catch: java.lang.Throwable -> L214
            goto L150
        L122:
            r11.destroyFragmentView()     // Catch: java.lang.Throwable -> L214
            androidx.fragment.app.Fragment r7 = r11.mFragment     // Catch: java.lang.Throwable -> L214
            r7.mState = r3     // Catch: java.lang.Throwable -> L214
            goto L150
        L12a:
            androidx.fragment.app.Fragment r7 = r11.mFragment     // Catch: java.lang.Throwable -> L214
            boolean r7 = r7.mBeingSaved     // Catch: java.lang.Throwable -> L214
            if (r7 == 0) goto L149
            androidx.fragment.app.FragmentStore r7 = r11.mFragmentStore     // Catch: java.lang.Throwable -> L214
            androidx.fragment.app.Fragment r8 = r11.mFragment     // Catch: java.lang.Throwable -> L214
            java.lang.String r8 = r8.mWho     // Catch: java.lang.Throwable -> L214
            android.os.Bundle r7 = r7.getSavedState(r8)     // Catch: java.lang.Throwable -> L214
            if (r7 != 0) goto L149
            androidx.fragment.app.FragmentStore r7 = r11.mFragmentStore     // Catch: java.lang.Throwable -> L214
            androidx.fragment.app.Fragment r8 = r11.mFragment     // Catch: java.lang.Throwable -> L214
            java.lang.String r8 = r8.mWho     // Catch: java.lang.Throwable -> L214
            android.os.Bundle r9 = r11.saveState()     // Catch: java.lang.Throwable -> L214
            r7.setSavedState(r8, r9)     // Catch: java.lang.Throwable -> L214
        L149:
            r11.destroy()     // Catch: java.lang.Throwable -> L214
            goto L150
        L14d:
            r11.detach()     // Catch: java.lang.Throwable -> L214
        L150:
            goto L2d
        L152:
            if (r4 != 0) goto L1c0
            androidx.fragment.app.Fragment r1 = r11.mFragment     // Catch: java.lang.Throwable -> L214
            int r1 = r1.mState     // Catch: java.lang.Throwable -> L214
            r5 = -1
            if (r1 != r5) goto L1c0
            androidx.fragment.app.Fragment r1 = r11.mFragment     // Catch: java.lang.Throwable -> L214
            boolean r1 = r1.mRemoving     // Catch: java.lang.Throwable -> L214
            if (r1 == 0) goto L1c0
            androidx.fragment.app.Fragment r1 = r11.mFragment     // Catch: java.lang.Throwable -> L214
            boolean r1 = r1.isInBackStack()     // Catch: java.lang.Throwable -> L214
            if (r1 != 0) goto L1c0
            androidx.fragment.app.Fragment r1 = r11.mFragment     // Catch: java.lang.Throwable -> L214
            boolean r1 = r1.mBeingSaved     // Catch: java.lang.Throwable -> L214
            if (r1 != 0) goto L1c0
            boolean r1 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r8)     // Catch: java.lang.Throwable -> L214
            if (r1 == 0) goto L18d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L214
            r1.<init>()     // Catch: java.lang.Throwable -> L214
            java.lang.String r5 = "Cleaning up state of never attached fragment: "
            java.lang.StringBuilder r1 = r1.append(r5)     // Catch: java.lang.Throwable -> L214
            androidx.fragment.app.Fragment r5 = r11.mFragment     // Catch: java.lang.Throwable -> L214
            java.lang.StringBuilder r1 = r1.append(r5)     // Catch: java.lang.Throwable -> L214
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L214
            android.util.Log.d(r2, r1)     // Catch: java.lang.Throwable -> L214
        L18d:
            androidx.fragment.app.FragmentStore r1 = r11.mFragmentStore     // Catch: java.lang.Throwable -> L214
            androidx.fragment.app.FragmentManagerViewModel r1 = r1.getNonConfig()     // Catch: java.lang.Throwable -> L214
            androidx.fragment.app.Fragment r5 = r11.mFragment     // Catch: java.lang.Throwable -> L214
            r1.clearNonConfigState(r5, r3)     // Catch: java.lang.Throwable -> L214
            androidx.fragment.app.FragmentStore r1 = r11.mFragmentStore     // Catch: java.lang.Throwable -> L214
            r1.makeInactive(r11)     // Catch: java.lang.Throwable -> L214
            boolean r1 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r8)     // Catch: java.lang.Throwable -> L214
            if (r1 == 0) goto L1bb
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L214
            r1.<init>()     // Catch: java.lang.Throwable -> L214
            java.lang.String r3 = "initState called for fragment: "
            java.lang.StringBuilder r1 = r1.append(r3)     // Catch: java.lang.Throwable -> L214
            androidx.fragment.app.Fragment r3 = r11.mFragment     // Catch: java.lang.Throwable -> L214
            java.lang.StringBuilder r1 = r1.append(r3)     // Catch: java.lang.Throwable -> L214
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L214
            android.util.Log.d(r2, r1)     // Catch: java.lang.Throwable -> L214
        L1bb:
            androidx.fragment.app.Fragment r1 = r11.mFragment     // Catch: java.lang.Throwable -> L214
            r1.initState()     // Catch: java.lang.Throwable -> L214
        L1c0:
            androidx.fragment.app.Fragment r1 = r11.mFragment     // Catch: java.lang.Throwable -> L214
            boolean r1 = r1.mHiddenChanged     // Catch: java.lang.Throwable -> L214
            if (r1 == 0) goto L210
            androidx.fragment.app.Fragment r1 = r11.mFragment     // Catch: java.lang.Throwable -> L214
            android.view.View r1 = r1.mView     // Catch: java.lang.Throwable -> L214
            if (r1 == 0) goto L1ed
            androidx.fragment.app.Fragment r1 = r11.mFragment     // Catch: java.lang.Throwable -> L214
            android.view.ViewGroup r1 = r1.mContainer     // Catch: java.lang.Throwable -> L214
            if (r1 == 0) goto L1ed
            androidx.fragment.app.Fragment r1 = r11.mFragment     // Catch: java.lang.Throwable -> L214
            android.view.ViewGroup r1 = r1.mContainer     // Catch: java.lang.Throwable -> L214
            androidx.fragment.app.Fragment r2 = r11.mFragment     // Catch: java.lang.Throwable -> L214
            androidx.fragment.app.FragmentManager r2 = r2.getParentFragmentManager()     // Catch: java.lang.Throwable -> L214
            androidx.fragment.app.SpecialEffectsController r1 = androidx.fragment.app.SpecialEffectsController.getOrCreateController(r1, r2)     // Catch: java.lang.Throwable -> L214
            androidx.fragment.app.Fragment r2 = r11.mFragment     // Catch: java.lang.Throwable -> L214
            boolean r2 = r2.mHidden     // Catch: java.lang.Throwable -> L214
            if (r2 == 0) goto L1ea
            r1.enqueueHide(r11)     // Catch: java.lang.Throwable -> L214
            goto L1ed
        L1ea:
            r1.enqueueShow(r11)     // Catch: java.lang.Throwable -> L214
        L1ed:
            androidx.fragment.app.Fragment r1 = r11.mFragment     // Catch: java.lang.Throwable -> L214
            androidx.fragment.app.FragmentManager r1 = r1.mFragmentManager     // Catch: java.lang.Throwable -> L214
            if (r1 == 0) goto L1fc
            androidx.fragment.app.Fragment r1 = r11.mFragment     // Catch: java.lang.Throwable -> L214
            androidx.fragment.app.FragmentManager r1 = r1.mFragmentManager     // Catch: java.lang.Throwable -> L214
            androidx.fragment.app.Fragment r2 = r11.mFragment     // Catch: java.lang.Throwable -> L214
            r1.invalidateMenuForFragment(r2)     // Catch: java.lang.Throwable -> L214
        L1fc:
            androidx.fragment.app.Fragment r1 = r11.mFragment     // Catch: java.lang.Throwable -> L214
            r1.mHiddenChanged = r0     // Catch: java.lang.Throwable -> L214
            androidx.fragment.app.Fragment r1 = r11.mFragment     // Catch: java.lang.Throwable -> L214
            androidx.fragment.app.Fragment r2 = r11.mFragment     // Catch: java.lang.Throwable -> L214
            boolean r2 = r2.mHidden     // Catch: java.lang.Throwable -> L214
            r1.onHiddenChanged(r2)     // Catch: java.lang.Throwable -> L214
            androidx.fragment.app.Fragment r1 = r11.mFragment     // Catch: java.lang.Throwable -> L214
            androidx.fragment.app.FragmentManager r1 = r1.mChildFragmentManager     // Catch: java.lang.Throwable -> L214
            r1.dispatchOnHiddenChanged()     // Catch: java.lang.Throwable -> L214
        L210:
            r11.mMovingToState = r0
            return
        L214:
            r1 = move-exception
            r11.mMovingToState = r0
            throw r1
    }

    void pause() {
            r3 = this;
            r0 = 3
            boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r0)
            if (r0 == 0) goto L21
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "movefrom RESUMED: "
            java.lang.StringBuilder r0 = r0.append(r1)
            androidx.fragment.app.Fragment r1 = r3.mFragment
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.d(r1, r0)
        L21:
            androidx.fragment.app.Fragment r0 = r3.mFragment
            r0.performPause()
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r0 = r3.mDispatcher
            androidx.fragment.app.Fragment r1 = r3.mFragment
            r2 = 0
            r0.dispatchOnFragmentPaused(r1, r2)
            return
    }

    void restoreState(java.lang.ClassLoader r6) {
            r5 = this;
            androidx.fragment.app.Fragment r0 = r5.mFragment
            android.os.Bundle r0 = r0.mSavedFragmentState
            if (r0 != 0) goto L7
            return
        L7:
            androidx.fragment.app.Fragment r0 = r5.mFragment
            android.os.Bundle r0 = r0.mSavedFragmentState
            r0.setClassLoader(r6)
            androidx.fragment.app.Fragment r0 = r5.mFragment
            android.os.Bundle r0 = r0.mSavedFragmentState
            java.lang.String r1 = "savedInstanceState"
            android.os.Bundle r0 = r0.getBundle(r1)
            if (r0 != 0) goto L26
            androidx.fragment.app.Fragment r2 = r5.mFragment
            android.os.Bundle r2 = r2.mSavedFragmentState
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            r2.putBundle(r1, r3)
        L26:
            androidx.fragment.app.Fragment r1 = r5.mFragment     // Catch: android.os.BadParcelableException -> L87
            androidx.fragment.app.Fragment r2 = r5.mFragment     // Catch: android.os.BadParcelableException -> L87
            android.os.Bundle r2 = r2.mSavedFragmentState     // Catch: android.os.BadParcelableException -> L87
            java.lang.String r3 = "viewState"
            android.util.SparseArray r2 = r2.getSparseParcelableArray(r3)     // Catch: android.os.BadParcelableException -> L87
            r1.mSavedViewState = r2     // Catch: android.os.BadParcelableException -> L87
            androidx.fragment.app.Fragment r1 = r5.mFragment
            androidx.fragment.app.Fragment r2 = r5.mFragment
            android.os.Bundle r2 = r2.mSavedFragmentState
            java.lang.String r3 = "viewRegistryState"
            android.os.Bundle r2 = r2.getBundle(r3)
            r1.mSavedViewRegistryState = r2
            androidx.fragment.app.Fragment r1 = r5.mFragment
            android.os.Bundle r1 = r1.mSavedFragmentState
            java.lang.String r2 = "state"
            android.os.Parcelable r1 = r1.getParcelable(r2)
            androidx.fragment.app.FragmentState r1 = (androidx.fragment.app.FragmentState) r1
            if (r1 == 0) goto L7b
            androidx.fragment.app.Fragment r2 = r5.mFragment
            java.lang.String r3 = r1.mTargetWho
            r2.mTargetWho = r3
            androidx.fragment.app.Fragment r2 = r5.mFragment
            int r3 = r1.mTargetRequestCode
            r2.mTargetRequestCode = r3
            androidx.fragment.app.Fragment r2 = r5.mFragment
            java.lang.Boolean r2 = r2.mSavedUserVisibleHint
            if (r2 == 0) goto L75
            androidx.fragment.app.Fragment r2 = r5.mFragment
            androidx.fragment.app.Fragment r3 = r5.mFragment
            java.lang.Boolean r3 = r3.mSavedUserVisibleHint
            boolean r3 = r3.booleanValue()
            r2.mUserVisibleHint = r3
            androidx.fragment.app.Fragment r2 = r5.mFragment
            r3 = 0
            r2.mSavedUserVisibleHint = r3
            goto L7b
        L75:
            androidx.fragment.app.Fragment r2 = r5.mFragment
            boolean r3 = r1.mUserVisibleHint
            r2.mUserVisibleHint = r3
        L7b:
            androidx.fragment.app.Fragment r2 = r5.mFragment
            boolean r2 = r2.mUserVisibleHint
            if (r2 != 0) goto L86
            androidx.fragment.app.Fragment r2 = r5.mFragment
            r3 = 1
            r2.mDeferStart = r3
        L86:
            return
        L87:
            r1 = move-exception
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Failed to restore view hierarchy state for fragment "
            java.lang.StringBuilder r3 = r3.append(r4)
            androidx.fragment.app.Fragment r4 = r5.getFragment()
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3, r1)
            throw r2
    }

    void resume() {
            r5 = this;
            r0 = 3
            boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r0)
            java.lang.String r1 = "FragmentManager"
            if (r0 == 0) goto L21
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "moveto RESUMED: "
            java.lang.StringBuilder r0 = r0.append(r2)
            androidx.fragment.app.Fragment r2 = r5.mFragment
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r1, r0)
        L21:
            androidx.fragment.app.Fragment r0 = r5.mFragment
            android.view.View r0 = r0.getFocusedView()
            if (r0 == 0) goto L7f
            boolean r2 = r5.isFragmentViewChild(r0)
            if (r2 == 0) goto L7f
            boolean r2 = r0.requestFocus()
            r3 = 2
            boolean r3 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r3)
            if (r3 == 0) goto L7f
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "requestFocus: Restoring focused view "
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.String r4 = " "
            java.lang.StringBuilder r3 = r3.append(r4)
            if (r2 == 0) goto L54
            java.lang.String r4 = "succeeded"
            goto L56
        L54:
            java.lang.String r4 = "failed"
        L56:
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r4 = " on Fragment "
            java.lang.StringBuilder r3 = r3.append(r4)
            androidx.fragment.app.Fragment r4 = r5.mFragment
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r4 = " resulting in focused view "
            java.lang.StringBuilder r3 = r3.append(r4)
            androidx.fragment.app.Fragment r4 = r5.mFragment
            android.view.View r4 = r4.mView
            android.view.View r4 = r4.findFocus()
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            android.util.Log.v(r1, r3)
        L7f:
            androidx.fragment.app.Fragment r1 = r5.mFragment
            r2 = 0
            r1.setFocusedView(r2)
            androidx.fragment.app.Fragment r1 = r5.mFragment
            r1.performResume()
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r1 = r5.mDispatcher
            androidx.fragment.app.Fragment r3 = r5.mFragment
            r4 = 0
            r1.dispatchOnFragmentResumed(r3, r4)
            androidx.fragment.app.FragmentStore r1 = r5.mFragmentStore
            androidx.fragment.app.Fragment r3 = r5.mFragment
            java.lang.String r3 = r3.mWho
            r1.setSavedState(r3, r2)
            androidx.fragment.app.Fragment r1 = r5.mFragment
            r1.mSavedFragmentState = r2
            androidx.fragment.app.Fragment r1 = r5.mFragment
            r1.mSavedViewState = r2
            androidx.fragment.app.Fragment r1 = r5.mFragment
            r1.mSavedViewRegistryState = r2
            return
    }

    androidx.fragment.app.Fragment.SavedState saveInstanceState() {
            r2 = this;
            androidx.fragment.app.Fragment r0 = r2.mFragment
            int r0 = r0.mState
            r1 = -1
            if (r0 <= r1) goto L11
            androidx.fragment.app.Fragment$SavedState r0 = new androidx.fragment.app.Fragment$SavedState
            android.os.Bundle r1 = r2.saveState()
            r0.<init>(r1)
            return r0
        L11:
            r0 = 0
            return r0
    }

    android.os.Bundle saveState() {
            r7 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            androidx.fragment.app.Fragment r1 = r7.mFragment
            int r1 = r1.mState
            r2 = -1
            if (r1 != r2) goto L19
            androidx.fragment.app.Fragment r1 = r7.mFragment
            android.os.Bundle r1 = r1.mSavedFragmentState
            if (r1 == 0) goto L19
            androidx.fragment.app.Fragment r1 = r7.mFragment
            android.os.Bundle r1 = r1.mSavedFragmentState
            r0.putAll(r1)
        L19:
            androidx.fragment.app.FragmentState r1 = new androidx.fragment.app.FragmentState
            androidx.fragment.app.Fragment r2 = r7.mFragment
            r1.<init>(r2)
            java.lang.String r2 = "state"
            r0.putParcelable(r2, r1)
            androidx.fragment.app.Fragment r2 = r7.mFragment
            int r2 = r2.mState
            if (r2 <= 0) goto L99
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            androidx.fragment.app.Fragment r3 = r7.mFragment
            r3.performSaveInstanceState(r2)
            boolean r3 = r2.isEmpty()
            if (r3 != 0) goto L40
            java.lang.String r3 = "savedInstanceState"
            r0.putBundle(r3, r2)
        L40:
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r3 = r7.mDispatcher
            androidx.fragment.app.Fragment r4 = r7.mFragment
            r5 = 0
            r3.dispatchOnFragmentSaveInstanceState(r4, r2, r5)
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            androidx.fragment.app.Fragment r4 = r7.mFragment
            androidx.savedstate.SavedStateRegistryController r4 = r4.mSavedStateRegistryController
            r4.performSave(r3)
            boolean r4 = r3.isEmpty()
            if (r4 != 0) goto L5f
            java.lang.String r4 = "registryState"
            r0.putBundle(r4, r3)
        L5f:
            androidx.fragment.app.Fragment r4 = r7.mFragment
            androidx.fragment.app.FragmentManager r4 = r4.mChildFragmentManager
            android.os.Bundle r4 = r4.saveAllStateInternal()
            boolean r5 = r4.isEmpty()
            if (r5 != 0) goto L72
            java.lang.String r5 = "childFragmentManager"
            r0.putBundle(r5, r4)
        L72:
            androidx.fragment.app.Fragment r5 = r7.mFragment
            android.view.View r5 = r5.mView
            if (r5 == 0) goto L7b
            r7.saveViewState()
        L7b:
            androidx.fragment.app.Fragment r5 = r7.mFragment
            android.util.SparseArray<android.os.Parcelable> r5 = r5.mSavedViewState
            if (r5 == 0) goto L8a
            androidx.fragment.app.Fragment r5 = r7.mFragment
            android.util.SparseArray<android.os.Parcelable> r5 = r5.mSavedViewState
            java.lang.String r6 = "viewState"
            r0.putSparseParcelableArray(r6, r5)
        L8a:
            androidx.fragment.app.Fragment r5 = r7.mFragment
            android.os.Bundle r5 = r5.mSavedViewRegistryState
            if (r5 == 0) goto L99
            androidx.fragment.app.Fragment r5 = r7.mFragment
            android.os.Bundle r5 = r5.mSavedViewRegistryState
            java.lang.String r6 = "viewRegistryState"
            r0.putBundle(r6, r5)
        L99:
            androidx.fragment.app.Fragment r2 = r7.mFragment
            android.os.Bundle r2 = r2.mArguments
            if (r2 == 0) goto La8
            androidx.fragment.app.Fragment r2 = r7.mFragment
            android.os.Bundle r2 = r2.mArguments
            java.lang.String r3 = "arguments"
            r0.putBundle(r3, r2)
        La8:
            return r0
    }

    void saveViewState() {
            r3 = this;
            androidx.fragment.app.Fragment r0 = r3.mFragment
            android.view.View r0 = r0.mView
            if (r0 != 0) goto L7
            return
        L7:
            r0 = 2
            boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r0)
            if (r0 == 0) goto L36
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Saving view state for fragment "
            java.lang.StringBuilder r0 = r0.append(r1)
            androidx.fragment.app.Fragment r1 = r3.mFragment
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " with view "
            java.lang.StringBuilder r0 = r0.append(r1)
            androidx.fragment.app.Fragment r1 = r3.mFragment
            android.view.View r1 = r1.mView
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.v(r1, r0)
        L36:
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            androidx.fragment.app.Fragment r1 = r3.mFragment
            android.view.View r1 = r1.mView
            r1.saveHierarchyState(r0)
            int r1 = r0.size()
            if (r1 <= 0) goto L4c
            androidx.fragment.app.Fragment r1 = r3.mFragment
            r1.mSavedViewState = r0
        L4c:
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            androidx.fragment.app.Fragment r2 = r3.mFragment
            androidx.fragment.app.FragmentViewLifecycleOwner r2 = r2.mViewLifecycleOwner
            r2.performSave(r1)
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto L62
            androidx.fragment.app.Fragment r2 = r3.mFragment
            r2.mSavedViewRegistryState = r1
        L62:
            return
    }

    void setFragmentManagerState(int r1) {
            r0 = this;
            r0.mFragmentManagerState = r1
            return
    }

    void start() {
            r3 = this;
            r0 = 3
            boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r0)
            if (r0 == 0) goto L21
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "moveto STARTED: "
            java.lang.StringBuilder r0 = r0.append(r1)
            androidx.fragment.app.Fragment r1 = r3.mFragment
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.d(r1, r0)
        L21:
            androidx.fragment.app.Fragment r0 = r3.mFragment
            r0.performStart()
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r0 = r3.mDispatcher
            androidx.fragment.app.Fragment r1 = r3.mFragment
            r2 = 0
            r0.dispatchOnFragmentStarted(r1, r2)
            return
    }

    void stop() {
            r3 = this;
            r0 = 3
            boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r0)
            if (r0 == 0) goto L21
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "movefrom STARTED: "
            java.lang.StringBuilder r0 = r0.append(r1)
            androidx.fragment.app.Fragment r1 = r3.mFragment
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.d(r1, r0)
        L21:
            androidx.fragment.app.Fragment r0 = r3.mFragment
            r0.performStop()
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r0 = r3.mDispatcher
            androidx.fragment.app.Fragment r1 = r3.mFragment
            r2 = 0
            r0.dispatchOnFragmentStopped(r1, r2)
            return
    }
}
