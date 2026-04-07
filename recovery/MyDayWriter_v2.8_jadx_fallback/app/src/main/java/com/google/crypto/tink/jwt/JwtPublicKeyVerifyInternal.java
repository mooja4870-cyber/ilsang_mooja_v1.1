package com.google.crypto.tink.jwt;

/* JADX INFO: loaded from: classes.dex */
@com.google.errorprone.annotations.Immutable
public interface JwtPublicKeyVerifyInternal {
    com.google.crypto.tink.jwt.VerifiedJwt verifyAndDecodeWithKid(java.lang.String r1, com.google.crypto.tink.jwt.JwtValidator r2, java.util.Optional<java.lang.String> r3) throws java.security.GeneralSecurityException;
}
