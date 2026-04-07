package com.google.crypto.tink.util;

/* JADX INFO: loaded from: classes.dex */
@com.google.errorprone.annotations.Immutable
public final class Bytes {
    private final byte[] data;

    private Bytes(byte[] r3, int r4, int r5) {
            r2 = this;
            r2.<init>()
            byte[] r0 = new byte[r5]
            r2.data = r0
            byte[] r0 = r2.data
            r1 = 0
            java.lang.System.arraycopy(r3, r4, r0, r1, r5)
            return
    }

    public static com.google.crypto.tink.util.Bytes copyFrom(byte[] r2) {
            if (r2 == 0) goto L9
            r0 = 0
            int r1 = r2.length
            com.google.crypto.tink.util.Bytes r0 = copyFrom(r2, r0, r1)
            return r0
        L9:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "data must be non-null"
            r0.<init>(r1)
            throw r0
    }

    public static com.google.crypto.tink.util.Bytes copyFrom(byte[] r2, int r3, int r4) {
            if (r2 == 0) goto L8
            com.google.crypto.tink.util.Bytes r0 = new com.google.crypto.tink.util.Bytes
            r0.<init>(r2, r3, r4)
            return r0
        L8:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "data must be non-null"
            r0.<init>(r1)
            throw r0
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof com.google.crypto.tink.util.Bytes
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            r0 = r4
            com.google.crypto.tink.util.Bytes r0 = (com.google.crypto.tink.util.Bytes) r0
            byte[] r1 = r0.data
            byte[] r2 = r3.data
            boolean r1 = java.util.Arrays.equals(r1, r2)
            return r1
    }

    public int hashCode() {
            r1 = this;
            byte[] r0 = r1.data
            int r0 = java.util.Arrays.hashCode(r0)
            return r0
    }

    public int size() {
            r1 = this;
            byte[] r0 = r1.data
            int r0 = r0.length
            return r0
    }

    public byte[] toByteArray() {
            r4 = this;
            byte[] r0 = r4.data
            int r0 = r0.length
            byte[] r0 = new byte[r0]
            byte[] r1 = r4.data
            byte[] r2 = r4.data
            int r2 = r2.length
            r3 = 0
            java.lang.System.arraycopy(r1, r3, r0, r3, r2)
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Bytes("
            java.lang.StringBuilder r0 = r0.append(r1)
            byte[] r1 = r2.data
            java.lang.String r1 = com.google.crypto.tink.subtle.Hex.encode(r1)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ")"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
