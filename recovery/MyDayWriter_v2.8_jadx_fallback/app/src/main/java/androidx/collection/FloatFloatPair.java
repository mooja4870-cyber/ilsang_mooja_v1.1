package androidx.collection;

/* JADX INFO: compiled from: FloatFloatPair.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087@\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0000\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\u0005\u0010\tJ\u0010\u0010\u000f\u001a\u00020\u0003H\u0086\n¢\u0006\u0004\b\u0010\u0010\u000bJ\u0010\u0010\u0011\u001a\u00020\u0003H\u0086\n¢\u0006\u0004\b\u0012\u0010\u000bJ\u001a\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0012\u0010\u0002\u001a\u00020\u00038Æ\u0002¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0007\u001a\u00020\b8\u0000X\u0081\u0004¢\u0006\b\n\u0000\u0012\u0004\b\f\u0010\rR\u0012\u0010\u0004\u001a\u00020\u00038Æ\u0002¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000b\u0088\u0001\u0007\u0092\u0001\u00020\b¨\u0006 "}, d2 = {"Landroidx/collection/FloatFloatPair;", "", "first", "", "second", "constructor-impl", "(FF)J", "packedValue", "", "(J)J", "getFirst-impl", "(J)F", "getPackedValue$annotations", "()V", "getSecond-impl", "component1", "component1-impl", "component2", "component2-impl", "equals", "", "other", "equals-impl", "(JLjava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(J)I", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.JvmInline
public final class FloatFloatPair {
    public final long packedValue;

    private /* synthetic */ FloatFloatPair(long r1) {
            r0 = this;
            r0.<init>()
            r0.packedValue = r1
            return
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ androidx.collection.FloatFloatPair m18boximpl(long r1) {
            androidx.collection.FloatFloatPair r0 = new androidx.collection.FloatFloatPair
            r0.<init>(r1)
            return r0
    }

    /* JADX INFO: renamed from: component1-impl, reason: not valid java name */
    public static final float m19component1impl(long r3) {
            r0 = 0
            r1 = 32
            long r1 = r3 >> r1
            int r1 = (int) r1
            r2 = 0
            float r1 = java.lang.Float.intBitsToFloat(r1)
            return r1
    }

    /* JADX INFO: renamed from: component2-impl, reason: not valid java name */
    public static final float m20component2impl(long r3) {
            r0 = 0
            r1 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r1 = r1 & r3
            int r1 = (int) r1
            r2 = 0
            float r1 = java.lang.Float.intBitsToFloat(r1)
            return r1
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m21constructorimpl(float r9, float r10) {
            r0 = 0
            int r1 = java.lang.Float.floatToRawIntBits(r9)
            long r1 = (long) r1
            int r3 = java.lang.Float.floatToRawIntBits(r10)
            long r3 = (long) r3
            r5 = 32
            long r5 = r1 << r5
            r7 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r7 = r7 & r3
            long r0 = r5 | r7
            long r0 = m22constructorimpl(r0)
            return r0
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m22constructorimpl(long r0) {
            return r0
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m23equalsimpl(long r4, java.lang.Object r6) {
            boolean r0 = r6 instanceof androidx.collection.FloatFloatPair
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            r0 = r6
            androidx.collection.FloatFloatPair r0 = (androidx.collection.FloatFloatPair) r0
            long r2 = r0.m29unboximpl()
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 == 0) goto L12
            return r1
        L12:
            r0 = 1
            return r0
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m24equalsimpl0(long r1, long r3) {
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    /* JADX INFO: renamed from: getFirst-impl, reason: not valid java name */
    public static final float m25getFirstimpl(long r3) {
            r0 = 0
            r1 = 32
            long r1 = r3 >> r1
            int r1 = (int) r1
            r2 = 0
            float r1 = java.lang.Float.intBitsToFloat(r1)
            return r1
    }

    public static /* synthetic */ void getPackedValue$annotations() {
            return
    }

    /* JADX INFO: renamed from: getSecond-impl, reason: not valid java name */
    public static final float m26getSecondimpl(long r3) {
            r0 = 0
            r1 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r1 = r1 & r3
            int r1 = (int) r1
            r2 = 0
            float r1 = java.lang.Float.intBitsToFloat(r1)
            return r1
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m27hashCodeimpl(long r1) {
            int r0 = java.lang.Long.hashCode(r1)
            return r0
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m28toStringimpl(long r4) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 40
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = 0
            r2 = 32
            long r2 = r4 >> r2
            int r2 = (int) r2
            r3 = 0
            float r2 = java.lang.Float.intBitsToFloat(r2)
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r1 = ", "
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = 0
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r4
            int r2 = (int) r2
            r3 = 0
            float r2 = java.lang.Float.intBitsToFloat(r2)
            java.lang.StringBuilder r0 = r0.append(r2)
            r1 = 41
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public boolean equals(java.lang.Object r3) {
            r2 = this;
            long r0 = r2.packedValue
            boolean r0 = m23equalsimpl(r0, r3)
            return r0
    }

    public int hashCode() {
            r2 = this;
            long r0 = r2.packedValue
            int r0 = m27hashCodeimpl(r0)
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            long r0 = r2.packedValue
            java.lang.String r0 = m28toStringimpl(r0)
            return r0
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m29unboximpl() {
            r2 = this;
            long r0 = r2.packedValue
            return r0
    }
}
