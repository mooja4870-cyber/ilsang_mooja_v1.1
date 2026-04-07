package androidx.core.text.util;

/* JADX INFO: loaded from: classes.dex */
public final class LinkifyCompat {
    private static final java.util.Comparator<androidx.core.text.util.LinkifyCompat.LinkSpec> COMPARATOR = null;
    private static final java.lang.String[] EMPTY_STRING = null;

    static class Api24Impl {
        private Api24Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static void addLinks(android.widget.TextView r0, java.util.regex.Pattern r1, java.lang.String r2, java.lang.String[] r3, android.text.util.Linkify.MatchFilter r4, android.text.util.Linkify.TransformFilter r5) {
                android.text.util.Linkify.addLinks(r0, r1, r2, r3, r4, r5)
                return
        }

        static boolean addLinks(android.text.Spannable r1, java.util.regex.Pattern r2, java.lang.String r3, java.lang.String[] r4, android.text.util.Linkify.MatchFilter r5, android.text.util.Linkify.TransformFilter r6) {
                boolean r0 = android.text.util.Linkify.addLinks(r1, r2, r3, r4, r5, r6)
                return r0
        }
    }

    private static class LinkSpec {
        int end;
        android.text.style.URLSpan frameworkAddedSpan;
        int start;
        java.lang.String url;

        LinkSpec() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface LinkifyMask {
    }

    static {
            r0 = 0
            java.lang.String[] r0 = new java.lang.String[r0]
            androidx.core.text.util.LinkifyCompat.EMPTY_STRING = r0
            androidx.core.text.util.LinkifyCompat$$ExternalSyntheticLambda0 r0 = new androidx.core.text.util.LinkifyCompat$$ExternalSyntheticLambda0
            r0.<init>()
            androidx.core.text.util.LinkifyCompat.COMPARATOR = r0
            return
    }

    private LinkifyCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    private static void addLinkMovementMethod(android.widget.TextView r2) {
            android.text.method.MovementMethod r0 = r2.getMovementMethod()
            boolean r1 = r0 instanceof android.text.method.LinkMovementMethod
            if (r1 != 0) goto L15
            boolean r1 = r2.getLinksClickable()
            if (r1 == 0) goto L15
            android.text.method.MovementMethod r1 = android.text.method.LinkMovementMethod.getInstance()
            r2.setMovementMethod(r1)
        L15:
            return
    }

    public static void addLinks(android.widget.TextView r7, java.util.regex.Pattern r8, java.lang.String r9) {
            boolean r0 = shouldAddLinksFallbackToFramework()
            if (r0 == 0) goto La
            android.text.util.Linkify.addLinks(r7, r8, r9)
            return
        La:
            r5 = 0
            r6 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            r3 = r9
            addLinks(r1, r2, r3, r4, r5, r6)
            return
    }

    public static void addLinks(android.widget.TextView r7, java.util.regex.Pattern r8, java.lang.String r9, android.text.util.Linkify.MatchFilter r10, android.text.util.Linkify.TransformFilter r11) {
            boolean r0 = shouldAddLinksFallbackToFramework()
            if (r0 == 0) goto La
            android.text.util.Linkify.addLinks(r7, r8, r9, r10, r11)
            return
        La:
            r4 = 0
            r1 = r7
            r2 = r8
            r3 = r9
            r5 = r10
            r6 = r11
            addLinks(r1, r2, r3, r4, r5, r6)
            return
    }

    public static void addLinks(android.widget.TextView r6, java.util.regex.Pattern r7, java.lang.String r8, java.lang.String[] r9, android.text.util.Linkify.MatchFilter r10, android.text.util.Linkify.TransformFilter r11) {
            boolean r0 = shouldAddLinksFallbackToFramework()
            if (r0 == 0) goto La
            androidx.core.text.util.LinkifyCompat.Api24Impl.addLinks(r6, r7, r8, r9, r10, r11)
            return
        La:
            java.lang.CharSequence r0 = r6.getText()
            android.text.SpannableString r0 = android.text.SpannableString.valueOf(r0)
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            boolean r7 = addLinks(r0, r1, r2, r3, r4, r5)
            if (r7 == 0) goto L23
            r6.setText(r0)
            addLinkMovementMethod(r6)
        L23:
            return
    }

