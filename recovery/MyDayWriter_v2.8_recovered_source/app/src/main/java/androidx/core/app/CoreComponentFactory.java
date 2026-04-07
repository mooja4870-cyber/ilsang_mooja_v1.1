package androidx.core.app;

/* JADX INFO: loaded from: classes.dex */
public class CoreComponentFactory extends android.app.AppComponentFactory {

    public interface CompatWrapped {
        java.lang.Object getWrapper();
    }

    public CoreComponentFactory() {
            r0 = this;
            r0.<init>()
            return
    }

    static <T> T checkCompatWrapper(T r1) {
            boolean r0 = r1 instanceof androidx.core.app.CoreComponentFactory.CompatWrapped
            if (r0 == 0) goto Le
            r0 = r1
            androidx.core.app.CoreComponentFactory$CompatWrapped r0 = (androidx.core.app.CoreComponentFactory.CompatWrapped) r0
            java.lang.Object r0 = r0.getWrapper()
            if (r0 == 0) goto Le
            return r0
        Le:
            return r1
    }

    @Override // android.app.AppComponentFactory
    public android.app.Activity instantiateActivity(java.lang.ClassLoader r2, java.lang.String r3, android.content.Intent r4) throws java.lang.InstantiationException, java.lang.IllegalAccessException, java.lang.ClassNotFoundException {
            r1 = this;
            android.app.Activity r0 = super.instantiateActivity(r2, r3, r4)
            java.lang.Object r0 = checkCompatWrapper(r0)
            android.app.Activity r0 = (android.app.Activity) r0
            return r0
    }

    @Override // android.app.AppComponentFactory
    public android.app.Application instantiateApplication(java.lang.ClassLoader r2, java.lang.String r3) throws java.lang.InstantiationException, java.lang.IllegalAccessException, java.lang.ClassNotFoundException {
            r1 = this;
            android.app.Application r0 = super.instantiateApplication(r2, r3)
            java.lang.Object r0 = checkCompatWrapper(r0)
            android.app.Application r0 = (android.app.Application) r0
            return r0
    }

    @Override // android.app.AppComponentFactory
    public android.content.ContentProvider instantiateProvider(java.lang.ClassLoader r2, java.lang.String r3) throws java.lang.InstantiationException, java.lang.IllegalAccessException, java.lang.ClassNotFoundException {
            r1 = this;
            android.content.ContentProvider r0 = super.instantiateProvider(r2, r3)
            java.lang.Object r0 = checkCompatWrapper(r0)
            android.content.ContentProvider r0 = (android.content.ContentProvider) r0
            return r0
    }

    @Override // android.app.AppComponentFactory
    public android.content.BroadcastReceiver instantiateReceiver(java.lang.ClassLoader r2, java.lang.String r3, android.content.Intent r4) throws java.lang.InstantiationException, java.lang.IllegalAccessException, java.lang.ClassNotFoundException {
            r1 = this;
            android.content.BroadcastReceiver r0 = super.instantiateReceiver(r2, r3, r4)
            java.lang.Object r0 = checkCompatWrapper(r0)
            android.content.BroadcastReceiver r0 = (android.content.BroadcastReceiver) r0
            return r0
    }

    @Override // android.app.AppComponentFactory
    public android.app.Service instantiateService(java.lang.ClassLoader r2, java.lang.String r3, android.content.Intent r4) throws java.lang.InstantiationException, java.lang.IllegalAccessException, java.lang.ClassNotFoundException {
            r1 = this;
            android.app.Service r0 = super.instantiateService(r2, r3, r4)
            java.lang.Object r0 = checkCompatWrapper(r0)
            android.app.Service r0 = (android.app.Service) r0
            return r0
    }
}
