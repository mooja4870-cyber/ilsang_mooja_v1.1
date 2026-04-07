package androidx.emoji2.text;

/* JADX INFO: loaded from: classes.dex */
public class FontRequestEmojiCompatConfig extends androidx.emoji2.text.EmojiCompat.Config {
    private static final androidx.emoji2.text.FontRequestEmojiCompatConfig.FontProviderHelper DEFAULT_FONTS_CONTRACT = null;

    public static class ExponentialBackoffRetryPolicy extends androidx.emoji2.text.FontRequestEmojiCompatConfig.RetryPolicy {
        private long mRetryOrigin;
        private final long mTotalMs;

        public ExponentialBackoffRetryPolicy(long r1) {
                r0 = this;
                r0.<init>()
                r0.mTotalMs = r1
                return
        }

        @Override // androidx.emoji2.text.FontRequestEmojiCompatConfig.RetryPolicy
        public long getRetryDelay() {
                r6 = this;
                long r0 = r6.mRetryOrigin
                r2 = 0
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 != 0) goto Lf
                long r0 = android.os.SystemClock.uptimeMillis()
                r6.mRetryOrigin = r0
                return r2
            Lf:
                long r0 = android.os.SystemClock.uptimeMillis()
                long r2 = r6.mRetryOrigin
                long r0 = r0 - r2
                long r2 = r6.mTotalMs
                int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r2 <= 0) goto L1f
                r2 = -1
                return r2
            L1f:
                r2 = 1000(0x3e8, double:4.94E-321)
                long r2 = java.lang.Math.max(r0, r2)
                long r4 = r6.mTotalMs
                long r4 = r4 - r0
                long r2 = java.lang.Math.min(r2, r4)
                return r2
        }
    }

    public static class FontProviderHelper {
        public FontProviderHelper() {
                r0 = this;
                r0.<init>()
                return
        }

        public android.graphics.Typeface buildTypeface(android.content.Context r3, androidx.core.provider.FontsContractCompat.FontInfo r4) throws android.content.pm.PackageManager.NameNotFoundException {
                r2 = this;
                r0 = 1
                androidx.core.provider.FontsContractCompat$FontInfo[] r0 = new androidx.core.provider.FontsContractCompat.FontInfo[r0]
                r1 = 0
                r0[r1] = r4
                r1 = 0
                android.graphics.Typeface r0 = androidx.core.provider.FontsContractCompat.buildTypeface(r3, r1, r0)
                return r0
        }

        public androidx.core.provider.FontsContractCompat.FontFamilyResult fetchFonts(android.content.Context r2, androidx.core.provider.FontRequest r3) throws android.content.pm.PackageManager.NameNotFoundException {
                r1 = this;
                r0 = 0
                androidx.core.provider.FontsContractCompat$FontFamilyResult r0 = androidx.core.provider.FontsContractCompat.fetchFonts(r2, r0, r3)
                return r0
        }

        public void registerObserver(android.content.Context r3, android.net.Uri r4, android.database.ContentObserver r5) {
                r2 = this;
                android.content.ContentResolver r0 = r3.getContentResolver()
                r1 = 0
                r0.registerContentObserver(r4, r1, r5)
                return
        }

        public void unregisterObserver(android.content.Context r2, android.database.ContentObserver r3) {
                r1 = this;
                android.content.ContentResolver r0 = r2.getContentResolver()
                r0.unregisterContentObserver(r3)
                return
        }
    }

    private static class FontRequestMetadataLoader implements androidx.emoji2.text.EmojiCompat.MetadataRepoLoader {
        private static final java.lang.String S_TRACE_BUILD_TYPEFACE = "EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface";
        androidx.emoji2.text.EmojiCompat.MetadataRepoLoaderCallback mCallback;
        private final android.content.Context mContext;
        private java.util.concurrent.Executor mExecutor;
        private final androidx.emoji2.text.FontRequestEmojiCompatConfig.FontProviderHelper mFontProviderHelper;
        private final java.lang.Object mLock;
        private android.os.Handler mMainHandler;
        private java.lang.Runnable mMainHandlerLoadCallback;
        private java.util.concurrent.ThreadPoolExecutor mMyThreadPoolExecutor;
        private android.database.ContentObserver mObserver;
        private final androidx.core.provider.FontRequest mRequest;
        private androidx.emoji2.text.FontRequestEmojiCompatConfig.RetryPolicy mRetryPolicy;


        FontRequestMetadataLoader(android.content.Context r2, androidx.core.provider.FontRequest r3, androidx.emoji2.text.FontRequestEmojiCompatConfig.FontProviderHelper r4) {
                r1 = this;
                r1.<init>()
                java.lang.Object r0 = new java.lang.Object
                r0.<init>()
                r1.mLock = r0
                java.lang.String r0 = "Context cannot be null"
                androidx.core.util.Preconditions.checkNotNull(r2, r0)
                java.lang.String r0 = "FontRequest cannot be null"
                androidx.core.util.Preconditions.checkNotNull(r3, r0)
                android.content.Context r0 = r2.getApplicationContext()
                r1.mContext = r0
                r1.mRequest = r3
                r1.mFontProviderHelper = r4
                return
        }

        private void cleanUp() {
                r5 = this;
                java.lang.Object r0 = r5.mLock
                monitor-enter(r0)
                r1 = 0
                r5.mCallback = r1     // Catch: java.lang.Throwable -> L31
                android.database.ContentObserver r2 = r5.mObserver     // Catch: java.lang.Throwable -> L31
                if (r2 == 0) goto L15
                androidx.emoji2.text.FontRequestEmojiCompatConfig$FontProviderHelper r2 = r5.mFontProviderHelper     // Catch: java.lang.Throwable -> L31
                android.content.Context r3 = r5.mContext     // Catch: java.lang.Throwable -> L31
                android.database.ContentObserver r4 = r5.mObserver     // Catch: java.lang.Throwable -> L31
                r2.unregisterObserver(r3, r4)     // Catch: java.lang.Throwable -> L31
                r5.mObserver = r1     // Catch: java.lang.Throwable -> L31
            L15:
                android.os.Handler r2 = r5.mMainHandler     // Catch: java.lang.Throwable -> L31
                if (r2 == 0) goto L20
                android.os.Handler r2 = r5.mMainHandler     // Catch: java.lang.Throwable -> L31
                java.lang.Runnable r3 = r5.mMainHandlerLoadCallback     // Catch: java.lang.Throwable -> L31
                r2.removeCallbacks(r3)     // Catch: java.lang.Throwable -> L31
            L20:
                r5.mMainHandler = r1     // Catch: java.lang.Throwable -> L31
                java.util.concurrent.ThreadPoolExecutor r2 = r5.mMyThreadPoolExecutor     // Catch: java.lang.Throwable -> L31
                if (r2 == 0) goto L2b
                java.util.concurrent.ThreadPoolExecutor r2 = r5.mMyThreadPoolExecutor     // Catch: java.lang.Throwable -> L31
                r2.shutdown()     // Catch: java.lang.Throwable -> L31
            L2b:
                r5.mExecutor = r1     // Catch: java.lang.Throwable -> L31
                r5.mMyThreadPoolExecutor = r1     // Catch: java.lang.Throwable -> L31
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L31
                return
            L31:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L31
                throw r1
        }

        private androidx.core.provider.FontsContractCompat.FontInfo retrieveFontInfo() {
                r4 = this;
                androidx.emoji2.text.FontRequestEmojiCompatConfig$FontProviderHelper r0 = r4.mFontProviderHelper     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L49
                android.content.Context r1 = r4.mContext     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L49
                androidx.core.provider.FontRequest r2 = r4.mRequest     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L49
                androidx.core.provider.FontsContractCompat$FontFamilyResult r0 = r0.fetchFonts(r1, r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L49
                int r1 = r0.getStatusCode()
                if (r1 != 0) goto L26
                androidx.core.provider.FontsContractCompat$FontInfo[] r1 = r0.getFonts()
                if (r1 == 0) goto L1e
                int r2 = r1.length
                if (r2 == 0) goto L1e
                r2 = 0
                r2 = r1[r2]
                return r2
            L1e:
                java.lang.RuntimeException r2 = new java.lang.RuntimeException
                java.lang.String r3 = "fetchFonts failed (empty result)"
                r2.<init>(r3)
                throw r2
            L26:
                java.lang.RuntimeException r1 = new java.lang.RuntimeException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "fetchFonts failed ("
                java.lang.StringBuilder r2 = r2.append(r3)
                int r3 = r0.getStatusCode()
                java.lang.StringBuilder r2 = r2.append(r3)
                java.lang.String r3 = ")"
                java.lang.StringBuilder r2 = r2.append(r3)
                java.lang.String r2 = r2.toString()
                r1.<init>(r2)
                throw r1
            L49:
                r0 = move-exception
                java.lang.RuntimeException r1 = new java.lang.RuntimeException
                java.lang.String r2 = "provider not found"
                r1.<init>(r2, r0)
                throw r1
        }

        private void scheduleRetry(android.net.Uri r6, long r7) {
                r5 = this;
                java.lang.Object r0 = r5.mLock
                monitor-enter(r0)
                android.os.Handler r1 = r5.mMainHandler     // Catch: java.lang.Throwable -> L35
                if (r1 != 0) goto Le
                android.os.Handler r2 = androidx.emoji2.text.ConcurrencyHelpers.mainHandlerAsync()     // Catch: java.lang.Throwable -> L35
                r1 = r2
                r5.mMainHandler = r1     // Catch: java.lang.Throwable -> L35
            Le:
                android.database.ContentObserver r2 = r5.mObserver     // Catch: java.lang.Throwable -> L35
                if (r2 != 0) goto L22
                androidx.emoji2.text.FontRequestEmojiCompatConfig$FontRequestMetadataLoader$1 r2 = new androidx.emoji2.text.FontRequestEmojiCompatConfig$FontRequestMetadataLoader$1     // Catch: java.lang.Throwable -> L35
                r2.<init>(r5, r1)     // Catch: java.lang.Throwable -> L35
                r5.mObserver = r2     // Catch: java.lang.Throwable -> L35
                androidx.emoji2.text.FontRequestEmojiCompatConfig$FontProviderHelper r2 = r5.mFontProviderHelper     // Catch: java.lang.Throwable -> L35
                android.content.Context r3 = r5.mContext     // Catch: java.lang.Throwable -> L35
                android.database.ContentObserver r4 = r5.mObserver     // Catch: java.lang.Throwable -> L35
                r2.registerObserver(r3, r6, r4)     // Catch: java.lang.Throwable -> L35
            L22:
                java.lang.Runnable r2 = r5.mMainHandlerLoadCallback     // Catch: java.lang.Throwable -> L35
                if (r2 != 0) goto L2d
                androidx.emoji2.text.FontRequestEmojiCompatConfig$FontRequestMetadataLoader$$ExternalSyntheticLambda1 r2 = new androidx.emoji2.text.FontRequestEmojiCompatConfig$FontRequestMetadataLoader$$ExternalSyntheticLambda1     // Catch: java.lang.Throwable -> L35
                r2.<init>(r5)     // Catch: java.lang.Throwable -> L35
                r5.mMainHandlerLoadCallback = r2     // Catch: java.lang.Throwable -> L35
            L2d:
                java.lang.Runnable r2 = r5.mMainHandlerLoadCallback     // Catch: java.lang.Throwable -> L35
                r1.postDelayed(r2, r7)     // Catch: java.lang.Throwable -> L35
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L35
                return
            L35:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L35
                throw r1
        }

        void createMetadata() {
                r7 = this;
                java.lang.Object r0 = r7.mLock
                monitor-enter(r0)
                androidx.emoji2.text.EmojiCompat$MetadataRepoLoaderCallback r1 = r7.mCallback     // Catch: java.lang.Throwable -> Lb2
                if (r1 != 0) goto L9
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb2
                return
            L9:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb2
                androidx.core.provider.FontsContractCompat$FontInfo r0 = r7.retrieveFontInfo()     // Catch: java.lang.Throwable -> L9c
                int r1 = r0.getResultCode()     // Catch: java.lang.Throwable -> L9c
                r2 = 2
                if (r1 != r2) goto L36
                java.lang.Object r2 = r7.mLock     // Catch: java.lang.Throwable -> L9c
                monitor-enter(r2)     // Catch: java.lang.Throwable -> L9c
                androidx.emoji2.text.FontRequestEmojiCompatConfig$RetryPolicy r3 = r7.mRetryPolicy     // Catch: java.lang.Throwable -> L33
                if (r3 == 0) goto L31
                androidx.emoji2.text.FontRequestEmojiCompatConfig$RetryPolicy r3 = r7.mRetryPolicy     // Catch: java.lang.Throwable -> L33
                long r3 = r3.getRetryDelay()     // Catch: java.lang.Throwable -> L33
                r5 = 0
                int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r5 < 0) goto L31
                android.net.Uri r5 = r0.getUri()     // Catch: java.lang.Throwable -> L33
                r7.scheduleRetry(r5, r3)     // Catch: java.lang.Throwable -> L33
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L33
                return
            L31:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L33
                goto L36
            L33:
                r3 = move-exception
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L33
                throw r3     // Catch: java.lang.Throwable -> L9c
            L36:
                if (r1 != 0) goto L7d
                java.lang.String r2 = "EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface"
                androidx.core.os.TraceCompat.beginSection(r2)     // Catch: java.lang.Throwable -> L78
                androidx.emoji2.text.FontRequestEmojiCompatConfig$FontProviderHelper r2 = r7.mFontProviderHelper     // Catch: java.lang.Throwable -> L78
                android.content.Context r3 = r7.mContext     // Catch: java.lang.Throwable -> L78
                android.graphics.Typeface r2 = r2.buildTypeface(r3, r0)     // Catch: java.lang.Throwable -> L78
                android.content.Context r3 = r7.mContext     // Catch: java.lang.Throwable -> L78
                android.net.Uri r4 = r0.getUri()     // Catch: java.lang.Throwable -> L78
                r5 = 0
                java.nio.ByteBuffer r3 = androidx.core.graphics.TypefaceCompatUtil.mmap(r3, r5, r4)     // Catch: java.lang.Throwable -> L78
                if (r3 == 0) goto L70
                if (r2 == 0) goto L70
                androidx.emoji2.text.MetadataRepo r4 = androidx.emoji2.text.MetadataRepo.create(r2, r3)     // Catch: java.lang.Throwable -> L78
                androidx.core.os.TraceCompat.endSection()     // Catch: java.lang.Throwable -> L9c
                java.lang.Object r2 = r7.mLock     // Catch: java.lang.Throwable -> L9c
                monitor-enter(r2)     // Catch: java.lang.Throwable -> L9c
                androidx.emoji2.text.EmojiCompat$MetadataRepoLoaderCallback r3 = r7.mCallback     // Catch: java.lang.Throwable -> L6d
                if (r3 == 0) goto L68
                androidx.emoji2.text.EmojiCompat$MetadataRepoLoaderCallback r3 = r7.mCallback     // Catch: java.lang.Throwable -> L6d
                r3.onLoaded(r4)     // Catch: java.lang.Throwable -> L6d
            L68:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L6d
                r7.cleanUp()     // Catch: java.lang.Throwable -> L9c
                goto Lae
            L6d:
                r3 = move-exception
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L6d
                throw r3     // Catch: java.lang.Throwable -> L9c
            L70:
                java.lang.RuntimeException r4 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L78
                java.lang.String r5 = "Unable to open file."
                r4.<init>(r5)     // Catch: java.lang.Throwable -> L78
                throw r4     // Catch: java.lang.Throwable -> L78
            L78:
                r2 = move-exception
                androidx.core.os.TraceCompat.endSection()     // Catch: java.lang.Throwable -> L9c
                throw r2     // Catch: java.lang.Throwable -> L9c
            L7d:
                java.lang.RuntimeException r2 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L9c
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L9c
                r3.<init>()     // Catch: java.lang.Throwable -> L9c
                java.lang.String r4 = "fetchFonts result is not OK. ("
                java.lang.StringBuilder r3 = r3.append(r4)     // Catch: java.lang.Throwable -> L9c
                java.lang.StringBuilder r3 = r3.append(r1)     // Catch: java.lang.Throwable -> L9c
                java.lang.String r4 = ")"
                java.lang.StringBuilder r3 = r3.append(r4)     // Catch: java.lang.Throwable -> L9c
                java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L9c
                r2.<init>(r3)     // Catch: java.lang.Throwable -> L9c
                throw r2     // Catch: java.lang.Throwable -> L9c
            L9c:
                r0 = move-exception
                r1 = r0
                java.lang.Object r2 = r7.mLock
                monitor-enter(r2)
                androidx.emoji2.text.EmojiCompat$MetadataRepoLoaderCallback r0 = r7.mCallback     // Catch: java.lang.Throwable -> Laf
                if (r0 == 0) goto Laa
                androidx.emoji2.text.EmojiCompat$MetadataRepoLoaderCallback r0 = r7.mCallback     // Catch: java.lang.Throwable -> Laf
                r0.onFailed(r1)     // Catch: java.lang.Throwable -> Laf
            Laa:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> Laf
                r7.cleanUp()
            Lae:
                return
            Laf:
                r0 = move-exception
                monitor-exit(r2)     // Catch: java.lang.Throwable -> Laf
                throw r0
            Lb2:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb2
                throw r1
        }

        @Override // androidx.emoji2.text.EmojiCompat.MetadataRepoLoader
        public void load(androidx.emoji2.text.EmojiCompat.MetadataRepoLoaderCallback r3) {
                r2 = this;
                java.lang.String r0 = "LoaderCallback cannot be null"
                androidx.core.util.Preconditions.checkNotNull(r3, r0)
                java.lang.Object r0 = r2.mLock
                monitor-enter(r0)
                r2.mCallback = r3     // Catch: java.lang.Throwable -> Lf
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
                r2.loadInternal()
                return
            Lf:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
                throw r1
        }

        void loadInternal() {
                r3 = this;
                java.lang.Object r0 = r3.mLock
                monitor-enter(r0)
                androidx.emoji2.text.EmojiCompat$MetadataRepoLoaderCallback r1 = r3.mCallback     // Catch: java.lang.Throwable -> L25
                if (r1 != 0) goto L9
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L25
                return
            L9:
                java.util.concurrent.Executor r1 = r3.mExecutor     // Catch: java.lang.Throwable -> L25
                if (r1 != 0) goto L19
                java.lang.String r1 = "emojiCompat"
                java.util.concurrent.ThreadPoolExecutor r1 = androidx.emoji2.text.ConcurrencyHelpers.createBackgroundPriorityExecutor(r1)     // Catch: java.lang.Throwable -> L25
                r3.mMyThreadPoolExecutor = r1     // Catch: java.lang.Throwable -> L25
                java.util.concurrent.ThreadPoolExecutor r1 = r3.mMyThreadPoolExecutor     // Catch: java.lang.Throwable -> L25
                r3.mExecutor = r1     // Catch: java.lang.Throwable -> L25
            L19:
                java.util.concurrent.Executor r1 = r3.mExecutor     // Catch: java.lang.Throwable -> L25
                androidx.emoji2.text.FontRequestEmojiCompatConfig$FontRequestMetadataLoader$$ExternalSyntheticLambda0 r2 = new androidx.emoji2.text.FontRequestEmojiCompatConfig$FontRequestMetadataLoader$$ExternalSyntheticLambda0     // Catch: java.lang.Throwable -> L25
                r2.<init>(r3)     // Catch: java.lang.Throwable -> L25
                r1.execute(r2)     // Catch: java.lang.Throwable -> L25
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L25
                return
            L25:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L25
                throw r1
        }

        public void setExecutor(java.util.concurrent.Executor r3) {
                r2 = this;
                java.lang.Object r0 = r2.mLock
                monitor-enter(r0)
                r2.mExecutor = r3     // Catch: java.lang.Throwable -> L7
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
                return
            L7:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
                throw r1
        }

        public void setRetryPolicy(androidx.emoji2.text.FontRequestEmojiCompatConfig.RetryPolicy r3) {
                r2 = this;
                java.lang.Object r0 = r2.mLock
                monitor-enter(r0)
                r2.mRetryPolicy = r3     // Catch: java.lang.Throwable -> L7
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
                return
            L7:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
                throw r1
        }
    }

    public static abstract class RetryPolicy {
        public RetryPolicy() {
                r0 = this;
                r0.<init>()
                return
        }

        public abstract long getRetryDelay();
    }

    static {
            androidx.emoji2.text.FontRequestEmojiCompatConfig$FontProviderHelper r0 = new androidx.emoji2.text.FontRequestEmojiCompatConfig$FontProviderHelper
            r0.<init>()
            androidx.emoji2.text.FontRequestEmojiCompatConfig.DEFAULT_FONTS_CONTRACT = r0
            return
    }

    public FontRequestEmojiCompatConfig(android.content.Context r3, androidx.core.provider.FontRequest r4) {
            r2 = this;
            androidx.emoji2.text.FontRequestEmojiCompatConfig$FontRequestMetadataLoader r0 = new androidx.emoji2.text.FontRequestEmojiCompatConfig$FontRequestMetadataLoader
            androidx.emoji2.text.FontRequestEmojiCompatConfig$FontProviderHelper r1 = androidx.emoji2.text.FontRequestEmojiCompatConfig.DEFAULT_FONTS_CONTRACT
            r0.<init>(r3, r4, r1)
            r2.<init>(r0)
            return
    }

    public FontRequestEmojiCompatConfig(android.content.Context r2, androidx.core.provider.FontRequest r3, androidx.emoji2.text.FontRequestEmojiCompatConfig.FontProviderHelper r4) {
            r1 = this;
            androidx.emoji2.text.FontRequestEmojiCompatConfig$FontRequestMetadataLoader r0 = new androidx.emoji2.text.FontRequestEmojiCompatConfig$FontRequestMetadataLoader
            r0.<init>(r2, r3, r4)
            r1.<init>(r0)
            return
    }

    @java.lang.Deprecated
    public androidx.emoji2.text.FontRequestEmojiCompatConfig setHandler(android.os.Handler r2) {
            r1 = this;
            if (r2 != 0) goto L3
            return r1
        L3:
            java.util.concurrent.Executor r0 = androidx.emoji2.text.ConcurrencyHelpers.convertHandlerToExecutor(r2)
            r1.setLoadingExecutor(r0)
            return r1
    }

    public androidx.emoji2.text.FontRequestEmojiCompatConfig setLoadingExecutor(java.util.concurrent.Executor r2) {
            r1 = this;
            androidx.emoji2.text.EmojiCompat$MetadataRepoLoader r0 = r1.getMetadataRepoLoader()
            androidx.emoji2.text.FontRequestEmojiCompatConfig$FontRequestMetadataLoader r0 = (androidx.emoji2.text.FontRequestEmojiCompatConfig.FontRequestMetadataLoader) r0
            r0.setExecutor(r2)
            return r1
    }

    public androidx.emoji2.text.FontRequestEmojiCompatConfig setRetryPolicy(androidx.emoji2.text.FontRequestEmojiCompatConfig.RetryPolicy r2) {
            r1 = this;
            androidx.emoji2.text.EmojiCompat$MetadataRepoLoader r0 = r1.getMetadataRepoLoader()
            androidx.emoji2.text.FontRequestEmojiCompatConfig$FontRequestMetadataLoader r0 = (androidx.emoji2.text.FontRequestEmojiCompatConfig.FontRequestMetadataLoader) r0
            r0.setRetryPolicy(r2)
            return r1
    }
}
