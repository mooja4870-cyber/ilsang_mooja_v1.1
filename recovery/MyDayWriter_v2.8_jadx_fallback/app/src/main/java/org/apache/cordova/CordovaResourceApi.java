package org.apache.cordova;

/* JADX INFO: loaded from: classes7.dex */
public class CordovaResourceApi {
    private static final java.lang.String[] LOCAL_FILE_PROJECTION = null;
    private static final java.lang.String LOG_TAG = "CordovaResourceApi";
    public static final java.lang.String PLUGIN_URI_SCHEME = "cdvplugin";
    public static final int URI_TYPE_ASSET = 1;
    public static final int URI_TYPE_CONTENT = 2;
    public static final int URI_TYPE_DATA = 4;
    public static final int URI_TYPE_FILE = 0;
    public static final int URI_TYPE_HTTP = 5;
    public static final int URI_TYPE_HTTPS = 6;
    public static final int URI_TYPE_PLUGIN = 7;
    public static final int URI_TYPE_RESOURCE = 3;
    public static final int URI_TYPE_UNKNOWN = -1;
    public static java.lang.Thread jsThread;
    private final android.content.res.AssetManager assetManager;
    private final android.content.ContentResolver contentResolver;
    private final org.apache.cordova.PluginManager pluginManager;
    private boolean threadCheckingEnabled;

    public static final class OpenForReadResult {
        public final android.content.res.AssetFileDescriptor assetFd;
        public final java.io.InputStream inputStream;
        public final long length;
        public final java.lang.String mimeType;
        public final android.net.Uri uri;

        public OpenForReadResult(android.net.Uri r1, java.io.InputStream r2, java.lang.String r3, long r4, android.content.res.AssetFileDescriptor r6) {
                r0 = this;
                r0.<init>()
                r0.uri = r1
                r0.inputStream = r2
                r0.mimeType = r3
                r0.length = r4
                r0.assetFd = r6
                return
        }
    }

    static {
            r0 = 1
            java.lang.String[] r0 = new java.lang.String[r0]
            r1 = 0
            java.lang.String r2 = "_data"
            r0[r1] = r2
            org.apache.cordova.CordovaResourceApi.LOCAL_FILE_PROJECTION = r0
            return
    }

    public CordovaResourceApi(android.content.Context r2, org.apache.cordova.PluginManager r3) {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.threadCheckingEnabled = r0
            android.content.ContentResolver r0 = r2.getContentResolver()
            r1.contentResolver = r0
            android.content.res.AssetManager r0 = r2.getAssets()
            r1.assetManager = r0
            r1.pluginManager = r3
            return
    }

    private void assertBackgroundThread() {
            r3 = this;
            boolean r0 = r3.threadCheckingEnabled
            if (r0 == 0) goto L27
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            java.lang.Thread r1 = r1.getThread()
            if (r0 == r1) goto L1f
            java.lang.Thread r1 = org.apache.cordova.CordovaResourceApi.jsThread
            if (r0 == r1) goto L17
            goto L27
        L17:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Tried to perform an IO operation on the WebCore thread. Use CordovaInterface.getThreadPool() instead."
            r1.<init>(r2)
            throw r1
        L1f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Do not perform IO operations on the UI thread. Use CordovaInterface.getThreadPool() instead."
            r1.<init>(r2)
            throw r1
        L27:
            return
    }

    private static void assertNonRelative(android.net.Uri r2) {
            boolean r0 = r2.isAbsolute()
            if (r0 == 0) goto L7
            return
        L7:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Relative URIs are not supported."
            r0.<init>(r1)
            throw r0
    }

    private java.lang.String getDataUriMimeType(android.net.Uri r7) {
            r6 = this;
            java.lang.String r0 = r7.getSchemeSpecificPart()
            r1 = 44
            int r1 = r0.indexOf(r1)
            r2 = -1
            r3 = 0
            if (r1 != r2) goto Lf
            return r3
        Lf:
            r2 = 0
            java.lang.String r4 = r0.substring(r2, r1)
            java.lang.String r5 = ";"
            java.lang.String[] r4 = r4.split(r5)
            int r5 = r4.length
            if (r5 <= 0) goto L20
            r2 = r4[r2]
            return r2
        L20:
            return r3
    }