    public static boolean addLinks(android.text.Spannable r10, int r11) {
            boolean r0 = shouldAddLinksFallbackToFramework()
            if (r0 == 0) goto Lb
            boolean r0 = android.text.util.Linkify.addLinks(r10, r11)
            return r0
        Lb:
            r0 = 0
            if (r11 != 0) goto Lf
            return r0
        Lf:
            int r1 = r10.length()
            java.lang.Class<android.text.style.URLSpan> r2 = android.text.style.URLSpan.class
            java.lang.Object[] r1 = r10.getSpans(r0, r1, r2)
            android.text.style.URLSpan[] r1 = (android.text.style.URLSpan[]) r1
            int r2 = r1.length
            r3 = 1
            int r2 = r2 - r3
        L1e:
            if (r2 < 0) goto L28
            r4 = r1[r2]
            r10.removeSpan(r4)
            int r2 = r2 + (-1)
            goto L1e
        L28:
            r2 = r11 & 4
            if (r2 == 0) goto L30
            r2 = 4
            android.text.util.Linkify.addLinks(r10, r2)
        L30:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r4 = r2
            r2 = r11 & 1
            if (r2 == 0) goto L54
            java.util.regex.Pattern r6 = androidx.core.util.PatternsCompat.AUTOLINK_WEB_URL
            r2 = 3
            java.lang.String[] r7 = new java.lang.String[r2]
            java.lang.String r2 = "http://"
            r7[r0] = r2
            java.lang.String r2 = "https://"
            r7[r3] = r2
            java.lang.String r2 = "rtsp://"
            r5 = 2
            r7[r5] = r2
            android.text.util.Linkify$MatchFilter r8 = android.text.util.Linkify.sUrlMatchFilter
            r9 = 0
            r5 = r10
            gatherLinks(r4, r5, r6, r7, r8, r9)
            goto L55
        L54:
            r5 = r10
        L55:
            r10 = r11 & 2
            if (r10 == 0) goto L66
            java.util.regex.Pattern r6 = androidx.core.util.PatternsCompat.AUTOLINK_EMAIL_ADDRESS
            java.lang.String[] r7 = new java.lang.String[r3]
            java.lang.String r10 = "mailto:"
            r7[r0] = r10
            r8 = 0
            r9 = 0
            gatherLinks(r4, r5, r6, r7, r8, r9)
        L66:
            r10 = r11 & 8
            if (r10 == 0) goto L6d
            gatherMapLinks(r4, r5)
        L6d:
            pruneOverlaps(r4, r5)
            int r10 = r4.size()
            if (r10 != 0) goto L77
            return r0
        L77:
            java.util.Iterator r10 = r4.iterator()
        L7b:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L95
            java.lang.Object r0 = r10.next()
            androidx.core.text.util.LinkifyCompat$LinkSpec r0 = (androidx.core.text.util.LinkifyCompat.LinkSpec) r0
            android.text.style.URLSpan r2 = r0.frameworkAddedSpan
            if (r2 != 0) goto L94
            java.lang.String r2 = r0.url
            int r6 = r0.start
            int r7 = r0.end
            applyLink(r2, r6, r7, r5)
        L94:
            goto L7b
        L95:
            return r3
    }

    public static boolean addLinks(android.text.Spannable r7, java.util.regex.Pattern r8, java.lang.String r9) {
            boolean r0 = shouldAddLinksFallbackToFramework()
            if (r0 == 0) goto Lb
            boolean r0 = android.text.util.Linkify.addLinks(r7, r8, r9)
            return r0
        Lb:
            r5 = 0
            r6 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            r3 = r9
            boolean r7 = addLinks(r1, r2, r3, r4, r5, r6)
            return r7
    }

    public static boolean addLinks(android.text.Spannable r7, java.util.regex.Pattern r8, java.lang.String r9, android.text.util.Linkify.MatchFilter r10, android.text.util.Linkify.TransformFilter r11) {
            boolean r0 = shouldAddLinksFallbackToFramework()
            if (r0 == 0) goto Lb
            boolean r0 = android.text.util.Linkify.addLinks(r7, r8, r9, r10, r11)
            return r0
        Lb:
            r4 = 0
            r1 = r7
            r2 = r8
            r3 = r9
            r5 = r10
            r6 = r11
            boolean r7 = addLinks(r1, r2, r3, r4, r5, r6)
            return r7
    }

