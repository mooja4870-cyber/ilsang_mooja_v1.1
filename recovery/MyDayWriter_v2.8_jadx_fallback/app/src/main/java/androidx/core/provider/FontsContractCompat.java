package androidx.core.provider;

/* JADX INFO: loaded from: classes.dex */
public class FontsContractCompat {

    @java.lang.Deprecated
    public static final java.lang.String PARCEL_FONT_RESULTS = "font_results";

    @java.lang.Deprecated
    static final int RESULT_CODE_PROVIDER_NOT_FOUND = -1;

    @java.lang.Deprecated
    static final int RESULT_CODE_WRONG_CERTIFICATES = -2;

    public static final class Columns implements android.provider.BaseColumns {
        public static final java.lang.String FILE_ID = "file_id";
        public static final java.lang.String ITALIC = "font_italic";
        public static final java.lang.String RESULT_CODE = "result_code";
        public static final int RESULT_CODE_FONT_NOT_FOUND = 1;
        public static final int RESULT_CODE_FONT_UNAVAILABLE = 2;
        public static final int RESULT_CODE_MALFORMED_QUERY = 3;
        public static final int RESULT_CODE_OK = 0;
        public static final java.lang.String TTC_INDEX = "font_ttc_index";
        public static final java.lang.String VARIATION_SETTINGS = "font_variation_settings";
        public static final java.lang.String WEIGHT = "font_weight";

        public Columns() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    public static class FontFamilyResult {
        public static final int STATUS_OK = 0;
        public static final int STATUS_UNEXPECTED_DATA_PROVIDED = 2;
        public static final int STATUS_WRONG_CERTIFICATES = 1;
        private final java.util.List<androidx.core.provider.FontsContractCompat.FontInfo[]> mFonts;
        private final int mStatusCode;

        FontFamilyResult(int r1, java.util.List<androidx.core.provider.FontsContractCompat.FontInfo[]> r2) {
                r0 = this;
                r0.<init>()
                r0.mStatusCode = r1
                r0.mFonts = r2
                return
        }

        @java.lang.Deprecated
        public FontFamilyResult(int r2, androidx.core.provider.FontsContractCompat.FontInfo[] r3) {
                r1 = this;
                r1.<init>()
                r1.mStatusCode = r2
                java.util.List r0 = java.util.Collections.singletonList(r3)
                r1.mFonts = r0
                return
        }

        static androidx.core.provider.FontsContractCompat.FontFamilyResult create(int r1, java.util.List<androidx.core.provider.FontsContractCompat.FontInfo[]> r2) {
                androidx.core.provider.FontsContractCompat$FontFamilyResult r0 = new androidx.core.provider.FontsContractCompat$FontFamilyResult
                r0.<init>(r1, r2)
                return r0
        }

        static androidx.core.provider.FontsContractCompat.FontFamilyResult create(int r1, androidx.core.provider.FontsContractCompat.FontInfo[] r2) {
                androidx.core.provider.FontsContractCompat$FontFamilyResult r0 = new androidx.core.provider.FontsContractCompat$FontFamilyResult
                r0.<init>(r1, r2)
                return r0
        }

        public androidx.core.provider.FontsContractCompat.FontInfo[] getFonts() {
                r2 = this;
                java.util.List<androidx.core.provider.FontsContractCompat$FontInfo[]> r0 = r2.mFonts
                r1 = 0
                java.lang.Object r0 = r0.get(r1)
                androidx.core.provider.FontsContractCompat$FontInfo[] r0 = (androidx.core.provider.FontsContractCompat.FontInfo[]) r0
                return r0
        }

        public java.util.List<androidx.core.provider.FontsContractCompat.FontInfo[]> getFontsWithFallbacks() {
                r1 = this;
                java.util.List<androidx.core.provider.FontsContractCompat$FontInfo[]> r0 = r1.mFonts
                return r0
        }

        public int getStatusCode() {
                r1 = this;
                int r0 = r1.mStatusCode
                return r0
        }

        boolean hasFallback() {
                r2 = this;
                java.util.List<androidx.core.provider.FontsContractCompat$FontInfo[]> r0 = r2.mFonts
                int r0 = r0.size()
                r1 = 1
                if (r0 <= r1) goto La
                goto Lb
            La:
                r1 = 0
            Lb:
                return r1
        }
    }

