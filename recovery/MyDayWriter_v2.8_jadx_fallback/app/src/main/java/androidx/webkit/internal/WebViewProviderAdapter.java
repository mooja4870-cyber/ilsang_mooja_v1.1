package androidx.webkit.internal;

/* JADX INFO: loaded from: classes.dex */
public class WebViewProviderAdapter {
    final org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface mImpl;

    public WebViewProviderAdapter(org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface r1) {
            r0 = this;
            r0.<init>()
            r0.mImpl = r1
            return
    }

    static /* synthetic */ void lambda$prerenderUrlAsync$0(androidx.webkit.PrerenderOperationCallback r0, java.lang.Void r1) {
            r0.onPrerenderActivated()
            return
    }

    static /* synthetic */ void lambda$prerenderUrlAsync$1(androidx.webkit.PrerenderOperationCallback r2, java.lang.Throwable r3) {
            androidx.webkit.PrerenderException r0 = new androidx.webkit.PrerenderException
            java.lang.String r1 = "Prerender operation failed"
            r0.<init>(r1, r3)
            r2.onError(r0)
            return
    }

    static /* synthetic */ void lambda$prerenderUrlAsync$2(androidx.webkit.PrerenderOperationCallback r0, java.lang.Void r1) {
            r0.onPrerenderActivated()
            return
    }

    static /* synthetic */ void lambda$prerenderUrlAsync$3(androidx.webkit.PrerenderOperationCallback r2, java.lang.Throwable r3) {
            androidx.webkit.PrerenderException r0 = new androidx.webkit.PrerenderException
            java.lang.String r1 = "Prerender operation failed"
            r0.<init>(r1, r3)
            r2.onError(r0)
            return
    }

    public androidx.webkit.internal.ScriptHandlerImpl addDocumentStartJavaScript(java.lang.String r2, java.lang.String[] r3) {
            r1 = this;
            org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface r0 = r1.mImpl
            java.lang.reflect.InvocationHandler r0 = r0.addDocumentStartJavaScript(r2, r3)
            androidx.webkit.internal.ScriptHandlerImpl r0 = androidx.webkit.internal.ScriptHandlerImpl.toScriptHandler(r0)
            return r0
    }

    public void addWebMessageListener(java.lang.String r3, java.lang.String[] r4, androidx.webkit.WebViewCompat.WebMessageListener r5) {
            r2 = this;
            org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface r0 = r2.mImpl
            androidx.webkit.internal.WebMessageListenerAdapter r1 = new androidx.webkit.internal.WebMessageListenerAdapter
            r1.<init>(r5)
            java.lang.reflect.InvocationHandler r1 = org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.createInvocationHandlerFor(r1)
            r0.addWebMessageListener(r3, r4, r1)
            return
    }

    public androidx.webkit.WebMessagePortCompat[] createWebMessageChannel() {
            r5 = this;
            org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface r0 = r5.mImpl
            java.lang.reflect.InvocationHandler[] r0 = r0.createWebMessageChannel()
            int r1 = r0.length
            androidx.webkit.WebMessagePortCompat[] r1 = new androidx.webkit.WebMessagePortCompat[r1]
            r2 = 0
        La:
            int r3 = r0.length
            if (r2 >= r3) goto L19
            androidx.webkit.internal.WebMessagePortImpl r3 = new androidx.webkit.internal.WebMessagePortImpl
            r4 = r0[r2]
            r3.<init>(r4)
            r1[r2] = r3
            int r2 = r2 + 1
            goto La
        L19:
            return r1
    }

