package androidx.appcompat.app;

/* JADX INFO: loaded from: classes.dex */
class AlertController {
    android.widget.ListAdapter mAdapter;
    private int mAlertDialogLayout;
    private final android.view.View.OnClickListener mButtonHandler;
    private final int mButtonIconDimen;
    android.widget.Button mButtonNegative;
    private android.graphics.drawable.Drawable mButtonNegativeIcon;
    android.os.Message mButtonNegativeMessage;
    private java.lang.CharSequence mButtonNegativeText;
    android.widget.Button mButtonNeutral;
    private android.graphics.drawable.Drawable mButtonNeutralIcon;
    android.os.Message mButtonNeutralMessage;
    private java.lang.CharSequence mButtonNeutralText;
    private int mButtonPanelLayoutHint;
    private int mButtonPanelSideLayout;
    android.widget.Button mButtonPositive;
    private android.graphics.drawable.Drawable mButtonPositiveIcon;
    android.os.Message mButtonPositiveMessage;
    private java.lang.CharSequence mButtonPositiveText;
    int mCheckedItem;
    private final android.content.Context mContext;
    private android.view.View mCustomTitleView;
    final androidx.appcompat.app.AppCompatDialog mDialog;
    android.os.Handler mHandler;
    private android.graphics.drawable.Drawable mIcon;
    private int mIconId;
    private android.widget.ImageView mIconView;
    int mListItemLayout;
    int mListLayout;
    android.widget.ListView mListView;
    private java.lang.CharSequence mMessage;
    private android.widget.TextView mMessageView;
    int mMultiChoiceItemLayout;
    androidx.core.widget.NestedScrollView mScrollView;
    private boolean mShowTitle;
    int mSingleChoiceItemLayout;
    private java.lang.CharSequence mTitle;
    private android.widget.TextView mTitleView;
    private android.view.View mView;
    private int mViewLayoutResId;
    private int mViewSpacingBottom;
    private int mViewSpacingLeft;
    private int mViewSpacingRight;
    private boolean mViewSpacingSpecified;
    private int mViewSpacingTop;
    private final android.view.Window mWindow;


    /* JADX INFO: renamed from: androidx.appcompat.app.AlertController$2, reason: invalid class name */
    class AnonymousClass2 implements androidx.core.widget.NestedScrollView.OnScrollChangeListener {
        final /* synthetic */ androidx.appcompat.app.AlertController this$0;
        final /* synthetic */ android.view.View val$bottom;
        final /* synthetic */ android.view.View val$top;

        AnonymousClass2(androidx.appcompat.app.AlertController r1, android.view.View r2, android.view.View r3) {
                r0 = this;
                r0.this$0 = r1
                r0.val$top = r2
                r0.val$bottom = r3
                r0.<init>()
                return
        }

