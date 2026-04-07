package com.getcapacitor.plugin.util;

/* JADX INFO: loaded from: classes4.dex */
enum MimeType extends java.lang.Enum<com.getcapacitor.plugin.util.MimeType> {
    private static final /* synthetic */ com.getcapacitor.plugin.util.MimeType[] $VALUES = null;
    public static final com.getcapacitor.plugin.util.MimeType APPLICATION_JSON = null;
    public static final com.getcapacitor.plugin.util.MimeType APPLICATION_VND_API_JSON = null;
    public static final com.getcapacitor.plugin.util.MimeType TEXT_HTML = null;
    private final java.lang.String value;

    private static /* synthetic */ com.getcapacitor.plugin.util.MimeType[] $values() {
            com.getcapacitor.plugin.util.MimeType r0 = com.getcapacitor.plugin.util.MimeType.APPLICATION_JSON
            com.getcapacitor.plugin.util.MimeType r1 = com.getcapacitor.plugin.util.MimeType.APPLICATION_VND_API_JSON
            com.getcapacitor.plugin.util.MimeType r2 = com.getcapacitor.plugin.util.MimeType.TEXT_HTML
            com.getcapacitor.plugin.util.MimeType[] r0 = new com.getcapacitor.plugin.util.MimeType[]{r0, r1, r2}
            return r0
    }

    static {
            com.getcapacitor.plugin.util.MimeType r0 = new com.getcapacitor.plugin.util.MimeType
            r1 = 0
            java.lang.String r2 = "application/json"
            java.lang.String r3 = "APPLICATION_JSON"
            r0.<init>(r3, r1, r2)
            com.getcapacitor.plugin.util.MimeType.APPLICATION_JSON = r0
            com.getcapacitor.plugin.util.MimeType r0 = new com.getcapacitor.plugin.util.MimeType
            r1 = 1
            java.lang.String r2 = "application/vnd.api+json"
            java.lang.String r3 = "APPLICATION_VND_API_JSON"
            r0.<init>(r3, r1, r2)
            com.getcapacitor.plugin.util.MimeType.APPLICATION_VND_API_JSON = r0
            com.getcapacitor.plugin.util.MimeType r0 = new com.getcapacitor.plugin.util.MimeType
            r1 = 2
            java.lang.String r2 = "text/html"
            java.lang.String r3 = "TEXT_HTML"
            r0.<init>(r3, r1, r2)
            com.getcapacitor.plugin.util.MimeType.TEXT_HTML = r0
            com.getcapacitor.plugin.util.MimeType[] r0 = $values()
            com.getcapacitor.plugin.util.MimeType.$VALUES = r0
            return
    }

    MimeType(java.lang.String r1, int r2, java.lang.String r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.value = r3
            return
    }

    public static com.getcapacitor.plugin.util.MimeType valueOf(java.lang.String r1) {
            java.lang.Class<com.getcapacitor.plugin.util.MimeType> r0 = com.getcapacitor.plugin.util.MimeType.class
            java.lang.Enum r0 = java.lang.Enum.valueOf(r0, r1)
            com.getcapacitor.plugin.util.MimeType r0 = (com.getcapacitor.plugin.util.MimeType) r0
            return r0
    }

    public static com.getcapacitor.plugin.util.MimeType[] values() {
            com.getcapacitor.plugin.util.MimeType[] r0 = com.getcapacitor.plugin.util.MimeType.$VALUES
            java.lang.Object r0 = r0.clone()
            com.getcapacitor.plugin.util.MimeType[] r0 = (com.getcapacitor.plugin.util.MimeType[]) r0
            return r0
    }

    java.lang.String getValue() {
            r1 = this;
            java.lang.String r0 = r1.value
            return r0
    }
}
