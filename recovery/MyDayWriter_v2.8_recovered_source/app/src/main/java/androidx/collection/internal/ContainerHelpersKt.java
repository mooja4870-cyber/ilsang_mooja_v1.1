package androidx.collection.internal;

/* JADX INFO: compiled from: ContainerHelpers.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\u001a \u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\tH\u0000\u001a \u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\rH\u0000\u001a\u001c\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006H\u0000\u001a\u0010\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\tH\u0000\u001a\u0010\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\tH\u0000\u001a\u0010\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\tH\u0000\"\u0010\u0010\u0000\u001a\u00020\u00018\u0000X\u0081\u0004¢\u0006\u0002\n\u0000\"\u0010\u0010\u0002\u001a\u00020\u00038\u0000X\u0081\u0004¢\u0006\u0002\n\u0000\"\u001a\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00058\u0000X\u0081\u0004¢\u0006\u0004\n\u0002\u0010\u0007¨\u0006\u0016"}, d2 = {"EMPTY_INTS", "", "EMPTY_LONGS", "", "EMPTY_OBJECTS", "", "", "[Ljava/lang/Object;", "binarySearch", "", "array", "size", "value", "", "equal", "", "a", "b", "idealByteArraySize", "need", "idealIntArraySize", "idealLongArraySize", "collection"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ContainerHelpersKt {
    public static final int[] EMPTY_INTS = null;
    public static final long[] EMPTY_LONGS = null;
    public static final java.lang.Object[] EMPTY_OBJECTS = null;

    static {
            r0 = 0
            int[] r1 = new int[r0]
            androidx.collection.internal.ContainerHelpersKt.EMPTY_INTS = r1
            long[] r1 = new long[r0]
            androidx.collection.internal.ContainerHelpersKt.EMPTY_LONGS = r1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            androidx.collection.internal.ContainerHelpersKt.EMPTY_OBJECTS = r0
            return
    }

    public static final int binarySearch(int[] r4, int r5, int r6) {
            java.lang.String r0 = "array"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = 0
            int r1 = r5 + (-1)
        L8:
            if (r0 > r1) goto L1b
            int r2 = r0 + r1
            int r2 = r2 >>> 1
            r3 = r4[r2]
            if (r3 >= r6) goto L15
            int r0 = r2 + 1
            goto L8
        L15:
            if (r3 <= r6) goto L1a
            int r1 = r2 + (-1)
            goto L8
        L1a:
            return r2
        L1b:
            int r2 = ~r0
            return r2
    }

    public static final int binarySearch(long[] r6, int r7, long r8) {
            java.lang.String r0 = "array"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            r0 = 0
            int r1 = r7 + (-1)
        L8:
            if (r0 > r1) goto L1f
            int r2 = r0 + r1
            int r2 = r2 >>> 1
            r3 = r6[r2]
            int r5 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r5 >= 0) goto L17
            int r0 = r2 + 1
            goto L8
        L17:
            int r5 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r5 <= 0) goto L1e
            int r1 = r2 + (-1)
            goto L8
        L1e:
            return r2
        L1f:
            int r2 = ~r0
            return r2
    }

    public static final boolean equal(java.lang.Object r1, java.lang.Object r2) {
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
            return r0
    }

    public static final int idealByteArraySize(int r3) {
            r0 = 4
        L1:
            r1 = 32
            if (r0 >= r1) goto L13
            r1 = 1
            int r2 = r1 << r0
            int r2 = r2 + (-12)
            if (r3 > r2) goto L10
            int r1 = r1 << r0
            int r1 = r1 + (-12)
            return r1
        L10:
            int r0 = r0 + 1
            goto L1
        L13:
            return r3
    }

    public static final int idealIntArraySize(int r1) {
            int r0 = r1 * 4
            int r0 = idealByteArraySize(r0)
            int r0 = r0 / 4
            return r0
    }

    public static final int idealLongArraySize(int r1) {
            int r0 = r1 * 8
            int r0 = idealByteArraySize(r0)
            int r0 = r0 / 8
            return r0
    }
}
