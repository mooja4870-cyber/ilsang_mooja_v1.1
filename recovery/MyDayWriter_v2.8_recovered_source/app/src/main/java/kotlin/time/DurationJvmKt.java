package kotlin.time;

/* JADX INFO: compiled from: DurationJvm.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\u001a\u0010\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bH\u0002\u001a\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000bH\u0000\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u001c\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\b¨\u0006\u0010"}, d2 = {"durationAssertionsEnabled", "", "getDurationAssertionsEnabled", "()Z", "precisionFormats", "", "Ljava/lang/ThreadLocal;", "Ljava/text/DecimalFormat;", "[Ljava/lang/ThreadLocal;", "createFormatForDecimals", "decimals", "", "formatToExactDecimals", "", "value", "", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class DurationJvmKt {
    private static final boolean durationAssertionsEnabled = false;
    private static final java.lang.ThreadLocal<java.text.DecimalFormat>[] precisionFormats = null;

    static {
            java.lang.Class<kotlin.time.Duration> r0 = kotlin.time.Duration.class
            r0 = 0
            kotlin.time.DurationJvmKt.durationAssertionsEnabled = r0
            r1 = 4
            java.lang.ThreadLocal[] r2 = new java.lang.ThreadLocal[r1]
        L8:
            if (r0 >= r1) goto L14
            java.lang.ThreadLocal r3 = new java.lang.ThreadLocal
            r3.<init>()
            r2[r0] = r3
            int r0 = r0 + 1
            goto L8
        L14:
            kotlin.time.DurationJvmKt.precisionFormats = r2
            return
    }

    private static final java.text.DecimalFormat createFormatForDecimals(int r4) {
            java.text.DecimalFormat r0 = new java.text.DecimalFormat
            java.lang.String r1 = "0"
            r0.<init>(r1)
            r1 = r0
            r2 = 0
            if (r4 <= 0) goto Le
            r1.setMinimumFractionDigits(r4)
        Le:
            java.math.RoundingMode r3 = java.math.RoundingMode.HALF_UP
            r1.setRoundingMode(r3)
            return r0
    }

    public static final java.lang.String formatToExactDecimals(double r3, int r5) {
            java.lang.ThreadLocal<java.text.DecimalFormat>[] r0 = kotlin.time.DurationJvmKt.precisionFormats
            int r0 = r0.length
            if (r5 >= r0) goto L1e
            java.lang.ThreadLocal<java.text.DecimalFormat>[] r0 = kotlin.time.DurationJvmKt.precisionFormats
            r0 = r0[r5]
            java.lang.Object r1 = r0.get()
            if (r1 != 0) goto L18
            r1 = 0
            java.text.DecimalFormat r1 = createFormatForDecimals(r5)
            r0.set(r1)
            goto L1b
        L18:
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
        L1b:
            java.text.DecimalFormat r1 = (java.text.DecimalFormat) r1
            goto L22
        L1e:
            java.text.DecimalFormat r1 = createFormatForDecimals(r5)
        L22:
            java.lang.String r0 = r1.format(r3)
            java.lang.String r2 = "format(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)
            return r0
    }

    public static final boolean getDurationAssertionsEnabled() {
            boolean r0 = kotlin.time.DurationJvmKt.durationAssertionsEnabled
            return r0
    }
}
