package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
public class SearchView extends androidx.appcompat.widget.LinearLayoutCompat implements androidx.appcompat.view.CollapsibleActionView {
    static final boolean DBG = false;
    private static final java.lang.String IME_OPTION_NO_MICROPHONE = "nm";
    static final java.lang.String LOG_TAG = "SearchView";
    static final androidx.appcompat.widget.SearchView.PreQAutoCompleteTextViewReflector PRE_API_29_HIDDEN_METHOD_INVOKER = null;
    private android.os.Bundle mAppSearchData;
    private boolean mClearingFocus;
    final android.widget.ImageView mCloseButton;
    private final android.widget.ImageView mCollapsedIcon;
    private int mCollapsedImeOptions;
    private final java.lang.CharSequence mDefaultQueryHint;
    private final android.view.View mDropDownAnchor;
    private boolean mExpandedInActionView;
    final android.widget.ImageView mGoButton;
    private boolean mIconified;
    private boolean mIconifiedByDefault;
    private int mMaxWidth;
    private java.lang.CharSequence mOldQueryText;
    private final android.view.View.OnClickListener mOnClickListener;
    private androidx.appcompat.widget.SearchView.OnCloseListener mOnCloseListener;
    private final android.widget.TextView.OnEditorActionListener mOnEditorActionListener;
    private final android.widget.AdapterView.OnItemClickListener mOnItemClickListener;
    private final android.widget.AdapterView.OnItemSelectedListener mOnItemSelectedListener;
    private androidx.appcompat.widget.SearchView.OnQueryTextListener mOnQueryChangeListener;
    android.view.View.OnFocusChangeListener mOnQueryTextFocusChangeListener;
    private android.view.View.OnClickListener mOnSearchClickListener;
    private androidx.appcompat.widget.SearchView.OnSuggestionListener mOnSuggestionListener;
    private final java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable.ConstantState> mOutsideDrawablesCache;
    private java.lang.CharSequence mQueryHint;
    private boolean mQueryRefinement;
    private java.lang.Runnable mReleaseCursorRunnable;
    final android.widget.ImageView mSearchButton;
    private final android.view.View mSearchEditFrame;
    private final android.graphics.drawable.Drawable mSearchHintIcon;
    private final android.view.View mSearchPlate;
    final androidx.appcompat.widget.SearchView.SearchAutoComplete mSearchSrcTextView;
    private android.graphics.Rect mSearchSrcTextViewBounds;
    private android.graphics.Rect mSearchSrtTextViewBoundsExpanded;
    android.app.SearchableInfo mSearchable;
    private final android.view.View mSubmitArea;
    private boolean mSubmitButtonEnabled;
    private final int mSuggestionCommitIconResId;
    private final int mSuggestionRowLayout;
    androidx.cursoradapter.widget.CursorAdapter mSuggestionsAdapter;
    private int[] mTemp;
    private int[] mTemp2;
    android.view.View.OnKeyListener mTextKeyListener;
    private android.text.TextWatcher mTextWatcher;
    private androidx.appcompat.widget.SearchView.UpdatableTouchDelegate mTouchDelegate;
    private final java.lang.Runnable mUpdateDrawableStateRunnable;
    private java.lang.CharSequence mUserQuery;
    private final android.content.Intent mVoiceAppSearchIntent;
    final android.widget.ImageView mVoiceButton;
    private boolean mVoiceButtonEnabled;
    private final android.content.Intent mVoiceWebSearchIntent;











    static class Api29Impl {
        private Api29Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static void refreshAutoCompleteResults(android.widget.AutoCompleteTextView r0) {
                r0.refreshAutoCompleteResults()
                return
        }

        static void setInputMethodMode(androidx.appcompat.widget.SearchView.SearchAutoComplete r0, int r1) {
                r0.setInputMethodMode(r1)
                return
        }
    }

    public final class InspectionCompanion implements android.view.inspector.InspectionCompanion<androidx.appcompat.widget.SearchView> {
        private int mIconifiedByDefaultId;
        private int mImeOptionsId;
        private int mMaxWidthId;
        private boolean mPropertiesMapped;
        private int mQueryHintId;

        public InspectionCompanion() {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.mPropertiesMapped = r0
                return
        }

        @Override // android.view.inspector.InspectionCompanion
        public void mapProperties(android.view.inspector.PropertyMapper r3) {
                r2 = this;
                java.lang.String r0 = "imeOptions"
                r1 = 16843364(0x1010264, float:2.3695273E-38)
                int r0 = r3.mapInt(r0, r1)
                r2.mImeOptionsId = r0
                java.lang.String r0 = "maxWidth"
                r1 = 16843039(0x101011f, float:2.3694362E-38)
                int r0 = r3.mapInt(r0, r1)
                r2.mMaxWidthId = r0
                java.lang.String r0 = "iconifiedByDefault"
                int r1 = androidx.appcompat.R.attr.iconifiedByDefault
                int r0 = r3.mapBoolean(r0, r1)
                r2.mIconifiedByDefaultId = r0
                java.lang.String r0 = "queryHint"
                int r1 = androidx.appcompat.R.attr.queryHint
                int r0 = r3.mapObject(r0, r1)
                r2.mQueryHintId = r0
                r0 = 1
                r2.mPropertiesMapped = r0
                return
        }

        /* JADX INFO: renamed from: readProperties, reason: avoid collision after fix types in other method */
        public void readProperties2(androidx.appcompat.widget.SearchView r3, android.view.inspector.PropertyReader r4) {
                r2 = this;
                boolean r0 = r2.mPropertiesMapped
                if (r0 == 0) goto L29
                int r0 = r2.mImeOptionsId
                int r1 = r3.getImeOptions()
                r4.readInt(r0, r1)
                int r0 = r2.mMaxWidthId
                int r1 = r3.getMaxWidth()
                r4.readInt(r0, r1)
                int r0 = r2.mIconifiedByDefaultId
                boolean r1 = r3.isIconfiedByDefault()
                r4.readBoolean(r0, r1)
                int r0 = r2.mQueryHintId
                java.lang.CharSequence r1 = r3.getQueryHint()
                r4.readObject(r0, r1)
                return
            L29:
                android.view.inspector.InspectionCompanion$UninitializedPropertyMapException r0 = new android.view.inspector.InspectionCompanion$UninitializedPropertyMapException
                r0.<init>()
                throw r0
        }

        @Override // android.view.inspector.InspectionCompanion
        public /* bridge */ /* synthetic */ void readProperties(androidx.appcompat.widget.SearchView r1, android.view.inspector.PropertyReader r2) {
                r0 = this;
                androidx.appcompat.widget.SearchView r1 = (androidx.appcompat.widget.SearchView) r1
                r0.readProperties2(r1, r2)
                return
        }
    }

    public interface OnCloseListener {
        boolean onClose();
    }

    public interface OnQueryTextListener {
        boolean onQueryTextChange(java.lang.String r1);

        boolean onQueryTextSubmit(java.lang.String r1);
    }

    public interface OnSuggestionListener {
        boolean onSuggestionClick(int r1);

        boolean onSuggestionSelect(int r1);
    }

    private static class PreQAutoCompleteTextViewReflector {
        private java.lang.reflect.Method mDoAfterTextChanged;
        private java.lang.reflect.Method mDoBeforeTextChanged;
        private java.lang.reflect.Method mEnsureImeVisible;

        PreQAutoCompleteTextViewReflector() {
                r6 = this;
                r6.<init>()
                r0 = 0
                r6.mDoBeforeTextChanged = r0
                r6.mDoAfterTextChanged = r0
                r6.mEnsureImeVisible = r0
                preApi29Check()
                r0 = 0
                r1 = 1
                java.lang.Class<android.widget.AutoCompleteTextView> r2 = android.widget.AutoCompleteTextView.class
                java.lang.String r3 = "doBeforeTextChanged"
                java.lang.Class[] r4 = new java.lang.Class[r0]     // Catch: java.lang.NoSuchMethodException -> L21
                java.lang.reflect.Method r2 = r2.getDeclaredMethod(r3, r4)     // Catch: java.lang.NoSuchMethodException -> L21
                r6.mDoBeforeTextChanged = r2     // Catch: java.lang.NoSuchMethodException -> L21
                java.lang.reflect.Method r2 = r6.mDoBeforeTextChanged     // Catch: java.lang.NoSuchMethodException -> L21
                r2.setAccessible(r1)     // Catch: java.lang.NoSuchMethodException -> L21
                goto L22
            L21:
                r2 = move-exception
            L22:
                java.lang.Class<android.widget.AutoCompleteTextView> r2 = android.widget.AutoCompleteTextView.class
                java.lang.String r3 = "doAfterTextChanged"
                java.lang.Class[] r4 = new java.lang.Class[r0]     // Catch: java.lang.NoSuchMethodException -> L34
                java.lang.reflect.Method r2 = r2.getDeclaredMethod(r3, r4)     // Catch: java.lang.NoSuchMethodException -> L34
                r6.mDoAfterTextChanged = r2     // Catch: java.lang.NoSuchMethodException -> L34
                java.lang.reflect.Method r2 = r6.mDoAfterTextChanged     // Catch: java.lang.NoSuchMethodException -> L34
                r2.setAccessible(r1)     // Catch: java.lang.NoSuchMethodException -> L34
                goto L35
            L34:
                r2 = move-exception
            L35:
                java.lang.Class<android.widget.AutoCompleteTextView> r2 = android.widget.AutoCompleteTextView.class
                java.lang.String r3 = "ensureImeVisible"
                java.lang.Class[] r4 = new java.lang.Class[r1]     // Catch: java.lang.NoSuchMethodException -> L4b
                java.lang.Class r5 = java.lang.Boolean.TYPE     // Catch: java.lang.NoSuchMethodException -> L4b
                r4[r0] = r5     // Catch: java.lang.NoSuchMethodException -> L4b
                java.lang.reflect.Method r0 = r2.getMethod(r3, r4)     // Catch: java.lang.NoSuchMethodException -> L4b
                r6.mEnsureImeVisible = r0     // Catch: java.lang.NoSuchMethodException -> L4b
                java.lang.reflect.Method r0 = r6.mEnsureImeVisible     // Catch: java.lang.NoSuchMethodException -> L4b
                r0.setAccessible(r1)     // Catch: java.lang.NoSuchMethodException -> L4b
                goto L4c
            L4b:
                r0 = move-exception
            L4c:
                return
        }

        private static void preApi29Check() {
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 29
                if (r0 >= r1) goto L7
                return
            L7:
                java.lang.UnsupportedClassVersionError r0 = new java.lang.UnsupportedClassVersionError
                java.lang.String r1 = "This function can only be used for API Level < 29."
                r0.<init>(r1)
                throw r0
        }

        void doAfterTextChanged(android.widget.AutoCompleteTextView r3) {
                r2 = this;
                preApi29Check()
                java.lang.reflect.Method r0 = r2.mDoAfterTextChanged
                if (r0 == 0) goto L11
                java.lang.reflect.Method r0 = r2.mDoAfterTextChanged     // Catch: java.lang.Exception -> L10
                r1 = 0
                java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L10
                r0.invoke(r3, r1)     // Catch: java.lang.Exception -> L10
                goto L11
            L10:
                r0 = move-exception
            L11:
                return
        }

        void doBeforeTextChanged(android.widget.AutoCompleteTextView r3) {
                r2 = this;
                preApi29Check()
                java.lang.reflect.Method r0 = r2.mDoBeforeTextChanged
                if (r0 == 0) goto L11
                java.lang.reflect.Method r0 = r2.mDoBeforeTextChanged     // Catch: java.lang.Exception -> L10
                r1 = 0
                java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L10
                r0.invoke(r3, r1)     // Catch: java.lang.Exception -> L10
                goto L11
            L10:
                r0 = move-exception
            L11:
                return
        }

