package androidx.core.telephony;

/* JADX INFO: loaded from: classes.dex */
public class TelephonyManagerCompat {
    private static java.lang.reflect.Method sGetDeviceIdMethod;
    private static java.lang.reflect.Method sGetSubIdMethod;

    private static class Api23Impl {
        private Api23Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static java.lang.String getDeviceId(android.telephony.TelephonyManager r1, int r2) {
                java.lang.String r0 = r1.getDeviceId(r2)
                return r0
        }
    }

    private static class Api26Impl {
        private Api26Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static java.lang.String getImei(android.telephony.TelephonyManager r1) {
                java.lang.String r0 = r1.getImei()
                return r0
        }
    }

    private static class Api30Impl {
        private Api30Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static int getSubscriptionId(android.telephony.TelephonyManager r1) {
                int r0 = r1.getSubscriptionId()
                return r0
        }
    }

    private TelephonyManagerCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String getImei(android.telephony.TelephonyManager r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto Lb
            java.lang.String r0 = androidx.core.telephony.TelephonyManagerCompat.Api26Impl.getImei(r3)
            return r0
        Lb:
            int r0 = getSubscriptionId(r3)
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r0 == r1) goto L22
            r1 = -1
            if (r0 == r1) goto L22
            int r1 = androidx.core.telephony.SubscriptionManagerCompat.getSlotIndex(r0)
            java.lang.String r2 = androidx.core.telephony.TelephonyManagerCompat.Api23Impl.getDeviceId(r3, r1)
            return r2
        L22:
            java.lang.String r0 = r3.getDeviceId()
            return r0
    }

    public static int getSubscriptionId(android.telephony.TelephonyManager r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto Lb
            int r0 = androidx.core.telephony.TelephonyManagerCompat.Api30Impl.getSubscriptionId(r4)
            return r0
        Lb:
            java.lang.reflect.Method r0 = androidx.core.telephony.TelephonyManagerCompat.sGetSubIdMethod     // Catch: java.lang.NoSuchMethodException -> L3b java.lang.IllegalAccessException -> L3d java.lang.reflect.InvocationTargetException -> L3f
            r1 = 0
            if (r0 != 0) goto L23
            java.lang.Class<android.telephony.TelephonyManager> r0 = android.telephony.TelephonyManager.class
            java.lang.String r2 = "getSubId"
            java.lang.Class[] r3 = new java.lang.Class[r1]     // Catch: java.lang.NoSuchMethodException -> L3b java.lang.IllegalAccessException -> L3d java.lang.reflect.InvocationTargetException -> L3f
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r2, r3)     // Catch: java.lang.NoSuchMethodException -> L3b java.lang.IllegalAccessException -> L3d java.lang.reflect.InvocationTargetException -> L3f
            androidx.core.telephony.TelephonyManagerCompat.sGetSubIdMethod = r0     // Catch: java.lang.NoSuchMethodException -> L3b java.lang.IllegalAccessException -> L3d java.lang.reflect.InvocationTargetException -> L3f
            java.lang.reflect.Method r0 = androidx.core.telephony.TelephonyManagerCompat.sGetSubIdMethod     // Catch: java.lang.NoSuchMethodException -> L3b java.lang.IllegalAccessException -> L3d java.lang.reflect.InvocationTargetException -> L3f
            r2 = 1
            r0.setAccessible(r2)     // Catch: java.lang.NoSuchMethodException -> L3b java.lang.IllegalAccessException -> L3d java.lang.reflect.InvocationTargetException -> L3f
        L23:
            java.lang.reflect.Method r0 = androidx.core.telephony.TelephonyManagerCompat.sGetSubIdMethod     // Catch: java.lang.NoSuchMethodException -> L3b java.lang.IllegalAccessException -> L3d java.lang.reflect.InvocationTargetException -> L3f
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.NoSuchMethodException -> L3b java.lang.IllegalAccessException -> L3d java.lang.reflect.InvocationTargetException -> L3f
            java.lang.Object r0 = r0.invoke(r4, r1)     // Catch: java.lang.NoSuchMethodException -> L3b java.lang.IllegalAccessException -> L3d java.lang.reflect.InvocationTargetException -> L3f
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.NoSuchMethodException -> L3b java.lang.IllegalAccessException -> L3d java.lang.reflect.InvocationTargetException -> L3f
            if (r0 == 0) goto L40
            int r1 = r0.intValue()     // Catch: java.lang.NoSuchMethodException -> L3b java.lang.IllegalAccessException -> L3d java.lang.reflect.InvocationTargetException -> L3f
            r2 = -1
            if (r1 == r2) goto L40
            int r1 = r0.intValue()     // Catch: java.lang.NoSuchMethodException -> L3b java.lang.IllegalAccessException -> L3d java.lang.reflect.InvocationTargetException -> L3f
            return r1
        L3b:
            r0 = move-exception
            goto L41
        L3d:
            r0 = move-exception
            goto L40
        L3f:
            r0 = move-exception
        L40:
        L41:
            r0 = 2147483647(0x7fffffff, float:NaN)
            return r0
    }
}
