package androidx.emoji2.text;

/* JADX INFO: loaded from: classes.dex */
public final class DefaultEmojiCompatConfig {

    public static class DefaultEmojiCompatConfigFactory {
        private static final java.lang.String DEFAULT_EMOJI_QUERY = "emojicompat-emoji-font";
        private static final java.lang.String INTENT_LOAD_EMOJI_FONT = "androidx.content.action.LOAD_EMOJI_FONT";
        private static final java.lang.String TAG = "emoji2.text.DefaultEmojiConfig";
        private final androidx.emoji2.text.DefaultEmojiCompatConfig.DefaultEmojiCompatConfigHelper mHelper;

        public DefaultEmojiCompatConfigFactory(androidx.emoji2.text.DefaultEmojiCompatConfig.DefaultEmojiCompatConfigHelper r2) {
                r1 = this;
                r1.<init>()
                if (r2 == 0) goto L7
                r0 = r2
                goto Lb
            L7:
                androidx.emoji2.text.DefaultEmojiCompatConfig$DefaultEmojiCompatConfigHelper r0 = getHelperForApi()
            Lb:
                r1.mHelper = r0
                return
        }

        private androidx.emoji2.text.EmojiCompat.Config configOrNull(android.content.Context r2, androidx.core.provider.FontRequest r3) {
                r1 = this;
                if (r3 != 0) goto L4
                r0 = 0
                return r0
            L4:
                androidx.emoji2.text.FontRequestEmojiCompatConfig r0 = new androidx.emoji2.text.FontRequestEmojiCompatConfig
                r0.<init>(r2, r3)
                return r0
        }

        private java.util.List<java.util.List<byte[]>> convertToByteArray(android.content.pm.Signature[] r6) {
                r5 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                int r1 = r6.length
                r2 = 0
            L7:
                if (r2 >= r1) goto L15
                r3 = r6[r2]
                byte[] r4 = r3.toByteArray()
                r0.add(r4)
                int r2 = r2 + 1
                goto L7
            L15:
                java.util.List r1 = java.util.Collections.singletonList(r0)
                return r1
        }

        private androidx.core.provider.FontRequest generateFontRequestFrom(android.content.pm.ProviderInfo r7, android.content.pm.PackageManager r8) throws android.content.pm.PackageManager.NameNotFoundException {
                r6 = this;
                java.lang.String r0 = r7.authority
                java.lang.String r1 = r7.packageName
                androidx.emoji2.text.DefaultEmojiCompatConfig$DefaultEmojiCompatConfigHelper r2 = r6.mHelper
                android.content.pm.Signature[] r2 = r2.getSigningSignatures(r8, r1)
                java.util.List r3 = r6.convertToByteArray(r2)
                androidx.core.provider.FontRequest r4 = new androidx.core.provider.FontRequest
                java.lang.String r5 = "emojicompat-emoji-font"
                r4.<init>(r0, r1, r5, r3)
                return r4
        }

        private static androidx.emoji2.text.DefaultEmojiCompatConfig.DefaultEmojiCompatConfigHelper getHelperForApi() {
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 28
                if (r0 < r1) goto Lc
                androidx.emoji2.text.DefaultEmojiCompatConfig$DefaultEmojiCompatConfigHelper_API28 r0 = new androidx.emoji2.text.DefaultEmojiCompatConfig$DefaultEmojiCompatConfigHelper_API28
                r0.<init>()
                return r0
            Lc:
                androidx.emoji2.text.DefaultEmojiCompatConfig$DefaultEmojiCompatConfigHelper_API19 r0 = new androidx.emoji2.text.DefaultEmojiCompatConfig$DefaultEmojiCompatConfigHelper_API19
                r0.<init>()
                return r0
        }

        private boolean hasFlagSystem(android.content.pm.ProviderInfo r3) {
                r2 = this;
                if (r3 == 0) goto Lf
                android.content.pm.ApplicationInfo r0 = r3.applicationInfo
                if (r0 == 0) goto Lf
                android.content.pm.ApplicationInfo r0 = r3.applicationInfo
                int r0 = r0.flags
                r1 = 1
                r0 = r0 & r1
                if (r0 != r1) goto Lf
                goto L10
            Lf:
                r1 = 0
            L10:
                return r1
        }

        private android.content.pm.ProviderInfo queryDefaultInstalledContentProvider(android.content.pm.PackageManager r6) {
                r5 = this;
                androidx.emoji2.text.DefaultEmojiCompatConfig$DefaultEmojiCompatConfigHelper r0 = r5.mHelper
                android.content.Intent r1 = new android.content.Intent
                java.lang.String r2 = "androidx.content.action.LOAD_EMOJI_FONT"
                r1.<init>(r2)
                r2 = 0
                java.util.List r0 = r0.queryIntentContentProviders(r6, r1, r2)
                java.util.Iterator r1 = r0.iterator()
            L12:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L2c
                java.lang.Object r2 = r1.next()
                android.content.pm.ResolveInfo r2 = (android.content.pm.ResolveInfo) r2
                androidx.emoji2.text.DefaultEmojiCompatConfig$DefaultEmojiCompatConfigHelper r3 = r5.mHelper
                android.content.pm.ProviderInfo r3 = r3.getProviderInfo(r2)
                boolean r4 = r5.hasFlagSystem(r3)
                if (r4 == 0) goto L2b
                return r3
            L2b:
                goto L12
            L2c:
                r1 = 0
                return r1
        }

