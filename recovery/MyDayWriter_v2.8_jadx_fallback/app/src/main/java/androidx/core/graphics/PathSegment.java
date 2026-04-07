package androidx.core.graphics;

/* JADX INFO: loaded from: classes.dex */
public final class PathSegment {
    private final android.graphics.PointF mEnd;
    private final float mEndFraction;
    private final android.graphics.PointF mStart;
    private final float mStartFraction;

    public PathSegment(android.graphics.PointF r2, float r3, android.graphics.PointF r4, float r5) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "start == null"
            java.lang.Object r0 = androidx.core.util.Preconditions.checkNotNull(r2, r0)
            android.graphics.PointF r0 = (android.graphics.PointF) r0
            r1.mStart = r0
            r1.mStartFraction = r3
            java.lang.String r0 = "end == null"
            java.lang.Object r0 = androidx.core.util.Preconditions.checkNotNull(r4, r0)
            android.graphics.PointF r0 = (android.graphics.PointF) r0
            r1.mEnd = r0
            r1.mEndFraction = r5
            return
    }

    public boolean equals(java.lang.Object r6) {
            r5 = this;
            r0 = 1
            if (r5 != r6) goto L4
            return r0
        L4:
            boolean r1 = r6 instanceof androidx.core.graphics.PathSegment
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            r1 = r6
            androidx.core.graphics.PathSegment r1 = (androidx.core.graphics.PathSegment) r1
            float r3 = r5.mStartFraction
            float r4 = r1.mStartFraction
            int r3 = java.lang.Float.compare(r3, r4)
            if (r3 != 0) goto L36
            float r3 = r5.mEndFraction
            float r4 = r1.mEndFraction
            int r3 = java.lang.Float.compare(r3, r4)
            if (r3 != 0) goto L36
            android.graphics.PointF r3 = r5.mStart
            android.graphics.PointF r4 = r1.mStart
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L36
            android.graphics.PointF r3 = r5.mEnd
            android.graphics.PointF r4 = r1.mEnd
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L36
            goto L37
        L36:
            r0 = r2
        L37:
            return r0
    }

    public android.graphics.PointF getEnd() {
            r1 = this;
            android.graphics.PointF r0 = r1.mEnd
            return r0
    }

    public float getEndFraction() {
            r1 = this;
            float r0 = r1.mEndFraction
            return r0
    }

    public android.graphics.PointF getStart() {
            r1 = this;
            android.graphics.PointF r0 = r1.mStart
            return r0
    }

    public float getStartFraction() {
            r1 = this;
            float r0 = r1.mStartFraction
            return r0
    }

    public int hashCode() {
            r5 = this;
            android.graphics.PointF r0 = r5.mStart
            int r0 = r0.hashCode()
            int r1 = r0 * 31
            float r2 = r5.mStartFraction
            r3 = 0
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            r4 = 0
            if (r2 == 0) goto L17
            float r2 = r5.mStartFraction
            int r2 = java.lang.Float.floatToIntBits(r2)
            goto L18
        L17:
            r2 = r4
        L18:
            int r1 = r1 + r2
            int r0 = r1 * 31
            android.graphics.PointF r2 = r5.mEnd
            int r2 = r2.hashCode()
            int r0 = r0 + r2
            int r1 = r0 * 31
            float r2 = r5.mEndFraction
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 == 0) goto L30
            float r2 = r5.mEndFraction
            int r4 = java.lang.Float.floatToIntBits(r2)
        L30:
            int r1 = r1 + r4
            return r1
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "PathSegment{start="
            java.lang.StringBuilder r0 = r0.append(r1)
            android.graphics.PointF r1 = r2.mStart
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", startFraction="
            java.lang.StringBuilder r0 = r0.append(r1)
            float r1 = r2.mStartFraction
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", end="
            java.lang.StringBuilder r0 = r0.append(r1)
            android.graphics.PointF r1 = r2.mEnd
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", endFraction="
            java.lang.StringBuilder r0 = r0.append(r1)
            float r1 = r2.mEndFraction
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
