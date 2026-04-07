package androidx.core.view;

/* JADX INFO: loaded from: classes.dex */
public final class DisplayCompat {
    private static final int DISPLAY_SIZE_4K_HEIGHT = 2160;
    private static final int DISPLAY_SIZE_4K_WIDTH = 3840;

    static class Api23Impl {
        private Api23Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static androidx.core.view.DisplayCompat.ModeCompat getMode(android.content.Context r4, android.view.Display r5) {
                android.view.Display$Mode r0 = r5.getMode()
                android.graphics.Point r1 = androidx.core.view.DisplayCompat.getCurrentDisplaySizeFromWorkarounds(r4, r5)
                if (r1 == 0) goto L17
                boolean r2 = physicalSizeEquals(r0, r1)
                if (r2 == 0) goto L11
                goto L17
            L11:
                androidx.core.view.DisplayCompat$ModeCompat r2 = new androidx.core.view.DisplayCompat$ModeCompat
                r2.<init>(r0, r1)
                goto L1d
            L17:
                androidx.core.view.DisplayCompat$ModeCompat r2 = new androidx.core.view.DisplayCompat$ModeCompat
                r3 = 1
                r2.<init>(r0, r3)
            L1d:
                return r2
        }

        public static androidx.core.view.DisplayCompat.ModeCompat[] getSupportedModes(android.content.Context r8, android.view.Display r9) {
                android.view.Display$Mode[] r0 = r9.getSupportedModes()
                int r1 = r0.length
                androidx.core.view.DisplayCompat$ModeCompat[] r1 = new androidx.core.view.DisplayCompat.ModeCompat[r1]
                android.view.Display$Mode r2 = r9.getMode()
                android.graphics.Point r3 = androidx.core.view.DisplayCompat.getCurrentDisplaySizeFromWorkarounds(r8, r9)
                if (r3 == 0) goto L39
                boolean r4 = physicalSizeEquals(r2, r3)
                if (r4 == 0) goto L18
                goto L39
            L18:
                r4 = 0
            L19:
                int r5 = r0.length
                if (r4 >= r5) goto L4f
                r5 = r0[r4]
                boolean r5 = physicalSizeEquals(r5, r2)
                if (r5 == 0) goto L2c
                androidx.core.view.DisplayCompat$ModeCompat r5 = new androidx.core.view.DisplayCompat$ModeCompat
                r6 = r0[r4]
                r5.<init>(r6, r3)
                goto L34
            L2c:
                androidx.core.view.DisplayCompat$ModeCompat r5 = new androidx.core.view.DisplayCompat$ModeCompat
                r6 = r0[r4]
                r7 = 0
                r5.<init>(r6, r7)
            L34:
                r1[r4] = r5
                int r4 = r4 + 1
                goto L19
            L39:
                r4 = 0
            L3a:
                int r5 = r0.length
                if (r4 >= r5) goto L4f
                r5 = r0[r4]
                boolean r5 = physicalSizeEquals(r5, r2)
                androidx.core.view.DisplayCompat$ModeCompat r6 = new androidx.core.view.DisplayCompat$ModeCompat
                r7 = r0[r4]
                r6.<init>(r7, r5)
                r1[r4] = r6
                int r4 = r4 + 1
                goto L3a
            L4f:
                return r1
        }

        static boolean isCurrentModeTheLargestMode(android.view.Display r8) {
                android.view.Display$Mode r0 = r8.getMode()
                android.view.Display$Mode[] r1 = r8.getSupportedModes()
                int r2 = r1.length
                r3 = 0
                r4 = r3
            Lb:
                if (r4 >= r2) goto L28
                r5 = r1[r4]
                int r6 = r0.getPhysicalHeight()
                int r7 = r5.getPhysicalHeight()
                if (r6 < r7) goto L27
                int r6 = r0.getPhysicalWidth()
                int r7 = r5.getPhysicalWidth()
                if (r6 >= r7) goto L24
                goto L27
            L24:
                int r4 = r4 + 1
                goto Lb
            L27:
                return r3
            L28:
                r2 = 1
                return r2
        }

        static boolean physicalSizeEquals(android.view.Display.Mode r2, android.graphics.Point r3) {
                int r0 = r2.getPhysicalWidth()
                int r1 = r3.x
                if (r0 != r1) goto L10
                int r0 = r2.getPhysicalHeight()
                int r1 = r3.y
                if (r0 == r1) goto L20
            L10:
                int r0 = r2.getPhysicalWidth()
                int r1 = r3.y
                if (r0 != r1) goto L22
                int r0 = r2.getPhysicalHeight()
                int r1 = r3.x
                if (r0 != r1) goto L22
            L20:
                r0 = 1
                goto L23
            L22:
                r0 = 0
            L23:
                return r0
        }

