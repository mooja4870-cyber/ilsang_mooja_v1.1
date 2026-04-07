package com.google.crypto.tink;

import com.google.crypto.tink.shaded.protobuf.MessageLite;

/* JADX INFO: loaded from: classes.dex */
class KeyManagerImpl<PrimitiveT, KeyProtoT extends com.google.crypto.tink.shaded.protobuf.MessageLite> implements com.google.crypto.tink.KeyManager<PrimitiveT> {
    private final com.google.crypto.tink.internal.KeyTypeManager<KeyProtoT> keyTypeManager;
    private final java.lang.Class<PrimitiveT> primitiveClass;

    private static class KeyFactoryHelper<KeyFormatProtoT extends com.google.crypto.tink.shaded.protobuf.MessageLite, KeyProtoT extends com.google.crypto.tink.shaded.protobuf.MessageLite> {
        final com.google.crypto.tink.internal.KeyTypeManager.KeyFactory<KeyFormatProtoT, KeyProtoT> keyFactory;

        KeyFactoryHelper(com.google.crypto.tink.internal.KeyTypeManager.KeyFactory<KeyFormatProtoT, KeyProtoT> r1) {
                r0 = this;
                r0.<init>()
                r0.keyFactory = r1
                return
        }

        private KeyProtoT validateCreate(KeyFormatProtoT r2) throws java.security.GeneralSecurityException {
                r1 = this;
                com.google.crypto.tink.internal.KeyTypeManager$KeyFactory<KeyFormatProtoT extends com.google.crypto.tink.shaded.protobuf.MessageLite, KeyProtoT extends com.google.crypto.tink.shaded.protobuf.MessageLite> r0 = r1.keyFactory
                r0.validateKeyFormat(r2)
                com.google.crypto.tink.internal.KeyTypeManager$KeyFactory<KeyFormatProtoT extends com.google.crypto.tink.shaded.protobuf.MessageLite, KeyProtoT extends com.google.crypto.tink.shaded.protobuf.MessageLite> r0 = r1.keyFactory
                com.google.crypto.tink.shaded.protobuf.MessageLite r0 = r0.createKey(r2)
                return r0
        }

        KeyProtoT castValidateCreate(com.google.crypto.tink.shaded.protobuf.MessageLite r3) throws java.security.GeneralSecurityException {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Expected proto of type "
                java.lang.StringBuilder r0 = r0.append(r1)
                com.google.crypto.tink.internal.KeyTypeManager$KeyFactory<KeyFormatProtoT extends com.google.crypto.tink.shaded.protobuf.MessageLite, KeyProtoT extends com.google.crypto.tink.shaded.protobuf.MessageLite> r1 = r2.keyFactory
                java.lang.Class r1 = r1.getKeyFormatClass()
                java.lang.String r1 = r1.getName()
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                com.google.crypto.tink.internal.KeyTypeManager$KeyFactory<KeyFormatProtoT extends com.google.crypto.tink.shaded.protobuf.MessageLite, KeyProtoT extends com.google.crypto.tink.shaded.protobuf.MessageLite> r1 = r2.keyFactory
                java.lang.Class r1 = r1.getKeyFormatClass()
                java.lang.Object r0 = com.google.crypto.tink.KeyManagerImpl.access$000(r3, r0, r1)
                com.google.crypto.tink.shaded.protobuf.MessageLite r0 = (com.google.crypto.tink.shaded.protobuf.MessageLite) r0
                com.google.crypto.tink.shaded.protobuf.MessageLite r0 = r2.validateCreate(r0)
                return r0
        }

