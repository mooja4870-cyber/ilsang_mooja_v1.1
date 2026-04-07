package org.chromium.support_lib_boundary;

/* JADX INFO: loaded from: classes7.dex */
@org.jspecify.annotations.NullMarked
public interface StaticsBoundaryInterface {
    android.net.Uri getSafeBrowsingPrivacyPolicyUrl();

    java.lang.String getVariationsHeader();

    void initSafeBrowsing(android.content.Context r1, android.webkit.ValueCallback<java.lang.Boolean> r2);

    boolean isMultiProcessEnabled();

    void setDefaultTrafficStatsTag(int r1);

    void setDefaultTrafficStatsUid(int r1);

    void setSafeBrowsingAllowlist(java.util.Set<java.lang.String> r1, android.webkit.ValueCallback<java.lang.Boolean> r2);

    void setSafeBrowsingWhitelist(java.util.List<java.lang.String> r1, android.webkit.ValueCallback<java.lang.Boolean> r2);
}
