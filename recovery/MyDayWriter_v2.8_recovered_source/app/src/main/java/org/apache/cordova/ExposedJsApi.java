package org.apache.cordova;

/* JADX INFO: loaded from: classes7.dex */
public interface ExposedJsApi {
    java.lang.String exec(int r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5) throws org.json.JSONException, java.lang.IllegalAccessException;

    java.lang.String retrieveJsMessages(int r1, boolean r2) throws java.lang.IllegalAccessException;

    void setNativeToJsBridgeMode(int r1, int r2) throws java.lang.IllegalAccessException;
}
