package kotlin.text;

/* JADX INFO: compiled from: Regex.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 02\u00060\u0001j\u0002`\u0002:\u000201B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005B\u0017\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB\u001d\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\n¢\u0006\u0002\u0010\u000bB\u000f\b\u0001\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017J\u001a\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u001bJ\u001e\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00190\u001d2\u0006\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u001bJ\u001a\u0010\u001e\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020\u001bH\u0007J\u0010\u0010 \u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0016\u001a\u00020\u0017J\u0011\u0010!\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0086\u0004J\u0018\u0010\"\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020\u001bH\u0007J\"\u0010#\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00172\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00170%J\u0016\u0010#\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010&\u001a\u00020\u0004J\u0016\u0010'\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010&\u001a\u00020\u0004J\u001e\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00040)2\u0006\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010*\u001a\u00020\u001bJ \u0010+\u001a\b\u0012\u0004\u0012\u00020\u00040\u001d2\u0006\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010*\u001a\u00020\u001bH\u0007J\u0006\u0010,\u001a\u00020\rJ\b\u0010-\u001a\u00020\u0004H\u0016J\b\u0010.\u001a\u00020/H\u0002R\u0016\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\n8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u00062"}, d2 = {"Lkotlin/text/Regex;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "pattern", "", "(Ljava/lang/String;)V", "option", "Lkotlin/text/RegexOption;", "(Ljava/lang/String;Lkotlin/text/RegexOption;)V", "options", "", "(Ljava/lang/String;Ljava/util/Set;)V", "nativePattern", "Ljava/util/regex/Pattern;", "(Ljava/util/regex/Pattern;)V", "_options", "getOptions", "()Ljava/util/Set;", "getPattern", "()Ljava/lang/String;", "containsMatchIn", "", "input", "", "find", "Lkotlin/text/MatchResult;", "startIndex", "", "findAll", "Lkotlin/sequences/Sequence;", "matchAt", "index", "matchEntire", "matches", "matchesAt", "replace", "transform", "Lkotlin/Function1;", "replacement", "replaceFirst", "split", "", "limit", "splitToSequence", "toPattern", "toString", "writeReplace", "", "Companion", "Serialized", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class Regex implements java.io.Serializable {
    public static final kotlin.text.Regex.Companion Companion = null;
    private java.util.Set<? extends kotlin.text.RegexOption> _options;
    private final java.util.regex.Pattern nativePattern;

    /* JADX INFO: compiled from: Regex.kt */
    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\t\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0007¨\u0006\f"}, d2 = {"Lkotlin/text/Regex$Companion;", "", "()V", "ensureUnicodeCase", "", "flags", "escape", "", "literal", "escapeReplacement", "fromLiteral", "Lkotlin/text/Regex;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
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

        public static final /* synthetic */ int access$ensureUnicodeCase(kotlin.text.Regex.Companion r1, int r2) {
                int r0 = r1.ensureUnicodeCase(r2)
                return r0
        }

        private final int ensureUnicodeCase(int r2) {
                r1 = this;
                r0 = r2 & 2
                if (r0 == 0) goto L7
                r0 = r2 | 64
                goto L8
            L7:
                r0 = r2
            L8:
                return r0
        }

        public final java.lang.String escape(java.lang.String r3) {
                r2 = this;
                java.lang.String r0 = "literal"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                java.lang.String r0 = java.util.regex.Pattern.quote(r3)
                java.lang.String r1 = "quote(...)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
                return r0
        }

        public final java.lang.String escapeReplacement(java.lang.String r3) {
                r2 = this;
                java.lang.String r0 = "literal"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                java.lang.String r0 = java.util.regex.Matcher.quoteReplacement(r3)
                java.lang.String r1 = "quoteReplacement(...)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
                return r0
        }

        public final kotlin.text.Regex fromLiteral(java.lang.String r3) {
                r2 = this;
                java.lang.String r0 = "literal"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                kotlin.text.Regex r0 = new kotlin.text.Regex
                kotlin.text.RegexOption r1 = kotlin.text.RegexOption.LITERAL
                r0.<init>(r3, r1)
                return r0
        }
    }

    /* JADX INFO: compiled from: Regex.kt */
    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0002\u0018\u0000 \u000e2\u00060\u0001j\u0002`\u0002:\u0001\u000eB\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\f\u001a\u00020\rH\u0002R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lkotlin/text/Regex$Serialized;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "pattern", "", "flags", "", "(Ljava/lang/String;I)V", "getFlags", "()I", "getPattern", "()Ljava/lang/String;", "readResolve", "", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class Serialized implements java.io.Serializable {
        public static final kotlin.text.Regex.Serialized.Companion Companion = null;
        private static final long serialVersionUID = 0;
        private final int flags;
        private final java.lang.String pattern;

        /* JADX INFO: compiled from: Regex.kt */
        @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lkotlin/text/Regex$Serialized$Companion;", "", "()V", "serialVersionUID", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
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
        }

        static {
                kotlin.text.Regex$Serialized$Companion r0 = new kotlin.text.Regex$Serialized$Companion
                r1 = 0
                r0.<init>(r1)
                kotlin.text.Regex.Serialized.Companion = r0
                return
        }

        public Serialized(java.lang.String r2, int r3) {
                r1 = this;
                java.lang.String r0 = "pattern"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                r1.<init>()
                r1.pattern = r2
                r1.flags = r3
                return
        }

        private final java.lang.Object readResolve() {
                r3 = this;
                kotlin.text.Regex r0 = new kotlin.text.Regex
                java.lang.String r1 = r3.pattern
                int r2 = r3.flags
                java.util.regex.Pattern r1 = java.util.regex.Pattern.compile(r1, r2)
                java.lang.String r2 = "compile(...)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
                r0.<init>(r1)
                return r0
        }

        public final int getFlags() {
                r1 = this;
                int r0 = r1.flags
                return r0
        }

        public final java.lang.String getPattern() {
                r1 = this;
                java.lang.String r0 = r1.pattern
                return r0
        }
    }


    /* JADX INFO: renamed from: kotlin.text.Regex$findAll$2, reason: invalid class name */
    /* JADX INFO: compiled from: Regex.kt */
    @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* synthetic */ class AnonymousClass2 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<kotlin.text.MatchResult, kotlin.text.MatchResult> {
        public static final kotlin.text.Regex.AnonymousClass2 INSTANCE = null;

        static {
                kotlin.text.Regex$findAll$2 r0 = new kotlin.text.Regex$findAll$2
                r0.<init>()
                kotlin.text.Regex.AnonymousClass2.INSTANCE = r0
                return
        }

        AnonymousClass2() {
                r6 = this;
                java.lang.Class<kotlin.text.MatchResult> r2 = kotlin.text.MatchResult.class
                java.lang.String r4 = "next()Lkotlin/text/MatchResult;"
                r5 = 0
                r1 = 1
                java.lang.String r3 = "next"
                r0 = r6
                r0.<init>(r1, r2, r3, r4, r5)
                return
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ kotlin.text.MatchResult invoke(kotlin.text.MatchResult r2) {
                r1 = this;
                r0 = r2
                kotlin.text.MatchResult r0 = (kotlin.text.MatchResult) r0
                kotlin.text.MatchResult r0 = r1.invoke2(r0)
                return r0
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final kotlin.text.MatchResult invoke2(kotlin.text.MatchResult r2) {
                r1 = this;
                java.lang.String r0 = "p0"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                kotlin.text.MatchResult r0 = r2.next()
                return r0
        }
    }

    /* JADX INFO: renamed from: kotlin.text.Regex$splitToSequence$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Regex.kt */
    @kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlin/sequences/SequenceScope;", ""}, k = 3, mv = {1, 9, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlin.text.Regex$splitToSequence$1", f = "Regex.kt", i = {1, 1, 1}, l = {275, 283, 287}, m = "invokeSuspend", n = {"$this$sequence", "matcher", "splitCount"}, s = {"L$0", "L$1", "I$0"})
    static final class C00641 extends kotlin.coroutines.jvm.internal.RestrictedSuspendLambda implements kotlin.jvm.functions.Function2<kotlin.sequences.SequenceScope<? super java.lang.String>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ java.lang.CharSequence $input;
        final /* synthetic */ int $limit;
        int I$0;
        private /* synthetic */ java.lang.Object L$0;
        java.lang.Object L$1;
        int label;
        final /* synthetic */ kotlin.text.Regex this$0;

        C00641(kotlin.text.Regex r2, java.lang.CharSequence r3, int r4, kotlin.coroutines.Continuation<? super kotlin.text.Regex.C00641> r5) {
                r1 = this;
                r1.this$0 = r2
                r1.$input = r3
                r1.$limit = r4
                r0 = 2
                r1.<init>(r0, r5)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object r5, kotlin.coroutines.Continuation<?> r6) {
                r4 = this;
                kotlin.text.Regex$splitToSequence$1 r0 = new kotlin.text.Regex$splitToSequence$1
                kotlin.text.Regex r1 = r4.this$0
                java.lang.CharSequence r2 = r4.$input
                int r3 = r4.$limit
                r0.<init>(r1, r2, r3, r6)
                r0.L$0 = r5
                kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
                return r0
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(kotlin.sequences.SequenceScope<? super java.lang.String> r2, kotlin.coroutines.Continuation<? super kotlin.Unit> r3) {
                r1 = this;
                kotlin.sequences.SequenceScope r2 = (kotlin.sequences.SequenceScope) r2
                kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
                java.lang.Object r0 = r1.invoke2(r2, r3)
                return r0
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final java.lang.Object invoke2(kotlin.sequences.SequenceScope<? super java.lang.String> r3, kotlin.coroutines.Continuation<? super kotlin.Unit> r4) {
                r2 = this;
                kotlin.coroutines.Continuation r0 = r2.create(r3, r4)
                kotlin.text.Regex$splitToSequence$1 r0 = (kotlin.text.Regex.C00641) r0
                kotlin.Unit r1 = kotlin.Unit.INSTANCE
                java.lang.Object r0 = r0.invokeSuspend(r1)
                return r0
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
                r9 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r9.label
                r2 = 1
                switch(r1) {
                    case 0: goto L2c;
                    case 1: goto L27;
                    case 2: goto L18;
                    case 3: goto L12;
                    default: goto La;
                }
            La:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L12:
                kotlin.ResultKt.throwOnFailure(r10)
                r6 = r9
                goto La5
            L18:
                int r1 = r9.I$0
                java.lang.Object r3 = r9.L$1
                java.util.regex.Matcher r3 = (java.util.regex.Matcher) r3
                java.lang.Object r4 = r9.L$0
                kotlin.sequences.SequenceScope r4 = (kotlin.sequences.SequenceScope) r4
                kotlin.ResultKt.throwOnFailure(r10)
                r6 = r9
                goto L72
            L27:
                kotlin.ResultKt.throwOnFailure(r10)
                goto Lba
            L2c:
                kotlin.ResultKt.throwOnFailure(r10)
                java.lang.Object r1 = r9.L$0
                kotlin.sequences.SequenceScope r1 = (kotlin.sequences.SequenceScope) r1
                kotlin.text.Regex r3 = r9.this$0
                java.util.regex.Pattern r3 = kotlin.text.Regex.access$getNativePattern$p(r3)
                java.lang.CharSequence r4 = r9.$input
                java.util.regex.Matcher r3 = r3.matcher(r4)
                int r4 = r9.$limit
                if (r4 == r2) goto La8
                boolean r4 = r3.find()
                if (r4 != 0) goto L4a
                goto La8
            L4a:
                r4 = 0
                r5 = 0
                r6 = r4
                r4 = r1
                r1 = r5
                r5 = r6
                r6 = r9
            L51:
                java.lang.CharSequence r7 = r6.$input
                int r8 = r3.start()
                java.lang.CharSequence r7 = r7.subSequence(r5, r8)
                java.lang.String r5 = r7.toString()
                r7 = r6
                kotlin.coroutines.Continuation r7 = (kotlin.coroutines.Continuation) r7
                r6.L$0 = r4
                r6.L$1 = r3
                r6.I$0 = r1
                r8 = 2
                r6.label = r8
                java.lang.Object r5 = r4.yield(r5, r7)
                if (r5 != r0) goto L72
                return r0
            L72:
                int r5 = r3.end()
                int r1 = r1 + r2
                int r7 = r6.$limit
                int r7 = r7 - r2
                if (r1 == r7) goto L82
                boolean r7 = r3.find()
                if (r7 != 0) goto L51
            L82:
            L83:
                java.lang.CharSequence r1 = r6.$input
                java.lang.CharSequence r2 = r6.$input
                int r2 = r2.length()
                java.lang.CharSequence r1 = r1.subSequence(r5, r2)
                java.lang.String r1 = r1.toString()
                r2 = r6
                kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
                r3 = 0
                r6.L$0 = r3
                r6.L$1 = r3
                r3 = 3
                r6.label = r3
                java.lang.Object r1 = r4.yield(r1, r2)
                if (r1 != r0) goto La5
                return r0
            La5:
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                return r0
            La8:
                java.lang.CharSequence r3 = r9.$input
                java.lang.String r3 = r3.toString()
                r4 = r9
                kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation) r4
                r9.label = r2
                java.lang.Object r1 = r1.yield(r3, r4)
                if (r1 != r0) goto Lba
                return r0
            Lba:
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                return r0
        }
    }

    static {
            kotlin.text.Regex$Companion r0 = new kotlin.text.Regex$Companion
            r1 = 0
            r0.<init>(r1)
            kotlin.text.Regex.Companion = r0
            return
    }

    public Regex(java.lang.String r3) {
            r2 = this;
            java.lang.String r0 = "pattern"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r3)
            java.lang.String r1 = "compile(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r2.<init>(r0)
            return
    }

    public Regex(java.lang.String r3, java.util.Set<? extends kotlin.text.RegexOption> r4) {
            r2 = this;
            java.lang.String r0 = "pattern"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "options"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            kotlin.text.Regex$Companion r0 = kotlin.text.Regex.Companion
            r1 = r4
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            int r1 = kotlin.text.RegexKt.access$toInt(r1)
            int r0 = kotlin.text.Regex.Companion.access$ensureUnicodeCase(r0, r1)
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r3, r0)
            java.lang.String r1 = "compile(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r2.<init>(r0)
            return
    }

    public Regex(java.lang.String r3, kotlin.text.RegexOption r4) {
            r2 = this;
            java.lang.String r0 = "pattern"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "option"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            kotlin.text.Regex$Companion r0 = kotlin.text.Regex.Companion
            int r1 = r4.getValue()
            int r0 = kotlin.text.Regex.Companion.access$ensureUnicodeCase(r0, r1)
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r3, r0)
            java.lang.String r1 = "compile(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r2.<init>(r0)
            return
    }

    public Regex(java.util.regex.Pattern r2) {
            r1 = this;
            java.lang.String r0 = "nativePattern"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.<init>()
            r1.nativePattern = r2
            return
    }

    public static final /* synthetic */ java.util.regex.Pattern access$getNativePattern$p(kotlin.text.Regex r1) {
            java.util.regex.Pattern r0 = r1.nativePattern
            return r0
    }

    public static /* synthetic */ kotlin.text.MatchResult find$default(kotlin.text.Regex r0, java.lang.CharSequence r1, int r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = 0
        L5:
            kotlin.text.MatchResult r0 = r0.find(r1, r2)
            return r0
    }

    public static /* synthetic */ kotlin.sequences.Sequence findAll$default(kotlin.text.Regex r0, java.lang.CharSequence r1, int r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = 0
        L5:
            kotlin.sequences.Sequence r0 = r0.findAll(r1, r2)
            return r0
    }

    public static /* synthetic */ java.util.List split$default(kotlin.text.Regex r0, java.lang.CharSequence r1, int r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = 0
        L5:
            java.util.List r0 = r0.split(r1, r2)
            return r0
    }

    public static /* synthetic */ kotlin.sequences.Sequence splitToSequence$default(kotlin.text.Regex r0, java.lang.CharSequence r1, int r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = 0
        L5:
            kotlin.sequences.Sequence r0 = r0.splitToSequence(r1, r2)
            return r0
    }

    private final java.lang.Object writeReplace() {
            r3 = this;
            kotlin.text.Regex$Serialized r0 = new kotlin.text.Regex$Serialized
            java.util.regex.Pattern r1 = r3.nativePattern
            java.lang.String r1 = r1.pattern()
            java.lang.String r2 = "pattern(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            java.util.regex.Pattern r2 = r3.nativePattern
            int r2 = r2.flags()
            r0.<init>(r1, r2)
            return r0
    }

    public final boolean containsMatchIn(java.lang.CharSequence r2) {
            r1 = this;
            java.lang.String r0 = "input"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.util.regex.Pattern r0 = r1.nativePattern
            java.util.regex.Matcher r0 = r0.matcher(r2)
            boolean r0 = r0.find()
            return r0
    }

    public final kotlin.text.MatchResult find(java.lang.CharSequence r3, int r4) {
            r2 = this;
            java.lang.String r0 = "input"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.util.regex.Pattern r0 = r2.nativePattern
            java.util.regex.Matcher r0 = r0.matcher(r3)
            java.lang.String r1 = "matcher(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            kotlin.text.MatchResult r0 = kotlin.text.RegexKt.access$findNext(r0, r4, r3)
            return r0
    }

    public final kotlin.sequences.Sequence<kotlin.text.MatchResult> findAll(java.lang.CharSequence r4, int r5) {
            r3 = this;
            java.lang.String r0 = "input"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            if (r5 < 0) goto L1d
            int r0 = r4.length()
            if (r5 > r0) goto L1d
            kotlin.text.Regex$findAll$1 r0 = new kotlin.text.Regex$findAll$1
            r0.<init>(r3, r4, r5)
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            kotlin.text.Regex$findAll$2 r1 = kotlin.text.Regex.AnonymousClass2.INSTANCE
            kotlin.jvm.functions.Function1 r1 = (kotlin.jvm.functions.Function1) r1
            kotlin.sequences.Sequence r0 = kotlin.sequences.SequencesKt.generateSequence(r0, r1)
            return r0
        L1d:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Start index out of bounds: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r5)
            java.lang.String r2 = ", input length: "
            java.lang.StringBuilder r1 = r1.append(r2)
            int r2 = r4.length()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public final java.util.Set<kotlin.text.RegexOption> getOptions() {
            r7 = this;
            java.util.Set<? extends kotlin.text.RegexOption> r0 = r7._options
            if (r0 != 0) goto L34
            java.util.regex.Pattern r0 = r7.nativePattern
            int r0 = r0.flags()
            r1 = 0
            java.lang.Class<kotlin.text.RegexOption> r2 = kotlin.text.RegexOption.class
            java.util.EnumSet r2 = java.util.EnumSet.allOf(r2)
            r3 = r2
            r4 = 0
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3)
            r5 = r3
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            kotlin.text.Regex$special$$inlined$fromInt$1 r6 = new kotlin.text.Regex$special$$inlined$fromInt$1
            r6.<init>(r0)
            kotlin.jvm.functions.Function1 r6 = (kotlin.jvm.functions.Function1) r6
            kotlin.collections.CollectionsKt.retainAll(r5, r6)
            java.util.Set r2 = (java.util.Set) r2
            java.util.Set r2 = java.util.Collections.unmodifiableSet(r2)
            java.lang.String r3 = "unmodifiableSet(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            r0 = r2
            r1 = 0
            r7._options = r0
        L34:
            return r0
    }

    public final java.lang.String getPattern() {
            r2 = this;
            java.util.regex.Pattern r0 = r2.nativePattern
            java.lang.String r0 = r0.pattern()
            java.lang.String r1 = "pattern(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    public final kotlin.text.MatchResult matchAt(java.lang.CharSequence r4, int r5) {
            r3 = this;
            java.lang.String r0 = "input"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.util.regex.Pattern r0 = r3.nativePattern
            java.util.regex.Matcher r0 = r0.matcher(r4)
            r1 = 0
            java.util.regex.Matcher r0 = r0.useAnchoringBounds(r1)
            r1 = 1
            java.util.regex.Matcher r0 = r0.useTransparentBounds(r1)
            int r1 = r4.length()
            java.util.regex.Matcher r0 = r0.region(r5, r1)
            r1 = 0
            boolean r2 = r0.lookingAt()
            if (r2 == 0) goto L2d
            kotlin.text.MatcherMatchResult r2 = new kotlin.text.MatcherMatchResult
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            r2.<init>(r0, r4)
            goto L2e
        L2d:
            r2 = 0
        L2e:
            kotlin.text.MatchResult r2 = (kotlin.text.MatchResult) r2
            return r2
    }

    public final kotlin.text.MatchResult matchEntire(java.lang.CharSequence r3) {
            r2 = this;
            java.lang.String r0 = "input"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.util.regex.Pattern r0 = r2.nativePattern
            java.util.regex.Matcher r0 = r0.matcher(r3)
            java.lang.String r1 = "matcher(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            kotlin.text.MatchResult r0 = kotlin.text.RegexKt.access$matchEntire(r0, r3)
            return r0
    }

    public final boolean matches(java.lang.CharSequence r2) {
            r1 = this;
            java.lang.String r0 = "input"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.util.regex.Pattern r0 = r1.nativePattern
            java.util.regex.Matcher r0 = r0.matcher(r2)
            boolean r0 = r0.matches()
            return r0
    }

    public final boolean matchesAt(java.lang.CharSequence r3, int r4) {
            r2 = this;
            java.lang.String r0 = "input"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.util.regex.Pattern r0 = r2.nativePattern
            java.util.regex.Matcher r0 = r0.matcher(r3)
            r1 = 0
            java.util.regex.Matcher r0 = r0.useAnchoringBounds(r1)
            r1 = 1
            java.util.regex.Matcher r0 = r0.useTransparentBounds(r1)
            int r1 = r3.length()
            java.util.regex.Matcher r0 = r0.region(r4, r1)
            boolean r0 = r0.lookingAt()
            return r0
    }

    public final java.lang.String replace(java.lang.CharSequence r3, java.lang.String r4) {
            r2 = this;
            java.lang.String r0 = "input"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "replacement"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.util.regex.Pattern r0 = r2.nativePattern
            java.util.regex.Matcher r0 = r0.matcher(r3)
            java.lang.String r0 = r0.replaceAll(r4)
            java.lang.String r1 = "replaceAll(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    public final java.lang.String replace(java.lang.CharSequence r7, kotlin.jvm.functions.Function1<? super kotlin.text.MatchResult, ? extends java.lang.CharSequence> r8) {
            r6 = this;
            java.lang.String r0 = "input"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "transform"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r0 = 2
            r1 = 0
            r2 = 0
            kotlin.text.MatchResult r0 = find$default(r6, r7, r2, r0, r1)
            if (r0 != 0) goto L18
            java.lang.String r0 = r7.toString()
            return r0
        L18:
            r1 = 0
            int r2 = r7.length()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
        L22:
            r4 = r0
            kotlin.ranges.IntRange r5 = r4.getRange()
            java.lang.Integer r5 = r5.getStart()
            int r5 = r5.intValue()
            r3.append(r7, r1, r5)
            java.lang.Object r5 = r8.invoke(r4)
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            r3.append(r5)
            kotlin.ranges.IntRange r5 = r4.getRange()
            java.lang.Integer r5 = r5.getEndInclusive()
            int r5 = r5.intValue()
            int r1 = r5 + 1
            kotlin.text.MatchResult r0 = r4.next()
            if (r1 >= r2) goto L51
            if (r0 != 0) goto L22
        L51:
            if (r1 >= r2) goto L56
            r3.append(r7, r1, r2)
        L56:
            java.lang.String r4 = r3.toString()
            java.lang.String r5 = "toString(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r5)
            return r4
    }

    public final java.lang.String replaceFirst(java.lang.CharSequence r3, java.lang.String r4) {
            r2 = this;
            java.lang.String r0 = "input"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "replacement"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.util.regex.Pattern r0 = r2.nativePattern
            java.util.regex.Matcher r0 = r0.matcher(r3)
            java.lang.String r0 = r0.replaceFirst(r4)
            java.lang.String r1 = "replaceFirst(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    public final java.util.List<java.lang.String> split(java.lang.CharSequence r6, int r7) {
            r5 = this;
            java.lang.String r0 = "input"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            kotlin.text.StringsKt.requireNonNegativeLimit(r7)
            java.util.regex.Pattern r0 = r5.nativePattern
            java.util.regex.Matcher r0 = r0.matcher(r6)
            r1 = 1
            if (r7 == r1) goto L5c
            boolean r1 = r0.find()
            if (r1 != 0) goto L18
            goto L5c
        L18:
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            if (r7 <= 0) goto L22
            int r2 = kotlin.ranges.RangesKt.coerceAtMost(r7, r2)
        L22:
            r1.<init>(r2)
            r2 = 0
            int r3 = r7 + (-1)
        L28:
            int r4 = r0.start()
            java.lang.CharSequence r4 = r6.subSequence(r2, r4)
            java.lang.String r4 = r4.toString()
            r1.add(r4)
            int r2 = r0.end()
            if (r3 < 0) goto L43
            int r4 = r1.size()
            if (r4 == r3) goto L49
        L43:
            boolean r4 = r0.find()
            if (r4 != 0) goto L28
        L49:
            int r4 = r6.length()
            java.lang.CharSequence r4 = r6.subSequence(r2, r4)
            java.lang.String r4 = r4.toString()
            r1.add(r4)
            r4 = r1
            java.util.List r4 = (java.util.List) r4
            return r4
        L5c:
            java.lang.String r1 = r6.toString()
            java.util.List r1 = kotlin.collections.CollectionsKt.listOf(r1)
            return r1
    }

    public final kotlin.sequences.Sequence<java.lang.String> splitToSequence(java.lang.CharSequence r3, int r4) {
            r2 = this;
            java.lang.String r0 = "input"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            kotlin.text.StringsKt.requireNonNegativeLimit(r4)
            kotlin.text.Regex$splitToSequence$1 r0 = new kotlin.text.Regex$splitToSequence$1
            r1 = 0
            r0.<init>(r2, r3, r4, r1)
            kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
            kotlin.sequences.Sequence r0 = kotlin.sequences.SequencesKt.sequence(r0)
            return r0
    }

    public final java.util.regex.Pattern toPattern() {
            r1 = this;
            java.util.regex.Pattern r0 = r1.nativePattern
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.util.regex.Pattern r0 = r2.nativePattern
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "toString(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }
}
