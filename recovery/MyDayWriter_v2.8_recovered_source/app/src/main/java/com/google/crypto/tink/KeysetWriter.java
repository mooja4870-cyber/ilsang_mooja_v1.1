package com.google.crypto.tink;

/* JADX INFO: loaded from: classes.dex */
public interface KeysetWriter {
    void write(com.google.crypto.tink.proto.EncryptedKeyset r1) throws java.io.IOException;

    void write(com.google.crypto.tink.proto.Keyset r1) throws java.io.IOException;
}
