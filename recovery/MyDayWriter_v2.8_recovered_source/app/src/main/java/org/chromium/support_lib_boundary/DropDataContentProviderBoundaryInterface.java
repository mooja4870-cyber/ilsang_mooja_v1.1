package org.chromium.support_lib_boundary;

/* JADX INFO: loaded from: classes7.dex */
@org.jspecify.annotations.NullMarked
public interface DropDataContentProviderBoundaryInterface {
    android.net.Uri cache(byte[] r1, java.lang.String r2, java.lang.String r3);

    android.os.Bundle call(java.lang.String r1, java.lang.String r2, android.os.Bundle r3);

    java.lang.String[] getStreamTypes(android.net.Uri r1, java.lang.String r2);

    java.lang.String getType(android.net.Uri r1);

    boolean onCreate();

    void onDragEnd(boolean r1);

    android.os.ParcelFileDescriptor openFile(android.content.ContentProvider r1, android.net.Uri r2) throws java.io.FileNotFoundException;

    android.database.Cursor query(android.net.Uri r1, java.lang.String[] r2, java.lang.String r3, java.lang.String[] r4, java.lang.String r5);

    void setClearCachedDataIntervalMs(int r1);
}
