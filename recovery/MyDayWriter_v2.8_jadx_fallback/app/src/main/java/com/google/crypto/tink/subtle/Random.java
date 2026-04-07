package com.google.crypto.tink.subtle;

/* JADX INFO: loaded from: classes.dex */
public final class Random {
    private static final java.lang.ThreadLocal<java.security.SecureRandom> localRandom = null;


    static {
            com.google.crypto.tink.subtle.Random$1 r0 = new com.google.crypto.tink.subtle.Random$1
            r0.<init>()
            com.google.crypto.tink.subtle.Random.localRandom = r0
            return
    }

    private Random() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ java.security.SecureRandom access$000() {
            java.security.SecureRandom r0 = newDefaultSecureRandom()
            return r0
    }

    private static java.security.SecureRandom newDefaultSecureRandom() {
            java.security.SecureRandom r0 = new java.security.SecureRandom
            r0.<init>()
            r0.nextLong()
            return r0
    }

    public static byte[] randBytes(int r2) {
            byte[] r0 = new byte[r2]
            java.lang.ThreadLocal<java.security.SecureRandom> r1 = com.google.crypto.tink.subtle.Random.localRandom
            java.lang.Object r1 = r1.get()
            java.security.SecureRandom r1 = (java.security.SecureRandom) r1
            r1.nextBytes(r0)
            return r0
    }

    public static final int randInt() {
            java.lang.ThreadLocal<java.security.SecureRandom> r0 = com.google.crypto.tink.subtle.Random.localRandom
            java.lang.Object r0 = r0.get()
            java.security.SecureRandom r0 = (java.security.SecureRandom) r0
            int r0 = r0.nextInt()
            return r0
    }

    public static final int randInt(int r1) {
            java.lang.ThreadLocal<java.security.SecureRandom> r0 = com.google.crypto.tink.subtle.Random.localRandom
            java.lang.Object r0 = r0.get()
            java.security.SecureRandom r0 = (java.security.SecureRandom) r0
            int r0 = r0.nextInt(r1)
            return r0
    }
}
