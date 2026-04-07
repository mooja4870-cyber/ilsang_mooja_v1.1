package com.google.crypto.tink.integration.android;

/* JADX INFO: loaded from: classes.dex */
public final class SharedPrefKeysetWriter implements com.google.crypto.tink.KeysetWriter {
    private final android.content.SharedPreferences.Editor editor;
    private final java.lang.String keysetName;

    public SharedPrefKeysetWriter(android.content.Context r3, java.lang.String r4, java.lang.String r5) {
            r2 = this;
            r2.<init>()
            if (r4 == 0) goto L24
            r2.keysetName = r4
            android.content.Context r0 = r3.getApplicationContext()
            if (r5 != 0) goto L18
            android.content.SharedPreferences r1 = android.preference.PreferenceManager.getDefaultSharedPreferences(r0)
            android.content.SharedPreferences$Editor r1 = r1.edit()
            r2.editor = r1
            goto L23
        L18:
            r1 = 0
            android.content.SharedPreferences r1 = r0.getSharedPreferences(r5, r1)
            android.content.SharedPreferences$Editor r1 = r1.edit()
            r2.editor = r1
        L23:
            return
        L24:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "keysetName cannot be null"
            r0.<init>(r1)
            throw r0
    }

    @Override // com.google.crypto.tink.KeysetWriter
    public void write(com.google.crypto.tink.proto.EncryptedKeyset r4) throws java.io.IOException {
            r3 = this;
            android.content.SharedPreferences$Editor r0 = r3.editor
            java.lang.String r1 = r3.keysetName
            byte[] r2 = r4.toByteArray()
            java.lang.String r2 = com.google.crypto.tink.subtle.Hex.encode(r2)
            android.content.SharedPreferences$Editor r0 = r0.putString(r1, r2)
            boolean r0 = r0.commit()
            if (r0 == 0) goto L17
            return
        L17:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "Failed to write to SharedPreferences"
            r1.<init>(r2)
            throw r1
    }

    @Override // com.google.crypto.tink.KeysetWriter
    public void write(com.google.crypto.tink.proto.Keyset r4) throws java.io.IOException {
            r3 = this;
            android.content.SharedPreferences$Editor r0 = r3.editor
            java.lang.String r1 = r3.keysetName
            byte[] r2 = r4.toByteArray()
            java.lang.String r2 = com.google.crypto.tink.subtle.Hex.encode(r2)
            android.content.SharedPreferences$Editor r0 = r0.putString(r1, r2)
            boolean r0 = r0.commit()
            if (r0 == 0) goto L17
            return
        L17:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "Failed to write to SharedPreferences"
            r1.<init>(r2)
            throw r1
    }
}
