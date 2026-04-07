package androidx.webkit.internal;

/* JADX INFO: loaded from: classes.dex */
public class WebResourceRequestAdapter {
    private final org.chromium.support_lib_boundary.WebResourceRequestBoundaryInterface mBoundaryInterface;

    public WebResourceRequestAdapter(org.chromium.support_lib_boundary.WebResourceRequestBoundaryInterface r1) {
            r0 = this;
            r0.<init>()
            r0.mBoundaryInterface = r1
            return
    }

    public boolean isRedirect() {
            r1 = this;
            org.chromium.support_lib_boundary.WebResourceRequestBoundaryInterface r0 = r1.mBoundaryInterface
            boolean r0 = r0.isRedirect()
            return r0
    }
}
