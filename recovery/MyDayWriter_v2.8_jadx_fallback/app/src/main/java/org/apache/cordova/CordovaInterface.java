package org.apache.cordova;

/* JADX INFO: loaded from: classes7.dex */
public interface CordovaInterface {
    androidx.appcompat.app.AppCompatActivity getActivity();

    android.content.Context getContext();

    java.util.concurrent.ExecutorService getThreadPool();

    boolean hasPermission(java.lang.String r1);

    java.lang.Object onMessage(java.lang.String r1, java.lang.Object r2);

    void requestPermission(org.apache.cordova.CordovaPlugin r1, int r2, java.lang.String r3);

    void requestPermissions(org.apache.cordova.CordovaPlugin r1, int r2, java.lang.String[] r3);

    void setActivityResultCallback(org.apache.cordova.CordovaPlugin r1);

    void startActivityForResult(org.apache.cordova.CordovaPlugin r1, android.content.Intent r2, int r3);
}
