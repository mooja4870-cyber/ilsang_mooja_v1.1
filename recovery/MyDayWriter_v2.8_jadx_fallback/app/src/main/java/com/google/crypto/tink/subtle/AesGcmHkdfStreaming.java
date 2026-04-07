package com.google.crypto.tink.subtle;

/* JADX INFO: loaded from: classes.dex */
public final class AesGcmHkdfStreaming extends com.google.crypto.tink.subtle.NonceBasedStreamingAead {
    private static final int NONCE_PREFIX_IN_BYTES = 7;
    private static final int NONCE_SIZE_IN_BYTES = 12;
    private static final int TAG_SIZE_IN_BYTES = 16;
    private final int ciphertextSegmentSize;
    private final int firstSegmentOffset;
    private final java.lang.String hkdfAlg;
    private final byte[] ikm;
    private final int keySizeInBytes;
    private final int plaintextSegmentSize;

    class AesGcmHkdfStreamDecrypter implements com.google.crypto.tink.subtle.StreamSegmentDecrypter {
        private javax.crypto.Cipher cipher;
        private javax.crypto.spec.SecretKeySpec keySpec;
        private byte[] noncePrefix;
        final /* synthetic */ com.google.crypto.tink.subtle.AesGcmHkdfStreaming this$0;

        AesGcmHkdfStreamDecrypter(com.google.crypto.tink.subtle.AesGcmHkdfStreaming r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // com.google.crypto.tink.subtle.StreamSegmentDecrypter
        public synchronized void decryptSegment(java.nio.ByteBuffer r5, int r6, boolean r7, java.nio.ByteBuffer r8) throws java.security.GeneralSecurityException {
                r4 = this;
                monitor-enter(r4)
                byte[] r0 = r4.noncePrefix     // Catch: java.lang.Throwable -> L17
                long r1 = (long) r6     // Catch: java.lang.Throwable -> L17
                javax.crypto.spec.GCMParameterSpec r0 = com.google.crypto.tink.subtle.AesGcmHkdfStreaming.access$400(r0, r1, r7)     // Catch: java.lang.Throwable -> L17
                javax.crypto.Cipher r1 = r4.cipher     // Catch: java.lang.Throwable -> L17
                javax.crypto.spec.SecretKeySpec r2 = r4.keySpec     // Catch: java.lang.Throwable -> L17
                r3 = 2
                r1.init(r3, r2, r0)     // Catch: java.lang.Throwable -> L17
                javax.crypto.Cipher r1 = r4.cipher     // Catch: java.lang.Throwable -> L17
                r1.doFinal(r5, r8)     // Catch: java.lang.Throwable -> L17
                monitor-exit(r4)
                return
            L17:
                r5 = move-exception
                monitor-exit(r4)     // Catch: java.lang.Throwable -> L17
                throw r5
        }

        @Override // com.google.crypto.tink.subtle.StreamSegmentDecrypter
        public synchronized void init(java.nio.ByteBuffer r4, byte[] r5) throws java.security.GeneralSecurityException {
                r3 = this;
                monitor-enter(r3)
                int r0 = r4.remaining()     // Catch: java.lang.Throwable -> L4e
                com.google.crypto.tink.subtle.AesGcmHkdfStreaming r1 = r3.this$0     // Catch: java.lang.Throwable -> L4e
                int r1 = r1.getHeaderLength()     // Catch: java.lang.Throwable -> L4e
                if (r0 != r1) goto L46
                byte r0 = r4.get()     // Catch: java.lang.Throwable -> L4e
                com.google.crypto.tink.subtle.AesGcmHkdfStreaming r1 = r3.this$0     // Catch: java.lang.Throwable -> L4e
                int r1 = r1.getHeaderLength()     // Catch: java.lang.Throwable -> L4e
                if (r0 != r1) goto L3e
                r1 = 7
                byte[] r1 = new byte[r1]     // Catch: java.lang.Throwable -> L4e
                r3.noncePrefix = r1     // Catch: java.lang.Throwable -> L4e
                com.google.crypto.tink.subtle.AesGcmHkdfStreaming r1 = r3.this$0     // Catch: java.lang.Throwable -> L4e
                int r1 = com.google.crypto.tink.subtle.AesGcmHkdfStreaming.access$500(r1)     // Catch: java.lang.Throwable -> L4e
                byte[] r1 = new byte[r1]     // Catch: java.lang.Throwable -> L4e
                r4.get(r1)     // Catch: java.lang.Throwable -> L4e
                byte[] r2 = r3.noncePrefix     // Catch: java.lang.Throwable -> L4e
                r4.get(r2)     // Catch: java.lang.Throwable -> L4e
                com.google.crypto.tink.subtle.AesGcmHkdfStreaming r2 = r3.this$0     // Catch: java.lang.Throwable -> L4e
                javax.crypto.spec.SecretKeySpec r2 = com.google.crypto.tink.subtle.AesGcmHkdfStreaming.access$300(r2, r1, r5)     // Catch: java.lang.Throwable -> L4e
                r3.keySpec = r2     // Catch: java.lang.Throwable -> L4e
                javax.crypto.Cipher r2 = com.google.crypto.tink.subtle.AesGcmHkdfStreaming.access$000()     // Catch: java.lang.Throwable -> L4e
                r3.cipher = r2     // Catch: java.lang.Throwable -> L4e
                monitor-exit(r3)
                return
            L3e:
                java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException     // Catch: java.lang.Throwable -> L4e
                java.lang.String r2 = "Invalid ciphertext"
                r1.<init>(r2)     // Catch: java.lang.Throwable -> L4e
                throw r1     // Catch: java.lang.Throwable -> L4e
            L46:
                java.security.InvalidAlgorithmParameterException r0 = new java.security.InvalidAlgorithmParameterException     // Catch: java.lang.Throwable -> L4e
                java.lang.String r1 = "Invalid header length"
                r0.<init>(r1)     // Catch: java.lang.Throwable -> L4e
                throw r0     // Catch: java.lang.Throwable -> L4e
            L4e:
                r4 = move-exception
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L4e
                throw r4
        }
    }

