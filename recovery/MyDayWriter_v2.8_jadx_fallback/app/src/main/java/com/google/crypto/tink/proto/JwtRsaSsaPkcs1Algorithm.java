package com.google.crypto.tink.proto;

/* JADX INFO: loaded from: classes.dex */
public enum JwtRsaSsaPkcs1Algorithm extends java.lang.Enum<com.google.crypto.tink.proto.JwtRsaSsaPkcs1Algorithm> implements com.google.crypto.tink.shaded.protobuf.Internal.EnumLite {
    private static final /* synthetic */ com.google.crypto.tink.proto.JwtRsaSsaPkcs1Algorithm[] $VALUES = null;
    public static final com.google.crypto.tink.proto.JwtRsaSsaPkcs1Algorithm RS256 = null;
    public static final int RS256_VALUE = 1;
    public static final com.google.crypto.tink.proto.JwtRsaSsaPkcs1Algorithm RS384 = null;
    public static final int RS384_VALUE = 2;
    public static final com.google.crypto.tink.proto.JwtRsaSsaPkcs1Algorithm RS512 = null;
    public static final int RS512_VALUE = 3;
    public static final com.google.crypto.tink.proto.JwtRsaSsaPkcs1Algorithm RS_UNKNOWN = null;
    public static final int RS_UNKNOWN_VALUE = 0;
    public static final com.google.crypto.tink.proto.JwtRsaSsaPkcs1Algorithm UNRECOGNIZED = null;
    private static final com.google.crypto.tink.shaded.protobuf.Internal.EnumLiteMap<com.google.crypto.tink.proto.JwtRsaSsaPkcs1Algorithm> internalValueMap = null;
    private final int value;


    private static final class JwtRsaSsaPkcs1AlgorithmVerifier implements com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier {
        static final com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier INSTANCE = null;

        static {
                com.google.crypto.tink.proto.JwtRsaSsaPkcs1Algorithm$JwtRsaSsaPkcs1AlgorithmVerifier r0 = new com.google.crypto.tink.proto.JwtRsaSsaPkcs1Algorithm$JwtRsaSsaPkcs1AlgorithmVerifier
                r0.<init>()
                com.google.crypto.tink.proto.JwtRsaSsaPkcs1Algorithm.JwtRsaSsaPkcs1AlgorithmVerifier.INSTANCE = r0
                return
        }

        private JwtRsaSsaPkcs1AlgorithmVerifier() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier
        public boolean isInRange(int r2) {
                r1 = this;
                com.google.crypto.tink.proto.JwtRsaSsaPkcs1Algorithm r0 = com.google.crypto.tink.proto.JwtRsaSsaPkcs1Algorithm.forNumber(r2)
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
            com.google.crypto.tink.proto.JwtRsaSsaPkcs1Algorithm r0 = new com.google.crypto.tink.proto.JwtRsaSsaPkcs1Algorithm
            java.lang.String r1 = "RS_UNKNOWN"
            r2 = 0
            r0.<init>(r1, r2, r2)
            com.google.crypto.tink.proto.JwtRsaSsaPkcs1Algorithm.RS_UNKNOWN = r0
            com.google.crypto.tink.proto.JwtRsaSsaPkcs1Algorithm r0 = new com.google.crypto.tink.proto.JwtRsaSsaPkcs1Algorithm
            java.lang.String r1 = "RS256"
            r2 = 1
            r0.<init>(r1, r2, r2)
            com.google.crypto.tink.proto.JwtRsaSsaPkcs1Algorithm.RS256 = r0
            com.google.crypto.tink.proto.JwtRsaSsaPkcs1Algorithm r0 = new com.google.crypto.tink.proto.JwtRsaSsaPkcs1Algorithm
            java.lang.String r1 = "RS384"
            r2 = 2
            r0.<init>(r1, r2, r2)
            com.google.crypto.tink.proto.JwtRsaSsaPkcs1Algorithm.RS384 = r0
            com.google.crypto.tink.proto.JwtRsaSsaPkcs1Algorithm r0 = new com.google.crypto.tink.proto.JwtRsaSsaPkcs1Algorithm
            java.lang.String r1 = "RS512"
            r2 = 3
            r0.<init>(r1, r2, r2)
            com.google.crypto.tink.proto.JwtRsaSsaPkcs1Algorithm.RS512 = r0
            com.google.crypto.tink.proto.JwtRsaSsaPkcs1Algorithm r0 = new com.google.crypto.tink.proto.JwtRsaSsaPkcs1Algorithm
            r1 = 4
            r2 = -1
            java.lang.String r3 = "UNRECOGNIZED"
            r0.<init>(r3, r1, r2)
            com.google.crypto.tink.proto.JwtRsaSsaPkcs1Algorithm.UNRECOGNIZED = r0
            com.google.crypto.tink.proto.JwtRsaSsaPkcs1Algorithm r0 = com.google.crypto.tink.proto.JwtRsaSsaPkcs1Algorithm.RS_UNKNOWN
            com.google.crypto.tink.proto.JwtRsaSsaPkcs1Algorithm r1 = com.google.crypto.tink.proto.JwtRsaSsaPkcs1Algorithm.RS256
            com.google.crypto.tink.proto.JwtRsaSsaPkcs1Algorithm r2 = com.google.crypto.tink.proto.JwtRsaSsaPkcs1Algorithm.RS384
            com.google.crypto.tink.proto.JwtRsaSsaPkcs1Algorithm r3 = com.google.crypto.tink.proto.JwtRsaSsaPkcs1Algorithm.RS512
            com.google.crypto.tink.proto.JwtRsaSsaPkcs1Algorithm r4 = com.google.crypto.tink.proto.JwtRsaSsaPkcs1Algorithm.UNRECOGNIZED
            com.google.crypto.tink.proto.JwtRsaSsaPkcs1Algorithm[] r0 = new com.google.crypto.tink.proto.JwtRsaSsaPkcs1Algorithm[]{r0, r1, r2, r3, r4}
            com.google.crypto.tink.proto.JwtRsaSsaPkcs1Algorithm.$VALUES = r0
            com.google.crypto.tink.proto.JwtRsaSsaPkcs1Algorithm$1 r0 = new com.google.crypto.tink.proto.JwtRsaSsaPkcs1Algorithm$1
            r0.<init>()
            com.google.crypto.tink.proto.JwtRsaSsaPkcs1Algorithm.internalValueMap = r0
            return
    }