    public static boolean addLinks(android.text.Spannable r9, java.util.regex.Pattern r10, java.lang.String r11, java.lang.String[] r12, android.text.util.Linkify.MatchFilter r13, android.text.util.Linkify.TransformFilter r14) {
            boolean r0 = shouldAddLinksFallbackToFramework()
            if (r0 == 0) goto Lb
            boolean r0 = androidx.core.text.util.LinkifyCompat.Api24Impl.addLinks(r9, r10, r11, r12, r13, r14)
            return r0
        Lb:
            if (r11 != 0) goto Lf
            java.lang.String r11 = ""
        Lf:
            r0 = 1
            if (r12 == 0) goto L15
            int r1 = r12.length
            if (r1 >= r0) goto L17
        L15:
            java.lang.String[] r12 = androidx.core.text.util.LinkifyCompat.EMPTY_STRING
        L17:
            int r1 = r12.length
            int r1 = r1 + r0
            java.lang.String[] r0 = new java.lang.String[r1]
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r1 = r11.toLowerCase(r1)
            r2 = 0
            r0[r2] = r1
            r1 = 0
        L25:
            int r3 = r12.length
            if (r1 >= r3) goto L3c
            r3 = r12[r1]
            int r4 = r1 + 1
            if (r3 != 0) goto L31
            java.lang.String r5 = ""
            goto L37
        L31:
            java.util.Locale r5 = java.util.Locale.ROOT
            java.lang.String r5 = r3.toLowerCase(r5)
        L37:
            r0[r4] = r5
            int r1 = r1 + 1
            goto L25
        L3c:
            r1 = 0
            java.util.regex.Matcher r3 = r10.matcher(r9)
        L41:
            boolean r4 = r3.find()
            if (r4 == 0) goto L67
            int r4 = r3.start()
            int r5 = r3.end()
            java.lang.String r6 = r3.group(r2)
            r7 = 1
            if (r13 == 0) goto L5a
            boolean r7 = r13.acceptMatch(r9, r4, r5)
        L5a:
            if (r7 == 0) goto L66
            if (r6 == 0) goto L66
            java.lang.String r8 = makeUrl(r6, r0, r3, r14)
            applyLink(r8, r4, r5, r9)
            r1 = 1
        L66:
            goto L41
        L67:
            return r1
    }

    public static boolean addLinks(android.widget.TextView r5, int r6) {
            boolean r0 = shouldAddLinksFallbackToFramework()
            if (r0 == 0) goto Lb
            boolean r0 = android.text.util.Linkify.addLinks(r5, r6)
            return r0
        Lb:
            r0 = 0
            if (r6 != 0) goto Lf
            return r0
        Lf:
            java.lang.CharSequence r1 = r5.getText()
            boolean r2 = r1 instanceof android.text.Spannable
            r3 = 1
            if (r2 == 0) goto L25
            r2 = r1
            android.text.Spannable r2 = (android.text.Spannable) r2
            boolean r2 = addLinks(r2, r6)
            if (r2 == 0) goto L36
            addLinkMovementMethod(r5)
            return r3
        L25:
            android.text.SpannableString r2 = android.text.SpannableString.valueOf(r1)
            boolean r4 = addLinks(r2, r6)
            if (r4 == 0) goto L36
            addLinkMovementMethod(r5)
            r5.setText(r2)
            return r3
        L36:
            return r0
    }

    private static void applyLink(java.lang.String r2, int r3, int r4, android.text.Spannable r5) {
            android.text.style.URLSpan r0 = new android.text.style.URLSpan
            r0.<init>(r2)
            r1 = 33
            r5.setSpan(r0, r3, r4, r1)
            return
    }

    private static java.lang.String findAddress(java.lang.String r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Lb
            java.lang.String r0 = android.webkit.WebView.findAddress(r2)
            return r0
        Lb:
            java.lang.String r0 = androidx.core.text.util.FindAddress.findAddress(r2)
            return r0
    }

