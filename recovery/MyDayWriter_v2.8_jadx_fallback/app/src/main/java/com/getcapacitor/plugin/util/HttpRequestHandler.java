package com.getcapacitor.plugin.util;

/* JADX INFO: loaded from: classes4.dex */
public class HttpRequestHandler {

    public static class HttpURLConnectionBuilder {
        public java.lang.Integer connectTimeout;
        public com.getcapacitor.plugin.util.CapacitorHttpUrlConnection connection;
        public java.lang.Boolean disableRedirects;
        public com.getcapacitor.JSObject headers;
        public java.lang.String method;
        public java.lang.Integer readTimeout;
        public java.net.URL url;

        public HttpURLConnectionBuilder() {
                r0 = this;
                r0.<init>()
                return
        }

        private static void addUrlParam(java.lang.StringBuilder r3, java.lang.String r4, java.lang.String r5, boolean r6) {
                java.lang.String r0 = "UTF-8"
                if (r6 == 0) goto L1a
                java.lang.String r1 = java.net.URLEncoder.encode(r4, r0)     // Catch: java.io.UnsupportedEncodingException -> Lf
                r4 = r1
                java.lang.String r0 = java.net.URLEncoder.encode(r5, r0)     // Catch: java.io.UnsupportedEncodingException -> Lf
                r5 = r0
                goto L1a
            Lf:
                r0 = move-exception
                java.lang.RuntimeException r1 = new java.lang.RuntimeException
                java.lang.Throwable r2 = r0.getCause()
                r1.<init>(r2)
                throw r1
            L1a:
                java.lang.StringBuilder r0 = r3.append(r4)
                java.lang.String r1 = "="
                java.lang.StringBuilder r0 = r0.append(r1)
                r0.append(r5)
                return
        }

        public com.getcapacitor.plugin.util.CapacitorHttpUrlConnection build() {
                r1 = this;
                com.getcapacitor.plugin.util.CapacitorHttpUrlConnection r0 = r1.connection
                return r0
        }

        public com.getcapacitor.plugin.util.HttpRequestHandler.HttpURLConnectionBuilder openConnection() throws java.io.IOException {
                r2 = this;
                com.getcapacitor.plugin.util.CapacitorHttpUrlConnection r0 = new com.getcapacitor.plugin.util.CapacitorHttpUrlConnection
                java.net.URL r1 = r2.url
                java.net.URLConnection r1 = r1.openConnection()
                java.net.HttpURLConnection r1 = (java.net.HttpURLConnection) r1
                r0.<init>(r1)
                r2.connection = r0
                com.getcapacitor.plugin.util.CapacitorHttpUrlConnection r0 = r2.connection
                r1 = 0
                r0.setAllowUserInteraction(r1)
                com.getcapacitor.plugin.util.CapacitorHttpUrlConnection r0 = r2.connection
                java.lang.String r1 = r2.method
                r0.setRequestMethod(r1)
                java.lang.Integer r0 = r2.connectTimeout
                if (r0 == 0) goto L2b
                com.getcapacitor.plugin.util.CapacitorHttpUrlConnection r0 = r2.connection
                java.lang.Integer r1 = r2.connectTimeout
                int r1 = r1.intValue()
                r0.setConnectTimeout(r1)
            L2b:
                java.lang.Integer r0 = r2.readTimeout
                if (r0 == 0) goto L3a
                com.getcapacitor.plugin.util.CapacitorHttpUrlConnection r0 = r2.connection
                java.lang.Integer r1 = r2.readTimeout
                int r1 = r1.intValue()
                r0.setReadTimeout(r1)
            L3a:
                java.lang.Boolean r0 = r2.disableRedirects
                if (r0 == 0) goto L49
                com.getcapacitor.plugin.util.CapacitorHttpUrlConnection r0 = r2.connection
                java.lang.Boolean r1 = r2.disableRedirects
                boolean r1 = r1.booleanValue()
                r0.setDisableRedirects(r1)
            L49:
                com.getcapacitor.plugin.util.CapacitorHttpUrlConnection r0 = r2.connection
                com.getcapacitor.JSObject r1 = r2.headers
                r0.setRequestHeaders(r1)
                return r2
        }

        public com.getcapacitor.plugin.util.HttpRequestHandler.HttpURLConnectionBuilder setConnectTimeout(java.lang.Integer r1) {
                r0 = this;
                r0.connectTimeout = r1
                return r0
        }

        public com.getcapacitor.plugin.util.HttpRequestHandler.HttpURLConnectionBuilder setDisableRedirects(java.lang.Boolean r1) {
                r0 = this;
                r0.disableRedirects = r1
                return r0
        }