        KeyProtoT parseValidateCreate(com.google.crypto.tink.shaded.protobuf.ByteString r2) throws java.security.GeneralSecurityException, com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
                r1 = this;
                com.google.crypto.tink.internal.KeyTypeManager$KeyFactory<KeyFormatProtoT extends com.google.crypto.tink.shaded.protobuf.MessageLite, KeyProtoT extends com.google.crypto.tink.shaded.protobuf.MessageLite> r0 = r1.keyFactory
                com.google.crypto.tink.shaded.protobuf.MessageLite r0 = r0.parseKeyFormat(r2)
                com.google.crypto.tink.shaded.protobuf.MessageLite r0 = r1.validateCreate(r0)
                return r0
        }
    }

    public KeyManagerImpl(com.google.crypto.tink.internal.KeyTypeManager<KeyProtoT> r4, java.lang.Class<PrimitiveT> r5) {
            r3 = this;
            r3.<init>()
            java.util.Set r0 = r4.supportedPrimitives()
            boolean r0 = r0.contains(r5)
            if (r0 != 0) goto L2e
            java.lang.Class<java.lang.Void> r0 = java.lang.Void.class
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L16
            goto L2e
        L16:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r4.toString()
            java.lang.String r2 = r5.getName()
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r2}
            java.lang.String r2 = "Given internalKeyMananger %s does not support primitive class %s"
            java.lang.String r1 = java.lang.String.format(r2, r1)
            r0.<init>(r1)
            throw r0
        L2e:
            r3.keyTypeManager = r4
            r3.primitiveClass = r5
            return
    }

    static /* synthetic */ java.lang.Object access$000(java.lang.Object r1, java.lang.String r2, java.lang.Class r3) throws java.security.GeneralSecurityException {
            java.lang.Object r0 = castOrThrowSecurityException(r1, r2, r3)
            return r0
    }

    private static <CastedT> CastedT castOrThrowSecurityException(java.lang.Object r1, java.lang.String r2, java.lang.Class<CastedT> r3) throws java.security.GeneralSecurityException {
            boolean r0 = r3.isInstance(r1)
            if (r0 == 0) goto L8
            r0 = r1
            return r0
        L8:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            r0.<init>(r2)
            throw r0
    }

    private com.google.crypto.tink.KeyManagerImpl.KeyFactoryHelper<?, KeyProtoT> keyFactoryHelper() {
            r2 = this;
            com.google.crypto.tink.KeyManagerImpl$KeyFactoryHelper r0 = new com.google.crypto.tink.KeyManagerImpl$KeyFactoryHelper
            com.google.crypto.tink.internal.KeyTypeManager<KeyProtoT extends com.google.crypto.tink.shaded.protobuf.MessageLite> r1 = r2.keyTypeManager
            com.google.crypto.tink.internal.KeyTypeManager$KeyFactory r1 = r1.keyFactory()
            r0.<init>(r1)
            return r0
    }

    private PrimitiveT validateKeyAndGetPrimitive(KeyProtoT r3) throws java.security.GeneralSecurityException {
            r2 = this;
            java.lang.Class<java.lang.Void> r0 = java.lang.Void.class
            java.lang.Class<PrimitiveT> r1 = r2.primitiveClass
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L18
            com.google.crypto.tink.internal.KeyTypeManager<KeyProtoT extends com.google.crypto.tink.shaded.protobuf.MessageLite> r0 = r2.keyTypeManager
            r0.validateKey(r3)
            com.google.crypto.tink.internal.KeyTypeManager<KeyProtoT extends com.google.crypto.tink.shaded.protobuf.MessageLite> r0 = r2.keyTypeManager
            java.lang.Class<PrimitiveT> r1 = r2.primitiveClass
            java.lang.Object r0 = r0.getPrimitive(r3, r1)
            return r0
        L18:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "Cannot create a primitive for Void"
            r0.<init>(r1)
            throw r0
    }

    @Override // com.google.crypto.tink.KeyManager
    public final boolean doesSupport(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = r1.getKeyType()
            boolean r0 = r2.equals(r0)
            return r0
    }

    @Override // com.google.crypto.tink.KeyManager
    public final java.lang.String getKeyType() {
            r1 = this;
            com.google.crypto.tink.internal.KeyTypeManager<KeyProtoT extends com.google.crypto.tink.shaded.protobuf.MessageLite> r0 = r1.keyTypeManager
            java.lang.String r0 = r0.getKeyType()
            return r0
    }

    @Override // com.google.crypto.tink.KeyManager
    public final PrimitiveT getPrimitive(com.google.crypto.tink.shaded.protobuf.ByteString r5) throws java.security.GeneralSecurityException {
            r4 = this;
            com.google.crypto.tink.internal.KeyTypeManager<KeyProtoT extends com.google.crypto.tink.shaded.protobuf.MessageLite> r0 = r4.keyTypeManager     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> Lb
            com.google.crypto.tink.shaded.protobuf.MessageLite r0 = r0.parseKey(r5)     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> Lb
            java.lang.Object r1 = r4.validateKeyAndGetPrimitive(r0)     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> Lb
            return r1
        Lb:
            r0 = move-exception
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Failures parsing proto of type "
            java.lang.StringBuilder r2 = r2.append(r3)
            com.google.crypto.tink.internal.KeyTypeManager<KeyProtoT extends com.google.crypto.tink.shaded.protobuf.MessageLite> r3 = r4.keyTypeManager
            java.lang.Class r3 = r3.getKeyClass()
            java.lang.String r3 = r3.getName()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2, r0)
            throw r1
    }

    @Override // com.google.crypto.tink.KeyManager
    public final PrimitiveT getPrimitive(com.google.crypto.tink.shaded.protobuf.MessageLite r3) throws java.security.GeneralSecurityException {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Expected proto of type "
            java.lang.StringBuilder r0 = r0.append(r1)
            com.google.crypto.tink.internal.KeyTypeManager<KeyProtoT extends com.google.crypto.tink.shaded.protobuf.MessageLite> r1 = r2.keyTypeManager
            java.lang.Class r1 = r1.getKeyClass()
            java.lang.String r1 = r1.getName()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.google.crypto.tink.internal.KeyTypeManager<KeyProtoT extends com.google.crypto.tink.shaded.protobuf.MessageLite> r1 = r2.keyTypeManager
            java.lang.Class r1 = r1.getKeyClass()
            java.lang.Object r0 = castOrThrowSecurityException(r3, r0, r1)
            com.google.crypto.tink.shaded.protobuf.MessageLite r0 = (com.google.crypto.tink.shaded.protobuf.MessageLite) r0
            java.lang.Object r0 = r2.validateKeyAndGetPrimitive(r0)
            return r0
    }

    @Override // com.google.crypto.tink.KeyManager
    public final java.lang.Class<PrimitiveT> getPrimitiveClass() {
            r1 = this;
            java.lang.Class<PrimitiveT> r0 = r1.primitiveClass
            return r0
    }

    @Override // com.google.crypto.tink.KeyManager
    public int getVersion() {
            r1 = this;
            com.google.crypto.tink.internal.KeyTypeManager<KeyProtoT extends com.google.crypto.tink.shaded.protobuf.MessageLite> r0 = r1.keyTypeManager
            int r0 = r0.getVersion()
            return r0
    }

    @Override // com.google.crypto.tink.KeyManager
    public final com.google.crypto.tink.shaded.protobuf.MessageLite newKey(com.google.crypto.tink.shaded.protobuf.ByteString r5) throws java.security.GeneralSecurityException {
            r4 = this;
            com.google.crypto.tink.KeyManagerImpl$KeyFactoryHelper r0 = r4.keyFactoryHelper()     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L9
            com.google.crypto.tink.shaded.protobuf.MessageLite r0 = r0.parseValidateCreate(r5)     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L9
            return r0
        L9:
            r0 = move-exception
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Failures parsing proto of type "
            java.lang.StringBuilder r2 = r2.append(r3)
            com.google.crypto.tink.internal.KeyTypeManager<KeyProtoT extends com.google.crypto.tink.shaded.protobuf.MessageLite> r3 = r4.keyTypeManager
            com.google.crypto.tink.internal.KeyTypeManager$KeyFactory r3 = r3.keyFactory()
            java.lang.Class r3 = r3.getKeyFormatClass()
            java.lang.String r3 = r3.getName()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2, r0)
            throw r1
    }

    @Override // com.google.crypto.tink.KeyManager
    public final com.google.crypto.tink.shaded.protobuf.MessageLite newKey(com.google.crypto.tink.shaded.protobuf.MessageLite r2) throws java.security.GeneralSecurityException {
            r1 = this;
            com.google.crypto.tink.KeyManagerImpl$KeyFactoryHelper r0 = r1.keyFactoryHelper()
            com.google.crypto.tink.shaded.protobuf.MessageLite r0 = r0.castValidateCreate(r2)
            return r0
    }

    @Override // com.google.crypto.tink.KeyManager
    public final com.google.crypto.tink.proto.KeyData newKeyData(com.google.crypto.tink.shaded.protobuf.ByteString r4) throws java.security.GeneralSecurityException {
            r3 = this;
            com.google.crypto.tink.KeyManagerImpl$KeyFactoryHelper r0 = r3.keyFactoryHelper()     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L2d
            com.google.crypto.tink.shaded.protobuf.MessageLite r0 = r0.parseValidateCreate(r4)     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L2d
            com.google.crypto.tink.proto.KeyData$Builder r1 = com.google.crypto.tink.proto.KeyData.newBuilder()     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L2d
            java.lang.String r2 = r3.getKeyType()     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L2d
            com.google.crypto.tink.proto.KeyData$Builder r1 = r1.setTypeUrl(r2)     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L2d
            com.google.crypto.tink.shaded.protobuf.ByteString r2 = r0.toByteString()     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L2d
            com.google.crypto.tink.proto.KeyData$Builder r1 = r1.setValue(r2)     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L2d
            com.google.crypto.tink.internal.KeyTypeManager<KeyProtoT extends com.google.crypto.tink.shaded.protobuf.MessageLite> r2 = r3.keyTypeManager     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L2d
            com.google.crypto.tink.proto.KeyData$KeyMaterialType r2 = r2.keyMaterialType()     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L2d
            com.google.crypto.tink.proto.KeyData$Builder r1 = r1.setKeyMaterialType(r2)     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L2d
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r1 = r1.build()     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L2d
            com.google.crypto.tink.proto.KeyData r1 = (com.google.crypto.tink.proto.KeyData) r1     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> L2d
            return r1
        L2d:
            r0 = move-exception
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException
            java.lang.String r2 = "Unexpected proto"
            r1.<init>(r2, r0)
            throw r1
    }
}
