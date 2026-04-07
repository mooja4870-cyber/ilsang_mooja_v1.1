package androidx.core.util;

/* JADX INFO: compiled from: AtomicFile.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a0\u0010\u0000\u001a\u00020\u0001*\u00020\u00022!\u0010\u0003\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\u00010\u0004H\u0086\b\u001a\u0012\u0010\t\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\n\u001a\u00020\u000b\u001a\u001c\u0010\f\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u001a\r\u0010\u0011\u001a\u00020\u000b*\u00020\u0002H\u0086\b\u001a\u0014\u0010\u0012\u001a\u00020\u000e*\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u0010¨\u0006\u0013"}, d2 = {"tryWrite", "", "Landroid/util/AtomicFile;", "block", "Lkotlin/Function1;", "Ljava/io/FileOutputStream;", "Lkotlin/ParameterName;", "name", "out", "writeBytes", "array", "", "writeText", "text", "", "charset", "Ljava/nio/charset/Charset;", "readBytes", "readText", "core-ktx_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class AtomicFileKt {
    public static final byte[] readBytes(android.util.AtomicFile r2) {
            r0 = 0
            byte[] r1 = r2.readFully()
            return r1
    }

    public static final java.lang.String readText(android.util.AtomicFile r2, java.nio.charset.Charset r3) {
            java.lang.String r0 = new java.lang.String
            byte[] r1 = r2.readFully()
            r0.<init>(r1, r3)
            return r0
    }

    public static /* synthetic */ java.lang.String readText$default(android.util.AtomicFile r0, java.nio.charset.Charset r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L6
            java.nio.charset.Charset r1 = kotlin.text.Charsets.UTF_8
        L6:
            java.lang.String r0 = readText(r0, r1)
            return r0
    }

    public static final void tryWrite(android.util.AtomicFile r4, kotlin.jvm.functions.Function1<? super java.io.FileOutputStream, kotlin.Unit> r5) {
            r0 = 0
            java.io.FileOutputStream r1 = r4.startWrite()
            r2 = 0
            r5.invoke(r1)     // Catch: java.lang.Throwable -> L11
            r2 = 1
            r4.finishWrite(r1)
            return
        L11:
            r3 = move-exception
            r4.failWrite(r1)
            throw r3
    }

    public static final void writeBytes(android.util.AtomicFile r6, byte[] r7) {
            r0 = r6
            r1 = 0
            java.io.FileOutputStream r2 = r0.startWrite()
            r3 = 0
            r4 = r2
            r5 = 0
            r4.write(r7)     // Catch: java.lang.Throwable -> L16
            r3 = 1
            r0.finishWrite(r2)
            return
        L16:
            r4 = move-exception
            r0.failWrite(r2)
            throw r4
    }

    public static final void writeText(android.util.AtomicFile r2, java.lang.String r3, java.nio.charset.Charset r4) {
            byte[] r0 = r3.getBytes(r4)
            java.lang.String r1 = "getBytes(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            writeBytes(r2, r0)
            return
    }

    public static /* synthetic */ void writeText$default(android.util.AtomicFile r0, java.lang.String r1, java.nio.charset.Charset r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L6
            java.nio.charset.Charset r2 = kotlin.text.Charsets.UTF_8
        L6:
            writeText(r0, r1, r2)
            return
    }
}
