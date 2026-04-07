package androidx.core.content.res;

/* JADX INFO: loaded from: classes.dex */
public class FontResourcesParserCompat {
    private static final int DEFAULT_TIMEOUT_MILLIS = 500;
    public static final int FETCH_STRATEGY_ASYNC = 1;
    public static final int FETCH_STRATEGY_BLOCKING = 0;
    public static final int INFINITE_TIMEOUT_VALUE = -1;
    private static final int ITALIC = 1;
    private static final int NORMAL_WEIGHT = 400;

    static class Api21Impl {
        private Api21Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static int getType(android.content.res.TypedArray r1, int r2) {
                int r0 = r1.getType(r2)
                return r0
        }
    }

    public interface FamilyResourceEntry {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface FetchStrategy {
    }

    public static final class FontFamilyFilesResourceEntry implements androidx.core.content.res.FontResourcesParserCompat.FamilyResourceEntry {
        private final androidx.core.content.res.FontResourcesParserCompat.FontFileResourceEntry[] mEntries;

        public FontFamilyFilesResourceEntry(androidx.core.content.res.FontResourcesParserCompat.FontFileResourceEntry[] r1) {
                r0 = this;
                r0.<init>()
                r0.mEntries = r1
                return
        }

        public androidx.core.content.res.FontResourcesParserCompat.FontFileResourceEntry[] getEntries() {
                r1 = this;
                androidx.core.content.res.FontResourcesParserCompat$FontFileResourceEntry[] r0 = r1.mEntries
                return r0
        }
    }

    public static final class FontFileResourceEntry {
        private final java.lang.String mFileName;
        private final boolean mItalic;
        private final int mResourceId;
        private final int mTtcIndex;
        private final java.lang.String mVariationSettings;
        private final int mWeight;

        public FontFileResourceEntry(java.lang.String r1, int r2, boolean r3, java.lang.String r4, int r5, int r6) {
                r0 = this;
                r0.<init>()
                r0.mFileName = r1
                r0.mWeight = r2
                r0.mItalic = r3
                r0.mVariationSettings = r4
                r0.mTtcIndex = r5
                r0.mResourceId = r6
                return
        }

        public java.lang.String getFileName() {
                r1 = this;
                java.lang.String r0 = r1.mFileName
                return r0
        }

        public int getResourceId() {
                r1 = this;
                int r0 = r1.mResourceId
                return r0
        }

        public int getTtcIndex() {
                r1 = this;
                int r0 = r1.mTtcIndex
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
    }

    public static final class ProviderResourceEntry implements androidx.core.content.res.FontResourcesParserCompat.FamilyResourceEntry {
        private final java.util.List<androidx.core.provider.FontRequest> mRequests;
        private final int mStrategy;
        private final java.lang.String mSystemFontFamilyName;
        private final int mTimeoutMs;

        public ProviderResourceEntry(androidx.core.provider.FontRequest r3, int r4, int r5) {
                r2 = this;
                java.util.List r0 = java.util.Collections.singletonList(r3)
                r1 = 0
                r2.<init>(r0, r4, r5, r1)
                return
        }

        public ProviderResourceEntry(java.util.List<androidx.core.provider.FontRequest> r1, int r2, int r3, java.lang.String r4) {
                r0 = this;
                r0.<init>()
                r0.mRequests = r1
                r0.mStrategy = r2
                r0.mTimeoutMs = r3
                r0.mSystemFontFamilyName = r4
                return
        }

        public androidx.core.provider.FontRequest getFallbackRequest() {
                r2 = this;
                java.util.List<androidx.core.provider.FontRequest> r0 = r2.mRequests
                int r0 = r0.size()
                r1 = 2
                if (r0 >= r1) goto Lb
                r0 = 0
                return r0
            Lb:
                java.util.List<androidx.core.provider.FontRequest> r0 = r2.mRequests
                r1 = 1
                java.lang.Object r0 = r0.get(r1)
                androidx.core.provider.FontRequest r0 = (androidx.core.provider.FontRequest) r0
                return r0
        }

        public int getFetchStrategy() {
                r1 = this;
                int r0 = r1.mStrategy
                return r0
        }

