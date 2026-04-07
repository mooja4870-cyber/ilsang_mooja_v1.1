package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatTextView extends android.widget.TextView implements androidx.core.view.TintableBackgroundView, androidx.core.widget.TintableCompoundDrawablesView, androidx.core.widget.AutoSizeableTextView, androidx.appcompat.widget.EmojiCompatConfigurationView {
    private final androidx.appcompat.widget.AppCompatBackgroundHelper mBackgroundTintHelper;
    private androidx.appcompat.widget.AppCompatEmojiTextHelper mEmojiTextViewHelper;
    private boolean mIsSetTypefaceProcessing;
    private java.util.concurrent.Future<androidx.core.text.PrecomputedTextCompat> mPrecomputedTextFuture;
    private androidx.appcompat.widget.AppCompatTextView.SuperCaller mSuperCaller;
    private final androidx.appcompat.widget.AppCompatTextClassifierHelper mTextClassifierHelper;
    private final androidx.appcompat.widget.AppCompatTextHelper mTextHelper;

    public final class InspectionCompanion implements android.view.inspector.InspectionCompanion<androidx.appcompat.widget.AppCompatTextView> {
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
                androidx.appcompat.widget.AppCompatTextView$InspectionCompanion$1 r1 = new androidx.appcompat.widget.AppCompatTextView$InspectionCompanion$1
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
        public void readProperties2(androidx.appcompat.widget.AppCompatTextView r3, android.view.inspector.PropertyReader r4) {
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
        public /* bridge */ /* synthetic */ void readProperties(androidx.appcompat.widget.AppCompatTextView r1, android.view.inspector.PropertyReader r2) {
                r0 = this;
                androidx.appcompat.widget.AppCompatTextView r1 = (androidx.appcompat.widget.AppCompatTextView) r1
                r0.readProperties2(r1, r2)
                return
        }
    }

    private interface SuperCaller {
        int getAutoSizeMaxTextSize();

        int getAutoSizeMinTextSize();

        int getAutoSizeStepGranularity();

        int[] getAutoSizeTextAvailableSizes();

        int getAutoSizeTextType();

        android.view.textclassifier.TextClassifier getTextClassifier();

        void setAutoSizeTextTypeUniformWithConfiguration(int r1, int r2, int r3, int r4);

        void setAutoSizeTextTypeUniformWithPresetSizes(int[] r1, int r2);

        void setAutoSizeTextTypeWithDefaults(int r1);

        void setFirstBaselineToTopHeight(int r1);

        void setLastBaselineToBottomHeight(int r1);

        void setLineHeight(int r1, float r2);

        void setTextClassifier(android.view.textclassifier.TextClassifier r1);
    }

    class SuperCallerApi26 implements androidx.appcompat.widget.AppCompatTextView.SuperCaller {
        final /* synthetic */ androidx.appcompat.widget.AppCompatTextView this$0;

        SuperCallerApi26(androidx.appcompat.widget.AppCompatTextView r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.SuperCaller
        public int getAutoSizeMaxTextSize() {
                r1 = this;
                androidx.appcompat.widget.AppCompatTextView r0 = r1.this$0
                int r0 = androidx.appcompat.widget.AppCompatTextView.access$001(r0)
                return r0
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.SuperCaller
        public int getAutoSizeMinTextSize() {
                r1 = this;
                androidx.appcompat.widget.AppCompatTextView r0 = r1.this$0
                int r0 = androidx.appcompat.widget.AppCompatTextView.access$101(r0)
                return r0
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.SuperCaller
        public int getAutoSizeStepGranularity() {
                r1 = this;
                androidx.appcompat.widget.AppCompatTextView r0 = r1.this$0
                int r0 = androidx.appcompat.widget.AppCompatTextView.access$201(r0)
                return r0
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.SuperCaller
        public int[] getAutoSizeTextAvailableSizes() {
                r1 = this;
                androidx.appcompat.widget.AppCompatTextView r0 = r1.this$0
                int[] r0 = androidx.appcompat.widget.AppCompatTextView.access$301(r0)
                return r0
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.SuperCaller
        public int getAutoSizeTextType() {
                r1 = this;
                androidx.appcompat.widget.AppCompatTextView r0 = r1.this$0
                int r0 = androidx.appcompat.widget.AppCompatTextView.access$401(r0)
                return r0
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.SuperCaller
        public android.view.textclassifier.TextClassifier getTextClassifier() {
                r1 = this;
                androidx.appcompat.widget.AppCompatTextView r0 = r1.this$0
                android.view.textclassifier.TextClassifier r0 = androidx.appcompat.widget.AppCompatTextView.access$501(r0)
                return r0
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.SuperCaller
        public void setAutoSizeTextTypeUniformWithConfiguration(int r2, int r3, int r4, int r5) {
                r1 = this;
                androidx.appcompat.widget.AppCompatTextView r0 = r1.this$0
                androidx.appcompat.widget.AppCompatTextView.access$601(r0, r2, r3, r4, r5)
                return
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.SuperCaller
        public void setAutoSizeTextTypeUniformWithPresetSizes(int[] r2, int r3) {
                r1 = this;
                androidx.appcompat.widget.AppCompatTextView r0 = r1.this$0
                androidx.appcompat.widget.AppCompatTextView.access$701(r0, r2, r3)
                return
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.SuperCaller
        public void setAutoSizeTextTypeWithDefaults(int r2) {
                r1 = this;
                androidx.appcompat.widget.AppCompatTextView r0 = r1.this$0
                androidx.appcompat.widget.AppCompatTextView.access$801(r0, r2)
                return
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.SuperCaller
        public void setFirstBaselineToTopHeight(int r1) {
                r0 = this;
                return
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.SuperCaller
        public void setLastBaselineToBottomHeight(int r1) {
                r0 = this;
                return
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.SuperCaller
        public void setLineHeight(int r1, float r2) {
                r0 = this;
                return
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.SuperCaller
        public void setTextClassifier(android.view.textclassifier.TextClassifier r2) {
                r1 = this;
                androidx.appcompat.widget.AppCompatTextView r0 = r1.this$0
                androidx.appcompat.widget.AppCompatTextView.access$901(r0, r2)
                return
        }
    }

    class SuperCallerApi28 extends androidx.appcompat.widget.AppCompatTextView.SuperCallerApi26 {
        final /* synthetic */ androidx.appcompat.widget.AppCompatTextView this$0;

        SuperCallerApi28(androidx.appcompat.widget.AppCompatTextView r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r1)
                return
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.SuperCallerApi26, androidx.appcompat.widget.AppCompatTextView.SuperCaller
        public void setFirstBaselineToTopHeight(int r2) {
                r1 = this;
                androidx.appcompat.widget.AppCompatTextView r0 = r1.this$0
                androidx.appcompat.widget.AppCompatTextView.access$1001(r0, r2)
                return
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.SuperCallerApi26, androidx.appcompat.widget.AppCompatTextView.SuperCaller
        public void setLastBaselineToBottomHeight(int r2) {
                r1 = this;
                androidx.appcompat.widget.AppCompatTextView r0 = r1.this$0
                androidx.appcompat.widget.AppCompatTextView.access$1101(r0, r2)
                return
        }
    }

    class SuperCallerApi34 extends androidx.appcompat.widget.AppCompatTextView.SuperCallerApi28 {
        final /* synthetic */ androidx.appcompat.widget.AppCompatTextView this$0;

        SuperCallerApi34(androidx.appcompat.widget.AppCompatTextView r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r1)
                return
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.SuperCallerApi26, androidx.appcompat.widget.AppCompatTextView.SuperCaller
        public void setLineHeight(int r2, float r3) {
                r1 = this;
                androidx.appcompat.widget.AppCompatTextView r0 = r1.this$0
                androidx.appcompat.widget.AppCompatTextView.access$1201(r0, r2, r3)
                return
        }
    }

    public AppCompatTextView(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public AppCompatTextView(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 16842884(0x1010084, float:2.3693928E-38)
            r1.<init>(r2, r3, r0)
            return
    }

    public AppCompatTextView(android.content.Context r2, android.util.AttributeSet r3, int r4) {
            r1 = this;
            android.content.Context r0 = androidx.appcompat.widget.TintContextWrapper.wrap(r2)
            r1.<init>(r0, r3, r4)
            r0 = 0
            r1.mIsSetTypefaceProcessing = r0
            r0 = 0
            r1.mSuperCaller = r0
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
            androidx.appcompat.widget.AppCompatEmojiTextHelper r0 = r1.getEmojiTextViewHelper()
            r0.loadFromAttributes(r3, r4)
            return
    }

    static /* synthetic */ int access$001(androidx.appcompat.widget.AppCompatTextView r1) {
            int r0 = super.getAutoSizeMaxTextSize()
            return r0
    }

    static /* synthetic */ void access$1001(androidx.appcompat.widget.AppCompatTextView r0, int r1) {
            super.setFirstBaselineToTopHeight(r1)
            return
    }

    static /* synthetic */ int access$101(androidx.appcompat.widget.AppCompatTextView r1) {
            int r0 = super.getAutoSizeMinTextSize()
            return r0
    }

    static /* synthetic */ void access$1101(androidx.appcompat.widget.AppCompatTextView r0, int r1) {
            super.setLastBaselineToBottomHeight(r1)
            return
    }

    static /* synthetic */ void access$1201(androidx.appcompat.widget.AppCompatTextView r0, int r1, float r2) {
            super.setLineHeight(r1, r2)
            return
    }

    static /* synthetic */ int access$201(androidx.appcompat.widget.AppCompatTextView r1) {
            int r0 = super.getAutoSizeStepGranularity()
            return r0
    }

    static /* synthetic */ int[] access$301(androidx.appcompat.widget.AppCompatTextView r1) {
            int[] r0 = super.getAutoSizeTextAvailableSizes()
            return r0
    }

    static /* synthetic */ int access$401(androidx.appcompat.widget.AppCompatTextView r1) {
            int r0 = super.getAutoSizeTextType()
            return r0
    }

    static /* synthetic */ android.view.textclassifier.TextClassifier access$501(androidx.appcompat.widget.AppCompatTextView r1) {
            android.view.textclassifier.TextClassifier r0 = super.getTextClassifier()
            return r0
    }

    static /* synthetic */ void access$601(androidx.appcompat.widget.AppCompatTextView r0, int r1, int r2, int r3, int r4) {
            super.setAutoSizeTextTypeUniformWithConfiguration(r1, r2, r3, r4)
            return
    }

    static /* synthetic */ void access$701(androidx.appcompat.widget.AppCompatTextView r0, int[] r1, int r2) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(r1, r2)
            return
    }

    static /* synthetic */ void access$801(androidx.appcompat.widget.AppCompatTextView r0, int r1) {
            super.setAutoSizeTextTypeWithDefaults(r1)
            return
    }

    static /* synthetic */ void access$901(androidx.appcompat.widget.AppCompatTextView r0, android.view.textclassifier.TextClassifier r1) {
            super.setTextClassifier(r1)
            return
    }

    private void consumeTextFutureAndSetBlocking() {
            r2 = this;
            java.util.concurrent.Future<androidx.core.text.PrecomputedTextCompat> r0 = r2.mPrecomputedTextFuture
            if (r0 == 0) goto L16
            java.util.concurrent.Future<androidx.core.text.PrecomputedTextCompat> r0 = r2.mPrecomputedTextFuture     // Catch: java.util.concurrent.ExecutionException -> L13 java.lang.InterruptedException -> L15
            r1 = 0
            r2.mPrecomputedTextFuture = r1     // Catch: java.util.concurrent.ExecutionException -> L13 java.lang.InterruptedException -> L15
            java.lang.Object r1 = r0.get()     // Catch: java.util.concurrent.ExecutionException -> L13 java.lang.InterruptedException -> L15
            androidx.core.text.PrecomputedTextCompat r1 = (androidx.core.text.PrecomputedTextCompat) r1     // Catch: java.util.concurrent.ExecutionException -> L13 java.lang.InterruptedException -> L15
            androidx.core.widget.TextViewCompat.setPrecomputedText(r2, r1)     // Catch: java.util.concurrent.ExecutionException -> L13 java.lang.InterruptedException -> L15
            goto L16
        L13:
            r0 = move-exception
            goto L16
        L15:
            r0 = move-exception
        L16:
            return
    }

    private androidx.appcompat.widget.AppCompatEmojiTextHelper getEmojiTextViewHelper() {
            r1 = this;
            androidx.appcompat.widget.AppCompatEmojiTextHelper r0 = r1.mEmojiTextViewHelper
            if (r0 != 0) goto Lb
            androidx.appcompat.widget.AppCompatEmojiTextHelper r0 = new androidx.appcompat.widget.AppCompatEmojiTextHelper
            r0.<init>(r1)
            r1.mEmojiTextViewHelper = r0
        Lb:
            androidx.appcompat.widget.AppCompatEmojiTextHelper r0 = r1.mEmojiTextViewHelper
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
            if (r0 == 0) goto Ld
            androidx.appcompat.widget.AppCompatTextView$SuperCaller r0 = r1.getSuperCaller()
            int r0 = r0.getAutoSizeMaxTextSize()
            return r0
        Ld:
            androidx.appcompat.widget.AppCompatTextHelper r0 = r1.mTextHelper
            if (r0 == 0) goto L18
            androidx.appcompat.widget.AppCompatTextHelper r0 = r1.mTextHelper
            int r0 = r0.getAutoSizeMaxTextSize()
            return r0
        L18:
            r0 = -1
            return r0
    }

    @Override // android.widget.TextView, androidx.core.widget.AutoSizeableTextView
    public int getAutoSizeMinTextSize() {
            r1 = this;
            boolean r0 = androidx.appcompat.widget.ViewUtils.SDK_LEVEL_SUPPORTS_AUTOSIZE
            if (r0 == 0) goto Ld
            androidx.appcompat.widget.AppCompatTextView$SuperCaller r0 = r1.getSuperCaller()
            int r0 = r0.getAutoSizeMinTextSize()
            return r0
        Ld:
            androidx.appcompat.widget.AppCompatTextHelper r0 = r1.mTextHelper
            if (r0 == 0) goto L18
            androidx.appcompat.widget.AppCompatTextHelper r0 = r1.mTextHelper
            int r0 = r0.getAutoSizeMinTextSize()
            return r0
        L18:
            r0 = -1
            return r0
    }

    @Override // android.widget.TextView, androidx.core.widget.AutoSizeableTextView
    public int getAutoSizeStepGranularity() {
            r1 = this;
            boolean r0 = androidx.appcompat.widget.ViewUtils.SDK_LEVEL_SUPPORTS_AUTOSIZE
            if (r0 == 0) goto Ld
            androidx.appcompat.widget.AppCompatTextView$SuperCaller r0 = r1.getSuperCaller()
            int r0 = r0.getAutoSizeStepGranularity()
            return r0
        Ld:
            androidx.appcompat.widget.AppCompatTextHelper r0 = r1.mTextHelper
            if (r0 == 0) goto L18
            androidx.appcompat.widget.AppCompatTextHelper r0 = r1.mTextHelper
            int r0 = r0.getAutoSizeStepGranularity()
            return r0
        L18:
            r0 = -1
            return r0
    }

    @Override // android.widget.TextView, androidx.core.widget.AutoSizeableTextView
    public int[] getAutoSizeTextAvailableSizes() {
            r1 = this;
            boolean r0 = androidx.appcompat.widget.ViewUtils.SDK_LEVEL_SUPPORTS_AUTOSIZE
            if (r0 == 0) goto Ld
            androidx.appcompat.widget.AppCompatTextView$SuperCaller r0 = r1.getSuperCaller()
            int[] r0 = r0.getAutoSizeTextAvailableSizes()
            return r0
        Ld:
            androidx.appcompat.widget.AppCompatTextHelper r0 = r1.mTextHelper
            if (r0 == 0) goto L18
            androidx.appcompat.widget.AppCompatTextHelper r0 = r1.mTextHelper
            int[] r0 = r0.getAutoSizeTextAvailableSizes()
            return r0
        L18:
            r0 = 0
            int[] r0 = new int[r0]
            return r0
    }

    @Override // android.widget.TextView, androidx.core.widget.AutoSizeableTextView
    public int getAutoSizeTextType() {
            r3 = this;
            boolean r0 = androidx.appcompat.widget.ViewUtils.SDK_LEVEL_SUPPORTS_AUTOSIZE
            r1 = 0
            if (r0 == 0) goto L14
            androidx.appcompat.widget.AppCompatTextView$SuperCaller r0 = r3.getSuperCaller()
            int r0 = r0.getAutoSizeTextType()
            r2 = 1
            if (r0 != r2) goto L12
            r1 = r2
            goto L13
        L12:
        L13:
            return r1
        L14:
            androidx.appcompat.widget.AppCompatTextHelper r0 = r3.mTextHelper
            if (r0 == 0) goto L1f
            androidx.appcompat.widget.AppCompatTextHelper r0 = r3.mTextHelper
            int r0 = r0.getAutoSizeTextType()
            return r0
        L1f:
            return r1
    }

    @Override // android.widget.TextView
    public android.view.ActionMode.Callback getCustomSelectionActionModeCallback() {
            r1 = this;
            android.view.ActionMode$Callback r0 = super.getCustomSelectionActionModeCallback()
            android.view.ActionMode$Callback r0 = androidx.core.widget.TextViewCompat.unwrapCustomSelectionActionModeCallback(r0)
            return r0
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
            r1 = this;
            int r0 = androidx.core.widget.TextViewCompat.getFirstBaselineToTopHeight(r1)
            return r0
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
            r1 = this;
            int r0 = androidx.core.widget.TextViewCompat.getLastBaselineToBottomHeight(r1)
            return r0
    }

    androidx.appcompat.widget.AppCompatTextView.SuperCaller getSuperCaller() {
            r2 = this;
            androidx.appcompat.widget.AppCompatTextView$SuperCaller r0 = r2.mSuperCaller
            if (r0 != 0) goto L2d
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto L12
            androidx.appcompat.widget.AppCompatTextView$SuperCallerApi34 r0 = new androidx.appcompat.widget.AppCompatTextView$SuperCallerApi34
            r0.<init>(r2)
            r2.mSuperCaller = r0
            goto L2d
        L12:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L20
            androidx.appcompat.widget.AppCompatTextView$SuperCallerApi28 r0 = new androidx.appcompat.widget.AppCompatTextView$SuperCallerApi28
            r0.<init>(r2)
            r2.mSuperCaller = r0
            goto L2d
        L20:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L2d
            androidx.appcompat.widget.AppCompatTextView$SuperCallerApi26 r0 = new androidx.appcompat.widget.AppCompatTextView$SuperCallerApi26
            r0.<init>(r2)
            r2.mSuperCaller = r0
        L2d:
            androidx.appcompat.widget.AppCompatTextView$SuperCaller r0 = r2.mSuperCaller
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

    @Override // android.widget.TextView
    public java.lang.CharSequence getText() {
            r1 = this;
            r1.consumeTextFutureAndSetBlocking()
            java.lang.CharSequence r0 = super.getText()
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
            androidx.appcompat.widget.AppCompatTextView$SuperCaller r0 = r2.getSuperCaller()
            android.view.textclassifier.TextClassifier r0 = r0.getTextClassifier()
            return r0
    }

    public androidx.core.text.PrecomputedTextCompat.Params getTextMetricsParamsCompat() {
            r1 = this;
            androidx.core.text.PrecomputedTextCompat$Params r0 = androidx.core.widget.TextViewCompat.getTextMetricsParams(r1)
            return r0
    }

    @Override // androidx.appcompat.widget.EmojiCompatConfigurationView
    public boolean isEmojiCompatEnabled() {
            r1 = this;
            androidx.appcompat.widget.AppCompatEmojiTextHelper r0 = r1.getEmojiTextViewHelper()
            boolean r0 = r0.isEnabled()
            return r0
    }

    @Override // android.widget.TextView, android.view.View
    public android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo r3) {
            r2 = this;
            android.view.inputmethod.InputConnection r0 = super.onCreateInputConnection(r3)
            androidx.appcompat.widget.AppCompatTextHelper r1 = r2.mTextHelper
            r1.populateSurroundingTextIfNeeded(r2, r0, r3)
            android.view.inputmethod.InputConnection r1 = androidx.appcompat.widget.AppCompatHintHelper.onCreateInputConnection(r0, r3, r2)
            return r1
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
            r2 = this;
            super.onDetachedFromWindow()
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto L24
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 >= r1) goto L24
            boolean r0 = r2.onCheckIsTextEditor()
            if (r0 == 0) goto L24
            android.content.Context r0 = r2.getContext()
            java.lang.String r1 = "input_method"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.inputmethod.InputMethodManager r0 = (android.view.inputmethod.InputMethodManager) r0
            r0.isActive(r2)
        L24:
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

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int r1, int r2) {
            r0 = this;
            r0.consumeTextFutureAndSetBlocking()
            super.onMeasure(r1, r2)
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
            if (r0 == 0) goto Lc
            androidx.appcompat.widget.AppCompatTextView$SuperCaller r0 = r1.getSuperCaller()
            r0.setAutoSizeTextTypeUniformWithConfiguration(r2, r3, r4, r5)
            goto L15
        Lc:
            androidx.appcompat.widget.AppCompatTextHelper r0 = r1.mTextHelper
            if (r0 == 0) goto L15
            androidx.appcompat.widget.AppCompatTextHelper r0 = r1.mTextHelper
            r0.setAutoSizeTextTypeUniformWithConfiguration(r2, r3, r4, r5)
        L15:
            return
    }

    @Override // android.widget.TextView, androidx.core.widget.AutoSizeableTextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] r2, int r3) throws java.lang.IllegalArgumentException {
            r1 = this;
            boolean r0 = androidx.appcompat.widget.ViewUtils.SDK_LEVEL_SUPPORTS_AUTOSIZE
            if (r0 == 0) goto Lc
            androidx.appcompat.widget.AppCompatTextView$SuperCaller r0 = r1.getSuperCaller()
            r0.setAutoSizeTextTypeUniformWithPresetSizes(r2, r3)
            goto L15
        Lc:
            androidx.appcompat.widget.AppCompatTextHelper r0 = r1.mTextHelper
            if (r0 == 0) goto L15
            androidx.appcompat.widget.AppCompatTextHelper r0 = r1.mTextHelper
            r0.setAutoSizeTextTypeUniformWithPresetSizes(r2, r3)
        L15:
            return
    }

    @Override // android.widget.TextView, androidx.core.widget.AutoSizeableTextView
    public void setAutoSizeTextTypeWithDefaults(int r2) {
            r1 = this;
            boolean r0 = androidx.appcompat.widget.ViewUtils.SDK_LEVEL_SUPPORTS_AUTOSIZE
            if (r0 == 0) goto Lc
            androidx.appcompat.widget.AppCompatTextView$SuperCaller r0 = r1.getSuperCaller()
            r0.setAutoSizeTextTypeWithDefaults(r2)
            goto L15
        Lc:
            androidx.appcompat.widget.AppCompatTextHelper r0 = r1.mTextHelper
            if (r0 == 0) goto L15
            androidx.appcompat.widget.AppCompatTextHelper r0 = r1.mTextHelper
            r0.setAutoSizeTextTypeWithDefaults(r2)
        L15:
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
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int r6, int r7, int r8, int r9) {
            r5 = this;
            android.content.Context r0 = r5.getContext()
            r1 = 0
            if (r6 == 0) goto Ld
            android.graphics.drawable.Drawable r2 = androidx.appcompat.content.res.AppCompatResources.getDrawable(r0, r6)
            goto Le
        Ld:
            r2 = r1
        Le:
            if (r7 == 0) goto L15
            android.graphics.drawable.Drawable r3 = androidx.appcompat.content.res.AppCompatResources.getDrawable(r0, r7)
            goto L16
        L15:
            r3 = r1
        L16:
            if (r8 == 0) goto L1d
            android.graphics.drawable.Drawable r4 = androidx.appcompat.content.res.AppCompatResources.getDrawable(r0, r8)
            goto L1e
        L1d:
            r4 = r1
        L1e:
            if (r9 == 0) goto L24
            android.graphics.drawable.Drawable r1 = androidx.appcompat.content.res.AppCompatResources.getDrawable(r0, r9)
        L24:
            r5.setCompoundDrawablesRelativeWithIntrinsicBounds(r2, r3, r4, r1)
            androidx.appcompat.widget.AppCompatTextHelper r1 = r5.mTextHelper
            if (r1 == 0) goto L30
            androidx.appcompat.widget.AppCompatTextHelper r1 = r5.mTextHelper
            r1.onSetCompoundDrawables()
        L30:
            return
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(android.graphics.drawable.Drawable r2, android.graphics.drawable.Drawable r3, android.graphics.drawable.Drawable r4, android.graphics.drawable.Drawable r5) {
            r1 = this;
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(r2, r3, r4, r5)
            androidx.appcompat.widget.AppCompatTextHelper r0 = r1.mTextHelper
            if (r0 == 0) goto Lc
            androidx.appcompat.widget.AppCompatTextHelper r0 = r1.mTextHelper
            r0.onSetCompoundDrawables()
        Lc:
            return
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int r6, int r7, int r8, int r9) {
            r5 = this;
            android.content.Context r0 = r5.getContext()
            r1 = 0
            if (r6 == 0) goto Ld
            android.graphics.drawable.Drawable r2 = androidx.appcompat.content.res.AppCompatResources.getDrawable(r0, r6)
            goto Le
        Ld:
            r2 = r1
        Le:
            if (r7 == 0) goto L15
            android.graphics.drawable.Drawable r3 = androidx.appcompat.content.res.AppCompatResources.getDrawable(r0, r7)
            goto L16
        L15:
            r3 = r1
        L16:
            if (r8 == 0) goto L1d
            android.graphics.drawable.Drawable r4 = androidx.appcompat.content.res.AppCompatResources.getDrawable(r0, r8)
            goto L1e
        L1d:
            r4 = r1
        L1e:
            if (r9 == 0) goto L24
            android.graphics.drawable.Drawable r1 = androidx.appcompat.content.res.AppCompatResources.getDrawable(r0, r9)
        L24:
            r5.setCompoundDrawablesWithIntrinsicBounds(r2, r3, r4, r1)
            androidx.appcompat.widget.AppCompatTextHelper r1 = r5.mTextHelper
            if (r1 == 0) goto L30
            androidx.appcompat.widget.AppCompatTextHelper r1 = r5.mTextHelper
            r1.onSetCompoundDrawables()
        L30:
            return
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(android.graphics.drawable.Drawable r2, android.graphics.drawable.Drawable r3, android.graphics.drawable.Drawable r4, android.graphics.drawable.Drawable r5) {
            r1 = this;
            super.setCompoundDrawablesWithIntrinsicBounds(r2, r3, r4, r5)
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

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int r3) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Le
            androidx.appcompat.widget.AppCompatTextView$SuperCaller r0 = r2.getSuperCaller()
            r0.setFirstBaselineToTopHeight(r3)
            goto L11
        Le:
            androidx.core.widget.TextViewCompat.setFirstBaselineToTopHeight(r2, r3)
        L11:
            return
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int r3) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Le
            androidx.appcompat.widget.AppCompatTextView$SuperCaller r0 = r2.getSuperCaller()
            r0.setLastBaselineToBottomHeight(r3)
            goto L11
        Le:
            androidx.core.widget.TextViewCompat.setLastBaselineToBottomHeight(r2, r3)
        L11:
            return
    }

    @Override // android.widget.TextView
    public void setLineHeight(int r1) {
            r0 = this;
            androidx.core.widget.TextViewCompat.setLineHeight(r0, r1)
            return
    }

    @Override // android.widget.TextView
    public void setLineHeight(int r3, float r4) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto Le
            androidx.appcompat.widget.AppCompatTextView$SuperCaller r0 = r2.getSuperCaller()
            r0.setLineHeight(r3, r4)
            goto L11
        Le:
            androidx.core.widget.TextViewCompat.setLineHeight(r2, r3, r4)
        L11:
            return
    }

    public void setPrecomputedText(androidx.core.text.PrecomputedTextCompat r1) {
            r0 = this;
            androidx.core.widget.TextViewCompat.setPrecomputedText(r0, r1)
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
            androidx.appcompat.widget.AppCompatTextView$SuperCaller r0 = r2.getSuperCaller()
            r0.setTextClassifier(r3)
            return
    }

    public void setTextFuture(java.util.concurrent.Future<androidx.core.text.PrecomputedTextCompat> r1) {
            r0 = this;
            r0.mPrecomputedTextFuture = r1
            if (r1 == 0) goto L7
            r0.requestLayout()
        L7:
            return
    }

    public void setTextMetricsParamsCompat(androidx.core.text.PrecomputedTextCompat.Params r1) {
            r0 = this;
            androidx.core.widget.TextViewCompat.setTextMetricsParams(r0, r1)
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

    @Override // android.widget.TextView
    public void setTypeface(android.graphics.Typeface r4, int r5) {
            r3 = this;
            boolean r0 = r3.mIsSetTypefaceProcessing
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 0
            if (r4 == 0) goto L12
            if (r5 <= 0) goto L12
            android.content.Context r1 = r3.getContext()
            android.graphics.Typeface r0 = androidx.core.graphics.TypefaceCompat.create(r1, r4, r5)
        L12:
            r1 = 1
            r3.mIsSetTypefaceProcessing = r1
            if (r0 == 0) goto L19
            r1 = r0
            goto L1a
        L19:
            r1 = r4
        L1a:
            r2 = 0
            super.setTypeface(r1, r5)     // Catch: java.lang.Throwable -> L22
            r3.mIsSetTypefaceProcessing = r2
            return
        L22:
            r1 = move-exception
            r3.mIsSetTypefaceProcessing = r2
            throw r1
    }
}
