package androidx.emoji2.text;

/* JADX INFO: loaded from: classes.dex */
public class EmojiCompat {
    private static final java.lang.Object CONFIG_LOCK = null;
    public static final java.lang.String EDITOR_INFO_METAVERSION_KEY = "android.support.text.emoji.emojiCompat_metadataVersion";
    public static final java.lang.String EDITOR_INFO_REPLACE_ALL_KEY = "android.support.text.emoji.emojiCompat_replaceAll";
    static final int EMOJI_COUNT_UNLIMITED = Integer.MAX_VALUE;
    public static final int EMOJI_FALLBACK = 2;
    public static final int EMOJI_SUPPORTED = 1;
    public static final int EMOJI_UNSUPPORTED = 0;
    private static final java.lang.Object INSTANCE_LOCK = null;
    public static final int LOAD_STATE_DEFAULT = 3;
    public static final int LOAD_STATE_FAILED = 2;
    public static final int LOAD_STATE_LOADING = 0;
    public static final int LOAD_STATE_SUCCEEDED = 1;
    public static final int LOAD_STRATEGY_DEFAULT = 0;
    public static final int LOAD_STRATEGY_MANUAL = 1;
    private static final java.lang.String NOT_INITIALIZED_ERROR_TEXT = "EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.";
    public static final int REPLACE_STRATEGY_ALL = 1;
    public static final int REPLACE_STRATEGY_DEFAULT = 0;
    public static final int REPLACE_STRATEGY_NON_EXISTENT = 2;
    private static volatile boolean sHasDoneDefaultConfigLookup;
    private static volatile androidx.emoji2.text.EmojiCompat sInstance;
    final int[] mEmojiAsDefaultStyleExceptions;
    private final int mEmojiSpanIndicatorColor;
    private final boolean mEmojiSpanIndicatorEnabled;
    private final androidx.emoji2.text.EmojiCompat.GlyphChecker mGlyphChecker;
    private final androidx.emoji2.text.EmojiCompat.CompatInternal mHelper;
    private final java.util.Set<androidx.emoji2.text.EmojiCompat.InitCallback> mInitCallbacks;
    private final java.util.concurrent.locks.ReadWriteLock mInitLock;
    private volatile int mLoadState;
    private final android.os.Handler mMainHandler;
    private final int mMetadataLoadStrategy;
    final androidx.emoji2.text.EmojiCompat.MetadataRepoLoader mMetadataLoader;
    final boolean mReplaceAll;
    private final androidx.emoji2.text.EmojiCompat.SpanFactory mSpanFactory;
    final boolean mUseEmojiAsDefaultStyle;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface CodepointSequenceMatchResult {
    }

    private static class CompatInternal {
        final androidx.emoji2.text.EmojiCompat mEmojiCompat;

        CompatInternal(androidx.emoji2.text.EmojiCompat r1) {
                r0 = this;
                r0.<init>()
                r0.mEmojiCompat = r1
                return
        }

        java.lang.String getAssetSignature() {
                r1 = this;
                java.lang.String r0 = ""
                return r0
        }

        int getEmojiEnd(java.lang.CharSequence r2, int r3) {
                r1 = this;
                r0 = -1
                return r0
        }

        public int getEmojiMatch(java.lang.CharSequence r2, int r3) {
                r1 = this;
                r0 = 0
                return r0
        }

        int getEmojiStart(java.lang.CharSequence r2, int r3) {
                r1 = this;
                r0 = -1
                return r0
        }

        boolean hasEmojiGlyph(java.lang.CharSequence r2) {
                r1 = this;
                r0 = 0
                return r0
        }

        boolean hasEmojiGlyph(java.lang.CharSequence r2, int r3) {
                r1 = this;
                r0 = 0
                return r0
        }

        void loadMetadata() {
                r1 = this;
                androidx.emoji2.text.EmojiCompat r0 = r1.mEmojiCompat
                r0.onMetadataLoadSuccess()
                return
        }

        java.lang.CharSequence process(java.lang.CharSequence r1, int r2, int r3, int r4, boolean r5) {
                r0 = this;
                return r1
        }

        void updateEditorInfoAttrs(android.view.inputmethod.EditorInfo r1) {
                r0 = this;
                return
        }
    }

    private static final class CompatInternal19 extends androidx.emoji2.text.EmojiCompat.CompatInternal {
        private volatile androidx.emoji2.text.MetadataRepo mMetadataRepo;
        private volatile androidx.emoji2.text.EmojiProcessor mProcessor;


