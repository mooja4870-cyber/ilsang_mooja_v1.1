package com.google.crypto.tink.proto;

/* JADX INFO: loaded from: classes.dex */
public enum EcdsaSignatureEncoding extends java.lang.Enum<com.google.crypto.tink.proto.EcdsaSignatureEncoding> implements com.google.crypto.tink.shaded.protobuf.Internal.EnumLite {
    private static final /* synthetic */ com.google.crypto.tink.proto.EcdsaSignatureEncoding[] $VALUES = null;
    public static final com.google.crypto.tink.proto.EcdsaSignatureEncoding DER = null;
    public static final int DER_VALUE = 2;
    public static final com.google.crypto.tink.proto.EcdsaSignatureEncoding IEEE_P1363 = null;
    public static final int IEEE_P1363_VALUE = 1;
    public static final com.google.crypto.tink.proto.EcdsaSignatureEncoding UNKNOWN_ENCODING = null;
    public static final int UNKNOWN_ENCODING_VALUE = 0;
    public static final com.google.crypto.tink.proto.EcdsaSignatureEncoding UNRECOGNIZED = null;
    private static final com.google.crypto.tink.shaded.protobuf.Internal.EnumLiteMap<com.google.crypto.tink.proto.EcdsaSignatureEncoding> internalValueMap = null;
    private final int value;


    private static final class EcdsaSignatureEncodingVerifier implements com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier {
        static final com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier INSTANCE = null;

        static {
                com.google.crypto.tink.proto.EcdsaSignatureEncoding$EcdsaSignatureEncodingVerifier r0 = new com.google.crypto.tink.proto.EcdsaSignatureEncoding$EcdsaSignatureEncodingVerifier
                r0.<init>()
                com.google.crypto.tink.proto.EcdsaSignatureEncoding.EcdsaSignatureEncodingVerifier.INSTANCE = r0
                return
        }

        private EcdsaSignatureEncodingVerifier() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier
        public boolean isInRange(int r2) {
                r1 = this;
                com.google.crypto.tink.proto.EcdsaSignatureEncoding r0 = com.google.crypto.tink.proto.EcdsaSignatureEncoding.forNumber(r2)
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
            com.google.crypto.tink.proto.EcdsaSignatureEncoding r0 = new com.google.crypto.tink.proto.EcdsaSignatureEncoding
            java.lang.String r1 = "UNKNOWN_ENCODING"
            r2 = 0
            r0.<init>(r1, r2, r2)
            com.google.crypto.tink.proto.EcdsaSignatureEncoding.UNKNOWN_ENCODING = r0
            com.google.crypto.tink.proto.EcdsaSignatureEncoding r0 = new com.google.crypto.tink.proto.EcdsaSignatureEncoding
            java.lang.String r1 = "IEEE_P1363"
            r2 = 1
            r0.<init>(r1, r2, r2)
            com.google.crypto.tink.proto.EcdsaSignatureEncoding.IEEE_P1363 = r0
            com.google.crypto.tink.proto.EcdsaSignatureEncoding r0 = new com.google.crypto.tink.proto.EcdsaSignatureEncoding
            java.lang.String r1 = "DER"
            r2 = 2
            r0.<init>(r1, r2, r2)
            com.google.crypto.tink.proto.EcdsaSignatureEncoding.DER = r0
            com.google.crypto.tink.proto.EcdsaSignatureEncoding r0 = new com.google.crypto.tink.proto.EcdsaSignatureEncoding
            r1 = 3
            r2 = -1
            java.lang.String r3 = "UNRECOGNIZED"
            r0.<init>(r3, r1, r2)
            com.google.crypto.tink.proto.EcdsaSignatureEncoding.UNRECOGNIZED = r0
            com.google.crypto.tink.proto.EcdsaSignatureEncoding r0 = com.google.crypto.tink.proto.EcdsaSignatureEncoding.UNKNOWN_ENCODING
            com.google.crypto.tink.proto.EcdsaSignatureEncoding r1 = com.google.crypto.tink.proto.EcdsaSignatureEncoding.IEEE_P1363
            com.google.crypto.tink.proto.EcdsaSignatureEncoding r2 = com.google.crypto.tink.proto.EcdsaSignatureEncoding.DER
            com.google.crypto.tink.proto.EcdsaSignatureEncoding r3 = com.google.crypto.tink.proto.EcdsaSignatureEncoding.UNRECOGNIZED
            com.google.crypto.tink.proto.EcdsaSignatureEncoding[] r0 = new com.google.crypto.tink.proto.EcdsaSignatureEncoding[]{r0, r1, r2, r3}
            com.google.crypto.tink.proto.EcdsaSignatureEncoding.$VALUES = r0
            com.google.crypto.tink.proto.EcdsaSignatureEncoding$1 r0 = new com.google.crypto.tink.proto.EcdsaSignatureEncoding$1
            r0.<init>()
            com.google.crypto.tink.proto.EcdsaSignatureEncoding.internalValueMap = r0
            return
    }

