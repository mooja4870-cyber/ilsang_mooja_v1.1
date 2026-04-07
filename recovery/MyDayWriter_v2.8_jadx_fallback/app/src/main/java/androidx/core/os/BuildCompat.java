package androidx.core.os;

/* JADX INFO: compiled from: BuildCompat.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u001b\u001cB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0007J\b\u0010\t\u001a\u00020\u0005H\u0007J\b\u0010\n\u001a\u00020\u0005H\u0007J\b\u0010\u000b\u001a\u00020\u0005H\u0007J\b\u0010\f\u001a\u00020\u0005H\u0007J\b\u0010\r\u001a\u00020\u0005H\u0007J\b\u0010\u000e\u001a\u00020\u0005H\u0007J\b\u0010\u000f\u001a\u00020\u0005H\u0007J\b\u0010\u0010\u001a\u00020\u0005H\u0007J\b\u0010\u0011\u001a\u00020\u0005H\u0007J\b\u0010\u0012\u001a\u00020\u0005H\u0007J\b\u0010\u0013\u001a\u00020\u0005H\u0007J\b\u0010\u0014\u001a\u00020\u0005H\u0007J\b\u0010\u0015\u001a\u00020\u0005H\u0007R\u0010\u0010\u0016\u001a\u00020\u00178\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u00020\u00178\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u00020\u00178\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u00020\u00178\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Landroidx/core/os/BuildCompat;", "", "<init>", "()V", "isAtLeastPreReleaseCodename", "", "codename", "", "buildCodename", "isAtLeastN", "isAtLeastNMR1", "isAtLeastO", "isAtLeastOMR1", "isAtLeastP", "isAtLeastQ", "isAtLeastR", "isAtLeastS", "isAtLeastSv2", "isAtLeastT", "isAtLeastU", "isAtLeastV", "isAtLeastB", "R_EXTENSION_INT", "", "S_EXTENSION_INT", "T_EXTENSION_INT", "AD_SERVICES_EXTENSION_INT", "PrereleaseSdkCheck", "Api30Impl", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BuildCompat {
    public static final int AD_SERVICES_EXTENSION_INT = 0;
    public static final androidx.core.os.BuildCompat INSTANCE = null;
    public static final int R_EXTENSION_INT = 0;
    public static final int S_EXTENSION_INT = 0;
    public static final int T_EXTENSION_INT = 0;

    /* JADX INFO: compiled from: BuildCompat.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005¨\u0006\u0007"}, d2 = {"Landroidx/core/os/BuildCompat$Api30Impl;", "", "<init>", "()V", "getExtensionVersion", "", "extension", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Api30Impl {
        public static final androidx.core.os.BuildCompat.Api30Impl INSTANCE = null;

        static {
                androidx.core.os.BuildCompat$Api30Impl r0 = new androidx.core.os.BuildCompat$Api30Impl
                r0.<init>()
                androidx.core.os.BuildCompat.Api30Impl.INSTANCE = r0
                return
        }

        private Api30Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        public final int getExtensionVersion(int r2) {
                r1 = this;
                int r0 = android.os.ext.SdkExtensions.getExtensionVersion(r2)
                return r0
        }
    }

    /* JADX INFO: compiled from: BuildCompat.kt */
    @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Landroidx/core/os/BuildCompat$PrereleaseSdkCheck;", "", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
    @kotlin.annotation.Retention(kotlin.annotation.AnnotationRetention.BINARY)
    public @interface PrereleaseSdkCheck {
    }

    static {
            androidx.core.os.BuildCompat r0 = new androidx.core.os.BuildCompat
            r0.<init>()
            androidx.core.os.BuildCompat.INSTANCE = r0
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 0
            r2 = 30
            if (r0 < r2) goto L15
            androidx.core.os.BuildCompat$Api30Impl r0 = androidx.core.os.BuildCompat.Api30Impl.INSTANCE
            int r0 = r0.getExtensionVersion(r2)
            goto L16
        L15:
            r0 = r1
        L16:
            androidx.core.os.BuildCompat.R_EXTENSION_INT = r0
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r2) goto L25
            androidx.core.os.BuildCompat$Api30Impl r0 = androidx.core.os.BuildCompat.Api30Impl.INSTANCE
            r3 = 31
            int r0 = r0.getExtensionVersion(r3)
            goto L26
        L25:
            r0 = r1
        L26:
            androidx.core.os.BuildCompat.S_EXTENSION_INT = r0
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r2) goto L35
            androidx.core.os.BuildCompat$Api30Impl r0 = androidx.core.os.BuildCompat.Api30Impl.INSTANCE
            r3 = 33
            int r0 = r0.getExtensionVersion(r3)
            goto L36
        L35:
            r0 = r1
        L36:
            androidx.core.os.BuildCompat.T_EXTENSION_INT = r0
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r2) goto L46
            androidx.core.os.BuildCompat$Api30Impl r0 = androidx.core.os.BuildCompat.Api30Impl.INSTANCE
            r1 = 1000000(0xf4240, float:1.401298E-39)
            int r1 = r0.getExtensionVersion(r1)
            goto L47
        L46:
        L47:
            androidx.core.os.BuildCompat.AD_SERVICES_EXTENSION_INT = r1
            return
    }

    private BuildCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    @kotlin.jvm.JvmStatic
    public static final boolean isAtLeastB() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 36
            if (r0 >= r1) goto L1e
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 35
            if (r0 < r1) goto L1c
            java.lang.String r0 = android.os.Build.VERSION.CODENAME
            java.lang.String r1 = "CODENAME"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.lang.String r1 = "Baklava"
            boolean r0 = isAtLeastPreReleaseCodename(r1, r0)
            if (r0 == 0) goto L1c
            goto L1e
        L1c:
            r0 = 0
            goto L1f
        L1e:
            r0 = 1
        L1f:
            return r0
    }

    @kotlin.Deprecated(message = "Android N is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead, use `Build.VERSION.SDK_INT >= 24`.", replaceWith = @kotlin.ReplaceWith(expression = "android.os.Build.VERSION.SDK_INT >= 24", imports = {}))
    @kotlin.jvm.JvmStatic
    public static final boolean isAtLeastN() {
            r0 = 1
            return r0
    }

    @kotlin.Deprecated(message = "Android N MR1 is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead, use `Build.VERSION.SDK_INT >= 25`.", replaceWith = @kotlin.ReplaceWith(expression = "android.os.Build.VERSION.SDK_INT >= 25", imports = {}))
    @kotlin.jvm.JvmStatic
    public static final boolean isAtLeastNMR1() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 25
            if (r0 < r1) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    @kotlin.Deprecated(message = "Android O is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead use `Build.VERSION.SDK_INT >= 26`.", replaceWith = @kotlin.ReplaceWith(expression = "android.os.Build.VERSION.SDK_INT >= 26", imports = {}))
    @kotlin.jvm.JvmStatic
    public static final boolean isAtLeastO() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    @kotlin.Deprecated(message = "Android O MR1 is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead, use `Build.VERSION.SDK_INT >= 27`.", replaceWith = @kotlin.ReplaceWith(expression = "android.os.Build.VERSION.SDK_INT >= 27", imports = {}))
    @kotlin.jvm.JvmStatic
    public static final boolean isAtLeastOMR1() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 27
            if (r0 < r1) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    @kotlin.Deprecated(message = "Android P is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead, use `Build.VERSION.SDK_INT >= 28`.", replaceWith = @kotlin.ReplaceWith(expression = "android.os.Build.VERSION.SDK_INT >= 28", imports = {}))
    @kotlin.jvm.JvmStatic
    public static final boolean isAtLeastP() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    @kotlin.jvm.JvmStatic
    public static final boolean isAtLeastPreReleaseCodename(java.lang.String r7, java.lang.String r8) {
            java.lang.String r0 = "codename"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "buildCodename"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "REL"
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r8)
            r1 = 0
            if (r0 == 0) goto L14
            return r1
        L14:
            java.lang.Integer r0 = isAtLeastPreReleaseCodename$codenameToInt(r8)
            java.lang.Integer r2 = isAtLeastPreReleaseCodename$codenameToInt(r7)
            r3 = 1
            if (r0 == 0) goto L2d
            if (r2 == 0) goto L2d
            int r4 = r0.intValue()
            int r5 = r2.intValue()
            if (r4 < r5) goto L2c
            r1 = r3
        L2c:
            return r1
        L2d:
            if (r0 != 0) goto L4d
            if (r2 != 0) goto L4d
            java.util.Locale r4 = java.util.Locale.ROOT
            java.lang.String r4 = r8.toUpperCase(r4)
            java.lang.String r5 = "toUpperCase(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r5)
            java.util.Locale r6 = java.util.Locale.ROOT
            java.lang.String r6 = r7.toUpperCase(r6)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r5)
            int r4 = r4.compareTo(r6)
            if (r4 < 0) goto L4c
            r1 = r3
        L4c:
            return r1
        L4d:
            if (r0 == 0) goto L50
            r1 = r3
        L50:
            return r1
    }

    private static final java.lang.Integer isAtLeastPreReleaseCodename$codenameToInt(java.lang.String r2) {
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r0 = r2.toUpperCase(r0)
            java.lang.String r1 = "toUpperCase(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.lang.String r1 = "BAKLAVA"
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L19
            r0 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L1a
        L19:
            r0 = 0
        L1a:
            return r0
    }

    @kotlin.Deprecated(message = "Android Q is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead, use `Build.VERSION.SDK_INT >= 29`.", replaceWith = @kotlin.ReplaceWith(expression = "android.os.Build.VERSION.SDK_INT >= 29", imports = {}))
    @kotlin.jvm.JvmStatic
    public static final boolean isAtLeastQ() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    @kotlin.Deprecated(message = "Android R is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead, use `Build.VERSION.SDK_INT >= 30`.", replaceWith = @kotlin.ReplaceWith(expression = "android.os.Build.VERSION.SDK_INT >= 30", imports = {}))
    @kotlin.jvm.JvmStatic
    public static final boolean isAtLeastR() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    @kotlin.Deprecated(message = "Android S is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead, use `Build.VERSION.SDK_INT >= 31`.", replaceWith = @kotlin.ReplaceWith(expression = "android.os.Build.VERSION.SDK_INT >= 31", imports = {}))
    @kotlin.jvm.JvmStatic
    public static final boolean isAtLeastS() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r0 >= r1) goto L1e
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto L1c
            java.lang.String r0 = android.os.Build.VERSION.CODENAME
            java.lang.String r1 = "CODENAME"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.lang.String r1 = "S"
            boolean r0 = isAtLeastPreReleaseCodename(r1, r0)
            if (r0 == 0) goto L1c
            goto L1e
        L1c:
            r0 = 0
            goto L1f
        L1e:
            r0 = 1
        L1f:
            return r0
    }

    @kotlin.Deprecated(message = "Android Sv2 is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead, use `Build.VERSION.SDK_INT >= 32`.", replaceWith = @kotlin.ReplaceWith(expression = "android.os.Build.VERSION.SDK_INT >= 32", imports = {}))
    @kotlin.jvm.JvmStatic
    public static final boolean isAtLeastSv2() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 32
            if (r0 >= r1) goto L1e
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r0 < r1) goto L1c
            java.lang.String r0 = android.os.Build.VERSION.CODENAME
            java.lang.String r1 = "CODENAME"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.lang.String r1 = "Sv2"
            boolean r0 = isAtLeastPreReleaseCodename(r1, r0)
            if (r0 == 0) goto L1c
            goto L1e
        L1c:
            r0 = 0
            goto L1f
        L1e:
            r0 = 1
        L1f:
            return r0
    }

    @kotlin.Deprecated(message = "Android Tiramisu is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead, use `Build.VERSION.SDK_INT >= 33`.", replaceWith = @kotlin.ReplaceWith(expression = "android.os.Build.VERSION.SDK_INT >= 33", imports = {}))
    @kotlin.jvm.JvmStatic
    public static final boolean isAtLeastT() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 >= r1) goto L1e
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 32
            if (r0 < r1) goto L1c
            java.lang.String r0 = android.os.Build.VERSION.CODENAME
            java.lang.String r1 = "CODENAME"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.lang.String r1 = "Tiramisu"
            boolean r0 = isAtLeastPreReleaseCodename(r1, r0)
            if (r0 == 0) goto L1c
            goto L1e
        L1c:
            r0 = 0
            goto L1f
        L1e:
            r0 = 1
        L1f:
            return r0
    }

    @kotlin.Deprecated(message = "Android UpsideDownCase is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead, use `Build.VERSION.SDK_INT >= 34`.", replaceWith = @kotlin.ReplaceWith(expression = "android.os.Build.VERSION.SDK_INT >= 34", imports = {}))
    @kotlin.jvm.JvmStatic
    public static final boolean isAtLeastU() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 >= r1) goto L1e
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 < r1) goto L1c
            java.lang.String r0 = android.os.Build.VERSION.CODENAME
            java.lang.String r1 = "CODENAME"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.lang.String r1 = "UpsideDownCake"
            boolean r0 = isAtLeastPreReleaseCodename(r1, r0)
            if (r0 == 0) goto L1c
            goto L1e
        L1c:
            r0 = 0
            goto L1f
        L1e:
            r0 = 1
        L1f:
            return r0
    }

    @kotlin.Deprecated(message = "Android VanillaIceCream is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead, use `Build.VERSION.SDK_INT >= 35`.", replaceWith = @kotlin.ReplaceWith(expression = "android.os.Build.VERSION.SDK_INT >= 35", imports = {}))
    @kotlin.jvm.JvmStatic
    public static final boolean isAtLeastV() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 35
            if (r0 >= r1) goto L1e
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto L1c
            java.lang.String r0 = android.os.Build.VERSION.CODENAME
            java.lang.String r1 = "CODENAME"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.lang.String r1 = "VanillaIceCream"
            boolean r0 = isAtLeastPreReleaseCodename(r1, r0)
            if (r0 == 0) goto L1c
            goto L1e
        L1c:
            r0 = 0
            goto L1f
        L1e:
            r0 = 1
        L1f:
            return r0
    }
}
