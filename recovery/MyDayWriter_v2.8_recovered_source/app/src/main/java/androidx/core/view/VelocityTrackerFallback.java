package androidx.core.view;

/* JADX INFO: loaded from: classes.dex */
class VelocityTrackerFallback {
    private static final long ASSUME_POINTER_STOPPED_MS = 40;
    private static final int HISTORY_SIZE = 20;
    private static final long RANGE_MS = 100;
    private int mDataPointsBufferLastUsedIndex;
    private int mDataPointsBufferSize;
    private final long[] mEventTimes;
    private float mLastComputedVelocity;
    private final float[] mMovements;

    VelocityTrackerFallback() {
            r2 = this;
            r2.<init>()
            r0 = 20
            float[] r1 = new float[r0]
            r2.mMovements = r1
            long[] r0 = new long[r0]
            r2.mEventTimes = r0
            r0 = 0
            r2.mLastComputedVelocity = r0
            r0 = 0
            r2.mDataPointsBufferSize = r0
            r2.mDataPointsBufferLastUsedIndex = r0
            return
    }

    private void clear() {
            r1 = this;
            r0 = 0
            r1.mDataPointsBufferSize = r0
            r0 = 0
            r1.mLastComputedVelocity = r0
            return
    }

    private float getCurrentVelocity() {
            r17 = this;
            r0 = r17
            int r1 = r0.mDataPointsBufferSize
            r2 = 0
            r3 = 2
            if (r1 >= r3) goto L9
            return r2
        L9:
            int r1 = r0.mDataPointsBufferLastUsedIndex
            int r1 = r1 + 20
            int r4 = r0.mDataPointsBufferSize
            r5 = 1
            int r4 = r4 - r5
            int r1 = r1 - r4
            int r1 = r1 % 20
            long[] r4 = r0.mEventTimes
            int r6 = r0.mDataPointsBufferLastUsedIndex
            r6 = r4[r6]
        L1a:
            long[] r4 = r0.mEventTimes
            r8 = r4[r1]
            long r8 = r6 - r8
            r10 = 100
            int r4 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r4 <= 0) goto L30
            int r4 = r0.mDataPointsBufferSize
            int r4 = r4 - r5
            r0.mDataPointsBufferSize = r4
            int r4 = r1 + 1
            int r1 = r4 % 20
            goto L1a
        L30:
            int r4 = r0.mDataPointsBufferSize
            if (r4 >= r3) goto L35
            return r2
        L35:
            int r4 = r0.mDataPointsBufferSize
            if (r4 != r3) goto L5a
            int r3 = r1 + 1
            int r3 = r3 % 20
            long[] r4 = r0.mEventTimes
            r8 = r4[r1]
            long[] r4 = r0.mEventTimes
            r10 = r4[r3]
            int r4 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r4 != 0) goto L4a
            return r2
        L4a:
            float[] r2 = r0.mMovements
            r2 = r2[r3]
            long[] r4 = r0.mEventTimes
            r8 = r4[r3]
            long[] r4 = r0.mEventTimes
            r10 = r4[r1]
            long r8 = r8 - r10
            float r4 = (float) r8
            float r2 = r2 / r4
            return r2
        L5a:
            r2 = 0
            r3 = 0
            r4 = 0
        L5d:
            int r8 = r0.mDataPointsBufferSize
            int r8 = r8 - r5
            if (r4 >= r8) goto L9b
            int r8 = r4 + r1
            long[] r9 = r0.mEventTimes
            int r10 = r8 % 20
            r10 = r9[r10]
            int r9 = r8 + 1
            int r9 = r9 % 20
            long[] r12 = r0.mEventTimes
            r13 = r12[r9]
            int r12 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
            if (r12 != 0) goto L77
            goto L98
        L77:
            int r3 = r3 + 1
            float r12 = kineticEnergyToVelocity(r2)
            float[] r13 = r0.mMovements
            r13 = r13[r9]
            long[] r14 = r0.mEventTimes
            r15 = r14[r9]
            long r14 = r15 - r10
            float r14 = (float) r14
            float r14 = r13 / r14
            float r15 = r14 - r12
            float r16 = java.lang.Math.abs(r14)
            float r15 = r15 * r16
            float r2 = r2 + r15
            if (r3 != r5) goto L98
            r15 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 * r15
        L98:
            int r4 = r4 + 1
            goto L5d
        L9b:
            float r4 = kineticEnergyToVelocity(r2)
            return r4
    }

    private static float kineticEnergyToVelocity(float r3) {
            r0 = 0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 >= 0) goto L8
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            goto La
        L8:
            r0 = 1065353216(0x3f800000, float:1.0)
        La:
            r1 = 1073741824(0x40000000, float:2.0)
            float r2 = java.lang.Math.abs(r3)
            float r2 = r2 * r1
            double r1 = (double) r2
            double r1 = java.lang.Math.sqrt(r1)
            float r1 = (float) r1
            float r0 = r0 * r1
            return r0
    }

    void addMovement(android.view.MotionEvent r7) {
            r6 = this;
            long r0 = r7.getEventTime()
            int r2 = r6.mDataPointsBufferSize
            if (r2 == 0) goto L19
            long[] r2 = r6.mEventTimes
            int r3 = r6.mDataPointsBufferLastUsedIndex
            r3 = r2[r3]
            long r2 = r0 - r3
            r4 = 40
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 <= 0) goto L19
            r6.clear()
        L19:
            int r2 = r6.mDataPointsBufferLastUsedIndex
            int r2 = r2 + 1
            r3 = 20
            int r2 = r2 % r3
            r6.mDataPointsBufferLastUsedIndex = r2
            int r2 = r6.mDataPointsBufferSize
            if (r2 == r3) goto L2c
            int r2 = r6.mDataPointsBufferSize
            int r2 = r2 + 1
            r6.mDataPointsBufferSize = r2
        L2c:
            float[] r2 = r6.mMovements
            int r3 = r6.mDataPointsBufferLastUsedIndex
            r4 = 26
            float r4 = r7.getAxisValue(r4)
            r2[r3] = r4
            long[] r2 = r6.mEventTimes
            int r3 = r6.mDataPointsBufferLastUsedIndex
            r2[r3] = r0
            return
    }

    void computeCurrentVelocity(int r2) {
            r1 = this;
            r0 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r1.computeCurrentVelocity(r2, r0)
            return
    }

    void computeCurrentVelocity(int r3, float r4) {
            r2 = this;
            float r0 = r2.getCurrentVelocity()
            float r1 = (float) r3
            float r0 = r0 * r1
            r2.mLastComputedVelocity = r0
            float r0 = r2.mLastComputedVelocity
            float r1 = java.lang.Math.abs(r4)
            float r1 = -r1
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L1b
            float r0 = java.lang.Math.abs(r4)
            float r0 = -r0
            r2.mLastComputedVelocity = r0
            goto L2b
        L1b:
            float r0 = r2.mLastComputedVelocity
            float r1 = java.lang.Math.abs(r4)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L2b
            float r0 = java.lang.Math.abs(r4)
            r2.mLastComputedVelocity = r0
        L2b:
            return
    }

    float getAxisVelocity(int r2) {
            r1 = this;
            r0 = 26
            if (r2 == r0) goto L6
            r0 = 0
            return r0
        L6:
            float r0 = r1.mLastComputedVelocity
            return r0
    }
}
