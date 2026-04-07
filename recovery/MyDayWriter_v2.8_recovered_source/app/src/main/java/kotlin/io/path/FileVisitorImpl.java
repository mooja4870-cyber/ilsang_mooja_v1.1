package kotlin.io.path;

/* JADX INFO: compiled from: FileVisitorBuilder.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001Bw\u0012\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004\u0012\u001a\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004\u0012\u001a\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004\u0012\u001c\u0010\n\u001a\u0018\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004¢\u0006\u0002\u0010\u000bJ\u001a\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\tH\u0016J\u0018\u0010\u000f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0005H\u0016J\u0018\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0005H\u0016J\u0018\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\tH\u0016R$\u0010\n\u001a\u0018\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lkotlin/io/path/FileVisitorImpl;", "Ljava/nio/file/SimpleFileVisitor;", "Ljava/nio/file/Path;", "onPreVisitDirectory", "Lkotlin/Function2;", "Ljava/nio/file/attribute/BasicFileAttributes;", "Ljava/nio/file/FileVisitResult;", "onVisitFile", "onVisitFileFailed", "Ljava/io/IOException;", "onPostVisitDirectory", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)V", "postVisitDirectory", "dir", "exc", "preVisitDirectory", "attrs", "visitFile", "file", "visitFileFailed", "kotlin-stdlib-jdk7"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class FileVisitorImpl extends java.nio.file.SimpleFileVisitor<java.nio.file.Path> {
    private final kotlin.jvm.functions.Function2<java.nio.file.Path, java.io.IOException, java.nio.file.FileVisitResult> onPostVisitDirectory;
    private final kotlin.jvm.functions.Function2<java.nio.file.Path, java.nio.file.attribute.BasicFileAttributes, java.nio.file.FileVisitResult> onPreVisitDirectory;
    private final kotlin.jvm.functions.Function2<java.nio.file.Path, java.nio.file.attribute.BasicFileAttributes, java.nio.file.FileVisitResult> onVisitFile;
    private final kotlin.jvm.functions.Function2<java.nio.file.Path, java.io.IOException, java.nio.file.FileVisitResult> onVisitFileFailed;

    public FileVisitorImpl(kotlin.jvm.functions.Function2<? super java.nio.file.Path, ? super java.nio.file.attribute.BasicFileAttributes, ? extends java.nio.file.FileVisitResult> r1, kotlin.jvm.functions.Function2<? super java.nio.file.Path, ? super java.nio.file.attribute.BasicFileAttributes, ? extends java.nio.file.FileVisitResult> r2, kotlin.jvm.functions.Function2<? super java.nio.file.Path, ? super java.io.IOException, ? extends java.nio.file.FileVisitResult> r3, kotlin.jvm.functions.Function2<? super java.nio.file.Path, ? super java.io.IOException, ? extends java.nio.file.FileVisitResult> r4) {
            r0 = this;
            r0.<init>()
            r0.onPreVisitDirectory = r1
            r0.onVisitFile = r2
            r0.onVisitFileFailed = r3
            r0.onPostVisitDirectory = r4
            return
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public /* bridge */ /* synthetic */ java.nio.file.FileVisitResult postVisitDirectory(java.lang.Object r2, java.io.IOException r3) {
            r1 = this;
            r0 = r2
            java.nio.file.Path r0 = (java.nio.file.Path) r0
            java.nio.file.FileVisitResult r0 = r1.postVisitDirectory(r0, r3)
            return r0
    }

    public java.nio.file.FileVisitResult postVisitDirectory(java.nio.file.Path r3, java.io.IOException r4) {
            r2 = this;
            java.lang.String r0 = "dir"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            kotlin.jvm.functions.Function2<java.nio.file.Path, java.io.IOException, java.nio.file.FileVisitResult> r0 = r2.onPostVisitDirectory
            if (r0 == 0) goto L11
            java.lang.Object r0 = r0.invoke(r3, r4)
            java.nio.file.FileVisitResult r0 = (java.nio.file.FileVisitResult) r0
            if (r0 != 0) goto L1a
        L11:
            java.nio.file.FileVisitResult r0 = super.postVisitDirectory(r3, r4)
            java.lang.String r1 = "postVisitDirectory(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
        L1a:
            return r0
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public /* bridge */ /* synthetic */ java.nio.file.FileVisitResult preVisitDirectory(java.lang.Object r2, java.nio.file.attribute.BasicFileAttributes r3) {
            r1 = this;
            r0 = r2
            java.nio.file.Path r0 = (java.nio.file.Path) r0
            java.nio.file.FileVisitResult r0 = r1.preVisitDirectory(r0, r3)
            return r0
    }

    public java.nio.file.FileVisitResult preVisitDirectory(java.nio.file.Path r3, java.nio.file.attribute.BasicFileAttributes r4) {
            r2 = this;
            java.lang.String r0 = "dir"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "attrs"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            kotlin.jvm.functions.Function2<java.nio.file.Path, java.nio.file.attribute.BasicFileAttributes, java.nio.file.FileVisitResult> r0 = r2.onPreVisitDirectory
            if (r0 == 0) goto L16
            java.lang.Object r0 = r0.invoke(r3, r4)
            java.nio.file.FileVisitResult r0 = (java.nio.file.FileVisitResult) r0
            if (r0 != 0) goto L1f
        L16:
            java.nio.file.FileVisitResult r0 = super.preVisitDirectory(r3, r4)
            java.lang.String r1 = "preVisitDirectory(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
        L1f:
            return r0
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public /* bridge */ /* synthetic */ java.nio.file.FileVisitResult visitFile(java.lang.Object r2, java.nio.file.attribute.BasicFileAttributes r3) {
            r1 = this;
            r0 = r2
            java.nio.file.Path r0 = (java.nio.file.Path) r0
            java.nio.file.FileVisitResult r0 = r1.visitFile(r0, r3)
            return r0
    }

    public java.nio.file.FileVisitResult visitFile(java.nio.file.Path r3, java.nio.file.attribute.BasicFileAttributes r4) {
            r2 = this;
            java.lang.String r0 = "file"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "attrs"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            kotlin.jvm.functions.Function2<java.nio.file.Path, java.nio.file.attribute.BasicFileAttributes, java.nio.file.FileVisitResult> r0 = r2.onVisitFile
            if (r0 == 0) goto L16
            java.lang.Object r0 = r0.invoke(r3, r4)
            java.nio.file.FileVisitResult r0 = (java.nio.file.FileVisitResult) r0
            if (r0 != 0) goto L1f
        L16:
            java.nio.file.FileVisitResult r0 = super.visitFile(r3, r4)
            java.lang.String r1 = "visitFile(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
        L1f:
            return r0
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public /* bridge */ /* synthetic */ java.nio.file.FileVisitResult visitFileFailed(java.lang.Object r2, java.io.IOException r3) {
            r1 = this;
            r0 = r2
            java.nio.file.Path r0 = (java.nio.file.Path) r0
            java.nio.file.FileVisitResult r0 = r1.visitFileFailed(r0, r3)
            return r0
    }

    public java.nio.file.FileVisitResult visitFileFailed(java.nio.file.Path r3, java.io.IOException r4) {
            r2 = this;
            java.lang.String r0 = "file"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "exc"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            kotlin.jvm.functions.Function2<java.nio.file.Path, java.io.IOException, java.nio.file.FileVisitResult> r0 = r2.onVisitFileFailed
            if (r0 == 0) goto L16
            java.lang.Object r0 = r0.invoke(r3, r4)
            java.nio.file.FileVisitResult r0 = (java.nio.file.FileVisitResult) r0
            if (r0 != 0) goto L1f
        L16:
            java.nio.file.FileVisitResult r0 = super.visitFileFailed(r3, r4)
            java.lang.String r1 = "visitFileFailed(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
        L1f:
            return r0
    }
}
