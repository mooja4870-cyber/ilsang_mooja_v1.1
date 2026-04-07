package kotlin.collections;

/* JADX INFO: compiled from: MutableCollections.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000P\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u001f\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\u001a-\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0000\u0012\u0002H\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u0005¢\u0006\u0002\u0010\u0006\u001a&\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0000\u0012\u0002H\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0007\u001a&\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0000\u0012\u0002H\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\b\u001a\u001e\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00020\n\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0007H\u0000\u001a9\u0010\u000b\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u0001H\u0002¢\u0006\u0002\b\u0010\u001a9\u0010\u000b\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00112\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u0001H\u0002¢\u0006\u0002\b\u0010\u001a(\u0010\u0012\u001a\u00020\u0013\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0000\u0012\u0002H\u00020\u00032\u0006\u0010\u0014\u001a\u0002H\u0002H\u0087\n¢\u0006\u0002\u0010\u0015\u001a.\u0010\u0012\u001a\u00020\u0013\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0000\u0012\u0002H\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0005H\u0087\n¢\u0006\u0002\u0010\u0016\u001a)\u0010\u0012\u001a\u00020\u0013\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0000\u0012\u0002H\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0007H\u0087\n\u001a)\u0010\u0012\u001a\u00020\u0013\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0000\u0012\u0002H\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\bH\u0087\n\u001a(\u0010\u0017\u001a\u00020\u0013\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0000\u0012\u0002H\u00020\u00032\u0006\u0010\u0014\u001a\u0002H\u0002H\u0087\n¢\u0006\u0002\u0010\u0015\u001a.\u0010\u0017\u001a\u00020\u0013\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0000\u0012\u0002H\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0005H\u0087\n¢\u0006\u0002\u0010\u0016\u001a)\u0010\u0017\u001a\u00020\u0013\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0000\u0012\u0002H\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0007H\u0087\n\u001a)\u0010\u0017\u001a\u00020\u0013\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0000\u0012\u0002H\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\bH\u0087\n\u001a-\u0010\u0018\u001a\u00020\u0001\"\t\b\u0000\u0010\u0002¢\u0006\u0002\b\u0019*\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u00032\u0006\u0010\u0014\u001a\u0002H\u0002H\u0087\b¢\u0006\u0002\u0010\u001a\u001a&\u0010\u0018\u001a\u0002H\u0002\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u001cH\u0087\b¢\u0006\u0002\u0010\u001d\u001a-\u0010\u001e\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0000\u0012\u0002H\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u0005¢\u0006\u0002\u0010\u0006\u001a&\u0010\u001e\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0000\u0012\u0002H\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0007\u001a&\u0010\u001e\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0000\u0012\u0002H\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\b\u001a.\u0010\u001e\u001a\u00020\u0001\"\t\b\u0000\u0010\u0002¢\u0006\u0002\b\u0019*\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\nH\u0087\b\u001a*\u0010\u001e\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00010\u000e\u001a*\u0010\u001e\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00112\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00010\u000e\u001a\u001d\u0010\u001f\u001a\u0002H\u0002\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0011H\u0007¢\u0006\u0002\u0010 \u001a\u001f\u0010!\u001a\u0004\u0018\u0001H\u0002\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0011H\u0007¢\u0006\u0002\u0010 \u001a\u001d\u0010\"\u001a\u0002H\u0002\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0011H\u0007¢\u0006\u0002\u0010 \u001a\u001f\u0010#\u001a\u0004\u0018\u0001H\u0002\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0011H\u0007¢\u0006\u0002\u0010 \u001a-\u0010$\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0000\u0012\u0002H\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u0005¢\u0006\u0002\u0010\u0006\u001a&\u0010$\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0000\u0012\u0002H\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0007\u001a&\u0010$\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0000\u0012\u0002H\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\b\u001a.\u0010$\u001a\u00020\u0001\"\t\b\u0000\u0010\u0002¢\u0006\u0002\b\u0019*\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\nH\u0087\b\u001a*\u0010$\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00010\u000e\u001a*\u0010$\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00112\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00010\u000e\u001a\u0015\u0010%\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u0003H\u0002¢\u0006\u0002\b&¨\u0006'"}, d2 = {"addAll", "", "T", "", "elements", "", "(Ljava/util/Collection;[Ljava/lang/Object;)Z", "", "Lkotlin/sequences/Sequence;", "convertToListIfNotCollection", "", "filterInPlace", "", "predicate", "Lkotlin/Function1;", "predicateResultToRemove", "filterInPlace$CollectionsKt__MutableCollectionsKt", "", "minusAssign", "", "element", "(Ljava/util/Collection;Ljava/lang/Object;)V", "(Ljava/util/Collection;[Ljava/lang/Object;)V", "plusAssign", "remove", "Lkotlin/internal/OnlyInputTypes;", "(Ljava/util/Collection;Ljava/lang/Object;)Z", "index", "", "(Ljava/util/List;I)Ljava/lang/Object;", "removeAll", "removeFirst", "(Ljava/util/List;)Ljava/lang/Object;", "removeFirstOrNull", "removeLast", "removeLastOrNull", "retainAll", "retainNothing", "retainNothing$CollectionsKt__MutableCollectionsKt", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/collections/CollectionsKt")
class CollectionsKt__MutableCollectionsKt extends kotlin.collections.CollectionsKt__MutableCollectionsJVMKt {
    public CollectionsKt__MutableCollectionsKt() {
            r0 = this;
            r0.<init>()
            return
    }

    public static final <T> boolean addAll(java.util.Collection<? super T> r4, java.lang.Iterable<? extends T> r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            boolean r0 = r5 instanceof java.util.Collection
            if (r0 == 0) goto L17
            r0 = r5
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r4.addAll(r0)
            return r0
        L17:
            r0 = 0
            java.util.Iterator r1 = r5.iterator()
        L1c:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L2e
            java.lang.Object r2 = r1.next()
            boolean r3 = r4.add(r2)
            if (r3 == 0) goto L1c
            r0 = 1
            goto L1c
        L2e:
            return r0
    }

    public static final <T> boolean addAll(java.util.Collection<? super T> r4, kotlin.sequences.Sequence<? extends T> r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = 0
            java.util.Iterator r1 = r5.iterator()
        Lf:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L21
            java.lang.Object r2 = r1.next()
            boolean r3 = r4.add(r2)
            if (r3 == 0) goto Lf
            r0 = 1
            goto Lf
        L21:
            return r0
    }

    public static final <T> boolean addAll(java.util.Collection<? super T> r1, T[] r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.util.List r0 = kotlin.collections.ArraysKt.asList(r2)
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r1.addAll(r0)
            return r0
    }

    public static final <T> java.util.Collection<T> convertToListIfNotCollection(java.lang.Iterable<? extends T> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto Ld
            r0 = r1
            java.util.Collection r0 = (java.util.Collection) r0
            goto L13
        Ld:
            java.util.List r0 = kotlin.collections.CollectionsKt.toList(r1)
            java.util.Collection r0 = (java.util.Collection) r0
        L13:
            return r0
    }

    private static final <T> boolean filterInPlace$CollectionsKt__MutableCollectionsKt(java.lang.Iterable<? extends T> r4, kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> r5, boolean r6) {
            r0 = 0
            java.util.Iterator r1 = r4.iterator()
            r2 = 0
        L6:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L21
            java.lang.Object r3 = r1.next()
            java.lang.Object r3 = r5.invoke(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 != r6) goto L6
            r1.remove()
            r0 = 1
            goto L6
        L21:
            return r0
    }

    private static final <T> boolean filterInPlace$CollectionsKt__MutableCollectionsKt(java.util.List<T> r5, kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> r6, boolean r7) {
            boolean r0 = r5 instanceof java.util.RandomAccess
            if (r0 != 0) goto L12
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.collections.MutableIterable<T of kotlin.collections.CollectionsKt__MutableCollectionsKt.filterInPlace>"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r5, r0)
            java.lang.Iterable r0 = kotlin.jvm.internal.TypeIntrinsics.asMutableIterable(r5)
            boolean r0 = filterInPlace$CollectionsKt__MutableCollectionsKt(r0, r6, r7)
            return r0
        L12:
            r0 = 0
            r1 = 0
            int r2 = kotlin.collections.CollectionsKt.getLastIndex(r5)
            if (r1 > r2) goto L37
        L1a:
            java.lang.Object r3 = r5.get(r1)
            java.lang.Object r4 = r6.invoke(r3)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 != r7) goto L2b
            goto L32
        L2b:
            if (r0 == r1) goto L30
            r5.set(r0, r3)
        L30:
            int r0 = r0 + 1
        L32:
            if (r1 == r2) goto L37
            int r1 = r1 + 1
            goto L1a
        L37:
            int r1 = r5.size()
            if (r0 >= r1) goto L4d
            int r1 = kotlin.collections.CollectionsKt.getLastIndex(r5)
            if (r0 > r1) goto L4b
        L43:
            r5.remove(r1)
            if (r1 == r0) goto L4b
            int r1 = r1 + (-1)
            goto L43
        L4b:
            r1 = 1
            return r1
        L4d:
            r1 = 0
            return r1
    }

    private static final <T> void minusAssign(java.util.Collection<? super T> r1, java.lang.Iterable<? extends T> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            kotlin.collections.CollectionsKt.removeAll(r1, r2)
            return
    }

    private static final <T> void minusAssign(java.util.Collection<? super T> r1, T r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            r1.remove(r2)
            return
    }

    private static final <T> void minusAssign(java.util.Collection<? super T> r1, kotlin.sequences.Sequence<? extends T> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            kotlin.collections.CollectionsKt.removeAll(r1, r2)
            return
    }

    private static final <T> void minusAssign(java.util.Collection<? super T> r1, T[] r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            kotlin.collections.CollectionsKt.removeAll(r1, r2)
            return
    }

    private static final <T> void plusAssign(java.util.Collection<? super T> r1, java.lang.Iterable<? extends T> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            kotlin.collections.CollectionsKt.addAll(r1, r2)
            return
    }

    private static final <T> void plusAssign(java.util.Collection<? super T> r1, T r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            r1.add(r2)
            return
    }

    private static final <T> void plusAssign(java.util.Collection<? super T> r1, kotlin.sequences.Sequence<? extends T> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            kotlin.collections.CollectionsKt.addAll(r1, r2)
            return
    }

    private static final <T> void plusAssign(java.util.Collection<? super T> r1, T[] r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            kotlin.collections.CollectionsKt.addAll(r1, r2)
            return
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Use removeAt(index) instead.", replaceWith = @kotlin.ReplaceWith(expression = "removeAt(index)", imports = {}))
    private static final <T> T remove(java.util.List<T> r1, int r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.Object r0 = r1.remove(r2)
            return r0
    }

    private static final <T> boolean remove(java.util.Collection<? extends T> r1, T r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.util.Collection r0 = kotlin.jvm.internal.TypeIntrinsics.asMutableCollection(r1)
            boolean r0 = r0.remove(r2)
            return r0
    }

    public static final <T> boolean removeAll(java.lang.Iterable<? extends T> r1, kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "predicate"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r0 = 1
            boolean r0 = filterInPlace$CollectionsKt__MutableCollectionsKt(r1, r2, r0)
            return r0
    }

    public static final <T> boolean removeAll(java.util.Collection<? super T> r1, java.lang.Iterable<? extends T> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.util.Collection r0 = kotlin.collections.CollectionsKt.convertToListIfNotCollection(r2)
            boolean r0 = r1.removeAll(r0)
            return r0
    }

    private static final <T> boolean removeAll(java.util.Collection<? extends T> r1, java.util.Collection<? extends T> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.util.Collection r0 = kotlin.jvm.internal.TypeIntrinsics.asMutableCollection(r1)
            boolean r0 = r0.removeAll(r2)
            return r0
    }

    public static final <T> boolean removeAll(java.util.Collection<? super T> r2, kotlin.sequences.Sequence<? extends T> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.util.List r0 = kotlin.sequences.SequencesKt.toList(r3)
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L22
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r2.removeAll(r1)
            if (r1 == 0) goto L22
            r1 = 1
            goto L23
        L22:
            r1 = 0
        L23:
            return r1
    }

    public static final <T> boolean removeAll(java.util.Collection<? super T> r3, T[] r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            int r0 = r4.length
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L11
            r0 = r1
            goto L12
        L11:
            r0 = r2
        L12:
            if (r0 != 0) goto L21
            java.util.List r0 = kotlin.collections.ArraysKt.asList(r4)
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r3.removeAll(r0)
            if (r0 == 0) goto L21
            goto L22
        L21:
            r1 = r2
        L22:
            return r1
    }

    public static final <T> boolean removeAll(java.util.List<T> r1, kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "predicate"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r0 = 1
            boolean r0 = filterInPlace$CollectionsKt__MutableCollectionsKt(r1, r2, r0)
            return r0
    }

    public static final <T> T removeFirst(java.util.List<T> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L11
            r0 = 0
            java.lang.Object r0 = r2.remove(r0)
            return r0
        L11:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            java.lang.String r1 = "List is empty."
            r0.<init>(r1)
            throw r0
    }

    public static final <T> T removeFirstOrNull(java.util.List<T> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto Ld
            r0 = 0
            goto L12
        Ld:
            r0 = 0
            java.lang.Object r0 = r1.remove(r0)
        L12:
            return r0
    }

    public static final <T> T removeLast(java.util.List<T> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L14
            int r0 = kotlin.collections.CollectionsKt.getLastIndex(r2)
            java.lang.Object r0 = r2.remove(r0)
            return r0
        L14:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            java.lang.String r1 = "List is empty."
            r0.<init>(r1)
            throw r0
    }

    public static final <T> T removeLastOrNull(java.util.List<T> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto Ld
            r0 = 0
            goto L15
        Ld:
            int r0 = kotlin.collections.CollectionsKt.getLastIndex(r1)
            java.lang.Object r0 = r1.remove(r0)
        L15:
            return r0
    }

    public static final <T> boolean retainAll(java.lang.Iterable<? extends T> r1, kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "predicate"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r0 = 0
            boolean r0 = filterInPlace$CollectionsKt__MutableCollectionsKt(r1, r2, r0)
            return r0
    }

    public static final <T> boolean retainAll(java.util.Collection<? super T> r1, java.lang.Iterable<? extends T> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.util.Collection r0 = kotlin.collections.CollectionsKt.convertToListIfNotCollection(r2)
            boolean r0 = r1.retainAll(r0)
            return r0
    }

    private static final <T> boolean retainAll(java.util.Collection<? extends T> r1, java.util.Collection<? extends T> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.util.Collection r0 = kotlin.jvm.internal.TypeIntrinsics.asMutableCollection(r1)
            boolean r0 = r0.retainAll(r2)
            return r0
    }

    public static final <T> boolean retainAll(java.util.Collection<? super T> r2, kotlin.sequences.Sequence<? extends T> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.util.List r0 = kotlin.sequences.SequencesKt.toList(r3)
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L1f
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r2.retainAll(r1)
            return r1
        L1f:
            boolean r1 = retainNothing$CollectionsKt__MutableCollectionsKt(r2)
            return r1
    }

    public static final <T> boolean retainAll(java.util.Collection<? super T> r1, T[] r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            int r0 = r2.length
            if (r0 != 0) goto Lf
            r0 = 1
            goto L10
        Lf:
            r0 = 0
        L10:
            if (r0 != 0) goto L1d
            java.util.List r0 = kotlin.collections.ArraysKt.asList(r2)
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r1.retainAll(r0)
            return r0
        L1d:
            boolean r0 = retainNothing$CollectionsKt__MutableCollectionsKt(r1)
            return r0
    }

    public static final <T> boolean retainAll(java.util.List<T> r1, kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "predicate"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r0 = 0
            boolean r0 = filterInPlace$CollectionsKt__MutableCollectionsKt(r1, r2, r0)
            return r0
    }

    private static final boolean retainNothing$CollectionsKt__MutableCollectionsKt(java.util.Collection<?> r1) {
            boolean r0 = r1.isEmpty()
            r0 = r0 ^ 1
            r1.clear()
            return r0
    }
}
