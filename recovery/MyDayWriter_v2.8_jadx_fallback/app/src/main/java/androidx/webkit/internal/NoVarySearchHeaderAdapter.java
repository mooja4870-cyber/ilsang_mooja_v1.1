package androidx.webkit.internal;

/* JADX INFO: loaded from: classes.dex */
public class NoVarySearchHeaderAdapter implements org.chromium.support_lib_boundary.NoVarySearchDataBoundaryInterface {
    private final androidx.webkit.NoVarySearchHeader mImpl;

    public NoVarySearchHeaderAdapter(androidx.webkit.NoVarySearchHeader r1) {
            r0 = this;
            r0.<init>()
            r0.mImpl = r1
            return
    }

    @Override // org.chromium.support_lib_boundary.NoVarySearchDataBoundaryInterface
    public java.util.List<java.lang.String> getConsideredQueryParameters() {
            r1 = this;
            androidx.webkit.NoVarySearchHeader r0 = r1.mImpl
            java.util.List<java.lang.String> r0 = r0.consideredQueryParameters
            return r0
    }

    @Override // org.chromium.support_lib_boundary.NoVarySearchDataBoundaryInterface
    public boolean getIgnoreDifferencesInParameters() {
            r1 = this;
            androidx.webkit.NoVarySearchHeader r0 = r1.mImpl
            boolean r0 = r0.ignoreDifferencesInParameters
            return r0
    }

    @Override // org.chromium.support_lib_boundary.NoVarySearchDataBoundaryInterface
    public java.util.List<java.lang.String> getIgnoredQueryParameters() {
            r1 = this;
            androidx.webkit.NoVarySearchHeader r0 = r1.mImpl
            java.util.List<java.lang.String> r0 = r0.ignoredQueryParameters
            return r0
    }

    @Override // org.chromium.support_lib_boundary.NoVarySearchDataBoundaryInterface
    public boolean getVaryOnKeyOrder() {
            r1 = this;
            androidx.webkit.NoVarySearchHeader r0 = r1.mImpl
            boolean r0 = r0.varyOnKeyOrder
            return r0
    }
}
