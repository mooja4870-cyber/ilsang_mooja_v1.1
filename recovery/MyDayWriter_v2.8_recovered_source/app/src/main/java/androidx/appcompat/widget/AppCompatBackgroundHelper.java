package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
class AppCompatBackgroundHelper {
    private int mBackgroundResId;
    private androidx.appcompat.widget.TintInfo mBackgroundTint;
    private final androidx.appcompat.widget.AppCompatDrawableManager mDrawableManager;
    private androidx.appcompat.widget.TintInfo mInternalBackgroundTint;
    private androidx.appcompat.widget.TintInfo mTmpInfo;
    private final android.view.View mView;

    AppCompatBackgroundHelper(android.view.View r2) {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.mBackgroundResId = r0
            r1.mView = r2
            androidx.appcompat.widget.AppCompatDrawableManager r0 = androidx.appcompat.widget.AppCompatDrawableManager.get()
            r1.mDrawableManager = r0
            return
    }

    private boolean applyFrameworkTintUsingColorFilter(android.graphics.drawable.Drawable r6) {
            r5 = this;
            androidx.appcompat.widget.TintInfo r0 = r5.mTmpInfo
            if (r0 != 0) goto Lb
            androidx.appcompat.widget.TintInfo r0 = new androidx.appcompat.widget.TintInfo
            r0.<init>()
            r5.mTmpInfo = r0
        Lb:
            androidx.appcompat.widget.TintInfo r0 = r5.mTmpInfo
            r0.clear()
            android.view.View r1 = r5.mView
            android.content.res.ColorStateList r1 = androidx.core.view.ViewCompat.getBackgroundTintList(r1)
            r2 = 1
            if (r1 == 0) goto L1d
            r0.mHasTintList = r2
            r0.mTintList = r1
        L1d:
            android.view.View r3 = r5.mView
            android.graphics.PorterDuff$Mode r3 = androidx.core.view.ViewCompat.getBackgroundTintMode(r3)
            if (r3 == 0) goto L29
            r0.mHasTintMode = r2
            r0.mTintMode = r3
        L29:
            boolean r4 = r0.mHasTintList
            if (r4 != 0) goto L34
            boolean r4 = r0.mHasTintMode
            if (r4 == 0) goto L32
            goto L34
        L32:
            r2 = 0
            return r2
        L34:
            android.view.View r4 = r5.mView
            int[] r4 = r4.getDrawableState()
            androidx.appcompat.widget.AppCompatDrawableManager.tintDrawable(r6, r0, r4)
            return r2
    }

    private boolean shouldApplyFrameworkTintUsingColorFilter() {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            androidx.appcompat.widget.TintInfo r1 = r2.mInternalBackgroundTint
            if (r1 == 0) goto L9
            r1 = 1
            goto La
        L9:
            r1 = 0
        La:
            return r1
    }

    void applySupportBackgroundTint() {
            r3 = this;
            android.view.View r0 = r3.mView
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            if (r0 == 0) goto L34
            boolean r1 = r3.shouldApplyFrameworkTintUsingColorFilter()
            if (r1 == 0) goto L15
            boolean r1 = r3.applyFrameworkTintUsingColorFilter(r0)
            if (r1 == 0) goto L15
            return
        L15:
            androidx.appcompat.widget.TintInfo r1 = r3.mBackgroundTint
            if (r1 == 0) goto L25
            androidx.appcompat.widget.TintInfo r1 = r3.mBackgroundTint
            android.view.View r2 = r3.mView
            int[] r2 = r2.getDrawableState()
            androidx.appcompat.widget.AppCompatDrawableManager.tintDrawable(r0, r1, r2)
            goto L34
        L25:
            androidx.appcompat.widget.TintInfo r1 = r3.mInternalBackgroundTint
            if (r1 == 0) goto L34
            androidx.appcompat.widget.TintInfo r1 = r3.mInternalBackgroundTint
            android.view.View r2 = r3.mView
            int[] r2 = r2.getDrawableState()
            androidx.appcompat.widget.AppCompatDrawableManager.tintDrawable(r0, r1, r2)
        L34:
            return
    }

