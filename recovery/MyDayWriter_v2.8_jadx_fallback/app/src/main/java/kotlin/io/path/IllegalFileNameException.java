package kotlin.io.path;

/* JADX INFO: compiled from: PathRecursiveFunctions.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"Lkotlin/io/path/IllegalFileNameException;", "Ljava/nio/file/FileSystemException;", "file", "Ljava/nio/file/Path;", "(Ljava/nio/file/Path;)V", "other", "message", "", "(Ljava/nio/file/Path;Ljava/nio/file/Path;Ljava/lang/String;)V", "kotlin-stdlib-jdk7"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class IllegalFileNameException extends java.nio.file.FileSystemException {
    public IllegalFileNameException(java.nio.file.Path r2) {
            r1 = this;
            java.lang.String r0 = "file"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r0 = 0
            r1.<init>(r2, r0, r0)
            return
    }

    public IllegalFileNameException(java.nio.file.Path r3, java.nio.file.Path r4, java.lang.String r5) {
            r2 = this;
            java.lang.String r0 = "file"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = r3.toString()
            if (r4 == 0) goto L10
            java.lang.String r1 = r4.toString()
            goto L11
        L10:
            r1 = 0
        L11:
            r2.<init>(r0, r1, r5)
            return
    }
}
