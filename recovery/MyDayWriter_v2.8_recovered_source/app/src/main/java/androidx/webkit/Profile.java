package androidx.webkit;

/* JADX INFO: loaded from: classes.dex */
public interface Profile {
    public static final java.lang.String DEFAULT_PROFILE_NAME = "Default";

    @java.lang.annotation.Target({java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.TYPE, java.lang.annotation.ElementType.FIELD})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
    public @interface ExperimentalUrlPrefetch {
    }

    void clearPrefetchAsync(java.lang.String r1, java.util.concurrent.Executor r2, androidx.webkit.OutcomeReceiverCompat<java.lang.Void, androidx.webkit.PrefetchException> r3);

    android.webkit.CookieManager getCookieManager();

    android.webkit.GeolocationPermissions getGeolocationPermissions();

    java.lang.String getName();

    android.webkit.ServiceWorkerController getServiceWorkerController();

    android.webkit.WebStorage getWebStorage();

    void prefetchUrlAsync(java.lang.String r1, android.os.CancellationSignal r2, java.util.concurrent.Executor r3, androidx.webkit.OutcomeReceiverCompat<java.lang.Void, androidx.webkit.PrefetchException> r4);

    void prefetchUrlAsync(java.lang.String r1, android.os.CancellationSignal r2, java.util.concurrent.Executor r3, androidx.webkit.SpeculativeLoadingParameters r4, androidx.webkit.OutcomeReceiverCompat<java.lang.Void, androidx.webkit.PrefetchException> r5);

    void setSpeculativeLoadingConfig(androidx.webkit.SpeculativeLoadingConfig r1);
}
