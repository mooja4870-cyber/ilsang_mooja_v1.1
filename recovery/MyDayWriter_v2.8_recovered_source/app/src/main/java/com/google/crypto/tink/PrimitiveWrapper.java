package com.google.crypto.tink;

/* JADX INFO: loaded from: classes.dex */
public interface PrimitiveWrapper<B, P> {
    java.lang.Class<B> getInputPrimitiveClass();

    java.lang.Class<P> getPrimitiveClass();

    P wrap(com.google.crypto.tink.PrimitiveSet<B> r1) throws java.security.GeneralSecurityException;
}
