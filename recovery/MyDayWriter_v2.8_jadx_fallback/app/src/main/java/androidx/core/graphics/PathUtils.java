package androidx.core.graphics;

/* JADX INFO: loaded from: classes.dex */
public final class PathUtils {

    static class Api26Impl {
        private Api26Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static float[] approximate(android.graphics.Path r1, float r2) {
                float[] r0 = r1.approximate(r2)
                return r0
        }
    }

    private PathUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.util.Collection<androidx.core.graphics.PathSegment> flatten(android.graphics.Path r1) {
            r0 = 1056964608(0x3f000000, float:0.5)
            java.util.Collection r0 = flatten(r1, r0)
            return r0
    }

    public static java.util.Collection<androidx.core.graphics.PathSegment> flatten(android.graphics.Path r15, float r16) {
            float[] r0 = androidx.core.graphics.PathUtils.Api26Impl.approximate(r15, r16)
            int r1 = r0.length
            int r1 = r1 / 3
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r1)
            r3 = 1
        Ld:
            if (r3 >= r1) goto L4a
            int r4 = r3 * 3
            int r5 = r3 + (-1)
            int r5 = r5 * 3
            r6 = r0[r4]
            int r7 = r4 + 1
            r7 = r0[r7]
            int r8 = r4 + 2
            r8 = r0[r8]
            r9 = r0[r5]
            int r10 = r5 + 1
            r10 = r0[r10]
            int r11 = r5 + 2
            r11 = r0[r11]
            int r12 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r12 == 0) goto L47
            int r12 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r12 != 0) goto L35
            int r12 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r12 == 0) goto L47
        L35:
            androidx.core.graphics.PathSegment r12 = new androidx.core.graphics.PathSegment
            android.graphics.PointF r13 = new android.graphics.PointF
            r13.<init>(r10, r11)
            android.graphics.PointF r14 = new android.graphics.PointF
            r14.<init>(r7, r8)
            r12.<init>(r13, r9, r14, r6)
            r2.add(r12)
        L47:
            int r3 = r3 + 1
            goto Ld
        L4a:
            return r2
    }
}