        public com.getcapacitor.plugin.util.HttpRequestHandler.HttpURLConnectionBuilder setHeaders(com.getcapacitor.JSObject r1) {
                r0 = this;
                r0.headers = r1
                return r0
        }

        public com.getcapacitor.plugin.util.HttpRequestHandler.HttpURLConnectionBuilder setMethod(java.lang.String r1) {
                r0 = this;
                r0.method = r1
                return r0
        }

        public com.getcapacitor.plugin.util.HttpRequestHandler.HttpURLConnectionBuilder setReadTimeout(java.lang.Integer r1) {
                r0 = this;
                r0.readTimeout = r1
                return r0
        }

        public com.getcapacitor.plugin.util.HttpRequestHandler.HttpURLConnectionBuilder setUrl(java.net.URL r1) {
                r0 = this;
                r0.url = r1
                return r0
        }

        public com.getcapacitor.plugin.util.HttpRequestHandler.HttpURLConnectionBuilder setUrlParams(com.getcapacitor.JSObject r2) throws java.net.MalformedURLException, java.net.URISyntaxException, org.json.JSONException {
                r1 = this;
                r0 = 1
                com.getcapacitor.plugin.util.HttpRequestHandler$HttpURLConnectionBuilder r0 = r1.setUrlParams(r2, r0)
                return r0
        }

        public com.getcapacitor.plugin.util.HttpRequestHandler.HttpURLConnectionBuilder setUrlParams(com.getcapacitor.JSObject r12, boolean r13) throws java.net.URISyntaxException, java.net.MalformedURLException {
                r11 = this;
                java.lang.String r0 = "&"
                java.net.URL r1 = r11.url
                java.lang.String r1 = r1.getQuery()
                java.lang.String r2 = ""
                if (r1 != 0) goto Le
                r3 = r2
                goto Lf
            Le:
                r3 = r1
            Lf:
                java.util.Iterator r4 = r12.keys()
                boolean r5 = r4.hasNext()
                if (r5 != 0) goto L1a
                return r11
            L1a:
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>(r3)
            L1f:
                boolean r6 = r4.hasNext()
                if (r6 == 0) goto L70
                java.lang.Object r6 = r4.next()
                java.lang.String r6 = (java.lang.String) r6
                java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: org.json.JSONException -> L5e
                r7.<init>()     // Catch: org.json.JSONException -> L5e
                org.json.JSONArray r8 = r12.getJSONArray(r6)     // Catch: org.json.JSONException -> L5e
                r9 = 0
            L35:
                int r10 = r8.length()     // Catch: org.json.JSONException -> L5e
                if (r9 >= r10) goto L50
                java.lang.String r10 = r8.getString(r9)     // Catch: org.json.JSONException -> L5e
                addUrlParam(r7, r6, r10, r13)     // Catch: org.json.JSONException -> L5e
                int r10 = r8.length()     // Catch: org.json.JSONException -> L5e
                int r10 = r10 + (-1)
                if (r9 == r10) goto L4d
                r7.append(r0)     // Catch: org.json.JSONException -> L5e
            L4d:
                int r9 = r9 + 1
                goto L35
            L50:
                int r9 = r5.length()     // Catch: org.json.JSONException -> L5e
                if (r9 <= 0) goto L59
                r5.append(r0)     // Catch: org.json.JSONException -> L5e
            L59:
                r5.append(r7)     // Catch: org.json.JSONException -> L5e
                goto L6f
            L5e:
                r7 = move-exception
                int r8 = r5.length()
                if (r8 <= 0) goto L68
                r5.append(r0)
            L68:
                java.lang.String r8 = r12.getString(r6)
                addUrlParam(r5, r6, r8, r13)
            L6f:
                goto L1f
            L70:
                java.lang.String r0 = r5.toString()
                java.net.URL r6 = r11.url
                java.net.URI r6 = r6.toURI()
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                java.lang.String r8 = r6.getScheme()
                java.lang.StringBuilder r7 = r7.append(r8)
                java.lang.String r8 = "://"
                java.lang.StringBuilder r7 = r7.append(r8)
                java.lang.String r8 = r6.getAuthority()
                java.lang.StringBuilder r7 = r7.append(r8)
                java.lang.String r8 = r6.getPath()
                java.lang.StringBuilder r7 = r7.append(r8)
                boolean r8 = r0.equals(r2)
                if (r8 != 0) goto Lb7
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                java.lang.String r9 = "?"
                java.lang.StringBuilder r8 = r8.append(r9)
                java.lang.StringBuilder r8 = r8.append(r0)
                java.lang.String r8 = r8.toString()
                goto Lb8
            Lb7:
                r8 = r2
            Lb8:
                java.lang.StringBuilder r7 = r7.append(r8)
                java.lang.String r8 = r6.getFragment()
                if (r8 == 0) goto Lc6
                java.lang.String r2 = r6.getFragment()
            Lc6:
                java.lang.StringBuilder r2 = r7.append(r2)
                java.lang.String r2 = r2.toString()
                java.net.URL r7 = new java.net.URL
                r7.<init>(r2)
                r11.url = r7
                return r11
        }
    }

