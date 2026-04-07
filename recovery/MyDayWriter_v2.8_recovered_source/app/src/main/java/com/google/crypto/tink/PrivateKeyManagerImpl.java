package com.google.crypto.tink;

import com.google.crypto.tink.shaded.protobuf.MessageLite;

/* JADX INFO: loaded from: classes.dex */
class PrivateKeyManagerImpl<PrimitiveT, KeyProtoT extends com.google.crypto.tink.shaded.protobuf.MessageLite, PublicKeyProtoT extends com.google.crypto.tink.shaded.protobuf.MessageLite> extends com.google.crypto.tink.KeyManagerImpl<PrimitiveT, KeyProtoT> implements com.google.crypto.tink.PrivateKeyManager<PrimitiveT> {
    private final com.google.crypto.tink.internal.PrivateKeyTypeManager<KeyProtoT, PublicKeyProtoT> privateKeyManager;
    private final com.google.crypto.tink.internal.KeyTypeManager<PublicKeyProtoT> publicKeyManager;

    public PrivateKeyManagerImpl(com.google.crypto.tink.internal.PrivateKeyTypeManager<KeyProtoT, PublicKeyProtoT> r1, com.google.crypto.tink.internal.KeyTypeManager<PublicKeyProtoT> r2, java.lang.Class<PrimitiveT> r3) {
            r0 = this;
            r0.<init>(r1, r3)
            r0.privateKeyManager = r1
            r0.publicKeyManager = r2
            return
    }

    @Override // com.google.crypto.tink.PrivateKeyManager
    public com.google.crypto.tink.proto.KeyData getPublicKeyData(com.google.crypto.tink.shaded.protobuf.ByteString r5) throws java.security.GeneralSecurityException {
            r4 = this;
            com.google.crypto.tink.internal.PrivateKeyTypeManager<KeyProtoT extends com.google.crypto.tink.shaded.protobuf.MessageLite, PublicKeyProtoT extends com.google.crypto.tink.shaded.protobuf.MessageLite> r0 = r4.privateKeyManager     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L3d
            com.google.crypto.tink.shaded.protobuf.MessageLite r0 = r0.parseKey(r5)     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L3d
            com.google.crypto.tink.internal.PrivateKeyTypeManager<KeyProtoT extends com.google.crypto.tink.shaded.protobuf.MessageLite, PublicKeyProtoT extends com.google.crypto.tink.shaded.protobuf.MessageLite> r1 = r4.privateKeyManager     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L3d
            r1.validateKey(r0)     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L3d
            com.google.crypto.tink.internal.PrivateKeyTypeManager<KeyProtoT extends com.google.crypto.tink.shaded.protobuf.MessageLite, PublicKeyProtoT extends com.google.crypto.tink.shaded.protobuf.MessageLite> r1 = r4.privateKeyManager     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L3d
            com.google.crypto.tink.shaded.protobuf.MessageLite r1 = r1.getPublicKey(r0)     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L3d
            com.google.crypto.tink.internal.KeyTypeManager<PublicKeyProtoT extends com.google.crypto.tink.shaded.protobuf.MessageLite> r2 = r4.publicKeyManager     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L3d
            r2.validateKey(r1)     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L3d
            com.google.crypto.tink.proto.KeyData$Builder r2 = com.google.crypto.tink.proto.KeyData.newBuilder()     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L3d
            com.google.crypto.tink.internal.KeyTypeManager<PublicKeyProtoT extends com.google.crypto.tink.shaded.protobuf.MessageLite> r3 = r4.publicKeyManager     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L3d
            java.lang.String r3 = r3.getKeyType()     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L3d
            com.google.crypto.tink.proto.KeyData$Builder r2 = r2.setTypeUrl(r3)     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L3d
            com.google.crypto.tink.shaded.protobuf.ByteString r3 = r1.toByteString()     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L3d
            com.google.crypto.tink.proto.KeyData$Builder r2 = r2.setValue(r3)     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L3d
            com.google.crypto.tink.internal.KeyTypeManager<PublicKeyProtoT extends com.google.crypto.tink.shaded.protobuf.MessageLite> r3 = r4.publicKeyManager     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L3d
            com.google.crypto.tink.proto.KeyData$KeyMaterialType r3 = r3.keyMaterialType()     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L3d
            com.google.crypto.tink.proto.KeyData$Builder r2 = r2.setKeyMaterialType(r3)     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L3d
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r2 = r2.build()     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L3d
            com.google.crypto.tink.proto.KeyData r2 = (com.google.crypto.tink.proto.KeyData) r2     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L3d
            return r2
        L3d:
            r0 = move-exception
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException
            java.lang.String r2 = "expected serialized proto of type "
            r1.<init>(r2, r0)
            throw r1
    }
}
