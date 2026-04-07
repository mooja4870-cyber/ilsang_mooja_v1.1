package com.google.crypto.tink.hybrid.internal;

/* JADX INFO: loaded from: classes.dex */
final class HpkeContext {
    private static final byte[] EMPTY_IKM = null;
    private final com.google.crypto.tink.hybrid.internal.HpkeAead aead;
    private final byte[] baseNonce;
    private final byte[] encapsulatedKey;
    private final byte[] key;
    private final java.math.BigInteger maxSequenceNumber;
    private java.math.BigInteger sequenceNumber;

    static {
            r0 = 0
            byte[] r0 = new byte[r0]
            com.google.crypto.tink.hybrid.internal.HpkeContext.EMPTY_IKM = r0
            return
    }

    private HpkeContext(byte[] r2, byte[] r3, byte[] r4, java.math.BigInteger r5, com.google.crypto.tink.hybrid.internal.HpkeAead r6) {
            r1 = this;
            r1.<init>()
            r1.encapsulatedKey = r2
            r1.key = r3
            r1.baseNonce = r4
            java.math.BigInteger r0 = java.math.BigInteger.ZERO
            r1.sequenceNumber = r0
            r1.maxSequenceNumber = r5
            r1.aead = r6
            return
    }

    private byte[] computeNonce() throws java.security.GeneralSecurityException {
            r3 = this;
            byte[] r0 = r3.baseNonce
            java.math.BigInteger r1 = r3.sequenceNumber
            com.google.crypto.tink.hybrid.internal.HpkeAead r2 = r3.aead
            int r2 = r2.getNonceLength()
            byte[] r1 = com.google.crypto.tink.internal.BigIntegerEncoding.toBigEndianBytesOfFixedLength(r1, r2)
            byte[] r0 = com.google.crypto.tink.subtle.Bytes.xor(r0, r1)
            return r0
    }

    private synchronized byte[] computeNonceAndIncrementSequenceNumber() throws java.security.GeneralSecurityException {
            r1 = this;
            monitor-enter(r1)
            byte[] r0 = r1.computeNonce()     // Catch: java.lang.Throwable -> La
            r1.incrementSequenceNumber()     // Catch: java.lang.Throwable -> La
            monitor-exit(r1)
            return r0
        La:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> La
            throw r0
    }

    static com.google.crypto.tink.hybrid.internal.HpkeContext createContext(byte[] r16, byte[] r17, com.google.crypto.tink.hybrid.internal.HpkeKem r18, com.google.crypto.tink.hybrid.internal.HpkeKdf r19, com.google.crypto.tink.hybrid.internal.HpkeAead r20, byte[] r21) throws java.security.GeneralSecurityException {
            r0 = r19
            byte[] r1 = r18.getKemId()
            byte[] r2 = r0.getKdfId()
            byte[] r3 = r20.getAeadId()
            byte[] r4 = com.google.crypto.tink.hybrid.internal.HpkeUtil.hpkeSuiteId(r1, r2, r3)
            byte[] r1 = com.google.crypto.tink.hybrid.internal.HpkeUtil.EMPTY_SALT
            byte[] r2 = com.google.crypto.tink.hybrid.internal.HpkeContext.EMPTY_IKM
            java.lang.String r3 = "psk_id_hash"
            byte[] r6 = r0.labeledExtract(r1, r2, r3, r4)
            byte[] r1 = com.google.crypto.tink.hybrid.internal.HpkeUtil.EMPTY_SALT
            java.lang.String r2 = "info_hash"
            r7 = r21
            byte[] r8 = r0.labeledExtract(r1, r7, r2, r4)
            byte[] r1 = com.google.crypto.tink.hybrid.internal.HpkeUtil.BASE_MODE
            byte[][] r1 = new byte[][]{r1, r6, r8}
            byte[] r2 = com.google.crypto.tink.subtle.Bytes.concat(r1)
            byte[] r1 = com.google.crypto.tink.hybrid.internal.HpkeContext.EMPTY_IKM
            java.lang.String r3 = "secret"
            r9 = r17
            byte[] r1 = r0.labeledExtract(r9, r1, r3, r4)
            java.lang.String r3 = "key"
            int r5 = r20.getKeyLength()
            byte[] r12 = r0.labeledExpand(r1, r2, r3, r4, r5)
            int r5 = r20.getNonceLength()
            java.lang.String r3 = "base_nonce"
            byte[] r13 = r0.labeledExpand(r1, r2, r3, r4, r5)
            int r0 = r20.getNonceLength()
            java.math.BigInteger r14 = maxSequenceNumber(r0)
            com.google.crypto.tink.hybrid.internal.HpkeContext r10 = new com.google.crypto.tink.hybrid.internal.HpkeContext
            r11 = r16
            r15 = r20
            r10.<init>(r11, r12, r13, r14, r15)
            return r10
    }

