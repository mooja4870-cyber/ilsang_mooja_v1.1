package kotlin.internal;

/* JADX INFO: compiled from: progressionUtil.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\u001a \u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\u0002\u001a \u0010\u0000\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005H\u0002\u001a \u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u0001H\u0001\u001a \u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H\u0001\u001a\u0018\u0010\n\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0002\u001a\u0018\u0010\n\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0005H\u0002¨\u0006\u000b"}, d2 = {"differenceModulo", "", "a", "b", "c", "", "getProgressionLastElement", "start", "end", "step", "mod", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class ProgressionUtilKt {
    private static final int differenceModulo(int r2, int r3, int r4) {
            int r0 = mod(r2, r4)
            int r1 = mod(r3, r4)
            int r0 = r0 - r1
            int r0 = mod(r0, r4)
            return r0
    }

    private static final long differenceModulo(long r4, long r6, long r8) {
            long r0 = mod(r4, r8)
            long r2 = mod(r6, r8)
            long r0 = r0 - r2
            long r0 = mod(r0, r8)
            return r0
    }

    public static final int getProgressionLastElement(int r2, int r3, int r4) {
            if (r4 <= 0) goto Ld
            if (r2 < r3) goto L6
            goto L11
        L6:
            int r0 = differenceModulo(r3, r2, r4)
            int r0 = r3 - r0
            goto L19
        Ld:
            if (r4 >= 0) goto L1a
            if (r2 > r3) goto L13
        L11:
            r0 = r3
            goto L19
        L13:
            int r0 = -r4
            int r0 = differenceModulo(r2, r3, r0)
            int r0 = r0 + r3
        L19:
            return r0
        L1a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Step is zero."
            r0.<init>(r1)
            throw r0
    }

    public static final long getProgressionLastElement(long r6, long r8, long r10) {
            r0 = 0
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 <= 0) goto L1b
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 < 0) goto Ld
            r2 = r10
            goto L24
        Ld:
            r4 = r8
            r8 = r6
            r6 = r4
            long r0 = differenceModulo(r6, r8, r10)
            r2 = r8
            r8 = r6
            r6 = r2
            r2 = r10
            long r10 = r8 - r0
            goto L2c
        L1b:
            r2 = r10
            int r10 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r10 >= 0) goto L2d
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 > 0) goto L26
        L24:
            r10 = r8
            goto L2c
        L26:
            long r10 = -r2
            long r10 = differenceModulo(r6, r8, r10)
            long r10 = r10 + r8
        L2c:
            return r10
        L2d:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r11 = "Step is zero."
            r10.<init>(r11)
            throw r10
    }

    private static final int mod(int r2, int r3) {
            int r0 = r2 % r3
            if (r0 < 0) goto L6
            r1 = r0
            goto L8
        L6:
            int r1 = r0 + r3
        L8:
            return r1
    }

    private static final long mod(long r4, long r6) {
            long r0 = r4 % r6
            r2 = 0
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 < 0) goto La
            r2 = r0
            goto Lc
        La:
            long r2 = r0 + r6
        Lc:
            return r2
    }
}
