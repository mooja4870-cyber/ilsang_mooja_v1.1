package kotlin.time;

/* JADX INFO: compiled from: Duration.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b*\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001d\u0010#\u001a\u00020\u00072\u0006\u0010$\u001a\u00020\u00012\u0006\u0010%\u001a\u00020\u0005H\u0002¢\u0006\u0002\u0010&\u001a\u0015\u0010'\u001a\u00020\u00072\u0006\u0010(\u001a\u00020\u0001H\u0002¢\u0006\u0002\u0010\u0010\u001a\u0015\u0010)\u001a\u00020\u00072\u0006\u0010*\u001a\u00020\u0001H\u0002¢\u0006\u0002\u0010\u0010\u001a\u0015\u0010+\u001a\u00020\u00072\u0006\u0010,\u001a\u00020\u0001H\u0002¢\u0006\u0002\u0010\u0010\u001a\u0015\u0010-\u001a\u00020\u00072\u0006\u0010.\u001a\u00020\u0001H\u0002¢\u0006\u0002\u0010\u0010\u001a\u0010\u0010/\u001a\u00020\u00012\u0006\u0010*\u001a\u00020\u0001H\u0002\u001a\u0010\u00100\u001a\u00020\u00012\u0006\u0010.\u001a\u00020\u0001H\u0002\u001a\u001d\u00101\u001a\u00020\u00072\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u000205H\u0002¢\u0006\u0002\u00106\u001a\u0010\u00107\u001a\u00020\u00012\u0006\u00102\u001a\u000203H\u0002\u001a)\u00108\u001a\u00020\u0005*\u0002032\u0006\u00109\u001a\u00020\u00052\u0012\u0010:\u001a\u000e\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u0002050;H\u0082\b\u001a)\u0010=\u001a\u000203*\u0002032\u0006\u00109\u001a\u00020\u00052\u0012\u0010:\u001a\u000e\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u0002050;H\u0082\b\u001a\u001c\u0010>\u001a\u00020\u0007*\u00020\b2\u0006\u0010?\u001a\u00020\u0007H\u0087\n¢\u0006\u0004\b@\u0010A\u001a\u001c\u0010>\u001a\u00020\u0007*\u00020\u00052\u0006\u0010?\u001a\u00020\u0007H\u0087\n¢\u0006\u0004\bB\u0010C\u001a\u0019\u0010D\u001a\u00020\u0007*\u00020\b2\u0006\u0010E\u001a\u00020FH\u0007¢\u0006\u0002\u0010G\u001a\u0019\u0010D\u001a\u00020\u0007*\u00020\u00052\u0006\u0010E\u001a\u00020FH\u0007¢\u0006\u0002\u0010H\u001a\u0019\u0010D\u001a\u00020\u0007*\u00020\u00012\u0006\u0010E\u001a\u00020FH\u0007¢\u0006\u0002\u0010I\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000\"\u001e\u0010\u0006\u001a\u00020\u0007*\u00020\b8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u001e\u0010\u0006\u001a\u00020\u0007*\u00020\u00058FX\u0087\u0004¢\u0006\f\u0012\u0004\b\t\u0010\r\u001a\u0004\b\u000b\u0010\u000e\"\u001e\u0010\u0006\u001a\u00020\u0007*\u00020\u00018FX\u0087\u0004¢\u0006\f\u0012\u0004\b\t\u0010\u000f\u001a\u0004\b\u000b\u0010\u0010\"\u001e\u0010\u0011\u001a\u00020\u0007*\u00020\b8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0012\u0010\n\u001a\u0004\b\u0013\u0010\f\"\u001e\u0010\u0011\u001a\u00020\u0007*\u00020\u00058FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0012\u0010\r\u001a\u0004\b\u0013\u0010\u000e\"\u001e\u0010\u0011\u001a\u00020\u0007*\u00020\u00018FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0010\"\u001e\u0010\u0014\u001a\u00020\u0007*\u00020\b8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0015\u0010\n\u001a\u0004\b\u0016\u0010\f\"\u001e\u0010\u0014\u001a\u00020\u0007*\u00020\u00058FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0015\u0010\r\u001a\u0004\b\u0016\u0010\u000e\"\u001e\u0010\u0014\u001a\u00020\u0007*\u00020\u00018FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0015\u0010\u000f\u001a\u0004\b\u0016\u0010\u0010\"\u001e\u0010\u0017\u001a\u00020\u0007*\u00020\b8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0018\u0010\n\u001a\u0004\b\u0019\u0010\f\"\u001e\u0010\u0017\u001a\u00020\u0007*\u00020\u00058FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0018\u0010\r\u001a\u0004\b\u0019\u0010\u000e\"\u001e\u0010\u0017\u001a\u00020\u0007*\u00020\u00018FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0018\u0010\u000f\u001a\u0004\b\u0019\u0010\u0010\"\u001e\u0010\u001a\u001a\u00020\u0007*\u00020\b8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001b\u0010\n\u001a\u0004\b\u001c\u0010\f\"\u001e\u0010\u001a\u001a\u00020\u0007*\u00020\u00058FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001b\u0010\r\u001a\u0004\b\u001c\u0010\u000e\"\u001e\u0010\u001a\u001a\u00020\u0007*\u00020\u00018FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001b\u0010\u000f\u001a\u0004\b\u001c\u0010\u0010\"\u001e\u0010\u001d\u001a\u00020\u0007*\u00020\b8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001e\u0010\n\u001a\u0004\b\u001f\u0010\f\"\u001e\u0010\u001d\u001a\u00020\u0007*\u00020\u00058FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001e\u0010\r\u001a\u0004\b\u001f\u0010\u000e\"\u001e\u0010\u001d\u001a\u00020\u0007*\u00020\u00018FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001e\u0010\u000f\u001a\u0004\b\u001f\u0010\u0010\"\u001e\u0010 \u001a\u00020\u0007*\u00020\b8FX\u0087\u0004¢\u0006\f\u0012\u0004\b!\u0010\n\u001a\u0004\b\"\u0010\f\"\u001e\u0010 \u001a\u00020\u0007*\u00020\u00058FX\u0087\u0004¢\u0006\f\u0012\u0004\b!\u0010\r\u001a\u0004\b\"\u0010\u000e\"\u001e\u0010 \u001a\u00020\u0007*\u00020\u00018FX\u0087\u0004¢\u0006\f\u0012\u0004\b!\u0010\u000f\u001a\u0004\b\"\u0010\u0010¨\u0006J"}, d2 = {"MAX_MILLIS", "", "MAX_NANOS", "MAX_NANOS_IN_MILLIS", "NANOS_IN_MILLIS", "", "days", "Lkotlin/time/Duration;", "", "getDays$annotations", "(D)V", "getDays", "(D)J", "(I)V", "(I)J", "(J)V", "(J)J", "hours", "getHours$annotations", "getHours", "microseconds", "getMicroseconds$annotations", "getMicroseconds", "milliseconds", "getMilliseconds$annotations", "getMilliseconds", "minutes", "getMinutes$annotations", "getMinutes", "nanoseconds", "getNanoseconds$annotations", "getNanoseconds", "seconds", "getSeconds$annotations", "getSeconds", "durationOf", "normalValue", "unitDiscriminator", "(JI)J", "durationOfMillis", "normalMillis", "durationOfMillisNormalized", "millis", "durationOfNanos", "normalNanos", "durationOfNanosNormalized", "nanos", "millisToNanos", "nanosToMillis", "parseDuration", "value", "", "strictIso", "", "(Ljava/lang/String;Z)J", "parseOverLongIsoComponent", "skipWhile", "startIndex", "predicate", "Lkotlin/Function1;", "", "substringWhile", "times", "duration", "times-kIfJnKk", "(DJ)J", "times-mvk6XK0", "(IJ)J", "toDuration", "unit", "Lkotlin/time/DurationUnit;", "(DLkotlin/time/DurationUnit;)J", "(ILkotlin/time/DurationUnit;)J", "(JLkotlin/time/DurationUnit;)J", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class DurationKt {
    public static final long MAX_MILLIS = 4611686018427387903L;
    public static final long MAX_NANOS = 4611686018426999999L;
    private static final long MAX_NANOS_IN_MILLIS = 4611686018426L;
    public static final int NANOS_IN_MILLIS = 1000000;

    public static final /* synthetic */ long access$durationOf(long r2, int r4) {
            long r0 = durationOf(r2, r4)
            return r0
    }

    public static final /* synthetic */ long access$durationOfMillis(long r2) {
            long r0 = durationOfMillis(r2)
            return r0
    }

    public static final /* synthetic */ long access$durationOfMillisNormalized(long r2) {
            long r0 = durationOfMillisNormalized(r2)
            return r0
    }

    public static final /* synthetic */ long access$durationOfNanos(long r2) {
            long r0 = durationOfNanos(r2)
            return r0
    }

    public static final /* synthetic */ long access$durationOfNanosNormalized(long r2) {
            long r0 = durationOfNanosNormalized(r2)
            return r0
    }

    public static final /* synthetic */ long access$millisToNanos(long r2) {
            long r0 = millisToNanos(r2)
            return r0
    }

    public static final /* synthetic */ long access$nanosToMillis(long r2) {
            long r0 = nanosToMillis(r2)
            return r0
    }

    public static final /* synthetic */ long access$parseDuration(java.lang.String r2, boolean r3) {
            long r0 = parseDuration(r2, r3)
            return r0
    }

    private static final long durationOf(long r4, int r6) {
            r0 = 1
            long r0 = r4 << r0
            long r2 = (long) r6
            long r0 = r0 + r2
            long r0 = kotlin.time.Duration.m1479constructorimpl(r0)
            return r0
    }

    private static final long durationOfMillis(long r4) {
            r0 = 1
            long r0 = r4 << r0
            r2 = 1
            long r0 = r0 + r2
            long r0 = kotlin.time.Duration.m1479constructorimpl(r0)
            return r0
    }

    private static final long durationOfMillisNormalized(long r8) {
            r0 = -4611686018426(0xfffffbce4217d286, double:NaN)
            int r0 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            r1 = 0
            if (r0 > 0) goto L14
            r2 = 4611686018427(0x431bde82d7b, double:2.278475631111E-311)
            int r0 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r0 >= 0) goto L14
            r1 = 1
        L14:
            if (r1 == 0) goto L20
            long r0 = millisToNanos(r8)
            long r0 = durationOfNanos(r0)
            r2 = r8
            goto L33
        L20:
            r4 = -4611686018427387903(0xc000000000000001, double:-2.0000000000000004)
            r6 = 4611686018427387903(0x3fffffffffffffff, double:1.9999999999999998)
            r2 = r8
            long r8 = kotlin.ranges.RangesKt.coerceIn(r2, r4, r6)
            long r0 = durationOfMillis(r8)
        L33:
            return r0
    }

    private static final long durationOfNanos(long r2) {
            r0 = 1
            long r0 = r2 << r0
            long r0 = kotlin.time.Duration.m1479constructorimpl(r0)
            return r0
    }

    private static final long durationOfNanosNormalized(long r4) {
            r0 = -4611686018426999999(0xc00000000005eb41, double:-2.0000000001722644)
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            r1 = 0
            if (r0 > 0) goto L14
            r2 = 4611686018427000000(0x3ffffffffffa14c0, double:1.999999999913868)
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 >= 0) goto L14
            r1 = 1
        L14:
            if (r1 == 0) goto L1b
            long r0 = durationOfNanos(r4)
            goto L23
        L1b:
            long r0 = nanosToMillis(r4)
            long r0 = durationOfMillis(r0)
        L23:
            return r0
    }

    public static final /* synthetic */ long getDays(double r2) {
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.DAYS
            long r0 = toDuration(r2, r0)
            return r0
    }

    public static final /* synthetic */ long getDays(int r2) {
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.DAYS
            long r0 = toDuration(r2, r0)
            return r0
    }

    public static final /* synthetic */ long getDays(long r2) {
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.DAYS
            long r0 = toDuration(r2, r0)
            return r0
    }

    @kotlin.Deprecated(message = "Use 'Double.days' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.days", imports = {"kotlin.time.Duration.Companion.days"}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    public static /* synthetic */ void getDays$annotations(double r0) {
            return
    }

    @kotlin.Deprecated(message = "Use 'Int.days' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.days", imports = {"kotlin.time.Duration.Companion.days"}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    public static /* synthetic */ void getDays$annotations(int r0) {
            return
    }

    @kotlin.Deprecated(message = "Use 'Long.days' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.days", imports = {"kotlin.time.Duration.Companion.days"}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    public static /* synthetic */ void getDays$annotations(long r0) {
            return
    }

    public static final /* synthetic */ long getHours(double r2) {
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.HOURS
            long r0 = toDuration(r2, r0)
            return r0
    }

    public static final /* synthetic */ long getHours(int r2) {
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.HOURS
            long r0 = toDuration(r2, r0)
            return r0
    }

    public static final /* synthetic */ long getHours(long r2) {
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.HOURS
            long r0 = toDuration(r2, r0)
            return r0
    }

    @kotlin.Deprecated(message = "Use 'Double.hours' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.hours", imports = {"kotlin.time.Duration.Companion.hours"}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    public static /* synthetic */ void getHours$annotations(double r0) {
            return
    }

    @kotlin.Deprecated(message = "Use 'Int.hours' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.hours", imports = {"kotlin.time.Duration.Companion.hours"}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    public static /* synthetic */ void getHours$annotations(int r0) {
            return
    }

    @kotlin.Deprecated(message = "Use 'Long.hours' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.hours", imports = {"kotlin.time.Duration.Companion.hours"}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    public static /* synthetic */ void getHours$annotations(long r0) {
            return
    }

    public static final /* synthetic */ long getMicroseconds(double r2) {
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.MICROSECONDS
            long r0 = toDuration(r2, r0)
            return r0
    }

    public static final /* synthetic */ long getMicroseconds(int r2) {
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.MICROSECONDS
            long r0 = toDuration(r2, r0)
            return r0
    }

    public static final /* synthetic */ long getMicroseconds(long r2) {
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.MICROSECONDS
            long r0 = toDuration(r2, r0)
            return r0
    }

    @kotlin.Deprecated(message = "Use 'Double.microseconds' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.microseconds", imports = {"kotlin.time.Duration.Companion.microseconds"}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    public static /* synthetic */ void getMicroseconds$annotations(double r0) {
            return
    }

    @kotlin.Deprecated(message = "Use 'Int.microseconds' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.microseconds", imports = {"kotlin.time.Duration.Companion.microseconds"}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    public static /* synthetic */ void getMicroseconds$annotations(int r0) {
            return
    }

    @kotlin.Deprecated(message = "Use 'Long.microseconds' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.microseconds", imports = {"kotlin.time.Duration.Companion.microseconds"}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    public static /* synthetic */ void getMicroseconds$annotations(long r0) {
            return
    }

    public static final /* synthetic */ long getMilliseconds(double r2) {
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.MILLISECONDS
            long r0 = toDuration(r2, r0)
            return r0
    }

    public static final /* synthetic */ long getMilliseconds(int r2) {
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.MILLISECONDS
            long r0 = toDuration(r2, r0)
            return r0
    }

    public static final /* synthetic */ long getMilliseconds(long r2) {
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.MILLISECONDS
            long r0 = toDuration(r2, r0)
            return r0
    }

    @kotlin.Deprecated(message = "Use 'Double.milliseconds' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.milliseconds", imports = {"kotlin.time.Duration.Companion.milliseconds"}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    public static /* synthetic */ void getMilliseconds$annotations(double r0) {
            return
    }

    @kotlin.Deprecated(message = "Use 'Int.milliseconds' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.milliseconds", imports = {"kotlin.time.Duration.Companion.milliseconds"}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    public static /* synthetic */ void getMilliseconds$annotations(int r0) {
            return
    }

    @kotlin.Deprecated(message = "Use 'Long.milliseconds' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.milliseconds", imports = {"kotlin.time.Duration.Companion.milliseconds"}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    public static /* synthetic */ void getMilliseconds$annotations(long r0) {
            return
    }

    public static final /* synthetic */ long getMinutes(double r2) {
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.MINUTES
            long r0 = toDuration(r2, r0)
            return r0
    }

    public static final /* synthetic */ long getMinutes(int r2) {
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.MINUTES
            long r0 = toDuration(r2, r0)
            return r0
    }

    public static final /* synthetic */ long getMinutes(long r2) {
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.MINUTES
            long r0 = toDuration(r2, r0)
            return r0
    }

    @kotlin.Deprecated(message = "Use 'Double.minutes' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.minutes", imports = {"kotlin.time.Duration.Companion.minutes"}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    public static /* synthetic */ void getMinutes$annotations(double r0) {
            return
    }

    @kotlin.Deprecated(message = "Use 'Int.minutes' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.minutes", imports = {"kotlin.time.Duration.Companion.minutes"}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    public static /* synthetic */ void getMinutes$annotations(int r0) {
            return
    }

    @kotlin.Deprecated(message = "Use 'Long.minutes' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.minutes", imports = {"kotlin.time.Duration.Companion.minutes"}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    public static /* synthetic */ void getMinutes$annotations(long r0) {
            return
    }

    public static final /* synthetic */ long getNanoseconds(double r2) {
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.NANOSECONDS
            long r0 = toDuration(r2, r0)
            return r0
    }

    public static final /* synthetic */ long getNanoseconds(int r2) {
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.NANOSECONDS
            long r0 = toDuration(r2, r0)
            return r0
    }

    public static final /* synthetic */ long getNanoseconds(long r2) {
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.NANOSECONDS
            long r0 = toDuration(r2, r0)
            return r0
    }

    @kotlin.Deprecated(message = "Use 'Double.nanoseconds' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.nanoseconds", imports = {"kotlin.time.Duration.Companion.nanoseconds"}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    public static /* synthetic */ void getNanoseconds$annotations(double r0) {
            return
    }

    @kotlin.Deprecated(message = "Use 'Int.nanoseconds' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.nanoseconds", imports = {"kotlin.time.Duration.Companion.nanoseconds"}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    public static /* synthetic */ void getNanoseconds$annotations(int r0) {
            return
    }

    @kotlin.Deprecated(message = "Use 'Long.nanoseconds' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.nanoseconds", imports = {"kotlin.time.Duration.Companion.nanoseconds"}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    public static /* synthetic */ void getNanoseconds$annotations(long r0) {
            return
    }

    public static final /* synthetic */ long getSeconds(double r2) {
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.SECONDS
            long r0 = toDuration(r2, r0)
            return r0
    }

    public static final /* synthetic */ long getSeconds(int r2) {
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.SECONDS
            long r0 = toDuration(r2, r0)
            return r0
    }

    public static final /* synthetic */ long getSeconds(long r2) {
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.SECONDS
            long r0 = toDuration(r2, r0)
            return r0
    }

    @kotlin.Deprecated(message = "Use 'Double.seconds' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.seconds", imports = {"kotlin.time.Duration.Companion.seconds"}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    public static /* synthetic */ void getSeconds$annotations(double r0) {
            return
    }

    @kotlin.Deprecated(message = "Use 'Int.seconds' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.seconds", imports = {"kotlin.time.Duration.Companion.seconds"}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    public static /* synthetic */ void getSeconds$annotations(int r0) {
            return
    }

    @kotlin.Deprecated(message = "Use 'Long.seconds' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.seconds", imports = {"kotlin.time.Duration.Companion.seconds"}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    public static /* synthetic */ void getSeconds$annotations(long r0) {
            return
    }

    private static final long millisToNanos(long r2) {
            r0 = 1000000(0xf4240, float:1.401298E-39)
            long r0 = (long) r0
            long r0 = r0 * r2
            return r0
    }

    private static final long nanosToMillis(long r2) {
            r0 = 1000000(0xf4240, float:1.401298E-39)
            long r0 = (long) r0
            long r0 = r2 / r0
            return r0
    }

    private static final long parseDuration(java.lang.String r31, boolean r32) {
            r0 = r31
            int r6 = r0.length()
            if (r6 == 0) goto L385
            r1 = 0
            kotlin.time.Duration$Companion r2 = kotlin.time.Duration.Companion
            long r7 = r2.m1582getZEROUwyO8pc()
            java.lang.String r2 = "Infinity"
            char r3 = r0.charAt(r1)
            switch(r3) {
                case 43: goto L19;
                case 44: goto L18;
                case 45: goto L19;
                default: goto L18;
            }
        L18:
            goto L1b
        L19:
            int r1 = r1 + 1
        L1b:
            r9 = 0
            if (r1 <= 0) goto L20
            r3 = 1
            goto L21
        L20:
            r3 = r9
        L21:
            r11 = r3
            r3 = 0
            r4 = 2
            if (r11 == 0) goto L33
            r5 = r0
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            r12 = 45
            boolean r5 = kotlin.text.StringsKt.startsWith$default(r5, r12, r9, r4, r3)
            if (r5 == 0) goto L33
            r5 = 1
            goto L34
        L33:
            r5 = r9
        L34:
            r12 = r5
            java.lang.String r13 = "No components"
            if (r6 <= r1) goto L37f
            char r5 = r0.charAt(r1)
            r14 = 80
            java.lang.String r15 = "Unexpected order of duration components"
            java.lang.String r4 = "substring(...)"
            java.lang.String r9 = "null cannot be cast to non-null type java.lang.String"
            if (r5 != r14) goto L1b7
            int r1 = r1 + 1
            if (r1 == r6) goto L1b1
            java.lang.String r5 = "+-."
            r13 = 0
            r14 = 0
        L50:
            if (r1 >= r6) goto L1a7
            char r10 = r0.charAt(r1)
            r3 = 84
            if (r10 != r3) goto L68
            if (r13 != 0) goto L62
            int r1 = r1 + 1
            if (r1 == r6) goto L62
            r13 = 1
            goto L50
        L62:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            r3.<init>()
            throw r3
        L68:
            r3 = r31
            r10 = 0
            r19 = r3
            r20 = 0
            r21 = r1
            r0 = r21
        L73:
            r21 = r2
            int r2 = r19.length()
            if (r0 >= r2) goto Lc4
            r2 = r19
            r19 = r5
            char r5 = r2.charAt(r0)
            r22 = 0
            r23 = r2
            r2 = 48
            if (r2 > r5) goto L91
            r2 = 58
            if (r5 >= r2) goto L91
            r2 = 1
            goto L92
        L91:
            r2 = 0
        L92:
            if (r2 != 0) goto Laa
            r2 = r19
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r24 = r6
            r16 = r10
            r17 = r11
            r6 = 0
            r10 = 2
            r11 = 0
            boolean r2 = kotlin.text.StringsKt.contains$default(r2, r5, r11, r10, r6)
            if (r2 == 0) goto La8
            goto Lb2
        La8:
            r2 = 0
            goto Lb3
        Laa:
            r24 = r6
            r16 = r10
            r17 = r11
            r6 = 0
            r10 = 2
        Lb2:
            r2 = 1
        Lb3:
            if (r2 == 0) goto Ld0
            int r0 = r0 + 1
            r10 = r16
            r11 = r17
            r5 = r19
            r2 = r21
            r19 = r23
            r6 = r24
            goto L73
        Lc4:
            r24 = r6
            r16 = r10
            r17 = r11
            r23 = r19
            r6 = 0
            r10 = 2
            r19 = r5
        Ld0:
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3, r9)
            java.lang.String r0 = r3.substring(r1, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r4)
            r2 = r0
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            int r2 = r2.length()
            if (r2 != 0) goto Le7
            r2 = 1
            goto Le8
        Le7:
            r2 = 0
        Le8:
            if (r2 != 0) goto L1a1
            int r2 = r0.length()
            int r1 = r1 + r2
            r2 = r31
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            if (r1 < 0) goto Lfd
            int r3 = r2.length()
            if (r1 >= r3) goto Lfd
            r3 = 1
            goto Lfe
        Lfd:
            r3 = 0
        Lfe:
            if (r3 == 0) goto L186
            char r2 = r2.charAt(r1)
            int r1 = r1 + 1
            kotlin.time.DurationUnit r3 = kotlin.time.DurationUnitKt.durationUnitByIsoChar(r2, r13)
            if (r14 == 0) goto L11c
            r5 = r3
            java.lang.Enum r5 = (java.lang.Enum) r5
            int r5 = r14.compareTo(r5)
            if (r5 <= 0) goto L116
            goto L11c
        L116:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            r4.<init>(r15)
            throw r4
        L11c:
            r14 = r3
            r25 = r0
            java.lang.CharSequence r25 = (java.lang.CharSequence) r25
            r29 = 6
            r30 = 0
            r26 = 46
            r27 = 0
            r28 = 0
            int r5 = kotlin.text.StringsKt.indexOf$default(r25, r26, r27, r28, r29, r30)
            kotlin.time.DurationUnit r11 = kotlin.time.DurationUnit.SECONDS
            if (r3 != r11) goto L16e
            if (r5 <= 0) goto L16e
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0, r9)
            r11 = 0
            java.lang.String r6 = r0.substring(r11, r5)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r4)
            long r10 = parseOverLongIsoComponent(r6)
            long r10 = toDuration(r10, r3)
            long r7 = kotlin.time.Duration.m1515plusLRDsOJo(r7, r10)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0, r9)
            java.lang.String r10 = r0.substring(r5)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r4)
            double r10 = java.lang.Double.parseDouble(r10)
            long r10 = toDuration(r10, r3)
            long r7 = kotlin.time.Duration.m1515plusLRDsOJo(r7, r10)
            r0 = r31
            r11 = r17
            r5 = r19
            r2 = r21
            r6 = r24
            goto L50
        L16e:
            long r10 = parseOverLongIsoComponent(r0)
            long r10 = toDuration(r10, r3)
            long r7 = kotlin.time.Duration.m1515plusLRDsOJo(r7, r10)
            r0 = r31
            r11 = r17
            r5 = r19
            r2 = r21
            r6 = r24
            goto L50
        L186:
            r2 = r1
            r3 = 0
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Missing unit for value "
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.StringBuilder r5 = r5.append(r0)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L1a1:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            r2.<init>()
            throw r2
        L1a7:
            r21 = r2
            r19 = r5
            r24 = r6
            r17 = r11
            goto L370
        L1b1:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
        L1b7:
            r21 = r2
            r24 = r6
            r17 = r11
            if (r32 != 0) goto L379
            int r6 = r24 - r1
            int r0 = r21.length()
            int r0 = java.lang.Math.max(r6, r0)
            r5 = 1
            r3 = 0
            r10 = r4
            r2 = r21
            r6 = 48
            r4 = r0
            r0 = r31
            boolean r3 = kotlin.text.StringsKt.regionMatches(r0, r1, r2, r3, r4, r5)
            if (r3 == 0) goto L1e5
            kotlin.time.Duration$Companion r3 = kotlin.time.Duration.Companion
            long r7 = r3.m1580getINFINITEUwyO8pc()
            r21 = r2
            r6 = r24
            goto L370
        L1e5:
            r3 = 0
            r4 = 0
            if (r17 != 0) goto L1eb
            r11 = 1
            goto L1ec
        L1eb:
            r11 = 0
        L1ec:
            if (r17 == 0) goto L20f
            char r5 = r0.charAt(r1)
            r14 = 40
            if (r5 != r14) goto L20f
            r5 = r0
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            char r5 = kotlin.text.StringsKt.last(r5)
            r14 = 41
            if (r5 != r14) goto L20f
            r11 = 1
            int r1 = r1 + 1
            int r5 = r24 + (-1)
            if (r1 == r5) goto L209
            goto L211
        L209:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            r6.<init>(r13)
            throw r6
        L20f:
            r5 = r24
        L211:
            if (r1 >= r5) goto L36b
            if (r4 == 0) goto L241
            if (r11 == 0) goto L241
            r13 = r31
            r14 = 0
            r16 = r1
            r6 = r16
        L21e:
            int r0 = r13.length()
            if (r6 >= r0) goto L23c
            char r0 = r13.charAt(r6)
            r16 = 0
            r19 = r1
            r1 = 32
            if (r0 != r1) goto L232
            r0 = 1
            goto L233
        L232:
            r0 = 0
        L233:
            if (r0 == 0) goto L23e
            int r6 = r6 + 1
            r0 = r31
            r1 = r19
            goto L21e
        L23c:
            r19 = r1
        L23e:
            r1 = r6
            goto L245
        L241:
            r19 = r1
            r1 = r19
        L245:
            r4 = 1
            r0 = r31
            r6 = 0
            r13 = r0
            r14 = 0
            r16 = r1
            r21 = r2
            r2 = r16
        L251:
            r16 = r4
            int r4 = r13.length()
            if (r2 >= r4) goto L283
            char r4 = r13.charAt(r2)
            r19 = 0
            r20 = r6
            r6 = 48
            if (r6 > r4) goto L26c
            r6 = 58
            if (r4 >= r6) goto L26e
            r18 = 1
            goto L270
        L26c:
            r6 = 58
        L26e:
            r18 = 0
        L270:
            if (r18 != 0) goto L279
            r6 = 46
            if (r4 != r6) goto L277
            goto L279
        L277:
            r4 = 0
            goto L27a
        L279:
            r4 = 1
        L27a:
            if (r4 == 0) goto L285
            int r2 = r2 + 1
            r4 = r16
            r6 = r20
            goto L251
        L283:
            r20 = r6
        L285:
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0, r9)
            java.lang.String r2 = r0.substring(r1, r2)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r10)
            r0 = r2
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            int r0 = r0.length()
            if (r0 != 0) goto L29c
            r0 = 1
            goto L29d
        L29c:
            r0 = 0
        L29d:
            if (r0 != 0) goto L365
            int r0 = r2.length()
            int r1 = r1 + r0
            r0 = r31
            r4 = 0
            r6 = r0
            r13 = 0
            r14 = r1
        L2aa:
            r19 = r4
            int r4 = r6.length()
            if (r14 >= r4) goto L2ce
            char r4 = r6.charAt(r14)
            r20 = 0
            r22 = r6
            r6 = 97
            if (r6 > r4) goto L2c4
            r6 = 123(0x7b, float:1.72E-43)
            if (r4 >= r6) goto L2c4
            r4 = 1
            goto L2c5
        L2c4:
            r4 = 0
        L2c5:
            if (r4 == 0) goto L2d0
            int r14 = r14 + 1
            r4 = r19
            r6 = r22
            goto L2aa
        L2ce:
            r22 = r6
        L2d0:
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0, r9)
            java.lang.String r4 = r0.substring(r1, r14)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r10)
            int r0 = r4.length()
            int r1 = r1 + r0
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnitKt.durationUnitByShortName(r4)
            if (r3 == 0) goto L2f7
            r6 = r0
            java.lang.Enum r6 = (java.lang.Enum) r6
            int r6 = r3.compareTo(r6)
            if (r6 <= 0) goto L2f1
            goto L2f7
        L2f1:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            r6.<init>(r15)
            throw r6
        L2f7:
            r3 = r0
            r22 = r2
            java.lang.CharSequence r22 = (java.lang.CharSequence) r22
            r26 = 6
            r27 = 0
            r23 = 46
            r24 = 0
            r25 = 0
            int r6 = kotlin.text.StringsKt.indexOf$default(r22, r23, r24, r25, r26, r27)
            if (r6 <= 0) goto L34f
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2, r9)
            r13 = 0
            java.lang.String r14 = r2.substring(r13, r6)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r14, r10)
            r19 = r14
            long r13 = java.lang.Long.parseLong(r19)
            long r13 = toDuration(r13, r0)
            long r7 = kotlin.time.Duration.m1515plusLRDsOJo(r7, r13)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2, r9)
            java.lang.String r13 = r2.substring(r6)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r13, r10)
            double r13 = java.lang.Double.parseDouble(r13)
            long r13 = toDuration(r13, r0)
            long r7 = kotlin.time.Duration.m1515plusLRDsOJo(r7, r13)
            if (r1 < r5) goto L347
            r6 = 48
            r0 = r31
            r4 = r16
            r2 = r21
            goto L211
        L347:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "Fractional component must be last"
            r9.<init>(r10)
            throw r9
        L34f:
            long r13 = java.lang.Long.parseLong(r2)
            long r13 = toDuration(r13, r0)
            long r7 = kotlin.time.Duration.m1515plusLRDsOJo(r7, r13)
            r6 = 48
            r0 = r31
            r4 = r16
            r2 = r21
            goto L211
        L365:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
        L36b:
            r19 = r1
            r21 = r2
            r6 = r5
        L370:
            if (r12 == 0) goto L377
            long r2 = kotlin.time.Duration.m1532unaryMinusUwyO8pc(r7)
            goto L378
        L377:
            r2 = r7
        L378:
            return r2
        L379:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
        L37f:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r13)
            throw r0
        L385:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "The string is empty"
            r0.<init>(r1)
            throw r0
    }

    private static final long parseOverLongIsoComponent(java.lang.String r14) {
            int r0 = r14.length()
            r1 = 0
            r2 = 0
            r3 = 2
            r4 = 0
            if (r0 <= 0) goto L1a
            java.lang.String r5 = "+-"
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            char r6 = r14.charAt(r4)
            boolean r5 = kotlin.text.StringsKt.contains$default(r5, r6, r4, r3, r2)
            if (r5 == 0) goto L1a
            int r1 = r1 + 1
        L1a:
            int r5 = r0 - r1
            r6 = 16
            r7 = 1
            if (r5 <= r6) goto L79
            kotlin.ranges.IntRange r5 = new kotlin.ranges.IntRange
            r6 = r14
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            int r6 = kotlin.text.StringsKt.getLastIndex(r6)
            r5.<init>(r1, r6)
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            r6 = 0
            boolean r8 = r5 instanceof java.util.Collection
            if (r8 == 0) goto L3f
            r8 = r5
            java.util.Collection r8 = (java.util.Collection) r8
            boolean r8 = r8.isEmpty()
            if (r8 == 0) goto L3f
            r5 = r7
            goto L66
        L3f:
            java.util.Iterator r8 = r5.iterator()
        L43:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L65
            r9 = r8
            kotlin.collections.IntIterator r9 = (kotlin.collections.IntIterator) r9
            int r9 = r9.nextInt()
            r10 = r9
            r11 = 0
            char r12 = r14.charAt(r10)
            r13 = 48
            if (r13 > r12) goto L60
            r13 = 58
            if (r12 >= r13) goto L60
            r10 = r7
            goto L61
        L60:
            r10 = r4
        L61:
            if (r10 != 0) goto L43
            r5 = r4
            goto L66
        L65:
            r5 = r7
        L66:
            if (r5 == 0) goto L79
            char r2 = r14.charAt(r4)
            r3 = 45
            if (r2 != r3) goto L73
            r2 = -9223372036854775808
            goto L78
        L73:
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L78:
            return r2
        L79:
            java.lang.String r5 = "+"
            boolean r2 = kotlin.text.StringsKt.startsWith$default(r14, r5, r4, r3, r2)
            if (r2 == 0) goto L8a
            java.lang.String r2 = kotlin.text.StringsKt.drop(r14, r7)
            long r2 = java.lang.Long.parseLong(r2)
            goto L8e
        L8a:
            long r2 = java.lang.Long.parseLong(r14)
        L8e:
            return r2
    }

    private static final int skipWhile(java.lang.String r3, int r4, kotlin.jvm.functions.Function1<? super java.lang.Character, java.lang.Boolean> r5) {
            r0 = 0
            r1 = r4
        L2:
            int r2 = r3.length()
            if (r1 >= r2) goto L1f
            char r2 = r3.charAt(r1)
            java.lang.Character r2 = java.lang.Character.valueOf(r2)
            java.lang.Object r2 = r5.invoke(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L1f
            int r1 = r1 + 1
            goto L2
        L1f:
            return r1
    }

    private static final java.lang.String substringWhile(java.lang.String r5, int r6, kotlin.jvm.functions.Function1<? super java.lang.Character, java.lang.Boolean> r7) {
            r0 = 0
            r1 = r5
            r2 = 0
            r3 = r6
        L4:
            int r4 = r1.length()
            if (r3 >= r4) goto L21
            char r4 = r1.charAt(r3)
            java.lang.Character r4 = java.lang.Character.valueOf(r4)
            java.lang.Object r4 = r7.invoke(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L21
            int r3 = r3 + 1
            goto L4
        L21:
            java.lang.String r1 = "null cannot be cast to non-null type java.lang.String"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r5, r1)
            java.lang.String r1 = r5.substring(r6, r3)
            java.lang.String r2 = "substring(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            return r1
    }

    /* JADX INFO: renamed from: times-kIfJnKk, reason: not valid java name */
    private static final long m1605timeskIfJnKk(double r2, long r4) {
            long r0 = kotlin.time.Duration.m1516timesUwyO8pc(r4, r2)
            return r0
    }

    /* JADX INFO: renamed from: times-mvk6XK0, reason: not valid java name */
    private static final long m1606timesmvk6XK0(int r2, long r3) {
            long r0 = kotlin.time.Duration.m1517timesUwyO8pc(r3, r2)
            return r0
    }

    public static final long toDuration(double r8, kotlin.time.DurationUnit r10) {
            java.lang.String r0 = "unit"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.NANOSECONDS
            double r0 = kotlin.time.DurationUnitKt.convertDurationUnit(r8, r10, r0)
            boolean r2 = java.lang.Double.isNaN(r0)
            if (r2 != 0) goto L40
            long r2 = kotlin.math.MathKt.roundToLong(r0)
            r4 = -4611686018426999999(0xc00000000005eb41, double:-2.0000000001722644)
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            r5 = 0
            if (r4 > 0) goto L29
            r6 = 4611686018427000000(0x3ffffffffffa14c0, double:1.999999999913868)
            int r4 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r4 >= 0) goto L29
            r5 = 1
        L29:
            if (r5 == 0) goto L30
            long r4 = durationOfNanos(r2)
            goto L3f
        L30:
            kotlin.time.DurationUnit r4 = kotlin.time.DurationUnit.MILLISECONDS
            double r4 = kotlin.time.DurationUnitKt.convertDurationUnit(r8, r10, r4)
            long r4 = kotlin.math.MathKt.roundToLong(r4)
            long r6 = durationOfMillisNormalized(r4)
            r4 = r6
        L3f:
            return r4
        L40:
            r2 = 0
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Duration value cannot be NaN."
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
    }

    public static final long toDuration(int r3, kotlin.time.DurationUnit r4) {
            java.lang.String r0 = "unit"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.SECONDS
            java.lang.Enum r0 = (java.lang.Enum) r0
            int r0 = r4.compareTo(r0)
            if (r0 > 0) goto L1b
            long r0 = (long) r3
            kotlin.time.DurationUnit r2 = kotlin.time.DurationUnit.NANOSECONDS
            long r0 = kotlin.time.DurationUnitKt.convertDurationUnitOverflow(r0, r4, r2)
            long r0 = durationOfNanos(r0)
            goto L20
        L1b:
            long r0 = (long) r3
            long r0 = toDuration(r0, r4)
        L20:
            return r0
    }

    public static final long toDuration(long r9, kotlin.time.DurationUnit r11) {
            java.lang.String r0 = "unit"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            r0 = 4611686018426999999(0x3ffffffffffa14bf, double:1.9999999999138678)
            kotlin.time.DurationUnit r2 = kotlin.time.DurationUnit.NANOSECONDS
            long r0 = kotlin.time.DurationUnitKt.convertDurationUnitOverflow(r0, r2, r11)
            long r2 = -r0
            int r2 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            r3 = 0
            if (r2 > 0) goto L1b
            int r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r2 > 0) goto L1b
            r3 = 1
        L1b:
            if (r3 == 0) goto L28
            kotlin.time.DurationUnit r2 = kotlin.time.DurationUnit.NANOSECONDS
            long r2 = kotlin.time.DurationUnitKt.convertDurationUnitOverflow(r9, r11, r2)
            long r2 = durationOfNanos(r2)
            return r2
        L28:
            kotlin.time.DurationUnit r2 = kotlin.time.DurationUnit.MILLISECONDS
            long r3 = kotlin.time.DurationUnitKt.convertDurationUnit(r9, r11, r2)
            r5 = -4611686018427387903(0xc000000000000001, double:-2.0000000000000004)
            r7 = 4611686018427387903(0x3fffffffffffffff, double:1.9999999999999998)
            long r5 = kotlin.ranges.RangesKt.coerceIn(r3, r5, r7)
            long r5 = durationOfMillis(r5)
            return r5
    }
}
