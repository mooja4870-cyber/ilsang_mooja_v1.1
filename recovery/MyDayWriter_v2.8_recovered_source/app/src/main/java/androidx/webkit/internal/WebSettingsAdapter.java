package androidx.webkit.internal;

/* JADX INFO: loaded from: classes.dex */
public class WebSettingsAdapter {
    private final org.chromium.support_lib_boundary.WebSettingsBoundaryInterface mBoundaryInterface;

    public WebSettingsAdapter(org.chromium.support_lib_boundary.WebSettingsBoundaryInterface r1) {
            r0 = this;
            r0.<init>()
            r0.mBoundaryInterface = r1
            return
    }

    public int getAttributionRegistrationBehavior() {
            r1 = this;
            org.chromium.support_lib_boundary.WebSettingsBoundaryInterface r0 = r1.mBoundaryInterface
            int r0 = r0.getAttributionBehavior()
            return r0
    }

    public boolean getBackForwardCacheEnabled() {
            r1 = this;
            org.chromium.support_lib_boundary.WebSettingsBoundaryInterface r0 = r1.mBoundaryInterface
            boolean r0 = r0.getBackForwardCacheEnabled()
            return r0
    }

    public int getDisabledActionModeMenuItems() {
            r1 = this;
            org.chromium.support_lib_boundary.WebSettingsBoundaryInterface r0 = r1.mBoundaryInterface
            int r0 = r0.getDisabledActionModeMenuItems()
            return r0
    }

    public boolean getEnterpriseAuthenticationAppLinkPolicyEnabled() {
            r1 = this;
            org.chromium.support_lib_boundary.WebSettingsBoundaryInterface r0 = r1.mBoundaryInterface
            boolean r0 = r0.getEnterpriseAuthenticationAppLinkPolicyEnabled()
            return r0
    }

    public int getForceDark() {
            r1 = this;
            org.chromium.support_lib_boundary.WebSettingsBoundaryInterface r0 = r1.mBoundaryInterface
            int r0 = r0.getForceDark()
            return r0
    }

    public int getForceDarkStrategy() {
            r1 = this;
            org.chromium.support_lib_boundary.WebSettingsBoundaryInterface r0 = r1.mBoundaryInterface
            int r0 = r0.getForceDarkBehavior()
            return r0
    }

    public boolean getHasEnrolledInstrumentEnabled() {
            r1 = this;
            org.chromium.support_lib_boundary.WebSettingsBoundaryInterface r0 = r1.mBoundaryInterface
            boolean r0 = r0.getHasEnrolledInstrumentEnabled()
            return r0
    }

    public boolean getOffscreenPreRaster() {
            r1 = this;
            org.chromium.support_lib_boundary.WebSettingsBoundaryInterface r0 = r1.mBoundaryInterface
            boolean r0 = r0.getOffscreenPreRaster()
            return r0
    }

    public boolean getPaymentRequestEnabled() {
            r1 = this;
            org.chromium.support_lib_boundary.WebSettingsBoundaryInterface r0 = r1.mBoundaryInterface
            boolean r0 = r0.getPaymentRequestEnabled()
            return r0
    }

    public java.util.Set<java.lang.String> getRequestedWithHeaderOriginAllowList() {
            r1 = this;
            org.chromium.support_lib_boundary.WebSettingsBoundaryInterface r0 = r1.mBoundaryInterface
            java.util.Set r0 = r0.getRequestedWithHeaderOriginAllowList()
            return r0
    }

    public boolean getSafeBrowsingEnabled() {
            r1 = this;
            org.chromium.support_lib_boundary.WebSettingsBoundaryInterface r0 = r1.mBoundaryInterface
            boolean r0 = r0.getSafeBrowsingEnabled()
            return r0
    }

    public int getSpeculativeLoadingStatus() {
            r1 = this;
            org.chromium.support_lib_boundary.WebSettingsBoundaryInterface r0 = r1.mBoundaryInterface
            int r0 = r0.getSpeculativeLoadingStatus()
            return r0
    }

    public androidx.webkit.UserAgentMetadata getUserAgentMetadata() {
            r1 = this;
            org.chromium.support_lib_boundary.WebSettingsBoundaryInterface r0 = r1.mBoundaryInterface
            java.util.Map r0 = r0.getUserAgentMetadataMap()
            androidx.webkit.UserAgentMetadata r0 = androidx.webkit.internal.UserAgentMetadataInternal.getUserAgentMetadataFromMap(r0)
            return r0
    }

    public int getWebAuthenticationSupport() {
            r1 = this;
            org.chromium.support_lib_boundary.WebSettingsBoundaryInterface r0 = r1.mBoundaryInterface
            int r0 = r0.getWebauthnSupport()
            return r0
    }

    public androidx.webkit.WebViewMediaIntegrityApiStatusConfig getWebViewMediaIntegrityApiStatus() {
            r2 = this;
            androidx.webkit.WebViewMediaIntegrityApiStatusConfig$Builder r0 = new androidx.webkit.WebViewMediaIntegrityApiStatusConfig$Builder
            org.chromium.support_lib_boundary.WebSettingsBoundaryInterface r1 = r2.mBoundaryInterface
            int r1 = r1.getWebViewMediaIntegrityApiDefaultStatus()
            r0.<init>(r1)
            org.chromium.support_lib_boundary.WebSettingsBoundaryInterface r1 = r2.mBoundaryInterface
            java.util.Map r1 = r1.getWebViewMediaIntegrityApiOverrideRules()
            androidx.webkit.WebViewMediaIntegrityApiStatusConfig$Builder r0 = r0.setOverrideRules(r1)
            androidx.webkit.WebViewMediaIntegrityApiStatusConfig r0 = r0.build()
            return r0
    }