        void ensureImeVisible(android.widget.AutoCompleteTextView r3) {
                r2 = this;
                preApi29Check()
                java.lang.reflect.Method r0 = r2.mEnsureImeVisible
                if (r0 == 0) goto L17
                java.lang.reflect.Method r0 = r2.mEnsureImeVisible     // Catch: java.lang.Exception -> L16
                r1 = 1
                java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch: java.lang.Exception -> L16
                java.lang.Object[] r1 = new java.lang.Object[]{r1}     // Catch: java.lang.Exception -> L16
                r0.invoke(r3, r1)     // Catch: java.lang.Exception -> L16
                goto L17
            L16:
                r0 = move-exception
            L17:
                return
        }
    }

    static class SavedState extends androidx.customview.view.AbsSavedState {
        public static final android.os.Parcelable.Creator<androidx.appcompat.widget.SearchView.SavedState> CREATOR = null;
        boolean isIconified;


        static {
                androidx.appcompat.widget.SearchView$SavedState$1 r0 = new androidx.appcompat.widget.SearchView$SavedState$1
                r0.<init>()
                androidx.appcompat.widget.SearchView.SavedState.CREATOR = r0
                return
        }

        public SavedState(android.os.Parcel r2, java.lang.ClassLoader r3) {
                r1 = this;
                r1.<init>(r2, r3)
                r0 = 0
                java.lang.Object r0 = r2.readValue(r0)
                java.lang.Boolean r0 = (java.lang.Boolean) r0
                boolean r0 = r0.booleanValue()
                r1.isIconified = r0
                return
        }

        SavedState(android.os.Parcelable r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "SearchView.SavedState{"
                java.lang.StringBuilder r0 = r0.append(r1)
                int r1 = java.lang.System.identityHashCode(r2)
                java.lang.String r1 = java.lang.Integer.toHexString(r1)
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = " isIconified="
                java.lang.StringBuilder r0 = r0.append(r1)
                boolean r1 = r2.isIconified
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = "}"
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(android.os.Parcel r2, int r3) {
                r1 = this;
                super.writeToParcel(r2, r3)
                boolean r0 = r1.isIconified
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                r2.writeValue(r0)
                return
        }
    }

    public static class SearchAutoComplete extends androidx.appcompat.widget.AppCompatAutoCompleteTextView {
        private boolean mHasPendingShowSoftInputRequest;
        final java.lang.Runnable mRunShowSoftInputIfNecessary;
        private androidx.appcompat.widget.SearchView mSearchView;
        private int mThreshold;


        public SearchAutoComplete(android.content.Context r2) {
                r1 = this;
                r0 = 0
                r1.<init>(r2, r0)
                return
        }

        public SearchAutoComplete(android.content.Context r2, android.util.AttributeSet r3) {
                r1 = this;
                int r0 = androidx.appcompat.R.attr.autoCompleteTextViewStyle
                r1.<init>(r2, r3, r0)
                return
        }

        public SearchAutoComplete(android.content.Context r2, android.util.AttributeSet r3, int r4) {
                r1 = this;
                r1.<init>(r2, r3, r4)
                androidx.appcompat.widget.SearchView$SearchAutoComplete$1 r0 = new androidx.appcompat.widget.SearchView$SearchAutoComplete$1
                r0.<init>(r1)
                r1.mRunShowSoftInputIfNecessary = r0
                int r0 = r1.getThreshold()
                r1.mThreshold = r0
                return
        }

        private int getSearchViewTextMinWidthDp() {
                r5 = this;
                android.content.res.Resources r0 = r5.getResources()
                android.content.res.Configuration r0 = r0.getConfiguration()
                int r1 = r0.screenWidthDp
                int r2 = r0.screenHeightDp
                r3 = 960(0x3c0, float:1.345E-42)
                if (r1 < r3) goto L1c
                r3 = 720(0x2d0, float:1.009E-42)
                if (r2 < r3) goto L1c
                int r3 = r0.orientation
                r4 = 2
                if (r3 != r4) goto L1c
                r3 = 256(0x100, float:3.59E-43)
                return r3
            L1c:
                r3 = 600(0x258, float:8.41E-43)
                if (r1 >= r3) goto L2c
                r3 = 640(0x280, float:8.97E-43)
                if (r1 < r3) goto L29
                r3 = 480(0x1e0, float:6.73E-43)
                if (r2 < r3) goto L29
                goto L2c
            L29:
                r3 = 160(0xa0, float:2.24E-43)
                return r3
            L2c:
                r3 = 192(0xc0, float:2.69E-43)
                return r3
        }

        @Override // android.widget.AutoCompleteTextView
        public boolean enoughToFilter() {
                r1 = this;
                int r0 = r1.mThreshold
                if (r0 <= 0) goto Ld
                boolean r0 = super.enoughToFilter()
                if (r0 == 0) goto Lb
                goto Ld
            Lb:
                r0 = 0
                goto Le
            Ld:
                r0 = 1
            Le:
                return r0
        }

        void ensureImeVisible() {
                r2 = this;
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 29
                if (r0 < r1) goto L14
                r0 = 1
                androidx.appcompat.widget.SearchView.Api29Impl.setInputMethodMode(r2, r0)
                boolean r0 = r2.enoughToFilter()
                if (r0 == 0) goto L19
                r2.showDropDown()
                goto L19
            L14:
                androidx.appcompat.widget.SearchView$PreQAutoCompleteTextViewReflector r0 = androidx.appcompat.widget.SearchView.PRE_API_29_HIDDEN_METHOD_INVOKER
                r0.ensureImeVisible(r2)
            L19:
                return
        }

        boolean isEmpty() {
                r1 = this;
                android.text.Editable r0 = r1.getText()
                int r0 = android.text.TextUtils.getTrimmedLength(r0)
                if (r0 != 0) goto Lc
                r0 = 1
                goto Ld
            Lc:
                r0 = 0
            Ld:
                return r0
        }

        @Override // androidx.appcompat.widget.AppCompatAutoCompleteTextView, android.widget.TextView, android.view.View
        public android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo r3) {
                r2 = this;
                android.view.inputmethod.InputConnection r0 = super.onCreateInputConnection(r3)
                boolean r1 = r2.mHasPendingShowSoftInputRequest
                if (r1 == 0) goto L12
                java.lang.Runnable r1 = r2.mRunShowSoftInputIfNecessary
                r2.removeCallbacks(r1)
                java.lang.Runnable r1 = r2.mRunShowSoftInputIfNecessary
                r2.post(r1)
            L12:
                return r0
        }

        @Override // android.view.View
        protected void onFinishInflate() {
                r3 = this;
                super.onFinishInflate()
                android.content.res.Resources r0 = r3.getResources()
                android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
                int r1 = r3.getSearchViewTextMinWidthDp()
                float r1 = (float) r1
                r2 = 1
                float r1 = android.util.TypedValue.applyDimension(r2, r1, r0)
                int r1 = (int) r1
                r3.setMinWidth(r1)
                return
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        protected void onFocusChanged(boolean r2, int r3, android.graphics.Rect r4) {
                r1 = this;
                super.onFocusChanged(r2, r3, r4)
                androidx.appcompat.widget.SearchView r0 = r1.mSearchView
                r0.onTextFocusChanged()
                return
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public boolean onKeyPreIme(int r4, android.view.KeyEvent r5) {
                r3 = this;
                r0 = 4
                if (r4 != r0) goto L3f
                int r0 = r5.getAction()
                r1 = 1
                if (r0 != 0) goto L1a
                int r0 = r5.getRepeatCount()
                if (r0 != 0) goto L1a
                android.view.KeyEvent$DispatcherState r0 = r3.getKeyDispatcherState()
                if (r0 == 0) goto L19
                r0.startTracking(r5, r3)
            L19:
                return r1
            L1a:
                int r0 = r5.getAction()
                if (r0 != r1) goto L3f
                android.view.KeyEvent$DispatcherState r0 = r3.getKeyDispatcherState()
                if (r0 == 0) goto L29
                r0.handleUpEvent(r5)
            L29:
                boolean r2 = r5.isTracking()
                if (r2 == 0) goto L3f
                boolean r2 = r5.isCanceled()
                if (r2 != 0) goto L3f
                androidx.appcompat.widget.SearchView r2 = r3.mSearchView
                r2.clearFocus()
                r2 = 0
                r3.setImeVisibility(r2)
                return r1
            L3f:
                boolean r0 = super.onKeyPreIme(r4, r5)
                return r0
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public void onWindowFocusChanged(boolean r2) {
                r1 = this;
                super.onWindowFocusChanged(r2)
                if (r2 == 0) goto L23
                androidx.appcompat.widget.SearchView r0 = r1.mSearchView
                boolean r0 = r0.hasFocus()
                if (r0 == 0) goto L23
                int r0 = r1.getVisibility()
                if (r0 != 0) goto L23
                r0 = 1
                r1.mHasPendingShowSoftInputRequest = r0
                android.content.Context r0 = r1.getContext()
                boolean r0 = androidx.appcompat.widget.SearchView.isLandscapeMode(r0)
                if (r0 == 0) goto L23
                r1.ensureImeVisible()
            L23:
                return
        }

        @Override // android.widget.AutoCompleteTextView
        public void performCompletion() {
                r0 = this;
                return
        }

        @Override // android.widget.AutoCompleteTextView
        protected void replaceText(java.lang.CharSequence r1) {
                r0 = this;
                return
        }

        void setImeVisibility(boolean r4) {
                r3 = this;
                android.content.Context r0 = r3.getContext()
                java.lang.String r1 = "input_method"
                java.lang.Object r0 = r0.getSystemService(r1)
                android.view.inputmethod.InputMethodManager r0 = (android.view.inputmethod.InputMethodManager) r0
                r1 = 0
                if (r4 != 0) goto L1f
                r3.mHasPendingShowSoftInputRequest = r1
                java.lang.Runnable r2 = r3.mRunShowSoftInputIfNecessary
                r3.removeCallbacks(r2)
                android.os.IBinder r2 = r3.getWindowToken()
                r0.hideSoftInputFromWindow(r2, r1)
                return
            L1f:
                boolean r2 = r0.isActive(r3)
                if (r2 == 0) goto L30
                r3.mHasPendingShowSoftInputRequest = r1
                java.lang.Runnable r2 = r3.mRunShowSoftInputIfNecessary
                r3.removeCallbacks(r2)
                r0.showSoftInput(r3, r1)
                return
            L30:
                r1 = 1
                r3.mHasPendingShowSoftInputRequest = r1
                return
        }

        void setSearchView(androidx.appcompat.widget.SearchView r1) {
                r0 = this;
                r0.mSearchView = r1
                return
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int r1) {
                r0 = this;
                super.setThreshold(r1)
                r0.mThreshold = r1
                return
        }

        void showSoftInputIfNecessary() {
                r2 = this;
                boolean r0 = r2.mHasPendingShowSoftInputRequest
                if (r0 == 0) goto L17
            L5:
                android.content.Context r0 = r2.getContext()
                java.lang.String r1 = "input_method"
                java.lang.Object r0 = r0.getSystemService(r1)
                android.view.inputmethod.InputMethodManager r0 = (android.view.inputmethod.InputMethodManager) r0
                r1 = 0
                r0.showSoftInput(r2, r1)
                r2.mHasPendingShowSoftInputRequest = r1
            L17:
                return
        }
    }

    private static class UpdatableTouchDelegate extends android.view.TouchDelegate {
        private final android.graphics.Rect mActualBounds;
        private boolean mDelegateTargeted;
        private final android.view.View mDelegateView;
        private final int mSlop;
        private final android.graphics.Rect mSlopBounds;
        private final android.graphics.Rect mTargetBounds;

        public UpdatableTouchDelegate(android.graphics.Rect r2, android.graphics.Rect r3, android.view.View r4) {
                r1 = this;
                r1.<init>(r2, r4)
                android.content.Context r0 = r4.getContext()
                android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r0)
                int r0 = r0.getScaledTouchSlop()
                r1.mSlop = r0
                android.graphics.Rect r0 = new android.graphics.Rect
                r0.<init>()
                r1.mTargetBounds = r0
                android.graphics.Rect r0 = new android.graphics.Rect
                r0.<init>()
                r1.mSlopBounds = r0
                android.graphics.Rect r0 = new android.graphics.Rect
                r0.<init>()
                r1.mActualBounds = r0
                r1.setBounds(r2, r3)
                r1.mDelegateView = r4
                return
        }

        @Override // android.view.TouchDelegate
        public boolean onTouchEvent(android.view.MotionEvent r8) {
                r7 = this;
                float r0 = r8.getX()
                int r0 = (int) r0
                float r1 = r8.getY()
                int r1 = (int) r1
                r2 = 0
                r3 = 1
                r4 = 0
                int r5 = r8.getAction()
                switch(r5) {
                    case 0: goto L29;
                    case 1: goto L1b;
                    case 2: goto L1b;
                    case 3: goto L15;
                    default: goto L14;
                }
            L14:
                goto L35
            L15:
                boolean r2 = r7.mDelegateTargeted
                r5 = 0
                r7.mDelegateTargeted = r5
                goto L35
            L1b:
                boolean r2 = r7.mDelegateTargeted
                if (r2 == 0) goto L35
                android.graphics.Rect r5 = r7.mSlopBounds
                boolean r5 = r5.contains(r0, r1)
                if (r5 != 0) goto L35
                r3 = 0
                goto L35
            L29:
                android.graphics.Rect r5 = r7.mTargetBounds
                boolean r5 = r5.contains(r0, r1)
                if (r5 == 0) goto L35
                r5 = 1
                r7.mDelegateTargeted = r5
                r2 = 1
            L35:
                if (r2 == 0) goto L6e
                if (r3 == 0) goto L57
                android.graphics.Rect r5 = r7.mActualBounds
                boolean r5 = r5.contains(r0, r1)
                if (r5 != 0) goto L57
                android.view.View r5 = r7.mDelegateView
                int r5 = r5.getWidth()
                int r5 = r5 / 2
                float r5 = (float) r5
                android.view.View r6 = r7.mDelegateView
                int r6 = r6.getHeight()
                int r6 = r6 / 2
                float r6 = (float) r6
                r8.setLocation(r5, r6)
                goto L68
            L57:
                android.graphics.Rect r5 = r7.mActualBounds
                int r5 = r5.left
                int r5 = r0 - r5
                float r5 = (float) r5
                android.graphics.Rect r6 = r7.mActualBounds
                int r6 = r6.top
                int r6 = r1 - r6
                float r6 = (float) r6
                r8.setLocation(r5, r6)
            L68:
                android.view.View r5 = r7.mDelegateView
                boolean r4 = r5.dispatchTouchEvent(r8)
            L6e:
                return r4
        }

        public void setBounds(android.graphics.Rect r4, android.graphics.Rect r5) {
                r3 = this;
                android.graphics.Rect r0 = r3.mTargetBounds
                r0.set(r4)
                android.graphics.Rect r0 = r3.mSlopBounds
                r0.set(r4)
                android.graphics.Rect r0 = r3.mSlopBounds
                int r1 = r3.mSlop
                int r1 = -r1
                int r2 = r3.mSlop
                int r2 = -r2
                r0.inset(r1, r2)
                android.graphics.Rect r0 = r3.mActualBounds
                r0.set(r5)
                return
        }
    }

    static {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 >= r1) goto Lc
            androidx.appcompat.widget.SearchView$PreQAutoCompleteTextViewReflector r0 = new androidx.appcompat.widget.SearchView$PreQAutoCompleteTextViewReflector
            r0.<init>()
            goto Ld
        Lc:
            r0 = 0
        Ld:
            androidx.appcompat.widget.SearchView.PRE_API_29_HIDDEN_METHOD_INVOKER = r0
            return
    }

