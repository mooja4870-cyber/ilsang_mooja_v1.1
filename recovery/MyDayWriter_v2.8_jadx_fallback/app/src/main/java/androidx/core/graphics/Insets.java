package androidx.core.graphics;

/* JADX INFO: loaded from: classes.dex */
public final class Insets {
    public static final androidx.core.graphics.Insets NONE = null;
    public final int bottom;
    public final int left;
    public final int right;
    public final int top;

    static class Api29Impl {
        private Api29Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static android.graphics.Insets of(int r1, int r2, int r3, int r4) {
                android.graphics.Insets r0 = android.graphics.Insets.of(r1, r2, r3, r4)
                return r0
        }
    }

    static {
            androidx.core.graphics.Insets r0 = new androidx.core.graphics.Insets
            r1 = 0
            r0.<init>(r1, r1, r1, r1)
            androidx.core.graphics.Insets.NONE = r0
            return
    }

    private Insets(int r1, int r2, int r3, int r4) {
            r0 = this;
            r0.<init>()
            r0.left = r1
            r0.top = r2
            r0.right = r3
            r0.bottom = r4
            return
    }

    public static androidx.core.graphics.Insets add(androidx.core.graphics.Insets r5, androidx.core.graphics.Insets r6) {
            int r0 = r5.left
            int r1 = r6.left
            int r0 = r0 + r1
            int r1 = r5.top
            int r2 = r6.top
            int r1 = r1 + r2
            int r2 = r5.right
            int r3 = r6.right
            int r2 = r2 + r3
            int r3 = r5.bottom
            int r4 = r6.bottom
            int r3 = r3 + r4
            androidx.core.graphics.Insets r0 = of(r0, r1, r2, r3)
            return r0
    }

    public static androidx.core.graphics.Insets max(androidx.core.graphics.Insets r5, androidx.core.graphics.Insets r6) {
            int r0 = r5.left
            int r1 = r6.left
            int r0 = java.lang.Math.max(r0, r1)
            int r1 = r5.top
            int r2 = r6.top
            int r1 = java.lang.Math.max(r1, r2)
            int r2 = r5.right
            int r3 = r6.right
            int r2 = java.lang.Math.max(r2, r3)
            int r3 = r5.bottom
            int r4 = r6.bottom
            int r3 = java.lang.Math.max(r3, r4)
            androidx.core.graphics.Insets r0 = of(r0, r1, r2, r3)
            return r0
    }

    public static androidx.core.graphics.Insets min(androidx.core.graphics.Insets r5, androidx.core.graphics.Insets r6) {
            int r0 = r5.left
            int r1 = r6.left
            int r0 = java.lang.Math.min(r0, r1)
            int r1 = r5.top
            int r2 = r6.top
            int r1 = java.lang.Math.min(r1, r2)
            int r2 = r5.right
            int r3 = r6.right
            int r2 = java.lang.Math.min(r2, r3)
            int r3 = r5.bottom
            int r4 = r6.bottom
            int r3 = java.lang.Math.min(r3, r4)
            androidx.core.graphics.Insets r0 = of(r0, r1, r2, r3)
            return r0
    }

    public static androidx.core.graphics.Insets of(int r1, int r2, int r3, int r4) {
            if (r1 != 0) goto Lb
            if (r2 != 0) goto Lb
            if (r3 != 0) goto Lb
            if (r4 != 0) goto Lb
            androidx.core.graphics.Insets r0 = androidx.core.graphics.Insets.NONE
            return r0
        Lb:
            androidx.core.graphics.Insets r0 = new androidx.core.graphics.Insets
            r0.<init>(r1, r2, r3, r4)
            return r0
    }

    public static androidx.core.graphics.Insets of(android.graphics.Rect r4) {
            int r0 = r4.left
            int r1 = r4.top
            int r2 = r4.right
            int r3 = r4.bottom
            androidx.core.graphics.Insets r0 = of(r0, r1, r2, r3)
            return r0
    }

    public static androidx.core.graphics.Insets subtract(androidx.core.graphics.Insets r5, androidx.core.graphics.Insets r6) {
            int r0 = r5.left
            int r1 = r6.left
            int r0 = r0 - r1
            int r1 = r5.top
            int r2 = r6.top
            int r1 = r1 - r2
            int r2 = r5.right
            int r3 = r6.right
            int r2 = r2 - r3
            int r3 = r5.bottom
            int r4 = r6.bottom
            int r3 = r3 - r4
            androidx.core.graphics.Insets r0 = of(r0, r1, r2, r3)
            return r0
    }

    public static androidx.core.graphics.Insets toCompatInsets(android.graphics.Insets r4) {
            int r0 = r4.left
            int r1 = r4.top
            int r2 = r4.right
            int r3 = r4.bottom
            androidx.core.graphics.Insets r0 = of(r0, r1, r2, r3)
            return r0
    }

    @java.lang.Deprecated
    public static androidx.core.graphics.Insets wrap(android.graphics.Insets r1) {
            androidx.core.graphics.Insets r0 = toCompatInsets(r1)
            return r0
    }

    public boolean equals(java.lang.Object r6) {
            r5 = this;
            r0 = 1
            if (r5 != r6) goto L4
            return r0
        L4:
            r1 = 0
            if (r6 == 0) goto L32
            java.lang.Class r2 = r5.getClass()
            java.lang.Class r3 = r6.getClass()
            if (r2 == r3) goto L12
            goto L32
        L12:
            r2 = r6
            androidx.core.graphics.Insets r2 = (androidx.core.graphics.Insets) r2
            int r3 = r5.bottom
            int r4 = r2.bottom
            if (r3 == r4) goto L1c
            return r1
        L1c:
            int r3 = r5.left
            int r4 = r2.left
            if (r3 == r4) goto L23
            return r1
        L23:
            int r3 = r5.right
            int r4 = r2.right
            if (r3 == r4) goto L2a
            return r1
        L2a:
            int r3 = r5.top
            int r4 = r2.top
            if (r3 == r4) goto L31
            return r1
        L31:
            return r0
        L32:
            return r1
    }

    public int hashCode() {
            r3 = this;
            int r0 = r3.left
            int r1 = r0 * 31
            int r2 = r3.top
            int r1 = r1 + r2
            int r0 = r1 * 31
            int r2 = r3.right
            int r0 = r0 + r2
            int r1 = r0 * 31
            int r2 = r3.bottom
            int r1 = r1 + r2
            return r1
    }

    public android.graphics.Insets toPlatformInsets() {
            r4 = this;
            int r0 = r4.left
            int r1 = r4.top
            int r2 = r4.right
            int r3 = r4.bottom
            android.graphics.Insets r0 = androidx.core.graphics.Insets.Api29Impl.of(r0, r1, r2, r3)
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Insets{left="
            java.lang.StringBuilder r0 = r0.append(r1)
            int r1 = r2.left
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", top="
            java.lang.StringBuilder r0 = r0.append(r1)
            int r1 = r2.top
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", right="
            java.lang.StringBuilder r0 = r0.append(r1)
            int r1 = r2.right
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", bottom="
            java.lang.StringBuilder r0 = r0.append(r1)
            int r1 = r2.bottom
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
