package com.getcapacitor;

/* JADX INFO: loaded from: classes3.dex */
public class UriMatcher {
    private static final int EXACT = 0;
    private static final int MASK = 3;
    static final java.util.regex.Pattern PATH_SPLIT_PATTERN = null;
    private static final int REST = 2;
    private static final int TEXT = 1;
    private java.util.ArrayList<com.getcapacitor.UriMatcher> mChildren;
    private java.lang.Object mCode;
    private java.lang.String mText;
    private int mWhich;

    static {
            java.lang.String r0 = "/"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            com.getcapacitor.UriMatcher.PATH_SPLIT_PATTERN = r0
            return
    }

    private UriMatcher() {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.mCode = r0
            r1 = -1
            r2.mWhich = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2.mChildren = r1
            r2.mText = r0
            return
    }

    public UriMatcher(java.lang.Object r2) {
            r1 = this;
            r1.<init>()
            r1.mCode = r2
            r0 = -1
            r1.mWhich = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.mChildren = r0
            r0 = 0
            r1.mText = r0
            return
    }

    public void addURI(java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.Object r19) {
            r15 = this;
            r0 = r18
            r1 = r19
            if (r1 == 0) goto L92
            r2 = 0
            r3 = 0
            r4 = 1
            if (r0 == 0) goto L25
            r5 = r18
            boolean r6 = r0.isEmpty()
            if (r6 != 0) goto L1f
            char r6 = r0.charAt(r3)
            r7 = 47
            if (r6 != r7) goto L1f
            java.lang.String r5 = r0.substring(r4)
        L1f:
            java.util.regex.Pattern r6 = com.getcapacitor.UriMatcher.PATH_SPLIT_PATTERN
            java.lang.String[] r2 = r6.split(r5)
        L25:
            if (r2 == 0) goto L29
            int r5 = r2.length
            goto L2a
        L29:
            r5 = r3
        L2a:
            r6 = r15
            r7 = -2
        L2c:
            if (r7 >= r5) goto L8f
            r8 = -2
            r9 = -1
            if (r7 != r8) goto L35
            r8 = r16
            goto L3c
        L35:
            if (r7 != r9) goto L3a
            r8 = r17
            goto L3c
        L3a:
            r8 = r2[r7]
        L3c:
            java.util.ArrayList<com.getcapacitor.UriMatcher> r10 = r6.mChildren
            int r11 = r10.size()
            r12 = 0
        L43:
            if (r12 >= r11) goto L58
            java.lang.Object r13 = r10.get(r12)
            com.getcapacitor.UriMatcher r13 = (com.getcapacitor.UriMatcher) r13
            java.lang.String r14 = r13.mText
            boolean r14 = r8.equals(r14)
            if (r14 == 0) goto L55
            r6 = r13
            goto L58
        L55:
            int r12 = r12 + 1
            goto L43
        L58:
            if (r12 != r11) goto L8c
            com.getcapacitor.UriMatcher r13 = new com.getcapacitor.UriMatcher
            r13.<init>()
            java.lang.String r14 = "*"
            if (r7 != r9) goto L6d
            boolean r9 = r8.contains(r14)
            if (r9 == 0) goto L6d
            r9 = 3
            r13.mWhich = r9
            goto L84
        L6d:
            java.lang.String r9 = "**"
            boolean r9 = r8.equals(r9)
            if (r9 == 0) goto L79
            r9 = 2
            r13.mWhich = r9
            goto L84
        L79:
            boolean r9 = r8.equals(r14)
            if (r9 == 0) goto L82
            r13.mWhich = r4
            goto L84
        L82:
            r13.mWhich = r3
        L84:
            r13.mText = r8
            java.util.ArrayList<com.getcapacitor.UriMatcher> r9 = r6.mChildren
            r9.add(r13)
            r6 = r13
        L8c:
            int r7 = r7 + 1
            goto L2c
        L8f:
            r6.mCode = r1
            return
        L92:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Code can't be null"
            r2.<init>(r3)
            throw r2
    }

    public java.lang.Object match(android.net.Uri r11) {
            r10 = this;
            java.util.List r0 = r11.getPathSegments()
            int r1 = r0.size()
            r2 = r10
            if (r1 != 0) goto L14
            java.lang.String r3 = r11.getAuthority()
            if (r3 != 0) goto L14
            java.lang.Object r3 = r10.mCode
            return r3
        L14:
            r3 = -2
        L15:
            if (r3 >= r1) goto L6f
            r4 = -2
            if (r3 != r4) goto L1f
            java.lang.String r4 = r11.getScheme()
            goto L2d
        L1f:
            r4 = -1
            if (r3 != r4) goto L27
            java.lang.String r4 = r11.getAuthority()
            goto L2d
        L27:
            java.lang.Object r4 = r0.get(r3)
            java.lang.String r4 = (java.lang.String) r4
        L2d:
            java.util.ArrayList<com.getcapacitor.UriMatcher> r5 = r2.mChildren
            if (r5 != 0) goto L32
            goto L6f
        L32:
            r2 = 0
            int r6 = r5.size()
            r7 = 0
        L38:
            if (r7 >= r6) goto L68
            java.lang.Object r8 = r5.get(r7)
            com.getcapacitor.UriMatcher r8 = (com.getcapacitor.UriMatcher) r8
            int r9 = r8.mWhich
            switch(r9) {
                case 0: goto L59;
                case 1: goto L57;
                case 2: goto L54;
                case 3: goto L46;
                default: goto L45;
            }
        L45:
            goto L62
        L46:
            java.lang.String r9 = r8.mText
            com.getcapacitor.util.HostMask r9 = com.getcapacitor.util.HostMask.Parser.parse(r9)
            boolean r9 = r9.matches(r4)
            if (r9 == 0) goto L62
            r2 = r8
            goto L62
        L54:
            java.lang.Object r9 = r8.mCode
            return r9
        L57:
            r2 = r8
            goto L62
        L59:
            java.lang.String r9 = r8.mText
            boolean r9 = r9.equals(r4)
            if (r9 == 0) goto L62
            r2 = r8
        L62:
            if (r2 == 0) goto L65
            goto L68
        L65:
            int r7 = r7 + 1
            goto L38
        L68:
            if (r2 != 0) goto L6c
            r7 = 0
            return r7
        L6c:
            int r3 = r3 + 1
            goto L15
        L6f:
            java.lang.Object r3 = r2.mCode
            return r3
    }
}
