package com.google.crypto.tink.aead;

/* JADX INFO: loaded from: classes.dex */
public final class KmsEnvelopeAead implements com.google.crypto.tink.Aead {
    private static final byte[] EMPTY_AAD = null;
    private static final int LENGTH_ENCRYPTED_DEK = 4;
    private final com.google.crypto.tink.proto.KeyTemplate dekTemplate;
    private final com.google.crypto.tink.Aead remote;

    static {
            r0 = 0
            byte[] r0 = new byte[r0]
            com.google.crypto.tink.aead.KmsEnvelopeAead.EMPTY_AAD = r0
            return
    }

    public KmsEnvelopeAead(com.google.crypto.tink.proto.KeyTemplate r1, com.google.crypto.tink.Aead r2) {
            r0 = this;
            r0.<init>()
            r0.dekTemplate = r1
            r0.remote = r2
            return
    }

    private byte[] buildCiphertext(byte[] r3, byte[] r4) {
            r2 = this;
            int r0 = r3.length
            int r0 = r0 + 4
            int r1 = r4.length
            int r0 = r0 + r1
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
            int r1 = r3.length
            java.nio.ByteBuffer r0 = r0.putInt(r1)
            java.nio.ByteBuffer r0 = r0.put(r3)
            java.nio.ByteBuffer r0 = r0.put(r4)
            byte[] r0 = r0.array()
            return r0
    }

