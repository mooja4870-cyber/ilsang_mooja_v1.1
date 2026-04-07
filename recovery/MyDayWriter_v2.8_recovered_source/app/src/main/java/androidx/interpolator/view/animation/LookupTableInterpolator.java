package androidx.interpolator.view.animation;

/* JADX INFO: loaded from: classes.dex */
abstract class LookupTableInterpolator implements android.view.animation.Interpolator {
    private final float mStepSize;
    private final float[] mValues;

    protected LookupTableInterpolator(float[] r3) {
            r2 = this;
            r2.<init>()
            r2.mValues = r3
            float[] r0 = r2.mValues
            int r0 = r0.length
            int r0 = r0 + (-1)
            float r0 = (float) r0
            r1 = 1065353216(0x3f800000, float:1.0)
            float r1 = r1 / r0
            r2.mStepSize = r1
            return
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float r8) {
            r7 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r1 < 0) goto L7
            return r0
        L7:
            r0 = 0
            int r1 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r1 > 0) goto Ld
            return r0
        Ld:
            float[] r0 = r7.mValues
            int r0 = r0.length
            int r0 = r0 + (-1)
            float r0 = (float) r0
            float r0 = r0 * r8
            int r0 = (int) r0
            float[] r1 = r7.mValues
            int r1 = r1.length
            int r1 = r1 + (-2)
            int r0 = java.lang.Math.min(r0, r1)
            float r1 = (float) r0
            float r2 = r7.mStepSize
            float r1 = r1 * r2
            float r2 = r8 - r1
            float r3 = r7.mStepSize
            float r3 = r2 / r3
            float[] r4 = r7.mValues
            r4 = r4[r0]
            float[] r5 = r7.mValues
            int r6 = r0 + 1
            r5 = r5[r6]
            float[] r6 = r7.mValues
            r6 = r6[r0]
            float r5 = r5 - r6
            float r5 = r5 * r3
            float r4 = r4 + r5
            return r4
    }
}