        CompatInternal19(androidx.emoji2.text.EmojiCompat r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // androidx.emoji2.text.EmojiCompat.CompatInternal
        java.lang.String getAssetSignature() {
                r2 = this;
                androidx.emoji2.text.MetadataRepo r0 = r2.mMetadataRepo
                androidx.emoji2.text.flatbuffer.MetadataList r0 = r0.getMetadataList()
                java.lang.String r0 = r0.sourceSha()
                if (r0 != 0) goto Lf
                java.lang.String r1 = ""
                goto L10
            Lf:
                r1 = r0
            L10:
                return r1
        }

        @Override // androidx.emoji2.text.EmojiCompat.CompatInternal
        int getEmojiEnd(java.lang.CharSequence r2, int r3) {
                r1 = this;
                androidx.emoji2.text.EmojiProcessor r0 = r1.mProcessor
                int r0 = r0.getEmojiEnd(r2, r3)
                return r0
        }

        @Override // androidx.emoji2.text.EmojiCompat.CompatInternal
        public int getEmojiMatch(java.lang.CharSequence r2, int r3) {
                r1 = this;
                androidx.emoji2.text.EmojiProcessor r0 = r1.mProcessor
                int r0 = r0.getEmojiMatch(r2, r3)
                return r0
        }

        @Override // androidx.emoji2.text.EmojiCompat.CompatInternal
        int getEmojiStart(java.lang.CharSequence r2, int r3) {
                r1 = this;
                androidx.emoji2.text.EmojiProcessor r0 = r1.mProcessor
                int r0 = r0.getEmojiStart(r2, r3)
                return r0
        }

        @Override // androidx.emoji2.text.EmojiCompat.CompatInternal
        boolean hasEmojiGlyph(java.lang.CharSequence r3) {
                r2 = this;
                androidx.emoji2.text.EmojiProcessor r0 = r2.mProcessor
                int r0 = r0.getEmojiMatch(r3)
                r1 = 1
                if (r0 != r1) goto La
                goto Lb
            La:
                r1 = 0
            Lb:
                return r1
        }

        @Override // androidx.emoji2.text.EmojiCompat.CompatInternal
        boolean hasEmojiGlyph(java.lang.CharSequence r3, int r4) {
                r2 = this;
                androidx.emoji2.text.EmojiProcessor r0 = r2.mProcessor
                int r0 = r0.getEmojiMatch(r3, r4)
                r1 = 1
                if (r0 != r1) goto La
                goto Lb
            La:
                r1 = 0
            Lb:
                return r1
        }

        @Override // androidx.emoji2.text.EmojiCompat.CompatInternal
        void loadMetadata() {
                r2 = this;
                androidx.emoji2.text.EmojiCompat$CompatInternal19$1 r0 = new androidx.emoji2.text.EmojiCompat$CompatInternal19$1     // Catch: java.lang.Throwable -> Ld
                r0.<init>(r2)     // Catch: java.lang.Throwable -> Ld
                androidx.emoji2.text.EmojiCompat r1 = r2.mEmojiCompat     // Catch: java.lang.Throwable -> Ld
                androidx.emoji2.text.EmojiCompat$MetadataRepoLoader r1 = r1.mMetadataLoader     // Catch: java.lang.Throwable -> Ld
                r1.load(r0)     // Catch: java.lang.Throwable -> Ld
                goto L13
            Ld:
                r0 = move-exception
                androidx.emoji2.text.EmojiCompat r1 = r2.mEmojiCompat
                r1.onMetadataLoadFailed(r0)
            L13:
                return
        }

        void onMetadataLoadSuccess(androidx.emoji2.text.MetadataRepo r11) {
                r10 = this;
                if (r11 != 0) goto Lf
                androidx.emoji2.text.EmojiCompat r0 = r10.mEmojiCompat
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r2 = "metadataRepo cannot be null"
                r1.<init>(r2)
                r0.onMetadataLoadFailed(r1)
                return
            Lf:
                r10.mMetadataRepo = r11
                androidx.emoji2.text.EmojiProcessor r3 = new androidx.emoji2.text.EmojiProcessor
                androidx.emoji2.text.MetadataRepo r4 = r10.mMetadataRepo
                androidx.emoji2.text.EmojiCompat r0 = r10.mEmojiCompat
                androidx.emoji2.text.EmojiCompat$SpanFactory r5 = androidx.emoji2.text.EmojiCompat.access$000(r0)
                androidx.emoji2.text.EmojiCompat r0 = r10.mEmojiCompat
                androidx.emoji2.text.EmojiCompat$GlyphChecker r6 = androidx.emoji2.text.EmojiCompat.access$100(r0)
                androidx.emoji2.text.EmojiCompat r0 = r10.mEmojiCompat
                boolean r7 = r0.mUseEmojiAsDefaultStyle
                androidx.emoji2.text.EmojiCompat r0 = r10.mEmojiCompat
                int[] r8 = r0.mEmojiAsDefaultStyleExceptions
                java.util.Set r9 = androidx.emoji2.text.EmojiExclusions.getEmojiExclusions()
                r3.<init>(r4, r5, r6, r7, r8, r9)
                r10.mProcessor = r3
                androidx.emoji2.text.EmojiCompat r0 = r10.mEmojiCompat
                r0.onMetadataLoadSuccess()
                return
        }

        @Override // androidx.emoji2.text.EmojiCompat.CompatInternal
        java.lang.CharSequence process(java.lang.CharSequence r7, int r8, int r9, int r10, boolean r11) {
                r6 = this;
                androidx.emoji2.text.EmojiProcessor r0 = r6.mProcessor
                r1 = r7
                r2 = r8
                r3 = r9
                r4 = r10
                r5 = r11
                java.lang.CharSequence r7 = r0.process(r1, r2, r3, r4, r5)
                return r7
        }

        @Override // androidx.emoji2.text.EmojiCompat.CompatInternal
        void updateEditorInfoAttrs(android.view.inputmethod.EditorInfo r4) {
                r3 = this;
                android.os.Bundle r0 = r4.extras
                androidx.emoji2.text.MetadataRepo r1 = r3.mMetadataRepo
                int r1 = r1.getMetadataVersion()
                java.lang.String r2 = "android.support.text.emoji.emojiCompat_metadataVersion"
                r0.putInt(r2, r1)
                android.os.Bundle r0 = r4.extras
                androidx.emoji2.text.EmojiCompat r1 = r3.mEmojiCompat
                boolean r1 = r1.mReplaceAll
                java.lang.String r2 = "android.support.text.emoji.emojiCompat_replaceAll"
                r0.putBoolean(r2, r1)
                return
        }
    }

    public static abstract class Config {
        int[] mEmojiAsDefaultStyleExceptions;
        int mEmojiSpanIndicatorColor;
        boolean mEmojiSpanIndicatorEnabled;
        androidx.emoji2.text.EmojiCompat.GlyphChecker mGlyphChecker;
        java.util.Set<androidx.emoji2.text.EmojiCompat.InitCallback> mInitCallbacks;
        int mMetadataLoadStrategy;
        final androidx.emoji2.text.EmojiCompat.MetadataRepoLoader mMetadataLoader;
        boolean mReplaceAll;
        androidx.emoji2.text.EmojiCompat.SpanFactory mSpanFactory;
        boolean mUseEmojiAsDefaultStyle;

