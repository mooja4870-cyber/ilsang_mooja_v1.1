package androidx.core.graphics;

/* JADX INFO: loaded from: classes.dex */
public final class ColorUtils {
    private static final int MIN_ALPHA_SEARCH_MAX_ITERATIONS = 10;
    private static final int MIN_ALPHA_SEARCH_PRECISION = 1;
    private static final java.lang.ThreadLocal<double[]> TEMP_ARRAY = null;
    private static final double XYZ_EPSILON = 0.008856d;
    private static final double XYZ_KAPPA = 903.3d;
    private static final double XYZ_WHITE_REFERENCE_X = 95.047d;
    private static final double XYZ_WHITE_REFERENCE_Y = 100.0d;
    private static final double XYZ_WHITE_REFERENCE_Z = 108.883d;

    static class Api26Impl {
        private Api26Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static android.graphics.Color compositeColors(android.graphics.Color r9, android.graphics.Color r10) {
                android.graphics.ColorSpace$Model r0 = r9.getModel()
                android.graphics.ColorSpace$Model r1 = r10.getModel()
                boolean r0 = java.util.Objects.equals(r0, r1)
                if (r0 == 0) goto L6a
                android.graphics.ColorSpace r0 = r10.getColorSpace()
                android.graphics.ColorSpace r1 = r9.getColorSpace()
                boolean r0 = java.util.Objects.equals(r0, r1)
                if (r0 == 0) goto L1e
                r0 = r9
                goto L26
            L1e:
                android.graphics.ColorSpace r0 = r10.getColorSpace()
                android.graphics.Color r0 = r9.convert(r0)
            L26:
                float[] r1 = r0.getComponents()
                float[] r2 = r10.getComponents()
                float r3 = r0.alpha()
                float r4 = r10.alpha()
                r5 = 1065353216(0x3f800000, float:1.0)
                float r5 = r5 - r3
                float r4 = r4 * r5
                int r5 = r10.getComponentCount()
                int r5 = r5 + (-1)
                float r6 = r3 + r4
                r2[r5] = r6
                r6 = r2[r5]
                r7 = 0
                int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
                if (r6 <= 0) goto L52
                r6 = r2[r5]
                float r3 = r3 / r6
                r6 = r2[r5]
                float r4 = r4 / r6
            L52:
                r6 = 0
            L53:
                if (r6 >= r5) goto L61
                r7 = r1[r6]
                float r7 = r7 * r3
                r8 = r2[r6]
                float r8 = r8 * r4
                float r7 = r7 + r8
                r2[r6] = r7
                int r6 = r6 + 1
                goto L53
            L61:
                android.graphics.ColorSpace r6 = r10.getColorSpace()
                android.graphics.Color r6 = android.graphics.Color.valueOf(r2, r6)
                return r6
            L6a:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Color models must match ("
                java.lang.StringBuilder r1 = r1.append(r2)
                android.graphics.ColorSpace$Model r2 = r9.getModel()
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.String r2 = " vs. "
                java.lang.StringBuilder r1 = r1.append(r2)
                android.graphics.ColorSpace$Model r2 = r10.getModel()
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.String r2 = ")"
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
        }
    }

    static {
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            androidx.core.graphics.ColorUtils.TEMP_ARRAY = r0
            return
    }

