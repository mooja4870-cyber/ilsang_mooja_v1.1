package com.google.crypto.tink.signature;

/* JADX INFO: loaded from: classes.dex */
@com.google.errorprone.annotations.Immutable
public abstract class SignaturePublicKey extends com.google.crypto.tink.Key {
    public SignaturePublicKey() {
            r0 = this;
            r0.<init>()
            return
    }

    public abstract com.google.crypto.tink.util.Bytes getOutputPrefix();

    @Override // com.google.crypto.tink.Key
    public /* bridge */ /* synthetic */ com.google.crypto.tink.Parameters getParameters() {
            r1 = this;
            com.google.crypto.tink.signature.SignatureParameters r0 = r1.getParameters()
            return r0
    }

    @Override // com.google.crypto.tink.Key
    public abstract com.google.crypto.tink.signature.SignatureParameters getParameters();
}
