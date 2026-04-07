package androidx.core.os;

/* JADX INFO: loaded from: classes.dex */
public final class ConfigurationCompat {

    static class Api24Impl {
        private Api24Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static android.os.LocaleList getLocales(android.content.res.Configuration r1) {
                android.os.LocaleList r0 = r1.getLocales()
                return r0
        }

        static void setLocales(android.content.res.Configuration r1, androidx.core.os.LocaleListCompat r2) {
                java.lang.Object r0 = r2.unwrap()
                android.os.LocaleList r0 = (android.os.LocaleList) r0
                r1.setLocales(r0)
                return
        }
    }

    private ConfigurationCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static androidx.core.os.LocaleListCompat getLocales(android.content.res.Configuration r1) {
            android.os.LocaleList r0 = androidx.core.os.ConfigurationCompat.Api24Impl.getLocales(r1)
            androidx.core.os.LocaleListCompat r0 = androidx.core.os.LocaleListCompat.wrap(r0)
            return r0
    }

    public static void setLocales(android.content.res.Configuration r0, androidx.core.os.LocaleListCompat r1) {
            androidx.core.os.ConfigurationCompat.Api24Impl.setLocales(r0, r1)
            return
    }
}
