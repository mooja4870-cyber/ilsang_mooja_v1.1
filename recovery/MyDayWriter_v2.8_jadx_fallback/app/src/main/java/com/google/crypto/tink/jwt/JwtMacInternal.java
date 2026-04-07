package com.google.crypto.tink.jwt;

/* JADX INFO: loaded from: classes.dex */
@com.google.errorprone.annotations.Immutable
interface JwtMacInternal {
    java.lang.String computeMacAndEncodeWithKid(com.google.crypto.tink.jwt.RawJwt r1, java.util.Optional<java.lang.String> r2) throws java.security.GeneralSecurityException;

    com.google.crypto.tink.jwt.VerifiedJwt verifyMacAndDecodeWithKid(java.lang.String r1, com.google.crypto.tink.jwt.JwtValidator r2, java.util.Optional<java.lang.String> r3) throws java.security.GeneralSecurityException;
}
