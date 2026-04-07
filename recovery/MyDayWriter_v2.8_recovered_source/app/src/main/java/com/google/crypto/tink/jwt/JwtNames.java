package com.google.crypto.tink.jwt;

/* JADX INFO: loaded from: classes.dex */
final class JwtNames {
    static final java.lang.String CLAIM_AUDIENCE = "aud";
    static final java.lang.String CLAIM_EXPIRATION = "exp";
    static final java.lang.String CLAIM_ISSUED_AT = "iat";
    static final java.lang.String CLAIM_ISSUER = "iss";
    static final java.lang.String CLAIM_JWT_ID = "jti";
    static final java.lang.String CLAIM_NOT_BEFORE = "nbf";
    static final java.lang.String CLAIM_SUBJECT = "sub";
    static final java.lang.String HEADER_ALGORITHM = "alg";
    static final java.lang.String HEADER_CRITICAL = "crit";
    static final java.lang.String HEADER_KEY_ID = "kid";
    static final java.lang.String HEADER_TYPE = "typ";

    private JwtNames() {
            r0 = this;
            r0.<init>()
            return
    }

    static boolean isRegisteredName(java.lang.String r1) {
            java.lang.String r0 = "iss"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L3b
            java.lang.String r0 = "sub"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L3b
            java.lang.String r0 = "aud"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L3b
            java.lang.String r0 = "exp"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L3b
            java.lang.String r0 = "nbf"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L3b
            java.lang.String r0 = "iat"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L3b
            java.lang.String r0 = "jti"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L39
            goto L3b
        L39:
            r0 = 0
            goto L3c
        L3b:
            r0 = 1
        L3c:
            return r0
    }

    static void validate(java.lang.String r3) {
            boolean r0 = isRegisteredName(r3)
            if (r0 != 0) goto L7
            return
        L7:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.Object[] r1 = new java.lang.Object[]{r3}
            java.lang.String r2 = "claim '%s' is invalid because it's a registered name; use the corresponding setter method."
            java.lang.String r1 = java.lang.String.format(r2, r1)
            r0.<init>(r1)
            throw r0
    }
}
