package kotlin.internal;

/* JADX INFO: compiled from: UProgressionUtil.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a'\u0010\u0000\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\t\u001a'\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u000f\u0010\u0006\u001a'\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0011\u0010\t¨\u0006\u0012"}, d2 = {"differenceModulo", "Lkotlin/UInt;", "a", "b", "c", "differenceModulo-WZ9TVnA", "(III)I", "Lkotlin/ULong;", "differenceModulo-sambcqE", "(JJJ)J", "getProgressionLastElement", "start", "end", "step", "", "getProgressionLastElement-Nkh28Cs", "", "getProgressionLastElement-7ftBX0g", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class UProgressionUtilKt {
    /* JADX INFO: renamed from: differenceModulo-WZ9TVnA, reason: not valid java name */
    private static final int m1359differenceModuloWZ9TVnA(int r3, int r4, int r5) {
            int r0 = kotlin.UByte$$ExternalSyntheticBackport1.m(r3, r5)
            int r1 = kotlin.UByte$$ExternalSyntheticBackport1.m(r4, r5)
            int r2 = kotlin.UByte$$ExternalSyntheticBackport4.m(r0, r1)
            if (r2 < 0) goto L11
            int r2 = r0 - r1
            goto L18
        L11:
            int r2 = r0 - r1
            int r2 = kotlin.UInt.m248constructorimpl(r2)
            int r2 = r2 + r5
        L18:
            int r2 = kotlin.UInt.m248constructorimpl(r2)
            return r2
    }

    /* JADX INFO: renamed from: differenceModulo-sambcqE, reason: not valid java name */
    private static final long m1360differenceModulosambcqE(long r6, long r8, long r10) {
            long r0 = kotlin.UByte$$ExternalSyntheticBackport2.m(r6, r10)
            long r2 = kotlin.UByte$$ExternalSyntheticBackport2.m(r8, r10)
            int r4 = androidx.collection.MutableFloatFloatMap$$ExternalSyntheticBackport0.m(r0, r2)
            if (r4 < 0) goto L11
            long r4 = r0 - r2
            goto L18
        L11:
            long r4 = r0 - r2
            long r4 = kotlin.ULong.m327constructorimpl(r4)
            long r4 = r4 + r10
        L18:
            long r4 = kotlin.ULong.m327constructorimpl(r4)
            return r4
    }

    /* JADX INFO: renamed from: getProgressionLastElement-7ftBX0g, reason: not valid java name */
    public static final long m1361getProgressionLastElement7ftBX0g(long r7, long r9, long r11) {
            r0 = 0
            int r2 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r2 <= 0) goto L20
            int r0 = androidx.collection.MutableFloatFloatMap$$ExternalSyntheticBackport0.m(r7, r9)
            if (r0 < 0) goto Lf
            r3 = r7
            goto L2b
        Lf:
            long r5 = kotlin.ULong.m327constructorimpl(r11)
            r3 = r7
            r1 = r9
            long r7 = m1360differenceModulosambcqE(r1, r3, r5)
            long r7 = r9 - r7
            long r7 = kotlin.ULong.m327constructorimpl(r7)
            goto L3f
        L20:
            r3 = r7
            int r7 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r7 >= 0) goto L40
            int r7 = androidx.collection.MutableFloatFloatMap$$ExternalSyntheticBackport0.m(r3, r9)
            if (r7 > 0) goto L2d
        L2b:
            r7 = r9
            goto L3f
        L2d:
            long r7 = -r11
            long r7 = kotlin.ULong.m327constructorimpl(r7)
            r0 = r3
            r4 = r7
            r2 = r9
            long r7 = m1360differenceModulosambcqE(r0, r2, r4)
            r3 = r0
            long r7 = r7 + r9
            long r7 = kotlin.ULong.m327constructorimpl(r7)
        L3f:
            return r7
        L40:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "Step is zero."
            r7.<init>(r8)
            throw r7
    }

    /* JADX INFO: renamed from: getProgressionLastElement-Nkh28Cs, reason: not valid java name */
    public static final int m1362getProgressionLastElementNkh28Cs(int r2, int r3, int r4) {
            if (r4 <= 0) goto L19
            int r0 = kotlin.UByte$$ExternalSyntheticBackport4.m(r2, r3)
            if (r0 < 0) goto La
            goto L21
        La:
            int r0 = kotlin.UInt.m248constructorimpl(r4)
            int r0 = m1359differenceModuloWZ9TVnA(r3, r2, r0)
            int r0 = r3 - r0
            int r0 = kotlin.UInt.m248constructorimpl(r0)
            goto L31
        L19:
            if (r4 >= 0) goto L32
            int r0 = kotlin.UByte$$ExternalSyntheticBackport4.m(r2, r3)
            if (r0 > 0) goto L23
        L21:
            r0 = r3
            goto L31
        L23:
            int r0 = -r4
            int r0 = kotlin.UInt.m248constructorimpl(r0)
            int r0 = m1359differenceModuloWZ9TVnA(r2, r3, r0)
            int r0 = r0 + r3
            int r0 = kotlin.UInt.m248constructorimpl(r0)
        L31:
            return r0
        L32:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Step is zero."
            r0.<init>(r1)
            throw r0
    }
}
