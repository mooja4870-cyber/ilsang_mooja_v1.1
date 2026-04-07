package androidx.webkit.internal;

/* JADX INFO: loaded from: classes.dex */
public class NavigationAdapter implements androidx.webkit.Navigation {
    org.chromium.support_lib_boundary.WebViewNavigationBoundaryInterface mImpl;
    androidx.webkit.internal.PageImpl mPage;

    public NavigationAdapter(org.chromium.support_lib_boundary.WebViewNavigationBoundaryInterface r1) {
            r0 = this;
            r0.<init>()
            r0.mImpl = r1
            return
    }

    @Override // androidx.webkit.Navigation
    public boolean didCommit() {
            r1 = this;
            org.chromium.support_lib_boundary.WebViewNavigationBoundaryInterface r0 = r1.mImpl
            boolean r0 = r0.didCommit()
            return r0
    }

    @Override // androidx.webkit.Navigation
    public boolean didCommitErrorPage() {
            r1 = this;
            org.chromium.support_lib_boundary.WebViewNavigationBoundaryInterface r0 = r1.mImpl
            boolean r0 = r0.didCommitErrorPage()
            return r0
    }

    @Override // androidx.webkit.Navigation
    public androidx.webkit.Page getPage() {
            r2 = this;
            org.chromium.support_lib_boundary.WebViewNavigationBoundaryInterface r0 = r2.mImpl
            java.lang.reflect.InvocationHandler r0 = r0.getPage()
            if (r0 != 0) goto La
            r0 = 0
            return r0
        La:
            androidx.webkit.internal.PageImpl r0 = r2.mPage
            if (r0 != 0) goto L23
            java.lang.Class<org.chromium.support_lib_boundary.WebViewPageBoundaryInterface> r0 = org.chromium.support_lib_boundary.WebViewPageBoundaryInterface.class
            org.chromium.support_lib_boundary.WebViewNavigationBoundaryInterface r1 = r2.mImpl
            java.lang.reflect.InvocationHandler r1 = r1.getPage()
            java.lang.Object r0 = org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.castToSuppLibClass(r0, r1)
            org.chromium.support_lib_boundary.WebViewPageBoundaryInterface r0 = (org.chromium.support_lib_boundary.WebViewPageBoundaryInterface) r0
            androidx.webkit.internal.PageImpl r1 = new androidx.webkit.internal.PageImpl
            r1.<init>(r0)
            r2.mPage = r1
        L23:
            androidx.webkit.internal.PageImpl r0 = r2.mPage
            return r0
    }

    @Override // androidx.webkit.Navigation
    public int getStatusCode() {
            r1 = this;
            org.chromium.support_lib_boundary.WebViewNavigationBoundaryInterface r0 = r1.mImpl
            int r0 = r0.getStatusCode()
            return r0
    }

    @Override // androidx.webkit.Navigation
    public boolean isBack() {
            r1 = this;
            org.chromium.support_lib_boundary.WebViewNavigationBoundaryInterface r0 = r1.mImpl
            boolean r0 = r0.isBack()
            return r0
    }

    @Override // androidx.webkit.Navigation
    public boolean isForward() {
            r1 = this;
            org.chromium.support_lib_boundary.WebViewNavigationBoundaryInterface r0 = r1.mImpl
            boolean r0 = r0.isForward()
            return r0
    }

    @Override // androidx.webkit.Navigation
    public boolean isHistory() {
            r1 = this;
            org.chromium.support_lib_boundary.WebViewNavigationBoundaryInterface r0 = r1.mImpl
            boolean r0 = r0.isHistory()
            return r0
    }

    @Override // androidx.webkit.Navigation
    public boolean isReload() {
            r1 = this;
            org.chromium.support_lib_boundary.WebViewNavigationBoundaryInterface r0 = r1.mImpl
            boolean r0 = r0.isReload()
            return r0
    }

    @Override // androidx.webkit.Navigation
    public boolean isRestore() {
            r1 = this;
            org.chromium.support_lib_boundary.WebViewNavigationBoundaryInterface r0 = r1.mImpl
            boolean r0 = r0.isRestore()
            return r0
    }

    @Override // androidx.webkit.Navigation
    public boolean isSameDocument() {
            r1 = this;
            org.chromium.support_lib_boundary.WebViewNavigationBoundaryInterface r0 = r1.mImpl
            boolean r0 = r0.isSameDocument()
            return r0
    }

    @Override // androidx.webkit.Navigation
    public boolean wasInitiatedByPage() {
            r1 = this;
            org.chromium.support_lib_boundary.WebViewNavigationBoundaryInterface r0 = r1.mImpl
            boolean r0 = r0.wasInitiatedByPage()
            return r0
    }
}
