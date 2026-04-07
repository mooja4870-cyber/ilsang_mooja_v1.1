package androidx.appcompat.graphics.drawable;

/* JADX INFO: loaded from: classes.dex */
public class DrawerArrowDrawable extends android.graphics.drawable.Drawable {
    public static final int ARROW_DIRECTION_END = 3;
    public static final int ARROW_DIRECTION_LEFT = 0;
    public static final int ARROW_DIRECTION_RIGHT = 1;
    public static final int ARROW_DIRECTION_START = 2;
    private static final float ARROW_HEAD_ANGLE = 0.0f;
    private float mArrowHeadLength;
    private float mArrowShaftLength;
    private float mBarGap;
    private float mBarLength;
    private int mDirection;
    private float mMaxCutForBarSize;
    private final android.graphics.Paint mPaint;
    private final android.graphics.Path mPath;
    private float mProgress;
    private final int mSize;
    private boolean mSpin;
    private boolean mVerticalMirror;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface ArrowDirection {
    }

    static {
            r0 = 4631530004285489152(0x4046800000000000, double:45.0)
            double r0 = java.lang.Math.toRadians(r0)
            float r0 = (float) r0
            androidx.appcompat.graphics.drawable.DrawerArrowDrawable.ARROW_HEAD_ANGLE = r0
            return
    }

    public DrawerArrowDrawable(android.content.Context r8) {
            r7 = this;
            r7.<init>()
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>()
            r7.mPaint = r0
            android.graphics.Path r0 = new android.graphics.Path
            r0.<init>()
            r7.mPath = r0
            r0 = 0
            r7.mVerticalMirror = r0
            r1 = 2
            r7.mDirection = r1
            android.graphics.Paint r1 = r7.mPaint
            android.graphics.Paint$Style r2 = android.graphics.Paint.Style.STROKE
            r1.setStyle(r2)
            android.graphics.Paint r1 = r7.mPaint
            android.graphics.Paint$Join r2 = android.graphics.Paint.Join.MITER
            r1.setStrokeJoin(r2)
            android.graphics.Paint r1 = r7.mPaint
            android.graphics.Paint$Cap r2 = android.graphics.Paint.Cap.BUTT
            r1.setStrokeCap(r2)
            android.graphics.Paint r1 = r7.mPaint
            r2 = 1
            r1.setAntiAlias(r2)
            android.content.res.Resources$Theme r1 = r8.getTheme()
            int[] r3 = androidx.appcompat.R.styleable.DrawerArrowToggle
            int r4 = androidx.appcompat.R.attr.drawerArrowStyle
            int r5 = androidx.appcompat.R.style.Base_Widget_AppCompat_DrawerArrowToggle
            r6 = 0
            android.content.res.TypedArray r1 = r1.obtainStyledAttributes(r6, r3, r4, r5)
            int r3 = androidx.appcompat.R.styleable.DrawerArrowToggle_color
            int r3 = r1.getColor(r3, r0)
            r7.setColor(r3)
            int r3 = androidx.appcompat.R.styleable.DrawerArrowToggle_thickness
            r4 = 0
            float r3 = r1.getDimension(r3, r4)
            r7.setBarThickness(r3)
            int r3 = androidx.appcompat.R.styleable.DrawerArrowToggle_spinBars
            boolean r2 = r1.getBoolean(r3, r2)
            r7.setSpinEnabled(r2)
            int r2 = androidx.appcompat.R.styleable.DrawerArrowToggle_gapBetweenBars
            float r2 = r1.getDimension(r2, r4)
            int r2 = java.lang.Math.round(r2)
            float r2 = (float) r2
            r7.setGapSize(r2)
            int r2 = androidx.appcompat.R.styleable.DrawerArrowToggle_drawableSize
            int r0 = r1.getDimensionPixelSize(r2, r0)
            r7.mSize = r0
            int r0 = androidx.appcompat.R.styleable.DrawerArrowToggle_barLength
            float r0 = r1.getDimension(r0, r4)
            int r0 = java.lang.Math.round(r0)
            float r0 = (float) r0
            r7.mBarLength = r0
            int r0 = androidx.appcompat.R.styleable.DrawerArrowToggle_arrowHeadLength
            float r0 = r1.getDimension(r0, r4)
            int r0 = java.lang.Math.round(r0)
            float r0 = (float) r0
            r7.mArrowHeadLength = r0
            int r0 = androidx.appcompat.R.styleable.DrawerArrowToggle_arrowShaftLength
            float r0 = r1.getDimension(r0, r4)
            r7.mArrowShaftLength = r0
            r1.recycle()
            return
    }

