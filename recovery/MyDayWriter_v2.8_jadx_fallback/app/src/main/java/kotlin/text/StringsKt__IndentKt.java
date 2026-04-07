package kotlin.text;

/* JADX INFO: compiled from: Indent.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u000b\u001a!\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0002\b\u0004\u001a\u0011\u0010\u0005\u001a\u00020\u0006*\u00020\u0002H\u0002¢\u0006\u0002\b\u0007\u001a\u0014\u0010\b\u001a\u00020\u0002*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u001aJ\u0010\t\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00062\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001H\u0082\b¢\u0006\u0002\b\u000e\u001a\u0014\u0010\u000f\u001a\u00020\u0002*\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u0002\u001a\u001e\u0010\u0011\u001a\u00020\u0002*\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u0002\u001a\f\u0010\u0013\u001a\u00020\u0002*\u00020\u0002H\u0007\u001a\u0016\u0010\u0014\u001a\u00020\u0002*\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u0002H\u0007¨\u0006\u0015"}, d2 = {"getIndentFunction", "Lkotlin/Function1;", "", "indent", "getIndentFunction$StringsKt__IndentKt", "indentWidth", "", "indentWidth$StringsKt__IndentKt", "prependIndent", "reindent", "", "resultSizeEstimate", "indentAddFunction", "indentCutFunction", "reindent$StringsKt__IndentKt", "replaceIndent", "newIndent", "replaceIndentByMargin", "marginPrefix", "trimIndent", "trimMargin", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/text/StringsKt")
class StringsKt__IndentKt extends kotlin.text.StringsKt__AppendableKt {


    public StringsKt__IndentKt() {
            r0 = this;
            r0.<init>()
            return
    }

    private static final kotlin.jvm.functions.Function1<java.lang.String, java.lang.String> getIndentFunction$StringsKt__IndentKt(java.lang.String r1) {
            r0 = r1
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            int r0 = r0.length()
            if (r0 != 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            if (r0 == 0) goto L14
            kotlin.text.StringsKt__IndentKt$getIndentFunction$1 r0 = kotlin.text.StringsKt__IndentKt$getIndentFunction$1.INSTANCE
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
            goto L1b
        L14:
            kotlin.text.StringsKt__IndentKt$getIndentFunction$2 r0 = new kotlin.text.StringsKt__IndentKt$getIndentFunction$2
            r0.<init>(r1)
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
        L1b:
            return r0
    }

    private static final int indentWidth$StringsKt__IndentKt(java.lang.String r8) {
            r0 = r8
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r1 = 0
            r2 = 0
            int r3 = r0.length()
        L9:
            r4 = -1
            if (r2 >= r3) goto L1b
            char r5 = r0.charAt(r2)
            r6 = 0
            boolean r7 = kotlin.text.CharsKt.isWhitespace(r5)
            if (r7 != 0) goto L18
            goto L1c
        L18:
            int r2 = r2 + 1
            goto L9
        L1b:
            r2 = r4
        L1c:
            r0 = 0
            if (r2 != r4) goto L25
            int r1 = r8.length()
            r2 = r1
        L25:
            return r2
    }

    public static final java.lang.String prependIndent(java.lang.String r11, java.lang.String r12) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.lang.String r0 = "indent"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            r0 = r11
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            kotlin.sequences.Sequence r0 = kotlin.text.StringsKt.lineSequence(r0)
            kotlin.text.StringsKt__IndentKt$prependIndent$1 r1 = new kotlin.text.StringsKt__IndentKt$prependIndent$1
            r1.<init>(r12)
            kotlin.jvm.functions.Function1 r1 = (kotlin.jvm.functions.Function1) r1
            kotlin.sequences.Sequence r2 = kotlin.sequences.SequencesKt.map(r0, r1)
            java.lang.String r0 = "\n"
            r3 = r0
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            r9 = 62
            r10 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            java.lang.String r0 = kotlin.sequences.SequencesKt.joinToString$default(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r0
    }

    public static /* synthetic */ java.lang.String prependIndent$default(java.lang.String r0, java.lang.String r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L6
            java.lang.String r1 = "    "
        L6:
            java.lang.String r0 = kotlin.text.StringsKt.prependIndent(r0, r1)
            return r0
    }

    private static final java.lang.String reindent$StringsKt__IndentKt(java.util.List<java.lang.String> r20, int r21, kotlin.jvm.functions.Function1<? super java.lang.String, java.lang.String> r22, kotlin.jvm.functions.Function1<? super java.lang.String, java.lang.String> r23) {
            r0 = 0
            int r1 = kotlin.collections.CollectionsKt.getLastIndex(r20)
            r2 = r20
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            r3 = 0
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Collection r4 = (java.util.Collection) r4
            r5 = r2
            r6 = 0
            r7 = r5
            r8 = 0
            r9 = 0
            java.util.Iterator r10 = r7.iterator()
        L1a:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L93
            java.lang.Object r11 = r10.next()
            int r12 = r9 + 1
            if (r9 >= 0) goto L3d
            r13 = 3
            r14 = 0
            r15 = 1
            boolean r13 = kotlin.internal.PlatformImplementationsKt.apiVersionIsAtLeast(r15, r13, r14)
            if (r13 == 0) goto L35
            kotlin.collections.CollectionsKt.throwIndexOverflow()
            goto L3d
        L35:
            java.lang.ArithmeticException r9 = new java.lang.ArithmeticException
            java.lang.String r10 = "Index overflow has happened."
            r9.<init>(r10)
            throw r9
        L3d:
            r13 = r11
            r14 = 0
            r15 = r13
            java.lang.String r15 = (java.lang.String) r15
            r16 = r9
            r17 = 0
            if (r16 == 0) goto L4f
            r18 = r0
            r0 = r16
            if (r0 != r1) goto L66
            goto L53
        L4f:
            r18 = r0
            r0 = r16
        L53:
            r16 = r15
            java.lang.CharSequence r16 = (java.lang.CharSequence) r16
            boolean r16 = kotlin.text.StringsKt.isBlank(r16)
            if (r16 == 0) goto L66
            r16 = 0
            r19 = r1
            r15 = r16
            r1 = r22
            goto L87
        L66:
            r16 = r0
            r0 = r23
            java.lang.Object r19 = r0.invoke(r15)
            r0 = r19
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L83
            r19 = r1
            r1 = r22
            java.lang.Object r0 = r1.invoke(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L81
            goto L87
        L81:
            r15 = r0
            goto L87
        L83:
            r19 = r1
            r1 = r22
        L87:
            if (r15 == 0) goto L8d
            r0 = 0
            r4.add(r15)
        L8d:
            r9 = r12
            r0 = r18
            r1 = r19
            goto L1a
        L93:
            r18 = r0
            r0 = r4
            java.util.List r0 = (java.util.List) r0
            r4 = r0
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r2 = r21
            r0.<init>(r2)
            r5 = r0
            java.lang.Appendable r5 = (java.lang.Appendable) r5
            java.lang.String r0 = "\n"
            r6 = r0
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            r12 = 124(0x7c, float:1.74E-43)
            r13 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            java.lang.Appendable r0 = kotlin.collections.CollectionsKt.joinTo$default(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            java.lang.StringBuilder r0 = (java.lang.StringBuilder) r0
            java.lang.String r0 = r0.toString()
            java.lang.String r3 = "toString(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r3)
            return r0
    }

    public static final java.lang.String replaceIndent(java.lang.String r27, java.lang.String r28) {
            r0 = r27
            java.lang.String r1 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            java.lang.String r1 = "newIndent"
            r2 = r28
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r1)
            r1 = r0
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            java.util.List r1 = kotlin.text.StringsKt.lines(r1)
            r3 = r1
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            r4 = 0
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Collection r5 = (java.util.Collection) r5
            r6 = r3
            r7 = 0
            java.util.Iterator r8 = r6.iterator()
        L27:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L42
            java.lang.Object r9 = r8.next()
            r10 = r9
            java.lang.String r10 = (java.lang.String) r10
            r11 = 0
            r12 = r10
            java.lang.CharSequence r12 = (java.lang.CharSequence) r12
            boolean r12 = kotlin.text.StringsKt.isBlank(r12)
            if (r12 != 0) goto L27
            r5.add(r9)
            goto L27
        L42:
            java.util.List r5 = (java.util.List) r5
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            r3 = 0
            java.util.ArrayList r4 = new java.util.ArrayList
            r6 = 10
            int r6 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r5, r6)
            r4.<init>(r6)
            java.util.Collection r4 = (java.util.Collection) r4
            r6 = r5
            r7 = 0
            java.util.Iterator r8 = r6.iterator()
        L5d:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L77
            java.lang.Object r9 = r8.next()
            r10 = r9
            java.lang.String r10 = (java.lang.String) r10
            r11 = 0
            int r10 = indentWidth$StringsKt__IndentKt(r10)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r4.add(r10)
            goto L5d
        L77:
            java.util.List r4 = (java.util.List) r4
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.lang.Comparable r3 = kotlin.collections.CollectionsKt.minOrNull(r4)
            java.lang.Integer r3 = (java.lang.Integer) r3
            if (r3 == 0) goto L8a
            int r3 = r3.intValue()
            goto L8b
        L8a:
            r3 = 0
        L8b:
            int r4 = r0.length()
            int r5 = r2.length()
            int r6 = r1.size()
            int r5 = r5 * r6
            int r4 = r4 + r5
            kotlin.jvm.functions.Function1 r5 = getIndentFunction$StringsKt__IndentKt(r2)
            r6 = r1
            r7 = 0
            int r8 = kotlin.collections.CollectionsKt.getLastIndex(r6)
            r9 = r6
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            r10 = 0
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.Collection r11 = (java.util.Collection) r11
            r12 = r9
            r13 = 0
            r14 = r12
            r15 = 0
            r16 = 0
            java.util.Iterator r17 = r14.iterator()
        Lb9:
            boolean r18 = r17.hasNext()
            if (r18 == 0) goto L115
            java.lang.Object r18 = r17.next()
            int r19 = r16 + 1
            if (r16 >= 0) goto Lca
            kotlin.collections.CollectionsKt.throwIndexOverflow()
        Lca:
            r20 = r18
            r21 = 0
            r22 = r20
            java.lang.String r22 = (java.lang.String) r22
            r23 = r16
            r24 = 0
            if (r23 == 0) goto Ldd
            r0 = r23
            if (r0 != r8) goto Lee
            goto Ldf
        Ldd:
            r0 = r23
        Ldf:
            r23 = r22
            java.lang.CharSequence r23 = (java.lang.CharSequence) r23
            boolean r23 = kotlin.text.StringsKt.isBlank(r23)
            if (r23 == 0) goto Lee
            r23 = 0
            r22 = r23
            goto L107
        Lee:
            r23 = r22
            r25 = 0
            r26 = r0
            r0 = r23
            java.lang.String r0 = kotlin.text.StringsKt.drop(r0, r3)
            if (r0 == 0) goto L107
            java.lang.Object r0 = r5.invoke(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L105
            goto L107
        L105:
            r22 = r0
        L107:
            if (r22 == 0) goto L110
            r0 = r22
            r22 = 0
            r11.add(r0)
        L110:
            r0 = r27
            r16 = r19
            goto Lb9
        L115:
            r0 = r11
            java.util.List r0 = (java.util.List) r0
            r11 = r0
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r4)
            r12 = r0
            java.lang.Appendable r12 = (java.lang.Appendable) r12
            java.lang.String r0 = "\n"
            r13 = r0
            java.lang.CharSequence r13 = (java.lang.CharSequence) r13
            r19 = 124(0x7c, float:1.74E-43)
            r20 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            java.lang.Appendable r0 = kotlin.collections.CollectionsKt.joinTo$default(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            java.lang.StringBuilder r0 = (java.lang.StringBuilder) r0
            java.lang.String r0 = r0.toString()
            java.lang.String r9 = "toString(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r9)
            return r0
    }

    public static /* synthetic */ java.lang.String replaceIndent$default(java.lang.String r0, java.lang.String r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L6
            java.lang.String r1 = ""
        L6:
            java.lang.String r0 = kotlin.text.StringsKt.replaceIndent(r0, r1)
            return r0
    }

    public static final java.lang.String replaceIndentByMargin(java.lang.String r34, java.lang.String r35, java.lang.String r36) {
            r0 = r34
            r2 = r36
            java.lang.String r1 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            java.lang.String r1 = "newIndent"
            r7 = r35
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r1)
            java.lang.String r1 = "marginPrefix"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r1)
            r1 = r2
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r1 = kotlin.text.StringsKt.isBlank(r1)
            if (r1 != 0) goto L13b
            r1 = r0
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            java.util.List r8 = kotlin.text.StringsKt.lines(r1)
            int r1 = r0.length()
            int r3 = r7.length()
            int r4 = r8.size()
            int r3 = r3 * r4
            int r9 = r1 + r3
            kotlin.jvm.functions.Function1 r10 = getIndentFunction$StringsKt__IndentKt(r7)
            r11 = r8
            r12 = 0
            int r13 = kotlin.collections.CollectionsKt.getLastIndex(r11)
            r14 = r11
            java.lang.Iterable r14 = (java.lang.Iterable) r14
            r15 = 0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Collection r1 = (java.util.Collection) r1
            r16 = r14
            r17 = 0
            r18 = r16
            r19 = 0
            r3 = 0
            java.util.Iterator r20 = r18.iterator()
        L56:
            boolean r4 = r20.hasNext()
            if (r4 == 0) goto L104
            java.lang.Object r21 = r20.next()
            int r22 = r3 + 1
            if (r3 >= 0) goto L67
            kotlin.collections.CollectionsKt.throwIndexOverflow()
        L67:
            r23 = r21
            r24 = r3
            r25 = 0
            r26 = r23
            java.lang.String r26 = (java.lang.String) r26
            r27 = 0
            r28 = 0
            if (r3 == 0) goto L79
            if (r3 != r13) goto L88
        L79:
            r4 = r26
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            boolean r4 = kotlin.text.StringsKt.isBlank(r4)
            if (r4 == 0) goto L88
            r0 = r1
            r26 = r28
            goto Lf3
        L88:
            r4 = r1
            r1 = r26
            r29 = 0
            r5 = r1
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            r6 = 0
            r30 = 0
            int r0 = r5.length()
            r31 = r1
            r1 = r30
        L9b:
            r2 = -1
            if (r1 >= r0) goto Lb0
            char r30 = r5.charAt(r1)
            r32 = 0
            boolean r33 = kotlin.text.CharsKt.isWhitespace(r30)
            if (r33 != 0) goto Lab
            goto Lb1
        Lab:
            int r1 = r1 + 1
            r2 = r36
            goto L9b
        Lb0:
            r1 = r2
        Lb1:
            if (r1 != r2) goto Lbe
            r30 = r3
            r0 = r4
            r2 = r28
            r3 = r1
            r1 = r31
            goto Le5
        Lbe:
            r5 = 4
            r6 = 0
            r0 = r4
            r4 = 0
            r2 = r36
            r30 = r3
            r3 = r1
            r1 = r31
            boolean r4 = kotlin.text.StringsKt.startsWith$default(r1, r2, r3, r4, r5, r6)
            if (r4 == 0) goto Le3
            int r2 = r36.length()
            int r2 = r2 + r3
            java.lang.String r4 = "null cannot be cast to non-null type java.lang.String"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1, r4)
            java.lang.String r2 = r1.substring(r2)
            java.lang.String r4 = "substring(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r4)
            goto Le5
        Le3:
            r2 = r28
        Le5:
            if (r2 == 0) goto Lf3
            java.lang.Object r1 = r10.invoke(r2)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 != 0) goto Lf1
            goto Lf3
        Lf1:
            r26 = r1
        Lf3:
            if (r26 == 0) goto Lfb
            r1 = r26
            r2 = 0
            r0.add(r1)
        Lfb:
            r2 = r36
            r1 = r0
            r3 = r22
            r0 = r34
            goto L56
        L104:
            r0 = r1
            java.util.List r0 = (java.util.List) r0
            r16 = r0
            java.lang.Iterable r16 = (java.lang.Iterable) r16
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r9)
            r17 = r0
            java.lang.Appendable r17 = (java.lang.Appendable) r17
            java.lang.String r0 = "\n"
            r18 = r0
            java.lang.CharSequence r18 = (java.lang.CharSequence) r18
            r24 = 124(0x7c, float:1.74E-43)
            r25 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            java.lang.Appendable r0 = kotlin.collections.CollectionsKt.joinTo$default(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            java.lang.StringBuilder r0 = (java.lang.StringBuilder) r0
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "toString(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
        L13b:
            r0 = 0
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "marginPrefix must be non-blank string."
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public static /* synthetic */ java.lang.String replaceIndentByMargin$default(java.lang.String r0, java.lang.String r1, java.lang.String r2, int r3, java.lang.Object r4) {
            r4 = r3 & 1
            if (r4 == 0) goto L6
            java.lang.String r1 = ""
        L6:
            r3 = r3 & 2
            if (r3 == 0) goto Lc
            java.lang.String r2 = "|"
        Lc:
            java.lang.String r0 = kotlin.text.StringsKt.replaceIndentByMargin(r0, r1, r2)
            return r0
    }

    public static final java.lang.String trimIndent(java.lang.String r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = ""
            java.lang.String r0 = kotlin.text.StringsKt.replaceIndent(r1, r0)
            return r0
    }

    public static final java.lang.String trimMargin(java.lang.String r1, java.lang.String r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "marginPrefix"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = ""
            java.lang.String r0 = kotlin.text.StringsKt.replaceIndentByMargin(r1, r0, r2)
            return r0
    }

    public static /* synthetic */ java.lang.String trimMargin$default(java.lang.String r0, java.lang.String r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L6
            java.lang.String r1 = "|"
        L6:
            java.lang.String r0 = kotlin.text.StringsKt.trimMargin(r0, r1)
            return r0
    }
}
