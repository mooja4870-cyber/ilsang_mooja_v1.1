package androidx.core.os;

/* JADX INFO: loaded from: classes.dex */
public final class LocaleListCompat {
    private static final androidx.core.os.LocaleListCompat sEmptyLocaleList = null;
    private final androidx.core.os.LocaleListInterface mImpl;

    static class Api21Impl {
        private static final java.util.Locale[] PSEUDO_LOCALE = null;

        static {
                r0 = 2
                java.util.Locale[] r0 = new java.util.Locale[r0]
                java.util.Locale r1 = new java.util.Locale
                java.lang.String r2 = "en"
                java.lang.String r3 = "XA"
                r1.<init>(r2, r3)
                r2 = 0
                r0[r2] = r1
                java.util.Locale r1 = new java.util.Locale
                java.lang.String r2 = "ar"
                java.lang.String r3 = "XB"
                r1.<init>(r2, r3)
                r2 = 1
                r0[r2] = r1
                androidx.core.os.LocaleListCompat.Api21Impl.PSEUDO_LOCALE = r0
                return
        }

        private Api21Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static java.util.Locale forLanguageTag(java.lang.String r1) {
                java.util.Locale r0 = java.util.Locale.forLanguageTag(r1)
                return r0
        }

        private static boolean isPseudoLocale(java.util.Locale r6) {
                java.util.Locale[] r0 = androidx.core.os.LocaleListCompat.Api21Impl.PSEUDO_LOCALE
                int r1 = r0.length
                r2 = 0
                r3 = r2
            L5:
                if (r3 >= r1) goto L14
                r4 = r0[r3]
                boolean r5 = r4.equals(r6)
                if (r5 == 0) goto L11
                r0 = 1
                return r0
            L11:
                int r3 = r3 + 1
                goto L5
            L14:
                return r2
        }

        static boolean matchesLanguageAndScript(java.util.Locale r5, java.util.Locale r6) {
                boolean r0 = r5.equals(r6)
                r1 = 1
                if (r0 == 0) goto L8
                return r1
            L8:
                java.lang.String r0 = r5.getLanguage()
                java.lang.String r2 = r6.getLanguage()
                boolean r0 = r0.equals(r2)
                r2 = 0
                if (r0 != 0) goto L18
                return r2
            L18:
                boolean r0 = isPseudoLocale(r5)
                if (r0 != 0) goto L4f
                boolean r0 = isPseudoLocale(r6)
                if (r0 == 0) goto L25
                goto L4f
            L25:
                java.lang.String r0 = androidx.core.text.ICUCompat.maximizeAndGetScript(r5)
                boolean r3 = r0.isEmpty()
                if (r3 == 0) goto L46
                java.lang.String r3 = r5.getCountry()
                boolean r4 = r3.isEmpty()
                if (r4 != 0) goto L45
                java.lang.String r4 = r6.getCountry()
                boolean r4 = r3.equals(r4)
                if (r4 == 0) goto L44
                goto L45
            L44:
                r1 = r2
            L45:
                return r1
            L46:
                java.lang.String r1 = androidx.core.text.ICUCompat.maximizeAndGetScript(r6)
                boolean r2 = r0.equals(r1)
                return r2
            L4f:
                return r2
        }
    }

    static class Api24Impl {
        private Api24Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static android.os.LocaleList createLocaleList(java.util.Locale... r1) {
                android.os.LocaleList r0 = new android.os.LocaleList
                r0.<init>(r1)
                return r0
        }

        static android.os.LocaleList getAdjustedDefault() {
                android.os.LocaleList r0 = android.os.LocaleList.getAdjustedDefault()
                return r0
        }

        static android.os.LocaleList getDefault() {
                android.os.LocaleList r0 = android.os.LocaleList.getDefault()
                return r0
        }
    }

    static {
            r0 = 0
            java.util.Locale[] r0 = new java.util.Locale[r0]
            androidx.core.os.LocaleListCompat r0 = create(r0)
            androidx.core.os.LocaleListCompat.sEmptyLocaleList = r0
            return
    }

