package kotlin.collections;

/* JADX INFO: compiled from: UArraySorting.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0010\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\t\u0010\n\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\f\u0010\r\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u000f\u0010\u0010\u001a'\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u0013\u0010\u0014\u001a'\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u0015\u0010\u0016\u001a'\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u0017\u0010\u0018\u001a'\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u0019\u0010\u001a\u001a'\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\u001e\u0010\u0014\u001a'\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\u001f\u0010\u0016\u001a'\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0001¢\u0006\u0004\b \u0010\u0018\u001a'\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0001¢\u0006\u0004\b!\u0010\u001a¨\u0006\""}, d2 = {"partition", "", "array", "Lkotlin/UByteArray;", "left", "right", "partition-4UcCI2c", "([BII)I", "Lkotlin/UIntArray;", "partition-oBK06Vg", "([III)I", "Lkotlin/ULongArray;", "partition--nroSd4", "([JII)I", "Lkotlin/UShortArray;", "partition-Aa5vz7o", "([SII)I", "quickSort", "", "quickSort-4UcCI2c", "([BII)V", "quickSort-oBK06Vg", "([III)V", "quickSort--nroSd4", "([JII)V", "quickSort-Aa5vz7o", "([SII)V", "sortArray", "fromIndex", "toIndex", "sortArray-4UcCI2c", "sortArray-oBK06Vg", "sortArray--nroSd4", "sortArray-Aa5vz7o", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class UArraySortingKt {
    /* JADX INFO: renamed from: partition--nroSd4, reason: not valid java name */
    private static final int m608partitionnroSd4(long[] r8, int r9, int r10) {
            r0 = r9
            r1 = r10
            int r2 = r9 + r10
            int r2 = r2 / 2
            long r2 = kotlin.ULongArray.m387getsVKNKU(r8, r2)
        La:
            if (r0 > r1) goto L3c
        Lc:
            long r4 = kotlin.ULongArray.m387getsVKNKU(r8, r0)
            int r4 = androidx.collection.MutableFloatFloatMap$$ExternalSyntheticBackport0.m(r4, r2)
            if (r4 >= 0) goto L19
            int r0 = r0 + 1
            goto Lc
        L19:
            long r4 = kotlin.ULongArray.m387getsVKNKU(r8, r1)
            int r4 = androidx.collection.MutableFloatFloatMap$$ExternalSyntheticBackport0.m(r4, r2)
            if (r4 <= 0) goto L26
            int r1 = r1 + (-1)
            goto L19
        L26:
            if (r0 > r1) goto La
            long r4 = kotlin.ULongArray.m387getsVKNKU(r8, r0)
            long r6 = kotlin.ULongArray.m387getsVKNKU(r8, r1)
            kotlin.ULongArray.m392setk8EXiF4(r8, r0, r6)
            kotlin.ULongArray.m392setk8EXiF4(r8, r1, r4)
            int r0 = r0 + 1
            int r1 = r1 + (-1)
            goto La
        L3c:
            return r0
    }

    /* JADX INFO: renamed from: partition-4UcCI2c, reason: not valid java name */
    private static final int m609partition4UcCI2c(byte[] r5, int r6, int r7) {
            r0 = r6
            r1 = r7
            int r2 = r6 + r7
            int r2 = r2 / 2
            byte r2 = kotlin.UByteArray.m229getw2LRezQ(r5, r2)
        La:
            if (r0 > r1) goto L44
        Lc:
            byte r3 = kotlin.UByteArray.m229getw2LRezQ(r5, r0)
            r3 = r3 & 255(0xff, float:3.57E-43)
            r4 = r2 & 255(0xff, float:3.57E-43)
            int r3 = kotlin.jvm.internal.Intrinsics.compare(r3, r4)
            if (r3 >= 0) goto L1d
            int r0 = r0 + 1
            goto Lc
        L1d:
            byte r3 = kotlin.UByteArray.m229getw2LRezQ(r5, r1)
            r3 = r3 & 255(0xff, float:3.57E-43)
            r4 = r2 & 255(0xff, float:3.57E-43)
            int r3 = kotlin.jvm.internal.Intrinsics.compare(r3, r4)
            if (r3 <= 0) goto L2e
            int r1 = r1 + (-1)
            goto L1d
        L2e:
            if (r0 > r1) goto La
            byte r3 = kotlin.UByteArray.m229getw2LRezQ(r5, r0)
            byte r4 = kotlin.UByteArray.m229getw2LRezQ(r5, r1)
            kotlin.UByteArray.m234setVurrAj0(r5, r0, r4)
            kotlin.UByteArray.m234setVurrAj0(r5, r1, r3)
            int r0 = r0 + 1
            int r1 = r1 + (-1)
            goto La
        L44:
            return r0
    }

    /* JADX INFO: renamed from: partition-Aa5vz7o, reason: not valid java name */
    private static final int m610partitionAa5vz7o(short[] r6, int r7, int r8) {
            r0 = r7
            r1 = r8
            int r2 = r7 + r8
            int r2 = r2 / 2
            short r2 = kotlin.UShortArray.m492getMh2AYeg(r6, r2)
        La:
            if (r0 > r1) goto L45
        Lc:
            short r3 = kotlin.UShortArray.m492getMh2AYeg(r6, r0)
            r4 = 65535(0xffff, float:9.1834E-41)
            r3 = r3 & r4
            r5 = r2 & r4
            int r3 = kotlin.jvm.internal.Intrinsics.compare(r3, r5)
            if (r3 >= 0) goto L1f
            int r0 = r0 + 1
            goto Lc
        L1f:
            short r3 = kotlin.UShortArray.m492getMh2AYeg(r6, r1)
            r3 = r3 & r4
            r5 = r2 & r4
            int r3 = kotlin.jvm.internal.Intrinsics.compare(r3, r5)
            if (r3 <= 0) goto L2f
            int r1 = r1 + (-1)
            goto L1f
        L2f:
            if (r0 > r1) goto La
            short r3 = kotlin.UShortArray.m492getMh2AYeg(r6, r0)
            short r4 = kotlin.UShortArray.m492getMh2AYeg(r6, r1)
            kotlin.UShortArray.m497set01HTLdE(r6, r0, r4)
            kotlin.UShortArray.m497set01HTLdE(r6, r1, r3)
            int r0 = r0 + 1
            int r1 = r1 + (-1)
            goto La
        L45:
            return r0
    }

    /* JADX INFO: renamed from: partition-oBK06Vg, reason: not valid java name */
    private static final int m611partitionoBK06Vg(int[] r5, int r6, int r7) {
            r0 = r6
            r1 = r7
            int r2 = r6 + r7
            int r2 = r2 / 2
            int r2 = kotlin.UIntArray.m308getpVg5ArA(r5, r2)
        La:
            if (r0 > r1) goto L3c
        Lc:
            int r3 = kotlin.UIntArray.m308getpVg5ArA(r5, r0)
            int r3 = kotlin.UByte$$ExternalSyntheticBackport4.m(r3, r2)
            if (r3 >= 0) goto L19
            int r0 = r0 + 1
            goto Lc
        L19:
            int r3 = kotlin.UIntArray.m308getpVg5ArA(r5, r1)
            int r3 = kotlin.UByte$$ExternalSyntheticBackport4.m(r3, r2)
            if (r3 <= 0) goto L26
            int r1 = r1 + (-1)
            goto L19
        L26:
            if (r0 > r1) goto La
            int r3 = kotlin.UIntArray.m308getpVg5ArA(r5, r0)
            int r4 = kotlin.UIntArray.m308getpVg5ArA(r5, r1)
            kotlin.UIntArray.m313setVXSXFK8(r5, r0, r4)
            kotlin.UIntArray.m313setVXSXFK8(r5, r1, r3)
            int r0 = r0 + 1
            int r1 = r1 + (-1)
            goto La
        L3c:
            return r0
    }

    /* JADX INFO: renamed from: quickSort--nroSd4, reason: not valid java name */
    private static final void m612quickSortnroSd4(long[] r2, int r3, int r4) {
            int r0 = m608partitionnroSd4(r2, r3, r4)
            int r1 = r0 + (-1)
            if (r3 >= r1) goto Ld
            int r1 = r0 + (-1)
            m612quickSortnroSd4(r2, r3, r1)
        Ld:
            if (r0 >= r4) goto L12
            m612quickSortnroSd4(r2, r0, r4)
        L12:
            return
    }

    /* JADX INFO: renamed from: quickSort-4UcCI2c, reason: not valid java name */
    private static final void m613quickSort4UcCI2c(byte[] r2, int r3, int r4) {
            int r0 = m609partition4UcCI2c(r2, r3, r4)
            int r1 = r0 + (-1)
            if (r3 >= r1) goto Ld
            int r1 = r0 + (-1)
            m613quickSort4UcCI2c(r2, r3, r1)
        Ld:
            if (r0 >= r4) goto L12
            m613quickSort4UcCI2c(r2, r0, r4)
        L12:
            return
    }

    /* JADX INFO: renamed from: quickSort-Aa5vz7o, reason: not valid java name */
    private static final void m614quickSortAa5vz7o(short[] r2, int r3, int r4) {
            int r0 = m610partitionAa5vz7o(r2, r3, r4)
            int r1 = r0 + (-1)
            if (r3 >= r1) goto Ld
            int r1 = r0 + (-1)
            m614quickSortAa5vz7o(r2, r3, r1)
        Ld:
            if (r0 >= r4) goto L12
            m614quickSortAa5vz7o(r2, r0, r4)
        L12:
            return
    }

    /* JADX INFO: renamed from: quickSort-oBK06Vg, reason: not valid java name */
    private static final void m615quickSortoBK06Vg(int[] r2, int r3, int r4) {
            int r0 = m611partitionoBK06Vg(r2, r3, r4)
            int r1 = r0 + (-1)
            if (r3 >= r1) goto Ld
            int r1 = r0 + (-1)
            m615quickSortoBK06Vg(r2, r3, r1)
        Ld:
            if (r0 >= r4) goto L12
            m615quickSortoBK06Vg(r2, r0, r4)
        L12:
            return
    }

    /* JADX INFO: renamed from: sortArray--nroSd4, reason: not valid java name */
    public static final void m616sortArraynroSd4(long[] r1, int r2, int r3) {
            java.lang.String r0 = "array"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            int r0 = r3 + (-1)
            m612quickSortnroSd4(r1, r2, r0)
            return
    }

    /* JADX INFO: renamed from: sortArray-4UcCI2c, reason: not valid java name */
    public static final void m617sortArray4UcCI2c(byte[] r1, int r2, int r3) {
            java.lang.String r0 = "array"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            int r0 = r3 + (-1)
            m613quickSort4UcCI2c(r1, r2, r0)
            return
    }

    /* JADX INFO: renamed from: sortArray-Aa5vz7o, reason: not valid java name */
    public static final void m618sortArrayAa5vz7o(short[] r1, int r2, int r3) {
            java.lang.String r0 = "array"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            int r0 = r3 + (-1)
            m614quickSortAa5vz7o(r1, r2, r0)
            return
    }

    /* JADX INFO: renamed from: sortArray-oBK06Vg, reason: not valid java name */
    public static final void m619sortArrayoBK06Vg(int[] r1, int r2, int r3) {
            java.lang.String r0 = "array"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            int r0 = r3 + (-1)
            m615quickSortoBK06Vg(r1, r2, r0)
            return
    }
}