    @java.lang.FunctionalInterface
    public interface ProgressEmitter {
        void emit(java.lang.Integer r1, java.lang.Integer r2);
    }

    public enum ResponseType extends java.lang.Enum<com.getcapacitor.plugin.util.HttpRequestHandler.ResponseType> {
        private static final /* synthetic */ com.getcapacitor.plugin.util.HttpRequestHandler.ResponseType[] $VALUES = null;
        public static final com.getcapacitor.plugin.util.HttpRequestHandler.ResponseType ARRAY_BUFFER = null;
        public static final com.getcapacitor.plugin.util.HttpRequestHandler.ResponseType BLOB = null;
        static final com.getcapacitor.plugin.util.HttpRequestHandler.ResponseType DEFAULT = null;
        public static final com.getcapacitor.plugin.util.HttpRequestHandler.ResponseType DOCUMENT = null;
        public static final com.getcapacitor.plugin.util.HttpRequestHandler.ResponseType JSON = null;
        public static final com.getcapacitor.plugin.util.HttpRequestHandler.ResponseType TEXT = null;
        private final java.lang.String name;

        private static /* synthetic */ com.getcapacitor.plugin.util.HttpRequestHandler.ResponseType[] $values() {
                com.getcapacitor.plugin.util.HttpRequestHandler$ResponseType r0 = com.getcapacitor.plugin.util.HttpRequestHandler.ResponseType.ARRAY_BUFFER
                com.getcapacitor.plugin.util.HttpRequestHandler$ResponseType r1 = com.getcapacitor.plugin.util.HttpRequestHandler.ResponseType.BLOB
                com.getcapacitor.plugin.util.HttpRequestHandler$ResponseType r2 = com.getcapacitor.plugin.util.HttpRequestHandler.ResponseType.DOCUMENT
                com.getcapacitor.plugin.util.HttpRequestHandler$ResponseType r3 = com.getcapacitor.plugin.util.HttpRequestHandler.ResponseType.JSON
                com.getcapacitor.plugin.util.HttpRequestHandler$ResponseType r4 = com.getcapacitor.plugin.util.HttpRequestHandler.ResponseType.TEXT
                com.getcapacitor.plugin.util.HttpRequestHandler$ResponseType[] r0 = new com.getcapacitor.plugin.util.HttpRequestHandler.ResponseType[]{r0, r1, r2, r3, r4}
                return r0
        }

        static {
                com.getcapacitor.plugin.util.HttpRequestHandler$ResponseType r0 = new com.getcapacitor.plugin.util.HttpRequestHandler$ResponseType
                r1 = 0
                java.lang.String r2 = "arraybuffer"
                java.lang.String r3 = "ARRAY_BUFFER"
                r0.<init>(r3, r1, r2)
                com.getcapacitor.plugin.util.HttpRequestHandler.ResponseType.ARRAY_BUFFER = r0
                com.getcapacitor.plugin.util.HttpRequestHandler$ResponseType r0 = new com.getcapacitor.plugin.util.HttpRequestHandler$ResponseType
                r1 = 1
                java.lang.String r2 = "blob"
                java.lang.String r3 = "BLOB"
                r0.<init>(r3, r1, r2)
                com.getcapacitor.plugin.util.HttpRequestHandler.ResponseType.BLOB = r0
                com.getcapacitor.plugin.util.HttpRequestHandler$ResponseType r0 = new com.getcapacitor.plugin.util.HttpRequestHandler$ResponseType
                r1 = 2
                java.lang.String r2 = "document"
                java.lang.String r3 = "DOCUMENT"
                r0.<init>(r3, r1, r2)
                com.getcapacitor.plugin.util.HttpRequestHandler.ResponseType.DOCUMENT = r0
                com.getcapacitor.plugin.util.HttpRequestHandler$ResponseType r0 = new com.getcapacitor.plugin.util.HttpRequestHandler$ResponseType
                r1 = 3
                java.lang.String r2 = "json"
                java.lang.String r3 = "JSON"
                r0.<init>(r3, r1, r2)
                com.getcapacitor.plugin.util.HttpRequestHandler.ResponseType.JSON = r0
                com.getcapacitor.plugin.util.HttpRequestHandler$ResponseType r0 = new com.getcapacitor.plugin.util.HttpRequestHandler$ResponseType
                r1 = 4
                java.lang.String r2 = "text"
                java.lang.String r3 = "TEXT"
                r0.<init>(r3, r1, r2)
                com.getcapacitor.plugin.util.HttpRequestHandler.ResponseType.TEXT = r0
                com.getcapacitor.plugin.util.HttpRequestHandler$ResponseType[] r0 = $values()
                com.getcapacitor.plugin.util.HttpRequestHandler.ResponseType.$VALUES = r0
                com.getcapacitor.plugin.util.HttpRequestHandler$ResponseType r0 = com.getcapacitor.plugin.util.HttpRequestHandler.ResponseType.TEXT
                com.getcapacitor.plugin.util.HttpRequestHandler.ResponseType.DEFAULT = r0
                return
        }

