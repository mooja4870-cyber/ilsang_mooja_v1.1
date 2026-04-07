package androidx.core.content;

/* JADX INFO: loaded from: classes.dex */
class UnusedAppRestrictionsBackportServiceConnection implements android.content.ServiceConnection {
    private final android.content.Context mContext;
    private boolean mHasBoundService;
    androidx.concurrent.futures.ResolvableFuture<java.lang.Integer> mResultFuture;
    androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService mUnusedAppRestrictionsService;


    UnusedAppRestrictionsBackportServiceConnection(android.content.Context r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.mUnusedAppRestrictionsService = r0
            r0 = 0
            r1.mHasBoundService = r0
            r1.mContext = r2
            return
    }

    private androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback getBackportCallback() {
            r1 = this;
            androidx.core.content.UnusedAppRestrictionsBackportServiceConnection$1 r0 = new androidx.core.content.UnusedAppRestrictionsBackportServiceConnection$1
            r0.<init>(r1)
            return r0
    }

    public void connectAndFetchResult(androidx.concurrent.futures.ResolvableFuture<java.lang.Integer> r4) {
            r3 = this;
            boolean r0 = r3.mHasBoundService
            if (r0 != 0) goto L24
            r0 = 1
            r3.mHasBoundService = r0
            r3.mResultFuture = r4
            android.content.Intent r1 = new android.content.Intent
            java.lang.String r2 = "android.support.unusedapprestrictions.action.CustomUnusedAppRestrictionsBackportService"
            r1.<init>(r2)
            android.content.Context r2 = r3.mContext
            android.content.pm.PackageManager r2 = r2.getPackageManager()
            java.lang.String r2 = androidx.core.content.PackageManagerCompat.getPermissionRevocationVerifierApp(r2)
            android.content.Intent r1 = r1.setPackage(r2)
            android.content.Context r2 = r3.mContext
            r2.bindService(r1, r3, r0)
            return
        L24:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Each UnusedAppRestrictionsBackportServiceConnection can only be bound once."
            r0.<init>(r1)
            throw r0
    }

    public void disconnectFromService() {
            r2 = this;
            boolean r0 = r2.mHasBoundService
            if (r0 == 0) goto Ld
            r0 = 0
            r2.mHasBoundService = r0
            android.content.Context r0 = r2.mContext
            r0.unbindService(r2)
            return
        Ld:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "bindService must be called before unbind"
            r0.<init>(r1)
            throw r0
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(android.content.ComponentName r4, android.os.IBinder r5) {
            r3 = this;
            androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService r0 = androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService.Stub.asInterface(r5)
            r3.mUnusedAppRestrictionsService = r0
            androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService r0 = r3.mUnusedAppRestrictionsService     // Catch: android.os.RemoteException -> L11
            androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback r1 = r3.getBackportCallback()     // Catch: android.os.RemoteException -> L11
            r0.isPermissionRevocationEnabledForApp(r1)     // Catch: android.os.RemoteException -> L11
            goto L1c
        L11:
            r0 = move-exception
            androidx.concurrent.futures.ResolvableFuture<java.lang.Integer> r1 = r3.mResultFuture
            r2 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1.set(r2)
        L1c:
            return
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(android.content.ComponentName r2) {
            r1 = this;
            r0 = 0
            r1.mUnusedAppRestrictionsService = r0
            return
    }
}
