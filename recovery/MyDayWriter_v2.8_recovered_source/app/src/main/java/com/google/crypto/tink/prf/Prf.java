package com.google.crypto.tink.prf;

/* JADX INFO: loaded from: classes.dex */
@com.google.errorprone.annotations.Immutable
public interface Prf {
    byte[] compute(byte[] r1, int r2) throws java.security.GeneralSecurityException;
}
