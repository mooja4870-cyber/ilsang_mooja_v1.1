package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatMultiAutoCompleteTextView extends android.widget.MultiAutoCompleteTextView implements androidx.core.view.TintableBackgroundView, androidx.appcompat.widget.EmojiCompatConfigurationView, androidx.core.widget.TintableCompoundDrawablesView {
    private static final int[] TINT_ATTRS = null;
    private final androidx.appcompat.widget.AppCompatEmojiEditTextHelper mAppCompatEmojiEditTextHelper;
    private final androidx.appcompat.widget.AppCompatBackgroundHelper mBackgroundTintHelper;
    private final androidx.appcompat.widget.AppCompatTextHelper mTextHelper;

    public final class InspectionCompanion implements android.view.inspector.InspectionCompanion<androidx.appcompat.widget.AppCompatMultiAutoCompleteTextView> {
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
                java.lang.String r0 = "drawableTint"
                int r1 = androidx.appcompat.R.attr.drawableTint
                int r0 = r3.mapObject(r0, r1)
                r2.mDrawableTintId = r0
                java.lang.String r0 = "drawableTintMode"
                int r1 = androidx.appcompat.R.attr.drawableTintMode
                int r0 = r3.mapObject(r0, r1)
                r2.mDrawableTintModeId = r0
                r0 = 1
                r2.mPropertiesMapped = r0
                return
        }

        /* JADX INFO: renamed from: readProperties, reason: avoid collision after fix types in other method */
        public void readProperties2(androidx.appcompat.widget.AppCompatMultiAutoCompleteTextView r3, android.view.inspector.PropertyReader r4) {
                r2 = this;
                boolean r0 = r2.mPropertiesMapped
                if (r0 == 0) goto L29
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
            L29:
                android.view.inspector.InspectionCompanion$UninitializedPropertyMapException r0 = new android.view.inspector.InspectionCompanion$UninitializedPropertyMapException
                r0.<init>()
                throw r0
        }

        @Override // android.view.inspector.InspectionCompanion
        public /* bridge */ /* synthetic */ void readProperties(androidx.appcompat.widget.AppCompatMultiAutoCompleteTextView r1, android.view.inspector.PropertyReader r2) {
                r0 = this;
                androidx.appcompat.widget.AppCompatMultiAutoCompleteTextView r1 = (androidx.appcompat.widget.AppCompatMultiAutoCompleteTextView) r1
                r0.readProperties2(r1, r2)
                return
        }
    }

    static {
            r0 = 16843126(0x1010176, float:2.3694606E-38)
            int[] r0 = new int[]{r0}
            androidx.appcompat.widget.AppCompatMultiAutoCompleteTextView.TINT_ATTRS = r0
            return
    }

    public AppCompatMultiAutoCompleteTextView(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public AppCompatMultiAutoCompleteTextView(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            int r0 = androidx.appcompat.R.attr.autoCompleteTextViewStyle
            r1.<init>(r2, r3, r0)
            return
    }

    public AppCompatMultiAutoCompleteTextView(android.content.Context r4, android.util.AttributeSet r5, int r6) {
            r3 = this;
            android.content.Context r0 = androidx.appcompat.widget.TintContextWrapper.wrap(r4)
            r3.<init>(r0, r5, r6)
            android.content.Context r0 = r3.getContext()
            androidx.appcompat.widget.ThemeUtils.checkAppCompatTheme(r3, r0)
            android.content.Context r0 = r3.getContext()
            int[] r1 = androidx.appcompat.widget.AppCompatMultiAutoCompleteTextView.TINT_ATTRS
            r2 = 0
            androidx.appcompat.widget.TintTypedArray r0 = androidx.appcompat.widget.TintTypedArray.obtainStyledAttributes(r0, r5, r1, r6, r2)
            boolean r1 = r0.hasValue(r2)
            if (r1 == 0) goto L26
            android.graphics.drawable.Drawable r1 = r0.getDrawable(r2)
            r3.setDropDownBackgroundDrawable(r1)
        L26:
            r0.recycle()
            androidx.appcompat.widget.AppCompatBackgroundHelper r1 = new androidx.appcompat.widget.AppCompatBackgroundHelper
            r1.<init>(r3)
            r3.mBackgroundTintHelper = r1
            androidx.appcompat.widget.AppCompatBackgroundHelper r1 = r3.mBackgroundTintHelper
            r1.loadFromAttributes(r5, r6)
            androidx.appcompat.widget.AppCompatTextHelper r1 = new androidx.appcompat.widget.AppCompatTextHelper
            r1.<init>(r3)
            r3.mTextHelper = r1
            androidx.appcompat.widget.AppCompatTextHelper r1 = r3.mTextHelper
            r1.loadFromAttributes(r5, r6)
            androidx.appcompat.widget.AppCompatTextHelper r1 = r3.mTextHelper
            r1.applyCompoundDrawablesTints()
            androidx.appcompat.widget.AppCompatEmojiEditTextHelper r1 = new androidx.appcompat.widget.AppCompatEmojiEditTextHelper
            r1.<init>(r3)
            r3.mAppCompatEmojiEditTextHelper = r1
            androidx.appcompat.widget.AppCompatEmojiEditTextHelper r1 = r3.mAppCompatEmojiEditTextHelper
            r1.loadFromAttributes(r5, r6)
            androidx.appcompat.widget.AppCompatEmojiEditTextHelper r1 = r3.mAppCompatEmojiEditTextHelper
            r3.initEmojiKeyListener(r1)
            return
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

    void initEmojiKeyListener(androidx.appcompat.widget.AppCompatEmojiEditTextHelper r7) {
            r6 = this;
            android.text.method.KeyListener r0 = r6.getKeyListener()
            boolean r1 = r7.isEmojiCapableKeyListener(r0)
            if (r1 == 0) goto L30
            boolean r1 = super.isFocusable()
            boolean r2 = super.isClickable()
            boolean r3 = super.isLongClickable()
            int r4 = super.getInputType()
            android.text.method.KeyListener r5 = r7.getKeyListener(r0)
            if (r5 != r0) goto L21
            return
        L21:
            super.setKeyListener(r5)
            super.setRawInputType(r4)
            super.setFocusable(r1)
            super.setClickable(r2)
            super.setLongClickable(r3)
        L30:
            return
    }

    @Override // androidx.appcompat.widget.EmojiCompatConfigurationView
    public boolean isEmojiCompatEnabled() {
            r1 = this;
            androidx.appcompat.widget.AppCompatEmojiEditTextHelper r0 = r1.mAppCompatEmojiEditTextHelper
            boolean r0 = r0.isEnabled()
            return r0
    }

    @Override // android.widget.TextView, android.view.View
    public android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo r3) {
            r2 = this;
            android.view.inputmethod.InputConnection r0 = super.onCreateInputConnection(r3)
            android.view.inputmethod.InputConnection r0 = androidx.appcompat.widget.AppCompatHintHelper.onCreateInputConnection(r0, r3, r2)
            androidx.appcompat.widget.AppCompatEmojiEditTextHelper r1 = r2.mAppCompatEmojiEditTextHelper
            android.view.inputmethod.InputConnection r1 = r1.onCreateInputConnection(r0, r3)
            return r1
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
    public void setCompoundDrawables(android.graphics.drawable.Drawable r2, android.graphics.drawable.Drawable r3, android.graphics.drawable.Drawable r4, android.graphics.drawable.Drawable r5) {
            r1 = this;
            super.setCompoundDrawables(r2, r3, r4, r5)
            androidx.appcompat.widget.AppCompatTextHelper r0 = r1.mTextHelper
            if (r0 == 0) goto Lc
            androidx.appcompat.widget.AppCompatTextHelper r0 = r1.mTextHelper
            r0.onSetCompoundDrawables()
        Lc:
            return
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(android.graphics.drawable.Drawable r2, android.graphics.drawable.Drawable r3, android.graphics.drawable.Drawable r4, android.graphics.drawable.Drawable r5) {
            r1 = this;
            super.setCompoundDrawablesRelative(r2, r3, r4, r5)
            androidx.appcompat.widget.AppCompatTextHelper r0 = r1.mTextHelper
            if (r0 == 0) goto Lc
            androidx.appcompat.widget.AppCompatTextHelper r0 = r1.mTextHelper
            r0.onSetCompoundDrawables()
        Lc:
            return
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            android.graphics.drawable.Drawable r0 = androidx.appcompat.content.res.AppCompatResources.getDrawable(r0, r2)
            r1.setDropDownBackgroundDrawable(r0)
            return
    }

    @Override // androidx.appcompat.widget.EmojiCompatConfigurationView
    public void setEmojiCompatEnabled(boolean r2) {
            r1 = this;
            androidx.appcompat.widget.AppCompatEmojiEditTextHelper r0 = r1.mAppCompatEmojiEditTextHelper
            r0.setEnabled(r2)
            return
    }

    @Override // android.widget.TextView
    public void setKeyListener(android.text.method.KeyListener r2) {
            r1 = this;
            androidx.appcompat.widget.AppCompatEmojiEditTextHelper r0 = r1.mAppCompatEmojiEditTextHelper
            android.text.method.KeyListener r0 = r0.getKeyListener(r2)
            super.setKeyListener(r0)
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
}
