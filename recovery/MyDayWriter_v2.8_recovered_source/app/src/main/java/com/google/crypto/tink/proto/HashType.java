package com.google.crypto.tink.proto;

/* JADX INFO: loaded from: classes.dex */
public enum HashType extends java.lang.Enum<com.google.crypto.tink.proto.HashType> implements com.google.crypto.tink.shaded.protobuf.Internal.EnumLite {
    private static final /* synthetic */ com.google.crypto.tink.proto.HashType[] $VALUES = null;
    public static final com.google.crypto.tink.proto.HashType SHA1 = null;
    public static final int SHA1_VALUE = 1;
    public static final com.google.crypto.tink.proto.HashType SHA224 = null;
    public static final int SHA224_VALUE = 5;
    public static final com.google.crypto.tink.proto.HashType SHA256 = null;
    public static final int SHA256_VALUE = 3;
    public static final com.google.crypto.tink.proto.HashType SHA384 = null;
    public static final int SHA384_VALUE = 2;
    public static final com.google.crypto.tink.proto.HashType SHA512 = null;
    public static final int SHA512_VALUE = 4;
    public static final com.google.crypto.tink.proto.HashType UNKNOWN_HASH = null;
    public static final int UNKNOWN_HASH_VALUE = 0;
    public static final com.google.crypto.tink.proto.HashType UNRECOGNIZED = null;
    private static final com.google.crypto.tink.shaded.protobuf.Internal.EnumLiteMap<com.google.crypto.tink.proto.HashType> internalValueMap = null;
    private final int value;


    private static final class HashTypeVerifier implements com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier {
        static final com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier INSTANCE = null;

        static {
                com.google.crypto.tink.proto.HashType$HashTypeVerifier r0 = new com.google.crypto.tink.proto.HashType$HashTypeVerifier
                r0.<init>()
                com.google.crypto.tink.proto.HashType.HashTypeVerifier.INSTANCE = r0
                return
        }

        private HashTypeVerifier() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier
        public boolean isInRange(int r2) {
                r1 = this;
                com.google.crypto.tink.proto.HashType r0 = com.google.crypto.tink.proto.HashType.forNumber(r2)
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
            com.google.crypto.tink.proto.HashType r0 = new com.google.crypto.tink.proto.HashType
            java.lang.String r1 = "UNKNOWN_HASH"
            r2 = 0
            r0.<init>(r1, r2, r2)
            com.google.crypto.tink.proto.HashType.UNKNOWN_HASH = r0
            com.google.crypto.tink.proto.HashType r0 = new com.google.crypto.tink.proto.HashType
            java.lang.String r1 = "SHA1"
            r2 = 1
            r0.<init>(r1, r2, r2)
            com.google.crypto.tink.proto.HashType.SHA1 = r0
            com.google.crypto.tink.proto.HashType r0 = new com.google.crypto.tink.proto.HashType
            java.lang.String r1 = "SHA384"
            r2 = 2
            r0.<init>(r1, r2, r2)
            com.google.crypto.tink.proto.HashType.SHA384 = r0
            com.google.crypto.tink.proto.HashType r0 = new com.google.crypto.tink.proto.HashType
            java.lang.String r1 = "SHA256"
            r2 = 3
            r0.<init>(r1, r2, r2)
            com.google.crypto.tink.proto.HashType.SHA256 = r0
            com.google.crypto.tink.proto.HashType r0 = new com.google.crypto.tink.proto.HashType
            java.lang.String r1 = "SHA512"
            r2 = 4
            r0.<init>(r1, r2, r2)
            com.google.crypto.tink.proto.HashType.SHA512 = r0
            com.google.crypto.tink.proto.HashType r0 = new com.google.crypto.tink.proto.HashType
            java.lang.String r1 = "SHA224"
            r2 = 5
            r0.<init>(r1, r2, r2)
            com.google.crypto.tink.proto.HashType.SHA224 = r0
            com.google.crypto.tink.proto.HashType r0 = new com.google.crypto.tink.proto.HashType
            r1 = 6
            r2 = -1
            java.lang.String r3 = "UNRECOGNIZED"
            r0.<init>(r3, r1, r2)
            com.google.crypto.tink.proto.HashType.UNRECOGNIZED = r0
            com.google.crypto.tink.proto.HashType r4 = com.google.crypto.tink.proto.HashType.UNKNOWN_HASH
            com.google.crypto.tink.proto.HashType r5 = com.google.crypto.tink.proto.HashType.SHA1
            com.google.crypto.tink.proto.HashType r6 = com.google.crypto.tink.proto.HashType.SHA384
            com.google.crypto.tink.proto.HashType r7 = com.google.crypto.tink.proto.HashType.SHA256
            com.google.crypto.tink.proto.HashType r8 = com.google.crypto.tink.proto.HashType.SHA512
            com.google.crypto.tink.proto.HashType r9 = com.google.crypto.tink.proto.HashType.SHA224
            com.google.crypto.tink.proto.HashType r10 = com.google.crypto.tink.proto.HashType.UNRECOGNIZED
            com.google.crypto.tink.proto.HashType[] r0 = new com.google.crypto.tink.proto.HashType[]{r4, r5, r6, r7, r8, r9, r10}
            com.google.crypto.tink.proto.HashType.$VALUES = r0
            com.google.crypto.tink.proto.HashType$1 r0 = new com.google.crypto.tink.proto.HashType$1
            r0.<init>()
            com.google.crypto.tink.proto.HashType.internalValueMap = r0
            return
    }

