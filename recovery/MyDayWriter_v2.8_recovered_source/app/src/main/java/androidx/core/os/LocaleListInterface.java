package androidx.core.os;

/* JADX INFO: loaded from: classes.dex */
interface LocaleListInterface {
    java.util.Locale get(int r1);

    java.util.Locale getFirstMatch(java.lang.String[] r1);

    java.lang.Object getLocaleList();

    int indexOf(java.util.Locale r1);

    boolean isEmpty();

    int size();

    java.lang.String toLanguageTags();
}
