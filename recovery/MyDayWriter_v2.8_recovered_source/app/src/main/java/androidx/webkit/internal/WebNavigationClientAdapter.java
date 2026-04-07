package androidx.webkit.internal;

/* JADX INFO: loaded from: classes.dex */
public class WebNavigationClientAdapter implements org.chromium.support_lib_boundary.WebViewNavigationClientBoundaryInterface {
    androidx.webkit.WebNavigationClient mWebNavigationClient;

    public WebNavigationClientAdapter(androidx.webkit.WebNavigationClient r1) {
            r0 = this;
            r0.<init>()
            r0.mWebNavigationClient = r1
            return
    }

    static /* synthetic */ java.lang.Object lambda$onFirstContentfulPaint$6(org.chromium.support_lib_boundary.WebViewPageBoundaryInterface r1) throws java.lang.Exception {
            androidx.webkit.internal.PageImpl r0 = new androidx.webkit.internal.PageImpl
            r0.<init>(r1)
            return r0
    }

    static /* synthetic */ java.lang.Object lambda$onNavigationCompleted$2(org.chromium.support_lib_boundary.WebViewNavigationBoundaryInterface r1) throws java.lang.Exception {
            androidx.webkit.internal.NavigationAdapter r0 = new androidx.webkit.internal.NavigationAdapter
            r0.<init>(r1)
            return r0
    }

    static /* synthetic */ java.lang.Object lambda$onNavigationRedirected$1(org.chromium.support_lib_boundary.WebViewNavigationBoundaryInterface r1) throws java.lang.Exception {
            androidx.webkit.internal.NavigationAdapter r0 = new androidx.webkit.internal.NavigationAdapter
            r0.<init>(r1)
            return r0
    }

    static /* synthetic */ java.lang.Object lambda$onNavigationStarted$0(org.chromium.support_lib_boundary.WebViewNavigationBoundaryInterface r1) throws java.lang.Exception {
            androidx.webkit.internal.NavigationAdapter r0 = new androidx.webkit.internal.NavigationAdapter
            r0.<init>(r1)
            return r0
    }

    static /* synthetic */ java.lang.Object lambda$onPageDOMContentLoadedEventFired$5(org.chromium.support_lib_boundary.WebViewPageBoundaryInterface r1) throws java.lang.Exception {
            androidx.webkit.internal.PageImpl r0 = new androidx.webkit.internal.PageImpl
            r0.<init>(r1)
            return r0
    }

    static /* synthetic */ java.lang.Object lambda$onPageDeleted$3(org.chromium.support_lib_boundary.WebViewPageBoundaryInterface r1) throws java.lang.Exception {
            androidx.webkit.internal.PageImpl r0 = new androidx.webkit.internal.PageImpl
            r0.<init>(r1)
            return r0
    }

