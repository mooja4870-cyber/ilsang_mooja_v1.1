package androidx.security.crypto;

/* JADX INFO: loaded from: classes.dex */
public final class EncryptedFile {
    private static final java.lang.String KEYSET_ALIAS = "__androidx_security_crypto_encrypted_file_keyset__";
    private static final java.lang.String KEYSET_PREF_NAME = "__androidx_security_crypto_encrypted_file_pref__";
    final android.content.Context mContext;
    final java.io.File mFile;
    final java.lang.String mMasterKeyAlias;
    final com.google.crypto.tink.StreamingAead mStreamingAead;

    public static final class Builder {
        private static final java.lang.Object sLock = null;
        final android.content.Context mContext;
        java.io.File mFile;
        final androidx.security.crypto.EncryptedFile.FileEncryptionScheme mFileEncryptionScheme;
        java.lang.String mKeysetAlias;
        java.lang.String mKeysetPrefName;
        final java.lang.String mMasterKeyAlias;

        static {
                java.lang.Object r0 = new java.lang.Object
                r0.<init>()
                androidx.security.crypto.EncryptedFile.Builder.sLock = r0
                return
        }

        public Builder(android.content.Context r2, java.io.File r3, androidx.security.crypto.MasterKey r4, androidx.security.crypto.EncryptedFile.FileEncryptionScheme r5) {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = "__androidx_security_crypto_encrypted_file_pref__"
                r1.mKeysetPrefName = r0
                java.lang.String r0 = "__androidx_security_crypto_encrypted_file_keyset__"
                r1.mKeysetAlias = r0
                r1.mFile = r3
                r1.mFileEncryptionScheme = r5
                android.content.Context r0 = r2.getApplicationContext()
                r1.mContext = r0
                java.lang.String r0 = r4.getKeyAlias()
                r1.mMasterKeyAlias = r0
                return
        }

        @java.lang.Deprecated
        public Builder(java.io.File r2, android.content.Context r3, java.lang.String r4, androidx.security.crypto.EncryptedFile.FileEncryptionScheme r5) {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = "__androidx_security_crypto_encrypted_file_pref__"
                r1.mKeysetPrefName = r0
                java.lang.String r0 = "__androidx_security_crypto_encrypted_file_keyset__"
                r1.mKeysetAlias = r0
                r1.mFile = r2
                r1.mFileEncryptionScheme = r5
                android.content.Context r0 = r3.getApplicationContext()
                r1.mContext = r0
                r1.mMasterKeyAlias = r4
                return
        }

        public androidx.security.crypto.EncryptedFile build() throws java.security.GeneralSecurityException, java.io.IOException {
                r8 = this;
                com.google.crypto.tink.streamingaead.StreamingAeadConfig.register()
                com.google.crypto.tink.integration.android.AndroidKeysetManager$Builder r0 = new com.google.crypto.tink.integration.android.AndroidKeysetManager$Builder
                r0.<init>()
                androidx.security.crypto.EncryptedFile$FileEncryptionScheme r1 = r8.mFileEncryptionScheme
                com.google.crypto.tink.KeyTemplate r1 = r1.getKeyTemplate()
                com.google.crypto.tink.integration.android.AndroidKeysetManager$Builder r0 = r0.withKeyTemplate(r1)
                android.content.Context r1 = r8.mContext
                java.lang.String r2 = r8.mKeysetAlias
                java.lang.String r3 = r8.mKeysetPrefName
                com.google.crypto.tink.integration.android.AndroidKeysetManager$Builder r0 = r0.withSharedPref(r1, r2, r3)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "android-keystore://"
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.String r2 = r8.mMasterKeyAlias
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.String r1 = r1.toString()
                com.google.crypto.tink.integration.android.AndroidKeysetManager$Builder r0 = r0.withMasterKeyUri(r1)
                java.lang.Object r1 = androidx.security.crypto.EncryptedFile.Builder.sLock
                monitor-enter(r1)
                com.google.crypto.tink.integration.android.AndroidKeysetManager r2 = r0.build()     // Catch: java.lang.Throwable -> L55
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L55
                com.google.crypto.tink.KeysetHandle r1 = r2.getKeysetHandle()
                java.lang.Class<com.google.crypto.tink.StreamingAead> r3 = com.google.crypto.tink.StreamingAead.class
                java.lang.Object r3 = r1.getPrimitive(r3)
                com.google.crypto.tink.StreamingAead r3 = (com.google.crypto.tink.StreamingAead) r3
                androidx.security.crypto.EncryptedFile r4 = new androidx.security.crypto.EncryptedFile
                java.io.File r5 = r8.mFile
                java.lang.String r6 = r8.mKeysetAlias
                android.content.Context r7 = r8.mContext
                r4.<init>(r5, r6, r3, r7)
                return r4
            L55:
                r2 = move-exception
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L55
                throw r2
        }

