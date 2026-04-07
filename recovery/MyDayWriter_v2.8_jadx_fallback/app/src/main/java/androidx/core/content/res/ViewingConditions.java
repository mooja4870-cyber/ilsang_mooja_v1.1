package androidx.core.content.res;

/* JADX INFO: loaded from: classes.dex */
final class ViewingConditions {
    static final androidx.core.content.res.ViewingConditions DEFAULT = null;
    private final float mAw;
    private final float mC;
    private final float mFl;
    private final float mFlRoot;
    private final float mN;
    private final float mNbb;
    private final float mNc;
    private final float mNcb;
    private final float[] mRgbD;
    private final float mZ;

    static {
            float[] r0 = androidx.core.content.res.CamUtils.WHITE_POINT_D65
            r1 = 1112014848(0x42480000, float:50.0)
            float r2 = androidx.core.content.res.CamUtils.yFromLStar(r1)
            double r2 = (double) r2
            r4 = 4634156444089534796(0x404fd4bbab8b494c, double:63.66197723675813)
            double r2 = r2 * r4
            r4 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r2 = r2 / r4
            float r2 = (float) r2
            r3 = 1073741824(0x40000000, float:2.0)
            r4 = 0
            androidx.core.content.res.ViewingConditions r0 = make(r0, r2, r1, r3, r4)
            androidx.core.content.res.ViewingConditions.DEFAULT = r0
            return
    }

    private ViewingConditions(float r1, float r2, float r3, float r4, float r5, float r6, float[] r7, float r8, float r9, float r10) {
            r0 = this;
            r0.<init>()
            r0.mN = r1
            r0.mAw = r2
            r0.mNbb = r3
            r0.mNcb = r4
            r0.mC = r5
            r0.mNc = r6
            r0.mRgbD = r7
            r0.mFl = r8
            r0.mFlRoot = r9
            r0.mZ = r10
            return
    }