        static boolean physicalSizeEquals(android.view.Display.Mode r2, android.view.Display.Mode r3) {
                int r0 = r2.getPhysicalWidth()
                int r1 = r3.getPhysicalWidth()
                if (r0 != r1) goto L16
                int r0 = r2.getPhysicalHeight()
                int r1 = r3.getPhysicalHeight()
                if (r0 != r1) goto L16
                r0 = 1
                goto L17
            L16:
                r0 = 0
            L17:
                return r0
        }
    }

    public static final class ModeCompat {
        private final boolean mIsNative;
        private final android.view.Display.Mode mMode;
        private final android.graphics.Point mPhysicalSize;

        static class Api23Impl {
            private Api23Impl() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            static int getPhysicalHeight(android.view.Display.Mode r1) {
                    int r0 = r1.getPhysicalHeight()
                    return r0
            }

            static int getPhysicalWidth(android.view.Display.Mode r1) {
                    int r0 = r1.getPhysicalWidth()
                    return r0
            }
        }

        ModeCompat(android.graphics.Point r2) {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = "physicalSize == null"
                androidx.core.util.Preconditions.checkNotNull(r2, r0)
                r1.mPhysicalSize = r2
                r0 = 0
                r1.mMode = r0
                r0 = 1
                r1.mIsNative = r0
                return
        }

        ModeCompat(android.view.Display.Mode r2, android.graphics.Point r3) {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = "mode == null, can't wrap a null reference"
                androidx.core.util.Preconditions.checkNotNull(r2, r0)
                java.lang.String r0 = "physicalSize == null"
                androidx.core.util.Preconditions.checkNotNull(r3, r0)
                r1.mPhysicalSize = r3
                r1.mMode = r2
                r0 = 1
                r1.mIsNative = r0
                return
        }

        ModeCompat(android.view.Display.Mode r4, boolean r5) {
                r3 = this;
                r3.<init>()
                java.lang.String r0 = "mode == null, can't wrap a null reference"
                androidx.core.util.Preconditions.checkNotNull(r4, r0)
                android.graphics.Point r0 = new android.graphics.Point
                int r1 = androidx.core.view.DisplayCompat.ModeCompat.Api23Impl.getPhysicalWidth(r4)
                int r2 = androidx.core.view.DisplayCompat.ModeCompat.Api23Impl.getPhysicalHeight(r4)
                r0.<init>(r1, r2)
                r3.mPhysicalSize = r0
                r3.mMode = r4
                r3.mIsNative = r5
                return
        }

        public int getPhysicalHeight() {
                r1 = this;
                android.graphics.Point r0 = r1.mPhysicalSize
                int r0 = r0.y
                return r0
        }

        public int getPhysicalWidth() {
                r1 = this;
                android.graphics.Point r0 = r1.mPhysicalSize
                int r0 = r0.x
                return r0
        }

        @java.lang.Deprecated
        public boolean isNative() {
                r1 = this;
                boolean r0 = r1.mIsNative
                return r0
        }

        public android.view.Display.Mode toMode() {
                r1 = this;
                android.view.Display$Mode r0 = r1.mMode
                return r0
        }
    }

