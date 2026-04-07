package com.google.crypto.tink.subtle;

/* JADX INFO: loaded from: classes.dex */
public final class AesCtrHmacStreaming extends com.google.crypto.tink.subtle.NonceBasedStreamingAead {
    public static final com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility FIPS = null;
    private static final int HMAC_KEY_SIZE_IN_BYTES = 32;
    private static final int NONCE_PREFIX_IN_BYTES = 7;
    private static final int NONCE_SIZE_IN_BYTES = 16;
    private final int ciphertextSegmentSize;
    private final int firstSegmentOffset;
    private final java.lang.String hkdfAlgo;
    private final byte[] ikm;
    private final int keySizeInBytes;
    private final int plaintextSegmentSize;
    private final java.lang.String tagAlgo;
    private final int tagSizeInBytes;

    class AesCtrHmacStreamDecrypter implements com.google.crypto.tink.subtle.StreamSegmentDecrypter {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private javax.crypto.Cipher cipher;
        private javax.crypto.spec.SecretKeySpec hmacKeySpec;
        private javax.crypto.spec.SecretKeySpec keySpec;
        private javax.crypto.Mac mac;
        private byte[] noncePrefix;
        final /* synthetic */ com.google.crypto.tink.subtle.AesCtrHmacStreaming this$0;

        static {
                java.lang.Class<com.google.crypto.tink.subtle.AesCtrHmacStreaming> r0 = com.google.crypto.tink.subtle.AesCtrHmacStreaming.class
                return
        }

