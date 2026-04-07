package androidx.core.util;

/* JADX INFO: loaded from: classes.dex */
public class TypedValueCompat {
    private static final float INCHES_PER_MM = 0.03937008f;
    private static final float INCHES_PER_PT = 0.013888889f;

    private static class Api34Impl {
        private Api34Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        public static float deriveDimension(int r1, float r2, android.util.DisplayMetrics r3) {
                float r0 = android.util.TypedValue.deriveDimension(r1, r2, r3)
                return r0
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface ComplexDimensionUnit {
    }

    private TypedValueCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static float deriveDimension(int r3, float r4, android.util.DisplayMetrics r5) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto Lb
            float r0 = androidx.core.util.TypedValueCompat.Api34Impl.deriveDimension(r3, r4, r5)
            return r0
        Lb:
            r0 = 0
            switch(r3) {
                case 0: goto L6c;
                case 1: goto L60;
                case 2: goto L54;
                case 3: goto L44;
                case 4: goto L38;
                case 5: goto L28;
                default: goto Lf;
            }
        Lf:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Invalid unitToConvertTo "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L28:
            float r1 = r5.xdpi
            int r1 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r1 != 0) goto L2f
            return r0
        L2f:
            float r0 = r5.xdpi
            float r0 = r4 / r0
            r1 = 1025589893(0x3d214285, float:0.03937008)
            float r0 = r0 / r1
            return r0
        L38:
            float r1 = r5.xdpi
            int r1 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r1 != 0) goto L3f
            return r0
        L3f:
            float r0 = r5.xdpi
            float r0 = r4 / r0
            return r0
        L44:
            float r1 = r5.xdpi
            int r1 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r1 != 0) goto L4b
            return r0
        L4b:
            float r0 = r5.xdpi
            float r0 = r4 / r0
            r1 = 1013157433(0x3c638e39, float:0.013888889)
            float r0 = r0 / r1
            return r0
        L54:
            float r1 = r5.scaledDensity
            int r1 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r1 != 0) goto L5b
            return r0
        L5b:
            float r0 = r5.scaledDensity
            float r0 = r4 / r0
            return r0
        L60:
            float r1 = r5.density
            int r1 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r1 != 0) goto L67
            return r0
        L67:
            float r0 = r5.density
            float r0 = r4 / r0
            return r0
        L6c:
            return r4
    }

    public static float dpToPx(float r1, android.util.DisplayMetrics r2) {
            r0 = 1
            float r0 = android.util.TypedValue.applyDimension(r0, r1, r2)
            return r0
    }

    public static int getUnitFromComplexDimension(int r1) {
            int r0 = r1 >> 0
            r0 = r0 & 15
            return r0
    }

    public static float pxToDp(float r1, android.util.DisplayMetrics r2) {
            r0 = 1
            float r0 = deriveDimension(r0, r1, r2)
            return r0
    }

    public static float pxToSp(float r1, android.util.DisplayMetrics r2) {
            r0 = 2
            float r0 = deriveDimension(r0, r1, r2)
            return r0
    }

    public static float spToPx(float r1, android.util.DisplayMetrics r2) {
            r0 = 2
            float r0 = android.util.TypedValue.applyDimension(r0, r1, r2)
            return r0
    }
}
