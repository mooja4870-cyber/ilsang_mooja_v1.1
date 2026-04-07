package androidx.core.graphics;

/* JADX INFO: loaded from: classes.dex */
public class TypefaceCompatApi29Impl extends androidx.core.graphics.TypefaceCompatBaseImpl {
    private static final java.lang.String TAG = "TypefaceCompatApi29Impl";

    public TypefaceCompatApi29Impl() {
            r0 = this;
            r0.<init>()
            return
    }

    private android.graphics.fonts.Font findBaseFont(android.graphics.fonts.FontFamily r7, int r8) {
            r6 = this;
            android.graphics.fonts.FontStyle r0 = new android.graphics.fonts.FontStyle
            r1 = r8 & 1
            if (r1 == 0) goto L9
            r1 = 700(0x2bc, float:9.81E-43)
            goto Lb
        L9:
            r1 = 400(0x190, float:5.6E-43)
        Lb:
            r2 = r8 & 2
            r3 = 0
            if (r2 == 0) goto L12
            r2 = 1
            goto L13
        L12:
            r2 = r3
        L13:
            r0.<init>(r1, r2)
            android.graphics.fonts.Font r1 = r7.getFont(r3)
            android.graphics.fonts.FontStyle r2 = r1.getStyle()
            int r2 = getMatchScore(r0, r2)
            r3 = 1
        L23:
            int r4 = r7.getSize()
            if (r3 >= r4) goto L3c
            android.graphics.fonts.Font r4 = r7.getFont(r3)
            android.graphics.fonts.FontStyle r5 = r4.getStyle()
            int r5 = getMatchScore(r0, r5)
            if (r5 >= r2) goto L39
            r1 = r4
            r2 = r5
        L39:
            int r3 = r3 + 1
            goto L23
        L3c:
            return r1
    }

    private android.graphics.fonts.Font getFont(android.os.CancellationSignal r2, androidx.core.provider.FontsContractCompat.FontInfo r3, android.content.ContentResolver r4) {
            r1 = this;
            boolean r0 = r3.isSystemFont()
            if (r0 == 0) goto Lb
            android.graphics.fonts.Font r0 = r1.getFontFromSystemFont(r3)
            return r0
        Lb:
            android.graphics.fonts.Font r0 = r1.getFontFromProvider(r2, r3, r4)
            return r0
    }

    private android.graphics.fonts.Font getFontFromProvider(android.os.CancellationSignal r5, androidx.core.provider.FontsContractCompat.FontInfo r6, android.content.ContentResolver r7) {
            r4 = this;
            r0 = 0
            android.net.Uri r1 = r6.getUri()     // Catch: java.io.IOException -> L5d
            java.lang.String r2 = "r"
            android.os.ParcelFileDescriptor r1 = r7.openFileDescriptor(r1, r2, r5)     // Catch: java.io.IOException -> L5d
            if (r1 != 0) goto L14
        Le:
            if (r1 == 0) goto L13
            r1.close()     // Catch: java.io.IOException -> L5d
        L13:
            return r0
        L14:
            android.graphics.fonts.Font$Builder r2 = new android.graphics.fonts.Font$Builder     // Catch: java.lang.Throwable -> L51
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L51
            int r3 = r6.getWeight()     // Catch: java.lang.Throwable -> L51
            android.graphics.fonts.Font$Builder r2 = r2.setWeight(r3)     // Catch: java.lang.Throwable -> L51
            boolean r3 = r6.isItalic()     // Catch: java.lang.Throwable -> L51
            if (r3 == 0) goto L29
            r3 = 1
            goto L2a
        L29:
            r3 = 0
        L2a:
            android.graphics.fonts.Font$Builder r2 = r2.setSlant(r3)     // Catch: java.lang.Throwable -> L51
            int r3 = r6.getTtcIndex()     // Catch: java.lang.Throwable -> L51
            android.graphics.fonts.Font$Builder r2 = r2.setTtcIndex(r3)     // Catch: java.lang.Throwable -> L51
            java.lang.String r3 = r6.getVariationSettings()     // Catch: java.lang.Throwable -> L51
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L51
            if (r3 != 0) goto L47
            java.lang.String r3 = r6.getVariationSettings()     // Catch: java.lang.Throwable -> L51
            r2.setFontVariationSettings(r3)     // Catch: java.lang.Throwable -> L51
        L47:
            android.graphics.fonts.Font r3 = r2.build()     // Catch: java.lang.Throwable -> L51
            if (r1 == 0) goto L50
            r1.close()     // Catch: java.io.IOException -> L5d
        L50:
            return r3
        L51:
            r2 = move-exception
            if (r1 == 0) goto L5c
            r1.close()     // Catch: java.lang.Throwable -> L58
            goto L5c
        L58:
            r3 = move-exception
            r2.addSuppressed(r3)     // Catch: java.io.IOException -> L5d
        L5c:
            throw r2     // Catch: java.io.IOException -> L5d
        L5d:
            r1 = move-exception
            java.lang.String r2 = "TypefaceCompatApi29Impl"
            java.lang.String r3 = "Font load failed"
            android.util.Log.w(r2, r3, r1)
            return r0
    }

