package androidx.webkit.internal;

/* JADX INFO: loaded from: classes.dex */
public class WebSettingsNoOpAdapter extends androidx.webkit.internal.WebSettingsAdapter {
    public WebSettingsNoOpAdapter() {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            return
    }

    @Override // androidx.webkit.internal.WebSettingsAdapter
    public int getAttributionRegistrationBehavior() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // androidx.webkit.internal.WebSettingsAdapter
    public boolean getBackForwardCacheEnabled() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // androidx.webkit.internal.WebSettingsAdapter
    public int getDisabledActionModeMenuItems() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // androidx.webkit.internal.WebSettingsAdapter
    public boolean getEnterpriseAuthenticationAppLinkPolicyEnabled() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // androidx.webkit.internal.WebSettingsAdapter
    public int getForceDark() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // androidx.webkit.internal.WebSettingsAdapter
    public int getForceDarkStrategy() {
            r1 = this;
            r0 = 2
            return r0
    }

    @Override // androidx.webkit.internal.WebSettingsAdapter
    public boolean getHasEnrolledInstrumentEnabled() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // androidx.webkit.internal.WebSettingsAdapter
    public boolean getOffscreenPreRaster() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // androidx.webkit.internal.WebSettingsAdapter
    public boolean getPaymentRequestEnabled() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // androidx.webkit.internal.WebSettingsAdapter
    public java.util.Set<java.lang.String> getRequestedWithHeaderOriginAllowList() {
            r1 = this;
            java.util.Set r0 = java.util.Collections.emptySet()
            return r0
    }

    @Override // androidx.webkit.internal.WebSettingsAdapter
    public boolean getSafeBrowsingEnabled() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // androidx.webkit.internal.WebSettingsAdapter
    public int getSpeculativeLoadingStatus() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // androidx.webkit.internal.WebSettingsAdapter
    public androidx.webkit.UserAgentMetadata getUserAgentMetadata() {
            r1 = this;
            java.util.Map r0 = java.util.Collections.emptyMap()
            androidx.webkit.UserAgentMetadata r0 = androidx.webkit.internal.UserAgentMetadataInternal.getUserAgentMetadataFromMap(r0)
            return r0
    }

    @Override // androidx.webkit.internal.WebSettingsAdapter
    public int getWebAuthenticationSupport() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // androidx.webkit.internal.WebSettingsAdapter
    public androidx.webkit.WebViewMediaIntegrityApiStatusConfig getWebViewMediaIntegrityApiStatus() {
            r2 = this;
            androidx.webkit.WebViewMediaIntegrityApiStatusConfig$Builder r0 = new androidx.webkit.WebViewMediaIntegrityApiStatusConfig$Builder
            r1 = 2
            r0.<init>(r1)
            androidx.webkit.WebViewMediaIntegrityApiStatusConfig r0 = r0.build()
            return r0
    }

    @Override // androidx.webkit.internal.WebSettingsAdapter
    public boolean isAlgorithmicDarkeningAllowed() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // androidx.webkit.internal.WebSettingsAdapter
    public void setAlgorithmicDarkeningAllowed(boolean r1) {
            r0 = this;
            return
    }

    @Override // androidx.webkit.internal.WebSettingsAdapter
    public void setAttributionRegistrationBehavior(int r1) {
            r0 = this;
            return
    }

    @Override // androidx.webkit.internal.WebSettingsAdapter
    public void setBackForwardCacheEnabled(boolean r1) {
            r0 = this;
            return
    }

    @Override // androidx.webkit.internal.WebSettingsAdapter
    public void setDisabledActionModeMenuItems(int r1) {
            r0 = this;
            return
    }

    @Override // androidx.webkit.internal.WebSettingsAdapter
    public void setEnterpriseAuthenticationAppLinkPolicyEnabled(boolean r1) {
            r0 = this;
            return
    }

    @Override // androidx.webkit.internal.WebSettingsAdapter
    public void setForceDark(int r1) {
            r0 = this;
            return
    }

    @Override // androidx.webkit.internal.WebSettingsAdapter
    public void setForceDarkStrategy(int r1) {
            r0 = this;
            return
    }

    @Override // androidx.webkit.internal.WebSettingsAdapter
    public void setHasEnrolledInstrumentEnabled(boolean r1) {
            r0 = this;
            return
    }

    @Override // androidx.webkit.internal.WebSettingsAdapter
    public void setOffscreenPreRaster(boolean r1) {
            r0 = this;
            return
    }

    @Override // androidx.webkit.internal.WebSettingsAdapter
    public void setPaymentRequestEnabled(boolean r1) {
            r0 = this;
            return
    }

    @Override // androidx.webkit.internal.WebSettingsAdapter
    public void setRequestedWithHeaderOriginAllowList(java.util.Set<java.lang.String> r1) {
            r0 = this;
            return
    }

    @Override // androidx.webkit.internal.WebSettingsAdapter
    public void setSafeBrowsingEnabled(boolean r1) {
            r0 = this;
            return
    }

    @Override // androidx.webkit.internal.WebSettingsAdapter
    public void setSpeculativeLoadingStatus(int r1) {
            r0 = this;
            return
    }

    @Override // androidx.webkit.internal.WebSettingsAdapter
    public void setUserAgentMetadata(androidx.webkit.UserAgentMetadata r1) {
            r0 = this;
            return
    }

    @Override // androidx.webkit.internal.WebSettingsAdapter
    public void setWebAuthenticationSupport(int r1) {
            r0 = this;
            return
    }

    @Override // androidx.webkit.internal.WebSettingsAdapter
    public void setWebViewMediaIntegrityApiStatus(androidx.webkit.WebViewMediaIntegrityApiStatusConfig r1) {
            r0 = this;
            return
    }
}
