package com.google.crypto.tink.proto;

/* JADX INFO: loaded from: classes.dex */
public enum EcPointFormat extends java.lang.Enum<com.google.crypto.tink.proto.EcPointFormat> implements com.google.crypto.tink.shaded.protobuf.Internal.EnumLite {
    private static final /* synthetic */ com.google.crypto.tink.proto.EcPointFormat[] $VALUES = null;
    public static final com.google.crypto.tink.proto.EcPointFormat COMPRESSED = null;
    public static final int COMPRESSED_VALUE = 2;
    public static final com.google.crypto.tink.proto.EcPointFormat DO_NOT_USE_CRUNCHY_UNCOMPRESSED = null;
    public static final int DO_NOT_USE_CRUNCHY_UNCOMPRESSED_VALUE = 3;
    public static final com.google.crypto.tink.proto.EcPointFormat UNCOMPRESSED = null;
    public static final int UNCOMPRESSED_VALUE = 1;
    public static final com.google.crypto.tink.proto.EcPointFormat UNKNOWN_FORMAT = null;
    public static final int UNKNOWN_FORMAT_VALUE = 0;
    public static final com.google.crypto.tink.proto.EcPointFormat UNRECOGNIZED = null;
    private static final com.google.crypto.tink.shaded.protobuf.Internal.EnumLiteMap<com.google.crypto.tink.proto.EcPointFormat> internalValueMap = null;
    private final int value;


    private static final class EcPointFormatVerifier implements com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier {
        static final com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier INSTANCE = null;

        static {
                com.google.crypto.tink.proto.EcPointFormat$EcPointFormatVerifier r0 = new com.google.crypto.tink.proto.EcPointFormat$EcPointFormatVerifier
                r0.<init>()
                com.google.crypto.tink.proto.EcPointFormat.EcPointFormatVerifier.INSTANCE = r0
                return
        }

        private EcPointFormatVerifier() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier
        public boolean isInRange(int r2) {
                r1 = this;
                com.google.crypto.tink.proto.EcPointFormat r0 = com.google.crypto.tink.proto.EcPointFormat.forNumber(r2)
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
            com.google.crypto.tink.proto.EcPointFormat r0 = new com.google.crypto.tink.proto.EcPointFormat
            java.lang.String r1 = "UNKNOWN_FORMAT"
            r2 = 0
            r0.<init>(r1, r2, r2)
            com.google.crypto.tink.proto.EcPointFormat.UNKNOWN_FORMAT = r0
            com.google.crypto.tink.proto.EcPointFormat r0 = new com.google.crypto.tink.proto.EcPointFormat
            java.lang.String r1 = "UNCOMPRESSED"
            r2 = 1
            r0.<init>(r1, r2, r2)
            com.google.crypto.tink.proto.EcPointFormat.UNCOMPRESSED = r0
            com.google.crypto.tink.proto.EcPointFormat r0 = new com.google.crypto.tink.proto.EcPointFormat
            java.lang.String r1 = "COMPRESSED"
            r2 = 2
            r0.<init>(r1, r2, r2)
            com.google.crypto.tink.proto.EcPointFormat.COMPRESSED = r0
            com.google.crypto.tink.proto.EcPointFormat r0 = new com.google.crypto.tink.proto.EcPointFormat
            java.lang.String r1 = "DO_NOT_USE_CRUNCHY_UNCOMPRESSED"
            r2 = 3
            r0.<init>(r1, r2, r2)
            com.google.crypto.tink.proto.EcPointFormat.DO_NOT_USE_CRUNCHY_UNCOMPRESSED = r0
            com.google.crypto.tink.proto.EcPointFormat r0 = new com.google.crypto.tink.proto.EcPointFormat
            r1 = 4
            r2 = -1
            java.lang.String r3 = "UNRECOGNIZED"
            r0.<init>(r3, r1, r2)
            com.google.crypto.tink.proto.EcPointFormat.UNRECOGNIZED = r0
            com.google.crypto.tink.proto.EcPointFormat r0 = com.google.crypto.tink.proto.EcPointFormat.UNKNOWN_FORMAT
            com.google.crypto.tink.proto.EcPointFormat r1 = com.google.crypto.tink.proto.EcPointFormat.UNCOMPRESSED
            com.google.crypto.tink.proto.EcPointFormat r2 = com.google.crypto.tink.proto.EcPointFormat.COMPRESSED
            com.google.crypto.tink.proto.EcPointFormat r3 = com.google.crypto.tink.proto.EcPointFormat.DO_NOT_USE_CRUNCHY_UNCOMPRESSED
            com.google.crypto.tink.proto.EcPointFormat r4 = com.google.crypto.tink.proto.EcPointFormat.UNRECOGNIZED
            com.google.crypto.tink.proto.EcPointFormat[] r0 = new com.google.crypto.tink.proto.EcPointFormat[]{r0, r1, r2, r3, r4}
            com.google.crypto.tink.proto.EcPointFormat.$VALUES = r0
            com.google.crypto.tink.proto.EcPointFormat$1 r0 = new com.google.crypto.tink.proto.EcPointFormat$1
            r0.<init>()
            com.google.crypto.tink.proto.EcPointFormat.internalValueMap = r0
            return
    }

