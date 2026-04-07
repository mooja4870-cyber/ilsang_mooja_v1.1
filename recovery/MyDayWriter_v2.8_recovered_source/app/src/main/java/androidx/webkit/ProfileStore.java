package androidx.webkit;

/* JADX INFO: loaded from: classes.dex */
public interface ProfileStore {
    static androidx.webkit.ProfileStore getInstance() {
            androidx.webkit.internal.ApiFeature$NoFramework r0 = androidx.webkit.internal.WebViewFeatureInternal.MULTI_PROFILE
            boolean r1 = r0.isSupportedByWebView()
            if (r1 == 0) goto Ld
            androidx.webkit.ProfileStore r1 = androidx.webkit.internal.ProfileStoreImpl.getInstance()
            return r1
        Ld:
            java.lang.UnsupportedOperationException r1 = androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException()
            throw r1
    }

    boolean deleteProfile(java.lang.String r1);

    java.util.List<java.lang.String> getAllProfileNames();

    androidx.webkit.Profile getOrCreateProfile(java.lang.String r1);

    androidx.webkit.Profile getProfile(java.lang.String r1);
}
