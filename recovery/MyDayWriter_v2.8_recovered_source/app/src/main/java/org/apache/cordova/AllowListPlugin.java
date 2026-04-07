package org.apache.cordova;

/* JADX INFO: loaded from: classes7.dex */
public class AllowListPlugin extends org.apache.cordova.CordovaPlugin {
    protected static final java.lang.String LOG_TAG = "CordovaAllowListPlugin";
    public static final java.lang.String PLUGIN_NAME = "CordovaAllowListPlugin";
    private org.apache.cordova.AllowList allowedIntents;
    private org.apache.cordova.AllowList allowedNavigations;
    private org.apache.cordova.AllowList allowedRequests;

    private class CustomConfigXmlParser extends org.apache.cordova.ConfigXmlParser {
        private org.apache.cordova.CordovaPreferences prefs;
        final /* synthetic */ org.apache.cordova.AllowListPlugin this$0;

        private CustomConfigXmlParser(org.apache.cordova.AllowListPlugin r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                org.apache.cordova.CordovaPreferences r1 = new org.apache.cordova.CordovaPreferences
                r1.<init>()
                r0.prefs = r1
                return
        }

        /* synthetic */ CustomConfigXmlParser(org.apache.cordova.AllowListPlugin r1, org.apache.cordova.AllowListPluginIA r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // org.apache.cordova.ConfigXmlParser
        public void handleEndTag(org.xmlpull.v1.XmlPullParser r1) {
                r0 = this;
                return
        }

        @Override // org.apache.cordova.ConfigXmlParser
        public void handleStartTag(org.xmlpull.v1.XmlPullParser r9) {
                r8 = this;
                java.lang.String r0 = r9.getName()
                java.lang.String r1 = "content"
                boolean r1 = r0.equals(r1)
                r2 = 0
                r3 = 0
                if (r1 == 0) goto L1f
                java.lang.String r1 = "src"
                java.lang.String r1 = r9.getAttributeValue(r2, r1)
                org.apache.cordova.AllowListPlugin r2 = r8.this$0
                org.apache.cordova.AllowList r2 = org.apache.cordova.AllowListPlugin.m1726$$Nest$fgetallowedNavigations(r2)
                r2.addAllowListEntry(r1, r3)
                goto Lbc
            L1f:
                java.lang.String r1 = "allow-navigation"
                boolean r1 = r0.equals(r1)
                java.lang.String r4 = "https://*/*"
                java.lang.String r5 = "http://*/*"
                java.lang.String r6 = "*"
                java.lang.String r7 = "href"
                if (r1 == 0) goto L61
                java.lang.String r1 = r9.getAttributeValue(r2, r7)
                boolean r2 = r6.equals(r1)
                if (r2 == 0) goto L57
                org.apache.cordova.AllowListPlugin r2 = r8.this$0
                org.apache.cordova.AllowList r2 = org.apache.cordova.AllowListPlugin.m1726$$Nest$fgetallowedNavigations(r2)
                r2.addAllowListEntry(r5, r3)
                org.apache.cordova.AllowListPlugin r2 = r8.this$0
                org.apache.cordova.AllowList r2 = org.apache.cordova.AllowListPlugin.m1726$$Nest$fgetallowedNavigations(r2)
                r2.addAllowListEntry(r4, r3)
                org.apache.cordova.AllowListPlugin r2 = r8.this$0
                org.apache.cordova.AllowList r2 = org.apache.cordova.AllowListPlugin.m1726$$Nest$fgetallowedNavigations(r2)
                java.lang.String r4 = "data:*"
                r2.addAllowListEntry(r4, r3)
                goto L60
            L57:
                org.apache.cordova.AllowListPlugin r2 = r8.this$0
                org.apache.cordova.AllowList r2 = org.apache.cordova.AllowListPlugin.m1726$$Nest$fgetallowedNavigations(r2)
                r2.addAllowListEntry(r1, r3)
            L60:
                goto Lbc
            L61:
                java.lang.String r1 = "allow-intent"
                boolean r1 = r0.equals(r1)
                if (r1 == 0) goto L77
                java.lang.String r1 = r9.getAttributeValue(r2, r7)
                org.apache.cordova.AllowListPlugin r2 = r8.this$0
                org.apache.cordova.AllowList r2 = org.apache.cordova.AllowListPlugin.m1725$$Nest$fgetallowedIntents(r2)
                r2.addAllowListEntry(r1, r3)
                goto Lbb
            L77:
                java.lang.String r1 = "access"
                boolean r1 = r0.equals(r1)
                if (r1 == 0) goto Lbb
                java.lang.String r1 = "origin"
                java.lang.String r1 = r9.getAttributeValue(r2, r1)
                if (r1 == 0) goto Lbc
                boolean r6 = r6.equals(r1)
                if (r6 == 0) goto La0
                org.apache.cordova.AllowListPlugin r2 = r8.this$0
                org.apache.cordova.AllowList r2 = org.apache.cordova.AllowListPlugin.m1727$$Nest$fgetallowedRequests(r2)
                r2.addAllowListEntry(r5, r3)
                org.apache.cordova.AllowListPlugin r2 = r8.this$0
                org.apache.cordova.AllowList r2 = org.apache.cordova.AllowListPlugin.m1727$$Nest$fgetallowedRequests(r2)
                r2.addAllowListEntry(r4, r3)
                goto Lbc
            La0:
                java.lang.String r4 = "subdomains"
                java.lang.String r2 = r9.getAttributeValue(r2, r4)
                org.apache.cordova.AllowListPlugin r4 = r8.this$0
                org.apache.cordova.AllowList r4 = org.apache.cordova.AllowListPlugin.m1727$$Nest$fgetallowedRequests(r4)
                if (r2 == 0) goto Lb7
                java.lang.String r5 = "true"
                int r5 = r2.compareToIgnoreCase(r5)
                if (r5 != 0) goto Lb7
                r3 = 1
            Lb7:
                r4.addAllowListEntry(r1, r3)
                goto Lbc
            Lbb:
            Lbc:
                return
        }
    }

