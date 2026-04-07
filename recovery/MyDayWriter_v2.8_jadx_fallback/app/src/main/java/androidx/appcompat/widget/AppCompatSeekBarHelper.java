package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
class AppCompatSeekBarHelper extends androidx.appcompat.widget.AppCompatProgressBarHelper {
    private boolean mHasTickMarkTint;
    private boolean mHasTickMarkTintMode;
    private android.graphics.drawable.Drawable mTickMark;
    private android.content.res.ColorStateList mTickMarkTintList;
    private android.graphics.PorterDuff.Mode mTickMarkTintMode;
    private final android.widget.SeekBar mView;

    AppCompatSeekBarHelper(android.widget.SeekBar r2) {
            r1 = this;
            r1.<init>(r2)
            r0 = 0
            r1.mTickMarkTintList = r0
            r1.mTickMarkTintMode = r0
            r0 = 0
            r1.mHasTickMarkTint = r0
            r1.mHasTickMarkTintMode = r0
            r1.mView = r2
            return
    }

    private void applyTickMarkTint() {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.mTickMark
            if (r0 == 0) goto L41
            boolean r0 = r2.mHasTickMarkTint
            if (r0 != 0) goto Lc
            boolean r0 = r2.mHasTickMarkTintMode
            if (r0 == 0) goto L41
        Lc:
            android.graphics.drawable.Drawable r0 = r2.mTickMark
            android.graphics.drawable.Drawable r0 = r0.mutate()
            android.graphics.drawable.Drawable r0 = androidx.core.graphics.drawable.DrawableCompat.wrap(r0)
            r2.mTickMark = r0
            boolean r0 = r2.mHasTickMarkTint
            if (r0 == 0) goto L23
            android.graphics.drawable.Drawable r0 = r2.mTickMark
            android.content.res.ColorStateList r1 = r2.mTickMarkTintList
            androidx.core.graphics.drawable.DrawableCompat.setTintList(r0, r1)
        L23:
            boolean r0 = r2.mHasTickMarkTintMode
            if (r0 == 0) goto L2e
            android.graphics.drawable.Drawable r0 = r2.mTickMark
            android.graphics.PorterDuff$Mode r1 = r2.mTickMarkTintMode
            androidx.core.graphics.drawable.DrawableCompat.setTintMode(r0, r1)
        L2e:
            android.graphics.drawable.Drawable r0 = r2.mTickMark
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L41
            android.graphics.drawable.Drawable r0 = r2.mTickMark
            android.widget.SeekBar r1 = r2.mView
            int[] r1 = r1.getDrawableState()
            r0.setState(r1)
        L41:
            return
    }

    void drawTickMarks(android.graphics.Canvas r10) {
            r9 = this;
            android.graphics.drawable.Drawable r0 = r9.mTickMark
            if (r0 == 0) goto L6a
            android.widget.SeekBar r0 = r9.mView
            int r0 = r0.getMax()
            r1 = 1
            if (r0 <= r1) goto L6a
            android.graphics.drawable.Drawable r2 = r9.mTickMark
            int r2 = r2.getIntrinsicWidth()
            android.graphics.drawable.Drawable r3 = r9.mTickMark
            int r3 = r3.getIntrinsicHeight()
            if (r2 < 0) goto L1e
            int r4 = r2 / 2
            goto L1f
        L1e:
            r4 = r1
        L1f:
            if (r3 < 0) goto L23
            int r1 = r3 / 2
        L23:
            android.graphics.drawable.Drawable r5 = r9.mTickMark
            int r6 = -r4
            int r7 = -r1
            r5.setBounds(r6, r7, r4, r1)
            android.widget.SeekBar r5 = r9.mView
            int r5 = r5.getWidth()
            android.widget.SeekBar r6 = r9.mView
            int r6 = r6.getPaddingLeft()
            int r5 = r5 - r6
            android.widget.SeekBar r6 = r9.mView
            int r6 = r6.getPaddingRight()
            int r5 = r5 - r6
            float r5 = (float) r5
            float r6 = (float) r0
            float r5 = r5 / r6
            int r6 = r10.save()
            android.widget.SeekBar r7 = r9.mView
            int r7 = r7.getPaddingLeft()
            float r7 = (float) r7
            android.widget.SeekBar r8 = r9.mView
            int r8 = r8.getHeight()
            int r8 = r8 / 2
            float r8 = (float) r8
            r10.translate(r7, r8)
            r7 = 0
        L59:
            if (r7 > r0) goto L67
            android.graphics.drawable.Drawable r8 = r9.mTickMark
            r8.draw(r10)
            r8 = 0
            r10.translate(r5, r8)
            int r7 = r7 + 1
            goto L59
        L67:
            r10.restoreToCount(r6)
        L6a:
            return
    }

    void drawableStateChanged() {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.mTickMark
            if (r0 == 0) goto L1b
            boolean r1 = r0.isStateful()
            if (r1 == 0) goto L1b
            android.widget.SeekBar r1 = r2.mView
            int[] r1 = r1.getDrawableState()
            boolean r1 = r0.setState(r1)
            if (r1 == 0) goto L1b
            android.widget.SeekBar r1 = r2.mView
            r1.invalidateDrawable(r0)
        L1b:
            return
    }

