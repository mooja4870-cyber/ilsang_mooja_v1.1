package androidx.core.content.res;

/* JADX INFO: loaded from: classes.dex */
public class CamColor {
    private static final float CHROMA_SEARCH_ENDPOINT = 0.4f;
    private static final float DE_MAX = 1.0f;
    private static final float DL_MAX = 0.2f;
    private static final float LIGHTNESS_SEARCH_ENDPOINT = 0.01f;
    private final float mAstar;
    private final float mBstar;
    private final float mChroma;
    private final float mHue;
    private final float mJ;
    private final float mJstar;
    private final float mM;
    private final float mQ;
    private final float mS;

    CamColor(float r1, float r2, float r3, float r4, float r5, float r6, float r7, float r8, float r9) {
            r0 = this;
            r0.<init>()
            r0.mHue = r1
            r0.mChroma = r2
            r0.mJ = r3
            r0.mQ = r4
            r0.mM = r5
            r0.mS = r6
            r0.mJstar = r7
            r0.mAstar = r8
            r0.mBstar = r9
            return
    }

    private static androidx.core.content.res.CamColor findCamByJ(float r13, float r14, float r15) {
            r0 = 0
            r1 = 1120403456(0x42c80000, float:100.0)
            r2 = 0
            r3 = 1148846080(0x447a0000, float:1000.0)
            r4 = 1148846080(0x447a0000, float:1000.0)
            r5 = 0
        L9:
            float r6 = r0 - r1
            float r6 = java.lang.Math.abs(r6)
            r7 = 1008981770(0x3c23d70a, float:0.01)
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 <= 0) goto L66
            float r6 = r1 - r0
            r7 = 1073741824(0x40000000, float:2.0)
            float r6 = r6 / r7
            float r2 = r0 + r6
            androidx.core.content.res.CamColor r6 = fromJch(r2, r14, r13)
            int r7 = r6.viewedInSrgb()
            float r8 = androidx.core.content.res.CamUtils.lStarFromInt(r7)
            float r9 = r15 - r8
            float r9 = java.lang.Math.abs(r9)
            r10 = 1045220557(0x3e4ccccd, float:0.2)
            int r10 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r10 >= 0) goto L54
            androidx.core.content.res.CamColor r10 = fromColor(r7)
            float r11 = r10.getJ()
            float r12 = r10.getChroma()
            androidx.core.content.res.CamColor r11 = fromJch(r11, r12, r13)
            float r11 = r10.distance(r11)
            r12 = 1065353216(0x3f800000, float:1.0)
            int r12 = (r11 > r12 ? 1 : (r11 == r12 ? 0 : -1))
            if (r12 > 0) goto L54
            r3 = r9
            r4 = r11
            r5 = r10
        L54:
            r10 = 0
            int r11 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r11 != 0) goto L5e
            int r10 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r10 != 0) goto L5e
            goto L66
        L5e:
            int r10 = (r8 > r15 ? 1 : (r8 == r15 ? 0 : -1))
            if (r10 >= 0) goto L64
            r0 = r2
            goto L65
        L64:
            r1 = r2
        L65:
            goto L9
        L66:
            return r5
    }

    static androidx.core.content.res.CamColor fromColor(int r14) {
            r0 = 7
            float[] r0 = new float[r0]
            r1 = 3
            float[] r2 = new float[r1]
            androidx.core.content.res.ViewingConditions r3 = androidx.core.content.res.ViewingConditions.DEFAULT
            fromColorInViewingConditions(r14, r3, r0, r2)
            androidx.core.content.res.CamColor r4 = new androidx.core.content.res.CamColor
            r3 = 0
            r5 = r2[r3]
            r6 = 1
            r7 = r6
            r6 = r2[r7]
            r3 = r0[r3]
            r8 = r0[r7]
            r7 = 2
            r9 = r0[r7]
            r10 = r0[r1]
            r1 = 4
            r11 = r0[r1]
            r1 = 5
            r12 = r0[r1]
            r1 = 6
            r13 = r0[r1]
            r7 = r3
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return r4
    }

    static void fromColorInViewingConditions(int r41, androidx.core.content.res.ViewingConditions r42, float[] r43, float[] r44) {
            r0 = r44
            r1 = r41
            androidx.core.content.res.CamUtils.xyzFromInt(r1, r0)
            r2 = r44
            float[][] r3 = androidx.core.content.res.CamUtils.XYZ_TO_CAM16RGB
            r4 = 0
            r5 = r2[r4]
            r6 = r3[r4]
            r6 = r6[r4]
            float r5 = r5 * r6
            r6 = 1
            r7 = r2[r6]
            r8 = r3[r4]
            r8 = r8[r6]
            float r7 = r7 * r8
            float r5 = r5 + r7
            r7 = 2
            r8 = r2[r7]
            r9 = r3[r4]
            r9 = r9[r7]
            float r8 = r8 * r9
            float r5 = r5 + r8
            r8 = r2[r4]
            r9 = r3[r6]
            r9 = r9[r4]
            float r8 = r8 * r9
            r9 = r2[r6]
            r10 = r3[r6]
            r10 = r10[r6]
            float r9 = r9 * r10
            float r8 = r8 + r9
            r9 = r2[r7]
            r10 = r3[r6]
            r10 = r10[r7]
            float r9 = r9 * r10
            float r8 = r8 + r9
            r9 = r2[r4]
            r10 = r3[r7]
            r10 = r10[r4]
            float r9 = r9 * r10
            r10 = r2[r6]
            r11 = r3[r7]
            r11 = r11[r6]
            float r10 = r10 * r11
            float r9 = r9 + r10
            r10 = r2[r7]
            r11 = r3[r7]
            r11 = r11[r7]
            float r10 = r10 * r11
            float r9 = r9 + r10
            float[] r10 = r42.getRgbD()
            r10 = r10[r4]
            float r10 = r10 * r5
            float[] r11 = r42.getRgbD()
            r11 = r11[r6]
            float r11 = r11 * r8
            float[] r12 = r42.getRgbD()
            r12 = r12[r7]
            float r12 = r12 * r9
            float r13 = r42.getFl()
            float r14 = java.lang.Math.abs(r10)
            float r13 = r13 * r14
            double r13 = (double) r13
            r15 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r13 = r13 / r15
            r17 = r4
            r18 = r5
            r4 = 4601237667291888353(0x3fdae147ae147ae1, double:0.42)
            double r13 = java.lang.Math.pow(r13, r4)
            float r13 = (float) r13
            float r14 = r42.getFl()
            float r19 = java.lang.Math.abs(r11)
            float r14 = r14 * r19
            r19 = r6
            r20 = r7
            double r6 = (double) r14
            double r6 = r6 / r15
            double r6 = java.lang.Math.pow(r6, r4)
            float r6 = (float) r6
            float r7 = r42.getFl()
            float r14 = java.lang.Math.abs(r12)
            float r7 = r7 * r14
            double r0 = (double) r7
            double r0 = r0 / r15
            double r0 = java.lang.Math.pow(r0, r4)
            float r0 = (float) r0
            float r1 = java.lang.Math.signum(r10)
            r4 = 1137180672(0x43c80000, float:400.0)
            float r1 = r1 * r4
            float r1 = r1 * r13
            r5 = 1104742973(0x41d90a3d, float:27.13)
            float r7 = r13 + r5
            float r1 = r1 / r7
            float r7 = java.lang.Math.signum(r11)
            float r7 = r7 * r4
            float r7 = r7 * r6
            float r14 = r6 + r5
            float r7 = r7 / r14
            float r14 = java.lang.Math.signum(r12)
            float r14 = r14 * r4
            float r14 = r14 * r0
            float r5 = r5 + r0
            float r14 = r14 / r5
            r21 = 4622382067542392832(0x4026000000000000, double:11.0)
            double r4 = (double) r1
            double r4 = r4 * r21
            r21 = -4600427019358961664(0xc028000000000000, double:-12.0)
            r23 = r0
            r24 = r1
            double r0 = (double) r7
            double r0 = r0 * r21
            double r4 = r4 + r0
            double r0 = (double) r14
            double r4 = r4 + r0
            float r0 = (float) r4
            r1 = 1093664768(0x41300000, float:11.0)
            float r0 = r0 / r1
            float r1 = r24 + r7
            double r4 = (double) r1
            r21 = r2
            double r1 = (double) r14
            r25 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r1 = r1 * r25
            double r4 = r4 - r1
            float r1 = (float) r4
            r2 = 1091567616(0x41100000, float:9.0)
            float r1 = r1 / r2
            r2 = 1101004800(0x41a00000, float:20.0)
            float r4 = r24 * r2
            float r5 = r7 * r2
            float r4 = r4 + r5
            r5 = 1101529088(0x41a80000, float:21.0)
            float r5 = r5 * r14
            float r4 = r4 + r5
            float r4 = r4 / r2
            r5 = 1109393408(0x42200000, float:40.0)
            float r5 = r5 * r24
            float r22 = r7 * r2
            float r5 = r5 + r22
            float r5 = r5 + r14
            float r5 = r5 / r2
            r22 = r3
            double r2 = (double) r1
            r27 = r4
            r28 = r5
            double r4 = (double) r0
            double r2 = java.lang.Math.atan2(r2, r4)
            float r2 = (float) r2
            r3 = 1127481344(0x43340000, float:180.0)
            float r4 = r2 * r3
            r5 = 1078530011(0x40490fdb, float:3.1415927)
            float r4 = r4 / r5
            r29 = 0
            int r29 = (r4 > r29 ? 1 : (r4 == r29 ? 0 : -1))
            r30 = 1135869952(0x43b40000, float:360.0)
            if (r29 >= 0) goto L121
            float r29 = r4 + r30
            goto L12a
        L121:
            int r29 = (r4 > r30 ? 1 : (r4 == r30 ? 0 : -1))
            if (r29 < 0) goto L128
            float r29 = r4 - r30
            goto L12a
        L128:
            r29 = r4
        L12a:
            r31 = r29
            float r5 = r5 * r31
            float r5 = r5 / r3
            float r3 = r42.getNbb()
            float r3 = r3 * r28
            float r29 = r42.getAw()
            r32 = r15
            float r15 = r3 / r29
            r16 = r0
            r29 = r1
            double r0 = (double) r15
            float r15 = r42.getC()
            float r34 = r42.getZ()
            float r15 = r15 * r34
            r34 = r2
            r35 = r3
            double r2 = (double) r15
            double r0 = java.lang.Math.pow(r0, r2)
            float r0 = (float) r0
            r1 = 1120403456(0x42c80000, float:100.0)
            float r0 = r0 * r1
            float r2 = r42.getC()
            r3 = 1082130432(0x40800000, float:4.0)
            float r2 = r3 / r2
            float r1 = r0 / r1
            r36 = r3
            r15 = r4
            double r3 = (double) r1
            double r3 = java.lang.Math.sqrt(r3)
            float r1 = (float) r3
            float r2 = r2 * r1
            float r1 = r42.getAw()
            float r1 = r1 + r36
            float r2 = r2 * r1
            float r1 = r42.getFlRoot()
            float r2 = r2 * r1
            r1 = r31
            double r3 = (double) r1
            r37 = 4626362123713081508(0x403423d70a3d70a4, double:20.14)
            int r3 = (r3 > r37 ? 1 : (r3 == r37 ? 0 : -1))
            if (r3 >= 0) goto L189
            float r31 = r1 + r30
            goto L18b
        L189:
            r31 = r1
        L18b:
            r3 = r31
            r30 = r1
            r4 = r2
            double r1 = (double) r3
            r37 = 4614256656552045848(0x400921fb54442d18, double:3.141592653589793)
            double r1 = r1 * r37
            r37 = 4640537203540230144(0x4066800000000000, double:180.0)
            double r1 = r1 / r37
            double r1 = r1 + r25
            double r1 = java.lang.Math.cos(r1)
            r25 = 4615739258092021350(0x400e666666666666, double:3.8)
            double r1 = r1 + r25
            float r1 = (float) r1
            r2 = 1048576000(0x3e800000, float:0.25)
            float r1 = r1 * r2
            r2 = 1164993142(0x45706276, float:3846.1538)
            float r2 = r2 * r1
            float r25 = r42.getNc()
            float r2 = r2 * r25
            float r25 = r42.getNcb()
            float r2 = r2 * r25
            float r25 = r16 * r16
            float r26 = r29 * r29
            r31 = r1
            float r1 = r25 + r26
            r25 = r2
            double r1 = (double) r1
            double r1 = java.lang.Math.sqrt(r1)
            float r1 = (float) r1
            float r2 = r25 * r1
            r1 = 1050421494(0x3e9c28f6, float:0.305)
            float r1 = r27 + r1
            float r2 = r2 / r1
            float r1 = r42.getN()
            r26 = r3
            r37 = r4
            double r3 = (double) r1
            r1 = r6
            r38 = r7
            r6 = 4598895795485655695(0x3fd28f5c28f5c28f, double:0.29)
            double r3 = java.lang.Math.pow(r6, r3)
            r6 = 4610064722561534525(0x3ffa3d70a3d70a3d, double:1.64)
            double r6 = r6 - r3
            r3 = 4604750475001237340(0x3fe75c28f5c28f5c, double:0.73)
            double r3 = java.lang.Math.pow(r6, r3)
            float r3 = (float) r3
            double r6 = (double) r2
            r39 = r1
            r4 = r2
            r1 = 4606281698874543309(0x3feccccccccccccd, double:0.9)
            double r1 = java.lang.Math.pow(r6, r1)
            float r1 = (float) r1
            float r3 = r3 * r1
            double r1 = (double) r0
            double r1 = r1 / r32
            double r1 = java.lang.Math.sqrt(r1)
            float r1 = (float) r1
            float r1 = r1 * r3
            float r2 = r42.getFlRoot()
            float r2 = r2 * r1
            float r6 = r42.getC()
            float r6 = r6 * r3
            float r7 = r42.getAw()
            float r7 = r7 + r36
            float r6 = r6 / r7
            double r6 = (double) r6
            double r6 = java.lang.Math.sqrt(r6)
            float r6 = (float) r6
            r7 = 1112014848(0x42480000, float:50.0)
            float r6 = r6 * r7
            r7 = 1071225242(0x3fd9999a, float:1.7)
            float r7 = r7 * r0
            r32 = 1004888130(0x3be56042, float:0.007)
            float r32 = r32 * r0
            r33 = 1065353216(0x3f800000, float:1.0)
            float r32 = r32 + r33
            float r7 = r7 / r32
            r32 = 1018873617(0x3cbac711, float:0.0228)
            float r32 = r32 * r2
            r36 = r0
            float r0 = r32 + r33
            r32 = r1
            double r0 = (double) r0
            double r0 = java.lang.Math.log(r0)
            float r0 = (float) r0
            r1 = 1110405192(0x422f7048, float:43.85965)
            float r0 = r0 * r1
            r33 = r0
            double r0 = (double) r5
            double r0 = java.lang.Math.cos(r0)
            float r0 = (float) r0
            float r0 = r0 * r33
            r40 = r0
            double r0 = (double) r5
            double r0 = java.lang.Math.sin(r0)
            float r0 = (float) r0
            float r0 = r0 * r33
            r44[r17] = r30
            r44[r19] = r32
            if (r43 == 0) goto L27f
            r43[r17] = r36
            r43[r19] = r37
            r43[r20] = r2
            r1 = 3
            r43[r1] = r6
            r1 = 4
            r43[r1] = r7
            r1 = 5
            r43[r1] = r40
            r1 = 6
            r43[r1] = r0
        L27f:
            return
    }

    private static androidx.core.content.res.CamColor fromJch(float r1, float r2, float r3) {
            androidx.core.content.res.ViewingConditions r0 = androidx.core.content.res.ViewingConditions.DEFAULT
            androidx.core.content.res.CamColor r0 = fromJchInFrame(r1, r2, r3, r0)
            return r0
    }

    private static androidx.core.content.res.CamColor fromJchInFrame(float r13, float r14, float r15, androidx.core.content.res.ViewingConditions r16) {
            float r0 = r16.getC()
            r1 = 1082130432(0x40800000, float:4.0)
            float r0 = r1 / r0
            double r4 = (double) r13
            r6 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r4 = r4 / r6
            double r4 = java.lang.Math.sqrt(r4)
            float r2 = (float) r4
            float r0 = r0 * r2
            float r2 = r16.getAw()
            float r2 = r2 + r1
            float r0 = r0 * r2
            float r2 = r16.getFlRoot()
            float r4 = r0 * r2
            float r0 = r16.getFlRoot()
            float r5 = r14 * r0
            double r8 = (double) r13
            double r8 = r8 / r6
            double r6 = java.lang.Math.sqrt(r8)
            float r0 = (float) r6
            float r10 = r14 / r0
            float r0 = r16.getC()
            float r0 = r0 * r10
            float r2 = r16.getAw()
            float r2 = r2 + r1
            float r0 = r0 / r2
            double r0 = (double) r0
            double r0 = java.lang.Math.sqrt(r0)
            float r0 = (float) r0
            r1 = 1112014848(0x42480000, float:50.0)
            float r6 = r0 * r1
            r0 = 1078530011(0x40490fdb, float:3.1415927)
            float r0 = r0 * r15
            r1 = 1127481344(0x43340000, float:180.0)
            float r11 = r0 / r1
            r0 = 1071225242(0x3fd9999a, float:1.7)
            float r0 = r0 * r13
            r1 = 1004888130(0x3be56042, float:0.007)
            float r1 = r1 * r13
            r2 = 1065353216(0x3f800000, float:1.0)
            float r1 = r1 + r2
            float r7 = r0 / r1
            r0 = 4582228873984682964(0x3f9758e219652bd4, double:0.0228)
            double r8 = (double) r5
            double r8 = r8 * r0
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r8 = r8 + r0
            double r0 = java.lang.Math.log(r8)
            float r0 = (float) r0
            r1 = 1110405192(0x422f7048, float:43.85965)
            float r12 = r0 * r1
            double r0 = (double) r11
            double r0 = java.lang.Math.cos(r0)
            float r0 = (float) r0
            float r8 = r12 * r0
            double r0 = (double) r11
            double r0 = java.lang.Math.sin(r0)
            float r0 = (float) r0
            float r9 = r12 * r0
            androidx.core.content.res.CamColor r0 = new androidx.core.content.res.CamColor
            r3 = r13
            r2 = r14
            r1 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return r0
    }

    public static void getM3HCTfromColor(int r2, float[] r3) {
            androidx.core.content.res.ViewingConditions r0 = androidx.core.content.res.ViewingConditions.DEFAULT
            r1 = 0
            fromColorInViewingConditions(r2, r0, r1, r3)
            r0 = 2
            float r1 = androidx.core.content.res.CamUtils.lStarFromInt(r2)
            r3[r0] = r1
            return
    }

    public static int toColor(float r1, float r2, float r3) {
            androidx.core.content.res.ViewingConditions r0 = androidx.core.content.res.ViewingConditions.DEFAULT
            int r0 = toColor(r1, r2, r3, r0)
            return r0
    }

    static int toColor(float r8, float r9, float r10, androidx.core.content.res.ViewingConditions r11) {
            double r0 = (double) r9
            r2 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L6a
            int r0 = java.lang.Math.round(r10)
            double r0 = (double) r0
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L6a
            int r0 = java.lang.Math.round(r10)
            double r0 = (double) r0
            r2 = 4636737291354636288(0x4059000000000000, double:100.0)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L1e
            goto L6a
        L1e:
            r0 = 0
            int r1 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r1 >= 0) goto L24
            goto L2a
        L24:
            r0 = 1135869952(0x43b40000, float:360.0)
            float r0 = java.lang.Math.min(r0, r8)
        L2a:
            r8 = r9
            r1 = r9
            r2 = 0
            r3 = 1
            r4 = 0
        L2f:
            float r5 = r2 - r8
            float r5 = java.lang.Math.abs(r5)
            r6 = 1053609165(0x3ecccccd, float:0.4)
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 < 0) goto L5e
            androidx.core.content.res.CamColor r5 = findCamByJ(r0, r1, r10)
            r6 = 1073741824(0x40000000, float:2.0)
            if (r3 == 0) goto L52
            if (r5 == 0) goto L4b
            int r6 = r5.viewed(r11)
            return r6
        L4b:
            r3 = 0
            float r7 = r8 - r2
            float r7 = r7 / r6
            float r1 = r2 + r7
            goto L2f
        L52:
            if (r5 != 0) goto L56
            r8 = r1
            goto L58
        L56:
            r4 = r5
            r2 = r1
        L58:
            float r7 = r8 - r2
            float r7 = r7 / r6
            float r1 = r2 + r7
            goto L2f
        L5e:
            if (r4 != 0) goto L65
            int r5 = androidx.core.content.res.CamUtils.intFromLStar(r10)
            return r5
        L65:
            int r5 = r4.viewed(r11)
            return r5
        L6a:
            int r0 = androidx.core.content.res.CamUtils.intFromLStar(r10)
            return r0
    }

    float distance(androidx.core.content.res.CamColor r10) {
            r9 = this;
            float r0 = r9.getJStar()
            float r1 = r10.getJStar()
            float r0 = r0 - r1
            float r1 = r9.getAStar()
            float r2 = r10.getAStar()
            float r1 = r1 - r2
            float r2 = r9.getBStar()
            float r3 = r10.getBStar()
            float r2 = r2 - r3
            float r3 = r0 * r0
            float r4 = r1 * r1
            float r3 = r3 + r4
            float r4 = r2 * r2
            float r3 = r3 + r4
            double r3 = (double) r3
            double r3 = java.lang.Math.sqrt(r3)
            r5 = 4603849755075763241(0x3fe428f5c28f5c29, double:0.63)
            double r5 = java.lang.Math.pow(r3, r5)
            r7 = 4609028894647239311(0x3ff68f5c28f5c28f, double:1.41)
            double r5 = r5 * r7
            float r7 = (float) r5
            return r7
    }

    float getAStar() {
            r1 = this;
            float r0 = r1.mAstar
            return r0
    }

    float getBStar() {
            r1 = this;
            float r0 = r1.mBstar
            return r0
    }

    float getChroma() {
            r1 = this;
            float r0 = r1.mChroma
            return r0
    }

    float getHue() {
            r1 = this;
            float r0 = r1.mHue
            return r0
    }

    float getJ() {
            r1 = this;
            float r0 = r1.mJ
            return r0
    }

    float getJStar() {
            r1 = this;
            float r0 = r1.mJstar
            return r0
    }

    float getM() {
            r1 = this;
            float r0 = r1.mM
            return r0
    }

    float getQ() {
            r1 = this;
            float r0 = r1.mQ
            return r0
    }

    float getS() {
            r1 = this;
            float r0 = r1.mS
            return r0
    }

    int viewed(androidx.core.content.res.ViewingConditions r39) {
            r38 = this;
            float r0 = r38.getChroma()
            double r0 = (double) r0
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r4 = 4636737291354636288(0x4059000000000000, double:100.0)
            if (r0 == 0) goto L28
            float r0 = r38.getJ()
            double r0 = (double) r0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L17
            goto L28
        L17:
            float r0 = r38.getChroma()
            float r1 = r38.getJ()
            double r6 = (double) r1
            double r6 = r6 / r4
            double r6 = java.lang.Math.sqrt(r6)
            float r1 = (float) r6
            float r0 = r0 / r1
            goto L29
        L28:
            r0 = 0
        L29:
            double r6 = (double) r0
            float r1 = r39.getN()
            double r8 = (double) r1
            r10 = 4598895795485655695(0x3fd28f5c28f5c28f, double:0.29)
            double r8 = java.lang.Math.pow(r10, r8)
            r10 = 4610064722561534525(0x3ffa3d70a3d70a3d, double:1.64)
            double r10 = r10 - r8
            r8 = 4604750475001237340(0x3fe75c28f5c28f5c, double:0.73)
            double r8 = java.lang.Math.pow(r10, r8)
            double r6 = r6 / r8
            r8 = 4607682818758614130(0x3ff1c71c71c71c72, double:1.1111111111111112)
            double r6 = java.lang.Math.pow(r6, r8)
            float r1 = (float) r6
            float r6 = r38.getHue()
            r7 = 1078530011(0x40490fdb, float:3.1415927)
            float r6 = r6 * r7
            r7 = 1127481344(0x43340000, float:180.0)
            float r6 = r6 / r7
            double r7 = (double) r6
            r9 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r7 = r7 + r9
            double r7 = java.lang.Math.cos(r7)
            r9 = 4615739258092021350(0x400e666666666666, double:3.8)
            double r7 = r7 + r9
            float r7 = (float) r7
            r8 = 1048576000(0x3e800000, float:0.25)
            float r7 = r7 * r8
            float r8 = r39.getAw()
            float r9 = r38.getJ()
            double r9 = (double) r9
            double r9 = r9 / r4
            float r4 = r39.getC()
            double r4 = (double) r4
            r11 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r11 = r11 / r4
            float r4 = r39.getZ()
            double r4 = (double) r4
            double r11 = r11 / r4
            double r4 = java.lang.Math.pow(r9, r11)
            float r4 = (float) r4
            float r8 = r8 * r4
            r4 = 1164993142(0x45706276, float:3846.1538)
            float r4 = r4 * r7
            float r5 = r39.getNc()
            float r4 = r4 * r5
            float r5 = r39.getNcb()
            float r4 = r4 * r5
            float r5 = r39.getNbb()
            float r5 = r8 / r5
            double r9 = (double) r6
            double r9 = java.lang.Math.sin(r9)
            float r9 = (float) r9
            double r10 = (double) r6
            double r10 = java.lang.Math.cos(r10)
            float r10 = (float) r10
            r11 = 1050421494(0x3e9c28f6, float:0.305)
            float r11 = r11 + r5
            r12 = 1102577664(0x41b80000, float:23.0)
            float r11 = r11 * r12
            float r11 = r11 * r1
            float r12 = r12 * r4
            r13 = 1093664768(0x41300000, float:11.0)
            float r13 = r13 * r1
            float r13 = r13 * r10
            float r12 = r12 + r13
            r13 = 1121452032(0x42d80000, float:108.0)
            float r13 = r13 * r1
            float r13 = r13 * r9
            float r12 = r12 + r13
            float r11 = r11 / r12
            float r12 = r11 * r10
            float r13 = r11 * r9
            r14 = 1139146752(0x43e60000, float:460.0)
            float r15 = r5 * r14
            r16 = 1138851840(0x43e18000, float:451.0)
            float r16 = r16 * r12
            float r15 = r15 + r16
            r16 = 1133510656(0x43900000, float:288.0)
            float r16 = r16 * r13
            float r15 = r15 + r16
            r16 = 1152344064(0x44af6000, float:1403.0)
            float r15 = r15 / r16
            float r17 = r5 * r14
            r18 = 1147060224(0x445ec000, float:891.0)
            float r18 = r18 * r12
            float r17 = r17 - r18
            r18 = 1132625920(0x43828000, float:261.0)
            float r18 = r18 * r13
            float r17 = r17 - r18
            float r17 = r17 / r16
            float r14 = r14 * r5
            r18 = 1130102784(0x435c0000, float:220.0)
            float r18 = r18 * r12
            float r14 = r14 - r18
            r18 = 1170530304(0x45c4e000, float:6300.0)
            float r18 = r18 * r13
            float r14 = r14 - r18
            float r14 = r14 / r16
            float r2 = java.lang.Math.abs(r15)
            double r2 = (double) r2
            r20 = 4628329633800288993(0x403b2147ae147ae1, double:27.13)
            double r2 = r2 * r20
            r16 = r0
            float r0 = java.lang.Math.abs(r15)
            r22 = r1
            double r0 = (double) r0
            r23 = 4645744490609377280(0x4079000000000000, double:400.0)
            double r0 = r23 - r0
            double r2 = r2 / r0
            r0 = 0
            double r2 = java.lang.Math.max(r0, r2)
            float r0 = (float) r2
            float r1 = java.lang.Math.signum(r15)
            float r2 = r39.getFl()
            r3 = 1120403456(0x42c80000, float:100.0)
            float r2 = r3 / r2
            float r1 = r1 * r2
            r25 = r3
            r2 = r4
            double r3 = (double) r0
            r26 = r0
            r27 = r1
            r0 = 4612543846927839427(0x40030c30c30c30c3, double:2.380952380952381)
            double r3 = java.lang.Math.pow(r3, r0)
            float r3 = (float) r3
            float r3 = r3 * r27
            float r4 = java.lang.Math.abs(r17)
            double r0 = (double) r4
            double r0 = r0 * r20
            float r4 = java.lang.Math.abs(r17)
            r29 = r0
            double r0 = (double) r4
            double r0 = r23 - r0
            double r0 = r29 / r0
            r4 = r2
            r29 = r3
            r2 = 0
            double r0 = java.lang.Math.max(r2, r0)
            float r0 = (float) r0
            float r1 = java.lang.Math.signum(r17)
            float r2 = r39.getFl()
            float r3 = r25 / r2
            float r1 = r1 * r3
            double r2 = (double) r0
            r30 = r0
            r31 = r1
            r0 = 4612543846927839427(0x40030c30c30c30c3, double:2.380952380952381)
            double r2 = java.lang.Math.pow(r2, r0)
            float r0 = (float) r2
            float r1 = r31 * r0
            float r0 = java.lang.Math.abs(r14)
            double r2 = (double) r0
            double r2 = r2 * r20
            float r0 = java.lang.Math.abs(r14)
            r20 = r1
            double r0 = (double) r0
            double r23 = r23 - r0
            double r2 = r2 / r23
            r0 = 0
            double r0 = java.lang.Math.max(r0, r2)
            float r0 = (float) r0
            float r1 = java.lang.Math.signum(r14)
            float r2 = r39.getFl()
            float r3 = r25 / r2
            float r1 = r1 * r3
            double r2 = (double) r0
            r18 = r0
            r19 = r1
            r0 = 4612543846927839427(0x40030c30c30c30c3, double:2.380952380952381)
            double r0 = java.lang.Math.pow(r2, r0)
            float r0 = (float) r0
            float r1 = r19 * r0
            float[] r0 = r39.getRgbD()
            r2 = 0
            r0 = r0[r2]
            float r3 = r29 / r0
            float[] r0 = r39.getRgbD()
            r19 = 1
            r0 = r0[r19]
            float r0 = r20 / r0
            float[] r21 = r39.getRgbD()
            r23 = 2
            r21 = r21[r23]
            float r21 = r1 / r21
            float[][] r24 = androidx.core.content.res.CamUtils.CAM16RGB_TO_XYZ
            r25 = r24[r2]
            r25 = r25[r2]
            float r25 = r25 * r3
            r27 = r24[r2]
            r27 = r27[r19]
            float r27 = r27 * r0
            float r25 = r25 + r27
            r27 = r24[r2]
            r27 = r27[r23]
            float r27 = r27 * r21
            r28 = r2
            float r2 = r25 + r27
            r25 = r24[r19]
            r25 = r25[r28]
            float r25 = r25 * r3
            r27 = r24[r19]
            r27 = r27[r19]
            float r27 = r27 * r0
            float r25 = r25 + r27
            r27 = r24[r19]
            r27 = r27[r23]
            float r27 = r27 * r21
            r31 = r0
            float r0 = r25 + r27
            r25 = r24[r23]
            r25 = r25[r28]
            float r25 = r25 * r3
            r27 = r24[r23]
            r19 = r27[r19]
            float r19 = r19 * r31
            float r25 = r25 + r19
            r19 = r24[r23]
            r19 = r19[r23]
            float r19 = r19 * r21
            r23 = r1
            float r1 = r25 + r19
            r25 = r3
            r19 = r4
            double r3 = (double) r2
            r27 = r2
            r32 = r3
            double r2 = (double) r0
            r34 = r2
            double r2 = (double) r1
            r36 = r2
            int r2 = androidx.core.graphics.ColorUtils.XYZToColor(r32, r34, r36)
            return r2
    }

    int viewedInSrgb() {
            r1 = this;
            androidx.core.content.res.ViewingConditions r0 = androidx.core.content.res.ViewingConditions.DEFAULT
            int r0 = r1.viewed(r0)
            return r0
    }
}