    public SearchView(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public SearchView(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            int r0 = androidx.appcompat.R.attr.searchViewStyle
            r1.<init>(r2, r3, r0)
            return
    }

    public SearchView(android.content.Context r13, android.util.AttributeSet r14, int r15) {
            r12 = this;
            r12.<init>(r13, r14, r15)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r12.mSearchSrcTextViewBounds = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r12.mSearchSrtTextViewBoundsExpanded = r0
            r0 = 2
            int[] r1 = new int[r0]
            r12.mTemp = r1
            int[] r0 = new int[r0]
            r12.mTemp2 = r0
            androidx.appcompat.widget.SearchView$1 r0 = new androidx.appcompat.widget.SearchView$1
            r0.<init>(r12)
            r12.mUpdateDrawableStateRunnable = r0
            androidx.appcompat.widget.SearchView$2 r0 = new androidx.appcompat.widget.SearchView$2
            r0.<init>(r12)
            r12.mReleaseCursorRunnable = r0
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            r12.mOutsideDrawablesCache = r0
            androidx.appcompat.widget.SearchView$5 r0 = new androidx.appcompat.widget.SearchView$5
            r0.<init>(r12)
            r12.mOnClickListener = r0
            androidx.appcompat.widget.SearchView$6 r0 = new androidx.appcompat.widget.SearchView$6
            r0.<init>(r12)
            r12.mTextKeyListener = r0
            androidx.appcompat.widget.SearchView$7 r0 = new androidx.appcompat.widget.SearchView$7
            r0.<init>(r12)
            r12.mOnEditorActionListener = r0
            androidx.appcompat.widget.SearchView$8 r0 = new androidx.appcompat.widget.SearchView$8
            r0.<init>(r12)
            r12.mOnItemClickListener = r0
            androidx.appcompat.widget.SearchView$9 r0 = new androidx.appcompat.widget.SearchView$9
            r0.<init>(r12)
            r12.mOnItemSelectedListener = r0
            androidx.appcompat.widget.SearchView$10 r0 = new androidx.appcompat.widget.SearchView$10
            r0.<init>(r12)
            r12.mTextWatcher = r0
            int[] r0 = androidx.appcompat.R.styleable.SearchView
            r1 = 0
            androidx.appcompat.widget.TintTypedArray r0 = androidx.appcompat.widget.TintTypedArray.obtainStyledAttributes(r13, r14, r0, r15, r1)
            int[] r4 = androidx.appcompat.R.styleable.SearchView
            android.content.res.TypedArray r6 = r0.getWrappedTypeArray()
            r8 = 0
            r2 = r12
            r3 = r13
            r5 = r14
            r7 = r15
            androidx.core.view.ViewCompat.saveAttributeDataForStyleable(r2, r3, r4, r5, r6, r7, r8)
            android.view.LayoutInflater r13 = android.view.LayoutInflater.from(r3)
            int r14 = androidx.appcompat.R.styleable.SearchView_layout
            int r15 = androidx.appcompat.R.layout.abc_search_view
            int r14 = r0.getResourceId(r14, r15)
            r15 = 1
            r13.inflate(r14, r12, r15)
            int r4 = androidx.appcompat.R.id.search_src_text
            android.view.View r4 = r12.findViewById(r4)
            androidx.appcompat.widget.SearchView$SearchAutoComplete r4 = (androidx.appcompat.widget.SearchView.SearchAutoComplete) r4
            r2.mSearchSrcTextView = r4
            androidx.appcompat.widget.SearchView$SearchAutoComplete r4 = r2.mSearchSrcTextView
            r4.setSearchView(r12)
            int r4 = androidx.appcompat.R.id.search_edit_frame
            android.view.View r4 = r12.findViewById(r4)
            r2.mSearchEditFrame = r4
            int r4 = androidx.appcompat.R.id.search_plate
            android.view.View r4 = r12.findViewById(r4)
            r2.mSearchPlate = r4
            int r4 = androidx.appcompat.R.id.submit_area
            android.view.View r4 = r12.findViewById(r4)
            r2.mSubmitArea = r4
            int r4 = androidx.appcompat.R.id.search_button
            android.view.View r4 = r12.findViewById(r4)
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            r2.mSearchButton = r4
            int r4 = androidx.appcompat.R.id.search_go_btn
            android.view.View r4 = r12.findViewById(r4)
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            r2.mGoButton = r4
            int r4 = androidx.appcompat.R.id.search_close_btn
            android.view.View r4 = r12.findViewById(r4)
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            r2.mCloseButton = r4
            int r4 = androidx.appcompat.R.id.search_voice_btn
            android.view.View r4 = r12.findViewById(r4)
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            r2.mVoiceButton = r4
            int r4 = androidx.appcompat.R.id.search_mag_icon
            android.view.View r4 = r12.findViewById(r4)
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            r2.mCollapsedIcon = r4
            android.view.View r4 = r2.mSearchPlate
            int r6 = androidx.appcompat.R.styleable.SearchView_queryBackground
            android.graphics.drawable.Drawable r6 = r0.getDrawable(r6)
            androidx.core.view.ViewCompat.setBackground(r4, r6)
            android.view.View r4 = r2.mSubmitArea
            int r6 = androidx.appcompat.R.styleable.SearchView_submitBackground
            android.graphics.drawable.Drawable r6 = r0.getDrawable(r6)
            androidx.core.view.ViewCompat.setBackground(r4, r6)
            android.widget.ImageView r4 = r2.mSearchButton
            int r6 = androidx.appcompat.R.styleable.SearchView_searchIcon
            android.graphics.drawable.Drawable r6 = r0.getDrawable(r6)
            r4.setImageDrawable(r6)
            android.widget.ImageView r4 = r2.mGoButton
            int r6 = androidx.appcompat.R.styleable.SearchView_goIcon
            android.graphics.drawable.Drawable r6 = r0.getDrawable(r6)
            r4.setImageDrawable(r6)
            android.widget.ImageView r4 = r2.mCloseButton
            int r6 = androidx.appcompat.R.styleable.SearchView_closeIcon
            android.graphics.drawable.Drawable r6 = r0.getDrawable(r6)
            r4.setImageDrawable(r6)
            android.widget.ImageView r4 = r2.mVoiceButton
            int r6 = androidx.appcompat.R.styleable.SearchView_voiceIcon
            android.graphics.drawable.Drawable r6 = r0.getDrawable(r6)
            r4.setImageDrawable(r6)
            android.widget.ImageView r4 = r2.mCollapsedIcon
            int r6 = androidx.appcompat.R.styleable.SearchView_searchIcon
            android.graphics.drawable.Drawable r6 = r0.getDrawable(r6)
            r4.setImageDrawable(r6)
            int r4 = androidx.appcompat.R.styleable.SearchView_searchHintIcon
            android.graphics.drawable.Drawable r4 = r0.getDrawable(r4)
            r2.mSearchHintIcon = r4
            android.widget.ImageView r4 = r2.mSearchButton
            android.content.res.Resources r6 = r12.getResources()
            int r8 = androidx.appcompat.R.string.abc_searchview_description_search
            java.lang.String r6 = r6.getString(r8)
            androidx.appcompat.widget.TooltipCompat.setTooltipText(r4, r6)
            int r4 = androidx.appcompat.R.styleable.SearchView_suggestionRowLayout
            int r6 = androidx.appcompat.R.layout.abc_search_dropdown_item_icons_2line
            int r4 = r0.getResourceId(r4, r6)
            r2.mSuggestionRowLayout = r4
            int r4 = androidx.appcompat.R.styleable.SearchView_commitIcon
            int r1 = r0.getResourceId(r4, r1)
            r2.mSuggestionCommitIconResId = r1
            android.widget.ImageView r1 = r2.mSearchButton
            android.view.View$OnClickListener r4 = r2.mOnClickListener
            r1.setOnClickListener(r4)
            android.widget.ImageView r1 = r2.mCloseButton
            android.view.View$OnClickListener r4 = r2.mOnClickListener
            r1.setOnClickListener(r4)
            android.widget.ImageView r1 = r2.mGoButton
            android.view.View$OnClickListener r4 = r2.mOnClickListener
            r1.setOnClickListener(r4)
            android.widget.ImageView r1 = r2.mVoiceButton
            android.view.View$OnClickListener r4 = r2.mOnClickListener
            r1.setOnClickListener(r4)
            androidx.appcompat.widget.SearchView$SearchAutoComplete r1 = r2.mSearchSrcTextView
            android.view.View$OnClickListener r4 = r2.mOnClickListener
            r1.setOnClickListener(r4)
            androidx.appcompat.widget.SearchView$SearchAutoComplete r1 = r2.mSearchSrcTextView
            android.text.TextWatcher r4 = r2.mTextWatcher
            r1.addTextChangedListener(r4)
            androidx.appcompat.widget.SearchView$SearchAutoComplete r1 = r2.mSearchSrcTextView
            android.widget.TextView$OnEditorActionListener r4 = r2.mOnEditorActionListener
            r1.setOnEditorActionListener(r4)
            androidx.appcompat.widget.SearchView$SearchAutoComplete r1 = r2.mSearchSrcTextView
            android.widget.AdapterView$OnItemClickListener r4 = r2.mOnItemClickListener
            r1.setOnItemClickListener(r4)
            androidx.appcompat.widget.SearchView$SearchAutoComplete r1 = r2.mSearchSrcTextView
            android.widget.AdapterView$OnItemSelectedListener r4 = r2.mOnItemSelectedListener
            r1.setOnItemSelectedListener(r4)
            androidx.appcompat.widget.SearchView$SearchAutoComplete r1 = r2.mSearchSrcTextView
            android.view.View$OnKeyListener r4 = r2.mTextKeyListener
            r1.setOnKeyListener(r4)
            androidx.appcompat.widget.SearchView$SearchAutoComplete r1 = r2.mSearchSrcTextView
            androidx.appcompat.widget.SearchView$3 r4 = new androidx.appcompat.widget.SearchView$3
            r4.<init>(r12)
            r1.setOnFocusChangeListener(r4)
            int r1 = androidx.appcompat.R.styleable.SearchView_iconifiedByDefault
            boolean r15 = r0.getBoolean(r1, r15)
            r12.setIconifiedByDefault(r15)
            int r15 = androidx.appcompat.R.styleable.SearchView_android_maxWidth
            r1 = -1
            int r15 = r0.getDimensionPixelSize(r15, r1)
            if (r15 == r1) goto L1b2
            r12.setMaxWidth(r15)
        L1b2:
            int r4 = androidx.appcompat.R.styleable.SearchView_defaultQueryHint
            java.lang.CharSequence r4 = r0.getText(r4)
            r2.mDefaultQueryHint = r4
            int r4 = androidx.appcompat.R.styleable.SearchView_queryHint
            java.lang.CharSequence r4 = r0.getText(r4)
            r2.mQueryHint = r4
            int r4 = androidx.appcompat.R.styleable.SearchView_android_imeOptions
            int r4 = r0.getInt(r4, r1)
            if (r4 == r1) goto L1cd
            r12.setImeOptions(r4)
        L1cd:
            int r6 = androidx.appcompat.R.styleable.SearchView_android_inputType
            int r6 = r0.getInt(r6, r1)
            if (r6 == r1) goto L1d8
            r12.setInputType(r6)
        L1d8:
            r1 = 1
            int r8 = androidx.appcompat.R.styleable.SearchView_android_focusable
            boolean r1 = r0.getBoolean(r8, r1)
            r12.setFocusable(r1)
            r0.recycle()
            android.content.Intent r8 = new android.content.Intent
            java.lang.String r9 = "android.speech.action.WEB_SEARCH"
            r8.<init>(r9)
            r2.mVoiceWebSearchIntent = r8
            android.content.Intent r8 = r2.mVoiceWebSearchIntent
            r9 = 268435456(0x10000000, float:2.524355E-29)
            r8.addFlags(r9)
            android.content.Intent r8 = r2.mVoiceWebSearchIntent
            java.lang.String r10 = "android.speech.extra.LANGUAGE_MODEL"
            java.lang.String r11 = "web_search"
            r8.putExtra(r10, r11)
            android.content.Intent r8 = new android.content.Intent
            java.lang.String r10 = "android.speech.action.RECOGNIZE_SPEECH"
            r8.<init>(r10)
            r2.mVoiceAppSearchIntent = r8
            android.content.Intent r8 = r2.mVoiceAppSearchIntent
            r8.addFlags(r9)
            androidx.appcompat.widget.SearchView$SearchAutoComplete r8 = r2.mSearchSrcTextView
            int r8 = r8.getDropDownAnchor()
            android.view.View r8 = r12.findViewById(r8)
            r2.mDropDownAnchor = r8
            android.view.View r8 = r2.mDropDownAnchor
            if (r8 == 0) goto L226
            android.view.View r8 = r2.mDropDownAnchor
            androidx.appcompat.widget.SearchView$4 r9 = new androidx.appcompat.widget.SearchView$4
            r9.<init>(r12)
            r8.addOnLayoutChangeListener(r9)
        L226:
            boolean r8 = r2.mIconifiedByDefault
            r12.updateViewsVisibility(r8)
            r12.updateQueryHint()
            return
    }

    private android.content.Intent createIntent(java.lang.String r4, android.net.Uri r5, java.lang.String r6, java.lang.String r7, int r8, java.lang.String r9) {
            r3 = this;
            android.content.Intent r0 = new android.content.Intent
            r0.<init>(r4)
            r1 = 268435456(0x10000000, float:2.524355E-29)
            r0.addFlags(r1)
            if (r5 == 0) goto Lf
            r0.setData(r5)
        Lf:
            java.lang.String r1 = "user_query"
            java.lang.CharSequence r2 = r3.mUserQuery
            r0.putExtra(r1, r2)
            if (r7 == 0) goto L1d
            java.lang.String r1 = "query"
            r0.putExtra(r1, r7)
        L1d:
            if (r6 == 0) goto L24
            java.lang.String r1 = "intent_extra_data_key"
            r0.putExtra(r1, r6)
        L24:
            android.os.Bundle r1 = r3.mAppSearchData
            if (r1 == 0) goto L2f
            java.lang.String r1 = "app_data"
            android.os.Bundle r2 = r3.mAppSearchData
            r0.putExtra(r1, r2)
        L2f:
            if (r8 == 0) goto L3b
            java.lang.String r1 = "action_key"
            r0.putExtra(r1, r8)
            java.lang.String r1 = "action_msg"
            r0.putExtra(r1, r9)
        L3b:
            android.app.SearchableInfo r1 = r3.mSearchable
            android.content.ComponentName r1 = r1.getSearchActivity()
            r0.setComponent(r1)
            return r0
    }

    private android.content.Intent createIntentFromSuggestion(android.database.Cursor r10, int r11, java.lang.String r12) {
            r9 = this;
            r1 = 0
            java.lang.String r0 = "suggest_intent_action"
            java.lang.String r0 = androidx.appcompat.widget.SuggestionsAdapter.getColumnString(r10, r0)     // Catch: java.lang.RuntimeException -> L72
            if (r0 != 0) goto L16
            android.app.SearchableInfo r2 = r9.mSearchable     // Catch: java.lang.RuntimeException -> L11
            java.lang.String r2 = r2.getSuggestIntentAction()     // Catch: java.lang.RuntimeException -> L11
            r0 = r2
            goto L16
        L11:
            r0 = move-exception
            r7 = r11
            r8 = r12
            goto L75
        L16:
            if (r0 != 0) goto L1d
            java.lang.String r2 = "android.intent.action.SEARCH"
            r0 = r2
            r3 = r0
            goto L1e
        L1d:
            r3 = r0
        L1e:
            java.lang.String r0 = "suggest_intent_data"
            java.lang.String r0 = androidx.appcompat.widget.SuggestionsAdapter.getColumnString(r10, r0)     // Catch: java.lang.RuntimeException -> L72
            if (r0 != 0) goto L2d
            android.app.SearchableInfo r2 = r9.mSearchable     // Catch: java.lang.RuntimeException -> L11
            java.lang.String r2 = r2.getSuggestIntentData()     // Catch: java.lang.RuntimeException -> L11
            r0 = r2
        L2d:
            if (r0 == 0) goto L53
            java.lang.String r2 = "suggest_intent_data_id"
            java.lang.String r2 = androidx.appcompat.widget.SuggestionsAdapter.getColumnString(r10, r2)     // Catch: java.lang.RuntimeException -> L11
            if (r2 == 0) goto L53
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.RuntimeException -> L11
            r4.<init>()     // Catch: java.lang.RuntimeException -> L11
            java.lang.StringBuilder r4 = r4.append(r0)     // Catch: java.lang.RuntimeException -> L11
            java.lang.String r5 = "/"
            java.lang.StringBuilder r4 = r4.append(r5)     // Catch: java.lang.RuntimeException -> L11
            java.lang.String r5 = android.net.Uri.encode(r2)     // Catch: java.lang.RuntimeException -> L11
            java.lang.StringBuilder r4 = r4.append(r5)     // Catch: java.lang.RuntimeException -> L11
            java.lang.String r4 = r4.toString()     // Catch: java.lang.RuntimeException -> L11
            r0 = r4
        L53:
            if (r0 != 0) goto L57
            r4 = r1
            goto L5c
        L57:
            android.net.Uri r2 = android.net.Uri.parse(r0)     // Catch: java.lang.RuntimeException -> L72
            r4 = r2
        L5c:
            java.lang.String r2 = "suggest_intent_query"
            java.lang.String r6 = androidx.appcompat.widget.SuggestionsAdapter.getColumnString(r10, r2)     // Catch: java.lang.RuntimeException -> L72
            java.lang.String r2 = "suggest_intent_extra_data"
            java.lang.String r5 = androidx.appcompat.widget.SuggestionsAdapter.getColumnString(r10, r2)     // Catch: java.lang.RuntimeException -> L72
            r2 = r9
            r7 = r11
            r8 = r12
            android.content.Intent r11 = r2.createIntent(r3, r4, r5, r6, r7, r8)     // Catch: java.lang.RuntimeException -> L70
            return r11
        L70:
            r0 = move-exception
            goto L75
        L72:
            r0 = move-exception
            r7 = r11
            r8 = r12
        L75:
            r11 = r0
            int r12 = r10.getPosition()     // Catch: java.lang.RuntimeException -> L7b
            goto L7f
        L7b:
            r0 = move-exception
            r12 = r0
            r0 = -1
            r12 = r0
        L7f:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Search suggestions cursor at row "
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.StringBuilder r0 = r0.append(r12)
            java.lang.String r2 = " returned exception."
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "SearchView"
            android.util.Log.w(r2, r0, r11)
            return r1
    }

    private android.content.Intent createVoiceAppSearchIntent(android.content.Intent r13, android.app.SearchableInfo r14) {
            r12 = this;
            android.content.ComponentName r0 = r14.getSearchActivity()
            android.content.Intent r1 = new android.content.Intent
            java.lang.String r2 = "android.intent.action.SEARCH"
            r1.<init>(r2)
            r1.setComponent(r0)
            android.content.Context r2 = r12.getContext()
            r3 = 0
            r4 = 1107296256(0x42000000, float:32.0)
            android.app.PendingIntent r2 = android.app.PendingIntent.getActivity(r2, r3, r1, r4)
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            android.os.Bundle r4 = r12.mAppSearchData
            if (r4 == 0) goto L29
            java.lang.String r4 = "app_data"
            android.os.Bundle r5 = r12.mAppSearchData
            r3.putParcelable(r4, r5)
        L29:
            android.content.Intent r4 = new android.content.Intent
            r4.<init>(r13)
            java.lang.String r5 = "free_form"
            r6 = 0
            r7 = 0
            r8 = 1
            android.content.res.Resources r9 = r12.getResources()
            int r10 = r14.getVoiceLanguageModeId()
            if (r10 == 0) goto L45
            int r10 = r14.getVoiceLanguageModeId()
            java.lang.String r5 = r9.getString(r10)
        L45:
            int r10 = r14.getVoicePromptTextId()
            if (r10 == 0) goto L53
            int r10 = r14.getVoicePromptTextId()
            java.lang.String r6 = r9.getString(r10)
        L53:
            int r10 = r14.getVoiceLanguageId()
            if (r10 == 0) goto L61
            int r10 = r14.getVoiceLanguageId()
            java.lang.String r7 = r9.getString(r10)
        L61:
            int r10 = r14.getVoiceMaxResults()
            if (r10 == 0) goto L6b
            int r8 = r14.getVoiceMaxResults()
        L6b:
            java.lang.String r10 = "android.speech.extra.LANGUAGE_MODEL"
            r4.putExtra(r10, r5)
            java.lang.String r10 = "android.speech.extra.PROMPT"
            r4.putExtra(r10, r6)
            java.lang.String r10 = "android.speech.extra.LANGUAGE"
            r4.putExtra(r10, r7)
            java.lang.String r10 = "android.speech.extra.MAX_RESULTS"
            r4.putExtra(r10, r8)
            if (r0 != 0) goto L83
            r10 = 0
            goto L87
        L83:
            java.lang.String r10 = r0.flattenToShortString()
        L87:
            java.lang.String r11 = "calling_package"
            r4.putExtra(r11, r10)
            java.lang.String r10 = "android.speech.extra.RESULTS_PENDINGINTENT"
            r4.putExtra(r10, r2)
            java.lang.String r10 = "android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE"
            r4.putExtra(r10, r3)
            return r4
    }

    private android.content.Intent createVoiceWebSearchIntent(android.content.Intent r5, android.app.SearchableInfo r6) {
            r4 = this;
            android.content.Intent r0 = new android.content.Intent
            r0.<init>(r5)
            android.content.ComponentName r1 = r6.getSearchActivity()
            if (r1 != 0) goto Ld
            r2 = 0
            goto L11
        Ld:
            java.lang.String r2 = r1.flattenToShortString()
        L11:
            java.lang.String r3 = "calling_package"
            r0.putExtra(r3, r2)
            return r0
    }

    private void dismissSuggestions() {
            r1 = this;
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r1.mSearchSrcTextView
            r0.dismissDropDown()
            return
    }

    private void getChildBoundsWithinSearchView(android.view.View r5, android.graphics.Rect r6) {
            r4 = this;
            int[] r0 = r4.mTemp
            r5.getLocationInWindow(r0)
            int[] r0 = r4.mTemp2
            r4.getLocationInWindow(r0)
            int[] r0 = r4.mTemp
            r1 = 1
            r0 = r0[r1]
            int[] r2 = r4.mTemp2
            r1 = r2[r1]
            int r0 = r0 - r1
            int[] r1 = r4.mTemp
            r2 = 0
            r1 = r1[r2]
            int[] r3 = r4.mTemp2
            r2 = r3[r2]
            int r1 = r1 - r2
            int r2 = r5.getWidth()
            int r2 = r2 + r1
            int r3 = r5.getHeight()
            int r3 = r3 + r0
            r6.set(r1, r0, r2, r3)
            return
    }

    private java.lang.CharSequence getDecoratedHint(java.lang.CharSequence r7) {
            r6 = this;
            boolean r0 = r6.mIconifiedByDefault
            if (r0 == 0) goto L33
            android.graphics.drawable.Drawable r0 = r6.mSearchHintIcon
            if (r0 != 0) goto L9
            goto L33
        L9:
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r6.mSearchSrcTextView
            float r0 = r0.getTextSize()
            double r0 = (double) r0
            r2 = 4608308318706860032(0x3ff4000000000000, double:1.25)
            double r0 = r0 * r2
            int r0 = (int) r0
            android.graphics.drawable.Drawable r1 = r6.mSearchHintIcon
            r2 = 0
            r1.setBounds(r2, r2, r0, r0)
            android.text.SpannableStringBuilder r1 = new android.text.SpannableStringBuilder
            java.lang.String r2 = "   "
            r1.<init>(r2)
            android.text.style.ImageSpan r2 = new android.text.style.ImageSpan
            android.graphics.drawable.Drawable r3 = r6.mSearchHintIcon
            r2.<init>(r3)
            r3 = 2
            r4 = 33
            r5 = 1
            r1.setSpan(r2, r5, r3, r4)
            r1.append(r7)
            return r1
        L33:
            return r7
    }

    private int getPreferredHeight() {
            r2 = this;
            android.content.Context r0 = r2.getContext()
            android.content.res.Resources r0 = r0.getResources()
            int r1 = androidx.appcompat.R.dimen.abc_search_view_preferred_height
            int r0 = r0.getDimensionPixelSize(r1)
            return r0
    }

    private int getPreferredWidth() {
            r2 = this;
            android.content.Context r0 = r2.getContext()
            android.content.res.Resources r0 = r0.getResources()
            int r1 = androidx.appcompat.R.dimen.abc_search_view_preferred_width
            int r0 = r0.getDimensionPixelSize(r1)
            return r0
    }

    private boolean hasVoiceSearch() {
            r4 = this;
            android.app.SearchableInfo r0 = r4.mSearchable
            r1 = 0
            if (r0 == 0) goto L37
            android.app.SearchableInfo r0 = r4.mSearchable
            boolean r0 = r0.getVoiceSearchEnabled()
            if (r0 == 0) goto L37
            r0 = 0
            android.app.SearchableInfo r2 = r4.mSearchable
            boolean r2 = r2.getVoiceSearchLaunchWebSearch()
            if (r2 == 0) goto L19
            android.content.Intent r0 = r4.mVoiceWebSearchIntent
            goto L23
        L19:
            android.app.SearchableInfo r2 = r4.mSearchable
            boolean r2 = r2.getVoiceSearchLaunchRecognizer()
            if (r2 == 0) goto L23
            android.content.Intent r0 = r4.mVoiceAppSearchIntent
        L23:
            if (r0 == 0) goto L37
            android.content.Context r2 = r4.getContext()
            android.content.pm.PackageManager r2 = r2.getPackageManager()
            r3 = 65536(0x10000, float:9.1835E-41)
            android.content.pm.ResolveInfo r2 = r2.resolveActivity(r0, r3)
            if (r2 == 0) goto L36
            r1 = 1
        L36:
            return r1
        L37:
            return r1
    }

    static boolean isLandscapeMode(android.content.Context r2) {
            android.content.res.Resources r0 = r2.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r0 = r0.orientation
            r1 = 2
            if (r0 != r1) goto Lf
            r0 = 1
            goto L10
        Lf:
            r0 = 0
        L10:
            return r0
    }

    private boolean isSubmitAreaEnabled() {
            r1 = this;
            boolean r0 = r1.mSubmitButtonEnabled
            if (r0 != 0) goto L8
            boolean r0 = r1.mVoiceButtonEnabled
            if (r0 == 0) goto L10
        L8:
            boolean r0 = r1.isIconified()
            if (r0 != 0) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            return r0
    }

    private void launchIntent(android.content.Intent r4) {
            r3 = this;
            if (r4 != 0) goto L3
            return
        L3:
            android.content.Context r0 = r3.getContext()     // Catch: java.lang.RuntimeException -> Lb
            r0.startActivity(r4)     // Catch: java.lang.RuntimeException -> Lb
            goto L24
        Lb:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed launch activity: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r4)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "SearchView"
            android.util.Log.e(r2, r1, r0)
        L24:
            return
    }

