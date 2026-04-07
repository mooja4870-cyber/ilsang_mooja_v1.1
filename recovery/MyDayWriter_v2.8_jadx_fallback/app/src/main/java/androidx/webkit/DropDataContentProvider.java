package androidx.webkit;

/* JADX INFO: loaded from: classes.dex */
public final class DropDataContentProvider extends android.content.ContentProvider {
    org.chromium.support_lib_boundary.DropDataContentProviderBoundaryInterface mImpl;

    public DropDataContentProvider() {
            r0 = this;
            r0.<init>()
            return
    }

    private org.chromium.support_lib_boundary.DropDataContentProviderBoundaryInterface getDropImpl() {
            r1 = this;
            org.chromium.support_lib_boundary.DropDataContentProviderBoundaryInterface r0 = r1.mImpl
            if (r0 != 0) goto L13
            androidx.webkit.internal.WebViewProviderFactory r0 = androidx.webkit.internal.WebViewGlueCommunicator.getFactory()
            org.chromium.support_lib_boundary.DropDataContentProviderBoundaryInterface r0 = r0.getDropDataProvider()
            r1.mImpl = r0
            org.chromium.support_lib_boundary.DropDataContentProviderBoundaryInterface r0 = r1.mImpl
            r0.onCreate()
        L13:
            org.chromium.support_lib_boundary.DropDataContentProviderBoundaryInterface r0 = r1.mImpl
            return r0
    }

    @Override // android.content.ContentProvider
    public android.os.Bundle call(java.lang.String r2, java.lang.String r3, android.os.Bundle r4) {
            r1 = this;
            org.chromium.support_lib_boundary.DropDataContentProviderBoundaryInterface r0 = r1.getDropImpl()
            android.os.Bundle r0 = r0.call(r2, r3, r4)
            return r0
    }

    @Override // android.content.ContentProvider
    public int delete(android.net.Uri r3, java.lang.String r4, java.lang.String[] r5) {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "delete method is not supported."
            r0.<init>(r1)
            throw r0
    }

    @Override // android.content.ContentProvider
    public java.lang.String getType(android.net.Uri r2) {
            r1 = this;
            org.chromium.support_lib_boundary.DropDataContentProviderBoundaryInterface r0 = r1.getDropImpl()
            java.lang.String r0 = r0.getType(r2)
            return r0
    }

    @Override // android.content.ContentProvider
    public android.net.Uri insert(android.net.Uri r3, android.content.ContentValues r4) {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Insert method is not supported."
            r0.<init>(r1)
            throw r0
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // android.content.ContentProvider
    public android.os.ParcelFileDescriptor openFile(android.net.Uri r2, java.lang.String r3) throws java.io.FileNotFoundException {
            r1 = this;
            org.chromium.support_lib_boundary.DropDataContentProviderBoundaryInterface r0 = r1.getDropImpl()
            android.os.ParcelFileDescriptor r0 = r0.openFile(r1, r2)
            return r0
    }

    @Override // android.content.ContentProvider
    public android.database.Cursor query(android.net.Uri r7, java.lang.String[] r8, java.lang.String r9, java.lang.String[] r10, java.lang.String r11) {
            r6 = this;
            org.chromium.support_lib_boundary.DropDataContentProviderBoundaryInterface r0 = r6.getDropImpl()
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            android.database.Cursor r7 = r0.query(r1, r2, r3, r4, r5)
            return r7
    }

    @Override // android.content.ContentProvider
    public int update(android.net.Uri r3, android.content.ContentValues r4, java.lang.String r5, java.lang.String[] r6) {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "update method is not supported."
            r0.<init>(r1)
            throw r0
    }
}
