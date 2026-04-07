package org.apache.cordova;

/* JADX INFO: loaded from: classes7.dex */
public class CordovaInterfaceImpl implements org.apache.cordova.CordovaInterface {
    private static final java.lang.String TAG = "CordovaInterfaceImpl";
    protected androidx.appcompat.app.AppCompatActivity activity;
    protected org.apache.cordova.CordovaPlugin activityResultCallback;
    protected int activityResultRequestCode;
    protected boolean activityWasDestroyed;
    protected java.lang.String initCallbackService;
    protected org.apache.cordova.CallbackMap permissionResultCallbacks;
    protected org.apache.cordova.PluginManager pluginManager;
    protected android.os.Bundle savedPluginState;
    protected org.apache.cordova.CordovaInterfaceImpl.ActivityResultHolder savedResult;
    protected java.util.concurrent.ExecutorService threadPool;

    private static class ActivityResultHolder {
        private android.content.Intent intent;
        private int requestCode;
        private int resultCode;

        /* JADX INFO: renamed from: -$$Nest$fgetintent, reason: not valid java name */
        static /* bridge */ /* synthetic */ android.content.Intent m1728$$Nest$fgetintent(org.apache.cordova.CordovaInterfaceImpl.ActivityResultHolder r0) {
                android.content.Intent r0 = r0.intent
                return r0
        }

        /* JADX INFO: renamed from: -$$Nest$fgetrequestCode, reason: not valid java name */
        static /* bridge */ /* synthetic */ int m1729$$Nest$fgetrequestCode(org.apache.cordova.CordovaInterfaceImpl.ActivityResultHolder r0) {
                int r0 = r0.requestCode
                return r0
        }

        /* JADX INFO: renamed from: -$$Nest$fgetresultCode, reason: not valid java name */
        static /* bridge */ /* synthetic */ int m1730$$Nest$fgetresultCode(org.apache.cordova.CordovaInterfaceImpl.ActivityResultHolder r0) {
                int r0 = r0.resultCode
                return r0
        }

        public ActivityResultHolder(int r1, int r2, android.content.Intent r3) {
                r0 = this;
                r0.<init>()
                r0.requestCode = r1
                r0.resultCode = r2
                r0.intent = r3
                return
        }
    }

    public CordovaInterfaceImpl(androidx.appcompat.app.AppCompatActivity r2) {
            r1 = this;
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.newCachedThreadPool()
            r1.<init>(r2, r0)
            return
    }

