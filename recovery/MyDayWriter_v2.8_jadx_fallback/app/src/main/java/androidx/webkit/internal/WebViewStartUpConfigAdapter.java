package androidx.webkit.internal;

/* JADX INFO: loaded from: classes.dex */
public class WebViewStartUpConfigAdapter implements org.chromium.support_lib_boundary.WebViewStartUpConfigBoundaryInterface {
    private final androidx.webkit.WebViewStartUpConfig mWebViewStartUpConfig;

    public WebViewStartUpConfigAdapter(androidx.webkit.WebViewStartUpConfig r1) {
            r0 = this;
            r0.<init>()
            r0.mWebViewStartUpConfig = r1
            return
    }

    @Override // org.chromium.support_lib_boundary.WebViewStartUpConfigBoundaryInterface
    public java.util.concurrent.Executor getBackgroundExecutor() {
            r1 = this;
            androidx.webkit.WebViewStartUpConfig r0 = r1.mWebViewStartUpConfig
            java.util.concurrent.Executor r0 = r0.getBackgroundExecutor()
            return r0
    }

    @Override // org.chromium.support_lib_boundary.WebViewStartUpConfigBoundaryInterface
    public boolean shouldRunUiThreadStartUpTasks() {
            r1 = this;
            androidx.webkit.WebViewStartUpConfig r0 = r1.mWebViewStartUpConfig
            boolean r0 = r0.shouldRunUiThreadStartUpTasks()
            return r0
    }
}
