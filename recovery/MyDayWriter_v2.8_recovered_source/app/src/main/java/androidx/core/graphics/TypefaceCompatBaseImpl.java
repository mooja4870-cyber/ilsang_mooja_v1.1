package androidx.core.graphics;

/* JADX INFO: loaded from: classes.dex */
class TypefaceCompatBaseImpl {
    private static final int INVALID_KEY = 0;
    private static final java.lang.String TAG = "TypefaceCompatBaseImpl";
    private java.util.concurrent.ConcurrentHashMap<java.lang.Long, androidx.core.content.res.FontResourcesParserCompat.FontFamilyFilesResourceEntry> mFontFamilies;




    private interface StyleExtractor<T> {
        int getWeight(T r1);

        boolean isItalic(T r1);
    }

    TypefaceCompatBaseImpl() {
            r1 = this;
            r1.<init>()
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r1.mFontFamilies = r0
            return
    }

    private void addFontFamily(android.graphics.Typeface r5, androidx.core.content.res.FontResourcesParserCompat.FontFamilyFilesResourceEntry r6) {
            r4 = this;
            long r0 = getUniqueKey(r5)
            r2 = 0
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L13
            java.util.concurrent.ConcurrentHashMap<java.lang.Long, androidx.core.content.res.FontResourcesParserCompat$FontFamilyFilesResourceEntry> r2 = r4.mFontFamilies
            java.lang.Long r3 = java.lang.Long.valueOf(r0)
            r2.put(r3, r6)
        L13:
            return
    }

    private androidx.core.content.res.FontResourcesParserCompat.FontFileResourceEntry findBestEntry(androidx.core.content.res.FontResourcesParserCompat.FontFamilyFilesResourceEntry r3, int r4) {
            r2 = this;
            androidx.core.content.res.FontResourcesParserCompat$FontFileResourceEntry[] r0 = r3.getEntries()
            androidx.core.graphics.TypefaceCompatBaseImpl$2 r1 = new androidx.core.graphics.TypefaceCompatBaseImpl$2
            r1.<init>(r2)
            java.lang.Object r0 = findBestFont(r0, r4, r1)
            androidx.core.content.res.FontResourcesParserCompat$FontFileResourceEntry r0 = (androidx.core.content.res.FontResourcesParserCompat.FontFileResourceEntry) r0
            return r0
    }

    private androidx.core.content.res.FontResourcesParserCompat.FontFileResourceEntry findBestEntry(androidx.core.content.res.FontResourcesParserCompat.FontFamilyFilesResourceEntry r3, int r4, boolean r5) {
            r2 = this;
            androidx.core.content.res.FontResourcesParserCompat$FontFileResourceEntry[] r0 = r3.getEntries()
            androidx.core.graphics.TypefaceCompatBaseImpl$3 r1 = new androidx.core.graphics.TypefaceCompatBaseImpl$3
            r1.<init>(r2)
            java.lang.Object r0 = findBestFont(r0, r4, r5, r1)
            androidx.core.content.res.FontResourcesParserCompat$FontFileResourceEntry r0 = (androidx.core.content.res.FontResourcesParserCompat.FontFileResourceEntry) r0
            return r0
    }

    private static <T> T findBestFont(T[] r3, int r4, androidx.core.graphics.TypefaceCompatBaseImpl.StyleExtractor<T> r5) {
            r0 = r4 & 1
            if (r0 != 0) goto L7
            r0 = 400(0x190, float:5.6E-43)
            goto L9
        L7:
            r0 = 700(0x2bc, float:9.81E-43)
        L9:
            r1 = r4 & 2
            if (r1 == 0) goto Lf
            r1 = 1
            goto L10
        Lf:
            r1 = 0
        L10:
            java.lang.Object r2 = findBestFont(r3, r0, r1, r5)
            return r2
    }

    private static <T> T findBestFont(T[] r8, int r9, boolean r10, androidx.core.graphics.TypefaceCompatBaseImpl.StyleExtractor<T> r11) {
            r0 = 0
            r1 = 2147483647(0x7fffffff, float:NaN)
            int r2 = r8.length
            r3 = 0
            r4 = r3
        L7:
            if (r4 >= r2) goto L29
            r5 = r8[r4]
            int r6 = r11.getWeight(r5)
            int r6 = r6 - r9
            int r6 = java.lang.Math.abs(r6)
            int r6 = r6 * 2
            boolean r7 = r11.isItalic(r5)
            if (r7 != r10) goto L1e
            r7 = r3
            goto L1f
        L1e:
            r7 = 1
        L1f:
            int r6 = r6 + r7
            if (r0 == 0) goto L24
            if (r1 <= r6) goto L26
        L24:
            r0 = r5
            r1 = r6
        L26:
            int r4 = r4 + 1
            goto L7
        L29:
            return r0
    }

