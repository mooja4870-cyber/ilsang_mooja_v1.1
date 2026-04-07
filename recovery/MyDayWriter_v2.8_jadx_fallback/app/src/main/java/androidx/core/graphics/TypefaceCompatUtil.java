package androidx.core.graphics;

/* JADX INFO: loaded from: classes.dex */
public class TypefaceCompatUtil {
    private static final java.lang.String CACHE_FILE_PREFIX = ".font";
    private static final java.lang.String TAG = "TypefaceCompatUtil";

    private TypefaceCompatUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void closeQuietly(java.io.Closeable r1) {
            if (r1 == 0) goto L7
            r1.close()     // Catch: java.io.IOException -> L6
            goto L7
        L6:
            r0 = move-exception
        L7:
            return
    }

    public static java.nio.ByteBuffer copyToDirectBuffer(android.content.Context r3, android.content.res.Resources r4, int r5) {
            java.io.File r0 = getTempFile(r3)
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            boolean r2 = copyToFile(r0, r4, r5)     // Catch: java.lang.Throwable -> L1b
            if (r2 != 0) goto L13
        Lf:
            r0.delete()
            return r1
        L13:
            java.nio.ByteBuffer r1 = mmap(r0)     // Catch: java.lang.Throwable -> L1b
            r0.delete()
            return r1
        L1b:
            r1 = move-exception
            r0.delete()
            throw r1
    }

    public static boolean copyToFile(java.io.File r2, android.content.res.Resources r3, int r4) {
            r0 = 0
            java.io.InputStream r1 = r3.openRawResource(r4)     // Catch: java.lang.Throwable -> Le
            r0 = r1
            boolean r1 = copyToFile(r2, r0)     // Catch: java.lang.Throwable -> Le
            closeQuietly(r0)
            return r1
        Le:
            r1 = move-exception
            closeQuietly(r0)
            throw r1
    }

    public static boolean copyToFile(java.io.File r7, java.io.InputStream r8) {
            r0 = 0
            android.os.StrictMode$ThreadPolicy r1 = android.os.StrictMode.allowThreadDiskWrites()
            r2 = 0
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L25 java.io.IOException -> L27
            r3.<init>(r7, r2)     // Catch: java.lang.Throwable -> L25 java.io.IOException -> L27
            r0 = r3
            r3 = 1024(0x400, float:1.435E-42)
            byte[] r3 = new byte[r3]     // Catch: java.lang.Throwable -> L25 java.io.IOException -> L27
        L10:
            int r4 = r8.read(r3)     // Catch: java.lang.Throwable -> L25 java.io.IOException -> L27
            r5 = r4
            r6 = -1
            if (r4 == r6) goto L1c
            r0.write(r3, r2, r5)     // Catch: java.lang.Throwable -> L25 java.io.IOException -> L27
            goto L10
        L1c:
            closeQuietly(r0)
            android.os.StrictMode.setThreadPolicy(r1)
            r2 = 1
            return r2
        L25:
            r2 = move-exception
            goto L4c
        L27:
            r3 = move-exception
            java.lang.String r4 = "TypefaceCompatUtil"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L25
            r5.<init>()     // Catch: java.lang.Throwable -> L25
            java.lang.String r6 = "Error copying resource contents to temp file: "
            java.lang.StringBuilder r5 = r5.append(r6)     // Catch: java.lang.Throwable -> L25
            java.lang.String r6 = r3.getMessage()     // Catch: java.lang.Throwable -> L25
            java.lang.StringBuilder r5 = r5.append(r6)     // Catch: java.lang.Throwable -> L25
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L25
            android.util.Log.e(r4, r5)     // Catch: java.lang.Throwable -> L25
            closeQuietly(r0)
            android.os.StrictMode.setThreadPolicy(r1)
            return r2
        L4c:
            closeQuietly(r0)
            android.os.StrictMode.setThreadPolicy(r1)
            throw r2
    }

    public static java.io.File getTempFile(android.content.Context r6) {
            java.io.File r0 = r6.getCacheDir()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = ".font"
            java.lang.StringBuilder r2 = r2.append(r3)
            int r3 = android.os.Process.myPid()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = "-"
            java.lang.StringBuilder r2 = r2.append(r3)
            int r4 = android.os.Process.myTid()
            java.lang.StringBuilder r2 = r2.append(r4)
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r3 = 0
        L32:
            r4 = 100
            if (r3 >= r4) goto L58
            java.io.File r4 = new java.io.File
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.StringBuilder r5 = r5.append(r2)
            java.lang.StringBuilder r5 = r5.append(r3)
            java.lang.String r5 = r5.toString()
            r4.<init>(r0, r5)
            boolean r5 = r4.createNewFile()     // Catch: java.io.IOException -> L54
            if (r5 == 0) goto L53
            return r4
        L53:
            goto L55
        L54:
            r5 = move-exception
        L55:
            int r3 = r3 + 1
            goto L32
        L58:
            return r1
    }

