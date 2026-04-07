package com.getcapacitor;

/* JADX INFO: loaded from: classes3.dex */
public class FileUtils {
    private static java.lang.String CapacitorFileScheme;

    public enum Type extends java.lang.Enum<com.getcapacitor.FileUtils.Type> {
        private static final /* synthetic */ com.getcapacitor.FileUtils.Type[] $VALUES = null;
        public static final com.getcapacitor.FileUtils.Type IMAGE = null;
        private java.lang.String type;

        private static /* synthetic */ com.getcapacitor.FileUtils.Type[] $values() {
                com.getcapacitor.FileUtils$Type r0 = com.getcapacitor.FileUtils.Type.IMAGE
                com.getcapacitor.FileUtils$Type[] r0 = new com.getcapacitor.FileUtils.Type[]{r0}
                return r0
        }

        static {
                com.getcapacitor.FileUtils$Type r0 = new com.getcapacitor.FileUtils$Type
                r1 = 0
                java.lang.String r2 = "image"
                java.lang.String r3 = "IMAGE"
                r0.<init>(r3, r1, r2)
                com.getcapacitor.FileUtils.Type.IMAGE = r0
                com.getcapacitor.FileUtils$Type[] r0 = $values()
                com.getcapacitor.FileUtils.Type.$VALUES = r0
                return
        }

        Type(java.lang.String r1, int r2, java.lang.String r3) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.type = r3
                return
        }

        public static com.getcapacitor.FileUtils.Type valueOf(java.lang.String r1) {
                java.lang.Class<com.getcapacitor.FileUtils$Type> r0 = com.getcapacitor.FileUtils.Type.class
                java.lang.Enum r0 = java.lang.Enum.valueOf(r0, r1)
                com.getcapacitor.FileUtils$Type r0 = (com.getcapacitor.FileUtils.Type) r0
                return r0
        }

