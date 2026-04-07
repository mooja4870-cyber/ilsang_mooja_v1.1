package kotlin.io.path;

/* JADX INFO: compiled from: PathTreeWalk.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u001a%\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0002¢\u0006\u0002\u0010\u0007\u001a\f\u0010\b\u001a\u00020\t*\u00020\nH\u0002¨\u0006\u000b"}, d2 = {"keyOf", "", "path", "Ljava/nio/file/Path;", "linkOptions", "", "Ljava/nio/file/LinkOption;", "(Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Ljava/lang/Object;", "createsCycle", "", "Lkotlin/io/path/PathNode;", "kotlin-stdlib-jdk7"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class PathTreeWalkKt {
    public static final /* synthetic */ boolean access$createsCycle(kotlin.io.path.PathNode r1) {
            boolean r0 = createsCycle(r1)
            return r0
    }

    public static final /* synthetic */ java.lang.Object access$keyOf(java.nio.file.Path r1, java.nio.file.LinkOption[] r2) {
            java.lang.Object r0 = keyOf(r1, r2)
            return r0
    }

    private static final boolean createsCycle(kotlin.io.path.PathNode r4) {
            kotlin.io.path.PathNode r0 = r4.getParent()
        L4:
            if (r0 == 0) goto L3a
            java.lang.Object r1 = r0.getKey()
            r2 = 1
            if (r1 == 0) goto L22
            java.lang.Object r1 = r4.getKey()
            if (r1 == 0) goto L22
            java.lang.Object r1 = r0.getKey()
            java.lang.Object r3 = r4.getKey()
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            if (r1 == 0) goto L35
            return r2
        L22:
            java.nio.file.Path r1 = r0.getPath()     // Catch: java.lang.SecurityException -> L32 java.io.IOException -> L34
            java.nio.file.Path r3 = r4.getPath()     // Catch: java.lang.SecurityException -> L32 java.io.IOException -> L34
            boolean r1 = java.nio.file.Files.isSameFile(r1, r3)     // Catch: java.lang.SecurityException -> L32 java.io.IOException -> L34
            if (r1 == 0) goto L35
            return r2
        L32:
            r1 = move-exception
            goto L35
        L34:
            r1 = move-exception
        L35:
            kotlin.io.path.PathNode r0 = r0.getParent()
            goto L4
        L3a:
            r1 = 0
            return r1
    }

    private static final java.lang.Object keyOf(java.nio.file.Path r3, java.nio.file.LinkOption[] r4) {
            int r0 = r4.length     // Catch: java.lang.Throwable -> L1f
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r4, r0)     // Catch: java.lang.Throwable -> L1f
            java.nio.file.LinkOption[] r0 = (java.nio.file.LinkOption[]) r0     // Catch: java.lang.Throwable -> L1f
            java.lang.Class<java.nio.file.attribute.BasicFileAttributes> r1 = java.nio.file.attribute.BasicFileAttributes.class
            int r2 = r0.length     // Catch: java.lang.Throwable -> L1f
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r2)     // Catch: java.lang.Throwable -> L1f
            java.nio.file.LinkOption[] r0 = (java.nio.file.LinkOption[]) r0     // Catch: java.lang.Throwable -> L1f
            java.nio.file.attribute.BasicFileAttributes r0 = java.nio.file.Files.readAttributes(r3, r1, r0)     // Catch: java.lang.Throwable -> L1f
            java.lang.String r1 = "readAttributes(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)     // Catch: java.lang.Throwable -> L1f
            java.lang.Object r0 = r0.fileKey()     // Catch: java.lang.Throwable -> L1f
            goto L22
        L1f:
            r0 = move-exception
            r1 = 0
            r0 = r1
        L22:
            return r0
    }
}