    private LocaleListCompat(androidx.core.os.LocaleListInterface r1) {
            r0 = this;
            r0.<init>()
            r0.mImpl = r1
            return
    }

    public static androidx.core.os.LocaleListCompat create(java.util.Locale... r1) {
            android.os.LocaleList r0 = androidx.core.os.LocaleListCompat.Api24Impl.createLocaleList(r1)
            androidx.core.os.LocaleListCompat r0 = wrap(r0)
            return r0
    }

    static java.util.Locale forLanguageTagCompat(java.lang.String r6) {
            java.lang.String r0 = "-"
            boolean r1 = r6.contains(r0)
            r2 = -1
            r3 = 2
            r4 = 0
            r5 = 1
            if (r1 == 0) goto L38
            java.lang.String[] r0 = r6.split(r0, r2)
            int r1 = r0.length
            if (r1 <= r3) goto L1f
            java.util.Locale r1 = new java.util.Locale
            r2 = r0[r4]
            r4 = r0[r5]
            r3 = r0[r3]
            r1.<init>(r2, r4, r3)
            return r1
        L1f:
            int r1 = r0.length
            if (r1 <= r5) goto L2c
            java.util.Locale r1 = new java.util.Locale
            r2 = r0[r4]
            r3 = r0[r5]
            r1.<init>(r2, r3)
            return r1
        L2c:
            int r1 = r0.length
            if (r1 != r5) goto L37
            java.util.Locale r1 = new java.util.Locale
            r2 = r0[r4]
            r1.<init>(r2)
            return r1
        L37:
            goto L6c
        L38:
            java.lang.String r0 = "_"
            boolean r1 = r6.contains(r0)
            if (r1 == 0) goto L8b
            java.lang.String[] r0 = r6.split(r0, r2)
            int r1 = r0.length
            if (r1 <= r3) goto L53
            java.util.Locale r1 = new java.util.Locale
            r2 = r0[r4]
            r4 = r0[r5]
            r3 = r0[r3]
            r1.<init>(r2, r4, r3)
            return r1
        L53:
            int r1 = r0.length
            if (r1 <= r5) goto L60
            java.util.Locale r1 = new java.util.Locale
            r2 = r0[r4]
            r3 = r0[r5]
            r1.<init>(r2, r3)
            return r1
        L60:
            int r1 = r0.length
            if (r1 != r5) goto L6b
            java.util.Locale r1 = new java.util.Locale
            r2 = r0[r4]
            r1.<init>(r2)
            return r1
        L6b:
        L6c:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Can not parse language tag: ["
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r6)
            java.lang.String r2 = "]"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L8b:
            java.util.Locale r0 = new java.util.Locale
            r0.<init>(r6)
            return r0
    }

    public static androidx.core.os.LocaleListCompat forLanguageTags(java.lang.String r4) {
            if (r4 == 0) goto L28
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L9
            goto L28
        L9:
            java.lang.String r0 = ","
            r1 = -1
            java.lang.String[] r0 = r4.split(r0, r1)
            int r1 = r0.length
            java.util.Locale[] r1 = new java.util.Locale[r1]
            r2 = 0
        L14:
            int r3 = r1.length
            if (r2 >= r3) goto L23
        L18:
            r3 = r0[r2]
            java.util.Locale r3 = androidx.core.os.LocaleListCompat.Api21Impl.forLanguageTag(r3)
            r1[r2] = r3
            int r2 = r2 + 1
            goto L14
        L23:
            androidx.core.os.LocaleListCompat r2 = create(r1)
            return r2
        L28:
            androidx.core.os.LocaleListCompat r0 = getEmptyLocaleList()
            return r0
    }

    public static androidx.core.os.LocaleListCompat getAdjustedDefault() {
            android.os.LocaleList r0 = androidx.core.os.LocaleListCompat.Api24Impl.getAdjustedDefault()
            androidx.core.os.LocaleListCompat r0 = wrap(r0)
            return r0
    }