        AesCtrHmacStreamDecrypter(com.google.crypto.tink.subtle.AesCtrHmacStreaming r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // com.google.crypto.tink.subtle.StreamSegmentDecrypter
        public synchronized void decryptSegment(java.nio.ByteBuffer r18, int r19, boolean r20, java.nio.ByteBuffer r21) throws java.security.GeneralSecurityException {
                r17 = this;
                r1 = r17
                r0 = r18
                monitor-enter(r17)
                int r2 = r0.position()     // Catch: java.lang.Throwable -> Ldf
                com.google.crypto.tink.subtle.AesCtrHmacStreaming r3 = r1.this$0     // Catch: java.lang.Throwable -> Ldf
                byte[] r4 = r1.noncePrefix     // Catch: java.lang.Throwable -> Ldf
                r5 = r19
                long r6 = (long) r5     // Catch: java.lang.Throwable -> Ldf
                r8 = r20
                byte[] r3 = com.google.crypto.tink.subtle.AesCtrHmacStreaming.access$700(r3, r4, r6, r8)     // Catch: java.lang.Throwable -> Ldf
                int r4 = r0.remaining()     // Catch: java.lang.Throwable -> Ldf
                com.google.crypto.tink.subtle.AesCtrHmacStreaming r6 = r1.this$0     // Catch: java.lang.Throwable -> Ldf
                int r6 = com.google.crypto.tink.subtle.AesCtrHmacStreaming.access$800(r6)     // Catch: java.lang.Throwable -> Ldf
                if (r4 < r6) goto Ld3
                com.google.crypto.tink.subtle.AesCtrHmacStreaming r6 = r1.this$0     // Catch: java.lang.Throwable -> Ldf
                int r6 = com.google.crypto.tink.subtle.AesCtrHmacStreaming.access$800(r6)     // Catch: java.lang.Throwable -> Ldf
                int r6 = r4 - r6
                int r7 = r2 + r6
                java.nio.ByteBuffer r9 = r0.duplicate()     // Catch: java.lang.Throwable -> Ldf
                r9.limit(r7)     // Catch: java.lang.Throwable -> Ldf
                java.nio.ByteBuffer r10 = r0.duplicate()     // Catch: java.lang.Throwable -> Ldf
                r10.position(r7)     // Catch: java.lang.Throwable -> Ldf
                javax.crypto.Mac r11 = r1.mac     // Catch: java.lang.Throwable -> Ldf
                if (r11 == 0) goto Lc9
                javax.crypto.spec.SecretKeySpec r11 = r1.hmacKeySpec     // Catch: java.lang.Throwable -> Ldf
                if (r11 == 0) goto Lbf
                javax.crypto.Mac r11 = r1.mac     // Catch: java.lang.Throwable -> Ldf
                javax.crypto.spec.SecretKeySpec r12 = r1.hmacKeySpec     // Catch: java.lang.Throwable -> Ldf
                r11.init(r12)     // Catch: java.lang.Throwable -> Ldf
                javax.crypto.Mac r11 = r1.mac     // Catch: java.lang.Throwable -> Ldf
                r11.update(r3)     // Catch: java.lang.Throwable -> Ldf
                javax.crypto.Mac r11 = r1.mac     // Catch: java.lang.Throwable -> Ldf
                r11.update(r9)     // Catch: java.lang.Throwable -> Ldf
                javax.crypto.Mac r11 = r1.mac     // Catch: java.lang.Throwable -> Ldf
                byte[] r11 = r11.doFinal()     // Catch: java.lang.Throwable -> Ldf
                com.google.crypto.tink.subtle.AesCtrHmacStreaming r12 = r1.this$0     // Catch: java.lang.Throwable -> Ldf
                int r12 = com.google.crypto.tink.subtle.AesCtrHmacStreaming.access$800(r12)     // Catch: java.lang.Throwable -> Ldf
                byte[] r12 = java.util.Arrays.copyOf(r11, r12)     // Catch: java.lang.Throwable -> Ldf
                com.google.crypto.tink.subtle.AesCtrHmacStreaming r11 = r1.this$0     // Catch: java.lang.Throwable -> Ldf
                int r11 = com.google.crypto.tink.subtle.AesCtrHmacStreaming.access$800(r11)     // Catch: java.lang.Throwable -> Ldf
                byte[] r11 = new byte[r11]     // Catch: java.lang.Throwable -> Ldf
                int r13 = r10.remaining()     // Catch: java.lang.Throwable -> Ldf
                com.google.crypto.tink.subtle.AesCtrHmacStreaming r14 = r1.this$0     // Catch: java.lang.Throwable -> Ldf
                int r14 = com.google.crypto.tink.subtle.AesCtrHmacStreaming.access$800(r14)     // Catch: java.lang.Throwable -> Ldf
                if (r13 != r14) goto Lb5
                r10.get(r11)     // Catch: java.lang.Throwable -> Ldf
                int r13 = r11.length     // Catch: java.lang.Throwable -> Ldf
                int r14 = r12.length     // Catch: java.lang.Throwable -> Ldf
                if (r13 != r14) goto Lab
                boolean r13 = com.google.crypto.tink.subtle.Bytes.equal(r11, r12)     // Catch: java.lang.Throwable -> Ldf
                if (r13 == 0) goto L9f
                r0.limit(r7)     // Catch: java.lang.Throwable -> Ldf
                javax.crypto.Cipher r13 = r1.cipher     // Catch: java.lang.Throwable -> Ldf
                javax.crypto.spec.SecretKeySpec r14 = r1.keySpec     // Catch: java.lang.Throwable -> Ldf
                javax.crypto.spec.IvParameterSpec r15 = new javax.crypto.spec.IvParameterSpec     // Catch: java.lang.Throwable -> Ldf
                r15.<init>(r3)     // Catch: java.lang.Throwable -> Ldf
                r16 = r2
                r2 = 1
                r13.init(r2, r14, r15)     // Catch: java.lang.Throwable -> Ldf
                javax.crypto.Cipher r2 = r1.cipher     // Catch: java.lang.Throwable -> Ldf
                r13 = r21
                r2.doFinal(r0, r13)     // Catch: java.lang.Throwable -> Ldf
                monitor-exit(r17)
                return
            L9f:
                r13 = r21
                r16 = r2
                java.security.GeneralSecurityException r2 = new java.security.GeneralSecurityException     // Catch: java.lang.Throwable -> Ldf
                java.lang.String r14 = "Tag mismatch"
                r2.<init>(r14)     // Catch: java.lang.Throwable -> Ldf
                throw r2     // Catch: java.lang.Throwable -> Ldf
            Lab:
                r13 = r21
                r16 = r2
                java.lang.AssertionError r2 = new java.lang.AssertionError     // Catch: java.lang.Throwable -> Ldf
                r2.<init>()     // Catch: java.lang.Throwable -> Ldf
                throw r2     // Catch: java.lang.Throwable -> Ldf
            Lb5:
                r13 = r21
                r16 = r2
                java.lang.AssertionError r2 = new java.lang.AssertionError     // Catch: java.lang.Throwable -> Ldf
                r2.<init>()     // Catch: java.lang.Throwable -> Ldf
                throw r2     // Catch: java.lang.Throwable -> Ldf
            Lbf:
                r13 = r21
                r16 = r2
                java.lang.AssertionError r2 = new java.lang.AssertionError     // Catch: java.lang.Throwable -> Ldf
                r2.<init>()     // Catch: java.lang.Throwable -> Ldf
                throw r2     // Catch: java.lang.Throwable -> Ldf
            Lc9:
                r13 = r21
                r16 = r2
                java.lang.AssertionError r2 = new java.lang.AssertionError     // Catch: java.lang.Throwable -> Ldf
                r2.<init>()     // Catch: java.lang.Throwable -> Ldf
                throw r2     // Catch: java.lang.Throwable -> Ldf
            Ld3:
                r13 = r21
                r16 = r2
                java.security.GeneralSecurityException r2 = new java.security.GeneralSecurityException     // Catch: java.lang.Throwable -> Ldf
                java.lang.String r6 = "Ciphertext too short"
                r2.<init>(r6)     // Catch: java.lang.Throwable -> Ldf
                throw r2     // Catch: java.lang.Throwable -> Ldf
            Ldf:
                r0 = move-exception
                monitor-exit(r17)     // Catch: java.lang.Throwable -> Ldf
                throw r0
        }

        @Override // com.google.crypto.tink.subtle.StreamSegmentDecrypter
        public synchronized void init(java.nio.ByteBuffer r5, byte[] r6) throws java.security.GeneralSecurityException {
                r4 = this;
                monitor-enter(r4)
                int r0 = r5.remaining()     // Catch: java.lang.Throwable -> L64
                com.google.crypto.tink.subtle.AesCtrHmacStreaming r1 = r4.this$0     // Catch: java.lang.Throwable -> L64
                int r1 = r1.getHeaderLength()     // Catch: java.lang.Throwable -> L64
                if (r0 != r1) goto L5c
                byte r0 = r5.get()     // Catch: java.lang.Throwable -> L64
                com.google.crypto.tink.subtle.AesCtrHmacStreaming r1 = r4.this$0     // Catch: java.lang.Throwable -> L64
                int r1 = r1.getHeaderLength()     // Catch: java.lang.Throwable -> L64
                if (r0 != r1) goto L54
                r1 = 7
                byte[] r1 = new byte[r1]     // Catch: java.lang.Throwable -> L64
                r4.noncePrefix = r1     // Catch: java.lang.Throwable -> L64
                com.google.crypto.tink.subtle.AesCtrHmacStreaming r1 = r4.this$0     // Catch: java.lang.Throwable -> L64
                int r1 = com.google.crypto.tink.subtle.AesCtrHmacStreaming.access$900(r1)     // Catch: java.lang.Throwable -> L64
                byte[] r1 = new byte[r1]     // Catch: java.lang.Throwable -> L64
                r5.get(r1)     // Catch: java.lang.Throwable -> L64
                byte[] r2 = r4.noncePrefix     // Catch: java.lang.Throwable -> L64
                r5.get(r2)     // Catch: java.lang.Throwable -> L64
                com.google.crypto.tink.subtle.AesCtrHmacStreaming r2 = r4.this$0     // Catch: java.lang.Throwable -> L64
                byte[] r2 = com.google.crypto.tink.subtle.AesCtrHmacStreaming.access$400(r2, r1, r6)     // Catch: java.lang.Throwable -> L64
                com.google.crypto.tink.subtle.AesCtrHmacStreaming r3 = r4.this$0     // Catch: java.lang.Throwable -> L64
                javax.crypto.spec.SecretKeySpec r3 = com.google.crypto.tink.subtle.AesCtrHmacStreaming.access$500(r3, r2)     // Catch: java.lang.Throwable -> L64
                r4.keySpec = r3     // Catch: java.lang.Throwable -> L64
                com.google.crypto.tink.subtle.AesCtrHmacStreaming r3 = r4.this$0     // Catch: java.lang.Throwable -> L64
                javax.crypto.spec.SecretKeySpec r3 = com.google.crypto.tink.subtle.AesCtrHmacStreaming.access$600(r3, r2)     // Catch: java.lang.Throwable -> L64
                r4.hmacKeySpec = r3     // Catch: java.lang.Throwable -> L64
                javax.crypto.Cipher r3 = com.google.crypto.tink.subtle.AesCtrHmacStreaming.access$000()     // Catch: java.lang.Throwable -> L64
                r4.cipher = r3     // Catch: java.lang.Throwable -> L64
                com.google.crypto.tink.subtle.AesCtrHmacStreaming r3 = r4.this$0     // Catch: java.lang.Throwable -> L64
                javax.crypto.Mac r3 = com.google.crypto.tink.subtle.AesCtrHmacStreaming.access$100(r3)     // Catch: java.lang.Throwable -> L64
                r4.mac = r3     // Catch: java.lang.Throwable -> L64
                monitor-exit(r4)
                return
            L54:
                java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException     // Catch: java.lang.Throwable -> L64
                java.lang.String r2 = "Invalid ciphertext"
                r1.<init>(r2)     // Catch: java.lang.Throwable -> L64
                throw r1     // Catch: java.lang.Throwable -> L64
            L5c:
                java.security.InvalidAlgorithmParameterException r0 = new java.security.InvalidAlgorithmParameterException     // Catch: java.lang.Throwable -> L64
                java.lang.String r1 = "Invalid header length"
                r0.<init>(r1)     // Catch: java.lang.Throwable -> L64
                throw r0     // Catch: java.lang.Throwable -> L64
            L64:
                r5 = move-exception
                monitor-exit(r4)     // Catch: java.lang.Throwable -> L64
                throw r5
        }
    }

