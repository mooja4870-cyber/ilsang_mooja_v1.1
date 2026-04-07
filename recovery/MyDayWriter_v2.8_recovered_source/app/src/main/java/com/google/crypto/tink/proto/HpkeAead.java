package com.google.crypto.tink.proto;

/* JADX INFO: loaded from: classes.dex */
public enum HpkeAead extends java.lang.Enum<com.google.crypto.tink.proto.HpkeAead> implements com.google.crypto.tink.shaded.protobuf.Internal.EnumLite {
    private static final /* synthetic */ com.google.crypto.tink.proto.HpkeAead[] $VALUES = null;
    public static final com.google.crypto.tink.proto.HpkeAead AEAD_UNKNOWN = null;
    public static final int AEAD_UNKNOWN_VALUE = 0;
    public static final com.google.crypto.tink.proto.HpkeAead AES_128_GCM = null;
    public static final int AES_128_GCM_VALUE = 1;
    public static final com.google.crypto.tink.proto.HpkeAead AES_256_GCM = null;
    public static final int AES_256_GCM_VALUE = 2;
    public static final com.google.crypto.tink.proto.HpkeAead CHACHA20_POLY1305 = null;
    public static final int CHACHA20_POLY1305_VALUE = 3;
    public static final com.google.crypto.tink.proto.HpkeAead UNRECOGNIZED = null;
    private static final com.google.crypto.tink.shaded.protobuf.Internal.EnumLiteMap<com.google.crypto.tink.proto.HpkeAead> internalValueMap = null;
    private final int value;


    private static final class HpkeAeadVerifier implements com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier {
        static final com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier INSTANCE = null;

        static {
                com.google.crypto.tink.proto.HpkeAead$HpkeAeadVerifier r0 = new com.google.crypto.tink.proto.HpkeAead$HpkeAeadVerifier
                r0.<init>()
                com.google.crypto.tink.proto.HpkeAead.HpkeAeadVerifier.INSTANCE = r0
                return
        }

        private HpkeAeadVerifier() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier
        public boolean isInRange(int r2) {
                r1 = this;
                com.google.crypto.tink.proto.HpkeAead r0 = com.google.crypto.tink.proto.HpkeAead.forNumber(r2)
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
            com.google.crypto.tink.proto.HpkeAead r0 = new com.google.crypto.tink.proto.HpkeAead
            java.lang.String r1 = "AEAD_UNKNOWN"
            r2 = 0
            r0.<init>(r1, r2, r2)
            com.google.crypto.tink.proto.HpkeAead.AEAD_UNKNOWN = r0
            com.google.crypto.tink.proto.HpkeAead r0 = new com.google.crypto.tink.proto.HpkeAead
            java.lang.String r1 = "AES_128_GCM"
            r2 = 1
            r0.<init>(r1, r2, r2)
            com.google.crypto.tink.proto.HpkeAead.AES_128_GCM = r0
            com.google.crypto.tink.proto.HpkeAead r0 = new com.google.crypto.tink.proto.HpkeAead
            java.lang.String r1 = "AES_256_GCM"
            r2 = 2
            r0.<init>(r1, r2, r2)
            com.google.crypto.tink.proto.HpkeAead.AES_256_GCM = r0
            com.google.crypto.tink.proto.HpkeAead r0 = new com.google.crypto.tink.proto.HpkeAead
            java.lang.String r1 = "CHACHA20_POLY1305"
            r2 = 3
            r0.<init>(r1, r2, r2)
            com.google.crypto.tink.proto.HpkeAead.CHACHA20_POLY1305 = r0
            com.google.crypto.tink.proto.HpkeAead r0 = new com.google.crypto.tink.proto.HpkeAead
            r1 = 4
            r2 = -1
            java.lang.String r3 = "UNRECOGNIZED"
            r0.<init>(r3, r1, r2)
            com.google.crypto.tink.proto.HpkeAead.UNRECOGNIZED = r0
            com.google.crypto.tink.proto.HpkeAead r0 = com.google.crypto.tink.proto.HpkeAead.AEAD_UNKNOWN
            com.google.crypto.tink.proto.HpkeAead r1 = com.google.crypto.tink.proto.HpkeAead.AES_128_GCM
            com.google.crypto.tink.proto.HpkeAead r2 = com.google.crypto.tink.proto.HpkeAead.AES_256_GCM
            com.google.crypto.tink.proto.HpkeAead r3 = com.google.crypto.tink.proto.HpkeAead.CHACHA20_POLY1305
            com.google.crypto.tink.proto.HpkeAead r4 = com.google.crypto.tink.proto.HpkeAead.UNRECOGNIZED
            com.google.crypto.tink.proto.HpkeAead[] r0 = new com.google.crypto.tink.proto.HpkeAead[]{r0, r1, r2, r3, r4}
            com.google.crypto.tink.proto.HpkeAead.$VALUES = r0
            com.google.crypto.tink.proto.HpkeAead$1 r0 = new com.google.crypto.tink.proto.HpkeAead$1
            r0.<init>()
            com.google.crypto.tink.proto.HpkeAead.internalValueMap = r0
            return
    }