    private boolean launchSuggestion(int r4, int r5, java.lang.String r6) {
            r3 = this;
            androidx.cursoradapter.widget.CursorAdapter r0 = r3.mSuggestionsAdapter
            android.database.Cursor r0 = r0.getCursor()
            if (r0 == 0) goto L17
            boolean r1 = r0.moveToPosition(r4)
            if (r1 == 0) goto L17
            android.content.Intent r1 = r3.createIntentFromSuggestion(r0, r5, r6)
            r3.launchIntent(r1)
            r2 = 1
            return r2
        L17:
            r1 = 0
            return r1
    }

    private void postUpdateFocusedState() {
            r1 = this;
            java.lang.Runnable r0 = r1.mUpdateDrawableStateRunnable
            r1.post(r0)
            return
    }

    private void rewriteQueryFromSuggestion(int r4) {
            r3 = this;
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r3.mSearchSrcTextView
            android.text.Editable r0 = r0.getText()
            androidx.cursoradapter.widget.CursorAdapter r1 = r3.mSuggestionsAdapter
            android.database.Cursor r1 = r1.getCursor()
            if (r1 != 0) goto Lf
            return
        Lf:
            boolean r2 = r1.moveToPosition(r4)
            if (r2 == 0) goto L25
            androidx.cursoradapter.widget.CursorAdapter r2 = r3.mSuggestionsAdapter
            java.lang.CharSequence r2 = r2.convertToString(r1)
            if (r2 == 0) goto L21
            r3.setQuery(r2)
            goto L24
        L21:
            r3.setQuery(r0)
        L24:
            goto L28
        L25:
            r3.setQuery(r0)
        L28:
            return
    }

