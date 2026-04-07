package com.google.crypto.tink;

/* JADX INFO: loaded from: classes.dex */
@java.lang.Deprecated
public final class NoSecretKeysetHandle {
    private NoSecretKeysetHandle() {
            r0 = this;
            r0.<init>()
            return
    }

    @java.lang.Deprecated
    public static final com.google.crypto.tink.KeysetHandle parseFrom(byte[] r3) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r0 = com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry()     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L10
            com.google.crypto.tink.proto.Keyset r0 = com.google.crypto.tink.proto.Keyset.parseFrom(r3, r0)     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L10
            validate(r0)     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L10
            com.google.crypto.tink.KeysetHandle r1 = com.google.crypto.tink.KeysetHandle.fromKeyset(r0)     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L10
            return r1
        L10:
            r0 = move-exception
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException
            java.lang.String r2 = "invalid keyset"
            r1.<init>(r2)
            throw r1
    }

    public static final com.google.crypto.tink.KeysetHandle read(com.google.crypto.tink.KeysetReader r2) throws java.security.GeneralSecurityException, java.io.IOException {
            com.google.crypto.tink.proto.Keyset r0 = r2.read()
            validate(r0)
            com.google.crypto.tink.KeysetHandle r1 = com.google.crypto.tink.KeysetHandle.fromKeyset(r0)
            return r1
    }

    private static void validate(com.google.crypto.tink.proto.Keyset r4) throws java.security.GeneralSecurityException {
            java.util.List r0 = r4.getKeyList()
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L41
            java.lang.Object r1 = r0.next()
            com.google.crypto.tink.proto.Keyset$Key r1 = (com.google.crypto.tink.proto.Keyset.Key) r1
            com.google.crypto.tink.proto.KeyData r2 = r1.getKeyData()
            com.google.crypto.tink.proto.KeyData$KeyMaterialType r2 = r2.getKeyMaterialType()
            com.google.crypto.tink.proto.KeyData$KeyMaterialType r3 = com.google.crypto.tink.proto.KeyData.KeyMaterialType.UNKNOWN_KEYMATERIAL
            if (r2 == r3) goto L39
            com.google.crypto.tink.proto.KeyData r2 = r1.getKeyData()
            com.google.crypto.tink.proto.KeyData$KeyMaterialType r2 = r2.getKeyMaterialType()
            com.google.crypto.tink.proto.KeyData$KeyMaterialType r3 = com.google.crypto.tink.proto.KeyData.KeyMaterialType.SYMMETRIC
            if (r2 == r3) goto L39
            com.google.crypto.tink.proto.KeyData r2 = r1.getKeyData()
            com.google.crypto.tink.proto.KeyData$KeyMaterialType r2 = r2.getKeyMaterialType()
            com.google.crypto.tink.proto.KeyData$KeyMaterialType r3 = com.google.crypto.tink.proto.KeyData.KeyMaterialType.ASYMMETRIC_PRIVATE
            if (r2 == r3) goto L39
            goto L8
        L39:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r2 = "keyset contains secret key material"
            r0.<init>(r2)
            throw r0
        L41:
            return
    }
}