    private DisplayCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    static android.graphics.Point getCurrentDisplaySizeFromWorkarounds(android.content.Context r4, android.view.Display r5) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 >= r1) goto Ld
            java.lang.String r0 = "sys.display-size"
            android.graphics.Point r0 = parsePhysicalDisplaySizeFromSystemProperties(r0, r5)
            goto L13
        Ld:
            java.lang.String r0 = "vendor.display-size"
            android.graphics.Point r0 = parsePhysicalDisplaySizeFromSystemProperties(r0, r5)
        L13:
            if (r0 == 0) goto L17
            return r0
        L17:
            boolean r1 = isSonyBravia4kTv(r4)
            r2 = 0
            if (r1 == 0) goto L30
            boolean r1 = isCurrentModeTheLargestMode(r5)
            if (r1 == 0) goto L2e
            android.graphics.Point r2 = new android.graphics.Point
            r1 = 3840(0xf00, float:5.381E-42)
            r3 = 2160(0x870, float:3.027E-42)
            r2.<init>(r1, r3)
            goto L2f
        L2e:
        L2f:
            return r2
        L30:
            return r2
    }

    private static android.graphics.Point getDisplaySize(android.content.Context r2, android.view.Display r3) {
            android.graphics.Point r0 = getCurrentDisplaySizeFromWorkarounds(r2, r3)
            if (r0 == 0) goto L7
            return r0
        L7:
            android.graphics.Point r1 = new android.graphics.Point
            r1.<init>()
            r3.getRealSize(r1)
            return r1
    }

    public static androidx.core.view.DisplayCompat.ModeCompat getMode(android.content.Context r1, android.view.Display r2) {
            androidx.core.view.DisplayCompat$ModeCompat r0 = androidx.core.view.DisplayCompat.Api23Impl.getMode(r1, r2)
            return r0
    }

    public static androidx.core.view.RoundedCornerCompat getRoundedCorner(android.view.Display r2, int r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r0 < r1) goto Lf
            android.view.RoundedCorner r0 = r2.getRoundedCorner(r3)
            androidx.core.view.RoundedCornerCompat r0 = androidx.core.view.RoundedCornerCompat.toRoundedCornerCompat(r0)
            return r0
        Lf:
            r0 = 0
            return r0
    }

    public static androidx.core.view.DisplayCompat.ModeCompat[] getSupportedModes(android.content.Context r1, android.view.Display r2) {
            androidx.core.view.DisplayCompat$ModeCompat[] r0 = androidx.core.view.DisplayCompat.Api23Impl.getSupportedModes(r1, r2)
            return r0
    }

    private static java.lang.String getSystemProperty(java.lang.String r5) {
            java.lang.String r0 = "android.os.SystemProperties"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Exception -> L1f
            java.lang.String r1 = "get"
            r2 = 1
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L1f
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            r4 = 0
            r2[r4] = r3     // Catch: java.lang.Exception -> L1f
            java.lang.reflect.Method r1 = r0.getMethod(r1, r2)     // Catch: java.lang.Exception -> L1f
            java.lang.Object[] r2 = new java.lang.Object[]{r5}     // Catch: java.lang.Exception -> L1f
            java.lang.Object r2 = r1.invoke(r0, r2)     // Catch: java.lang.Exception -> L1f
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Exception -> L1f
            return r2
        L1f:
            r0 = move-exception
            r1 = 0
            return r1
    }

    static boolean isCurrentModeTheLargestMode(android.view.Display r1) {
            boolean r0 = androidx.core.view.DisplayCompat.Api23Impl.isCurrentModeTheLargestMode(r1)
            return r0
    }

    private static boolean isSonyBravia4kTv(android.content.Context r2) {
            boolean r0 = isTv(r2)
            if (r0 == 0) goto L28
            java.lang.String r0 = android.os.Build.MANUFACTURER
            java.lang.String r1 = "Sony"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L28
            java.lang.String r0 = android.os.Build.MODEL
            java.lang.String r1 = "BRAVIA"
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L28
            android.content.pm.PackageManager r0 = r2.getPackageManager()
            java.lang.String r1 = "com.sony.dtv.hardware.panel.qfhd"
            boolean r0 = r0.hasSystemFeature(r1)
            if (r0 == 0) goto L28
            r0 = 1
            goto L29
        L28:
            r0 = 0
        L29:
            return r0
    }

    private static boolean isTv(android.content.Context r3) {
            java.lang.String r0 = "uimode"
            java.lang.Object r0 = r3.getSystemService(r0)
            android.app.UiModeManager r0 = (android.app.UiModeManager) r0
            if (r0 == 0) goto L13
            int r1 = r0.getCurrentModeType()
            r2 = 4
            if (r1 != r2) goto L13
            r1 = 1
            goto L14
        L13:
            r1 = 0
        L14:
            return r1
    }

    private static android.graphics.Point parseDisplaySize(java.lang.String r4) throws java.lang.NumberFormatException {
            java.lang.String r0 = r4.trim()
            java.lang.String r1 = "x"
            r2 = -1
            java.lang.String[] r0 = r0.split(r1, r2)
            int r1 = r0.length
            r2 = 2
            if (r1 != r2) goto L27
            r1 = 0
            r1 = r0[r1]
            int r1 = java.lang.Integer.parseInt(r1)
            r2 = 1
            r2 = r0[r2]
            int r2 = java.lang.Integer.parseInt(r2)
            if (r1 <= 0) goto L27
            if (r2 <= 0) goto L27
            android.graphics.Point r3 = new android.graphics.Point
            r3.<init>(r1, r2)
            return r3
        L27:
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            r1.<init>()
            throw r1
    }

    private static android.graphics.Point parsePhysicalDisplaySizeFromSystemProperties(java.lang.String r3, android.view.Display r4) {
            int r0 = r4.getDisplayId()
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            java.lang.String r0 = getSystemProperty(r3)
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L1c
            if (r0 != 0) goto L15
            goto L1c
        L15:
            android.graphics.Point r1 = parseDisplaySize(r0)     // Catch: java.lang.NumberFormatException -> L1a
            return r1
        L1a:
            r2 = move-exception
            return r1
        L1c:
            return r1
    }
}
