package androidx.core.net;

/* JADX INFO: loaded from: classes.dex */
public final class UriCompat {
    private UriCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String toSafeString(android.net.Uri r8) {
            java.lang.String r0 = r8.getScheme()
            java.lang.String r1 = r8.getSchemeSpecificPart()
            r2 = 58
            r3 = 64
            if (r0 == 0) goto Ldd
            java.lang.String r4 = "tel"
            boolean r4 = r0.equalsIgnoreCase(r4)
            if (r4 != 0) goto La9
            java.lang.String r4 = "sip"
            boolean r4 = r0.equalsIgnoreCase(r4)
            if (r4 != 0) goto La9
            java.lang.String r4 = "sms"
            boolean r4 = r0.equalsIgnoreCase(r4)
            if (r4 != 0) goto La9
            java.lang.String r4 = "smsto"
            boolean r4 = r0.equalsIgnoreCase(r4)
            if (r4 != 0) goto La9
            java.lang.String r4 = "mailto"
            boolean r4 = r0.equalsIgnoreCase(r4)
            if (r4 != 0) goto La9
            java.lang.String r4 = "nfc"
            boolean r4 = r0.equalsIgnoreCase(r4)
            if (r4 == 0) goto L3f
            goto La9
        L3f:
            java.lang.String r4 = "http"
            boolean r4 = r0.equalsIgnoreCase(r4)
            if (r4 != 0) goto L5f
            java.lang.String r4 = "https"
            boolean r4 = r0.equalsIgnoreCase(r4)
            if (r4 != 0) goto L5f
            java.lang.String r4 = "ftp"
            boolean r4 = r0.equalsIgnoreCase(r4)
            if (r4 != 0) goto L5f
            java.lang.String r4 = "rtsp"
            boolean r4 = r0.equalsIgnoreCase(r4)
            if (r4 == 0) goto Ldd
        L5f:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "//"
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r5 = r8.getHost()
            java.lang.String r6 = ""
            if (r5 == 0) goto L77
            java.lang.String r5 = r8.getHost()
            goto L78
        L77:
            r5 = r6
        L78:
            java.lang.StringBuilder r4 = r4.append(r5)
            int r5 = r8.getPort()
            r7 = -1
            if (r5 == r7) goto L9a
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = ":"
            java.lang.StringBuilder r5 = r5.append(r6)
            int r6 = r8.getPort()
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r6 = r5.toString()
        L9a:
            java.lang.StringBuilder r4 = r4.append(r6)
            java.lang.String r5 = "/..."
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r1 = r4.toString()
            goto Ldd
        La9:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r3)
            r4.append(r0)
            r4.append(r2)
            if (r1 == 0) goto Ld8
            r2 = 0
        Lb7:
            int r5 = r1.length()
            if (r2 >= r5) goto Ld8
            char r5 = r1.charAt(r2)
            r6 = 45
            if (r5 == r6) goto Ld2
            if (r5 == r3) goto Ld2
            r6 = 46
            if (r5 != r6) goto Lcc
            goto Ld2
        Lcc:
            r6 = 120(0x78, float:1.68E-43)
            r4.append(r6)
            goto Ld5
        Ld2:
            r4.append(r5)
        Ld5:
            int r2 = r2 + 1
            goto Lb7
        Ld8:
            java.lang.String r2 = r4.toString()
            return r2
        Ldd:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r3)
            if (r0 == 0) goto Lea
            r4.append(r0)
            r4.append(r2)
        Lea:
            if (r1 == 0) goto Lef
            r4.append(r1)
        Lef:
            java.lang.String r2 = r4.toString()
            return r2
    }
}
