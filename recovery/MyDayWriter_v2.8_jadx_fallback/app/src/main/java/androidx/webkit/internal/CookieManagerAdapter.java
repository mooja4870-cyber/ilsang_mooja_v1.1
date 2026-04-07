package androidx.webkit.internal;

/* JADX INFO: loaded from: classes.dex */
public class CookieManagerAdapter {
    private final org.chromium.support_lib_boundary.WebViewCookieManagerBoundaryInterface mBoundaryInterface;

    public CookieManagerAdapter(org.chromium.support_lib_boundary.WebViewCookieManagerBoundaryInterface r1) {
            r0 = this;
            r0.<init>()
            r0.mBoundaryInterface = r1
            return
    }

    public java.util.List<java.lang.String> getCookieInfo(java.lang.String r2) {
            r1 = this;
            org.chromium.support_lib_boundary.WebViewCookieManagerBoundaryInterface r0 = r1.mBoundaryInterface
            java.util.List r0 = r0.getCookieInfo(r2)
            return r0
    }
}
