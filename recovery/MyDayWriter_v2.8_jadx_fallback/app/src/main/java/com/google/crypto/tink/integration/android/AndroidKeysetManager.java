package com.google.crypto.tink.integration.android;

/* JADX INFO: loaded from: classes.dex */
public final class AndroidKeysetManager {
    private static final java.lang.String TAG = null;
    private static final java.lang.Object lock = null;
    private com.google.crypto.tink.KeysetManager keysetManager;
    private final com.google.crypto.tink.Aead masterAead;
    private final com.google.crypto.tink.KeysetWriter writer;

    /* JADX INFO: renamed from: com.google.crypto.tink.integration.android.AndroidKeysetManager$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$proto$OutputPrefixType = null;

        static {
                com.google.crypto.tink.proto.OutputPrefixType[] r0 = com.google.crypto.tink.proto.OutputPrefixType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.google.crypto.tink.integration.android.AndroidKeysetManager.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$OutputPrefixType = r0
                int[] r0 = com.google.crypto.tink.integration.android.AndroidKeysetManager.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$OutputPrefixType     // Catch: java.lang.NoSuchFieldError -> L15
                com.google.crypto.tink.proto.OutputPrefixType r1 = com.google.crypto.tink.proto.OutputPrefixType.TINK     // Catch: java.lang.NoSuchFieldError -> L15
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L15
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L15
                goto L16
            L15:
                r0 = move-exception
            L16:
                int[] r0 = com.google.crypto.tink.integration.android.AndroidKeysetManager.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$OutputPrefixType     // Catch: java.lang.NoSuchFieldError -> L22
                com.google.crypto.tink.proto.OutputPrefixType r1 = com.google.crypto.tink.proto.OutputPrefixType.LEGACY     // Catch: java.lang.NoSuchFieldError -> L22
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L22
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L22
                goto L23
            L22:
                r0 = move-exception
            L23:
                int[] r0 = com.google.crypto.tink.integration.android.AndroidKeysetManager.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$OutputPrefixType     // Catch: java.lang.NoSuchFieldError -> L2f
                com.google.crypto.tink.proto.OutputPrefixType r1 = com.google.crypto.tink.proto.OutputPrefixType.RAW     // Catch: java.lang.NoSuchFieldError -> L2f
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L2f
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L2f
                goto L30
            L2f:
                r0 = move-exception
            L30:
                int[] r0 = com.google.crypto.tink.integration.android.AndroidKeysetManager.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$OutputPrefixType     // Catch: java.lang.NoSuchFieldError -> L3c
                com.google.crypto.tink.proto.OutputPrefixType r1 = com.google.crypto.tink.proto.OutputPrefixType.CRUNCHY     // Catch: java.lang.NoSuchFieldError -> L3c
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3c
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3c
                goto L3d
            L3c:
                r0 = move-exception
            L3d:
                return
        }
    }

    public static final class Builder {
        private android.content.Context context;
        private com.google.crypto.tink.KeyTemplate keyTemplate;
        private com.google.crypto.tink.KeysetManager keysetManager;
        private java.lang.String keysetName;
        private com.google.crypto.tink.Aead masterAead;
        private java.lang.String masterKeyUri;
        private java.lang.String prefFileName;
        private boolean useKeystore;

        public Builder() {
                r2 = this;
                r2.<init>()
                r0 = 0
                r2.context = r0
                r2.keysetName = r0
                r2.prefFileName = r0
                r2.masterKeyUri = r0
                r2.masterAead = r0
                r1 = 1
                r2.useKeystore = r1
                r2.keyTemplate = r0
                return
        }

        static /* synthetic */ android.content.Context access$000(com.google.crypto.tink.integration.android.AndroidKeysetManager.Builder r1) {
                android.content.Context r0 = r1.context
                return r0
        }

        static /* synthetic */ java.lang.String access$100(com.google.crypto.tink.integration.android.AndroidKeysetManager.Builder r1) {
                java.lang.String r0 = r1.keysetName
                return r0
        }

        static /* synthetic */ java.lang.String access$200(com.google.crypto.tink.integration.android.AndroidKeysetManager.Builder r1) {
                java.lang.String r0 = r1.prefFileName
                return r0
        }