    private void setQuery(java.lang.CharSequence r3) {
            r2 = this;
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r2.mSearchSrcTextView
            r0.setText(r3)
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r2.mSearchSrcTextView
            boolean r1 = android.text.TextUtils.isEmpty(r3)
            if (r1 == 0) goto Lf
            r1 = 0
            goto L13
        Lf:
            int r1 = r3.length()
        L13:
            r0.setSelection(r1)
            return
    }

    private void updateCloseButton() {
            r4 = this;
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r4.mSearchSrcTextView
            android.text.Editable r0 = r0.getText()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r1 = 1
            r0 = r0 ^ r1
            r2 = 0
            if (r0 != 0) goto L19
            boolean r3 = r4.mIconifiedByDefault
            if (r3 == 0) goto L18
            boolean r3 = r4.mExpandedInActionView
            if (r3 != 0) goto L18
            goto L19
        L18:
            r1 = r2
        L19:
            android.widget.ImageView r3 = r4.mCloseButton
            if (r1 == 0) goto L1e
            goto L20
        L1e:
            r2 = 8
        L20:
            r3.setVisibility(r2)
            android.widget.ImageView r2 = r4.mCloseButton
            android.graphics.drawable.Drawable r2 = r2.getDrawable()
            if (r2 == 0) goto L35
            if (r0 == 0) goto L30
            int[] r3 = androidx.appcompat.widget.SearchView.ENABLED_STATE_SET
            goto L32
        L30:
            int[] r3 = androidx.appcompat.widget.SearchView.EMPTY_STATE_SET
        L32:
            r2.setState(r3)
        L35:
            return
    }

    private void updateQueryHint() {
            r3 = this;
            java.lang.CharSequence r0 = r3.getQueryHint()
            androidx.appcompat.widget.SearchView$SearchAutoComplete r1 = r3.mSearchSrcTextView
            if (r0 != 0) goto Lb
            java.lang.String r2 = ""
            goto Lc
        Lb:
            r2 = r0
        Lc:
            java.lang.CharSequence r2 = r3.getDecoratedHint(r2)
            r1.setHint(r2)
            return
    }

