package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatCheckBox extends android.widget.CheckBox implements androidx.core.widget.TintableCompoundButton, androidx.core.view.TintableBackgroundView, androidx.appcompat.widget.EmojiCompatConfigurationView, androidx.core.widget.TintableCompoundDrawablesView {
    private androidx.appcompat.widget.AppCompatEmojiTextHelper mAppCompatEmojiTextHelper;
    private final androidx.appcompat.widget.AppCompatBackgroundHelper mBackgroundTintHelper;
    private final androidx.appcompat.widget.AppCompatCompoundButtonHelper mCompoundButtonHelper;
    private final androidx.appcompat.widget.AppCompatTextHelper mTextHelper;

    public final class InspectionCompanion implements android.view.inspector.InspectionCompanion<androidx.appcompat.widget.AppCompatCheckBox> {
        private int mBackgroundTintId;
        private int mBackgroundTintModeId;
        private int mButtonTintId;
        private int mButtonTintModeId;
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
                java.lang.String r0 = "buttonTint"
                int r1 = androidx.appcompat.R.attr.buttonTint
                int r0 = r3.mapObject(r0, r1)
                r2.mButtonTintId = r0
                java.lang.String r0 = "buttonTintMode"
                int r1 = androidx.appcompat.R.attr.buttonTintMode
                int r0 = r3.mapObject(r0, r1)
                r2.mButtonTintModeId = r0
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
        public void readProperties2(androidx.appcompat.widget.AppCompatCheckBox r3, android.view.inspector.PropertyReader r4) {
                r2 = this;
                boolean r0 = r2.mPropertiesMapped
                if (r0 == 0) goto L3b
                int r0 = r2.mBackgroundTintId
                android.content.res.ColorStateList r1 = r3.getBackgroundTintList()
                r4.readObject(r0, r1)
                int r0 = r2.mBackgroundTintModeId
                android.graphics.PorterDuff$Mode r1 = r3.getBackgroundTintMode()
                r4.readObject(r0, r1)
                int r0 = r2.mButtonTintId
                android.content.res.ColorStateList r1 = r3.getButtonTintList()
                r4.readObject(r0, r1)
                int r0 = r2.mButtonTintModeId
                android.graphics.PorterDuff$Mode r1 = r3.getButtonTintMode()
                r4.readObject(r0, r1)
                int r0 = r2.mDrawableTintId
                android.content.res.ColorStateList r1 = r3.getCompoundDrawableTintList()
                r4.readObject(r0, r1)
                int r0 = r2.mDrawableTintModeId
                android.graphics.PorterDuff$Mode r1 = r3.getCompoundDrawableTintMode()
                r4.readObject(r0, r1)
                return
            L3b:
                android.view.inspector.InspectionCompanion$UninitializedPropertyMapException r0 = new android.view.inspector.InspectionCompanion$UninitializedPropertyMapException
                r0.<init>()
                throw r0
        }

        @Override // android.view.inspector.InspectionCompanion
        public /* bridge */ /* synthetic */ void readProperties(androidx.appcompat.widget.AppCompatCheckBox r1, android.view.inspector.PropertyReader r2) {
                r0 = this;
                androidx.appcompat.widget.AppCompatCheckBox r1 = (androidx.appcompat.widget.AppCompatCheckBox) r1
                r0.readProperties2(r1, r2)
                return
        }
    }

    public AppCompatCheckBox(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public AppCompatCheckBox(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            int r0 = androidx.appcompat.R.attr.checkboxStyle
            r1.<init>(r2, r3, r0)
            return
    }

    public AppCompatCheckBox(android.content.Context r2, android.util.AttributeSet r3, int r4) {
            r1 = this;
            android.content.Context r0 = androidx.appcompat.widget.TintContextWrapper.wrap(r2)
            r1.<init>(r0, r3, r4)
            android.content.Context r0 = r1.getContext()
            androidx.appcompat.widget.ThemeUtils.checkAppCompatTheme(r1, r0)
            androidx.appcompat.widget.AppCompatCompoundButtonHelper r0 = new androidx.appcompat.widget.AppCompatCompoundButtonHelper
            r0.<init>(r1)
            r1.mCompoundButtonHelper = r0
            androidx.appcompat.widget.AppCompatCompoundButtonHelper r0 = r1.mCompoundButtonHelper
            r0.loadFromAttributes(r3, r4)
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

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
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

    @Override // androidx.core.widget.TintableCompoundButton
    public android.content.res.ColorStateList getSupportButtonTintList() {
            r1 = this;
            androidx.appcompat.widget.AppCompatCompoundButtonHelper r0 = r1.mCompoundButtonHelper
            if (r0 == 0) goto Lb
            androidx.appcompat.widget.AppCompatCompoundButtonHelper r0 = r1.mCompoundButtonHelper
            android.content.res.ColorStateList r0 = r0.getSupportButtonTintList()
            goto Lc
        Lb:
            r0 = 0
        Lc:
            return r0
    }

    @Override // androidx.core.widget.TintableCompoundButton
    public android.graphics.PorterDuff.Mode getSupportButtonTintMode() {
            r1 = this;
            androidx.appcompat.widget.AppCompatCompoundButtonHelper r0 = r1.mCompoundButtonHelper
            if (r0 == 0) goto Lb
            androidx.appcompat.widget.AppCompatCompoundButtonHelper r0 = r1.mCompoundButtonHelper
            android.graphics.PorterDuff$Mode r0 = r0.getSupportButtonTintMode()
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

    @Override // android.widget.TextView
    public void setAllCaps(boolean r2) {
            r1 = this;
            super.setAllCaps(r2)
            androidx.appcompat.widget.AppCompatEmojiTextHelper r0 = r1.getEmojiTextViewHelper()
            r0.setAllCaps(r2)
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

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            android.graphics.drawable.Drawable r0 = androidx.appcompat.content.res.AppCompatResources.getDrawable(r0, r2)
            r1.setButtonDrawable(r0)
            return
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(android.graphics.drawable.Drawable r2) {
            r1 = this;
            super.setButtonDrawable(r2)
            androidx.appcompat.widget.AppCompatCompoundButtonHelper r0 = r1.mCompoundButtonHelper
            if (r0 == 0) goto Lc
            androidx.appcompat.widget.AppCompatCompoundButtonHelper r0 = r1.mCompoundButtonHelper
            r0.onSetButtonDrawable()
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

    @Override // androidx.core.widget.TintableCompoundButton
    public void setSupportButtonTintList(android.content.res.ColorStateList r2) {
            r1 = this;
            androidx.appcompat.widget.AppCompatCompoundButtonHelper r0 = r1.mCompoundButtonHelper
            if (r0 == 0) goto L9
            androidx.appcompat.widget.AppCompatCompoundButtonHelper r0 = r1.mCompoundButtonHelper
            r0.setSupportButtonTintList(r2)
        L9:
            return
    }

    @Override // androidx.core.widget.TintableCompoundButton
    public void setSupportButtonTintMode(android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            androidx.appcompat.widget.AppCompatCompoundButtonHelper r0 = r1.mCompoundButtonHelper
            if (r0 == 0) goto L9
            androidx.appcompat.widget.AppCompatCompoundButtonHelper r0 = r1.mCompoundButtonHelper
            r0.setSupportButtonTintMode(r2)
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
}