    class AesCtrHmacStreamEncrypter implements com.google.crypto.tink.subtle.StreamSegmentEncrypter {
        private final javax.crypto.Cipher cipher;
        private long encryptedSegments;
        private java.nio.ByteBuffer header;
        private final javax.crypto.spec.SecretKeySpec hmacKeySpec;
        private final javax.crypto.spec.SecretKeySpec keySpec;
        private final javax.crypto.Mac mac;
        private final byte[] noncePrefix;
        final /* synthetic */ com.google.crypto.tink.subtle.AesCtrHmacStreaming this$0;

        public AesCtrHmacStreamEncrypter(com.google.crypto.tink.subtle.AesCtrHmacStreaming r4, byte[] r5) throws java.security.GeneralSecurityException {
                r3 = this;
                r3.this$0 = r4
                r3.<init>()
                r0 = 0
                r3.encryptedSegments = r0
                javax.crypto.Cipher r2 = com.google.crypto.tink.subtle.AesCtrHmacStreaming.access$000()
                r3.cipher = r2
                javax.crypto.Mac r2 = com.google.crypto.tink.subtle.AesCtrHmacStreaming.access$100(r4)
                r3.mac = r2
                r3.encryptedSegments = r0
                byte[] r0 = com.google.crypto.tink.subtle.AesCtrHmacStreaming.access$200(r4)
                byte[] r1 = com.google.crypto.tink.subtle.AesCtrHmacStreaming.access$300(r4)
                r3.noncePrefix = r1
                int r1 = r4.getHeaderLength()
                java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocate(r1)
                r3.header = r1
                java.nio.ByteBuffer r1 = r3.header
                int r2 = r4.getHeaderLength()
                byte r2 = (byte) r2
                r1.put(r2)
                java.nio.ByteBuffer r1 = r3.header
                r1.put(r0)
                java.nio.ByteBuffer r1 = r3.header
                byte[] r2 = r3.noncePrefix
                r1.put(r2)
                java.nio.ByteBuffer r1 = r3.header
                r1.flip()
                byte[] r1 = com.google.crypto.tink.subtle.AesCtrHmacStreaming.access$400(r4, r0, r5)
                javax.crypto.spec.SecretKeySpec r2 = com.google.crypto.tink.subtle.AesCtrHmacStreaming.access$500(r4, r1)
                r3.keySpec = r2
                javax.crypto.spec.SecretKeySpec r2 = com.google.crypto.tink.subtle.AesCtrHmacStreaming.access$600(r4, r1)
                r3.hmacKeySpec = r2
                return
        }

