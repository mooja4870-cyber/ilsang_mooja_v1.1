package com.google.crypto.tink.subtle.prf;

/* JADX INFO: loaded from: classes.dex */
@com.google.errorprone.annotations.Immutable
public class PrfImpl implements com.google.crypto.tink.prf.Prf {
    private final com.google.crypto.tink.subtle.prf.StreamingPrf prfStreamer;

    private PrfImpl(com.google.crypto.tink.subtle.prf.StreamingPrf r1) {
            r0 = this;
            r0.<init>()
            r0.prfStreamer = r1
            return
    }

    private static byte[] readBytesFromStream(java.io.InputStream r5, int r6) throws java.security.GeneralSecurityException {
            byte[] r0 = new byte[r6]     // Catch: java.io.IOException -> L18
            r1 = 0
        L3:
            if (r1 >= r6) goto L17
            int r2 = r6 - r1
            int r2 = r5.read(r0, r1, r2)     // Catch: java.io.IOException -> L18
            if (r2 <= 0) goto Lf
            int r1 = r1 + r2
            goto L3
        Lf:
            java.security.GeneralSecurityException r3 = new java.security.GeneralSecurityException     // Catch: java.io.IOException -> L18
            java.lang.String r4 = "Provided StreamingPrf terminated before providing requested number of bytes."
            r3.<init>(r4)     // Catch: java.io.IOException -> L18
            throw r3     // Catch: java.io.IOException -> L18
        L17:
            return r0
        L18:
            r0 = move-exception
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException
            r1.<init>(r0)
            throw r1
    }

    public static com.google.crypto.tink.subtle.prf.PrfImpl wrap(com.google.crypto.tink.subtle.prf.StreamingPrf r1) {
            com.google.crypto.tink.subtle.prf.PrfImpl r0 = new com.google.crypto.tink.subtle.prf.PrfImpl
            r0.<init>(r1)
            return r0
    }

    @Override // com.google.crypto.tink.prf.Prf
    public byte[] compute(byte[] r3, int r4) throws java.security.GeneralSecurityException {
            r2 = this;
            if (r3 == 0) goto L17
            if (r4 <= 0) goto Lf
            com.google.crypto.tink.subtle.prf.StreamingPrf r0 = r2.prfStreamer
            java.io.InputStream r0 = r0.computePrf(r3)
            byte[] r1 = readBytesFromStream(r0, r4)
            return r1
        Lf:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "Invalid outputLength specified."
            r0.<init>(r1)
            throw r0
        L17:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "Invalid input provided."
            r0.<init>(r1)
            throw r0
    }
}
