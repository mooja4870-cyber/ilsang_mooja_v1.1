package androidx.core.util;

/* JADX INFO: loaded from: classes.dex */
public final class SizeFCompat {
    private final float mHeight;
    private final float mWidth;

    private static final class Api21Impl {
        private Api21Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static android.util.SizeF toSizeF(androidx.core.util.SizeFCompat r3) {
                androidx.core.util.Preconditions.checkNotNull(r3)
                android.util.SizeF r0 = new android.util.SizeF
                float r1 = r3.getWidth()
                float r2 = r3.getHeight()
                r0.<init>(r1, r2)
                return r0
        }

        static androidx.core.util.SizeFCompat toSizeFCompat(android.util.SizeF r3) {
                androidx.core.util.Preconditions.checkNotNull(r3)
                androidx.core.util.SizeFCompat r0 = new androidx.core.util.SizeFCompat
                float r1 = r3.getWidth()
                float r2 = r3.getHeight()
                r0.<init>(r1, r2)
                return r0
        }
    }

    public SizeFCompat(float r2, float r3) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "width"
            float r0 = androidx.core.util.Preconditions.checkArgumentFinite(r2, r0)
            r1.mWidth = r0
            java.lang.String r0 = "height"
            float r0 = androidx.core.util.Preconditions.checkArgumentFinite(r3, r0)
            r1.mHeight = r0
            return
    }

    public static androidx.core.util.SizeFCompat toSizeFCompat(android.util.SizeF r1) {
            androidx.core.util.SizeFCompat r0 = androidx.core.util.SizeFCompat.Api21Impl.toSizeFCompat(r1)
            return r0
    }

    public boolean equals(java.lang.Object r6) {
            r5 = this;
            r0 = 1
            if (r5 != r6) goto L4
            return r0
        L4:
            boolean r1 = r6 instanceof androidx.core.util.SizeFCompat
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            r1 = r6
            androidx.core.util.SizeFCompat r1 = (androidx.core.util.SizeFCompat) r1
            float r3 = r1.mWidth
            float r4 = r5.mWidth
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 != 0) goto L1e
            float r3 = r1.mHeight
            float r4 = r5.mHeight
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 != 0) goto L1e
            goto L1f
        L1e:
            r0 = r2
        L1f:
            return r0
    }

    public float getHeight() {
            r1 = this;
            float r0 = r1.mHeight
            return r0
    }

    public float getWidth() {
            r1 = this;
            float r0 = r1.mWidth
            return r0
    }

    public int hashCode() {
            r2 = this;
            float r0 = r2.mWidth
            int r0 = java.lang.Float.floatToIntBits(r0)
            float r1 = r2.mHeight
            int r1 = java.lang.Float.floatToIntBits(r1)
            r0 = r0 ^ r1
            return r0
    }

    public android.util.SizeF toSizeF() {
            r1 = this;
            android.util.SizeF r0 = androidx.core.util.SizeFCompat.Api21Impl.toSizeF(r1)
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            float r1 = r2.mWidth
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "x"
            java.lang.StringBuilder r0 = r0.append(r1)
            float r1 = r2.mHeight
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
