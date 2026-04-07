package androidx.collection;

/* JADX INFO: compiled from: ObjectList.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u001a\u0012\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0005\"\u0004\b\u0000\u0010\u0007\u001a\u0015\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00070\t\"\u0004\b\u0000\u0010\u0007H\u0086\b\u001a\u001f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00070\t\"\u0004\b\u0000\u0010\u00072\u0006\u0010\n\u001a\u0002H\u0007¢\u0006\u0002\u0010\u000b\u001a'\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00070\t\"\u0004\b\u0000\u0010\u00072\u0006\u0010\n\u001a\u0002H\u00072\u0006\u0010\f\u001a\u0002H\u0007¢\u0006\u0002\u0010\r\u001a/\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00070\t\"\u0004\b\u0000\u0010\u00072\u0006\u0010\n\u001a\u0002H\u00072\u0006\u0010\f\u001a\u0002H\u00072\u0006\u0010\u000e\u001a\u0002H\u0007¢\u0006\u0002\u0010\u000f\u001a.\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00070\t\"\u0004\b\u0000\u0010\u00072\u0012\u0010\u0010\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00070\u0001\"\u0002H\u0007H\u0086\b¢\u0006\u0002\u0010\u0011\u001a\u0012\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0005\"\u0004\b\u0000\u0010\u0007\u001a\u001f\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0005\"\u0004\b\u0000\u0010\u00072\u0006\u0010\n\u001a\u0002H\u0007¢\u0006\u0002\u0010\u0013\u001a'\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0005\"\u0004\b\u0000\u0010\u00072\u0006\u0010\n\u001a\u0002H\u00072\u0006\u0010\f\u001a\u0002H\u0007¢\u0006\u0002\u0010\u0014\u001a/\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0005\"\u0004\b\u0000\u0010\u00072\u0006\u0010\n\u001a\u0002H\u00072\u0006\u0010\f\u001a\u0002H\u00072\u0006\u0010\u000e\u001a\u0002H\u0007¢\u0006\u0002\u0010\u0015\u001a+\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0005\"\u0004\b\u0000\u0010\u00072\u0012\u0010\u0010\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00070\u0001\"\u0002H\u0007¢\u0006\u0002\u0010\u0016\u001a\u0018\u0010\u0017\u001a\u00020\u0018*\u0006\u0012\u0002\b\u00030\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0002\u001a \u0010\u001c\u001a\u00020\u0018*\u0006\u0012\u0002\b\u00030\u00192\u0006\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001bH\u0002\"\u0018\u0010\u0000\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0003\"\u0016\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"EmptyArray", "", "", "[Ljava/lang/Object;", "EmptyObjectList", "Landroidx/collection/ObjectList;", "emptyObjectList", "E", "mutableObjectListOf", "Landroidx/collection/MutableObjectList;", "element1", "(Ljava/lang/Object;)Landroidx/collection/MutableObjectList;", "element2", "(Ljava/lang/Object;Ljava/lang/Object;)Landroidx/collection/MutableObjectList;", "element3", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Landroidx/collection/MutableObjectList;", "elements", "([Ljava/lang/Object;)Landroidx/collection/MutableObjectList;", "objectListOf", "(Ljava/lang/Object;)Landroidx/collection/ObjectList;", "(Ljava/lang/Object;Ljava/lang/Object;)Landroidx/collection/ObjectList;", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Landroidx/collection/ObjectList;", "([Ljava/lang/Object;)Landroidx/collection/ObjectList;", "checkIndex", "", "", "index", "", "checkSubIndex", "fromIndex", "toIndex", "collection"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ObjectListKt {
    private static final java.lang.Object[] EmptyArray = null;
    private static final androidx.collection.ObjectList<java.lang.Object> EmptyObjectList = null;

    static {
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            androidx.collection.ObjectListKt.EmptyArray = r1
            androidx.collection.MutableObjectList r1 = new androidx.collection.MutableObjectList
            r1.<init>(r0)
            androidx.collection.ObjectList r1 = (androidx.collection.ObjectList) r1
            androidx.collection.ObjectListKt.EmptyObjectList = r1
            return
    }

    public static final /* synthetic */ void access$checkIndex(java.util.List r0, int r1) {
            checkIndex(r0, r1)
            return
    }

    public static final /* synthetic */ void access$checkSubIndex(java.util.List r0, int r1, int r2) {
            checkSubIndex(r0, r1, r2)
            return
    }

    public static final /* synthetic */ java.lang.Object[] access$getEmptyArray$p() {
            java.lang.Object[] r0 = androidx.collection.ObjectListKt.EmptyArray
            return r0
    }

    private static final void checkIndex(java.util.List<?> r4, int r5) {
            int r0 = r4.size()
            if (r5 < 0) goto L9
            if (r5 >= r0) goto L9
            return
        L9:
            java.lang.IndexOutOfBoundsException r1 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Index "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r5)
            java.lang.String r3 = " is out of bounds. The list has "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r0)
            java.lang.String r3 = " elements."
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    private static final void checkSubIndex(java.util.List<?> r4, int r5, int r6) {
            int r0 = r4.size()
            if (r5 > r6) goto L53
            if (r5 < 0) goto L34
            if (r6 > r0) goto Lb
            return
        Lb:
            java.lang.IndexOutOfBoundsException r1 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "toIndex ("
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r6)
            java.lang.String r3 = ") is more than than the list size ("
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r0)
            r3 = 41
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L34:
            java.lang.IndexOutOfBoundsException r1 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "fromIndex ("
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r5)
            java.lang.String r3 = ") is less than 0."
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L53:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Indices are out of order. fromIndex ("
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r5)
            java.lang.String r3 = ") is greater than toIndex ("
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r6)
            java.lang.String r3 = ")."
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    public static final <E> androidx.collection.ObjectList<E> emptyObjectList() {
            androidx.collection.ObjectList<java.lang.Object> r0 = androidx.collection.ObjectListKt.EmptyObjectList
            java.lang.String r1 = "null cannot be cast to non-null type androidx.collection.ObjectList<E of androidx.collection.ObjectListKt.emptyObjectList>"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0, r1)
            return r0
    }

    public static final <E> androidx.collection.MutableObjectList<E> mutableObjectListOf() {
            r0 = 0
            androidx.collection.MutableObjectList r1 = new androidx.collection.MutableObjectList
            r2 = 1
            r3 = 0
            r4 = 0
            r1.<init>(r4, r2, r3)
            return r1
    }

    public static final <E> androidx.collection.MutableObjectList<E> mutableObjectListOf(E r3) {
            androidx.collection.MutableObjectList r0 = new androidx.collection.MutableObjectList
            r1 = 1
            r0.<init>(r1)
            r1 = r0
            r2 = 0
            r1.add(r3)
            return r0
    }

    public static final <E> androidx.collection.MutableObjectList<E> mutableObjectListOf(E r3, E r4) {
            androidx.collection.MutableObjectList r0 = new androidx.collection.MutableObjectList
            r1 = 2
            r0.<init>(r1)
            r1 = r0
            r2 = 0
            r1.add(r3)
            r2 = 0
            r1.add(r4)
            return r0
    }

    public static final <E> androidx.collection.MutableObjectList<E> mutableObjectListOf(E r3, E r4, E r5) {
            androidx.collection.MutableObjectList r0 = new androidx.collection.MutableObjectList
            r1 = 3
            r0.<init>(r1)
            r1 = r0
            r2 = 0
            r1.add(r3)
            r2 = 0
            r1.add(r4)
            r2 = 0
            r1.add(r5)
            return r0
    }

    public static final <E> androidx.collection.MutableObjectList<E> mutableObjectListOf(E... r4) {
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = 0
            androidx.collection.MutableObjectList r1 = new androidx.collection.MutableObjectList
            int r2 = r4.length
            r1.<init>(r2)
            r2 = r1
            r3 = 0
            r2.plusAssign(r4)
            return r1
    }

    public static final <E> androidx.collection.ObjectList<E> objectListOf() {
            androidx.collection.ObjectList<java.lang.Object> r0 = androidx.collection.ObjectListKt.EmptyObjectList
            java.lang.String r1 = "null cannot be cast to non-null type androidx.collection.ObjectList<E of androidx.collection.ObjectListKt.objectListOf>"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0, r1)
            return r0
    }

    public static final <E> androidx.collection.ObjectList<E> objectListOf(E r1) {
            androidx.collection.MutableObjectList r0 = mutableObjectListOf(r1)
            androidx.collection.ObjectList r0 = (androidx.collection.ObjectList) r0
            return r0
    }

    public static final <E> androidx.collection.ObjectList<E> objectListOf(E r1, E r2) {
            androidx.collection.MutableObjectList r0 = mutableObjectListOf(r1, r2)
            androidx.collection.ObjectList r0 = (androidx.collection.ObjectList) r0
            return r0
    }

    public static final <E> androidx.collection.ObjectList<E> objectListOf(E r1, E r2, E r3) {
            androidx.collection.MutableObjectList r0 = mutableObjectListOf(r1, r2, r3)
            androidx.collection.ObjectList r0 = (androidx.collection.ObjectList) r0
            return r0
    }

    public static final <E> androidx.collection.ObjectList<E> objectListOf(E... r3) {
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            androidx.collection.MutableObjectList r0 = new androidx.collection.MutableObjectList
            int r1 = r3.length
            r0.<init>(r1)
            r1 = r0
            r2 = 0
            r1.plusAssign(r3)
            androidx.collection.ObjectList r0 = (androidx.collection.ObjectList) r0
            return r0
    }
}