    private ColorUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static int HSLToColor(float[] r13) {
            r0 = 0
            r1 = r13[r0]
            r2 = 1
            r2 = r13[r2]
            r3 = 2
            r3 = r13[r3]
            r4 = 1073741824(0x40000000, float:2.0)
            float r5 = r3 * r4
            r6 = 1065353216(0x3f800000, float:1.0)
            float r5 = r5 - r6
            float r5 = java.lang.Math.abs(r5)
            float r5 = r6 - r5
            float r5 = r5 * r2
            r7 = 1056964608(0x3f000000, float:0.5)
            float r7 = r7 * r5
            float r7 = r3 - r7
            r8 = 1114636288(0x42700000, float:60.0)
            float r8 = r1 / r8
            float r8 = r8 % r4
            float r8 = r8 - r6
            float r4 = java.lang.Math.abs(r8)
            float r6 = r6 - r4
            float r6 = r6 * r5
            int r4 = (int) r1
            int r4 = r4 / 60
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 1132396544(0x437f0000, float:255.0)
            switch(r4) {
                case 0: goto L9d;
                case 1: goto L89;
                case 2: goto L74;
                case 3: goto L5f;
                case 4: goto L4a;
                case 5: goto L35;
                case 6: goto L35;
                default: goto L33;
            }
        L33:
            goto Lb1
        L35:
            float r12 = r5 + r7
            float r12 = r12 * r11
            int r8 = java.lang.Math.round(r12)
            float r12 = r7 * r11
            int r9 = java.lang.Math.round(r12)
            float r12 = r6 + r7
            float r12 = r12 * r11
            int r10 = java.lang.Math.round(r12)
            goto Lb1
        L4a:
            float r12 = r6 + r7
            float r12 = r12 * r11
            int r8 = java.lang.Math.round(r12)
            float r12 = r7 * r11
            int r9 = java.lang.Math.round(r12)
            float r12 = r5 + r7
            float r12 = r12 * r11
            int r10 = java.lang.Math.round(r12)
            goto Lb1
        L5f:
            float r12 = r7 * r11
            int r8 = java.lang.Math.round(r12)
            float r12 = r6 + r7
            float r12 = r12 * r11
            int r9 = java.lang.Math.round(r12)
            float r12 = r5 + r7
            float r12 = r12 * r11
            int r10 = java.lang.Math.round(r12)
            goto Lb1
        L74:
            float r12 = r7 * r11
            int r8 = java.lang.Math.round(r12)
            float r12 = r5 + r7
            float r12 = r12 * r11
            int r9 = java.lang.Math.round(r12)
            float r12 = r6 + r7
            float r12 = r12 * r11
            int r10 = java.lang.Math.round(r12)
            goto Lb1
        L89:
            float r12 = r6 + r7
            float r12 = r12 * r11
            int r8 = java.lang.Math.round(r12)
            float r12 = r5 + r7
            float r12 = r12 * r11
            int r9 = java.lang.Math.round(r12)
            float r11 = r11 * r7
            int r10 = java.lang.Math.round(r11)
            goto Lb1
        L9d:
            float r12 = r5 + r7
            float r12 = r12 * r11
            int r8 = java.lang.Math.round(r12)
            float r12 = r6 + r7
            float r12 = r12 * r11
            int r9 = java.lang.Math.round(r12)
            float r11 = r11 * r7
            int r10 = java.lang.Math.round(r11)
        Lb1:
            r11 = 255(0xff, float:3.57E-43)
            int r8 = constrain(r8, r0, r11)
            int r9 = constrain(r9, r0, r11)
            int r0 = constrain(r10, r0, r11)
            int r10 = android.graphics.Color.rgb(r8, r9, r0)
            return r10
    }

    public static int LABToColor(double r13, double r15, double r17) {
            double[] r6 = getTempDouble3Array()
            r0 = r13
            r2 = r15
            r4 = r17
            LABToXYZ(r0, r2, r4, r6)
            r0 = 0
            r7 = r6[r0]
            r0 = 1
            r9 = r6[r0]
            r0 = 2
            r11 = r6[r0]
            int r0 = XYZToColor(r7, r9, r11)
            return r0
    }

