package androidx.core.text;

/* JADX INFO: loaded from: classes.dex */
public final class ICUCompat {
    private static final java.lang.String TAG = "ICUCompat";
    private static java.lang.reflect.Method sAddLikelySubtagsMethod;
    private static java.lang.reflect.Method sGetScriptMethod;

    static class Api21Impl {
        private Api21Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static java.lang.String getScript(java.util.Locale r1) {
                java.lang.String r0 = r1.getScript()
                return r0
        }
    }

    static class Api24Impl {
        private Api24Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static android.icu.util.ULocale addLikelySubtags(java.lang.Object r1) {
                r0 = r1
                android.icu.util.ULocale r0 = (android.icu.util.ULocale) r0
                android.icu.util.ULocale r0 = android.icu.util.ULocale.addLikelySubtags(r0)
                return r0
        }

        static android.icu.util.ULocale forLocale(java.util.Locale r1) {
                android.icu.util.ULocale r0 = android.icu.util.ULocale.forLocale(r1)
                return r0
        }

        static java.lang.String getScript(java.lang.Object r1) {
                r0 = r1
                android.icu.util.ULocale r0 = (android.icu.util.ULocale) r0
                java.lang.String r0 = r0.getScript()
                return r0
        }
    }

    static {
            return
    }

    private ICUCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    private static java.lang.String addLikelySubtagsBelowApi21(java.util.Locale r5) {
            java.lang.String r0 = "ICUCompat"
            java.lang.String r1 = r5.toString()
            java.lang.reflect.Method r2 = androidx.core.text.ICUCompat.sAddLikelySubtagsMethod     // Catch: java.lang.reflect.InvocationTargetException -> L18 java.lang.IllegalAccessException -> L1d
            if (r2 == 0) goto L21
            java.lang.Object[] r2 = new java.lang.Object[]{r1}     // Catch: java.lang.reflect.InvocationTargetException -> L18 java.lang.IllegalAccessException -> L1d
            java.lang.reflect.Method r3 = androidx.core.text.ICUCompat.sAddLikelySubtagsMethod     // Catch: java.lang.reflect.InvocationTargetException -> L18 java.lang.IllegalAccessException -> L1d
            r4 = 0
            java.lang.Object r3 = r3.invoke(r4, r2)     // Catch: java.lang.reflect.InvocationTargetException -> L18 java.lang.IllegalAccessException -> L1d
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.reflect.InvocationTargetException -> L18 java.lang.IllegalAccessException -> L1d
            return r3
        L18:
            r2 = move-exception
            android.util.Log.w(r0, r2)
            goto L22
        L1d:
            r2 = move-exception
            android.util.Log.w(r0, r2)
        L21:
        L22:
            return r1
    }

    private static java.lang.String getScriptBelowApi21(java.lang.String r4) {
            java.lang.String r0 = "ICUCompat"
            r1 = 0
            java.lang.reflect.Method r2 = androidx.core.text.ICUCompat.sGetScriptMethod     // Catch: java.lang.reflect.InvocationTargetException -> L14 java.lang.IllegalAccessException -> L19
            if (r2 == 0) goto L1d
            java.lang.Object[] r2 = new java.lang.Object[]{r4}     // Catch: java.lang.reflect.InvocationTargetException -> L14 java.lang.IllegalAccessException -> L19
            java.lang.reflect.Method r3 = androidx.core.text.ICUCompat.sGetScriptMethod     // Catch: java.lang.reflect.InvocationTargetException -> L14 java.lang.IllegalAccessException -> L19
            java.lang.Object r3 = r3.invoke(r1, r2)     // Catch: java.lang.reflect.InvocationTargetException -> L14 java.lang.IllegalAccessException -> L19
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.reflect.InvocationTargetException -> L14 java.lang.IllegalAccessException -> L19
            return r3
        L14:
            r2 = move-exception
            android.util.Log.w(r0, r2)
            goto L1e
        L19:
            r2 = move-exception
            android.util.Log.w(r0, r2)
        L1d:
        L1e:
            return r1
    }

    public static java.lang.String maximizeAndGetScript(java.util.Locale r2) {
            android.icu.util.ULocale r0 = androidx.core.text.ICUCompat.Api24Impl.forLocale(r2)
            android.icu.util.ULocale r0 = androidx.core.text.ICUCompat.Api24Impl.addLikelySubtags(r0)
            java.lang.String r1 = androidx.core.text.ICUCompat.Api24Impl.getScript(r0)
            return r1
    }
}
