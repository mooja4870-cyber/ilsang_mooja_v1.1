package com.google.crypto.tink.subtle;

/* JADX INFO: loaded from: classes.dex */
public final class Hex {
    private Hex() {
            r0 = this;
            r0.<init>()
            return
    }

    public static byte[] decode(java.lang.String r7) {
            int r0 = r7.length()
            int r0 = r0 % 2
            if (r0 != 0) goto L42
            int r0 = r7.length()
            int r0 = r0 / 2
            byte[] r1 = new byte[r0]
            r2 = 0
        L11:
            if (r2 >= r0) goto L41
            int r3 = r2 * 2
            char r3 = r7.charAt(r3)
            r4 = 16
            int r3 = java.lang.Character.digit(r3, r4)
            int r5 = r2 * 2
            int r5 = r5 + 1
            char r5 = r7.charAt(r5)
            int r4 = java.lang.Character.digit(r5, r4)
            r5 = -1
            if (r3 == r5) goto L39
            if (r4 == r5) goto L39
            int r5 = r3 * 16
            int r5 = r5 + r4
            byte r5 = (byte) r5
            r1[r2] = r5
            int r2 = r2 + 1
            goto L11
        L39:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "input is not hexadecimal"
            r5.<init>(r6)
            throw r5
        L41:
            return r1
        L42:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Expected a string of even length"
            r0.<init>(r1)
            throw r0
    }

    public static java.lang.String encode(byte[] r7) {
            java.lang.String r0 = "0123456789abcdef"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r2 = r7.length
            int r2 = r2 * 2
            r1.<init>(r2)
            int r2 = r7.length
            r3 = 0
        Lc:
            if (r3 >= r2) goto L27
            r4 = r7[r3]
            r5 = r4 & 255(0xff, float:3.57E-43)
            int r6 = r5 / 16
            char r6 = r0.charAt(r6)
            r1.append(r6)
            int r6 = r5 % 16
            char r6 = r0.charAt(r6)
            r1.append(r6)
            int r3 = r3 + 1
            goto Lc
        L27:
            java.lang.String r2 = r1.toString()
            return r2
    }
}
