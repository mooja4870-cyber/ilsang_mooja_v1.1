package com.google.crypto.tink.jwt;

/* JADX INFO: loaded from: classes.dex */
@com.google.errorprone.annotations.Immutable
public final class JwtValidator {
    private static final java.time.Duration MAX_CLOCK_SKEW = null;
    private final boolean allowMissingExpiration;
    private final java.time.Clock clock;
    private final java.time.Duration clockSkew;
    private final boolean expectIssuedInThePast;
    private final java.util.Optional<java.lang.String> expectedAudience;
    private final java.util.Optional<java.lang.String> expectedIssuer;
    private final java.util.Optional<java.lang.String> expectedTypeHeader;
    private final boolean ignoreAudiences;
    private final boolean ignoreIssuer;
    private final boolean ignoreTypeHeader;

    /* JADX INFO: renamed from: com.google.crypto.tink.jwt.JwtValidator$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    public static final class Builder {
        private boolean allowMissingExpiration;
        private java.time.Clock clock;
        private java.time.Duration clockSkew;
        private boolean expectIssuedInThePast;
        private java.util.Optional<java.lang.String> expectedAudience;
        private java.util.Optional<java.lang.String> expectedIssuer;
        private java.util.Optional<java.lang.String> expectedTypeHeader;
        private boolean ignoreAudiences;
        private boolean ignoreIssuer;
        private boolean ignoreTypeHeader;

        private Builder() {
                r2 = this;
                r2.<init>()
                java.time.Clock r0 = java.time.Clock.systemUTC()
                r2.clock = r0
                java.time.Duration r0 = java.time.Duration.ZERO
                r2.clockSkew = r0
                java.util.Optional r0 = java.util.Optional.empty()
                r2.expectedTypeHeader = r0
                r0 = 0
                r2.ignoreTypeHeader = r0
                java.util.Optional r1 = java.util.Optional.empty()
                r2.expectedIssuer = r1
                r2.ignoreIssuer = r0
                java.util.Optional r1 = java.util.Optional.empty()
                r2.expectedAudience = r1
                r2.ignoreAudiences = r0
                r2.allowMissingExpiration = r0
                r2.expectIssuedInThePast = r0
                return
        }

        /* synthetic */ Builder(com.google.crypto.tink.jwt.JwtValidator.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        static /* synthetic */ java.util.Optional access$000(com.google.crypto.tink.jwt.JwtValidator.Builder r1) {
                java.util.Optional<java.lang.String> r0 = r1.expectedTypeHeader
                return r0
        }

        static /* synthetic */ boolean access$100(com.google.crypto.tink.jwt.JwtValidator.Builder r1) {
                boolean r0 = r1.ignoreTypeHeader
                return r0
        }

        static /* synthetic */ java.util.Optional access$200(com.google.crypto.tink.jwt.JwtValidator.Builder r1) {
                java.util.Optional<java.lang.String> r0 = r1.expectedIssuer
                return r0
        }

        static /* synthetic */ boolean access$300(com.google.crypto.tink.jwt.JwtValidator.Builder r1) {
                boolean r0 = r1.ignoreIssuer
                return r0
        }

        static /* synthetic */ java.util.Optional access$400(com.google.crypto.tink.jwt.JwtValidator.Builder r1) {
                java.util.Optional<java.lang.String> r0 = r1.expectedAudience
                return r0
        }

        static /* synthetic */ boolean access$500(com.google.crypto.tink.jwt.JwtValidator.Builder r1) {
                boolean r0 = r1.ignoreAudiences
                return r0
        }

        static /* synthetic */ boolean access$600(com.google.crypto.tink.jwt.JwtValidator.Builder r1) {
                boolean r0 = r1.allowMissingExpiration
                return r0
        }

        static /* synthetic */ boolean access$700(com.google.crypto.tink.jwt.JwtValidator.Builder r1) {
                boolean r0 = r1.expectIssuedInThePast
                return r0
        }

        static /* synthetic */ java.time.Clock access$800(com.google.crypto.tink.jwt.JwtValidator.Builder r1) {
                java.time.Clock r0 = r1.clock
                return r0
        }

        static /* synthetic */ java.time.Duration access$900(com.google.crypto.tink.jwt.JwtValidator.Builder r1) {
                java.time.Duration r0 = r1.clockSkew
                return r0
        }

        public com.google.crypto.tink.jwt.JwtValidator.Builder allowMissingExpiration() {
                r1 = this;
                r0 = 1
                r1.allowMissingExpiration = r0
                return r1
        }

        public com.google.crypto.tink.jwt.JwtValidator build() {
                r2 = this;
                boolean r0 = r2.ignoreTypeHeader
                if (r0 == 0) goto L15
                java.util.Optional<java.lang.String> r0 = r2.expectedTypeHeader
                boolean r0 = r0.isPresent()
                if (r0 != 0) goto Ld
                goto L15
            Ld:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "ignoreTypeHeader() and expectedTypeHeader() cannot be used together."
                r0.<init>(r1)
                throw r0
            L15:
                boolean r0 = r2.ignoreIssuer
                if (r0 == 0) goto L2a
                java.util.Optional<java.lang.String> r0 = r2.expectedIssuer
                boolean r0 = r0.isPresent()
                if (r0 != 0) goto L22
                goto L2a
            L22:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "ignoreIssuer() and expectedIssuer() cannot be used together."
                r0.<init>(r1)
                throw r0
            L2a:
                boolean r0 = r2.ignoreAudiences
                if (r0 == 0) goto L3f
                java.util.Optional<java.lang.String> r0 = r2.expectedAudience
                boolean r0 = r0.isPresent()
                if (r0 != 0) goto L37
                goto L3f
            L37:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "ignoreAudiences() and expectedAudience() cannot be used together."
                r0.<init>(r1)
                throw r0
            L3f:
                com.google.crypto.tink.jwt.JwtValidator r0 = new com.google.crypto.tink.jwt.JwtValidator
                r1 = 0
                r0.<init>(r2, r1)
                return r0
        }

        public com.google.crypto.tink.jwt.JwtValidator.Builder expectAudience(java.lang.String r3) {
                r2 = this;
                if (r3 == 0) goto L9
                java.util.Optional r0 = java.util.Optional.of(r3)
                r2.expectedAudience = r0
                return r2
            L9:
                java.lang.NullPointerException r0 = new java.lang.NullPointerException
                java.lang.String r1 = "audience cannot be null"
                r0.<init>(r1)
                throw r0
        }

        public com.google.crypto.tink.jwt.JwtValidator.Builder expectIssuedInThePast() {
                r1 = this;
                r0 = 1
                r1.expectIssuedInThePast = r0
                return r1
        }

        public com.google.crypto.tink.jwt.JwtValidator.Builder expectIssuer(java.lang.String r3) {
                r2 = this;
                if (r3 == 0) goto L9
                java.util.Optional r0 = java.util.Optional.of(r3)
                r2.expectedIssuer = r0
                return r2
            L9:
                java.lang.NullPointerException r0 = new java.lang.NullPointerException
                java.lang.String r1 = "issuer cannot be null"
                r0.<init>(r1)
                throw r0
        }

        public com.google.crypto.tink.jwt.JwtValidator.Builder expectTypeHeader(java.lang.String r3) {
                r2 = this;
                if (r3 == 0) goto L9
                java.util.Optional r0 = java.util.Optional.of(r3)
                r2.expectedTypeHeader = r0
                return r2
            L9:
                java.lang.NullPointerException r0 = new java.lang.NullPointerException
                java.lang.String r1 = "typ header cannot be null"
                r0.<init>(r1)
                throw r0
        }

        public com.google.crypto.tink.jwt.JwtValidator.Builder ignoreAudiences() {
                r1 = this;
                r0 = 1
                r1.ignoreAudiences = r0
                return r1
        }

        public com.google.crypto.tink.jwt.JwtValidator.Builder ignoreIssuer() {
                r1 = this;
                r0 = 1
                r1.ignoreIssuer = r0
                return r1
        }

        public com.google.crypto.tink.jwt.JwtValidator.Builder ignoreTypeHeader() {
                r1 = this;
                r0 = 1
                r1.ignoreTypeHeader = r0
                return r1
        }

        public com.google.crypto.tink.jwt.JwtValidator.Builder setClock(java.time.Clock r3) {
                r2 = this;
                if (r3 == 0) goto L5
                r2.clock = r3
                return r2
            L5:
                java.lang.NullPointerException r0 = new java.lang.NullPointerException
                java.lang.String r1 = "clock cannot be null"
                r0.<init>(r1)
                throw r0
        }

        public com.google.crypto.tink.jwt.JwtValidator.Builder setClockSkew(java.time.Duration r3) {
                r2 = this;
                java.time.Duration r0 = com.google.crypto.tink.jwt.JwtValidator.access$1100()
                int r0 = r3.compareTo(r0)
                if (r0 > 0) goto Ld
                r2.clockSkew = r3
                return r2
            Ld:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "Clock skew too large, max is 10 minutes"
                r0.<init>(r1)
                throw r0
        }
    }

