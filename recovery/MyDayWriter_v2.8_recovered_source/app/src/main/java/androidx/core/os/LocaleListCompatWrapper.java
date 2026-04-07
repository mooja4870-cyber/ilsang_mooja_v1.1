package androidx.core.os;

/* JADX INFO: loaded from: classes.dex */
final class LocaleListCompatWrapper implements androidx.core.os.LocaleListInterface {
    private static final java.util.Locale EN_LATN = null;
    private static final java.util.Locale LOCALE_AR_XB = null;
    private static final java.util.Locale LOCALE_EN_XA = null;
    private static final java.util.Locale[] sEmptyList = null;
    private final java.util.Locale[] mList;
    private final java.lang.String mStringRepresentation;

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

    static {
            r0 = 0
            java.util.Locale[] r0 = new java.util.Locale[r0]
            androidx.core.os.LocaleListCompatWrapper.sEmptyList = r0
            java.util.Locale r0 = new java.util.Locale
            java.lang.String r1 = "en"
            java.lang.String r2 = "XA"
            r0.<init>(r1, r2)
            androidx.core.os.LocaleListCompatWrapper.LOCALE_EN_XA = r0
            java.util.Locale r0 = new java.util.Locale
            java.lang.String r1 = "ar"
            java.lang.String r2 = "XB"
            r0.<init>(r1, r2)
            androidx.core.os.LocaleListCompatWrapper.LOCALE_AR_XB = r0
            java.lang.String r0 = "en-Latn"
            java.util.Locale r0 = androidx.core.os.LocaleListCompat.forLanguageTagCompat(r0)
            androidx.core.os.LocaleListCompatWrapper.EN_LATN = r0
            return
    }

    LocaleListCompatWrapper(java.util.Locale... r9) {
            r8 = this;
            r8.<init>()
            int r0 = r9.length
            if (r0 != 0) goto Lf
            java.util.Locale[] r0 = androidx.core.os.LocaleListCompatWrapper.sEmptyList
            r8.mList = r0
            java.lang.String r0 = ""
            r8.mStringRepresentation = r0
            goto L78
        Lf:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r3 = 0
        L1f:
            int r4 = r9.length
            if (r3 >= r4) goto L67
            r4 = r9[r3]
            if (r4 == 0) goto L48
            boolean r5 = r1.contains(r4)
            if (r5 != 0) goto L45
            java.lang.Object r5 = r4.clone()
            java.util.Locale r5 = (java.util.Locale) r5
            r0.add(r5)
            toLanguageTag(r2, r5)
            int r6 = r9.length
            int r6 = r6 + (-1)
            if (r3 >= r6) goto L42
            r6 = 44
            r2.append(r6)
        L42:
            r1.add(r5)
        L45:
            int r3 = r3 + 1
            goto L1f
        L48:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "list["
            java.lang.StringBuilder r6 = r6.append(r7)
            java.lang.StringBuilder r6 = r6.append(r3)
            java.lang.String r7 = "] is null"
            java.lang.StringBuilder r6 = r6.append(r7)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        L67:
            r3 = 0
            java.util.Locale[] r3 = new java.util.Locale[r3]
            java.lang.Object[] r3 = r0.toArray(r3)
            java.util.Locale[] r3 = (java.util.Locale[]) r3
            r8.mList = r3
            java.lang.String r3 = r2.toString()
            r8.mStringRepresentation = r3
        L78:
            return
    }

    private java.util.Locale computeFirstMatch(java.util.Collection<java.lang.String> r3, boolean r4) {
            r2 = this;
            int r0 = r2.computeFirstMatchIndex(r3, r4)
            r1 = -1
            if (r0 != r1) goto L9
            r1 = 0
            goto Ld
        L9:
            java.util.Locale[] r1 = r2.mList
            r1 = r1[r0]
        Ld:
            return r1
    }

