package androidx.collection;

/* JADX INFO: compiled from: ScatterMap.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0001\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u001e\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u0002H\u0018\u0012\u0004\u0012\u0002H\u00190\u0017\"\u0004\b\u0000\u0010\u0018\"\u0004\b\u0001\u0010\u0019\u001a\u001d\u0010\u001a\u001a\u00060\u0001j\u0002`\u001b2\u0006\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\bH\u0080\b\u001a\u0011\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\bH\u0080\b\u001a\u0011\u0010 \u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\bH\u0080\b\u001a\u0013\u0010\u001f\u001a\u00020\b2\b\u0010!\u001a\u0004\u0018\u00010\u0010H\u0080\b\u001a\u0019\u0010\"\u001a\u00020#2\u0006\u0010\u001c\u001a\u00020\r2\u0006\u0010$\u001a\u00020\bH\u0080\b\u001a\u0019\u0010%\u001a\u00020#2\u0006\u0010\u001c\u001a\u00020\r2\u0006\u0010$\u001a\u00020\bH\u0080\b\u001a\u0011\u0010&\u001a\u00020#2\u0006\u0010'\u001a\u00020\u0001H\u0081\b\u001a\u0019\u0010&\u001a\u00020#2\u0006\u0010\u001c\u001a\u00020\r2\u0006\u0010$\u001a\u00020\bH\u0080\b\u001a\u0010\u0010(\u001a\u00020\b2\u0006\u0010)\u001a\u00020\bH\u0000\u001a\u001e\u0010*\u001a\u000e\u0012\u0004\u0012\u0002H\u0018\u0012\u0004\u0012\u0002H\u00190\u000f\"\u0004\b\u0000\u0010\u0018\"\u0004\b\u0001\u0010\u0019\u001aO\u0010*\u001a\u000e\u0012\u0004\u0012\u0002H\u0018\u0012\u0004\u0012\u0002H\u00190\u000f\"\u0004\b\u0000\u0010\u0018\"\u0004\b\u0001\u0010\u00192*\u0010+\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u0002H\u0018\u0012\u0004\u0012\u0002H\u00190-0,\"\u000e\u0012\u0004\u0012\u0002H\u0018\u0012\u0004\u0012\u0002H\u00190-¢\u0006\u0002\u0010.\u001a\u0010\u0010/\u001a\u00020\b2\u0006\u0010)\u001a\u00020\bH\u0000\u001a\u0010\u00100\u001a\u00020\b2\u0006\u00101\u001a\u00020\bH\u0000\u001a\u0019\u00102\u001a\u00020\u00012\u0006\u00103\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\bH\u0081\b\u001a\u0010\u00104\u001a\u00020\b2\u0006\u0010)\u001a\u00020\bH\u0000\u001a!\u00105\u001a\u0002062\u0006\u00103\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\b2\u0006\u0010'\u001a\u00020\u0001H\u0080\b\u001a\u0011\u00107\u001a\u00020\b*\u00060\u0001j\u0002`8H\u0080\b\u001a\u0011\u00109\u001a\u00020#*\u00060\u0001j\u0002`8H\u0080\b\u001a\u0011\u0010:\u001a\u00020\b*\u00060\u0001j\u0002`;H\u0081\b\u001a\u0015\u0010<\u001a\u00060\u0001j\u0002`8*\u00060\u0001j\u0002`\u001bH\u0080\b\u001a\u0015\u0010=\u001a\u00060\u0001j\u0002`8*\u00060\u0001j\u0002`\u001bH\u0081\b\u001a\u001d\u0010>\u001a\u00060\u0001j\u0002`8*\u00060\u0001j\u0002`\u001b2\u0006\u0010?\u001a\u00020\bH\u0081\b\u001a\u0011\u0010@\u001a\u00020\u0001*\u00060\u0001j\u0002`8H\u0080\b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u0016\u0010\u0002\u001a\u00020\u00018\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0003\u0010\u0004\"\u0016\u0010\u0005\u001a\u00020\u00018\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0004\"\u000e\u0010\u0007\u001a\u00020\bX\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\bX\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u0010\u0010\f\u001a\u00020\r8\u0000X\u0081\u0004¢\u0006\u0002\n\u0000\"\u001c\u0010\u000e\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\u00110\u000fX\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0012\u001a\u00020\bX\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0013\u001a\u00020\bX\u0080T¢\u0006\u0002\n\u0000\"\u0016\u0010\u0014\u001a\u00020\u00018\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0015\u0010\u0004*\f\b\u0000\u0010A\"\u00020\u00012\u00020\u0001*\f\b\u0000\u0010B\"\u00020\u00012\u00020\u0001*\f\b\u0000\u0010C\"\u00020\u00012\u00020\u0001¨\u0006D"}, d2 = {"AllEmpty", "", "BitmaskLsb", "getBitmaskLsb$annotations", "()V", "BitmaskMsb", "getBitmaskMsb$annotations", "ClonedMetadataCount", "", "DefaultScatterCapacity", "Deleted", "Empty", "EmptyGroup", "", "EmptyScatterMap", "Landroidx/collection/MutableScatterMap;", "", "", "GroupWidth", "MurmurHashC1", "Sentinel", "getSentinel$annotations", "emptyScatterMap", "Landroidx/collection/ScatterMap;", "K", "V", "group", "Landroidx/collection/Group;", "metadata", "offset", "h1", "hash", "h2", "k", "isDeleted", "", "index", "isEmpty", "isFull", "value", "loadedCapacity", "capacity", "mutableScatterMapOf", "pairs", "", "Lkotlin/Pair;", "([Lkotlin/Pair;)Landroidx/collection/MutableScatterMap;", "nextCapacity", "normalizeCapacity", "n", "readRawMetadata", "data", "unloadedCapacity", "writeRawMetadata", "", "get", "Landroidx/collection/Bitmask;", "hasNext", "lowestBitSet", "Landroidx/collection/StaticBitmask;", "maskEmpty", "maskEmptyOrDeleted", "match", "m", "next", "Bitmask", "Group", "StaticBitmask", "collection"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ScatterMapKt {
    public static final long AllEmpty = -9187201950435737472L;
    public static final long BitmaskLsb = 72340172838076673L;
    public static final long BitmaskMsb = -9187201950435737472L;
    public static final int ClonedMetadataCount = 7;
    public static final int DefaultScatterCapacity = 6;
    public static final long Deleted = 254;
    public static final long Empty = 128;
    public static final long[] EmptyGroup = null;
    private static final androidx.collection.MutableScatterMap EmptyScatterMap = null;
    public static final int GroupWidth = 8;
    public static final int MurmurHashC1 = -862048943;
    public static final long Sentinel = 255;

    static {
            r0 = 2
            long[] r0 = new long[r0]
            r0 = {x0014: FILL_ARRAY_DATA , data: [-9187201950435737345, -1} // fill-array
            androidx.collection.ScatterMapKt.EmptyGroup = r0
            androidx.collection.MutableScatterMap r0 = new androidx.collection.MutableScatterMap
            r1 = 0
            r0.<init>(r1)
            androidx.collection.ScatterMapKt.EmptyScatterMap = r0
            return
    }

    public static final <K, V> androidx.collection.ScatterMap<K, V> emptyScatterMap() {
            androidx.collection.MutableScatterMap r0 = androidx.collection.ScatterMapKt.EmptyScatterMap
            java.lang.String r1 = "null cannot be cast to non-null type androidx.collection.ScatterMap<K of androidx.collection.ScatterMapKt.emptyScatterMap, V of androidx.collection.ScatterMapKt.emptyScatterMap>"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0, r1)
            androidx.collection.ScatterMap r0 = (androidx.collection.ScatterMap) r0
            return r0
    }

    public static final int get(long r5) {
            r0 = 0
            r1 = r5
            r3 = 0
            int r4 = java.lang.Long.numberOfTrailingZeros(r1)
            int r1 = r4 >> 3
            return r1
    }

    public static /* synthetic */ void getBitmaskLsb$annotations() {
            return
    }

    public static /* synthetic */ void getBitmaskMsb$annotations() {
            return
    }

    public static /* synthetic */ void getSentinel$annotations() {
            return
    }

    public static final long group(long[] r10, int r11) {
            java.lang.String r0 = "metadata"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            r0 = 0
            int r1 = r11 >> 3
            r2 = r11 & 7
            int r2 = r2 << 3
            r3 = r10[r1]
            long r3 = r3 >>> r2
            int r5 = r1 + 1
            r5 = r10[r5]
            int r7 = 64 - r2
            long r5 = r5 << r7
            long r7 = (long) r2
            long r7 = -r7
            r9 = 63
            long r7 = r7 >> r9
            long r5 = r5 & r7
            long r3 = r3 | r5
            return r3
    }

    public static final int h1(int r2) {
            r0 = 0
            int r1 = r2 >>> 7
            return r1
    }

    public static final int h2(int r2) {
            r0 = 0
            r1 = r2 & 127(0x7f, float:1.78E-43)
            return r1
    }

    public static final boolean hasNext(long r3) {
            r0 = 0
            r1 = 0
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 == 0) goto L9
            r1 = 1
            goto La
        L9:
            r1 = 0
        La:
            return r1
    }

    public static final int hash(java.lang.Object r3) {
            r0 = 0
            if (r3 == 0) goto L8
            int r1 = r3.hashCode()
            goto L9
        L8:
            r1 = 0
        L9:
            r2 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r1 = r1 * r2
            int r2 = r1 << 16
            r2 = r2 ^ r1
            return r2
    }

    public static final boolean isDeleted(long[] r6, int r7) {
            java.lang.String r0 = "metadata"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            r0 = 0
            r1 = 0
            int r2 = r7 >> 3
            r2 = r6[r2]
            r4 = r7 & 7
            int r4 = r4 << 3
            long r2 = r2 >> r4
            r4 = 255(0xff, double:1.26E-321)
            long r1 = r2 & r4
            r3 = 254(0xfe, double:1.255E-321)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L1c
            r1 = 1
            goto L1d
        L1c:
            r1 = 0
        L1d:
            return r1
    }

    public static final boolean isEmpty(long[] r6, int r7) {
            java.lang.String r0 = "metadata"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            r0 = 0
            r1 = 0
            int r2 = r7 >> 3
            r2 = r6[r2]
            r4 = r7 & 7
            int r4 = r4 << 3
            long r2 = r2 >> r4
            r4 = 255(0xff, double:1.26E-321)
            long r1 = r2 & r4
            r3 = 128(0x80, double:6.3E-322)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L1c
            r1 = 1
            goto L1d
        L1c:
            r1 = 0
        L1d:
            return r1
    }

    public static final boolean isFull(long r3) {
            r0 = 0
            r1 = 128(0x80, double:6.3E-322)
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 >= 0) goto L9
            r1 = 1
            goto La
        L9:
            r1 = 0
        La:
            return r1
    }

    public static final boolean isFull(long[] r6, int r7) {
            java.lang.String r0 = "metadata"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            r0 = 0
            r1 = 0
            int r2 = r7 >> 3
            r2 = r6[r2]
            r4 = r7 & 7
            int r4 = r4 << 3
            long r2 = r2 >> r4
            r4 = 255(0xff, double:1.26E-321)
            long r1 = r2 & r4
            r3 = 128(0x80, double:6.3E-322)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 >= 0) goto L1c
            r1 = 1
            goto L1d
        L1c:
            r1 = 0
        L1d:
            return r1
    }

    public static final int loadedCapacity(int r1) {
            r0 = 7
            if (r1 != r0) goto L5
            r0 = 6
            return r0
        L5:
            int r0 = r1 / 8
            int r0 = r1 - r0
            return r0
    }

    public static final int lowestBitSet(long r2) {
            r0 = 0
            int r1 = java.lang.Long.numberOfTrailingZeros(r2)
            int r1 = r1 >> 3
            return r1
    }

    public static final long maskEmpty(long r5) {
            r0 = 0
            long r1 = ~r5
            r3 = 6
            long r1 = r1 << r3
            long r1 = r1 & r5
            r3 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r1 = r1 & r3
            return r1
    }

    public static final long maskEmptyOrDeleted(long r5) {
            r0 = 0
            long r1 = ~r5
            r3 = 7
            long r1 = r1 << r3
            long r1 = r1 & r5
            r3 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r1 = r1 & r3
            return r1
    }

    public static final long match(long r7, int r9) {
            r0 = 0
            long r1 = (long) r9
            r3 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r1 = r1 * r3
            long r1 = r1 ^ r7
            long r3 = r1 - r3
            long r5 = ~r1
            long r3 = r3 & r5
            r5 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r3 = r3 & r5
            return r3
    }

    public static final <K, V> androidx.collection.MutableScatterMap<K, V> mutableScatterMapOf() {
            androidx.collection.MutableScatterMap r0 = new androidx.collection.MutableScatterMap
            r1 = 1
            r2 = 0
            r3 = 0
            r0.<init>(r3, r1, r2)
            return r0
    }

    public static final <K, V> androidx.collection.MutableScatterMap<K, V> mutableScatterMapOf(kotlin.Pair<? extends K, ? extends V>... r3) {
            java.lang.String r0 = "pairs"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            androidx.collection.MutableScatterMap r0 = new androidx.collection.MutableScatterMap
            int r1 = r3.length
            r0.<init>(r1)
            r1 = r0
            r2 = 0
            r1.putAll(r3)
            return r0
    }

    public static final long next(long r3) {
            r0 = 0
            r1 = 1
            long r1 = r3 - r1
            long r1 = r1 & r3
            return r1
    }

    public static final int nextCapacity(int r1) {
            if (r1 != 0) goto L4
            r0 = 6
            goto L8
        L4:
            int r0 = r1 * 2
            int r0 = r0 + 1
        L8:
            return r0
    }

    public static final int normalizeCapacity(int r2) {
            if (r2 <= 0) goto L9
            r0 = -1
            int r1 = java.lang.Integer.numberOfLeadingZeros(r2)
            int r0 = r0 >>> r1
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    public static final long readRawMetadata(long[] r5, int r6) {
            java.lang.String r0 = "data"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = 0
            int r1 = r6 >> 3
            r1 = r5[r1]
            r3 = r6 & 7
            int r3 = r3 << 3
            long r1 = r1 >> r3
            r3 = 255(0xff, double:1.26E-321)
            long r1 = r1 & r3
            return r1
    }

    public static final int unloadedCapacity(int r2) {
            r0 = 7
            if (r2 != r0) goto L6
            r0 = 8
            return r0
        L6:
            int r1 = r2 + (-1)
            int r1 = r1 / r0
            int r1 = r1 + r2
            return r1
    }

    public static final void writeRawMetadata(long[] r7, int r8, long r9) {
            java.lang.String r0 = "data"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            r0 = 0
            int r1 = r8 >> 3
            r2 = r8 & 7
            int r2 = r2 << 3
            r3 = r7[r1]
            r5 = 255(0xff, double:1.26E-321)
            long r5 = r5 << r2
            long r5 = ~r5
            long r3 = r3 & r5
            long r5 = r9 << r2
            long r3 = r3 | r5
            r7[r1] = r3
            return
    }
}
