package androidx.fragment.app;

/* JADX INFO: loaded from: classes.dex */
public abstract class FragmentManager implements androidx.fragment.app.FragmentResultOwner {
    private static boolean DEBUG = false;
    private static final java.lang.String EXTRA_CREATED_FILLIN_INTENT = "androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE";
    private static final java.lang.String FRAGMENT_KEY_PREFIX = "fragment_";
    private static final java.lang.String FRAGMENT_MANAGER_STATE_KEY = "state";
    public static final int POP_BACK_STACK_INCLUSIVE = 1;
    private static final java.lang.String RESULT_KEY_PREFIX = "result_";
    private static final java.lang.String SAVED_STATE_KEY = "android:support:fragments";
    public static final java.lang.String TAG = "FragmentManager";
    static boolean USE_PREDICTIVE_BACK;
    java.util.ArrayList<androidx.fragment.app.BackStackRecord> mBackStack;
    java.util.ArrayList<androidx.fragment.app.FragmentManager.OnBackStackChangedListener> mBackStackChangeListeners;
    private final java.util.concurrent.atomic.AtomicInteger mBackStackIndex;
    private final java.util.Map<java.lang.String, androidx.fragment.app.BackStackState> mBackStackStates;
    private androidx.fragment.app.FragmentContainer mContainer;
    private java.util.ArrayList<androidx.fragment.app.Fragment> mCreatedMenus;
    int mCurState;
    private androidx.fragment.app.SpecialEffectsControllerFactory mDefaultSpecialEffectsControllerFactory;
    private boolean mDestroyed;
    private java.lang.Runnable mExecCommit;
    private boolean mExecutingActions;
    private androidx.fragment.app.FragmentFactory mFragmentFactory;
    private final androidx.fragment.app.FragmentStore mFragmentStore;
    boolean mHandlingTransitioningOp;
    private boolean mHavePendingDeferredStart;
    private androidx.fragment.app.FragmentHostCallback<?> mHost;
    private androidx.fragment.app.FragmentFactory mHostFragmentFactory;
    java.util.ArrayDeque<androidx.fragment.app.FragmentManager.LaunchedFragmentInfo> mLaunchedFragments;
    private final androidx.fragment.app.FragmentLayoutInflaterFactory mLayoutInflaterFactory;
    private final androidx.fragment.app.FragmentLifecycleCallbacksDispatcher mLifecycleCallbacksDispatcher;
    private final androidx.core.view.MenuProvider mMenuProvider;
    private boolean mNeedMenuInvalidate;
    private androidx.fragment.app.FragmentManagerViewModel mNonConfig;
    private final java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.FragmentOnAttachListener> mOnAttachListeners;
    private final androidx.activity.OnBackPressedCallback mOnBackPressedCallback;
    private androidx.activity.OnBackPressedDispatcher mOnBackPressedDispatcher;
    private final androidx.core.util.Consumer<android.content.res.Configuration> mOnConfigurationChangedListener;
    private final androidx.core.util.Consumer<androidx.core.app.MultiWindowModeChangedInfo> mOnMultiWindowModeChangedListener;
    private final androidx.core.util.Consumer<androidx.core.app.PictureInPictureModeChangedInfo> mOnPictureInPictureModeChangedListener;
    private final androidx.core.util.Consumer<java.lang.Integer> mOnTrimMemoryListener;
    private androidx.fragment.app.Fragment mParent;
    private final java.util.ArrayList<androidx.fragment.app.FragmentManager.OpGenerator> mPendingActions;
    androidx.fragment.app.Fragment mPrimaryNav;
    private androidx.activity.result.ActivityResultLauncher<java.lang.String[]> mRequestPermissions;
    private final java.util.Map<java.lang.String, androidx.fragment.app.FragmentManager.LifecycleAwareResultListener> mResultListeners;
    private final java.util.Map<java.lang.String, android.os.Bundle> mResults;
    private androidx.fragment.app.SpecialEffectsControllerFactory mSpecialEffectsControllerFactory;
    private androidx.activity.result.ActivityResultLauncher<android.content.Intent> mStartActivityForResult;
    private androidx.activity.result.ActivityResultLauncher<androidx.activity.result.IntentSenderRequest> mStartIntentSenderForResult;
    private boolean mStateSaved;
    private boolean mStopped;
    private androidx.fragment.app.strictmode.FragmentStrictMode.Policy mStrictModePolicy;
    private java.util.ArrayList<androidx.fragment.app.Fragment> mTmpAddedFragments;
    private java.util.ArrayList<java.lang.Boolean> mTmpIsPop;
    private java.util.ArrayList<androidx.fragment.app.BackStackRecord> mTmpRecords;
    androidx.fragment.app.BackStackRecord mTransitioningOp;











    public interface BackStackEntry {
        @java.lang.Deprecated
        java.lang.CharSequence getBreadCrumbShortTitle();

        @java.lang.Deprecated
        int getBreadCrumbShortTitleRes();

        @java.lang.Deprecated
        java.lang.CharSequence getBreadCrumbTitle();

        @java.lang.Deprecated
        int getBreadCrumbTitleRes();

        int getId();

        java.lang.String getName();
    }

    private class ClearBackStackState implements androidx.fragment.app.FragmentManager.OpGenerator {
        private final java.lang.String mName;
        final /* synthetic */ androidx.fragment.app.FragmentManager this$0;

        ClearBackStackState(androidx.fragment.app.FragmentManager r1, java.lang.String r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.mName = r2
                return
        }

        @Override // androidx.fragment.app.FragmentManager.OpGenerator
        public boolean generateOps(java.util.ArrayList<androidx.fragment.app.BackStackRecord> r3, java.util.ArrayList<java.lang.Boolean> r4) {
                r2 = this;
                androidx.fragment.app.FragmentManager r0 = r2.this$0
                java.lang.String r1 = r2.mName
                boolean r0 = r0.clearBackStackState(r3, r4, r1)
                return r0
        }
    }

    static class FragmentIntentSenderContract extends androidx.activity.result.contract.ActivityResultContract<androidx.activity.result.IntentSenderRequest, androidx.activity.result.ActivityResult> {
        FragmentIntentSenderContract() {
                r0 = this;
                r0.<init>()
                return
        }

        /* JADX INFO: renamed from: createIntent, reason: avoid collision after fix types in other method */
        public android.content.Intent createIntent2(android.content.Context r7, androidx.activity.result.IntentSenderRequest r8) {
                r6 = this;
                android.content.Intent r0 = new android.content.Intent
                java.lang.String r1 = "androidx.activity.result.contract.action.INTENT_SENDER_REQUEST"
                r0.<init>(r1)
                android.content.Intent r1 = r8.getFillInIntent()
                if (r1 == 0) goto L42
                java.lang.String r2 = "androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE"
                android.os.Bundle r3 = r1.getBundleExtra(r2)
                if (r3 == 0) goto L42
                r0.putExtra(r2, r3)
                r1.removeExtra(r2)
                java.lang.String r2 = "androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE"
                r4 = 0
                boolean r2 = r1.getBooleanExtra(r2, r4)
                if (r2 == 0) goto L42
                androidx.activity.result.IntentSenderRequest$Builder r2 = new androidx.activity.result.IntentSenderRequest$Builder
                android.content.IntentSender r4 = r8.getIntentSender()
                r2.<init>(r4)
                r4 = 0
                androidx.activity.result.IntentSenderRequest$Builder r2 = r2.setFillInIntent(r4)
                int r4 = r8.getFlagsValues()
                int r5 = r8.getFlagsMask()
                androidx.activity.result.IntentSenderRequest$Builder r2 = r2.setFlags(r4, r5)
                androidx.activity.result.IntentSenderRequest r8 = r2.build()
            L42:
                java.lang.String r2 = "androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST"
                r0.putExtra(r2, r8)
                r2 = 2
                boolean r2 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r2)
                if (r2 == 0) goto L66
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "CreateIntent created the following intent: "
                java.lang.StringBuilder r2 = r2.append(r3)
                java.lang.StringBuilder r2 = r2.append(r0)
                java.lang.String r2 = r2.toString()
                java.lang.String r3 = "FragmentManager"
                android.util.Log.v(r3, r2)
            L66:
                return r0
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ android.content.Intent createIntent(android.content.Context r1, androidx.activity.result.IntentSenderRequest r2) {
                r0 = this;
                androidx.activity.result.IntentSenderRequest r2 = (androidx.activity.result.IntentSenderRequest) r2
                android.content.Intent r1 = r0.createIntent2(r1, r2)
                return r1
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.activity.result.contract.ActivityResultContract
        public androidx.activity.result.ActivityResult parseResult(int r2, android.content.Intent r3) {
                r1 = this;
                androidx.activity.result.ActivityResult r0 = new androidx.activity.result.ActivityResult
                r0.<init>(r2, r3)
                return r0
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public /* bridge */ /* synthetic */ androidx.activity.result.ActivityResult parseResult(int r1, android.content.Intent r2) {
                r0 = this;
                androidx.activity.result.ActivityResult r1 = r0.parseResult(r1, r2)
                return r1
        }
    }

    public static abstract class FragmentLifecycleCallbacks {
        public FragmentLifecycleCallbacks() {
                r0 = this;
                r0.<init>()
                return
        }

        @java.lang.Deprecated
        public void onFragmentActivityCreated(androidx.fragment.app.FragmentManager r1, androidx.fragment.app.Fragment r2, android.os.Bundle r3) {
                r0 = this;
                return
        }

        public void onFragmentAttached(androidx.fragment.app.FragmentManager r1, androidx.fragment.app.Fragment r2, android.content.Context r3) {
                r0 = this;
                return
        }

        public void onFragmentCreated(androidx.fragment.app.FragmentManager r1, androidx.fragment.app.Fragment r2, android.os.Bundle r3) {
                r0 = this;
                return
        }

        public void onFragmentDestroyed(androidx.fragment.app.FragmentManager r1, androidx.fragment.app.Fragment r2) {
                r0 = this;
                return
        }

        public void onFragmentDetached(androidx.fragment.app.FragmentManager r1, androidx.fragment.app.Fragment r2) {
                r0 = this;
                return
        }

        public void onFragmentPaused(androidx.fragment.app.FragmentManager r1, androidx.fragment.app.Fragment r2) {
                r0 = this;
                return
        }

        public void onFragmentPreAttached(androidx.fragment.app.FragmentManager r1, androidx.fragment.app.Fragment r2, android.content.Context r3) {
                r0 = this;
                return
        }

        public void onFragmentPreCreated(androidx.fragment.app.FragmentManager r1, androidx.fragment.app.Fragment r2, android.os.Bundle r3) {
                r0 = this;
                return
        }

        public void onFragmentResumed(androidx.fragment.app.FragmentManager r1, androidx.fragment.app.Fragment r2) {
                r0 = this;
                return
        }

        public void onFragmentSaveInstanceState(androidx.fragment.app.FragmentManager r1, androidx.fragment.app.Fragment r2, android.os.Bundle r3) {
                r0 = this;
                return
        }

        public void onFragmentStarted(androidx.fragment.app.FragmentManager r1, androidx.fragment.app.Fragment r2) {
                r0 = this;
                return
        }

        public void onFragmentStopped(androidx.fragment.app.FragmentManager r1, androidx.fragment.app.Fragment r2) {
                r0 = this;
                return
        }

        public void onFragmentViewCreated(androidx.fragment.app.FragmentManager r1, androidx.fragment.app.Fragment r2, android.view.View r3, android.os.Bundle r4) {
                r0 = this;
                return
        }

        public void onFragmentViewDestroyed(androidx.fragment.app.FragmentManager r1, androidx.fragment.app.Fragment r2) {
                r0 = this;
                return
        }
    }

    static class LaunchedFragmentInfo implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<androidx.fragment.app.FragmentManager.LaunchedFragmentInfo> CREATOR = null;
        int mRequestCode;
        java.lang.String mWho;


        static {
                androidx.fragment.app.FragmentManager$LaunchedFragmentInfo$1 r0 = new androidx.fragment.app.FragmentManager$LaunchedFragmentInfo$1
                r0.<init>()
                androidx.fragment.app.FragmentManager.LaunchedFragmentInfo.CREATOR = r0
                return
        }

        LaunchedFragmentInfo(android.os.Parcel r2) {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = r2.readString()
                r1.mWho = r0
                int r0 = r2.readInt()
                r1.mRequestCode = r0
                return
        }

        LaunchedFragmentInfo(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>()
                r0.mWho = r1
                r0.mRequestCode = r2
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
                java.lang.String r0 = r1.mWho
                r2.writeString(r0)
                int r0 = r1.mRequestCode
                r2.writeInt(r0)
                return
        }
    }

    private static class LifecycleAwareResultListener implements androidx.fragment.app.FragmentResultListener {
        private final androidx.lifecycle.Lifecycle mLifecycle;
        private final androidx.fragment.app.FragmentResultListener mListener;
        private final androidx.lifecycle.LifecycleEventObserver mObserver;

        LifecycleAwareResultListener(androidx.lifecycle.Lifecycle r1, androidx.fragment.app.FragmentResultListener r2, androidx.lifecycle.LifecycleEventObserver r3) {
                r0 = this;
                r0.<init>()
                r0.mLifecycle = r1
                r0.mListener = r2
                r0.mObserver = r3
                return
        }

        public boolean isAtLeast(androidx.lifecycle.Lifecycle.State r2) {
                r1 = this;
                androidx.lifecycle.Lifecycle r0 = r1.mLifecycle
                androidx.lifecycle.Lifecycle$State r0 = r0.getCurrentState()
                boolean r0 = r0.isAtLeast(r2)
                return r0
        }

        @Override // androidx.fragment.app.FragmentResultListener
        public void onFragmentResult(java.lang.String r2, android.os.Bundle r3) {
                r1 = this;
                androidx.fragment.app.FragmentResultListener r0 = r1.mListener
                r0.onFragmentResult(r2, r3)
                return
        }

        public void removeObserver() {
                r2 = this;
                androidx.lifecycle.Lifecycle r0 = r2.mLifecycle
                androidx.lifecycle.LifecycleEventObserver r1 = r2.mObserver
                r0.removeObserver(r1)
                return
        }
    }

    public interface OnBackStackChangedListener {
        default void onBackStackChangeCancelled() {
                r0 = this;
                return
        }

        default void onBackStackChangeCommitted(androidx.fragment.app.Fragment r1, boolean r2) {
                r0 = this;
                return
        }

        default void onBackStackChangeProgressed(androidx.activity.BackEventCompat r1) {
                r0 = this;
                return
        }

        default void onBackStackChangeStarted(androidx.fragment.app.Fragment r1, boolean r2) {
                r0 = this;
                return
        }

        void onBackStackChanged();
    }

    interface OpGenerator {
        boolean generateOps(java.util.ArrayList<androidx.fragment.app.BackStackRecord> r1, java.util.ArrayList<java.lang.Boolean> r2);
    }

    private class PopBackStackState implements androidx.fragment.app.FragmentManager.OpGenerator {
        final int mFlags;
        final int mId;
        final java.lang.String mName;
        final /* synthetic */ androidx.fragment.app.FragmentManager this$0;

        PopBackStackState(androidx.fragment.app.FragmentManager r1, java.lang.String r2, int r3, int r4) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.mName = r2
                r0.mId = r3
                r0.mFlags = r4
                return
        }

        @Override // androidx.fragment.app.FragmentManager.OpGenerator
        public boolean generateOps(java.util.ArrayList<androidx.fragment.app.BackStackRecord> r9, java.util.ArrayList<java.lang.Boolean> r10) {
                r8 = this;
                androidx.fragment.app.FragmentManager r0 = r8.this$0
                androidx.fragment.app.Fragment r0 = r0.mPrimaryNav
                if (r0 == 0) goto L1e
                int r0 = r8.mId
                if (r0 >= 0) goto L1e
                java.lang.String r0 = r8.mName
                if (r0 != 0) goto L1e
                androidx.fragment.app.FragmentManager r0 = r8.this$0
                androidx.fragment.app.Fragment r0 = r0.mPrimaryNav
                androidx.fragment.app.FragmentManager r0 = r0.getChildFragmentManager()
                boolean r1 = r0.popBackStackImmediate()
                if (r1 == 0) goto L1e
                r1 = 0
                return r1
            L1e:
                androidx.fragment.app.FragmentManager r2 = r8.this$0
                java.lang.String r5 = r8.mName
                int r6 = r8.mId
                int r7 = r8.mFlags
                r3 = r9
                r4 = r10
                boolean r9 = r2.popBackStackState(r3, r4, r5, r6, r7)
                return r9
        }
    }

    class PrepareBackStackTransitionState implements androidx.fragment.app.FragmentManager.OpGenerator {
        final /* synthetic */ androidx.fragment.app.FragmentManager this$0;

        PrepareBackStackTransitionState(androidx.fragment.app.FragmentManager r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // androidx.fragment.app.FragmentManager.OpGenerator
        public boolean generateOps(java.util.ArrayList<androidx.fragment.app.BackStackRecord> r8, java.util.ArrayList<java.lang.Boolean> r9) {
                r7 = this;
                androidx.fragment.app.FragmentManager r0 = r7.this$0
                boolean r0 = r0.prepareBackStackState(r8, r9)
                androidx.fragment.app.FragmentManager r1 = r7.this$0
                java.util.ArrayList<androidx.fragment.app.FragmentManager$OnBackStackChangedListener> r1 = r1.mBackStackChangeListeners
                boolean r1 = r1.isEmpty()
                if (r1 != 0) goto L6e
                int r1 = r8.size()
                if (r1 <= 0) goto L6e
                int r1 = r8.size()
                int r1 = r1 + (-1)
                java.lang.Object r1 = r9.get(r1)
                java.lang.Boolean r1 = (java.lang.Boolean) r1
                boolean r1 = r1.booleanValue()
                java.util.LinkedHashSet r2 = new java.util.LinkedHashSet
                r2.<init>()
                java.util.Iterator r3 = r8.iterator()
            L2f:
                boolean r4 = r3.hasNext()
                if (r4 == 0) goto L45
                java.lang.Object r4 = r3.next()
                androidx.fragment.app.BackStackRecord r4 = (androidx.fragment.app.BackStackRecord) r4
                androidx.fragment.app.FragmentManager r5 = r7.this$0
                java.util.Set r5 = r5.fragmentsFromRecord(r4)
                r2.addAll(r5)
                goto L2f
            L45:
                androidx.fragment.app.FragmentManager r3 = r7.this$0
                java.util.ArrayList<androidx.fragment.app.FragmentManager$OnBackStackChangedListener> r3 = r3.mBackStackChangeListeners
                java.util.Iterator r3 = r3.iterator()
            L4d:
                boolean r4 = r3.hasNext()
                if (r4 == 0) goto L6e
                java.lang.Object r4 = r3.next()
                androidx.fragment.app.FragmentManager$OnBackStackChangedListener r4 = (androidx.fragment.app.FragmentManager.OnBackStackChangedListener) r4
                java.util.Iterator r5 = r2.iterator()
            L5d:
                boolean r6 = r5.hasNext()
                if (r6 == 0) goto L6d
                java.lang.Object r6 = r5.next()
                androidx.fragment.app.Fragment r6 = (androidx.fragment.app.Fragment) r6
                r4.onBackStackChangeStarted(r6, r1)
                goto L5d
            L6d:
                goto L4d
            L6e:
                return r0
        }
    }

    private class RestoreBackStackState implements androidx.fragment.app.FragmentManager.OpGenerator {
        private final java.lang.String mName;
        final /* synthetic */ androidx.fragment.app.FragmentManager this$0;

        RestoreBackStackState(androidx.fragment.app.FragmentManager r1, java.lang.String r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.mName = r2
                return
        }

        @Override // androidx.fragment.app.FragmentManager.OpGenerator
        public boolean generateOps(java.util.ArrayList<androidx.fragment.app.BackStackRecord> r3, java.util.ArrayList<java.lang.Boolean> r4) {
                r2 = this;
                androidx.fragment.app.FragmentManager r0 = r2.this$0
                java.lang.String r1 = r2.mName
                boolean r0 = r0.restoreBackStackState(r3, r4, r1)
                return r0
        }
    }

    private class SaveBackStackState implements androidx.fragment.app.FragmentManager.OpGenerator {
        private final java.lang.String mName;
        final /* synthetic */ androidx.fragment.app.FragmentManager this$0;

        SaveBackStackState(androidx.fragment.app.FragmentManager r1, java.lang.String r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.mName = r2
                return
        }

        @Override // androidx.fragment.app.FragmentManager.OpGenerator
        public boolean generateOps(java.util.ArrayList<androidx.fragment.app.BackStackRecord> r3, java.util.ArrayList<java.lang.Boolean> r4) {
                r2 = this;
                androidx.fragment.app.FragmentManager r0 = r2.this$0
                java.lang.String r1 = r2.mName
                boolean r0 = r0.saveBackStackState(r3, r4, r1)
                return r0
        }
    }

    static {
            r0 = 0
            androidx.fragment.app.FragmentManager.DEBUG = r0
            r0 = 1
            androidx.fragment.app.FragmentManager.USE_PREDICTIVE_BACK = r0
            return
    }

    public FragmentManager() {
            r3 = this;
            r3.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.mPendingActions = r0
            androidx.fragment.app.FragmentStore r0 = new androidx.fragment.app.FragmentStore
            r0.<init>()
            r3.mFragmentStore = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.mBackStack = r0
            androidx.fragment.app.FragmentLayoutInflaterFactory r0 = new androidx.fragment.app.FragmentLayoutInflaterFactory
            r0.<init>(r3)
            r3.mLayoutInflaterFactory = r0
            r0 = 0
            r3.mTransitioningOp = r0
            r1 = 0
            r3.mHandlingTransitioningOp = r1
            androidx.fragment.app.FragmentManager$1 r2 = new androidx.fragment.app.FragmentManager$1
            r2.<init>(r3, r1)
            r3.mOnBackPressedCallback = r2
            java.util.concurrent.atomic.AtomicInteger r1 = new java.util.concurrent.atomic.AtomicInteger
            r1.<init>()
            r3.mBackStackIndex = r1
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.util.Map r1 = java.util.Collections.synchronizedMap(r1)
            r3.mBackStackStates = r1
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.util.Map r1 = java.util.Collections.synchronizedMap(r1)
            r3.mResults = r1
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.util.Map r1 = java.util.Collections.synchronizedMap(r1)
            r3.mResultListeners = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r3.mBackStackChangeListeners = r1
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r1 = new androidx.fragment.app.FragmentLifecycleCallbacksDispatcher
            r1.<init>(r3)
            r3.mLifecycleCallbacksDispatcher = r1
            java.util.concurrent.CopyOnWriteArrayList r1 = new java.util.concurrent.CopyOnWriteArrayList
            r1.<init>()
            r3.mOnAttachListeners = r1
            androidx.fragment.app.FragmentManager$$ExternalSyntheticLambda0 r1 = new androidx.fragment.app.FragmentManager$$ExternalSyntheticLambda0
            r1.<init>(r3)
            r3.mOnConfigurationChangedListener = r1
            androidx.fragment.app.FragmentManager$$ExternalSyntheticLambda1 r1 = new androidx.fragment.app.FragmentManager$$ExternalSyntheticLambda1
            r1.<init>(r3)
            r3.mOnTrimMemoryListener = r1
            androidx.fragment.app.FragmentManager$$ExternalSyntheticLambda2 r1 = new androidx.fragment.app.FragmentManager$$ExternalSyntheticLambda2
            r1.<init>(r3)
            r3.mOnMultiWindowModeChangedListener = r1
            androidx.fragment.app.FragmentManager$$ExternalSyntheticLambda3 r1 = new androidx.fragment.app.FragmentManager$$ExternalSyntheticLambda3
            r1.<init>(r3)
            r3.mOnPictureInPictureModeChangedListener = r1
            androidx.fragment.app.FragmentManager$2 r1 = new androidx.fragment.app.FragmentManager$2
            r1.<init>(r3)
            r3.mMenuProvider = r1
            r1 = -1
            r3.mCurState = r1
            r3.mFragmentFactory = r0
            androidx.fragment.app.FragmentManager$3 r1 = new androidx.fragment.app.FragmentManager$3
            r1.<init>(r3)
            r3.mHostFragmentFactory = r1
            r3.mSpecialEffectsControllerFactory = r0
            androidx.fragment.app.FragmentManager$4 r0 = new androidx.fragment.app.FragmentManager$4
            r0.<init>(r3)
            r3.mDefaultSpecialEffectsControllerFactory = r0
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>()
            r3.mLaunchedFragments = r0
            androidx.fragment.app.FragmentManager$5 r0 = new androidx.fragment.app.FragmentManager$5
            r0.<init>(r3)
            r3.mExecCommit = r0
            return
    }