    private static float lerp(float r1, float r2, float r3) {
            float r0 = r2 - r1
            float r0 = r0 * r3
            float r0 = r0 + r1
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas r21) {
            r20 = this;
            r0 = r20
            r1 = r21
            android.graphics.Rect r2 = r0.getBounds()
            int r3 = r0.mDirection
            r4 = 0
            r5 = 1
            switch(r3) {
                case 0: goto L21;
                case 1: goto L1f;
                case 2: goto Lf;
                case 3: goto L17;
                default: goto Lf;
            }
        Lf:
            int r3 = androidx.core.graphics.drawable.DrawableCompat.getLayoutDirection(r0)
            if (r3 != r5) goto L23
            r4 = r5
            goto L23
        L17:
            int r3 = androidx.core.graphics.drawable.DrawableCompat.getLayoutDirection(r0)
            if (r3 != 0) goto L1e
            r4 = r5
        L1e:
            goto L23
        L1f:
            r4 = 1
            goto L23
        L21:
            r4 = 0
        L23:
            float r3 = r0.mArrowHeadLength
            float r6 = r0.mArrowHeadLength
            float r3 = r3 * r6
            r6 = 1073741824(0x40000000, float:2.0)
            float r3 = r3 * r6
            double r7 = (double) r3
            double r7 = java.lang.Math.sqrt(r7)
            float r3 = (float) r7
            float r7 = r0.mBarLength
            float r8 = r0.mProgress
            float r3 = lerp(r7, r3, r8)
            float r7 = r0.mBarLength
            float r8 = r0.mArrowShaftLength
            float r9 = r0.mProgress
            float r7 = lerp(r7, r8, r9)
            float r8 = r0.mMaxCutForBarSize
            float r9 = r0.mProgress
            r10 = 0
            float r8 = lerp(r10, r8, r9)
            int r8 = java.lang.Math.round(r8)
            float r8 = (float) r8
            float r9 = androidx.appcompat.graphics.drawable.DrawerArrowDrawable.ARROW_HEAD_ANGLE
            float r11 = r0.mProgress
            float r9 = lerp(r10, r9, r11)
            if (r4 == 0) goto L5d
            r11 = r10
            goto L5f
        L5d:
            r11 = -1020002304(0xffffffffc3340000, float:-180.0)
        L5f:
            if (r4 == 0) goto L64
            r13 = 1127481344(0x43340000, float:180.0)
            goto L65
        L64:
            r13 = r10
        L65:
            float r14 = r0.mProgress
            float r11 = lerp(r11, r13, r14)
            double r13 = (double) r3
            r16 = r6
            double r5 = (double) r9
            double r5 = java.lang.Math.cos(r5)
            double r13 = r13 * r5
            long r5 = java.lang.Math.round(r13)
            float r5 = (float) r5
            double r13 = (double) r3
            r17 = r13
            double r12 = (double) r9
            double r12 = java.lang.Math.sin(r12)
            double r13 = r17 * r12
            long r12 = java.lang.Math.round(r13)
            float r12 = (float) r12
            android.graphics.Path r13 = r0.mPath
            r13.rewind()
            float r13 = r0.mBarGap
            android.graphics.Paint r14 = r0.mPaint
            float r14 = r14.getStrokeWidth()
            float r13 = r13 + r14
            float r14 = r0.mMaxCutForBarSize
            float r14 = -r14
            float r6 = r0.mProgress
            float r6 = lerp(r13, r14, r6)
            float r13 = -r7
            float r13 = r13 / r16
            android.graphics.Path r14 = r0.mPath
            float r15 = r13 + r8
            r14.moveTo(r15, r10)
            android.graphics.Path r14 = r0.mPath
            float r15 = r8 * r16
            float r15 = r7 - r15
            r14.rLineTo(r15, r10)
            android.graphics.Path r10 = r0.mPath
            r10.moveTo(r13, r6)
            android.graphics.Path r10 = r0.mPath
            r10.rLineTo(r5, r12)
            android.graphics.Path r10 = r0.mPath
            float r14 = -r6
            r10.moveTo(r13, r14)
            android.graphics.Path r10 = r0.mPath
            float r14 = -r12
            r10.rLineTo(r5, r14)
            android.graphics.Path r10 = r0.mPath
            r10.close()
            r1.save()
            android.graphics.Paint r10 = r0.mPaint
            float r10 = r10.getStrokeWidth()
            int r14 = r2.height()
            float r14 = (float) r14
            r15 = 1077936128(0x40400000, float:3.0)
            float r15 = r15 * r10
            float r14 = r14 - r15
            float r15 = r0.mBarGap
            float r15 = r15 * r16
            float r14 = r14 - r15
            int r14 = (int) r14
            int r15 = r14 / 4
            int r15 = r15 * 2
            float r15 = (float) r15
            r16 = 1069547520(0x3fc00000, float:1.5)
            float r16 = r16 * r10
            r19 = r2
            float r2 = r0.mBarGap
            float r16 = r16 + r2
            float r15 = r15 + r16
            int r2 = r19.centerX()
            float r2 = (float) r2
            r1.translate(r2, r15)
            boolean r2 = r0.mSpin
            if (r2 == 0) goto L110
            boolean r2 = r0.mVerticalMirror
            r2 = r2 ^ r4
            if (r2 == 0) goto L109
            r2 = -1
            goto L10a
        L109:
            r2 = 1
        L10a:
            float r2 = (float) r2
            float r2 = r2 * r11
            r1.rotate(r2)
            goto L117
        L110:
            if (r4 == 0) goto L117
            r2 = 1127481344(0x43340000, float:180.0)
            r1.rotate(r2)
        L117:
            android.graphics.Path r2 = r0.mPath
            r16 = r3
            android.graphics.Paint r3 = r0.mPaint
            r1.drawPath(r2, r3)
            r1.restore()
            return
    }