    /* JADX INFO: renamed from: -$$Nest$fgetallowedIntents, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.apache.cordova.AllowList m1725$$Nest$fgetallowedIntents(org.apache.cordova.AllowListPlugin r0) {
            org.apache.cordova.AllowList r0 = r0.allowedIntents
            return r0
    }

    /* JADX INFO: renamed from: -$$Nest$fgetallowedNavigations, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.apache.cordova.AllowList m1726$$Nest$fgetallowedNavigations(org.apache.cordova.AllowListPlugin r0) {
            org.apache.cordova.AllowList r0 = r0.allowedNavigations
            return r0
    }

    /* JADX INFO: renamed from: -$$Nest$fgetallowedRequests, reason: not valid java name */
    static /* bridge */ /* synthetic */ org.apache.cordova.AllowList m1727$$Nest$fgetallowedRequests(org.apache.cordova.AllowListPlugin r0) {
            org.apache.cordova.AllowList r0 = r0.allowedRequests
            return r0
    }

    public AllowListPlugin() {
            r0 = this;
            r0.<init>()
            return
    }

    public AllowListPlugin(android.content.Context r4) {
            r3 = this;
            org.apache.cordova.AllowList r0 = new org.apache.cordova.AllowList
            r0.<init>()
            org.apache.cordova.AllowList r1 = new org.apache.cordova.AllowList
            r1.<init>()
            r2 = 0
            r3.<init>(r0, r1, r2)
            org.apache.cordova.AllowListPlugin$CustomConfigXmlParser r0 = new org.apache.cordova.AllowListPlugin$CustomConfigXmlParser
            r0.<init>(r3, r2)
            r0.parse(r4)
            return
    }

    public AllowListPlugin(org.apache.cordova.AllowList r3, org.apache.cordova.AllowList r4, org.apache.cordova.AllowList r5) {
            r2 = this;
            r2.<init>()
            if (r5 != 0) goto L16
            org.apache.cordova.AllowList r0 = new org.apache.cordova.AllowList
            r0.<init>()
            r5 = r0
            java.lang.String r0 = "file:///*"
            r1 = 0
            r5.addAllowListEntry(r0, r1)
            java.lang.String r0 = "data:*"
            r5.addAllowListEntry(r0, r1)
        L16:
            r2.allowedNavigations = r3
            r2.allowedIntents = r4
            r2.allowedRequests = r5
            return
    }

