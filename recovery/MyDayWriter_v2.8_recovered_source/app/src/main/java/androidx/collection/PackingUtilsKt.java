package androidx.collection;

/* JADX INFO: compiled from: PackingUtils.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u001a\u0019\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0080\b\u001a\u0019\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u0006H\u0080\b¨\u0006\u0007"}, d2 = {"packFloats", "", "val1", "", "val2", "packInts", "", "collection"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class PackingUtilsKt {
    public static final long packFloats(float r9, float r10) {
            r0 = 0
            int r1 = java.lang.Float.floatToRawIntBits(r9)
            long r1 = (long) r1
            int r3 = java.lang.Float.floatToRawIntBits(r10)
            long r3 = (long) r3
            r5 = 32
            long r5 = r1 << r5
            r7 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r7 = r7 & r3
            long r5 = r5 | r7
            return r5
    }

    public static final long packInts(int r7, int r8) {
            r0 = 0
            long r1 = (long) r7
            r3 = 32
            long r1 = r1 << r3
            long r3 = (long) r8
            r5 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r3 = r3 & r5
            long r1 = r1 | r3
            return r1
    }
}