        @Override // com.google.crypto.tink.subtle.StreamSegmentEncrypter
        public synchronized void encryptSegment(java.nio.ByteBuffer r7, java.nio.ByteBuffer r8, boolean r9, java.nio.ByteBuffer r10) throws java.security.GeneralSecurityException {
                r6 = this;
                monitor-enter(r6)
                int r0 = r10.position()     // Catch: java.lang.Throwable -> L5a
                com.google.crypto.tink.subtle.AesCtrHmacStreaming r1 = r6.this$0     // Catch: java.lang.Throwable -> L5a
                byte[] r2 = r6.noncePrefix     // Catch: java.lang.Throwable -> L5a
                long r3 = r6.encryptedSegments     // Catch: java.lang.Throwable -> L5a
                byte[] r1 = com.google.crypto.tink.subtle.AesCtrHmacStreaming.access$700(r1, r2, r3, r9)     // Catch: java.lang.Throwable -> L5a
                javax.crypto.Cipher r2 = r6.cipher     // Catch: java.lang.Throwable -> L5a
                javax.crypto.spec.SecretKeySpec r3 = r6.keySpec     // Catch: java.lang.Throwable -> L5a
                javax.crypto.spec.IvParameterSpec r4 = new javax.crypto.spec.IvParameterSpec     // Catch: java.lang.Throwable -> L5a
                r4.<init>(r1)     // Catch: java.lang.Throwable -> L5a
                r5 = 1
                r2.init(r5, r3, r4)     // Catch: java.lang.Throwable -> L5a
                long r2 = r6.encryptedSegments     // Catch: java.lang.Throwable -> L5a
                r4 = 1
                long r2 = r2 + r4
                r6.encryptedSegments = r2     // Catch: java.lang.Throwable -> L5a
                javax.crypto.Cipher r2 = r6.cipher     // Catch: java.lang.Throwable -> L5a
                r2.update(r7, r10)     // Catch: java.lang.Throwable -> L5a
                javax.crypto.Cipher r2 = r6.cipher     // Catch: java.lang.Throwable -> L5a
                r2.doFinal(r8, r10)     // Catch: java.lang.Throwable -> L5a
                java.nio.ByteBuffer r2 = r10.duplicate()     // Catch: java.lang.Throwable -> L5a
                r2.flip()     // Catch: java.lang.Throwable -> L5a
                r2.position(r0)     // Catch: java.lang.Throwable -> L5a
                javax.crypto.Mac r3 = r6.mac     // Catch: java.lang.Throwable -> L5a
                javax.crypto.spec.SecretKeySpec r4 = r6.hmacKeySpec     // Catch: java.lang.Throwable -> L5a
                r3.init(r4)     // Catch: java.lang.Throwable -> L5a
                javax.crypto.Mac r3 = r6.mac     // Catch: java.lang.Throwable -> L5a
                r3.update(r1)     // Catch: java.lang.Throwable -> L5a
                javax.crypto.Mac r3 = r6.mac     // Catch: java.lang.Throwable -> L5a
                r3.update(r2)     // Catch: java.lang.Throwable -> L5a
                javax.crypto.Mac r3 = r6.mac     // Catch: java.lang.Throwable -> L5a
                byte[] r3 = r3.doFinal()     // Catch: java.lang.Throwable -> L5a
                com.google.crypto.tink.subtle.AesCtrHmacStreaming r4 = r6.this$0     // Catch: java.lang.Throwable -> L5a
                int r4 = com.google.crypto.tink.subtle.AesCtrHmacStreaming.access$800(r4)     // Catch: java.lang.Throwable -> L5a
                r5 = 0
                r10.put(r3, r5, r4)     // Catch: java.lang.Throwable -> L5a
                monitor-exit(r6)
                return
            L5a:
                r7 = move-exception
                monitor-exit(r6)     // Catch: java.lang.Throwable -> L5a
                throw r7
        }

