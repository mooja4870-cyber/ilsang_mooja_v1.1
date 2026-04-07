package com.google.crypto.tink.subtle;

/* JADX INFO: loaded from: classes.dex */
public final class SubtleUtil {

    /* JADX INFO: renamed from: com.google.crypto.tink.subtle.SubtleUtil$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$subtle$Enums$HashType = null;

        static {
                com.google.crypto.tink.subtle.Enums$HashType[] r0 = com.google.crypto.tink.subtle.Enums.HashType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.google.crypto.tink.subtle.SubtleUtil.AnonymousClass1.$SwitchMap$com$google$crypto$tink$subtle$Enums$HashType = r0
                int[] r0 = com.google.crypto.tink.subtle.SubtleUtil.AnonymousClass1.$SwitchMap$com$google$crypto$tink$subtle$Enums$HashType     // Catch: java.lang.NoSuchFieldError -> L15
                com.google.crypto.tink.subtle.Enums$HashType r1 = com.google.crypto.tink.subtle.Enums.HashType.SHA1     // Catch: java.lang.NoSuchFieldError -> L15
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L15
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L15
                goto L16
            L15:
                r0 = move-exception
            L16:
                int[] r0 = com.google.crypto.tink.subtle.SubtleUtil.AnonymousClass1.$SwitchMap$com$google$crypto$tink$subtle$Enums$HashType     // Catch: java.lang.NoSuchFieldError -> L22
                com.google.crypto.tink.subtle.Enums$HashType r1 = com.google.crypto.tink.subtle.Enums.HashType.SHA224     // Catch: java.lang.NoSuchFieldError -> L22
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L22
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L22
                goto L23
            L22:
                r0 = move-exception
            L23:
                int[] r0 = com.google.crypto.tink.subtle.SubtleUtil.AnonymousClass1.$SwitchMap$com$google$crypto$tink$subtle$Enums$HashType     // Catch: java.lang.NoSuchFieldError -> L2f
                com.google.crypto.tink.subtle.Enums$HashType r1 = com.google.crypto.tink.subtle.Enums.HashType.SHA256     // Catch: java.lang.NoSuchFieldError -> L2f
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L2f
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L2f
                goto L30
            L2f:
                r0 = move-exception
            L30:
                int[] r0 = com.google.crypto.tink.subtle.SubtleUtil.AnonymousClass1.$SwitchMap$com$google$crypto$tink$subtle$Enums$HashType     // Catch: java.lang.NoSuchFieldError -> L3c
                com.google.crypto.tink.subtle.Enums$HashType r1 = com.google.crypto.tink.subtle.Enums.HashType.SHA384     // Catch: java.lang.NoSuchFieldError -> L3c
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3c
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3c
                goto L3d
            L3c:
                r0 = move-exception
            L3d:
                int[] r0 = com.google.crypto.tink.subtle.SubtleUtil.AnonymousClass1.$SwitchMap$com$google$crypto$tink$subtle$Enums$HashType     // Catch: java.lang.NoSuchFieldError -> L49
                com.google.crypto.tink.subtle.Enums$HashType r1 = com.google.crypto.tink.subtle.Enums.HashType.SHA512     // Catch: java.lang.NoSuchFieldError -> L49
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L49
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L49
                goto L4a
            L49:
                r0 = move-exception
            L4a:
                return
        }
    }

    private SubtleUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    @java.lang.Deprecated
    public static int androidApiLevel() {
            java.lang.Integer r0 = com.google.crypto.tink.internal.Util.getAndroidApiLevel()
            if (r0 == 0) goto Lb
            int r1 = r0.intValue()
            return r1
        Lb:
            r1 = -1
            return r1
    }

    public static java.math.BigInteger bytes2Integer(byte[] r1) {
            java.math.BigInteger r0 = com.google.crypto.tink.internal.BigIntegerEncoding.fromUnsignedBigEndianBytes(r1)
            return r0
    }

    public static byte[] integer2Bytes(java.math.BigInteger r1, int r2) throws java.security.GeneralSecurityException {
            byte[] r0 = com.google.crypto.tink.internal.BigIntegerEncoding.toBigEndianBytesOfFixedLength(r1, r2)
            return r0
    }

    public static boolean isAndroid() {
            java.lang.String r0 = "java.vendor"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            java.lang.String r1 = "The Android Project"
            boolean r0 = r1.equals(r0)
            return r0
    }

    public static byte[] mgf1(byte[] r8, int r9, com.google.crypto.tink.subtle.Enums.HashType r10) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.subtle.EngineFactory<com.google.crypto.tink.subtle.EngineWrapper$TMessageDigest, java.security.MessageDigest> r0 = com.google.crypto.tink.subtle.EngineFactory.MESSAGE_DIGEST
            java.lang.String r1 = toDigestAlgo(r10)
            java.lang.Object r0 = r0.getInstance(r1)
            java.security.MessageDigest r0 = (java.security.MessageDigest) r0
            int r1 = r0.getDigestLength()
            byte[] r2 = new byte[r9]
            r3 = 0
            r4 = 0
        L14:
            int r5 = r9 + (-1)
            int r5 = r5 / r1
            if (r4 > r5) goto L40
            r0.reset()
            r0.update(r8)
            long r5 = (long) r4
            java.math.BigInteger r5 = java.math.BigInteger.valueOf(r5)
            r6 = 4
            byte[] r5 = integer2Bytes(r5, r6)
            r0.update(r5)
            byte[] r5 = r0.digest()
            int r6 = r5.length
            int r7 = r2.length
            int r7 = r7 - r3
            int r6 = java.lang.Math.min(r6, r7)
            r7 = 0
            java.lang.System.arraycopy(r5, r7, r2, r3, r6)
            int r6 = r5.length
            int r3 = r3 + r6
            int r4 = r4 + 1
            goto L14
        L40:
            return r2
    }

    public static void putAsUnsigedInt(java.nio.ByteBuffer r2, long r3) throws java.security.GeneralSecurityException {
            r0 = 0
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 > 0) goto L14
            r0 = 4294967296(0x100000000, double:2.121995791E-314)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 >= 0) goto L14
            int r0 = (int) r3
            r2.putInt(r0)
            return
        L14:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "Index out of range"
            r0.<init>(r1)
            throw r0
    }

    public static java.lang.String toDigestAlgo(com.google.crypto.tink.subtle.Enums.HashType r3) throws java.security.GeneralSecurityException {
            int[] r0 = com.google.crypto.tink.subtle.SubtleUtil.AnonymousClass1.$SwitchMap$com$google$crypto$tink$subtle$Enums$HashType
            int r1 = r3.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L30;
                case 2: goto L2d;
                case 3: goto L2a;
                case 4: goto L27;
                case 5: goto L24;
                default: goto Lb;
            }
        Lb:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unsupported hash "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L24:
            java.lang.String r0 = "SHA-512"
            return r0
        L27:
            java.lang.String r0 = "SHA-384"
            return r0
        L2a:
            java.lang.String r0 = "SHA-256"
            return r0
        L2d:
            java.lang.String r0 = "SHA-224"
            return r0
        L30:
            java.lang.String r0 = "SHA-1"
            return r0
    }

    public static java.lang.String toEcdsaAlgo(com.google.crypto.tink.subtle.Enums.HashType r2) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.subtle.Validators.validateSignatureHash(r2)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r1 = "withECDSA"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public static java.lang.String toRsaSsaPkcs1Algo(com.google.crypto.tink.subtle.Enums.HashType r2) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.subtle.Validators.validateSignatureHash(r2)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r1 = "withRSA"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
