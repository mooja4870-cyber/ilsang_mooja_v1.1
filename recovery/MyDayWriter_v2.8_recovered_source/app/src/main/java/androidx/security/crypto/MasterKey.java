package androidx.security.crypto;

/* JADX INFO: loaded from: classes.dex */
public final class MasterKey {
    public static final int DEFAULT_AES_GCM_MASTER_KEY_SIZE = 256;
    private static final int DEFAULT_AUTHENTICATION_VALIDITY_DURATION_SECONDS = 300;
    public static final java.lang.String DEFAULT_MASTER_KEY_ALIAS = "_androidx_security_master_key_";
    static final java.lang.String KEYSTORE_PATH_URI = "android-keystore://";
    private final java.lang.String mKeyAlias;
    private final android.security.keystore.KeyGenParameterSpec mKeyGenParameterSpec;

    /* JADX INFO: renamed from: androidx.security.crypto.MasterKey$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$androidx$security$crypto$MasterKey$KeyScheme = null;

        static {
                androidx.security.crypto.MasterKey$KeyScheme[] r0 = androidx.security.crypto.MasterKey.KeyScheme.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.security.crypto.MasterKey.AnonymousClass1.$SwitchMap$androidx$security$crypto$MasterKey$KeyScheme = r0
                int[] r0 = androidx.security.crypto.MasterKey.AnonymousClass1.$SwitchMap$androidx$security$crypto$MasterKey$KeyScheme     // Catch: java.lang.NoSuchFieldError -> L15
                androidx.security.crypto.MasterKey$KeyScheme r1 = androidx.security.crypto.MasterKey.KeyScheme.AES256_GCM     // Catch: java.lang.NoSuchFieldError -> L15
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L15
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L15
                goto L16
            L15:
                r0 = move-exception
            L16:
                return
        }
    }

    static class Api23Impl {
        private Api23Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static int getUserAuthenticationValidityDurationSeconds(android.security.keystore.KeyGenParameterSpec r1) {
                int r0 = r1.getUserAuthenticationValidityDurationSeconds()
                return r0
        }

        static boolean isUserAuthenticationRequired(android.security.keystore.KeyGenParameterSpec r1) {
                boolean r0 = r1.isUserAuthenticationRequired()
                return r0
        }
    }

    static class Api28Impl {
        private Api28Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static boolean isStrongBoxBacked(android.security.keystore.KeyGenParameterSpec r1) {
                boolean r0 = r1.isStrongBoxBacked()
                return r0
        }
    }

    public static final class Builder {
        boolean mAuthenticationRequired;
        final android.content.Context mContext;
        final java.lang.String mKeyAlias;
        android.security.keystore.KeyGenParameterSpec mKeyGenParameterSpec;
        androidx.security.crypto.MasterKey.KeyScheme mKeyScheme;
        boolean mRequestStrongBoxBacked;
        int mUserAuthenticationValidityDurationSeconds;

        static class Api23Impl {

            static class Api28Impl {
                private Api28Impl() {
                        r0 = this;
                        r0.<init>()
                        return
                }

                static void setIsStrongBoxBacked(android.security.keystore.KeyGenParameterSpec.Builder r1) {
                        r0 = 1
                        r1.setIsStrongBoxBacked(r0)
                        return
                }
            }

            static class Api30Impl {
                private Api30Impl() {
                        r0 = this;
                        r0.<init>()
                        return
                }

                static void setUserAuthenticationParameters(android.security.keystore.KeyGenParameterSpec.Builder r0, int r1, int r2) {
                        r0.setUserAuthenticationParameters(r1, r2)
                        return
                }
            }

            private Api23Impl() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            static androidx.security.crypto.MasterKey build(androidx.security.crypto.MasterKey.Builder r6) throws java.security.GeneralSecurityException, java.io.IOException {
                    androidx.security.crypto.MasterKey$KeyScheme r0 = r6.mKeyScheme
                    if (r0 != 0) goto L11
                    android.security.keystore.KeyGenParameterSpec r0 = r6.mKeyGenParameterSpec
                    if (r0 == 0) goto L9
                    goto L11
                L9:
                    java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                    java.lang.String r1 = "build() called before setKeyGenParameterSpec or setKeyScheme."
                    r0.<init>(r1)
                    throw r0
                L11:
                    androidx.security.crypto.MasterKey$KeyScheme r0 = r6.mKeyScheme
                    androidx.security.crypto.MasterKey$KeyScheme r1 = androidx.security.crypto.MasterKey.KeyScheme.AES256_GCM
                    if (r0 != r1) goto L74
                    android.security.keystore.KeyGenParameterSpec$Builder r0 = new android.security.keystore.KeyGenParameterSpec$Builder
                    java.lang.String r1 = r6.mKeyAlias
                    r2 = 3
                    r0.<init>(r1, r2)
                    r1 = 1
                    java.lang.String[] r3 = new java.lang.String[r1]
                    java.lang.String r4 = "GCM"
                    r5 = 0
                    r3[r5] = r4
                    android.security.keystore.KeyGenParameterSpec$Builder r0 = r0.setBlockModes(r3)
                    java.lang.String[] r3 = new java.lang.String[r1]
                    java.lang.String r4 = "NoPadding"
                    r3[r5] = r4
                    android.security.keystore.KeyGenParameterSpec$Builder r0 = r0.setEncryptionPaddings(r3)
                    r3 = 256(0x100, float:3.59E-43)
                    android.security.keystore.KeyGenParameterSpec$Builder r0 = r0.setKeySize(r3)
                    boolean r3 = r6.mAuthenticationRequired
                    if (r3 == 0) goto L53
                    r0.setUserAuthenticationRequired(r1)
                    int r1 = android.os.Build.VERSION.SDK_INT
                    r3 = 30
                    if (r1 < r3) goto L4e
                    int r1 = r6.mUserAuthenticationValidityDurationSeconds
                    androidx.security.crypto.MasterKey.Builder.Api23Impl.Api30Impl.setUserAuthenticationParameters(r0, r1, r2)
                    goto L53
                L4e:
                    int r1 = r6.mUserAuthenticationValidityDurationSeconds
                    r0.setUserAuthenticationValidityDurationSeconds(r1)
                L53:
                    int r1 = android.os.Build.VERSION.SDK_INT
                    r2 = 28
                    if (r1 < r2) goto L6e
                    boolean r1 = r6.mRequestStrongBoxBacked
                    if (r1 == 0) goto L6e
                    android.content.Context r1 = r6.mContext
                    android.content.pm.PackageManager r1 = r1.getPackageManager()
                    java.lang.String r2 = "android.hardware.strongbox_keystore"
                    boolean r1 = r1.hasSystemFeature(r2)
                    if (r1 == 0) goto L6e
                    androidx.security.crypto.MasterKey.Builder.Api23Impl.Api28Impl.setIsStrongBoxBacked(r0)
                L6e:
                    android.security.keystore.KeyGenParameterSpec r1 = r0.build()
                    r6.mKeyGenParameterSpec = r1
                L74:
                    android.security.keystore.KeyGenParameterSpec r0 = r6.mKeyGenParameterSpec
                    if (r0 == 0) goto L86
                    android.security.keystore.KeyGenParameterSpec r0 = r6.mKeyGenParameterSpec
                    java.lang.String r0 = androidx.security.crypto.MasterKeys.getOrCreate(r0)
                    androidx.security.crypto.MasterKey r1 = new androidx.security.crypto.MasterKey
                    android.security.keystore.KeyGenParameterSpec r2 = r6.mKeyGenParameterSpec
                    r1.<init>(r0, r2)
                    return r1
                L86:
                    java.lang.NullPointerException r0 = new java.lang.NullPointerException
                    java.lang.String r1 = "KeyGenParameterSpec was null after build() check"
                    r0.<init>(r1)
                    throw r0
            }

            static java.lang.String getKeystoreAlias(android.security.keystore.KeyGenParameterSpec r1) {
                    java.lang.String r0 = r1.getKeystoreAlias()
                    return r0
            }
        }

        public Builder(android.content.Context r2) {
                r1 = this;
                java.lang.String r0 = "_androidx_security_master_key_"
                r1.<init>(r2, r0)
                return
        }

        public Builder(android.content.Context r2, java.lang.String r3) {
                r1 = this;
                r1.<init>()
                android.content.Context r0 = r2.getApplicationContext()
                r1.mContext = r0
                r1.mKeyAlias = r3
                return
        }

        public androidx.security.crypto.MasterKey build() throws java.security.GeneralSecurityException, java.io.IOException {
                r1 = this;
                androidx.security.crypto.MasterKey r0 = androidx.security.crypto.MasterKey.Builder.Api23Impl.build(r1)
                return r0
        }

        public androidx.security.crypto.MasterKey.Builder setKeyGenParameterSpec(android.security.keystore.KeyGenParameterSpec r4) {
                r3 = this;
                androidx.security.crypto.MasterKey$KeyScheme r0 = r3.mKeyScheme
                if (r0 != 0) goto L3c
                java.lang.String r0 = r3.mKeyAlias
                java.lang.String r1 = androidx.security.crypto.MasterKey.Builder.Api23Impl.getKeystoreAlias(r4)
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L13
                r3.mKeyGenParameterSpec = r4
                return r3
            L13:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "KeyGenParamSpec's key alias does not match provided alias ("
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.String r2 = r3.mKeyAlias
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.String r2 = " vs "
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.String r2 = androidx.security.crypto.MasterKey.Builder.Api23Impl.getKeystoreAlias(r4)
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L3c:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "KeyGenParamSpec set after setting a KeyScheme"
                r0.<init>(r1)
                throw r0
        }

        public androidx.security.crypto.MasterKey.Builder setKeyScheme(androidx.security.crypto.MasterKey.KeyScheme r4) {
                r3 = this;
                int[] r0 = androidx.security.crypto.MasterKey.AnonymousClass1.$SwitchMap$androidx$security$crypto$MasterKey$KeyScheme
                int r1 = r4.ordinal()
                r0 = r0[r1]
                switch(r0) {
                    case 1: goto L24;
                    default: goto Lb;
                }
            Lb:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Unsupported scheme: "
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.StringBuilder r1 = r1.append(r4)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L24:
                android.security.keystore.KeyGenParameterSpec r0 = r3.mKeyGenParameterSpec
                if (r0 != 0) goto L2c
                r3.mKeyScheme = r4
                return r3
            L2c:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "KeyScheme set after setting a KeyGenParamSpec"
                r0.<init>(r1)
                throw r0
        }

        public androidx.security.crypto.MasterKey.Builder setRequestStrongBoxBacked(boolean r1) {
                r0 = this;
                r0.mRequestStrongBoxBacked = r1
                return r0
        }

        public androidx.security.crypto.MasterKey.Builder setUserAuthenticationRequired(boolean r2) {
                r1 = this;
                int r0 = androidx.security.crypto.MasterKey.getDefaultAuthenticationValidityDurationSeconds()
                androidx.security.crypto.MasterKey$Builder r0 = r1.setUserAuthenticationRequired(r2, r0)
                return r0
        }

        public androidx.security.crypto.MasterKey.Builder setUserAuthenticationRequired(boolean r1, int r2) {
                r0 = this;
                r0.mAuthenticationRequired = r1
                r0.mUserAuthenticationValidityDurationSeconds = r2
                return r0
        }
    }

    public enum KeyScheme extends java.lang.Enum<androidx.security.crypto.MasterKey.KeyScheme> {
        private static final /* synthetic */ androidx.security.crypto.MasterKey.KeyScheme[] $VALUES = null;
        public static final androidx.security.crypto.MasterKey.KeyScheme AES256_GCM = null;

