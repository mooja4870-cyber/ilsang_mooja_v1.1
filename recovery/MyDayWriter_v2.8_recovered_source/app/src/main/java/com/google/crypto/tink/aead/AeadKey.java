package com.google.crypto.tink.aead;

/* JADX INFO: loaded from: classes.dex */
public abstract class AeadKey extends com.google.crypto.tink.Key {
    public AeadKey() {
            r0 = this;
            r0.<init>()
            return
    }

    public abstract com.google.crypto.tink.util.Bytes getOutputPrefix();

    @Override // com.google.crypto.tink.Key
    public /* bridge */ /* synthetic */ com.google.crypto.tink.Parameters getParameters() {
            r1 = this;
            com.google.crypto.tink.aead.AeadParameters r0 = r1.getParameters()
            return r0
    }

    @Override // com.google.crypto.tink.Key
    public abstract com.google.crypto.tink.aead.AeadParameters getParameters();
}
