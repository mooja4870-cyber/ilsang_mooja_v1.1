package androidx.core.content.pm;

/* JADX INFO: loaded from: classes.dex */
public final class PackageInfoCompat {

    private static class Api28Impl {
        private Api28Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static android.content.pm.Signature[] getApkContentsSigners(android.content.pm.SigningInfo r1) {
                android.content.pm.Signature[] r0 = r1.getApkContentsSigners()
                return r0
        }

        static long getLongVersionCode(android.content.pm.PackageInfo r2) {
                long r0 = r2.getLongVersionCode()
                return r0
        }

        static android.content.pm.Signature[] getSigningCertificateHistory(android.content.pm.SigningInfo r1) {
                android.content.pm.Signature[] r0 = r1.getSigningCertificateHistory()
                return r0
        }

        static boolean hasMultipleSigners(android.content.pm.SigningInfo r1) {
                boolean r0 = r1.hasMultipleSigners()
                return r0
        }

        static boolean hasSigningCertificate(android.content.pm.PackageManager r1, java.lang.String r2, byte[] r3, int r4) {
                boolean r0 = r1.hasSigningCertificate(r2, r3, r4)
                return r0
        }
    }

    private PackageInfoCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    private static boolean byteArrayContains(byte[][] r5, byte[] r6) {
            int r0 = r5.length
            r1 = 0
            r2 = r1
        L3:
            if (r2 >= r0) goto L12
            r3 = r5[r2]
            boolean r4 = java.util.Arrays.equals(r6, r3)
            if (r4 == 0) goto Lf
            r0 = 1
            return r0
        Lf:
            int r2 = r2 + 1
            goto L3
        L12:
            return r1
    }

    private static byte[] computeSHA256Digest(byte[] r3) {
            java.lang.String r0 = "SHA256"
            java.security.MessageDigest r0 = java.security.MessageDigest.getInstance(r0)     // Catch: java.security.NoSuchAlgorithmException -> Lb
            byte[] r0 = r0.digest(r3)     // Catch: java.security.NoSuchAlgorithmException -> Lb
            return r0
        Lb:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Device doesn't support SHA256 cert checking"
            r1.<init>(r2, r0)
            throw r1
    }

    public static long getLongVersionCode(android.content.pm.PackageInfo r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Lb
            long r0 = androidx.core.content.pm.PackageInfoCompat.Api28Impl.getLongVersionCode(r2)
            return r0
        Lb:
            int r0 = r2.versionCode
            long r0 = (long) r0
            return r0
    }

    public static java.util.List<android.content.pm.Signature> getSignatures(android.content.pm.PackageManager r3, java.lang.String r4) throws android.content.pm.PackageManager.NameNotFoundException {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L1e
            r0 = 134217728(0x8000000, float:3.85186E-34)
            android.content.pm.PackageInfo r0 = r3.getPackageInfo(r4, r0)
            android.content.pm.SigningInfo r1 = r0.signingInfo
            boolean r2 = androidx.core.content.pm.PackageInfoCompat.Api28Impl.hasMultipleSigners(r1)
            if (r2 == 0) goto L19
            android.content.pm.Signature[] r2 = androidx.core.content.pm.PackageInfoCompat.Api28Impl.getApkContentsSigners(r1)
            goto L1d
        L19:
            android.content.pm.Signature[] r2 = androidx.core.content.pm.PackageInfoCompat.Api28Impl.getSigningCertificateHistory(r1)
        L1d:
            goto L26
        L1e:
            r0 = 64
            android.content.pm.PackageInfo r0 = r3.getPackageInfo(r4, r0)
            android.content.pm.Signature[] r2 = r0.signatures
        L26:
            if (r2 != 0) goto L2d
            java.util.List r0 = java.util.Collections.emptyList()
            return r0
        L2d:
            java.util.List r0 = java.util.Arrays.asList(r2)
            return r0
    }

