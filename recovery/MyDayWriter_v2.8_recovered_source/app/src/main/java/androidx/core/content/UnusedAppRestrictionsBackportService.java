package androidx.core.content;

/* JADX INFO: loaded from: classes.dex */
public abstract class UnusedAppRestrictionsBackportService extends android.app.Service {
    public static final java.lang.String ACTION_UNUSED_APP_RESTRICTIONS_BACKPORT_CONNECTION = "android.support.unusedapprestrictions.action.CustomUnusedAppRestrictionsBackportService";
    private androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService.Stub mBinder;


    public UnusedAppRestrictionsBackportService() {
            r1 = this;
            r1.<init>()
            androidx.core.content.UnusedAppRestrictionsBackportService$1 r0 = new androidx.core.content.UnusedAppRestrictionsBackportService$1
            r0.<init>(r1)
            r1.mBinder = r0
            return
    }

    protected abstract void isPermissionRevocationEnabled(androidx.core.content.UnusedAppRestrictionsBackportCallback r1);

    @Override // android.app.Service
    public android.os.IBinder onBind(android.content.Intent r2) {
            r1 = this;
            androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService$Stub r0 = r1.mBinder
            return r0
    }
}