        @Override // com.google.crypto.tink.subtle.StreamSegmentEncrypter
        public synchronized void encryptSegment(java.nio.ByteBuffer r7, boolean r8, java.nio.ByteBuffer r9) throws java.security.GeneralSecurityException {
                r6 = this;
                monitor-enter(r6)
                int r0 = r9.position()     // Catch: java.lang.Throwable -> L55
                com.google.crypto.tink.subtle.AesCtrHmacStreaming r1 = r6.this$0     // Catch: java.lang.Throwable -> L55
                byte[] r2 = r6.noncePrefix     // Catch: java.lang.Throwable -> L55
                long r3 = r6.encryptedSegments     // Catch: java.lang.Throwable -> L55
                byte[] r1 = com.google.crypto.tink.subtle.AesCtrHmacStreaming.access$700(r1, r2, r3, r8)     // Catch: java.lang.Throwable -> L55
                javax.crypto.Cipher r2 = r6.cipher     // Catch: java.lang.Throwable -> L55
                javax.crypto.spec.SecretKeySpec r3 = r6.keySpec     // Catch: java.lang.Throwable -> L55
                javax.crypto.spec.IvParameterSpec r4 = new javax.crypto.spec.IvParameterSpec     // Catch: java.lang.Throwable -> L55
                r4.<init>(r1)     // Catch: java.lang.Throwable -> L55
                r5 = 1
                r2.init(r5, r3, r4)     // Catch: java.lang.Throwable -> L55
                long r2 = r6.encryptedSegments     // Catch: java.lang.Throwable -> L55
                r4 = 1
                long r2 = r2 + r4
                r6.encryptedSegments = r2     // Catch: java.lang.Throwable -> L55
                javax.crypto.Cipher r2 = r6.cipher     // Catch: java.lang.Throwable -> L55
                r2.doFinal(r7, r9)     // Catch: java.lang.Throwable -> L55
                java.nio.ByteBuffer r2 = r9.duplicate()     // Catch: java.lang.Throwable -> L55
                r2.flip()     // Catch: java.lang.Throwable -> L55
                r2.position(r0)     // Catch: java.lang.Throwable -> L55
                javax.crypto.Mac r3 = r6.mac     // Catch: java.lang.Throwable -> L55
                javax.crypto.spec.SecretKeySpec r4 = r6.hmacKeySpec     // Catch: java.lang.Throwable -> L55
                r3.init(r4)     // Catch: java.lang.Throwable -> L55
                javax.crypto.Mac r3 = r6.mac     // Catch: java.lang.Throwable -> L55
                r3.update(r1)     // Catch: java.lang.Throwable -> L55
                javax.crypto.Mac r3 = r6.mac     // Catch: java.lang.Throwable -> L55
                r3.update(r2)     // Catch: java.lang.Throwable -> L55
                javax.crypto.Mac r3 = r6.mac     // Catch: java.lang.Throwable -> L55
                byte[] r3 = r3.doFinal()     // Catch: java.lang.Throwable -> L55
                com.google.crypto.tink.subtle.AesCtrHmacStreaming r4 = r6.this$0     // Catch: java.lang.Throwable -> L55
                int r4 = com.google.crypto.tink.subtle.AesCtrHmacStreaming.access$800(r4)     // Catch: java.lang.Throwable -> L55
                r5 = 0
                r9.put(r3, r5, r4)     // Catch: java.lang.Throwable -> L55
                monitor-exit(r6)
                return
            L55:
                r7 = move-exception
                monitor-exit(r6)     // Catch: java.lang.Throwable -> L55
                throw r7
        }

        @Override // com.google.crypto.tink.subtle.StreamSegmentEncrypter
        public java.nio.ByteBuffer getHeader() {
                r1 = this;
                java.nio.ByteBuffer r0 = r1.header
                java.nio.ByteBuffer r0 = r0.asReadOnlyBuffer()
                return r0
        }
    }

    static {
            com.google.crypto.tink.config.internal.TinkFipsUtil$AlgorithmFipsCompatibility r0 = com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_NOT_FIPS
            com.google.crypto.tink.subtle.AesCtrHmacStreaming.FIPS = r0
            return
    }

