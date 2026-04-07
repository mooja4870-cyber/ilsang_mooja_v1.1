package com.google.crypto.tink.signature;

/* JADX INFO: loaded from: classes.dex */
@com.google.errorprone.annotations.Immutable
public abstract class SignaturePrivateKey extends com.google.crypto.tink.Key implements com.google.crypto.tink.PrivateKey {
    public SignaturePrivateKey() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.crypto.tink.Key
    @javax.annotation.Nullable
    public java.lang.Integer getIdRequirementOrNull() {
            r1 = this;
            com.google.crypto.tink.signature.SignaturePublicKey r0 = r1.getPublicKey()
            java.lang.Integer r0 = r0.getIdRequirementOrNull()
            return r0
    }

    public final com.google.crypto.tink.util.Bytes getOutputPrefix() {
            r1 = this;
            com.google.crypto.tink.signature.SignaturePublicKey r0 = r1.getPublicKey()
            com.google.crypto.tink.util.Bytes r0 = r0.getOutputPrefix()
            return r0
    }

    @Override // com.google.crypto.tink.Key
    public /* bridge */ /* synthetic */ com.google.crypto.tink.Parameters getParameters() {
            r1 = this;
            com.google.crypto.tink.signature.SignatureParameters r0 = r1.getParameters()
            return r0
    }

    @Override // com.google.crypto.tink.Key
    public com.google.crypto.tink.signature.SignatureParameters getParameters() {
            r1 = this;
            com.google.crypto.tink.signature.SignaturePublicKey r0 = r1.getPublicKey()
            com.google.crypto.tink.signature.SignatureParameters r0 = r0.getParameters()
            return r0
    }

    public /* bridge */ /* synthetic */ com.google.crypto.tink.Key getPublicKey() {
            r1 = this;
            com.google.crypto.tink.signature.SignaturePublicKey r0 = r1.getPublicKey()
            return r0
    }

    public abstract com.google.crypto.tink.signature.SignaturePublicKey getPublicKey();
}
