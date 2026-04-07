package com.google.crypto.tink;

/* JADX INFO: loaded from: classes.dex */
public final class Config {
    private Config() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.crypto.tink.proto.KeyTypeEntry getTinkKeyTypeEntry(java.lang.String r3, java.lang.String r4, java.lang.String r5, int r6, boolean r7) {
            com.google.crypto.tink.proto.KeyTypeEntry$Builder r0 = com.google.crypto.tink.proto.KeyTypeEntry.newBuilder()
            com.google.crypto.tink.proto.KeyTypeEntry$Builder r0 = r0.setPrimitiveName(r4)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "type.googleapis.com/google.crypto.tink."
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r5)
            java.lang.String r1 = r1.toString()
            com.google.crypto.tink.proto.KeyTypeEntry$Builder r0 = r0.setTypeUrl(r1)
            com.google.crypto.tink.proto.KeyTypeEntry$Builder r0 = r0.setKeyManagerVersion(r6)
            com.google.crypto.tink.proto.KeyTypeEntry$Builder r0 = r0.setNewKeyAllowed(r7)
            com.google.crypto.tink.proto.KeyTypeEntry$Builder r0 = r0.setCatalogueName(r3)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r0 = r0.build()
            com.google.crypto.tink.proto.KeyTypeEntry r0 = (com.google.crypto.tink.proto.KeyTypeEntry) r0
            return r0
    }

    public static void register(com.google.crypto.tink.proto.RegistryConfig r2) throws java.security.GeneralSecurityException {
            java.util.List r0 = r2.getEntryList()
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L18
            java.lang.Object r1 = r0.next()
            com.google.crypto.tink.proto.KeyTypeEntry r1 = (com.google.crypto.tink.proto.KeyTypeEntry) r1
            registerKeyType(r1)
            goto L8
        L18:
            return
    }

    public static void registerKeyType(com.google.crypto.tink.proto.KeyTypeEntry r4) throws java.security.GeneralSecurityException {
            validate(r4)
            java.lang.String r0 = r4.getCatalogueName()
            java.lang.String r1 = "TinkAead"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L8c
            java.lang.String r0 = r4.getCatalogueName()
            java.lang.String r1 = "TinkMac"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L8c
            java.lang.String r0 = r4.getCatalogueName()
            java.lang.String r1 = "TinkHybridDecrypt"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L8c
            java.lang.String r0 = r4.getCatalogueName()
            java.lang.String r1 = "TinkHybridEncrypt"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L8c
            java.lang.String r0 = r4.getCatalogueName()
            java.lang.String r1 = "TinkPublicKeySign"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L8c
            java.lang.String r0 = r4.getCatalogueName()
            java.lang.String r1 = "TinkPublicKeyVerify"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L8c
            java.lang.String r0 = r4.getCatalogueName()
            java.lang.String r1 = "TinkStreamingAead"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L8c
            java.lang.String r0 = r4.getCatalogueName()
            java.lang.String r1 = "TinkDeterministicAead"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L64
            goto L8c
        L64:
            java.lang.String r0 = r4.getCatalogueName()
            com.google.crypto.tink.Catalogue r0 = com.google.crypto.tink.Registry.getCatalogue(r0)
            com.google.crypto.tink.PrimitiveWrapper r1 = r0.getPrimitiveWrapper()
            com.google.crypto.tink.Registry.registerPrimitiveWrapper(r1)
            java.lang.String r1 = r4.getTypeUrl()
            java.lang.String r2 = r4.getPrimitiveName()
            int r3 = r4.getKeyManagerVersion()
            com.google.crypto.tink.KeyManager r1 = r0.getKeyManager(r1, r2, r3)
            boolean r2 = r4.getNewKeyAllowed()
            com.google.crypto.tink.Registry.registerKeyManager(r1, r2)
            return
        L8c:
            return
    }

    private static void validate(com.google.crypto.tink.proto.KeyTypeEntry r2) throws java.security.GeneralSecurityException {
            java.lang.String r0 = r2.getTypeUrl()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L2f
            java.lang.String r0 = r2.getPrimitiveName()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L27
            java.lang.String r0 = r2.getCatalogueName()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L1f
            return
        L1f:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "Missing catalogue_name."
            r0.<init>(r1)
            throw r0
        L27:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "Missing primitive_name."
            r0.<init>(r1)
            throw r0
        L2f:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "Missing type_url."
            r0.<init>(r1)
            throw r0
    }
}
