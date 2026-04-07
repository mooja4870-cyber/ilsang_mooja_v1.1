package com.google.crypto.tink.mac.internal;

/* JADX INFO: loaded from: classes.dex */
final class ChunkedAesCmacComputation implements com.google.crypto.tink.mac.ChunkedMacComputation {
    private static final byte[] FORMAT_VERSION = null;
    private final javax.crypto.Cipher aes;
    private boolean finalized;
    private final com.google.crypto.tink.mac.AesCmacKey key;
    private final java.nio.ByteBuffer localStash;
    private final byte[] subKey1;
    private final byte[] subKey2;
    private final java.nio.ByteBuffer x;
    private final java.nio.ByteBuffer y;

    static {
            r0 = 1
            byte[] r0 = new byte[r0]
            r1 = 0
            r0[r1] = r1
            com.google.crypto.tink.mac.internal.ChunkedAesCmacComputation.FORMAT_VERSION = r0
            return
    }

    ChunkedAesCmacComputation(com.google.crypto.tink.mac.AesCmacKey r5) throws java.security.GeneralSecurityException {
            r4 = this;
            r4.<init>()
            r0 = 0
            r4.finalized = r0
            r4.key = r5
            com.google.crypto.tink.subtle.EngineFactory<com.google.crypto.tink.subtle.EngineWrapper$TCipher, javax.crypto.Cipher> r0 = com.google.crypto.tink.subtle.EngineFactory.CIPHER
            java.lang.String r1 = "AES/ECB/NoPadding"
            java.lang.Object r0 = r0.getInstance(r1)
            javax.crypto.Cipher r0 = (javax.crypto.Cipher) r0
            r4.aes = r0
            javax.crypto.Cipher r0 = r4.aes
            javax.crypto.spec.SecretKeySpec r1 = new javax.crypto.spec.SecretKeySpec
            com.google.crypto.tink.mac.AesCmacKey r2 = r4.key
            com.google.crypto.tink.util.SecretBytes r2 = r2.getAesKey()
            com.google.crypto.tink.SecretKeyAccess r3 = com.google.crypto.tink.InsecureSecretKeyAccess.get()
            byte[] r2 = r2.toByteArray(r3)
            java.lang.String r3 = "AES"
            r1.<init>(r2, r3)
            r2 = 1
            r0.init(r2, r1)
            r0 = 16
            byte[] r1 = new byte[r0]
            javax.crypto.Cipher r2 = r4.aes
            byte[] r2 = r2.doFinal(r1)
            byte[] r3 = com.google.crypto.tink.mac.internal.AesUtil.dbl(r2)
            r4.subKey1 = r3
            byte[] r3 = r4.subKey1
            byte[] r3 = com.google.crypto.tink.mac.internal.AesUtil.dbl(r3)
            r4.subKey2 = r3
            java.nio.ByteBuffer r3 = java.nio.ByteBuffer.allocate(r0)
            r4.localStash = r3
            java.nio.ByteBuffer r3 = java.nio.ByteBuffer.allocate(r0)
            r4.x = r3
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
            r4.y = r0
            return
    }

    private void munch(java.nio.ByteBuffer r4) throws java.security.GeneralSecurityException {
            r3 = this;
            java.nio.ByteBuffer r0 = r3.y
            r0.rewind()
            java.nio.ByteBuffer r0 = r3.x
            r0.rewind()
            java.nio.ByteBuffer r0 = r3.y
            java.nio.ByteBuffer r1 = r3.x
            r2 = 16
            com.google.crypto.tink.subtle.Bytes.xor(r0, r1, r4, r2)
            java.nio.ByteBuffer r0 = r3.y
            r0.rewind()
            java.nio.ByteBuffer r0 = r3.x
            r0.rewind()
            javax.crypto.Cipher r0 = r3.aes
            java.nio.ByteBuffer r1 = r3.y
            java.nio.ByteBuffer r2 = r3.x
            r0.doFinal(r1, r2)
            return
    }