    static {
            r0 = 10
            java.time.Duration r0 = java.time.Duration.ofMinutes(r0)
            com.google.crypto.tink.jwt.JwtValidator.MAX_CLOCK_SKEW = r0
            return
    }

    private JwtValidator(com.google.crypto.tink.jwt.JwtValidator.Builder r2) {
            r1 = this;
            r1.<init>()
            java.util.Optional r0 = com.google.crypto.tink.jwt.JwtValidator.Builder.access$000(r2)
            r1.expectedTypeHeader = r0
            boolean r0 = com.google.crypto.tink.jwt.JwtValidator.Builder.access$100(r2)
            r1.ignoreTypeHeader = r0
            java.util.Optional r0 = com.google.crypto.tink.jwt.JwtValidator.Builder.access$200(r2)
            r1.expectedIssuer = r0
            boolean r0 = com.google.crypto.tink.jwt.JwtValidator.Builder.access$300(r2)
            r1.ignoreIssuer = r0
            java.util.Optional r0 = com.google.crypto.tink.jwt.JwtValidator.Builder.access$400(r2)
            r1.expectedAudience = r0
            boolean r0 = com.google.crypto.tink.jwt.JwtValidator.Builder.access$500(r2)
            r1.ignoreAudiences = r0
            boolean r0 = com.google.crypto.tink.jwt.JwtValidator.Builder.access$600(r2)
            r1.allowMissingExpiration = r0
            boolean r0 = com.google.crypto.tink.jwt.JwtValidator.Builder.access$700(r2)
            r1.expectIssuedInThePast = r0
            java.time.Clock r0 = com.google.crypto.tink.jwt.JwtValidator.Builder.access$800(r2)
            r1.clock = r0
            java.time.Duration r0 = com.google.crypto.tink.jwt.JwtValidator.Builder.access$900(r2)
            r1.clockSkew = r0
            return
    }

