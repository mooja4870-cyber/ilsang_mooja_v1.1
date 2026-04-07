package androidx.core.telephony.mbms;

/* JADX INFO: loaded from: classes.dex */
public final class MbmsHelper {

    static class Api28Impl {
        private Api28Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static java.lang.CharSequence getBestNameForService(android.content.Context r7, android.telephony.mbms.ServiceInfo r8) {
                java.util.Set r0 = r8.getNamedContentLocales()
                boolean r1 = r0.isEmpty()
                r2 = 0
                if (r1 == 0) goto Lc
                return r2
            Lc:
                int r1 = r0.size()
                java.lang.String[] r1 = new java.lang.String[r1]
                r3 = 0
                java.util.Set r4 = r8.getNamedContentLocales()
                java.util.Iterator r4 = r4.iterator()
            L1b:
                boolean r5 = r4.hasNext()
                if (r5 == 0) goto L31
                java.lang.Object r5 = r4.next()
                java.util.Locale r5 = (java.util.Locale) r5
                java.lang.String r6 = r5.toLanguageTag()
                r1[r3] = r6
                int r3 = r3 + 1
                goto L1b
            L31:
                android.content.res.Resources r4 = r7.getResources()
                android.content.res.Configuration r4 = r4.getConfiguration()
                android.os.LocaleList r4 = r4.getLocales()
                java.util.Locale r5 = r4.getFirstMatch(r1)
                if (r5 != 0) goto L44
                goto L48
            L44:
                java.lang.CharSequence r2 = r8.getNameForLocale(r5)
            L48:
                return r2
        }
    }

    private MbmsHelper() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.CharSequence getBestNameForService(android.content.Context r2, android.telephony.mbms.ServiceInfo r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Lb
            java.lang.CharSequence r0 = androidx.core.telephony.mbms.MbmsHelper.Api28Impl.getBestNameForService(r2, r3)
            return r0
        Lb:
            r0 = 0
            return r0
    }
}
