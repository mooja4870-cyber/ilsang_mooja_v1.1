package androidx.collection;

/* JADX INFO: compiled from: IntList.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u0006\u0010\u0003\u001a\u00020\u0001\u001a\u000e\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005\u001a\u0016\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005\u001a\u001e\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005\u001a\u0012\u0010\u0003\u001a\u00020\u00012\n\u0010\b\u001a\u00020\t\"\u00020\u0005\u001a\t\u0010\n\u001a\u00020\u000bH\u0086\b\u001a\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0005\u001a\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005\u001a\u001e\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005\u001a\u0015\u0010\n\u001a\u00020\u000b2\n\u0010\b\u001a\u00020\t\"\u00020\u0005H\u0086\b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"EmptyIntList", "Landroidx/collection/IntList;", "emptyIntList", "intListOf", "element1", "", "element2", "element3", "elements", "", "mutableIntListOf", "Landroidx/collection/MutableIntList;", "collection"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class IntListKt {
    private static final androidx.collection.IntList EmptyIntList = null;

    static {
            androidx.collection.MutableIntList r0 = new androidx.collection.MutableIntList
            r1 = 0
            r0.<init>(r1)
            androidx.collection.IntList r0 = (androidx.collection.IntList) r0
            androidx.collection.IntListKt.EmptyIntList = r0
            return
    }

    public static final androidx.collection.IntList emptyIntList() {
            androidx.collection.IntList r0 = androidx.collection.IntListKt.EmptyIntList
            return r0
    }

    public static final androidx.collection.IntList intListOf() {
            androidx.collection.IntList r0 = androidx.collection.IntListKt.EmptyIntList
            return r0
    }

    public static final androidx.collection.IntList intListOf(int r1) {
            androidx.collection.MutableIntList r0 = mutableIntListOf(r1)
            androidx.collection.IntList r0 = (androidx.collection.IntList) r0
            return r0
    }

    public static final androidx.collection.IntList intListOf(int r1, int r2) {
            androidx.collection.MutableIntList r0 = mutableIntListOf(r1, r2)
            androidx.collection.IntList r0 = (androidx.collection.IntList) r0
            return r0
    }

    public static final androidx.collection.IntList intListOf(int r1, int r2, int r3) {
            androidx.collection.MutableIntList r0 = mutableIntListOf(r1, r2, r3)
            androidx.collection.IntList r0 = (androidx.collection.IntList) r0
            return r0
    }

    public static final androidx.collection.IntList intListOf(int... r3) {
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            androidx.collection.MutableIntList r0 = new androidx.collection.MutableIntList
            int r1 = r3.length
            r0.<init>(r1)
            r1 = r0
            r2 = 0
            r1.plusAssign(r3)
            androidx.collection.IntList r0 = (androidx.collection.IntList) r0
            return r0
    }

    public static final androidx.collection.MutableIntList mutableIntListOf() {
            r0 = 0
            androidx.collection.MutableIntList r1 = new androidx.collection.MutableIntList
            r2 = 1
            r3 = 0
            r4 = 0
            r1.<init>(r4, r2, r3)
            return r1
    }

    public static final androidx.collection.MutableIntList mutableIntListOf(int r3) {
            androidx.collection.MutableIntList r0 = new androidx.collection.MutableIntList
            r1 = 1
            r0.<init>(r1)
            r1 = r0
            r2 = 0
            r1.add(r3)
            return r0
    }

    public static final androidx.collection.MutableIntList mutableIntListOf(int r3, int r4) {
            androidx.collection.MutableIntList r0 = new androidx.collection.MutableIntList
            r1 = 2
            r0.<init>(r1)
            r1 = r0
            r2 = 0
            r1.add(r3)
            r2 = 0
            r1.add(r4)
            return r0
    }

    public static final androidx.collection.MutableIntList mutableIntListOf(int r3, int r4, int r5) {
            androidx.collection.MutableIntList r0 = new androidx.collection.MutableIntList
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

    public static final androidx.collection.MutableIntList mutableIntListOf(int... r4) {
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = 0
            androidx.collection.MutableIntList r1 = new androidx.collection.MutableIntList
            int r2 = r4.length
            r1.<init>(r2)
            r2 = r1
            r3 = 0
            r2.plusAssign(r4)
            return r1
    }
}
