package com.google.crypto.tink.internal;

/* JADX INFO: loaded from: classes.dex */
public final class Util {
    public static final java.nio.charset.Charset UTF_8 = null;

    static {
            java.lang.String r0 = "UTF-8"
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r0)
            com.google.crypto.tink.internal.Util.UTF_8 = r0
            return
    }

    private Util() {
            r0 = this;
            r0.<init>()
            return
    }

    @javax.annotation.Nullable
    public static java.lang.Integer getAndroidApiLevel() {
            boolean r0 = isAndroid()
            if (r0 != 0) goto L8
            r0 = 0
            return r0
        L8:
            java.lang.Integer r0 = com.google.crypto.tink.internal.BuildDispatchedCode.getApiLevel()
            return r0
    }

    public static boolean isAndroid() {
            java.lang.String r0 = "java.vendor"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            java.lang.String r1 = "The Android Project"
            boolean r0 = java.util.Objects.equals(r0, r1)
            return r0
    }

    public static int randKeyId() {
            java.security.SecureRandom r0 = new java.security.SecureRandom
            r0.<init>()
            r1 = 4
            byte[] r1 = new byte[r1]
            r2 = 0
        L9:
            if (r2 != 0) goto L2d
            r0.nextBytes(r1)
            r3 = 0
            r3 = r1[r3]
            r3 = r3 & 127(0x7f, float:1.78E-43)
            int r3 = r3 << 24
            r4 = 1
            r4 = r1[r4]
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r4 = r4 << 16
            r3 = r3 | r4
            r4 = 2
            r4 = r1[r4]
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r4 = r4 << 8
            r3 = r3 | r4
            r4 = 3
            r4 = r1[r4]
            r4 = r4 & 255(0xff, float:3.57E-43)
            r2 = r3 | r4
            goto L9
        L2d:
            return r2
    }

    private static final byte toByteFromPrintableAscii(char r3) {
            r0 = 33
            if (r3 < r0) goto La
            r0 = 126(0x7e, float:1.77E-43)
            if (r3 > r0) goto La
            byte r0 = (byte) r3
            return r0
        La:
            com.google.crypto.tink.internal.TinkBugException r0 = new com.google.crypto.tink.internal.TinkBugException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Not a printable ASCII character: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public static final com.google.crypto.tink.util.Bytes toBytesFromPrintableAscii(java.lang.String r3) {
            int r0 = r3.length()
            byte[] r0 = new byte[r0]
            r1 = 0
        L7:
            int r2 = r3.length()
            if (r1 >= r2) goto L1a
            char r2 = r3.charAt(r1)
            byte r2 = toByteFromPrintableAscii(r2)
            r0[r1] = r2
            int r1 = r1 + 1
            goto L7
        L1a:
            com.google.crypto.tink.util.Bytes r1 = com.google.crypto.tink.util.Bytes.copyFrom(r0)
            return r1
    }
}
