package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
public class DrawableUtils {
    private static final int[] CHECKED_STATE_SET = null;
    private static final int[] EMPTY_STATE_SET = null;
    public static final android.graphics.Rect INSETS_NONE = null;

    static class Api18Impl {
        private static final java.lang.reflect.Field sBottom = null;
        private static final java.lang.reflect.Method sGetOpticalInsets = null;
        private static final java.lang.reflect.Field sLeft = null;
        private static final boolean sReflectionSuccessful = false;
        private static final java.lang.reflect.Field sRight = null;
        private static final java.lang.reflect.Field sTop = null;

        static {
                r0 = 0
                r1 = 0
                r2 = 0
                r3 = 0
                r4 = 0
                r5 = 0
                r6 = 0
                java.lang.String r7 = "android.graphics.Insets"
                java.lang.Class r7 = java.lang.Class.forName(r7)     // Catch: java.lang.NoSuchFieldException -> L36 java.lang.ClassNotFoundException -> L38 java.lang.NoSuchMethodException -> L3a
                java.lang.Class<android.graphics.drawable.Drawable> r8 = android.graphics.drawable.Drawable.class
                java.lang.String r9 = "getOpticalInsets"
                java.lang.Class[] r10 = new java.lang.Class[r6]     // Catch: java.lang.NoSuchFieldException -> L36 java.lang.ClassNotFoundException -> L38 java.lang.NoSuchMethodException -> L3a
                java.lang.reflect.Method r8 = r8.getMethod(r9, r10)     // Catch: java.lang.NoSuchFieldException -> L36 java.lang.ClassNotFoundException -> L38 java.lang.NoSuchMethodException -> L3a
                r0 = r8
                java.lang.String r8 = "left"
                java.lang.reflect.Field r8 = r7.getField(r8)     // Catch: java.lang.NoSuchFieldException -> L36 java.lang.ClassNotFoundException -> L38 java.lang.NoSuchMethodException -> L3a
                r1 = r8
                java.lang.String r8 = "top"
                java.lang.reflect.Field r8 = r7.getField(r8)     // Catch: java.lang.NoSuchFieldException -> L36 java.lang.ClassNotFoundException -> L38 java.lang.NoSuchMethodException -> L3a
                r2 = r8
                java.lang.String r8 = "right"
                java.lang.reflect.Field r8 = r7.getField(r8)     // Catch: java.lang.NoSuchFieldException -> L36 java.lang.ClassNotFoundException -> L38 java.lang.NoSuchMethodException -> L3a
                r3 = r8
                java.lang.String r8 = "bottom"
                java.lang.reflect.Field r8 = r7.getField(r8)     // Catch: java.lang.NoSuchFieldException -> L36 java.lang.ClassNotFoundException -> L38 java.lang.NoSuchMethodException -> L3a
                r4 = r8
                r5 = 1
                goto L3b
            L36:
                r7 = move-exception
                goto L3c
            L38:
                r7 = move-exception
                goto L3b
            L3a:
                r7 = move-exception
            L3b:
            L3c:
                if (r5 == 0) goto L4c
                androidx.appcompat.widget.DrawableUtils.Api18Impl.sGetOpticalInsets = r0
                androidx.appcompat.widget.DrawableUtils.Api18Impl.sLeft = r1
                androidx.appcompat.widget.DrawableUtils.Api18Impl.sTop = r2
                androidx.appcompat.widget.DrawableUtils.Api18Impl.sRight = r3
                androidx.appcompat.widget.DrawableUtils.Api18Impl.sBottom = r4
                r6 = 1
                androidx.appcompat.widget.DrawableUtils.Api18Impl.sReflectionSuccessful = r6
                goto L59
            L4c:
                r7 = 0
                androidx.appcompat.widget.DrawableUtils.Api18Impl.sGetOpticalInsets = r7
                androidx.appcompat.widget.DrawableUtils.Api18Impl.sLeft = r7
                androidx.appcompat.widget.DrawableUtils.Api18Impl.sTop = r7
                androidx.appcompat.widget.DrawableUtils.Api18Impl.sRight = r7
                androidx.appcompat.widget.DrawableUtils.Api18Impl.sBottom = r7
                androidx.appcompat.widget.DrawableUtils.Api18Impl.sReflectionSuccessful = r6
            L59:
                return
        }

