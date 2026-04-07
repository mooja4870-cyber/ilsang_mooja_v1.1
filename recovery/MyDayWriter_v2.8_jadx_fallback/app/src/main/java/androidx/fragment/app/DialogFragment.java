package androidx.fragment.app;

/* JADX INFO: loaded from: classes.dex */
public class DialogFragment extends androidx.fragment.app.Fragment implements android.content.DialogInterface.OnCancelListener, android.content.DialogInterface.OnDismissListener {
    private static final java.lang.String SAVED_BACK_STACK_ID = "android:backStackId";
    private static final java.lang.String SAVED_CANCELABLE = "android:cancelable";
    private static final java.lang.String SAVED_DIALOG_STATE_TAG = "android:savedDialogState";
    private static final java.lang.String SAVED_INTERNAL_DIALOG_SHOWING = "android:dialogShowing";
    private static final java.lang.String SAVED_SHOWS_DIALOG = "android:showsDialog";
    private static final java.lang.String SAVED_STYLE = "android:style";
    private static final java.lang.String SAVED_THEME = "android:theme";
    public static final int STYLE_NORMAL = 0;
    public static final int STYLE_NO_FRAME = 2;
    public static final int STYLE_NO_INPUT = 3;
    public static final int STYLE_NO_TITLE = 1;
    private int mBackStackId;
    private boolean mCancelable;
    private boolean mCreatingDialog;
    private android.app.Dialog mDialog;
    private boolean mDialogCreated;
    private java.lang.Runnable mDismissRunnable;
    private boolean mDismissed;
    private android.os.Handler mHandler;
    private androidx.lifecycle.Observer<androidx.lifecycle.LifecycleOwner> mObserver;
    private android.content.DialogInterface.OnCancelListener mOnCancelListener;
    private android.content.DialogInterface.OnDismissListener mOnDismissListener;
    private boolean mShownByMe;
    private boolean mShowsDialog;
    private int mStyle;
    private int mTheme;
    private boolean mViewDestroyed;






    public DialogFragment() {
            r2 = this;
            r2.<init>()
            androidx.fragment.app.DialogFragment$1 r0 = new androidx.fragment.app.DialogFragment$1
            r0.<init>(r2)
            r2.mDismissRunnable = r0
            androidx.fragment.app.DialogFragment$2 r0 = new androidx.fragment.app.DialogFragment$2
            r0.<init>(r2)
            r2.mOnCancelListener = r0
            androidx.fragment.app.DialogFragment$3 r0 = new androidx.fragment.app.DialogFragment$3
            r0.<init>(r2)
            r2.mOnDismissListener = r0
            r0 = 0
            r2.mStyle = r0
            r2.mTheme = r0
            r1 = 1
            r2.mCancelable = r1
            r2.mShowsDialog = r1
            r1 = -1
            r2.mBackStackId = r1
            androidx.fragment.app.DialogFragment$4 r1 = new androidx.fragment.app.DialogFragment$4
            r1.<init>(r2)
            r2.mObserver = r1
            r2.mDialogCreated = r0
            return
    }

    public DialogFragment(int r3) {
            r2 = this;
            r2.<init>(r3)
            androidx.fragment.app.DialogFragment$1 r0 = new androidx.fragment.app.DialogFragment$1
            r0.<init>(r2)
            r2.mDismissRunnable = r0
            androidx.fragment.app.DialogFragment$2 r0 = new androidx.fragment.app.DialogFragment$2
            r0.<init>(r2)
            r2.mOnCancelListener = r0
            androidx.fragment.app.DialogFragment$3 r0 = new androidx.fragment.app.DialogFragment$3
            r0.<init>(r2)
            r2.mOnDismissListener = r0
            r0 = 0
            r2.mStyle = r0
            r2.mTheme = r0
            r1 = 1
            r2.mCancelable = r1
            r2.mShowsDialog = r1
            r1 = -1
            r2.mBackStackId = r1
            androidx.fragment.app.DialogFragment$4 r1 = new androidx.fragment.app.DialogFragment$4
            r1.<init>(r2)
            r2.mObserver = r1
            r2.mDialogCreated = r0
            return
    }