    public AesCtrHmacStreaming(byte[] r8, java.lang.String r9, int r10, java.lang.String r11, int r12, int r13, int r14) throws java.security.GeneralSecurityException {
            r7 = this;
            r7.<init>()
            com.google.crypto.tink.config.internal.TinkFipsUtil$AlgorithmFipsCompatibility r0 = com.google.crypto.tink.subtle.AesCtrHmacStreaming.FIPS
            boolean r0 = r0.isCompatible()
            if (r0 == 0) goto L2c
            int r1 = r8.length
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            validateParameters(r1, r2, r3, r4, r5, r6)
            int r10 = r8.length
            byte[] r10 = java.util.Arrays.copyOf(r8, r10)
            r7.ikm = r10
            r7.hkdfAlgo = r9
            r7.keySizeInBytes = r2
            r7.tagAlgo = r3
            r7.tagSizeInBytes = r4
            r7.ciphertextSegmentSize = r5
            r7.firstSegmentOffset = r6
            int r13 = r5 - r4
            r7.plaintextSegmentSize = r13
            return
        L2c:
            r2 = r10
            r3 = r11
            java.security.GeneralSecurityException r10 = new java.security.GeneralSecurityException
            java.lang.String r11 = "Can not use AES-CTR-HMAC streaming in FIPS-mode."
            r10.<init>(r11)
            throw r10
    }

    static /* synthetic */ javax.crypto.Cipher access$000() throws java.security.GeneralSecurityException {
            javax.crypto.Cipher r0 = cipherInstance()
            return r0
    }

    static /* synthetic */ javax.crypto.Mac access$100(com.google.crypto.tink.subtle.AesCtrHmacStreaming r1) throws java.security.GeneralSecurityException {
            javax.crypto.Mac r0 = r1.macInstance()
            return r0
    }

    static /* synthetic */ byte[] access$200(com.google.crypto.tink.subtle.AesCtrHmacStreaming r1) {
            byte[] r0 = r1.randomSalt()
            return r0
    }

    static /* synthetic */ byte[] access$300(com.google.crypto.tink.subtle.AesCtrHmacStreaming r1) {
            byte[] r0 = r1.randomNonce()
            return r0
    }

    static /* synthetic */ byte[] access$400(com.google.crypto.tink.subtle.AesCtrHmacStreaming r1, byte[] r2, byte[] r3) throws java.security.GeneralSecurityException {
            byte[] r0 = r1.deriveKeyMaterial(r2, r3)
            return r0
    }

    static /* synthetic */ javax.crypto.spec.SecretKeySpec access$500(com.google.crypto.tink.subtle.AesCtrHmacStreaming r1, byte[] r2) throws java.security.GeneralSecurityException {
            javax.crypto.spec.SecretKeySpec r0 = r1.deriveKeySpec(r2)
            return r0
    }

    static /* synthetic */ javax.crypto.spec.SecretKeySpec access$600(com.google.crypto.tink.subtle.AesCtrHmacStreaming r1, byte[] r2) throws java.security.GeneralSecurityException {
            javax.crypto.spec.SecretKeySpec r0 = r1.deriveHmacKeySpec(r2)
            return r0
    }

    static /* synthetic */ byte[] access$700(com.google.crypto.tink.subtle.AesCtrHmacStreaming r1, byte[] r2, long r3, boolean r5) throws java.security.GeneralSecurityException {
            byte[] r0 = r1.nonceForSegment(r2, r3, r5)
            return r0
    }

    static /* synthetic */ int access$800(com.google.crypto.tink.subtle.AesCtrHmacStreaming r1) {
            int r0 = r1.tagSizeInBytes
            return r0
    }

    static /* synthetic */ int access$900(com.google.crypto.tink.subtle.AesCtrHmacStreaming r1) {
            int r0 = r1.keySizeInBytes
            return r0
    }

    private static javax.crypto.Cipher cipherInstance() throws java.security.GeneralSecurityException {
            com.google.crypto.tink.subtle.EngineFactory<com.google.crypto.tink.subtle.EngineWrapper$TCipher, javax.crypto.Cipher> r0 = com.google.crypto.tink.subtle.EngineFactory.CIPHER
            java.lang.String r1 = "AES/CTR/NoPadding"
            java.lang.Object r0 = r0.getInstance(r1)
            javax.crypto.Cipher r0 = (javax.crypto.Cipher) r0
            return r0
    }

    private javax.crypto.spec.SecretKeySpec deriveHmacKeySpec(byte[] r5) throws java.security.GeneralSecurityException {
            r4 = this;
            javax.crypto.spec.SecretKeySpec r0 = new javax.crypto.spec.SecretKeySpec
            int r1 = r4.keySizeInBytes
            r2 = 32
            java.lang.String r3 = r4.tagAlgo
            r0.<init>(r5, r1, r2, r3)
            return r0
    }

    private byte[] deriveKeyMaterial(byte[] r4, byte[] r5) throws java.security.GeneralSecurityException {
            r3 = this;
            int r0 = r3.keySizeInBytes
            int r0 = r0 + 32
            java.lang.String r1 = r3.hkdfAlgo
            byte[] r2 = r3.ikm
            byte[] r1 = com.google.crypto.tink.subtle.Hkdf.computeHkdf(r1, r2, r4, r5, r0)
            return r1
    }

    private javax.crypto.spec.SecretKeySpec deriveKeySpec(byte[] r5) throws java.security.GeneralSecurityException {
            r4 = this;
            javax.crypto.spec.SecretKeySpec r0 = new javax.crypto.spec.SecretKeySpec
            int r1 = r4.keySizeInBytes
            java.lang.String r2 = "AES"
            r3 = 0
            r0.<init>(r5, r3, r1, r2)
            return r0
    }