        static /* synthetic */ com.google.crypto.tink.Aead access$300(com.google.crypto.tink.integration.android.AndroidKeysetManager.Builder r1) {
                com.google.crypto.tink.Aead r0 = r1.masterAead
                return r0
        }

        static /* synthetic */ com.google.crypto.tink.KeysetManager access$400(com.google.crypto.tink.integration.android.AndroidKeysetManager.Builder r1) {
                com.google.crypto.tink.KeysetManager r0 = r1.keysetManager
                return r0
        }

        private com.google.crypto.tink.KeysetManager generateKeysetAndWriteToPrefs() throws java.security.GeneralSecurityException, java.io.IOException {
                r6 = this;
                com.google.crypto.tink.KeyTemplate r0 = r6.keyTemplate
                if (r0 == 0) goto L44
                com.google.crypto.tink.KeysetManager r0 = com.google.crypto.tink.KeysetManager.withEmptyKeyset()
                com.google.crypto.tink.KeyTemplate r1 = r6.keyTemplate
                com.google.crypto.tink.KeysetManager r0 = r0.add(r1)
                com.google.crypto.tink.KeysetHandle r1 = r0.getKeysetHandle()
                com.google.crypto.tink.proto.KeysetInfo r1 = r1.getKeysetInfo()
                r2 = 0
                com.google.crypto.tink.proto.KeysetInfo$KeyInfo r1 = r1.getKeyInfo(r2)
                int r1 = r1.getKeyId()
                com.google.crypto.tink.KeysetManager r0 = r0.setPrimary(r1)
                com.google.crypto.tink.integration.android.SharedPrefKeysetWriter r2 = new com.google.crypto.tink.integration.android.SharedPrefKeysetWriter
                android.content.Context r3 = r6.context
                java.lang.String r4 = r6.keysetName
                java.lang.String r5 = r6.prefFileName
                r2.<init>(r3, r4, r5)
                com.google.crypto.tink.Aead r3 = r6.masterAead
                if (r3 == 0) goto L3c
                com.google.crypto.tink.KeysetHandle r3 = r0.getKeysetHandle()
                com.google.crypto.tink.Aead r4 = r6.masterAead
                r3.write(r2, r4)
                goto L43
            L3c:
                com.google.crypto.tink.KeysetHandle r3 = r0.getKeysetHandle()
                com.google.crypto.tink.CleartextKeysetHandle.write(r3, r2)
            L43:
                return r0
            L44:
                java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
                java.lang.String r1 = "cannot read or generate keyset"
                r0.<init>(r1)
                throw r0
        }

        private static byte[] readKeysetFromPrefs(android.content.Context r6, java.lang.String r7, java.lang.String r8) throws java.io.IOException {
                if (r7 == 0) goto L32
                android.content.Context r0 = r6.getApplicationContext()
                if (r8 != 0) goto Ld
                android.content.SharedPreferences r1 = android.preference.PreferenceManager.getDefaultSharedPreferences(r0)
                goto L12
            Ld:
                r1 = 0
                android.content.SharedPreferences r1 = r0.getSharedPreferences(r8, r1)
            L12:
                r2 = 0
                java.lang.String r3 = r1.getString(r7, r2)     // Catch: java.lang.IllegalArgumentException -> L1f java.lang.ClassCastException -> L21
                if (r3 != 0) goto L1a
                return r2
            L1a:
                byte[] r2 = com.google.crypto.tink.subtle.Hex.decode(r3)     // Catch: java.lang.IllegalArgumentException -> L1f java.lang.ClassCastException -> L21
                return r2
            L1f:
                r2 = move-exception
                goto L22
            L21:
                r2 = move-exception
            L22:
                java.io.CharConversionException r3 = new java.io.CharConversionException
                java.lang.Object[] r4 = new java.lang.Object[]{r7}
                java.lang.String r5 = "can't read keyset; the pref value %s is not a valid hex string"
                java.lang.String r4 = java.lang.String.format(r5, r4)
                r3.<init>(r4)
                throw r3
            L32:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "keysetName cannot be null"
                r0.<init>(r1)
                throw r0
        }