        protected Config(androidx.emoji2.text.EmojiCompat.MetadataRepoLoader r2) {
                r1 = this;
                r1.<init>()
                r0 = -16711936(0xffffffffff00ff00, float:-1.7146522E38)
                r1.mEmojiSpanIndicatorColor = r0
                r0 = 0
                r1.mMetadataLoadStrategy = r0
                androidx.emoji2.text.DefaultGlyphChecker r0 = new androidx.emoji2.text.DefaultGlyphChecker
                r0.<init>()
                r1.mGlyphChecker = r0
                java.lang.String r0 = "metadataLoader cannot be null."
                androidx.core.util.Preconditions.checkNotNull(r2, r0)
                r1.mMetadataLoader = r2
                return
        }

        protected final androidx.emoji2.text.EmojiCompat.MetadataRepoLoader getMetadataRepoLoader() {
                r1 = this;
                androidx.emoji2.text.EmojiCompat$MetadataRepoLoader r0 = r1.mMetadataLoader
                return r0
        }

        public androidx.emoji2.text.EmojiCompat.Config registerInitCallback(androidx.emoji2.text.EmojiCompat.InitCallback r2) {
                r1 = this;
                java.lang.String r0 = "initCallback cannot be null"
                androidx.core.util.Preconditions.checkNotNull(r2, r0)
                java.util.Set<androidx.emoji2.text.EmojiCompat$InitCallback> r0 = r1.mInitCallbacks
                if (r0 != 0) goto L10
                androidx.collection.ArraySet r0 = new androidx.collection.ArraySet
                r0.<init>()
                r1.mInitCallbacks = r0
            L10:
                java.util.Set<androidx.emoji2.text.EmojiCompat$InitCallback> r0 = r1.mInitCallbacks
                r0.add(r2)
                return r1
        }

        public androidx.emoji2.text.EmojiCompat.Config setEmojiSpanIndicatorColor(int r1) {
                r0 = this;
                r0.mEmojiSpanIndicatorColor = r1
                return r0
        }

        public androidx.emoji2.text.EmojiCompat.Config setEmojiSpanIndicatorEnabled(boolean r1) {
                r0 = this;
                r0.mEmojiSpanIndicatorEnabled = r1
                return r0
        }

        public androidx.emoji2.text.EmojiCompat.Config setGlyphChecker(androidx.emoji2.text.EmojiCompat.GlyphChecker r2) {
                r1 = this;
                java.lang.String r0 = "GlyphChecker cannot be null"
                androidx.core.util.Preconditions.checkNotNull(r2, r0)
                r1.mGlyphChecker = r2
                return r1
        }

        public androidx.emoji2.text.EmojiCompat.Config setMetadataLoadStrategy(int r1) {
                r0 = this;
                r0.mMetadataLoadStrategy = r1
                return r0
        }

        public androidx.emoji2.text.EmojiCompat.Config setReplaceAll(boolean r1) {
                r0 = this;
                r0.mReplaceAll = r1
                return r0
        }

        public androidx.emoji2.text.EmojiCompat.Config setSpanFactory(androidx.emoji2.text.EmojiCompat.SpanFactory r1) {
                r0 = this;
                r0.mSpanFactory = r1
                return r0
        }

        public androidx.emoji2.text.EmojiCompat.Config setUseEmojiAsDefaultStyle(boolean r2) {
                r1 = this;
                r0 = 0
                androidx.emoji2.text.EmojiCompat$Config r0 = r1.setUseEmojiAsDefaultStyle(r2, r0)
                return r0
        }

        public androidx.emoji2.text.EmojiCompat.Config setUseEmojiAsDefaultStyle(boolean r7, java.util.List<java.lang.Integer> r8) {
                r6 = this;
                r6.mUseEmojiAsDefaultStyle = r7
                boolean r0 = r6.mUseEmojiAsDefaultStyle
                if (r0 == 0) goto L33
                if (r8 == 0) goto L33
                int r0 = r8.size()
                int[] r0 = new int[r0]
                r6.mEmojiAsDefaultStyleExceptions = r0
                r0 = 0
                java.util.Iterator r1 = r8.iterator()
            L15:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L2d
                java.lang.Object r2 = r1.next()
                java.lang.Integer r2 = (java.lang.Integer) r2
                int[] r3 = r6.mEmojiAsDefaultStyleExceptions
                int r4 = r0 + 1
                int r5 = r2.intValue()
                r3[r0] = r5
                r0 = r4
                goto L15
            L2d:
                int[] r1 = r6.mEmojiAsDefaultStyleExceptions
                java.util.Arrays.sort(r1)
                goto L36
            L33:
                r0 = 0
                r6.mEmojiAsDefaultStyleExceptions = r0
            L36:
                return r6
        }

        public androidx.emoji2.text.EmojiCompat.Config unregisterInitCallback(androidx.emoji2.text.EmojiCompat.InitCallback r2) {
                r1 = this;
                java.lang.String r0 = "initCallback cannot be null"
                androidx.core.util.Preconditions.checkNotNull(r2, r0)
                java.util.Set<androidx.emoji2.text.EmojiCompat$InitCallback> r0 = r1.mInitCallbacks
                if (r0 == 0) goto Le
                java.util.Set<androidx.emoji2.text.EmojiCompat$InitCallback> r0 = r1.mInitCallbacks
                r0.remove(r2)
            Le:
                return r1
        }
    }

    public static class DefaultSpanFactory implements androidx.emoji2.text.EmojiCompat.SpanFactory {
        public DefaultSpanFactory() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.emoji2.text.EmojiCompat.SpanFactory
        public androidx.emoji2.text.EmojiSpan createSpan(androidx.emoji2.text.TypefaceEmojiRasterizer r2) {
                r1 = this;
                androidx.emoji2.text.TypefaceEmojiSpan r0 = new androidx.emoji2.text.TypefaceEmojiSpan
                r0.<init>(r2)
                return r0
        }
    }

    public interface GlyphChecker {
        boolean hasGlyph(java.lang.CharSequence r1, int r2, int r3, int r4);
    }

    public static abstract class InitCallback {
        public InitCallback() {
                r0 = this;
                r0.<init>()
                return
        }

        public void onFailed(java.lang.Throwable r1) {
                r0 = this;
                return
        }

