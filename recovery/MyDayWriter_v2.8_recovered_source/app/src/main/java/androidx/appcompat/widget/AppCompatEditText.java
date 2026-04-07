package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatEditText extends android.widget.EditText implements androidx.core.view.TintableBackgroundView, androidx.core.view.OnReceiveContentViewBehavior, androidx.appcompat.widget.EmojiCompatConfigurationView, androidx.core.widget.TintableCompoundDrawablesView {
    private final androidx.appcompat.widget.AppCompatEmojiEditTextHelper mAppCompatEmojiEditTextHelper;
    private final androidx.appcompat.widget.AppCompatBackgroundHelper mBackgroundTintHelper;
    private final androidx.core.widget.TextViewOnReceiveContentListener mDefaultOnReceiveContentListener;
    private androidx.appcompat.widget.AppCompatEditText.SuperCaller mSuperCaller;
    private final androidx.appcompat.widget.AppCompatTextClassifierHelper mTextClassifierHelper;
    private final androidx.appcompat.widget.AppCompatTextHelper mTextHelper;

    public final class InspectionCompanion implements android.view.inspector.InspectionCompanion<androidx.appcompat.widget.AppCompatEditText> {
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
        public void readProperties2(androidx.appcompat.widget.AppCompatEditText r3, android.view.inspector.PropertyReader r4) {
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
        public /* bridge */ /* synthetic */ void readProperties(androidx.appcompat.widget.AppCompatEditText r1, android.view.inspector.PropertyReader r2) {
                r0 = this;
                androidx.appcompat.widget.AppCompatEditText r1 = (androidx.appcompat.widget.AppCompatEditText) r1
                r0.readProperties2(r1, r2)
                return
        }
    }

    class SuperCaller {
        final /* synthetic */ androidx.appcompat.widget.AppCompatEditText this$0;

        SuperCaller(androidx.appcompat.widget.AppCompatEditText r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        public android.view.textclassifier.TextClassifier getTextClassifier() {
                r1 = this;
                androidx.appcompat.widget.AppCompatEditText r0 = r1.this$0
                android.view.textclassifier.TextClassifier r0 = androidx.appcompat.widget.AppCompatEditText.access$001(r0)
                return r0
        }

        public void setTextClassifier(android.view.textclassifier.TextClassifier r2) {
                r1 = this;
                androidx.appcompat.widget.AppCompatEditText r0 = r1.this$0
                androidx.appcompat.widget.AppCompatEditText.access$101(r0, r2)
                return
        }
    }

    public AppCompatEditText(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public AppCompatEditText(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            int r0 = androidx.appcompat.R.attr.editTextStyle
            r1.<init>(r2, r3, r0)
            return
    }

    public AppCompatEditText(android.content.Context r2, android.util.AttributeSet r3, int r4) {
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
            androidx.appcompat.widget.AppCompatTextClassifierHelper r0 = new androidx.appcompat.widget.AppCompatTextClassifierHelper
            r0.<init>(r1)
            r1.mTextClassifierHelper = r0
            androidx.core.widget.TextViewOnReceiveContentListener r0 = new androidx.core.widget.TextViewOnReceiveContentListener
            r0.<init>()
            r1.mDefaultOnReceiveContentListener = r0
            androidx.appcompat.widget.AppCompatEmojiEditTextHelper r0 = new androidx.appcompat.widget.AppCompatEmojiEditTextHelper
            r0.<init>(r1)
            r1.mAppCompatEmojiEditTextHelper = r0
            androidx.appcompat.widget.AppCompatEmojiEditTextHelper r0 = r1.mAppCompatEmojiEditTextHelper
            r0.loadFromAttributes(r3, r4)
            androidx.appcompat.widget.AppCompatEmojiEditTextHelper r0 = r1.mAppCompatEmojiEditTextHelper
            r1.initEmojiKeyListener(r0)
            return
    }

    static /* synthetic */ android.view.textclassifier.TextClassifier access$001(androidx.appcompat.widget.AppCompatEditText r1) {
            android.view.textclassifier.TextClassifier r0 = super.getTextClassifier()
            return r0
    }

    static /* synthetic */ void access$101(androidx.appcompat.widget.AppCompatEditText r0, android.view.textclassifier.TextClassifier r1) {
            super.setTextClassifier(r1)
            return
    }

    private androidx.appcompat.widget.AppCompatEditText.SuperCaller getSuperCaller() {
            r1 = this;
            androidx.appcompat.widget.AppCompatEditText$SuperCaller r0 = r1.mSuperCaller
            if (r0 != 0) goto Lb
            androidx.appcompat.widget.AppCompatEditText$SuperCaller r0 = new androidx.appcompat.widget.AppCompatEditText$SuperCaller
            r0.<init>(r1)
            r1.mSuperCaller = r0
        Lb:
            androidx.appcompat.widget.AppCompatEditText$SuperCaller r0 = r1.mSuperCaller
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

    @Override // android.widget.EditText, android.widget.TextView
    public android.text.Editable getText() {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Lb
            android.text.Editable r0 = super.getText()
            return r0
        Lb:
            android.text.Editable r0 = super.getEditableText()
            return r0
    }

    @Override // android.widget.EditText, android.widget.TextView
    public /* bridge */ /* synthetic */ java.lang.CharSequence getText() {
            r1 = this;
            android.text.Editable r0 = r1.getText()
            return r0
    }

    @Override // android.widget.TextView
    public android.view.textclassifier.TextClassifier getTextClassifier() {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 >= r1) goto L12
            androidx.appcompat.widget.AppCompatTextClassifierHelper r0 = r2.mTextClassifierHelper
            if (r0 != 0) goto Lb
            goto L12
        Lb:
            androidx.appcompat.widget.AppCompatTextClassifierHelper r0 = r2.mTextClassifierHelper
            android.view.textclassifier.TextClassifier r0 = r0.getTextClassifier()
            return r0
        L12:
            androidx.appcompat.widget.AppCompatEditText$SuperCaller r0 = r2.getSuperCaller()
            android.view.textclassifier.TextClassifier r0 = r0.getTextClassifier()
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
    public android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo r4) {
            r3 = this;
            android.view.inputmethod.InputConnection r0 = super.onCreateInputConnection(r4)
            androidx.appcompat.widget.AppCompatTextHelper r1 = r3.mTextHelper
            r1.populateSurroundingTextIfNeeded(r3, r0, r4)
            android.view.inputmethod.InputConnection r0 = androidx.appcompat.widget.AppCompatHintHelper.onCreateInputConnection(r0, r4, r3)
            if (r0 == 0) goto L22
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 30
            if (r1 > r2) goto L22
            java.lang.String[] r1 = androidx.core.view.ViewCompat.getOnReceiveContentMimeTypes(r3)
            if (r1 == 0) goto L22
            androidx.core.view.inputmethod.EditorInfoCompat.setContentMimeTypes(r4, r1)
            android.view.inputmethod.InputConnection r0 = androidx.core.view.inputmethod.InputConnectionCompat.createWrapper(r3, r0, r4)
        L22:
            androidx.appcompat.widget.AppCompatEmojiEditTextHelper r1 = r3.mAppCompatEmojiEditTextHelper
            android.view.inputmethod.InputConnection r1 = r1.onCreateInputConnection(r0, r4)
            return r1
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
            r2 = this;
            super.onDetachedFromWindow()
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto L1e
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 >= r1) goto L1e
            android.content.Context r0 = r2.getContext()
            java.lang.String r1 = "input_method"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.inputmethod.InputMethodManager r0 = (android.view.inputmethod.InputMethodManager) r0
            r0.isActive(r2)
        L1e:
            return
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onDragEvent(android.view.DragEvent r2) {
            r1 = this;
            boolean r0 = androidx.appcompat.widget.AppCompatReceiveContentHelper.maybeHandleDragEventViaPerformReceiveContent(r1, r2)
            if (r0 == 0) goto L8
            r0 = 1
            return r0
        L8:
            boolean r0 = super.onDragEvent(r2)
            return r0
    }

    @Override // androidx.core.view.OnReceiveContentViewBehavior
    public androidx.core.view.ContentInfoCompat onReceiveContent(androidx.core.view.ContentInfoCompat r2) {
            r1 = this;
            androidx.core.widget.TextViewOnReceiveContentListener r0 = r1.mDefaultOnReceiveContentListener
            androidx.core.view.ContentInfoCompat r0 = r0.onReceiveContent(r1, r2)
            return r0
    }

    @Override // android.widget.EditText, android.widget.TextView
    public boolean onTextContextMenuItem(int r2) {
            r1 = this;
            boolean r0 = androidx.appcompat.widget.AppCompatReceiveContentHelper.maybeHandleMenuActionViaPerformReceiveContent(r1, r2)
            if (r0 == 0) goto L8
            r0 = 1
            return r0
        L8:
            boolean r0 = super.onTextContextMenuItem(r2)
            return r0
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

    @Override // android.widget.TextView
    public void setTextClassifier(android.view.textclassifier.TextClassifier r3) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 >= r1) goto L11
            androidx.appcompat.widget.AppCompatTextClassifierHelper r0 = r2.mTextClassifierHelper
            if (r0 != 0) goto Lb
            goto L11
        Lb:
            androidx.appcompat.widget.AppCompatTextClassifierHelper r0 = r2.mTextClassifierHelper
            r0.setTextClassifier(r3)
            return
        L11:
            androidx.appcompat.widget.AppCompatEditText$SuperCaller r0 = r2.getSuperCaller()
            r0.setTextClassifier(r3)
            return
    }
}