    private static void gatherLinks(java.util.ArrayList<androidx.core.text.util.LinkifyCompat.LinkSpec> r6, android.text.Spannable r7, java.util.regex.Pattern r8, java.lang.String[] r9, android.text.util.Linkify.MatchFilter r10, android.text.util.Linkify.TransformFilter r11) {
            java.util.regex.Matcher r0 = r8.matcher(r7)
        L4:
            boolean r1 = r0.find()
            if (r1 == 0) goto L34
            int r1 = r0.start()
            int r2 = r0.end()
            r3 = 0
            java.lang.String r3 = r0.group(r3)
            if (r10 == 0) goto L1f
            boolean r4 = r10.acceptMatch(r7, r1, r2)
            if (r4 == 0) goto L33
        L1f:
            if (r3 == 0) goto L33
            androidx.core.text.util.LinkifyCompat$LinkSpec r4 = new androidx.core.text.util.LinkifyCompat$LinkSpec
            r4.<init>()
            java.lang.String r5 = makeUrl(r3, r9, r0, r11)
            r4.url = r5
            r4.start = r1
            r4.end = r2
            r6.add(r4)
        L33:
            goto L4
        L34:
            return
    }

    private static void gatherMapLinks(java.util.ArrayList<androidx.core.text.util.LinkifyCompat.LinkSpec> r10, android.text.Spannable r11) {
            java.lang.String r0 = r11.toString()
            r1 = 0
        L5:
            java.lang.String r2 = findAddress(r0)     // Catch: java.lang.UnsupportedOperationException -> L50
            r3 = r2
            if (r2 == 0) goto L4f
            int r2 = r0.indexOf(r3)     // Catch: java.lang.UnsupportedOperationException -> L50
            if (r2 >= 0) goto L13
            goto L4f
        L13:
            androidx.core.text.util.LinkifyCompat$LinkSpec r4 = new androidx.core.text.util.LinkifyCompat$LinkSpec     // Catch: java.lang.UnsupportedOperationException -> L50
            r4.<init>()     // Catch: java.lang.UnsupportedOperationException -> L50
            int r5 = r3.length()     // Catch: java.lang.UnsupportedOperationException -> L50
            int r6 = r2 + r5
            int r7 = r1 + r2
            r4.start = r7     // Catch: java.lang.UnsupportedOperationException -> L50
            int r7 = r1 + r6
            r4.end = r7     // Catch: java.lang.UnsupportedOperationException -> L50
            java.lang.String r7 = r0.substring(r6)     // Catch: java.lang.UnsupportedOperationException -> L50
            r0 = r7
            int r1 = r1 + r6
            java.lang.String r7 = "UTF-8"
            java.lang.String r7 = java.net.URLEncoder.encode(r3, r7)     // Catch: java.io.UnsupportedEncodingException -> L4d java.lang.UnsupportedOperationException -> L50
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.UnsupportedOperationException -> L50
            r8.<init>()     // Catch: java.lang.UnsupportedOperationException -> L50
            java.lang.String r9 = "geo:0,0?q="
            java.lang.StringBuilder r8 = r8.append(r9)     // Catch: java.lang.UnsupportedOperationException -> L50
            java.lang.StringBuilder r8 = r8.append(r7)     // Catch: java.lang.UnsupportedOperationException -> L50
            java.lang.String r8 = r8.toString()     // Catch: java.lang.UnsupportedOperationException -> L50
            r4.url = r8     // Catch: java.lang.UnsupportedOperationException -> L50
            r10.add(r4)     // Catch: java.lang.UnsupportedOperationException -> L50
            goto L5
        L4d:
            r7 = move-exception
            goto L5
        L4f:
            goto L51
        L50:
            r2 = move-exception
        L51:
            return
    }

    static /* synthetic */ int lambda$static$0(androidx.core.text.util.LinkifyCompat.LinkSpec r2, androidx.core.text.util.LinkifyCompat.LinkSpec r3) {
            int r0 = r2.start
            int r1 = r3.start
            if (r0 >= r1) goto L8
            r0 = -1
            return r0
        L8:
            int r0 = r2.start
            int r1 = r3.start
            if (r0 <= r1) goto L10
            r0 = 1
            return r0
        L10:
            int r0 = r3.end
            int r1 = r2.end
            int r0 = java.lang.Integer.compare(r0, r1)
            return r0
    }

