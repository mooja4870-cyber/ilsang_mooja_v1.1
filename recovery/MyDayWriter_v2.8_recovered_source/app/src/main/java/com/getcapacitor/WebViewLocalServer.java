package com.getcapacitor;

/* JADX INFO: loaded from: classes3.dex */
public class WebViewLocalServer {
    private static final java.lang.String capacitorContentStart = "/_capacitor_content_";
    private static final java.lang.String capacitorFileStart = "/_capacitor_file_";
    private final java.util.ArrayList<java.lang.String> authorities;
    private java.lang.String basePath;
    private final com.getcapacitor.Bridge bridge;
    private final boolean html5mode;
    private boolean isAsset;
    private final com.getcapacitor.JSInjector jsInjector;
    private final com.getcapacitor.AndroidProtocolHandler protocolHandler;
    private final com.getcapacitor.UriMatcher uriMatcher;


    private static abstract class LazyInputStream extends java.io.InputStream {
        protected final com.getcapacitor.WebViewLocalServer.PathHandler handler;
        private java.io.InputStream is;

        public LazyInputStream(com.getcapacitor.WebViewLocalServer.PathHandler r2) {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.is = r0
                r1.handler = r2
                return
        }

        private java.io.InputStream getInputStream() {
                r1 = this;
                java.io.InputStream r0 = r1.is
                if (r0 != 0) goto La
                java.io.InputStream r0 = r1.handle()
                r1.is = r0
            La:
                java.io.InputStream r0 = r1.is
                return r0
        }

        @Override // java.io.InputStream
        public int available() throws java.io.IOException {
                r2 = this;
                java.io.InputStream r0 = r2.getInputStream()
                if (r0 == 0) goto Lb
                int r1 = r0.available()
                goto Lc
            Lb:
                r1 = -1
            Lc:
                return r1
        }

        protected abstract java.io.InputStream handle();

        @Override // java.io.InputStream
        public int read() throws java.io.IOException {
                r2 = this;
                java.io.InputStream r0 = r2.getInputStream()
                if (r0 == 0) goto Lb
                int r1 = r0.read()
                goto Lc
            Lb:
                r1 = -1
            Lc:
                return r1
        }

        @Override // java.io.InputStream
        public int read(byte[] r3) throws java.io.IOException {
                r2 = this;
                java.io.InputStream r0 = r2.getInputStream()
                if (r0 == 0) goto Lb
                int r1 = r0.read(r3)
                goto Lc
            Lb:
                r1 = -1
            Lc:
                return r1
        }

        @Override // java.io.InputStream
        public int read(byte[] r3, int r4, int r5) throws java.io.IOException {
                r2 = this;
                java.io.InputStream r0 = r2.getInputStream()
                if (r0 == 0) goto Lb
                int r1 = r0.read(r3, r4, r5)
                goto Lc
            Lb:
                r1 = -1
            Lc:
                return r1
        }

        @Override // java.io.InputStream
        public long skip(long r4) throws java.io.IOException {
                r3 = this;
                java.io.InputStream r0 = r3.getInputStream()
                if (r0 == 0) goto Lb
                long r1 = r0.skip(r4)
                goto Ld
            Lb:
                r1 = 0
            Ld:
                return r1
        }
    }

    private static class LollipopLazyInputStream extends com.getcapacitor.WebViewLocalServer.LazyInputStream {
        private java.io.InputStream is;
        private android.webkit.WebResourceRequest request;

        public LollipopLazyInputStream(com.getcapacitor.WebViewLocalServer.PathHandler r1, android.webkit.WebResourceRequest r2) {
                r0 = this;
                r0.<init>(r1)
                r0.request = r2
                return
        }

        @Override // com.getcapacitor.WebViewLocalServer.LazyInputStream
        protected java.io.InputStream handle() {
                r2 = this;
                com.getcapacitor.WebViewLocalServer$PathHandler r0 = r2.handler
                android.webkit.WebResourceRequest r1 = r2.request
                java.io.InputStream r0 = r0.handle(r1)
                return r0
        }
    }

    public static abstract class PathHandler {
        private java.lang.String charset;
        private java.lang.String encoding;
        protected java.lang.String mimeType;
        private java.lang.String reasonPhrase;
        private java.util.Map<java.lang.String, java.lang.String> responseHeaders;
        private int statusCode;

        public PathHandler() {
                r6 = this;
                java.lang.String r4 = "OK"
                r5 = 0
                r1 = 0
                r2 = 0
                r3 = 200(0xc8, float:2.8E-43)
                r0 = r6
                r0.<init>(r1, r2, r3, r4, r5)
                return
        }

        public PathHandler(java.lang.String r4, java.lang.String r5, int r6, java.lang.String r7, java.util.Map<java.lang.String, java.lang.String> r8) {
                r3 = this;
                r3.<init>()
                r3.encoding = r4
                r3.charset = r5
                r3.statusCode = r6
                r3.reasonPhrase = r7
                if (r8 != 0) goto L13
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                goto L14
            L13:
                r0 = r8
            L14:
                java.lang.String r1 = "Cache-Control"
                java.lang.String r2 = "no-cache"
                r0.put(r1, r2)
                r3.responseHeaders = r0
                return
        }

        public java.util.Map<java.lang.String, java.lang.String> buildDefaultResponseHeaders() {
                r2 = this;
                java.util.HashMap r0 = new java.util.HashMap
                java.util.Map<java.lang.String, java.lang.String> r1 = r2.responseHeaders
                r0.<init>(r1)
                return r0
        }

        public java.lang.String getCharset() {
                r1 = this;
                java.lang.String r0 = r1.charset
                return r0
        }

        public java.lang.String getEncoding() {
                r1 = this;
                java.lang.String r0 = r1.encoding
                return r0
        }

        public java.lang.String getReasonPhrase() {
                r1 = this;
                java.lang.String r0 = r1.reasonPhrase
                return r0
        }

        @java.lang.Deprecated(forRemoval = true)
        public java.util.Map<java.lang.String, java.lang.String> getResponseHeaders() {
                r1 = this;
                java.util.Map<java.lang.String, java.lang.String> r0 = r1.responseHeaders
                return r0
        }

