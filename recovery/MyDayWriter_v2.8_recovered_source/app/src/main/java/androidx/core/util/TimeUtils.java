package androidx.core.util;

/* JADX INFO: loaded from: classes.dex */
public final class TimeUtils {
    public static final int HUNDRED_DAY_FIELD_LEN = 19;
    private static final int SECONDS_PER_DAY = 86400;
    private static final int SECONDS_PER_HOUR = 3600;
    private static final int SECONDS_PER_MINUTE = 60;
    private static char[] sFormatStr;
    private static final java.lang.Object sFormatSync = null;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            androidx.core.util.TimeUtils.sFormatSync = r0
            r0 = 24
            char[] r0 = new char[r0]
            androidx.core.util.TimeUtils.sFormatStr = r0
            return
    }

    private TimeUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    private static int accumField(int r1, int r2, boolean r3, int r4) {
            r0 = 99
            if (r1 > r0) goto L21
            if (r3 == 0) goto La
            r0 = 3
            if (r4 < r0) goto La
            goto L21
        La:
            r0 = 9
            if (r1 > r0) goto L1e
            if (r3 == 0) goto L14
            r0 = 2
            if (r4 < r0) goto L14
            goto L1e
        L14:
            if (r3 != 0) goto L1b
            if (r1 <= 0) goto L19
            goto L1b
        L19:
            r0 = 0
            return r0
        L1b:
            int r0 = r2 + 1
            return r0
        L1e:
            int r0 = r2 + 2
            return r0
        L21:
            int r0 = r2 + 3
            return r0
    }

    public static void formatDuration(long r3, long r5, java.io.PrintWriter r7) {
            r0 = 0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 != 0) goto Lc
            java.lang.String r0 = "--"
            r7.print(r0)
            return
        Lc:
            long r0 = r3 - r5
            r2 = 0
            formatDuration(r0, r7, r2)
            return
    }

    public static void formatDuration(long r1, java.io.PrintWriter r3) {
            r0 = 0
            formatDuration(r1, r3, r0)
            return
    }

    public static void formatDuration(long r5, java.io.PrintWriter r7, int r8) {
            java.lang.Object r0 = androidx.core.util.TimeUtils.sFormatSync
            monitor-enter(r0)
            int r1 = formatDurationLocked(r5, r8)     // Catch: java.lang.Throwable -> L14
            java.lang.String r2 = new java.lang.String     // Catch: java.lang.Throwable -> L14
            char[] r3 = androidx.core.util.TimeUtils.sFormatStr     // Catch: java.lang.Throwable -> L14
            r4 = 0
            r2.<init>(r3, r4, r1)     // Catch: java.lang.Throwable -> L14
            r7.print(r2)     // Catch: java.lang.Throwable -> L14
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            return
        L14:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            throw r1
    }

    public static void formatDuration(long r4, java.lang.StringBuilder r6) {
            java.lang.Object r0 = androidx.core.util.TimeUtils.sFormatSync
            monitor-enter(r0)
            r1 = 0
            int r2 = formatDurationLocked(r4, r1)     // Catch: java.lang.Throwable -> L10
            char[] r3 = androidx.core.util.TimeUtils.sFormatStr     // Catch: java.lang.Throwable -> L10
            r6.append(r3, r1, r2)     // Catch: java.lang.Throwable -> L10
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            return
        L10:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            throw r1
    }

    private static int formatDurationLocked(long r20, int r22) {
            r0 = r20
            r2 = r22
            char[] r3 = androidx.core.util.TimeUtils.sFormatStr
            int r3 = r3.length
            if (r3 >= r2) goto Ld
            char[] r3 = new char[r2]
            androidx.core.util.TimeUtils.sFormatStr = r3
        Ld:
            char[] r4 = androidx.core.util.TimeUtils.sFormatStr
            r5 = 0
            int r3 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            r7 = 32
            if (r3 != 0) goto L26
            r3 = 0
            int r2 = r2 + (-1)
        L1a:
            if (r3 >= r2) goto L1f
            r4[r3] = r7
            goto L1a
        L1f:
            r5 = 48
            r4[r3] = r5
            int r5 = r3 + 1
            return r5
        L26:
            int r3 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r3 <= 0) goto L2d
            r3 = 43
            goto L30
        L2d:
            r3 = 45
            long r0 = -r0
        L30:
            r5 = 1000(0x3e8, double:4.94E-321)
            long r8 = r0 % r5
            int r10 = (int) r8
            long r5 = r0 / r5
            double r5 = (double) r5
            double r5 = java.lang.Math.floor(r5)
            int r5 = (int) r5
            r6 = 0
            r8 = 0
            r9 = 0
            r11 = 86400(0x15180, float:1.21072E-40)
            if (r5 <= r11) goto L49
            int r6 = r5 / r11
            int r11 = r11 * r6
            int r5 = r5 - r11
        L49:
            r11 = 3600(0xe10, float:5.045E-42)
            if (r5 <= r11) goto L54
            int r8 = r5 / 3600
            int r11 = r8 * 3600
            int r5 = r5 - r11
            r11 = r8
            goto L55
        L54:
            r11 = r8
        L55:
            r8 = 60
            if (r5 <= r8) goto L61
            int r9 = r5 / 60
            int r8 = r9 * 60
            int r5 = r5 - r8
            r12 = r5
            r13 = r9
            goto L63
        L61:
            r12 = r5
            r13 = r9
        L63:
            r5 = 0
            r15 = 2
            r8 = 0
            r9 = 1
            if (r2 == 0) goto La7
            int r16 = accumField(r6, r9, r8, r8)
            r17 = r7
            if (r16 <= 0) goto L73
            r7 = r9
            goto L74
        L73:
            r7 = r8
        L74:
            int r7 = accumField(r11, r9, r7, r15)
            int r16 = r16 + r7
            if (r16 <= 0) goto L7e
            r7 = r9
            goto L7f
        L7e:
            r7 = r8
        L7f:
            int r7 = accumField(r13, r9, r7, r15)
            int r16 = r16 + r7
            if (r16 <= 0) goto L89
            r7 = r9
            goto L8a
        L89:
            r7 = r8
        L8a:
            int r7 = accumField(r12, r9, r7, r15)
            int r16 = r16 + r7
            if (r16 <= 0) goto L94
            r7 = 3
            goto L95
        L94:
            r7 = r8
        L95:
            int r7 = accumField(r10, r15, r9, r7)
            int r7 = r7 + r9
            int r16 = r16 + r7
            r7 = r16
        L9e:
            if (r7 >= r2) goto La7
            r4[r5] = r17
            int r5 = r5 + 1
            int r7 = r7 + 1
            goto L9e
        La7:
            r4[r5] = r3
            int r7 = r5 + 1
            r5 = r7
            if (r2 == 0) goto Lb1
            r16 = r9
            goto Lb3
        Lb1:
            r16 = r8
        Lb3:
            r17 = r8
            r8 = 0
            r18 = r9
            r9 = 0
            r19 = r5
            r5 = r6
            r6 = 100
            r14 = r19
            int r7 = printField(r4, r5, r6, r7, r8, r9)
            r19 = r5
            if (r7 == r14) goto Lcb
            r8 = r18
            goto Lcd
        Lcb:
            r8 = r17
        Lcd:
            if (r16 == 0) goto Ld1
            r9 = r15
            goto Ld3
        Ld1:
            r9 = r17
        Ld3:
            r6 = 104(0x68, float:1.46E-43)
            r5 = r11
            int r7 = printField(r4, r5, r6, r7, r8, r9)
            if (r7 == r14) goto Ldf
            r8 = r18
            goto Le1
        Ldf:
            r8 = r17
        Le1:
            if (r16 == 0) goto Le5
            r9 = r15
            goto Le7
        Le5:
            r9 = r17
        Le7:
            r6 = 109(0x6d, float:1.53E-43)
            r5 = r13
            int r7 = printField(r4, r5, r6, r7, r8, r9)
            if (r7 == r14) goto Lf3
            r8 = r18
            goto Lf5
        Lf3:
            r8 = r17
        Lf5:
            if (r16 == 0) goto Lf9
            r9 = r15
            goto Lfb
        Lf9:
            r9 = r17
        Lfb:
            r6 = 115(0x73, float:1.61E-43)
            r5 = r12
            int r7 = printField(r4, r5, r6, r7, r8, r9)
            if (r16 == 0) goto L108
            if (r7 == r14) goto L108
            r9 = 3
            goto L10a
        L108:
            r9 = r17
        L10a:
            r6 = 109(0x6d, float:1.53E-43)
            r8 = 1
            r5 = r10
            int r6 = printField(r4, r5, r6, r7, r8, r9)
            r7 = 115(0x73, float:1.61E-43)
            r4[r6] = r7
            int r7 = r6 + 1
            return r7
    }

    private static int printField(char[] r3, int r4, char r5, int r6, boolean r7, int r8) {
            if (r7 != 0) goto L4
            if (r4 <= 0) goto L3c
        L4:
            r0 = r6
            if (r7 == 0) goto La
            r1 = 3
            if (r8 >= r1) goto Le
        La:
            r1 = 99
            if (r4 <= r1) goto L1a
        Le:
            int r1 = r4 / 100
            int r2 = r1 + 48
            char r2 = (char) r2
            r3[r6] = r2
            int r6 = r6 + 1
            int r2 = r1 * 100
            int r4 = r4 - r2
        L1a:
            if (r7 == 0) goto L1f
            r1 = 2
            if (r8 >= r1) goto L25
        L1f:
            r1 = 9
            if (r4 > r1) goto L25
            if (r0 == r6) goto L31
        L25:
            int r1 = r4 / 10
            int r2 = r1 + 48
            char r2 = (char) r2
            r3[r6] = r2
            int r6 = r6 + 1
            int r2 = r1 * 10
            int r4 = r4 - r2
        L31:
            int r1 = r4 + 48
            char r1 = (char) r1
            r3[r6] = r1
            int r6 = r6 + 1
            r3[r6] = r5
            int r6 = r6 + 1
        L3c:
            return r6
    }
}
