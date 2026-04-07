package com.google.crypto.tink.util;

/* JADX INFO: loaded from: classes.dex */
public class KeysDownloader {
    private static final java.util.concurrent.Executor DEFAULT_BACKGROUND_EXECUTOR = null;
    private static final com.google.api.client.http.javanet.NetHttpTransport DEFAULT_HTTP_TRANSPORT = null;
    private static final java.util.regex.Pattern MAX_AGE_PATTERN = null;
    private static final java.nio.charset.Charset UTF_8 = null;
    private final java.util.concurrent.Executor backgroundExecutor;
    private long cacheExpirationDurationInMillis;
    private java.lang.String cachedData;
    private long cachedTimeInMillis;
    private final java.lang.Object fetchDataLock;
    private final com.google.api.client.http.HttpTransport httpTransport;
    private final java.lang.Object instanceStateLock;
    private java.lang.Runnable pendingRefreshRunnable;
    private final java.lang.String url;


    public static class Builder {
        private java.util.concurrent.Executor executor;
        private com.google.api.client.http.HttpTransport httpTransport;
        private java.lang.String url;

        public Builder() {
                r1 = this;
                r1.<init>()
                com.google.api.client.http.javanet.NetHttpTransport r0 = com.google.crypto.tink.util.KeysDownloader.access$400()
                r1.httpTransport = r0
                java.util.concurrent.Executor r0 = com.google.crypto.tink.util.KeysDownloader.access$500()
                r1.executor = r0
                return
        }

        public com.google.crypto.tink.util.KeysDownloader build() {
                r4 = this;
                java.lang.String r0 = r4.url
                if (r0 == 0) goto L10
                com.google.crypto.tink.util.KeysDownloader r0 = new com.google.crypto.tink.util.KeysDownloader
                java.util.concurrent.Executor r1 = r4.executor
                com.google.api.client.http.HttpTransport r2 = r4.httpTransport
                java.lang.String r3 = r4.url
                r0.<init>(r1, r2, r3)
                return r0
            L10:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "must provide a url with {#setUrl}"
                r0.<init>(r1)
                throw r0
        }

        public com.google.crypto.tink.util.KeysDownloader.Builder setExecutor(java.util.concurrent.Executor r1) {
                r0 = this;
                r0.executor = r1
                return r0
        }

        public com.google.crypto.tink.util.KeysDownloader.Builder setHttpTransport(com.google.api.client.http.HttpTransport r1) {
                r0 = this;
                r0.httpTransport = r1
                return r0
        }

        public com.google.crypto.tink.util.KeysDownloader.Builder setUrl(java.lang.String r1) {
                r0 = this;
                r0.url = r1
                return r0
        }
    }

