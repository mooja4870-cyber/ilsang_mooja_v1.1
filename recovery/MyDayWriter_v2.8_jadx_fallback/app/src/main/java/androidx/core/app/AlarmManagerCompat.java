package androidx.core.app;

/* JADX INFO: loaded from: classes.dex */
public final class AlarmManagerCompat {

    static class Api21Impl {
        private Api21Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static android.app.AlarmManager.AlarmClockInfo createAlarmClockInfo(long r1, android.app.PendingIntent r3) {
                android.app.AlarmManager$AlarmClockInfo r0 = new android.app.AlarmManager$AlarmClockInfo
                r0.<init>(r1, r3)
                return r0
        }

        static void setAlarmClock(android.app.AlarmManager r1, java.lang.Object r2, android.app.PendingIntent r3) {
                r0 = r2
                android.app.AlarmManager$AlarmClockInfo r0 = (android.app.AlarmManager.AlarmClockInfo) r0
                r1.setAlarmClock(r0, r3)
                return
        }
    }

    static class Api23Impl {
        private Api23Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static void setAndAllowWhileIdle(android.app.AlarmManager r0, int r1, long r2, android.app.PendingIntent r4) {
                r0.setAndAllowWhileIdle(r1, r2, r4)
                return
        }

        static void setExactAndAllowWhileIdle(android.app.AlarmManager r0, int r1, long r2, android.app.PendingIntent r4) {
                r0.setExactAndAllowWhileIdle(r1, r2, r4)
                return
        }
    }

    static class Api31Impl {
        private Api31Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static boolean canScheduleExactAlarms(android.app.AlarmManager r1) {
                boolean r0 = r1.canScheduleExactAlarms()
                return r0
        }
    }

    private AlarmManagerCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean canScheduleExactAlarms(android.app.AlarmManager r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r0 < r1) goto Lb
            boolean r0 = androidx.core.app.AlarmManagerCompat.Api31Impl.canScheduleExactAlarms(r2)
            return r0
        Lb:
            r0 = 1
            return r0
    }

    public static void setAlarmClock(android.app.AlarmManager r1, long r2, android.app.PendingIntent r4, android.app.PendingIntent r5) {
            android.app.AlarmManager$AlarmClockInfo r0 = androidx.core.app.AlarmManagerCompat.Api21Impl.createAlarmClockInfo(r2, r4)
            androidx.core.app.AlarmManagerCompat.Api21Impl.setAlarmClock(r1, r0, r5)
            return
    }

    public static void setAndAllowWhileIdle(android.app.AlarmManager r0, int r1, long r2, android.app.PendingIntent r4) {
            androidx.core.app.AlarmManagerCompat.Api23Impl.setAndAllowWhileIdle(r0, r1, r2, r4)
            return
    }

    @androidx.annotation.ReplaceWith(expression = "alarmManager.setExact(type, triggerAtMillis, operation)")
    @java.lang.Deprecated
    public static void setExact(android.app.AlarmManager r0, int r1, long r2, android.app.PendingIntent r4) {
            r0.setExact(r1, r2, r4)
            return
    }

    public static void setExactAndAllowWhileIdle(android.app.AlarmManager r0, int r1, long r2, android.app.PendingIntent r4) {
            androidx.core.app.AlarmManagerCompat.Api23Impl.setExactAndAllowWhileIdle(r0, r1, r2, r4)
            return
    }
}