    public static class FontInfo {
        private final boolean mItalic;
        private final int mResultCode;
        private final int mTtcIndex;
        private final android.net.Uri mUri;
        private final java.lang.String mVariationSettings;
        private final int mWeight;

        @java.lang.Deprecated
        public FontInfo(android.net.Uri r8, int r9, int r10, boolean r11, int r12) {
                r7 = this;
                r5 = 0
                r0 = r7
                r1 = r8
                r2 = r9
                r3 = r10
                r4 = r11
                r6 = r12
                r0.<init>(r1, r2, r3, r4, r5, r6)
                return
        }

        public FontInfo(android.net.Uri r2, int r3, int r4, boolean r5, java.lang.String r6, int r7) {
                r1 = this;
                r1.<init>()
                java.lang.Object r0 = androidx.core.util.Preconditions.checkNotNull(r2)
                android.net.Uri r0 = (android.net.Uri) r0
                r1.mUri = r0
                r1.mTtcIndex = r3
                r1.mWeight = r4
                r1.mItalic = r5
                r1.mVariationSettings = r6
                r1.mResultCode = r7
                return
        }

        public FontInfo(java.lang.String r3, java.lang.String r4) {
                r2 = this;
                r2.<init>()
                android.net.Uri$Builder r0 = new android.net.Uri$Builder
                r0.<init>()
                java.lang.String r1 = "systemfont"
                android.net.Uri$Builder r0 = r0.scheme(r1)
                android.net.Uri$Builder r0 = r0.authority(r3)
                android.net.Uri r0 = r0.build()
                r2.mUri = r0
                r0 = 0
                r2.mTtcIndex = r0
                r1 = 400(0x190, float:5.6E-43)
                r2.mWeight = r1
                r2.mItalic = r0
                r2.mVariationSettings = r4
                r2.mResultCode = r0
                return
        }

        static androidx.core.provider.FontsContractCompat.FontInfo create(android.net.Uri r6, int r7, int r8, boolean r9, int r10) {
                androidx.core.provider.FontsContractCompat$FontInfo r0 = new androidx.core.provider.FontsContractCompat$FontInfo
                r1 = r6
                r2 = r7
                r3 = r8
                r4 = r9
                r5 = r10
                r0.<init>(r1, r2, r3, r4, r5)
                return r0
        }

        public int getResultCode() {
                r1 = this;
                int r0 = r1.mResultCode
                return r0
        }

        public java.lang.String getSystemFont() {
                r1 = this;
                boolean r0 = r1.isSystemFont()
                if (r0 == 0) goto Ld
                android.net.Uri r0 = r1.mUri
                java.lang.String r0 = r0.getAuthority()
                goto Le
            Ld:
                r0 = 0
            Le:
                return r0
        }

        public int getTtcIndex() {
                r1 = this;
                int r0 = r1.mTtcIndex
                return r0
        }

        public android.net.Uri getUri() {
                r1 = this;
                android.net.Uri r0 = r1.mUri
                return r0
        }

        public java.lang.String getVariationSettings() {
                r1 = this;
                java.lang.String r0 = r1.mVariationSettings
                return r0
        }

        public int getWeight() {
                r1 = this;
                int r0 = r1.mWeight
                return r0
        }

        public boolean isItalic() {
                r1 = this;
                boolean r0 = r1.mItalic
                return r0
        }

        public boolean isSystemFont() {
                r2 = this;
                android.net.Uri r0 = r2.mUri
                java.lang.String r0 = r0.getScheme()
                java.lang.String r1 = "systemfont"
                boolean r0 = java.util.Objects.equals(r0, r1)
                return r0
        }
    }

