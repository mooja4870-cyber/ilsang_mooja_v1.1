package kotlin.time;

/* JADX INFO: compiled from: DurationUnit.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0001\u001a\u0010\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\bH\u0001\u001a\f\u0010\u0007\u001a\u00020\b*\u00020\u0001H\u0001¨\u0006\t"}, d2 = {"durationUnitByIsoChar", "Lkotlin/time/DurationUnit;", "isoChar", "", "isTimeComponent", "", "durationUnitByShortName", "shortName", "", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/time/DurationUnitKt")
class DurationUnitKt__DurationUnitKt extends kotlin.time.DurationUnitKt__DurationUnitJvmKt {

    /* JADX INFO: compiled from: DurationUnit.kt */
    @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;

        static {
                kotlin.time.DurationUnit[] r0 = kotlin.time.DurationUnit.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                kotlin.time.DurationUnit r1 = kotlin.time.DurationUnit.NANOSECONDS     // Catch: java.lang.NoSuchFieldError -> L11
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L11
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L11
                goto L12
            L11:
                r1 = move-exception
            L12:
                kotlin.time.DurationUnit r1 = kotlin.time.DurationUnit.MICROSECONDS     // Catch: java.lang.NoSuchFieldError -> L1c
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1c
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1c
                goto L1d
            L1c:
                r1 = move-exception
            L1d:
                kotlin.time.DurationUnit r1 = kotlin.time.DurationUnit.MILLISECONDS     // Catch: java.lang.NoSuchFieldError -> L27
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L27
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L27
                goto L28
            L27:
                r1 = move-exception
            L28:
                kotlin.time.DurationUnit r1 = kotlin.time.DurationUnit.SECONDS     // Catch: java.lang.NoSuchFieldError -> L32
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L32
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L32
                goto L33
            L32:
                r1 = move-exception
            L33:
                kotlin.time.DurationUnit r1 = kotlin.time.DurationUnit.MINUTES     // Catch: java.lang.NoSuchFieldError -> L3d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3d
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3d
                goto L3e
            L3d:
                r1 = move-exception
            L3e:
                kotlin.time.DurationUnit r1 = kotlin.time.DurationUnit.HOURS     // Catch: java.lang.NoSuchFieldError -> L48
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L48
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L48
                goto L49
            L48:
                r1 = move-exception
            L49:
                kotlin.time.DurationUnit r1 = kotlin.time.DurationUnit.DAYS     // Catch: java.lang.NoSuchFieldError -> L53
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L53
                r2 = 7
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L53
                goto L54
            L53:
                r1 = move-exception
            L54:
                kotlin.time.DurationUnitKt__DurationUnitKt.WhenMappings.$EnumSwitchMapping$0 = r0
                return
        }
    }

    public DurationUnitKt__DurationUnitKt() {
            r0 = this;
            r0.<init>()
            return
    }

    public static final kotlin.time.DurationUnit durationUnitByIsoChar(char r3, boolean r4) {
            if (r4 != 0) goto L24
        L4:
            r0 = 68
            if (r3 != r0) goto Lb
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.DAYS
            goto L48
        Lb:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Invalid or unsupported duration ISO non-time unit: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L24:
            switch(r3) {
                case 72: goto L46;
                case 77: goto L43;
                case 83: goto L40;
                default: goto L27;
            }
        L27:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Invalid duration ISO time unit: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L40:
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.SECONDS
            goto L48
        L43:
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.MINUTES
            goto L48
        L46:
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.HOURS
        L48:
            return r0
    }

    public static final kotlin.time.DurationUnit durationUnitByShortName(java.lang.String r3) {
            java.lang.String r0 = "shortName"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            int r0 = r3.hashCode()
            switch(r0) {
                case 100: goto L4f;
                case 104: goto L44;
                case 109: goto L39;
                case 115: goto L2e;
                case 3494: goto L23;
                case 3525: goto L18;
                case 3742: goto Ld;
                default: goto Lc;
            }
        Lc:
            goto L5a
        Ld:
            java.lang.String r0 = "us"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto Lc
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.MICROSECONDS
            goto L59
        L18:
            java.lang.String r0 = "ns"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto Lc
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.NANOSECONDS
            goto L59
        L23:
            java.lang.String r0 = "ms"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto Lc
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.MILLISECONDS
            goto L59
        L2e:
            java.lang.String r0 = "s"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto Lc
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.SECONDS
            goto L59
        L39:
            java.lang.String r0 = "m"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto Lc
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.MINUTES
            goto L59
        L44:
            java.lang.String r0 = "h"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto Lc
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.HOURS
            goto L59
        L4f:
            java.lang.String r0 = "d"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto Lc
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.DAYS
        L59:
            return r0
        L5a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unknown duration unit short name: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public static final java.lang.String shortName(kotlin.time.DurationUnit r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            int[] r0 = kotlin.time.DurationUnitKt__DurationUnitKt.WhenMappings.$EnumSwitchMapping$0
            int r1 = r3.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L3f;
                case 2: goto L3c;
                case 3: goto L39;
                case 4: goto L36;
                case 5: goto L33;
                case 6: goto L30;
                case 7: goto L2d;
                default: goto L10;
            }
        L10:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unknown unit: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L2d:
            java.lang.String r0 = "d"
            goto L41
        L30:
            java.lang.String r0 = "h"
            goto L41
        L33:
            java.lang.String r0 = "m"
            goto L41
        L36:
            java.lang.String r0 = "s"
            goto L41
        L39:
            java.lang.String r0 = "ms"
            goto L41
        L3c:
            java.lang.String r0 = "us"
            goto L41
        L3f:
            java.lang.String r0 = "ns"
        L41:
            return r0
    }
}
