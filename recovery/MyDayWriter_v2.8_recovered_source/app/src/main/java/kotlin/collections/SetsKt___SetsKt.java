package kotlin.collections;

/* JADX INFO: compiled from: _Sets.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\"\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a,\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0003\u001a\u0002H\u0002H\u0086\u0002¢\u0006\u0002\u0010\u0004\u001a4\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u0006H\u0086\u0002¢\u0006\u0002\u0010\u0007\u001a-\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00020\bH\u0086\u0002\u001a-\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00020\tH\u0086\u0002\u001a,\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0003\u001a\u0002H\u0002H\u0087\b¢\u0006\u0002\u0010\u0004\u001a,\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0003\u001a\u0002H\u0002H\u0086\u0002¢\u0006\u0002\u0010\u0004\u001a4\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u0006H\u0086\u0002¢\u0006\u0002\u0010\u0007\u001a-\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00020\bH\u0086\u0002\u001a-\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00020\tH\u0086\u0002\u001a,\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0003\u001a\u0002H\u0002H\u0087\b¢\u0006\u0002\u0010\u0004¨\u0006\r"}, d2 = {"minus", "", "T", "element", "(Ljava/util/Set;Ljava/lang/Object;)Ljava/util/Set;", "elements", "", "(Ljava/util/Set;[Ljava/lang/Object;)Ljava/util/Set;", "", "Lkotlin/sequences/Sequence;", "minusElement", "plus", "plusElement", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/collections/SetsKt")
class SetsKt___SetsKt extends kotlin.collections.SetsKt__SetsKt {
    public SetsKt___SetsKt() {
            r0 = this;
            r0.<init>()
            return
    }

    public static final <T> java.util.Set<T> minus(java.util.Set<? extends T> r8, java.lang.Iterable<? extends T> r9) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.util.Collection r0 = kotlin.collections.CollectionsKt.convertToListIfNotCollection(r9)
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L1c
            r1 = r8
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Set r1 = kotlin.collections.CollectionsKt.toSet(r1)
            return r1
        L1c:
            boolean r1 = r0 instanceof java.util.Set
            if (r1 == 0) goto L4a
            r1 = r8
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.LinkedHashSet r2 = new java.util.LinkedHashSet
            r2.<init>()
            java.util.Collection r2 = (java.util.Collection) r2
            r3 = 0
            java.util.Iterator r4 = r1.iterator()
        L2f:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L45
            java.lang.Object r5 = r4.next()
            r6 = r5
            r7 = 0
            boolean r6 = r0.contains(r6)
            if (r6 != 0) goto L2f
            r2.add(r5)
            goto L2f
        L45:
            r1 = r2
            java.util.Set r1 = (java.util.Set) r1
            return r1
        L4a:
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r2 = r8
            java.util.Collection r2 = (java.util.Collection) r2
            r1.<init>(r2)
            r1.removeAll(r0)
            r2 = r1
            java.util.Set r2 = (java.util.Set) r2
            return r2
    }

    public static final <T> java.util.Set<T> minus(java.util.Set<? extends T> r9, T r10) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            int r1 = r9.size()
            int r1 = kotlin.collections.MapsKt.mapCapacity(r1)
            r0.<init>(r1)
            r1 = 0
            r2 = r9
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            r3 = 0
            java.util.Iterator r4 = r2.iterator()
        L1b:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L3c
            java.lang.Object r5 = r4.next()
            r6 = r5
            r7 = 0
            if (r1 != 0) goto L32
            boolean r8 = kotlin.jvm.internal.Intrinsics.areEqual(r6, r10)
            if (r8 == 0) goto L32
            r1 = 1
            r8 = 0
            goto L33
        L32:
            r8 = 1
        L33:
            if (r8 == 0) goto L1b
            r6 = r0
            java.util.Collection r6 = (java.util.Collection) r6
            r6.add(r5)
            goto L1b
        L3c:
            r2 = r0
            java.util.Collection r2 = (java.util.Collection) r2
            java.util.Set r2 = (java.util.Set) r2
            return r2
    }

    public static final <T> java.util.Set<T> minus(java.util.Set<? extends T> r2, kotlin.sequences.Sequence<? extends T> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r1 = r2
            java.util.Collection r1 = (java.util.Collection) r1
            r0.<init>(r1)
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            kotlin.collections.CollectionsKt.removeAll(r1, r3)
            r1 = r0
            java.util.Set r1 = (java.util.Set) r1
            return r1
    }

    public static final <T> java.util.Set<T> minus(java.util.Set<? extends T> r2, T[] r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r1 = r2
            java.util.Collection r1 = (java.util.Collection) r1
            r0.<init>(r1)
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            kotlin.collections.CollectionsKt.removeAll(r1, r3)
            r1 = r0
            java.util.Set r1 = (java.util.Set) r1
            return r1
    }

    private static final <T> java.util.Set<T> minusElement(java.util.Set<? extends T> r1, T r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.util.Set r0 = kotlin.collections.SetsKt.minus(r1, r2)
            return r0
    }

    public static final <T> java.util.Set<T> plus(java.util.Set<? extends T> r3, java.lang.Iterable<? extends T> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.Integer r0 = kotlin.collections.CollectionsKt.collectionSizeOrNull(r4)
            if (r0 == 0) goto L1d
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            r1 = 0
            int r2 = r3.size()
            int r2 = r2 + r0
            goto L23
        L1d:
            int r0 = r3.size()
            int r2 = r0 * 2
        L23:
            int r0 = kotlin.collections.MapsKt.mapCapacity(r2)
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>(r0)
            r0 = r3
            java.util.Collection r0 = (java.util.Collection) r0
            r1.addAll(r0)
            r0 = r1
            java.util.Collection r0 = (java.util.Collection) r0
            kotlin.collections.CollectionsKt.addAll(r0, r4)
            r0 = r1
            java.util.Set r0 = (java.util.Set) r0
            return r0
    }

    public static final <T> java.util.Set<T> plus(java.util.Set<? extends T> r2, T r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            int r1 = r2.size()
            int r1 = r1 + 1
            int r1 = kotlin.collections.MapsKt.mapCapacity(r1)
            r0.<init>(r1)
            r1 = r2
            java.util.Collection r1 = (java.util.Collection) r1
            r0.addAll(r1)
            r0.add(r3)
            r1 = r0
            java.util.Set r1 = (java.util.Set) r1
            return r1
    }

    public static final <T> java.util.Set<T> plus(java.util.Set<? extends T> r2, kotlin.sequences.Sequence<? extends T> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            int r1 = r2.size()
            int r1 = r1 * 2
            int r1 = kotlin.collections.MapsKt.mapCapacity(r1)
            r0.<init>(r1)
            r1 = r2
            java.util.Collection r1 = (java.util.Collection) r1
            r0.addAll(r1)
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            kotlin.collections.CollectionsKt.addAll(r1, r3)
            r1 = r0
            java.util.Set r1 = (java.util.Set) r1
            return r1
    }

    public static final <T> java.util.Set<T> plus(java.util.Set<? extends T> r3, T[] r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            int r1 = r3.size()
            int r2 = r4.length
            int r1 = r1 + r2
            int r1 = kotlin.collections.MapsKt.mapCapacity(r1)
            r0.<init>(r1)
            r1 = r3
            java.util.Collection r1 = (java.util.Collection) r1
            r0.addAll(r1)
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            kotlin.collections.CollectionsKt.addAll(r1, r4)
            r1 = r0
            java.util.Set r1 = (java.util.Set) r1
            return r1
    }

    private static final <T> java.util.Set<T> plusElement(java.util.Set<? extends T> r1, T r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.util.Set r0 = kotlin.collections.SetsKt.plus(r1, r2)
            return r0
    }
}
