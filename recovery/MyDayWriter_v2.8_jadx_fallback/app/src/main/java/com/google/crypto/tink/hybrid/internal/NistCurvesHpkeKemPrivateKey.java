package com.google.crypto.tink.hybrid.internal;

/* JADX INFO: loaded from: classes.dex */
@com.google.errorprone.annotations.Immutable
final class NistCurvesHpkeKemPrivateKey implements com.google.crypto.tink.hybrid.internal.HpkeKemPrivateKey {
    private final com.google.crypto.tink.util.Bytes privateKey;
    private final com.google.crypto.tink.util.Bytes publicKey;

    private NistCurvesHpkeKemPrivateKey(byte[] r2, byte[] r3) {
            r1 = this;
            r1.<init>()
            com.google.crypto.tink.util.Bytes r0 = com.google.crypto.tink.util.Bytes.copyFrom(r2)
            r1.privateKey = r0
            com.google.crypto.tink.util.Bytes r0 = com.google.crypto.tink.util.Bytes.copyFrom(r3)
            r1.publicKey = r0
            return
    }

    static com.google.crypto.tink.hybrid.internal.NistCurvesHpkeKemPrivateKey fromBytes(byte[] r2, byte[] r3, com.google.crypto.tink.subtle.EllipticCurves.CurveType r4) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.subtle.EllipticCurves$PointFormatType r0 = com.google.crypto.tink.subtle.EllipticCurves.PointFormatType.UNCOMPRESSED
            java.security.interfaces.ECPublicKey r0 = com.google.crypto.tink.subtle.EllipticCurves.getEcPublicKey(r4, r0, r3)
            java.security.interfaces.ECPrivateKey r1 = com.google.crypto.tink.subtle.EllipticCurves.getEcPrivateKey(r4, r2)
            com.google.crypto.tink.subtle.EllipticCurves.validatePublicKey(r0, r1)
            com.google.crypto.tink.hybrid.internal.NistCurvesHpkeKemPrivateKey r0 = new com.google.crypto.tink.hybrid.internal.NistCurvesHpkeKemPrivateKey
            r0.<init>(r2, r3)
            return r0
    }

    @Override // com.google.crypto.tink.hybrid.internal.HpkeKemPrivateKey
    public com.google.crypto.tink.util.Bytes getSerializedPrivate() {
            r1 = this;
            com.google.crypto.tink.util.Bytes r0 = r1.privateKey
            return r0
    }

    @Override // com.google.crypto.tink.hybrid.internal.HpkeKemPrivateKey
    public com.google.crypto.tink.util.Bytes getSerializedPublic() {
            r1 = this;
            com.google.crypto.tink.util.Bytes r0 = r1.publicKey
            return r0
    }
}