    public static boolean hasSignatures(android.content.pm.PackageManager r10, java.lang.String r11, java.util.Map<byte[], java.lang.Integer> r12, boolean r13) throws android.content.pm.PackageManager.NameNotFoundException {
            boolean r0 = r12.isEmpty()
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            java.util.Set r0 = r12.keySet()
            java.util.Iterator r2 = r0.iterator()
        L10:
            boolean r3 = r2.hasNext()
            java.lang.String r4 = "Unsupported certificate type "
            if (r3 == 0) goto L84
            java.lang.Object r3 = r2.next()
            byte[] r3 = (byte[]) r3
            if (r3 == 0) goto L6b
            java.lang.Object r5 = r12.get(r3)
            java.lang.Integer r5 = (java.lang.Integer) r5
            if (r5 == 0) goto L52
            int r6 = r5.intValue()
            switch(r6) {
                case 0: goto L50;
                case 1: goto L50;
                default: goto L2f;
            }
        L2f:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.StringBuilder r2 = r2.append(r4)
            java.lang.StringBuilder r2 = r2.append(r5)
            java.lang.String r4 = " when verifying "
            java.lang.StringBuilder r2 = r2.append(r4)
            java.lang.StringBuilder r2 = r2.append(r11)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L50:
            goto L10
        L52:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "Type must be specified for cert when verifying "
            java.lang.StringBuilder r2 = r2.append(r4)
            java.lang.StringBuilder r2 = r2.append(r11)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L6b:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "Cert byte array cannot be null when verifying "
            java.lang.StringBuilder r2 = r2.append(r4)
            java.lang.StringBuilder r2 = r2.append(r11)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L84:
            java.util.List r2 = getSignatures(r10, r11)
            r3 = 1
            if (r13 != 0) goto Lb4
            int r5 = android.os.Build.VERSION.SDK_INT
            r6 = 28
            if (r5 < r6) goto Lb4
            java.util.Iterator r4 = r0.iterator()
        L95:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto Lb3
            java.lang.Object r5 = r4.next()
            byte[] r5 = (byte[]) r5
            java.lang.Object r6 = r12.get(r5)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r7 = r6.intValue()
            boolean r7 = androidx.core.content.pm.PackageInfoCompat.Api28Impl.hasSigningCertificate(r10, r11, r5, r7)
            if (r7 != 0) goto Lb2
            return r1
        Lb2:
            goto L95
        Lb3:
            return r3
        Lb4:
            int r5 = r2.size()
            if (r5 == 0) goto L145
            int r5 = r12.size()
            int r6 = r2.size()
            if (r5 > r6) goto L145
            if (r13 == 0) goto Ld1
            int r5 = r12.size()
            int r6 = r2.size()
            if (r5 == r6) goto Ld1
            goto L145
        Ld1:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
            boolean r5 = r12.containsValue(r5)
            r6 = 0
            if (r5 == 0) goto Lfc
            int r7 = r2.size()
            byte[][] r6 = new byte[r7][]
            r7 = 0
        Le3:
            int r8 = r2.size()
            if (r7 >= r8) goto Lfc
            java.lang.Object r8 = r2.get(r7)
            android.content.pm.Signature r8 = (android.content.pm.Signature) r8
            byte[] r8 = r8.toByteArray()
            byte[] r8 = computeSHA256Digest(r8)
            r6[r7] = r8
            int r7 = r7 + 1
            goto Le3
        Lfc:
            java.util.Iterator r7 = r0.iterator()
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L144
            java.lang.Object r7 = r7.next()
            byte[] r7 = (byte[]) r7
            java.lang.Object r8 = r12.get(r7)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r9 = r8.intValue()
            switch(r9) {
                case 0: goto L137;
                case 1: goto L130;
                default: goto L119;
            }
        L119:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r3 = r3.append(r8)
            java.lang.String r3 = r3.toString()
            r1.<init>(r3)
            throw r1
        L130:
            boolean r4 = byteArrayContains(r6, r7)
            if (r4 != 0) goto L143
            return r1
        L137:
            android.content.pm.Signature r4 = new android.content.pm.Signature
            r4.<init>(r7)
            boolean r9 = r2.contains(r4)
            if (r9 != 0) goto L143
            return r1
        L143:
            return r3
        L144:
            return r1
        L145:
            return r1
    }
}
