package androidx.vectordrawable.graphics.drawable;

/* JADX INFO: loaded from: classes.dex */
public class PathInterpolatorCompat implements android.view.animation.Interpolator {
    public static final double EPSILON = 1.0E-5d;
    public static final int MAX_NUM_POINTS = 3000;
    private static final float PRECISION = 0.002f;
    private float[] mX;
    private float[] mY;

    public PathInterpolatorCompat(android.content.Context r3, android.util.AttributeSet r4, org.xmlpull.v1.XmlPullParser r5) {
            r2 = this;
            android.content.res.Resources r0 = r3.getResources()
            android.content.res.Resources$Theme r1 = r3.getTheme()
            r2.<init>(r0, r1, r4, r5)
            return
    }

    public PathInterpolatorCompat(android.content.res.Resources r2, android.content.res.Resources.Theme r3, android.util.AttributeSet r4, org.xmlpull.v1.XmlPullParser r5) {
            r1 = this;
            r1.<init>()
            int[] r0 = androidx.vectordrawable.graphics.drawable.AndroidResources.STYLEABLE_PATH_INTERPOLATOR
            android.content.res.TypedArray r0 = androidx.core.content.res.TypedArrayUtils.obtainAttributes(r2, r3, r4, r0)
            r1.parseInterpolatorFromTypeArray(r0, r5)
            r0.recycle()
            return
    }

    private void initCubic(float r9, float r10, float r11, float r12) {
            r8 = this;
            android.graphics.Path r0 = new android.graphics.Path
            r0.<init>()
            r1 = r0
            r0 = 0
            r1.moveTo(r0, r0)
            r6 = 1065353216(0x3f800000, float:1.0)
            r7 = 1065353216(0x3f800000, float:1.0)
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r1.cubicTo(r2, r3, r4, r5, r6, r7)
            r8.initPath(r1)
            return
    }

