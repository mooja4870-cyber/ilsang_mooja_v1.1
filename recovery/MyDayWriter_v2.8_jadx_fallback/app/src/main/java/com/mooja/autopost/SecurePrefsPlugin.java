package com.mooja.autopost;

/* JADX INFO: loaded from: classes6.dex */
@com.getcapacitor.annotation.CapacitorPlugin(name = "SecurePrefs")
public class SecurePrefsPlugin extends com.getcapacitor.Plugin {
    private static final java.lang.String PREF_NAME = "myday_writer_secure_prefs";
    private android.content.SharedPreferences securePrefs;

    public SecurePrefsPlugin() {
            r0 = this;
            r0.<init>()
            return
    }

    private android.content.SharedPreferences getSecurePrefs() throws java.lang.Exception {
            r5 = this;
            android.content.SharedPreferences r0 = r5.securePrefs
            if (r0 == 0) goto L7
            android.content.SharedPreferences r0 = r5.securePrefs
            return r0
        L7:
            android.content.Context r0 = r5.getContext()
            androidx.security.crypto.MasterKey$Builder r1 = new androidx.security.crypto.MasterKey$Builder
            r1.<init>(r0)
            androidx.security.crypto.MasterKey$KeyScheme r2 = androidx.security.crypto.MasterKey.KeyScheme.AES256_GCM
            androidx.security.crypto.MasterKey$Builder r1 = r1.setKeyScheme(r2)
            androidx.security.crypto.MasterKey r1 = r1.build()
            androidx.security.crypto.EncryptedSharedPreferences$PrefKeyEncryptionScheme r2 = androidx.security.crypto.EncryptedSharedPreferences.PrefKeyEncryptionScheme.AES256_SIV
            androidx.security.crypto.EncryptedSharedPreferences$PrefValueEncryptionScheme r3 = androidx.security.crypto.EncryptedSharedPreferences.PrefValueEncryptionScheme.AES256_GCM
            java.lang.String r4 = "myday_writer_secure_prefs"
            android.content.SharedPreferences r2 = androidx.security.crypto.EncryptedSharedPreferences.create(r0, r4, r1, r2, r3)
            r5.securePrefs = r2
            android.content.SharedPreferences r2 = r5.securePrefs
            return r2
    }

    @com.getcapacitor.PluginMethod
    public void get(com.getcapacitor.PluginCall r5) {
            r4 = this;
            java.lang.String r0 = "key"
            java.lang.String r1 = ""
            java.lang.String r0 = r5.getString(r0, r1)
            java.lang.String r0 = r0.trim()
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L18
            java.lang.String r1 = "key is required"
            r5.reject(r1)
            return
        L18:
            android.content.SharedPreferences r1 = r4.getSecurePrefs()     // Catch: java.lang.Exception -> L2f
            r2 = 0
            java.lang.String r1 = r1.getString(r0, r2)     // Catch: java.lang.Exception -> L2f
            com.getcapacitor.JSObject r2 = new com.getcapacitor.JSObject     // Catch: java.lang.Exception -> L2f
            r2.<init>()     // Catch: java.lang.Exception -> L2f
            java.lang.String r3 = "value"
            r2.put(r3, r1)     // Catch: java.lang.Exception -> L2f
            r5.resolve(r2)     // Catch: java.lang.Exception -> L2f
            goto L35
        L2f:
            r1 = move-exception
            java.lang.String r2 = "failed to get secure preference"
            r5.reject(r2, r1)
        L35:
            return
    }

    @com.getcapacitor.PluginMethod
    public void remove(com.getcapacitor.PluginCall r4) {
            r3 = this;
            java.lang.String r0 = "key"
            java.lang.String r1 = ""
            java.lang.String r0 = r4.getString(r0, r1)
            java.lang.String r0 = r0.trim()
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L18
            java.lang.String r1 = "key is required"
            r4.reject(r1)
            return
        L18:
            android.content.SharedPreferences r1 = r3.getSecurePrefs()     // Catch: java.lang.Exception -> L2b
            android.content.SharedPreferences$Editor r1 = r1.edit()     // Catch: java.lang.Exception -> L2b
            android.content.SharedPreferences$Editor r1 = r1.remove(r0)     // Catch: java.lang.Exception -> L2b
            r1.apply()     // Catch: java.lang.Exception -> L2b
            r4.resolve()     // Catch: java.lang.Exception -> L2b
            goto L31
        L2b:
            r1 = move-exception
            java.lang.String r2 = "failed to remove secure preference"
            r4.reject(r2, r1)
        L31:
            return
    }

    @com.getcapacitor.PluginMethod
    public void set(com.getcapacitor.PluginCall r5) {
            r4 = this;
            java.lang.String r0 = "key"
            java.lang.String r1 = ""
            java.lang.String r0 = r5.getString(r0, r1)
            java.lang.String r0 = r0.trim()
            java.lang.String r2 = "value"
            java.lang.String r1 = r5.getString(r2, r1)
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L1e
            java.lang.String r2 = "key is required"
            r5.reject(r2)
            return
        L1e:
            android.content.SharedPreferences r2 = r4.getSecurePrefs()     // Catch: java.lang.Exception -> L31
            android.content.SharedPreferences$Editor r2 = r2.edit()     // Catch: java.lang.Exception -> L31
            android.content.SharedPreferences$Editor r2 = r2.putString(r0, r1)     // Catch: java.lang.Exception -> L31
            r2.apply()     // Catch: java.lang.Exception -> L31
            r5.resolve()     // Catch: java.lang.Exception -> L31
            goto L37
        L31:
            r2 = move-exception
            java.lang.String r3 = "failed to set secure preference"
            r5.reject(r3, r2)
        L37:
            return
    }
}
