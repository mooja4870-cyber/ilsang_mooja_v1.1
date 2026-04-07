package kotlin.io.encoding;

/* JADX INFO: compiled from: Base64.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0017\u0018\u0000 <2\u00020\u0001:\u0002<=B\u001f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0015\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0000¢\u0006\u0002\b\u0011J%\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0015H\u0000¢\u0006\u0002\b\u0017J \u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u0015H\u0002J\u0010\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u0015H\u0002J%\u0010\u001f\u001a\u00020\u00192\u0006\u0010 \u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0015H\u0000¢\u0006\u0002\b!J\"\u0010\"\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u0015J\"\u0010\"\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u0015J0\u0010#\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010$\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0015H\u0002J4\u0010%\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010$\u001a\u00020\u00102\b\b\u0002\u0010\u001b\u001a\u00020\u00152\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u0015J4\u0010%\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u00132\u0006\u0010$\u001a\u00020\u00102\b\b\u0002\u0010\u001b\u001a\u00020\u00152\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u0015J%\u0010&\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0015H\u0000¢\u0006\u0002\b'J\"\u0010(\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u0015J4\u0010)\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010$\u001a\u00020\u00102\b\b\u0002\u0010\u001b\u001a\u00020\u00152\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u0015J5\u0010*\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010$\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0015H\u0000¢\u0006\u0002\b+J\u0015\u0010,\u001a\u00020\u00152\u0006\u0010 \u001a\u00020\u0015H\u0000¢\u0006\u0002\b-J=\u0010.\u001a\u0002H/\"\f\b\u0000\u0010/*\u000600j\u0002`12\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010$\u001a\u0002H/2\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u0015¢\u0006\u0002\u00102J\"\u00103\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u0015J%\u00104\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0015H\u0000¢\u0006\u0002\b5J(\u00106\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u00107\u001a\u00020\u0015H\u0002J\b\u00108\u001a\u00020\u0003H\u0002J \u00109\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0015H\u0002J\u0010\u0010:\u001a\u00020\u00002\u0006\u0010;\u001a\u00020\u0006H\u0007R\u0014\u0010\u0004\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0014\u0010\u0005\u001a\u00020\u0006X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006>"}, d2 = {"Lkotlin/io/encoding/Base64;", "", "isUrlSafe", "", "isMimeScheme", "paddingOption", "Lkotlin/io/encoding/Base64$PaddingOption;", "(ZZLkotlin/io/encoding/Base64$PaddingOption;)V", "isMimeScheme$kotlin_stdlib", "()Z", "isUrlSafe$kotlin_stdlib", "getPaddingOption$kotlin_stdlib", "()Lkotlin/io/encoding/Base64$PaddingOption;", "bytesToStringImpl", "", "source", "", "bytesToStringImpl$kotlin_stdlib", "charsToBytesImpl", "", "startIndex", "", "endIndex", "charsToBytesImpl$kotlin_stdlib", "checkDestinationBounds", "", "destinationSize", "destinationOffset", "capacityNeeded", "checkPaddingIsAllowed", "padIndex", "checkSourceBounds", "sourceSize", "checkSourceBounds$kotlin_stdlib", "decode", "decodeImpl", "destination", "decodeIntoByteArray", "decodeSize", "decodeSize$kotlin_stdlib", "encode", "encodeIntoByteArray", "encodeIntoByteArrayImpl", "encodeIntoByteArrayImpl$kotlin_stdlib", "encodeSize", "encodeSize$kotlin_stdlib", "encodeToAppendable", "A", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "([BLjava/lang/Appendable;II)Ljava/lang/Appendable;", "encodeToByteArray", "encodeToByteArrayImpl", "encodeToByteArrayImpl$kotlin_stdlib", "handlePaddingSymbol", "byteStart", "shouldPadOnEncode", "skipIllegalSymbolsIfMime", "withPadding", "option", "Default", "PaddingOption", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class Base64 {
    public static final kotlin.io.encoding.Base64.Default Default = null;
    private static final kotlin.io.encoding.Base64 Mime = null;
    private static final kotlin.io.encoding.Base64 UrlSafe = null;
    private static final int bitsPerByte = 8;
    private static final int bitsPerSymbol = 6;
    public static final int bytesPerGroup = 3;
    private static final int mimeGroupsPerLine = 19;
    public static final int mimeLineLength = 76;
    private static final byte[] mimeLineSeparatorSymbols = null;
    public static final byte padSymbol = 61;
    public static final int symbolsPerGroup = 4;
    private final boolean isMimeScheme;
    private final boolean isUrlSafe;
    private final kotlin.io.encoding.Base64.PaddingOption paddingOption;

    /* JADX INFO: compiled from: Base64.kt */
    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0006\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0005R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\tX\u0080T¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u00020\u000fX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\tX\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lkotlin/io/encoding/Base64$Default;", "Lkotlin/io/encoding/Base64;", "()V", "Mime", "getMime", "()Lkotlin/io/encoding/Base64;", "UrlSafe", "getUrlSafe", "bitsPerByte", "", "bitsPerSymbol", "bytesPerGroup", "mimeGroupsPerLine", "mimeLineLength", "mimeLineSeparatorSymbols", "", "getMimeLineSeparatorSymbols$kotlin_stdlib", "()[B", "padSymbol", "", "symbolsPerGroup", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Default extends kotlin.io.encoding.Base64 {
        private Default() {
                r3 = this;
                kotlin.io.encoding.Base64$PaddingOption r0 = kotlin.io.encoding.Base64.PaddingOption.PRESENT
                r1 = 0
                r2 = 0
                r3.<init>(r2, r2, r0, r1)
                return
        }

        public /* synthetic */ Default(kotlin.jvm.internal.DefaultConstructorMarker r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public final kotlin.io.encoding.Base64 getMime() {
                r1 = this;
                kotlin.io.encoding.Base64 r0 = kotlin.io.encoding.Base64.access$getMime$cp()
                return r0
        }

        public final byte[] getMimeLineSeparatorSymbols$kotlin_stdlib() {
                r1 = this;
                byte[] r0 = kotlin.io.encoding.Base64.access$getMimeLineSeparatorSymbols$cp()
                return r0
        }

        public final kotlin.io.encoding.Base64 getUrlSafe() {
                r1 = this;
                kotlin.io.encoding.Base64 r0 = kotlin.io.encoding.Base64.access$getUrlSafe$cp()
                return r0
        }
    }

    /* JADX INFO: compiled from: Base64.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/io/encoding/Base64$PaddingOption;", "", "(Ljava/lang/String;I)V", "PRESENT", "ABSENT", "PRESENT_OPTIONAL", "ABSENT_OPTIONAL", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public enum PaddingOption extends java.lang.Enum<kotlin.io.encoding.Base64.PaddingOption> {
        private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES = null;
        private static final /* synthetic */ kotlin.io.encoding.Base64.PaddingOption[] $VALUES = null;
        public static final kotlin.io.encoding.Base64.PaddingOption ABSENT = null;
        public static final kotlin.io.encoding.Base64.PaddingOption ABSENT_OPTIONAL = null;
        public static final kotlin.io.encoding.Base64.PaddingOption PRESENT = null;
        public static final kotlin.io.encoding.Base64.PaddingOption PRESENT_OPTIONAL = null;

        private static final /* synthetic */ kotlin.io.encoding.Base64.PaddingOption[] $values() {
                kotlin.io.encoding.Base64$PaddingOption r0 = kotlin.io.encoding.Base64.PaddingOption.PRESENT
                kotlin.io.encoding.Base64$PaddingOption r1 = kotlin.io.encoding.Base64.PaddingOption.ABSENT
                kotlin.io.encoding.Base64$PaddingOption r2 = kotlin.io.encoding.Base64.PaddingOption.PRESENT_OPTIONAL
                kotlin.io.encoding.Base64$PaddingOption r3 = kotlin.io.encoding.Base64.PaddingOption.ABSENT_OPTIONAL
                kotlin.io.encoding.Base64$PaddingOption[] r0 = new kotlin.io.encoding.Base64.PaddingOption[]{r0, r1, r2, r3}
                return r0
        }

        static {
                kotlin.io.encoding.Base64$PaddingOption r0 = new kotlin.io.encoding.Base64$PaddingOption
                java.lang.String r1 = "PRESENT"
                r2 = 0
                r0.<init>(r1, r2)
                kotlin.io.encoding.Base64.PaddingOption.PRESENT = r0
                kotlin.io.encoding.Base64$PaddingOption r0 = new kotlin.io.encoding.Base64$PaddingOption
                java.lang.String r1 = "ABSENT"
                r2 = 1
                r0.<init>(r1, r2)
                kotlin.io.encoding.Base64.PaddingOption.ABSENT = r0
                kotlin.io.encoding.Base64$PaddingOption r0 = new kotlin.io.encoding.Base64$PaddingOption
                java.lang.String r1 = "PRESENT_OPTIONAL"
                r2 = 2
                r0.<init>(r1, r2)
                kotlin.io.encoding.Base64.PaddingOption.PRESENT_OPTIONAL = r0
                kotlin.io.encoding.Base64$PaddingOption r0 = new kotlin.io.encoding.Base64$PaddingOption
                java.lang.String r1 = "ABSENT_OPTIONAL"
                r2 = 3
                r0.<init>(r1, r2)
                kotlin.io.encoding.Base64.PaddingOption.ABSENT_OPTIONAL = r0
                kotlin.io.encoding.Base64$PaddingOption[] r0 = $values()
                kotlin.io.encoding.Base64.PaddingOption.$VALUES = r0
                kotlin.io.encoding.Base64$PaddingOption[] r0 = kotlin.io.encoding.Base64.PaddingOption.$VALUES
                java.lang.Enum[] r0 = (java.lang.Enum[]) r0
                kotlin.enums.EnumEntries r0 = kotlin.enums.EnumEntriesKt.enumEntries(r0)
                kotlin.io.encoding.Base64.PaddingOption.$ENTRIES = r0
                return
        }

        PaddingOption(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static kotlin.enums.EnumEntries<kotlin.io.encoding.Base64.PaddingOption> getEntries() {
                kotlin.enums.EnumEntries r0 = kotlin.io.encoding.Base64.PaddingOption.$ENTRIES
                return r0
        }

        public static kotlin.io.encoding.Base64.PaddingOption valueOf(java.lang.String r1) {
                java.lang.Class<kotlin.io.encoding.Base64$PaddingOption> r0 = kotlin.io.encoding.Base64.PaddingOption.class
                java.lang.Enum r0 = java.lang.Enum.valueOf(r0, r1)
                kotlin.io.encoding.Base64$PaddingOption r0 = (kotlin.io.encoding.Base64.PaddingOption) r0
                return r0
        }

        public static kotlin.io.encoding.Base64.PaddingOption[] values() {
                kotlin.io.encoding.Base64$PaddingOption[] r0 = kotlin.io.encoding.Base64.PaddingOption.$VALUES
                java.lang.Object r0 = r0.clone()
                kotlin.io.encoding.Base64$PaddingOption[] r0 = (kotlin.io.encoding.Base64.PaddingOption[]) r0
                return r0
        }
    }

    static {
            kotlin.io.encoding.Base64$Default r0 = new kotlin.io.encoding.Base64$Default
            r1 = 0
            r0.<init>(r1)
            kotlin.io.encoding.Base64.Default = r0
            r0 = 2
            byte[] r0 = new byte[r0]
            r0 = {x0026: FILL_ARRAY_DATA , data: [13, 10} // fill-array
            kotlin.io.encoding.Base64.mimeLineSeparatorSymbols = r0
            kotlin.io.encoding.Base64 r0 = new kotlin.io.encoding.Base64
            kotlin.io.encoding.Base64$PaddingOption r1 = kotlin.io.encoding.Base64.PaddingOption.PRESENT
            r2 = 1
            r3 = 0
            r0.<init>(r2, r3, r1)
            kotlin.io.encoding.Base64.UrlSafe = r0
            kotlin.io.encoding.Base64 r0 = new kotlin.io.encoding.Base64
            kotlin.io.encoding.Base64$PaddingOption r1 = kotlin.io.encoding.Base64.PaddingOption.PRESENT
            r0.<init>(r3, r2, r1)
            kotlin.io.encoding.Base64.Mime = r0
            return
    }

    private Base64(boolean r3, boolean r4, kotlin.io.encoding.Base64.PaddingOption r5) {
            r2 = this;
            r2.<init>()
            r2.isUrlSafe = r3
            r2.isMimeScheme = r4
            r2.paddingOption = r5
            boolean r0 = r2.isUrlSafe
            if (r0 == 0) goto L15
            boolean r0 = r2.isMimeScheme
            if (r0 != 0) goto L13
            goto L15
        L13:
            r0 = 0
            goto L16
        L15:
            r0 = 1
        L16:
            if (r0 == 0) goto L1a
        L19:
            return
        L1a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Failed requirement."
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public /* synthetic */ Base64(boolean r1, boolean r2, kotlin.io.encoding.Base64.PaddingOption r3, kotlin.jvm.internal.DefaultConstructorMarker r4) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            return
    }

    public static final /* synthetic */ kotlin.io.encoding.Base64 access$getMime$cp() {
            kotlin.io.encoding.Base64 r0 = kotlin.io.encoding.Base64.Mime
            return r0
    }

    public static final /* synthetic */ byte[] access$getMimeLineSeparatorSymbols$cp() {
            byte[] r0 = kotlin.io.encoding.Base64.mimeLineSeparatorSymbols
            return r0
    }

    public static final /* synthetic */ kotlin.io.encoding.Base64 access$getUrlSafe$cp() {
            kotlin.io.encoding.Base64 r0 = kotlin.io.encoding.Base64.UrlSafe
            return r0
    }

    private final void checkDestinationBounds(int r6, int r7, int r8) {
            r5 = this;
            java.lang.String r0 = ", destination size: "
            if (r7 < 0) goto L3d
            if (r7 > r6) goto L3d
            int r1 = r7 + r8
            if (r1 < 0) goto Ld
            if (r1 > r6) goto Ld
            return
        Ld:
            java.lang.IndexOutOfBoundsException r2 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "The destination array does not have enough capacity, destination offset: "
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r3 = r3.append(r7)
            java.lang.StringBuilder r0 = r3.append(r0)
            java.lang.StringBuilder r0 = r0.append(r6)
            java.lang.String r3 = ", capacity needed: "
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.StringBuilder r0 = r0.append(r8)
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            throw r2
        L3d:
            java.lang.IndexOutOfBoundsException r1 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "destination offset: "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r7)
            java.lang.StringBuilder r0 = r2.append(r0)
            java.lang.StringBuilder r0 = r0.append(r6)
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
    }

    private final void checkPaddingIsAllowed(int r4) {
            r3 = this;
            kotlin.io.encoding.Base64$PaddingOption r0 = r3.paddingOption
            kotlin.io.encoding.Base64$PaddingOption r1 = kotlin.io.encoding.Base64.PaddingOption.ABSENT
            if (r0 == r1) goto L7
            return
        L7:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "The padding option is set to ABSENT, but the input has a pad character at index "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r4)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public static /* synthetic */ byte[] decode$default(kotlin.io.encoding.Base64 r0, java.lang.CharSequence r1, int r2, int r3, int r4, java.lang.Object r5) {
            if (r5 != 0) goto L14
            r5 = r4 & 2
            if (r5 == 0) goto L7
            r2 = 0
        L7:
            r4 = r4 & 4
            if (r4 == 0) goto Lf
            int r3 = r1.length()
        Lf:
            byte[] r0 = r0.decode(r1, r2, r3)
            return r0
        L14:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Super calls with default arguments not supported in this target, function: decode"
            r0.<init>(r1)
            throw r0
    }

    public static /* synthetic */ byte[] decode$default(kotlin.io.encoding.Base64 r0, byte[] r1, int r2, int r3, int r4, java.lang.Object r5) {
            if (r5 != 0) goto L11
            r5 = r4 & 2
            if (r5 == 0) goto L7
            r2 = 0
        L7:
            r4 = r4 & 4
            if (r4 == 0) goto Lc
            int r3 = r1.length
        Lc:
            byte[] r0 = r0.decode(r1, r2, r3)
            return r0
        L11:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Super calls with default arguments not supported in this target, function: decode"
            r0.<init>(r1)
            throw r0
    }

    private final int decodeImpl(byte[] r21, byte[] r22, int r23, int r24, int r25) {
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = r25
            boolean r3 = r0.isUrlSafe
            if (r3 == 0) goto Lf
            int[] r3 = kotlin.io.encoding.Base64Kt.access$getBase64UrlDecodeMap$p()
            goto L13
        Lf:
            int[] r3 = kotlin.io.encoding.Base64Kt.access$getBase64DecodeMap$p()
        L13:
            r4 = 0
            r5 = -8
            r6 = r24
            r7 = r23
            r8 = 0
        L1a:
            java.lang.String r9 = ") at index "
            java.lang.String r10 = "toString(...)"
            java.lang.String r11 = "'("
            r14 = -8
            if (r6 >= r2) goto Lec
            if (r5 != r14) goto L75
            int r15 = r6 + 3
            if (r15 >= r2) goto L75
            int r15 = r6 + 1
            r6 = r1[r6]
            r6 = r6 & 255(0xff, float:3.57E-43)
            r6 = r3[r6]
            int r16 = r15 + 1
            r15 = r1[r15]
            r15 = r15 & 255(0xff, float:3.57E-43)
            r15 = r3[r15]
            int r17 = r16 + 1
            r18 = 8
            r13 = r1[r16]
            r13 = r13 & 255(0xff, float:3.57E-43)
            r13 = r3[r13]
            int r16 = r17 + 1
            r14 = r1[r17]
            r14 = r14 & 255(0xff, float:3.57E-43)
            r14 = r3[r14]
            int r17 = r6 << 18
            int r19 = r15 << 12
            r17 = r17 | r19
            int r19 = r13 << 6
            r17 = r17 | r19
            r12 = r17 | r14
            if (r12 < 0) goto L70
            int r9 = r7 + 1
            int r10 = r12 >> 16
            byte r10 = (byte) r10
            r22[r7] = r10
            int r7 = r9 + 1
            int r10 = r12 >> 8
            byte r10 = (byte) r10
            r22[r9] = r10
            int r9 = r7 + 1
            byte r10 = (byte) r12
            r22[r7] = r10
            r7 = r9
            r6 = r16
            goto L1a
        L70:
            int r16 = r16 + (-4)
            r6 = r16
            goto L77
        L75:
            r18 = 8
        L77:
            r12 = r1[r6]
            r12 = r12 & 255(0xff, float:3.57E-43)
            r13 = r3[r12]
            if (r13 >= 0) goto Lc8
            r14 = -2
            if (r13 != r14) goto L8a
            r8 = 1
            int r6 = r0.handlePaddingSymbol(r1, r6, r2, r5)
            r16 = r3
            goto Lf0
        L8a:
            boolean r14 = r0.isMimeScheme
            if (r14 == 0) goto L91
            int r6 = r6 + 1
            goto L1a
        L91:
            java.lang.IllegalArgumentException r14 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            r16 = r3
            java.lang.String r3 = "Invalid symbol '"
            java.lang.StringBuilder r3 = r15.append(r3)
            char r15 = (char) r12
            java.lang.StringBuilder r3 = r3.append(r15)
            java.lang.StringBuilder r3 = r3.append(r11)
            int r11 = kotlin.text.CharsKt.checkRadix(r18)
            java.lang.String r11 = java.lang.Integer.toString(r12, r11)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r10)
            java.lang.StringBuilder r3 = r3.append(r11)
            java.lang.StringBuilder r3 = r3.append(r9)
            java.lang.StringBuilder r3 = r3.append(r6)
            java.lang.String r3 = r3.toString()
            r14.<init>(r3)
            throw r14
        Lc8:
            r16 = r3
            int r6 = r6 + 1
            int r3 = r4 << 6
            r4 = r3 | r13
            int r5 = r5 + 6
            if (r5 < 0) goto Le8
            int r3 = r7 + 1
            int r9 = r4 >>> r5
            byte r9 = (byte) r9
            r22[r7] = r9
            r7 = 1
            int r9 = r7 << r5
            int r9 = r9 - r7
            r4 = r4 & r9
            int r5 = r5 + (-8)
            r7 = r3
            r3 = r16
            goto L1a
        Le8:
            r3 = r16
            goto L1a
        Lec:
            r16 = r3
            r18 = 8
        Lf0:
            r14 = -2
            if (r5 == r14) goto L15b
            r3 = -8
            if (r5 == r3) goto L107
            if (r8 != 0) goto L107
            kotlin.io.encoding.Base64$PaddingOption r3 = r0.paddingOption
            kotlin.io.encoding.Base64$PaddingOption r12 = kotlin.io.encoding.Base64.PaddingOption.PRESENT
            if (r3 == r12) goto Lff
            goto L107
        Lff:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "The padding option is set to PRESENT, but the input is not properly padded"
            r3.<init>(r9)
            throw r3
        L107:
            if (r4 != 0) goto L153
            int r3 = r0.skipIllegalSymbolsIfMime(r1, r6, r2)
            if (r3 < r2) goto L112
            int r6 = r7 - r23
            return r6
        L112:
            r6 = r1[r3]
            r6 = r6 & 255(0xff, float:3.57E-43)
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = "Symbol '"
            java.lang.StringBuilder r13 = r13.append(r14)
            char r14 = (char) r6
            java.lang.StringBuilder r13 = r13.append(r14)
            java.lang.StringBuilder r11 = r13.append(r11)
            int r13 = kotlin.text.CharsKt.checkRadix(r18)
            java.lang.String r13 = java.lang.Integer.toString(r6, r13)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r13, r10)
            java.lang.StringBuilder r10 = r11.append(r13)
            java.lang.StringBuilder r9 = r10.append(r9)
            int r10 = r3 + (-1)
            java.lang.StringBuilder r9 = r9.append(r10)
            java.lang.String r10 = " is prohibited after the pad character"
            java.lang.StringBuilder r9 = r9.append(r10)
            java.lang.String r9 = r9.toString()
            r12.<init>(r9)
            throw r12
        L153:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "The pad bits must be zeros"
            r3.<init>(r9)
            throw r3
        L15b:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "The last unit of input does not have enough bits"
            r3.<init>(r9)
            throw r3
    }

    public static /* synthetic */ int decodeIntoByteArray$default(kotlin.io.encoding.Base64 r1, java.lang.CharSequence r2, byte[] r3, int r4, int r5, int r6, int r7, java.lang.Object r8) {
            if (r8 != 0) goto L1a
            r8 = r7 & 4
            r0 = 0
            if (r8 == 0) goto L8
            r4 = r0
        L8:
            r8 = r7 & 8
            if (r8 == 0) goto Ld
            r5 = r0
        Ld:
            r7 = r7 & 16
            if (r7 == 0) goto L15
            int r6 = r2.length()
        L15:
            int r1 = r1.decodeIntoByteArray(r2, r3, r4, r5, r6)
            return r1
        L1a:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Super calls with default arguments not supported in this target, function: decodeIntoByteArray"
            r1.<init>(r2)
            throw r1
    }

    public static /* synthetic */ int decodeIntoByteArray$default(kotlin.io.encoding.Base64 r1, byte[] r2, byte[] r3, int r4, int r5, int r6, int r7, java.lang.Object r8) {
            if (r8 != 0) goto L17
            r8 = r7 & 4
            r0 = 0
            if (r8 == 0) goto L8
            r4 = r0
        L8:
            r8 = r7 & 8
            if (r8 == 0) goto Ld
            r5 = r0
        Ld:
            r7 = r7 & 16
            if (r7 == 0) goto L12
            int r6 = r2.length
        L12:
            int r1 = r1.decodeIntoByteArray(r2, r3, r4, r5, r6)
            return r1
        L17:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Super calls with default arguments not supported in this target, function: decodeIntoByteArray"
            r1.<init>(r2)
            throw r1
    }

    public static /* synthetic */ java.lang.String encode$default(kotlin.io.encoding.Base64 r0, byte[] r1, int r2, int r3, int r4, java.lang.Object r5) {
            if (r5 != 0) goto L11
            r5 = r4 & 2
            if (r5 == 0) goto L7
            r2 = 0
        L7:
            r4 = r4 & 4
            if (r4 == 0) goto Lc
            int r3 = r1.length
        Lc:
            java.lang.String r0 = r0.encode(r1, r2, r3)
            return r0
        L11:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Super calls with default arguments not supported in this target, function: encode"
            r0.<init>(r1)
            throw r0
    }

    public static /* synthetic */ int encodeIntoByteArray$default(kotlin.io.encoding.Base64 r1, byte[] r2, byte[] r3, int r4, int r5, int r6, int r7, java.lang.Object r8) {
            if (r8 != 0) goto L17
            r8 = r7 & 4
            r0 = 0
            if (r8 == 0) goto L8
            r4 = r0
        L8:
            r8 = r7 & 8
            if (r8 == 0) goto Ld
            r5 = r0
        Ld:
            r7 = r7 & 16
            if (r7 == 0) goto L12
            int r6 = r2.length
        L12:
            int r1 = r1.encodeIntoByteArray(r2, r3, r4, r5, r6)
            return r1
        L17:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Super calls with default arguments not supported in this target, function: encodeIntoByteArray"
            r1.<init>(r2)
            throw r1
    }

    public static /* synthetic */ java.lang.Appendable encodeToAppendable$default(kotlin.io.encoding.Base64 r0, byte[] r1, java.lang.Appendable r2, int r3, int r4, int r5, java.lang.Object r6) {
            if (r6 != 0) goto L11
            r6 = r5 & 4
            if (r6 == 0) goto L7
            r3 = 0
        L7:
            r5 = r5 & 8
            if (r5 == 0) goto Lc
            int r4 = r1.length
        Lc:
            java.lang.Appendable r0 = r0.encodeToAppendable(r1, r2, r3, r4)
            return r0
        L11:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Super calls with default arguments not supported in this target, function: encodeToAppendable"
            r0.<init>(r1)
            throw r0
    }

    public static /* synthetic */ byte[] encodeToByteArray$default(kotlin.io.encoding.Base64 r0, byte[] r1, int r2, int r3, int r4, java.lang.Object r5) {
            if (r5 != 0) goto L11
            r5 = r4 & 2
            if (r5 == 0) goto L7
            r2 = 0
        L7:
            r4 = r4 & 4
            if (r4 == 0) goto Lc
            int r3 = r1.length
        Lc:
            byte[] r0 = r0.encodeToByteArray(r1, r2, r3)
            return r0
        L11:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Super calls with default arguments not supported in this target, function: encodeToByteArray"
            r0.<init>(r1)
            throw r0
    }

    private final int handlePaddingSymbol(byte[] r5, int r6, int r7, int r8) {
            r4 = this;
            switch(r8) {
                case -8: goto L45;
                case -7: goto L3;
                case -6: goto L3f;
                case -5: goto L3;
                case -4: goto L12;
                case -3: goto L3;
                case -2: goto Lf;
                default: goto L3;
            }
        L3:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Unreachable"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        Lf:
            int r0 = r6 + 1
            goto L44
        L12:
            r4.checkPaddingIsAllowed(r6)
            int r0 = r6 + 1
            int r0 = r4.skipIllegalSymbolsIfMime(r5, r0, r7)
            if (r0 == r7) goto L26
            r1 = r5[r0]
            r2 = 61
            if (r1 != r2) goto L26
            int r0 = r0 + 1
            goto L44
        L26:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Missing one pad character at index "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r0)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L3f:
            r4.checkPaddingIsAllowed(r6)
            int r0 = r6 + 1
        L44:
            return r0
        L45:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Redundant pad character at index "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r6)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    private final boolean shouldPadOnEncode() {
            r2 = this;
            kotlin.io.encoding.Base64$PaddingOption r0 = r2.paddingOption
            kotlin.io.encoding.Base64$PaddingOption r1 = kotlin.io.encoding.Base64.PaddingOption.PRESENT
            if (r0 == r1) goto Lf
            kotlin.io.encoding.Base64$PaddingOption r0 = r2.paddingOption
            kotlin.io.encoding.Base64$PaddingOption r1 = kotlin.io.encoding.Base64.PaddingOption.PRESENT_OPTIONAL
            if (r0 != r1) goto Ld
            goto Lf
        Ld:
            r0 = 0
            goto L10
        Lf:
            r0 = 1
        L10:
            return r0
    }

    private final int skipIllegalSymbolsIfMime(byte[] r5, int r6, int r7) {
            r4 = this;
            boolean r0 = r4.isMimeScheme
            if (r0 != 0) goto L5
            return r6
        L5:
            r0 = r6
        L6:
            if (r0 >= r7) goto L1a
            r1 = r5[r0]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int[] r2 = kotlin.io.encoding.Base64Kt.access$getBase64DecodeMap$p()
            r2 = r2[r1]
            r3 = -1
            if (r2 == r3) goto L16
            return r0
        L16:
            int r0 = r0 + 1
            goto L6
        L1a:
            return r0
    }

    public final java.lang.String bytesToStringImpl$kotlin_stdlib(byte[] r6) {
            r5 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r6.length
            r0.<init>(r1)
            int r1 = r6.length
            r2 = 0
        Ld:
            if (r2 >= r1) goto L18
            r3 = r6[r2]
            char r4 = (char) r3
            r0.append(r4)
            int r2 = r2 + 1
            goto Ld
        L18:
            java.lang.String r1 = r0.toString()
            java.lang.String r2 = "toString(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            return r1
    }

    public final byte[] charsToBytesImpl$kotlin_stdlib(java.lang.CharSequence r7, int r8, int r9) {
            r6 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            int r0 = r7.length()
            r6.checkSourceBounds$kotlin_stdlib(r0, r8, r9)
            int r0 = r9 - r8
            byte[] r0 = new byte[r0]
            r1 = 0
            r2 = r8
        L12:
            if (r2 >= r9) goto L2d
            char r3 = r7.charAt(r2)
            r4 = 255(0xff, float:3.57E-43)
            if (r3 > r4) goto L23
            int r4 = r1 + 1
            byte r5 = (byte) r3
            r0[r1] = r5
            r1 = r4
            goto L2a
        L23:
            int r4 = r1 + 1
            r5 = 63
            r0[r1] = r5
            r1 = r4
        L2a:
            int r2 = r2 + 1
            goto L12
        L2d:
            return r0
    }

    public final void checkSourceBounds$kotlin_stdlib(int r2, int r3, int r4) {
            r1 = this;
            kotlin.collections.AbstractList$Companion r0 = kotlin.collections.AbstractList.Companion
            r0.checkBoundsIndexes$kotlin_stdlib(r3, r4, r2)
            return
    }

    public final byte[] decode(java.lang.CharSequence r8, int r9, int r10) {
            r7 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            boolean r0 = r8 instanceof java.lang.String
            if (r0 == 0) goto L2d
            int r0 = r8.length()
            r7.checkSourceBounds$kotlin_stdlib(r0, r9, r10)
            r0 = r8
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r0.substring(r9, r10)
            java.lang.String r1 = "substring(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.nio.charset.Charset r1 = kotlin.text.Charsets.ISO_8859_1
            java.lang.String r2 = "null cannot be cast to non-null type java.lang.String"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0, r2)
            byte[] r0 = r0.getBytes(r1)
            java.lang.String r1 = "getBytes(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            goto L31
        L2d:
            byte[] r0 = r7.charsToBytesImpl$kotlin_stdlib(r8, r9, r10)
        L31:
            r2 = r0
            r5 = 6
            r6 = 0
            r3 = 0
            r4 = 0
            r1 = r7
            byte[] r0 = decode$default(r1, r2, r3, r4, r5, r6)
            return r0
    }

    public final byte[] decode(byte[] r8, int r9, int r10) {
            r7 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            int r0 = r8.length
            r7.checkSourceBounds$kotlin_stdlib(r0, r9, r10)
            int r0 = r7.decodeSize$kotlin_stdlib(r8, r9, r10)
            byte[] r3 = new byte[r0]
            r4 = 0
            r1 = r7
            r2 = r8
            r5 = r9
            r6 = r10
            int r8 = r1.decodeImpl(r2, r3, r4, r5, r6)
            int r9 = r3.length
            if (r8 != r9) goto L1d
            r9 = 1
            goto L1e
        L1d:
            r9 = 0
        L1e:
            if (r9 == 0) goto L21
            return r3
        L21:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Check failed."
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
    }

    public final int decodeIntoByteArray(java.lang.CharSequence r10, byte[] r11, int r12, int r13, int r14) {
            r9 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.lang.String r0 = "destination"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            boolean r0 = r10 instanceof java.lang.String
            if (r0 == 0) goto L32
            int r0 = r10.length()
            r9.checkSourceBounds$kotlin_stdlib(r0, r13, r14)
            r0 = r10
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r0.substring(r13, r14)
            java.lang.String r1 = "substring(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.nio.charset.Charset r1 = kotlin.text.Charsets.ISO_8859_1
            java.lang.String r2 = "null cannot be cast to non-null type java.lang.String"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0, r2)
            byte[] r0 = r0.getBytes(r1)
            java.lang.String r1 = "getBytes(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            goto L36
        L32:
            byte[] r0 = r9.charsToBytesImpl$kotlin_stdlib(r10, r13, r14)
        L36:
            r2 = r0
            r7 = 24
            r8 = 0
            r5 = 0
            r6 = 0
            r1 = r9
            r3 = r11
            r4 = r12
            int r11 = decodeIntoByteArray$default(r1, r2, r3, r4, r5, r6, r7, r8)
            return r11
    }

    public final int decodeIntoByteArray(byte[] r3, byte[] r4, int r5, int r6, int r7) {
            r2 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "destination"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            int r0 = r3.length
            r2.checkSourceBounds$kotlin_stdlib(r0, r6, r7)
            int r0 = r4.length
            int r1 = r2.decodeSize$kotlin_stdlib(r3, r6, r7)
            r2.checkDestinationBounds(r0, r5, r1)
            int r0 = r2.decodeImpl(r3, r4, r5, r6, r7)
            return r0
    }

    public final int decodeSize$kotlin_stdlib(byte[] r6, int r7, int r8) {
            r5 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            int r0 = r8 - r7
            if (r0 != 0) goto Lb
            r1 = 0
            return r1
        Lb:
            r1 = 1
            if (r0 == r1) goto L49
            boolean r1 = r5.isMimeScheme
            if (r1 == 0) goto L2d
            r1 = r7
        L13:
            if (r1 >= r8) goto L3f
            r2 = r6[r1]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int[] r3 = kotlin.io.encoding.Base64Kt.access$getBase64DecodeMap$p()
            r3 = r3[r2]
            if (r3 >= 0) goto L2a
            r4 = -2
            if (r3 != r4) goto L28
            int r4 = r8 - r1
            int r0 = r0 - r4
            goto L3f
        L28:
            int r0 = r0 + (-1)
        L2a:
            int r1 = r1 + 1
            goto L13
        L2d:
            int r1 = r8 + (-1)
            r1 = r6[r1]
            r2 = 61
            if (r1 != r2) goto L3f
            int r0 = r0 + (-1)
            int r1 = r8 + (-2)
            r1 = r6[r1]
            if (r1 != r2) goto L3f
            int r0 = r0 + (-1)
        L3f:
            long r1 = (long) r0
            r3 = 6
            long r3 = (long) r3
            long r1 = r1 * r3
            r3 = 8
            long r3 = (long) r3
            long r1 = r1 / r3
            int r1 = (int) r1
            return r1
        L49:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Input should have at least 2 symbols for Base64 decoding, startIndex: "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r7)
            java.lang.String r3 = ", endIndex: "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r8)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    public final java.lang.String encode(byte[] r4, int r5, int r6) {
            r3 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            byte[] r0 = r3.encodeToByteArrayImpl$kotlin_stdlib(r4, r5, r6)
            java.lang.String r1 = new java.lang.String
            java.nio.charset.Charset r2 = kotlin.text.Charsets.ISO_8859_1
            r1.<init>(r0, r2)
            return r1
    }

    public final int encodeIntoByteArray(byte[] r2, byte[] r3, int r4, int r5, int r6) {
            r1 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "destination"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            int r0 = r1.encodeIntoByteArrayImpl$kotlin_stdlib(r2, r3, r4, r5, r6)
            return r0
    }

    public final int encodeIntoByteArrayImpl$kotlin_stdlib(byte[] r21, byte[] r22, int r23, int r24, int r25) {
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = r22
            r3 = r23
            r4 = r24
            r5 = r25
            java.lang.String r6 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r6)
            java.lang.String r6 = "destination"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r6)
            int r6 = r1.length
            r0.checkSourceBounds$kotlin_stdlib(r6, r4, r5)
            int r6 = r2.length
            int r7 = r5 - r4
            int r7 = r0.encodeSize$kotlin_stdlib(r7)
            r0.checkDestinationBounds(r6, r3, r7)
            boolean r6 = r0.isUrlSafe
            if (r6 == 0) goto L2d
            byte[] r6 = kotlin.io.encoding.Base64Kt.access$getBase64UrlEncodeMap$p()
            goto L31
        L2d:
            byte[] r6 = kotlin.io.encoding.Base64Kt.access$getBase64EncodeMap$p()
        L31:
            r7 = r24
            r8 = r23
            boolean r9 = r0.isMimeScheme
            if (r9 == 0) goto L3c
            r9 = 19
            goto L3f
        L3c:
            r9 = 2147483647(0x7fffffff, float:NaN)
        L3f:
            int r10 = r7 + 2
            r11 = 0
            r12 = 1
            if (r10 >= r5) goto La8
            int r10 = r5 - r7
            int r10 = r10 / 3
            int r10 = java.lang.Math.min(r10, r9)
            r13 = 0
        L4e:
            if (r13 >= r10) goto L93
            int r14 = r7 + 1
            r7 = r1[r7]
            r7 = r7 & 255(0xff, float:3.57E-43)
            int r15 = r14 + 1
            r14 = r1[r14]
            r14 = r14 & 255(0xff, float:3.57E-43)
            int r16 = r15 + 1
            r15 = r1[r15]
            r15 = r15 & 255(0xff, float:3.57E-43)
            int r17 = r7 << 16
            int r18 = r14 << 8
            r17 = r17 | r18
            r17 = r17 | r15
            int r18 = r8 + 1
            int r19 = r17 >>> 18
            r19 = r6[r19]
            r2[r8] = r19
            int r8 = r18 + 1
            int r19 = r17 >>> 12
            r19 = r19 & 63
            r19 = r6[r19]
            r2[r18] = r19
            int r18 = r8 + 1
            int r19 = r17 >>> 6
            r19 = r19 & 63
            r19 = r6[r19]
            r2[r8] = r19
            int r8 = r18 + 1
            r19 = r17 & 63
            r19 = r6[r19]
            r2[r18] = r19
            int r13 = r13 + 1
            r7 = r16
            goto L4e
        L93:
            if (r10 != r9) goto L3f
            if (r7 == r5) goto L3f
            int r13 = r8 + 1
            byte[] r14 = kotlin.io.encoding.Base64.mimeLineSeparatorSymbols
            r11 = r14[r11]
            r2[r8] = r11
            int r8 = r13 + 1
            byte[] r11 = kotlin.io.encoding.Base64.mimeLineSeparatorSymbols
            r11 = r11[r12]
            r2[r13] = r11
            goto L3f
        La8:
            int r10 = r5 - r7
            r13 = 61
            switch(r10) {
                case 1: goto Lec;
                case 2: goto Lb0;
                default: goto Laf;
            }
        Laf:
            goto L115
        Lb0:
            int r10 = r7 + 1
            r7 = r1[r7]
            r7 = r7 & 255(0xff, float:3.57E-43)
            int r14 = r10 + 1
            r10 = r1[r10]
            r10 = r10 & 255(0xff, float:3.57E-43)
            int r15 = r7 << 10
            int r16 = r10 << 2
            r15 = r15 | r16
            int r16 = r8 + 1
            int r17 = r15 >>> 12
            r17 = r6[r17]
            r2[r8] = r17
            int r8 = r16 + 1
            int r17 = r15 >>> 6
            r17 = r17 & 63
            r17 = r6[r17]
            r2[r16] = r17
            int r16 = r8 + 1
            r17 = r15 & 63
            r17 = r6[r17]
            r2[r8] = r17
            boolean r8 = r0.shouldPadOnEncode()
            if (r8 == 0) goto Le8
            int r8 = r16 + 1
            r2[r16] = r13
            r7 = r14
            goto L115
        Le8:
            r7 = r14
            r8 = r16
            goto L115
        Lec:
            int r10 = r7 + 1
            r7 = r1[r7]
            r7 = r7 & 255(0xff, float:3.57E-43)
            int r14 = r7 << 4
            int r15 = r8 + 1
            int r16 = r14 >>> 6
            r16 = r6[r16]
            r2[r8] = r16
            int r8 = r15 + 1
            r16 = r14 & 63
            r16 = r6[r16]
            r2[r15] = r16
            boolean r15 = r0.shouldPadOnEncode()
            if (r15 == 0) goto L114
            int r15 = r8 + 1
            r2[r8] = r13
            int r8 = r15 + 1
            r2[r15] = r13
            r7 = r10
            goto L115
        L114:
            r7 = r10
        L115:
            if (r7 != r5) goto L118
            r11 = r12
        L118:
            if (r11 == 0) goto L11d
            int r10 = r8 - r3
            return r10
        L11d:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "Check failed."
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            throw r10
    }

    public final int encodeSize$kotlin_stdlib(int r6) {
            r5 = this;
            int r0 = r6 / 3
            int r1 = r6 % 3
            int r2 = r0 * 4
            if (r1 == 0) goto L13
            boolean r3 = r5.shouldPadOnEncode()
            if (r3 == 0) goto L10
            r3 = 4
            goto L12
        L10:
            int r3 = r1 + 1
        L12:
            int r2 = r2 + r3
        L13:
            boolean r3 = r5.isMimeScheme
            if (r3 == 0) goto L1e
            int r3 = r2 + (-1)
            int r3 = r3 / 76
            int r3 = r3 * 2
            int r2 = r2 + r3
        L1e:
            if (r2 < 0) goto L21
            return r2
        L21:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "Input is too big"
            r3.<init>(r4)
            throw r3
    }

    public final <A extends java.lang.Appendable> A encodeToAppendable(byte[] r4, A r5, int r6, int r7) {
            r3 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "destination"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            byte[] r0 = r3.encodeToByteArrayImpl$kotlin_stdlib(r4, r6, r7)
            java.lang.String r1 = new java.lang.String
            java.nio.charset.Charset r2 = kotlin.text.Charsets.ISO_8859_1
            r1.<init>(r0, r2)
            r0 = r1
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r5.append(r0)
            return r5
    }

    public final byte[] encodeToByteArray(byte[] r2, int r3, int r4) {
            r1 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            byte[] r0 = r1.encodeToByteArrayImpl$kotlin_stdlib(r2, r3, r4)
            return r0
    }

    public final byte[] encodeToByteArrayImpl$kotlin_stdlib(byte[] r8, int r9, int r10) {
            r7 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            int r0 = r8.length
            r7.checkSourceBounds$kotlin_stdlib(r0, r9, r10)
            int r0 = r10 - r9
            int r0 = r7.encodeSize$kotlin_stdlib(r0)
            byte[] r3 = new byte[r0]
            r4 = 0
            r1 = r7
            r2 = r8
            r5 = r9
            r6 = r10
            r1.encodeIntoByteArrayImpl$kotlin_stdlib(r2, r3, r4, r5, r6)
            return r3
    }

    public final kotlin.io.encoding.Base64.PaddingOption getPaddingOption$kotlin_stdlib() {
            r1 = this;
            kotlin.io.encoding.Base64$PaddingOption r0 = r1.paddingOption
            return r0
    }

    public final boolean isMimeScheme$kotlin_stdlib() {
            r1 = this;
            boolean r0 = r1.isMimeScheme
            return r0
    }

    public final boolean isUrlSafe$kotlin_stdlib() {
            r1 = this;
            boolean r0 = r1.isUrlSafe
            return r0
    }

    public final kotlin.io.encoding.Base64 withPadding(kotlin.io.encoding.Base64.PaddingOption r4) {
            r3 = this;
            java.lang.String r0 = "option"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            kotlin.io.encoding.Base64$PaddingOption r0 = r3.paddingOption
            if (r0 != r4) goto Lb
            r0 = r3
            goto L14
        Lb:
            kotlin.io.encoding.Base64 r0 = new kotlin.io.encoding.Base64
            boolean r1 = r3.isUrlSafe
            boolean r2 = r3.isMimeScheme
            r0.<init>(r1, r2, r4)
        L14:
            return r0
    }
}
