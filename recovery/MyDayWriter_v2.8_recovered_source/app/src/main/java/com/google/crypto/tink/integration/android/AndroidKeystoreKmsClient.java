package com.google.crypto.tink.integration.android;

/* JADX INFO: loaded from: classes.dex */
public final class AndroidKeystoreKmsClient implements com.google.crypto.tink.KmsClient {
    private static final int MAX_WAIT_TIME_MILLISECONDS_BEFORE_RETRY = 40;
    public static final java.lang.String PREFIX = "android-keystore://";
    private static final java.lang.String TAG = null;
    private static final java.lang.Object keyCreationLock = null;
    private java.security.KeyStore keyStore;
    private final java.lang.String keyUri;

    /* JADX INFO: renamed from: com.google.crypto.tink.integration.android.AndroidKeystoreKmsClient$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    public static final class Builder {
        java.security.KeyStore keyStore;
        java.lang.String keyUri;

        public Builder() {
                r2 = this;
                r2.<init>()
                r0 = 0
                r2.keyUri = r0
                r2.keyStore = r0
                boolean r1 = com.google.crypto.tink.integration.android.AndroidKeystoreKmsClient.access$000()
                if (r1 == 0) goto L26
                java.lang.String r1 = "AndroidKeyStore"
                java.security.KeyStore r1 = java.security.KeyStore.getInstance(r1)     // Catch: java.io.IOException -> L1d java.security.GeneralSecurityException -> L1f
                r2.keyStore = r1     // Catch: java.io.IOException -> L1d java.security.GeneralSecurityException -> L1f
                java.security.KeyStore r1 = r2.keyStore     // Catch: java.io.IOException -> L1d java.security.GeneralSecurityException -> L1f
                r1.load(r0)     // Catch: java.io.IOException -> L1d java.security.GeneralSecurityException -> L1f
                return
            L1d:
                r0 = move-exception
                goto L20
            L1f:
                r0 = move-exception
            L20:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                r1.<init>(r0)
                throw r1
            L26:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "need Android Keystore on Android M or newer"
                r0.<init>(r1)
                throw r0
        }

        public com.google.crypto.tink.integration.android.AndroidKeystoreKmsClient build() {
                r2 = this;
                com.google.crypto.tink.integration.android.AndroidKeystoreKmsClient r0 = new com.google.crypto.tink.integration.android.AndroidKeystoreKmsClient
                r1 = 0
                r0.<init>(r2, r1)
                return r0
        }

        public com.google.crypto.tink.integration.android.AndroidKeystoreKmsClient.Builder setKeyStore(java.security.KeyStore r3) {
                r2 = this;
                if (r3 == 0) goto L5
                r2.keyStore = r3
                return r2
            L5:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "val cannot be null"
                r0.<init>(r1)
                throw r0
        }

        public com.google.crypto.tink.integration.android.AndroidKeystoreKmsClient.Builder setKeyUri(java.lang.String r3) {
                r2 = this;
                if (r3 == 0) goto L13
                java.util.Locale r0 = java.util.Locale.US
                java.lang.String r0 = r3.toLowerCase(r0)
                java.lang.String r1 = "android-keystore://"
                boolean r0 = r0.startsWith(r1)
                if (r0 == 0) goto L13
                r2.keyUri = r3
                return r2
            L13:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "val must start with android-keystore://"
                r0.<init>(r1)
                throw r0
        }
    }

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            com.google.crypto.tink.integration.android.AndroidKeystoreKmsClient.keyCreationLock = r0
            java.lang.Class<com.google.crypto.tink.integration.android.AndroidKeystoreKmsClient> r0 = com.google.crypto.tink.integration.android.AndroidKeystoreKmsClient.class
            java.lang.String r0 = r0.getSimpleName()
            com.google.crypto.tink.integration.android.AndroidKeystoreKmsClient.TAG = r0
            return
    }

    public AndroidKeystoreKmsClient() throws java.security.GeneralSecurityException {
            r1 = this;
            com.google.crypto.tink.integration.android.AndroidKeystoreKmsClient$Builder r0 = new com.google.crypto.tink.integration.android.AndroidKeystoreKmsClient$Builder
            r0.<init>()
            r1.<init>(r0)
            return
    }

    private AndroidKeystoreKmsClient(com.google.crypto.tink.integration.android.AndroidKeystoreKmsClient.Builder r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = r2.keyUri
            r1.keyUri = r0
            java.security.KeyStore r0 = r2.keyStore
            r1.keyStore = r0
            return
    }

    /* synthetic */ AndroidKeystoreKmsClient(com.google.crypto.tink.integration.android.AndroidKeystoreKmsClient.Builder r1, com.google.crypto.tink.integration.android.AndroidKeystoreKmsClient.AnonymousClass1 r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @java.lang.Deprecated
    public AndroidKeystoreKmsClient(java.lang.String r2) {
            r1 = this;
            com.google.crypto.tink.integration.android.AndroidKeystoreKmsClient$Builder r0 = new com.google.crypto.tink.integration.android.AndroidKeystoreKmsClient$Builder
            r0.<init>()
            com.google.crypto.tink.integration.android.AndroidKeystoreKmsClient$Builder r0 = r0.setKeyUri(r2)
            r1.<init>(r0)
            return
    }

    static /* synthetic */ boolean access$000() {
            boolean r0 = isAtLeastM()
            return r0
    }

    static boolean generateKeyIfNotExist(java.lang.String r3) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.integration.android.AndroidKeystoreKmsClient r0 = new com.google.crypto.tink.integration.android.AndroidKeystoreKmsClient
            r0.<init>()
            java.lang.Object r1 = com.google.crypto.tink.integration.android.AndroidKeystoreKmsClient.keyCreationLock
            monitor-enter(r1)
            boolean r2 = r0.hasKey(r3)     // Catch: java.lang.Throwable -> L17
            if (r2 != 0) goto L14
            generateNewAesGcmKeyWithoutExistenceCheck(r3)     // Catch: java.lang.Throwable -> L17
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L17
            r1 = 1
            return r1
        L14:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L17
            r1 = 0
            return r1
        L17:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L17
            throw r2
    }