        ResponseType(java.lang.String r1, int r2, java.lang.String r3) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.name = r3
                return
        }

        public static com.getcapacitor.plugin.util.HttpRequestHandler.ResponseType parse(java.lang.String r5) {
                com.getcapacitor.plugin.util.HttpRequestHandler$ResponseType[] r0 = values()
                int r1 = r0.length
                r2 = 0
            L6:
                if (r2 >= r1) goto L16
                r3 = r0[r2]
                java.lang.String r4 = r3.name
                boolean r4 = r4.equalsIgnoreCase(r5)
                if (r4 == 0) goto L13
                return r3
            L13:
                int r2 = r2 + 1
                goto L6
            L16:
                com.getcapacitor.plugin.util.HttpRequestHandler$ResponseType r0 = com.getcapacitor.plugin.util.HttpRequestHandler.ResponseType.DEFAULT
                return r0
        }

        public static com.getcapacitor.plugin.util.HttpRequestHandler.ResponseType valueOf(java.lang.String r1) {
                java.lang.Class<com.getcapacitor.plugin.util.HttpRequestHandler$ResponseType> r0 = com.getcapacitor.plugin.util.HttpRequestHandler.ResponseType.class
                java.lang.Enum r0 = java.lang.Enum.valueOf(r0, r1)
                com.getcapacitor.plugin.util.HttpRequestHandler$ResponseType r0 = (com.getcapacitor.plugin.util.HttpRequestHandler.ResponseType) r0
                return r0
        }