    static /* synthetic */ java.lang.Object lambda$onPageLoadEventFired$4(org.chromium.support_lib_boundary.WebViewPageBoundaryInterface r1) throws java.lang.Exception {
            androidx.webkit.internal.PageImpl r0 = new androidx.webkit.internal.PageImpl
            r0.<init>(r1)
            return r0
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public java.lang.String[] getSupportedFeatures() {
            r3 = this;
            r0 = 1
            java.lang.String[] r0 = new java.lang.String[r0]
            r1 = 0
            java.lang.String r2 = "WEB_VIEW_NAVIGATION_CLIENT_BASIC_USAGE"
            r0[r1] = r2
            return r0
    }

    public androidx.webkit.WebNavigationClient getWebNavigationClient() {
            r1 = this;
            androidx.webkit.WebNavigationClient r0 = r1.mWebNavigationClient
            return r0
    }

    @Override // org.chromium.support_lib_boundary.WebViewNavigationClientBoundaryInterface
    public void onFirstContentfulPaint(java.lang.reflect.InvocationHandler r4) {
            r3 = this;
            java.lang.Class<org.chromium.support_lib_boundary.WebViewPageBoundaryInterface> r0 = org.chromium.support_lib_boundary.WebViewPageBoundaryInterface.class
            java.lang.Object r0 = org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.castToSuppLibClass(r0, r4)
            org.chromium.support_lib_boundary.WebViewPageBoundaryInterface r0 = (org.chromium.support_lib_boundary.WebViewPageBoundaryInterface) r0
            androidx.webkit.WebNavigationClient r1 = r3.mWebNavigationClient
            androidx.webkit.internal.WebNavigationClientAdapter$$ExternalSyntheticLambda0 r2 = new androidx.webkit.internal.WebNavigationClientAdapter$$ExternalSyntheticLambda0
            r2.<init>(r0)
            java.lang.Object r2 = r0.getOrCreatePeer(r2)
            androidx.webkit.internal.PageImpl r2 = (androidx.webkit.internal.PageImpl) r2
            r1.onFirstContentfulPaint(r2)
            return
    }

    @Override // org.chromium.support_lib_boundary.WebViewNavigationClientBoundaryInterface
    public void onNavigationCompleted(java.lang.reflect.InvocationHandler r4) {
            r3 = this;
            java.lang.Class<org.chromium.support_lib_boundary.WebViewNavigationBoundaryInterface> r0 = org.chromium.support_lib_boundary.WebViewNavigationBoundaryInterface.class
            java.lang.Object r0 = org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.castToSuppLibClass(r0, r4)
            org.chromium.support_lib_boundary.WebViewNavigationBoundaryInterface r0 = (org.chromium.support_lib_boundary.WebViewNavigationBoundaryInterface) r0
            androidx.webkit.WebNavigationClient r1 = r3.mWebNavigationClient
            androidx.webkit.internal.WebNavigationClientAdapter$$ExternalSyntheticLambda6 r2 = new androidx.webkit.internal.WebNavigationClientAdapter$$ExternalSyntheticLambda6
            r2.<init>(r0)
            java.lang.Object r2 = r0.getOrCreatePeer(r2)
            androidx.webkit.internal.NavigationAdapter r2 = (androidx.webkit.internal.NavigationAdapter) r2
            r1.onNavigationCompleted(r2)
            return
    }

    @Override // org.chromium.support_lib_boundary.WebViewNavigationClientBoundaryInterface
    public void onNavigationRedirected(java.lang.reflect.InvocationHandler r4) {
            r3 = this;
            java.lang.Class<org.chromium.support_lib_boundary.WebViewNavigationBoundaryInterface> r0 = org.chromium.support_lib_boundary.WebViewNavigationBoundaryInterface.class
            java.lang.Object r0 = org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.castToSuppLibClass(r0, r4)
            org.chromium.support_lib_boundary.WebViewNavigationBoundaryInterface r0 = (org.chromium.support_lib_boundary.WebViewNavigationBoundaryInterface) r0
            androidx.webkit.WebNavigationClient r1 = r3.mWebNavigationClient
            androidx.webkit.internal.WebNavigationClientAdapter$$ExternalSyntheticLambda3 r2 = new androidx.webkit.internal.WebNavigationClientAdapter$$ExternalSyntheticLambda3
            r2.<init>(r0)
            java.lang.Object r2 = r0.getOrCreatePeer(r2)
            androidx.webkit.internal.NavigationAdapter r2 = (androidx.webkit.internal.NavigationAdapter) r2
            r1.onNavigationRedirected(r2)
            return
    }

    @Override // org.chromium.support_lib_boundary.WebViewNavigationClientBoundaryInterface
    public void onNavigationStarted(java.lang.reflect.InvocationHandler r4) {
            r3 = this;
            java.lang.Class<org.chromium.support_lib_boundary.WebViewNavigationBoundaryInterface> r0 = org.chromium.support_lib_boundary.WebViewNavigationBoundaryInterface.class
            java.lang.Object r0 = org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.castToSuppLibClass(r0, r4)
            org.chromium.support_lib_boundary.WebViewNavigationBoundaryInterface r0 = (org.chromium.support_lib_boundary.WebViewNavigationBoundaryInterface) r0
            androidx.webkit.WebNavigationClient r1 = r3.mWebNavigationClient
            androidx.webkit.internal.WebNavigationClientAdapter$$ExternalSyntheticLambda1 r2 = new androidx.webkit.internal.WebNavigationClientAdapter$$ExternalSyntheticLambda1
            r2.<init>(r0)
            java.lang.Object r2 = r0.getOrCreatePeer(r2)
            androidx.webkit.internal.NavigationAdapter r2 = (androidx.webkit.internal.NavigationAdapter) r2
            r1.onNavigationStarted(r2)
            return
    }

    @Override // org.chromium.support_lib_boundary.WebViewNavigationClientBoundaryInterface
    public void onPageDOMContentLoadedEventFired(java.lang.reflect.InvocationHandler r4) {
            r3 = this;
            java.lang.Class<org.chromium.support_lib_boundary.WebViewPageBoundaryInterface> r0 = org.chromium.support_lib_boundary.WebViewPageBoundaryInterface.class
            java.lang.Object r0 = org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.castToSuppLibClass(r0, r4)
            org.chromium.support_lib_boundary.WebViewPageBoundaryInterface r0 = (org.chromium.support_lib_boundary.WebViewPageBoundaryInterface) r0
            androidx.webkit.WebNavigationClient r1 = r3.mWebNavigationClient
            androidx.webkit.internal.WebNavigationClientAdapter$$ExternalSyntheticLambda5 r2 = new androidx.webkit.internal.WebNavigationClientAdapter$$ExternalSyntheticLambda5
            r2.<init>(r0)
            java.lang.Object r2 = r0.getOrCreatePeer(r2)
            androidx.webkit.internal.PageImpl r2 = (androidx.webkit.internal.PageImpl) r2
            r1.onPageDomContentLoadedEventFired(r2)
            return
    }

    @Override // org.chromium.support_lib_boundary.WebViewNavigationClientBoundaryInterface
    public void onPageDeleted(java.lang.reflect.InvocationHandler r4) {
            r3 = this;
            java.lang.Class<org.chromium.support_lib_boundary.WebViewPageBoundaryInterface> r0 = org.chromium.support_lib_boundary.WebViewPageBoundaryInterface.class
            java.lang.Object r0 = org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.castToSuppLibClass(r0, r4)
            org.chromium.support_lib_boundary.WebViewPageBoundaryInterface r0 = (org.chromium.support_lib_boundary.WebViewPageBoundaryInterface) r0
            androidx.webkit.WebNavigationClient r1 = r3.mWebNavigationClient
            androidx.webkit.internal.WebNavigationClientAdapter$$ExternalSyntheticLambda2 r2 = new androidx.webkit.internal.WebNavigationClientAdapter$$ExternalSyntheticLambda2
            r2.<init>(r0)
            java.lang.Object r2 = r0.getOrCreatePeer(r2)
            androidx.webkit.internal.PageImpl r2 = (androidx.webkit.internal.PageImpl) r2
            r1.onPageDeleted(r2)
            return
    }

    @Override // org.chromium.support_lib_boundary.WebViewNavigationClientBoundaryInterface
    public void onPageLoadEventFired(java.lang.reflect.InvocationHandler r4) {
            r3 = this;
            java.lang.Class<org.chromium.support_lib_boundary.WebViewPageBoundaryInterface> r0 = org.chromium.support_lib_boundary.WebViewPageBoundaryInterface.class
            java.lang.Object r0 = org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.castToSuppLibClass(r0, r4)
            org.chromium.support_lib_boundary.WebViewPageBoundaryInterface r0 = (org.chromium.support_lib_boundary.WebViewPageBoundaryInterface) r0
            androidx.webkit.WebNavigationClient r1 = r3.mWebNavigationClient
            androidx.webkit.internal.WebNavigationClientAdapter$$ExternalSyntheticLambda4 r2 = new androidx.webkit.internal.WebNavigationClientAdapter$$ExternalSyntheticLambda4
            r2.<init>(r0)
            java.lang.Object r2 = r0.getOrCreatePeer(r2)
            androidx.webkit.internal.PageImpl r2 = (androidx.webkit.internal.PageImpl) r2
            r1.onPageLoadEventFired(r2)
            return
    }
}
