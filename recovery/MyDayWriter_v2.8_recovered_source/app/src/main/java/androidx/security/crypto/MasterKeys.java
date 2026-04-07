package androidx.security.crypto;

/* JADX INFO: loaded from: classes.dex */
@java.lang.Deprecated
public final class MasterKeys {
    public static final android.security.keystore.KeyGenParameterSpec AES256_GCM_SPEC = null;
    private static final java.lang.String ANDROID_KEYSTORE = "AndroidKeyStore";
    static final int KEY_SIZE = 256;
    static final java.lang.String MASTER_KEY_ALIAS = "_androidx_security_master_key_";
    private static final java.lang.Object sLock = null;

    static {
            java.lang.String r0 = "_androidx_security_master_key_"
            android.security.keystore.KeyGenParameterSpec r0 = createAES256GCMKeyGenParameterSpec(r0)
            androidx.security.crypto.MasterKeys.AES256_GCM_SPEC = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            androidx.security.crypto.MasterKeys.sLock = r0
            return
    }

    private MasterKeys() {
            r0 = this;
            r0.<init>()
            return
    }

    private static android.security.keystore.KeyGenParameterSpec createAES256GCMKeyGenParameterSpec(java.lang.String r5) {
            android.security.keystore.KeyGenParameterSpec$Builder r0 = new android.security.keystore.KeyGenParameterSpec$Builder
            r1 = 3
            r0.<init>(r5, r1)
            r1 = 1
            java.lang.String[] r2 = new java.lang.String[r1]
            java.lang.String r3 = "GCM"
            r4 = 0
            r2[r4] = r3
            android.security.keystore.KeyGenParameterSpec$Builder r0 = r0.setBlockModes(r2)
            java.lang.String[] r1 = new java.lang.String[r1]
            java.lang.String r2 = "NoPadding"
            r1[r4] = r2
            android.security.keystore.KeyGenParameterSpec$Builder r0 = r0.setEncryptionPaddings(r1)
            r1 = 256(0x100, float:3.59E-43)
            android.security.keystore.KeyGenParameterSpec$Builder r0 = r0.setKeySize(r1)
            android.security.keystore.KeyGenParameterSpec r1 = r0.build()
            return r1
    }

    private static void generateKey(android.security.keystore.KeyGenParameterSpec r3) throws java.security.GeneralSecurityException {
            java.lang.String r0 = "AES"
            java.lang.String r1 = "AndroidKeyStore"
            javax.crypto.KeyGenerator r0 = javax.crypto.KeyGenerator.getInstance(r0, r1)     // Catch: java.security.ProviderException -> L10
            r0.init(r3)     // Catch: java.security.ProviderException -> L10
            r0.generateKey()     // Catch: java.security.ProviderException -> L10
            return
        L10:
            r0 = move-exception
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException
            java.lang.String r2 = r0.getMessage()
            r1.<init>(r2, r0)
            throw r1
    }

    public static java.lang.String getOrCreate(android.security.keystore.KeyGenParameterSpec r2) throws java.security.GeneralSecurityException, java.io.IOException {
            validate(r2)
            java.lang.Object r0 = androidx.security.crypto.MasterKeys.sLock
            monitor-enter(r0)
            java.lang.String r1 = r2.getKeystoreAlias()     // Catch: java.lang.Throwable -> L19
            boolean r1 = keyExists(r1)     // Catch: java.lang.Throwable -> L19
            if (r1 != 0) goto L13
            generateKey(r2)     // Catch: java.lang.Throwable -> L19
        L13:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
            java.lang.String r0 = r2.getKeystoreAlias()
            return r0
        L19:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
            throw r1
    }

    private static boolean keyExists(java.lang.String r2) throws java.security.GeneralSecurityException, java.io.IOException {
            java.lang.String r0 = "AndroidKeyStore"
            java.security.KeyStore r0 = java.security.KeyStore.getInstance(r0)
            r1 = 0
            r0.load(r1)
            boolean r1 = r0.containsAlias(r2)
            return r1
    }

    static void validate(android.security.keystore.KeyGenParameterSpec r5) {
            int r0 = r5.getKeySize()
            r1 = 256(0x100, float:3.59E-43)
            if (r0 != r1) goto La6
            java.lang.String[] r0 = r5.getBlockModes()
            r1 = 1
            java.lang.String[] r2 = new java.lang.String[r1]
            java.lang.String r3 = "GCM"
            r4 = 0
            r2[r4] = r3
            boolean r0 = java.util.Arrays.equals(r0, r2)
            if (r0 == 0) goto L85
            int r0 = r5.getPurposes()
            r2 = 3
            if (r0 != r2) goto L68
            java.lang.String[] r0 = r5.getEncryptionPaddings()
            java.lang.String[] r2 = new java.lang.String[r1]
            java.lang.String r3 = "NoPadding"
            r2[r4] = r3
            boolean r0 = java.util.Arrays.equals(r0, r2)
            if (r0 == 0) goto L47
            boolean r0 = r5.isUserAuthenticationRequired()
            if (r0 == 0) goto L46
            int r0 = r5.getUserAuthenticationValidityDurationSeconds()
            if (r0 < r1) goto L3e
            goto L46
        L3e:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "per-operation authentication is not supported (UserAuthenticationValidityDurationSeconds must be >0)"
            r0.<init>(r1)
            throw r0
        L46:
            return
        L47:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "invalid padding mode, want NoPadding got "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String[] r2 = r5.getEncryptionPaddings()
            java.lang.String r2 = java.util.Arrays.toString(r2)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L68:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "invalid purposes mode, want PURPOSE_ENCRYPT | PURPOSE_DECRYPT got "
            java.lang.StringBuilder r1 = r1.append(r2)
            int r2 = r5.getPurposes()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L85:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "invalid block mode, want GCM got "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String[] r2 = r5.getBlockModes()
            java.lang.String r2 = java.util.Arrays.toString(r2)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        La6:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "invalid key size, want 256 bits got "
            java.lang.StringBuilder r1 = r1.append(r2)
            int r2 = r5.getKeySize()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " bits"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }
}