        public androidx.core.provider.FontRequest getRequest() {
                r2 = this;
                java.util.List<androidx.core.provider.FontRequest> r0 = r2.mRequests
                r1 = 0
                java.lang.Object r0 = r0.get(r1)
                androidx.core.provider.FontRequest r0 = (androidx.core.provider.FontRequest) r0
                return r0
        }

        public java.util.List<androidx.core.provider.FontRequest> getRequests() {
                r1 = this;
                java.util.List<androidx.core.provider.FontRequest> r0 = r1.mRequests
                return r0
        }

        public java.lang.String getSystemFontFamilyName() {
                r1 = this;
                java.lang.String r0 = r1.mSystemFontFamilyName
                return r0
        }

        public int getTimeout() {
                r1 = this;
                int r0 = r1.mTimeoutMs
                return r0
        }
    }

    private FontResourcesParserCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    private static int getType(android.content.res.TypedArray r1, int r2) {
            int r0 = androidx.core.content.res.FontResourcesParserCompat.Api21Impl.getType(r1, r2)
            return r0
    }

    public static androidx.core.content.res.FontResourcesParserCompat.FamilyResourceEntry parse(org.xmlpull.v1.XmlPullParser r3, android.content.res.Resources r4) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        L1:
            int r0 = r3.next()
            r1 = r0
            r2 = 2
            if (r0 == r2) goto Ld
            r0 = 1
            if (r1 == r0) goto Ld
            goto L1
        Ld:
            if (r1 != r2) goto L14
            androidx.core.content.res.FontResourcesParserCompat$FamilyResourceEntry r0 = readFamilies(r3, r4)
            return r0
        L14:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r2 = "No start tag found"
            r0.<init>(r2)
            throw r0
    }

    public static java.util.List<java.util.List<byte[]>> readCerts(android.content.res.Resources r6, int r7) {
            if (r7 != 0) goto L7
            java.util.List r0 = java.util.Collections.emptyList()
            return r0
        L7:
            android.content.res.TypedArray r0 = r6.obtainTypedArray(r7)
            int r1 = r0.length()     // Catch: java.lang.Throwable -> L52
            if (r1 != 0) goto L19
            java.util.List r1 = java.util.Collections.emptyList()     // Catch: java.lang.Throwable -> L52
            r0.recycle()
            return r1
        L19:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L52
            r1.<init>()     // Catch: java.lang.Throwable -> L52
            r2 = 0
            int r3 = getType(r0, r2)     // Catch: java.lang.Throwable -> L52
            r4 = 1
            if (r3 != r4) goto L42
            r3 = 0
        L27:
            int r4 = r0.length()     // Catch: java.lang.Throwable -> L52
            if (r3 >= r4) goto L41
            int r4 = r0.getResourceId(r3, r2)     // Catch: java.lang.Throwable -> L52
            if (r4 == 0) goto L3e
            java.lang.String[] r5 = r6.getStringArray(r4)     // Catch: java.lang.Throwable -> L52
            java.util.List r5 = toByteArrayList(r5)     // Catch: java.lang.Throwable -> L52
            r1.add(r5)     // Catch: java.lang.Throwable -> L52
        L3e:
            int r3 = r3 + 1
            goto L27
        L41:
            goto L4d
        L42:
            java.lang.String[] r2 = r6.getStringArray(r7)     // Catch: java.lang.Throwable -> L52
            java.util.List r2 = toByteArrayList(r2)     // Catch: java.lang.Throwable -> L52
            r1.add(r2)     // Catch: java.lang.Throwable -> L52
        L4d:
            r0.recycle()
            return r1
        L52:
            r1 = move-exception
            r0.recycle()
            throw r1
    }

