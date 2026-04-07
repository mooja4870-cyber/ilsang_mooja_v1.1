package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
class AppCompatTextHelper {
    private static final int MONOSPACE = 3;
    private static final int SANS = 1;
    private static final int SERIF = 2;
    private static final int TEXT_FONT_WEIGHT_UNSPECIFIED = -1;
    private boolean mAsyncFontPending;
    private final androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper mAutoSizeTextHelper;
    private androidx.appcompat.widget.TintInfo mDrawableBottomTint;
    private androidx.appcompat.widget.TintInfo mDrawableEndTint;
    private androidx.appcompat.widget.TintInfo mDrawableLeftTint;
    private androidx.appcompat.widget.TintInfo mDrawableRightTint;
    private androidx.appcompat.widget.TintInfo mDrawableStartTint;
    private androidx.appcompat.widget.TintInfo mDrawableTint;
    private androidx.appcompat.widget.TintInfo mDrawableTopTint;
    private android.graphics.Typeface mFontTypeface;
    private int mFontWeight;
    private int mStyle;
    private final android.widget.TextView mView;



    static class Api21Impl {
        private Api21Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static java.util.Locale forLanguageTag(java.lang.String r1) {
                java.util.Locale r0 = java.util.Locale.forLanguageTag(r1)
                return r0
        }
    }

    static class Api24Impl {
        private Api24Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static android.os.LocaleList forLanguageTags(java.lang.String r1) {
                android.os.LocaleList r0 = android.os.LocaleList.forLanguageTags(r1)
                return r0
        }

        static void setTextLocales(android.widget.TextView r0, android.os.LocaleList r1) {
                r0.setTextLocales(r1)
                return
        }
    }

    static class Api26Impl {
        private Api26Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static int getAutoSizeStepGranularity(android.widget.TextView r1) {
                int r0 = r1.getAutoSizeStepGranularity()
                return r0
        }

        static void setAutoSizeTextTypeUniformWithConfiguration(android.widget.TextView r0, int r1, int r2, int r3, int r4) {
                r0.setAutoSizeTextTypeUniformWithConfiguration(r1, r2, r3, r4)
                return
        }

        static void setAutoSizeTextTypeUniformWithPresetSizes(android.widget.TextView r0, int[] r1, int r2) {
                r0.setAutoSizeTextTypeUniformWithPresetSizes(r1, r2)
                return
        }

        static boolean setFontVariationSettings(android.widget.TextView r1, java.lang.String r2) {
                boolean r0 = r1.setFontVariationSettings(r2)
                return r0
        }
    }

    static class Api28Impl {
        private Api28Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static android.graphics.Typeface create(android.graphics.Typeface r1, int r2, boolean r3) {
                android.graphics.Typeface r0 = android.graphics.Typeface.create(r1, r2, r3)
                return r0
        }
    }

