package com.google.crypto.tink.jwt;

/* JADX INFO: loaded from: classes.dex */
@com.google.errorprone.annotations.Immutable
public interface JwtPublicKeySign {
    java.lang.String signAndEncode(com.google.crypto.tink.jwt.RawJwt r1) throws java.security.GeneralSecurityException;
}
