package androidx.webkit;

/* JADX INFO: loaded from: classes.dex */
public class WebSettingsCompat {
    public static final int ATTRIBUTION_BEHAVIOR_APP_SOURCE_AND_APP_TRIGGER = 3;
    public static final int ATTRIBUTION_BEHAVIOR_APP_SOURCE_AND_WEB_TRIGGER = 1;
    public static final int ATTRIBUTION_BEHAVIOR_DISABLED = 0;
    public static final int ATTRIBUTION_BEHAVIOR_WEB_SOURCE_AND_WEB_TRIGGER = 2;

    @java.lang.Deprecated
    public static final int DARK_STRATEGY_PREFER_WEB_THEME_OVER_USER_AGENT_DARKENING = 2;

    @java.lang.Deprecated
    public static final int DARK_STRATEGY_USER_AGENT_DARKENING_ONLY = 0;

    @java.lang.Deprecated
    public static final int DARK_STRATEGY_WEB_THEME_DARKENING_ONLY = 1;

    @java.lang.Deprecated
    public static final int FORCE_DARK_AUTO = 1;

    @java.lang.Deprecated
    public static final int FORCE_DARK_OFF = 0;

    @java.lang.Deprecated
    public static final int FORCE_DARK_ON = 2;
    public static final int SPECULATIVE_LOADING_DISABLED = 0;
    public static final int SPECULATIVE_LOADING_PRERENDER_ENABLED = 1;
    private static final java.lang.String TAG = "WebSettingsCompat";
    public static final int WEB_AUTHENTICATION_SUPPORT_FOR_APP = 1;
    public static final int WEB_AUTHENTICATION_SUPPORT_FOR_BROWSER = 2;
    public static final int WEB_AUTHENTICATION_SUPPORT_NONE = 0;

