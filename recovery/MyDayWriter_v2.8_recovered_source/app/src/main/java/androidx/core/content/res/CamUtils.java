package androidx.core.content.res;

/* JADX INFO: loaded from: classes.dex */
final class CamUtils {
    static final float[][] CAM16RGB_TO_XYZ = null;
    static final float[][] SRGB_TO_XYZ = null;
    static final float[] WHITE_POINT_D65 = null;
    static final float[][] XYZ_TO_CAM16RGB = null;

    static {
            r0 = 3
            float[] r1 = new float[r0]
            r1 = {x0048: FILL_ARRAY_DATA , data: [1053652383, 1059484093, -1118648123} // fill-array
            float[] r2 = new float[r0]
            r2 = {x0052: FILL_ARRAY_DATA , data: [-1098898655, 1067067965, 1027330407} // fill-array
            float[] r3 = new float[r0]
            r3 = {x005c: FILL_ARRAY_DATA , data: [-1157087275, 1028162020, 1064566818} // fill-array
            float[][] r1 = new float[][]{r1, r2, r3}
            androidx.core.content.res.CamUtils.XYZ_TO_CAM16RGB = r1
            float[] r1 = new float[r0]
            r1 = {x0066: FILL_ARRAY_DATA , data: [1072584765, -1082036021, 1041810539} // fill-array
            float[] r2 = new float[r0]
            r2 = {x0070: FILL_ARRAY_DATA , data: [1053190625, 1059002158, -1139603558} // fill-array
            float[] r3 = new float[r0]
            r3 = {x007a: FILL_ARRAY_DATA , data: [-1132345847, -1123302273, 1065772348} // fill-array
            float[][] r1 = new float[][]{r1, r2, r3}
            androidx.core.content.res.CamUtils.CAM16RGB_TO_XYZ = r1
            float[] r1 = new float[r0]
            r1 = {x0084: FILL_ARRAY_DATA , data: [1119754256, 1120403456, 1121567769} // fill-array
            androidx.core.content.res.CamUtils.WHITE_POINT_D65 = r1
            float[] r1 = new float[r0]
            r1 = {x008e: FILL_ARRAY_DATA , data: [1054023191, 1052187149, 1043912633} // fill-array
            float[] r2 = new float[r0]
            r2 = {x0098: FILL_ARRAY_DATA , data: [1046066128, 1060575065, 1033100696} // fill-array
            float[] r0 = new float[r0]
            r0 = {x00a2: FILL_ARRAY_DATA , data: [1017006063, 1039404073, 1064520140} // fill-array
            float[][] r0 = new float[][]{r1, r2, r0}
            androidx.core.content.res.CamUtils.SRGB_TO_XYZ = r0
            return
    }

    private CamUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    static int intFromLStar(float r21) {
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r21 > r0 ? 1 : (r21 == r0 ? 0 : -1))
            if (r0 >= 0) goto L9
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            return r0
        L9:
            r0 = 1120272384(0x42c60000, float:99.0)
            int r0 = (r21 > r0 ? 1 : (r21 == r0 ? 0 : -1))
            if (r0 <= 0) goto L11
            r0 = -1
            return r0
        L11:
            r0 = 1098907648(0x41800000, float:16.0)
            float r1 = r21 + r0
            r2 = 1122500608(0x42e80000, float:116.0)
            float r1 = r1 / r2
            r3 = r1
            r4 = r1
            r5 = 1147261687(0x4461d2f7, float:903.2963)
            r6 = 1007753895(0x3c111aa7, float:0.008856452)
            r7 = 1090519040(0x41000000, float:8.0)
            int r7 = (r21 > r7 ? 1 : (r21 == r7 ? 0 : -1))
            r8 = 1
            r9 = 0
            if (r7 <= 0) goto L2a
            r7 = r8
            goto L2b
        L2a:
            r7 = r9
        L2b:
            if (r7 == 0) goto L31
            float r10 = r1 * r1
            float r10 = r10 * r1
            goto L33
        L31:
            float r10 = r21 / r5
        L33:
            float r11 = r1 * r1
            float r11 = r11 * r1
            int r11 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r11 <= 0) goto L3c
            r11 = r8
            goto L3d
        L3c:
            r11 = r9
        L3d:
            if (r11 == 0) goto L43
            float r12 = r4 * r4
            float r12 = r12 * r4
            goto L47
        L43:
            float r12 = r4 * r2
            float r12 = r12 - r0
            float r12 = r12 / r5
        L47:
            if (r11 == 0) goto L4d
            float r0 = r3 * r3
            float r0 = r0 * r3
            goto L51
        L4d:
            float r2 = r2 * r4
            float r2 = r2 - r0
            float r0 = r2 / r5
        L51:
            float[] r2 = androidx.core.content.res.CamUtils.WHITE_POINT_D65
            r2 = r2[r9]
            float r2 = r2 * r12
            double r13 = (double) r2
            float[] r2 = androidx.core.content.res.CamUtils.WHITE_POINT_D65
            r2 = r2[r8]
            float r2 = r2 * r10
            double r8 = (double) r2
            float[] r2 = androidx.core.content.res.CamUtils.WHITE_POINT_D65
            r15 = 2
            r2 = r2[r15]
            float r2 = r2 * r0
            r20 = r0
            r19 = r1
            double r0 = (double) r2
            r17 = r0
            r15 = r8
            int r0 = androidx.core.graphics.ColorUtils.XYZToColor(r13, r15, r17)
            return r0
    }

    static float lStarFromInt(int r1) {
            float r0 = yFromInt(r1)
            float r0 = lStarFromY(r0)
            return r0
    }

    static float lStarFromY(float r4) {
            r0 = 1120403456(0x42c80000, float:100.0)
            float r4 = r4 / r0
            r0 = 1007753895(0x3c111aa7, float:0.008856452)
            r1 = 1007753895(0x3c111aa7, float:0.008856452)
            int r1 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r1 > 0) goto L12
            r1 = 1147261687(0x4461d2f7, float:903.2963)
            float r1 = r1 * r4
            return r1
        L12:
            double r1 = (double) r4
            double r1 = java.lang.Math.cbrt(r1)
            float r1 = (float) r1
            r2 = 1122500608(0x42e80000, float:116.0)
            float r2 = r2 * r1
            r3 = 1098907648(0x41800000, float:16.0)
            float r2 = r2 - r3
            return r2
    }

    static float lerp(float r1, float r2, float r3) {
            float r0 = r2 - r1
            float r0 = r0 * r3
            float r0 = r0 + r1
            return r0
    }

    static float linearized(int r7) {
            float r0 = (float) r7
            r1 = 1132396544(0x437f0000, float:255.0)
            float r0 = r0 / r1
            r1 = 1025879782(0x3d25aee6, float:0.04045)
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r2 = 1120403456(0x42c80000, float:100.0)
            if (r1 > 0) goto L14
            r1 = 1095678034(0x414eb852, float:12.92)
            float r1 = r0 / r1
            float r1 = r1 * r2
            return r1
        L14:
            r1 = 1029785518(0x3d6147ae, float:0.055)
            float r1 = r1 + r0
            r3 = 1065814589(0x3f870a3d, float:1.055)
            float r1 = r1 / r3
            double r3 = (double) r1
            r5 = 4612586738567610368(0x4003333340000000, double:2.4000000953674316)
            double r3 = java.lang.Math.pow(r3, r5)
            float r1 = (float) r3
            float r1 = r1 * r2
            return r1
    }

    static void xyzFromInt(int r9, float[] r10) {
            int r0 = android.graphics.Color.red(r9)
            float r0 = linearized(r0)
            int r1 = android.graphics.Color.green(r9)
            float r1 = linearized(r1)
            int r2 = android.graphics.Color.blue(r9)
            float r2 = linearized(r2)
            float[][] r3 = androidx.core.content.res.CamUtils.SRGB_TO_XYZ
            r4 = 0
            r5 = r3[r4]
            r5 = r5[r4]
            float r5 = r5 * r0
            r6 = r3[r4]
            r7 = 1
            r6 = r6[r7]
            float r6 = r6 * r1
            float r5 = r5 + r6
            r6 = r3[r4]
            r8 = 2
            r6 = r6[r8]
            float r6 = r6 * r2
            float r5 = r5 + r6
            r10[r4] = r5
            r5 = r3[r7]
            r5 = r5[r4]
            float r5 = r5 * r0
            r6 = r3[r7]
            r6 = r6[r7]
            float r6 = r6 * r1
            float r5 = r5 + r6
            r6 = r3[r7]
            r6 = r6[r8]
            float r6 = r6 * r2
            float r5 = r5 + r6
            r10[r7] = r5
            r5 = r3[r8]
            r4 = r5[r4]
            float r4 = r4 * r0
            r5 = r3[r8]
            r5 = r5[r7]
            float r5 = r5 * r1
            float r4 = r4 + r5
            r5 = r3[r8]
            r5 = r5[r8]
            float r5 = r5 * r2
            float r4 = r4 + r5
            r10[r8] = r4
            return
    }

    static float yFromInt(int r7) {
            int r0 = android.graphics.Color.red(r7)
            float r0 = linearized(r0)
            int r1 = android.graphics.Color.green(r7)
            float r1 = linearized(r1)
            int r2 = android.graphics.Color.blue(r7)
            float r2 = linearized(r2)
            float[][] r3 = androidx.core.content.res.CamUtils.SRGB_TO_XYZ
            r4 = 1
            r5 = r3[r4]
            r6 = 0
            r5 = r5[r6]
            float r5 = r5 * r0
            r6 = r3[r4]
            r6 = r6[r4]
            float r6 = r6 * r1
            float r5 = r5 + r6
            r4 = r3[r4]
            r6 = 2
            r4 = r4[r6]
            float r4 = r4 * r2
            float r5 = r5 + r4
            return r5
    }

    static float yFromLStar(float r7) {
            r0 = 1090519040(0x41000000, float:8.0)
            int r1 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            r2 = 1120403456(0x42c80000, float:100.0)
            if (r1 <= 0) goto L18
            double r3 = (double) r7
            r5 = 4625196817309499392(0x4030000000000000, double:16.0)
            double r3 = r3 + r5
            r5 = 4637863191261478912(0x405d000000000000, double:116.0)
            double r3 = r3 / r5
            r5 = 4613937818241073152(0x4008000000000000, double:3.0)
            double r3 = java.lang.Math.pow(r3, r5)
            float r1 = (float) r3
            float r1 = r1 * r2
            return r1
        L18:
            r1 = 1147261687(0x4461d2f7, float:903.2963)
            float r1 = r7 / r1
            float r1 = r1 * r2
            return r1
    }
}