    HashType(java.lang.String r1, int r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.value = r3
            return
    }

    public static com.google.crypto.tink.proto.HashType forNumber(int r1) {
            switch(r1) {
                case 0: goto L14;
                case 1: goto L11;
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
            com.google.crypto.tink.proto.HashType r0 = com.google.crypto.tink.proto.HashType.SHA224
            return r0
        L8:
            com.google.crypto.tink.proto.HashType r0 = com.google.crypto.tink.proto.HashType.SHA512
            return r0
        Lb:
            com.google.crypto.tink.proto.HashType r0 = com.google.crypto.tink.proto.HashType.SHA256
            return r0
        Le:
            com.google.crypto.tink.proto.HashType r0 = com.google.crypto.tink.proto.HashType.SHA384
            return r0
        L11:
            com.google.crypto.tink.proto.HashType r0 = com.google.crypto.tink.proto.HashType.SHA1
            return r0
        L14:
            com.google.crypto.tink.proto.HashType r0 = com.google.crypto.tink.proto.HashType.UNKNOWN_HASH
            return r0
    }

    public static com.google.crypto.tink.shaded.protobuf.Internal.EnumLiteMap<com.google.crypto.tink.proto.HashType> internalGetValueMap() {
            com.google.crypto.tink.shaded.protobuf.Internal$EnumLiteMap<com.google.crypto.tink.proto.HashType> r0 = com.google.crypto.tink.proto.HashType.internalValueMap
            return r0
    }

    public static com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier internalGetVerifier() {
            com.google.crypto.tink.shaded.protobuf.Internal$EnumVerifier r0 = com.google.crypto.tink.proto.HashType.HashTypeVerifier.INSTANCE
            return r0
    }

    @java.lang.Deprecated
    public static com.google.crypto.tink.proto.HashType valueOf(int r1) {
            com.google.crypto.tink.proto.HashType r0 = forNumber(r1)
            return r0
    }

    public static com.google.crypto.tink.proto.HashType valueOf(java.lang.String r1) {
            java.lang.Class<com.google.crypto.tink.proto.HashType> r0 = com.google.crypto.tink.proto.HashType.class
            java.lang.Enum r0 = java.lang.Enum.valueOf(r0, r1)
            com.google.crypto.tink.proto.HashType r0 = (com.google.crypto.tink.proto.HashType) r0
            return r0
    }

    public static com.google.crypto.tink.proto.HashType[] values() {
            com.google.crypto.tink.proto.HashType[] r0 = com.google.crypto.tink.proto.HashType.$VALUES
            java.lang.Object r0 = r0.clone()
            com.google.crypto.tink.proto.HashType[] r0 = (com.google.crypto.tink.proto.HashType[]) r0
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Internal.EnumLite
    public final int getNumber() {
            r2 = this;
            com.google.crypto.tink.proto.HashType r0 = com.google.crypto.tink.proto.HashType.UNRECOGNIZED
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
