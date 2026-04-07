package org.apache.cordova;

/* JADX INFO: loaded from: classes7.dex */
public class CordovaDialogsHelper {
    private final android.content.Context context;
    private android.app.AlertDialog lastHandledDialog;










    public interface Result {
        void gotResult(boolean r1, java.lang.String r2);
    }

    public CordovaDialogsHelper(android.content.Context r1) {
            r0 = this;
            r0.<init>()
            r0.context = r1
            return
    }

    public void destroyLastDialog() {
            r1 = this;
            android.app.AlertDialog r0 = r1.lastHandledDialog
            if (r0 == 0) goto L9
            android.app.AlertDialog r0 = r1.lastHandledDialog
            r0.cancel()
        L9:
            return
    }

    public void showAlert(java.lang.String r4, org.apache.cordova.CordovaDialogsHelper.Result r5) {
            r3 = this;
            android.app.AlertDialog$Builder r0 = new android.app.AlertDialog$Builder
            android.content.Context r1 = r3.context
            r0.<init>(r1)
            r0.setMessage(r4)
            java.lang.String r1 = "Alert"
            r0.setTitle(r1)
            r1 = 1
            r0.setCancelable(r1)
            org.apache.cordova.CordovaDialogsHelper$1 r1 = new org.apache.cordova.CordovaDialogsHelper$1
            r1.<init>(r3, r5)
            r2 = 17039370(0x104000a, float:2.42446E-38)
            r0.setPositiveButton(r2, r1)
            org.apache.cordova.CordovaDialogsHelper$2 r1 = new org.apache.cordova.CordovaDialogsHelper$2
            r1.<init>(r3, r5)
            r0.setOnCancelListener(r1)
            org.apache.cordova.CordovaDialogsHelper$3 r1 = new org.apache.cordova.CordovaDialogsHelper$3
            r1.<init>(r3, r5)
            r0.setOnKeyListener(r1)
            android.app.AlertDialog r1 = r0.show()
            r3.lastHandledDialog = r1
            return
    }

    public void showConfirm(java.lang.String r4, org.apache.cordova.CordovaDialogsHelper.Result r5) {
            r3 = this;
            android.app.AlertDialog$Builder r0 = new android.app.AlertDialog$Builder
            android.content.Context r1 = r3.context
            r0.<init>(r1)
            r0.setMessage(r4)
            java.lang.String r1 = "Confirm"
            r0.setTitle(r1)
            r1 = 1
            r0.setCancelable(r1)
            org.apache.cordova.CordovaDialogsHelper$4 r1 = new org.apache.cordova.CordovaDialogsHelper$4
            r1.<init>(r3, r5)
            r2 = 17039370(0x104000a, float:2.42446E-38)
            r0.setPositiveButton(r2, r1)
            org.apache.cordova.CordovaDialogsHelper$5 r1 = new org.apache.cordova.CordovaDialogsHelper$5
            r1.<init>(r3, r5)
            r2 = 17039360(0x1040000, float:2.424457E-38)
            r0.setNegativeButton(r2, r1)
            org.apache.cordova.CordovaDialogsHelper$6 r1 = new org.apache.cordova.CordovaDialogsHelper$6
            r1.<init>(r3, r5)
            r0.setOnCancelListener(r1)
            org.apache.cordova.CordovaDialogsHelper$7 r1 = new org.apache.cordova.CordovaDialogsHelper$7
            r1.<init>(r3, r5)
            r0.setOnKeyListener(r1)
            android.app.AlertDialog r1 = r0.show()
            r3.lastHandledDialog = r1
            return
    }

    public void showPrompt(java.lang.String r5, java.lang.String r6, org.apache.cordova.CordovaDialogsHelper.Result r7) {
            r4 = this;
            android.app.AlertDialog$Builder r0 = new android.app.AlertDialog$Builder
            android.content.Context r1 = r4.context
            r0.<init>(r1)
            r0.setMessage(r5)
            android.widget.EditText r1 = new android.widget.EditText
            android.content.Context r2 = r4.context
            r1.<init>(r2)
            if (r6 == 0) goto L16
            r1.setText(r6)
        L16:
            r0.setView(r1)
            r2 = 0
            r0.setCancelable(r2)
            org.apache.cordova.CordovaDialogsHelper$8 r2 = new org.apache.cordova.CordovaDialogsHelper$8
            r2.<init>(r4, r1, r7)
            r3 = 17039370(0x104000a, float:2.42446E-38)
            r0.setPositiveButton(r3, r2)
            org.apache.cordova.CordovaDialogsHelper$9 r2 = new org.apache.cordova.CordovaDialogsHelper$9
            r2.<init>(r4, r7)
            r3 = 17039360(0x1040000, float:2.424457E-38)
            r0.setNegativeButton(r3, r2)
            android.app.AlertDialog r2 = r0.show()
            r4.lastHandledDialog = r2
            return
    }
}
