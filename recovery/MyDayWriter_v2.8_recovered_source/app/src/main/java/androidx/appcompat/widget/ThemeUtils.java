package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
public class ThemeUtils {
    static final int[] ACTIVATED_STATE_SET = null;
    static final int[] CHECKED_STATE_SET = null;
    static final int[] DISABLED_STATE_SET = null;
    static final int[] EMPTY_STATE_SET = null;
    static final int[] FOCUSED_STATE_SET = null;
    static final int[] NOT_PRESSED_OR_FOCUSED_STATE_SET = null;
    static final int[] PRESSED_STATE_SET = null;
    static final int[] SELECTED_STATE_SET = null;
    private static final java.lang.String TAG = "ThemeUtils";
    private static final int[] TEMP_ARRAY = null;
    private static final java.lang.ThreadLocal<android.util.TypedValue> TL_TYPED_VALUE = null;

    static {
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            androidx.appcompat.widget.ThemeUtils.TL_TYPED_VALUE = r0
            r0 = -16842910(0xfffffffffefeff62, float:-1.6947497E38)
            int[] r0 = new int[]{r0}
            androidx.appcompat.widget.ThemeUtils.DISABLED_STATE_SET = r0
            r0 = 16842908(0x101009c, float:2.3693995E-38)
            int[] r0 = new int[]{r0}
            androidx.appcompat.widget.ThemeUtils.FOCUSED_STATE_SET = r0
            r0 = 16843518(0x10102fe, float:2.3695705E-38)
            int[] r0 = new int[]{r0}
            androidx.appcompat.widget.ThemeUtils.ACTIVATED_STATE_SET = r0
            r0 = 16842919(0x10100a7, float:2.3694026E-38)
            int[] r0 = new int[]{r0}
            androidx.appcompat.widget.ThemeUtils.PRESSED_STATE_SET = r0
            r0 = 16842912(0x10100a0, float:2.3694006E-38)
            int[] r0 = new int[]{r0}
            androidx.appcompat.widget.ThemeUtils.CHECKED_STATE_SET = r0
            r0 = 16842913(0x10100a1, float:2.369401E-38)
            int[] r0 = new int[]{r0}
            androidx.appcompat.widget.ThemeUtils.SELECTED_STATE_SET = r0
            r0 = -16842919(0xfffffffffefeff59, float:-1.6947488E38)
            r1 = -16842908(0xfffffffffefeff64, float:-1.6947499E38)
            int[] r0 = new int[]{r0, r1}
            androidx.appcompat.widget.ThemeUtils.NOT_PRESSED_OR_FOCUSED_STATE_SET = r0
            r0 = 0
            int[] r0 = new int[r0]
            androidx.appcompat.widget.ThemeUtils.EMPTY_STATE_SET = r0
            r0 = 1
            int[] r0 = new int[r0]
            androidx.appcompat.widget.ThemeUtils.TEMP_ARRAY = r0
            return
    }

    private ThemeUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void checkAppCompatTheme(android.view.View r4, android.content.Context r5) {
            int[] r0 = androidx.appcompat.R.styleable.AppCompatTheme
            android.content.res.TypedArray r0 = r5.obtainStyledAttributes(r0)
            int r1 = androidx.appcompat.R.styleable.AppCompatTheme_windowActionBar     // Catch: java.lang.Throwable -> L35
            boolean r1 = r0.hasValue(r1)     // Catch: java.lang.Throwable -> L35
            if (r1 != 0) goto L30
            java.lang.String r1 = "ThemeUtils"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L35
            r2.<init>()     // Catch: java.lang.Throwable -> L35
            java.lang.String r3 = "View "
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.Throwable -> L35
            java.lang.Class r3 = r4.getClass()     // Catch: java.lang.Throwable -> L35
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.Throwable -> L35
            java.lang.String r3 = " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant)."
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.Throwable -> L35
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L35
            android.util.Log.e(r1, r2)     // Catch: java.lang.Throwable -> L35
        L30:
            r0.recycle()
            return
        L35:
            r1 = move-exception
            r0.recycle()
            throw r1
    }