    static /* synthetic */ android.app.Dialog access$000(androidx.fragment.app.DialogFragment r1) {
            android.app.Dialog r0 = r1.mDialog
            return r0
    }

    static /* synthetic */ android.content.DialogInterface.OnDismissListener access$100(androidx.fragment.app.DialogFragment r1) {
            android.content.DialogInterface$OnDismissListener r0 = r1.mOnDismissListener
            return r0
    }

    static /* synthetic */ boolean access$200(androidx.fragment.app.DialogFragment r1) {
            boolean r0 = r1.mShowsDialog
            return r0
    }

    private void dismissInternal(boolean r4, boolean r5, boolean r6) {
            r3 = this;
            boolean r0 = r3.mDismissed
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r3.mDismissed = r0
            r1 = 0
            r3.mShownByMe = r1
            android.app.Dialog r1 = r3.mDialog
            if (r1 == 0) goto L35
            android.app.Dialog r1 = r3.mDialog
            r2 = 0
            r1.setOnDismissListener(r2)
            android.app.Dialog r1 = r3.mDialog
            r1.dismiss()
            if (r5 != 0) goto L35
            android.os.Looper r1 = android.os.Looper.myLooper()
            android.os.Handler r2 = r3.mHandler
            android.os.Looper r2 = r2.getLooper()
            if (r1 != r2) goto L2e
            android.app.Dialog r1 = r3.mDialog
            r3.onDismiss(r1)
            goto L35
        L2e:
            android.os.Handler r1 = r3.mHandler
            java.lang.Runnable r2 = r3.mDismissRunnable
            r1.post(r2)
        L35:
            r3.mViewDestroyed = r0
            int r1 = r3.mBackStackId
            if (r1 < 0) goto L54
            if (r6 == 0) goto L47
            androidx.fragment.app.FragmentManager r1 = r3.getParentFragmentManager()
            int r2 = r3.mBackStackId
            r1.popBackStackImmediate(r2, r0)
            goto L50
        L47:
            androidx.fragment.app.FragmentManager r1 = r3.getParentFragmentManager()
            int r2 = r3.mBackStackId
            r1.popBackStack(r2, r0, r4)
        L50:
            r0 = -1
            r3.mBackStackId = r0
            goto L71
        L54:
            androidx.fragment.app.FragmentManager r1 = r3.getParentFragmentManager()
            androidx.fragment.app.FragmentTransaction r1 = r1.beginTransaction()
            r1.setReorderingAllowed(r0)
            r1.remove(r3)
            if (r6 == 0) goto L68
            r1.commitNow()
            goto L71
        L68:
            if (r4 == 0) goto L6e
            r1.commitAllowingStateLoss()
            goto L71
        L6e:
            r1.commit()
        L71:
            return
    }

    private void prepareDialog(android.os.Bundle r6) {
            r5 = this;
            boolean r0 = r5.mShowsDialog
            if (r0 != 0) goto L5
            return
        L5:
            boolean r0 = r5.mDialogCreated
            if (r0 != 0) goto L50
            r0 = 0
            r1 = 1
            r5.mCreatingDialog = r1     // Catch: java.lang.Throwable -> L4c
            android.app.Dialog r2 = r5.onCreateDialog(r6)     // Catch: java.lang.Throwable -> L4c
            r5.mDialog = r2     // Catch: java.lang.Throwable -> L4c
            boolean r2 = r5.mShowsDialog     // Catch: java.lang.Throwable -> L4c
            if (r2 == 0) goto L46
            android.app.Dialog r2 = r5.mDialog     // Catch: java.lang.Throwable -> L4c
            int r3 = r5.mStyle     // Catch: java.lang.Throwable -> L4c
            r5.setupDialog(r2, r3)     // Catch: java.lang.Throwable -> L4c
            android.content.Context r2 = r5.getContext()     // Catch: java.lang.Throwable -> L4c
            boolean r3 = r2 instanceof android.app.Activity     // Catch: java.lang.Throwable -> L4c
            if (r3 == 0) goto L2e
            android.app.Dialog r3 = r5.mDialog     // Catch: java.lang.Throwable -> L4c
            r4 = r2
            android.app.Activity r4 = (android.app.Activity) r4     // Catch: java.lang.Throwable -> L4c
            r3.setOwnerActivity(r4)     // Catch: java.lang.Throwable -> L4c
        L2e:
            android.app.Dialog r3 = r5.mDialog     // Catch: java.lang.Throwable -> L4c
            boolean r4 = r5.mCancelable     // Catch: java.lang.Throwable -> L4c
            r3.setCancelable(r4)     // Catch: java.lang.Throwable -> L4c
            android.app.Dialog r3 = r5.mDialog     // Catch: java.lang.Throwable -> L4c
            android.content.DialogInterface$OnCancelListener r4 = r5.mOnCancelListener     // Catch: java.lang.Throwable -> L4c
            r3.setOnCancelListener(r4)     // Catch: java.lang.Throwable -> L4c
            android.app.Dialog r3 = r5.mDialog     // Catch: java.lang.Throwable -> L4c
            android.content.DialogInterface$OnDismissListener r4 = r5.mOnDismissListener     // Catch: java.lang.Throwable -> L4c
            r3.setOnDismissListener(r4)     // Catch: java.lang.Throwable -> L4c
            r5.mDialogCreated = r1     // Catch: java.lang.Throwable -> L4c
            goto L49
        L46:
            r1 = 0
            r5.mDialog = r1     // Catch: java.lang.Throwable -> L4c
        L49:
            r5.mCreatingDialog = r0
            goto L50
        L4c:
            r1 = move-exception
            r5.mCreatingDialog = r0
            throw r1
        L50:
            return
    }

