package com.google.crypto.tink.jwt;

/* JADX INFO: loaded from: classes.dex */
final class JwtFormat {

    static class Parts {
        java.lang.String header;
        java.lang.String payload;
        byte[] signatureOrMac;
        java.lang.String unsignedCompact;

        Parts(java.lang.String r1, byte[] r2, java.lang.String r3, java.lang.String r4) {
                r0 = this;
                r0.<init>()
                r0.unsignedCompact = r1
                r0.signatureOrMac = r2
                r0.header = r3
                r0.payload = r4
                return
        }
    }

    private JwtFormat() {
            r0 = this;
            r0.<init>()
            return
    }

    static java.lang.String createHeader(java.lang.String r3, java.util.Optional<java.lang.String> r4, java.util.Optional<java.lang.String> r5) throws java.security.InvalidAlgorithmParameterException {
            validateAlgorithm(r3)
            com.google.gson.JsonObject r0 = new com.google.gson.JsonObject
            r0.<init>()
            boolean r1 = r5.isPresent()
            if (r1 == 0) goto L19
            java.lang.Object r1 = r5.get()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = "kid"
            r0.addProperty(r2, r1)
        L19:
            java.lang.String r1 = "alg"
            r0.addProperty(r1, r3)
            boolean r1 = r4.isPresent()
            if (r1 == 0) goto L2f
            java.lang.Object r1 = r4.get()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = "typ"
            r0.addProperty(r2, r1)
        L2f:
            java.lang.String r1 = r0.toString()
            java.nio.charset.Charset r2 = com.google.crypto.tink.internal.Util.UTF_8
            byte[] r1 = r1.getBytes(r2)
            java.lang.String r1 = com.google.crypto.tink.subtle.Base64.urlSafeEncode(r1)
            return r1
    }