    private java.lang.String getMimeTypeFromPath(java.lang.String r4) {
            r3 = this;
            r0 = r4
            r1 = 46
            int r1 = r0.lastIndexOf(r1)
            r2 = -1
            if (r1 == r2) goto L10
            int r2 = r1 + 1
            java.lang.String r0 = r0.substring(r2)
        L10:
            java.util.Locale r2 = java.util.Locale.getDefault()
            java.lang.String r0 = r0.toLowerCase(r2)
            java.lang.String r2 = "3ga"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L23
            java.lang.String r2 = "audio/3gpp"
            return r2
        L23:
            java.lang.String r2 = "js"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L2e
            java.lang.String r2 = "text/javascript"
            return r2
        L2e:
            android.webkit.MimeTypeMap r2 = android.webkit.MimeTypeMap.getSingleton()
            java.lang.String r2 = r2.getMimeTypeFromExtension(r0)
            return r2
    }

    public static int getUriType(android.net.Uri r3) {
            assertNonRelative(r3)
            java.lang.String r0 = r3.getScheme()
            java.lang.String r1 = "content"
            boolean r1 = r1.equalsIgnoreCase(r0)
            if (r1 == 0) goto L11
            r1 = 2
            return r1
        L11:
            java.lang.String r1 = "android.resource"
            boolean r1 = r1.equalsIgnoreCase(r0)
            if (r1 == 0) goto L1b
            r1 = 3
            return r1
        L1b:
            java.lang.String r1 = "file"
            boolean r1 = r1.equalsIgnoreCase(r0)
            if (r1 == 0) goto L33
            java.lang.String r1 = r3.getPath()
            java.lang.String r2 = "/android_asset/"
            boolean r1 = r1.startsWith(r2)
            if (r1 == 0) goto L31
            r1 = 1
            return r1
        L31:
            r1 = 0
            return r1
        L33:
            java.lang.String r1 = "data"
            boolean r1 = r1.equalsIgnoreCase(r0)
            if (r1 == 0) goto L3d
            r1 = 4
            return r1
        L3d:
            java.lang.String r1 = "http"
            boolean r1 = r1.equalsIgnoreCase(r0)
            if (r1 == 0) goto L47
            r1 = 5
            return r1
        L47:
            java.lang.String r1 = "https"
            boolean r1 = r1.equalsIgnoreCase(r0)
            if (r1 == 0) goto L51
            r1 = 6
            return r1
        L51:
            java.lang.String r1 = "cdvplugin"
            boolean r1 = r1.equalsIgnoreCase(r0)
            if (r1 == 0) goto L5b
            r1 = 7
            return r1
        L5b:
            r1 = -1
            return r1
    }

    private org.apache.cordova.CordovaResourceApi.OpenForReadResult readDataUri(android.net.Uri r14) {
            r13 = this;
            java.lang.String r1 = r14.getSchemeSpecificPart()
            r0 = 44
            int r2 = r1.indexOf(r0)
            r0 = -1
            if (r2 != r0) goto Lf
            r0 = 0
            return r0
        Lf:
            r0 = 0
            java.lang.String r3 = r1.substring(r0, r2)
            java.lang.String r4 = ";"
            java.lang.String[] r3 = r3.split(r4)
            r4 = 0
            r5 = 0
            int r6 = r3.length
            if (r6 <= 0) goto L23
            r4 = r3[r0]
            r9 = r4
            goto L24
        L23:
            r9 = r4
        L24:
            r4 = 1
        L25:
            int r6 = r3.length
            if (r4 >= r6) goto L36
            java.lang.String r6 = "base64"
            r7 = r3[r4]
            boolean r6 = r6.equalsIgnoreCase(r7)
            if (r6 == 0) goto L33
            r5 = 1
        L33:
            int r4 = r4 + 1
            goto L25
        L36:
            int r4 = r2 + 1
            java.lang.String r4 = r1.substring(r4)
            if (r5 == 0) goto L43
            byte[] r0 = android.util.Base64.decode(r4, r0)
            goto L50
        L43:
            java.lang.String r0 = "UTF-8"
            byte[] r0 = r4.getBytes(r0)     // Catch: java.io.UnsupportedEncodingException -> L4a
            goto L50
        L4a:
            r0 = move-exception
            byte[] r6 = r4.getBytes()
            r0 = r6
        L50:
            java.io.ByteArrayInputStream r8 = new java.io.ByteArrayInputStream
            r8.<init>(r0)
            org.apache.cordova.CordovaResourceApi$OpenForReadResult r6 = new org.apache.cordova.CordovaResourceApi$OpenForReadResult
            int r7 = r0.length
            long r10 = (long) r7
            r12 = 0
            r7 = r14
            r6.<init>(r7, r8, r9, r10, r12)
            return r6
    }

