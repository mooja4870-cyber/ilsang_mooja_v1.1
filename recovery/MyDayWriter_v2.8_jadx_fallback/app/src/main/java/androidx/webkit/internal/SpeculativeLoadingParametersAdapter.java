package androidx.webkit.internal;

/* JADX INFO: loaded from: classes.dex */
public class SpeculativeLoadingParametersAdapter implements org.chromium.support_lib_boundary.SpeculativeLoadingParametersBoundaryInterface {
    private final androidx.webkit.SpeculativeLoadingParameters mSpeculativeLoadingParameters;

    public SpeculativeLoadingParametersAdapter(androidx.webkit.SpeculativeLoadingParameters r1) {
            r0 = this;
            r0.<init>()
            r0.mSpeculativeLoadingParameters = r1
            return
    }

    @Override // org.chromium.support_lib_boundary.SpeculativeLoadingParametersBoundaryInterface
    public java.util.Map<java.lang.String, java.lang.String> getAdditionalHeaders() {
            r1 = this;
            androidx.webkit.SpeculativeLoadingParameters r0 = r1.mSpeculativeLoadingParameters
            if (r0 != 0) goto La
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            return r0
        La:
            androidx.webkit.SpeculativeLoadingParameters r0 = r1.mSpeculativeLoadingParameters
            java.util.Map r0 = r0.getAdditionalHeaders()
            return r0
    }

    @Override // org.chromium.support_lib_boundary.SpeculativeLoadingParametersBoundaryInterface
    public java.lang.reflect.InvocationHandler getNoVarySearchData() {
            r2 = this;
            androidx.webkit.SpeculativeLoadingParameters r0 = r2.mSpeculativeLoadingParameters
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            androidx.webkit.SpeculativeLoadingParameters r0 = r2.mSpeculativeLoadingParameters
            androidx.webkit.NoVarySearchHeader r0 = r0.getExpectedNoVarySearchData()
            if (r0 != 0) goto Lf
            return r1
        Lf:
            androidx.webkit.internal.NoVarySearchHeaderAdapter r1 = new androidx.webkit.internal.NoVarySearchHeaderAdapter
            r1.<init>(r0)
            java.lang.reflect.InvocationHandler r1 = org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.createInvocationHandlerFor(r1)
            return r1
    }

    @Override // org.chromium.support_lib_boundary.SpeculativeLoadingParametersBoundaryInterface
    public boolean isJavaScriptEnabled() {
            r1 = this;
            androidx.webkit.SpeculativeLoadingParameters r0 = r1.mSpeculativeLoadingParameters
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            androidx.webkit.SpeculativeLoadingParameters r0 = r1.mSpeculativeLoadingParameters
            boolean r0 = r0.isJavaScriptEnabled()
            return r0
    }
}