        public static com.getcapacitor.FileUtils.Type[] values() {
                com.getcapacitor.FileUtils$Type[] r0 = com.getcapacitor.FileUtils.Type.$VALUES
                java.lang.Object r0 = r0.clone()
                com.getcapacitor.FileUtils$Type[] r0 = (com.getcapacitor.FileUtils.Type[]) r0
                return r0
        }
    }

    static {
            java.lang.String r0 = "/_capacitor_file_"
            com.getcapacitor.FileUtils.CapacitorFileScheme = r0
            return
    }

    public FileUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    private static java.lang.String getCopyFilePath(android.net.Uri r13, android.content.Context r14) {
            android.content.ContentResolver r0 = r14.getContentResolver()
            r4 = 0
            r5 = 0
            r2 = 0
            r3 = 0
            r1 = r13
            android.database.Cursor r13 = r0.query(r1, r2, r3, r4, r5)
            java.lang.String r0 = "_display_name"
            int r2 = r13.getColumnIndex(r0)
            r13.moveToFirst()
            java.lang.String r3 = r13.getString(r2)
            java.lang.String r4 = sanitizeFilename(r3)
            java.io.File r0 = new java.io.File
            java.io.File r5 = r14.getFilesDir()
            r0.<init>(r5, r4)
            r5 = r0
            android.content.ContentResolver r0 = r14.getContentResolver()     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L66
            java.io.InputStream r0 = r0.openInputStream(r1)     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L66
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L66
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L66
            r7 = 0
            r8 = 1048576(0x100000, float:1.469368E-39)
            int r9 = r0.available()     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L66
            int r9 = java.lang.Math.min(r9, r8)     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L66
            byte[] r10 = new byte[r9]     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L66
        L42:
            int r11 = r0.read(r10)     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L66
            r7 = r11
            r12 = -1
            if (r11 == r12) goto L4f
            r11 = 0
            r6.write(r10, r11, r7)     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L66
            goto L42
        L4f:
            r0.close()     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L66
            r6.close()     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L66
            if (r13 == 0) goto L5a
            r13.close()
        L5a:
            java.lang.String r0 = r5.getPath()
            return r0
        L5f:
            r0 = move-exception
            if (r13 == 0) goto L65
            r13.close()
        L65:
            throw r0
        L66:
            r0 = move-exception
            if (r13 == 0) goto L6d
            r13.close()
        L6d:
            r6 = 0
            return r6
    }

    private static java.lang.String getDataColumn(android.content.Context r12, android.net.Uri r13, java.lang.String r14, java.lang.String[] r15) {
            r1 = 0
            r2 = 0
            java.lang.String r3 = "_data"
            r0 = 1
            java.lang.String[] r0 = new java.lang.String[r0]
            r4 = 0
            java.lang.String r5 = "_data"
            r0[r4] = r5
            r8 = r0
            android.content.ContentResolver r6 = r12.getContentResolver()     // Catch: java.lang.Throwable -> L3e java.lang.IllegalArgumentException -> L44
            r11 = 0
            r7 = r13
            r9 = r14
            r10 = r15
            android.database.Cursor r13 = r6.query(r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L38 java.lang.IllegalArgumentException -> L3b
            r2 = r13
            if (r2 == 0) goto L2b
            boolean r13 = r2.moveToFirst()     // Catch: java.lang.Throwable -> L38 java.lang.IllegalArgumentException -> L3b
            if (r13 == 0) goto L2b
            int r13 = r2.getColumnIndexOrThrow(r5)     // Catch: java.lang.Throwable -> L38 java.lang.IllegalArgumentException -> L3b
            java.lang.String r14 = r2.getString(r13)     // Catch: java.lang.Throwable -> L38 java.lang.IllegalArgumentException -> L3b
            r1 = r14
        L2b:
            if (r2 == 0) goto L30
            r2.close()
        L30:
            if (r1 != 0) goto L37
            java.lang.String r13 = getCopyFilePath(r7, r12)
            return r13
        L37:
            return r1
        L38:
            r0 = move-exception
            r13 = r0
            goto L53
        L3b:
            r0 = move-exception
            r13 = r0
            goto L49
        L3e:
            r0 = move-exception
            r7 = r13
            r9 = r14
            r10 = r15
            r13 = r0
            goto L53
        L44:
            r0 = move-exception
            r7 = r13
            r9 = r14
            r10 = r15
            r13 = r0
        L49:
            java.lang.String r14 = getCopyFilePath(r7, r12)     // Catch: java.lang.Throwable -> L38
            if (r2 == 0) goto L52
            r2.close()
        L52:
            return r14
        L53:
            if (r2 == 0) goto L58
            r2.close()
        L58:
            throw r13
    }

    public static java.lang.String getFileUrlForUri(android.content.Context r11, android.net.Uri r12) {
            boolean r0 = android.provider.DocumentsContract.isDocumentUri(r11, r12)
            r1 = 0
            if (r0 == 0) goto Lcd
            boolean r0 = isExternalStorageDocument(r12)
            java.lang.String r2 = ":"
            r3 = 0
            r4 = 1
            if (r0 == 0) goto L6c
            java.lang.String r0 = android.provider.DocumentsContract.getDocumentId(r12)
            java.lang.String[] r2 = r0.split(r2)
            r5 = r2[r3]
            java.lang.String r6 = "primary"
            boolean r6 = r6.equalsIgnoreCase(r5)
            if (r6 == 0) goto L2a
            r1 = r2[r4]
            java.lang.String r1 = legacyPrimaryPath(r1)
            return r1
        L2a:
            r6 = 58
            int r4 = r0.indexOf(r6, r4)
            java.lang.String r3 = r0.substring(r3, r4)
            int r6 = r4 + 1
            java.lang.String r6 = r0.substring(r6)
            java.lang.String r7 = getPathToNonPrimaryVolume(r11, r3)
            if (r7 == 0) goto L6a
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.StringBuilder r8 = r8.append(r7)
            java.lang.String r9 = "/"
            java.lang.StringBuilder r8 = r8.append(r9)
            java.lang.StringBuilder r8 = r8.append(r6)
            java.lang.String r8 = r8.toString()
            java.io.File r9 = new java.io.File
            r9.<init>(r8)
            boolean r10 = r9.exists()
            if (r10 == 0) goto L69
            boolean r10 = r9.canRead()
            if (r10 == 0) goto L69
            return r8
        L69:
            return r1
        L6a:
            goto Lfa
        L6c:
            boolean r0 = isDownloadsDocument(r12)
            if (r0 == 0) goto L8d
            java.lang.String r0 = android.provider.DocumentsContract.getDocumentId(r12)
            java.lang.String r2 = "content://downloads/public_downloads"
            android.net.Uri r2 = android.net.Uri.parse(r2)
            java.lang.Long r3 = java.lang.Long.valueOf(r0)
            long r3 = r3.longValue()
            android.net.Uri r2 = android.content.ContentUris.withAppendedId(r2, r3)
            java.lang.String r1 = getDataColumn(r11, r2, r1, r1)
            return r1
        L8d:
            boolean r0 = isMediaDocument(r12)
            if (r0 == 0) goto Lfa
            java.lang.String r0 = android.provider.DocumentsContract.getDocumentId(r12)
            java.lang.String[] r1 = r0.split(r2)
            r2 = r1[r3]
            r5 = 0
            java.lang.String r6 = "image"
            boolean r6 = r6.equals(r2)
            if (r6 == 0) goto La9
            android.net.Uri r5 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI
            goto Lbe
        La9:
            java.lang.String r6 = "video"
            boolean r6 = r6.equals(r2)
            if (r6 == 0) goto Lb4
            android.net.Uri r5 = android.provider.MediaStore.Video.Media.EXTERNAL_CONTENT_URI
            goto Lbe
        Lb4:
            java.lang.String r6 = "audio"
            boolean r6 = r6.equals(r2)
            if (r6 == 0) goto Lbe
            android.net.Uri r5 = android.provider.MediaStore.Audio.Media.EXTERNAL_CONTENT_URI
        Lbe:
            java.lang.String r6 = "_id=?"
            java.lang.String[] r7 = new java.lang.String[r4]
            r4 = r1[r4]
            r7[r3] = r4
            java.lang.String r3 = "_id=?"
            java.lang.String r3 = getDataColumn(r11, r5, r3, r7)
            return r3
        Lcd:
            java.lang.String r0 = "content"
            java.lang.String r2 = r12.getScheme()
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 == 0) goto Le9
            boolean r0 = isGooglePhotosUri(r12)
            if (r0 == 0) goto Le4
            java.lang.String r0 = r12.getLastPathSegment()
            return r0
        Le4:
            java.lang.String r0 = getDataColumn(r11, r12, r1, r1)
            return r0
        Le9:
            java.lang.String r0 = "file"
            java.lang.String r2 = r12.getScheme()
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 == 0) goto Lfa
            java.lang.String r0 = r12.getPath()
            return r0
        Lfa:
            return r1
    }

    private static java.lang.String getPathToNonPrimaryVolume(android.content.Context r8, java.lang.String r9) {
            java.io.File[] r0 = r8.getExternalCacheDirs()
            if (r0 == 0) goto L35
            int r1 = r0.length
            r2 = 0
            r3 = r2
        L9:
            if (r3 >= r1) goto L35
            r4 = r0[r3]
            if (r4 == 0) goto L32
            java.lang.String r5 = r4.getAbsolutePath()
            if (r5 == 0) goto L32
            int r6 = r5.indexOf(r9)
            r7 = -1
            if (r6 == r7) goto L32
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r5.substring(r2, r6)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r9)
            java.lang.String r1 = r1.toString()
            return r1
        L32:
            int r3 = r3 + 1
            goto L9
        L35:
            r1 = 0
            return r1
    }

    public static java.lang.String getPortablePath(android.content.Context r3, java.lang.String r4, android.net.Uri r5) {
            java.lang.String r0 = getFileUrlForUri(r3, r5)
            java.lang.String r1 = "file://"
            boolean r2 = r0.startsWith(r1)
            if (r2 == 0) goto L12
            java.lang.String r2 = ""
            java.lang.String r0 = r0.replace(r1, r2)
        L12:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r1 = r1.append(r4)
            java.lang.String r2 = "/_capacitor_file_"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r0)
            java.lang.String r1 = r1.toString()
            return r1
    }

    private static boolean isDownloadsDocument(android.net.Uri r2) {
            java.lang.String r0 = "com.android.providers.downloads.documents"
            java.lang.String r1 = r2.getAuthority()
            boolean r0 = r0.equals(r1)
            return r0
    }

    private static boolean isExternalStorageDocument(android.net.Uri r2) {
            java.lang.String r0 = "com.android.externalstorage.documents"
            java.lang.String r1 = r2.getAuthority()
            boolean r0 = r0.equals(r1)
            return r0
    }

    private static boolean isGooglePhotosUri(android.net.Uri r2) {
            java.lang.String r0 = "com.google.android.apps.photos.content"
            java.lang.String r1 = r2.getAuthority()
            boolean r0 = r0.equals(r1)
            return r0
    }

    private static boolean isMediaDocument(android.net.Uri r2) {
            java.lang.String r0 = "com.android.providers.media.documents"
            java.lang.String r1 = r2.getAuthority()
            boolean r0 = r0.equals(r1)
            return r0
    }

    private static java.lang.String legacyPrimaryPath(java.lang.String r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.io.File r1 = android.os.Environment.getExternalStorageDirectory()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "/"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r0 = r0.toString()
            return r0
    }

    static java.lang.String readFileFromAssets(android.content.res.AssetManager r5, java.lang.String r6) throws java.io.IOException {
            java.io.BufferedReader r0 = new java.io.BufferedReader
            java.io.InputStreamReader r1 = new java.io.InputStreamReader
            java.io.InputStream r2 = r5.open(r6)
            r1.<init>(r2)
            r0.<init>(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2c
            r1.<init>()     // Catch: java.lang.Throwable -> L2c
        L13:
            java.lang.String r2 = r0.readLine()     // Catch: java.lang.Throwable -> L2c
            r3 = r2
            if (r2 == 0) goto L24
            java.lang.StringBuilder r2 = r1.append(r3)     // Catch: java.lang.Throwable -> L2c
            java.lang.String r4 = "\n"
            r2.append(r4)     // Catch: java.lang.Throwable -> L2c
            goto L13
        L24:
            java.lang.String r2 = r1.toString()     // Catch: java.lang.Throwable -> L2c
            r0.close()
            return r2
        L2c:
            r1 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L31
            goto L35
        L31:
            r2 = move-exception
            r1.addSuppressed(r2)
        L35:
            throw r1
    }

    static java.lang.String readFileFromDisk(java.io.File r5) throws java.io.IOException {
            java.io.BufferedReader r0 = new java.io.BufferedReader
            java.io.FileReader r1 = new java.io.FileReader
            r1.<init>(r5)
            r0.<init>(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L28
            r1.<init>()     // Catch: java.lang.Throwable -> L28
        Lf:
            java.lang.String r2 = r0.readLine()     // Catch: java.lang.Throwable -> L28
            r3 = r2
            if (r2 == 0) goto L20
            java.lang.StringBuilder r2 = r1.append(r3)     // Catch: java.lang.Throwable -> L28
            java.lang.String r4 = "\n"
            r2.append(r4)     // Catch: java.lang.Throwable -> L28
            goto Lf
        L20:
            java.lang.String r2 = r1.toString()     // Catch: java.lang.Throwable -> L28
            r0.close()
            return r2
        L28:
            r1 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L2d
            goto L31
        L2d:
            r2 = move-exception
            r1.addSuppressed(r2)
        L31:
            throw r1
    }

    private static java.lang.String sanitizeFilename(java.lang.String r7) {
            r0 = 2
            java.lang.String[] r0 = new java.lang.String[r0]
            java.lang.String r1 = ".."
            r2 = 0
            r0[r2] = r1
            r1 = 1
            java.lang.String r3 = "/"
            r0[r1] = r3
            java.lang.String[] r3 = r7.split(r3)
            int r4 = r3.length
            int r4 = r4 - r1
            r1 = r3[r4]
            int r4 = r0.length
        L16:
            if (r2 >= r4) goto L23
            r5 = r0[r2]
            java.lang.String r6 = "_"
            java.lang.String r1 = r1.replace(r5, r6)
            int r2 = r2 + 1
            goto L16
        L23:
            return r1
    }
}