    public boolean isAlgorithmicDarkeningAllowed() {
            r1 = this;
            org.chromium.support_lib_boundary.WebSettingsBoundaryInterface r0 = r1.mBoundaryInterface
            boolean r0 = r0.isAlgorithmicDarkeningAllowed()
            return r0
    }

    public void setAlgorithmicDarkeningAllowed(boolean r2) {
            r1 = this;
            org.chromium.support_lib_boundary.WebSettingsBoundaryInterface r0 = r1.mBoundaryInterface
            r0.setAlgorithmicDarkeningAllowed(r2)
            return
    }

    public void setAttributionRegistrationBehavior(int r2) {
            r1 = this;
            org.chromium.support_lib_boundary.WebSettingsBoundaryInterface r0 = r1.mBoundaryInterface
            r0.setAttributionBehavior(r2)
            return
    }

    public void setBackForwardCacheEnabled(boolean r2) {
            r1 = this;
            org.chromium.support_lib_boundary.WebSettingsBoundaryInterface r0 = r1.mBoundaryInterface
            r0.setBackForwardCacheEnabled(r2)
            return
    }

    public void setDisabledActionModeMenuItems(int r2) {
            r1 = this;
            org.chromium.support_lib_boundary.WebSettingsBoundaryInterface r0 = r1.mBoundaryInterface
            r0.setDisabledActionModeMenuItems(r2)
            return
    }

    public void setEnterpriseAuthenticationAppLinkPolicyEnabled(boolean r2) {
            r1 = this;
            org.chromium.support_lib_boundary.WebSettingsBoundaryInterface r0 = r1.mBoundaryInterface
            r0.setEnterpriseAuthenticationAppLinkPolicyEnabled(r2)
            return
    }

    public void setForceDark(int r2) {
            r1 = this;
            org.chromium.support_lib_boundary.WebSettingsBoundaryInterface r0 = r1.mBoundaryInterface
            r0.setForceDark(r2)
            return
    }

    public void setForceDarkStrategy(int r2) {
            r1 = this;
            org.chromium.support_lib_boundary.WebSettingsBoundaryInterface r0 = r1.mBoundaryInterface
            r0.setForceDarkBehavior(r2)
            return
    }

    public void setHasEnrolledInstrumentEnabled(boolean r2) {
            r1 = this;
            org.chromium.support_lib_boundary.WebSettingsBoundaryInterface r0 = r1.mBoundaryInterface
            r0.setHasEnrolledInstrumentEnabled(r2)
            return
    }

    public void setOffscreenPreRaster(boolean r2) {
            r1 = this;
            org.chromium.support_lib_boundary.WebSettingsBoundaryInterface r0 = r1.mBoundaryInterface
            r0.setOffscreenPreRaster(r2)
            return
    }

    public void setPaymentRequestEnabled(boolean r2) {
            r1 = this;
            org.chromium.support_lib_boundary.WebSettingsBoundaryInterface r0 = r1.mBoundaryInterface
            r0.setPaymentRequestEnabled(r2)
            return
    }

    public void setRequestedWithHeaderOriginAllowList(java.util.Set<java.lang.String> r2) {
            r1 = this;
            org.chromium.support_lib_boundary.WebSettingsBoundaryInterface r0 = r1.mBoundaryInterface
            r0.setRequestedWithHeaderOriginAllowList(r2)
            return
    }

    public void setSafeBrowsingEnabled(boolean r2) {
            r1 = this;
            org.chromium.support_lib_boundary.WebSettingsBoundaryInterface r0 = r1.mBoundaryInterface
            r0.setSafeBrowsingEnabled(r2)
            return
    }

    public void setSpeculativeLoadingStatus(int r2) {
            r1 = this;
            org.chromium.support_lib_boundary.WebSettingsBoundaryInterface r0 = r1.mBoundaryInterface
            r0.setSpeculativeLoadingStatus(r2)
            return
    }

    public void setUserAgentMetadata(androidx.webkit.UserAgentMetadata r3) {
            r2 = this;
            org.chromium.support_lib_boundary.WebSettingsBoundaryInterface r0 = r2.mBoundaryInterface
            java.util.Map r1 = androidx.webkit.internal.UserAgentMetadataInternal.convertUserAgentMetadataToMap(r3)
            r0.setUserAgentMetadataFromMap(r1)
            return
    }

    public void setWebAuthenticationSupport(int r2) {
            r1 = this;
            org.chromium.support_lib_boundary.WebSettingsBoundaryInterface r0 = r1.mBoundaryInterface
            r0.setWebauthnSupport(r2)
            return
    }

    public void setWebViewMediaIntegrityApiStatus(androidx.webkit.WebViewMediaIntegrityApiStatusConfig r4) {
            r3 = this;
            org.chromium.support_lib_boundary.WebSettingsBoundaryInterface r0 = r3.mBoundaryInterface
            int r1 = r4.getDefaultStatus()
            java.util.Map r2 = r4.getOverrideRules()
            r0.setWebViewMediaIntegrityApiStatus(r1, r2)
            return
    }
}
