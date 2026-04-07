package com.getcapacitor;

/* JADX INFO: loaded from: classes3.dex */
class JSInjector {
    private java.lang.String bridgeJS;
    private java.lang.String cordovaJS;
    private java.lang.String cordovaPluginsFileJS;
    private java.lang.String cordovaPluginsJS;
    private java.lang.String globalJS;
    private java.lang.String localUrlJS;
    private java.lang.String miscJS;
    private java.lang.String pluginJS;

    public JSInjector(java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.String r16) {
            r9 = this;
            r8 = 0
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    public JSInjector(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8) {
            r0 = this;
            r0.<init>()
            r0.globalJS = r1
            r0.bridgeJS = r2
            r0.pluginJS = r3
            r0.cordovaJS = r4
            r0.cordovaPluginsJS = r5
            r0.cordovaPluginsFileJS = r6
            r0.localUrlJS = r7
            r0.miscJS = r8
            return
    }

    private java.lang.String readAssetStream(java.io.InputStream r7) {
            r6 = this;
            r0 = 1024(0x400, float:1.435E-42)
            r1 = 1024(0x400, float:1.435E-42)
            char[] r1 = new char[r1]     // Catch: java.lang.Exception -> L24
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L24
            r2.<init>()     // Catch: java.lang.Exception -> L24
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch: java.lang.Exception -> L24
            java.nio.charset.Charset r4 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Exception -> L24
            r3.<init>(r7, r4)     // Catch: java.lang.Exception -> L24
        L12:
            int r4 = r1.length     // Catch: java.lang.Exception -> L24
            r5 = 0
            int r4 = r3.read(r1, r5, r4)     // Catch: java.lang.Exception -> L24
            if (r4 >= 0) goto L1f
            java.lang.String r4 = r2.toString()     // Catch: java.lang.Exception -> L24
            return r4
        L1f:
            r2.append(r1, r5, r4)     // Catch: java.lang.Exception -> L24
            goto L12
        L24:
            r0 = move-exception
            java.lang.String r1 = "Unable to process HTML asset file. This is a fatal error"
            com.getcapacitor.Logger.error(r1, r0)
            java.lang.String r0 = ""
            return r0
    }

    public java.io.InputStream getInjectedStream(java.io.InputStream r7) {
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "<script type=\"text/javascript\">"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = r6.getScriptString()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "</script>"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = r6.readAssetStream(r7)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            java.lang.String r3 = "<head>"
            boolean r4 = r1.contains(r3)
            java.lang.String r5 = "\n"
            if (r4 == 0) goto L56
            int r4 = r1.indexOf(r3)
            int r3 = r3.length()
            int r4 = r4 + r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.StringBuilder r3 = r3.append(r5)
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.StringBuilder r3 = r3.append(r5)
            java.lang.String r3 = r3.toString()
            r2.insert(r4, r3)
            java.lang.String r1 = r2.toString()
            goto L84
        L56:
            java.lang.String r3 = "</head>"
            boolean r4 = r1.contains(r3)
            if (r4 == 0) goto L7f
            int r3 = r1.indexOf(r3)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.StringBuilder r4 = r4.append(r0)
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r4 = r4.toString()
            r2.insert(r3, r4)
            java.lang.String r1 = r2.toString()
            goto L84
        L7f:
            java.lang.String r3 = "Unable to inject Capacitor, Plugins won't work"
            com.getcapacitor.Logger.error(r3)
        L84:
            java.io.ByteArrayInputStream r3 = new java.io.ByteArrayInputStream
            java.nio.charset.Charset r4 = java.nio.charset.StandardCharsets.UTF_8
            byte[] r4 = r1.getBytes(r4)
            r3.<init>(r4)
            return r3
    }

    public java.lang.String getScriptString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r3.globalJS
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "\n\n"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r2 = r3.localUrlJS
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r2 = r3.bridgeJS
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r2 = r3.pluginJS
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r2 = r3.cordovaJS
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r2 = r3.cordovaPluginsFileJS
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r2 = r3.cordovaPluginsJS
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = r3.miscJS
            if (r2 == 0) goto L68
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.StringBuilder r2 = r2.append(r0)
            java.lang.StringBuilder r1 = r2.append(r1)
            java.lang.String r2 = r3.miscJS
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r0 = r1.toString()
        L68:
            return r0
    }
}
