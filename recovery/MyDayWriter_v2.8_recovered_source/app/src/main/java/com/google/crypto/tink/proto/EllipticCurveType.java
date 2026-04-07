package com.google.crypto.tink.proto;

/* JADX INFO: loaded from: classes.dex */
public enum EllipticCurveType extends java.lang.Enum<com.google.crypto.tink.proto.EllipticCurveType> implements com.google.crypto.tink.shaded.protobuf.Internal.EnumLite {
    private static final /* synthetic */ com.google.crypto.tink.proto.EllipticCurveType[] $VALUES = null;
    public static final com.google.crypto.tink.proto.EllipticCurveType CURVE25519 = null;
    public static final int CURVE25519_VALUE = 5;
    public static final com.google.crypto.tink.proto.EllipticCurveType NIST_P256 = null;
    public static final int NIST_P256_VALUE = 2;
    public static final com.google.crypto.tink.proto.EllipticCurveType NIST_P384 = null;
    public static final int NIST_P384_VALUE = 3;
    public static final com.google.crypto.tink.proto.EllipticCurveType NIST_P521 = null;
    public static final int NIST_P521_VALUE = 4;
    public static final com.google.crypto.tink.proto.EllipticCurveType UNKNOWN_CURVE = null;
    public static final int UNKNOWN_CURVE_VALUE = 0;
    public static final com.google.crypto.tink.proto.EllipticCurveType UNRECOGNIZED = null;
    private static final com.google.crypto.tink.shaded.protobuf.Internal.EnumLiteMap<com.google.crypto.tink.proto.EllipticCurveType> internalValueMap = null;
    private final int value;


    private static final class EllipticCurveTypeVerifier implements com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier {
        static final com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier INSTANCE = null;

        static {
                com.google.crypto.tink.proto.EllipticCurveType$EllipticCurveTypeVerifier r0 = new com.google.crypto.tink.proto.EllipticCurveType$EllipticCurveTypeVerifier
                r0.<init>()
                com.google.crypto.tink.proto.EllipticCurveType.EllipticCurveTypeVerifier.INSTANCE = r0
                return
        }

        private EllipticCurveTypeVerifier() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier
        public boolean isInRange(int r2) {
                r1 = this;
                com.google.crypto.tink.proto.EllipticCurveType r0 = com.google.crypto.tink.proto.EllipticCurveType.forNumber(r2)
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
            com.google.crypto.tink.proto.EllipticCurveType r0 = new com.google.crypto.tink.proto.EllipticCurveType
            java.lang.String r1 = "UNKNOWN_CURVE"
            r2 = 0
            r0.<init>(r1, r2, r2)
            com.google.crypto.tink.proto.EllipticCurveType.UNKNOWN_CURVE = r0
            com.google.crypto.tink.proto.EllipticCurveType r0 = new com.google.crypto.tink.proto.EllipticCurveType
            java.lang.String r1 = "NIST_P256"
            r2 = 1
            r3 = 2
            r0.<init>(r1, r2, r3)
            com.google.crypto.tink.proto.EllipticCurveType.NIST_P256 = r0
            com.google.crypto.tink.proto.EllipticCurveType r0 = new com.google.crypto.tink.proto.EllipticCurveType
            java.lang.String r1 = "NIST_P384"
            r2 = 3
            r0.<init>(r1, r3, r2)
            com.google.crypto.tink.proto.EllipticCurveType.NIST_P384 = r0
            com.google.crypto.tink.proto.EllipticCurveType r0 = new com.google.crypto.tink.proto.EllipticCurveType
            java.lang.String r1 = "NIST_P521"
            r3 = 4
            r0.<init>(r1, r2, r3)
            com.google.crypto.tink.proto.EllipticCurveType.NIST_P521 = r0
            com.google.crypto.tink.proto.EllipticCurveType r0 = new com.google.crypto.tink.proto.EllipticCurveType
            java.lang.String r1 = "CURVE25519"
            r2 = 5
            r0.<init>(r1, r3, r2)
            com.google.crypto.tink.proto.EllipticCurveType.CURVE25519 = r0
            com.google.crypto.tink.proto.EllipticCurveType r0 = new com.google.crypto.tink.proto.EllipticCurveType
            java.lang.String r1 = "UNRECOGNIZED"
            r3 = -1
            r0.<init>(r1, r2, r3)
            com.google.crypto.tink.proto.EllipticCurveType.UNRECOGNIZED = r0
            com.google.crypto.tink.proto.EllipticCurveType r4 = com.google.crypto.tink.proto.EllipticCurveType.UNKNOWN_CURVE
            com.google.crypto.tink.proto.EllipticCurveType r5 = com.google.crypto.tink.proto.EllipticCurveType.NIST_P256
            com.google.crypto.tink.proto.EllipticCurveType r6 = com.google.crypto.tink.proto.EllipticCurveType.NIST_P384
            com.google.crypto.tink.proto.EllipticCurveType r7 = com.google.crypto.tink.proto.EllipticCurveType.NIST_P521
            com.google.crypto.tink.proto.EllipticCurveType r8 = com.google.crypto.tink.proto.EllipticCurveType.CURVE25519
            com.google.crypto.tink.proto.EllipticCurveType r9 = com.google.crypto.tink.proto.EllipticCurveType.UNRECOGNIZED
            com.google.crypto.tink.proto.EllipticCurveType[] r0 = new com.google.crypto.tink.proto.EllipticCurveType[]{r4, r5, r6, r7, r8, r9}
            com.google.crypto.tink.proto.EllipticCurveType.$VALUES = r0
            com.google.crypto.tink.proto.EllipticCurveType$1 r0 = new com.google.crypto.tink.proto.EllipticCurveType$1
            r0.<init>()
            com.google.crypto.tink.proto.EllipticCurveType.internalValueMap = r0
            return
    }