    private static java.lang.String makeUrl(java.lang.String r9, java.lang.String[] r10, java.util.regex.Matcher r11, android.text.util.Linkify.TransformFilter r12) {
            if (r12 == 0) goto L8
            java.lang.String r9 = r12.transformUrl(r11, r9)
            r0 = r9
            goto L9
        L8:
            r0 = r9
        L9:
            r9 = 0
            int r6 = r10.length
            r7 = 0
            r8 = r7
        Ld:
            if (r8 >= r6) goto L49
            r3 = r10[r8]
            r4 = 0
            int r5 = r3.length()
            r1 = 1
            r2 = 0
            boolean r1 = r0.regionMatches(r1, r2, r3, r4, r5)
            if (r1 == 0) goto L46
            r9 = 1
            r4 = 0
            int r5 = r3.length()
            r1 = 0
            r2 = 0
            boolean r1 = r0.regionMatches(r1, r2, r3, r4, r5)
            if (r1 != 0) goto L49
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r1 = r1.append(r3)
            int r2 = r3.length()
            java.lang.String r2 = r0.substring(r2)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r0 = r1.toString()
            goto L49
        L46:
            int r8 = r8 + 1
            goto Ld
        L49:
            if (r9 != 0) goto L61
            int r1 = r10.length
            if (r1 <= 0) goto L61
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r2 = r10[r7]
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r0)
            java.lang.String r0 = r1.toString()
        L61:
            return r0
    }

    private static void pruneOverlaps(java.util.ArrayList<androidx.core.text.util.LinkifyCompat.LinkSpec> r9, android.text.Spannable r10) {
            int r0 = r10.length()
            java.lang.Class<android.text.style.URLSpan> r1 = android.text.style.URLSpan.class
            r2 = 0
            java.lang.Object[] r0 = r10.getSpans(r2, r0, r1)
            android.text.style.URLSpan[] r0 = (android.text.style.URLSpan[]) r0
            int r1 = r0.length
        Le:
            if (r2 >= r1) goto L2b
            r3 = r0[r2]
            androidx.core.text.util.LinkifyCompat$LinkSpec r4 = new androidx.core.text.util.LinkifyCompat$LinkSpec
            r4.<init>()
            r4.frameworkAddedSpan = r3
            int r5 = r10.getSpanStart(r3)
            r4.start = r5
            int r5 = r10.getSpanEnd(r3)
            r4.end = r5
            r9.add(r4)
            int r2 = r2 + 1
            goto Le
        L2b:
            java.util.Comparator<androidx.core.text.util.LinkifyCompat$LinkSpec> r1 = androidx.core.text.util.LinkifyCompat.COMPARATOR
            java.util.Collections.sort(r9, r1)
            int r1 = r9.size()
            r2 = 0
        L35:
            int r3 = r1 + (-1)
            if (r2 >= r3) goto L93
            java.lang.Object r3 = r9.get(r2)
            androidx.core.text.util.LinkifyCompat$LinkSpec r3 = (androidx.core.text.util.LinkifyCompat.LinkSpec) r3
            int r4 = r2 + 1
            java.lang.Object r4 = r9.get(r4)
            androidx.core.text.util.LinkifyCompat$LinkSpec r4 = (androidx.core.text.util.LinkifyCompat.LinkSpec) r4
            r5 = -1
            int r6 = r3.start
            int r7 = r4.start
            if (r6 > r7) goto L8f
            int r6 = r3.end
            int r7 = r4.start
            if (r6 <= r7) goto L8f
            int r6 = r4.end
            int r7 = r3.end
            if (r6 > r7) goto L5d
            int r5 = r2 + 1
            goto L79
        L5d:
            int r6 = r3.end
            int r7 = r3.start
            int r6 = r6 - r7
            int r7 = r4.end
            int r8 = r4.start
            int r7 = r7 - r8
            if (r6 <= r7) goto L6c
            int r5 = r2 + 1
            goto L79
        L6c:
            int r6 = r3.end
            int r7 = r3.start
            int r6 = r6 - r7
            int r7 = r4.end
            int r8 = r4.start
            int r7 = r7 - r8
            if (r6 >= r7) goto L79
            r5 = r2
        L79:
            r6 = -1
            if (r5 == r6) goto L8f
            java.lang.Object r6 = r9.get(r5)
            androidx.core.text.util.LinkifyCompat$LinkSpec r6 = (androidx.core.text.util.LinkifyCompat.LinkSpec) r6
            android.text.style.URLSpan r6 = r6.frameworkAddedSpan
            if (r6 == 0) goto L89
            r10.removeSpan(r6)
        L89:
            r9.remove(r5)
            int r1 = r1 + (-1)
            goto L35
        L8f:
            int r2 = r2 + 1
            goto L35
        L93:
            return
    }

    private static boolean shouldAddLinksFallbackToFramework() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }
}