        private static /* synthetic */ androidx.security.crypto.MasterKey.KeyScheme[] $values() {
                androidx.security.crypto.MasterKey$KeyScheme r0 = androidx.security.crypto.MasterKey.KeyScheme.AES256_GCM
                androidx.security.crypto.MasterKey$KeyScheme[] r0 = new androidx.security.crypto.MasterKey.KeyScheme[]{r0}
                return r0
        }

        static {
                androidx.security.crypto.MasterKey$KeyScheme r0 = new androidx.security.crypto.MasterKey$KeyScheme
                java.lang.String r1 = "AES256_GCM"
                r2 = 0
                r0.<init>(r1, r2)
                androidx.security.crypto.MasterKey.KeyScheme.AES256_GCM = r0
                androidx.security.crypto.MasterKey$KeyScheme[] r0 = $values()
                androidx.security.crypto.MasterKey.KeyScheme.$VALUES = r0
                return
        }

        KeyScheme(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static androidx.security.crypto.MasterKey.KeyScheme valueOf(java.lang.String r1) {
                java.lang.Class<androidx.security.crypto.MasterKey$KeyScheme> r0 = androidx.security.crypto.MasterKey.KeyScheme.class
                java.lang.Enum r0 = java.lang.Enum.valueOf(r0, r1)
                androidx.security.crypto.MasterKey$KeyScheme r0 = (androidx.security.crypto.MasterKey.KeyScheme) r0
                return r0
        }

        public static androidx.security.crypto.MasterKey.KeyScheme[] values() {
                androidx.security.crypto.MasterKey$KeyScheme[] r0 = androidx.security.crypto.MasterKey.KeyScheme.$VALUES
                java.lang.Object r0 = r0.clone()
                androidx.security.crypto.MasterKey$KeyScheme[] r0 = (androidx.security.crypto.MasterKey.KeyScheme[]) r0
                return r0
        }
    }

