package com.google.crypto.tink.subtle;

/* JADX INFO: loaded from: classes.dex */
public final class Enums {

    public enum HashType extends java.lang.Enum<com.google.crypto.tink.subtle.Enums.HashType> {
        private static final /* synthetic */ com.google.crypto.tink.subtle.Enums.HashType[] $VALUES = null;
        public static final com.google.crypto.tink.subtle.Enums.HashType SHA1 = null;
        public static final com.google.crypto.tink.subtle.Enums.HashType SHA224 = null;
        public static final com.google.crypto.tink.subtle.Enums.HashType SHA256 = null;
        public static final com.google.crypto.tink.subtle.Enums.HashType SHA384 = null;
        public static final com.google.crypto.tink.subtle.Enums.HashType SHA512 = null;

        static {
                com.google.crypto.tink.subtle.Enums$HashType r0 = new com.google.crypto.tink.subtle.Enums$HashType
                java.lang.String r1 = "SHA1"
                r2 = 0
                r0.<init>(r1, r2)
                com.google.crypto.tink.subtle.Enums.HashType.SHA1 = r0
                com.google.crypto.tink.subtle.Enums$HashType r0 = new com.google.crypto.tink.subtle.Enums$HashType
                java.lang.String r1 = "SHA224"
                r2 = 1
                r0.<init>(r1, r2)
                com.google.crypto.tink.subtle.Enums.HashType.SHA224 = r0
                com.google.crypto.tink.subtle.Enums$HashType r0 = new com.google.crypto.tink.subtle.Enums$HashType
                java.lang.String r1 = "SHA256"
                r2 = 2
                r0.<init>(r1, r2)
                com.google.crypto.tink.subtle.Enums.HashType.SHA256 = r0
                com.google.crypto.tink.subtle.Enums$HashType r0 = new com.google.crypto.tink.subtle.Enums$HashType
                java.lang.String r1 = "SHA384"
                r2 = 3
                r0.<init>(r1, r2)
                com.google.crypto.tink.subtle.Enums.HashType.SHA384 = r0
                com.google.crypto.tink.subtle.Enums$HashType r0 = new com.google.crypto.tink.subtle.Enums$HashType
                java.lang.String r1 = "SHA512"
                r2 = 4
                r0.<init>(r1, r2)
                com.google.crypto.tink.subtle.Enums.HashType.SHA512 = r0
                com.google.crypto.tink.subtle.Enums$HashType r0 = com.google.crypto.tink.subtle.Enums.HashType.SHA1
                com.google.crypto.tink.subtle.Enums$HashType r1 = com.google.crypto.tink.subtle.Enums.HashType.SHA224
                com.google.crypto.tink.subtle.Enums$HashType r2 = com.google.crypto.tink.subtle.Enums.HashType.SHA256
                com.google.crypto.tink.subtle.Enums$HashType r3 = com.google.crypto.tink.subtle.Enums.HashType.SHA384
                com.google.crypto.tink.subtle.Enums$HashType r4 = com.google.crypto.tink.subtle.Enums.HashType.SHA512
                com.google.crypto.tink.subtle.Enums$HashType[] r0 = new com.google.crypto.tink.subtle.Enums.HashType[]{r0, r1, r2, r3, r4}
                com.google.crypto.tink.subtle.Enums.HashType.$VALUES = r0
                return
        }

        HashType(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.google.crypto.tink.subtle.Enums.HashType valueOf(java.lang.String r1) {
                java.lang.Class<com.google.crypto.tink.subtle.Enums$HashType> r0 = com.google.crypto.tink.subtle.Enums.HashType.class
                java.lang.Enum r0 = java.lang.Enum.valueOf(r0, r1)
                com.google.crypto.tink.subtle.Enums$HashType r0 = (com.google.crypto.tink.subtle.Enums.HashType) r0
                return r0
        }

        public static com.google.crypto.tink.subtle.Enums.HashType[] values() {
                com.google.crypto.tink.subtle.Enums$HashType[] r0 = com.google.crypto.tink.subtle.Enums.HashType.$VALUES
                java.lang.Object r0 = r0.clone()
                com.google.crypto.tink.subtle.Enums$HashType[] r0 = (com.google.crypto.tink.subtle.Enums.HashType[]) r0
                return r0
        }
    }

    private Enums() {
            r0 = this;
            r0.<init>()
            return
    }
}
