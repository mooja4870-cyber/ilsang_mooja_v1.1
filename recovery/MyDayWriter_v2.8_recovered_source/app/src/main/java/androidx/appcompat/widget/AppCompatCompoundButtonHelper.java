package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
class AppCompatCompoundButtonHelper {
    private android.content.res.ColorStateList mButtonTintList;
    private android.graphics.PorterDuff.Mode mButtonTintMode;
    private boolean mHasButtonTint;
    private boolean mHasButtonTintMode;
    private boolean mSkipNextApply;
    private final android.widget.CompoundButton mView;

    AppCompatCompoundButtonHelper(android.widget.CompoundButton r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.mButtonTintList = r0
            r1.mButtonTintMode = r0
            r0 = 0
            r1.mHasButtonTint = r0
            r1.mHasButtonTintMode = r0
            r1.mView = r2
            return
    }

    void applyButtonTint() {
            r2 = this;
            android.widget.CompoundButton r0 = r2.mView
            android.graphics.drawable.Drawable r0 = androidx.core.widget.CompoundButtonCompat.getButtonDrawable(r0)
            if (r0 == 0) goto L3e
            boolean r1 = r2.mHasButtonTint
            if (r1 != 0) goto L10
            boolean r1 = r2.mHasButtonTintMode
            if (r1 == 0) goto L3e
        L10:
            android.graphics.drawable.Drawable r0 = androidx.core.graphics.drawable.DrawableCompat.wrap(r0)
            android.graphics.drawable.Drawable r0 = r0.mutate()
            boolean r1 = r2.mHasButtonTint
            if (r1 == 0) goto L21
            android.content.res.ColorStateList r1 = r2.mButtonTintList
            androidx.core.graphics.drawable.DrawableCompat.setTintList(r0, r1)
        L21:
            boolean r1 = r2.mHasButtonTintMode
            if (r1 == 0) goto L2a
            android.graphics.PorterDuff$Mode r1 = r2.mButtonTintMode
            androidx.core.graphics.drawable.DrawableCompat.setTintMode(r0, r1)
        L2a:
            boolean r1 = r0.isStateful()
            if (r1 == 0) goto L39
            android.widget.CompoundButton r1 = r2.mView
            int[] r1 = r1.getDrawableState()
            r0.setState(r1)
        L39:
            android.widget.CompoundButton r1 = r2.mView
            r1.setButtonDrawable(r0)
        L3e:
            return
    }

