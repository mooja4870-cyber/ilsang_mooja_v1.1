package kotlin.collections;

/* JADX INFO: compiled from: Collections.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u0086\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000f\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\u001aC\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00070\b\"\u0004\b\u0000\u0010\u00072\u0006\u0010\f\u001a\u00020\u00062!\u0010\r\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u0002H\u00070\u000eH\u0087\bø\u0001\u0000\u001aC\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0013\"\u0004\b\u0000\u0010\u00072\u0006\u0010\f\u001a\u00020\u00062!\u0010\r\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u0002H\u00070\u000eH\u0087\bø\u0001\u0000\u001a\u001f\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u0002H\u00070\u0015j\b\u0012\u0004\u0012\u0002H\u0007`\u0016\"\u0004\b\u0000\u0010\u0007H\u0087\b\u001a5\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u0002H\u00070\u0015j\b\u0012\u0004\u0012\u0002H\u0007`\u0016\"\u0004\b\u0000\u0010\u00072\u0012\u0010\u0017\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00070\u0018\"\u0002H\u0007¢\u0006\u0002\u0010\u0019\u001aN\u0010\u001a\u001a\b\u0012\u0004\u0012\u0002H\u001b0\b\"\u0004\b\u0000\u0010\u001b2\u0006\u0010\u001c\u001a\u00020\u00062\u001f\b\u0001\u0010\u001d\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u001b0\u0013\u0012\u0004\u0012\u00020\u001e0\u000e¢\u0006\u0002\b\u001fH\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001\u001aF\u0010\u001a\u001a\b\u0012\u0004\u0012\u0002H\u001b0\b\"\u0004\b\u0000\u0010\u001b2\u001f\b\u0001\u0010\u001d\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u001b0\u0013\u0012\u0004\u0012\u00020\u001e0\u000e¢\u0006\u0002\b\u001fH\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001\u001a!\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u00182\n\u0010\"\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0000¢\u0006\u0002\u0010#\u001a3\u0010 \u001a\b\u0012\u0004\u0012\u0002H\u00070\u0018\"\u0004\b\u0000\u0010\u00072\n\u0010\"\u001a\u0006\u0012\u0002\b\u00030\u00022\f\u0010$\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0018H\u0000¢\u0006\u0002\u0010%\u001a\u0012\u0010&\u001a\b\u0012\u0004\u0012\u0002H\u00070\b\"\u0004\b\u0000\u0010\u0007\u001a\u0015\u0010'\u001a\b\u0012\u0004\u0012\u0002H\u00070\b\"\u0004\b\u0000\u0010\u0007H\u0087\b\u001a+\u0010'\u001a\b\u0012\u0004\u0012\u0002H\u00070\b\"\u0004\b\u0000\u0010\u00072\u0012\u0010\u0017\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00070\u0018\"\u0002H\u0007¢\u0006\u0002\u0010(\u001a%\u0010)\u001a\b\u0012\u0004\u0012\u0002H\u00070\b\"\b\b\u0000\u0010\u0007*\u00020!2\b\u0010*\u001a\u0004\u0018\u0001H\u0007¢\u0006\u0002\u0010+\u001a3\u0010)\u001a\b\u0012\u0004\u0012\u0002H\u00070\b\"\b\b\u0000\u0010\u0007*\u00020!2\u0016\u0010\u0017\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u0001H\u00070\u0018\"\u0004\u0018\u0001H\u0007¢\u0006\u0002\u0010(\u001a\u0015\u0010,\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0013\"\u0004\b\u0000\u0010\u0007H\u0087\b\u001a+\u0010,\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0013\"\u0004\b\u0000\u0010\u00072\u0012\u0010\u0017\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00070\u0018\"\u0002H\u0007¢\u0006\u0002\u0010(\u001a%\u0010-\u001a\u00020\u001e2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010.\u001a\u00020\u00062\u0006\u0010/\u001a\u00020\u0006H\u0002¢\u0006\u0002\b0\u001a\b\u00101\u001a\u00020\u001eH\u0001\u001a\b\u00102\u001a\u00020\u001eH\u0001\u001a%\u00103\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0002\"\u0004\b\u0000\u0010\u0007*\n\u0012\u0006\b\u0001\u0012\u0002H\u00070\u0018H\u0000¢\u0006\u0002\u00104\u001aS\u00105\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u0002H\u00070\b2\u0006\u0010*\u001a\u0002H\u00072\u001a\u00106\u001a\u0016\u0012\u0006\b\u0000\u0012\u0002H\u000707j\n\u0012\u0006\b\u0000\u0012\u0002H\u0007`82\b\b\u0002\u0010.\u001a\u00020\u00062\b\b\u0002\u0010/\u001a\u00020\u0006¢\u0006\u0002\u00109\u001a>\u00105\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u0002H\u00070\b2\b\b\u0002\u0010.\u001a\u00020\u00062\b\b\u0002\u0010/\u001a\u00020\u00062\u0012\u0010:\u001a\u000e\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u00020\u00060\u000e\u001aE\u00105\u001a\u00020\u0006\"\u000e\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u0002H\u00070;*\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00070\b2\b\u0010*\u001a\u0004\u0018\u0001H\u00072\b\b\u0002\u0010.\u001a\u00020\u00062\b\b\u0002\u0010/\u001a\u00020\u0006¢\u0006\u0002\u0010<\u001ag\u0010=\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0007\"\u000e\b\u0001\u0010>*\b\u0012\u0004\u0012\u0002H>0;*\b\u0012\u0004\u0012\u0002H\u00070\b2\b\u0010?\u001a\u0004\u0018\u0001H>2\b\b\u0002\u0010.\u001a\u00020\u00062\b\b\u0002\u0010/\u001a\u00020\u00062\u0016\b\u0004\u0010@\u001a\u0010\u0012\u0004\u0012\u0002H\u0007\u0012\u0006\u0012\u0004\u0018\u0001H>0\u000eH\u0086\bø\u0001\u0000¢\u0006\u0002\u0010A\u001a,\u0010B\u001a\u00020C\"\t\b\u0000\u0010\u0007¢\u0006\u0002\bD*\b\u0012\u0004\u0012\u0002H\u00070\u00022\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0002H\u0087\b\u001aH\u0010E\u001a\u0002HF\"\u0010\b\u0000\u0010G*\u0006\u0012\u0002\b\u00030\u0002*\u0002HF\"\u0004\b\u0001\u0010F*\u0002HG2\f\u0010H\u001a\b\u0012\u0004\u0012\u0002HF0IH\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0000¢\u0006\u0002\u0010J\u001a\u0019\u0010K\u001a\u00020C\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u0002H\u00070\u0002H\u0087\b\u001a,\u0010L\u001a\u00020C\"\u0004\b\u0000\u0010\u0007*\n\u0012\u0004\u0012\u0002H\u0007\u0018\u00010\u0002H\u0087\b\u0082\u0002\u000e\n\f\b\u0000\u0012\u0002\u0018\u0001\u001a\u0004\b\u0003\u0010\u0000\u001a\u001e\u0010M\u001a\b\u0012\u0004\u0012\u0002H\u00070\b\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u0002H\u00070\bH\u0000\u001a!\u0010N\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0002\"\u0004\b\u0000\u0010\u0007*\n\u0012\u0004\u0012\u0002H\u0007\u0018\u00010\u0002H\u0087\b\u001a!\u0010N\u001a\b\u0012\u0004\u0012\u0002H\u00070\b\"\u0004\b\u0000\u0010\u0007*\n\u0012\u0004\u0012\u0002H\u0007\u0018\u00010\bH\u0087\b\u001a&\u0010O\u001a\b\u0012\u0004\u0012\u0002H\u00070\b\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u0002H\u00070P2\u0006\u0010Q\u001a\u00020RH\u0007\"\u0019\u0010\u0000\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"!\u0010\u0005\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u0002H\u00070\b8F¢\u0006\u0006\u001a\u0004\b\t\u0010\n\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006S"}, d2 = {"indices", "Lkotlin/ranges/IntRange;", "", "getIndices", "(Ljava/util/Collection;)Lkotlin/ranges/IntRange;", "lastIndex", "", "T", "", "getLastIndex", "(Ljava/util/List;)I", "List", "size", "init", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "index", "MutableList", "", "arrayListOf", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "elements", "", "([Ljava/lang/Object;)Ljava/util/ArrayList;", "buildList", "E", "capacity", "builderAction", "", "Lkotlin/ExtensionFunctionType;", "collectionToArrayCommonImpl", "", "collection", "(Ljava/util/Collection;)[Ljava/lang/Object;", "array", "(Ljava/util/Collection;[Ljava/lang/Object;)[Ljava/lang/Object;", "emptyList", "listOf", "([Ljava/lang/Object;)Ljava/util/List;", "listOfNotNull", "element", "(Ljava/lang/Object;)Ljava/util/List;", "mutableListOf", "rangeCheck", "fromIndex", "toIndex", "rangeCheck$CollectionsKt__CollectionsKt", "throwCountOverflow", "throwIndexOverflow", "asCollection", "([Ljava/lang/Object;)Ljava/util/Collection;", "binarySearch", "comparator", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "(Ljava/util/List;Ljava/lang/Object;Ljava/util/Comparator;II)I", "comparison", "", "(Ljava/util/List;Ljava/lang/Comparable;II)I", "binarySearchBy", "K", "key", "selector", "(Ljava/util/List;Ljava/lang/Comparable;IILkotlin/jvm/functions/Function1;)I", "containsAll", "", "Lkotlin/internal/OnlyInputTypes;", "ifEmpty", "R", "C", "defaultValue", "Lkotlin/Function0;", "(Ljava/util/Collection;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "isNotEmpty", "isNullOrEmpty", "optimizeReadOnlyList", "orEmpty", "shuffled", "", "random", "Lkotlin/random/Random;", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/collections/CollectionsKt")
class CollectionsKt__CollectionsKt extends kotlin.collections.CollectionsKt__CollectionsJVMKt {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: kotlin.collections.CollectionsKt__CollectionsKt$binarySearchBy$1, reason: invalid class name */
    /* JADX INFO: compiled from: Collections.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000f\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u000e\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u00042\u0006\u0010\u0005\u001a\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "T", "K", "", "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 176)
    public static final class AnonymousClass1<T> extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function1<T, java.lang.Integer> {

        /* JADX INFO: Incorrect field signature: TK; */
        final /* synthetic */ java.lang.Comparable $key;
        final /* synthetic */ kotlin.jvm.functions.Function1<T, K> $selector;

        /* JADX WARN: Incorrect types in method signature: (Lkotlin/jvm/functions/Function1<-TT;+TK;>;TK;)V */
        public AnonymousClass1(kotlin.jvm.functions.Function1 r2, java.lang.Comparable r3) {
                r1 = this;
                r1.$selector = r2
                r1.$key = r3
                r0 = 1
                r1.<init>(r0)
                return
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Integer invoke(T r3) {
                r2 = this;
                kotlin.jvm.functions.Function1<T, K> r0 = r2.$selector
                java.lang.Object r0 = r0.invoke(r3)
                java.lang.Comparable r0 = (java.lang.Comparable) r0
                java.lang.Comparable r1 = r2.$key
                int r0 = kotlin.comparisons.ComparisonsKt.compareValues(r0, r1)
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                return r0
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ java.lang.Integer invoke(java.lang.Object r2) {
                r1 = this;
                java.lang.Integer r0 = r1.invoke(r2)
                return r0
        }
    }

    public CollectionsKt__CollectionsKt() {
            r0 = this;
            r0.<init>()
            return
    }

    private static final <T> java.util.List<T> List(int r3, kotlin.jvm.functions.Function1<? super java.lang.Integer, ? extends T> r4) {
            java.lang.String r0 = "init"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r3)
            r1 = 0
        Lb:
            if (r1 >= r3) goto L1b
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            java.lang.Object r2 = r4.invoke(r2)
            r0.add(r2)
            int r1 = r1 + 1
            goto Lb
        L1b:
            java.util.List r0 = (java.util.List) r0
            return r0
    }

    private static final <T> java.util.List<T> MutableList(int r5, kotlin.jvm.functions.Function1<? super java.lang.Integer, ? extends T> r6) {
            java.lang.String r0 = "init"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r5)
            r1 = 0
        Lb:
            if (r1 >= r5) goto L1d
            r2 = r1
            r3 = 0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            java.lang.Object r4 = r6.invoke(r4)
            r0.add(r4)
            int r1 = r1 + 1
            goto Lb
        L1d:
            r1 = r0
            java.util.List r1 = (java.util.List) r1
            return r1
    }

    private static final <T> java.util.ArrayList<T> arrayListOf() {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            return r0
    }

    public static final <T> java.util.ArrayList<T> arrayListOf(T... r3) {
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            int r0 = r3.length
            if (r0 != 0) goto Le
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            goto L1b
        Le:
            java.util.ArrayList r0 = new java.util.ArrayList
            kotlin.collections.ArrayAsCollection r1 = new kotlin.collections.ArrayAsCollection
            r2 = 1
            r1.<init>(r3, r2)
            java.util.Collection r1 = (java.util.Collection) r1
            r0.<init>(r1)
        L1b:
            return r0
    }

    public static final <T> java.util.Collection<T> asCollection(T[] r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            kotlin.collections.ArrayAsCollection r0 = new kotlin.collections.ArrayAsCollection
            r1 = 0
            r0.<init>(r2, r1)
            java.util.Collection r0 = (java.util.Collection) r0
            return r0
    }

    public static final <T> int binarySearch(java.util.List<? extends T> r5, int r6, int r7, kotlin.jvm.functions.Function1<? super T, java.lang.Integer> r8) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "comparison"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            int r0 = r5.size()
            rangeCheck$CollectionsKt__CollectionsKt(r0, r6, r7)
            r0 = r6
            int r1 = r7 + (-1)
        L14:
            if (r0 > r1) goto L33
            int r2 = r0 + r1
            int r2 = r2 >>> 1
            java.lang.Object r3 = r5.get(r2)
            java.lang.Object r4 = r8.invoke(r3)
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            if (r4 >= 0) goto L2d
            int r0 = r2 + 1
            goto L14
        L2d:
            if (r4 <= 0) goto L32
            int r1 = r2 + (-1)
            goto L14
        L32:
            return r2
        L33:
            int r2 = r0 + 1
            int r2 = -r2
            return r2
    }

    public static final <T extends java.lang.Comparable<? super T>> int binarySearch(java.util.List<? extends T> r5, T r6, int r7, int r8) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            int r0 = r5.size()
            rangeCheck$CollectionsKt__CollectionsKt(r0, r7, r8)
            r0 = r7
            int r1 = r8 + (-1)
        Lf:
            if (r0 > r1) goto L2a
            int r2 = r0 + r1
            int r2 = r2 >>> 1
            java.lang.Object r3 = r5.get(r2)
            java.lang.Comparable r3 = (java.lang.Comparable) r3
            int r4 = kotlin.comparisons.ComparisonsKt.compareValues(r3, r6)
            if (r4 >= 0) goto L24
            int r0 = r2 + 1
            goto Lf
        L24:
            if (r4 <= 0) goto L29
            int r1 = r2 + (-1)
            goto Lf
        L29:
            return r2
        L2a:
            int r2 = r0 + 1
            int r2 = -r2
            return r2
    }

    public static final <T> int binarySearch(java.util.List<? extends T> r5, T r6, java.util.Comparator<? super T> r7, int r8, int r9) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "comparator"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            int r0 = r5.size()
            rangeCheck$CollectionsKt__CollectionsKt(r0, r8, r9)
            r0 = r8
            int r1 = r9 + (-1)
        L14:
            if (r0 > r1) goto L2d
            int r2 = r0 + r1
            int r2 = r2 >>> 1
            java.lang.Object r3 = r5.get(r2)
            int r4 = r7.compare(r3, r6)
            if (r4 >= 0) goto L27
            int r0 = r2 + 1
            goto L14
        L27:
            if (r4 <= 0) goto L2c
            int r1 = r2 + (-1)
            goto L14
        L2c:
            return r2
        L2d:
            int r2 = r0 + 1
            int r2 = -r2
            return r2
    }

    public static /* synthetic */ int binarySearch$default(java.util.List r0, int r1, int r2, kotlin.jvm.functions.Function1 r3, int r4, java.lang.Object r5) {
            r5 = r4 & 1
            if (r5 == 0) goto L5
            r1 = 0
        L5:
            r4 = r4 & 2
            if (r4 == 0) goto Ld
            int r2 = r0.size()
        Ld:
            int r0 = kotlin.collections.CollectionsKt.binarySearch(r0, r1, r2, r3)
            return r0
    }

    public static /* synthetic */ int binarySearch$default(java.util.List r0, java.lang.Comparable r1, int r2, int r3, int r4, java.lang.Object r5) {
            r5 = r4 & 2
            if (r5 == 0) goto L5
            r2 = 0
        L5:
            r4 = r4 & 4
            if (r4 == 0) goto Ld
            int r3 = r0.size()
        Ld:
            int r0 = kotlin.collections.CollectionsKt.binarySearch(r0, r1, r2, r3)
            return r0
    }

    public static /* synthetic */ int binarySearch$default(java.util.List r0, java.lang.Object r1, java.util.Comparator r2, int r3, int r4, int r5, java.lang.Object r6) {
            r6 = r5 & 4
            if (r6 == 0) goto L5
            r3 = 0
        L5:
            r5 = r5 & 8
            if (r5 == 0) goto Ld
            int r4 = r0.size()
        Ld:
            int r0 = kotlin.collections.CollectionsKt.binarySearch(r0, r1, r2, r3, r4)
            return r0
    }

    public static final <T, K extends java.lang.Comparable<? super K>> int binarySearchBy(java.util.List<? extends T> r2, K r3, int r4, int r5, kotlin.jvm.functions.Function1<? super T, ? extends K> r6) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            r0 = 0
            kotlin.collections.CollectionsKt__CollectionsKt$binarySearchBy$1 r1 = new kotlin.collections.CollectionsKt__CollectionsKt$binarySearchBy$1
            r1.<init>(r6, r3)
            kotlin.jvm.functions.Function1 r1 = (kotlin.jvm.functions.Function1) r1
            int r1 = kotlin.collections.CollectionsKt.binarySearch(r2, r4, r5, r1)
            return r1
    }

    public static /* synthetic */ int binarySearchBy$default(java.util.List r0, java.lang.Comparable r1, int r2, int r3, kotlin.jvm.functions.Function1 r4, int r5, java.lang.Object r6) {
            r6 = r5 & 2
            if (r6 == 0) goto L5
            r2 = 0
        L5:
            r5 = r5 & 4
            if (r5 == 0) goto Ld
            int r3 = r0.size()
        Ld:
            java.lang.String r5 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r5)
            java.lang.String r5 = "selector"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r5)
            r5 = 0
            kotlin.collections.CollectionsKt__CollectionsKt$binarySearchBy$1 r6 = new kotlin.collections.CollectionsKt__CollectionsKt$binarySearchBy$1
            r6.<init>(r4, r1)
            kotlin.jvm.functions.Function1 r6 = (kotlin.jvm.functions.Function1) r6
            int r6 = kotlin.collections.CollectionsKt.binarySearch(r0, r2, r3, r6)
            return r6
    }

    private static final <E> java.util.List<E> buildList(int r1, kotlin.jvm.functions.Function1<? super java.util.List<E>, kotlin.Unit> r2) {
            java.lang.String r0 = "builderAction"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.util.List r0 = kotlin.collections.CollectionsKt.createListBuilder(r1)
            r2.invoke(r0)
            java.util.List r0 = kotlin.collections.CollectionsKt.build(r0)
            return r0
    }

    private static final <E> java.util.List<E> buildList(kotlin.jvm.functions.Function1<? super java.util.List<E>, kotlin.Unit> r1) {
            java.lang.String r0 = "builderAction"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.util.List r0 = kotlin.collections.CollectionsKt.createListBuilder()
            r1.invoke(r0)
            java.util.List r0 = kotlin.collections.CollectionsKt.build(r0)
            return r0
    }

    public static final java.lang.Object[] collectionToArrayCommonImpl(java.util.Collection<?> r5) {
            java.lang.String r0 = "collection"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto Lf
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            return r0
        Lf:
            int r0 = r5.size()
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.util.Iterator r1 = r5.iterator()
            r2 = 0
        L1a:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L2a
            int r3 = r2 + 1
            java.lang.Object r4 = r1.next()
            r0[r2] = r4
            r2 = r3
            goto L1a
        L2a:
            return r0
    }

    public static final <T> T[] collectionToArrayCommonImpl(java.util.Collection<?> r5, T[] r6) {
            java.lang.String r0 = "collection"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "array"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L16
            r0 = 0
            java.lang.Object[] r0 = kotlin.collections.CollectionsKt.terminateCollectionToArray(r0, r6)
            return r0
        L16:
            int r0 = r6.length
            int r1 = r5.size()
            if (r0 >= r1) goto L26
            int r0 = r5.size()
            java.lang.Object[] r0 = kotlin.collections.ArraysKt.arrayOfNulls(r6, r0)
            goto L27
        L26:
            r0 = r6
        L27:
            java.util.Iterator r1 = r5.iterator()
            r2 = 0
        L2d:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L3d
            int r3 = r2 + 1
            java.lang.Object r4 = r1.next()
            r0[r2] = r4
            r2 = r3
            goto L2d
        L3d:
            int r3 = r5.size()
            java.lang.Object[] r3 = kotlin.collections.CollectionsKt.terminateCollectionToArray(r3, r0)
            return r3
    }

    private static final <T> boolean containsAll(java.util.Collection<? extends T> r1, java.util.Collection<? extends T> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            boolean r0 = r1.containsAll(r2)
            return r0
    }

    public static final <T> java.util.List<T> emptyList() {
            kotlin.collections.EmptyList r0 = kotlin.collections.EmptyList.INSTANCE
            java.util.List r0 = (java.util.List) r0
            return r0
    }

    public static final kotlin.ranges.IntRange getIndices(java.util.Collection<?> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            kotlin.ranges.IntRange r0 = new kotlin.ranges.IntRange
            int r1 = r3.size()
            int r1 = r1 + (-1)
            r2 = 0
            r0.<init>(r2, r1)
            return r0
    }

    public static final <T> int getLastIndex(java.util.List<? extends T> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            int r0 = r1.size()
            int r0 = r0 + (-1)
            return r0
    }

    /* JADX WARN: Incorrect types in method signature: <C::Ljava/util/Collection<*>;:TR;R:Ljava/lang/Object;>(TC;Lkotlin/jvm/functions/Function0<+TR;>;)TR; */
    private static final java.lang.Object ifEmpty(java.util.Collection r1, kotlin.jvm.functions.Function0 r2) {
            java.lang.String r0 = "defaultValue"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L11
            java.lang.Object r0 = r2.invoke()
            goto L12
        L11:
            r0 = r1
        L12:
            return r0
    }

    private static final <T> boolean isNotEmpty(java.util.Collection<? extends T> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            boolean r0 = r1.isEmpty()
            r0 = r0 ^ 1
            return r0
    }

    private static final <T> boolean isNullOrEmpty(java.util.Collection<? extends T> r1) {
            if (r1 == 0) goto Lc
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto La
            goto Lc
        La:
            r0 = 0
            goto Ld
        Lc:
            r0 = 1
        Ld:
            return r0
    }

    private static final <T> java.util.List<T> listOf() {
            java.util.List r0 = kotlin.collections.CollectionsKt.emptyList()
            return r0
    }

    public static final <T> java.util.List<T> listOf(T... r1) {
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            int r0 = r1.length
            if (r0 <= 0) goto Ld
            java.util.List r0 = kotlin.collections.ArraysKt.asList(r1)
            goto L11
        Ld:
            java.util.List r0 = kotlin.collections.CollectionsKt.emptyList()
        L11:
            return r0
    }

    public static final <T> java.util.List<T> listOfNotNull(T r1) {
            if (r1 == 0) goto L7
            java.util.List r0 = kotlin.collections.CollectionsKt.listOf(r1)
            goto Lb
        L7:
            java.util.List r0 = kotlin.collections.CollectionsKt.emptyList()
        Lb:
            return r0
    }

    public static final <T> java.util.List<T> listOfNotNull(T... r1) {
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.util.List r0 = kotlin.collections.ArraysKt.filterNotNull(r1)
            return r0
    }

    private static final <T> java.util.List<T> mutableListOf() {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List r0 = (java.util.List) r0
            return r0
    }

    public static final <T> java.util.List<T> mutableListOf(T... r3) {
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            int r0 = r3.length
            if (r0 != 0) goto Le
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            goto L1b
        Le:
            java.util.ArrayList r0 = new java.util.ArrayList
            kotlin.collections.ArrayAsCollection r1 = new kotlin.collections.ArrayAsCollection
            r2 = 1
            r1.<init>(r3, r2)
            java.util.Collection r1 = (java.util.Collection) r1
            r0.<init>(r1)
        L1b:
            java.util.List r0 = (java.util.List) r0
            return r0
    }

    public static final <T> java.util.List<T> optimizeReadOnlyList(java.util.List<? extends T> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            int r0 = r1.size()
            switch(r0) {
                case 0: goto L18;
                case 1: goto Le;
                default: goto Lc;
            }
        Lc:
            r0 = r1
            goto L1c
        Le:
            r0 = 0
            java.lang.Object r0 = r1.get(r0)
            java.util.List r0 = kotlin.collections.CollectionsKt.listOf(r0)
            goto L1c
        L18:
            java.util.List r0 = kotlin.collections.CollectionsKt.emptyList()
        L1c:
            return r0
    }

    private static final <T> java.util.Collection<T> orEmpty(java.util.Collection<? extends T> r1) {
            if (r1 != 0) goto L9
            java.util.List r0 = kotlin.collections.CollectionsKt.emptyList()
            java.util.Collection r0 = (java.util.Collection) r0
            goto La
        L9:
            r0 = r1
        La:
            return r0
    }

    private static final <T> java.util.List<T> orEmpty(java.util.List<? extends T> r1) {
            if (r1 != 0) goto L7
            java.util.List r0 = kotlin.collections.CollectionsKt.emptyList()
            goto L8
        L7:
            r0 = r1
        L8:
            return r0
    }

    private static final void rangeCheck$CollectionsKt__CollectionsKt(int r4, int r5, int r6) {
            java.lang.String r0 = ")."
            java.lang.String r1 = "fromIndex ("
            if (r5 > r6) goto L50
            if (r5 < 0) goto L33
            if (r6 > r4) goto Lc
            return
        Lc:
            java.lang.IndexOutOfBoundsException r1 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "toIndex ("
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r6)
            java.lang.String r3 = ") is greater than size ("
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r4)
            java.lang.StringBuilder r0 = r2.append(r0)
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L33:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.StringBuilder r1 = r2.append(r1)
            java.lang.StringBuilder r1 = r1.append(r5)
            java.lang.String r2 = ") is less than zero."
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L50:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.StringBuilder r1 = r3.append(r1)
            java.lang.StringBuilder r1 = r1.append(r5)
            java.lang.String r3 = ") is greater than toIndex ("
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.StringBuilder r1 = r1.append(r6)
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            throw r2
    }

    public static final <T> java.util.List<T> shuffled(java.lang.Iterable<? extends T> r3, kotlin.random.Random r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "random"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.util.List r0 = kotlin.collections.CollectionsKt.toMutableList(r3)
            r1 = r0
            r2 = 0
            kotlin.collections.CollectionsKt.shuffle(r1, r4)
            return r0
    }

    public static final void throwCountOverflow() {
            java.lang.ArithmeticException r0 = new java.lang.ArithmeticException
            java.lang.String r1 = "Count overflow has happened."
            r0.<init>(r1)
            throw r0
    }

    public static final void throwIndexOverflow() {
            java.lang.ArithmeticException r0 = new java.lang.ArithmeticException
            java.lang.String r1 = "Index overflow has happened."
            r0.<init>(r1)
            throw r0
    }
}