    public float getArrowHeadLength() {
            r1 = this;
            float r0 = r1.mArrowHeadLength
            return r0
    }

    public float getArrowShaftLength() {
            r1 = this;
            float r0 = r1.mArrowShaftLength
            return r0
    }

    public float getBarLength() {
            r1 = this;
            float r0 = r1.mBarLength
            return r0
    }

    public float getBarThickness() {
            r1 = this;
            android.graphics.Paint r0 = r1.mPaint
            float r0 = r0.getStrokeWidth()
            return r0
    }

    public int getColor() {
            r1 = this;
            android.graphics.Paint r0 = r1.mPaint
            int r0 = r0.getColor()
            return r0
    }

    public int getDirection() {
            r1 = this;
            int r0 = r1.mDirection
            return r0
    }

    public float getGapSize() {
            r1 = this;
            float r0 = r1.mBarGap
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
            r1 = this;
            int r0 = r1.mSize
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
            r1 = this;
            int r0 = r1.mSize
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
            r1 = this;
            r0 = -3
            return r0
    }

    public final android.graphics.Paint getPaint() {
            r1 = this;
            android.graphics.Paint r0 = r1.mPaint
            return r0
    }

    public float getProgress() {
            r1 = this;
            float r0 = r1.mProgress
            return r0
    }

    public boolean isSpinEnabled() {
            r1 = this;
            boolean r0 = r1.mSpin
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int r2) {
            r1 = this;
            android.graphics.Paint r0 = r1.mPaint
            int r0 = r0.getAlpha()
            if (r2 == r0) goto L10
            android.graphics.Paint r0 = r1.mPaint
            r0.setAlpha(r2)
            r1.invalidateSelf()
        L10:
            return
    }

    public void setArrowHeadLength(float r2) {
            r1 = this;
            float r0 = r1.mArrowHeadLength
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Lb
            r1.mArrowHeadLength = r2
            r1.invalidateSelf()
        Lb:
            return
    }

    public void setArrowShaftLength(float r2) {
            r1 = this;
            float r0 = r1.mArrowShaftLength
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Lb
            r1.mArrowShaftLength = r2
            r1.invalidateSelf()
        Lb:
            return
    }

    public void setBarLength(float r2) {
            r1 = this;
            float r0 = r1.mBarLength
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Lb
            r1.mBarLength = r2
            r1.invalidateSelf()
        Lb:
            return
    }

    public void setBarThickness(float r5) {
            r4 = this;
            android.graphics.Paint r0 = r4.mPaint
            float r0 = r0.getStrokeWidth()
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 == 0) goto L22
            android.graphics.Paint r0 = r4.mPaint
            r0.setStrokeWidth(r5)
            r0 = 1073741824(0x40000000, float:2.0)
            float r0 = r5 / r0
            double r0 = (double) r0
            float r2 = androidx.appcompat.graphics.drawable.DrawerArrowDrawable.ARROW_HEAD_ANGLE
            double r2 = (double) r2
            double r2 = java.lang.Math.cos(r2)
            double r0 = r0 * r2
            float r0 = (float) r0
            r4.mMaxCutForBarSize = r0
            r4.invalidateSelf()
        L22:
            return
    }

    public void setColor(int r2) {
            r1 = this;
            android.graphics.Paint r0 = r1.mPaint
            int r0 = r0.getColor()
            if (r2 == r0) goto L10
            android.graphics.Paint r0 = r1.mPaint
            r0.setColor(r2)
            r1.invalidateSelf()
        L10:
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

    public void setDirection(int r2) {
            r1 = this;
            int r0 = r1.mDirection
            if (r2 == r0) goto L9
            r1.mDirection = r2
            r1.invalidateSelf()
        L9:
            return
    }

    public void setGapSize(float r2) {
            r1 = this;
            float r0 = r1.mBarGap
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 == 0) goto Lb
            r1.mBarGap = r2
            r1.invalidateSelf()
        Lb:
            return
    }

    public void setProgress(float r2) {
            r1 = this;
            float r0 = r1.mProgress
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Lb
            r1.mProgress = r2
            r1.invalidateSelf()
        Lb:
            return
    }

    public void setSpinEnabled(boolean r2) {
            r1 = this;
            boolean r0 = r1.mSpin
            if (r0 == r2) goto L9
            r1.mSpin = r2
            r1.invalidateSelf()
        L9:
            return
    }

    public void setVerticalMirror(boolean r2) {
            r1 = this;
            boolean r0 = r1.mVerticalMirror
            if (r0 == r2) goto L9
            r1.mVerticalMirror = r2
            r1.invalidateSelf()
        L9:
            return
    }
}