    @java.lang.annotation.Target({java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.TYPE})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
    public @interface ExperimentalBackForwardCache {
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.TYPE})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
    public @interface ExperimentalSpeculativeLoading {
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.METHOD})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface ForceDark {
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.METHOD})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface ForceDarkStrategy {
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.METHOD})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface MenuItemFlags {
    }

    private WebSettingsCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    private static androidx.webkit.internal.WebSettingsAdapter getAdapter(android.webkit.WebSettings r3) {
            androidx.webkit.internal.WebkitToCompatConverter r0 = androidx.webkit.internal.WebViewGlueCommunicator.getCompatConverter()     // Catch: java.lang.ClassCastException -> L9
            androidx.webkit.internal.WebSettingsAdapter r0 = r0.convertSettings(r3)     // Catch: java.lang.ClassCastException -> L9
            return r0
        L9:
            r0 = move-exception
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 30
            if (r1 != r2) goto L2d
            java.lang.Class r1 = r3.getClass()
            java.lang.String r1 = r1.getCanonicalName()
            java.lang.String r2 = "android.webkit.WebSettingsWrapper"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L2d
            java.lang.String r1 = "WebSettingsCompat"
            java.lang.String r2 = "Error converting WebSettings to Chrome implementation. All AndroidX method calls on this WebSettings instance will be no-op calls. See https://crbug.com/388824130 for more info."
            android.util.Log.e(r1, r2, r0)
            androidx.webkit.internal.WebSettingsNoOpAdapter r1 = new androidx.webkit.internal.WebSettingsNoOpAdapter
            r1.<init>()
            return r1
        L2d:
            throw r0
    }

    public static int getAttributionRegistrationBehavior(android.webkit.WebSettings r2) {
            androidx.webkit.internal.ApiFeature$NoFramework r0 = androidx.webkit.internal.WebViewFeatureInternal.ATTRIBUTION_REGISTRATION_BEHAVIOR
            boolean r1 = r0.isSupportedByWebView()
            if (r1 == 0) goto L11
            androidx.webkit.internal.WebSettingsAdapter r1 = getAdapter(r2)
            int r1 = r1.getAttributionRegistrationBehavior()
            return r1
        L11:
            java.lang.UnsupportedOperationException r1 = androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException()
            throw r1
    }

    public static boolean getBackForwardCacheEnabled(android.webkit.WebSettings r2) {
            androidx.webkit.internal.ApiFeature$NoFramework r0 = androidx.webkit.internal.WebViewFeatureInternal.BACK_FORWARD_CACHE
            boolean r1 = r0.isSupportedByWebView()
            if (r1 == 0) goto L11
            androidx.webkit.internal.WebSettingsAdapter r1 = getAdapter(r2)
            boolean r1 = r1.getBackForwardCacheEnabled()
            return r1
        L11:
            java.lang.UnsupportedOperationException r1 = androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException()
            throw r1
    }

    public static int getDisabledActionModeMenuItems(android.webkit.WebSettings r2) {
            androidx.webkit.internal.ApiFeature$N r0 = androidx.webkit.internal.WebViewFeatureInternal.DISABLED_ACTION_MODE_MENU_ITEMS
            boolean r1 = r0.isSupportedByFramework()
            if (r1 == 0) goto Ld
            int r1 = androidx.webkit.internal.ApiHelperForN.getDisabledActionModeMenuItems(r2)
            return r1
        Ld:
            boolean r1 = r0.isSupportedByWebView()
            if (r1 == 0) goto L1c
            androidx.webkit.internal.WebSettingsAdapter r1 = getAdapter(r2)
            int r1 = r1.getDisabledActionModeMenuItems()
            return r1
        L1c:
            java.lang.UnsupportedOperationException r1 = androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException()
            throw r1
    }

    public static boolean getEnterpriseAuthenticationAppLinkPolicyEnabled(android.webkit.WebSettings r2) {
            androidx.webkit.internal.ApiFeature$NoFramework r0 = androidx.webkit.internal.WebViewFeatureInternal.ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY
            boolean r1 = r0.isSupportedByWebView()
            if (r1 == 0) goto L11
            androidx.webkit.internal.WebSettingsAdapter r1 = getAdapter(r2)
            boolean r1 = r1.getEnterpriseAuthenticationAppLinkPolicyEnabled()
            return r1
        L11:
            java.lang.UnsupportedOperationException r1 = androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException()
            throw r1
    }

    @java.lang.Deprecated
    public static int getForceDark(android.webkit.WebSettings r2) {
            androidx.webkit.internal.ApiFeature$Q r0 = androidx.webkit.internal.WebViewFeatureInternal.FORCE_DARK
            boolean r1 = r0.isSupportedByFramework()
            if (r1 == 0) goto Ld
            int r1 = androidx.webkit.internal.ApiHelperForQ.getForceDark(r2)
            return r1
        Ld:
            boolean r1 = r0.isSupportedByWebView()
            if (r1 == 0) goto L1c
            androidx.webkit.internal.WebSettingsAdapter r1 = getAdapter(r2)
            int r1 = r1.getForceDark()
            return r1
        L1c:
            java.lang.UnsupportedOperationException r1 = androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException()
            throw r1
    }

    @java.lang.Deprecated
    public static int getForceDarkStrategy(android.webkit.WebSettings r2) {
            androidx.webkit.internal.ApiFeature$NoFramework r0 = androidx.webkit.internal.WebViewFeatureInternal.FORCE_DARK_STRATEGY
            boolean r1 = r0.isSupportedByWebView()
            if (r1 == 0) goto L11
            androidx.webkit.internal.WebSettingsAdapter r1 = getAdapter(r2)
            int r1 = r1.getForceDark()
            return r1
        L11:
            java.lang.UnsupportedOperationException r1 = androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException()
            throw r1
    }

    public static boolean getHasEnrolledInstrumentEnabled(android.webkit.WebSettings r2) {
            androidx.webkit.internal.ApiFeature$NoFramework r0 = androidx.webkit.internal.WebViewFeatureInternal.PAYMENT_REQUEST
            boolean r1 = r0.isSupportedByWebView()
            if (r1 == 0) goto L11
            androidx.webkit.internal.WebSettingsAdapter r1 = getAdapter(r2)
            boolean r1 = r1.getHasEnrolledInstrumentEnabled()
            return r1
        L11:
            java.lang.UnsupportedOperationException r1 = androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException()
            throw r1
    }

    public static boolean getOffscreenPreRaster(android.webkit.WebSettings r2) {
            androidx.webkit.internal.ApiFeature$M r0 = androidx.webkit.internal.WebViewFeatureInternal.OFF_SCREEN_PRERASTER
            boolean r1 = r0.isSupportedByFramework()
            if (r1 == 0) goto Ld
            boolean r1 = androidx.webkit.internal.ApiHelperForM.getOffscreenPreRaster(r2)
            return r1
        Ld:
            boolean r1 = r0.isSupportedByWebView()
            if (r1 == 0) goto L1c
            androidx.webkit.internal.WebSettingsAdapter r1 = getAdapter(r2)
            boolean r1 = r1.getOffscreenPreRaster()
            return r1
        L1c:
            java.lang.UnsupportedOperationException r1 = androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException()
            throw r1
    }

    public static boolean getPaymentRequestEnabled(android.webkit.WebSettings r2) {
            androidx.webkit.internal.ApiFeature$NoFramework r0 = androidx.webkit.internal.WebViewFeatureInternal.PAYMENT_REQUEST
            boolean r1 = r0.isSupportedByWebView()
            if (r1 == 0) goto L11
            androidx.webkit.internal.WebSettingsAdapter r1 = getAdapter(r2)
            boolean r1 = r1.getPaymentRequestEnabled()
            return r1
        L11:
            java.lang.UnsupportedOperationException r1 = androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException()
            throw r1
    }

    public static java.util.Set<java.lang.String> getRequestedWithHeaderOriginAllowList(android.webkit.WebSettings r2) {
            androidx.webkit.internal.ApiFeature$NoFramework r0 = androidx.webkit.internal.WebViewFeatureInternal.REQUESTED_WITH_HEADER_ALLOW_LIST
            boolean r1 = r0.isSupportedByWebView()
            if (r1 == 0) goto L11
            androidx.webkit.internal.WebSettingsAdapter r1 = getAdapter(r2)
            java.util.Set r1 = r1.getRequestedWithHeaderOriginAllowList()
            return r1
        L11:
            java.lang.UnsupportedOperationException r1 = androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException()
            throw r1
    }

    public static boolean getSafeBrowsingEnabled(android.webkit.WebSettings r2) {
            androidx.webkit.internal.ApiFeature$O r0 = androidx.webkit.internal.WebViewFeatureInternal.SAFE_BROWSING_ENABLE
            boolean r1 = r0.isSupportedByFramework()
            if (r1 == 0) goto Ld
            boolean r1 = androidx.webkit.internal.ApiHelperForO.getSafeBrowsingEnabled(r2)
            return r1
        Ld:
            boolean r1 = r0.isSupportedByWebView()
            if (r1 == 0) goto L1c
            androidx.webkit.internal.WebSettingsAdapter r1 = getAdapter(r2)
            boolean r1 = r1.getSafeBrowsingEnabled()
            return r1
        L1c:
            java.lang.UnsupportedOperationException r1 = androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException()
            throw r1
    }

    public static int getSpeculativeLoadingStatus(android.webkit.WebSettings r2) {
            androidx.webkit.internal.ApiFeature$NoFramework r0 = androidx.webkit.internal.WebViewFeatureInternal.SPECULATIVE_LOADING
            boolean r1 = r0.isSupportedByWebView()
            if (r1 == 0) goto L11
            androidx.webkit.internal.WebSettingsAdapter r1 = getAdapter(r2)
            int r1 = r1.getSpeculativeLoadingStatus()
            return r1
        L11:
            java.lang.UnsupportedOperationException r1 = androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException()
            throw r1
    }

    public static androidx.webkit.UserAgentMetadata getUserAgentMetadata(android.webkit.WebSettings r2) {
            androidx.webkit.internal.ApiFeature$NoFramework r0 = androidx.webkit.internal.WebViewFeatureInternal.USER_AGENT_METADATA
            boolean r1 = r0.isSupportedByWebView()
            if (r1 == 0) goto L11
            androidx.webkit.internal.WebSettingsAdapter r1 = getAdapter(r2)
            androidx.webkit.UserAgentMetadata r1 = r1.getUserAgentMetadata()
            return r1
        L11:
            java.lang.UnsupportedOperationException r1 = androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException()
            throw r1
    }

    public static int getWebAuthenticationSupport(android.webkit.WebSettings r2) {
            androidx.webkit.internal.ApiFeature$NoFramework r0 = androidx.webkit.internal.WebViewFeatureInternal.WEB_AUTHENTICATION
            boolean r1 = r0.isSupportedByWebView()
            if (r1 == 0) goto L11
            androidx.webkit.internal.WebSettingsAdapter r1 = getAdapter(r2)
            int r1 = r1.getWebAuthenticationSupport()
            return r1
        L11:
            java.lang.UnsupportedOperationException r1 = androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException()
            throw r1
    }

    public static androidx.webkit.WebViewMediaIntegrityApiStatusConfig getWebViewMediaIntegrityApiStatus(android.webkit.WebSettings r2) {
            androidx.webkit.internal.ApiFeature$NoFramework r0 = androidx.webkit.internal.WebViewFeatureInternal.WEBVIEW_MEDIA_INTEGRITY_API_STATUS
            boolean r1 = r0.isSupportedByWebView()
            if (r1 == 0) goto L11
            androidx.webkit.internal.WebSettingsAdapter r1 = getAdapter(r2)
            androidx.webkit.WebViewMediaIntegrityApiStatusConfig r1 = r1.getWebViewMediaIntegrityApiStatus()
            return r1
        L11:
            java.lang.UnsupportedOperationException r1 = androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException()
            throw r1
    }

    public static boolean isAlgorithmicDarkeningAllowed(android.webkit.WebSettings r2) {
            androidx.webkit.internal.ApiFeature$T r0 = androidx.webkit.internal.WebViewFeatureInternal.ALGORITHMIC_DARKENING
            boolean r1 = r0.isSupportedByWebView()
            if (r1 == 0) goto L11
            androidx.webkit.internal.WebSettingsAdapter r1 = getAdapter(r2)
            boolean r1 = r1.isAlgorithmicDarkeningAllowed()
            return r1
        L11:
            java.lang.UnsupportedOperationException r1 = androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException()
            throw r1
    }

    public static void setAlgorithmicDarkeningAllowed(android.webkit.WebSettings r2, boolean r3) {
            androidx.webkit.internal.ApiFeature$T r0 = androidx.webkit.internal.WebViewFeatureInternal.ALGORITHMIC_DARKENING
            boolean r1 = r0.isSupportedByWebView()
            if (r1 == 0) goto L10
            androidx.webkit.internal.WebSettingsAdapter r1 = getAdapter(r2)
            r1.setAlgorithmicDarkeningAllowed(r3)
            return
        L10:
            java.lang.UnsupportedOperationException r1 = androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException()
            throw r1
    }

    public static void setAttributionRegistrationBehavior(android.webkit.WebSettings r2, int r3) {
            androidx.webkit.internal.ApiFeature$NoFramework r0 = androidx.webkit.internal.WebViewFeatureInternal.ATTRIBUTION_REGISTRATION_BEHAVIOR
            boolean r1 = r0.isSupportedByWebView()
            if (r1 == 0) goto L10
            androidx.webkit.internal.WebSettingsAdapter r1 = getAdapter(r2)
            r1.setAttributionRegistrationBehavior(r3)
            return
        L10:
            java.lang.UnsupportedOperationException r1 = androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException()
            throw r1
    }

    public static void setBackForwardCacheEnabled(android.webkit.WebSettings r2, boolean r3) {
            androidx.webkit.internal.ApiFeature$NoFramework r0 = androidx.webkit.internal.WebViewFeatureInternal.BACK_FORWARD_CACHE
            boolean r1 = r0.isSupportedByWebView()
            if (r1 == 0) goto L10
            androidx.webkit.internal.WebSettingsAdapter r1 = getAdapter(r2)
            r1.setBackForwardCacheEnabled(r3)
            return
        L10:
            java.lang.UnsupportedOperationException r1 = androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException()
            throw r1
    }

    public static void setDisabledActionModeMenuItems(android.webkit.WebSettings r2, int r3) {
            androidx.webkit.internal.ApiFeature$N r0 = androidx.webkit.internal.WebViewFeatureInternal.DISABLED_ACTION_MODE_MENU_ITEMS
            boolean r1 = r0.isSupportedByFramework()
            if (r1 == 0) goto Lc
            androidx.webkit.internal.ApiHelperForN.setDisabledActionModeMenuItems(r2, r3)
            goto L19
        Lc:
            boolean r1 = r0.isSupportedByWebView()
            if (r1 == 0) goto L1a
            androidx.webkit.internal.WebSettingsAdapter r1 = getAdapter(r2)
            r1.setDisabledActionModeMenuItems(r3)
        L19:
            return
        L1a:
            java.lang.UnsupportedOperationException r1 = androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException()
            throw r1
    }

    public static void setEnterpriseAuthenticationAppLinkPolicyEnabled(android.webkit.WebSettings r2, boolean r3) {
            androidx.webkit.internal.ApiFeature$NoFramework r0 = androidx.webkit.internal.WebViewFeatureInternal.ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY
            boolean r1 = r0.isSupportedByWebView()
            if (r1 == 0) goto L10
            androidx.webkit.internal.WebSettingsAdapter r1 = getAdapter(r2)
            r1.setEnterpriseAuthenticationAppLinkPolicyEnabled(r3)
            return
        L10:
            java.lang.UnsupportedOperationException r1 = androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException()
            throw r1
    }

    @java.lang.Deprecated
    public static void setForceDark(android.webkit.WebSettings r2, int r3) {
            androidx.webkit.internal.ApiFeature$Q r0 = androidx.webkit.internal.WebViewFeatureInternal.FORCE_DARK
            boolean r1 = r0.isSupportedByFramework()
            if (r1 == 0) goto Lc
            androidx.webkit.internal.ApiHelperForQ.setForceDark(r2, r3)
            goto L19
        Lc:
            boolean r1 = r0.isSupportedByWebView()
            if (r1 == 0) goto L1a
            androidx.webkit.internal.WebSettingsAdapter r1 = getAdapter(r2)
            r1.setForceDark(r3)
        L19:
            return
        L1a:
            java.lang.UnsupportedOperationException r1 = androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException()
            throw r1
    }

    @java.lang.Deprecated
    public static void setForceDarkStrategy(android.webkit.WebSettings r2, int r3) {
            androidx.webkit.internal.ApiFeature$NoFramework r0 = androidx.webkit.internal.WebViewFeatureInternal.FORCE_DARK_STRATEGY
            boolean r1 = r0.isSupportedByWebView()
            if (r1 == 0) goto L10
            androidx.webkit.internal.WebSettingsAdapter r1 = getAdapter(r2)
            r1.setForceDarkStrategy(r3)
            return
        L10:
            java.lang.UnsupportedOperationException r1 = androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException()
            throw r1
    }

    public static void setHasEnrolledInstrumentEnabled(android.webkit.WebSettings r2, boolean r3) {
            androidx.webkit.internal.ApiFeature$NoFramework r0 = androidx.webkit.internal.WebViewFeatureInternal.PAYMENT_REQUEST
            boolean r1 = r0.isSupportedByWebView()
            if (r1 == 0) goto L10
            androidx.webkit.internal.WebSettingsAdapter r1 = getAdapter(r2)
            r1.setHasEnrolledInstrumentEnabled(r3)
            return
        L10:
            java.lang.UnsupportedOperationException r1 = androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException()
            throw r1
    }

    public static void setOffscreenPreRaster(android.webkit.WebSettings r2, boolean r3) {
            androidx.webkit.internal.ApiFeature$M r0 = androidx.webkit.internal.WebViewFeatureInternal.OFF_SCREEN_PRERASTER
            boolean r1 = r0.isSupportedByFramework()
            if (r1 == 0) goto Lc
            androidx.webkit.internal.ApiHelperForM.setOffscreenPreRaster(r2, r3)
            goto L19
        Lc:
            boolean r1 = r0.isSupportedByWebView()
            if (r1 == 0) goto L1a
            androidx.webkit.internal.WebSettingsAdapter r1 = getAdapter(r2)
            r1.setOffscreenPreRaster(r3)
        L19:
            return
        L1a:
            java.lang.UnsupportedOperationException r1 = androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException()
            throw r1
    }

    public static void setPaymentRequestEnabled(android.webkit.WebSettings r2, boolean r3) {
            androidx.webkit.internal.ApiFeature$NoFramework r0 = androidx.webkit.internal.WebViewFeatureInternal.PAYMENT_REQUEST
            boolean r1 = r0.isSupportedByWebView()
            if (r1 == 0) goto L10
            androidx.webkit.internal.WebSettingsAdapter r1 = getAdapter(r2)
            r1.setPaymentRequestEnabled(r3)
            return
        L10:
            java.lang.UnsupportedOperationException r1 = androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException()
            throw r1
    }

    public static void setRequestedWithHeaderOriginAllowList(android.webkit.WebSettings r2, java.util.Set<java.lang.String> r3) {
            androidx.webkit.internal.ApiFeature$NoFramework r0 = androidx.webkit.internal.WebViewFeatureInternal.REQUESTED_WITH_HEADER_ALLOW_LIST
            boolean r1 = r0.isSupportedByWebView()
            if (r1 == 0) goto L10
            androidx.webkit.internal.WebSettingsAdapter r1 = getAdapter(r2)
            r1.setRequestedWithHeaderOriginAllowList(r3)
            return
        L10:
            java.lang.UnsupportedOperationException r1 = androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException()
            throw r1
    }

    public static void setSafeBrowsingEnabled(android.webkit.WebSettings r2, boolean r3) {
            androidx.webkit.internal.ApiFeature$O r0 = androidx.webkit.internal.WebViewFeatureInternal.SAFE_BROWSING_ENABLE
            boolean r1 = r0.isSupportedByFramework()
            if (r1 == 0) goto Lc
            androidx.webkit.internal.ApiHelperForO.setSafeBrowsingEnabled(r2, r3)
            goto L19
        Lc:
            boolean r1 = r0.isSupportedByWebView()
            if (r1 == 0) goto L1a
            androidx.webkit.internal.WebSettingsAdapter r1 = getAdapter(r2)
            r1.setSafeBrowsingEnabled(r3)
        L19:
            return
        L1a:
            java.lang.UnsupportedOperationException r1 = androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException()
            throw r1
    }

    public static void setSpeculativeLoadingStatus(android.webkit.WebSettings r2, int r3) {
            androidx.webkit.internal.ApiFeature$NoFramework r0 = androidx.webkit.internal.WebViewFeatureInternal.SPECULATIVE_LOADING
            boolean r1 = r0.isSupportedByWebView()
            if (r1 == 0) goto L10
            androidx.webkit.internal.WebSettingsAdapter r1 = getAdapter(r2)
            r1.setSpeculativeLoadingStatus(r3)
            return
        L10:
            java.lang.UnsupportedOperationException r1 = androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException()
            throw r1
    }

    public static void setUserAgentMetadata(android.webkit.WebSettings r2, androidx.webkit.UserAgentMetadata r3) {
            androidx.webkit.internal.ApiFeature$NoFramework r0 = androidx.webkit.internal.WebViewFeatureInternal.USER_AGENT_METADATA
            boolean r1 = r0.isSupportedByWebView()
            if (r1 == 0) goto L10
            androidx.webkit.internal.WebSettingsAdapter r1 = getAdapter(r2)
            r1.setUserAgentMetadata(r3)
            return
        L10:
            java.lang.UnsupportedOperationException r1 = androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException()
            throw r1
    }

    public static void setWebAuthenticationSupport(android.webkit.WebSettings r2, int r3) {
            androidx.webkit.internal.ApiFeature$NoFramework r0 = androidx.webkit.internal.WebViewFeatureInternal.WEB_AUTHENTICATION
            boolean r1 = r0.isSupportedByWebView()
            if (r1 == 0) goto L10
            androidx.webkit.internal.WebSettingsAdapter r1 = getAdapter(r2)
            r1.setWebAuthenticationSupport(r3)
            return
        L10:
            java.lang.UnsupportedOperationException r1 = androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException()
            throw r1
    }

    public static void setWebViewMediaIntegrityApiStatus(android.webkit.WebSettings r2, androidx.webkit.WebViewMediaIntegrityApiStatusConfig r3) {
            androidx.webkit.internal.ApiFeature$NoFramework r0 = androidx.webkit.internal.WebViewFeatureInternal.WEBVIEW_MEDIA_INTEGRITY_API_STATUS
            boolean r1 = r0.isSupportedByWebView()
            if (r1 == 0) goto L10
            androidx.webkit.internal.WebSettingsAdapter r1 = getAdapter(r2)
            r1.setWebViewMediaIntegrityApiStatus(r3)
            return
        L10:
            java.lang.UnsupportedOperationException r1 = androidx.webkit.internal.WebViewFeatureInternal.getUnsupportedOperationException()
            throw r1
    }
}
