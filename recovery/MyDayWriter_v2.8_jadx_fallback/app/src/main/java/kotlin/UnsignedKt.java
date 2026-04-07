package kotlin;

/* JADX INFO: compiled from: UnsignedJVM.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\u001a\u0015\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0001¢\u0006\u0002\u0010\u0004\u001a\u0015\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0003H\u0001¢\u0006\u0002\u0010\u0007\u001a\u0016\u0010\b\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\tH\u0081\b¢\u0006\u0002\u0010\n\u001a\u0016\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\tH\u0081\b¢\u0006\u0002\u0010\f\u001a\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0001\u001a\u001f\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u001f\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\u0015\u0010\u0013\u001a\u0010\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u000eH\u0001\u001a\u0011\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u000eH\u0081\b\u001a\u0011\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0002\u001a\u00020\u000eH\u0081\b\u001a\u0011\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0002\u001a\u00020\u000eH\u0081\b\u001a\u0019\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0002\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u000eH\u0081\b\u001a\u0016\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u000eH\u0081\b¢\u0006\u0002\u0010\u001e\u001a\u0018\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00192\u0006\u0010\u0010\u001a\u00020\u0019H\u0001\u001a\u001f\u0010 \u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0006H\u0001¢\u0006\u0004\b!\u0010\"\u001a\u001f\u0010#\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0006H\u0001¢\u0006\u0004\b$\u0010\"\u001a\u0010\u0010%\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0019H\u0001\u001a\u0011\u0010&\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u0019H\u0081\b\u001a\u0011\u0010'\u001a\u00020\u001b2\u0006\u0010\u0002\u001a\u00020\u0019H\u0081\b\u001a\u0018\u0010'\u001a\u00020\u001b2\u0006\u0010\u0002\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u000eH\u0000¨\u0006("}, d2 = {"doubleToUInt", "Lkotlin/UInt;", "value", "", "(D)I", "doubleToULong", "Lkotlin/ULong;", "(D)J", "floatToUInt", "", "(F)I", "floatToULong", "(F)J", "uintCompare", "", "v1", "v2", "uintDivide", "uintDivide-J1ME1BU", "(II)I", "uintRemainder", "uintRemainder-J1ME1BU", "uintToDouble", "uintToFloat", "uintToLong", "", "uintToString", "", "base", "uintToULong", "(I)J", "ulongCompare", "ulongDivide", "ulongDivide-eb3DHEI", "(JJ)J", "ulongRemainder", "ulongRemainder-eb3DHEI", "ulongToDouble", "ulongToFloat", "ulongToString", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class UnsignedKt {
    public static final int doubleToUInt(double r4) {
            boolean r0 = java.lang.Double.isNaN(r4)
            r1 = 0
            if (r0 == 0) goto L9
            goto L3f
        L9:
            double r2 = uintToDouble(r1)
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 > 0) goto L12
            goto L3f
        L12:
            r1 = -1
            double r2 = uintToDouble(r1)
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 < 0) goto L1c
            goto L3f
        L1c:
            r0 = 4746794007244308480(0x41dfffffffc00000, double:2.147483647E9)
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 > 0) goto L2b
            int r0 = (int) r4
            int r1 = kotlin.UInt.m248constructorimpl(r0)
            goto L3f
        L2b:
            r0 = 2147483647(0x7fffffff, float:NaN)
            double r1 = (double) r0
            double r1 = r4 - r1
            int r1 = (int) r1
            int r1 = kotlin.UInt.m248constructorimpl(r1)
            int r0 = kotlin.UInt.m248constructorimpl(r0)
            int r1 = r1 + r0
            int r1 = kotlin.UInt.m248constructorimpl(r1)
        L3f:
            return r1
    }

    public static final long doubleToULong(double r5) {
            boolean r0 = java.lang.Double.isNaN(r5)
            r1 = 0
            if (r0 == 0) goto La
            goto L38
        La:
            double r3 = ulongToDouble(r1)
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 > 0) goto L13
            goto L38
        L13:
            r1 = -1
            double r3 = ulongToDouble(r1)
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 < 0) goto L1e
            goto L38
        L1e:
            r0 = 4890909195324358656(0x43e0000000000000, double:9.223372036854776E18)
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 >= 0) goto L2a
            long r0 = (long) r5
            long r1 = kotlin.ULong.m327constructorimpl(r0)
            goto L38
        L2a:
            double r0 = r5 - r0
            long r0 = (long) r0
            long r0 = kotlin.ULong.m327constructorimpl(r0)
            r2 = -9223372036854775808
            long r0 = r0 + r2
            long r1 = kotlin.ULong.m327constructorimpl(r0)
        L38:
            return r1
    }

    private static final int floatToUInt(float r2) {
            double r0 = (double) r2
            int r0 = doubleToUInt(r0)
            return r0
    }

    private static final long floatToULong(float r2) {
            double r0 = (double) r2
            long r0 = doubleToULong(r0)
            return r0
    }

    public static final int uintCompare(int r2, int r3) {
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r2 ^ r0
            r0 = r0 ^ r3
            int r0 = kotlin.jvm.internal.Intrinsics.compare(r1, r0)
            return r0
    }

    /* JADX INFO: renamed from: uintDivide-J1ME1BU, reason: not valid java name */
    public static final int m504uintDivideJ1ME1BU(int r6, int r7) {
            long r0 = (long) r6
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            long r4 = (long) r7
            long r2 = r2 & r4
            long r0 = r0 / r2
            int r0 = (int) r0
            int r0 = kotlin.UInt.m248constructorimpl(r0)
            return r0
    }

    /* JADX INFO: renamed from: uintRemainder-J1ME1BU, reason: not valid java name */
    public static final int m505uintRemainderJ1ME1BU(int r6, int r7) {
            long r0 = (long) r6
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            long r4 = (long) r7
            long r2 = r2 & r4
            long r0 = r0 % r2
            int r0 = (int) r0
            int r0 = kotlin.UInt.m248constructorimpl(r0)
            return r0
    }

    public static final double uintToDouble(int r6) {
            r0 = 2147483647(0x7fffffff, float:NaN)
            r0 = r0 & r6
            double r0 = (double) r0
            int r2 = r6 >>> 31
            int r2 = r2 << 30
            double r2 = (double) r2
            r4 = 2
            double r4 = (double) r4
            double r2 = r2 * r4
            double r0 = r0 + r2
            return r0
    }

    private static final float uintToFloat(int r2) {
            double r0 = uintToDouble(r2)
            float r0 = (float) r0
            return r0
    }

    private static final long uintToLong(int r4) {
            long r0 = (long) r4
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            return r0
    }

    private static final java.lang.String uintToString(int r4) {
            long r0 = (long) r4
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            java.lang.String r0 = java.lang.String.valueOf(r0)
            return r0
    }

    private static final java.lang.String uintToString(int r4, int r5) {
            long r0 = (long) r4
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            java.lang.String r0 = ulongToString(r0, r5)
            return r0
    }

    private static final long uintToULong(int r4) {
            long r0 = (long) r4
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            long r0 = kotlin.ULong.m327constructorimpl(r0)
            return r0
    }

    public static final int ulongCompare(long r4, long r6) {
            r0 = -9223372036854775808
            long r2 = r4 ^ r0
            long r0 = r0 ^ r6
            int r0 = kotlin.jvm.internal.Intrinsics.compare(r2, r0)
            return r0
    }

    /* JADX INFO: renamed from: ulongDivide-eb3DHEI, reason: not valid java name */
    public static final long m506ulongDivideeb3DHEI(long r13, long r15) {
            r0 = r13
            r2 = r15
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 >= 0) goto L16
            int r6 = androidx.collection.MutableFloatFloatMap$$ExternalSyntheticBackport0.m(r13, r15)
            if (r6 >= 0) goto Lf
            goto L11
        Lf:
            r4 = 1
        L11:
            long r4 = kotlin.ULong.m327constructorimpl(r4)
            return r4
        L16:
            int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r4 < 0) goto L21
            long r4 = r0 / r2
            long r4 = kotlin.ULong.m327constructorimpl(r4)
            return r4
        L21:
            r4 = 1
            long r5 = r0 >>> r4
            long r5 = r5 / r2
            long r5 = r5 << r4
            long r7 = r5 * r2
            long r7 = r0 - r7
            long r9 = kotlin.ULong.m327constructorimpl(r7)
            long r11 = kotlin.ULong.m327constructorimpl(r2)
            int r9 = androidx.collection.MutableFloatFloatMap$$ExternalSyntheticBackport0.m(r9, r11)
            if (r9 < 0) goto L39
            goto L3a
        L39:
            r4 = 0
        L3a:
            long r9 = (long) r4
            long r9 = r9 + r5
            long r9 = kotlin.ULong.m327constructorimpl(r9)
            return r9
    }

    /* JADX INFO: renamed from: ulongRemainder-eb3DHEI, reason: not valid java name */
    public static final long m507ulongRemaindereb3DHEI(long r14, long r16) {
            r0 = r14
            r2 = r16
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 >= 0) goto L18
            int r4 = androidx.collection.MutableFloatFloatMap$$ExternalSyntheticBackport0.m(r14, r16)
            if (r4 >= 0) goto L11
            r4 = r14
            goto L17
        L11:
            long r4 = r14 - r16
            long r4 = kotlin.ULong.m327constructorimpl(r4)
        L17:
            return r4
        L18:
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 < 0) goto L23
            long r4 = r0 % r2
            long r4 = kotlin.ULong.m327constructorimpl(r4)
            return r4
        L23:
            r6 = 1
            long r7 = r0 >>> r6
            long r7 = r7 / r2
            long r6 = r7 << r6
            long r8 = r6 * r2
            long r8 = r0 - r8
            long r10 = kotlin.ULong.m327constructorimpl(r8)
            long r12 = kotlin.ULong.m327constructorimpl(r2)
            int r10 = androidx.collection.MutableFloatFloatMap$$ExternalSyntheticBackport0.m(r10, r12)
            if (r10 < 0) goto L3c
            r4 = r2
        L3c:
            long r4 = r8 - r4
            long r4 = kotlin.ULong.m327constructorimpl(r4)
            return r4
    }

    public static final double ulongToDouble(long r4) {
            r0 = 11
            long r0 = r4 >>> r0
            double r0 = (double) r0
            r2 = 2048(0x800, float:2.87E-42)
            double r2 = (double) r2
            double r0 = r0 * r2
            r2 = 2047(0x7ff, double:1.0114E-320)
            long r2 = r2 & r4
            double r2 = (double) r2
            double r0 = r0 + r2
            return r0
    }

    private static final float ulongToFloat(long r2) {
            double r0 = ulongToDouble(r2)
            float r0 = (float) r0
            return r0
    }

    private static final java.lang.String ulongToString(long r1) {
            r0 = 10
            java.lang.String r0 = ulongToString(r1, r0)
            return r0
    }

    public static final java.lang.String ulongToString(long r8, int r10) {
            r0 = 0
            int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            java.lang.String r1 = "toString(...)"
            if (r0 < 0) goto L14
            int r0 = kotlin.text.CharsKt.checkRadix(r10)
            java.lang.String r0 = java.lang.Long.toString(r8, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
        L14:
            r0 = 1
            long r2 = r8 >>> r0
            long r4 = (long) r10
            long r2 = r2 / r4
            long r2 = r2 << r0
            long r4 = (long) r10
            long r4 = r4 * r2
            long r4 = r8 - r4
            long r6 = (long) r10
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 < 0) goto L28
            long r6 = (long) r10
            long r4 = r4 - r6
            r6 = 1
            long r2 = r2 + r6
        L28:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r6 = kotlin.text.CharsKt.checkRadix(r10)
            java.lang.String r6 = java.lang.Long.toString(r2, r6)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r1)
            java.lang.StringBuilder r0 = r0.append(r6)
            int r6 = kotlin.text.CharsKt.checkRadix(r10)
            java.lang.String r6 = java.lang.Long.toString(r4, r6)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r1)
            java.lang.StringBuilder r0 = r0.append(r6)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