    private static int getMatchScore(android.graphics.fonts.FontStyle r3, android.graphics.fonts.FontStyle r4) {
            int r0 = r3.getWeight()
            int r1 = r4.getWeight()
            int r0 = r0 - r1
            int r0 = java.lang.Math.abs(r0)
            int r0 = r0 / 100
            int r1 = r3.getSlant()
            int r2 = r4.getSlant()
            if (r1 != r2) goto L1b
            r1 = 0
            goto L1c
        L1b:
            r1 = 2
        L1c:
            int r0 = r0 + r1
            return r0
    }

    @Override // androidx.core.graphics.TypefaceCompatBaseImpl
    public android.graphics.Typeface createFromFontFamilyFilesResourceEntry(android.content.Context r10, androidx.core.content.res.FontResourcesParserCompat.FontFamilyFilesResourceEntry r11, android.content.res.Resources r12, int r13) {
            r9 = this;
            r0 = 0
            r1 = 0
            androidx.core.content.res.FontResourcesParserCompat$FontFileResourceEntry[] r2 = r11.getEntries()     // Catch: java.lang.Exception -> L6d
            int r3 = r2.length     // Catch: java.lang.Exception -> L6d
            r4 = 0
            r5 = r4
        L9:
            if (r5 >= r3) goto L50
            r6 = r2[r5]     // Catch: java.lang.Exception -> L6d
            android.graphics.fonts.Font$Builder r7 = new android.graphics.fonts.Font$Builder     // Catch: java.io.IOException -> L4c java.lang.Exception -> L6d
            int r8 = r6.getResourceId()     // Catch: java.io.IOException -> L4c java.lang.Exception -> L6d
            r7.<init>(r12, r8)     // Catch: java.io.IOException -> L4c java.lang.Exception -> L6d
            int r8 = r6.getWeight()     // Catch: java.io.IOException -> L4c java.lang.Exception -> L6d
            android.graphics.fonts.Font$Builder r7 = r7.setWeight(r8)     // Catch: java.io.IOException -> L4c java.lang.Exception -> L6d
            boolean r8 = r6.isItalic()     // Catch: java.io.IOException -> L4c java.lang.Exception -> L6d
            if (r8 == 0) goto L26
            r8 = 1
            goto L27
        L26:
            r8 = r4
        L27:
            android.graphics.fonts.Font$Builder r7 = r7.setSlant(r8)     // Catch: java.io.IOException -> L4c java.lang.Exception -> L6d
            int r8 = r6.getTtcIndex()     // Catch: java.io.IOException -> L4c java.lang.Exception -> L6d
            android.graphics.fonts.Font$Builder r7 = r7.setTtcIndex(r8)     // Catch: java.io.IOException -> L4c java.lang.Exception -> L6d
            java.lang.String r8 = r6.getVariationSettings()     // Catch: java.io.IOException -> L4c java.lang.Exception -> L6d
            android.graphics.fonts.Font$Builder r7 = r7.setFontVariationSettings(r8)     // Catch: java.io.IOException -> L4c java.lang.Exception -> L6d
            android.graphics.fonts.Font r7 = r7.build()     // Catch: java.io.IOException -> L4c java.lang.Exception -> L6d
            if (r0 != 0) goto L48
            android.graphics.fonts.FontFamily$Builder r8 = new android.graphics.fonts.FontFamily$Builder     // Catch: java.io.IOException -> L4c java.lang.Exception -> L6d
            r8.<init>(r7)     // Catch: java.io.IOException -> L4c java.lang.Exception -> L6d
            r0 = r8
            goto L4b
        L48:
            r0.addFont(r7)     // Catch: java.io.IOException -> L4c java.lang.Exception -> L6d
        L4b:
            goto L4d
        L4c:
            r7 = move-exception
        L4d:
            int r5 = r5 + 1
            goto L9
        L50:
            if (r0 != 0) goto L53
            return r1
        L53:
            android.graphics.fonts.FontFamily r2 = r0.build()     // Catch: java.lang.Exception -> L6d
            android.graphics.Typeface$CustomFallbackBuilder r3 = new android.graphics.Typeface$CustomFallbackBuilder     // Catch: java.lang.Exception -> L6d
            r3.<init>(r2)     // Catch: java.lang.Exception -> L6d
            android.graphics.fonts.Font r4 = r9.findBaseFont(r2, r13)     // Catch: java.lang.Exception -> L6d
            android.graphics.fonts.FontStyle r4 = r4.getStyle()     // Catch: java.lang.Exception -> L6d
            android.graphics.Typeface$CustomFallbackBuilder r3 = r3.setStyle(r4)     // Catch: java.lang.Exception -> L6d
            android.graphics.Typeface r1 = r3.build()     // Catch: java.lang.Exception -> L6d
            return r1
        L6d:
            r0 = move-exception
            java.lang.String r2 = "TypefaceCompatApi29Impl"
            java.lang.String r3 = "Font load failed"
            android.util.Log.w(r2, r3, r0)
            return r1
    }