        public androidx.security.crypto.EncryptedFile.Builder setKeysetAlias(java.lang.String r1) {
                r0 = this;
                r0.mKeysetAlias = r1
                return r0
        }

        public androidx.security.crypto.EncryptedFile.Builder setKeysetPrefName(java.lang.String r1) {
                r0 = this;
                r0.mKeysetPrefName = r1
                return r0
        }
    }

    private static final class EncryptedFileInputStream extends java.io.FileInputStream {
        private final java.io.InputStream mEncryptedInputStream;
        private final java.lang.Object mLock;

        EncryptedFileInputStream(java.io.FileDescriptor r2, java.io.InputStream r3) {
                r1 = this;
                r1.<init>(r2)
                java.lang.Object r0 = new java.lang.Object
                r0.<init>()
                r1.mLock = r0
                r1.mEncryptedInputStream = r3
                return
        }

        @Override // java.io.FileInputStream, java.io.InputStream
        public int available() throws java.io.IOException {
                r1 = this;
                java.io.InputStream r0 = r1.mEncryptedInputStream
                int r0 = r0.available()
                return r0
        }

        @Override // java.io.FileInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws java.io.IOException {
                r1 = this;
                java.io.InputStream r0 = r1.mEncryptedInputStream
                r0.close()
                return
        }

        @Override // java.io.FileInputStream
        public java.nio.channels.FileChannel getChannel() {
                r2 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                java.lang.String r1 = "For encrypted files, please open the relevant FileInput/FileOutputStream."
                r0.<init>(r1)
                throw r0
        }

        @Override // java.io.InputStream
        public void mark(int r3) {
                r2 = this;
                java.lang.Object r0 = r2.mLock
                monitor-enter(r0)
                java.io.InputStream r1 = r2.mEncryptedInputStream     // Catch: java.lang.Throwable -> La
                r1.mark(r3)     // Catch: java.lang.Throwable -> La
                monitor-exit(r0)     // Catch: java.lang.Throwable -> La
                return
            La:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> La
                throw r1
        }

        @Override // java.io.InputStream
        public boolean markSupported() {
                r1 = this;
                java.io.InputStream r0 = r1.mEncryptedInputStream
                boolean r0 = r0.markSupported()
                return r0
        }

        @Override // java.io.FileInputStream, java.io.InputStream
        public int read() throws java.io.IOException {
                r1 = this;
                java.io.InputStream r0 = r1.mEncryptedInputStream
                int r0 = r0.read()
                return r0
        }

        @Override // java.io.FileInputStream, java.io.InputStream
        public int read(byte[] r2) throws java.io.IOException {
                r1 = this;
                java.io.InputStream r0 = r1.mEncryptedInputStream
                int r0 = r0.read(r2)
                return r0
        }

        @Override // java.io.FileInputStream, java.io.InputStream
        public int read(byte[] r2, int r3, int r4) throws java.io.IOException {
                r1 = this;
                java.io.InputStream r0 = r1.mEncryptedInputStream
                int r0 = r0.read(r2, r3, r4)
                return r0
        }

        @Override // java.io.InputStream
        public void reset() throws java.io.IOException {
                r2 = this;
                java.lang.Object r0 = r2.mLock
                monitor-enter(r0)
                java.io.InputStream r1 = r2.mEncryptedInputStream     // Catch: java.lang.Throwable -> La
                r1.reset()     // Catch: java.lang.Throwable -> La
                monitor-exit(r0)     // Catch: java.lang.Throwable -> La
                return
            La:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> La
                throw r1
        }