    private javax.crypto.Mac macInstance() throws java.security.GeneralSecurityException {
            r2 = this;
            com.google.crypto.tink.subtle.EngineFactory<com.google.crypto.tink.subtle.EngineWrapper$TMac, javax.crypto.Mac> r0 = com.google.crypto.tink.subtle.EngineFactory.MAC
            java.lang.String r1 = r2.tagAlgo
            java.lang.Object r0 = r0.getInstance(r1)
            javax.crypto.Mac r0 = (javax.crypto.Mac) r0
            return r0
    }

    private byte[] nonceForSegment(byte[] r3, long r4, boolean r6) throws java.security.GeneralSecurityException {
            r2 = this;
            r0 = 16
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            r0.order(r1)
            r0.put(r3)
            com.google.crypto.tink.subtle.SubtleUtil.putAsUnsigedInt(r0, r4)
            byte r1 = (byte) r6
            r0.put(r1)
            r1 = 0
            r0.putInt(r1)
            byte[] r1 = r0.array()
            return r1
    }

    private byte[] randomNonce() {
            r1 = this;
            r0 = 7
            byte[] r0 = com.google.crypto.tink.subtle.Random.randBytes(r0)
            return r0
    }

    private byte[] randomSalt() {
            r1 = this;
            int r0 = r1.keySizeInBytes
            byte[] r0 = com.google.crypto.tink.subtle.Random.randBytes(r0)
            return r0
    }

    private static void validateParameters(int r4, int r5, java.lang.String r6, int r7, int r8, int r9) throws java.security.InvalidAlgorithmParameterException {
            r0 = 16
            if (r4 < r0) goto L66
            if (r4 < r5) goto L66
            com.google.crypto.tink.subtle.Validators.validateAesKeySize(r5)
            r0 = 10
            if (r7 < r0) goto L4d
            java.lang.String r0 = "HmacSha1"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L19
            r0 = 20
            if (r7 > r0) goto L32
        L19:
            java.lang.String r0 = "HmacSha256"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L25
            r0 = 32
            if (r7 > r0) goto L32
        L25:
            java.lang.String r0 = "HmacSha512"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L3a
            r0 = 64
            if (r7 > r0) goto L32
            goto L3a
        L32:
            java.security.InvalidAlgorithmParameterException r0 = new java.security.InvalidAlgorithmParameterException
            java.lang.String r1 = "tag size too big"
            r0.<init>(r1)
            throw r0
        L3a:
            int r0 = r8 - r9
            int r0 = r0 - r7
            int r0 = r0 - r5
            int r0 = r0 + (-7)
            int r0 = r0 + (-1)
            if (r0 <= 0) goto L45
            return
        L45:
            java.security.InvalidAlgorithmParameterException r1 = new java.security.InvalidAlgorithmParameterException
            java.lang.String r2 = "ciphertextSegmentSize too small"
            r1.<init>(r2)
            throw r1
        L4d:
            java.security.InvalidAlgorithmParameterException r0 = new java.security.InvalidAlgorithmParameterException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "tag size too small "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r7)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L66:
            java.security.InvalidAlgorithmParameterException r1 = new java.security.InvalidAlgorithmParameterException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "ikm too short, must be >= "
            java.lang.StringBuilder r2 = r2.append(r3)
            int r0 = java.lang.Math.max(r0, r5)
            java.lang.StringBuilder r0 = r2.append(r0)
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
    }