        public void onInitialized() {
                r0 = this;
                return
        }
    }

    private static class ListenerDispatcher implements java.lang.Runnable {
        private final java.util.List<androidx.emoji2.text.EmojiCompat.InitCallback> mInitCallbacks;
        private final int mLoadState;
        private final java.lang.Throwable mThrowable;

        ListenerDispatcher(androidx.emoji2.text.EmojiCompat.InitCallback r4, int r5) {
                r3 = this;
                r0 = 1
                androidx.emoji2.text.EmojiCompat$InitCallback[] r0 = new androidx.emoji2.text.EmojiCompat.InitCallback[r0]
                java.lang.String r1 = "initCallback cannot be null"
                java.lang.Object r1 = androidx.core.util.Preconditions.checkNotNull(r4, r1)
                androidx.emoji2.text.EmojiCompat$InitCallback r1 = (androidx.emoji2.text.EmojiCompat.InitCallback) r1
                r2 = 0
                r0[r2] = r1
                java.util.List r0 = java.util.Arrays.asList(r0)
                r1 = 0
                r3.<init>(r0, r5, r1)
                return
        }

        ListenerDispatcher(java.util.Collection<androidx.emoji2.text.EmojiCompat.InitCallback> r2, int r3) {
                r1 = this;
                r0 = 0
                r1.<init>(r2, r3, r0)
                return
        }

