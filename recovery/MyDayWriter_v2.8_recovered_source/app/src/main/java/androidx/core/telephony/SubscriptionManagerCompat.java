package androidx.core.telephony;

/* JADX INFO: loaded from: classes.dex */
public class SubscriptionManagerCompat {
    private static java.lang.reflect.Method sGetSlotIndexMethod;

    private static class Api29Impl {
        private Api29Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static int getSlotIndex(int r1) {
                int r0 = android.telephony.SubscriptionManager.getSlotIndex(r1)
                return r0
        }
    }

    private SubscriptionManagerCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static int getSlotIndex(int r7) {
            r0 = -1
            if (r7 != r0) goto L4
            return r0
        L4:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 29
            if (r1 < r2) goto Lf
            int r0 = androidx.core.telephony.SubscriptionManagerCompat.Api29Impl.getSlotIndex(r7)
            return r0
        Lf:
            java.lang.reflect.Method r1 = androidx.core.telephony.SubscriptionManagerCompat.sGetSlotIndexMethod     // Catch: java.lang.reflect.InvocationTargetException -> L5a java.lang.IllegalAccessException -> L5c java.lang.NoSuchMethodException -> L5e
            if (r1 != 0) goto L41
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.reflect.InvocationTargetException -> L5a java.lang.IllegalAccessException -> L5c java.lang.NoSuchMethodException -> L5e
            r2 = 26
            r3 = 0
            r4 = 1
            if (r1 < r2) goto L2c
            java.lang.Class<android.telephony.SubscriptionManager> r1 = android.telephony.SubscriptionManager.class
            java.lang.String r2 = "getSlotIndex"
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch: java.lang.reflect.InvocationTargetException -> L5a java.lang.IllegalAccessException -> L5c java.lang.NoSuchMethodException -> L5e
            java.lang.Class r6 = java.lang.Integer.TYPE     // Catch: java.lang.reflect.InvocationTargetException -> L5a java.lang.IllegalAccessException -> L5c java.lang.NoSuchMethodException -> L5e
            r5[r3] = r6     // Catch: java.lang.reflect.InvocationTargetException -> L5a java.lang.IllegalAccessException -> L5c java.lang.NoSuchMethodException -> L5e
            java.lang.reflect.Method r1 = r1.getDeclaredMethod(r2, r5)     // Catch: java.lang.reflect.InvocationTargetException -> L5a java.lang.IllegalAccessException -> L5c java.lang.NoSuchMethodException -> L5e
            androidx.core.telephony.SubscriptionManagerCompat.sGetSlotIndexMethod = r1     // Catch: java.lang.reflect.InvocationTargetException -> L5a java.lang.IllegalAccessException -> L5c java.lang.NoSuchMethodException -> L5e
            goto L3c
        L2c:
            java.lang.Class<android.telephony.SubscriptionManager> r1 = android.telephony.SubscriptionManager.class
            java.lang.String r2 = "getSlotId"
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch: java.lang.reflect.InvocationTargetException -> L5a java.lang.IllegalAccessException -> L5c java.lang.NoSuchMethodException -> L5e
            java.lang.Class r6 = java.lang.Integer.TYPE     // Catch: java.lang.reflect.InvocationTargetException -> L5a java.lang.IllegalAccessException -> L5c java.lang.NoSuchMethodException -> L5e
            r5[r3] = r6     // Catch: java.lang.reflect.InvocationTargetException -> L5a java.lang.IllegalAccessException -> L5c java.lang.NoSuchMethodException -> L5e
            java.lang.reflect.Method r1 = r1.getDeclaredMethod(r2, r5)     // Catch: java.lang.reflect.InvocationTargetException -> L5a java.lang.IllegalAccessException -> L5c java.lang.NoSuchMethodException -> L5e
            androidx.core.telephony.SubscriptionManagerCompat.sGetSlotIndexMethod = r1     // Catch: java.lang.reflect.InvocationTargetException -> L5a java.lang.IllegalAccessException -> L5c java.lang.NoSuchMethodException -> L5e
        L3c:
            java.lang.reflect.Method r1 = androidx.core.telephony.SubscriptionManagerCompat.sGetSlotIndexMethod     // Catch: java.lang.reflect.InvocationTargetException -> L5a java.lang.IllegalAccessException -> L5c java.lang.NoSuchMethodException -> L5e
            r1.setAccessible(r4)     // Catch: java.lang.reflect.InvocationTargetException -> L5a java.lang.IllegalAccessException -> L5c java.lang.NoSuchMethodException -> L5e
        L41:
            java.lang.reflect.Method r1 = androidx.core.telephony.SubscriptionManagerCompat.sGetSlotIndexMethod     // Catch: java.lang.reflect.InvocationTargetException -> L5a java.lang.IllegalAccessException -> L5c java.lang.NoSuchMethodException -> L5e
            java.lang.Integer r2 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.reflect.InvocationTargetException -> L5a java.lang.IllegalAccessException -> L5c java.lang.NoSuchMethodException -> L5e
            java.lang.Object[] r2 = new java.lang.Object[]{r2}     // Catch: java.lang.reflect.InvocationTargetException -> L5a java.lang.IllegalAccessException -> L5c java.lang.NoSuchMethodException -> L5e
            r3 = 0
            java.lang.Object r1 = r1.invoke(r3, r2)     // Catch: java.lang.reflect.InvocationTargetException -> L5a java.lang.IllegalAccessException -> L5c java.lang.NoSuchMethodException -> L5e
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.reflect.InvocationTargetException -> L5a java.lang.IllegalAccessException -> L5c java.lang.NoSuchMethodException -> L5e
            if (r1 == 0) goto L59
            int r0 = r1.intValue()     // Catch: java.lang.reflect.InvocationTargetException -> L5a java.lang.IllegalAccessException -> L5c java.lang.NoSuchMethodException -> L5e
            return r0
        L59:
            goto L5f
        L5a:
            r1 = move-exception
            goto L60
        L5c:
            r1 = move-exception
            goto L5f
        L5e:
            r1 = move-exception
        L5f:
        L60:
            return r0
    }
}
