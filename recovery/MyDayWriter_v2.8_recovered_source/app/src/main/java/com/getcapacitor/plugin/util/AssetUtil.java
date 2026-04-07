package com.getcapacitor.plugin.util;

/* JADX INFO: loaded from: classes4.dex */
public final class AssetUtil {
    public static final int RESOURCE_ID_ZERO_VALUE = 0;
    private static final java.lang.String STORAGE_FOLDER = "/capacitorassets";
    private final android.content.Context context;

    private AssetUtil(android.content.Context r1) {
            r0 = this;
            r0.<init>()
            r0.context = r1
            return
    }

    private void copyFile(java.io.InputStream r5, java.io.FileOutputStream r6) {
            r4 = this;
            r0 = 1024(0x400, float:1.435E-42)
            byte[] r0 = new byte[r0]
        L4:
            int r1 = r5.read(r0)     // Catch: java.lang.Exception -> L18
            r2 = r1
            r3 = -1
            if (r1 == r3) goto L11
            r1 = 0
            r6.write(r0, r1, r2)     // Catch: java.lang.Exception -> L18
            goto L4
        L11:
            r6.flush()     // Catch: java.lang.Exception -> L18
            r6.close()     // Catch: java.lang.Exception -> L18
            goto L1e
        L18:
            r1 = move-exception
            java.lang.String r2 = "Error copying"
            com.getcapacitor.Logger.error(r2, r1)
        L1e:
            return
    }

    private java.lang.String getBaseName(java.lang.String r4) {
            r3 = this;
            r0 = r4
            java.lang.String r1 = "/"
            boolean r1 = r0.contains(r1)
            if (r1 == 0) goto L15
            r1 = 47
            int r1 = r0.lastIndexOf(r1)
            int r1 = r1 + 1
            java.lang.String r0 = r0.substring(r1)
        L15:
            java.lang.String r1 = "."
            boolean r1 = r4.contains(r1)
            if (r1 == 0) goto L28
            r1 = 46
            int r1 = r0.lastIndexOf(r1)
            r2 = 0
            java.lang.String r0 = r0.substring(r2, r1)
        L28:
            return r0
    }

    public static com.getcapacitor.plugin.util.AssetUtil getInstance(android.content.Context r1) {
            com.getcapacitor.plugin.util.AssetUtil r0 = new com.getcapacitor.plugin.util.AssetUtil
            r0.<init>(r1)
            return r0
    }

    private java.lang.String getPkgName(android.content.res.Resources r2) {
            r1 = this;
            android.content.res.Resources r0 = android.content.res.Resources.getSystem()
            if (r2 != r0) goto L9
            java.lang.String r0 = "android"
            goto Lf
        L9:
            android.content.Context r0 = r1.context
            java.lang.String r0 = r0.getPackageName()
        Lf:
            return r0
    }

    private int getResId(android.content.res.Resources r5, java.lang.String r6) {
            r4 = this;
            java.lang.String r0 = r4.getPkgName(r5)
            java.lang.String r1 = r4.getBaseName(r6)
            java.lang.String r2 = "mipmap"
            int r2 = r5.getIdentifier(r1, r2, r0)
            if (r2 != 0) goto L16
            java.lang.String r3 = "drawable"
            int r2 = r5.getIdentifier(r1, r3, r0)
        L16:
            if (r2 != 0) goto L1e
            java.lang.String r3 = "raw"
            int r2 = r5.getIdentifier(r1, r3, r0)
        L1e:
            return r2
    }

    public static java.lang.String getResourceBaseName(java.lang.String r2) {
            if (r2 != 0) goto L4
            r0 = 0
            return r0
        L4:
            java.lang.String r0 = "/"
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto L19
            r0 = 47
            int r0 = r2.lastIndexOf(r0)
            int r0 = r0 + 1
            java.lang.String r0 = r2.substring(r0)
            return r0
        L19:
            java.lang.String r0 = "."
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto L2d
            r0 = 46
            int r0 = r2.lastIndexOf(r0)
            r1 = 0
            java.lang.String r0 = r2.substring(r1, r0)
            return r0
        L2d:
            return r2
    }

    public static int getResourceID(android.content.Context r2, java.lang.String r3, java.lang.String r4) {
            android.content.res.Resources r0 = r2.getResources()
            java.lang.String r1 = r2.getPackageName()
            int r0 = r0.getIdentifier(r3, r4, r1)
            return r0
    }

