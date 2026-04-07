package androidx.core.view;

/* JADX INFO: loaded from: classes.dex */
public final class WindowCompat {
    public static final int FEATURE_ACTION_BAR = 8;
    public static final int FEATURE_ACTION_BAR_OVERLAY = 9;
    public static final int FEATURE_ACTION_MODE_OVERLAY = 10;

    static class Api16Impl {
        private Api16Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static void setDecorFitsSystemWindows(android.view.Window r4, boolean r5) {
                r0 = 1792(0x700, float:2.511E-42)
                android.view.View r1 = r4.getDecorView()
                int r2 = r1.getSystemUiVisibility()
                if (r5 == 0) goto Lf
                r3 = r2 & (-1793(0xfffffffffffff8ff, float:NaN))
                goto L11
            Lf:
                r3 = r2 | 1792(0x700, float:2.511E-42)
            L11:
                r1.setSystemUiVisibility(r3)
                return
        }
    }

    static class Api28Impl {
        private Api28Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static <T> T requireViewById(android.view.Window r1, int r2) {
                android.view.View r0 = r1.requireViewById(r2)
                return r0
        }
    }

    static class Api30Impl {
        private Api30Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static void setDecorFitsSystemWindows(android.view.Window r4, boolean r5) {
                r0 = 256(0x100, float:3.59E-43)
                android.view.View r1 = r4.getDecorView()
                int r2 = r1.getSystemUiVisibility()
                if (r5 == 0) goto Lf
                r3 = r2 & (-257(0xfffffffffffffeff, float:NaN))
                goto L11
            Lf:
                r3 = r2 | 256(0x100, float:3.59E-43)
            L11:
                r1.setSystemUiVisibility(r3)
                r4.setDecorFitsSystemWindows(r5)
                return
        }
    }

    static class Api35Impl {
        private Api35Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static void setDecorFitsSystemWindows(android.view.Window r0, boolean r1) {
                r0.setDecorFitsSystemWindows(r1)
                return
        }
    }

    private WindowCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void enableEdgeToEdge(android.view.Window r4) {
            java.util.Objects.requireNonNull(r4)
            r4.getDecorView()
            r0 = 0
            setDecorFitsSystemWindows(r4, r0)
            r4.setStatusBarColor(r0)
            r4.setNavigationBarColor(r0)
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 28
            if (r1 < r2) goto L2d
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 30
            if (r1 < r2) goto L1e
            r1 = 3
            goto L1f
        L1e:
            r1 = 1
        L1f:
            android.view.WindowManager$LayoutParams r2 = r4.getAttributes()
            int r3 = r2.layoutInDisplayCutoutMode
            if (r3 == r1) goto L2d
            r2.layoutInDisplayCutoutMode = r1
            r4.setAttributes(r2)
        L2d:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 29
            if (r1 < r2) goto L39
            r4.setStatusBarContrastEnforced(r0)
            r4.setNavigationBarContrastEnforced(r0)
        L39:
            return
    }

    public static androidx.core.view.WindowInsetsControllerCompat getInsetsController(android.view.Window r1, android.view.View r2) {
            androidx.core.view.WindowInsetsControllerCompat r0 = new androidx.core.view.WindowInsetsControllerCompat
            r0.<init>(r1, r2)
            return r0
    }

    public static <T extends android.view.View> T requireViewById(android.view.Window r3, int r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Ld
            java.lang.Object r0 = androidx.core.view.WindowCompat.Api28Impl.requireViewById(r3, r4)
            android.view.View r0 = (android.view.View) r0
            return r0
        Ld:
            android.view.View r0 = r3.findViewById(r4)
            if (r0 == 0) goto L14
            return r0
        L14:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "ID does not reference a View inside this Window"
            r1.<init>(r2)
            throw r1
    }

    public static void setDecorFitsSystemWindows(android.view.Window r2, boolean r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 35
            if (r0 < r1) goto La
            androidx.core.view.WindowCompat.Api35Impl.setDecorFitsSystemWindows(r2, r3)
            goto L17
        La:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto L14
            androidx.core.view.WindowCompat.Api30Impl.setDecorFitsSystemWindows(r2, r3)
            goto L17
        L14:
            androidx.core.view.WindowCompat.Api16Impl.setDecorFitsSystemWindows(r2, r3)
        L17:
            return
    }
}
