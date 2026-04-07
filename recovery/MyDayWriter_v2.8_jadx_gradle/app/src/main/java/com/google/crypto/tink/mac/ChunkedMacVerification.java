package com.google.crypto.tink.mac;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public interface ChunkedMacVerification {
    void update(ByteBuffer data) throws GeneralSecurityException;

    void verifyMac() throws GeneralSecurityException;
}
