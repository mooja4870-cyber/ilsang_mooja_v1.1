package kotlin.enums;

import java.lang.Enum;

/* JADX INFO: compiled from: EnumEntries.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\b\u0003\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u00032\b\u0012\u0004\u0012\u0002H\u00010\u00042\u00060\u0005j\u0002`\u0006B\u0013\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0002\u0010\tJ\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\u0012J\u0016\u0010\u0013\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00020\fH\u0096\u0002¢\u0006\u0002\u0010\u0015J\u0015\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0017J\u0015\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0017J\b\u0010\u0019\u001a\u00020\u001aH\u0002R\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\nR\u0014\u0010\u000b\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u001b"}, d2 = {"Lkotlin/enums/EnumEntriesList;", "T", "", "Lkotlin/enums/EnumEntries;", "Lkotlin/collections/AbstractList;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "entries", "", "([Ljava/lang/Enum;)V", "[Ljava/lang/Enum;", "size", "", "getSize", "()I", "contains", "", "element", "(Ljava/lang/Enum;)Z", "get", "index", "(I)Ljava/lang/Enum;", "indexOf", "(Ljava/lang/Enum;)I", "lastIndexOf", "writeReplace", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class EnumEntriesList<T extends java.lang.Enum<T>> extends kotlin.collections.AbstractList<T> implements kotlin.enums.EnumEntries<T>, java.io.Serializable {
    private final T[] entries;

    public EnumEntriesList(T[] r2) {
            r1 = this;
            java.lang.String r0 = "entries"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.<init>()
            r1.entries = r2
            return
    }

    private final java.lang.Object writeReplace() {
            r2 = this;
            kotlin.enums.EnumEntriesSerializationProxy r0 = new kotlin.enums.EnumEntriesSerializationProxy
            T extends java.lang.Enum<T>[] r1 = r2.entries
            r0.<init>(r1)
            return r0
    }

    public boolean contains(T r3) {
            r2 = this;
            java.lang.String r0 = "element"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            T extends java.lang.Enum<T>[] r0 = r2.entries
            int r1 = r3.ordinal()
            java.lang.Object r0 = kotlin.collections.ArraysKt.getOrNull(r0, r1)
            java.lang.Enum r0 = (java.lang.Enum) r0
            if (r0 != r3) goto L16
            r1 = 1
            goto L17
        L16:
            r1 = 0
        L17:
            return r1
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection
    public final /* bridge */ boolean contains(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof java.lang.Enum
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            r0 = r2
            java.lang.Enum r0 = (java.lang.Enum) r0
            boolean r0 = r1.contains(r0)
            return r0
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public T get(int r3) {
            r2 = this;
            kotlin.collections.AbstractList$Companion r0 = kotlin.collections.AbstractList.Companion
            T extends java.lang.Enum<T>[] r1 = r2.entries
            int r1 = r1.length
            r0.checkElementIndex$kotlin_stdlib(r3, r1)
            T extends java.lang.Enum<T>[] r0 = r2.entries
            r0 = r0[r3]
            return r0
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public /* bridge */ /* synthetic */ java.lang.Object get(int r2) {
            r1 = this;
            java.lang.Enum r0 = r1.get(r2)
            return r0
    }

    @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
    public int getSize() {
            r1 = this;
            T extends java.lang.Enum<T>[] r0 = r1.entries
            int r0 = r0.length
            return r0
    }

    public int indexOf(T r4) {
            r3 = this;
            java.lang.String r0 = "element"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            int r0 = r4.ordinal()
            T extends java.lang.Enum<T>[] r1 = r3.entries
            java.lang.Object r1 = kotlin.collections.ArraysKt.getOrNull(r1, r0)
            java.lang.Enum r1 = (java.lang.Enum) r1
            if (r1 != r4) goto L16
            r2 = r0
            goto L17
        L16:
            r2 = -1
        L17:
            return r2
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final /* bridge */ int indexOf(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof java.lang.Enum
            if (r0 != 0) goto L6
            r0 = -1
            return r0
        L6:
            r0 = r2
            java.lang.Enum r0 = (java.lang.Enum) r0
            int r0 = r1.indexOf(r0)
            return r0
    }

    public int lastIndexOf(T r2) {
            r1 = this;
            java.lang.String r0 = "element"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            int r0 = r1.indexOf(r2)
            return r0
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof java.lang.Enum
            if (r0 != 0) goto L6
            r0 = -1
            return r0
        L6:
            r0 = r2
            java.lang.Enum r0 = (java.lang.Enum) r0
            int r0 = r1.lastIndexOf(r0)
            return r0
    }
}
