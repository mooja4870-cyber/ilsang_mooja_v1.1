package com.google.crypto.tink.hybrid.internal;

/* JADX INFO: loaded from: classes.dex */
@com.google.errorprone.annotations.Immutable
final class HpkeDecrypt implements com.google.crypto.tink.HybridDecrypt {
    private static final byte[] EMPTY_ASSOCIATED_DATA = null;
    private final com.google.crypto.tink.hybrid.internal.HpkeAead aead;
    private final int encapsulatedKeyLength;
    private final com.google.crypto.tink.hybrid.internal.HpkeKdf kdf;
    private final com.google.crypto.tink.hybrid.internal.HpkeKem kem;
    private final com.google.crypto.tink.hybrid.internal.HpkeKemPrivateKey recipientPrivateKey;

    /* JADX INFO: renamed from: com.google.crypto.tink.hybrid.internal.HpkeDecrypt$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$proto$HpkeKem = null;

        static {
                com.google.crypto.tink.proto.HpkeKem[] r0 = com.google.crypto.tink.proto.HpkeKem.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.google.crypto.tink.hybrid.internal.HpkeDecrypt.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$HpkeKem = r0
                int[] r0 = com.google.crypto.tink.hybrid.internal.HpkeDecrypt.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$HpkeKem     // Catch: java.lang.NoSuchFieldError -> L15
                com.google.crypto.tink.proto.HpkeKem r1 = com.google.crypto.tink.proto.HpkeKem.DHKEM_X25519_HKDF_SHA256     // Catch: java.lang.NoSuchFieldError -> L15
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L15
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L15
                goto L16
            L15:
                r0 = move-exception
            L16:
                int[] r0 = com.google.crypto.tink.hybrid.internal.HpkeDecrypt.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$HpkeKem     // Catch: java.lang.NoSuchFieldError -> L22
                com.google.crypto.tink.proto.HpkeKem r1 = com.google.crypto.tink.proto.HpkeKem.DHKEM_P256_HKDF_SHA256     // Catch: java.lang.NoSuchFieldError -> L22
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L22
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L22
                goto L23
            L22:
                r0 = move-exception
            L23:
                int[] r0 = com.google.crypto.tink.hybrid.internal.HpkeDecrypt.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$HpkeKem     // Catch: java.lang.NoSuchFieldError -> L2f
                com.google.crypto.tink.proto.HpkeKem r1 = com.google.crypto.tink.proto.HpkeKem.DHKEM_P384_HKDF_SHA384     // Catch: java.lang.NoSuchFieldError -> L2f
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L2f
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L2f
                goto L30
            L2f:
                r0 = move-exception
            L30:
                int[] r0 = com.google.crypto.tink.hybrid.internal.HpkeDecrypt.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$HpkeKem     // Catch: java.lang.NoSuchFieldError -> L3c
                com.google.crypto.tink.proto.HpkeKem r1 = com.google.crypto.tink.proto.HpkeKem.DHKEM_P521_HKDF_SHA512     // Catch: java.lang.NoSuchFieldError -> L3c
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

    static {
            r0 = 0
            byte[] r0 = new byte[r0]
            com.google.crypto.tink.hybrid.internal.HpkeDecrypt.EMPTY_ASSOCIATED_DATA = r0
            return
    }

    private HpkeDecrypt(com.google.crypto.tink.hybrid.internal.HpkeKemPrivateKey r1, com.google.crypto.tink.hybrid.internal.HpkeKem r2, com.google.crypto.tink.hybrid.internal.HpkeKdf r3, com.google.crypto.tink.hybrid.internal.HpkeAead r4, int r5) {
            r0 = this;
            r0.<init>()
            r0.recipientPrivateKey = r1
            r0.kem = r2
            r0.kdf = r3
            r0.aead = r4
            r0.encapsulatedKeyLength = r5
            return
    }

    static com.google.crypto.tink.hybrid.internal.HpkeDecrypt createHpkeDecrypt(com.google.crypto.tink.proto.HpkePrivateKey r7) throws java.security.GeneralSecurityException {
            boolean r0 = r7.hasPublicKey()
            if (r0 == 0) goto L50
            com.google.crypto.tink.proto.HpkePublicKey r0 = r7.getPublicKey()
            boolean r0 = r0.hasParams()
            if (r0 == 0) goto L48
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r7.getPrivateKey()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L40
            com.google.crypto.tink.proto.HpkePublicKey r0 = r7.getPublicKey()
            com.google.crypto.tink.proto.HpkeParams r0 = r0.getParams()
            com.google.crypto.tink.hybrid.internal.HpkeKem r3 = com.google.crypto.tink.hybrid.internal.HpkePrimitiveFactory.createKem(r0)
            com.google.crypto.tink.hybrid.internal.HpkeKdf r4 = com.google.crypto.tink.hybrid.internal.HpkePrimitiveFactory.createKdf(r0)
            com.google.crypto.tink.hybrid.internal.HpkeAead r5 = com.google.crypto.tink.hybrid.internal.HpkePrimitiveFactory.createAead(r0)
            com.google.crypto.tink.proto.HpkeKem r1 = r0.getKem()
            int r6 = encodingSizeInBytes(r1)
            com.google.crypto.tink.hybrid.internal.HpkeKemPrivateKey r2 = com.google.crypto.tink.hybrid.internal.HpkeKemKeyFactory.createPrivate(r7)
            com.google.crypto.tink.hybrid.internal.HpkeDecrypt r1 = new com.google.crypto.tink.hybrid.internal.HpkeDecrypt
            r1.<init>(r2, r3, r4, r5, r6)
            return r1
        L40:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "HpkePrivateKey.private_key is empty."
            r0.<init>(r1)
            throw r0
        L48:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "HpkePrivateKey.public_key is missing params field."
            r0.<init>(r1)
            throw r0
        L50:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "HpkePrivateKey is missing public_key field."
            r0.<init>(r1)
            throw r0
    }

    private static int encodingSizeInBytes(com.google.crypto.tink.proto.HpkeKem r3) {
            int[] r0 = com.google.crypto.tink.hybrid.internal.HpkeDecrypt.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$HpkeKem
            int r1 = r3.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L31;
                case 2: goto L2e;
                case 3: goto L2b;
                case 4: goto L28;
                default: goto Lb;
            }
        Lb:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unable to determine KEM-encoding length for "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = r3.name()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L28:
            r0 = 133(0x85, float:1.86E-43)
            return r0
        L2b:
            r0 = 97
            return r0
        L2e:
            r0 = 65
            return r0
        L31:
            r0 = 32
            return r0
    }

    @Override // com.google.crypto.tink.HybridDecrypt
    public byte[] decrypt(byte[] r8, byte[] r9) throws java.security.GeneralSecurityException {
            r7 = this;
            int r0 = r8.length
            int r1 = r7.encapsulatedKeyLength
            if (r0 < r1) goto L2e
            r0 = r9
            if (r0 != 0) goto Ld
            r1 = 0
            byte[] r0 = new byte[r1]
            r6 = r0
            goto Le
        Ld:
            r6 = r0
        Le:
            int r0 = r7.encapsulatedKeyLength
            byte[] r1 = java.util.Arrays.copyOf(r8, r0)
            int r0 = r7.encapsulatedKeyLength
            int r2 = r8.length
            byte[] r0 = java.util.Arrays.copyOfRange(r8, r0, r2)
            com.google.crypto.tink.hybrid.internal.HpkeKemPrivateKey r2 = r7.recipientPrivateKey
            com.google.crypto.tink.hybrid.internal.HpkeKem r3 = r7.kem
            com.google.crypto.tink.hybrid.internal.HpkeKdf r4 = r7.kdf
            com.google.crypto.tink.hybrid.internal.HpkeAead r5 = r7.aead
            com.google.crypto.tink.hybrid.internal.HpkeContext r2 = com.google.crypto.tink.hybrid.internal.HpkeContext.createRecipientContext(r1, r2, r3, r4, r5, r6)
            byte[] r3 = com.google.crypto.tink.hybrid.internal.HpkeDecrypt.EMPTY_ASSOCIATED_DATA
            byte[] r3 = r2.open(r0, r3)
            return r3
        L2e:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "Ciphertext is too short."
            r0.<init>(r1)
            throw r0
    }
}