    private static long getUniqueKey(android.graphics.Typeface r6) {
            java.lang.String r0 = "Could not retrieve font from family."
            java.lang.String r1 = "TypefaceCompatBaseImpl"
            r2 = 0
            if (r6 != 0) goto L9
            return r2
        L9:
            java.lang.Class<android.graphics.Typeface> r4 = android.graphics.Typeface.class
            java.lang.String r5 = "native_instance"
            java.lang.reflect.Field r4 = r4.getDeclaredField(r5)     // Catch: java.lang.IllegalAccessException -> L20 java.lang.NoSuchFieldException -> L25
            r5 = 1
            r4.setAccessible(r5)     // Catch: java.lang.IllegalAccessException -> L20 java.lang.NoSuchFieldException -> L25
            java.lang.Object r5 = r4.get(r6)     // Catch: java.lang.IllegalAccessException -> L20 java.lang.NoSuchFieldException -> L25
            java.lang.Number r5 = (java.lang.Number) r5     // Catch: java.lang.IllegalAccessException -> L20 java.lang.NoSuchFieldException -> L25
            long r0 = r5.longValue()     // Catch: java.lang.IllegalAccessException -> L20 java.lang.NoSuchFieldException -> L25
            return r0
        L20:
            r4 = move-exception
            android.util.Log.e(r1, r0, r4)
            return r2
        L25:
            r4 = move-exception
            android.util.Log.e(r1, r0, r4)
            return r2
    }

    public android.graphics.Typeface createFromFontFamilyFilesResourceEntry(android.content.Context r9, androidx.core.content.res.FontResourcesParserCompat.FontFamilyFilesResourceEntry r10, android.content.res.Resources r11, int r12) {
            r8 = this;
            androidx.core.content.res.FontResourcesParserCompat$FontFileResourceEntry r0 = r8.findBestEntry(r10, r12)
            if (r0 != 0) goto L8
            r1 = 0
            return r1
        L8:
            int r4 = r0.getResourceId()
            java.lang.String r5 = r0.getFileName()
            r6 = 0
            r2 = r9
            r3 = r11
            r7 = r12
            android.graphics.Typeface r9 = androidx.core.graphics.TypefaceCompat.createFromResourcesFontFile(r2, r3, r4, r5, r6, r7)
            r8.addFontFamily(r9, r10)
            return r9
    }

    android.graphics.Typeface createFromFontFamilyFilesResourceEntry(android.content.Context r9, androidx.core.content.res.FontResourcesParserCompat.FontFamilyFilesResourceEntry r10, android.content.res.Resources r11, int r12, boolean r13) {
            r8 = this;
            androidx.core.content.res.FontResourcesParserCompat$FontFileResourceEntry r0 = r8.findBestEntry(r10, r12, r13)
            if (r0 != 0) goto L8
            r1 = 0
            return r1
        L8:
            int r4 = r0.getResourceId()
            java.lang.String r5 = r0.getFileName()
            r6 = 0
            r7 = 0
            r2 = r9
            r3 = r11
            android.graphics.Typeface r9 = androidx.core.graphics.TypefaceCompat.createFromResourcesFontFile(r2, r3, r4, r5, r6, r7)
            r8.addFontFamily(r9, r10)
            return r9
    }

    public android.graphics.Typeface createFromFontInfo(android.content.Context r6, android.os.CancellationSignal r7, androidx.core.provider.FontsContractCompat.FontInfo[] r8, int r9) {
            r5 = this;
            int r0 = r8.length
            r1 = 1
            r2 = 0
            if (r0 >= r1) goto L6
            return r2
        L6:
            androidx.core.provider.FontsContractCompat$FontInfo r0 = r5.findBestInfo(r8, r9)
            r1 = 0
            android.content.ContentResolver r3 = r6.getContentResolver()     // Catch: java.lang.Throwable -> L20 java.io.IOException -> L25
            android.net.Uri r4 = r0.getUri()     // Catch: java.lang.Throwable -> L20 java.io.IOException -> L25
            java.io.InputStream r3 = r3.openInputStream(r4)     // Catch: java.lang.Throwable -> L20 java.io.IOException -> L25
            r1 = r3
            android.graphics.Typeface r2 = r5.createFromInputStream(r6, r1)     // Catch: java.lang.Throwable -> L20 java.io.IOException -> L25
            androidx.core.graphics.TypefaceCompatUtil.closeQuietly(r1)
            return r2
        L20:
            r2 = move-exception
            androidx.core.graphics.TypefaceCompatUtil.closeQuietly(r1)
            throw r2
        L25:
            r3 = move-exception
            androidx.core.graphics.TypefaceCompatUtil.closeQuietly(r1)
            return r2
    }