    @Override // com.google.crypto.tink.mac.ChunkedMacComputation
    public byte[] computeMac() throws java.security.GeneralSecurityException {
            r4 = this;
            boolean r0 = r4.finalized
            if (r0 != 0) goto L81
            com.google.crypto.tink.mac.AesCmacKey r0 = r4.key
            com.google.crypto.tink.mac.AesCmacParameters r0 = r0.getParameters()
            com.google.crypto.tink.mac.AesCmacParameters$Variant r0 = r0.getVariant()
            com.google.crypto.tink.mac.AesCmacParameters$Variant r1 = com.google.crypto.tink.mac.AesCmacParameters.Variant.LEGACY
            if (r0 != r1) goto L1b
            byte[] r0 = com.google.crypto.tink.mac.internal.ChunkedAesCmacComputation.FORMAT_VERSION
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r0)
            r4.update(r0)
        L1b:
            r0 = 1
            r4.finalized = r0
            java.nio.ByteBuffer r0 = r4.localStash
            int r0 = r0.remaining()
            if (r0 <= 0) goto L41
            java.nio.ByteBuffer r0 = r4.localStash
            byte[] r0 = r0.array()
            java.nio.ByteBuffer r1 = r4.localStash
            int r1 = r1.position()
            byte[] r0 = java.util.Arrays.copyOf(r0, r1)
            byte[] r1 = com.google.crypto.tink.mac.internal.AesUtil.cmacPad(r0)
            byte[] r2 = r4.subKey2
            byte[] r0 = com.google.crypto.tink.subtle.Bytes.xor(r1, r2)
            goto L50
        L41:
            java.nio.ByteBuffer r0 = r4.localStash
            byte[] r0 = r0.array()
            byte[] r1 = r4.subKey1
            r2 = 16
            r3 = 0
            byte[] r0 = com.google.crypto.tink.subtle.Bytes.xor(r0, r3, r1, r3, r2)
        L50:
            com.google.crypto.tink.mac.AesCmacKey r1 = r4.key
            com.google.crypto.tink.util.Bytes r1 = r1.getOutputPrefix()
            byte[] r1 = r1.toByteArray()
            javax.crypto.Cipher r2 = r4.aes
            java.nio.ByteBuffer r3 = r4.x
            byte[] r3 = r3.array()
            byte[] r3 = com.google.crypto.tink.subtle.Bytes.xor(r0, r3)
            byte[] r2 = r2.doFinal(r3)
            com.google.crypto.tink.mac.AesCmacKey r3 = r4.key
            com.google.crypto.tink.mac.AesCmacParameters r3 = r3.getParameters()
            int r3 = r3.getCryptographicTagSizeBytes()
            byte[] r2 = java.util.Arrays.copyOf(r2, r3)
            byte[][] r1 = new byte[][]{r1, r2}
            byte[] r1 = com.google.crypto.tink.subtle.Bytes.concat(r1)
            return r1
        L81:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Can not compute after computing the MAC tag. Please create a new object."
            r0.<init>(r1)
            throw r0
    }

    @Override // com.google.crypto.tink.mac.ChunkedMacComputation
    public void update(java.nio.ByteBuffer r6) throws java.security.GeneralSecurityException {
            r5 = this;
            boolean r0 = r5.finalized
            if (r0 != 0) goto L58
            java.nio.ByteBuffer r0 = r5.localStash
            int r0 = r0.remaining()
            r1 = 16
            if (r0 == r1) goto L2b
            java.nio.ByteBuffer r0 = r5.localStash
            int r0 = r0.remaining()
            int r2 = r6.remaining()
            int r0 = java.lang.Math.min(r0, r2)
            r2 = 0
        L1d:
            if (r2 >= r0) goto L2b
            java.nio.ByteBuffer r3 = r5.localStash
            byte r4 = r6.get()
            r3.put(r4)
            int r2 = r2 + 1
            goto L1d
        L2b:
            java.nio.ByteBuffer r0 = r5.localStash
            int r0 = r0.remaining()
            if (r0 != 0) goto L48
            int r0 = r6.remaining()
            if (r0 <= 0) goto L48
            java.nio.ByteBuffer r0 = r5.localStash
            r0.rewind()
            java.nio.ByteBuffer r0 = r5.localStash
            r5.munch(r0)
            java.nio.ByteBuffer r0 = r5.localStash
            r0.rewind()
        L48:
            int r0 = r6.remaining()
            if (r0 <= r1) goto L52
            r5.munch(r6)
            goto L48
        L52:
            java.nio.ByteBuffer r0 = r5.localStash
            r0.put(r6)
            return
        L58:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Can not update after computing the MAC tag. Please create a new object."
            r0.<init>(r1)
            throw r0
    }
}