    private void initPath(android.graphics.Path r13) {
            r12 = this;
            android.graphics.PathMeasure r0 = new android.graphics.PathMeasure
            r1 = 0
            r0.<init>(r13, r1)
            float r2 = r0.getLength()
            r3 = 990057071(0x3b03126f, float:0.002)
            float r3 = r2 / r3
            int r3 = (int) r3
            r4 = 1
            int r3 = r3 + r4
            r5 = 3000(0xbb8, float:4.204E-42)
            int r3 = java.lang.Math.min(r5, r3)
            if (r3 <= 0) goto L10b
            float[] r5 = new float[r3]
            r12.mX = r5
            float[] r5 = new float[r3]
            r12.mY = r5
            r5 = 2
            float[] r5 = new float[r5]
            r6 = 0
        L26:
            if (r6 >= r3) goto L41
            float r7 = (float) r6
            float r7 = r7 * r2
            int r8 = r3 + (-1)
            float r8 = (float) r8
            float r7 = r7 / r8
            r8 = 0
            r0.getPosTan(r7, r5, r8)
            float[] r8 = r12.mX
            r9 = r5[r1]
            r8[r6] = r9
            float[] r8 = r12.mY
            r9 = r5[r4]
            r8[r6] = r9
            int r6 = r6 + 1
            goto L26
        L41:
            float[] r4 = r12.mX
            r4 = r4[r1]
            float r4 = java.lang.Math.abs(r4)
            double r6 = (double) r4
            r8 = 4532020583610935537(0x3ee4f8b588e368f1, double:1.0E-5)
            int r4 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r4 > 0) goto Lc2
            float[] r4 = r12.mY
            r4 = r4[r1]
            float r4 = java.lang.Math.abs(r4)
            double r6 = (double) r4
            int r4 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r4 > 0) goto Lc2
            float[] r4 = r12.mX
            int r6 = r3 + (-1)
            r4 = r4[r6]
            r6 = 1065353216(0x3f800000, float:1.0)
            float r4 = r4 - r6
            float r4 = java.lang.Math.abs(r4)
            double r10 = (double) r4
            int r4 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r4 > 0) goto Lc2
            float[] r4 = r12.mY
            int r7 = r3 + (-1)
            r4 = r4[r7]
            float r4 = r4 - r6
            float r4 = java.lang.Math.abs(r4)
            double r6 = (double) r4
            int r4 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r4 > 0) goto Lc2
            r1 = 0
            r4 = 0
            r6 = 0
        L85:
            if (r6 >= r3) goto Lb3
            float[] r7 = r12.mX
            int r8 = r4 + 1
            r4 = r7[r4]
            int r7 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r7 < 0) goto L9a
            float[] r7 = r12.mX
            r7[r6] = r4
            r1 = r4
            int r6 = r6 + 1
            r4 = r8
            goto L85
        L9a:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "The Path cannot loop back on itself, x :"
            java.lang.StringBuilder r9 = r9.append(r10)
            java.lang.StringBuilder r9 = r9.append(r4)
            java.lang.String r9 = r9.toString()
            r7.<init>(r9)
            throw r7
        Lb3:
            boolean r6 = r0.nextContour()
            if (r6 != 0) goto Lba
            return
        Lba:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "The Path should be continuous, can't have 2+ contours"
            r6.<init>(r7)
            throw r6
        Lc2:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "The Path must start at (0,0) and end at (1,1) start: "
            java.lang.StringBuilder r6 = r6.append(r7)
            float[] r7 = r12.mX
            r7 = r7[r1]
            java.lang.StringBuilder r6 = r6.append(r7)
            java.lang.String r7 = ","
            java.lang.StringBuilder r6 = r6.append(r7)
            float[] r8 = r12.mY
            r1 = r8[r1]
            java.lang.StringBuilder r1 = r6.append(r1)
            java.lang.String r6 = " end:"
            java.lang.StringBuilder r1 = r1.append(r6)
            float[] r6 = r12.mX
            int r8 = r3 + (-1)
            r6 = r6[r8]
            java.lang.StringBuilder r1 = r1.append(r6)
            java.lang.StringBuilder r1 = r1.append(r7)
            float[] r6 = r12.mY
            int r7 = r3 + (-1)
            r6 = r6[r7]
            java.lang.StringBuilder r1 = r1.append(r6)
            java.lang.String r1 = r1.toString()
            r4.<init>(r1)
            throw r4
        L10b:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "The Path has a invalid length "
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.StringBuilder r4 = r4.append(r2)
            java.lang.String r4 = r4.toString()
            r1.<init>(r4)
            throw r1
    }

    private void initQuad(float r3, float r4) {
            r2 = this;
            android.graphics.Path r0 = new android.graphics.Path
            r0.<init>()
            r1 = 0
            r0.moveTo(r1, r1)
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.quadTo(r3, r4, r1, r1)
            r2.initPath(r0)
            return
    }

    private void parseInterpolatorFromTypeArray(android.content.res.TypedArray r9, org.xmlpull.v1.XmlPullParser r10) {
            r8 = this;
            java.lang.String r0 = "pathData"
            boolean r1 = androidx.core.content.res.TypedArrayUtils.hasAttribute(r10, r0)
            if (r1 == 0) goto L30
            r1 = 4
            java.lang.String r0 = androidx.core.content.res.TypedArrayUtils.getNamedString(r9, r10, r0, r1)
            android.graphics.Path r1 = androidx.core.graphics.PathParser.createPathFromPathData(r0)
            if (r1 == 0) goto L17
            r8.initPath(r1)
            goto L6c
        L17:
            android.view.InflateException r2 = new android.view.InflateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "The path is null, which is created from "
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
        L30:
            java.lang.String r0 = "controlX1"
            boolean r1 = androidx.core.content.res.TypedArrayUtils.hasAttribute(r10, r0)
            if (r1 == 0) goto L7d
            java.lang.String r1 = "controlY1"
            boolean r2 = androidx.core.content.res.TypedArrayUtils.hasAttribute(r10, r1)
            if (r2 == 0) goto L75
            r2 = 0
            r3 = 0
            float r0 = androidx.core.content.res.TypedArrayUtils.getNamedFloat(r9, r10, r0, r2, r3)
            r2 = 1
            float r1 = androidx.core.content.res.TypedArrayUtils.getNamedFloat(r9, r10, r1, r2, r3)
            java.lang.String r2 = "controlX2"
            boolean r4 = androidx.core.content.res.TypedArrayUtils.hasAttribute(r10, r2)
            java.lang.String r5 = "controlY2"
            boolean r6 = androidx.core.content.res.TypedArrayUtils.hasAttribute(r10, r5)
            if (r4 != r6) goto L6d
            if (r4 != 0) goto L5f
            r8.initQuad(r0, r1)
            goto L6c
        L5f:
            r7 = 2
            float r2 = androidx.core.content.res.TypedArrayUtils.getNamedFloat(r9, r10, r2, r7, r3)
            r7 = 3
            float r3 = androidx.core.content.res.TypedArrayUtils.getNamedFloat(r9, r10, r5, r7, r3)
            r8.initCubic(r0, r1, r2, r3)
        L6c:
            return
        L6d:
            android.view.InflateException r2 = new android.view.InflateException
            java.lang.String r3 = "pathInterpolator requires both controlX2 and controlY2 for cubic Beziers."
            r2.<init>(r3)
            throw r2
        L75:
            android.view.InflateException r0 = new android.view.InflateException
            java.lang.String r1 = "pathInterpolator requires the controlY1 attribute"
            r0.<init>(r1)
            throw r0
        L7d:
            android.view.InflateException r0 = new android.view.InflateException
            java.lang.String r1 = "pathInterpolator requires the controlX1 attribute"
            r0.<init>(r1)
            throw r0
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