    static com.google.crypto.tink.hybrid.internal.HpkeContext createRecipientContext(byte[] r6, com.google.crypto.tink.hybrid.internal.HpkeKemPrivateKey r7, com.google.crypto.tink.hybrid.internal.HpkeKem r8, com.google.crypto.tink.hybrid.internal.HpkeKdf r9, com.google.crypto.tink.hybrid.internal.HpkeAead r10, byte[] r11) throws java.security.GeneralSecurityException {
            byte[] r1 = r8.decapsulate(r6, r7)
            r0 = r6
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            com.google.crypto.tink.hybrid.internal.HpkeContext r6 = createContext(r0, r1, r2, r3, r4, r5)
            return r6
    }

    static com.google.crypto.tink.hybrid.internal.HpkeContext createSenderContext(com.google.crypto.tink.proto.HpkePublicKey r7, com.google.crypto.tink.hybrid.internal.HpkeKem r8, com.google.crypto.tink.hybrid.internal.HpkeKdf r9, com.google.crypto.tink.hybrid.internal.HpkeAead r10, byte[] r11) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r7.getPublicKey()
            byte[] r0 = r0.toByteArray()
            com.google.crypto.tink.hybrid.internal.HpkeKemEncapOutput r0 = r8.encapsulate(r0)
            byte[] r1 = r0.getEncapsulatedKey()
            byte[] r2 = r0.getSharedSecret()
            r3 = r8
            r4 = r9
            r5 = r10
            r6 = r11
            com.google.crypto.tink.hybrid.internal.HpkeContext r8 = createContext(r1, r2, r3, r4, r5, r6)
            return r8
    }

    private void incrementSequenceNumber() throws java.security.GeneralSecurityException {
            r2 = this;
            java.math.BigInteger r0 = r2.sequenceNumber
            java.math.BigInteger r1 = r2.maxSequenceNumber
            int r0 = r0.compareTo(r1)
            if (r0 >= 0) goto L15
            java.math.BigInteger r0 = r2.sequenceNumber
            java.math.BigInteger r1 = java.math.BigInteger.ONE
            java.math.BigInteger r0 = r0.add(r1)
            r2.sequenceNumber = r0
            return
        L15:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "message limit reached"
            r0.<init>(r1)
            throw r0
    }

    private static java.math.BigInteger maxSequenceNumber(int r2) {
            java.math.BigInteger r0 = java.math.BigInteger.ONE
            int r1 = r2 * 8
            java.math.BigInteger r0 = r0.shiftLeft(r1)
            java.math.BigInteger r1 = java.math.BigInteger.ONE
            java.math.BigInteger r0 = r0.subtract(r1)
            return r0
    }

    byte[] getBaseNonce() {
            r1 = this;
            byte[] r0 = r1.baseNonce
            return r0
    }

    byte[] getEncapsulatedKey() {
            r1 = this;
            byte[] r0 = r1.encapsulatedKey
            return r0
    }

    byte[] getKey() {
            r1 = this;
            byte[] r0 = r1.key
            return r0
    }

    byte[] open(byte[] r4, byte[] r5) throws java.security.GeneralSecurityException {
            r3 = this;
            byte[] r0 = r3.computeNonceAndIncrementSequenceNumber()
            com.google.crypto.tink.hybrid.internal.HpkeAead r1 = r3.aead
            byte[] r2 = r3.key
            byte[] r1 = r1.open(r2, r0, r4, r5)
            return r1
    }

    byte[] seal(byte[] r4, byte[] r5) throws java.security.GeneralSecurityException {
            r3 = this;
            byte[] r0 = r3.computeNonceAndIncrementSequenceNumber()
            com.google.crypto.tink.hybrid.internal.HpkeAead r1 = r3.aead
            byte[] r2 = r3.key
            byte[] r1 = r1.seal(r2, r0, r4, r5)
            return r1
    }
}