        public int getStatusCode() {
                r1 = this;
                int r0 = r1.statusCode
                return r0
        }

        public abstract java.io.InputStream handle(android.net.Uri r1);

        public java.io.InputStream handle(android.webkit.WebResourceRequest r2) {
                r1 = this;
                android.net.Uri r0 = r2.getUrl()
                java.io.InputStream r0 = r1.handle(r0)
                return r0
        }
    }

    /* JADX INFO: renamed from: -$$Nest$fgetbasePath, reason: not valid java name */
    static /* bridge */ /* synthetic */ java.lang.String m128$$Nest$fgetbasePath(com.getcapacitor.WebViewLocalServer r0) {
            java.lang.String r0 = r0.basePath
            return r0
    }

    /* JADX INFO: renamed from: -$$Nest$fgetbridge, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.getcapacitor.Bridge m129$$Nest$fgetbridge(com.getcapacitor.WebViewLocalServer r0) {
            com.getcapacitor.Bridge r0 = r0.bridge
            return r0
    }

    /* JADX INFO: renamed from: -$$Nest$fgetisAsset, reason: not valid java name */
    static /* bridge */ /* synthetic */ boolean m130$$Nest$fgetisAsset(com.getcapacitor.WebViewLocalServer r0) {
            boolean r0 = r0.isAsset
            return r0
    }

    /* JADX INFO: renamed from: -$$Nest$fgetprotocolHandler, reason: not valid java name */
    static /* bridge */ /* synthetic */ com.getcapacitor.AndroidProtocolHandler m131$$Nest$fgetprotocolHandler(com.getcapacitor.WebViewLocalServer r0) {
            com.getcapacitor.AndroidProtocolHandler r0 = r0.protocolHandler
            return r0
    }