        public androidx.emoji2.text.EmojiCompat.Config create(android.content.Context r2) {
                r1 = this;
                androidx.core.provider.FontRequest r0 = r1.queryForDefaultFontRequest(r2)
                androidx.emoji2.text.EmojiCompat$Config r0 = r1.configOrNull(r2, r0)
                return r0
        }

        androidx.core.provider.FontRequest queryForDefaultFontRequest(android.content.Context r6) {
                r5 = this;
                android.content.pm.PackageManager r0 = r6.getPackageManager()
                java.lang.String r1 = "Package manager required to locate emoji font provider"
                androidx.core.util.Preconditions.checkNotNull(r0, r1)
                android.content.pm.ProviderInfo r1 = r5.queryDefaultInstalledContentProvider(r0)
                r2 = 0
                if (r1 != 0) goto L11
                return r2
            L11:
                androidx.core.provider.FontRequest r2 = r5.generateFontRequestFrom(r1, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L16
                return r2
            L16:
                r3 = move-exception
                java.lang.String r4 = "emoji2.text.DefaultEmojiConfig"
                android.util.Log.wtf(r4, r3)
                return r2
        }
    }

    public static class DefaultEmojiCompatConfigHelper {
        public DefaultEmojiCompatConfigHelper() {
                r0 = this;
                r0.<init>()
                return
        }

        public android.content.pm.ProviderInfo getProviderInfo(android.content.pm.ResolveInfo r3) {
                r2 = this;
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "Unable to get provider info prior to API 19"
                r0.<init>(r1)
                throw r0
        }

        public android.content.pm.Signature[] getSigningSignatures(android.content.pm.PackageManager r3, java.lang.String r4) throws android.content.pm.PackageManager.NameNotFoundException {
                r2 = this;
                r0 = 64
                android.content.pm.PackageInfo r0 = r3.getPackageInfo(r4, r0)
                android.content.pm.Signature[] r1 = r0.signatures
                return r1
        }

        public java.util.List<android.content.pm.ResolveInfo> queryIntentContentProviders(android.content.pm.PackageManager r2, android.content.Intent r3, int r4) {
                r1 = this;
                java.util.List r0 = java.util.Collections.emptyList()
                return r0
        }
    }

    public static class DefaultEmojiCompatConfigHelper_API19 extends androidx.emoji2.text.DefaultEmojiCompatConfig.DefaultEmojiCompatConfigHelper {
        public DefaultEmojiCompatConfigHelper_API19() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.emoji2.text.DefaultEmojiCompatConfig.DefaultEmojiCompatConfigHelper
        public android.content.pm.ProviderInfo getProviderInfo(android.content.pm.ResolveInfo r2) {
                r1 = this;
                android.content.pm.ProviderInfo r0 = r2.providerInfo
                return r0
        }

        @Override // androidx.emoji2.text.DefaultEmojiCompatConfig.DefaultEmojiCompatConfigHelper
        public java.util.List<android.content.pm.ResolveInfo> queryIntentContentProviders(android.content.pm.PackageManager r2, android.content.Intent r3, int r4) {
                r1 = this;
                java.util.List r0 = r2.queryIntentContentProviders(r3, r4)
                return r0
        }
    }

    public static class DefaultEmojiCompatConfigHelper_API28 extends androidx.emoji2.text.DefaultEmojiCompatConfig.DefaultEmojiCompatConfigHelper_API19 {
        public DefaultEmojiCompatConfigHelper_API28() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.emoji2.text.DefaultEmojiCompatConfig.DefaultEmojiCompatConfigHelper
        public android.content.pm.Signature[] getSigningSignatures(android.content.pm.PackageManager r3, java.lang.String r4) throws android.content.pm.PackageManager.NameNotFoundException {
                r2 = this;
                r0 = 64
                android.content.pm.PackageInfo r0 = r3.getPackageInfo(r4, r0)
                android.content.pm.Signature[] r1 = r0.signatures
                return r1
        }
    }

    private DefaultEmojiCompatConfig() {
            r0 = this;
            r0.<init>()
            return
    }

    public static androidx.emoji2.text.FontRequestEmojiCompatConfig create(android.content.Context r2) {
            androidx.emoji2.text.DefaultEmojiCompatConfig$DefaultEmojiCompatConfigFactory r0 = new androidx.emoji2.text.DefaultEmojiCompatConfig$DefaultEmojiCompatConfigFactory
            r1 = 0
            r0.<init>(r1)
            androidx.emoji2.text.EmojiCompat$Config r0 = r0.create(r2)
            androidx.emoji2.text.FontRequestEmojiCompatConfig r0 = (androidx.emoji2.text.FontRequestEmojiCompatConfig) r0
            return r0
    }
}
