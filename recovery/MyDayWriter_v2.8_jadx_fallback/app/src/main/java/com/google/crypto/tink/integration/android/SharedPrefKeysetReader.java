package com.google.crypto.tink.integration.android;

/* JADX INFO: loaded from: classes.dex */
public final class SharedPrefKeysetReader implements com.google.crypto.tink.KeysetReader {
    private final java.lang.String keysetName;
    private final android.content.SharedPreferences sharedPreferences;

    public SharedPrefKeysetReader(android.content.Context r3, java.lang.String r4, java.lang.String r5) throws java.io.IOException {
            r2 = this;
            r2.<init>()
            if (r4 == 0) goto L1c
            r2.keysetName = r4
            android.content.Context r0 = r3.getApplicationContext()
            if (r5 != 0) goto L14
            android.content.SharedPreferences r1 = android.preference.PreferenceManager.getDefaultSharedPreferences(r0)
            r2.sharedPreferences = r1
            goto L1b
        L14:
            r1 = 0
            android.content.SharedPreferences r1 = r0.getSharedPreferences(r5, r1)
            r2.sharedPreferences = r1
        L1b:
            return
        L1c:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "keysetName cannot be null"
            r0.<init>(r1)
            throw r0
    }

    private byte[] readPref() throws java.io.IOException {
            r4 = this;
            android.content.SharedPreferences r0 = r4.sharedPreferences     // Catch: java.lang.IllegalArgumentException -> L22 java.lang.ClassCastException -> L24
            java.lang.String r1 = r4.keysetName     // Catch: java.lang.IllegalArgumentException -> L22 java.lang.ClassCastException -> L24
            r2 = 0
            java.lang.String r0 = r0.getString(r1, r2)     // Catch: java.lang.IllegalArgumentException -> L22 java.lang.ClassCastException -> L24
            if (r0 == 0) goto L10
            byte[] r1 = com.google.crypto.tink.subtle.Hex.decode(r0)     // Catch: java.lang.IllegalArgumentException -> L22 java.lang.ClassCastException -> L24
            return r1
        L10:
            java.io.FileNotFoundException r1 = new java.io.FileNotFoundException     // Catch: java.lang.IllegalArgumentException -> L22 java.lang.ClassCastException -> L24
            java.lang.String r2 = "can't read keyset; the pref value %s does not exist"
            java.lang.String r3 = r4.keysetName     // Catch: java.lang.IllegalArgumentException -> L22 java.lang.ClassCastException -> L24
            java.lang.Object[] r3 = new java.lang.Object[]{r3}     // Catch: java.lang.IllegalArgumentException -> L22 java.lang.ClassCastException -> L24
            java.lang.String r2 = java.lang.String.format(r2, r3)     // Catch: java.lang.IllegalArgumentException -> L22 java.lang.ClassCastException -> L24
            r1.<init>(r2)     // Catch: java.lang.IllegalArgumentException -> L22 java.lang.ClassCastException -> L24
            throw r1     // Catch: java.lang.IllegalArgumentException -> L22 java.lang.ClassCastException -> L24
        L22:
            r0 = move-exception
            goto L25
        L24:
            r0 = move-exception
        L25:
            java.io.CharConversionException r1 = new java.io.CharConversionException
            java.lang.String r2 = r4.keysetName
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.String r3 = "can't read keyset; the pref value %s is not a valid hex string"
            java.lang.String r2 = java.lang.String.format(r3, r2)
            r1.<init>(r2)
            throw r1
    }

    @Override // com.google.crypto.tink.KeysetReader
    public com.google.crypto.tink.proto.Keyset read() throws java.io.IOException {
            r2 = this;
            byte[] r0 = r2.readPref()
            com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r1 = com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry()
            com.google.crypto.tink.proto.Keyset r0 = com.google.crypto.tink.proto.Keyset.parseFrom(r0, r1)
            return r0
    }

    @Override // com.google.crypto.tink.KeysetReader
    public com.google.crypto.tink.proto.EncryptedKeyset readEncrypted() throws java.io.IOException {
            r2 = this;
            byte[] r0 = r2.readPref()
            com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite r1 = com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry()
            com.google.crypto.tink.proto.EncryptedKeyset r0 = com.google.crypto.tink.proto.EncryptedKeyset.parseFrom(r0, r1)
            return r0
    }
}
