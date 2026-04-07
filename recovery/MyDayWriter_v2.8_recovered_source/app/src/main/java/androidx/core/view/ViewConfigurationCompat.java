package androidx.core.view;

/* JADX INFO: loaded from: classes.dex */
public final class ViewConfigurationCompat {
    private static final int NO_FLING_MAX_VELOCITY = Integer.MIN_VALUE;
    private static final int NO_FLING_MIN_VELOCITY = Integer.MAX_VALUE;
    private static final int RESOURCE_ID_NOT_SUPPORTED = -1;
    private static final int RESOURCE_ID_SUPPORTED_BUT_NOT_FOUND = 0;
    private static final java.lang.String TAG = "ViewConfigCompat";
    private static java.lang.reflect.Method sGetScaledScrollFactorMethod;

    static class Api26Impl {
        private Api26Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static float getScaledHorizontalScrollFactor(android.view.ViewConfiguration r1) {
                float r0 = r1.getScaledHorizontalScrollFactor()
                return r0
        }

        static float getScaledVerticalScrollFactor(android.view.ViewConfiguration r1) {
                float r0 = r1.getScaledVerticalScrollFactor()
                return r0
        }
    }

    static class Api28Impl {
        private Api28Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static int getScaledHoverSlop(android.view.ViewConfiguration r1) {
                int r0 = r1.getScaledHoverSlop()
                return r0
        }

        static boolean shouldShowMenuShortcutsWhenKeyboardPresent(android.view.ViewConfiguration r1) {
                boolean r0 = r1.shouldShowMenuShortcutsWhenKeyboardPresent()
                return r0
        }
    }

    static class Api34Impl {
        private Api34Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static int getScaledMaximumFlingVelocity(android.view.ViewConfiguration r1, int r2, int r3, int r4) {
                int r0 = r1.getScaledMaximumFlingVelocity(r2, r3, r4)
                return r0
        }

        static int getScaledMinimumFlingVelocity(android.view.ViewConfiguration r1, int r2, int r3, int r4) {
                int r0 = r1.getScaledMinimumFlingVelocity(r2, r3, r4)
                return r0
        }
    }

    public static /* synthetic */ int $r8$lambda$DUnOdzWd_GMixRu8Q8mhfglZyiM(android.view.ViewConfiguration r0) {
            int r0 = r0.getScaledMinimumFlingVelocity()
            return r0
    }

    public static /* synthetic */ int $r8$lambda$u_xUdJpIAAO3758SdHprtx7JUP0(android.view.ViewConfiguration r0) {
            int r0 = r0.getScaledMaximumFlingVelocity()
            return r0
    }

