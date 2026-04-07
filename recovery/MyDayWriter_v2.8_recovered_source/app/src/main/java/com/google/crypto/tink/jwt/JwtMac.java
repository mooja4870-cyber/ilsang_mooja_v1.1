package com.google.crypto.tink.jwt;

/* JADX INFO: loaded from: classes.dex */
@com.google.errorprone.annotations.Immutable
public interface JwtMac {
    java.lang.String computeMacAndEncode(com.google.crypto.tink.jwt.RawJwt r1) throws java.security.GeneralSecurityException;

    com.google.crypto.tink.jwt.VerifiedJwt verifyMacAndDecode(java.lang.String r1, com.google.crypto.tink.jwt.JwtValidator r2) throws java.security.GeneralSecurityException;
}