    public static class FontRequestCallback {
        public static final int FAIL_REASON_FONT_LOAD_ERROR = -3;
        public static final int FAIL_REASON_FONT_NOT_FOUND = 1;
        public static final int FAIL_REASON_FONT_UNAVAILABLE = 2;
        public static final int FAIL_REASON_MALFORMED_QUERY = 3;
        public static final int FAIL_REASON_PROVIDER_NOT_FOUND = -1;
        public static final int FAIL_REASON_SECURITY_VIOLATION = -4;
        public static final int FAIL_REASON_WRONG_CERTIFICATES = -2;

        @java.lang.Deprecated
        public static final int RESULT_OK = 0;
        static final int RESULT_SUCCESS = 0;

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public @interface FontRequestFailReason {
        }

        public FontRequestCallback() {
                r0 = this;
                r0.<init>()
                return
        }

        public void onTypefaceRequestFailed(int r1) {
                r0 = this;
                return
        }

        public void onTypefaceRetrieved(android.graphics.Typeface r1) {
                r0 = this;
                return
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface TypefaceStyle {
    }

    private FontsContractCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static android.graphics.Typeface buildTypeface(android.content.Context r1, android.os.CancellationSignal r2, androidx.core.provider.FontsContractCompat.FontInfo[] r3) {
            r0 = 0
            android.graphics.Typeface r0 = androidx.core.graphics.TypefaceCompat.createFromFontInfo(r1, r2, r3, r0)
            return r0
    }

    public static androidx.core.provider.FontsContractCompat.FontFamilyResult fetchFonts(android.content.Context r1, android.os.CancellationSignal r2, androidx.core.provider.FontRequest r3) throws android.content.pm.PackageManager.NameNotFoundException {
            java.util.List r0 = androidx.core.provider.FontRequestWorker$$ExternalSyntheticBackport0.m(r3)
            androidx.core.provider.FontsContractCompat$FontFamilyResult r0 = androidx.core.provider.FontProvider.getFontFamilyResult(r1, r0, r2)
            return r0
    }

    @java.lang.Deprecated
    public static android.graphics.Typeface getFontSync(android.content.Context r8, androidx.core.provider.FontRequest r9, androidx.core.content.res.ResourcesCompat.FontCallback r10, android.os.Handler r11, boolean r12, int r13, int r14) {
            androidx.core.graphics.TypefaceCompat$ResourcesCallbackAdapter r0 = new androidx.core.graphics.TypefaceCompat$ResourcesCallbackAdapter
            r0.<init>(r10)
            r7 = r0
            android.os.Handler r6 = androidx.core.content.res.ResourcesCompat.FontCallback.getHandler(r11)
            java.util.List r2 = androidx.core.provider.FontRequestWorker$$ExternalSyntheticBackport0.m(r9)
            r1 = r8
            r4 = r12
            r5 = r13
            r3 = r14
            android.graphics.Typeface r8 = requestFont(r1, r2, r3, r4, r5, r6, r7)
            return r8
    }

    @java.lang.Deprecated
    public static android.content.pm.ProviderInfo getProvider(android.content.pm.PackageManager r1, androidx.core.provider.FontRequest r2, android.content.res.Resources r3) throws android.content.pm.PackageManager.NameNotFoundException {
            android.content.pm.ProviderInfo r0 = androidx.core.provider.FontProvider.getProvider(r1, r2, r3)
            return r0
    }

    @java.lang.Deprecated
    public static java.util.Map<android.net.Uri, java.nio.ByteBuffer> prepareFontData(android.content.Context r1, androidx.core.provider.FontsContractCompat.FontInfo[] r2, android.os.CancellationSignal r3) {
            java.util.Map r0 = androidx.core.graphics.TypefaceCompatUtil.readFontInfoIntoByteBuffer(r1, r2, r3)
            return r0
    }

    public static android.graphics.Typeface requestFont(android.content.Context r7, androidx.core.provider.FontRequest r8, int r9, boolean r10, int r11, android.os.Handler r12, androidx.core.provider.FontsContractCompat.FontRequestCallback r13) {
            java.util.List r1 = androidx.core.provider.FontRequestWorker$$ExternalSyntheticBackport0.m(r8)
            r0 = r7
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            android.graphics.Typeface r7 = requestFont(r0, r1, r2, r3, r4, r5, r6)
            return r7
    }

    public static android.graphics.Typeface requestFont(android.content.Context r3, java.util.List<androidx.core.provider.FontRequest> r4, int r5, boolean r6, int r7, android.os.Handler r8, androidx.core.provider.FontsContractCompat.FontRequestCallback r9) {
            androidx.core.provider.CallbackWrapper r0 = new androidx.core.provider.CallbackWrapper
            java.util.concurrent.Executor r1 = androidx.core.provider.RequestExecutor.createHandlerExecutor(r8)
            r0.<init>(r9, r1)
            if (r6 == 0) goto L26
            int r1 = r4.size()
            r2 = 1
            if (r1 > r2) goto L1e
            r1 = 0
            java.lang.Object r1 = r4.get(r1)
            androidx.core.provider.FontRequest r1 = (androidx.core.provider.FontRequest) r1
            android.graphics.Typeface r1 = androidx.core.provider.FontRequestWorker.requestFontSync(r3, r1, r0, r5, r7)
            return r1
        L1e:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Fallbacks with blocking fetches are not supported for performance reasons"
            r1.<init>(r2)
            throw r1
        L26:
            r1 = 0
            android.graphics.Typeface r1 = androidx.core.provider.FontRequestWorker.requestFontAsync(r3, r4, r5, r1, r0)
            return r1
    }

    public static void requestFont(android.content.Context r3, androidx.core.provider.FontRequest r4, int r5, java.util.concurrent.Executor r6, java.util.concurrent.Executor r7, androidx.core.provider.FontsContractCompat.FontRequestCallback r8) {
            androidx.core.provider.CallbackWrapper r0 = new androidx.core.provider.CallbackWrapper
            r0.<init>(r8, r7)
            android.content.Context r1 = r3.getApplicationContext()
            java.util.List r2 = androidx.core.provider.FontRequestWorker$$ExternalSyntheticBackport0.m(r4)
            androidx.core.provider.FontRequestWorker.requestFontAsync(r1, r2, r5, r6, r0)
            return
    }

    @java.lang.Deprecated
    public static void requestFont(android.content.Context r5, androidx.core.provider.FontRequest r6, androidx.core.provider.FontsContractCompat.FontRequestCallback r7, android.os.Handler r8) {
            androidx.core.provider.CallbackWrapper r0 = new androidx.core.provider.CallbackWrapper
            r0.<init>(r7)
            java.util.concurrent.Executor r1 = androidx.core.provider.RequestExecutor.createHandlerExecutor(r8)
            android.content.Context r2 = r5.getApplicationContext()
            java.util.List r3 = androidx.core.provider.FontRequestWorker$$ExternalSyntheticBackport0.m(r6)
            r4 = 0
            androidx.core.provider.FontRequestWorker.requestFontAsync(r2, r3, r4, r1, r0)
            return
    }

    public static void requestFontWithFallbackChain(android.content.Context r2, java.util.List<androidx.core.provider.FontRequest> r3, int r4, java.util.concurrent.Executor r5, java.util.concurrent.Executor r6, androidx.core.provider.FontsContractCompat.FontRequestCallback r7) {
            androidx.core.provider.CallbackWrapper r0 = new androidx.core.provider.CallbackWrapper
            r0.<init>(r7, r6)
            android.content.Context r1 = r2.getApplicationContext()
            androidx.core.provider.FontRequestWorker.requestFontAsync(r1, r3, r4, r5, r0)
            return
    }

    @java.lang.Deprecated
    public static void resetCache() {
            androidx.core.provider.FontRequestWorker.resetTypefaceCache()
            return
    }

    public static void resetTypefaceCache() {
            androidx.core.provider.FontRequestWorker.resetTypefaceCache()
            return
    }
}
