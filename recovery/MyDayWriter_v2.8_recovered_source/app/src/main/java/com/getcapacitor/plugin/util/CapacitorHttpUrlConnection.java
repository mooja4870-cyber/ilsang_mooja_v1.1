package com.getcapacitor.plugin.util;

/* JADX INFO: loaded from: classes4.dex */
public class CapacitorHttpUrlConnection implements com.getcapacitor.plugin.util.ICapacitorHttpUrlConnection {
    private final java.net.HttpURLConnection connection;

    public CapacitorHttpUrlConnection(java.net.HttpURLConnection r1) {
            r0 = this;
            r0.<init>()
            r0.connection = r1
            r0.setDefaultRequestProperties()
            return
    }

    private java.lang.String buildDefaultAcceptLanguageProperty() {
            r6 = this;
            android.os.LocaleList r0 = android.os.LocaleList.getDefault()
            r1 = 0
            java.util.Locale r0 = r0.get(r1)
            java.lang.String r1 = ""
            java.lang.String r2 = r0.getLanguage()
            java.lang.String r3 = r0.getCountry()
            boolean r4 = android.text.TextUtils.isEmpty(r2)
            if (r4 != 0) goto L34
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 != 0) goto L2a
            java.lang.String r4 = "%s-%s,%s;q=0.5"
            java.lang.Object[] r5 = new java.lang.Object[]{r2, r3, r2}
            java.lang.String r1 = java.lang.String.format(r4, r5)
            goto L34
        L2a:
            java.lang.String r4 = "%s;q=0.5"
            java.lang.Object[] r5 = new java.lang.Object[]{r2}
            java.lang.String r1 = java.lang.String.format(r4, r5)
        L34:
            return r1
    }

    private void setDefaultRequestProperties() {
            r3 = this;
            java.lang.String r0 = r3.buildDefaultAcceptLanguageProperty()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L11
            java.net.HttpURLConnection r1 = r3.connection
            java.lang.String r2 = "Accept-Language"
            r1.setRequestProperty(r2, r0)
        L11:
            return
    }

    private void writeFormDataRequestBody(java.lang.String r17, com.getcapacitor.JSArray r18) throws java.io.IOException, org.json.JSONException {
            r16 = this;
            java.io.DataOutputStream r0 = new java.io.DataOutputStream
            r1 = r16
            java.net.HttpURLConnection r2 = r1.connection
            java.io.OutputStream r2 = r2.getOutputStream()
            r0.<init>(r2)
            r2 = r0
            java.lang.String r0 = ";"
            r3 = r17
            java.lang.String[] r0 = r3.split(r0)     // Catch: java.lang.Throwable -> L16b
            r4 = 1
            r0 = r0[r4]     // Catch: java.lang.Throwable -> L16b
            java.lang.String r5 = "="
            java.lang.String[] r0 = r0.split(r5)     // Catch: java.lang.Throwable -> L16b
            r0 = r0[r4]     // Catch: java.lang.Throwable -> L16b
            java.lang.String r4 = "\r\n"
            java.lang.String r5 = "--"
            java.util.List r6 = r18.toList()     // Catch: java.lang.Throwable -> L16b
            java.util.Iterator r6 = r6.iterator()     // Catch: java.lang.Throwable -> L16b
        L2d:
            boolean r7 = r6.hasNext()     // Catch: java.lang.Throwable -> L16b
            if (r7 == 0) goto L148
            java.lang.Object r7 = r6.next()     // Catch: java.lang.Throwable -> L16b
            boolean r8 = r7 instanceof org.json.JSONObject     // Catch: java.lang.Throwable -> L16b
            if (r8 == 0) goto L144
            r8 = r7
            org.json.JSONObject r8 = (org.json.JSONObject) r8     // Catch: java.lang.Throwable -> L16b
            java.lang.String r9 = "type"
            java.lang.String r9 = r8.getString(r9)     // Catch: java.lang.Throwable -> L16b
            java.lang.String r10 = "key"
            java.lang.String r10 = r8.getString(r10)     // Catch: java.lang.Throwable -> L16b
            java.lang.String r11 = "value"
            java.lang.String r11 = r8.getString(r11)     // Catch: java.lang.Throwable -> L16b
            java.lang.String r12 = "string"
            boolean r12 = r9.equals(r12)     // Catch: java.lang.Throwable -> L16b
            java.lang.String r13 = "\""
            java.lang.String r14 = "Content-Disposition: form-data; name=\""
            if (r12 == 0) goto La2
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L16b
            r12.<init>()     // Catch: java.lang.Throwable -> L16b
            java.lang.StringBuilder r12 = r12.append(r5)     // Catch: java.lang.Throwable -> L16b
            java.lang.StringBuilder r12 = r12.append(r0)     // Catch: java.lang.Throwable -> L16b
            java.lang.StringBuilder r12 = r12.append(r4)     // Catch: java.lang.Throwable -> L16b
            java.lang.String r12 = r12.toString()     // Catch: java.lang.Throwable -> L16b
            r2.writeBytes(r12)     // Catch: java.lang.Throwable -> L16b
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L16b
            r12.<init>()     // Catch: java.lang.Throwable -> L16b
            java.lang.StringBuilder r12 = r12.append(r14)     // Catch: java.lang.Throwable -> L16b
            java.lang.StringBuilder r12 = r12.append(r10)     // Catch: java.lang.Throwable -> L16b
            java.lang.StringBuilder r12 = r12.append(r13)     // Catch: java.lang.Throwable -> L16b
            java.lang.StringBuilder r12 = r12.append(r4)     // Catch: java.lang.Throwable -> L16b
            java.lang.StringBuilder r12 = r12.append(r4)     // Catch: java.lang.Throwable -> L16b
            java.lang.String r12 = r12.toString()     // Catch: java.lang.Throwable -> L16b
            r2.writeBytes(r12)     // Catch: java.lang.Throwable -> L16b
            java.nio.charset.Charset r12 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Throwable -> L16b
            byte[] r12 = r11.getBytes(r12)     // Catch: java.lang.Throwable -> L16b
            r2.write(r12)     // Catch: java.lang.Throwable -> L16b
            r2.writeBytes(r4)     // Catch: java.lang.Throwable -> L16b
            goto L144
        La2:
            java.lang.String r12 = "base64File"
            boolean r12 = r9.equals(r12)     // Catch: java.lang.Throwable -> L16b
            if (r12 == 0) goto L144
            java.lang.String r12 = "fileName"
            java.lang.String r12 = r8.getString(r12)     // Catch: java.lang.Throwable -> L16b
            java.lang.String r15 = "contentType"
            java.lang.String r15 = r8.getString(r15)     // Catch: java.lang.Throwable -> L16b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L16b
            r1.<init>()     // Catch: java.lang.Throwable -> L16b
            java.lang.StringBuilder r1 = r1.append(r5)     // Catch: java.lang.Throwable -> L16b
            java.lang.StringBuilder r1 = r1.append(r0)     // Catch: java.lang.Throwable -> L16b
            java.lang.StringBuilder r1 = r1.append(r4)     // Catch: java.lang.Throwable -> L16b
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L16b
            r2.writeBytes(r1)     // Catch: java.lang.Throwable -> L16b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L16b
            r1.<init>()     // Catch: java.lang.Throwable -> L16b
            java.lang.StringBuilder r1 = r1.append(r14)     // Catch: java.lang.Throwable -> L16b
            java.lang.StringBuilder r1 = r1.append(r10)     // Catch: java.lang.Throwable -> L16b
            java.lang.String r14 = "\"; filename=\""
            java.lang.StringBuilder r1 = r1.append(r14)     // Catch: java.lang.Throwable -> L16b
            java.lang.StringBuilder r1 = r1.append(r12)     // Catch: java.lang.Throwable -> L16b
            java.lang.StringBuilder r1 = r1.append(r13)     // Catch: java.lang.Throwable -> L16b
            java.lang.StringBuilder r1 = r1.append(r4)     // Catch: java.lang.Throwable -> L16b
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L16b
            r2.writeBytes(r1)     // Catch: java.lang.Throwable -> L16b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L16b
            r1.<init>()     // Catch: java.lang.Throwable -> L16b
            java.lang.String r13 = "Content-Type: "
            java.lang.StringBuilder r1 = r1.append(r13)     // Catch: java.lang.Throwable -> L16b
            java.lang.StringBuilder r1 = r1.append(r15)     // Catch: java.lang.Throwable -> L16b
            java.lang.StringBuilder r1 = r1.append(r4)     // Catch: java.lang.Throwable -> L16b
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L16b
            r2.writeBytes(r1)     // Catch: java.lang.Throwable -> L16b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L16b
            r1.<init>()     // Catch: java.lang.Throwable -> L16b
            java.lang.String r13 = "Content-Transfer-Encoding: binary"
            java.lang.StringBuilder r1 = r1.append(r13)     // Catch: java.lang.Throwable -> L16b
            java.lang.StringBuilder r1 = r1.append(r4)     // Catch: java.lang.Throwable -> L16b
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L16b
            r2.writeBytes(r1)     // Catch: java.lang.Throwable -> L16b
            r2.writeBytes(r4)     // Catch: java.lang.Throwable -> L16b
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L16b
            r13 = 26
            if (r1 < r13) goto L139
            java.util.Base64$Decoder r1 = java.util.Base64.getDecoder()     // Catch: java.lang.Throwable -> L16b
            byte[] r1 = r1.decode(r11)     // Catch: java.lang.Throwable -> L16b
            r2.write(r1)     // Catch: java.lang.Throwable -> L16b
            goto L141
        L139:
            r1 = 0
            byte[] r1 = android.util.Base64.decode(r11, r1)     // Catch: java.lang.Throwable -> L16b
            r2.write(r1)     // Catch: java.lang.Throwable -> L16b
        L141:
            r2.writeBytes(r4)     // Catch: java.lang.Throwable -> L16b
        L144:
            r1 = r16
            goto L2d
        L148:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L16b
            r1.<init>()     // Catch: java.lang.Throwable -> L16b
            java.lang.StringBuilder r1 = r1.append(r5)     // Catch: java.lang.Throwable -> L16b
            java.lang.StringBuilder r1 = r1.append(r0)     // Catch: java.lang.Throwable -> L16b
            java.lang.StringBuilder r1 = r1.append(r5)     // Catch: java.lang.Throwable -> L16b
            java.lang.StringBuilder r1 = r1.append(r4)     // Catch: java.lang.Throwable -> L16b
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L16b
            r2.writeBytes(r1)     // Catch: java.lang.Throwable -> L16b
            r2.flush()     // Catch: java.lang.Throwable -> L16b
            r2.close()
            return
        L16b:
            r0 = move-exception
            goto L170
        L16d:
            r0 = move-exception
            r3 = r17
        L170:
            r1 = r0
            r2.close()     // Catch: java.lang.Throwable -> L175
            goto L179
        L175:
            r0 = move-exception
            r1.addSuppressed(r0)
        L179:
            throw r1
    }

    private void writeObjectRequestBody(com.getcapacitor.JSObject r7) throws java.io.IOException, org.json.JSONException {
            r6 = this;
            java.lang.String r0 = "UTF-8"
            java.io.DataOutputStream r1 = new java.io.DataOutputStream
            java.net.HttpURLConnection r2 = r6.connection
            java.io.OutputStream r2 = r2.getOutputStream()
            r1.<init>(r2)
            java.util.Iterator r2 = r7.keys()     // Catch: java.lang.Throwable -> L4b
        L11:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L4b
            if (r3 == 0) goto L44
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L4b
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L4b
            java.lang.Object r4 = r7.get(r3)     // Catch: java.lang.Throwable -> L4b
            java.lang.String r5 = java.net.URLEncoder.encode(r3, r0)     // Catch: java.lang.Throwable -> L4b
            r1.writeBytes(r5)     // Catch: java.lang.Throwable -> L4b
            java.lang.String r5 = "="
            r1.writeBytes(r5)     // Catch: java.lang.Throwable -> L4b
            java.lang.String r5 = r4.toString()     // Catch: java.lang.Throwable -> L4b
            java.lang.String r5 = java.net.URLEncoder.encode(r5, r0)     // Catch: java.lang.Throwable -> L4b
            r1.writeBytes(r5)     // Catch: java.lang.Throwable -> L4b
            boolean r5 = r2.hasNext()     // Catch: java.lang.Throwable -> L4b
            if (r5 == 0) goto L43
            java.lang.String r5 = "&"
            r1.writeBytes(r5)     // Catch: java.lang.Throwable -> L4b
        L43:
            goto L11
        L44:
            r1.flush()     // Catch: java.lang.Throwable -> L4b
            r1.close()
            return
        L4b:
            r0 = move-exception
            r1.close()     // Catch: java.lang.Throwable -> L50
            goto L54
        L50:
            r2 = move-exception
            r0.addSuppressed(r2)
        L54:
            throw r0
    }

    private void writeRequestBody(java.lang.String r4) throws java.io.IOException {
            r3 = this;
            java.io.DataOutputStream r0 = new java.io.DataOutputStream
            java.net.HttpURLConnection r1 = r3.connection
            java.io.OutputStream r1 = r1.getOutputStream()
            r0.<init>(r1)
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Throwable -> L1b
            byte[] r1 = r4.getBytes(r1)     // Catch: java.lang.Throwable -> L1b
            r0.write(r1)     // Catch: java.lang.Throwable -> L1b
            r0.flush()     // Catch: java.lang.Throwable -> L1b
            r0.close()
            return
        L1b:
            r1 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L20
            goto L24
        L20:
            r2 = move-exception
            r1.addSuppressed(r2)
        L24:
            throw r1
    }

    public void connect() throws java.io.IOException {
            r1 = this;
            java.net.HttpURLConnection r0 = r1.connection
            r0.connect()
            return
    }

    public void disconnect() {
            r1 = this;
            java.net.HttpURLConnection r0 = r1.connection
            r0.disconnect()
            return
    }

    @Override // com.getcapacitor.plugin.util.ICapacitorHttpUrlConnection
    public java.io.InputStream getErrorStream() {
            r1 = this;
            java.net.HttpURLConnection r0 = r1.connection
            java.io.InputStream r0 = r0.getErrorStream()
            return r0
    }

    @Override // com.getcapacitor.plugin.util.ICapacitorHttpUrlConnection
    public java.lang.String getHeaderField(java.lang.String r2) {
            r1 = this;
            java.net.HttpURLConnection r0 = r1.connection
            java.lang.String r0 = r0.getHeaderField(r2)
            return r0
    }

    public java.util.Map<java.lang.String, java.util.List<java.lang.String>> getHeaderFields() {
            r1 = this;
            java.net.HttpURLConnection r0 = r1.connection
            java.util.Map r0 = r0.getHeaderFields()
            return r0
    }

    public java.net.HttpURLConnection getHttpConnection() {
            r1 = this;
            java.net.HttpURLConnection r0 = r1.connection
            return r0
    }

    @Override // com.getcapacitor.plugin.util.ICapacitorHttpUrlConnection
    public java.io.InputStream getInputStream() throws java.io.IOException {
            r1 = this;
            java.net.HttpURLConnection r0 = r1.connection
            java.io.InputStream r0 = r0.getInputStream()
            return r0
    }

    public int getResponseCode() throws java.io.IOException {
            r1 = this;
            java.net.HttpURLConnection r0 = r1.connection
            int r0 = r0.getResponseCode()
            return r0
    }

    public java.net.URL getURL() {
            r1 = this;
            java.net.HttpURLConnection r0 = r1.connection
            java.net.URL r0 = r0.getURL()
            return r0
    }

    public void setAllowUserInteraction(boolean r2) {
            r1 = this;
            java.net.HttpURLConnection r0 = r1.connection
            r0.setAllowUserInteraction(r2)
            return
    }

    public void setConnectTimeout(int r3) {
            r2 = this;
            if (r3 < 0) goto L8
            java.net.HttpURLConnection r0 = r2.connection
            r0.setConnectTimeout(r3)
            return
        L8:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "timeout can not be negative"
            r0.<init>(r1)
            throw r0
    }

    public void setDisableRedirects(boolean r3) {
            r2 = this;
            java.net.HttpURLConnection r0 = r2.connection
            r1 = r3 ^ 1
            r0.setInstanceFollowRedirects(r1)
            return
    }

    public void setDoOutput(boolean r2) {
            r1 = this;
            java.net.HttpURLConnection r0 = r1.connection
            r0.setDoOutput(r2)
            return
    }

    public void setReadTimeout(int r3) {
            r2 = this;
            if (r3 < 0) goto L8
            java.net.HttpURLConnection r0 = r2.connection
            r0.setReadTimeout(r3)
            return
        L8:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "timeout can not be negative"
            r0.<init>(r1)
            throw r0
    }

    public void setRequestBody(com.getcapacitor.PluginCall r2, com.getcapacitor.JSValue r3) throws org.json.JSONException, java.io.IOException {
            r1 = this;
            r0 = 0
            r1.setRequestBody(r2, r3, r0)
            return
    }

    public void setRequestBody(com.getcapacitor.PluginCall r6, com.getcapacitor.JSValue r7, java.lang.String r8) throws org.json.JSONException, java.io.IOException {
            r5 = this;
            java.net.HttpURLConnection r0 = r5.connection
            java.lang.String r1 = "Content-Type"
            java.lang.String r0 = r0.getRequestProperty(r1)
            java.lang.String r1 = ""
            if (r0 == 0) goto Lb1
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L14
            goto Lb1
        L14:
            java.lang.String r2 = "application/json"
            boolean r2 = r0.contains(r2)
            if (r2 == 0) goto L43
            r2 = 0
            java.lang.String r3 = "data"
            if (r7 == 0) goto L26
            java.lang.String r1 = r7.toString()
            goto L2b
        L26:
            r4 = 0
            com.getcapacitor.JSArray r2 = r6.getArray(r3, r4)
        L2b:
            if (r2 == 0) goto L32
            java.lang.String r1 = r2.toString()
            goto L38
        L32:
            if (r7 != 0) goto L38
            java.lang.String r1 = r6.getString(r3)
        L38:
            if (r1 == 0) goto L3c
            r3 = r1
            goto L3e
        L3c:
            java.lang.String r3 = ""
        L3e:
            r5.writeRequestBody(r3)
            goto Lb0
        L43:
            if (r8 == 0) goto L7e
            java.lang.String r2 = "file"
            boolean r2 = r8.equals(r2)
            if (r2 == 0) goto L7e
            java.io.DataOutputStream r2 = new java.io.DataOutputStream
            java.net.HttpURLConnection r3 = r5.connection
            java.io.OutputStream r3 = r3.getOutputStream()
            r2.<init>(r3)
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L74
            r4 = 26
            if (r3 < r4) goto L6d
            java.util.Base64$Decoder r3 = java.util.Base64.getDecoder()     // Catch: java.lang.Throwable -> L74
            java.lang.String r4 = r7.toString()     // Catch: java.lang.Throwable -> L74
            byte[] r3 = r3.decode(r4)     // Catch: java.lang.Throwable -> L74
            r2.write(r3)     // Catch: java.lang.Throwable -> L74
        L6d:
            r2.flush()     // Catch: java.lang.Throwable -> L74
            r2.close()
            goto Lb0
        L74:
            r3 = move-exception
            r2.close()     // Catch: java.lang.Throwable -> L79
            goto L7d
        L79:
            r4 = move-exception
            r3.addSuppressed(r4)
        L7d:
            throw r3
        L7e:
            java.lang.String r2 = "application/x-www-form-urlencoded"
            boolean r2 = r0.contains(r2)
            if (r2 == 0) goto L97
            com.getcapacitor.JSObject r2 = r7.toJSObject()     // Catch: java.lang.Exception -> L8e
            r5.writeObjectRequestBody(r2)     // Catch: java.lang.Exception -> L8e
            goto L96
        L8e:
            r2 = move-exception
            java.lang.String r3 = r7.toString()
            r5.writeRequestBody(r3)
        L96:
            goto Lb0
        L97:
            if (r8 == 0) goto La9
            java.lang.String r2 = "formData"
            boolean r2 = r8.equals(r2)
            if (r2 == 0) goto La9
            com.getcapacitor.JSArray r2 = r7.toJSArray()
            r5.writeFormDataRequestBody(r0, r2)
            goto Lb0
        La9:
            java.lang.String r2 = r7.toString()
            r5.writeRequestBody(r2)
        Lb0:
            return
        Lb1:
            return
    }

    public void setRequestHeaders(com.getcapacitor.JSObject r5) {
            r4 = this;
            java.util.Iterator r0 = r5.keys()
        L4:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1a
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = r5.getString(r1)
            java.net.HttpURLConnection r3 = r4.connection
            r3.setRequestProperty(r1, r2)
            goto L4
        L1a:
            return
    }

    public void setRequestMethod(java.lang.String r2) throws java.net.ProtocolException {
            r1 = this;
            java.net.HttpURLConnection r0 = r1.connection
            r0.setRequestMethod(r2)
            return
    }

    public void setSSLSocketFactory(com.getcapacitor.Bridge r6) {
            r5 = this;
            java.lang.String r0 = "io.ionic.sslpinning.SSLPinning"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Exception -> L34
            java.lang.String r1 = "getSSLSocketFactory"
            r2 = 1
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L34
            java.lang.Class<com.getcapacitor.Bridge> r3 = com.getcapacitor.Bridge.class
            r4 = 0
            r2[r4] = r3     // Catch: java.lang.Exception -> L34
            java.lang.reflect.Method r1 = r0.getDeclaredMethod(r1, r2)     // Catch: java.lang.Exception -> L34
            java.lang.Class[] r2 = new java.lang.Class[r4]     // Catch: java.lang.Exception -> L34
            java.lang.reflect.Constructor r2 = r0.getDeclaredConstructor(r2)     // Catch: java.lang.Exception -> L34
            java.lang.Object[] r3 = new java.lang.Object[r4]     // Catch: java.lang.Exception -> L34
            java.lang.Object r2 = r2.newInstance(r3)     // Catch: java.lang.Exception -> L34
            java.lang.Object[] r3 = new java.lang.Object[]{r6}     // Catch: java.lang.Exception -> L34
            java.lang.Object r2 = r1.invoke(r2, r3)     // Catch: java.lang.Exception -> L34
            javax.net.ssl.SSLSocketFactory r2 = (javax.net.ssl.SSLSocketFactory) r2     // Catch: java.lang.Exception -> L34
            if (r2 == 0) goto L35
            java.net.HttpURLConnection r3 = r5.connection     // Catch: java.lang.Exception -> L34
            javax.net.ssl.HttpsURLConnection r3 = (javax.net.ssl.HttpsURLConnection) r3     // Catch: java.lang.Exception -> L34
            r3.setSSLSocketFactory(r2)     // Catch: java.lang.Exception -> L34
            goto L35
        L34:
            r0 = move-exception
        L35:
            return
    }
}
