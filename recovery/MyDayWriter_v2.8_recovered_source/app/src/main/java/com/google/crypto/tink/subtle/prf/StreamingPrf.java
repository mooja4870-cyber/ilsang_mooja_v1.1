package com.google.crypto.tink.subtle.prf;

/* JADX INFO: loaded from: classes.dex */
@com.google.errorprone.annotations.Immutable
public interface StreamingPrf {
    java.io.InputStream computePrf(byte[] r1);
}
