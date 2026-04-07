package androidx.webkit.internal;

/* JADX INFO: loaded from: classes.dex */
public class AssetHelper {
    public static final java.lang.String DEFAULT_MIME_TYPE = "text/plain";
    private final android.content.Context mContext;

    public AssetHelper(android.content.Context r1) {
            r0 = this;
            r0.<init>()
            r0.mContext = r1
            return
    }

    public static java.lang.String getCanonicalDirPath(java.io.File r3) throws java.io.IOException {
            java.lang.String r0 = r3.getCanonicalPath()
            java.lang.String r1 = "/"
            boolean r2 = r0.endsWith(r1)
            if (r2 != 0) goto L1d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.StringBuilder r2 = r2.append(r0)
            java.lang.StringBuilder r1 = r2.append(r1)
            java.lang.String r0 = r1.toString()
        L1d:
            return r0
    }

    public static java.io.File getCanonicalFileIfChild(java.io.File r3, java.lang.String r4) throws java.io.IOException {
            java.lang.String r0 = getCanonicalDirPath(r3)
            java.io.File r1 = new java.io.File
            r1.<init>(r3, r4)
            java.lang.String r1 = r1.getCanonicalPath()
            boolean r2 = r1.startsWith(r0)
            if (r2 == 0) goto L19
            java.io.File r2 = new java.io.File
            r2.<init>(r1)
            return r2
        L19:
            r2 = 0
            return r2
    }

    public static java.io.File getDataDir(android.content.Context r1) {
            java.io.File r0 = androidx.webkit.internal.ApiHelperForN.getDataDir(r1)
            return r0
    }

    private int getFieldId(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            android.content.Context r0 = r2.mContext
            java.lang.String r0 = r0.getPackageName()
            android.content.Context r1 = r2.mContext
            android.content.res.Resources r1 = r1.getResources()
            int r1 = r1.getIdentifier(r4, r3, r0)
            return r1
    }

    private int getValueType(int r4) {
            r3 = this;
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            android.content.Context r1 = r3.mContext
            android.content.res.Resources r1 = r1.getResources()
            r2 = 1
            r1.getValue(r4, r0, r2)
            int r1 = r0.type
            return r1
    }

    public static java.lang.String guessMimeType(java.lang.String r2) {
            java.lang.String r0 = androidx.webkit.internal.MimeUtil.getMimeFromFileName(r2)
            if (r0 != 0) goto L9
            java.lang.String r1 = "text/plain"
            goto La
        L9:
            r1 = r0
        La:
            return r1
    }

    private static java.io.InputStream handleSvgzStream(java.lang.String r1, java.io.InputStream r2) throws java.io.IOException {
            java.lang.String r0 = ".svgz"
            boolean r0 = r1.endsWith(r0)
            if (r0 == 0) goto Le
            java.util.zip.GZIPInputStream r0 = new java.util.zip.GZIPInputStream
            r0.<init>(r2)
            goto Lf
        Le:
            r0 = r2
        Lf:
            return r0
    }

    public static java.io.InputStream openFile(java.io.File r2) throws java.io.FileNotFoundException, java.io.IOException {
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r0.<init>(r2)
            java.lang.String r1 = r2.getPath()
            java.io.InputStream r1 = handleSvgzStream(r1, r0)
            return r1
    }

    private static java.lang.String removeLeadingSlash(java.lang.String r3) {
            int r0 = r3.length()
            r1 = 1
            if (r0 <= r1) goto L14
            r0 = 0
            char r0 = r3.charAt(r0)
            r2 = 47
            if (r0 != r2) goto L14
            java.lang.String r3 = r3.substring(r1)
        L14:
            return r3
    }

    public java.io.InputStream openAsset(java.lang.String r3) throws java.io.IOException {
            r2 = this;
            java.lang.String r3 = removeLeadingSlash(r3)
            android.content.Context r0 = r2.mContext
            android.content.res.AssetManager r0 = r0.getAssets()
            r1 = 2
            java.io.InputStream r1 = r0.open(r3, r1)
            java.io.InputStream r1 = handleSvgzStream(r3, r1)
            return r1
    }

    public java.io.InputStream openResource(java.lang.String r10) throws android.content.res.Resources.NotFoundException, java.io.IOException {
            r9 = this;
            java.lang.String r10 = removeLeadingSlash(r10)
            java.lang.String r0 = "/"
            r1 = -1
            java.lang.String[] r0 = r10.split(r0, r1)
            int r2 = r0.length
            r3 = 2
            if (r2 != r3) goto L4f
            r2 = 0
            r3 = r0[r2]
            r4 = 1
            r4 = r0[r4]
            r5 = 46
            int r5 = r4.lastIndexOf(r5)
            if (r5 == r1) goto L21
            java.lang.String r4 = r4.substring(r2, r5)
        L21:
            int r1 = r9.getFieldId(r3, r4)
            int r2 = r9.getValueType(r1)
            r6 = 3
            if (r2 != r6) goto L3b
            android.content.Context r6 = r9.mContext
            android.content.res.Resources r6 = r6.getResources()
            java.io.InputStream r6 = r6.openRawResource(r1)
            java.io.InputStream r6 = handleSvgzStream(r10, r6)
            return r6
        L3b:
            java.io.IOException r6 = new java.io.IOException
            java.lang.Integer r7 = java.lang.Integer.valueOf(r2)
            java.lang.Object[] r7 = new java.lang.Object[]{r10, r7}
            java.lang.String r8 = "Expected %s resource to be of TYPE_STRING but was %d"
            java.lang.String r7 = java.lang.String.format(r8, r7)
            r6.<init>(r7)
            throw r6
        L4f:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Incorrect resource path: "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r10)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }
}