        private com.google.crypto.tink.KeysetManager readKeysetInCleartext(byte[] r2) throws java.security.GeneralSecurityException, java.io.IOException {
                r1 = this;
                com.google.crypto.tink.KeysetReader r0 = com.google.crypto.tink.BinaryKeysetReader.withBytes(r2)
                com.google.crypto.tink.KeysetHandle r0 = com.google.crypto.tink.CleartextKeysetHandle.read(r0)
                com.google.crypto.tink.KeysetManager r0 = com.google.crypto.tink.KeysetManager.withKeysetHandle(r0)
                return r0
        }

        private com.google.crypto.tink.KeysetManager readMasterkeyDecryptAndParseKeyset(byte[] r5) throws java.security.GeneralSecurityException, java.io.IOException {
                r4 = this;
                com.google.crypto.tink.integration.android.AndroidKeystoreKmsClient r0 = new com.google.crypto.tink.integration.android.AndroidKeystoreKmsClient     // Catch: java.security.ProviderException -> L28 java.security.GeneralSecurityException -> L2a
                r0.<init>()     // Catch: java.security.ProviderException -> L28 java.security.GeneralSecurityException -> L2a
                java.lang.String r1 = r4.masterKeyUri     // Catch: java.security.ProviderException -> L28 java.security.GeneralSecurityException -> L2a
                com.google.crypto.tink.Aead r0 = r0.getAead(r1)     // Catch: java.security.ProviderException -> L28 java.security.GeneralSecurityException -> L2a
                r4.masterAead = r0     // Catch: java.security.ProviderException -> L28 java.security.GeneralSecurityException -> L2a
                com.google.crypto.tink.KeysetReader r0 = com.google.crypto.tink.BinaryKeysetReader.withBytes(r5)     // Catch: java.security.GeneralSecurityException -> L1e java.io.IOException -> L20
                com.google.crypto.tink.Aead r1 = r4.masterAead     // Catch: java.security.GeneralSecurityException -> L1e java.io.IOException -> L20
                com.google.crypto.tink.KeysetHandle r0 = com.google.crypto.tink.KeysetHandle.read(r0, r1)     // Catch: java.security.GeneralSecurityException -> L1e java.io.IOException -> L20
                com.google.crypto.tink.KeysetManager r0 = com.google.crypto.tink.KeysetManager.withKeysetHandle(r0)     // Catch: java.security.GeneralSecurityException -> L1e java.io.IOException -> L20
                return r0
            L1e:
                r0 = move-exception
                goto L21
            L20:
                r0 = move-exception
            L21:
                com.google.crypto.tink.KeysetManager r1 = r4.readKeysetInCleartext(r5)     // Catch: java.io.IOException -> L26
                return r1
            L26:
                r1 = move-exception
                throw r0
            L28:
                r0 = move-exception
                goto L2b
            L2a:
                r0 = move-exception
            L2b:
                com.google.crypto.tink.KeysetManager r1 = r4.readKeysetInCleartext(r5)     // Catch: java.io.IOException -> L39
                java.lang.String r2 = com.google.crypto.tink.integration.android.AndroidKeysetManager.access$900()     // Catch: java.io.IOException -> L39
                java.lang.String r3 = "cannot use Android Keystore, it'll be disabled"
                android.util.Log.w(r2, r3, r0)     // Catch: java.io.IOException -> L39
                return r1
            L39:
                r1 = move-exception
                throw r0
        }

