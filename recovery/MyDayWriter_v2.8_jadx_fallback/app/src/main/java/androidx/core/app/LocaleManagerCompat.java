package androidx.core.app;

/* JADX INFO: loaded from: classes.dex */
public final class LocaleManagerCompat {

    static class Api21Impl {
        private Api21Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static java.lang.String toLanguageTag(java.util.Locale r1) {
                java.lang.String r0 = r1.toLanguageTag()
                return r0
        }
    }

    static class Api24Impl {
        private Api24Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static androidx.core.os.LocaleListCompat getLocales(android.content.res.Configuration r1) {
                android.os.LocaleList r0 = r1.getLocales()
                java.lang.String r0 = r0.toLanguageTags()
                androidx.core.os.LocaleListCompat r0 = androidx.core.os.LocaleListCompat.forLanguageTags(r0)
                return r0
        }
    }

    static class Api33Impl {
        private Api33Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static android.os.LocaleList localeManagerGetApplicationLocales(java.lang.Object r2) {
                r0 = r2
                android.app.LocaleManager r0 = (android.app.LocaleManager) r0
                android.os.LocaleList r1 = r0.getApplicationLocales()
                return r1
        }

        static android.os.LocaleList localeManagerGetSystemLocales(java.lang.Object r2) {
                r0 = r2
                android.app.LocaleManager r0 = (android.app.LocaleManager) r0
                android.os.LocaleList r1 = r0.getSystemLocales()
                return r1
        }
    }

    private LocaleManagerCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static androidx.core.os.LocaleListCompat getApplicationLocales(android.content.Context r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 < r1) goto L1a
            java.lang.Object r0 = getLocaleManagerForApplication(r2)
            if (r0 == 0) goto L15
            android.os.LocaleList r1 = androidx.core.app.LocaleManagerCompat.Api33Impl.localeManagerGetApplicationLocales(r0)
            androidx.core.os.LocaleListCompat r1 = androidx.core.os.LocaleListCompat.wrap(r1)
            return r1
        L15:
            androidx.core.os.LocaleListCompat r1 = androidx.core.os.LocaleListCompat.getEmptyLocaleList()
            return r1
        L1a:
            java.lang.String r0 = androidx.core.app.AppLocalesStorageHelper.readLocales(r2)
            androidx.core.os.LocaleListCompat r0 = androidx.core.os.LocaleListCompat.forLanguageTags(r0)
            return r0
    }

    static androidx.core.os.LocaleListCompat getConfigurationLocales(android.content.res.Configuration r1) {
            androidx.core.os.LocaleListCompat r0 = androidx.core.app.LocaleManagerCompat.Api24Impl.getLocales(r1)
            return r0
    }

    private static java.lang.Object getLocaleManagerForApplication(android.content.Context r1) {
            java.lang.String r0 = "locale"
            java.lang.Object r0 = r1.getSystemService(r0)
            return r0
    }

    public static androidx.core.os.LocaleListCompat getSystemLocales(android.content.Context r3) {
            androidx.core.os.LocaleListCompat r0 = androidx.core.os.LocaleListCompat.getEmptyLocaleList()
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 33
            if (r1 < r2) goto L19
            java.lang.Object r1 = getLocaleManagerForApplication(r3)
            if (r1 == 0) goto L18
            android.os.LocaleList r2 = androidx.core.app.LocaleManagerCompat.Api33Impl.localeManagerGetSystemLocales(r1)
            androidx.core.os.LocaleListCompat r0 = androidx.core.os.LocaleListCompat.wrap(r2)
        L18:
            goto L25
        L19:
            android.content.res.Resources r1 = android.content.res.Resources.getSystem()
            android.content.res.Configuration r1 = r1.getConfiguration()
            androidx.core.os.LocaleListCompat r0 = getConfigurationLocales(r1)
        L25:
            return r0
    }
}
