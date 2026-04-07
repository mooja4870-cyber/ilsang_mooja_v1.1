package com.google.crypto.tink;

/* JADX INFO: loaded from: classes.dex */
public class PrivilegedRegistry {
    private PrivilegedRegistry() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.crypto.tink.proto.KeyData deriveKey(com.google.crypto.tink.proto.KeyTemplate r1, java.io.InputStream r2) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.proto.KeyData r0 = com.google.crypto.tink.Registry.deriveKey(r1, r2)
            return r0
    }

    public static com.google.crypto.tink.shaded.protobuf.MessageLite parseKeyData(com.google.crypto.tink.proto.KeyData r1) throws java.security.GeneralSecurityException, com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            com.google.crypto.tink.shaded.protobuf.MessageLite r0 = com.google.crypto.tink.Registry.parseKeyData(r1)
            return r0
    }
}