    public static android.content.res.ColorStateList createDisabledStateList(int r4, int r5) {
            r0 = 2
            int[][] r1 = new int[r0][]
            int[] r0 = new int[r0]
            r2 = 0
            int[] r3 = androidx.appcompat.widget.ThemeUtils.DISABLED_STATE_SET
            r1[r2] = r3
            r0[r2] = r5
            int r2 = r2 + 1
            int[] r3 = androidx.appcompat.widget.ThemeUtils.EMPTY_STATE_SET
            r1[r2] = r3
            r0[r2] = r4
            int r2 = r2 + 1
            android.content.res.ColorStateList r3 = new android.content.res.ColorStateList
            r3.<init>(r1, r0)
            return r3
    }

    public static int getDisabledThemeAttrColor(android.content.Context r5, int r6) {
            android.content.res.ColorStateList r0 = getThemeAttrColorStateList(r5, r6)
            if (r0 == 0) goto L17
            boolean r1 = r0.isStateful()
            if (r1 == 0) goto L17
            int[] r1 = androidx.appcompat.widget.ThemeUtils.DISABLED_STATE_SET
            int r2 = r0.getDefaultColor()
            int r1 = r0.getColorForState(r1, r2)
            return r1
        L17:
            android.util.TypedValue r1 = getTypedValue()
            android.content.res.Resources$Theme r2 = r5.getTheme()
            r3 = 16842803(0x1010033, float:2.36937E-38)
            r4 = 1
            r2.resolveAttribute(r3, r1, r4)
            float r2 = r1.getFloat()
            int r3 = getThemeAttrColor(r5, r6, r2)
            return r3
    }

    public static int getThemeAttrColor(android.content.Context r3, int r4) {
            int[] r0 = androidx.appcompat.widget.ThemeUtils.TEMP_ARRAY
            r1 = 0
            r0[r1] = r4
            r0 = 0
            int[] r2 = androidx.appcompat.widget.ThemeUtils.TEMP_ARRAY
            androidx.appcompat.widget.TintTypedArray r0 = androidx.appcompat.widget.TintTypedArray.obtainStyledAttributes(r3, r0, r2)
            int r1 = r0.getColor(r1, r1)     // Catch: java.lang.Throwable -> L14
            r0.recycle()
            return r1
        L14:
            r1 = move-exception
            r0.recycle()
            throw r1
    }

    static int getThemeAttrColor(android.content.Context r3, int r4, float r5) {
            int r0 = getThemeAttrColor(r3, r4)
            int r1 = android.graphics.Color.alpha(r0)
            float r2 = (float) r1
            float r2 = r2 * r5
            int r2 = java.lang.Math.round(r2)
            int r2 = androidx.core.graphics.ColorUtils.setAlphaComponent(r0, r2)
            return r2
    }

    public static android.content.res.ColorStateList getThemeAttrColorStateList(android.content.Context r3, int r4) {
            int[] r0 = androidx.appcompat.widget.ThemeUtils.TEMP_ARRAY
            r1 = 0
            r0[r1] = r4
            r0 = 0
            int[] r2 = androidx.appcompat.widget.ThemeUtils.TEMP_ARRAY
            androidx.appcompat.widget.TintTypedArray r0 = androidx.appcompat.widget.TintTypedArray.obtainStyledAttributes(r3, r0, r2)
            android.content.res.ColorStateList r1 = r0.getColorStateList(r1)     // Catch: java.lang.Throwable -> L14
            r0.recycle()
            return r1
        L14:
            r1 = move-exception
            r0.recycle()
            throw r1
    }

    private static android.util.TypedValue getTypedValue() {
            java.lang.ThreadLocal<android.util.TypedValue> r0 = androidx.appcompat.widget.ThemeUtils.TL_TYPED_VALUE
            java.lang.Object r0 = r0.get()
            android.util.TypedValue r0 = (android.util.TypedValue) r0
            if (r0 != 0) goto L15
            android.util.TypedValue r1 = new android.util.TypedValue
            r1.<init>()
            r0 = r1
            java.lang.ThreadLocal<android.util.TypedValue> r1 = androidx.appcompat.widget.ThemeUtils.TL_TYPED_VALUE
            r1.set(r0)
        L15:
            return r0
    }
}
