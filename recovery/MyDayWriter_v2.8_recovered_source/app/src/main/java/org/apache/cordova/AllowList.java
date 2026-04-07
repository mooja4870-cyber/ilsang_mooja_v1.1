package org.apache.cordova;

/* JADX INFO: loaded from: classes7.dex */
public class AllowList {
    public static final java.lang.String TAG = "CordovaAllowList";
    private java.util.ArrayList<org.apache.cordova.AllowList.URLPattern> allowList;

    private static class URLPattern {
        public java.util.regex.Pattern host;
        public java.util.regex.Pattern path;
        public java.lang.Integer port;
        public java.util.regex.Pattern scheme;

        public URLPattern(java.lang.String r7, java.lang.String r8, java.lang.String r9, java.lang.String r10) throws java.net.MalformedURLException {
                r6 = this;
                r6.<init>()
                r0 = 0
                java.lang.String r1 = "*"
                r2 = 2
                r3 = 0
                if (r7 == 0) goto L1c
                boolean r4 = r1.equals(r7)     // Catch: java.lang.NumberFormatException -> L8e
                if (r4 == 0) goto L11
                goto L1c
            L11:
                java.lang.String r4 = r6.regexFromPattern(r7, r0)     // Catch: java.lang.NumberFormatException -> L8e
                java.util.regex.Pattern r4 = java.util.regex.Pattern.compile(r4, r2)     // Catch: java.lang.NumberFormatException -> L8e
                r6.scheme = r4     // Catch: java.lang.NumberFormatException -> L8e
                goto L1e
            L1c:
                r6.scheme = r3     // Catch: java.lang.NumberFormatException -> L8e
            L1e:
                boolean r4 = r1.equals(r8)     // Catch: java.lang.NumberFormatException -> L8e
                if (r4 == 0) goto L27
                r6.host = r3     // Catch: java.lang.NumberFormatException -> L8e
                goto L5b
            L27:
                java.lang.String r4 = "*."
                boolean r4 = r8.startsWith(r4)     // Catch: java.lang.NumberFormatException -> L8e
                if (r4 == 0) goto L51
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.NumberFormatException -> L8e
                r4.<init>()     // Catch: java.lang.NumberFormatException -> L8e
                java.lang.String r5 = "([a-z0-9.-]*\\.)?"
                java.lang.StringBuilder r4 = r4.append(r5)     // Catch: java.lang.NumberFormatException -> L8e
                java.lang.String r5 = r8.substring(r2)     // Catch: java.lang.NumberFormatException -> L8e
                java.lang.String r0 = r6.regexFromPattern(r5, r0)     // Catch: java.lang.NumberFormatException -> L8e
                java.lang.StringBuilder r0 = r4.append(r0)     // Catch: java.lang.NumberFormatException -> L8e
                java.lang.String r0 = r0.toString()     // Catch: java.lang.NumberFormatException -> L8e
                java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0, r2)     // Catch: java.lang.NumberFormatException -> L8e
                r6.host = r0     // Catch: java.lang.NumberFormatException -> L8e
                goto L5b
            L51:
                java.lang.String r0 = r6.regexFromPattern(r8, r0)     // Catch: java.lang.NumberFormatException -> L8e
                java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0, r2)     // Catch: java.lang.NumberFormatException -> L8e
                r6.host = r0     // Catch: java.lang.NumberFormatException -> L8e
            L5b:
                if (r9 == 0) goto L71
                boolean r0 = r1.equals(r9)     // Catch: java.lang.NumberFormatException -> L8e
                if (r0 == 0) goto L64
                goto L71
            L64:
                r0 = 10
                int r0 = java.lang.Integer.parseInt(r9, r0)     // Catch: java.lang.NumberFormatException -> L8e
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.NumberFormatException -> L8e
                r6.port = r0     // Catch: java.lang.NumberFormatException -> L8e
                goto L73
            L71:
                r6.port = r3     // Catch: java.lang.NumberFormatException -> L8e
            L73:
                if (r10 == 0) goto L8a
                java.lang.String r0 = "/*"
                boolean r0 = r0.equals(r10)     // Catch: java.lang.NumberFormatException -> L8e
                if (r0 == 0) goto L7e
                goto L8a
            L7e:
                r0 = 1
                java.lang.String r0 = r6.regexFromPattern(r10, r0)     // Catch: java.lang.NumberFormatException -> L8e
                java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)     // Catch: java.lang.NumberFormatException -> L8e
                r6.path = r0     // Catch: java.lang.NumberFormatException -> L8e
                goto L8c
            L8a:
                r6.path = r3     // Catch: java.lang.NumberFormatException -> L8e
            L8c:
                return
            L8e:
                r0 = move-exception
                java.net.MalformedURLException r1 = new java.net.MalformedURLException
                java.lang.String r2 = "Port must be a number"
                r1.<init>(r2)
                throw r1
        }

        private java.lang.String regexFromPattern(java.lang.String r7, boolean r8) {
                r6 = this;
                java.lang.String r0 = "\\.[]{}()^$?+|"
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r2 = 0
            L8:
                int r3 = r7.length()
                if (r2 >= r3) goto L32
                char r3 = r7.charAt(r2)
                r4 = 42
                if (r3 != r4) goto L1e
                if (r8 == 0) goto L1e
                java.lang.String r4 = "."
                r1.append(r4)
                goto L2c
            L1e:
                java.lang.String r4 = "\\.[]{}()^$?+|"
                int r4 = r4.indexOf(r3)
                r5 = -1
                if (r4 <= r5) goto L2c
                r4 = 92
                r1.append(r4)
            L2c:
                r1.append(r3)
                int r2 = r2 + 1
                goto L8
            L32:
                java.lang.String r2 = r1.toString()
                return r2
        }

        public boolean matches(android.net.Uri r5) {
                r4 = this;
                r0 = 0
                java.util.regex.Pattern r1 = r4.scheme     // Catch: java.lang.Exception -> L55
                if (r1 == 0) goto L15
                java.util.regex.Pattern r1 = r4.scheme     // Catch: java.lang.Exception -> L55
                java.lang.String r2 = r5.getScheme()     // Catch: java.lang.Exception -> L55
                java.util.regex.Matcher r1 = r1.matcher(r2)     // Catch: java.lang.Exception -> L55
                boolean r1 = r1.matches()     // Catch: java.lang.Exception -> L55
                if (r1 == 0) goto L52
            L15:
                java.util.regex.Pattern r1 = r4.host     // Catch: java.lang.Exception -> L55
                if (r1 == 0) goto L29
                java.util.regex.Pattern r1 = r4.host     // Catch: java.lang.Exception -> L55
                java.lang.String r2 = r5.getHost()     // Catch: java.lang.Exception -> L55
                java.util.regex.Matcher r1 = r1.matcher(r2)     // Catch: java.lang.Exception -> L55
                boolean r1 = r1.matches()     // Catch: java.lang.Exception -> L55
                if (r1 == 0) goto L52
            L29:
                java.lang.Integer r1 = r4.port     // Catch: java.lang.Exception -> L55
                if (r1 == 0) goto L3d
                java.lang.Integer r1 = r4.port     // Catch: java.lang.Exception -> L55
                int r2 = r5.getPort()     // Catch: java.lang.Exception -> L55
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Exception -> L55
                boolean r1 = r1.equals(r2)     // Catch: java.lang.Exception -> L55
                if (r1 == 0) goto L52
            L3d:
                java.util.regex.Pattern r1 = r4.path     // Catch: java.lang.Exception -> L55
                if (r1 == 0) goto L53
                java.util.regex.Pattern r1 = r4.path     // Catch: java.lang.Exception -> L55
                java.lang.String r2 = r5.getPath()     // Catch: java.lang.Exception -> L55
                java.util.regex.Matcher r1 = r1.matcher(r2)     // Catch: java.lang.Exception -> L55
                boolean r1 = r1.matches()     // Catch: java.lang.Exception -> L55
                if (r1 == 0) goto L52
                goto L53
            L52:
                goto L54
            L53:
                r0 = 1
            L54:
                return r0
            L55:
                r1 = move-exception
                java.lang.String r2 = "CordovaAllowList"
                java.lang.String r3 = r1.toString()
                org.apache.cordova.LOG.d(r2, r3)
                return r0
        }
    }

    public AllowList() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.allowList = r0
            return
    }

    public void addAllowListEntry(java.lang.String r11, boolean r12) {
            r10 = this;
            java.lang.String r0 = "CordovaAllowList"
            java.lang.String r1 = "*"
            java.util.ArrayList<org.apache.cordova.AllowList$URLPattern> r2 = r10.allowList
            if (r2 == 0) goto L80
            int r2 = r11.compareTo(r1)     // Catch: java.lang.Exception -> L76
            if (r2 != 0) goto L17
            java.lang.String r1 = "Unlimited access to network resources"
            org.apache.cordova.LOG.d(r0, r1)     // Catch: java.lang.Exception -> L76
            r1 = 0
            r10.allowList = r1     // Catch: java.lang.Exception -> L76
            goto L75
        L17:
            java.lang.String r2 = "^((\\*|[A-Za-z-]+):(//)?)?(\\*|((\\*\\.)?[^*/:]+))?(:(\\d+))?(/.*)?"
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2)     // Catch: java.lang.Exception -> L76
            java.util.regex.Matcher r3 = r2.matcher(r11)     // Catch: java.lang.Exception -> L76
            boolean r4 = r3.matches()     // Catch: java.lang.Exception -> L76
            if (r4 == 0) goto L75
            r4 = 2
            java.lang.String r4 = r3.group(r4)     // Catch: java.lang.Exception -> L76
            r5 = 4
            java.lang.String r5 = r3.group(r5)     // Catch: java.lang.Exception -> L76
            java.lang.String r6 = "file"
            boolean r6 = r6.equals(r4)     // Catch: java.lang.Exception -> L76
            if (r6 != 0) goto L41
            java.lang.String r6 = "content"
            boolean r6 = r6.equals(r4)     // Catch: java.lang.Exception -> L76
            if (r6 == 0) goto L44
        L41:
            if (r5 != 0) goto L44
            r5 = r1
        L44:
            r1 = 8
            java.lang.String r1 = r3.group(r1)     // Catch: java.lang.Exception -> L76
            r6 = 9
            java.lang.String r6 = r3.group(r6)     // Catch: java.lang.Exception -> L76
            if (r4 != 0) goto L6b
            java.util.ArrayList<org.apache.cordova.AllowList$URLPattern> r7 = r10.allowList     // Catch: java.lang.Exception -> L76
            org.apache.cordova.AllowList$URLPattern r8 = new org.apache.cordova.AllowList$URLPattern     // Catch: java.lang.Exception -> L76
            java.lang.String r9 = "http"
            r8.<init>(r9, r5, r1, r6)     // Catch: java.lang.Exception -> L76
            r7.add(r8)     // Catch: java.lang.Exception -> L76
            java.util.ArrayList<org.apache.cordova.AllowList$URLPattern> r7 = r10.allowList     // Catch: java.lang.Exception -> L76
            org.apache.cordova.AllowList$URLPattern r8 = new org.apache.cordova.AllowList$URLPattern     // Catch: java.lang.Exception -> L76
            java.lang.String r9 = "https"
            r8.<init>(r9, r5, r1, r6)     // Catch: java.lang.Exception -> L76
            r7.add(r8)     // Catch: java.lang.Exception -> L76
            goto L75
        L6b:
            java.util.ArrayList<org.apache.cordova.AllowList$URLPattern> r7 = r10.allowList     // Catch: java.lang.Exception -> L76
            org.apache.cordova.AllowList$URLPattern r8 = new org.apache.cordova.AllowList$URLPattern     // Catch: java.lang.Exception -> L76
            r8.<init>(r4, r5, r1, r6)     // Catch: java.lang.Exception -> L76
            r7.add(r8)     // Catch: java.lang.Exception -> L76
        L75:
            goto L80
        L76:
            r1 = move-exception
            java.lang.String r2 = "Failed to add origin %s"
            java.lang.Object[] r3 = new java.lang.Object[]{r11}
            org.apache.cordova.LOG.d(r0, r2, r3)
        L80:
            return
    }

    public boolean isUrlAllowListed(java.lang.String r6) {
            r5 = this;
            java.util.ArrayList<org.apache.cordova.AllowList$URLPattern> r0 = r5.allowList
            r1 = 1
            if (r0 != 0) goto L6
            return r1
        L6:
            android.net.Uri r0 = android.net.Uri.parse(r6)
            java.util.ArrayList<org.apache.cordova.AllowList$URLPattern> r2 = r5.allowList
            java.util.Iterator r2 = r2.iterator()
        L10:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L24
            java.lang.Object r3 = r2.next()
            org.apache.cordova.AllowList$URLPattern r3 = (org.apache.cordova.AllowList.URLPattern) r3
            boolean r4 = r3.matches(r0)
            if (r4 == 0) goto L23
            return r1
        L23:
            goto L10
        L24:
            r1 = 0
            return r1
    }
}
