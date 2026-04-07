package kotlin.io;

/* JADX INFO: compiled from: Utils.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u001a*\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002H\u0007\u001a*\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002H\u0007\u001a8\u0010\u000e\u001a\u00020\u000f*\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u000f2\u001a\b\u0002\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013\u001a&\u0010\u0016\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u000f2\b\b\u0002\u0010\u0017\u001a\u00020\u0018\u001a\n\u0010\u0019\u001a\u00020\u000f*\u00020\u0002\u001a\u0012\u0010\u001a\u001a\u00020\u000f*\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0002\u001a\u0012\u0010\u001a\u001a\u00020\u000f*\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0001\u001a\n\u0010\u001c\u001a\u00020\u0002*\u00020\u0002\u001a\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u001d*\b\u0012\u0004\u0012\u00020\u00020\u001dH\u0002¢\u0006\u0002\b\u001e\u001a\u0011\u0010\u001c\u001a\u00020\u001f*\u00020\u001fH\u0002¢\u0006\u0002\b\u001e\u001a\u0012\u0010 \u001a\u00020\u0002*\u00020\u00022\u0006\u0010!\u001a\u00020\u0002\u001a\u0014\u0010\"\u001a\u0004\u0018\u00010\u0002*\u00020\u00022\u0006\u0010!\u001a\u00020\u0002\u001a\u0012\u0010#\u001a\u00020\u0002*\u00020\u00022\u0006\u0010!\u001a\u00020\u0002\u001a\u0012\u0010$\u001a\u00020\u0002*\u00020\u00022\u0006\u0010%\u001a\u00020\u0002\u001a\u0012\u0010$\u001a\u00020\u0002*\u00020\u00022\u0006\u0010%\u001a\u00020\u0001\u001a\u0012\u0010&\u001a\u00020\u0002*\u00020\u00022\u0006\u0010%\u001a\u00020\u0002\u001a\u0012\u0010&\u001a\u00020\u0002*\u00020\u00022\u0006\u0010%\u001a\u00020\u0001\u001a\u0012\u0010'\u001a\u00020\u000f*\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0002\u001a\u0012\u0010'\u001a\u00020\u000f*\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0001\u001a\u0012\u0010(\u001a\u00020\u0001*\u00020\u00022\u0006\u0010!\u001a\u00020\u0002\u001a\u001b\u0010)\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010!\u001a\u00020\u0002H\u0002¢\u0006\u0002\b*\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0015\u0010\u0005\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004\"\u0015\u0010\u0007\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\b\u0010\u0004¨\u0006+"}, d2 = {"extension", "", "Ljava/io/File;", "getExtension", "(Ljava/io/File;)Ljava/lang/String;", "invariantSeparatorsPath", "getInvariantSeparatorsPath", "nameWithoutExtension", "getNameWithoutExtension", "createTempDir", "prefix", "suffix", "directory", "createTempFile", "copyRecursively", "", "target", "overwrite", "onError", "Lkotlin/Function2;", "Ljava/io/IOException;", "Lkotlin/io/OnErrorAction;", "copyTo", "bufferSize", "", "deleteRecursively", "endsWith", "other", "normalize", "", "normalize$FilesKt__UtilsKt", "Lkotlin/io/FilePathComponents;", "relativeTo", "base", "relativeToOrNull", "relativeToOrSelf", "resolve", "relative", "resolveSibling", "startsWith", "toRelativeString", "toRelativeStringOrNull", "toRelativeStringOrNull$FilesKt__UtilsKt", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/io/FilesKt")
class FilesKt__UtilsKt extends kotlin.io.FilesKt__FileTreeWalkKt {



    public FilesKt__UtilsKt() {
            r0 = this;
            r0.<init>()
            return
    }

    public static final boolean copyRecursively(java.io.File r12, java.io.File r13, boolean r14, kotlin.jvm.functions.Function2<? super java.io.File, ? super java.io.IOException, ? extends kotlin.io.OnErrorAction> r15) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            java.lang.String r0 = "target"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            java.lang.String r0 = "onError"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
            boolean r0 = r12.exists()
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L2d
            kotlin.io.NoSuchFileException r3 = new kotlin.io.NoSuchFileException
            r7 = 2
            r8 = 0
            r5 = 0
            java.lang.String r6 = "The source file doesn't exist."
            r4 = r12
            r3.<init>(r4, r5, r6, r7, r8)
            java.lang.Object r12 = r15.invoke(r4, r3)
            kotlin.io.OnErrorAction r0 = kotlin.io.OnErrorAction.TERMINATE
            if (r12 == r0) goto L2b
            goto L2c
        L2b:
            r1 = r2
        L2c:
            return r1
        L2d:
            r4 = r12
            kotlin.io.FileTreeWalk r12 = kotlin.io.FilesKt.walkTopDown(r4)     // Catch: kotlin.io.TerminateException -> Lf7
            kotlin.io.FilesKt__UtilsKt$copyRecursively$2 r0 = new kotlin.io.FilesKt__UtilsKt$copyRecursively$2     // Catch: kotlin.io.TerminateException -> Lf7
            r0.<init>(r15)     // Catch: kotlin.io.TerminateException -> Lf7
            kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0     // Catch: kotlin.io.TerminateException -> Lf7
            kotlin.io.FileTreeWalk r12 = r12.onFail(r0)     // Catch: kotlin.io.TerminateException -> Lf7
            java.util.Iterator r12 = r12.iterator()     // Catch: kotlin.io.TerminateException -> Lf7
        L41:
            boolean r0 = r12.hasNext()     // Catch: kotlin.io.TerminateException -> Lf7
            if (r0 == 0) goto Lf6
            java.lang.Object r0 = r12.next()     // Catch: kotlin.io.TerminateException -> Lf7
            java.io.File r0 = (java.io.File) r0     // Catch: kotlin.io.TerminateException -> Lf7
            r5 = r0
            boolean r0 = r5.exists()     // Catch: kotlin.io.TerminateException -> Lf7
            if (r0 != 0) goto L6d
            r6 = r5
            kotlin.io.NoSuchFileException r5 = new kotlin.io.NoSuchFileException     // Catch: kotlin.io.TerminateException -> L68
            java.lang.String r8 = "The source file doesn't exist."
            r9 = 2
            r10 = 0
            r7 = 0
            r5.<init>(r6, r7, r8, r9, r10)     // Catch: kotlin.io.TerminateException -> L68
            java.lang.Object r0 = r15.invoke(r6, r5)     // Catch: kotlin.io.TerminateException -> L68
            kotlin.io.OnErrorAction r3 = kotlin.io.OnErrorAction.TERMINATE     // Catch: kotlin.io.TerminateException -> L68
            if (r0 != r3) goto L41
            return r2
        L68:
            r0 = move-exception
            r12 = r0
            r7 = r14
            goto Lfa
        L6d:
            r6 = r5
            java.lang.String r0 = kotlin.io.FilesKt.toRelativeString(r6, r4)     // Catch: kotlin.io.TerminateException -> Lf7
            java.io.File r3 = new java.io.File     // Catch: kotlin.io.TerminateException -> Lf7
            r3.<init>(r13, r0)     // Catch: kotlin.io.TerminateException -> Lf7
            boolean r5 = r3.exists()     // Catch: kotlin.io.TerminateException -> Lf7
            if (r5 == 0) goto Lbb
            boolean r5 = r6.isDirectory()     // Catch: kotlin.io.TerminateException -> L68
            if (r5 == 0) goto L89
            boolean r5 = r3.isDirectory()     // Catch: kotlin.io.TerminateException -> L68
            if (r5 != 0) goto Lbb
        L89:
            if (r14 != 0) goto L8d
            r5 = r1
            goto La6
        L8d:
            boolean r5 = r3.isDirectory()     // Catch: kotlin.io.TerminateException -> L68
            if (r5 == 0) goto L9d
            boolean r5 = kotlin.io.FilesKt.deleteRecursively(r3)     // Catch: kotlin.io.TerminateException -> L68
            if (r5 != 0) goto L9b
            r5 = r1
            goto La6
        L9b:
            r5 = r2
            goto La6
        L9d:
            boolean r5 = r3.delete()     // Catch: kotlin.io.TerminateException -> L68
            if (r5 != 0) goto La5
            r5 = r1
            goto La6
        La5:
            r5 = r2
        La6:
            if (r5 == 0) goto Lbb
            kotlin.io.FileAlreadyExistsException r7 = new kotlin.io.FileAlreadyExistsException     // Catch: kotlin.io.TerminateException -> L68
            java.lang.String r8 = "The destination file already exists."
            r7.<init>(r6, r3, r8)     // Catch: kotlin.io.TerminateException -> L68
            java.lang.Object r7 = r15.invoke(r3, r7)     // Catch: kotlin.io.TerminateException -> L68
            kotlin.io.OnErrorAction r8 = kotlin.io.OnErrorAction.TERMINATE     // Catch: kotlin.io.TerminateException -> L68
            if (r7 != r8) goto Lba
            return r2
        Lba:
            goto L41
        Lbb:
            boolean r5 = r6.isDirectory()     // Catch: kotlin.io.TerminateException -> Lf7
            if (r5 == 0) goto Lc6
            r3.mkdirs()     // Catch: kotlin.io.TerminateException -> L68
            goto L41
        Lc6:
            r9 = 4
            r10 = 0
            r8 = 0
            r7 = r14
            r5 = r6
            r6 = r3
            java.io.File r14 = kotlin.io.FilesKt.copyTo$default(r5, r6, r7, r8, r9, r10)     // Catch: kotlin.io.TerminateException -> Lf3
            r6 = r5
            long r8 = r14.length()     // Catch: kotlin.io.TerminateException -> Lf3
            long r10 = r6.length()     // Catch: kotlin.io.TerminateException -> Lf3
            int r14 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r14 == 0) goto Lf0
            java.io.IOException r14 = new java.io.IOException     // Catch: kotlin.io.TerminateException -> Lf3
            java.lang.String r5 = "Source file wasn't copied completely, length of destination file differs."
            r14.<init>(r5)     // Catch: kotlin.io.TerminateException -> Lf3
            java.lang.Object r14 = r15.invoke(r6, r14)     // Catch: kotlin.io.TerminateException -> Lf3
            kotlin.io.OnErrorAction r5 = kotlin.io.OnErrorAction.TERMINATE     // Catch: kotlin.io.TerminateException -> Lf3
            if (r14 != r5) goto Led
            return r2
        Led:
            r14 = r7
            goto L41
        Lf0:
            r14 = r7
            goto L41
        Lf3:
            r0 = move-exception
            r12 = r0
            goto Lfa
        Lf6:
            return r1
        Lf7:
            r0 = move-exception
            r7 = r14
            r12 = r0
        Lfa:
            return r2
    }

    public static /* synthetic */ boolean copyRecursively$default(java.io.File r0, java.io.File r1, boolean r2, kotlin.jvm.functions.Function2 r3, int r4, java.lang.Object r5) {
            r5 = r4 & 2
            if (r5 == 0) goto L5
            r2 = 0
        L5:
            r4 = r4 & 4
            if (r4 == 0) goto Ld
            kotlin.io.FilesKt__UtilsKt$copyRecursively$1 r3 = kotlin.io.FilesKt__UtilsKt.AnonymousClass1.INSTANCE
            kotlin.jvm.functions.Function2 r3 = (kotlin.jvm.functions.Function2) r3
        Ld:
            boolean r0 = kotlin.io.FilesKt.copyRecursively(r0, r1, r2, r3)
            return r0
    }

    public static final java.io.File copyTo(java.io.File r9, java.io.File r10, boolean r11, int r12) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r0 = "target"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            boolean r0 = r9.exists()
            if (r0 == 0) goto L88
            boolean r0 = r10.exists()
            if (r0 == 0) goto L2f
            if (r11 == 0) goto L27
            boolean r0 = r10.delete()
            if (r0 == 0) goto L1f
            goto L2f
        L1f:
            kotlin.io.FileAlreadyExistsException r0 = new kotlin.io.FileAlreadyExistsException
            java.lang.String r1 = "Tried to overwrite the destination, but failed to delete it."
            r0.<init>(r9, r10, r1)
            throw r0
        L27:
            kotlin.io.FileAlreadyExistsException r0 = new kotlin.io.FileAlreadyExistsException
            java.lang.String r1 = "The destination file already exists."
            r0.<init>(r9, r10, r1)
            throw r0
        L2f:
            boolean r0 = r9.isDirectory()
            if (r0 == 0) goto L44
            boolean r0 = r10.mkdirs()
            if (r0 == 0) goto L3c
            goto L77
        L3c:
            kotlin.io.FileSystemException r0 = new kotlin.io.FileSystemException
            java.lang.String r1 = "Failed to create target directory."
            r0.<init>(r9, r10, r1)
            throw r0
        L44:
            java.io.File r0 = r10.getParentFile()
            if (r0 == 0) goto L4d
            r0.mkdirs()
        L4d:
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r0.<init>(r9)
            r1 = r0
            java.io.Closeable r1 = (java.io.Closeable) r1
            r0 = r1
            java.io.FileInputStream r0 = (java.io.FileInputStream) r0     // Catch: java.lang.Throwable -> L80
            r2 = r0
            r3 = 0
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L80
            r0.<init>(r10)     // Catch: java.lang.Throwable -> L80
            r4 = r0
            java.io.Closeable r4 = (java.io.Closeable) r4     // Catch: java.lang.Throwable -> L80
            r0 = r4
            java.io.FileOutputStream r0 = (java.io.FileOutputStream) r0     // Catch: java.lang.Throwable -> L78
            r5 = 0
            r6 = r2
            java.io.InputStream r6 = (java.io.InputStream) r6     // Catch: java.lang.Throwable -> L78
            r7 = r0
            java.io.OutputStream r7 = (java.io.OutputStream) r7     // Catch: java.lang.Throwable -> L78
            kotlin.io.ByteStreamsKt.copyTo(r6, r7, r12)     // Catch: java.lang.Throwable -> L78
            r0 = 0
            kotlin.io.CloseableKt.closeFinally(r4, r0)     // Catch: java.lang.Throwable -> L80
            kotlin.io.CloseableKt.closeFinally(r1, r0)
        L77:
            return r10
        L78:
            r0 = move-exception
            r5 = r0
            throw r5     // Catch: java.lang.Throwable -> L7b
        L7b:
            r0 = move-exception
            kotlin.io.CloseableKt.closeFinally(r4, r5)     // Catch: java.lang.Throwable -> L80
            throw r0     // Catch: java.lang.Throwable -> L80
        L80:
            r0 = move-exception
            r2 = r0
            throw r2     // Catch: java.lang.Throwable -> L83
        L83:
            r0 = move-exception
            kotlin.io.CloseableKt.closeFinally(r1, r2)
            throw r0
        L88:
            kotlin.io.NoSuchFileException r3 = new kotlin.io.NoSuchFileException
            r7 = 2
            r8 = 0
            r5 = 0
            java.lang.String r6 = "The source file doesn't exist."
            r4 = r9
            r3.<init>(r4, r5, r6, r7, r8)
            throw r3
    }

    public static /* synthetic */ java.io.File copyTo$default(java.io.File r0, java.io.File r1, boolean r2, int r3, int r4, java.lang.Object r5) {
            r5 = r4 & 2
            if (r5 == 0) goto L5
            r2 = 0
        L5:
            r4 = r4 & 4
            if (r4 == 0) goto Lb
            r3 = 8192(0x2000, float:1.148E-41)
        Lb:
            java.io.File r0 = kotlin.io.FilesKt.copyTo(r0, r1, r2, r3)
            return r0
    }

    @kotlin.Deprecated(message = "Avoid creating temporary directories in the default temp location with this function due to too wide permissions on the newly created directory. Use kotlin.io.path.createTempDirectory instead.")
    public static final java.io.File createTempDir(java.lang.String r4, java.lang.String r5, java.io.File r6) {
            java.lang.String r0 = "prefix"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.io.File r0 = java.io.File.createTempFile(r4, r5, r6)
            r0.delete()
            boolean r1 = r0.mkdir()
            if (r1 == 0) goto L16
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            return r0
        L16:
            java.io.IOException r1 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Unable to create temporary directory "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r0)
            r3 = 46
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    public static /* synthetic */ java.io.File createTempDir$default(java.lang.String r1, java.lang.String r2, java.io.File r3, int r4, java.lang.Object r5) {
            r5 = r4 & 1
            if (r5 == 0) goto L6
            java.lang.String r1 = "tmp"
        L6:
            r5 = r4 & 2
            r0 = 0
            if (r5 == 0) goto Lc
            r2 = r0
        Lc:
            r4 = r4 & 4
            if (r4 == 0) goto L11
            r3 = r0
        L11:
            java.io.File r1 = kotlin.io.FilesKt.createTempDir(r1, r2, r3)
            return r1
    }

    @kotlin.Deprecated(message = "Avoid creating temporary files in the default temp location with this function due to too wide permissions on the newly created file. Use kotlin.io.path.createTempFile instead or resort to java.io.File.createTempFile.")
    public static final java.io.File createTempFile(java.lang.String r2, java.lang.String r3, java.io.File r4) {
            java.lang.String r0 = "prefix"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.io.File r0 = java.io.File.createTempFile(r2, r3, r4)
            java.lang.String r1 = "createTempFile(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    public static /* synthetic */ java.io.File createTempFile$default(java.lang.String r1, java.lang.String r2, java.io.File r3, int r4, java.lang.Object r5) {
            r5 = r4 & 1
            if (r5 == 0) goto L6
            java.lang.String r1 = "tmp"
        L6:
            r5 = r4 & 2
            r0 = 0
            if (r5 == 0) goto Lc
            r2 = r0
        Lc:
            r4 = r4 & 4
            if (r4 == 0) goto L11
            r3 = r0
        L11:
            java.io.File r1 = kotlin.io.FilesKt.createTempFile(r1, r2, r3)
            return r1
    }

    public static final boolean deleteRecursively(java.io.File r10) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            kotlin.io.FileTreeWalk r0 = kotlin.io.FilesKt.walkBottomUp(r10)
            kotlin.sequences.Sequence r0 = (kotlin.sequences.Sequence) r0
            r1 = 1
            r2 = 0
            r3 = r1
            java.util.Iterator r4 = r0.iterator()
        L12:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L34
            java.lang.Object r5 = r4.next()
            r6 = r5
            java.io.File r6 = (java.io.File) r6
            r7 = r3
            r8 = 0
            boolean r9 = r6.delete()
            if (r9 != 0) goto L2d
            boolean r9 = r6.exists()
            if (r9 != 0) goto L31
        L2d:
            if (r7 == 0) goto L31
            r9 = 1
            goto L32
        L31:
            r9 = 0
        L32:
            r3 = r9
            goto L12
        L34:
            return r3
    }

    public static final boolean endsWith(java.io.File r5, java.io.File r6) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "other"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            kotlin.io.FilePathComponents r0 = kotlin.io.FilesKt.toComponents(r5)
            kotlin.io.FilePathComponents r1 = kotlin.io.FilesKt.toComponents(r6)
            boolean r2 = r1.isRooted()
            if (r2 == 0) goto L1d
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r5, r6)
            return r2
        L1d:
            int r2 = r0.getSize()
            int r3 = r1.getSize()
            int r2 = r2 - r3
            if (r2 >= 0) goto L2a
            r3 = 0
            goto L3e
        L2a:
            java.util.List r3 = r0.getSegments()
            int r4 = r0.getSize()
            java.util.List r3 = r3.subList(r2, r4)
            java.util.List r4 = r1.getSegments()
            boolean r3 = r3.equals(r4)
        L3e:
            return r3
    }

    public static final boolean endsWith(java.io.File r1, java.lang.String r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "other"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.io.File r0 = new java.io.File
            r0.<init>(r2)
            boolean r0 = kotlin.io.FilesKt.endsWith(r1, r0)
            return r0
    }

    public static final java.lang.String getExtension(java.io.File r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = r3.getName()
            java.lang.String r1 = "getName(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r1 = 46
            java.lang.String r2 = ""
            java.lang.String r0 = kotlin.text.StringsKt.substringAfterLast(r0, r1, r2)
            return r0
    }

    public static final java.lang.String getInvariantSeparatorsPath(java.io.File r9) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            char r0 = java.io.File.separatorChar
            r1 = 47
            java.lang.String r2 = "getPath(...)"
            if (r0 == r1) goto L20
            java.lang.String r3 = r9.getPath()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r2)
            char r4 = java.io.File.separatorChar
            r7 = 4
            r8 = 0
            r5 = 47
            r6 = 0
            java.lang.String r0 = kotlin.text.StringsKt.replace$default(r3, r4, r5, r6, r7, r8)
            goto L27
        L20:
            java.lang.String r0 = r9.getPath()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)
        L27:
            return r0
    }

    public static final java.lang.String getNameWithoutExtension(java.io.File r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = r4.getName()
            java.lang.String r1 = "getName(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r1 = 0
            r2 = 2
            java.lang.String r3 = "."
            java.lang.String r0 = kotlin.text.StringsKt.substringBeforeLast$default(r0, r3, r1, r2, r1)
            return r0
    }

    public static final java.io.File normalize(java.io.File r13) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            kotlin.io.FilePathComponents r0 = kotlin.io.FilesKt.toComponents(r13)
            r1 = 0
            java.io.File r2 = r0.getRoot()
            java.util.List r3 = r0.getSegments()
            java.util.List r3 = normalize$FilesKt__UtilsKt(r3)
            r4 = r3
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.lang.String r3 = java.io.File.separator
            java.lang.String r5 = "separator"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r5)
            r5 = r3
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            r11 = 62
            r12 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            java.lang.String r3 = kotlin.collections.CollectionsKt.joinToString$default(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            java.io.File r0 = kotlin.io.FilesKt.resolve(r2, r3)
            return r0
    }

    private static final java.util.List<java.io.File> normalize$FilesKt__UtilsKt(java.util.List<? extends java.io.File> r5) {
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r5.size()
            r0.<init>(r1)
            java.util.List r0 = (java.util.List) r0
            java.util.Iterator r1 = r5.iterator()
        Lf:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L57
            java.lang.Object r2 = r1.next()
            java.io.File r2 = (java.io.File) r2
            java.lang.String r3 = r2.getName()
            java.lang.String r4 = "."
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r4)
            if (r4 != 0) goto Lf
            java.lang.String r4 = ".."
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r4)
            if (r3 == 0) goto L53
            boolean r3 = r0.isEmpty()
            if (r3 != 0) goto L4f
            java.lang.Object r3 = kotlin.collections.CollectionsKt.last(r0)
            java.io.File r3 = (java.io.File) r3
            java.lang.String r3 = r3.getName()
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r4)
            if (r3 != 0) goto L4f
            int r3 = r0.size()
            int r3 = r3 + (-1)
            r0.remove(r3)
            goto Lf
        L4f:
            r0.add(r2)
            goto Lf
        L53:
            r0.add(r2)
            goto Lf
        L57:
            return r0
    }

    private static final kotlin.io.FilePathComponents normalize$FilesKt__UtilsKt(kotlin.io.FilePathComponents r3) {
            kotlin.io.FilePathComponents r0 = new kotlin.io.FilePathComponents
            java.io.File r1 = r3.getRoot()
            java.util.List r2 = r3.getSegments()
            java.util.List r2 = normalize$FilesKt__UtilsKt(r2)
            r0.<init>(r1, r2)
            return r0
    }

    public static final java.io.File relativeTo(java.io.File r2, java.io.File r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "base"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.io.File r0 = new java.io.File
            java.lang.String r1 = kotlin.io.FilesKt.toRelativeString(r2, r3)
            r0.<init>(r1)
            return r0
    }

    public static final java.io.File relativeToOrNull(java.io.File r3, java.io.File r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "base"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = toRelativeStringOrNull$FilesKt__UtilsKt(r3, r4)
            if (r0 == 0) goto L17
            r1 = 0
            java.io.File r2 = new java.io.File
            r2.<init>(r0)
            goto L18
        L17:
            r2 = 0
        L18:
            return r2
    }

    public static final java.io.File relativeToOrSelf(java.io.File r3, java.io.File r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "base"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = toRelativeStringOrNull$FilesKt__UtilsKt(r3, r4)
            if (r0 == 0) goto L17
            r1 = 0
            java.io.File r2 = new java.io.File
            r2.<init>(r0)
            goto L18
        L17:
            r2 = r3
        L18:
            return r2
    }

    public static final java.io.File resolve(java.io.File r6, java.io.File r7) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "relative"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            boolean r0 = kotlin.io.FilesKt.isRooted(r7)
            if (r0 == 0) goto L11
            return r7
        L11:
            java.lang.String r0 = r6.toString()
            java.lang.String r1 = "toString(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r1 = r0
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            int r1 = r1.length()
            r2 = 0
            if (r1 != 0) goto L26
            r1 = 1
            goto L27
        L26:
            r1 = r2
        L27:
            if (r1 != 0) goto L54
            r1 = r0
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            char r3 = java.io.File.separatorChar
            r4 = 2
            r5 = 0
            boolean r1 = kotlin.text.StringsKt.endsWith$default(r1, r3, r2, r4, r5)
            if (r1 == 0) goto L37
            goto L54
        L37:
            java.io.File r1 = new java.io.File
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.StringBuilder r2 = r2.append(r0)
            char r3 = java.io.File.separatorChar
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r7)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            goto L6a
        L54:
            java.io.File r1 = new java.io.File
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.StringBuilder r2 = r2.append(r0)
            java.lang.StringBuilder r2 = r2.append(r7)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
        L6a:
            return r1
    }

    public static final java.io.File resolve(java.io.File r1, java.lang.String r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "relative"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.io.File r0 = new java.io.File
            r0.<init>(r2)
            java.io.File r0 = kotlin.io.FilesKt.resolve(r1, r0)
            return r0
    }

    public static final java.io.File resolveSibling(java.io.File r3, java.io.File r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "relative"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            kotlin.io.FilePathComponents r0 = kotlin.io.FilesKt.toComponents(r3)
            int r1 = r0.getSize()
            if (r1 != 0) goto L1c
            java.io.File r1 = new java.io.File
            java.lang.String r2 = ".."
            r1.<init>(r2)
            goto L27
        L1c:
            int r1 = r0.getSize()
            int r1 = r1 + (-1)
            r2 = 0
            java.io.File r1 = r0.subPath(r2, r1)
        L27:
            java.io.File r2 = r0.getRoot()
            java.io.File r2 = kotlin.io.FilesKt.resolve(r2, r1)
            java.io.File r2 = kotlin.io.FilesKt.resolve(r2, r4)
            return r2
    }

    public static final java.io.File resolveSibling(java.io.File r1, java.lang.String r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "relative"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.io.File r0 = new java.io.File
            r0.<init>(r2)
            java.io.File r0 = kotlin.io.FilesKt.resolveSibling(r1, r0)
            return r0
    }

    public static final boolean startsWith(java.io.File r5, java.io.File r6) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "other"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            kotlin.io.FilePathComponents r0 = kotlin.io.FilesKt.toComponents(r5)
            kotlin.io.FilePathComponents r1 = kotlin.io.FilesKt.toComponents(r6)
            java.io.File r2 = r0.getRoot()
            java.io.File r3 = r1.getRoot()
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r3)
            r3 = 0
            if (r2 != 0) goto L22
            return r3
        L22:
            int r2 = r0.getSize()
            int r4 = r1.getSize()
            if (r2 >= r4) goto L2d
            goto L41
        L2d:
            java.util.List r2 = r0.getSegments()
            int r4 = r1.getSize()
            java.util.List r2 = r2.subList(r3, r4)
            java.util.List r3 = r1.getSegments()
            boolean r3 = r2.equals(r3)
        L41:
            return r3
    }

    public static final boolean startsWith(java.io.File r1, java.lang.String r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "other"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.io.File r0 = new java.io.File
            r0.<init>(r2)
            boolean r0 = kotlin.io.FilesKt.startsWith(r1, r0)
            return r0
    }

    public static final java.lang.String toRelativeString(java.io.File r3, java.io.File r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "base"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = toRelativeStringOrNull$FilesKt__UtilsKt(r3, r4)
            if (r0 == 0) goto L11
            return r0
        L11:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "this and base files have different roots: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r2 = " and "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r4)
            r2 = 46
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    private static final java.lang.String toRelativeStringOrNull$FilesKt__UtilsKt(java.io.File r18, java.io.File r19) {
            kotlin.io.FilePathComponents r0 = kotlin.io.FilesKt.toComponents(r18)
            kotlin.io.FilePathComponents r0 = normalize$FilesKt__UtilsKt(r0)
            kotlin.io.FilePathComponents r1 = kotlin.io.FilesKt.toComponents(r19)
            kotlin.io.FilePathComponents r1 = normalize$FilesKt__UtilsKt(r1)
            java.io.File r2 = r0.getRoot()
            java.io.File r3 = r1.getRoot()
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r3)
            r3 = 0
            if (r2 != 0) goto L20
            return r3
        L20:
            int r2 = r1.getSize()
            int r4 = r0.getSize()
            r5 = r18
            r6 = 0
            r7 = 0
            int r8 = java.lang.Math.min(r4, r2)
        L30:
            if (r7 >= r8) goto L4b
            java.util.List r9 = r0.getSegments()
            java.lang.Object r9 = r9.get(r7)
            java.util.List r10 = r1.getSegments()
            java.lang.Object r10 = r10.get(r7)
            boolean r9 = kotlin.jvm.internal.Intrinsics.areEqual(r9, r10)
            if (r9 == 0) goto L4b
            int r7 = r7 + 1
            goto L30
        L4b:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            int r6 = r2 + (-1)
            if (r7 > r6) goto L7c
        L56:
            java.util.List r8 = r1.getSegments()
            java.lang.Object r8 = r8.get(r6)
            java.io.File r8 = (java.io.File) r8
            java.lang.String r8 = r8.getName()
            java.lang.String r9 = ".."
            boolean r8 = kotlin.jvm.internal.Intrinsics.areEqual(r8, r9)
            if (r8 == 0) goto L6d
            return r3
        L6d:
            r5.append(r9)
            if (r6 == r7) goto L77
            char r8 = java.io.File.separatorChar
            r5.append(r8)
        L77:
            if (r6 == r7) goto L7c
            int r6 = r6 + (-1)
            goto L56
        L7c:
            if (r7 >= r4) goto Lab
            if (r7 >= r2) goto L85
            char r3 = java.io.File.separatorChar
            r5.append(r3)
        L85:
            java.util.List r3 = r0.getSegments()
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.List r3 = kotlin.collections.CollectionsKt.drop(r3, r7)
            r8 = r3
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            r9 = r5
            java.lang.Appendable r9 = (java.lang.Appendable) r9
            java.lang.String r3 = java.io.File.separator
            java.lang.String r6 = "separator"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r6)
            r10 = r3
            java.lang.CharSequence r10 = (java.lang.CharSequence) r10
            r16 = 124(0x7c, float:1.74E-43)
            r17 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            kotlin.collections.CollectionsKt.joinTo$default(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
        Lab:
            java.lang.String r3 = r5.toString()
            return r3
    }
}