    static {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 25
            if (r0 != r1) goto L1c
            java.lang.Class<android.view.ViewConfiguration> r0 = android.view.ViewConfiguration.class
            java.lang.String r1 = "getScaledScrollFactor"
            r2 = 0
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L14
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r2)     // Catch: java.lang.Exception -> L14
            androidx.core.view.ViewConfigurationCompat.sGetScaledScrollFactorMethod = r0     // Catch: java.lang.Exception -> L14
            goto L1c
        L14:
            r0 = move-exception
            java.lang.String r1 = "ViewConfigCompat"
            java.lang.String r2 = "Could not find method getScaledScrollFactor() on ViewConfiguration"
            android.util.Log.i(r1, r2)
        L1c:
            return
    }

    private ViewConfigurationCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    private static int getCompatFlingVelocityThreshold(android.content.res.Resources r2, int r3, androidx.core.util.Supplier<java.lang.Integer> r4, int r5) {
            switch(r3) {
                case -1: goto Lc;
                case 0: goto Lb;
                default: goto L3;
            }
        L3:
            int r0 = r2.getDimensionPixelSize(r3)
            if (r0 >= 0) goto L17
            r1 = r5
            goto L18
        Lb:
            return r5
        Lc:
            java.lang.Object r0 = r4.get()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            return r0
        L17:
            r1 = r0
        L18:
            return r1
    }

    private static float getLegacyScrollFactor(android.view.ViewConfiguration r4, android.content.Context r5) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 25
            if (r0 < r1) goto L23
            java.lang.reflect.Method r0 = androidx.core.view.ViewConfigurationCompat.sGetScaledScrollFactorMethod
            if (r0 == 0) goto L23
            java.lang.reflect.Method r0 = androidx.core.view.ViewConfigurationCompat.sGetScaledScrollFactorMethod     // Catch: java.lang.Exception -> L1b
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L1b
            java.lang.Object r0 = r0.invoke(r4, r1)     // Catch: java.lang.Exception -> L1b
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.Exception -> L1b
            int r0 = r0.intValue()     // Catch: java.lang.Exception -> L1b
            float r0 = (float) r0
            return r0
        L1b:
            r0 = move-exception
            java.lang.String r1 = "ViewConfigCompat"
            java.lang.String r2 = "Could not find method getScaledScrollFactor() on ViewConfiguration"
            android.util.Log.i(r1, r2)
        L23:
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            android.content.res.Resources$Theme r1 = r5.getTheme()
            r2 = 16842829(0x101004d, float:2.3693774E-38)
            r3 = 1
            boolean r1 = r1.resolveAttribute(r2, r0, r3)
            if (r1 == 0) goto L43
            android.content.res.Resources r1 = r5.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r1 = r0.getDimension(r1)
            return r1
        L43:
            r1 = 0
            return r1
    }

    private static int getPlatformResId(android.content.res.Resources r1, java.lang.String r2, java.lang.String r3) {
            java.lang.String r0 = "android"
            int r0 = r1.getIdentifier(r2, r3, r0)
            return r0
    }

    private static int getPreApi34MaximumFlingVelocityResId(android.content.res.Resources r2, int r3, int r4) {
            r0 = 4194304(0x400000, float:5.877472E-39)
            if (r3 != r0) goto L11
            r0 = 26
            if (r4 != r0) goto L11
            java.lang.String r0 = "config_viewMaxRotaryEncoderFlingVelocity"
            java.lang.String r1 = "dimen"
            int r0 = getPlatformResId(r2, r0, r1)
            return r0
        L11:
            r0 = -1
            return r0
    }

    private static int getPreApi34MinimumFlingVelocityResId(android.content.res.Resources r2, int r3, int r4) {
            r0 = 4194304(0x400000, float:5.877472E-39)
            if (r3 != r0) goto L11
            r0 = 26
            if (r4 != r0) goto L11
            java.lang.String r0 = "config_viewMinRotaryEncoderFlingVelocity"
            java.lang.String r1 = "dimen"
            int r0 = getPlatformResId(r2, r0, r1)
            return r0
        L11:
            r0 = -1
            return r0
    }

    public static float getScaledHorizontalScrollFactor(android.view.ViewConfiguration r2, android.content.Context r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto Lb
            float r0 = androidx.core.view.ViewConfigurationCompat.Api26Impl.getScaledHorizontalScrollFactor(r2)
            return r0
        Lb:
            float r0 = getLegacyScrollFactor(r2, r3)
            return r0
    }

    public static int getScaledHoverSlop(android.view.ViewConfiguration r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Lb
            int r0 = androidx.core.view.ViewConfigurationCompat.Api28Impl.getScaledHoverSlop(r2)
            return r0
        Lb:
            int r0 = r2.getScaledTouchSlop()
            int r0 = r0 / 2
            return r0
    }

    public static int getScaledMaximumFlingVelocity(android.content.Context r4, android.view.ViewConfiguration r5, int r6, int r7, int r8) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto Lb
            int r0 = androidx.core.view.ViewConfigurationCompat.Api34Impl.getScaledMaximumFlingVelocity(r5, r6, r7, r8)
            return r0
        Lb:
            boolean r0 = isInputDeviceInfoValid(r6, r7, r8)
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != 0) goto L14
            return r1
        L14:
            android.content.res.Resources r0 = r4.getResources()
            int r2 = getPreApi34MaximumFlingVelocityResId(r0, r8, r7)
            java.util.Objects.requireNonNull(r5)
            androidx.core.view.ViewConfigurationCompat$$ExternalSyntheticLambda0 r3 = new androidx.core.view.ViewConfigurationCompat$$ExternalSyntheticLambda0
            r3.<init>(r5)
            int r1 = getCompatFlingVelocityThreshold(r0, r2, r3, r1)
            return r1
    }

    public static int getScaledMinimumFlingVelocity(android.content.Context r4, android.view.ViewConfiguration r5, int r6, int r7, int r8) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto Lb
            int r0 = androidx.core.view.ViewConfigurationCompat.Api34Impl.getScaledMinimumFlingVelocity(r5, r6, r7, r8)
            return r0
        Lb:
            boolean r0 = isInputDeviceInfoValid(r6, r7, r8)
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r0 != 0) goto L15
            return r1
        L15:
            android.content.res.Resources r0 = r4.getResources()
            int r2 = getPreApi34MinimumFlingVelocityResId(r0, r8, r7)
            java.util.Objects.requireNonNull(r5)
            androidx.core.view.ViewConfigurationCompat$$ExternalSyntheticLambda1 r3 = new androidx.core.view.ViewConfigurationCompat$$ExternalSyntheticLambda1
            r3.<init>(r5)
            int r1 = getCompatFlingVelocityThreshold(r0, r2, r3, r1)
            return r1
    }

    @androidx.annotation.ReplaceWith(expression = "config.getScaledPagingTouchSlop()")
    @java.lang.Deprecated
    public static int getScaledPagingTouchSlop(android.view.ViewConfiguration r1) {
            int r0 = r1.getScaledPagingTouchSlop()
            return r0
    }

    public static float getScaledVerticalScrollFactor(android.view.ViewConfiguration r2, android.content.Context r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto Lb
            float r0 = androidx.core.view.ViewConfigurationCompat.Api26Impl.getScaledVerticalScrollFactor(r2)
            return r0
        Lb:
            float r0 = getLegacyScrollFactor(r2, r3)
            return r0
    }

    @androidx.annotation.ReplaceWith(expression = "config.hasPermanentMenuKey()")
    @java.lang.Deprecated
    public static boolean hasPermanentMenuKey(android.view.ViewConfiguration r1) {
            boolean r0 = r1.hasPermanentMenuKey()
            return r0
    }

    private static boolean isInputDeviceInfoValid(int r2, int r3, int r4) {
            android.view.InputDevice r0 = android.view.InputDevice.getDevice(r2)
            if (r0 == 0) goto Le
            android.view.InputDevice$MotionRange r1 = r0.getMotionRange(r3, r4)
            if (r1 == 0) goto Le
            r1 = 1
            goto Lf
        Le:
            r1 = 0
        Lf:
            return r1
    }

    public static boolean shouldShowMenuShortcutsWhenKeyboardPresent(android.view.ViewConfiguration r3, android.content.Context r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Lb
            boolean r0 = androidx.core.view.ViewConfigurationCompat.Api28Impl.shouldShowMenuShortcutsWhenKeyboardPresent(r3)
            return r0
        Lb:
            android.content.res.Resources r0 = r4.getResources()
            java.lang.String r1 = "config_showMenuShortcutsWhenKeyboardPresent"
            java.lang.String r2 = "bool"
            int r1 = getPlatformResId(r0, r1, r2)
            if (r1 == 0) goto L22
            boolean r2 = r0.getBoolean(r1)
            if (r2 == 0) goto L22
            r2 = 1
            goto L23
        L22:
            r2 = 0
        L23:
            return r2
    }
}
