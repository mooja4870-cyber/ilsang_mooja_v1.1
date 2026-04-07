package com.google.crypto.tink;

/* JADX INFO: loaded from: classes.dex */
public interface KeyWrap {
    byte[] unwrap(byte[] r1) throws java.security.GeneralSecurityException;

    byte[] wrap(byte[] r1) throws java.security.GeneralSecurityException;
}
