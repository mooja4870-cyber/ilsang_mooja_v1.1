package com.google.crypto.tink.jwt;

/* JADX INFO: loaded from: classes.dex */
@com.google.errorprone.annotations.Immutable
public final class RawJwt {
    private static final long MAX_TIMESTAMP_VALUE = 253402300799L;
    private final com.google.gson.JsonObject payload;
    private final java.util.Optional<java.lang.String> typeHeader;

    /* JADX INFO: renamed from: com.google.crypto.tink.jwt.RawJwt$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    public static final class Builder {
        private final com.google.gson.JsonObject payload;
        private java.util.Optional<java.lang.String> typeHeader;
        private boolean withoutExpiration;

        private Builder() {
                r1 = this;
                r1.<init>()
                java.util.Optional r0 = java.util.Optional.empty()
                r1.typeHeader = r0
                r0 = 0
                r1.withoutExpiration = r0
                com.google.gson.JsonObject r0 = new com.google.gson.JsonObject
                r0.<init>()
                r1.payload = r0
                return
        }

        /* synthetic */ Builder(com.google.crypto.tink.jwt.RawJwt.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        static /* synthetic */ com.google.gson.JsonObject access$000(com.google.crypto.tink.jwt.RawJwt.Builder r1) {
                com.google.gson.JsonObject r0 = r1.payload
                return r0
        }

        static /* synthetic */ boolean access$100(com.google.crypto.tink.jwt.RawJwt.Builder r1) {
                boolean r0 = r1.withoutExpiration
                return r0
        }

        static /* synthetic */ java.util.Optional access$200(com.google.crypto.tink.jwt.RawJwt.Builder r1) {
                java.util.Optional<java.lang.String> r0 = r1.typeHeader
                return r0
        }

        private void setTimestampClaim(java.lang.String r6, java.time.Instant r7) {
                r5 = this;
                long r0 = r7.getEpochSecond()
                r2 = 253402300799(0x3afff4417f, double:1.25197371402E-312)
                int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r2 > 0) goto L22
                r2 = 0
                int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r2 < 0) goto L22
                com.google.gson.JsonObject r2 = r5.payload
                com.google.gson.JsonPrimitive r3 = new com.google.gson.JsonPrimitive
                java.lang.Long r4 = java.lang.Long.valueOf(r0)
                r3.<init>(r4)
                r2.add(r6, r3)
                return
            L22:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "timestamp of claim "
                java.lang.StringBuilder r3 = r3.append(r4)
                java.lang.StringBuilder r3 = r3.append(r6)
                java.lang.String r4 = " is out of range"
                java.lang.StringBuilder r3 = r3.append(r4)
                java.lang.String r3 = r3.toString()
                r2.<init>(r3)
                throw r2
        }

        public com.google.crypto.tink.jwt.RawJwt.Builder addAudience(java.lang.String r4) {
                r3 = this;
                boolean r0 = com.google.crypto.tink.jwt.JsonUtil.isValidString(r4)
                if (r0 == 0) goto L37
                com.google.gson.JsonObject r0 = r3.payload
                java.lang.String r1 = "aud"
                boolean r0 = r0.has(r1)
                if (r0 == 0) goto L29
                com.google.gson.JsonObject r0 = r3.payload
                com.google.gson.JsonElement r0 = r0.get(r1)
                boolean r2 = r0.isJsonArray()
                if (r2 == 0) goto L21
                com.google.gson.JsonArray r0 = r0.getAsJsonArray()
                goto L2e
            L21:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r2 = "addAudience can't be used together with setAudience"
                r1.<init>(r2)
                throw r1
            L29:
                com.google.gson.JsonArray r0 = new com.google.gson.JsonArray
                r0.<init>()
            L2e:
                r0.add(r4)
                com.google.gson.JsonObject r2 = r3.payload
                r2.add(r1, r0)
                return r3
            L37:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "invalid string"
                r0.<init>(r1)
                throw r0
        }

        public com.google.crypto.tink.jwt.RawJwt.Builder addBooleanClaim(java.lang.String r4, boolean r5) {
                r3 = this;
                com.google.crypto.tink.jwt.JwtNames.validate(r4)
                com.google.gson.JsonObject r0 = r3.payload
                com.google.gson.JsonPrimitive r1 = new com.google.gson.JsonPrimitive
                java.lang.Boolean r2 = java.lang.Boolean.valueOf(r5)
                r1.<init>(r2)
                r0.add(r4, r1)
                return r3
        }

        public com.google.crypto.tink.jwt.RawJwt.Builder addJsonArrayClaim(java.lang.String r3, java.lang.String r4) throws com.google.crypto.tink.jwt.JwtInvalidException {
                r2 = this;
                com.google.crypto.tink.jwt.JwtNames.validate(r3)
                com.google.gson.JsonObject r0 = r2.payload
                com.google.gson.JsonArray r1 = com.google.crypto.tink.jwt.JsonUtil.parseJsonArray(r4)
                r0.add(r3, r1)
                return r2
        }

        public com.google.crypto.tink.jwt.RawJwt.Builder addJsonObjectClaim(java.lang.String r3, java.lang.String r4) throws com.google.crypto.tink.jwt.JwtInvalidException {
                r2 = this;
                com.google.crypto.tink.jwt.JwtNames.validate(r3)
                com.google.gson.JsonObject r0 = r2.payload
                com.google.gson.JsonObject r1 = com.google.crypto.tink.jwt.JsonUtil.parseJson(r4)
                r0.add(r3, r1)
                return r2
        }

        public com.google.crypto.tink.jwt.RawJwt.Builder addNullClaim(java.lang.String r3) {
                r2 = this;
                com.google.crypto.tink.jwt.JwtNames.validate(r3)
                com.google.gson.JsonObject r0 = r2.payload
                com.google.gson.JsonNull r1 = com.google.gson.JsonNull.INSTANCE
                r0.add(r3, r1)
                return r2
        }

        public com.google.crypto.tink.jwt.RawJwt.Builder addNumberClaim(java.lang.String r4, double r5) {
                r3 = this;
                com.google.crypto.tink.jwt.JwtNames.validate(r4)
                com.google.gson.JsonObject r0 = r3.payload
                com.google.gson.JsonPrimitive r1 = new com.google.gson.JsonPrimitive
                java.lang.Double r2 = java.lang.Double.valueOf(r5)
                r1.<init>(r2)
                r0.add(r4, r1)
                return r3
        }

        public com.google.crypto.tink.jwt.RawJwt.Builder addStringClaim(java.lang.String r3, java.lang.String r4) {
                r2 = this;
                boolean r0 = com.google.crypto.tink.jwt.JsonUtil.isValidString(r4)
                if (r0 == 0) goto L14
                com.google.crypto.tink.jwt.JwtNames.validate(r3)
                com.google.gson.JsonObject r0 = r2.payload
                com.google.gson.JsonPrimitive r1 = new com.google.gson.JsonPrimitive
                r1.<init>(r4)
                r0.add(r3, r1)
                return r2
            L14:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                r0.<init>()
                throw r0
        }

        public com.google.crypto.tink.jwt.RawJwt build() {
                r2 = this;
                com.google.crypto.tink.jwt.RawJwt r0 = new com.google.crypto.tink.jwt.RawJwt
                r1 = 0
                r0.<init>(r2, r1)
                return r0
        }

        public com.google.crypto.tink.jwt.RawJwt.Builder setAudience(java.lang.String r4) {
                r3 = this;
                com.google.gson.JsonObject r0 = r3.payload
                java.lang.String r1 = "aud"
                boolean r0 = r0.has(r1)
                if (r0 == 0) goto L1f
                com.google.gson.JsonObject r0 = r3.payload
                com.google.gson.JsonElement r0 = r0.get(r1)
                boolean r0 = r0.isJsonArray()
                if (r0 != 0) goto L17
                goto L1f
            L17:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "setAudience can't be used together with setAudiences or addAudience"
                r0.<init>(r1)
                throw r0
            L1f:
                boolean r0 = com.google.crypto.tink.jwt.JsonUtil.isValidString(r4)
                if (r0 == 0) goto L30
                com.google.gson.JsonObject r0 = r3.payload
                com.google.gson.JsonPrimitive r2 = new com.google.gson.JsonPrimitive
                r2.<init>(r4)
                r0.add(r1, r2)
                return r3
            L30:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "invalid string"
                r0.<init>(r1)
                throw r0
        }

        public com.google.crypto.tink.jwt.RawJwt.Builder setAudiences(java.util.List<java.lang.String> r6) {
                r5 = this;
                com.google.gson.JsonObject r0 = r5.payload
                java.lang.String r1 = "aud"
                boolean r0 = r0.has(r1)
                if (r0 == 0) goto L1f
                com.google.gson.JsonObject r0 = r5.payload
                com.google.gson.JsonElement r0 = r0.get(r1)
                boolean r0 = r0.isJsonArray()
                if (r0 == 0) goto L17
                goto L1f
            L17:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "setAudiences can't be used together with setAudience"
                r0.<init>(r1)
                throw r0
            L1f:
                boolean r0 = r6.isEmpty()
                if (r0 != 0) goto L52
                com.google.gson.JsonArray r0 = new com.google.gson.JsonArray
                r0.<init>()
                java.util.Iterator r2 = r6.iterator()
            L2e:
                boolean r3 = r2.hasNext()
                if (r3 == 0) goto L4c
                java.lang.Object r3 = r2.next()
                java.lang.String r3 = (java.lang.String) r3
                boolean r4 = com.google.crypto.tink.jwt.JsonUtil.isValidString(r3)
                if (r4 == 0) goto L44
                r0.add(r3)
                goto L2e
            L44:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r2 = "invalid string"
                r1.<init>(r2)
                throw r1
            L4c:
                com.google.gson.JsonObject r2 = r5.payload
                r2.add(r1, r0)
                return r5
            L52:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "audiences must not be empty"
                r0.<init>(r1)
                throw r0
        }

        public com.google.crypto.tink.jwt.RawJwt.Builder setExpiration(java.time.Instant r2) {
                r1 = this;
                java.lang.String r0 = "exp"
                r1.setTimestampClaim(r0, r2)
                return r1
        }

        public com.google.crypto.tink.jwt.RawJwt.Builder setIssuedAt(java.time.Instant r2) {
                r1 = this;
                java.lang.String r0 = "iat"
                r1.setTimestampClaim(r0, r2)
                return r1
        }

        public com.google.crypto.tink.jwt.RawJwt.Builder setIssuer(java.lang.String r4) {
                r3 = this;
                boolean r0 = com.google.crypto.tink.jwt.JsonUtil.isValidString(r4)
                if (r0 == 0) goto L13
                com.google.gson.JsonObject r0 = r3.payload
                com.google.gson.JsonPrimitive r1 = new com.google.gson.JsonPrimitive
                r1.<init>(r4)
                java.lang.String r2 = "iss"
                r0.add(r2, r1)
                return r3
            L13:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                r0.<init>()
                throw r0
        }

        public com.google.crypto.tink.jwt.RawJwt.Builder setJwtId(java.lang.String r4) {
                r3 = this;
                boolean r0 = com.google.crypto.tink.jwt.JsonUtil.isValidString(r4)
                if (r0 == 0) goto L13
                com.google.gson.JsonObject r0 = r3.payload
                com.google.gson.JsonPrimitive r1 = new com.google.gson.JsonPrimitive
                r1.<init>(r4)
                java.lang.String r2 = "jti"
                r0.add(r2, r1)
                return r3
            L13:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                r0.<init>()
                throw r0
        }

        public com.google.crypto.tink.jwt.RawJwt.Builder setNotBefore(java.time.Instant r2) {
                r1 = this;
                java.lang.String r0 = "nbf"
                r1.setTimestampClaim(r0, r2)
                return r1
        }

        public com.google.crypto.tink.jwt.RawJwt.Builder setSubject(java.lang.String r4) {
                r3 = this;
                boolean r0 = com.google.crypto.tink.jwt.JsonUtil.isValidString(r4)
                if (r0 == 0) goto L13
                com.google.gson.JsonObject r0 = r3.payload
                com.google.gson.JsonPrimitive r1 = new com.google.gson.JsonPrimitive
                r1.<init>(r4)
                java.lang.String r2 = "sub"
                r0.add(r2, r1)
                return r3
            L13:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                r0.<init>()
                throw r0
        }

        public com.google.crypto.tink.jwt.RawJwt.Builder setTypeHeader(java.lang.String r2) {
                r1 = this;
                java.util.Optional r0 = java.util.Optional.of(r2)
                r1.typeHeader = r0
                return r1
        }

        public com.google.crypto.tink.jwt.RawJwt.Builder withoutExpiration() {
                r1 = this;
                r0 = 1
                r1.withoutExpiration = r0
                return r1
        }
    }

    private RawJwt(com.google.crypto.tink.jwt.RawJwt.Builder r3) {
            r2 = this;
            r2.<init>()
            com.google.gson.JsonObject r0 = com.google.crypto.tink.jwt.RawJwt.Builder.access$000(r3)
            java.lang.String r1 = "exp"
            boolean r0 = r0.has(r1)
            if (r0 != 0) goto L1e
            boolean r0 = com.google.crypto.tink.jwt.RawJwt.Builder.access$100(r3)
            if (r0 == 0) goto L16
            goto L1e
        L16:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "neither setExpiration() nor withoutExpiration() was called"
            r0.<init>(r1)
            throw r0
        L1e:
            com.google.gson.JsonObject r0 = com.google.crypto.tink.jwt.RawJwt.Builder.access$000(r3)
            boolean r0 = r0.has(r1)
            if (r0 == 0) goto L37
            boolean r0 = com.google.crypto.tink.jwt.RawJwt.Builder.access$100(r3)
            if (r0 != 0) goto L2f
            goto L37
        L2f:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "setExpiration() and withoutExpiration() must not be called together"
            r0.<init>(r1)
            throw r0
        L37:
            java.util.Optional r0 = com.google.crypto.tink.jwt.RawJwt.Builder.access$200(r3)
            r2.typeHeader = r0
            com.google.gson.JsonObject r0 = com.google.crypto.tink.jwt.RawJwt.Builder.access$000(r3)
            com.google.gson.JsonObject r0 = r0.deepCopy()
            r2.payload = r0
            return
    }

    /* synthetic */ RawJwt(com.google.crypto.tink.jwt.RawJwt.Builder r1, com.google.crypto.tink.jwt.RawJwt.AnonymousClass1 r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    private RawJwt(java.util.Optional<java.lang.String> r2, java.lang.String r3) throws com.google.crypto.tink.jwt.JwtInvalidException {
            r1 = this;
            r1.<init>()
            r1.typeHeader = r2
            com.google.gson.JsonObject r0 = com.google.crypto.tink.jwt.JsonUtil.parseJson(r3)
            r1.payload = r0
            java.lang.String r0 = "iss"
            r1.validateStringClaim(r0)
            java.lang.String r0 = "sub"
            r1.validateStringClaim(r0)
            java.lang.String r0 = "jti"
            r1.validateStringClaim(r0)
            java.lang.String r0 = "exp"
            r1.validateTimestampClaim(r0)
            java.lang.String r0 = "nbf"
            r1.validateTimestampClaim(r0)
            java.lang.String r0 = "iat"
            r1.validateTimestampClaim(r0)
            r1.validateAudienceClaim()
            return
    }

    static com.google.crypto.tink.jwt.RawJwt fromJsonPayload(java.util.Optional<java.lang.String> r1, java.lang.String r2) throws com.google.crypto.tink.jwt.JwtInvalidException {
            com.google.crypto.tink.jwt.RawJwt r0 = new com.google.crypto.tink.jwt.RawJwt
            r0.<init>(r1, r2)
            return r0
    }

    private java.time.Instant getInstant(java.lang.String r7) throws com.google.crypto.tink.jwt.JwtInvalidException {
            r6 = this;
            com.google.gson.JsonObject r0 = r6.payload
            boolean r0 = r0.has(r7)
            java.lang.String r1 = "claim "
            if (r0 == 0) goto L7f
            com.google.gson.JsonObject r0 = r6.payload
            com.google.gson.JsonElement r0 = r0.get(r7)
            boolean r0 = r0.isJsonPrimitive()
            if (r0 == 0) goto L62
            com.google.gson.JsonObject r0 = r6.payload
            com.google.gson.JsonElement r0 = r0.get(r7)
            com.google.gson.JsonPrimitive r0 = r0.getAsJsonPrimitive()
            boolean r0 = r0.isNumber()
            if (r0 == 0) goto L62
            com.google.gson.JsonObject r0 = r6.payload     // Catch: java.lang.NumberFormatException -> L40
            com.google.gson.JsonElement r0 = r0.get(r7)     // Catch: java.lang.NumberFormatException -> L40
            com.google.gson.JsonPrimitive r0 = r0.getAsJsonPrimitive()     // Catch: java.lang.NumberFormatException -> L40
            double r2 = r0.getAsDouble()     // Catch: java.lang.NumberFormatException -> L40
            r4 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r2 = r2 * r4
            long r4 = (long) r2     // Catch: java.lang.NumberFormatException -> L40
            java.time.Instant r0 = java.time.Instant.ofEpochMilli(r4)     // Catch: java.lang.NumberFormatException -> L40
            return r0
        L40:
            r0 = move-exception
            com.google.crypto.tink.jwt.JwtInvalidException r2 = new com.google.crypto.tink.jwt.JwtInvalidException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.StringBuilder r1 = r3.append(r1)
            java.lang.StringBuilder r1 = r1.append(r7)
            java.lang.String r3 = " is not a timestamp: "
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.StringBuilder r1 = r1.append(r0)
            java.lang.String r1 = r1.toString()
            r2.<init>(r1)
            throw r2
        L62:
            com.google.crypto.tink.jwt.JwtInvalidException r0 = new com.google.crypto.tink.jwt.JwtInvalidException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.StringBuilder r1 = r2.append(r1)
            java.lang.StringBuilder r1 = r1.append(r7)
            java.lang.String r2 = " is not a timestamp"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L7f:
            com.google.crypto.tink.jwt.JwtInvalidException r0 = new com.google.crypto.tink.jwt.JwtInvalidException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.StringBuilder r1 = r2.append(r1)
            java.lang.StringBuilder r1 = r1.append(r7)
            java.lang.String r2 = " does not exist"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    private java.lang.String getStringClaimInternal(java.lang.String r4) throws com.google.crypto.tink.jwt.JwtInvalidException {
            r3 = this;
            com.google.gson.JsonObject r0 = r3.payload
            boolean r0 = r0.has(r4)
            java.lang.String r1 = "claim "
            if (r0 == 0) goto L4e
            com.google.gson.JsonObject r0 = r3.payload
            com.google.gson.JsonElement r0 = r0.get(r4)
            boolean r0 = r0.isJsonPrimitive()
            if (r0 == 0) goto L31
            com.google.gson.JsonObject r0 = r3.payload
            com.google.gson.JsonElement r0 = r0.get(r4)
            com.google.gson.JsonPrimitive r0 = r0.getAsJsonPrimitive()
            boolean r0 = r0.isString()
            if (r0 == 0) goto L31
            com.google.gson.JsonObject r0 = r3.payload
            com.google.gson.JsonElement r0 = r0.get(r4)
            java.lang.String r0 = r0.getAsString()
            return r0
        L31:
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
        L4e:
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

    public static com.google.crypto.tink.jwt.RawJwt.Builder newBuilder() {
            com.google.crypto.tink.jwt.RawJwt$Builder r0 = new com.google.crypto.tink.jwt.RawJwt$Builder
            r1 = 0
            r0.<init>(r1)
            return r0
    }

    private void validateAudienceClaim() throws com.google.crypto.tink.jwt.JwtInvalidException {
            r3 = this;
            com.google.gson.JsonObject r0 = r3.payload
            java.lang.String r1 = "aud"
            boolean r0 = r0.has(r1)
            if (r0 != 0) goto Lb
            return
        Lb:
            com.google.gson.JsonObject r0 = r3.payload
            com.google.gson.JsonElement r0 = r0.get(r1)
            boolean r0 = r0.isJsonPrimitive()
            if (r0 == 0) goto L28
            com.google.gson.JsonObject r0 = r3.payload
            com.google.gson.JsonElement r0 = r0.get(r1)
            com.google.gson.JsonPrimitive r0 = r0.getAsJsonPrimitive()
            boolean r0 = r0.isString()
            if (r0 == 0) goto L28
            return
        L28:
            java.util.List r0 = r3.getAudiences()
            int r1 = r0.size()
            r2 = 1
            if (r1 < r2) goto L34
            return
        L34:
            com.google.crypto.tink.jwt.JwtInvalidException r1 = new com.google.crypto.tink.jwt.JwtInvalidException
            java.lang.String r2 = "invalid JWT payload: claim aud is present but empty."
            r1.<init>(r2)
            throw r1
    }

    private void validateStringClaim(java.lang.String r4) throws com.google.crypto.tink.jwt.JwtInvalidException {
            r3 = this;
            com.google.gson.JsonObject r0 = r3.payload
            boolean r0 = r0.has(r4)
            if (r0 != 0) goto L9
            return
        L9:
            com.google.gson.JsonObject r0 = r3.payload
            com.google.gson.JsonElement r0 = r0.get(r4)
            boolean r0 = r0.isJsonPrimitive()
            if (r0 == 0) goto L26
            com.google.gson.JsonObject r0 = r3.payload
            com.google.gson.JsonElement r0 = r0.get(r4)
            com.google.gson.JsonPrimitive r0 = r0.getAsJsonPrimitive()
            boolean r0 = r0.isString()
            if (r0 == 0) goto L26
            return
        L26:
            com.google.crypto.tink.jwt.JwtInvalidException r0 = new com.google.crypto.tink.jwt.JwtInvalidException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "invalid JWT payload: claim "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r4)
            java.lang.String r2 = " is not a string."
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    private void validateTimestampClaim(java.lang.String r7) throws com.google.crypto.tink.jwt.JwtInvalidException {
            r6 = this;
            com.google.gson.JsonObject r0 = r6.payload
            boolean r0 = r0.has(r7)
            if (r0 != 0) goto L9
            return
        L9:
            com.google.gson.JsonObject r0 = r6.payload
            com.google.gson.JsonElement r0 = r0.get(r7)
            boolean r0 = r0.isJsonPrimitive()
            java.lang.String r1 = "invalid JWT payload: claim "
            if (r0 == 0) goto L62
            com.google.gson.JsonObject r0 = r6.payload
            com.google.gson.JsonElement r0 = r0.get(r7)
            com.google.gson.JsonPrimitive r0 = r0.getAsJsonPrimitive()
            boolean r0 = r0.isNumber()
            if (r0 == 0) goto L62
            com.google.gson.JsonObject r0 = r6.payload
            com.google.gson.JsonElement r0 = r0.get(r7)
            com.google.gson.JsonPrimitive r0 = r0.getAsJsonPrimitive()
            double r2 = r0.getAsDouble()
            r4 = 4777615491977936896(0x424d7ffa20bf8000, double:2.53402300799E11)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 > 0) goto L45
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 < 0) goto L45
            return
        L45:
            com.google.crypto.tink.jwt.JwtInvalidException r0 = new com.google.crypto.tink.jwt.JwtInvalidException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.StringBuilder r1 = r4.append(r1)
            java.lang.StringBuilder r1 = r1.append(r7)
            java.lang.String r4 = " has an invalid timestamp"
            java.lang.StringBuilder r1 = r1.append(r4)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L62:
            com.google.crypto.tink.jwt.JwtInvalidException r0 = new com.google.crypto.tink.jwt.JwtInvalidException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.StringBuilder r1 = r2.append(r1)
            java.lang.StringBuilder r1 = r1.append(r7)
            java.lang.String r2 = " is not a number."
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    java.util.Set<java.lang.String> customClaimNames() {
            r4 = this;
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            com.google.gson.JsonObject r1 = r4.payload
            java.util.Set r1 = r1.keySet()
            java.util.Iterator r1 = r1.iterator()
        Lf:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L25
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            boolean r3 = com.google.crypto.tink.jwt.JwtNames.isRegisteredName(r2)
            if (r3 != 0) goto L24
            r0.add(r2)
        L24:
            goto Lf
        L25:
            java.util.Set r1 = java.util.Collections.unmodifiableSet(r0)
            return r1
    }

    java.util.List<java.lang.String> getAudiences() throws com.google.crypto.tink.jwt.JwtInvalidException {
            r7 = this;
            boolean r0 = r7.hasAudiences()
            if (r0 == 0) goto La0
            com.google.gson.JsonObject r0 = r7.payload
            java.lang.String r1 = "aud"
            com.google.gson.JsonElement r0 = r0.get(r1)
            boolean r1 = r0.isJsonPrimitive()
            java.lang.String r2 = "invalid audience: got %s; want a string"
            if (r1 == 0) goto L41
            com.google.gson.JsonPrimitive r1 = r0.getAsJsonPrimitive()
            boolean r1 = r1.isString()
            if (r1 == 0) goto L33
            r1 = 1
            java.lang.String[] r1 = new java.lang.String[r1]
            r2 = 0
            java.lang.String r3 = r0.getAsString()
            r1[r2] = r3
            java.util.List r1 = java.util.Arrays.asList(r1)
            java.util.List r1 = java.util.Collections.unmodifiableList(r1)
            return r1
        L33:
            com.google.crypto.tink.jwt.JwtInvalidException r1 = new com.google.crypto.tink.jwt.JwtInvalidException
            java.lang.Object[] r3 = new java.lang.Object[]{r0}
            java.lang.String r2 = java.lang.String.format(r2, r3)
            r1.<init>(r2)
            throw r1
        L41:
            boolean r1 = r0.isJsonArray()
            if (r1 == 0) goto L98
            com.google.gson.JsonArray r1 = r0.getAsJsonArray()
            java.util.ArrayList r3 = new java.util.ArrayList
            int r4 = r1.size()
            r3.<init>(r4)
            r4 = 0
        L55:
            int r5 = r1.size()
            if (r4 >= r5) goto L93
            com.google.gson.JsonElement r5 = r1.get(r4)
            boolean r5 = r5.isJsonPrimitive()
            if (r5 == 0) goto L81
            com.google.gson.JsonElement r5 = r1.get(r4)
            com.google.gson.JsonPrimitive r5 = r5.getAsJsonPrimitive()
            boolean r5 = r5.isString()
            if (r5 == 0) goto L81
            com.google.gson.JsonElement r5 = r1.get(r4)
            java.lang.String r5 = r5.getAsString()
            r3.add(r5)
            int r4 = r4 + 1
            goto L55
        L81:
            com.google.crypto.tink.jwt.JwtInvalidException r5 = new com.google.crypto.tink.jwt.JwtInvalidException
            com.google.gson.JsonElement r6 = r1.get(r4)
            java.lang.Object[] r6 = new java.lang.Object[]{r6}
            java.lang.String r2 = java.lang.String.format(r2, r6)
            r5.<init>(r2)
            throw r5
        L93:
            java.util.List r2 = java.util.Collections.unmodifiableList(r3)
            return r2
        L98:
            com.google.crypto.tink.jwt.JwtInvalidException r1 = new com.google.crypto.tink.jwt.JwtInvalidException
            java.lang.String r2 = "claim aud is not a string or a JSON array"
            r1.<init>(r2)
            throw r1
        La0:
            com.google.crypto.tink.jwt.JwtInvalidException r0 = new com.google.crypto.tink.jwt.JwtInvalidException
            java.lang.String r1 = "claim aud does not exist"
            r0.<init>(r1)
            throw r0
    }

    java.lang.Boolean getBooleanClaim(java.lang.String r4) throws com.google.crypto.tink.jwt.JwtInvalidException {
            r3 = this;
            com.google.crypto.tink.jwt.JwtNames.validate(r4)
            com.google.gson.JsonObject r0 = r3.payload
            boolean r0 = r0.has(r4)
            java.lang.String r1 = "claim "
            if (r0 == 0) goto L55
            com.google.gson.JsonObject r0 = r3.payload
            com.google.gson.JsonElement r0 = r0.get(r4)
            boolean r0 = r0.isJsonPrimitive()
            if (r0 == 0) goto L38
            com.google.gson.JsonObject r0 = r3.payload
            com.google.gson.JsonElement r0 = r0.get(r4)
            com.google.gson.JsonPrimitive r0 = r0.getAsJsonPrimitive()
            boolean r0 = r0.isBoolean()
            if (r0 == 0) goto L38
            com.google.gson.JsonObject r0 = r3.payload
            com.google.gson.JsonElement r0 = r0.get(r4)
            boolean r0 = r0.getAsBoolean()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L38:
            com.google.crypto.tink.jwt.JwtInvalidException r0 = new com.google.crypto.tink.jwt.JwtInvalidException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.StringBuilder r1 = r2.append(r1)
            java.lang.StringBuilder r1 = r1.append(r4)
            java.lang.String r2 = " is not a boolean"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L55:
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

    java.time.Instant getExpiration() throws com.google.crypto.tink.jwt.JwtInvalidException {
            r1 = this;
            java.lang.String r0 = "exp"
            java.time.Instant r0 = r1.getInstant(r0)
            return r0
    }

    java.time.Instant getIssuedAt() throws com.google.crypto.tink.jwt.JwtInvalidException {
            r1 = this;
            java.lang.String r0 = "iat"
            java.time.Instant r0 = r1.getInstant(r0)
            return r0
    }

    java.lang.String getIssuer() throws com.google.crypto.tink.jwt.JwtInvalidException {
            r1 = this;
            java.lang.String r0 = "iss"
            java.lang.String r0 = r1.getStringClaimInternal(r0)
            return r0
    }

    java.lang.String getJsonArrayClaim(java.lang.String r4) throws com.google.crypto.tink.jwt.JwtInvalidException {
            r3 = this;
            com.google.crypto.tink.jwt.JwtNames.validate(r4)
            com.google.gson.JsonObject r0 = r3.payload
            boolean r0 = r0.has(r4)
            java.lang.String r1 = "claim "
            if (r0 == 0) goto L45
            com.google.gson.JsonObject r0 = r3.payload
            com.google.gson.JsonElement r0 = r0.get(r4)
            boolean r0 = r0.isJsonArray()
            if (r0 == 0) goto L28
            com.google.gson.JsonObject r0 = r3.payload
            com.google.gson.JsonElement r0 = r0.get(r4)
            com.google.gson.JsonArray r0 = r0.getAsJsonArray()
            java.lang.String r0 = r0.toString()
            return r0
        L28:
            com.google.crypto.tink.jwt.JwtInvalidException r0 = new com.google.crypto.tink.jwt.JwtInvalidException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.StringBuilder r1 = r2.append(r1)
            java.lang.StringBuilder r1 = r1.append(r4)
            java.lang.String r2 = " is not a JSON array"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L45:
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

    java.lang.String getJsonObjectClaim(java.lang.String r4) throws com.google.crypto.tink.jwt.JwtInvalidException {
            r3 = this;
            com.google.crypto.tink.jwt.JwtNames.validate(r4)
            com.google.gson.JsonObject r0 = r3.payload
            boolean r0 = r0.has(r4)
            java.lang.String r1 = "claim "
            if (r0 == 0) goto L45
            com.google.gson.JsonObject r0 = r3.payload
            com.google.gson.JsonElement r0 = r0.get(r4)
            boolean r0 = r0.isJsonObject()
            if (r0 == 0) goto L28
            com.google.gson.JsonObject r0 = r3.payload
            com.google.gson.JsonElement r0 = r0.get(r4)
            com.google.gson.JsonObject r0 = r0.getAsJsonObject()
            java.lang.String r0 = r0.toString()
            return r0
        L28:
            com.google.crypto.tink.jwt.JwtInvalidException r0 = new com.google.crypto.tink.jwt.JwtInvalidException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.StringBuilder r1 = r2.append(r1)
            java.lang.StringBuilder r1 = r1.append(r4)
            java.lang.String r2 = " is not a JSON object"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L45:
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

    java.lang.String getJsonPayload() {
            r1 = this;
            com.google.gson.JsonObject r0 = r1.payload
            java.lang.String r0 = r0.toString()
            return r0
    }

    java.lang.String getJwtId() throws com.google.crypto.tink.jwt.JwtInvalidException {
            r1 = this;
            java.lang.String r0 = "jti"
            java.lang.String r0 = r1.getStringClaimInternal(r0)
            return r0
    }

    java.time.Instant getNotBefore() throws com.google.crypto.tink.jwt.JwtInvalidException {
            r1 = this;
            java.lang.String r0 = "nbf"
            java.time.Instant r0 = r1.getInstant(r0)
            return r0
    }

    java.lang.Double getNumberClaim(java.lang.String r4) throws com.google.crypto.tink.jwt.JwtInvalidException {
            r3 = this;
            com.google.crypto.tink.jwt.JwtNames.validate(r4)
            com.google.gson.JsonObject r0 = r3.payload
            boolean r0 = r0.has(r4)
            java.lang.String r1 = "claim "
            if (r0 == 0) goto L55
            com.google.gson.JsonObject r0 = r3.payload
            com.google.gson.JsonElement r0 = r0.get(r4)
            boolean r0 = r0.isJsonPrimitive()
            if (r0 == 0) goto L38
            com.google.gson.JsonObject r0 = r3.payload
            com.google.gson.JsonElement r0 = r0.get(r4)
            com.google.gson.JsonPrimitive r0 = r0.getAsJsonPrimitive()
            boolean r0 = r0.isNumber()
            if (r0 == 0) goto L38
            com.google.gson.JsonObject r0 = r3.payload
            com.google.gson.JsonElement r0 = r0.get(r4)
            double r0 = r0.getAsDouble()
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            return r0
        L38:
            com.google.crypto.tink.jwt.JwtInvalidException r0 = new com.google.crypto.tink.jwt.JwtInvalidException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.StringBuilder r1 = r2.append(r1)
            java.lang.StringBuilder r1 = r1.append(r4)
            java.lang.String r2 = " is not a number"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L55:
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

    java.lang.String getStringClaim(java.lang.String r2) throws com.google.crypto.tink.jwt.JwtInvalidException {
            r1 = this;
            com.google.crypto.tink.jwt.JwtNames.validate(r2)
            java.lang.String r0 = r1.getStringClaimInternal(r2)
            return r0
    }

    java.lang.String getSubject() throws com.google.crypto.tink.jwt.JwtInvalidException {
            r1 = this;
            java.lang.String r0 = "sub"
            java.lang.String r0 = r1.getStringClaimInternal(r0)
            return r0
    }

    java.lang.String getTypeHeader() throws com.google.crypto.tink.jwt.JwtInvalidException {
            r2 = this;
            java.util.Optional<java.lang.String> r0 = r2.typeHeader
            boolean r0 = r0.isPresent()
            if (r0 == 0) goto L11
            java.util.Optional<java.lang.String> r0 = r2.typeHeader
            java.lang.Object r0 = r0.get()
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L11:
            com.google.crypto.tink.jwt.JwtInvalidException r0 = new com.google.crypto.tink.jwt.JwtInvalidException
            java.lang.String r1 = "type header is not set"
            r0.<init>(r1)
            throw r0
    }

    boolean hasAudiences() {
            r2 = this;
            com.google.gson.JsonObject r0 = r2.payload
            java.lang.String r1 = "aud"
            boolean r0 = r0.has(r1)
            return r0
    }

    boolean hasBooleanClaim(java.lang.String r2) {
            r1 = this;
            com.google.crypto.tink.jwt.JwtNames.validate(r2)
            com.google.gson.JsonObject r0 = r1.payload
            boolean r0 = r0.has(r2)
            if (r0 == 0) goto L29
            com.google.gson.JsonObject r0 = r1.payload
            com.google.gson.JsonElement r0 = r0.get(r2)
            boolean r0 = r0.isJsonPrimitive()
            if (r0 == 0) goto L29
            com.google.gson.JsonObject r0 = r1.payload
            com.google.gson.JsonElement r0 = r0.get(r2)
            com.google.gson.JsonPrimitive r0 = r0.getAsJsonPrimitive()
            boolean r0 = r0.isBoolean()
            if (r0 == 0) goto L29
            r0 = 1
            goto L2a
        L29:
            r0 = 0
        L2a:
            return r0
    }

    boolean hasExpiration() {
            r2 = this;
            com.google.gson.JsonObject r0 = r2.payload
            java.lang.String r1 = "exp"
            boolean r0 = r0.has(r1)
            return r0
    }

    boolean hasIssuedAt() {
            r2 = this;
            com.google.gson.JsonObject r0 = r2.payload
            java.lang.String r1 = "iat"
            boolean r0 = r0.has(r1)
            return r0
    }

    boolean hasIssuer() {
            r2 = this;
            com.google.gson.JsonObject r0 = r2.payload
            java.lang.String r1 = "iss"
            boolean r0 = r0.has(r1)
            return r0
    }

    boolean hasJsonArrayClaim(java.lang.String r2) {
            r1 = this;
            com.google.crypto.tink.jwt.JwtNames.validate(r2)
            com.google.gson.JsonObject r0 = r1.payload
            boolean r0 = r0.has(r2)
            if (r0 == 0) goto L19
            com.google.gson.JsonObject r0 = r1.payload
            com.google.gson.JsonElement r0 = r0.get(r2)
            boolean r0 = r0.isJsonArray()
            if (r0 == 0) goto L19
            r0 = 1
            goto L1a
        L19:
            r0 = 0
        L1a:
            return r0
    }

    boolean hasJsonObjectClaim(java.lang.String r2) {
            r1 = this;
            com.google.crypto.tink.jwt.JwtNames.validate(r2)
            com.google.gson.JsonObject r0 = r1.payload
            boolean r0 = r0.has(r2)
            if (r0 == 0) goto L19
            com.google.gson.JsonObject r0 = r1.payload
            com.google.gson.JsonElement r0 = r0.get(r2)
            boolean r0 = r0.isJsonObject()
            if (r0 == 0) goto L19
            r0 = 1
            goto L1a
        L19:
            r0 = 0
        L1a:
            return r0
    }

    boolean hasJwtId() {
            r2 = this;
            com.google.gson.JsonObject r0 = r2.payload
            java.lang.String r1 = "jti"
            boolean r0 = r0.has(r1)
            return r0
    }

    boolean hasNotBefore() {
            r2 = this;
            com.google.gson.JsonObject r0 = r2.payload
            java.lang.String r1 = "nbf"
            boolean r0 = r0.has(r1)
            return r0
    }

    boolean hasNumberClaim(java.lang.String r2) {
            r1 = this;
            com.google.crypto.tink.jwt.JwtNames.validate(r2)
            com.google.gson.JsonObject r0 = r1.payload
            boolean r0 = r0.has(r2)
            if (r0 == 0) goto L29
            com.google.gson.JsonObject r0 = r1.payload
            com.google.gson.JsonElement r0 = r0.get(r2)
            boolean r0 = r0.isJsonPrimitive()
            if (r0 == 0) goto L29
            com.google.gson.JsonObject r0 = r1.payload
            com.google.gson.JsonElement r0 = r0.get(r2)
            com.google.gson.JsonPrimitive r0 = r0.getAsJsonPrimitive()
            boolean r0 = r0.isNumber()
            if (r0 == 0) goto L29
            r0 = 1
            goto L2a
        L29:
            r0 = 0
        L2a:
            return r0
    }

    boolean hasStringClaim(java.lang.String r2) {
            r1 = this;
            com.google.crypto.tink.jwt.JwtNames.validate(r2)
            com.google.gson.JsonObject r0 = r1.payload
            boolean r0 = r0.has(r2)
            if (r0 == 0) goto L29
            com.google.gson.JsonObject r0 = r1.payload
            com.google.gson.JsonElement r0 = r0.get(r2)
            boolean r0 = r0.isJsonPrimitive()
            if (r0 == 0) goto L29
            com.google.gson.JsonObject r0 = r1.payload
            com.google.gson.JsonElement r0 = r0.get(r2)
            com.google.gson.JsonPrimitive r0 = r0.getAsJsonPrimitive()
            boolean r0 = r0.isString()
            if (r0 == 0) goto L29
            r0 = 1
            goto L2a
        L29:
            r0 = 0
        L2a:
            return r0
    }

    boolean hasSubject() {
            r2 = this;
            com.google.gson.JsonObject r0 = r2.payload
            java.lang.String r1 = "sub"
            boolean r0 = r0.has(r1)
            return r0
    }

    boolean hasTypeHeader() {
            r1 = this;
            java.util.Optional<java.lang.String> r0 = r1.typeHeader
            boolean r0 = r0.isPresent()
            return r0
    }

    boolean isNullClaim(java.lang.String r3) {
            r2 = this;
            com.google.crypto.tink.jwt.JwtNames.validate(r3)
            com.google.gson.JsonNull r0 = com.google.gson.JsonNull.INSTANCE     // Catch: com.google.gson.JsonParseException -> L10
            com.google.gson.JsonObject r1 = r2.payload     // Catch: com.google.gson.JsonParseException -> L10
            com.google.gson.JsonElement r1 = r1.get(r3)     // Catch: com.google.gson.JsonParseException -> L10
            boolean r0 = r0.equals(r1)     // Catch: com.google.gson.JsonParseException -> L10
            return r0
        L10:
            r0 = move-exception
            r1 = 0
            return r1
    }

    public java.lang.String toString() {
            r3 = this;
            com.google.gson.JsonObject r0 = new com.google.gson.JsonObject
            r0.<init>()
            java.util.Optional<java.lang.String> r1 = r3.typeHeader
            boolean r1 = r1.isPresent()
            if (r1 == 0) goto L1f
            com.google.gson.JsonPrimitive r1 = new com.google.gson.JsonPrimitive
            java.util.Optional<java.lang.String> r2 = r3.typeHeader
            java.lang.Object r2 = r2.get()
            java.lang.String r2 = (java.lang.String) r2
            r1.<init>(r2)
            java.lang.String r2 = "typ"
            r0.add(r2, r1)
        L1f:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r1 = r1.append(r0)
            java.lang.String r2 = "."
            java.lang.StringBuilder r1 = r1.append(r2)
            com.google.gson.JsonObject r2 = r3.payload
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            return r1
    }
}
