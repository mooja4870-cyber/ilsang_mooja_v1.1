package androidx.core.view;

/* JADX INFO: loaded from: classes.dex */
public final class RoundedCornerCompat {
    public static final int POSITION_BOTTOM_LEFT = 3;
    public static final int POSITION_BOTTOM_RIGHT = 2;
    public static final int POSITION_TOP_LEFT = 0;
    public static final int POSITION_TOP_RIGHT = 1;
    private final android.graphics.Point mCenter;
    private final int mPosition;
    private final int mRadius;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface Position {
    }

    public RoundedCornerCompat(int r2, int r3, int r4, int r5) {
            r1 = this;
            r1.<init>()
            r1.mPosition = r2
            r1.mRadius = r3
            android.graphics.Point r0 = new android.graphics.Point
            r0.<init>(r4, r5)
            r1.mCenter = r0
            return
    }

    private RoundedCornerCompat(int r3, int r4, android.graphics.Point r5) {
            r2 = this;
            int r0 = r5.x
            int r1 = r5.y
            r2.<init>(r3, r4, r0, r1)
            return
    }

    private java.lang.String getPositionString(int r2) {
            r1 = this;
            switch(r2) {
                case 0: goto Lf;
                case 1: goto Lc;
                case 2: goto L9;
                case 3: goto L6;
                default: goto L3;
            }
        L3:
            java.lang.String r0 = "Invalid"
            return r0
        L6:
            java.lang.String r0 = "BottomLeft"
            return r0
        L9:
            java.lang.String r0 = "BottomRight"
            return r0
        Lc:
            java.lang.String r0 = "TopRight"
            return r0
        Lf:
            java.lang.String r0 = "TopLeft"
            return r0
    }

    private static int toCompatPosition(int r3) {
            switch(r3) {
                case 0: goto L22;
                case 1: goto L20;
                case 2: goto L1e;
                case 3: goto L1c;
                default: goto L3;
            }
        L3:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Invalid position: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L1c:
            r0 = 3
            return r0
        L1e:
            r0 = 2
            return r0
        L20:
            r0 = 1
            return r0
        L22:
            r0 = 0
            return r0
    }

    static int toPlatformPosition(int r3) {
            switch(r3) {
                case 0: goto L22;
                case 1: goto L20;
                case 2: goto L1e;
                case 3: goto L1c;
                default: goto L3;
            }
        L3:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Invalid position: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L1c:
            r0 = 3
            return r0
        L1e:
            r0 = 2
            return r0
        L20:
            r0 = 1
            return r0
        L22:
            r0 = 0
            return r0
    }

    static android.view.RoundedCorner toPlatformRoundedCorner(androidx.core.view.RoundedCornerCompat r5) {
            if (r5 == 0) goto L1c
            android.view.RoundedCorner r0 = new android.view.RoundedCorner
            int r1 = r5.getPosition()
            int r1 = toPlatformPosition(r1)
            int r2 = r5.getRadius()
            int r3 = r5.getCenterX()
            int r4 = r5.getCenterY()
            r0.<init>(r1, r2, r3, r4)
            goto L1d
        L1c:
            r0 = 0
        L1d:
            return r0
    }

    static androidx.core.view.RoundedCornerCompat toRoundedCornerCompat(android.view.RoundedCorner r4) {
            if (r4 == 0) goto L18
            androidx.core.view.RoundedCornerCompat r0 = new androidx.core.view.RoundedCornerCompat
            int r1 = r4.getPosition()
            int r1 = toCompatPosition(r1)
            int r2 = r4.getRadius()
            android.graphics.Point r3 = r4.getCenter()
            r0.<init>(r1, r2, r3)
            goto L19
        L18:
            r0 = 0
        L19:
            return r0
    }

    public boolean equals(java.lang.Object r6) {
            r5 = this;
            r0 = 1
            if (r6 != r5) goto L4
            return r0
        L4:
            boolean r1 = r6 instanceof androidx.core.view.RoundedCornerCompat
            r2 = 0
            if (r1 == 0) goto L25
            r1 = r6
            androidx.core.view.RoundedCornerCompat r1 = (androidx.core.view.RoundedCornerCompat) r1
            int r3 = r5.mPosition
            int r4 = r1.mPosition
            if (r3 != r4) goto L23
            int r3 = r5.mRadius
            int r4 = r1.mRadius
            if (r3 != r4) goto L23
            android.graphics.Point r3 = r5.mCenter
            android.graphics.Point r4 = r1.mCenter
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L23
            goto L24
        L23:
            r0 = r2
        L24:
            return r0
        L25:
            return r2
    }

    public android.graphics.Point getCenter() {
            r2 = this;
            android.graphics.Point r0 = new android.graphics.Point
            android.graphics.Point r1 = r2.mCenter
            r0.<init>(r1)
            return r0
    }

    public int getCenterX() {
            r1 = this;
            android.graphics.Point r0 = r1.mCenter
            int r0 = r0.x
            return r0
    }

    public int getCenterY() {
            r1 = this;
            android.graphics.Point r0 = r1.mCenter
            int r0 = r0.y
            return r0
    }

    public int getPosition() {
            r1 = this;
            int r0 = r1.mPosition
            return r0
    }

    public int getRadius() {
            r1 = this;
            int r0 = r1.mRadius
            return r0
    }

    public int hashCode() {
            r3 = this;
            r0 = 0
            int r1 = r0 * 31
            int r2 = r3.mPosition
            int r1 = r1 + r2
            int r0 = r1 * 31
            int r2 = r3.mRadius
            int r0 = r0 + r2
            int r1 = r0 * 31
            android.graphics.Point r2 = r3.mCenter
            int r2 = r2.hashCode()
            int r1 = r1 + r2
            return r1
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "RoundedCornerCompat{position="
            java.lang.StringBuilder r0 = r0.append(r1)
            int r1 = r2.mPosition
            java.lang.String r1 = r2.getPositionString(r1)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", radius="
            java.lang.StringBuilder r0 = r0.append(r1)
            int r1 = r2.mRadius
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", center="
            java.lang.StringBuilder r0 = r0.append(r1)
            android.graphics.Point r1 = r2.mCenter
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
