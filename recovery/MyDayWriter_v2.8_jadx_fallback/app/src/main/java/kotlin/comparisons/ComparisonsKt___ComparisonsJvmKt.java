package kotlin.comparisons;

/* JADX INFO: compiled from: _ComparisonsJvm.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000F\n\u0002\b\u0002\n\u0002\u0010\u000f\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0005\n\u0002\u0010\u0012\n\u0002\u0010\u0006\n\u0002\u0010\u0013\n\u0002\u0010\u0007\n\u0002\u0010\u0014\n\u0002\u0010\b\n\u0002\u0010\u0015\n\u0002\u0010\t\n\u0002\u0010\u0016\n\u0002\u0010\n\n\u0002\u0010\u0017\n\u0002\b\u0002\u001a-\u0010\u0000\u001a\u0002H\u0001\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\u0006\u0010\u0003\u001a\u0002H\u00012\u0006\u0010\u0004\u001a\u0002H\u0001H\u0007¢\u0006\u0002\u0010\u0005\u001a5\u0010\u0000\u001a\u0002H\u0001\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\u0006\u0010\u0003\u001a\u0002H\u00012\u0006\u0010\u0004\u001a\u0002H\u00012\u0006\u0010\u0006\u001a\u0002H\u0001H\u0007¢\u0006\u0002\u0010\u0007\u001a9\u0010\u0000\u001a\u0002H\u0001\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\u0006\u0010\u0003\u001a\u0002H\u00012\u0012\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00010\t\"\u0002H\u0001H\u0007¢\u0006\u0002\u0010\n\u001a\u0019\u0010\u0000\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u000bH\u0087\b\u001a!\u0010\u0000\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u000bH\u0087\b\u001a\u001c\u0010\u0000\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000b2\n\u0010\b\u001a\u00020\f\"\u00020\u000bH\u0007\u001a\u0019\u0010\u0000\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\rH\u0087\b\u001a!\u0010\u0000\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\rH\u0087\b\u001a\u001c\u0010\u0000\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\r2\n\u0010\b\u001a\u00020\u000e\"\u00020\rH\u0007\u001a\u0019\u0010\u0000\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u000fH\u0087\b\u001a!\u0010\u0000\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u000fH\u0087\b\u001a\u001c\u0010\u0000\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u000f2\n\u0010\b\u001a\u00020\u0010\"\u00020\u000fH\u0007\u001a\u0019\u0010\u0000\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u0011H\u0087\b\u001a!\u0010\u0000\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u0011H\u0087\b\u001a\u001c\u0010\u0000\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u00112\n\u0010\b\u001a\u00020\u0012\"\u00020\u0011H\u0007\u001a\u0019\u0010\u0000\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u0013H\u0087\b\u001a!\u0010\u0000\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u00132\u0006\u0010\u0006\u001a\u00020\u0013H\u0087\b\u001a\u001c\u0010\u0000\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00132\n\u0010\b\u001a\u00020\u0014\"\u00020\u0013H\u0007\u001a\u0019\u0010\u0000\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u00152\u0006\u0010\u0004\u001a\u00020\u0015H\u0087\b\u001a!\u0010\u0000\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u00152\u0006\u0010\u0004\u001a\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u0015H\u0087\b\u001a\u001c\u0010\u0000\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u00152\n\u0010\b\u001a\u00020\u0016\"\u00020\u0015H\u0007\u001a-\u0010\u0017\u001a\u0002H\u0001\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\u0006\u0010\u0003\u001a\u0002H\u00012\u0006\u0010\u0004\u001a\u0002H\u0001H\u0007¢\u0006\u0002\u0010\u0005\u001a5\u0010\u0017\u001a\u0002H\u0001\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\u0006\u0010\u0003\u001a\u0002H\u00012\u0006\u0010\u0004\u001a\u0002H\u00012\u0006\u0010\u0006\u001a\u0002H\u0001H\u0007¢\u0006\u0002\u0010\u0007\u001a9\u0010\u0017\u001a\u0002H\u0001\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\u0006\u0010\u0003\u001a\u0002H\u00012\u0012\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00010\t\"\u0002H\u0001H\u0007¢\u0006\u0002\u0010\n\u001a\u0019\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u000bH\u0087\b\u001a!\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u000bH\u0087\b\u001a\u001c\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000b2\n\u0010\b\u001a\u00020\f\"\u00020\u000bH\u0007\u001a\u0019\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\rH\u0087\b\u001a!\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\rH\u0087\b\u001a\u001c\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\r2\n\u0010\b\u001a\u00020\u000e\"\u00020\rH\u0007\u001a\u0019\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u000fH\u0087\b\u001a!\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u000fH\u0087\b\u001a\u001c\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u000f2\n\u0010\b\u001a\u00020\u0010\"\u00020\u000fH\u0007\u001a\u0019\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u0011H\u0087\b\u001a!\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u0011H\u0087\b\u001a\u001c\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u00112\n\u0010\b\u001a\u00020\u0012\"\u00020\u0011H\u0007\u001a\u0019\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u0013H\u0087\b\u001a!\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u00132\u0006\u0010\u0006\u001a\u00020\u0013H\u0087\b\u001a\u001c\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00132\n\u0010\b\u001a\u00020\u0014\"\u00020\u0013H\u0007\u001a\u0019\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u00152\u0006\u0010\u0004\u001a\u00020\u0015H\u0087\b\u001a!\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u00152\u0006\u0010\u0004\u001a\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u0015H\u0087\b\u001a\u001c\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u00152\n\u0010\b\u001a\u00020\u0016\"\u00020\u0015H\u0007¨\u0006\u0018"}, d2 = {"maxOf", "T", "", "a", "b", "(Ljava/lang/Comparable;Ljava/lang/Comparable;)Ljava/lang/Comparable;", "c", "(Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/Comparable;)Ljava/lang/Comparable;", "other", "", "(Ljava/lang/Comparable;[Ljava/lang/Comparable;)Ljava/lang/Comparable;", "", "", "", "", "", "", "", "", "", "", "", "", "minOf", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/comparisons/ComparisonsKt")
class ComparisonsKt___ComparisonsJvmKt extends kotlin.comparisons.ComparisonsKt__ComparisonsKt {
    public ComparisonsKt___ComparisonsJvmKt() {
            r0 = this;
            r0.<init>()
            return
    }

    private static final byte maxOf(byte r1, byte r2) {
            int r0 = java.lang.Math.max(r1, r2)
            byte r0 = (byte) r0
            return r0
    }

    private static final byte maxOf(byte r1, byte r2, byte r3) {
            int r0 = java.lang.Math.max(r2, r3)
            int r0 = java.lang.Math.max(r1, r0)
            byte r0 = (byte) r0
            return r0
    }

    public static final byte maxOf(byte r5, byte... r6) {
            java.lang.String r0 = "other"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            r0 = r5
            int r1 = r6.length
            r2 = 0
        L8:
            if (r2 >= r1) goto L14
            r3 = r6[r2]
            int r4 = java.lang.Math.max(r0, r3)
            byte r0 = (byte) r4
            int r2 = r2 + 1
            goto L8
        L14:
            return r0
    }

    private static final double maxOf(double r2, double r4) {
            double r0 = java.lang.Math.max(r2, r4)
            return r0
    }

    private static final double maxOf(double r2, double r4, double r6) {
            double r0 = java.lang.Math.max(r4, r6)
            double r0 = java.lang.Math.max(r2, r0)
            return r0
    }

    public static final double maxOf(double r6, double... r8) {
            java.lang.String r0 = "other"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r0 = r6
            int r2 = r8.length
            r3 = 0
        L8:
            if (r3 >= r2) goto L13
            r4 = r8[r3]
            double r0 = java.lang.Math.max(r0, r4)
            int r3 = r3 + 1
            goto L8
        L13:
            return r0
    }

    private static final float maxOf(float r1, float r2) {
            float r0 = java.lang.Math.max(r1, r2)
            return r0
    }

    private static final float maxOf(float r1, float r2, float r3) {
            float r0 = java.lang.Math.max(r2, r3)
            float r0 = java.lang.Math.max(r1, r0)
            return r0
    }

    public static final float maxOf(float r4, float... r5) {
            java.lang.String r0 = "other"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = r4
            int r1 = r5.length
            r2 = 0
        L8:
            if (r2 >= r1) goto L13
            r3 = r5[r2]
            float r0 = java.lang.Math.max(r0, r3)
            int r2 = r2 + 1
            goto L8
        L13:
            return r0
    }

    private static final int maxOf(int r1, int r2) {
            int r0 = java.lang.Math.max(r1, r2)
            return r0
    }

    private static final int maxOf(int r1, int r2, int r3) {
            int r0 = java.lang.Math.max(r2, r3)
            int r0 = java.lang.Math.max(r1, r0)
            return r0
    }

    public static final int maxOf(int r4, int... r5) {
            java.lang.String r0 = "other"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = r4
            int r1 = r5.length
            r2 = 0
        L8:
            if (r2 >= r1) goto L13
            r3 = r5[r2]
            int r0 = java.lang.Math.max(r0, r3)
            int r2 = r2 + 1
            goto L8
        L13:
            return r0
    }

    private static final long maxOf(long r2, long r4) {
            long r0 = java.lang.Math.max(r2, r4)
            return r0
    }

    private static final long maxOf(long r2, long r4, long r6) {
            long r0 = java.lang.Math.max(r4, r6)
            long r0 = java.lang.Math.max(r2, r0)
            return r0
    }

    public static final long maxOf(long r6, long... r8) {
            java.lang.String r0 = "other"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r0 = r6
            int r2 = r8.length
            r3 = 0
        L8:
            if (r3 >= r2) goto L13
            r4 = r8[r3]
            long r0 = java.lang.Math.max(r0, r4)
            int r3 = r3 + 1
            goto L8
        L13:
            return r0
    }

    public static final <T extends java.lang.Comparable<? super T>> T maxOf(T r1, T r2) {
            java.lang.String r0 = "a"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "b"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            int r0 = r1.compareTo(r2)
            if (r0 < 0) goto L12
            r0 = r1
            goto L13
        L12:
            r0 = r2
        L13:
            return r0
    }

    public static final <T extends java.lang.Comparable<? super T>> T maxOf(T r1, T r2, T r3) {
            java.lang.String r0 = "a"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "b"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "c"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.Comparable r0 = kotlin.comparisons.ComparisonsKt.maxOf(r2, r3)
            java.lang.Comparable r0 = kotlin.comparisons.ComparisonsKt.maxOf(r1, r0)
            return r0
    }

    public static final <T extends java.lang.Comparable<? super T>> T maxOf(T r4, T... r5) {
            java.lang.String r0 = "a"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "other"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = r4
            int r1 = r5.length
            r2 = 0
        Ld:
            if (r2 >= r1) goto L18
            r3 = r5[r2]
            java.lang.Comparable r0 = kotlin.comparisons.ComparisonsKt.maxOf(r0, r3)
            int r2 = r2 + 1
            goto Ld
        L18:
            return r0
    }

    private static final short maxOf(short r1, short r2) {
            int r0 = java.lang.Math.max(r1, r2)
            short r0 = (short) r0
            return r0
    }

    private static final short maxOf(short r1, short r2, short r3) {
            int r0 = java.lang.Math.max(r2, r3)
            int r0 = java.lang.Math.max(r1, r0)
            short r0 = (short) r0
            return r0
    }

    public static final short maxOf(short r5, short... r6) {
            java.lang.String r0 = "other"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            r0 = r5
            int r1 = r6.length
            r2 = 0
        L8:
            if (r2 >= r1) goto L14
            short r3 = r6[r2]
            int r4 = java.lang.Math.max(r0, r3)
            short r0 = (short) r4
            int r2 = r2 + 1
            goto L8
        L14:
            return r0
    }

    private static final byte minOf(byte r1, byte r2) {
            int r0 = java.lang.Math.min(r1, r2)
            byte r0 = (byte) r0
            return r0
    }

    private static final byte minOf(byte r1, byte r2, byte r3) {
            int r0 = java.lang.Math.min(r2, r3)
            int r0 = java.lang.Math.min(r1, r0)
            byte r0 = (byte) r0
            return r0
    }

    public static final byte minOf(byte r5, byte... r6) {
            java.lang.String r0 = "other"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            r0 = r5
            int r1 = r6.length
            r2 = 0
        L8:
            if (r2 >= r1) goto L14
            r3 = r6[r2]
            int r4 = java.lang.Math.min(r0, r3)
            byte r0 = (byte) r4
            int r2 = r2 + 1
            goto L8
        L14:
            return r0
    }

    private static final double minOf(double r2, double r4) {
            double r0 = java.lang.Math.min(r2, r4)
            return r0
    }

    private static final double minOf(double r2, double r4, double r6) {
            double r0 = java.lang.Math.min(r4, r6)
            double r0 = java.lang.Math.min(r2, r0)
            return r0
    }

    public static final double minOf(double r6, double... r8) {
            java.lang.String r0 = "other"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r0 = r6
            int r2 = r8.length
            r3 = 0
        L8:
            if (r3 >= r2) goto L13
            r4 = r8[r3]
            double r0 = java.lang.Math.min(r0, r4)
            int r3 = r3 + 1
            goto L8
        L13:
            return r0
    }

    private static final float minOf(float r1, float r2) {
            float r0 = java.lang.Math.min(r1, r2)
            return r0
    }

    private static final float minOf(float r1, float r2, float r3) {
            float r0 = java.lang.Math.min(r2, r3)
            float r0 = java.lang.Math.min(r1, r0)
            return r0
    }

    public static final float minOf(float r4, float... r5) {
            java.lang.String r0 = "other"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = r4
            int r1 = r5.length
            r2 = 0
        L8:
            if (r2 >= r1) goto L13
            r3 = r5[r2]
            float r0 = java.lang.Math.min(r0, r3)
            int r2 = r2 + 1
            goto L8
        L13:
            return r0
    }

    private static final int minOf(int r1, int r2) {
            int r0 = java.lang.Math.min(r1, r2)
            return r0
    }

    private static final int minOf(int r1, int r2, int r3) {
            int r0 = java.lang.Math.min(r2, r3)
            int r0 = java.lang.Math.min(r1, r0)
            return r0
    }

    public static final int minOf(int r4, int... r5) {
            java.lang.String r0 = "other"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = r4
            int r1 = r5.length
            r2 = 0
        L8:
            if (r2 >= r1) goto L13
            r3 = r5[r2]
            int r0 = java.lang.Math.min(r0, r3)
            int r2 = r2 + 1
            goto L8
        L13:
            return r0
    }

    private static final long minOf(long r2, long r4) {
            long r0 = java.lang.Math.min(r2, r4)
            return r0
    }

    private static final long minOf(long r2, long r4, long r6) {
            long r0 = java.lang.Math.min(r4, r6)
            long r0 = java.lang.Math.min(r2, r0)
            return r0
    }

    public static final long minOf(long r6, long... r8) {
            java.lang.String r0 = "other"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r0 = r6
            int r2 = r8.length
            r3 = 0
        L8:
            if (r3 >= r2) goto L13
            r4 = r8[r3]
            long r0 = java.lang.Math.min(r0, r4)
            int r3 = r3 + 1
            goto L8
        L13:
            return r0
    }

    public static final <T extends java.lang.Comparable<? super T>> T minOf(T r1, T r2) {
            java.lang.String r0 = "a"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "b"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            int r0 = r1.compareTo(r2)
            if (r0 > 0) goto L12
            r0 = r1
            goto L13
        L12:
            r0 = r2
        L13:
            return r0
    }

    public static final <T extends java.lang.Comparable<? super T>> T minOf(T r1, T r2, T r3) {
            java.lang.String r0 = "a"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "b"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "c"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.Comparable r0 = kotlin.comparisons.ComparisonsKt.minOf(r2, r3)
            java.lang.Comparable r0 = kotlin.comparisons.ComparisonsKt.minOf(r1, r0)
            return r0
    }

    public static final <T extends java.lang.Comparable<? super T>> T minOf(T r4, T... r5) {
            java.lang.String r0 = "a"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "other"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = r4
            int r1 = r5.length
            r2 = 0
        Ld:
            if (r2 >= r1) goto L18
            r3 = r5[r2]
            java.lang.Comparable r0 = kotlin.comparisons.ComparisonsKt.minOf(r0, r3)
            int r2 = r2 + 1
            goto Ld
        L18:
            return r0
    }

    private static final short minOf(short r1, short r2) {
            int r0 = java.lang.Math.min(r1, r2)
            short r0 = (short) r0
            return r0
    }

    private static final short minOf(short r1, short r2, short r3) {
            int r0 = java.lang.Math.min(r2, r3)
            int r0 = java.lang.Math.min(r1, r0)
            short r0 = (short) r0
            return r0
    }

    public static final short minOf(short r5, short... r6) {
            java.lang.String r0 = "other"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            r0 = r5
            int r1 = r6.length
            r2 = 0
        L8:
            if (r2 >= r1) goto L14
            short r3 = r6[r2]
            int r4 = java.lang.Math.min(r0, r3)
            short r0 = (short) r4
            int r2 = r2 + 1
            goto L8
        L14:
            return r0
    }
}