    public static void generateNewAeadKey(java.lang.String r5) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.integration.android.AndroidKeystoreKmsClient r0 = new com.google.crypto.tink.integration.android.AndroidKeystoreKmsClient
            r0.<init>()
            java.lang.Object r1 = com.google.crypto.tink.integration.android.AndroidKeystoreKmsClient.keyCreationLock
            monitor-enter(r1)
            boolean r2 = r0.hasKey(r5)     // Catch: java.lang.Throwable -> L23
            if (r2 != 0) goto L13
            generateNewAesGcmKeyWithoutExistenceCheck(r5)     // Catch: java.lang.Throwable -> L23
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L23
            return
        L13:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L23
            java.lang.String r3 = "cannot generate a new key %s because it already exists; please delete it with deleteKey() and try again"
            java.lang.Object[] r4 = new java.lang.Object[]{r5}     // Catch: java.lang.Throwable -> L23
            java.lang.String r3 = java.lang.String.format(r3, r4)     // Catch: java.lang.Throwable -> L23
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L23
            throw r2     // Catch: java.lang.Throwable -> L23
        L23:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L23
            throw r2
    }

    static void generateNewAesGcmKeyWithoutExistenceCheck(java.lang.String r7) throws java.security.GeneralSecurityException {
            java.lang.String r0 = "android-keystore://"
            java.lang.String r0 = com.google.crypto.tink.subtle.Validators.validateKmsKeyUriAndRemovePrefix(r0, r7)
            java.lang.String r1 = "AES"
            java.lang.String r2 = "AndroidKeyStore"
            javax.crypto.KeyGenerator r1 = javax.crypto.KeyGenerator.getInstance(r1, r2)
            android.security.keystore.KeyGenParameterSpec$Builder r2 = new android.security.keystore.KeyGenParameterSpec$Builder
            r3 = 3
            r2.<init>(r0, r3)
            r3 = 256(0x100, float:3.59E-43)
            android.security.keystore.KeyGenParameterSpec$Builder r2 = r2.setKeySize(r3)
            r3 = 1
            java.lang.String[] r4 = new java.lang.String[r3]
            java.lang.String r5 = "GCM"
            r6 = 0
            r4[r6] = r5
            android.security.keystore.KeyGenParameterSpec$Builder r2 = r2.setBlockModes(r4)
            java.lang.String[] r3 = new java.lang.String[r3]
            java.lang.String r4 = "NoPadding"
            r3[r6] = r4
            android.security.keystore.KeyGenParameterSpec$Builder r2 = r2.setEncryptionPaddings(r3)
            android.security.keystore.KeyGenParameterSpec r2 = r2.build()
            r1.init(r2)
            r1.generateKey()
            return
    }

    public static com.google.crypto.tink.Aead getOrGenerateNewAeadKey(java.lang.String r3) throws java.security.GeneralSecurityException, java.io.IOException {
            com.google.crypto.tink.integration.android.AndroidKeystoreKmsClient r0 = new com.google.crypto.tink.integration.android.AndroidKeystoreKmsClient
            r0.<init>()
            java.lang.Object r1 = com.google.crypto.tink.integration.android.AndroidKeystoreKmsClient.keyCreationLock
            monitor-enter(r1)
            boolean r2 = r0.hasKey(r3)     // Catch: java.lang.Throwable -> L17
            if (r2 != 0) goto L11
            generateNewAesGcmKeyWithoutExistenceCheck(r3)     // Catch: java.lang.Throwable -> L17
        L11:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L17
            com.google.crypto.tink.Aead r1 = r0.getAead(r3)
            return r1
        L17:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L17
            throw r2
    }

    private static boolean isAtLeastM() {
            r0 = 1
            return r0
    }

    private static void sleepRandomAmount() {
            double r0 = java.lang.Math.random()
            r2 = 4630826316843712512(0x4044000000000000, double:40.0)
            double r0 = r0 * r2
            int r0 = (int) r0
            long r1 = (long) r0
            java.lang.Thread.sleep(r1)     // Catch: java.lang.InterruptedException -> Ld
            goto Le
        Ld:
            r1 = move-exception
        Le:
            return
    }

    private static com.google.crypto.tink.Aead validateAead(com.google.crypto.tink.Aead r6) throws java.security.GeneralSecurityException {
            r0 = 10
            byte[] r0 = com.google.crypto.tink.subtle.Random.randBytes(r0)
            r1 = 0
            byte[] r1 = new byte[r1]
            byte[] r2 = r6.encrypt(r0, r1)
            byte[] r3 = r6.decrypt(r2, r1)
            boolean r4 = java.util.Arrays.equals(r0, r3)
            if (r4 == 0) goto L18
            return r6
        L18:
            java.security.KeyStoreException r4 = new java.security.KeyStoreException
            java.lang.String r5 = "cannot use Android Keystore: encryption/decryption of non-empty message and empty aad returns an incorrect result"
            r4.<init>(r5)
            throw r4
    }

    public synchronized void deleteKey(java.lang.String r3) throws java.security.GeneralSecurityException {
            r2 = this;
            monitor-enter(r2)
            java.lang.String r0 = "android-keystore://"
            java.lang.String r0 = com.google.crypto.tink.subtle.Validators.validateKmsKeyUriAndRemovePrefix(r0, r3)     // Catch: java.lang.Throwable -> Le
            java.security.KeyStore r1 = r2.keyStore     // Catch: java.lang.Throwable -> Le
            r1.deleteEntry(r0)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r2)
            return
        Le:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Le
            throw r3
    }

    @Override // com.google.crypto.tink.KmsClient
    public synchronized boolean doesSupport(java.lang.String r4) {
            r3 = this;
            monitor-enter(r3)
            java.lang.String r0 = r3.keyUri     // Catch: java.lang.Throwable -> L26
            r1 = 1
            if (r0 == 0) goto L10
            java.lang.String r0 = r3.keyUri     // Catch: java.lang.Throwable -> L26
            boolean r0 = r0.equals(r4)     // Catch: java.lang.Throwable -> L26
            if (r0 == 0) goto L10
            monitor-exit(r3)
            return r1
        L10:
            java.lang.String r0 = r3.keyUri     // Catch: java.lang.Throwable -> L26
            if (r0 != 0) goto L23
            java.util.Locale r0 = java.util.Locale.US     // Catch: java.lang.Throwable -> L26
            java.lang.String r0 = r4.toLowerCase(r0)     // Catch: java.lang.Throwable -> L26
            java.lang.String r2 = "android-keystore://"
            boolean r0 = r0.startsWith(r2)     // Catch: java.lang.Throwable -> L26
            if (r0 == 0) goto L23
            goto L24
        L23:
            r1 = 0
        L24:
            monitor-exit(r3)
            return r1
        L26:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L26
            throw r4
    }

    @Override // com.google.crypto.tink.KmsClient
    public synchronized com.google.crypto.tink.Aead getAead(java.lang.String r4) throws java.security.GeneralSecurityException {
            r3 = this;
            monitor-enter(r3)
            java.lang.String r0 = r3.keyUri     // Catch: java.lang.Throwable -> L33
            if (r0 == 0) goto L20
            java.lang.String r0 = r3.keyUri     // Catch: java.lang.Throwable -> L33
            boolean r0 = r0.equals(r4)     // Catch: java.lang.Throwable -> L33
            if (r0 == 0) goto Le
            goto L20
        Le:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException     // Catch: java.lang.Throwable -> L33
            java.lang.String r1 = "this client is bound to %s, cannot load keys bound to %s"
            java.lang.String r2 = r3.keyUri     // Catch: java.lang.Throwable -> L33
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r4}     // Catch: java.lang.Throwable -> L33
            java.lang.String r1 = java.lang.String.format(r1, r2)     // Catch: java.lang.Throwable -> L33
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L33
            throw r0     // Catch: java.lang.Throwable -> L33
        L20:
            com.google.crypto.tink.integration.android.AndroidKeystoreAesGcm r0 = new com.google.crypto.tink.integration.android.AndroidKeystoreAesGcm     // Catch: java.lang.Throwable -> L33
            java.lang.String r1 = "android-keystore://"
            java.lang.String r1 = com.google.crypto.tink.subtle.Validators.validateKmsKeyUriAndRemovePrefix(r1, r4)     // Catch: java.lang.Throwable -> L33
            java.security.KeyStore r2 = r3.keyStore     // Catch: java.lang.Throwable -> L33
            r0.<init>(r1, r2)     // Catch: java.lang.Throwable -> L33
            com.google.crypto.tink.Aead r1 = validateAead(r0)     // Catch: java.lang.Throwable -> L33
            monitor-exit(r3)
            return r1
        L33:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L33
            throw r4
    }

    synchronized boolean hasKey(java.lang.String r5) throws java.security.GeneralSecurityException {
            r4 = this;
            monitor-enter(r4)
            java.lang.String r0 = "android-keystore://"
            java.lang.String r0 = com.google.crypto.tink.subtle.Validators.validateKmsKeyUriAndRemovePrefix(r0, r5)     // Catch: java.lang.Throwable -> L38
            java.security.KeyStore r1 = r4.keyStore     // Catch: java.lang.NullPointerException -> Lf java.lang.Throwable -> L38
            boolean r1 = r1.containsAlias(r0)     // Catch: java.lang.NullPointerException -> Lf java.lang.Throwable -> L38
            monitor-exit(r4)
            return r1
        Lf:
            r1 = move-exception
            java.lang.String r2 = com.google.crypto.tink.integration.android.AndroidKeystoreKmsClient.TAG     // Catch: java.lang.Throwable -> L38
            java.lang.String r3 = "Keystore is temporarily unavailable, wait, reinitialize Keystore and try again."
            android.util.Log.w(r2, r3)     // Catch: java.lang.Throwable -> L38
            sleepRandomAmount()     // Catch: java.io.IOException -> L31 java.lang.Throwable -> L38
            java.lang.String r2 = "AndroidKeyStore"
            java.security.KeyStore r2 = java.security.KeyStore.getInstance(r2)     // Catch: java.io.IOException -> L31 java.lang.Throwable -> L38
            r4.keyStore = r2     // Catch: java.io.IOException -> L31 java.lang.Throwable -> L38
            java.security.KeyStore r2 = r4.keyStore     // Catch: java.io.IOException -> L31 java.lang.Throwable -> L38
            r3 = 0
            r2.load(r3)     // Catch: java.io.IOException -> L31 java.lang.Throwable -> L38
            java.security.KeyStore r2 = r4.keyStore     // Catch: java.lang.Throwable -> L38
            boolean r2 = r2.containsAlias(r0)     // Catch: java.lang.Throwable -> L38
            monitor-exit(r4)
            return r2
        L31:
            r2 = move-exception
            java.security.GeneralSecurityException r3 = new java.security.GeneralSecurityException     // Catch: java.lang.Throwable -> L38
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L38
            throw r3     // Catch: java.lang.Throwable -> L38
        L38:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L38
            throw r5
    }

    @Override // com.google.crypto.tink.KmsClient
    public com.google.crypto.tink.KmsClient withCredentials(java.lang.String r2) throws java.security.GeneralSecurityException {
            r1 = this;
            com.google.crypto.tink.integration.android.AndroidKeystoreKmsClient r0 = new com.google.crypto.tink.integration.android.AndroidKeystoreKmsClient
            r0.<init>()
            return r0
    }

    @Override // com.google.crypto.tink.KmsClient
    public com.google.crypto.tink.KmsClient withDefaultCredentials() throws java.security.GeneralSecurityException {
            r1 = this;
            com.google.crypto.tink.integration.android.AndroidKeystoreKmsClient r0 = new com.google.crypto.tink.integration.android.AndroidKeystoreKmsClient
            r0.<init>()
            return r0
    }
}