    public void copyResource(android.net.Uri r3, android.net.Uri r4) throws java.io.IOException {
            r2 = this;
            org.apache.cordova.CordovaResourceApi$OpenForReadResult r0 = r2.openForRead(r3)
            java.io.OutputStream r1 = r2.openOutputStream(r4)
            r2.copyResource(r0, r1)
            return
    }

    public void copyResource(android.net.Uri r2, java.io.OutputStream r3) throws java.io.IOException {
            r1 = this;
            org.apache.cordova.CordovaResourceApi$OpenForReadResult r0 = r1.openForRead(r2)
            r1.copyResource(r0, r3)
            return
    }

    public void copyResource(org.apache.cordova.CordovaResourceApi.OpenForReadResult r11, java.io.OutputStream r12) throws java.io.IOException {
            r10 = this;
            r10.assertBackgroundThread()
            java.io.InputStream r0 = r11.inputStream     // Catch: java.lang.Throwable -> L55
            boolean r1 = r0 instanceof java.io.FileInputStream     // Catch: java.lang.Throwable -> L55
            if (r1 == 0) goto L38
            boolean r1 = r12 instanceof java.io.FileOutputStream     // Catch: java.lang.Throwable -> L55
            if (r1 == 0) goto L38
            java.io.InputStream r1 = r11.inputStream     // Catch: java.lang.Throwable -> L55
            java.io.FileInputStream r1 = (java.io.FileInputStream) r1     // Catch: java.lang.Throwable -> L55
            java.nio.channels.FileChannel r1 = r1.getChannel()     // Catch: java.lang.Throwable -> L55
            r3 = r1
            r1 = r12
            java.io.FileOutputStream r1 = (java.io.FileOutputStream) r1     // Catch: java.lang.Throwable -> L55
            java.nio.channels.FileChannel r2 = r1.getChannel()     // Catch: java.lang.Throwable -> L55
            r4 = 0
            long r6 = r11.length     // Catch: java.lang.Throwable -> L55
            android.content.res.AssetFileDescriptor r1 = r11.assetFd     // Catch: java.lang.Throwable -> L55
            if (r1 == 0) goto L2d
            android.content.res.AssetFileDescriptor r1 = r11.assetFd     // Catch: java.lang.Throwable -> L55
            long r8 = r1.getStartOffset()     // Catch: java.lang.Throwable -> L55
            r4 = r8
            goto L2e
        L2d:
            r8 = r4
        L2e:
            r3.position(r8)     // Catch: java.lang.Throwable -> L55
            r4 = 0
            r2.transferFrom(r3, r4, r6)     // Catch: java.lang.Throwable -> L55
            goto L46
        L38:
            r1 = 8192(0x2000, float:1.148E-41)
            r2 = 8192(0x2000, float:1.148E-41)
            byte[] r3 = new byte[r2]     // Catch: java.lang.Throwable -> L55
        L3e:
            r4 = 0
            int r5 = r0.read(r3, r4, r2)     // Catch: java.lang.Throwable -> L55
            if (r5 > 0) goto L51
        L46:
            java.io.InputStream r0 = r11.inputStream
            r0.close()
            if (r12 == 0) goto L50
            r12.close()
        L50:
            return
        L51:
            r12.write(r3, r4, r5)     // Catch: java.lang.Throwable -> L55
            goto L3e
        L55:
            r0 = move-exception
            java.io.InputStream r1 = r11.inputStream
            r1.close()
            if (r12 == 0) goto L60
            r12.close()
        L60:
            throw r0
    }

    public java.net.HttpURLConnection createHttpConnection(android.net.Uri r3) throws java.io.IOException {
            r2 = this;
            r2.assertBackgroundThread()
            java.net.URL r0 = new java.net.URL
            java.lang.String r1 = r3.toString()
            r0.<init>(r1)
            java.net.URLConnection r0 = r0.openConnection()
            java.net.HttpURLConnection r0 = (java.net.HttpURLConnection) r0
            return r0
    }

