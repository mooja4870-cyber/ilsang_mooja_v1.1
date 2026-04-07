package org.chromium.support_lib_boundary;

/* JADX INFO: loaded from: classes7.dex */
@org.jspecify.annotations.NullMarked
public interface ProfileBoundaryInterface {
    void clearPrefetch(java.lang.String r1, java.util.concurrent.Executor r2, java.lang.reflect.InvocationHandler r3);

    android.webkit.CookieManager getCookieManager();

    android.webkit.GeolocationPermissions getGeoLocationPermissions();

    java.lang.String getName();

    android.webkit.ServiceWorkerController getServiceWorkerController();

    android.webkit.WebStorage getWebStorage();

    void prefetchUrl(java.lang.String r1, android.os.CancellationSignal r2, java.util.concurrent.Executor r3, java.lang.reflect.InvocationHandler r4);

    void prefetchUrl(java.lang.String r1, android.os.CancellationSignal r2, java.util.concurrent.Executor r3, java.lang.reflect.InvocationHandler r4, java.lang.reflect.InvocationHandler r5);

    void setSpeculativeLoadingConfig(java.lang.reflect.InvocationHandler r1);
}
