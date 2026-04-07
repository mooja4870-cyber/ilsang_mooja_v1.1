package kotlin;

/* JADX INFO: compiled from: FloorDivMod.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\b\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\t\n\u0002\u0010\n\n\u0000\n\u0002\u0010\u0006\n\u0002\u0010\u0007\n\u0000\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0087\b\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0001H\u0087\b\u001a\u0015\u0010\u0000\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0087\b\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0005H\u0087\b\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0087\b\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0087\b\u001a\u0015\u0010\u0000\u001a\u00020\u0004*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0087\b\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0005H\u0087\b\u001a\u0015\u0010\u0000\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0087\b\u001a\u0015\u0010\u0000\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0001H\u0087\b\u001a\u0015\u0010\u0000\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004H\u0087\b\u001a\u0015\u0010\u0000\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0005H\u0087\b\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0087\b\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0001H\u0087\b\u001a\u0015\u0010\u0000\u001a\u00020\u0004*\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0004H\u0087\b\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0005H\u0087\b\u001a\u0015\u0010\u0006\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0087\b\u001a\u0015\u0010\u0006\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0001H\u0087\b\u001a\u0015\u0010\u0006\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0087\b\u001a\u0015\u0010\u0006\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0005H\u0087\b\u001a\u0015\u0010\u0006\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0007H\u0087\b\u001a\u0015\u0010\u0006\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u0003\u001a\u00020\bH\u0087\b\u001a\u0015\u0010\u0006\u001a\u00020\u0007*\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0007H\u0087\b\u001a\u0015\u0010\u0006\u001a\u00020\b*\u00020\b2\u0006\u0010\u0003\u001a\u00020\bH\u0087\b\u001a\u0015\u0010\u0006\u001a\u00020\u0002*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0087\b\u001a\u0015\u0010\u0006\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0087\b\u001a\u0015\u0010\u0006\u001a\u00020\u0004*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0087\b\u001a\u0015\u0010\u0006\u001a\u00020\u0005*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0005H\u0087\b\u001a\u0015\u0010\u0006\u001a\u00020\u0002*\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0087\b\u001a\u0015\u0010\u0006\u001a\u00020\u0001*\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0001H\u0087\b\u001a\u0015\u0010\u0006\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004H\u0087\b\u001a\u0015\u0010\u0006\u001a\u00020\u0005*\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0005H\u0087\b\u001a\u0015\u0010\u0006\u001a\u00020\u0002*\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0087\b\u001a\u0015\u0010\u0006\u001a\u00020\u0001*\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0001H\u0087\b\u001a\u0015\u0010\u0006\u001a\u00020\u0004*\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0004H\u0087\b\u001a\u0015\u0010\u0006\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0005H\u0087\b¨\u0006\t"}, d2 = {"floorDiv", "", "", "other", "", "", "mod", "", "", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/NumbersKt")
class NumbersKt__FloorDivModKt extends kotlin.NumbersKt__BigIntegersKt {
    public NumbersKt__FloorDivModKt() {
            r0 = this;
            r0.<init>()
            return
    }

    private static final int floorDiv(byte r2, byte r3) {
            int r0 = r2 / r3
            r1 = r2 ^ r3
            if (r1 >= 0) goto Lc
            int r1 = r0 * r3
            if (r1 == r2) goto Lc
            int r0 = r0 + (-1)
        Lc:
            return r0
    }

    private static final int floorDiv(byte r2, int r3) {
            int r0 = r2 / r3
            r1 = r2 ^ r3
            if (r1 >= 0) goto Lc
            int r1 = r0 * r3
            if (r1 == r2) goto Lc
            int r0 = r0 + (-1)
        Lc:
            return r0
    }

    private static final int floorDiv(byte r2, short r3) {
            int r0 = r2 / r3
            r1 = r2 ^ r3
            if (r1 >= 0) goto Lc
            int r1 = r0 * r3
            if (r1 == r2) goto Lc
            int r0 = r0 + (-1)
        Lc:
            return r0
    }

    private static final int floorDiv(int r2, byte r3) {
            int r0 = r2 / r3
            r1 = r2 ^ r3
            if (r1 >= 0) goto Lc
            int r1 = r0 * r3
            if (r1 == r2) goto Lc
            int r0 = r0 + (-1)
        Lc:
            return r0
    }

    private static final int floorDiv(int r2, int r3) {
            int r0 = r2 / r3
            r1 = r2 ^ r3
            if (r1 >= 0) goto Lc
            int r1 = r0 * r3
            if (r1 == r2) goto Lc
            int r0 = r0 + (-1)
        Lc:
            return r0
    }

    private static final int floorDiv(int r2, short r3) {
            int r0 = r2 / r3
            r1 = r2 ^ r3
            if (r1 >= 0) goto Lc
            int r1 = r0 * r3
            if (r1 == r2) goto Lc
            int r0 = r0 + (-1)
        Lc:
            return r0
    }

    private static final int floorDiv(short r2, byte r3) {
            int r0 = r2 / r3
            r1 = r2 ^ r3
            if (r1 >= 0) goto Lc
            int r1 = r0 * r3
            if (r1 == r2) goto Lc
            int r0 = r0 + (-1)
        Lc:
            return r0
    }

    private static final int floorDiv(short r2, int r3) {
            int r0 = r2 / r3
            r1 = r2 ^ r3
            if (r1 >= 0) goto Lc
            int r1 = r0 * r3
            if (r1 == r2) goto Lc
            int r0 = r0 + (-1)
        Lc:
            return r0
    }

    private static final int floorDiv(short r2, short r3) {
            int r0 = r2 / r3
            r1 = r2 ^ r3
            if (r1 >= 0) goto Lc
            int r1 = r0 * r3
            if (r1 == r2) goto Lc
            int r0 = r0 + (-1)
        Lc:
            return r0
    }

    private static final long floorDiv(byte r8, long r9) {
            long r0 = (long) r8
            long r2 = r0 / r9
            long r4 = r0 ^ r9
            r6 = 0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 >= 0) goto L14
            long r4 = r2 * r9
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 == 0) goto L14
            r0 = -1
            long r2 = r2 + r0
        L14:
            return r2
    }

    private static final long floorDiv(int r8, long r9) {
            long r0 = (long) r8
            long r2 = r0 / r9
            long r4 = r0 ^ r9
            r6 = 0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 >= 0) goto L14
            long r4 = r2 * r9
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 == 0) goto L14
            r0 = -1
            long r2 = r2 + r0
        L14:
            return r2
    }

    private static final long floorDiv(long r8, byte r10) {
            long r0 = (long) r10
            long r2 = r8 / r0
            long r4 = r8 ^ r0
            r6 = 0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 >= 0) goto L13
            long r0 = r0 * r2
            int r0 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r0 == 0) goto L13
            r0 = -1
            long r2 = r2 + r0
        L13:
            return r2
    }

    private static final long floorDiv(long r8, int r10) {
            long r0 = (long) r10
            long r2 = r8 / r0
            long r4 = r8 ^ r0
            r6 = 0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 >= 0) goto L13
            long r0 = r0 * r2
            int r0 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r0 == 0) goto L13
            r0 = -1
            long r2 = r2 + r0
        L13:
            return r2
    }

    private static final long floorDiv(long r6, long r8) {
            long r0 = r6 / r8
            long r2 = r6 ^ r8
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 >= 0) goto L13
            long r2 = r0 * r8
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 == 0) goto L13
            r2 = -1
            long r0 = r0 + r2
        L13:
            return r0
    }

    private static final long floorDiv(long r8, short r10) {
            long r0 = (long) r10
            long r2 = r8 / r0
            long r4 = r8 ^ r0
            r6 = 0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 >= 0) goto L13
            long r0 = r0 * r2
            int r0 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r0 == 0) goto L13
            r0 = -1
            long r2 = r2 + r0
        L13:
            return r2
    }

    private static final long floorDiv(short r8, long r9) {
            long r0 = (long) r8
            long r2 = r0 / r9
            long r4 = r0 ^ r9
            r6 = 0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 >= 0) goto L14
            long r4 = r2 * r9
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 == 0) goto L14
            r0 = -1
            long r2 = r2 + r0
        L14:
            return r2
    }

    private static final byte mod(byte r3, byte r4) {
            int r0 = r3 % r4
            r1 = r0 ^ r4
            int r2 = -r0
            r2 = r2 | r0
            r1 = r1 & r2
            int r1 = r1 >> 31
            r1 = r1 & r4
            int r0 = r0 + r1
            byte r0 = (byte) r0
            return r0
    }

    private static final byte mod(int r3, byte r4) {
            int r0 = r3 % r4
            r1 = r0 ^ r4
            int r2 = -r0
            r2 = r2 | r0
            r1 = r1 & r2
            int r1 = r1 >> 31
            r1 = r1 & r4
            int r0 = r0 + r1
            byte r0 = (byte) r0
            return r0
    }

    private static final byte mod(long r8, byte r10) {
            long r0 = (long) r10
            long r2 = r8 % r0
            long r4 = r2 ^ r0
            long r6 = -r2
            long r6 = r6 | r2
            long r4 = r4 & r6
            r6 = 63
            long r4 = r4 >> r6
            long r0 = r0 & r4
            long r2 = r2 + r0
            int r0 = (int) r2
            byte r0 = (byte) r0
            return r0
    }

    private static final byte mod(short r3, byte r4) {
            int r0 = r3 % r4
            r1 = r0 ^ r4
            int r2 = -r0
            r2 = r2 | r0
            r1 = r1 & r2
            int r1 = r1 >> 31
            r1 = r1 & r4
            int r0 = r0 + r1
            byte r0 = (byte) r0
            return r0
    }

    private static final double mod(double r9, double r11) {
            double r0 = r9 % r11
            r2 = 0
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r3 = 1
            r4 = 0
            if (r2 != 0) goto Lc
            r2 = r3
            goto Ld
        Lc:
            r2 = r4
        Ld:
            if (r2 != 0) goto L22
            double r5 = java.lang.Math.signum(r0)
            double r7 = java.lang.Math.signum(r11)
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 != 0) goto L1c
            goto L1d
        L1c:
            r3 = r4
        L1d:
            if (r3 != 0) goto L22
            double r2 = r0 + r11
            goto L23
        L22:
            r2 = r0
        L23:
            return r2
    }

    private static final double mod(double r11, float r13) {
            double r0 = (double) r13
            double r2 = r11 % r0
            r4 = 0
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r5 = 1
            r6 = 0
            if (r4 != 0) goto Ld
            r4 = r5
            goto Le
        Ld:
            r4 = r6
        Le:
            if (r4 != 0) goto L21
            double r7 = java.lang.Math.signum(r2)
            double r9 = java.lang.Math.signum(r0)
            int r4 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r4 != 0) goto L1d
            goto L1e
        L1d:
            r5 = r6
        L1e:
            if (r5 != 0) goto L21
            double r2 = r2 + r0
        L21:
            return r2
    }

    private static final double mod(float r9, double r10) {
            double r0 = (double) r9
            double r0 = r0 % r10
            r2 = 0
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r3 = 1
            r4 = 0
            if (r2 != 0) goto Lc
            r2 = r3
            goto Ld
        Lc:
            r2 = r4
        Ld:
            if (r2 != 0) goto L20
            double r5 = java.lang.Math.signum(r0)
            double r7 = java.lang.Math.signum(r10)
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 != 0) goto L1c
            goto L1d
        L1c:
            r3 = r4
        L1d:
            if (r3 != 0) goto L20
            double r0 = r0 + r10
        L20:
            return r0
    }

    private static final float mod(float r5, float r6) {
            float r0 = r5 % r6
            r1 = 0
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r2 = 1
            r3 = 0
            if (r1 != 0) goto Lb
            r1 = r2
            goto Lc
        Lb:
            r1 = r3
        Lc:
            if (r1 != 0) goto L21
            float r1 = java.lang.Math.signum(r0)
            float r4 = java.lang.Math.signum(r6)
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 != 0) goto L1b
            goto L1c
        L1b:
            r2 = r3
        L1c:
            if (r2 != 0) goto L21
            float r1 = r0 + r6
            goto L22
        L21:
            r1 = r0
        L22:
            return r1
    }

    private static final int mod(byte r3, int r4) {
            int r0 = r3 % r4
            r1 = r0 ^ r4
            int r2 = -r0
            r2 = r2 | r0
            r1 = r1 & r2
            int r1 = r1 >> 31
            r1 = r1 & r4
            int r0 = r0 + r1
            return r0
    }

    private static final int mod(int r3, int r4) {
            int r0 = r3 % r4
            r1 = r0 ^ r4
            int r2 = -r0
            r2 = r2 | r0
            r1 = r1 & r2
            int r1 = r1 >> 31
            r1 = r1 & r4
            int r1 = r1 + r0
            return r1
    }

    private static final int mod(long r8, int r10) {
            long r0 = (long) r10
            long r2 = r8 % r0
            long r4 = r2 ^ r0
            long r6 = -r2
            long r6 = r6 | r2
            long r4 = r4 & r6
            r6 = 63
            long r4 = r4 >> r6
            long r0 = r0 & r4
            long r2 = r2 + r0
            int r0 = (int) r2
            return r0
    }

    private static final int mod(short r3, int r4) {
            int r0 = r3 % r4
            r1 = r0 ^ r4
            int r2 = -r0
            r2 = r2 | r0
            r1 = r1 & r2
            int r1 = r1 >> 31
            r1 = r1 & r4
            int r0 = r0 + r1
            return r0
    }

    private static final long mod(byte r6, long r7) {
            long r0 = (long) r6
            long r0 = r0 % r7
            long r2 = r0 ^ r7
            long r4 = -r0
            long r4 = r4 | r0
            long r2 = r2 & r4
            r4 = 63
            long r2 = r2 >> r4
            long r2 = r2 & r7
            long r0 = r0 + r2
            return r0
    }

    private static final long mod(int r6, long r7) {
            long r0 = (long) r6
            long r0 = r0 % r7
            long r2 = r0 ^ r7
            long r4 = -r0
            long r4 = r4 | r0
            long r2 = r2 & r4
            r4 = 63
            long r2 = r2 >> r4
            long r2 = r2 & r7
            long r0 = r0 + r2
            return r0
    }

    private static final long mod(long r6, long r8) {
            long r0 = r6 % r8
            long r2 = r0 ^ r8
            long r4 = -r0
            long r4 = r4 | r0
            long r2 = r2 & r4
            r4 = 63
            long r2 = r2 >> r4
            long r2 = r2 & r8
            long r2 = r2 + r0
            return r2
    }

    private static final long mod(short r6, long r7) {
            long r0 = (long) r6
            long r0 = r0 % r7
            long r2 = r0 ^ r7
            long r4 = -r0
            long r4 = r4 | r0
            long r2 = r2 & r4
            r4 = 63
            long r2 = r2 >> r4
            long r2 = r2 & r7
            long r0 = r0 + r2
            return r0
    }

    private static final short mod(byte r3, short r4) {
            int r0 = r3 % r4
            r1 = r0 ^ r4
            int r2 = -r0
            r2 = r2 | r0
            r1 = r1 & r2
            int r1 = r1 >> 31
            r1 = r1 & r4
            int r0 = r0 + r1
            short r0 = (short) r0
            return r0
    }

    private static final short mod(int r3, short r4) {
            int r0 = r3 % r4
            r1 = r0 ^ r4
            int r2 = -r0
            r2 = r2 | r0
            r1 = r1 & r2
            int r1 = r1 >> 31
            r1 = r1 & r4
            int r0 = r0 + r1
            short r0 = (short) r0
            return r0
    }

    private static final short mod(long r8, short r10) {
            long r0 = (long) r10
            long r2 = r8 % r0
            long r4 = r2 ^ r0
            long r6 = -r2
            long r6 = r6 | r2
            long r4 = r4 & r6
            r6 = 63
            long r4 = r4 >> r6
            long r0 = r0 & r4
            long r2 = r2 + r0
            int r0 = (int) r2
            short r0 = (short) r0
            return r0
    }

    private static final short mod(short r3, short r4) {
            int r0 = r3 % r4
            r1 = r0 ^ r4
            int r2 = -r0
            r2 = r2 | r0
            r1 = r1 & r2
            int r1 = r1 >> 31
            r1 = r1 & r4
            int r0 = r0 + r1
            short r0 = (short) r0
            return r0
    }
}