    EllipticCurveType(java.lang.String r1, int r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.value = r3
            return
    }

    public static com.google.crypto.tink.proto.EllipticCurveType forNumber(int r1) {
            switch(r1) {
                case 0: goto L11;
                case 1: goto L3;
                case 2: goto Le;
                case 3: goto Lb;
                case 4: goto L8;
                case 5: goto L5;
                default: goto L3;
            }
        L3:
            r0 = 0
            return r0
        L5:
            com.google.crypto.tink.proto.EllipticCurveType r0 = com.google.crypto.tink.proto.EllipticCurveType.CURVE25519
            return r0
        L8:
            com.google.crypto.tink.proto.EllipticCurveType r0 = com.google.crypto.tink.proto.EllipticCurveType.NIST_P521
            return r0
        Lb:
            com.google.crypto.tink.proto.EllipticCurveType r0 = com.google.crypto.tink.proto.EllipticCurveType.NIST_P384
            return r0
        Le:
            com.google.crypto.tink.proto.EllipticCurveType r0 = com.google.crypto.tink.proto.EllipticCurveType.NIST_P256
            return r0
        L11:
            com.google.crypto.tink.proto.EllipticCurveType r0 = com.google.crypto.tink.proto.EllipticCurveType.UNKNOWN_CURVE
            return r0
    }

    public static com.google.crypto.tink.shaded.protobuf.Internal.EnumLiteMap<com.google.crypto.tink.proto.EllipticCurveType> internalGetValueMap() {
            com.google.crypto.tink.shaded.protobuf.Internal$EnumLiteMap<com.google.crypto.tink.proto.EllipticCurveType> r0 = com.google.crypto.tink.proto.EllipticCurveType.internalValueMap
            return r0
    }

    public static com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier internalGetVerifier() {
            com.google.crypto.tink.shaded.protobuf.Internal$EnumVerifier r0 = com.google.crypto.tink.proto.EllipticCurveType.EllipticCurveTypeVerifier.INSTANCE
            return r0
    }

    @java.lang.Deprecated
    public static com.google.crypto.tink.proto.EllipticCurveType valueOf(int r1) {
            com.google.crypto.tink.proto.EllipticCurveType r0 = forNumber(r1)
            return r0
    }

    public static com.google.crypto.tink.proto.EllipticCurveType valueOf(java.lang.String r1) {
            java.lang.Class<com.google.crypto.tink.proto.EllipticCurveType> r0 = com.google.crypto.tink.proto.EllipticCurveType.class
            java.lang.Enum r0 = java.lang.Enum.valueOf(r0, r1)
            com.google.crypto.tink.proto.EllipticCurveType r0 = (com.google.crypto.tink.proto.EllipticCurveType) r0
            return r0
    }

    public static com.google.crypto.tink.proto.EllipticCurveType[] values() {
            com.google.crypto.tink.proto.EllipticCurveType[] r0 = com.google.crypto.tink.proto.EllipticCurveType.$VALUES
            java.lang.Object r0 = r0.clone()
            com.google.crypto.tink.proto.EllipticCurveType[] r0 = (com.google.crypto.tink.proto.EllipticCurveType[]) r0
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Internal.EnumLite
    public final int getNumber() {
            r2 = this;
            com.google.crypto.tink.proto.EllipticCurveType r0 = com.google.crypto.tink.proto.EllipticCurveType.UNRECOGNIZED
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
