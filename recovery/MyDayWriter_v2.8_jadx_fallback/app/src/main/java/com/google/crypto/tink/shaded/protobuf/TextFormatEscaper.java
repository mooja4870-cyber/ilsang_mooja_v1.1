package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes.dex */
final class TextFormatEscaper {



    private interface ByteSequence {
        byte byteAt(int r1);

        int size();
    }

    private TextFormatEscaper() {
            r0 = this;
            r0.<init>()
            return
    }

    static java.lang.String escapeBytes(com.google.crypto.tink.shaded.protobuf.ByteString r1) {
            com.google.crypto.tink.shaded.protobuf.TextFormatEscaper$1 r0 = new com.google.crypto.tink.shaded.protobuf.TextFormatEscaper$1
            r0.<init>(r1)
            java.lang.String r0 = escapeBytes(r0)
            return r0
    }

    static java.lang.String escapeBytes(com.google.crypto.tink.shaded.protobuf.TextFormatEscaper.ByteSequence r4) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r4.size()
            r0.<init>(r1)
            r1 = 0
        La:
            int r2 = r4.size()
            if (r1 >= r2) goto L84
            byte r2 = r4.byteAt(r1)
            switch(r2) {
                case 7: goto L5a;
                case 8: goto L54;
                case 9: goto L4e;
                case 10: goto L48;
                case 11: goto L42;
                case 12: goto L3c;
                case 13: goto L36;
                case 34: goto L30;
                case 39: goto L2a;
                case 92: goto L24;
                default: goto L17;
            }
        L17:
            r3 = 32
            if (r2 < r3) goto L60
            r3 = 126(0x7e, float:1.77E-43)
            if (r2 > r3) goto L60
            char r3 = (char) r2
            r0.append(r3)
            goto L81
        L24:
            java.lang.String r3 = "\\\\"
            r0.append(r3)
            goto L81
        L2a:
            java.lang.String r3 = "\\'"
            r0.append(r3)
            goto L81
        L30:
            java.lang.String r3 = "\\\""
            r0.append(r3)
            goto L81
        L36:
            java.lang.String r3 = "\\r"
            r0.append(r3)
            goto L81
        L3c:
            java.lang.String r3 = "\\f"
            r0.append(r3)
            goto L81
        L42:
            java.lang.String r3 = "\\v"
            r0.append(r3)
            goto L81
        L48:
            java.lang.String r3 = "\\n"
            r0.append(r3)
            goto L81
        L4e:
            java.lang.String r3 = "\\t"
            r0.append(r3)
            goto L81
        L54:
            java.lang.String r3 = "\\b"
            r0.append(r3)
            goto L81
        L5a:
            java.lang.String r3 = "\\a"
            r0.append(r3)
            goto L81
        L60:
            r3 = 92
            r0.append(r3)
            int r3 = r2 >>> 6
            r3 = r3 & 3
            int r3 = r3 + 48
            char r3 = (char) r3
            r0.append(r3)
            int r3 = r2 >>> 3
            r3 = r3 & 7
            int r3 = r3 + 48
            char r3 = (char) r3
            r0.append(r3)
            r3 = r2 & 7
            int r3 = r3 + 48
            char r3 = (char) r3
            r0.append(r3)
        L81:
            int r1 = r1 + 1
            goto La
        L84:
            java.lang.String r1 = r0.toString()
            return r1
    }

    static java.lang.String escapeBytes(byte[] r1) {
            com.google.crypto.tink.shaded.protobuf.TextFormatEscaper$2 r0 = new com.google.crypto.tink.shaded.protobuf.TextFormatEscaper$2
            r0.<init>(r1)
            java.lang.String r0 = escapeBytes(r0)
            return r0
    }

    static java.lang.String escapeDoubleQuotesAndBackslashes(java.lang.String r3) {
            java.lang.String r0 = "\\"
            java.lang.String r1 = "\\\\"
            java.lang.String r0 = r3.replace(r0, r1)
            java.lang.String r1 = "\""
            java.lang.String r2 = "\\\""
            java.lang.String r0 = r0.replace(r1, r2)
            return r0
    }

    static java.lang.String escapeText(java.lang.String r1) {
            com.google.crypto.tink.shaded.protobuf.ByteString r0 = com.google.crypto.tink.shaded.protobuf.ByteString.copyFromUtf8(r1)
            java.lang.String r0 = escapeBytes(r0)
            return r0
    }
}
