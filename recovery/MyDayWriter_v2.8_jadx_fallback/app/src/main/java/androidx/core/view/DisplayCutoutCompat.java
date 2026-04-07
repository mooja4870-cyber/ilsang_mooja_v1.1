package androidx.core.view;

/* JADX INFO: loaded from: classes.dex */
public final class DisplayCutoutCompat {
    private final android.view.DisplayCutout mDisplayCutout;

    static class Api28Impl {
        private Api28Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static android.view.DisplayCutout createDisplayCutout(android.graphics.Rect r1, java.util.List<android.graphics.Rect> r2) {
                android.view.DisplayCutout r0 = new android.view.DisplayCutout
                r0.<init>(r1, r2)
                return r0
        }

        static java.util.List<android.graphics.Rect> getBoundingRects(android.view.DisplayCutout r1) {
                java.util.List r0 = r1.getBoundingRects()
                return r0
        }

        static int getSafeInsetBottom(android.view.DisplayCutout r1) {
                int r0 = r1.getSafeInsetBottom()
                return r0
        }

        static int getSafeInsetLeft(android.view.DisplayCutout r1) {
                int r0 = r1.getSafeInsetLeft()
                return r0
        }

        static int getSafeInsetRight(android.view.DisplayCutout r1) {
                int r0 = r1.getSafeInsetRight()
                return r0
        }

        static int getSafeInsetTop(android.view.DisplayCutout r1) {
                int r0 = r1.getSafeInsetTop()
                return r0
        }
    }

    static class Api29Impl {
        private Api29Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static android.view.DisplayCutout createDisplayCutout(android.graphics.Insets r6, android.graphics.Rect r7, android.graphics.Rect r8, android.graphics.Rect r9, android.graphics.Rect r10) {
                android.view.DisplayCutout r0 = new android.view.DisplayCutout
                r1 = r6
                r2 = r7
                r3 = r8
                r4 = r9
                r5 = r10
                r0.<init>(r1, r2, r3, r4, r5)
                return r0
        }
    }

    static class Api30Impl {
        private Api30Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static android.view.DisplayCutout createDisplayCutout(android.graphics.Insets r7, android.graphics.Rect r8, android.graphics.Rect r9, android.graphics.Rect r10, android.graphics.Rect r11, android.graphics.Insets r12) {
                android.view.DisplayCutout r0 = new android.view.DisplayCutout
                r1 = r7
                r2 = r8
                r3 = r9
                r4 = r10
                r5 = r11
                r6 = r12
                r0.<init>(r1, r2, r3, r4, r5, r6)
                return r0
        }

        static android.graphics.Insets getWaterfallInsets(android.view.DisplayCutout r1) {
                android.graphics.Insets r0 = r1.getWaterfallInsets()
                return r0
        }
    }

    static class Api31Impl {
        private Api31Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static android.graphics.Path getCutoutPath(android.view.DisplayCutout r1) {
                android.graphics.Path r0 = r1.getCutoutPath()
                return r0
        }
    }

    static class Api33Impl {
        private Api33Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static android.view.DisplayCutout createDisplayCutout(android.graphics.Insets r2, android.graphics.Rect r3, android.graphics.Rect r4, android.graphics.Rect r5, android.graphics.Rect r6, android.graphics.Insets r7, android.graphics.Path r8) {
                android.view.DisplayCutout$Builder r0 = new android.view.DisplayCutout$Builder
                r0.<init>()
                android.view.DisplayCutout$Builder r0 = r0.setSafeInsets(r2)
                android.view.DisplayCutout$Builder r0 = r0.setWaterfallInsets(r7)
                if (r3 == 0) goto L12
                r0.setBoundingRectLeft(r3)
            L12:
                if (r4 == 0) goto L17
                r0.setBoundingRectTop(r4)
            L17:
                if (r5 == 0) goto L1c
                r0.setBoundingRectRight(r5)
            L1c:
                if (r6 == 0) goto L21
                r0.setBoundingRectBottom(r6)
            L21:
                if (r8 == 0) goto L26
                r0.setCutoutPath(r8)
            L26:
                android.view.DisplayCutout r1 = r0.build()
                return r1
        }
    }