    public java.lang.String getMimeType(android.net.Uri r5) {
            r4 = this;
            int r0 = getUriType(r5)
            switch(r0) {
                case 0: goto L40;
                case 1: goto L40;
                case 2: goto L39;
                case 3: goto L39;
                case 4: goto L34;
                case 5: goto L8;
                case 6: goto L8;
                default: goto L7;
            }
        L7:
            goto L49
        L8:
            java.net.URL r0 = new java.net.URL     // Catch: java.io.IOException -> L32
            java.lang.String r1 = r5.toString()     // Catch: java.io.IOException -> L32
            r0.<init>(r1)     // Catch: java.io.IOException -> L32
            java.net.URLConnection r0 = r0.openConnection()     // Catch: java.io.IOException -> L32
            java.net.HttpURLConnection r0 = (java.net.HttpURLConnection) r0     // Catch: java.io.IOException -> L32
            r1 = 0
            r0.setDoInput(r1)     // Catch: java.io.IOException -> L32
            java.lang.String r2 = "HEAD"
            r0.setRequestMethod(r2)     // Catch: java.io.IOException -> L32
            java.lang.String r2 = "Content-Type"
            java.lang.String r2 = r0.getHeaderField(r2)     // Catch: java.io.IOException -> L32
            if (r2 == 0) goto L31
            java.lang.String r3 = ";"
            java.lang.String[] r3 = r2.split(r3)     // Catch: java.io.IOException -> L32
            r1 = r3[r1]     // Catch: java.io.IOException -> L32
            r2 = r1
        L31:
            return r2
        L32:
            r0 = move-exception
            goto L49
        L34:
            java.lang.String r0 = r4.getDataUriMimeType(r5)
            return r0
        L39:
            android.content.ContentResolver r0 = r4.contentResolver
            java.lang.String r0 = r0.getType(r5)
            return r0
        L40:
            java.lang.String r0 = r5.getPath()
            java.lang.String r0 = r4.getMimeTypeFromPath(r0)
            return r0
        L49:
            r0 = 0
            return r0
    }

    public boolean isThreadCheckingEnabled() {
            r1 = this;
            boolean r0 = r1.threadCheckingEnabled
            return r0
    }

    public java.io.File mapUriToFile(android.net.Uri r8) {
            r7 = this;
            r7.assertBackgroundThread()
            int r0 = getUriType(r8)
            switch(r0) {
                case 0: goto L47;
                case 1: goto La;
                case 2: goto Lc;
                default: goto La;
            }
        La:
            r2 = r8
            goto L52
        Lc:
            android.content.ContentResolver r1 = r7.contentResolver
            java.lang.String[] r3 = org.apache.cordova.CordovaResourceApi.LOCAL_FILE_PROJECTION
            r5 = 0
            r6 = 0
            r4 = 0
            r2 = r8
            android.database.Cursor r8 = r1.query(r2, r3, r4, r5, r6)
            if (r8 == 0) goto L52
            java.lang.String[] r0 = org.apache.cordova.CordovaResourceApi.LOCAL_FILE_PROJECTION     // Catch: java.lang.Throwable -> L42
            r1 = 0
            r0 = r0[r1]     // Catch: java.lang.Throwable -> L42
            int r0 = r8.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L42
            r1 = -1
            if (r0 == r1) goto L3e
            int r1 = r8.getCount()     // Catch: java.lang.Throwable -> L42
            if (r1 <= 0) goto L3e
            r8.moveToFirst()     // Catch: java.lang.Throwable -> L42
            java.lang.String r1 = r8.getString(r0)     // Catch: java.lang.Throwable -> L42
            if (r1 == 0) goto L3e
            java.io.File r3 = new java.io.File     // Catch: java.lang.Throwable -> L42
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L42
            r8.close()
            return r3
        L3e:
            r8.close()
            goto L52
        L42:
            r0 = move-exception
            r8.close()
            throw r0
        L47:
            r2 = r8
            java.io.File r8 = new java.io.File
            java.lang.String r0 = r2.getPath()
            r8.<init>(r0)
            return r8
        L52:
            r8 = 0
            return r8
    }