    @Override // androidx.fragment.app.Fragment
    androidx.fragment.app.FragmentContainer createFragmentContainer() {
            r2 = this;
            androidx.fragment.app.FragmentContainer r0 = super.createFragmentContainer()
            androidx.fragment.app.DialogFragment$5 r1 = new androidx.fragment.app.DialogFragment$5
            r1.<init>(r2, r0)
            return r1
    }

    public void dismiss() {
            r1 = this;
            r0 = 0
            r1.dismissInternal(r0, r0, r0)
            return
    }

    public void dismissAllowingStateLoss() {
            r2 = this;
            r0 = 1
            r1 = 0
            r2.dismissInternal(r0, r1, r1)
            return
    }

    public void dismissNow() {
            r2 = this;
            r0 = 0
            r1 = 1
            r2.dismissInternal(r0, r0, r1)
            return
    }

    public android.app.Dialog getDialog() {
            r1 = this;
            android.app.Dialog r0 = r1.mDialog
            return r0
    }

    public boolean getShowsDialog() {
            r1 = this;
            boolean r0 = r1.mShowsDialog
            return r0
    }

    public int getTheme() {
            r1 = this;
            int r0 = r1.mTheme
            return r0
    }

    public boolean isCancelable() {
            r1 = this;
            boolean r0 = r1.mCancelable
            return r0
    }

    @Override // androidx.fragment.app.Fragment
    @java.lang.Deprecated
    public void onActivityCreated(android.os.Bundle r1) {
            r0 = this;
            super.onActivityCreated(r1)
            return
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.content.Context r3) {
            r2 = this;
            super.onAttach(r3)
            androidx.lifecycle.LiveData r0 = r2.getViewLifecycleOwnerLiveData()
            androidx.lifecycle.Observer<androidx.lifecycle.LifecycleOwner> r1 = r2.mObserver
            r0.observeForever(r1)
            boolean r0 = r2.mShownByMe
            if (r0 != 0) goto L13
            r0 = 0
            r2.mDismissed = r0
        L13:
            return
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface r1) {
            r0 = this;
            return
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle r4) {
            r3 = this;
            super.onCreate(r4)
            android.os.Handler r0 = new android.os.Handler
            r0.<init>()
            r3.mHandler = r0
            int r0 = r3.mContainerId
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L12
            r0 = r1
            goto L13
        L12:
            r0 = r2
        L13:
            r3.mShowsDialog = r0
            if (r4 == 0) goto L42
            java.lang.String r0 = "android:style"
            int r0 = r4.getInt(r0, r2)
            r3.mStyle = r0
            java.lang.String r0 = "android:theme"
            int r0 = r4.getInt(r0, r2)
            r3.mTheme = r0
            java.lang.String r0 = "android:cancelable"
            boolean r0 = r4.getBoolean(r0, r1)
            r3.mCancelable = r0
            java.lang.String r0 = "android:showsDialog"
            boolean r1 = r3.mShowsDialog
            boolean r0 = r4.getBoolean(r0, r1)
            r3.mShowsDialog = r0
            java.lang.String r0 = "android:backStackId"
            r1 = -1
            int r0 = r4.getInt(r0, r1)
            r3.mBackStackId = r0
        L42:
            return
    }

