package kotlin.io;

/* JADX INFO: compiled from: ReadWrite.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000X\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0017\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0087\b\u001a\u0017\u0010\u0000\u001a\u00020\u0005*\u00020\u00062\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0087\b\u001a\u001c\u0010\u0007\u001a\u00020\b*\u00020\u00022\u0006\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u001a\u001e\u0010\n\u001a\u00020\u000b*\u00020\u00022\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b0\r\u001a\u0010\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0010*\u00020\u0001\u001a\n\u0010\u0011\u001a\u00020\u0012*\u00020\u0013\u001a\u0010\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0015*\u00020\u0002\u001a\n\u0010\u0016\u001a\u00020\u000e*\u00020\u0002\u001a\u0017\u0010\u0016\u001a\u00020\u000e*\u00020\u00132\b\b\u0002\u0010\u0017\u001a\u00020\u0018H\u0087\b\u001a\r\u0010\u0019\u001a\u00020\u001a*\u00020\u000eH\u0087\b\u001aB\u0010\u001b\u001a\u0002H\u001c\"\u0004\b\u0000\u0010\u001c*\u00020\u00022\u0018\u0010\u001d\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u0010\u0012\u0004\u0012\u0002H\u001c0\rH\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0002\u0010\u001e\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001f"}, d2 = {"buffered", "Ljava/io/BufferedReader;", "Ljava/io/Reader;", "bufferSize", "", "Ljava/io/BufferedWriter;", "Ljava/io/Writer;", "copyTo", "", "out", "forEachLine", "", "action", "Lkotlin/Function1;", "", "lineSequence", "Lkotlin/sequences/Sequence;", "readBytes", "", "Ljava/net/URL;", "readLines", "", "readText", "charset", "Ljava/nio/charset/Charset;", "reader", "Ljava/io/StringReader;", "useLines", "T", "block", "(Ljava/io/Reader;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class TextStreamsKt {


    private static final java.io.BufferedReader buffered(java.io.Reader r1, int r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            boolean r0 = r1 instanceof java.io.BufferedReader
            if (r0 == 0) goto Ld
            r0 = r1
            java.io.BufferedReader r0 = (java.io.BufferedReader) r0
            goto L12
        Ld:
            java.io.BufferedReader r0 = new java.io.BufferedReader
            r0.<init>(r1, r2)
        L12:
            return r0
    }

    private static final java.io.BufferedWriter buffered(java.io.Writer r1, int r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            boolean r0 = r1 instanceof java.io.BufferedWriter
            if (r0 == 0) goto Ld
            r0 = r1
            java.io.BufferedWriter r0 = (java.io.BufferedWriter) r0
            goto L12
        Ld:
            java.io.BufferedWriter r0 = new java.io.BufferedWriter
            r0.<init>(r1, r2)
        L12:
            return r0
    }

    static /* synthetic */ java.io.BufferedReader buffered$default(java.io.Reader r0, int r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L6
            r1 = 8192(0x2000, float:1.148E-41)
        L6:
            java.lang.String r2 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r2)
            boolean r2 = r0 instanceof java.io.BufferedReader
            if (r2 == 0) goto L13
            r2 = r0
            java.io.BufferedReader r2 = (java.io.BufferedReader) r2
            goto L18
        L13:
            java.io.BufferedReader r2 = new java.io.BufferedReader
            r2.<init>(r0, r1)
        L18:
            return r2
    }

    static /* synthetic */ java.io.BufferedWriter buffered$default(java.io.Writer r0, int r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L6
            r1 = 8192(0x2000, float:1.148E-41)
        L6:
            java.lang.String r2 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r2)
            boolean r2 = r0 instanceof java.io.BufferedWriter
            if (r2 == 0) goto L13
            r2 = r0
            java.io.BufferedWriter r2 = (java.io.BufferedWriter) r2
            goto L18
        L13:
            java.io.BufferedWriter r2 = new java.io.BufferedWriter
            r2.<init>(r0, r1)
        L18:
            return r2
    }

    public static final long copyTo(java.io.Reader r6, java.io.Writer r7, int r8) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "out"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            r0 = 0
            char[] r2 = new char[r8]
            int r3 = r6.read(r2)
        L12:
            if (r3 < 0) goto L1f
            r4 = 0
            r7.write(r2, r4, r3)
            long r4 = (long) r3
            long r0 = r0 + r4
            int r3 = r6.read(r2)
            goto L12
        L1f:
            return r0
    }

    public static /* synthetic */ long copyTo$default(java.io.Reader r0, java.io.Writer r1, int r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L6
            r2 = 8192(0x2000, float:1.148E-41)
        L6:
            long r0 = copyTo(r0, r1, r2)
            return r0
    }

    public static final void forEachLine(java.io.Reader r11, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r12) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.lang.String r0 = "action"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            r0 = r11
            r1 = 0
            boolean r2 = r0 instanceof java.io.BufferedReader
            if (r2 == 0) goto L15
            r2 = r0
            java.io.BufferedReader r2 = (java.io.BufferedReader) r2
            goto L1c
        L15:
            java.io.BufferedReader r2 = new java.io.BufferedReader
            r3 = 8192(0x2000, float:1.148E-41)
            r2.<init>(r0, r3)
        L1c:
            java.io.Closeable r2 = (java.io.Closeable) r2
            r3 = r2
            java.io.BufferedReader r3 = (java.io.BufferedReader) r3     // Catch: java.lang.Throwable -> L45
            r4 = 0
            kotlin.sequences.Sequence r5 = lineSequence(r3)     // Catch: java.lang.Throwable -> L45
            r6 = 0
            r7 = r5
            r8 = 0
            java.util.Iterator r9 = r7.iterator()     // Catch: java.lang.Throwable -> L45
        L2d:
            boolean r10 = r9.hasNext()     // Catch: java.lang.Throwable -> L45
            if (r10 == 0) goto L3b
            java.lang.Object r10 = r9.next()     // Catch: java.lang.Throwable -> L45
            r12.invoke(r10)     // Catch: java.lang.Throwable -> L45
            goto L2d
        L3b:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L45
            r3 = 0
            kotlin.io.CloseableKt.closeFinally(r2, r3)
            return
        L45:
            r3 = move-exception
            throw r3     // Catch: java.lang.Throwable -> L47
        L47:
            r4 = move-exception
            kotlin.io.CloseableKt.closeFinally(r2, r3)
            throw r4
    }

    public static final kotlin.sequences.Sequence<java.lang.String> lineSequence(java.io.BufferedReader r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            kotlin.io.LinesSequence r0 = new kotlin.io.LinesSequence
            r0.<init>(r1)
            kotlin.sequences.Sequence r0 = (kotlin.sequences.Sequence) r0
            kotlin.sequences.Sequence r0 = kotlin.sequences.SequencesKt.constrainOnce(r0)
            return r0
    }

    public static final byte[] readBytes(java.net.URL r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.io.InputStream r0 = r4.openStream()
            java.io.Closeable r0 = (java.io.Closeable) r0
            r1 = r0
            java.io.InputStream r1 = (java.io.InputStream) r1     // Catch: java.lang.Throwable -> L1b
            r2 = 0
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)     // Catch: java.lang.Throwable -> L1b
            byte[] r3 = kotlin.io.ByteStreamsKt.readBytes(r1)     // Catch: java.lang.Throwable -> L1b
            r1 = 0
            kotlin.io.CloseableKt.closeFinally(r0, r1)
            return r3
        L1b:
            r1 = move-exception
            throw r1     // Catch: java.lang.Throwable -> L1d
        L1d:
            r2 = move-exception
            kotlin.io.CloseableKt.closeFinally(r0, r1)
            throw r2
    }

    public static final java.util.List<java.lang.String> readLines(java.io.Reader r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            kotlin.io.TextStreamsKt$readLines$1 r1 = new kotlin.io.TextStreamsKt$readLines$1
            r1.<init>(r0)
            kotlin.jvm.functions.Function1 r1 = (kotlin.jvm.functions.Function1) r1
            forEachLine(r2, r1)
            r1 = r0
            java.util.List r1 = (java.util.List) r1
            return r1
    }

    public static final java.lang.String readText(java.io.Reader r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.io.StringWriter r0 = new java.io.StringWriter
            r0.<init>()
            r1 = r0
            java.io.Writer r1 = (java.io.Writer) r1
            r2 = 2
            r3 = 0
            r4 = 0
            copyTo$default(r5, r1, r4, r2, r3)
            java.lang.String r1 = r0.toString()
            java.lang.String r2 = "toString(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            return r1
    }

    private static final java.lang.String readText(java.net.URL r2, java.nio.charset.Charset r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "charset"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            byte[] r0 = readBytes(r2)
            java.lang.String r1 = new java.lang.String
            r1.<init>(r0, r3)
            return r1
    }

    static /* synthetic */ java.lang.String readText$default(java.net.URL r0, java.nio.charset.Charset r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L6
            java.nio.charset.Charset r1 = kotlin.text.Charsets.UTF_8
        L6:
            java.lang.String r2 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r2)
            java.lang.String r2 = "charset"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            byte[] r2 = readBytes(r0)
            java.lang.String r3 = new java.lang.String
            r3.<init>(r2, r1)
            return r3
    }

    private static final java.io.StringReader reader(java.lang.String r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.io.StringReader r0 = new java.io.StringReader
            r0.<init>(r1)
            return r0
    }

    public static final <T> T useLines(java.io.Reader r7, kotlin.jvm.functions.Function1<? super kotlin.sequences.Sequence<java.lang.String>, ? extends T> r8) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "block"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r0 = 0
            boolean r1 = r7 instanceof java.io.BufferedReader
            if (r1 == 0) goto L14
            r1 = r7
            java.io.BufferedReader r1 = (java.io.BufferedReader) r1
            goto L1b
        L14:
            java.io.BufferedReader r1 = new java.io.BufferedReader
            r2 = 8192(0x2000, float:1.148E-41)
            r1.<init>(r7, r2)
        L1b:
            java.io.Closeable r1 = (java.io.Closeable) r1
            r2 = 0
            r3 = 1
            r4 = r1
            java.io.BufferedReader r4 = (java.io.BufferedReader) r4     // Catch: java.lang.Throwable -> L3a
            r5 = 0
            kotlin.sequences.Sequence r6 = lineSequence(r4)     // Catch: java.lang.Throwable -> L3a
            java.lang.Object r6 = r8.invoke(r6)     // Catch: java.lang.Throwable -> L3a
            boolean r2 = kotlin.internal.PlatformImplementationsKt.apiVersionIsAtLeast(r3, r3, r2)
            if (r2 == 0) goto L36
            r2 = 0
            kotlin.io.CloseableKt.closeFinally(r1, r2)
            goto L39
        L36:
            r1.close()
        L39:
            return r6
        L3a:
            r4 = move-exception
            throw r4     // Catch: java.lang.Throwable -> L3c
        L3c:
            r5 = move-exception
            boolean r2 = kotlin.internal.PlatformImplementationsKt.apiVersionIsAtLeast(r3, r3, r2)
            if (r2 != 0) goto L49
            r1.close()     // Catch: java.lang.Throwable -> L47
            goto L4c
        L47:
            r1 = move-exception
            goto L4c
        L49:
            kotlin.io.CloseableKt.closeFinally(r1, r4)
        L4c:
            throw r5
    }
}