    @Override // androidx.core.graphics.TypefaceCompatBaseImpl
    public android.graphics.Typeface createFromFontInfo(android.content.Context r6, android.os.CancellationSignal r7, androidx.core.provider.FontsContractCompat.FontInfo[] r8, int r9) {
            r5 = this;
            android.content.ContentResolver r0 = r6.getContentResolver()
            r1 = 0
            android.graphics.fonts.FontFamily r2 = r5.getFontFamily(r7, r8, r0)     // Catch: java.lang.Exception -> L22
            if (r2 != 0) goto Lc
            return r1
        Lc:
            android.graphics.Typeface$CustomFallbackBuilder r3 = new android.graphics.Typeface$CustomFallbackBuilder     // Catch: java.lang.Exception -> L22
            r3.<init>(r2)     // Catch: java.lang.Exception -> L22
            android.graphics.fonts.Font r4 = r5.findBaseFont(r2, r9)     // Catch: java.lang.Exception -> L22
            android.graphics.fonts.FontStyle r4 = r4.getStyle()     // Catch: java.lang.Exception -> L22
            android.graphics.Typeface$CustomFallbackBuilder r3 = r3.setStyle(r4)     // Catch: java.lang.Exception -> L22
            android.graphics.Typeface r1 = r3.build()     // Catch: java.lang.Exception -> L22
            return r1
        L22:
            r2 = move-exception
            java.lang.String r3 = "TypefaceCompatApi29Impl"
            java.lang.String r4 = "Font load failed"
            android.util.Log.w(r3, r4, r2)
            return r1
    }

    @Override // androidx.core.graphics.TypefaceCompatBaseImpl
    public android.graphics.Typeface createFromFontInfoWithFallback(android.content.Context r7, android.os.CancellationSignal r8, java.util.List<androidx.core.provider.FontsContractCompat.FontInfo[]> r9, int r10) {
            r6 = this;
            android.content.ContentResolver r0 = r7.getContentResolver()
            r1 = 0
            r2 = 0
            java.lang.Object r1 = r9.get(r1)     // Catch: java.lang.Exception -> L42
            androidx.core.provider.FontsContractCompat$FontInfo[] r1 = (androidx.core.provider.FontsContractCompat.FontInfo[]) r1     // Catch: java.lang.Exception -> L42
            android.graphics.fonts.FontFamily r1 = r6.getFontFamily(r8, r1, r0)     // Catch: java.lang.Exception -> L42
            if (r1 != 0) goto L13
            return r2
        L13:
            android.graphics.Typeface$CustomFallbackBuilder r3 = new android.graphics.Typeface$CustomFallbackBuilder     // Catch: java.lang.Exception -> L42
            r3.<init>(r1)     // Catch: java.lang.Exception -> L42
            r4 = 1
        L19:
            int r5 = r9.size()     // Catch: java.lang.Exception -> L42
            if (r4 >= r5) goto L31
            java.lang.Object r5 = r9.get(r4)     // Catch: java.lang.Exception -> L42
            androidx.core.provider.FontsContractCompat$FontInfo[] r5 = (androidx.core.provider.FontsContractCompat.FontInfo[]) r5     // Catch: java.lang.Exception -> L42
            android.graphics.fonts.FontFamily r5 = r6.getFontFamily(r8, r5, r0)     // Catch: java.lang.Exception -> L42
            if (r5 == 0) goto L2e
            r3.addCustomFallback(r5)     // Catch: java.lang.Exception -> L42
        L2e:
            int r4 = r4 + 1
            goto L19
        L31:
            android.graphics.fonts.Font r4 = r6.findBaseFont(r1, r10)     // Catch: java.lang.Exception -> L42
            android.graphics.fonts.FontStyle r4 = r4.getStyle()     // Catch: java.lang.Exception -> L42
            android.graphics.Typeface$CustomFallbackBuilder r4 = r3.setStyle(r4)     // Catch: java.lang.Exception -> L42
            android.graphics.Typeface r2 = r4.build()     // Catch: java.lang.Exception -> L42
            return r2
        L42:
            r1 = move-exception
            java.lang.String r3 = "TypefaceCompatApi29Impl"
            java.lang.String r4 = "Font load failed"
            android.util.Log.w(r3, r4, r1)
            return r2
    }