    HpkeAead(java.lang.String r1, int r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.value = r3
            return
    }

    public static com.google.crypto.tink.proto.HpkeAead forNumber(int r1) {
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
            com.google.crypto.tink.proto.HpkeAead r0 = com.google.crypto.tink.proto.HpkeAead.CHACHA20_POLY1305
            return r0
        L8:
            com.google.crypto.tink.proto.HpkeAead r0 = com.google.crypto.tink.proto.HpkeAead.AES_256_GCM
            return r0
        Lb:
            com.google.crypto.tink.proto.HpkeAead r0 = com.google.crypto.tink.proto.HpkeAead.AES_128_GCM
            return r0
        Le:
            com.google.crypto.tink.proto.HpkeAead r0 = com.google.crypto.tink.proto.HpkeAead.AEAD_UNKNOWN
            return r0
    }

    public static com.google.crypto.tink.shaded.protobuf.Internal.EnumLiteMap<com.google.crypto.tink.proto.HpkeAead> internalGetValueMap() {
            com.google.crypto.tink.shaded.protobuf.Internal$EnumLiteMap<com.google.crypto.tink.proto.HpkeAead> r0 = com.google.crypto.tink.proto.HpkeAead.internalValueMap
            return r0
    }

    public static com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier internalGetVerifier() {
            com.google.crypto.tink.shaded.protobuf.Internal$EnumVerifier r0 = com.google.crypto.tink.proto.HpkeAead.HpkeAeadVerifier.INSTANCE
            return r0
    }

    @java.lang.Deprecated
    public static com.google.crypto.tink.proto.HpkeAead valueOf(int r1) {
            com.google.crypto.tink.proto.HpkeAead r0 = forNumber(r1)
            return r0
    }

    public static com.google.crypto.tink.proto.HpkeAead valueOf(java.lang.String r1) {
            java.lang.Class<com.google.crypto.tink.proto.HpkeAead> r0 = com.google.crypto.tink.proto.HpkeAead.class
            java.lang.Enum r0 = java.lang.Enum.valueOf(r0, r1)
            com.google.crypto.tink.proto.HpkeAead r0 = (com.google.crypto.tink.proto.HpkeAead) r0
            return r0
    }

    public static com.google.crypto.tink.proto.HpkeAead[] values() {
            com.google.crypto.tink.proto.HpkeAead[] r0 = com.google.crypto.tink.proto.HpkeAead.$VALUES
            java.lang.Object r0 = r0.clone()
            com.google.crypto.tink.proto.HpkeAead[] r0 = (com.google.crypto.tink.proto.HpkeAead[]) r0
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Internal.EnumLite
    public final int getNumber() {
            r2 = this;
            com.google.crypto.tink.proto.HpkeAead r0 = com.google.crypto.tink.proto.HpkeAead.UNRECOGNIZED
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
