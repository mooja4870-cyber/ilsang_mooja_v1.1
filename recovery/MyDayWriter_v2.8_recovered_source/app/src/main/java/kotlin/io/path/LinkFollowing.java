package kotlin.io.path;

/* JADX INFO: compiled from: PathTreeWalk.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0019\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fJ\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\r\u001a\u00020\u000eR\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lkotlin/io/path/LinkFollowing;", "", "()V", "followLinkOption", "", "Ljava/nio/file/LinkOption;", "[Ljava/nio/file/LinkOption;", "followVisitOption", "", "Ljava/nio/file/FileVisitOption;", "nofollowLinkOption", "nofollowVisitOption", "toLinkOptions", "followLinks", "", "(Z)[Ljava/nio/file/LinkOption;", "toVisitOptions", "kotlin-stdlib-jdk7"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class LinkFollowing {
    public static final kotlin.io.path.LinkFollowing INSTANCE = null;
    private static final java.nio.file.LinkOption[] followLinkOption = null;
    private static final java.util.Set<java.nio.file.FileVisitOption> followVisitOption = null;
    private static final java.nio.file.LinkOption[] nofollowLinkOption = null;
    private static final java.util.Set<java.nio.file.FileVisitOption> nofollowVisitOption = null;

    static {
            kotlin.io.path.LinkFollowing r0 = new kotlin.io.path.LinkFollowing
            r0.<init>()
            kotlin.io.path.LinkFollowing.INSTANCE = r0
            r0 = 1
            java.nio.file.LinkOption[] r0 = new java.nio.file.LinkOption[r0]
            java.nio.file.LinkOption r1 = java.nio.file.LinkOption.NOFOLLOW_LINKS
            r2 = 0
            r0[r2] = r1
            kotlin.io.path.LinkFollowing.nofollowLinkOption = r0
            java.nio.file.LinkOption[] r0 = new java.nio.file.LinkOption[r2]
            kotlin.io.path.LinkFollowing.followLinkOption = r0
            java.util.Set r0 = kotlin.collections.SetsKt.emptySet()
            kotlin.io.path.LinkFollowing.nofollowVisitOption = r0
            java.nio.file.FileVisitOption r0 = java.nio.file.FileVisitOption.FOLLOW_LINKS
            java.util.Set r0 = kotlin.collections.SetsKt.setOf(r0)
            kotlin.io.path.LinkFollowing.followVisitOption = r0
            return
    }

    private LinkFollowing() {
            r0 = this;
            r0.<init>()
            return
    }

    public final java.nio.file.LinkOption[] toLinkOptions(boolean r2) {
            r1 = this;
            if (r2 == 0) goto L5
            java.nio.file.LinkOption[] r0 = kotlin.io.path.LinkFollowing.followLinkOption
            goto L7
        L5:
            java.nio.file.LinkOption[] r0 = kotlin.io.path.LinkFollowing.nofollowLinkOption
        L7:
            return r0
    }

    public final java.util.Set<java.nio.file.FileVisitOption> toVisitOptions(boolean r2) {
            r1 = this;
            if (r2 == 0) goto L5
            java.util.Set<java.nio.file.FileVisitOption> r0 = kotlin.io.path.LinkFollowing.followVisitOption
            goto L7
        L5:
            java.util.Set<java.nio.file.FileVisitOption> r0 = kotlin.io.path.LinkFollowing.nofollowVisitOption
        L7:
            return r0
    }
}
