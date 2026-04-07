package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
public class ViewUtils {
    static final boolean SDK_LEVEL_SUPPORTS_AUTOSIZE = false;
    private static final java.lang.String TAG = "ViewUtils";
    private static java.lang.reflect.Method sComputeFitSystemWindowsMethod;
    private static boolean sInitComputeFitSystemWindowsMethod;

    static class Api29Impl {
        private Api29Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static void computeFitSystemWindows(android.view.View r7, android.graphics.Rect r8, android.graphics.Rect r9) {
                android.view.WindowInsets$Builder r0 = new android.view.WindowInsets$Builder
                r0.<init>()
                android.graphics.Insets r1 = android.graphics.Insets.of(r8)
                android.view.WindowInsets$Builder r0 = r0.setSystemWindowInsets(r1)
                android.view.WindowInsets r0 = r0.build()
                android.view.WindowInsets r1 = r7.computeSystemWindowInsets(r0, r9)
                android.graphics.Insets r2 = r1.getSystemWindowInsets()
                int r3 = r2.left
                int r4 = r2.top
                int r5 = r2.right
                int r6 = r2.bottom
                r8.set(r3, r4, r5, r6)
                return
        }
    }

    static {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 27
            if (r0 < r1) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            androidx.appcompat.widget.ViewUtils.SDK_LEVEL_SUPPORTS_AUTOSIZE = r0
            return
    }

    private ViewUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void computeFitSystemWindows(android.view.View r7, android.graphics.Rect r8, android.graphics.Rect r9) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto La
            androidx.appcompat.widget.ViewUtils.Api29Impl.computeFitSystemWindows(r7, r8, r9)
            goto L51
        La:
            boolean r0 = androidx.appcompat.widget.ViewUtils.sInitComputeFitSystemWindowsMethod
            java.lang.String r1 = "ViewUtils"
            if (r0 != 0) goto L3d
            r0 = 1
            androidx.appcompat.widget.ViewUtils.sInitComputeFitSystemWindowsMethod = r0
            java.lang.Class<android.view.View> r2 = android.view.View.class
            java.lang.String r3 = "computeFitSystemWindows"
            r4 = 2
            java.lang.Class[] r4 = new java.lang.Class[r4]     // Catch: java.lang.NoSuchMethodException -> L37
            java.lang.Class<android.graphics.Rect> r5 = android.graphics.Rect.class
            r6 = 0
            r4[r6] = r5     // Catch: java.lang.NoSuchMethodException -> L37
            java.lang.Class<android.graphics.Rect> r5 = android.graphics.Rect.class
            r4[r0] = r5     // Catch: java.lang.NoSuchMethodException -> L37
            java.lang.reflect.Method r2 = r2.getDeclaredMethod(r3, r4)     // Catch: java.lang.NoSuchMethodException -> L37
            androidx.appcompat.widget.ViewUtils.sComputeFitSystemWindowsMethod = r2     // Catch: java.lang.NoSuchMethodException -> L37
            java.lang.reflect.Method r2 = androidx.appcompat.widget.ViewUtils.sComputeFitSystemWindowsMethod     // Catch: java.lang.NoSuchMethodException -> L37
            boolean r2 = r2.isAccessible()     // Catch: java.lang.NoSuchMethodException -> L37
            if (r2 != 0) goto L36
            java.lang.reflect.Method r2 = androidx.appcompat.widget.ViewUtils.sComputeFitSystemWindowsMethod     // Catch: java.lang.NoSuchMethodException -> L37
            r2.setAccessible(r0)     // Catch: java.lang.NoSuchMethodException -> L37
        L36:
            goto L3d
        L37:
            r0 = move-exception
            java.lang.String r2 = "Could not find method computeFitSystemWindows. Oh well."
            android.util.Log.d(r1, r2)
        L3d:
            java.lang.reflect.Method r0 = androidx.appcompat.widget.ViewUtils.sComputeFitSystemWindowsMethod
            if (r0 == 0) goto L51
            java.lang.reflect.Method r0 = androidx.appcompat.widget.ViewUtils.sComputeFitSystemWindowsMethod     // Catch: java.lang.Exception -> L4b
            java.lang.Object[] r2 = new java.lang.Object[]{r8, r9}     // Catch: java.lang.Exception -> L4b
            r0.invoke(r7, r2)     // Catch: java.lang.Exception -> L4b
            goto L51
        L4b:
            r0 = move-exception
            java.lang.String r2 = "Could not invoke computeFitSystemWindows"
            android.util.Log.d(r1, r2, r0)
        L51:
            return
    }

    public static boolean isLayoutRtl(android.view.View r2) {
            int r0 = r2.getLayoutDirection()
            r1 = 1
            if (r0 != r1) goto L8
            goto L9
        L8:
            r1 = 0
        L9:
            return r1
    }

    public static void makeOptionalFitsSystemWindows(android.view.View r6) {
            java.lang.String r0 = "Could not invoke makeOptionalFitsSystemWindows"
            java.lang.String r1 = "ViewUtils"
            java.lang.Class r2 = r6.getClass()     // Catch: java.lang.IllegalAccessException -> L22 java.lang.reflect.InvocationTargetException -> L27 java.lang.NoSuchMethodException -> L2c
            java.lang.String r3 = "makeOptionalFitsSystemWindows"
            r4 = 0
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch: java.lang.IllegalAccessException -> L22 java.lang.reflect.InvocationTargetException -> L27 java.lang.NoSuchMethodException -> L2c
            java.lang.reflect.Method r2 = r2.getMethod(r3, r5)     // Catch: java.lang.IllegalAccessException -> L22 java.lang.reflect.InvocationTargetException -> L27 java.lang.NoSuchMethodException -> L2c
            boolean r3 = r2.isAccessible()     // Catch: java.lang.IllegalAccessException -> L22 java.lang.reflect.InvocationTargetException -> L27 java.lang.NoSuchMethodException -> L2c
            if (r3 != 0) goto L1b
            r3 = 1
            r2.setAccessible(r3)     // Catch: java.lang.IllegalAccessException -> L22 java.lang.reflect.InvocationTargetException -> L27 java.lang.NoSuchMethodException -> L2c
        L1b:
            java.lang.Object[] r3 = new java.lang.Object[r4]     // Catch: java.lang.IllegalAccessException -> L22 java.lang.reflect.InvocationTargetException -> L27 java.lang.NoSuchMethodException -> L2c
            r2.invoke(r6, r3)     // Catch: java.lang.IllegalAccessException -> L22 java.lang.reflect.InvocationTargetException -> L27 java.lang.NoSuchMethodException -> L2c
            goto L33
        L22:
            r2 = move-exception
            android.util.Log.d(r1, r0, r2)
            goto L33
        L27:
            r2 = move-exception
            android.util.Log.d(r1, r0, r2)
            goto L32
        L2c:
            r0 = move-exception
            java.lang.String r2 = "Could not find method makeOptionalFitsSystemWindows. Oh well..."
            android.util.Log.d(r1, r2)
        L32:
        L33:
            return
    }
}
