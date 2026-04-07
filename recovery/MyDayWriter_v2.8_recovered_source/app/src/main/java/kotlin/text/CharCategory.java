package kotlin.text;

/* JADX INFO: compiled from: CharCategoryJVM.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\f\n\u0002\b \b\u0086\u0081\u0002\u0018\u0000 -2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001-B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0011\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0086\u0002R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nj\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,¨\u0006."}, d2 = {"Lkotlin/text/CharCategory;", "", "value", "", "code", "", "(Ljava/lang/String;IILjava/lang/String;)V", "getCode", "()Ljava/lang/String;", "getValue", "()I", "contains", "", "char", "", "UNASSIGNED", "UPPERCASE_LETTER", "LOWERCASE_LETTER", "TITLECASE_LETTER", "MODIFIER_LETTER", "OTHER_LETTER", "NON_SPACING_MARK", "ENCLOSING_MARK", "COMBINING_SPACING_MARK", "DECIMAL_DIGIT_NUMBER", "LETTER_NUMBER", "OTHER_NUMBER", "SPACE_SEPARATOR", "LINE_SEPARATOR", "PARAGRAPH_SEPARATOR", "CONTROL", "FORMAT", "PRIVATE_USE", "SURROGATE", "DASH_PUNCTUATION", "START_PUNCTUATION", "END_PUNCTUATION", "CONNECTOR_PUNCTUATION", "OTHER_PUNCTUATION", "MATH_SYMBOL", "CURRENCY_SYMBOL", "MODIFIER_SYMBOL", "OTHER_SYMBOL", "INITIAL_QUOTE_PUNCTUATION", "FINAL_QUOTE_PUNCTUATION", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
public enum CharCategory extends java.lang.Enum<kotlin.text.CharCategory> {
    private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES = null;
    private static final /* synthetic */ kotlin.text.CharCategory[] $VALUES = null;
    public static final kotlin.text.CharCategory COMBINING_SPACING_MARK = null;
    public static final kotlin.text.CharCategory CONNECTOR_PUNCTUATION = null;
    public static final kotlin.text.CharCategory CONTROL = null;
    public static final kotlin.text.CharCategory CURRENCY_SYMBOL = null;
    public static final kotlin.text.CharCategory.Companion Companion = null;
    public static final kotlin.text.CharCategory DASH_PUNCTUATION = null;
    public static final kotlin.text.CharCategory DECIMAL_DIGIT_NUMBER = null;
    public static final kotlin.text.CharCategory ENCLOSING_MARK = null;
    public static final kotlin.text.CharCategory END_PUNCTUATION = null;
    public static final kotlin.text.CharCategory FINAL_QUOTE_PUNCTUATION = null;
    public static final kotlin.text.CharCategory FORMAT = null;
    public static final kotlin.text.CharCategory INITIAL_QUOTE_PUNCTUATION = null;
    public static final kotlin.text.CharCategory LETTER_NUMBER = null;
    public static final kotlin.text.CharCategory LINE_SEPARATOR = null;
    public static final kotlin.text.CharCategory LOWERCASE_LETTER = null;
    public static final kotlin.text.CharCategory MATH_SYMBOL = null;
    public static final kotlin.text.CharCategory MODIFIER_LETTER = null;
    public static final kotlin.text.CharCategory MODIFIER_SYMBOL = null;
    public static final kotlin.text.CharCategory NON_SPACING_MARK = null;
    public static final kotlin.text.CharCategory OTHER_LETTER = null;
    public static final kotlin.text.CharCategory OTHER_NUMBER = null;
    public static final kotlin.text.CharCategory OTHER_PUNCTUATION = null;
    public static final kotlin.text.CharCategory OTHER_SYMBOL = null;
    public static final kotlin.text.CharCategory PARAGRAPH_SEPARATOR = null;
    public static final kotlin.text.CharCategory PRIVATE_USE = null;
    public static final kotlin.text.CharCategory SPACE_SEPARATOR = null;
    public static final kotlin.text.CharCategory START_PUNCTUATION = null;
    public static final kotlin.text.CharCategory SURROGATE = null;
    public static final kotlin.text.CharCategory TITLECASE_LETTER = null;
    public static final kotlin.text.CharCategory UNASSIGNED = null;
    public static final kotlin.text.CharCategory UPPERCASE_LETTER = null;
    private final java.lang.String code;
    private final int value;

    /* JADX INFO: compiled from: CharCategoryJVM.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/text/CharCategory$Companion;", "", "()V", "valueOf", "Lkotlin/text/CharCategory;", "category", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
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

        public final kotlin.text.CharCategory valueOf(int r4) {
                r3 = this;
                r0 = 1
                r1 = 0
                if (r4 < 0) goto Lb
                r2 = 17
                if (r4 >= r2) goto Lb
                r2 = r0
                goto Lc
            Lb:
                r2 = r1
            Lc:
                if (r2 == 0) goto L19
                kotlin.enums.EnumEntries r0 = kotlin.text.CharCategory.getEntries()
                java.lang.Object r0 = r0.get(r4)
                kotlin.text.CharCategory r0 = (kotlin.text.CharCategory) r0
                goto L31
            L19:
                r2 = 18
                if (r2 > r4) goto L22
                r2 = 31
                if (r4 >= r2) goto L22
                goto L23
            L22:
                r0 = r1
            L23:
                if (r0 == 0) goto L32
                kotlin.enums.EnumEntries r0 = kotlin.text.CharCategory.getEntries()
                int r1 = r4 + (-1)
                java.lang.Object r0 = r0.get(r1)
                kotlin.text.CharCategory r0 = (kotlin.text.CharCategory) r0
            L31:
                return r0
            L32:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Category #"
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.StringBuilder r1 = r1.append(r4)
                java.lang.String r2 = " is not defined."
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
        }
    }

    private static final /* synthetic */ kotlin.text.CharCategory[] $values() {
            kotlin.text.CharCategory r1 = kotlin.text.CharCategory.UNASSIGNED
            kotlin.text.CharCategory r2 = kotlin.text.CharCategory.UPPERCASE_LETTER
            kotlin.text.CharCategory r3 = kotlin.text.CharCategory.LOWERCASE_LETTER
            kotlin.text.CharCategory r4 = kotlin.text.CharCategory.TITLECASE_LETTER
            kotlin.text.CharCategory r5 = kotlin.text.CharCategory.MODIFIER_LETTER
            kotlin.text.CharCategory r6 = kotlin.text.CharCategory.OTHER_LETTER
            kotlin.text.CharCategory r7 = kotlin.text.CharCategory.NON_SPACING_MARK
            kotlin.text.CharCategory r8 = kotlin.text.CharCategory.ENCLOSING_MARK
            kotlin.text.CharCategory r9 = kotlin.text.CharCategory.COMBINING_SPACING_MARK
            kotlin.text.CharCategory r10 = kotlin.text.CharCategory.DECIMAL_DIGIT_NUMBER
            kotlin.text.CharCategory r11 = kotlin.text.CharCategory.LETTER_NUMBER
            kotlin.text.CharCategory r12 = kotlin.text.CharCategory.OTHER_NUMBER
            kotlin.text.CharCategory r13 = kotlin.text.CharCategory.SPACE_SEPARATOR
            kotlin.text.CharCategory r14 = kotlin.text.CharCategory.LINE_SEPARATOR
            kotlin.text.CharCategory r15 = kotlin.text.CharCategory.PARAGRAPH_SEPARATOR
            kotlin.text.CharCategory r16 = kotlin.text.CharCategory.CONTROL
            kotlin.text.CharCategory r17 = kotlin.text.CharCategory.FORMAT
            kotlin.text.CharCategory r18 = kotlin.text.CharCategory.PRIVATE_USE
            kotlin.text.CharCategory r19 = kotlin.text.CharCategory.SURROGATE
            kotlin.text.CharCategory r20 = kotlin.text.CharCategory.DASH_PUNCTUATION
            kotlin.text.CharCategory r21 = kotlin.text.CharCategory.START_PUNCTUATION
            kotlin.text.CharCategory r22 = kotlin.text.CharCategory.END_PUNCTUATION
            kotlin.text.CharCategory r23 = kotlin.text.CharCategory.CONNECTOR_PUNCTUATION
            kotlin.text.CharCategory r24 = kotlin.text.CharCategory.OTHER_PUNCTUATION
            kotlin.text.CharCategory r25 = kotlin.text.CharCategory.MATH_SYMBOL
            kotlin.text.CharCategory r26 = kotlin.text.CharCategory.CURRENCY_SYMBOL
            kotlin.text.CharCategory r27 = kotlin.text.CharCategory.MODIFIER_SYMBOL
            kotlin.text.CharCategory r28 = kotlin.text.CharCategory.OTHER_SYMBOL
            kotlin.text.CharCategory r29 = kotlin.text.CharCategory.INITIAL_QUOTE_PUNCTUATION
            kotlin.text.CharCategory r30 = kotlin.text.CharCategory.FINAL_QUOTE_PUNCTUATION
            kotlin.text.CharCategory[] r0 = new kotlin.text.CharCategory[]{r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30}
            return r0
    }

    static {
            kotlin.text.CharCategory r0 = new kotlin.text.CharCategory
            r1 = 0
            java.lang.String r2 = "Cn"
            java.lang.String r3 = "UNASSIGNED"
            r0.<init>(r3, r1, r1, r2)
            kotlin.text.CharCategory.UNASSIGNED = r0
            kotlin.text.CharCategory r0 = new kotlin.text.CharCategory
            r1 = 1
            java.lang.String r2 = "Lu"
            java.lang.String r3 = "UPPERCASE_LETTER"
            r0.<init>(r3, r1, r1, r2)
            kotlin.text.CharCategory.UPPERCASE_LETTER = r0
            kotlin.text.CharCategory r0 = new kotlin.text.CharCategory
            r1 = 2
            java.lang.String r2 = "Ll"
            java.lang.String r3 = "LOWERCASE_LETTER"
            r0.<init>(r3, r1, r1, r2)
            kotlin.text.CharCategory.LOWERCASE_LETTER = r0
            kotlin.text.CharCategory r0 = new kotlin.text.CharCategory
            r1 = 3
            java.lang.String r2 = "Lt"
            java.lang.String r3 = "TITLECASE_LETTER"
            r0.<init>(r3, r1, r1, r2)
            kotlin.text.CharCategory.TITLECASE_LETTER = r0
            kotlin.text.CharCategory r0 = new kotlin.text.CharCategory
            r1 = 4
            java.lang.String r2 = "Lm"
            java.lang.String r3 = "MODIFIER_LETTER"
            r0.<init>(r3, r1, r1, r2)
            kotlin.text.CharCategory.MODIFIER_LETTER = r0
            kotlin.text.CharCategory r0 = new kotlin.text.CharCategory
            r1 = 5
            java.lang.String r2 = "Lo"
            java.lang.String r3 = "OTHER_LETTER"
            r0.<init>(r3, r1, r1, r2)
            kotlin.text.CharCategory.OTHER_LETTER = r0
            kotlin.text.CharCategory r0 = new kotlin.text.CharCategory
            r1 = 6
            java.lang.String r2 = "Mn"
            java.lang.String r3 = "NON_SPACING_MARK"
            r0.<init>(r3, r1, r1, r2)
            kotlin.text.CharCategory.NON_SPACING_MARK = r0
            kotlin.text.CharCategory r0 = new kotlin.text.CharCategory
            r1 = 7
            java.lang.String r2 = "Me"
            java.lang.String r3 = "ENCLOSING_MARK"
            r0.<init>(r3, r1, r1, r2)
            kotlin.text.CharCategory.ENCLOSING_MARK = r0
            kotlin.text.CharCategory r0 = new kotlin.text.CharCategory
            r1 = 8
            java.lang.String r2 = "Mc"
            java.lang.String r3 = "COMBINING_SPACING_MARK"
            r0.<init>(r3, r1, r1, r2)
            kotlin.text.CharCategory.COMBINING_SPACING_MARK = r0
            kotlin.text.CharCategory r0 = new kotlin.text.CharCategory
            r1 = 9
            java.lang.String r2 = "Nd"
            java.lang.String r3 = "DECIMAL_DIGIT_NUMBER"
            r0.<init>(r3, r1, r1, r2)
            kotlin.text.CharCategory.DECIMAL_DIGIT_NUMBER = r0
            kotlin.text.CharCategory r0 = new kotlin.text.CharCategory
            r1 = 10
            java.lang.String r2 = "Nl"
            java.lang.String r3 = "LETTER_NUMBER"
            r0.<init>(r3, r1, r1, r2)
            kotlin.text.CharCategory.LETTER_NUMBER = r0
            kotlin.text.CharCategory r0 = new kotlin.text.CharCategory
            r1 = 11
            java.lang.String r2 = "No"
            java.lang.String r3 = "OTHER_NUMBER"
            r0.<init>(r3, r1, r1, r2)
            kotlin.text.CharCategory.OTHER_NUMBER = r0
            kotlin.text.CharCategory r0 = new kotlin.text.CharCategory
            r1 = 12
            java.lang.String r2 = "Zs"
            java.lang.String r3 = "SPACE_SEPARATOR"
            r0.<init>(r3, r1, r1, r2)
            kotlin.text.CharCategory.SPACE_SEPARATOR = r0
            kotlin.text.CharCategory r0 = new kotlin.text.CharCategory
            r1 = 13
            java.lang.String r2 = "Zl"
            java.lang.String r3 = "LINE_SEPARATOR"
            r0.<init>(r3, r1, r1, r2)
            kotlin.text.CharCategory.LINE_SEPARATOR = r0
            kotlin.text.CharCategory r0 = new kotlin.text.CharCategory
            r1 = 14
            java.lang.String r2 = "Zp"
            java.lang.String r3 = "PARAGRAPH_SEPARATOR"
            r0.<init>(r3, r1, r1, r2)
            kotlin.text.CharCategory.PARAGRAPH_SEPARATOR = r0
            kotlin.text.CharCategory r0 = new kotlin.text.CharCategory
            r1 = 15
            java.lang.String r2 = "Cc"
            java.lang.String r3 = "CONTROL"
            r0.<init>(r3, r1, r1, r2)
            kotlin.text.CharCategory.CONTROL = r0
            kotlin.text.CharCategory r0 = new kotlin.text.CharCategory
            r1 = 16
            java.lang.String r2 = "Cf"
            java.lang.String r3 = "FORMAT"
            r0.<init>(r3, r1, r1, r2)
            kotlin.text.CharCategory.FORMAT = r0
            kotlin.text.CharCategory r0 = new kotlin.text.CharCategory
            java.lang.String r1 = "Co"
            java.lang.String r2 = "PRIVATE_USE"
            r3 = 17
            r4 = 18
            r0.<init>(r2, r3, r4, r1)
            kotlin.text.CharCategory.PRIVATE_USE = r0
            kotlin.text.CharCategory r0 = new kotlin.text.CharCategory
            java.lang.String r1 = "Cs"
            java.lang.String r2 = "SURROGATE"
            r3 = 19
            r0.<init>(r2, r4, r3, r1)
            kotlin.text.CharCategory.SURROGATE = r0
            kotlin.text.CharCategory r0 = new kotlin.text.CharCategory
            java.lang.String r1 = "Pd"
            java.lang.String r2 = "DASH_PUNCTUATION"
            r4 = 20
            r0.<init>(r2, r3, r4, r1)
            kotlin.text.CharCategory.DASH_PUNCTUATION = r0
            kotlin.text.CharCategory r0 = new kotlin.text.CharCategory
            java.lang.String r1 = "Ps"
            java.lang.String r2 = "START_PUNCTUATION"
            r3 = 21
            r0.<init>(r2, r4, r3, r1)
            kotlin.text.CharCategory.START_PUNCTUATION = r0
            kotlin.text.CharCategory r0 = new kotlin.text.CharCategory
            java.lang.String r1 = "Pe"
            java.lang.String r2 = "END_PUNCTUATION"
            r4 = 22
            r0.<init>(r2, r3, r4, r1)
            kotlin.text.CharCategory.END_PUNCTUATION = r0
            kotlin.text.CharCategory r0 = new kotlin.text.CharCategory
            r1 = 23
            java.lang.String r2 = "Pc"
            java.lang.String r3 = "CONNECTOR_PUNCTUATION"
            r0.<init>(r3, r4, r1, r2)
            kotlin.text.CharCategory.CONNECTOR_PUNCTUATION = r0
            kotlin.text.CharCategory r0 = new kotlin.text.CharCategory
            r1 = 24
            java.lang.String r2 = "Po"
            java.lang.String r3 = "OTHER_PUNCTUATION"
            r4 = 23
            r0.<init>(r3, r4, r1, r2)
            kotlin.text.CharCategory.OTHER_PUNCTUATION = r0
            kotlin.text.CharCategory r0 = new kotlin.text.CharCategory
            r1 = 25
            java.lang.String r2 = "Sm"
            java.lang.String r3 = "MATH_SYMBOL"
            r4 = 24
            r0.<init>(r3, r4, r1, r2)
            kotlin.text.CharCategory.MATH_SYMBOL = r0
            kotlin.text.CharCategory r0 = new kotlin.text.CharCategory
            r1 = 26
            java.lang.String r2 = "Sc"
            java.lang.String r3 = "CURRENCY_SYMBOL"
            r4 = 25
            r0.<init>(r3, r4, r1, r2)
            kotlin.text.CharCategory.CURRENCY_SYMBOL = r0
            kotlin.text.CharCategory r0 = new kotlin.text.CharCategory
            r1 = 27
            java.lang.String r2 = "Sk"
            java.lang.String r3 = "MODIFIER_SYMBOL"
            r4 = 26
            r0.<init>(r3, r4, r1, r2)
            kotlin.text.CharCategory.MODIFIER_SYMBOL = r0
            kotlin.text.CharCategory r0 = new kotlin.text.CharCategory
            r1 = 28
            java.lang.String r2 = "So"
            java.lang.String r3 = "OTHER_SYMBOL"
            r4 = 27
            r0.<init>(r3, r4, r1, r2)
            kotlin.text.CharCategory.OTHER_SYMBOL = r0
            kotlin.text.CharCategory r0 = new kotlin.text.CharCategory
            r1 = 29
            java.lang.String r2 = "Pi"
            java.lang.String r3 = "INITIAL_QUOTE_PUNCTUATION"
            r4 = 28
            r0.<init>(r3, r4, r1, r2)
            kotlin.text.CharCategory.INITIAL_QUOTE_PUNCTUATION = r0
            kotlin.text.CharCategory r0 = new kotlin.text.CharCategory
            r1 = 30
            java.lang.String r2 = "Pf"
            java.lang.String r3 = "FINAL_QUOTE_PUNCTUATION"
            r4 = 29
            r0.<init>(r3, r4, r1, r2)
            kotlin.text.CharCategory.FINAL_QUOTE_PUNCTUATION = r0
            kotlin.text.CharCategory[] r0 = $values()
            kotlin.text.CharCategory.$VALUES = r0
            kotlin.text.CharCategory[] r0 = kotlin.text.CharCategory.$VALUES
            java.lang.Enum[] r0 = (java.lang.Enum[]) r0
            kotlin.enums.EnumEntries r0 = kotlin.enums.EnumEntriesKt.enumEntries(r0)
            kotlin.text.CharCategory.$ENTRIES = r0
            kotlin.text.CharCategory$Companion r0 = new kotlin.text.CharCategory$Companion
            r1 = 0
            r0.<init>(r1)
            kotlin.text.CharCategory.Companion = r0
            return
    }

    CharCategory(java.lang.String r1, int r2, int r3, java.lang.String r4) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.value = r3
            r0.code = r4
            return
    }

    public static kotlin.enums.EnumEntries<kotlin.text.CharCategory> getEntries() {
            kotlin.enums.EnumEntries r0 = kotlin.text.CharCategory.$ENTRIES
            return r0
    }

    public static kotlin.text.CharCategory valueOf(java.lang.String r1) {
            java.lang.Class<kotlin.text.CharCategory> r0 = kotlin.text.CharCategory.class
            java.lang.Enum r0 = java.lang.Enum.valueOf(r0, r1)
            kotlin.text.CharCategory r0 = (kotlin.text.CharCategory) r0
            return r0
    }

    public static kotlin.text.CharCategory[] values() {
            kotlin.text.CharCategory[] r0 = kotlin.text.CharCategory.$VALUES
            java.lang.Object r0 = r0.clone()
            kotlin.text.CharCategory[] r0 = (kotlin.text.CharCategory[]) r0
            return r0
    }

    public final boolean contains(char r3) {
            r2 = this;
            int r0 = java.lang.Character.getType(r3)
            int r1 = r2.value
            if (r0 != r1) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            return r0
    }

    public final java.lang.String getCode() {
            r1 = this;
            java.lang.String r0 = r1.code
            return r0
    }

    public final int getValue() {
            r1 = this;
            int r0 = r1.value
            return r0
    }
}