    android.content.res.ColorStateList getSupportBackgroundTintList() {
            r1 = this;
            androidx.appcompat.widget.TintInfo r0 = r1.mBackgroundTint
            if (r0 == 0) goto L9
            androidx.appcompat.widget.TintInfo r0 = r1.mBackgroundTint
            android.content.res.ColorStateList r0 = r0.mTintList
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    android.graphics.PorterDuff.Mode getSupportBackgroundTintMode() {
            r1 = this;
            androidx.appcompat.widget.TintInfo r0 = r1.mBackgroundTint
            if (r0 == 0) goto L9
            androidx.appcompat.widget.TintInfo r0 = r1.mBackgroundTint
            android.graphics.PorterDuff$Mode r0 = r0.mTintMode
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    void loadFromAttributes(android.util.AttributeSet r10, int r11) {
            r9 = this;
            android.view.View r0 = r9.mView
            android.content.Context r0 = r0.getContext()
            int[] r1 = androidx.appcompat.R.styleable.ViewBackgroundHelper
            r2 = 0
            androidx.appcompat.widget.TintTypedArray r1 = androidx.appcompat.widget.TintTypedArray.obtainStyledAttributes(r0, r10, r1, r11, r2)
            android.view.View r2 = r9.mView
            android.view.View r0 = r9.mView
            android.content.Context r3 = r0.getContext()
            int[] r4 = androidx.appcompat.R.styleable.ViewBackgroundHelper
            android.content.res.TypedArray r6 = r1.getWrappedTypeArray()
            r8 = 0
            r5 = r10
            r7 = r11
            androidx.core.view.ViewCompat.saveAttributeDataForStyleable(r2, r3, r4, r5, r6, r7, r8)
            int r10 = androidx.appcompat.R.styleable.ViewBackgroundHelper_android_background     // Catch: java.lang.Throwable -> L75
            boolean r10 = r1.hasValue(r10)     // Catch: java.lang.Throwable -> L75
            r11 = -1
            if (r10 == 0) goto L45
            int r10 = androidx.appcompat.R.styleable.ViewBackgroundHelper_android_background     // Catch: java.lang.Throwable -> L75
            int r10 = r1.getResourceId(r10, r11)     // Catch: java.lang.Throwable -> L75
            r9.mBackgroundResId = r10     // Catch: java.lang.Throwable -> L75
            androidx.appcompat.widget.AppCompatDrawableManager r10 = r9.mDrawableManager     // Catch: java.lang.Throwable -> L75
            android.view.View r0 = r9.mView     // Catch: java.lang.Throwable -> L75
            android.content.Context r0 = r0.getContext()     // Catch: java.lang.Throwable -> L75
            int r2 = r9.mBackgroundResId     // Catch: java.lang.Throwable -> L75
            android.content.res.ColorStateList r10 = r10.getTintList(r0, r2)     // Catch: java.lang.Throwable -> L75
            if (r10 == 0) goto L45
            r9.setInternalBackgroundTint(r10)     // Catch: java.lang.Throwable -> L75
        L45:
            int r10 = androidx.appcompat.R.styleable.ViewBackgroundHelper_backgroundTint     // Catch: java.lang.Throwable -> L75
            boolean r10 = r1.hasValue(r10)     // Catch: java.lang.Throwable -> L75
            if (r10 == 0) goto L58
            android.view.View r10 = r9.mView     // Catch: java.lang.Throwable -> L75
            int r0 = androidx.appcompat.R.styleable.ViewBackgroundHelper_backgroundTint     // Catch: java.lang.Throwable -> L75
            android.content.res.ColorStateList r0 = r1.getColorStateList(r0)     // Catch: java.lang.Throwable -> L75
            androidx.core.view.ViewCompat.setBackgroundTintList(r10, r0)     // Catch: java.lang.Throwable -> L75
        L58:
            int r10 = androidx.appcompat.R.styleable.ViewBackgroundHelper_backgroundTintMode     // Catch: java.lang.Throwable -> L75
            boolean r10 = r1.hasValue(r10)     // Catch: java.lang.Throwable -> L75
            if (r10 == 0) goto L70
            android.view.View r10 = r9.mView     // Catch: java.lang.Throwable -> L75
            int r0 = androidx.appcompat.R.styleable.ViewBackgroundHelper_backgroundTintMode     // Catch: java.lang.Throwable -> L75
            int r11 = r1.getInt(r0, r11)     // Catch: java.lang.Throwable -> L75
            r0 = 0
            android.graphics.PorterDuff$Mode r11 = androidx.appcompat.widget.DrawableUtils.parseTintMode(r11, r0)     // Catch: java.lang.Throwable -> L75
            androidx.core.view.ViewCompat.setBackgroundTintMode(r10, r11)     // Catch: java.lang.Throwable -> L75
        L70:
            r1.recycle()
            return
        L75:
            r0 = move-exception
            r10 = r0
            r1.recycle()
            throw r10
    }

    void onSetBackgroundDrawable(android.graphics.drawable.Drawable r2) {
            r1 = this;
            r0 = -1
            r1.mBackgroundResId = r0
            r0 = 0
            r1.setInternalBackgroundTint(r0)
            r1.applySupportBackgroundTint()
            return
    }

    void onSetBackgroundResource(int r3) {
            r2 = this;
            r2.mBackgroundResId = r3
            androidx.appcompat.widget.AppCompatDrawableManager r0 = r2.mDrawableManager
            if (r0 == 0) goto L13
            androidx.appcompat.widget.AppCompatDrawableManager r0 = r2.mDrawableManager
            android.view.View r1 = r2.mView
            android.content.Context r1 = r1.getContext()
            android.content.res.ColorStateList r0 = r0.getTintList(r1, r3)
            goto L14
        L13:
            r0 = 0
        L14:
            r2.setInternalBackgroundTint(r0)
            r2.applySupportBackgroundTint()
            return
    }

    void setInternalBackgroundTint(android.content.res.ColorStateList r3) {
            r2 = this;
            if (r3 == 0) goto L17
            androidx.appcompat.widget.TintInfo r0 = r2.mInternalBackgroundTint
            if (r0 != 0) goto Ld
            androidx.appcompat.widget.TintInfo r0 = new androidx.appcompat.widget.TintInfo
            r0.<init>()
            r2.mInternalBackgroundTint = r0
        Ld:
            androidx.appcompat.widget.TintInfo r0 = r2.mInternalBackgroundTint
            r0.mTintList = r3
            androidx.appcompat.widget.TintInfo r0 = r2.mInternalBackgroundTint
            r1 = 1
            r0.mHasTintList = r1
            goto L1a
        L17:
            r0 = 0
            r2.mInternalBackgroundTint = r0
        L1a:
            r2.applySupportBackgroundTint()
            return
    }

    void setSupportBackgroundTintList(android.content.res.ColorStateList r3) {
            r2 = this;
            androidx.appcompat.widget.TintInfo r0 = r2.mBackgroundTint
            if (r0 != 0) goto Lb
            androidx.appcompat.widget.TintInfo r0 = new androidx.appcompat.widget.TintInfo
            r0.<init>()
            r2.mBackgroundTint = r0
        Lb:
            androidx.appcompat.widget.TintInfo r0 = r2.mBackgroundTint
            r0.mTintList = r3
            androidx.appcompat.widget.TintInfo r0 = r2.mBackgroundTint
            r1 = 1
            r0.mHasTintList = r1
            r2.applySupportBackgroundTint()
            return
    }

    void setSupportBackgroundTintMode(android.graphics.PorterDuff.Mode r3) {
            r2 = this;
            androidx.appcompat.widget.TintInfo r0 = r2.mBackgroundTint
            if (r0 != 0) goto Lb
            androidx.appcompat.widget.TintInfo r0 = new androidx.appcompat.widget.TintInfo
            r0.<init>()
            r2.mBackgroundTint = r0
        Lb:
            androidx.appcompat.widget.TintInfo r0 = r2.mBackgroundTint
            r0.mTintMode = r3
            androidx.appcompat.widget.TintInfo r0 = r2.mBackgroundTint
            r1 = 1
            r0.mHasTintMode = r1
            r2.applySupportBackgroundTint()
            return
    }
}
