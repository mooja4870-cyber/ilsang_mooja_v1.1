package androidx.core.graphics.drawable;

/* JADX INFO: loaded from: classes.dex */
public abstract class RoundedBitmapDrawable extends android.graphics.drawable.Drawable {
    private static final int DEFAULT_PAINT_FLAGS = 3;
    private boolean mApplyGravity;
    final android.graphics.Bitmap mBitmap;
    private int mBitmapHeight;
    private final android.graphics.BitmapShader mBitmapShader;
    private int mBitmapWidth;
    private float mCornerRadius;
    final android.graphics.Rect mDstRect;
    private final android.graphics.RectF mDstRectF;
    private int mGravity;
    private boolean mIsCircular;
    private final android.graphics.Paint mPaint;
    private final android.graphics.Matrix mShaderMatrix;
    private int mTargetDensity;

    RoundedBitmapDrawable(android.content.res.Resources r5, android.graphics.Bitmap r6) {
            r4 = this;
            r4.<init>()
            r0 = 160(0xa0, float:2.24E-43)
            r4.mTargetDensity = r0
            r0 = 119(0x77, float:1.67E-43)
            r4.mGravity = r0
            android.graphics.Paint r0 = new android.graphics.Paint
            r1 = 3
            r0.<init>(r1)
            r4.mPaint = r0
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            r4.mShaderMatrix = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r4.mDstRect = r0
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            r4.mDstRectF = r0
            r0 = 1
            r4.mApplyGravity = r0
            if (r5 == 0) goto L35
            android.util.DisplayMetrics r0 = r5.getDisplayMetrics()
            int r0 = r0.densityDpi
            r4.mTargetDensity = r0
        L35:
            r4.mBitmap = r6
            android.graphics.Bitmap r0 = r4.mBitmap
            if (r0 == 0) goto L4c
            r4.computeBitmapSize()
            android.graphics.BitmapShader r0 = new android.graphics.BitmapShader
            android.graphics.Bitmap r1 = r4.mBitmap
            android.graphics.Shader$TileMode r2 = android.graphics.Shader.TileMode.CLAMP
            android.graphics.Shader$TileMode r3 = android.graphics.Shader.TileMode.CLAMP
            r0.<init>(r1, r2, r3)
            r4.mBitmapShader = r0
            goto L54
        L4c:
            r0 = -1
            r4.mBitmapHeight = r0
            r4.mBitmapWidth = r0
            r0 = 0
            r4.mBitmapShader = r0
        L54:
            return
    }

    private void computeBitmapSize() {
            r2 = this;
            android.graphics.Bitmap r0 = r2.mBitmap
            int r1 = r2.mTargetDensity
            int r0 = r0.getScaledWidth(r1)
            r2.mBitmapWidth = r0
            android.graphics.Bitmap r0 = r2.mBitmap
            int r1 = r2.mTargetDensity
            int r0 = r0.getScaledHeight(r1)
            r2.mBitmapHeight = r0
            return
    }

