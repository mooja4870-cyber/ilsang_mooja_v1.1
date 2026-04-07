package androidx.webkit.internal;

/* JADX INFO: loaded from: classes.dex */
public class ApiHelperForN {
    private ApiHelperForN() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean getAllowContentAccess(android.webkit.ServiceWorkerWebSettings r1) {
            boolean r0 = r1.getAllowContentAccess()
            return r0
    }

    public static boolean getAllowFileAccess(android.webkit.ServiceWorkerWebSettings r1) {
            boolean r0 = r1.getAllowFileAccess()
            return r0
    }

    public static boolean getBlockNetworkLoads(android.webkit.ServiceWorkerWebSettings r1) {
            boolean r0 = r1.getBlockNetworkLoads()
            return r0
    }

    public static int getCacheMode(android.webkit.ServiceWorkerWebSettings r1) {
            int r0 = r1.getCacheMode()
            return r0
    }

    public static java.io.File getDataDir(android.content.Context r1) {
            java.io.File r0 = r1.getDataDir()
            return r0
    }

    public static int getDisabledActionModeMenuItems(android.webkit.WebSettings r1) {
            int r0 = r1.getDisabledActionModeMenuItems()
            return r0
    }

    public static android.webkit.ServiceWorkerController getServiceWorkerControllerInstance() {
            android.webkit.ServiceWorkerController r0 = android.webkit.ServiceWorkerController.getInstance()
            return r0
    }

    public static android.webkit.ServiceWorkerWebSettings getServiceWorkerWebSettings(android.webkit.ServiceWorkerController r1) {
            android.webkit.ServiceWorkerWebSettings r0 = r1.getServiceWorkerWebSettings()
            return r0
    }

    public static androidx.webkit.internal.ServiceWorkerWebSettingsImpl getServiceWorkerWebSettingsImpl(android.webkit.ServiceWorkerController r2) {
            androidx.webkit.internal.ServiceWorkerWebSettingsImpl r0 = new androidx.webkit.internal.ServiceWorkerWebSettingsImpl
            android.webkit.ServiceWorkerWebSettings r1 = getServiceWorkerWebSettings(r2)
            r0.<init>(r1)
            return r0
    }

    public static boolean isRedirect(android.webkit.WebResourceRequest r1) {
            boolean r0 = r1.isRedirect()
            return r0
    }

    public static void setAllowContentAccess(android.webkit.ServiceWorkerWebSettings r0, boolean r1) {
            r0.setAllowContentAccess(r1)
            return
    }

    public static void setAllowFileAccess(android.webkit.ServiceWorkerWebSettings r0, boolean r1) {
            r0.setAllowFileAccess(r1)
            return
    }

    public static void setBlockNetworkLoads(android.webkit.ServiceWorkerWebSettings r0, boolean r1) {
            r0.setBlockNetworkLoads(r1)
            return
    }

    public static void setCacheMode(android.webkit.ServiceWorkerWebSettings r0, int r1) {
            r0.setCacheMode(r1)
            return
    }

    public static void setDisabledActionModeMenuItems(android.webkit.WebSettings r0, int r1) {
            r0.setDisabledActionModeMenuItems(r1)
            return
    }

    public static void setServiceWorkerClient(android.webkit.ServiceWorkerController r0, android.webkit.ServiceWorkerClient r1) {
            r0.setServiceWorkerClient(r1)
            return
    }

    public static void setServiceWorkerClientCompat(android.webkit.ServiceWorkerController r1, androidx.webkit.ServiceWorkerClientCompat r2) {
            androidx.webkit.internal.FrameworkServiceWorkerClient r0 = new androidx.webkit.internal.FrameworkServiceWorkerClient
            r0.<init>(r2)
            r1.setServiceWorkerClient(r0)
            return
    }
}
