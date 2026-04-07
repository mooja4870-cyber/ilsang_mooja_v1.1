package com.google.crypto.tink.integration.android;

/* JADX INFO: loaded from: classes.dex */
public final class AndroidKeystoreAesGcm implements com.google.crypto.tink.Aead {
    private static final int IV_SIZE_IN_BYTES = 12;
    private static final int MAX_WAIT_TIME_MILLISECONDS_BEFORE_RETRY = 100;
    private static final java.lang.String TAG = null;
    private static final int TAG_SIZE_IN_BYTES = 16;
    private final javax.crypto.SecretKey key;

    static {
            java.lang.Class<com.google.crypto.tink.integration.android.AndroidKeystoreAesGcm> r0 = com.google.crypto.tink.integration.android.AndroidKeystoreAesGcm.class
            java.lang.String r0 = r0.getSimpleName()
            com.google.crypto.tink.integration.android.AndroidKeystoreAesGcm.TAG = r0
            return
    }

    public AndroidKeystoreAesGcm(java.lang.String r5) throws java.security.GeneralSecurityException, java.io.IOException {
            r4 = this;
            r4.<init>()
            java.lang.String r0 = "AndroidKeyStore"
            java.security.KeyStore r0 = java.security.KeyStore.getInstance(r0)
            r1 = 0
            r0.load(r1)
            java.security.Key r1 = r0.getKey(r5, r1)
            javax.crypto.SecretKey r1 = (javax.crypto.SecretKey) r1
            r4.key = r1
            javax.crypto.SecretKey r1 = r4.key
            if (r1 == 0) goto L1a
            return
        L1a:
            java.security.InvalidKeyException r1 = new java.security.InvalidKeyException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Keystore cannot load the key with ID: "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r5)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    AndroidKeystoreAesGcm(java.lang.String r4, java.security.KeyStore r5) throws java.security.GeneralSecurityException {
            r3 = this;
            r3.<init>()
            r0 = 0
            java.security.Key r0 = r5.getKey(r4, r0)
            javax.crypto.SecretKey r0 = (javax.crypto.SecretKey) r0
            r3.key = r0
            javax.crypto.SecretKey r0 = r3.key
            if (r0 == 0) goto L11
            return
        L11:
            java.security.InvalidKeyException r0 = new java.security.InvalidKeyException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Keystore cannot load the key with ID: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r4)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    private byte[] decryptInternal(byte[] r6, byte[] r7) throws java.security.GeneralSecurityException {
            r5 = this;
            javax.crypto.spec.GCMParameterSpec r0 = new javax.crypto.spec.GCMParameterSpec
            r1 = 128(0x80, float:1.8E-43)
            r2 = 0
            r3 = 12
            r0.<init>(r1, r6, r2, r3)
            java.lang.String r1 = "AES/GCM/NoPadding"
            javax.crypto.Cipher r1 = javax.crypto.Cipher.getInstance(r1)
            r2 = 2
            javax.crypto.SecretKey r4 = r5.key
            r1.init(r2, r4, r0)
            r1.updateAAD(r7)
            int r2 = r6.length
            int r2 = r2 - r3
            byte[] r2 = r1.doFinal(r6, r3, r2)
            return r2
    }

    private byte[] encryptInternal(byte[] r9, byte[] r10) throws java.security.GeneralSecurityException {
            r8 = this;
            int r0 = r9.length
            r1 = 2147483619(0x7fffffe3, float:NaN)
            if (r0 > r1) goto L2e
            int r0 = r9.length
            r1 = 12
            int r0 = r0 + r1
            int r0 = r0 + 16
            byte[] r6 = new byte[r0]
            java.lang.String r0 = "AES/GCM/NoPadding"
            javax.crypto.Cipher r2 = javax.crypto.Cipher.getInstance(r0)
            r0 = 1
            javax.crypto.SecretKey r3 = r8.key
            r2.init(r0, r3)
            r2.updateAAD(r10)
            int r5 = r9.length
            r4 = 0
            r7 = 12
            r3 = r9
            int r9 = r2.doFinal(r3, r4, r5, r6, r7)
            byte[] r0 = r2.getIV()
            java.lang.System.arraycopy(r0, r4, r6, r4, r1)
            return r6
        L2e:
            r3 = r9
            java.security.GeneralSecurityException r9 = new java.security.GeneralSecurityException
            java.lang.String r0 = "plaintext too long"
            r9.<init>(r0)
            throw r9
    }

    private static void sleepRandomAmount() {
            double r0 = java.lang.Math.random()
            r2 = 4636737291354636288(0x4059000000000000, double:100.0)
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

    @Override // com.google.crypto.tink.Aead
    public byte[] decrypt(byte[] r4, byte[] r5) throws java.security.GeneralSecurityException {
            r3 = this;
            int r0 = r4.length
            r1 = 28
            if (r0 < r1) goto L1e
            byte[] r0 = r3.decryptInternal(r4, r5)     // Catch: java.security.GeneralSecurityException -> La java.security.ProviderException -> Lc javax.crypto.AEADBadTagException -> L1c
            return r0
        La:
            r0 = move-exception
            goto Ld
        Lc:
            r0 = move-exception
        Ld:
            java.lang.String r1 = com.google.crypto.tink.integration.android.AndroidKeystoreAesGcm.TAG
            java.lang.String r2 = "encountered a potentially transient KeyStore error, will wait and retry"
            android.util.Log.w(r1, r2, r0)
            sleepRandomAmount()
            byte[] r1 = r3.decryptInternal(r4, r5)
            return r1
        L1c:
            r0 = move-exception
            throw r0
        L1e:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "ciphertext too short"
            r0.<init>(r1)
            throw r0
    }

    @Override // com.google.crypto.tink.Aead
    public byte[] encrypt(byte[] r4, byte[] r5) throws java.security.GeneralSecurityException {
            r3 = this;
            byte[] r0 = r3.encryptInternal(r4, r5)     // Catch: java.security.GeneralSecurityException -> L5 java.security.ProviderException -> L7
            return r0
        L5:
            r0 = move-exception
            goto L8
        L7:
            r0 = move-exception
        L8:
            java.lang.String r1 = com.google.crypto.tink.integration.android.AndroidKeystoreAesGcm.TAG
            java.lang.String r2 = "encountered a potentially transient KeyStore error, will wait and retry"
            android.util.Log.w(r1, r2, r0)
            sleepRandomAmount()
            byte[] r1 = r3.encryptInternal(r4, r5)
            return r1
    }
}