    public static androidx.core.os.LocaleListCompat getDefault() {
            android.os.LocaleList r0 = androidx.core.os.LocaleListCompat.Api24Impl.getDefault()
            androidx.core.os.LocaleListCompat r0 = wrap(r0)
            return r0
    }

    public static androidx.core.os.LocaleListCompat getEmptyLocaleList() {
            androidx.core.os.LocaleListCompat r0 = androidx.core.os.LocaleListCompat.sEmptyLocaleList
            return r0
    }

    public static boolean matchesLanguageAndScript(java.util.Locale r2, java.util.Locale r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 < r1) goto Lb
            boolean r0 = android.os.LocaleList.matchesLanguageAndScript(r2, r3)
            return r0
        Lb:
            boolean r0 = androidx.core.os.LocaleListCompat.Api21Impl.matchesLanguageAndScript(r2, r3)
            return r0
    }

    public static androidx.core.os.LocaleListCompat wrap(android.os.LocaleList r2) {
            androidx.core.os.LocaleListCompat r0 = new androidx.core.os.LocaleListCompat
            androidx.core.os.LocaleListPlatformWrapper r1 = new androidx.core.os.LocaleListPlatformWrapper
            r1.<init>(r2)
            r0.<init>(r1)
            return r0
    }

    @java.lang.Deprecated
    public static androidx.core.os.LocaleListCompat wrap(java.lang.Object r1) {
            r0 = r1
            android.os.LocaleList r0 = (android.os.LocaleList) r0
            androidx.core.os.LocaleListCompat r0 = wrap(r0)
            return r0
    }

    public boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof androidx.core.os.LocaleListCompat
            if (r0 == 0) goto L13
            androidx.core.os.LocaleListInterface r0 = r2.mImpl
            r1 = r3
            androidx.core.os.LocaleListCompat r1 = (androidx.core.os.LocaleListCompat) r1
            androidx.core.os.LocaleListInterface r1 = r1.mImpl
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L13
            r0 = 1
            goto L14
        L13:
            r0 = 0
        L14:
            return r0
    }

    public java.util.Locale get(int r2) {
            r1 = this;
            androidx.core.os.LocaleListInterface r0 = r1.mImpl
            java.util.Locale r0 = r0.get(r2)
            return r0
    }

    public java.util.Locale getFirstMatch(java.lang.String[] r2) {
            r1 = this;
            androidx.core.os.LocaleListInterface r0 = r1.mImpl
            java.util.Locale r0 = r0.getFirstMatch(r2)
            return r0
    }

    public int hashCode() {
            r1 = this;
            androidx.core.os.LocaleListInterface r0 = r1.mImpl
            int r0 = r0.hashCode()
            return r0
    }

    public int indexOf(java.util.Locale r2) {
            r1 = this;
            androidx.core.os.LocaleListInterface r0 = r1.mImpl
            int r0 = r0.indexOf(r2)
            return r0
    }

    public boolean isEmpty() {
            r1 = this;
            androidx.core.os.LocaleListInterface r0 = r1.mImpl
            boolean r0 = r0.isEmpty()
            return r0
    }

    public int size() {
            r1 = this;
            androidx.core.os.LocaleListInterface r0 = r1.mImpl
            int r0 = r0.size()
            return r0
    }

    public java.lang.String toLanguageTags() {
            r1 = this;
            androidx.core.os.LocaleListInterface r0 = r1.mImpl
            java.lang.String r0 = r0.toLanguageTags()
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            androidx.core.os.LocaleListInterface r0 = r1.mImpl
            java.lang.String r0 = r0.toString()
            return r0
    }

    public java.lang.Object unwrap() {
            r1 = this;
            androidx.core.os.LocaleListInterface r0 = r1.mImpl
            java.lang.Object r0 = r0.getLocaleList()
            return r0
    }
}
