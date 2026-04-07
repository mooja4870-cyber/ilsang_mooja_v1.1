package androidx.emoji2.text;

/* JADX INFO: loaded from: classes.dex */
public class EmojiCompatInitializer implements androidx.startup.Initializer<java.lang.Boolean> {
    private static final long STARTUP_THREAD_CREATION_DELAY_MS = 500;
    private static final java.lang.String S_INITIALIZER_THREAD_NAME = "EmojiCompatInitializer";


    static class BackgroundDefaultConfig extends androidx.emoji2.text.EmojiCompat.Config {
        protected BackgroundDefaultConfig(android.content.Context r2) {
                r1 = this;
                androidx.emoji2.text.EmojiCompatInitializer$BackgroundDefaultLoader r0 = new androidx.emoji2.text.EmojiCompatInitializer$BackgroundDefaultLoader
                r0.<init>(r2)
                r1.<init>(r0)
                r0 = 1
                r1.setMetadataLoadStrategy(r0)
                return
        }
    }

    static class BackgroundDefaultLoader implements androidx.emoji2.text.EmojiCompat.MetadataRepoLoader {
        private final android.content.Context mContext;


        BackgroundDefaultLoader(android.content.Context r2) {
                r1 = this;
                r1.<init>()
                android.content.Context r0 = r2.getApplicationContext()
                r1.mContext = r0
                return
        }

        void doLoad(androidx.emoji2.text.EmojiCompat.MetadataRepoLoaderCallback r4, java.util.concurrent.ThreadPoolExecutor r5) {
                r3 = this;
                android.content.Context r0 = r3.mContext     // Catch: java.lang.Throwable -> L20
                androidx.emoji2.text.FontRequestEmojiCompatConfig r0 = androidx.emoji2.text.DefaultEmojiCompatConfig.create(r0)     // Catch: java.lang.Throwable -> L20
                if (r0 == 0) goto L18
                r0.setLoadingExecutor(r5)     // Catch: java.lang.Throwable -> L20
                androidx.emoji2.text.EmojiCompat$MetadataRepoLoader r1 = r0.getMetadataRepoLoader()     // Catch: java.lang.Throwable -> L20
                androidx.emoji2.text.EmojiCompatInitializer$BackgroundDefaultLoader$1 r2 = new androidx.emoji2.text.EmojiCompatInitializer$BackgroundDefaultLoader$1     // Catch: java.lang.Throwable -> L20
                r2.<init>(r3, r4, r5)     // Catch: java.lang.Throwable -> L20
                r1.load(r2)     // Catch: java.lang.Throwable -> L20
                goto L27
            L18:
                java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L20
                java.lang.String r2 = "EmojiCompat font provider not available on this device."
                r1.<init>(r2)     // Catch: java.lang.Throwable -> L20
                throw r1     // Catch: java.lang.Throwable -> L20
            L20:
                r0 = move-exception
                r4.onFailed(r0)
                r5.shutdown()
            L27:
                return
        }

        /* JADX INFO: renamed from: lambda$load$0$androidx-emoji2-text-EmojiCompatInitializer$BackgroundDefaultLoader, reason: not valid java name */
        /* synthetic */ void m79x5cc8028a(androidx.emoji2.text.EmojiCompat.MetadataRepoLoaderCallback r1, java.util.concurrent.ThreadPoolExecutor r2) {
                r0 = this;
                r0.doLoad(r1, r2)
                return
        }

        @Override // androidx.emoji2.text.EmojiCompat.MetadataRepoLoader
        public void load(androidx.emoji2.text.EmojiCompat.MetadataRepoLoaderCallback r3) {
                r2 = this;
                java.lang.String r0 = "EmojiCompatInitializer"
                java.util.concurrent.ThreadPoolExecutor r0 = androidx.emoji2.text.ConcurrencyHelpers.createBackgroundPriorityExecutor(r0)
                androidx.emoji2.text.EmojiCompatInitializer$BackgroundDefaultLoader$$ExternalSyntheticLambda0 r1 = new androidx.emoji2.text.EmojiCompatInitializer$BackgroundDefaultLoader$$ExternalSyntheticLambda0
                r1.<init>(r2, r3, r0)
                r0.execute(r1)
                return
        }
    }

    static class LoadEmojiCompatRunnable implements java.lang.Runnable {
        LoadEmojiCompatRunnable() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r1 = this;
                java.lang.String r0 = "EmojiCompat.EmojiCompatInitializer.run"
                androidx.core.os.TraceCompat.beginSection(r0)     // Catch: java.lang.Throwable -> L17
                boolean r0 = androidx.emoji2.text.EmojiCompat.isConfigured()     // Catch: java.lang.Throwable -> L17
                if (r0 == 0) goto L12
                androidx.emoji2.text.EmojiCompat r0 = androidx.emoji2.text.EmojiCompat.get()     // Catch: java.lang.Throwable -> L17
                r0.load()     // Catch: java.lang.Throwable -> L17
            L12:
                androidx.core.os.TraceCompat.endSection()
                return
            L17:
                r0 = move-exception
                androidx.core.os.TraceCompat.endSection()
                throw r0
        }
    }

    public EmojiCompatInitializer() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.startup.Initializer
    public java.lang.Boolean create(android.content.Context r2) {
            r1 = this;
            androidx.emoji2.text.EmojiCompatInitializer$BackgroundDefaultConfig r0 = new androidx.emoji2.text.EmojiCompatInitializer$BackgroundDefaultConfig
            r0.<init>(r2)
            androidx.emoji2.text.EmojiCompat.init(r0)
            r1.delayUntilFirstResume(r2)
            r0 = 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
    }

    @Override // androidx.startup.Initializer
    public /* bridge */ /* synthetic */ java.lang.Boolean create(android.content.Context r1) {
            r0 = this;
            java.lang.Boolean r1 = r0.create(r1)
            return r1
    }

    void delayUntilFirstResume(android.content.Context r5) {
            r4 = this;
            androidx.startup.AppInitializer r0 = androidx.startup.AppInitializer.getInstance(r5)
            java.lang.Class<androidx.lifecycle.ProcessLifecycleInitializer> r1 = androidx.lifecycle.ProcessLifecycleInitializer.class
            java.lang.Object r1 = r0.initializeComponent(r1)
            androidx.lifecycle.LifecycleOwner r1 = (androidx.lifecycle.LifecycleOwner) r1
            androidx.lifecycle.Lifecycle r2 = r1.getLifecycle()
            androidx.emoji2.text.EmojiCompatInitializer$1 r3 = new androidx.emoji2.text.EmojiCompatInitializer$1
            r3.<init>(r4, r2)
            r2.addObserver(r3)
            return
    }

    @Override // androidx.startup.Initializer
    public java.util.List<java.lang.Class<? extends androidx.startup.Initializer<?>>> dependencies() {
            r1 = this;
            java.lang.Class<androidx.lifecycle.ProcessLifecycleInitializer> r0 = androidx.lifecycle.ProcessLifecycleInitializer.class
            java.util.List r0 = java.util.Collections.singletonList(r0)
            return r0
    }

    void loadEmojiCompatAfterDelay() {
            r4 = this;
            android.os.Handler r0 = androidx.emoji2.text.ConcurrencyHelpers.mainHandlerAsync()
            androidx.emoji2.text.EmojiCompatInitializer$LoadEmojiCompatRunnable r1 = new androidx.emoji2.text.EmojiCompatInitializer$LoadEmojiCompatRunnable
            r1.<init>()
            r2 = 500(0x1f4, double:2.47E-321)
            r0.postDelayed(r1, r2)
            return
    }
}
