package androidx.core.provider;

/* JADX INFO: loaded from: classes.dex */
class FontRequestWorker {
    private static final java.util.concurrent.ExecutorService DEFAULT_EXECUTOR_SERVICE = null;
    static final java.lang.Object LOCK = null;
    static final androidx.collection.SimpleArrayMap<java.lang.String, java.util.ArrayList<androidx.core.util.Consumer<androidx.core.provider.FontRequestWorker.TypefaceResult>>> PENDING_REPLIES = null;
    static final androidx.collection.LruCache<java.lang.String, android.graphics.Typeface> sTypefaceCache = null;





    static final class TypefaceResult {
        final int mResult;
        final android.graphics.Typeface mTypeface;

        TypefaceResult(int r2) {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.mTypeface = r0
                r1.mResult = r2
                return
        }

        TypefaceResult(android.graphics.Typeface r2) {
                r1 = this;
                r1.<init>()
                r1.mTypeface = r2
                r0 = 0
                r1.mResult = r0
                return
        }

        boolean isSuccess() {
                r1 = this;
                int r0 = r1.mResult
                if (r0 != 0) goto L6
                r0 = 1
                goto L7
            L6:
                r0 = 0
            L7:
                return r0
        }
    }

    static {
            androidx.collection.LruCache r0 = new androidx.collection.LruCache
            r1 = 16
            r0.<init>(r1)
            androidx.core.provider.FontRequestWorker.sTypefaceCache = r0
            java.lang.String r0 = "fonts-androidx"
            r1 = 10
            r2 = 10000(0x2710, float:1.4013E-41)
            java.util.concurrent.ThreadPoolExecutor r0 = androidx.core.provider.RequestExecutor.createDefaultExecutor(r0, r1, r2)
            androidx.core.provider.FontRequestWorker.DEFAULT_EXECUTOR_SERVICE = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            androidx.core.provider.FontRequestWorker.LOCK = r0
            androidx.collection.SimpleArrayMap r0 = new androidx.collection.SimpleArrayMap
            r0.<init>()
            androidx.core.provider.FontRequestWorker.PENDING_REPLIES = r0
            return
    }

    private FontRequestWorker() {
            r0 = this;
            r0.<init>()
            return
    }

