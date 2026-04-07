package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
public class ActivityChooserView extends android.view.ViewGroup implements androidx.appcompat.widget.ActivityChooserModel.ActivityChooserModelClient {
    private final android.view.View mActivityChooserContent;
    private final android.graphics.drawable.Drawable mActivityChooserContentBackground;
    final androidx.appcompat.widget.ActivityChooserView.ActivityChooserViewAdapter mAdapter;
    private final androidx.appcompat.widget.ActivityChooserView.Callbacks mCallbacks;
    private int mDefaultActionButtonContentDescription;
    final android.widget.FrameLayout mDefaultActivityButton;
    private final android.widget.ImageView mDefaultActivityButtonImage;
    final android.widget.FrameLayout mExpandActivityOverflowButton;
    private final android.widget.ImageView mExpandActivityOverflowButtonImage;
    int mInitialActivityCount;
    private boolean mIsAttachedToWindow;
    boolean mIsSelectingDefaultActivity;
    private final int mListPopupMaxWidth;
    private androidx.appcompat.widget.ListPopupWindow mListPopupWindow;
    final android.database.DataSetObserver mModelDataSetObserver;
    android.widget.PopupWindow.OnDismissListener mOnDismissListener;
    private final android.view.ViewTreeObserver.OnGlobalLayoutListener mOnGlobalLayoutListener;
    androidx.core.view.ActionProvider mProvider;






    private class ActivityChooserViewAdapter extends android.widget.BaseAdapter {
        private static final int ITEM_VIEW_TYPE_ACTIVITY = 0;
        private static final int ITEM_VIEW_TYPE_COUNT = 3;
        private static final int ITEM_VIEW_TYPE_FOOTER = 1;
        public static final int MAX_ACTIVITY_COUNT_DEFAULT = 4;
        public static final int MAX_ACTIVITY_COUNT_UNLIMITED = Integer.MAX_VALUE;
        private androidx.appcompat.widget.ActivityChooserModel mDataModel;
        private boolean mHighlightDefaultActivity;
        private int mMaxActivityCount;
        private boolean mShowDefaultActivity;
        private boolean mShowFooterView;
        final /* synthetic */ androidx.appcompat.widget.ActivityChooserView this$0;

        ActivityChooserViewAdapter(androidx.appcompat.widget.ActivityChooserView r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r1 = 4
                r0.mMaxActivityCount = r1
                return
        }

        public int getActivityCount() {
                r1 = this;
                androidx.appcompat.widget.ActivityChooserModel r0 = r1.mDataModel
                int r0 = r0.getActivityCount()
                return r0
        }

        @Override // android.widget.Adapter
        public int getCount() {
                r3 = this;
                androidx.appcompat.widget.ActivityChooserModel r0 = r3.mDataModel
                int r0 = r0.getActivityCount()
                boolean r1 = r3.mShowDefaultActivity
                if (r1 != 0) goto L14
                androidx.appcompat.widget.ActivityChooserModel r1 = r3.mDataModel
                android.content.pm.ResolveInfo r1 = r1.getDefaultActivity()
                if (r1 == 0) goto L14
                int r0 = r0 + (-1)
            L14:
                int r1 = r3.mMaxActivityCount
                int r1 = java.lang.Math.min(r0, r1)
                boolean r2 = r3.mShowFooterView
                if (r2 == 0) goto L20
                int r1 = r1 + 1
            L20:
                return r1
        }

        public androidx.appcompat.widget.ActivityChooserModel getDataModel() {
                r1 = this;
                androidx.appcompat.widget.ActivityChooserModel r0 = r1.mDataModel
                return r0
        }

        public android.content.pm.ResolveInfo getDefaultActivity() {
                r1 = this;
                androidx.appcompat.widget.ActivityChooserModel r0 = r1.mDataModel
                android.content.pm.ResolveInfo r0 = r0.getDefaultActivity()
                return r0
        }

        public int getHistorySize() {
                r1 = this;
                androidx.appcompat.widget.ActivityChooserModel r0 = r1.mDataModel
                int r0 = r0.getHistorySize()
                return r0
        }

        @Override // android.widget.Adapter
        public java.lang.Object getItem(int r3) {
                r2 = this;
                int r0 = r2.getItemViewType(r3)
                switch(r0) {
                    case 0: goto Lf;
                    case 1: goto Ld;
                    default: goto L7;
                }
            L7:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                r1.<init>()
                throw r1
            Ld:
                r1 = 0
                return r1
            Lf:
                boolean r1 = r2.mShowDefaultActivity
                if (r1 != 0) goto L1d
                androidx.appcompat.widget.ActivityChooserModel r1 = r2.mDataModel
                android.content.pm.ResolveInfo r1 = r1.getDefaultActivity()
                if (r1 == 0) goto L1d
                int r3 = r3 + 1
            L1d:
                androidx.appcompat.widget.ActivityChooserModel r1 = r2.mDataModel
                android.content.pm.ResolveInfo r1 = r1.getActivity(r3)
                return r1
        }

