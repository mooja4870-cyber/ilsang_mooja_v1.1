package androidx.core.graphics;

/* JADX INFO: compiled from: Point.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a\r\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0086\n\u001a\r\u0010\u0003\u001a\u00020\u0001*\u00020\u0002H\u0086\n\u001a\r\u0010\u0000\u001a\u00020\u0004*\u00020\u0005H\u0086\n\u001a\r\u0010\u0003\u001a\u00020\u0004*\u00020\u0005H\u0086\n\u001a\u0015\u0010\u0006\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0086\n\u001a\u0015\u0010\u0006\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0086\n\u001a\u0015\u0010\u0006\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\b\u001a\u00020\u0001H\u0086\n\u001a\u0015\u0010\u0006\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\b\u001a\u00020\u0004H\u0086\n\u001a\u0015\u0010\t\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0086\n\u001a\u0015\u0010\t\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0086\n\u001a\u0015\u0010\t\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\b\u001a\u00020\u0001H\u0086\n\u001a\u0015\u0010\t\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\b\u001a\u00020\u0004H\u0086\n\u001a\r\u0010\n\u001a\u00020\u0002*\u00020\u0002H\u0086\n\u001a\r\u0010\n\u001a\u00020\u0005*\u00020\u0005H\u0086\n\u001a\u0015\u0010\u000b\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\f\u001a\u00020\u0004H\u0086\n\u001a\u0015\u0010\u000b\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\f\u001a\u00020\u0004H\u0086\n\u001a\u0015\u0010\r\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\f\u001a\u00020\u0004H\u0086\n\u001a\u0015\u0010\r\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\f\u001a\u00020\u0004H\u0086\n\u001a\r\u0010\u000e\u001a\u00020\u0005*\u00020\u0002H\u0086\b\u001a\r\u0010\u000f\u001a\u00020\u0002*\u00020\u0005H\u0086\b¨\u0006\u0010"}, d2 = {"component1", "", "Landroid/graphics/Point;", "component2", "", "Landroid/graphics/PointF;", "plus", "p", "xy", "minus", "unaryMinus", "times", "scalar", "div", "toPointF", "toPoint", "core-ktx_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class PointKt {
    public static final float component1(android.graphics.PointF r2) {
            r0 = 0
            float r1 = r2.x
            return r1
    }

    public static final int component1(android.graphics.Point r2) {
            r0 = 0
            int r1 = r2.x
            return r1
    }

    public static final float component2(android.graphics.PointF r2) {
            r0 = 0
            float r1 = r2.y
            return r1
    }

    public static final int component2(android.graphics.Point r2) {
            r0 = 0
            int r1 = r2.y
            return r1
    }

    public static final android.graphics.Point div(android.graphics.Point r4, float r5) {
            r0 = 0
            android.graphics.Point r1 = new android.graphics.Point
            int r2 = r4.x
            float r2 = (float) r2
            float r2 = r2 / r5
            int r2 = java.lang.Math.round(r2)
            int r3 = r4.y
            float r3 = (float) r3
            float r3 = r3 / r5
            int r3 = java.lang.Math.round(r3)
            r1.<init>(r2, r3)
            return r1
    }

    public static final android.graphics.PointF div(android.graphics.PointF r4, float r5) {
            r0 = 0
            android.graphics.PointF r1 = new android.graphics.PointF
            float r2 = r4.x
            float r2 = r2 / r5
            float r3 = r4.y
            float r3 = r3 / r5
            r1.<init>(r2, r3)
            return r1
    }

    public static final android.graphics.Point minus(android.graphics.Point r6, int r7) {
            r0 = 0
            android.graphics.Point r1 = new android.graphics.Point
            int r2 = r6.x
            int r3 = r6.y
            r1.<init>(r2, r3)
            r2 = r1
            r3 = 0
            int r4 = -r7
            int r5 = -r7
            r2.offset(r4, r5)
            return r1
    }

    public static final android.graphics.Point minus(android.graphics.Point r6, android.graphics.Point r7) {
            r0 = 0
            android.graphics.Point r1 = new android.graphics.Point
            int r2 = r6.x
            int r3 = r6.y
            r1.<init>(r2, r3)
            r2 = r1
            r3 = 0
            int r4 = r7.x
            int r4 = -r4
            int r5 = r7.y
            int r5 = -r5
            r2.offset(r4, r5)
            return r1
    }

    public static final android.graphics.PointF minus(android.graphics.PointF r6, float r7) {
            r0 = 0
            android.graphics.PointF r1 = new android.graphics.PointF
            float r2 = r6.x
            float r3 = r6.y
            r1.<init>(r2, r3)
            r2 = r1
            r3 = 0
            float r4 = -r7
            float r5 = -r7
            r2.offset(r4, r5)
            return r1
    }

    public static final android.graphics.PointF minus(android.graphics.PointF r6, android.graphics.PointF r7) {
            r0 = 0
            android.graphics.PointF r1 = new android.graphics.PointF
            float r2 = r6.x
            float r3 = r6.y
            r1.<init>(r2, r3)
            r2 = r1
            r3 = 0
            float r4 = r7.x
            float r4 = -r4
            float r5 = r7.y
            float r5 = -r5
            r2.offset(r4, r5)
            return r1
    }

    public static final android.graphics.Point plus(android.graphics.Point r4, int r5) {
            r0 = 0
            android.graphics.Point r1 = new android.graphics.Point
            int r2 = r4.x
            int r3 = r4.y
            r1.<init>(r2, r3)
            r2 = r1
            r3 = 0
            r2.offset(r5, r5)
            return r1
    }

    public static final android.graphics.Point plus(android.graphics.Point r6, android.graphics.Point r7) {
            r0 = 0
            android.graphics.Point r1 = new android.graphics.Point
            int r2 = r6.x
            int r3 = r6.y
            r1.<init>(r2, r3)
            r2 = r1
            r3 = 0
            int r4 = r7.x
            int r5 = r7.y
            r2.offset(r4, r5)
            return r1
    }

    public static final android.graphics.PointF plus(android.graphics.PointF r4, float r5) {
            r0 = 0
            android.graphics.PointF r1 = new android.graphics.PointF
            float r2 = r4.x
            float r3 = r4.y
            r1.<init>(r2, r3)
            r2 = r1
            r3 = 0
            r2.offset(r5, r5)
            return r1
    }

    public static final android.graphics.PointF plus(android.graphics.PointF r6, android.graphics.PointF r7) {
            r0 = 0
            android.graphics.PointF r1 = new android.graphics.PointF
            float r2 = r6.x
            float r3 = r6.y
            r1.<init>(r2, r3)
            r2 = r1
            r3 = 0
            float r4 = r7.x
            float r5 = r7.y
            r2.offset(r4, r5)
            return r1
    }

    public static final android.graphics.Point times(android.graphics.Point r4, float r5) {
            r0 = 0
            android.graphics.Point r1 = new android.graphics.Point
            int r2 = r4.x
            float r2 = (float) r2
            float r2 = r2 * r5
            int r2 = java.lang.Math.round(r2)
            int r3 = r4.y
            float r3 = (float) r3
            float r3 = r3 * r5
            int r3 = java.lang.Math.round(r3)
            r1.<init>(r2, r3)
            return r1
    }

    public static final android.graphics.PointF times(android.graphics.PointF r4, float r5) {
            r0 = 0
            android.graphics.PointF r1 = new android.graphics.PointF
            float r2 = r4.x
            float r2 = r2 * r5
            float r3 = r4.y
            float r3 = r3 * r5
            r1.<init>(r2, r3)
            return r1
    }

    public static final android.graphics.Point toPoint(android.graphics.PointF r4) {
            r0 = 0
            android.graphics.Point r1 = new android.graphics.Point
            float r2 = r4.x
            int r2 = (int) r2
            float r3 = r4.y
            int r3 = (int) r3
            r1.<init>(r2, r3)
            return r1
    }

    public static final android.graphics.PointF toPointF(android.graphics.Point r2) {
            r0 = 0
            android.graphics.PointF r1 = new android.graphics.PointF
            r1.<init>(r2)
            return r1
    }

    public static final android.graphics.Point unaryMinus(android.graphics.Point r4) {
            r0 = 0
            android.graphics.Point r1 = new android.graphics.Point
            int r2 = r4.x
            int r2 = -r2
            int r3 = r4.y
            int r3 = -r3
            r1.<init>(r2, r3)
            return r1
    }

    public static final android.graphics.PointF unaryMinus(android.graphics.PointF r4) {
            r0 = 0
            android.graphics.PointF r1 = new android.graphics.PointF
            float r2 = r4.x
            float r2 = -r2
            float r3 = r4.y
            float r3 = -r3
            r1.<init>(r2, r3)
            return r1
    }
}
