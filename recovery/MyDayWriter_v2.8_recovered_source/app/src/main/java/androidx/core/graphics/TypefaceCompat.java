package androidx.core.graphics;

/* JADX INFO: loaded from: classes.dex */
public class TypefaceCompat {
    public static final boolean DOWNLOADABLE_FALLBACK_DEBUG = false;
    public static final boolean DOWNLOADABLE_FONT_TRACING = true;
    private static final java.lang.String REFERENCE_CHAR_FOR_PRIMARY_FONT = " ";
    private static final java.lang.String TAG = "TypefaceCompat";
    private static android.graphics.Paint sCachedPaint;
    private static final androidx.collection.LruCache<java.lang.String, android.graphics.Typeface> sTypefaceCache = null;
    private static final androidx.core.graphics.TypefaceCompatBaseImpl sTypefaceCompatImpl = null;

    public static class ResourcesCallbackAdapter extends androidx.core.provider.FontsContractCompat.FontRequestCallback {
        private androidx.core.content.res.ResourcesCompat.FontCallback mFontCallback;

        public ResourcesCallbackAdapter(androidx.core.content.res.ResourcesCompat.FontCallback r1) {
                r0 = this;
                r0.<init>()
                r0.mFontCallback = r1
                return
        }

        @Override // androidx.core.provider.FontsContractCompat.FontRequestCallback
        public void onTypefaceRequestFailed(int r2) {
                r1 = this;
                androidx.core.content.res.ResourcesCompat$FontCallback r0 = r1.mFontCallback
                if (r0 == 0) goto L9
                androidx.core.content.res.ResourcesCompat$FontCallback r0 = r1.mFontCallback
                r0.onFontRetrievalFailed(r2)
            L9:
                return
        }

        @Override // androidx.core.provider.FontsContractCompat.FontRequestCallback
        public void onTypefaceRetrieved(android.graphics.Typeface r2) {
                r1 = this;
                androidx.core.content.res.ResourcesCompat$FontCallback r0 = r1.mFontCallback
                if (r0 == 0) goto L9
                androidx.core.content.res.ResourcesCompat$FontCallback r0 = r1.mFontCallback
                r0.onFontRetrieved(r2)
            L9:
                return
        }
    }

