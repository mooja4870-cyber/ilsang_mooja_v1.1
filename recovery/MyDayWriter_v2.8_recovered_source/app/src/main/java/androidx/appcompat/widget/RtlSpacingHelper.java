package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
class RtlSpacingHelper {
    public static final int UNDEFINED = Integer.MIN_VALUE;
    private int mEnd;
    private int mExplicitLeft;
    private int mExplicitRight;
    private boolean mIsRelative;
    private boolean mIsRtl;
    private int mLeft;
    private int mRight;
    private int mStart;

    RtlSpacingHelper() {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.mLeft = r0
            r2.mRight = r0
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2.mStart = r1
            r2.mEnd = r1
            r2.mExplicitLeft = r0
            r2.mExplicitRight = r0
            r2.mIsRtl = r0
            r2.mIsRelative = r0
            return
    }

    public int getEnd() {
            r1 = this;
            boolean r0 = r1.mIsRtl
            if (r0 == 0) goto L7
            int r0 = r1.mLeft
            goto L9
        L7:
            int r0 = r1.mRight
        L9:
            return r0
    }

    public int getLeft() {
            r1 = this;
            int r0 = r1.mLeft
            return r0
    }

    public int getRight() {
            r1 = this;
            int r0 = r1.mRight
            return r0
    }

    public int getStart() {
            r1 = this;
            boolean r0 = r1.mIsRtl
            if (r0 == 0) goto L7
            int r0 = r1.mRight
            goto L9
        L7:
            int r0 = r1.mLeft
        L9:
            return r0
    }

    public void setAbsolute(int r2, int r3) {
            r1 = this;
            r0 = 0
            r1.mIsRelative = r0
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r2 == r0) goto Lb
            r1.mExplicitLeft = r2
            r1.mLeft = r2
        Lb:
            if (r3 == r0) goto L11
            r1.mExplicitRight = r3
            r1.mRight = r3
        L11:
            return
    }

    public void setDirection(boolean r3) {
            r2 = this;
            boolean r0 = r2.mIsRtl
            if (r3 != r0) goto L5
            return
        L5:
            r2.mIsRtl = r3
            boolean r0 = r2.mIsRelative
            if (r0 == 0) goto L3d
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r3 == 0) goto L26
            int r1 = r2.mEnd
            if (r1 == r0) goto L16
            int r1 = r2.mEnd
            goto L18
        L16:
            int r1 = r2.mExplicitLeft
        L18:
            r2.mLeft = r1
            int r1 = r2.mStart
            if (r1 == r0) goto L21
            int r0 = r2.mStart
            goto L23
        L21:
            int r0 = r2.mExplicitRight
        L23:
            r2.mRight = r0
            goto L45
        L26:
            int r1 = r2.mStart
            if (r1 == r0) goto L2d
            int r1 = r2.mStart
            goto L2f
        L2d:
            int r1 = r2.mExplicitLeft
        L2f:
            r2.mLeft = r1
            int r1 = r2.mEnd
            if (r1 == r0) goto L38
            int r0 = r2.mEnd
            goto L3a
        L38:
            int r0 = r2.mExplicitRight
        L3a:
            r2.mRight = r0
            goto L45
        L3d:
            int r0 = r2.mExplicitLeft
            r2.mLeft = r0
            int r0 = r2.mExplicitRight
            r2.mRight = r0
        L45:
            return
    }

    public void setRelative(int r3, int r4) {
            r2 = this;
            r2.mStart = r3
            r2.mEnd = r4
            r0 = 1
            r2.mIsRelative = r0
            boolean r0 = r2.mIsRtl
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == 0) goto L16
            if (r4 == r1) goto L11
            r2.mLeft = r4
        L11:
            if (r3 == r1) goto L1e
            r2.mRight = r3
            goto L1e
        L16:
            if (r3 == r1) goto L1a
            r2.mLeft = r3
        L1a:
            if (r4 == r1) goto L1e
            r2.mRight = r4
        L1e:
            return
    }
}