        @Override // android.widget.Adapter
        public long getItemId(int r3) {
                r2 = this;
                long r0 = (long) r3
                return r0
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public int getItemViewType(int r3) {
                r2 = this;
                boolean r0 = r2.mShowFooterView
                if (r0 == 0) goto Ld
                int r0 = r2.getCount()
                r1 = 1
                int r0 = r0 - r1
                if (r3 != r0) goto Ld
                return r1
            Ld:
                r0 = 0
                return r0
        }

        public boolean getShowDefaultActivity() {
                r1 = this;
                boolean r0 = r1.mShowDefaultActivity
                return r0
        }

        @Override // android.widget.Adapter
        public android.view.View getView(int r9, android.view.View r10, android.view.ViewGroup r11) {
                r8 = this;
                int r0 = r8.getItemViewType(r9)
                r1 = 1
                r2 = 0
                switch(r0) {
                    case 0: goto L42;
                    case 1: goto Lf;
                    default: goto L9;
                }
            L9:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                r1.<init>()
                throw r1
            Lf:
                if (r10 == 0) goto L17
                int r3 = r10.getId()
                if (r3 == r1) goto L41
            L17:
                androidx.appcompat.widget.ActivityChooserView r3 = r8.this$0
                android.content.Context r3 = r3.getContext()
                android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r3)
                int r4 = androidx.appcompat.R.layout.abc_activity_chooser_view_list_item
                android.view.View r10 = r3.inflate(r4, r11, r2)
                r10.setId(r1)
                int r1 = androidx.appcompat.R.id.title
                android.view.View r1 = r10.findViewById(r1)
                android.widget.TextView r1 = (android.widget.TextView) r1
                androidx.appcompat.widget.ActivityChooserView r2 = r8.this$0
                android.content.Context r2 = r2.getContext()
                int r3 = androidx.appcompat.R.string.abc_activity_chooser_view_see_all
                java.lang.String r2 = r2.getString(r3)
                r1.setText(r2)
            L41:
                return r10
            L42:
                if (r10 == 0) goto L4c
                int r3 = r10.getId()
                int r4 = androidx.appcompat.R.id.list_item
                if (r3 == r4) goto L5c
            L4c:
                androidx.appcompat.widget.ActivityChooserView r3 = r8.this$0
                android.content.Context r3 = r3.getContext()
                android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r3)
                int r4 = androidx.appcompat.R.layout.abc_activity_chooser_view_list_item
                android.view.View r10 = r3.inflate(r4, r11, r2)
            L5c:
                androidx.appcompat.widget.ActivityChooserView r3 = r8.this$0
                android.content.Context r3 = r3.getContext()
                android.content.pm.PackageManager r3 = r3.getPackageManager()
                int r4 = androidx.appcompat.R.id.icon
                android.view.View r4 = r10.findViewById(r4)
                android.widget.ImageView r4 = (android.widget.ImageView) r4
                java.lang.Object r5 = r8.getItem(r9)
                android.content.pm.ResolveInfo r5 = (android.content.pm.ResolveInfo) r5
                android.graphics.drawable.Drawable r6 = r5.loadIcon(r3)
                r4.setImageDrawable(r6)
                int r6 = androidx.appcompat.R.id.title
                android.view.View r6 = r10.findViewById(r6)
                android.widget.TextView r6 = (android.widget.TextView) r6
                java.lang.CharSequence r7 = r5.loadLabel(r3)
                r6.setText(r7)
                boolean r7 = r8.mShowDefaultActivity
                if (r7 == 0) goto L98
                if (r9 != 0) goto L98
                boolean r7 = r8.mHighlightDefaultActivity
                if (r7 == 0) goto L98
                r10.setActivated(r1)
                goto L9b
            L98:
                r10.setActivated(r2)
            L9b:
                return r10
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public int getViewTypeCount() {
                r1 = this;
                r0 = 3
                return r0
        }