    private void updateSearchAutoComplete() {
            r6 = this;
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r6.mSearchSrcTextView
            android.app.SearchableInfo r1 = r6.mSearchable
            int r1 = r1.getSuggestThreshold()
            r0.setThreshold(r1)
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r6.mSearchSrcTextView
            android.app.SearchableInfo r1 = r6.mSearchable
            int r1 = r1.getImeOptions()
            r0.setImeOptions(r1)
            android.app.SearchableInfo r0 = r6.mSearchable
            int r0 = r0.getInputType()
            r1 = r0 & 15
            r2 = 1
            if (r1 != r2) goto L33
            r1 = -65537(0xfffffffffffeffff, float:NaN)
            r0 = r0 & r1
            android.app.SearchableInfo r1 = r6.mSearchable
            java.lang.String r1 = r1.getSuggestAuthority()
            if (r1 == 0) goto L33
            r1 = 65536(0x10000, float:9.1835E-41)
            r0 = r0 | r1
            r1 = 524288(0x80000, float:7.34684E-40)
            r0 = r0 | r1
        L33:
            androidx.appcompat.widget.SearchView$SearchAutoComplete r1 = r6.mSearchSrcTextView
            r1.setInputType(r0)
            androidx.cursoradapter.widget.CursorAdapter r1 = r6.mSuggestionsAdapter
            if (r1 == 0) goto L42
            androidx.cursoradapter.widget.CursorAdapter r1 = r6.mSuggestionsAdapter
            r3 = 0
            r1.changeCursor(r3)
        L42:
            android.app.SearchableInfo r1 = r6.mSearchable
            java.lang.String r1 = r1.getSuggestAuthority()
            if (r1 == 0) goto L6e
            androidx.appcompat.widget.SuggestionsAdapter r1 = new androidx.appcompat.widget.SuggestionsAdapter
            android.content.Context r3 = r6.getContext()
            android.app.SearchableInfo r4 = r6.mSearchable
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r5 = r6.mOutsideDrawablesCache
            r1.<init>(r3, r6, r4, r5)
            r6.mSuggestionsAdapter = r1
            androidx.appcompat.widget.SearchView$SearchAutoComplete r1 = r6.mSearchSrcTextView
            androidx.cursoradapter.widget.CursorAdapter r3 = r6.mSuggestionsAdapter
            r1.setAdapter(r3)
            androidx.cursoradapter.widget.CursorAdapter r1 = r6.mSuggestionsAdapter
            androidx.appcompat.widget.SuggestionsAdapter r1 = (androidx.appcompat.widget.SuggestionsAdapter) r1
            boolean r3 = r6.mQueryRefinement
            if (r3 == 0) goto L6a
            r2 = 2
            goto L6b
        L6a:
        L6b:
            r1.setQueryRefinement(r2)
        L6e:
            return
    }

    private void updateSubmitArea() {
            r2 = this;
            r0 = 8
            boolean r1 = r2.isSubmitAreaEnabled()
            if (r1 == 0) goto L19
            android.widget.ImageView r1 = r2.mGoButton
            int r1 = r1.getVisibility()
            if (r1 == 0) goto L18
            android.widget.ImageView r1 = r2.mVoiceButton
            int r1 = r1.getVisibility()
            if (r1 != 0) goto L19
        L18:
            r0 = 0
        L19:
            android.view.View r1 = r2.mSubmitArea
            r1.setVisibility(r0)
            return
    }

    private void updateSubmitButton(boolean r3) {
            r2 = this;
            r0 = 8
            boolean r1 = r2.mSubmitButtonEnabled
            if (r1 == 0) goto L19
            boolean r1 = r2.isSubmitAreaEnabled()
            if (r1 == 0) goto L19
            boolean r1 = r2.hasFocus()
            if (r1 == 0) goto L19
            if (r3 != 0) goto L18
            boolean r1 = r2.mVoiceButtonEnabled
            if (r1 != 0) goto L19
        L18:
            r0 = 0
        L19:
            android.widget.ImageView r1 = r2.mGoButton
            r1.setVisibility(r0)
            return
    }

    private void updateViewsVisibility(boolean r7) {
            r6 = this;
            r6.mIconified = r7
            r0 = 8
            r1 = 0
            if (r7 == 0) goto L9
            r2 = r1
            goto La
        L9:
            r2 = r0
        La:
            androidx.appcompat.widget.SearchView$SearchAutoComplete r3 = r6.mSearchSrcTextView
            android.text.Editable r3 = r3.getText()
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            r4 = 1
            r3 = r3 ^ r4
            android.widget.ImageView r5 = r6.mSearchButton
            r5.setVisibility(r2)
            r6.updateSubmitButton(r3)
            android.view.View r5 = r6.mSearchEditFrame
            if (r7 == 0) goto L23
            goto L24
        L23:
            r0 = r1
        L24:
            r5.setVisibility(r0)
            android.widget.ImageView r0 = r6.mCollapsedIcon
            android.graphics.drawable.Drawable r0 = r0.getDrawable()
            if (r0 == 0) goto L36
            boolean r0 = r6.mIconifiedByDefault
            if (r0 == 0) goto L34
            goto L36
        L34:
            r0 = 0
            goto L38
        L36:
            r0 = 8
        L38:
            android.widget.ImageView r5 = r6.mCollapsedIcon
            r5.setVisibility(r0)
            r6.updateCloseButton()
            if (r3 != 0) goto L43
            r1 = r4
        L43:
            r6.updateVoiceButton(r1)
            r6.updateSubmitArea()
            return
    }

    private void updateVoiceButton(boolean r4) {
            r3 = this;
            r0 = 8
            boolean r1 = r3.mVoiceButtonEnabled
            if (r1 == 0) goto L16
            boolean r1 = r3.isIconified()
            if (r1 != 0) goto L16
            if (r4 == 0) goto L16
            r0 = 0
            android.widget.ImageView r1 = r3.mGoButton
            r2 = 8
            r1.setVisibility(r2)
        L16:
            android.widget.ImageView r1 = r3.mVoiceButton
            r1.setVisibility(r0)
            return
    }