    android.graphics.drawable.Drawable getTickMark() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mTickMark
            return r0
    }

    android.content.res.ColorStateList getTickMarkTintList() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.mTickMarkTintList
            return r0
    }

    android.graphics.PorterDuff.Mode getTickMarkTintMode() {
            r1 = this;
            android.graphics.PorterDuff$Mode r0 = r1.mTickMarkTintMode
            return r0
    }

    void jumpDrawablesToCurrentState() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mTickMark
            if (r0 == 0) goto L9
            android.graphics.drawable.Drawable r0 = r1.mTickMark
            r0.jumpToCurrentState()
        L9:
            return
    }

    @Override // androidx.appcompat.widget.AppCompatProgressBarHelper
    void loadFromAttributes(android.util.AttributeSet r9, int r10) {
            r8 = this;
            super.loadFromAttributes(r9, r10)
            android.widget.SeekBar r0 = r8.mView
            android.content.Context r0 = r0.getContext()
            int[] r1 = androidx.appcompat.R.styleable.AppCompatSeekBar
            r2 = 0
            androidx.appcompat.widget.TintTypedArray r0 = androidx.appcompat.widget.TintTypedArray.obtainStyledAttributes(r0, r9, r1, r10, r2)
            android.widget.SeekBar r1 = r8.mView
            android.widget.SeekBar r2 = r8.mView
            android.content.Context r2 = r2.getContext()
            int[] r3 = androidx.appcompat.R.styleable.AppCompatSeekBar
            android.content.res.TypedArray r5 = r0.getWrappedTypeArray()
            r7 = 0
            r4 = r9
            r6 = r10
            androidx.core.view.ViewCompat.saveAttributeDataForStyleable(r1, r2, r3, r4, r5, r6, r7)
            int r9 = androidx.appcompat.R.styleable.AppCompatSeekBar_android_thumb
            android.graphics.drawable.Drawable r9 = r0.getDrawableIfKnown(r9)
            if (r9 == 0) goto L31
            android.widget.SeekBar r10 = r8.mView
            r10.setThumb(r9)
        L31:
            int r10 = androidx.appcompat.R.styleable.AppCompatSeekBar_tickMark
            android.graphics.drawable.Drawable r10 = r0.getDrawable(r10)
            r8.setTickMark(r10)
            int r1 = androidx.appcompat.R.styleable.AppCompatSeekBar_tickMarkTintMode
            boolean r1 = r0.hasValue(r1)
            r2 = 1
            if (r1 == 0) goto L54
            int r1 = androidx.appcompat.R.styleable.AppCompatSeekBar_tickMarkTintMode
            r3 = -1
            int r1 = r0.getInt(r1, r3)
            android.graphics.PorterDuff$Mode r3 = r8.mTickMarkTintMode
            android.graphics.PorterDuff$Mode r1 = androidx.appcompat.widget.DrawableUtils.parseTintMode(r1, r3)
            r8.mTickMarkTintMode = r1
            r8.mHasTickMarkTintMode = r2
        L54:
            int r1 = androidx.appcompat.R.styleable.AppCompatSeekBar_tickMarkTint
            boolean r1 = r0.hasValue(r1)
            if (r1 == 0) goto L66
            int r1 = androidx.appcompat.R.styleable.AppCompatSeekBar_tickMarkTint
            android.content.res.ColorStateList r1 = r0.getColorStateList(r1)
            r8.mTickMarkTintList = r1
            r8.mHasTickMarkTint = r2
        L66:
            r0.recycle()
            r8.applyTickMarkTint()
            return
    }

    void setTickMark(android.graphics.drawable.Drawable r3) {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.mTickMark
            if (r0 == 0) goto La
            android.graphics.drawable.Drawable r0 = r2.mTickMark
            r1 = 0
            r0.setCallback(r1)
        La:
            r2.mTickMark = r3
            if (r3 == 0) goto L2e
            android.widget.SeekBar r0 = r2.mView
            r3.setCallback(r0)
            android.widget.SeekBar r0 = r2.mView
            int r0 = r0.getLayoutDirection()
            androidx.core.graphics.drawable.DrawableCompat.setLayoutDirection(r3, r0)
            boolean r0 = r3.isStateful()
            if (r0 == 0) goto L2b
            android.widget.SeekBar r0 = r2.mView
            int[] r0 = r0.getDrawableState()
            r3.setState(r0)
        L2b:
            r2.applyTickMarkTint()
        L2e:
            android.widget.SeekBar r0 = r2.mView
            r0.invalidate()
            return
    }

    void setTickMarkTintList(android.content.res.ColorStateList r2) {
            r1 = this;
            r1.mTickMarkTintList = r2
            r0 = 1
            r1.mHasTickMarkTint = r0
            r1.applyTickMarkTint()
            return
    }

    void setTickMarkTintMode(android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            r1.mTickMarkTintMode = r2
            r0 = 1
            r1.mHasTickMarkTintMode = r0
            r1.applyTickMarkTint()
            return
    }
}
