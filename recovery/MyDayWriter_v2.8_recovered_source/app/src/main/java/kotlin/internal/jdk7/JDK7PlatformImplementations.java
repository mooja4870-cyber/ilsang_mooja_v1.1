package kotlin.internal.jdk7;

/* JADX INFO: compiled from: JDK7PlatformImplementations.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0010\u0018\u00002\u00020\u0001:\u0001\u000eB\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\t2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002¨\u0006\u000f"}, d2 = {"Lkotlin/internal/jdk7/JDK7PlatformImplementations;", "Lkotlin/internal/PlatformImplementations;", "()V", "addSuppressed", "", "cause", "", "exception", "getSuppressed", "", "sdkIsNullOrAtLeast", "", "version", "", "ReflectSdkVersion", "kotlin-stdlib-jdk7"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class JDK7PlatformImplementations extends kotlin.internal.PlatformImplementations {

    /* JADX INFO: compiled from: JDK7PlatformImplementations.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"Lkotlin/internal/jdk7/JDK7PlatformImplementations$ReflectSdkVersion;", "", "()V", "sdkVersion", "", "Ljava/lang/Integer;", "kotlin-stdlib-jdk7"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class ReflectSdkVersion {
        public static final kotlin.internal.jdk7.JDK7PlatformImplementations.ReflectSdkVersion INSTANCE = null;
        public static final java.lang.Integer sdkVersion = null;

        static {
                kotlin.internal.jdk7.JDK7PlatformImplementations$ReflectSdkVersion r0 = new kotlin.internal.jdk7.JDK7PlatformImplementations$ReflectSdkVersion
                r0.<init>()
                kotlin.internal.jdk7.JDK7PlatformImplementations.ReflectSdkVersion.INSTANCE = r0
                r0 = 0
                java.lang.String r1 = "android.os.Build$VERSION"
                java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L23
                java.lang.String r2 = "SDK_INT"
                java.lang.reflect.Field r1 = r1.getField(r2)     // Catch: java.lang.Throwable -> L23
                java.lang.Object r1 = r1.get(r0)     // Catch: java.lang.Throwable -> L23
                boolean r2 = r1 instanceof java.lang.Integer     // Catch: java.lang.Throwable -> L23
                if (r2 == 0) goto L21
                java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Throwable -> L23
                goto L25
            L21:
                r1 = r0
                goto L25
            L23:
                r1 = move-exception
                r1 = r0
            L25:
                if (r1 == 0) goto L39
            L29:
                r2 = r1
                java.lang.Number r2 = (java.lang.Number) r2
                int r2 = r2.intValue()
                r3 = 0
                if (r2 <= 0) goto L35
                r4 = 1
                goto L36
            L35:
                r4 = 0
            L36:
                if (r4 == 0) goto L39
                r0 = r1
            L39:
                kotlin.internal.jdk7.JDK7PlatformImplementations.ReflectSdkVersion.sdkVersion = r0
                return
        }

        private ReflectSdkVersion() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    public JDK7PlatformImplementations() {
            r0 = this;
            r0.<init>()
            return
    }

    private final boolean sdkIsNullOrAtLeast(int r2) {
            r1 = this;
            java.lang.Integer r0 = kotlin.internal.jdk7.JDK7PlatformImplementations.ReflectSdkVersion.sdkVersion
            if (r0 == 0) goto Lf
            java.lang.Integer r0 = kotlin.internal.jdk7.JDK7PlatformImplementations.ReflectSdkVersion.sdkVersion
            int r0 = r0.intValue()
            if (r0 < r2) goto Ld
            goto Lf
        Ld:
            r0 = 0
            goto L10
        Lf:
            r0 = 1
        L10:
            return r0
    }

    @Override // kotlin.internal.PlatformImplementations
    public void addSuppressed(java.lang.Throwable r2, java.lang.Throwable r3) {
            r1 = this;
            java.lang.String r0 = "cause"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "exception"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = 19
            boolean r0 = r1.sdkIsNullOrAtLeast(r0)
            if (r0 == 0) goto L16
            r2.addSuppressed(r3)
            goto L19
        L16:
            super.addSuppressed(r2, r3)
        L19:
            return
    }

    @Override // kotlin.internal.PlatformImplementations
    public java.util.List<java.lang.Throwable> getSuppressed(java.lang.Throwable r3) {
            r2 = this;
            java.lang.String r0 = "exception"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = 19
            boolean r0 = r2.sdkIsNullOrAtLeast(r0)
            if (r0 == 0) goto L1d
            java.lang.Throwable[] r0 = r3.getSuppressed()
            java.lang.String r1 = "getSuppressed(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            java.util.List r0 = kotlin.collections.ArraysKt.asList(r0)
            goto L21
        L1d:
            java.util.List r0 = super.getSuppressed(r3)
        L21:
            return r0
    }
}