    EcdsaSignatureEncoding(java.lang.String r1, int r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.value = r3
            return
    }

    public static com.google.crypto.tink.proto.EcdsaSignatureEncoding forNumber(int r1) {
            switch(r1) {
                case 0: goto Lb;
                case 1: goto L8;
                case 2: goto L5;
                default: goto L3;
            }
        L3:
            r0 = 0
            return r0
        L5:
            com.google.crypto.tink.proto.EcdsaSignatureEncoding r0 = com.google.crypto.tink.proto.EcdsaSignatureEncoding.DER
            return r0
        L8:
            com.google.crypto.tink.proto.EcdsaSignatureEncoding r0 = com.google.crypto.tink.proto.EcdsaSignatureEncoding.IEEE_P1363
            return r0
        Lb:
            com.google.crypto.tink.proto.EcdsaSignatureEncoding r0 = com.google.crypto.tink.proto.EcdsaSignatureEncoding.UNKNOWN_ENCODING
            return r0
    }

    public static com.google.crypto.tink.shaded.protobuf.Internal.EnumLiteMap<com.google.crypto.tink.proto.EcdsaSignatureEncoding> internalGetValueMap() {
            com.google.crypto.tink.shaded.protobuf.Internal$EnumLiteMap<com.google.crypto.tink.proto.EcdsaSignatureEncoding> r0 = com.google.crypto.tink.proto.EcdsaSignatureEncoding.internalValueMap
            return r0
    }

    public static com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier internalGetVerifier() {
            com.google.crypto.tink.shaded.protobuf.Internal$EnumVerifier r0 = com.google.crypto.tink.proto.EcdsaSignatureEncoding.EcdsaSignatureEncodingVerifier.INSTANCE
            return r0
    }

    @java.lang.Deprecated
    public static com.google.crypto.tink.proto.EcdsaSignatureEncoding valueOf(int r1) {
            com.google.crypto.tink.proto.EcdsaSignatureEncoding r0 = forNumber(r1)
            return r0
    }

    public static com.google.crypto.tink.proto.EcdsaSignatureEncoding valueOf(java.lang.String r1) {
            java.lang.Class<com.google.crypto.tink.proto.EcdsaSignatureEncoding> r0 = com.google.crypto.tink.proto.EcdsaSignatureEncoding.class
            java.lang.Enum r0 = java.lang.Enum.valueOf(r0, r1)
            com.google.crypto.tink.proto.EcdsaSignatureEncoding r0 = (com.google.crypto.tink.proto.EcdsaSignatureEncoding) r0
            return r0
    }

    public static com.google.crypto.tink.proto.EcdsaSignatureEncoding[] values() {
            com.google.crypto.tink.proto.EcdsaSignatureEncoding[] r0 = com.google.crypto.tink.proto.EcdsaSignatureEncoding.$VALUES
            java.lang.Object r0 = r0.clone()
            com.google.crypto.tink.proto.EcdsaSignatureEncoding[] r0 = (com.google.crypto.tink.proto.EcdsaSignatureEncoding[]) r0
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Internal.EnumLite
    public final int getNumber() {
            r2 = this;
            com.google.crypto.tink.proto.EcdsaSignatureEncoding r0 = com.google.crypto.tink.proto.EcdsaSignatureEncoding.UNRECOGNIZED
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
