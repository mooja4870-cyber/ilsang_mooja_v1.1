package androidx.core.math;

/* JADX INFO: loaded from: classes.dex */
public class MathUtils {
    private MathUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static int addExact(int r5, int r6) {
            int r0 = r5 + r6
            r1 = 1
            r2 = 0
            if (r5 < 0) goto L8
            r3 = r1
            goto L9
        L8:
            r3 = r2
        L9:
            if (r6 < 0) goto Ld
            r4 = r1
            goto Le
        Ld:
            r4 = r2
        Le:
            if (r3 != r4) goto L24
            if (r5 < 0) goto L14
            r3 = r1
            goto L15
        L14:
            r3 = r2
        L15:
            if (r0 < 0) goto L18
            goto L19
        L18:
            r1 = r2
        L19:
            if (r3 != r1) goto L1c
            goto L24
        L1c:
            java.lang.ArithmeticException r1 = new java.lang.ArithmeticException
            java.lang.String r2 = "integer overflow"
            r1.<init>(r2)
            throw r1
        L24:
            return r0
    }

    public static long addExact(long r8, long r10) {
            long r0 = r8 + r10
            r2 = 0
            int r4 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            r5 = 1
            r6 = 0
            if (r4 < 0) goto Lc
            r4 = r5
            goto Ld
        Lc:
            r4 = r6
        Ld:
            int r7 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r7 < 0) goto L13
            r7 = r5
            goto L14
        L13:
            r7 = r6
        L14:
            if (r4 != r7) goto L2e
            int r4 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r4 < 0) goto L1c
            r4 = r5
            goto L1d
        L1c:
            r4 = r6
        L1d:
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 < 0) goto L22
            goto L23
        L22:
            r5 = r6
        L23:
            if (r4 != r5) goto L26
            goto L2e
        L26:
            java.lang.ArithmeticException r2 = new java.lang.ArithmeticException
            java.lang.String r3 = "integer overflow"
            r2.<init>(r3)
            throw r2
        L2e:
            return r0
    }

    public static double clamp(double r1, double r3, double r5) {
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 >= 0) goto L5
            return r3
        L5:
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 <= 0) goto La
            return r5
        La:
            return r1
    }

    public static float clamp(float r1, float r2, float r3) {
            int r0 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r0 >= 0) goto L5
            return r2
        L5:
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto La
            return r3
        La:
            return r1
    }

    public static int clamp(int r0, int r1, int r2) {
            if (r0 >= r1) goto L3
            return r1
        L3:
            if (r0 <= r2) goto L6
            return r2
        L6:
            return r0
    }

    public static long clamp(long r1, long r3, long r5) {
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 >= 0) goto L5
            return r3
        L5:
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 <= 0) goto La
            return r5
        La:
            return r1
    }

    public static int decrementExact(int r2) {
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r2 == r0) goto L7
            int r0 = r2 + (-1)
            return r0
        L7:
            java.lang.ArithmeticException r0 = new java.lang.ArithmeticException
            java.lang.String r1 = "integer overflow"
            r0.<init>(r1)
            throw r0
    }

    public static long decrementExact(long r2) {
            r0 = -9223372036854775808
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 == 0) goto Lb
            r0 = 1
            long r0 = r2 - r0
            return r0
        Lb:
            java.lang.ArithmeticException r0 = new java.lang.ArithmeticException
            java.lang.String r1 = "integer overflow"
            r0.<init>(r1)
            throw r0
    }

    public static int incrementExact(int r2) {
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r2 == r0) goto L8
            int r0 = r2 + 1
            return r0
        L8:
            java.lang.ArithmeticException r0 = new java.lang.ArithmeticException
            java.lang.String r1 = "integer overflow"
            r0.<init>(r1)
            throw r0
    }

    public static long incrementExact(long r2) {
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 == 0) goto Ld
            r0 = 1
            long r0 = r0 + r2
            return r0
        Ld:
            java.lang.ArithmeticException r0 = new java.lang.ArithmeticException
            java.lang.String r1 = "integer overflow"
            r0.<init>(r1)
            throw r0
    }

    public static int multiplyExact(int r3, int r4) {
            int r0 = r3 * r4
            if (r3 == 0) goto L17
            if (r4 == 0) goto L17
            int r1 = r0 / r3
            if (r1 != r4) goto Lf
            int r1 = r0 / r4
            if (r1 != r3) goto Lf
            goto L17
        Lf:
            java.lang.ArithmeticException r1 = new java.lang.ArithmeticException
            java.lang.String r2 = "integer overflow"
            r1.<init>(r2)
            throw r1
        L17:
            return r0
    }

    public static long multiplyExact(long r5, long r7) {
            long r0 = r5 * r7
            r2 = 0
            int r4 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r4 == 0) goto L21
            int r2 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r2 == 0) goto L21
            long r2 = r0 / r5
            int r2 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r2 != 0) goto L19
            long r2 = r0 / r7
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 != 0) goto L19
            goto L21
        L19:
            java.lang.ArithmeticException r2 = new java.lang.ArithmeticException
            java.lang.String r3 = "integer overflow"
            r2.<init>(r3)
            throw r2
        L21:
            return r0
    }

    public static int negateExact(int r2) {
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r2 == r0) goto L6
            int r0 = -r2
            return r0
        L6:
            java.lang.ArithmeticException r0 = new java.lang.ArithmeticException
            java.lang.String r1 = "integer overflow"
            r0.<init>(r1)
            throw r0
    }

    public static long negateExact(long r2) {
            r0 = -9223372036854775808
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 == 0) goto L8
            long r0 = -r2
            return r0
        L8:
            java.lang.ArithmeticException r0 = new java.lang.ArithmeticException
            java.lang.String r1 = "integer overflow"
            r0.<init>(r1)
            throw r0
    }

    public static int subtractExact(int r5, int r6) {
            int r0 = r5 - r6
            r1 = 1
            r2 = 0
            if (r5 >= 0) goto L8
            r3 = r1
            goto L9
        L8:
            r3 = r2
        L9:
            if (r6 >= 0) goto Ld
            r4 = r1
            goto Le
        Ld:
            r4 = r2
        Le:
            if (r3 == r4) goto L24
            if (r5 >= 0) goto L14
            r3 = r1
            goto L15
        L14:
            r3 = r2
        L15:
            if (r0 >= 0) goto L18
            goto L19
        L18:
            r1 = r2
        L19:
            if (r3 != r1) goto L1c
            goto L24
        L1c:
            java.lang.ArithmeticException r1 = new java.lang.ArithmeticException
            java.lang.String r2 = "integer overflow"
            r1.<init>(r2)
            throw r1
        L24:
            return r0
    }

    public static long subtractExact(long r8, long r10) {
            long r0 = r8 - r10
            r2 = 0
            int r4 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            r5 = 1
            r6 = 0
            if (r4 >= 0) goto Lc
            r4 = r5
            goto Ld
        Lc:
            r4 = r6
        Ld:
            int r7 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r7 >= 0) goto L13
            r7 = r5
            goto L14
        L13:
            r7 = r6
        L14:
            if (r4 == r7) goto L2e
            int r4 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r4 >= 0) goto L1c
            r4 = r5
            goto L1d
        L1c:
            r4 = r6
        L1d:
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 >= 0) goto L22
            goto L23
        L22:
            r5 = r6
        L23:
            if (r4 != r5) goto L26
            goto L2e
        L26:
            java.lang.ArithmeticException r2 = new java.lang.ArithmeticException
            java.lang.String r3 = "integer overflow"
            r2.<init>(r3)
            throw r2
        L2e:
            return r0
    }

    public static int toIntExact(long r2) {
            r0 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 > 0) goto L10
            r0 = -2147483648(0xffffffff80000000, double:NaN)
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 < 0) goto L10
            int r0 = (int) r2
            return r0
        L10:
            java.lang.ArithmeticException r0 = new java.lang.ArithmeticException
            java.lang.String r1 = "integer overflow"
            r0.<init>(r1)
            throw r0
    }
}
