package com.google.crypto.tink.hybrid.internal;

/* JADX INFO: loaded from: classes.dex */
@com.google.errorprone.annotations.Immutable
final class HpkeEncrypt implements com.google.crypto.tink.HybridEncrypt {
    private static final byte[] EMPTY_ASSOCIATED_DATA = null;
    private final com.google.crypto.tink.hybrid.internal.HpkeAead aead;
    private final com.google.crypto.tink.hybrid.internal.HpkeKdf kdf;
    private final com.google.crypto.tink.hybrid.internal.HpkeKem kem;
    private final com.google.crypto.tink.proto.HpkePublicKey recipientPublicKey;

    static {
            r0 = 0
            byte[] r0 = new byte[r0]
            com.google.crypto.tink.hybrid.internal.HpkeEncrypt.EMPTY_ASSOCIATED_DATA = r0
            return
    }

    private HpkeEncrypt(com.google.crypto.tink.proto.HpkePublicKey r1, com.google.crypto.tink.hybrid.internal.HpkeKem r2, com.google.crypto.tink.hybrid.internal.HpkeKdf r3, com.google.crypto.tink.hybrid.internal.HpkeAead r4) {
            r0 = this;
            r0.<init>()
            r0.recipientPublicKey = r1
            r0.kem = r2
            r0.kdf = r3
            r0.aead = r4
            return
    }

    static com.google.crypto.tink.hybrid.internal.HpkeEncrypt createHpkeEncrypt(com.google.crypto.tink.proto.HpkePublicKey r5) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r5.getPublicKey()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L20
            com.google.crypto.tink.proto.HpkeParams r0 = r5.getParams()
            com.google.crypto.tink.hybrid.internal.HpkeKem r1 = com.google.crypto.tink.hybrid.internal.HpkePrimitiveFactory.createKem(r0)
            com.google.crypto.tink.hybrid.internal.HpkeKdf r2 = com.google.crypto.tink.hybrid.internal.HpkePrimitiveFactory.createKdf(r0)
            com.google.crypto.tink.hybrid.internal.HpkeAead r3 = com.google.crypto.tink.hybrid.internal.HpkePrimitiveFactory.createAead(r0)
            com.google.crypto.tink.hybrid.internal.HpkeEncrypt r4 = new com.google.crypto.tink.hybrid.internal.HpkeEncrypt
            r4.<init>(r5, r1, r2, r3)
            return r4
        L20:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "HpkePublicKey.public_key is empty."
            r0.<init>(r1)
            throw r0
    }

    @Override // com.google.crypto.tink.HybridEncrypt
    public byte[] encrypt(byte[] r6, byte[] r7) throws java.security.GeneralSecurityException {
            r5 = this;
            r0 = r7
            if (r0 != 0) goto L6
            r1 = 0
            byte[] r0 = new byte[r1]
        L6:
            com.google.crypto.tink.proto.HpkePublicKey r1 = r5.recipientPublicKey
            com.google.crypto.tink.hybrid.internal.HpkeKem r2 = r5.kem
            com.google.crypto.tink.hybrid.internal.HpkeKdf r3 = r5.kdf
            com.google.crypto.tink.hybrid.internal.HpkeAead r4 = r5.aead
            com.google.crypto.tink.hybrid.internal.HpkeContext r1 = com.google.crypto.tink.hybrid.internal.HpkeContext.createSenderContext(r1, r2, r3, r4, r0)
            byte[] r2 = com.google.crypto.tink.hybrid.internal.HpkeEncrypt.EMPTY_ASSOCIATED_DATA
            byte[] r2 = r1.seal(r6, r2)
            byte[] r3 = r1.getEncapsulatedKey()
            byte[][] r3 = new byte[][]{r3, r2}
            byte[] r3 = com.google.crypto.tink.subtle.Bytes.concat(r3)
            return r3
    }
}
