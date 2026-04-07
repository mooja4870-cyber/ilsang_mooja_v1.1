package com.getcapacitor;

/* JADX INFO: loaded from: classes3.dex */
public final class AppUUID {
    private static final java.lang.String KEY = "CapacitorAppUUID";

    public AppUUID() {
            r0 = this;
            r0.<init>()
            return
    }

    private static void assertAppUUID(androidx.appcompat.app.AppCompatActivity r2) throws java.lang.Exception {
            java.lang.String r0 = readUUID(r2)
            java.lang.String r1 = ""
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto Lf
            regenerateAppUUID(r2)
        Lf:
            return
    }

    private static java.lang.String bytesToHex(byte[] r6) {
            java.lang.String r0 = "0123456789ABCDEF"
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.US_ASCII
            byte[] r0 = r0.getBytes(r1)
            int r1 = r6.length
            int r1 = r1 * 2
            byte[] r1 = new byte[r1]
            r2 = 0
        Le:
            int r3 = r6.length
            if (r2 >= r3) goto L2a
            r3 = r6[r2]
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r4 = r2 * 2
            int r5 = r3 >>> 4
            r5 = r0[r5]
            r1[r4] = r5
            int r4 = r2 * 2
            int r4 = r4 + 1
            r5 = r3 & 15
            r5 = r0[r5]
            r1[r4] = r5
            int r2 = r2 + 1
            goto Le
        L2a:
            java.lang.String r2 = new java.lang.String
            java.nio.charset.Charset r3 = java.nio.charset.StandardCharsets.UTF_8
            r2.<init>(r1, r3)
            return r2
    }

    private static java.lang.String generateUUID() throws java.security.NoSuchAlgorithmException {
            java.lang.String r0 = "SHA-256"
            java.security.MessageDigest r0 = java.security.MessageDigest.getInstance(r0)
            java.util.UUID r1 = java.util.UUID.randomUUID()
            java.lang.String r1 = r1.toString()
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.UTF_8
            byte[] r1 = r1.getBytes(r2)
            r0.update(r1)
            byte[] r1 = r0.digest()
            java.lang.String r1 = bytesToHex(r1)
            return r1
    }

    public static java.lang.String getAppUUID(androidx.appcompat.app.AppCompatActivity r1) throws java.lang.Exception {
            assertAppUUID(r1)
            java.lang.String r0 = readUUID(r1)
            return r0
    }

    private static java.lang.String readUUID(androidx.appcompat.app.AppCompatActivity r3) {
            r0 = 0
            android.content.SharedPreferences r0 = r3.getPreferences(r0)
            java.lang.String r1 = "CapacitorAppUUID"
            java.lang.String r2 = ""
            java.lang.String r1 = r0.getString(r1, r2)
            return r1
    }

    public static void regenerateAppUUID(androidx.appcompat.app.AppCompatActivity r3) throws java.lang.Exception {
            java.lang.String r0 = generateUUID()     // Catch: java.security.NoSuchAlgorithmException -> L9
            writeUUID(r3, r0)     // Catch: java.security.NoSuchAlgorithmException -> L9
            return
        L9:
            r0 = move-exception
            java.lang.Exception r1 = new java.lang.Exception
            java.lang.String r2 = "Capacitor App UUID could not be generated."
            r1.<init>(r2)
            throw r1
    }

    private static void writeUUID(androidx.appcompat.app.AppCompatActivity r3, java.lang.String r4) {
            r0 = 0
            android.content.SharedPreferences r0 = r3.getPreferences(r0)
            android.content.SharedPreferences$Editor r1 = r0.edit()
            java.lang.String r2 = "CapacitorAppUUID"
            r1.putString(r2, r4)
            r1.apply()
            return
    }
}