    static {
            java.lang.String r0 = "UTF-8"
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r0)
            com.google.crypto.tink.util.KeysDownloader.UTF_8 = r0
            com.google.api.client.http.javanet.NetHttpTransport$Builder r0 = new com.google.api.client.http.javanet.NetHttpTransport$Builder
            r0.<init>()
            com.google.api.client.http.javanet.NetHttpTransport r0 = r0.build()
            com.google.crypto.tink.util.KeysDownloader.DEFAULT_HTTP_TRANSPORT = r0
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.newCachedThreadPool()
            com.google.crypto.tink.util.KeysDownloader.DEFAULT_BACKGROUND_EXECUTOR = r0
            java.lang.String r0 = "\\s*max-age\\s*=\\s*(\\d+)\\s*"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            com.google.crypto.tink.util.KeysDownloader.MAX_AGE_PATTERN = r0
            return
    }

    public KeysDownloader(java.util.concurrent.Executor r3, com.google.api.client.http.HttpTransport r4, java.lang.String r5) {
            r2 = this;
            r2.<init>()
            validate(r5)
            r2.backgroundExecutor = r3
            r2.httpTransport = r4
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r2.instanceStateLock = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r2.fetchDataLock = r0
            r2.url = r5
            r0 = -9223372036854775808
            r2.cachedTimeInMillis = r0
            r0 = 0
            r2.cacheExpirationDurationInMillis = r0
            return
    }

    static /* synthetic */ java.lang.Object access$000(com.google.crypto.tink.util.KeysDownloader r1) {
            java.lang.Object r0 = r1.fetchDataLock
            return r0
    }

    static /* synthetic */ java.lang.String access$100(com.google.crypto.tink.util.KeysDownloader r1) throws java.io.IOException {
            java.lang.String r0 = r1.fetchAndCacheData()
            return r0
    }

    static /* synthetic */ java.lang.Object access$200(com.google.crypto.tink.util.KeysDownloader r1) {
            java.lang.Object r0 = r1.instanceStateLock
            return r0
    }

    static /* synthetic */ java.lang.Runnable access$300(com.google.crypto.tink.util.KeysDownloader r1) {
            java.lang.Runnable r0 = r1.pendingRefreshRunnable
            return r0
    }

    static /* synthetic */ java.lang.Runnable access$302(com.google.crypto.tink.util.KeysDownloader r0, java.lang.Runnable r1) {
            r0.pendingRefreshRunnable = r1
            return r1
    }

    static /* synthetic */ com.google.api.client.http.javanet.NetHttpTransport access$400() {
            com.google.api.client.http.javanet.NetHttpTransport r0 = com.google.crypto.tink.util.KeysDownloader.DEFAULT_HTTP_TRANSPORT
            return r0
    }

    static /* synthetic */ java.util.concurrent.Executor access$500() {
            java.util.concurrent.Executor r0 = com.google.crypto.tink.util.KeysDownloader.DEFAULT_BACKGROUND_EXECUTOR
            return r0
    }

    private java.lang.String fetchAndCacheData() throws java.io.IOException {
            r11 = this;
            long r0 = r11.getCurrentTimeInMillis()
            com.google.api.client.http.HttpTransport r2 = r11.httpTransport
            com.google.api.client.http.HttpRequestFactory r2 = r2.createRequestFactory()
            com.google.api.client.http.GenericUrl r3 = new com.google.api.client.http.GenericUrl
            java.lang.String r4 = r11.url
            r3.<init>(r4)
            com.google.api.client.http.HttpRequest r2 = r2.buildGetRequest(r3)
            com.google.api.client.http.HttpResponse r3 = r2.execute()
            int r4 = r3.getStatusCode()
            r5 = 200(0xc8, float:2.8E-43)
            if (r4 != r5) goto L53
            java.io.InputStream r4 = r3.getContent()
            java.io.InputStreamReader r5 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L4e
            java.nio.charset.Charset r6 = com.google.crypto.tink.util.KeysDownloader.UTF_8     // Catch: java.lang.Throwable -> L4e
            r5.<init>(r4, r6)     // Catch: java.lang.Throwable -> L4e
            java.lang.String r6 = readerToString(r5)     // Catch: java.lang.Throwable -> L4e
            r4.close()
            java.lang.Object r5 = r11.instanceStateLock
            monitor-enter(r5)
            r11.cachedTimeInMillis = r0     // Catch: java.lang.Throwable -> L4b
            com.google.api.client.http.HttpHeaders r7 = r3.getHeaders()     // Catch: java.lang.Throwable -> L4b
            long r7 = r11.getExpirationDurationInSeconds(r7)     // Catch: java.lang.Throwable -> L4b
            r9 = 1000(0x3e8, double:4.94E-321)
            long r7 = r7 * r9
            r11.cacheExpirationDurationInMillis = r7     // Catch: java.lang.Throwable -> L4b
            r11.cachedData = r6     // Catch: java.lang.Throwable -> L4b
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L4b
            return r6
        L4b:
            r7 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L4b
            throw r7
        L4e:
            r5 = move-exception
            r4.close()
            throw r5
        L53:
            java.io.IOException r4 = new java.io.IOException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Unexpected status code = "
            java.lang.StringBuilder r5 = r5.append(r6)
            int r6 = r3.getStatusCode()
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
    }

    private boolean hasNonExpiredDataCached() {
            r9 = this;
            long r0 = r9.getCurrentTimeInMillis()
            long r2 = r9.cachedTimeInMillis
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            r3 = 1
            r4 = 0
            if (r2 <= 0) goto Le
            r2 = r3
            goto Lf
        Le:
            r2 = r4
        Lf:
            long r5 = r9.cachedTimeInMillis
            long r7 = r9.cacheExpirationDurationInMillis
            long r5 = r5 + r7
            int r5 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r5 > 0) goto L1a
            r5 = r3
            goto L1b
        L1a:
            r5 = r4
        L1b:
            if (r5 != 0) goto L20
            if (r2 != 0) goto L20
            goto L21
        L20:
            r3 = r4
        L21:
            return r3
    }

    private java.lang.Runnable newRefreshRunnable() {
            r1 = this;
            com.google.crypto.tink.util.KeysDownloader$1 r0 = new com.google.crypto.tink.util.KeysDownloader$1
            r0.<init>(r1)
            return r0
    }

    private static java.lang.String readerToString(java.io.Reader r4) throws java.io.IOException {
            java.io.BufferedReader r0 = new java.io.BufferedReader
            r0.<init>(r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
        La:
            int r1 = r0.read()
            r2 = r1
            r3 = -1
            if (r1 == r3) goto L17
            char r1 = (char) r2
            r4.append(r1)
            goto La
        L17:
            java.lang.String r1 = r4.toString()
            return r1
    }

    private boolean shouldProactivelyRefreshDataInBackground() {
            r6 = this;
            long r0 = r6.cachedTimeInMillis
            long r2 = r6.cacheExpirationDurationInMillis
            r4 = 2
            long r2 = r2 / r4
            long r0 = r0 + r2
            long r2 = r6.getCurrentTimeInMillis()
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 > 0) goto L12
            r0 = 1
            goto L13
        L12:
            r0 = 0
        L13:
            return r0
    }

    private static void validate(java.lang.String r3) {
            java.net.URL r0 = new java.net.URL     // Catch: java.net.MalformedURLException -> L21
            r0.<init>(r3)     // Catch: java.net.MalformedURLException -> L21
            java.lang.String r1 = r0.getProtocol()     // Catch: java.net.MalformedURLException -> L21
            java.util.Locale r2 = java.util.Locale.US     // Catch: java.net.MalformedURLException -> L21
            java.lang.String r1 = r1.toLowerCase(r2)     // Catch: java.net.MalformedURLException -> L21
            java.lang.String r2 = "https"
            boolean r1 = r1.equals(r2)     // Catch: java.net.MalformedURLException -> L21
            if (r1 == 0) goto L19
        L18:
            return
        L19:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch: java.net.MalformedURLException -> L21
            java.lang.String r2 = "url must point to a HTTPS server"
            r1.<init>(r2)     // Catch: java.net.MalformedURLException -> L21
            throw r1     // Catch: java.net.MalformedURLException -> L21
        L21:
            r0 = move-exception
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r0)
            throw r1
    }

    public java.lang.String download() throws java.io.IOException {
            r3 = this;
            java.lang.Object r0 = r3.instanceStateLock
            monitor-enter(r0)
            boolean r1 = r3.hasNonExpiredDataCached()     // Catch: java.lang.Throwable -> L35
            if (r1 == 0) goto L16
            boolean r1 = r3.shouldProactivelyRefreshDataInBackground()     // Catch: java.lang.Throwable -> L35
            if (r1 == 0) goto L12
            r3.refreshInBackground()     // Catch: java.lang.Throwable -> L35
        L12:
            java.lang.String r1 = r3.cachedData     // Catch: java.lang.Throwable -> L35
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L35
            return r1
        L16:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L35
            java.lang.Object r1 = r3.fetchDataLock
            monitor-enter(r1)
            java.lang.Object r0 = r3.instanceStateLock     // Catch: java.lang.Throwable -> L32
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L32
            boolean r2 = r3.hasNonExpiredDataCached()     // Catch: java.lang.Throwable -> L2f
            if (r2 == 0) goto L28
            java.lang.String r2 = r3.cachedData     // Catch: java.lang.Throwable -> L2f
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2f
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L32
            return r2
        L28:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2f
            java.lang.String r0 = r3.fetchAndCacheData()     // Catch: java.lang.Throwable -> L32
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L32
            return r0
        L2f:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2f
            throw r2     // Catch: java.lang.Throwable -> L32
        L32:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L32
            throw r0
        L35:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L35
            throw r1
    }

    long getCurrentTimeInMillis() {
            r2 = this;
            org.joda.time.Instant r0 = org.joda.time.Instant.now()
            long r0 = r0.getMillis()
            return r0
    }

    long getExpirationDurationInSeconds(com.google.api.client.http.HttpHeaders r9) {
            r8 = this;
            r0 = 0
            java.lang.String r2 = r9.getCacheControl()
            if (r2 == 0) goto L35
            java.lang.String r2 = r9.getCacheControl()
            java.lang.String r3 = ","
            java.lang.String[] r2 = r2.split(r3)
            int r3 = r2.length
            r4 = 0
        L14:
            if (r4 >= r3) goto L35
            r5 = r2[r4]
            java.util.regex.Pattern r6 = com.google.crypto.tink.util.KeysDownloader.MAX_AGE_PATTERN
            java.util.regex.Matcher r6 = r6.matcher(r5)
            boolean r7 = r6.matches()
            if (r7 == 0) goto L32
            r2 = 1
            java.lang.String r2 = r6.group(r2)
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            long r0 = r2.longValue()
            goto L35
        L32:
            int r4 = r4 + 1
            goto L14
        L35:
            java.lang.Long r2 = r9.getAge()
            if (r2 == 0) goto L44
            java.lang.Long r2 = r9.getAge()
            long r2 = r2.longValue()
            long r0 = r0 - r2
        L44:
            r2 = 0
            long r2 = java.lang.Math.max(r2, r0)
            return r2
    }

    public com.google.api.client.http.HttpTransport getHttpTransport() {
            r1 = this;
            com.google.api.client.http.HttpTransport r0 = r1.httpTransport
            return r0
    }

    public java.lang.String getUrl() {
            r1 = this;
            java.lang.String r0 = r1.url
            return r0
    }

    public void refreshInBackground() {
            r4 = this;
            java.lang.Runnable r0 = r4.newRefreshRunnable()
            java.lang.Object r1 = r4.instanceStateLock
            monitor-enter(r1)
            java.lang.Runnable r2 = r4.pendingRefreshRunnable     // Catch: java.lang.Throwable -> L28
            if (r2 == 0) goto Ld
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L28
            return
        Ld:
            r4.pendingRefreshRunnable = r0     // Catch: java.lang.Throwable -> L28
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L28
            java.util.concurrent.Executor r1 = r4.backgroundExecutor     // Catch: java.lang.Throwable -> L17
            r1.execute(r0)     // Catch: java.lang.Throwable -> L17
            return
        L17:
            r1 = move-exception
            r2 = r1
            java.lang.Object r3 = r4.instanceStateLock
            monitor-enter(r3)
            java.lang.Runnable r1 = r4.pendingRefreshRunnable     // Catch: java.lang.Throwable -> L25
            if (r1 != r0) goto L23
            r1 = 0
            r4.pendingRefreshRunnable = r1     // Catch: java.lang.Throwable -> L25
        L23:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L25
            throw r2
        L25:
            r1 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L25
            throw r1
        L28:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L28
            throw r2
    }
}