    public android.app.Dialog onCreateDialog(android.os.Bundle r4) {
            r3 = this;
            r0 = 3
            boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r0)
            if (r0 == 0) goto L1f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "onCreateDialog called for DialogFragment "
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.d(r1, r0)
        L1f:
            androidx.activity.ComponentDialog r0 = new androidx.activity.ComponentDialog
            android.content.Context r1 = r3.requireContext()
            int r2 = r3.getTheme()
            r0.<init>(r1, r2)
            return r0
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
            r2 = this;
            super.onDestroyView()
            android.app.Dialog r0 = r2.mDialog
            if (r0 == 0) goto L23
            r0 = 1
            r2.mViewDestroyed = r0
            android.app.Dialog r0 = r2.mDialog
            r1 = 0
            r0.setOnDismissListener(r1)
            android.app.Dialog r0 = r2.mDialog
            r0.dismiss()
            boolean r0 = r2.mDismissed
            if (r0 != 0) goto L1e
            android.app.Dialog r0 = r2.mDialog
            r2.onDismiss(r0)
        L1e:
            r2.mDialog = r1
            r0 = 0
            r2.mDialogCreated = r0
        L23:
            return
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
            r2 = this;
            super.onDetach()
            boolean r0 = r2.mShownByMe
            if (r0 != 0) goto Le
            boolean r0 = r2.mDismissed
            if (r0 != 0) goto Le
            r0 = 1
            r2.mDismissed = r0
        Le:
            androidx.lifecycle.LiveData r0 = r2.getViewLifecycleOwnerLiveData()
            androidx.lifecycle.Observer<androidx.lifecycle.LifecycleOwner> r1 = r2.mObserver
            r0.removeObserver(r1)
            return
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(android.content.DialogInterface r3) {
            r2 = this;
            boolean r0 = r2.mViewDestroyed
            if (r0 != 0) goto L28
            r0 = 3
            boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r0)
            if (r0 == 0) goto L23
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "onDismiss called for DialogFragment "
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.d(r1, r0)
        L23:
            r0 = 0
            r1 = 1
            r2.dismissInternal(r1, r1, r0)
        L28:
            return
    }

    android.view.View onFindViewById(int r2) {
            r1 = this;
            android.app.Dialog r0 = r1.mDialog
            if (r0 == 0) goto Lb
            android.app.Dialog r0 = r1.mDialog
            android.view.View r0 = r0.findViewById(r2)
            return r0
        Lb:
            r0 = 0
            return r0
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.LayoutInflater onGetLayoutInflater(android.os.Bundle r6) {
            r5 = this;
            android.view.LayoutInflater r0 = super.onGetLayoutInflater(r6)
            boolean r1 = r5.mShowsDialog
            r2 = 2
            java.lang.String r3 = "FragmentManager"
            if (r1 == 0) goto L44
            boolean r1 = r5.mCreatingDialog
            if (r1 == 0) goto L10
            goto L44
        L10:
            r5.prepareDialog(r6)
            boolean r1 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r2)
            if (r1 == 0) goto L35
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "get layout inflater for DialogFragment "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r5)
            java.lang.String r2 = " from dialog context"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.util.Log.d(r3, r1)
        L35:
            android.app.Dialog r1 = r5.mDialog
            if (r1 == 0) goto L43
            android.app.Dialog r1 = r5.mDialog
            android.content.Context r1 = r1.getContext()
            android.view.LayoutInflater r0 = r0.cloneInContext(r1)
        L43:
            return r0
        L44:
            boolean r1 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r2)
            if (r1 == 0) goto L8e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "getting layout inflater for DialogFragment "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r5)
            java.lang.String r1 = r1.toString()
            boolean r2 = r5.mShowsDialog
            if (r2 != 0) goto L78
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "mShowsDialog = false: "
            java.lang.StringBuilder r2 = r2.append(r4)
            java.lang.StringBuilder r2 = r2.append(r1)
            java.lang.String r2 = r2.toString()
            android.util.Log.d(r3, r2)
            goto L8e
        L78:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "mCreatingDialog = true: "
            java.lang.StringBuilder r2 = r2.append(r4)
            java.lang.StringBuilder r2 = r2.append(r1)
            java.lang.String r2 = r2.toString()
            android.util.Log.d(r3, r2)
        L8e:
            return r0
    }

    boolean onHasView() {
            r1 = this;
            boolean r0 = r1.mDialogCreated
            return r0
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(android.os.Bundle r4) {
            r3 = this;
            super.onSaveInstanceState(r4)
            android.app.Dialog r0 = r3.mDialog
            if (r0 == 0) goto L18
            android.app.Dialog r0 = r3.mDialog
            android.os.Bundle r0 = r0.onSaveInstanceState()
            java.lang.String r1 = "android:dialogShowing"
            r2 = 0
            r0.putBoolean(r1, r2)
            java.lang.String r1 = "android:savedDialogState"
            r4.putBundle(r1, r0)
        L18:
            int r0 = r3.mStyle
            if (r0 == 0) goto L23
            java.lang.String r0 = "android:style"
            int r1 = r3.mStyle
            r4.putInt(r0, r1)
        L23:
            int r0 = r3.mTheme
            if (r0 == 0) goto L2e
            java.lang.String r0 = "android:theme"
            int r1 = r3.mTheme
            r4.putInt(r0, r1)
        L2e:
            boolean r0 = r3.mCancelable
            if (r0 != 0) goto L39
            java.lang.String r0 = "android:cancelable"
            boolean r1 = r3.mCancelable
            r4.putBoolean(r0, r1)
        L39:
            boolean r0 = r3.mShowsDialog
            if (r0 != 0) goto L44
            java.lang.String r0 = "android:showsDialog"
            boolean r1 = r3.mShowsDialog
            r4.putBoolean(r0, r1)
        L44:
            int r0 = r3.mBackStackId
            r1 = -1
            if (r0 == r1) goto L50
            java.lang.String r0 = "android:backStackId"
            int r1 = r3.mBackStackId
            r4.putInt(r0, r1)
        L50:
            return
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
            r1 = this;
            super.onStart()
            android.app.Dialog r0 = r1.mDialog
            if (r0 == 0) goto L22
            r0 = 0
            r1.mViewDestroyed = r0
            android.app.Dialog r0 = r1.mDialog
            r0.show()
            android.app.Dialog r0 = r1.mDialog
            android.view.Window r0 = r0.getWindow()
            android.view.View r0 = r0.getDecorView()
            androidx.lifecycle.ViewTreeLifecycleOwner.set(r0, r1)
            androidx.lifecycle.ViewTreeViewModelStoreOwner.set(r0, r1)
            androidx.savedstate.ViewTreeSavedStateRegistryOwner.set(r0, r1)
        L22:
            return
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
            r1 = this;
            super.onStop()
            android.app.Dialog r0 = r1.mDialog
            if (r0 == 0) goto Lc
            android.app.Dialog r0 = r1.mDialog
            r0.hide()
        Lc:
            return
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewStateRestored(android.os.Bundle r3) {
            r2 = this;
            super.onViewStateRestored(r3)
            android.app.Dialog r0 = r2.mDialog
            if (r0 == 0) goto L16
            if (r3 == 0) goto L16
            java.lang.String r0 = "android:savedDialogState"
            android.os.Bundle r0 = r3.getBundle(r0)
            if (r0 == 0) goto L16
            android.app.Dialog r1 = r2.mDialog
            r1.onRestoreInstanceState(r0)
        L16:
            return
    }

    @Override // androidx.fragment.app.Fragment
    void performCreateView(android.view.LayoutInflater r3, android.view.ViewGroup r4, android.os.Bundle r5) {
            r2 = this;
            super.performCreateView(r3, r4, r5)
            android.view.View r0 = r2.mView
            if (r0 != 0) goto L1a
            android.app.Dialog r0 = r2.mDialog
            if (r0 == 0) goto L1a
            if (r5 == 0) goto L1a
            java.lang.String r0 = "android:savedDialogState"
            android.os.Bundle r0 = r5.getBundle(r0)
            if (r0 == 0) goto L1a
            android.app.Dialog r1 = r2.mDialog
            r1.onRestoreInstanceState(r0)
        L1a:
            return
    }

    public final androidx.activity.ComponentDialog requireComponentDialog() {
            r4 = this;
            android.app.Dialog r0 = r4.requireDialog()
            boolean r1 = r0 instanceof androidx.activity.ComponentDialog
            if (r1 == 0) goto Lc
            r1 = r0
            androidx.activity.ComponentDialog r1 = (androidx.activity.ComponentDialog) r1
            return r1
        Lc:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "DialogFragment "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r4)
            java.lang.String r3 = " did not return a ComponentDialog instance from requireDialog(). The actual Dialog is "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r0)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    public final android.app.Dialog requireDialog() {
            r4 = this;
            android.app.Dialog r0 = r4.getDialog()
            if (r0 == 0) goto L7
            return r0
        L7:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "DialogFragment "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r4)
            java.lang.String r3 = " does not have a Dialog."
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    public void setCancelable(boolean r2) {
            r1 = this;
            r1.mCancelable = r2
            android.app.Dialog r0 = r1.mDialog
            if (r0 == 0) goto Lb
            android.app.Dialog r0 = r1.mDialog
            r0.setCancelable(r2)
        Lb:
            return
    }

    public void setShowsDialog(boolean r1) {
            r0 = this;
            r0.mShowsDialog = r1
            return
    }

    public void setStyle(int r4, int r5) {
            r3 = this;
            r0 = 2
            boolean r1 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r0)
            if (r1 == 0) goto L33
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Setting style and theme for DialogFragment "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r2 = " to "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r4)
            java.lang.String r2 = ", "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r5)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "FragmentManager"
            android.util.Log.d(r2, r1)
        L33:
            r3.mStyle = r4
            int r1 = r3.mStyle
            if (r1 == r0) goto L3e
            int r0 = r3.mStyle
            r1 = 3
            if (r0 != r1) goto L43
        L3e:
            r0 = 16973913(0x1030059, float:2.406115E-38)
            r3.mTheme = r0
        L43:
            if (r5 == 0) goto L47
            r3.mTheme = r5
        L47:
            return
    }

    public void setupDialog(android.app.Dialog r3, int r4) {
            r2 = this;
            switch(r4) {
                case 1: goto Lf;
                case 2: goto Lf;
                case 3: goto L4;
                default: goto L3;
            }
        L3:
            goto L13
        L4:
            android.view.Window r0 = r3.getWindow()
            if (r0 == 0) goto Lf
            r1 = 24
            r0.addFlags(r1)
        Lf:
            r0 = 1
            r3.requestWindowFeature(r0)
        L13:
            return
    }

    public int show(androidx.fragment.app.FragmentTransaction r3, java.lang.String r4) {
            r2 = this;
            r0 = 0
            r2.mDismissed = r0
            r1 = 1
            r2.mShownByMe = r1
            r3.add(r2, r4)
            r2.mViewDestroyed = r0
            int r0 = r3.commit()
            r2.mBackStackId = r0
            int r0 = r2.mBackStackId
            return r0
    }

    public void show(androidx.fragment.app.FragmentManager r3, java.lang.String r4) {
            r2 = this;
            r0 = 0
            r2.mDismissed = r0
            r0 = 1
            r2.mShownByMe = r0
            androidx.fragment.app.FragmentTransaction r1 = r3.beginTransaction()
            r1.setReorderingAllowed(r0)
            r1.add(r2, r4)
            r1.commit()
            return
    }

    public void showNow(androidx.fragment.app.FragmentManager r3, java.lang.String r4) {
            r2 = this;
            r0 = 0
            r2.mDismissed = r0
            r0 = 1
            r2.mShownByMe = r0
            androidx.fragment.app.FragmentTransaction r1 = r3.beginTransaction()
            r1.setReorderingAllowed(r0)
            r1.add(r2, r4)
            r1.commitNow()
            return
    }
}