        public static com.getcapacitor.plugin.util.HttpRequestHandler.ResponseType[] values() {
                com.getcapacitor.plugin.util.HttpRequestHandler$ResponseType[] r0 = com.getcapacitor.plugin.util.HttpRequestHandler.ResponseType.$VALUES
                java.lang.Object r0 = r0.clone()
                com.getcapacitor.plugin.util.HttpRequestHandler$ResponseType[] r0 = (com.getcapacitor.plugin.util.HttpRequestHandler.ResponseType[]) r0
                return r0
        }
    }

    public HttpRequestHandler() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.getcapacitor.JSObject buildResponse(com.getcapacitor.plugin.util.CapacitorHttpUrlConnection r1) throws java.io.IOException, org.json.JSONException {
            com.getcapacitor.plugin.util.HttpRequestHandler$ResponseType r0 = com.getcapacitor.plugin.util.HttpRequestHandler.ResponseType.DEFAULT
            com.getcapacitor.JSObject r0 = buildResponse(r1, r0)
            return r0
    }

    public static com.getcapacitor.JSObject buildResponse(com.getcapacitor.plugin.util.CapacitorHttpUrlConnection r5, com.getcapacitor.plugin.util.HttpRequestHandler.ResponseType r6) throws java.io.IOException, org.json.JSONException {
            int r0 = r5.getResponseCode()
            com.getcapacitor.JSObject r1 = new com.getcapacitor.JSObject
            r1.<init>()
            java.lang.String r2 = "status"
            r1.put(r2, r0)
            java.lang.String r2 = "headers"
            com.getcapacitor.JSObject r3 = buildResponseHeaders(r5)
            r1.put(r2, r3)
            java.lang.String r2 = "url"
            java.net.URL r3 = r5.getURL()
            r1.put(r2, r3)
            java.lang.String r2 = "data"
            java.lang.Object r3 = readData(r5, r6)
            r1.put(r2, r3)
            java.io.InputStream r2 = r5.getErrorStream()
            if (r2 == 0) goto L35
            java.lang.String r3 = "error"
            r4 = 1
            r1.put(r3, r4)
        L35:
            return r1
    }

    public static com.getcapacitor.JSObject buildResponseHeaders(com.getcapacitor.plugin.util.CapacitorHttpUrlConnection r5) {
            com.getcapacitor.JSObject r0 = new com.getcapacitor.JSObject
            r0.<init>()
            java.util.Map r1 = r5.getHeaderFields()
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L11:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L33
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getValue()
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.lang.String r4 = ", "
            java.lang.String r3 = android.text.TextUtils.join(r4, r3)
            java.lang.Object r4 = r2.getKey()
            java.lang.String r4 = (java.lang.String) r4
            r0.put(r4, r3)
            goto L11
        L33:
            return r0
    }

    public static java.lang.Boolean isDomainExcludedFromSSL(com.getcapacitor.Bridge r6, java.net.URL r7) {
            r0 = 0
            java.lang.String r1 = "io.ionic.sslpinning.SSLPinning"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Exception -> L30
            java.lang.String r2 = "isDomainExcluded"
            r3 = 2
            java.lang.Class[] r3 = new java.lang.Class[r3]     // Catch: java.lang.Exception -> L30
            java.lang.Class<com.getcapacitor.Bridge> r4 = com.getcapacitor.Bridge.class
            r3[r0] = r4     // Catch: java.lang.Exception -> L30
            java.lang.Class<java.net.URL> r4 = java.net.URL.class
            r5 = 1
            r3[r5] = r4     // Catch: java.lang.Exception -> L30
            java.lang.reflect.Method r2 = r1.getDeclaredMethod(r2, r3)     // Catch: java.lang.Exception -> L30
            java.lang.Class[] r3 = new java.lang.Class[r0]     // Catch: java.lang.Exception -> L30
            java.lang.reflect.Constructor r3 = r1.getDeclaredConstructor(r3)     // Catch: java.lang.Exception -> L30
            java.lang.Object[] r4 = new java.lang.Object[r0]     // Catch: java.lang.Exception -> L30
            java.lang.Object r3 = r3.newInstance(r4)     // Catch: java.lang.Exception -> L30
            java.lang.Object[] r4 = new java.lang.Object[]{r6, r7}     // Catch: java.lang.Exception -> L30
            java.lang.Object r3 = r2.invoke(r3, r4)     // Catch: java.lang.Exception -> L30
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: java.lang.Exception -> L30
            return r3
        L30:
            r1 = move-exception
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
    }

    public static boolean isOneOf(java.lang.String r5, com.getcapacitor.plugin.util.MimeType... r6) {
            r0 = 0
            if (r5 == 0) goto L18
            int r1 = r6.length
            r2 = r0
        L5:
            if (r2 >= r1) goto L18
            r3 = r6[r2]
            java.lang.String r4 = r3.getValue()
            boolean r4 = r5.contains(r4)
            if (r4 == 0) goto L15
            r0 = 1
            return r0
        L15:
            int r2 = r2 + 1
            goto L5
        L18:
            return r0
    }

    public static java.lang.Object parseJSON(java.lang.String r4) throws org.json.JSONException {
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "null"
            java.lang.String r2 = r4.trim()     // Catch: org.json.JSONException -> La2
            boolean r1 = r1.equals(r2)     // Catch: org.json.JSONException -> La2
            if (r1 == 0) goto L14
            java.lang.Object r1 = org.json.JSONObject.NULL     // Catch: org.json.JSONException -> La2
            return r1
        L14:
            java.lang.String r1 = "true"
            java.lang.String r2 = r4.trim()     // Catch: org.json.JSONException -> La2
            boolean r1 = r1.equals(r2)     // Catch: org.json.JSONException -> La2
            r2 = 1
            if (r1 == 0) goto L26
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r2)     // Catch: org.json.JSONException -> La2
            return r1
        L26:
            java.lang.String r1 = "false"
            java.lang.String r3 = r4.trim()     // Catch: org.json.JSONException -> La2
            boolean r1 = r1.equals(r3)     // Catch: org.json.JSONException -> La2
            if (r1 == 0) goto L38
            r1 = 0
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch: org.json.JSONException -> La2
            return r1
        L38:
            java.lang.String r1 = r4.trim()     // Catch: org.json.JSONException -> La2
            int r1 = r1.length()     // Catch: org.json.JSONException -> La2
            if (r1 > 0) goto L45
            java.lang.String r1 = ""
            return r1
        L45:
            java.lang.String r1 = r4.trim()     // Catch: org.json.JSONException -> La2
            java.lang.String r3 = "^\".*\"$"
            boolean r1 = r1.matches(r3)     // Catch: org.json.JSONException -> La2
            if (r1 == 0) goto L63
            java.lang.String r1 = r4.trim()     // Catch: org.json.JSONException -> La2
            java.lang.String r3 = r4.trim()     // Catch: org.json.JSONException -> La2
            int r3 = r3.length()     // Catch: org.json.JSONException -> La2
            int r3 = r3 - r2
            java.lang.String r1 = r1.substring(r2, r3)     // Catch: org.json.JSONException -> La2
            return r1
        L63:
            java.lang.String r1 = r4.trim()     // Catch: org.json.JSONException -> La2
            java.lang.String r2 = "^-?\\d+$"
            boolean r1 = r1.matches(r2)     // Catch: org.json.JSONException -> La2
            if (r1 == 0) goto L7c
            java.lang.String r1 = r4.trim()     // Catch: org.json.JSONException -> La2
            int r1 = java.lang.Integer.parseInt(r1)     // Catch: org.json.JSONException -> La2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: org.json.JSONException -> La2
            return r1
        L7c:
            java.lang.String r1 = r4.trim()     // Catch: org.json.JSONException -> La2
            java.lang.String r2 = "^-?\\d+(\\.\\d+)?$"
            boolean r1 = r1.matches(r2)     // Catch: org.json.JSONException -> La2
            if (r1 == 0) goto L95
            java.lang.String r1 = r4.trim()     // Catch: org.json.JSONException -> La2
            double r1 = java.lang.Double.parseDouble(r1)     // Catch: org.json.JSONException -> La2
            java.lang.Double r1 = java.lang.Double.valueOf(r1)     // Catch: org.json.JSONException -> La2
            return r1
        L95:
            com.getcapacitor.JSObject r1 = new com.getcapacitor.JSObject     // Catch: org.json.JSONException -> L9b
            r1.<init>(r4)     // Catch: org.json.JSONException -> L9b
            return r1
        L9b:
            r1 = move-exception
            com.getcapacitor.JSArray r2 = new com.getcapacitor.JSArray     // Catch: org.json.JSONException -> La2
            r2.<init>(r4)     // Catch: org.json.JSONException -> La2
            return r2
        La2:
            r1 = move-exception
            return r4
    }

    public static java.lang.Object readData(com.getcapacitor.plugin.util.ICapacitorHttpUrlConnection r5, com.getcapacitor.plugin.util.HttpRequestHandler.ResponseType r6) throws java.io.IOException, org.json.JSONException {
            java.io.InputStream r0 = r5.getErrorStream()
            java.lang.String r1 = "Content-Type"
            java.lang.String r1 = r5.getHeaderField(r1)
            if (r0 == 0) goto L2d
            r2 = 2
            com.getcapacitor.plugin.util.MimeType[] r2 = new com.getcapacitor.plugin.util.MimeType[r2]
            r3 = 0
            com.getcapacitor.plugin.util.MimeType r4 = com.getcapacitor.plugin.util.MimeType.APPLICATION_JSON
            r2[r3] = r4
            r3 = 1
            com.getcapacitor.plugin.util.MimeType r4 = com.getcapacitor.plugin.util.MimeType.APPLICATION_VND_API_JSON
            r2[r3] = r4
            boolean r2 = isOneOf(r1, r2)
            if (r2 == 0) goto L28
            java.lang.String r2 = readStreamAsString(r0)
            java.lang.Object r2 = parseJSON(r2)
            return r2
        L28:
            java.lang.String r2 = readStreamAsString(r0)
            return r2
        L2d:
            if (r1 == 0) goto L48
            com.getcapacitor.plugin.util.MimeType r2 = com.getcapacitor.plugin.util.MimeType.APPLICATION_JSON
            java.lang.String r2 = r2.getValue()
            boolean r2 = r1.contains(r2)
            if (r2 == 0) goto L48
            java.io.InputStream r2 = r5.getInputStream()
            java.lang.String r2 = readStreamAsString(r2)
            java.lang.Object r2 = parseJSON(r2)
            return r2
        L48:
            java.io.InputStream r2 = r5.getInputStream()
            int r3 = r6.ordinal()
            switch(r3) {
                case 0: goto L61;
                case 1: goto L61;
                case 2: goto L53;
                case 3: goto L58;
                default: goto L53;
            }
        L53:
            java.lang.String r3 = readStreamAsString(r2)
            return r3
        L58:
            java.lang.String r3 = readStreamAsString(r2)
            java.lang.Object r3 = parseJSON(r3)
            return r3
        L61:
            java.lang.String r3 = readStreamAsBase64(r2)
            return r3
    }

    public static java.lang.String readStreamAsBase64(java.io.InputStream r6) throws java.io.IOException {
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            r1 = 1024(0x400, float:1.435E-42)
            byte[] r1 = new byte[r1]     // Catch: java.lang.Throwable -> L23
        L9:
            int r2 = r6.read(r1)     // Catch: java.lang.Throwable -> L23
            r3 = r2
            r4 = -1
            r5 = 0
            if (r2 == r4) goto L16
            r0.write(r1, r5, r3)     // Catch: java.lang.Throwable -> L23
            goto L9
        L16:
            byte[] r2 = r0.toByteArray()     // Catch: java.lang.Throwable -> L23
            int r4 = r2.length     // Catch: java.lang.Throwable -> L23
            java.lang.String r4 = android.util.Base64.encodeToString(r2, r5, r4, r5)     // Catch: java.lang.Throwable -> L23
            r0.close()
            return r4
        L23:
            r1 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L28
            goto L2c
        L28:
            r2 = move-exception
            r1.addSuppressed(r2)
        L2c:
            throw r1
    }

    public static java.lang.String readStreamAsString(java.io.InputStream r4) throws java.io.IOException {
            java.io.BufferedReader r0 = new java.io.BufferedReader
            java.io.InputStreamReader r1 = new java.io.InputStreamReader
            r1.<init>(r4)
            r0.<init>(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L31
            r1.<init>()     // Catch: java.lang.Throwable -> L31
            java.lang.String r2 = r0.readLine()     // Catch: java.lang.Throwable -> L31
        L13:
            if (r2 == 0) goto L29
            r1.append(r2)     // Catch: java.lang.Throwable -> L31
            java.lang.String r3 = r0.readLine()     // Catch: java.lang.Throwable -> L31
            r2 = r3
            if (r2 == 0) goto L13
            java.lang.String r3 = "line.separator"
            java.lang.String r3 = java.lang.System.getProperty(r3)     // Catch: java.lang.Throwable -> L31
            r1.append(r3)     // Catch: java.lang.Throwable -> L31
            goto L13
        L29:
            java.lang.String r3 = r1.toString()     // Catch: java.lang.Throwable -> L31
            r0.close()
            return r3
        L31:
            r1 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L36
            goto L3a
        L36:
            r2 = move-exception
            r1.addSuppressed(r2)
        L3a:
            throw r1
    }

    public static com.getcapacitor.JSObject request(com.getcapacitor.PluginCall r18, java.lang.String r19, com.getcapacitor.Bridge r20) throws java.io.IOException, java.net.URISyntaxException, org.json.JSONException {
            r0 = r18
            r1 = r19
            r2 = r20
            java.lang.String r3 = "url"
            java.lang.String r4 = ""
            java.lang.String r3 = r0.getString(r3, r4)
            com.getcapacitor.JSObject r4 = new com.getcapacitor.JSObject
            r4.<init>()
            java.lang.String r5 = "headers"
            com.getcapacitor.JSObject r4 = r0.getObject(r5, r4)
            com.getcapacitor.JSObject r5 = new com.getcapacitor.JSObject
            r5.<init>()
            java.lang.String r6 = "params"
            com.getcapacitor.JSObject r5 = r0.getObject(r6, r5)
            java.lang.String r6 = "connectTimeout"
            java.lang.Integer r6 = r0.getInt(r6)
            java.lang.String r7 = "readTimeout"
            java.lang.Integer r7 = r0.getInt(r7)
            java.lang.String r8 = "disableRedirects"
            java.lang.Boolean r8 = r0.getBoolean(r8)
            r9 = 1
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r9)
            java.lang.String r11 = "shouldEncodeUrlParams"
            java.lang.Boolean r10 = r0.getBoolean(r11, r10)
            java.lang.String r11 = "responseType"
            java.lang.String r11 = r0.getString(r11)
            com.getcapacitor.plugin.util.HttpRequestHandler$ResponseType r11 = com.getcapacitor.plugin.util.HttpRequestHandler.ResponseType.parse(r11)
            java.lang.String r12 = "dataType"
            java.lang.String r12 = r0.getString(r12)
            if (r1 == 0) goto L5a
            java.util.Locale r13 = java.util.Locale.ROOT
            java.lang.String r13 = r1.toUpperCase(r13)
            goto L68
        L5a:
            java.lang.String r13 = "method"
            java.lang.String r14 = "GET"
            java.lang.String r13 = r0.getString(r13, r14)
            java.util.Locale r14 = java.util.Locale.ROOT
            java.lang.String r13 = r13.toUpperCase(r14)
        L68:
            java.lang.String r14 = "DELETE"
            boolean r14 = r13.equals(r14)
            if (r14 != 0) goto L8b
            java.lang.String r14 = "PATCH"
            boolean r14 = r13.equals(r14)
            if (r14 != 0) goto L8b
            java.lang.String r14 = "POST"
            boolean r14 = r13.equals(r14)
            if (r14 != 0) goto L8b
            java.lang.String r14 = "PUT"
            boolean r14 = r13.equals(r14)
            if (r14 == 0) goto L89
            goto L8b
        L89:
            r14 = 0
            goto L8c
        L8b:
            r14 = r9
        L8c:
            java.lang.String r15 = "x-cap-user-agent"
            java.lang.String r9 = r4.getString(r15)
            java.lang.String r1 = "User-Agent"
            if (r9 == 0) goto L99
            r4.put(r1, r9)
        L99:
            r4.remove(r15)
            boolean r15 = r4.has(r1)
            if (r15 != 0) goto Lb5
            java.lang.String r15 = "user-agent"
            boolean r15 = r4.has(r15)
            if (r15 != 0) goto Lb5
            com.getcapacitor.CapConfig r15 = r2.getConfig()
            java.lang.String r15 = r15.getOverriddenUserAgentString()
            r4.put(r1, r15)
        Lb5:
            java.net.URL r1 = new java.net.URL
            r1.<init>(r3)
            com.getcapacitor.plugin.util.HttpRequestHandler$HttpURLConnectionBuilder r15 = new com.getcapacitor.plugin.util.HttpRequestHandler$HttpURLConnectionBuilder
            r15.<init>()
            com.getcapacitor.plugin.util.HttpRequestHandler$HttpURLConnectionBuilder r15 = r15.setUrl(r1)
            com.getcapacitor.plugin.util.HttpRequestHandler$HttpURLConnectionBuilder r15 = r15.setMethod(r13)
            com.getcapacitor.plugin.util.HttpRequestHandler$HttpURLConnectionBuilder r15 = r15.setHeaders(r4)
            r16 = r3
            boolean r3 = r10.booleanValue()
            com.getcapacitor.plugin.util.HttpRequestHandler$HttpURLConnectionBuilder r3 = r15.setUrlParams(r5, r3)
            com.getcapacitor.plugin.util.HttpRequestHandler$HttpURLConnectionBuilder r3 = r3.setConnectTimeout(r6)
            com.getcapacitor.plugin.util.HttpRequestHandler$HttpURLConnectionBuilder r3 = r3.setReadTimeout(r7)
            com.getcapacitor.plugin.util.HttpRequestHandler$HttpURLConnectionBuilder r3 = r3.setDisableRedirects(r8)
            com.getcapacitor.plugin.util.HttpRequestHandler$HttpURLConnectionBuilder r3 = r3.openConnection()
            com.getcapacitor.plugin.util.CapacitorHttpUrlConnection r15 = r3.build()
            if (r2 == 0) goto Lf8
            java.lang.Boolean r17 = isDomainExcludedFromSSL(r2, r1)
            boolean r17 = r17.booleanValue()
            if (r17 != 0) goto Lf8
            r15.setSSLSocketFactory(r2)
        Lf8:
            if (r14 == 0) goto L111
            r17 = r1
            com.getcapacitor.JSValue r1 = new com.getcapacitor.JSValue
            java.lang.String r2 = "data"
            r1.<init>(r0, r2)
            java.lang.Object r2 = r1.getValue()
            if (r2 == 0) goto L113
            r2 = 1
            r15.setDoOutput(r2)
            r15.setRequestBody(r0, r1, r12)
            goto L113
        L111:
            r17 = r1
        L113:
            com.getcapacitor.JSObject r1 = r0.getData()
            java.lang.String r2 = "activeCapacitorHttpUrlConnection"
            r1.put(r2, r15)
            r15.connect()
            com.getcapacitor.JSObject r1 = buildResponse(r15, r11)
            r15.disconnect()
            com.getcapacitor.JSObject r0 = r18.getData()
            r0.remove(r2)
            return r1
    }
}
