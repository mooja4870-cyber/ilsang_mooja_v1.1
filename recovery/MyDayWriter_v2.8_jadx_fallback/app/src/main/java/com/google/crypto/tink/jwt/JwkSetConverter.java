package com.google.crypto.tink.jwt;

/* JADX INFO: loaded from: classes.dex */
public final class JwkSetConverter {
    private static final java.lang.String JWT_ECDSA_PUBLIC_KEY_URL = "type.googleapis.com/google.crypto.tink.JwtEcdsaPublicKey";
    private static final java.lang.String JWT_RSA_SSA_PKCS1_PUBLIC_KEY_URL = "type.googleapis.com/google.crypto.tink.JwtRsaSsaPkcs1PublicKey";
    private static final java.lang.String JWT_RSA_SSA_PSS_PUBLIC_KEY_URL = "type.googleapis.com/google.crypto.tink.JwtRsaSsaPssPublicKey";

    /* JADX INFO: renamed from: com.google.crypto.tink.jwt.JwkSetConverter$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$proto$JwtEcdsaAlgorithm = null;
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$proto$JwtRsaSsaPkcs1Algorithm = null;
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$proto$JwtRsaSsaPssAlgorithm = null;

        static {
                com.google.crypto.tink.proto.JwtRsaSsaPssAlgorithm[] r0 = com.google.crypto.tink.proto.JwtRsaSsaPssAlgorithm.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.google.crypto.tink.jwt.JwkSetConverter.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$JwtRsaSsaPssAlgorithm = r0
                r0 = 1
                int[] r1 = com.google.crypto.tink.jwt.JwkSetConverter.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$JwtRsaSsaPssAlgorithm     // Catch: java.lang.NoSuchFieldError -> L15
                com.google.crypto.tink.proto.JwtRsaSsaPssAlgorithm r2 = com.google.crypto.tink.proto.JwtRsaSsaPssAlgorithm.PS256     // Catch: java.lang.NoSuchFieldError -> L15
                int r2 = r2.ordinal()     // Catch: java.lang.NoSuchFieldError -> L15
                r1[r2] = r0     // Catch: java.lang.NoSuchFieldError -> L15
                goto L16
            L15:
                r1 = move-exception
            L16:
                r1 = 2
                int[] r2 = com.google.crypto.tink.jwt.JwkSetConverter.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$JwtRsaSsaPssAlgorithm     // Catch: java.lang.NoSuchFieldError -> L22
                com.google.crypto.tink.proto.JwtRsaSsaPssAlgorithm r3 = com.google.crypto.tink.proto.JwtRsaSsaPssAlgorithm.PS384     // Catch: java.lang.NoSuchFieldError -> L22
                int r3 = r3.ordinal()     // Catch: java.lang.NoSuchFieldError -> L22
                r2[r3] = r1     // Catch: java.lang.NoSuchFieldError -> L22
                goto L23
            L22:
                r2 = move-exception
            L23:
                r2 = 3
                int[] r3 = com.google.crypto.tink.jwt.JwkSetConverter.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$JwtRsaSsaPssAlgorithm     // Catch: java.lang.NoSuchFieldError -> L2f
                com.google.crypto.tink.proto.JwtRsaSsaPssAlgorithm r4 = com.google.crypto.tink.proto.JwtRsaSsaPssAlgorithm.PS512     // Catch: java.lang.NoSuchFieldError -> L2f
                int r4 = r4.ordinal()     // Catch: java.lang.NoSuchFieldError -> L2f
                r3[r4] = r2     // Catch: java.lang.NoSuchFieldError -> L2f
                goto L30
            L2f:
                r3 = move-exception
            L30:
                com.google.crypto.tink.proto.JwtRsaSsaPkcs1Algorithm[] r3 = com.google.crypto.tink.proto.JwtRsaSsaPkcs1Algorithm.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                com.google.crypto.tink.jwt.JwkSetConverter.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$JwtRsaSsaPkcs1Algorithm = r3
                int[] r3 = com.google.crypto.tink.jwt.JwkSetConverter.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$JwtRsaSsaPkcs1Algorithm     // Catch: java.lang.NoSuchFieldError -> L44
                com.google.crypto.tink.proto.JwtRsaSsaPkcs1Algorithm r4 = com.google.crypto.tink.proto.JwtRsaSsaPkcs1Algorithm.RS256     // Catch: java.lang.NoSuchFieldError -> L44
                int r4 = r4.ordinal()     // Catch: java.lang.NoSuchFieldError -> L44
                r3[r4] = r0     // Catch: java.lang.NoSuchFieldError -> L44
                goto L45
            L44:
                r3 = move-exception
            L45:
                int[] r3 = com.google.crypto.tink.jwt.JwkSetConverter.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$JwtRsaSsaPkcs1Algorithm     // Catch: java.lang.NoSuchFieldError -> L50
                com.google.crypto.tink.proto.JwtRsaSsaPkcs1Algorithm r4 = com.google.crypto.tink.proto.JwtRsaSsaPkcs1Algorithm.RS384     // Catch: java.lang.NoSuchFieldError -> L50
                int r4 = r4.ordinal()     // Catch: java.lang.NoSuchFieldError -> L50
                r3[r4] = r1     // Catch: java.lang.NoSuchFieldError -> L50
                goto L51
            L50:
                r3 = move-exception
            L51:
                int[] r3 = com.google.crypto.tink.jwt.JwkSetConverter.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$JwtRsaSsaPkcs1Algorithm     // Catch: java.lang.NoSuchFieldError -> L5c
                com.google.crypto.tink.proto.JwtRsaSsaPkcs1Algorithm r4 = com.google.crypto.tink.proto.JwtRsaSsaPkcs1Algorithm.RS512     // Catch: java.lang.NoSuchFieldError -> L5c
                int r4 = r4.ordinal()     // Catch: java.lang.NoSuchFieldError -> L5c
                r3[r4] = r2     // Catch: java.lang.NoSuchFieldError -> L5c
                goto L5d
            L5c:
                r3 = move-exception
            L5d:
                com.google.crypto.tink.proto.JwtEcdsaAlgorithm[] r3 = com.google.crypto.tink.proto.JwtEcdsaAlgorithm.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                com.google.crypto.tink.jwt.JwkSetConverter.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$JwtEcdsaAlgorithm = r3
                int[] r3 = com.google.crypto.tink.jwt.JwkSetConverter.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$JwtEcdsaAlgorithm     // Catch: java.lang.NoSuchFieldError -> L71
                com.google.crypto.tink.proto.JwtEcdsaAlgorithm r4 = com.google.crypto.tink.proto.JwtEcdsaAlgorithm.ES256     // Catch: java.lang.NoSuchFieldError -> L71
                int r4 = r4.ordinal()     // Catch: java.lang.NoSuchFieldError -> L71
                r3[r4] = r0     // Catch: java.lang.NoSuchFieldError -> L71
                goto L72
            L71:
                r0 = move-exception
            L72:
                int[] r0 = com.google.crypto.tink.jwt.JwkSetConverter.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$JwtEcdsaAlgorithm     // Catch: java.lang.NoSuchFieldError -> L7d
                com.google.crypto.tink.proto.JwtEcdsaAlgorithm r3 = com.google.crypto.tink.proto.JwtEcdsaAlgorithm.ES384     // Catch: java.lang.NoSuchFieldError -> L7d
                int r3 = r3.ordinal()     // Catch: java.lang.NoSuchFieldError -> L7d
                r0[r3] = r1     // Catch: java.lang.NoSuchFieldError -> L7d
                goto L7e
            L7d:
                r0 = move-exception
            L7e:
                int[] r0 = com.google.crypto.tink.jwt.JwkSetConverter.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$JwtEcdsaAlgorithm     // Catch: java.lang.NoSuchFieldError -> L89
                com.google.crypto.tink.proto.JwtEcdsaAlgorithm r1 = com.google.crypto.tink.proto.JwtEcdsaAlgorithm.ES512     // Catch: java.lang.NoSuchFieldError -> L89
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L89
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L89
                goto L8a
            L89:
                r0 = move-exception
            L8a:
                return
        }
    }

    private JwkSetConverter() {
            r0 = this;
            r0.<init>()
            return
    }

    private static com.google.gson.JsonObject convertJwtEcdsaKey(com.google.crypto.tink.internal.ProtoKeySerialization r8) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r8.getValue()     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> Lae
            com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r1 = com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry()     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> Lae
            com.google.crypto.tink.proto.JwtEcdsaPublicKey r0 = com.google.crypto.tink.proto.JwtEcdsaPublicKey.parseFrom(r0, r1)     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> Lae
            int[] r1 = com.google.crypto.tink.jwt.JwkSetConverter.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$JwtEcdsaAlgorithm
            com.google.crypto.tink.proto.JwtEcdsaAlgorithm r2 = r0.getAlgorithm()
            int r2 = r2.ordinal()
            r1 = r1[r2]
            switch(r1) {
                case 1: goto L2f;
                case 2: goto L2a;
                case 3: goto L25;
                default: goto L1d;
            }
        L1d:
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException
            java.lang.String r2 = "unknown algorithm"
            r1.<init>(r2)
            throw r1
        L25:
            java.lang.String r1 = "ES512"
            java.lang.String r2 = "P-521"
            goto L34
        L2a:
            java.lang.String r1 = "ES384"
            java.lang.String r2 = "P-384"
            goto L34
        L2f:
            java.lang.String r1 = "ES256"
            java.lang.String r2 = "P-256"
        L34:
            com.google.gson.JsonObject r3 = new com.google.gson.JsonObject
            r3.<init>()
            java.lang.String r4 = "kty"
            java.lang.String r5 = "EC"
            r3.addProperty(r4, r5)
            java.lang.String r4 = "crv"
            r3.addProperty(r4, r2)
            com.google.crypto.tink.shaded.protobuf.ByteString r4 = r0.getX()
            byte[] r4 = r4.toByteArray()
            java.lang.String r4 = com.google.crypto.tink.subtle.Base64.urlSafeEncode(r4)
            java.lang.String r5 = "x"
            r3.addProperty(r5, r4)
            com.google.crypto.tink.shaded.protobuf.ByteString r4 = r0.getY()
            byte[] r4 = r4.toByteArray()
            java.lang.String r4 = com.google.crypto.tink.subtle.Base64.urlSafeEncode(r4)
            java.lang.String r5 = "y"
            r3.addProperty(r5, r4)
            java.lang.String r4 = "use"
            java.lang.String r5 = "sig"
            r3.addProperty(r4, r5)
            java.lang.String r4 = "alg"
            r3.addProperty(r4, r1)
            com.google.gson.JsonArray r4 = new com.google.gson.JsonArray
            r4.<init>()
            java.lang.String r5 = "verify"
            r4.add(r5)
            java.lang.String r5 = "key_ops"
            r3.add(r5, r4)
            java.lang.Integer r5 = r8.getIdRequirementOrNull()
            java.util.Optional r5 = getKid(r5)
            boolean r6 = r5.isPresent()
            java.lang.String r7 = "kid"
            if (r6 == 0) goto L9c
            java.lang.Object r6 = r5.get()
            java.lang.String r6 = (java.lang.String) r6
            r3.addProperty(r7, r6)
            goto Lad
        L9c:
            boolean r6 = r0.hasCustomKid()
            if (r6 == 0) goto Lad
            com.google.crypto.tink.proto.JwtEcdsaPublicKey$CustomKid r6 = r0.getCustomKid()
            java.lang.String r6 = r6.getValue()
            r3.addProperty(r7, r6)
        Lad:
            return r3
        Lae:
            r0 = move-exception
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException
            java.lang.String r2 = "failed to parse value as JwtEcdsaPublicKey proto"
            r1.<init>(r2, r0)
            throw r1
    }

    private static com.google.gson.JsonObject convertJwtRsaSsaPkcs1(com.google.crypto.tink.internal.ProtoKeySerialization r7) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r7.getValue()     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> La3
            com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r1 = com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry()     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> La3
            com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey r0 = com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey.parseFrom(r0, r1)     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> La3
            int[] r1 = com.google.crypto.tink.jwt.JwkSetConverter.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$JwtRsaSsaPkcs1Algorithm
            com.google.crypto.tink.proto.JwtRsaSsaPkcs1Algorithm r2 = r0.getAlgorithm()
            int r2 = r2.ordinal()
            r1 = r1[r2]
            switch(r1) {
                case 1: goto L2b;
                case 2: goto L28;
                case 3: goto L25;
                default: goto L1d;
            }
        L1d:
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException
            java.lang.String r2 = "unknown algorithm"
            r1.<init>(r2)
            throw r1
        L25:
            java.lang.String r1 = "RS512"
            goto L2e
        L28:
            java.lang.String r1 = "RS384"
            goto L2e
        L2b:
            java.lang.String r1 = "RS256"
        L2e:
            com.google.gson.JsonObject r2 = new com.google.gson.JsonObject
            r2.<init>()
            java.lang.String r3 = "kty"
            java.lang.String r4 = "RSA"
            r2.addProperty(r3, r4)
            com.google.crypto.tink.shaded.protobuf.ByteString r3 = r0.getN()
            byte[] r3 = r3.toByteArray()
            java.lang.String r3 = com.google.crypto.tink.subtle.Base64.urlSafeEncode(r3)
            java.lang.String r4 = "n"
            r2.addProperty(r4, r3)
            com.google.crypto.tink.shaded.protobuf.ByteString r3 = r0.getE()
            byte[] r3 = r3.toByteArray()
            java.lang.String r3 = com.google.crypto.tink.subtle.Base64.urlSafeEncode(r3)
            java.lang.String r4 = "e"
            r2.addProperty(r4, r3)
            java.lang.String r3 = "use"
            java.lang.String r4 = "sig"
            r2.addProperty(r3, r4)
            java.lang.String r3 = "alg"
            r2.addProperty(r3, r1)
            com.google.gson.JsonArray r3 = new com.google.gson.JsonArray
            r3.<init>()
            java.lang.String r4 = "verify"
            r3.add(r4)
            java.lang.String r4 = "key_ops"
            r2.add(r4, r3)
            java.lang.Integer r4 = r7.getIdRequirementOrNull()
            java.util.Optional r4 = getKid(r4)
            boolean r5 = r4.isPresent()
            java.lang.String r6 = "kid"
            if (r5 == 0) goto L91
            java.lang.Object r5 = r4.get()
            java.lang.String r5 = (java.lang.String) r5
            r2.addProperty(r6, r5)
            goto La2
        L91:
            boolean r5 = r0.hasCustomKid()
            if (r5 == 0) goto La2
            com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey$CustomKid r5 = r0.getCustomKid()
            java.lang.String r5 = r5.getValue()
            r2.addProperty(r6, r5)
        La2:
            return r2
        La3:
            r0 = move-exception
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException
            java.lang.String r2 = "failed to parse value as JwtRsaSsaPkcs1PublicKey proto"
            r1.<init>(r2, r0)
            throw r1
    }

    private static com.google.gson.JsonObject convertJwtRsaSsaPss(com.google.crypto.tink.internal.ProtoKeySerialization r7) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = r7.getValue()     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> La3
            com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r1 = com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry()     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> La3
            com.google.crypto.tink.proto.JwtRsaSsaPssPublicKey r0 = com.google.crypto.tink.proto.JwtRsaSsaPssPublicKey.parseFrom(r0, r1)     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException -> La3
            int[] r1 = com.google.crypto.tink.jwt.JwkSetConverter.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$JwtRsaSsaPssAlgorithm
            com.google.crypto.tink.proto.JwtRsaSsaPssAlgorithm r2 = r0.getAlgorithm()
            int r2 = r2.ordinal()
            r1 = r1[r2]
            switch(r1) {
                case 1: goto L2b;
                case 2: goto L28;
                case 3: goto L25;
                default: goto L1d;
            }
        L1d:
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException
            java.lang.String r2 = "unknown algorithm"
            r1.<init>(r2)
            throw r1
        L25:
            java.lang.String r1 = "PS512"
            goto L2e
        L28:
            java.lang.String r1 = "PS384"
            goto L2e
        L2b:
            java.lang.String r1 = "PS256"
        L2e:
            com.google.gson.JsonObject r2 = new com.google.gson.JsonObject
            r2.<init>()
            java.lang.String r3 = "kty"
            java.lang.String r4 = "RSA"
            r2.addProperty(r3, r4)
            com.google.crypto.tink.shaded.protobuf.ByteString r3 = r0.getN()
            byte[] r3 = r3.toByteArray()
            java.lang.String r3 = com.google.crypto.tink.subtle.Base64.urlSafeEncode(r3)
            java.lang.String r4 = "n"
            r2.addProperty(r4, r3)
            com.google.crypto.tink.shaded.protobuf.ByteString r3 = r0.getE()
            byte[] r3 = r3.toByteArray()
            java.lang.String r3 = com.google.crypto.tink.subtle.Base64.urlSafeEncode(r3)
            java.lang.String r4 = "e"
            r2.addProperty(r4, r3)
            java.lang.String r3 = "use"
            java.lang.String r4 = "sig"
            r2.addProperty(r3, r4)
            java.lang.String r3 = "alg"
            r2.addProperty(r3, r1)
            com.google.gson.JsonArray r3 = new com.google.gson.JsonArray
            r3.<init>()
            java.lang.String r4 = "verify"
            r3.add(r4)
            java.lang.String r4 = "key_ops"
            r2.add(r4, r3)
            java.lang.Integer r4 = r7.getIdRequirementOrNull()
            java.util.Optional r4 = getKid(r4)
            boolean r5 = r4.isPresent()
            java.lang.String r6 = "kid"
            if (r5 == 0) goto L91
            java.lang.Object r5 = r4.get()
            java.lang.String r5 = (java.lang.String) r5
            r2.addProperty(r6, r5)
            goto La2
        L91:
            boolean r5 = r0.hasCustomKid()
            if (r5 == 0) goto La2
            com.google.crypto.tink.proto.JwtRsaSsaPssPublicKey$CustomKid r5 = r0.getCustomKid()
            java.lang.String r5 = r5.getValue()
            r2.addProperty(r6, r5)
        La2:
            return r2
        La3:
            r0 = move-exception
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException
            java.lang.String r2 = "failed to parse value as JwtRsaSsaPssPublicKey proto"
            r1.<init>(r2, r0)
            throw r1
    }

    private static com.google.crypto.tink.internal.ProtoKeySerialization convertToEcdsaKey(com.google.gson.JsonObject r7) throws java.security.GeneralSecurityException {
            java.lang.String r0 = "alg"
            java.lang.String r1 = getStringItem(r7, r0)
            int r2 = r1.hashCode()
            r3 = 0
            switch(r2) {
                case 66245349: goto L23;
                case 66246401: goto L19;
                case 66248104: goto Lf;
                default: goto Le;
            }
        Le:
            goto L2d
        Lf:
            java.lang.String r2 = "ES512"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto Le
            r1 = 2
            goto L2e
        L19:
            java.lang.String r2 = "ES384"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto Le
            r1 = 1
            goto L2e
        L23:
            java.lang.String r2 = "ES256"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto Le
            r1 = r3
            goto L2e
        L2d:
            r1 = -1
        L2e:
            java.lang.String r2 = "crv"
            switch(r1) {
                case 0: goto L60;
                case 1: goto L58;
                case 2: goto L50;
                default: goto L33;
            }
        L33:
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Unknown Ecdsa Algorithm: "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r0 = getStringItem(r7, r0)
            java.lang.StringBuilder r0 = r2.append(r0)
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L50:
            java.lang.String r0 = "P-521"
            expectStringItem(r7, r2, r0)
            com.google.crypto.tink.proto.JwtEcdsaAlgorithm r0 = com.google.crypto.tink.proto.JwtEcdsaAlgorithm.ES512
            goto L68
        L58:
            java.lang.String r0 = "P-384"
            expectStringItem(r7, r2, r0)
            com.google.crypto.tink.proto.JwtEcdsaAlgorithm r0 = com.google.crypto.tink.proto.JwtEcdsaAlgorithm.ES384
            goto L68
        L60:
            java.lang.String r0 = "P-256"
            expectStringItem(r7, r2, r0)
            com.google.crypto.tink.proto.JwtEcdsaAlgorithm r0 = com.google.crypto.tink.proto.JwtEcdsaAlgorithm.ES256
        L68:
            java.lang.String r1 = "d"
            boolean r1 = r7.has(r1)
            if (r1 != 0) goto Le2
            java.lang.String r1 = "kty"
            java.lang.String r2 = "EC"
            expectStringItem(r7, r1, r2)
            validateUseIsSig(r7)
            validateKeyOpsIsVerify(r7)
            com.google.crypto.tink.proto.JwtEcdsaPublicKey$Builder r1 = com.google.crypto.tink.proto.JwtEcdsaPublicKey.newBuilder()
            com.google.crypto.tink.proto.JwtEcdsaPublicKey$Builder r1 = r1.setVersion(r3)
            com.google.crypto.tink.proto.JwtEcdsaPublicKey$Builder r1 = r1.setAlgorithm(r0)
            java.lang.String r2 = "x"
            java.lang.String r2 = getStringItem(r7, r2)
            byte[] r2 = com.google.crypto.tink.subtle.Base64.urlSafeDecode(r2)
            com.google.crypto.tink.shaded.protobuf.ByteString r2 = com.google.crypto.tink.shaded.protobuf.ByteString.copyFrom(r2)
            com.google.crypto.tink.proto.JwtEcdsaPublicKey$Builder r1 = r1.setX(r2)
            java.lang.String r2 = "y"
            java.lang.String r2 = getStringItem(r7, r2)
            byte[] r2 = com.google.crypto.tink.subtle.Base64.urlSafeDecode(r2)
            com.google.crypto.tink.shaded.protobuf.ByteString r2 = com.google.crypto.tink.shaded.protobuf.ByteString.copyFrom(r2)
            com.google.crypto.tink.proto.JwtEcdsaPublicKey$Builder r1 = r1.setY(r2)
            java.lang.String r2 = "kid"
            boolean r3 = r7.has(r2)
            if (r3 == 0) goto Lcb
        Lb6:
            com.google.crypto.tink.proto.JwtEcdsaPublicKey$CustomKid$Builder r3 = com.google.crypto.tink.proto.JwtEcdsaPublicKey.CustomKid.newBuilder()
            java.lang.String r2 = getStringItem(r7, r2)
            com.google.crypto.tink.proto.JwtEcdsaPublicKey$CustomKid$Builder r2 = r3.setValue(r2)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r2 = r2.build()
            com.google.crypto.tink.proto.JwtEcdsaPublicKey$CustomKid r2 = (com.google.crypto.tink.proto.JwtEcdsaPublicKey.CustomKid) r2
            r1.setCustomKid(r2)
        Lcb:
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r2 = r1.build()
            com.google.crypto.tink.proto.JwtEcdsaPublicKey r2 = (com.google.crypto.tink.proto.JwtEcdsaPublicKey) r2
            com.google.crypto.tink.shaded.protobuf.ByteString r2 = r2.toByteString()
            com.google.crypto.tink.proto.KeyData$KeyMaterialType r3 = com.google.crypto.tink.proto.KeyData.KeyMaterialType.ASYMMETRIC_PUBLIC
            com.google.crypto.tink.proto.OutputPrefixType r4 = com.google.crypto.tink.proto.OutputPrefixType.RAW
            java.lang.String r5 = "type.googleapis.com/google.crypto.tink.JwtEcdsaPublicKey"
            r6 = 0
            com.google.crypto.tink.internal.ProtoKeySerialization r2 = com.google.crypto.tink.internal.ProtoKeySerialization.create(r5, r2, r3, r4, r6)
            return r2
        Le2:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "importing ECDSA private keys is not implemented"
            r1.<init>(r2)
            throw r1
    }

    private static com.google.crypto.tink.internal.ProtoKeySerialization convertToRsaSsaPkcs1Key(com.google.gson.JsonObject r7) throws java.security.GeneralSecurityException {
            java.lang.String r0 = "alg"
            java.lang.String r1 = getStringItem(r7, r0)
            int r2 = r1.hashCode()
            r3 = 0
            switch(r2) {
                case 78251122: goto L23;
                case 78252174: goto L19;
                case 78253877: goto Lf;
                default: goto Le;
            }
        Le:
            goto L2d
        Lf:
            java.lang.String r2 = "RS512"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto Le
            r1 = 2
            goto L2e
        L19:
            java.lang.String r2 = "RS384"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto Le
            r1 = 1
            goto L2e
        L23:
            java.lang.String r2 = "RS256"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto Le
            r1 = r3
            goto L2e
        L2d:
            r1 = -1
        L2e:
            switch(r1) {
                case 0: goto L54;
                case 1: goto L51;
                case 2: goto L4e;
                default: goto L31;
            }
        L31:
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Unknown Rsa Algorithm: "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r0 = getStringItem(r7, r0)
            java.lang.StringBuilder r0 = r2.append(r0)
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L4e:
            com.google.crypto.tink.proto.JwtRsaSsaPkcs1Algorithm r0 = com.google.crypto.tink.proto.JwtRsaSsaPkcs1Algorithm.RS512
            goto L57
        L51:
            com.google.crypto.tink.proto.JwtRsaSsaPkcs1Algorithm r0 = com.google.crypto.tink.proto.JwtRsaSsaPkcs1Algorithm.RS384
            goto L57
        L54:
            com.google.crypto.tink.proto.JwtRsaSsaPkcs1Algorithm r0 = com.google.crypto.tink.proto.JwtRsaSsaPkcs1Algorithm.RS256
        L57:
            java.lang.String r1 = "p"
            boolean r1 = r7.has(r1)
            if (r1 != 0) goto Lf9
            java.lang.String r1 = "q"
            boolean r1 = r7.has(r1)
            if (r1 != 0) goto Lf9
            java.lang.String r1 = "dp"
            boolean r1 = r7.has(r1)
            if (r1 != 0) goto Lf9
            java.lang.String r1 = "dq"
            boolean r1 = r7.has(r1)
            if (r1 != 0) goto Lf9
            java.lang.String r1 = "d"
            boolean r1 = r7.has(r1)
            if (r1 != 0) goto Lf9
            java.lang.String r1 = "qi"
            boolean r1 = r7.has(r1)
            if (r1 != 0) goto Lf9
            java.lang.String r1 = "kty"
            java.lang.String r2 = "RSA"
            expectStringItem(r7, r1, r2)
            validateUseIsSig(r7)
            validateKeyOpsIsVerify(r7)
            com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey$Builder r1 = com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey.newBuilder()
            com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey$Builder r1 = r1.setVersion(r3)
            com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey$Builder r1 = r1.setAlgorithm(r0)
            java.lang.String r2 = "e"
            java.lang.String r2 = getStringItem(r7, r2)
            byte[] r2 = com.google.crypto.tink.subtle.Base64.urlSafeDecode(r2)
            com.google.crypto.tink.shaded.protobuf.ByteString r2 = com.google.crypto.tink.shaded.protobuf.ByteString.copyFrom(r2)
            com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey$Builder r1 = r1.setE(r2)
            java.lang.String r2 = "n"
            java.lang.String r2 = getStringItem(r7, r2)
            byte[] r2 = com.google.crypto.tink.subtle.Base64.urlSafeDecode(r2)
            com.google.crypto.tink.shaded.protobuf.ByteString r2 = com.google.crypto.tink.shaded.protobuf.ByteString.copyFrom(r2)
            com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey$Builder r1 = r1.setN(r2)
            java.lang.String r2 = "kid"
            boolean r3 = r7.has(r2)
            if (r3 == 0) goto Le2
        Lcd:
            com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey$CustomKid$Builder r3 = com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey.CustomKid.newBuilder()
            java.lang.String r2 = getStringItem(r7, r2)
            com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey$CustomKid$Builder r2 = r3.setValue(r2)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r2 = r2.build()
            com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey$CustomKid r2 = (com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey.CustomKid) r2
            r1.setCustomKid(r2)
        Le2:
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r2 = r1.build()
            com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey r2 = (com.google.crypto.tink.proto.JwtRsaSsaPkcs1PublicKey) r2
            com.google.crypto.tink.shaded.protobuf.ByteString r2 = r2.toByteString()
            com.google.crypto.tink.proto.KeyData$KeyMaterialType r3 = com.google.crypto.tink.proto.KeyData.KeyMaterialType.ASYMMETRIC_PUBLIC
            com.google.crypto.tink.proto.OutputPrefixType r4 = com.google.crypto.tink.proto.OutputPrefixType.RAW
            java.lang.String r5 = "type.googleapis.com/google.crypto.tink.JwtRsaSsaPkcs1PublicKey"
            r6 = 0
            com.google.crypto.tink.internal.ProtoKeySerialization r2 = com.google.crypto.tink.internal.ProtoKeySerialization.create(r5, r2, r3, r4, r6)
            return r2
        Lf9:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "importing RSA private keys is not implemented"
            r1.<init>(r2)
            throw r1
    }

    private static com.google.crypto.tink.internal.ProtoKeySerialization convertToRsaSsaPssKey(com.google.gson.JsonObject r7) throws java.security.GeneralSecurityException {
            java.lang.String r0 = "alg"
            java.lang.String r1 = getStringItem(r7, r0)
            int r2 = r1.hashCode()
            r3 = 0
            switch(r2) {
                case 76404080: goto L23;
                case 76405132: goto L19;
                case 76406835: goto Lf;
                default: goto Le;
            }
        Le:
            goto L2d
        Lf:
            java.lang.String r2 = "PS512"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto Le
            r1 = 2
            goto L2e
        L19:
            java.lang.String r2 = "PS384"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto Le
            r1 = 1
            goto L2e
        L23:
            java.lang.String r2 = "PS256"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto Le
            r1 = r3
            goto L2e
        L2d:
            r1 = -1
        L2e:
            switch(r1) {
                case 0: goto L54;
                case 1: goto L51;
                case 2: goto L4e;
                default: goto L31;
            }
        L31:
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Unknown Rsa Algorithm: "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r0 = getStringItem(r7, r0)
            java.lang.StringBuilder r0 = r2.append(r0)
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L4e:
            com.google.crypto.tink.proto.JwtRsaSsaPssAlgorithm r0 = com.google.crypto.tink.proto.JwtRsaSsaPssAlgorithm.PS512
            goto L57
        L51:
            com.google.crypto.tink.proto.JwtRsaSsaPssAlgorithm r0 = com.google.crypto.tink.proto.JwtRsaSsaPssAlgorithm.PS384
            goto L57
        L54:
            com.google.crypto.tink.proto.JwtRsaSsaPssAlgorithm r0 = com.google.crypto.tink.proto.JwtRsaSsaPssAlgorithm.PS256
        L57:
            java.lang.String r1 = "p"
            boolean r1 = r7.has(r1)
            if (r1 != 0) goto Lf7
            java.lang.String r1 = "q"
            boolean r1 = r7.has(r1)
            if (r1 != 0) goto Lf7
            java.lang.String r1 = "dq"
            boolean r2 = r7.has(r1)
            if (r2 != 0) goto Lf7
            boolean r1 = r7.has(r1)
            if (r1 != 0) goto Lf7
            java.lang.String r1 = "d"
            boolean r1 = r7.has(r1)
            if (r1 != 0) goto Lf7
            java.lang.String r1 = "qi"
            boolean r1 = r7.has(r1)
            if (r1 != 0) goto Lf7
            java.lang.String r1 = "kty"
            java.lang.String r2 = "RSA"
            expectStringItem(r7, r1, r2)
            validateUseIsSig(r7)
            validateKeyOpsIsVerify(r7)
            com.google.crypto.tink.proto.JwtRsaSsaPssPublicKey$Builder r1 = com.google.crypto.tink.proto.JwtRsaSsaPssPublicKey.newBuilder()
            com.google.crypto.tink.proto.JwtRsaSsaPssPublicKey$Builder r1 = r1.setVersion(r3)
            com.google.crypto.tink.proto.JwtRsaSsaPssPublicKey$Builder r1 = r1.setAlgorithm(r0)
            java.lang.String r2 = "e"
            java.lang.String r2 = getStringItem(r7, r2)
            byte[] r2 = com.google.crypto.tink.subtle.Base64.urlSafeDecode(r2)
            com.google.crypto.tink.shaded.protobuf.ByteString r2 = com.google.crypto.tink.shaded.protobuf.ByteString.copyFrom(r2)
            com.google.crypto.tink.proto.JwtRsaSsaPssPublicKey$Builder r1 = r1.setE(r2)
            java.lang.String r2 = "n"
            java.lang.String r2 = getStringItem(r7, r2)
            byte[] r2 = com.google.crypto.tink.subtle.Base64.urlSafeDecode(r2)
            com.google.crypto.tink.shaded.protobuf.ByteString r2 = com.google.crypto.tink.shaded.protobuf.ByteString.copyFrom(r2)
            com.google.crypto.tink.proto.JwtRsaSsaPssPublicKey$Builder r1 = r1.setN(r2)
            java.lang.String r2 = "kid"
            boolean r3 = r7.has(r2)
            if (r3 == 0) goto Le0
        Lcb:
            com.google.crypto.tink.proto.JwtRsaSsaPssPublicKey$CustomKid$Builder r3 = com.google.crypto.tink.proto.JwtRsaSsaPssPublicKey.CustomKid.newBuilder()
            java.lang.String r2 = getStringItem(r7, r2)
            com.google.crypto.tink.proto.JwtRsaSsaPssPublicKey$CustomKid$Builder r2 = r3.setValue(r2)
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r2 = r2.build()
            com.google.crypto.tink.proto.JwtRsaSsaPssPublicKey$CustomKid r2 = (com.google.crypto.tink.proto.JwtRsaSsaPssPublicKey.CustomKid) r2
            r1.setCustomKid(r2)
        Le0:
            com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite r2 = r1.build()
            com.google.crypto.tink.proto.JwtRsaSsaPssPublicKey r2 = (com.google.crypto.tink.proto.JwtRsaSsaPssPublicKey) r2
            com.google.crypto.tink.shaded.protobuf.ByteString r2 = r2.toByteString()
            com.google.crypto.tink.proto.KeyData$KeyMaterialType r3 = com.google.crypto.tink.proto.KeyData.KeyMaterialType.ASYMMETRIC_PUBLIC
            com.google.crypto.tink.proto.OutputPrefixType r4 = com.google.crypto.tink.proto.OutputPrefixType.RAW
            java.lang.String r5 = "type.googleapis.com/google.crypto.tink.JwtRsaSsaPssPublicKey"
            r6 = 0
            com.google.crypto.tink.internal.ProtoKeySerialization r2 = com.google.crypto.tink.internal.ProtoKeySerialization.create(r5, r2, r3, r4, r6)
            return r2
        Lf7:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "importing RSA private keys is not implemented"
            r1.<init>(r2)
            throw r1
    }

    private static void expectStringItem(com.google.gson.JsonObject r4, java.lang.String r5, java.lang.String r6) throws java.security.GeneralSecurityException {
            java.lang.String r0 = getStringItem(r4, r5)
            boolean r1 = r0.equals(r6)
            if (r1 == 0) goto Lb
            return
        Lb:
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "unexpected "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r5)
            java.lang.String r3 = " value: "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r0)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    @java.lang.Deprecated
    public static java.lang.String fromKeysetHandle(com.google.crypto.tink.KeysetHandle r1, com.google.crypto.tink.tinkkey.KeyAccess r2) throws java.io.IOException, java.security.GeneralSecurityException {
            java.lang.String r0 = fromPublicKeysetHandle(r1)
            return r0
    }

    public static java.lang.String fromPublicKeysetHandle(com.google.crypto.tink.KeysetHandle r9) throws java.io.IOException, java.security.GeneralSecurityException {
            com.google.gson.JsonArray r0 = new com.google.gson.JsonArray
            r0.<init>()
            r1 = 0
        L6:
            int r2 = r9.size()
            if (r1 >= r2) goto Lb9
            com.google.crypto.tink.KeysetHandle$Entry r2 = r9.getAt(r1)
            com.google.crypto.tink.KeyStatus r3 = r2.getStatus()
            com.google.crypto.tink.KeyStatus r4 = com.google.crypto.tink.KeyStatus.ENABLED
            if (r3 == r4) goto L1a
            goto La5
        L1a:
            com.google.crypto.tink.Key r3 = r2.getKey()
            boolean r4 = r3 instanceof com.google.crypto.tink.internal.LegacyProtoKey
            if (r4 == 0) goto Lb1
            r4 = r3
            com.google.crypto.tink.internal.LegacyProtoKey r4 = (com.google.crypto.tink.internal.LegacyProtoKey) r4
            r5 = 0
            com.google.crypto.tink.internal.ProtoKeySerialization r5 = r4.getSerialization(r5)
            com.google.crypto.tink.proto.OutputPrefixType r6 = r5.getOutputPrefixType()
            com.google.crypto.tink.proto.OutputPrefixType r7 = com.google.crypto.tink.proto.OutputPrefixType.RAW
            if (r6 == r7) goto L43
            com.google.crypto.tink.proto.OutputPrefixType r6 = r5.getOutputPrefixType()
            com.google.crypto.tink.proto.OutputPrefixType r7 = com.google.crypto.tink.proto.OutputPrefixType.TINK
            if (r6 != r7) goto L3b
            goto L43
        L3b:
            java.security.GeneralSecurityException r6 = new java.security.GeneralSecurityException
            java.lang.String r7 = "only OutputPrefixType RAW and TINK are supported"
            r6.<init>(r7)
            throw r6
        L43:
            com.google.crypto.tink.proto.KeyData$KeyMaterialType r6 = r5.getKeyMaterialType()
            com.google.crypto.tink.proto.KeyData$KeyMaterialType r7 = com.google.crypto.tink.proto.KeyData.KeyMaterialType.ASYMMETRIC_PUBLIC
            if (r6 != r7) goto La9
            java.lang.String r6 = r5.getTypeUrl()
            int r7 = r6.hashCode()
            switch(r7) {
                case -1204668709: goto L6b;
                case 516334794: goto L61;
                case 1174255008: goto L57;
                default: goto L56;
            }
        L56:
            goto L75
        L57:
            java.lang.String r7 = "type.googleapis.com/google.crypto.tink.JwtRsaSsaPssPublicKey"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L56
            r6 = 2
            goto L76
        L61:
            java.lang.String r7 = "type.googleapis.com/google.crypto.tink.JwtRsaSsaPkcs1PublicKey"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L56
            r6 = 1
            goto L76
        L6b:
            java.lang.String r7 = "type.googleapis.com/google.crypto.tink.JwtEcdsaPublicKey"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L56
            r6 = 0
            goto L76
        L75:
            r6 = -1
        L76:
            switch(r6) {
                case 0: goto L9d;
                case 1: goto L95;
                case 2: goto L8d;
                default: goto L79;
            }
        L79:
            java.security.GeneralSecurityException r6 = new java.security.GeneralSecurityException
            java.lang.String r7 = r5.getTypeUrl()
            java.lang.Object[] r7 = new java.lang.Object[]{r7}
            java.lang.String r8 = "key type %s is not supported"
            java.lang.String r7 = java.lang.String.format(r8, r7)
            r6.<init>(r7)
            throw r6
        L8d:
            com.google.gson.JsonObject r6 = convertJwtRsaSsaPss(r5)
            r0.add(r6)
            goto La5
        L95:
            com.google.gson.JsonObject r6 = convertJwtRsaSsaPkcs1(r5)
            r0.add(r6)
            goto La5
        L9d:
            com.google.gson.JsonObject r6 = convertJwtEcdsaKey(r5)
            r0.add(r6)
        La5:
            int r1 = r1 + 1
            goto L6
        La9:
            java.security.GeneralSecurityException r6 = new java.security.GeneralSecurityException
            java.lang.String r7 = "only public keys can be converted"
            r6.<init>(r7)
            throw r6
        Lb1:
            java.security.GeneralSecurityException r4 = new java.security.GeneralSecurityException
            java.lang.String r5 = "only LegacyProtoKey is currently supported"
            r4.<init>(r5)
            throw r4
        Lb9:
            com.google.gson.JsonObject r1 = new com.google.gson.JsonObject
            r1.<init>()
            java.lang.String r2 = "keys"
            r1.add(r2, r0)
            java.lang.String r2 = r1.toString()
            return r2
    }

    private static java.util.Optional<java.lang.String> getKid(@javax.annotation.Nullable java.lang.Integer r2) {
            if (r2 != 0) goto L7
            java.util.Optional r0 = java.util.Optional.empty()
            return r0
        L7:
            r0 = 4
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
            int r1 = r2.intValue()
            java.nio.ByteBuffer r0 = r0.putInt(r1)
            byte[] r0 = r0.array()
            java.lang.String r1 = com.google.crypto.tink.subtle.Base64.urlSafeEncode(r0)
            java.util.Optional r1 = java.util.Optional.of(r1)
            return r1
    }

    private static java.lang.String getStringItem(com.google.gson.JsonObject r3, java.lang.String r4) throws java.security.GeneralSecurityException {
            boolean r0 = r3.has(r4)
            if (r0 == 0) goto L40
            com.google.gson.JsonElement r0 = r3.get(r4)
            boolean r0 = r0.isJsonPrimitive()
            if (r0 == 0) goto L27
            com.google.gson.JsonElement r0 = r3.get(r4)
            com.google.gson.JsonPrimitive r0 = r0.getAsJsonPrimitive()
            boolean r0 = r0.isString()
            if (r0 == 0) goto L27
            com.google.gson.JsonElement r0 = r3.get(r4)
            java.lang.String r0 = r0.getAsString()
            return r0
        L27:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r1 = r1.append(r4)
            java.lang.String r2 = " is not a string"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L40:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r1 = r1.append(r4)
            java.lang.String r2 = " not found"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    @java.lang.Deprecated
    public static com.google.crypto.tink.KeysetHandle toKeysetHandle(java.lang.String r1, com.google.crypto.tink.tinkkey.KeyAccess r2) throws java.io.IOException, java.security.GeneralSecurityException {
            com.google.crypto.tink.KeysetHandle r0 = toPublicKeysetHandle(r1)
            return r0
    }

    public static com.google.crypto.tink.KeysetHandle toPublicKeysetHandle(java.lang.String r11) throws java.io.IOException, java.security.GeneralSecurityException {
            com.google.gson.stream.JsonReader r0 = new com.google.gson.stream.JsonReader     // Catch: java.lang.StackOverflowError -> Lc6 com.google.gson.JsonParseException -> Lc8 java.lang.IllegalStateException -> Lca
            java.io.StringReader r1 = new java.io.StringReader     // Catch: java.lang.StackOverflowError -> Lc6 com.google.gson.JsonParseException -> Lc8 java.lang.IllegalStateException -> Lca
            r1.<init>(r11)     // Catch: java.lang.StackOverflowError -> Lc6 com.google.gson.JsonParseException -> Lc8 java.lang.IllegalStateException -> Lca
            r0.<init>(r1)     // Catch: java.lang.StackOverflowError -> Lc6 com.google.gson.JsonParseException -> Lc8 java.lang.IllegalStateException -> Lca
            r1 = 0
            r0.setLenient(r1)     // Catch: java.lang.StackOverflowError -> Lc6 com.google.gson.JsonParseException -> Lc8 java.lang.IllegalStateException -> Lca
            com.google.gson.JsonElement r2 = com.google.gson.internal.Streams.parse(r0)     // Catch: java.lang.StackOverflowError -> Lc6 com.google.gson.JsonParseException -> Lc8 java.lang.IllegalStateException -> Lca
            com.google.gson.JsonObject r2 = r2.getAsJsonObject()     // Catch: java.lang.StackOverflowError -> Lc6 com.google.gson.JsonParseException -> Lc8 java.lang.IllegalStateException -> Lca
            com.google.crypto.tink.KeysetHandle$Builder r0 = com.google.crypto.tink.KeysetHandle.newBuilder()
            java.lang.String r3 = "keys"
            com.google.gson.JsonElement r3 = r2.get(r3)
            com.google.gson.JsonArray r3 = r3.getAsJsonArray()
            java.util.Iterator r4 = r3.iterator()
        L29:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto Lac
            java.lang.Object r5 = r4.next()
            com.google.gson.JsonElement r5 = (com.google.gson.JsonElement) r5
            com.google.gson.JsonObject r6 = r5.getAsJsonObject()
            java.lang.String r7 = "alg"
            java.lang.String r8 = getStringItem(r6, r7)
            r9 = 2
            java.lang.String r8 = r8.substring(r1, r9)
            int r10 = r8.hashCode()
            switch(r10) {
                case 2222: goto L60;
                case 2563: goto L56;
                case 2625: goto L4c;
                default: goto L4b;
            }
        L4b:
            goto L69
        L4c:
            java.lang.String r9 = "RS"
            boolean r9 = r8.equals(r9)
            if (r9 == 0) goto L4b
            r9 = r1
            goto L6a
        L56:
            java.lang.String r9 = "PS"
            boolean r9 = r8.equals(r9)
            if (r9 == 0) goto L4b
            r9 = 1
            goto L6a
        L60:
            java.lang.String r10 = "ES"
            boolean r10 = r8.equals(r10)
            if (r10 == 0) goto L4b
            goto L6a
        L69:
            r9 = -1
        L6a:
            switch(r9) {
                case 0: goto L94;
                case 1: goto L8f;
                case 2: goto L8a;
                default: goto L6d;
            }
        L6d:
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r9 = "unexpected alg value: "
            java.lang.StringBuilder r4 = r4.append(r9)
            java.lang.String r7 = getStringItem(r6, r7)
            java.lang.StringBuilder r4 = r4.append(r7)
            java.lang.String r4 = r4.toString()
            r1.<init>(r4)
            throw r1
        L8a:
            com.google.crypto.tink.internal.ProtoKeySerialization r7 = convertToEcdsaKey(r6)
            goto L99
        L8f:
            com.google.crypto.tink.internal.ProtoKeySerialization r7 = convertToRsaSsaPssKey(r6)
            goto L99
        L94:
            com.google.crypto.tink.internal.ProtoKeySerialization r7 = convertToRsaSsaPkcs1Key(r6)
        L99:
            com.google.crypto.tink.internal.LegacyProtoKey r9 = new com.google.crypto.tink.internal.LegacyProtoKey
            r10 = 0
            r9.<init>(r7, r10)
            com.google.crypto.tink.KeysetHandle$Builder$Entry r9 = com.google.crypto.tink.KeysetHandle.importKey(r9)
            com.google.crypto.tink.KeysetHandle$Builder$Entry r9 = r9.withRandomId()
            r0.addEntry(r9)
            goto L29
        Lac:
            int r4 = r0.size()
            if (r4 <= 0) goto Lbe
            com.google.crypto.tink.KeysetHandle$Builder$Entry r1 = r0.getAt(r1)
            r1.makePrimary()
            com.google.crypto.tink.KeysetHandle r1 = r0.build()
            return r1
        Lbe:
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException
            java.lang.String r4 = "empty keyset"
            r1.<init>(r4)
            throw r1
        Lc6:
            r0 = move-exception
            goto Lcb
        Lc8:
            r0 = move-exception
            goto Lcb
        Lca:
            r0 = move-exception
        Lcb:
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException
            java.lang.String r2 = "JWK set is invalid JSON"
            r1.<init>(r2, r0)
            throw r1
    }

    private static void validateKeyOpsIsVerify(com.google.gson.JsonObject r5) throws java.security.GeneralSecurityException {
            java.lang.String r0 = "key_ops"
            boolean r1 = r5.has(r0)
            if (r1 != 0) goto L9
            return
        L9:
            com.google.gson.JsonElement r1 = r5.get(r0)
            boolean r1 = r1.isJsonArray()
            if (r1 == 0) goto L7d
            com.google.gson.JsonElement r0 = r5.get(r0)
            com.google.gson.JsonArray r0 = r0.getAsJsonArray()
            int r1 = r0.size()
            r2 = 1
            if (r1 != r2) goto L75
            r1 = 0
            com.google.gson.JsonElement r2 = r0.get(r1)
            boolean r2 = r2.isJsonPrimitive()
            if (r2 == 0) goto L6d
            com.google.gson.JsonElement r2 = r0.get(r1)
            com.google.gson.JsonPrimitive r2 = r2.getAsJsonPrimitive()
            boolean r2 = r2.isString()
            if (r2 == 0) goto L6d
            com.google.gson.JsonElement r2 = r0.get(r1)
            java.lang.String r2 = r2.getAsString()
            java.lang.String r3 = "verify"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L4c
            return
        L4c:
            java.security.GeneralSecurityException r2 = new java.security.GeneralSecurityException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "unexpected keyOps value: "
            java.lang.StringBuilder r3 = r3.append(r4)
            com.google.gson.JsonElement r1 = r0.get(r1)
            java.lang.String r1 = r1.getAsString()
            java.lang.StringBuilder r1 = r3.append(r1)
            java.lang.String r1 = r1.toString()
            r2.<init>(r1)
            throw r2
        L6d:
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException
            java.lang.String r2 = "key_ops is not a string"
            r1.<init>(r2)
            throw r1
        L75:
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException
            java.lang.String r2 = "key_ops must contain exactly one element"
            r1.<init>(r2)
            throw r1
        L7d:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "key_ops is not an array"
            r0.<init>(r1)
            throw r0
    }

    private static void validateUseIsSig(com.google.gson.JsonObject r2) throws java.security.GeneralSecurityException {
            java.lang.String r0 = "use"
            boolean r1 = r2.has(r0)
            if (r1 != 0) goto L9
            return
        L9:
            java.lang.String r1 = "sig"
            expectStringItem(r2, r0, r1)
            return
    }
}