    void adjustDropDownSizeAndPosition() {
            r8 = this;
            android.view.View r0 = r8.mDropDownAnchor
            int r0 = r0.getWidth()
            r1 = 1
            if (r0 <= r1) goto L60
            android.content.Context r0 = r8.getContext()
            android.content.res.Resources r0 = r0.getResources()
            android.view.View r1 = r8.mSearchPlate
            int r1 = r1.getPaddingLeft()
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            boolean r3 = androidx.appcompat.widget.ViewUtils.isLayoutRtl(r8)
            boolean r4 = r8.mIconifiedByDefault
            if (r4 == 0) goto L32
            int r4 = androidx.appcompat.R.dimen.abc_dropdownitem_icon_width
            int r4 = r0.getDimensionPixelSize(r4)
            int r5 = androidx.appcompat.R.dimen.abc_dropdownitem_text_padding_left
            int r5 = r0.getDimensionPixelSize(r5)
            int r4 = r4 + r5
            goto L33
        L32:
            r4 = 0
        L33:
            androidx.appcompat.widget.SearchView$SearchAutoComplete r5 = r8.mSearchSrcTextView
            android.graphics.drawable.Drawable r5 = r5.getDropDownBackground()
            r5.getPadding(r2)
            if (r3 == 0) goto L43
            int r5 = r2.left
            int r5 = -r5
            goto L48
        L43:
            int r5 = r2.left
            int r5 = r5 + r4
            int r5 = r1 - r5
        L48:
            androidx.appcompat.widget.SearchView$SearchAutoComplete r6 = r8.mSearchSrcTextView
            r6.setDropDownHorizontalOffset(r5)
            android.view.View r6 = r8.mDropDownAnchor
            int r6 = r6.getWidth()
            int r7 = r2.left
            int r6 = r6 + r7
            int r7 = r2.right
            int r6 = r6 + r7
            int r6 = r6 + r4
            int r6 = r6 - r1
            androidx.appcompat.widget.SearchView$SearchAutoComplete r7 = r8.mSearchSrcTextView
            r7.setDropDownWidth(r6)
        L60:
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public void clearFocus() {
            r2 = this;
            r0 = 1
            r2.mClearingFocus = r0
            super.clearFocus()
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r2.mSearchSrcTextView
            r0.clearFocus()
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r2.mSearchSrcTextView
            r1 = 0
            r0.setImeVisibility(r1)
            r2.mClearingFocus = r1
            return
    }

    void forceSuggestionQuery() {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto Lc
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r2.mSearchSrcTextView
            androidx.appcompat.widget.SearchView.Api29Impl.refreshAutoCompleteResults(r0)
            goto L1a
        Lc:
            androidx.appcompat.widget.SearchView$PreQAutoCompleteTextViewReflector r0 = androidx.appcompat.widget.SearchView.PRE_API_29_HIDDEN_METHOD_INVOKER
            androidx.appcompat.widget.SearchView$SearchAutoComplete r1 = r2.mSearchSrcTextView
            r0.doBeforeTextChanged(r1)
            androidx.appcompat.widget.SearchView$PreQAutoCompleteTextViewReflector r0 = androidx.appcompat.widget.SearchView.PRE_API_29_HIDDEN_METHOD_INVOKER
            androidx.appcompat.widget.SearchView$SearchAutoComplete r1 = r2.mSearchSrcTextView
            r0.doAfterTextChanged(r1)
        L1a:
            return
    }

    public int getImeOptions() {
            r1 = this;
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r1.mSearchSrcTextView
            int r0 = r0.getImeOptions()
            return r0
    }

    public int getInputType() {
            r1 = this;
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r1.mSearchSrcTextView
            int r0 = r0.getInputType()
            return r0
    }

    public int getMaxWidth() {
            r1 = this;
            int r0 = r1.mMaxWidth
            return r0
    }

    public java.lang.CharSequence getQuery() {
            r1 = this;
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r1.mSearchSrcTextView
            android.text.Editable r0 = r0.getText()
            return r0
    }

    public java.lang.CharSequence getQueryHint() {
            r2 = this;
            java.lang.CharSequence r0 = r2.mQueryHint
            if (r0 == 0) goto L7
            java.lang.CharSequence r0 = r2.mQueryHint
            goto L24
        L7:
            android.app.SearchableInfo r0 = r2.mSearchable
            if (r0 == 0) goto L22
            android.app.SearchableInfo r0 = r2.mSearchable
            int r0 = r0.getHintId()
            if (r0 == 0) goto L22
            android.content.Context r0 = r2.getContext()
            android.app.SearchableInfo r1 = r2.mSearchable
            int r1 = r1.getHintId()
            java.lang.CharSequence r0 = r0.getText(r1)
            goto L24
        L22:
            java.lang.CharSequence r0 = r2.mDefaultQueryHint
        L24:
            return r0
    }

    int getSuggestionCommitIconResId() {
            r1 = this;
            int r0 = r1.mSuggestionCommitIconResId
            return r0
    }

    int getSuggestionRowLayout() {
            r1 = this;
            int r0 = r1.mSuggestionRowLayout
            return r0
    }

    public androidx.cursoradapter.widget.CursorAdapter getSuggestionsAdapter() {
            r1 = this;
            androidx.cursoradapter.widget.CursorAdapter r0 = r1.mSuggestionsAdapter
            return r0
    }

    public boolean isIconfiedByDefault() {
            r1 = this;
            boolean r0 = r1.mIconifiedByDefault
            return r0
    }

    public boolean isIconified() {
            r1 = this;
            boolean r0 = r1.mIconified
            return r0
    }

    public boolean isQueryRefinementEnabled() {
            r1 = this;
            boolean r0 = r1.mQueryRefinement
            return r0
    }

    public boolean isSubmitButtonEnabled() {
            r1 = this;
            boolean r0 = r1.mSubmitButtonEnabled
            return r0
    }

    void launchQuerySearch(int r8, java.lang.String r9, java.lang.String r10) {
            r7 = this;
            java.lang.String r1 = "android.intent.action.SEARCH"
            r2 = 0
            r3 = 0
            r0 = r7
            r5 = r8
            r6 = r9
            r4 = r10
            android.content.Intent r8 = r0.createIntent(r1, r2, r3, r4, r5, r6)
            android.content.Context r9 = r7.getContext()
            r9.startActivity(r8)
            return
    }

    @Override // androidx.appcompat.view.CollapsibleActionView
    public void onActionViewCollapsed() {
            r3 = this;
            java.lang.String r0 = ""
            r1 = 0
            r3.setQuery(r0, r1)
            r3.clearFocus()
            r0 = 1
            r3.updateViewsVisibility(r0)
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r3.mSearchSrcTextView
            int r2 = r3.mCollapsedImeOptions
            r0.setImeOptions(r2)
            r3.mExpandedInActionView = r1
            return
    }

    @Override // androidx.appcompat.view.CollapsibleActionView
    public void onActionViewExpanded() {
            r3 = this;
            boolean r0 = r3.mExpandedInActionView
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r3.mExpandedInActionView = r0
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r3.mSearchSrcTextView
            int r0 = r0.getImeOptions()
            r3.mCollapsedImeOptions = r0
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r3.mSearchSrcTextView
            int r1 = r3.mCollapsedImeOptions
            r2 = 33554432(0x2000000, float:9.403955E-38)
            r1 = r1 | r2
            r0.setImeOptions(r1)
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r3.mSearchSrcTextView
            java.lang.String r1 = ""
            r0.setText(r1)
            r0 = 0
            r3.setIconified(r0)
            return
    }

    void onCloseClicked() {
            r4 = this;
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r4.mSearchSrcTextView
            android.text.Editable r0 = r0.getText()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            r2 = 1
            if (r1 == 0) goto L24
            boolean r1 = r4.mIconifiedByDefault
            if (r1 == 0) goto L35
            androidx.appcompat.widget.SearchView$OnCloseListener r1 = r4.mOnCloseListener
            if (r1 == 0) goto L1d
            androidx.appcompat.widget.SearchView$OnCloseListener r1 = r4.mOnCloseListener
            boolean r1 = r1.onClose()
            if (r1 != 0) goto L35
        L1d:
            r4.clearFocus()
            r4.updateViewsVisibility(r2)
            goto L35
        L24:
            androidx.appcompat.widget.SearchView$SearchAutoComplete r1 = r4.mSearchSrcTextView
            java.lang.String r3 = ""
            r1.setText(r3)
            androidx.appcompat.widget.SearchView$SearchAutoComplete r1 = r4.mSearchSrcTextView
            r1.requestFocus()
            androidx.appcompat.widget.SearchView$SearchAutoComplete r1 = r4.mSearchSrcTextView
            r1.setImeVisibility(r2)
        L35:
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
            r1 = this;
            java.lang.Runnable r0 = r1.mUpdateDrawableStateRunnable
            r1.removeCallbacks(r0)
            java.lang.Runnable r0 = r1.mReleaseCursorRunnable
            r1.post(r0)
            super.onDetachedFromWindow()
            return
    }

    boolean onItemClicked(int r3, int r4, java.lang.String r5) {
            r2 = this;
            androidx.appcompat.widget.SearchView$OnSuggestionListener r0 = r2.mOnSuggestionListener
            r1 = 0
            if (r0 == 0) goto Lf
            androidx.appcompat.widget.SearchView$OnSuggestionListener r0 = r2.mOnSuggestionListener
            boolean r0 = r0.onSuggestionClick(r3)
            if (r0 != 0) goto Le
            goto Lf
        Le:
            return r1
        Lf:
            r0 = 0
            r2.launchSuggestion(r3, r1, r0)
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r2.mSearchSrcTextView
            r0.setImeVisibility(r1)
            r2.dismissSuggestions()
            r0 = 1
            return r0
    }

    boolean onItemSelected(int r2) {
            r1 = this;
            androidx.appcompat.widget.SearchView$OnSuggestionListener r0 = r1.mOnSuggestionListener
            if (r0 == 0) goto Lf
            androidx.appcompat.widget.SearchView$OnSuggestionListener r0 = r1.mOnSuggestionListener
            boolean r0 = r0.onSuggestionSelect(r2)
            if (r0 != 0) goto Ld
            goto Lf
        Ld:
            r0 = 0
            return r0
        Lf:
            r1.rewriteQueryFromSuggestion(r2)
            r0 = 1
            return r0
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean r7, int r8, int r9, int r10, int r11) {
            r6 = this;
            super.onLayout(r7, r8, r9, r10, r11)
            r0 = r11
            r11 = r10
            r10 = r9
            r9 = r8
            r8 = r7
            r7 = r6
            if (r8 == 0) goto L42
            androidx.appcompat.widget.SearchView$SearchAutoComplete r1 = r7.mSearchSrcTextView
            android.graphics.Rect r2 = r7.mSearchSrcTextViewBounds
            r6.getChildBoundsWithinSearchView(r1, r2)
            android.graphics.Rect r1 = r7.mSearchSrtTextViewBoundsExpanded
            android.graphics.Rect r2 = r7.mSearchSrcTextViewBounds
            int r2 = r2.left
            android.graphics.Rect r3 = r7.mSearchSrcTextViewBounds
            int r3 = r3.right
            int r4 = r0 - r10
            r5 = 0
            r1.set(r2, r5, r3, r4)
            androidx.appcompat.widget.SearchView$UpdatableTouchDelegate r1 = r7.mTouchDelegate
            if (r1 != 0) goto L39
            androidx.appcompat.widget.SearchView$UpdatableTouchDelegate r1 = new androidx.appcompat.widget.SearchView$UpdatableTouchDelegate
            android.graphics.Rect r2 = r7.mSearchSrtTextViewBoundsExpanded
            android.graphics.Rect r3 = r7.mSearchSrcTextViewBounds
            androidx.appcompat.widget.SearchView$SearchAutoComplete r4 = r7.mSearchSrcTextView
            r1.<init>(r2, r3, r4)
            r7.mTouchDelegate = r1
            androidx.appcompat.widget.SearchView$UpdatableTouchDelegate r1 = r7.mTouchDelegate
            r6.setTouchDelegate(r1)
            goto L42
        L39:
            androidx.appcompat.widget.SearchView$UpdatableTouchDelegate r1 = r7.mTouchDelegate
            android.graphics.Rect r2 = r7.mSearchSrtTextViewBoundsExpanded
            android.graphics.Rect r3 = r7.mSearchSrcTextViewBounds
            r1.setBounds(r2, r3)
        L42:
            return
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    protected void onMeasure(int r7, int r8) {
            r6 = this;
            boolean r0 = r6.isIconified()
            if (r0 == 0) goto La
            super.onMeasure(r7, r8)
            return
        La:
            int r0 = android.view.View.MeasureSpec.getMode(r7)
            int r1 = android.view.View.MeasureSpec.getSize(r7)
            switch(r0) {
                case -2147483648: goto L2e;
                case 0: goto L21;
                case 1073741824: goto L16;
                default: goto L15;
            }
        L15:
            goto L42
        L16:
            int r2 = r6.mMaxWidth
            if (r2 <= 0) goto L42
            int r2 = r6.mMaxWidth
            int r1 = java.lang.Math.min(r2, r1)
            goto L42
        L21:
            int r2 = r6.mMaxWidth
            if (r2 <= 0) goto L28
            int r2 = r6.mMaxWidth
            goto L2c
        L28:
            int r2 = r6.getPreferredWidth()
        L2c:
            r1 = r2
            goto L42
        L2e:
            int r2 = r6.mMaxWidth
            if (r2 <= 0) goto L39
            int r2 = r6.mMaxWidth
            int r1 = java.lang.Math.min(r2, r1)
            goto L42
        L39:
            int r2 = r6.getPreferredWidth()
            int r1 = java.lang.Math.min(r2, r1)
        L42:
            r0 = 1073741824(0x40000000, float:2.0)
            int r2 = android.view.View.MeasureSpec.getMode(r8)
            int r3 = android.view.View.MeasureSpec.getSize(r8)
            switch(r2) {
                case -2147483648: goto L55;
                case 0: goto L50;
                default: goto L4f;
            }
        L4f:
            goto L5e
        L50:
            int r3 = r6.getPreferredHeight()
            goto L5e
        L55:
            int r4 = r6.getPreferredHeight()
            int r3 = java.lang.Math.min(r4, r3)
        L5e:
            r2 = 1073741824(0x40000000, float:2.0)
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r0)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r2)
            super.onMeasure(r4, r5)
            return
    }