    public DisplayCutoutCompat(android.graphics.Rect r3, java.util.List<android.graphics.Rect> r4) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Lb
            android.view.DisplayCutout r0 = androidx.core.view.DisplayCutoutCompat.Api28Impl.createDisplayCutout(r3, r4)
            goto Lc
        Lb:
            r0 = 0
        Lc:
            r2.<init>(r0)
            return
    }

    private DisplayCutoutCompat(android.view.DisplayCutout r1) {
            r0 = this;
            r0.<init>()
            r0.mDisplayCutout = r1
            return
    }

    public DisplayCutoutCompat(androidx.core.graphics.Insets r8, android.graphics.Rect r9, android.graphics.Rect r10, android.graphics.Rect r11, android.graphics.Rect r12, androidx.core.graphics.Insets r13) {
            r7 = this;
            r6 = 0
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            android.view.DisplayCutout r8 = constructDisplayCutout(r0, r1, r2, r3, r4, r5, r6)
            r7.<init>(r8)
            return
    }

    public DisplayCutoutCompat(androidx.core.graphics.Insets r2, android.graphics.Rect r3, android.graphics.Rect r4, android.graphics.Rect r5, android.graphics.Rect r6, androidx.core.graphics.Insets r7, android.graphics.Path r8) {
            r1 = this;
            android.view.DisplayCutout r0 = constructDisplayCutout(r2, r3, r4, r5, r6, r7, r8)
            r1.<init>(r0)
            return
    }

    private static android.view.DisplayCutout constructDisplayCutout(androidx.core.graphics.Insets r9, android.graphics.Rect r10, android.graphics.Rect r11, android.graphics.Rect r12, android.graphics.Rect r13, androidx.core.graphics.Insets r14, android.graphics.Path r15) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 < r1) goto L1c
            android.graphics.Insets r2 = r9.toPlatformInsets()
            android.graphics.Insets r7 = r14.toPlatformInsets()
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r8 = r15
            android.view.DisplayCutout r10 = androidx.core.view.DisplayCutoutCompat.Api33Impl.createDisplayCutout(r2, r3, r4, r5, r6, r7, r8)
            r1 = r3
            r2 = r4
            r3 = r5
            r4 = r6
            return r10
        L1c:
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r8 = r15
            int r10 = android.os.Build.VERSION.SDK_INT
            r11 = 30
            if (r10 < r11) goto L34
            android.graphics.Insets r0 = r9.toPlatformInsets()
            android.graphics.Insets r5 = r14.toPlatformInsets()
            android.view.DisplayCutout r10 = androidx.core.view.DisplayCutoutCompat.Api30Impl.createDisplayCutout(r0, r1, r2, r3, r4, r5)
            return r10
        L34:
            int r10 = android.os.Build.VERSION.SDK_INT
            r11 = 29
            if (r10 < r11) goto L43
            android.graphics.Insets r10 = r9.toPlatformInsets()
            android.view.DisplayCutout r10 = androidx.core.view.DisplayCutoutCompat.Api29Impl.createDisplayCutout(r10, r1, r2, r3, r4)
            return r10
        L43:
            int r10 = android.os.Build.VERSION.SDK_INT
            r11 = 28
            if (r10 < r11) goto L74
            android.graphics.Rect r10 = new android.graphics.Rect
            int r11 = r9.left
            int r12 = r9.top
            int r13 = r9.right
            int r15 = r9.bottom
            r10.<init>(r11, r12, r13, r15)
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            if (r1 == 0) goto L60
            r11.add(r1)
        L60:
            if (r2 == 0) goto L65
            r11.add(r2)
        L65:
            if (r3 == 0) goto L6a
            r11.add(r3)
        L6a:
            if (r4 == 0) goto L6f
            r11.add(r4)
        L6f:
            android.view.DisplayCutout r12 = androidx.core.view.DisplayCutoutCompat.Api28Impl.createDisplayCutout(r10, r11)
            return r12
        L74:
            r10 = 0
            return r10
    }

    static androidx.core.view.DisplayCutoutCompat wrap(android.view.DisplayCutout r1) {
            if (r1 != 0) goto L4
            r0 = 0
            goto L9
        L4:
            androidx.core.view.DisplayCutoutCompat r0 = new androidx.core.view.DisplayCutoutCompat
            r0.<init>(r1)
        L9:
            return r0
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            if (r3 != r4) goto L4
            r0 = 1
            return r0
        L4:
            if (r4 == 0) goto L1d
            java.lang.Class r0 = r3.getClass()
            java.lang.Class r1 = r4.getClass()
            if (r0 == r1) goto L11
            goto L1d
        L11:
            r0 = r4
            androidx.core.view.DisplayCutoutCompat r0 = (androidx.core.view.DisplayCutoutCompat) r0
            android.view.DisplayCutout r1 = r3.mDisplayCutout
            android.view.DisplayCutout r2 = r0.mDisplayCutout
            boolean r1 = androidx.core.util.ObjectsCompat.equals(r1, r2)
            return r1
        L1d:
            r0 = 0
            return r0
    }

    public java.util.List<android.graphics.Rect> getBoundingRects() {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Ld
            android.view.DisplayCutout r0 = r2.mDisplayCutout
            java.util.List r0 = androidx.core.view.DisplayCutoutCompat.Api28Impl.getBoundingRects(r0)
            return r0
        Ld:
            java.util.List r0 = java.util.Collections.emptyList()
            return r0
    }

    public android.graphics.Path getCutoutPath() {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r0 < r1) goto Ld
            android.view.DisplayCutout r0 = r2.mDisplayCutout
            android.graphics.Path r0 = androidx.core.view.DisplayCutoutCompat.Api31Impl.getCutoutPath(r0)
            return r0
        Ld:
            r0 = 0
            return r0
    }

    public int getSafeInsetBottom() {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Ld
            android.view.DisplayCutout r0 = r2.mDisplayCutout
            int r0 = androidx.core.view.DisplayCutoutCompat.Api28Impl.getSafeInsetBottom(r0)
            return r0
        Ld:
            r0 = 0
            return r0
    }

    public int getSafeInsetLeft() {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Ld
            android.view.DisplayCutout r0 = r2.mDisplayCutout
            int r0 = androidx.core.view.DisplayCutoutCompat.Api28Impl.getSafeInsetLeft(r0)
            return r0
        Ld:
            r0 = 0
            return r0
    }

    public int getSafeInsetRight() {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Ld
            android.view.DisplayCutout r0 = r2.mDisplayCutout
            int r0 = androidx.core.view.DisplayCutoutCompat.Api28Impl.getSafeInsetRight(r0)
            return r0
        Ld:
            r0 = 0
            return r0
    }

    public int getSafeInsetTop() {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Ld
            android.view.DisplayCutout r0 = r2.mDisplayCutout
            int r0 = androidx.core.view.DisplayCutoutCompat.Api28Impl.getSafeInsetTop(r0)
            return r0
        Ld:
            r0 = 0
            return r0
    }

    public androidx.core.graphics.Insets getWaterfallInsets() {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto L11
            android.view.DisplayCutout r0 = r2.mDisplayCutout
            android.graphics.Insets r0 = androidx.core.view.DisplayCutoutCompat.Api30Impl.getWaterfallInsets(r0)
            androidx.core.graphics.Insets r0 = androidx.core.graphics.Insets.toCompatInsets(r0)
            return r0
        L11:
            androidx.core.graphics.Insets r0 = androidx.core.graphics.Insets.NONE
            return r0
    }

    public int hashCode() {
            r1 = this;
            android.view.DisplayCutout r0 = r1.mDisplayCutout
            if (r0 != 0) goto L6
            r0 = 0
            goto Lc
        L6:
            android.view.DisplayCutout r0 = r1.mDisplayCutout
            int r0 = r0.hashCode()
        Lc:
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "DisplayCutoutCompat{"
            java.lang.StringBuilder r0 = r0.append(r1)
            android.view.DisplayCutout r1 = r2.mDisplayCutout
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "}"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    android.view.DisplayCutout unwrap() {
            r1 = this;
            android.view.DisplayCutout r0 = r1.mDisplayCutout
            return r0
    }
}
