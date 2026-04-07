package androidx.core.text.util;

/* JADX INFO: loaded from: classes.dex */
public final class LocalePreferences {
    private static final java.lang.String TAG = null;
    private static final java.lang.String[] WEATHER_FAHRENHEIT_COUNTRIES = null;

    /* JADX INFO: renamed from: androidx.core.text.util.LocalePreferences$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$android$icu$text$DateFormat$HourCycle = null;

        static {
                android.icu.text.DateFormat$HourCycle[] r0 = android.icu.text.DateFormat.HourCycle.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.core.text.util.LocalePreferences.AnonymousClass1.$SwitchMap$android$icu$text$DateFormat$HourCycle = r0
                int[] r0 = androidx.core.text.util.LocalePreferences.AnonymousClass1.$SwitchMap$android$icu$text$DateFormat$HourCycle     // Catch: java.lang.NoSuchFieldError -> L15
                android.icu.text.DateFormat$HourCycle r1 = android.icu.text.DateFormat.HourCycle.HOUR_CYCLE_11     // Catch: java.lang.NoSuchFieldError -> L15
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L15
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L15
                goto L16
            L15:
                r0 = move-exception
            L16:
                int[] r0 = androidx.core.text.util.LocalePreferences.AnonymousClass1.$SwitchMap$android$icu$text$DateFormat$HourCycle     // Catch: java.lang.NoSuchFieldError -> L22
                android.icu.text.DateFormat$HourCycle r1 = android.icu.text.DateFormat.HourCycle.HOUR_CYCLE_12     // Catch: java.lang.NoSuchFieldError -> L22
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L22
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L22
                goto L23
            L22:
                r0 = move-exception
            L23:
                int[] r0 = androidx.core.text.util.LocalePreferences.AnonymousClass1.$SwitchMap$android$icu$text$DateFormat$HourCycle     // Catch: java.lang.NoSuchFieldError -> L2f
                android.icu.text.DateFormat$HourCycle r1 = android.icu.text.DateFormat.HourCycle.HOUR_CYCLE_23     // Catch: java.lang.NoSuchFieldError -> L2f
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L2f
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L2f
                goto L30
            L2f:
                r0 = move-exception
            L30:
                int[] r0 = androidx.core.text.util.LocalePreferences.AnonymousClass1.$SwitchMap$android$icu$text$DateFormat$HourCycle     // Catch: java.lang.NoSuchFieldError -> L3c
                android.icu.text.DateFormat$HourCycle r1 = android.icu.text.DateFormat.HourCycle.HOUR_CYCLE_24     // Catch: java.lang.NoSuchFieldError -> L3c
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3c
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3c
                goto L3d
            L3c:
                r0 = move-exception
            L3d:
                return
        }
    }

    private static class Api24Impl {
        private Api24Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static java.lang.String getCalendarType(java.util.Locale r1) {
                android.icu.util.Calendar r0 = android.icu.util.Calendar.getInstance(r1)
                java.lang.String r0 = r0.getType()
                return r0
        }

        static java.util.Locale getDefaultLocale() {
                java.util.Locale$Category r0 = java.util.Locale.Category.FORMAT
                java.util.Locale r0 = java.util.Locale.getDefault(r0)
                return r0
        }
    }

    private static class Api33Impl {
        private Api33Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static java.lang.String getHourCycle(java.util.Locale r1) {
                android.icu.text.DateTimePatternGenerator r0 = android.icu.text.DateTimePatternGenerator.getInstance(r1)
                android.icu.text.DateFormat$HourCycle r0 = r0.getDefaultHourCycle()
                java.lang.String r0 = getHourCycleType(r0)
                return r0
        }

        private static java.lang.String getHourCycleType(android.icu.text.DateFormat.HourCycle r2) {
                int[] r0 = androidx.core.text.util.LocalePreferences.AnonymousClass1.$SwitchMap$android$icu$text$DateFormat$HourCycle
                int r1 = r2.ordinal()
                r0 = r0[r1]
                switch(r0) {
                    case 1: goto L17;
                    case 2: goto L14;
                    case 3: goto L11;
                    case 4: goto Le;
                    default: goto Lb;
                }
            Lb:
                java.lang.String r0 = ""
                return r0
            Le:
                java.lang.String r0 = "h24"
                return r0
            L11:
                java.lang.String r0 = "h23"
                return r0
            L14:
                java.lang.String r0 = "h12"
                return r0
            L17:
                java.lang.String r0 = "h11"
                return r0
        }

        static java.lang.String getResolvedTemperatureUnit(java.util.Locale r4) {
                android.icu.number.UnlocalizedNumberFormatter r0 = android.icu.number.NumberFormatter.with()
                java.lang.String r1 = "weather"
                android.icu.number.NumberFormatterSettings r0 = r0.usage(r1)
                android.icu.number.UnlocalizedNumberFormatter r0 = (android.icu.number.UnlocalizedNumberFormatter) r0
                android.icu.util.MeasureUnit r1 = android.icu.util.MeasureUnit.CELSIUS
                android.icu.number.NumberFormatterSettings r0 = r0.unit(r1)
                android.icu.number.UnlocalizedNumberFormatter r0 = (android.icu.number.UnlocalizedNumberFormatter) r0
                android.icu.number.LocalizedNumberFormatter r0 = r0.locale(r4)
                r1 = 1
                android.icu.number.FormattedNumber r1 = r0.format(r1)
                android.icu.util.MeasureUnit r1 = r1.getOutputUnit()
                java.lang.String r1 = r1.getIdentifier()
                java.lang.String r2 = "fahrenhe"
                boolean r3 = r1.startsWith(r2)
                if (r3 == 0) goto L2f
                return r2
            L2f:
                return r1
        }
    }

    public static class CalendarType {
        public static final java.lang.String CHINESE = "chinese";
        public static final java.lang.String DANGI = "dangi";
        public static final java.lang.String DEFAULT = "";
        public static final java.lang.String GREGORIAN = "gregorian";
        public static final java.lang.String HEBREW = "hebrew";
        public static final java.lang.String INDIAN = "indian";
        public static final java.lang.String ISLAMIC = "islamic";
        public static final java.lang.String ISLAMIC_CIVIL = "islamic-civil";
        public static final java.lang.String ISLAMIC_RGSA = "islamic-rgsa";
        public static final java.lang.String ISLAMIC_TBLA = "islamic-tbla";
        public static final java.lang.String ISLAMIC_UMALQURA = "islamic-umalqura";
        public static final java.lang.String PERSIAN = "persian";
        private static final java.lang.String U_EXTENSION_TAG = "ca";

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public @interface CalendarTypes {
        }

        private CalendarType() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    public static class FirstDayOfWeek {
        public static final java.lang.String DEFAULT = "";
        public static final java.lang.String FRIDAY = "fri";
        public static final java.lang.String MONDAY = "mon";
        public static final java.lang.String SATURDAY = "sat";
        public static final java.lang.String SUNDAY = "sun";
        public static final java.lang.String THURSDAY = "thu";
        public static final java.lang.String TUESDAY = "tue";
        private static final java.lang.String U_EXTENSION_TAG = "fw";
        public static final java.lang.String WEDNESDAY = "wed";

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public @interface Days {
        }

        private FirstDayOfWeek() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    public static class HourCycle {
        public static final java.lang.String DEFAULT = "";
        public static final java.lang.String H11 = "h11";
        public static final java.lang.String H12 = "h12";
        public static final java.lang.String H23 = "h23";
        public static final java.lang.String H24 = "h24";
        private static final java.lang.String U_EXTENSION_TAG = "hc";

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public @interface HourCycleTypes {
        }

        private HourCycle() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    public static class TemperatureUnit {
        public static final java.lang.String CELSIUS = "celsius";
        public static final java.lang.String DEFAULT = "";
        public static final java.lang.String FAHRENHEIT = "fahrenhe";
        public static final java.lang.String KELVIN = "kelvin";
        private static final java.lang.String U_EXTENSION_TAG = "mu";

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public @interface TemperatureUnits {
        }

        private TemperatureUnit() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            java.lang.Class<androidx.core.text.util.LocalePreferences> r0 = androidx.core.text.util.LocalePreferences.class
            java.lang.String r0 = r0.getSimpleName()
            androidx.core.text.util.LocalePreferences.TAG = r0
            r0 = 6
            java.lang.String[] r0 = new java.lang.String[r0]
            r1 = 0
            java.lang.String r2 = "BS"
            r0[r1] = r2
            r1 = 1
            java.lang.String r2 = "BZ"
            r0[r1] = r2
            r1 = 2
            java.lang.String r2 = "KY"
            r0[r1] = r2
            r1 = 3
            java.lang.String r2 = "PR"
            r0[r1] = r2
            r1 = 4
            java.lang.String r2 = "PW"
            r0[r1] = r2
            r1 = 5
            java.lang.String r2 = "US"
            r0[r1] = r2
            androidx.core.text.util.LocalePreferences.WEATHER_FAHRENHEIT_COUNTRIES = r0
            return
    }

    private LocalePreferences() {
            r0 = this;
            r0.<init>()
            return
    }

    private static java.lang.String getBaseFirstDayOfWeek(java.util.Locale r1) {
            java.util.Calendar r0 = java.util.Calendar.getInstance(r1)
            int r0 = r0.getFirstDayOfWeek()
            java.lang.String r0 = getStringOfFirstDayOfWeek(r0)
            return r0
    }

    private static java.lang.String getBaseHourCycle(java.util.Locale r2) {
            java.lang.String r0 = "jm"
            java.lang.String r0 = android.text.format.DateFormat.getBestDateTimePattern(r2, r0)
            java.lang.String r1 = "H"
            boolean r1 = r0.contains(r1)
            if (r1 == 0) goto L12
            java.lang.String r1 = "h23"
            goto L14
        L12:
            java.lang.String r1 = "h12"
        L14:
            return r1
    }

    public static java.lang.String getCalendarType() {
            r0 = 1
            java.lang.String r0 = getCalendarType(r0)
            return r0
    }

    public static java.lang.String getCalendarType(java.util.Locale r1) {
            r0 = 1
            java.lang.String r0 = getCalendarType(r1, r0)
            return r0
    }

    public static java.lang.String getCalendarType(java.util.Locale r2, boolean r3) {
            java.lang.String r0 = "ca"
            java.lang.String r1 = ""
            java.lang.String r0 = getUnicodeLocaleType(r0, r1, r2, r3)
            if (r0 == 0) goto Lb
            return r0
        Lb:
            java.lang.String r1 = androidx.core.text.util.LocalePreferences.Api24Impl.getCalendarType(r2)
            return r1
    }

    public static java.lang.String getCalendarType(boolean r2) {
            java.util.Locale r0 = androidx.core.text.util.LocalePreferences.Api24Impl.getDefaultLocale()
            java.lang.String r1 = getCalendarType(r0, r2)
            return r1
    }

    private static java.util.Locale getDefaultLocale() {
            java.util.Locale r0 = java.util.Locale.getDefault()
            return r0
    }

    public static java.lang.String getFirstDayOfWeek() {
            r0 = 1
            java.lang.String r0 = getFirstDayOfWeek(r0)
            return r0
    }

    public static java.lang.String getFirstDayOfWeek(java.util.Locale r1) {
            r0 = 1
            java.lang.String r0 = getFirstDayOfWeek(r1, r0)
            return r0
    }

    public static java.lang.String getFirstDayOfWeek(java.util.Locale r2, boolean r3) {
            java.lang.String r0 = "fw"
            java.lang.String r1 = ""
            java.lang.String r0 = getUnicodeLocaleType(r0, r1, r2, r3)
            if (r0 == 0) goto Lc
            r1 = r0
            goto L10
        Lc:
            java.lang.String r1 = getBaseFirstDayOfWeek(r2)
        L10:
            return r1
    }

    public static java.lang.String getFirstDayOfWeek(boolean r2) {
            java.util.Locale r0 = androidx.core.text.util.LocalePreferences.Api24Impl.getDefaultLocale()
            java.lang.String r1 = getFirstDayOfWeek(r0, r2)
            return r1
    }

    public static java.lang.String getHourCycle() {
            r0 = 1
            java.lang.String r0 = getHourCycle(r0)
            return r0
    }

    public static java.lang.String getHourCycle(java.util.Locale r1) {
            r0 = 1
            java.lang.String r0 = getHourCycle(r1, r0)
            return r0
    }

    public static java.lang.String getHourCycle(java.util.Locale r3, boolean r4) {
            java.lang.String r0 = "hc"
            java.lang.String r1 = ""
            java.lang.String r0 = getUnicodeLocaleType(r0, r1, r3, r4)
            if (r0 == 0) goto Lb
            return r0
        Lb:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 33
            if (r1 < r2) goto L16
            java.lang.String r1 = androidx.core.text.util.LocalePreferences.Api33Impl.getHourCycle(r3)
            return r1
        L16:
            java.lang.String r1 = getBaseHourCycle(r3)
            return r1
    }

    public static java.lang.String getHourCycle(boolean r2) {
            java.util.Locale r0 = androidx.core.text.util.LocalePreferences.Api24Impl.getDefaultLocale()
            java.lang.String r1 = getHourCycle(r0, r2)
            return r1
    }

    private static java.lang.String getStringOfFirstDayOfWeek(int r5) {
            r0 = 7
            java.lang.String[] r1 = new java.lang.String[r0]
            r2 = 0
            java.lang.String r3 = "sun"
            r1[r2] = r3
            java.lang.String r2 = "mon"
            r3 = 1
            r1[r3] = r2
            r2 = 2
            java.lang.String r4 = "tue"
            r1[r2] = r4
            r2 = 3
            java.lang.String r4 = "wed"
            r1[r2] = r4
            r2 = 4
            java.lang.String r4 = "thu"
            r1[r2] = r4
            r2 = 5
            java.lang.String r4 = "fri"
            r1[r2] = r4
            r2 = 6
            java.lang.String r4 = "sat"
            r1[r2] = r4
            if (r5 < r3) goto L2f
            if (r5 > r0) goto L2f
            int r0 = r5 + (-1)
            r0 = r1[r0]
            goto L31
        L2f:
            java.lang.String r0 = ""
        L31:
            return r0
    }

    private static java.lang.String getTemperatureHardCoded(java.util.Locale r2) {
            java.lang.String[] r0 = androidx.core.text.util.LocalePreferences.WEATHER_FAHRENHEIT_COUNTRIES
            java.lang.String r1 = r2.getCountry()
            int r0 = java.util.Arrays.binarySearch(r0, r1)
            if (r0 < 0) goto Lf
            java.lang.String r0 = "fahrenhe"
            goto L11
        Lf:
            java.lang.String r0 = "celsius"
        L11:
            return r0
    }

    public static java.lang.String getTemperatureUnit() {
            r0 = 1
            java.lang.String r0 = getTemperatureUnit(r0)
            return r0
    }

    public static java.lang.String getTemperatureUnit(java.util.Locale r1) {
            r0 = 1
            java.lang.String r0 = getTemperatureUnit(r1, r0)
            return r0
    }

    public static java.lang.String getTemperatureUnit(java.util.Locale r3, boolean r4) {
            java.lang.String r0 = "mu"
            java.lang.String r1 = ""
            java.lang.String r0 = getUnicodeLocaleType(r0, r1, r3, r4)
            if (r0 == 0) goto Lb
            return r0
        Lb:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 33
            if (r1 < r2) goto L16
            java.lang.String r1 = androidx.core.text.util.LocalePreferences.Api33Impl.getResolvedTemperatureUnit(r3)
            return r1
        L16:
            java.lang.String r1 = getTemperatureHardCoded(r3)
            return r1
    }

    public static java.lang.String getTemperatureUnit(boolean r2) {
            java.util.Locale r0 = androidx.core.text.util.LocalePreferences.Api24Impl.getDefaultLocale()
            java.lang.String r1 = getTemperatureUnit(r0, r2)
            return r1
    }

    private static java.lang.String getUnicodeLocaleType(java.lang.String r2, java.lang.String r3, java.util.Locale r4, boolean r5) {
            java.lang.String r0 = r4.getUnicodeLocaleType(r2)
            if (r0 == 0) goto L7
            return r0
        L7:
            if (r5 != 0) goto La
            return r3
        La:
            r1 = 0
            return r1
    }
}
