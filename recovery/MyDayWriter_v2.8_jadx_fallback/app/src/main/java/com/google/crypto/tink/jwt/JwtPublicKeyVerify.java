package com.google.crypto.tink.jwt;

/* JADX INFO: loaded from: classes.dex */
@com.google.errorprone.annotations.Immutable
public interface JwtPublicKeyVerify {
    com.google.crypto.tink.jwt.VerifiedJwt verifyAndDecode(java.lang.String r1, com.google.crypto.tink.jwt.JwtValidator r2) throws java.security.GeneralSecurityException;
}
