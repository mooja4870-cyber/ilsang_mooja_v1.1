package kotlin.time;

/* JADX INFO: compiled from: DurationUnitJvm.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a \u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0001\u001a \u0010\u0000\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0001\u001a \u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0001\u001a\f\u0010\b\u001a\u00020\u0004*\u00020\tH\u0007\u001a\f\u0010\n\u001a\u00020\t*\u00020\u0004H\u0007¨\u0006\u000b"}, d2 = {"convertDurationUnit", "", "value", "sourceUnit", "Lkotlin/time/DurationUnit;", "targetUnit", "", "convertDurationUnitOverflow", "toDurationUnit", "Ljava/util/concurrent/TimeUnit;", "toTimeUnit", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/time/DurationUnitKt")
class DurationUnitKt__DurationUnitJvmKt {

    /* JADX INFO: compiled from: DurationUnitJvm.kt */
    @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;

        static {
                java.util.concurrent.TimeUnit[] r0 = java.util.concurrent.TimeUnit.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch: java.lang.NoSuchFieldError -> L11
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L11
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L11
                goto L12
            L11:
                r1 = move-exception
            L12:
                java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MICROSECONDS     // Catch: java.lang.NoSuchFieldError -> L1c
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1c
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1c
                goto L1d
            L1c:
                r1 = move-exception
            L1d:
                java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.NoSuchFieldError -> L27
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L27
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L27
                goto L28
            L27:
                r1 = move-exception
            L28:
                java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.NoSuchFieldError -> L32
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L32
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L32
                goto L33
            L32:
                r1 = move-exception
            L33:
                java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MINUTES     // Catch: java.lang.NoSuchFieldError -> L3d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3d
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3d
                goto L3e
            L3d:
                r1 = move-exception
            L3e:
                java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.HOURS     // Catch: java.lang.NoSuchFieldError -> L48
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L48
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L48
                goto L49
            L48:
                r1 = move-exception
            L49:
                java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.DAYS     // Catch: java.lang.NoSuchFieldError -> L53
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L53
                r2 = 7
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L53
                goto L54
            L53:
                r1 = move-exception
            L54:
                kotlin.time.DurationUnitKt__DurationUnitJvmKt.WhenMappings.$EnumSwitchMapping$0 = r0
                return
        }
    }

    public DurationUnitKt__DurationUnitJvmKt() {
            r0 = this;
            r0.<init>()
            return
    }

    public static final double convertDurationUnit(double r6, kotlin.time.DurationUnit r8, kotlin.time.DurationUnit r9) {
            java.lang.String r0 = "sourceUnit"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "targetUnit"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.util.concurrent.TimeUnit r0 = r9.getTimeUnit$kotlin_stdlib()
            java.util.concurrent.TimeUnit r1 = r8.getTimeUnit$kotlin_stdlib()
            r2 = 1
            long r0 = r0.convert(r2, r1)
            r4 = 0
            int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r4 <= 0) goto L21
            double r2 = (double) r0
            double r2 = r2 * r6
            return r2
        L21:
            java.util.concurrent.TimeUnit r4 = r8.getTimeUnit$kotlin_stdlib()
            java.util.concurrent.TimeUnit r5 = r9.getTimeUnit$kotlin_stdlib()
            long r2 = r4.convert(r2, r5)
            double r4 = (double) r2
            double r4 = r6 / r4
            return r4
    }

    public static final long convertDurationUnit(long r2, kotlin.time.DurationUnit r4, kotlin.time.DurationUnit r5) {
            java.lang.String r0 = "sourceUnit"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "targetUnit"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.util.concurrent.TimeUnit r0 = r5.getTimeUnit$kotlin_stdlib()
            java.util.concurrent.TimeUnit r1 = r4.getTimeUnit$kotlin_stdlib()
            long r0 = r0.convert(r2, r1)
            return r0
    }

    public static final long convertDurationUnitOverflow(long r2, kotlin.time.DurationUnit r4, kotlin.time.DurationUnit r5) {
            java.lang.String r0 = "sourceUnit"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "targetUnit"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.util.concurrent.TimeUnit r0 = r5.getTimeUnit$kotlin_stdlib()
            java.util.concurrent.TimeUnit r1 = r4.getTimeUnit$kotlin_stdlib()
            long r0 = r0.convert(r2, r1)
            return r0
    }

    public static final kotlin.time.DurationUnit toDurationUnit(java.util.concurrent.TimeUnit r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            int[] r0 = kotlin.time.DurationUnitKt__DurationUnitJvmKt.WhenMappings.$EnumSwitchMapping$0
            int r1 = r2.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L28;
                case 2: goto L25;
                case 3: goto L22;
                case 4: goto L1f;
                case 5: goto L1c;
                case 6: goto L19;
                case 7: goto L16;
                default: goto L10;
            }
        L10:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L16:
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.DAYS
            goto L2a
        L19:
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.HOURS
            goto L2a
        L1c:
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.MINUTES
            goto L2a
        L1f:
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.SECONDS
            goto L2a
        L22:
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.MILLISECONDS
            goto L2a
        L25:
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.MICROSECONDS
            goto L2a
        L28:
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.NANOSECONDS
        L2a:
            return r0
    }

    public static final java.util.concurrent.TimeUnit toTimeUnit(kotlin.time.DurationUnit r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.util.concurrent.TimeUnit r0 = r1.getTimeUnit$kotlin_stdlib()
            return r0
    }
}
