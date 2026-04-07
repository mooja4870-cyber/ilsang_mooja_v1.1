package org.chromium.support_lib_boundary;

/* JADX INFO: loaded from: classes7.dex */
public interface WebViewNavigationClientBoundaryInterface extends org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface {
    void onFirstContentfulPaint(java.lang.reflect.InvocationHandler r1);

    void onNavigationCompleted(java.lang.reflect.InvocationHandler r1);

    void onNavigationRedirected(java.lang.reflect.InvocationHandler r1);

    void onNavigationStarted(java.lang.reflect.InvocationHandler r1);

    void onPageDOMContentLoadedEventFired(java.lang.reflect.InvocationHandler r1);

    void onPageDeleted(java.lang.reflect.InvocationHandler r1);

    void onPageLoadEventFired(java.lang.reflect.InvocationHandler r1);
}