    private static boolean isGreaterThanZero(float r1) {
            r0 = 1028443341(0x3d4ccccd, float:0.05)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L9
            r0 = 1
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    private void updateCircularCornerRadius() {
            r2 = this;
            int r0 = r2.mBitmapHeight
            int r1 = r2.mBitmapWidth
            int r0 = java.lang.Math.min(r0, r1)
            int r1 = r0 / 2
            float r1 = (float) r1
            r2.mCornerRadius = r1
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas r6) {
            r5 = this;
            android.graphics.Bitmap r0 = r5.mBitmap
            if (r0 != 0) goto L5
            return
        L5:
            r5.updateDstRect()
            android.graphics.Paint r1 = r5.mPaint
            android.graphics.Shader r1 = r1.getShader()
            if (r1 != 0) goto L19
            android.graphics.Rect r1 = r5.mDstRect
            android.graphics.Paint r2 = r5.mPaint
            r3 = 0
            r6.drawBitmap(r0, r3, r1, r2)
            goto L24
        L19:
            android.graphics.RectF r1 = r5.mDstRectF
            float r2 = r5.mCornerRadius
            float r3 = r5.mCornerRadius
            android.graphics.Paint r4 = r5.mPaint
            r6.drawRoundRect(r1, r2, r3, r4)
        L24:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
            r1 = this;
            android.graphics.Paint r0 = r1.mPaint
            int r0 = r0.getAlpha()
            return r0
    }

    public final android.graphics.Bitmap getBitmap() {
            r1 = this;
            android.graphics.Bitmap r0 = r1.mBitmap
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public android.graphics.ColorFilter getColorFilter() {
            r1 = this;
            android.graphics.Paint r0 = r1.mPaint
            android.graphics.ColorFilter r0 = r0.getColorFilter()
            return r0
    }

    public float getCornerRadius() {
            r1 = this;
            float r0 = r1.mCornerRadius
            return r0
    }

    public int getGravity() {
            r1 = this;
            int r0 = r1.mGravity
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
            r1 = this;
            int r0 = r1.mBitmapHeight
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
            r1 = this;
            int r0 = r1.mBitmapWidth
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
            r4 = this;
            int r0 = r4.mGravity
            r1 = 119(0x77, float:1.67E-43)
            r2 = -3
            if (r0 != r1) goto L2d
            boolean r0 = r4.mIsCircular
            if (r0 == 0) goto Lc
            goto L2d
        Lc:
            android.graphics.Bitmap r0 = r4.mBitmap
            if (r0 == 0) goto L2b
            boolean r1 = r0.hasAlpha()
            if (r1 != 0) goto L2b
            android.graphics.Paint r1 = r4.mPaint
            int r1 = r1.getAlpha()
            r3 = 255(0xff, float:3.57E-43)
            if (r1 < r3) goto L2b
            float r1 = r4.mCornerRadius
            boolean r1 = isGreaterThanZero(r1)
            if (r1 == 0) goto L29
            goto L2b
        L29:
            r2 = -1
            goto L2c
        L2b:
        L2c:
            return r2
        L2d:
            return r2
    }

    public final android.graphics.Paint getPaint() {
            r1 = this;
            android.graphics.Paint r0 = r1.mPaint
            return r0
    }

    void gravityCompatApply(int r2, int r3, int r4, android.graphics.Rect r5, android.graphics.Rect r6) {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    public boolean hasAntiAlias() {
            r1 = this;
            android.graphics.Paint r0 = r1.mPaint
            boolean r0 = r0.isAntiAlias()
            return r0
    }

    public boolean hasMipMap() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    public boolean isCircular() {
            r1 = this;
            boolean r0 = r1.mIsCircular
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(android.graphics.Rect r2) {
            r1 = this;
            super.onBoundsChange(r2)
            boolean r0 = r1.mIsCircular
            if (r0 == 0) goto La
            r1.updateCircularCornerRadius()
        La:
            r0 = 1
            r1.mApplyGravity = r0
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int r3) {
            r2 = this;
            android.graphics.Paint r0 = r2.mPaint
            int r0 = r0.getAlpha()
            if (r3 == r0) goto L10
            android.graphics.Paint r1 = r2.mPaint
            r1.setAlpha(r3)
            r2.invalidateSelf()
        L10:
            return
    }

    public void setAntiAlias(boolean r2) {
            r1 = this;
            android.graphics.Paint r0 = r1.mPaint
            r0.setAntiAlias(r2)
            r1.invalidateSelf()
            return
    }

    public void setCircular(boolean r3) {
            r2 = this;
            r2.mIsCircular = r3
            r0 = 1
            r2.mApplyGravity = r0
            if (r3 == 0) goto L15
            r2.updateCircularCornerRadius()
            android.graphics.Paint r0 = r2.mPaint
            android.graphics.BitmapShader r1 = r2.mBitmapShader
            r0.setShader(r1)
            r2.invalidateSelf()
            goto L19
        L15:
            r0 = 0
            r2.setCornerRadius(r0)
        L19:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter r2) {
            r1 = this;
            android.graphics.Paint r0 = r1.mPaint
            r0.setColorFilter(r2)
            r1.invalidateSelf()
            return
    }

    public void setCornerRadius(float r3) {
            r2 = this;
            float r0 = r2.mCornerRadius
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L7
            return
        L7:
            r0 = 0
            r2.mIsCircular = r0
            boolean r0 = isGreaterThanZero(r3)
            if (r0 == 0) goto L18
            android.graphics.Paint r0 = r2.mPaint
            android.graphics.BitmapShader r1 = r2.mBitmapShader
            r0.setShader(r1)
            goto L1e
        L18:
            android.graphics.Paint r0 = r2.mPaint
            r1 = 0
            r0.setShader(r1)
        L1e:
            r2.mCornerRadius = r3
            r2.invalidateSelf()
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean r2) {
            r1 = this;
            android.graphics.Paint r0 = r1.mPaint
            r0.setDither(r2)
            r1.invalidateSelf()
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean r2) {
            r1 = this;
            android.graphics.Paint r0 = r1.mPaint
            r0.setFilterBitmap(r2)
            r1.invalidateSelf()
            return
    }

    public void setGravity(int r2) {
            r1 = this;
            int r0 = r1.mGravity
            if (r0 == r2) goto Lc
            r1.mGravity = r2
            r0 = 1
            r1.mApplyGravity = r0
            r1.invalidateSelf()
        Lc:
            return
    }

    public void setMipMap(boolean r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    public void setTargetDensity(int r2) {
            r1 = this;
            int r0 = r1.mTargetDensity
            if (r0 == r2) goto L16
            if (r2 != 0) goto L9
            r0 = 160(0xa0, float:2.24E-43)
            goto La
        L9:
            r0 = r2
        La:
            r1.mTargetDensity = r0
            android.graphics.Bitmap r0 = r1.mBitmap
            if (r0 == 0) goto L13
            r1.computeBitmapSize()
        L13:
            r1.invalidateSelf()
        L16:
            return
    }

    public void setTargetDensity(android.graphics.Canvas r2) {
            r1 = this;
            int r0 = r2.getDensity()
            r1.setTargetDensity(r0)
            return
    }

    public void setTargetDensity(android.util.DisplayMetrics r2) {
            r1 = this;
            int r0 = r2.densityDpi
            r1.setTargetDensity(r0)
            return
    }

    void updateDstRect() {
            r15 = this;
            boolean r0 = r15.mApplyGravity
            if (r0 == 0) goto Laf
            boolean r0 = r15.mIsCircular
            r1 = 0
            if (r0 == 0) goto L54
            int r0 = r15.mBitmapWidth
            int r2 = r15.mBitmapHeight
            int r5 = java.lang.Math.min(r0, r2)
            int r4 = r15.mGravity
            android.graphics.Rect r7 = r15.getBounds()
            android.graphics.Rect r8 = r15.mDstRect
            r6 = r5
            r3 = r15
            r3.gravityCompatApply(r4, r5, r6, r7, r8)
            android.graphics.Rect r0 = r3.mDstRect
            int r0 = r0.width()
            android.graphics.Rect r2 = r3.mDstRect
            int r2 = r2.height()
            int r0 = java.lang.Math.min(r0, r2)
            android.graphics.Rect r2 = r3.mDstRect
            int r2 = r2.width()
            int r2 = r2 - r0
            int r2 = r2 / 2
            int r2 = java.lang.Math.max(r1, r2)
            android.graphics.Rect r4 = r3.mDstRect
            int r4 = r4.height()
            int r4 = r4 - r0
            int r4 = r4 / 2
            int r4 = java.lang.Math.max(r1, r4)
            android.graphics.Rect r6 = r3.mDstRect
            r6.inset(r2, r4)
            r6 = 1056964608(0x3f000000, float:0.5)
            float r7 = (float) r0
            float r7 = r7 * r6
            r3.mCornerRadius = r7
            goto L65
        L54:
            r3 = r15
            int r10 = r3.mGravity
            int r11 = r3.mBitmapWidth
            int r12 = r3.mBitmapHeight
            android.graphics.Rect r13 = r15.getBounds()
            android.graphics.Rect r14 = r3.mDstRect
            r9 = r3
            r9.gravityCompatApply(r10, r11, r12, r13, r14)
        L65:
            android.graphics.RectF r0 = r3.mDstRectF
            android.graphics.Rect r2 = r3.mDstRect
            r0.set(r2)
            android.graphics.BitmapShader r0 = r3.mBitmapShader
            if (r0 == 0) goto Lac
            android.graphics.Matrix r0 = r3.mShaderMatrix
            android.graphics.RectF r2 = r3.mDstRectF
            float r2 = r2.left
            android.graphics.RectF r4 = r3.mDstRectF
            float r4 = r4.top
            r0.setTranslate(r2, r4)
            android.graphics.Matrix r0 = r3.mShaderMatrix
            android.graphics.RectF r2 = r3.mDstRectF
            float r2 = r2.width()
            android.graphics.Bitmap r4 = r3.mBitmap
            int r4 = r4.getWidth()
            float r4 = (float) r4
            float r2 = r2 / r4
            android.graphics.RectF r4 = r3.mDstRectF
            float r4 = r4.height()
            android.graphics.Bitmap r5 = r3.mBitmap
            int r5 = r5.getHeight()
            float r5 = (float) r5
            float r4 = r4 / r5
            r0.preScale(r2, r4)
            android.graphics.BitmapShader r0 = r3.mBitmapShader
            android.graphics.Matrix r2 = r3.mShaderMatrix
            r0.setLocalMatrix(r2)
            android.graphics.Paint r0 = r3.mPaint
            android.graphics.BitmapShader r2 = r3.mBitmapShader
            r0.setShader(r2)
        Lac:
            r3.mApplyGravity = r1
            goto Lb0
        Laf:
            r3 = r15
        Lb0:
            return
    }
}