    static /* synthetic */ void access$000(androidx.fragment.app.FragmentManager r0) {
            r0.endAnimatingAwayFragments()
            return
    }

    static /* synthetic */ java.util.Map access$100(androidx.fragment.app.FragmentManager r1) {
            java.util.Map<java.lang.String, android.os.Bundle> r0 = r1.mResults
            return r0
    }

    static /* synthetic */ java.util.Map access$200(androidx.fragment.app.FragmentManager r1) {
            java.util.Map<java.lang.String, androidx.fragment.app.FragmentManager$LifecycleAwareResultListener> r0 = r1.mResultListeners
            return r0
    }

    static /* synthetic */ androidx.fragment.app.FragmentStore access$300(androidx.fragment.app.FragmentManager r1) {
            androidx.fragment.app.FragmentStore r0 = r1.mFragmentStore
            return r0
    }

    private void checkStateLoss() {
            r2 = this;
            boolean r0 = r2.isStateSaved()
            if (r0 != 0) goto L7
            return
        L7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Can not perform this action after onSaveInstanceState"
            r0.<init>(r1)
            throw r0
    }

    private void cleanupExec() {
            r1 = this;
            r0 = 0
            r1.mExecutingActions = r0
            java.util.ArrayList<java.lang.Boolean> r0 = r1.mTmpIsPop
            r0.clear()
            java.util.ArrayList<androidx.fragment.app.BackStackRecord> r0 = r1.mTmpRecords
            r0.clear()
            return
    }

    private void clearBackStackStateViewModels() {
            r7 = this;
            androidx.fragment.app.FragmentHostCallback<?> r0 = r7.mHost
            boolean r0 = r0 instanceof androidx.lifecycle.ViewModelStoreOwner
            if (r0 == 0) goto L11
            androidx.fragment.app.FragmentStore r0 = r7.mFragmentStore
            androidx.fragment.app.FragmentManagerViewModel r0 = r0.getNonConfig()
            boolean r0 = r0.isCleared()
            goto L2c
        L11:
            androidx.fragment.app.FragmentHostCallback<?> r0 = r7.mHost
            android.content.Context r0 = r0.getContext()
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L2b
            androidx.fragment.app.FragmentHostCallback<?> r0 = r7.mHost
            android.content.Context r0 = r0.getContext()
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r1 = r0.isChangingConfigurations()
            r1 = r1 ^ 1
            r0 = r1
            goto L2c
        L2b:
            r0 = 1
        L2c:
            if (r0 == 0) goto L62
            java.util.Map<java.lang.String, androidx.fragment.app.BackStackState> r1 = r7.mBackStackStates
            java.util.Collection r1 = r1.values()
            java.util.Iterator r1 = r1.iterator()
        L38:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L62
            java.lang.Object r2 = r1.next()
            androidx.fragment.app.BackStackState r2 = (androidx.fragment.app.BackStackState) r2
            java.util.List<java.lang.String> r3 = r2.mFragments
            java.util.Iterator r3 = r3.iterator()
        L4a:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L61
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            androidx.fragment.app.FragmentStore r5 = r7.mFragmentStore
            androidx.fragment.app.FragmentManagerViewModel r5 = r5.getNonConfig()
            r6 = 0
            r5.clearNonConfigState(r4, r6)
            goto L4a
        L61:
            goto L38
        L62:
            return
    }

    private java.util.Set<androidx.fragment.app.SpecialEffectsController> collectAllSpecialEffectsController() {
            r5 = this;
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            androidx.fragment.app.FragmentStore r1 = r5.mFragmentStore
            java.util.List r1 = r1.getActiveFragmentStateManagers()
            java.util.Iterator r1 = r1.iterator()
        Lf:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L30
            java.lang.Object r2 = r1.next()
            androidx.fragment.app.FragmentStateManager r2 = (androidx.fragment.app.FragmentStateManager) r2
            androidx.fragment.app.Fragment r3 = r2.getFragment()
            android.view.ViewGroup r3 = r3.mContainer
            if (r3 == 0) goto L2f
        L24:
            androidx.fragment.app.SpecialEffectsControllerFactory r4 = r5.getSpecialEffectsControllerFactory()
            androidx.fragment.app.SpecialEffectsController r4 = androidx.fragment.app.SpecialEffectsController.getOrCreateController(r3, r4)
            r0.add(r4)
        L2f:
            goto Lf
        L30:
            return r0
    }

    private void dispatchParentPrimaryNavigationFragmentChanged(androidx.fragment.app.Fragment r2) {
            r1 = this;
            if (r2 == 0) goto L11
            java.lang.String r0 = r2.mWho
            androidx.fragment.app.Fragment r0 = r1.findActiveFragment(r0)
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L11
            r2.performPrimaryNavigationFragmentChanged()
        L11:
            return
    }

    private void dispatchStateChange(int r6) {
            r5 = this;
            r0 = 1
            r1 = 0
            r5.mExecutingActions = r0     // Catch: java.lang.Throwable -> L2b
            androidx.fragment.app.FragmentStore r2 = r5.mFragmentStore     // Catch: java.lang.Throwable -> L2b
            r2.dispatchStateChange(r6)     // Catch: java.lang.Throwable -> L2b
            r5.moveToState(r6, r1)     // Catch: java.lang.Throwable -> L2b
            java.util.Set r2 = r5.collectAllSpecialEffectsController()     // Catch: java.lang.Throwable -> L2b
            java.util.Iterator r3 = r2.iterator()     // Catch: java.lang.Throwable -> L2b
        L14:
            boolean r4 = r3.hasNext()     // Catch: java.lang.Throwable -> L2b
            if (r4 == 0) goto L24
            java.lang.Object r4 = r3.next()     // Catch: java.lang.Throwable -> L2b
            androidx.fragment.app.SpecialEffectsController r4 = (androidx.fragment.app.SpecialEffectsController) r4     // Catch: java.lang.Throwable -> L2b
            r4.forceCompleteAllOperations()     // Catch: java.lang.Throwable -> L2b
            goto L14
        L24:
            r5.mExecutingActions = r1
            r5.execPendingActions(r0)
            return
        L2b:
            r0 = move-exception
            r5.mExecutingActions = r1
            throw r0
    }

    private void doPendingDeferredStart() {
            r1 = this;
            boolean r0 = r1.mHavePendingDeferredStart
            if (r0 == 0) goto La
            r0 = 0
            r1.mHavePendingDeferredStart = r0
            r1.startPendingDeferredFragments()
        La:
            return
    }

    @java.lang.Deprecated
    public static void enableDebugLogging(boolean r0) {
            androidx.fragment.app.FragmentManager.DEBUG = r0
            return
    }

    public static void enablePredictiveBack(boolean r0) {
            androidx.fragment.app.FragmentManager.USE_PREDICTIVE_BACK = r0
            return
    }

    private void endAnimatingAwayFragments() {
            r3 = this;
            java.util.Set r0 = r3.collectAllSpecialEffectsController()
            java.util.Iterator r1 = r0.iterator()
        L8:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L18
            java.lang.Object r2 = r1.next()
            androidx.fragment.app.SpecialEffectsController r2 = (androidx.fragment.app.SpecialEffectsController) r2
            r2.forceCompleteAllOperations()
            goto L8
        L18:
            return
    }

    private void ensureExecReady(boolean r3) {
            r2 = this;
            boolean r0 = r2.mExecutingActions
            if (r0 != 0) goto L4c
            androidx.fragment.app.FragmentHostCallback<?> r0 = r2.mHost
            if (r0 != 0) goto L1c
            boolean r0 = r2.mDestroyed
            if (r0 == 0) goto L14
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "FragmentManager has been destroyed"
            r0.<init>(r1)
            throw r0
        L14:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "FragmentManager has not been attached to a host."
            r0.<init>(r1)
            throw r0
        L1c:
            android.os.Looper r0 = android.os.Looper.myLooper()
            androidx.fragment.app.FragmentHostCallback<?> r1 = r2.mHost
            android.os.Handler r1 = r1.getHandler()
            android.os.Looper r1 = r1.getLooper()
            if (r0 != r1) goto L44
            if (r3 != 0) goto L31
            r2.checkStateLoss()
        L31:
            java.util.ArrayList<androidx.fragment.app.BackStackRecord> r0 = r2.mTmpRecords
            if (r0 != 0) goto L43
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.mTmpRecords = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.mTmpIsPop = r0
        L43:
            return
        L44:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Must be called from main thread of fragment host"
            r0.<init>(r1)
            throw r0
        L4c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "FragmentManager is already executing transactions"
            r0.<init>(r1)
            throw r0
    }

    private static void executeOps(java.util.ArrayList<androidx.fragment.app.BackStackRecord> r4, java.util.ArrayList<java.lang.Boolean> r5, int r6, int r7) {
            r0 = r6
        L1:
            if (r0 >= r7) goto L27
            java.lang.Object r1 = r4.get(r0)
            androidx.fragment.app.BackStackRecord r1 = (androidx.fragment.app.BackStackRecord) r1
            java.lang.Object r2 = r5.get(r0)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L1d
            r3 = -1
            r1.bumpBackStackNesting(r3)
            r1.executePopOps()
            goto L24
        L1d:
            r3 = 1
            r1.bumpBackStackNesting(r3)
            r1.executeOps()
        L24:
            int r0 = r0 + 1
            goto L1
        L27:
            return
    }

    private void executeOpsTogether(java.util.ArrayList<androidx.fragment.app.BackStackRecord> r12, java.util.ArrayList<java.lang.Boolean> r13, int r14, int r15) {
            r11 = this;
            java.lang.Object r0 = r12.get(r14)
            androidx.fragment.app.BackStackRecord r0 = (androidx.fragment.app.BackStackRecord) r0
            boolean r0 = r0.mReorderingAllowed
            r1 = 0
            java.util.ArrayList<androidx.fragment.app.Fragment> r2 = r11.mTmpAddedFragments
            if (r2 != 0) goto L15
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r11.mTmpAddedFragments = r2
            goto L1a
        L15:
            java.util.ArrayList<androidx.fragment.app.Fragment> r2 = r11.mTmpAddedFragments
            r2.clear()
        L1a:
            java.util.ArrayList<androidx.fragment.app.Fragment> r2 = r11.mTmpAddedFragments
            androidx.fragment.app.FragmentStore r3 = r11.mFragmentStore
            java.util.List r3 = r3.getFragments()
            r2.addAll(r3)
            androidx.fragment.app.Fragment r2 = r11.getPrimaryNavigationFragment()
            r3 = r14
        L2a:
            r4 = 1
            if (r3 >= r15) goto L58
            java.lang.Object r5 = r12.get(r3)
            androidx.fragment.app.BackStackRecord r5 = (androidx.fragment.app.BackStackRecord) r5
            java.lang.Object r6 = r13.get(r3)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 != 0) goto L46
            java.util.ArrayList<androidx.fragment.app.Fragment> r7 = r11.mTmpAddedFragments
            androidx.fragment.app.Fragment r2 = r5.expandOps(r7, r2)
            goto L4c
        L46:
            java.util.ArrayList<androidx.fragment.app.Fragment> r7 = r11.mTmpAddedFragments
            androidx.fragment.app.Fragment r2 = r5.trackAddedFragmentsInPop(r7, r2)
        L4c:
            if (r1 != 0) goto L54
            boolean r7 = r5.mAddToBackStack
            if (r7 == 0) goto L53
            goto L54
        L53:
            r4 = 0
        L54:
            r1 = r4
            int r3 = r3 + 1
            goto L2a
        L58:
            java.util.ArrayList<androidx.fragment.app.Fragment> r3 = r11.mTmpAddedFragments
            r3.clear()
            if (r0 != 0) goto L94
            int r3 = r11.mCurState
            if (r3 < r4) goto L94
            r3 = r14
        L64:
            if (r3 >= r15) goto L94
            java.lang.Object r5 = r12.get(r3)
            androidx.fragment.app.BackStackRecord r5 = (androidx.fragment.app.BackStackRecord) r5
            java.util.ArrayList<androidx.fragment.app.FragmentTransaction$Op> r6 = r5.mOps
            java.util.Iterator r6 = r6.iterator()
        L72:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L91
            java.lang.Object r7 = r6.next()
            androidx.fragment.app.FragmentTransaction$Op r7 = (androidx.fragment.app.FragmentTransaction.Op) r7
            androidx.fragment.app.Fragment r8 = r7.mFragment
            if (r8 == 0) goto L90
            androidx.fragment.app.FragmentManager r9 = r8.mFragmentManager
            if (r9 == 0) goto L90
        L87:
            androidx.fragment.app.FragmentStateManager r9 = r11.createOrGetFragmentStateManager(r8)
            androidx.fragment.app.FragmentStore r10 = r11.mFragmentStore
            r10.makeActive(r9)
        L90:
            goto L72
        L91:
            int r3 = r3 + 1
            goto L64
        L94:
            executeOps(r12, r13, r14, r15)
            int r3 = r15 + (-1)
            java.lang.Object r3 = r13.get(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r1 == 0) goto L11c
            java.util.ArrayList<androidx.fragment.app.FragmentManager$OnBackStackChangedListener> r5 = r11.mBackStackChangeListeners
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L11c
            java.util.LinkedHashSet r5 = new java.util.LinkedHashSet
            r5.<init>()
            java.util.Iterator r6 = r12.iterator()
        Lb6:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto Lca
            java.lang.Object r7 = r6.next()
            androidx.fragment.app.BackStackRecord r7 = (androidx.fragment.app.BackStackRecord) r7
            java.util.Set r8 = r11.fragmentsFromRecord(r7)
            r5.addAll(r8)
            goto Lb6
        Lca:
            androidx.fragment.app.BackStackRecord r6 = r11.mTransitioningOp
            if (r6 != 0) goto L11c
            java.util.ArrayList<androidx.fragment.app.FragmentManager$OnBackStackChangedListener> r6 = r11.mBackStackChangeListeners
            java.util.Iterator r6 = r6.iterator()
        Ld4:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto Lf5
            java.lang.Object r7 = r6.next()
            androidx.fragment.app.FragmentManager$OnBackStackChangedListener r7 = (androidx.fragment.app.FragmentManager.OnBackStackChangedListener) r7
            java.util.Iterator r8 = r5.iterator()
        Le4:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto Lf4
            java.lang.Object r9 = r8.next()
            androidx.fragment.app.Fragment r9 = (androidx.fragment.app.Fragment) r9
            r7.onBackStackChangeStarted(r9, r3)
            goto Le4
        Lf4:
            goto Ld4
        Lf5:
            java.util.ArrayList<androidx.fragment.app.FragmentManager$OnBackStackChangedListener> r6 = r11.mBackStackChangeListeners
            java.util.Iterator r6 = r6.iterator()
        Lfb:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L11c
            java.lang.Object r7 = r6.next()
            androidx.fragment.app.FragmentManager$OnBackStackChangedListener r7 = (androidx.fragment.app.FragmentManager.OnBackStackChangedListener) r7
            java.util.Iterator r8 = r5.iterator()
        L10b:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L11b
            java.lang.Object r9 = r8.next()
            androidx.fragment.app.Fragment r9 = (androidx.fragment.app.Fragment) r9
            r7.onBackStackChangeCommitted(r9, r3)
            goto L10b
        L11b:
            goto Lfb
        L11c:
            r5 = r14
        L11d:
            if (r5 >= r15) goto L16a
            java.lang.Object r6 = r12.get(r5)
            androidx.fragment.app.BackStackRecord r6 = (androidx.fragment.app.BackStackRecord) r6
            if (r3 == 0) goto L148
            java.util.ArrayList<androidx.fragment.app.FragmentTransaction$Op> r7 = r6.mOps
            int r7 = r7.size()
            int r7 = r7 - r4
        L12e:
            if (r7 < 0) goto L147
            java.util.ArrayList<androidx.fragment.app.FragmentTransaction$Op> r8 = r6.mOps
            java.lang.Object r8 = r8.get(r7)
            androidx.fragment.app.FragmentTransaction$Op r8 = (androidx.fragment.app.FragmentTransaction.Op) r8
            androidx.fragment.app.Fragment r9 = r8.mFragment
            if (r9 == 0) goto L144
        L13d:
            androidx.fragment.app.FragmentStateManager r10 = r11.createOrGetFragmentStateManager(r9)
            r10.moveToExpectedState()
        L144:
            int r7 = r7 + (-1)
            goto L12e
        L147:
            goto L167
        L148:
            java.util.ArrayList<androidx.fragment.app.FragmentTransaction$Op> r7 = r6.mOps
            java.util.Iterator r7 = r7.iterator()
        L14e:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L167
            java.lang.Object r8 = r7.next()
            androidx.fragment.app.FragmentTransaction$Op r8 = (androidx.fragment.app.FragmentTransaction.Op) r8
            androidx.fragment.app.Fragment r9 = r8.mFragment
            if (r9 == 0) goto L166
        L15f:
            androidx.fragment.app.FragmentStateManager r10 = r11.createOrGetFragmentStateManager(r9)
            r10.moveToExpectedState()
        L166:
            goto L14e
        L167:
            int r5 = r5 + 1
            goto L11d
        L16a:
            int r5 = r11.mCurState
            r11.moveToState(r5, r4)
            java.util.Set r4 = r11.collectChangedControllers(r12, r14, r15)
            java.util.Iterator r5 = r4.iterator()
        L177:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L18d
            java.lang.Object r6 = r5.next()
            androidx.fragment.app.SpecialEffectsController r6 = (androidx.fragment.app.SpecialEffectsController) r6
            r6.updateOperationDirection(r3)
            r6.markPostponedState()
            r6.executePendingOperations()
            goto L177
        L18d:
            r5 = r14
        L18e:
            if (r5 >= r15) goto L1af
            java.lang.Object r6 = r12.get(r5)
            androidx.fragment.app.BackStackRecord r6 = (androidx.fragment.app.BackStackRecord) r6
            java.lang.Object r7 = r13.get(r5)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r3 = r7.booleanValue()
            if (r3 == 0) goto L1a9
            int r7 = r6.mIndex
            if (r7 < 0) goto L1a9
            r7 = -1
            r6.mIndex = r7
        L1a9:
            r6.runOnCommitRunnables()
            int r5 = r5 + 1
            goto L18e
        L1af:
            if (r1 == 0) goto L1b4
            r11.reportBackStackChanged()
        L1b4:
            return
    }

    private int findBackStackIndex(java.lang.String r5, int r6, boolean r7) {
            r4 = this;
            java.util.ArrayList<androidx.fragment.app.BackStackRecord> r0 = r4.mBackStack
            boolean r0 = r0.isEmpty()
            r1 = -1
            if (r0 == 0) goto La
            return r1
        La:
            if (r5 != 0) goto L1b
            if (r6 >= 0) goto L1b
            if (r7 == 0) goto L12
            r0 = 0
            return r0
        L12:
            java.util.ArrayList<androidx.fragment.app.BackStackRecord> r0 = r4.mBackStack
            int r0 = r0.size()
            int r0 = r0 + (-1)
            return r0
        L1b:
            java.util.ArrayList<androidx.fragment.app.BackStackRecord> r0 = r4.mBackStack
            int r0 = r0.size()
            int r0 = r0 + (-1)
        L23:
            if (r0 < 0) goto L45
            java.util.ArrayList<androidx.fragment.app.BackStackRecord> r2 = r4.mBackStack
            java.lang.Object r2 = r2.get(r0)
            androidx.fragment.app.BackStackRecord r2 = (androidx.fragment.app.BackStackRecord) r2
            if (r5 == 0) goto L3a
            java.lang.String r3 = r2.getName()
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L3a
            goto L45
        L3a:
            if (r6 < 0) goto L41
            int r3 = r2.mIndex
            if (r6 != r3) goto L41
            goto L45
        L41:
            int r0 = r0 + (-1)
            goto L23
        L45:
            if (r0 >= 0) goto L48
            return r0
        L48:
            if (r7 == 0) goto L6b
        L4a:
            if (r0 <= 0) goto L78
            java.util.ArrayList<androidx.fragment.app.BackStackRecord> r1 = r4.mBackStack
            int r2 = r0 + (-1)
            java.lang.Object r1 = r1.get(r2)
            androidx.fragment.app.BackStackRecord r1 = (androidx.fragment.app.BackStackRecord) r1
            if (r5 == 0) goto L62
            java.lang.String r2 = r1.getName()
            boolean r2 = r5.equals(r2)
            if (r2 != 0) goto L68
        L62:
            if (r6 < 0) goto L78
            int r2 = r1.mIndex
            if (r6 != r2) goto L78
        L68:
            int r0 = r0 + (-1)
            goto L4a
        L6b:
            java.util.ArrayList<androidx.fragment.app.BackStackRecord> r2 = r4.mBackStack
            int r2 = r2.size()
            int r2 = r2 + (-1)
            if (r0 != r2) goto L76
            return r1
        L76:
            int r0 = r0 + 1
        L78:
            return r0
    }

