package androidx.core.util;

/* JADX INFO: loaded from: classes.dex */
public final class Preconditions {
    private Preconditions() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void checkArgument(boolean r1) {
            if (r1 == 0) goto L3
            return
        L3:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
    }

    public static void checkArgument(boolean r2, java.lang.Object r3) {
            if (r2 == 0) goto L3
            return
        L3:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = java.lang.String.valueOf(r3)
            r0.<init>(r1)
            throw r0
    }

    public static void checkArgument(boolean r2, java.lang.String r3, java.lang.Object... r4) {
            if (r2 == 0) goto L3
            return
        L3:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = java.lang.String.format(r3, r4)
            r0.<init>(r1)
            throw r0
    }

    public static float checkArgumentFinite(float r3, java.lang.String r4) {
            boolean r0 = java.lang.Float.isNaN(r3)
            if (r0 != 0) goto L26
            boolean r0 = java.lang.Float.isInfinite(r3)
            if (r0 != 0) goto Ld
            return r3
        Ld:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r1 = r1.append(r4)
            java.lang.String r2 = " must not be infinite"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L26:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r1 = r1.append(r4)
            java.lang.String r2 = " must not be NaN"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public static double checkArgumentInRange(double r4, double r6, double r8, java.lang.String r10) {
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 < 0) goto L23
            int r0 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r0 > 0) goto L9
            return r4
        L9:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.util.Locale r1 = java.util.Locale.US
            java.lang.Double r2 = java.lang.Double.valueOf(r6)
            java.lang.Double r3 = java.lang.Double.valueOf(r8)
            java.lang.Object[] r2 = new java.lang.Object[]{r10, r2, r3}
            java.lang.String r3 = "%s is out of range of [%f, %f] (too high)"
            java.lang.String r1 = java.lang.String.format(r1, r3, r2)
            r0.<init>(r1)
            throw r0
        L23:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.util.Locale r1 = java.util.Locale.US
            java.lang.Double r2 = java.lang.Double.valueOf(r6)
            java.lang.Double r3 = java.lang.Double.valueOf(r8)
            java.lang.Object[] r2 = new java.lang.Object[]{r10, r2, r3}
            java.lang.String r3 = "%s is out of range of [%f, %f] (too low)"
            java.lang.String r1 = java.lang.String.format(r1, r3, r2)
            r0.<init>(r1)
            throw r0
    }

    public static float checkArgumentInRange(float r4, float r5, float r6, java.lang.String r7) {
            int r0 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r0 < 0) goto L23
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 > 0) goto L9
            return r4
        L9:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.util.Locale r1 = java.util.Locale.US
            java.lang.Float r2 = java.lang.Float.valueOf(r5)
            java.lang.Float r3 = java.lang.Float.valueOf(r6)
            java.lang.Object[] r2 = new java.lang.Object[]{r7, r2, r3}
            java.lang.String r3 = "%s is out of range of [%f, %f] (too high)"
            java.lang.String r1 = java.lang.String.format(r1, r3, r2)
            r0.<init>(r1)
            throw r0
        L23:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.util.Locale r1 = java.util.Locale.US
            java.lang.Float r2 = java.lang.Float.valueOf(r5)
            java.lang.Float r3 = java.lang.Float.valueOf(r6)
            java.lang.Object[] r2 = new java.lang.Object[]{r7, r2, r3}
            java.lang.String r3 = "%s is out of range of [%f, %f] (too low)"
            java.lang.String r1 = java.lang.String.format(r1, r3, r2)
            r0.<init>(r1)
            throw r0
    }

    public static int checkArgumentInRange(int r4, int r5, int r6, java.lang.String r7) {
            if (r4 < r5) goto L1f
            if (r4 > r6) goto L5
            return r4
        L5:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.util.Locale r1 = java.util.Locale.US
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r6)
            java.lang.Object[] r2 = new java.lang.Object[]{r7, r2, r3}
            java.lang.String r3 = "%s is out of range of [%d, %d] (too high)"
            java.lang.String r1 = java.lang.String.format(r1, r3, r2)
            r0.<init>(r1)
            throw r0
        L1f:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.util.Locale r1 = java.util.Locale.US
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r6)
            java.lang.Object[] r2 = new java.lang.Object[]{r7, r2, r3}
            java.lang.String r3 = "%s is out of range of [%d, %d] (too low)"
            java.lang.String r1 = java.lang.String.format(r1, r3, r2)
            r0.<init>(r1)
            throw r0
    }

    public static long checkArgumentInRange(long r4, long r6, long r8, java.lang.String r10) {
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 < 0) goto L23
            int r0 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r0 > 0) goto L9
            return r4
        L9:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.util.Locale r1 = java.util.Locale.US
            java.lang.Long r2 = java.lang.Long.valueOf(r6)
            java.lang.Long r3 = java.lang.Long.valueOf(r8)
            java.lang.Object[] r2 = new java.lang.Object[]{r10, r2, r3}
            java.lang.String r3 = "%s is out of range of [%d, %d] (too high)"
            java.lang.String r1 = java.lang.String.format(r1, r3, r2)
            r0.<init>(r1)
            throw r0
        L23:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.util.Locale r1 = java.util.Locale.US
            java.lang.Long r2 = java.lang.Long.valueOf(r6)
            java.lang.Long r3 = java.lang.Long.valueOf(r8)
            java.lang.Object[] r2 = new java.lang.Object[]{r10, r2, r3}
            java.lang.String r3 = "%s is out of range of [%d, %d] (too low)"
            java.lang.String r1 = java.lang.String.format(r1, r3, r2)
            r0.<init>(r1)
            throw r0
    }

    public static int checkArgumentNonnegative(int r1) {
            if (r1 < 0) goto L3
            return r1
        L3:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
    }

    public static int checkArgumentNonnegative(int r1, java.lang.String r2) {
            if (r1 < 0) goto L3
            return r1
        L3:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r2)
            throw r0
    }

    public static int checkFlagsArgument(int r3, int r4) {
            r0 = r3 & r4
            if (r0 != r3) goto L5
            return r3
        L5:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Requested flags 0x"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = java.lang.Integer.toHexString(r3)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = ", but only 0x"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = java.lang.Integer.toHexString(r4)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " are allowed"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public static <T> T checkNotNull(T r1) {
            if (r1 == 0) goto L3
            return r1
        L3:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>()
            throw r0
    }

    public static <T> T checkNotNull(T r2, java.lang.Object r3) {
            if (r2 == 0) goto L3
            return r2
        L3:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = java.lang.String.valueOf(r3)
            r0.<init>(r1)
            throw r0
    }

    public static void checkState(boolean r1) {
            r0 = 0
            checkState(r1, r0)
            return
    }

    public static void checkState(boolean r1, java.lang.String r2) {
            if (r1 == 0) goto L3
            return
        L3:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r2)
            throw r0
    }

    public static <T extends java.lang.CharSequence> T checkStringNotEmpty(T r1) {
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L7
            return r1
        L7:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
    }

    public static <T extends java.lang.CharSequence> T checkStringNotEmpty(T r2, java.lang.Object r3) {
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L7
            return r2
        L7:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = java.lang.String.valueOf(r3)
            r0.<init>(r1)
            throw r0
    }

    public static <T extends java.lang.CharSequence> T checkStringNotEmpty(T r2, java.lang.String r3, java.lang.Object... r4) {
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L7
            return r2
        L7:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = java.lang.String.format(r3, r4)
            r0.<init>(r1)
            throw r0
    }
}