    private int computeFirstMatchIndex(java.util.Collection<java.lang.String> r7, boolean r8) {
            r6 = this;
            java.util.Locale[] r0 = r6.mList
            int r0 = r0.length
            r1 = 1
            r2 = 0
            if (r0 != r1) goto L8
            return r2
        L8:
            java.util.Locale[] r0 = r6.mList
            int r0 = r0.length
            if (r0 != 0) goto Lf
            r0 = -1
            return r0
        Lf:
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r8 == 0) goto L20
            java.util.Locale r1 = androidx.core.os.LocaleListCompatWrapper.EN_LATN
            int r1 = r6.findFirstMatchIndex(r1)
            if (r1 != 0) goto L1d
            return r2
        L1d:
            if (r1 >= r0) goto L20
            r0 = r1
        L20:
            java.util.Iterator r1 = r7.iterator()
        L24:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L3f
            java.lang.Object r3 = r1.next()
            java.lang.String r3 = (java.lang.String) r3
            java.util.Locale r4 = androidx.core.os.LocaleListCompat.forLanguageTagCompat(r3)
            int r5 = r6.findFirstMatchIndex(r4)
            if (r5 != 0) goto L3b
            return r2
        L3b:
            if (r5 >= r0) goto L3e
            r0 = r5
        L3e:
            goto L24
        L3f:
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r0 != r1) goto L45
            return r2
        L45:
            return r0
    }

    private int findFirstMatchIndex(java.util.Locale r3) {
            r2 = this;
            r0 = 0
        L1:
            java.util.Locale[] r1 = r2.mList
            int r1 = r1.length
            if (r0 >= r1) goto L14
            java.util.Locale[] r1 = r2.mList
            r1 = r1[r0]
            int r1 = matchScore(r3, r1)
            if (r1 <= 0) goto L11
            return r0
        L11:
            int r0 = r0 + 1
            goto L1
        L14:
            r0 = 2147483647(0x7fffffff, float:NaN)
            return r0
    }

    private static java.lang.String getLikelyScript(java.util.Locale r2) {
            java.lang.String r0 = androidx.core.os.LocaleListCompatWrapper.Api21Impl.getScript(r2)
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto Lc
            return r0
        Lc:
            java.lang.String r1 = ""
            return r1
    }

    private static boolean isPseudoLocale(java.util.Locale r1) {
            java.util.Locale r0 = androidx.core.os.LocaleListCompatWrapper.LOCALE_EN_XA
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L13
            java.util.Locale r0 = androidx.core.os.LocaleListCompatWrapper.LOCALE_AR_XB
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L11
            goto L13
        L11:
            r0 = 0
            goto L14
        L13:
            r0 = 1
        L14:
            return r0
    }

    private static int matchScore(java.util.Locale r5, java.util.Locale r6) {
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
            if (r0 != 0) goto L51
            boolean r0 = isPseudoLocale(r6)
            if (r0 == 0) goto L25
            goto L51
        L25:
            java.lang.String r0 = getLikelyScript(r5)
            boolean r3 = r0.isEmpty()
            if (r3 == 0) goto L48
            java.lang.String r3 = r5.getCountry()
            boolean r4 = r3.isEmpty()
            if (r4 != 0) goto L46
            java.lang.String r4 = r6.getCountry()
            boolean r4 = r3.equals(r4)
            if (r4 == 0) goto L44
            goto L46
        L44:
            r1 = r2
            goto L47
        L46:
        L47:
            return r1
        L48:
            java.lang.String r1 = getLikelyScript(r6)
            boolean r2 = r0.equals(r1)
            return r2
        L51:
            return r2
    }

    static void toLanguageTag(java.lang.StringBuilder r2, java.util.Locale r3) {
            java.lang.String r0 = r3.getLanguage()
            r2.append(r0)
            java.lang.String r0 = r3.getCountry()
            if (r0 == 0) goto L1f
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L1f
            r1 = 45
            r2.append(r1)
            java.lang.String r1 = r3.getCountry()
            r2.append(r1)
        L1f:
            return
    }

    public boolean equals(java.lang.Object r7) {
            r6 = this;
            r0 = 1
            if (r7 != r6) goto L4
            return r0
        L4:
            boolean r1 = r7 instanceof androidx.core.os.LocaleListCompatWrapper
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            r1 = r7
            androidx.core.os.LocaleListCompatWrapper r1 = (androidx.core.os.LocaleListCompatWrapper) r1
            java.util.Locale[] r1 = r1.mList
            java.util.Locale[] r3 = r6.mList
            int r3 = r3.length
            int r4 = r1.length
            if (r3 == r4) goto L16
            return r2
        L16:
            r3 = 0
        L17:
            java.util.Locale[] r4 = r6.mList
            int r4 = r4.length
            if (r3 >= r4) goto L2c
            java.util.Locale[] r4 = r6.mList
            r4 = r4[r3]
            r5 = r1[r3]
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L29
            return r2
        L29:
            int r3 = r3 + 1
            goto L17
        L2c:
            return r0
    }

    @Override // androidx.core.os.LocaleListInterface
    public java.util.Locale get(int r2) {
            r1 = this;
            if (r2 < 0) goto Lc
            java.util.Locale[] r0 = r1.mList
            int r0 = r0.length
            if (r2 >= r0) goto Lc
            java.util.Locale[] r0 = r1.mList
            r0 = r0[r2]
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    @Override // androidx.core.os.LocaleListInterface
    public java.util.Locale getFirstMatch(java.lang.String[] r3) {
            r2 = this;
            java.util.List r0 = java.util.Arrays.asList(r3)
            r1 = 0
            java.util.Locale r0 = r2.computeFirstMatch(r0, r1)
            return r0
    }

    @Override // androidx.core.os.LocaleListInterface
    public java.lang.Object getLocaleList() {
            r1 = this;
            r0 = 0
            return r0
    }

    public int hashCode() {
            r7 = this;
            r0 = 1
            java.util.Locale[] r1 = r7.mList
            int r2 = r1.length
            r3 = 0
        L5:
            if (r3 >= r2) goto L14
            r4 = r1[r3]
            int r5 = r0 * 31
            int r6 = r4.hashCode()
            int r0 = r5 + r6
            int r3 = r3 + 1
            goto L5
        L14:
            return r0
    }

    @Override // androidx.core.os.LocaleListInterface
    public int indexOf(java.util.Locale r3) {
            r2 = this;
            r0 = 0
        L1:
            java.util.Locale[] r1 = r2.mList
            int r1 = r1.length
            if (r0 >= r1) goto L14
            java.util.Locale[] r1 = r2.mList
            r1 = r1[r0]
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L11
            return r0
        L11:
            int r0 = r0 + 1
            goto L1
        L14:
            r0 = -1
            return r0
    }

    @Override // androidx.core.os.LocaleListInterface
    public boolean isEmpty() {
            r1 = this;
            java.util.Locale[] r0 = r1.mList
            int r0 = r0.length
            if (r0 != 0) goto L7
            r0 = 1
            goto L8
        L7:
            r0 = 0
        L8:
            return r0
    }

    @Override // androidx.core.os.LocaleListInterface
    public int size() {
            r1 = this;
            java.util.Locale[] r0 = r1.mList
            int r0 = r0.length
            return r0
    }

    @Override // androidx.core.os.LocaleListInterface
    public java.lang.String toLanguageTags() {
            r1 = this;
            java.lang.String r0 = r1.mStringRepresentation
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "["
            r0.append(r1)
            r1 = 0
        Lb:
            java.util.Locale[] r2 = r3.mList
            int r2 = r2.length
            if (r1 >= r2) goto L26
            java.util.Locale[] r2 = r3.mList
            r2 = r2[r1]
            r0.append(r2)
            java.util.Locale[] r2 = r3.mList
            int r2 = r2.length
            int r2 = r2 + (-1)
            if (r1 >= r2) goto L23
            r2 = 44
            r0.append(r2)
        L23:
            int r1 = r1 + 1
            goto Lb
        L26:
            java.lang.String r1 = "]"
            r0.append(r1)
            java.lang.String r1 = r0.toString()
            return r1
    }
}
