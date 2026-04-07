package kotlin.internal.jdk8;

/* JADX INFO: compiled from: JDK8PlatformImplementations.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0010\u0018\u00002\u00020\u0001:\u0001\u000fB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002¨\u0006\u0010"}, d2 = {"Lkotlin/internal/jdk8/JDK8PlatformImplementations;", "Lkotlin/internal/jdk7/JDK7PlatformImplementations;", "()V", "defaultPlatformRandom", "Lkotlin/random/Random;", "getMatchResultNamedGroup", "Lkotlin/text/MatchGroup;", "matchResult", "Ljava/util/regex/MatchResult;", "name", "", "sdkIsNullOrAtLeast", "", "version", "", "ReflectSdkVersion", "kotlin-stdlib-jdk8"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class JDK8PlatformImplementations extends kotlin.internal.jdk7.JDK7PlatformImplementations {

    /* JADX INFO: compiled from: JDK8PlatformImplementations.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"Lkotlin/internal/jdk8/JDK8PlatformImplementations$ReflectSdkVersion;", "", "()V", "sdkVersion", "", "Ljava/lang/Integer;", "kotlin-stdlib-jdk8"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class ReflectSdkVersion {
        public static final kotlin.internal.jdk8.JDK8PlatformImplementations.ReflectSdkVersion INSTANCE = null;
        public static final java.lang.Integer sdkVersion = null;

        static {
                kotlin.internal.jdk8.JDK8PlatformImplementations$ReflectSdkVersion r0 = new kotlin.internal.jdk8.JDK8PlatformImplementations$ReflectSdkVersion
                r0.<init>()
                kotlin.internal.jdk8.JDK8PlatformImplementations.ReflectSdkVersion.INSTANCE = r0
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
                kotlin.internal.jdk8.JDK8PlatformImplementations.ReflectSdkVersion.sdkVersion = r0
                return
        }

        private ReflectSdkVersion() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    public JDK8PlatformImplementations() {
            r0 = this;
            r0.<init>()
            return
    }

    private final boolean sdkIsNullOrAtLeast(int r2) {
            r1 = this;
            java.lang.Integer r0 = kotlin.internal.jdk8.JDK8PlatformImplementations.ReflectSdkVersion.sdkVersion
            if (r0 == 0) goto Lf
            java.lang.Integer r0 = kotlin.internal.jdk8.JDK8PlatformImplementations.ReflectSdkVersion.sdkVersion
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
    public kotlin.random.Random defaultPlatformRandom() {
            r1 = this;
            r0 = 34
            boolean r0 = r1.sdkIsNullOrAtLeast(r0)
            if (r0 == 0) goto L10
            kotlin.random.jdk8.PlatformThreadLocalRandom r0 = new kotlin.random.jdk8.PlatformThreadLocalRandom
            r0.<init>()
            kotlin.random.Random r0 = (kotlin.random.Random) r0
            goto L14
        L10:
            kotlin.random.Random r0 = super.defaultPlatformRandom()
        L14:
            return r0
    }

    @Override // kotlin.internal.PlatformImplementations
    public kotlin.text.MatchGroup getMatchResultNamedGroup(java.util.regex.MatchResult r6, java.lang.String r7) {
            r5 = this;
            java.lang.String r0 = "matchResult"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "name"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            boolean r0 = r6 instanceof java.util.regex.Matcher
            r1 = 0
            if (r0 == 0) goto L13
            r0 = r6
            java.util.regex.Matcher r0 = (java.util.regex.Matcher) r0
            goto L14
        L13:
            r0 = r1
        L14:
            if (r0 == 0) goto L40
            kotlin.ranges.IntRange r2 = new kotlin.ranges.IntRange
            int r3 = r0.start(r7)
            int r4 = r0.end(r7)
            int r4 = r4 + (-1)
            r2.<init>(r3, r4)
            java.lang.Integer r3 = r2.getStart()
            int r3 = r3.intValue()
            if (r3 < 0) goto L3e
            kotlin.text.MatchGroup r1 = new kotlin.text.MatchGroup
            java.lang.String r3 = r0.group(r7)
            java.lang.String r4 = "group(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            r1.<init>(r3, r2)
            goto L3f
        L3e:
        L3f:
            return r1
        L40:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Retrieving groups by name is not supported on this platform."
            r0.<init>(r1)
            throw r0
    }
}
