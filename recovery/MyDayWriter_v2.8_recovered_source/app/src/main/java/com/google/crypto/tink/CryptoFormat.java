package com.google.crypto.tink;

/* JADX INFO: loaded from: classes.dex */
public final class CryptoFormat {
    public static final int LEGACY_PREFIX_SIZE = 5;
    public static final byte LEGACY_START_BYTE = 0;
    public static final int NON_RAW_PREFIX_SIZE = 5;
    public static final byte[] RAW_PREFIX = null;
    public static final int RAW_PREFIX_SIZE = 0;
    public static final int TINK_PREFIX_SIZE = 5;
    public static final byte TINK_START_BYTE = 1;

    /* JADX INFO: renamed from: com.google.crypto.tink.CryptoFormat$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$proto$OutputPrefixType = null;

        static {
                com.google.crypto.tink.proto.OutputPrefixType[] r0 = com.google.crypto.tink.proto.OutputPrefixType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.google.crypto.tink.CryptoFormat.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$OutputPrefixType = r0
                int[] r0 = com.google.crypto.tink.CryptoFormat.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$OutputPrefixType     // Catch: java.lang.NoSuchFieldError -> L15
                com.google.crypto.tink.proto.OutputPrefixType r1 = com.google.crypto.tink.proto.OutputPrefixType.LEGACY     // Catch: java.lang.NoSuchFieldError -> L15
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L15
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L15
                goto L16
            L15:
                r0 = move-exception
            L16:
                int[] r0 = com.google.crypto.tink.CryptoFormat.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$OutputPrefixType     // Catch: java.lang.NoSuchFieldError -> L22
                com.google.crypto.tink.proto.OutputPrefixType r1 = com.google.crypto.tink.proto.OutputPrefixType.CRUNCHY     // Catch: java.lang.NoSuchFieldError -> L22
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L22
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L22
                goto L23
            L22:
                r0 = move-exception
            L23:
                int[] r0 = com.google.crypto.tink.CryptoFormat.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$OutputPrefixType     // Catch: java.lang.NoSuchFieldError -> L2f
                com.google.crypto.tink.proto.OutputPrefixType r1 = com.google.crypto.tink.proto.OutputPrefixType.TINK     // Catch: java.lang.NoSuchFieldError -> L2f
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L2f
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L2f
                goto L30
            L2f:
                r0 = move-exception
            L30:
                int[] r0 = com.google.crypto.tink.CryptoFormat.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$OutputPrefixType     // Catch: java.lang.NoSuchFieldError -> L3c
                com.google.crypto.tink.proto.OutputPrefixType r1 = com.google.crypto.tink.proto.OutputPrefixType.RAW     // Catch: java.lang.NoSuchFieldError -> L3c
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3c
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3c
                goto L3d
            L3c:
                r0 = move-exception
            L3d:
                return
        }
    }

    static {
            r0 = 0
            byte[] r0 = new byte[r0]
            com.google.crypto.tink.CryptoFormat.RAW_PREFIX = r0
            return
    }

    private CryptoFormat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static byte[] getOutputPrefix(com.google.crypto.tink.proto.Keyset.Key r2) throws java.security.GeneralSecurityException {
            int[] r0 = com.google.crypto.tink.CryptoFormat.AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$OutputPrefixType
            com.google.crypto.tink.proto.OutputPrefixType r1 = r2.getOutputPrefixType()
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 5
            switch(r0) {
                case 1: goto L31;
                case 2: goto L31;
                case 3: goto L1b;
                case 4: goto L18;
                default: goto L10;
            }
        L10:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "unknown output prefix type"
            r0.<init>(r1)
            throw r0
        L18:
            byte[] r0 = com.google.crypto.tink.CryptoFormat.RAW_PREFIX
            return r0
        L1b:
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r1)
            r1 = 1
            java.nio.ByteBuffer r0 = r0.put(r1)
            int r1 = r2.getKeyId()
            java.nio.ByteBuffer r0 = r0.putInt(r1)
            byte[] r0 = r0.array()
            return r0
        L31:
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r1)
            r1 = 0
            java.nio.ByteBuffer r0 = r0.put(r1)
            int r1 = r2.getKeyId()
            java.nio.ByteBuffer r0 = r0.putInt(r1)
            byte[] r0 = r0.array()
            return r0
    }
}
