package kotlin.ranges;

/* JADX INFO: compiled from: _URanges.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\u0010\t\n\u0002\b\n\u001a\u001b\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001b\u0010\u0000\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001b\u0010\u0000\u001a\u00020\b*\u00020\b2\u0006\u0010\u0002\u001a\u00020\bH\u0007¢\u0006\u0004\b\t\u0010\n\u001a\u001b\u0010\u0000\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\f\u0010\r\u001a\u001b\u0010\u000e\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0010\u0010\u0004\u001a\u001b\u0010\u000e\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0011\u0010\u0007\u001a\u001b\u0010\u000e\u001a\u00020\b*\u00020\b2\u0006\u0010\u000f\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0012\u0010\n\u001a\u001b\u0010\u000e\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0013\u0010\r\u001a#\u0010\u0014\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0015\u0010\u0016\u001a#\u0010\u0014\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0017\u0010\u0018\u001a!\u0010\u0014\u001a\u00020\u0005*\u00020\u00052\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u001aH\u0007¢\u0006\u0004\b\u001b\u0010\u001c\u001a#\u0010\u0014\u001a\u00020\b*\u00020\b2\u0006\u0010\u0002\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\bH\u0007¢\u0006\u0004\b\u001d\u0010\u001e\u001a!\u0010\u0014\u001a\u00020\b*\u00020\b2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\b0\u001aH\u0007¢\u0006\u0004\b\u001f\u0010 \u001a#\u0010\u0014\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b!\u0010\"\u001a\u001c\u0010#\u001a\u00020$*\u00020%2\u0006\u0010&\u001a\u00020\u0001H\u0087\u0002¢\u0006\u0004\b'\u0010(\u001a\u001c\u0010#\u001a\u00020$*\u00020%2\b\u0010)\u001a\u0004\u0018\u00010\u0005H\u0087\n¢\u0006\u0002\b*\u001a\u001c\u0010#\u001a\u00020$*\u00020%2\u0006\u0010&\u001a\u00020\bH\u0087\u0002¢\u0006\u0004\b+\u0010,\u001a\u001c\u0010#\u001a\u00020$*\u00020%2\u0006\u0010&\u001a\u00020\u000bH\u0087\u0002¢\u0006\u0004\b-\u0010.\u001a\u001c\u0010#\u001a\u00020$*\u00020/2\u0006\u0010&\u001a\u00020\u0001H\u0087\u0002¢\u0006\u0004\b0\u00101\u001a\u001c\u0010#\u001a\u00020$*\u00020/2\u0006\u0010&\u001a\u00020\u0005H\u0087\u0002¢\u0006\u0004\b2\u00103\u001a\u001c\u0010#\u001a\u00020$*\u00020/2\b\u0010)\u001a\u0004\u0018\u00010\bH\u0087\n¢\u0006\u0002\b4\u001a\u001c\u0010#\u001a\u00020$*\u00020/2\u0006\u0010&\u001a\u00020\u000bH\u0087\u0002¢\u0006\u0004\b5\u00106\u001a\u001c\u00107\u001a\u000208*\u00020\u00012\u0006\u00109\u001a\u00020\u0001H\u0087\u0004¢\u0006\u0004\b:\u0010;\u001a\u001c\u00107\u001a\u000208*\u00020\u00052\u0006\u00109\u001a\u00020\u0005H\u0087\u0004¢\u0006\u0004\b<\u0010=\u001a\u001c\u00107\u001a\u00020>*\u00020\b2\u0006\u00109\u001a\u00020\bH\u0087\u0004¢\u0006\u0004\b?\u0010@\u001a\u001c\u00107\u001a\u000208*\u00020\u000b2\u0006\u00109\u001a\u00020\u000bH\u0087\u0004¢\u0006\u0004\bA\u0010B\u001a\u0011\u0010C\u001a\u00020\u0005*\u000208H\u0007¢\u0006\u0002\u0010D\u001a\u0011\u0010C\u001a\u00020\b*\u00020>H\u0007¢\u0006\u0002\u0010E\u001a\u000e\u0010F\u001a\u0004\u0018\u00010\u0005*\u000208H\u0007\u001a\u000e\u0010F\u001a\u0004\u0018\u00010\b*\u00020>H\u0007\u001a\u0011\u0010G\u001a\u00020\u0005*\u000208H\u0007¢\u0006\u0002\u0010D\u001a\u0011\u0010G\u001a\u00020\b*\u00020>H\u0007¢\u0006\u0002\u0010E\u001a\u000e\u0010H\u001a\u0004\u0018\u00010\u0005*\u000208H\u0007\u001a\u000e\u0010H\u001a\u0004\u0018\u00010\b*\u00020>H\u0007\u001a\u0012\u0010I\u001a\u00020\u0005*\u00020%H\u0087\b¢\u0006\u0002\u0010J\u001a\u0019\u0010I\u001a\u00020\u0005*\u00020%2\u0006\u0010I\u001a\u00020KH\u0007¢\u0006\u0002\u0010L\u001a\u0012\u0010I\u001a\u00020\b*\u00020/H\u0087\b¢\u0006\u0002\u0010M\u001a\u0019\u0010I\u001a\u00020\b*\u00020/2\u0006\u0010I\u001a\u00020KH\u0007¢\u0006\u0002\u0010N\u001a\u000f\u0010O\u001a\u0004\u0018\u00010\u0005*\u00020%H\u0087\b\u001a\u0016\u0010O\u001a\u0004\u0018\u00010\u0005*\u00020%2\u0006\u0010I\u001a\u00020KH\u0007\u001a\u000f\u0010O\u001a\u0004\u0018\u00010\b*\u00020/H\u0087\b\u001a\u0016\u0010O\u001a\u0004\u0018\u00010\b*\u00020/2\u0006\u0010I\u001a\u00020KH\u0007\u001a\f\u0010P\u001a\u000208*\u000208H\u0007\u001a\f\u0010P\u001a\u00020>*\u00020>H\u0007\u001a\u0015\u0010Q\u001a\u000208*\u0002082\u0006\u0010Q\u001a\u00020RH\u0087\u0004\u001a\u0015\u0010Q\u001a\u00020>*\u00020>2\u0006\u0010Q\u001a\u00020SH\u0087\u0004\u001a\u001c\u0010T\u001a\u00020%*\u00020\u00012\u0006\u00109\u001a\u00020\u0001H\u0087\u0004¢\u0006\u0004\bU\u0010V\u001a\u001c\u0010T\u001a\u00020%*\u00020\u00052\u0006\u00109\u001a\u00020\u0005H\u0087\u0004¢\u0006\u0004\bW\u0010X\u001a\u001c\u0010T\u001a\u00020/*\u00020\b2\u0006\u00109\u001a\u00020\bH\u0087\u0004¢\u0006\u0004\bY\u0010Z\u001a\u001c\u0010T\u001a\u00020%*\u00020\u000b2\u0006\u00109\u001a\u00020\u000bH\u0087\u0004¢\u0006\u0004\b[\u0010\\¨\u0006]"}, d2 = {"coerceAtLeast", "Lkotlin/UByte;", "minimumValue", "coerceAtLeast-Kr8caGY", "(BB)B", "Lkotlin/UInt;", "coerceAtLeast-J1ME1BU", "(II)I", "Lkotlin/ULong;", "coerceAtLeast-eb3DHEI", "(JJ)J", "Lkotlin/UShort;", "coerceAtLeast-5PvTz6A", "(SS)S", "coerceAtMost", "maximumValue", "coerceAtMost-Kr8caGY", "coerceAtMost-J1ME1BU", "coerceAtMost-eb3DHEI", "coerceAtMost-5PvTz6A", "coerceIn", "coerceIn-b33U2AM", "(BBB)B", "coerceIn-WZ9TVnA", "(III)I", "range", "Lkotlin/ranges/ClosedRange;", "coerceIn-wuiCnnA", "(ILkotlin/ranges/ClosedRange;)I", "coerceIn-sambcqE", "(JJJ)J", "coerceIn-JPwROB0", "(JLkotlin/ranges/ClosedRange;)J", "coerceIn-VKSA0NQ", "(SSS)S", "contains", "", "Lkotlin/ranges/UIntRange;", "value", "contains-68kG9v0", "(Lkotlin/ranges/UIntRange;B)Z", "element", "contains-biwQdVI", "contains-fz5IDCE", "(Lkotlin/ranges/UIntRange;J)Z", "contains-ZsK3CEQ", "(Lkotlin/ranges/UIntRange;S)Z", "Lkotlin/ranges/ULongRange;", "contains-ULb-yJY", "(Lkotlin/ranges/ULongRange;B)Z", "contains-Gab390E", "(Lkotlin/ranges/ULongRange;I)Z", "contains-GYNo2lE", "contains-uhHAxoY", "(Lkotlin/ranges/ULongRange;S)Z", "downTo", "Lkotlin/ranges/UIntProgression;", "to", "downTo-Kr8caGY", "(BB)Lkotlin/ranges/UIntProgression;", "downTo-J1ME1BU", "(II)Lkotlin/ranges/UIntProgression;", "Lkotlin/ranges/ULongProgression;", "downTo-eb3DHEI", "(JJ)Lkotlin/ranges/ULongProgression;", "downTo-5PvTz6A", "(SS)Lkotlin/ranges/UIntProgression;", "first", "(Lkotlin/ranges/UIntProgression;)I", "(Lkotlin/ranges/ULongProgression;)J", "firstOrNull", "last", "lastOrNull", "random", "(Lkotlin/ranges/UIntRange;)I", "Lkotlin/random/Random;", "(Lkotlin/ranges/UIntRange;Lkotlin/random/Random;)I", "(Lkotlin/ranges/ULongRange;)J", "(Lkotlin/ranges/ULongRange;Lkotlin/random/Random;)J", "randomOrNull", "reversed", "step", "", "", "until", "until-Kr8caGY", "(BB)Lkotlin/ranges/UIntRange;", "until-J1ME1BU", "(II)Lkotlin/ranges/UIntRange;", "until-eb3DHEI", "(JJ)Lkotlin/ranges/ULongRange;", "until-5PvTz6A", "(SS)Lkotlin/ranges/UIntRange;", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/ranges/URangesKt")
class URangesKt___URangesKt {
    public URangesKt___URangesKt() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: coerceAtLeast-5PvTz6A, reason: not valid java name */
    public static final short m1394coerceAtLeast5PvTz6A(short r2, short r3) {
            r0 = 65535(0xffff, float:9.1834E-41)
            r1 = r2 & r0
            r0 = r0 & r3
            int r0 = kotlin.jvm.internal.Intrinsics.compare(r1, r0)
            if (r0 >= 0) goto Le
            r0 = r3
            goto Lf
        Le:
            r0 = r2
        Lf:
            return r0
    }

    /* JADX INFO: renamed from: coerceAtLeast-J1ME1BU, reason: not valid java name */
    public static final int m1395coerceAtLeastJ1ME1BU(int r1, int r2) {
            int r0 = kotlin.UByte$$ExternalSyntheticBackport4.m(r1, r2)
            if (r0 >= 0) goto L8
            r0 = r2
            goto L9
        L8:
            r0 = r1
        L9:
            return r0
    }

    /* JADX INFO: renamed from: coerceAtLeast-Kr8caGY, reason: not valid java name */
    public static final byte m1396coerceAtLeastKr8caGY(byte r2, byte r3) {
            r0 = r2 & 255(0xff, float:3.57E-43)
            r1 = r3 & 255(0xff, float:3.57E-43)
            int r0 = kotlin.jvm.internal.Intrinsics.compare(r0, r1)
            if (r0 >= 0) goto Lc
            r0 = r3
            goto Ld
        Lc:
            r0 = r2
        Ld:
            return r0
    }

    /* JADX INFO: renamed from: coerceAtLeast-eb3DHEI, reason: not valid java name */
    public static final long m1397coerceAtLeasteb3DHEI(long r2, long r4) {
            int r0 = androidx.collection.MutableFloatFloatMap$$ExternalSyntheticBackport0.m(r2, r4)
            if (r0 >= 0) goto L8
            r0 = r4
            goto L9
        L8:
            r0 = r2
        L9:
            return r0
    }

    /* JADX INFO: renamed from: coerceAtMost-5PvTz6A, reason: not valid java name */
    public static final short m1398coerceAtMost5PvTz6A(short r2, short r3) {
            r0 = 65535(0xffff, float:9.1834E-41)
            r1 = r2 & r0
            r0 = r0 & r3
            int r0 = kotlin.jvm.internal.Intrinsics.compare(r1, r0)
            if (r0 <= 0) goto Le
            r0 = r3
            goto Lf
        Le:
            r0 = r2
        Lf:
            return r0
    }

    /* JADX INFO: renamed from: coerceAtMost-J1ME1BU, reason: not valid java name */
    public static final int m1399coerceAtMostJ1ME1BU(int r1, int r2) {
            int r0 = kotlin.UByte$$ExternalSyntheticBackport4.m(r1, r2)
            if (r0 <= 0) goto L8
            r0 = r2
            goto L9
        L8:
            r0 = r1
        L9:
            return r0
    }

    /* JADX INFO: renamed from: coerceAtMost-Kr8caGY, reason: not valid java name */
    public static final byte m1400coerceAtMostKr8caGY(byte r2, byte r3) {
            r0 = r2 & 255(0xff, float:3.57E-43)
            r1 = r3 & 255(0xff, float:3.57E-43)
            int r0 = kotlin.jvm.internal.Intrinsics.compare(r0, r1)
            if (r0 <= 0) goto Lc
            r0 = r3
            goto Ld
        Lc:
            r0 = r2
        Ld:
            return r0
    }

    /* JADX INFO: renamed from: coerceAtMost-eb3DHEI, reason: not valid java name */
    public static final long m1401coerceAtMosteb3DHEI(long r2, long r4) {
            int r0 = androidx.collection.MutableFloatFloatMap$$ExternalSyntheticBackport0.m(r2, r4)
            if (r0 <= 0) goto L8
            r0 = r4
            goto L9
        L8:
            r0 = r2
        L9:
            return r0
    }

    /* JADX INFO: renamed from: coerceIn-JPwROB0, reason: not valid java name */
    public static final long m1402coerceInJPwROB0(long r3, kotlin.ranges.ClosedRange<kotlin.ULong> r5) {
            java.lang.String r0 = "range"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            boolean r0 = r5 instanceof kotlin.ranges.ClosedFloatingPointRange
            if (r0 == 0) goto L1b
            kotlin.ULong r0 = kotlin.ULong.m321boximpl(r3)
            r1 = r5
            kotlin.ranges.ClosedFloatingPointRange r1 = (kotlin.ranges.ClosedFloatingPointRange) r1
            java.lang.Comparable r0 = kotlin.ranges.RangesKt.coerceIn(r0, r1)
            kotlin.ULong r0 = (kotlin.ULong) r0
            long r0 = r0.m379unboximpl()
            return r0
        L1b:
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L5a
        L22:
            java.lang.Comparable r0 = r5.getStart()
            kotlin.ULong r0 = (kotlin.ULong) r0
            long r0 = r0.m379unboximpl()
            int r0 = androidx.collection.MutableFloatFloatMap$$ExternalSyntheticBackport0.m(r3, r0)
            if (r0 >= 0) goto L3d
            java.lang.Comparable r0 = r5.getStart()
            kotlin.ULong r0 = (kotlin.ULong) r0
            long r0 = r0.m379unboximpl()
            goto L59
        L3d:
            java.lang.Comparable r0 = r5.getEndInclusive()
            kotlin.ULong r0 = (kotlin.ULong) r0
            long r0 = r0.m379unboximpl()
            int r0 = androidx.collection.MutableFloatFloatMap$$ExternalSyntheticBackport0.m(r3, r0)
            if (r0 <= 0) goto L58
            java.lang.Comparable r0 = r5.getEndInclusive()
            kotlin.ULong r0 = (kotlin.ULong) r0
            long r0 = r0.m379unboximpl()
            goto L59
        L58:
            r0 = r3
        L59:
            return r0
        L5a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Cannot coerce value to an empty range: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r5)
            r2 = 46
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    /* JADX INFO: renamed from: coerceIn-VKSA0NQ, reason: not valid java name */
    public static final short m1403coerceInVKSA0NQ(short r3, short r4, short r5) {
            r0 = 65535(0xffff, float:9.1834E-41)
            r1 = r4 & r0
            r2 = r5 & r0
            int r1 = kotlin.jvm.internal.Intrinsics.compare(r1, r2)
            if (r1 > 0) goto L23
            r1 = r3 & r0
            r2 = r4 & r0
            int r1 = kotlin.jvm.internal.Intrinsics.compare(r1, r2)
            if (r1 >= 0) goto L18
            return r4
        L18:
            r1 = r3 & r0
            r0 = r0 & r5
            int r0 = kotlin.jvm.internal.Intrinsics.compare(r1, r0)
            if (r0 <= 0) goto L22
            return r5
        L22:
            return r3
        L23:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Cannot coerce value to an empty range: maximum "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = kotlin.UShort.m478toStringimpl(r5)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " is less than minimum "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = kotlin.UShort.m478toStringimpl(r4)
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = 46
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    /* JADX INFO: renamed from: coerceIn-WZ9TVnA, reason: not valid java name */
    public static final int m1404coerceInWZ9TVnA(int r3, int r4, int r5) {
            int r0 = kotlin.UByte$$ExternalSyntheticBackport4.m(r4, r5)
            if (r0 > 0) goto L15
            int r0 = kotlin.UByte$$ExternalSyntheticBackport4.m(r3, r4)
            if (r0 >= 0) goto Ld
            return r4
        Ld:
            int r0 = kotlin.UByte$$ExternalSyntheticBackport4.m(r3, r5)
            if (r0 <= 0) goto L14
            return r5
        L14:
            return r3
        L15:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Cannot coerce value to an empty range: maximum "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = kotlin.UInt.m294toStringimpl(r5)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " is less than minimum "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = kotlin.UInt.m294toStringimpl(r4)
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = 46
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    /* JADX INFO: renamed from: coerceIn-b33U2AM, reason: not valid java name */
    public static final byte m1405coerceInb33U2AM(byte r3, byte r4, byte r5) {
            r0 = r4 & 255(0xff, float:3.57E-43)
            r1 = r5 & 255(0xff, float:3.57E-43)
            int r0 = kotlin.jvm.internal.Intrinsics.compare(r0, r1)
            if (r0 > 0) goto L21
            r0 = r3 & 255(0xff, float:3.57E-43)
            r1 = r4 & 255(0xff, float:3.57E-43)
            int r0 = kotlin.jvm.internal.Intrinsics.compare(r0, r1)
            if (r0 >= 0) goto L15
            return r4
        L15:
            r0 = r3 & 255(0xff, float:3.57E-43)
            r1 = r5 & 255(0xff, float:3.57E-43)
            int r0 = kotlin.jvm.internal.Intrinsics.compare(r0, r1)
            if (r0 <= 0) goto L20
            return r5
        L20:
            return r3
        L21:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Cannot coerce value to an empty range: maximum "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = kotlin.UByte.m215toStringimpl(r5)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " is less than minimum "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = kotlin.UByte.m215toStringimpl(r4)
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = 46
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    /* JADX INFO: renamed from: coerceIn-sambcqE, reason: not valid java name */
    public static final long m1406coerceInsambcqE(long r3, long r5, long r7) {
            int r0 = androidx.collection.MutableFloatFloatMap$$ExternalSyntheticBackport0.m(r5, r7)
            if (r0 > 0) goto L15
            int r0 = androidx.collection.MutableFloatFloatMap$$ExternalSyntheticBackport0.m(r3, r5)
            if (r0 >= 0) goto Ld
            return r5
        Ld:
            int r0 = androidx.collection.MutableFloatFloatMap$$ExternalSyntheticBackport0.m(r3, r7)
            if (r0 <= 0) goto L14
            return r7
        L14:
            return r3
        L15:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Cannot coerce value to an empty range: maximum "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = kotlin.ULong.m373toStringimpl(r7)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " is less than minimum "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = kotlin.ULong.m373toStringimpl(r5)
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = 46
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    /* JADX INFO: renamed from: coerceIn-wuiCnnA, reason: not valid java name */
    public static final int m1407coerceInwuiCnnA(int r3, kotlin.ranges.ClosedRange<kotlin.UInt> r4) {
            java.lang.String r0 = "range"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            boolean r0 = r4 instanceof kotlin.ranges.ClosedFloatingPointRange
            if (r0 == 0) goto L1b
            kotlin.UInt r0 = kotlin.UInt.m242boximpl(r3)
            r1 = r4
            kotlin.ranges.ClosedFloatingPointRange r1 = (kotlin.ranges.ClosedFloatingPointRange) r1
            java.lang.Comparable r0 = kotlin.ranges.RangesKt.coerceIn(r0, r1)
            kotlin.UInt r0 = (kotlin.UInt) r0
            int r0 = r0.m300unboximpl()
            return r0
        L1b:
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L5a
        L22:
            java.lang.Comparable r0 = r4.getStart()
            kotlin.UInt r0 = (kotlin.UInt) r0
            int r0 = r0.m300unboximpl()
            int r0 = kotlin.UByte$$ExternalSyntheticBackport4.m(r3, r0)
            if (r0 >= 0) goto L3d
            java.lang.Comparable r0 = r4.getStart()
            kotlin.UInt r0 = (kotlin.UInt) r0
            int r0 = r0.m300unboximpl()
            goto L59
        L3d:
            java.lang.Comparable r0 = r4.getEndInclusive()
            kotlin.UInt r0 = (kotlin.UInt) r0
            int r0 = r0.m300unboximpl()
            int r0 = kotlin.UByte$$ExternalSyntheticBackport4.m(r3, r0)
            if (r0 <= 0) goto L58
            java.lang.Comparable r0 = r4.getEndInclusive()
            kotlin.UInt r0 = (kotlin.UInt) r0
            int r0 = r0.m300unboximpl()
            goto L59
        L58:
            r0 = r3
        L59:
            return r0
        L5a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Cannot coerce value to an empty range: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r4)
            r2 = 46
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    /* JADX INFO: renamed from: contains-68kG9v0, reason: not valid java name */
    public static final boolean m1408contains68kG9v0(kotlin.ranges.UIntRange r1, byte r2) {
            java.lang.String r0 = "$this$contains"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            r0 = r2 & 255(0xff, float:3.57E-43)
            int r0 = kotlin.UInt.m248constructorimpl(r0)
            boolean r0 = r1.m1381containsWZ4Q5Ns(r0)
            return r0
    }

    /* JADX INFO: renamed from: contains-GYNo2lE, reason: not valid java name */
    private static final boolean m1409containsGYNo2lE(kotlin.ranges.ULongRange r2, kotlin.ULong r3) {
            java.lang.String r0 = "$this$contains"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            if (r3 == 0) goto L13
            long r0 = r3.m379unboximpl()
            boolean r0 = r2.m1390containsVKZWuLQ(r0)
            if (r0 == 0) goto L13
            r0 = 1
            goto L14
        L13:
            r0 = 0
        L14:
            return r0
    }

    /* JADX INFO: renamed from: contains-Gab390E, reason: not valid java name */
    public static final boolean m1410containsGab390E(kotlin.ranges.ULongRange r4, int r5) {
            java.lang.String r0 = "$this$contains"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            long r0 = (long) r5
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            long r0 = kotlin.ULong.m327constructorimpl(r0)
            boolean r0 = r4.m1390containsVKZWuLQ(r0)
            return r0
    }

    /* JADX INFO: renamed from: contains-ULb-yJY, reason: not valid java name */
    public static final boolean m1411containsULbyJY(kotlin.ranges.ULongRange r4, byte r5) {
            java.lang.String r0 = "$this$contains"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            long r0 = (long) r5
            r2 = 255(0xff, double:1.26E-321)
            long r0 = r0 & r2
            long r0 = kotlin.ULong.m327constructorimpl(r0)
            boolean r0 = r4.m1390containsVKZWuLQ(r0)
            return r0
    }

    /* JADX INFO: renamed from: contains-ZsK3CEQ, reason: not valid java name */
    public static final boolean m1412containsZsK3CEQ(kotlin.ranges.UIntRange r1, short r2) {
            java.lang.String r0 = "$this$contains"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            r0 = 65535(0xffff, float:9.1834E-41)
            r0 = r0 & r2
            int r0 = kotlin.UInt.m248constructorimpl(r0)
            boolean r0 = r1.m1381containsWZ4Q5Ns(r0)
            return r0
    }

    /* JADX INFO: renamed from: contains-biwQdVI, reason: not valid java name */
    private static final boolean m1413containsbiwQdVI(kotlin.ranges.UIntRange r1, kotlin.UInt r2) {
            java.lang.String r0 = "$this$contains"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            if (r2 == 0) goto L13
            int r0 = r2.m300unboximpl()
            boolean r0 = r1.m1381containsWZ4Q5Ns(r0)
            if (r0 == 0) goto L13
            r0 = 1
            goto L14
        L13:
            r0 = 0
        L14:
            return r0
    }

    /* JADX INFO: renamed from: contains-fz5IDCE, reason: not valid java name */
    public static final boolean m1414containsfz5IDCE(kotlin.ranges.UIntRange r4, long r5) {
            java.lang.String r0 = "$this$contains"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = 32
            long r0 = r5 >>> r0
            long r0 = kotlin.ULong.m327constructorimpl(r0)
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L20
            int r0 = (int) r5
            int r0 = kotlin.UInt.m248constructorimpl(r0)
            boolean r0 = r4.m1381containsWZ4Q5Ns(r0)
            if (r0 == 0) goto L20
            r0 = 1
            goto L21
        L20:
            r0 = 0
        L21:
            return r0
    }

    /* JADX INFO: renamed from: contains-uhHAxoY, reason: not valid java name */
    public static final boolean m1415containsuhHAxoY(kotlin.ranges.ULongRange r4, short r5) {
            java.lang.String r0 = "$this$contains"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            long r0 = (long) r5
            r2 = 65535(0xffff, double:3.23786E-319)
            long r0 = r0 & r2
            long r0 = kotlin.ULong.m327constructorimpl(r0)
            boolean r0 = r4.m1390containsVKZWuLQ(r0)
            return r0
    }

    /* JADX INFO: renamed from: downTo-5PvTz6A, reason: not valid java name */
    public static final kotlin.ranges.UIntProgression m1416downTo5PvTz6A(short r4, short r5) {
            kotlin.ranges.UIntProgression$Companion r0 = kotlin.ranges.UIntProgression.Companion
            r1 = 65535(0xffff, float:9.1834E-41)
            r2 = r4 & r1
            int r2 = kotlin.UInt.m248constructorimpl(r2)
            r1 = r1 & r5
            int r1 = kotlin.UInt.m248constructorimpl(r1)
            r3 = -1
            kotlin.ranges.UIntProgression r0 = r0.m1378fromClosedRangeNkh28Cs(r2, r1, r3)
            return r0
    }

    /* JADX INFO: renamed from: downTo-J1ME1BU, reason: not valid java name */
    public static final kotlin.ranges.UIntProgression m1417downToJ1ME1BU(int r2, int r3) {
            kotlin.ranges.UIntProgression$Companion r0 = kotlin.ranges.UIntProgression.Companion
            r1 = -1
            kotlin.ranges.UIntProgression r0 = r0.m1378fromClosedRangeNkh28Cs(r2, r3, r1)
            return r0
    }

    /* JADX INFO: renamed from: downTo-Kr8caGY, reason: not valid java name */
    public static final kotlin.ranges.UIntProgression m1418downToKr8caGY(byte r4, byte r5) {
            kotlin.ranges.UIntProgression$Companion r0 = kotlin.ranges.UIntProgression.Companion
            r1 = r4 & 255(0xff, float:3.57E-43)
            int r1 = kotlin.UInt.m248constructorimpl(r1)
            r2 = r5 & 255(0xff, float:3.57E-43)
            int r2 = kotlin.UInt.m248constructorimpl(r2)
            r3 = -1
            kotlin.ranges.UIntProgression r0 = r0.m1378fromClosedRangeNkh28Cs(r1, r2, r3)
            return r0
    }

    /* JADX INFO: renamed from: downTo-eb3DHEI, reason: not valid java name */
    public static final kotlin.ranges.ULongProgression m1419downToeb3DHEI(long r7, long r9) {
            kotlin.ranges.ULongProgression$Companion r0 = kotlin.ranges.ULongProgression.Companion
            r5 = -1
            r1 = r7
            r3 = r9
            kotlin.ranges.ULongProgression r7 = r0.m1387fromClosedRange7ftBX0g(r1, r3, r5)
            return r7
    }

    public static final int first(kotlin.ranges.UIntProgression r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L10
            int r0 = r3.m1376getFirstpVg5ArA()
            return r0
        L10:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Progression "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r2 = " is empty."
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public static final long first(kotlin.ranges.ULongProgression r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L10
            long r0 = r3.m1385getFirstsVKNKU()
            return r0
        L10:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Progression "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r2 = " is empty."
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public static final kotlin.UInt firstOrNull(kotlin.ranges.UIntProgression r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto Ld
            r0 = 0
            goto L15
        Ld:
            int r0 = r1.m1376getFirstpVg5ArA()
            kotlin.UInt r0 = kotlin.UInt.m242boximpl(r0)
        L15:
            return r0
    }

    public static final kotlin.ULong firstOrNull(kotlin.ranges.ULongProgression r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto Ld
            r0 = 0
            goto L15
        Ld:
            long r0 = r2.m1385getFirstsVKNKU()
            kotlin.ULong r0 = kotlin.ULong.m321boximpl(r0)
        L15:
            return r0
    }

    public static final int last(kotlin.ranges.UIntProgression r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L10
            int r0 = r3.m1377getLastpVg5ArA()
            return r0
        L10:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Progression "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r2 = " is empty."
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public static final long last(kotlin.ranges.ULongProgression r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L10
            long r0 = r3.m1386getLastsVKNKU()
            return r0
        L10:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Progression "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r2 = " is empty."
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public static final kotlin.UInt lastOrNull(kotlin.ranges.UIntProgression r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto Ld
            r0 = 0
            goto L15
        Ld:
            int r0 = r1.m1377getLastpVg5ArA()
            kotlin.UInt r0 = kotlin.UInt.m242boximpl(r0)
        L15:
            return r0
    }

    public static final kotlin.ULong lastOrNull(kotlin.ranges.ULongProgression r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto Ld
            r0 = 0
            goto L15
        Ld:
            long r0 = r2.m1386getLastsVKNKU()
            kotlin.ULong r0 = kotlin.ULong.m321boximpl(r0)
        L15:
            return r0
    }

    private static final int random(kotlin.ranges.UIntRange r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            kotlin.random.Random$Default r0 = kotlin.random.Random.Default
            kotlin.random.Random r0 = (kotlin.random.Random) r0
            int r0 = kotlin.ranges.URangesKt.random(r1, r0)
            return r0
    }

    public static final int random(kotlin.ranges.UIntRange r3, kotlin.random.Random r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "random"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            int r0 = kotlin.random.URandomKt.nextUInt(r4, r3)     // Catch: java.lang.IllegalArgumentException -> L10
            return r0
        L10:
            r0 = move-exception
            java.util.NoSuchElementException r1 = new java.util.NoSuchElementException
            java.lang.String r2 = r0.getMessage()
            r1.<init>(r2)
            throw r1
    }

    private static final long random(kotlin.ranges.ULongRange r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            kotlin.random.Random$Default r0 = kotlin.random.Random.Default
            kotlin.random.Random r0 = (kotlin.random.Random) r0
            long r0 = kotlin.ranges.URangesKt.random(r2, r0)
            return r0
    }

    public static final long random(kotlin.ranges.ULongRange r3, kotlin.random.Random r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "random"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            long r0 = kotlin.random.URandomKt.nextULong(r4, r3)     // Catch: java.lang.IllegalArgumentException -> L10
            return r0
        L10:
            r0 = move-exception
            java.util.NoSuchElementException r1 = new java.util.NoSuchElementException
            java.lang.String r2 = r0.getMessage()
            r1.<init>(r2)
            throw r1
    }

    private static final kotlin.UInt randomOrNull(kotlin.ranges.UIntRange r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            kotlin.random.Random$Default r0 = kotlin.random.Random.Default
            kotlin.random.Random r0 = (kotlin.random.Random) r0
            kotlin.UInt r0 = kotlin.ranges.URangesKt.randomOrNull(r1, r0)
            return r0
    }

    public static final kotlin.UInt randomOrNull(kotlin.ranges.UIntRange r1, kotlin.random.Random r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "random"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L12
            r0 = 0
            return r0
        L12:
            int r0 = kotlin.random.URandomKt.nextUInt(r2, r1)
            kotlin.UInt r0 = kotlin.UInt.m242boximpl(r0)
            return r0
    }

    private static final kotlin.ULong randomOrNull(kotlin.ranges.ULongRange r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            kotlin.random.Random$Default r0 = kotlin.random.Random.Default
            kotlin.random.Random r0 = (kotlin.random.Random) r0
            kotlin.ULong r0 = kotlin.ranges.URangesKt.randomOrNull(r1, r0)
            return r0
    }

    public static final kotlin.ULong randomOrNull(kotlin.ranges.ULongRange r2, kotlin.random.Random r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "random"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L12
            r0 = 0
            return r0
        L12:
            long r0 = kotlin.random.URandomKt.nextULong(r3, r2)
            kotlin.ULong r0 = kotlin.ULong.m321boximpl(r0)
            return r0
    }

    public static final kotlin.ranges.UIntProgression reversed(kotlin.ranges.UIntProgression r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            kotlin.ranges.UIntProgression$Companion r0 = kotlin.ranges.UIntProgression.Companion
            int r1 = r4.m1377getLastpVg5ArA()
            int r2 = r4.m1376getFirstpVg5ArA()
            int r3 = r4.getStep()
            int r3 = -r3
            kotlin.ranges.UIntProgression r0 = r0.m1378fromClosedRangeNkh28Cs(r1, r2, r3)
            return r0
    }

    public static final kotlin.ranges.ULongProgression reversed(kotlin.ranges.ULongProgression r8) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            kotlin.ranges.ULongProgression$Companion r1 = kotlin.ranges.ULongProgression.Companion
            long r2 = r8.m1386getLastsVKNKU()
            long r4 = r8.m1385getFirstsVKNKU()
            long r6 = r8.getStep()
            long r6 = -r6
            kotlin.ranges.ULongProgression r0 = r1.m1387fromClosedRange7ftBX0g(r2, r4, r6)
            return r0
    }

    public static final kotlin.ranges.UIntProgression step(kotlin.ranges.UIntProgression r4, int r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            if (r5 <= 0) goto L9
            r0 = 1
            goto La
        L9:
            r0 = 0
        La:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            java.lang.Number r1 = (java.lang.Number) r1
            kotlin.ranges.RangesKt.checkStepIsPositive(r0, r1)
            kotlin.ranges.UIntProgression$Companion r0 = kotlin.ranges.UIntProgression.Companion
            int r1 = r4.m1376getFirstpVg5ArA()
            int r2 = r4.m1377getLastpVg5ArA()
            int r3 = r4.getStep()
            if (r3 <= 0) goto L25
            r3 = r5
            goto L26
        L25:
            int r3 = -r5
        L26:
            kotlin.ranges.UIntProgression r0 = r0.m1378fromClosedRangeNkh28Cs(r1, r2, r3)
            return r0
    }

    public static final kotlin.ranges.ULongProgression step(kotlin.ranges.ULongProgression r11, long r12) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            r0 = 0
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 <= 0) goto Ld
            r2 = 1
            goto Le
        Ld:
            r2 = 0
        Le:
            java.lang.Long r3 = java.lang.Long.valueOf(r12)
            java.lang.Number r3 = (java.lang.Number) r3
            kotlin.ranges.RangesKt.checkStepIsPositive(r2, r3)
            kotlin.ranges.ULongProgression$Companion r4 = kotlin.ranges.ULongProgression.Companion
            long r5 = r11.m1385getFirstsVKNKU()
            long r7 = r11.m1386getLastsVKNKU()
            long r2 = r11.getStep()
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 <= 0) goto L2b
            r9 = r12
            goto L2d
        L2b:
            long r0 = -r12
            r9 = r0
        L2d:
            kotlin.ranges.ULongProgression r0 = r4.m1387fromClosedRange7ftBX0g(r5, r7, r9)
            return r0
    }

    /* JADX INFO: renamed from: until-5PvTz6A, reason: not valid java name */
    public static final kotlin.ranges.UIntRange m1420until5PvTz6A(short r4, short r5) {
            r0 = 65535(0xffff, float:9.1834E-41)
            r1 = r5 & r0
            r2 = 0
            int r1 = kotlin.jvm.internal.Intrinsics.compare(r1, r2)
            if (r1 > 0) goto L13
            kotlin.ranges.UIntRange$Companion r0 = kotlin.ranges.UIntRange.Companion
            kotlin.ranges.UIntRange r0 = r0.getEMPTY()
            return r0
        L13:
            r1 = r4 & r0
            int r1 = kotlin.UInt.m248constructorimpl(r1)
            r0 = r0 & r5
            int r0 = kotlin.UInt.m248constructorimpl(r0)
            int r0 = r0 + (-1)
            int r0 = kotlin.UInt.m248constructorimpl(r0)
            kotlin.ranges.UIntRange r2 = new kotlin.ranges.UIntRange
            r3 = 0
            r2.<init>(r1, r0, r3)
            return r2
    }

    /* JADX INFO: renamed from: until-J1ME1BU, reason: not valid java name */
    public static final kotlin.ranges.UIntRange m1421untilJ1ME1BU(int r3, int r4) {
            r0 = 0
            int r0 = kotlin.UByte$$ExternalSyntheticBackport4.m(r4, r0)
            if (r0 > 0) goto Le
            kotlin.ranges.UIntRange$Companion r0 = kotlin.ranges.UIntRange.Companion
            kotlin.ranges.UIntRange r0 = r0.getEMPTY()
            return r0
        Le:
            kotlin.ranges.UIntRange r0 = new kotlin.ranges.UIntRange
            int r1 = r4 + (-1)
            int r1 = kotlin.UInt.m248constructorimpl(r1)
            r2 = 0
            r0.<init>(r3, r1, r2)
            return r0
    }

    /* JADX INFO: renamed from: until-Kr8caGY, reason: not valid java name */
    public static final kotlin.ranges.UIntRange m1422untilKr8caGY(byte r4, byte r5) {
            r0 = r5 & 255(0xff, float:3.57E-43)
            r1 = 0
            int r0 = kotlin.jvm.internal.Intrinsics.compare(r0, r1)
            if (r0 > 0) goto L10
            kotlin.ranges.UIntRange$Companion r0 = kotlin.ranges.UIntRange.Companion
            kotlin.ranges.UIntRange r0 = r0.getEMPTY()
            return r0
        L10:
            r0 = r4 & 255(0xff, float:3.57E-43)
            int r0 = kotlin.UInt.m248constructorimpl(r0)
            r1 = r5 & 255(0xff, float:3.57E-43)
            int r1 = kotlin.UInt.m248constructorimpl(r1)
            int r1 = r1 + (-1)
            int r1 = kotlin.UInt.m248constructorimpl(r1)
            kotlin.ranges.UIntRange r2 = new kotlin.ranges.UIntRange
            r3 = 0
            r2.<init>(r0, r1, r3)
            return r2
    }

    /* JADX INFO: renamed from: until-eb3DHEI, reason: not valid java name */
    public static final kotlin.ranges.ULongRange m1423untileb3DHEI(long r8, long r10) {
            r0 = 0
            int r0 = androidx.collection.MutableFloatFloatMap$$ExternalSyntheticBackport0.m(r10, r0)
            if (r0 > 0) goto Lf
            kotlin.ranges.ULongRange$Companion r0 = kotlin.ranges.ULongRange.Companion
            kotlin.ranges.ULongRange r0 = r0.getEMPTY()
            return r0
        Lf:
            r0 = 1
            long r0 = (long) r0
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            long r0 = kotlin.ULong.m327constructorimpl(r0)
            long r0 = r10 - r0
            long r5 = kotlin.ULong.m327constructorimpl(r0)
            kotlin.ranges.ULongRange r2 = new kotlin.ranges.ULongRange
            r7 = 0
            r3 = r8
            r2.<init>(r3, r5, r7)
            return r2
    }
}
