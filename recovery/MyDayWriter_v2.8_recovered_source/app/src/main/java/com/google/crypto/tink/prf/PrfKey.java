package com.google.crypto.tink.prf;

/* JADX INFO: loaded from: classes.dex */
public abstract class PrfKey extends com.google.crypto.tink.Key {
    public PrfKey() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.crypto.tink.Key
    public /* bridge */ /* synthetic */ com.google.crypto.tink.Parameters getParameters() {
            r1 = this;
            com.google.crypto.tink.prf.PrfParameters r0 = r1.getParameters()
            return r0
    }

    @Override // com.google.crypto.tink.Key
    public abstract com.google.crypto.tink.prf.PrfParameters getParameters();
}
