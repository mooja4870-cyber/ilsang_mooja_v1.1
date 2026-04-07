package com.google.crypto.tink.jwt;

/* JADX INFO: loaded from: classes.dex */
@com.google.errorprone.annotations.Immutable
public interface JwtPublicKeySignInternal {
    java.lang.String signAndEncodeWithKid(com.google.crypto.tink.jwt.RawJwt r1, java.util.Optional<java.lang.String> r2) throws java.security.GeneralSecurityException;
}