    static java.lang.String createSignedCompact(java.lang.String r2, byte[] r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r1 = "."
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = encodeSignature(r3)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    static java.lang.String createUnsignedCompact(java.lang.String r4, java.util.Optional<java.lang.String> r5, com.google.crypto.tink.jwt.RawJwt r6) throws java.security.InvalidAlgorithmParameterException, com.google.crypto.tink.jwt.JwtInvalidException {
            java.lang.String r0 = r6.getJsonPayload()
            boolean r1 = r6.hasTypeHeader()
            if (r1 == 0) goto L13
            java.lang.String r1 = r6.getTypeHeader()
            java.util.Optional r1 = java.util.Optional.of(r1)
            goto L17
        L13:
            java.util.Optional r1 = java.util.Optional.empty()
        L17:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = createHeader(r4, r1, r5)
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = "."
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = encodePayload(r0)
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            return r2
    }

    static java.lang.String decodeHeader(java.lang.String r3) throws com.google.crypto.tink.jwt.JwtInvalidException {
            byte[] r0 = strictUrlSafeDecode(r3)
            validateUtf8(r0)
            java.lang.String r1 = new java.lang.String
            java.nio.charset.Charset r2 = com.google.crypto.tink.internal.Util.UTF_8
            r1.<init>(r0, r2)
            return r1
    }

    static java.lang.String decodePayload(java.lang.String r3) throws com.google.crypto.tink.jwt.JwtInvalidException {
            byte[] r0 = strictUrlSafeDecode(r3)
            validateUtf8(r0)
            java.lang.String r1 = new java.lang.String
            java.nio.charset.Charset r2 = com.google.crypto.tink.internal.Util.UTF_8
            r1.<init>(r0, r2)
            return r1
    }

    static byte[] decodeSignature(java.lang.String r1) throws com.google.crypto.tink.jwt.JwtInvalidException {
            byte[] r0 = strictUrlSafeDecode(r1)
            return r0
    }

    static java.lang.String encodePayload(java.lang.String r1) {
            java.nio.charset.Charset r0 = com.google.crypto.tink.internal.Util.UTF_8
            byte[] r0 = r1.getBytes(r0)
            java.lang.String r0 = com.google.crypto.tink.subtle.Base64.urlSafeEncode(r0)
            return r0
    }

    static java.lang.String encodeSignature(byte[] r1) {
            java.lang.String r0 = com.google.crypto.tink.subtle.Base64.urlSafeEncode(r1)
            return r0
    }

    static java.util.Optional<java.lang.Integer> getKeyId(java.lang.String r3) {
            byte[] r0 = com.google.crypto.tink.subtle.Base64.urlSafeDecode(r3)
            int r1 = r0.length
            r2 = 4
            if (r1 == r2) goto Ld
            java.util.Optional r1 = java.util.Optional.empty()
            return r1
        Ld:
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.wrap(r0)
            int r1 = r1.getInt()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.util.Optional r1 = java.util.Optional.of(r1)
            return r1
    }

    static java.util.Optional<java.lang.String> getKid(int r2, com.google.crypto.tink.proto.OutputPrefixType r3) throws com.google.crypto.tink.jwt.JwtInvalidException {
            com.google.crypto.tink.proto.OutputPrefixType r0 = com.google.crypto.tink.proto.OutputPrefixType.RAW
            if (r3 != r0) goto L9
            java.util.Optional r0 = java.util.Optional.empty()
            return r0
        L9:
            com.google.crypto.tink.proto.OutputPrefixType r0 = com.google.crypto.tink.proto.OutputPrefixType.TINK
            if (r3 != r0) goto L23
            r0 = 4
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
            java.nio.ByteBuffer r0 = r0.putInt(r2)
            byte[] r0 = r0.array()
            java.lang.String r1 = com.google.crypto.tink.subtle.Base64.urlSafeEncode(r0)
            java.util.Optional r1 = java.util.Optional.of(r1)
            return r1
        L23:
            com.google.crypto.tink.jwt.JwtInvalidException r0 = new com.google.crypto.tink.jwt.JwtInvalidException
            java.lang.String r1 = "unsupported output prefix type"
            r0.<init>(r1)
            throw r0
    }

    private static java.lang.String getStringHeader(com.google.gson.JsonObject r3, java.lang.String r4) throws com.google.crypto.tink.jwt.JwtInvalidException {
            boolean r0 = r3.has(r4)
            java.lang.String r1 = "header "
            if (r0 == 0) goto L46
            com.google.gson.JsonElement r0 = r3.get(r4)
            boolean r0 = r0.isJsonPrimitive()
            if (r0 == 0) goto L29
            com.google.gson.JsonElement r0 = r3.get(r4)
            com.google.gson.JsonPrimitive r0 = r0.getAsJsonPrimitive()
            boolean r0 = r0.isString()
            if (r0 == 0) goto L29
            com.google.gson.JsonElement r0 = r3.get(r4)
            java.lang.String r0 = r0.getAsString()
            return r0
        L29:
            com.google.crypto.tink.jwt.JwtInvalidException r0 = new com.google.crypto.tink.jwt.JwtInvalidException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.StringBuilder r1 = r2.append(r1)
            java.lang.StringBuilder r1 = r1.append(r4)
            java.lang.String r2 = " is not a string"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L46:
            com.google.crypto.tink.jwt.JwtInvalidException r0 = new com.google.crypto.tink.jwt.JwtInvalidException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.StringBuilder r1 = r2.append(r1)
            java.lang.StringBuilder r1 = r1.append(r4)
            java.lang.String r2 = " does not exist"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    static java.util.Optional<java.lang.String> getTypeHeader(com.google.gson.JsonObject r2) throws com.google.crypto.tink.jwt.JwtInvalidException {
            java.lang.String r0 = "typ"
            boolean r1 = r2.has(r0)
            if (r1 == 0) goto L11
            java.lang.String r0 = getStringHeader(r2, r0)
            java.util.Optional r0 = java.util.Optional.of(r0)
            return r0
        L11:
            java.util.Optional r0 = java.util.Optional.empty()
            return r0
    }

    static boolean isValidUrlsafeBase64Char(char r1) {
            r0 = 97
            if (r1 < r0) goto L8
            r0 = 122(0x7a, float:1.71E-43)
            if (r1 <= r0) goto L23
        L8:
            r0 = 65
            if (r1 < r0) goto L10
            r0 = 90
            if (r1 <= r0) goto L23
        L10:
            r0 = 48
            if (r1 < r0) goto L18
            r0 = 57
            if (r1 <= r0) goto L23
        L18:
            r0 = 45
            if (r1 == r0) goto L23
            r0 = 95
            if (r1 != r0) goto L21
            goto L23
        L21:
            r0 = 0
            goto L24
        L23:
            r0 = 1
        L24:
            return r0
    }

    static com.google.crypto.tink.jwt.JwtFormat.Parts splitSignedCompact(java.lang.String r10) throws com.google.crypto.tink.jwt.JwtInvalidException {
            validateASCII(r10)
            r0 = 46
            int r1 = r10.lastIndexOf(r0)
            java.lang.String r2 = "only tokens in JWS compact serialization format are supported"
            if (r1 < 0) goto L4c
            r3 = 0
            java.lang.String r4 = r10.substring(r3, r1)
            int r5 = r1 + 1
            java.lang.String r5 = r10.substring(r5)
            byte[] r6 = decodeSignature(r5)
            int r7 = r4.indexOf(r0)
            if (r7 < 0) goto L46
            java.lang.String r3 = r4.substring(r3, r7)
            int r8 = r7 + 1
            java.lang.String r8 = r4.substring(r8)
            int r0 = r8.indexOf(r0)
            if (r0 > 0) goto L40
            java.lang.String r0 = decodeHeader(r3)
            java.lang.String r2 = decodePayload(r8)
            com.google.crypto.tink.jwt.JwtFormat$Parts r9 = new com.google.crypto.tink.jwt.JwtFormat$Parts
            r9.<init>(r4, r6, r0, r2)
            return r9
        L40:
            com.google.crypto.tink.jwt.JwtInvalidException r0 = new com.google.crypto.tink.jwt.JwtInvalidException
            r0.<init>(r2)
            throw r0
        L46:
            com.google.crypto.tink.jwt.JwtInvalidException r0 = new com.google.crypto.tink.jwt.JwtInvalidException
            r0.<init>(r2)
            throw r0
        L4c:
            com.google.crypto.tink.jwt.JwtInvalidException r0 = new com.google.crypto.tink.jwt.JwtInvalidException
            r0.<init>(r2)
            throw r0
    }

    static byte[] strictUrlSafeDecode(java.lang.String r4) throws com.google.crypto.tink.jwt.JwtInvalidException {
            r0 = 0
        L1:
            int r1 = r4.length()
            if (r0 >= r1) goto L1c
            char r1 = r4.charAt(r0)
            boolean r2 = isValidUrlsafeBase64Char(r1)
            if (r2 == 0) goto L14
            int r0 = r0 + 1
            goto L1
        L14:
            com.google.crypto.tink.jwt.JwtInvalidException r2 = new com.google.crypto.tink.jwt.JwtInvalidException
            java.lang.String r3 = "invalid encoding"
            r2.<init>(r3)
            throw r2
        L1c:
            byte[] r0 = com.google.crypto.tink.subtle.Base64.urlSafeDecode(r4)     // Catch: java.lang.IllegalArgumentException -> L21
            return r0
        L21:
            r0 = move-exception
            com.google.crypto.tink.jwt.JwtInvalidException r1 = new com.google.crypto.tink.jwt.JwtInvalidException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "invalid encoding: "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r0)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    static void validateASCII(java.lang.String r4) throws com.google.crypto.tink.jwt.JwtInvalidException {
            r0 = 0
        L1:
            int r1 = r4.length()
            if (r0 >= r1) goto L1a
            char r1 = r4.charAt(r0)
            r2 = r1 & 128(0x80, float:1.8E-43)
            if (r2 > 0) goto L12
            int r0 = r0 + 1
            goto L1
        L12:
            com.google.crypto.tink.jwt.JwtInvalidException r2 = new com.google.crypto.tink.jwt.JwtInvalidException
            java.lang.String r3 = "Non ascii character"
            r2.<init>(r3)
            throw r2
        L1a:
            return
    }

    private static void validateAlgorithm(java.lang.String r3) throws java.security.InvalidAlgorithmParameterException {
            int r0 = r3.hashCode()
            switch(r0) {
                case 66245349: goto L7d;
                case 66246401: goto L73;
                case 66248104: goto L69;
                case 69015912: goto L5f;
                case 69016964: goto L55;
                case 69018667: goto L4b;
                case 76404080: goto L40;
                case 76405132: goto L35;
                case 76406835: goto L2a;
                case 78251122: goto L20;
                case 78252174: goto L15;
                case 78253877: goto L9;
                default: goto L7;
            }
        L7:
            goto L87
        L9:
            java.lang.String r0 = "RS512"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L7
            r0 = 8
            goto L88
        L15:
            java.lang.String r0 = "RS384"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L7
            r0 = 7
            goto L88
        L20:
            java.lang.String r0 = "RS256"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L7
            r0 = 6
            goto L88
        L2a:
            java.lang.String r0 = "PS512"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L7
            r0 = 11
            goto L88
        L35:
            java.lang.String r0 = "PS384"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L7
            r0 = 10
            goto L88
        L40:
            java.lang.String r0 = "PS256"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L7
            r0 = 9
            goto L88
        L4b:
            java.lang.String r0 = "HS512"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L7
            r0 = 2
            goto L88
        L55:
            java.lang.String r0 = "HS384"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L7
            r0 = 1
            goto L88
        L5f:
            java.lang.String r0 = "HS256"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L7
            r0 = 0
            goto L88
        L69:
            java.lang.String r0 = "ES512"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L7
            r0 = 5
            goto L88
        L73:
            java.lang.String r0 = "ES384"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L7
            r0 = 4
            goto L88
        L7d:
            java.lang.String r0 = "ES256"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L7
            r0 = 3
            goto L88
        L87:
            r0 = -1
        L88:
            switch(r0) {
                case 0: goto La4;
                case 1: goto La4;
                case 2: goto La4;
                case 3: goto La4;
                case 4: goto La4;
                case 5: goto La4;
                case 6: goto La4;
                case 7: goto La4;
                case 8: goto La4;
                case 9: goto La4;
                case 10: goto La4;
                case 11: goto La4;
                default: goto L8b;
            }
        L8b:
            java.security.InvalidAlgorithmParameterException r0 = new java.security.InvalidAlgorithmParameterException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "invalid algorithm: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        La4:
            return
    }

    static void validateHeader(java.lang.String r4, java.util.Optional<java.lang.String> r5, java.util.Optional<java.lang.String> r6, com.google.gson.JsonObject r7) throws java.security.InvalidAlgorithmParameterException, com.google.crypto.tink.jwt.JwtInvalidException {
            validateAlgorithm(r4)
            java.lang.String r0 = "alg"
            java.lang.String r0 = getStringHeader(r7, r0)
            boolean r1 = r0.equals(r4)
            if (r1 == 0) goto L66
            java.lang.String r1 = "crit"
            boolean r1 = r7.has(r1)
            if (r1 != 0) goto L5e
            boolean r1 = r5.isPresent()
            if (r1 == 0) goto L2c
            boolean r1 = r6.isPresent()
            if (r1 != 0) goto L24
            goto L2c
        L24:
            com.google.crypto.tink.jwt.JwtInvalidException r1 = new com.google.crypto.tink.jwt.JwtInvalidException
            java.lang.String r2 = "custom_kid can only be set for RAW keys."
            r1.<init>(r2)
            throw r1
        L2c:
            java.lang.String r1 = "kid"
            boolean r1 = r7.has(r1)
            boolean r2 = r5.isPresent()
            if (r2 == 0) goto L4c
            if (r1 == 0) goto L44
            java.lang.Object r2 = r5.get()
            java.lang.String r2 = (java.lang.String) r2
            validateKidInHeader(r2, r7)
            goto L4c
        L44:
            com.google.crypto.tink.jwt.JwtInvalidException r2 = new com.google.crypto.tink.jwt.JwtInvalidException
            java.lang.String r3 = "missing kid in header"
            r2.<init>(r3)
            throw r2
        L4c:
            boolean r2 = r6.isPresent()
            if (r2 == 0) goto L5d
            if (r1 == 0) goto L5d
            java.lang.Object r2 = r6.get()
            java.lang.String r2 = (java.lang.String) r2
            validateKidInHeader(r2, r7)
        L5d:
            return
        L5e:
            com.google.crypto.tink.jwt.JwtInvalidException r1 = new com.google.crypto.tink.jwt.JwtInvalidException
            java.lang.String r2 = "all tokens with crit headers are rejected"
            r1.<init>(r2)
            throw r1
        L66:
            java.security.InvalidAlgorithmParameterException r1 = new java.security.InvalidAlgorithmParameterException
            java.lang.Object[] r2 = new java.lang.Object[]{r4, r0}
            java.lang.String r3 = "invalid algorithm; expected %s, got %s"
            java.lang.String r2 = java.lang.String.format(r3, r2)
            r1.<init>(r2)
            throw r1
    }

    private static void validateKidInHeader(java.lang.String r3, com.google.gson.JsonObject r4) throws com.google.crypto.tink.jwt.JwtInvalidException {
            java.lang.String r0 = "kid"
            java.lang.String r0 = getStringHeader(r4, r0)
            boolean r1 = r0.equals(r3)
            if (r1 == 0) goto Ld
            return
        Ld:
            com.google.crypto.tink.jwt.JwtInvalidException r1 = new com.google.crypto.tink.jwt.JwtInvalidException
            java.lang.String r2 = "invalid kid in header"
            r1.<init>(r2)
            throw r1
    }

    static void validateUtf8(byte[] r4) throws com.google.crypto.tink.jwt.JwtInvalidException {
            java.nio.charset.Charset r0 = com.google.crypto.tink.internal.Util.UTF_8
            java.nio.charset.CharsetDecoder r0 = r0.newDecoder()
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.wrap(r4)     // Catch: java.nio.charset.CharacterCodingException -> Lf
            r0.decode(r1)     // Catch: java.nio.charset.CharacterCodingException -> Lf
            return
        Lf:
            r1 = move-exception
            com.google.crypto.tink.jwt.JwtInvalidException r2 = new com.google.crypto.tink.jwt.JwtInvalidException
            java.lang.String r3 = r1.getMessage()
            r2.<init>(r3)
            throw r2
    }
}
