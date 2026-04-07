package com.google.crypto.tink;

/* JADX INFO: loaded from: classes.dex */
public interface KeysetReader {
    com.google.crypto.tink.proto.Keyset read() throws java.io.IOException;

    com.google.crypto.tink.proto.EncryptedKeyset readEncrypted() throws java.io.IOException;
}