    public CordovaInterfaceImpl(androidx.appcompat.app.AppCompatActivity r2, java.util.concurrent.ExecutorService r3) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.activityWasDestroyed = r0
            r1.activity = r2
            r1.threadPool = r3
            org.apache.cordova.CallbackMap r0 = new org.apache.cordova.CallbackMap
            r0.<init>()
            r1.permissionResultCallbacks = r0
            return
    }

    @Override // org.apache.cordova.CordovaInterface
    public androidx.appcompat.app.AppCompatActivity getActivity() {
            r1 = this;
            androidx.appcompat.app.AppCompatActivity r0 = r1.activity
            return r0
    }

    @Override // org.apache.cordova.CordovaInterface
    public android.content.Context getContext() {
            r1 = this;
            androidx.appcompat.app.AppCompatActivity r0 = r1.activity
            return r0
    }

    @Override // org.apache.cordova.CordovaInterface
    public java.util.concurrent.ExecutorService getThreadPool() {
            r1 = this;
            java.util.concurrent.ExecutorService r0 = r1.threadPool
            return r0
    }

    @Override // org.apache.cordova.CordovaInterface
    public boolean hasPermission(java.lang.String r2) {
            r1 = this;
            androidx.appcompat.app.AppCompatActivity r0 = r1.activity
            int r0 = r0.checkSelfPermission(r2)
            if (r0 != 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            return r0
    }

    public boolean onActivityResult(int r6, int r7, android.content.Intent r8) {
            r5 = this;
            org.apache.cordova.CordovaPlugin r0 = r5.activityResultCallback
            if (r0 != 0) goto L35
            java.lang.String r1 = r5.initCallbackService
            if (r1 == 0) goto L35
            org.apache.cordova.CordovaInterfaceImpl$ActivityResultHolder r1 = new org.apache.cordova.CordovaInterfaceImpl$ActivityResultHolder
            r1.<init>(r6, r7, r8)
            r5.savedResult = r1
            org.apache.cordova.PluginManager r1 = r5.pluginManager
            if (r1 == 0) goto L35
            org.apache.cordova.PluginManager r1 = r5.pluginManager
            java.lang.String r2 = r5.initCallbackService
            org.apache.cordova.CordovaPlugin r0 = r1.getPlugin(r2)
            if (r0 == 0) goto L35
            android.os.Bundle r1 = r5.savedPluginState
            java.lang.String r2 = r0.getServiceName()
            android.os.Bundle r1 = r1.getBundle(r2)
            org.apache.cordova.ResumeCallback r2 = new org.apache.cordova.ResumeCallback
            java.lang.String r3 = r0.getServiceName()
            org.apache.cordova.PluginManager r4 = r5.pluginManager
            r2.<init>(r3, r4)
            r0.onRestoreStateForActivityResult(r1, r2)
        L35:
            r1 = 0
            r5.activityResultCallback = r1
            java.lang.String r2 = "CordovaInterfaceImpl"
            if (r0 == 0) goto L4a
            java.lang.String r3 = "Sending activity result to plugin"
            org.apache.cordova.LOG.d(r2, r3)
            r5.initCallbackService = r1
            r5.savedResult = r1
            r0.onActivityResult(r6, r7, r8)
            r1 = 1
            return r1
        L4a:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Got an activity result, but no plugin was registered to receive it"
            java.lang.StringBuilder r1 = r1.append(r3)
            org.apache.cordova.CordovaInterfaceImpl$ActivityResultHolder r3 = r5.savedResult
            if (r3 == 0) goto L5c
            java.lang.String r3 = " yet!"
            goto L5e
        L5c:
            java.lang.String r3 = "."
        L5e:
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r1 = r1.toString()
            org.apache.cordova.LOG.w(r2, r1)
            r1 = 0
            return r1
    }

    public void onCordovaInit(org.apache.cordova.PluginManager r6) {
            r5 = this;
            r5.pluginManager = r6
            org.apache.cordova.CordovaInterfaceImpl$ActivityResultHolder r0 = r5.savedResult
            if (r0 == 0) goto L1c
            org.apache.cordova.CordovaInterfaceImpl$ActivityResultHolder r0 = r5.savedResult
            int r0 = org.apache.cordova.CordovaInterfaceImpl.ActivityResultHolder.m1729$$Nest$fgetrequestCode(r0)
            org.apache.cordova.CordovaInterfaceImpl$ActivityResultHolder r1 = r5.savedResult
            int r1 = org.apache.cordova.CordovaInterfaceImpl.ActivityResultHolder.m1730$$Nest$fgetresultCode(r1)
            org.apache.cordova.CordovaInterfaceImpl$ActivityResultHolder r2 = r5.savedResult
            android.content.Intent r2 = org.apache.cordova.CordovaInterfaceImpl.ActivityResultHolder.m1728$$Nest$fgetintent(r2)
            r5.onActivityResult(r0, r1, r2)
            goto L4e
        L1c:
            boolean r0 = r5.activityWasDestroyed
            if (r0 == 0) goto L4e
            r0 = 0
            r5.activityWasDestroyed = r0
            if (r6 == 0) goto L4e
            java.lang.String r0 = "CoreAndroid"
            org.apache.cordova.CordovaPlugin r0 = r6.getPlugin(r0)
            org.apache.cordova.CoreAndroid r0 = (org.apache.cordova.CoreAndroid) r0
            if (r0 == 0) goto L4e
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            java.lang.String r2 = "action"
            java.lang.String r3 = "resume"
            r1.put(r2, r3)     // Catch: org.json.JSONException -> L3c
            goto L44
        L3c:
            r2 = move-exception
            java.lang.String r3 = "CordovaInterfaceImpl"
            java.lang.String r4 = "Failed to create event message"
            org.apache.cordova.LOG.e(r3, r4, r2)
        L44:
            org.apache.cordova.PluginResult r2 = new org.apache.cordova.PluginResult
            org.apache.cordova.PluginResult$Status r3 = org.apache.cordova.PluginResult.Status.OK
            r2.<init>(r3, r1)
            r0.sendResumeEvent(r2)
        L4e:
            return
    }

    @Override // org.apache.cordova.CordovaInterface
    public java.lang.Object onMessage(java.lang.String r2, java.lang.Object r3) {
            r1 = this;
            java.lang.String r0 = "exit"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto Ld
            androidx.appcompat.app.AppCompatActivity r0 = r1.activity
            r0.finish()
        Ld:
            r0 = 0
            return r0
    }

    public void onRequestPermissionResult(int r4, java.lang.String[] r5, int[] r6) throws org.json.JSONException {
            r3 = this;
            org.apache.cordova.CallbackMap r0 = r3.permissionResultCallbacks
            android.util.Pair r0 = r0.getAndRemoveCallback(r4)
            if (r0 == 0) goto L17
            java.lang.Object r1 = r0.first
            org.apache.cordova.CordovaPlugin r1 = (org.apache.cordova.CordovaPlugin) r1
            java.lang.Object r2 = r0.second
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.onRequestPermissionResult(r2, r5, r6)
        L17:
            return
    }

    public void onSaveInstanceState(android.os.Bundle r3) {
            r2 = this;
            org.apache.cordova.CordovaPlugin r0 = r2.activityResultCallback
            if (r0 == 0) goto Lf
            org.apache.cordova.CordovaPlugin r0 = r2.activityResultCallback
            java.lang.String r0 = r0.getServiceName()
            java.lang.String r1 = "callbackService"
            r3.putString(r1, r0)
        Lf:
            org.apache.cordova.PluginManager r0 = r2.pluginManager
            if (r0 == 0) goto L1e
            org.apache.cordova.PluginManager r0 = r2.pluginManager
            android.os.Bundle r0 = r0.onSaveInstanceState()
            java.lang.String r1 = "plugin"
            r3.putBundle(r1, r0)
        L1e:
            return
    }

    @Override // org.apache.cordova.CordovaInterface
    public void requestPermission(org.apache.cordova.CordovaPlugin r3, int r4, java.lang.String r5) {
            r2 = this;
            r0 = 1
            java.lang.String[] r0 = new java.lang.String[r0]
            r1 = 0
            r0[r1] = r5
            r2.requestPermissions(r3, r4, r0)
            return
    }

    @Override // org.apache.cordova.CordovaInterface
    public void requestPermissions(org.apache.cordova.CordovaPlugin r3, int r4, java.lang.String[] r5) {
            r2 = this;
            org.apache.cordova.CallbackMap r0 = r2.permissionResultCallbacks
            int r0 = r0.registerCallback(r3, r4)
            androidx.appcompat.app.AppCompatActivity r1 = r2.getActivity()
            r1.requestPermissions(r5, r0)
            return
    }

    public void restoreInstanceState(android.os.Bundle r2) {
            r1 = this;
            java.lang.String r0 = "callbackService"
            java.lang.String r0 = r2.getString(r0)
            r1.initCallbackService = r0
            java.lang.String r0 = "plugin"
            android.os.Bundle r0 = r2.getBundle(r0)
            r1.savedPluginState = r0
            r0 = 1
            r1.activityWasDestroyed = r0
            return
    }

    @Override // org.apache.cordova.CordovaInterface
    public void setActivityResultCallback(org.apache.cordova.CordovaPlugin r5) {
            r4 = this;
            org.apache.cordova.CordovaPlugin r0 = r4.activityResultCallback
            if (r0 == 0) goto Ld
            org.apache.cordova.CordovaPlugin r0 = r4.activityResultCallback
            int r1 = r4.activityResultRequestCode
            r2 = 0
            r3 = 0
            r0.onActivityResult(r1, r2, r3)
        Ld:
            r4.activityResultCallback = r5
            return
    }

    public void setActivityResultRequestCode(int r1) {
            r0 = this;
            r0.activityResultRequestCode = r1
            return
    }

    @Override // org.apache.cordova.CordovaInterface
    public void startActivityForResult(org.apache.cordova.CordovaPlugin r3, android.content.Intent r4, int r5) {
            r2 = this;
            r2.setActivityResultCallback(r3)
            androidx.appcompat.app.AppCompatActivity r0 = r2.activity     // Catch: java.lang.RuntimeException -> La
            r0.startActivityForResult(r4, r5)     // Catch: java.lang.RuntimeException -> La
            return
        La:
            r0 = move-exception
            r1 = 0
            r2.activityResultCallback = r1
            throw r0
    }
}
