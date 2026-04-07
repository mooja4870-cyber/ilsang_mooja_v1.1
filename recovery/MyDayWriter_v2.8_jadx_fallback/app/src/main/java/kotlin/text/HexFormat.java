package kotlin.text;

/* JADX INFO: compiled from: HexFormat.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0004\u0011\u0012\u0013\u0014B\u001f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u000f\u001a\u00020\u0010H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0015"}, d2 = {"Lkotlin/text/HexFormat;", "", "upperCase", "", "bytes", "Lkotlin/text/HexFormat$BytesHexFormat;", "number", "Lkotlin/text/HexFormat$NumberHexFormat;", "(ZLkotlin/text/HexFormat$BytesHexFormat;Lkotlin/text/HexFormat$NumberHexFormat;)V", "getBytes", "()Lkotlin/text/HexFormat$BytesHexFormat;", "getNumber", "()Lkotlin/text/HexFormat$NumberHexFormat;", "getUpperCase", "()Z", "toString", "", "Builder", "BytesHexFormat", "Companion", "NumberHexFormat", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class HexFormat {
    public static final kotlin.text.HexFormat.Companion Companion = null;
    private static final kotlin.text.HexFormat Default = null;
    private static final kotlin.text.HexFormat UpperCase = null;
    private final kotlin.text.HexFormat.BytesHexFormat bytes;
    private final kotlin.text.HexFormat.NumberHexFormat number;
    private final boolean upperCase;

    /* JADX INFO: compiled from: HexFormat.kt */
    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007\b\u0001¢\u0006\u0002\u0010\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0001J%\u0010\u0007\u001a\u00020\u00152\u0017\u0010\u0016\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00150\u0017¢\u0006\u0002\b\u0018H\u0087\bø\u0001\u0000J%\u0010\n\u001a\u00020\u00152\u0017\u0010\u0016\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00150\u0017¢\u0006\u0002\b\u0018H\u0087\bø\u0001\u0000R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0019"}, d2 = {"Lkotlin/text/HexFormat$Builder;", "", "()V", "_bytes", "Lkotlin/text/HexFormat$BytesHexFormat$Builder;", "_number", "Lkotlin/text/HexFormat$NumberHexFormat$Builder;", "bytes", "getBytes", "()Lkotlin/text/HexFormat$BytesHexFormat$Builder;", "number", "getNumber", "()Lkotlin/text/HexFormat$NumberHexFormat$Builder;", "upperCase", "", "getUpperCase", "()Z", "setUpperCase", "(Z)V", "build", "Lkotlin/text/HexFormat;", "", "builderAction", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Builder {
        private kotlin.text.HexFormat.BytesHexFormat.Builder _bytes;
        private kotlin.text.HexFormat.NumberHexFormat.Builder _number;
        private boolean upperCase;

        public Builder() {
                r1 = this;
                r1.<init>()
                kotlin.text.HexFormat$Companion r0 = kotlin.text.HexFormat.Companion
                kotlin.text.HexFormat r0 = r0.getDefault()
                boolean r0 = r0.getUpperCase()
                r1.upperCase = r0
                return
        }

        private final void bytes(kotlin.jvm.functions.Function1<? super kotlin.text.HexFormat.BytesHexFormat.Builder, kotlin.Unit> r2) {
                r1 = this;
                java.lang.String r0 = "builderAction"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                kotlin.text.HexFormat$BytesHexFormat$Builder r0 = r1.getBytes()
                r2.invoke(r0)
                return
        }

        private final void number(kotlin.jvm.functions.Function1<? super kotlin.text.HexFormat.NumberHexFormat.Builder, kotlin.Unit> r2) {
                r1 = this;
                java.lang.String r0 = "builderAction"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                kotlin.text.HexFormat$NumberHexFormat$Builder r0 = r1.getNumber()
                r2.invoke(r0)
                return
        }

        public final kotlin.text.HexFormat build() {
                r4 = this;
                kotlin.text.HexFormat r0 = new kotlin.text.HexFormat
                boolean r1 = r4.upperCase
                kotlin.text.HexFormat$BytesHexFormat$Builder r2 = r4._bytes
                if (r2 == 0) goto Le
                kotlin.text.HexFormat$BytesHexFormat r2 = r2.build$kotlin_stdlib()
                if (r2 != 0) goto L14
            Le:
                kotlin.text.HexFormat$BytesHexFormat$Companion r2 = kotlin.text.HexFormat.BytesHexFormat.Companion
                kotlin.text.HexFormat$BytesHexFormat r2 = r2.getDefault$kotlin_stdlib()
            L14:
                kotlin.text.HexFormat$NumberHexFormat$Builder r3 = r4._number
                if (r3 == 0) goto L1e
                kotlin.text.HexFormat$NumberHexFormat r3 = r3.build$kotlin_stdlib()
                if (r3 != 0) goto L24
            L1e:
                kotlin.text.HexFormat$NumberHexFormat$Companion r3 = kotlin.text.HexFormat.NumberHexFormat.Companion
                kotlin.text.HexFormat$NumberHexFormat r3 = r3.getDefault$kotlin_stdlib()
            L24:
                r0.<init>(r1, r2, r3)
                return r0
        }

        public final kotlin.text.HexFormat.BytesHexFormat.Builder getBytes() {
                r1 = this;
                kotlin.text.HexFormat$BytesHexFormat$Builder r0 = r1._bytes
                if (r0 != 0) goto Lb
                kotlin.text.HexFormat$BytesHexFormat$Builder r0 = new kotlin.text.HexFormat$BytesHexFormat$Builder
                r0.<init>()
                r1._bytes = r0
            Lb:
                kotlin.text.HexFormat$BytesHexFormat$Builder r0 = r1._bytes
                kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
                return r0
        }

        public final kotlin.text.HexFormat.NumberHexFormat.Builder getNumber() {
                r1 = this;
                kotlin.text.HexFormat$NumberHexFormat$Builder r0 = r1._number
                if (r0 != 0) goto Lb
                kotlin.text.HexFormat$NumberHexFormat$Builder r0 = new kotlin.text.HexFormat$NumberHexFormat$Builder
                r0.<init>()
                r1._number = r0
            Lb:
                kotlin.text.HexFormat$NumberHexFormat$Builder r0 = r1._number
                kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
                return r0
        }

        public final boolean getUpperCase() {
                r1 = this;
                boolean r0 = r1.upperCase
                return r0
        }

        public final void setUpperCase(boolean r1) {
                r0 = this;
                r0.upperCase = r1
                return
        }
    }

    /* JADX INFO: compiled from: HexFormat.kt */
    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 #2\u00020\u0001:\u0002\"#B7\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0002\u0010\nJ%\u0010\u001b\u001a\u00060\u001cj\u0002`\u001d2\n\u0010\u001e\u001a\u00060\u001cj\u0002`\u001d2\u0006\u0010\u001f\u001a\u00020\u0006H\u0000¢\u0006\u0002\b J\b\u0010!\u001a\u00020\u0006H\u0016R\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\fR\u0014\u0010\u0013\u001a\u00020\u0014X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u0014X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u0014X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016¨\u0006$"}, d2 = {"Lkotlin/text/HexFormat$BytesHexFormat;", "", "bytesPerLine", "", "bytesPerGroup", "groupSeparator", "", "byteSeparator", "bytePrefix", "byteSuffix", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBytePrefix", "()Ljava/lang/String;", "getByteSeparator", "getByteSuffix", "getBytesPerGroup", "()I", "getBytesPerLine", "getGroupSeparator", "ignoreCase", "", "getIgnoreCase$kotlin_stdlib", "()Z", "noLineAndGroupSeparator", "getNoLineAndGroupSeparator$kotlin_stdlib", "shortByteSeparatorNoPrefixAndSuffix", "getShortByteSeparatorNoPrefixAndSuffix$kotlin_stdlib", "appendOptionsTo", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "sb", "indent", "appendOptionsTo$kotlin_stdlib", "toString", "Builder", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class BytesHexFormat {
        public static final kotlin.text.HexFormat.BytesHexFormat.Companion Companion = null;
        private static final kotlin.text.HexFormat.BytesHexFormat Default = null;
        private final java.lang.String bytePrefix;
        private final java.lang.String byteSeparator;
        private final java.lang.String byteSuffix;
        private final int bytesPerGroup;
        private final int bytesPerLine;
        private final java.lang.String groupSeparator;
        private final boolean ignoreCase;
        private final boolean noLineAndGroupSeparator;
        private final boolean shortByteSeparatorNoPrefixAndSuffix;

        /* JADX INFO: compiled from: HexFormat.kt */
        @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0000¢\u0006\u0002\u0010\u0002J\r\u0010\u001c\u001a\u00020\u001dH\u0000¢\u0006\u0002\b\u001eR$\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR$\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR$\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR$\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0010@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R$\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0010@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015R\u001a\u0010\u0019\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0007\"\u0004\b\u001b\u0010\t¨\u0006\u001f"}, d2 = {"Lkotlin/text/HexFormat$BytesHexFormat$Builder;", "", "()V", "value", "", "bytePrefix", "getBytePrefix", "()Ljava/lang/String;", "setBytePrefix", "(Ljava/lang/String;)V", "byteSeparator", "getByteSeparator", "setByteSeparator", "byteSuffix", "getByteSuffix", "setByteSuffix", "", "bytesPerGroup", "getBytesPerGroup", "()I", "setBytesPerGroup", "(I)V", "bytesPerLine", "getBytesPerLine", "setBytesPerLine", "groupSeparator", "getGroupSeparator", "setGroupSeparator", "build", "Lkotlin/text/HexFormat$BytesHexFormat;", "build$kotlin_stdlib", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Builder {
            private java.lang.String bytePrefix;
            private java.lang.String byteSeparator;
            private java.lang.String byteSuffix;
            private int bytesPerGroup;
            private int bytesPerLine;
            private java.lang.String groupSeparator;

            public Builder() {
                    r1 = this;
                    r1.<init>()
                    kotlin.text.HexFormat$BytesHexFormat$Companion r0 = kotlin.text.HexFormat.BytesHexFormat.Companion
                    kotlin.text.HexFormat$BytesHexFormat r0 = r0.getDefault$kotlin_stdlib()
                    int r0 = r0.getBytesPerLine()
                    r1.bytesPerLine = r0
                    kotlin.text.HexFormat$BytesHexFormat$Companion r0 = kotlin.text.HexFormat.BytesHexFormat.Companion
                    kotlin.text.HexFormat$BytesHexFormat r0 = r0.getDefault$kotlin_stdlib()
                    int r0 = r0.getBytesPerGroup()
                    r1.bytesPerGroup = r0
                    kotlin.text.HexFormat$BytesHexFormat$Companion r0 = kotlin.text.HexFormat.BytesHexFormat.Companion
                    kotlin.text.HexFormat$BytesHexFormat r0 = r0.getDefault$kotlin_stdlib()
                    java.lang.String r0 = r0.getGroupSeparator()
                    r1.groupSeparator = r0
                    kotlin.text.HexFormat$BytesHexFormat$Companion r0 = kotlin.text.HexFormat.BytesHexFormat.Companion
                    kotlin.text.HexFormat$BytesHexFormat r0 = r0.getDefault$kotlin_stdlib()
                    java.lang.String r0 = r0.getByteSeparator()
                    r1.byteSeparator = r0
                    kotlin.text.HexFormat$BytesHexFormat$Companion r0 = kotlin.text.HexFormat.BytesHexFormat.Companion
                    kotlin.text.HexFormat$BytesHexFormat r0 = r0.getDefault$kotlin_stdlib()
                    java.lang.String r0 = r0.getBytePrefix()
                    r1.bytePrefix = r0
                    kotlin.text.HexFormat$BytesHexFormat$Companion r0 = kotlin.text.HexFormat.BytesHexFormat.Companion
                    kotlin.text.HexFormat$BytesHexFormat r0 = r0.getDefault$kotlin_stdlib()
                    java.lang.String r0 = r0.getByteSuffix()
                    r1.byteSuffix = r0
                    return
            }

            public final kotlin.text.HexFormat.BytesHexFormat build$kotlin_stdlib() {
                    r7 = this;
                    kotlin.text.HexFormat$BytesHexFormat r0 = new kotlin.text.HexFormat$BytesHexFormat
                    int r1 = r7.bytesPerLine
                    int r2 = r7.bytesPerGroup
                    java.lang.String r3 = r7.groupSeparator
                    java.lang.String r4 = r7.byteSeparator
                    java.lang.String r5 = r7.bytePrefix
                    java.lang.String r6 = r7.byteSuffix
                    r0.<init>(r1, r2, r3, r4, r5, r6)
                    return r0
            }

            public final java.lang.String getBytePrefix() {
                    r1 = this;
                    java.lang.String r0 = r1.bytePrefix
                    return r0
            }

            public final java.lang.String getByteSeparator() {
                    r1 = this;
                    java.lang.String r0 = r1.byteSeparator
                    return r0
            }

            public final java.lang.String getByteSuffix() {
                    r1 = this;
                    java.lang.String r0 = r1.byteSuffix
                    return r0
            }

            public final int getBytesPerGroup() {
                    r1 = this;
                    int r0 = r1.bytesPerGroup
                    return r0
            }

            public final int getBytesPerLine() {
                    r1 = this;
                    int r0 = r1.bytesPerLine
                    return r0
            }

            public final java.lang.String getGroupSeparator() {
                    r1 = this;
                    java.lang.String r0 = r1.groupSeparator
                    return r0
            }

            public final void setBytePrefix(java.lang.String r6) {
                    r5 = this;
                    java.lang.String r0 = "value"
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
                    r0 = r6
                    java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                    r1 = 10
                    r2 = 0
                    r3 = 2
                    r4 = 0
                    boolean r0 = kotlin.text.StringsKt.contains$default(r0, r1, r2, r3, r4)
                    if (r0 != 0) goto L21
                    r0 = r6
                    java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                    r1 = 13
                    boolean r0 = kotlin.text.StringsKt.contains$default(r0, r1, r2, r3, r4)
                    if (r0 != 0) goto L21
                    r5.bytePrefix = r6
                    return
                L21:
                    java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    java.lang.String r2 = "LF and CR characters are prohibited in bytePrefix, but was "
                    java.lang.StringBuilder r1 = r1.append(r2)
                    java.lang.StringBuilder r1 = r1.append(r6)
                    java.lang.String r1 = r1.toString()
                    r0.<init>(r1)
                    throw r0
            }

            public final void setByteSeparator(java.lang.String r6) {
                    r5 = this;
                    java.lang.String r0 = "value"
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
                    r0 = r6
                    java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                    r1 = 10
                    r2 = 0
                    r3 = 2
                    r4 = 0
                    boolean r0 = kotlin.text.StringsKt.contains$default(r0, r1, r2, r3, r4)
                    if (r0 != 0) goto L21
                    r0 = r6
                    java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                    r1 = 13
                    boolean r0 = kotlin.text.StringsKt.contains$default(r0, r1, r2, r3, r4)
                    if (r0 != 0) goto L21
                    r5.byteSeparator = r6
                    return
                L21:
                    java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    java.lang.String r2 = "LF and CR characters are prohibited in byteSeparator, but was "
                    java.lang.StringBuilder r1 = r1.append(r2)
                    java.lang.StringBuilder r1 = r1.append(r6)
                    java.lang.String r1 = r1.toString()
                    r0.<init>(r1)
                    throw r0
            }

            public final void setByteSuffix(java.lang.String r6) {
                    r5 = this;
                    java.lang.String r0 = "value"
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
                    r0 = r6
                    java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                    r1 = 10
                    r2 = 0
                    r3 = 2
                    r4 = 0
                    boolean r0 = kotlin.text.StringsKt.contains$default(r0, r1, r2, r3, r4)
                    if (r0 != 0) goto L21
                    r0 = r6
                    java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                    r1 = 13
                    boolean r0 = kotlin.text.StringsKt.contains$default(r0, r1, r2, r3, r4)
                    if (r0 != 0) goto L21
                    r5.byteSuffix = r6
                    return
                L21:
                    java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    java.lang.String r2 = "LF and CR characters are prohibited in byteSuffix, but was "
                    java.lang.StringBuilder r1 = r1.append(r2)
                    java.lang.StringBuilder r1 = r1.append(r6)
                    java.lang.String r1 = r1.toString()
                    r0.<init>(r1)
                    throw r0
            }

            public final void setBytesPerGroup(int r4) {
                    r3 = this;
                    if (r4 <= 0) goto L5
                    r3.bytesPerGroup = r4
                    return
                L5:
                    java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    java.lang.String r2 = "Non-positive values are prohibited for bytesPerGroup, but was "
                    java.lang.StringBuilder r1 = r1.append(r2)
                    java.lang.StringBuilder r1 = r1.append(r4)
                    java.lang.String r1 = r1.toString()
                    r0.<init>(r1)
                    throw r0
            }

            public final void setBytesPerLine(int r4) {
                    r3 = this;
                    if (r4 <= 0) goto L5
                    r3.bytesPerLine = r4
                    return
                L5:
                    java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    java.lang.String r2 = "Non-positive values are prohibited for bytesPerLine, but was "
                    java.lang.StringBuilder r1 = r1.append(r2)
                    java.lang.StringBuilder r1 = r1.append(r4)
                    java.lang.String r1 = r1.toString()
                    r0.<init>(r1)
                    throw r0
            }

            public final void setGroupSeparator(java.lang.String r2) {
                    r1 = this;
                    java.lang.String r0 = "<set-?>"
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                    r1.groupSeparator = r2
                    return
            }
        }

        /* JADX INFO: compiled from: HexFormat.kt */
        @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/text/HexFormat$BytesHexFormat$Companion;", "", "()V", "Default", "Lkotlin/text/HexFormat$BytesHexFormat;", "getDefault$kotlin_stdlib", "()Lkotlin/text/HexFormat$BytesHexFormat;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
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

            public final kotlin.text.HexFormat.BytesHexFormat getDefault$kotlin_stdlib() {
                    r1 = this;
                    kotlin.text.HexFormat$BytesHexFormat r0 = kotlin.text.HexFormat.BytesHexFormat.access$getDefault$cp()
                    return r0
            }
        }

        static {
                kotlin.text.HexFormat$BytesHexFormat$Companion r0 = new kotlin.text.HexFormat$BytesHexFormat$Companion
                r1 = 0
                r0.<init>(r1)
                kotlin.text.HexFormat.BytesHexFormat.Companion = r0
                kotlin.text.HexFormat$BytesHexFormat r2 = new kotlin.text.HexFormat$BytesHexFormat
                r3 = 2147483647(0x7fffffff, float:NaN)
                r4 = 2147483647(0x7fffffff, float:NaN)
                java.lang.String r5 = "  "
                java.lang.String r6 = ""
                java.lang.String r7 = ""
                java.lang.String r8 = ""
                r2.<init>(r3, r4, r5, r6, r7, r8)
                kotlin.text.HexFormat.BytesHexFormat.Default = r2
                return
        }

        public BytesHexFormat(int r5, int r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, java.lang.String r10) {
                r4 = this;
                java.lang.String r0 = "groupSeparator"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
                java.lang.String r0 = "byteSeparator"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
                java.lang.String r0 = "bytePrefix"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
                java.lang.String r0 = "byteSuffix"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
                r4.<init>()
                r4.bytesPerLine = r5
                r4.bytesPerGroup = r6
                r4.groupSeparator = r7
                r4.byteSeparator = r8
                r4.bytePrefix = r9
                r4.byteSuffix = r10
                int r0 = r4.bytesPerLine
                r1 = 0
                r2 = 1
                r3 = 2147483647(0x7fffffff, float:NaN)
                if (r0 != r3) goto L32
                int r0 = r4.bytesPerGroup
                if (r0 != r3) goto L32
                r0 = r2
                goto L33
            L32:
                r0 = r1
            L33:
                r4.noLineAndGroupSeparator = r0
                java.lang.String r0 = r4.bytePrefix
                java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                int r0 = r0.length()
                if (r0 != 0) goto L41
                r0 = r2
                goto L42
            L41:
                r0 = r1
            L42:
                if (r0 == 0) goto L5d
                java.lang.String r0 = r4.byteSuffix
                java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                int r0 = r0.length()
                if (r0 != 0) goto L50
                r0 = r2
                goto L51
            L50:
                r0 = r1
            L51:
                if (r0 == 0) goto L5d
                java.lang.String r0 = r4.byteSeparator
                int r0 = r0.length()
                if (r0 > r2) goto L5d
                r0 = r2
                goto L5e
            L5d:
                r0 = r1
            L5e:
                r4.shortByteSeparatorNoPrefixAndSuffix = r0
                java.lang.String r0 = r4.groupSeparator
                boolean r0 = kotlin.text.HexFormatKt.access$isCaseSensitive(r0)
                if (r0 != 0) goto L80
                java.lang.String r0 = r4.byteSeparator
                boolean r0 = kotlin.text.HexFormatKt.access$isCaseSensitive(r0)
                if (r0 != 0) goto L80
                java.lang.String r0 = r4.bytePrefix
                boolean r0 = kotlin.text.HexFormatKt.access$isCaseSensitive(r0)
                if (r0 != 0) goto L80
                java.lang.String r0 = r4.byteSuffix
                boolean r0 = kotlin.text.HexFormatKt.access$isCaseSensitive(r0)
                if (r0 == 0) goto L81
            L80:
                r1 = r2
            L81:
                r4.ignoreCase = r1
                return
        }

        public static final /* synthetic */ kotlin.text.HexFormat.BytesHexFormat access$getDefault$cp() {
                kotlin.text.HexFormat$BytesHexFormat r0 = kotlin.text.HexFormat.BytesHexFormat.Default
                return r0
        }

        public final java.lang.StringBuilder appendOptionsTo$kotlin_stdlib(java.lang.StringBuilder r6, java.lang.String r7) {
                r5 = this;
                java.lang.String r0 = "sb"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
                java.lang.String r0 = "indent"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
                java.lang.StringBuilder r0 = r6.append(r7)
                java.lang.String r1 = "bytesPerLine = "
                java.lang.StringBuilder r0 = r0.append(r1)
                int r1 = r5.bytesPerLine
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = "append(...)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
                java.lang.String r2 = ","
                java.lang.StringBuilder r0 = r0.append(r2)
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
                r3 = 10
                java.lang.StringBuilder r0 = r0.append(r3)
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
                java.lang.StringBuilder r0 = r6.append(r7)
                java.lang.String r4 = "bytesPerGroup = "
                java.lang.StringBuilder r0 = r0.append(r4)
                int r4 = r5.bytesPerGroup
                java.lang.StringBuilder r0 = r0.append(r4)
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
                java.lang.StringBuilder r0 = r0.append(r2)
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
                java.lang.StringBuilder r0 = r0.append(r3)
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
                java.lang.StringBuilder r0 = r6.append(r7)
                java.lang.String r2 = "groupSeparator = \""
                java.lang.StringBuilder r0 = r0.append(r2)
                java.lang.String r2 = r5.groupSeparator
                java.lang.StringBuilder r0 = r0.append(r2)
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
                java.lang.String r2 = "\","
                java.lang.StringBuilder r0 = r0.append(r2)
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
                java.lang.StringBuilder r0 = r0.append(r3)
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
                java.lang.StringBuilder r0 = r6.append(r7)
                java.lang.String r4 = "byteSeparator = \""
                java.lang.StringBuilder r0 = r0.append(r4)
                java.lang.String r4 = r5.byteSeparator
                java.lang.StringBuilder r0 = r0.append(r4)
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
                java.lang.StringBuilder r0 = r0.append(r2)
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
                java.lang.StringBuilder r0 = r0.append(r3)
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
                java.lang.StringBuilder r0 = r6.append(r7)
                java.lang.String r4 = "bytePrefix = \""
                java.lang.StringBuilder r0 = r0.append(r4)
                java.lang.String r4 = r5.bytePrefix
                java.lang.StringBuilder r0 = r0.append(r4)
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
                java.lang.StringBuilder r0 = r0.append(r2)
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
                java.lang.StringBuilder r0 = r0.append(r3)
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
                java.lang.StringBuilder r0 = r6.append(r7)
                java.lang.String r1 = "byteSuffix = \""
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = r5.byteSuffix
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = "\""
                r0.append(r1)
                return r6
        }

        public final java.lang.String getBytePrefix() {
                r1 = this;
                java.lang.String r0 = r1.bytePrefix
                return r0
        }

        public final java.lang.String getByteSeparator() {
                r1 = this;
                java.lang.String r0 = r1.byteSeparator
                return r0
        }

        public final java.lang.String getByteSuffix() {
                r1 = this;
                java.lang.String r0 = r1.byteSuffix
                return r0
        }

        public final int getBytesPerGroup() {
                r1 = this;
                int r0 = r1.bytesPerGroup
                return r0
        }

        public final int getBytesPerLine() {
                r1 = this;
                int r0 = r1.bytesPerLine
                return r0
        }

        public final java.lang.String getGroupSeparator() {
                r1 = this;
                java.lang.String r0 = r1.groupSeparator
                return r0
        }

        public final boolean getIgnoreCase$kotlin_stdlib() {
                r1 = this;
                boolean r0 = r1.ignoreCase
                return r0
        }

        public final boolean getNoLineAndGroupSeparator$kotlin_stdlib() {
                r1 = this;
                boolean r0 = r1.noLineAndGroupSeparator
                return r0
        }

        public final boolean getShortByteSeparatorNoPrefixAndSuffix$kotlin_stdlib() {
                r1 = this;
                boolean r0 = r1.shortByteSeparatorNoPrefixAndSuffix
                return r0
        }

        public java.lang.String toString() {
                r6 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r1 = r0
                r2 = 0
                java.lang.String r3 = "BytesHexFormat("
                java.lang.StringBuilder r3 = r1.append(r3)
                java.lang.String r4 = "append(...)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
                r5 = 10
                java.lang.StringBuilder r3 = r3.append(r5)
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
                java.lang.String r3 = "    "
                java.lang.StringBuilder r3 = r6.appendOptionsTo$kotlin_stdlib(r1, r3)
                java.lang.StringBuilder r3 = r3.append(r5)
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
                java.lang.String r3 = ")"
                r1.append(r3)
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "toString(...)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
                return r0
        }
    }

    /* JADX INFO: compiled from: HexFormat.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lkotlin/text/HexFormat$Companion;", "", "()V", "Default", "Lkotlin/text/HexFormat;", "getDefault", "()Lkotlin/text/HexFormat;", "UpperCase", "getUpperCase", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
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

        public final kotlin.text.HexFormat getDefault() {
                r1 = this;
                kotlin.text.HexFormat r0 = kotlin.text.HexFormat.access$getDefault$cp()
                return r0
        }

        public final kotlin.text.HexFormat getUpperCase() {
                r1 = this;
                kotlin.text.HexFormat r0 = kotlin.text.HexFormat.access$getUpperCase$cp()
                return r0
        }
    }

    /* JADX INFO: compiled from: HexFormat.kt */
    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 !2\u00020\u0001:\u0002 !B'\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ%\u0010\u0019\u001a\u00060\u001aj\u0002`\u001b2\n\u0010\u001c\u001a\u00060\u001aj\u0002`\u001b2\u0006\u0010\u001d\u001a\u00020\u0003H\u0000¢\u0006\u0002\b\u001eJ\b\u0010\u001f\u001a\u00020\u0003H\u0016R\u0014\u0010\n\u001a\u00020\u0006X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u0006X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0014\u0010\u000f\u001a\u00020\u0006X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u001c\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016¨\u0006\""}, d2 = {"Lkotlin/text/HexFormat$NumberHexFormat;", "", "prefix", "", "suffix", "removeLeadingZeros", "", "minLength", "", "(Ljava/lang/String;Ljava/lang/String;ZI)V", "ignoreCase", "getIgnoreCase$kotlin_stdlib", "()Z", "isDigitsOnly", "isDigitsOnly$kotlin_stdlib", "isDigitsOnlyAndNoPadding", "isDigitsOnlyAndNoPadding$kotlin_stdlib", "getMinLength$annotations", "()V", "getMinLength", "()I", "getPrefix", "()Ljava/lang/String;", "getRemoveLeadingZeros", "getSuffix", "appendOptionsTo", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "sb", "indent", "appendOptionsTo$kotlin_stdlib", "toString", "Builder", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class NumberHexFormat {
        public static final kotlin.text.HexFormat.NumberHexFormat.Companion Companion = null;
        private static final kotlin.text.HexFormat.NumberHexFormat Default = null;
        private final boolean ignoreCase;
        private final boolean isDigitsOnly;
        private final boolean isDigitsOnlyAndNoPadding;
        private final int minLength;
        private final java.lang.String prefix;
        private final boolean removeLeadingZeros;
        private final java.lang.String suffix;

        /* JADX INFO: compiled from: HexFormat.kt */
        @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0000¢\u0006\u0002\u0010\u0002J\r\u0010\u001a\u001a\u00020\u001bH\u0000¢\u0006\u0002\b\u001cR,\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048\u0006@FX\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0006\u0010\u0002\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR$\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000b@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000b@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u000e\"\u0004\b\u0019\u0010\u0010¨\u0006\u001d"}, d2 = {"Lkotlin/text/HexFormat$NumberHexFormat$Builder;", "", "()V", "value", "", "minLength", "getMinLength$annotations", "getMinLength", "()I", "setMinLength", "(I)V", "", "prefix", "getPrefix", "()Ljava/lang/String;", "setPrefix", "(Ljava/lang/String;)V", "removeLeadingZeros", "", "getRemoveLeadingZeros", "()Z", "setRemoveLeadingZeros", "(Z)V", "suffix", "getSuffix", "setSuffix", "build", "Lkotlin/text/HexFormat$NumberHexFormat;", "build$kotlin_stdlib", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Builder {
            private int minLength;
            private java.lang.String prefix;
            private boolean removeLeadingZeros;
            private java.lang.String suffix;

            public Builder() {
                    r1 = this;
                    r1.<init>()
                    kotlin.text.HexFormat$NumberHexFormat$Companion r0 = kotlin.text.HexFormat.NumberHexFormat.Companion
                    kotlin.text.HexFormat$NumberHexFormat r0 = r0.getDefault$kotlin_stdlib()
                    java.lang.String r0 = r0.getPrefix()
                    r1.prefix = r0
                    kotlin.text.HexFormat$NumberHexFormat$Companion r0 = kotlin.text.HexFormat.NumberHexFormat.Companion
                    kotlin.text.HexFormat$NumberHexFormat r0 = r0.getDefault$kotlin_stdlib()
                    java.lang.String r0 = r0.getSuffix()
                    r1.suffix = r0
                    kotlin.text.HexFormat$NumberHexFormat$Companion r0 = kotlin.text.HexFormat.NumberHexFormat.Companion
                    kotlin.text.HexFormat$NumberHexFormat r0 = r0.getDefault$kotlin_stdlib()
                    boolean r0 = r0.getRemoveLeadingZeros()
                    r1.removeLeadingZeros = r0
                    kotlin.text.HexFormat$NumberHexFormat$Companion r0 = kotlin.text.HexFormat.NumberHexFormat.Companion
                    kotlin.text.HexFormat$NumberHexFormat r0 = r0.getDefault$kotlin_stdlib()
                    int r0 = r0.getMinLength()
                    r1.minLength = r0
                    return
            }

            public static /* synthetic */ void getMinLength$annotations() {
                    return
            }

            public final kotlin.text.HexFormat.NumberHexFormat build$kotlin_stdlib() {
                    r5 = this;
                    kotlin.text.HexFormat$NumberHexFormat r0 = new kotlin.text.HexFormat$NumberHexFormat
                    java.lang.String r1 = r5.prefix
                    java.lang.String r2 = r5.suffix
                    boolean r3 = r5.removeLeadingZeros
                    int r4 = r5.minLength
                    r0.<init>(r1, r2, r3, r4)
                    return r0
            }

            public final int getMinLength() {
                    r1 = this;
                    int r0 = r1.minLength
                    return r0
            }

            public final java.lang.String getPrefix() {
                    r1 = this;
                    java.lang.String r0 = r1.prefix
                    return r0
            }

            public final boolean getRemoveLeadingZeros() {
                    r1 = this;
                    boolean r0 = r1.removeLeadingZeros
                    return r0
            }

            public final java.lang.String getSuffix() {
                    r1 = this;
                    java.lang.String r0 = r1.suffix
                    return r0
            }

            public final void setMinLength(int r4) {
                    r3 = this;
                    if (r4 <= 0) goto L4
                    r0 = 1
                    goto L5
                L4:
                    r0 = 0
                L5:
                    if (r0 == 0) goto La
                    r3.minLength = r4
                    return
                La:
                    r0 = 0
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    java.lang.String r2 = "Non-positive values are prohibited for minLength, but was "
                    java.lang.StringBuilder r1 = r1.append(r2)
                    java.lang.StringBuilder r1 = r1.append(r4)
                    java.lang.String r0 = r1.toString()
                    java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                    java.lang.String r0 = r0.toString()
                    r1.<init>(r0)
                    throw r1
            }

            public final void setPrefix(java.lang.String r6) {
                    r5 = this;
                    java.lang.String r0 = "value"
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
                    r0 = r6
                    java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                    r1 = 10
                    r2 = 0
                    r3 = 2
                    r4 = 0
                    boolean r0 = kotlin.text.StringsKt.contains$default(r0, r1, r2, r3, r4)
                    if (r0 != 0) goto L21
                    r0 = r6
                    java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                    r1 = 13
                    boolean r0 = kotlin.text.StringsKt.contains$default(r0, r1, r2, r3, r4)
                    if (r0 != 0) goto L21
                    r5.prefix = r6
                    return
                L21:
                    java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    java.lang.String r2 = "LF and CR characters are prohibited in prefix, but was "
                    java.lang.StringBuilder r1 = r1.append(r2)
                    java.lang.StringBuilder r1 = r1.append(r6)
                    java.lang.String r1 = r1.toString()
                    r0.<init>(r1)
                    throw r0
            }

            public final void setRemoveLeadingZeros(boolean r1) {
                    r0 = this;
                    r0.removeLeadingZeros = r1
                    return
            }

            public final void setSuffix(java.lang.String r6) {
                    r5 = this;
                    java.lang.String r0 = "value"
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
                    r0 = r6
                    java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                    r1 = 10
                    r2 = 0
                    r3 = 2
                    r4 = 0
                    boolean r0 = kotlin.text.StringsKt.contains$default(r0, r1, r2, r3, r4)
                    if (r0 != 0) goto L21
                    r0 = r6
                    java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                    r1 = 13
                    boolean r0 = kotlin.text.StringsKt.contains$default(r0, r1, r2, r3, r4)
                    if (r0 != 0) goto L21
                    r5.suffix = r6
                    return
                L21:
                    java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    java.lang.String r2 = "LF and CR characters are prohibited in suffix, but was "
                    java.lang.StringBuilder r1 = r1.append(r2)
                    java.lang.StringBuilder r1 = r1.append(r6)
                    java.lang.String r1 = r1.toString()
                    r0.<init>(r1)
                    throw r0
            }
        }

        /* JADX INFO: compiled from: HexFormat.kt */
        @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/text/HexFormat$NumberHexFormat$Companion;", "", "()V", "Default", "Lkotlin/text/HexFormat$NumberHexFormat;", "getDefault$kotlin_stdlib", "()Lkotlin/text/HexFormat$NumberHexFormat;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
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

            public final kotlin.text.HexFormat.NumberHexFormat getDefault$kotlin_stdlib() {
                    r1 = this;
                    kotlin.text.HexFormat$NumberHexFormat r0 = kotlin.text.HexFormat.NumberHexFormat.access$getDefault$cp()
                    return r0
            }
        }

        static {
                kotlin.text.HexFormat$NumberHexFormat$Companion r0 = new kotlin.text.HexFormat$NumberHexFormat$Companion
                r1 = 0
                r0.<init>(r1)
                kotlin.text.HexFormat.NumberHexFormat.Companion = r0
                kotlin.text.HexFormat$NumberHexFormat r0 = new kotlin.text.HexFormat$NumberHexFormat
                java.lang.String r1 = ""
                r2 = 0
                r3 = 1
                r0.<init>(r1, r1, r2, r3)
                kotlin.text.HexFormat.NumberHexFormat.Default = r0
                return
        }

        public NumberHexFormat(java.lang.String r4, java.lang.String r5, boolean r6, int r7) {
                r3 = this;
                java.lang.String r0 = "prefix"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                java.lang.String r0 = "suffix"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                r3.<init>()
                r3.prefix = r4
                r3.suffix = r5
                r3.removeLeadingZeros = r6
                r3.minLength = r7
                java.lang.String r0 = r3.prefix
                java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                int r0 = r0.length()
                r1 = 0
                r2 = 1
                if (r0 != 0) goto L23
                r0 = r2
                goto L24
            L23:
                r0 = r1
            L24:
                if (r0 == 0) goto L37
                java.lang.String r0 = r3.suffix
                java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                int r0 = r0.length()
                if (r0 != 0) goto L32
                r0 = r2
                goto L33
            L32:
                r0 = r1
            L33:
                if (r0 == 0) goto L37
                r0 = r2
                goto L38
            L37:
                r0 = r1
            L38:
                r3.isDigitsOnly = r0
                boolean r0 = r3.isDigitsOnly
                if (r0 == 0) goto L44
                int r0 = r3.minLength
                if (r0 != r2) goto L44
                r0 = r2
                goto L45
            L44:
                r0 = r1
            L45:
                r3.isDigitsOnlyAndNoPadding = r0
                java.lang.String r0 = r3.prefix
                boolean r0 = kotlin.text.HexFormatKt.access$isCaseSensitive(r0)
                if (r0 != 0) goto L57
                java.lang.String r0 = r3.suffix
                boolean r0 = kotlin.text.HexFormatKt.access$isCaseSensitive(r0)
                if (r0 == 0) goto L58
            L57:
                r1 = r2
            L58:
                r3.ignoreCase = r1
                return
        }

        public static final /* synthetic */ kotlin.text.HexFormat.NumberHexFormat access$getDefault$cp() {
                kotlin.text.HexFormat$NumberHexFormat r0 = kotlin.text.HexFormat.NumberHexFormat.Default
                return r0
        }

        public static /* synthetic */ void getMinLength$annotations() {
                return
        }

        public final java.lang.StringBuilder appendOptionsTo$kotlin_stdlib(java.lang.StringBuilder r6, java.lang.String r7) {
                r5 = this;
                java.lang.String r0 = "sb"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
                java.lang.String r0 = "indent"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
                java.lang.StringBuilder r0 = r6.append(r7)
                java.lang.String r1 = "prefix = \""
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = r5.prefix
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = "append(...)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
                java.lang.String r2 = "\","
                java.lang.StringBuilder r0 = r0.append(r2)
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
                r3 = 10
                java.lang.StringBuilder r0 = r0.append(r3)
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
                java.lang.StringBuilder r0 = r6.append(r7)
                java.lang.String r4 = "suffix = \""
                java.lang.StringBuilder r0 = r0.append(r4)
                java.lang.String r4 = r5.suffix
                java.lang.StringBuilder r0 = r0.append(r4)
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
                java.lang.StringBuilder r0 = r0.append(r2)
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
                java.lang.StringBuilder r0 = r0.append(r3)
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
                java.lang.StringBuilder r0 = r6.append(r7)
                java.lang.String r2 = "removeLeadingZeros = "
                java.lang.StringBuilder r0 = r0.append(r2)
                boolean r2 = r5.removeLeadingZeros
                java.lang.StringBuilder r0 = r0.append(r2)
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
                r2 = 44
                java.lang.StringBuilder r0 = r0.append(r2)
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
                java.lang.StringBuilder r0 = r0.append(r3)
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
                java.lang.StringBuilder r0 = r6.append(r7)
                java.lang.String r1 = "minLength = "
                java.lang.StringBuilder r0 = r0.append(r1)
                int r1 = r5.minLength
                r0.append(r1)
                return r6
        }

        public final boolean getIgnoreCase$kotlin_stdlib() {
                r1 = this;
                boolean r0 = r1.ignoreCase
                return r0
        }

        public final int getMinLength() {
                r1 = this;
                int r0 = r1.minLength
                return r0
        }

        public final java.lang.String getPrefix() {
                r1 = this;
                java.lang.String r0 = r1.prefix
                return r0
        }

        public final boolean getRemoveLeadingZeros() {
                r1 = this;
                boolean r0 = r1.removeLeadingZeros
                return r0
        }

        public final java.lang.String getSuffix() {
                r1 = this;
                java.lang.String r0 = r1.suffix
                return r0
        }

        public final boolean isDigitsOnly$kotlin_stdlib() {
                r1 = this;
                boolean r0 = r1.isDigitsOnly
                return r0
        }

        public final boolean isDigitsOnlyAndNoPadding$kotlin_stdlib() {
                r1 = this;
                boolean r0 = r1.isDigitsOnlyAndNoPadding
                return r0
        }

        public java.lang.String toString() {
                r6 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r1 = r0
                r2 = 0
                java.lang.String r3 = "NumberHexFormat("
                java.lang.StringBuilder r3 = r1.append(r3)
                java.lang.String r4 = "append(...)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
                r5 = 10
                java.lang.StringBuilder r3 = r3.append(r5)
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
                java.lang.String r3 = "    "
                java.lang.StringBuilder r3 = r6.appendOptionsTo$kotlin_stdlib(r1, r3)
                java.lang.StringBuilder r3 = r3.append(r5)
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
                java.lang.String r3 = ")"
                r1.append(r3)
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "toString(...)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
                return r0
        }
    }

    static {
            kotlin.text.HexFormat$Companion r0 = new kotlin.text.HexFormat$Companion
            r1 = 0
            r0.<init>(r1)
            kotlin.text.HexFormat.Companion = r0
            kotlin.text.HexFormat r0 = new kotlin.text.HexFormat
            kotlin.text.HexFormat$BytesHexFormat$Companion r1 = kotlin.text.HexFormat.BytesHexFormat.Companion
            kotlin.text.HexFormat$BytesHexFormat r1 = r1.getDefault$kotlin_stdlib()
            kotlin.text.HexFormat$NumberHexFormat$Companion r2 = kotlin.text.HexFormat.NumberHexFormat.Companion
            kotlin.text.HexFormat$NumberHexFormat r2 = r2.getDefault$kotlin_stdlib()
            r3 = 0
            r0.<init>(r3, r1, r2)
            kotlin.text.HexFormat.Default = r0
            kotlin.text.HexFormat r0 = new kotlin.text.HexFormat
            kotlin.text.HexFormat$BytesHexFormat$Companion r1 = kotlin.text.HexFormat.BytesHexFormat.Companion
            kotlin.text.HexFormat$BytesHexFormat r1 = r1.getDefault$kotlin_stdlib()
            kotlin.text.HexFormat$NumberHexFormat$Companion r2 = kotlin.text.HexFormat.NumberHexFormat.Companion
            kotlin.text.HexFormat$NumberHexFormat r2 = r2.getDefault$kotlin_stdlib()
            r3 = 1
            r0.<init>(r3, r1, r2)
            kotlin.text.HexFormat.UpperCase = r0
            return
    }

    public HexFormat(boolean r2, kotlin.text.HexFormat.BytesHexFormat r3, kotlin.text.HexFormat.NumberHexFormat r4) {
            r1 = this;
            java.lang.String r0 = "bytes"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "number"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r1.<init>()
            r1.upperCase = r2
            r1.bytes = r3
            r1.number = r4
            return
    }

    public static final /* synthetic */ kotlin.text.HexFormat access$getDefault$cp() {
            kotlin.text.HexFormat r0 = kotlin.text.HexFormat.Default
            return r0
    }

    public static final /* synthetic */ kotlin.text.HexFormat access$getUpperCase$cp() {
            kotlin.text.HexFormat r0 = kotlin.text.HexFormat.UpperCase
            return r0
    }

    public final kotlin.text.HexFormat.BytesHexFormat getBytes() {
            r1 = this;
            kotlin.text.HexFormat$BytesHexFormat r0 = r1.bytes
            return r0
    }

    public final kotlin.text.HexFormat.NumberHexFormat getNumber() {
            r1 = this;
            kotlin.text.HexFormat$NumberHexFormat r0 = r1.number
            return r0
    }

    public final boolean getUpperCase() {
            r1 = this;
            boolean r0 = r1.upperCase
            return r0
    }

    public java.lang.String toString() {
            r7 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = r0
            r2 = 0
            java.lang.String r3 = "HexFormat("
            java.lang.StringBuilder r3 = r1.append(r3)
            java.lang.String r4 = "append(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            r5 = 10
            java.lang.StringBuilder r3 = r3.append(r5)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            java.lang.String r3 = "    upperCase = "
            java.lang.StringBuilder r3 = r1.append(r3)
            boolean r6 = r7.upperCase
            java.lang.StringBuilder r3 = r3.append(r6)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            java.lang.String r6 = ","
            java.lang.StringBuilder r3 = r3.append(r6)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            java.lang.StringBuilder r3 = r3.append(r5)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            java.lang.String r3 = "    bytes = BytesHexFormat("
            java.lang.StringBuilder r3 = r1.append(r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            java.lang.StringBuilder r3 = r3.append(r5)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            kotlin.text.HexFormat$BytesHexFormat r3 = r7.bytes
            java.lang.String r6 = "        "
            java.lang.StringBuilder r3 = r3.appendOptionsTo$kotlin_stdlib(r1, r6)
            java.lang.StringBuilder r3 = r3.append(r5)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            java.lang.String r3 = "    ),"
            java.lang.StringBuilder r3 = r1.append(r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            java.lang.StringBuilder r3 = r3.append(r5)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            java.lang.String r3 = "    number = NumberHexFormat("
            java.lang.StringBuilder r3 = r1.append(r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            java.lang.StringBuilder r3 = r3.append(r5)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            kotlin.text.HexFormat$NumberHexFormat r3 = r7.number
            java.lang.StringBuilder r3 = r3.appendOptionsTo$kotlin_stdlib(r1, r6)
            java.lang.StringBuilder r3 = r3.append(r5)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            java.lang.String r3 = "    )"
            java.lang.StringBuilder r3 = r1.append(r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            java.lang.StringBuilder r3 = r3.append(r5)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            java.lang.String r3 = ")"
            r1.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "toString(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }
}
