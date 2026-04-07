package org.chromium.support_lib_boundary;

/* JADX INFO: loaded from: classes7.dex */
@org.jspecify.annotations.NullMarked
public interface WebViewRendererClientBoundaryInterface extends org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface {
    void onRendererResponsive(android.webkit.WebView r1, java.lang.reflect.InvocationHandler r2);

    void onRendererUnresponsive(android.webkit.WebView r1, java.lang.reflect.InvocationHandler r2);
}