    public AllowListPlugin(org.xmlpull.v1.XmlPullParser r4) {
            r3 = this;
            org.apache.cordova.AllowList r0 = new org.apache.cordova.AllowList
            r0.<init>()
            org.apache.cordova.AllowList r1 = new org.apache.cordova.AllowList
            r1.<init>()
            r2 = 0
            r3.<init>(r0, r1, r2)
            org.apache.cordova.AllowListPlugin$CustomConfigXmlParser r0 = new org.apache.cordova.AllowListPlugin$CustomConfigXmlParser
            r0.<init>(r3, r2)
            r0.parse(r4)
            return
    }

    public org.apache.cordova.AllowList getAllowedIntents() {
            r1 = this;
            org.apache.cordova.AllowList r0 = r1.allowedIntents
            return r0
    }

    public org.apache.cordova.AllowList getAllowedNavigations() {
            r1 = this;
            org.apache.cordova.AllowList r0 = r1.allowedNavigations
            return r0
    }

    public org.apache.cordova.AllowList getAllowedRequests() {
            r1 = this;
            org.apache.cordova.AllowList r0 = r1.allowedRequests
            return r0
    }

    @Override // org.apache.cordova.CordovaPlugin
    public void pluginInitialize() {
            r2 = this;
            org.apache.cordova.AllowList r0 = r2.allowedNavigations
            if (r0 != 0) goto L28
            org.apache.cordova.AllowList r0 = new org.apache.cordova.AllowList
            r0.<init>()
            r2.allowedNavigations = r0
            org.apache.cordova.AllowList r0 = new org.apache.cordova.AllowList
            r0.<init>()
            r2.allowedIntents = r0
            org.apache.cordova.AllowList r0 = new org.apache.cordova.AllowList
            r0.<init>()
            r2.allowedRequests = r0
            org.apache.cordova.AllowListPlugin$CustomConfigXmlParser r0 = new org.apache.cordova.AllowListPlugin$CustomConfigXmlParser
            r1 = 0
            r0.<init>(r2, r1)
            org.apache.cordova.CordovaWebView r1 = r2.webView
            android.content.Context r1 = r1.getContext()
            r0.parse(r1)
        L28:
            return
    }

    public void setAllowedIntents(org.apache.cordova.AllowList r1) {
            r0 = this;
            r0.allowedIntents = r1
            return
    }

    public void setAllowedNavigations(org.apache.cordova.AllowList r1) {
            r0 = this;
            r0.allowedNavigations = r1
            return
    }

    public void setAllowedRequests(org.apache.cordova.AllowList r1) {
            r0 = this;
            r0.allowedRequests = r1
            return
    }

    @Override // org.apache.cordova.CordovaPlugin
    public java.lang.Boolean shouldAllowNavigation(java.lang.String r2) {
            r1 = this;
            org.apache.cordova.AllowList r0 = r1.allowedNavigations
            boolean r0 = r0.isUrlAllowListed(r2)
            if (r0 == 0) goto Le
            r0 = 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @Override // org.apache.cordova.CordovaPlugin
    public java.lang.Boolean shouldAllowRequest(java.lang.String r3) {
            r2 = this;
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            java.lang.Boolean r1 = r2.shouldAllowNavigation(r3)
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L17
            org.apache.cordova.AllowList r0 = r2.allowedRequests
            boolean r0 = r0.isUrlAllowListed(r3)
            if (r0 == 0) goto L15
            goto L17
        L15:
            r0 = 0
            goto L1c
        L17:
            r0 = 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L1c:
            return r0
    }

    @Override // org.apache.cordova.CordovaPlugin
    public java.lang.Boolean shouldOpenExternalUrl(java.lang.String r2) {
            r1 = this;
            org.apache.cordova.AllowList r0 = r1.allowedIntents
            boolean r0 = r0.isUrlAllowListed(r2)
            if (r0 == 0) goto Le
            r0 = 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }
}
