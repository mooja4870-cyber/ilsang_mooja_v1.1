package kotlin.io.path;

/* JADX INFO: compiled from: PathTreeWalk.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u00122\u0006\u0010\u0006\u001a\u00020\u0007J\u0018\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lkotlin/io/path/DirectoryEntriesReader;", "Ljava/nio/file/SimpleFileVisitor;", "Ljava/nio/file/Path;", "followLinks", "", "(Z)V", "directoryNode", "Lkotlin/io/path/PathNode;", "entries", "Lkotlin/collections/ArrayDeque;", "getFollowLinks", "()Z", "preVisitDirectory", "Ljava/nio/file/FileVisitResult;", "dir", "attrs", "Ljava/nio/file/attribute/BasicFileAttributes;", "readEntries", "", "visitFile", "file", "kotlin-stdlib-jdk7"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class DirectoryEntriesReader extends java.nio.file.SimpleFileVisitor<java.nio.file.Path> {
    private kotlin.io.path.PathNode directoryNode;
    private kotlin.collections.ArrayDeque<kotlin.io.path.PathNode> entries;
    private final boolean followLinks;

    public DirectoryEntriesReader(boolean r2) {
            r1 = this;
            r1.<init>()
            r1.followLinks = r2
            kotlin.collections.ArrayDeque r0 = new kotlin.collections.ArrayDeque
            r0.<init>()
            r1.entries = r0
            return
    }

    public final boolean getFollowLinks() {
            r1 = this;
            boolean r0 = r1.followLinks
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

    public java.nio.file.FileVisitResult preVisitDirectory(java.nio.file.Path r4, java.nio.file.attribute.BasicFileAttributes r5) {
            r3 = this;
            java.lang.String r0 = "dir"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "attrs"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            kotlin.io.path.PathNode r0 = new kotlin.io.path.PathNode
            java.lang.Object r1 = r5.fileKey()
            kotlin.io.path.PathNode r2 = r3.directoryNode
            r0.<init>(r4, r1, r2)
            kotlin.collections.ArrayDeque<kotlin.io.path.PathNode> r1 = r3.entries
            r1.add(r0)
            java.nio.file.FileVisitResult r1 = super.preVisitDirectory(r4, r5)
            java.lang.String r2 = "preVisitDirectory(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            return r1
    }

    public final java.util.List<kotlin.io.path.PathNode> readEntries(kotlin.io.path.PathNode r5) {
            r4 = this;
            java.lang.String r0 = "directoryNode"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r4.directoryNode = r5
            java.nio.file.Path r0 = r5.getPath()
            kotlin.io.path.LinkFollowing r1 = kotlin.io.path.LinkFollowing.INSTANCE
            boolean r2 = r4.followLinks
            java.util.Set r1 = r1.toVisitOptions(r2)
            r2 = 1
            r3 = r4
            java.nio.file.FileVisitor r3 = (java.nio.file.FileVisitor) r3
            java.nio.file.Files.walkFileTree(r0, r1, r2, r3)
            kotlin.collections.ArrayDeque<kotlin.io.path.PathNode> r0 = r4.entries
            r0.removeFirst()
            kotlin.collections.ArrayDeque<kotlin.io.path.PathNode> r0 = r4.entries
            r1 = r0
            r2 = 0
            kotlin.collections.ArrayDeque r3 = new kotlin.collections.ArrayDeque
            r3.<init>()
            r4.entries = r3
            java.util.List r0 = (java.util.List) r0
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

    public java.nio.file.FileVisitResult visitFile(java.nio.file.Path r4, java.nio.file.attribute.BasicFileAttributes r5) {
            r3 = this;
            java.lang.String r0 = "file"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "attrs"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            kotlin.io.path.PathNode r0 = new kotlin.io.path.PathNode
            r1 = 0
            kotlin.io.path.PathNode r2 = r3.directoryNode
            r0.<init>(r4, r1, r2)
            kotlin.collections.ArrayDeque<kotlin.io.path.PathNode> r1 = r3.entries
            r1.add(r0)
            java.nio.file.FileVisitResult r1 = super.visitFile(r4, r5)
            java.lang.String r2 = "visitFile(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            return r1
    }
}
