package androidx.webkit;

/* JADX INFO: loaded from: classes.dex */
public final class URLUtilCompat {
    private static final java.util.regex.Pattern DISPOSITION_PATTERN = null;

    static {
            java.lang.String r0 = "\\s*(\\S+?) # Group 1: parameter name\n\\s*=\\s* # Match equals sign\n(?: # non-capturing group of options\n   '( (?: [^'\\\\] | \\\\. )* )' # Group 2: single-quoted\n | \"( (?: [^\"\\\\] | \\\\. )*  )\" # Group 3: double-quoted\n | ( [^'\"][^;\\s]* ) # Group 4: un-quoted parameter\n)\\s*;? # Optional end semicolon"
            r1 = 4
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0, r1)
            androidx.webkit.URLUtilCompat.DISPOSITION_PATTERN = r0
            return
    }

    private URLUtilCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    private static java.lang.String encodePlusCharacters(java.lang.String r8, java.lang.String r9) {
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r9)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "+"
            java.nio.ByteBuffer r2 = r0.encode(r2)
            byte[] r2 = r2.array()
            int r3 = r2.length
            r4 = 0
        L15:
            if (r4 >= r3) goto L2d
            r5 = r2[r4]
            java.lang.Byte r6 = java.lang.Byte.valueOf(r5)
            java.lang.Object[] r6 = new java.lang.Object[]{r6}
            java.lang.String r7 = "%02x"
            java.lang.String r6 = java.lang.String.format(r7, r6)
            r1.append(r6)
            int r4 = r4 + 1
            goto L15
        L2d:
            java.lang.String r2 = "\\+"
            java.lang.String r3 = r1.toString()
            java.lang.String r2 = r8.replaceAll(r2, r3)
            return r2
    }

    private static boolean extensionDifferentFromMimeType(java.lang.String r4, java.lang.String r5) {
            r0 = 0
            if (r5 != 0) goto L4
            return r0
        L4:
            r1 = 46
            int r1 = r4.lastIndexOf(r1)
            android.webkit.MimeTypeMap r2 = android.webkit.MimeTypeMap.getSingleton()
            int r3 = r1 + 1
            java.lang.String r3 = r4.substring(r3)
            java.lang.String r2 = r2.getMimeTypeFromExtension(r3)
            if (r2 == 0) goto L21
            boolean r3 = r2.equalsIgnoreCase(r5)
            if (r3 != 0) goto L21
            r0 = 1
        L21:
            return r0
    }

    public static java.lang.String getFilenameFromContentDisposition(java.lang.String r11) {
            java.lang.String r0 = r11.trim()
            java.lang.String r1 = ";"
            r2 = 2
            java.lang.String[] r0 = r0.split(r1, r2)
            int r1 = r0.length
            r3 = 0
            if (r1 >= r2) goto L10
            return r3
        L10:
            r1 = 0
            r1 = r0[r1]
            java.lang.String r1 = r1.trim()
            java.lang.String r4 = "inline"
            boolean r4 = r4.equalsIgnoreCase(r1)
            if (r4 == 0) goto L20
            return r3
        L20:
            r3 = 1
            r4 = r0[r3]
            java.util.regex.Pattern r5 = androidx.webkit.URLUtilCompat.DISPOSITION_PATTERN
            java.util.regex.Matcher r5 = r5.matcher(r4)
            r6 = 0
            r7 = 0
        L2b:
            boolean r8 = r5.find()
            if (r8 == 0) goto L75
            java.lang.String r8 = r5.group(r3)
            java.lang.String r9 = r5.group(r2)
            if (r9 == 0) goto L44
            java.lang.String r9 = r5.group(r2)
            java.lang.String r9 = removeSlashEscapes(r9)
            goto L59
        L44:
            r9 = 3
            java.lang.String r10 = r5.group(r9)
            if (r10 == 0) goto L54
            java.lang.String r9 = r5.group(r9)
            java.lang.String r9 = removeSlashEscapes(r9)
            goto L59
        L54:
            r9 = 4
            java.lang.String r9 = r5.group(r9)
        L59:
            if (r8 == 0) goto L2b
            if (r9 != 0) goto L5e
            goto L2b
        L5e:
            java.lang.String r10 = "filename*"
            boolean r10 = r10.equalsIgnoreCase(r8)
            if (r10 == 0) goto L6b
            java.lang.String r7 = parseExtValueString(r9)
            goto L74
        L6b:
            java.lang.String r10 = "filename"
            boolean r10 = r10.equalsIgnoreCase(r8)
            if (r10 == 0) goto L74
            r6 = r9
        L74:
            goto L2b
        L75:
            if (r7 == 0) goto L78
            return r7
        L78:
            return r6
    }

    public static java.lang.String guessFileName(java.lang.String r4, java.lang.String r5, java.lang.String r6) {
            if (r5 == 0) goto Ld
            java.lang.String r0 = getFilenameFromContentDisposition(r5)
            if (r0 == 0) goto Ld
            java.lang.String r1 = replacePathSeparators(r0)
            return r1
        Ld:
            java.lang.String r0 = "downloadfile"
            android.net.Uri r1 = android.net.Uri.parse(r4)
            if (r1 == 0) goto L1f
            java.lang.String r2 = r1.getLastPathSegment()
            if (r2 == 0) goto L1f
            java.lang.String r0 = replacePathSeparators(r2)
        L1f:
            r2 = 46
            int r2 = r0.indexOf(r2)
            if (r2 < 0) goto L2f
            boolean r2 = extensionDifferentFromMimeType(r0, r6)
            if (r2 == 0) goto L2e
            goto L2f
        L2e:
            return r0
        L2f:
            java.lang.String r2 = suggestExtensionFromMimeType(r6)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.StringBuilder r3 = r3.append(r2)
            java.lang.String r3 = r3.toString()
            return r3
    }

    private static java.lang.String parseExtValueString(java.lang.String r5) {
            java.lang.String r0 = "'"
            r1 = 3
            java.lang.String[] r0 = r5.split(r0, r1)
            int r2 = r0.length
            r3 = 0
            if (r2 >= r1) goto Lc
            return r3
        Lc:
            r1 = 0
            r1 = r0[r1]
            r2 = 2
            r2 = r0[r2]
            java.lang.String r4 = encodePlusCharacters(r2, r1)     // Catch: java.io.UnsupportedEncodingException -> L1b java.lang.RuntimeException -> L1d
            java.lang.String r3 = java.net.URLDecoder.decode(r4, r1)     // Catch: java.io.UnsupportedEncodingException -> L1b java.lang.RuntimeException -> L1d
            return r3
        L1b:
            r4 = move-exception
            goto L1e
        L1d:
            r4 = move-exception
        L1e:
            return r3
    }

    private static java.lang.String removeSlashEscapes(java.lang.String r2) {
            if (r2 != 0) goto L4
            r0 = 0
            return r0
        L4:
            java.lang.String r0 = "\\\\(.)"
            java.lang.String r1 = "$1"
            java.lang.String r0 = r2.replaceAll(r0, r1)
            return r0
    }

    private static java.lang.String replacePathSeparators(java.lang.String r2) {
            java.lang.String r0 = "/"
            java.lang.String r1 = "_"
            java.lang.String r0 = r2.replaceAll(r0, r1)
            return r0
    }

    private static java.lang.String suggestExtensionFromMimeType(java.lang.String r3) {
            java.lang.String r0 = ""
            if (r3 != 0) goto L5
            return r0
        L5:
            java.lang.String r1 = r3.trim()
            java.util.Locale r2 = java.util.Locale.ROOT
            java.lang.String r3 = r1.toLowerCase(r2)
            java.lang.String r1 = "application/octet-stream"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L18
            return r0
        L18:
            android.webkit.MimeTypeMap r1 = android.webkit.MimeTypeMap.getSingleton()
            java.lang.String r1 = r1.getExtensionFromMimeType(r3)
            if (r1 == 0) goto L36
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "."
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        L36:
            return r0
    }
}