    class AesGcmHkdfStreamEncrypter implements com.google.crypto.tink.subtle.StreamSegmentEncrypter {
        private final javax.crypto.Cipher cipher;
        private long encryptedSegments;
        private final java.nio.ByteBuffer header;
        private final javax.crypto.spec.SecretKeySpec keySpec;
        private final byte[] noncePrefix;
        final /* synthetic */ com.google.crypto.tink.subtle.AesGcmHkdfStreaming this$0;

        public AesGcmHkdfStreamEncrypter(com.google.crypto.tink.subtle.AesGcmHkdfStreaming r4, byte[] r5) throws java.security.GeneralSecurityException {
                r3 = this;
                r3.this$0 = r4
                r3.<init>()
                r0 = 0
                r3.encryptedSegments = r0
                javax.crypto.Cipher r2 = com.google.crypto.tink.subtle.AesGcmHkdfStreaming.access$000()
                r3.cipher = r2
                r3.encryptedSegments = r0
                byte[] r0 = com.google.crypto.tink.subtle.AesGcmHkdfStreaming.access$100(r4)
                byte[] r1 = com.google.crypto.tink.subtle.AesGcmHkdfStreaming.access$200()
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
                javax.crypto.spec.SecretKeySpec r1 = com.google.crypto.tink.subtle.AesGcmHkdfStreaming.access$300(r4, r0, r5)
                r3.keySpec = r1
                return
        }

        @Override // com.google.crypto.tink.subtle.StreamSegmentEncrypter
        public synchronized void encryptSegment(java.nio.ByteBuffer r6, java.nio.ByteBuffer r7, boolean r8, java.nio.ByteBuffer r9) throws java.security.GeneralSecurityException {
                r5 = this;
                monitor-enter(r5)
                javax.crypto.Cipher r0 = r5.cipher     // Catch: java.lang.Throwable -> L30
                javax.crypto.spec.SecretKeySpec r1 = r5.keySpec     // Catch: java.lang.Throwable -> L30
                byte[] r2 = r5.noncePrefix     // Catch: java.lang.Throwable -> L30
                long r3 = r5.encryptedSegments     // Catch: java.lang.Throwable -> L30
                javax.crypto.spec.GCMParameterSpec r2 = com.google.crypto.tink.subtle.AesGcmHkdfStreaming.access$400(r2, r3, r8)     // Catch: java.lang.Throwable -> L30
                r3 = 1
                r0.init(r3, r1, r2)     // Catch: java.lang.Throwable -> L30
                long r0 = r5.encryptedSegments     // Catch: java.lang.Throwable -> L30
                r2 = 1
                long r0 = r0 + r2
                r5.encryptedSegments = r0     // Catch: java.lang.Throwable -> L30
                boolean r0 = r7.hasRemaining()     // Catch: java.lang.Throwable -> L30
                if (r0 == 0) goto L29
                javax.crypto.Cipher r0 = r5.cipher     // Catch: java.lang.Throwable -> L30
                r0.update(r6, r9)     // Catch: java.lang.Throwable -> L30
                javax.crypto.Cipher r0 = r5.cipher     // Catch: java.lang.Throwable -> L30
                r0.doFinal(r7, r9)     // Catch: java.lang.Throwable -> L30
                goto L2e
            L29:
                javax.crypto.Cipher r0 = r5.cipher     // Catch: java.lang.Throwable -> L30
                r0.doFinal(r6, r9)     // Catch: java.lang.Throwable -> L30
            L2e:
                monitor-exit(r5)
                return
            L30:
                r6 = move-exception
                monitor-exit(r5)     // Catch: java.lang.Throwable -> L30
                throw r6
        }