    /* synthetic */ JwtValidator(com.google.crypto.tink.jwt.JwtValidator.Builder r1, com.google.crypto.tink.jwt.JwtValidator.AnonymousClass1 r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    static /* synthetic */ java.time.Duration access$1100() {
            java.time.Duration r0 = com.google.crypto.tink.jwt.JwtValidator.MAX_CLOCK_SKEW
            return r0
    }

    public static com.google.crypto.tink.jwt.JwtValidator.Builder newBuilder() {
            com.google.crypto.tink.jwt.JwtValidator$Builder r0 = new com.google.crypto.tink.jwt.JwtValidator$Builder
            r1 = 0
            r0.<init>(r1)
            return r0
    }

    private void validateAudiences(com.google.crypto.tink.jwt.RawJwt r4) throws com.google.crypto.tink.jwt.JwtInvalidException {
            r3 = this;
            java.util.Optional<java.lang.String> r0 = r3.expectedAudience
            boolean r0 = r0.isPresent()
            if (r0 == 0) goto L35
            boolean r0 = r4.hasAudiences()
            if (r0 == 0) goto L1f
            java.util.List r0 = r4.getAudiences()
            java.util.Optional<java.lang.String> r1 = r3.expectedAudience
            java.lang.Object r1 = r1.get()
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L1f
            goto L48
        L1f:
            com.google.crypto.tink.jwt.JwtInvalidException r0 = new com.google.crypto.tink.jwt.JwtInvalidException
            java.util.Optional<java.lang.String> r1 = r3.expectedAudience
            java.lang.Object r1 = r1.get()
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r2 = "invalid JWT; missing expected audience %s."
            java.lang.String r1 = java.lang.String.format(r2, r1)
            r0.<init>(r1)
            throw r0
        L35:
            boolean r0 = r4.hasAudiences()
            if (r0 == 0) goto L48
            boolean r0 = r3.ignoreAudiences
            if (r0 == 0) goto L40
            goto L48
        L40:
            com.google.crypto.tink.jwt.JwtInvalidException r0 = new com.google.crypto.tink.jwt.JwtInvalidException
            java.lang.String r1 = "invalid JWT; token has audience set, but validator not."
            r0.<init>(r1)
            throw r0
        L48:
            return
    }

    private void validateIssuer(com.google.crypto.tink.jwt.RawJwt r4) throws com.google.crypto.tink.jwt.JwtInvalidException {
            r3 = this;
            java.util.Optional<java.lang.String> r0 = r3.expectedIssuer
            boolean r0 = r0.isPresent()
            if (r0 == 0) goto L4f
            boolean r0 = r4.hasIssuer()
            if (r0 == 0) goto L39
            java.lang.String r0 = r4.getIssuer()
            java.util.Optional<java.lang.String> r1 = r3.expectedIssuer
            java.lang.Object r1 = r1.get()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L1f
            goto L62
        L1f:
            com.google.crypto.tink.jwt.JwtInvalidException r0 = new com.google.crypto.tink.jwt.JwtInvalidException
            java.util.Optional<java.lang.String> r1 = r3.expectedIssuer
            java.lang.Object r1 = r1.get()
            java.lang.String r2 = r4.getIssuer()
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r2}
            java.lang.String r2 = "invalid JWT; expected issuer %s, but got %s"
            java.lang.String r1 = java.lang.String.format(r2, r1)
            r0.<init>(r1)
            throw r0
        L39:
            com.google.crypto.tink.jwt.JwtInvalidException r0 = new com.google.crypto.tink.jwt.JwtInvalidException
            java.util.Optional<java.lang.String> r1 = r3.expectedIssuer
            java.lang.Object r1 = r1.get()
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r2 = "invalid JWT; missing expected issuer %s."
            java.lang.String r1 = java.lang.String.format(r2, r1)
            r0.<init>(r1)
            throw r0
        L4f:
            boolean r0 = r4.hasIssuer()
            if (r0 == 0) goto L62
            boolean r0 = r3.ignoreIssuer
            if (r0 == 0) goto L5a
            goto L62
        L5a:
            com.google.crypto.tink.jwt.JwtInvalidException r0 = new com.google.crypto.tink.jwt.JwtInvalidException
            java.lang.String r1 = "invalid JWT; token has issuer set, but validator not."
            r0.<init>(r1)
            throw r0
        L62:
            return
    }

