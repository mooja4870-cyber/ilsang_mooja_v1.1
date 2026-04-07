package androidx.vectordrawable.graphics.drawable;

/* JADX INFO: loaded from: classes.dex */
public class ArgbEvaluator implements android.animation.TypeEvaluator {
    private static final androidx.vectordrawable.graphics.drawable.ArgbEvaluator sInstance = null;

    static {
            androidx.vectordrawable.graphics.drawable.ArgbEvaluator r0 = new androidx.vectordrawable.graphics.drawable.ArgbEvaluator
            r0.<init>()
            androidx.vectordrawable.graphics.drawable.ArgbEvaluator.sInstance = r0
            return
    }

    public ArgbEvaluator() {
            r0 = this;
            r0.<init>()
            return
    }

    public static androidx.vectordrawable.graphics.drawable.ArgbEvaluator getInstance() {
            androidx.vectordrawable.graphics.drawable.ArgbEvaluator r0 = androidx.vectordrawable.graphics.drawable.ArgbEvaluator.sInstance
            return r0
    }

    @Override // android.animation.TypeEvaluator
    public java.lang.Object evaluate(float r20, java.lang.Object r21, java.lang.Object r22) {
            r19 = this;
            r0 = r21
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            int r1 = r0 >> 24
            r1 = r1 & 255(0xff, float:3.57E-43)
            float r1 = (float) r1
            r2 = 1132396544(0x437f0000, float:255.0)
            float r1 = r1 / r2
            int r3 = r0 >> 16
            r3 = r3 & 255(0xff, float:3.57E-43)
            float r3 = (float) r3
            float r3 = r3 / r2
            int r4 = r0 >> 8
            r4 = r4 & 255(0xff, float:3.57E-43)
            float r4 = (float) r4
            float r4 = r4 / r2
            r5 = r0 & 255(0xff, float:3.57E-43)
            float r5 = (float) r5
            float r5 = r5 / r2
            r6 = r22
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            int r7 = r6 >> 24
            r7 = r7 & 255(0xff, float:3.57E-43)
            float r7 = (float) r7
            float r7 = r7 / r2
            int r8 = r6 >> 16
            r8 = r8 & 255(0xff, float:3.57E-43)
            float r8 = (float) r8
            float r8 = r8 / r2
            int r9 = r6 >> 8
            r9 = r9 & 255(0xff, float:3.57E-43)
            float r9 = (float) r9
            float r9 = r9 / r2
            r10 = r6 & 255(0xff, float:3.57E-43)
            float r10 = (float) r10
            float r10 = r10 / r2
            double r11 = (double) r3
            r13 = 4612136378390124954(0x400199999999999a, double:2.2)
            double r11 = java.lang.Math.pow(r11, r13)
            float r3 = (float) r11
            double r11 = (double) r4
            double r11 = java.lang.Math.pow(r11, r13)
            float r4 = (float) r11
            double r11 = (double) r5
            double r11 = java.lang.Math.pow(r11, r13)
            float r5 = (float) r11
            double r11 = (double) r8
            double r11 = java.lang.Math.pow(r11, r13)
            float r8 = (float) r11
            double r11 = (double) r9
            double r11 = java.lang.Math.pow(r11, r13)
            float r9 = (float) r11
            double r11 = (double) r10
            double r11 = java.lang.Math.pow(r11, r13)
            float r10 = (float) r11
            float r11 = r7 - r1
            float r11 = r11 * r20
            float r11 = r11 + r1
            float r12 = r8 - r3
            float r12 = r12 * r20
            float r12 = r12 + r3
            float r13 = r9 - r4
            float r13 = r13 * r20
            float r13 = r13 + r4
            float r14 = r10 - r5
            float r14 = r14 * r20
            float r14 = r14 + r5
            float r11 = r11 * r2
            r15 = r2
            r16 = r3
            double r2 = (double) r12
            r17 = r0
            r18 = r1
            r0 = 4601859982876761367(0x3fdd1745d1745d17, double:0.45454545454545453)
            double r2 = java.lang.Math.pow(r2, r0)
            float r2 = (float) r2
            float r2 = r2 * r15
            r12 = r2
            double r2 = (double) r13
            double r2 = java.lang.Math.pow(r2, r0)
            float r2 = (float) r2
            float r2 = r2 * r15
            r13 = r2
            double r2 = (double) r14
            double r0 = java.lang.Math.pow(r2, r0)
            float r0 = (float) r0
            float r0 = r0 * r15
            int r1 = java.lang.Math.round(r11)
            int r1 = r1 << 24
            int r2 = java.lang.Math.round(r12)
            int r2 = r2 << 16
            r1 = r1 | r2
            int r2 = java.lang.Math.round(r13)
            int r2 = r2 << 8
            r1 = r1 | r2
            int r2 = java.lang.Math.round(r0)
            r1 = r1 | r2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            return r1
    }
}
