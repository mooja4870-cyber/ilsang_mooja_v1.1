package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatSpinner extends android.widget.Spinner implements androidx.core.view.TintableBackgroundView {
    private static final int[] ATTRS_ANDROID_SPINNERMODE = null;
    private static final int MAX_ITEMS_MEASURED = 15;
    private static final int MODE_DIALOG = 0;
    private static final int MODE_DROPDOWN = 1;
    private static final int MODE_THEME = -1;
    private static final java.lang.String TAG = "AppCompatSpinner";
    private final androidx.appcompat.widget.AppCompatBackgroundHelper mBackgroundTintHelper;
    int mDropDownWidth;
    private androidx.appcompat.widget.ForwardingListener mForwardingListener;
    private androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup mPopup;
    private final android.content.Context mPopupContext;
    private final boolean mPopupSet;
    private android.widget.SpinnerAdapter mTempAdapter;
    final android.graphics.Rect mTempRect;



    private static final class Api23Impl {
        private Api23Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static void setDropDownViewTheme(android.widget.ThemedSpinnerAdapter r1, android.content.res.Resources.Theme r2) {
                android.content.res.Resources$Theme r0 = r1.getDropDownViewTheme()
                boolean r0 = androidx.core.util.ObjectsCompat.equals(r0, r2)
                if (r0 != 0) goto Ld
                r1.setDropDownViewTheme(r2)
            Ld:
                return
        }
    }

    class DialogPopup implements androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup, android.content.DialogInterface.OnClickListener {
        private android.widget.ListAdapter mListAdapter;
        androidx.appcompat.app.AlertDialog mPopup;
        private java.lang.CharSequence mPrompt;
        final /* synthetic */ androidx.appcompat.widget.AppCompatSpinner this$0;

        DialogPopup(androidx.appcompat.widget.AppCompatSpinner r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        public void dismiss() {
                r1 = this;
                androidx.appcompat.app.AlertDialog r0 = r1.mPopup
                if (r0 == 0) goto Lc
                androidx.appcompat.app.AlertDialog r0 = r1.mPopup
                r0.dismiss()
                r0 = 0
                r1.mPopup = r0
            Lc:
                return
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        public android.graphics.drawable.Drawable getBackground() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        public java.lang.CharSequence getHintText() {
                r1 = this;
                java.lang.CharSequence r0 = r1.mPrompt
                return r0
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        public int getHorizontalOffset() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        public int getHorizontalOriginalOffset() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        public int getVerticalOffset() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        public boolean isShowing() {
                r1 = this;
                androidx.appcompat.app.AlertDialog r0 = r1.mPopup
                if (r0 == 0) goto Lb
                androidx.appcompat.app.AlertDialog r0 = r1.mPopup
                boolean r0 = r0.isShowing()
                goto Lc
            Lb:
                r0 = 0
            Lc:
                return r0
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(android.content.DialogInterface r5, int r6) {
                r4 = this;
                androidx.appcompat.widget.AppCompatSpinner r0 = r4.this$0
                r0.setSelection(r6)
                androidx.appcompat.widget.AppCompatSpinner r0 = r4.this$0
                android.widget.AdapterView$OnItemClickListener r0 = r0.getOnItemClickListener()
                if (r0 == 0) goto L19
                androidx.appcompat.widget.AppCompatSpinner r0 = r4.this$0
                android.widget.ListAdapter r1 = r4.mListAdapter
                long r1 = r1.getItemId(r6)
                r3 = 0
                r0.performItemClick(r3, r6, r1)
            L19:
                r4.dismiss()
                return
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        public void setAdapter(android.widget.ListAdapter r1) {
                r0 = this;
                r0.mListAdapter = r1
                return
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        public void setBackgroundDrawable(android.graphics.drawable.Drawable r3) {
                r2 = this;
                java.lang.String r0 = "AppCompatSpinner"
                java.lang.String r1 = "Cannot set popup background for MODE_DIALOG, ignoring"
                android.util.Log.e(r0, r1)
                return
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        public void setHorizontalOffset(int r3) {
                r2 = this;
                java.lang.String r0 = "AppCompatSpinner"
                java.lang.String r1 = "Cannot set horizontal offset for MODE_DIALOG, ignoring"
                android.util.Log.e(r0, r1)
                return
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        public void setHorizontalOriginalOffset(int r3) {
                r2 = this;
                java.lang.String r0 = "AppCompatSpinner"
                java.lang.String r1 = "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring"
                android.util.Log.e(r0, r1)
                return
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        public void setPromptText(java.lang.CharSequence r1) {
                r0 = this;
                r0.mPrompt = r1
                return
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        public void setVerticalOffset(int r3) {
                r2 = this;
                java.lang.String r0 = "AppCompatSpinner"
                java.lang.String r1 = "Cannot set vertical offset for MODE_DIALOG, ignoring"
                android.util.Log.e(r0, r1)
                return
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        public void show(int r4, int r5) {
                r3 = this;
                android.widget.ListAdapter r0 = r3.mListAdapter
                if (r0 != 0) goto L5
                return
            L5:
                androidx.appcompat.app.AlertDialog$Builder r0 = new androidx.appcompat.app.AlertDialog$Builder
                androidx.appcompat.widget.AppCompatSpinner r1 = r3.this$0
                android.content.Context r1 = r1.getPopupContext()
                r0.<init>(r1)
                java.lang.CharSequence r1 = r3.mPrompt
                if (r1 == 0) goto L19
                java.lang.CharSequence r1 = r3.mPrompt
                r0.setTitle(r1)
            L19:
                android.widget.ListAdapter r1 = r3.mListAdapter
                androidx.appcompat.widget.AppCompatSpinner r2 = r3.this$0
                int r2 = r2.getSelectedItemPosition()
                androidx.appcompat.app.AlertDialog$Builder r1 = r0.setSingleChoiceItems(r1, r2, r3)
                androidx.appcompat.app.AlertDialog r1 = r1.create()
                r3.mPopup = r1
                androidx.appcompat.app.AlertDialog r1 = r3.mPopup
                android.widget.ListView r1 = r1.getListView()
                r1.setTextDirection(r4)
                r1.setTextAlignment(r5)
                androidx.appcompat.app.AlertDialog r2 = r3.mPopup
                r2.show()
                return
        }
    }

    private static class DropDownAdapter implements android.widget.ListAdapter, android.widget.SpinnerAdapter {
        private android.widget.SpinnerAdapter mAdapter;
        private android.widget.ListAdapter mListAdapter;

        public DropDownAdapter(android.widget.SpinnerAdapter r3, android.content.res.Resources.Theme r4) {
                r2 = this;
                r2.<init>()
                r2.mAdapter = r3
                boolean r0 = r3 instanceof android.widget.ListAdapter
                if (r0 == 0) goto Le
                r0 = r3
                android.widget.ListAdapter r0 = (android.widget.ListAdapter) r0
                r2.mListAdapter = r0
            Le:
                if (r4 == 0) goto L2d
                boolean r0 = r3 instanceof android.widget.ThemedSpinnerAdapter
                if (r0 == 0) goto L1b
                r0 = r3
                android.widget.ThemedSpinnerAdapter r0 = (android.widget.ThemedSpinnerAdapter) r0
                androidx.appcompat.widget.AppCompatSpinner.Api23Impl.setDropDownViewTheme(r0, r4)
                goto L2c
            L1b:
                boolean r0 = r3 instanceof androidx.appcompat.widget.ThemedSpinnerAdapter
                if (r0 == 0) goto L2c
                r0 = r3
                androidx.appcompat.widget.ThemedSpinnerAdapter r0 = (androidx.appcompat.widget.ThemedSpinnerAdapter) r0
                android.content.res.Resources$Theme r1 = r0.getDropDownViewTheme()
                if (r1 != 0) goto L2d
                r0.setDropDownViewTheme(r4)
                goto L2d
            L2c:
            L2d:
                return
        }

        @Override // android.widget.ListAdapter
        public boolean areAllItemsEnabled() {
                r2 = this;
                android.widget.ListAdapter r0 = r2.mListAdapter
                if (r0 == 0) goto L9
                boolean r1 = r0.areAllItemsEnabled()
                return r1
            L9:
                r1 = 1
                return r1
        }

        @Override // android.widget.Adapter
        public int getCount() {
                r1 = this;
                android.widget.SpinnerAdapter r0 = r1.mAdapter
                if (r0 != 0) goto L6
                r0 = 0
                goto Lc
            L6:
                android.widget.SpinnerAdapter r0 = r1.mAdapter
                int r0 = r0.getCount()
            Lc:
                return r0
        }

        @Override // android.widget.SpinnerAdapter
        public android.view.View getDropDownView(int r2, android.view.View r3, android.view.ViewGroup r4) {
                r1 = this;
                android.widget.SpinnerAdapter r0 = r1.mAdapter
                if (r0 != 0) goto L6
                r0 = 0
                goto Lc
            L6:
                android.widget.SpinnerAdapter r0 = r1.mAdapter
                android.view.View r0 = r0.getDropDownView(r2, r3, r4)
            Lc:
                return r0
        }

        @Override // android.widget.Adapter
        public java.lang.Object getItem(int r2) {
                r1 = this;
                android.widget.SpinnerAdapter r0 = r1.mAdapter
                if (r0 != 0) goto L6
                r0 = 0
                goto Lc
            L6:
                android.widget.SpinnerAdapter r0 = r1.mAdapter
                java.lang.Object r0 = r0.getItem(r2)
            Lc:
                return r0
        }

        @Override // android.widget.Adapter
        public long getItemId(int r3) {
                r2 = this;
                android.widget.SpinnerAdapter r0 = r2.mAdapter
                if (r0 != 0) goto L7
                r0 = -1
                goto Ld
            L7:
                android.widget.SpinnerAdapter r0 = r2.mAdapter
                long r0 = r0.getItemId(r3)
            Ld:
                return r0
        }

        @Override // android.widget.Adapter
        public int getItemViewType(int r2) {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // android.widget.Adapter
        public android.view.View getView(int r2, android.view.View r3, android.view.ViewGroup r4) {
                r1 = this;
                android.view.View r0 = r1.getDropDownView(r2, r3, r4)
                return r0
        }

        @Override // android.widget.Adapter
        public int getViewTypeCount() {
                r1 = this;
                r0 = 1
                return r0
        }

        @Override // android.widget.Adapter
        public boolean hasStableIds() {
                r1 = this;
                android.widget.SpinnerAdapter r0 = r1.mAdapter
                if (r0 == 0) goto Le
                android.widget.SpinnerAdapter r0 = r1.mAdapter
                boolean r0 = r0.hasStableIds()
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @Override // android.widget.Adapter
        public boolean isEmpty() {
                r1 = this;
                int r0 = r1.getCount()
                if (r0 != 0) goto L8
                r0 = 1
                goto L9
            L8:
                r0 = 0
            L9:
                return r0
        }

        @Override // android.widget.ListAdapter
        public boolean isEnabled(int r3) {
                r2 = this;
                android.widget.ListAdapter r0 = r2.mListAdapter
                if (r0 == 0) goto L9
                boolean r1 = r0.isEnabled(r3)
                return r1
            L9:
                r1 = 1
                return r1
        }

        @Override // android.widget.Adapter
        public void registerDataSetObserver(android.database.DataSetObserver r2) {
                r1 = this;
                android.widget.SpinnerAdapter r0 = r1.mAdapter
                if (r0 == 0) goto L9
                android.widget.SpinnerAdapter r0 = r1.mAdapter
                r0.registerDataSetObserver(r2)
            L9:
                return
        }

        @Override // android.widget.Adapter
        public void unregisterDataSetObserver(android.database.DataSetObserver r2) {
                r1 = this;
                android.widget.SpinnerAdapter r0 = r1.mAdapter
                if (r0 == 0) goto L9
                android.widget.SpinnerAdapter r0 = r1.mAdapter
                r0.unregisterDataSetObserver(r2)
            L9:
                return
        }
    }

    class DropdownPopup extends androidx.appcompat.widget.ListPopupWindow implements androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup {
        android.widget.ListAdapter mAdapter;
        private java.lang.CharSequence mHintText;
        private int mOriginalHorizontalOffset;
        private final android.graphics.Rect mVisibleRect;
        final /* synthetic */ androidx.appcompat.widget.AppCompatSpinner this$0;




        public DropdownPopup(androidx.appcompat.widget.AppCompatSpinner r2, android.content.Context r3, android.util.AttributeSet r4, int r5) {
                r1 = this;
                r1.this$0 = r2
                r1.<init>(r3, r4, r5)
                android.graphics.Rect r0 = new android.graphics.Rect
                r0.<init>()
                r1.mVisibleRect = r0
                r1.setAnchorView(r2)
                r0 = 1
                r1.setModal(r0)
                r0 = 0
                r1.setPromptPosition(r0)
                androidx.appcompat.widget.AppCompatSpinner$DropdownPopup$1 r0 = new androidx.appcompat.widget.AppCompatSpinner$DropdownPopup$1
                r0.<init>(r1, r2)
                r1.setOnItemClickListener(r0)
                return
        }

        static /* synthetic */ void access$001(androidx.appcompat.widget.AppCompatSpinner.DropdownPopup r0) {
                super.show()
                return
        }

        void computeContentWidth() {
                r8 = this;
                android.graphics.drawable.Drawable r0 = r8.getBackground()
                r1 = 0
                if (r0 == 0) goto L26
                androidx.appcompat.widget.AppCompatSpinner r2 = r8.this$0
                android.graphics.Rect r2 = r2.mTempRect
                r0.getPadding(r2)
                androidx.appcompat.widget.AppCompatSpinner r2 = r8.this$0
                boolean r2 = androidx.appcompat.widget.ViewUtils.isLayoutRtl(r2)
                if (r2 == 0) goto L1d
                androidx.appcompat.widget.AppCompatSpinner r2 = r8.this$0
                android.graphics.Rect r2 = r2.mTempRect
                int r2 = r2.right
                goto L24
            L1d:
                androidx.appcompat.widget.AppCompatSpinner r2 = r8.this$0
                android.graphics.Rect r2 = r2.mTempRect
                int r2 = r2.left
                int r2 = -r2
            L24:
                r1 = r2
                goto L33
            L26:
                androidx.appcompat.widget.AppCompatSpinner r2 = r8.this$0
                android.graphics.Rect r2 = r2.mTempRect
                androidx.appcompat.widget.AppCompatSpinner r3 = r8.this$0
                android.graphics.Rect r3 = r3.mTempRect
                r4 = 0
                r3.right = r4
                r2.left = r4
            L33:
                androidx.appcompat.widget.AppCompatSpinner r2 = r8.this$0
                int r2 = r2.getPaddingLeft()
                androidx.appcompat.widget.AppCompatSpinner r3 = r8.this$0
                int r3 = r3.getPaddingRight()
                androidx.appcompat.widget.AppCompatSpinner r4 = r8.this$0
                int r4 = r4.getWidth()
                androidx.appcompat.widget.AppCompatSpinner r5 = r8.this$0
                int r5 = r5.mDropDownWidth
                r6 = -2
                if (r5 != r6) goto L86
                androidx.appcompat.widget.AppCompatSpinner r5 = r8.this$0
                android.widget.ListAdapter r6 = r8.mAdapter
                android.widget.SpinnerAdapter r6 = (android.widget.SpinnerAdapter) r6
                android.graphics.drawable.Drawable r7 = r8.getBackground()
                int r5 = r5.compatMeasureContentWidth(r6, r7)
                androidx.appcompat.widget.AppCompatSpinner r6 = r8.this$0
                android.content.Context r6 = r6.getContext()
                android.content.res.Resources r6 = r6.getResources()
                android.util.DisplayMetrics r6 = r6.getDisplayMetrics()
                int r6 = r6.widthPixels
                androidx.appcompat.widget.AppCompatSpinner r7 = r8.this$0
                android.graphics.Rect r7 = r7.mTempRect
                int r7 = r7.left
                int r6 = r6 - r7
                androidx.appcompat.widget.AppCompatSpinner r7 = r8.this$0
                android.graphics.Rect r7 = r7.mTempRect
                int r7 = r7.right
                int r6 = r6 - r7
                if (r5 <= r6) goto L7b
                r5 = r6
            L7b:
                int r7 = r4 - r2
                int r7 = r7 - r3
                int r7 = java.lang.Math.max(r5, r7)
                r8.setContentWidth(r7)
                goto L9b
            L86:
                androidx.appcompat.widget.AppCompatSpinner r5 = r8.this$0
                int r5 = r5.mDropDownWidth
                r6 = -1
                if (r5 != r6) goto L94
                int r5 = r4 - r2
                int r5 = r5 - r3
                r8.setContentWidth(r5)
                goto L9b
            L94:
                androidx.appcompat.widget.AppCompatSpinner r5 = r8.this$0
                int r5 = r5.mDropDownWidth
                r8.setContentWidth(r5)
            L9b:
                androidx.appcompat.widget.AppCompatSpinner r5 = r8.this$0
                boolean r5 = androidx.appcompat.widget.ViewUtils.isLayoutRtl(r5)
                if (r5 == 0) goto Lb1
                int r5 = r4 - r3
                int r6 = r8.getWidth()
                int r5 = r5 - r6
                int r6 = r8.getHorizontalOriginalOffset()
                int r5 = r5 - r6
                int r1 = r1 + r5
                goto Lb7
            Lb1:
                int r5 = r8.getHorizontalOriginalOffset()
                int r5 = r5 + r2
                int r1 = r1 + r5
            Lb7:
                r8.setHorizontalOffset(r1)
                return
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        public java.lang.CharSequence getHintText() {
                r1 = this;
                java.lang.CharSequence r0 = r1.mHintText
                return r0
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        public int getHorizontalOriginalOffset() {
                r1 = this;
                int r0 = r1.mOriginalHorizontalOffset
                return r0
        }

        boolean isVisibleToUser(android.view.View r2) {
                r1 = this;
                boolean r0 = r2.isAttachedToWindow()
                if (r0 == 0) goto L10
                android.graphics.Rect r0 = r1.mVisibleRect
                boolean r0 = r2.getGlobalVisibleRect(r0)
                if (r0 == 0) goto L10
                r0 = 1
                goto L11
            L10:
                r0 = 0
            L11:
                return r0
        }

        @Override // androidx.appcompat.widget.ListPopupWindow, androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        public void setAdapter(android.widget.ListAdapter r1) {
                r0 = this;
                super.setAdapter(r1)
                r0.mAdapter = r1
                return
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        public void setHorizontalOriginalOffset(int r1) {
                r0 = this;
                r0.mOriginalHorizontalOffset = r1
                return
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        public void setPromptText(java.lang.CharSequence r1) {
                r0 = this;
                r0.mHintText = r1
                return
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        public void show(int r6, int r7) {
                r5 = this;
                boolean r0 = r5.isShowing()
                r5.computeContentWidth()
                r1 = 2
                r5.setInputMethodMode(r1)
                super.show()
                android.widget.ListView r1 = r5.getListView()
                r2 = 1
                r1.setChoiceMode(r2)
                r1.setTextDirection(r6)
                r1.setTextAlignment(r7)
                androidx.appcompat.widget.AppCompatSpinner r2 = r5.this$0
                int r2 = r2.getSelectedItemPosition()
                r5.setSelection(r2)
                if (r0 == 0) goto L28
                return
            L28:
                androidx.appcompat.widget.AppCompatSpinner r2 = r5.this$0
                android.view.ViewTreeObserver r2 = r2.getViewTreeObserver()
                if (r2 == 0) goto L40
                androidx.appcompat.widget.AppCompatSpinner$DropdownPopup$2 r3 = new androidx.appcompat.widget.AppCompatSpinner$DropdownPopup$2
                r3.<init>(r5)
                r2.addOnGlobalLayoutListener(r3)
                androidx.appcompat.widget.AppCompatSpinner$DropdownPopup$3 r4 = new androidx.appcompat.widget.AppCompatSpinner$DropdownPopup$3
                r4.<init>(r5, r3)
                r5.setOnDismissListener(r4)
            L40:
                return
        }
    }

    public final class InspectionCompanion implements android.view.inspector.InspectionCompanion<androidx.appcompat.widget.AppCompatSpinner> {
        private int mBackgroundTintId;
        private int mBackgroundTintModeId;
        private boolean mPropertiesMapped;

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
                java.lang.String r0 = "backgroundTint"
                int r1 = androidx.appcompat.R.attr.backgroundTint
                int r0 = r3.mapObject(r0, r1)
                r2.mBackgroundTintId = r0
                java.lang.String r0 = "backgroundTintMode"
                int r1 = androidx.appcompat.R.attr.backgroundTintMode
                int r0 = r3.mapObject(r0, r1)
                r2.mBackgroundTintModeId = r0
                r0 = 1
                r2.mPropertiesMapped = r0
                return
        }

        /* JADX INFO: renamed from: readProperties, reason: avoid collision after fix types in other method */
        public void readProperties2(androidx.appcompat.widget.AppCompatSpinner r3, android.view.inspector.PropertyReader r4) {
                r2 = this;
                boolean r0 = r2.mPropertiesMapped
                if (r0 == 0) goto L17
                int r0 = r2.mBackgroundTintId
                android.content.res.ColorStateList r1 = r3.getBackgroundTintList()
                r4.readObject(r0, r1)
                int r0 = r2.mBackgroundTintModeId
                android.graphics.PorterDuff$Mode r1 = r3.getBackgroundTintMode()
                r4.readObject(r0, r1)
                return
            L17:
                android.view.inspector.InspectionCompanion$UninitializedPropertyMapException r0 = new android.view.inspector.InspectionCompanion$UninitializedPropertyMapException
                r0.<init>()
                throw r0
        }

        @Override // android.view.inspector.InspectionCompanion
        public /* bridge */ /* synthetic */ void readProperties(androidx.appcompat.widget.AppCompatSpinner r1, android.view.inspector.PropertyReader r2) {
                r0 = this;
                androidx.appcompat.widget.AppCompatSpinner r1 = (androidx.appcompat.widget.AppCompatSpinner) r1
                r0.readProperties2(r1, r2)
                return
        }
    }

    static class SavedState extends android.view.View.BaseSavedState {
        public static final android.os.Parcelable.Creator<androidx.appcompat.widget.AppCompatSpinner.SavedState> CREATOR = null;
        boolean mShowDropdown;


        static {
                androidx.appcompat.widget.AppCompatSpinner$SavedState$1 r0 = new androidx.appcompat.widget.AppCompatSpinner$SavedState$1
                r0.<init>()
                androidx.appcompat.widget.AppCompatSpinner.SavedState.CREATOR = r0
                return
        }

        SavedState(android.os.Parcel r2) {
                r1 = this;
                r1.<init>(r2)
                byte r0 = r2.readByte()
                if (r0 == 0) goto Lb
                r0 = 1
                goto Lc
            Lb:
                r0 = 0
            Lc:
                r1.mShowDropdown = r0
                return
        }

        SavedState(android.os.Parcelable r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(android.os.Parcel r2, int r3) {
                r1 = this;
                super.writeToParcel(r2, r3)
                boolean r0 = r1.mShowDropdown
                byte r0 = (byte) r0
                r2.writeByte(r0)
                return
        }
    }

    interface SpinnerPopup {
        void dismiss();

        android.graphics.drawable.Drawable getBackground();

        java.lang.CharSequence getHintText();

        int getHorizontalOffset();

        int getHorizontalOriginalOffset();

        int getVerticalOffset();

        boolean isShowing();

        void setAdapter(android.widget.ListAdapter r1);

        void setBackgroundDrawable(android.graphics.drawable.Drawable r1);

        void setHorizontalOffset(int r1);

        void setHorizontalOriginalOffset(int r1);

        void setPromptText(java.lang.CharSequence r1);

        void setVerticalOffset(int r1);

        void show(int r1, int r2);
    }

    static {
            r0 = 16843505(0x10102f1, float:2.3695668E-38)
            int[] r0 = new int[]{r0}
            androidx.appcompat.widget.AppCompatSpinner.ATTRS_ANDROID_SPINNERMODE = r0
            return
    }

    public AppCompatSpinner(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public AppCompatSpinner(android.content.Context r3, int r4) {
            r2 = this;
            r0 = 0
            int r1 = androidx.appcompat.R.attr.spinnerStyle
            r2.<init>(r3, r0, r1, r4)
            return
    }

    public AppCompatSpinner(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            int r0 = androidx.appcompat.R.attr.spinnerStyle
            r1.<init>(r2, r3, r0)
            return
    }

    public AppCompatSpinner(android.content.Context r2, android.util.AttributeSet r3, int r4) {
            r1 = this;
            r0 = -1
            r1.<init>(r2, r3, r4, r0)
            return
    }

    public AppCompatSpinner(android.content.Context r7, android.util.AttributeSet r8, int r9, int r10) {
            r6 = this;
            r5 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    public AppCompatSpinner(android.content.Context r7, android.util.AttributeSet r8, int r9, int r10, android.content.res.Resources.Theme r11) {
            r6 = this;
            r6.<init>(r7, r8, r9)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r6.mTempRect = r0
            android.content.Context r0 = r6.getContext()
            androidx.appcompat.widget.ThemeUtils.checkAppCompatTheme(r6, r0)
            int[] r0 = androidx.appcompat.R.styleable.Spinner
            r1 = 0
            androidx.appcompat.widget.TintTypedArray r0 = androidx.appcompat.widget.TintTypedArray.obtainStyledAttributes(r7, r8, r0, r9, r1)
            androidx.appcompat.widget.AppCompatBackgroundHelper r2 = new androidx.appcompat.widget.AppCompatBackgroundHelper
            r2.<init>(r6)
            r6.mBackgroundTintHelper = r2
            if (r11 == 0) goto L29
            androidx.appcompat.view.ContextThemeWrapper r2 = new androidx.appcompat.view.ContextThemeWrapper
            r2.<init>(r7, r11)
            r6.mPopupContext = r2
            goto L3b
        L29:
            int r2 = androidx.appcompat.R.styleable.Spinner_popupTheme
            int r2 = r0.getResourceId(r2, r1)
            if (r2 == 0) goto L39
            androidx.appcompat.view.ContextThemeWrapper r3 = new androidx.appcompat.view.ContextThemeWrapper
            r3.<init>(r7, r2)
            r6.mPopupContext = r3
            goto L3b
        L39:
            r6.mPopupContext = r7
        L3b:
            r2 = -1
            if (r10 != r2) goto L6b
            r2 = 0
            int[] r3 = androidx.appcompat.widget.AppCompatSpinner.ATTRS_ANDROID_SPINNERMODE     // Catch: java.lang.Throwable -> L57 java.lang.Exception -> L59
            android.content.res.TypedArray r3 = r7.obtainStyledAttributes(r8, r3, r9, r1)     // Catch: java.lang.Throwable -> L57 java.lang.Exception -> L59
            r2 = r3
            boolean r3 = r2.hasValue(r1)     // Catch: java.lang.Throwable -> L57 java.lang.Exception -> L59
            if (r3 == 0) goto L51
            int r3 = r2.getInt(r1, r1)     // Catch: java.lang.Throwable -> L57 java.lang.Exception -> L59
            r10 = r3
        L51:
            if (r2 == 0) goto L6b
        L53:
            r2.recycle()
            goto L6b
        L57:
            r1 = move-exception
            goto L65
        L59:
            r3 = move-exception
            java.lang.String r4 = "AppCompatSpinner"
            java.lang.String r5 = "Could not read android:spinnerMode"
            android.util.Log.i(r4, r5, r3)     // Catch: java.lang.Throwable -> L57
            if (r2 == 0) goto L6b
            goto L53
        L65:
            if (r2 == 0) goto L6a
            r2.recycle()
        L6a:
            throw r1
        L6b:
            switch(r10) {
                case 0: goto La6;
                case 1: goto L6f;
                default: goto L6e;
            }
        L6e:
            goto Lb9
        L6f:
            androidx.appcompat.widget.AppCompatSpinner$DropdownPopup r2 = new androidx.appcompat.widget.AppCompatSpinner$DropdownPopup
            android.content.Context r3 = r6.mPopupContext
            r2.<init>(r6, r3, r8, r9)
            android.content.Context r3 = r6.mPopupContext
            int[] r4 = androidx.appcompat.R.styleable.Spinner
            androidx.appcompat.widget.TintTypedArray r1 = androidx.appcompat.widget.TintTypedArray.obtainStyledAttributes(r3, r8, r4, r9, r1)
            int r3 = androidx.appcompat.R.styleable.Spinner_android_dropDownWidth
            r4 = -2
            int r3 = r1.getLayoutDimension(r3, r4)
            r6.mDropDownWidth = r3
            int r3 = androidx.appcompat.R.styleable.Spinner_android_popupBackground
            android.graphics.drawable.Drawable r3 = r1.getDrawable(r3)
            r2.setBackgroundDrawable(r3)
            int r3 = androidx.appcompat.R.styleable.Spinner_android_prompt
            java.lang.String r3 = r0.getString(r3)
            r2.setPromptText(r3)
            r1.recycle()
            r6.mPopup = r2
            androidx.appcompat.widget.AppCompatSpinner$1 r3 = new androidx.appcompat.widget.AppCompatSpinner$1
            r3.<init>(r6, r6, r2)
            r6.mForwardingListener = r3
            goto Lb9
        La6:
            androidx.appcompat.widget.AppCompatSpinner$DialogPopup r1 = new androidx.appcompat.widget.AppCompatSpinner$DialogPopup
            r1.<init>(r6)
            r6.mPopup = r1
            androidx.appcompat.widget.AppCompatSpinner$SpinnerPopup r1 = r6.mPopup
            int r2 = androidx.appcompat.R.styleable.Spinner_android_prompt
            java.lang.String r2 = r0.getString(r2)
            r1.setPromptText(r2)
        Lb9:
            int r1 = androidx.appcompat.R.styleable.Spinner_android_entries
            java.lang.CharSequence[] r1 = r0.getTextArray(r1)
            if (r1 == 0) goto Ld1
            android.widget.ArrayAdapter r2 = new android.widget.ArrayAdapter
            r3 = 17367048(0x1090008, float:2.5162948E-38)
            r2.<init>(r7, r3, r1)
            int r3 = androidx.appcompat.R.layout.support_simple_spinner_dropdown_item
            r2.setDropDownViewResource(r3)
            r6.setAdapter(r2)
        Ld1:
            r0.recycle()
            r2 = 1
            r6.mPopupSet = r2
            android.widget.SpinnerAdapter r2 = r6.mTempAdapter
            if (r2 == 0) goto Le3
            android.widget.SpinnerAdapter r2 = r6.mTempAdapter
            r6.setAdapter(r2)
            r2 = 0
            r6.mTempAdapter = r2
        Le3:
            androidx.appcompat.widget.AppCompatBackgroundHelper r2 = r6.mBackgroundTintHelper
            r2.loadFromAttributes(r8, r9)
            return
    }

    int compatMeasureContentWidth(android.widget.SpinnerAdapter r13, android.graphics.drawable.Drawable r14) {
            r12 = this;
            r0 = 0
            if (r13 != 0) goto L4
            return r0
        L4:
            r1 = 0
            r2 = 0
            r3 = 0
            int r4 = r12.getMeasuredWidth()
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r0)
            int r5 = r12.getMeasuredHeight()
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r0)
            int r6 = r12.getSelectedItemPosition()
            int r6 = java.lang.Math.max(r0, r6)
            int r7 = r13.getCount()
            int r8 = r6 + 15
            int r7 = java.lang.Math.min(r7, r8)
            int r8 = r7 - r6
            int r9 = 15 - r8
            int r9 = r6 - r9
            int r0 = java.lang.Math.max(r0, r9)
            r6 = r0
        L36:
            if (r6 >= r7) goto L61
            int r9 = r13.getItemViewType(r6)
            if (r9 == r3) goto L40
            r3 = r9
            r2 = 0
        L40:
            android.view.View r2 = r13.getView(r6, r2, r12)
            android.view.ViewGroup$LayoutParams r10 = r2.getLayoutParams()
            if (r10 != 0) goto L53
            android.view.ViewGroup$LayoutParams r10 = new android.view.ViewGroup$LayoutParams
            r11 = -2
            r10.<init>(r11, r11)
            r2.setLayoutParams(r10)
        L53:
            r2.measure(r4, r5)
            int r10 = r2.getMeasuredWidth()
            int r1 = java.lang.Math.max(r1, r10)
            int r6 = r6 + 1
            goto L36
        L61:
            if (r14 == 0) goto L72
            android.graphics.Rect r6 = r12.mTempRect
            r14.getPadding(r6)
            android.graphics.Rect r6 = r12.mTempRect
            int r6 = r6.left
            android.graphics.Rect r9 = r12.mTempRect
            int r9 = r9.right
            int r6 = r6 + r9
            int r1 = r1 + r6
        L72:
            return r1
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
            r1 = this;
            super.drawableStateChanged()
            androidx.appcompat.widget.AppCompatBackgroundHelper r0 = r1.mBackgroundTintHelper
            if (r0 == 0) goto Lc
            androidx.appcompat.widget.AppCompatBackgroundHelper r0 = r1.mBackgroundTintHelper
            r0.applySupportBackgroundTint()
        Lc:
            return
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
            r1 = this;
            androidx.appcompat.widget.AppCompatSpinner$SpinnerPopup r0 = r1.mPopup
            if (r0 == 0) goto Lb
            androidx.appcompat.widget.AppCompatSpinner$SpinnerPopup r0 = r1.mPopup
            int r0 = r0.getHorizontalOffset()
            return r0
        Lb:
            int r0 = super.getDropDownHorizontalOffset()
            return r0
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
            r1 = this;
            androidx.appcompat.widget.AppCompatSpinner$SpinnerPopup r0 = r1.mPopup
            if (r0 == 0) goto Lb
            androidx.appcompat.widget.AppCompatSpinner$SpinnerPopup r0 = r1.mPopup
            int r0 = r0.getVerticalOffset()
            return r0
        Lb:
            int r0 = super.getDropDownVerticalOffset()
            return r0
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
            r1 = this;
            androidx.appcompat.widget.AppCompatSpinner$SpinnerPopup r0 = r1.mPopup
            if (r0 == 0) goto L7
            int r0 = r1.mDropDownWidth
            return r0
        L7:
            int r0 = super.getDropDownWidth()
            return r0
    }

    final androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup getInternalPopup() {
            r1 = this;
            androidx.appcompat.widget.AppCompatSpinner$SpinnerPopup r0 = r1.mPopup
            return r0
    }

    @Override // android.widget.Spinner
    public android.graphics.drawable.Drawable getPopupBackground() {
            r1 = this;
            androidx.appcompat.widget.AppCompatSpinner$SpinnerPopup r0 = r1.mPopup
            if (r0 == 0) goto Lb
            androidx.appcompat.widget.AppCompatSpinner$SpinnerPopup r0 = r1.mPopup
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            return r0
        Lb:
            android.graphics.drawable.Drawable r0 = super.getPopupBackground()
            return r0
    }

    @Override // android.widget.Spinner
    public android.content.Context getPopupContext() {
            r1 = this;
            android.content.Context r0 = r1.mPopupContext
            return r0
    }

    @Override // android.widget.Spinner
    public java.lang.CharSequence getPrompt() {
            r1 = this;
            androidx.appcompat.widget.AppCompatSpinner$SpinnerPopup r0 = r1.mPopup
            if (r0 == 0) goto Lb
            androidx.appcompat.widget.AppCompatSpinner$SpinnerPopup r0 = r1.mPopup
            java.lang.CharSequence r0 = r0.getHintText()
            goto Lf
        Lb:
            java.lang.CharSequence r0 = super.getPrompt()
        Lf:
            return r0
    }

    @Override // androidx.core.view.TintableBackgroundView
    public android.content.res.ColorStateList getSupportBackgroundTintList() {
            r1 = this;
            androidx.appcompat.widget.AppCompatBackgroundHelper r0 = r1.mBackgroundTintHelper
            if (r0 == 0) goto Lb
            androidx.appcompat.widget.AppCompatBackgroundHelper r0 = r1.mBackgroundTintHelper
            android.content.res.ColorStateList r0 = r0.getSupportBackgroundTintList()
            goto Lc
        Lb:
            r0 = 0
        Lc:
            return r0
    }

    @Override // androidx.core.view.TintableBackgroundView
    public android.graphics.PorterDuff.Mode getSupportBackgroundTintMode() {
            r1 = this;
            androidx.appcompat.widget.AppCompatBackgroundHelper r0 = r1.mBackgroundTintHelper
            if (r0 == 0) goto Lb
            androidx.appcompat.widget.AppCompatBackgroundHelper r0 = r1.mBackgroundTintHelper
            android.graphics.PorterDuff$Mode r0 = r0.getSupportBackgroundTintMode()
            goto Lc
        Lb:
            r0 = 0
        Lc:
            return r0
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
            r1 = this;
            super.onDetachedFromWindow()
            androidx.appcompat.widget.AppCompatSpinner$SpinnerPopup r0 = r1.mPopup
            if (r0 == 0) goto L14
            androidx.appcompat.widget.AppCompatSpinner$SpinnerPopup r0 = r1.mPopup
            boolean r0 = r0.isShowing()
            if (r0 == 0) goto L14
            androidx.appcompat.widget.AppCompatSpinner$SpinnerPopup r0 = r1.mPopup
            r0.dismiss()
        L14:
            return
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    protected void onMeasure(int r4, int r5) {
            r3 = this;
            super.onMeasure(r4, r5)
            androidx.appcompat.widget.AppCompatSpinner$SpinnerPopup r0 = r3.mPopup
            if (r0 == 0) goto L33
            int r0 = android.view.View.MeasureSpec.getMode(r4)
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != r1) goto L33
            int r0 = r3.getMeasuredWidth()
            android.widget.SpinnerAdapter r1 = r3.getAdapter()
            android.graphics.drawable.Drawable r2 = r3.getBackground()
            int r1 = r3.compatMeasureContentWidth(r1, r2)
            int r1 = java.lang.Math.max(r0, r1)
            int r2 = android.view.View.MeasureSpec.getSize(r4)
            int r1 = java.lang.Math.min(r1, r2)
            int r2 = r3.getMeasuredHeight()
            r3.setMeasuredDimension(r1, r2)
        L33:
            return
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public void onRestoreInstanceState(android.os.Parcelable r4) {
            r3 = this;
            r0 = r4
            androidx.appcompat.widget.AppCompatSpinner$SavedState r0 = (androidx.appcompat.widget.AppCompatSpinner.SavedState) r0
            android.os.Parcelable r1 = r0.getSuperState()
            super.onRestoreInstanceState(r1)
            boolean r1 = r0.mShowDropdown
            if (r1 == 0) goto L1c
            android.view.ViewTreeObserver r1 = r3.getViewTreeObserver()
            if (r1 == 0) goto L1c
            androidx.appcompat.widget.AppCompatSpinner$2 r2 = new androidx.appcompat.widget.AppCompatSpinner$2
            r2.<init>(r3)
            r1.addOnGlobalLayoutListener(r2)
        L1c:
            return
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public android.os.Parcelable onSaveInstanceState() {
            r2 = this;
            androidx.appcompat.widget.AppCompatSpinner$SavedState r0 = new androidx.appcompat.widget.AppCompatSpinner$SavedState
            android.os.Parcelable r1 = super.onSaveInstanceState()
            r0.<init>(r1)
            androidx.appcompat.widget.AppCompatSpinner$SpinnerPopup r1 = r2.mPopup
            if (r1 == 0) goto L17
            androidx.appcompat.widget.AppCompatSpinner$SpinnerPopup r1 = r2.mPopup
            boolean r1 = r1.isShowing()
            if (r1 == 0) goto L17
            r1 = 1
            goto L18
        L17:
            r1 = 0
        L18:
            r0.mShowDropdown = r1
            return r0
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean onTouchEvent(android.view.MotionEvent r2) {
            r1 = this;
            androidx.appcompat.widget.ForwardingListener r0 = r1.mForwardingListener
            if (r0 == 0) goto Le
            androidx.appcompat.widget.ForwardingListener r0 = r1.mForwardingListener
            boolean r0 = r0.onTouch(r1, r2)
            if (r0 == 0) goto Le
            r0 = 1
            return r0
        Le:
            boolean r0 = super.onTouchEvent(r2)
            return r0
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean performClick() {
            r1 = this;
            androidx.appcompat.widget.AppCompatSpinner$SpinnerPopup r0 = r1.mPopup
            if (r0 == 0) goto L11
            androidx.appcompat.widget.AppCompatSpinner$SpinnerPopup r0 = r1.mPopup
            boolean r0 = r0.isShowing()
            if (r0 != 0) goto Lf
            r1.showPopup()
        Lf:
            r0 = 1
            return r0
        L11:
            boolean r0 = super.performClick()
            return r0
    }

    @Override // android.widget.AdapterView
    public /* bridge */ /* synthetic */ void setAdapter(android.widget.Adapter r1) {
            r0 = this;
            android.widget.SpinnerAdapter r1 = (android.widget.SpinnerAdapter) r1
            r0.setAdapter(r1)
            return
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner
    public void setAdapter(android.widget.SpinnerAdapter r5) {
            r4 = this;
            boolean r0 = r4.mPopupSet
            if (r0 != 0) goto L7
            r4.mTempAdapter = r5
            return
        L7:
            super.setAdapter(r5)
            androidx.appcompat.widget.AppCompatSpinner$SpinnerPopup r0 = r4.mPopup
            if (r0 == 0) goto L27
            android.content.Context r0 = r4.mPopupContext
            if (r0 != 0) goto L17
            android.content.Context r0 = r4.getContext()
            goto L19
        L17:
            android.content.Context r0 = r4.mPopupContext
        L19:
            androidx.appcompat.widget.AppCompatSpinner$SpinnerPopup r1 = r4.mPopup
            androidx.appcompat.widget.AppCompatSpinner$DropDownAdapter r2 = new androidx.appcompat.widget.AppCompatSpinner$DropDownAdapter
            android.content.res.Resources$Theme r3 = r0.getTheme()
            r2.<init>(r5, r3)
            r1.setAdapter(r2)
        L27:
            return
    }

    @Override // android.view.View
    public void setBackgroundDrawable(android.graphics.drawable.Drawable r2) {
            r1 = this;
            super.setBackgroundDrawable(r2)
            androidx.appcompat.widget.AppCompatBackgroundHelper r0 = r1.mBackgroundTintHelper
            if (r0 == 0) goto Lc
            androidx.appcompat.widget.AppCompatBackgroundHelper r0 = r1.mBackgroundTintHelper
            r0.onSetBackgroundDrawable(r2)
        Lc:
            return
    }

    @Override // android.view.View
    public void setBackgroundResource(int r2) {
            r1 = this;
            super.setBackgroundResource(r2)
            androidx.appcompat.widget.AppCompatBackgroundHelper r0 = r1.mBackgroundTintHelper
            if (r0 == 0) goto Lc
            androidx.appcompat.widget.AppCompatBackgroundHelper r0 = r1.mBackgroundTintHelper
            r0.onSetBackgroundResource(r2)
        Lc:
            return
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int r2) {
            r1 = this;
            androidx.appcompat.widget.AppCompatSpinner$SpinnerPopup r0 = r1.mPopup
            if (r0 == 0) goto Lf
            androidx.appcompat.widget.AppCompatSpinner$SpinnerPopup r0 = r1.mPopup
            r0.setHorizontalOriginalOffset(r2)
            androidx.appcompat.widget.AppCompatSpinner$SpinnerPopup r0 = r1.mPopup
            r0.setHorizontalOffset(r2)
            goto L12
        Lf:
            super.setDropDownHorizontalOffset(r2)
        L12:
            return
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int r2) {
            r1 = this;
            androidx.appcompat.widget.AppCompatSpinner$SpinnerPopup r0 = r1.mPopup
            if (r0 == 0) goto La
            androidx.appcompat.widget.AppCompatSpinner$SpinnerPopup r0 = r1.mPopup
            r0.setVerticalOffset(r2)
            goto Ld
        La:
            super.setDropDownVerticalOffset(r2)
        Ld:
            return
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int r2) {
            r1 = this;
            androidx.appcompat.widget.AppCompatSpinner$SpinnerPopup r0 = r1.mPopup
            if (r0 == 0) goto L7
            r1.mDropDownWidth = r2
            goto La
        L7:
            super.setDropDownWidth(r2)
        La:
            return
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(android.graphics.drawable.Drawable r2) {
            r1 = this;
            androidx.appcompat.widget.AppCompatSpinner$SpinnerPopup r0 = r1.mPopup
            if (r0 == 0) goto La
            androidx.appcompat.widget.AppCompatSpinner$SpinnerPopup r0 = r1.mPopup
            r0.setBackgroundDrawable(r2)
            goto Ld
        La:
            super.setPopupBackgroundDrawable(r2)
        Ld:
            return
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int r2) {
            r1 = this;
            android.content.Context r0 = r1.getPopupContext()
            android.graphics.drawable.Drawable r0 = androidx.appcompat.content.res.AppCompatResources.getDrawable(r0, r2)
            r1.setPopupBackgroundDrawable(r0)
            return
    }

    @Override // android.widget.Spinner
    public void setPrompt(java.lang.CharSequence r2) {
            r1 = this;
            androidx.appcompat.widget.AppCompatSpinner$SpinnerPopup r0 = r1.mPopup
            if (r0 == 0) goto La
            androidx.appcompat.widget.AppCompatSpinner$SpinnerPopup r0 = r1.mPopup
            r0.setPromptText(r2)
            goto Ld
        La:
            super.setPrompt(r2)
        Ld:
            return
    }

    @Override // androidx.core.view.TintableBackgroundView
    public void setSupportBackgroundTintList(android.content.res.ColorStateList r2) {
            r1 = this;
            androidx.appcompat.widget.AppCompatBackgroundHelper r0 = r1.mBackgroundTintHelper
            if (r0 == 0) goto L9
            androidx.appcompat.widget.AppCompatBackgroundHelper r0 = r1.mBackgroundTintHelper
            r0.setSupportBackgroundTintList(r2)
        L9:
            return
    }

    @Override // androidx.core.view.TintableBackgroundView
    public void setSupportBackgroundTintMode(android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            androidx.appcompat.widget.AppCompatBackgroundHelper r0 = r1.mBackgroundTintHelper
            if (r0 == 0) goto L9
            androidx.appcompat.widget.AppCompatBackgroundHelper r0 = r1.mBackgroundTintHelper
            r0.setSupportBackgroundTintMode(r2)
        L9:
            return
    }

    void showPopup() {
            r3 = this;
            androidx.appcompat.widget.AppCompatSpinner$SpinnerPopup r0 = r3.mPopup
            int r1 = r3.getTextDirection()
            int r2 = r3.getTextAlignment()
            r0.show(r1, r2)
            return
    }
}
