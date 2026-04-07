package com.mooja.autopost;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.security.crypto.EncryptedSharedPreferences;
import androidx.security.crypto.MasterKey;
import com.getcapacitor.JSObject;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;

/* JADX INFO: loaded from: classes6.dex */
@CapacitorPlugin(name = "SecurePrefs")
public class SecurePrefsPlugin extends Plugin {
    private static final String PREF_NAME = "myday_writer_secure_prefs";
    private SharedPreferences securePrefs;

    private SharedPreferences getSecurePrefs() throws Exception {
        if (this.securePrefs != null) {
            return this.securePrefs;
        }
        Context context = getContext();
        MasterKey masterKey = new MasterKey.Builder(context).setKeyScheme(MasterKey.KeyScheme.AES256_GCM).build();
        this.securePrefs = EncryptedSharedPreferences.create(context, PREF_NAME, masterKey, EncryptedSharedPreferences.PrefKeyEncryptionScheme.AES256_SIV, EncryptedSharedPreferences.PrefValueEncryptionScheme.AES256_GCM);
        return this.securePrefs;
    }

    @PluginMethod
    public void set(PluginCall call) {
        String key = call.getString("key", "").trim();
        String value = call.getString("value", "");
        if (key.isEmpty()) {
            call.reject("key is required");
            return;
        }
        try {
            getSecurePrefs().edit().putString(key, value).apply();
            call.resolve();
        } catch (Exception ex) {
            call.reject("failed to set secure preference", ex);
        }
    }

    @PluginMethod
    public void get(PluginCall call) {
        String key = call.getString("key", "").trim();
        if (key.isEmpty()) {
            call.reject("key is required");
            return;
        }
        try {
            String value = getSecurePrefs().getString(key, null);
            JSObject result = new JSObject();
            result.put("value", value);
            call.resolve(result);
        } catch (Exception ex) {
            call.reject("failed to get secure preference", ex);
        }
    }

    @PluginMethod
    public void remove(PluginCall call) {
        String key = call.getString("key", "").trim();
        if (key.isEmpty()) {
            call.reject("key is required");
            return;
        }
        try {
            getSecurePrefs().edit().remove(key).apply();
            call.resolve();
        } catch (Exception ex) {
            call.reject("failed to remove secure preference", ex);
        }
    }
}