        @Override // com.google.crypto.tink.subtle.StreamSegmentEncrypter
        public synchronized void encryptSegment(java.nio.ByteBuffer r6, boolean r7, java.nio.ByteBuffer r8) throws java.security.GeneralSecurityException {
                r5 = this;
                monitor-enter(r5)
                javax.crypto.Cipher r0 = r5.cipher     // Catch: java.lang.Throwable -> L1f
                javax.crypto.spec.SecretKeySpec r1 = r5.keySpec     // Catch: java.lang.Throwable -> L1f
                byte[] r2 = r5.noncePrefix     // Catch: java.lang.Throwable -> L1f
                long r3 = r5.encryptedSegments     // Catch: java.lang.Throwable -> L1f
                javax.crypto.spec.GCMParameterSpec r2 = com.google.crypto.tink.subtle.AesGcmHkdfStreaming.access$400(r2, r3, r7)     // Catch: java.lang.Throwable -> L1f
                r3 = 1
                r0.init(r3, r1, r2)     // Catch: java.lang.Throwable -> L1f
                long r0 = r5.encryptedSegments     // Catch: java.lang.Throwable -> L1f
                r2 = 1
                long r0 = r0 + r2
                r5.encryptedSegments = r0     // Catch: java.lang.Throwable -> L1f
                javax.crypto.Cipher r0 = r5.cipher     // Catch: java.lang.Throwable -> L1f
                r0.doFinal(r6, r8)     // Catch: java.lang.Throwable -> L1f
                monitor-exit(r5)
                return
            L1f:
                r6 = move-exception
                monitor-exit(r5)     // Catch: java.lang.Throwable -> L1f
                throw r6
        }

        @Override // com.google.crypto.tink.subtle.StreamSegmentEncrypter
        public java.nio.ByteBuffer getHeader() {
                r1 = this;
                java.nio.ByteBuffer r0 = r1.header
                java.nio.ByteBuffer r0 = r0.asReadOnlyBuffer()
                return r0
        }
    }

