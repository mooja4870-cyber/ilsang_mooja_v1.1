package kotlin.io.path;

/* JADX INFO: compiled from: FileVisitorBuilder.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u000fJ\b\u0010\u0010\u001a\u00020\u0011H\u0002J\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0002JB\u0010\u0005\u001a\u00020\u001128\u0010\u0013\u001a4\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u0017\u0012\b\b\u0015\u0012\u0004\b\b(\u0018\u0012\u0015\u0012\u0013\u0018\u00010\b¢\u0006\f\b\u0017\u0012\b\b\u0015\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\t0\u0006H\u0016J@\u0010\n\u001a\u00020\u001126\u0010\u0013\u001a2\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u0017\u0012\b\b\u0015\u0012\u0004\b\b(\u0018\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\u0017\u0012\b\b\u0015\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\t0\u0006H\u0016J@\u0010\f\u001a\u00020\u001126\u0010\u0013\u001a2\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u0017\u0012\b\b\u0015\u0012\u0004\b\b(\u001b\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\u0017\u0012\b\b\u0015\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\t0\u0006H\u0016J@\u0010\r\u001a\u00020\u001126\u0010\u0013\u001a2\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u0017\u0012\b\b\u0015\u0012\u0004\b\b(\u001b\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0017\u0012\b\b\u0015\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\t0\u0006H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\u0005\u001a\u0018\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010\r\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lkotlin/io/path/FileVisitorBuilderImpl;", "Lkotlin/io/path/FileVisitorBuilder;", "()V", "isBuilt", "", "onPostVisitDirectory", "Lkotlin/Function2;", "Ljava/nio/file/Path;", "Ljava/io/IOException;", "Ljava/nio/file/FileVisitResult;", "onPreVisitDirectory", "Ljava/nio/file/attribute/BasicFileAttributes;", "onVisitFile", "onVisitFileFailed", "build", "Ljava/nio/file/FileVisitor;", "checkIsNotBuilt", "", "checkNotDefined", "function", "", "name", "", "Lkotlin/ParameterName;", "directory", "exception", "attributes", "file", "kotlin-stdlib-jdk7"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class FileVisitorBuilderImpl implements kotlin.io.path.FileVisitorBuilder {
    private boolean isBuilt;
    private kotlin.jvm.functions.Function2<? super java.nio.file.Path, ? super java.io.IOException, ? extends java.nio.file.FileVisitResult> onPostVisitDirectory;
    private kotlin.jvm.functions.Function2<? super java.nio.file.Path, ? super java.nio.file.attribute.BasicFileAttributes, ? extends java.nio.file.FileVisitResult> onPreVisitDirectory;
    private kotlin.jvm.functions.Function2<? super java.nio.file.Path, ? super java.nio.file.attribute.BasicFileAttributes, ? extends java.nio.file.FileVisitResult> onVisitFile;
    private kotlin.jvm.functions.Function2<? super java.nio.file.Path, ? super java.io.IOException, ? extends java.nio.file.FileVisitResult> onVisitFileFailed;

    public FileVisitorBuilderImpl() {
            r0 = this;
            r0.<init>()
            return
    }

    private final void checkIsNotBuilt() {
            r2 = this;
            boolean r0 = r2.isBuilt
            if (r0 != 0) goto L5
            return
        L5:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "This builder was already built"
            r0.<init>(r1)
            throw r0
    }

    private final void checkNotDefined(java.lang.Object r4, java.lang.String r5) {
            r3 = this;
            if (r4 != 0) goto L3
            return
        L3:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r1 = r1.append(r5)
            java.lang.String r2 = " was already defined"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public final java.nio.file.FileVisitor<java.nio.file.Path> build() {
            r5 = this;
            r5.checkIsNotBuilt()
            r0 = 1
            r5.isBuilt = r0
            kotlin.io.path.FileVisitorImpl r0 = new kotlin.io.path.FileVisitorImpl
            kotlin.jvm.functions.Function2<? super java.nio.file.Path, ? super java.nio.file.attribute.BasicFileAttributes, ? extends java.nio.file.FileVisitResult> r1 = r5.onPreVisitDirectory
            kotlin.jvm.functions.Function2<? super java.nio.file.Path, ? super java.nio.file.attribute.BasicFileAttributes, ? extends java.nio.file.FileVisitResult> r2 = r5.onVisitFile
            kotlin.jvm.functions.Function2<? super java.nio.file.Path, ? super java.io.IOException, ? extends java.nio.file.FileVisitResult> r3 = r5.onVisitFileFailed
            kotlin.jvm.functions.Function2<? super java.nio.file.Path, ? super java.io.IOException, ? extends java.nio.file.FileVisitResult> r4 = r5.onPostVisitDirectory
            r0.<init>(r1, r2, r3, r4)
            java.nio.file.FileVisitor r0 = (java.nio.file.FileVisitor) r0
            return r0
    }

    @Override // kotlin.io.path.FileVisitorBuilder
    public void onPostVisitDirectory(kotlin.jvm.functions.Function2<? super java.nio.file.Path, ? super java.io.IOException, ? extends java.nio.file.FileVisitResult> r3) {
            r2 = this;
            java.lang.String r0 = "function"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r2.checkIsNotBuilt()
            kotlin.jvm.functions.Function2<? super java.nio.file.Path, ? super java.io.IOException, ? extends java.nio.file.FileVisitResult> r0 = r2.onPostVisitDirectory
            java.lang.String r1 = "onPostVisitDirectory"
            r2.checkNotDefined(r0, r1)
            r2.onPostVisitDirectory = r3
            return
    }

    @Override // kotlin.io.path.FileVisitorBuilder
    public void onPreVisitDirectory(kotlin.jvm.functions.Function2<? super java.nio.file.Path, ? super java.nio.file.attribute.BasicFileAttributes, ? extends java.nio.file.FileVisitResult> r3) {
            r2 = this;
            java.lang.String r0 = "function"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r2.checkIsNotBuilt()
            kotlin.jvm.functions.Function2<? super java.nio.file.Path, ? super java.nio.file.attribute.BasicFileAttributes, ? extends java.nio.file.FileVisitResult> r0 = r2.onPreVisitDirectory
            java.lang.String r1 = "onPreVisitDirectory"
            r2.checkNotDefined(r0, r1)
            r2.onPreVisitDirectory = r3
            return
    }

    @Override // kotlin.io.path.FileVisitorBuilder
    public void onVisitFile(kotlin.jvm.functions.Function2<? super java.nio.file.Path, ? super java.nio.file.attribute.BasicFileAttributes, ? extends java.nio.file.FileVisitResult> r3) {
            r2 = this;
            java.lang.String r0 = "function"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r2.checkIsNotBuilt()
            kotlin.jvm.functions.Function2<? super java.nio.file.Path, ? super java.nio.file.attribute.BasicFileAttributes, ? extends java.nio.file.FileVisitResult> r0 = r2.onVisitFile
            java.lang.String r1 = "onVisitFile"
            r2.checkNotDefined(r0, r1)
            r2.onVisitFile = r3
            return
    }

    @Override // kotlin.io.path.FileVisitorBuilder
    public void onVisitFileFailed(kotlin.jvm.functions.Function2<? super java.nio.file.Path, ? super java.io.IOException, ? extends java.nio.file.FileVisitResult> r3) {
            r2 = this;
            java.lang.String r0 = "function"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r2.checkIsNotBuilt()
            kotlin.jvm.functions.Function2<? super java.nio.file.Path, ? super java.io.IOException, ? extends java.nio.file.FileVisitResult> r0 = r2.onVisitFileFailed
            java.lang.String r1 = "onVisitFileFailed"
            r2.checkNotDefined(r0, r1)
            r2.onVisitFileFailed = r3
            return
    }
}