    public static void LABToXYZ(double r23, double r25, double r27, double[] r29) {
            r0 = 4625196817309499392(0x4030000000000000, double:16.0)
            double r2 = r23 + r0
            r4 = 4637863191261478912(0x405d000000000000, double:116.0)
            double r2 = r2 / r4
            r6 = 4647503709213818880(0x407f400000000000, double:500.0)
            double r6 = r25 / r6
            double r6 = r6 + r2
            r8 = 4641240890982006784(0x4069000000000000, double:200.0)
            double r8 = r27 / r8
            double r8 = r2 - r8
            r10 = 4613937818241073152(0x4008000000000000, double:3.0)
            double r12 = java.lang.Math.pow(r6, r10)
            r14 = 4576258758203452558(0x3f82231832fcac8e, double:0.008856)
            int r16 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            r17 = 4651156726645941862(0x408c3a6666666666, double:903.3)
            if (r16 <= 0) goto L2c
            r19 = r12
            goto L32
        L2c:
            double r19 = r6 * r4
            double r19 = r19 - r0
            double r19 = r19 / r17
        L32:
            r21 = 4620692795244483847(0x401fff9da4c11507, double:7.9996247999999985)
            int r16 = (r23 > r21 ? 1 : (r23 == r21 ? 0 : -1))
            if (r16 <= 0) goto L40
            double r21 = java.lang.Math.pow(r2, r10)
            goto L42
        L40:
            double r21 = r23 / r17
        L42:
            double r10 = java.lang.Math.pow(r8, r10)
            int r12 = (r10 > r14 ? 1 : (r10 == r14 ? 0 : -1))
            if (r12 <= 0) goto L4c
            r4 = r10
            goto L50
        L4c:
            double r4 = r4 * r8
            double r4 = r4 - r0
            double r4 = r4 / r17
        L50:
            r0 = 4636388754964724318(0x4057c3020c49ba5e, double:95.047)
            double r0 = r0 * r19
            r12 = 0
            r29[r12] = r0
            r0 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r0 = r0 * r21
            r12 = 1
            r29[r12] = r0
            r0 = 4637362376909166477(0x405b3883126e978d, double:108.883)
            double r0 = r0 * r4
            r12 = 2
            r29[r12] = r0
            return
    }

    public static int M3HCTToColor(float r1, float r2, float r3) {
            int r0 = androidx.core.content.res.CamColor.toColor(r1, r2, r3)
            return r0
    }

