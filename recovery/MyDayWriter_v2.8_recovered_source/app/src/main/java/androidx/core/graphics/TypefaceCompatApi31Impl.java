package androidx.core.graphics;

/* JADX INFO: loaded from: classes.dex */
public class TypefaceCompatApi31Impl extends androidx.core.graphics.TypefaceCompatApi29Impl {
    private static final java.lang.String TAG = "TypefaceCompatApi31Impl";

    public TypefaceCompatApi31Impl() {
            r0 = this;
            r0.<init>()
            return
    }

    private static android.graphics.Typeface getSystemFontFamily(java.lang.String r3) {
            r0 = 0
            android.graphics.Typeface r1 = android.graphics.Typeface.create(r3, r0)
            android.graphics.Typeface r2 = android.graphics.Typeface.DEFAULT
            android.graphics.Typeface r0 = android.graphics.Typeface.create(r2, r0)
            if (r1 == 0) goto L15
            boolean r2 = r1.equals(r0)
            if (r2 != 0) goto L15
            r2 = r1
            goto L16
        L15:
            r2 = 0
        L16:
            return r2
    }

    @Override // androidx.core.graphics.TypefaceCompatApi29Impl
    protected android.graphics.fonts.Font getFontFromSystemFont(androidx.core.provider.FontsContractCompat.FontInfo r8) {
            r7 = this;
            java.lang.String r0 = r8.getSystemFont()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            android.graphics.Typeface r2 = getSystemFontFamily(r0)
            if (r2 != 0) goto Lf
            return r1
        Lf:
            android.graphics.fonts.Font r3 = androidx.core.graphics.TypefaceCompat.guessPrimaryFont(r2)
            if (r3 != 0) goto L16
            return r1
        L16:
            java.lang.String r4 = r8.getVariationSettings()
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 == 0) goto L21
            return r3
        L21:
            android.graphics.fonts.Font$Builder r4 = new android.graphics.fonts.Font$Builder     // Catch: java.io.IOException -> L33
            r4.<init>(r3)     // Catch: java.io.IOException -> L33
            java.lang.String r5 = r8.getVariationSettings()     // Catch: java.io.IOException -> L33
            android.graphics.fonts.Font$Builder r4 = r4.setFontVariationSettings(r5)     // Catch: java.io.IOException -> L33
            android.graphics.fonts.Font r1 = r4.build()     // Catch: java.io.IOException -> L33
            return r1
        L33:
            r4 = move-exception
            java.lang.String r5 = "TypefaceCompatApi31Impl"
            java.lang.String r6 = "Failed to clone Font instance. Fall back to provider font."
            android.util.Log.e(r5, r6)
            return r1
    }
}
