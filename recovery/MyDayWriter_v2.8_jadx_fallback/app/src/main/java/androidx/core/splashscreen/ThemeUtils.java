package androidx.core.splashscreen;

/* JADX INFO: compiled from: ThemeUtils.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/core/splashscreen/ThemeUtils;", "", "<init>", "()V", "Api31", "core-splashscreen_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ThemeUtils {
    public static final androidx.core.splashscreen.ThemeUtils INSTANCE = null;

    /* JADX INFO: compiled from: ThemeUtils.kt */
    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0004\u001a\u00020\u00052\n\u0010\u0006\u001a\u00060\u0007R\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007¨\u0006\r"}, d2 = {"Landroidx/core/splashscreen/ThemeUtils$Api31;", "", "<init>", "()V", "applyThemesSystemBarAppearance", "", "theme", "Landroid/content/res/Resources$Theme;", "Landroid/content/res/Resources;", "decor", "Landroid/view/View;", "tv", "Landroid/util/TypedValue;", "core-splashscreen_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Api31 {
        public static final androidx.core.splashscreen.ThemeUtils.Api31 INSTANCE = null;

        static {
                androidx.core.splashscreen.ThemeUtils$Api31 r0 = new androidx.core.splashscreen.ThemeUtils$Api31
                r0.<init>()
                androidx.core.splashscreen.ThemeUtils.Api31.INSTANCE = r0
                return
        }

        private Api31() {
                r0 = this;
                r0.<init>()
                return
        }

        @kotlin.jvm.JvmStatic
        public static final void applyThemesSystemBarAppearance(android.content.res.Resources.Theme r2, android.view.View r3) {
                java.lang.String r0 = "theme"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                java.lang.String r0 = "decor"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                r0 = 0
                r1 = 4
                applyThemesSystemBarAppearance$default(r2, r3, r0, r1, r0)
                return
        }

        @kotlin.jvm.JvmStatic
        public static final void applyThemesSystemBarAppearance(android.content.res.Resources.Theme r4, android.view.View r5, android.util.TypedValue r6) {
                java.lang.String r0 = "theme"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                java.lang.String r0 = "decor"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                java.lang.String r0 = "tv"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
                r0 = 0
                r1 = 24
                r2 = 16844000(0x10104e0, float:2.3697056E-38)
                r3 = 1
                boolean r2 = r4.resolveAttribute(r2, r6, r3)
                if (r2 == 0) goto L23
                int r2 = r6.data
                if (r2 == 0) goto L23
                r0 = r0 | 8
            L23:
                r2 = 16844140(0x101056c, float:2.3697448E-38)
                boolean r2 = r4.resolveAttribute(r2, r6, r3)
                if (r2 == 0) goto L33
                int r2 = r6.data
                if (r2 == 0) goto L33
                r2 = r0 | 16
                r0 = r2
            L33:
                android.view.WindowInsetsController r2 = r5.getWindowInsetsController()
                kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
                r2.setSystemBarsAppearance(r0, r1)
                return
        }

        public static /* synthetic */ void applyThemesSystemBarAppearance$default(android.content.res.Resources.Theme r0, android.view.View r1, android.util.TypedValue r2, int r3, java.lang.Object r4) {
                r3 = r3 & 4
                if (r3 == 0) goto L9
                android.util.TypedValue r2 = new android.util.TypedValue
                r2.<init>()
            L9:
                applyThemesSystemBarAppearance(r0, r1, r2)
                return
        }
    }

    static {
            androidx.core.splashscreen.ThemeUtils r0 = new androidx.core.splashscreen.ThemeUtils
            r0.<init>()
            androidx.core.splashscreen.ThemeUtils.INSTANCE = r0
            return
    }

    private ThemeUtils() {
            r0 = this;
            r0.<init>()
            return
    }
}