        private com.google.crypto.tink.Aead readOrGenerateNewMasterKey() throws java.security.GeneralSecurityException {
                r6 = this;
                java.lang.String r0 = "cannot use Android Keystore, it'll be disabled"
                boolean r1 = com.google.crypto.tink.integration.android.AndroidKeysetManager.access$700()
                r2 = 0
                if (r1 != 0) goto L13
                java.lang.String r0 = com.google.crypto.tink.integration.android.AndroidKeysetManager.access$900()
                java.lang.String r1 = "Android Keystore requires at least Android M"
                android.util.Log.w(r0, r1)
                return r2
            L13:
                com.google.crypto.tink.integration.android.AndroidKeystoreKmsClient r1 = new com.google.crypto.tink.integration.android.AndroidKeystoreKmsClient
                r1.<init>()
                java.lang.String r3 = r6.masterKeyUri     // Catch: java.security.ProviderException -> L45 java.security.GeneralSecurityException -> L47
                boolean r3 = com.google.crypto.tink.integration.android.AndroidKeystoreKmsClient.generateKeyIfNotExist(r3)     // Catch: java.security.ProviderException -> L45 java.security.GeneralSecurityException -> L47
                java.lang.String r4 = r6.masterKeyUri     // Catch: java.security.ProviderException -> L26 java.security.GeneralSecurityException -> L28
                com.google.crypto.tink.Aead r0 = r1.getAead(r4)     // Catch: java.security.ProviderException -> L26 java.security.GeneralSecurityException -> L28
                return r0
            L26:
                r4 = move-exception
                goto L29
            L28:
                r4 = move-exception
            L29:
                if (r3 == 0) goto L33
                java.lang.String r5 = com.google.crypto.tink.integration.android.AndroidKeysetManager.access$900()
                android.util.Log.w(r5, r0, r4)
                return r2
            L33:
                java.security.KeyStoreException r0 = new java.security.KeyStoreException
                java.lang.String r2 = r6.masterKeyUri
                java.lang.Object[] r2 = new java.lang.Object[]{r2}
                java.lang.String r5 = "the master key %s exists but is unusable"
                java.lang.String r2 = java.lang.String.format(r5, r2)
                r0.<init>(r2, r4)
                throw r0
            L45:
                r3 = move-exception
                goto L48
            L47:
                r3 = move-exception
            L48:
                java.lang.String r4 = com.google.crypto.tink.integration.android.AndroidKeysetManager.access$900()
                android.util.Log.w(r4, r0, r3)
                return r2
        }

        public synchronized com.google.crypto.tink.integration.android.AndroidKeysetManager build() throws java.security.GeneralSecurityException, java.io.IOException {
                r4 = this;
                monitor-enter(r4)
                java.lang.String r0 = r4.keysetName     // Catch: java.lang.Throwable -> L55
                if (r0 == 0) goto L4d
                java.lang.Object r0 = com.google.crypto.tink.integration.android.AndroidKeysetManager.access$600()     // Catch: java.lang.Throwable -> L55
                monitor-enter(r0)     // Catch: java.lang.Throwable -> L55
                android.content.Context r1 = r4.context     // Catch: java.lang.Throwable -> L48
                java.lang.String r2 = r4.keysetName     // Catch: java.lang.Throwable -> L48
                java.lang.String r3 = r4.prefFileName     // Catch: java.lang.Throwable -> L48
                byte[] r1 = readKeysetFromPrefs(r1, r2, r3)     // Catch: java.lang.Throwable -> L48
                if (r1 != 0) goto L27
                java.lang.String r2 = r4.masterKeyUri     // Catch: java.lang.Throwable -> L48
                if (r2 == 0) goto L20
                com.google.crypto.tink.Aead r2 = r4.readOrGenerateNewMasterKey()     // Catch: java.lang.Throwable -> L48
                r4.masterAead = r2     // Catch: java.lang.Throwable -> L48
            L20:
                com.google.crypto.tink.KeysetManager r2 = r4.generateKeysetAndWriteToPrefs()     // Catch: java.lang.Throwable -> L48
                r4.keysetManager = r2     // Catch: java.lang.Throwable -> L48
                goto L3f
            L27:
                java.lang.String r2 = r4.masterKeyUri     // Catch: java.lang.Throwable -> L48
                if (r2 == 0) goto L39
                boolean r2 = com.google.crypto.tink.integration.android.AndroidKeysetManager.access$700()     // Catch: java.lang.Throwable -> L48
                if (r2 != 0) goto L32
                goto L39
            L32:
                com.google.crypto.tink.KeysetManager r2 = r4.readMasterkeyDecryptAndParseKeyset(r1)     // Catch: java.lang.Throwable -> L48
                r4.keysetManager = r2     // Catch: java.lang.Throwable -> L48
                goto L3f
            L39:
                com.google.crypto.tink.KeysetManager r2 = r4.readKeysetInCleartext(r1)     // Catch: java.lang.Throwable -> L48
                r4.keysetManager = r2     // Catch: java.lang.Throwable -> L48
            L3f:
                com.google.crypto.tink.integration.android.AndroidKeysetManager r2 = new com.google.crypto.tink.integration.android.AndroidKeysetManager     // Catch: java.lang.Throwable -> L48
                r3 = 0
                r2.<init>(r4, r3)     // Catch: java.lang.Throwable -> L48
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L48
                monitor-exit(r4)
                return r2
            L48:
                r1 = move-exception
            L49:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L4b
                throw r1     // Catch: java.lang.Throwable -> L55
            L4b:
                r1 = move-exception
                goto L49
            L4d:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L55
                java.lang.String r1 = "keysetName cannot be null"
                r0.<init>(r1)     // Catch: java.lang.Throwable -> L55
                throw r0     // Catch: java.lang.Throwable -> L55
            L55:
                r0 = move-exception
                monitor-exit(r4)     // Catch: java.lang.Throwable -> L55
                throw r0
        }

