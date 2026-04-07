package androidx.webkit;

/* JADX INFO: loaded from: classes.dex */
public abstract class ServiceWorkerControllerCompat {

    private static class LAZY_HOLDER {
        static final androidx.webkit.ServiceWorkerControllerCompat INSTANCE = null;

        static {
                androidx.webkit.internal.ServiceWorkerControllerImpl r0 = new androidx.webkit.internal.ServiceWorkerControllerImpl
                r0.<init>()
                androidx.webkit.ServiceWorkerControllerCompat.LAZY_HOLDER.INSTANCE = r0
                return
        }

        private LAZY_HOLDER() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    public ServiceWorkerControllerCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static androidx.webkit.ServiceWorkerControllerCompat getInstance() {
            androidx.webkit.ServiceWorkerControllerCompat r0 = androidx.webkit.ServiceWorkerControllerCompat.LAZY_HOLDER.INSTANCE
            return r0
    }

    public abstract androidx.webkit.ServiceWorkerWebSettingsCompat getServiceWorkerWebSettings();

    public abstract void setServiceWorkerClient(androidx.webkit.ServiceWorkerClientCompat r1);
}
