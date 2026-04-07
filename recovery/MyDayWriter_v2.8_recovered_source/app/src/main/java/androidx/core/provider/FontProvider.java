package androidx.core.provider;

/* JADX INFO: loaded from: classes.dex */
class FontProvider {
    private static final java.util.Comparator<byte[]> sByteArrayComparator = null;
    private static final androidx.collection.LruCache<androidx.core.provider.FontProvider.ProviderCacheKey, android.content.pm.ProviderInfo> sProviderCache = null;

    private interface ContentQueryWrapper {
        static androidx.core.provider.FontProvider.ContentQueryWrapper make(android.content.Context r1, android.net.Uri r2) {
                androidx.core.provider.FontProvider$ContentQueryWrapperApi24Impl r0 = new androidx.core.provider.FontProvider$ContentQueryWrapperApi24Impl
                r0.<init>(r1, r2)
                return r0
        }

        void close();

        android.database.Cursor query(android.net.Uri r1, java.lang.String[] r2, java.lang.String r3, java.lang.String[] r4, java.lang.String r5, android.os.CancellationSignal r6);
    }

    private static class ContentQueryWrapperApi16Impl implements androidx.core.provider.FontProvider.ContentQueryWrapper {
        private final android.content.ContentProviderClient mClient;

        ContentQueryWrapperApi16Impl(android.content.Context r2, android.net.Uri r3) {
                r1 = this;
                r1.<init>()
                android.content.ContentResolver r0 = r2.getContentResolver()
                android.content.ContentProviderClient r0 = r0.acquireUnstableContentProviderClient(r3)
                r1.mClient = r0
                return
        }

        @Override // androidx.core.provider.FontProvider.ContentQueryWrapper
        public void close() {
                r1 = this;
                android.content.ContentProviderClient r0 = r1.mClient
                if (r0 == 0) goto L9
                android.content.ContentProviderClient r0 = r1.mClient
                r0.release()
            L9:
                return
        }

        @Override // androidx.core.provider.FontProvider.ContentQueryWrapper
        public android.database.Cursor query(android.net.Uri r10, java.lang.String[] r11, java.lang.String r12, java.lang.String[] r13, java.lang.String r14, android.os.CancellationSignal r15) {
                r9 = this;
                android.content.ContentProviderClient r0 = r9.mClient
                r1 = 0
                if (r0 != 0) goto L6
                return r1
            L6:
                android.content.ContentProviderClient r2 = r9.mClient     // Catch: android.os.RemoteException -> L16
                r3 = r10
                r4 = r11
                r5 = r12
                r6 = r13
                r7 = r14
                r8 = r15
                android.database.Cursor r10 = r2.query(r3, r4, r5, r6, r7, r8)     // Catch: android.os.RemoteException -> L13
                return r10
            L13:
                r0 = move-exception
                r10 = r0
                goto L1e
            L16:
                r0 = move-exception
                r3 = r10
                r4 = r11
                r5 = r12
                r6 = r13
                r7 = r14
                r8 = r15
                r10 = r0
            L1e:
                java.lang.String r11 = "FontsProvider"
                java.lang.String r12 = "Unable to query the content provider"
                android.util.Log.w(r11, r12, r10)
                return r1
        }
    }

    private static class ContentQueryWrapperApi24Impl implements androidx.core.provider.FontProvider.ContentQueryWrapper {
        private final android.content.ContentProviderClient mClient;

        ContentQueryWrapperApi24Impl(android.content.Context r2, android.net.Uri r3) {
                r1 = this;
                r1.<init>()
                android.content.ContentResolver r0 = r2.getContentResolver()
                android.content.ContentProviderClient r0 = r0.acquireUnstableContentProviderClient(r3)
                r1.mClient = r0
                return
        }

        @Override // androidx.core.provider.FontProvider.ContentQueryWrapper
        public void close() {
                r1 = this;
                android.content.ContentProviderClient r0 = r1.mClient
                if (r0 == 0) goto L9
                android.content.ContentProviderClient r0 = r1.mClient
                r0.close()
            L9:
                return
        }

