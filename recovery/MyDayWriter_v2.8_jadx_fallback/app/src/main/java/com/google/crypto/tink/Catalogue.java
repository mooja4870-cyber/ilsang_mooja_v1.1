package com.google.crypto.tink;

/* JADX INFO: loaded from: classes.dex */
@java.lang.Deprecated
public interface Catalogue<P> {
    com.google.crypto.tink.KeyManager<P> getKeyManager(java.lang.String r1, java.lang.String r2, int r3) throws java.security.GeneralSecurityException;

    com.google.crypto.tink.PrimitiveWrapper<?, P> getPrimitiveWrapper() throws java.security.GeneralSecurityException;
}
