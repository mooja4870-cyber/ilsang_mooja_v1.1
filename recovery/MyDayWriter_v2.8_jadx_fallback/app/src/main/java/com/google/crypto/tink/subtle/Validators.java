package com.google.crypto.tink.subtle;

/* JADX INFO: loaded from: classes.dex */
public final class Validators {
    private static final java.util.regex.Pattern GCP_KMS_CRYPTO_KEY_PATTERN = null;
    private static final java.util.regex.Pattern GCP_KMS_CRYPTO_KEY_VERSION_PATTERN = null;
    private static final int MIN_RSA_MODULUS_SIZE = 2048;
    private static final java.lang.String TYPE_URL_PREFIX = "type.googleapis.com/";
    private static final java.lang.String URI_UNRESERVED_CHARS = "([0-9a-zA-Z\\-\\.\\_~])+";

    /* JADX INFO: renamed from: com.google.crypto.tink.subtle.Validators$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$subtle$Enums$HashType = null;

        static {
                com.google.crypto.tink.subtle.Enums$HashType[] r0 = com.google.crypto.tink.subtle.Enums.HashType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.google.crypto.tink.subtle.Validators.AnonymousClass1.$SwitchMap$com$google$crypto$tink$subtle$Enums$HashType = r0
                int[] r0 = com.google.crypto.tink.subtle.Validators.AnonymousClass1.$SwitchMap$com$google$crypto$tink$subtle$Enums$HashType     // Catch: java.lang.NoSuchFieldError -> L15
                com.google.crypto.tink.subtle.Enums$HashType r1 = com.google.crypto.tink.subtle.Enums.HashType.SHA256     // Catch: java.lang.NoSuchFieldError -> L15
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L15
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L15
                goto L16
            L15:
                r0 = move-exception
            L16:
                int[] r0 = com.google.crypto.tink.subtle.Validators.AnonymousClass1.$SwitchMap$com$google$crypto$tink$subtle$Enums$HashType     // Catch: java.lang.NoSuchFieldError -> L22
                com.google.crypto.tink.subtle.Enums$HashType r1 = com.google.crypto.tink.subtle.Enums.HashType.SHA384     // Catch: java.lang.NoSuchFieldError -> L22
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L22
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L22
                goto L23
            L22:
                r0 = move-exception
            L23:
                int[] r0 = com.google.crypto.tink.subtle.Validators.AnonymousClass1.$SwitchMap$com$google$crypto$tink$subtle$Enums$HashType     // Catch: java.lang.NoSuchFieldError -> L2f
                com.google.crypto.tink.subtle.Enums$HashType r1 = com.google.crypto.tink.subtle.Enums.HashType.SHA512     // Catch: java.lang.NoSuchFieldError -> L2f
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L2f
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L2f
                goto L30
            L2f:
                r0 = move-exception
            L30:
                return
        }
    }

    static {
            java.lang.String r0 = "([0-9a-zA-Z\\-\\.\\_~])+"
            java.lang.Object[] r1 = new java.lang.Object[]{r0, r0, r0, r0}
            java.lang.String r2 = "^projects/%s/locations/%s/keyRings/%s/cryptoKeys/%s$"
            java.lang.String r1 = java.lang.String.format(r2, r1)
            r2 = 2
            java.util.regex.Pattern r1 = java.util.regex.Pattern.compile(r1, r2)
            com.google.crypto.tink.subtle.Validators.GCP_KMS_CRYPTO_KEY_PATTERN = r1
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r0, r0, r0, r0}
            java.lang.String r1 = "^projects/%s/locations/%s/keyRings/%s/cryptoKeys/%s/cryptoKeyVersions/%s$"
            java.lang.String r0 = java.lang.String.format(r1, r0)
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0, r2)
            com.google.crypto.tink.subtle.Validators.GCP_KMS_CRYPTO_KEY_VERSION_PATTERN = r0
            return
    }

    private Validators() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void validateAesKeySize(int r3) throws java.security.InvalidAlgorithmParameterException {
            r0 = 16
            if (r3 == r0) goto L1f
            r0 = 32
            if (r3 != r0) goto L9
            goto L1f
        L9:
            java.security.InvalidAlgorithmParameterException r0 = new java.security.InvalidAlgorithmParameterException
            int r1 = r3 * 8
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r2 = "invalid key size %d; only 128-bit and 256-bit AES keys are supported"
            java.lang.String r1 = java.lang.String.format(r2, r1)
            r0.<init>(r1)
            throw r0
        L1f:
            return
    }

    public static void validateCryptoKeyUri(java.lang.String r2) throws java.security.GeneralSecurityException {
            java.util.regex.Pattern r0 = com.google.crypto.tink.subtle.Validators.GCP_KMS_CRYPTO_KEY_PATTERN
            java.util.regex.Matcher r0 = r0.matcher(r2)
            boolean r0 = r0.matches()
            if (r0 != 0) goto L28
            java.util.regex.Pattern r0 = com.google.crypto.tink.subtle.Validators.GCP_KMS_CRYPTO_KEY_VERSION_PATTERN
            java.util.regex.Matcher r0 = r0.matcher(r2)
            boolean r0 = r0.matches()
            if (r0 == 0) goto L20
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "Invalid Google Cloud KMS Key URI. The URI must point to a CryptoKey, not a CryptoKeyVersion"
            r0.<init>(r1)
            throw r0
        L20:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "Invalid Google Cloud KMS Key URI. The URI must point to a CryptoKey in the format projects/*/locations/*/keyRings/*/cryptoKeys/*. See https://cloud.google.com/kms/docs/reference/rest/v1/projects.locations.keyRings.cryptoKeys#CryptoKey"
            r0.<init>(r1)
            throw r0
        L28:
            return
    }

    public static void validateExists(java.io.File r3) throws java.io.IOException {
            boolean r0 = r3.exists()
            if (r0 == 0) goto L7
            return
        L7:
            java.io.IOException r0 = new java.io.IOException
            java.lang.Object[] r1 = new java.lang.Object[]{r3}
            java.lang.String r2 = "Error: %s doesn't exist, please choose another file\n"
            java.lang.String r1 = java.lang.String.format(r2, r1)
            r0.<init>(r1)
            throw r0
    }

    public static java.lang.String validateKmsKeyUriAndRemovePrefix(java.lang.String r3, java.lang.String r4) {
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r0 = r4.toLowerCase(r0)
            boolean r0 = r0.startsWith(r3)
            if (r0 == 0) goto L15
            int r0 = r3.length()
            java.lang.String r0 = r4.substring(r0)
            return r0
        L15:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.Object[] r1 = new java.lang.Object[]{r3}
            java.lang.String r2 = "key URI must start with %s"
            java.lang.String r1 = java.lang.String.format(r2, r1)
            r0.<init>(r1)
            throw r0
    }

    public static void validateNotExists(java.io.File r3) throws java.io.IOException {
            boolean r0 = r3.exists()
            if (r0 != 0) goto L7
            return
        L7:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "%s exists, please choose another file\n"
            java.lang.Object[] r2 = new java.lang.Object[]{r3}
            java.lang.String r1 = java.lang.String.format(r1, r2)
            r0.<init>(r1)
            throw r0
    }

    public static void validateRsaModulusSize(int r3) throws java.security.GeneralSecurityException {
            r0 = 2048(0x800, float:2.87E-42)
            if (r3 < r0) goto L26
            boolean r1 = com.google.crypto.tink.config.internal.TinkFipsUtil.useOnlyFips()
            if (r1 == 0) goto L25
            if (r3 == r0) goto L25
            r0 = 3072(0xc00, float:4.305E-42)
            if (r3 != r0) goto L11
            goto L25
        L11:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r2 = "Modulus size is %d; only modulus size of 2048- or 3072-bit is supported in FIPS mode."
            java.lang.String r1 = java.lang.String.format(r2, r1)
            r0.<init>(r1)
            throw r0
        L25:
            return
        L26:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r2 = "Modulus size is %d; only modulus size >= 2048-bit is supported"
            java.lang.String r1 = java.lang.String.format(r2, r1)
            r0.<init>(r1)
            throw r0
    }

    public static void validateRsaPublicExponent(java.math.BigInteger r2) throws java.security.GeneralSecurityException {
            r0 = 0
            boolean r0 = r2.testBit(r0)
            if (r0 == 0) goto L1d
            r0 = 65536(0x10000, double:3.2379E-319)
            java.math.BigInteger r0 = java.math.BigInteger.valueOf(r0)
            int r0 = r2.compareTo(r0)
            if (r0 <= 0) goto L15
            return
        L15:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "Public exponent must be greater than 65536."
            r0.<init>(r1)
            throw r0
        L1d:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "Public exponent must be odd."
            r0.<init>(r1)
            throw r0
    }

    public static void validateSignatureHash(com.google.crypto.tink.subtle.Enums.HashType r3) throws java.security.GeneralSecurityException {
            int[] r0 = com.google.crypto.tink.subtle.Validators.AnonymousClass1.$SwitchMap$com$google$crypto$tink$subtle$Enums$HashType
            int r1 = r3.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L28;
                case 2: goto L28;
                case 3: goto L28;
                default: goto Lb;
            }
        Lb:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unsupported hash: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = r3.name()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L28:
            return
    }

    public static void validateTypeUrl(java.lang.String r3) throws java.security.GeneralSecurityException {
            java.lang.String r0 = "type.googleapis.com/"
            boolean r1 = r3.startsWith(r0)
            if (r1 == 0) goto L23
            int r1 = r3.length()
            int r0 = r0.length()
            if (r1 == r0) goto L13
            return
        L13:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.Object[] r1 = new java.lang.Object[]{r3}
            java.lang.String r2 = "Error: type URL %s is invalid; it has no message name.\n"
            java.lang.String r1 = java.lang.String.format(r2, r1)
            r0.<init>(r1)
            throw r0
        L23:
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException
            java.lang.Object[] r0 = new java.lang.Object[]{r3, r0}
            java.lang.String r2 = "Error: type URL %s is invalid; it must start with %s.\n"
            java.lang.String r0 = java.lang.String.format(r2, r0)
            r1.<init>(r0)
            throw r1
    }

    public static void validateVersion(int r3, int r4) throws java.security.GeneralSecurityException {
            if (r3 < 0) goto L5
            if (r3 > r4) goto L5
            return
        L5:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r2}
            java.lang.String r2 = "key has version %d; only keys with version in range [0..%d] are supported"
            java.lang.String r1 = java.lang.String.format(r2, r1)
            r0.<init>(r1)
            throw r0
    }
}