    android.content.res.ColorStateList getSupportButtonTintList() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.mButtonTintList
            return r0
    }

    android.graphics.PorterDuff.Mode getSupportButtonTintMode() {
            r1 = this;
            android.graphics.PorterDuff$Mode r0 = r1.mButtonTintMode
            return r0
    }

    void loadFromAttributes(android.util.AttributeSet r11, int r12) {
            r10 = this;
            android.widget.CompoundButton r0 = r10.mView
            android.content.Context r0 = r0.getContext()
            int[] r1 = androidx.appcompat.R.styleable.CompoundButton
            r2 = 0
            androidx.appcompat.widget.TintTypedArray r1 = androidx.appcompat.widget.TintTypedArray.obtainStyledAttributes(r0, r11, r1, r12, r2)
            android.widget.CompoundButton r3 = r10.mView
            android.widget.CompoundButton r0 = r10.mView
            android.content.Context r4 = r0.getContext()
            int[] r5 = androidx.appcompat.R.styleable.CompoundButton
            android.content.res.TypedArray r7 = r1.getWrappedTypeArray()
            r9 = 0
            r6 = r11
            r8 = r12
            androidx.core.view.ViewCompat.saveAttributeDataForStyleable(r3, r4, r5, r6, r7, r8, r9)
            r11 = 0
            int r12 = androidx.appcompat.R.styleable.CompoundButton_buttonCompat     // Catch: java.lang.Throwable -> L96
            boolean r12 = r1.hasValue(r12)     // Catch: java.lang.Throwable -> L96
            if (r12 == 0) goto L44
            int r12 = androidx.appcompat.R.styleable.CompoundButton_buttonCompat     // Catch: java.lang.Throwable -> L96
            int r12 = r1.getResourceId(r12, r2)     // Catch: java.lang.Throwable -> L96
            if (r12 == 0) goto L44
            android.widget.CompoundButton r0 = r10.mView     // Catch: android.content.res.Resources.NotFoundException -> L43 java.lang.Throwable -> L96
            android.widget.CompoundButton r3 = r10.mView     // Catch: android.content.res.Resources.NotFoundException -> L43 java.lang.Throwable -> L96
            android.content.Context r3 = r3.getContext()     // Catch: android.content.res.Resources.NotFoundException -> L43 java.lang.Throwable -> L96
            android.graphics.drawable.Drawable r3 = androidx.appcompat.content.res.AppCompatResources.getDrawable(r3, r12)     // Catch: android.content.res.Resources.NotFoundException -> L43 java.lang.Throwable -> L96
            r0.setButtonDrawable(r3)     // Catch: android.content.res.Resources.NotFoundException -> L43 java.lang.Throwable -> L96
            r11 = 1
            goto L44
        L43:
            r0 = move-exception
        L44:
            if (r11 != 0) goto L65
            int r12 = androidx.appcompat.R.styleable.CompoundButton_android_button     // Catch: java.lang.Throwable -> L96
            boolean r12 = r1.hasValue(r12)     // Catch: java.lang.Throwable -> L96
            if (r12 == 0) goto L65
            int r12 = androidx.appcompat.R.styleable.CompoundButton_android_button     // Catch: java.lang.Throwable -> L96
            int r12 = r1.getResourceId(r12, r2)     // Catch: java.lang.Throwable -> L96
            if (r12 == 0) goto L65
            android.widget.CompoundButton r0 = r10.mView     // Catch: java.lang.Throwable -> L96
            android.widget.CompoundButton r2 = r10.mView     // Catch: java.lang.Throwable -> L96
            android.content.Context r2 = r2.getContext()     // Catch: java.lang.Throwable -> L96
            android.graphics.drawable.Drawable r2 = androidx.appcompat.content.res.AppCompatResources.getDrawable(r2, r12)     // Catch: java.lang.Throwable -> L96
            r0.setButtonDrawable(r2)     // Catch: java.lang.Throwable -> L96
        L65:
            int r12 = androidx.appcompat.R.styleable.CompoundButton_buttonTint     // Catch: java.lang.Throwable -> L96
            boolean r12 = r1.hasValue(r12)     // Catch: java.lang.Throwable -> L96
            if (r12 == 0) goto L78
            android.widget.CompoundButton r12 = r10.mView     // Catch: java.lang.Throwable -> L96
            int r0 = androidx.appcompat.R.styleable.CompoundButton_buttonTint     // Catch: java.lang.Throwable -> L96
            android.content.res.ColorStateList r0 = r1.getColorStateList(r0)     // Catch: java.lang.Throwable -> L96
            androidx.core.widget.CompoundButtonCompat.setButtonTintList(r12, r0)     // Catch: java.lang.Throwable -> L96
        L78:
            int r12 = androidx.appcompat.R.styleable.CompoundButton_buttonTintMode     // Catch: java.lang.Throwable -> L96
            boolean r12 = r1.hasValue(r12)     // Catch: java.lang.Throwable -> L96
            if (r12 == 0) goto L91
            android.widget.CompoundButton r12 = r10.mView     // Catch: java.lang.Throwable -> L96
            int r0 = androidx.appcompat.R.styleable.CompoundButton_buttonTintMode     // Catch: java.lang.Throwable -> L96
            r2 = -1
            int r0 = r1.getInt(r0, r2)     // Catch: java.lang.Throwable -> L96
            r2 = 0
            android.graphics.PorterDuff$Mode r0 = androidx.appcompat.widget.DrawableUtils.parseTintMode(r0, r2)     // Catch: java.lang.Throwable -> L96
            androidx.core.widget.CompoundButtonCompat.setButtonTintMode(r12, r0)     // Catch: java.lang.Throwable -> L96
        L91:
            r1.recycle()
            return
        L96:
            r0 = move-exception
            r11 = r0
            r1.recycle()
            throw r11
    }

    void onSetButtonDrawable() {
            r1 = this;
            boolean r0 = r1.mSkipNextApply
            if (r0 == 0) goto L8
            r0 = 0
            r1.mSkipNextApply = r0
            return
        L8:
            r0 = 1
            r1.mSkipNextApply = r0
            r1.applyButtonTint()
            return
    }

    void setSupportButtonTintList(android.content.res.ColorStateList r2) {
            r1 = this;
            r1.mButtonTintList = r2
            r0 = 1
            r1.mHasButtonTint = r0
            r1.applyButtonTint()
            return
    }

    void setSupportButtonTintMode(android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            r1.mButtonTintMode = r2
            r0 = 1
            r1.mHasButtonTintMode = r0
            r1.applyButtonTint()
            return
    }
}
