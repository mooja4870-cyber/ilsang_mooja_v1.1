package kotlin.io;

/* JADX INFO: compiled from: FilePathComponents.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u001a\u0011\u0010\u000b\u001a\u00020\f*\u00020\bH\u0002¢\u0006\u0002\b\r\u001a\u001c\u0010\u000e\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\fH\u0000\u001a\f\u0010\u0011\u001a\u00020\u0012*\u00020\u0002H\u0000\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0000\u0010\u0003\"\u0018\u0010\u0004\u001a\u00020\u0002*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\"\u0018\u0010\u0007\u001a\u00020\b*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"isRooted", "", "Ljava/io/File;", "(Ljava/io/File;)Z", "root", "getRoot", "(Ljava/io/File;)Ljava/io/File;", "rootName", "", "getRootName", "(Ljava/io/File;)Ljava/lang/String;", "getRootLength", "", "getRootLength$FilesKt__FilePathComponentsKt", "subPath", "beginIndex", "endIndex", "toComponents", "Lkotlin/io/FilePathComponents;", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/io/FilesKt")
class FilesKt__FilePathComponentsKt {
    public FilesKt__FilePathComponentsKt() {
            r0 = this;
            r0.<init>()
            return
    }

    public static final java.io.File getRoot(java.io.File r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.io.File r0 = new java.io.File
            java.lang.String r1 = kotlin.io.FilesKt.getRootName(r2)
            r0.<init>(r1)
            return r0
    }

    private static final int getRootLength$FilesKt__FilePathComponentsKt(java.lang.String r10) {
            r0 = r10
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            char r1 = java.io.File.separatorChar
            r4 = 4
            r5 = 0
            r2 = 0
            r3 = 0
            int r0 = kotlin.text.StringsKt.indexOf$default(r0, r1, r2, r3, r4, r5)
            r1 = 1
            if (r0 != 0) goto L46
            int r2 = r10.length()
            if (r2 <= r1) goto L45
            char r2 = r10.charAt(r1)
            char r3 = java.io.File.separatorChar
            if (r2 != r3) goto L45
            r4 = r10
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            char r5 = java.io.File.separatorChar
            r8 = 4
            r9 = 0
            r6 = 2
            r7 = 0
            int r0 = kotlin.text.StringsKt.indexOf$default(r4, r5, r6, r7, r8, r9)
            if (r0 < 0) goto L45
            r2 = r10
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            char r3 = java.io.File.separatorChar
            int r4 = r0 + 1
            r6 = 4
            r7 = 0
            r5 = 0
            int r0 = kotlin.text.StringsKt.indexOf$default(r2, r3, r4, r5, r6, r7)
            if (r0 < 0) goto L40
            int r1 = r0 + 1
            return r1
        L40:
            int r1 = r10.length()
            return r1
        L45:
            return r1
        L46:
            r2 = 58
            if (r0 <= 0) goto L54
            int r3 = r0 + (-1)
            char r3 = r10.charAt(r3)
            if (r3 != r2) goto L54
            int r0 = r0 + r1
            return r0
        L54:
            r1 = -1
            r3 = 0
            if (r0 != r1) goto L68
            r1 = r10
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r4 = 2
            r5 = 0
            boolean r1 = kotlin.text.StringsKt.endsWith$default(r1, r2, r3, r4, r5)
            if (r1 == 0) goto L68
            int r1 = r10.length()
            return r1
        L68:
            return r3
    }

    public static final java.lang.String getRootName(java.io.File r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = r3.getPath()
            java.lang.String r1 = "getPath(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.lang.String r2 = r3.getPath()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r1)
            int r1 = getRootLength$FilesKt__FilePathComponentsKt(r2)
            r2 = 0
            java.lang.String r0 = r0.substring(r2, r1)
            java.lang.String r1 = "substring(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    public static final boolean isRooted(java.io.File r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = r2.getPath()
            java.lang.String r1 = "getPath(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            int r0 = getRootLength$FilesKt__FilePathComponentsKt(r0)
            if (r0 <= 0) goto L16
            r0 = 1
            goto L17
        L16:
            r0 = 0
        L17:
            return r0
    }

    public static final java.io.File subPath(java.io.File r1, int r2, int r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            kotlin.io.FilePathComponents r0 = kotlin.io.FilesKt.toComponents(r1)
            java.io.File r0 = r0.subPath(r2, r3)
            return r0
    }

    public static final kotlin.io.FilePathComponents toComponents(java.io.File r14) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            java.lang.String r0 = r14.getPath()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            int r1 = getRootLength$FilesKt__FilePathComponentsKt(r0)
            r2 = 0
            java.lang.String r3 = r0.substring(r2, r1)
            java.lang.String r4 = "substring(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            java.lang.String r5 = r0.substring(r1)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r4)
            r4 = r5
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            int r4 = r4.length()
            r6 = 1
            if (r4 != 0) goto L2d
            r4 = r6
            goto L2e
        L2d:
            r4 = r2
        L2e:
            if (r4 == 0) goto L35
            java.util.List r2 = kotlin.collections.CollectionsKt.emptyList()
            goto L78
        L35:
            r4 = r6
            r6 = r5
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            char[] r7 = new char[r4]
            char r4 = java.io.File.separatorChar
            r7[r2] = r4
            r10 = 6
            r11 = 0
            r8 = 0
            r9 = 0
            java.util.List r2 = kotlin.text.StringsKt.split$default(r6, r7, r8, r9, r10, r11)
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            r4 = 0
            java.util.ArrayList r6 = new java.util.ArrayList
            r7 = 10
            int r7 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r2, r7)
            r6.<init>(r7)
            java.util.Collection r6 = (java.util.Collection) r6
            r7 = r2
            r8 = 0
            java.util.Iterator r9 = r7.iterator()
        L5d:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L74
            java.lang.Object r10 = r9.next()
            r11 = r10
            java.lang.String r11 = (java.lang.String) r11
            r12 = 0
            java.io.File r13 = new java.io.File
            r13.<init>(r11)
            r6.add(r13)
            goto L5d
        L74:
            java.util.List r6 = (java.util.List) r6
            r2 = r6
        L78:
            kotlin.io.FilePathComponents r4 = new kotlin.io.FilePathComponents
            java.io.File r6 = new java.io.File
            r6.<init>(r3)
            r4.<init>(r6, r2)
            return r4
    }
}