        public int measureContentWidth() {
                r8 = this;
                int r0 = r8.mMaxActivityCount
                r1 = 2147483647(0x7fffffff, float:NaN)
                r8.mMaxActivityCount = r1
                r1 = 0
                r2 = 0
                r3 = 0
                int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r3)
                int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r3)
                int r5 = r8.getCount()
                r6 = 0
            L17:
                if (r6 >= r5) goto L2c
                r7 = 0
                android.view.View r2 = r8.getView(r6, r2, r7)
                r2.measure(r4, r3)
                int r7 = r2.getMeasuredWidth()
                int r1 = java.lang.Math.max(r1, r7)
                int r6 = r6 + 1
                goto L17
            L2c:
                r8.mMaxActivityCount = r0
                return r1
        }

        public void setDataModel(androidx.appcompat.widget.ActivityChooserModel r3) {
                r2 = this;
                androidx.appcompat.widget.ActivityChooserView r0 = r2.this$0
                androidx.appcompat.widget.ActivityChooserView$ActivityChooserViewAdapter r0 = r0.mAdapter
                androidx.appcompat.widget.ActivityChooserModel r0 = r0.getDataModel()
                if (r0 == 0) goto L19
                androidx.appcompat.widget.ActivityChooserView r1 = r2.this$0
                boolean r1 = r1.isShown()
                if (r1 == 0) goto L19
                androidx.appcompat.widget.ActivityChooserView r1 = r2.this$0
                android.database.DataSetObserver r1 = r1.mModelDataSetObserver
                r0.unregisterObserver(r1)
            L19:
                r2.mDataModel = r3
                if (r3 == 0) goto L2c
                androidx.appcompat.widget.ActivityChooserView r1 = r2.this$0
                boolean r1 = r1.isShown()
                if (r1 == 0) goto L2c
                androidx.appcompat.widget.ActivityChooserView r1 = r2.this$0
                android.database.DataSetObserver r1 = r1.mModelDataSetObserver
                r3.registerObserver(r1)
            L2c:
                r2.notifyDataSetChanged()
                return
        }

        public void setMaxActivityCount(int r2) {
                r1 = this;
                int r0 = r1.mMaxActivityCount
                if (r0 == r2) goto L9
                r1.mMaxActivityCount = r2
                r1.notifyDataSetChanged()
            L9:
                return
        }

        public void setShowDefaultActivity(boolean r2, boolean r3) {
                r1 = this;
                boolean r0 = r1.mShowDefaultActivity
                if (r0 != r2) goto L8
                boolean r0 = r1.mHighlightDefaultActivity
                if (r0 == r3) goto Lf
            L8:
                r1.mShowDefaultActivity = r2
                r1.mHighlightDefaultActivity = r3
                r1.notifyDataSetChanged()
            Lf:
                return
        }

        public void setShowFooterView(boolean r2) {
                r1 = this;
                boolean r0 = r1.mShowFooterView
                if (r0 == r2) goto L9
                r1.mShowFooterView = r2
                r1.notifyDataSetChanged()
            L9:
                return
        }
    }

    private class Callbacks implements android.widget.AdapterView.OnItemClickListener, android.view.View.OnClickListener, android.view.View.OnLongClickListener, android.widget.PopupWindow.OnDismissListener {
        final /* synthetic */ androidx.appcompat.widget.ActivityChooserView this$0;

        Callbacks(androidx.appcompat.widget.ActivityChooserView r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        private void notifyOnDismissListener() {
                r1 = this;
                androidx.appcompat.widget.ActivityChooserView r0 = r1.this$0
                android.widget.PopupWindow$OnDismissListener r0 = r0.mOnDismissListener
                if (r0 == 0) goto Ld
                androidx.appcompat.widget.ActivityChooserView r0 = r1.this$0
                android.widget.PopupWindow$OnDismissListener r0 = r0.mOnDismissListener
                r0.onDismiss()
            Ld:
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r5) {
                r4 = this;
                androidx.appcompat.widget.ActivityChooserView r0 = r4.this$0
                android.widget.FrameLayout r0 = r0.mDefaultActivityButton
                if (r5 != r0) goto L3c
                androidx.appcompat.widget.ActivityChooserView r0 = r4.this$0
                r0.dismissPopup()
                androidx.appcompat.widget.ActivityChooserView r0 = r4.this$0
                androidx.appcompat.widget.ActivityChooserView$ActivityChooserViewAdapter r0 = r0.mAdapter
                android.content.pm.ResolveInfo r0 = r0.getDefaultActivity()
                androidx.appcompat.widget.ActivityChooserView r1 = r4.this$0
                androidx.appcompat.widget.ActivityChooserView$ActivityChooserViewAdapter r1 = r1.mAdapter
                androidx.appcompat.widget.ActivityChooserModel r1 = r1.getDataModel()
                int r1 = r1.getActivityIndex(r0)
                androidx.appcompat.widget.ActivityChooserView r2 = r4.this$0
                androidx.appcompat.widget.ActivityChooserView$ActivityChooserViewAdapter r2 = r2.mAdapter
                androidx.appcompat.widget.ActivityChooserModel r2 = r2.getDataModel()
                android.content.Intent r2 = r2.chooseActivity(r1)
                if (r2 == 0) goto L3b
                r3 = 524288(0x80000, float:7.34684E-40)
                r2.addFlags(r3)
                androidx.appcompat.widget.ActivityChooserView r3 = r4.this$0
                android.content.Context r3 = r3.getContext()
                r3.startActivity(r2)
            L3b:
                goto L50
            L3c:
                androidx.appcompat.widget.ActivityChooserView r0 = r4.this$0
                android.widget.FrameLayout r0 = r0.mExpandActivityOverflowButton
                if (r5 != r0) goto L51
                androidx.appcompat.widget.ActivityChooserView r0 = r4.this$0
                r1 = 0
                r0.mIsSelectingDefaultActivity = r1
                androidx.appcompat.widget.ActivityChooserView r0 = r4.this$0
                androidx.appcompat.widget.ActivityChooserView r1 = r4.this$0
                int r1 = r1.mInitialActivityCount
                r0.showPopupUnchecked(r1)
            L50:
                return
            L51:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                r0.<init>()
                throw r0
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
                r2 = this;
                r2.notifyOnDismissListener()
                androidx.appcompat.widget.ActivityChooserView r0 = r2.this$0
                androidx.core.view.ActionProvider r0 = r0.mProvider
                if (r0 == 0) goto L11
                androidx.appcompat.widget.ActivityChooserView r0 = r2.this$0
                androidx.core.view.ActionProvider r0 = r0.mProvider
                r1 = 0
                r0.subUiVisibilityChanged(r1)
            L11:
                return
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(android.widget.AdapterView<?> r5, android.view.View r6, int r7, long r8) {
                r4 = this;
                android.widget.Adapter r0 = r5.getAdapter()
                androidx.appcompat.widget.ActivityChooserView$ActivityChooserViewAdapter r0 = (androidx.appcompat.widget.ActivityChooserView.ActivityChooserViewAdapter) r0
                int r1 = r0.getItemViewType(r7)
                switch(r1) {
                    case 0: goto L1c;
                    case 1: goto L13;
                    default: goto Ld;
                }
            Ld:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                r2.<init>()
                throw r2
            L13:
                androidx.appcompat.widget.ActivityChooserView r2 = r4.this$0
                r3 = 2147483647(0x7fffffff, float:NaN)
                r2.showPopupUnchecked(r3)
                goto L61
            L1c:
                androidx.appcompat.widget.ActivityChooserView r2 = r4.this$0
                r2.dismissPopup()
                androidx.appcompat.widget.ActivityChooserView r2 = r4.this$0
                boolean r2 = r2.mIsSelectingDefaultActivity
                if (r2 == 0) goto L35
                if (r7 <= 0) goto L61
                androidx.appcompat.widget.ActivityChooserView r2 = r4.this$0
                androidx.appcompat.widget.ActivityChooserView$ActivityChooserViewAdapter r2 = r2.mAdapter
                androidx.appcompat.widget.ActivityChooserModel r2 = r2.getDataModel()
                r2.setDefaultActivity(r7)
                goto L61
            L35:
                androidx.appcompat.widget.ActivityChooserView r2 = r4.this$0
                androidx.appcompat.widget.ActivityChooserView$ActivityChooserViewAdapter r2 = r2.mAdapter
                boolean r2 = r2.getShowDefaultActivity()
                if (r2 == 0) goto L41
                r2 = r7
                goto L43
            L41:
                int r2 = r7 + 1
            L43:
                r7 = r2
                androidx.appcompat.widget.ActivityChooserView r2 = r4.this$0
                androidx.appcompat.widget.ActivityChooserView$ActivityChooserViewAdapter r2 = r2.mAdapter
                androidx.appcompat.widget.ActivityChooserModel r2 = r2.getDataModel()
                android.content.Intent r2 = r2.chooseActivity(r7)
                if (r2 == 0) goto L60
                r3 = 524288(0x80000, float:7.34684E-40)
                r2.addFlags(r3)
                androidx.appcompat.widget.ActivityChooserView r3 = r4.this$0
                android.content.Context r3 = r3.getContext()
                r3.startActivity(r2)
            L60:
            L61:
                return
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(android.view.View r4) {
                r3 = this;
                androidx.appcompat.widget.ActivityChooserView r0 = r3.this$0
                android.widget.FrameLayout r0 = r0.mDefaultActivityButton
                if (r4 != r0) goto L1f
                androidx.appcompat.widget.ActivityChooserView r0 = r3.this$0
                androidx.appcompat.widget.ActivityChooserView$ActivityChooserViewAdapter r0 = r0.mAdapter
                int r0 = r0.getCount()
                r1 = 1
                if (r0 <= 0) goto L1e
                androidx.appcompat.widget.ActivityChooserView r0 = r3.this$0
                r0.mIsSelectingDefaultActivity = r1
                androidx.appcompat.widget.ActivityChooserView r0 = r3.this$0
                androidx.appcompat.widget.ActivityChooserView r2 = r3.this$0
                int r2 = r2.mInitialActivityCount
                r0.showPopupUnchecked(r2)
            L1e:
                return r1
            L1f:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                r0.<init>()
                throw r0
        }
    }

    public static class InnerLayout extends android.widget.LinearLayout {
        private static final int[] TINT_ATTRS = null;

        static {
                r0 = 16842964(0x10100d4, float:2.3694152E-38)
                int[] r0 = new int[]{r0}
                androidx.appcompat.widget.ActivityChooserView.InnerLayout.TINT_ATTRS = r0
                return
        }

        public InnerLayout(android.content.Context r3, android.util.AttributeSet r4) {
                r2 = this;
                r2.<init>(r3, r4)
                int[] r0 = androidx.appcompat.widget.ActivityChooserView.InnerLayout.TINT_ATTRS
                androidx.appcompat.widget.TintTypedArray r0 = androidx.appcompat.widget.TintTypedArray.obtainStyledAttributes(r3, r4, r0)
                r1 = 0
                android.graphics.drawable.Drawable r1 = r0.getDrawable(r1)
                r2.setBackgroundDrawable(r1)
                r0.recycle()
                return
        }
    }

    public ActivityChooserView(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public ActivityChooserView(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public ActivityChooserView(android.content.Context r11, android.util.AttributeSet r12, int r13) {
            r10 = this;
            r10.<init>(r11, r12, r13)
            androidx.appcompat.widget.ActivityChooserView$1 r0 = new androidx.appcompat.widget.ActivityChooserView$1
            r0.<init>(r10)
            r10.mModelDataSetObserver = r0
            androidx.appcompat.widget.ActivityChooserView$2 r0 = new androidx.appcompat.widget.ActivityChooserView$2
            r0.<init>(r10)
            r10.mOnGlobalLayoutListener = r0
            r0 = 4
            r10.mInitialActivityCount = r0
            int[] r1 = androidx.appcompat.R.styleable.ActivityChooserView
            r2 = 0
            android.content.res.TypedArray r7 = r11.obtainStyledAttributes(r12, r1, r13, r2)
            int[] r5 = androidx.appcompat.R.styleable.ActivityChooserView
            r9 = 0
            r3 = r10
            r4 = r11
            r6 = r12
            r8 = r13
            androidx.core.view.ViewCompat.saveAttributeDataForStyleable(r3, r4, r5, r6, r7, r8, r9)
            int r11 = androidx.appcompat.R.styleable.ActivityChooserView_initialActivityCount
            int r11 = r7.getInt(r11, r0)
            r3.mInitialActivityCount = r11
            int r11 = androidx.appcompat.R.styleable.ActivityChooserView_expandActivityOverflowButtonDrawable
            android.graphics.drawable.Drawable r11 = r7.getDrawable(r11)
            r7.recycle()
            android.content.Context r12 = r10.getContext()
            android.view.LayoutInflater r12 = android.view.LayoutInflater.from(r12)
            int r13 = androidx.appcompat.R.layout.abc_activity_chooser_view
            r0 = 1
            r12.inflate(r13, r10, r0)
            androidx.appcompat.widget.ActivityChooserView$Callbacks r13 = new androidx.appcompat.widget.ActivityChooserView$Callbacks
            r13.<init>(r10)
            r3.mCallbacks = r13
            int r13 = androidx.appcompat.R.id.activity_chooser_view_content
            android.view.View r13 = r10.findViewById(r13)
            r3.mActivityChooserContent = r13
            android.view.View r13 = r3.mActivityChooserContent
            android.graphics.drawable.Drawable r13 = r13.getBackground()
            r3.mActivityChooserContentBackground = r13
            int r13 = androidx.appcompat.R.id.default_activity_button
            android.view.View r13 = r10.findViewById(r13)
            android.widget.FrameLayout r13 = (android.widget.FrameLayout) r13
            r3.mDefaultActivityButton = r13
            android.widget.FrameLayout r13 = r3.mDefaultActivityButton
            androidx.appcompat.widget.ActivityChooserView$Callbacks r0 = r3.mCallbacks
            r13.setOnClickListener(r0)
            android.widget.FrameLayout r13 = r3.mDefaultActivityButton
            androidx.appcompat.widget.ActivityChooserView$Callbacks r0 = r3.mCallbacks
            r13.setOnLongClickListener(r0)
            android.widget.FrameLayout r13 = r3.mDefaultActivityButton
            int r0 = androidx.appcompat.R.id.image
            android.view.View r13 = r13.findViewById(r0)
            android.widget.ImageView r13 = (android.widget.ImageView) r13
            r3.mDefaultActivityButtonImage = r13
            int r13 = androidx.appcompat.R.id.expand_activities_button
            android.view.View r13 = r10.findViewById(r13)
            android.widget.FrameLayout r13 = (android.widget.FrameLayout) r13
            androidx.appcompat.widget.ActivityChooserView$Callbacks r0 = r3.mCallbacks
            r13.setOnClickListener(r0)
            androidx.appcompat.widget.ActivityChooserView$3 r0 = new androidx.appcompat.widget.ActivityChooserView$3
            r0.<init>(r10)
            r13.setAccessibilityDelegate(r0)
            androidx.appcompat.widget.ActivityChooserView$4 r0 = new androidx.appcompat.widget.ActivityChooserView$4
            r0.<init>(r10, r13)
            r13.setOnTouchListener(r0)
            r3.mExpandActivityOverflowButton = r13
            int r0 = androidx.appcompat.R.id.image
            android.view.View r0 = r13.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r3.mExpandActivityOverflowButtonImage = r0
            android.widget.ImageView r0 = r3.mExpandActivityOverflowButtonImage
            r0.setImageDrawable(r11)
            androidx.appcompat.widget.ActivityChooserView$ActivityChooserViewAdapter r0 = new androidx.appcompat.widget.ActivityChooserView$ActivityChooserViewAdapter
            r0.<init>(r10)
            r3.mAdapter = r0
            androidx.appcompat.widget.ActivityChooserView$ActivityChooserViewAdapter r0 = r3.mAdapter
            androidx.appcompat.widget.ActivityChooserView$5 r1 = new androidx.appcompat.widget.ActivityChooserView$5
            r1.<init>(r10)
            r0.registerDataSetObserver(r1)
            android.content.res.Resources r0 = r4.getResources()
            android.util.DisplayMetrics r1 = r0.getDisplayMetrics()
            int r1 = r1.widthPixels
            int r1 = r1 / 2
            int r2 = androidx.appcompat.R.dimen.abc_config_prefDialogWidth
            int r2 = r0.getDimensionPixelSize(r2)
            int r1 = java.lang.Math.max(r1, r2)
            r3.mListPopupMaxWidth = r1
            return
    }

    public boolean dismissPopup() {
            r2 = this;
            boolean r0 = r2.isShowingPopup()
            if (r0 == 0) goto L1c
            androidx.appcompat.widget.ListPopupWindow r0 = r2.getListPopupWindow()
            r0.dismiss()
            android.view.ViewTreeObserver r0 = r2.getViewTreeObserver()
            boolean r1 = r0.isAlive()
            if (r1 == 0) goto L1c
            android.view.ViewTreeObserver$OnGlobalLayoutListener r1 = r2.mOnGlobalLayoutListener
            r0.removeGlobalOnLayoutListener(r1)
        L1c:
            r0 = 1
            return r0
    }

    public androidx.appcompat.widget.ActivityChooserModel getDataModel() {
            r1 = this;
            androidx.appcompat.widget.ActivityChooserView$ActivityChooserViewAdapter r0 = r1.mAdapter
            androidx.appcompat.widget.ActivityChooserModel r0 = r0.getDataModel()
            return r0
    }

    androidx.appcompat.widget.ListPopupWindow getListPopupWindow() {
            r2 = this;
            androidx.appcompat.widget.ListPopupWindow r0 = r2.mListPopupWindow
            if (r0 != 0) goto L2f
            androidx.appcompat.widget.ListPopupWindow r0 = new androidx.appcompat.widget.ListPopupWindow
            android.content.Context r1 = r2.getContext()
            r0.<init>(r1)
            r2.mListPopupWindow = r0
            androidx.appcompat.widget.ListPopupWindow r0 = r2.mListPopupWindow
            androidx.appcompat.widget.ActivityChooserView$ActivityChooserViewAdapter r1 = r2.mAdapter
            r0.setAdapter(r1)
            androidx.appcompat.widget.ListPopupWindow r0 = r2.mListPopupWindow
            r0.setAnchorView(r2)
            androidx.appcompat.widget.ListPopupWindow r0 = r2.mListPopupWindow
            r1 = 1
            r0.setModal(r1)
            androidx.appcompat.widget.ListPopupWindow r0 = r2.mListPopupWindow
            androidx.appcompat.widget.ActivityChooserView$Callbacks r1 = r2.mCallbacks
            r0.setOnItemClickListener(r1)
            androidx.appcompat.widget.ListPopupWindow r0 = r2.mListPopupWindow
            androidx.appcompat.widget.ActivityChooserView$Callbacks r1 = r2.mCallbacks
            r0.setOnDismissListener(r1)
        L2f:
            androidx.appcompat.widget.ListPopupWindow r0 = r2.mListPopupWindow
            return r0
    }

    public boolean isShowingPopup() {
            r1 = this;
            androidx.appcompat.widget.ListPopupWindow r0 = r1.getListPopupWindow()
            boolean r0 = r0.isShowing()
            return r0
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
            r2 = this;
            super.onAttachedToWindow()
            androidx.appcompat.widget.ActivityChooserView$ActivityChooserViewAdapter r0 = r2.mAdapter
            androidx.appcompat.widget.ActivityChooserModel r0 = r0.getDataModel()
            if (r0 == 0) goto L10
            android.database.DataSetObserver r1 = r2.mModelDataSetObserver
            r0.registerObserver(r1)
        L10:
            r1 = 1
            r2.mIsAttachedToWindow = r1
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
            r3 = this;
            super.onDetachedFromWindow()
            androidx.appcompat.widget.ActivityChooserView$ActivityChooserViewAdapter r0 = r3.mAdapter
            androidx.appcompat.widget.ActivityChooserModel r0 = r0.getDataModel()
            if (r0 == 0) goto L10
            android.database.DataSetObserver r1 = r3.mModelDataSetObserver
            r0.unregisterObserver(r1)
        L10:
            android.view.ViewTreeObserver r1 = r3.getViewTreeObserver()
            boolean r2 = r1.isAlive()
            if (r2 == 0) goto L1f
            android.view.ViewTreeObserver$OnGlobalLayoutListener r2 = r3.mOnGlobalLayoutListener
            r1.removeGlobalOnLayoutListener(r2)
        L1f:
            boolean r2 = r3.isShowingPopup()
            if (r2 == 0) goto L28
            r3.dismissPopup()
        L28:
            r2 = 0
            r3.mIsAttachedToWindow = r2
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean r5, int r6, int r7, int r8, int r9) {
            r4 = this;
            android.view.View r0 = r4.mActivityChooserContent
            int r1 = r8 - r6
            int r2 = r9 - r7
            r3 = 0
            r0.layout(r3, r3, r1, r2)
            boolean r0 = r4.isShowingPopup()
            if (r0 != 0) goto L13
            r4.dismissPopup()
        L13:
            return
    }

    @Override // android.view.View
    protected void onMeasure(int r4, int r5) {
            r3 = this;
            android.view.View r0 = r3.mActivityChooserContent
            android.widget.FrameLayout r1 = r3.mDefaultActivityButton
            int r1 = r1.getVisibility()
            if (r1 == 0) goto L14
            int r1 = android.view.View.MeasureSpec.getSize(r5)
            r2 = 1073741824(0x40000000, float:2.0)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r2)
        L14:
            r3.measureChild(r0, r4, r5)
            int r1 = r0.getMeasuredWidth()
            int r2 = r0.getMeasuredHeight()
            r3.setMeasuredDimension(r1, r2)
            return
    }

    @Override // androidx.appcompat.widget.ActivityChooserModel.ActivityChooserModelClient
    public void setActivityChooserModel(androidx.appcompat.widget.ActivityChooserModel r2) {
            r1 = this;
            androidx.appcompat.widget.ActivityChooserView$ActivityChooserViewAdapter r0 = r1.mAdapter
            r0.setDataModel(r2)
            boolean r0 = r1.isShowingPopup()
            if (r0 == 0) goto L11
            r1.dismissPopup()
            r1.showPopup()
        L11:
            return
    }

    public void setDefaultActionButtonContentDescription(int r1) {
            r0 = this;
            r0.mDefaultActionButtonContentDescription = r1
            return
    }

    public void setExpandActivityOverflowButtonContentDescription(int r3) {
            r2 = this;
            android.content.Context r0 = r2.getContext()
            java.lang.String r0 = r0.getString(r3)
            android.widget.ImageView r1 = r2.mExpandActivityOverflowButtonImage
            r1.setContentDescription(r0)
            return
    }

    public void setExpandActivityOverflowButtonDrawable(android.graphics.drawable.Drawable r2) {
            r1 = this;
            android.widget.ImageView r0 = r1.mExpandActivityOverflowButtonImage
            r0.setImageDrawable(r2)
            return
    }

    public void setInitialActivityCount(int r1) {
            r0 = this;
            r0.mInitialActivityCount = r1
            return
    }

    public void setOnDismissListener(android.widget.PopupWindow.OnDismissListener r1) {
            r0 = this;
            r0.mOnDismissListener = r1
            return
    }

    public void setProvider(androidx.core.view.ActionProvider r1) {
            r0 = this;
            r0.mProvider = r1
            return
    }

    public boolean showPopup() {
            r2 = this;
            boolean r0 = r2.isShowingPopup()
            r1 = 0
            if (r0 != 0) goto L15
            boolean r0 = r2.mIsAttachedToWindow
            if (r0 != 0) goto Lc
            goto L15
        Lc:
            r2.mIsSelectingDefaultActivity = r1
            int r0 = r2.mInitialActivityCount
            r2.showPopupUnchecked(r0)
            r0 = 1
            return r0
        L15:
            return r1
    }

    void showPopupUnchecked(int r10) {
            r9 = this;
            androidx.appcompat.widget.ActivityChooserView$ActivityChooserViewAdapter r0 = r9.mAdapter
            androidx.appcompat.widget.ActivityChooserModel r0 = r0.getDataModel()
            if (r0 == 0) goto L9e
            android.view.ViewTreeObserver r0 = r9.getViewTreeObserver()
            android.view.ViewTreeObserver$OnGlobalLayoutListener r1 = r9.mOnGlobalLayoutListener
            r0.addOnGlobalLayoutListener(r1)
            android.widget.FrameLayout r0 = r9.mDefaultActivityButton
            int r0 = r0.getVisibility()
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L1d
            r0 = r1
            goto L1e
        L1d:
            r0 = r2
        L1e:
            androidx.appcompat.widget.ActivityChooserView$ActivityChooserViewAdapter r3 = r9.mAdapter
            int r3 = r3.getActivityCount()
            if (r0 == 0) goto L28
            r4 = r1
            goto L29
        L28:
            r4 = r2
        L29:
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r10 == r5) goto L3f
            int r5 = r10 + r4
            if (r3 <= r5) goto L3f
            androidx.appcompat.widget.ActivityChooserView$ActivityChooserViewAdapter r5 = r9.mAdapter
            r5.setShowFooterView(r1)
            androidx.appcompat.widget.ActivityChooserView$ActivityChooserViewAdapter r5 = r9.mAdapter
            int r6 = r10 + (-1)
            r5.setMaxActivityCount(r6)
            goto L49
        L3f:
            androidx.appcompat.widget.ActivityChooserView$ActivityChooserViewAdapter r5 = r9.mAdapter
            r5.setShowFooterView(r2)
            androidx.appcompat.widget.ActivityChooserView$ActivityChooserViewAdapter r5 = r9.mAdapter
            r5.setMaxActivityCount(r10)
        L49:
            androidx.appcompat.widget.ListPopupWindow r5 = r9.getListPopupWindow()
            boolean r6 = r5.isShowing()
            if (r6 != 0) goto L9d
            boolean r6 = r9.mIsSelectingDefaultActivity
            if (r6 != 0) goto L60
            if (r0 != 0) goto L5a
            goto L60
        L5a:
            androidx.appcompat.widget.ActivityChooserView$ActivityChooserViewAdapter r6 = r9.mAdapter
            r6.setShowDefaultActivity(r2, r2)
            goto L65
        L60:
            androidx.appcompat.widget.ActivityChooserView$ActivityChooserViewAdapter r6 = r9.mAdapter
            r6.setShowDefaultActivity(r1, r0)
        L65:
            androidx.appcompat.widget.ActivityChooserView$ActivityChooserViewAdapter r6 = r9.mAdapter
            int r6 = r6.measureContentWidth()
            int r7 = r9.mListPopupMaxWidth
            int r6 = java.lang.Math.min(r6, r7)
            r5.setContentWidth(r6)
            r5.show()
            androidx.core.view.ActionProvider r7 = r9.mProvider
            if (r7 == 0) goto L80
            androidx.core.view.ActionProvider r7 = r9.mProvider
            r7.subUiVisibilityChanged(r1)
        L80:
            android.widget.ListView r1 = r5.getListView()
            android.content.Context r7 = r9.getContext()
            int r8 = androidx.appcompat.R.string.abc_activitychooserview_choose_application
            java.lang.String r7 = r7.getString(r8)
            r1.setContentDescription(r7)
            android.widget.ListView r1 = r5.getListView()
            android.graphics.drawable.ColorDrawable r7 = new android.graphics.drawable.ColorDrawable
            r7.<init>(r2)
            r1.setSelector(r7)
        L9d:
            return
        L9e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "No data model. Did you call #setDataModel?"
            r0.<init>(r1)
            throw r0
    }

    void updateAppearance() {
            r8 = this;
            androidx.appcompat.widget.ActivityChooserView$ActivityChooserViewAdapter r0 = r8.mAdapter
            int r0 = r0.getCount()
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto L10
            android.widget.FrameLayout r0 = r8.mExpandActivityOverflowButton
            r0.setEnabled(r2)
            goto L15
        L10:
            android.widget.FrameLayout r0 = r8.mExpandActivityOverflowButton
            r0.setEnabled(r1)
        L15:
            androidx.appcompat.widget.ActivityChooserView$ActivityChooserViewAdapter r0 = r8.mAdapter
            int r0 = r0.getActivityCount()
            androidx.appcompat.widget.ActivityChooserView$ActivityChooserViewAdapter r3 = r8.mAdapter
            int r3 = r3.getHistorySize()
            if (r0 == r2) goto L30
            if (r0 <= r2) goto L28
            if (r3 <= 0) goto L28
            goto L30
        L28:
            android.widget.FrameLayout r1 = r8.mDefaultActivityButton
            r2 = 8
            r1.setVisibility(r2)
            goto L68
        L30:
            android.widget.FrameLayout r2 = r8.mDefaultActivityButton
            r2.setVisibility(r1)
            androidx.appcompat.widget.ActivityChooserView$ActivityChooserViewAdapter r1 = r8.mAdapter
            android.content.pm.ResolveInfo r1 = r1.getDefaultActivity()
            android.content.Context r2 = r8.getContext()
            android.content.pm.PackageManager r2 = r2.getPackageManager()
            android.widget.ImageView r4 = r8.mDefaultActivityButtonImage
            android.graphics.drawable.Drawable r5 = r1.loadIcon(r2)
            r4.setImageDrawable(r5)
            int r4 = r8.mDefaultActionButtonContentDescription
            if (r4 == 0) goto L67
            java.lang.CharSequence r4 = r1.loadLabel(r2)
            android.content.Context r5 = r8.getContext()
            int r6 = r8.mDefaultActionButtonContentDescription
            java.lang.Object[] r7 = new java.lang.Object[]{r4}
            java.lang.String r5 = r5.getString(r6, r7)
            android.widget.FrameLayout r6 = r8.mDefaultActivityButton
            r6.setContentDescription(r5)
        L67:
        L68:
            android.widget.FrameLayout r1 = r8.mDefaultActivityButton
            int r1 = r1.getVisibility()
            if (r1 != 0) goto L78
            android.view.View r1 = r8.mActivityChooserContent
            android.graphics.drawable.Drawable r2 = r8.mActivityChooserContentBackground
            r1.setBackgroundDrawable(r2)
            goto L7e
        L78:
            android.view.View r1 = r8.mActivityChooserContent
            r2 = 0
            r1.setBackgroundDrawable(r2)
        L7e:
            return
    }
}