    AppCompatTextHelper(android.widget.TextView r3) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.mStyle = r0
            r0 = -1
            r2.mFontWeight = r0
            r2.mView = r3
            androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper r0 = new androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper
            android.widget.TextView r1 = r2.mView
            r0.<init>(r1)
            r2.mAutoSizeTextHelper = r0
            return
    }

    private void applyCompoundDrawableTint(android.graphics.drawable.Drawable r2, androidx.appcompat.widget.TintInfo r3) {
            r1 = this;
            if (r2 == 0) goto Ld
            if (r3 == 0) goto Ld
            android.widget.TextView r0 = r1.mView
            int[] r0 = r0.getDrawableState()
            androidx.appcompat.widget.AppCompatDrawableManager.tintDrawable(r2, r3, r0)
        Ld:
            return
    }

    private static androidx.appcompat.widget.TintInfo createTintInfo(android.content.Context r3, androidx.appcompat.widget.AppCompatDrawableManager r4, int r5) {
            android.content.res.ColorStateList r0 = r4.getTintList(r3, r5)
            if (r0 == 0) goto L11
            androidx.appcompat.widget.TintInfo r1 = new androidx.appcompat.widget.TintInfo
            r1.<init>()
            r2 = 1
            r1.mHasTintList = r2
            r1.mTintList = r0
            return r1
        L11:
            r1 = 0
            return r1
    }

    private void setCompoundDrawables(android.graphics.drawable.Drawable r8, android.graphics.drawable.Drawable r9, android.graphics.drawable.Drawable r10, android.graphics.drawable.Drawable r11, android.graphics.drawable.Drawable r12, android.graphics.drawable.Drawable r13) {
            r7 = this;
            r0 = 3
            r1 = 1
            r2 = 2
            r3 = 0
            if (r12 != 0) goto L5e
            if (r13 == 0) goto La
            goto L5e
        La:
            if (r8 != 0) goto L15
            if (r9 != 0) goto L15
            if (r10 != 0) goto L15
            if (r11 == 0) goto L13
            goto L15
        L13:
            goto L82
        L15:
            android.widget.TextView r4 = r7.mView
            android.graphics.drawable.Drawable[] r4 = r4.getCompoundDrawablesRelative()
            r5 = r4[r3]
            if (r5 != 0) goto L48
            r5 = r4[r2]
            if (r5 == 0) goto L24
            goto L48
        L24:
            android.widget.TextView r5 = r7.mView
            android.graphics.drawable.Drawable[] r5 = r5.getCompoundDrawables()
            android.widget.TextView r6 = r7.mView
            if (r8 == 0) goto L30
            r3 = r8
            goto L32
        L30:
            r3 = r5[r3]
        L32:
            if (r9 == 0) goto L36
            r1 = r9
            goto L38
        L36:
            r1 = r5[r1]
        L38:
            if (r10 == 0) goto L3c
            r2 = r10
            goto L3e
        L3c:
            r2 = r5[r2]
        L3e:
            if (r11 == 0) goto L42
            r0 = r11
            goto L44
        L42:
            r0 = r5[r0]
        L44:
            r6.setCompoundDrawablesWithIntrinsicBounds(r3, r1, r2, r0)
            goto L82
        L48:
            if (r9 == 0) goto L4c
            r1 = r9
            goto L4e
        L4c:
            r1 = r4[r1]
        L4e:
            if (r11 == 0) goto L52
            r0 = r11
            goto L54
        L52:
            r0 = r4[r0]
        L54:
            android.widget.TextView r5 = r7.mView
            r3 = r4[r3]
            r2 = r4[r2]
            r5.setCompoundDrawablesRelativeWithIntrinsicBounds(r3, r1, r2, r0)
            return
        L5e:
            android.widget.TextView r4 = r7.mView
            android.graphics.drawable.Drawable[] r4 = r4.getCompoundDrawablesRelative()
            if (r12 == 0) goto L68
            r3 = r12
            goto L6a
        L68:
            r3 = r4[r3]
        L6a:
            if (r9 == 0) goto L6e
            r1 = r9
            goto L70
        L6e:
            r1 = r4[r1]
        L70:
            if (r13 == 0) goto L74
            r2 = r13
            goto L76
        L74:
            r2 = r4[r2]
        L76:
            android.widget.TextView r5 = r7.mView
            if (r11 == 0) goto L7c
            r0 = r11
            goto L7e
        L7c:
            r0 = r4[r0]
        L7e:
            r5.setCompoundDrawablesRelativeWithIntrinsicBounds(r3, r1, r2, r0)
            goto L13
        L82:
            return
    }

    private void setCompoundTints() {
            r1 = this;
            androidx.appcompat.widget.TintInfo r0 = r1.mDrawableTint
            r1.mDrawableLeftTint = r0
            androidx.appcompat.widget.TintInfo r0 = r1.mDrawableTint
            r1.mDrawableTopTint = r0
            androidx.appcompat.widget.TintInfo r0 = r1.mDrawableTint
            r1.mDrawableRightTint = r0
            androidx.appcompat.widget.TintInfo r0 = r1.mDrawableTint
            r1.mDrawableBottomTint = r0
            androidx.appcompat.widget.TintInfo r0 = r1.mDrawableTint
            r1.mDrawableStartTint = r0
            androidx.appcompat.widget.TintInfo r0 = r1.mDrawableTint
            r1.mDrawableEndTint = r0
            return
    }

    private void setTextSizeInternal(int r2, float r3) {
            r1 = this;
            androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper r0 = r1.mAutoSizeTextHelper
            r0.setTextSizeInternal(r2, r3)
            return
    }

    private void updateTypefaceAndStyle(android.content.Context r14, androidx.appcompat.widget.TintTypedArray r15) {
            r13 = this;
            int r0 = androidx.appcompat.R.styleable.TextAppearance_android_textStyle
            int r1 = r13.mStyle
            int r0 = r15.getInt(r0, r1)
            r13.mStyle = r0
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = -1
            r2 = 0
            r3 = 28
            if (r0 < r3) goto L25
            int r0 = androidx.appcompat.R.styleable.TextAppearance_android_textFontWeight
            int r0 = r15.getInt(r0, r1)
            r13.mFontWeight = r0
            int r0 = r13.mFontWeight
            if (r0 == r1) goto L25
            int r0 = r13.mStyle
            r0 = r0 & 2
            r0 = r0 | r2
            r13.mStyle = r0
        L25:
            int r0 = androidx.appcompat.R.styleable.TextAppearance_android_fontFamily
            boolean r0 = r15.hasValue(r0)
            r4 = 1
            if (r0 != 0) goto L5b
            int r0 = androidx.appcompat.R.styleable.TextAppearance_fontFamily
            boolean r0 = r15.hasValue(r0)
            if (r0 == 0) goto L37
            goto L5b
        L37:
            int r0 = androidx.appcompat.R.styleable.TextAppearance_android_typeface
            boolean r0 = r15.hasValue(r0)
            if (r0 == 0) goto L5a
            r13.mAsyncFontPending = r2
            int r0 = androidx.appcompat.R.styleable.TextAppearance_android_typeface
            int r0 = r15.getInt(r0, r4)
            switch(r0) {
                case 1: goto L55;
                case 2: goto L50;
                case 3: goto L4b;
                default: goto L4a;
            }
        L4a:
            goto L5a
        L4b:
            android.graphics.Typeface r1 = android.graphics.Typeface.MONOSPACE
            r13.mFontTypeface = r1
            goto L5a
        L50:
            android.graphics.Typeface r1 = android.graphics.Typeface.SERIF
            r13.mFontTypeface = r1
            goto L5a
        L55:
            android.graphics.Typeface r1 = android.graphics.Typeface.SANS_SERIF
            r13.mFontTypeface = r1
        L5a:
            return
        L5b:
            r0 = 0
            r13.mFontTypeface = r0
            int r0 = androidx.appcompat.R.styleable.TextAppearance_fontFamily
            boolean r0 = r15.hasValue(r0)
            if (r0 == 0) goto L69
            int r0 = androidx.appcompat.R.styleable.TextAppearance_fontFamily
            goto L6b
        L69:
            int r0 = androidx.appcompat.R.styleable.TextAppearance_android_fontFamily
        L6b:
            int r5 = r13.mFontWeight
            int r6 = r13.mStyle
            boolean r7 = r14.isRestricted()
            if (r7 != 0) goto Lb8
            java.lang.ref.WeakReference r7 = new java.lang.ref.WeakReference
            android.widget.TextView r8 = r13.mView
            r7.<init>(r8)
            androidx.appcompat.widget.AppCompatTextHelper$1 r8 = new androidx.appcompat.widget.AppCompatTextHelper$1
            r8.<init>(r13, r5, r6, r7)
            int r9 = r13.mStyle     // Catch: android.content.res.Resources.NotFoundException -> Lb5 java.lang.UnsupportedOperationException -> Lb7
            android.graphics.Typeface r9 = r15.getFont(r0, r9, r8)     // Catch: android.content.res.Resources.NotFoundException -> Lb5 java.lang.UnsupportedOperationException -> Lb7
            if (r9 == 0) goto Lab
            int r10 = android.os.Build.VERSION.SDK_INT     // Catch: android.content.res.Resources.NotFoundException -> Lb5 java.lang.UnsupportedOperationException -> Lb7
            if (r10 < r3) goto La9
            int r10 = r13.mFontWeight     // Catch: android.content.res.Resources.NotFoundException -> Lb5 java.lang.UnsupportedOperationException -> Lb7
            if (r10 == r1) goto La9
        L93:
            android.graphics.Typeface r10 = android.graphics.Typeface.create(r9, r2)     // Catch: android.content.res.Resources.NotFoundException -> Lb5 java.lang.UnsupportedOperationException -> Lb7
            int r11 = r13.mFontWeight     // Catch: android.content.res.Resources.NotFoundException -> Lb5 java.lang.UnsupportedOperationException -> Lb7
            int r12 = r13.mStyle     // Catch: android.content.res.Resources.NotFoundException -> Lb5 java.lang.UnsupportedOperationException -> Lb7
            r12 = r12 & 2
            if (r12 == 0) goto La1
            r12 = r4
            goto La2
        La1:
            r12 = r2
        La2:
            android.graphics.Typeface r10 = androidx.appcompat.widget.AppCompatTextHelper.Api28Impl.create(r10, r11, r12)     // Catch: android.content.res.Resources.NotFoundException -> Lb5 java.lang.UnsupportedOperationException -> Lb7
            r13.mFontTypeface = r10     // Catch: android.content.res.Resources.NotFoundException -> Lb5 java.lang.UnsupportedOperationException -> Lb7
            goto Lab
        La9:
            r13.mFontTypeface = r9     // Catch: android.content.res.Resources.NotFoundException -> Lb5 java.lang.UnsupportedOperationException -> Lb7
        Lab:
            android.graphics.Typeface r10 = r13.mFontTypeface     // Catch: android.content.res.Resources.NotFoundException -> Lb5 java.lang.UnsupportedOperationException -> Lb7
            if (r10 != 0) goto Lb1
            r10 = r4
            goto Lb2
        Lb1:
            r10 = r2
        Lb2:
            r13.mAsyncFontPending = r10     // Catch: android.content.res.Resources.NotFoundException -> Lb5 java.lang.UnsupportedOperationException -> Lb7
            goto Lb8
        Lb5:
            r9 = move-exception
            goto Lb8
        Lb7:
            r9 = move-exception
        Lb8:
            android.graphics.Typeface r7 = r13.mFontTypeface
            if (r7 != 0) goto Le7
            java.lang.String r7 = r15.getString(r0)
            if (r7 == 0) goto Le7
            int r8 = android.os.Build.VERSION.SDK_INT
            if (r8 < r3) goto Ldf
            int r3 = r13.mFontWeight
            if (r3 == r1) goto Ldf
        Lcb:
            android.graphics.Typeface r1 = android.graphics.Typeface.create(r7, r2)
            int r3 = r13.mFontWeight
            int r8 = r13.mStyle
            r8 = r8 & 2
            if (r8 == 0) goto Ld8
            r2 = r4
        Ld8:
            android.graphics.Typeface r1 = androidx.appcompat.widget.AppCompatTextHelper.Api28Impl.create(r1, r3, r2)
            r13.mFontTypeface = r1
            goto Le7
        Ldf:
            int r1 = r13.mStyle
            android.graphics.Typeface r1 = android.graphics.Typeface.create(r7, r1)
            r13.mFontTypeface = r1
        Le7:
            return
    }

    void applyCompoundDrawablesTints() {
            r5 = this;
            androidx.appcompat.widget.TintInfo r0 = r5.mDrawableLeftTint
            r1 = 2
            r2 = 0
            if (r0 != 0) goto L12
            androidx.appcompat.widget.TintInfo r0 = r5.mDrawableTopTint
            if (r0 != 0) goto L12
            androidx.appcompat.widget.TintInfo r0 = r5.mDrawableRightTint
            if (r0 != 0) goto L12
            androidx.appcompat.widget.TintInfo r0 = r5.mDrawableBottomTint
            if (r0 == 0) goto L36
        L12:
            android.widget.TextView r0 = r5.mView
            android.graphics.drawable.Drawable[] r0 = r0.getCompoundDrawables()
            r3 = r0[r2]
            androidx.appcompat.widget.TintInfo r4 = r5.mDrawableLeftTint
            r5.applyCompoundDrawableTint(r3, r4)
            r3 = 1
            r3 = r0[r3]
            androidx.appcompat.widget.TintInfo r4 = r5.mDrawableTopTint
            r5.applyCompoundDrawableTint(r3, r4)
            r3 = r0[r1]
            androidx.appcompat.widget.TintInfo r4 = r5.mDrawableRightTint
            r5.applyCompoundDrawableTint(r3, r4)
            r3 = 3
            r3 = r0[r3]
            androidx.appcompat.widget.TintInfo r4 = r5.mDrawableBottomTint
            r5.applyCompoundDrawableTint(r3, r4)
        L36:
            androidx.appcompat.widget.TintInfo r0 = r5.mDrawableStartTint
            if (r0 != 0) goto L3e
            androidx.appcompat.widget.TintInfo r0 = r5.mDrawableEndTint
            if (r0 == 0) goto L52
        L3e:
            android.widget.TextView r0 = r5.mView
            android.graphics.drawable.Drawable[] r0 = r0.getCompoundDrawablesRelative()
            r2 = r0[r2]
            androidx.appcompat.widget.TintInfo r3 = r5.mDrawableStartTint
            r5.applyCompoundDrawableTint(r2, r3)
            r1 = r0[r1]
            androidx.appcompat.widget.TintInfo r2 = r5.mDrawableEndTint
            r5.applyCompoundDrawableTint(r1, r2)
        L52:
            return
    }

    void autoSizeText() {
            r1 = this;
            androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper r0 = r1.mAutoSizeTextHelper
            r0.autoSizeText()
            return
    }

    int getAutoSizeMaxTextSize() {
            r1 = this;
            androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper r0 = r1.mAutoSizeTextHelper
            int r0 = r0.getAutoSizeMaxTextSize()
            return r0
    }

    int getAutoSizeMinTextSize() {
            r1 = this;
            androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper r0 = r1.mAutoSizeTextHelper
            int r0 = r0.getAutoSizeMinTextSize()
            return r0
    }

    int getAutoSizeStepGranularity() {
            r1 = this;
            androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper r0 = r1.mAutoSizeTextHelper
            int r0 = r0.getAutoSizeStepGranularity()
            return r0
    }

    int[] getAutoSizeTextAvailableSizes() {
            r1 = this;
            androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper r0 = r1.mAutoSizeTextHelper
            int[] r0 = r0.getAutoSizeTextAvailableSizes()
            return r0
    }

    int getAutoSizeTextType() {
            r1 = this;
            androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper r0 = r1.mAutoSizeTextHelper
            int r0 = r0.getAutoSizeTextType()
            return r0
    }

    android.content.res.ColorStateList getCompoundDrawableTintList() {
            r1 = this;
            androidx.appcompat.widget.TintInfo r0 = r1.mDrawableTint
            if (r0 == 0) goto L9
            androidx.appcompat.widget.TintInfo r0 = r1.mDrawableTint
            android.content.res.ColorStateList r0 = r0.mTintList
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    android.graphics.PorterDuff.Mode getCompoundDrawableTintMode() {
            r1 = this;
            androidx.appcompat.widget.TintInfo r0 = r1.mDrawableTint
            if (r0 == 0) goto L9
            androidx.appcompat.widget.TintInfo r0 = r1.mDrawableTint
            android.graphics.PorterDuff$Mode r0 = r0.mTintMode
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    boolean isAutoSizeEnabled() {
            r1 = this;
            androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper r0 = r1.mAutoSizeTextHelper
            boolean r0 = r0.isAutoSizeEnabled()
            return r0
    }

    void loadFromAttributes(android.util.AttributeSet r37, int r38) {
            r36 = this;
            r0 = r36
            r4 = r37
            r6 = r38
            android.widget.TextView r1 = r0.mView
            android.content.Context r8 = r1.getContext()
            androidx.appcompat.widget.AppCompatDrawableManager r9 = androidx.appcompat.widget.AppCompatDrawableManager.get()
            int[] r1 = androidx.appcompat.R.styleable.AppCompatTextHelper
            r10 = 0
            androidx.appcompat.widget.TintTypedArray r11 = androidx.appcompat.widget.TintTypedArray.obtainStyledAttributes(r8, r4, r1, r6, r10)
            android.widget.TextView r1 = r0.mView
            android.widget.TextView r2 = r0.mView
            android.content.Context r2 = r2.getContext()
            int[] r3 = androidx.appcompat.R.styleable.AppCompatTextHelper
            android.content.res.TypedArray r5 = r11.getWrappedTypeArray()
            r7 = 0
            androidx.core.view.ViewCompat.saveAttributeDataForStyleable(r1, r2, r3, r4, r5, r6, r7)
            r7 = r4
            r12 = r6
            int r1 = androidx.appcompat.R.styleable.AppCompatTextHelper_android_textAppearance
            r13 = -1
            int r14 = r11.getResourceId(r1, r13)
            int r1 = androidx.appcompat.R.styleable.AppCompatTextHelper_android_drawableLeft
            boolean r1 = r11.hasValue(r1)
            if (r1 == 0) goto L46
            int r1 = androidx.appcompat.R.styleable.AppCompatTextHelper_android_drawableLeft
            int r1 = r11.getResourceId(r1, r10)
            androidx.appcompat.widget.TintInfo r1 = createTintInfo(r8, r9, r1)
            r0.mDrawableLeftTint = r1
        L46:
            int r1 = androidx.appcompat.R.styleable.AppCompatTextHelper_android_drawableTop
            boolean r1 = r11.hasValue(r1)
            if (r1 == 0) goto L5a
            int r1 = androidx.appcompat.R.styleable.AppCompatTextHelper_android_drawableTop
            int r1 = r11.getResourceId(r1, r10)
            androidx.appcompat.widget.TintInfo r1 = createTintInfo(r8, r9, r1)
            r0.mDrawableTopTint = r1
        L5a:
            int r1 = androidx.appcompat.R.styleable.AppCompatTextHelper_android_drawableRight
            boolean r1 = r11.hasValue(r1)
            if (r1 == 0) goto L6e
            int r1 = androidx.appcompat.R.styleable.AppCompatTextHelper_android_drawableRight
            int r1 = r11.getResourceId(r1, r10)
            androidx.appcompat.widget.TintInfo r1 = createTintInfo(r8, r9, r1)
            r0.mDrawableRightTint = r1
        L6e:
            int r1 = androidx.appcompat.R.styleable.AppCompatTextHelper_android_drawableBottom
            boolean r1 = r11.hasValue(r1)
            if (r1 == 0) goto L82
            int r1 = androidx.appcompat.R.styleable.AppCompatTextHelper_android_drawableBottom
            int r1 = r11.getResourceId(r1, r10)
            androidx.appcompat.widget.TintInfo r1 = createTintInfo(r8, r9, r1)
            r0.mDrawableBottomTint = r1
        L82:
            int r1 = androidx.appcompat.R.styleable.AppCompatTextHelper_android_drawableStart
            boolean r1 = r11.hasValue(r1)
            if (r1 == 0) goto L96
            int r1 = androidx.appcompat.R.styleable.AppCompatTextHelper_android_drawableStart
            int r1 = r11.getResourceId(r1, r10)
            androidx.appcompat.widget.TintInfo r1 = createTintInfo(r8, r9, r1)
            r0.mDrawableStartTint = r1
        L96:
            int r1 = androidx.appcompat.R.styleable.AppCompatTextHelper_android_drawableEnd
            boolean r1 = r11.hasValue(r1)
            if (r1 == 0) goto Laa
            int r1 = androidx.appcompat.R.styleable.AppCompatTextHelper_android_drawableEnd
            int r1 = r11.getResourceId(r1, r10)
            androidx.appcompat.widget.TintInfo r1 = createTintInfo(r8, r9, r1)
            r0.mDrawableEndTint = r1
        Laa:
            r11.recycle()
            android.widget.TextView r1 = r0.mView
            android.text.method.TransformationMethod r1 = r1.getTransformationMethod()
            boolean r15 = r1 instanceof android.text.method.PasswordTransformationMethod
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r16 = 0
            if (r14 == r13) goto L102
            int[] r13 = androidx.appcompat.R.styleable.TextAppearance
            androidx.appcompat.widget.TintTypedArray r11 = androidx.appcompat.widget.TintTypedArray.obtainStyledAttributes(r8, r14, r13)
            if (r15 != 0) goto Ld7
            int r13 = androidx.appcompat.R.styleable.TextAppearance_textAllCaps
            boolean r13 = r11.hasValue(r13)
            if (r13 == 0) goto Ld7
            r2 = 1
            int r13 = androidx.appcompat.R.styleable.TextAppearance_textAllCaps
            r10 = 0
            boolean r1 = r11.getBoolean(r13, r10)
        Ld7:
            r0.updateTypefaceAndStyle(r8, r11)
            int r10 = androidx.appcompat.R.styleable.TextAppearance_textLocale
            boolean r10 = r11.hasValue(r10)
            if (r10 == 0) goto Leb
            int r10 = androidx.appcompat.R.styleable.TextAppearance_textLocale
            java.lang.String r10 = r11.getString(r10)
            r16 = r10
        Leb:
            int r10 = android.os.Build.VERSION.SDK_INT
            r13 = 26
            if (r10 < r13) goto Lff
            int r10 = androidx.appcompat.R.styleable.TextAppearance_fontVariationSettings
            boolean r10 = r11.hasValue(r10)
            if (r10 == 0) goto Lff
            int r10 = androidx.appcompat.R.styleable.TextAppearance_fontVariationSettings
            java.lang.String r6 = r11.getString(r10)
        Lff:
            r11.recycle()
        L102:
            int[] r10 = androidx.appcompat.R.styleable.TextAppearance
            r13 = 0
            androidx.appcompat.widget.TintTypedArray r10 = androidx.appcompat.widget.TintTypedArray.obtainStyledAttributes(r8, r7, r10, r12, r13)
            if (r15 != 0) goto L11d
            int r11 = androidx.appcompat.R.styleable.TextAppearance_textAllCaps
            boolean r11 = r10.hasValue(r11)
            if (r11 == 0) goto L11d
            r2 = 1
            int r11 = androidx.appcompat.R.styleable.TextAppearance_textAllCaps
            boolean r1 = r10.getBoolean(r11, r13)
            r11 = r1
            r13 = r2
            goto L11f
        L11d:
            r11 = r1
            r13 = r2
        L11f:
            int r1 = androidx.appcompat.R.styleable.TextAppearance_textLocale
            boolean r1 = r10.hasValue(r1)
            if (r1 == 0) goto L12e
            int r1 = androidx.appcompat.R.styleable.TextAppearance_textLocale
            java.lang.String r16 = r10.getString(r1)
        L12e:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 26
            if (r1 < r2) goto L144
            int r1 = androidx.appcompat.R.styleable.TextAppearance_fontVariationSettings
            boolean r1 = r10.hasValue(r1)
            if (r1 == 0) goto L144
            int r1 = androidx.appcompat.R.styleable.TextAppearance_fontVariationSettings
            java.lang.String r6 = r10.getString(r1)
            r1 = r6
            goto L145
        L144:
            r1 = r6
        L145:
            int r2 = android.os.Build.VERSION.SDK_INT
            r6 = 28
            if (r2 < r6) goto L16c
            int r2 = androidx.appcompat.R.styleable.TextAppearance_android_textSize
            boolean r2 = r10.hasValue(r2)
            if (r2 == 0) goto L169
            int r2 = androidx.appcompat.R.styleable.TextAppearance_android_textSize
            r6 = -1
            int r2 = r10.getDimensionPixelSize(r2, r6)
            if (r2 != 0) goto L166
            android.widget.TextView r2 = r0.mView
            r6 = 0
            r19 = r13
            r13 = 0
            r2.setTextSize(r13, r6)
            goto L16e
        L166:
            r19 = r13
            goto L16e
        L169:
            r19 = r13
            goto L16e
        L16c:
            r19 = r13
        L16e:
            r0.updateTypefaceAndStyle(r8, r10)
            r10.recycle()
            if (r3 == 0) goto L17b
            android.widget.TextView r2 = r0.mView
            r2.setTextColor(r3)
        L17b:
            if (r4 == 0) goto L182
            android.widget.TextView r2 = r0.mView
            r2.setHintTextColor(r4)
        L182:
            if (r5 == 0) goto L189
            android.widget.TextView r2 = r0.mView
            r2.setLinkTextColor(r5)
        L189:
            if (r15 != 0) goto L190
            if (r19 == 0) goto L190
            r0.setAllCaps(r11)
        L190:
            android.graphics.Typeface r2 = r0.mFontTypeface
            if (r2 == 0) goto L1aa
            int r2 = r0.mFontWeight
            r6 = -1
            if (r2 != r6) goto L1a3
            android.widget.TextView r2 = r0.mView
            android.graphics.Typeface r6 = r0.mFontTypeface
            int r13 = r0.mStyle
            r2.setTypeface(r6, r13)
            goto L1aa
        L1a3:
            android.widget.TextView r2 = r0.mView
            android.graphics.Typeface r6 = r0.mFontTypeface
            r2.setTypeface(r6)
        L1aa:
            if (r1 == 0) goto L1b1
            android.widget.TextView r2 = r0.mView
            androidx.appcompat.widget.AppCompatTextHelper.Api26Impl.setFontVariationSettings(r2, r1)
        L1b1:
            if (r16 == 0) goto L1bd
        L1b4:
            android.widget.TextView r2 = r0.mView
            android.os.LocaleList r6 = androidx.appcompat.widget.AppCompatTextHelper.Api24Impl.forLanguageTags(r16)
            androidx.appcompat.widget.AppCompatTextHelper.Api24Impl.setTextLocales(r2, r6)
        L1bd:
            androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper r2 = r0.mAutoSizeTextHelper
            r2.loadFromAttributes(r7, r12)
            boolean r2 = androidx.appcompat.widget.ViewUtils.SDK_LEVEL_SUPPORTS_AUTOSIZE
            r13 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r2 == 0) goto L226
            androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper r2 = r0.mAutoSizeTextHelper
            int r2 = r2.getAutoSizeTextType()
            if (r2 == 0) goto L21d
            androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper r2 = r0.mAutoSizeTextHelper
            int[] r2 = r2.getAutoSizeTextAvailableSizes()
            int r6 = r2.length
            if (r6 <= 0) goto L214
            android.widget.TextView r6 = r0.mView
            int r6 = androidx.appcompat.widget.AppCompatTextHelper.Api26Impl.getAutoSizeStepGranularity(r6)
            float r6 = (float) r6
            int r6 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            if (r6 == 0) goto L205
            android.widget.TextView r6 = r0.mView
            r20 = r13
            androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper r13 = r0.mAutoSizeTextHelper
            int r13 = r13.getAutoSizeMinTextSize()
            r21 = r1
            androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper r1 = r0.mAutoSizeTextHelper
            int r1 = r1.getAutoSizeMaxTextSize()
            r22 = r3
            androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper r3 = r0.mAutoSizeTextHelper
            int r3 = r3.getAutoSizeStepGranularity()
            r23 = r4
            r4 = 0
            androidx.appcompat.widget.AppCompatTextHelper.Api26Impl.setAutoSizeTextTypeUniformWithConfiguration(r6, r13, r1, r3, r4)
            goto L22e
        L205:
            r21 = r1
            r22 = r3
            r23 = r4
            r20 = r13
            r4 = 0
            android.widget.TextView r1 = r0.mView
            androidx.appcompat.widget.AppCompatTextHelper.Api26Impl.setAutoSizeTextTypeUniformWithPresetSizes(r1, r2, r4)
            goto L22e
        L214:
            r21 = r1
            r22 = r3
            r23 = r4
            r20 = r13
            goto L22e
        L21d:
            r21 = r1
            r22 = r3
            r23 = r4
            r20 = r13
            goto L22e
        L226:
            r21 = r1
            r22 = r3
            r23 = r4
            r20 = r13
        L22e:
            int[] r1 = androidx.appcompat.R.styleable.AppCompatTextView
            androidx.appcompat.widget.TintTypedArray r10 = androidx.appcompat.widget.TintTypedArray.obtainStyledAttributes(r8, r7, r1)
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r6 = 0
            r13 = 0
            int r0 = androidx.appcompat.R.styleable.AppCompatTextView_drawableLeftCompat
            r17 = r1
            r1 = -1
            int r0 = r10.getResourceId(r0, r1)
            if (r0 == r1) goto L249
            android.graphics.drawable.Drawable r17 = r9.getDrawable(r8, r0)
        L249:
            r24 = r0
            int r0 = androidx.appcompat.R.styleable.AppCompatTextView_drawableTopCompat
            int r0 = r10.getResourceId(r0, r1)
            if (r0 == r1) goto L257
            android.graphics.drawable.Drawable r2 = r9.getDrawable(r8, r0)
        L257:
            r25 = r0
            int r0 = androidx.appcompat.R.styleable.AppCompatTextView_drawableRightCompat
            int r0 = r10.getResourceId(r0, r1)
            if (r0 == r1) goto L265
            android.graphics.drawable.Drawable r3 = r9.getDrawable(r8, r0)
        L265:
            r26 = r0
            int r0 = androidx.appcompat.R.styleable.AppCompatTextView_drawableBottomCompat
            int r0 = r10.getResourceId(r0, r1)
            if (r0 == r1) goto L273
            android.graphics.drawable.Drawable r4 = r9.getDrawable(r8, r0)
        L273:
            r27 = r0
            int r0 = androidx.appcompat.R.styleable.AppCompatTextView_drawableStartCompat
            int r0 = r10.getResourceId(r0, r1)
            if (r0 == r1) goto L281
            android.graphics.drawable.Drawable r6 = r9.getDrawable(r8, r0)
        L281:
            r28 = r0
            int r0 = androidx.appcompat.R.styleable.AppCompatTextView_drawableEndCompat
            int r0 = r10.getResourceId(r0, r1)
            if (r0 == r1) goto L28f
            android.graphics.drawable.Drawable r13 = r9.getDrawable(r8, r0)
        L28f:
            r1 = r13
            r13 = r5
            r5 = r6
            r6 = r1
            r1 = r17
            r17 = r0
            r0 = r36
            r0.setCompoundDrawables(r1, r2, r3, r4, r5, r6)
            r29 = r1
            int r1 = androidx.appcompat.R.styleable.AppCompatTextView_drawableTint
            boolean r1 = r10.hasValue(r1)
            if (r1 == 0) goto L2b4
            int r1 = androidx.appcompat.R.styleable.AppCompatTextView_drawableTint
            android.content.res.ColorStateList r1 = r10.getColorStateList(r1)
            r30 = r2
            android.widget.TextView r2 = r0.mView
            androidx.core.widget.TextViewCompat.setCompoundDrawableTintList(r2, r1)
            goto L2b6
        L2b4:
            r30 = r2
        L2b6:
            int r1 = androidx.appcompat.R.styleable.AppCompatTextView_drawableTintMode
            boolean r1 = r10.hasValue(r1)
            if (r1 == 0) goto L2cf
            int r1 = androidx.appcompat.R.styleable.AppCompatTextView_drawableTintMode
            r2 = -1
            int r1 = r10.getInt(r1, r2)
            r2 = 0
            android.graphics.PorterDuff$Mode r1 = androidx.appcompat.widget.DrawableUtils.parseTintMode(r1, r2)
            android.widget.TextView r2 = r0.mView
            androidx.core.widget.TextViewCompat.setCompoundDrawableTintMode(r2, r1)
        L2cf:
            int r1 = androidx.appcompat.R.styleable.AppCompatTextView_firstBaselineToTopHeight
            r2 = -1
            int r1 = r10.getDimensionPixelSize(r1, r2)
            r31 = r3
            int r3 = androidx.appcompat.R.styleable.AppCompatTextView_lastBaselineToBottomHeight
            int r3 = r10.getDimensionPixelSize(r3, r2)
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            r32 = -1
            r33 = r2
            int r2 = androidx.appcompat.R.styleable.AppCompatTextView_lineHeight
            boolean r2 = r10.hasValue(r2)
            if (r2 == 0) goto L31e
            int r2 = androidx.appcompat.R.styleable.AppCompatTextView_lineHeight
            android.util.TypedValue r2 = r10.peekValue(r2)
            if (r2 == 0) goto L30e
            r34 = r4
            int r4 = r2.type
            r35 = r5
            r5 = 5
            if (r4 != r5) goto L312
            int r4 = r2.data
            int r32 = androidx.core.util.TypedValueCompat.getUnitFromComplexDimension(r4)
            int r4 = r2.data
            float r4 = android.util.TypedValue.complexToFloat(r4)
            r2 = r4
            r4 = r32
            r5 = -1
            goto L327
        L30e:
            r34 = r4
            r35 = r5
        L312:
            int r4 = androidx.appcompat.R.styleable.AppCompatTextView_lineHeight
            r5 = -1
            int r4 = r10.getDimensionPixelSize(r4, r5)
            float r4 = (float) r4
            r2 = r4
            r4 = r32
            goto L327
        L31e:
            r34 = r4
            r35 = r5
            r5 = -1
            r4 = r32
            r2 = r33
        L327:
            r10.recycle()
            if (r1 == r5) goto L331
            android.widget.TextView r5 = r0.mView
            androidx.core.widget.TextViewCompat.setFirstBaselineToTopHeight(r5, r1)
        L331:
            r5 = -1
            if (r3 == r5) goto L339
            android.widget.TextView r5 = r0.mView
            androidx.core.widget.TextViewCompat.setLastBaselineToBottomHeight(r5, r3)
        L339:
            int r5 = (r2 > r20 ? 1 : (r2 == r20 ? 0 : -1))
            if (r5 == 0) goto L351
            r5 = -1
            if (r4 != r5) goto L349
            android.widget.TextView r5 = r0.mView
            r18 = r1
            int r1 = (int) r2
            androidx.core.widget.TextViewCompat.setLineHeight(r5, r1)
            goto L353
        L349:
            r18 = r1
            android.widget.TextView r1 = r0.mView
            androidx.core.widget.TextViewCompat.setLineHeight(r1, r4, r2)
            goto L353
        L351:
            r18 = r1
        L353:
            return
    }

    void onAsyncTypefaceReceived(java.lang.ref.WeakReference<android.widget.TextView> r4, android.graphics.Typeface r5) {
            r3 = this;
            boolean r0 = r3.mAsyncFontPending
            if (r0 == 0) goto L24
            r3.mFontTypeface = r5
            java.lang.Object r0 = r4.get()
            android.widget.TextView r0 = (android.widget.TextView) r0
            if (r0 == 0) goto L24
            boolean r1 = r0.isAttachedToWindow()
            if (r1 == 0) goto L1f
            int r1 = r3.mStyle
            androidx.appcompat.widget.AppCompatTextHelper$2 r2 = new androidx.appcompat.widget.AppCompatTextHelper$2
            r2.<init>(r3, r0, r5, r1)
            r0.post(r2)
            goto L24
        L1f:
            int r1 = r3.mStyle
            r0.setTypeface(r5, r1)
        L24:
            return
    }

    void onLayout(boolean r2, int r3, int r4, int r5, int r6) {
            r1 = this;
            boolean r0 = androidx.appcompat.widget.ViewUtils.SDK_LEVEL_SUPPORTS_AUTOSIZE
            if (r0 != 0) goto L7
            r1.autoSizeText()
        L7:
            return
    }

    void onSetCompoundDrawables() {
            r0 = this;
            r0.applyCompoundDrawablesTints()
            return
    }

    void onSetTextAppearance(android.content.Context r5, int r6) {
            r4 = this;
            int[] r0 = androidx.appcompat.R.styleable.TextAppearance
            androidx.appcompat.widget.TintTypedArray r0 = androidx.appcompat.widget.TintTypedArray.obtainStyledAttributes(r5, r6, r0)
            int r1 = androidx.appcompat.R.styleable.TextAppearance_textAllCaps
            boolean r1 = r0.hasValue(r1)
            r2 = 0
            if (r1 == 0) goto L18
            int r1 = androidx.appcompat.R.styleable.TextAppearance_textAllCaps
            boolean r1 = r0.getBoolean(r1, r2)
            r4.setAllCaps(r1)
        L18:
            int r1 = androidx.appcompat.R.styleable.TextAppearance_android_textSize
            boolean r1 = r0.hasValue(r1)
            if (r1 == 0) goto L30
            int r1 = androidx.appcompat.R.styleable.TextAppearance_android_textSize
            r3 = -1
            int r1 = r0.getDimensionPixelSize(r1, r3)
            if (r1 != 0) goto L30
            android.widget.TextView r1 = r4.mView
            r3 = 0
            r1.setTextSize(r2, r3)
        L30:
            r4.updateTypefaceAndStyle(r5, r0)
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 26
            if (r1 < r2) goto L4e
            int r1 = androidx.appcompat.R.styleable.TextAppearance_fontVariationSettings
            boolean r1 = r0.hasValue(r1)
            if (r1 == 0) goto L4e
            int r1 = androidx.appcompat.R.styleable.TextAppearance_fontVariationSettings
            java.lang.String r1 = r0.getString(r1)
            if (r1 == 0) goto L4e
            android.widget.TextView r2 = r4.mView
            androidx.appcompat.widget.AppCompatTextHelper.Api26Impl.setFontVariationSettings(r2, r1)
        L4e:
            r0.recycle()
            android.graphics.Typeface r1 = r4.mFontTypeface
            if (r1 == 0) goto L5e
            android.widget.TextView r1 = r4.mView
            android.graphics.Typeface r2 = r4.mFontTypeface
            int r3 = r4.mStyle
            r1.setTypeface(r2, r3)
        L5e:
            return
    }

    void populateSurroundingTextIfNeeded(android.widget.TextView r3, android.view.inputmethod.InputConnection r4, android.view.inputmethod.EditorInfo r5) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 >= r1) goto Lf
            if (r4 == 0) goto Lf
            java.lang.CharSequence r0 = r3.getText()
            androidx.core.view.inputmethod.EditorInfoCompat.setInitialSurroundingText(r5, r0)
        Lf:
            return
    }

    void setAllCaps(boolean r2) {
            r1 = this;
            android.widget.TextView r0 = r1.mView
            r0.setAllCaps(r2)
            return
    }

    void setAutoSizeTextTypeUniformWithConfiguration(int r2, int r3, int r4, int r5) throws java.lang.IllegalArgumentException {
            r1 = this;
            androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper r0 = r1.mAutoSizeTextHelper
            r0.setAutoSizeTextTypeUniformWithConfiguration(r2, r3, r4, r5)
            return
    }

    void setAutoSizeTextTypeUniformWithPresetSizes(int[] r2, int r3) throws java.lang.IllegalArgumentException {
            r1 = this;
            androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper r0 = r1.mAutoSizeTextHelper
            r0.setAutoSizeTextTypeUniformWithPresetSizes(r2, r3)
            return
    }

    void setAutoSizeTextTypeWithDefaults(int r2) {
            r1 = this;
            androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper r0 = r1.mAutoSizeTextHelper
            r0.setAutoSizeTextTypeWithDefaults(r2)
            return
    }

    void setCompoundDrawableTintList(android.content.res.ColorStateList r3) {
            r2 = this;
            androidx.appcompat.widget.TintInfo r0 = r2.mDrawableTint
            if (r0 != 0) goto Lb
            androidx.appcompat.widget.TintInfo r0 = new androidx.appcompat.widget.TintInfo
            r0.<init>()
            r2.mDrawableTint = r0
        Lb:
            androidx.appcompat.widget.TintInfo r0 = r2.mDrawableTint
            r0.mTintList = r3
            androidx.appcompat.widget.TintInfo r0 = r2.mDrawableTint
            if (r3 == 0) goto L15
            r1 = 1
            goto L16
        L15:
            r1 = 0
        L16:
            r0.mHasTintList = r1
            r2.setCompoundTints()
            return
    }

    void setCompoundDrawableTintMode(android.graphics.PorterDuff.Mode r3) {
            r2 = this;
            androidx.appcompat.widget.TintInfo r0 = r2.mDrawableTint
            if (r0 != 0) goto Lb
            androidx.appcompat.widget.TintInfo r0 = new androidx.appcompat.widget.TintInfo
            r0.<init>()
            r2.mDrawableTint = r0
        Lb:
            androidx.appcompat.widget.TintInfo r0 = r2.mDrawableTint
            r0.mTintMode = r3
            androidx.appcompat.widget.TintInfo r0 = r2.mDrawableTint
            if (r3 == 0) goto L15
            r1 = 1
            goto L16
        L15:
            r1 = 0
        L16:
            r0.mHasTintMode = r1
            r2.setCompoundTints()
            return
    }

    void setTextSize(int r2, float r3) {
            r1 = this;
            boolean r0 = androidx.appcompat.widget.ViewUtils.SDK_LEVEL_SUPPORTS_AUTOSIZE
            if (r0 != 0) goto Ld
            boolean r0 = r1.isAutoSizeEnabled()
            if (r0 != 0) goto Ld
            r1.setTextSizeInternal(r2, r3)
        Ld:
            return
    }
}
