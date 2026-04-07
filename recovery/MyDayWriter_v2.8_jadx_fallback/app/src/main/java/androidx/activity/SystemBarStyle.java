package androidx.activity;

/* JADX INFO: compiled from: EdgeToEdge.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B5\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\tH\u0000¢\u0006\u0002\b\u0013J\u0015\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\tH\u0000¢\u0006\u0002\b\u0015R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0005\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0017"}, d2 = {"Landroidx/activity/SystemBarStyle;", "", "lightScrim", "", "darkScrim", "nightMode", "detectDarkMode", "Lkotlin/Function1;", "Landroid/content/res/Resources;", "", "<init>", "(IIILkotlin/jvm/functions/Function1;)V", "getDarkScrim$activity_release", "()I", "getNightMode$activity_release", "getDetectDarkMode$activity_release", "()Lkotlin/jvm/functions/Function1;", "getScrim", "isDark", "getScrim$activity_release", "getScrimWithEnforcedContrast", "getScrimWithEnforcedContrast$activity_release", "Companion", "activity_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SystemBarStyle {
    public static final androidx.activity.SystemBarStyle.Companion Companion = null;
    private final int darkScrim;
    private final kotlin.jvm.functions.Function1<android.content.res.Resources, java.lang.Boolean> detectDarkMode;
    private final int lightScrim;
    private final int nightMode;

    /* JADX INFO: compiled from: EdgeToEdge.kt */
    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J2\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\u00072\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH\u0007J\u0012\u0010\r\u001a\u00020\u00052\b\b\u0001\u0010\u000e\u001a\u00020\u0007H\u0007J\u001c\u0010\u000f\u001a\u00020\u00052\b\b\u0001\u0010\u000e\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\u0007H\u0007¨\u0006\u0010"}, d2 = {"Landroidx/activity/SystemBarStyle$Companion;", "", "<init>", "()V", "auto", "Landroidx/activity/SystemBarStyle;", "lightScrim", "", "darkScrim", "detectDarkMode", "Lkotlin/Function1;", "Landroid/content/res/Resources;", "", "dark", "scrim", "light", "activity_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        /* JADX INFO: renamed from: $r8$lambda$-DHmOxO09dMvcnR0D7W6U1r_6GY, reason: not valid java name */
        public static /* synthetic */ boolean m12$r8$lambda$DHmOxO09dMvcnR0D7W6U1r_6GY(android.content.res.Resources r0) {
                boolean r0 = auto$lambda$0(r0)
                return r0
        }

        public static /* synthetic */ boolean $r8$lambda$RzYRoYttzNQrSrMYu7pru_EzZa0(android.content.res.Resources r0) {
                boolean r0 = dark$lambda$1(r0)
                return r0
        }

        public static /* synthetic */ boolean $r8$lambda$yBrLI3aaSSkmKrVSXDgc_ohoBOg(android.content.res.Resources r0) {
                boolean r0 = light$lambda$2(r0)
                return r0
        }

        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public static /* synthetic */ androidx.activity.SystemBarStyle auto$default(androidx.activity.SystemBarStyle.Companion r0, int r1, int r2, kotlin.jvm.functions.Function1 r3, int r4, java.lang.Object r5) {
                r4 = r4 & 4
                if (r4 == 0) goto L9
                androidx.activity.SystemBarStyle$Companion$$ExternalSyntheticLambda2 r3 = new androidx.activity.SystemBarStyle$Companion$$ExternalSyntheticLambda2
                r3.<init>()
            L9:
                androidx.activity.SystemBarStyle r0 = r0.auto(r1, r2, r3)
                return r0
        }

        private static final boolean auto$lambda$0(android.content.res.Resources r2) {
                java.lang.String r0 = "resources"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                android.content.res.Configuration r0 = r2.getConfiguration()
                int r0 = r0.uiMode
                r0 = r0 & 48
                r1 = 32
                if (r0 != r1) goto L14
                r0 = 1
                goto L15
            L14:
                r0 = 0
            L15:
                return r0
        }

        private static final boolean dark$lambda$1(android.content.res.Resources r1) {
                java.lang.String r0 = "<unused var>"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
                r1 = 1
                return r1
        }

        private static final boolean light$lambda$2(android.content.res.Resources r1) {
                java.lang.String r0 = "<unused var>"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
                r1 = 0
                return r1
        }

        @kotlin.jvm.JvmStatic
        public final androidx.activity.SystemBarStyle auto(int r7, int r8) {
                r6 = this;
                r4 = 4
                r5 = 0
                r3 = 0
                r0 = r6
                r1 = r7
                r2 = r8
                androidx.activity.SystemBarStyle r7 = auto$default(r0, r1, r2, r3, r4, r5)
                return r7
        }

        @kotlin.jvm.JvmStatic
        public final androidx.activity.SystemBarStyle auto(int r8, int r9, kotlin.jvm.functions.Function1<? super android.content.res.Resources, java.lang.Boolean> r10) {
                r7 = this;
                java.lang.String r0 = "detectDarkMode"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
                androidx.activity.SystemBarStyle r1 = new androidx.activity.SystemBarStyle
                r4 = 0
                r6 = 0
                r2 = r8
                r3 = r9
                r5 = r10
                r1.<init>(r2, r3, r4, r5, r6)
                return r1
        }

        @kotlin.jvm.JvmStatic
        public final androidx.activity.SystemBarStyle dark(int r7) {
                r6 = this;
                androidx.activity.SystemBarStyle r0 = new androidx.activity.SystemBarStyle
                androidx.activity.SystemBarStyle$Companion$$ExternalSyntheticLambda1 r4 = new androidx.activity.SystemBarStyle$Companion$$ExternalSyntheticLambda1
                r4.<init>()
                r3 = 2
                r5 = 0
                r2 = r7
                r1 = r7
                r0.<init>(r1, r2, r3, r4, r5)
                return r0
        }

        @kotlin.jvm.JvmStatic
        public final androidx.activity.SystemBarStyle light(int r7, int r8) {
                r6 = this;
                androidx.activity.SystemBarStyle r0 = new androidx.activity.SystemBarStyle
                androidx.activity.SystemBarStyle$Companion$$ExternalSyntheticLambda0 r4 = new androidx.activity.SystemBarStyle$Companion$$ExternalSyntheticLambda0
                r4.<init>()
                r3 = 1
                r5 = 0
                r1 = r7
                r2 = r8
                r0.<init>(r1, r2, r3, r4, r5)
                return r0
        }
    }

    static {
            androidx.activity.SystemBarStyle$Companion r0 = new androidx.activity.SystemBarStyle$Companion
            r1 = 0
            r0.<init>(r1)
            androidx.activity.SystemBarStyle.Companion = r0
            return
    }

    private SystemBarStyle(int r1, int r2, int r3, kotlin.jvm.functions.Function1<? super android.content.res.Resources, java.lang.Boolean> r4) {
            r0 = this;
            r0.<init>()
            r0.lightScrim = r1
            r0.darkScrim = r2
            r0.nightMode = r3
            r0.detectDarkMode = r4
            return
    }

    public /* synthetic */ SystemBarStyle(int r1, int r2, int r3, kotlin.jvm.functions.Function1 r4, kotlin.jvm.internal.DefaultConstructorMarker r5) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4)
            return
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.activity.SystemBarStyle auto(int r1, int r2) {
            androidx.activity.SystemBarStyle$Companion r0 = androidx.activity.SystemBarStyle.Companion
            androidx.activity.SystemBarStyle r0 = r0.auto(r1, r2)
            return r0
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.activity.SystemBarStyle auto(int r1, int r2, kotlin.jvm.functions.Function1<? super android.content.res.Resources, java.lang.Boolean> r3) {
            androidx.activity.SystemBarStyle$Companion r0 = androidx.activity.SystemBarStyle.Companion
            androidx.activity.SystemBarStyle r0 = r0.auto(r1, r2, r3)
            return r0
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.activity.SystemBarStyle dark(int r1) {
            androidx.activity.SystemBarStyle$Companion r0 = androidx.activity.SystemBarStyle.Companion
            androidx.activity.SystemBarStyle r0 = r0.dark(r1)
            return r0
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.activity.SystemBarStyle light(int r1, int r2) {
            androidx.activity.SystemBarStyle$Companion r0 = androidx.activity.SystemBarStyle.Companion
            androidx.activity.SystemBarStyle r0 = r0.light(r1, r2)
            return r0
    }

    public final int getDarkScrim$activity_release() {
            r1 = this;
            int r0 = r1.darkScrim
            return r0
    }

    public final kotlin.jvm.functions.Function1<android.content.res.Resources, java.lang.Boolean> getDetectDarkMode$activity_release() {
            r1 = this;
            kotlin.jvm.functions.Function1<android.content.res.Resources, java.lang.Boolean> r0 = r1.detectDarkMode
            return r0
    }

    public final int getNightMode$activity_release() {
            r1 = this;
            int r0 = r1.nightMode
            return r0
    }

    public final int getScrim$activity_release(boolean r2) {
            r1 = this;
            if (r2 == 0) goto L5
            int r0 = r1.darkScrim
            goto L7
        L5:
            int r0 = r1.lightScrim
        L7:
            return r0
    }

    public final int getScrimWithEnforcedContrast$activity_release(boolean r2) {
            r1 = this;
            int r0 = r1.nightMode
            if (r0 != 0) goto L7
            r0 = 0
            goto Le
        L7:
            if (r2 == 0) goto Lc
            int r0 = r1.darkScrim
            goto Le
        Lc:
            int r0 = r1.lightScrim
        Le:
            return r0
    }
}
