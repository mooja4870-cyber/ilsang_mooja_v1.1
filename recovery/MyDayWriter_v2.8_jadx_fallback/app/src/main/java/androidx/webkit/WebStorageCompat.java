package androidx.webkit;

/* JADX INFO: loaded from: classes.dex */
public final class WebStorageCompat {
    private WebStorageCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void deleteBrowsingData(android.webkit.WebStorage r1, java.lang.Runnable r2) {
            androidx.webkit.WebStorageCompat$$ExternalSyntheticLambda1 r0 = new androidx.webkit.WebStorageCompat$$ExternalSyntheticLambda1
            r0.<init>()
            deleteBrowsingData(r1, r0, r2)
            return
    }

    public static void deleteBrowsingData(android.webkit.WebStorage r2, java.util.concurrent.Executor r3, java.lang.Runnable r4) {
            androidx.webkit.internal.ApiFeature$NoFramework r0 = androidx.webkit.internal.WebViewFeatureInternal.DELETE_BROWSING_DATA
            boolean r1 = r0.isSupportedByWebView()
            if (r1 == 0) goto L10
            androidx.webkit.internal.WebStorageAdapter r1 = getAdapter(r2)
            r1.deleteBrowsingData(r3, r4)
            return
        L10:
            java.lang.UnsupportedOperationException r1 = androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException()
            throw r1
    }

    public static java.lang.String deleteBrowsingDataForSite(android.webkit.WebStorage r1, java.lang.String r2, java.lang.Runnable r3) {
            androidx.webkit.WebStorageCompat$$ExternalSyntheticLambda0 r0 = new androidx.webkit.WebStorageCompat$$ExternalSyntheticLambda0
            r0.<init>()
            java.lang.String r0 = deleteBrowsingDataForSite(r1, r2, r0, r3)
            return r0
    }

    public static java.lang.String deleteBrowsingDataForSite(android.webkit.WebStorage r2, java.lang.String r3, java.util.concurrent.Executor r4, java.lang.Runnable r5) {
            androidx.webkit.internal.ApiFeature$NoFramework r0 = androidx.webkit.internal.WebViewFeatureInternal.DELETE_BROWSING_DATA
            boolean r1 = r0.isSupportedByWebView()
            if (r1 == 0) goto L11
            androidx.webkit.internal.WebStorageAdapter r1 = getAdapter(r2)
            java.lang.String r1 = r1.deleteBrowsingDataForSite(r3, r4, r5)
            return r1
        L11:
            java.lang.UnsupportedOperationException r1 = androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException()
            throw r1
    }

    private static androidx.webkit.internal.WebStorageAdapter getAdapter(android.webkit.WebStorage r1) {
            androidx.webkit.internal.WebkitToCompatConverter r0 = androidx.webkit.internal.WebViewGlueCommunicator.getCompatConverter()
            androidx.webkit.internal.WebStorageAdapter r0 = r0.convertWebStorage(r1)
            return r0
    }

    static /* synthetic */ void lambda$deleteBrowsingData$0(java.lang.Runnable r2) {
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            r0.post(r2)
            return
    }

    static /* synthetic */ void lambda$deleteBrowsingDataForSite$1(java.lang.Runnable r2) {
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            r0.post(r2)
            return
    }
}