    public android.graphics.Typeface createFromFontInfoWithFallback(android.content.Context r3, android.os.CancellationSignal r4, java.util.List<androidx.core.provider.FontsContractCompat.FontInfo[]> r5, int r6) {
            r2 = this;
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "createFromFontInfoWithFallback must only be called on API 29+"
            r0.<init>(r1)
            throw r0
    }

    protected android.graphics.Typeface createFromInputStream(android.content.Context r4, java.io.InputStream r5) {
            r3 = this;
            java.io.File r0 = androidx.core.graphics.TypefaceCompatUtil.getTempFile(r4)
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            boolean r2 = androidx.core.graphics.TypefaceCompatUtil.copyToFile(r0, r5)     // Catch: java.lang.Throwable -> L1f java.lang.RuntimeException -> L24
            if (r2 != 0) goto L13
        Lf:
            r0.delete()
            return r1
        L13:
            java.lang.String r2 = r0.getPath()     // Catch: java.lang.Throwable -> L1f java.lang.RuntimeException -> L24
            android.graphics.Typeface r1 = android.graphics.Typeface.createFromFile(r2)     // Catch: java.lang.Throwable -> L1f java.lang.RuntimeException -> L24
            r0.delete()
            return r1
        L1f:
            r1 = move-exception
            r0.delete()
            throw r1
        L24:
            r2 = move-exception
            r0.delete()
            return r1
    }

    public android.graphics.Typeface createFromResourcesFontFile(android.content.Context r4, android.content.res.Resources r5, int r6, java.lang.String r7, int r8) {
            r3 = this;
            java.io.File r0 = androidx.core.graphics.TypefaceCompatUtil.getTempFile(r4)
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            boolean r2 = androidx.core.graphics.TypefaceCompatUtil.copyToFile(r0, r5, r6)     // Catch: java.lang.Throwable -> L1f java.lang.RuntimeException -> L24
            if (r2 != 0) goto L13
        Lf:
            r0.delete()
            return r1
        L13:
            java.lang.String r2 = r0.getPath()     // Catch: java.lang.Throwable -> L1f java.lang.RuntimeException -> L24
            android.graphics.Typeface r1 = android.graphics.Typeface.createFromFile(r2)     // Catch: java.lang.Throwable -> L1f java.lang.RuntimeException -> L24
            r0.delete()
            return r1
        L1f:
            r1 = move-exception
            r0.delete()
            throw r1
        L24:
            r2 = move-exception
            r0.delete()
            return r1
    }

    android.graphics.Typeface createWeightStyle(android.content.Context r3, android.graphics.Typeface r4, int r5, boolean r6) {
            r2 = this;
            r0 = 0
            android.graphics.Typeface r1 = androidx.core.graphics.WeightTypefaceApi14.createWeightStyle(r2, r3, r4, r5, r6)     // Catch: java.lang.RuntimeException -> L7
            r0 = r1
            goto L8
        L7:
            r1 = move-exception
        L8:
            if (r0 != 0) goto Lb
            r0 = r4
        Lb:
            return r0
    }

    protected androidx.core.provider.FontsContractCompat.FontInfo findBestInfo(androidx.core.provider.FontsContractCompat.FontInfo[] r2, int r3) {
            r1 = this;
            androidx.core.graphics.TypefaceCompatBaseImpl$1 r0 = new androidx.core.graphics.TypefaceCompatBaseImpl$1
            r0.<init>(r1)
            java.lang.Object r0 = findBestFont(r2, r3, r0)
            androidx.core.provider.FontsContractCompat$FontInfo r0 = (androidx.core.provider.FontsContractCompat.FontInfo) r0
            return r0
    }

    androidx.core.content.res.FontResourcesParserCompat.FontFamilyFilesResourceEntry getFontFamily(android.graphics.Typeface r5) {
            r4 = this;
            long r0 = getUniqueKey(r5)
            r2 = 0
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 != 0) goto Lc
            r2 = 0
            return r2
        Lc:
            java.util.concurrent.ConcurrentHashMap<java.lang.Long, androidx.core.content.res.FontResourcesParserCompat$FontFamilyFilesResourceEntry> r2 = r4.mFontFamilies
            java.lang.Long r3 = java.lang.Long.valueOf(r0)
            java.lang.Object r2 = r2.get(r3)
            androidx.core.content.res.FontResourcesParserCompat$FontFamilyFilesResourceEntry r2 = (androidx.core.content.res.FontResourcesParserCompat.FontFamilyFilesResourceEntry) r2
            return r2
    }
}