    public static java.nio.ByteBuffer mmap(android.content.Context r11, android.os.CancellationSignal r12, android.net.Uri r13) {
            android.content.ContentResolver r1 = r11.getContentResolver()
            r2 = 0
            java.lang.String r0 = "r"
            android.os.ParcelFileDescriptor r0 = r1.openFileDescriptor(r13, r0, r12)     // Catch: java.io.IOException -> L51
            r3 = r0
            if (r3 != 0) goto L15
        Lf:
            if (r3 == 0) goto L14
            r3.close()     // Catch: java.io.IOException -> L51
        L14:
            return r2
        L15:
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L44
            java.io.FileDescriptor r4 = r3.getFileDescriptor()     // Catch: java.lang.Throwable -> L44
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L44
            r4 = r0
            java.nio.channels.FileChannel r0 = r4.getChannel()     // Catch: java.lang.Throwable -> L39
            r5 = r0
            long r9 = r5.size()     // Catch: java.lang.Throwable -> L39
            java.nio.channels.FileChannel$MapMode r6 = java.nio.channels.FileChannel.MapMode.READ_ONLY     // Catch: java.lang.Throwable -> L39
            r7 = 0
            java.nio.MappedByteBuffer r0 = r5.map(r6, r7, r9)     // Catch: java.lang.Throwable -> L39
            r4.close()     // Catch: java.lang.Throwable -> L44
            if (r3 == 0) goto L38
            r3.close()     // Catch: java.io.IOException -> L51
        L38:
            return r0
        L39:
            r0 = move-exception
            r5 = r0
            r4.close()     // Catch: java.lang.Throwable -> L3f
            goto L43
        L3f:
            r0 = move-exception
            r5.addSuppressed(r0)     // Catch: java.lang.Throwable -> L44
        L43:
            throw r5     // Catch: java.lang.Throwable -> L44
        L44:
            r0 = move-exception
            r4 = r0
            if (r3 == 0) goto L50
            r3.close()     // Catch: java.lang.Throwable -> L4c
            goto L50
        L4c:
            r0 = move-exception
            r4.addSuppressed(r0)     // Catch: java.io.IOException -> L51
        L50:
            throw r4     // Catch: java.io.IOException -> L51
        L51:
            r0 = move-exception
            return r2
    }

    private static java.nio.ByteBuffer mmap(java.io.File r8) {
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch: java.io.IOException -> L26
            r0.<init>(r8)     // Catch: java.io.IOException -> L26
            r1 = r0
            java.nio.channels.FileChannel r0 = r1.getChannel()     // Catch: java.lang.Throwable -> L1b
            r2 = r0
            long r6 = r2.size()     // Catch: java.lang.Throwable -> L1b
            java.nio.channels.FileChannel$MapMode r3 = java.nio.channels.FileChannel.MapMode.READ_ONLY     // Catch: java.lang.Throwable -> L1b
            r4 = 0
            java.nio.MappedByteBuffer r0 = r2.map(r3, r4, r6)     // Catch: java.lang.Throwable -> L1b
            r1.close()     // Catch: java.io.IOException -> L26
            return r0
        L1b:
            r0 = move-exception
            r2 = r0
            r1.close()     // Catch: java.lang.Throwable -> L21
            goto L25
        L21:
            r0 = move-exception
            r2.addSuppressed(r0)     // Catch: java.io.IOException -> L26
        L25:
            throw r2     // Catch: java.io.IOException -> L26
        L26:
            r0 = move-exception
            r1 = 0
            return r1
    }

    public static java.util.Map<android.net.Uri, java.nio.ByteBuffer> readFontInfoIntoByteBuffer(android.content.Context r6, androidx.core.provider.FontsContractCompat.FontInfo[] r7, android.os.CancellationSignal r8) {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            int r1 = r7.length
            r2 = 0
        L7:
            if (r2 >= r1) goto L27
            r3 = r7[r2]
            int r4 = r3.getResultCode()
            if (r4 == 0) goto L12
            goto L24
        L12:
            android.net.Uri r4 = r3.getUri()
            boolean r5 = r0.containsKey(r4)
            if (r5 == 0) goto L1d
            goto L24
        L1d:
            java.nio.ByteBuffer r5 = mmap(r6, r8, r4)
            r0.put(r4, r5)
        L24:
            int r2 = r2 + 1
            goto L7
        L27:
            java.util.Map r1 = java.util.Collections.unmodifiableMap(r0)
            return r1
    }
}
