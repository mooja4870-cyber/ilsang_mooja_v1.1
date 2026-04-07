package kotlin.uuid;

/* JADX INFO: compiled from: Uuid.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 !2\u00060\u0001j\u0002`\u0002:\u0001!B\u0017\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0002\u0010\u0006J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0096\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0006\u0010\u0013\u001a\u00020\u0014J\u0006\u0010\u0015\u001a\u00020\u0016J\\\u0010\u0017\u001a\u0002H\u0018\"\u0004\b\u0000\u0010\u001826\u0010\u0019\u001a2\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u0003\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u0002H\u00180\u001aH\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0002\u0010\u001dJ\b\u0010\u001e\u001a\u00020\u0016H\u0016J\\\u0010\u001f\u001a\u0002H\u0018\"\u0004\b\u0000\u0010\u001826\u0010\u0019\u001a2\u0012\u0013\u0012\u00110 ¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u0003\u0012\u0013\u0012\u00110 ¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u0002H\u00180\u001aH\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0002\u0010\u001dR\u001c\u0010\u0005\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0003\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000b\u0010\b\u001a\u0004\b\f\u0010\n\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\""}, d2 = {"Lkotlin/uuid/Uuid;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "mostSignificantBits", "", "leastSignificantBits", "(JJ)V", "getLeastSignificantBits$annotations", "()V", "getLeastSignificantBits", "()J", "getMostSignificantBits$annotations", "getMostSignificantBits", "equals", "", "other", "", "hashCode", "", "toByteArray", "", "toHexString", "", "toLongs", "T", "action", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "(Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "toString", "toULongs", "Lkotlin/ULong;", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class Uuid implements java.io.Serializable {
    public static final kotlin.uuid.Uuid.Companion Companion = null;
    private static final java.util.Comparator<kotlin.uuid.Uuid> LEXICAL_ORDER = null;
    private static final kotlin.uuid.Uuid NIL = null;
    public static final int SIZE_BITS = 128;
    public static final int SIZE_BYTES = 16;
    private final long leastSignificantBits;
    private final long mostSignificantBits;

    /* JADX INFO: compiled from: Uuid.kt */
    @kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0011J\u0016\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014J\u001d\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u000e\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u001cJ\u000e\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u001cJ\u0006\u0010\u001f\u001a\u00020\u0005R!\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0086T¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lkotlin/uuid/Uuid$Companion;", "", "()V", "LEXICAL_ORDER", "Ljava/util/Comparator;", "Lkotlin/uuid/Uuid;", "Lkotlin/Comparator;", "getLEXICAL_ORDER", "()Ljava/util/Comparator;", "NIL", "getNIL", "()Lkotlin/uuid/Uuid;", "SIZE_BITS", "", "SIZE_BYTES", "fromByteArray", "byteArray", "", "fromLongs", "mostSignificantBits", "", "leastSignificantBits", "fromULongs", "Lkotlin/ULong;", "fromULongs-eb3DHEI", "(JJ)Lkotlin/uuid/Uuid;", "parse", "uuidString", "", "parseHex", "hexString", "random", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public final kotlin.uuid.Uuid fromByteArray(byte[] r5) {
                r4 = this;
                java.lang.String r0 = "byteArray"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                int r0 = r5.length
                r1 = 16
                r2 = 0
                if (r0 != r1) goto Ld
                r0 = 1
                goto Le
            Ld:
                r0 = r2
            Le:
                if (r0 == 0) goto L1f
                long r0 = kotlin.uuid.UuidKt__UuidKt.access$toLong(r5, r2)
                r2 = 8
                long r2 = kotlin.uuid.UuidKt__UuidKt.access$toLong(r5, r2)
                kotlin.uuid.Uuid r0 = r4.fromLongs(r0, r2)
                return r0
            L1f:
                r0 = 0
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "Expected exactly 16 bytes"
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
        }

        public final kotlin.uuid.Uuid fromLongs(long r4, long r6) {
                r3 = this;
                r0 = 0
                int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r2 != 0) goto Lf
                int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
                if (r0 != 0) goto Lf
                kotlin.uuid.Uuid r0 = r3.getNIL()
                goto L14
            Lf:
                kotlin.uuid.Uuid r0 = new kotlin.uuid.Uuid
                r0.<init>(r4, r6)
            L14:
                return r0
        }

        /* JADX INFO: renamed from: fromULongs-eb3DHEI, reason: not valid java name */
        public final kotlin.uuid.Uuid m1642fromULongseb3DHEI(long r2, long r4) {
                r1 = this;
                kotlin.uuid.Uuid r0 = r1.fromLongs(r2, r4)
                return r0
        }

        public final java.util.Comparator<kotlin.uuid.Uuid> getLEXICAL_ORDER() {
                r1 = this;
                java.util.Comparator r0 = kotlin.uuid.Uuid.access$getLEXICAL_ORDER$cp()
                return r0
        }

        public final kotlin.uuid.Uuid getNIL() {
                r1 = this;
                kotlin.uuid.Uuid r0 = kotlin.uuid.Uuid.access$getNIL$cp()
                return r0
        }

        public final kotlin.uuid.Uuid parse(java.lang.String r17) {
                r16 = this;
                r0 = r17
                java.lang.String r1 = "uuidString"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
                int r1 = r0.length()
                r2 = 36
                if (r1 != r2) goto L11
                r1 = 1
                goto L12
            L11:
                r1 = 0
            L12:
                if (r1 == 0) goto L68
                r4 = 4
                r5 = 0
                r1 = 0
                r2 = 8
                r3 = 0
                long r6 = kotlin.text.HexExtensionsKt.hexToLong$default(r0, r1, r2, r3, r4, r5)
                r1 = 8
                kotlin.uuid.UuidKt__UuidKt.access$checkHyphenAt(r0, r1)
                r1 = 9
                r2 = 13
                long r8 = kotlin.text.HexExtensionsKt.hexToLong$default(r0, r1, r2, r3, r4, r5)
                r1 = 13
                kotlin.uuid.UuidKt__UuidKt.access$checkHyphenAt(r0, r1)
                r1 = 14
                r2 = 18
                long r10 = kotlin.text.HexExtensionsKt.hexToLong$default(r0, r1, r2, r3, r4, r5)
                r1 = 18
                kotlin.uuid.UuidKt__UuidKt.access$checkHyphenAt(r0, r1)
                r1 = 19
                r2 = 23
                long r12 = kotlin.text.HexExtensionsKt.hexToLong$default(r0, r1, r2, r3, r4, r5)
                r1 = 23
                kotlin.uuid.UuidKt__UuidKt.access$checkHyphenAt(r0, r1)
                r1 = 24
                r2 = 36
                long r1 = kotlin.text.HexExtensionsKt.hexToLong$default(r0, r1, r2, r3, r4, r5)
                r0 = 32
                long r3 = r6 << r0
                r0 = 16
                long r14 = r8 << r0
                long r3 = r3 | r14
                long r3 = r3 | r10
                r0 = 48
                long r14 = r12 << r0
                long r14 = r14 | r1
                r0 = r16
                kotlin.uuid.Uuid r5 = r0.fromLongs(r3, r14)
                return r5
            L68:
                r0 = r16
                r1 = 0
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r2 = "Expected a 36-char string in the standard uuid format."
                java.lang.String r2 = r2.toString()
                r1.<init>(r2)
                throw r1
        }

        public final kotlin.uuid.Uuid parseHex(java.lang.String r11) {
                r10 = this;
                java.lang.String r0 = "hexString"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
                int r0 = r11.length()
                r1 = 32
                if (r0 != r1) goto Lf
                r0 = 1
                goto L10
            Lf:
                r0 = 0
            L10:
                if (r0 == 0) goto L2e
                r5 = 4
                r6 = 0
                r2 = 0
                r3 = 16
                r4 = 0
                r1 = r11
                long r2 = kotlin.text.HexExtensionsKt.hexToLong$default(r1, r2, r3, r4, r5, r6)
                r8 = 4
                r9 = 0
                r5 = 16
                r6 = 32
                r7 = 0
                r4 = r1
                long r0 = kotlin.text.HexExtensionsKt.hexToLong$default(r4, r5, r6, r7, r8, r9)
                kotlin.uuid.Uuid r11 = r10.fromLongs(r2, r0)
                return r11
            L2e:
                r4 = r11
                r11 = 0
                java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Expected a 32-char hexadecimal string."
                java.lang.String r0 = r0.toString()
                r11.<init>(r0)
                throw r11
        }

        public final kotlin.uuid.Uuid random() {
                r1 = this;
                kotlin.uuid.Uuid r0 = kotlin.uuid.UuidKt.secureRandomUuid()
                return r0
        }
    }

    public static /* synthetic */ int $r8$lambda$hY_iFluWdHz7H_4hiindXk95oZw(kotlin.uuid.Uuid r0, kotlin.uuid.Uuid r1) {
            int r0 = LEXICAL_ORDER$lambda$2(r0, r1)
            return r0
    }

    static {
            kotlin.uuid.Uuid$Companion r0 = new kotlin.uuid.Uuid$Companion
            r1 = 0
            r0.<init>(r1)
            kotlin.uuid.Uuid.Companion = r0
            kotlin.uuid.Uuid r0 = new kotlin.uuid.Uuid
            r1 = 0
            r0.<init>(r1, r1)
            kotlin.uuid.Uuid.NIL = r0
            kotlin.uuid.Uuid$$ExternalSyntheticLambda0 r0 = new kotlin.uuid.Uuid$$ExternalSyntheticLambda0
            r0.<init>()
            kotlin.uuid.Uuid.LEXICAL_ORDER = r0
            return
    }

    public Uuid(long r1, long r3) {
            r0 = this;
            r0.<init>()
            r0.mostSignificantBits = r1
            r0.leastSignificantBits = r3
            return
    }

    private static final int LEXICAL_ORDER$lambda$2(kotlin.uuid.Uuid r4, kotlin.uuid.Uuid r5) {
            long r0 = r4.mostSignificantBits
            long r2 = r5.mostSignificantBits
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L19
            long r0 = r4.mostSignificantBits
            long r0 = kotlin.ULong.m327constructorimpl(r0)
            long r2 = r5.mostSignificantBits
            long r2 = kotlin.ULong.m327constructorimpl(r2)
            int r0 = androidx.collection.MutableFloatFloatMap$$ExternalSyntheticBackport0.m(r0, r2)
            goto L29
        L19:
            long r0 = r4.leastSignificantBits
            long r0 = kotlin.ULong.m327constructorimpl(r0)
            long r2 = r5.leastSignificantBits
            long r2 = kotlin.ULong.m327constructorimpl(r2)
            int r0 = androidx.collection.MutableFloatFloatMap$$ExternalSyntheticBackport0.m(r0, r2)
        L29:
            return r0
    }

    public static final /* synthetic */ java.util.Comparator access$getLEXICAL_ORDER$cp() {
            java.util.Comparator<kotlin.uuid.Uuid> r0 = kotlin.uuid.Uuid.LEXICAL_ORDER
            return r0
    }

    public static final /* synthetic */ kotlin.uuid.Uuid access$getNIL$cp() {
            kotlin.uuid.Uuid r0 = kotlin.uuid.Uuid.NIL
            return r0
    }

    public static /* synthetic */ void getLeastSignificantBits$annotations() {
            return
    }

    public static /* synthetic */ void getMostSignificantBits$annotations() {
            return
    }

    private final <T> T toLongs(kotlin.jvm.functions.Function2<? super java.lang.Long, ? super java.lang.Long, ? extends T> r4) {
            r3 = this;
            java.lang.String r0 = "action"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            long r0 = r3.getMostSignificantBits()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            long r1 = r3.getLeastSignificantBits()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.Object r0 = r4.invoke(r0, r1)
            return r0
    }

    private final <T> T toULongs(kotlin.jvm.functions.Function2<? super kotlin.ULong, ? super kotlin.ULong, ? extends T> r4) {
            r3 = this;
            java.lang.String r0 = "action"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            long r0 = r3.getMostSignificantBits()
            long r0 = kotlin.ULong.m327constructorimpl(r0)
            kotlin.ULong r0 = kotlin.ULong.m321boximpl(r0)
            long r1 = r3.getLeastSignificantBits()
            long r1 = kotlin.ULong.m327constructorimpl(r1)
            kotlin.ULong r1 = kotlin.ULong.m321boximpl(r1)
            java.lang.Object r0 = r4.invoke(r0, r1)
            return r0
    }

    public boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof kotlin.uuid.Uuid
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            long r3 = r7.mostSignificantBits
            r1 = r8
            kotlin.uuid.Uuid r1 = (kotlin.uuid.Uuid) r1
            long r5 = r1.mostSignificantBits
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L21
            long r3 = r7.leastSignificantBits
            r1 = r8
            kotlin.uuid.Uuid r1 = (kotlin.uuid.Uuid) r1
            long r5 = r1.leastSignificantBits
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L21
            goto L22
        L21:
            r0 = r2
        L22:
            return r0
    }

    public final long getLeastSignificantBits() {
            r2 = this;
            long r0 = r2.leastSignificantBits
            return r0
    }

    public final long getMostSignificantBits() {
            r2 = this;
            long r0 = r2.mostSignificantBits
            return r0
    }

    public int hashCode() {
            r4 = this;
            long r0 = r4.mostSignificantBits
            long r2 = r4.leastSignificantBits
            long r0 = r0 ^ r2
            r2 = 32
            long r2 = r0 >> r2
            int r2 = (int) r2
            int r3 = (int) r0
            r2 = r2 ^ r3
            return r2
    }

    public final byte[] toByteArray() {
            r4 = this;
            r0 = 16
            byte[] r0 = new byte[r0]
            long r1 = r4.mostSignificantBits
            r3 = 0
            kotlin.uuid.UuidKt__UuidKt.access$toByteArray(r1, r0, r3)
            long r1 = r4.leastSignificantBits
            r3 = 8
            kotlin.uuid.UuidKt__UuidKt.access$toByteArray(r1, r0, r3)
            return r0
    }

    public final java.lang.String toHexString() {
            r5 = this;
            r0 = 32
            byte[] r0 = new byte[r0]
            long r1 = r5.leastSignificantBits
            r3 = 16
            r4 = 8
            kotlin.uuid.UuidKt__UuidKt.access$formatBytesInto(r1, r0, r3, r4)
            long r1 = r5.mostSignificantBits
            r3 = 0
            kotlin.uuid.UuidKt__UuidKt.access$formatBytesInto(r1, r0, r3, r4)
            java.lang.String r1 = kotlin.text.StringsKt.decodeToString(r0)
            return r1
    }

    public java.lang.String toString() {
            r6 = this;
            r0 = 36
            byte[] r0 = new byte[r0]
            long r1 = r6.leastSignificantBits
            r3 = 24
            r4 = 6
            kotlin.uuid.UuidKt__UuidKt.access$formatBytesInto(r1, r0, r3, r4)
            r1 = 23
            r2 = 45
            r0[r1] = r2
            long r3 = r6.leastSignificantBits
            r1 = 48
            long r3 = r3 >>> r1
            r1 = 19
            r5 = 2
            kotlin.uuid.UuidKt__UuidKt.access$formatBytesInto(r3, r0, r1, r5)
            r1 = 18
            r0[r1] = r2
            long r3 = r6.mostSignificantBits
            r1 = 14
            kotlin.uuid.UuidKt__UuidKt.access$formatBytesInto(r3, r0, r1, r5)
            r1 = 13
            r0[r1] = r2
            long r3 = r6.mostSignificantBits
            r1 = 16
            long r3 = r3 >>> r1
            r1 = 9
            kotlin.uuid.UuidKt__UuidKt.access$formatBytesInto(r3, r0, r1, r5)
            r1 = 8
            r0[r1] = r2
            long r1 = r6.mostSignificantBits
            r3 = 32
            long r1 = r1 >>> r3
            r3 = 0
            r4 = 4
            kotlin.uuid.UuidKt__UuidKt.access$formatBytesInto(r1, r0, r3, r4)
            java.lang.String r1 = kotlin.text.StringsKt.decodeToString(r0)
            return r1
    }
}
