package kotlin;

/* JADX INFO: compiled from: NumbersJVM.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0010\b\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\u001a\r\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u0087\b\u001a\r\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0087\b\u001a\r\u0010\u0003\u001a\u00020\u0001*\u00020\u0001H\u0087\b\u001a\r\u0010\u0003\u001a\u00020\u0001*\u00020\u0002H\u0087\b\u001a\r\u0010\u0004\u001a\u00020\u0001*\u00020\u0001H\u0087\b\u001a\r\u0010\u0004\u001a\u00020\u0001*\u00020\u0002H\u0087\b\u001a\u0015\u0010\u0005\u001a\u00020\u0006*\u00020\u00072\u0006\u0010\b\u001a\u00020\u0002H\u0087\b\u001a\u0015\u0010\u0005\u001a\u00020\t*\u00020\n2\u0006\u0010\b\u001a\u00020\u0001H\u0087\b\u001a\r\u0010\u000b\u001a\u00020\f*\u00020\u0006H\u0087\b\u001a\r\u0010\u000b\u001a\u00020\f*\u00020\tH\u0087\b\u001a\r\u0010\r\u001a\u00020\f*\u00020\u0006H\u0087\b\u001a\r\u0010\r\u001a\u00020\f*\u00020\tH\u0087\b\u001a\r\u0010\u000e\u001a\u00020\f*\u00020\u0006H\u0087\b\u001a\r\u0010\u000e\u001a\u00020\f*\u00020\tH\u0087\b\u001a\u0015\u0010\u000f\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u0001H\u0087\b\u001a\u0015\u0010\u000f\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0001H\u0087\b\u001a\u0015\u0010\u0011\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u0001H\u0087\b\u001a\u0015\u0010\u0011\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0001H\u0087\b\u001a\r\u0010\u0012\u001a\u00020\u0001*\u00020\u0001H\u0087\b\u001a\r\u0010\u0012\u001a\u00020\u0002*\u00020\u0002H\u0087\b\u001a\r\u0010\u0013\u001a\u00020\u0001*\u00020\u0001H\u0087\b\u001a\r\u0010\u0013\u001a\u00020\u0002*\u00020\u0002H\u0087\b\u001a\r\u0010\u0014\u001a\u00020\u0002*\u00020\u0006H\u0087\b\u001a\r\u0010\u0014\u001a\u00020\u0001*\u00020\tH\u0087\b\u001a\r\u0010\u0015\u001a\u00020\u0002*\u00020\u0006H\u0087\b\u001a\r\u0010\u0015\u001a\u00020\u0001*\u00020\tH\u0087\b¨\u0006\u0016"}, d2 = {"countLeadingZeroBits", "", "", "countOneBits", "countTrailingZeroBits", "fromBits", "", "Lkotlin/Double$Companion;", "bits", "", "Lkotlin/Float$Companion;", "isFinite", "", "isInfinite", "isNaN", "rotateLeft", "bitCount", "rotateRight", "takeHighestOneBit", "takeLowestOneBit", "toBits", "toRawBits", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/NumbersKt")
class NumbersKt__NumbersJVMKt extends kotlin.NumbersKt__FloorDivModKt {
    public NumbersKt__NumbersJVMKt() {
            r0 = this;
            r0.<init>()
            return
    }

    private static final int countLeadingZeroBits(int r1) {
            int r0 = java.lang.Integer.numberOfLeadingZeros(r1)
            return r0
    }

    private static final int countLeadingZeroBits(long r1) {
            int r0 = java.lang.Long.numberOfLeadingZeros(r1)
            return r0
    }

    private static final int countOneBits(int r1) {
            int r0 = java.lang.Integer.bitCount(r1)
            return r0
    }

    private static final int countOneBits(long r1) {
            int r0 = java.lang.Long.bitCount(r1)
            return r0
    }

    private static final int countTrailingZeroBits(int r1) {
            int r0 = java.lang.Integer.numberOfTrailingZeros(r1)
            return r0
    }

    private static final int countTrailingZeroBits(long r1) {
            int r0 = java.lang.Long.numberOfTrailingZeros(r1)
            return r0
    }

    private static final double fromBits(kotlin.jvm.internal.DoubleCompanionObject r2, long r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            double r0 = java.lang.Double.longBitsToDouble(r3)
            return r0
    }

    private static final float fromBits(kotlin.jvm.internal.FloatCompanionObject r1, int r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            float r0 = java.lang.Float.intBitsToFloat(r2)
            return r0
    }

    private static final boolean isFinite(double r1) {
            boolean r0 = java.lang.Double.isInfinite(r1)
            if (r0 != 0) goto Le
            boolean r0 = java.lang.Double.isNaN(r1)
            if (r0 != 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    private static final boolean isFinite(float r1) {
            boolean r0 = java.lang.Float.isInfinite(r1)
            if (r0 != 0) goto Le
            boolean r0 = java.lang.Float.isNaN(r1)
            if (r0 != 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    private static final boolean isInfinite(double r1) {
            boolean r0 = java.lang.Double.isInfinite(r1)
            return r0
    }

    private static final boolean isInfinite(float r1) {
            boolean r0 = java.lang.Float.isInfinite(r1)
            return r0
    }

    private static final boolean isNaN(double r1) {
            boolean r0 = java.lang.Double.isNaN(r1)
            return r0
    }

    private static final boolean isNaN(float r1) {
            boolean r0 = java.lang.Float.isNaN(r1)
            return r0
    }

    private static final int rotateLeft(int r1, int r2) {
            int r0 = java.lang.Integer.rotateLeft(r1, r2)
            return r0
    }

    private static final long rotateLeft(long r2, int r4) {
            long r0 = java.lang.Long.rotateLeft(r2, r4)
            return r0
    }

    private static final int rotateRight(int r1, int r2) {
            int r0 = java.lang.Integer.rotateRight(r1, r2)
            return r0
    }

    private static final long rotateRight(long r2, int r4) {
            long r0 = java.lang.Long.rotateRight(r2, r4)
            return r0
    }

    private static final int takeHighestOneBit(int r1) {
            int r0 = java.lang.Integer.highestOneBit(r1)
            return r0
    }

    private static final long takeHighestOneBit(long r2) {
            long r0 = java.lang.Long.highestOneBit(r2)
            return r0
    }

    private static final int takeLowestOneBit(int r1) {
            int r0 = java.lang.Integer.lowestOneBit(r1)
            return r0
    }

    private static final long takeLowestOneBit(long r2) {
            long r0 = java.lang.Long.lowestOneBit(r2)
            return r0
    }

    private static final int toBits(float r1) {
            int r0 = java.lang.Float.floatToIntBits(r1)
            return r0
    }

    private static final long toBits(double r2) {
            long r0 = java.lang.Double.doubleToLongBits(r2)
            return r0
    }

    private static final int toRawBits(float r1) {
            int r0 = java.lang.Float.floatToRawIntBits(r1)
            return r0
    }

    private static final long toRawBits(double r2) {
            long r0 = java.lang.Double.doubleToRawLongBits(r2)
            return r0
    }
}