        private Api18Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static android.graphics.Rect getOpticalInsets(android.graphics.drawable.Drawable r6) {
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 29
                if (r0 >= r1) goto L38
                boolean r0 = androidx.appcompat.widget.DrawableUtils.Api18Impl.sReflectionSuccessful
                if (r0 == 0) goto L38
                java.lang.reflect.Method r0 = androidx.appcompat.widget.DrawableUtils.Api18Impl.sGetOpticalInsets     // Catch: java.lang.reflect.InvocationTargetException -> L34 java.lang.IllegalAccessException -> L36
                r1 = 0
                java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.reflect.InvocationTargetException -> L34 java.lang.IllegalAccessException -> L36
                java.lang.Object r0 = r0.invoke(r6, r1)     // Catch: java.lang.reflect.InvocationTargetException -> L34 java.lang.IllegalAccessException -> L36
                if (r0 == 0) goto L33
                android.graphics.Rect r1 = new android.graphics.Rect     // Catch: java.lang.reflect.InvocationTargetException -> L34 java.lang.IllegalAccessException -> L36
                java.lang.reflect.Field r2 = androidx.appcompat.widget.DrawableUtils.Api18Impl.sLeft     // Catch: java.lang.reflect.InvocationTargetException -> L34 java.lang.IllegalAccessException -> L36
                int r2 = r2.getInt(r0)     // Catch: java.lang.reflect.InvocationTargetException -> L34 java.lang.IllegalAccessException -> L36
                java.lang.reflect.Field r3 = androidx.appcompat.widget.DrawableUtils.Api18Impl.sTop     // Catch: java.lang.reflect.InvocationTargetException -> L34 java.lang.IllegalAccessException -> L36
                int r3 = r3.getInt(r0)     // Catch: java.lang.reflect.InvocationTargetException -> L34 java.lang.IllegalAccessException -> L36
                java.lang.reflect.Field r4 = androidx.appcompat.widget.DrawableUtils.Api18Impl.sRight     // Catch: java.lang.reflect.InvocationTargetException -> L34 java.lang.IllegalAccessException -> L36
                int r4 = r4.getInt(r0)     // Catch: java.lang.reflect.InvocationTargetException -> L34 java.lang.IllegalAccessException -> L36
                java.lang.reflect.Field r5 = androidx.appcompat.widget.DrawableUtils.Api18Impl.sBottom     // Catch: java.lang.reflect.InvocationTargetException -> L34 java.lang.IllegalAccessException -> L36
                int r5 = r5.getInt(r0)     // Catch: java.lang.reflect.InvocationTargetException -> L34 java.lang.IllegalAccessException -> L36
                r1.<init>(r2, r3, r4, r5)     // Catch: java.lang.reflect.InvocationTargetException -> L34 java.lang.IllegalAccessException -> L36
                return r1
            L33:
                goto L37
            L34:
                r0 = move-exception
                goto L38
            L36:
                r0 = move-exception
            L37:
            L38:
                android.graphics.Rect r0 = androidx.appcompat.widget.DrawableUtils.INSETS_NONE
                return r0
        }
    }

    static class Api29Impl {
        private Api29Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static android.graphics.Insets getOpticalInsets(android.graphics.drawable.Drawable r1) {
                android.graphics.Insets r0 = r1.getOpticalInsets()
                return r0
        }
    }

    static {
            r0 = 16842912(0x10100a0, float:2.3694006E-38)
            int[] r0 = new int[]{r0}
            androidx.appcompat.widget.DrawableUtils.CHECKED_STATE_SET = r0
            r0 = 0
            int[] r0 = new int[r0]
            androidx.appcompat.widget.DrawableUtils.EMPTY_STATE_SET = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            androidx.appcompat.widget.DrawableUtils.INSETS_NONE = r0
            return
    }

    private DrawableUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    @java.lang.Deprecated
    public static boolean canSafelyMutateDrawable(android.graphics.drawable.Drawable r1) {
            r0 = 1
            return r0
    }

    static void fixDrawable(android.graphics.drawable.Drawable r3) {
            java.lang.Class r0 = r3.getClass()
            java.lang.String r0 = r0.getName()
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 29
            if (r1 < r2) goto L20
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 31
            if (r1 >= r2) goto L20
            java.lang.String r1 = "android.graphics.drawable.ColorStateListDrawable"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L20
            forceDrawableStateChange(r3)
        L20:
            return
    }

    private static void forceDrawableStateChange(android.graphics.drawable.Drawable r2) {
            int[] r0 = r2.getState()
            if (r0 == 0) goto L10
            int r1 = r0.length
            if (r1 != 0) goto La
            goto L10
        La:
            int[] r1 = androidx.appcompat.widget.DrawableUtils.EMPTY_STATE_SET
            r2.setState(r1)
            goto L15
        L10:
            int[] r1 = androidx.appcompat.widget.DrawableUtils.CHECKED_STATE_SET
            r2.setState(r1)
        L15:
            r2.setState(r0)
            return
    }

    public static android.graphics.Rect getOpticalBounds(android.graphics.drawable.Drawable r6) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L18
            android.graphics.Insets r0 = androidx.appcompat.widget.DrawableUtils.Api29Impl.getOpticalInsets(r6)
            android.graphics.Rect r1 = new android.graphics.Rect
            int r2 = r0.left
            int r3 = r0.top
            int r4 = r0.right
            int r5 = r0.bottom
            r1.<init>(r2, r3, r4, r5)
            return r1
        L18:
            android.graphics.drawable.Drawable r0 = androidx.core.graphics.drawable.DrawableCompat.unwrap(r6)
            android.graphics.Rect r0 = androidx.appcompat.widget.DrawableUtils.Api18Impl.getOpticalInsets(r0)
            return r0
    }

    public static android.graphics.PorterDuff.Mode parseTintMode(int r1, android.graphics.PorterDuff.Mode r2) {
            switch(r1) {
                case 3: goto L13;
                case 5: goto L10;
                case 9: goto Ld;
                case 14: goto La;
                case 15: goto L7;
                case 16: goto L4;
                default: goto L3;
            }
        L3:
            return r2
        L4:
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.ADD
            return r0
        L7:
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SCREEN
            return r0
        La:
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.MULTIPLY
            return r0
        Ld:
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_ATOP
            return r0
        L10:
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_IN
            return r0
        L13:
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_OVER
            return r0
    }
}
