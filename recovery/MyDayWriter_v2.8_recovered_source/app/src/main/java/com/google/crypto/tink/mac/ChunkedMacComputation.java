package com.google.crypto.tink.mac;

/* JADX INFO: loaded from: classes.dex */
public interface ChunkedMacComputation {
    byte[] computeMac() throws java.security.GeneralSecurityException;

    void update(java.nio.ByteBuffer r1) throws java.security.GeneralSecurityException;
}