    /* JADX INFO: renamed from: -$$Nest$fputisAsset, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m132$$Nest$fputisAsset(com.getcapacitor.WebViewLocalServer r0, boolean r1) {
            r0.isAsset = r1
            return
    }

    WebViewLocalServer(android.content.Context r3, com.getcapacitor.Bridge r4, com.getcapacitor.JSInjector r5, java.util.ArrayList<java.lang.String> r6, boolean r7) {
            r2 = this;
            r2.<init>()
            com.getcapacitor.UriMatcher r0 = new com.getcapacitor.UriMatcher
            r1 = 0
            r0.<init>(r1)
            r2.uriMatcher = r0
            r2.html5mode = r7
            com.getcapacitor.AndroidProtocolHandler r0 = new com.getcapacitor.AndroidProtocolHandler
            android.content.Context r1 = r3.getApplicationContext()
            r0.<init>(r1)
            r2.protocolHandler = r0
            r2.authorities = r6
            r2.bridge = r4
            r2.jsInjector = r5
            return
    }

    private void createHostingDetails() {
            r7 = this;
            java.lang.String r0 = r7.basePath
            r1 = 42
            int r1 = r0.indexOf(r1)
            r2 = -1
            if (r1 != r2) goto L43
            com.getcapacitor.WebViewLocalServer$1 r1 = new com.getcapacitor.WebViewLocalServer$1
            r1.<init>(r7, r0)
            java.util.ArrayList<java.lang.String> r2 = r7.authorities
            java.util.Iterator r2 = r2.iterator()
        L16:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L42
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r4 = "http"
            r7.registerUriForScheme(r4, r1, r3)
            java.lang.String r5 = "https"
            r7.registerUriForScheme(r5, r1, r3)
            com.getcapacitor.Bridge r6 = r7.bridge
            java.lang.String r6 = r6.getScheme()
            boolean r4 = r6.equals(r4)
            if (r4 != 0) goto L41
            boolean r4 = r6.equals(r5)
            if (r4 != 0) goto L41
            r7.registerUriForScheme(r6, r1, r3)
        L41:
            goto L16
        L42:
            return
        L43:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "assetPath cannot contain the '*' character."
            r1.<init>(r2)
            throw r1
    }

    private java.lang.String getMimeType(java.lang.String r5, java.io.InputStream r6) {
            r4 = this;
            r0 = 0
            java.lang.String r1 = java.net.URLConnection.guessContentTypeFromName(r5)     // Catch: java.lang.Exception -> L44
            r0 = r1
            java.lang.String r1 = ".js"
            if (r0 == 0) goto L1d
            boolean r2 = r5.endsWith(r1)     // Catch: java.lang.Exception -> L44
            if (r2 == 0) goto L1d
            java.lang.String r2 = "image/x-icon"
            boolean r2 = r0.equals(r2)     // Catch: java.lang.Exception -> L44
            if (r2 == 0) goto L1d
            java.lang.String r2 = "We shouldn't be here"
            com.getcapacitor.Logger.debug(r2)     // Catch: java.lang.Exception -> L44
        L1d:
            if (r0 != 0) goto L43
            boolean r1 = r5.endsWith(r1)     // Catch: java.lang.Exception -> L44
            if (r1 != 0) goto L40
            java.lang.String r1 = ".mjs"
            boolean r1 = r5.endsWith(r1)     // Catch: java.lang.Exception -> L44
            if (r1 == 0) goto L2e
            goto L40
        L2e:
            java.lang.String r1 = ".wasm"
            boolean r1 = r5.endsWith(r1)     // Catch: java.lang.Exception -> L44
            if (r1 == 0) goto L3a
            java.lang.String r1 = "application/wasm"
            r0 = r1
            goto L43
        L3a:
            java.lang.String r1 = java.net.URLConnection.guessContentTypeFromStream(r6)     // Catch: java.lang.Exception -> L44
            r0 = r1
            goto L43
        L40:
            java.lang.String r1 = "application/javascript"
            r0 = r1
        L43:
            goto L5b
        L44:
            r1 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Unable to get mime type"
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r5)
            java.lang.String r2 = r2.toString()
            com.getcapacitor.Logger.error(r2, r1)
        L5b:
            return r0
    }

    private java.lang.String getReasonPhraseFromResponseCode(int r2) {
            r1 = this;
            switch(r2) {
                case 100: goto L62;
                case 101: goto L5f;
                case 200: goto L5c;
                case 201: goto L59;
                case 202: goto L56;
                case 203: goto L53;
                case 204: goto L50;
                case 205: goto L4d;
                case 206: goto L4a;
                case 300: goto L47;
                case 301: goto L44;
                case 302: goto L41;
                case 303: goto L3e;
                case 304: goto L3b;
                case 400: goto L38;
                case 401: goto L35;
                case 403: goto L32;
                case 404: goto L2f;
                case 405: goto L2c;
                case 406: goto L29;
                case 407: goto L26;
                case 408: goto L23;
                case 409: goto L20;
                case 410: goto L1d;
                case 500: goto L1a;
                case 501: goto L17;
                case 502: goto L13;
                case 503: goto Lf;
                case 504: goto Lb;
                case 505: goto L7;
                default: goto L3;
            }
        L3:
            java.lang.String r0 = "Unknown"
            goto L64
        L7:
            java.lang.String r0 = "HTTP Version Not Supported"
            goto L64
        Lb:
            java.lang.String r0 = "Gateway Timeout"
            goto L64
        Lf:
            java.lang.String r0 = "Service Unavailable"
            goto L64
        L13:
            java.lang.String r0 = "Bad Gateway"
            goto L64
        L17:
            java.lang.String r0 = "Not Implemented"
            goto L64
        L1a:
            java.lang.String r0 = "Internal Server Error"
            goto L64
        L1d:
            java.lang.String r0 = "Gone"
            goto L64
        L20:
            java.lang.String r0 = "Conflict"
            goto L64
        L23:
            java.lang.String r0 = "Request Timeout"
            goto L64
        L26:
            java.lang.String r0 = "Proxy Authentication Required"
            goto L64
        L29:
            java.lang.String r0 = "Not Acceptable"
            goto L64
        L2c:
            java.lang.String r0 = "Method Not Allowed"
            goto L64
        L2f:
            java.lang.String r0 = "Not Found"
            goto L64
        L32:
            java.lang.String r0 = "Forbidden"
            goto L64
        L35:
            java.lang.String r0 = "Unauthorized"
            goto L64
        L38:
            java.lang.String r0 = "Bad Request"
            goto L64
        L3b:
            java.lang.String r0 = "Not Modified"
            goto L64
        L3e:
            java.lang.String r0 = "See Other"
            goto L64
        L41:
            java.lang.String r0 = "Found"
            goto L64
        L44:
            java.lang.String r0 = "Moved Permanently"
            goto L64
        L47:
            java.lang.String r0 = "Multiple Choices"
            goto L64
        L4a:
            java.lang.String r0 = "Partial Content"
            goto L64
        L4d:
            java.lang.String r0 = "Reset Content"
            goto L64
        L50:
            java.lang.String r0 = "No Content"
            goto L64
        L53:
            java.lang.String r0 = "Non-Authoritative Information"
            goto L64
        L56:
            java.lang.String r0 = "Accepted"
            goto L64
        L59:
            java.lang.String r0 = "Created"
            goto L64
        L5c:
            java.lang.String r0 = "OK"
            goto L64
        L5f:
            java.lang.String r0 = "Switching Protocols"
            goto L64
        L62:
            java.lang.String r0 = "Continue"
        L64:
            return r0
    }

    private int getStatusCode(java.io.InputStream r4, int r5) {
            r3 = this;
            r0 = r5
            int r1 = r4.available()     // Catch: java.io.IOException -> Lb
            r2 = -1
            if (r1 != r2) goto La
            r0 = 404(0x194, float:5.66E-43)
        La:
            goto Le
        Lb:
            r1 = move-exception
            r0 = 500(0x1f4, float:7.0E-43)
        Le:
            return r0
    }

    private android.webkit.WebResourceResponse handleCapacitorHttpRequest(android.webkit.WebResourceRequest r19) throws java.io.IOException {
            r18 = this;
            r0 = r18
            android.net.Uri r1 = r19.getUrl()
            java.lang.String r2 = "u"
            java.lang.String r1 = r1.getQueryParameter(r2)
            java.net.URL r2 = new java.net.URL
            r2.<init>(r1)
            com.getcapacitor.JSObject r3 = new com.getcapacitor.JSObject
            r3.<init>()
            java.util.Map r4 = r19.getRequestHeaders()
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L22:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L3e
            java.lang.Object r5 = r4.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r6 = r5.getKey()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r7 = r5.getValue()
            java.lang.String r7 = (java.lang.String) r7
            r3.put(r6, r7)
            goto L22
        L3e:
            java.lang.String r4 = "x-cap-user-agent"
            java.lang.String r5 = r3.getString(r4)
            if (r5 == 0) goto L4b
            java.lang.String r6 = "User-Agent"
            r3.put(r6, r5)
        L4b:
            r3.remove(r4)
            com.getcapacitor.plugin.util.HttpRequestHandler$HttpURLConnectionBuilder r4 = new com.getcapacitor.plugin.util.HttpRequestHandler$HttpURLConnectionBuilder
            r4.<init>()
            com.getcapacitor.plugin.util.HttpRequestHandler$HttpURLConnectionBuilder r4 = r4.setUrl(r2)
            java.lang.String r6 = r19.getMethod()
            com.getcapacitor.plugin.util.HttpRequestHandler$HttpURLConnectionBuilder r4 = r4.setMethod(r6)
            com.getcapacitor.plugin.util.HttpRequestHandler$HttpURLConnectionBuilder r4 = r4.setHeaders(r3)
            com.getcapacitor.plugin.util.HttpRequestHandler$HttpURLConnectionBuilder r4 = r4.openConnection()
            com.getcapacitor.plugin.util.CapacitorHttpUrlConnection r6 = r4.build()
            com.getcapacitor.Bridge r7 = r0.bridge
            java.lang.Boolean r7 = com.getcapacitor.plugin.util.HttpRequestHandler.isDomainExcludedFromSSL(r7, r2)
            boolean r7 = r7.booleanValue()
            if (r7 != 0) goto L7c
            com.getcapacitor.Bridge r7 = r0.bridge
            r6.setSSLSocketFactory(r7)
        L7c:
            r6.connect()
            r7 = 0
            r8 = 0
            java.util.LinkedHashMap r9 = new java.util.LinkedHashMap
            r9.<init>()
            r15 = r9
            java.util.Map r9 = r6.getHeaderFields()
            java.util.Set r9 = r9.entrySet()
            java.util.Iterator r9 = r9.iterator()
            r12 = r8
        L94:
            boolean r8 = r9.hasNext()
            if (r8 == 0) goto L11b
            java.lang.Object r8 = r9.next()
            java.util.Map$Entry r8 = (java.util.Map.Entry) r8
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.Object r11 = r8.getValue()
            java.util.List r11 = (java.util.List) r11
            java.util.Iterator r11 = r11.iterator()
        Laf:
            boolean r13 = r11.hasNext()
            if (r13 == 0) goto Lc4
            java.lang.Object r13 = r11.next()
            java.lang.String r13 = (java.lang.String) r13
            r10.append(r13)
            java.lang.String r14 = ", "
            r10.append(r14)
            goto Laf
        Lc4:
            int r11 = r10.length()
            int r11 = r11 + (-2)
            r10.setLength(r11)
            java.lang.Object r11 = r8.getKey()
            java.lang.String r11 = (java.lang.String) r11
            java.lang.String r13 = "Content-Type"
            boolean r11 = r13.equalsIgnoreCase(r11)
            if (r11 == 0) goto L108
            java.lang.String r11 = r10.toString()
            java.lang.String r13 = ";"
            java.lang.String[] r11 = r11.split(r13)
            r13 = 0
            r13 = r11[r13]
            java.lang.String r7 = r13.trim()
            int r13 = r11.length
            r14 = 1
            if (r13 <= r14) goto L105
            r13 = r11[r14]
            java.lang.String r14 = "="
            java.lang.String[] r13 = r13.split(r14)
            int r14 = r13.length
            r17 = r1
            r1 = 1
            if (r14 <= r1) goto L107
            r1 = r13[r1]
            java.lang.String r12 = r1.trim()
            goto L107
        L105:
            r17 = r1
        L107:
            goto L117
        L108:
            r17 = r1
            java.lang.Object r1 = r8.getKey()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r11 = r10.toString()
            r15.put(r1, r11)
        L117:
            r1 = r17
            goto L94
        L11b:
            r17 = r1
            java.io.InputStream r1 = r6.getErrorStream()
            if (r1 != 0) goto L127
            java.io.InputStream r1 = r6.getInputStream()
        L127:
            if (r7 != 0) goto L137
            android.net.Uri r8 = r19.getUrl()
            java.lang.String r8 = r8.getPath()
            java.lang.String r7 = r0.getMimeType(r8, r1)
            r11 = r7
            goto L138
        L137:
            r11 = r7
        L138:
            int r13 = r6.getResponseCode()
            java.lang.String r14 = r0.getReasonPhraseFromResponseCode(r13)
            android.webkit.WebResourceResponse r10 = new android.webkit.WebResourceResponse
            r16 = r1
            r10.<init>(r11, r12, r13, r14, r15, r16)
            return r10
    }

    private android.webkit.WebResourceResponse handleLocalRequest(android.webkit.WebResourceRequest r21, com.getcapacitor.WebViewLocalServer.PathHandler r22) {
            r20 = this;
            r1 = r20
            r2 = r21
            r3 = r22
            java.lang.String r0 = "/index.html"
            java.lang.String r4 = "-"
            android.net.Uri r5 = r2.getUrl()
            java.lang.String r5 = r5.getPath()
            java.util.Map r6 = r2.getRequestHeaders()
            java.lang.String r7 = "Range"
            java.lang.Object r8 = r6.get(r7)
            if (r8 == 0) goto L1f
            goto L21
        L1f:
            java.lang.String r7 = "range"
        L21:
            java.lang.Object r7 = r6.get(r7)
            java.lang.String r7 = (java.lang.String) r7
            java.lang.String r8 = "/"
            if (r7 == 0) goto Lc7
            com.getcapacitor.WebViewLocalServer$LollipopLazyInputStream r0 = new com.getcapacitor.WebViewLocalServer$LollipopLazyInputStream
            r0.<init>(r3, r2)
            r15 = r0
            java.lang.String r10 = r1.getMimeType(r5, r15)
            java.util.Map r14 = r3.buildDefaultResponseHeaders()
            r9 = 206(0xce, float:2.89E-43)
            int r0 = r15.available()     // Catch: java.io.IOException -> Laf
            java.lang.String r11 = "="
            java.lang.String[] r11 = r7.split(r11)     // Catch: java.io.IOException -> Laf
            r12 = 1
            r13 = r11[r12]     // Catch: java.io.IOException -> Laf
            java.lang.String[] r13 = r13.split(r4)     // Catch: java.io.IOException -> Laf
            r16 = 0
            r16 = r13[r16]     // Catch: java.io.IOException -> Laf
            r17 = r16
            int r16 = r0 + (-1)
            int r12 = r13.length     // Catch: java.io.IOException -> Laf
            r19 = r6
            r6 = 1
            if (r12 <= r6) goto L69
            r6 = r13[r6]     // Catch: java.io.IOException -> L63
            int r6 = java.lang.Integer.parseInt(r6)     // Catch: java.io.IOException -> L63
            r16 = r6
            goto L6b
        L63:
            r0 = move-exception
            r16 = r7
            r18 = r9
            goto Lb6
        L69:
            r6 = r16
        L6b:
            java.lang.String r12 = "Accept-Ranges"
            r16 = r7
            java.lang.String r7 = "bytes"
            r14.put(r12, r7)     // Catch: java.io.IOException -> La5
            java.lang.String r7 = "Content-Range"
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.io.IOException -> La5
            r12.<init>()     // Catch: java.io.IOException -> La5
            r18 = r9
            java.lang.String r9 = "bytes "
            java.lang.StringBuilder r9 = r12.append(r9)     // Catch: java.io.IOException -> La3
            r12 = r17
            java.lang.StringBuilder r9 = r9.append(r12)     // Catch: java.io.IOException -> La3
            java.lang.StringBuilder r4 = r9.append(r4)     // Catch: java.io.IOException -> La3
            java.lang.StringBuilder r4 = r4.append(r6)     // Catch: java.io.IOException -> La3
            java.lang.StringBuilder r4 = r4.append(r8)     // Catch: java.io.IOException -> La3
            java.lang.StringBuilder r4 = r4.append(r0)     // Catch: java.io.IOException -> La3
            java.lang.String r4 = r4.toString()     // Catch: java.io.IOException -> La3
            r14.put(r7, r4)     // Catch: java.io.IOException -> La3
            r12 = r18
            goto Lb9
        La3:
            r0 = move-exception
            goto Lb6
        La5:
            r0 = move-exception
            r18 = r9
            goto Lb6
        La9:
            r0 = move-exception
            r16 = r7
            r18 = r9
            goto Lb6
        Laf:
            r0 = move-exception
            r19 = r6
            r16 = r7
            r18 = r9
        Lb6:
            r9 = 404(0x194, float:5.66E-43)
            r12 = r9
        Lb9:
            android.webkit.WebResourceResponse r9 = new android.webkit.WebResourceResponse
            java.lang.String r11 = r3.getEncoding()
            java.lang.String r13 = r3.getReasonPhrase()
            r9.<init>(r10, r11, r12, r13, r14, r15)
            return r9
        Lc7:
            r19 = r6
            r16 = r7
            android.net.Uri r4 = r2.getUrl()
            boolean r4 = r1.isLocalFile(r4)
            if (r4 != 0) goto L1ef
            android.net.Uri r4 = r2.getUrl()
            boolean r4 = r1.isErrorUrl(r4)
            if (r4 == 0) goto Le1
            goto L1ef
        Le1:
            java.lang.String r4 = "/cordova.js"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L102
            android.webkit.WebResourceResponse r9 = new android.webkit.WebResourceResponse
            java.lang.String r11 = r3.getEncoding()
            int r12 = r3.getStatusCode()
            java.lang.String r13 = r3.getReasonPhrase()
            java.util.Map r14 = r3.buildDefaultResponseHeaders()
            r15 = 0
            java.lang.String r10 = "application/javascript"
            r9.<init>(r10, r11, r12, r13, r14, r15)
            return r9
        L102:
            boolean r4 = r5.equals(r8)
            r6 = 0
            if (r4 != 0) goto L17b
            android.net.Uri r4 = r2.getUrl()
            java.lang.String r4 = r4.getLastPathSegment()
            java.lang.String r7 = "."
            boolean r4 = r4.contains(r7)
            if (r4 != 0) goto L11e
            boolean r4 = r1.html5mode
            if (r4 == 0) goto L11e
            goto L17b
        L11e:
            java.lang.String r0 = "/favicon.ico"
            boolean r0 = r0.equalsIgnoreCase(r5)
            if (r0 == 0) goto L134
            android.webkit.WebResourceResponse r0 = new android.webkit.WebResourceResponse     // Catch: java.lang.Exception -> L12e
            java.lang.String r4 = "image/png"
            r0.<init>(r4, r6, r6)     // Catch: java.lang.Exception -> L12e
            return r0
        L12e:
            r0 = move-exception
            java.lang.String r4 = "favicon handling failed"
            com.getcapacitor.Logger.error(r4, r0)
        L134:
            int r0 = r5.lastIndexOf(r7)
            if (r0 < 0) goto L17a
            int r4 = r5.lastIndexOf(r7)
            java.lang.String r4 = r5.substring(r4)
            com.getcapacitor.WebViewLocalServer$LollipopLazyInputStream r6 = new com.getcapacitor.WebViewLocalServer$LollipopLazyInputStream
            r6.<init>(r3, r2)
            java.lang.String r7 = ".html"
            boolean r7 = r4.equals(r7)
            if (r7 == 0) goto L15b
            com.getcapacitor.JSInjector r7 = r1.jsInjector
            if (r7 == 0) goto L15b
            com.getcapacitor.JSInjector r7 = r1.jsInjector
            java.io.InputStream r6 = r7.getInjectedStream(r6)
            r13 = r6
            goto L15c
        L15b:
            r13 = r6
        L15c:
            java.lang.String r8 = r1.getMimeType(r5, r13)
            int r6 = r3.getStatusCode()
            int r10 = r1.getStatusCode(r13, r6)
            android.webkit.WebResourceResponse r7 = new android.webkit.WebResourceResponse
            java.lang.String r9 = r3.getEncoding()
            java.lang.String r11 = r3.getReasonPhrase()
            java.util.Map r12 = r3.buildDefaultResponseHeaders()
            r7.<init>(r8, r9, r10, r11, r12, r13)
            return r7
        L17a:
            return r6
        L17b:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L1e8
            r4.<init>()     // Catch: java.io.IOException -> L1e8
            java.lang.String r7 = r1.basePath     // Catch: java.io.IOException -> L1e8
            java.lang.StringBuilder r4 = r4.append(r7)     // Catch: java.io.IOException -> L1e8
            java.lang.StringBuilder r4 = r4.append(r0)     // Catch: java.io.IOException -> L1e8
            java.lang.String r4 = r4.toString()     // Catch: java.io.IOException -> L1e8
            com.getcapacitor.Bridge r7 = r1.bridge     // Catch: java.io.IOException -> L1e8
            com.getcapacitor.RouteProcessor r7 = r7.getRouteProcessor()     // Catch: java.io.IOException -> L1e8
            if (r7 == 0) goto L1ad
            com.getcapacitor.Bridge r7 = r1.bridge     // Catch: java.io.IOException -> L1e8
            com.getcapacitor.RouteProcessor r7 = r7.getRouteProcessor()     // Catch: java.io.IOException -> L1e8
            java.lang.String r8 = r1.basePath     // Catch: java.io.IOException -> L1e8
            com.getcapacitor.ProcessedRoute r0 = r7.process(r8, r0)     // Catch: java.io.IOException -> L1e8
            java.lang.String r7 = r0.getPath()     // Catch: java.io.IOException -> L1e8
            r4 = r7
            boolean r7 = r0.isAsset()     // Catch: java.io.IOException -> L1e8
            r1.isAsset = r7     // Catch: java.io.IOException -> L1e8
        L1ad:
            boolean r0 = r1.isAsset     // Catch: java.io.IOException -> L1e8
            if (r0 == 0) goto L1b8
            com.getcapacitor.AndroidProtocolHandler r0 = r1.protocolHandler     // Catch: java.io.IOException -> L1e8
            java.io.InputStream r0 = r0.openAsset(r4)     // Catch: java.io.IOException -> L1e8
            goto L1be
        L1b8:
            com.getcapacitor.AndroidProtocolHandler r0 = r1.protocolHandler     // Catch: java.io.IOException -> L1e8
            java.io.InputStream r0 = r0.openFile(r4)     // Catch: java.io.IOException -> L1e8
        L1be:
            com.getcapacitor.JSInjector r4 = r1.jsInjector
            if (r4 == 0) goto L1cb
            com.getcapacitor.JSInjector r4 = r1.jsInjector
            java.io.InputStream r0 = r4.getInjectedStream(r0)
            r12 = r0
            goto L1cc
        L1cb:
            r12 = r0
        L1cc:
            int r0 = r3.getStatusCode()
            int r9 = r1.getStatusCode(r12, r0)
            android.webkit.WebResourceResponse r6 = new android.webkit.WebResourceResponse
            java.lang.String r8 = r3.getEncoding()
            java.lang.String r10 = r3.getReasonPhrase()
            java.util.Map r11 = r3.buildDefaultResponseHeaders()
            java.lang.String r7 = "text/html"
            r6.<init>(r7, r8, r9, r10, r11, r12)
            return r6
        L1e8:
            r0 = move-exception
            java.lang.String r4 = "Unable to open index.html"
            com.getcapacitor.Logger.error(r4, r0)
            return r6
        L1ef:
            com.getcapacitor.WebViewLocalServer$LollipopLazyInputStream r0 = new com.getcapacitor.WebViewLocalServer$LollipopLazyInputStream
            r0.<init>(r3, r2)
            r12 = r0
            android.net.Uri r0 = r2.getUrl()
            java.lang.String r0 = r0.getPath()
            java.lang.String r7 = r1.getMimeType(r0, r12)
            int r0 = r3.getStatusCode()
            int r9 = r1.getStatusCode(r12, r0)
            android.webkit.WebResourceResponse r6 = new android.webkit.WebResourceResponse
            java.lang.String r8 = r3.getEncoding()
            java.lang.String r10 = r3.getReasonPhrase()
            java.util.Map r11 = r3.buildDefaultResponseHeaders()
            r6.<init>(r7, r8, r9, r10, r11, r12)
            return r6
    }

    private android.webkit.WebResourceResponse handleProxyRequest(android.webkit.WebResourceRequest r18, com.getcapacitor.WebViewLocalServer.PathHandler r19) {
            r17 = this;
            r1 = r17
            com.getcapacitor.JSInjector r0 = r1.jsInjector
            if (r0 == 0) goto L127
            java.lang.String r2 = r18.getMethod()
            java.lang.String r0 = "GET"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L127
            android.net.Uri r0 = r18.getUrl()     // Catch: java.lang.Exception -> L121
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> L121
            java.util.Map r3 = r18.getRequestHeaders()     // Catch: java.lang.Exception -> L121
            r4 = 0
            java.util.Set r5 = r3.entrySet()     // Catch: java.lang.Exception -> L121
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Exception -> L121
        L27:
            boolean r6 = r5.hasNext()     // Catch: java.lang.Exception -> L121
            if (r6 == 0) goto L56
            java.lang.Object r6 = r5.next()     // Catch: java.lang.Exception -> L121
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6     // Catch: java.lang.Exception -> L121
            java.lang.Object r7 = r6.getKey()     // Catch: java.lang.Exception -> L121
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Exception -> L121
            java.lang.String r8 = "Accept"
            boolean r7 = r7.equalsIgnoreCase(r8)     // Catch: java.lang.Exception -> L121
            if (r7 == 0) goto L55
            java.lang.Object r7 = r6.getValue()     // Catch: java.lang.Exception -> L121
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Exception -> L121
            java.lang.String r7 = r7.toLowerCase()     // Catch: java.lang.Exception -> L121
            java.lang.String r8 = "text/html"
            boolean r7 = r7.contains(r8)     // Catch: java.lang.Exception -> L121
            if (r7 == 0) goto L55
            r4 = 1
            goto L56
        L55:
            goto L27
        L56:
            if (r4 == 0) goto L120
            java.net.URL r5 = new java.net.URL     // Catch: java.lang.Exception -> L121
            r5.<init>(r0)     // Catch: java.lang.Exception -> L121
            java.net.URLConnection r5 = r5.openConnection()     // Catch: java.lang.Exception -> L121
            java.net.HttpURLConnection r5 = (java.net.HttpURLConnection) r5     // Catch: java.lang.Exception -> L121
            java.util.Set r6 = r3.entrySet()     // Catch: java.lang.Exception -> L121
            java.util.Iterator r6 = r6.iterator()     // Catch: java.lang.Exception -> L121
        L6b:
            boolean r7 = r6.hasNext()     // Catch: java.lang.Exception -> L121
            if (r7 == 0) goto L87
            java.lang.Object r7 = r6.next()     // Catch: java.lang.Exception -> L121
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7     // Catch: java.lang.Exception -> L121
            java.lang.Object r8 = r7.getKey()     // Catch: java.lang.Exception -> L121
            java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.Exception -> L121
            java.lang.Object r9 = r7.getValue()     // Catch: java.lang.Exception -> L121
            java.lang.String r9 = (java.lang.String) r9     // Catch: java.lang.Exception -> L121
            r5.setRequestProperty(r8, r9)     // Catch: java.lang.Exception -> L121
            goto L6b
        L87:
            android.webkit.CookieManager r6 = android.webkit.CookieManager.getInstance()     // Catch: java.lang.Exception -> L121
            java.lang.String r6 = r6.getCookie(r0)     // Catch: java.lang.Exception -> L121
            if (r6 == 0) goto L96
            java.lang.String r7 = "Cookie"
            r5.setRequestProperty(r7, r6)     // Catch: java.lang.Exception -> L121
        L96:
            r5.setRequestMethod(r2)     // Catch: java.lang.Exception -> L121
            r7 = 30000(0x7530, float:4.2039E-41)
            r5.setReadTimeout(r7)     // Catch: java.lang.Exception -> L121
            r5.setConnectTimeout(r7)     // Catch: java.lang.Exception -> L121
            android.net.Uri r7 = r18.getUrl()     // Catch: java.lang.Exception -> L121
            java.lang.String r7 = r7.getUserInfo()     // Catch: java.lang.Exception -> L121
            if (r7 == 0) goto Ld6
            android.net.Uri r7 = r18.getUrl()     // Catch: java.lang.Exception -> L121
            java.lang.String r7 = r7.getUserInfo()     // Catch: java.lang.Exception -> L121
            java.nio.charset.Charset r8 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Exception -> L121
            byte[] r7 = r7.getBytes(r8)     // Catch: java.lang.Exception -> L121
            r8 = 2
            java.lang.String r8 = android.util.Base64.encodeToString(r7, r8)     // Catch: java.lang.Exception -> L121
            java.lang.String r9 = "Authorization"
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L121
            r10.<init>()     // Catch: java.lang.Exception -> L121
            java.lang.String r11 = "Basic "
            java.lang.StringBuilder r10 = r10.append(r11)     // Catch: java.lang.Exception -> L121
            java.lang.StringBuilder r10 = r10.append(r8)     // Catch: java.lang.Exception -> L121
            java.lang.String r10 = r10.toString()     // Catch: java.lang.Exception -> L121
            r5.setRequestProperty(r9, r10)     // Catch: java.lang.Exception -> L121
        Ld6:
            java.util.Map r7 = r5.getHeaderFields()     // Catch: java.lang.Exception -> L121
            java.lang.String r8 = "Set-Cookie"
            java.lang.Object r7 = r7.get(r8)     // Catch: java.lang.Exception -> L121
            java.util.List r7 = (java.util.List) r7     // Catch: java.lang.Exception -> L121
            if (r7 == 0) goto Lfc
            java.util.Iterator r8 = r7.iterator()     // Catch: java.lang.Exception -> L121
        Le8:
            boolean r9 = r8.hasNext()     // Catch: java.lang.Exception -> L121
            if (r9 == 0) goto Lfc
            java.lang.Object r9 = r8.next()     // Catch: java.lang.Exception -> L121
            java.lang.String r9 = (java.lang.String) r9     // Catch: java.lang.Exception -> L121
            android.webkit.CookieManager r10 = android.webkit.CookieManager.getInstance()     // Catch: java.lang.Exception -> L121
            r10.setCookie(r0, r9)     // Catch: java.lang.Exception -> L121
            goto Le8
        Lfc:
            java.io.InputStream r8 = r5.getInputStream()     // Catch: java.lang.Exception -> L121
            com.getcapacitor.JSInjector r9 = r1.jsInjector     // Catch: java.lang.Exception -> L121
            java.io.InputStream r9 = r9.getInjectedStream(r8)     // Catch: java.lang.Exception -> L121
            r16 = r9
            android.webkit.WebResourceResponse r10 = new android.webkit.WebResourceResponse     // Catch: java.lang.Exception -> L121
            java.lang.String r11 = "text/html"
            java.lang.String r12 = r19.getEncoding()     // Catch: java.lang.Exception -> L121
            int r13 = r19.getStatusCode()     // Catch: java.lang.Exception -> L121
            java.lang.String r14 = r19.getReasonPhrase()     // Catch: java.lang.Exception -> L121
            java.util.Map r15 = r19.buildDefaultResponseHeaders()     // Catch: java.lang.Exception -> L121
            r10.<init>(r11, r12, r13, r14, r15, r16)     // Catch: java.lang.Exception -> L121
            return r10
        L120:
            goto L127
        L121:
            r0 = move-exception
            com.getcapacitor.Bridge r3 = r1.bridge
            r3.handleAppUrlLoadError(r0)
        L127:
            r0 = 0
            return r0
    }

    private boolean isAllowedUrl(android.net.Uri r3) {
            r2 = this;
            com.getcapacitor.Bridge r0 = r2.bridge
            java.lang.String r0 = r0.getServerUrl()
            if (r0 != 0) goto L1b
            com.getcapacitor.Bridge r0 = r2.bridge
            com.getcapacitor.util.HostMask r0 = r0.getAppAllowNavigationMask()
            java.lang.String r1 = r3.getHost()
            boolean r0 = r0.matches(r1)
            if (r0 == 0) goto L19
            goto L1b
        L19:
            r0 = 0
            goto L1c
        L1b:
            r0 = 1
        L1c:
            return r0
    }

    private boolean isErrorUrl(android.net.Uri r3) {
            r2 = this;
            java.lang.String r0 = r3.toString()
            com.getcapacitor.Bridge r1 = r2.bridge
            java.lang.String r1 = r1.getErrorUrl()
            boolean r1 = r0.equals(r1)
            return r1
    }

    private boolean isLocalFile(android.net.Uri r3) {
            r2 = this;
            java.lang.String r0 = r3.getPath()
            java.lang.String r1 = "/_capacitor_content_"
            boolean r1 = r0.startsWith(r1)
            if (r1 != 0) goto L17
            java.lang.String r1 = "/_capacitor_file_"
            boolean r1 = r0.startsWith(r1)
            if (r1 == 0) goto L15
            goto L17
        L15:
            r1 = 0
            goto L18
        L17:
            r1 = 1
        L18:
            return r1
    }

    private boolean isMainUrl(android.net.Uri r3) {
            r2 = this;
            com.getcapacitor.Bridge r0 = r2.bridge
            java.lang.String r0 = r0.getServerUrl()
            if (r0 != 0) goto L1a
            java.lang.String r0 = r3.getHost()
            com.getcapacitor.Bridge r1 = r2.bridge
            java.lang.String r1 = r1.getHost()
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L1a
            r0 = 1
            goto L1b
        L1a:
            r0 = 0
        L1b:
            return r0
    }

    private static android.net.Uri parseAndVerifyUrl(java.lang.String r5) {
            r0 = 0
            if (r5 != 0) goto L4
            return r0
        L4:
            android.net.Uri r1 = android.net.Uri.parse(r5)
            if (r1 != 0) goto L21
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Malformed URL: "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r5)
            java.lang.String r2 = r2.toString()
            com.getcapacitor.Logger.error(r2)
            return r0
        L21:
            java.lang.String r2 = r1.getPath()
            if (r2 == 0) goto L2f
            boolean r3 = r2.isEmpty()
            if (r3 == 0) goto L2e
            goto L2f
        L2e:
            return r1
        L2f:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "URL does not have a path: "
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r3 = r3.append(r5)
            java.lang.String r3 = r3.toString()
            com.getcapacitor.Logger.error(r3)
            return r0
    }

    private void registerUriForScheme(java.lang.String r4, com.getcapacitor.WebViewLocalServer.PathHandler r5, java.lang.String r6) {
            r3 = this;
            android.net.Uri$Builder r0 = new android.net.Uri$Builder
            r0.<init>()
            r0.scheme(r4)
            r0.authority(r6)
            java.lang.String r1 = ""
            r0.path(r1)
            android.net.Uri r1 = r0.build()
            java.lang.String r2 = "/"
            android.net.Uri r2 = android.net.Uri.withAppendedPath(r1, r2)
            r3.register(r2, r5)
            java.lang.String r2 = "**"
            android.net.Uri r2 = android.net.Uri.withAppendedPath(r1, r2)
            r3.register(r2, r5)
            return
    }

    public java.lang.String getBasePath() {
            r1 = this;
            java.lang.String r0 = r1.basePath
            return r0
    }

    public java.io.InputStream getJavaScriptInjectedStream(java.io.InputStream r2) {
            r1 = this;
            com.getcapacitor.JSInjector r0 = r1.jsInjector
            if (r0 == 0) goto Lb
            com.getcapacitor.JSInjector r0 = r1.jsInjector
            java.io.InputStream r0 = r0.getInjectedStream(r2)
            return r0
        Lb:
            return r2
    }

    public void hostAssets(java.lang.String r2) {
            r1 = this;
            r0 = 1
            r1.isAsset = r0
            r1.basePath = r2
            r1.createHostingDetails()
            return
    }

    public void hostFiles(java.lang.String r2) {
            r1 = this;
            r0 = 0
            r1.isAsset = r0
            r1.basePath = r2
            r1.createHostingDetails()
            return
    }

    void register(android.net.Uri r6, com.getcapacitor.WebViewLocalServer.PathHandler r7) {
            r5 = this;
            com.getcapacitor.UriMatcher r0 = r5.uriMatcher
            monitor-enter(r0)
            com.getcapacitor.UriMatcher r1 = r5.uriMatcher     // Catch: java.lang.Throwable -> L16
            java.lang.String r2 = r6.getScheme()     // Catch: java.lang.Throwable -> L16
            java.lang.String r3 = r6.getAuthority()     // Catch: java.lang.Throwable -> L16
            java.lang.String r4 = r6.getPath()     // Catch: java.lang.Throwable -> L16
            r1.addURI(r2, r3, r4, r7)     // Catch: java.lang.Throwable -> L16
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
            return
        L16:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
            throw r1
    }

    public android.webkit.WebResourceResponse shouldInterceptRequest(android.webkit.WebResourceRequest r6) {
            r5 = this;
            android.net.Uri r0 = r6.getUrl()
            java.lang.String r1 = r0.getPath()
            r2 = 0
            if (r1 == 0) goto L3b
            java.lang.String r1 = r0.getPath()
            java.lang.String r3 = "/_capacitor_http_interceptor_"
            boolean r1 = r1.startsWith(r3)
            if (r1 == 0) goto L3b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Handling CapacitorHttp request: "
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.StringBuilder r1 = r1.append(r0)
            java.lang.String r1 = r1.toString()
            com.getcapacitor.Logger.debug(r1)
            android.webkit.WebResourceResponse r1 = r5.handleCapacitorHttpRequest(r6)     // Catch: java.lang.Exception -> L32
            return r1
        L32:
            r1 = move-exception
            java.lang.String r3 = r1.getLocalizedMessage()
            com.getcapacitor.Logger.error(r3)
            return r2
        L3b:
            com.getcapacitor.UriMatcher r1 = r5.uriMatcher
            monitor-enter(r1)
            com.getcapacitor.UriMatcher r3 = r5.uriMatcher     // Catch: java.lang.Throwable -> L8f
            android.net.Uri r4 = r6.getUrl()     // Catch: java.lang.Throwable -> L8f
            java.lang.Object r3 = r3.match(r4)     // Catch: java.lang.Throwable -> L8f
            com.getcapacitor.WebViewLocalServer$PathHandler r3 = (com.getcapacitor.WebViewLocalServer.PathHandler) r3     // Catch: java.lang.Throwable -> L8f
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L8f
            if (r3 != 0) goto L4e
            return r2
        L4e:
            boolean r1 = r5.isLocalFile(r0)
            if (r1 != 0) goto L6c
            boolean r1 = r5.isMainUrl(r0)
            if (r1 != 0) goto L6c
            boolean r1 = r5.isAllowedUrl(r0)
            if (r1 == 0) goto L6c
            boolean r1 = r5.isErrorUrl(r0)
            if (r1 == 0) goto L67
            goto L6c
        L67:
            android.webkit.WebResourceResponse r1 = r5.handleProxyRequest(r6, r3)
            return r1
        L6c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Handling local request: "
            java.lang.StringBuilder r1 = r1.append(r2)
            android.net.Uri r2 = r6.getUrl()
            java.lang.String r2 = r2.toString()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.getcapacitor.Logger.debug(r1)
            android.webkit.WebResourceResponse r1 = r5.handleLocalRequest(r6, r3)
            return r1
        L8f:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L8f
            throw r2
    }
}