    public org.apache.cordova.CordovaResourceApi.OpenForReadResult openForRead(android.net.Uri r2) throws java.io.IOException {
            r1 = this;
            r0 = 0
            org.apache.cordova.CordovaResourceApi$OpenForReadResult r0 = r1.openForRead(r2, r0)
            return r0
    }

    public org.apache.cordova.CordovaResourceApi.OpenForReadResult openForRead(android.net.Uri r10, boolean r11) throws java.io.IOException {
            r9 = this;
            if (r11 != 0) goto L5
            r9.assertBackgroundThread()
        L5:
            int r0 = getUriType(r10)
            switch(r0) {
                case 0: goto Led;
                case 1: goto Lb3;
                case 2: goto L96;
                case 3: goto L96;
                case 4: goto L8d;
                case 5: goto L38;
                case 6: goto L38;
                case 7: goto Le;
                default: goto Lc;
            }
        Lc:
            goto L10e
        Le:
            java.lang.String r0 = r10.getHost()
            org.apache.cordova.PluginManager r1 = r9.pluginManager
            org.apache.cordova.CordovaPlugin r1 = r1.getPlugin(r0)
            if (r1 == 0) goto L1f
            org.apache.cordova.CordovaResourceApi$OpenForReadResult r3 = r1.handleOpenForRead(r10)
            return r3
        L1f:
            java.io.FileNotFoundException r3 = new java.io.FileNotFoundException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Invalid plugin ID in URI: "
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.StringBuilder r4 = r4.append(r10)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        L38:
            java.net.URL r0 = new java.net.URL
            java.lang.String r1 = r10.toString()
            r0.<init>(r1)
            java.net.URLConnection r0 = r0.openConnection()
            java.net.HttpURLConnection r0 = (java.net.HttpURLConnection) r0
            java.lang.String r1 = "Accept-Encoding"
            java.lang.String r3 = "gzip"
            r0.setRequestProperty(r1, r3)
            r1 = 1
            r0.setDoInput(r1)
            java.lang.String r1 = "Content-Type"
            java.lang.String r1 = r0.getHeaderField(r1)
            if (r1 == 0) goto L65
            java.lang.String r4 = ";"
            java.lang.String[] r4 = r1.split(r4)
            r5 = 0
            r1 = r4[r5]
            r4 = r1
            goto L66
        L65:
            r4 = r1
        L66:
            int r8 = r0.getContentLength()
            java.lang.String r1 = r0.getContentEncoding()
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L7f
            java.util.zip.GZIPInputStream r1 = new java.util.zip.GZIPInputStream
            java.io.InputStream r3 = r0.getInputStream()
            r1.<init>(r3)
            r3 = r1
            goto L84
        L7f:
            java.io.InputStream r1 = r0.getInputStream()
            r3 = r1
        L84:
            org.apache.cordova.CordovaResourceApi$OpenForReadResult r1 = new org.apache.cordova.CordovaResourceApi$OpenForReadResult
            long r5 = (long) r8
            r7 = 0
            r2 = r10
            r1.<init>(r2, r3, r4, r5, r7)
            return r1
        L8d:
            org.apache.cordova.CordovaResourceApi$OpenForReadResult r0 = r9.readDataUri(r10)
            if (r0 == 0) goto L94
            return r0
        L94:
            goto L10e
        L96:
            android.content.ContentResolver r0 = r9.contentResolver
            java.lang.String r4 = r0.getType(r10)
            android.content.ContentResolver r0 = r9.contentResolver
            java.lang.String r1 = "r"
            android.content.res.AssetFileDescriptor r7 = r0.openAssetFileDescriptor(r10, r1)
            java.io.FileInputStream r3 = r7.createInputStream()
            long r5 = r7.getLength()
            org.apache.cordova.CordovaResourceApi$OpenForReadResult r1 = new org.apache.cordova.CordovaResourceApi$OpenForReadResult
            r2 = r10
            r1.<init>(r2, r3, r4, r5, r7)
            return r1
        Lb3:
            java.lang.String r0 = r10.getPath()
            r1 = 15
            java.lang.String r8 = r0.substring(r1)
            r1 = 0
            r2 = -1
            android.content.res.AssetManager r0 = r9.assetManager     // Catch: java.io.FileNotFoundException -> Ld3
            android.content.res.AssetFileDescriptor r0 = r0.openFd(r8)     // Catch: java.io.FileNotFoundException -> Ld3
            r1 = r0
            java.io.FileInputStream r0 = r1.createInputStream()     // Catch: java.io.FileNotFoundException -> Ld3
            long r4 = r1.getLength()     // Catch: java.io.FileNotFoundException -> Ld3
            r3 = r0
            r5 = r4
            r7 = r1
            goto Le2
        Ld3:
            r0 = move-exception
            android.content.res.AssetManager r4 = r9.assetManager
            java.io.InputStream r4 = r4.open(r8)
            int r5 = r4.available()
            long r2 = (long) r5
            r5 = r2
            r3 = r4
            r7 = r1
        Le2:
            java.lang.String r4 = r9.getMimeTypeFromPath(r8)
            org.apache.cordova.CordovaResourceApi$OpenForReadResult r1 = new org.apache.cordova.CordovaResourceApi$OpenForReadResult
            r2 = r10
            r1.<init>(r2, r3, r4, r5, r7)
            return r1
        Led:
            java.io.FileInputStream r3 = new java.io.FileInputStream
            java.lang.String r0 = r10.getPath()
            r3.<init>(r0)
            java.lang.String r0 = r10.getPath()
            java.lang.String r4 = r9.getMimeTypeFromPath(r0)
            java.nio.channels.FileChannel r0 = r3.getChannel()
            long r5 = r0.size()
            org.apache.cordova.CordovaResourceApi$OpenForReadResult r1 = new org.apache.cordova.CordovaResourceApi$OpenForReadResult
            r7 = 0
            r2 = r10
            r1.<init>(r2, r3, r4, r5, r7)
            return r1
        L10e:
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "URI not supported by CordovaResourceApi: "
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.StringBuilder r1 = r1.append(r10)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public java.io.OutputStream openOutputStream(android.net.Uri r2) throws java.io.IOException {
            r1 = this;
            r0 = 0
            java.io.OutputStream r0 = r1.openOutputStream(r2, r0)
            return r0
    }

    public java.io.OutputStream openOutputStream(android.net.Uri r4, boolean r5) throws java.io.IOException {
            r3 = this;
            r3.assertBackgroundThread()
            int r0 = getUriType(r4)
            switch(r0) {
                case 0: goto L35;
                case 1: goto La;
                case 2: goto L23;
                case 3: goto L23;
                default: goto La;
            }
        La:
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "URI not supported by CordovaResourceApi: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r4)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L23:
            android.content.ContentResolver r0 = r3.contentResolver
            if (r5 == 0) goto L2a
            java.lang.String r1 = "wa"
            goto L2c
        L2a:
            java.lang.String r1 = "w"
        L2c:
            android.content.res.AssetFileDescriptor r0 = r0.openAssetFileDescriptor(r4, r1)
            java.io.FileOutputStream r1 = r0.createOutputStream()
            return r1
        L35:
            java.io.File r0 = new java.io.File
            java.lang.String r1 = r4.getPath()
            r0.<init>(r1)
            java.io.File r1 = r0.getParentFile()
            if (r1 == 0) goto L47
            r1.mkdirs()
        L47:
            java.io.FileOutputStream r2 = new java.io.FileOutputStream
            r2.<init>(r0, r5)
            return r2
    }

    public java.lang.String remapPath(java.lang.String r2) {
            r1 = this;
            java.io.File r0 = new java.io.File
            r0.<init>(r2)
            android.net.Uri r0 = android.net.Uri.fromFile(r0)
            android.net.Uri r0 = r1.remapUri(r0)
            java.lang.String r0 = r0.getPath()
            return r0
    }

    public android.net.Uri remapUri(android.net.Uri r3) {
            r2 = this;
            assertNonRelative(r3)
            org.apache.cordova.PluginManager r0 = r2.pluginManager
            android.net.Uri r0 = r0.remapUri(r3)
            if (r0 == 0) goto Ld
            r1 = r0
            goto Le
        Ld:
            r1 = r3
        Le:
            return r1
    }

    public void setThreadCheckingEnabled(boolean r1) {
            r0 = this;
            r0.threadCheckingEnabled = r1
            return
    }
}
