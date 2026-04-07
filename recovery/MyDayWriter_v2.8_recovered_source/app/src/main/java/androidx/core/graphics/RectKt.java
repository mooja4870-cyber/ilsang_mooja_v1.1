package androidx.core.graphics;

/* JADX INFO: compiled from: Rect.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\u001a\r\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0086\n\u001a\r\u0010\u0003\u001a\u00020\u0001*\u00020\u0002H\u0086\n\u001a\r\u0010\u0004\u001a\u00020\u0001*\u00020\u0002H\u0086\n\u001a\r\u0010\u0005\u001a\u00020\u0001*\u00020\u0002H\u0086\n\u001a\r\u0010\u0000\u001a\u00020\u0006*\u00020\u0007H\u0086\n\u001a\r\u0010\u0003\u001a\u00020\u0006*\u00020\u0007H\u0086\n\u001a\r\u0010\u0004\u001a\u00020\u0006*\u00020\u0007H\u0086\n\u001a\r\u0010\u0005\u001a\u00020\u0006*\u00020\u0007H\u0086\n\u001a\u0015\u0010\b\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0086\n\u001a\u0015\u0010\b\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0086\n\u001a\u0015\u0010\b\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\n\u001a\u00020\u0001H\u0086\n\u001a\u0015\u0010\b\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\n\u001a\u00020\u0006H\u0086\n\u001a\u0015\u0010\b\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\n\u001a\u00020\u000bH\u0086\n\u001a\u0015\u0010\b\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\n\u001a\u00020\fH\u0086\n\u001a\u0015\u0010\r\u001a\u00020\u000e*\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0086\n\u001a\u0015\u0010\r\u001a\u00020\u000e*\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0086\n\u001a\u0015\u0010\r\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\n\u001a\u00020\u0001H\u0086\n\u001a\u0015\u0010\r\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\n\u001a\u00020\u0006H\u0086\n\u001a\u0015\u0010\r\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\n\u001a\u00020\u000bH\u0086\n\u001a\u0015\u0010\r\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\n\u001a\u00020\fH\u0086\n\u001a\u0015\u0010\u000f\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0001H\u0086\n\u001a\u0015\u0010\u000f\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0001H\u0086\n\u001a\u0015\u0010\u000f\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0006H\u0086\n\u001a\u0015\u0010\u0011\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0086\f\u001a\u0015\u0010\u0011\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0086\f\u001a\u0015\u0010\u0012\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0087\f\u001a\u0015\u0010\u0012\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0087\f\u001a\u0015\u0010\u0013\u001a\u00020\u000e*\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0086\f\u001a\u0015\u0010\u0013\u001a\u00020\u000e*\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0086\f\u001a\u0015\u0010\u0014\u001a\u00020\u0015*\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u000bH\u0086\n\u001a\u0015\u0010\u0014\u001a\u00020\u0015*\u00020\u00072\u0006\u0010\u0016\u001a\u00020\fH\u0086\n\u001a\r\u0010\u0017\u001a\u00020\u0007*\u00020\u0002H\u0086\b\u001a\r\u0010\u0018\u001a\u00020\u0002*\u00020\u0007H\u0086\b\u001a\r\u0010\u0019\u001a\u00020\u000e*\u00020\u0002H\u0086\b\u001a\r\u0010\u0019\u001a\u00020\u000e*\u00020\u0007H\u0086\b\u001a\u0015\u0010\u001a\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u001cH\u0086\b¨\u0006\u001d"}, d2 = {"component1", "", "Landroid/graphics/Rect;", "component2", "component3", "component4", "", "Landroid/graphics/RectF;", "plus", "r", "xy", "Landroid/graphics/Point;", "Landroid/graphics/PointF;", "minus", "Landroid/graphics/Region;", "times", "factor", "or", "and", "xor", "contains", "", "p", "toRectF", "toRect", "toRegion", "transform", "m", "Landroid/graphics/Matrix;", "core-ktx_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class RectKt {
    public static final android.graphics.Rect and(android.graphics.Rect r4, android.graphics.Rect r5) {
            r0 = 0
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>(r4)
            r2 = r1
            r3 = 0
            r2.intersect(r5)
            return r1
    }

    public static final android.graphics.RectF and(android.graphics.RectF r4, android.graphics.RectF r5) {
            r0 = 0
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>(r4)
            r2 = r1
            r3 = 0
            r2.intersect(r5)
            return r1
    }

    public static final float component1(android.graphics.RectF r2) {
            r0 = 0
            float r1 = r2.left
            return r1
    }

    public static final int component1(android.graphics.Rect r2) {
            r0 = 0
            int r1 = r2.left
            return r1
    }

    public static final float component2(android.graphics.RectF r2) {
            r0 = 0
            float r1 = r2.top
            return r1
    }

    public static final int component2(android.graphics.Rect r2) {
            r0 = 0
            int r1 = r2.top
            return r1
    }

    public static final float component3(android.graphics.RectF r2) {
            r0 = 0
            float r1 = r2.right
            return r1
    }

    public static final int component3(android.graphics.Rect r2) {
            r0 = 0
            int r1 = r2.right
            return r1
    }

    public static final float component4(android.graphics.RectF r2) {
            r0 = 0
            float r1 = r2.bottom
            return r1
    }

    public static final int component4(android.graphics.Rect r2) {
            r0 = 0
            int r1 = r2.bottom
            return r1
    }

    public static final boolean contains(android.graphics.Rect r3, android.graphics.Point r4) {
            r0 = 0
            int r1 = r4.x
            int r2 = r4.y
            boolean r1 = r3.contains(r1, r2)
            return r1
    }

    public static final boolean contains(android.graphics.RectF r3, android.graphics.PointF r4) {
            r0 = 0
            float r1 = r4.x
            float r2 = r4.y
            boolean r1 = r3.contains(r1, r2)
            return r1
    }

    public static final android.graphics.Rect minus(android.graphics.Rect r6, int r7) {
            r0 = 0
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>(r6)
            r2 = r1
            r3 = 0
            int r4 = -r7
            int r5 = -r7
            r2.offset(r4, r5)
            return r1
    }

    public static final android.graphics.Rect minus(android.graphics.Rect r6, android.graphics.Point r7) {
            r0 = 0
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>(r6)
            r2 = r1
            r3 = 0
            int r4 = r7.x
            int r4 = -r4
            int r5 = r7.y
            int r5 = -r5
            r2.offset(r4, r5)
            return r1
    }

    public static final android.graphics.RectF minus(android.graphics.RectF r6, float r7) {
            r0 = 0
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>(r6)
            r2 = r1
            r3 = 0
            float r4 = -r7
            float r5 = -r7
            r2.offset(r4, r5)
            return r1
    }

    public static final android.graphics.RectF minus(android.graphics.RectF r6, android.graphics.PointF r7) {
            r0 = 0
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>(r6)
            r2 = r1
            r3 = 0
            float r4 = r7.x
            float r4 = -r4
            float r5 = r7.y
            float r5 = -r5
            r2.offset(r4, r5)
            return r1
    }

    public static final android.graphics.Region minus(android.graphics.Rect r5, android.graphics.Rect r6) {
            r0 = 0
            android.graphics.Region r1 = new android.graphics.Region
            r1.<init>(r5)
            r2 = r1
            r3 = 0
            android.graphics.Region$Op r4 = android.graphics.Region.Op.DIFFERENCE
            r2.op(r6, r4)
            return r1
    }

    public static final android.graphics.Region minus(android.graphics.RectF r7, android.graphics.RectF r8) {
            r0 = 0
            android.graphics.Region r1 = new android.graphics.Region
            r2 = r7
            r3 = 0
            android.graphics.Rect r4 = new android.graphics.Rect
            r4.<init>()
            r2.roundOut(r4)
            r1.<init>(r4)
            r2 = r1
            r3 = 0
            r4 = r8
            r5 = 0
            android.graphics.Rect r6 = new android.graphics.Rect
            r6.<init>()
            r4.roundOut(r6)
            android.graphics.Region$Op r4 = android.graphics.Region.Op.DIFFERENCE
            r2.op(r6, r4)
            return r1
    }

    public static final android.graphics.Rect or(android.graphics.Rect r6, android.graphics.Rect r7) {
            r0 = 0
            r1 = r6
            r2 = 0
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>(r1)
            r4 = r3
            r5 = 0
            r4.union(r7)
            return r3
    }

    public static final android.graphics.RectF or(android.graphics.RectF r6, android.graphics.RectF r7) {
            r0 = 0
            r1 = r6
            r2 = 0
            android.graphics.RectF r3 = new android.graphics.RectF
            r3.<init>(r1)
            r4 = r3
            r5 = 0
            r4.union(r7)
            return r3
    }

    public static final android.graphics.Rect plus(android.graphics.Rect r4, int r5) {
            r0 = 0
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>(r4)
            r2 = r1
            r3 = 0
            r2.offset(r5, r5)
            return r1
    }

    public static final android.graphics.Rect plus(android.graphics.Rect r6, android.graphics.Point r7) {
            r0 = 0
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>(r6)
            r2 = r1
            r3 = 0
            int r4 = r7.x
            int r5 = r7.y
            r2.offset(r4, r5)
            return r1
    }

    public static final android.graphics.Rect plus(android.graphics.Rect r4, android.graphics.Rect r5) {
            r0 = 0
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>(r4)
            r2 = r1
            r3 = 0
            r2.union(r5)
            return r1
    }

    public static final android.graphics.RectF plus(android.graphics.RectF r4, float r5) {
            r0 = 0
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>(r4)
            r2 = r1
            r3 = 0
            r2.offset(r5, r5)
            return r1
    }

    public static final android.graphics.RectF plus(android.graphics.RectF r6, android.graphics.PointF r7) {
            r0 = 0
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>(r6)
            r2 = r1
            r3 = 0
            float r4 = r7.x
            float r5 = r7.y
            r2.offset(r4, r5)
            return r1
    }

    public static final android.graphics.RectF plus(android.graphics.RectF r4, android.graphics.RectF r5) {
            r0 = 0
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>(r4)
            r2 = r1
            r3 = 0
            r2.union(r5)
            return r1
    }

    public static final android.graphics.Rect times(android.graphics.Rect r5, int r6) {
            r0 = 0
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>(r5)
            r2 = r1
            r3 = 0
            int r4 = r2.top
            int r4 = r4 * r6
            r2.top = r4
            int r4 = r2.left
            int r4 = r4 * r6
            r2.left = r4
            int r4 = r2.right
            int r4 = r4 * r6
            r2.right = r4
            int r4 = r2.bottom
            int r4 = r4 * r6
            r2.bottom = r4
            return r1
    }

    public static final android.graphics.RectF times(android.graphics.RectF r5, float r6) {
            r0 = 0
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>(r5)
            r2 = r1
            r3 = 0
            float r4 = r2.top
            float r4 = r4 * r6
            r2.top = r4
            float r4 = r2.left
            float r4 = r4 * r6
            r2.left = r4
            float r4 = r2.right
            float r4 = r4 * r6
            r2.right = r4
            float r4 = r2.bottom
            float r4 = r4 * r6
            r2.bottom = r4
            return r1
    }

    public static final android.graphics.RectF times(android.graphics.RectF r8, int r9) {
            r0 = 0
            float r1 = (float) r9
            r2 = r8
            r3 = 0
            android.graphics.RectF r4 = new android.graphics.RectF
            r4.<init>(r2)
            r5 = r4
            r6 = 0
            float r7 = r5.top
            float r7 = r7 * r1
            r5.top = r7
            float r7 = r5.left
            float r7 = r7 * r1
            r5.left = r7
            float r7 = r5.right
            float r7 = r7 * r1
            r5.right = r7
            float r7 = r5.bottom
            float r7 = r7 * r1
            r5.bottom = r7
            return r4
    }

    public static final android.graphics.Rect toRect(android.graphics.RectF r2) {
            r0 = 0
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r2.roundOut(r1)
            return r1
    }

    public static final android.graphics.RectF toRectF(android.graphics.Rect r2) {
            r0 = 0
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>(r2)
            return r1
    }

    public static final android.graphics.Region toRegion(android.graphics.Rect r2) {
            r0 = 0
            android.graphics.Region r1 = new android.graphics.Region
            r1.<init>(r2)
            return r1
    }

    public static final android.graphics.Region toRegion(android.graphics.RectF r5) {
            r0 = 0
            android.graphics.Region r1 = new android.graphics.Region
            r2 = r5
            r3 = 0
            android.graphics.Rect r4 = new android.graphics.Rect
            r4.<init>()
            r2.roundOut(r4)
            r1.<init>(r4)
            return r1
    }

    public static final android.graphics.RectF transform(android.graphics.RectF r3, android.graphics.Matrix r4) {
            r0 = 0
            r1 = r3
            r2 = 0
            r4.mapRect(r3)
            return r3
    }

    public static final android.graphics.Region xor(android.graphics.Rect r5, android.graphics.Rect r6) {
            r0 = 0
            android.graphics.Region r1 = new android.graphics.Region
            r1.<init>(r5)
            r2 = r1
            r3 = 0
            android.graphics.Region$Op r4 = android.graphics.Region.Op.XOR
            r2.op(r6, r4)
            return r1
    }

    public static final android.graphics.Region xor(android.graphics.RectF r7, android.graphics.RectF r8) {
            r0 = 0
            android.graphics.Region r1 = new android.graphics.Region
            r2 = r7
            r3 = 0
            android.graphics.Rect r4 = new android.graphics.Rect
            r4.<init>()
            r2.roundOut(r4)
            r1.<init>(r4)
            r2 = r1
            r3 = 0
            r4 = r8
            r5 = 0
            android.graphics.Rect r6 = new android.graphics.Rect
            r6.<init>()
            r4.roundOut(r6)
            android.graphics.Region$Op r4 = android.graphics.Region.Op.XOR
            r2.op(r6, r4)
            return r1
    }
}