    public androidx.webkit.Profile getProfile() {
            r2 = this;
            java.lang.Class<org.chromium.support_lib_boundary.ProfileBoundaryInterface> r0 = org.chromium.support_lib_boundary.ProfileBoundaryInterface.class
            org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface r1 = r2.mImpl
            java.lang.reflect.InvocationHandler r1 = r1.getProfile()
            java.lang.Object r0 = org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.castToSuppLibClass(r0, r1)
            org.chromium.support_lib_boundary.ProfileBoundaryInterface r0 = (org.chromium.support_lib_boundary.ProfileBoundaryInterface) r0
            androidx.webkit.internal.ProfileImpl r1 = new androidx.webkit.internal.ProfileImpl
            r1.<init>(r0)
            return r1
    }

    public android.webkit.WebChromeClient getWebChromeClient() {
            r1 = this;
            org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface r0 = r1.mImpl
            android.webkit.WebChromeClient r0 = r0.getWebChromeClient()
            return r0
    }

    public androidx.webkit.WebNavigationClient getWebNavigationClient() {
            r2 = this;
            org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface r0 = r2.mImpl
            java.lang.reflect.InvocationHandler r0 = r0.getWebViewNavigationClient()
            if (r0 != 0) goto La
            r1 = 0
            return r1
        La:
            java.lang.Object r1 = org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.getDelegateFromInvocationHandler(r0)
            androidx.webkit.internal.WebNavigationClientAdapter r1 = (androidx.webkit.internal.WebNavigationClientAdapter) r1
            androidx.webkit.WebNavigationClient r1 = r1.getWebNavigationClient()
            return r1
    }

    public android.webkit.WebViewClient getWebViewClient() {
            r1 = this;
            org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface r0 = r1.mImpl
            android.webkit.WebViewClient r0 = r0.getWebViewClient()
            return r0
    }

    public androidx.webkit.WebViewRenderProcess getWebViewRenderProcess() {
            r1 = this;
            org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface r0 = r1.mImpl
            java.lang.reflect.InvocationHandler r0 = r0.getWebViewRenderer()
            androidx.webkit.internal.WebViewRenderProcessImpl r0 = androidx.webkit.internal.WebViewRenderProcessImpl.forInvocationHandler(r0)
            return r0
    }

    public androidx.webkit.WebViewRenderProcessClient getWebViewRenderProcessClient() {
            r2 = this;
            org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface r0 = r2.mImpl
            java.lang.reflect.InvocationHandler r0 = r0.getWebViewRendererClient()
            if (r0 != 0) goto La
            r1 = 0
            return r1
        La:
            java.lang.Object r1 = org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.getDelegateFromInvocationHandler(r0)
            androidx.webkit.internal.WebViewRenderProcessClientAdapter r1 = (androidx.webkit.internal.WebViewRenderProcessClientAdapter) r1
            androidx.webkit.WebViewRenderProcessClient r1 = r1.getWebViewRenderProcessClient()
            return r1
    }

    public void insertVisualStateCallback(long r3, androidx.webkit.WebViewCompat.VisualStateCallback r5) {
            r2 = this;
            org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface r0 = r2.mImpl
            androidx.webkit.internal.VisualStateCallbackAdapter r1 = new androidx.webkit.internal.VisualStateCallbackAdapter
            r1.<init>(r5)
            java.lang.reflect.InvocationHandler r1 = org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.createInvocationHandlerFor(r1)
            r0.insertVisualStateCallback(r3, r1)
            return
    }

    public boolean isAudioMuted() {
            r1 = this;
            org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface r0 = r1.mImpl
            boolean r0 = r0.isAudioMuted()
            return r0
    }

    public void postWebMessage(androidx.webkit.WebMessageCompat r3, android.net.Uri r4) {
            r2 = this;
            org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface r0 = r2.mImpl
            androidx.webkit.internal.WebMessageAdapter r1 = new androidx.webkit.internal.WebMessageAdapter
            r1.<init>(r3)
            java.lang.reflect.InvocationHandler r1 = org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.createInvocationHandlerFor(r1)
            r0.postMessageToMainFrame(r1, r4)
            return
    }