    JwtRsaSsaPkcs1Algorithm(java.lang.String r1, int r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.value = r3
            return
    }

    public static com.google.crypto.tink.proto.JwtRsaSsaPkcs1Algorithm forNumber(int r1) {
            switch(r1) {
                case 0: goto Le;
                case 1: goto Lb;
                case 2: goto L8;
                case 3: goto L5;
                default: goto L3;
            }
        L3:
            r0 = 0
            return r0
        L5:
            com.google.crypto.tink.proto.JwtRsaSsaPkcs1Algorithm r0 = com.google.crypto.tink.proto.JwtRsaSsaPkcs1Algorithm.RS512
            return r0
        L8:
            com.google.crypto.tink.proto.JwtRsaSsaPkcs1Algorithm r0 = com.google.crypto.tink.proto.JwtRsaSsaPkcs1Algorithm.RS384
            return r0
        Lb:
            com.google.crypto.tink.proto.JwtRsaSsaPkcs1Algorithm r0 = com.google.crypto.tink.proto.JwtRsaSsaPkcs1Algorithm.RS256
            return r0
        Le:
            com.google.crypto.tink.proto.JwtRsaSsaPkcs1Algorithm r0 = com.google.crypto.tink.proto.JwtRsaSsaPkcs1Algorithm.RS_UNKNOWN
            return r0
    }

    public static com.google.crypto.tink.shaded.protobuf.Internal.EnumLiteMap<com.google.crypto.tink.proto.JwtRsaSsaPkcs1Algorithm> internalGetValueMap() {
            com.google.crypto.tink.shaded.protobuf.Internal$EnumLiteMap<com.google.crypto.tink.proto.JwtRsaSsaPkcs1Algorithm> r0 = com.google.crypto.tink.proto.JwtRsaSsaPkcs1Algorithm.internalValueMap
            return r0
    }

    public static com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier internalGetVerifier() {
            com.google.crypto.tink.shaded.protobuf.Internal$EnumVerifier r0 = com.google.crypto.tink.proto.JwtRsaSsaPkcs1Algorithm.JwtRsaSsaPkcs1AlgorithmVerifier.INSTANCE
            return r0
    }

    @java.lang.Deprecated
    public static com.google.crypto.tink.proto.JwtRsaSsaPkcs1Algorithm valueOf(int r1) {
            com.google.crypto.tink.proto.JwtRsaSsaPkcs1Algorithm r0 = forNumber(r1)
            return r0
    }

    public static com.google.crypto.tink.proto.JwtRsaSsaPkcs1Algorithm valueOf(java.lang.String r1) {
            java.lang.Class<com.google.crypto.tink.proto.JwtRsaSsaPkcs1Algorithm> r0 = com.google.crypto.tink.proto.JwtRsaSsaPkcs1Algorithm.class
            java.lang.Enum r0 = java.lang.Enum.valueOf(r0, r1)
            com.google.crypto.tink.proto.JwtRsaSsaPkcs1Algorithm r0 = (com.google.crypto.tink.proto.JwtRsaSsaPkcs1Algorithm) r0
            return r0
    }

    public static com.google.crypto.tink.proto.JwtRsaSsaPkcs1Algorithm[] values() {
            com.google.crypto.tink.proto.JwtRsaSsaPkcs1Algorithm[] r0 = com.google.crypto.tink.proto.JwtRsaSsaPkcs1Algorithm.$VALUES
            java.lang.Object r0 = r0.clone()
            com.google.crypto.tink.proto.JwtRsaSsaPkcs1Algorithm[] r0 = (com.google.crypto.tink.proto.JwtRsaSsaPkcs1Algorithm[]) r0
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Internal.EnumLite
    public final int getNumber() {
            r2 = this;
            com.google.crypto.tink.proto.JwtRsaSsaPkcs1Algorithm r0 = com.google.crypto.tink.proto.JwtRsaSsaPkcs1Algorithm.UNRECOGNIZED
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
