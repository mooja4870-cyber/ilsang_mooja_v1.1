package androidx.webkit.internal;

/* JADX INFO: loaded from: classes.dex */
public class ApiHelperForP {
    private ApiHelperForP() {
            r0 = this;
            r0.<init>()
            return
    }

    public static android.webkit.TracingController getTracingControllerInstance() {
            android.webkit.TracingController r0 = android.webkit.TracingController.getInstance()
            return r0
    }

    public static java.lang.ClassLoader getWebViewClassLoader() {
            java.lang.ClassLoader r0 = android.webkit.WebView.getWebViewClassLoader()
            return r0
    }

    public static android.os.Looper getWebViewLooper(android.webkit.WebView r1) {
            android.os.Looper r0 = r1.getWebViewLooper()
            return r0
    }

    public static boolean isTracing(android.webkit.TracingController r1) {
            boolean r0 = r1.isTracing()
            return r0
    }

    public static void setDataDirectorySuffix(java.lang.String r0) {
            android.webkit.WebView.setDataDirectorySuffix(r0)
            return
    }

    public static void start(android.webkit.TracingController r2, androidx.webkit.TracingConfig r3) {
            android.webkit.TracingConfig$Builder r0 = new android.webkit.TracingConfig$Builder
            r0.<init>()
            int r1 = r3.getPredefinedCategories()
            int[] r1 = new int[]{r1}
            android.webkit.TracingConfig$Builder r0 = r0.addCategories(r1)
            java.util.List r1 = r3.getCustomIncludedCategories()
            android.webkit.TracingConfig$Builder r0 = r0.addCategories(r1)
            int r1 = r3.getTracingMode()
            android.webkit.TracingConfig$Builder r0 = r0.setTracingMode(r1)
            android.webkit.TracingConfig r0 = r0.build()
            r2.start(r0)
            return
    }

    public static boolean stop(android.webkit.TracingController r1, java.io.OutputStream r2, java.util.concurrent.Executor r3) {
            boolean r0 = r1.stop(r2, r3)
            return r0
    }
}