    private void validateTimestampClaims(com.google.crypto.tink.jwt.RawJwt r5) throws com.google.crypto.tink.jwt.JwtInvalidException {
            r4 = this;
            java.time.Clock r0 = r4.clock
            java.time.Instant r0 = r0.instant()
            boolean r1 = r5.hasExpiration()
            if (r1 != 0) goto L19
            boolean r1 = r4.allowMissingExpiration
            if (r1 == 0) goto L11
            goto L19
        L11:
            com.google.crypto.tink.jwt.JwtInvalidException r1 = new com.google.crypto.tink.jwt.JwtInvalidException
            java.lang.String r2 = "token does not have an expiration set"
            r1.<init>(r2)
            throw r1
        L19:
            boolean r1 = r5.hasExpiration()
            if (r1 == 0) goto L4d
            java.time.Instant r1 = r5.getExpiration()
            java.time.Duration r2 = r4.clockSkew
            java.time.Instant r2 = r0.minus(r2)
            boolean r1 = r1.isAfter(r2)
            if (r1 == 0) goto L30
            goto L4d
        L30:
            com.google.crypto.tink.jwt.JwtInvalidException r1 = new com.google.crypto.tink.jwt.JwtInvalidException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "token has expired since "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.time.Instant r3 = r5.getExpiration()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L4d:
            boolean r1 = r5.hasNotBefore()
            if (r1 == 0) goto L81
            java.time.Instant r1 = r5.getNotBefore()
            java.time.Duration r2 = r4.clockSkew
            java.time.Instant r2 = r0.plus(r2)
            boolean r1 = r1.isAfter(r2)
            if (r1 != 0) goto L64
            goto L81
        L64:
            com.google.crypto.tink.jwt.JwtInvalidException r1 = new com.google.crypto.tink.jwt.JwtInvalidException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "token cannot be used before "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.time.Instant r3 = r5.getNotBefore()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L81:
            boolean r1 = r4.expectIssuedInThePast
            if (r1 == 0) goto Lc1
            boolean r1 = r5.hasIssuedAt()
            if (r1 == 0) goto Lb9
            java.time.Instant r1 = r5.getIssuedAt()
            java.time.Duration r2 = r4.clockSkew
            java.time.Instant r2 = r0.plus(r2)
            boolean r1 = r1.isAfter(r2)
            if (r1 != 0) goto L9c
            goto Lc1
        L9c:
            com.google.crypto.tink.jwt.JwtInvalidException r1 = new com.google.crypto.tink.jwt.JwtInvalidException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "token has a invalid iat claim in the future: "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.time.Instant r3 = r5.getIssuedAt()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        Lb9:
            com.google.crypto.tink.jwt.JwtInvalidException r1 = new com.google.crypto.tink.jwt.JwtInvalidException
            java.lang.String r2 = "token does not have an iat claim"
            r1.<init>(r2)
            throw r1
        Lc1:
            return
    }