    private static androidx.core.provider.FontRequest readFallback(org.xmlpull.v1.XmlPullParser r10, android.content.res.Resources r11, java.lang.String r12, java.lang.String r13, java.util.List<java.util.List<byte[]>> r14) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
            android.util.AttributeSet r1 = android.util.Xml.asAttributeSet(r10)
            int[] r0 = androidx.core.R.styleable.FontFamilyProviderFallback
            android.content.res.TypedArray r2 = r11.obtainAttributes(r1, r0)
            int r0 = androidx.core.R.styleable.FontFamilyProviderFallback_fontProviderQuery     // Catch: java.lang.Throwable -> L4c
            java.lang.String r0 = r2.getString(r0)     // Catch: java.lang.Throwable -> L4c
            r6 = r0
            int r0 = androidx.core.R.styleable.FontFamilyProviderFallback_fontProviderSystemFontFamily     // Catch: java.lang.Throwable -> L4c
            java.lang.String r8 = r2.getString(r0)     // Catch: java.lang.Throwable -> L4c
            int r0 = androidx.core.R.styleable.FontFamilyProviderFallback_fontVariationSettings     // Catch: java.lang.Throwable -> L4c
            java.lang.String r9 = r2.getString(r0)     // Catch: java.lang.Throwable -> L4c
            if (r6 == 0) goto L3e
        L1f:
            int r0 = r10.next()     // Catch: java.lang.Throwable -> L4c
            r3 = 3
            if (r0 == r3) goto L30
            skip(r10)     // Catch: java.lang.Throwable -> L2a
            goto L1f
        L2a:
            r0 = move-exception
            r4 = r12
            r5 = r13
            r7 = r14
            r12 = r0
            goto L51
        L30:
            androidx.core.provider.FontRequest r3 = new androidx.core.provider.FontRequest     // Catch: java.lang.Throwable -> L4c
            r4 = r12
            r5 = r13
            r7 = r14
            r3.<init>(r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L49
            if (r2 == 0) goto L3d
            androidx.core.content.res.FontResourcesParserCompat$$ExternalSyntheticAutoCloseableDispatcher0.m(r2)
        L3d:
            return r3
        L3e:
            r4 = r12
            r5 = r13
            r7 = r14
            org.xmlpull.v1.XmlPullParserException r12 = new org.xmlpull.v1.XmlPullParserException     // Catch: java.lang.Throwable -> L49
            java.lang.String r13 = "query attribute must be set in fallback element"
            r12.<init>(r13)     // Catch: java.lang.Throwable -> L49
            throw r12     // Catch: java.lang.Throwable -> L49
        L49:
            r0 = move-exception
            r12 = r0
            goto L51
        L4c:
            r0 = move-exception
            r4 = r12
            r5 = r13
            r7 = r14
            r12 = r0
        L51:
            if (r2 == 0) goto L5c
            androidx.core.content.res.FontResourcesParserCompat$$ExternalSyntheticAutoCloseableDispatcher0.m(r2)     // Catch: java.lang.Throwable -> L57
            goto L5c
        L57:
            r0 = move-exception
            r13 = r0
            r12.addSuppressed(r13)
        L5c:
            throw r12
    }

    private static androidx.core.content.res.FontResourcesParserCompat.FamilyResourceEntry readFamilies(org.xmlpull.v1.XmlPullParser r3, android.content.res.Resources r4) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
            r0 = 2
            r1 = 0
            java.lang.String r2 = "font-family"
            r3.require(r0, r1, r2)
            java.lang.String r0 = r3.getName()
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L16
            androidx.core.content.res.FontResourcesParserCompat$FamilyResourceEntry r1 = readFamily(r3, r4)
            return r1
        L16:
            skip(r3)
            return r1
    }

