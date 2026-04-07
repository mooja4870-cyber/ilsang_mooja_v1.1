package kotlin.io.path;

/* JADX INFO: compiled from: PathReadWrite.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u0082\u0001\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0087\b\u001a%\u0010\u0005\u001a\u00020\u0002*\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\nH\u0087\b\u001a%\u0010\u0005\u001a\u00020\u0002*\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u000b2\b\b\u0002\u0010\t\u001a\u00020\nH\u0087\b\u001a\u001e\u0010\f\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nH\u0007\u001a:\u0010\u000e\u001a\u00020\u000f*\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\u0012\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00140\u0013\"\u00020\u0014H\u0087\b¢\u0006\u0002\u0010\u0015\u001a:\u0010\u0016\u001a\u00020\u0017*\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\u0012\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00140\u0013\"\u00020\u0014H\u0087\b¢\u0006\u0002\u0010\u0018\u001a=\u0010\u0019\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\n2!\u0010\u001a\u001a\u001d\u0012\u0013\u0012\u00110\u001c¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020\u00010\u001bH\u0087\bø\u0001\u0000\u001a&\u0010 \u001a\u00020!*\u00020\u00022\u0012\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00140\u0013\"\u00020\u0014H\u0087\b¢\u0006\u0002\u0010\"\u001a&\u0010#\u001a\u00020$*\u00020\u00022\u0012\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00140\u0013\"\u00020\u0014H\u0087\b¢\u0006\u0002\u0010%\u001a\r\u0010&\u001a\u00020\u0004*\u00020\u0002H\u0087\b\u001a\u001d\u0010'\u001a\b\u0012\u0004\u0012\u00020\u001c0(*\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\nH\u0087\b\u001a\u0016\u0010)\u001a\u00020\u001c*\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\nH\u0007\u001a0\u0010*\u001a\u00020+*\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\n2\u0012\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00140\u0013\"\u00020\u0014H\u0087\b¢\u0006\u0002\u0010,\u001aL\u0010-\u001a\u0002H.\"\u0004\b\u0000\u0010.*\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\n2\u0018\u0010/\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u000b\u0012\u0004\u0012\u0002H.0\u001bH\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0002\u00100\u001a.\u00101\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0012\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00140\u0013\"\u00020\u0014H\u0087\b¢\u0006\u0002\u00102\u001a>\u00103\u001a\u00020\u0002*\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\u0012\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00140\u0013\"\u00020\u0014H\u0087\b¢\u0006\u0002\u00104\u001a>\u00103\u001a\u00020\u0002*\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u000b2\b\b\u0002\u0010\t\u001a\u00020\n2\u0012\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00140\u0013\"\u00020\u0014H\u0087\b¢\u0006\u0002\u00105\u001a7\u00106\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\u0012\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00140\u0013\"\u00020\u0014H\u0007¢\u0006\u0002\u00107\u001a0\u00108\u001a\u000209*\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\n2\u0012\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00140\u0013\"\u00020\u0014H\u0087\b¢\u0006\u0002\u0010:\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006;"}, d2 = {"appendBytes", "", "Ljava/nio/file/Path;", "array", "", "appendLines", "lines", "", "", "charset", "Ljava/nio/charset/Charset;", "Lkotlin/sequences/Sequence;", "appendText", "text", "bufferedReader", "Ljava/io/BufferedReader;", "bufferSize", "", "options", "", "Ljava/nio/file/OpenOption;", "(Ljava/nio/file/Path;Ljava/nio/charset/Charset;I[Ljava/nio/file/OpenOption;)Ljava/io/BufferedReader;", "bufferedWriter", "Ljava/io/BufferedWriter;", "(Ljava/nio/file/Path;Ljava/nio/charset/Charset;I[Ljava/nio/file/OpenOption;)Ljava/io/BufferedWriter;", "forEachLine", "action", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "line", "inputStream", "Ljava/io/InputStream;", "(Ljava/nio/file/Path;[Ljava/nio/file/OpenOption;)Ljava/io/InputStream;", "outputStream", "Ljava/io/OutputStream;", "(Ljava/nio/file/Path;[Ljava/nio/file/OpenOption;)Ljava/io/OutputStream;", "readBytes", "readLines", "", "readText", "reader", "Ljava/io/InputStreamReader;", "(Ljava/nio/file/Path;Ljava/nio/charset/Charset;[Ljava/nio/file/OpenOption;)Ljava/io/InputStreamReader;", "useLines", "T", "block", "(Ljava/nio/file/Path;Ljava/nio/charset/Charset;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "writeBytes", "(Ljava/nio/file/Path;[B[Ljava/nio/file/OpenOption;)V", "writeLines", "(Ljava/nio/file/Path;Ljava/lang/Iterable;Ljava/nio/charset/Charset;[Ljava/nio/file/OpenOption;)Ljava/nio/file/Path;", "(Ljava/nio/file/Path;Lkotlin/sequences/Sequence;Ljava/nio/charset/Charset;[Ljava/nio/file/OpenOption;)Ljava/nio/file/Path;", "writeText", "(Ljava/nio/file/Path;Ljava/lang/CharSequence;Ljava/nio/charset/Charset;[Ljava/nio/file/OpenOption;)V", "writer", "Ljava/io/OutputStreamWriter;", "(Ljava/nio/file/Path;Ljava/nio/charset/Charset;[Ljava/nio/file/OpenOption;)Ljava/io/OutputStreamWriter;", "kotlin-stdlib-jdk7"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/io/path/PathsKt")
class PathsKt__PathReadWriteKt {
    public PathsKt__PathReadWriteKt() {
            r0 = this;
            r0.<init>()
            return
    }

    private static final void appendBytes(java.nio.file.Path r3, byte[] r4) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "array"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = 1
            java.nio.file.OpenOption[] r0 = new java.nio.file.OpenOption[r0]
            r1 = 0
            java.nio.file.StandardOpenOption r2 = java.nio.file.StandardOpenOption.APPEND
            r0[r1] = r2
            java.nio.file.Files.write(r3, r4, r0)
            return
    }

    private static final java.nio.file.Path appendLines(java.nio.file.Path r3, java.lang.Iterable<? extends java.lang.CharSequence> r4, java.nio.charset.Charset r5) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "lines"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "charset"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = 1
            java.nio.file.OpenOption[] r0 = new java.nio.file.OpenOption[r0]
            r1 = 0
            java.nio.file.StandardOpenOption r2 = java.nio.file.StandardOpenOption.APPEND
            r0[r1] = r2
            java.nio.file.Path r0 = java.nio.file.Files.write(r3, r4, r5, r0)
            java.lang.String r1 = "write(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    private static final java.nio.file.Path appendLines(java.nio.file.Path r4, kotlin.sequences.Sequence<? extends java.lang.CharSequence> r5, java.nio.charset.Charset r6) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "lines"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "charset"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.Iterable r0 = kotlin.sequences.SequencesKt.asIterable(r5)
            r1 = 1
            java.nio.file.OpenOption[] r1 = new java.nio.file.OpenOption[r1]
            r2 = 0
            java.nio.file.StandardOpenOption r3 = java.nio.file.StandardOpenOption.APPEND
            r1[r2] = r3
            java.nio.file.Path r0 = java.nio.file.Files.write(r4, r0, r6, r1)
            java.lang.String r1 = "write(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    static /* synthetic */ java.nio.file.Path appendLines$default(java.nio.file.Path r1, java.lang.Iterable r2, java.nio.charset.Charset r3, int r4, java.lang.Object r5) throws java.io.IOException {
            r4 = r4 & 2
            if (r4 == 0) goto L6
            java.nio.charset.Charset r3 = kotlin.text.Charsets.UTF_8
        L6:
            java.lang.String r4 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r4)
            java.lang.String r4 = "lines"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r4)
            java.lang.String r4 = "charset"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r4)
            r4 = 1
            java.nio.file.OpenOption[] r4 = new java.nio.file.OpenOption[r4]
            r5 = 0
            java.nio.file.StandardOpenOption r0 = java.nio.file.StandardOpenOption.APPEND
            r4[r5] = r0
            java.nio.file.Path r4 = java.nio.file.Files.write(r1, r2, r3, r4)
            java.lang.String r5 = "write(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r5)
            return r4
    }

    static /* synthetic */ java.nio.file.Path appendLines$default(java.nio.file.Path r2, kotlin.sequences.Sequence r3, java.nio.charset.Charset r4, int r5, java.lang.Object r6) throws java.io.IOException {
            r5 = r5 & 2
            if (r5 == 0) goto L6
            java.nio.charset.Charset r4 = kotlin.text.Charsets.UTF_8
        L6:
            java.lang.String r5 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r5)
            java.lang.String r5 = "lines"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r5)
            java.lang.String r5 = "charset"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r5)
            java.lang.Iterable r5 = kotlin.sequences.SequencesKt.asIterable(r3)
            r6 = 1
            java.nio.file.OpenOption[] r6 = new java.nio.file.OpenOption[r6]
            r0 = 0
            java.nio.file.StandardOpenOption r1 = java.nio.file.StandardOpenOption.APPEND
            r6[r0] = r1
            java.nio.file.Path r5 = java.nio.file.Files.write(r2, r5, r4, r6)
            java.lang.String r6 = "write(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r6)
            return r5
    }

    public static final void appendText(java.nio.file.Path r3, java.lang.CharSequence r4, java.nio.charset.Charset r5) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "text"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "charset"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = 1
            java.nio.file.OpenOption[] r0 = new java.nio.file.OpenOption[r0]
            r1 = 0
            java.nio.file.StandardOpenOption r2 = java.nio.file.StandardOpenOption.APPEND
            r0[r1] = r2
            kotlin.io.path.PathsKt.writeText(r3, r4, r5, r0)
            return
    }

    public static /* synthetic */ void appendText$default(java.nio.file.Path r0, java.lang.CharSequence r1, java.nio.charset.Charset r2, int r3, java.lang.Object r4) throws java.io.IOException {
            r3 = r3 & 2
            if (r3 == 0) goto L6
            java.nio.charset.Charset r2 = kotlin.text.Charsets.UTF_8
        L6:
            kotlin.io.path.PathsKt.appendText(r0, r1, r2)
            return
    }

    private static final java.io.BufferedReader bufferedReader(java.nio.file.Path r3, java.nio.charset.Charset r4, int r5, java.nio.file.OpenOption... r6) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "charset"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "options"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.io.BufferedReader r0 = new java.io.BufferedReader
            java.io.InputStreamReader r1 = new java.io.InputStreamReader
            int r2 = r6.length
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r6, r2)
            java.nio.file.OpenOption[] r2 = (java.nio.file.OpenOption[]) r2
            java.io.InputStream r2 = java.nio.file.Files.newInputStream(r3, r2)
            r1.<init>(r2, r4)
            java.io.Reader r1 = (java.io.Reader) r1
            r0.<init>(r1, r5)
            return r0
    }

    static /* synthetic */ java.io.BufferedReader bufferedReader$default(java.nio.file.Path r1, java.nio.charset.Charset r2, int r3, java.nio.file.OpenOption[] r4, int r5, java.lang.Object r6) throws java.io.IOException {
            r6 = r5 & 1
            if (r6 == 0) goto L6
            java.nio.charset.Charset r2 = kotlin.text.Charsets.UTF_8
        L6:
            r5 = r5 & 2
            if (r5 == 0) goto Lc
            r3 = 8192(0x2000, float:1.148E-41)
        Lc:
            java.lang.String r5 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r5)
            java.lang.String r5 = "charset"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r5)
            java.lang.String r5 = "options"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r5)
            java.io.BufferedReader r5 = new java.io.BufferedReader
            java.io.InputStreamReader r6 = new java.io.InputStreamReader
            int r0 = r4.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r4, r0)
            java.nio.file.OpenOption[] r0 = (java.nio.file.OpenOption[]) r0
            java.io.InputStream r0 = java.nio.file.Files.newInputStream(r1, r0)
            r6.<init>(r0, r2)
            java.io.Reader r6 = (java.io.Reader) r6
            r5.<init>(r6, r3)
            return r5
    }

    private static final java.io.BufferedWriter bufferedWriter(java.nio.file.Path r3, java.nio.charset.Charset r4, int r5, java.nio.file.OpenOption... r6) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "charset"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "options"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.io.BufferedWriter r0 = new java.io.BufferedWriter
            java.io.OutputStreamWriter r1 = new java.io.OutputStreamWriter
            int r2 = r6.length
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r6, r2)
            java.nio.file.OpenOption[] r2 = (java.nio.file.OpenOption[]) r2
            java.io.OutputStream r2 = java.nio.file.Files.newOutputStream(r3, r2)
            r1.<init>(r2, r4)
            java.io.Writer r1 = (java.io.Writer) r1
            r0.<init>(r1, r5)
            return r0
    }

    static /* synthetic */ java.io.BufferedWriter bufferedWriter$default(java.nio.file.Path r1, java.nio.charset.Charset r2, int r3, java.nio.file.OpenOption[] r4, int r5, java.lang.Object r6) throws java.io.IOException {
            r6 = r5 & 1
            if (r6 == 0) goto L6
            java.nio.charset.Charset r2 = kotlin.text.Charsets.UTF_8
        L6:
            r5 = r5 & 2
            if (r5 == 0) goto Lc
            r3 = 8192(0x2000, float:1.148E-41)
        Lc:
            java.lang.String r5 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r5)
            java.lang.String r5 = "charset"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r5)
            java.lang.String r5 = "options"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r5)
            java.io.BufferedWriter r5 = new java.io.BufferedWriter
            java.io.OutputStreamWriter r6 = new java.io.OutputStreamWriter
            int r0 = r4.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r4, r0)
            java.nio.file.OpenOption[] r0 = (java.nio.file.OpenOption[]) r0
            java.io.OutputStream r0 = java.nio.file.Files.newOutputStream(r1, r0)
            r6.<init>(r0, r2)
            java.io.Writer r6 = (java.io.Writer) r6
            r5.<init>(r6, r3)
            return r5
    }

    private static final void forEachLine(java.nio.file.Path r13, java.nio.charset.Charset r14, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r15) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            java.lang.String r0 = "charset"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            java.lang.String r0 = "action"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
            java.io.BufferedReader r0 = java.nio.file.Files.newBufferedReader(r13, r14)
            java.lang.String r1 = "newBufferedReader(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.io.Reader r0 = (java.io.Reader) r0
            r1 = 0
            r2 = r0
            java.io.BufferedReader r2 = (java.io.BufferedReader) r2
            java.io.Closeable r2 = (java.io.Closeable) r2
            r3 = 0
            r4 = 1
            r5 = r2
            java.io.BufferedReader r5 = (java.io.BufferedReader) r5     // Catch: java.lang.Throwable -> L53
            r6 = 0
            kotlin.sequences.Sequence r7 = kotlin.io.TextStreamsKt.lineSequence(r5)     // Catch: java.lang.Throwable -> L53
            r8 = 0
            r9 = r7
            r10 = 0
            java.util.Iterator r11 = r9.iterator()     // Catch: java.lang.Throwable -> L53
        L32:
            boolean r12 = r11.hasNext()     // Catch: java.lang.Throwable -> L53
            if (r12 == 0) goto L40
            java.lang.Object r12 = r11.next()     // Catch: java.lang.Throwable -> L53
            r15.invoke(r12)     // Catch: java.lang.Throwable -> L53
            goto L32
        L40:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L53
            boolean r3 = kotlin.internal.PlatformImplementationsKt.apiVersionIsAtLeast(r4, r4, r3)
            if (r3 == 0) goto L4f
            r3 = 0
            kotlin.io.CloseableKt.closeFinally(r2, r3)
            goto L52
        L4f:
            r2.close()
        L52:
            return
        L53:
            r5 = move-exception
            throw r5     // Catch: java.lang.Throwable -> L55
        L55:
            r6 = move-exception
            boolean r3 = kotlin.internal.PlatformImplementationsKt.apiVersionIsAtLeast(r4, r4, r3)
            if (r3 != 0) goto L62
            r2.close()     // Catch: java.lang.Throwable -> L60
            goto L65
        L60:
            r2 = move-exception
            goto L65
        L62:
            kotlin.io.CloseableKt.closeFinally(r2, r5)
        L65:
            throw r6
    }

    static /* synthetic */ void forEachLine$default(java.nio.file.Path r11, java.nio.charset.Charset r12, kotlin.jvm.functions.Function1 r13, int r14, java.lang.Object r15) throws java.io.IOException {
            r15 = 1
            r14 = r14 & r15
            if (r14 == 0) goto L6
            java.nio.charset.Charset r12 = kotlin.text.Charsets.UTF_8
        L6:
            java.lang.String r14 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r14)
            java.lang.String r14 = "charset"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r14)
            java.lang.String r14 = "action"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r14)
            java.io.BufferedReader r14 = java.nio.file.Files.newBufferedReader(r11, r12)
            java.lang.String r0 = "newBufferedReader(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r14, r0)
            java.io.Reader r14 = (java.io.Reader) r14
            r0 = 0
            r1 = r14
            java.io.BufferedReader r1 = (java.io.BufferedReader) r1
            java.io.Closeable r1 = (java.io.Closeable) r1
            r2 = 0
            r3 = r1
            java.io.BufferedReader r3 = (java.io.BufferedReader) r3     // Catch: java.lang.Throwable -> L58
            r4 = 0
            kotlin.sequences.Sequence r5 = kotlin.io.TextStreamsKt.lineSequence(r3)     // Catch: java.lang.Throwable -> L58
            r6 = 0
            r7 = r5
            r8 = 0
            java.util.Iterator r9 = r7.iterator()     // Catch: java.lang.Throwable -> L58
        L37:
            boolean r10 = r9.hasNext()     // Catch: java.lang.Throwable -> L58
            if (r10 == 0) goto L45
            java.lang.Object r10 = r9.next()     // Catch: java.lang.Throwable -> L58
            r13.invoke(r10)     // Catch: java.lang.Throwable -> L58
            goto L37
        L45:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L58
            boolean r15 = kotlin.internal.PlatformImplementationsKt.apiVersionIsAtLeast(r15, r15, r2)
            if (r15 == 0) goto L54
            r15 = 0
            kotlin.io.CloseableKt.closeFinally(r1, r15)
            goto L57
        L54:
            r1.close()
        L57:
            return
        L58:
            r3 = move-exception
            throw r3     // Catch: java.lang.Throwable -> L5a
        L5a:
            r4 = move-exception
            boolean r15 = kotlin.internal.PlatformImplementationsKt.apiVersionIsAtLeast(r15, r15, r2)
            if (r15 != 0) goto L67
            r1.close()     // Catch: java.lang.Throwable -> L65
            goto L6a
        L65:
            r15 = move-exception
            goto L6a
        L67:
            kotlin.io.CloseableKt.closeFinally(r1, r3)
        L6a:
            throw r4
    }

    private static final java.io.InputStream inputStream(java.nio.file.Path r2, java.nio.file.OpenOption... r3) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "options"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            int r0 = r3.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r3, r0)
            java.nio.file.OpenOption[] r0 = (java.nio.file.OpenOption[]) r0
            java.io.InputStream r0 = java.nio.file.Files.newInputStream(r2, r0)
            java.lang.String r1 = "newInputStream(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    private static final java.io.OutputStream outputStream(java.nio.file.Path r2, java.nio.file.OpenOption... r3) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "options"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            int r0 = r3.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r3, r0)
            java.nio.file.OpenOption[] r0 = (java.nio.file.OpenOption[]) r0
            java.io.OutputStream r0 = java.nio.file.Files.newOutputStream(r2, r0)
            java.lang.String r1 = "newOutputStream(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    private static final byte[] readBytes(java.nio.file.Path r2) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            byte[] r0 = java.nio.file.Files.readAllBytes(r2)
            java.lang.String r1 = "readAllBytes(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    private static final java.util.List<java.lang.String> readLines(java.nio.file.Path r2, java.nio.charset.Charset r3) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "charset"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.util.List r0 = java.nio.file.Files.readAllLines(r2, r3)
            java.lang.String r1 = "readAllLines(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    static /* synthetic */ java.util.List readLines$default(java.nio.file.Path r0, java.nio.charset.Charset r1, int r2, java.lang.Object r3) throws java.io.IOException {
            r2 = r2 & 1
            if (r2 == 0) goto L6
            java.nio.charset.Charset r1 = kotlin.text.Charsets.UTF_8
        L6:
            java.lang.String r2 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r2)
            java.lang.String r2 = "charset"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            java.util.List r2 = java.nio.file.Files.readAllLines(r0, r1)
            java.lang.String r3 = "readAllLines(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            return r2
    }

    public static final java.lang.String readText(java.nio.file.Path r4, java.nio.charset.Charset r5) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "charset"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = 0
            java.nio.file.OpenOption[] r1 = new java.nio.file.OpenOption[r0]
            java.io.InputStreamReader r2 = new java.io.InputStreamReader
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r1, r0)
            java.nio.file.OpenOption[] r0 = (java.nio.file.OpenOption[]) r0
            java.io.InputStream r0 = java.nio.file.Files.newInputStream(r4, r0)
            r2.<init>(r0, r5)
            java.io.Closeable r2 = (java.io.Closeable) r2
            r0 = r2
            java.io.InputStreamReader r0 = (java.io.InputStreamReader) r0     // Catch: java.lang.Throwable -> L2e
            r1 = 0
            r3 = r0
            java.io.Reader r3 = (java.io.Reader) r3     // Catch: java.lang.Throwable -> L2e
            java.lang.String r3 = kotlin.io.TextStreamsKt.readText(r3)     // Catch: java.lang.Throwable -> L2e
            r0 = 0
            kotlin.io.CloseableKt.closeFinally(r2, r0)
            return r3
        L2e:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L30
        L30:
            r1 = move-exception
            kotlin.io.CloseableKt.closeFinally(r2, r0)
            throw r1
    }

    public static /* synthetic */ java.lang.String readText$default(java.nio.file.Path r0, java.nio.charset.Charset r1, int r2, java.lang.Object r3) throws java.io.IOException {
            r2 = r2 & 1
            if (r2 == 0) goto L6
            java.nio.charset.Charset r1 = kotlin.text.Charsets.UTF_8
        L6:
            java.lang.String r0 = kotlin.io.path.PathsKt.readText(r0, r1)
            return r0
    }

    private static final java.io.InputStreamReader reader(java.nio.file.Path r2, java.nio.charset.Charset r3, java.nio.file.OpenOption... r4) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "charset"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "options"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.io.InputStreamReader r0 = new java.io.InputStreamReader
            int r1 = r4.length
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r4, r1)
            java.nio.file.OpenOption[] r1 = (java.nio.file.OpenOption[]) r1
            java.io.InputStream r1 = java.nio.file.Files.newInputStream(r2, r1)
            r0.<init>(r1, r3)
            return r0
    }

    static /* synthetic */ java.io.InputStreamReader reader$default(java.nio.file.Path r0, java.nio.charset.Charset r1, java.nio.file.OpenOption[] r2, int r3, java.lang.Object r4) throws java.io.IOException {
            r3 = r3 & 1
            if (r3 == 0) goto L6
            java.nio.charset.Charset r1 = kotlin.text.Charsets.UTF_8
        L6:
            java.lang.String r3 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r3)
            java.lang.String r3 = "charset"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r3)
            java.lang.String r3 = "options"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r3)
            java.io.InputStreamReader r3 = new java.io.InputStreamReader
            int r4 = r2.length
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r2, r4)
            java.nio.file.OpenOption[] r4 = (java.nio.file.OpenOption[]) r4
            java.io.InputStream r4 = java.nio.file.Files.newInputStream(r0, r4)
            r3.<init>(r4, r1)
            return r3
    }

    private static final <T> T useLines(java.nio.file.Path r6, java.nio.charset.Charset r7, kotlin.jvm.functions.Function1<? super kotlin.sequences.Sequence<java.lang.String>, ? extends T> r8) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "charset"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "block"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.io.BufferedReader r0 = java.nio.file.Files.newBufferedReader(r6, r7)
            java.io.Closeable r0 = (java.io.Closeable) r0
            r1 = 0
            r2 = 1
            r3 = r0
            java.io.BufferedReader r3 = (java.io.BufferedReader) r3     // Catch: java.lang.Throwable -> L38
            r4 = 0
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3)     // Catch: java.lang.Throwable -> L38
            kotlin.sequences.Sequence r5 = kotlin.io.TextStreamsKt.lineSequence(r3)     // Catch: java.lang.Throwable -> L38
            java.lang.Object r5 = r8.invoke(r5)     // Catch: java.lang.Throwable -> L38
            boolean r1 = kotlin.internal.PlatformImplementationsKt.apiVersionIsAtLeast(r2, r2, r1)
            if (r1 == 0) goto L32
            r1 = 0
            kotlin.io.CloseableKt.closeFinally(r0, r1)
            goto L37
        L32:
            if (r0 == 0) goto L37
            r0.close()
        L37:
            return r5
        L38:
            r3 = move-exception
            throw r3     // Catch: java.lang.Throwable -> L3a
        L3a:
            r4 = move-exception
            boolean r1 = kotlin.internal.PlatformImplementationsKt.apiVersionIsAtLeast(r2, r2, r1)
            if (r1 != 0) goto L49
            if (r0 == 0) goto L4c
            r0.close()     // Catch: java.lang.Throwable -> L47
            goto L4c
        L47:
            r0 = move-exception
            goto L4c
        L49:
            kotlin.io.CloseableKt.closeFinally(r0, r3)
        L4c:
            throw r4
    }

    static /* synthetic */ java.lang.Object useLines$default(java.nio.file.Path r4, java.nio.charset.Charset r5, kotlin.jvm.functions.Function1 r6, int r7, java.lang.Object r8) throws java.io.IOException {
            r8 = 1
            r7 = r7 & r8
            if (r7 == 0) goto L6
            java.nio.charset.Charset r5 = kotlin.text.Charsets.UTF_8
        L6:
            java.lang.String r7 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r7)
            java.lang.String r7 = "charset"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r7)
            java.lang.String r7 = "block"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r7)
            java.io.BufferedReader r7 = java.nio.file.Files.newBufferedReader(r4, r5)
            java.io.Closeable r7 = (java.io.Closeable) r7
            r0 = 0
            r1 = r7
            java.io.BufferedReader r1 = (java.io.BufferedReader) r1     // Catch: java.lang.Throwable -> L3d
            r2 = 0
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)     // Catch: java.lang.Throwable -> L3d
            kotlin.sequences.Sequence r3 = kotlin.io.TextStreamsKt.lineSequence(r1)     // Catch: java.lang.Throwable -> L3d
            java.lang.Object r3 = r6.invoke(r3)     // Catch: java.lang.Throwable -> L3d
            boolean r8 = kotlin.internal.PlatformImplementationsKt.apiVersionIsAtLeast(r8, r8, r0)
            if (r8 == 0) goto L37
            r8 = 0
            kotlin.io.CloseableKt.closeFinally(r7, r8)
            goto L3c
        L37:
            if (r7 == 0) goto L3c
            r7.close()
        L3c:
            return r3
        L3d:
            r1 = move-exception
            throw r1     // Catch: java.lang.Throwable -> L3f
        L3f:
            r2 = move-exception
            boolean r8 = kotlin.internal.PlatformImplementationsKt.apiVersionIsAtLeast(r8, r8, r0)
            if (r8 != 0) goto L4e
            if (r7 == 0) goto L51
            r7.close()     // Catch: java.lang.Throwable -> L4c
            goto L51
        L4c:
            r7 = move-exception
            goto L51
        L4e:
            kotlin.io.CloseableKt.closeFinally(r7, r1)
        L51:
            throw r2
    }

    private static final void writeBytes(java.nio.file.Path r1, byte[] r2, java.nio.file.OpenOption... r3) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "array"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "options"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            int r0 = r3.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r3, r0)
            java.nio.file.OpenOption[] r0 = (java.nio.file.OpenOption[]) r0
            java.nio.file.Files.write(r1, r2, r0)
            return
    }

    private static final java.nio.file.Path writeLines(java.nio.file.Path r2, java.lang.Iterable<? extends java.lang.CharSequence> r3, java.nio.charset.Charset r4, java.nio.file.OpenOption... r5) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "lines"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "charset"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "options"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            int r0 = r5.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r5, r0)
            java.nio.file.OpenOption[] r0 = (java.nio.file.OpenOption[]) r0
            java.nio.file.Path r0 = java.nio.file.Files.write(r2, r3, r4, r0)
            java.lang.String r1 = "write(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    private static final java.nio.file.Path writeLines(java.nio.file.Path r2, kotlin.sequences.Sequence<? extends java.lang.CharSequence> r3, java.nio.charset.Charset r4, java.nio.file.OpenOption... r5) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "lines"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "charset"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "options"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.Iterable r0 = kotlin.sequences.SequencesKt.asIterable(r3)
            int r1 = r5.length
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r5, r1)
            java.nio.file.OpenOption[] r1 = (java.nio.file.OpenOption[]) r1
            java.nio.file.Path r0 = java.nio.file.Files.write(r2, r0, r4, r1)
            java.lang.String r1 = "write(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    static /* synthetic */ java.nio.file.Path writeLines$default(java.nio.file.Path r0, java.lang.Iterable r1, java.nio.charset.Charset r2, java.nio.file.OpenOption[] r3, int r4, java.lang.Object r5) throws java.io.IOException {
            r4 = r4 & 2
            if (r4 == 0) goto L6
            java.nio.charset.Charset r2 = kotlin.text.Charsets.UTF_8
        L6:
            java.lang.String r4 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r4)
            java.lang.String r4 = "lines"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r4)
            java.lang.String r4 = "charset"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r4)
            java.lang.String r4 = "options"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r4)
            int r4 = r3.length
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r3, r4)
            java.nio.file.OpenOption[] r4 = (java.nio.file.OpenOption[]) r4
            java.nio.file.Path r4 = java.nio.file.Files.write(r0, r1, r2, r4)
            java.lang.String r5 = "write(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r5)
            return r4
    }

    static /* synthetic */ java.nio.file.Path writeLines$default(java.nio.file.Path r0, kotlin.sequences.Sequence r1, java.nio.charset.Charset r2, java.nio.file.OpenOption[] r3, int r4, java.lang.Object r5) throws java.io.IOException {
            r4 = r4 & 2
            if (r4 == 0) goto L6
            java.nio.charset.Charset r2 = kotlin.text.Charsets.UTF_8
        L6:
            java.lang.String r4 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r4)
            java.lang.String r4 = "lines"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r4)
            java.lang.String r4 = "charset"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r4)
            java.lang.String r4 = "options"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r4)
            java.lang.Iterable r4 = kotlin.sequences.SequencesKt.asIterable(r1)
            int r5 = r3.length
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r3, r5)
            java.nio.file.OpenOption[] r5 = (java.nio.file.OpenOption[]) r5
            java.nio.file.Path r4 = java.nio.file.Files.write(r0, r4, r2, r5)
            java.lang.String r5 = "write(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r5)
            return r4
    }

    public static final void writeText(java.nio.file.Path r10, java.lang.CharSequence r11, java.nio.charset.Charset r12, java.nio.file.OpenOption... r13) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.lang.String r0 = "text"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.lang.String r0 = "charset"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            java.lang.String r0 = "options"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            int r0 = r13.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r13, r0)
            java.nio.file.OpenOption[] r0 = (java.nio.file.OpenOption[]) r0
            java.io.OutputStream r0 = java.nio.file.Files.newOutputStream(r10, r0)
            java.io.Closeable r0 = (java.io.Closeable) r0
            r1 = r0
            java.io.OutputStream r1 = (java.io.OutputStream) r1     // Catch: java.lang.Throwable -> L8e
            r2 = 0
            boolean r3 = r11 instanceof java.lang.String     // Catch: java.lang.Throwable -> L8e
            if (r3 == 0) goto L33
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)     // Catch: java.lang.Throwable -> L8e
            r3 = r11
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L8e
            kotlin.io.FilesKt.writeTextImpl(r1, r3, r12)     // Catch: java.lang.Throwable -> L8e
            goto L87
        L33:
            java.nio.charset.CharsetEncoder r3 = kotlin.io.FilesKt.newReplaceEncoder(r12)     // Catch: java.lang.Throwable -> L8e
            boolean r4 = r11 instanceof java.nio.CharBuffer     // Catch: java.lang.Throwable -> L8e
            if (r4 == 0) goto L43
            r4 = r11
            java.nio.CharBuffer r4 = (java.nio.CharBuffer) r4     // Catch: java.lang.Throwable -> L8e
            java.nio.CharBuffer r4 = r4.asReadOnlyBuffer()     // Catch: java.lang.Throwable -> L8e
            goto L47
        L43:
            java.nio.CharBuffer r4 = java.nio.CharBuffer.wrap(r11)     // Catch: java.lang.Throwable -> L8e
        L47:
            int r5 = r11.length()     // Catch: java.lang.Throwable -> L8e
            r6 = 8192(0x2000, float:1.148E-41)
            int r5 = java.lang.Math.min(r5, r6)     // Catch: java.lang.Throwable -> L8e
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3)     // Catch: java.lang.Throwable -> L8e
            java.nio.ByteBuffer r5 = kotlin.io.FilesKt.byteBufferForEncoding(r5, r3)     // Catch: java.lang.Throwable -> L8e
        L58:
            boolean r6 = r4.hasRemaining()     // Catch: java.lang.Throwable -> L8e
            if (r6 == 0) goto L86
            r6 = 1
            java.nio.charset.CoderResult r6 = r3.encode(r4, r5, r6)     // Catch: java.lang.Throwable -> L8e
            r7 = 0
            boolean r8 = r6.isError()     // Catch: java.lang.Throwable -> L8e
            if (r8 != 0) goto L7a
            byte[] r6 = r5.array()     // Catch: java.lang.Throwable -> L8e
            int r7 = r5.position()     // Catch: java.lang.Throwable -> L8e
            r8 = 0
            r1.write(r6, r8, r7)     // Catch: java.lang.Throwable -> L8e
            r5.clear()     // Catch: java.lang.Throwable -> L8e
            goto L58
        L7a:
            java.lang.String r8 = "Check failed."
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L8e
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L8e
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L8e
            throw r9     // Catch: java.lang.Throwable -> L8e
        L86:
        L87:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L8e
            r1 = 0
            kotlin.io.CloseableKt.closeFinally(r0, r1)
            return
        L8e:
            r1 = move-exception
            throw r1     // Catch: java.lang.Throwable -> L90
        L90:
            r2 = move-exception
            kotlin.io.CloseableKt.closeFinally(r0, r1)
            throw r2
    }

    public static /* synthetic */ void writeText$default(java.nio.file.Path r0, java.lang.CharSequence r1, java.nio.charset.Charset r2, java.nio.file.OpenOption[] r3, int r4, java.lang.Object r5) throws java.io.IOException {
            r4 = r4 & 2
            if (r4 == 0) goto L6
            java.nio.charset.Charset r2 = kotlin.text.Charsets.UTF_8
        L6:
            kotlin.io.path.PathsKt.writeText(r0, r1, r2, r3)
            return
    }

    private static final java.io.OutputStreamWriter writer(java.nio.file.Path r2, java.nio.charset.Charset r3, java.nio.file.OpenOption... r4) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "charset"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "options"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.io.OutputStreamWriter r0 = new java.io.OutputStreamWriter
            int r1 = r4.length
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r4, r1)
            java.nio.file.OpenOption[] r1 = (java.nio.file.OpenOption[]) r1
            java.io.OutputStream r1 = java.nio.file.Files.newOutputStream(r2, r1)
            r0.<init>(r1, r3)
            return r0
    }

    static /* synthetic */ java.io.OutputStreamWriter writer$default(java.nio.file.Path r0, java.nio.charset.Charset r1, java.nio.file.OpenOption[] r2, int r3, java.lang.Object r4) throws java.io.IOException {
            r3 = r3 & 1
            if (r3 == 0) goto L6
            java.nio.charset.Charset r1 = kotlin.text.Charsets.UTF_8
        L6:
            java.lang.String r3 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r3)
            java.lang.String r3 = "charset"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r3)
            java.lang.String r3 = "options"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r3)
            java.io.OutputStreamWriter r3 = new java.io.OutputStreamWriter
            int r4 = r2.length
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r2, r4)
            java.nio.file.OpenOption[] r4 = (java.nio.file.OpenOption[]) r4
            java.io.OutputStream r4 = java.nio.file.Files.newOutputStream(r0, r4)
            r3.<init>(r4, r1)
            return r3
    }
}
