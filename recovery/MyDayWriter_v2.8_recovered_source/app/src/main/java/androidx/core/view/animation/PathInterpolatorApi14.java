package androidx.core.view.animation;

/* JADX INFO: loaded from: classes.dex */
class PathInterpolatorApi14 implements android.view.animation.Interpolator {
    private static final float PRECISION = 0.002f;
    private final float[] mX;
    private final float[] mY;

    PathInterpolatorApi14(float r2, float r3) {
            r1 = this;
            android.graphics.Path r0 = createQuad(r2, r3)
            r1.<init>(r0)
            return
    }

    PathInterpolatorApi14(float r2, float r3, float r4, float r5) {
            r1 = this;
            android.graphics.Path r0 = createCubic(r2, r3, r4, r5)
            r1.<init>(r0)
            return
    }

    PathInterpolatorApi14(android.graphics.Path r11) {
            r10 = this;
            r10.<init>()
            android.graphics.PathMeasure r0 = new android.graphics.PathMeasure
            r1 = 0
            r0.<init>(r11, r1)
            float r2 = r0.getLength()
            r3 = 990057071(0x3b03126f, float:0.002)
            float r3 = r2 / r3
            int r3 = (int) r3
            r4 = 1
            int r3 = r3 + r4
            float[] r5 = new float[r3]
            r10.mX = r5
            float[] r5 = new float[r3]
            r10.mY = r5
            r5 = 2
            float[] r5 = new float[r5]
            r6 = 0
        L21:
            if (r6 >= r3) goto L3c
            float r7 = (float) r6
            float r7 = r7 * r2
            int r8 = r3 + (-1)
            float r8 = (float) r8
            float r7 = r7 / r8
            r8 = 0
            r0.getPosTan(r7, r5, r8)
            float[] r8 = r10.mX
            r9 = r5[r1]
            r8[r6] = r9
            float[] r8 = r10.mY
            r9 = r5[r4]
            r8[r6] = r9
            int r6 = r6 + 1
            goto L21
        L3c:
            return
    }

    private static android.graphics.Path createCubic(float r8, float r9, float r10, float r11) {
            android.graphics.Path r0 = new android.graphics.Path
            r0.<init>()
            r1 = r0
            r0 = 0
            r1.moveTo(r0, r0)
            r6 = 1065353216(0x3f800000, float:1.0)
            r7 = 1065353216(0x3f800000, float:1.0)
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r1.cubicTo(r2, r3, r4, r5, r6, r7)
            return r1
    }

    private static android.graphics.Path createQuad(float r2, float r3) {
            android.graphics.Path r0 = new android.graphics.Path
            r0.<init>()
            r1 = 0
            r0.moveTo(r1, r1)
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.quadTo(r2, r3, r1, r1)
            return r0
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float r9) {
            r8 = this;
            r0 = 0
            int r1 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r1 > 0) goto L6
            return r0
        L6:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r2 < 0) goto Ld
            return r1
        Ld:
            r1 = 0
            float[] r2 = r8.mX
            int r2 = r2.length
            r3 = 1
            int r2 = r2 - r3
        L13:
            int r4 = r2 - r1
            if (r4 <= r3) goto L27
            int r4 = r1 + r2
            int r4 = r4 / 2
            float[] r5 = r8.mX
            r5 = r5[r4]
            int r5 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r5 >= 0) goto L25
            r2 = r4
            goto L26
        L25:
            r1 = r4
        L26:
            goto L13
        L27:
            float[] r3 = r8.mX
            r3 = r3[r2]
            float[] r4 = r8.mX
            r4 = r4[r1]
            float r3 = r3 - r4
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 != 0) goto L39
            float[] r0 = r8.mY
            r0 = r0[r1]
            return r0
        L39:
            float[] r0 = r8.mX
            r0 = r0[r1]
            float r0 = r9 - r0
            float r4 = r0 / r3
            float[] r5 = r8.mY
            r5 = r5[r1]
            float[] r6 = r8.mY
            r6 = r6[r2]
            float r7 = r6 - r5
            float r7 = r7 * r4
            float r7 = r7 + r5
            return r7
    }
}
