package androidx.core.net;

/* JADX INFO: compiled from: Uri.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\r\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0086\b\u001a\r\u0010\u0000\u001a\u00020\u0001*\u00020\u0003H\u0086\b\u001a\n\u0010\u0004\u001a\u00020\u0003*\u00020\u0001¨\u0006\u0005"}, d2 = {"toUri", "Landroid/net/Uri;", "", "Ljava/io/File;", "toFile", "core-ktx_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class UriKt {
    public static final java.io.File toFile(android.net.Uri r3) {
            java.lang.String r0 = r3.getScheme()
            java.lang.String r1 = "file"
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L36
            java.lang.String r0 = r3.getPath()
            if (r0 == 0) goto L18
            java.io.File r1 = new java.io.File
            r1.<init>(r0)
            return r1
        L18:
            r0 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Uri path is null: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r0 = r1.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L36:
            r0 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Uri lacks 'file' scheme: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r0 = r1.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
    }

    public static final android.net.Uri toUri(java.io.File r2) {
            r0 = 0
            android.net.Uri r1 = android.net.Uri.fromFile(r2)
            return r1
    }

    public static final android.net.Uri toUri(java.lang.String r2) {
            r0 = 0
            android.net.Uri r1 = android.net.Uri.parse(r2)
            return r1
    }
}
