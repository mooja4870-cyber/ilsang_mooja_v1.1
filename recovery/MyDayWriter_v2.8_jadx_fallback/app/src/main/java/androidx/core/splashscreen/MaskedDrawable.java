package androidx.core.splashscreen;

/* JADX INFO: compiled from: MaskedDrawable.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0012\u0010\u0010\u001a\u00020\n2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u000fH\u0016J\u0010\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0016H\u0014R\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Landroidx/core/splashscreen/MaskedDrawable;", "Landroid/graphics/drawable/Drawable;", "drawable", "maskDiameter", "", "<init>", "(Landroid/graphics/drawable/Drawable;F)V", "mask", "Landroid/graphics/Path;", "draw", "", "canvas", "Landroid/graphics/Canvas;", "setAlpha", "alpha", "", "setColorFilter", "colorFilter", "Landroid/graphics/ColorFilter;", "getOpacity", "onBoundsChange", "bounds", "Landroid/graphics/Rect;", "core-splashscreen_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MaskedDrawable extends android.graphics.drawable.Drawable {
    private final android.graphics.drawable.Drawable drawable;
    private final android.graphics.Path mask;
    private final float maskDiameter;

    public MaskedDrawable(android.graphics.drawable.Drawable r7, float r8) {
            r6 = this;
            java.lang.String r0 = "drawable"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            r6.<init>()
            r6.drawable = r7
            r6.maskDiameter = r8
            android.graphics.Path r0 = new android.graphics.Path
            r0.<init>()
            r1 = r0
            r2 = 0
            float r3 = r6.maskDiameter
            r4 = 1073741824(0x40000000, float:2.0)
            float r3 = r3 / r4
            r4 = 0
            android.graphics.Path$Direction r5 = android.graphics.Path.Direction.CW
            r1.addCircle(r4, r4, r3, r5)
            r6.mask = r0
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas r2) {
            r1 = this;
            java.lang.String r0 = "canvas"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            android.graphics.Path r0 = r1.mask
            r2.clipPath(r0)
            android.graphics.drawable.Drawable r0 = r1.drawable
            r0.draw(r2)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.drawable
            int r0 = r0.getOpacity()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(android.graphics.Rect r4) {
            r3 = this;
            java.lang.String r0 = "bounds"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            super.onBoundsChange(r4)
            android.graphics.drawable.Drawable r0 = r3.drawable
            r0.setBounds(r4)
            android.graphics.Path r0 = r3.mask
            float r1 = r4.exactCenterX()
            float r2 = r4.exactCenterY()
            r0.offset(r1, r2)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.drawable
            r0.setAlpha(r2)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.drawable
            r0.setColorFilter(r2)
            return
    }
}