    static {
            java.lang.String r0 = "TypefaceCompat static init"
            androidx.tracing.Trace.beginSection(r0)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r0 < r1) goto L13
            androidx.core.graphics.TypefaceCompatApi31Impl r0 = new androidx.core.graphics.TypefaceCompatApi31Impl
            r0.<init>()
            androidx.core.graphics.TypefaceCompat.sTypefaceCompatImpl = r0
            goto L54
        L13:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L21
            androidx.core.graphics.TypefaceCompatApi29Impl r0 = new androidx.core.graphics.TypefaceCompatApi29Impl
            r0.<init>()
            androidx.core.graphics.TypefaceCompat.sTypefaceCompatImpl = r0
            goto L54
        L21:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L2f
            androidx.core.graphics.TypefaceCompatApi28Impl r0 = new androidx.core.graphics.TypefaceCompatApi28Impl
            r0.<init>()
            androidx.core.graphics.TypefaceCompat.sTypefaceCompatImpl = r0
            goto L54
        L2f:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L3d
            androidx.core.graphics.TypefaceCompatApi26Impl r0 = new androidx.core.graphics.TypefaceCompatApi26Impl
            r0.<init>()
            androidx.core.graphics.TypefaceCompat.sTypefaceCompatImpl = r0
            goto L54
        L3d:
            boolean r0 = androidx.core.graphics.TypefaceCompatApi24Impl.isUsable()
            if (r0 == 0) goto L4c
            androidx.core.graphics.TypefaceCompatApi24Impl r0 = new androidx.core.graphics.TypefaceCompatApi24Impl
            r0.<init>()
            androidx.core.graphics.TypefaceCompat.sTypefaceCompatImpl = r0
            goto L54
        L4c:
            androidx.core.graphics.TypefaceCompatApi21Impl r0 = new androidx.core.graphics.TypefaceCompatApi21Impl
            r0.<init>()
            androidx.core.graphics.TypefaceCompat.sTypefaceCompatImpl = r0
        L54:
            androidx.collection.LruCache r0 = new androidx.collection.LruCache
            r1 = 16
            r0.<init>(r1)
            androidx.core.graphics.TypefaceCompat.sTypefaceCache = r0
            r0 = 0
            androidx.core.graphics.TypefaceCompat.sCachedPaint = r0
            androidx.tracing.Trace.endSection()
            return
    }

    private TypefaceCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void clearCache() {
            androidx.collection.LruCache<java.lang.String, android.graphics.Typeface> r0 = androidx.core.graphics.TypefaceCompat.sTypefaceCache
            r0.evictAll()
            return
    }

    public static android.graphics.Typeface create(android.content.Context r2, android.graphics.Typeface r3, int r4) {
            if (r2 == 0) goto L9
            r0 = 0
            android.graphics.Typeface r1 = android.graphics.Typeface.create(r3, r4)
            return r1
        L9:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Context cannot be null"
            r0.<init>(r1)
            throw r0
    }

    public static android.graphics.Typeface create(android.content.Context r3, android.graphics.Typeface r4, int r5, boolean r6) {
            if (r3 == 0) goto L15
            r0 = 1000(0x3e8, float:1.401E-42)
            java.lang.String r1 = "weight"
            r2 = 1
            androidx.core.util.Preconditions.checkArgumentInRange(r5, r2, r0, r1)
            if (r4 != 0) goto Le
            android.graphics.Typeface r4 = android.graphics.Typeface.DEFAULT
        Le:
            androidx.core.graphics.TypefaceCompatBaseImpl r0 = androidx.core.graphics.TypefaceCompat.sTypefaceCompatImpl
            android.graphics.Typeface r0 = r0.createWeightStyle(r3, r4, r5, r6)
            return r0
        L15:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Context cannot be null"
            r0.<init>(r1)
            throw r0
    }

    public static android.graphics.Typeface createFromFontInfo(android.content.Context r1, android.os.CancellationSignal r2, androidx.core.provider.FontsContractCompat.FontInfo[] r3, int r4) {
            java.lang.String r0 = "TypefaceCompat.createFromFontInfo"
            androidx.tracing.Trace.beginSection(r0)
            androidx.core.graphics.TypefaceCompatBaseImpl r0 = androidx.core.graphics.TypefaceCompat.sTypefaceCompatImpl     // Catch: java.lang.Throwable -> Lf
            android.graphics.Typeface r0 = r0.createFromFontInfo(r1, r2, r3, r4)     // Catch: java.lang.Throwable -> Lf
            androidx.tracing.Trace.endSection()
            return r0
        Lf:
            r0 = move-exception
            androidx.tracing.Trace.endSection()
            throw r0
    }

    public static android.graphics.Typeface createFromFontInfoWithFallback(android.content.Context r1, android.os.CancellationSignal r2, java.util.List<androidx.core.provider.FontsContractCompat.FontInfo[]> r3, int r4) {
            java.lang.String r0 = "TypefaceCompat.createFromFontInfoWithFallback"
            androidx.tracing.Trace.beginSection(r0)
            androidx.core.graphics.TypefaceCompatBaseImpl r0 = androidx.core.graphics.TypefaceCompat.sTypefaceCompatImpl     // Catch: java.lang.Throwable -> Lf
            android.graphics.Typeface r0 = r0.createFromFontInfoWithFallback(r1, r2, r3, r4)     // Catch: java.lang.Throwable -> Lf
            androidx.tracing.Trace.endSection()
            return r0
        Lf:
            r0 = move-exception
            androidx.tracing.Trace.endSection()
            throw r0
    }

    @java.lang.Deprecated
    public static android.graphics.Typeface createFromResourcesFamilyXml(android.content.Context r10, androidx.core.content.res.FontResourcesParserCompat.FamilyResourceEntry r11, android.content.res.Resources r12, int r13, int r14, androidx.core.content.res.ResourcesCompat.FontCallback r15, android.os.Handler r16, boolean r17) {
            r4 = 0
            r5 = 0
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r6 = r14
            r7 = r15
            r8 = r16
            r9 = r17
            android.graphics.Typeface r4 = createFromResourcesFamilyXml(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return r4
    }

    public static android.graphics.Typeface createFromResourcesFamilyXml(android.content.Context r12, androidx.core.content.res.FontResourcesParserCompat.FamilyResourceEntry r13, android.content.res.Resources r14, int r15, java.lang.String r16, int r17, int r18, androidx.core.content.res.ResourcesCompat.FontCallback r19, android.os.Handler r20, boolean r21) {
            r0 = r19
            r1 = r20
            boolean r2 = r13 instanceof androidx.core.content.res.FontResourcesParserCompat.ProviderResourceEntry
            if (r2 == 0) goto L53
            r2 = r13
            androidx.core.content.res.FontResourcesParserCompat$ProviderResourceEntry r2 = (androidx.core.content.res.FontResourcesParserCompat.ProviderResourceEntry) r2
            android.graphics.Typeface r3 = getSystemFontFamilyWithFallback(r2)
            if (r3 == 0) goto L20
            if (r0 == 0) goto L16
            r0.callbackSuccessAsync(r3, r1)
        L16:
            androidx.collection.LruCache<java.lang.String, android.graphics.Typeface> r4 = androidx.core.graphics.TypefaceCompat.sTypefaceCache
            java.lang.String r5 = createResourceUid(r14, r15, r16, r17, r18)
            r4.put(r5, r3)
            return r3
        L20:
            r4 = 1
            r5 = 0
            if (r21 == 0) goto L2e
        L25:
            int r6 = r2.getFetchStrategy()
            if (r6 != 0) goto L2c
            goto L32
        L2c:
            r4 = r5
            goto L32
        L2e:
            if (r0 != 0) goto L31
            goto L32
        L31:
            r4 = r5
        L32:
            r8 = r4
            if (r21 == 0) goto L3b
            int r4 = r2.getTimeout()
            r9 = r4
            goto L3d
        L3b:
            r4 = -1
            r9 = r4
        L3d:
            android.os.Handler r10 = androidx.core.content.res.ResourcesCompat.FontCallback.getHandler(r1)
            androidx.core.graphics.TypefaceCompat$ResourcesCallbackAdapter r11 = new androidx.core.graphics.TypefaceCompat$ResourcesCallbackAdapter
            r11.<init>(r0)
            java.util.List r6 = r2.getRequests()
            r5 = r12
            r7 = r18
            android.graphics.Typeface r2 = androidx.core.provider.FontsContractCompat.requestFont(r5, r6, r7, r8, r9, r10, r11)
            goto L6a
        L53:
            androidx.core.graphics.TypefaceCompatBaseImpl r2 = androidx.core.graphics.TypefaceCompat.sTypefaceCompatImpl
            r3 = r13
            androidx.core.content.res.FontResourcesParserCompat$FontFamilyFilesResourceEntry r3 = (androidx.core.content.res.FontResourcesParserCompat.FontFamilyFilesResourceEntry) r3
            r7 = r18
            android.graphics.Typeface r2 = r2.createFromFontFamilyFilesResourceEntry(r12, r3, r14, r7)
            if (r0 == 0) goto L6a
            if (r2 == 0) goto L66
            r0.callbackSuccessAsync(r2, r1)
            goto L6a
        L66:
            r3 = -3
            r0.callbackFailAsync(r3, r1)
        L6a:
            if (r2 == 0) goto L75
            androidx.collection.LruCache<java.lang.String, android.graphics.Typeface> r3 = androidx.core.graphics.TypefaceCompat.sTypefaceCache
            java.lang.String r4 = createResourceUid(r14, r15, r16, r17, r18)
            r3.put(r4, r2)
        L75:
            return r2
    }

    @java.lang.Deprecated
    public static android.graphics.Typeface createFromResourcesFontFile(android.content.Context r6, android.content.res.Resources r7, int r8, java.lang.String r9, int r10) {
            r4 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r5 = r10
            android.graphics.Typeface r6 = createFromResourcesFontFile(r0, r1, r2, r3, r4, r5)
            return r6
    }

    public static android.graphics.Typeface createFromResourcesFontFile(android.content.Context r6, android.content.res.Resources r7, int r8, java.lang.String r9, int r10, int r11) {
            androidx.core.graphics.TypefaceCompatBaseImpl r0 = androidx.core.graphics.TypefaceCompat.sTypefaceCompatImpl
            r1 = r6
            r2 = r7
            r3 = r8
            r4 = r9
            r5 = r11
            android.graphics.Typeface r6 = r0.createFromResourcesFontFile(r1, r2, r3, r4, r5)
            if (r6 == 0) goto L16
            java.lang.String r7 = createResourceUid(r2, r3, r4, r10, r5)
            androidx.collection.LruCache<java.lang.String, android.graphics.Typeface> r8 = androidx.core.graphics.TypefaceCompat.sTypefaceCache
            r8.put(r7, r6)
        L16:
            return r6
    }

    private static java.lang.String createResourceUid(android.content.res.Resources r2, int r3, java.lang.String r4, int r5, int r6) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r2.getResourcePackageName(r3)
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = 45
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r4)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r5)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r6)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @java.lang.Deprecated
    public static android.graphics.Typeface findFromCache(android.content.res.Resources r2, int r3, int r4) {
            r0 = 0
            r1 = 0
            android.graphics.Typeface r0 = findFromCache(r2, r3, r0, r1, r4)
            return r0
    }

    public static android.graphics.Typeface findFromCache(android.content.res.Resources r2, int r3, java.lang.String r4, int r5, int r6) {
            androidx.collection.LruCache<java.lang.String, android.graphics.Typeface> r0 = androidx.core.graphics.TypefaceCompat.sTypefaceCache
            java.lang.String r1 = createResourceUid(r2, r3, r4, r5, r6)
            java.lang.Object r0 = r0.get(r1)
            android.graphics.Typeface r0 = (android.graphics.Typeface) r0
            return r0
    }

    private static android.graphics.Typeface getBestFontFromFamily(android.content.Context r3, android.graphics.Typeface r4, int r5) {
            androidx.core.graphics.TypefaceCompatBaseImpl r0 = androidx.core.graphics.TypefaceCompat.sTypefaceCompatImpl
            androidx.core.content.res.FontResourcesParserCompat$FontFamilyFilesResourceEntry r0 = r0.getFontFamily(r4)
            if (r0 != 0) goto La
            r1 = 0
            return r1
        La:
            androidx.core.graphics.TypefaceCompatBaseImpl r1 = androidx.core.graphics.TypefaceCompat.sTypefaceCompatImpl
            android.content.res.Resources r2 = r3.getResources()
            android.graphics.Typeface r1 = r1.createFromFontFamilyFilesResourceEntry(r3, r0, r2, r5)
            return r1
    }

    public static android.graphics.Typeface getSystemFontFamily(java.lang.String r4) {
            r0 = 0
            if (r4 == 0) goto L1f
            boolean r1 = r4.isEmpty()
            if (r1 == 0) goto La
            goto L1f
        La:
            r1 = 0
            android.graphics.Typeface r2 = android.graphics.Typeface.create(r4, r1)
            android.graphics.Typeface r3 = android.graphics.Typeface.DEFAULT
            android.graphics.Typeface r1 = android.graphics.Typeface.create(r3, r1)
            if (r2 == 0) goto L1e
            boolean r3 = r2.equals(r1)
            if (r3 != 0) goto L1e
            r0 = r2
        L1e:
            return r0
        L1f:
            return r0
    }

    private static android.graphics.Typeface getSystemFontFamilyWithFallback(androidx.core.content.res.FontResourcesParserCompat.ProviderResourceEntry r12) {
            java.lang.String r0 = r12.getSystemFontFamilyName()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L11
            android.graphics.Typeface r1 = getSystemFontFamily(r0)
            if (r1 == 0) goto L11
            return r1
        L11:
            java.util.List r1 = r12.getRequests()
            int r2 = r1.size()
            r3 = 1
            if (r2 != r3) goto L2c
            r2 = 0
            java.lang.Object r2 = r1.get(r2)
            androidx.core.provider.FontRequest r2 = (androidx.core.provider.FontRequest) r2
            java.lang.String r2 = r2.getSystemFont()
            android.graphics.Typeface r2 = getSystemFontFamily(r2)
            return r2
        L2c:
            int r2 = android.os.Build.VERSION.SDK_INT
            r4 = 31
            r5 = 0
            if (r2 >= r4) goto L34
            return r5
        L34:
            r2 = 0
        L35:
            int r4 = r1.size()
            if (r2 >= r4) goto L4f
            java.lang.Object r4 = r1.get(r2)
            androidx.core.provider.FontRequest r4 = (androidx.core.provider.FontRequest) r4
            java.lang.String r4 = r4.getSystemFont()
            android.graphics.Typeface r4 = getSystemFontFamily(r4)
            if (r4 != 0) goto L4c
            return r5
        L4c:
            int r2 = r2 + 1
            goto L35
        L4f:
            r2 = 0
            r4 = 0
        L51:
            int r6 = r1.size()
            if (r4 >= r6) goto Led
            java.lang.Object r6 = r1.get(r4)
            androidx.core.provider.FontRequest r6 = (androidx.core.provider.FontRequest) r6
            int r7 = r1.size()
            int r7 = r7 - r3
            if (r4 != r7) goto L77
            java.lang.String r7 = r6.getVariationSettings()
            boolean r7 = android.text.TextUtils.isEmpty(r7)
            if (r7 == 0) goto L77
            java.lang.String r3 = r6.getSystemFont()
            r2.setSystemFallback(r3)
            goto Led
        L77:
            java.lang.String r7 = r6.getSystemFont()
            android.graphics.Typeface r7 = getSystemFontFamily(r7)
            android.graphics.fonts.Font r7 = guessPrimaryFont(r7)
            java.lang.String r8 = "TypefaceCompat"
            if (r7 != 0) goto La8
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r9 = "Unable identify the primary font for "
            java.lang.StringBuilder r3 = r3.append(r9)
            java.lang.String r9 = r6.getSystemFont()
            java.lang.StringBuilder r3 = r3.append(r9)
            java.lang.String r9 = ". Falling back to provider font."
            java.lang.StringBuilder r3 = r3.append(r9)
            java.lang.String r3 = r3.toString()
            android.util.Log.w(r8, r3)
            return r5
        La8:
            java.lang.String r9 = r6.getVariationSettings()
            boolean r9 = android.text.TextUtils.isEmpty(r9)
            if (r9 == 0) goto Ld4
            android.graphics.fonts.FontFamily$Builder r9 = new android.graphics.fonts.FontFamily$Builder     // Catch: java.io.IOException -> Lcd
            android.graphics.fonts.Font$Builder r10 = new android.graphics.fonts.Font$Builder     // Catch: java.io.IOException -> Lcd
            r10.<init>(r7)     // Catch: java.io.IOException -> Lcd
            java.lang.String r11 = r6.getVariationSettings()     // Catch: java.io.IOException -> Lcd
            android.graphics.fonts.Font$Builder r10 = r10.setFontVariationSettings(r11)     // Catch: java.io.IOException -> Lcd
            android.graphics.fonts.Font r10 = r10.build()     // Catch: java.io.IOException -> Lcd
            r9.<init>(r10)     // Catch: java.io.IOException -> Lcd
            android.graphics.fonts.FontFamily r8 = r9.build()     // Catch: java.io.IOException -> Lcd
            goto Ldd
        Lcd:
            r3 = move-exception
            java.lang.String r9 = "Failed to clone Font instance. Fall back to provider font."
            android.util.Log.e(r8, r9)
            return r5
        Ld4:
            android.graphics.fonts.FontFamily$Builder r8 = new android.graphics.fonts.FontFamily$Builder
            r8.<init>(r7)
            android.graphics.fonts.FontFamily r8 = r8.build()
        Ldd:
            if (r2 != 0) goto Le6
            android.graphics.Typeface$CustomFallbackBuilder r9 = new android.graphics.Typeface$CustomFallbackBuilder
            r9.<init>(r8)
            r2 = r9
            goto Le9
        Le6:
            r2.addCustomFallback(r8)
        Le9:
            int r4 = r4 + 1
            goto L51
        Led:
            android.graphics.Typeface r3 = r2.build()
            return r3
    }

    public static android.graphics.fonts.Font guessPrimaryFont(android.graphics.Typeface r10) {
            android.graphics.Paint r0 = androidx.core.graphics.TypefaceCompat.sCachedPaint
            if (r0 != 0) goto Lb
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>()
            androidx.core.graphics.TypefaceCompat.sCachedPaint = r0
        Lb:
            android.graphics.Paint r0 = androidx.core.graphics.TypefaceCompat.sCachedPaint
            r1 = 1092616192(0x41200000, float:10.0)
            r0.setTextSize(r1)
            android.graphics.Paint r0 = androidx.core.graphics.TypefaceCompat.sCachedPaint
            r0.setTypeface(r10)
            java.lang.String r0 = " "
            int r3 = r0.length()
            int r5 = r0.length()
            android.graphics.Paint r9 = androidx.core.graphics.TypefaceCompat.sCachedPaint
            java.lang.String r1 = " "
            r2 = 0
            r4 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            android.graphics.text.PositionedGlyphs r0 = android.graphics.text.TextRunShaper.shapeTextRun(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            int r1 = r0.glyphCount()
            if (r1 != 0) goto L37
            r1 = 0
            return r1
        L37:
            r1 = 0
            android.graphics.fonts.Font r1 = r0.getFont(r1)
            return r1
    }
}