        @Override // androidx.core.widget.NestedScrollView.OnScrollChangeListener
        public void onScrollChange(androidx.core.widget.NestedScrollView r3, int r4, int r5, int r6, int r7) {
                r2 = this;
                android.view.View r0 = r2.val$top
                android.view.View r1 = r2.val$bottom
                androidx.appcompat.app.AlertController.manageScrollIndicators(r3, r0, r1)
                return
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.AlertController$3, reason: invalid class name */
    class AnonymousClass3 implements java.lang.Runnable {
        final /* synthetic */ androidx.appcompat.app.AlertController this$0;
        final /* synthetic */ android.view.View val$bottom;
        final /* synthetic */ android.view.View val$top;

        AnonymousClass3(androidx.appcompat.app.AlertController r1, android.view.View r2, android.view.View r3) {
                r0 = this;
                r0.this$0 = r1
                r0.val$top = r2
                r0.val$bottom = r3
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r3 = this;
                androidx.appcompat.app.AlertController r0 = r3.this$0
                androidx.core.widget.NestedScrollView r0 = r0.mScrollView
                android.view.View r1 = r3.val$top
                android.view.View r2 = r3.val$bottom
                androidx.appcompat.app.AlertController.manageScrollIndicators(r0, r1, r2)
                return
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.AlertController$4, reason: invalid class name */
    class AnonymousClass4 implements android.widget.AbsListView.OnScrollListener {
        final /* synthetic */ androidx.appcompat.app.AlertController this$0;
        final /* synthetic */ android.view.View val$bottom;
        final /* synthetic */ android.view.View val$top;

        AnonymousClass4(androidx.appcompat.app.AlertController r1, android.view.View r2, android.view.View r3) {
                r0 = this;
                r0.this$0 = r1
                r0.val$top = r2
                r0.val$bottom = r3
                r0.<init>()
                return
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(android.widget.AbsListView r3, int r4, int r5, int r6) {
                r2 = this;
                android.view.View r0 = r2.val$top
                android.view.View r1 = r2.val$bottom
                androidx.appcompat.app.AlertController.manageScrollIndicators(r3, r0, r1)
                return
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(android.widget.AbsListView r1, int r2) {
                r0 = this;
                return
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.AlertController$5, reason: invalid class name */
    class AnonymousClass5 implements java.lang.Runnable {
        final /* synthetic */ androidx.appcompat.app.AlertController this$0;
        final /* synthetic */ android.view.View val$bottom;
        final /* synthetic */ android.view.View val$top;

        AnonymousClass5(androidx.appcompat.app.AlertController r1, android.view.View r2, android.view.View r3) {
                r0 = this;
                r0.this$0 = r1
                r0.val$top = r2
                r0.val$bottom = r3
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r3 = this;
                androidx.appcompat.app.AlertController r0 = r3.this$0
                android.widget.ListView r0 = r0.mListView
                android.view.View r1 = r3.val$top
                android.view.View r2 = r3.val$bottom
                androidx.appcompat.app.AlertController.manageScrollIndicators(r0, r1, r2)
                return
        }
    }

    public static class AlertParams {
        public android.widget.ListAdapter mAdapter;
        public boolean mCancelable;
        public int mCheckedItem;
        public boolean[] mCheckedItems;
        public final android.content.Context mContext;
        public android.database.Cursor mCursor;
        public android.view.View mCustomTitleView;
        public boolean mForceInverseBackground;
        public android.graphics.drawable.Drawable mIcon;
        public int mIconAttrId;
        public int mIconId;
        public final android.view.LayoutInflater mInflater;
        public java.lang.String mIsCheckedColumn;
        public boolean mIsMultiChoice;
        public boolean mIsSingleChoice;
        public java.lang.CharSequence[] mItems;
        public java.lang.String mLabelColumn;
        public java.lang.CharSequence mMessage;
        public android.graphics.drawable.Drawable mNegativeButtonIcon;
        public android.content.DialogInterface.OnClickListener mNegativeButtonListener;
        public java.lang.CharSequence mNegativeButtonText;
        public android.graphics.drawable.Drawable mNeutralButtonIcon;
        public android.content.DialogInterface.OnClickListener mNeutralButtonListener;
        public java.lang.CharSequence mNeutralButtonText;
        public android.content.DialogInterface.OnCancelListener mOnCancelListener;
        public android.content.DialogInterface.OnMultiChoiceClickListener mOnCheckboxClickListener;
        public android.content.DialogInterface.OnClickListener mOnClickListener;
        public android.content.DialogInterface.OnDismissListener mOnDismissListener;
        public android.widget.AdapterView.OnItemSelectedListener mOnItemSelectedListener;
        public android.content.DialogInterface.OnKeyListener mOnKeyListener;
        public androidx.appcompat.app.AlertController.AlertParams.OnPrepareListViewListener mOnPrepareListViewListener;
        public android.graphics.drawable.Drawable mPositiveButtonIcon;
        public android.content.DialogInterface.OnClickListener mPositiveButtonListener;
        public java.lang.CharSequence mPositiveButtonText;
        public boolean mRecycleOnMeasure;
        public java.lang.CharSequence mTitle;
        public android.view.View mView;
        public int mViewLayoutResId;
        public int mViewSpacingBottom;
        public int mViewSpacingLeft;
        public int mViewSpacingRight;
        public boolean mViewSpacingSpecified;
        public int mViewSpacingTop;





        public interface OnPrepareListViewListener {
            void onPrepareListView(android.widget.ListView r1);
        }

        public AlertParams(android.content.Context r2) {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.mIconId = r0
                r1.mIconAttrId = r0
                r1.mViewSpacingSpecified = r0
                r0 = -1
                r1.mCheckedItem = r0
                r0 = 1
                r1.mRecycleOnMeasure = r0
                r1.mContext = r2
                r1.mCancelable = r0
                java.lang.String r0 = "layout_inflater"
                java.lang.Object r0 = r2.getSystemService(r0)
                android.view.LayoutInflater r0 = (android.view.LayoutInflater) r0
                r1.mInflater = r0
                return
        }

        private void createListView(androidx.appcompat.app.AlertController r16) {
                r15 = this;
                r6 = r16
                android.view.LayoutInflater r0 = r15.mInflater
                int r1 = r6.mListLayout
                r2 = 0
                android.view.View r0 = r0.inflate(r1, r2)
                r5 = r0
                androidx.appcompat.app.AlertController$RecycleListView r5 = (androidx.appcompat.app.AlertController.RecycleListView) r5
                boolean r0 = r15.mIsMultiChoice
                r14 = 1
                if (r0 == 0) goto L35
                android.database.Cursor r0 = r15.mCursor
                if (r0 != 0) goto L28
                androidx.appcompat.app.AlertController$AlertParams$1 r7 = new androidx.appcompat.app.AlertController$AlertParams$1
                android.content.Context r9 = r15.mContext
                int r10 = r6.mMultiChoiceItemLayout
                r11 = 16908308(0x1020014, float:2.3877285E-38)
                java.lang.CharSequence[] r12 = r15.mItems
                r8 = r15
                r13 = r5
                r7.<init>(r8, r9, r10, r11, r12, r13)
                goto L6d
            L28:
                androidx.appcompat.app.AlertController$AlertParams$2 r0 = new androidx.appcompat.app.AlertController$AlertParams$2
                android.content.Context r2 = r15.mContext
                android.database.Cursor r3 = r15.mCursor
                r4 = 0
                r1 = r15
                r0.<init>(r1, r2, r3, r4, r5, r6)
                r7 = r0
                goto L6d
            L35:
                boolean r0 = r15.mIsSingleChoice
                if (r0 == 0) goto L3d
                int r0 = r6.mSingleChoiceItemLayout
                r9 = r0
                goto L40
            L3d:
                int r0 = r6.mListItemLayout
                r9 = r0
            L40:
                android.database.Cursor r0 = r15.mCursor
                r2 = 16908308(0x1020014, float:2.3877285E-38)
                if (r0 == 0) goto L5c
                android.widget.SimpleCursorAdapter r7 = new android.widget.SimpleCursorAdapter
                android.content.Context r8 = r15.mContext
                android.database.Cursor r10 = r15.mCursor
                java.lang.String[] r11 = new java.lang.String[r14]
                r0 = 0
                java.lang.String r3 = r15.mLabelColumn
                r11[r0] = r3
                int[] r12 = new int[]{r2}
                r7.<init>(r8, r9, r10, r11, r12)
                goto L6d
            L5c:
                android.widget.ListAdapter r0 = r15.mAdapter
                if (r0 == 0) goto L63
                android.widget.ListAdapter r7 = r15.mAdapter
                goto L6d
            L63:
                androidx.appcompat.app.AlertController$CheckedItemAdapter r0 = new androidx.appcompat.app.AlertController$CheckedItemAdapter
                android.content.Context r3 = r15.mContext
                java.lang.CharSequence[] r4 = r15.mItems
                r0.<init>(r3, r9, r2, r4)
                r7 = r0
            L6d:
                androidx.appcompat.app.AlertController$AlertParams$OnPrepareListViewListener r0 = r15.mOnPrepareListViewListener
                if (r0 == 0) goto L76
                androidx.appcompat.app.AlertController$AlertParams$OnPrepareListViewListener r0 = r15.mOnPrepareListViewListener
                r0.onPrepareListView(r5)
            L76:
                r6.mAdapter = r7
                int r0 = r15.mCheckedItem
                r6.mCheckedItem = r0
                android.content.DialogInterface$OnClickListener r0 = r15.mOnClickListener
                if (r0 == 0) goto L89
                androidx.appcompat.app.AlertController$AlertParams$3 r0 = new androidx.appcompat.app.AlertController$AlertParams$3
                r0.<init>(r15, r6)
                r5.setOnItemClickListener(r0)
                goto L95
            L89:
                android.content.DialogInterface$OnMultiChoiceClickListener r0 = r15.mOnCheckboxClickListener
                if (r0 == 0) goto L95
                androidx.appcompat.app.AlertController$AlertParams$4 r0 = new androidx.appcompat.app.AlertController$AlertParams$4
                r0.<init>(r15, r5, r6)
                r5.setOnItemClickListener(r0)
            L95:
                android.widget.AdapterView$OnItemSelectedListener r0 = r15.mOnItemSelectedListener
                if (r0 == 0) goto L9e
                android.widget.AdapterView$OnItemSelectedListener r0 = r15.mOnItemSelectedListener
                r5.setOnItemSelectedListener(r0)
            L9e:
                boolean r0 = r15.mIsSingleChoice
                if (r0 == 0) goto La6
                r5.setChoiceMode(r14)
                goto Lae
            La6:
                boolean r0 = r15.mIsMultiChoice
                if (r0 == 0) goto Lae
                r0 = 2
                r5.setChoiceMode(r0)
            Lae:
                r6.mListView = r5
                return
        }

        public void apply(androidx.appcompat.app.AlertController r14) {
                r13 = this;
                android.view.View r0 = r13.mCustomTitleView
                if (r0 == 0) goto La
                android.view.View r0 = r13.mCustomTitleView
                r14.setCustomTitle(r0)
                goto L32
            La:
                java.lang.CharSequence r0 = r13.mTitle
                if (r0 == 0) goto L13
                java.lang.CharSequence r0 = r13.mTitle
                r14.setTitle(r0)
            L13:
                android.graphics.drawable.Drawable r0 = r13.mIcon
                if (r0 == 0) goto L1c
                android.graphics.drawable.Drawable r0 = r13.mIcon
                r14.setIcon(r0)
            L1c:
                int r0 = r13.mIconId
                if (r0 == 0) goto L25
                int r0 = r13.mIconId
                r14.setIcon(r0)
            L25:
                int r0 = r13.mIconAttrId
                if (r0 == 0) goto L32
                int r0 = r13.mIconAttrId
                int r0 = r14.getIconAttributeResId(r0)
                r14.setIcon(r0)
            L32:
                java.lang.CharSequence r0 = r13.mMessage
                if (r0 == 0) goto L3b
                java.lang.CharSequence r0 = r13.mMessage
                r14.setMessage(r0)
            L3b:
                java.lang.CharSequence r0 = r13.mPositiveButtonText
                if (r0 != 0) goto L46
                android.graphics.drawable.Drawable r0 = r13.mPositiveButtonIcon
                if (r0 == 0) goto L44
                goto L46
            L44:
                r7 = r14
                goto L53
            L46:
                java.lang.CharSequence r3 = r13.mPositiveButtonText
                android.content.DialogInterface$OnClickListener r4 = r13.mPositiveButtonListener
                r5 = 0
                android.graphics.drawable.Drawable r6 = r13.mPositiveButtonIcon
                r2 = -1
                r1 = r14
                r1.setButton(r2, r3, r4, r5, r6)
                r7 = r1
            L53:
                java.lang.CharSequence r14 = r13.mNegativeButtonText
                if (r14 != 0) goto L5b
                android.graphics.drawable.Drawable r14 = r13.mNegativeButtonIcon
                if (r14 == 0) goto L66
            L5b:
                java.lang.CharSequence r9 = r13.mNegativeButtonText
                android.content.DialogInterface$OnClickListener r10 = r13.mNegativeButtonListener
                r11 = 0
                android.graphics.drawable.Drawable r12 = r13.mNegativeButtonIcon
                r8 = -2
                r7.setButton(r8, r9, r10, r11, r12)
            L66:
                java.lang.CharSequence r14 = r13.mNeutralButtonText
                if (r14 != 0) goto L6e
                android.graphics.drawable.Drawable r14 = r13.mNeutralButtonIcon
                if (r14 == 0) goto L79
            L6e:
                java.lang.CharSequence r9 = r13.mNeutralButtonText
                android.content.DialogInterface$OnClickListener r10 = r13.mNeutralButtonListener
                r11 = 0
                android.graphics.drawable.Drawable r12 = r13.mNeutralButtonIcon
                r8 = -3
                r7.setButton(r8, r9, r10, r11, r12)
            L79:
                java.lang.CharSequence[] r14 = r13.mItems
                if (r14 != 0) goto L85
                android.database.Cursor r14 = r13.mCursor
                if (r14 != 0) goto L85
                android.widget.ListAdapter r14 = r13.mAdapter
                if (r14 == 0) goto L88
            L85:
                r13.createListView(r7)
            L88:
                android.view.View r14 = r13.mView
                if (r14 == 0) goto La4
                boolean r14 = r13.mViewSpacingSpecified
                if (r14 == 0) goto L9e
                android.view.View r8 = r13.mView
                int r9 = r13.mViewSpacingLeft
                int r10 = r13.mViewSpacingTop
                int r11 = r13.mViewSpacingRight
                int r12 = r13.mViewSpacingBottom
                r7.setView(r8, r9, r10, r11, r12)
                goto Lad
            L9e:
                android.view.View r14 = r13.mView
                r7.setView(r14)
                goto Lad
            La4:
                int r14 = r13.mViewLayoutResId
                if (r14 == 0) goto Lad
                int r14 = r13.mViewLayoutResId
                r7.setView(r14)
            Lad:
                return
        }
    }

    private static final class ButtonHandler extends android.os.Handler {
        private static final int MSG_DISMISS_DIALOG = 1;
        private java.lang.ref.WeakReference<android.content.DialogInterface> mDialog;

        public ButtonHandler(android.content.DialogInterface r2) {
                r1 = this;
                r1.<init>()
                java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
                r0.<init>(r2)
                r1.mDialog = r0
                return
        }

        @Override // android.os.Handler
        public void handleMessage(android.os.Message r4) {
                r3 = this;
                int r0 = r4.what
                switch(r0) {
                    case -3: goto Le;
                    case -2: goto Le;
                    case -1: goto Le;
                    case 0: goto L5;
                    case 1: goto L6;
                    default: goto L5;
                }
            L5:
                goto L20
            L6:
                java.lang.Object r0 = r4.obj
                android.content.DialogInterface r0 = (android.content.DialogInterface) r0
                r0.dismiss()
                goto L20
            Le:
                java.lang.Object r0 = r4.obj
                android.content.DialogInterface$OnClickListener r0 = (android.content.DialogInterface.OnClickListener) r0
                java.lang.ref.WeakReference<android.content.DialogInterface> r1 = r3.mDialog
                java.lang.Object r1 = r1.get()
                android.content.DialogInterface r1 = (android.content.DialogInterface) r1
                int r2 = r4.what
                r0.onClick(r1, r2)
            L20:
                return
        }
    }

    private static class CheckedItemAdapter extends android.widget.ArrayAdapter<java.lang.CharSequence> {
        public CheckedItemAdapter(android.content.Context r1, int r2, int r3, java.lang.CharSequence[] r4) {
                r0 = this;
                r0.<init>(r1, r2, r3, r4)
                return
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public long getItemId(int r3) {
                r2 = this;
                long r0 = (long) r3
                return r0
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public boolean hasStableIds() {
                r1 = this;
                r0 = 1
                return r0
        }
    }

    public static class RecycleListView extends android.widget.ListView {
        private final int mPaddingBottomNoButtons;
        private final int mPaddingTopNoTitle;

        public RecycleListView(android.content.Context r2) {
                r1 = this;
                r0 = 0
                r1.<init>(r2, r0)
                return
        }

        public RecycleListView(android.content.Context r4, android.util.AttributeSet r5) {
                r3 = this;
                r3.<init>(r4, r5)
                int[] r0 = androidx.appcompat.R.styleable.RecycleListView
                android.content.res.TypedArray r0 = r4.obtainStyledAttributes(r5, r0)
                int r1 = androidx.appcompat.R.styleable.RecycleListView_paddingBottomNoButtons
                r2 = -1
                int r1 = r0.getDimensionPixelOffset(r1, r2)
                r3.mPaddingBottomNoButtons = r1
                int r1 = androidx.appcompat.R.styleable.RecycleListView_paddingTopNoTitle
                int r1 = r0.getDimensionPixelOffset(r1, r2)
                r3.mPaddingTopNoTitle = r1
                return
        }

        public void setHasDecor(boolean r5, boolean r6) {
                r4 = this;
                if (r6 == 0) goto L4
                if (r5 != 0) goto L21
            L4:
                int r0 = r4.getPaddingLeft()
                if (r5 == 0) goto Lf
                int r1 = r4.getPaddingTop()
                goto L11
            Lf:
                int r1 = r4.mPaddingTopNoTitle
            L11:
                int r2 = r4.getPaddingRight()
                if (r6 == 0) goto L1c
                int r3 = r4.getPaddingBottom()
                goto L1e
            L1c:
                int r3 = r4.mPaddingBottomNoButtons
            L1e:
                r4.setPadding(r0, r1, r2, r3)
            L21:
                return
        }
    }

    public AlertController(android.content.Context r5, androidx.appcompat.app.AppCompatDialog r6, android.view.Window r7) {
            r4 = this;
            r4.<init>()
            r0 = 0
            r4.mViewSpacingSpecified = r0
            r4.mIconId = r0
            r1 = -1
            r4.mCheckedItem = r1
            r4.mButtonPanelLayoutHint = r0
            androidx.appcompat.app.AlertController$1 r1 = new androidx.appcompat.app.AlertController$1
            r1.<init>(r4)
            r4.mButtonHandler = r1
            r4.mContext = r5
            r4.mDialog = r6
            r4.mWindow = r7
            androidx.appcompat.app.AlertController$ButtonHandler r1 = new androidx.appcompat.app.AlertController$ButtonHandler
            r1.<init>(r6)
            r4.mHandler = r1
            int[] r1 = androidx.appcompat.R.styleable.AlertDialog
            int r2 = androidx.appcompat.R.attr.alertDialogStyle
            r3 = 0
            android.content.res.TypedArray r1 = r5.obtainStyledAttributes(r3, r1, r2, r0)
            int r2 = androidx.appcompat.R.styleable.AlertDialog_android_layout
            int r2 = r1.getResourceId(r2, r0)
            r4.mAlertDialogLayout = r2
            int r2 = androidx.appcompat.R.styleable.AlertDialog_buttonPanelSideLayout
            int r2 = r1.getResourceId(r2, r0)
            r4.mButtonPanelSideLayout = r2
            int r2 = androidx.appcompat.R.styleable.AlertDialog_listLayout
            int r2 = r1.getResourceId(r2, r0)
            r4.mListLayout = r2
            int r2 = androidx.appcompat.R.styleable.AlertDialog_multiChoiceItemLayout
            int r2 = r1.getResourceId(r2, r0)
            r4.mMultiChoiceItemLayout = r2
            int r2 = androidx.appcompat.R.styleable.AlertDialog_singleChoiceItemLayout
            int r2 = r1.getResourceId(r2, r0)
            r4.mSingleChoiceItemLayout = r2
            int r2 = androidx.appcompat.R.styleable.AlertDialog_listItemLayout
            int r2 = r1.getResourceId(r2, r0)
            r4.mListItemLayout = r2
            int r2 = androidx.appcompat.R.styleable.AlertDialog_showTitle
            r3 = 1
            boolean r2 = r1.getBoolean(r2, r3)
            r4.mShowTitle = r2
            int r2 = androidx.appcompat.R.styleable.AlertDialog_buttonIconDimen
            int r0 = r1.getDimensionPixelSize(r2, r0)
            r4.mButtonIconDimen = r0
            r1.recycle()
            r6.supportRequestWindowFeature(r3)
            return
    }

    static boolean canTextInput(android.view.View r5) {
            boolean r0 = r5.onCheckIsTextEditor()
            r1 = 1
            if (r0 == 0) goto L8
            return r1
        L8:
            boolean r0 = r5 instanceof android.view.ViewGroup
            r2 = 0
            if (r0 != 0) goto Le
            return r2
        Le:
            r0 = r5
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            int r3 = r0.getChildCount()
        L15:
            if (r3 <= 0) goto L24
            int r3 = r3 + (-1)
            android.view.View r5 = r0.getChildAt(r3)
            boolean r4 = canTextInput(r5)
            if (r4 == 0) goto L15
            return r1
        L24:
            return r2
    }

    private void centerButton(android.widget.Button r3) {
            r2 = this;
            android.view.ViewGroup$LayoutParams r0 = r3.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r0 = (android.widget.LinearLayout.LayoutParams) r0
            r1 = 1
            r0.gravity = r1
            r1 = 1056964608(0x3f000000, float:0.5)
            r0.weight = r1
            r3.setLayoutParams(r0)
            return
    }

    static void manageScrollIndicators(android.view.View r3, android.view.View r4, android.view.View r5) {
            r0 = 0
            r1 = 4
            if (r4 == 0) goto L12
        L5:
            r2 = -1
            boolean r2 = r3.canScrollVertically(r2)
            if (r2 == 0) goto Le
            r2 = r0
            goto Lf
        Le:
            r2 = r1
        Lf:
            r4.setVisibility(r2)
        L12:
            if (r5 == 0) goto L21
        L15:
            r2 = 1
            boolean r2 = r3.canScrollVertically(r2)
            if (r2 == 0) goto L1d
            goto L1e
        L1d:
            r0 = r1
        L1e:
            r5.setVisibility(r0)
        L21:
            return
    }

    private android.view.ViewGroup resolvePanel(android.view.View r3, android.view.View r4) {
            r2 = this;
            if (r3 != 0) goto L11
            boolean r0 = r4 instanceof android.view.ViewStub
            if (r0 == 0) goto Ld
            r0 = r4
            android.view.ViewStub r0 = (android.view.ViewStub) r0
            android.view.View r4 = r0.inflate()
        Ld:
            r0 = r4
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            return r0
        L11:
            if (r4 == 0) goto L21
            android.view.ViewParent r0 = r4.getParent()
            boolean r1 = r0 instanceof android.view.ViewGroup
            if (r1 == 0) goto L21
            r1 = r0
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r1.removeView(r4)
        L21:
            boolean r0 = r3 instanceof android.view.ViewStub
            if (r0 == 0) goto L2c
            r0 = r3
            android.view.ViewStub r0 = (android.view.ViewStub) r0
            android.view.View r3 = r0.inflate()
        L2c:
            r0 = r3
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            return r0
    }

    private int selectContentView() {
            r2 = this;
            int r0 = r2.mButtonPanelSideLayout
            if (r0 != 0) goto L7
            int r0 = r2.mAlertDialogLayout
            return r0
        L7:
            int r0 = r2.mButtonPanelLayoutHint
            r1 = 1
            if (r0 != r1) goto Lf
            int r0 = r2.mButtonPanelSideLayout
            return r0
        Lf:
            int r0 = r2.mAlertDialogLayout
            return r0
    }

    private void setScrollIndicators(android.view.ViewGroup r4, android.view.View r5, int r6, int r7) {
            r3 = this;
            android.view.Window r0 = r3.mWindow
            int r1 = androidx.appcompat.R.id.scrollIndicatorUp
            android.view.View r0 = r0.findViewById(r1)
            android.view.Window r1 = r3.mWindow
            int r2 = androidx.appcompat.R.id.scrollIndicatorDown
            android.view.View r1 = r1.findViewById(r2)
            androidx.core.view.ViewCompat.setScrollIndicators(r5, r6, r7)
            if (r0 == 0) goto L19
            r4.removeView(r0)
        L19:
            if (r1 == 0) goto L1e
            r4.removeView(r1)
        L1e:
            return
    }

    private void setupButtons(android.view.ViewGroup r11) {
            r10 = this;
            r0 = 1
            r1 = 2
            r2 = 4
            r3 = 0
            r4 = 16908313(0x1020019, float:2.38773E-38)
            android.view.View r4 = r11.findViewById(r4)
            android.widget.Button r4 = (android.widget.Button) r4
            r10.mButtonPositive = r4
            android.widget.Button r4 = r10.mButtonPositive
            android.view.View$OnClickListener r5 = r10.mButtonHandler
            r4.setOnClickListener(r5)
            java.lang.CharSequence r4 = r10.mButtonPositiveText
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            r5 = 8
            r6 = 0
            r7 = 0
            if (r4 == 0) goto L2c
            android.graphics.drawable.Drawable r4 = r10.mButtonPositiveIcon
            if (r4 != 0) goto L2c
            android.widget.Button r4 = r10.mButtonPositive
            r4.setVisibility(r5)
            goto L4d
        L2c:
            android.widget.Button r4 = r10.mButtonPositive
            java.lang.CharSequence r8 = r10.mButtonPositiveText
            r4.setText(r8)
            android.graphics.drawable.Drawable r4 = r10.mButtonPositiveIcon
            if (r4 == 0) goto L47
            android.graphics.drawable.Drawable r4 = r10.mButtonPositiveIcon
            int r8 = r10.mButtonIconDimen
            int r9 = r10.mButtonIconDimen
            r4.setBounds(r7, r7, r8, r9)
            android.widget.Button r4 = r10.mButtonPositive
            android.graphics.drawable.Drawable r8 = r10.mButtonPositiveIcon
            r4.setCompoundDrawables(r8, r6, r6, r6)
        L47:
            android.widget.Button r4 = r10.mButtonPositive
            r4.setVisibility(r7)
            r3 = r3 | r0
        L4d:
            r4 = 16908314(0x102001a, float:2.3877302E-38)
            android.view.View r4 = r11.findViewById(r4)
            android.widget.Button r4 = (android.widget.Button) r4
            r10.mButtonNegative = r4
            android.widget.Button r4 = r10.mButtonNegative
            android.view.View$OnClickListener r8 = r10.mButtonHandler
            r4.setOnClickListener(r8)
            java.lang.CharSequence r4 = r10.mButtonNegativeText
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 == 0) goto L71
            android.graphics.drawable.Drawable r4 = r10.mButtonNegativeIcon
            if (r4 != 0) goto L71
            android.widget.Button r4 = r10.mButtonNegative
            r4.setVisibility(r5)
            goto L92
        L71:
            android.widget.Button r4 = r10.mButtonNegative
            java.lang.CharSequence r8 = r10.mButtonNegativeText
            r4.setText(r8)
            android.graphics.drawable.Drawable r4 = r10.mButtonNegativeIcon
            if (r4 == 0) goto L8c
            android.graphics.drawable.Drawable r4 = r10.mButtonNegativeIcon
            int r8 = r10.mButtonIconDimen
            int r9 = r10.mButtonIconDimen
            r4.setBounds(r7, r7, r8, r9)
            android.widget.Button r4 = r10.mButtonNegative
            android.graphics.drawable.Drawable r8 = r10.mButtonNegativeIcon
            r4.setCompoundDrawables(r8, r6, r6, r6)
        L8c:
            android.widget.Button r4 = r10.mButtonNegative
            r4.setVisibility(r7)
            r3 = r3 | r1
        L92:
            r4 = 16908315(0x102001b, float:2.3877305E-38)
            android.view.View r4 = r11.findViewById(r4)
            android.widget.Button r4 = (android.widget.Button) r4
            r10.mButtonNeutral = r4
            android.widget.Button r4 = r10.mButtonNeutral
            android.view.View$OnClickListener r8 = r10.mButtonHandler
            r4.setOnClickListener(r8)
            java.lang.CharSequence r4 = r10.mButtonNeutralText
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 == 0) goto Lb6
            android.graphics.drawable.Drawable r4 = r10.mButtonNeutralIcon
            if (r4 != 0) goto Lb6
            android.widget.Button r4 = r10.mButtonNeutral
            r4.setVisibility(r5)
            goto Ld7
        Lb6:
            android.widget.Button r4 = r10.mButtonNeutral
            java.lang.CharSequence r8 = r10.mButtonNeutralText
            r4.setText(r8)
            android.graphics.drawable.Drawable r4 = r10.mButtonNeutralIcon
            if (r4 == 0) goto Ld1
            android.graphics.drawable.Drawable r4 = r10.mButtonNeutralIcon
            int r8 = r10.mButtonIconDimen
            int r9 = r10.mButtonIconDimen
            r4.setBounds(r7, r7, r8, r9)
            android.widget.Button r4 = r10.mButtonNeutral
            android.graphics.drawable.Drawable r8 = r10.mButtonNeutralIcon
            r4.setCompoundDrawables(r8, r6, r6, r6)
        Ld1:
            android.widget.Button r4 = r10.mButtonNeutral
            r4.setVisibility(r7)
            r3 = r3 | r2
        Ld7:
            android.content.Context r4 = r10.mContext
            boolean r4 = shouldCenterSingleButton(r4)
            if (r4 == 0) goto Lf6
            if (r3 != r0) goto Le7
            android.widget.Button r4 = r10.mButtonPositive
            r10.centerButton(r4)
            goto Lf6
        Le7:
            if (r3 != r1) goto Lef
            android.widget.Button r4 = r10.mButtonNegative
            r10.centerButton(r4)
            goto Lf6
        Lef:
            if (r3 != r2) goto Lf6
            android.widget.Button r4 = r10.mButtonNeutral
            r10.centerButton(r4)
        Lf6:
            if (r3 == 0) goto Lf9
            r7 = 1
        Lf9:
            if (r7 != 0) goto Lfe
            r11.setVisibility(r5)
        Lfe:
            return
    }

    private void setupContent(android.view.ViewGroup r6) {
            r5 = this;
            android.view.Window r0 = r5.mWindow
            int r1 = androidx.appcompat.R.id.scrollView
            android.view.View r0 = r0.findViewById(r1)
            androidx.core.widget.NestedScrollView r0 = (androidx.core.widget.NestedScrollView) r0
            r5.mScrollView = r0
            androidx.core.widget.NestedScrollView r0 = r5.mScrollView
            r1 = 0
            r0.setFocusable(r1)
            androidx.core.widget.NestedScrollView r0 = r5.mScrollView
            r0.setNestedScrollingEnabled(r1)
            r0 = 16908299(0x102000b, float:2.387726E-38)
            android.view.View r0 = r6.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r5.mMessageView = r0
            android.widget.TextView r0 = r5.mMessageView
            if (r0 != 0) goto L27
            return
        L27:
            java.lang.CharSequence r0 = r5.mMessage
            if (r0 == 0) goto L33
            android.widget.TextView r0 = r5.mMessageView
            java.lang.CharSequence r1 = r5.mMessage
            r0.setText(r1)
            goto L65
        L33:
            android.widget.TextView r0 = r5.mMessageView
            r1 = 8
            r0.setVisibility(r1)
            androidx.core.widget.NestedScrollView r0 = r5.mScrollView
            android.widget.TextView r2 = r5.mMessageView
            r0.removeView(r2)
            android.widget.ListView r0 = r5.mListView
            if (r0 == 0) goto L62
            androidx.core.widget.NestedScrollView r0 = r5.mScrollView
            android.view.ViewParent r0 = r0.getParent()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            androidx.core.widget.NestedScrollView r1 = r5.mScrollView
            int r1 = r0.indexOfChild(r1)
            r0.removeViewAt(r1)
            android.widget.ListView r2 = r5.mListView
            android.view.ViewGroup$LayoutParams r3 = new android.view.ViewGroup$LayoutParams
            r4 = -1
            r3.<init>(r4, r4)
            r0.addView(r2, r1, r3)
            goto L65
        L62:
            r6.setVisibility(r1)
        L65:
            return
    }

    private void setupCustomContent(android.view.ViewGroup r8) {
            r7 = this;
            android.view.View r0 = r7.mView
            r1 = 0
            if (r0 == 0) goto L8
            android.view.View r0 = r7.mView
            goto L1a
        L8:
            int r0 = r7.mViewLayoutResId
            if (r0 == 0) goto L19
            android.content.Context r0 = r7.mContext
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            int r2 = r7.mViewLayoutResId
            android.view.View r0 = r0.inflate(r2, r8, r1)
            goto L1a
        L19:
            r0 = 0
        L1a:
            if (r0 == 0) goto L1d
            r1 = 1
        L1d:
            if (r1 == 0) goto L25
            boolean r2 = canTextInput(r0)
            if (r2 != 0) goto L2c
        L25:
            android.view.Window r2 = r7.mWindow
            r3 = 131072(0x20000, float:1.83671E-40)
            r2.setFlags(r3, r3)
        L2c:
            if (r1 == 0) goto L5e
            android.view.Window r2 = r7.mWindow
            int r3 = androidx.appcompat.R.id.custom
            android.view.View r2 = r2.findViewById(r3)
            android.widget.FrameLayout r2 = (android.widget.FrameLayout) r2
            android.view.ViewGroup$LayoutParams r3 = new android.view.ViewGroup$LayoutParams
            r4 = -1
            r3.<init>(r4, r4)
            r2.addView(r0, r3)
            boolean r3 = r7.mViewSpacingSpecified
            if (r3 == 0) goto L50
            int r3 = r7.mViewSpacingLeft
            int r4 = r7.mViewSpacingTop
            int r5 = r7.mViewSpacingRight
            int r6 = r7.mViewSpacingBottom
            r2.setPadding(r3, r4, r5, r6)
        L50:
            android.widget.ListView r3 = r7.mListView
            if (r3 == 0) goto L5d
            android.view.ViewGroup$LayoutParams r3 = r8.getLayoutParams()
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r3 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) r3
            r4 = 0
            r3.weight = r4
        L5d:
            goto L63
        L5e:
            r2 = 8
            r8.setVisibility(r2)
        L63:
            return
    }

    private void setupTitle(android.view.ViewGroup r8) {
            r7 = this;
            android.view.View r0 = r7.mCustomTitleView
            r1 = 8
            if (r0 == 0) goto L20
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r2 = -1
            r3 = -2
            r0.<init>(r2, r3)
            android.view.View r2 = r7.mCustomTitleView
            r3 = 0
            r8.addView(r2, r3, r0)
            android.view.Window r2 = r7.mWindow
            int r3 = androidx.appcompat.R.id.title_template
            android.view.View r2 = r2.findViewById(r3)
            r2.setVisibility(r1)
            goto L9c
        L20:
            android.view.Window r0 = r7.mWindow
            r2 = 16908294(0x1020006, float:2.3877246E-38)
            android.view.View r0 = r0.findViewById(r2)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r7.mIconView = r0
            java.lang.CharSequence r0 = r7.mTitle
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L89
            boolean r2 = r7.mShowTitle
            if (r2 == 0) goto L89
            android.view.Window r2 = r7.mWindow
            int r3 = androidx.appcompat.R.id.alertTitle
            android.view.View r2 = r2.findViewById(r3)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r7.mTitleView = r2
            android.widget.TextView r2 = r7.mTitleView
            java.lang.CharSequence r3 = r7.mTitle
            r2.setText(r3)
            int r2 = r7.mIconId
            if (r2 == 0) goto L5a
            android.widget.ImageView r1 = r7.mIconView
            int r2 = r7.mIconId
            r1.setImageResource(r2)
            goto L9c
        L5a:
            android.graphics.drawable.Drawable r2 = r7.mIcon
            if (r2 == 0) goto L66
            android.widget.ImageView r1 = r7.mIconView
            android.graphics.drawable.Drawable r2 = r7.mIcon
            r1.setImageDrawable(r2)
            goto L9c
        L66:
            android.widget.TextView r2 = r7.mTitleView
            android.widget.ImageView r3 = r7.mIconView
            int r3 = r3.getPaddingLeft()
            android.widget.ImageView r4 = r7.mIconView
            int r4 = r4.getPaddingTop()
            android.widget.ImageView r5 = r7.mIconView
            int r5 = r5.getPaddingRight()
            android.widget.ImageView r6 = r7.mIconView
            int r6 = r6.getPaddingBottom()
            r2.setPadding(r3, r4, r5, r6)
            android.widget.ImageView r2 = r7.mIconView
            r2.setVisibility(r1)
            goto L9c
        L89:
            android.view.Window r2 = r7.mWindow
            int r3 = androidx.appcompat.R.id.title_template
            android.view.View r2 = r2.findViewById(r3)
            r2.setVisibility(r1)
            android.widget.ImageView r3 = r7.mIconView
            r3.setVisibility(r1)
            r8.setVisibility(r1)
        L9c:
            return
    }

    private void setupView() {
            r18 = this;
            r0 = r18
            android.view.Window r1 = r0.mWindow
            int r2 = androidx.appcompat.R.id.parentPanel
            android.view.View r1 = r1.findViewById(r2)
            int r2 = androidx.appcompat.R.id.topPanel
            android.view.View r2 = r1.findViewById(r2)
            int r3 = androidx.appcompat.R.id.contentPanel
            android.view.View r3 = r1.findViewById(r3)
            int r4 = androidx.appcompat.R.id.buttonPanel
            android.view.View r4 = r1.findViewById(r4)
            int r5 = androidx.appcompat.R.id.customPanel
            android.view.View r5 = r1.findViewById(r5)
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            r0.setupCustomContent(r5)
            int r6 = androidx.appcompat.R.id.topPanel
            android.view.View r6 = r5.findViewById(r6)
            int r7 = androidx.appcompat.R.id.contentPanel
            android.view.View r7 = r5.findViewById(r7)
            int r8 = androidx.appcompat.R.id.buttonPanel
            android.view.View r8 = r5.findViewById(r8)
            android.view.ViewGroup r9 = r0.resolvePanel(r6, r2)
            android.view.ViewGroup r10 = r0.resolvePanel(r7, r3)
            android.view.ViewGroup r11 = r0.resolvePanel(r8, r4)
            r0.setupContent(r10)
            r0.setupButtons(r11)
            r0.setupTitle(r9)
            r12 = 8
            if (r5 == 0) goto L5a
            int r15 = r5.getVisibility()
            if (r15 == r12) goto L5a
            r15 = 1
            goto L5b
        L5a:
            r15 = 0
        L5b:
            if (r9 == 0) goto L65
            int r13 = r9.getVisibility()
            if (r13 == r12) goto L65
            r13 = 1
            goto L66
        L65:
            r13 = 0
        L66:
            if (r11 == 0) goto L70
            int r14 = r11.getVisibility()
            if (r14 == r12) goto L70
            r12 = 1
            goto L71
        L70:
            r12 = 0
        L71:
            if (r12 != 0) goto L8a
            if (r10 == 0) goto L87
            int r14 = androidx.appcompat.R.id.textSpacerNoButtons
            android.view.View r14 = r10.findViewById(r14)
            if (r14 == 0) goto L84
            r17 = r1
            r1 = 0
            r14.setVisibility(r1)
            goto L8c
        L84:
            r17 = r1
            goto L8c
        L87:
            r17 = r1
            goto L8c
        L8a:
            r17 = r1
        L8c:
            if (r13 == 0) goto Laf
            androidx.core.widget.NestedScrollView r1 = r0.mScrollView
            if (r1 == 0) goto L98
            androidx.core.widget.NestedScrollView r1 = r0.mScrollView
            r14 = 1
            r1.setClipToPadding(r14)
        L98:
            r1 = 0
            java.lang.CharSequence r14 = r0.mMessage
            if (r14 != 0) goto La1
            android.widget.ListView r14 = r0.mListView
            if (r14 == 0) goto La7
        La1:
            int r14 = androidx.appcompat.R.id.titleDividerNoCustom
            android.view.View r1 = r9.findViewById(r14)
        La7:
            if (r1 == 0) goto Lad
            r14 = 0
            r1.setVisibility(r14)
        Lad:
            r14 = 0
            goto Lc1
        Laf:
            if (r10 == 0) goto Lc0
            int r1 = androidx.appcompat.R.id.textSpacerNoTitle
            android.view.View r1 = r10.findViewById(r1)
            if (r1 == 0) goto Lbe
            r14 = 0
            r1.setVisibility(r14)
            goto Lc1
        Lbe:
            r14 = 0
            goto Lc1
        Lc0:
            r14 = 0
        Lc1:
            android.widget.ListView r1 = r0.mListView
            boolean r1 = r1 instanceof androidx.appcompat.app.AlertController.RecycleListView
            if (r1 == 0) goto Lce
            android.widget.ListView r1 = r0.mListView
            androidx.appcompat.app.AlertController$RecycleListView r1 = (androidx.appcompat.app.AlertController.RecycleListView) r1
            r1.setHasDecor(r13, r12)
        Lce:
            if (r15 != 0) goto Lf1
            android.widget.ListView r1 = r0.mListView
            if (r1 == 0) goto Ld7
            android.widget.ListView r1 = r0.mListView
            goto Ld9
        Ld7:
            androidx.core.widget.NestedScrollView r1 = r0.mScrollView
        Ld9:
            if (r1 == 0) goto Lee
            if (r13 == 0) goto Le0
            r16 = 1
            goto Le2
        Le0:
            r16 = r14
        Le2:
            if (r12 == 0) goto Le5
            r14 = 2
        Le5:
            r14 = r16 | r14
            r16 = r2
            r2 = 3
            r0.setScrollIndicators(r10, r1, r14, r2)
            goto Lf3
        Lee:
            r16 = r2
            goto Lf3
        Lf1:
            r16 = r2
        Lf3:
            android.widget.ListView r1 = r0.mListView
            if (r1 == 0) goto L10c
            android.widget.ListAdapter r2 = r0.mAdapter
            if (r2 == 0) goto L10c
            android.widget.ListAdapter r2 = r0.mAdapter
            r1.setAdapter(r2)
            int r2 = r0.mCheckedItem
            r14 = -1
            if (r2 <= r14) goto L10c
            r14 = 1
            r1.setItemChecked(r2, r14)
            r1.setSelection(r2)
        L10c:
            return
    }

    private static boolean shouldCenterSingleButton(android.content.Context r4) {
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            android.content.res.Resources$Theme r1 = r4.getTheme()
            int r2 = androidx.appcompat.R.attr.alertDialogCenterButtons
            r3 = 1
            r1.resolveAttribute(r2, r0, r3)
            int r1 = r0.data
            if (r1 == 0) goto L14
            goto L15
        L14:
            r3 = 0
        L15:
            return r3
    }

    public android.widget.Button getButton(int r2) {
            r1 = this;
            switch(r2) {
                case -3: goto Lb;
                case -2: goto L8;
                case -1: goto L5;
                default: goto L3;
            }
        L3:
            r0 = 0
            return r0
        L5:
            android.widget.Button r0 = r1.mButtonPositive
            return r0
        L8:
            android.widget.Button r0 = r1.mButtonNegative
            return r0
        Lb:
            android.widget.Button r0 = r1.mButtonNeutral
            return r0
    }

    public int getIconAttributeResId(int r4) {
            r3 = this;
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            android.content.Context r1 = r3.mContext
            android.content.res.Resources$Theme r1 = r1.getTheme()
            r2 = 1
            r1.resolveAttribute(r4, r0, r2)
            int r1 = r0.resourceId
            return r1
    }

    public android.widget.ListView getListView() {
            r1 = this;
            android.widget.ListView r0 = r1.mListView
            return r0
    }

    public void installContent() {
            r2 = this;
            int r0 = r2.selectContentView()
            androidx.appcompat.app.AppCompatDialog r1 = r2.mDialog
            r1.setContentView(r0)
            r2.setupView()
            return
    }

    public boolean onKeyDown(int r2, android.view.KeyEvent r3) {
            r1 = this;
            androidx.core.widget.NestedScrollView r0 = r1.mScrollView
            if (r0 == 0) goto Le
            androidx.core.widget.NestedScrollView r0 = r1.mScrollView
            boolean r0 = r0.executeKeyEvent(r3)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    public boolean onKeyUp(int r2, android.view.KeyEvent r3) {
            r1 = this;
            androidx.core.widget.NestedScrollView r0 = r1.mScrollView
            if (r0 == 0) goto Le
            androidx.core.widget.NestedScrollView r0 = r1.mScrollView
            boolean r0 = r0.executeKeyEvent(r3)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    public void setButton(int r3, java.lang.CharSequence r4, android.content.DialogInterface.OnClickListener r5, android.os.Message r6, android.graphics.drawable.Drawable r7) {
            r2 = this;
            if (r6 != 0) goto La
            if (r5 == 0) goto La
            android.os.Handler r0 = r2.mHandler
            android.os.Message r6 = r0.obtainMessage(r3, r5)
        La:
            switch(r3) {
                case -3: goto L23;
                case -2: goto L1c;
                case -1: goto L15;
                default: goto Ld;
            }
        Ld:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Button does not exist"
            r0.<init>(r1)
            throw r0
        L15:
            r2.mButtonPositiveText = r4
            r2.mButtonPositiveMessage = r6
            r2.mButtonPositiveIcon = r7
            goto L2a
        L1c:
            r2.mButtonNegativeText = r4
            r2.mButtonNegativeMessage = r6
            r2.mButtonNegativeIcon = r7
            goto L2a
        L23:
            r2.mButtonNeutralText = r4
            r2.mButtonNeutralMessage = r6
            r2.mButtonNeutralIcon = r7
        L2a:
            return
    }

    public void setButtonPanelLayoutHint(int r1) {
            r0 = this;
            r0.mButtonPanelLayoutHint = r1
            return
    }

    public void setCustomTitle(android.view.View r1) {
            r0 = this;
            r0.mCustomTitleView = r1
            return
    }

    public void setIcon(int r3) {
            r2 = this;
            r0 = 0
            r2.mIcon = r0
            r2.mIconId = r3
            android.widget.ImageView r0 = r2.mIconView
            if (r0 == 0) goto L20
            if (r3 == 0) goto L19
            android.widget.ImageView r0 = r2.mIconView
            r1 = 0
            r0.setVisibility(r1)
            android.widget.ImageView r0 = r2.mIconView
            int r1 = r2.mIconId
            r0.setImageResource(r1)
            goto L20
        L19:
            android.widget.ImageView r0 = r2.mIconView
            r1 = 8
            r0.setVisibility(r1)
        L20:
            return
    }

    public void setIcon(android.graphics.drawable.Drawable r3) {
            r2 = this;
            r2.mIcon = r3
            r0 = 0
            r2.mIconId = r0
            android.widget.ImageView r1 = r2.mIconView
            if (r1 == 0) goto L1d
            if (r3 == 0) goto L16
            android.widget.ImageView r1 = r2.mIconView
            r1.setVisibility(r0)
            android.widget.ImageView r0 = r2.mIconView
            r0.setImageDrawable(r3)
            goto L1d
        L16:
            android.widget.ImageView r0 = r2.mIconView
            r1 = 8
            r0.setVisibility(r1)
        L1d:
            return
    }

    public void setMessage(java.lang.CharSequence r2) {
            r1 = this;
            r1.mMessage = r2
            android.widget.TextView r0 = r1.mMessageView
            if (r0 == 0) goto Lb
            android.widget.TextView r0 = r1.mMessageView
            r0.setText(r2)
        Lb:
            return
    }

    public void setTitle(java.lang.CharSequence r2) {
            r1 = this;
            r1.mTitle = r2
            android.widget.TextView r0 = r1.mTitleView
            if (r0 == 0) goto Lb
            android.widget.TextView r0 = r1.mTitleView
            r0.setText(r2)
        Lb:
            return
    }

    public void setView(int r2) {
            r1 = this;
            r0 = 0
            r1.mView = r0
            r1.mViewLayoutResId = r2
            r0 = 0
            r1.mViewSpacingSpecified = r0
            return
    }

    public void setView(android.view.View r2) {
            r1 = this;
            r1.mView = r2
            r0 = 0
            r1.mViewLayoutResId = r0
            r1.mViewSpacingSpecified = r0
            return
    }

    public void setView(android.view.View r2, int r3, int r4, int r5, int r6) {
            r1 = this;
            r1.mView = r2
            r0 = 0
            r1.mViewLayoutResId = r0
            r0 = 1
            r1.mViewSpacingSpecified = r0
            r1.mViewSpacingLeft = r3
            r1.mViewSpacingTop = r4
            r1.mViewSpacingRight = r5
            r1.mViewSpacingBottom = r6
            return
    }
}