    public AesGcmHkdfStreaming(byte[] r5, java.lang.String r6, int r7, int r8, int r9) throws java.security.InvalidAlgorithmParameterException {
            r4 = this;
            r4.<init>()
            int r0 = r5.length
            r1 = 16
            if (r0 < r1) goto L32
            int r0 = r5.length
            if (r0 < r7) goto L32
            com.google.crypto.tink.subtle.Validators.validateAesKeySize(r7)
            int r0 = r4.getHeaderLength()
            int r0 = r0 + r9
            int r0 = r0 + r1
            if (r8 <= r0) goto L2a
            int r0 = r5.length
            byte[] r0 = java.util.Arrays.copyOf(r5, r0)
            r4.ikm = r0
            r4.hkdfAlg = r6
            r4.keySizeInBytes = r7
            r4.ciphertextSegmentSize = r8
            r4.firstSegmentOffset = r9
            int r0 = r8 + (-16)
            r4.plaintextSegmentSize = r0
            return
        L2a:
            java.security.InvalidAlgorithmParameterException r0 = new java.security.InvalidAlgorithmParameterException
            java.lang.String r1 = "ciphertextSegmentSize too small"
            r0.<init>(r1)
            throw r0
        L32:
            java.security.InvalidAlgorithmParameterException r0 = new java.security.InvalidAlgorithmParameterException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "ikm too short, must be >= "
            java.lang.StringBuilder r2 = r2.append(r3)
            int r1 = java.lang.Math.max(r1, r7)
            java.lang.StringBuilder r1 = r2.append(r1)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    static /* synthetic */ javax.crypto.Cipher access$000() throws java.security.GeneralSecurityException {
            javax.crypto.Cipher r0 = cipherInstance()
            return r0
    }

    static /* synthetic */ byte[] access$100(com.google.crypto.tink.subtle.AesGcmHkdfStreaming r1) {
            byte[] r0 = r1.randomSalt()
            return r0
    }

    static /* synthetic */ byte[] access$200() {
            byte[] r0 = randomNonce()
            return r0
    }

    static /* synthetic */ javax.crypto.spec.SecretKeySpec access$300(com.google.crypto.tink.subtle.AesGcmHkdfStreaming r1, byte[] r2, byte[] r3) throws java.security.GeneralSecurityException {
            javax.crypto.spec.SecretKeySpec r0 = r1.deriveKeySpec(r2, r3)
            return r0
    }

    static /* synthetic */ javax.crypto.spec.GCMParameterSpec access$400(byte[] r1, long r2, boolean r4) throws java.security.GeneralSecurityException {
            javax.crypto.spec.GCMParameterSpec r0 = paramsForSegment(r1, r2, r4)
            return r0
    }

    static /* synthetic */ int access$500(com.google.crypto.tink.subtle.AesGcmHkdfStreaming r1) {
            int r0 = r1.keySizeInBytes
            return r0
    }

    private static javax.crypto.Cipher cipherInstance() throws java.security.GeneralSecurityException {
            com.google.crypto.tink.subtle.EngineFactory<com.google.crypto.tink.subtle.EngineWrapper$TCipher, javax.crypto.Cipher> r0 = com.google.crypto.tink.subtle.EngineFactory.CIPHER
            java.lang.String r1 = "AES/GCM/NoPadding"
            java.lang.Object r0 = r0.getInstance(r1)
            javax.crypto.Cipher r0 = (javax.crypto.Cipher) r0
            return r0
    }

    private javax.crypto.spec.SecretKeySpec deriveKeySpec(byte[] r4, byte[] r5) throws java.security.GeneralSecurityException {
            r3 = this;
            java.lang.String r0 = r3.hkdfAlg
            byte[] r1 = r3.ikm
            int r2 = r3.keySizeInBytes
            byte[] r0 = com.google.crypto.tink.subtle.Hkdf.computeHkdf(r0, r1, r4, r5, r2)
            javax.crypto.spec.SecretKeySpec r1 = new javax.crypto.spec.SecretKeySpec
            java.lang.String r2 = "AES"
            r1.<init>(r0, r2)
            return r1
    }

    private static javax.crypto.spec.GCMParameterSpec paramsForSegment(byte[] r4, long r5, boolean r7) throws java.security.GeneralSecurityException {
            r0 = 12
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            r0.order(r1)
            r0.put(r4)
            com.google.crypto.tink.subtle.SubtleUtil.putAsUnsigedInt(r0, r5)
            byte r1 = (byte) r7
            r0.put(r1)
            javax.crypto.spec.GCMParameterSpec r1 = new javax.crypto.spec.GCMParameterSpec
            r2 = 128(0x80, float:1.8E-43)
            byte[] r3 = r0.array()
            r1.<init>(r2, r3)
            return r1
    }

    private static byte[] randomNonce() {
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
            if (r8 <= 0) goto L1f
            r8 = 16
            long r8 = r8 + r6
            long r4 = r4 + r8
        L1f:
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
            r0 = 16
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
    public com.google.crypto.tink.subtle.AesGcmHkdfStreaming.AesGcmHkdfStreamDecrypter newStreamSegmentDecrypter() throws java.security.GeneralSecurityException {
            r1 = this;
            com.google.crypto.tink.subtle.AesGcmHkdfStreaming$AesGcmHkdfStreamDecrypter r0 = new com.google.crypto.tink.subtle.AesGcmHkdfStreaming$AesGcmHkdfStreamDecrypter
            r0.<init>(r1)
            return r0
    }

    @Override // com.google.crypto.tink.subtle.NonceBasedStreamingAead
    public /* bridge */ /* synthetic */ com.google.crypto.tink.subtle.StreamSegmentDecrypter newStreamSegmentDecrypter() throws java.security.GeneralSecurityException {
            r1 = this;
            com.google.crypto.tink.subtle.AesGcmHkdfStreaming$AesGcmHkdfStreamDecrypter r0 = r1.newStreamSegmentDecrypter()
            return r0
    }

    @Override // com.google.crypto.tink.subtle.NonceBasedStreamingAead
    public com.google.crypto.tink.subtle.AesGcmHkdfStreaming.AesGcmHkdfStreamEncrypter newStreamSegmentEncrypter(byte[] r2) throws java.security.GeneralSecurityException {
            r1 = this;
            com.google.crypto.tink.subtle.AesGcmHkdfStreaming$AesGcmHkdfStreamEncrypter r0 = new com.google.crypto.tink.subtle.AesGcmHkdfStreaming$AesGcmHkdfStreamEncrypter
            r0.<init>(r1, r2)
            return r0
    }

    @Override // com.google.crypto.tink.subtle.NonceBasedStreamingAead
    public /* bridge */ /* synthetic */ com.google.crypto.tink.subtle.StreamSegmentEncrypter newStreamSegmentEncrypter(byte[] r1) throws java.security.GeneralSecurityException {
            r0 = this;
            com.google.crypto.tink.subtle.AesGcmHkdfStreaming$AesGcmHkdfStreamEncrypter r1 = r0.newStreamSegmentEncrypter(r1)
            return r1
    }
}