    private void validateTypeHeader(com.google.crypto.tink.jwt.RawJwt r4) throws com.google.crypto.tink.jwt.JwtInvalidException {
            r3 = this;
            java.util.Optional<java.lang.String> r0 = r3.expectedTypeHeader
            boolean r0 = r0.isPresent()
            if (r0 == 0) goto L4f
            boolean r0 = r4.hasTypeHeader()
            if (r0 == 0) goto L39
            java.lang.String r0 = r4.getTypeHeader()
            java.util.Optional<java.lang.String> r1 = r3.expectedTypeHeader
            java.lang.Object r1 = r1.get()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L1f
            goto L62
        L1f:
            com.google.crypto.tink.jwt.JwtInvalidException r0 = new com.google.crypto.tink.jwt.JwtInvalidException
            java.util.Optional<java.lang.String> r1 = r3.expectedTypeHeader
            java.lang.Object r1 = r1.get()
            java.lang.String r2 = r4.getTypeHeader()
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r2}
            java.lang.String r2 = "invalid JWT; expected type header %s, but got %s"
            java.lang.String r1 = java.lang.String.format(r2, r1)
            r0.<init>(r1)
            throw r0
        L39:
            com.google.crypto.tink.jwt.JwtInvalidException r0 = new com.google.crypto.tink.jwt.JwtInvalidException
            java.util.Optional<java.lang.String> r1 = r3.expectedTypeHeader
            java.lang.Object r1 = r1.get()
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r2 = "invalid JWT; missing expected type header %s."
            java.lang.String r1 = java.lang.String.format(r2, r1)
            r0.<init>(r1)
            throw r0
        L4f:
            boolean r0 = r4.hasTypeHeader()
            if (r0 == 0) goto L62
            boolean r0 = r3.ignoreTypeHeader
            if (r0 == 0) goto L5a
            goto L62
        L5a:
            com.google.crypto.tink.jwt.JwtInvalidException r0 = new com.google.crypto.tink.jwt.JwtInvalidException
            java.lang.String r1 = "invalid JWT; token has type header set, but validator not."
            r0.<init>(r1)
            throw r0
        L62:
            return
    }

    public java.lang.String toString() {
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Optional<java.lang.String> r1 = r5.expectedTypeHeader
            boolean r1 = r1.isPresent()
            if (r1 == 0) goto L2b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "expectedTypeHeader="
            java.lang.StringBuilder r1 = r1.append(r2)
            java.util.Optional<java.lang.String> r2 = r5.expectedTypeHeader
            java.lang.Object r2 = r2.get()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.add(r1)
        L2b:
            boolean r1 = r5.ignoreTypeHeader
            if (r1 == 0) goto L34
            java.lang.String r1 = "ignoreTypeHeader"
            r0.add(r1)
        L34:
            java.util.Optional<java.lang.String> r1 = r5.expectedIssuer
            boolean r1 = r1.isPresent()
            if (r1 == 0) goto L5a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "expectedIssuer="
            java.lang.StringBuilder r1 = r1.append(r2)
            java.util.Optional<java.lang.String> r2 = r5.expectedIssuer
            java.lang.Object r2 = r2.get()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.add(r1)
        L5a:
            boolean r1 = r5.ignoreIssuer
            if (r1 == 0) goto L63
            java.lang.String r1 = "ignoreIssuer"
            r0.add(r1)
        L63:
            java.util.Optional<java.lang.String> r1 = r5.expectedAudience
            boolean r1 = r1.isPresent()
            if (r1 == 0) goto L89
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "expectedAudience="
            java.lang.StringBuilder r1 = r1.append(r2)
            java.util.Optional<java.lang.String> r2 = r5.expectedAudience
            java.lang.Object r2 = r2.get()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.add(r1)
        L89:
            boolean r1 = r5.ignoreAudiences
            if (r1 == 0) goto L92
            java.lang.String r1 = "ignoreAudiences"
            r0.add(r1)
        L92:
            boolean r1 = r5.allowMissingExpiration
            if (r1 == 0) goto L9b
            java.lang.String r1 = "allowMissingExpiration"
            r0.add(r1)
        L9b:
            boolean r1 = r5.expectIssuedInThePast
            if (r1 == 0) goto La4
            java.lang.String r1 = "expectIssuedInThePast"
            r0.add(r1)
        La4:
            java.time.Duration r1 = r5.clockSkew
            boolean r1 = r1.isZero()
            if (r1 != 0) goto Lc4
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "clockSkew="
            java.lang.StringBuilder r1 = r1.append(r2)
            java.time.Duration r2 = r5.clockSkew
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.add(r1)
        Lc4:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "JwtValidator{"
            r1.append(r2)
            java.lang.String r2 = ""
            java.util.Iterator r3 = r0.iterator()
        Ld4:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto Le9
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            r1.append(r2)
            r1.append(r4)
            java.lang.String r2 = ","
            goto Ld4
        Le9:
            java.lang.String r3 = "}"
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            return r3
    }

    com.google.crypto.tink.jwt.VerifiedJwt validate(com.google.crypto.tink.jwt.RawJwt r2) throws com.google.crypto.tink.jwt.JwtInvalidException {
            r1 = this;
            r1.validateTimestampClaims(r2)
            r1.validateTypeHeader(r2)
            r1.validateIssuer(r2)
            r1.validateAudiences(r2)
            com.google.crypto.tink.jwt.VerifiedJwt r0 = new com.google.crypto.tink.jwt.VerifiedJwt
            r0.<init>(r2)
            return r0
    }
}
