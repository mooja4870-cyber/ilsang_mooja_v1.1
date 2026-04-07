package androidx.core.os;

/* JADX INFO: loaded from: classes.dex */
final class LocaleListPlatformWrapper implements androidx.core.os.LocaleListInterface {
    private final android.os.LocaleList mLocaleList;

    LocaleListPlatformWrapper(java.lang.Object r2) {
            r1 = this;
            r1.<init>()
            r0 = r2
            android.os.LocaleList r0 = (android.os.LocaleList) r0
            r1.mLocaleList = r0
            return
    }

    public boolean equals(java.lang.Object r3) {
            r2 = this;
            android.os.LocaleList r0 = r2.mLocaleList
            r1 = r3
            androidx.core.os.LocaleListInterface r1 = (androidx.core.os.LocaleListInterface) r1
            java.lang.Object r1 = r1.getLocaleList()
            boolean r0 = r0.equals(r1)
            return r0
    }

    @Override // androidx.core.os.LocaleListInterface
    public java.util.Locale get(int r2) {
            r1 = this;
            android.os.LocaleList r0 = r1.mLocaleList
            java.util.Locale r0 = r0.get(r2)
            return r0
    }

    @Override // androidx.core.os.LocaleListInterface
    public java.util.Locale getFirstMatch(java.lang.String[] r2) {
            r1 = this;
            android.os.LocaleList r0 = r1.mLocaleList
            java.util.Locale r0 = r0.getFirstMatch(r2)
            return r0
    }

    @Override // androidx.core.os.LocaleListInterface
    public java.lang.Object getLocaleList() {
            r1 = this;
            android.os.LocaleList r0 = r1.mLocaleList
            return r0
    }

    public int hashCode() {
            r1 = this;
            android.os.LocaleList r0 = r1.mLocaleList
            int r0 = r0.hashCode()
            return r0
    }

    @Override // androidx.core.os.LocaleListInterface
    public int indexOf(java.util.Locale r2) {
            r1 = this;
            android.os.LocaleList r0 = r1.mLocaleList
            int r0 = r0.indexOf(r2)
            return r0
    }

    @Override // androidx.core.os.LocaleListInterface
    public boolean isEmpty() {
            r1 = this;
            android.os.LocaleList r0 = r1.mLocaleList
            boolean r0 = r0.isEmpty()
            return r0
    }

    @Override // androidx.core.os.LocaleListInterface
    public int size() {
            r1 = this;
            android.os.LocaleList r0 = r1.mLocaleList
            int r0 = r0.size()
            return r0
    }

    @Override // androidx.core.os.LocaleListInterface
    public java.lang.String toLanguageTags() {
            r1 = this;
            android.os.LocaleList r0 = r1.mLocaleList
            java.lang.String r0 = r0.toLanguageTags()
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            android.os.LocaleList r0 = r1.mLocaleList
            java.lang.String r0 = r0.toString()
            return r0
    }
}