        @java.lang.Deprecated
        public com.google.crypto.tink.integration.android.AndroidKeysetManager.Builder doNotUseKeystore() {
                r1 = this;
                r0 = 0
                r1.masterKeyUri = r0
                r0 = 0
                r1.useKeystore = r0
                return r1
        }

        public com.google.crypto.tink.integration.android.AndroidKeysetManager.Builder withKeyTemplate(com.google.crypto.tink.KeyTemplate r1) {
                r0 = this;
                r0.keyTemplate = r1
                return r0
        }

        @java.lang.Deprecated
        public com.google.crypto.tink.integration.android.AndroidKeysetManager.Builder withKeyTemplate(com.google.crypto.tink.proto.KeyTemplate r4) {
                r3 = this;
                java.lang.String r0 = r4.getTypeUrl()
                com.google.crypto.tink.shaded.protobuf.ByteString r1 = r4.getValue()
                byte[] r1 = r1.toByteArray()
                com.google.crypto.tink.proto.OutputPrefixType r2 = r4.getOutputPrefixType()
                com.google.crypto.tink.KeyTemplate$OutputPrefixType r2 = com.google.crypto.tink.integration.android.AndroidKeysetManager.access$500(r2)
                com.google.crypto.tink.KeyTemplate r0 = com.google.crypto.tink.KeyTemplate.create(r0, r1, r2)
                r3.keyTemplate = r0
                return r3
        }

        public com.google.crypto.tink.integration.android.AndroidKeysetManager.Builder withMasterKeyUri(java.lang.String r3) {
                r2 = this;
                java.lang.String r0 = "android-keystore://"
                boolean r0 = r3.startsWith(r0)
                if (r0 == 0) goto L17
                boolean r0 = r2.useKeystore
                if (r0 == 0) goto Lf
                r2.masterKeyUri = r3
                return r2
            Lf:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "cannot call withMasterKeyUri() after calling doNotUseKeystore()"
                r0.<init>(r1)
                throw r0
            L17:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "key URI must start with android-keystore://"
                r0.<init>(r1)
                throw r0
        }