    MasterKey(java.lang.String r2, java.lang.Object r3) {
            r1 = this;
            r1.<init>()
            r1.mKeyAlias = r2
            r0 = r3
            android.security.keystore.KeyGenParameterSpec r0 = (android.security.keystore.KeyGenParameterSpec) r0
            r1.mKeyGenParameterSpec = r0
            return
    }

    public static int getDefaultAuthenticationValidityDurationSeconds() {
            r0 = 300(0x12c, float:4.2E-43)
            return r0
    }

    java.lang.String getKeyAlias() {
            r1 = this;
            java.lang.String r0 = r1.mKeyAlias
            return r0
    }

    public int getUserAuthenticationValidityDurationSeconds() {
            r1 = this;
            android.security.keystore.KeyGenParameterSpec r0 = r1.mKeyGenParameterSpec
            if (r0 != 0) goto L7
            r0 = 0
            goto Ld
        L7:
            android.security.keystore.KeyGenParameterSpec r0 = r1.mKeyGenParameterSpec
            int r0 = androidx.security.crypto.MasterKey.Api23Impl.getUserAuthenticationValidityDurationSeconds(r0)
        Ld:
            return r0
    }

    public boolean isKeyStoreBacked() {
            r2 = this;
            java.lang.String r0 = "AndroidKeyStore"
            java.security.KeyStore r0 = java.security.KeyStore.getInstance(r0)     // Catch: java.io.IOException -> L12 java.security.NoSuchAlgorithmException -> L14 java.security.cert.CertificateException -> L16 java.security.KeyStoreException -> L18
            r1 = 0
            r0.load(r1)     // Catch: java.io.IOException -> L12 java.security.NoSuchAlgorithmException -> L14 java.security.cert.CertificateException -> L16 java.security.KeyStoreException -> L18
            java.lang.String r1 = r2.mKeyAlias     // Catch: java.io.IOException -> L12 java.security.NoSuchAlgorithmException -> L14 java.security.cert.CertificateException -> L16 java.security.KeyStoreException -> L18
            boolean r1 = r0.containsAlias(r1)     // Catch: java.io.IOException -> L12 java.security.NoSuchAlgorithmException -> L14 java.security.cert.CertificateException -> L16 java.security.KeyStoreException -> L18
            return r1
        L12:
            r0 = move-exception
            goto L19
        L14:
            r0 = move-exception
            goto L19
        L16:
            r0 = move-exception
            goto L19
        L18:
            r0 = move-exception
        L19:
            r1 = 0
            return r1
    }