        @Override // androidx.core.provider.FontProvider.ContentQueryWrapper
        public android.database.Cursor query(android.net.Uri r10, java.lang.String[] r11, java.lang.String r12, java.lang.String[] r13, java.lang.String r14, android.os.CancellationSignal r15) {
                r9 = this;
                android.content.ContentProviderClient r0 = r9.mClient
                r1 = 0
                if (r0 != 0) goto L6
                return r1
            L6:
                android.content.ContentProviderClient r2 = r9.mClient     // Catch: android.os.RemoteException -> L16
                r3 = r10
                r4 = r11
                r5 = r12
                r6 = r13
                r7 = r14
                r8 = r15
                android.database.Cursor r10 = r2.query(r3, r4, r5, r6, r7, r8)     // Catch: android.os.RemoteException -> L13
                return r10
            L13:
                r0 = move-exception
                r10 = r0
                goto L1e
            L16:
                r0 = move-exception
                r3 = r10
                r4 = r11
                r5 = r12
                r6 = r13
                r7 = r14
                r8 = r15
                r10 = r0
            L1e:
                java.lang.String r11 = "FontsProvider"
                java.lang.String r12 = "Unable to query the content provider"
                android.util.Log.w(r11, r12, r10)
                return r1
        }
    }

    private static class ProviderCacheKey {
        java.lang.String mAuthority;
        java.util.List<java.util.List<byte[]>> mCertificates;
        java.lang.String mPackageName;

        ProviderCacheKey(java.lang.String r1, java.lang.String r2, java.util.List<java.util.List<byte[]>> r3) {
                r0 = this;
                r0.<init>()
                r0.mAuthority = r1
                r0.mPackageName = r2
                r0.mCertificates = r3
                return
        }

        public boolean equals(java.lang.Object r6) {
                r5 = this;
                r0 = 1
                if (r5 != r6) goto L4
                return r0
            L4:
                boolean r1 = r6 instanceof androidx.core.provider.FontProvider.ProviderCacheKey
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                r1 = r6
                androidx.core.provider.FontProvider$ProviderCacheKey r1 = (androidx.core.provider.FontProvider.ProviderCacheKey) r1
                java.lang.String r3 = r5.mAuthority
                java.lang.String r4 = r1.mAuthority
                boolean r3 = java.util.Objects.equals(r3, r4)
                if (r3 == 0) goto L2c
                java.lang.String r3 = r5.mPackageName
                java.lang.String r4 = r1.mPackageName
                boolean r3 = java.util.Objects.equals(r3, r4)
                if (r3 == 0) goto L2c
                java.util.List<java.util.List<byte[]>> r3 = r5.mCertificates
                java.util.List<java.util.List<byte[]>> r4 = r1.mCertificates
                boolean r3 = java.util.Objects.equals(r3, r4)
                if (r3 == 0) goto L2c
                goto L2d
            L2c:
                r0 = r2
            L2d:
                return r0
        }

        public int hashCode() {
                r3 = this;
                java.lang.String r0 = r3.mAuthority
                java.lang.String r1 = r3.mPackageName
                java.util.List<java.util.List<byte[]>> r2 = r3.mCertificates
                java.lang.Object[] r0 = new java.lang.Object[]{r0, r1, r2}
                int r0 = java.util.Objects.hash(r0)
                return r0
        }
    }

    static {
            androidx.collection.LruCache r0 = new androidx.collection.LruCache
            r1 = 2
            r0.<init>(r1)
            androidx.core.provider.FontProvider.sProviderCache = r0
            androidx.core.provider.FontProvider$$ExternalSyntheticLambda0 r0 = new androidx.core.provider.FontProvider$$ExternalSyntheticLambda0
            r0.<init>()
            androidx.core.provider.FontProvider.sByteArrayComparator = r0
            return
    }

    private FontProvider() {
            r0 = this;
            r0.<init>()
            return
    }

    static void clearProviderCache() {
            androidx.collection.LruCache<androidx.core.provider.FontProvider$ProviderCacheKey, android.content.pm.ProviderInfo> r0 = androidx.core.provider.FontProvider.sProviderCache
            r0.evictAll()
            return
    }