    public long expectedCiphertextSize(long r11) {
            r10 = this;
            int r0 = r10.getCiphertextOffset()
            long r0 = (long) r0
            long r2 = r11 + r0
            int r4 = r10.plaintextSegmentSize
            long r4 = (long) r4
            long r2 = r2 / r4
            int r4 = r10.ciphertextSegmentSize
            long r4 = (long) r4
            long r4 = r4 * r2
            long r6 = r11 + r0
            int r8 = r10.plaintextSegmentSize
            long r8 = (long) r8
            long r6 = r6 % r8
            r8 = 0
            int r8 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r8 <= 0) goto L20
            int r8 = r10.tagSizeInBytes
            long r8 = (long) r8
            long r8 = r8 + r6
            long r4 = r4 + r8
        L20:
            return r4
    }

    @Override // com.google.crypto.tink.subtle.NonceBasedStreamingAead
    public int getCiphertextOffset() {
            r2 = this;
            int r0 = r2.getHeaderLength()
            int r1 = r2.firstSegmentOffset
            int r0 = r0 + r1
            return r0
    }

    @Override // com.google.crypto.tink.subtle.NonceBasedStreamingAead
    public int getCiphertextOverhead() {
            r1 = this;
            int r0 = r1.tagSizeInBytes
            return r0
    }

    @Override // com.google.crypto.tink.subtle.NonceBasedStreamingAead
    public int getCiphertextSegmentSize() {
            r1 = this;
            int r0 = r1.ciphertextSegmentSize
            return r0
    }

    public int getFirstSegmentOffset() {
            r1 = this;
            int r0 = r1.firstSegmentOffset
            return r0
    }

    @Override // com.google.crypto.tink.subtle.NonceBasedStreamingAead
    public int getHeaderLength() {
            r1 = this;
            int r0 = r1.keySizeInBytes
            int r0 = r0 + 1
            int r0 = r0 + 7
            return r0
    }

    @Override // com.google.crypto.tink.subtle.NonceBasedStreamingAead
    public int getPlaintextSegmentSize() {
            r1 = this;
            int r0 = r1.plaintextSegmentSize
            return r0
    }

    @Override // com.google.crypto.tink.subtle.NonceBasedStreamingAead, com.google.crypto.tink.StreamingAead
    public /* bridge */ /* synthetic */ java.nio.channels.ReadableByteChannel newDecryptingChannel(java.nio.channels.ReadableByteChannel r1, byte[] r2) throws java.security.GeneralSecurityException, java.io.IOException {
            r0 = this;
            java.nio.channels.ReadableByteChannel r1 = super.newDecryptingChannel(r1, r2)
            return r1
    }

    @Override // com.google.crypto.tink.subtle.NonceBasedStreamingAead, com.google.crypto.tink.StreamingAead
    public /* bridge */ /* synthetic */ java.io.InputStream newDecryptingStream(java.io.InputStream r1, byte[] r2) throws java.security.GeneralSecurityException, java.io.IOException {
            r0 = this;
            java.io.InputStream r1 = super.newDecryptingStream(r1, r2)
            return r1
    }

    @Override // com.google.crypto.tink.subtle.NonceBasedStreamingAead, com.google.crypto.tink.StreamingAead
    public /* bridge */ /* synthetic */ java.nio.channels.WritableByteChannel newEncryptingChannel(java.nio.channels.WritableByteChannel r1, byte[] r2) throws java.security.GeneralSecurityException, java.io.IOException {
            r0 = this;
            java.nio.channels.WritableByteChannel r1 = super.newEncryptingChannel(r1, r2)
            return r1
    }

    @Override // com.google.crypto.tink.subtle.NonceBasedStreamingAead, com.google.crypto.tink.StreamingAead
    public /* bridge */ /* synthetic */ java.io.OutputStream newEncryptingStream(java.io.OutputStream r1, byte[] r2) throws java.security.GeneralSecurityException, java.io.IOException {
            r0 = this;
            java.io.OutputStream r1 = super.newEncryptingStream(r1, r2)
            return r1
    }

    @Override // com.google.crypto.tink.subtle.NonceBasedStreamingAead, com.google.crypto.tink.StreamingAead
    public /* bridge */ /* synthetic */ java.nio.channels.SeekableByteChannel newSeekableDecryptingChannel(java.nio.channels.SeekableByteChannel r1, byte[] r2) throws java.security.GeneralSecurityException, java.io.IOException {
            r0 = this;
            java.nio.channels.SeekableByteChannel r1 = super.newSeekableDecryptingChannel(r1, r2)
            return r1
    }

    @Override // com.google.crypto.tink.subtle.NonceBasedStreamingAead
    public com.google.crypto.tink.subtle.AesCtrHmacStreaming.AesCtrHmacStreamDecrypter newStreamSegmentDecrypter() throws java.security.GeneralSecurityException {
            r1 = this;
            com.google.crypto.tink.subtle.AesCtrHmacStreaming$AesCtrHmacStreamDecrypter r0 = new com.google.crypto.tink.subtle.AesCtrHmacStreaming$AesCtrHmacStreamDecrypter
            r0.<init>(r1)
            return r0
    }

    @Override // com.google.crypto.tink.subtle.NonceBasedStreamingAead
    public /* bridge */ /* synthetic */ com.google.crypto.tink.subtle.StreamSegmentDecrypter newStreamSegmentDecrypter() throws java.security.GeneralSecurityException {
            r1 = this;
            com.google.crypto.tink.subtle.AesCtrHmacStreaming$AesCtrHmacStreamDecrypter r0 = r1.newStreamSegmentDecrypter()
            return r0
    }

    @Override // com.google.crypto.tink.subtle.NonceBasedStreamingAead
    public com.google.crypto.tink.subtle.AesCtrHmacStreaming.AesCtrHmacStreamEncrypter newStreamSegmentEncrypter(byte[] r2) throws java.security.GeneralSecurityException {
            r1 = this;
            com.google.crypto.tink.subtle.AesCtrHmacStreaming$AesCtrHmacStreamEncrypter r0 = new com.google.crypto.tink.subtle.AesCtrHmacStreaming$AesCtrHmacStreamEncrypter
            r0.<init>(r1, r2)
            return r0
    }

    @Override // com.google.crypto.tink.subtle.NonceBasedStreamingAead
    public /* bridge */ /* synthetic */ com.google.crypto.tink.subtle.StreamSegmentEncrypter newStreamSegmentEncrypter(byte[] r1) throws java.security.GeneralSecurityException {
            r0 = this;
            com.google.crypto.tink.subtle.AesCtrHmacStreaming$AesCtrHmacStreamEncrypter r1 = r0.newStreamSegmentEncrypter(r1)
            return r1
    }
}
