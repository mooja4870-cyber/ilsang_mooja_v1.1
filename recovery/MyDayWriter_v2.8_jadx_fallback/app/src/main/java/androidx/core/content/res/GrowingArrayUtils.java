package androidx.core.content.res;

/* JADX INFO: loaded from: classes.dex */
final class GrowingArrayUtils {
    private GrowingArrayUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static int[] append(int[] r2, int r3, int r4) {
            int r0 = r3 + 1
            int r1 = r2.length
            if (r0 <= r1) goto L10
            int r0 = growSize(r3)
            int[] r0 = new int[r0]
            r1 = 0
            java.lang.System.arraycopy(r2, r1, r0, r1, r3)
            r2 = r0
        L10:
            r2[r3] = r4
            return r2
    }

    public static long[] append(long[] r2, int r3, long r4) {
            int r0 = r3 + 1
            int r1 = r2.length
            if (r0 <= r1) goto L10
            int r0 = growSize(r3)
            long[] r0 = new long[r0]
            r1 = 0
            java.lang.System.arraycopy(r2, r1, r0, r1, r3)
            r2 = r0
        L10:
            r2[r3] = r4
            return r2
    }

    public static <T> T[] append(T[] r2, int r3, T r4) {
            int r0 = r3 + 1
            int r1 = r2.length
            if (r0 <= r1) goto L1c
            java.lang.Class r0 = r2.getClass()
            java.lang.Class r0 = r0.getComponentType()
            int r1 = growSize(r3)
            java.lang.Object r0 = java.lang.reflect.Array.newInstance(r0, r1)
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            r1 = 0
            java.lang.System.arraycopy(r2, r1, r0, r1, r3)
            r2 = r0
        L1c:
            r2[r3] = r4
            return r2
    }

    public static boolean[] append(boolean[] r2, int r3, boolean r4) {
            int r0 = r3 + 1
            int r1 = r2.length
            if (r0 <= r1) goto L10
            int r0 = growSize(r3)
            boolean[] r0 = new boolean[r0]
            r1 = 0
            java.lang.System.arraycopy(r2, r1, r0, r1, r3)
            r2 = r0
        L10:
            r2[r3] = r4
            return r2
    }

    public static int growSize(int r1) {
            r0 = 4
            if (r1 > r0) goto L6
            r0 = 8
            goto L8
        L6:
            int r0 = r1 * 2
        L8:
            return r0
    }

    public static int[] insert(int[] r3, int r4, int r5, int r6) {
            int r0 = r4 + 1
            int r1 = r3.length
            if (r0 > r1) goto Lf
            int r0 = r5 + 1
            int r1 = r4 - r5
            java.lang.System.arraycopy(r3, r5, r3, r0, r1)
            r3[r5] = r6
            return r3
        Lf:
            int r0 = growSize(r4)
            int[] r0 = new int[r0]
            r1 = 0
            java.lang.System.arraycopy(r3, r1, r0, r1, r5)
            r0[r5] = r6
            int r1 = r5 + 1
            int r2 = r3.length
            int r2 = r2 - r5
            java.lang.System.arraycopy(r3, r5, r0, r1, r2)
            return r0
    }

    public static long[] insert(long[] r3, int r4, int r5, long r6) {
            int r0 = r4 + 1
            int r1 = r3.length
            if (r0 > r1) goto Lf
            int r0 = r5 + 1
            int r1 = r4 - r5
            java.lang.System.arraycopy(r3, r5, r3, r0, r1)
            r3[r5] = r6
            return r3
        Lf:
            int r0 = growSize(r4)
            long[] r0 = new long[r0]
            r1 = 0
            java.lang.System.arraycopy(r3, r1, r0, r1, r5)
            r0[r5] = r6
            int r1 = r5 + 1
            int r2 = r3.length
            int r2 = r2 - r5
            java.lang.System.arraycopy(r3, r5, r0, r1, r2)
            return r0
    }

    public static <T> T[] insert(T[] r3, int r4, int r5, T r6) {
            int r0 = r4 + 1
            int r1 = r3.length
            if (r0 > r1) goto Lf
            int r0 = r5 + 1
            int r1 = r4 - r5
            java.lang.System.arraycopy(r3, r5, r3, r0, r1)
            r3[r5] = r6
            return r3
        Lf:
            java.lang.Class r0 = r3.getClass()
            java.lang.Class r0 = r0.getComponentType()
            int r1 = growSize(r4)
            java.lang.Object r0 = java.lang.reflect.Array.newInstance(r0, r1)
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            r1 = 0
            java.lang.System.arraycopy(r3, r1, r0, r1, r5)
            r0[r5] = r6
            int r1 = r5 + 1
            int r2 = r3.length
            int r2 = r2 - r5
            java.lang.System.arraycopy(r3, r5, r0, r1, r2)
            return r0
    }

    public static boolean[] insert(boolean[] r3, int r4, int r5, boolean r6) {
            int r0 = r4 + 1
            int r1 = r3.length
            if (r0 > r1) goto Lf
            int r0 = r5 + 1
            int r1 = r4 - r5
            java.lang.System.arraycopy(r3, r5, r3, r0, r1)
            r3[r5] = r6
            return r3
        Lf:
            int r0 = growSize(r4)
            boolean[] r0 = new boolean[r0]
            r1 = 0
            java.lang.System.arraycopy(r3, r1, r0, r1, r5)
            r0[r5] = r6
            int r1 = r5 + 1
            int r2 = r3.length
            int r2 = r2 - r5
            java.lang.System.arraycopy(r3, r5, r0, r1, r2)
            return r0
    }
}