    public static void RGBToHSL(int r16, int r17, int r18, float[] r19) {
            r0 = r16
            float r1 = (float) r0
            r2 = 1132396544(0x437f0000, float:255.0)
            float r1 = r1 / r2
            r3 = r17
            float r4 = (float) r3
            float r4 = r4 / r2
            r5 = r18
            float r6 = (float) r5
            float r6 = r6 / r2
            float r2 = java.lang.Math.max(r4, r6)
            float r2 = java.lang.Math.max(r1, r2)
            float r7 = java.lang.Math.min(r4, r6)
            float r7 = java.lang.Math.min(r1, r7)
            float r8 = r2 - r7
            float r9 = r2 + r7
            r10 = 1073741824(0x40000000, float:2.0)
            float r9 = r9 / r10
            int r11 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            r12 = 1065353216(0x3f800000, float:1.0)
            r13 = 0
            if (r11 != 0) goto L2f
            r10 = r13
            r11 = r13
            goto L53
        L2f:
            int r11 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r11 != 0) goto L3a
            float r11 = r4 - r6
            float r11 = r11 / r8
            r14 = 1086324736(0x40c00000, float:6.0)
            float r11 = r11 % r14
            goto L49
        L3a:
            int r11 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r11 != 0) goto L43
            float r11 = r6 - r1
            float r11 = r11 / r8
            float r11 = r11 + r10
            goto L49
        L43:
            float r11 = r1 - r4
            float r11 = r11 / r8
            r14 = 1082130432(0x40800000, float:4.0)
            float r11 = r11 + r14
        L49:
            float r10 = r10 * r9
            float r10 = r10 - r12
            float r10 = java.lang.Math.abs(r10)
            float r10 = r12 - r10
            float r10 = r8 / r10
        L53:
            r14 = 1114636288(0x42700000, float:60.0)
            float r14 = r14 * r11
            r15 = 1135869952(0x43b40000, float:360.0)
            float r14 = r14 % r15
            int r11 = (r14 > r13 ? 1 : (r14 == r13 ? 0 : -1))
            if (r11 >= 0) goto L5e
            float r14 = r14 + r15
        L5e:
            r11 = 0
            float r15 = constrain(r14, r13, r15)
            r19[r11] = r15
            r11 = 1
            float r15 = constrain(r10, r13, r12)
            r19[r11] = r15
            r11 = 2
            float r12 = constrain(r9, r13, r12)
            r19[r11] = r12
            return
    }

    public static void RGBToLAB(int r8, int r9, int r10, double[] r11) {
            RGBToXYZ(r8, r9, r10, r11)
            r0 = 0
            r1 = r11[r0]
            r0 = 1
            r3 = r11[r0]
            r0 = 2
            r5 = r11[r0]
            r7 = r11
            XYZToLAB(r1, r3, r5, r7)
            return
    }

    public static void RGBToXYZ(int r25, int r26, int r27, double[] r28) {
            r0 = r28
            int r1 = r0.length
            r2 = 3
            if (r1 != r2) goto Lb7
            r1 = r25
            double r2 = (double) r1
            r4 = 4643176031446892544(0x406fe00000000000, double:255.0)
            double r2 = r2 / r4
            r6 = 4585990280393462802(0x3fa4b5dcc63f1412, double:0.04045)
            int r8 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            r9 = 4623462931452961751(0x4029d70a3d70a3d7, double:12.92)
            r11 = 4612586738352862003(0x4003333333333333, double:2.4)
            r13 = 4607430116779522785(0x3ff0e147ae147ae1, double:1.055)
            r15 = 4588087156379966505(0x3fac28f5c28f5c29, double:0.055)
            if (r8 >= 0) goto L31
            double r17 = r2 / r9
            r19 = r4
            goto L3b
        L31:
            double r17 = r2 + r15
            r19 = r4
            double r4 = r17 / r13
            double r17 = java.lang.Math.pow(r4, r11)
        L3b:
            r2 = r26
            double r3 = (double) r2
            double r3 = r3 / r19
            int r5 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r5 >= 0) goto L49
            double r21 = r3 / r9
            r23 = r6
            goto L53
        L49:
            double r21 = r3 + r15
            r23 = r6
            double r6 = r21 / r13
            double r21 = java.lang.Math.pow(r6, r11)
        L53:
            r3 = r27
            double r4 = (double) r3
            double r4 = r4 / r19
            int r6 = (r4 > r23 ? 1 : (r4 == r23 ? 0 : -1))
            if (r6 >= 0) goto L5f
            double r6 = r4 / r9
            goto L66
        L5f:
            double r15 = r15 + r4
            double r6 = r15 / r13
            double r6 = java.lang.Math.pow(r6, r11)
        L66:
            r4 = 4601100757863216290(0x3fda64c2f837b4a2, double:0.4124)
            double r4 = r4 * r17
            r8 = 4600113568824896677(0x3fd6e2eb1c432ca5, double:0.3576)
            double r8 = r8 * r21
            double r4 = r4 + r8
            r8 = 4595671218152458420(0x3fc71a9fbe76c8b4, double:0.1805)
            double r8 = r8 * r6
            double r4 = r4 + r8
            r8 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r4 = r4 * r8
            r10 = 0
            r0[r10] = r4
            r4 = 4596827742536767164(0x3fcb367a0f9096bc, double:0.2126)
            double r4 = r4 * r17
            r10 = 4604617168452267173(0x3fe6e2eb1c432ca5, double:0.7152)
            double r10 = r10 * r21
            double r4 = r4 + r10
            r10 = 4589866978952703325(0x3fb27bb2fec56d5d, double:0.0722)
            double r10 = r10 * r6
            double r4 = r4 + r10
            double r4 = r4 * r8
            r10 = 1
            r0[r10] = r4
            r4 = 4581220067668151973(0x3f93c36113404ea5, double:0.0193)
            double r4 = r4 * r17
            r10 = 4593253685872485938(0x3fbe83e425aee632, double:0.1192)
            double r10 = r10 * r21
            double r4 = r4 + r10
            r10 = 4606736562436907729(0x3fee6a7ef9db22d1, double:0.9505)
            double r10 = r10 * r6
            double r4 = r4 + r10
            double r4 = r4 * r8
            r8 = 2
            r0[r8] = r4
            return
        Lb7:
            r1 = r25
            r2 = r26
            r3 = r27
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "outXyz must have a length of 3."
            r4.<init>(r5)
            throw r4
    }

    public static int XYZToColor(double r19, double r21, double r23) {
            r0 = 4614479601276245823(0x4009ecbfb15b573f, double:3.2406)
            double r0 = r0 * r19
            r2 = -4613770284334934970(0xbff8985f06f69446, double:-1.5372)
            double r2 = r2 * r21
            double r0 = r0 + r2
            r2 = -4620718437840042171(0xbfdfe90ff9724745, double:-0.4986)
            double r2 = r2 * r23
            double r0 = r0 + r2
            r2 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r0 = r0 / r2
            r4 = -4616469741951580845(0xbfef013a92a30553, double:-0.9689)
            double r4 = r4 * r19
            r6 = 4611126671353668488(0x3ffe0346dc5d6388, double:1.8758)
            double r6 = r6 * r21
            double r4 = r4 + r6
            r6 = 4586141601340942451(0x3fa53f7ced916873, double:0.0415)
            double r6 = r6 * r23
            double r4 = r4 + r6
            double r4 = r4 / r2
            r6 = 4588188037011619604(0x3fac84b5dcc63f14, double:0.0557)
            double r6 = r6 * r19
            r8 = -4626854141972371735(0xbfca1cac083126e9, double:-0.204)
            double r8 = r8 * r21
            double r6 = r6 + r8
            r8 = 4607439123978777526(0x3ff0e978d4fdf3b6, double:1.057)
            double r8 = r8 * r23
            double r6 = r6 + r8
            double r6 = r6 / r2
            r2 = 4569365555819558681(0x3f69a5c37387b719, double:0.0031308)
            int r8 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r9 = 4588087156379966505(0x3fac28f5c28f5c29, double:0.055)
            r11 = 4601177619296856747(0x3fdaaaaaaaaaaaab, double:0.4166666666666667)
            r13 = 4607430116779522785(0x3ff0e147ae147ae1, double:1.055)
            r15 = 4623462931452961751(0x4029d70a3d70a3d7, double:12.92)
            if (r8 <= 0) goto L70
            double r17 = java.lang.Math.pow(r0, r11)
            double r17 = r17 * r13
            double r17 = r17 - r9
            goto L72
        L70:
            double r17 = r0 * r15
        L72:
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 <= 0) goto L7d
            double r0 = java.lang.Math.pow(r4, r11)
            double r0 = r0 * r13
            double r0 = r0 - r9
            goto L7f
        L7d:
            double r0 = r4 * r15
        L7f:
            int r2 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r2 <= 0) goto L8a
            double r2 = java.lang.Math.pow(r6, r11)
            double r2 = r2 * r13
            double r2 = r2 - r9
            goto L8c
        L8a:
            double r2 = r6 * r15
        L8c:
            r4 = 4643176031446892544(0x406fe00000000000, double:255.0)
            double r6 = r17 * r4
            long r6 = java.lang.Math.round(r6)
            int r6 = (int) r6
            r7 = 0
            r8 = 255(0xff, float:3.57E-43)
            int r6 = constrain(r6, r7, r8)
            double r9 = r0 * r4
            long r9 = java.lang.Math.round(r9)
            int r9 = (int) r9
            int r9 = constrain(r9, r7, r8)
            double r4 = r4 * r2
            long r4 = java.lang.Math.round(r4)
            int r4 = (int) r4
            int r4 = constrain(r4, r7, r8)
            int r4 = android.graphics.Color.rgb(r6, r9, r4)
            return r4
    }

    public static void XYZToLAB(double r4, double r6, double r8, double[] r10) {
            int r0 = r10.length
            r1 = 3
            if (r0 != r1) goto L45
            r0 = 4636388754964724318(0x4057c3020c49ba5e, double:95.047)
            double r0 = r4 / r0
            double r4 = pivotXyzComponent(r0)
            r0 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r0 = r6 / r0
            double r6 = pivotXyzComponent(r0)
            r0 = 4637362376909166477(0x405b3883126e978d, double:108.883)
            double r0 = r8 / r0
            double r8 = pivotXyzComponent(r0)
            r0 = 4637863191261478912(0x405d000000000000, double:116.0)
            double r0 = r0 * r6
            r2 = 4625196817309499392(0x4030000000000000, double:16.0)
            double r0 = r0 - r2
            r2 = 0
            double r0 = java.lang.Math.max(r2, r0)
            r2 = 0
            r10[r2] = r0
            r0 = 4647503709213818880(0x407f400000000000, double:500.0)
            double r2 = r4 - r6
            double r2 = r2 * r0
            r0 = 1
            r10[r0] = r2
            r0 = 4641240890982006784(0x4069000000000000, double:200.0)
            double r2 = r6 - r8
            double r2 = r2 * r0
            r0 = 2
            r10[r0] = r2
            return
        L45:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "outLab must have a length of 3."
            r0.<init>(r1)
            throw r0
    }

    public static int blendARGB(int r9, int r10, float r11) {
            r0 = 1065353216(0x3f800000, float:1.0)
            float r0 = r0 - r11
            int r1 = android.graphics.Color.alpha(r9)
            float r1 = (float) r1
            float r1 = r1 * r0
            int r2 = android.graphics.Color.alpha(r10)
            float r2 = (float) r2
            float r2 = r2 * r11
            float r1 = r1 + r2
            int r2 = android.graphics.Color.red(r9)
            float r2 = (float) r2
            float r2 = r2 * r0
            int r3 = android.graphics.Color.red(r10)
            float r3 = (float) r3
            float r3 = r3 * r11
            float r2 = r2 + r3
            int r3 = android.graphics.Color.green(r9)
            float r3 = (float) r3
            float r3 = r3 * r0
            int r4 = android.graphics.Color.green(r10)
            float r4 = (float) r4
            float r4 = r4 * r11
            float r3 = r3 + r4
            int r4 = android.graphics.Color.blue(r9)
            float r4 = (float) r4
            float r4 = r4 * r0
            int r5 = android.graphics.Color.blue(r10)
            float r5 = (float) r5
            float r5 = r5 * r11
            float r4 = r4 + r5
            int r5 = (int) r1
            int r6 = (int) r2
            int r7 = (int) r3
            int r8 = (int) r4
            int r5 = android.graphics.Color.argb(r5, r6, r7, r8)
            return r5
    }

    public static void blendHSL(float[] r4, float[] r5, float r6, float[] r7) {
            int r0 = r7.length
            r1 = 3
            if (r0 != r1) goto L27
            r0 = 1065353216(0x3f800000, float:1.0)
            float r0 = r0 - r6
            r1 = 0
            r2 = r4[r1]
            r3 = r5[r1]
            float r2 = circularInterpolate(r2, r3, r6)
            r7[r1] = r2
            r1 = 1
            r2 = r4[r1]
            float r2 = r2 * r0
            r3 = r5[r1]
            float r3 = r3 * r6
            float r2 = r2 + r3
            r7[r1] = r2
            r1 = 2
            r2 = r4[r1]
            float r2 = r2 * r0
            r3 = r5[r1]
            float r3 = r3 * r6
            float r2 = r2 + r3
            r7[r1] = r2
            return
        L27:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "result must have a length of 3."
            r0.<init>(r1)
            throw r0
    }

    public static void blendLAB(double[] r7, double[] r8, double r9, double[] r11) {
            int r0 = r11.length
            r1 = 3
            if (r0 != r1) goto L26
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r0 = r0 - r9
            r2 = 0
            r3 = r7[r2]
            double r3 = r3 * r0
            r5 = r8[r2]
            double r5 = r5 * r9
            double r3 = r3 + r5
            r11[r2] = r3
            r2 = 1
            r3 = r7[r2]
            double r3 = r3 * r0
            r5 = r8[r2]
            double r5 = r5 * r9
            double r3 = r3 + r5
            r11[r2] = r3
            r2 = 2
            r3 = r7[r2]
            double r3 = r3 * r0
            r5 = r8[r2]
            double r5 = r5 * r9
            double r3 = r3 + r5
            r11[r2] = r3
            return
        L26:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "outResult must have a length of 3."
            r0.<init>(r1)
            throw r0
    }

    public static double calculateContrast(int r8, int r9) {
            int r0 = android.graphics.Color.alpha(r9)
            r1 = 255(0xff, float:3.57E-43)
            if (r0 != r1) goto L2b
            int r0 = android.graphics.Color.alpha(r8)
            if (r0 >= r1) goto L12
            int r8 = compositeColors(r8, r9)
        L12:
            double r0 = calculateLuminance(r8)
            r2 = 4587366580439587226(0x3fa999999999999a, double:0.05)
            double r0 = r0 + r2
            double r4 = calculateLuminance(r9)
            double r4 = r4 + r2
            double r2 = java.lang.Math.max(r0, r4)
            double r6 = java.lang.Math.min(r0, r4)
            double r2 = r2 / r6
            return r2
        L2b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "background can not be translucent: #"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = java.lang.Integer.toHexString(r9)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public static double calculateLuminance(int r5) {
            double[] r0 = getTempDouble3Array()
            colorToXYZ(r5, r0)
            r1 = 1
            r1 = r0[r1]
            r3 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r1 = r1 / r3
            return r1
    }

    public static int calculateMinimumAlpha(int r9, int r10, float r11) {
            int r0 = android.graphics.Color.alpha(r10)
            r1 = 255(0xff, float:3.57E-43)
            if (r0 != r1) goto L3d
            int r0 = setAlphaComponent(r9, r1)
            double r1 = calculateContrast(r0, r10)
            double r3 = (double) r11
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 >= 0) goto L17
            r3 = -1
            return r3
        L17:
            r3 = 0
            r4 = 0
            r5 = 255(0xff, float:3.57E-43)
        L1b:
            r6 = 10
            if (r3 > r6) goto L3c
            int r6 = r5 - r4
            r7 = 1
            if (r6 <= r7) goto L3c
            int r6 = r4 + r5
            int r6 = r6 / 2
            int r0 = setAlphaComponent(r9, r6)
            double r1 = calculateContrast(r0, r10)
            double r7 = (double) r11
            int r7 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r7 >= 0) goto L37
            r4 = r6
            goto L38
        L37:
            r5 = r6
        L38:
            int r3 = r3 + 1
            goto L1b
        L3c:
            return r5
        L3d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "background can not be translucent: #"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = java.lang.Integer.toHexString(r10)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    static float circularInterpolate(float r2, float r3, float r4) {
            float r0 = r3 - r2
            float r0 = java.lang.Math.abs(r0)
            r1 = 1127481344(0x43340000, float:180.0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r1 = 1135869952(0x43b40000, float:360.0)
            if (r0 <= 0) goto L15
            int r0 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r0 <= 0) goto L14
            float r2 = r2 + r1
            goto L15
        L14:
            float r3 = r3 + r1
        L15:
            float r0 = r3 - r2
            float r0 = r0 * r4
            float r0 = r0 + r2
            float r0 = r0 % r1
            return r0
    }

    public static void colorToHSL(int r3, float[] r4) {
            int r0 = android.graphics.Color.red(r3)
            int r1 = android.graphics.Color.green(r3)
            int r2 = android.graphics.Color.blue(r3)
            RGBToHSL(r0, r1, r2, r4)
            return
    }

    public static void colorToLAB(int r3, double[] r4) {
            int r0 = android.graphics.Color.red(r3)
            int r1 = android.graphics.Color.green(r3)
            int r2 = android.graphics.Color.blue(r3)
            RGBToLAB(r0, r1, r2, r4)
            return
    }

    public static void colorToM3HCT(int r0, float[] r1) {
            androidx.core.content.res.CamColor.getM3HCTfromColor(r0, r1)
            return
    }

    public static void colorToXYZ(int r3, double[] r4) {
            int r0 = android.graphics.Color.red(r3)
            int r1 = android.graphics.Color.green(r3)
            int r2 = android.graphics.Color.blue(r3)
            RGBToXYZ(r0, r1, r2, r4)
            return
    }

    private static int compositeAlpha(int r2, int r3) {
            int r0 = 255 - r3
            int r1 = 255 - r2
            int r0 = r0 * r1
            int r0 = r0 / 255
            int r0 = 255 - r0
            return r0
    }

    public static int compositeColors(int r7, int r8) {
            int r0 = android.graphics.Color.alpha(r8)
            int r1 = android.graphics.Color.alpha(r7)
            int r2 = compositeAlpha(r1, r0)
            int r3 = android.graphics.Color.red(r7)
            int r4 = android.graphics.Color.red(r8)
            int r3 = compositeComponent(r3, r1, r4, r0, r2)
            int r4 = android.graphics.Color.green(r7)
            int r5 = android.graphics.Color.green(r8)
            int r4 = compositeComponent(r4, r1, r5, r0, r2)
            int r5 = android.graphics.Color.blue(r7)
            int r6 = android.graphics.Color.blue(r8)
            int r5 = compositeComponent(r5, r1, r6, r0, r2)
            int r6 = android.graphics.Color.argb(r2, r3, r4, r5)
            return r6
    }

    public static android.graphics.Color compositeColors(android.graphics.Color r1, android.graphics.Color r2) {
            android.graphics.Color r0 = androidx.core.graphics.ColorUtils.Api26Impl.compositeColors(r1, r2)
            return r0
    }

    private static int compositeComponent(int r3, int r4, int r5, int r6, int r7) {
            if (r7 != 0) goto L4
            r0 = 0
            return r0
        L4:
            int r0 = r3 * 255
            int r0 = r0 * r4
            int r1 = r5 * r6
            int r2 = 255 - r4
            int r1 = r1 * r2
            int r0 = r0 + r1
            int r1 = r7 * 255
            int r0 = r0 / r1
            return r0
    }

    private static float constrain(float r1, float r2, float r3) {
            int r0 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r0 >= 0) goto L6
            r0 = r2
            goto La
        L6:
            float r0 = java.lang.Math.min(r1, r3)
        La:
            return r0
    }

    private static int constrain(int r1, int r2, int r3) {
            if (r1 >= r2) goto L4
            r0 = r2
            goto L8
        L4:
            int r0 = java.lang.Math.min(r1, r3)
        L8:
            return r0
    }

    public static double distanceEuclidean(double[] r9, double[] r10) {
            r0 = 0
            r1 = r9[r0]
            r3 = r10[r0]
            double r1 = r1 - r3
            r3 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r0 = java.lang.Math.pow(r1, r3)
            r2 = 1
            r5 = r9[r2]
            r7 = r10[r2]
            double r5 = r5 - r7
            double r5 = java.lang.Math.pow(r5, r3)
            double r0 = r0 + r5
            r2 = 2
            r5 = r9[r2]
            r7 = r10[r2]
            double r5 = r5 - r7
            double r2 = java.lang.Math.pow(r5, r3)
            double r0 = r0 + r2
            double r0 = java.lang.Math.sqrt(r0)
            return r0
    }

    private static double[] getTempDouble3Array() {
            java.lang.ThreadLocal<double[]> r0 = androidx.core.graphics.ColorUtils.TEMP_ARRAY
            java.lang.Object r0 = r0.get()
            double[] r0 = (double[]) r0
            if (r0 != 0) goto L12
            r1 = 3
            double[] r0 = new double[r1]
            java.lang.ThreadLocal<double[]> r1 = androidx.core.graphics.ColorUtils.TEMP_ARRAY
            r1.set(r0)
        L12:
            return r0
    }

    private static double pivotXyzComponent(double r4) {
            r0 = 4576258758203452558(0x3f82231832fcac8e, double:0.008856)
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 <= 0) goto L13
            r0 = 4599676419421066581(0x3fd5555555555555, double:0.3333333333333333)
            double r0 = java.lang.Math.pow(r4, r0)
            goto L1f
        L13:
            r0 = 4651156726645941862(0x408c3a6666666666, double:903.3)
            double r0 = r0 * r4
            r2 = 4625196817309499392(0x4030000000000000, double:16.0)
            double r0 = r0 + r2
            r2 = 4637863191261478912(0x405d000000000000, double:116.0)
            double r0 = r0 / r2
        L1f:
            return r0
    }

    public static int setAlphaComponent(int r2, int r3) {
            if (r3 < 0) goto Le
            r0 = 255(0xff, float:3.57E-43)
            if (r3 > r0) goto Le
            r0 = 16777215(0xffffff, float:2.3509886E-38)
            r0 = r0 & r2
            int r1 = r3 << 24
            r0 = r0 | r1
            return r0
        Le:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "alpha must be between 0 and 255."
            r0.<init>(r1)
            throw r0
    }
}