    @Override // androidx.core.graphics.TypefaceCompatBaseImpl
    protected android.graphics.Typeface createFromInputStream(android.content.Context r3, java.io.InputStream r4) {
            r2 = this;
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Do not use this function in API 29 or later."
            r0.<init>(r1)
            throw r0
    }

    @Override // androidx.core.graphics.TypefaceCompatBaseImpl
    public android.graphics.Typeface createFromResourcesFontFile(android.content.Context r6, android.content.res.Resources r7, int r8, java.lang.String r9, int r10) {
            r5 = this;
            r0 = 0
            r1 = 0
            android.graphics.fonts.Font$Builder r2 = new android.graphics.fonts.Font$Builder     // Catch: java.lang.Exception -> L28
            r2.<init>(r7, r8)     // Catch: java.lang.Exception -> L28
            android.graphics.fonts.Font r2 = r2.build()     // Catch: java.lang.Exception -> L28
            r1 = r2
            android.graphics.fonts.FontFamily$Builder r2 = new android.graphics.fonts.FontFamily$Builder     // Catch: java.lang.Exception -> L28
            r2.<init>(r1)     // Catch: java.lang.Exception -> L28
            android.graphics.fonts.FontFamily r2 = r2.build()     // Catch: java.lang.Exception -> L28
            r0 = r2
            android.graphics.Typeface$CustomFallbackBuilder r2 = new android.graphics.Typeface$CustomFallbackBuilder     // Catch: java.lang.Exception -> L28
            r2.<init>(r0)     // Catch: java.lang.Exception -> L28
            android.graphics.fonts.FontStyle r3 = r1.getStyle()     // Catch: java.lang.Exception -> L28
            android.graphics.Typeface$CustomFallbackBuilder r2 = r2.setStyle(r3)     // Catch: java.lang.Exception -> L28
            android.graphics.Typeface r2 = r2.build()     // Catch: java.lang.Exception -> L28
            return r2
        L28:
            r2 = move-exception
            java.lang.String r3 = "TypefaceCompatApi29Impl"
            java.lang.String r4 = "Font load failed"
            android.util.Log.w(r3, r4, r2)
            r3 = 0
            return r3
    }

    @Override // androidx.core.graphics.TypefaceCompatBaseImpl
    android.graphics.Typeface createWeightStyle(android.content.Context r2, android.graphics.Typeface r3, int r4, boolean r5) {
            r1 = this;
            android.graphics.Typeface r0 = android.graphics.Typeface.create(r3, r4, r5)
            return r0
    }

    @Override // androidx.core.graphics.TypefaceCompatBaseImpl
    protected androidx.core.provider.FontsContractCompat.FontInfo findBestInfo(androidx.core.provider.FontsContractCompat.FontInfo[] r3, int r4) {
            r2 = this;
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Do not use this function in API 29 or later."
            r0.<init>(r1)
            throw r0
    }

    protected android.graphics.fonts.FontFamily getFontFamily(android.os.CancellationSignal r7, androidx.core.provider.FontsContractCompat.FontInfo[] r8, android.content.ContentResolver r9) {
            r6 = this;
            r0 = 0
            int r1 = r8.length
            r2 = 0
        L3:
            if (r2 >= r1) goto L1d
            r3 = r8[r2]
            android.graphics.fonts.Font r4 = r6.getFont(r7, r3, r9)
            if (r4 != 0) goto Le
            goto L1a
        Le:
            if (r0 != 0) goto L17
            android.graphics.fonts.FontFamily$Builder r5 = new android.graphics.fonts.FontFamily$Builder
            r5.<init>(r4)
            r0 = r5
            goto L1a
        L17:
            r0.addFont(r4)
        L1a:
            int r2 = r2 + 1
            goto L3
        L1d:
            if (r0 != 0) goto L21
            r1 = 0
            return r1
        L21:
            android.graphics.fonts.FontFamily r1 = r0.build()
            return r1
    }

    protected android.graphics.fonts.Font getFontFromSystemFont(androidx.core.provider.FontsContractCompat.FontInfo r3) {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Getting font from Typeface is not supported before API31"
            r0.<init>(r1)
            throw r0
    }
}