    public void prerenderUrlAsync(java.lang.String r8, android.os.CancellationSignal r9, java.util.concurrent.Executor r10, androidx.webkit.PrerenderOperationCallback r11) {
            r7 = this;
            androidx.webkit.internal.WebViewProviderAdapter$$ExternalSyntheticLambda2 r0 = new androidx.webkit.internal.WebViewProviderAdapter$$ExternalSyntheticLambda2
            r0.<init>(r11)
            r5 = r0
            androidx.webkit.internal.WebViewProviderAdapter$$ExternalSyntheticLambda3 r6 = new androidx.webkit.internal.WebViewProviderAdapter$$ExternalSyntheticLambda3
            r6.<init>(r11)
            org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface r1 = r7.mImpl
            r2 = r8
            r3 = r9
            r4 = r10
            r1.prerenderUrl(r2, r3, r4, r5, r6)
            return
    }

    public void prerenderUrlAsync(java.lang.String r9, android.os.CancellationSignal r10, java.util.concurrent.Executor r11, androidx.webkit.SpeculativeLoadingParameters r12, androidx.webkit.PrerenderOperationCallback r13) {
            r8 = this;
            androidx.webkit.internal.SpeculativeLoadingParametersAdapter r0 = new androidx.webkit.internal.SpeculativeLoadingParametersAdapter
            r0.<init>(r12)
            java.lang.reflect.InvocationHandler r5 = org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.createInvocationHandlerFor(r0)
            androidx.webkit.internal.WebViewProviderAdapter$$ExternalSyntheticLambda0 r6 = new androidx.webkit.internal.WebViewProviderAdapter$$ExternalSyntheticLambda0
            r6.<init>(r13)
            androidx.webkit.internal.WebViewProviderAdapter$$ExternalSyntheticLambda1 r7 = new androidx.webkit.internal.WebViewProviderAdapter$$ExternalSyntheticLambda1
            r7.<init>(r13)
            org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface r1 = r8.mImpl
            r2 = r9
            r3 = r10
            r4 = r11
            r1.prerenderUrl(r2, r3, r4, r5, r6, r7)
            return
    }

    public void removeWebMessageListener(java.lang.String r2) {
            r1 = this;
            org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface r0 = r1.mImpl
            r0.removeWebMessageListener(r2)
            return
    }

    public void saveState(android.os.Bundle r2, int r3, boolean r4) {
            r1 = this;
            org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface r0 = r1.mImpl
            r0.saveState(r2, r3, r4)
            return
    }

    public void setAudioMuted(boolean r2) {
            r1 = this;
            org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface r0 = r1.mImpl
            r0.setAudioMuted(r2)
            return
    }

    public void setProfileWithName(java.lang.String r2) {
            r1 = this;
            org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface r0 = r1.mImpl
            r0.setProfile(r2)
            return
    }

    public void setWebNavigationClient(androidx.webkit.WebNavigationClient r3) {
            r2 = this;
            androidx.webkit.internal.WebNavigationClientAdapter r0 = new androidx.webkit.internal.WebNavigationClientAdapter
            r0.<init>(r3)
            java.lang.reflect.InvocationHandler r0 = org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.createInvocationHandlerFor(r0)
            org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface r1 = r2.mImpl
            r1.setWebViewNavigationClient(r0)
            return
    }

    public void setWebViewRenderProcessClient(java.util.concurrent.Executor r3, androidx.webkit.WebViewRenderProcessClient r4) {
            r2 = this;
            if (r4 == 0) goto Lc
            androidx.webkit.internal.WebViewRenderProcessClientAdapter r0 = new androidx.webkit.internal.WebViewRenderProcessClientAdapter
            r0.<init>(r3, r4)
            java.lang.reflect.InvocationHandler r0 = org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.createInvocationHandlerFor(r0)
            goto Ld
        Lc:
            r0 = 0
        Ld:
            org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface r1 = r2.mImpl
            r1.setWebViewRendererClient(r0)
            return
    }
}