        public com.google.crypto.tink.integration.android.AndroidKeysetManager.Builder withSharedPref(android.content.Context r3, java.lang.String r4, java.lang.String r5) throws java.io.IOException {
                r2 = this;
                if (r3 == 0) goto L13
                if (r4 == 0) goto Lb
                r2.context = r3
                r2.keysetName = r4
                r2.prefFileName = r5
                return r2
            Lb:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "need a keyset name"
                r0.<init>(r1)
                throw r0
            L13:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "need an Android context"
                r0.<init>(r1)
                throw r0
        }
    }

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            com.google.crypto.tink.integration.android.AndroidKeysetManager.lock = r0
            java.lang.Class<com.google.crypto.tink.integration.android.AndroidKeysetManager> r0 = com.google.crypto.tink.integration.android.AndroidKeysetManager.class
            java.lang.String r0 = r0.getSimpleName()
            com.google.crypto.tink.integration.android.AndroidKeysetManager.TAG = r0
            return
    }

    private AndroidKeysetManager(com.google.crypto.tink.integration.android.AndroidKeysetManager.Builder r5) {
            r4 = this;
            r4.<init>()
            com.google.crypto.tink.integration.android.SharedPrefKeysetWriter r0 = new com.google.crypto.tink.integration.android.SharedPrefKeysetWriter
            android.content.Context r1 = com.google.crypto.tink.integration.android.AndroidKeysetManager.Builder.access$000(r5)
            java.lang.String r2 = com.google.crypto.tink.integration.android.AndroidKeysetManager.Builder.access$100(r5)
            java.lang.String r3 = com.google.crypto.tink.integration.android.AndroidKeysetManager.Builder.access$200(r5)
            r0.<init>(r1, r2, r3)
            r4.writer = r0
            com.google.crypto.tink.Aead r0 = com.google.crypto.tink.integration.android.AndroidKeysetManager.Builder.access$300(r5)
            r4.masterAead = r0
            com.google.crypto.tink.KeysetManager r0 = com.google.crypto.tink.integration.android.AndroidKeysetManager.Builder.access$400(r5)
            r4.keysetManager = r0
            return
    }

    /* synthetic */ AndroidKeysetManager(com.google.crypto.tink.integration.android.AndroidKeysetManager.Builder r1, com.google.crypto.tink.integration.android.AndroidKeysetManager.AnonymousClass1 r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    static /* synthetic */ com.google.crypto.tink.KeyTemplate.OutputPrefixType access$500(com.google.crypto.tink.proto.OutputPrefixType r1) {
            com.google.crypto.tink.KeyTemplate$OutputPrefixType r0 = fromProto(r1)
            return r0
    }

    static /* synthetic */ java.lang.Object access$600() {
            java.lang.Object r0 = com.google.crypto.tink.integration.android.AndroidKeysetManager.lock
            return r0
    }

    static /* synthetic */ boolean access$700() {
            boolean r0 = isAtLeastM()
            return r0
    }

    static /* synthetic */ java.lang.String access$900() {
            java.lang.String r0 = com.google.crypto.tink.integration.android.AndroidKeysetManager.TAG
            return r0
    }

    private static com.google.crypto.tink.KeyTemplate.OutputPrefixType fromProto(com.google.crypto.tink.proto.OutputPrefixType r2) {
            int[] r0 = com.google.crypto.tink.integration.android.AndroidKeysetManager.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$OutputPrefixType
            int r1 = r2.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L1c;
                case 2: goto L19;
                case 3: goto L16;
                case 4: goto L13;
                default: goto Lb;
            }
        Lb:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Unknown output prefix type"
            r0.<init>(r1)
            throw r0
        L13:
            com.google.crypto.tink.KeyTemplate$OutputPrefixType r0 = com.google.crypto.tink.KeyTemplate.OutputPrefixType.CRUNCHY
            return r0
        L16:
            com.google.crypto.tink.KeyTemplate$OutputPrefixType r0 = com.google.crypto.tink.KeyTemplate.OutputPrefixType.RAW
            return r0
        L19:
            com.google.crypto.tink.KeyTemplate$OutputPrefixType r0 = com.google.crypto.tink.KeyTemplate.OutputPrefixType.LEGACY
            return r0
        L1c:
            com.google.crypto.tink.KeyTemplate$OutputPrefixType r0 = com.google.crypto.tink.KeyTemplate.OutputPrefixType.TINK
            return r0
    }

    private static boolean isAtLeastM() {
            r0 = 1
            return r0
    }

    private boolean shouldUseKeystore() {
            r1 = this;
            com.google.crypto.tink.Aead r0 = r1.masterAead
            if (r0 == 0) goto Lc
            boolean r0 = isAtLeastM()
            if (r0 == 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    private void write(com.google.crypto.tink.KeysetManager r4) throws java.security.GeneralSecurityException {
            r3 = this;
            boolean r0 = r3.shouldUseKeystore()     // Catch: java.io.IOException -> L1d
            if (r0 == 0) goto L12
            com.google.crypto.tink.KeysetHandle r0 = r4.getKeysetHandle()     // Catch: java.io.IOException -> L1d
            com.google.crypto.tink.KeysetWriter r1 = r3.writer     // Catch: java.io.IOException -> L1d
            com.google.crypto.tink.Aead r2 = r3.masterAead     // Catch: java.io.IOException -> L1d
            r0.write(r1, r2)     // Catch: java.io.IOException -> L1d
            goto L1b
        L12:
            com.google.crypto.tink.KeysetHandle r0 = r4.getKeysetHandle()     // Catch: java.io.IOException -> L1d
            com.google.crypto.tink.KeysetWriter r1 = r3.writer     // Catch: java.io.IOException -> L1d
            com.google.crypto.tink.CleartextKeysetHandle.write(r0, r1)     // Catch: java.io.IOException -> L1d
        L1b:
            return
        L1d:
            r0 = move-exception
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException
            r1.<init>(r0)
            throw r1
    }

    public synchronized com.google.crypto.tink.integration.android.AndroidKeysetManager add(com.google.crypto.tink.KeyTemplate r2) throws java.security.GeneralSecurityException {
            r1 = this;
            monitor-enter(r1)
            com.google.crypto.tink.KeysetManager r0 = r1.keysetManager     // Catch: java.lang.Throwable -> L10
            com.google.crypto.tink.KeysetManager r0 = r0.add(r2)     // Catch: java.lang.Throwable -> L10
            r1.keysetManager = r0     // Catch: java.lang.Throwable -> L10
            com.google.crypto.tink.KeysetManager r0 = r1.keysetManager     // Catch: java.lang.Throwable -> L10
            r1.write(r0)     // Catch: java.lang.Throwable -> L10
            monitor-exit(r1)
            return r1
        L10:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L10
            throw r2
    }

    @java.lang.Deprecated
    public synchronized com.google.crypto.tink.integration.android.AndroidKeysetManager add(com.google.crypto.tink.proto.KeyTemplate r2) throws java.security.GeneralSecurityException {
            r1 = this;
            monitor-enter(r1)
            com.google.crypto.tink.KeysetManager r0 = r1.keysetManager     // Catch: java.lang.Throwable -> L10
            com.google.crypto.tink.KeysetManager r0 = r0.add(r2)     // Catch: java.lang.Throwable -> L10
            r1.keysetManager = r0     // Catch: java.lang.Throwable -> L10
            com.google.crypto.tink.KeysetManager r0 = r1.keysetManager     // Catch: java.lang.Throwable -> L10
            r1.write(r0)     // Catch: java.lang.Throwable -> L10
            monitor-exit(r1)
            return r1
        L10:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L10
            throw r2
    }

    public synchronized com.google.crypto.tink.integration.android.AndroidKeysetManager delete(int r2) throws java.security.GeneralSecurityException {
            r1 = this;
            monitor-enter(r1)
            com.google.crypto.tink.KeysetManager r0 = r1.keysetManager     // Catch: java.lang.Throwable -> L10
            com.google.crypto.tink.KeysetManager r0 = r0.delete(r2)     // Catch: java.lang.Throwable -> L10
            r1.keysetManager = r0     // Catch: java.lang.Throwable -> L10
            com.google.crypto.tink.KeysetManager r0 = r1.keysetManager     // Catch: java.lang.Throwable -> L10
            r1.write(r0)     // Catch: java.lang.Throwable -> L10
            monitor-exit(r1)
            return r1
        L10:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L10
            throw r2
    }

    public synchronized com.google.crypto.tink.integration.android.AndroidKeysetManager destroy(int r2) throws java.security.GeneralSecurityException {
            r1 = this;
            monitor-enter(r1)
            com.google.crypto.tink.KeysetManager r0 = r1.keysetManager     // Catch: java.lang.Throwable -> L10
            com.google.crypto.tink.KeysetManager r0 = r0.destroy(r2)     // Catch: java.lang.Throwable -> L10
            r1.keysetManager = r0     // Catch: java.lang.Throwable -> L10
            com.google.crypto.tink.KeysetManager r0 = r1.keysetManager     // Catch: java.lang.Throwable -> L10
            r1.write(r0)     // Catch: java.lang.Throwable -> L10
            monitor-exit(r1)
            return r1
        L10:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L10
            throw r2
    }

    public synchronized com.google.crypto.tink.integration.android.AndroidKeysetManager disable(int r2) throws java.security.GeneralSecurityException {
            r1 = this;
            monitor-enter(r1)
            com.google.crypto.tink.KeysetManager r0 = r1.keysetManager     // Catch: java.lang.Throwable -> L10
            com.google.crypto.tink.KeysetManager r0 = r0.disable(r2)     // Catch: java.lang.Throwable -> L10
            r1.keysetManager = r0     // Catch: java.lang.Throwable -> L10
            com.google.crypto.tink.KeysetManager r0 = r1.keysetManager     // Catch: java.lang.Throwable -> L10
            r1.write(r0)     // Catch: java.lang.Throwable -> L10
            monitor-exit(r1)
            return r1
        L10:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L10
            throw r2
    }

    public synchronized com.google.crypto.tink.integration.android.AndroidKeysetManager enable(int r2) throws java.security.GeneralSecurityException {
            r1 = this;
            monitor-enter(r1)
            com.google.crypto.tink.KeysetManager r0 = r1.keysetManager     // Catch: java.lang.Throwable -> L10
            com.google.crypto.tink.KeysetManager r0 = r0.enable(r2)     // Catch: java.lang.Throwable -> L10
            r1.keysetManager = r0     // Catch: java.lang.Throwable -> L10
            com.google.crypto.tink.KeysetManager r0 = r1.keysetManager     // Catch: java.lang.Throwable -> L10
            r1.write(r0)     // Catch: java.lang.Throwable -> L10
            monitor-exit(r1)
            return r1
        L10:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L10
            throw r2
    }

    public synchronized com.google.crypto.tink.KeysetHandle getKeysetHandle() throws java.security.GeneralSecurityException {
            r1 = this;
            monitor-enter(r1)
            com.google.crypto.tink.KeysetManager r0 = r1.keysetManager     // Catch: java.lang.Throwable -> L9
            com.google.crypto.tink.KeysetHandle r0 = r0.getKeysetHandle()     // Catch: java.lang.Throwable -> L9
            monitor-exit(r1)
            return r0
        L9:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L9
            throw r0
    }

    public synchronized boolean isUsingKeystore() {
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.shouldUseKeystore()     // Catch: java.lang.Throwable -> L7
            monitor-exit(r1)
            return r0
        L7:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L7
            throw r0
    }

    @java.lang.Deprecated
    public synchronized com.google.crypto.tink.integration.android.AndroidKeysetManager promote(int r2) throws java.security.GeneralSecurityException {
            r1 = this;
            monitor-enter(r1)
            com.google.crypto.tink.integration.android.AndroidKeysetManager r0 = r1.setPrimary(r2)     // Catch: java.lang.Throwable -> L7
            monitor-exit(r1)
            return r0
        L7:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L7
            throw r2
    }

    @java.lang.Deprecated
    public synchronized com.google.crypto.tink.integration.android.AndroidKeysetManager rotate(com.google.crypto.tink.proto.KeyTemplate r2) throws java.security.GeneralSecurityException {
            r1 = this;
            monitor-enter(r1)
            com.google.crypto.tink.KeysetManager r0 = r1.keysetManager     // Catch: java.lang.Throwable -> L10
            com.google.crypto.tink.KeysetManager r0 = r0.rotate(r2)     // Catch: java.lang.Throwable -> L10
            r1.keysetManager = r0     // Catch: java.lang.Throwable -> L10
            com.google.crypto.tink.KeysetManager r0 = r1.keysetManager     // Catch: java.lang.Throwable -> L10
            r1.write(r0)     // Catch: java.lang.Throwable -> L10
            monitor-exit(r1)
            return r1
        L10:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L10
            throw r2
    }

    public synchronized com.google.crypto.tink.integration.android.AndroidKeysetManager setPrimary(int r2) throws java.security.GeneralSecurityException {
            r1 = this;
            monitor-enter(r1)
            com.google.crypto.tink.KeysetManager r0 = r1.keysetManager     // Catch: java.lang.Throwable -> L10
            com.google.crypto.tink.KeysetManager r0 = r0.setPrimary(r2)     // Catch: java.lang.Throwable -> L10
            r1.keysetManager = r0     // Catch: java.lang.Throwable -> L10
            com.google.crypto.tink.KeysetManager r0 = r1.keysetManager     // Catch: java.lang.Throwable -> L10
            r1.write(r0)     // Catch: java.lang.Throwable -> L10
            monitor-exit(r1)
            return r1
        L10:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L10
            throw r2
    }
}