    EcPointFormat(java.lang.String r1, int r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.value = r3
            return
    }

    public static com.google.crypto.tink.proto.EcPointFormat forNumber(int r1) {
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
            com.google.crypto.tink.proto.EcPointFormat r0 = com.google.crypto.tink.proto.EcPointFormat.DO_NOT_USE_CRUNCHY_UNCOMPRESSED
            return r0
        L8:
            com.google.crypto.tink.proto.EcPointFormat r0 = com.google.crypto.tink.proto.EcPointFormat.COMPRESSED
            return r0
        Lb:
            com.google.crypto.tink.proto.EcPointFormat r0 = com.google.crypto.tink.proto.EcPointFormat.UNCOMPRESSED
            return r0
        Le:
            com.google.crypto.tink.proto.EcPointFormat r0 = com.google.crypto.tink.proto.EcPointFormat.UNKNOWN_FORMAT
            return r0
    }

    public static com.google.crypto.tink.shaded.protobuf.Internal.EnumLiteMap<com.google.crypto.tink.proto.EcPointFormat> internalGetValueMap() {
            com.google.crypto.tink.shaded.protobuf.Internal$EnumLiteMap<com.google.crypto.tink.proto.EcPointFormat> r0 = com.google.crypto.tink.proto.EcPointFormat.internalValueMap
            return r0
    }

    public static com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier internalGetVerifier() {
            com.google.crypto.tink.shaded.protobuf.Internal$EnumVerifier r0 = com.google.crypto.tink.proto.EcPointFormat.EcPointFormatVerifier.INSTANCE
            return r0
    }

    @java.lang.Deprecated
    public static com.google.crypto.tink.proto.EcPointFormat valueOf(int r1) {
            com.google.crypto.tink.proto.EcPointFormat r0 = forNumber(r1)
            return r0
    }

    public static com.google.crypto.tink.proto.EcPointFormat valueOf(java.lang.String r1) {
            java.lang.Class<com.google.crypto.tink.proto.EcPointFormat> r0 = com.google.crypto.tink.proto.EcPointFormat.class
            java.lang.Enum r0 = java.lang.Enum.valueOf(r0, r1)
            com.google.crypto.tink.proto.EcPointFormat r0 = (com.google.crypto.tink.proto.EcPointFormat) r0
            return r0
    }

    public static com.google.crypto.tink.proto.EcPointFormat[] values() {
            com.google.crypto.tink.proto.EcPointFormat[] r0 = com.google.crypto.tink.proto.EcPointFormat.$VALUES
            java.lang.Object r0 = r0.clone()
            com.google.crypto.tink.proto.EcPointFormat[] r0 = (com.google.crypto.tink.proto.EcPointFormat[]) r0
            return r0
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Internal.EnumLite
    public final int getNumber() {
            r2 = this;
            com.google.crypto.tink.proto.EcPointFormat r0 = com.google.crypto.tink.proto.EcPointFormat.UNRECOGNIZED
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