    protected void onQueryRefine(java.lang.CharSequence r1) {
            r0 = this;
            r0.setQuery(r1)
            return
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(android.os.Parcelable r3) {
            r2 = this;
            boolean r0 = r3 instanceof androidx.appcompat.widget.SearchView.SavedState
            if (r0 != 0) goto L8
            super.onRestoreInstanceState(r3)
            return
        L8:
            r0 = r3
            androidx.appcompat.widget.SearchView$SavedState r0 = (androidx.appcompat.widget.SearchView.SavedState) r0
            android.os.Parcelable r1 = r0.getSuperState()
            super.onRestoreInstanceState(r1)
            boolean r1 = r0.isIconified
            r2.updateViewsVisibility(r1)
            r2.requestLayout()
            return
    }

    @Override // android.view.View
    protected android.os.Parcelable onSaveInstanceState() {
            r3 = this;
            android.os.Parcelable r0 = super.onSaveInstanceState()
            androidx.appcompat.widget.SearchView$SavedState r1 = new androidx.appcompat.widget.SearchView$SavedState
            r1.<init>(r0)
            boolean r2 = r3.isIconified()
            r1.isIconified = r2
            return r1
    }

    void onSearchClicked() {
            r2 = this;
            r0 = 0
            r2.updateViewsVisibility(r0)
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r2.mSearchSrcTextView
            r0.requestFocus()
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r2.mSearchSrcTextView
            r1 = 1
            r0.setImeVisibility(r1)
            android.view.View$OnClickListener r0 = r2.mOnSearchClickListener
            if (r0 == 0) goto L18
            android.view.View$OnClickListener r0 = r2.mOnSearchClickListener
            r0.onClick(r2)
        L18:
            return
    }

    void onSubmitQuery() {
            r4 = this;
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r4.mSearchSrcTextView
            android.text.Editable r0 = r0.getText()
            if (r0 == 0) goto L33
            int r1 = android.text.TextUtils.getTrimmedLength(r0)
            if (r1 <= 0) goto L33
            androidx.appcompat.widget.SearchView$OnQueryTextListener r1 = r4.mOnQueryChangeListener
            if (r1 == 0) goto L1e
            androidx.appcompat.widget.SearchView$OnQueryTextListener r1 = r4.mOnQueryChangeListener
            java.lang.String r2 = r0.toString()
            boolean r1 = r1.onQueryTextSubmit(r2)
            if (r1 != 0) goto L33
        L1e:
            android.app.SearchableInfo r1 = r4.mSearchable
            r2 = 0
            if (r1 == 0) goto L2b
            r1 = 0
            java.lang.String r3 = r0.toString()
            r4.launchQuerySearch(r2, r1, r3)
        L2b:
            androidx.appcompat.widget.SearchView$SearchAutoComplete r1 = r4.mSearchSrcTextView
            r1.setImeVisibility(r2)
            r4.dismissSuggestions()
        L33:
            return
    }

    boolean onSuggestionsKey(android.view.View r4, int r5, android.view.KeyEvent r6) {
            r3 = this;
            android.app.SearchableInfo r0 = r3.mSearchable
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            androidx.cursoradapter.widget.CursorAdapter r0 = r3.mSuggestionsAdapter
            if (r0 != 0) goto Lb
            return r1
        Lb:
            int r0 = r6.getAction()
            if (r0 != 0) goto L67
            boolean r0 = r6.hasNoModifiers()
            if (r0 == 0) goto L67
            r0 = 66
            if (r5 == r0) goto L5b
            r0 = 84
            if (r5 == r0) goto L5b
            r0 = 61
            if (r5 != r0) goto L24
            goto L5b
        L24:
            r0 = 21
            if (r5 == r0) goto L3a
            r2 = 22
            if (r5 != r2) goto L2d
            goto L3a
        L2d:
            r0 = 19
            if (r5 != r0) goto L67
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r3.mSearchSrcTextView
            int r0 = r0.getListSelection()
            if (r0 != 0) goto L67
            return r1
        L3a:
            if (r5 != r0) goto L3e
            r0 = r1
            goto L44
        L3e:
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r3.mSearchSrcTextView
            int r0 = r0.length()
        L44:
            androidx.appcompat.widget.SearchView$SearchAutoComplete r2 = r3.mSearchSrcTextView
            r2.setSelection(r0)
            androidx.appcompat.widget.SearchView$SearchAutoComplete r2 = r3.mSearchSrcTextView
            r2.setListSelection(r1)
            androidx.appcompat.widget.SearchView$SearchAutoComplete r1 = r3.mSearchSrcTextView
            r1.clearListSelection()
            androidx.appcompat.widget.SearchView$SearchAutoComplete r1 = r3.mSearchSrcTextView
            r1.ensureImeVisible()
            r1 = 1
            return r1
        L5b:
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r3.mSearchSrcTextView
            int r0 = r0.getListSelection()
            r2 = 0
            boolean r1 = r3.onItemClicked(r0, r1, r2)
            return r1
        L67:
            return r1
    }

    void onTextChanged(java.lang.CharSequence r5) {
            r4 = this;
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r4.mSearchSrcTextView
            android.text.Editable r0 = r0.getText()
            r4.mUserQuery = r0
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            r2 = 1
            r1 = r1 ^ r2
            r4.updateSubmitButton(r1)
            if (r1 != 0) goto L14
            goto L15
        L14:
            r2 = 0
        L15:
            r4.updateVoiceButton(r2)
            r4.updateCloseButton()
            r4.updateSubmitArea()
            androidx.appcompat.widget.SearchView$OnQueryTextListener r2 = r4.mOnQueryChangeListener
            if (r2 == 0) goto L33
            java.lang.CharSequence r2 = r4.mOldQueryText
            boolean r2 = android.text.TextUtils.equals(r5, r2)
            if (r2 != 0) goto L33
            androidx.appcompat.widget.SearchView$OnQueryTextListener r2 = r4.mOnQueryChangeListener
            java.lang.String r3 = r5.toString()
            r2.onQueryTextChange(r3)
        L33:
            java.lang.String r2 = r5.toString()
            r4.mOldQueryText = r2
            return
    }

    void onTextFocusChanged() {
            r1 = this;
            boolean r0 = r1.isIconified()
            r1.updateViewsVisibility(r0)
            r1.postUpdateFocusedState()
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r1.mSearchSrcTextView
            boolean r0 = r0.hasFocus()
            if (r0 == 0) goto L15
            r1.forceSuggestionQuery()
        L15:
            return
    }

    void onVoiceClicked() {
            r4 = this;
            android.app.SearchableInfo r0 = r4.mSearchable
            if (r0 != 0) goto L5
            return
        L5:
            android.app.SearchableInfo r0 = r4.mSearchable
            boolean r1 = r0.getVoiceSearchLaunchWebSearch()     // Catch: android.content.ActivityNotFoundException -> L31
            if (r1 == 0) goto L1b
            android.content.Intent r1 = r4.mVoiceWebSearchIntent     // Catch: android.content.ActivityNotFoundException -> L31
            android.content.Intent r1 = r4.createVoiceWebSearchIntent(r1, r0)     // Catch: android.content.ActivityNotFoundException -> L31
            android.content.Context r2 = r4.getContext()     // Catch: android.content.ActivityNotFoundException -> L31
            r2.startActivity(r1)     // Catch: android.content.ActivityNotFoundException -> L31
            goto L2f
        L1b:
            boolean r1 = r0.getVoiceSearchLaunchRecognizer()     // Catch: android.content.ActivityNotFoundException -> L31
            if (r1 == 0) goto L2f
            android.content.Intent r1 = r4.mVoiceAppSearchIntent     // Catch: android.content.ActivityNotFoundException -> L31
            android.content.Intent r1 = r4.createVoiceAppSearchIntent(r1, r0)     // Catch: android.content.ActivityNotFoundException -> L31
            android.content.Context r2 = r4.getContext()     // Catch: android.content.ActivityNotFoundException -> L31
            r2.startActivity(r1)     // Catch: android.content.ActivityNotFoundException -> L31
            goto L30
        L2f:
        L30:
            goto L39
        L31:
            r1 = move-exception
            java.lang.String r2 = "SearchView"
            java.lang.String r3 = "Could not find voice search activity"
            android.util.Log.w(r2, r3)
        L39:
            return
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean r1) {
            r0 = this;
            super.onWindowFocusChanged(r1)
            r0.postUpdateFocusedState()
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int r3, android.graphics.Rect r4) {
            r2 = this;
            boolean r0 = r2.mClearingFocus
            r1 = 0
            if (r0 == 0) goto L6
            return r1
        L6:
            boolean r0 = r2.isFocusable()
            if (r0 != 0) goto Ld
            return r1
        Ld:
            boolean r0 = r2.isIconified()
            if (r0 != 0) goto L1f
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r2.mSearchSrcTextView
            boolean r0 = r0.requestFocus(r3, r4)
            if (r0 == 0) goto L1e
            r2.updateViewsVisibility(r1)
        L1e:
            return r0
        L1f:
            boolean r0 = super.requestFocus(r3, r4)
            return r0
    }

    public void setAppSearchData(android.os.Bundle r1) {
            r0 = this;
            r0.mAppSearchData = r1
            return
    }

    public void setIconified(boolean r1) {
            r0 = this;
            if (r1 == 0) goto L6
            r0.onCloseClicked()
            goto L9
        L6:
            r0.onSearchClicked()
        L9:
            return
    }

    public void setIconifiedByDefault(boolean r2) {
            r1 = this;
            boolean r0 = r1.mIconifiedByDefault
            if (r0 != r2) goto L5
            return
        L5:
            r1.mIconifiedByDefault = r2
            r1.updateViewsVisibility(r2)
            r1.updateQueryHint()
            return
    }

    public void setImeOptions(int r2) {
            r1 = this;
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r1.mSearchSrcTextView
            r0.setImeOptions(r2)
            return
    }

    public void setInputType(int r2) {
            r1 = this;
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r1.mSearchSrcTextView
            r0.setInputType(r2)
            return
    }

    public void setMaxWidth(int r1) {
            r0 = this;
            r0.mMaxWidth = r1
            r0.requestLayout()
            return
    }

    public void setOnCloseListener(androidx.appcompat.widget.SearchView.OnCloseListener r1) {
            r0 = this;
            r0.mOnCloseListener = r1
            return
    }

    public void setOnQueryTextFocusChangeListener(android.view.View.OnFocusChangeListener r1) {
            r0 = this;
            r0.mOnQueryTextFocusChangeListener = r1
            return
    }

    public void setOnQueryTextListener(androidx.appcompat.widget.SearchView.OnQueryTextListener r1) {
            r0 = this;
            r0.mOnQueryChangeListener = r1
            return
    }

    public void setOnSearchClickListener(android.view.View.OnClickListener r1) {
            r0 = this;
            r0.mOnSearchClickListener = r1
            return
    }

    public void setOnSuggestionListener(androidx.appcompat.widget.SearchView.OnSuggestionListener r1) {
            r0 = this;
            r0.mOnSuggestionListener = r1
            return
    }

    public void setQuery(java.lang.CharSequence r3, boolean r4) {
            r2 = this;
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r2.mSearchSrcTextView
            r0.setText(r3)
            if (r3 == 0) goto L14
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r2.mSearchSrcTextView
            androidx.appcompat.widget.SearchView$SearchAutoComplete r1 = r2.mSearchSrcTextView
            int r1 = r1.length()
            r0.setSelection(r1)
            r2.mUserQuery = r3
        L14:
            if (r4 == 0) goto L1f
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L1f
            r2.onSubmitQuery()
        L1f:
            return
    }

    public void setQueryHint(java.lang.CharSequence r1) {
            r0 = this;
            r0.mQueryHint = r1
            r0.updateQueryHint()
            return
    }

    public void setQueryRefinementEnabled(boolean r3) {
            r2 = this;
            r2.mQueryRefinement = r3
            androidx.cursoradapter.widget.CursorAdapter r0 = r2.mSuggestionsAdapter
            boolean r0 = r0 instanceof androidx.appcompat.widget.SuggestionsAdapter
            if (r0 == 0) goto L14
            androidx.cursoradapter.widget.CursorAdapter r0 = r2.mSuggestionsAdapter
            androidx.appcompat.widget.SuggestionsAdapter r0 = (androidx.appcompat.widget.SuggestionsAdapter) r0
            if (r3 == 0) goto L10
            r1 = 2
            goto L11
        L10:
            r1 = 1
        L11:
            r0.setQueryRefinement(r1)
        L14:
            return
    }

    public void setSearchableInfo(android.app.SearchableInfo r3) {
            r2 = this;
            r2.mSearchable = r3
            android.app.SearchableInfo r0 = r2.mSearchable
            if (r0 == 0) goto Lc
            r2.updateSearchAutoComplete()
            r2.updateQueryHint()
        Lc:
            boolean r0 = r2.hasVoiceSearch()
            r2.mVoiceButtonEnabled = r0
            boolean r0 = r2.mVoiceButtonEnabled
            if (r0 == 0) goto L1d
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r2.mSearchSrcTextView
            java.lang.String r1 = "nm"
            r0.setPrivateImeOptions(r1)
        L1d:
            boolean r0 = r2.isIconified()
            r2.updateViewsVisibility(r0)
            return
    }

    public void setSubmitButtonEnabled(boolean r2) {
            r1 = this;
            r1.mSubmitButtonEnabled = r2
            boolean r0 = r1.isIconified()
            r1.updateViewsVisibility(r0)
            return
    }

    public void setSuggestionsAdapter(androidx.cursoradapter.widget.CursorAdapter r3) {
            r2 = this;
            r2.mSuggestionsAdapter = r3
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r2.mSearchSrcTextView
            androidx.cursoradapter.widget.CursorAdapter r1 = r2.mSuggestionsAdapter
            r0.setAdapter(r1)
            return
    }

    void updateFocusedState() {
            r4 = this;
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r4.mSearchSrcTextView
            boolean r0 = r0.hasFocus()
            if (r0 == 0) goto Lb
            int[] r1 = androidx.appcompat.widget.SearchView.FOCUSED_STATE_SET
            goto Ld
        Lb:
            int[] r1 = androidx.appcompat.widget.SearchView.EMPTY_STATE_SET
        Ld:
            android.view.View r2 = r4.mSearchPlate
            android.graphics.drawable.Drawable r2 = r2.getBackground()
            if (r2 == 0) goto L18
            r2.setState(r1)
        L18:
            android.view.View r3 = r4.mSubmitArea
            android.graphics.drawable.Drawable r3 = r3.getBackground()
            if (r3 == 0) goto L23
            r3.setState(r1)
        L23:
            r4.invalidate()
            return
    }
}
