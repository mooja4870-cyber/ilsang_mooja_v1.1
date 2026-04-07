package androidx.webkit.internal;

/* JADX INFO: loaded from: classes.dex */
class MimeUtil {
    MimeUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String getMimeFromFileName(java.lang.String r2) {
            if (r2 != 0) goto L4
            r0 = 0
            return r0
        L4:
            java.lang.String r0 = java.net.URLConnection.guessContentTypeFromName(r2)
            if (r0 == 0) goto Lb
            return r0
        Lb:
            java.lang.String r1 = guessHardcodedMime(r2)
            return r1
    }

    private static java.lang.String guessHardcodedMime(java.lang.String r6) {
            r0 = 46
            int r1 = r6.lastIndexOf(r0)
            r2 = 0
            r3 = -1
            if (r1 != r3) goto Lb
            return r2
        Lb:
            int r4 = r1 + 1
            java.lang.String r4 = r6.substring(r4)
            java.lang.String r4 = r4.toLowerCase()
            int r5 = r4.hashCode()
            switch(r5) {
                case 3315: goto L258;
                case 3401: goto L24d;
                case 97669: goto L242;
                case 98819: goto L237;
                case 102340: goto L22c;
                case 103649: goto L221;
                case 104085: goto L216;
                case 105441: goto L20b;
                case 106458: goto L200;
                case 106479: goto L1f4;
                case 108089: goto L1e8;
                case 108150: goto L1dc;
                case 108272: goto L1d1;
                case 108273: goto L1c5;
                case 108324: goto L1ba;
                case 109961: goto L1ae;
                case 109967: goto L1a2;
                case 109973: goto L196;
                case 109982: goto L18a;
                case 110834: goto L17e;
                case 111030: goto L172;
                case 111145: goto L166;
                case 114276: goto L15a;
                case 114791: goto L14e;
                case 114833: goto L142;
                case 117484: goto L136;
                case 118660: goto L12b;
                case 118807: goto L11f;
                case 120609: goto L115;
                case 3000872: goto L109;
                case 3145576: goto Lfd;
                case 3213227: goto Lf1;
                case 3259225: goto Le5;
                case 3268712: goto Ld9;
                case 3271912: goto Lcd;
                case 3358085: goto Lc2;
                case 3418175: goto Lb6;
                case 3529614: goto Laa;
                case 3542678: goto L9e;
                case 3559925: goto L92;
                case 3642020: goto L87;
                case 3645337: goto L7c;
                case 3645340: goto L70;
                case 3655064: goto L64;
                case 3678569: goto L59;
                case 96488848: goto L4d;
                case 103877016: goto L41;
                case 106703064: goto L35;
                case 109418142: goto L29;
                case 114035747: goto L1e;
                default: goto L1c;
            }
        L1c:
            goto L263
        L1e:
            java.lang.String r0 = "xhtml"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L1c
            r0 = 5
            goto L264
        L29:
            java.lang.String r0 = "shtml"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L1c
            r0 = 30
            goto L264
        L35:
            java.lang.String r0 = "pjpeg"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L1c
            r0 = 18
            goto L264
        L41:
            java.lang.String r0 = "mhtml"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L1c
            r0 = 26
            goto L264
        L4d:
            java.lang.String r0 = "ehtml"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L1c
            r0 = 32
            goto L264
        L59:
            java.lang.String r0 = "xhtm"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L1c
            r0 = 7
            goto L264
        L64:
            java.lang.String r0 = "woff"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L1c
            r0 = 41
            goto L264
        L70:
            java.lang.String r0 = "webp"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L1c
            r0 = 24
            goto L264
        L7c:
            java.lang.String r0 = "webm"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L1c
            r0 = 0
            goto L264
        L87:
            java.lang.String r0 = "wasm"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L1c
            r0 = 4
            goto L264
        L92:
            java.lang.String r0 = "tiff"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L1c
            r0 = 48
            goto L264
        L9e:
            java.lang.String r0 = "svgz"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L1c
            r0 = 23
            goto L264
        Laa:
            java.lang.String r0 = "shtm"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L1c
            r0 = 31
            goto L264
        Lb6:
            java.lang.String r0 = "opus"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L1c
            r0 = 11
            goto L264
        Lc2:
            java.lang.String r0 = "mpeg"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L1c
            r0 = 1
            goto L264
        Lcd:
            java.lang.String r0 = "json"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L1c
            r0 = 44
            goto L264
        Ld9:
            java.lang.String r0 = "jpeg"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L1c
            r0 = 15
            goto L264
        Le5:
            java.lang.String r0 = "jfif"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L1c
            r0 = 17
            goto L264
        Lf1:
            java.lang.String r0 = "html"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L1c
            r0 = 28
            goto L264
        Lfd:
            java.lang.String r0 = "flac"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L1c
            r0 = 8
            goto L264
        L109:
            java.lang.String r0 = "apng"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L1c
            r0 = 21
            goto L264
        L115:
            java.lang.String r5 = "zip"
            boolean r5 = r4.equals(r5)
            if (r5 == 0) goto L1c
            goto L264
        L11f:
            java.lang.String r0 = "xml"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L1c
            r0 = 35
            goto L264
        L12b:
            java.lang.String r0 = "xht"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L1c
            r0 = 6
            goto L264
        L136:
            java.lang.String r0 = "wav"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L1c
            r0 = 12
            goto L264
        L142:
            java.lang.String r0 = "tif"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L1c
            r0 = 49
            goto L264
        L14e:
            java.lang.String r0 = "tgz"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L1c
            r0 = 43
            goto L264
        L15a:
            java.lang.String r0 = "svg"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L1c
            r0 = 22
            goto L264
        L166:
            java.lang.String r0 = "png"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L1c
            r0 = 20
            goto L264
        L172:
            java.lang.String r0 = "pjp"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L1c
            r0 = 19
            goto L264
        L17e:
            java.lang.String r0 = "pdf"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L1c
            r0 = 45
            goto L264
        L18a:
            java.lang.String r0 = "ogv"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L1c
            r0 = 38
            goto L264
        L196:
            java.lang.String r0 = "ogm"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L1c
            r0 = 39
            goto L264
        L1a2:
            java.lang.String r0 = "ogg"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L1c
            r0 = 9
            goto L264
        L1ae:
            java.lang.String r0 = "oga"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L1c
            r0 = 10
            goto L264
        L1ba:
            java.lang.String r0 = "mpg"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L1c
            r0 = 2
            goto L264
        L1c5:
            java.lang.String r0 = "mp4"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L1c
            r0 = 36
            goto L264
        L1d1:
            java.lang.String r0 = "mp3"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L1c
            r0 = 3
            goto L264
        L1dc:
            java.lang.String r0 = "mjs"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L1c
            r0 = 34
            goto L264
        L1e8:
            java.lang.String r0 = "mht"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L1c
            r0 = 25
            goto L264
        L1f4:
            java.lang.String r0 = "m4v"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L1c
            r0 = 37
            goto L264
        L200:
            java.lang.String r0 = "m4a"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L1c
            r0 = 13
            goto L264
        L20b:
            java.lang.String r0 = "jpg"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L1c
            r0 = 16
            goto L264
        L216:
            java.lang.String r0 = "ico"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L1c
            r0 = 40
            goto L264
        L221:
            java.lang.String r0 = "htm"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L1c
            r0 = 29
            goto L264
        L22c:
            java.lang.String r0 = "gif"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L1c
            r0 = 14
            goto L264
        L237:
            java.lang.String r0 = "css"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L1c
            r0 = 27
            goto L264
        L242:
            java.lang.String r0 = "bmp"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L1c
            r0 = 47
            goto L264
        L24d:
            java.lang.String r0 = "js"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L1c
            r0 = 33
            goto L264
        L258:
            java.lang.String r0 = "gz"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L1c
            r0 = 42
            goto L264
        L263:
            r0 = r3
        L264:
            switch(r0) {
                case 0: goto L2bf;
                case 1: goto L2bc;
                case 2: goto L2bc;
                case 3: goto L2b9;
                case 4: goto L2b6;
                case 5: goto L2b3;
                case 6: goto L2b3;
                case 7: goto L2b3;
                case 8: goto L2b0;
                case 9: goto L2ad;
                case 10: goto L2ad;
                case 11: goto L2ad;
                case 12: goto L2aa;
                case 13: goto L2a7;
                case 14: goto L2a4;
                case 15: goto L2a1;
                case 16: goto L2a1;
                case 17: goto L2a1;
                case 18: goto L2a1;
                case 19: goto L2a1;
                case 20: goto L29e;
                case 21: goto L29b;
                case 22: goto L298;
                case 23: goto L298;
                case 24: goto L295;
                case 25: goto L292;
                case 26: goto L292;
                case 27: goto L28f;
                case 28: goto L28c;
                case 29: goto L28c;
                case 30: goto L28c;
                case 31: goto L28c;
                case 32: goto L28c;
                case 33: goto L289;
                case 34: goto L289;
                case 35: goto L286;
                case 36: goto L283;
                case 37: goto L283;
                case 38: goto L280;
                case 39: goto L280;
                case 40: goto L27d;
                case 41: goto L27a;
                case 42: goto L277;
                case 43: goto L277;
                case 44: goto L274;
                case 45: goto L271;
                case 46: goto L26e;
                case 47: goto L26b;
                case 48: goto L268;
                case 49: goto L268;
                default: goto L267;
            }
        L267:
            return r2
        L268:
            java.lang.String r0 = "image/tiff"
            return r0
        L26b:
            java.lang.String r0 = "image/bmp"
            return r0
        L26e:
            java.lang.String r0 = "application/zip"
            return r0
        L271:
            java.lang.String r0 = "application/pdf"
            return r0
        L274:
            java.lang.String r0 = "application/json"
            return r0
        L277:
            java.lang.String r0 = "application/gzip"
            return r0
        L27a:
            java.lang.String r0 = "application/font-woff"
            return r0
        L27d:
            java.lang.String r0 = "image/x-icon"
            return r0
        L280:
            java.lang.String r0 = "video/ogg"
            return r0
        L283:
            java.lang.String r0 = "video/mp4"
            return r0
        L286:
            java.lang.String r0 = "text/xml"
            return r0
        L289:
            java.lang.String r0 = "text/javascript"
            return r0
        L28c:
            java.lang.String r0 = "text/html"
            return r0
        L28f:
            java.lang.String r0 = "text/css"
            return r0
        L292:
            java.lang.String r0 = "multipart/related"
            return r0
        L295:
            java.lang.String r0 = "image/webp"
            return r0
        L298:
            java.lang.String r0 = "image/svg+xml"
            return r0
        L29b:
            java.lang.String r0 = "image/apng"
            return r0
        L29e:
            java.lang.String r0 = "image/png"
            return r0
        L2a1:
            java.lang.String r0 = "image/jpeg"
            return r0
        L2a4:
            java.lang.String r0 = "image/gif"
            return r0
        L2a7:
            java.lang.String r0 = "audio/x-m4a"
            return r0
        L2aa:
            java.lang.String r0 = "audio/wav"
            return r0
        L2ad:
            java.lang.String r0 = "audio/ogg"
            return r0
        L2b0:
            java.lang.String r0 = "audio/flac"
            return r0
        L2b3:
            java.lang.String r0 = "application/xhtml+xml"
            return r0
        L2b6:
            java.lang.String r0 = "application/wasm"
            return r0
        L2b9:
            java.lang.String r0 = "audio/mpeg"
            return r0
        L2bc:
            java.lang.String r0 = "video/mpeg"
            return r0
        L2bf:
            java.lang.String r0 = "video/webm"
            return r0
    }
}
