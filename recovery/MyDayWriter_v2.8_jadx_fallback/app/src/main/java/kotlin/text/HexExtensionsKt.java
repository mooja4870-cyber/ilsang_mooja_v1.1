package kotlin.text;

/* JADX INFO: compiled from: HexExtensions.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000v\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0007\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u0019\n\u0002\b\u0004\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\n\n\u0002\b\u0005\n\u0002\u0010\u0001\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a \u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0002\u001a\u0010\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u000eH\u0002\u001a(\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u0011H\u0002\u001a@\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u0011H\u0000\u001a@\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u0011H\u0000\u001a \u0010\u001f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002\u001a5\u0010 \u001a\u00020\u0011*\u00020\u000b2\u0006\u0010!\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020\u00112\u0006\u0010#\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u000bH\u0082\b\u001a\u001c\u0010'\u001a\u00020\u0011*\u00020\u000b2\u0006\u0010!\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020\u0011H\u0002\u001a$\u0010(\u001a\u00020)*\u00020\u000b2\u0006\u0010*\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020\u00112\u0006\u0010+\u001a\u00020\u0011H\u0002\u001a<\u0010,\u001a\u00020)*\u00020\u000b2\u0006\u0010*\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020\u00112\u0006\u0010-\u001a\u00020\u000b2\u0006\u0010.\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020%2\u0006\u0010+\u001a\u00020\u0011H\u0002\u001a\u001c\u0010/\u001a\u00020)*\u00020\u000b2\u0006\u0010*\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020\u0011H\u0002\u001a\u0015\u00100\u001a\u00020\u0011*\u00020\u000b2\u0006\u0010!\u001a\u00020\u0011H\u0082\b\u001a,\u00101\u001a\u00020\u0011*\u0002022\u0006\u0010!\u001a\u00020\u00112\u0006\u00103\u001a\u00020\u00012\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u00020\u0011H\u0002\u001a<\u00101\u001a\u00020\u0011*\u0002022\u0006\u0010!\u001a\u00020\u00112\u0006\u00107\u001a\u00020\u000b2\u0006\u00108\u001a\u00020\u000b2\u0006\u00103\u001a\u00020\u00012\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u00020\u0011H\u0002\u001a*\u00109\u001a\u00020:*\u00020\u000b2\b\b\u0002\u0010*\u001a\u00020\u00112\b\b\u0002\u0010\"\u001a\u00020\u00112\b\b\u0002\u0010;\u001a\u00020<H\u0003\u001a\u0016\u00109\u001a\u00020:*\u00020\u000b2\b\b\u0002\u0010;\u001a\u00020<H\u0007\u001a*\u0010=\u001a\u000202*\u00020\u000b2\b\b\u0002\u0010*\u001a\u00020\u00112\b\b\u0002\u0010\"\u001a\u00020\u00112\b\b\u0002\u0010;\u001a\u00020<H\u0003\u001a\u0016\u0010=\u001a\u000202*\u00020\u000b2\b\b\u0002\u0010;\u001a\u00020<H\u0007\u001a&\u0010>\u001a\u0004\u0018\u000102*\u00020\u000b2\u0006\u0010*\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020\u00112\u0006\u0010?\u001a\u00020@H\u0003\u001a&\u0010A\u001a\u0004\u0018\u000102*\u00020\u000b2\u0006\u0010*\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020\u00112\u0006\u0010?\u001a\u00020@H\u0003\u001a&\u0010B\u001a\u0004\u0018\u000102*\u00020\u000b2\u0006\u0010*\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020\u00112\u0006\u0010?\u001a\u00020@H\u0003\u001a$\u0010C\u001a\u000202*\u00020\u000b2\u0006\u0010*\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020\u00112\u0006\u0010?\u001a\u00020@H\u0003\u001a*\u0010D\u001a\u00020\u0011*\u00020\u000b2\b\b\u0002\u0010*\u001a\u00020\u00112\b\b\u0002\u0010\"\u001a\u00020\u00112\b\b\u0002\u0010;\u001a\u00020<H\u0003\u001a\u0016\u0010D\u001a\u00020\u0011*\u00020\u000b2\b\b\u0002\u0010;\u001a\u00020<H\u0007\u001a,\u0010E\u001a\u00020\u0011*\u00020\u000b2\u0006\u0010*\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020\u00112\u0006\u0010;\u001a\u00020<2\u0006\u0010+\u001a\u00020\u0011H\u0003\u001a*\u0010F\u001a\u00020\u000e*\u00020\u000b2\b\b\u0002\u0010*\u001a\u00020\u00112\b\b\u0002\u0010\"\u001a\u00020\u00112\b\b\u0002\u0010;\u001a\u00020<H\u0001\u001a\u0016\u0010F\u001a\u00020\u000e*\u00020\u000b2\b\b\u0002\u0010;\u001a\u00020<H\u0007\u001a,\u0010G\u001a\u00020\u000e*\u00020\u000b2\u0006\u0010*\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020\u00112\u0006\u0010;\u001a\u00020<2\u0006\u0010+\u001a\u00020\u0011H\u0003\u001a*\u0010H\u001a\u00020I*\u00020\u000b2\b\b\u0002\u0010*\u001a\u00020\u00112\b\b\u0002\u0010\"\u001a\u00020\u00112\b\b\u0002\u0010;\u001a\u00020<H\u0003\u001a\u0016\u0010H\u001a\u00020I*\u00020\u000b2\b\b\u0002\u0010;\u001a\u00020<H\u0007\u001a\u0015\u0010J\u001a\u00020\u000e*\u00020\u000b2\u0006\u0010!\u001a\u00020\u0011H\u0082\b\u001a\u0014\u0010K\u001a\u00020:*\u00020\u000b2\u0006\u0010!\u001a\u00020\u0011H\u0002\u001a\u001c\u0010L\u001a\u00020\u0011*\u00020\u000b2\u0006\u0010*\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020\u0011H\u0002\u001a\u001c\u0010M\u001a\u00020\u000e*\u00020\u000b2\u0006\u0010*\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020\u0011H\u0002\u001a\u0014\u0010N\u001a\u00020O*\u00020\u000b2\u0006\u0010!\u001a\u00020\u0011H\u0002\u001a,\u0010P\u001a\u00020)*\u00020\u000b2\u0006\u0010*\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020\u00112\u0006\u0010Q\u001a\u00020\u000b2\u0006\u0010R\u001a\u00020\u0011H\u0002\u001a,\u0010S\u001a\u00020)*\u00020\u000b2\u0006\u0010*\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020\u00112\u0006\u0010-\u001a\u00020\u000b2\u0006\u0010.\u001a\u00020\u000bH\u0002\u001a,\u0010T\u001a\u00020)*\u00020\u000b2\u0006\u0010!\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020\u00112\u0006\u0010#\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020\u000bH\u0002\u001a\u001c\u0010U\u001a\u00020\u0011*\u00020\u000b2\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u00020\u0011H\u0002\u001a\u0016\u0010V\u001a\u00020\u000b*\u00020:2\b\b\u0002\u0010;\u001a\u00020<H\u0007\u001a*\u0010V\u001a\u00020\u000b*\u0002022\b\b\u0002\u0010*\u001a\u00020\u00112\b\b\u0002\u0010\"\u001a\u00020\u00112\b\b\u0002\u0010;\u001a\u00020<H\u0007\u001a\u0016\u0010V\u001a\u00020\u000b*\u0002022\b\b\u0002\u0010;\u001a\u00020<H\u0007\u001a\u0016\u0010V\u001a\u00020\u000b*\u00020\u00112\b\b\u0002\u0010;\u001a\u00020<H\u0007\u001a\u0016\u0010V\u001a\u00020\u000b*\u00020\u000e2\b\b\u0002\u0010;\u001a\u00020<H\u0007\u001a\u0016\u0010V\u001a\u00020\u000b*\u00020I2\b\b\u0002\u0010;\u001a\u00020<H\u0007\u001a$\u0010W\u001a\u00020\u000b*\u00020\u000e2\u0006\u0010X\u001a\u00020Y2\u0006\u0010Z\u001a\u00020\u000b2\u0006\u0010[\u001a\u00020\u0011H\u0003\u001a,\u0010\\\u001a\u00020\u000b*\u0002022\u0006\u0010*\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020\u00112\u0006\u0010?\u001a\u00020@2\u0006\u00103\u001a\u00020\u0001H\u0003\u001a,\u0010]\u001a\u00020\u000b*\u0002022\u0006\u0010*\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020\u00112\u0006\u0010?\u001a\u00020@2\u0006\u00103\u001a\u00020\u0001H\u0003\u001a,\u0010^\u001a\u00020\u000b*\u0002022\u0006\u0010*\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020\u00112\u0006\u0010?\u001a\u00020@2\u0006\u00103\u001a\u00020\u0001H\u0003\u001a,\u0010_\u001a\u00020\u000b*\u0002022\u0006\u0010*\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020\u00112\u0006\u0010?\u001a\u00020@2\u0006\u00103\u001a\u00020\u0001H\u0003\"\u001c\u0010\u0000\u001a\u00020\u00018\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000¨\u0006`"}, d2 = {"BYTE_TO_LOWER_CASE_HEX_DIGITS", "", "getBYTE_TO_LOWER_CASE_HEX_DIGITS$annotations", "()V", "getBYTE_TO_LOWER_CASE_HEX_DIGITS", "()[I", "BYTE_TO_UPPER_CASE_HEX_DIGITS", "HEX_DIGITS_TO_DECIMAL", "HEX_DIGITS_TO_LONG_DECIMAL", "", "LOWER_CASE_HEX_DIGITS", "", "UPPER_CASE_HEX_DIGITS", "charsPerSet", "", "charsPerElement", "elementsPerSet", "", "elementSeparatorLength", "checkFormatLength", "formatLength", "formattedStringLength", "numberOfBytes", "byteSeparatorLength", "bytePrefixLength", "byteSuffixLength", "bytesPerLine", "bytesPerGroup", "groupSeparatorLength", "parsedByteArrayMaxSize", "stringLength", "wholeElementsPerSet", "checkContainsAt", "index", "endIndex", "part", "ignoreCase", "", "partName", "checkNewLineAt", "checkNumberOfDigits", "", "startIndex", "typeHexLength", "checkPrefixSuffixNumberOfDigits", "prefix", "suffix", "checkZeroDigits", "decimalFromHexDigitAt", "formatByteAt", "", "byteToDigits", "destination", "", "destinationOffset", "bytePrefix", "byteSuffix", "hexToByte", "", "format", "Lkotlin/text/HexFormat;", "hexToByteArray", "hexToByteArrayNoLineAndGroupSeparator", "bytesFormat", "Lkotlin/text/HexFormat$BytesHexFormat;", "hexToByteArrayNoLineAndGroupSeparatorSlowPath", "hexToByteArrayShortByteSeparatorNoPrefixAndSuffix", "hexToByteArraySlowPath", "hexToInt", "hexToIntImpl", "hexToLong", "hexToLongImpl", "hexToShort", "", "longDecimalFromHexDigitAt", "parseByteAt", "parseInt", "parseLong", "throwInvalidDigitAt", "", "throwInvalidNumberOfDigits", "specifier", "expected", "throwInvalidPrefixSuffix", "throwNotContainedAt", "toCharArrayIfNotEmpty", "toHexString", "toHexStringImpl", "numberFormat", "Lkotlin/text/HexFormat$NumberHexFormat;", "digits", "bits", "toHexStringNoLineAndGroupSeparator", "toHexStringNoLineAndGroupSeparatorSlowPath", "toHexStringShortByteSeparatorNoPrefixAndSuffix", "toHexStringSlowPath", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class HexExtensionsKt {
    private static final int[] BYTE_TO_LOWER_CASE_HEX_DIGITS = null;
    private static final int[] BYTE_TO_UPPER_CASE_HEX_DIGITS = null;
    private static final int[] HEX_DIGITS_TO_DECIMAL = null;
    private static final long[] HEX_DIGITS_TO_LONG_DECIMAL = null;
    private static final java.lang.String LOWER_CASE_HEX_DIGITS = "0123456789abcdef";
    private static final java.lang.String UPPER_CASE_HEX_DIGITS = "0123456789ABCDEF";

    static {
            r0 = 256(0x100, float:3.59E-43)
            int[] r1 = new int[r0]
            r2 = 0
            r3 = r2
        L6:
            java.lang.String r4 = "0123456789abcdef"
            if (r3 >= r0) goto L1e
            int r5 = r3 >> 4
            char r5 = r4.charAt(r5)
            int r5 = r5 << 8
            r6 = r3 & 15
            char r4 = r4.charAt(r6)
            r4 = r4 | r5
            r1[r3] = r4
            int r3 = r3 + 1
            goto L6
        L1e:
            kotlin.text.HexExtensionsKt.BYTE_TO_LOWER_CASE_HEX_DIGITS = r1
            int[] r1 = new int[r0]
            r3 = r2
        L23:
            java.lang.String r5 = "0123456789ABCDEF"
            if (r3 >= r0) goto L3b
            int r6 = r3 >> 4
            char r6 = r5.charAt(r6)
            int r6 = r6 << 8
            r7 = r3 & 15
            char r5 = r5.charAt(r7)
            r5 = r5 | r6
            r1[r3] = r5
            int r3 = r3 + 1
            goto L23
        L3b:
            kotlin.text.HexExtensionsKt.BYTE_TO_UPPER_CASE_HEX_DIGITS = r1
            int[] r1 = new int[r0]
            r3 = r2
        L40:
            if (r3 >= r0) goto L48
            r6 = -1
            r1[r3] = r6
            int r3 = r3 + 1
            goto L40
        L48:
            r3 = r1
            r6 = 0
            r7 = r4
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            r8 = 0
            r9 = 0
            r10 = r2
        L50:
            int r11 = r7.length()
            if (r10 >= r11) goto L65
            char r11 = r7.charAt(r10)
            int r12 = r9 + 1
            r13 = r11
            r14 = 0
            r3[r13] = r9
            int r10 = r10 + 1
            r9 = r12
            goto L50
        L65:
            r7 = r5
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            r8 = 0
            r9 = 0
            r10 = r2
        L6c:
            int r11 = r7.length()
            if (r10 >= r11) goto L81
            char r11 = r7.charAt(r10)
            int r12 = r9 + 1
            r13 = r11
            r14 = 0
            r3[r13] = r9
            int r10 = r10 + 1
            r9 = r12
            goto L6c
        L81:
            kotlin.text.HexExtensionsKt.HEX_DIGITS_TO_DECIMAL = r1
            long[] r1 = new long[r0]
            r3 = r2
        L88:
            if (r3 >= r0) goto L91
            r6 = -1
            r1[r3] = r6
            int r3 = r3 + 1
            goto L88
        L91:
            r0 = r1
            r3 = 0
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            r6 = 0
            r7 = 0
            r8 = r2
        L98:
            int r9 = r4.length()
            if (r8 >= r9) goto Lae
            char r9 = r4.charAt(r8)
            int r10 = r7 + 1
            r11 = r9
            r12 = 0
            long r13 = (long) r7
            r0[r11] = r13
            int r8 = r8 + 1
            r7 = r10
            goto L98
        Lae:
            r4 = r5
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            r5 = 0
            r6 = 0
        Lb5:
            int r7 = r4.length()
            if (r2 >= r7) goto Lcb
            char r7 = r4.charAt(r2)
            int r8 = r6 + 1
            r9 = r7
            r10 = 0
            long r11 = (long) r6
            r0[r9] = r11
            int r2 = r2 + 1
            r6 = r8
            goto Lb5
        Lcb:
            kotlin.text.HexExtensionsKt.HEX_DIGITS_TO_LONG_DECIMAL = r1
            return
    }

    private static final long charsPerSet(long r8, int r10, int r11) {
            if (r10 <= 0) goto L4
            r0 = 1
            goto L5
        L4:
            r0 = 0
        L5:
            if (r0 == 0) goto L11
            long r0 = (long) r10
            long r0 = r0 * r8
            long r2 = (long) r11
            long r4 = (long) r10
            r6 = 1
            long r4 = r4 - r6
            long r2 = r2 * r4
            long r0 = r0 + r2
            return r0
        L11:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Failed requirement."
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    private static final int checkContainsAt(java.lang.String r5, int r6, int r7, java.lang.String r8, boolean r9, java.lang.String r10) {
            r0 = 0
            r1 = r8
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            int r1 = r1.length()
            if (r1 != 0) goto Lc
            r1 = 1
            goto Ld
        Lc:
            r1 = 0
        Ld:
            if (r1 == 0) goto L10
            return r6
        L10:
            r1 = 0
            r2 = r8
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            int r2 = r2.length()
        L18:
            if (r1 >= r2) goto L30
            char r3 = r8.charAt(r1)
            int r4 = r6 + r1
            char r4 = r5.charAt(r4)
            boolean r3 = kotlin.text.CharsKt.equals(r3, r4, r9)
            if (r3 != 0) goto L2d
            throwNotContainedAt(r5, r6, r7, r8, r10)
        L2d:
            int r1 = r1 + 1
            goto L18
        L30:
            int r1 = r8.length()
            int r1 = r1 + r6
            return r1
    }

    private static final int checkFormatLength(long r4) {
            r0 = 0
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            r1 = 0
            if (r0 > 0) goto Lf
            r2 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 > 0) goto Lf
            r1 = 1
        Lf:
            if (r1 == 0) goto L13
            int r0 = (int) r4
            return r0
        L13:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "The resulting string length is too big: "
            java.lang.StringBuilder r1 = r1.append(r2)
            long r2 = kotlin.ULong.m327constructorimpl(r4)
            java.lang.String r2 = kotlin.ULong.m373toStringimpl(r2)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    private static final int checkNewLineAt(java.lang.String r3, int r4, int r5) {
            char r0 = r3.charAt(r4)
            r1 = 13
            r2 = 10
            if (r0 != r1) goto L1c
            int r0 = r4 + 1
            if (r0 >= r5) goto L19
            int r0 = r4 + 1
            char r0 = r3.charAt(r0)
            if (r0 != r2) goto L19
            int r0 = r4 + 2
            goto L24
        L19:
            int r0 = r4 + 1
            goto L24
        L1c:
            char r0 = r3.charAt(r4)
            if (r0 != r2) goto L25
            int r0 = r4 + 1
        L24:
            return r0
        L25:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Expected a new line at index "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r4)
            java.lang.String r2 = ", but was "
            java.lang.StringBuilder r1 = r1.append(r2)
            char r2 = r3.charAt(r4)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    private static final void checkNumberOfDigits(java.lang.String r3, int r4, int r5, int r6) {
            int r0 = r5 - r4
            r1 = 1
            if (r0 >= r1) goto Lb
            java.lang.String r2 = "at least"
            throwInvalidNumberOfDigits(r3, r4, r5, r2, r1)
            goto L13
        Lb:
            if (r0 <= r6) goto L13
            int r1 = r4 + r0
            int r1 = r1 - r6
            checkZeroDigits(r3, r4, r1)
        L13:
            return
    }

    private static final void checkPrefixSuffixNumberOfDigits(java.lang.String r9, int r10, int r11, java.lang.String r12, java.lang.String r13, boolean r14, int r15) {
            int r0 = r11 - r10
            int r1 = r12.length()
            int r0 = r0 - r1
            int r1 = r13.length()
            if (r0 > r1) goto L10
            throwInvalidPrefixSuffix(r9, r10, r11, r12, r13)
        L10:
            java.lang.String r0 = "prefix"
            r1 = r9
            r2 = 0
            r3 = r12
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            int r3 = r3.length()
            r4 = 0
            r5 = 1
            if (r3 != 0) goto L21
            r3 = r5
            goto L22
        L21:
            r3 = r4
        L22:
            if (r3 == 0) goto L26
            r3 = r10
            goto L4b
        L26:
            r3 = 0
            r6 = r12
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            int r6 = r6.length()
        L2e:
            if (r3 >= r6) goto L46
            char r7 = r12.charAt(r3)
            int r8 = r10 + r3
            char r8 = r1.charAt(r8)
            boolean r7 = kotlin.text.CharsKt.equals(r7, r8, r14)
            if (r7 != 0) goto L43
            throwNotContainedAt(r1, r10, r11, r12, r0)
        L43:
            int r3 = r3 + 1
            goto L2e
        L46:
            int r3 = r12.length()
            int r3 = r3 + r10
        L4b:
            int r0 = r13.length()
            int r0 = r11 - r0
            java.lang.String r1 = "suffix"
            r2 = r9
            r6 = 0
            r7 = r13
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            int r7 = r7.length()
            if (r7 != 0) goto L60
            r4 = r5
        L60:
            if (r4 != 0) goto L85
            r4 = 0
            r5 = r13
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            int r5 = r5.length()
        L6a:
            if (r4 >= r5) goto L82
            char r7 = r13.charAt(r4)
            int r8 = r0 + r4
            char r8 = r2.charAt(r8)
            boolean r7 = kotlin.text.CharsKt.equals(r7, r8, r14)
            if (r7 != 0) goto L7f
            throwNotContainedAt(r2, r0, r11, r13, r1)
        L7f:
            int r4 = r4 + 1
            goto L6a
        L82:
            r13.length()
        L85:
            checkNumberOfDigits(r9, r3, r0, r15)
            return
    }

    private static final void checkZeroDigits(java.lang.String r4, int r5, int r6) {
            r0 = r5
        L1:
            if (r0 >= r6) goto L3b
            char r1 = r4.charAt(r0)
            r2 = 48
            if (r1 != r2) goto Le
            int r0 = r0 + 1
            goto L1
        Le:
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Expected the hexadecimal digit '0' at index "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r0)
            java.lang.String r3 = ", but was '"
            java.lang.StringBuilder r2 = r2.append(r3)
            char r3 = r4.charAt(r0)
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = "'.\nThe result won't fit the type being parsed."
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L3b:
            return
    }

    private static final int decimalFromHexDigitAt(java.lang.String r3, int r4) {
            r0 = 0
            char r1 = r3.charAt(r4)
            int r2 = r1 >>> 8
            if (r2 != 0) goto L14
            int[] r2 = kotlin.text.HexExtensionsKt.HEX_DIGITS_TO_DECIMAL
            r2 = r2[r1]
            if (r2 < 0) goto L14
            int[] r2 = kotlin.text.HexExtensionsKt.HEX_DIGITS_TO_DECIMAL
            r2 = r2[r1]
            return r2
        L14:
            throwInvalidDigitAt(r3, r4)
            kotlin.KotlinNothingValueException r2 = new kotlin.KotlinNothingValueException
            r2.<init>()
            throw r2
    }

    private static final int formatByteAt(byte[] r2, int r3, java.lang.String r4, java.lang.String r5, int[] r6, char[] r7, int r8) {
            int r0 = toCharArrayIfNotEmpty(r4, r7, r8)
            int r0 = formatByteAt(r2, r3, r6, r7, r0)
            int r1 = toCharArrayIfNotEmpty(r5, r7, r0)
            return r1
    }

    private static final int formatByteAt(byte[] r4, int r5, int[] r6, char[] r7, int r8) {
            r0 = r4[r5]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = r6[r0]
            int r2 = r1 >> 8
            char r2 = (char) r2
            r7[r8] = r2
            int r2 = r8 + 1
            r3 = r1 & 255(0xff, float:3.57E-43)
            char r3 = (char) r3
            r7[r2] = r3
            int r2 = r8 + 2
            return r2
    }

    private static final int formattedStringLength(int r6, int r7, int r8, int r9) {
            if (r6 <= 0) goto L4
            r0 = 1
            goto L5
        L4:
            r0 = 0
        L5:
            if (r0 == 0) goto L18
            r0 = 2
            long r2 = (long) r8
            long r2 = r2 + r0
            long r0 = (long) r9
            long r2 = r2 + r0
            long r0 = (long) r7
            long r2 = r2 + r0
            long r0 = (long) r6
            long r0 = r0 * r2
            long r4 = (long) r7
            long r0 = r0 - r4
            int r4 = checkFormatLength(r0)
            return r4
        L18:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Failed requirement."
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public static final int formattedStringLength(int r16, int r17, int r18, int r19, int r20, int r21, int r22) {
            r0 = r16
            if (r0 <= 0) goto L6
            r1 = 1
            goto L7
        L6:
            r1 = 0
        L7:
            if (r1 == 0) goto L44
            int r1 = r0 + (-1)
            int r1 = r1 / r17
            r2 = 0
            int r3 = r17 + (-1)
            int r3 = r3 / r18
            int r4 = r0 % r17
            r5 = 0
            if (r4 != 0) goto L19
            r4 = r17
        L19:
            int r5 = r4 + (-1)
            int r5 = r5 / r18
            int r6 = r1 * r3
            int r6 = r6 + r5
            int r2 = r0 + (-1)
            int r2 = r2 - r1
            int r2 = r2 - r6
            long r3 = (long) r1
            long r7 = (long) r6
            r5 = r19
            long r9 = (long) r5
            long r7 = r7 * r9
            long r3 = r3 + r7
            long r7 = (long) r2
            r9 = r20
            long r10 = (long) r9
            long r7 = r7 * r10
            long r3 = r3 + r7
            long r7 = (long) r0
            r10 = r21
            long r11 = (long) r10
            r13 = 2
            long r11 = r11 + r13
            r13 = r22
            long r14 = (long) r13
            long r11 = r11 + r14
            long r7 = r7 * r11
            long r3 = r3 + r7
            int r7 = checkFormatLength(r3)
            return r7
        L44:
            r5 = r19
            r9 = r20
            r10 = r21
            r13 = r22
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Failed requirement."
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    public static final int[] getBYTE_TO_LOWER_CASE_HEX_DIGITS() {
            int[] r0 = kotlin.text.HexExtensionsKt.BYTE_TO_LOWER_CASE_HEX_DIGITS
            return r0
    }

    public static /* synthetic */ void getBYTE_TO_LOWER_CASE_HEX_DIGITS$annotations() {
            return
    }

    private static final byte hexToByte(java.lang.String r1, int r2, int r3, kotlin.text.HexFormat r4) {
            r0 = 2
            int r0 = hexToIntImpl(r1, r2, r3, r4, r0)
            byte r0 = (byte) r0
            return r0
    }

    public static final byte hexToByte(java.lang.String r2, kotlin.text.HexFormat r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "format"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = 0
            int r1 = r2.length()
            byte r0 = hexToByte(r2, r0, r1, r3)
            return r0
    }

    static /* synthetic */ byte hexToByte$default(java.lang.String r0, int r1, int r2, kotlin.text.HexFormat r3, int r4, java.lang.Object r5) {
            r5 = r4 & 1
            if (r5 == 0) goto L5
            r1 = 0
        L5:
            r5 = r4 & 2
            if (r5 == 0) goto Ld
            int r2 = r0.length()
        Ld:
            r4 = r4 & 4
            if (r4 == 0) goto L17
            kotlin.text.HexFormat$Companion r3 = kotlin.text.HexFormat.Companion
            kotlin.text.HexFormat r3 = r3.getDefault()
        L17:
            byte r0 = hexToByte(r0, r1, r2, r3)
            return r0
    }

    public static /* synthetic */ byte hexToByte$default(java.lang.String r0, kotlin.text.HexFormat r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto La
            kotlin.text.HexFormat$Companion r1 = kotlin.text.HexFormat.Companion
            kotlin.text.HexFormat r1 = r1.getDefault()
        La:
            byte r0 = hexToByte(r0, r1)
            return r0
    }

    private static final byte[] hexToByteArray(java.lang.String r3, int r4, int r5, kotlin.text.HexFormat r6) {
            kotlin.collections.AbstractList$Companion r0 = kotlin.collections.AbstractList.Companion
            int r1 = r3.length()
            r0.checkBoundsIndexes$kotlin_stdlib(r4, r5, r1)
            if (r4 != r5) goto Lf
            r0 = 0
            byte[] r0 = new byte[r0]
            return r0
        Lf:
            kotlin.text.HexFormat$BytesHexFormat r0 = r6.getBytes()
            boolean r1 = r0.getNoLineAndGroupSeparator$kotlin_stdlib()
            if (r1 == 0) goto L21
            byte[] r1 = hexToByteArrayNoLineAndGroupSeparator(r3, r4, r5, r0)
            if (r1 == 0) goto L21
            r2 = 0
            return r1
        L21:
            byte[] r1 = hexToByteArraySlowPath(r3, r4, r5, r0)
            return r1
    }

    public static final byte[] hexToByteArray(java.lang.String r2, kotlin.text.HexFormat r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "format"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = 0
            int r1 = r2.length()
            byte[] r0 = hexToByteArray(r2, r0, r1, r3)
            return r0
    }

    static /* synthetic */ byte[] hexToByteArray$default(java.lang.String r0, int r1, int r2, kotlin.text.HexFormat r3, int r4, java.lang.Object r5) {
            r5 = r4 & 1
            if (r5 == 0) goto L5
            r1 = 0
        L5:
            r5 = r4 & 2
            if (r5 == 0) goto Ld
            int r2 = r0.length()
        Ld:
            r4 = r4 & 4
            if (r4 == 0) goto L17
            kotlin.text.HexFormat$Companion r3 = kotlin.text.HexFormat.Companion
            kotlin.text.HexFormat r3 = r3.getDefault()
        L17:
            byte[] r0 = hexToByteArray(r0, r1, r2, r3)
            return r0
    }

    public static /* synthetic */ byte[] hexToByteArray$default(java.lang.String r0, kotlin.text.HexFormat r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto La
            kotlin.text.HexFormat$Companion r1 = kotlin.text.HexFormat.Companion
            kotlin.text.HexFormat r1 = r1.getDefault()
        La:
            byte[] r0 = hexToByteArray(r0, r1)
            return r0
    }

    private static final byte[] hexToByteArrayNoLineAndGroupSeparator(java.lang.String r1, int r2, int r3, kotlin.text.HexFormat.BytesHexFormat r4) {
            boolean r0 = r4.getShortByteSeparatorNoPrefixAndSuffix$kotlin_stdlib()
            if (r0 == 0) goto Lb
            byte[] r0 = hexToByteArrayShortByteSeparatorNoPrefixAndSuffix(r1, r2, r3, r4)
            return r0
        Lb:
            byte[] r0 = hexToByteArrayNoLineAndGroupSeparatorSlowPath(r1, r2, r3, r4)
            return r0
    }

    private static final byte[] hexToByteArrayNoLineAndGroupSeparatorSlowPath(java.lang.String r28, int r29, int r30, kotlin.text.HexFormat.BytesHexFormat r31) {
            r0 = r28
            r1 = r30
            java.lang.String r2 = r31.getBytePrefix()
            java.lang.String r3 = r31.getByteSuffix()
            java.lang.String r4 = r31.getByteSeparator()
            int r5 = r4.length()
            int r6 = r2.length()
            long r6 = (long) r6
            r8 = 2
            long r6 = r6 + r8
            int r8 = r3.length()
            long r8 = (long) r8
            long r6 = r6 + r8
            long r8 = (long) r5
            long r6 = r6 + r8
            int r8 = r1 - r29
            long r8 = (long) r8
            long r10 = (long) r5
            long r10 = r10 + r8
            long r10 = r10 / r6
            int r10 = (int) r10
            long r11 = (long) r10
            long r11 = r11 * r6
            long r13 = (long) r5
            long r11 = r11 - r13
            int r11 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r11 == 0) goto L35
            r11 = 0
            return r11
        L35:
            boolean r11 = r31.getIgnoreCase$kotlin_stdlib()
            byte[] r12 = new byte[r10]
            r13 = r29
            java.lang.String r14 = "byte prefix"
            r15 = r28
            r16 = 0
            r17 = r2
            java.lang.CharSequence r17 = (java.lang.CharSequence) r17
            int r17 = r17.length()
            r18 = 0
            r19 = 1
            if (r17 != 0) goto L54
            r17 = r19
            goto L56
        L54:
            r17 = r18
        L56:
            if (r17 == 0) goto L5e
            r21 = r5
            r22 = r6
            r5 = r13
            goto L8f
        L5e:
            r17 = 0
            r20 = r2
            java.lang.CharSequence r20 = (java.lang.CharSequence) r20
            r21 = r5
            int r5 = r20.length()
            r22 = r6
            r6 = r17
        L6e:
            if (r6 >= r5) goto L8a
            char r7 = r2.charAt(r6)
            r17 = r5
            int r5 = r13 + r6
            char r5 = r15.charAt(r5)
            boolean r5 = kotlin.text.CharsKt.equals(r7, r5, r11)
            if (r5 != 0) goto L85
            throwNotContainedAt(r15, r13, r1, r2, r14)
        L85:
            int r6 = r6 + 1
            r5 = r17
            goto L6e
        L8a:
            int r5 = r2.length()
            int r5 = r5 + r13
        L8f:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.StringBuilder r6 = r6.append(r3)
            java.lang.StringBuilder r6 = r6.append(r4)
            java.lang.StringBuilder r6 = r6.append(r2)
            java.lang.String r6 = r6.toString()
            r7 = 0
            int r13 = r10 + (-1)
        La8:
            if (r7 >= r13) goto L11a
            byte r14 = parseByteAt(r0, r5)
            r12[r7] = r14
            int r14 = r5 + 2
            java.lang.String r15 = "byte suffix + byte separator + byte prefix"
            r16 = r28
            r17 = 0
            r20 = r6
            java.lang.CharSequence r20 = (java.lang.CharSequence) r20
            int r20 = r20.length()
            if (r20 != 0) goto Lc5
            r20 = r19
            goto Lc7
        Lc5:
            r20 = r18
        Lc7:
            if (r20 == 0) goto Ld0
            r25 = r2
            r24 = r4
            r27 = r7
            goto L112
        Ld0:
            r20 = 0
            r24 = r6
            java.lang.CharSequence r24 = (java.lang.CharSequence) r24
            r25 = r2
            int r2 = r24.length()
            r24 = r4
            r4 = r20
        Le0:
            if (r4 >= r2) goto L106
            r20 = r2
            char r2 = r6.charAt(r4)
            r26 = r4
            int r4 = r14 + r26
            r27 = r7
            r7 = r16
            char r4 = r7.charAt(r4)
            boolean r2 = kotlin.text.CharsKt.equals(r2, r4, r11)
            if (r2 != 0) goto Lfd
            throwNotContainedAt(r7, r14, r1, r6, r15)
        Lfd:
            int r4 = r26 + 1
            r16 = r7
            r2 = r20
            r7 = r27
            goto Le0
        L106:
            r26 = r4
            r27 = r7
            r7 = r16
            int r2 = r6.length()
            int r2 = r2 + r14
            r14 = r2
        L112:
            r5 = r14
            int r7 = r27 + 1
            r4 = r24
            r2 = r25
            goto La8
        L11a:
            r25 = r2
            r24 = r4
            r27 = r7
            int r2 = r10 + (-1)
            byte r4 = parseByteAt(r0, r5)
            r12[r2] = r4
            int r2 = r5 + 2
            java.lang.String r4 = "byte suffix"
            r7 = r28
            r13 = 0
            r14 = r3
            java.lang.CharSequence r14 = (java.lang.CharSequence) r14
            int r14 = r14.length()
            if (r14 != 0) goto L13a
            r18 = r19
        L13a:
            if (r18 != 0) goto L168
            r14 = 0
            r15 = r3
            java.lang.CharSequence r15 = (java.lang.CharSequence) r15
            int r15 = r15.length()
        L144:
            if (r14 >= r15) goto L162
            char r0 = r3.charAt(r14)
            r16 = r5
            int r5 = r2 + r14
            char r5 = r7.charAt(r5)
            boolean r0 = kotlin.text.CharsKt.equals(r0, r5, r11)
            if (r0 != 0) goto L15b
            throwNotContainedAt(r7, r2, r1, r3, r4)
        L15b:
            int r14 = r14 + 1
            r0 = r28
            r5 = r16
            goto L144
        L162:
            r16 = r5
            r3.length()
            goto L16a
        L168:
            r16 = r5
        L16a:
            return r12
    }

    private static final byte[] hexToByteArrayShortByteSeparatorNoPrefixAndSuffix(java.lang.String r19, int r20, int r21, kotlin.text.HexFormat.BytesHexFormat r22) {
            r0 = r19
            r1 = r21
            java.lang.String r2 = r22.getByteSeparator()
            int r2 = r2.length()
            r3 = 0
            r4 = 1
            if (r2 > r4) goto L12
            r5 = r4
            goto L13
        L12:
            r5 = r3
        L13:
            if (r5 == 0) goto Lbd
            int r5 = r1 - r20
            r6 = 0
            r7 = 0
            if (r2 != 0) goto L33
            r3 = r5 & 1
            if (r3 == 0) goto L20
            return r7
        L20:
            int r3 = r5 >> 1
            byte[] r4 = new byte[r3]
            r7 = 0
        L25:
            if (r7 >= r3) goto L32
            byte r8 = parseByteAt(r0, r6)
            r4[r7] = r8
            int r6 = r6 + 2
            int r7 = r7 + 1
            goto L25
        L32:
            return r4
        L33:
            int r8 = r5 % 3
            r9 = 2
            if (r8 == r9) goto L39
            return r7
        L39:
            int r7 = r5 / 3
            int r7 = r7 + r4
            byte[] r8 = new byte[r7]
            java.lang.String r10 = r22.getByteSeparator()
            char r10 = r10.charAt(r3)
            byte r11 = parseByteAt(r0, r6)
            r8[r3] = r11
            int r6 = r6 + r9
            r9 = 1
        L4e:
            if (r9 >= r7) goto Lbc
            char r11 = r0.charAt(r6)
            if (r11 == r10) goto La9
            java.lang.String r11 = r22.getByteSeparator()
            boolean r12 = r22.getIgnoreCase$kotlin_stdlib()
            java.lang.String r13 = "byte separator"
            r14 = r19
            r15 = 0
            r16 = r11
            java.lang.CharSequence r16 = (java.lang.CharSequence) r16
            int r16 = r16.length()
            if (r16 != 0) goto L70
            r16 = r4
            goto L72
        L70:
            r16 = r3
        L72:
            if (r16 != 0) goto La6
            r16 = 0
            r17 = r11
            java.lang.CharSequence r17 = (java.lang.CharSequence) r17
            int r3 = r17.length()
            r4 = r16
        L80:
            if (r4 >= r3) goto La0
            r16 = r2
            char r2 = r11.charAt(r4)
            r18 = r3
            int r3 = r6 + r4
            char r3 = r14.charAt(r3)
            boolean r2 = kotlin.text.CharsKt.equals(r2, r3, r12)
            if (r2 != 0) goto L99
            throwNotContainedAt(r14, r6, r1, r11, r13)
        L99:
            int r4 = r4 + 1
            r2 = r16
            r3 = r18
            goto L80
        La0:
            r16 = r2
            r11.length()
            goto Lab
        La6:
            r16 = r2
            goto Lab
        La9:
            r16 = r2
        Lab:
            int r2 = r6 + 1
            byte r2 = parseByteAt(r0, r2)
            r8[r9] = r2
            int r6 = r6 + 3
            int r9 = r9 + 1
            r2 = r16
            r3 = 0
            r4 = 1
            goto L4e
        Lbc:
            return r8
        Lbd:
            r16 = r2
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Failed requirement."
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
    }

    private static final byte[] hexToByteArraySlowPath(java.lang.String r24, int r25, int r26, kotlin.text.HexFormat.BytesHexFormat r27) {
            r0 = r24
            r1 = r26
            int r3 = r27.getBytesPerLine()
            int r4 = r27.getBytesPerGroup()
            java.lang.String r9 = r27.getBytePrefix()
            java.lang.String r10 = r27.getByteSuffix()
            java.lang.String r11 = r27.getByteSeparator()
            java.lang.String r12 = r27.getGroupSeparator()
            boolean r13 = r27.getIgnoreCase$kotlin_stdlib()
            int r2 = r1 - r25
            int r5 = r12.length()
            int r6 = r11.length()
            int r7 = r9.length()
            int r8 = r10.length()
            int r2 = parsedByteArrayMaxSize(r2, r3, r4, r5, r6, r7, r8)
            byte[] r5 = new byte[r2]
            r6 = r25
            r7 = 0
            r8 = 0
            r14 = 0
        L3f:
            if (r6 >= r1) goto L1d6
            r16 = 1
            if (r8 != r3) goto L53
            int r6 = checkNewLineAt(r0, r6, r1)
            r8 = 0
            r14 = 0
            r21 = r2
            r20 = r3
            r23 = r4
            goto L11c
        L53:
            if (r14 != r4) goto Lc4
            java.lang.String r17 = "group separator"
            r18 = r24
            r19 = r17
            r17 = 0
            r20 = r12
            java.lang.CharSequence r20 = (java.lang.CharSequence) r20
            int r20 = r20.length()
            if (r20 != 0) goto L6a
            r20 = r16
            goto L6c
        L6a:
            r20 = 0
        L6c:
            if (r20 == 0) goto L76
            r21 = r2
            r20 = r3
            r23 = r4
            r3 = r6
            goto Lc1
        L76:
            r20 = 0
            r21 = r12
            java.lang.CharSequence r21 = (java.lang.CharSequence) r21
            int r15 = r21.length()
            r21 = r2
            r2 = r20
        L84:
            if (r2 >= r15) goto Lb2
            r20 = r3
            char r3 = r12.charAt(r2)
            r22 = r2
            int r2 = r6 + r22
            r23 = r4
            r4 = r18
            char r2 = r4.charAt(r2)
            boolean r2 = kotlin.text.CharsKt.equals(r3, r2, r13)
            if (r2 != 0) goto La4
            r2 = r19
            throwNotContainedAt(r4, r6, r1, r12, r2)
            goto La6
        La4:
            r2 = r19
        La6:
            int r3 = r22 + 1
            r19 = r2
            r2 = r3
            r18 = r4
            r3 = r20
            r4 = r23
            goto L84
        Lb2:
            r22 = r2
            r20 = r3
            r23 = r4
            r4 = r18
            r2 = r19
            int r3 = r12.length()
            int r3 = r3 + r6
        Lc1:
            r6 = r3
            r14 = 0
            goto L11c
        Lc4:
            r21 = r2
            r20 = r3
            r23 = r4
            if (r14 == 0) goto L11a
            java.lang.String r2 = "byte separator"
            r3 = r24
            r4 = 0
            r15 = r11
            java.lang.CharSequence r15 = (java.lang.CharSequence) r15
            int r15 = r15.length()
            if (r15 != 0) goto Ldd
            r15 = r16
            goto Lde
        Ldd:
            r15 = 0
        Lde:
            if (r15 == 0) goto Le4
            r4 = r6
            r19 = r8
            goto L116
        Le4:
            r15 = 0
            r17 = r11
            java.lang.CharSequence r17 = (java.lang.CharSequence) r17
            r18 = r4
            int r4 = r17.length()
        Lef:
            if (r15 >= r4) goto L10f
            r17 = r4
            char r4 = r11.charAt(r15)
            r19 = r8
            int r8 = r6 + r15
            char r8 = r3.charAt(r8)
            boolean r4 = kotlin.text.CharsKt.equals(r4, r8, r13)
            if (r4 != 0) goto L108
            throwNotContainedAt(r3, r6, r1, r11, r2)
        L108:
            int r15 = r15 + 1
            r4 = r17
            r8 = r19
            goto Lef
        L10f:
            r19 = r8
            int r4 = r11.length()
            int r4 = r4 + r6
        L116:
            r6 = r4
            r8 = r19
            goto L11c
        L11a:
            r19 = r8
        L11c:
            int r8 = r8 + 1
            int r14 = r14 + 1
            java.lang.String r2 = "byte prefix"
            r3 = r24
            r4 = 0
            r15 = r9
            java.lang.CharSequence r15 = (java.lang.CharSequence) r15
            int r15 = r15.length()
            if (r15 != 0) goto L131
            r15 = r16
            goto L132
        L131:
            r15 = 0
        L132:
            if (r15 == 0) goto L138
            r4 = r6
            r19 = r8
            goto L16a
        L138:
            r15 = 0
            r17 = r9
            java.lang.CharSequence r17 = (java.lang.CharSequence) r17
            r18 = r4
            int r4 = r17.length()
        L143:
            if (r15 >= r4) goto L163
            r17 = r4
            char r4 = r9.charAt(r15)
            r19 = r8
            int r8 = r6 + r15
            char r8 = r3.charAt(r8)
            boolean r4 = kotlin.text.CharsKt.equals(r4, r8, r13)
            if (r4 != 0) goto L15c
            throwNotContainedAt(r3, r6, r1, r9, r2)
        L15c:
            int r15 = r15 + 1
            r4 = r17
            r8 = r19
            goto L143
        L163:
            r19 = r8
            int r4 = r9.length()
            int r4 = r4 + r6
        L16a:
            int r2 = r1 + (-2)
            if (r2 >= r4) goto L175
            java.lang.String r2 = "exactly"
            r3 = 2
            throwInvalidNumberOfDigits(r0, r4, r1, r2, r3)
        L175:
            int r2 = r7 + 1
            byte r3 = parseByteAt(r0, r4)
            r5[r7] = r3
            int r3 = r4 + 2
            java.lang.String r6 = "byte suffix"
            r7 = r24
            r8 = 0
            r15 = r10
            java.lang.CharSequence r15 = (java.lang.CharSequence) r15
            int r15 = r15.length()
            if (r15 != 0) goto L190
            r15 = r16
            goto L191
        L190:
            r15 = 0
        L191:
            if (r15 == 0) goto L196
            r17 = r2
            goto L1c7
        L196:
            r15 = 0
            r16 = r10
            java.lang.CharSequence r16 = (java.lang.CharSequence) r16
            int r0 = r16.length()
        L19f:
            if (r15 >= r0) goto L1bf
            r16 = r0
            char r0 = r10.charAt(r15)
            r17 = r2
            int r2 = r3 + r15
            char r2 = r7.charAt(r2)
            boolean r0 = kotlin.text.CharsKt.equals(r0, r2, r13)
            if (r0 != 0) goto L1b8
            throwNotContainedAt(r7, r3, r1, r10, r6)
        L1b8:
            int r15 = r15 + 1
            r0 = r16
            r2 = r17
            goto L19f
        L1bf:
            r17 = r2
            int r0 = r10.length()
            int r0 = r0 + r3
            r3 = r0
        L1c7:
            r6 = r3
            r0 = r24
            r7 = r17
            r8 = r19
            r3 = r20
            r2 = r21
            r4 = r23
            goto L3f
        L1d6:
            r21 = r2
            r20 = r3
            r23 = r4
            r19 = r8
            int r0 = r5.length
            if (r7 != r0) goto L1e3
            r0 = r5
            goto L1ec
        L1e3:
            byte[] r0 = java.util.Arrays.copyOf(r5, r7)
            java.lang.String r2 = "copyOf(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)
        L1ec:
            return r0
    }

    private static final int hexToInt(java.lang.String r1, int r2, int r3, kotlin.text.HexFormat r4) {
            r0 = 8
            int r0 = hexToIntImpl(r1, r2, r3, r4, r0)
            return r0
    }

    public static final int hexToInt(java.lang.String r2, kotlin.text.HexFormat r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "format"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = 0
            int r1 = r2.length()
            int r0 = hexToInt(r2, r0, r1, r3)
            return r0
    }

    static /* synthetic */ int hexToInt$default(java.lang.String r0, int r1, int r2, kotlin.text.HexFormat r3, int r4, java.lang.Object r5) {
            r5 = r4 & 1
            if (r5 == 0) goto L5
            r1 = 0
        L5:
            r5 = r4 & 2
            if (r5 == 0) goto Ld
            int r2 = r0.length()
        Ld:
            r4 = r4 & 4
            if (r4 == 0) goto L17
            kotlin.text.HexFormat$Companion r3 = kotlin.text.HexFormat.Companion
            kotlin.text.HexFormat r3 = r3.getDefault()
        L17:
            int r0 = hexToInt(r0, r1, r2, r3)
            return r0
    }

    public static /* synthetic */ int hexToInt$default(java.lang.String r0, kotlin.text.HexFormat r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto La
            kotlin.text.HexFormat$Companion r1 = kotlin.text.HexFormat.Companion
            kotlin.text.HexFormat r1 = r1.getDefault()
        La:
            int r0 = hexToInt(r0, r1)
            return r0
    }

    private static final int hexToIntImpl(java.lang.String r9, int r10, int r11, kotlin.text.HexFormat r12, int r13) {
            kotlin.collections.AbstractList$Companion r0 = kotlin.collections.AbstractList.Companion
            int r1 = r9.length()
            r0.checkBoundsIndexes$kotlin_stdlib(r10, r11, r1)
            kotlin.text.HexFormat$NumberHexFormat r0 = r12.getNumber()
            boolean r1 = r0.isDigitsOnly$kotlin_stdlib()
            if (r1 == 0) goto L1b
            checkNumberOfDigits(r9, r10, r11, r13)
            int r1 = parseInt(r9, r10, r11)
            return r1
        L1b:
            java.lang.String r5 = r0.getPrefix()
            java.lang.String r6 = r0.getSuffix()
            boolean r7 = r0.getIgnoreCase$kotlin_stdlib()
            r2 = r9
            r3 = r10
            r4 = r11
            r8 = r13
            checkPrefixSuffixNumberOfDigits(r2, r3, r4, r5, r6, r7, r8)
            int r9 = r5.length()
            int r10 = r3 + r9
            int r9 = r6.length()
            int r11 = r4 - r9
            int r9 = parseInt(r2, r10, r11)
            return r9
    }

    public static final long hexToLong(java.lang.String r2, int r3, int r4, kotlin.text.HexFormat r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "format"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = 16
            long r0 = hexToLongImpl(r2, r3, r4, r5, r0)
            return r0
    }

    public static final long hexToLong(java.lang.String r2, kotlin.text.HexFormat r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "format"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = 0
            int r1 = r2.length()
            long r0 = hexToLong(r2, r0, r1, r3)
            return r0
    }

    public static /* synthetic */ long hexToLong$default(java.lang.String r0, int r1, int r2, kotlin.text.HexFormat r3, int r4, java.lang.Object r5) {
            r5 = r4 & 1
            if (r5 == 0) goto L5
            r1 = 0
        L5:
            r5 = r4 & 2
            if (r5 == 0) goto Ld
            int r2 = r0.length()
        Ld:
            r4 = r4 & 4
            if (r4 == 0) goto L17
            kotlin.text.HexFormat$Companion r3 = kotlin.text.HexFormat.Companion
            kotlin.text.HexFormat r3 = r3.getDefault()
        L17:
            long r0 = hexToLong(r0, r1, r2, r3)
            return r0
    }

    public static /* synthetic */ long hexToLong$default(java.lang.String r0, kotlin.text.HexFormat r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto La
            kotlin.text.HexFormat$Companion r1 = kotlin.text.HexFormat.Companion
            kotlin.text.HexFormat r1 = r1.getDefault()
        La:
            long r0 = hexToLong(r0, r1)
            return r0
    }

    private static final long hexToLongImpl(java.lang.String r10, int r11, int r12, kotlin.text.HexFormat r13, int r14) {
            kotlin.collections.AbstractList$Companion r0 = kotlin.collections.AbstractList.Companion
            int r1 = r10.length()
            r0.checkBoundsIndexes$kotlin_stdlib(r11, r12, r1)
            kotlin.text.HexFormat$NumberHexFormat r0 = r13.getNumber()
            boolean r1 = r0.isDigitsOnly$kotlin_stdlib()
            if (r1 == 0) goto L1b
            checkNumberOfDigits(r10, r11, r12, r14)
            long r1 = parseLong(r10, r11, r12)
            return r1
        L1b:
            java.lang.String r6 = r0.getPrefix()
            java.lang.String r7 = r0.getSuffix()
            boolean r8 = r0.getIgnoreCase$kotlin_stdlib()
            r3 = r10
            r4 = r11
            r5 = r12
            r9 = r14
            checkPrefixSuffixNumberOfDigits(r3, r4, r5, r6, r7, r8, r9)
            int r10 = r6.length()
            int r11 = r4 + r10
            int r10 = r7.length()
            int r12 = r5 - r10
            long r10 = parseLong(r3, r11, r12)
            return r10
    }

    private static final short hexToShort(java.lang.String r1, int r2, int r3, kotlin.text.HexFormat r4) {
            r0 = 4
            int r0 = hexToIntImpl(r1, r2, r3, r4, r0)
            short r0 = (short) r0
            return r0
    }

    public static final short hexToShort(java.lang.String r2, kotlin.text.HexFormat r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "format"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = 0
            int r1 = r2.length()
            short r0 = hexToShort(r2, r0, r1, r3)
            return r0
    }

    static /* synthetic */ short hexToShort$default(java.lang.String r0, int r1, int r2, kotlin.text.HexFormat r3, int r4, java.lang.Object r5) {
            r5 = r4 & 1
            if (r5 == 0) goto L5
            r1 = 0
        L5:
            r5 = r4 & 2
            if (r5 == 0) goto Ld
            int r2 = r0.length()
        Ld:
            r4 = r4 & 4
            if (r4 == 0) goto L17
            kotlin.text.HexFormat$Companion r3 = kotlin.text.HexFormat.Companion
            kotlin.text.HexFormat r3 = r3.getDefault()
        L17:
            short r0 = hexToShort(r0, r1, r2, r3)
            return r0
    }

    public static /* synthetic */ short hexToShort$default(java.lang.String r0, kotlin.text.HexFormat r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto La
            kotlin.text.HexFormat$Companion r1 = kotlin.text.HexFormat.Companion
            kotlin.text.HexFormat r1 = r1.getDefault()
        La:
            short r0 = hexToShort(r0, r1)
            return r0
    }

    private static final long longDecimalFromHexDigitAt(java.lang.String r7, int r8) {
            r0 = 0
            char r1 = r7.charAt(r8)
            int r2 = r1 >>> 8
            if (r2 != 0) goto L18
            long[] r2 = kotlin.text.HexExtensionsKt.HEX_DIGITS_TO_LONG_DECIMAL
            r3 = r2[r1]
            r5 = 0
            int r2 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r2 < 0) goto L18
            long[] r2 = kotlin.text.HexExtensionsKt.HEX_DIGITS_TO_LONG_DECIMAL
            r3 = r2[r1]
            return r3
        L18:
            throwInvalidDigitAt(r7, r8)
            kotlin.KotlinNothingValueException r2 = new kotlin.KotlinNothingValueException
            r2.<init>()
            throw r2
    }

    private static final byte parseByteAt(java.lang.String r6, int r7) {
            r0 = r6
            r1 = 0
            char r2 = r0.charAt(r7)
            int r3 = r2 >>> 8
            if (r3 != 0) goto L3a
            int[] r3 = kotlin.text.HexExtensionsKt.HEX_DIGITS_TO_DECIMAL
            r3 = r3[r2]
            if (r3 < 0) goto L3a
            int[] r3 = kotlin.text.HexExtensionsKt.HEX_DIGITS_TO_DECIMAL
            r3 = r3[r2]
            int r0 = r7 + 1
            r1 = r6
            r2 = 0
            char r4 = r1.charAt(r0)
            int r5 = r4 >>> 8
            if (r5 != 0) goto L31
            int[] r5 = kotlin.text.HexExtensionsKt.HEX_DIGITS_TO_DECIMAL
            r5 = r5[r4]
            if (r5 < 0) goto L31
            int[] r5 = kotlin.text.HexExtensionsKt.HEX_DIGITS_TO_DECIMAL
            r5 = r5[r4]
            int r0 = r3 << 4
            r0 = r0 | r5
            byte r0 = (byte) r0
            return r0
        L31:
            throwInvalidDigitAt(r1, r0)
            kotlin.KotlinNothingValueException r5 = new kotlin.KotlinNothingValueException
            r5.<init>()
            throw r5
        L3a:
            throwInvalidDigitAt(r0, r7)
            kotlin.KotlinNothingValueException r3 = new kotlin.KotlinNothingValueException
            r3.<init>()
            throw r3
    }

    private static final int parseInt(java.lang.String r7, int r8, int r9) {
            r0 = 0
            r1 = r8
        L2:
            if (r1 >= r9) goto L28
            int r2 = r0 << 4
            r3 = r7
            r4 = 0
            char r5 = r3.charAt(r1)
            int r6 = r5 >>> 8
            if (r6 != 0) goto L1f
            int[] r6 = kotlin.text.HexExtensionsKt.HEX_DIGITS_TO_DECIMAL
            r6 = r6[r5]
            if (r6 < 0) goto L1f
            int[] r6 = kotlin.text.HexExtensionsKt.HEX_DIGITS_TO_DECIMAL
            r6 = r6[r5]
            r0 = r2 | r6
            int r1 = r1 + 1
            goto L2
        L1f:
            throwInvalidDigitAt(r3, r1)
            kotlin.KotlinNothingValueException r2 = new kotlin.KotlinNothingValueException
            r2.<init>()
            throw r2
        L28:
            return r0
    }

    private static final long parseLong(java.lang.String r13, int r14, int r15) {
            r0 = 0
            r2 = r14
        L3:
            if (r2 >= r15) goto L2e
            r3 = 4
            long r3 = r0 << r3
            r5 = r13
            r6 = 0
            char r7 = r5.charAt(r2)
            int r8 = r7 >>> 8
            if (r8 != 0) goto L25
            long[] r8 = kotlin.text.HexExtensionsKt.HEX_DIGITS_TO_LONG_DECIMAL
            r9 = r8[r7]
            r11 = 0
            int r8 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r8 < 0) goto L25
            long[] r8 = kotlin.text.HexExtensionsKt.HEX_DIGITS_TO_LONG_DECIMAL
            r9 = r8[r7]
            long r0 = r3 | r9
            int r2 = r2 + 1
            goto L3
        L25:
            throwInvalidDigitAt(r5, r2)
            kotlin.KotlinNothingValueException r3 = new kotlin.KotlinNothingValueException
            r3.<init>()
            throw r3
        L2e:
            return r0
    }

    public static final int parsedByteArrayMaxSize(int r22, int r23, int r24, int r25, int r26, int r27, int r28) {
            r0 = r22
            r1 = r23
            r2 = r24
            r3 = r25
            r4 = r26
            if (r0 <= 0) goto Le
            r7 = 1
            goto Lf
        Le:
            r7 = 0
        Lf:
            if (r7 == 0) goto L73
            r7 = r27
            long r8 = (long) r7
            r10 = 2
            long r8 = r8 + r10
            r10 = r28
            long r11 = (long) r10
            long r8 = r8 + r11
            long r11 = charsPerSet(r8, r2, r4)
            if (r1 > r2) goto L26
            long r13 = charsPerSet(r8, r1, r4)
            goto L38
        L26:
            int r13 = r1 / r2
            long r14 = charsPerSet(r11, r13, r3)
            int r5 = r1 % r2
            if (r5 == 0) goto L37
            long r6 = (long) r3
            long r14 = r14 + r6
            long r6 = charsPerSet(r8, r5, r4)
            long r14 = r14 + r6
        L37:
            r13 = r14
        L38:
            long r5 = (long) r0
            r7 = 1
            long r16 = wholeElementsPerSet(r5, r13, r7)
            r18 = 1
            long r18 = r13 + r18
            long r18 = r18 * r16
            long r5 = r5 - r18
            long r18 = wholeElementsPerSet(r5, r11, r3)
            r20 = r8
            long r7 = (long) r3
            long r7 = r7 + r11
            long r7 = r7 * r18
            long r5 = r5 - r7
            r7 = r20
            long r20 = wholeElementsPerSet(r5, r7, r4)
            long r9 = (long) r4
            long r9 = r9 + r7
            long r9 = r9 * r20
            long r5 = r5 - r9
            r9 = 0
            int r9 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r9 <= 0) goto L65
            r15 = 1
            goto L66
        L65:
            r15 = 0
        L66:
            long r9 = (long) r1
            long r9 = r9 * r16
            long r0 = (long) r2
            long r0 = r0 * r18
            long r9 = r9 + r0
            long r9 = r9 + r20
            long r0 = (long) r15
            long r9 = r9 + r0
            int r0 = (int) r9
            return r0
        L73:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Failed requirement."
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    private static final java.lang.Void throwInvalidDigitAt(java.lang.String r3, int r4) {
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Expected a hexadecimal digit at index "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r4)
            java.lang.String r2 = ", but was "
            java.lang.StringBuilder r1 = r1.append(r2)
            char r2 = r3.charAt(r4)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    private static final void throwInvalidNumberOfDigits(java.lang.String r4, int r5, int r6, java.lang.String r7, int r8) {
            java.lang.String r0 = "null cannot be cast to non-null type java.lang.String"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4, r0)
            java.lang.String r0 = r4.substring(r5, r6)
            java.lang.String r1 = "substring(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Expected "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r7)
            r3 = 32
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r8)
            java.lang.String r3 = " hexadecimal digits at index "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r5)
            java.lang.String r3 = ", but was \""
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r0)
            java.lang.String r3 = "\" of length "
            java.lang.StringBuilder r2 = r2.append(r3)
            int r3 = r6 - r5
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    private static final void throwInvalidPrefixSuffix(java.lang.String r4, int r5, int r6, java.lang.String r7, java.lang.String r8) {
            java.lang.String r0 = "null cannot be cast to non-null type java.lang.String"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4, r0)
            java.lang.String r0 = r4.substring(r5, r6)
            java.lang.String r1 = "substring(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Expected a hexadecimal number with prefix \""
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r7)
            java.lang.String r3 = "\" and suffix \""
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r8)
            java.lang.String r3 = "\", but was "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r0)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    private static final void throwNotContainedAt(java.lang.String r4, int r5, int r6, java.lang.String r7, java.lang.String r8) {
            int r0 = r7.length()
            int r0 = r0 + r5
            int r0 = kotlin.ranges.RangesKt.coerceAtMost(r0, r6)
            java.lang.String r1 = "null cannot be cast to non-null type java.lang.String"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4, r1)
            java.lang.String r0 = r4.substring(r5, r0)
            java.lang.String r1 = "substring(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Expected "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r8)
            java.lang.String r3 = " \""
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r7)
            java.lang.String r3 = "\" at index "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r5)
            java.lang.String r3 = ", but was "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r0)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    private static final int toCharArrayIfNotEmpty(java.lang.String r3, char[] r4, int r5) {
            int r0 = r3.length()
            r1 = 0
            switch(r0) {
                case 0: goto L1b;
                case 1: goto L15;
                default: goto L8;
            }
        L8:
            int r0 = r3.length()
            java.lang.String r2 = "null cannot be cast to non-null type java.lang.String"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3, r2)
            r3.getChars(r1, r0, r4, r5)
            goto L1b
        L15:
            char r0 = r3.charAt(r1)
            r4[r5] = r0
        L1b:
            int r0 = r3.length()
            int r0 = r0 + r5
            return r0
    }

    public static final java.lang.String toHexString(byte r8, kotlin.text.HexFormat r9) {
            java.lang.String r0 = "format"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            boolean r0 = r9.getUpperCase()
            if (r0 == 0) goto Le
            java.lang.String r0 = "0123456789ABCDEF"
            goto L10
        Le:
            java.lang.String r0 = "0123456789abcdef"
        L10:
            kotlin.text.HexFormat$NumberHexFormat r1 = r9.getNumber()
            boolean r2 = r1.isDigitsOnlyAndNoPadding$kotlin_stdlib()
            if (r2 == 0) goto L50
            r2 = 2
            char[] r3 = new char[r2]
            r4 = r8
            int r5 = r4 >> 4
            r5 = r5 & 15
            char r5 = r0.charAt(r5)
            r6 = 0
            r3[r6] = r5
            r5 = r4 & 15
            char r5 = r0.charAt(r5)
            r7 = 1
            r3[r7] = r5
            boolean r5 = r1.getRemoveLeadingZeros()
            if (r5 == 0) goto L4b
            r5 = r8 & 255(0xff, float:3.57E-43)
            int r5 = java.lang.Integer.numberOfLeadingZeros(r5)
            int r5 = r5 + (-24)
            int r5 = r5 >> r2
            int r5 = kotlin.ranges.RangesKt.coerceAtMost(r5, r7)
            r7 = 0
            java.lang.String r2 = kotlin.text.StringsKt.concatToString$default(r3, r5, r6, r2, r7)
            goto L4f
        L4b:
            java.lang.String r2 = kotlin.text.StringsKt.concatToString(r3)
        L4f:
            return r2
        L50:
            long r2 = (long) r8
            r4 = 8
            java.lang.String r2 = toHexStringImpl(r2, r1, r0, r4)
            return r2
    }

    public static final java.lang.String toHexString(int r8, kotlin.text.HexFormat r9) {
            java.lang.String r0 = "format"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            boolean r0 = r9.getUpperCase()
            if (r0 == 0) goto Le
            java.lang.String r0 = "0123456789ABCDEF"
            goto L10
        Le:
            java.lang.String r0 = "0123456789abcdef"
        L10:
            kotlin.text.HexFormat$NumberHexFormat r1 = r9.getNumber()
            boolean r2 = r1.isDigitsOnlyAndNoPadding$kotlin_stdlib()
            if (r2 == 0) goto L8f
            r2 = 8
            char[] r2 = new char[r2]
            r3 = r8
            int r4 = r3 >> 28
            r4 = r4 & 15
            char r4 = r0.charAt(r4)
            r5 = 0
            r2[r5] = r4
            int r4 = r3 >> 24
            r4 = r4 & 15
            char r4 = r0.charAt(r4)
            r6 = 1
            r2[r6] = r4
            int r4 = r3 >> 20
            r4 = r4 & 15
            char r4 = r0.charAt(r4)
            r6 = 2
            r2[r6] = r4
            int r4 = r3 >> 16
            r4 = r4 & 15
            char r4 = r0.charAt(r4)
            r7 = 3
            r2[r7] = r4
            int r4 = r3 >> 12
            r4 = r4 & 15
            char r4 = r0.charAt(r4)
            r7 = 4
            r2[r7] = r4
            int r4 = r3 >> 8
            r4 = r4 & 15
            char r4 = r0.charAt(r4)
            r7 = 5
            r2[r7] = r4
            int r4 = r3 >> 4
            r4 = r4 & 15
            char r4 = r0.charAt(r4)
            r7 = 6
            r2[r7] = r4
            r4 = r3 & 15
            char r4 = r0.charAt(r4)
            r7 = 7
            r2[r7] = r4
            boolean r4 = r1.getRemoveLeadingZeros()
            if (r4 == 0) goto L8a
            int r4 = java.lang.Integer.numberOfLeadingZeros(r8)
            int r4 = r4 >> r6
            int r4 = kotlin.ranges.RangesKt.coerceAtMost(r4, r7)
            r7 = 0
            java.lang.String r4 = kotlin.text.StringsKt.concatToString$default(r2, r4, r5, r6, r7)
            goto L8e
        L8a:
            java.lang.String r4 = kotlin.text.StringsKt.concatToString(r2)
        L8e:
            return r4
        L8f:
            long r2 = (long) r8
            r4 = 32
            java.lang.String r2 = toHexStringImpl(r2, r1, r0, r4)
            return r2
    }

    public static final java.lang.String toHexString(long r16, kotlin.text.HexFormat r18) {
            java.lang.String r0 = "format"
            r1 = r18
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            boolean r0 = r1.getUpperCase()
            if (r0 == 0) goto L10
            java.lang.String r0 = "0123456789ABCDEF"
            goto L12
        L10:
            java.lang.String r0 = "0123456789abcdef"
        L12:
            kotlin.text.HexFormat$NumberHexFormat r2 = r1.getNumber()
            boolean r3 = r2.isDigitsOnlyAndNoPadding$kotlin_stdlib()
            if (r3 == 0) goto L10a
            r3 = 16
            char[] r4 = new char[r3]
            r5 = r16
            r7 = 60
            long r7 = r5 >> r7
            r9 = 15
            long r7 = r7 & r9
            int r7 = (int) r7
            char r7 = r0.charAt(r7)
            r8 = 0
            r4[r8] = r7
            r7 = 56
            long r11 = r5 >> r7
            long r11 = r11 & r9
            int r7 = (int) r11
            char r7 = r0.charAt(r7)
            r11 = 1
            r4[r11] = r7
            r7 = 52
            long r11 = r5 >> r7
            long r11 = r11 & r9
            int r7 = (int) r11
            char r7 = r0.charAt(r7)
            r11 = 2
            r4[r11] = r7
            r7 = 48
            long r12 = r5 >> r7
            long r12 = r12 & r9
            int r7 = (int) r12
            char r7 = r0.charAt(r7)
            r12 = 3
            r4[r12] = r7
            r7 = 44
            long r12 = r5 >> r7
            long r12 = r12 & r9
            int r7 = (int) r12
            char r7 = r0.charAt(r7)
            r12 = 4
            r4[r12] = r7
            r7 = 40
            long r13 = r5 >> r7
            long r13 = r13 & r9
            int r7 = (int) r13
            char r7 = r0.charAt(r7)
            r13 = 5
            r4[r13] = r7
            r7 = 36
            long r13 = r5 >> r7
            long r13 = r13 & r9
            int r7 = (int) r13
            char r7 = r0.charAt(r7)
            r13 = 6
            r4[r13] = r7
            r7 = 32
            long r13 = r5 >> r7
            long r13 = r13 & r9
            int r7 = (int) r13
            char r7 = r0.charAt(r7)
            r13 = 7
            r4[r13] = r7
            r7 = 28
            long r13 = r5 >> r7
            long r13 = r13 & r9
            int r7 = (int) r13
            char r7 = r0.charAt(r7)
            r13 = 8
            r4[r13] = r7
            r7 = 24
            long r14 = r5 >> r7
            long r14 = r14 & r9
            int r7 = (int) r14
            char r7 = r0.charAt(r7)
            r14 = 9
            r4[r14] = r7
            r7 = 20
            long r14 = r5 >> r7
            long r14 = r14 & r9
            int r7 = (int) r14
            char r7 = r0.charAt(r7)
            r14 = 10
            r4[r14] = r7
            long r14 = r5 >> r3
            long r14 = r14 & r9
            int r3 = (int) r14
            char r3 = r0.charAt(r3)
            r7 = 11
            r4[r7] = r3
            r3 = 12
            long r14 = r5 >> r3
            long r14 = r14 & r9
            int r7 = (int) r14
            char r7 = r0.charAt(r7)
            r4[r3] = r7
            long r13 = r5 >> r13
            long r13 = r13 & r9
            int r3 = (int) r13
            char r3 = r0.charAt(r3)
            r7 = 13
            r4[r7] = r3
            long r12 = r5 >> r12
            long r12 = r12 & r9
            int r3 = (int) r12
            char r3 = r0.charAt(r3)
            r7 = 14
            r4[r7] = r3
            long r9 = r9 & r5
            int r3 = (int) r9
            char r3 = r0.charAt(r3)
            r7 = 15
            r4[r7] = r3
            boolean r3 = r2.getRemoveLeadingZeros()
            if (r3 == 0) goto L105
            int r3 = java.lang.Long.numberOfLeadingZeros(r16)
            int r3 = r3 >> r11
            int r3 = kotlin.ranges.RangesKt.coerceAtMost(r3, r7)
            r7 = 0
            java.lang.String r3 = kotlin.text.StringsKt.concatToString$default(r4, r3, r8, r11, r7)
            goto L109
        L105:
            java.lang.String r3 = kotlin.text.StringsKt.concatToString(r4)
        L109:
            return r3
        L10a:
            r3 = 64
            r4 = r16
            java.lang.String r3 = toHexStringImpl(r4, r2, r0, r3)
            return r3
    }

    public static final java.lang.String toHexString(short r9, kotlin.text.HexFormat r10) {
            java.lang.String r0 = "format"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            boolean r0 = r10.getUpperCase()
            if (r0 == 0) goto Le
            java.lang.String r0 = "0123456789ABCDEF"
            goto L10
        Le:
            java.lang.String r0 = "0123456789abcdef"
        L10:
            kotlin.text.HexFormat$NumberHexFormat r1 = r10.getNumber()
            boolean r2 = r1.isDigitsOnlyAndNoPadding$kotlin_stdlib()
            r3 = 16
            if (r2 == 0) goto L6a
            r2 = 4
            char[] r2 = new char[r2]
            r4 = r9
            int r5 = r4 >> 12
            r5 = r5 & 15
            char r5 = r0.charAt(r5)
            r6 = 0
            r2[r6] = r5
            int r5 = r4 >> 8
            r5 = r5 & 15
            char r5 = r0.charAt(r5)
            r7 = 1
            r2[r7] = r5
            int r5 = r4 >> 4
            r5 = r5 & 15
            char r5 = r0.charAt(r5)
            r7 = 2
            r2[r7] = r5
            r5 = r4 & 15
            char r5 = r0.charAt(r5)
            r8 = 3
            r2[r8] = r5
            boolean r5 = r1.getRemoveLeadingZeros()
            if (r5 == 0) goto L65
            r5 = 65535(0xffff, float:9.1834E-41)
            r5 = r5 & r9
            int r5 = java.lang.Integer.numberOfLeadingZeros(r5)
            int r5 = r5 - r3
            int r3 = r5 >> 2
            int r3 = kotlin.ranges.RangesKt.coerceAtMost(r3, r8)
            r5 = 0
            java.lang.String r3 = kotlin.text.StringsKt.concatToString$default(r2, r3, r6, r7, r5)
            goto L69
        L65:
            java.lang.String r3 = kotlin.text.StringsKt.concatToString(r2)
        L69:
            return r3
        L6a:
            long r4 = (long) r9
            java.lang.String r2 = toHexStringImpl(r4, r1, r0, r3)
            return r2
    }

    public static final java.lang.String toHexString(byte[] r3, int r4, int r5, kotlin.text.HexFormat r6) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "format"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            kotlin.collections.AbstractList$Companion r0 = kotlin.collections.AbstractList.Companion
            int r1 = r3.length
            r0.checkBoundsIndexes$kotlin_stdlib(r4, r5, r1)
            if (r4 != r5) goto L15
            java.lang.String r0 = ""
            return r0
        L15:
            boolean r0 = r6.getUpperCase()
            if (r0 == 0) goto L1e
            int[] r0 = kotlin.text.HexExtensionsKt.BYTE_TO_UPPER_CASE_HEX_DIGITS
            goto L20
        L1e:
            int[] r0 = kotlin.text.HexExtensionsKt.BYTE_TO_LOWER_CASE_HEX_DIGITS
        L20:
            kotlin.text.HexFormat$BytesHexFormat r1 = r6.getBytes()
            boolean r2 = r1.getNoLineAndGroupSeparator$kotlin_stdlib()
            if (r2 == 0) goto L2f
            java.lang.String r2 = toHexStringNoLineAndGroupSeparator(r3, r4, r5, r1, r0)
            return r2
        L2f:
            java.lang.String r2 = toHexStringSlowPath(r3, r4, r5, r1, r0)
            return r2
    }

    public static final java.lang.String toHexString(byte[] r2, kotlin.text.HexFormat r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "format"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = 0
            int r1 = r2.length
            java.lang.String r0 = toHexString(r2, r0, r1, r3)
            return r0
    }

    public static /* synthetic */ java.lang.String toHexString$default(byte r0, kotlin.text.HexFormat r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto La
            kotlin.text.HexFormat$Companion r1 = kotlin.text.HexFormat.Companion
            kotlin.text.HexFormat r1 = r1.getDefault()
        La:
            java.lang.String r0 = toHexString(r0, r1)
            return r0
    }

    public static /* synthetic */ java.lang.String toHexString$default(int r0, kotlin.text.HexFormat r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto La
            kotlin.text.HexFormat$Companion r1 = kotlin.text.HexFormat.Companion
            kotlin.text.HexFormat r1 = r1.getDefault()
        La:
            java.lang.String r0 = toHexString(r0, r1)
            return r0
    }

    public static /* synthetic */ java.lang.String toHexString$default(long r0, kotlin.text.HexFormat r2, int r3, java.lang.Object r4) {
            r3 = r3 & 1
            if (r3 == 0) goto La
            kotlin.text.HexFormat$Companion r2 = kotlin.text.HexFormat.Companion
            kotlin.text.HexFormat r2 = r2.getDefault()
        La:
            java.lang.String r0 = toHexString(r0, r2)
            return r0
    }

    public static /* synthetic */ java.lang.String toHexString$default(short r0, kotlin.text.HexFormat r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto La
            kotlin.text.HexFormat$Companion r1 = kotlin.text.HexFormat.Companion
            kotlin.text.HexFormat r1 = r1.getDefault()
        La:
            java.lang.String r0 = toHexString(r0, r1)
            return r0
    }

    public static /* synthetic */ java.lang.String toHexString$default(byte[] r0, int r1, int r2, kotlin.text.HexFormat r3, int r4, java.lang.Object r5) {
            r5 = r4 & 1
            if (r5 == 0) goto L5
            r1 = 0
        L5:
            r5 = r4 & 2
            if (r5 == 0) goto La
            int r2 = r0.length
        La:
            r4 = r4 & 4
            if (r4 == 0) goto L14
            kotlin.text.HexFormat$Companion r3 = kotlin.text.HexFormat.Companion
            kotlin.text.HexFormat r3 = r3.getDefault()
        L14:
            java.lang.String r0 = toHexString(r0, r1, r2, r3)
            return r0
    }

    public static /* synthetic */ java.lang.String toHexString$default(byte[] r0, kotlin.text.HexFormat r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto La
            kotlin.text.HexFormat$Companion r1 = kotlin.text.HexFormat.Companion
            kotlin.text.HexFormat r1 = r1.getDefault()
        La:
            java.lang.String r0 = toHexString(r0, r1)
            return r0
    }

    private static final java.lang.String toHexStringImpl(long r24, kotlin.text.HexFormat.NumberHexFormat r26, java.lang.String r27, int r28) {
            r0 = r27
            r1 = r28 & 3
            r3 = 0
            if (r1 != 0) goto L9
            r1 = 1
            goto La
        L9:
            r1 = r3
        La:
            if (r1 == 0) goto L96
            r4 = r24
            int r1 = r28 >> 2
            int r6 = r26.getMinLength()
            int r7 = r6 - r1
            int r7 = kotlin.ranges.RangesKt.coerceAtLeast(r7, r3)
            java.lang.String r8 = r26.getPrefix()
            java.lang.String r9 = r26.getSuffix()
            r10 = 0
            boolean r10 = r26.getRemoveLeadingZeros()
            int r11 = r8.length()
            long r11 = (long) r11
            long r13 = (long) r7
            long r11 = r11 + r13
            long r13 = (long) r1
            long r11 = r11 + r13
            int r13 = r9.length()
            long r13 = (long) r13
            long r11 = r11 + r13
            int r13 = checkFormatLength(r11)
            char[] r13 = new char[r13]
            r14 = 0
            int r14 = toCharArrayIfNotEmpty(r8, r13, r3)
            if (r7 <= 0) goto L4d
            char r15 = r0.charAt(r3)
            int r2 = r14 + r7
            kotlin.collections.ArraysKt.fill(r13, r15, r14, r2)
            int r14 = r14 + r7
        L4d:
            r2 = 0
            r2 = r28
            r15 = r3
        L51:
            if (r15 >= r1) goto L80
            r16 = r15
            r17 = 0
            int r2 = r2 + (-4)
            long r18 = r4 >> r2
            r20 = 15
            r22 = r4
            long r3 = r18 & r20
            int r3 = (int) r3
            if (r10 == 0) goto L6c
            if (r3 != 0) goto L6c
            int r4 = r2 >> 2
            if (r4 < r6) goto L6c
            r4 = 1
            goto L6d
        L6c:
            r4 = 0
        L6d:
            r10 = r4
            if (r10 != 0) goto L79
            int r4 = r14 + 1
            char r5 = r0.charAt(r3)
            r13[r14] = r5
            r14 = r4
        L79:
            int r15 = r15 + 1
            r4 = r22
            r3 = 0
            goto L51
        L80:
            r22 = r4
            int r3 = toCharArrayIfNotEmpty(r9, r13, r14)
            int r4 = r13.length
            if (r3 != r4) goto L8e
            java.lang.String r4 = kotlin.text.StringsKt.concatToString(r13)
            goto L95
        L8e:
            r4 = 0
            r5 = 1
            r14 = 0
            java.lang.String r4 = kotlin.text.StringsKt.concatToString$default(r13, r14, r3, r5, r4)
        L95:
            return r4
        L96:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Failed requirement."
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    private static final java.lang.String toHexStringNoLineAndGroupSeparator(byte[] r1, int r2, int r3, kotlin.text.HexFormat.BytesHexFormat r4, int[] r5) {
            boolean r0 = r4.getShortByteSeparatorNoPrefixAndSuffix$kotlin_stdlib()
            if (r0 == 0) goto Lb
            java.lang.String r0 = toHexStringShortByteSeparatorNoPrefixAndSuffix(r1, r2, r3, r4, r5)
            return r0
        Lb:
            java.lang.String r0 = toHexStringNoLineAndGroupSeparatorSlowPath(r1, r2, r3, r4, r5)
            return r0
    }

    private static final java.lang.String toHexStringNoLineAndGroupSeparatorSlowPath(byte[] r9, int r10, int r11, kotlin.text.HexFormat.BytesHexFormat r12, int[] r13) {
            java.lang.String r2 = r12.getBytePrefix()
            java.lang.String r3 = r12.getByteSuffix()
            java.lang.String r7 = r12.getByteSeparator()
            int r0 = r11 - r10
            int r1 = r7.length()
            int r4 = r2.length()
            int r5 = r3.length()
            int r8 = formattedStringLength(r0, r1, r4, r5)
            char[] r5 = new char[r8]
            r6 = 0
            r0 = r9
            r1 = r10
            r4 = r13
            int r9 = formatByteAt(r0, r1, r2, r3, r4, r5, r6)
            int r13 = r10 + 1
            r1 = r13
        L2b:
            if (r1 >= r11) goto L38
            int r6 = toCharArrayIfNotEmpty(r7, r5, r9)
            int r9 = formatByteAt(r0, r1, r2, r3, r4, r5, r6)
            int r1 = r1 + 1
            goto L2b
        L38:
            java.lang.String r13 = kotlin.text.StringsKt.concatToString(r5)
            return r13
    }

    private static final java.lang.String toHexStringShortByteSeparatorNoPrefixAndSuffix(byte[] r8, int r9, int r10, kotlin.text.HexFormat.BytesHexFormat r11, int[] r12) {
            java.lang.String r0 = r11.getByteSeparator()
            int r0 = r0.length()
            r1 = 0
            r2 = 1
            if (r0 > r2) goto Ld
            goto Le
        Ld:
            r2 = r1
        Le:
            if (r2 == 0) goto L5b
            int r2 = r10 - r9
            r3 = 0
            if (r0 != 0) goto L2e
            r4 = 2
            long r6 = (long) r2
            long r6 = r6 * r4
            int r1 = checkFormatLength(r6)
            char[] r1 = new char[r1]
            r4 = r9
        L20:
            if (r4 >= r10) goto L29
            int r3 = formatByteAt(r8, r4, r12, r1, r3)
            int r4 = r4 + 1
            goto L20
        L29:
            java.lang.String r4 = kotlin.text.StringsKt.concatToString(r1)
            return r4
        L2e:
            r4 = 3
            long r6 = (long) r2
            long r6 = r6 * r4
            r4 = 1
            long r6 = r6 - r4
            int r4 = checkFormatLength(r6)
            char[] r4 = new char[r4]
            java.lang.String r5 = r11.getByteSeparator()
            char r1 = r5.charAt(r1)
            int r3 = formatByteAt(r8, r9, r12, r4, r3)
            int r5 = r9 + 1
        L49:
            if (r5 >= r10) goto L56
            int r6 = r3 + 1
            r4[r3] = r1
            int r3 = formatByteAt(r8, r5, r12, r4, r6)
            int r5 = r5 + 1
            goto L49
        L56:
            java.lang.String r5 = kotlin.text.StringsKt.concatToString(r4)
            return r5
        L5b:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Failed requirement."
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    private static final java.lang.String toHexStringSlowPath(byte[] r18, int r19, int r20, kotlin.text.HexFormat.BytesHexFormat r21, int[] r22) {
            r0 = r20
            int r2 = r21.getBytesPerLine()
            int r3 = r21.getBytesPerGroup()
            java.lang.String r8 = r21.getBytePrefix()
            java.lang.String r9 = r21.getByteSuffix()
            java.lang.String r11 = r21.getByteSeparator()
            java.lang.String r12 = r21.getGroupSeparator()
            int r1 = r0 - r19
            int r4 = r12.length()
            int r5 = r11.length()
            int r6 = r8.length()
            int r7 = r9.length()
            int r1 = formattedStringLength(r1, r2, r3, r4, r5, r6, r7)
            r7 = r9
            char[] r9 = new char[r1]
            r4 = 0
            r5 = 0
            r6 = 0
            r10 = r19
        L3a:
            r13 = 1
            if (r10 >= r0) goto L7d
            if (r5 != r2) goto L4b
            int r14 = r4 + 1
            r15 = 10
            r9[r4] = r15
            r5 = 0
            r6 = 0
            r15 = r6
            r4 = r14
            r14 = r5
            goto L57
        L4b:
            if (r6 != r3) goto L55
            int r4 = toCharArrayIfNotEmpty(r12, r9, r4)
            r6 = 0
            r14 = r5
            r15 = r6
            goto L57
        L55:
            r14 = r5
            r15 = r6
        L57:
            if (r15 == 0) goto L5d
            int r4 = toCharArrayIfNotEmpty(r11, r9, r4)
        L5d:
            r6 = r8
            r5 = r10
            r8 = r22
            r10 = r4
            r4 = r18
            int r10 = formatByteAt(r4, r5, r6, r7, r8, r9, r10)
            r16 = r5
            r8 = r7
            r7 = r6
            int r6 = r15 + 1
            int r5 = r14 + 1
            int r4 = r16 + 1
            r17 = r10
            r10 = r4
            r4 = r17
            r17 = r8
            r8 = r7
            r7 = r17
            goto L3a
        L7d:
            r16 = r8
            r8 = r7
            r7 = r16
            r16 = r10
            if (r4 != r1) goto L87
            goto L88
        L87:
            r13 = 0
        L88:
            if (r13 == 0) goto L8f
            java.lang.String r10 = kotlin.text.StringsKt.concatToString(r9)
            return r10
        L8f:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r13 = "Check failed."
            java.lang.String r13 = r13.toString()
            r10.<init>(r13)
            throw r10
    }

    private static final long wholeElementsPerSet(long r4, long r6, int r8) {
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 <= 0) goto L10
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r2 > 0) goto Lb
            goto L10
        Lb:
            long r0 = (long) r8
            long r0 = r0 + r4
            long r2 = (long) r8
            long r2 = r2 + r6
            long r0 = r0 / r2
        L10:
            return r0
    }
}