    static androidx.core.content.res.ViewingConditions make(float[] r30, float r31, float r32, float r33, boolean r34) {
            r0 = r31
            float[][] r1 = androidx.core.content.res.CamUtils.XYZ_TO_CAM16RGB
            r2 = r30
            r3 = 0
            r4 = r2[r3]
            r5 = r1[r3]
            r5 = r5[r3]
            float r4 = r4 * r5
            r5 = 1
            r6 = r2[r5]
            r7 = r1[r3]
            r7 = r7[r5]
            float r6 = r6 * r7
            float r4 = r4 + r6
            r6 = 2
            r7 = r2[r6]
            r8 = r1[r3]
            r8 = r8[r6]
            float r7 = r7 * r8
            float r4 = r4 + r7
            r7 = r2[r3]
            r8 = r1[r5]
            r8 = r8[r3]
            float r7 = r7 * r8
            r8 = r2[r5]
            r9 = r1[r5]
            r9 = r9[r5]
            float r8 = r8 * r9
            float r7 = r7 + r8
            r8 = r2[r6]
            r9 = r1[r5]
            r9 = r9[r6]
            float r8 = r8 * r9
            float r7 = r7 + r8
            r8 = r2[r3]
            r9 = r1[r6]
            r9 = r9[r3]
            float r8 = r8 * r9
            r9 = r2[r5]
            r10 = r1[r6]
            r10 = r10[r5]
            float r9 = r9 * r10
            float r8 = r8 + r9
            r9 = r2[r6]
            r10 = r1[r6]
            r10 = r10[r6]
            float r9 = r9 * r10
            float r8 = r8 + r9
            r9 = 1092616192(0x41200000, float:10.0)
            float r10 = r33 / r9
            r11 = 1061997773(0x3f4ccccd, float:0.8)
            float r10 = r10 + r11
            double r12 = (double) r10
            r14 = 4606281698874543309(0x3feccccccccccccd, double:0.9)
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            r13 = 1058474557(0x3f170a3d, float:0.59)
            if (r12 < 0) goto L71
            r11 = 1063675494(0x3f666666, float:0.9)
            float r11 = r10 - r11
            float r11 = r11 * r9
            r9 = 1060152279(0x3f30a3d7, float:0.69)
            float r9 = androidx.core.content.res.CamUtils.lerp(r13, r9, r11)
            goto L7b
        L71:
            float r11 = r10 - r11
            float r11 = r11 * r9
            r9 = 1057384038(0x3f066666, float:0.525)
            float r9 = androidx.core.content.res.CamUtils.lerp(r9, r13, r11)
        L7b:
            r16 = r9
            r9 = 1065353216(0x3f800000, float:1.0)
            if (r34 == 0) goto L83
            r11 = r9
            goto L97
        L83:
            float r11 = -r0
            r12 = 1109917696(0x42280000, float:42.0)
            float r11 = r11 - r12
            r12 = 1119354880(0x42b80000, float:92.0)
            float r11 = r11 / r12
            double r11 = (double) r11
            double r11 = java.lang.Math.exp(r11)
            float r11 = (float) r11
            r12 = 1049508068(0x3e8e38e4, float:0.2777778)
            float r11 = r11 * r12
            float r11 = r9 - r11
            float r11 = r11 * r10
        L97:
            double r12 = (double) r11
            r14 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 <= 0) goto La0
            r12 = r9
            goto Laa
        La0:
            double r12 = (double) r11
            r14 = 0
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 >= 0) goto La9
            r12 = 0
            goto Laa
        La9:
            r12 = r11
        Laa:
            r22 = r12
            r17 = r10
            r11 = 1120403456(0x42c80000, float:100.0)
            float r12 = r11 / r4
            float r12 = r12 * r22
            float r12 = r12 + r9
            float r12 = r12 - r22
            float r13 = r11 / r7
            float r13 = r13 * r22
            float r13 = r13 + r9
            float r13 = r13 - r22
            float r11 = r11 / r8
            float r11 = r11 * r22
            float r11 = r11 + r9
            float r11 = r11 - r22
            r14 = 3
            float[] r15 = new float[r14]
            r15[r3] = r12
            r15[r5] = r13
            r15[r6] = r11
            r18 = r15
            r11 = 1084227584(0x40a00000, float:5.0)
            float r11 = r11 * r0
            float r11 = r11 + r9
            float r23 = r9 / r11
            float r11 = r23 * r23
            float r11 = r11 * r23
            float r24 = r11 * r23
            float r9 = r9 - r24
            float r11 = r24 * r0
            r12 = 1036831949(0x3dcccccd, float:0.1)
            float r12 = r12 * r9
            float r12 = r12 * r9
            r19 = 4617315517961601024(0x4014000000000000, double:5.0)
            r13 = r3
            r25 = r4
            double r3 = (double) r0
            double r3 = r3 * r19
            double r3 = java.lang.Math.cbrt(r3)
            float r3 = (float) r3
            float r12 = r12 * r3
            float r11 = r11 + r12
            float r3 = androidx.core.content.res.CamUtils.yFromLStar(r32)
            r4 = r30[r5]
            float r12 = r3 / r4
            double r3 = (double) r12
            double r3 = java.lang.Math.sqrt(r3)
            float r3 = (float) r3
            r4 = 1069379748(0x3fbd70a4, float:1.48)
            float r21 = r3 + r4
            double r3 = (double) r12
            r15 = r5
            r19 = r6
            r5 = 4596373779694328218(0x3fc999999999999a, double:0.2)
            double r3 = java.lang.Math.pow(r3, r5)
            float r3 = (float) r3
            r4 = 1060739482(0x3f39999a, float:0.725)
            float r4 = r4 / r3
            r3 = r15
            r15 = r4
            r5 = r18[r13]
            float r5 = r5 * r11
            float r5 = r5 * r25
            double r5 = (double) r5
            r26 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r5 = r5 / r26
            r28 = r3
            r20 = r4
            r3 = 4601237667291888353(0x3fdae147ae147ae1, double:0.42)
            double r5 = java.lang.Math.pow(r5, r3)
            float r5 = (float) r5
            r6 = r18[r28]
            float r6 = r6 * r11
            float r6 = r6 * r7
            r29 = r13
            double r13 = (double) r6
            double r13 = r13 / r26
            double r13 = java.lang.Math.pow(r13, r3)
            float r6 = (float) r13
            r13 = r18[r19]
            float r13 = r13 * r11
            float r13 = r13 * r8
            double r13 = (double) r13
            double r13 = r13 / r26
            double r3 = java.lang.Math.pow(r13, r3)
            float r3 = (float) r3
            r4 = 3
            float[] r13 = new float[r4]
            r13[r29] = r5
            r13[r28] = r6
            r13[r19] = r3
            r3 = r13
            r4 = r3[r29]
            r5 = 1137180672(0x43c80000, float:400.0)
            float r4 = r4 * r5
            r6 = r3[r29]
            r13 = 1104742973(0x41d90a3d, float:27.13)
            float r6 = r6 + r13
            float r4 = r4 / r6
            r6 = r3[r28]
            float r6 = r6 * r5
            r14 = r3[r28]
            float r14 = r14 + r13
            float r6 = r6 / r14
            r14 = r3[r19]
            float r14 = r14 * r5
            r5 = r3[r19]
            float r5 = r5 + r13
            float r14 = r14 / r5
            r5 = 3
            float[] r5 = new float[r5]
            r5[r29] = r4
            r5[r28] = r6
            r5[r19] = r14
            r4 = 1073741824(0x40000000, float:2.0)
            r6 = r5[r29]
            float r6 = r6 * r4
            r4 = r5[r28]
            float r6 = r6 + r4
            r4 = 1028443341(0x3d4ccccd, float:0.05)
            r13 = r5[r19]
            float r13 = r13 * r4
            float r6 = r6 + r13
            float r13 = r6 * r20
            androidx.core.content.res.ViewingConditions r4 = new androidx.core.content.res.ViewingConditions
            r6 = r1
            double r0 = (double) r11
            r26 = r2
            r27 = r3
            r2 = 4598175219545276416(0x3fd0000000000000, double:0.25)
            double r0 = java.lang.Math.pow(r0, r2)
            float r0 = (float) r0
            r19 = r11
            r14 = r20
            r20 = r0
            r11 = r4
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return r11
    }

    float getAw() {
            r1 = this;
            float r0 = r1.mAw
            return r0
    }

    float getC() {
            r1 = this;
            float r0 = r1.mC
            return r0
    }

    float getFl() {
            r1 = this;
            float r0 = r1.mFl
            return r0
    }

    float getFlRoot() {
            r1 = this;
            float r0 = r1.mFlRoot
            return r0
    }

    float getN() {
            r1 = this;
            float r0 = r1.mN
            return r0
    }

    float getNbb() {
            r1 = this;
            float r0 = r1.mNbb
            return r0
    }

    float getNc() {
            r1 = this;
            float r0 = r1.mNc
            return r0
    }

    float getNcb() {
            r1 = this;
            float r0 = r1.mNcb
            return r0
    }

    float[] getRgbD() {
            r1 = this;
            float[] r0 = r1.mRgbD
            return r0
    }

    float getZ() {
            r1 = this;
            float r0 = r1.mZ
            return r0
    }
}