    private java.io.File getTmpFile() {
            r1 = this;
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r0 = r0.toString()
            java.io.File r0 = r1.getTmpFile(r0)
            return r0
    }

    private java.io.File getTmpFile(java.lang.String r5) {
            r4 = this;
            android.content.Context r0 = r4.context
            java.io.File r0 = r0.getExternalCacheDir()
            if (r0 != 0) goto Le
            android.content.Context r1 = r4.context
            java.io.File r0 = r1.getCacheDir()
        Le:
            if (r0 != 0) goto L23
            r1 = 1
            java.lang.String[] r1 = new java.lang.String[r1]
            r2 = 0
            java.lang.String r3 = "Asset"
            r1[r2] = r3
            java.lang.String r1 = com.getcapacitor.Logger.tags(r1)
            java.lang.String r2 = "Missing cache dir"
            r3 = 0
            com.getcapacitor.Logger.error(r1, r2, r3)
            return r3
        L23:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r0.toString()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = "/capacitorassets"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.io.File r2 = new java.io.File
            r2.<init>(r1)
            r2.mkdir()
            java.io.File r2 = new java.io.File
            r2.<init>(r1, r5)
            return r2
    }

    private android.net.Uri getUriForResourcePath(java.lang.String r6) {
            r5 = this;
            android.content.Context r0 = r5.context
            android.content.res.Resources r0 = r0.getResources()
            java.lang.String r1 = "res://"
            java.lang.String r2 = ""
            java.lang.String r1 = r6.replaceFirst(r1, r2)
            int r2 = r5.getResId(r1)
            if (r2 != 0) goto L2d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "File not found: "
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r3 = r3.append(r1)
            java.lang.String r3 = r3.toString()
            com.getcapacitor.Logger.error(r3)
            android.net.Uri r3 = android.net.Uri.EMPTY
            return r3
        L2d:
            android.net.Uri$Builder r3 = new android.net.Uri$Builder
            r3.<init>()
            java.lang.String r4 = "android.resource"
            android.net.Uri$Builder r3 = r3.scheme(r4)
            java.lang.String r4 = r0.getResourcePackageName(r2)
            android.net.Uri$Builder r3 = r3.authority(r4)
            java.lang.String r4 = r0.getResourceTypeName(r2)
            android.net.Uri$Builder r3 = r3.appendPath(r4)
            java.lang.String r4 = r0.getResourceEntryName(r2)
            android.net.Uri$Builder r3 = r3.appendPath(r4)
            android.net.Uri r3 = r3.build()
            return r3
    }

    private android.net.Uri getUriFromAsset(java.lang.String r7) {
            r6 = this;
            java.lang.String r0 = "file:/"
            java.lang.String r1 = "www"
            java.lang.String r0 = r7.replaceFirst(r0, r1)
            java.lang.String r1 = "\\?.*$"
            java.lang.String r2 = ""
            java.lang.String r0 = r0.replaceFirst(r1, r2)
            r1 = 47
            int r1 = r0.lastIndexOf(r1)
            int r1 = r1 + 1
            java.lang.String r1 = r0.substring(r1)
            java.io.File r2 = r6.getTmpFile(r1)
            if (r2 != 0) goto L25
            android.net.Uri r3 = android.net.Uri.EMPTY
            return r3
        L25:
            android.content.Context r3 = r6.context     // Catch: java.lang.Exception -> L3d
            android.content.res.AssetManager r3 = r3.getAssets()     // Catch: java.lang.Exception -> L3d
            java.io.InputStream r4 = r3.open(r0)     // Catch: java.lang.Exception -> L3d
            java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch: java.lang.Exception -> L3d
            r5.<init>(r2)     // Catch: java.lang.Exception -> L3d
            r6.copyFile(r4, r5)     // Catch: java.lang.Exception -> L3d
            android.net.Uri r3 = r6.getUriFromFile(r2)
            return r3
        L3d:
            r3 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "File not found: assets/"
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.StringBuilder r4 = r4.append(r0)
            java.lang.String r4 = r4.toString()
            com.getcapacitor.Logger.error(r4)
            android.net.Uri r4 = android.net.Uri.EMPTY
            return r4
    }