    public boolean isStrongBoxBacked() {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L12
            android.security.keystore.KeyGenParameterSpec r0 = r2.mKeyGenParameterSpec
            if (r0 != 0) goto Lb
            goto L12
        Lb:
            android.security.keystore.KeyGenParameterSpec r0 = r2.mKeyGenParameterSpec
            boolean r0 = androidx.security.crypto.MasterKey.Api28Impl.isStrongBoxBacked(r0)
            return r0
        L12:
            r0 = 0
            return r0
    }

    public boolean isUserAuthenticationRequired() {
            r1 = this;
            android.security.keystore.KeyGenParameterSpec r0 = r1.mKeyGenParameterSpec
            if (r0 == 0) goto Lf
            android.security.keystore.KeyGenParameterSpec r0 = r1.mKeyGenParameterSpec
            boolean r0 = androidx.security.crypto.MasterKey.Api23Impl.isUserAuthenticationRequired(r0)
            if (r0 == 0) goto Lf
            r0 = 1
            goto L10
        Lf:
            r0 = 0
        L10:
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "MasterKey{keyAlias="
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = r2.mKeyAlias
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", isKeyStoreBacked="
            java.lang.StringBuilder r0 = r0.append(r1)
            boolean r1 = r2.isKeyStoreBacked()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "}"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