    public static <F extends androidx.fragment.app.Fragment> F findFragment(android.view.View r4) {
            androidx.fragment.app.Fragment r0 = findViewFragment(r4)
            if (r0 == 0) goto L7
            return r0
        L7:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "View "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r4)
            java.lang.String r3 = " does not have a Fragment set"
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    public static androidx.fragment.app.FragmentManager findFragmentManager(android.view.View r6) {
            androidx.fragment.app.Fragment r0 = findViewFragment(r6)
            if (r0 == 0) goto L3a
            boolean r1 = r0.isAdded()
            if (r1 == 0) goto L11
            androidx.fragment.app.FragmentManager r1 = r0.getChildFragmentManager()
            goto L5a
        L11:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "The Fragment "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r0)
            java.lang.String r3 = " that owns View "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r6)
            java.lang.String r3 = " has already been destroyed. Nested fragments should always use the child FragmentManager."
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L3a:
            android.content.Context r1 = r6.getContext()
            r2 = 0
        L3f:
            boolean r3 = r1 instanceof android.content.ContextWrapper
            if (r3 == 0) goto L53
            boolean r3 = r1 instanceof androidx.fragment.app.FragmentActivity
            if (r3 == 0) goto L4b
            r2 = r1
            androidx.fragment.app.FragmentActivity r2 = (androidx.fragment.app.FragmentActivity) r2
            goto L53
        L4b:
            r3 = r1
            android.content.ContextWrapper r3 = (android.content.ContextWrapper) r3
            android.content.Context r1 = r3.getBaseContext()
            goto L3f
        L53:
            if (r2 == 0) goto L5b
            androidx.fragment.app.FragmentManager r3 = r2.getSupportFragmentManager()
            r1 = r3
        L5a:
            return r1
        L5b:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "View "
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.StringBuilder r4 = r4.append(r6)
            java.lang.String r5 = " is not within a subclass of FragmentActivity."
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
    }

    static androidx.fragment.app.Fragment findViewFragment(android.view.View r4) {
        L1:
            r0 = 0
            if (r4 == 0) goto L18
            androidx.fragment.app.Fragment r1 = getViewFragment(r4)
            if (r1 == 0) goto Lb
            return r1
        Lb:
            android.view.ViewParent r2 = r4.getParent()
            boolean r3 = r2 instanceof android.view.View
            if (r3 == 0) goto L16
            r0 = r2
            android.view.View r0 = (android.view.View) r0
        L16:
            r4 = r0
            goto L1
        L18:
            return r0
    }

    private void forcePostponedTransactions() {
            r3 = this;
            java.util.Set r0 = r3.collectAllSpecialEffectsController()
            java.util.Iterator r1 = r0.iterator()
        L8:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L18
            java.lang.Object r2 = r1.next()
            androidx.fragment.app.SpecialEffectsController r2 = (androidx.fragment.app.SpecialEffectsController) r2
            r2.forcePostponedExecutePendingOperations()
            goto L8
        L18:
            return
    }

    private boolean generateOpsForPendingActions(java.util.ArrayList<androidx.fragment.app.BackStackRecord> r6, java.util.ArrayList<java.lang.Boolean> r7) {
            r5 = this;
            r0 = 0
            java.util.ArrayList<androidx.fragment.app.FragmentManager$OpGenerator> r1 = r5.mPendingActions
            monitor-enter(r1)
            java.util.ArrayList<androidx.fragment.app.FragmentManager$OpGenerator> r2 = r5.mPendingActions     // Catch: java.lang.Throwable -> L4e
            boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> L4e
            if (r2 == 0) goto Lf
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L4e
            r1 = 0
            return r1
        Lf:
            java.util.ArrayList<androidx.fragment.app.FragmentManager$OpGenerator> r2 = r5.mPendingActions     // Catch: java.lang.Throwable -> L3b
            int r2 = r2.size()     // Catch: java.lang.Throwable -> L3b
            r3 = 0
        L16:
            if (r3 >= r2) goto L28
            java.util.ArrayList<androidx.fragment.app.FragmentManager$OpGenerator> r4 = r5.mPendingActions     // Catch: java.lang.Throwable -> L3b
            java.lang.Object r4 = r4.get(r3)     // Catch: java.lang.Throwable -> L3b
            androidx.fragment.app.FragmentManager$OpGenerator r4 = (androidx.fragment.app.FragmentManager.OpGenerator) r4     // Catch: java.lang.Throwable -> L3b
            boolean r4 = r4.generateOps(r6, r7)     // Catch: java.lang.Throwable -> L3b
            r0 = r0 | r4
            int r3 = r3 + 1
            goto L16
        L28:
            java.util.ArrayList<androidx.fragment.app.FragmentManager$OpGenerator> r2 = r5.mPendingActions     // Catch: java.lang.Throwable -> L4e
            r2.clear()     // Catch: java.lang.Throwable -> L4e
            androidx.fragment.app.FragmentHostCallback<?> r2 = r5.mHost     // Catch: java.lang.Throwable -> L4e
            android.os.Handler r2 = r2.getHandler()     // Catch: java.lang.Throwable -> L4e
            java.lang.Runnable r3 = r5.mExecCommit     // Catch: java.lang.Throwable -> L4e
            r2.removeCallbacks(r3)     // Catch: java.lang.Throwable -> L4e
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L4e
            return r0
        L3b:
            r2 = move-exception
            java.util.ArrayList<androidx.fragment.app.FragmentManager$OpGenerator> r3 = r5.mPendingActions     // Catch: java.lang.Throwable -> L4e
            r3.clear()     // Catch: java.lang.Throwable -> L4e
            androidx.fragment.app.FragmentHostCallback<?> r3 = r5.mHost     // Catch: java.lang.Throwable -> L4e
            android.os.Handler r3 = r3.getHandler()     // Catch: java.lang.Throwable -> L4e
            java.lang.Runnable r4 = r5.mExecCommit     // Catch: java.lang.Throwable -> L4e
            r3.removeCallbacks(r4)     // Catch: java.lang.Throwable -> L4e
            throw r2     // Catch: java.lang.Throwable -> L4e
        L4e:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L4e
            throw r2
    }

    private androidx.fragment.app.FragmentManagerViewModel getChildNonConfig(androidx.fragment.app.Fragment r2) {
            r1 = this;
            androidx.fragment.app.FragmentManagerViewModel r0 = r1.mNonConfig
            androidx.fragment.app.FragmentManagerViewModel r0 = r0.getChildNonConfig(r2)
            return r0
    }

    private android.view.ViewGroup getFragmentContainer(androidx.fragment.app.Fragment r4) {
            r3 = this;
            android.view.ViewGroup r0 = r4.mContainer
            if (r0 == 0) goto L7
            android.view.ViewGroup r0 = r4.mContainer
            return r0
        L7:
            int r0 = r4.mContainerId
            r1 = 0
            if (r0 > 0) goto Ld
            return r1
        Ld:
            androidx.fragment.app.FragmentContainer r0 = r3.mContainer
            boolean r0 = r0.onHasView()
            if (r0 == 0) goto L25
            androidx.fragment.app.FragmentContainer r0 = r3.mContainer
            int r2 = r4.mContainerId
            android.view.View r0 = r0.onFindViewById(r2)
            boolean r2 = r0 instanceof android.view.ViewGroup
            if (r2 == 0) goto L25
            r1 = r0
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            return r1
        L25:
            return r1
    }

    static androidx.fragment.app.Fragment getViewFragment(android.view.View r2) {
            int r0 = androidx.fragment.R.id.fragment_container_view_tag
            java.lang.Object r0 = r2.getTag(r0)
            boolean r1 = r0 instanceof androidx.fragment.app.Fragment
            if (r1 == 0) goto Le
            r1 = r0
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            return r1
        Le:
            r1 = 0
            return r1
    }

    public static boolean isLoggingEnabled(int r1) {
            boolean r0 = androidx.fragment.app.FragmentManager.DEBUG
            if (r0 != 0) goto Lf
            java.lang.String r0 = "FragmentManager"
            boolean r0 = android.util.Log.isLoggable(r0, r1)
            if (r0 == 0) goto Ld
            goto Lf
        Ld:
            r0 = 0
            goto L10
        Lf:
            r0 = 1
        L10:
            return r0
    }

    private boolean isMenuAvailable(androidx.fragment.app.Fragment r2) {
            r1 = this;
            boolean r0 = r2.mHasMenu
            if (r0 == 0) goto L8
            boolean r0 = r2.mMenuVisible
            if (r0 != 0) goto L10
        L8:
            androidx.fragment.app.FragmentManager r0 = r2.mChildFragmentManager
            boolean r0 = r0.checkForMenus()
            if (r0 == 0) goto L12
        L10:
            r0 = 1
            goto L13
        L12:
            r0 = 0
        L13:
            return r0
    }

    private boolean isParentAdded() {
            r2 = this;
            androidx.fragment.app.Fragment r0 = r2.mParent
            r1 = 1
            if (r0 != 0) goto L6
            return r1
        L6:
            androidx.fragment.app.Fragment r0 = r2.mParent
            boolean r0 = r0.isAdded()
            if (r0 == 0) goto L1b
            androidx.fragment.app.Fragment r0 = r2.mParent
            androidx.fragment.app.FragmentManager r0 = r0.getParentFragmentManager()
            boolean r0 = r0.isParentAdded()
            if (r0 == 0) goto L1b
            goto L1c
        L1b:
            r1 = 0
        L1c:
            return r1
    }

    private boolean popBackStackImmediate(java.lang.String r10, int r11, int r12) {
            r9 = this;
            r0 = 0
            r9.execPendingActions(r0)
            r0 = 1
            r9.ensureExecReady(r0)
            androidx.fragment.app.Fragment r1 = r9.mPrimaryNav
            if (r1 == 0) goto L1d
            if (r11 >= 0) goto L1d
            if (r10 != 0) goto L1d
            androidx.fragment.app.Fragment r1 = r9.mPrimaryNav
            androidx.fragment.app.FragmentManager r1 = r1.getChildFragmentManager()
            boolean r2 = r1.popBackStackImmediate()
            if (r2 == 0) goto L1d
            return r0
        L1d:
            java.util.ArrayList<androidx.fragment.app.BackStackRecord> r4 = r9.mTmpRecords
            java.util.ArrayList<java.lang.Boolean> r5 = r9.mTmpIsPop
            r3 = r9
            r6 = r10
            r7 = r11
            r8 = r12
            boolean r10 = r3.popBackStackState(r4, r5, r6, r7, r8)
            if (r10 == 0) goto L3e
            r3.mExecutingActions = r0
            java.util.ArrayList<androidx.fragment.app.BackStackRecord> r11 = r3.mTmpRecords     // Catch: java.lang.Throwable -> L38
            java.util.ArrayList<java.lang.Boolean> r12 = r3.mTmpIsPop     // Catch: java.lang.Throwable -> L38
            r9.removeRedundantOperationsAndExecute(r11, r12)     // Catch: java.lang.Throwable -> L38
            r9.cleanupExec()
            goto L3e
        L38:
            r0 = move-exception
            r11 = r0
            r9.cleanupExec()
            throw r11
        L3e:
            r9.updateOnBackPressedCallbackEnabled()
            r9.doPendingDeferredStart()
            androidx.fragment.app.FragmentStore r11 = r3.mFragmentStore
            r11.burpActive()
            return r10
    }

    private void removeRedundantOperationsAndExecute(java.util.ArrayList<androidx.fragment.app.BackStackRecord> r7, java.util.ArrayList<java.lang.Boolean> r8) {
            r6 = this;
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L7
            return
        L7:
            int r0 = r7.size()
            int r1 = r8.size()
            if (r0 != r1) goto L60
            int r0 = r7.size()
            r1 = 0
            r2 = 0
        L17:
            if (r2 >= r0) goto L5a
            java.lang.Object r3 = r7.get(r2)
            androidx.fragment.app.BackStackRecord r3 = (androidx.fragment.app.BackStackRecord) r3
            boolean r3 = r3.mReorderingAllowed
            if (r3 != 0) goto L57
            if (r1 == r2) goto L28
            r6.executeOpsTogether(r7, r8, r1, r2)
        L28:
            int r4 = r2 + 1
            java.lang.Object r5 = r8.get(r2)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L51
        L36:
            if (r4 >= r0) goto L51
            java.lang.Object r5 = r8.get(r4)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L51
            java.lang.Object r5 = r7.get(r4)
            androidx.fragment.app.BackStackRecord r5 = (androidx.fragment.app.BackStackRecord) r5
            boolean r5 = r5.mReorderingAllowed
            if (r5 != 0) goto L51
            int r4 = r4 + 1
            goto L36
        L51:
            r6.executeOpsTogether(r7, r8, r2, r4)
            r1 = r4
            int r2 = r4 + (-1)
        L57:
            int r2 = r2 + 1
            goto L17
        L5a:
            if (r1 == r0) goto L5f
            r6.executeOpsTogether(r7, r8, r1, r0)
        L5f:
            return
        L60:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Internal error with the back stack records"
            r0.<init>(r1)
            throw r0
    }

    private void reportBackStackChanged() {
            r2 = this;
            r0 = 0
        L1:
            java.util.ArrayList<androidx.fragment.app.FragmentManager$OnBackStackChangedListener> r1 = r2.mBackStackChangeListeners
            int r1 = r1.size()
            if (r0 >= r1) goto L17
            java.util.ArrayList<androidx.fragment.app.FragmentManager$OnBackStackChangedListener> r1 = r2.mBackStackChangeListeners
            java.lang.Object r1 = r1.get(r0)
            androidx.fragment.app.FragmentManager$OnBackStackChangedListener r1 = (androidx.fragment.app.FragmentManager.OnBackStackChangedListener) r1
            r1.onBackStackChanged()
            int r0 = r0 + 1
            goto L1
        L17:
            return
    }

    static int reverseTransit(int r1) {
            r0 = 0
            switch(r1) {
                case 4097: goto L11;
                case 4099: goto Le;
                case 4100: goto Lb;
                case 8194: goto L8;
                case 8197: goto L5;
                default: goto L4;
            }
        L4:
            goto L14
        L5:
            r0 = 4100(0x1004, float:5.745E-42)
            goto L14
        L8:
            r0 = 4097(0x1001, float:5.741E-42)
            goto L14
        Lb:
            r0 = 8197(0x2005, float:1.1486E-41)
            goto L14
        Le:
            r0 = 4099(0x1003, float:5.744E-42)
            goto L14
        L11:
            r0 = 8194(0x2002, float:1.1482E-41)
        L14:
            return r0
    }

    private void setVisibleRemovingFragment(androidx.fragment.app.Fragment r4) {
            r3 = this;
            android.view.ViewGroup r0 = r3.getFragmentContainer(r4)
            if (r0 == 0) goto L37
            int r1 = r4.getEnterAnim()
            int r2 = r4.getExitAnim()
            int r1 = r1 + r2
            int r2 = r4.getPopEnterAnim()
            int r1 = r1 + r2
            int r2 = r4.getPopExitAnim()
            int r1 = r1 + r2
            if (r1 <= 0) goto L37
            int r1 = androidx.fragment.R.id.visible_removing_fragment_view_tag
            java.lang.Object r1 = r0.getTag(r1)
            if (r1 != 0) goto L28
            int r1 = androidx.fragment.R.id.visible_removing_fragment_view_tag
            r0.setTag(r1, r4)
        L28:
            int r1 = androidx.fragment.R.id.visible_removing_fragment_view_tag
            java.lang.Object r1 = r0.getTag(r1)
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            boolean r2 = r4.getPopDirection()
            r1.setPopDirection(r2)
        L37:
            return
    }

    private void startPendingDeferredFragments() {
            r2 = this;
            androidx.fragment.app.FragmentStore r0 = r2.mFragmentStore
            java.util.List r0 = r0.getActiveFragmentStateManagers()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1a
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.FragmentStateManager r1 = (androidx.fragment.app.FragmentStateManager) r1
            r2.performPendingDeferredStart(r1)
            goto La
        L1a:
            return
    }

    private void throwException(java.lang.RuntimeException r9) {
            r8 = this;
            java.lang.String r0 = r9.getMessage()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.e(r1, r0)
            java.lang.String r0 = "Activity state:"
            android.util.Log.e(r1, r0)
            androidx.fragment.app.LogWriter r0 = new androidx.fragment.app.LogWriter
            r0.<init>(r1)
            java.io.PrintWriter r2 = new java.io.PrintWriter
            r2.<init>(r0)
            androidx.fragment.app.FragmentHostCallback<?> r3 = r8.mHost
            java.lang.String r4 = "Failed dumping state"
            r5 = 0
            r6 = 0
            java.lang.String r7 = "  "
            if (r3 == 0) goto L2f
            androidx.fragment.app.FragmentHostCallback<?> r3 = r8.mHost     // Catch: java.lang.Exception -> L2a
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch: java.lang.Exception -> L2a
            r3.onDump(r7, r6, r2, r5)     // Catch: java.lang.Exception -> L2a
            goto L2e
        L2a:
            r3 = move-exception
            android.util.Log.e(r1, r4, r3)
        L2e:
            goto L39
        L2f:
            java.lang.String[] r3 = new java.lang.String[r5]     // Catch: java.lang.Exception -> L35
            r8.dump(r7, r6, r2, r3)     // Catch: java.lang.Exception -> L35
            goto L39
        L35:
            r3 = move-exception
            android.util.Log.e(r1, r4, r3)
        L39:
            throw r9
    }

    private void updateOnBackPressedCallbackEnabled() {
            r4 = this;
            java.util.ArrayList<androidx.fragment.app.FragmentManager$OpGenerator> r0 = r4.mPendingActions
            monitor-enter(r0)
            java.util.ArrayList<androidx.fragment.app.FragmentManager$OpGenerator> r1 = r4.mPendingActions     // Catch: java.lang.Throwable -> L77
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L77
            r2 = 3
            r3 = 1
            if (r1 != 0) goto L38
            androidx.activity.OnBackPressedCallback r1 = r4.mOnBackPressedCallback     // Catch: java.lang.Throwable -> L77
            r1.setEnabled(r3)     // Catch: java.lang.Throwable -> L77
            boolean r1 = isLoggingEnabled(r2)     // Catch: java.lang.Throwable -> L77
            if (r1 == 0) goto L36
            java.lang.String r1 = "FragmentManager"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L77
            r2.<init>()     // Catch: java.lang.Throwable -> L77
            java.lang.String r3 = "FragmentManager "
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.Throwable -> L77
            java.lang.StringBuilder r2 = r2.append(r4)     // Catch: java.lang.Throwable -> L77
            java.lang.String r3 = " enabling OnBackPressedCallback, caused by non-empty pending actions"
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.Throwable -> L77
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L77
            android.util.Log.d(r1, r2)     // Catch: java.lang.Throwable -> L77
        L36:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L77
            return
        L38:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L77
            int r0 = r4.getBackStackEntryCount()
            if (r0 <= 0) goto L48
            androidx.fragment.app.Fragment r0 = r4.mParent
            boolean r0 = r4.isPrimaryNavigation(r0)
            if (r0 == 0) goto L48
            goto L49
        L48:
            r3 = 0
        L49:
            boolean r0 = isLoggingEnabled(r2)
            if (r0 == 0) goto L71
            java.lang.String r0 = "FragmentManager"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "OnBackPressedCallback for FragmentManager "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r4)
            java.lang.String r2 = " enabled state is "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r1 = r1.toString()
            android.util.Log.d(r0, r1)
        L71:
            androidx.activity.OnBackPressedCallback r0 = r4.mOnBackPressedCallback
            r0.setEnabled(r3)
            return
        L77:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L77
            throw r1
    }

    void addBackStackState(androidx.fragment.app.BackStackRecord r2) {
            r1 = this;
            java.util.ArrayList<androidx.fragment.app.BackStackRecord> r0 = r1.mBackStack
            r0.add(r2)
            return
    }

    androidx.fragment.app.FragmentStateManager addFragment(androidx.fragment.app.Fragment r4) {
            r3 = this;
            java.lang.String r0 = r4.mPreviousWho
            if (r0 == 0) goto L9
            java.lang.String r0 = r4.mPreviousWho
            androidx.fragment.app.strictmode.FragmentStrictMode.onFragmentReuse(r4, r0)
        L9:
            r0 = 2
            boolean r0 = isLoggingEnabled(r0)
            if (r0 == 0) goto L28
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "add: "
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r4)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.v(r1, r0)
        L28:
            androidx.fragment.app.FragmentStateManager r0 = r3.createOrGetFragmentStateManager(r4)
            r4.mFragmentManager = r3
            androidx.fragment.app.FragmentStore r1 = r3.mFragmentStore
            r1.makeActive(r0)
            boolean r1 = r4.mDetached
            if (r1 != 0) goto L4e
            androidx.fragment.app.FragmentStore r1 = r3.mFragmentStore
            r1.addFragment(r4)
            r1 = 0
            r4.mRemoving = r1
            android.view.View r2 = r4.mView
            if (r2 != 0) goto L45
            r4.mHiddenChanged = r1
        L45:
            boolean r1 = r3.isMenuAvailable(r4)
            if (r1 == 0) goto L4e
            r1 = 1
            r3.mNeedMenuInvalidate = r1
        L4e:
            return r0
    }

    public void addFragmentOnAttachListener(androidx.fragment.app.FragmentOnAttachListener r2) {
            r1 = this;
            java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.FragmentOnAttachListener> r0 = r1.mOnAttachListeners
            r0.add(r2)
            return
    }

    public void addOnBackStackChangedListener(androidx.fragment.app.FragmentManager.OnBackStackChangedListener r2) {
            r1 = this;
            java.util.ArrayList<androidx.fragment.app.FragmentManager$OnBackStackChangedListener> r0 = r1.mBackStackChangeListeners
            r0.add(r2)
            return
    }

    void addRetainedFragment(androidx.fragment.app.Fragment r2) {
            r1 = this;
            androidx.fragment.app.FragmentManagerViewModel r0 = r1.mNonConfig
            r0.addRetainedFragment(r2)
            return
    }

    int allocBackStackIndex() {
            r1 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = r1.mBackStackIndex
            int r0 = r0.getAndIncrement()
            return r0
    }

    void attachController(androidx.fragment.app.FragmentHostCallback<?> r7, androidx.fragment.app.FragmentContainer r8, androidx.fragment.app.Fragment r9) {
            r6 = this;
            androidx.fragment.app.FragmentHostCallback<?> r0 = r6.mHost
            if (r0 != 0) goto L18c
            r6.mHost = r7
            r6.mContainer = r8
            r6.mParent = r9
            androidx.fragment.app.Fragment r0 = r6.mParent
            if (r0 == 0) goto L17
            androidx.fragment.app.FragmentManager$7 r0 = new androidx.fragment.app.FragmentManager$7
            r0.<init>(r6, r9)
            r6.addFragmentOnAttachListener(r0)
            goto L21
        L17:
            boolean r0 = r7 instanceof androidx.fragment.app.FragmentOnAttachListener
            if (r0 == 0) goto L21
            r0 = r7
            androidx.fragment.app.FragmentOnAttachListener r0 = (androidx.fragment.app.FragmentOnAttachListener) r0
            r6.addFragmentOnAttachListener(r0)
        L21:
            androidx.fragment.app.Fragment r0 = r6.mParent
            if (r0 == 0) goto L28
            r6.updateOnBackPressedCallbackEnabled()
        L28:
            boolean r0 = r7 instanceof androidx.activity.OnBackPressedDispatcherOwner
            if (r0 == 0) goto L41
            r0 = r7
            androidx.activity.OnBackPressedDispatcherOwner r0 = (androidx.activity.OnBackPressedDispatcherOwner) r0
            androidx.activity.OnBackPressedDispatcher r1 = r0.getOnBackPressedDispatcher()
            r6.mOnBackPressedDispatcher = r1
            if (r9 == 0) goto L39
            r1 = r9
            goto L3a
        L39:
            r1 = r0
        L3a:
            androidx.activity.OnBackPressedDispatcher r2 = r6.mOnBackPressedDispatcher
            androidx.activity.OnBackPressedCallback r3 = r6.mOnBackPressedCallback
            r2.addCallback(r1, r3)
        L41:
            if (r9 == 0) goto L4c
            androidx.fragment.app.FragmentManager r0 = r9.mFragmentManager
            androidx.fragment.app.FragmentManagerViewModel r0 = r0.getChildNonConfig(r9)
            r6.mNonConfig = r0
            goto L66
        L4c:
            boolean r0 = r7 instanceof androidx.lifecycle.ViewModelStoreOwner
            if (r0 == 0) goto L5e
            r0 = r7
            androidx.lifecycle.ViewModelStoreOwner r0 = (androidx.lifecycle.ViewModelStoreOwner) r0
            androidx.lifecycle.ViewModelStore r0 = r0.getViewModelStore()
            androidx.fragment.app.FragmentManagerViewModel r1 = androidx.fragment.app.FragmentManagerViewModel.getInstance(r0)
            r6.mNonConfig = r1
            goto L66
        L5e:
            androidx.fragment.app.FragmentManagerViewModel r0 = new androidx.fragment.app.FragmentManagerViewModel
            r1 = 0
            r0.<init>(r1)
            r6.mNonConfig = r0
        L66:
            androidx.fragment.app.FragmentManagerViewModel r0 = r6.mNonConfig
            boolean r1 = r6.isStateSaved()
            r0.setIsStateSaved(r1)
            androidx.fragment.app.FragmentStore r0 = r6.mFragmentStore
            androidx.fragment.app.FragmentManagerViewModel r1 = r6.mNonConfig
            r0.setNonConfig(r1)
            androidx.fragment.app.FragmentHostCallback<?> r0 = r6.mHost
            boolean r0 = r0 instanceof androidx.savedstate.SavedStateRegistryOwner
            if (r0 == 0) goto L9a
            if (r9 != 0) goto L9a
            androidx.fragment.app.FragmentHostCallback<?> r0 = r6.mHost
            androidx.savedstate.SavedStateRegistryOwner r0 = (androidx.savedstate.SavedStateRegistryOwner) r0
            androidx.savedstate.SavedStateRegistry r0 = r0.getSavedStateRegistry()
            androidx.fragment.app.FragmentManager$$ExternalSyntheticLambda4 r1 = new androidx.fragment.app.FragmentManager$$ExternalSyntheticLambda4
            r1.<init>(r6)
            java.lang.String r2 = "android:support:fragments"
            r0.registerSavedStateProvider(r2, r1)
            android.os.Bundle r1 = r0.consumeRestoredStateForKey(r2)
            if (r1 == 0) goto L9a
            r6.restoreSaveStateInternal(r1)
        L9a:
            androidx.fragment.app.FragmentHostCallback<?> r0 = r6.mHost
            boolean r0 = r0 instanceof androidx.activity.result.ActivityResultRegistryOwner
            if (r0 == 0) goto L13e
            androidx.fragment.app.FragmentHostCallback<?> r0 = r6.mHost
            androidx.activity.result.ActivityResultRegistryOwner r0 = (androidx.activity.result.ActivityResultRegistryOwner) r0
            androidx.activity.result.ActivityResultRegistry r0 = r0.getActivityResultRegistry()
            if (r9 == 0) goto Lc0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r9.mWho
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = ":"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            goto Lc2
        Lc0:
            java.lang.String r1 = ""
        Lc2:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "FragmentManager:"
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r1)
            java.lang.String r2 = r2.toString()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.StringBuilder r3 = r3.append(r2)
            java.lang.String r4 = "StartActivityForResult"
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            androidx.activity.result.contract.ActivityResultContracts$StartActivityForResult r4 = new androidx.activity.result.contract.ActivityResultContracts$StartActivityForResult
            r4.<init>()
            androidx.fragment.app.FragmentManager$8 r5 = new androidx.fragment.app.FragmentManager$8
            r5.<init>(r6)
            androidx.activity.result.ActivityResultLauncher r3 = r0.register(r3, r4, r5)
            r6.mStartActivityForResult = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.StringBuilder r3 = r3.append(r2)
            java.lang.String r4 = "StartIntentSenderForResult"
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            androidx.fragment.app.FragmentManager$FragmentIntentSenderContract r4 = new androidx.fragment.app.FragmentManager$FragmentIntentSenderContract
            r4.<init>()
            androidx.fragment.app.FragmentManager$9 r5 = new androidx.fragment.app.FragmentManager$9
            r5.<init>(r6)
            androidx.activity.result.ActivityResultLauncher r3 = r0.register(r3, r4, r5)
            r6.mStartIntentSenderForResult = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.StringBuilder r3 = r3.append(r2)
            java.lang.String r4 = "RequestPermissions"
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            androidx.activity.result.contract.ActivityResultContracts$RequestMultiplePermissions r4 = new androidx.activity.result.contract.ActivityResultContracts$RequestMultiplePermissions
            r4.<init>()
            androidx.fragment.app.FragmentManager$10 r5 = new androidx.fragment.app.FragmentManager$10
            r5.<init>(r6)
            androidx.activity.result.ActivityResultLauncher r3 = r0.register(r3, r4, r5)
            r6.mRequestPermissions = r3
        L13e:
            androidx.fragment.app.FragmentHostCallback<?> r0 = r6.mHost
            boolean r0 = r0 instanceof androidx.core.content.OnConfigurationChangedProvider
            if (r0 == 0) goto L14d
            androidx.fragment.app.FragmentHostCallback<?> r0 = r6.mHost
            androidx.core.content.OnConfigurationChangedProvider r0 = (androidx.core.content.OnConfigurationChangedProvider) r0
            androidx.core.util.Consumer<android.content.res.Configuration> r1 = r6.mOnConfigurationChangedListener
            r0.addOnConfigurationChangedListener(r1)
        L14d:
            androidx.fragment.app.FragmentHostCallback<?> r0 = r6.mHost
            boolean r0 = r0 instanceof androidx.core.content.OnTrimMemoryProvider
            if (r0 == 0) goto L15c
            androidx.fragment.app.FragmentHostCallback<?> r0 = r6.mHost
            androidx.core.content.OnTrimMemoryProvider r0 = (androidx.core.content.OnTrimMemoryProvider) r0
            androidx.core.util.Consumer<java.lang.Integer> r1 = r6.mOnTrimMemoryListener
            r0.addOnTrimMemoryListener(r1)
        L15c:
            androidx.fragment.app.FragmentHostCallback<?> r0 = r6.mHost
            boolean r0 = r0 instanceof androidx.core.app.OnMultiWindowModeChangedProvider
            if (r0 == 0) goto L16b
            androidx.fragment.app.FragmentHostCallback<?> r0 = r6.mHost
            androidx.core.app.OnMultiWindowModeChangedProvider r0 = (androidx.core.app.OnMultiWindowModeChangedProvider) r0
            androidx.core.util.Consumer<androidx.core.app.MultiWindowModeChangedInfo> r1 = r6.mOnMultiWindowModeChangedListener
            r0.addOnMultiWindowModeChangedListener(r1)
        L16b:
            androidx.fragment.app.FragmentHostCallback<?> r0 = r6.mHost
            boolean r0 = r0 instanceof androidx.core.app.OnPictureInPictureModeChangedProvider
            if (r0 == 0) goto L17a
            androidx.fragment.app.FragmentHostCallback<?> r0 = r6.mHost
            androidx.core.app.OnPictureInPictureModeChangedProvider r0 = (androidx.core.app.OnPictureInPictureModeChangedProvider) r0
            androidx.core.util.Consumer<androidx.core.app.PictureInPictureModeChangedInfo> r1 = r6.mOnPictureInPictureModeChangedListener
            r0.addOnPictureInPictureModeChangedListener(r1)
        L17a:
            androidx.fragment.app.FragmentHostCallback<?> r0 = r6.mHost
            boolean r0 = r0 instanceof androidx.core.view.MenuHost
            if (r0 == 0) goto L18b
            if (r9 != 0) goto L18b
            androidx.fragment.app.FragmentHostCallback<?> r0 = r6.mHost
            androidx.core.view.MenuHost r0 = (androidx.core.view.MenuHost) r0
            androidx.core.view.MenuProvider r1 = r6.mMenuProvider
            r0.addMenuProvider(r1)
        L18b:
            return
        L18c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Already attached"
            r0.<init>(r1)
            throw r0
    }

    void attachFragment(androidx.fragment.app.Fragment r5) {
            r4 = this;
            r0 = 2
            boolean r1 = isLoggingEnabled(r0)
            java.lang.String r2 = "FragmentManager"
            if (r1 == 0) goto L1f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "attach: "
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.StringBuilder r1 = r1.append(r5)
            java.lang.String r1 = r1.toString()
            android.util.Log.v(r2, r1)
        L1f:
            boolean r1 = r5.mDetached
            if (r1 == 0) goto L54
            r1 = 0
            r5.mDetached = r1
            boolean r1 = r5.mAdded
            if (r1 != 0) goto L54
            androidx.fragment.app.FragmentStore r1 = r4.mFragmentStore
            r1.addFragment(r5)
            boolean r0 = isLoggingEnabled(r0)
            if (r0 == 0) goto L4b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "add from attach: "
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r5)
            java.lang.String r0 = r0.toString()
            android.util.Log.v(r2, r0)
        L4b:
            boolean r0 = r4.isMenuAvailable(r5)
            if (r0 == 0) goto L54
            r0 = 1
            r4.mNeedMenuInvalidate = r0
        L54:
            return
    }

    public androidx.fragment.app.FragmentTransaction beginTransaction() {
            r1 = this;
            androidx.fragment.app.BackStackRecord r0 = new androidx.fragment.app.BackStackRecord
            r0.<init>(r1)
            return r0
    }

    void cancelBackStackTransition() {
            r4 = this;
            r0 = 3
            boolean r0 = isLoggingEnabled(r0)
            if (r0 == 0) goto L21
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "cancelBackStackTransition for transition "
            java.lang.StringBuilder r0 = r0.append(r1)
            androidx.fragment.app.BackStackRecord r1 = r4.mTransitioningOp
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.d(r1, r0)
        L21:
            androidx.fragment.app.BackStackRecord r0 = r4.mTransitioningOp
            if (r0 == 0) goto L49
            androidx.fragment.app.BackStackRecord r0 = r4.mTransitioningOp
            r1 = 0
            r0.mCommitted = r1
            androidx.fragment.app.BackStackRecord r0 = r4.mTransitioningOp
            r0.collapseOps()
            androidx.fragment.app.BackStackRecord r0 = r4.mTransitioningOp
            androidx.fragment.app.FragmentManager$$ExternalSyntheticLambda5 r2 = new androidx.fragment.app.FragmentManager$$ExternalSyntheticLambda5
            r2.<init>(r4)
            r3 = 1
            r0.runOnCommitInternal(r3, r2)
            androidx.fragment.app.BackStackRecord r0 = r4.mTransitioningOp
            r0.commit()
            r4.mHandlingTransitioningOp = r3
            r4.executePendingTransactions()
            r4.mHandlingTransitioningOp = r1
            r0 = 0
            r4.mTransitioningOp = r0
        L49:
            return
    }

    boolean checkForMenus() {
            r3 = this;
            r0 = 0
            androidx.fragment.app.FragmentStore r1 = r3.mFragmentStore
            java.util.List r1 = r1.getActiveFragments()
            java.util.Iterator r1 = r1.iterator()
        Lb:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L22
            java.lang.Object r2 = r1.next()
            androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
            if (r2 == 0) goto L1d
            boolean r0 = r3.isMenuAvailable(r2)
        L1d:
            if (r0 == 0) goto L21
            r1 = 1
            return r1
        L21:
            goto Lb
        L22:
            r1 = 0
            return r1
    }

    public void clearBackStack(java.lang.String r3) {
            r2 = this;
            androidx.fragment.app.FragmentManager$ClearBackStackState r0 = new androidx.fragment.app.FragmentManager$ClearBackStackState
            r0.<init>(r2, r3)
            r1 = 0
            r2.enqueueAction(r0, r1)
            return
    }

    boolean clearBackStackState(java.util.ArrayList<androidx.fragment.app.BackStackRecord> r9, java.util.ArrayList<java.lang.Boolean> r10, java.lang.String r11) {
            r8 = this;
            boolean r0 = r8.restoreBackStackState(r9, r10, r11)
            if (r0 != 0) goto L8
            r1 = 0
            return r1
        L8:
            r6 = -1
            r7 = 1
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            boolean r9 = r2.popBackStackState(r3, r4, r5, r6, r7)
            return r9
    }

    @Override // androidx.fragment.app.FragmentResultOwner
    public final void clearFragmentResult(java.lang.String r3) {
            r2 = this;
            java.util.Map<java.lang.String, android.os.Bundle> r0 = r2.mResults
            r0.remove(r3)
            r0 = 2
            boolean r0 = isLoggingEnabled(r0)
            if (r0 == 0) goto L24
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Clearing fragment result with key "
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.v(r1, r0)
        L24:
            return
    }

    @Override // androidx.fragment.app.FragmentResultOwner
    public final void clearFragmentResultListener(java.lang.String r4) {
            r3 = this;
            java.util.Map<java.lang.String, androidx.fragment.app.FragmentManager$LifecycleAwareResultListener> r0 = r3.mResultListeners
            java.lang.Object r0 = r0.remove(r4)
            androidx.fragment.app.FragmentManager$LifecycleAwareResultListener r0 = (androidx.fragment.app.FragmentManager.LifecycleAwareResultListener) r0
            if (r0 == 0) goto Ld
            r0.removeObserver()
        Ld:
            r1 = 2
            boolean r1 = isLoggingEnabled(r1)
            if (r1 == 0) goto L2c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Clearing FragmentResultListener for key "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r4)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "FragmentManager"
            android.util.Log.v(r2, r1)
        L2c:
            return
    }

    java.util.Set<androidx.fragment.app.SpecialEffectsController> collectChangedControllers(java.util.ArrayList<androidx.fragment.app.BackStackRecord> r9, int r10, int r11) {
            r8 = this;
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r1 = r10
        L6:
            if (r1 >= r11) goto L33
            java.lang.Object r2 = r9.get(r1)
            androidx.fragment.app.BackStackRecord r2 = (androidx.fragment.app.BackStackRecord) r2
            java.util.ArrayList<androidx.fragment.app.FragmentTransaction$Op> r3 = r2.mOps
            java.util.Iterator r3 = r3.iterator()
        L14:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L30
            java.lang.Object r4 = r3.next()
            androidx.fragment.app.FragmentTransaction$Op r4 = (androidx.fragment.app.FragmentTransaction.Op) r4
            androidx.fragment.app.Fragment r5 = r4.mFragment
            if (r5 == 0) goto L2f
            android.view.ViewGroup r6 = r5.mContainer
            if (r6 == 0) goto L2f
            androidx.fragment.app.SpecialEffectsController r7 = androidx.fragment.app.SpecialEffectsController.getOrCreateController(r6, r8)
            r0.add(r7)
        L2f:
            goto L14
        L30:
            int r1 = r1 + 1
            goto L6
        L33:
            return r0
    }

    androidx.fragment.app.FragmentStateManager createOrGetFragmentStateManager(androidx.fragment.app.Fragment r5) {
            r4 = this;
            androidx.fragment.app.FragmentStore r0 = r4.mFragmentStore
            java.lang.String r1 = r5.mWho
            androidx.fragment.app.FragmentStateManager r0 = r0.getFragmentStateManager(r1)
            if (r0 == 0) goto Lb
            return r0
        Lb:
            androidx.fragment.app.FragmentStateManager r1 = new androidx.fragment.app.FragmentStateManager
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r2 = r4.mLifecycleCallbacksDispatcher
            androidx.fragment.app.FragmentStore r3 = r4.mFragmentStore
            r1.<init>(r2, r3, r5)
            androidx.fragment.app.FragmentHostCallback<?> r2 = r4.mHost
            android.content.Context r2 = r2.getContext()
            java.lang.ClassLoader r2 = r2.getClassLoader()
            r1.restoreState(r2)
            int r2 = r4.mCurState
            r1.setFragmentManagerState(r2)
            return r1
    }

    void detachFragment(androidx.fragment.app.Fragment r5) {
            r4 = this;
            r0 = 2
            boolean r1 = isLoggingEnabled(r0)
            java.lang.String r2 = "FragmentManager"
            if (r1 == 0) goto L1f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "detach: "
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.StringBuilder r1 = r1.append(r5)
            java.lang.String r1 = r1.toString()
            android.util.Log.v(r2, r1)
        L1f:
            boolean r1 = r5.mDetached
            if (r1 != 0) goto L56
            r1 = 1
            r5.mDetached = r1
            boolean r3 = r5.mAdded
            if (r3 == 0) goto L56
            boolean r0 = isLoggingEnabled(r0)
            if (r0 == 0) goto L46
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "remove from detach: "
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.StringBuilder r0 = r0.append(r5)
            java.lang.String r0 = r0.toString()
            android.util.Log.v(r2, r0)
        L46:
            androidx.fragment.app.FragmentStore r0 = r4.mFragmentStore
            r0.removeFragment(r5)
            boolean r0 = r4.isMenuAvailable(r5)
            if (r0 == 0) goto L53
            r4.mNeedMenuInvalidate = r1
        L53:
            r4.setVisibleRemovingFragment(r5)
        L56:
            return
    }

    void dispatchActivityCreated() {
            r2 = this;
            r0 = 0
            r2.mStateSaved = r0
            r2.mStopped = r0
            androidx.fragment.app.FragmentManagerViewModel r1 = r2.mNonConfig
            r1.setIsStateSaved(r0)
            r0 = 4
            r2.dispatchStateChange(r0)
            return
    }

    void dispatchAttach() {
            r2 = this;
            r0 = 0
            r2.mStateSaved = r0
            r2.mStopped = r0
            androidx.fragment.app.FragmentManagerViewModel r1 = r2.mNonConfig
            r1.setIsStateSaved(r0)
            r2.dispatchStateChange(r0)
            return
    }

    void dispatchConfigurationChanged(android.content.res.Configuration r5, boolean r6) {
            r4 = this;
            if (r6 == 0) goto L12
            androidx.fragment.app.FragmentHostCallback<?> r0 = r4.mHost
            boolean r0 = r0 instanceof androidx.core.content.OnConfigurationChangedProvider
            if (r0 == 0) goto L12
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."
            r0.<init>(r1)
            r4.throwException(r0)
        L12:
            androidx.fragment.app.FragmentStore r0 = r4.mFragmentStore
            java.util.List r0 = r0.getFragments()
            java.util.Iterator r0 = r0.iterator()
        L1c:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L36
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            if (r1 == 0) goto L35
            r1.performConfigurationChanged(r5)
            if (r6 == 0) goto L35
            androidx.fragment.app.FragmentManager r2 = r1.mChildFragmentManager
            r3 = 1
            r2.dispatchConfigurationChanged(r5, r3)
        L35:
            goto L1c
        L36:
            return
    }

    boolean dispatchContextItemSelected(android.view.MenuItem r6) {
            r5 = this;
            int r0 = r5.mCurState
            r1 = 0
            r2 = 1
            if (r0 >= r2) goto L7
            return r1
        L7:
            androidx.fragment.app.FragmentStore r0 = r5.mFragmentStore
            java.util.List r0 = r0.getFragments()
            java.util.Iterator r0 = r0.iterator()
        L11:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L27
            java.lang.Object r3 = r0.next()
            androidx.fragment.app.Fragment r3 = (androidx.fragment.app.Fragment) r3
            if (r3 == 0) goto L26
            boolean r4 = r3.performContextItemSelected(r6)
            if (r4 == 0) goto L26
            return r2
        L26:
            goto L11
        L27:
            return r1
    }

    void dispatchCreate() {
            r2 = this;
            r0 = 0
            r2.mStateSaved = r0
            r2.mStopped = r0
            androidx.fragment.app.FragmentManagerViewModel r1 = r2.mNonConfig
            r1.setIsStateSaved(r0)
            r0 = 1
            r2.dispatchStateChange(r0)
            return
    }

    boolean dispatchCreateOptionsMenu(android.view.Menu r6, android.view.MenuInflater r7) {
            r5 = this;
            int r0 = r5.mCurState
            r1 = 1
            if (r0 >= r1) goto L7
            r0 = 0
            return r0
        L7:
            r0 = 0
            r1 = 0
            androidx.fragment.app.FragmentStore r2 = r5.mFragmentStore
            java.util.List r2 = r2.getFragments()
            java.util.Iterator r2 = r2.iterator()
        L13:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L3a
            java.lang.Object r3 = r2.next()
            androidx.fragment.app.Fragment r3 = (androidx.fragment.app.Fragment) r3
            if (r3 == 0) goto L39
            boolean r4 = r5.isParentMenuVisible(r3)
            if (r4 == 0) goto L39
            boolean r4 = r3.performCreateOptionsMenu(r6, r7)
            if (r4 == 0) goto L39
            r0 = 1
            if (r1 != 0) goto L36
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r1 = r4
        L36:
            r1.add(r3)
        L39:
            goto L13
        L3a:
            java.util.ArrayList<androidx.fragment.app.Fragment> r2 = r5.mCreatedMenus
            if (r2 == 0) goto L5d
            r2 = 0
        L3f:
            java.util.ArrayList<androidx.fragment.app.Fragment> r3 = r5.mCreatedMenus
            int r3 = r3.size()
            if (r2 >= r3) goto L5d
            java.util.ArrayList<androidx.fragment.app.Fragment> r3 = r5.mCreatedMenus
            java.lang.Object r3 = r3.get(r2)
            androidx.fragment.app.Fragment r3 = (androidx.fragment.app.Fragment) r3
            if (r1 == 0) goto L57
            boolean r4 = r1.contains(r3)
            if (r4 != 0) goto L5a
        L57:
            r3.onDestroyOptionsMenu()
        L5a:
            int r2 = r2 + 1
            goto L3f
        L5d:
            r5.mCreatedMenus = r1
            return r0
    }

    void dispatchDestroy() {
            r2 = this;
            r0 = 1
            r2.mDestroyed = r0
            r2.execPendingActions(r0)
            r2.endAnimatingAwayFragments()
            r2.clearBackStackStateViewModels()
            r0 = -1
            r2.dispatchStateChange(r0)
            androidx.fragment.app.FragmentHostCallback<?> r0 = r2.mHost
            boolean r0 = r0 instanceof androidx.core.content.OnTrimMemoryProvider
            if (r0 == 0) goto L1f
            androidx.fragment.app.FragmentHostCallback<?> r0 = r2.mHost
            androidx.core.content.OnTrimMemoryProvider r0 = (androidx.core.content.OnTrimMemoryProvider) r0
            androidx.core.util.Consumer<java.lang.Integer> r1 = r2.mOnTrimMemoryListener
            r0.removeOnTrimMemoryListener(r1)
        L1f:
            androidx.fragment.app.FragmentHostCallback<?> r0 = r2.mHost
            boolean r0 = r0 instanceof androidx.core.content.OnConfigurationChangedProvider
            if (r0 == 0) goto L2e
            androidx.fragment.app.FragmentHostCallback<?> r0 = r2.mHost
            androidx.core.content.OnConfigurationChangedProvider r0 = (androidx.core.content.OnConfigurationChangedProvider) r0
            androidx.core.util.Consumer<android.content.res.Configuration> r1 = r2.mOnConfigurationChangedListener
            r0.removeOnConfigurationChangedListener(r1)
        L2e:
            androidx.fragment.app.FragmentHostCallback<?> r0 = r2.mHost
            boolean r0 = r0 instanceof androidx.core.app.OnMultiWindowModeChangedProvider
            if (r0 == 0) goto L3d
            androidx.fragment.app.FragmentHostCallback<?> r0 = r2.mHost
            androidx.core.app.OnMultiWindowModeChangedProvider r0 = (androidx.core.app.OnMultiWindowModeChangedProvider) r0
            androidx.core.util.Consumer<androidx.core.app.MultiWindowModeChangedInfo> r1 = r2.mOnMultiWindowModeChangedListener
            r0.removeOnMultiWindowModeChangedListener(r1)
        L3d:
            androidx.fragment.app.FragmentHostCallback<?> r0 = r2.mHost
            boolean r0 = r0 instanceof androidx.core.app.OnPictureInPictureModeChangedProvider
            if (r0 == 0) goto L4c
            androidx.fragment.app.FragmentHostCallback<?> r0 = r2.mHost
            androidx.core.app.OnPictureInPictureModeChangedProvider r0 = (androidx.core.app.OnPictureInPictureModeChangedProvider) r0
            androidx.core.util.Consumer<androidx.core.app.PictureInPictureModeChangedInfo> r1 = r2.mOnPictureInPictureModeChangedListener
            r0.removeOnPictureInPictureModeChangedListener(r1)
        L4c:
            androidx.fragment.app.FragmentHostCallback<?> r0 = r2.mHost
            boolean r0 = r0 instanceof androidx.core.view.MenuHost
            if (r0 == 0) goto L5f
            androidx.fragment.app.Fragment r0 = r2.mParent
            if (r0 != 0) goto L5f
            androidx.fragment.app.FragmentHostCallback<?> r0 = r2.mHost
            androidx.core.view.MenuHost r0 = (androidx.core.view.MenuHost) r0
            androidx.core.view.MenuProvider r1 = r2.mMenuProvider
            r0.removeMenuProvider(r1)
        L5f:
            r0 = 0
            r2.mHost = r0
            r2.mContainer = r0
            r2.mParent = r0
            androidx.activity.OnBackPressedDispatcher r1 = r2.mOnBackPressedDispatcher
            if (r1 == 0) goto L71
            androidx.activity.OnBackPressedCallback r1 = r2.mOnBackPressedCallback
            r1.remove()
            r2.mOnBackPressedDispatcher = r0
        L71:
            androidx.activity.result.ActivityResultLauncher<android.content.Intent> r0 = r2.mStartActivityForResult
            if (r0 == 0) goto L84
            androidx.activity.result.ActivityResultLauncher<android.content.Intent> r0 = r2.mStartActivityForResult
            r0.unregister()
            androidx.activity.result.ActivityResultLauncher<androidx.activity.result.IntentSenderRequest> r0 = r2.mStartIntentSenderForResult
            r0.unregister()
            androidx.activity.result.ActivityResultLauncher<java.lang.String[]> r0 = r2.mRequestPermissions
            r0.unregister()
        L84:
            return
    }

    void dispatchDestroyView() {
            r1 = this;
            r0 = 1
            r1.dispatchStateChange(r0)
            return
    }

    void dispatchLowMemory(boolean r5) {
            r4 = this;
            if (r5 == 0) goto L12
            androidx.fragment.app.FragmentHostCallback<?> r0 = r4.mHost
            boolean r0 = r0 instanceof androidx.core.content.OnTrimMemoryProvider
            if (r0 == 0) goto L12
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."
            r0.<init>(r1)
            r4.throwException(r0)
        L12:
            androidx.fragment.app.FragmentStore r0 = r4.mFragmentStore
            java.util.List r0 = r0.getFragments()
            java.util.Iterator r0 = r0.iterator()
        L1c:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L36
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            if (r1 == 0) goto L35
            r1.performLowMemory()
            if (r5 == 0) goto L35
            androidx.fragment.app.FragmentManager r2 = r1.mChildFragmentManager
            r3 = 1
            r2.dispatchLowMemory(r3)
        L35:
            goto L1c
        L36:
            return
    }

    void dispatchMultiWindowModeChanged(boolean r5, boolean r6) {
            r4 = this;
            if (r6 == 0) goto L12
            androidx.fragment.app.FragmentHostCallback<?> r0 = r4.mHost
            boolean r0 = r0 instanceof androidx.core.app.OnMultiWindowModeChangedProvider
            if (r0 == 0) goto L12
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."
            r0.<init>(r1)
            r4.throwException(r0)
        L12:
            androidx.fragment.app.FragmentStore r0 = r4.mFragmentStore
            java.util.List r0 = r0.getFragments()
            java.util.Iterator r0 = r0.iterator()
        L1c:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L36
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            if (r1 == 0) goto L35
            r1.performMultiWindowModeChanged(r5)
            if (r6 == 0) goto L35
            androidx.fragment.app.FragmentManager r2 = r1.mChildFragmentManager
            r3 = 1
            r2.dispatchMultiWindowModeChanged(r5, r3)
        L35:
            goto L1c
        L36:
            return
    }

    void dispatchOnAttachFragment(androidx.fragment.app.Fragment r3) {
            r2 = this;
            java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.FragmentOnAttachListener> r0 = r2.mOnAttachListeners
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.FragmentOnAttachListener r1 = (androidx.fragment.app.FragmentOnAttachListener) r1
            r1.onAttachFragment(r2, r3)
            goto L6
        L16:
            return
    }

    void dispatchOnHiddenChanged() {
            r3 = this;
            androidx.fragment.app.FragmentStore r0 = r3.mFragmentStore
            java.util.List r0 = r0.getActiveFragments()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L25
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            if (r1 == 0) goto L24
            boolean r2 = r1.isHidden()
            r1.onHiddenChanged(r2)
            androidx.fragment.app.FragmentManager r2 = r1.mChildFragmentManager
            r2.dispatchOnHiddenChanged()
        L24:
            goto La
        L25:
            return
    }

    boolean dispatchOptionsItemSelected(android.view.MenuItem r6) {
            r5 = this;
            int r0 = r5.mCurState
            r1 = 0
            r2 = 1
            if (r0 >= r2) goto L7
            return r1
        L7:
            androidx.fragment.app.FragmentStore r0 = r5.mFragmentStore
            java.util.List r0 = r0.getFragments()
            java.util.Iterator r0 = r0.iterator()
        L11:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L27
            java.lang.Object r3 = r0.next()
            androidx.fragment.app.Fragment r3 = (androidx.fragment.app.Fragment) r3
            if (r3 == 0) goto L26
            boolean r4 = r3.performOptionsItemSelected(r6)
            if (r4 == 0) goto L26
            return r2
        L26:
            goto L11
        L27:
            return r1
    }

    void dispatchOptionsMenuClosed(android.view.Menu r3) {
            r2 = this;
            int r0 = r2.mCurState
            r1 = 1
            if (r0 >= r1) goto L6
            return
        L6:
            androidx.fragment.app.FragmentStore r0 = r2.mFragmentStore
            java.util.List r0 = r0.getFragments()
            java.util.Iterator r0 = r0.iterator()
        L10:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L22
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            if (r1 == 0) goto L21
            r1.performOptionsMenuClosed(r3)
        L21:
            goto L10
        L22:
            return
    }

    void dispatchPause() {
            r1 = this;
            r0 = 5
            r1.dispatchStateChange(r0)
            return
    }

    void dispatchPictureInPictureModeChanged(boolean r5, boolean r6) {
            r4 = this;
            if (r6 == 0) goto L12
            androidx.fragment.app.FragmentHostCallback<?> r0 = r4.mHost
            boolean r0 = r0 instanceof androidx.core.app.OnPictureInPictureModeChangedProvider
            if (r0 == 0) goto L12
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."
            r0.<init>(r1)
            r4.throwException(r0)
        L12:
            androidx.fragment.app.FragmentStore r0 = r4.mFragmentStore
            java.util.List r0 = r0.getFragments()
            java.util.Iterator r0 = r0.iterator()
        L1c:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L36
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            if (r1 == 0) goto L35
            r1.performPictureInPictureModeChanged(r5)
            if (r6 == 0) goto L35
            androidx.fragment.app.FragmentManager r2 = r1.mChildFragmentManager
            r3 = 1
            r2.dispatchPictureInPictureModeChanged(r5, r3)
        L35:
            goto L1c
        L36:
            return
    }

    boolean dispatchPrepareOptionsMenu(android.view.Menu r5) {
            r4 = this;
            int r0 = r4.mCurState
            r1 = 1
            if (r0 >= r1) goto L7
            r0 = 0
            return r0
        L7:
            r0 = 0
            androidx.fragment.app.FragmentStore r1 = r4.mFragmentStore
            java.util.List r1 = r1.getFragments()
            java.util.Iterator r1 = r1.iterator()
        L12:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L2e
            java.lang.Object r2 = r1.next()
            androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
            if (r2 == 0) goto L2d
            boolean r3 = r4.isParentMenuVisible(r2)
            if (r3 == 0) goto L2d
            boolean r3 = r2.performPrepareOptionsMenu(r5)
            if (r3 == 0) goto L2d
            r0 = 1
        L2d:
            goto L12
        L2e:
            return r0
    }

    void dispatchPrimaryNavigationFragmentChanged() {
            r1 = this;
            r1.updateOnBackPressedCallbackEnabled()
            androidx.fragment.app.Fragment r0 = r1.mPrimaryNav
            r1.dispatchParentPrimaryNavigationFragmentChanged(r0)
            return
    }

    void dispatchResume() {
            r2 = this;
            r0 = 0
            r2.mStateSaved = r0
            r2.mStopped = r0
            androidx.fragment.app.FragmentManagerViewModel r1 = r2.mNonConfig
            r1.setIsStateSaved(r0)
            r0 = 7
            r2.dispatchStateChange(r0)
            return
    }

    void dispatchStart() {
            r2 = this;
            r0 = 0
            r2.mStateSaved = r0
            r2.mStopped = r0
            androidx.fragment.app.FragmentManagerViewModel r1 = r2.mNonConfig
            r1.setIsStateSaved(r0)
            r0 = 5
            r2.dispatchStateChange(r0)
            return
    }

    void dispatchStop() {
            r2 = this;
            r0 = 1
            r2.mStopped = r0
            androidx.fragment.app.FragmentManagerViewModel r1 = r2.mNonConfig
            r1.setIsStateSaved(r0)
            r0 = 4
            r2.dispatchStateChange(r0)
            return
    }

    void dispatchViewCreated() {
            r1 = this;
            r0 = 2
            r1.dispatchStateChange(r0)
            return
    }

    public void dump(java.lang.String r7, java.io.FileDescriptor r8, java.io.PrintWriter r9, java.lang.String[] r10) {
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.StringBuilder r0 = r0.append(r7)
            java.lang.String r1 = "    "
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            androidx.fragment.app.FragmentStore r1 = r6.mFragmentStore
            r1.dump(r7, r8, r9, r10)
            java.util.ArrayList<androidx.fragment.app.Fragment> r1 = r6.mCreatedMenus
            if (r1 == 0) goto L51
            java.util.ArrayList<androidx.fragment.app.Fragment> r1 = r6.mCreatedMenus
            int r1 = r1.size()
            if (r1 <= 0) goto L51
            r9.print(r7)
            java.lang.String r2 = "Fragments Created Menus:"
            r9.println(r2)
            r2 = 0
        L2d:
            if (r2 >= r1) goto L51
            java.util.ArrayList<androidx.fragment.app.Fragment> r3 = r6.mCreatedMenus
            java.lang.Object r3 = r3.get(r2)
            androidx.fragment.app.Fragment r3 = (androidx.fragment.app.Fragment) r3
            r9.print(r7)
            java.lang.String r4 = "  #"
            r9.print(r4)
            r9.print(r2)
            java.lang.String r4 = ": "
            r9.print(r4)
            java.lang.String r4 = r3.toString()
            r9.println(r4)
            int r2 = r2 + 1
            goto L2d
        L51:
            java.util.ArrayList<androidx.fragment.app.BackStackRecord> r1 = r6.mBackStack
            int r1 = r1.size()
            if (r1 <= 0) goto L89
            r9.print(r7)
            java.lang.String r2 = "Back Stack:"
            r9.println(r2)
            r2 = 0
        L62:
            if (r2 >= r1) goto L89
            java.util.ArrayList<androidx.fragment.app.BackStackRecord> r3 = r6.mBackStack
            java.lang.Object r3 = r3.get(r2)
            androidx.fragment.app.BackStackRecord r3 = (androidx.fragment.app.BackStackRecord) r3
            r9.print(r7)
            java.lang.String r4 = "  #"
            r9.print(r4)
            r9.print(r2)
            java.lang.String r4 = ": "
            r9.print(r4)
            java.lang.String r4 = r3.toString()
            r9.println(r4)
            r3.dump(r0, r9)
            int r2 = r2 + 1
            goto L62
        L89:
            r9.print(r7)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Back Stack Index: "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.util.concurrent.atomic.AtomicInteger r3 = r6.mBackStackIndex
            int r3 = r3.get()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r9.println(r2)
            java.util.ArrayList<androidx.fragment.app.FragmentManager$OpGenerator> r2 = r6.mPendingActions
            monitor-enter(r2)
            java.util.ArrayList<androidx.fragment.app.FragmentManager$OpGenerator> r3 = r6.mPendingActions     // Catch: java.lang.Throwable -> L14e
            int r3 = r3.size()     // Catch: java.lang.Throwable -> L14e
            r1 = r3
            if (r1 <= 0) goto Ldd
            r9.print(r7)     // Catch: java.lang.Throwable -> L14e
            java.lang.String r3 = "Pending Actions:"
            r9.println(r3)     // Catch: java.lang.Throwable -> L14e
            r3 = 0
        Lbd:
            if (r3 >= r1) goto Ldd
            java.util.ArrayList<androidx.fragment.app.FragmentManager$OpGenerator> r4 = r6.mPendingActions     // Catch: java.lang.Throwable -> L14e
            java.lang.Object r4 = r4.get(r3)     // Catch: java.lang.Throwable -> L14e
            androidx.fragment.app.FragmentManager$OpGenerator r4 = (androidx.fragment.app.FragmentManager.OpGenerator) r4     // Catch: java.lang.Throwable -> L14e
            r9.print(r7)     // Catch: java.lang.Throwable -> L14e
            java.lang.String r5 = "  #"
            r9.print(r5)     // Catch: java.lang.Throwable -> L14e
            r9.print(r3)     // Catch: java.lang.Throwable -> L14e
            java.lang.String r5 = ": "
            r9.print(r5)     // Catch: java.lang.Throwable -> L14e
            r9.println(r4)     // Catch: java.lang.Throwable -> L14e
            int r3 = r3 + 1
            goto Lbd
        Ldd:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L14e
            r9.print(r7)
            java.lang.String r2 = "FragmentManager misc state:"
            r9.println(r2)
            r9.print(r7)
            java.lang.String r2 = "  mHost="
            r9.print(r2)
            androidx.fragment.app.FragmentHostCallback<?> r2 = r6.mHost
            r9.println(r2)
            r9.print(r7)
            java.lang.String r2 = "  mContainer="
            r9.print(r2)
            androidx.fragment.app.FragmentContainer r2 = r6.mContainer
            r9.println(r2)
            androidx.fragment.app.Fragment r2 = r6.mParent
            if (r2 == 0) goto L111
            r9.print(r7)
            java.lang.String r2 = "  mParent="
            r9.print(r2)
            androidx.fragment.app.Fragment r2 = r6.mParent
            r9.println(r2)
        L111:
            r9.print(r7)
            java.lang.String r2 = "  mCurState="
            r9.print(r2)
            int r2 = r6.mCurState
            r9.print(r2)
            java.lang.String r2 = " mStateSaved="
            r9.print(r2)
            boolean r2 = r6.mStateSaved
            r9.print(r2)
            java.lang.String r2 = " mStopped="
            r9.print(r2)
            boolean r2 = r6.mStopped
            r9.print(r2)
            java.lang.String r2 = " mDestroyed="
            r9.print(r2)
            boolean r2 = r6.mDestroyed
            r9.println(r2)
            boolean r2 = r6.mNeedMenuInvalidate
            if (r2 == 0) goto L14d
            r9.print(r7)
            java.lang.String r2 = "  mNeedMenuInvalidate="
            r9.print(r2)
            boolean r2 = r6.mNeedMenuInvalidate
            r9.println(r2)
        L14d:
            return
        L14e:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L14e
            throw r3
    }

    void enqueueAction(androidx.fragment.app.FragmentManager.OpGenerator r4, boolean r5) {
            r3 = this;
            if (r5 != 0) goto L1d
            androidx.fragment.app.FragmentHostCallback<?> r0 = r3.mHost
            if (r0 != 0) goto L1a
            boolean r0 = r3.mDestroyed
            if (r0 == 0) goto L12
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "FragmentManager has been destroyed"
            r0.<init>(r1)
            throw r0
        L12:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "FragmentManager has not been attached to a host."
            r0.<init>(r1)
            throw r0
        L1a:
            r3.checkStateLoss()
        L1d:
            java.util.ArrayList<androidx.fragment.app.FragmentManager$OpGenerator> r0 = r3.mPendingActions
            monitor-enter(r0)
            androidx.fragment.app.FragmentHostCallback<?> r1 = r3.mHost     // Catch: java.lang.Throwable -> L3a
            if (r1 != 0) goto L30
            if (r5 == 0) goto L28
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3a
            return
        L28:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L3a
            java.lang.String r2 = "Activity has been destroyed"
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L3a
            throw r1     // Catch: java.lang.Throwable -> L3a
        L30:
            java.util.ArrayList<androidx.fragment.app.FragmentManager$OpGenerator> r1 = r3.mPendingActions     // Catch: java.lang.Throwable -> L3a
            r1.add(r4)     // Catch: java.lang.Throwable -> L3a
            r3.scheduleCommit()     // Catch: java.lang.Throwable -> L3a
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3a
            return
        L3a:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3a
            throw r1
    }

    boolean execPendingActions(boolean r6) {
            r5 = this;
            r5.ensureExecReady(r6)
            r0 = 0
            boolean r1 = r5.mHandlingTransitioningOp
            if (r1 != 0) goto L6f
            androidx.fragment.app.BackStackRecord r1 = r5.mTransitioningOp
            if (r1 == 0) goto L6f
            androidx.fragment.app.BackStackRecord r1 = r5.mTransitioningOp
            r2 = 0
            r1.mCommitted = r2
            androidx.fragment.app.BackStackRecord r1 = r5.mTransitioningOp
            r1.collapseOps()
            r1 = 3
            boolean r1 = isLoggingEnabled(r1)
            if (r1 == 0) goto L43
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Reversing mTransitioningOp "
            java.lang.StringBuilder r1 = r1.append(r3)
            androidx.fragment.app.BackStackRecord r3 = r5.mTransitioningOp
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r3 = " as part of execPendingActions for actions "
            java.lang.StringBuilder r1 = r1.append(r3)
            java.util.ArrayList<androidx.fragment.app.FragmentManager$OpGenerator> r3 = r5.mPendingActions
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r1 = r1.toString()
            java.lang.String r3 = "FragmentManager"
            android.util.Log.d(r3, r1)
        L43:
            androidx.fragment.app.BackStackRecord r1 = r5.mTransitioningOp
            r1.commitInternal(r2, r2)
            java.util.ArrayList<androidx.fragment.app.FragmentManager$OpGenerator> r1 = r5.mPendingActions
            androidx.fragment.app.BackStackRecord r3 = r5.mTransitioningOp
            r1.add(r2, r3)
            androidx.fragment.app.BackStackRecord r1 = r5.mTransitioningOp
            java.util.ArrayList<androidx.fragment.app.FragmentTransaction$Op> r1 = r1.mOps
            java.util.Iterator r1 = r1.iterator()
        L57:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L6c
            java.lang.Object r3 = r1.next()
            androidx.fragment.app.FragmentTransaction$Op r3 = (androidx.fragment.app.FragmentTransaction.Op) r3
            androidx.fragment.app.Fragment r4 = r3.mFragment
            if (r4 == 0) goto L6b
            androidx.fragment.app.Fragment r4 = r3.mFragment
            r4.mTransitioning = r2
        L6b:
            goto L57
        L6c:
            r1 = 0
            r5.mTransitioningOp = r1
        L6f:
            java.util.ArrayList<androidx.fragment.app.BackStackRecord> r1 = r5.mTmpRecords
            java.util.ArrayList<java.lang.Boolean> r2 = r5.mTmpIsPop
            boolean r1 = r5.generateOpsForPendingActions(r1, r2)
            if (r1 == 0) goto L8e
            r1 = 1
            r5.mExecutingActions = r1
            java.util.ArrayList<androidx.fragment.app.BackStackRecord> r1 = r5.mTmpRecords     // Catch: java.lang.Throwable -> L89
            java.util.ArrayList<java.lang.Boolean> r2 = r5.mTmpIsPop     // Catch: java.lang.Throwable -> L89
            r5.removeRedundantOperationsAndExecute(r1, r2)     // Catch: java.lang.Throwable -> L89
            r5.cleanupExec()
            r0 = 1
            goto L6f
        L89:
            r1 = move-exception
            r5.cleanupExec()
            throw r1
        L8e:
            r5.updateOnBackPressedCallbackEnabled()
            r5.doPendingDeferredStart()
            androidx.fragment.app.FragmentStore r1 = r5.mFragmentStore
            r1.burpActive()
            return r0
    }

    void execSingleAction(androidx.fragment.app.FragmentManager.OpGenerator r6, boolean r7) {
            r5 = this;
            if (r7 == 0) goto Lb
            androidx.fragment.app.FragmentHostCallback<?> r0 = r5.mHost
            if (r0 == 0) goto La
            boolean r0 = r5.mDestroyed
            if (r0 == 0) goto Lb
        La:
            return
        Lb:
            r5.ensureExecReady(r7)
            r0 = 0
            androidx.fragment.app.BackStackRecord r1 = r5.mTransitioningOp
            if (r1 == 0) goto L77
            androidx.fragment.app.BackStackRecord r1 = r5.mTransitioningOp
            r2 = 0
            r1.mCommitted = r2
            androidx.fragment.app.BackStackRecord r1 = r5.mTransitioningOp
            r1.collapseOps()
            r1 = 3
            boolean r1 = isLoggingEnabled(r1)
            if (r1 == 0) goto L48
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Reversing mTransitioningOp "
            java.lang.StringBuilder r1 = r1.append(r3)
            androidx.fragment.app.BackStackRecord r3 = r5.mTransitioningOp
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r3 = " as part of execSingleAction for action "
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.StringBuilder r1 = r1.append(r6)
            java.lang.String r1 = r1.toString()
            java.lang.String r3 = "FragmentManager"
            android.util.Log.d(r3, r1)
        L48:
            androidx.fragment.app.BackStackRecord r1 = r5.mTransitioningOp
            r1.commitInternal(r2, r2)
            androidx.fragment.app.BackStackRecord r1 = r5.mTransitioningOp
            java.util.ArrayList<androidx.fragment.app.BackStackRecord> r3 = r5.mTmpRecords
            java.util.ArrayList<java.lang.Boolean> r4 = r5.mTmpIsPop
            boolean r0 = r1.generateOps(r3, r4)
            androidx.fragment.app.BackStackRecord r1 = r5.mTransitioningOp
            java.util.ArrayList<androidx.fragment.app.FragmentTransaction$Op> r1 = r1.mOps
            java.util.Iterator r1 = r1.iterator()
        L5f:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L74
            java.lang.Object r3 = r1.next()
            androidx.fragment.app.FragmentTransaction$Op r3 = (androidx.fragment.app.FragmentTransaction.Op) r3
            androidx.fragment.app.Fragment r4 = r3.mFragment
            if (r4 == 0) goto L73
            androidx.fragment.app.Fragment r4 = r3.mFragment
            r4.mTransitioning = r2
        L73:
            goto L5f
        L74:
            r1 = 0
            r5.mTransitioningOp = r1
        L77:
            java.util.ArrayList<androidx.fragment.app.BackStackRecord> r1 = r5.mTmpRecords
            java.util.ArrayList<java.lang.Boolean> r2 = r5.mTmpIsPop
            boolean r1 = r6.generateOps(r1, r2)
            if (r0 != 0) goto L83
            if (r1 == 0) goto L91
        L83:
            r2 = 1
            r5.mExecutingActions = r2
            java.util.ArrayList<androidx.fragment.app.BackStackRecord> r2 = r5.mTmpRecords     // Catch: java.lang.Throwable -> L9d
            java.util.ArrayList<java.lang.Boolean> r3 = r5.mTmpIsPop     // Catch: java.lang.Throwable -> L9d
            r5.removeRedundantOperationsAndExecute(r2, r3)     // Catch: java.lang.Throwable -> L9d
            r5.cleanupExec()
        L91:
            r5.updateOnBackPressedCallbackEnabled()
            r5.doPendingDeferredStart()
            androidx.fragment.app.FragmentStore r2 = r5.mFragmentStore
            r2.burpActive()
            return
        L9d:
            r2 = move-exception
            r5.cleanupExec()
            throw r2
    }

    public boolean executePendingTransactions() {
            r1 = this;
            r0 = 1
            boolean r0 = r1.execPendingActions(r0)
            r1.forcePostponedTransactions()
            return r0
    }

    androidx.fragment.app.Fragment findActiveFragment(java.lang.String r2) {
            r1 = this;
            androidx.fragment.app.FragmentStore r0 = r1.mFragmentStore
            androidx.fragment.app.Fragment r0 = r0.findActiveFragment(r2)
            return r0
    }

    public androidx.fragment.app.Fragment findFragmentById(int r2) {
            r1 = this;
            androidx.fragment.app.FragmentStore r0 = r1.mFragmentStore
            androidx.fragment.app.Fragment r0 = r0.findFragmentById(r2)
            return r0
    }

    public androidx.fragment.app.Fragment findFragmentByTag(java.lang.String r2) {
            r1 = this;
            androidx.fragment.app.FragmentStore r0 = r1.mFragmentStore
            androidx.fragment.app.Fragment r0 = r0.findFragmentByTag(r2)
            return r0
    }

    androidx.fragment.app.Fragment findFragmentByWho(java.lang.String r2) {
            r1 = this;
            androidx.fragment.app.FragmentStore r0 = r1.mFragmentStore
            androidx.fragment.app.Fragment r0 = r0.findFragmentByWho(r2)
            return r0
    }

    java.util.Set<androidx.fragment.app.Fragment> fragmentsFromRecord(androidx.fragment.app.BackStackRecord r5) {
            r4 = this;
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r1 = 0
        L6:
            java.util.ArrayList<androidx.fragment.app.FragmentTransaction$Op> r2 = r5.mOps
            int r2 = r2.size()
            if (r1 >= r2) goto L24
            java.util.ArrayList<androidx.fragment.app.FragmentTransaction$Op> r2 = r5.mOps
            java.lang.Object r2 = r2.get(r1)
            androidx.fragment.app.FragmentTransaction$Op r2 = (androidx.fragment.app.FragmentTransaction.Op) r2
            androidx.fragment.app.Fragment r2 = r2.mFragment
            if (r2 == 0) goto L21
            boolean r3 = r5.mAddToBackStack
            if (r3 == 0) goto L21
            r0.add(r2)
        L21:
            int r1 = r1 + 1
            goto L6
        L24:
            return r0
    }

    int getActiveFragmentCount() {
            r1 = this;
            androidx.fragment.app.FragmentStore r0 = r1.mFragmentStore
            int r0 = r0.getActiveFragmentCount()
            return r0
    }

    java.util.List<androidx.fragment.app.Fragment> getActiveFragments() {
            r1 = this;
            androidx.fragment.app.FragmentStore r0 = r1.mFragmentStore
            java.util.List r0 = r0.getActiveFragments()
            return r0
    }

    public androidx.fragment.app.FragmentManager.BackStackEntry getBackStackEntryAt(int r2) {
            r1 = this;
            java.util.ArrayList<androidx.fragment.app.BackStackRecord> r0 = r1.mBackStack
            int r0 = r0.size()
            if (r2 != r0) goto L15
            androidx.fragment.app.BackStackRecord r0 = r1.mTransitioningOp
            if (r0 == 0) goto Lf
            androidx.fragment.app.BackStackRecord r0 = r1.mTransitioningOp
            return r0
        Lf:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            r0.<init>()
            throw r0
        L15:
            java.util.ArrayList<androidx.fragment.app.BackStackRecord> r0 = r1.mBackStack
            java.lang.Object r0 = r0.get(r2)
            androidx.fragment.app.FragmentManager$BackStackEntry r0 = (androidx.fragment.app.FragmentManager.BackStackEntry) r0
            return r0
    }

    public int getBackStackEntryCount() {
            r2 = this;
            java.util.ArrayList<androidx.fragment.app.BackStackRecord> r0 = r2.mBackStack
            int r0 = r0.size()
            androidx.fragment.app.BackStackRecord r1 = r2.mTransitioningOp
            if (r1 == 0) goto Lc
            r1 = 1
            goto Ld
        Lc:
            r1 = 0
        Ld:
            int r0 = r0 + r1
            return r0
    }

    androidx.fragment.app.FragmentContainer getContainer() {
            r1 = this;
            androidx.fragment.app.FragmentContainer r0 = r1.mContainer
            return r0
    }

    public androidx.fragment.app.Fragment getFragment(android.os.Bundle r6, java.lang.String r7) {
            r5 = this;
            java.lang.String r0 = r6.getString(r7)
            if (r0 != 0) goto L8
            r1 = 0
            return r1
        L8:
            androidx.fragment.app.Fragment r1 = r5.findActiveFragment(r0)
            if (r1 != 0) goto L33
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Fragment no longer exists for key "
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r3 = r3.append(r7)
            java.lang.String r4 = ": unique id "
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            r5.throwException(r2)
        L33:
            return r1
    }

    public androidx.fragment.app.FragmentFactory getFragmentFactory() {
            r1 = this;
            androidx.fragment.app.FragmentFactory r0 = r1.mFragmentFactory
            if (r0 == 0) goto L7
            androidx.fragment.app.FragmentFactory r0 = r1.mFragmentFactory
            return r0
        L7:
            androidx.fragment.app.Fragment r0 = r1.mParent
            if (r0 == 0) goto L14
            androidx.fragment.app.Fragment r0 = r1.mParent
            androidx.fragment.app.FragmentManager r0 = r0.mFragmentManager
            androidx.fragment.app.FragmentFactory r0 = r0.getFragmentFactory()
            return r0
        L14:
            androidx.fragment.app.FragmentFactory r0 = r1.mHostFragmentFactory
            return r0
    }

    androidx.fragment.app.FragmentStore getFragmentStore() {
            r1 = this;
            androidx.fragment.app.FragmentStore r0 = r1.mFragmentStore
            return r0
    }

    public java.util.List<androidx.fragment.app.Fragment> getFragments() {
            r1 = this;
            androidx.fragment.app.FragmentStore r0 = r1.mFragmentStore
            java.util.List r0 = r0.getFragments()
            return r0
    }

    public androidx.fragment.app.FragmentHostCallback<?> getHost() {
            r1 = this;
            androidx.fragment.app.FragmentHostCallback<?> r0 = r1.mHost
            return r0
    }

    android.view.LayoutInflater.Factory2 getLayoutInflaterFactory() {
            r1 = this;
            androidx.fragment.app.FragmentLayoutInflaterFactory r0 = r1.mLayoutInflaterFactory
            return r0
    }

    androidx.fragment.app.FragmentLifecycleCallbacksDispatcher getLifecycleCallbacksDispatcher() {
            r1 = this;
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r0 = r1.mLifecycleCallbacksDispatcher
            return r0
    }

    androidx.fragment.app.Fragment getParent() {
            r1 = this;
            androidx.fragment.app.Fragment r0 = r1.mParent
            return r0
    }

    public androidx.fragment.app.Fragment getPrimaryNavigationFragment() {
            r1 = this;
            androidx.fragment.app.Fragment r0 = r1.mPrimaryNav
            return r0
    }

    androidx.fragment.app.SpecialEffectsControllerFactory getSpecialEffectsControllerFactory() {
            r1 = this;
            androidx.fragment.app.SpecialEffectsControllerFactory r0 = r1.mSpecialEffectsControllerFactory
            if (r0 == 0) goto L7
            androidx.fragment.app.SpecialEffectsControllerFactory r0 = r1.mSpecialEffectsControllerFactory
            return r0
        L7:
            androidx.fragment.app.Fragment r0 = r1.mParent
            if (r0 == 0) goto L14
            androidx.fragment.app.Fragment r0 = r1.mParent
            androidx.fragment.app.FragmentManager r0 = r0.mFragmentManager
            androidx.fragment.app.SpecialEffectsControllerFactory r0 = r0.getSpecialEffectsControllerFactory()
            return r0
        L14:
            androidx.fragment.app.SpecialEffectsControllerFactory r0 = r1.mDefaultSpecialEffectsControllerFactory
            return r0
    }

    public androidx.fragment.app.strictmode.FragmentStrictMode.Policy getStrictModePolicy() {
            r1 = this;
            androidx.fragment.app.strictmode.FragmentStrictMode$Policy r0 = r1.mStrictModePolicy
            return r0
    }

    androidx.lifecycle.ViewModelStore getViewModelStore(androidx.fragment.app.Fragment r2) {
            r1 = this;
            androidx.fragment.app.FragmentManagerViewModel r0 = r1.mNonConfig
            androidx.lifecycle.ViewModelStore r0 = r0.getViewModelStore(r2)
            return r0
    }

    void handleOnBackPressed() {
            r9 = this;
            r0 = 1
            r9.mHandlingTransitioningOp = r0
            r9.execPendingActions(r0)
            r1 = 0
            r9.mHandlingTransitioningOp = r1
            boolean r2 = androidx.fragment.app.FragmentManager.USE_PREDICTIVE_BACK
            r3 = 3
            java.lang.String r4 = "FragmentManager"
            if (r2 == 0) goto Le9
            androidx.fragment.app.BackStackRecord r2 = r9.mTransitioningOp
            if (r2 == 0) goto Le9
            java.util.ArrayList<androidx.fragment.app.FragmentManager$OnBackStackChangedListener> r2 = r9.mBackStackChangeListeners
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L4e
            java.util.LinkedHashSet r2 = new java.util.LinkedHashSet
            androidx.fragment.app.BackStackRecord r5 = r9.mTransitioningOp
            java.util.Set r5 = r9.fragmentsFromRecord(r5)
            r2.<init>(r5)
            java.util.ArrayList<androidx.fragment.app.FragmentManager$OnBackStackChangedListener> r5 = r9.mBackStackChangeListeners
            java.util.Iterator r5 = r5.iterator()
        L2d:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L4e
            java.lang.Object r6 = r5.next()
            androidx.fragment.app.FragmentManager$OnBackStackChangedListener r6 = (androidx.fragment.app.FragmentManager.OnBackStackChangedListener) r6
            java.util.Iterator r7 = r2.iterator()
        L3d:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L4d
            java.lang.Object r8 = r7.next()
            androidx.fragment.app.Fragment r8 = (androidx.fragment.app.Fragment) r8
            r6.onBackStackChangeCommitted(r8, r0)
            goto L3d
        L4d:
            goto L2d
        L4e:
            androidx.fragment.app.BackStackRecord r2 = r9.mTransitioningOp
            java.util.ArrayList<androidx.fragment.app.FragmentTransaction$Op> r2 = r2.mOps
            java.util.Iterator r2 = r2.iterator()
        L56:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L69
            java.lang.Object r5 = r2.next()
            androidx.fragment.app.FragmentTransaction$Op r5 = (androidx.fragment.app.FragmentTransaction.Op) r5
            androidx.fragment.app.Fragment r6 = r5.mFragment
            if (r6 == 0) goto L68
            r6.mTransitioning = r1
        L68:
            goto L56
        L69:
            java.util.ArrayList r2 = new java.util.ArrayList
            androidx.fragment.app.BackStackRecord r5 = r9.mTransitioningOp
            java.util.List r5 = java.util.Collections.singletonList(r5)
            r2.<init>(r5)
            java.util.Set r0 = r9.collectChangedControllers(r2, r1, r0)
            java.util.Iterator r1 = r0.iterator()
        L7c:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L8c
            java.lang.Object r2 = r1.next()
            androidx.fragment.app.SpecialEffectsController r2 = (androidx.fragment.app.SpecialEffectsController) r2
            r2.completeBack()
            goto L7c
        L8c:
            androidx.fragment.app.BackStackRecord r1 = r9.mTransitioningOp
            java.util.ArrayList<androidx.fragment.app.FragmentTransaction$Op> r1 = r1.mOps
            java.util.Iterator r1 = r1.iterator()
        L94:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Lb1
            java.lang.Object r2 = r1.next()
            androidx.fragment.app.FragmentTransaction$Op r2 = (androidx.fragment.app.FragmentTransaction.Op) r2
            androidx.fragment.app.Fragment r5 = r2.mFragment
            if (r5 == 0) goto Lb0
            android.view.ViewGroup r6 = r5.mContainer
            if (r6 != 0) goto Lb0
        La9:
            androidx.fragment.app.FragmentStateManager r6 = r9.createOrGetFragmentStateManager(r5)
            r6.moveToExpectedState()
        Lb0:
            goto L94
        Lb1:
            r1 = 0
            r9.mTransitioningOp = r1
            r9.updateOnBackPressedCallbackEnabled()
            boolean r1 = isLoggingEnabled(r3)
            if (r1 == 0) goto Le8
            java.lang.String r1 = "Op is being set to null"
            android.util.Log.d(r4, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "OnBackPressedCallback enabled="
            java.lang.StringBuilder r1 = r1.append(r2)
            androidx.activity.OnBackPressedCallback r2 = r9.mOnBackPressedCallback
            boolean r2 = r2.isEnabled()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " for  FragmentManager "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r9)
            java.lang.String r1 = r1.toString()
            android.util.Log.d(r4, r1)
        Le8:
            goto L110
        Le9:
            androidx.activity.OnBackPressedCallback r0 = r9.mOnBackPressedCallback
            boolean r0 = r0.isEnabled()
            if (r0 == 0) goto L100
            boolean r0 = isLoggingEnabled(r3)
            if (r0 == 0) goto Lfc
            java.lang.String r0 = "Calling popBackStackImmediate via onBackPressed callback"
            android.util.Log.d(r4, r0)
        Lfc:
            r9.popBackStackImmediate()
            goto L110
        L100:
            boolean r0 = isLoggingEnabled(r3)
            if (r0 == 0) goto L10b
            java.lang.String r0 = "Calling onBackPressed via onBackPressed callback"
            android.util.Log.d(r4, r0)
        L10b:
            androidx.activity.OnBackPressedDispatcher r0 = r9.mOnBackPressedDispatcher
            r0.onBackPressed()
        L110:
            return
    }

    void hideFragment(androidx.fragment.app.Fragment r3) {
            r2 = this;
            r0 = 2
            boolean r0 = isLoggingEnabled(r0)
            if (r0 == 0) goto L1f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "hide: "
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.v(r1, r0)
        L1f:
            boolean r0 = r3.mHidden
            if (r0 != 0) goto L2e
            r0 = 1
            r3.mHidden = r0
            boolean r1 = r3.mHiddenChanged
            r0 = r0 ^ r1
            r3.mHiddenChanged = r0
            r2.setVisibleRemovingFragment(r3)
        L2e:
            return
    }

    void invalidateMenuForFragment(androidx.fragment.app.Fragment r2) {
            r1 = this;
            boolean r0 = r2.mAdded
            if (r0 == 0) goto Ld
            boolean r0 = r1.isMenuAvailable(r2)
            if (r0 == 0) goto Ld
            r0 = 1
            r1.mNeedMenuInvalidate = r0
        Ld:
            return
    }

    public boolean isDestroyed() {
            r1 = this;
            boolean r0 = r1.mDestroyed
            return r0
    }

    boolean isParentHidden(androidx.fragment.app.Fragment r2) {
            r1 = this;
            if (r2 != 0) goto L4
            r0 = 0
            return r0
        L4:
            boolean r0 = r2.isHidden()
            return r0
    }

    boolean isParentMenuVisible(androidx.fragment.app.Fragment r2) {
            r1 = this;
            if (r2 != 0) goto L4
            r0 = 1
            return r0
        L4:
            boolean r0 = r2.isMenuVisible()
            return r0
    }

    boolean isPrimaryNavigation(androidx.fragment.app.Fragment r5) {
            r4 = this;
            r0 = 1
            if (r5 != 0) goto L4
            return r0
        L4:
            androidx.fragment.app.FragmentManager r1 = r5.mFragmentManager
            androidx.fragment.app.Fragment r2 = r1.getPrimaryNavigationFragment()
            boolean r3 = r5.equals(r2)
            if (r3 == 0) goto L1a
            androidx.fragment.app.Fragment r3 = r1.mParent
            boolean r3 = r4.isPrimaryNavigation(r3)
            if (r3 == 0) goto L1a
            goto L1b
        L1a:
            r0 = 0
        L1b:
            return r0
    }

    boolean isStateAtLeast(int r2) {
            r1 = this;
            int r0 = r1.mCurState
            if (r0 < r2) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    public boolean isStateSaved() {
            r1 = this;
            boolean r0 = r1.mStateSaved
            if (r0 != 0) goto Lb
            boolean r0 = r1.mStopped
            if (r0 == 0) goto L9
            goto Lb
        L9:
            r0 = 0
            goto Lc
        Lb:
            r0 = 1
        Lc:
            return r0
    }

    /* JADX INFO: renamed from: lambda$attachController$5$androidx-fragment-app-FragmentManager, reason: not valid java name */
    /* synthetic */ android.os.Bundle m89lambda$attachController$5$androidxfragmentappFragmentManager() {
            r1 = this;
            android.os.Bundle r0 = r1.saveAllStateInternal()
            return r0
    }

    /* JADX INFO: renamed from: lambda$cancelBackStackTransition$4$androidx-fragment-app-FragmentManager, reason: not valid java name */
    /* synthetic */ void m90x2102d663() {
            r2 = this;
            java.util.ArrayList<androidx.fragment.app.FragmentManager$OnBackStackChangedListener> r0 = r2.mBackStackChangeListeners
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.FragmentManager$OnBackStackChangedListener r1 = (androidx.fragment.app.FragmentManager.OnBackStackChangedListener) r1
            r1.onBackStackChangeCancelled()
            goto L6
        L16:
            return
    }

    /* JADX INFO: renamed from: lambda$new$0$androidx-fragment-app-FragmentManager, reason: not valid java name */
    /* synthetic */ void m91lambda$new$0$androidxfragmentappFragmentManager(android.content.res.Configuration r2) {
            r1 = this;
            boolean r0 = r1.isParentAdded()
            if (r0 == 0) goto La
            r0 = 0
            r1.dispatchConfigurationChanged(r2, r0)
        La:
            return
    }

    /* JADX INFO: renamed from: lambda$new$1$androidx-fragment-app-FragmentManager, reason: not valid java name */
    /* synthetic */ void m92lambda$new$1$androidxfragmentappFragmentManager(java.lang.Integer r3) {
            r2 = this;
            boolean r0 = r2.isParentAdded()
            if (r0 == 0) goto L12
            int r0 = r3.intValue()
            r1 = 80
            if (r0 != r1) goto L12
            r0 = 0
            r2.dispatchLowMemory(r0)
        L12:
            return
    }

    /* JADX INFO: renamed from: lambda$new$2$androidx-fragment-app-FragmentManager, reason: not valid java name */
    /* synthetic */ void m93lambda$new$2$androidxfragmentappFragmentManager(androidx.core.app.MultiWindowModeChangedInfo r3) {
            r2 = this;
            boolean r0 = r2.isParentAdded()
            if (r0 == 0) goto Le
            boolean r0 = r3.isInMultiWindowMode()
            r1 = 0
            r2.dispatchMultiWindowModeChanged(r0, r1)
        Le:
            return
    }

    /* JADX INFO: renamed from: lambda$new$3$androidx-fragment-app-FragmentManager, reason: not valid java name */
    /* synthetic */ void m94lambda$new$3$androidxfragmentappFragmentManager(androidx.core.app.PictureInPictureModeChangedInfo r3) {
            r2 = this;
            boolean r0 = r2.isParentAdded()
            if (r0 == 0) goto Le
            boolean r0 = r3.isInPictureInPictureMode()
            r1 = 0
            r2.dispatchPictureInPictureModeChanged(r0, r1)
        Le:
            return
    }

    void launchRequestPermissions(androidx.fragment.app.Fragment r3, java.lang.String[] r4, int r5) {
            r2 = this;
            androidx.activity.result.ActivityResultLauncher<java.lang.String[]> r0 = r2.mRequestPermissions
            if (r0 == 0) goto L16
            androidx.fragment.app.FragmentManager$LaunchedFragmentInfo r0 = new androidx.fragment.app.FragmentManager$LaunchedFragmentInfo
            java.lang.String r1 = r3.mWho
            r0.<init>(r1, r5)
            java.util.ArrayDeque<androidx.fragment.app.FragmentManager$LaunchedFragmentInfo> r1 = r2.mLaunchedFragments
            r1.addLast(r0)
            androidx.activity.result.ActivityResultLauncher<java.lang.String[]> r1 = r2.mRequestPermissions
            r1.launch(r4)
            goto L1b
        L16:
            androidx.fragment.app.FragmentHostCallback<?> r0 = r2.mHost
            r0.onRequestPermissionsFromFragment(r3, r4, r5)
        L1b:
            return
    }

    void launchStartActivityForResult(androidx.fragment.app.Fragment r3, android.content.Intent r4, int r5, android.os.Bundle r6) {
            r2 = this;
            androidx.activity.result.ActivityResultLauncher<android.content.Intent> r0 = r2.mStartActivityForResult
            if (r0 == 0) goto L1d
            androidx.fragment.app.FragmentManager$LaunchedFragmentInfo r0 = new androidx.fragment.app.FragmentManager$LaunchedFragmentInfo
            java.lang.String r1 = r3.mWho
            r0.<init>(r1, r5)
            java.util.ArrayDeque<androidx.fragment.app.FragmentManager$LaunchedFragmentInfo> r1 = r2.mLaunchedFragments
            r1.addLast(r0)
            if (r6 == 0) goto L17
            java.lang.String r1 = "androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE"
            r4.putExtra(r1, r6)
        L17:
            androidx.activity.result.ActivityResultLauncher<android.content.Intent> r1 = r2.mStartActivityForResult
            r1.launch(r4)
            goto L22
        L1d:
            androidx.fragment.app.FragmentHostCallback<?> r0 = r2.mHost
            r0.onStartActivityFromFragment(r3, r4, r5, r6)
        L22:
            return
    }

    void launchStartIntentSenderForResult(androidx.fragment.app.Fragment r10, android.content.IntentSender r11, int r12, android.content.Intent r13, int r14, int r15, int r16, android.os.Bundle r17) throws android.content.IntentSender.SendIntentException {
            r9 = this;
            r8 = r17
            androidx.activity.result.ActivityResultLauncher<androidx.activity.result.IntentSenderRequest> r0 = r9.mStartIntentSenderForResult
            if (r0 == 0) goto L96
            java.lang.String r0 = "FragmentManager"
            r1 = 2
            if (r8 == 0) goto L50
            if (r13 != 0) goto L19
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            java.lang.String r3 = "androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE"
            r4 = 1
            r2.putExtra(r3, r4)
            goto L1a
        L19:
            r2 = r13
        L1a:
            boolean r3 = isLoggingEnabled(r1)
            if (r3 == 0) goto L4a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "ActivityOptions "
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r3 = r3.append(r8)
            java.lang.String r4 = " were added to fillInIntent "
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r3 = r3.append(r2)
            java.lang.String r4 = " for fragment "
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r3 = r3.append(r10)
            java.lang.String r3 = r3.toString()
            android.util.Log.v(r0, r3)
        L4a:
            java.lang.String r3 = "androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE"
            r2.putExtra(r3, r8)
            goto L51
        L50:
            r2 = r13
        L51:
            androidx.activity.result.IntentSenderRequest$Builder r3 = new androidx.activity.result.IntentSenderRequest$Builder
            r3.<init>(r11)
            androidx.activity.result.IntentSenderRequest$Builder r3 = r3.setFillInIntent(r2)
            androidx.activity.result.IntentSenderRequest$Builder r3 = r3.setFlags(r15, r14)
            androidx.activity.result.IntentSenderRequest r3 = r3.build()
            androidx.fragment.app.FragmentManager$LaunchedFragmentInfo r4 = new androidx.fragment.app.FragmentManager$LaunchedFragmentInfo
            java.lang.String r7 = r10.mWho
            r4.<init>(r7, r12)
            java.util.ArrayDeque<androidx.fragment.app.FragmentManager$LaunchedFragmentInfo> r7 = r9.mLaunchedFragments
            r7.addLast(r4)
            boolean r1 = isLoggingEnabled(r1)
            if (r1 == 0) goto L90
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r7 = "Fragment "
            java.lang.StringBuilder r1 = r1.append(r7)
            java.lang.StringBuilder r1 = r1.append(r10)
            java.lang.String r7 = "is launching an IntentSender for result "
            java.lang.StringBuilder r1 = r1.append(r7)
            java.lang.String r1 = r1.toString()
            android.util.Log.v(r0, r1)
        L90:
            androidx.activity.result.ActivityResultLauncher<androidx.activity.result.IntentSenderRequest> r0 = r9.mStartIntentSenderForResult
            r0.launch(r3)
            goto La4
        L96:
            androidx.fragment.app.FragmentHostCallback<?> r0 = r9.mHost
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            r0.onStartIntentSenderFromFragment(r1, r2, r3, r4, r5, r6, r7, r8)
            r2 = r13
        La4:
            return
    }

    void moveToState(int r3, boolean r4) {
            r2 = this;
            androidx.fragment.app.FragmentHostCallback<?> r0 = r2.mHost
            if (r0 != 0) goto L10
            r0 = -1
            if (r3 != r0) goto L8
            goto L10
        L8:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "No activity"
            r0.<init>(r1)
            throw r0
        L10:
            if (r4 != 0) goto L17
            int r0 = r2.mCurState
            if (r3 != r0) goto L17
            return
        L17:
            r2.mCurState = r3
            androidx.fragment.app.FragmentStore r0 = r2.mFragmentStore
            r0.moveToExpectedState()
            r2.startPendingDeferredFragments()
            boolean r0 = r2.mNeedMenuInvalidate
            if (r0 == 0) goto L36
            androidx.fragment.app.FragmentHostCallback<?> r0 = r2.mHost
            if (r0 == 0) goto L36
            int r0 = r2.mCurState
            r1 = 7
            if (r0 != r1) goto L36
            androidx.fragment.app.FragmentHostCallback<?> r0 = r2.mHost
            r0.onSupportInvalidateOptionsMenu()
            r0 = 0
            r2.mNeedMenuInvalidate = r0
        L36:
            return
    }

    void noteStateNotSaved() {
            r2 = this;
            androidx.fragment.app.FragmentHostCallback<?> r0 = r2.mHost
            if (r0 != 0) goto L5
            return
        L5:
            r0 = 0
            r2.mStateSaved = r0
            r2.mStopped = r0
            androidx.fragment.app.FragmentManagerViewModel r1 = r2.mNonConfig
            r1.setIsStateSaved(r0)
            androidx.fragment.app.FragmentStore r0 = r2.mFragmentStore
            java.util.List r0 = r0.getFragments()
            java.util.Iterator r0 = r0.iterator()
        L19:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2b
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            if (r1 == 0) goto L2a
            r1.noteStateNotSaved()
        L2a:
            goto L19
        L2b:
            return
    }

    public final void onContainerAvailable(androidx.fragment.app.FragmentContainerView r6) {
            r5 = this;
            androidx.fragment.app.FragmentStore r0 = r5.mFragmentStore
            java.util.List r0 = r0.getActiveFragmentStateManagers()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L37
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.FragmentStateManager r1 = (androidx.fragment.app.FragmentStateManager) r1
            androidx.fragment.app.Fragment r2 = r1.getFragment()
            int r3 = r2.mContainerId
            int r4 = r6.getId()
            if (r3 != r4) goto L36
            android.view.View r3 = r2.mView
            if (r3 == 0) goto L36
            android.view.View r3 = r2.mView
            android.view.ViewParent r3 = r3.getParent()
            if (r3 != 0) goto L36
            r2.mContainer = r6
            r1.addViewToContainer()
            r1.moveToExpectedState()
        L36:
            goto La
        L37:
            return
    }

    @java.lang.Deprecated
    public androidx.fragment.app.FragmentTransaction openTransaction() {
            r1 = this;
            androidx.fragment.app.FragmentTransaction r0 = r1.beginTransaction()
            return r0
    }

    void performPendingDeferredStart(androidx.fragment.app.FragmentStateManager r3) {
            r2 = this;
            androidx.fragment.app.Fragment r0 = r3.getFragment()
            boolean r1 = r0.mDeferStart
            if (r1 == 0) goto L16
            boolean r1 = r2.mExecutingActions
            if (r1 == 0) goto L10
            r1 = 1
            r2.mHavePendingDeferredStart = r1
            return
        L10:
            r1 = 0
            r0.mDeferStart = r1
            r3.moveToExpectedState()
        L16:
            return
    }

    public void popBackStack() {
            r4 = this;
            androidx.fragment.app.FragmentManager$PopBackStackState r0 = new androidx.fragment.app.FragmentManager$PopBackStackState
            r1 = 0
            r2 = -1
            r3 = 0
            r0.<init>(r4, r1, r2, r3)
            r4.enqueueAction(r0, r3)
            return
    }

    public void popBackStack(int r2, int r3) {
            r1 = this;
            r0 = 0
            r1.popBackStack(r2, r3, r0)
            return
    }

    void popBackStack(int r4, int r5, boolean r6) {
            r3 = this;
            if (r4 < 0) goto Lc
            androidx.fragment.app.FragmentManager$PopBackStackState r0 = new androidx.fragment.app.FragmentManager$PopBackStackState
            r1 = 0
            r0.<init>(r3, r1, r4, r5)
            r3.enqueueAction(r0, r6)
            return
        Lc:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Bad id: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r4)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public void popBackStack(java.lang.String r3, int r4) {
            r2 = this;
            androidx.fragment.app.FragmentManager$PopBackStackState r0 = new androidx.fragment.app.FragmentManager$PopBackStackState
            r1 = -1
            r0.<init>(r2, r3, r1, r4)
            r1 = 0
            r2.enqueueAction(r0, r1)
            return
    }

    public boolean popBackStackImmediate() {
            r3 = this;
            r0 = -1
            r1 = 0
            r2 = 0
            boolean r0 = r3.popBackStackImmediate(r2, r0, r1)
            return r0
    }

    public boolean popBackStackImmediate(int r4, int r5) {
            r3 = this;
            if (r4 < 0) goto L8
            r0 = 0
            boolean r0 = r3.popBackStackImmediate(r0, r4, r5)
            return r0
        L8:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Bad id: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r4)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public boolean popBackStackImmediate(java.lang.String r2, int r3) {
            r1 = this;
            r0 = -1
            boolean r0 = r1.popBackStackImmediate(r2, r0, r3)
            return r0
    }

    boolean popBackStackState(java.util.ArrayList<androidx.fragment.app.BackStackRecord> r5, java.util.ArrayList<java.lang.Boolean> r6, java.lang.String r7, int r8, int r9) {
            r4 = this;
            r0 = r9 & 1
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L8
            r0 = r2
            goto L9
        L8:
            r0 = r1
        L9:
            int r0 = r4.findBackStackIndex(r7, r8, r0)
            if (r0 >= 0) goto L10
            return r1
        L10:
            java.util.ArrayList<androidx.fragment.app.BackStackRecord> r1 = r4.mBackStack
            int r1 = r1.size()
            int r1 = r1 - r2
        L17:
            if (r1 < r0) goto L2e
            java.util.ArrayList<androidx.fragment.app.BackStackRecord> r3 = r4.mBackStack
            java.lang.Object r3 = r3.remove(r1)
            androidx.fragment.app.BackStackRecord r3 = (androidx.fragment.app.BackStackRecord) r3
            r5.add(r3)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r2)
            r6.add(r3)
            int r1 = r1 + (-1)
            goto L17
        L2e:
            return r2
    }

    boolean prepareBackStackState(java.util.ArrayList<androidx.fragment.app.BackStackRecord> r11, java.util.ArrayList<java.lang.Boolean> r12) {
            r10 = this;
            r0 = 2
            boolean r0 = isLoggingEnabled(r0)
            java.lang.String r1 = "FragmentManager"
            if (r0 == 0) goto L21
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "FragmentManager has the following pending actions inside of prepareBackStackState: "
            java.lang.StringBuilder r0 = r0.append(r2)
            java.util.ArrayList<androidx.fragment.app.FragmentManager$OpGenerator> r2 = r10.mPendingActions
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r0 = r0.toString()
            android.util.Log.v(r1, r0)
        L21:
            java.util.ArrayList<androidx.fragment.app.BackStackRecord> r0 = r10.mBackStack
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L30
            java.lang.String r0 = "Ignoring call to start back stack pop because the back stack is empty."
            android.util.Log.i(r1, r0)
            r0 = 0
            return r0
        L30:
            java.util.ArrayList<androidx.fragment.app.BackStackRecord> r0 = r10.mBackStack
            java.util.ArrayList<androidx.fragment.app.BackStackRecord> r1 = r10.mBackStack
            int r1 = r1.size()
            r2 = 1
            int r1 = r1 - r2
            java.lang.Object r0 = r0.get(r1)
            androidx.fragment.app.BackStackRecord r0 = (androidx.fragment.app.BackStackRecord) r0
            r10.mTransitioningOp = r0
            androidx.fragment.app.BackStackRecord r0 = r10.mTransitioningOp
            java.util.ArrayList<androidx.fragment.app.FragmentTransaction$Op> r0 = r0.mOps
            java.util.Iterator r0 = r0.iterator()
        L4a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L5f
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.FragmentTransaction$Op r1 = (androidx.fragment.app.FragmentTransaction.Op) r1
            androidx.fragment.app.Fragment r3 = r1.mFragment
            if (r3 == 0) goto L5e
            androidx.fragment.app.Fragment r3 = r1.mFragment
            r3.mTransitioning = r2
        L5e:
            goto L4a
        L5f:
            r8 = -1
            r9 = 0
            r7 = 0
            r4 = r10
            r5 = r11
            r6 = r12
            boolean r11 = r4.popBackStackState(r5, r6, r7, r8, r9)
            return r11
    }

    void prepareBackStackTransition() {
            r2 = this;
            androidx.fragment.app.FragmentManager$PrepareBackStackTransitionState r0 = new androidx.fragment.app.FragmentManager$PrepareBackStackTransitionState
            r0.<init>(r2)
            r1 = 0
            r2.enqueueAction(r0, r1)
            return
    }

    public void putFragment(android.os.Bundle r4, java.lang.String r5, androidx.fragment.app.Fragment r6) {
            r3 = this;
            androidx.fragment.app.FragmentManager r0 = r6.mFragmentManager
            if (r0 == r3) goto L25
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Fragment "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r6)
            java.lang.String r2 = " is not currently in the FragmentManager"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            r3.throwException(r0)
        L25:
            java.lang.String r0 = r6.mWho
            r4.putString(r5, r0)
            return
    }

    public void registerFragmentLifecycleCallbacks(androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks r2, boolean r3) {
            r1 = this;
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r0 = r1.mLifecycleCallbacksDispatcher
            r0.registerFragmentLifecycleCallbacks(r2, r3)
            return
    }

    void removeFragment(androidx.fragment.app.Fragment r4) {
            r3 = this;
            r0 = 2
            boolean r0 = isLoggingEnabled(r0)
            if (r0 == 0) goto L2b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "remove: "
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r4)
            java.lang.String r1 = " nesting="
            java.lang.StringBuilder r0 = r0.append(r1)
            int r1 = r4.mBackStackNesting
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.v(r1, r0)
        L2b:
            boolean r0 = r4.isInBackStack()
            r1 = 1
            r0 = r0 ^ r1
            boolean r2 = r4.mDetached
            if (r2 == 0) goto L37
            if (r0 == 0) goto L49
        L37:
            androidx.fragment.app.FragmentStore r2 = r3.mFragmentStore
            r2.removeFragment(r4)
            boolean r2 = r3.isMenuAvailable(r4)
            if (r2 == 0) goto L44
            r3.mNeedMenuInvalidate = r1
        L44:
            r4.mRemoving = r1
            r3.setVisibleRemovingFragment(r4)
        L49:
            return
    }

    public void removeFragmentOnAttachListener(androidx.fragment.app.FragmentOnAttachListener r2) {
            r1 = this;
            java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.FragmentOnAttachListener> r0 = r1.mOnAttachListeners
            r0.remove(r2)
            return
    }

    public void removeOnBackStackChangedListener(androidx.fragment.app.FragmentManager.OnBackStackChangedListener r2) {
            r1 = this;
            java.util.ArrayList<androidx.fragment.app.FragmentManager$OnBackStackChangedListener> r0 = r1.mBackStackChangeListeners
            r0.remove(r2)
            return
    }

    void removeRetainedFragment(androidx.fragment.app.Fragment r2) {
            r1 = this;
            androidx.fragment.app.FragmentManagerViewModel r0 = r1.mNonConfig
            r0.removeRetainedFragment(r2)
            return
    }

    void restoreAllState(android.os.Parcelable r3, androidx.fragment.app.FragmentManagerNonConfig r4) {
            r2 = this;
            androidx.fragment.app.FragmentHostCallback<?> r0 = r2.mHost
            boolean r0 = r0 instanceof androidx.lifecycle.ViewModelStoreOwner
            if (r0 == 0) goto L10
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "You must use restoreSaveState when your FragmentHostCallback implements ViewModelStoreOwner"
            r0.<init>(r1)
            r2.throwException(r0)
        L10:
            androidx.fragment.app.FragmentManagerViewModel r0 = r2.mNonConfig
            r0.restoreFromSnapshot(r4)
            r2.restoreSaveStateInternal(r3)
            return
    }

    public void restoreBackStack(java.lang.String r3) {
            r2 = this;
            androidx.fragment.app.FragmentManager$RestoreBackStackState r0 = new androidx.fragment.app.FragmentManager$RestoreBackStackState
            r0.<init>(r2, r3)
            r1 = 0
            r2.enqueueAction(r0, r1)
            return
    }

    boolean restoreBackStackState(java.util.ArrayList<androidx.fragment.app.BackStackRecord> r10, java.util.ArrayList<java.lang.Boolean> r11, java.lang.String r12) {
            r9 = this;
            java.util.Map<java.lang.String, androidx.fragment.app.BackStackState> r0 = r9.mBackStackStates
            java.lang.Object r0 = r0.remove(r12)
            androidx.fragment.app.BackStackState r0 = (androidx.fragment.app.BackStackState) r0
            r1 = 0
            if (r0 != 0) goto Lc
            return r1
        Lc:
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            java.util.Iterator r3 = r10.iterator()
        L15:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L46
            java.lang.Object r4 = r3.next()
            androidx.fragment.app.BackStackRecord r4 = (androidx.fragment.app.BackStackRecord) r4
            boolean r5 = r4.mBeingSaved
            if (r5 == 0) goto L45
            java.util.ArrayList<androidx.fragment.app.FragmentTransaction$Op> r5 = r4.mOps
            java.util.Iterator r5 = r5.iterator()
        L2b:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L45
            java.lang.Object r6 = r5.next()
            androidx.fragment.app.FragmentTransaction$Op r6 = (androidx.fragment.app.FragmentTransaction.Op) r6
            androidx.fragment.app.Fragment r7 = r6.mFragment
            if (r7 == 0) goto L44
            androidx.fragment.app.Fragment r7 = r6.mFragment
            java.lang.String r7 = r7.mWho
            androidx.fragment.app.Fragment r8 = r6.mFragment
            r2.put(r7, r8)
        L44:
            goto L2b
        L45:
            goto L15
        L46:
            java.util.List r3 = r0.instantiate(r9, r2)
            r4 = 0
            java.util.Iterator r5 = r3.iterator()
        L4f:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L69
            java.lang.Object r6 = r5.next()
            androidx.fragment.app.BackStackRecord r6 = (androidx.fragment.app.BackStackRecord) r6
            boolean r7 = r6.generateOps(r10, r11)
            if (r7 != 0) goto L66
            if (r4 == 0) goto L64
            goto L66
        L64:
            r7 = r1
            goto L67
        L66:
            r7 = 1
        L67:
            r4 = r7
            goto L4f
        L69:
            return r4
    }

    void restoreSaveState(android.os.Parcelable r3) {
            r2 = this;
            androidx.fragment.app.FragmentHostCallback<?> r0 = r2.mHost
            boolean r0 = r0 instanceof androidx.savedstate.SavedStateRegistryOwner
            if (r0 == 0) goto L10
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "You cannot use restoreSaveState when your FragmentHostCallback implements SavedStateRegistryOwner."
            r0.<init>(r1)
            r2.throwException(r0)
        L10:
            r2.restoreSaveStateInternal(r3)
            return
    }

    void restoreSaveStateInternal(android.os.Parcelable r20) {
            r19 = this;
            r0 = r19
            if (r20 != 0) goto L5
            return
        L5:
            r1 = r20
            android.os.Bundle r1 = (android.os.Bundle) r1
            java.util.Set r2 = r1.keySet()
            java.util.Iterator r2 = r2.iterator()
        L11:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L46
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r4 = "result_"
            boolean r5 = r3.startsWith(r4)
            if (r5 == 0) goto L45
            android.os.Bundle r5 = r1.getBundle(r3)
            if (r5 == 0) goto L45
            androidx.fragment.app.FragmentHostCallback<?> r6 = r0.mHost
            android.content.Context r6 = r6.getContext()
            java.lang.ClassLoader r6 = r6.getClassLoader()
            r5.setClassLoader(r6)
            int r4 = r4.length()
            java.lang.String r4 = r3.substring(r4)
            java.util.Map<java.lang.String, android.os.Bundle> r6 = r0.mResults
            r6.put(r4, r5)
        L45:
            goto L11
        L46:
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            java.util.Set r3 = r1.keySet()
            java.util.Iterator r3 = r3.iterator()
        L53:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L86
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r5 = "fragment_"
            boolean r6 = r4.startsWith(r5)
            if (r6 == 0) goto L85
            android.os.Bundle r6 = r1.getBundle(r4)
            if (r6 == 0) goto L85
            androidx.fragment.app.FragmentHostCallback<?> r7 = r0.mHost
            android.content.Context r7 = r7.getContext()
            java.lang.ClassLoader r7 = r7.getClassLoader()
            r6.setClassLoader(r7)
            int r5 = r5.length()
            java.lang.String r5 = r4.substring(r5)
            r2.put(r5, r6)
        L85:
            goto L53
        L86:
            androidx.fragment.app.FragmentStore r3 = r0.mFragmentStore
            r3.restoreSaveState(r2)
            java.lang.String r3 = "state"
            android.os.Parcelable r4 = r1.getParcelable(r3)
            androidx.fragment.app.FragmentManagerState r4 = (androidx.fragment.app.FragmentManagerState) r4
            if (r4 != 0) goto L96
            return
        L96:
            androidx.fragment.app.FragmentStore r5 = r0.mFragmentStore
            r5.resetActiveFragments()
            java.util.ArrayList<java.lang.String> r5 = r4.mActive
            java.util.Iterator r5 = r5.iterator()
        La1:
            boolean r6 = r5.hasNext()
            java.lang.String r7 = "): "
            r8 = 2
            java.lang.String r9 = "FragmentManager"
            if (r6 == 0) goto L15f
            java.lang.Object r6 = r5.next()
            java.lang.String r6 = (java.lang.String) r6
            androidx.fragment.app.FragmentStore r10 = r0.mFragmentStore
            r11 = 0
            android.os.Bundle r10 = r10.setSavedState(r6, r11)
            if (r10 == 0) goto L15d
            android.os.Parcelable r11 = r10.getParcelable(r3)
            androidx.fragment.app.FragmentState r11 = (androidx.fragment.app.FragmentState) r11
            androidx.fragment.app.FragmentManagerViewModel r12 = r0.mNonConfig
            java.lang.String r13 = r11.mWho
            androidx.fragment.app.Fragment r12 = r12.findRetainedFragmentByWho(r13)
            if (r12 == 0) goto Lf4
            boolean r13 = isLoggingEnabled(r8)
            if (r13 == 0) goto Le7
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = "restoreSaveState: re-attaching retained "
            java.lang.StringBuilder r13 = r13.append(r14)
            java.lang.StringBuilder r13 = r13.append(r12)
            java.lang.String r13 = r13.toString()
            android.util.Log.v(r9, r13)
        Le7:
            androidx.fragment.app.FragmentStateManager r13 = new androidx.fragment.app.FragmentStateManager
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r14 = r0.mLifecycleCallbacksDispatcher
            androidx.fragment.app.FragmentStore r15 = r0.mFragmentStore
            r13.<init>(r14, r15, r12, r10)
            r18 = r8
            r8 = r12
            goto L118
        Lf4:
            r13 = r12
            androidx.fragment.app.FragmentStateManager r12 = new androidx.fragment.app.FragmentStateManager
            r14 = r13
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r13 = r0.mLifecycleCallbacksDispatcher
            r15 = r14
            androidx.fragment.app.FragmentStore r14 = r0.mFragmentStore
            r18 = r8
            androidx.fragment.app.FragmentHostCallback<?> r8 = r0.mHost
            android.content.Context r8 = r8.getContext()
            java.lang.ClassLoader r8 = r8.getClassLoader()
            androidx.fragment.app.FragmentFactory r16 = r0.getFragmentFactory()
            r17 = r15
            r15 = r8
            r8 = r17
            r17 = r10
            r12.<init>(r13, r14, r15, r16, r17)
            r13 = r12
        L118:
            androidx.fragment.app.Fragment r12 = r13.getFragment()
            r12.mSavedFragmentState = r10
            r12.mFragmentManager = r0
            boolean r14 = isLoggingEnabled(r18)
            if (r14 == 0) goto L146
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r15 = "restoreSaveState: active ("
            java.lang.StringBuilder r14 = r14.append(r15)
            java.lang.String r15 = r12.mWho
            java.lang.StringBuilder r14 = r14.append(r15)
            java.lang.StringBuilder r7 = r14.append(r7)
            java.lang.StringBuilder r7 = r7.append(r12)
            java.lang.String r7 = r7.toString()
            android.util.Log.v(r9, r7)
        L146:
            androidx.fragment.app.FragmentHostCallback<?> r7 = r0.mHost
            android.content.Context r7 = r7.getContext()
            java.lang.ClassLoader r7 = r7.getClassLoader()
            r13.restoreState(r7)
            androidx.fragment.app.FragmentStore r7 = r0.mFragmentStore
            r7.makeActive(r13)
            int r7 = r0.mCurState
            r13.setFragmentManagerState(r7)
        L15d:
            goto La1
        L15f:
            r18 = r8
            androidx.fragment.app.FragmentManagerViewModel r3 = r0.mNonConfig
            java.util.Collection r3 = r3.getRetainedFragments()
            java.util.Iterator r3 = r3.iterator()
        L16b:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L1c6
            java.lang.Object r5 = r3.next()
            androidx.fragment.app.Fragment r5 = (androidx.fragment.app.Fragment) r5
            androidx.fragment.app.FragmentStore r6 = r0.mFragmentStore
            java.lang.String r8 = r5.mWho
            boolean r6 = r6.containsActiveFragment(r8)
            if (r6 != 0) goto L1c5
            boolean r6 = isLoggingEnabled(r18)
            if (r6 == 0) goto L1a9
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r8 = "Discarding retained Fragment "
            java.lang.StringBuilder r6 = r6.append(r8)
            java.lang.StringBuilder r6 = r6.append(r5)
            java.lang.String r8 = " that was not found in the set of active Fragments "
            java.lang.StringBuilder r6 = r6.append(r8)
            java.util.ArrayList<java.lang.String> r8 = r4.mActive
            java.lang.StringBuilder r6 = r6.append(r8)
            java.lang.String r6 = r6.toString()
            android.util.Log.v(r9, r6)
        L1a9:
            androidx.fragment.app.FragmentManagerViewModel r6 = r0.mNonConfig
            r6.removeRetainedFragment(r5)
            r5.mFragmentManager = r0
            androidx.fragment.app.FragmentStateManager r6 = new androidx.fragment.app.FragmentStateManager
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r8 = r0.mLifecycleCallbacksDispatcher
            androidx.fragment.app.FragmentStore r10 = r0.mFragmentStore
            r6.<init>(r8, r10, r5)
            r8 = 1
            r6.setFragmentManagerState(r8)
            r6.moveToExpectedState()
            r5.mRemoving = r8
            r6.moveToExpectedState()
        L1c5:
            goto L16b
        L1c6:
            androidx.fragment.app.FragmentStore r3 = r0.mFragmentStore
            java.util.ArrayList<java.lang.String> r5 = r4.mAdded
            r3.restoreAddedFragments(r5)
            androidx.fragment.app.BackStackRecordState[] r3 = r4.mBackStack
            if (r3 == 0) goto L235
            java.util.ArrayList r3 = new java.util.ArrayList
            androidx.fragment.app.BackStackRecordState[] r5 = r4.mBackStack
            int r5 = r5.length
            r3.<init>(r5)
            r0.mBackStack = r3
            r3 = 0
        L1dc:
            androidx.fragment.app.BackStackRecordState[] r5 = r4.mBackStack
            int r5 = r5.length
            if (r3 >= r5) goto L234
            androidx.fragment.app.BackStackRecordState[] r5 = r4.mBackStack
            r5 = r5[r3]
            androidx.fragment.app.BackStackRecord r5 = r5.instantiate(r0)
            boolean r6 = isLoggingEnabled(r18)
            if (r6 == 0) goto L22c
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r8 = "restoreAllState: back stack #"
            java.lang.StringBuilder r6 = r6.append(r8)
            java.lang.StringBuilder r6 = r6.append(r3)
            java.lang.String r8 = " (index "
            java.lang.StringBuilder r6 = r6.append(r8)
            int r8 = r5.mIndex
            java.lang.StringBuilder r6 = r6.append(r8)
            java.lang.StringBuilder r6 = r6.append(r7)
            java.lang.StringBuilder r6 = r6.append(r5)
            java.lang.String r6 = r6.toString()
            android.util.Log.v(r9, r6)
            androidx.fragment.app.LogWriter r6 = new androidx.fragment.app.LogWriter
            r6.<init>(r9)
            java.io.PrintWriter r8 = new java.io.PrintWriter
            r8.<init>(r6)
            java.lang.String r10 = "  "
            r11 = 0
            r5.dump(r10, r8, r11)
            r8.close()
        L22c:
            java.util.ArrayList<androidx.fragment.app.BackStackRecord> r6 = r0.mBackStack
            r6.add(r5)
            int r3 = r3 + 1
            goto L1dc
        L234:
            goto L23c
        L235:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r0.mBackStack = r3
        L23c:
            java.util.concurrent.atomic.AtomicInteger r3 = r0.mBackStackIndex
            int r5 = r4.mBackStackIndex
            r3.set(r5)
            java.lang.String r3 = r4.mPrimaryNavActiveWho
            if (r3 == 0) goto L254
            java.lang.String r3 = r4.mPrimaryNavActiveWho
            androidx.fragment.app.Fragment r3 = r0.findActiveFragment(r3)
            r0.mPrimaryNav = r3
            androidx.fragment.app.Fragment r3 = r0.mPrimaryNav
            r0.dispatchParentPrimaryNavigationFragmentChanged(r3)
        L254:
            java.util.ArrayList<java.lang.String> r3 = r4.mBackStackStateKeys
            if (r3 == 0) goto L275
            r5 = 0
        L259:
            int r6 = r3.size()
            if (r5 >= r6) goto L275
            java.util.Map<java.lang.String, androidx.fragment.app.BackStackState> r6 = r0.mBackStackStates
            java.lang.Object r7 = r3.get(r5)
            java.lang.String r7 = (java.lang.String) r7
            java.util.ArrayList<androidx.fragment.app.BackStackState> r8 = r4.mBackStackStates
            java.lang.Object r8 = r8.get(r5)
            androidx.fragment.app.BackStackState r8 = (androidx.fragment.app.BackStackState) r8
            r6.put(r7, r8)
            int r5 = r5 + 1
            goto L259
        L275:
            java.util.ArrayDeque r5 = new java.util.ArrayDeque
            java.util.ArrayList<androidx.fragment.app.FragmentManager$LaunchedFragmentInfo> r6 = r4.mLaunchedFragments
            r5.<init>(r6)
            r0.mLaunchedFragments = r5
            return
    }

    @java.lang.Deprecated
    androidx.fragment.app.FragmentManagerNonConfig retainNonConfig() {
            r2 = this;
            androidx.fragment.app.FragmentHostCallback<?> r0 = r2.mHost
            boolean r0 = r0 instanceof androidx.lifecycle.ViewModelStoreOwner
            if (r0 == 0) goto L10
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "You cannot use retainNonConfig when your FragmentHostCallback implements ViewModelStoreOwner."
            r0.<init>(r1)
            r2.throwException(r0)
        L10:
            androidx.fragment.app.FragmentManagerViewModel r0 = r2.mNonConfig
            androidx.fragment.app.FragmentManagerNonConfig r0 = r0.getSnapshot()
            return r0
    }

    android.os.Parcelable saveAllState() {
            r2 = this;
            androidx.fragment.app.FragmentHostCallback<?> r0 = r2.mHost
            boolean r0 = r0 instanceof androidx.savedstate.SavedStateRegistryOwner
            if (r0 == 0) goto L10
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "You cannot use saveAllState when your FragmentHostCallback implements SavedStateRegistryOwner."
            r0.<init>(r1)
            r2.throwException(r0)
        L10:
            android.os.Bundle r0 = r2.saveAllStateInternal()
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L1c
            r1 = 0
            goto L1d
        L1c:
            r1 = r0
        L1d:
            return r1
    }

    android.os.Bundle saveAllStateInternal() {
            r11 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            r11.forcePostponedTransactions()
            r11.endAnimatingAwayFragments()
            r1 = 1
            r11.execPendingActions(r1)
            r11.mStateSaved = r1
            androidx.fragment.app.FragmentManagerViewModel r2 = r11.mNonConfig
            r2.setIsStateSaved(r1)
            androidx.fragment.app.FragmentStore r1 = r11.mFragmentStore
            java.util.ArrayList r1 = r1.saveActiveFragments()
            androidx.fragment.app.FragmentStore r2 = r11.mFragmentStore
            java.util.HashMap r2 = r2.getAllSavedState()
            boolean r3 = r2.isEmpty()
            java.lang.String r4 = "FragmentManager"
            r5 = 2
            if (r3 == 0) goto L38
            boolean r3 = isLoggingEnabled(r5)
            if (r3 == 0) goto L131
            java.lang.String r3 = "saveAllState: no fragments!"
            android.util.Log.v(r4, r3)
            goto L131
        L38:
            androidx.fragment.app.FragmentStore r3 = r11.mFragmentStore
            java.util.ArrayList r3 = r3.saveAddedFragments()
            r6 = 0
            java.util.ArrayList<androidx.fragment.app.BackStackRecord> r7 = r11.mBackStack
            int r7 = r7.size()
            if (r7 <= 0) goto L8a
            androidx.fragment.app.BackStackRecordState[] r6 = new androidx.fragment.app.BackStackRecordState[r7]
            r8 = 0
        L4a:
            if (r8 >= r7) goto L8a
            androidx.fragment.app.BackStackRecordState r9 = new androidx.fragment.app.BackStackRecordState
            java.util.ArrayList<androidx.fragment.app.BackStackRecord> r10 = r11.mBackStack
            java.lang.Object r10 = r10.get(r8)
            androidx.fragment.app.BackStackRecord r10 = (androidx.fragment.app.BackStackRecord) r10
            r9.<init>(r10)
            r6[r8] = r9
            boolean r9 = isLoggingEnabled(r5)
            if (r9 == 0) goto L87
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "saveAllState: adding back stack #"
            java.lang.StringBuilder r9 = r9.append(r10)
            java.lang.StringBuilder r9 = r9.append(r8)
            java.lang.String r10 = ": "
            java.lang.StringBuilder r9 = r9.append(r10)
            java.util.ArrayList<androidx.fragment.app.BackStackRecord> r10 = r11.mBackStack
            java.lang.Object r10 = r10.get(r8)
            java.lang.StringBuilder r9 = r9.append(r10)
            java.lang.String r9 = r9.toString()
            android.util.Log.v(r4, r9)
        L87:
            int r8 = r8 + 1
            goto L4a
        L8a:
            androidx.fragment.app.FragmentManagerState r4 = new androidx.fragment.app.FragmentManagerState
            r4.<init>()
            r4.mActive = r1
            r4.mAdded = r3
            r4.mBackStack = r6
            java.util.concurrent.atomic.AtomicInteger r5 = r11.mBackStackIndex
            int r5 = r5.get()
            r4.mBackStackIndex = r5
            androidx.fragment.app.Fragment r5 = r11.mPrimaryNav
            if (r5 == 0) goto La7
            androidx.fragment.app.Fragment r5 = r11.mPrimaryNav
            java.lang.String r5 = r5.mWho
            r4.mPrimaryNavActiveWho = r5
        La7:
            java.util.ArrayList<java.lang.String> r5 = r4.mBackStackStateKeys
            java.util.Map<java.lang.String, androidx.fragment.app.BackStackState> r8 = r11.mBackStackStates
            java.util.Set r8 = r8.keySet()
            r5.addAll(r8)
            java.util.ArrayList<androidx.fragment.app.BackStackState> r5 = r4.mBackStackStates
            java.util.Map<java.lang.String, androidx.fragment.app.BackStackState> r8 = r11.mBackStackStates
            java.util.Collection r8 = r8.values()
            r5.addAll(r8)
            java.util.ArrayList r5 = new java.util.ArrayList
            java.util.ArrayDeque<androidx.fragment.app.FragmentManager$LaunchedFragmentInfo> r8 = r11.mLaunchedFragments
            r5.<init>(r8)
            r4.mLaunchedFragments = r5
            java.lang.String r5 = "state"
            r0.putParcelable(r5, r4)
            java.util.Map<java.lang.String, android.os.Bundle> r5 = r11.mResults
            java.util.Set r5 = r5.keySet()
            java.util.Iterator r5 = r5.iterator()
        Ld5:
            boolean r8 = r5.hasNext()
            if (r8 == 0) goto L100
            java.lang.Object r8 = r5.next()
            java.lang.String r8 = (java.lang.String) r8
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "result_"
            java.lang.StringBuilder r9 = r9.append(r10)
            java.lang.StringBuilder r9 = r9.append(r8)
            java.lang.String r9 = r9.toString()
            java.util.Map<java.lang.String, android.os.Bundle> r10 = r11.mResults
            java.lang.Object r10 = r10.get(r8)
            android.os.Bundle r10 = (android.os.Bundle) r10
            r0.putBundle(r9, r10)
            goto Ld5
        L100:
            java.util.Set r5 = r2.keySet()
            java.util.Iterator r5 = r5.iterator()
        L108:
            boolean r8 = r5.hasNext()
            if (r8 == 0) goto L131
            java.lang.Object r8 = r5.next()
            java.lang.String r8 = (java.lang.String) r8
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "fragment_"
            java.lang.StringBuilder r9 = r9.append(r10)
            java.lang.StringBuilder r9 = r9.append(r8)
            java.lang.String r9 = r9.toString()
            java.lang.Object r10 = r2.get(r8)
            android.os.Bundle r10 = (android.os.Bundle) r10
            r0.putBundle(r9, r10)
            goto L108
        L131:
            return r0
    }

    public void saveBackStack(java.lang.String r3) {
            r2 = this;
            androidx.fragment.app.FragmentManager$SaveBackStackState r0 = new androidx.fragment.app.FragmentManager$SaveBackStackState
            r0.<init>(r2, r3)
            r1 = 0
            r2.enqueueAction(r0, r1)
            return
    }

    boolean saveBackStackState(java.util.ArrayList<androidx.fragment.app.BackStackRecord> r17, java.util.ArrayList<java.lang.Boolean> r18, java.lang.String r19) {
            r16 = this;
            r0 = r16
            r1 = r19
            r2 = -1
            r3 = 1
            int r2 = r0.findBackStackIndex(r1, r2, r3)
            if (r2 >= 0) goto Le
            r3 = 0
            return r3
        Le:
            r4 = r2
        Lf:
            java.util.ArrayList<androidx.fragment.app.BackStackRecord> r5 = r0.mBackStack
            int r5 = r5.size()
            java.lang.String r6 = "saveBackStack(\""
            if (r4 >= r5) goto L51
            java.util.ArrayList<androidx.fragment.app.BackStackRecord> r5 = r0.mBackStack
            java.lang.Object r5 = r5.get(r4)
            androidx.fragment.app.BackStackRecord r5 = (androidx.fragment.app.BackStackRecord) r5
            boolean r7 = r5.mReorderingAllowed
            if (r7 != 0) goto L4e
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.StringBuilder r6 = r8.append(r6)
            java.lang.StringBuilder r6 = r6.append(r1)
            java.lang.String r8 = "\") included FragmentTransactions must use setReorderingAllowed(true) to ensure that the back stack can be restored as an atomic operation. Found "
            java.lang.StringBuilder r6 = r6.append(r8)
            java.lang.StringBuilder r6 = r6.append(r5)
            java.lang.String r8 = " that did not use setReorderingAllowed(true)."
            java.lang.StringBuilder r6 = r6.append(r8)
            java.lang.String r6 = r6.toString()
            r7.<init>(r6)
            r0.throwException(r7)
        L4e:
            int r4 = r4 + 1
            goto Lf
        L51:
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            r5 = r2
        L57:
            java.util.ArrayList<androidx.fragment.app.BackStackRecord> r7 = r0.mBackStack
            int r7 = r7.size()
            if (r5 >= r7) goto L122
            java.util.ArrayList<androidx.fragment.app.BackStackRecord> r7 = r0.mBackStack
            java.lang.Object r7 = r7.get(r5)
            androidx.fragment.app.BackStackRecord r7 = (androidx.fragment.app.BackStackRecord) r7
            java.util.HashSet r8 = new java.util.HashSet
            r8.<init>()
            java.util.HashSet r9 = new java.util.HashSet
            r9.<init>()
            java.util.ArrayList<androidx.fragment.app.FragmentTransaction$Op> r10 = r7.mOps
            java.util.Iterator r10 = r10.iterator()
        L77:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto Lad
            java.lang.Object r11 = r10.next()
            androidx.fragment.app.FragmentTransaction$Op r11 = (androidx.fragment.app.FragmentTransaction.Op) r11
            androidx.fragment.app.Fragment r12 = r11.mFragment
            if (r12 != 0) goto L88
            goto L77
        L88:
            boolean r13 = r11.mFromExpandedOp
            r14 = 2
            if (r13 == 0) goto L9b
            int r13 = r11.mCmd
            if (r13 == r3) goto L9b
            int r13 = r11.mCmd
            if (r13 == r14) goto L9b
            int r13 = r11.mCmd
            r15 = 8
            if (r13 != r15) goto La1
        L9b:
            r4.add(r12)
            r8.add(r12)
        La1:
            int r13 = r11.mCmd
            if (r13 == r3) goto La9
            int r13 = r11.mCmd
            if (r13 != r14) goto Lac
        La9:
            r9.add(r12)
        Lac:
            goto L77
        Lad:
            r8.removeAll(r9)
            boolean r10 = r8.isEmpty()
            if (r10 != 0) goto L11e
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.StringBuilder r11 = r11.append(r6)
            java.lang.StringBuilder r11 = r11.append(r1)
            java.lang.String r12 = "\") must be self contained and not reference fragments from non-saved FragmentTransactions. Found reference to fragment"
            java.lang.StringBuilder r11 = r11.append(r12)
            int r12 = r8.size()
            if (r12 != r3) goto Led
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = " "
            java.lang.StringBuilder r12 = r12.append(r13)
            java.util.Iterator r13 = r8.iterator()
            java.lang.Object r13 = r13.next()
            java.lang.StringBuilder r12 = r12.append(r13)
            java.lang.String r12 = r12.toString()
            goto L100
        Led:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "s "
            java.lang.StringBuilder r12 = r12.append(r13)
            java.lang.StringBuilder r12 = r12.append(r8)
            java.lang.String r12 = r12.toString()
        L100:
            java.lang.StringBuilder r11 = r11.append(r12)
            java.lang.String r12 = " in "
            java.lang.StringBuilder r11 = r11.append(r12)
            java.lang.StringBuilder r11 = r11.append(r7)
            java.lang.String r12 = " that were previously added to the FragmentManager through a separate FragmentTransaction."
            java.lang.StringBuilder r11 = r11.append(r12)
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            r0.throwException(r10)
        L11e:
            int r5 = r5 + 1
            goto L57
        L122:
            java.util.ArrayDeque r5 = new java.util.ArrayDeque
            r5.<init>(r4)
        L127:
            boolean r7 = r5.isEmpty()
            if (r7 != 0) goto L18c
            java.lang.Object r7 = r5.removeFirst()
            androidx.fragment.app.Fragment r7 = (androidx.fragment.app.Fragment) r7
            boolean r8 = r7.mRetainInstance
            if (r8 == 0) goto L16f
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.StringBuilder r9 = r9.append(r6)
            java.lang.StringBuilder r9 = r9.append(r1)
            java.lang.String r10 = "\") must not contain retained fragments. Found "
            java.lang.StringBuilder r9 = r9.append(r10)
            boolean r10 = r4.contains(r7)
            if (r10 == 0) goto L155
            java.lang.String r10 = "direct reference to retained "
            goto L157
        L155:
            java.lang.String r10 = "retained child "
        L157:
            java.lang.StringBuilder r9 = r9.append(r10)
            java.lang.String r10 = "fragment "
            java.lang.StringBuilder r9 = r9.append(r10)
            java.lang.StringBuilder r9 = r9.append(r7)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            r0.throwException(r8)
        L16f:
            androidx.fragment.app.FragmentManager r8 = r7.mChildFragmentManager
            java.util.List r8 = r8.getActiveFragments()
            java.util.Iterator r8 = r8.iterator()
        L179:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L18b
            java.lang.Object r9 = r8.next()
            androidx.fragment.app.Fragment r9 = (androidx.fragment.app.Fragment) r9
            if (r9 == 0) goto L18a
            r5.addLast(r9)
        L18a:
            goto L179
        L18b:
            goto L127
        L18c:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r7 = r4.iterator()
        L195:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L1a7
            java.lang.Object r8 = r7.next()
            androidx.fragment.app.Fragment r8 = (androidx.fragment.app.Fragment) r8
            java.lang.String r9 = r8.mWho
            r6.add(r9)
            goto L195
        L1a7:
            java.util.ArrayList r7 = new java.util.ArrayList
            java.util.ArrayList<androidx.fragment.app.BackStackRecord> r8 = r0.mBackStack
            int r8 = r8.size()
            int r8 = r8 - r2
            r7.<init>(r8)
            r8 = r2
        L1b4:
            java.util.ArrayList<androidx.fragment.app.BackStackRecord> r9 = r0.mBackStack
            int r9 = r9.size()
            if (r8 >= r9) goto L1c3
            r9 = 0
            r7.add(r9)
            int r8 = r8 + 1
            goto L1b4
        L1c3:
            androidx.fragment.app.BackStackState r8 = new androidx.fragment.app.BackStackState
            r8.<init>(r6, r7)
            java.util.ArrayList<androidx.fragment.app.BackStackRecord> r9 = r0.mBackStack
            int r9 = r9.size()
            int r9 = r9 - r3
        L1cf:
            if (r9 < r2) goto L1fe
            java.util.ArrayList<androidx.fragment.app.BackStackRecord> r10 = r0.mBackStack
            java.lang.Object r10 = r10.remove(r9)
            androidx.fragment.app.BackStackRecord r10 = (androidx.fragment.app.BackStackRecord) r10
            androidx.fragment.app.BackStackRecord r11 = new androidx.fragment.app.BackStackRecord
            r11.<init>(r10)
            r11.collapseOps()
            androidx.fragment.app.BackStackRecordState r12 = new androidx.fragment.app.BackStackRecordState
            r12.<init>(r11)
            int r13 = r9 - r2
            r7.set(r13, r12)
            r10.mBeingSaved = r3
            r13 = r17
            r13.add(r10)
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r3)
            r15 = r18
            r15.add(r14)
            int r9 = r9 + (-1)
            goto L1cf
        L1fe:
            r13 = r17
            r15 = r18
            java.util.Map<java.lang.String, androidx.fragment.app.BackStackState> r9 = r0.mBackStackStates
            r9.put(r1, r8)
            return r3
    }

    public androidx.fragment.app.Fragment.SavedState saveFragmentInstanceState(androidx.fragment.app.Fragment r5) {
            r4 = this;
            androidx.fragment.app.FragmentStore r0 = r4.mFragmentStore
            java.lang.String r1 = r5.mWho
            androidx.fragment.app.FragmentStateManager r0 = r0.getFragmentStateManager(r1)
            if (r0 == 0) goto L14
            androidx.fragment.app.Fragment r1 = r0.getFragment()
            boolean r1 = r1.equals(r5)
            if (r1 != 0) goto L35
        L14:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Fragment "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r5)
            java.lang.String r3 = " is not currently in the FragmentManager"
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            r4.throwException(r1)
        L35:
            androidx.fragment.app.Fragment$SavedState r1 = r0.saveInstanceState()
            return r1
    }

    void scheduleCommit() {
            r4 = this;
            java.util.ArrayList<androidx.fragment.app.FragmentManager$OpGenerator> r0 = r4.mPendingActions
            monitor-enter(r0)
            java.util.ArrayList<androidx.fragment.app.FragmentManager$OpGenerator> r1 = r4.mPendingActions     // Catch: java.lang.Throwable -> L2b
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L2b
            r2 = 1
            if (r1 != r2) goto Ld
            goto Le
        Ld:
            r2 = 0
        Le:
            if (r2 == 0) goto L29
            androidx.fragment.app.FragmentHostCallback<?> r1 = r4.mHost     // Catch: java.lang.Throwable -> L2b
            android.os.Handler r1 = r1.getHandler()     // Catch: java.lang.Throwable -> L2b
            java.lang.Runnable r3 = r4.mExecCommit     // Catch: java.lang.Throwable -> L2b
            r1.removeCallbacks(r3)     // Catch: java.lang.Throwable -> L2b
            androidx.fragment.app.FragmentHostCallback<?> r1 = r4.mHost     // Catch: java.lang.Throwable -> L2b
            android.os.Handler r1 = r1.getHandler()     // Catch: java.lang.Throwable -> L2b
            java.lang.Runnable r3 = r4.mExecCommit     // Catch: java.lang.Throwable -> L2b
            r1.post(r3)     // Catch: java.lang.Throwable -> L2b
            r4.updateOnBackPressedCallbackEnabled()     // Catch: java.lang.Throwable -> L2b
        L29:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2b
            return
        L2b:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2b
            throw r1
    }

    void setExitAnimationOrder(androidx.fragment.app.Fragment r4, boolean r5) {
            r3 = this;
            android.view.ViewGroup r0 = r3.getFragmentContainer(r4)
            if (r0 == 0) goto L12
            boolean r1 = r0 instanceof androidx.fragment.app.FragmentContainerView
            if (r1 == 0) goto L12
            r1 = r0
            androidx.fragment.app.FragmentContainerView r1 = (androidx.fragment.app.FragmentContainerView) r1
            r2 = r5 ^ 1
            r1.setDrawDisappearingViewsLast(r2)
        L12:
            return
    }

    public void setFragmentFactory(androidx.fragment.app.FragmentFactory r1) {
            r0 = this;
            r0.mFragmentFactory = r1
            return
    }

    @Override // androidx.fragment.app.FragmentResultOwner
    public final void setFragmentResult(java.lang.String r4, android.os.Bundle r5) {
            r3 = this;
            java.util.Map<java.lang.String, androidx.fragment.app.FragmentManager$LifecycleAwareResultListener> r0 = r3.mResultListeners
            java.lang.Object r0 = r0.get(r4)
            androidx.fragment.app.FragmentManager$LifecycleAwareResultListener r0 = (androidx.fragment.app.FragmentManager.LifecycleAwareResultListener) r0
            if (r0 == 0) goto L16
            androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.STARTED
            boolean r1 = r0.isAtLeast(r1)
            if (r1 == 0) goto L16
            r0.onFragmentResult(r4, r5)
            goto L1b
        L16:
            java.util.Map<java.lang.String, android.os.Bundle> r1 = r3.mResults
            r1.put(r4, r5)
        L1b:
            r1 = 2
            boolean r1 = isLoggingEnabled(r1)
            if (r1 == 0) goto L44
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Setting fragment result with key "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r4)
            java.lang.String r2 = " and result "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r5)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "FragmentManager"
            android.util.Log.v(r2, r1)
        L44:
            return
    }

    @Override // androidx.fragment.app.FragmentResultOwner
    public final void setFragmentResultListener(java.lang.String r6, androidx.lifecycle.LifecycleOwner r7, androidx.fragment.app.FragmentResultListener r8) {
            r5 = this;
            androidx.lifecycle.Lifecycle r0 = r7.getLifecycle()
            androidx.lifecycle.Lifecycle$State r1 = r0.getCurrentState()
            androidx.lifecycle.Lifecycle$State r2 = androidx.lifecycle.Lifecycle.State.DESTROYED
            if (r1 != r2) goto Ld
            return
        Ld:
            androidx.fragment.app.FragmentManager$6 r1 = new androidx.fragment.app.FragmentManager$6
            r1.<init>(r5, r6, r8, r0)
            java.util.Map<java.lang.String, androidx.fragment.app.FragmentManager$LifecycleAwareResultListener> r2 = r5.mResultListeners
            androidx.fragment.app.FragmentManager$LifecycleAwareResultListener r3 = new androidx.fragment.app.FragmentManager$LifecycleAwareResultListener
            r3.<init>(r0, r8, r1)
            java.lang.Object r2 = r2.put(r6, r3)
            androidx.fragment.app.FragmentManager$LifecycleAwareResultListener r2 = (androidx.fragment.app.FragmentManager.LifecycleAwareResultListener) r2
            if (r2 == 0) goto L24
            r2.removeObserver()
        L24:
            r3 = 2
            boolean r3 = isLoggingEnabled(r3)
            if (r3 == 0) goto L57
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Setting FragmentResultListener with key "
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r3 = r3.append(r6)
            java.lang.String r4 = " lifecycleOwner "
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.String r4 = " and listener "
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r3 = r3.append(r8)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "FragmentManager"
            android.util.Log.v(r4, r3)
        L57:
            r0.addObserver(r1)
            return
    }

    void setMaxLifecycle(androidx.fragment.app.Fragment r4, androidx.lifecycle.Lifecycle.State r5) {
            r3 = this;
            java.lang.String r0 = r4.mWho
            androidx.fragment.app.Fragment r0 = r3.findActiveFragment(r0)
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L17
            androidx.fragment.app.FragmentHostCallback<?> r0 = r4.mHost
            if (r0 == 0) goto L14
            androidx.fragment.app.FragmentManager r0 = r4.mFragmentManager
            if (r0 != r3) goto L17
        L14:
            r4.mMaxState = r5
            return
        L17:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Fragment "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r4)
            java.lang.String r2 = " is not an active fragment of FragmentManager "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    void setPrimaryNavigationFragment(androidx.fragment.app.Fragment r4) {
            r3 = this;
            if (r4 == 0) goto L3a
            java.lang.String r0 = r4.mWho
            androidx.fragment.app.Fragment r0 = r3.findActiveFragment(r0)
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L17
            androidx.fragment.app.FragmentHostCallback<?> r0 = r4.mHost
            if (r0 == 0) goto L3a
            androidx.fragment.app.FragmentManager r0 = r4.mFragmentManager
            if (r0 != r3) goto L17
            goto L3a
        L17:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Fragment "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r4)
            java.lang.String r2 = " is not an active fragment of FragmentManager "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L3a:
            androidx.fragment.app.Fragment r0 = r3.mPrimaryNav
            r3.mPrimaryNav = r4
            r3.dispatchParentPrimaryNavigationFragmentChanged(r0)
            androidx.fragment.app.Fragment r1 = r3.mPrimaryNav
            r3.dispatchParentPrimaryNavigationFragmentChanged(r1)
            return
    }

    void setSpecialEffectsControllerFactory(androidx.fragment.app.SpecialEffectsControllerFactory r1) {
            r0 = this;
            r0.mSpecialEffectsControllerFactory = r1
            return
    }

    public void setStrictModePolicy(androidx.fragment.app.strictmode.FragmentStrictMode.Policy r1) {
            r0 = this;
            r0.mStrictModePolicy = r1
            return
    }

    void showFragment(androidx.fragment.app.Fragment r3) {
            r2 = this;
            r0 = 2
            boolean r0 = isLoggingEnabled(r0)
            if (r0 == 0) goto L1f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "show: "
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.v(r1, r0)
        L1f:
            boolean r0 = r3.mHidden
            if (r0 == 0) goto L2c
            r0 = 0
            r3.mHidden = r0
            boolean r0 = r3.mHiddenChanged
            r0 = r0 ^ 1
            r3.mHiddenChanged = r0
        L2c:
            return
    }

    public java.lang.String toString() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 128(0x80, float:1.8E-43)
            r0.<init>(r1)
            java.lang.String r1 = "FragmentManager{"
            r0.append(r1)
            int r1 = java.lang.System.identityHashCode(r5)
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
            java.lang.String r1 = " in "
            r0.append(r1)
            androidx.fragment.app.Fragment r1 = r5.mParent
            java.lang.String r2 = "}"
            java.lang.String r3 = "{"
            if (r1 == 0) goto L45
            androidx.fragment.app.Fragment r1 = r5.mParent
            java.lang.Class r1 = r1.getClass()
            java.lang.String r4 = r1.getSimpleName()
            r0.append(r4)
            r0.append(r3)
            androidx.fragment.app.Fragment r3 = r5.mParent
            int r3 = java.lang.System.identityHashCode(r3)
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r0.append(r3)
            r0.append(r2)
            goto L6f
        L45:
            androidx.fragment.app.FragmentHostCallback<?> r1 = r5.mHost
            if (r1 == 0) goto L6a
            androidx.fragment.app.FragmentHostCallback<?> r1 = r5.mHost
            java.lang.Class r1 = r1.getClass()
            java.lang.String r4 = r1.getSimpleName()
            r0.append(r4)
            r0.append(r3)
            androidx.fragment.app.FragmentHostCallback<?> r3 = r5.mHost
            int r3 = java.lang.System.identityHashCode(r3)
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r0.append(r3)
            r0.append(r2)
            goto L6f
        L6a:
            java.lang.String r1 = "null"
            r0.append(r1)
        L6f:
            java.lang.String r1 = "}}"
            r0.append(r1)
            java.lang.String r1 = r0.toString()
            return r1
    }

    public void unregisterFragmentLifecycleCallbacks(androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks r2) {
            r1 = this;
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r0 = r1.mLifecycleCallbacksDispatcher
            r0.unregisterFragmentLifecycleCallbacks(r2)
            return
    }
}
