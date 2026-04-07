package kotlin.random;

/* JADX INFO: compiled from: Random.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0004H\u0007\u001a\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0000\u001a\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\fH\u0000\u001a\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0003H\u0000\u001a\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0000\u001a\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0003H\u0000\u001a\u0014\u0010\u000f\u001a\u00020\u0003*\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u0011H\u0007\u001a\u0014\u0010\u0012\u001a\u00020\u0004*\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u0013H\u0007\u001a\u0014\u0010\u0014\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0003H\u0000¨\u0006\u0016"}, d2 = {"Random", "Lkotlin/random/Random;", "seed", "", "", "boundsErrorMessage", "", "from", "", "until", "checkRangeBounds", "", "", "fastLog2", "value", "nextInt", "range", "Lkotlin/ranges/IntRange;", "nextLong", "Lkotlin/ranges/LongRange;", "takeUpperBits", "bitCount", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class RandomKt {
    public static final kotlin.random.Random Random(int r2) {
            kotlin.random.XorWowRandom r0 = new kotlin.random.XorWowRandom
            int r1 = r2 >> 31
            r0.<init>(r2, r1)
            kotlin.random.Random r0 = (kotlin.random.Random) r0
            return r0
    }

    public static final kotlin.random.Random Random(long r4) {
            kotlin.random.XorWowRandom r0 = new kotlin.random.XorWowRandom
            int r1 = (int) r4
            r2 = 32
            long r2 = r4 >> r2
            int r2 = (int) r2
            r0.<init>(r1, r2)
            kotlin.random.Random r0 = (kotlin.random.Random) r0
            return r0
    }

    public static final java.lang.String boundsErrorMessage(java.lang.Object r2, java.lang.Object r3) {
            java.lang.String r0 = "from"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "until"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Random range is empty: ["
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r1 = ", "
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.String r1 = ")."
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public static final void checkRangeBounds(double r3, double r5) {
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 <= 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            if (r0 == 0) goto La
            return
        La:
            r0 = 0
            java.lang.Double r1 = java.lang.Double.valueOf(r3)
            java.lang.Double r2 = java.lang.Double.valueOf(r5)
            java.lang.String r0 = boundsErrorMessage(r1, r2)
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
    }

    public static final void checkRangeBounds(int r3, int r4) {
            if (r4 <= r3) goto L4
            r0 = 1
            goto L5
        L4:
            r0 = 0
        L5:
            if (r0 == 0) goto L8
            return
        L8:
            r0 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            java.lang.String r0 = boundsErrorMessage(r1, r2)
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
    }

    public static final void checkRangeBounds(long r3, long r5) {
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 <= 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            if (r0 == 0) goto La
            return
        La:
            r0 = 0
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            java.lang.Long r2 = java.lang.Long.valueOf(r5)
            java.lang.String r0 = boundsErrorMessage(r1, r2)
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
    }

    public static final int fastLog2(int r1) {
            int r0 = java.lang.Integer.numberOfLeadingZeros(r1)
            int r0 = 31 - r0
            return r0
    }

    public static final int nextInt(kotlin.random.Random r3, kotlin.ranges.IntRange r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "range"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L47
            int r0 = r4.getLast()
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r0 >= r1) goto L29
            int r0 = r4.getFirst()
            int r1 = r4.getLast()
            int r1 = r1 + 1
            int r0 = r3.nextInt(r0, r1)
            goto L46
        L29:
            int r0 = r4.getFirst()
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 <= r1) goto L42
            int r0 = r4.getFirst()
            int r0 = r0 + (-1)
            int r1 = r4.getLast()
            int r0 = r3.nextInt(r0, r1)
            int r0 = r0 + 1
            goto L46
        L42:
            int r0 = r3.nextInt()
        L46:
            return r0
        L47:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Cannot get random in empty range: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r4)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public static final long nextLong(kotlin.random.Random r7, kotlin.ranges.LongRange r8) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "range"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            boolean r0 = r8.isEmpty()
            if (r0 != 0) goto L4d
            long r0 = r8.getLast()
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 1
            if (r0 >= 0) goto L2e
            long r3 = r8.getFirst()
            long r5 = r8.getLast()
            long r5 = r5 + r1
            long r0 = r7.nextLong(r3, r5)
            goto L4c
        L2e:
            long r3 = r8.getFirst()
            r5 = -9223372036854775808
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 <= 0) goto L48
            long r3 = r8.getFirst()
            long r3 = r3 - r1
            long r5 = r8.getLast()
            long r3 = r7.nextLong(r3, r5)
            long r0 = r3 + r1
            goto L4c
        L48:
            long r0 = r7.nextLong()
        L4c:
            return r0
        L4d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Cannot get random in empty range: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r8)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public static final int takeUpperBits(int r2, int r3) {
            int r0 = 32 - r3
            int r0 = r2 >>> r0
            int r1 = -r3
            int r1 = r1 >> 31
            r0 = r0 & r1
            return r0
    }
}
