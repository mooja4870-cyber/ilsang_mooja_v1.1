package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatButton extends android.widget.Button implements androidx.core.view.TintableBackgroundView, androidx.core.widget.AutoSizeableTextView, androidx.core.widget.TintableCompoundDrawablesView, androidx.appcompat.widget.EmojiCompatConfigurationView {
    private androidx.appcompat.widget.AppCompatEmojiTextHelper mAppCompatEmojiTextHelper;
    private final androidx.appcompat.widget.AppCompatBackgroundHelper mBackgroundTintHelper;
    private final androidx.appcompat.widget.AppCompatTextHelper mTextHelper;

    public final class InspectionCompanion implements android.view.inspector.InspectionCompanion<androidx.appcompat.widget.AppCompatButton> {
        private int mAutoSizeMaxTextSizeId;
        private int mAutoSizeMinTextSizeId;
        private int mAutoSizeStepGranularityId;
        private int mAutoSizeTextTypeId;
        private int mBackgroundTintId;
        private int mBackgroundTintModeId;
        private int mDrawableTintId;
        private int mDrawableTintModeId;
        private boolean mPropertiesMapped;


        public InspectionCompanion() {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.mPropertiesMapped = r0
                return
        }

        @Override // android.view.inspector.InspectionCompanion
        public void mapProperties(android.view.inspector.PropertyMapper r4) {
                r3 = this;
                java.lang.String r0 = "autoSizeMaxTextSize"
                int r1 = androidx.appcompat.R.attr.autoSizeMaxTextSize
                int r0 = r4.mapInt(r0, r1)
                r3.mAutoSizeMaxTextSizeId = r0
                java.lang.String r0 = "autoSizeMinTextSize"
                int r1 = androidx.appcompat.R.attr.autoSizeMinTextSize
                int r0 = r4.mapInt(r0, r1)
                r3.mAutoSizeMinTextSizeId = r0
                java.lang.String r0 = "autoSizeStepGranularity"
                int r1 = androidx.appcompat.R.attr.autoSizeStepGranularity
                int r0 = r4.mapInt(r0, r1)
                r3.mAutoSizeStepGranularityId = r0
                int r0 = androidx.appcompat.R.attr.autoSizeTextType
                androidx.appcompat.widget.AppCompatButton$InspectionCompanion$1 r1 = new androidx.appcompat.widget.AppCompatButton$InspectionCompanion$1
                r1.<init>(r3)
                java.lang.String r2 = "autoSizeTextType"
                int r0 = r4.mapIntEnum(r2, r0, r1)
                r3.mAutoSizeTextTypeId = r0
                java.lang.String r0 = "backgroundTint"
                int r1 = androidx.appcompat.R.attr.backgroundTint
                int r0 = r4.mapObject(r0, r1)
                r3.mBackgroundTintId = r0
                java.lang.String r0 = "backgroundTintMode"
                int r1 = androidx.appcompat.R.attr.backgroundTintMode
                int r0 = r4.mapObject(r0, r1)
                r3.mBackgroundTintModeId = r0
                java.lang.String r0 = "drawableTint"
                int r1 = androidx.appcompat.R.attr.drawableTint
                int r0 = r4.mapObject(r0, r1)
                r3.mDrawableTintId = r0
                java.lang.String r0 = "drawableTintMode"
                int r1 = androidx.appcompat.R.attr.drawableTintMode
                int r0 = r4.mapObject(r0, r1)
                r3.mDrawableTintModeId = r0
                r0 = 1
                r3.mPropertiesMapped = r0
                return
        }

        /* JADX INFO: renamed from: readProperties, reason: avoid collision after fix types in other method */
        public void readProperties2(androidx.appcompat.widget.AppCompatButton r3, android.view.inspector.PropertyReader r4) {
                r2 = this;
                boolean r0 = r2.mPropertiesMapped
                if (r0 == 0) goto L4d
                int r0 = r2.mAutoSizeMaxTextSizeId
                int r1 = r3.getAutoSizeMaxTextSize()
                r4.readInt(r0, r1)
                int r0 = r2.mAutoSizeMinTextSizeId
                int r1 = r3.getAutoSizeMinTextSize()
                r4.readInt(r0, r1)
                int r0 = r2.mAutoSizeStepGranularityId
                int r1 = r3.getAutoSizeStepGranularity()
                r4.readInt(r0, r1)
                int r0 = r2.mAutoSizeTextTypeId
                int r1 = r3.getAutoSizeTextType()
                r4.readIntEnum(r0, r1)
                int r0 = r2.mBackgroundTintId
                android.content.res.ColorStateList r1 = r3.getBackgroundTintList()
                r4.readObject(r0, r1)
                int r0 = r2.mBackgroundTintModeId
                android.graphics.PorterDuff$Mode r1 = r3.getBackgroundTintMode()
                r4.readObject(r0, r1)
                int r0 = r2.mDrawableTintId
                android.content.res.ColorStateList r1 = r3.getCompoundDrawableTintList()
                r4.readObject(r0, r1)
                int r0 = r2.mDrawableTintModeId
                android.graphics.PorterDuff$Mode r1 = r3.getCompoundDrawableTintMode()
                r4.readObject(r0, r1)
                return
            L4d:
                android.view.inspector.InspectionCompanion$UninitializedPropertyMapException r0 = new android.view.inspector.InspectionCompanion$UninitializedPropertyMapException
                r0.<init>()
                throw r0
        }

        @Override // android.view.inspector.InspectionCompanion
        public /* bridge */ /* synthetic */ void readProperties(androidx.appcompat.widget.AppCompatButton r1, android.view.inspector.PropertyReader r2) {
                r0 = this;
                androidx.appcompat.widget.AppCompatButton r1 = (androidx.appcompat.widget.AppCompatButton) r1
                r0.readProperties2(r1, r2)
                return
        }
    }

    public AppCompatButton(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public AppCompatButton(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            int r0 = androidx.appcompat.R.attr.buttonStyle
            r1.<init>(r2, r3, r0)
            return
    }

    public AppCompatButton(android.content.Context r2, android.util.AttributeSet r3, int r4) {
            r1 = this;
            android.content.Context r0 = androidx.appcompat.widget.TintContextWrapper.wrap(r2)
            r1.<init>(r0, r3, r4)
            android.content.Context r0 = r1.getContext()
            androidx.appcompat.widget.ThemeUtils.checkAppCompatTheme(r1, r0)
            androidx.appcompat.widget.AppCompatBackgroundHelper r0 = new androidx.appcompat.widget.AppCompatBackgroundHelper
            r0.<init>(r1)
            r1.mBackgroundTintHelper = r0
            androidx.appcompat.widget.AppCompatBackgroundHelper r0 = r1.mBackgroundTintHelper
            r0.loadFromAttributes(r3, r4)
            androidx.appcompat.widget.AppCompatTextHelper r0 = new androidx.appcompat.widget.AppCompatTextHelper
            r0.<init>(r1)
            r1.mTextHelper = r0
            androidx.appcompat.widget.AppCompatTextHelper r0 = r1.mTextHelper
            r0.loadFromAttributes(r3, r4)
            androidx.appcompat.widget.AppCompatTextHelper r0 = r1.mTextHelper
            r0.applyCompoundDrawablesTints()
            androidx.appcompat.widget.AppCompatEmojiTextHelper r0 = r1.getEmojiTextViewHelper()
            r0.loadFromAttributes(r3, r4)
            return
    }

    private androidx.appcompat.widget.AppCompatEmojiTextHelper getEmojiTextViewHelper() {
            r1 = this;
            androidx.appcompat.widget.AppCompatEmojiTextHelper r0 = r1.mAppCompatEmojiTextHelper
            if (r0 != 0) goto Lb
            androidx.appcompat.widget.AppCompatEmojiTextHelper r0 = new androidx.appcompat.widget.AppCompatEmojiTextHelper
            r0.<init>(r1)
            r1.mAppCompatEmojiTextHelper = r0
        Lb:
            androidx.appcompat.widget.AppCompatEmojiTextHelper r0 = r1.mAppCompatEmojiTextHelper
            return r0
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
            r1 = this;
            super.drawableStateChanged()
            androidx.appcompat.widget.AppCompatBackgroundHelper r0 = r1.mBackgroundTintHelper
            if (r0 == 0) goto Lc
            androidx.appcompat.widget.AppCompatBackgroundHelper r0 = r1.mBackgroundTintHelper
            r0.applySupportBackgroundTint()
        Lc:
            androidx.appcompat.widget.AppCompatTextHelper r0 = r1.mTextHelper
            if (r0 == 0) goto L15
            androidx.appcompat.widget.AppCompatTextHelper r0 = r1.mTextHelper
            r0.applyCompoundDrawablesTints()
        L15:
            return
    }

    @Override // android.widget.TextView, androidx.core.widget.AutoSizeableTextView
    public int getAutoSizeMaxTextSize() {
            r1 = this;
            boolean r0 = androidx.appcompat.widget.ViewUtils.SDK_LEVEL_SUPPORTS_AUTOSIZE
            if (r0 == 0) goto L9
            int r0 = super.getAutoSizeMaxTextSize()
            return r0
        L9:
            androidx.appcompat.widget.AppCompatTextHelper r0 = r1.mTextHelper
            if (r0 == 0) goto L14
            androidx.appcompat.widget.AppCompatTextHelper r0 = r1.mTextHelper
            int r0 = r0.getAutoSizeMaxTextSize()
            return r0
        L14:
            r0 = -1
            return r0
    }

    @Override // android.widget.TextView, androidx.core.widget.AutoSizeableTextView
    public int getAutoSizeMinTextSize() {
            r1 = this;
            boolean r0 = androidx.appcompat.widget.ViewUtils.SDK_LEVEL_SUPPORTS_AUTOSIZE
            if (r0 == 0) goto L9
            int r0 = super.getAutoSizeMinTextSize()
            return r0
        L9:
            androidx.appcompat.widget.AppCompatTextHelper r0 = r1.mTextHelper
            if (r0 == 0) goto L14
            androidx.appcompat.widget.AppCompatTextHelper r0 = r1.mTextHelper
            int r0 = r0.getAutoSizeMinTextSize()
            return r0
        L14:
            r0 = -1
            return r0
    }

    @Override // android.widget.TextView, androidx.core.widget.AutoSizeableTextView
    public int getAutoSizeStepGranularity() {
            r1 = this;
            boolean r0 = androidx.appcompat.widget.ViewUtils.SDK_LEVEL_SUPPORTS_AUTOSIZE
            if (r0 == 0) goto L9
            int r0 = super.getAutoSizeStepGranularity()
            return r0
        L9:
            androidx.appcompat.widget.AppCompatTextHelper r0 = r1.mTextHelper
            if (r0 == 0) goto L14
            androidx.appcompat.widget.AppCompatTextHelper r0 = r1.mTextHelper
            int r0 = r0.getAutoSizeStepGranularity()
            return r0
        L14:
            r0 = -1
            return r0
    }

    @Override // android.widget.TextView, androidx.core.widget.AutoSizeableTextView
    public int[] getAutoSizeTextAvailableSizes() {
            r1 = this;
            boolean r0 = androidx.appcompat.widget.ViewUtils.SDK_LEVEL_SUPPORTS_AUTOSIZE
            if (r0 == 0) goto L9
            int[] r0 = super.getAutoSizeTextAvailableSizes()
            return r0
        L9:
            androidx.appcompat.widget.AppCompatTextHelper r0 = r1.mTextHelper
            if (r0 == 0) goto L14
            androidx.appcompat.widget.AppCompatTextHelper r0 = r1.mTextHelper
            int[] r0 = r0.getAutoSizeTextAvailableSizes()
            return r0
        L14:
            r0 = 0
            int[] r0 = new int[r0]
            return r0
    }

    @Override // android.widget.TextView, androidx.core.widget.AutoSizeableTextView
    public int getAutoSizeTextType() {
            r3 = this;
            boolean r0 = androidx.appcompat.widget.ViewUtils.SDK_LEVEL_SUPPORTS_AUTOSIZE
            r1 = 0
            if (r0 == 0) goto L10
            int r0 = super.getAutoSizeTextType()
            r2 = 1
            if (r0 != r2) goto Le
            r1 = r2
            goto Lf
        Le:
        Lf:
            return r1
        L10:
            androidx.appcompat.widget.AppCompatTextHelper r0 = r3.mTextHelper
            if (r0 == 0) goto L1b
            androidx.appcompat.widget.AppCompatTextHelper r0 = r3.mTextHelper
            int r0 = r0.getAutoSizeTextType()
            return r0
        L1b:
            return r1
    }

    @Override // android.widget.TextView
    public android.view.ActionMode.Callback getCustomSelectionActionModeCallback() {
            r1 = this;
            android.view.ActionMode$Callback r0 = super.getCustomSelectionActionModeCallback()
            android.view.ActionMode$Callback r0 = androidx.core.widget.TextViewCompat.unwrapCustomSelectionActionModeCallback(r0)
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

    @Override // androidx.core.widget.TintableCompoundDrawablesView
    public android.content.res.ColorStateList getSupportCompoundDrawablesTintList() {
            r1 = this;
            androidx.appcompat.widget.AppCompatTextHelper r0 = r1.mTextHelper
            android.content.res.ColorStateList r0 = r0.getCompoundDrawableTintList()
            return r0
    }

    @Override // androidx.core.widget.TintableCompoundDrawablesView
    public android.graphics.PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
            r1 = this;
            androidx.appcompat.widget.AppCompatTextHelper r0 = r1.mTextHelper
            android.graphics.PorterDuff$Mode r0 = r0.getCompoundDrawableTintMode()
            return r0
    }

    @Override // androidx.appcompat.widget.EmojiCompatConfigurationView
    public boolean isEmojiCompatEnabled() {
            r1 = this;
            androidx.appcompat.widget.AppCompatEmojiTextHelper r0 = r1.getEmojiTextViewHelper()
            boolean r0 = r0.isEnabled()
            return r0
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(android.view.accessibility.AccessibilityEvent r2) {
            r1 = this;
            super.onInitializeAccessibilityEvent(r2)
            java.lang.Class<android.widget.Button> r0 = android.widget.Button.class
            java.lang.String r0 = r0.getName()
            r2.setClassName(r0)
            return
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo r2) {
            r1 = this;
            super.onInitializeAccessibilityNodeInfo(r2)
            java.lang.Class<android.widget.Button> r0 = android.widget.Button.class
            java.lang.String r0 = r0.getName()
            r2.setClassName(r0)
            return
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean r7, int r8, int r9, int r10, int r11) {
            r6 = this;
            super.onLayout(r7, r8, r9, r10, r11)
            r1 = r7
            r7 = r6
            androidx.appcompat.widget.AppCompatTextHelper r0 = r7.mTextHelper
            if (r0 == 0) goto L12
            androidx.appcompat.widget.AppCompatTextHelper r0 = r7.mTextHelper
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r0.onLayout(r1, r2, r3, r4, r5)
        L12:
            return
    }

    @Override // android.widget.TextView
    protected void onTextChanged(java.lang.CharSequence r3, int r4, int r5, int r6) {
            r2 = this;
            super.onTextChanged(r3, r4, r5, r6)
            androidx.appcompat.widget.AppCompatTextHelper r0 = r2.mTextHelper
            if (r0 == 0) goto L15
            boolean r0 = androidx.appcompat.widget.ViewUtils.SDK_LEVEL_SUPPORTS_AUTOSIZE
            if (r0 != 0) goto L15
            androidx.appcompat.widget.AppCompatTextHelper r0 = r2.mTextHelper
            boolean r0 = r0.isAutoSizeEnabled()
            if (r0 == 0) goto L15
            r0 = 1
            goto L16
        L15:
            r0 = 0
        L16:
            if (r0 == 0) goto L1d
            androidx.appcompat.widget.AppCompatTextHelper r1 = r2.mTextHelper
            r1.autoSizeText()
        L1d:
            return
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean r2) {
            r1 = this;
            super.setAllCaps(r2)
            androidx.appcompat.widget.AppCompatEmojiTextHelper r0 = r1.getEmojiTextViewHelper()
            r0.setAllCaps(r2)
            return
    }

    @Override // android.widget.TextView, androidx.core.widget.AutoSizeableTextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int r2, int r3, int r4, int r5) throws java.lang.IllegalArgumentException {
            r1 = this;
            boolean r0 = androidx.appcompat.widget.ViewUtils.SDK_LEVEL_SUPPORTS_AUTOSIZE
            if (r0 == 0) goto L8
            super.setAutoSizeTextTypeUniformWithConfiguration(r2, r3, r4, r5)
            goto L11
        L8:
            androidx.appcompat.widget.AppCompatTextHelper r0 = r1.mTextHelper
            if (r0 == 0) goto L11
            androidx.appcompat.widget.AppCompatTextHelper r0 = r1.mTextHelper
            r0.setAutoSizeTextTypeUniformWithConfiguration(r2, r3, r4, r5)
        L11:
            return
    }

    @Override // android.widget.TextView, androidx.core.widget.AutoSizeableTextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] r2, int r3) throws java.lang.IllegalArgumentException {
            r1 = this;
            boolean r0 = androidx.appcompat.widget.ViewUtils.SDK_LEVEL_SUPPORTS_AUTOSIZE
            if (r0 == 0) goto L8
            super.setAutoSizeTextTypeUniformWithPresetSizes(r2, r3)
            goto L11
        L8:
            androidx.appcompat.widget.AppCompatTextHelper r0 = r1.mTextHelper
            if (r0 == 0) goto L11
            androidx.appcompat.widget.AppCompatTextHelper r0 = r1.mTextHelper
            r0.setAutoSizeTextTypeUniformWithPresetSizes(r2, r3)
        L11:
            return
    }

    @Override // android.widget.TextView, androidx.core.widget.AutoSizeableTextView
    public void setAutoSizeTextTypeWithDefaults(int r2) {
            r1 = this;
            boolean r0 = androidx.appcompat.widget.ViewUtils.SDK_LEVEL_SUPPORTS_AUTOSIZE
            if (r0 == 0) goto L8
            super.setAutoSizeTextTypeWithDefaults(r2)
            goto L11
        L8:
            androidx.appcompat.widget.AppCompatTextHelper r0 = r1.mTextHelper
            if (r0 == 0) goto L11
            androidx.appcompat.widget.AppCompatTextHelper r0 = r1.mTextHelper
            r0.setAutoSizeTextTypeWithDefaults(r2)
        L11:
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

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(android.view.ActionMode.Callback r2) {
            r1 = this;
            android.view.ActionMode$Callback r0 = androidx.core.widget.TextViewCompat.wrapCustomSelectionActionModeCallback(r1, r2)
            super.setCustomSelectionActionModeCallback(r0)
            return
    }

    @Override // androidx.appcompat.widget.EmojiCompatConfigurationView
    public void setEmojiCompatEnabled(boolean r2) {
            r1 = this;
            androidx.appcompat.widget.AppCompatEmojiTextHelper r0 = r1.getEmojiTextViewHelper()
            r0.setEnabled(r2)
            return
    }

    @Override // android.widget.TextView
    public void setFilters(android.text.InputFilter[] r2) {
            r1 = this;
            androidx.appcompat.widget.AppCompatEmojiTextHelper r0 = r1.getEmojiTextViewHelper()
            android.text.InputFilter[] r0 = r0.getFilters(r2)
            super.setFilters(r0)
            return
    }

    public void setSupportAllCaps(boolean r2) {
            r1 = this;
            androidx.appcompat.widget.AppCompatTextHelper r0 = r1.mTextHelper
            if (r0 == 0) goto L9
            androidx.appcompat.widget.AppCompatTextHelper r0 = r1.mTextHelper
            r0.setAllCaps(r2)
        L9:
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

    @Override // androidx.core.widget.TintableCompoundDrawablesView
    public void setSupportCompoundDrawablesTintList(android.content.res.ColorStateList r2) {
            r1 = this;
            androidx.appcompat.widget.AppCompatTextHelper r0 = r1.mTextHelper
            r0.setCompoundDrawableTintList(r2)
            androidx.appcompat.widget.AppCompatTextHelper r0 = r1.mTextHelper
            r0.applyCompoundDrawablesTints()
            return
    }

    @Override // androidx.core.widget.TintableCompoundDrawablesView
    public void setSupportCompoundDrawablesTintMode(android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            androidx.appcompat.widget.AppCompatTextHelper r0 = r1.mTextHelper
            r0.setCompoundDrawableTintMode(r2)
            androidx.appcompat.widget.AppCompatTextHelper r0 = r1.mTextHelper
            r0.applyCompoundDrawablesTints()
            return
    }

    @Override // android.widget.TextView
    public void setTextAppearance(android.content.Context r2, int r3) {
            r1 = this;
            super.setTextAppearance(r2, r3)
            androidx.appcompat.widget.AppCompatTextHelper r0 = r1.mTextHelper
            if (r0 == 0) goto Lc
            androidx.appcompat.widget.AppCompatTextHelper r0 = r1.mTextHelper
            r0.onSetTextAppearance(r2, r3)
        Lc:
            return
    }

    @Override // android.widget.TextView
    public void setTextSize(int r2, float r3) {
            r1 = this;
            boolean r0 = androidx.appcompat.widget.ViewUtils.SDK_LEVEL_SUPPORTS_AUTOSIZE
            if (r0 == 0) goto L8
            super.setTextSize(r2, r3)
            goto L11
        L8:
            androidx.appcompat.widget.AppCompatTextHelper r0 = r1.mTextHelper
            if (r0 == 0) goto L11
            androidx.appcompat.widget.AppCompatTextHelper r0 = r1.mTextHelper
            r0.setTextSize(r2, r3)
        L11:
            return
    }
}
