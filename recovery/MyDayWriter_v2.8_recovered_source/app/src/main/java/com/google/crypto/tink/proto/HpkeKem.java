package com.google.crypto.tink.proto;

/* JADX INFO: loaded from: classes.dex */
public enum HpkeKem extends java.lang.Enum<com.google.crypto.tink.proto.HpkeKem> implements com.google.crypto.tink.shaded.protobuf.Internal.EnumLite {
    private static final /* synthetic */ com.google.crypto.tink.proto.HpkeKem[] $VALUES = null;
    public static final com.google.crypto.tink.proto.HpkeKem DHKEM_P256_HKDF_SHA256 = null;
    public static final int DHKEM_P256_HKDF_SHA256_VALUE = 2;
    public static final com.google.crypto.tink.proto.HpkeKem DHKEM_P384_HKDF_SHA384 = null;
    public static final int DHKEM_P384_HKDF_SHA384_VALUE = 3;
    public static final com.google.crypto.tink.proto.HpkeKem DHKEM_P521_HKDF_SHA512 = null;
    public static final int DHKEM_P521_HKDF_SHA512_VALUE = 4;
    public static final com.google.crypto.tink.proto.HpkeKem DHKEM_X25519_HKDF_SHA256 = null;
    public static final int DHKEM_X25519_HKDF_SHA256_VALUE = 1;
    public static final com.google.crypto.tink.proto.HpkeKem KEM_UNKNOWN = null;
    public static final int KEM_UNKNOWN_VALUE = 0;
    public static final com.google.crypto.tink.proto.HpkeKem UNRECOGNIZED = null;
    private static final com.google.crypto.tink.shaded.protobuf.Internal.EnumLiteMap<com.google.crypto.tink.proto.HpkeKem> internalValueMap = null;
    private final int value;


    private static final class HpkeKemVerifier implements com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier {
        static final com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier INSTANCE = null;

        static {
                com.google.crypto.tink.proto.HpkeKem$HpkeKemVerifier r0 = new com.google.crypto.tink.proto.HpkeKem$HpkeKemVerifier
                r0.<init>()
                com.google.crypto.tink.proto.HpkeKem.HpkeKemVerifier.INSTANCE = r0
                return
        }

        private HpkeKemVerifier() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier
        public boolean isInRange(int r2) {
                r1 = this;
                com.google.crypto.tink.proto.HpkeKem r0 = com.google.crypto.tink.proto.HpkeKem.forNumber(r2)
                if (r0 == 0) goto L8
                r0 = 1
                goto L9
            L8:
                r0 = 0
            L9:
                return r0
        }
    }

    static {
            com.google.crypto.tink.proto.HpkeKem r0 = new com.google.crypto.tink.proto.HpkeKem
            java.lang.String r1 = "KEM_UNKNOWN"
            r2 = 0
            r0.<init>(r1, r2, r2)
            com.google.crypto.tink.proto.HpkeKem.KEM_UNKNOWN = r0
            com.google.crypto.tink.proto.HpkeKem r0 = new com.google.crypto.tink.proto.HpkeKem
            java.lang.String r1 = "DHKEM_X25519_HKDF_SHA256"
            r2 = 1
            r0.<init>(r1, r2, r2)
            com.google.crypto.tink.proto.HpkeKem.DHKEM_X25519_HKDF_SHA256 = r0
            com.google.crypto.tink.proto.HpkeKem r0 = new com.google.crypto.tink.proto.HpkeKem
            java.lang.String r1 = "DHKEM_P256_HKDF_SHA256"
            r2 = 2
            r0.<init>(r1, r2, r2)
            com.google.crypto.tink.proto.HpkeKem.DHKEM_P256_HKDF_SHA256 = r0
            com.google.crypto.tink.proto.HpkeKem r0 = new com.google.crypto.tink.proto.HpkeKem
            java.lang.String r1 = "DHKEM_P384_HKDF_SHA384"
            r2 = 3
            r0.<init>(r1, r2, r2)
            com.google.crypto.tink.proto.HpkeKem.DHKEM_P384_HKDF_SHA384 = r0
            com.google.crypto.tink.proto.HpkeKem r0 = new com.google.crypto.tink.proto.HpkeKem
            java.lang.String r1 = "DHKEM_P521_HKDF_SHA512"
            r2 = 4
            r0.<init>(r1, r2, r2)
            com.google.crypto.tink.proto.HpkeKem.DHKEM_P521_HKDF_SHA512 = r0
            com.google.crypto.tink.proto.HpkeKem r0 = new com.google.crypto.tink.proto.HpkeKem
            r1 = 5
            r2 = -1
            java.lang.String r3 = "UNRECOGNIZED"
            r0.<init>(r3, r1, r2)
            com.google.crypto.tink.proto.HpkeKem.UNRECOGNIZED = r0
            com.google.crypto.tink.proto.HpkeKem r4 = com.google.crypto.tink.proto.HpkeKem.KEM_UNKNOWN
            com.google.crypto.tink.proto.HpkeKem r5 = com.google.crypto.tink.proto.HpkeKem.DHKEM_X25519_HKDF_SHA256
            com.google.crypto.tink.proto.HpkeKem r6 = com.google.crypto.tink.proto.HpkeKem.DHKEM_P256_HKDF_SHA256
            com.google.crypto.tink.proto.HpkeKem r7 = com.google.crypto.tink.proto.HpkeKem.DHKEM_P384_HKDF_SHA384
            com.google.crypto.tink.proto.HpkeKem r8 = com.google.crypto.tink.proto.HpkeKem.DHKEM_P521_HKDF_SHA512
            com.google.crypto.tink.proto.HpkeKem r9 = com.google.crypto.tink.proto.HpkeKem.UNRECOGNIZED
            com.google.crypto.tink.proto.HpkeKem[] r0 = new com.google.crypto.tink.proto.HpkeKem[]{r4, r5, r6, r7, r8, r9}
            com.google.crypto.tink.proto.HpkeKem.$VALUES = r0
            com.google.crypto.tink.proto.HpkeKem$1 r0 = new com.google.crypto.tink.proto.HpkeKem$1
            r0.<init>()
            com.google.crypto.tink.proto.HpkeKem.internalValueMap = r0
            return
    }

