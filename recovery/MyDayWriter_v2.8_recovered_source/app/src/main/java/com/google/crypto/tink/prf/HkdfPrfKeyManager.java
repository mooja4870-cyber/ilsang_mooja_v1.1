package com.google.crypto.tink.prf;

/* JADX INFO: loaded from: classes.dex */
public class HkdfPrfKeyManager extends com.google.crypto.tink.internal.KeyTypeManager<com.google.crypto.tink.proto.HkdfPrfKey> {
    private static final int MIN_KEY_SIZE = 32;




    /* JADX INFO: renamed from: com.google.crypto.tink.prf.HkdfPrfKeyManager$4, reason: invalid class name */
    static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$proto$HashType = null;

        static {
                com.google.crypto.tink.proto.HashType[] r0 = com.google.crypto.tink.proto.HashType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.google.crypto.tink.prf.HkdfPrfKeyManager.AnonymousClass4.$SwitchMap$com$google$crypto$tink$proto$HashType = r0
                int[] r0 = com.google.crypto.tink.prf.HkdfPrfKeyManager.AnonymousClass4.$SwitchMap$com$google$crypto$tink$proto$HashType     // Catch: java.lang.NoSuchFieldError -> L15
                com.google.crypto.tink.proto.HashType r1 = com.google.crypto.tink.proto.HashType.SHA1     // Catch: java.lang.NoSuchFieldError -> L15
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L15
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L15
                goto L16
            L15:
                r0 = move-exception
            L16:
                int[] r0 = com.google.crypto.tink.prf.HkdfPrfKeyManager.AnonymousClass4.$SwitchMap$com$google$crypto$tink$proto$HashType     // Catch: java.lang.NoSuchFieldError -> L22
                com.google.crypto.tink.proto.HashType r1 = com.google.crypto.tink.proto.HashType.SHA256     // Catch: java.lang.NoSuchFieldError -> L22
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L22
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L22
                goto L23
            L22:
                r0 = move-exception
            L23:
                int[] r0 = com.google.crypto.tink.prf.HkdfPrfKeyManager.AnonymousClass4.$SwitchMap$com$google$crypto$tink$proto$HashType     // Catch: java.lang.NoSuchFieldError -> L2f
                com.google.crypto.tink.proto.HashType r1 = com.google.crypto.tink.proto.HashType.SHA384     // Catch: java.lang.NoSuchFieldError -> L2f
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L2f
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L2f
                goto L30
            L2f:
                r0 = move-exception
            L30:
                int[] r0 = com.google.crypto.tink.prf.HkdfPrfKeyManager.AnonymousClass4.$SwitchMap$com$google$crypto$tink$proto$HashType     // Catch: java.lang.NoSuchFieldError -> L3c
                com.google.crypto.tink.proto.HashType r1 = com.google.crypto.tink.proto.HashType.SHA512     // Catch: java.lang.NoSuchFieldError -> L3c
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3c
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3c
                goto L3d
            L3c:
                r0 = move-exception
            L3d:
                return
        }
    }

    HkdfPrfKeyManager() {
            r4 = this;
            java.lang.Class<com.google.crypto.tink.proto.HkdfPrfKey> r0 = com.google.crypto.tink.proto.HkdfPrfKey.class
            r1 = 2
            com.google.crypto.tink.internal.PrimitiveFactory[] r1 = new com.google.crypto.tink.internal.PrimitiveFactory[r1]
            com.google.crypto.tink.prf.HkdfPrfKeyManager$1 r2 = new com.google.crypto.tink.prf.HkdfPrfKeyManager$1
            java.lang.Class<com.google.crypto.tink.subtle.prf.StreamingPrf> r3 = com.google.crypto.tink.subtle.prf.StreamingPrf.class
            r2.<init>(r3)
            r3 = 0
            r1[r3] = r2
            com.google.crypto.tink.prf.HkdfPrfKeyManager$2 r2 = new com.google.crypto.tink.prf.HkdfPrfKeyManager$2
            java.lang.Class<com.google.crypto.tink.prf.Prf> r3 = com.google.crypto.tink.prf.Prf.class
            r2.<init>(r3)
            r3 = 1
            r1[r3] = r2
            r4.<init>(r0, r1)
            return
    }

    static /* synthetic */ com.google.crypto.tink.subtle.Enums.HashType access$000(com.google.crypto.tink.proto.HashType r1) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.subtle.Enums$HashType r0 = convertHash(r1)
            return r0
    }

    static /* synthetic */ void access$100(int r0) throws java.security.GeneralSecurityException {
            validateKeySize(r0)
            return
    }

    static /* synthetic */ void access$200(com.google.crypto.tink.proto.HkdfPrfParams r0) throws java.security.GeneralSecurityException {
            validateParams(r0)
            return
    }

    private static com.google.crypto.tink.subtle.Enums.HashType convertHash(com.google.crypto.tink.proto.HashType r3) throws java.security.GeneralSecurityException {
            int[] r0 = com.google.crypto.tink.prf.HkdfPrfKeyManager.AnonymousClass4.$SwitchMap$com$google$crypto$tink$proto$HashType
            int r1 = r3.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L37;
                case 2: goto L34;
                case 3: goto L31;
                case 4: goto L2e;
                default: goto Lb;
            }
        Lb:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "HashType "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = r3.name()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " not known in"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L2e:
            com.google.crypto.tink.subtle.Enums$HashType r0 = com.google.crypto.tink.subtle.Enums.HashType.SHA512
            return r0
        L31:
            com.google.crypto.tink.subtle.Enums$HashType r0 = com.google.crypto.tink.subtle.Enums.HashType.SHA384
            return r0
        L34:
            com.google.crypto.tink.subtle.Enums$HashType r0 = com.google.crypto.tink.subtle.Enums.HashType.SHA256
            return r0
        L37:
            com.google.crypto.tink.subtle.Enums$HashType r0 = com.google.crypto.tink.subtle.Enums.HashType.SHA1
            return r0
    }

    public static final com.google.crypto.tink.KeyTemplate hkdfSha256Template() {
            com.google.crypto.tink.proto.HkdfPrfKeyFormat$Builder r0 = com.google.crypto.tink.proto.HkdfPrfKeyFormat.newBuilder()
            r1 = 32
            com.google.crypto.tink.proto.HkdfPrfKeyFormat$Builder r0 = r0.setKeySize(r1)
            com.google.crypto.tink.proto.HkdfPrfParams$Builder r1 = com.google.crypto.tink.proto.HkdfPrfParams.newBuilder()
            com.google.crypto.tink.proto.HashType r2 = com.google.crypto.tink.proto.HashType.SHA256
            com.google.crypto.tink.proto.HkdfPrfParams$Builder r1 = r1.setHash(r2)
            com.google.crypto.tink.proto.HkdfPrfKeyFormat$Builder r0 = r0.setParams(r1)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = r0.build()
            com.google.crypto.tink.proto.HkdfPrfKeyFormat r0 = (com.google.crypto.tink.proto.HkdfPrfKeyFormat) r0
            java.lang.String r1 = staticKeyType()
            byte[] r2 = r0.toByteArray()
            com.google.crypto.tink.KeyTemplate$OutputPrefixType r3 = com.google.crypto.tink.KeyTemplate.OutputPrefixType.RAW
            com.google.crypto.tink.KeyTemplate r1 = com.google.crypto.tink.KeyTemplate.create(r1, r2, r3)
            return r1
    }

    public static void register(boolean r1) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.prf.HkdfPrfKeyManager r0 = new com.google.crypto.tink.prf.HkdfPrfKeyManager
            r0.<init>()
            com.google.crypto.tink.Registry.registerKeyManager(r0, r1)
            com.google.crypto.tink.prf.HkdfPrfProtoSerialization.register()
            return
    }

    public static java.lang.String staticKeyType() {
            com.google.crypto.tink.prf.HkdfPrfKeyManager r0 = new com.google.crypto.tink.prf.HkdfPrfKeyManager
            r0.<init>()
            java.lang.String r0 = r0.getKeyType()
            return r0
    }

    private static void validateKeySize(int r2) throws java.security.GeneralSecurityException {
            r0 = 32
            if (r2 < r0) goto L5
            return
        L5:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "Invalid HkdfPrfKey/HkdfPrfKeyFormat: Key size too short"
            r0.<init>(r1)
            throw r0
    }

    private static void validateParams(com.google.crypto.tink.proto.HkdfPrfParams r2) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.proto.HashType r0 = r2.getHash()
            com.google.crypto.tink.proto.HashType r1 = com.google.crypto.tink.proto.HashType.SHA256
            if (r0 == r1) goto L19
            com.google.crypto.tink.proto.HashType r0 = r2.getHash()
            com.google.crypto.tink.proto.HashType r1 = com.google.crypto.tink.proto.HashType.SHA512
            if (r0 != r1) goto L11
            goto L19
        L11:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "Invalid HkdfPrfKey/HkdfPrfKeyFormat: Unsupported hash"
            r0.<init>(r1)
            throw r0
        L19:
            return
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public java.lang.String getKeyType() {
            r1 = this;
            java.lang.String r0 = "type.googleapis.com/google.crypto.tink.HkdfPrfKey"
            return r0
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public int getVersion() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public com.google.crypto.tink.internal.KeyTypeManager.KeyFactory<com.google.crypto.tink.proto.HkdfPrfKeyFormat, com.google.crypto.tink.proto.HkdfPrfKey> keyFactory() {
            r2 = this;
            com.google.crypto.tink.prf.HkdfPrfKeyManager$3 r0 = new com.google.crypto.tink.prf.HkdfPrfKeyManager$3
            java.lang.Class<com.google.crypto.tink.proto.HkdfPrfKeyFormat> r1 = com.google.crypto.tink.proto.HkdfPrfKeyFormat.class
            r0.<init>(r2, r1)
            return r0
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public com.google.crypto.tink.proto.KeyData.KeyMaterialType keyMaterialType() {
            r1 = this;
            com.google.crypto.tink.proto.KeyData$KeyMaterialType r0 = com.google.crypto.tink.proto.KeyData.KeyMaterialType.SYMMETRIC
            return r0
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public com.google.crypto.tink.proto.HkdfPrfKey parseKey(com.google.crypto.tink.shaded.protobuf.ByteString r2) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            r1 = this;
            com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r0 = com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry()
            com.google.crypto.tink.proto.HkdfPrfKey r0 = com.google.crypto.tink.proto.HkdfPrfKey.parseFrom(r2, r0)
            return r0
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public /* bridge */ /* synthetic */ com.google.crypto.tink.shaded.protobuf.MessageLite parseKey(com.google.crypto.tink.shaded.protobuf.ByteString r1) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            r0 = this;
            com.google.crypto.tink.proto.HkdfPrfKey r1 = r0.parseKey(r1)
            return r1
    }

    public void validateKey(com.google.crypto.tink.proto.HkdfPrfKey r3) throws java.security.GeneralSecurityException {
            r2 = this;
            int r0 = r3.getVersion()
            int r1 = r2.getVersion()
            com.google.crypto.tink.subtle.Validators.validateVersion(r0, r1)
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r3.getKeyValue()
            int r0 = r0.size()
            validateKeySize(r0)
            com.google.crypto.tink.proto.HkdfPrfParams r0 = r3.getParams()
            validateParams(r0)
            return
    }

    @Override // com.google.crypto.tink.internal.KeyTypeManager
    public /* bridge */ /* synthetic */ void validateKey(com.google.crypto.tink.shaded.protobuf.MessageLite r1) throws java.security.GeneralSecurityException {
            r0 = this;
            com.google.crypto.tink.proto.HkdfPrfKey r1 = (com.google.crypto.tink.proto.HkdfPrfKey) r1
            r0.validateKey(r1)
            return
    }
}
