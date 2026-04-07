package kotlin.io.path;

/* JADX INFO: compiled from: PathRecursiveFunctions.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000v\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a$\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0082\b¢\u0006\u0002\b\u0006\u001a\u001d\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002¢\u0006\u0002\b\n\u001a'\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002¢\u0006\u0002\b\u000e\u001a&\u0010\u000f\u001a\u0004\u0018\u0001H\u0010\"\u0004\b\u0000\u0010\u00102\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00100\u0005H\u0082\b¢\u0006\u0004\b\u0011\u0010\u0012\u001a\f\u0010\u0013\u001a\u00020\u0001*\u00020\tH\u0000\u001a\u0019\u0010\u0014\u001a\u00020\u0001*\u00020\t2\u0006\u0010\r\u001a\u00020\tH\u0002¢\u0006\u0002\b\u0015\u001aw\u0010\u0016\u001a\u00020\t*\u00020\t2\u0006\u0010\u0017\u001a\u00020\t2Q\b\u0002\u0010\u0018\u001aK\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u0017\u0012\u0017\u0012\u00150\u001dj\u0002`\u001e¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020 0\u00192\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"H\u0007\u001a´\u0001\u0010\u0016\u001a\u00020\t*\u00020\t2\u0006\u0010\u0017\u001a\u00020\t2Q\b\u0002\u0010\u0018\u001aK\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u0017\u0012\u0017\u0012\u00150\u001dj\u0002`\u001e¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020 0\u00192\u0006\u0010!\u001a\u00020\"2C\b\u0002\u0010$\u001a=\u0012\u0004\u0012\u00020%\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020&0\u0019¢\u0006\u0002\b'H\u0007\u001a\f\u0010(\u001a\u00020\u0001*\u00020\tH\u0007\u001a\u001b\u0010)\u001a\f\u0012\b\u0012\u00060\u001dj\u0002`\u001e0**\u00020\tH\u0002¢\u0006\u0002\b+\u001a'\u0010,\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\t0-2\u0006\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002¢\u0006\u0002\b.\u001a1\u0010/\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\t0-2\u0006\u0010\u001b\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002¢\u0006\u0002\b0\u001a5\u00101\u001a\u00020\"*\b\u0012\u0004\u0012\u00020\t0-2\u0006\u00102\u001a\u00020\t2\u0012\u00103\u001a\n\u0012\u0006\b\u0001\u0012\u00020504\"\u000205H\u0002¢\u0006\u0004\b6\u00107\u001a\u0011\u00108\u001a\u000209*\u00020&H\u0003¢\u0006\u0002\b:\u001a\u0011\u00108\u001a\u000209*\u00020 H\u0003¢\u0006\u0002\b:¨\u0006;"}, d2 = {"collectIfThrows", "", "collector", "Lkotlin/io/path/ExceptionsCollector;", "function", "Lkotlin/Function0;", "collectIfThrows$PathsKt__PathRecursiveFunctionsKt", "insecureEnterDirectory", "path", "Ljava/nio/file/Path;", "insecureEnterDirectory$PathsKt__PathRecursiveFunctionsKt", "insecureHandleEntry", "entry", "parent", "insecureHandleEntry$PathsKt__PathRecursiveFunctionsKt", "tryIgnoreNoSuchFileException", "R", "tryIgnoreNoSuchFileException$PathsKt__PathRecursiveFunctionsKt", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "checkFileName", "checkNotSameAs", "checkNotSameAs$PathsKt__PathRecursiveFunctionsKt", "copyToRecursively", "target", "onError", "Lkotlin/Function3;", "Lkotlin/ParameterName;", "name", "source", "Ljava/lang/Exception;", "Lkotlin/Exception;", "exception", "Lkotlin/io/path/OnErrorResult;", "followLinks", "", "overwrite", "copyAction", "Lkotlin/io/path/CopyActionContext;", "Lkotlin/io/path/CopyActionResult;", "Lkotlin/ExtensionFunctionType;", "deleteRecursively", "deleteRecursivelyImpl", "", "deleteRecursivelyImpl$PathsKt__PathRecursiveFunctionsKt", "enterDirectory", "Ljava/nio/file/SecureDirectoryStream;", "enterDirectory$PathsKt__PathRecursiveFunctionsKt", "handleEntry", "handleEntry$PathsKt__PathRecursiveFunctionsKt", "isDirectory", "entryName", "options", "", "Ljava/nio/file/LinkOption;", "isDirectory$PathsKt__PathRecursiveFunctionsKt", "(Ljava/nio/file/SecureDirectoryStream;Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Z", "toFileVisitResult", "Ljava/nio/file/FileVisitResult;", "toFileVisitResult$PathsKt__PathRecursiveFunctionsKt", "kotlin-stdlib-jdk7"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/io/path/PathsKt")
class PathsKt__PathRecursiveFunctionsKt extends kotlin.io.path.PathsKt__PathReadWriteKt {

    /* JADX INFO: compiled from: PathRecursiveFunctions.kt */
    @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1 = null;

        static {
                kotlin.io.path.CopyActionResult[] r0 = kotlin.io.path.CopyActionResult.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r1 = 1
                kotlin.io.path.CopyActionResult r2 = kotlin.io.path.CopyActionResult.CONTINUE     // Catch: java.lang.NoSuchFieldError -> L11
                int r2 = r2.ordinal()     // Catch: java.lang.NoSuchFieldError -> L11
                r0[r2] = r1     // Catch: java.lang.NoSuchFieldError -> L11
                goto L12
            L11:
                r2 = move-exception
            L12:
                r2 = 2
                kotlin.io.path.CopyActionResult r3 = kotlin.io.path.CopyActionResult.TERMINATE     // Catch: java.lang.NoSuchFieldError -> L1c
                int r3 = r3.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1c
                r0[r3] = r2     // Catch: java.lang.NoSuchFieldError -> L1c
                goto L1d
            L1c:
                r3 = move-exception
            L1d:
                kotlin.io.path.CopyActionResult r3 = kotlin.io.path.CopyActionResult.SKIP_SUBTREE     // Catch: java.lang.NoSuchFieldError -> L27
                int r3 = r3.ordinal()     // Catch: java.lang.NoSuchFieldError -> L27
                r4 = 3
                r0[r3] = r4     // Catch: java.lang.NoSuchFieldError -> L27
                goto L28
            L27:
                r3 = move-exception
            L28:
                kotlin.io.path.PathsKt__PathRecursiveFunctionsKt.WhenMappings.$EnumSwitchMapping$0 = r0
                kotlin.io.path.OnErrorResult[] r0 = kotlin.io.path.OnErrorResult.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                kotlin.io.path.OnErrorResult r3 = kotlin.io.path.OnErrorResult.TERMINATE     // Catch: java.lang.NoSuchFieldError -> L3a
                int r3 = r3.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3a
                r0[r3] = r1     // Catch: java.lang.NoSuchFieldError -> L3a
                goto L3b
            L3a:
                r1 = move-exception
            L3b:
                kotlin.io.path.OnErrorResult r1 = kotlin.io.path.OnErrorResult.SKIP_SUBTREE     // Catch: java.lang.NoSuchFieldError -> L44
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L44
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L44
                goto L45
            L44:
                r1 = move-exception
            L45:
                kotlin.io.path.PathsKt__PathRecursiveFunctionsKt.WhenMappings.$EnumSwitchMapping$1 = r0
                return
        }
    }






    public PathsKt__PathRecursiveFunctionsKt() {
            r0 = this;
            r0.<init>()
            return
    }

    public static final /* synthetic */ java.nio.file.FileVisitResult access$copyToRecursively$copy(java.util.ArrayList r1, kotlin.jvm.functions.Function3 r2, java.nio.file.Path r3, java.nio.file.Path r4, java.nio.file.Path r5, kotlin.jvm.functions.Function3 r6, java.nio.file.Path r7, java.nio.file.attribute.BasicFileAttributes r8) {
            java.nio.file.FileVisitResult r0 = copyToRecursively$copy$PathsKt__PathRecursiveFunctionsKt(r1, r2, r3, r4, r5, r6, r7, r8)
            return r0
    }

    public static final /* synthetic */ java.nio.file.FileVisitResult access$copyToRecursively$error(kotlin.jvm.functions.Function3 r1, java.nio.file.Path r2, java.nio.file.Path r3, java.nio.file.Path r4, java.nio.file.Path r5, java.lang.Exception r6) {
            java.nio.file.FileVisitResult r0 = copyToRecursively$error$PathsKt__PathRecursiveFunctionsKt(r1, r2, r3, r4, r5, r6)
            return r0
    }

    public static final void checkFileName(java.nio.file.Path r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = kotlin.io.path.PathsKt.getName(r2)
            int r1 = r0.hashCode()
            switch(r1) {
                case 46: goto L3e;
                case 1472: goto L35;
                case 1473: goto L2c;
                case 1518: goto L23;
                case 45679: goto L1a;
                case 45724: goto L11;
                default: goto L10;
            }
        L10:
            goto L4d
        L11:
            java.lang.String r1 = "..\\"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L47
            goto L10
        L1a:
            java.lang.String r1 = "../"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L47
            goto L10
        L23:
            java.lang.String r1 = ".\\"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L47
            goto L10
        L2c:
            java.lang.String r1 = "./"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L47
            goto L10
        L35:
            java.lang.String r1 = ".."
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L47
            goto L10
        L3e:
            java.lang.String r1 = "."
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L47
            goto L10
        L47:
            kotlin.io.path.IllegalFileNameException r1 = new kotlin.io.path.IllegalFileNameException
            r1.<init>(r2)
            throw r1
        L4d:
            return
    }

    private static final void checkNotSameAs$PathsKt__PathRecursiveFunctionsKt(java.nio.file.Path r2, java.nio.file.Path r3) {
            boolean r0 = java.nio.file.Files.isSymbolicLink(r2)
            if (r0 != 0) goto L17
            boolean r0 = java.nio.file.Files.isSameFile(r2, r3)
            if (r0 != 0) goto Ld
            goto L17
        Ld:
            java.nio.file.FileSystemLoopException r0 = new java.nio.file.FileSystemLoopException
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        L17:
            return
    }

    private static final void collectIfThrows$PathsKt__PathRecursiveFunctionsKt(kotlin.io.path.ExceptionsCollector r2, kotlin.jvm.functions.Function0<kotlin.Unit> r3) {
            r0 = 0
            r3.invoke()     // Catch: java.lang.Exception -> L6
            goto La
        L6:
            r1 = move-exception
            r2.collect(r1)
        La:
            return
    }

    public static final java.nio.file.Path copyToRecursively(java.nio.file.Path r11, java.nio.file.Path r12, kotlin.jvm.functions.Function3<? super java.nio.file.Path, ? super java.nio.file.Path, ? super java.lang.Exception, ? extends kotlin.io.path.OnErrorResult> r13, boolean r14, kotlin.jvm.functions.Function3<? super kotlin.io.path.CopyActionContext, ? super java.nio.file.Path, ? super java.nio.file.Path, ? extends kotlin.io.path.CopyActionResult> r15) {
            java.lang.String r1 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r1)
            java.lang.String r1 = "target"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r1)
            java.lang.String r1 = "onError"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r1)
            java.lang.String r1 = "copyAction"
            r2 = r15
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r1)
            kotlin.io.path.LinkFollowing r1 = kotlin.io.path.LinkFollowing.INSTANCE
            java.nio.file.LinkOption[] r1 = r1.toLinkOptions(r14)
            int r3 = r1.length
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r3)
            java.nio.file.LinkOption[] r1 = (java.nio.file.LinkOption[]) r1
            int r3 = r1.length
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r3)
            java.nio.file.LinkOption[] r1 = (java.nio.file.LinkOption[]) r1
            boolean r1 = java.nio.file.Files.exists(r11, r1)
            if (r1 == 0) goto Le5
            r1 = 0
            java.nio.file.LinkOption[] r3 = new java.nio.file.LinkOption[r1]
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r1)
            java.nio.file.LinkOption[] r3 = (java.nio.file.LinkOption[]) r3
            boolean r3 = java.nio.file.Files.exists(r11, r3)
            if (r3 == 0) goto Lc6
            if (r14 != 0) goto L46
            boolean r3 = java.nio.file.Files.isSymbolicLink(r11)
            if (r3 != 0) goto Lc6
        L46:
            java.nio.file.LinkOption[] r3 = new java.nio.file.LinkOption[r1]
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r1)
            java.nio.file.LinkOption[] r3 = (java.nio.file.LinkOption[]) r3
            boolean r3 = java.nio.file.Files.exists(r12, r3)
            r5 = 1
            if (r3 == 0) goto L5d
            boolean r3 = java.nio.file.Files.isSymbolicLink(r12)
            if (r3 != 0) goto L5d
            r3 = r5
            goto L5e
        L5d:
            r3 = r1
        L5e:
            if (r3 == 0) goto L66
            boolean r7 = java.nio.file.Files.isSameFile(r11, r12)
            if (r7 != 0) goto Lc6
        L66:
        L67:
            java.nio.file.FileSystem r7 = r11.getFileSystem()
            java.nio.file.FileSystem r8 = r12.getFileSystem()
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual(r7, r8)
            if (r7 != 0) goto L76
            goto Lb1
        L76:
            if (r3 == 0) goto L89
            java.nio.file.LinkOption[] r5 = new java.nio.file.LinkOption[r1]
            java.nio.file.Path r5 = r12.toRealPath(r5)
            java.nio.file.LinkOption[] r1 = new java.nio.file.LinkOption[r1]
            java.nio.file.Path r1 = r11.toRealPath(r1)
            boolean r1 = r5.startsWith(r1)
            goto Lb1
        L89:
            java.nio.file.Path r7 = r12.getParent()
            if (r7 == 0) goto Lb1
            r8 = 0
            java.nio.file.LinkOption[] r9 = new java.nio.file.LinkOption[r1]
            java.lang.Object[] r9 = java.util.Arrays.copyOf(r9, r1)
            java.nio.file.LinkOption[] r9 = (java.nio.file.LinkOption[]) r9
            boolean r9 = java.nio.file.Files.exists(r7, r9)
            if (r9 == 0) goto Lb1
            java.nio.file.LinkOption[] r9 = new java.nio.file.LinkOption[r1]
            java.nio.file.Path r9 = r7.toRealPath(r9)
            java.nio.file.LinkOption[] r10 = new java.nio.file.LinkOption[r1]
            java.nio.file.Path r10 = r11.toRealPath(r10)
            boolean r9 = r9.startsWith(r10)
            if (r9 == 0) goto Lb1
            r1 = r5
        Lb1:
            if (r1 != 0) goto Lb5
            goto Lc6
        Lb5:
            java.nio.file.FileSystemException r5 = new java.nio.file.FileSystemException
            java.lang.String r7 = r11.toString()
            java.lang.String r8 = r12.toString()
            java.lang.String r9 = "Recursively copying a directory into its subdirectory is prohibited."
            r5.<init>(r7, r8, r9)
            throw r5
        Lc6:
            java.nio.file.Path r5 = r12.normalize()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            kotlin.io.path.PathsKt__PathRecursiveFunctionsKt$copyToRecursively$5 r0 = new kotlin.io.path.PathsKt__PathRecursiveFunctionsKt$copyToRecursively$5
            r3 = r11
            r4 = r12
            r6 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7 = r1
            r6 = r5
            r3 = r0
            kotlin.jvm.functions.Function1 r3 = (kotlin.jvm.functions.Function1) r3
            r4 = 1
            r5 = 0
            r1 = 0
            r0 = r11
            r2 = r14
            kotlin.io.path.PathsKt.visitFileTree$default(r0, r1, r2, r3, r4, r5)
            return r12
        Le5:
            java.nio.file.NoSuchFileException r0 = new java.nio.file.NoSuchFileException
            java.lang.String r1 = r11.toString()
            java.lang.String r2 = r12.toString()
            java.lang.String r3 = "The source file doesn't exist."
            r0.<init>(r1, r2, r3)
            throw r0
    }

    public static final java.nio.file.Path copyToRecursively(java.nio.file.Path r8, java.nio.file.Path r9, kotlin.jvm.functions.Function3<? super java.nio.file.Path, ? super java.nio.file.Path, ? super java.lang.Exception, ? extends kotlin.io.path.OnErrorResult> r10, boolean r11, boolean r12) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "target"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r0 = "onError"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            if (r12 == 0) goto L21
            kotlin.io.path.PathsKt__PathRecursiveFunctionsKt$copyToRecursively$2 r0 = new kotlin.io.path.PathsKt__PathRecursiveFunctionsKt$copyToRecursively$2
            r0.<init>(r11)
            kotlin.jvm.functions.Function3 r0 = (kotlin.jvm.functions.Function3) r0
            java.nio.file.Path r0 = kotlin.io.path.PathsKt.copyToRecursively(r8, r9, r10, r11, r0)
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            goto L2d
        L21:
            r6 = 8
            r7 = 0
            r5 = 0
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            java.nio.file.Path r0 = kotlin.io.path.PathsKt.copyToRecursively$default(r1, r2, r3, r4, r5, r6, r7)
        L2d:
            return r0
    }

    private static final java.nio.file.FileVisitResult copyToRecursively$copy$PathsKt__PathRecursiveFunctionsKt(java.util.ArrayList<java.nio.file.Path> r7, kotlin.jvm.functions.Function3<? super kotlin.io.path.CopyActionContext, ? super java.nio.file.Path, ? super java.nio.file.Path, ? extends kotlin.io.path.CopyActionResult> r8, java.nio.file.Path r9, java.nio.file.Path r10, java.nio.file.Path r11, kotlin.jvm.functions.Function3<? super java.nio.file.Path, ? super java.nio.file.Path, ? super java.lang.Exception, ? extends kotlin.io.path.OnErrorResult> r12, java.nio.file.Path r13, java.nio.file.attribute.BasicFileAttributes r14) {
            r0 = r7
            java.util.Collection r0 = (java.util.Collection) r0     // Catch: java.lang.Exception -> L2f
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Exception -> L2f
            if (r0 != 0) goto L19
            kotlin.io.path.PathsKt.checkFileName(r13)     // Catch: java.lang.Exception -> L2f
            r0 = r7
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Exception -> L2f
            java.lang.Object r0 = kotlin.collections.CollectionsKt.last(r0)     // Catch: java.lang.Exception -> L2f
            java.nio.file.Path r0 = (java.nio.file.Path) r0     // Catch: java.lang.Exception -> L2f
            checkNotSameAs$PathsKt__PathRecursiveFunctionsKt(r13, r0)     // Catch: java.lang.Exception -> L2f
        L19:
            kotlin.io.path.DefaultCopyActionContext r0 = kotlin.io.path.DefaultCopyActionContext.INSTANCE     // Catch: java.lang.Exception -> L2f
            java.nio.file.Path r1 = copyToRecursively$destination$PathsKt__PathRecursiveFunctionsKt(r9, r10, r11, r13)     // Catch: java.lang.Exception -> L2f
            java.lang.Object r0 = r8.invoke(r0, r13, r1)     // Catch: java.lang.Exception -> L2f
            kotlin.io.path.CopyActionResult r0 = (kotlin.io.path.CopyActionResult) r0     // Catch: java.lang.Exception -> L2f
            java.nio.file.FileVisitResult r0 = toFileVisitResult$PathsKt__PathRecursiveFunctionsKt(r0)     // Catch: java.lang.Exception -> L2f
            r2 = r9
            r3 = r10
            r4 = r11
            r1 = r12
            r5 = r13
            goto L3a
        L2f:
            r0 = move-exception
            r6 = r0
            r2 = r9
            r3 = r10
            r4 = r11
            r1 = r12
            r5 = r13
            java.nio.file.FileVisitResult r0 = copyToRecursively$error$PathsKt__PathRecursiveFunctionsKt(r1, r2, r3, r4, r5, r6)
        L3a:
            return r0
    }

    public static /* synthetic */ java.nio.file.Path copyToRecursively$default(java.nio.file.Path r0, java.nio.file.Path r1, kotlin.jvm.functions.Function3 r2, boolean r3, kotlin.jvm.functions.Function3 r4, int r5, java.lang.Object r6) {
            r6 = r5 & 2
            if (r6 == 0) goto L8
            kotlin.io.path.PathsKt__PathRecursiveFunctionsKt$copyToRecursively$3 r2 = kotlin.io.path.PathsKt__PathRecursiveFunctionsKt.AnonymousClass3.INSTANCE
            kotlin.jvm.functions.Function3 r2 = (kotlin.jvm.functions.Function3) r2
        L8:
            r5 = r5 & 8
            if (r5 == 0) goto L13
            kotlin.io.path.PathsKt__PathRecursiveFunctionsKt$copyToRecursively$4 r4 = new kotlin.io.path.PathsKt__PathRecursiveFunctionsKt$copyToRecursively$4
            r4.<init>(r3)
            kotlin.jvm.functions.Function3 r4 = (kotlin.jvm.functions.Function3) r4
        L13:
            java.nio.file.Path r0 = kotlin.io.path.PathsKt.copyToRecursively(r0, r1, r2, r3, r4)
            return r0
    }

    public static /* synthetic */ java.nio.file.Path copyToRecursively$default(java.nio.file.Path r0, java.nio.file.Path r1, kotlin.jvm.functions.Function3 r2, boolean r3, boolean r4, int r5, java.lang.Object r6) {
            r5 = r5 & 2
            if (r5 == 0) goto L8
            kotlin.io.path.PathsKt__PathRecursiveFunctionsKt$copyToRecursively$1 r2 = kotlin.io.path.PathsKt__PathRecursiveFunctionsKt.AnonymousClass1.INSTANCE
            kotlin.jvm.functions.Function3 r2 = (kotlin.jvm.functions.Function3) r2
        L8:
            java.nio.file.Path r0 = kotlin.io.path.PathsKt.copyToRecursively(r0, r1, r2, r3, r4)
            return r0
    }

    private static final java.nio.file.Path copyToRecursively$destination$PathsKt__PathRecursiveFunctionsKt(java.nio.file.Path r4, java.nio.file.Path r5, java.nio.file.Path r6, java.nio.file.Path r7) {
            java.nio.file.Path r0 = kotlin.io.path.PathsKt.relativeTo(r7, r4)
            java.lang.String r1 = r0.toString()
            java.nio.file.Path r1 = r5.resolve(r1)
            java.nio.file.Path r2 = r1.normalize()
            boolean r2 = r2.startsWith(r6)
            if (r2 == 0) goto L1a
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            return r1
        L1a:
            kotlin.io.path.IllegalFileNameException r2 = new kotlin.io.path.IllegalFileNameException
            java.lang.String r3 = "Copying files to outside the specified target directory is prohibited. The directory being recursively copied might contain an entry with an illegal name."
            r2.<init>(r7, r1, r3)
            throw r2
    }

    private static final java.nio.file.FileVisitResult copyToRecursively$error$PathsKt__PathRecursiveFunctionsKt(kotlin.jvm.functions.Function3<? super java.nio.file.Path, ? super java.nio.file.Path, ? super java.lang.Exception, ? extends kotlin.io.path.OnErrorResult> r1, java.nio.file.Path r2, java.nio.file.Path r3, java.nio.file.Path r4, java.nio.file.Path r5, java.lang.Exception r6) {
            java.nio.file.Path r0 = copyToRecursively$destination$PathsKt__PathRecursiveFunctionsKt(r2, r3, r4, r5)
            java.lang.Object r0 = r1.invoke(r5, r0, r6)
            kotlin.io.path.OnErrorResult r0 = (kotlin.io.path.OnErrorResult) r0
            java.nio.file.FileVisitResult r0 = toFileVisitResult$PathsKt__PathRecursiveFunctionsKt(r0)
            return r0
    }

    public static final void deleteRecursively(java.nio.file.Path r12) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            java.util.List r0 = deleteRecursivelyImpl$PathsKt__PathRecursiveFunctionsKt(r12)
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L41
            java.nio.file.FileSystemException r1 = new java.nio.file.FileSystemException
            java.lang.String r2 = "Failed to delete one or more files. See suppressed exceptions for details."
            r1.<init>(r2)
            r2 = r1
            r3 = 0
            r4 = r0
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            r5 = 0
            java.util.Iterator r6 = r4.iterator()
        L23:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L3c
            java.lang.Object r7 = r6.next()
            r8 = r7
            java.lang.Exception r8 = (java.lang.Exception) r8
            r9 = 0
            r10 = r2
            java.lang.Throwable r10 = (java.lang.Throwable) r10
            r11 = r8
            java.lang.Throwable r11 = (java.lang.Throwable) r11
            kotlin.ExceptionsKt.addSuppressed(r10, r11)
            goto L23
        L3c:
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            throw r1
        L41:
            return
    }

    private static final java.util.List<java.lang.Exception> deleteRecursivelyImpl$PathsKt__PathRecursiveFunctionsKt(java.nio.file.Path r12) {
            kotlin.io.path.ExceptionsCollector r0 = new kotlin.io.path.ExceptionsCollector
            r1 = 0
            r2 = 1
            r3 = 0
            r0.<init>(r1, r2, r3)
            r1 = 0
            r1 = 1
            java.nio.file.Path r2 = r12.getParent()
            if (r2 == 0) goto L48
            r4 = 0
            java.nio.file.DirectoryStream r5 = java.nio.file.Files.newDirectoryStream(r2)     // Catch: java.lang.Throwable -> L16
            goto L18
        L16:
            r5 = move-exception
            r5 = r3
        L18:
            if (r5 == 0) goto L46
            r6 = r5
            java.io.Closeable r6 = (java.io.Closeable) r6
            r7 = r6
            java.nio.file.DirectoryStream r7 = (java.nio.file.DirectoryStream) r7     // Catch: java.lang.Throwable -> L3f
            r8 = 0
            boolean r9 = r7 instanceof java.nio.file.SecureDirectoryStream     // Catch: java.lang.Throwable -> L3f
            if (r9 == 0) goto L38
            r1 = 0
            r0.setPath(r2)     // Catch: java.lang.Throwable -> L3f
            r9 = r7
            java.nio.file.SecureDirectoryStream r9 = (java.nio.file.SecureDirectoryStream) r9     // Catch: java.lang.Throwable -> L3f
            java.nio.file.Path r10 = r12.getFileName()     // Catch: java.lang.Throwable -> L3f
            java.lang.String r11 = "getFileName(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r11)     // Catch: java.lang.Throwable -> L3f
            handleEntry$PathsKt__PathRecursiveFunctionsKt(r9, r10, r3, r0)     // Catch: java.lang.Throwable -> L3f
        L38:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L3f
            kotlin.io.CloseableKt.closeFinally(r6, r3)
            goto L46
        L3f:
            r3 = move-exception
            throw r3     // Catch: java.lang.Throwable -> L41
        L41:
            r7 = move-exception
            kotlin.io.CloseableKt.closeFinally(r6, r3)
            throw r7
        L46:
        L48:
            if (r1 == 0) goto L4d
            insecureHandleEntry$PathsKt__PathRecursiveFunctionsKt(r12, r3, r0)
        L4d:
            java.util.List r2 = r0.getCollectedExceptions()
            return r2
    }

    private static final void enterDirectory$PathsKt__PathRecursiveFunctionsKt(java.nio.file.SecureDirectoryStream<java.nio.file.Path> r10, java.nio.file.Path r11, kotlin.io.path.ExceptionsCollector r12) {
            r0 = 0
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 1
            r5 = 0
            java.nio.file.LinkOption[] r4 = new java.nio.file.LinkOption[r4]     // Catch: java.lang.Exception -> L14 java.nio.file.NoSuchFileException -> L16
            java.nio.file.LinkOption r6 = java.nio.file.LinkOption.NOFOLLOW_LINKS     // Catch: java.lang.Exception -> L14 java.nio.file.NoSuchFileException -> L16
            r7 = 0
            r4[r7] = r6     // Catch: java.lang.Exception -> L14 java.nio.file.NoSuchFileException -> L16
            java.nio.file.SecureDirectoryStream r4 = r10.newDirectoryStream(r11, r4)     // Catch: java.lang.Exception -> L14 java.nio.file.NoSuchFileException -> L16
            goto L18
        L14:
            r1 = move-exception
            goto L50
        L16:
            r3 = move-exception
            r4 = r5
        L18:
            if (r4 == 0) goto L54
            java.io.Closeable r4 = (java.io.Closeable) r4     // Catch: java.lang.Exception -> L14
            r2 = r4
            java.nio.file.SecureDirectoryStream r2 = (java.nio.file.SecureDirectoryStream) r2     // Catch: java.lang.Throwable -> L49
            r3 = 0
            java.util.Iterator r6 = r2.iterator()     // Catch: java.lang.Throwable -> L49
        L25:
            boolean r7 = r6.hasNext()     // Catch: java.lang.Throwable -> L49
            if (r7 == 0) goto L42
            java.lang.Object r7 = r6.next()     // Catch: java.lang.Throwable -> L49
            java.nio.file.Path r7 = (java.nio.file.Path) r7     // Catch: java.lang.Throwable -> L49
            java.nio.file.Path r8 = r7.getFileName()     // Catch: java.lang.Throwable -> L49
            java.lang.String r9 = "getFileName(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r9)     // Catch: java.lang.Throwable -> L49
            java.nio.file.Path r9 = r12.getPath()     // Catch: java.lang.Throwable -> L49
            handleEntry$PathsKt__PathRecursiveFunctionsKt(r2, r8, r9, r12)     // Catch: java.lang.Throwable -> L49
            goto L25
        L42:
            kotlin.Unit r2 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L49
            kotlin.io.CloseableKt.closeFinally(r4, r5)     // Catch: java.lang.Exception -> L14
            goto L54
        L49:
            r2 = move-exception
            throw r2     // Catch: java.lang.Throwable -> L4b
        L4b:
            r3 = move-exception
            kotlin.io.CloseableKt.closeFinally(r4, r2)     // Catch: java.lang.Exception -> L14
            throw r3     // Catch: java.lang.Exception -> L14
        L50:
            r12.collect(r1)
            goto L56
        L54:
        L56:
            return
    }

    private static final void handleEntry$PathsKt__PathRecursiveFunctionsKt(java.nio.file.SecureDirectoryStream<java.nio.file.Path> r5, java.nio.file.Path r6, java.nio.file.Path r7, kotlin.io.path.ExceptionsCollector r8) {
            r8.enterEntry(r6)
            r0 = 0
            r1 = 0
            if (r7 == 0) goto L15
            java.nio.file.Path r2 = r8.getPath()     // Catch: java.lang.Exception -> L45
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)     // Catch: java.lang.Exception -> L45
            kotlin.io.path.PathsKt.checkFileName(r2)     // Catch: java.lang.Exception -> L45
            checkNotSameAs$PathsKt__PathRecursiveFunctionsKt(r2, r7)     // Catch: java.lang.Exception -> L45
        L15:
            r2 = 1
            java.nio.file.LinkOption[] r2 = new java.nio.file.LinkOption[r2]     // Catch: java.lang.Exception -> L45
            java.nio.file.LinkOption r3 = java.nio.file.LinkOption.NOFOLLOW_LINKS     // Catch: java.lang.Exception -> L45
            r4 = 0
            r2[r4] = r3     // Catch: java.lang.Exception -> L45
            boolean r2 = isDirectory$PathsKt__PathRecursiveFunctionsKt(r5, r6, r2)     // Catch: java.lang.Exception -> L45
            if (r2 == 0) goto L3a
            int r2 = r8.getTotalExceptions()     // Catch: java.lang.Exception -> L45
            enterDirectory$PathsKt__PathRecursiveFunctionsKt(r5, r6, r8)     // Catch: java.lang.Exception -> L45
            int r3 = r8.getTotalExceptions()     // Catch: java.lang.Exception -> L45
            if (r2 != r3) goto L43
            r3 = 0
            r4 = 0
            r5.deleteDirectory(r6)     // Catch: java.nio.file.NoSuchFileException -> L38 java.lang.Exception -> L45
            kotlin.Unit r4 = kotlin.Unit.INSTANCE     // Catch: java.nio.file.NoSuchFileException -> L38 java.lang.Exception -> L45
            goto L43
        L38:
            r4 = move-exception
            goto L43
        L3a:
            r2 = 0
            r3 = 0
            r5.deleteFile(r6)     // Catch: java.nio.file.NoSuchFileException -> L42 java.lang.Exception -> L45
            kotlin.Unit r3 = kotlin.Unit.INSTANCE     // Catch: java.nio.file.NoSuchFileException -> L42 java.lang.Exception -> L45
            goto L43
        L42:
            r3 = move-exception
        L43:
            goto L49
        L45:
            r1 = move-exception
            r8.collect(r1)
        L49:
            r8.exitEntry(r6)
            return
    }

    private static final void insecureEnterDirectory$PathsKt__PathRecursiveFunctionsKt(java.nio.file.Path r8, kotlin.io.path.ExceptionsCollector r9) {
            r0 = 0
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            java.nio.file.DirectoryStream r5 = java.nio.file.Files.newDirectoryStream(r8)     // Catch: java.lang.Exception -> Lc java.nio.file.NoSuchFileException -> Le
            goto L10
        Lc:
            r1 = move-exception
            goto L3e
        Le:
            r3 = move-exception
            r5 = r4
        L10:
            if (r5 == 0) goto L42
            java.io.Closeable r5 = (java.io.Closeable) r5     // Catch: java.lang.Exception -> Lc
            r2 = r5
            java.nio.file.DirectoryStream r2 = (java.nio.file.DirectoryStream) r2     // Catch: java.lang.Throwable -> L37
            r3 = 0
            java.util.Iterator r6 = r2.iterator()     // Catch: java.lang.Throwable -> L37
        L1d:
            boolean r7 = r6.hasNext()     // Catch: java.lang.Throwable -> L37
            if (r7 == 0) goto L30
            java.lang.Object r7 = r6.next()     // Catch: java.lang.Throwable -> L37
            java.nio.file.Path r7 = (java.nio.file.Path) r7     // Catch: java.lang.Throwable -> L37
            kotlin.jvm.internal.Intrinsics.checkNotNull(r7)     // Catch: java.lang.Throwable -> L37
            insecureHandleEntry$PathsKt__PathRecursiveFunctionsKt(r7, r8, r9)     // Catch: java.lang.Throwable -> L37
            goto L1d
        L30:
            kotlin.Unit r2 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L37
            kotlin.io.CloseableKt.closeFinally(r5, r4)     // Catch: java.lang.Exception -> Lc
            goto L42
        L37:
            r2 = move-exception
            throw r2     // Catch: java.lang.Throwable -> L39
        L39:
            r3 = move-exception
            kotlin.io.CloseableKt.closeFinally(r5, r2)     // Catch: java.lang.Exception -> Lc
            throw r3     // Catch: java.lang.Exception -> Lc
        L3e:
            r9.collect(r1)
            goto L44
        L42:
        L44:
            return
    }

    private static final void insecureHandleEntry$PathsKt__PathRecursiveFunctionsKt(java.nio.file.Path r6, java.nio.file.Path r7, kotlin.io.path.ExceptionsCollector r8) {
            r0 = 0
            r1 = 0
            if (r7 == 0) goto Lb
            kotlin.io.path.PathsKt.checkFileName(r6)     // Catch: java.lang.Exception -> L35
            checkNotSameAs$PathsKt__PathRecursiveFunctionsKt(r6, r7)     // Catch: java.lang.Exception -> L35
        Lb:
            r2 = 1
            java.nio.file.LinkOption[] r3 = new java.nio.file.LinkOption[r2]     // Catch: java.lang.Exception -> L35
            java.nio.file.LinkOption r4 = java.nio.file.LinkOption.NOFOLLOW_LINKS     // Catch: java.lang.Exception -> L35
            r5 = 0
            r3[r5] = r4     // Catch: java.lang.Exception -> L35
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r3, r2)     // Catch: java.lang.Exception -> L35
            java.nio.file.LinkOption[] r2 = (java.nio.file.LinkOption[]) r2     // Catch: java.lang.Exception -> L35
            boolean r2 = java.nio.file.Files.isDirectory(r6, r2)     // Catch: java.lang.Exception -> L35
            if (r2 == 0) goto L30
            int r2 = r8.getTotalExceptions()     // Catch: java.lang.Exception -> L35
            insecureEnterDirectory$PathsKt__PathRecursiveFunctionsKt(r6, r8)     // Catch: java.lang.Exception -> L35
            int r3 = r8.getTotalExceptions()     // Catch: java.lang.Exception -> L35
            if (r2 != r3) goto L33
            java.nio.file.Files.deleteIfExists(r6)     // Catch: java.lang.Exception -> L35
            goto L33
        L30:
            java.nio.file.Files.deleteIfExists(r6)     // Catch: java.lang.Exception -> L35
        L33:
            goto L39
        L35:
            r1 = move-exception
            r8.collect(r1)
        L39:
            return
    }

    private static final boolean isDirectory$PathsKt__PathRecursiveFunctionsKt(java.nio.file.SecureDirectoryStream<java.nio.file.Path> r4, java.nio.file.Path r5, java.nio.file.LinkOption... r6) {
            r0 = 0
            r1 = 0
            java.lang.Class<java.nio.file.attribute.BasicFileAttributeView> r2 = java.nio.file.attribute.BasicFileAttributeView.class
            int r3 = r6.length     // Catch: java.nio.file.NoSuchFileException -> L1e
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r6, r3)     // Catch: java.nio.file.NoSuchFileException -> L1e
            java.nio.file.LinkOption[] r3 = (java.nio.file.LinkOption[]) r3     // Catch: java.nio.file.NoSuchFileException -> L1e
            java.nio.file.attribute.FileAttributeView r2 = r4.getFileAttributeView(r5, r2, r3)     // Catch: java.nio.file.NoSuchFileException -> L1e
            java.nio.file.attribute.BasicFileAttributeView r2 = (java.nio.file.attribute.BasicFileAttributeView) r2     // Catch: java.nio.file.NoSuchFileException -> L1e
            java.nio.file.attribute.BasicFileAttributes r2 = r2.readAttributes()     // Catch: java.nio.file.NoSuchFileException -> L1e
            boolean r2 = r2.isDirectory()     // Catch: java.nio.file.NoSuchFileException -> L1e
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r2)     // Catch: java.nio.file.NoSuchFileException -> L1e
            goto L21
        L1e:
            r1 = move-exception
            r2 = 0
            r1 = r2
        L21:
            if (r1 == 0) goto L28
            boolean r0 = r1.booleanValue()
            goto L29
        L28:
            r0 = 0
        L29:
            return r0
    }

    private static final java.nio.file.FileVisitResult toFileVisitResult$PathsKt__PathRecursiveFunctionsKt(kotlin.io.path.CopyActionResult r2) {
            int[] r0 = kotlin.io.path.PathsKt__PathRecursiveFunctionsKt.WhenMappings.$EnumSwitchMapping$0
            int r1 = r2.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L17;
                case 2: goto L14;
                case 3: goto L11;
                default: goto Lb;
            }
        Lb:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L11:
            java.nio.file.FileVisitResult r0 = java.nio.file.FileVisitResult.SKIP_SUBTREE
            goto L19
        L14:
            java.nio.file.FileVisitResult r0 = java.nio.file.FileVisitResult.TERMINATE
            goto L19
        L17:
            java.nio.file.FileVisitResult r0 = java.nio.file.FileVisitResult.CONTINUE
        L19:
            return r0
    }

    private static final java.nio.file.FileVisitResult toFileVisitResult$PathsKt__PathRecursiveFunctionsKt(kotlin.io.path.OnErrorResult r2) {
            int[] r0 = kotlin.io.path.PathsKt__PathRecursiveFunctionsKt.WhenMappings.$EnumSwitchMapping$1
            int r1 = r2.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L14;
                case 2: goto L11;
                default: goto Lb;
            }
        Lb:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L11:
            java.nio.file.FileVisitResult r0 = java.nio.file.FileVisitResult.SKIP_SUBTREE
            goto L16
        L14:
            java.nio.file.FileVisitResult r0 = java.nio.file.FileVisitResult.TERMINATE
        L16:
            return r0
    }

    private static final <R> R tryIgnoreNoSuchFileException$PathsKt__PathRecursiveFunctionsKt(kotlin.jvm.functions.Function0<? extends R> r3) {
            r0 = 0
            java.lang.Object r1 = r3.invoke()     // Catch: java.nio.file.NoSuchFileException -> L6
            goto L9
        L6:
            r1 = move-exception
            r2 = 0
            r1 = r2
        L9:
            return r1
    }
}
