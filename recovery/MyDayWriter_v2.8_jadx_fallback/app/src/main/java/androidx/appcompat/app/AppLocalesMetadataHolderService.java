package androidx.appcompat.app;

/* JADX INFO: loaded from: classes.dex */
public final class AppLocalesMetadataHolderService extends android.app.Service {

    private static class Api24Impl {
        private Api24Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static int getDisabledComponentFlag() {
                r0 = 512(0x200, float:7.17E-43)
                return r0
        }
    }

    public AppLocalesMetadataHolderService() {
            r0 = this;
            r0.<init>()
            return
    }

    public static android.content.pm.ServiceInfo getServiceInfo(android.content.Context r4) throws android.content.pm.PackageManager.NameNotFoundException {
            r0 = 128(0x80, float:1.8E-43)
            int r1 = androidx.appcompat.app.AppLocalesMetadataHolderService.Api24Impl.getDisabledComponentFlag()
            r0 = r0 | r1
            android.content.pm.PackageManager r1 = r4.getPackageManager()
            android.content.ComponentName r2 = new android.content.ComponentName
            java.lang.Class<androidx.appcompat.app.AppLocalesMetadataHolderService> r3 = androidx.appcompat.app.AppLocalesMetadataHolderService.class
            r2.<init>(r4, r3)
            android.content.pm.ServiceInfo r1 = r1.getServiceInfo(r2, r0)
            return r1
    }

    @Override // android.app.Service
    public android.os.IBinder onBind(android.content.Intent r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }
}