    private static java.lang.String createCacheId(java.util.List<androidx.core.provider.FontRequest> r4, int r5) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 0
        L6:
            int r2 = r4.size()
            if (r1 >= r2) goto L33
            java.lang.Object r2 = r4.get(r1)
            androidx.core.provider.FontRequest r2 = (androidx.core.provider.FontRequest) r2
            java.lang.String r2 = r2.getId()
            java.lang.StringBuilder r2 = r0.append(r2)
            java.lang.String r3 = "-"
            java.lang.StringBuilder r2 = r2.append(r3)
            r2.append(r5)
            int r2 = r4.size()
            int r2 = r2 + (-1)
            if (r1 >= r2) goto L30
            java.lang.String r2 = ";"
            r0.append(r2)
        L30:
            int r1 = r1 + 1
            goto L6
        L33:
            java.lang.String r1 = r0.toString()
            return r1
    }

    private static int getFontFamilyResultStatus(androidx.core.provider.FontsContractCompat.FontFamilyResult r7) {
            int r0 = r7.getStatusCode()
            r1 = -3
            if (r0 == 0) goto L11
            int r0 = r7.getStatusCode()
            switch(r0) {
                case 1: goto Lf;
                default: goto Le;
            }
        Le:
            return r1
        Lf:
            r0 = -2
            return r0
        L11:
            androidx.core.provider.FontsContractCompat$FontInfo[] r0 = r7.getFonts()
            if (r0 == 0) goto L31
            int r2 = r0.length
            if (r2 != 0) goto L1b
            goto L31
        L1b:
            int r2 = r0.length
            r3 = 0
            r4 = r3
        L1e:
            if (r4 >= r2) goto L30
            r5 = r0[r4]
            int r6 = r5.getResultCode()
            if (r6 == 0) goto L2d
            if (r6 >= 0) goto L2b
            goto L2c
        L2b:
            r1 = r6
        L2c:
            return r1
        L2d:
            int r4 = r4 + 1
            goto L1e
        L30:
            return r3
        L31:
            r1 = 1
            return r1
    }

    static androidx.core.provider.FontRequestWorker.TypefaceResult getFontSync(java.lang.String r6, android.content.Context r7, java.util.List<androidx.core.provider.FontRequest> r8, int r9) {
            java.lang.String r0 = "getFontSync"
            androidx.tracing.Trace.beginSection(r0)
            androidx.collection.LruCache<java.lang.String, android.graphics.Typeface> r0 = androidx.core.provider.FontRequestWorker.sTypefaceCache     // Catch: java.lang.Throwable -> L71
            java.lang.Object r0 = r0.get(r6)     // Catch: java.lang.Throwable -> L71
            android.graphics.Typeface r0 = (android.graphics.Typeface) r0     // Catch: java.lang.Throwable -> L71
            if (r0 == 0) goto L18
            androidx.core.provider.FontRequestWorker$TypefaceResult r1 = new androidx.core.provider.FontRequestWorker$TypefaceResult     // Catch: java.lang.Throwable -> L71
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L71
            androidx.tracing.Trace.endSection()
            return r1
        L18:
            r1 = 0
            androidx.core.provider.FontsContractCompat$FontFamilyResult r2 = androidx.core.provider.FontProvider.getFontFamilyResult(r7, r8, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L66 java.lang.Throwable -> L71
            int r3 = getFontFamilyResultStatus(r2)     // Catch: java.lang.Throwable -> L71
            if (r3 == 0) goto L2d
            androidx.core.provider.FontRequestWorker$TypefaceResult r1 = new androidx.core.provider.FontRequestWorker$TypefaceResult     // Catch: java.lang.Throwable -> L71
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L71
            androidx.tracing.Trace.endSection()
            return r1
        L2d:
            boolean r4 = r2.hasFallback()     // Catch: java.lang.Throwable -> L71
            if (r4 == 0) goto L43
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L71
            r5 = 29
            if (r4 < r5) goto L43
        L3a:
            java.util.List r4 = r2.getFontsWithFallbacks()     // Catch: java.lang.Throwable -> L71
            android.graphics.Typeface r1 = androidx.core.graphics.TypefaceCompat.createFromFontInfoWithFallback(r7, r1, r4, r9)     // Catch: java.lang.Throwable -> L71
            goto L4c
        L43:
            androidx.core.provider.FontsContractCompat$FontInfo[] r4 = r2.getFonts()     // Catch: java.lang.Throwable -> L71
            android.graphics.Typeface r1 = androidx.core.graphics.TypefaceCompat.createFromFontInfo(r7, r1, r4, r9)     // Catch: java.lang.Throwable -> L71
        L4c:
            if (r1 == 0) goto L5c
            androidx.collection.LruCache<java.lang.String, android.graphics.Typeface> r4 = androidx.core.provider.FontRequestWorker.sTypefaceCache     // Catch: java.lang.Throwable -> L71
            r4.put(r6, r1)     // Catch: java.lang.Throwable -> L71
            androidx.core.provider.FontRequestWorker$TypefaceResult r4 = new androidx.core.provider.FontRequestWorker$TypefaceResult     // Catch: java.lang.Throwable -> L71
            r4.<init>(r1)     // Catch: java.lang.Throwable -> L71
            androidx.tracing.Trace.endSection()
            return r4
        L5c:
            androidx.core.provider.FontRequestWorker$TypefaceResult r4 = new androidx.core.provider.FontRequestWorker$TypefaceResult     // Catch: java.lang.Throwable -> L71
            r5 = -3
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L71
            androidx.tracing.Trace.endSection()
            return r4
        L66:
            r1 = move-exception
            androidx.core.provider.FontRequestWorker$TypefaceResult r2 = new androidx.core.provider.FontRequestWorker$TypefaceResult     // Catch: java.lang.Throwable -> L71
            r3 = -1
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L71
            androidx.tracing.Trace.endSection()
            return r2
        L71:
            r0 = move-exception
            androidx.tracing.Trace.endSection()
            throw r0
    }

    static android.graphics.Typeface requestFontAsync(android.content.Context r7, java.util.List<androidx.core.provider.FontRequest> r8, int r9, java.util.concurrent.Executor r10, androidx.core.provider.CallbackWrapper r11) {
            java.lang.String r0 = createCacheId(r8, r9)
            androidx.collection.LruCache<java.lang.String, android.graphics.Typeface> r1 = androidx.core.provider.FontRequestWorker.sTypefaceCache
            java.lang.Object r1 = r1.get(r0)
            android.graphics.Typeface r1 = (android.graphics.Typeface) r1
            if (r1 == 0) goto L17
            androidx.core.provider.FontRequestWorker$TypefaceResult r2 = new androidx.core.provider.FontRequestWorker$TypefaceResult
            r2.<init>(r1)
            r11.onTypefaceResult(r2)
            return r1
        L17:
            androidx.core.provider.FontRequestWorker$2 r2 = new androidx.core.provider.FontRequestWorker$2
            r2.<init>(r11)
            java.lang.Object r3 = androidx.core.provider.FontRequestWorker.LOCK
            monitor-enter(r3)
            androidx.collection.SimpleArrayMap<java.lang.String, java.util.ArrayList<androidx.core.util.Consumer<androidx.core.provider.FontRequestWorker$TypefaceResult>>> r4 = androidx.core.provider.FontRequestWorker.PENDING_REPLIES     // Catch: java.lang.Throwable -> L52
            java.lang.Object r4 = r4.get(r0)     // Catch: java.lang.Throwable -> L52
            java.util.ArrayList r4 = (java.util.ArrayList) r4     // Catch: java.lang.Throwable -> L52
            r5 = 0
            if (r4 == 0) goto L2f
            r4.add(r2)     // Catch: java.lang.Throwable -> L52
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L52
            return r5
        L2f:
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L52
            r6.<init>()     // Catch: java.lang.Throwable -> L52
            r6.add(r2)     // Catch: java.lang.Throwable -> L52
            androidx.collection.SimpleArrayMap<java.lang.String, java.util.ArrayList<androidx.core.util.Consumer<androidx.core.provider.FontRequestWorker$TypefaceResult>>> r4 = androidx.core.provider.FontRequestWorker.PENDING_REPLIES     // Catch: java.lang.Throwable -> L52
            r4.put(r0, r6)     // Catch: java.lang.Throwable -> L52
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L52
            androidx.core.provider.FontRequestWorker$3 r3 = new androidx.core.provider.FontRequestWorker$3
            r3.<init>(r0, r7, r8, r9)
            if (r10 != 0) goto L48
            java.util.concurrent.ExecutorService r4 = androidx.core.provider.FontRequestWorker.DEFAULT_EXECUTOR_SERVICE
            goto L49
        L48:
            r4 = r10
        L49:
            androidx.core.provider.FontRequestWorker$4 r6 = new androidx.core.provider.FontRequestWorker$4
            r6.<init>(r0)
            androidx.core.provider.RequestExecutor.execute(r4, r3, r6)
            return r5
        L52:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L52
            throw r4
    }

    static android.graphics.Typeface requestFontSync(android.content.Context r6, androidx.core.provider.FontRequest r7, androidx.core.provider.CallbackWrapper r8, int r9, int r10) {
            java.util.List r0 = androidx.core.provider.FontRequestWorker$$ExternalSyntheticBackport0.m(r7)
            java.lang.String r0 = createCacheId(r0, r9)
            androidx.collection.LruCache<java.lang.String, android.graphics.Typeface> r1 = androidx.core.provider.FontRequestWorker.sTypefaceCache
            java.lang.Object r1 = r1.get(r0)
            android.graphics.Typeface r1 = (android.graphics.Typeface) r1
            if (r1 == 0) goto L1b
            androidx.core.provider.FontRequestWorker$TypefaceResult r2 = new androidx.core.provider.FontRequestWorker$TypefaceResult
            r2.<init>(r1)
            r8.onTypefaceResult(r2)
            return r1
        L1b:
            r2 = -1
            if (r10 != r2) goto L2c
            java.util.List r2 = androidx.core.provider.FontRequestWorker$$ExternalSyntheticBackport0.m(r7)
            androidx.core.provider.FontRequestWorker$TypefaceResult r2 = getFontSync(r0, r6, r2, r9)
            r8.onTypefaceResult(r2)
            android.graphics.Typeface r3 = r2.mTypeface
            return r3
        L2c:
            androidx.core.provider.FontRequestWorker$1 r2 = new androidx.core.provider.FontRequestWorker$1
            r2.<init>(r0, r6, r7, r9)
            java.util.concurrent.ExecutorService r3 = androidx.core.provider.FontRequestWorker.DEFAULT_EXECUTOR_SERVICE     // Catch: java.lang.InterruptedException -> L3f
            java.lang.Object r3 = androidx.core.provider.RequestExecutor.submit(r3, r2, r10)     // Catch: java.lang.InterruptedException -> L3f
            androidx.core.provider.FontRequestWorker$TypefaceResult r3 = (androidx.core.provider.FontRequestWorker.TypefaceResult) r3     // Catch: java.lang.InterruptedException -> L3f
            r8.onTypefaceResult(r3)     // Catch: java.lang.InterruptedException -> L3f
            android.graphics.Typeface r4 = r3.mTypeface     // Catch: java.lang.InterruptedException -> L3f
            return r4
        L3f:
            r3 = move-exception
            androidx.core.provider.FontRequestWorker$TypefaceResult r4 = new androidx.core.provider.FontRequestWorker$TypefaceResult
            r5 = -3
            r4.<init>(r5)
            r8.onTypefaceResult(r4)
            r4 = 0
            return r4
    }

    static void resetTypefaceCache() {
            androidx.collection.LruCache<java.lang.String, android.graphics.Typeface> r0 = androidx.core.provider.FontRequestWorker.sTypefaceCache
            r0.evictAll()
            return
    }
}