        @Override // java.io.FileInputStream, java.io.InputStream
        public long skip(long r3) throws java.io.IOException {
                r2 = this;
                java.io.InputStream r0 = r2.mEncryptedInputStream
                long r0 = r0.skip(r3)
                return r0
        }
    }

    private static final class EncryptedFileOutputStream extends java.io.FileOutputStream {
        private final java.io.OutputStream mEncryptedOutputStream;

        EncryptedFileOutputStream(java.io.FileDescriptor r1, java.io.OutputStream r2) {
                r0 = this;
                r0.<init>(r1)
                r0.mEncryptedOutputStream = r2
                return
        }

        @Override // java.io.FileOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws java.io.IOException {
                r1 = this;
                java.io.OutputStream r0 = r1.mEncryptedOutputStream
                r0.close()
                return
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() throws java.io.IOException {
                r1 = this;
                java.io.OutputStream r0 = r1.mEncryptedOutputStream
                r0.flush()
                return
        }

        @Override // java.io.FileOutputStream
        public java.nio.channels.FileChannel getChannel() {
                r2 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                java.lang.String r1 = "For encrypted files, please open the relevant FileInput/FileOutputStream."
                r0.<init>(r1)
                throw r0
        }

        @Override // java.io.FileOutputStream, java.io.OutputStream
        public void write(int r2) throws java.io.IOException {
                r1 = this;
                java.io.OutputStream r0 = r1.mEncryptedOutputStream
                r0.write(r2)
                return
        }

        @Override // java.io.FileOutputStream, java.io.OutputStream
        public void write(byte[] r2) throws java.io.IOException {
                r1 = this;
                java.io.OutputStream r0 = r1.mEncryptedOutputStream
                r0.write(r2)
                return
        }

        @Override // java.io.FileOutputStream, java.io.OutputStream
        public void write(byte[] r2, int r3, int r4) throws java.io.IOException {
                r1 = this;
                java.io.OutputStream r0 = r1.mEncryptedOutputStream
                r0.write(r2, r3, r4)
                return
        }
    }

    public enum FileEncryptionScheme extends java.lang.Enum<androidx.security.crypto.EncryptedFile.FileEncryptionScheme> {
        private static final /* synthetic */ androidx.security.crypto.EncryptedFile.FileEncryptionScheme[] $VALUES = null;
        public static final androidx.security.crypto.EncryptedFile.FileEncryptionScheme AES256_GCM_HKDF_4KB = null;
        private final java.lang.String mKeyTemplateName;

        private static /* synthetic */ androidx.security.crypto.EncryptedFile.FileEncryptionScheme[] $values() {
                androidx.security.crypto.EncryptedFile$FileEncryptionScheme r0 = androidx.security.crypto.EncryptedFile.FileEncryptionScheme.AES256_GCM_HKDF_4KB
                androidx.security.crypto.EncryptedFile$FileEncryptionScheme[] r0 = new androidx.security.crypto.EncryptedFile.FileEncryptionScheme[]{r0}
                return r0
        }

        static {
                androidx.security.crypto.EncryptedFile$FileEncryptionScheme r0 = new androidx.security.crypto.EncryptedFile$FileEncryptionScheme
                java.lang.String r1 = "AES256_GCM_HKDF_4KB"
                r2 = 0
                r0.<init>(r1, r2, r1)
                androidx.security.crypto.EncryptedFile.FileEncryptionScheme.AES256_GCM_HKDF_4KB = r0
                androidx.security.crypto.EncryptedFile$FileEncryptionScheme[] r0 = $values()
                androidx.security.crypto.EncryptedFile.FileEncryptionScheme.$VALUES = r0
                return
        }

        FileEncryptionScheme(java.lang.String r1, int r2, java.lang.String r3) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.mKeyTemplateName = r3
                return
        }

        public static androidx.security.crypto.EncryptedFile.FileEncryptionScheme valueOf(java.lang.String r1) {
                java.lang.Class<androidx.security.crypto.EncryptedFile$FileEncryptionScheme> r0 = androidx.security.crypto.EncryptedFile.FileEncryptionScheme.class
                java.lang.Enum r0 = java.lang.Enum.valueOf(r0, r1)
                androidx.security.crypto.EncryptedFile$FileEncryptionScheme r0 = (androidx.security.crypto.EncryptedFile.FileEncryptionScheme) r0
                return r0
        }

        public static androidx.security.crypto.EncryptedFile.FileEncryptionScheme[] values() {
                androidx.security.crypto.EncryptedFile$FileEncryptionScheme[] r0 = androidx.security.crypto.EncryptedFile.FileEncryptionScheme.$VALUES
                java.lang.Object r0 = r0.clone()
                androidx.security.crypto.EncryptedFile$FileEncryptionScheme[] r0 = (androidx.security.crypto.EncryptedFile.FileEncryptionScheme[]) r0
                return r0
        }

        com.google.crypto.tink.KeyTemplate getKeyTemplate() throws java.security.GeneralSecurityException {
                r1 = this;
                java.lang.String r0 = r1.mKeyTemplateName
                com.google.crypto.tink.KeyTemplate r0 = com.google.crypto.tink.KeyTemplates.get(r0)
                return r0
        }
    }

    EncryptedFile(java.io.File r1, java.lang.String r2, com.google.crypto.tink.StreamingAead r3, android.content.Context r4) {
            r0 = this;
            r0.<init>()
            r0.mFile = r1
            r0.mContext = r4
            r0.mMasterKeyAlias = r2
            r0.mStreamingAead = r3
            return
    }

    public java.io.FileInputStream openFileInput() throws java.security.GeneralSecurityException, java.io.IOException, java.io.FileNotFoundException {
            r4 = this;
            java.io.File r0 = r4.mFile
            boolean r0 = r0.exists()
            if (r0 == 0) goto L2b
            java.io.FileInputStream r0 = new java.io.FileInputStream
            java.io.File r1 = r4.mFile
            r0.<init>(r1)
            com.google.crypto.tink.StreamingAead r1 = r4.mStreamingAead
            java.io.File r2 = r4.mFile
            java.lang.String r2 = r2.getName()
            java.nio.charset.Charset r3 = java.nio.charset.StandardCharsets.UTF_8
            byte[] r2 = r2.getBytes(r3)
            java.io.InputStream r1 = r1.newDecryptingStream(r0, r2)
            androidx.security.crypto.EncryptedFile$EncryptedFileInputStream r2 = new androidx.security.crypto.EncryptedFile$EncryptedFileInputStream
            java.io.FileDescriptor r3 = r0.getFD()
            r2.<init>(r3, r1)
            return r2
        L2b:
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "file doesn't exist: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.io.File r2 = r4.mFile
            java.lang.String r2 = r2.getName()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public java.io.FileOutputStream openFileOutput() throws java.security.GeneralSecurityException, java.io.IOException {
            r4 = this;
            java.io.File r0 = r4.mFile
            boolean r0 = r0.exists()
            if (r0 != 0) goto L2b
            java.io.FileOutputStream r0 = new java.io.FileOutputStream
            java.io.File r1 = r4.mFile
            r0.<init>(r1)
            com.google.crypto.tink.StreamingAead r1 = r4.mStreamingAead
            java.io.File r2 = r4.mFile
            java.lang.String r2 = r2.getName()
            java.nio.charset.Charset r3 = java.nio.charset.StandardCharsets.UTF_8
            byte[] r2 = r2.getBytes(r3)
            java.io.OutputStream r1 = r1.newEncryptingStream(r0, r2)
            androidx.security.crypto.EncryptedFile$EncryptedFileOutputStream r2 = new androidx.security.crypto.EncryptedFile$EncryptedFileOutputStream
            java.io.FileDescriptor r3 = r0.getFD()
            r2.<init>(r3, r1)
            return r2
        L2b:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "output file already exists, please use a new file: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.io.File r2 = r4.mFile
            java.lang.String r2 = r2.getName()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }
}
