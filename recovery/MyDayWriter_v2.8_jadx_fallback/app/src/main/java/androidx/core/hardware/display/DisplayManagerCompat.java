package androidx.core.hardware.display;

/* JADX INFO: loaded from: classes.dex */
public final class DisplayManagerCompat {
    static final java.lang.String DISPLAY_CATEGORY_ALL = "android.hardware.display.category.ALL_INCLUDING_DISABLED";
    public static final java.lang.String DISPLAY_CATEGORY_BUILT_IN_DISPLAYS = "android.hardware.display.category.BUILT_IN_DISPLAYS";
    public static final java.lang.String DISPLAY_CATEGORY_PRESENTATION = "android.hardware.display.category.PRESENTATION";
    static final int DISPLAY_TYPE_INTERNAL = 1;
    private final android.content.Context mContext;

    private DisplayManagerCompat(android.content.Context r1) {
            r0 = this;
            r0.<init>()
            r0.mContext = r1
            return
    }

    private static android.view.Display[] computeBuiltInDisplays(android.hardware.display.DisplayManager r8) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 < r1) goto Le
        L7:
            java.lang.String r0 = "android.hardware.display.category.ALL_INCLUDING_DISABLED"
            android.view.Display[] r0 = r8.getDisplays(r0)
            goto L12
        Le:
            android.view.Display[] r0 = r8.getDisplays()
        L12:
            r1 = 1
            int r2 = numberOfDisplaysByType(r1, r0)
            android.view.Display[] r3 = new android.view.Display[r2]
            r4 = 0
            r5 = 0
        L1c:
            int r6 = r0.length
            if (r5 >= r6) goto L2e
            r6 = r0[r5]
            int r7 = getTypeCompat(r6)
            if (r1 != r7) goto L2b
            r3[r4] = r6
            int r4 = r4 + 1
        L2b:
            int r5 = r5 + 1
            goto L1c
        L2e:
            return r3
    }

    public static androidx.core.hardware.display.DisplayManagerCompat getInstance(android.content.Context r1) {
            androidx.core.hardware.display.DisplayManagerCompat r0 = new androidx.core.hardware.display.DisplayManagerCompat
            r0.<init>(r1)
            return r0
    }

    static int getTypeCompat(android.view.Display r4) {
            r0 = 0
            java.lang.Class<android.view.Display> r1 = android.view.Display.class
            java.lang.String r2 = "getType"
            java.lang.Class[] r3 = new java.lang.Class[r0]     // Catch: java.lang.Exception -> L1c java.lang.NoSuchMethodException -> L23
            java.lang.reflect.Method r1 = r1.getMethod(r2, r3)     // Catch: java.lang.Exception -> L1c java.lang.NoSuchMethodException -> L23
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch: java.lang.Exception -> L1c java.lang.NoSuchMethodException -> L23
            java.lang.Object r1 = r1.invoke(r4, r2)     // Catch: java.lang.Exception -> L1c java.lang.NoSuchMethodException -> L23
            java.lang.Object r1 = java.util.Objects.requireNonNull(r1)     // Catch: java.lang.Exception -> L1c java.lang.NoSuchMethodException -> L23
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Exception -> L1c java.lang.NoSuchMethodException -> L23
            int r0 = r1.intValue()     // Catch: java.lang.Exception -> L1c java.lang.NoSuchMethodException -> L23
            return r0
        L1c:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        L23:
            r1 = move-exception
            return r0
    }

    private static int numberOfDisplaysByType(int r4, android.view.Display[] r5) {
            r0 = 0
            r1 = 0
        L2:
            int r2 = r5.length
            if (r1 >= r2) goto L12
            r2 = r5[r1]
            int r3 = getTypeCompat(r2)
            if (r4 != r3) goto Lf
            int r0 = r0 + 1
        Lf:
            int r1 = r1 + 1
            goto L2
        L12:
            return r0
    }

    public android.view.Display getDisplay(int r3) {
            r2 = this;
            android.content.Context r0 = r2.mContext
            java.lang.String r1 = "display"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.hardware.display.DisplayManager r0 = (android.hardware.display.DisplayManager) r0
            android.view.Display r1 = r0.getDisplay(r3)
            return r1
    }

    public android.view.Display[] getDisplays() {
            r2 = this;
            android.content.Context r0 = r2.mContext
            java.lang.String r1 = "display"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.hardware.display.DisplayManager r0 = (android.hardware.display.DisplayManager) r0
            android.view.Display[] r0 = r0.getDisplays()
            return r0
    }

    public android.view.Display[] getDisplays(java.lang.String r4) {
            r3 = this;
            android.content.Context r0 = r3.mContext
            java.lang.String r1 = "display"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.hardware.display.DisplayManager r0 = (android.hardware.display.DisplayManager) r0
            java.lang.String r2 = "android.hardware.display.category.BUILT_IN_DISPLAYS"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L17
            android.view.Display[] r1 = computeBuiltInDisplays(r0)
            return r1
        L17:
            android.content.Context r2 = r3.mContext
            java.lang.Object r1 = r2.getSystemService(r1)
            android.hardware.display.DisplayManager r1 = (android.hardware.display.DisplayManager) r1
            android.view.Display[] r1 = r1.getDisplays(r4)
            return r1
    }
}