        ListenerDispatcher(java.util.Collection<androidx.emoji2.text.EmojiCompat.InitCallback> r2, int r3, java.lang.Throwable r4) {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = "initCallbacks cannot be null"
                androidx.core.util.Preconditions.checkNotNull(r2, r0)
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>(r2)
                r1.mInitCallbacks = r0
                r1.mLoadState = r3
                r1.mThrowable = r4
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r4 = this;
                java.util.List<androidx.emoji2.text.EmojiCompat$InitCallback> r0 = r4.mInitCallbacks
                int r0 = r0.size()
                int r1 = r4.mLoadState
                switch(r1) {
                    case 1: goto Ld;
                    default: goto Lb;
                }
            Lb:
                r1 = 0
                goto L1f
            Ld:
                r1 = 0
            Le:
                if (r1 >= r0) goto L1e
                java.util.List<androidx.emoji2.text.EmojiCompat$InitCallback> r2 = r4.mInitCallbacks
                java.lang.Object r2 = r2.get(r1)
                androidx.emoji2.text.EmojiCompat$InitCallback r2 = (androidx.emoji2.text.EmojiCompat.InitCallback) r2
                r2.onInitialized()
                int r1 = r1 + 1
                goto Le
            L1e:
                goto L31
            L1f:
                if (r1 >= r0) goto L31
                java.util.List<androidx.emoji2.text.EmojiCompat$InitCallback> r2 = r4.mInitCallbacks
                java.lang.Object r2 = r2.get(r1)
                androidx.emoji2.text.EmojiCompat$InitCallback r2 = (androidx.emoji2.text.EmojiCompat.InitCallback) r2
                java.lang.Throwable r3 = r4.mThrowable
                r2.onFailed(r3)
                int r1 = r1 + 1
                goto L1f
            L31:
                return
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface LoadStrategy {
    }

    public interface MetadataRepoLoader {
        void load(androidx.emoji2.text.EmojiCompat.MetadataRepoLoaderCallback r1);
    }

    public static abstract class MetadataRepoLoaderCallback {
        public MetadataRepoLoaderCallback() {
                r0 = this;
                r0.<init>()
                return
        }

        public abstract void onFailed(java.lang.Throwable r1);

        public abstract void onLoaded(androidx.emoji2.text.MetadataRepo r1);
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface ReplaceStrategy {
    }

    public interface SpanFactory {
        androidx.emoji2.text.EmojiSpan createSpan(androidx.emoji2.text.TypefaceEmojiRasterizer r1);
    }

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            androidx.emoji2.text.EmojiCompat.INSTANCE_LOCK = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            androidx.emoji2.text.EmojiCompat.CONFIG_LOCK = r0
            return
    }

    private EmojiCompat(androidx.emoji2.text.EmojiCompat.Config r4) {
            r3 = this;
            r3.<init>()
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = new java.util.concurrent.locks.ReentrantReadWriteLock
            r0.<init>()
            r3.mInitLock = r0
            r0 = 3
            r3.mLoadState = r0
            boolean r0 = r4.mReplaceAll
            r3.mReplaceAll = r0
            boolean r0 = r4.mUseEmojiAsDefaultStyle
            r3.mUseEmojiAsDefaultStyle = r0
            int[] r0 = r4.mEmojiAsDefaultStyleExceptions
            r3.mEmojiAsDefaultStyleExceptions = r0
            boolean r0 = r4.mEmojiSpanIndicatorEnabled
            r3.mEmojiSpanIndicatorEnabled = r0
            int r0 = r4.mEmojiSpanIndicatorColor
            r3.mEmojiSpanIndicatorColor = r0
            androidx.emoji2.text.EmojiCompat$MetadataRepoLoader r0 = r4.mMetadataLoader
            r3.mMetadataLoader = r0
            int r0 = r4.mMetadataLoadStrategy
            r3.mMetadataLoadStrategy = r0
            androidx.emoji2.text.EmojiCompat$GlyphChecker r0 = r4.mGlyphChecker
            r3.mGlyphChecker = r0
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            r3.mMainHandler = r0
            androidx.collection.ArraySet r0 = new androidx.collection.ArraySet
            r0.<init>()
            r3.mInitCallbacks = r0
            androidx.emoji2.text.EmojiCompat$SpanFactory r0 = r4.mSpanFactory
            if (r0 == 0) goto L45
            r1 = r0
            goto L4a
        L45:
            androidx.emoji2.text.EmojiCompat$DefaultSpanFactory r1 = new androidx.emoji2.text.EmojiCompat$DefaultSpanFactory
            r1.<init>()
        L4a:
            r3.mSpanFactory = r1
            java.util.Set<androidx.emoji2.text.EmojiCompat$InitCallback> r1 = r4.mInitCallbacks
            if (r1 == 0) goto L5f
            java.util.Set<androidx.emoji2.text.EmojiCompat$InitCallback> r1 = r4.mInitCallbacks
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L5f
            java.util.Set<androidx.emoji2.text.EmojiCompat$InitCallback> r1 = r3.mInitCallbacks
            java.util.Set<androidx.emoji2.text.EmojiCompat$InitCallback> r2 = r4.mInitCallbacks
            r1.addAll(r2)
        L5f:
            androidx.emoji2.text.EmojiCompat$CompatInternal19 r1 = new androidx.emoji2.text.EmojiCompat$CompatInternal19
            r1.<init>(r3)
            r3.mHelper = r1
            r3.loadMetadata()
            return
    }

    static /* synthetic */ androidx.emoji2.text.EmojiCompat.SpanFactory access$000(androidx.emoji2.text.EmojiCompat r1) {
            androidx.emoji2.text.EmojiCompat$SpanFactory r0 = r1.mSpanFactory
            return r0
    }

    static /* synthetic */ androidx.emoji2.text.EmojiCompat.GlyphChecker access$100(androidx.emoji2.text.EmojiCompat r1) {
            androidx.emoji2.text.EmojiCompat$GlyphChecker r0 = r1.mGlyphChecker
            return r0
    }

    public static androidx.emoji2.text.EmojiCompat get() {
            java.lang.Object r0 = androidx.emoji2.text.EmojiCompat.INSTANCE_LOCK
            monitor-enter(r0)
            androidx.emoji2.text.EmojiCompat r1 = androidx.emoji2.text.EmojiCompat.sInstance     // Catch: java.lang.Throwable -> L11
            if (r1 == 0) goto L9
            r2 = 1
            goto La
        L9:
            r2 = 0
        La:
            java.lang.String r3 = "EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message."
            androidx.core.util.Preconditions.checkState(r2, r3)     // Catch: java.lang.Throwable -> L11
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            return r1
        L11:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            throw r1
    }

    public static boolean handleDeleteSurroundingText(android.view.inputmethod.InputConnection r1, android.text.Editable r2, int r3, int r4, boolean r5) {
            boolean r0 = androidx.emoji2.text.EmojiProcessor.handleDeleteSurroundingText(r1, r2, r3, r4, r5)
            return r0
    }

    public static boolean handleOnKeyDown(android.text.Editable r1, int r2, android.view.KeyEvent r3) {
            boolean r0 = androidx.emoji2.text.EmojiProcessor.handleOnKeyDown(r1, r2, r3)
            return r0
    }

    public static androidx.emoji2.text.EmojiCompat init(android.content.Context r1) {
            r0 = 0
            androidx.emoji2.text.EmojiCompat r0 = init(r1, r0)
            return r0
    }

    public static androidx.emoji2.text.EmojiCompat init(android.content.Context r3, androidx.emoji2.text.DefaultEmojiCompatConfig.DefaultEmojiCompatConfigFactory r4) {
            boolean r0 = androidx.emoji2.text.EmojiCompat.sHasDoneDefaultConfigLookup
            if (r0 == 0) goto L7
            androidx.emoji2.text.EmojiCompat r0 = androidx.emoji2.text.EmojiCompat.sInstance
            return r0
        L7:
            if (r4 == 0) goto Lb
            r0 = r4
            goto L11
        Lb:
            androidx.emoji2.text.DefaultEmojiCompatConfig$DefaultEmojiCompatConfigFactory r0 = new androidx.emoji2.text.DefaultEmojiCompatConfig$DefaultEmojiCompatConfigFactory
            r1 = 0
            r0.<init>(r1)
        L11:
            androidx.emoji2.text.EmojiCompat$Config r0 = r0.create(r3)
            java.lang.Object r1 = androidx.emoji2.text.EmojiCompat.CONFIG_LOCK
            monitor-enter(r1)
            boolean r2 = androidx.emoji2.text.EmojiCompat.sHasDoneDefaultConfigLookup     // Catch: java.lang.Throwable -> L29
            if (r2 != 0) goto L25
            if (r0 == 0) goto L22
            init(r0)     // Catch: java.lang.Throwable -> L29
        L22:
            r2 = 1
            androidx.emoji2.text.EmojiCompat.sHasDoneDefaultConfigLookup = r2     // Catch: java.lang.Throwable -> L29
        L25:
            androidx.emoji2.text.EmojiCompat r2 = androidx.emoji2.text.EmojiCompat.sInstance     // Catch: java.lang.Throwable -> L29
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L29
            return r2
        L29:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L29
            throw r2
    }

    public static androidx.emoji2.text.EmojiCompat init(androidx.emoji2.text.EmojiCompat.Config r3) {
            androidx.emoji2.text.EmojiCompat r0 = androidx.emoji2.text.EmojiCompat.sInstance
            if (r0 != 0) goto L19
            java.lang.Object r1 = androidx.emoji2.text.EmojiCompat.INSTANCE_LOCK
            monitor-enter(r1)
            androidx.emoji2.text.EmojiCompat r2 = androidx.emoji2.text.EmojiCompat.sInstance     // Catch: java.lang.Throwable -> L16
            r0 = r2
            if (r0 != 0) goto L14
            androidx.emoji2.text.EmojiCompat r2 = new androidx.emoji2.text.EmojiCompat     // Catch: java.lang.Throwable -> L16
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L16
            r0 = r2
            androidx.emoji2.text.EmojiCompat.sInstance = r0     // Catch: java.lang.Throwable -> L16
        L14:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L16
            goto L19
        L16:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L16
            throw r2
        L19:
            return r0
    }

    public static boolean isConfigured() {
            androidx.emoji2.text.EmojiCompat r0 = androidx.emoji2.text.EmojiCompat.sInstance
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    private boolean isInitialized() {
            r2 = this;
            int r0 = r2.getLoadState()
            r1 = 1
            if (r0 != r1) goto L8
            goto L9
        L8:
            r1 = 0
        L9:
            return r1
    }

    private void loadMetadata() {
            r2 = this;
            java.util.concurrent.locks.ReadWriteLock r0 = r2.mInitLock
            java.util.concurrent.locks.Lock r0 = r0.writeLock()
            r0.lock()
            int r0 = r2.mMetadataLoadStrategy     // Catch: java.lang.Throwable -> L26
            if (r0 != 0) goto L10
            r0 = 0
            r2.mLoadState = r0     // Catch: java.lang.Throwable -> L26
        L10:
            java.util.concurrent.locks.ReadWriteLock r0 = r2.mInitLock
            java.util.concurrent.locks.Lock r0 = r0.writeLock()
            r0.unlock()
            int r0 = r2.getLoadState()
            if (r0 != 0) goto L25
            androidx.emoji2.text.EmojiCompat$CompatInternal r0 = r2.mHelper
            r0.loadMetadata()
        L25:
            return
        L26:
            r0 = move-exception
            java.util.concurrent.locks.ReadWriteLock r1 = r2.mInitLock
            java.util.concurrent.locks.Lock r1 = r1.writeLock()
            r1.unlock()
            throw r0
    }

    public static androidx.emoji2.text.EmojiCompat reset(androidx.emoji2.text.EmojiCompat.Config r2) {
            java.lang.Object r0 = androidx.emoji2.text.EmojiCompat.INSTANCE_LOCK
            monitor-enter(r0)
            androidx.emoji2.text.EmojiCompat r1 = new androidx.emoji2.text.EmojiCompat     // Catch: java.lang.Throwable -> Lc
            r1.<init>(r2)     // Catch: java.lang.Throwable -> Lc
            androidx.emoji2.text.EmojiCompat.sInstance = r1     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            return r1
        Lc:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            throw r1
    }

    public static androidx.emoji2.text.EmojiCompat reset(androidx.emoji2.text.EmojiCompat r2) {
            java.lang.Object r0 = androidx.emoji2.text.EmojiCompat.INSTANCE_LOCK
            monitor-enter(r0)
            androidx.emoji2.text.EmojiCompat.sInstance = r2     // Catch: java.lang.Throwable -> L9
            androidx.emoji2.text.EmojiCompat r1 = androidx.emoji2.text.EmojiCompat.sInstance     // Catch: java.lang.Throwable -> L9
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            return r1
        L9:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            throw r1
    }

    public static void skipDefaultConfigurationLookup(boolean r2) {
            java.lang.Object r0 = androidx.emoji2.text.EmojiCompat.CONFIG_LOCK
            monitor-enter(r0)
            androidx.emoji2.text.EmojiCompat.sHasDoneDefaultConfigLookup = r2     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            return
        L7:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r1
    }

    public java.lang.String getAssetSignature() {
            r2 = this;
            boolean r0 = r2.isInitialized()
            java.lang.String r1 = "Not initialized yet"
            androidx.core.util.Preconditions.checkState(r0, r1)
            androidx.emoji2.text.EmojiCompat$CompatInternal r0 = r2.mHelper
            java.lang.String r0 = r0.getAssetSignature()
            return r0
    }

    public int getEmojiEnd(java.lang.CharSequence r2, int r3) {
            r1 = this;
            androidx.emoji2.text.EmojiCompat$CompatInternal r0 = r1.mHelper
            int r0 = r0.getEmojiEnd(r2, r3)
            return r0
    }

    public int getEmojiMatch(java.lang.CharSequence r3, int r4) {
            r2 = this;
            boolean r0 = r2.isInitialized()
            java.lang.String r1 = "Not initialized yet"
            androidx.core.util.Preconditions.checkState(r0, r1)
            java.lang.String r0 = "sequence cannot be null"
            androidx.core.util.Preconditions.checkNotNull(r3, r0)
            androidx.emoji2.text.EmojiCompat$CompatInternal r0 = r2.mHelper
            int r0 = r0.getEmojiMatch(r3, r4)
            return r0
    }

    public int getEmojiSpanIndicatorColor() {
            r1 = this;
            int r0 = r1.mEmojiSpanIndicatorColor
            return r0
    }

    public int getEmojiStart(java.lang.CharSequence r2, int r3) {
            r1 = this;
            androidx.emoji2.text.EmojiCompat$CompatInternal r0 = r1.mHelper
            int r0 = r0.getEmojiStart(r2, r3)
            return r0
    }

    public int getLoadState() {
            r2 = this;
            java.util.concurrent.locks.ReadWriteLock r0 = r2.mInitLock
            java.util.concurrent.locks.Lock r0 = r0.readLock()
            r0.lock()
            int r0 = r2.mLoadState     // Catch: java.lang.Throwable -> L15
            java.util.concurrent.locks.ReadWriteLock r1 = r2.mInitLock
            java.util.concurrent.locks.Lock r1 = r1.readLock()
            r1.unlock()
            return r0
        L15:
            r0 = move-exception
            java.util.concurrent.locks.ReadWriteLock r1 = r2.mInitLock
            java.util.concurrent.locks.Lock r1 = r1.readLock()
            r1.unlock()
            throw r0
    }

    @java.lang.Deprecated
    public boolean hasEmojiGlyph(java.lang.CharSequence r3) {
            r2 = this;
            boolean r0 = r2.isInitialized()
            java.lang.String r1 = "Not initialized yet"
            androidx.core.util.Preconditions.checkState(r0, r1)
            java.lang.String r0 = "sequence cannot be null"
            androidx.core.util.Preconditions.checkNotNull(r3, r0)
            androidx.emoji2.text.EmojiCompat$CompatInternal r0 = r2.mHelper
            boolean r0 = r0.hasEmojiGlyph(r3)
            return r0
    }

    @java.lang.Deprecated
    public boolean hasEmojiGlyph(java.lang.CharSequence r3, int r4) {
            r2 = this;
            boolean r0 = r2.isInitialized()
            java.lang.String r1 = "Not initialized yet"
            androidx.core.util.Preconditions.checkState(r0, r1)
            java.lang.String r0 = "sequence cannot be null"
            androidx.core.util.Preconditions.checkNotNull(r3, r0)
            androidx.emoji2.text.EmojiCompat$CompatInternal r0 = r2.mHelper
            boolean r0 = r0.hasEmojiGlyph(r3, r4)
            return r0
    }

    public boolean isEmojiSpanIndicatorEnabled() {
            r1 = this;
            boolean r0 = r1.mEmojiSpanIndicatorEnabled
            return r0
    }

    public void load() {
            r3 = this;
            int r0 = r3.mMetadataLoadStrategy
            r1 = 0
            r2 = 1
            if (r0 != r2) goto L7
            goto L8
        L7:
            r2 = r1
        L8:
            java.lang.String r0 = "Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading"
            androidx.core.util.Preconditions.checkState(r2, r0)
            boolean r0 = r3.isInitialized()
            if (r0 == 0) goto L14
            return
        L14:
            java.util.concurrent.locks.ReadWriteLock r0 = r3.mInitLock
            java.util.concurrent.locks.Lock r0 = r0.writeLock()
            r0.lock()
            int r0 = r3.mLoadState     // Catch: java.lang.Throwable -> L3d
            if (r0 != 0) goto L2b
            java.util.concurrent.locks.ReadWriteLock r0 = r3.mInitLock
            java.util.concurrent.locks.Lock r0 = r0.writeLock()
            r0.unlock()
            return
        L2b:
            r3.mLoadState = r1     // Catch: java.lang.Throwable -> L3d
            java.util.concurrent.locks.ReadWriteLock r0 = r3.mInitLock
            java.util.concurrent.locks.Lock r0 = r0.writeLock()
            r0.unlock()
            androidx.emoji2.text.EmojiCompat$CompatInternal r0 = r3.mHelper
            r0.loadMetadata()
            return
        L3d:
            r0 = move-exception
            java.util.concurrent.locks.ReadWriteLock r1 = r3.mInitLock
            java.util.concurrent.locks.Lock r1 = r1.writeLock()
            r1.unlock()
            throw r0
    }

    void onMetadataLoadFailed(java.lang.Throwable r5) {
            r4 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.concurrent.locks.ReadWriteLock r1 = r4.mInitLock
            java.util.concurrent.locks.Lock r1 = r1.writeLock()
            r1.lock()
            r1 = 2
            r4.mLoadState = r1     // Catch: java.lang.Throwable -> L32
            java.util.Set<androidx.emoji2.text.EmojiCompat$InitCallback> r1 = r4.mInitCallbacks     // Catch: java.lang.Throwable -> L32
            r0.addAll(r1)     // Catch: java.lang.Throwable -> L32
            java.util.Set<androidx.emoji2.text.EmojiCompat$InitCallback> r1 = r4.mInitCallbacks     // Catch: java.lang.Throwable -> L32
            r1.clear()     // Catch: java.lang.Throwable -> L32
            java.util.concurrent.locks.ReadWriteLock r1 = r4.mInitLock
            java.util.concurrent.locks.Lock r1 = r1.writeLock()
            r1.unlock()
            android.os.Handler r1 = r4.mMainHandler
            androidx.emoji2.text.EmojiCompat$ListenerDispatcher r2 = new androidx.emoji2.text.EmojiCompat$ListenerDispatcher
            int r3 = r4.mLoadState
            r2.<init>(r0, r3, r5)
            r1.post(r2)
            return
        L32:
            r1 = move-exception
            java.util.concurrent.locks.ReadWriteLock r2 = r4.mInitLock
            java.util.concurrent.locks.Lock r2 = r2.writeLock()
            r2.unlock()
            throw r1
    }

    void onMetadataLoadSuccess() {
            r4 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.concurrent.locks.ReadWriteLock r1 = r4.mInitLock
            java.util.concurrent.locks.Lock r1 = r1.writeLock()
            r1.lock()
            r1 = 1
            r4.mLoadState = r1     // Catch: java.lang.Throwable -> L32
            java.util.Set<androidx.emoji2.text.EmojiCompat$InitCallback> r1 = r4.mInitCallbacks     // Catch: java.lang.Throwable -> L32
            r0.addAll(r1)     // Catch: java.lang.Throwable -> L32
            java.util.Set<androidx.emoji2.text.EmojiCompat$InitCallback> r1 = r4.mInitCallbacks     // Catch: java.lang.Throwable -> L32
            r1.clear()     // Catch: java.lang.Throwable -> L32
            java.util.concurrent.locks.ReadWriteLock r1 = r4.mInitLock
            java.util.concurrent.locks.Lock r1 = r1.writeLock()
            r1.unlock()
            android.os.Handler r1 = r4.mMainHandler
            androidx.emoji2.text.EmojiCompat$ListenerDispatcher r2 = new androidx.emoji2.text.EmojiCompat$ListenerDispatcher
            int r3 = r4.mLoadState
            r2.<init>(r0, r3)
            r1.post(r2)
            return
        L32:
            r1 = move-exception
            java.util.concurrent.locks.ReadWriteLock r2 = r4.mInitLock
            java.util.concurrent.locks.Lock r2 = r2.writeLock()
            r2.unlock()
            throw r1
    }

    public java.lang.CharSequence process(java.lang.CharSequence r3) {
            r2 = this;
            r0 = 0
            if (r3 != 0) goto L5
            r1 = r0
            goto L9
        L5:
            int r1 = r3.length()
        L9:
            java.lang.CharSequence r0 = r2.process(r3, r0, r1)
            return r0
    }

    public java.lang.CharSequence process(java.lang.CharSequence r2, int r3, int r4) {
            r1 = this;
            r0 = 2147483647(0x7fffffff, float:NaN)
            java.lang.CharSequence r0 = r1.process(r2, r3, r4, r0)
            return r0
    }

    public java.lang.CharSequence process(java.lang.CharSequence r7, int r8, int r9, int r10) {
            r6 = this;
            r5 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            java.lang.CharSequence r7 = r0.process(r1, r2, r3, r4, r5)
            return r7
    }

    public java.lang.CharSequence process(java.lang.CharSequence r8, int r9, int r10, int r11, int r12) {
            r7 = this;
            boolean r0 = r7.isInitialized()
            java.lang.String r1 = "Not initialized yet"
            androidx.core.util.Preconditions.checkState(r0, r1)
            java.lang.String r0 = "start cannot be negative"
            androidx.core.util.Preconditions.checkArgumentNonnegative(r9, r0)
            java.lang.String r0 = "end cannot be negative"
            androidx.core.util.Preconditions.checkArgumentNonnegative(r10, r0)
            java.lang.String r0 = "maxEmojiCount cannot be negative"
            androidx.core.util.Preconditions.checkArgumentNonnegative(r11, r0)
            r0 = 1
            r1 = 0
            if (r9 > r10) goto L1e
            r2 = r0
            goto L1f
        L1e:
            r2 = r1
        L1f:
            java.lang.String r3 = "start should be <= than end"
            androidx.core.util.Preconditions.checkArgument(r2, r3)
            if (r8 != 0) goto L28
            r0 = 0
            return r0
        L28:
            int r2 = r8.length()
            if (r9 > r2) goto L30
            r2 = r0
            goto L31
        L30:
            r2 = r1
        L31:
            java.lang.String r3 = "start should be < than charSequence length"
            androidx.core.util.Preconditions.checkArgument(r2, r3)
            int r2 = r8.length()
            if (r10 > r2) goto L3d
            goto L3e
        L3d:
            r0 = r1
        L3e:
            java.lang.String r1 = "end should be < than charSequence length"
            androidx.core.util.Preconditions.checkArgument(r0, r1)
            int r0 = r8.length()
            if (r0 == 0) goto L67
            if (r9 != r10) goto L50
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            goto L6b
        L50:
            switch(r12) {
                case 1: goto L5a;
                case 2: goto L57;
                default: goto L53;
            }
        L53:
            boolean r0 = r7.mReplaceAll
            r6 = r0
            goto L5c
        L57:
            r0 = 0
            r6 = r0
            goto L5c
        L5a:
            r0 = 1
            r6 = r0
        L5c:
            androidx.emoji2.text.EmojiCompat$CompatInternal r1 = r7.mHelper
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            java.lang.CharSequence r8 = r1.process(r2, r3, r4, r5, r6)
            return r8
        L67:
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
        L6b:
            return r2
    }

    public void registerInitCallback(androidx.emoji2.text.EmojiCompat.InitCallback r4) {
            r3 = this;
            java.lang.String r0 = "initCallback cannot be null"
            androidx.core.util.Preconditions.checkNotNull(r4, r0)
            java.util.concurrent.locks.ReadWriteLock r0 = r3.mInitLock
            java.util.concurrent.locks.Lock r0 = r0.writeLock()
            r0.lock()
            int r0 = r3.mLoadState     // Catch: java.lang.Throwable -> L36
            r1 = 1
            if (r0 == r1) goto L1f
            int r0 = r3.mLoadState     // Catch: java.lang.Throwable -> L36
            r1 = 2
            if (r0 != r1) goto L19
            goto L1f
        L19:
            java.util.Set<androidx.emoji2.text.EmojiCompat$InitCallback> r0 = r3.mInitCallbacks     // Catch: java.lang.Throwable -> L36
            r0.add(r4)     // Catch: java.lang.Throwable -> L36
            goto L2b
        L1f:
            android.os.Handler r0 = r3.mMainHandler     // Catch: java.lang.Throwable -> L36
            androidx.emoji2.text.EmojiCompat$ListenerDispatcher r1 = new androidx.emoji2.text.EmojiCompat$ListenerDispatcher     // Catch: java.lang.Throwable -> L36
            int r2 = r3.mLoadState     // Catch: java.lang.Throwable -> L36
            r1.<init>(r4, r2)     // Catch: java.lang.Throwable -> L36
            r0.post(r1)     // Catch: java.lang.Throwable -> L36
        L2b:
            java.util.concurrent.locks.ReadWriteLock r0 = r3.mInitLock
            java.util.concurrent.locks.Lock r0 = r0.writeLock()
            r0.unlock()
            return
        L36:
            r0 = move-exception
            java.util.concurrent.locks.ReadWriteLock r1 = r3.mInitLock
            java.util.concurrent.locks.Lock r1 = r1.writeLock()
            r1.unlock()
            throw r0
    }

    public void unregisterInitCallback(androidx.emoji2.text.EmojiCompat.InitCallback r3) {
            r2 = this;
            java.lang.String r0 = "initCallback cannot be null"
            androidx.core.util.Preconditions.checkNotNull(r3, r0)
            java.util.concurrent.locks.ReadWriteLock r0 = r2.mInitLock
            java.util.concurrent.locks.Lock r0 = r0.writeLock()
            r0.lock()
            java.util.Set<androidx.emoji2.text.EmojiCompat$InitCallback> r0 = r2.mInitCallbacks     // Catch: java.lang.Throwable -> L1e
            r0.remove(r3)     // Catch: java.lang.Throwable -> L1e
            java.util.concurrent.locks.ReadWriteLock r0 = r2.mInitLock
            java.util.concurrent.locks.Lock r0 = r0.writeLock()
            r0.unlock()
            return
        L1e:
            r0 = move-exception
            java.util.concurrent.locks.ReadWriteLock r1 = r2.mInitLock
            java.util.concurrent.locks.Lock r1 = r1.writeLock()
            r1.unlock()
            throw r0
    }

    public void updateEditorInfo(android.view.inputmethod.EditorInfo r2) {
            r1 = this;
            boolean r0 = r1.isInitialized()
            if (r0 == 0) goto L1a
            if (r2 != 0) goto L9
            goto L1a
        L9:
            android.os.Bundle r0 = r2.extras
            if (r0 != 0) goto L14
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            r2.extras = r0
        L14:
            androidx.emoji2.text.EmojiCompat$CompatInternal r0 = r1.mHelper
            r0.updateEditorInfoAttrs(r2)
            return
        L1a:
            return
    }
}
