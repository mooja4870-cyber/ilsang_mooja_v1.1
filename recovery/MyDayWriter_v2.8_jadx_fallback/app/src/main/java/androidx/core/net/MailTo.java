package androidx.core.net;

/* JADX INFO: loaded from: classes.dex */
public final class MailTo {
    private static final java.lang.String BCC = "bcc";
    private static final java.lang.String BODY = "body";
    private static final java.lang.String CC = "cc";
    private static final java.lang.String MAILTO = "mailto";
    public static final java.lang.String MAILTO_SCHEME = "mailto:";
    private static final java.lang.String SUBJECT = "subject";
    private static final java.lang.String TO = "to";
    private java.util.HashMap<java.lang.String, java.lang.String> mHeaders;

    private MailTo() {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.mHeaders = r0
            return
    }

    public static boolean isMailTo(android.net.Uri r2) {
            if (r2 == 0) goto L10
            java.lang.String r0 = "mailto"
            java.lang.String r1 = r2.getScheme()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            return r0
    }

    public static boolean isMailTo(java.lang.String r1) {
            if (r1 == 0) goto Lc
            java.lang.String r0 = "mailto:"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    public static androidx.core.net.MailTo parse(android.net.Uri r1) throws androidx.core.net.ParseException {
            java.lang.String r0 = r1.toString()
            androidx.core.net.MailTo r0 = parse(r0)
            return r0
    }

    public static androidx.core.net.MailTo parse(java.lang.String r14) throws androidx.core.net.ParseException {
            androidx.core.util.Preconditions.checkNotNull(r14)
            boolean r0 = isMailTo(r14)
            if (r0 == 0) goto La4
            r0 = 35
            int r0 = r14.indexOf(r0)
            r1 = -1
            r2 = 0
            if (r0 == r1) goto L17
            java.lang.String r14 = r14.substring(r2, r0)
        L17:
            r3 = 63
            int r3 = r14.indexOf(r3)
            java.lang.String r4 = "mailto:"
            if (r3 != r1) goto L2f
            int r1 = r4.length()
            java.lang.String r1 = r14.substring(r1)
            java.lang.String r1 = android.net.Uri.decode(r1)
            r4 = 0
            goto L41
        L2f:
            int r1 = r4.length()
            java.lang.String r1 = r14.substring(r1, r3)
            java.lang.String r1 = android.net.Uri.decode(r1)
            int r4 = r3 + 1
            java.lang.String r4 = r14.substring(r4)
        L41:
            androidx.core.net.MailTo r5 = new androidx.core.net.MailTo
            r5.<init>()
            if (r4 == 0) goto L7f
            java.lang.String r6 = "&"
            java.lang.String[] r6 = r4.split(r6)
            int r7 = r6.length
            r8 = r2
        L50:
            if (r8 >= r7) goto L7f
            r9 = r6[r8]
            java.lang.String r10 = "="
            r11 = 2
            java.lang.String[] r10 = r9.split(r10, r11)
            int r11 = r10.length
            if (r11 != 0) goto L5f
            goto L7c
        L5f:
            r11 = r10[r2]
            java.lang.String r11 = android.net.Uri.decode(r11)
            java.util.Locale r12 = java.util.Locale.ROOT
            java.lang.String r11 = r11.toLowerCase(r12)
            int r12 = r10.length
            r13 = 1
            if (r12 <= r13) goto L76
            r12 = r10[r13]
            java.lang.String r12 = android.net.Uri.decode(r12)
            goto L77
        L76:
            r12 = 0
        L77:
            java.util.HashMap<java.lang.String, java.lang.String> r13 = r5.mHeaders
            r13.put(r11, r12)
        L7c:
            int r8 = r8 + 1
            goto L50
        L7f:
            java.lang.String r2 = r5.getTo()
            if (r2 == 0) goto L9c
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.StringBuilder r6 = r6.append(r1)
            java.lang.String r7 = ", "
            java.lang.StringBuilder r6 = r6.append(r7)
            java.lang.StringBuilder r6 = r6.append(r2)
            java.lang.String r1 = r6.toString()
        L9c:
            java.util.HashMap<java.lang.String, java.lang.String> r6 = r5.mHeaders
            java.lang.String r7 = "to"
            r6.put(r7, r1)
            return r5
        La4:
            androidx.core.net.ParseException r0 = new androidx.core.net.ParseException
            java.lang.String r1 = "Not a mailto scheme"
            r0.<init>(r1)
            throw r0
    }

    public java.lang.String getBcc() {
            r2 = this;
            java.util.HashMap<java.lang.String, java.lang.String> r0 = r2.mHeaders
            java.lang.String r1 = "bcc"
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            return r0
    }

    public java.lang.String getBody() {
            r2 = this;
            java.util.HashMap<java.lang.String, java.lang.String> r0 = r2.mHeaders
            java.lang.String r1 = "body"
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            return r0
    }

    public java.lang.String getCc() {
            r2 = this;
            java.util.HashMap<java.lang.String, java.lang.String> r0 = r2.mHeaders
            java.lang.String r1 = "cc"
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            return r0
    }

    public java.util.Map<java.lang.String, java.lang.String> getHeaders() {
            r1 = this;
            java.util.HashMap<java.lang.String, java.lang.String> r0 = r1.mHeaders
            return r0
    }

    public java.lang.String getSubject() {
            r2 = this;
            java.util.HashMap<java.lang.String, java.lang.String> r0 = r2.mHeaders
            java.lang.String r1 = "subject"
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            return r0
    }

    public java.lang.String getTo() {
            r2 = this;
            java.util.HashMap<java.lang.String, java.lang.String> r0 = r2.mHeaders
            java.lang.String r1 = "to"
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            return r0
    }

    public java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "mailto:"
            r0.<init>(r1)
            r1 = 63
            r0.append(r1)
            java.util.HashMap<java.lang.String, java.lang.String> r1 = r4.mHeaders
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L16:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L47
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r3 = android.net.Uri.encode(r3)
            r0.append(r3)
            r3 = 61
            r0.append(r3)
            java.lang.Object r3 = r2.getValue()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r3 = android.net.Uri.encode(r3)
            r0.append(r3)
            r3 = 38
            r0.append(r3)
            goto L16
        L47:
            java.lang.String r1 = r0.toString()
            return r1
    }
}
