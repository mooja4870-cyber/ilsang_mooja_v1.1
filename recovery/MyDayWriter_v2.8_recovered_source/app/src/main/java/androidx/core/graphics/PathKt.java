package androidx.core.graphics;

/* JADX INFO: compiled from: Path.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\u001a\u001c\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007\u001a\u0015\u0010\u0006\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0003H\u0086\n\u001a\u0015\u0010\b\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0003H\u0086\n\u001a\u0015\u0010\t\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0003H\u0086\f\u001a\u0015\u0010\n\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0003H\u0086\f\u001a\u0015\u0010\u000b\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0003H\u0086\f¨\u0006\f"}, d2 = {"flatten", "", "Landroidx/core/graphics/PathSegment;", "Landroid/graphics/Path;", "error", "", "plus", "p", "minus", "or", "and", "xor", "core-ktx_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class PathKt {
    public static final android.graphics.Path and(android.graphics.Path r5, android.graphics.Path r6) {
            r0 = 0
            android.graphics.Path r1 = new android.graphics.Path
            r1.<init>()
            r2 = r1
            r3 = 0
            android.graphics.Path$Op r4 = android.graphics.Path.Op.INTERSECT
            r2.op(r5, r6, r4)
            return r1
    }

    public static final java.lang.Iterable<androidx.core.graphics.PathSegment> flatten(android.graphics.Path r1, float r2) {
            java.util.Collection r0 = androidx.core.graphics.PathUtils.flatten(r1, r2)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            return r0
    }

    public static /* synthetic */ java.lang.Iterable flatten$default(android.graphics.Path r0, float r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L6
            r1 = 1056964608(0x3f000000, float:0.5)
        L6:
            java.lang.Iterable r0 = flatten(r0, r1)
            return r0
    }

    public static final android.graphics.Path minus(android.graphics.Path r5, android.graphics.Path r6) {
            r0 = 0
            android.graphics.Path r1 = new android.graphics.Path
            r1.<init>(r5)
            r2 = r1
            r3 = 0
            android.graphics.Path$Op r4 = android.graphics.Path.Op.DIFFERENCE
            r2.op(r6, r4)
            return r1
    }

    public static final android.graphics.Path or(android.graphics.Path r7, android.graphics.Path r8) {
            r0 = 0
            r1 = r7
            r2 = 0
            android.graphics.Path r3 = new android.graphics.Path
            r3.<init>(r1)
            r4 = r3
            r5 = 0
            android.graphics.Path$Op r6 = android.graphics.Path.Op.UNION
            r4.op(r8, r6)
            return r3
    }

    public static final android.graphics.Path plus(android.graphics.Path r5, android.graphics.Path r6) {
            r0 = 0
            android.graphics.Path r1 = new android.graphics.Path
            r1.<init>(r5)
            r2 = r1
            r3 = 0
            android.graphics.Path$Op r4 = android.graphics.Path.Op.UNION
            r2.op(r6, r4)
            return r1
    }

    public static final android.graphics.Path xor(android.graphics.Path r5, android.graphics.Path r6) {
            r0 = 0
            android.graphics.Path r1 = new android.graphics.Path
            r1.<init>(r5)
            r2 = r1
            r3 = 0
            android.graphics.Path$Op r4 = android.graphics.Path.Op.XOR
            r2.op(r6, r4)
            return r1
    }
}