    HpkeKem(java.lang.String r1, int r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.value = r3
            return
    }

    public static com.google.crypto.tink.proto.HpkeKem forNumber(int r1) {
            switch(r1) {
                case 0: goto L11;
                case 1: goto Le;
                case 2: goto Lb;
                case 3: goto L8;
                case 4: goto L5;
                default: goto L3;
            }
        L3:
            r0 = 0
            return r0
        L5:
            com.google.crypto.tink.proto.HpkeKem r0 = com.google.crypto.tink.proto.HpkeKem.DHKEM_P521_HKDF_SHA512
            return r0
        L8:
            com.google.crypto.tink.proto.HpkeKem r0 = com.google.crypto.tink.proto.HpkeKem.DHKEM_P384_HKDF_SHA384
            return r0
        Lb:
            com.google.crypto.tink.proto.HpkeKem r0 = com.google.crypto.tink.proto.HpkeKem.DHKEM_P256_HKDF_SHA256
            return r0
        Le:
            com.google.crypto.tink.proto.HpkeKem r0 = com.google.crypto.tink.proto.HpkeKem.DHKEM_X25519_HKDF_SHA256
            return r0
        L11:
            com.google.crypto.tink.proto.HpkeKem r0 = com.google.crypto.tink.proto.HpkeKem.KEM_UNKNOWN
            return r0
    }

    public static com.google.crypto.tink.shaded.protobuf.Internal.EnumLiteMap<com.google.crypto.tink.proto.HpkeKem> internalGetValueMap() {
            com.google.crypto.tink.shaded.protobuf.Internal$EnumLiteMap<com.google.crypto.tink.proto.HpkeKem> r0 = com.google.crypto.tink.proto.HpkeKem.internalValueMap
            return r0
    }

    public static com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier internalGetVerifier() {
            com.google.crypto.tink.shaded.protobuf.Internal$EnumVerifier r0 = com.google.crypto.tink.proto.HpkeKem.HpkeKemVerifier.INSTANCE
            return r0
    }

    @java.lang.Deprecated
    public static com.google.crypto.tink.proto.HpkeKem valueOf(int r1) {
            com.google.crypto.tink.proto.HpkeKem r0 = forNumber(r1)
            return r0
    }

    public static com.google.crypto.tink.proto.HpkeKem valueOf(java.lang.String r1) {
            java.lang.Class<com.google.crypto.tink.proto.HpkeKem> r0 = com.google.crypto.tink.proto.HpkeKem.class
            java.lang.Enum r0 = java.lang.Enum.valueOf(r0, r1)
            com.google.crypto.tink.proto.HpkeKem r0 = (com.google.crypto.tink.proto.HpkeKem) r0
            return r0
    }

    public static com.google.crypto.tink.proto.HpkeKem[] values() {
            com.google.crypto.tink.proto.HpkeKem[] r0 = com.google.crypto.tink.proto.HpkeKem.$VALUES
            java.lang.Object r0 = r0.clone()
            com.google.crypto.tink.proto.HpkeKem[] r0 = (com.google.crypto.tink.proto.HpkeKem[]) r0
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Internal.EnumLite
    public final int getNumber() {
            r2 = this;
            com.google.crypto.tink.proto.HpkeKem r0 = com.google.crypto.tink.proto.HpkeKem.UNRECOGNIZED
            if (r2 == r0) goto L7
            int r0 = r2.value
            return r0
        L7:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Can't get the number of an unknown enum value."
            r0.<init>(r1)
            throw r0
    }
}