    private static java.util.List<byte[]> convertToByteArrayList(android.content.pm.Signature[] r5) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = r5.length
            r2 = 0
        L7:
            if (r2 >= r1) goto L15
            r3 = r5[r2]
            byte[] r4 = r3.toByteArray()
            r0.add(r4)
            int r2 = r2 + 1
            goto L7
        L15:
            return r0
    }

    private static boolean equalsByteArrayList(java.util.List<byte[]> r4, java.util.List<byte[]> r5) {
            int r0 = r4.size()
            int r1 = r5.size()
            r2 = 0
            if (r0 == r1) goto Lc
            return r2
        Lc:
            r0 = 0
        Ld:
            int r1 = r4.size()
            if (r0 >= r1) goto L29
            java.lang.Object r1 = r4.get(r0)
            byte[] r1 = (byte[]) r1
            java.lang.Object r3 = r5.get(r0)
            byte[] r3 = (byte[]) r3
            boolean r1 = java.util.Arrays.equals(r1, r3)
            if (r1 != 0) goto L26
            return r2
        L26:
            int r0 = r0 + 1
            goto Ld
        L29:
            r0 = 1
            return r0
    }

    private static java.util.List<java.util.List<byte[]>> getCertificates(androidx.core.provider.FontRequest r2, android.content.res.Resources r3) {
            java.util.List r0 = r2.getCertificates()
            if (r0 == 0) goto Lb
            java.util.List r0 = r2.getCertificates()
            return r0
        Lb:
            int r0 = r2.getCertificatesArrayResId()
            java.util.List r1 = androidx.core.content.res.FontResourcesParserCompat.readCerts(r3, r0)
            return r1
    }

    static androidx.core.provider.FontsContractCompat.FontFamilyResult getFontFamilyResult(android.content.Context r10, java.util.List<androidx.core.provider.FontRequest> r11, android.os.CancellationSignal r12) throws android.content.pm.PackageManager.NameNotFoundException {
            java.lang.String r0 = "FontProvider.getFontFamilyResult"
            androidx.tracing.Trace.beginSection(r0)
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L6f
            r0.<init>()     // Catch: java.lang.Throwable -> L6f
            r1 = 0
        Lb:
            int r2 = r11.size()     // Catch: java.lang.Throwable -> L6f
            r3 = 0
            if (r1 >= r2) goto L67
            java.lang.Object r2 = r11.get(r1)     // Catch: java.lang.Throwable -> L6f
            androidx.core.provider.FontRequest r2 = (androidx.core.provider.FontRequest) r2     // Catch: java.lang.Throwable -> L6f
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L6f
            r5 = 31
            r6 = 1
            if (r4 < r5) goto L40
            java.lang.String r4 = r2.getSystemFont()     // Catch: java.lang.Throwable -> L6f
            android.graphics.Typeface r5 = androidx.core.graphics.TypefaceCompat.getSystemFontFamily(r4)     // Catch: java.lang.Throwable -> L6f
            if (r5 == 0) goto L40
            android.graphics.fonts.Font r7 = androidx.core.graphics.TypefaceCompat.guessPrimaryFont(r5)     // Catch: java.lang.Throwable -> L6f
            if (r7 == 0) goto L40
            androidx.core.provider.FontsContractCompat$FontInfo[] r6 = new androidx.core.provider.FontsContractCompat.FontInfo[r6]     // Catch: java.lang.Throwable -> L6f
            androidx.core.provider.FontsContractCompat$FontInfo r8 = new androidx.core.provider.FontsContractCompat$FontInfo     // Catch: java.lang.Throwable -> L6f
            java.lang.String r9 = r2.getVariationSettings()     // Catch: java.lang.Throwable -> L6f
            r8.<init>(r4, r9)     // Catch: java.lang.Throwable -> L6f
            r6[r3] = r8     // Catch: java.lang.Throwable -> L6f
            r0.add(r6)     // Catch: java.lang.Throwable -> L6f
            goto L64
        L40:
            android.content.pm.PackageManager r3 = r10.getPackageManager()     // Catch: java.lang.Throwable -> L6f
            android.content.res.Resources r4 = r10.getResources()     // Catch: java.lang.Throwable -> L6f
            android.content.pm.ProviderInfo r3 = getProvider(r3, r2, r4)     // Catch: java.lang.Throwable -> L6f
            if (r3 != 0) goto L5b
            r4 = 0
            r5 = r4
            androidx.core.provider.FontsContractCompat$FontInfo[] r5 = (androidx.core.provider.FontsContractCompat.FontInfo[]) r5     // Catch: java.lang.Throwable -> L6f
            androidx.core.provider.FontsContractCompat$FontFamilyResult r4 = androidx.core.provider.FontsContractCompat.FontFamilyResult.create(r6, r4)     // Catch: java.lang.Throwable -> L6f
            androidx.tracing.Trace.endSection()
            return r4
        L5b:
            java.lang.String r4 = r3.authority     // Catch: java.lang.Throwable -> L6f
            androidx.core.provider.FontsContractCompat$FontInfo[] r4 = query(r10, r2, r4, r12)     // Catch: java.lang.Throwable -> L6f
            r0.add(r4)     // Catch: java.lang.Throwable -> L6f
        L64:
            int r1 = r1 + 1
            goto Lb
        L67:
            androidx.core.provider.FontsContractCompat$FontFamilyResult r1 = androidx.core.provider.FontsContractCompat.FontFamilyResult.create(r3, r0)     // Catch: java.lang.Throwable -> L6f
            androidx.tracing.Trace.endSection()
            return r1
        L6f:
            r0 = move-exception
            androidx.tracing.Trace.endSection()
            throw r0
    }

    static android.content.pm.ProviderInfo getProvider(android.content.pm.PackageManager r10, androidx.core.provider.FontRequest r11, android.content.res.Resources r12) throws android.content.pm.PackageManager.NameNotFoundException {
            java.lang.String r0 = "FontProvider.getProvider"
            androidx.tracing.Trace.beginSection(r0)
            java.util.List r0 = getCertificates(r11, r12)     // Catch: java.lang.Throwable -> Lbf
            androidx.core.provider.FontProvider$ProviderCacheKey r1 = new androidx.core.provider.FontProvider$ProviderCacheKey     // Catch: java.lang.Throwable -> Lbf
            java.lang.String r2 = r11.getProviderAuthority()     // Catch: java.lang.Throwable -> Lbf
            java.lang.String r3 = r11.getProviderPackage()     // Catch: java.lang.Throwable -> Lbf
            r1.<init>(r2, r3, r0)     // Catch: java.lang.Throwable -> Lbf
            androidx.collection.LruCache<androidx.core.provider.FontProvider$ProviderCacheKey, android.content.pm.ProviderInfo> r2 = androidx.core.provider.FontProvider.sProviderCache     // Catch: java.lang.Throwable -> Lbf
            java.lang.Object r2 = r2.get(r1)     // Catch: java.lang.Throwable -> Lbf
            android.content.pm.ProviderInfo r2 = (android.content.pm.ProviderInfo) r2     // Catch: java.lang.Throwable -> Lbf
            if (r2 == 0) goto L25
        L21:
            androidx.tracing.Trace.endSection()
            return r2
        L25:
            java.lang.String r3 = r11.getProviderAuthority()     // Catch: java.lang.Throwable -> Lbf
            r4 = 0
            android.content.pm.ProviderInfo r4 = r10.resolveContentProvider(r3, r4)     // Catch: java.lang.Throwable -> Lbf
            if (r4 == 0) goto La6
            java.lang.String r5 = r4.packageName     // Catch: java.lang.Throwable -> Lbf
            java.lang.String r6 = r11.getProviderPackage()     // Catch: java.lang.Throwable -> Lbf
            boolean r5 = r5.equals(r6)     // Catch: java.lang.Throwable -> Lbf
            if (r5 == 0) goto L7f
            java.lang.String r5 = r4.packageName     // Catch: java.lang.Throwable -> Lbf
            r6 = 64
            android.content.pm.PackageInfo r5 = r10.getPackageInfo(r5, r6)     // Catch: java.lang.Throwable -> Lbf
            android.content.pm.Signature[] r6 = r5.signatures     // Catch: java.lang.Throwable -> Lbf
            java.util.List r6 = convertToByteArrayList(r6)     // Catch: java.lang.Throwable -> Lbf
            java.util.Comparator<byte[]> r7 = androidx.core.provider.FontProvider.sByteArrayComparator     // Catch: java.lang.Throwable -> Lbf
            java.util.Collections.sort(r6, r7)     // Catch: java.lang.Throwable -> Lbf
            r7 = 0
        L50:
            int r8 = r0.size()     // Catch: java.lang.Throwable -> Lbf
            if (r7 >= r8) goto L79
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lbf
            java.lang.Object r9 = r0.get(r7)     // Catch: java.lang.Throwable -> Lbf
            java.util.Collection r9 = (java.util.Collection) r9     // Catch: java.lang.Throwable -> Lbf
            r8.<init>(r9)     // Catch: java.lang.Throwable -> Lbf
            java.util.Comparator<byte[]> r9 = androidx.core.provider.FontProvider.sByteArrayComparator     // Catch: java.lang.Throwable -> Lbf
            java.util.Collections.sort(r8, r9)     // Catch: java.lang.Throwable -> Lbf
            boolean r9 = equalsByteArrayList(r6, r8)     // Catch: java.lang.Throwable -> Lbf
            if (r9 == 0) goto L76
            androidx.collection.LruCache<androidx.core.provider.FontProvider$ProviderCacheKey, android.content.pm.ProviderInfo> r9 = androidx.core.provider.FontProvider.sProviderCache     // Catch: java.lang.Throwable -> Lbf
            r9.put(r1, r4)     // Catch: java.lang.Throwable -> Lbf
            androidx.tracing.Trace.endSection()
            return r4
        L76:
            int r7 = r7 + 1
            goto L50
        L79:
            androidx.tracing.Trace.endSection()
            r7 = 0
            return r7
        L7f:
            android.content.pm.PackageManager$NameNotFoundException r5 = new android.content.pm.PackageManager$NameNotFoundException     // Catch: java.lang.Throwable -> Lbf
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lbf
            r6.<init>()     // Catch: java.lang.Throwable -> Lbf
            java.lang.String r7 = "Found content provider "
            java.lang.StringBuilder r6 = r6.append(r7)     // Catch: java.lang.Throwable -> Lbf
            java.lang.StringBuilder r6 = r6.append(r3)     // Catch: java.lang.Throwable -> Lbf
            java.lang.String r7 = ", but package was not "
            java.lang.StringBuilder r6 = r6.append(r7)     // Catch: java.lang.Throwable -> Lbf
            java.lang.String r7 = r11.getProviderPackage()     // Catch: java.lang.Throwable -> Lbf
            java.lang.StringBuilder r6 = r6.append(r7)     // Catch: java.lang.Throwable -> Lbf
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> Lbf
            r5.<init>(r6)     // Catch: java.lang.Throwable -> Lbf
            throw r5     // Catch: java.lang.Throwable -> Lbf
        La6:
            android.content.pm.PackageManager$NameNotFoundException r5 = new android.content.pm.PackageManager$NameNotFoundException     // Catch: java.lang.Throwable -> Lbf
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lbf
            r6.<init>()     // Catch: java.lang.Throwable -> Lbf
            java.lang.String r7 = "No package found for authority: "
            java.lang.StringBuilder r6 = r6.append(r7)     // Catch: java.lang.Throwable -> Lbf
            java.lang.StringBuilder r6 = r6.append(r3)     // Catch: java.lang.Throwable -> Lbf
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> Lbf
            r5.<init>(r6)     // Catch: java.lang.Throwable -> Lbf
            throw r5     // Catch: java.lang.Throwable -> Lbf
        Lbf:
            r0 = move-exception
            androidx.tracing.Trace.endSection()
            throw r0
    }

    static /* synthetic */ int lambda$static$0(byte[] r3, byte[] r4) {
            int r0 = r3.length
            int r1 = r4.length
            if (r0 == r1) goto L8
            int r0 = r3.length
            int r1 = r4.length
            int r0 = r0 - r1
            return r0
        L8:
            r0 = 0
        L9:
            int r1 = r3.length
            if (r0 >= r1) goto L1b
            r1 = r3[r0]
            r2 = r4[r0]
            if (r1 == r2) goto L18
            r1 = r3[r0]
            r2 = r4[r0]
            int r1 = r1 - r2
            return r1
        L18:
            int r0 = r0 + 1
            goto L9
        L1b:
            r0 = 0
            return r0
    }

    static androidx.core.provider.FontsContractCompat.FontInfo[] query(android.content.Context r22, androidx.core.provider.FontRequest r23, java.lang.String r24, android.os.CancellationSignal r25) {
            r1 = r24
            java.lang.String r0 = "result_code"
            java.lang.String r2 = "font_italic"
            java.lang.String r3 = "font_weight"
            java.lang.String r4 = "font_ttc_index"
            java.lang.String r5 = "file_id"
            java.lang.String r6 = "_id"
            java.lang.String r7 = "content"
            java.lang.String r8 = "FontProvider.query"
            androidx.tracing.Trace.beginSection(r8)
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L143
            r8.<init>()     // Catch: java.lang.Throwable -> L143
            android.net.Uri$Builder r9 = new android.net.Uri$Builder     // Catch: java.lang.Throwable -> L143
            r9.<init>()     // Catch: java.lang.Throwable -> L143
            android.net.Uri$Builder r9 = r9.scheme(r7)     // Catch: java.lang.Throwable -> L143
            android.net.Uri$Builder r9 = r9.authority(r1)     // Catch: java.lang.Throwable -> L143
            android.net.Uri r9 = r9.build()     // Catch: java.lang.Throwable -> L143
            r11 = r9
            android.net.Uri$Builder r9 = new android.net.Uri$Builder     // Catch: java.lang.Throwable -> L143
            r9.<init>()     // Catch: java.lang.Throwable -> L143
            android.net.Uri$Builder r7 = r9.scheme(r7)     // Catch: java.lang.Throwable -> L143
            android.net.Uri$Builder r7 = r7.authority(r1)     // Catch: java.lang.Throwable -> L143
            java.lang.String r9 = "file"
            android.net.Uri$Builder r7 = r7.appendPath(r9)     // Catch: java.lang.Throwable -> L143
            android.net.Uri r7 = r7.build()     // Catch: java.lang.Throwable -> L143
            r9 = 0
            r10 = r22
            androidx.core.provider.FontProvider$ContentQueryWrapper r12 = androidx.core.provider.FontProvider.ContentQueryWrapper.make(r10, r11)     // Catch: java.lang.Throwable -> L143
            r13 = 7
            java.lang.String[] r13 = new java.lang.String[r13]     // Catch: java.lang.Throwable -> L137
            r14 = 0
            r13[r14] = r6     // Catch: java.lang.Throwable -> L137
            r15 = 1
            r13[r15] = r5     // Catch: java.lang.Throwable -> L137
            r16 = 2
            r13[r16] = r4     // Catch: java.lang.Throwable -> L137
            java.lang.String r16 = "font_variation_settings"
            r17 = 3
            r13[r17] = r16     // Catch: java.lang.Throwable -> L137
            r16 = 4
            r13[r16] = r3     // Catch: java.lang.Throwable -> L137
            r16 = 5
            r13[r16] = r2     // Catch: java.lang.Throwable -> L137
            r16 = 6
            r13[r16] = r0     // Catch: java.lang.Throwable -> L137
            java.lang.String r16 = "ContentQueryWrapper.query"
            androidx.tracing.Trace.beginSection(r16)     // Catch: java.lang.Throwable -> L137
            r10 = r12
            r12 = r13
            java.lang.String r13 = "query = ?"
            r16 = r14
            java.lang.String[] r14 = new java.lang.String[r15]     // Catch: java.lang.Throwable -> L12f
            java.lang.String r17 = r23.getQuery()     // Catch: java.lang.Throwable -> L12f
            r14[r16] = r17     // Catch: java.lang.Throwable -> L12f
            r17 = r15
            r15 = 0
            r16 = r25
            r1 = r17
            android.database.Cursor r13 = r10.query(r11, r12, r13, r14, r15, r16)     // Catch: java.lang.Throwable -> L12f
            r9 = r13
            androidx.tracing.Trace.endSection()     // Catch: java.lang.Throwable -> L135
            if (r9 == 0) goto L119
            int r13 = r9.getCount()     // Catch: java.lang.Throwable -> L135
            if (r13 <= 0) goto L119
            int r0 = r9.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L135
            java.util.ArrayList r13 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L135
            r13.<init>()     // Catch: java.lang.Throwable -> L135
            r8 = r13
            int r6 = r9.getColumnIndex(r6)     // Catch: java.lang.Throwable -> L135
            int r5 = r9.getColumnIndex(r5)     // Catch: java.lang.Throwable -> L135
            int r4 = r9.getColumnIndex(r4)     // Catch: java.lang.Throwable -> L135
            int r3 = r9.getColumnIndex(r3)     // Catch: java.lang.Throwable -> L135
            int r2 = r9.getColumnIndex(r2)     // Catch: java.lang.Throwable -> L135
        Lb2:
            boolean r13 = r9.moveToNext()     // Catch: java.lang.Throwable -> L135
            if (r13 == 0) goto L115
            r13 = -1
            if (r0 == r13) goto Lc0
            int r14 = r9.getInt(r0)     // Catch: java.lang.Throwable -> L135
            goto Lc1
        Lc0:
            r14 = 0
        Lc1:
            if (r4 == r13) goto Lc9
            int r15 = r9.getInt(r4)     // Catch: java.lang.Throwable -> L135
            goto Lca
        Lc9:
            r15 = 0
        Lca:
            if (r5 != r13) goto Ldd
            long r18 = r9.getLong(r6)     // Catch: java.lang.Throwable -> L135
            r20 = r18
            r18 = r2
            r1 = r20
            android.net.Uri r19 = android.content.ContentUris.withAppendedId(r11, r1)     // Catch: java.lang.Throwable -> L135
            r1 = r19
            goto Le9
        Ldd:
            r18 = r2
            long r1 = r9.getLong(r5)     // Catch: java.lang.Throwable -> L135
            android.net.Uri r19 = android.content.ContentUris.withAppendedId(r7, r1)     // Catch: java.lang.Throwable -> L135
            r1 = r19
        Le9:
            if (r3 == r13) goto Lf0
            int r2 = r9.getInt(r3)     // Catch: java.lang.Throwable -> L135
            goto Lf2
        Lf0:
            r2 = 400(0x190, float:5.6E-43)
        Lf2:
            r19 = r0
            r0 = r18
            if (r0 == r13) goto L104
            int r13 = r9.getInt(r0)     // Catch: java.lang.Throwable -> L135
            r18 = r0
            r0 = 1
            if (r13 != r0) goto L107
            r13 = r0
            goto L108
        L104:
            r18 = r0
            r0 = 1
        L107:
            r13 = 0
        L108:
            androidx.core.provider.FontsContractCompat$FontInfo r0 = androidx.core.provider.FontsContractCompat.FontInfo.create(r1, r15, r2, r13, r14)     // Catch: java.lang.Throwable -> L135
            r8.add(r0)     // Catch: java.lang.Throwable -> L135
            r2 = r18
            r0 = r19
            r1 = 1
            goto Lb2
        L115:
            r19 = r0
            r18 = r2
        L119:
            if (r9 == 0) goto L11e
            r9.close()     // Catch: java.lang.Throwable -> L143
        L11e:
            r10.close()     // Catch: java.lang.Throwable -> L143
            r0 = 0
            androidx.core.provider.FontsContractCompat$FontInfo[] r0 = new androidx.core.provider.FontsContractCompat.FontInfo[r0]     // Catch: java.lang.Throwable -> L143
            java.lang.Object[] r0 = r8.toArray(r0)     // Catch: java.lang.Throwable -> L143
            androidx.core.provider.FontsContractCompat$FontInfo[] r0 = (androidx.core.provider.FontsContractCompat.FontInfo[]) r0     // Catch: java.lang.Throwable -> L143
            androidx.tracing.Trace.endSection()
            return r0
        L12f:
            r0 = move-exception
            androidx.tracing.Trace.endSection()     // Catch: java.lang.Throwable -> L135
            throw r0     // Catch: java.lang.Throwable -> L135
        L135:
            r0 = move-exception
            goto L139
        L137:
            r0 = move-exception
            r10 = r12
        L139:
            if (r9 == 0) goto L13e
            r9.close()     // Catch: java.lang.Throwable -> L143
        L13e:
            r10.close()     // Catch: java.lang.Throwable -> L143
            throw r0     // Catch: java.lang.Throwable -> L143
        L143:
            r0 = move-exception
            androidx.tracing.Trace.endSection()
            throw r0
    }
}