    @Override // com.google.crypto.tink.Aead
    public byte[] decrypt(byte[] r9, byte[] r10) throws java.security.GeneralSecurityException {
            r8 = this;
            java.lang.String r0 = "invalid ciphertext"
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.wrap(r9)     // Catch: java.lang.NegativeArraySizeException -> L45 java.nio.BufferUnderflowException -> L47 java.lang.IndexOutOfBoundsException -> L49
            int r2 = r1.getInt()     // Catch: java.lang.NegativeArraySizeException -> L45 java.nio.BufferUnderflowException -> L47 java.lang.IndexOutOfBoundsException -> L49
            if (r2 <= 0) goto L3f
            int r3 = r9.length     // Catch: java.lang.NegativeArraySizeException -> L45 java.nio.BufferUnderflowException -> L47 java.lang.IndexOutOfBoundsException -> L49
            int r3 = r3 + (-4)
            if (r2 > r3) goto L3f
            byte[] r3 = new byte[r2]     // Catch: java.lang.NegativeArraySizeException -> L45 java.nio.BufferUnderflowException -> L47 java.lang.IndexOutOfBoundsException -> L49
            r4 = 0
            r1.get(r3, r4, r2)     // Catch: java.lang.NegativeArraySizeException -> L45 java.nio.BufferUnderflowException -> L47 java.lang.IndexOutOfBoundsException -> L49
            int r5 = r1.remaining()     // Catch: java.lang.NegativeArraySizeException -> L45 java.nio.BufferUnderflowException -> L47 java.lang.IndexOutOfBoundsException -> L49
            byte[] r5 = new byte[r5]     // Catch: java.lang.NegativeArraySizeException -> L45 java.nio.BufferUnderflowException -> L47 java.lang.IndexOutOfBoundsException -> L49
            int r6 = r1.remaining()     // Catch: java.lang.NegativeArraySizeException -> L45 java.nio.BufferUnderflowException -> L47 java.lang.IndexOutOfBoundsException -> L49
            r1.get(r5, r4, r6)     // Catch: java.lang.NegativeArraySizeException -> L45 java.nio.BufferUnderflowException -> L47 java.lang.IndexOutOfBoundsException -> L49
            com.google.crypto.tink.Aead r4 = r8.remote     // Catch: java.lang.NegativeArraySizeException -> L45 java.nio.BufferUnderflowException -> L47 java.lang.IndexOutOfBoundsException -> L49
            byte[] r6 = com.google.crypto.tink.aead.KmsEnvelopeAead.EMPTY_AAD     // Catch: java.lang.NegativeArraySizeException -> L45 java.nio.BufferUnderflowException -> L47 java.lang.IndexOutOfBoundsException -> L49
            byte[] r4 = r4.decrypt(r3, r6)     // Catch: java.lang.NegativeArraySizeException -> L45 java.nio.BufferUnderflowException -> L47 java.lang.IndexOutOfBoundsException -> L49
            com.google.crypto.tink.proto.KeyTemplate r6 = r8.dekTemplate     // Catch: java.lang.NegativeArraySizeException -> L45 java.nio.BufferUnderflowException -> L47 java.lang.IndexOutOfBoundsException -> L49
            java.lang.String r6 = r6.getTypeUrl()     // Catch: java.lang.NegativeArraySizeException -> L45 java.nio.BufferUnderflowException -> L47 java.lang.IndexOutOfBoundsException -> L49
            java.lang.Class<com.google.crypto.tink.Aead> r7 = com.google.crypto.tink.Aead.class
            java.lang.Object r6 = com.google.crypto.tink.Registry.getPrimitive(r6, r4, r7)     // Catch: java.lang.NegativeArraySizeException -> L45 java.nio.BufferUnderflowException -> L47 java.lang.IndexOutOfBoundsException -> L49
            com.google.crypto.tink.Aead r6 = (com.google.crypto.tink.Aead) r6     // Catch: java.lang.NegativeArraySizeException -> L45 java.nio.BufferUnderflowException -> L47 java.lang.IndexOutOfBoundsException -> L49
            byte[] r0 = r6.decrypt(r5, r10)     // Catch: java.lang.NegativeArraySizeException -> L45 java.nio.BufferUnderflowException -> L47 java.lang.IndexOutOfBoundsException -> L49
            return r0
        L3f:
            java.security.GeneralSecurityException r3 = new java.security.GeneralSecurityException     // Catch: java.lang.NegativeArraySizeException -> L45 java.nio.BufferUnderflowException -> L47 java.lang.IndexOutOfBoundsException -> L49
            r3.<init>(r0)     // Catch: java.lang.NegativeArraySizeException -> L45 java.nio.BufferUnderflowException -> L47 java.lang.IndexOutOfBoundsException -> L49
            throw r3     // Catch: java.lang.NegativeArraySizeException -> L45 java.nio.BufferUnderflowException -> L47 java.lang.IndexOutOfBoundsException -> L49
        L45:
            r1 = move-exception
            goto L4a
        L47:
            r1 = move-exception
            goto L4a
        L49:
            r1 = move-exception
        L4a:
            java.security.GeneralSecurityException r2 = new java.security.GeneralSecurityException
            r2.<init>(r0, r1)
            throw r2
    }

    @Override // com.google.crypto.tink.Aead
    public byte[] encrypt(byte[] r6, byte[] r7) throws java.security.GeneralSecurityException {
            r5 = this;
            com.google.crypto.tink.proto.KeyTemplate r0 = r5.dekTemplate
            com.google.crypto.tink.shaded.protobuf.MessageLite r0 = com.google.crypto.tink.Registry.newKey(r0)
            byte[] r0 = r0.toByteArray()
            com.google.crypto.tink.Aead r1 = r5.remote
            byte[] r2 = com.google.crypto.tink.aead.KmsEnvelopeAead.EMPTY_AAD
            byte[] r1 = r1.encrypt(r0, r2)
            com.google.crypto.tink.proto.KeyTemplate r2 = r5.dekTemplate
            java.lang.String r2 = r2.getTypeUrl()
            java.lang.Class<com.google.crypto.tink.Aead> r3 = com.google.crypto.tink.Aead.class
            java.lang.Object r2 = com.google.crypto.tink.Registry.getPrimitive(r2, r0, r3)
            com.google.crypto.tink.Aead r2 = (com.google.crypto.tink.Aead) r2
            byte[] r3 = r2.encrypt(r6, r7)
            byte[] r4 = r5.buildCiphertext(r1, r3)
            return r4
    }
}