    private android.net.Uri getUriFromFile(java.io.File r3) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.IllegalArgumentException -> L20
            r0.<init>()     // Catch: java.lang.IllegalArgumentException -> L20
            android.content.Context r1 = r2.context     // Catch: java.lang.IllegalArgumentException -> L20
            java.lang.String r1 = r1.getPackageName()     // Catch: java.lang.IllegalArgumentException -> L20
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.IllegalArgumentException -> L20
            java.lang.String r1 = ".provider"
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.IllegalArgumentException -> L20
            java.lang.String r0 = r0.toString()     // Catch: java.lang.IllegalArgumentException -> L20
            android.content.Context r1 = r2.context     // Catch: java.lang.IllegalArgumentException -> L20
            android.net.Uri r1 = androidx.core.content.FileProvider.getUriForFile(r1, r0, r3)     // Catch: java.lang.IllegalArgumentException -> L20
            return r1
        L20:
            r0 = move-exception
            java.lang.String r1 = "File not supported by provider"
            com.getcapacitor.Logger.error(r1, r0)
            android.net.Uri r1 = android.net.Uri.EMPTY
            return r1
    }

    private android.net.Uri getUriFromPath(java.lang.String r5) {
            r4 = this;
            java.lang.String r0 = "file://"
            java.lang.String r1 = ""
            java.lang.String r0 = r5.replaceFirst(r0, r1)
            java.lang.String r2 = "\\?.*$"
            java.lang.String r0 = r0.replaceFirst(r2, r1)
            java.io.File r1 = new java.io.File
            r1.<init>(r0)
            boolean r2 = r1.exists()
            if (r2 != 0) goto L36
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "File not found: "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = r1.getAbsolutePath()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.getcapacitor.Logger.error(r2)
            android.net.Uri r2 = android.net.Uri.EMPTY
            return r2
        L36:
            android.net.Uri r2 = r4.getUriFromFile(r1)
            return r2
    }

    private android.net.Uri getUriFromRemote(java.lang.String r10) {
            r9 = this;
            java.lang.String r0 = "Asset"
            java.io.File r1 = r9.getTmpFile()
            if (r1 != 0) goto Lb
            android.net.Uri r0 = android.net.Uri.EMPTY
            return r0
        Lb:
            r2 = 0
            r3 = 1
            java.net.URL r4 = new java.net.URL     // Catch: java.io.IOException -> L48 java.io.FileNotFoundException -> L57 java.net.MalformedURLException -> L66
            r4.<init>(r10)     // Catch: java.io.IOException -> L48 java.io.FileNotFoundException -> L57 java.net.MalformedURLException -> L66
            java.net.URLConnection r5 = r4.openConnection()     // Catch: java.io.IOException -> L48 java.io.FileNotFoundException -> L57 java.net.MalformedURLException -> L66
            java.net.HttpURLConnection r5 = (java.net.HttpURLConnection) r5     // Catch: java.io.IOException -> L48 java.io.FileNotFoundException -> L57 java.net.MalformedURLException -> L66
            android.os.StrictMode$ThreadPolicy$Builder r6 = new android.os.StrictMode$ThreadPolicy$Builder     // Catch: java.io.IOException -> L48 java.io.FileNotFoundException -> L57 java.net.MalformedURLException -> L66
            r6.<init>()     // Catch: java.io.IOException -> L48 java.io.FileNotFoundException -> L57 java.net.MalformedURLException -> L66
            android.os.StrictMode$ThreadPolicy$Builder r6 = r6.permitAll()     // Catch: java.io.IOException -> L48 java.io.FileNotFoundException -> L57 java.net.MalformedURLException -> L66
            android.os.StrictMode$ThreadPolicy r6 = r6.build()     // Catch: java.io.IOException -> L48 java.io.FileNotFoundException -> L57 java.net.MalformedURLException -> L66
            android.os.StrictMode.setThreadPolicy(r6)     // Catch: java.io.IOException -> L48 java.io.FileNotFoundException -> L57 java.net.MalformedURLException -> L66
            java.lang.String r7 = "Connection"
            java.lang.String r8 = "close"
            r5.setRequestProperty(r7, r8)     // Catch: java.io.IOException -> L48 java.io.FileNotFoundException -> L57 java.net.MalformedURLException -> L66
            r7 = 5000(0x1388, float:7.006E-42)
            r5.setConnectTimeout(r7)     // Catch: java.io.IOException -> L48 java.io.FileNotFoundException -> L57 java.net.MalformedURLException -> L66
            r5.connect()     // Catch: java.io.IOException -> L48 java.io.FileNotFoundException -> L57 java.net.MalformedURLException -> L66
            java.io.InputStream r7 = r5.getInputStream()     // Catch: java.io.IOException -> L48 java.io.FileNotFoundException -> L57 java.net.MalformedURLException -> L66
            java.io.FileOutputStream r8 = new java.io.FileOutputStream     // Catch: java.io.IOException -> L48 java.io.FileNotFoundException -> L57 java.net.MalformedURLException -> L66
            r8.<init>(r1)     // Catch: java.io.IOException -> L48 java.io.FileNotFoundException -> L57 java.net.MalformedURLException -> L66
            r9.copyFile(r7, r8)     // Catch: java.io.IOException -> L48 java.io.FileNotFoundException -> L57 java.net.MalformedURLException -> L66
            android.net.Uri r0 = r9.getUriFromFile(r1)     // Catch: java.io.IOException -> L48 java.io.FileNotFoundException -> L57 java.net.MalformedURLException -> L66
            return r0
        L48:
            r4 = move-exception
            java.lang.String[] r3 = new java.lang.String[r3]
            r3[r2] = r0
            java.lang.String r0 = com.getcapacitor.Logger.tags(r3)
            java.lang.String r2 = "No Input can be created from http Stream"
            com.getcapacitor.Logger.error(r0, r2, r4)
            goto L75
        L57:
            r4 = move-exception
            java.lang.String[] r3 = new java.lang.String[r3]
            r3[r2] = r0
            java.lang.String r0 = com.getcapacitor.Logger.tags(r3)
            java.lang.String r2 = "Failed to create new File from HTTP Content"
            com.getcapacitor.Logger.error(r0, r2, r4)
            goto L74
        L66:
            r4 = move-exception
            java.lang.String[] r3 = new java.lang.String[r3]
            r3[r2] = r0
            java.lang.String r0 = com.getcapacitor.Logger.tags(r3)
            java.lang.String r2 = "Incorrect URL"
            com.getcapacitor.Logger.error(r0, r2, r4)
        L74:
        L75:
            android.net.Uri r0 = android.net.Uri.EMPTY
            return r0
    }

    public android.graphics.Bitmap getIconFromUri(android.net.Uri r3) throws java.io.IOException {
            r2 = this;
            android.content.Context r0 = r2.context
            android.content.ContentResolver r0 = r0.getContentResolver()
            java.io.InputStream r0 = r0.openInputStream(r3)
            android.graphics.Bitmap r1 = android.graphics.BitmapFactory.decodeStream(r0)
            return r1
    }

    public int getResId(java.lang.String r3) {
            r2 = this;
            android.content.Context r0 = r2.context
            android.content.res.Resources r0 = r0.getResources()
            int r0 = r2.getResId(r0, r3)
            if (r0 != 0) goto L14
            android.content.res.Resources r1 = android.content.res.Resources.getSystem()
            int r0 = r2.getResId(r1, r3)
        L14:
            return r0
    }

    public android.net.Uri parse(java.lang.String r2) {
            r1 = this;
            if (r2 == 0) goto L4d
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L9
            goto L4d
        L9:
            java.lang.String r0 = "res:"
            boolean r0 = r2.startsWith(r0)
            if (r0 == 0) goto L16
            android.net.Uri r0 = r1.getUriForResourcePath(r2)
            return r0
        L16:
            java.lang.String r0 = "file:///"
            boolean r0 = r2.startsWith(r0)
            if (r0 == 0) goto L23
            android.net.Uri r0 = r1.getUriFromPath(r2)
            return r0
        L23:
            java.lang.String r0 = "file://"
            boolean r0 = r2.startsWith(r0)
            if (r0 == 0) goto L30
            android.net.Uri r0 = r1.getUriFromAsset(r2)
            return r0
        L30:
            java.lang.String r0 = "http"
            boolean r0 = r2.startsWith(r0)
            if (r0 == 0) goto L3d
            android.net.Uri r0 = r1.getUriFromRemote(r2)
            return r0
        L3d:
            java.lang.String r0 = "content://"
            boolean r0 = r2.startsWith(r0)
            if (r0 == 0) goto L4a
            android.net.Uri r0 = android.net.Uri.parse(r2)
            return r0
        L4a:
            android.net.Uri r0 = android.net.Uri.EMPTY
            return r0
        L4d:
            android.net.Uri r0 = android.net.Uri.EMPTY
            return r0
    }
}
