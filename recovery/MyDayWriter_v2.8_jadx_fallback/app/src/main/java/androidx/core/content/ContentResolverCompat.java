package androidx.core.content;

/* JADX INFO: loaded from: classes.dex */
public final class ContentResolverCompat {
    private ContentResolverCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static android.database.Cursor query(android.content.ContentResolver r2, android.net.Uri r3, java.lang.String[] r4, java.lang.String r5, java.lang.String[] r6, java.lang.String r7, android.os.CancellationSignal r8) {
            android.database.Cursor r0 = r2.query(r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Exception -> L5
            return r0
        L5:
            r0 = move-exception
            boolean r1 = r0 instanceof android.os.OperationCanceledException
            if (r1 == 0) goto L10
            androidx.core.os.OperationCanceledException r1 = new androidx.core.os.OperationCanceledException
            r1.<init>()
            throw r1
        L10:
            throw r0
    }

    @java.lang.Deprecated
    public static android.database.Cursor query(android.content.ContentResolver r8, android.net.Uri r9, java.lang.String[] r10, java.lang.String r11, java.lang.String[] r12, java.lang.String r13, androidx.core.os.CancellationSignal r14) {
            if (r14 == 0) goto Lb
            java.lang.Object r0 = r14.getCancellationSignalObject()
            android.os.CancellationSignal r0 = (android.os.CancellationSignal) r0
            r7 = r0
            goto Ld
        Lb:
            r0 = 0
            r7 = r0
        Ld:
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            android.database.Cursor r8 = query(r1, r2, r3, r4, r5, r6, r7)
            return r8
    }
}