    private static androidx.core.content.res.FontResourcesParserCompat.FamilyResourceEntry readFamily(org.xmlpull.v1.XmlPullParser r18, android.content.res.Resources r19) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
            r0 = r19
            android.util.AttributeSet r1 = android.util.Xml.asAttributeSet(r18)
            int[] r2 = androidx.core.R.styleable.FontFamily
            android.content.res.TypedArray r2 = r0.obtainAttributes(r1, r2)
            int r3 = androidx.core.R.styleable.FontFamily_fontProviderAuthority
            java.lang.String r5 = r2.getString(r3)
            int r3 = androidx.core.R.styleable.FontFamily_fontProviderPackage
            java.lang.String r6 = r2.getString(r3)
            int r3 = androidx.core.R.styleable.FontFamily_fontProviderQuery
            java.lang.String r7 = r2.getString(r3)
            int r3 = androidx.core.R.styleable.FontFamily_fontProviderFallbackQuery
            java.lang.String r3 = r2.getString(r3)
            int r4 = androidx.core.R.styleable.FontFamily_fontProviderCerts
            r8 = 0
            int r11 = r2.getResourceId(r4, r8)
            int r4 = androidx.core.R.styleable.FontFamily_fontProviderFetchStrategy
            r9 = 1
            int r12 = r2.getInteger(r4, r9)
            int r4 = androidx.core.R.styleable.FontFamily_fontProviderFetchTimeout
            r10 = 500(0x1f4, float:7.0E-43)
            int r13 = r2.getInteger(r4, r10)
            int r4 = androidx.core.R.styleable.FontFamily_fontProviderSystemFontFamily
            java.lang.String r14 = r2.getString(r4)
            r2.recycle()
            if (r5 == 0) goto L48
            if (r6 == 0) goto L48
            goto L49
        L48:
            r9 = r8
        L49:
            r15 = r9
            r9 = 3
            if (r15 == 0) goto Lc7
            java.util.List r8 = readCerts(r0, r11)
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
        L56:
            int r4 = r18.next()
            if (r4 == r9) goto L88
            int r4 = r18.getEventType()
            r9 = 2
            if (r4 == r9) goto L65
            r9 = 3
            goto L56
        L65:
            java.lang.String r4 = r18.getName()
            java.lang.String r9 = "fallback"
            boolean r9 = r4.equals(r9)
            if (r9 == 0) goto L7d
            r9 = r18
            r16 = r1
            androidx.core.provider.FontRequest r1 = readFallback(r9, r0, r5, r6, r8)
            r10.add(r1)
            goto L84
        L7d:
            r9 = r18
            r16 = r1
            skip(r9)
        L84:
            r1 = r16
            r9 = 3
            goto L56
        L88:
            r9 = r18
            r16 = r1
            boolean r1 = r10.isEmpty()
            if (r1 != 0) goto L98
            androidx.core.content.res.FontResourcesParserCompat$ProviderResourceEntry r1 = new androidx.core.content.res.FontResourcesParserCompat$ProviderResourceEntry
            r1.<init>(r10, r12, r13, r14)
            return r1
        L98:
            if (r7 == 0) goto Lbc
            androidx.core.provider.FontRequest r4 = new androidx.core.provider.FontRequest
            r9 = 0
            r1 = r10
            r10 = 0
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r17 = r7
            r1.add(r4)
            if (r3 == 0) goto Lb5
            androidx.core.provider.FontRequest r4 = new androidx.core.provider.FontRequest
            r9 = 0
            r10 = 0
            r7 = r3
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r1.add(r4)
            goto Lb6
        Lb5:
            r7 = r3
        Lb6:
            androidx.core.content.res.FontResourcesParserCompat$ProviderResourceEntry r3 = new androidx.core.content.res.FontResourcesParserCompat$ProviderResourceEntry
            r3.<init>(r1, r12, r13, r14)
            return r3
        Lbc:
            r17 = r7
            r7 = r3
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "The provider font XML requires query attribute or fallback children."
            r3.<init>(r4)
            throw r3
        Lc7:
            r16 = r1
            r17 = r7
            r7 = r3
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        Ld1:
            int r3 = r18.next()
            r4 = 3
            if (r3 == r4) goto Lf8
            int r3 = r18.getEventType()
            r9 = 2
            if (r3 == r9) goto Le0
            goto Ld1
        Le0:
            java.lang.String r3 = r18.getName()
            java.lang.String r10 = "font"
            boolean r10 = r3.equals(r10)
            if (r10 == 0) goto Lf4
            androidx.core.content.res.FontResourcesParserCompat$FontFileResourceEntry r10 = readFont(r18, r19)
            r1.add(r10)
            goto Lf7
        Lf4:
            skip(r18)
        Lf7:
            goto Ld1
        Lf8:
            boolean r3 = r1.isEmpty()
            if (r3 == 0) goto L100
            r3 = 0
            return r3
        L100:
            androidx.core.content.res.FontResourcesParserCompat$FontFamilyFilesResourceEntry r3 = new androidx.core.content.res.FontResourcesParserCompat$FontFamilyFilesResourceEntry
            androidx.core.content.res.FontResourcesParserCompat$FontFileResourceEntry[] r4 = new androidx.core.content.res.FontResourcesParserCompat.FontFileResourceEntry[r8]
            java.lang.Object[] r4 = r1.toArray(r4)
            androidx.core.content.res.FontResourcesParserCompat$FontFileResourceEntry[] r4 = (androidx.core.content.res.FontResourcesParserCompat.FontFileResourceEntry[]) r4
            r3.<init>(r4)
            return r3
    }

    private static androidx.core.content.res.FontResourcesParserCompat.FontFileResourceEntry readFont(org.xmlpull.v1.XmlPullParser r16, android.content.res.Resources r17) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r16)
            int[] r1 = androidx.core.R.styleable.FontFamilyFont
            r2 = r17
            android.content.res.TypedArray r1 = r2.obtainAttributes(r0, r1)
            int r3 = androidx.core.R.styleable.FontFamilyFont_fontWeight
            boolean r3 = r1.hasValue(r3)
            if (r3 == 0) goto L17
            int r3 = androidx.core.R.styleable.FontFamilyFont_fontWeight
            goto L19
        L17:
            int r3 = androidx.core.R.styleable.FontFamilyFont_android_fontWeight
        L19:
            r4 = 400(0x190, float:5.6E-43)
            int r7 = r1.getInt(r3, r4)
            int r4 = androidx.core.R.styleable.FontFamilyFont_fontStyle
            boolean r4 = r1.hasValue(r4)
            if (r4 == 0) goto L2b
            int r4 = androidx.core.R.styleable.FontFamilyFont_fontStyle
            goto L2d
        L2b:
            int r4 = androidx.core.R.styleable.FontFamilyFont_android_fontStyle
        L2d:
            r5 = 0
            int r6 = r1.getInt(r4, r5)
            r8 = 1
            if (r8 != r6) goto L37
            goto L38
        L37:
            r8 = r5
        L38:
            int r6 = androidx.core.R.styleable.FontFamilyFont_ttcIndex
            boolean r6 = r1.hasValue(r6)
            if (r6 == 0) goto L43
            int r6 = androidx.core.R.styleable.FontFamilyFont_ttcIndex
            goto L45
        L43:
            int r6 = androidx.core.R.styleable.FontFamilyFont_android_ttcIndex
        L45:
            r12 = r6
            int r6 = androidx.core.R.styleable.FontFamilyFont_fontVariationSettings
            boolean r6 = r1.hasValue(r6)
            if (r6 == 0) goto L51
            int r6 = androidx.core.R.styleable.FontFamilyFont_fontVariationSettings
            goto L53
        L51:
            int r6 = androidx.core.R.styleable.FontFamilyFont_android_fontVariationSettings
        L53:
            r13 = r6
            java.lang.String r9 = r1.getString(r13)
            int r10 = r1.getInt(r12, r5)
            int r6 = androidx.core.R.styleable.FontFamilyFont_font
            boolean r6 = r1.hasValue(r6)
            if (r6 == 0) goto L67
            int r6 = androidx.core.R.styleable.FontFamilyFont_font
            goto L69
        L67:
            int r6 = androidx.core.R.styleable.FontFamilyFont_android_font
        L69:
            r14 = r6
            int r11 = r1.getResourceId(r14, r5)
            java.lang.String r6 = r1.getString(r14)
            r1.recycle()
        L75:
            int r5 = r16.next()
            r15 = 3
            if (r5 == r15) goto L80
            skip(r16)
            goto L75
        L80:
            androidx.core.content.res.FontResourcesParserCompat$FontFileResourceEntry r5 = new androidx.core.content.res.FontResourcesParserCompat$FontFileResourceEntry
            r5.<init>(r6, r7, r8, r9, r10, r11)
            return r5
    }

    private static void skip(org.xmlpull.v1.XmlPullParser r2) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
            r0 = 1
        L1:
            if (r0 <= 0) goto L12
            int r1 = r2.next()
            switch(r1) {
                case 2: goto Le;
                case 3: goto Lb;
                default: goto La;
            }
        La:
            goto L11
        Lb:
            int r0 = r0 + (-1)
            goto L11
        Le:
            int r0 = r0 + 1
        L11:
            goto L1
        L12:
            return
    }

    private static java.util.List<byte[]> toByteArrayList(java.lang.String[] r6) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = r6.length
            r2 = 0
            r3 = r2
        L8:
            if (r3 >= r1) goto L16
            r4 = r6[r3]
            byte[] r5 = android.util.Base64.decode(r4, r2)
            r0.add(r5)
            int r3 = r3 + 1
            goto L8
        L16:
            return r0
    }
}
