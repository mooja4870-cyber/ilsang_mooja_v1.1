package androidx.webkit.internal;

/* JADX INFO: loaded from: classes.dex */
public class ApiHelperForM {




    private ApiHelperForM() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void close(android.webkit.WebMessagePort r0) {
            r0.close()
            return
    }

    public static android.webkit.WebMessage createWebMessage(androidx.webkit.WebMessageCompat r3) {
            android.webkit.WebMessage r0 = new android.webkit.WebMessage
            java.lang.String r1 = r3.getData()
            androidx.webkit.WebMessagePortCompat[] r2 = r3.getPorts()
            android.webkit.WebMessagePort[] r2 = androidx.webkit.internal.WebMessagePortImpl.compatToPorts(r2)
            r0.<init>(r1, r2)
            return r0
    }

    public static android.webkit.WebMessagePort[] createWebMessageChannel(android.webkit.WebView r1) {
            android.webkit.WebMessagePort[] r0 = r1.createWebMessageChannel()
            return r0
    }

    public static androidx.webkit.WebMessageCompat createWebMessageCompat(android.webkit.WebMessage r3) {
            androidx.webkit.WebMessageCompat r0 = new androidx.webkit.WebMessageCompat
            java.lang.String r1 = r3.getData()
            android.webkit.WebMessagePort[] r2 = r3.getPorts()
            androidx.webkit.WebMessagePortCompat[] r2 = androidx.webkit.internal.WebMessagePortImpl.portsToCompat(r2)
            r0.<init>(r1, r2)
            return r0
    }

    public static java.lang.CharSequence getDescription(android.webkit.WebResourceError r1) {
            java.lang.CharSequence r0 = r1.getDescription()
            return r0
    }

    public static int getErrorCode(android.webkit.WebResourceError r1) {
            int r0 = r1.getErrorCode()
            return r0
    }

    public static boolean getOffscreenPreRaster(android.webkit.WebSettings r1) {
            boolean r0 = r1.getOffscreenPreRaster()
            return r0
    }

    public static void postMessage(android.webkit.WebMessagePort r0, android.webkit.WebMessage r1) {
            r0.postMessage(r1)
            return
    }

    public static void postVisualStateCallback(android.webkit.WebView r1, long r2, androidx.webkit.WebViewCompat.VisualStateCallback r4) {
            androidx.webkit.internal.ApiHelperForM$3 r0 = new androidx.webkit.internal.ApiHelperForM$3
            r0.<init>(r4)
            r1.postVisualStateCallback(r2, r0)
            return
    }

    public static void postWebMessage(android.webkit.WebView r0, android.webkit.WebMessage r1, android.net.Uri r2) {
            r0.postWebMessage(r1, r2)
            return
    }

    public static void setOffscreenPreRaster(android.webkit.WebSettings r0, boolean r1) {
            r0.setOffscreenPreRaster(r1)
            return
    }

    public static void setWebMessageCallback(android.webkit.WebMessagePort r1, androidx.webkit.WebMessagePortCompat.WebMessageCallbackCompat r2) {
            androidx.webkit.internal.ApiHelperForM$1 r0 = new androidx.webkit.internal.ApiHelperForM$1
            r0.<init>(r2)
            r1.setWebMessageCallback(r0)
            return
    }

    public static void setWebMessageCallback(android.webkit.WebMessagePort r1, androidx.webkit.WebMessagePortCompat.WebMessageCallbackCompat r2, android.os.Handler r3) {
            androidx.webkit.internal.ApiHelperForM$2 r0 = new androidx.webkit.internal.ApiHelperForM$2
            r0.<init>(r2)
            r1.setWebMessageCallback(r0, r3)
            return
    }
}
