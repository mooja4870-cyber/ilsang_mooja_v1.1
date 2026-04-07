package com.getcapacitor.util;

/* JADX INFO: loaded from: classes2.dex */
public class WebColor {
    public WebColor() {
            r0 = this;
            r0.<init>()
            return
    }

    public static int parseColor(java.lang.String r5) {
            r0 = r5
            r1 = 0
            char r1 = r5.charAt(r1)
            r2 = 35
            java.lang.String r3 = "#"
            if (r1 == r2) goto L1d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.StringBuilder r1 = r1.append(r0)
            java.lang.String r0 = r1.toString()
        L1d:
            int r1 = r0.length()
            r2 = 7
            if (r1 == r2) goto L35
            int r1 = r0.length()
            r4 = 9
            if (r1 != r4) goto L2d
            goto L35
        L2d:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "The encoded color space is invalid or unknown"
            r1.<init>(r2)
            throw r1
        L35:
            int r1 = r0.length()
            if (r1 != r2) goto L40
            int r1 = android.graphics.Color.parseColor(r0)
            return r1
        L40:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r3 = r0.substring(r2)
            java.lang.StringBuilder r1 = r1.append(r3)
            r3 = 1
            java.lang.String r2 = r0.substring(r3, r2)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r0 = r1.toString()
            int r1 = android.graphics.Color.parseColor(r0)
            return r1
    }
}
