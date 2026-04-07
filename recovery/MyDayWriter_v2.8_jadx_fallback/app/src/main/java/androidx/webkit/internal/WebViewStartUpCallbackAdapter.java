package androidx.webkit.internal;

/* JADX INFO: loaded from: classes.dex */
public class WebViewStartUpCallbackAdapter implements org.chromium.support_lib_boundary.WebViewStartUpCallbackBoundaryInterface {
    private final androidx.webkit.WebViewCompat.WebViewStartUpCallback mWebViewStartUpCallback;


    private static class BlockingStartUpLocationImpl implements androidx.webkit.BlockingStartUpLocation {
        private final java.lang.Throwable mThrowable;

        BlockingStartUpLocationImpl(java.lang.Throwable r1) {
                r0 = this;
                r0.<init>()
                r0.mThrowable = r1
                return
        }

        @Override // androidx.webkit.BlockingStartUpLocation
        public java.lang.String getStackInformation() {
                r3 = this;
                java.io.StringWriter r0 = new java.io.StringWriter
                r0.<init>()
                java.lang.Throwable r1 = r3.mThrowable
                java.io.PrintWriter r2 = new java.io.PrintWriter
                r2.<init>(r0)
                r1.printStackTrace(r2)
                java.lang.String r1 = r0.toString()
                return r1
        }
    }

    public WebViewStartUpCallbackAdapter(androidx.webkit.WebViewCompat.WebViewStartUpCallback r1) {
            r0 = this;
            r0.<init>()
            r0.mWebViewStartUpCallback = r1
            return
    }

    private androidx.webkit.WebViewStartUpResult webViewStartUpResultFromBoundaryInterface(org.chromium.support_lib_boundary.WebViewStartUpResultBoundaryInterface r2) {
            r1 = this;
            androidx.webkit.internal.WebViewStartUpCallbackAdapter$1 r0 = new androidx.webkit.internal.WebViewStartUpCallbackAdapter$1
            r0.<init>(r1, r2)
            return r0
    }

    @Override // org.chromium.support_lib_boundary.WebViewStartUpCallbackBoundaryInterface
    public void onSuccess(java.lang.reflect.InvocationHandler r3) {
            r2 = this;
            java.lang.Class<org.chromium.support_lib_boundary.WebViewStartUpResultBoundaryInterface> r0 = org.chromium.support_lib_boundary.WebViewStartUpResultBoundaryInterface.class
            java.lang.Object r0 = org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.castToSuppLibClass(r0, r3)
            org.chromium.support_lib_boundary.WebViewStartUpResultBoundaryInterface r0 = (org.chromium.support_lib_boundary.WebViewStartUpResultBoundaryInterface) r0
            java.lang.Object r0 = java.util.Objects.requireNonNull(r0)
            org.chromium.support_lib_boundary.WebViewStartUpResultBoundaryInterface r0 = (org.chromium.support_lib_boundary.WebViewStartUpResultBoundaryInterface) r0
            androidx.webkit.WebViewStartUpResult r0 = r2.webViewStartUpResultFromBoundaryInterface(r0)
            androidx.webkit.WebViewCompat$WebViewStartUpCallback r1 = r2.mWebViewStartUpCallback
            r1.onSuccess(r0)
            return
    }
}
