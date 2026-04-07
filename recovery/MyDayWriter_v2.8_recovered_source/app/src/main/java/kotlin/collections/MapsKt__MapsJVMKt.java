package kotlin.collections;

/* JADX INFO: compiled from: MapsJVM.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000d\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u000f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a4\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u00050\u0003\"\u0004\b\u0000\u0010\u0004\"\u0004\b\u0001\u0010\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u00050\u0007H\u0001\u001aQ\u0010\b\u001a\u000e\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u00050\u0003\"\u0004\b\u0000\u0010\u0004\"\u0004\b\u0001\u0010\u00052\u0006\u0010\t\u001a\u00020\u00012#\u0010\n\u001a\u001f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u00050\u0007\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0002\b\rH\u0081\bø\u0001\u0000\u001aI\u0010\b\u001a\u000e\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u00050\u0003\"\u0004\b\u0000\u0010\u0004\"\u0004\b\u0001\u0010\u00052#\u0010\n\u001a\u001f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u00050\u0007\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0002\b\rH\u0081\bø\u0001\u0000\u001a \u0010\u000e\u001a\u000e\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u00050\u0007\"\u0004\b\u0000\u0010\u0004\"\u0004\b\u0001\u0010\u0005H\u0001\u001a(\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u00050\u0007\"\u0004\b\u0000\u0010\u0004\"\u0004\b\u0001\u0010\u00052\u0006\u0010\t\u001a\u00020\u0001H\u0001\u001a\u0010\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u0001H\u0001\u001a2\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u00050\u0003\"\u0004\b\u0000\u0010\u0004\"\u0004\b\u0001\u0010\u00052\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u00050\u0013\u001aa\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u00050\u0015\"\u0004\b\u0000\u0010\u0004\"\u0004\b\u0001\u0010\u00052\u000e\u0010\u0016\u001a\n\u0012\u0006\b\u0000\u0012\u0002H\u00040\u00172*\u0010\u0018\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u00050\u00130\u0019\"\u000e\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u00050\u0013H\u0007¢\u0006\u0002\u0010\u001a\u001aY\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u00050\u0015\"\u000e\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u001b\"\u0004\b\u0001\u0010\u00052*\u0010\u0018\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u00050\u00130\u0019\"\u000e\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u00050\u0013¢\u0006\u0002\u0010\u001c\u001aC\u0010\u001d\u001a\u0002H\u0005\"\u0004\b\u0000\u0010\u0004\"\u0004\b\u0001\u0010\u0005*\u000e\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u00050\u001e2\u0006\u0010\u001f\u001a\u0002H\u00042\f\u0010 \u001a\b\u0012\u0004\u0012\u0002H\u00050!H\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\"\u001a\u0019\u0010#\u001a\u00020$*\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020%0\u0003H\u0087\b\u001a2\u0010&\u001a\u000e\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u00050\u0003\"\u0004\b\u0000\u0010\u0004\"\u0004\b\u0001\u0010\u0005*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u00050\u0003H\u0000\u001a1\u0010'\u001a\u000e\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u00050\u0003\"\u0004\b\u0000\u0010\u0004\"\u0004\b\u0001\u0010\u0005*\u000e\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u00050\u0003H\u0081\b\u001a:\u0010(\u001a\u000e\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u00050\u0015\"\u000e\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u001b\"\u0004\b\u0001\u0010\u0005*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u00050\u0003\u001a@\u0010(\u001a\u000e\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u00050\u0015\"\u0004\b\u0000\u0010\u0004\"\u0004\b\u0001\u0010\u0005*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u00050\u00032\u000e\u0010\u0016\u001a\n\u0012\u0006\b\u0000\u0012\u0002H\u00040\u0017\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006)"}, d2 = {"INT_MAX_POWER_OF_TWO", "", "build", "", "K", "V", "builder", "", "buildMapInternal", "capacity", "builderAction", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "createMapBuilder", "mapCapacity", "expectedSize", "mapOf", "pair", "Lkotlin/Pair;", "sortedMapOf", "Ljava/util/SortedMap;", "comparator", "Ljava/util/Comparator;", "pairs", "", "(Ljava/util/Comparator;[Lkotlin/Pair;)Ljava/util/SortedMap;", "", "([Lkotlin/Pair;)Ljava/util/SortedMap;", "getOrPut", "Ljava/util/concurrent/ConcurrentMap;", "key", "defaultValue", "Lkotlin/Function0;", "(Ljava/util/concurrent/ConcurrentMap;Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "toProperties", "Ljava/util/Properties;", "", "toSingletonMap", "toSingletonMapOrSelf", "toSortedMap", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/collections/MapsKt")
class MapsKt__MapsJVMKt extends kotlin.collections.MapsKt__MapWithDefaultKt {
    private static final int INT_MAX_POWER_OF_TWO = 1073741824;

    public MapsKt__MapsJVMKt() {
            r0 = this;
            r0.<init>()
            return
    }

    public static final <K, V> java.util.Map<K, V> build(java.util.Map<K, V> r1) {
            java.lang.String r0 = "builder"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            r0 = r1
            kotlin.collections.builders.MapBuilder r0 = (kotlin.collections.builders.MapBuilder) r0
            java.util.Map r0 = r0.build()
            return r0
    }

    private static final <K, V> java.util.Map<K, V> buildMapInternal(int r1, kotlin.jvm.functions.Function1<? super java.util.Map<K, V>, kotlin.Unit> r2) {
            java.lang.String r0 = "builderAction"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.util.Map r0 = kotlin.collections.MapsKt.createMapBuilder(r1)
            r2.invoke(r0)
            java.util.Map r0 = kotlin.collections.MapsKt.build(r0)
            return r0
    }

    private static final <K, V> java.util.Map<K, V> buildMapInternal(kotlin.jvm.functions.Function1<? super java.util.Map<K, V>, kotlin.Unit> r1) {
            java.lang.String r0 = "builderAction"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.util.Map r0 = kotlin.collections.MapsKt.createMapBuilder()
            r1.invoke(r0)
            java.util.Map r0 = kotlin.collections.MapsKt.build(r0)
            return r0
    }

    public static final <K, V> java.util.Map<K, V> createMapBuilder() {
            kotlin.collections.builders.MapBuilder r0 = new kotlin.collections.builders.MapBuilder
            r0.<init>()
            java.util.Map r0 = (java.util.Map) r0
            return r0
    }

    public static final <K, V> java.util.Map<K, V> createMapBuilder(int r1) {
            kotlin.collections.builders.MapBuilder r0 = new kotlin.collections.builders.MapBuilder
            r0.<init>(r1)
            java.util.Map r0 = (java.util.Map) r0
            return r0
    }

    public static final <K, V> V getOrPut(java.util.concurrent.ConcurrentMap<K, V> r4, K r5, kotlin.jvm.functions.Function0<? extends V> r6) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "defaultValue"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            r0 = 0
            java.lang.Object r1 = r4.get(r5)
            if (r1 != 0) goto L1e
            java.lang.Object r1 = r6.invoke()
            r2 = 0
            java.lang.Object r3 = r4.putIfAbsent(r5, r1)
            if (r3 != 0) goto L1d
            goto L1e
        L1d:
            r1 = r3
        L1e:
            return r1
    }

    public static final int mapCapacity(int r2) {
            if (r2 >= 0) goto L5
            r0 = r2
            goto L1b
        L5:
            r0 = 3
            if (r2 >= r0) goto Lb
            int r0 = r2 + 1
            goto L1b
        Lb:
            r0 = 1073741824(0x40000000, float:2.0)
            if (r2 >= r0) goto L18
            float r0 = (float) r2
            r1 = 1061158912(0x3f400000, float:0.75)
            float r0 = r0 / r1
            r1 = 1065353216(0x3f800000, float:1.0)
            float r0 = r0 + r1
            int r0 = (int) r0
            goto L1b
        L18:
            r0 = 2147483647(0x7fffffff, float:NaN)
        L1b:
            return r0
    }

    public static final <K, V> java.util.Map<K, V> mapOf(kotlin.Pair<? extends K, ? extends V> r2) {
            java.lang.String r0 = "pair"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.Object r0 = r2.getFirst()
            java.lang.Object r1 = r2.getSecond()
            java.util.Map r0 = java.util.Collections.singletonMap(r0, r1)
            java.lang.String r1 = "singletonMap(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    public static final <K, V> java.util.SortedMap<K, V> sortedMapOf(java.util.Comparator<? super K> r4, kotlin.Pair<? extends K, ? extends V>... r5) {
            java.lang.String r0 = "comparator"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "pairs"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.util.TreeMap r0 = new java.util.TreeMap
            r0.<init>(r4)
            r1 = r0
            r2 = 0
            r3 = r1
            java.util.Map r3 = (java.util.Map) r3
            kotlin.collections.MapsKt.putAll(r3, r5)
            java.util.SortedMap r0 = (java.util.SortedMap) r0
            return r0
    }

    public static final <K extends java.lang.Comparable<? super K>, V> java.util.SortedMap<K, V> sortedMapOf(kotlin.Pair<? extends K, ? extends V>... r4) {
            java.lang.String r0 = "pairs"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.util.TreeMap r0 = new java.util.TreeMap
            r0.<init>()
            r1 = r0
            r2 = 0
            r3 = r1
            java.util.Map r3 = (java.util.Map) r3
            kotlin.collections.MapsKt.putAll(r3, r4)
            java.util.SortedMap r0 = (java.util.SortedMap) r0
            return r0
    }

    private static final java.util.Properties toProperties(java.util.Map<java.lang.String, java.lang.String> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.util.Properties r0 = new java.util.Properties
            r0.<init>()
            r1 = r0
            r2 = 0
            r1.putAll(r3)
            return r0
    }

    public static final <K, V> java.util.Map<K, V> toSingletonMap(java.util.Map<? extends K, ? extends V> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.util.Set r0 = r4.entrySet()
            java.util.Iterator r0 = r0.iterator()
            java.lang.Object r0 = r0.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            r1 = 0
            java.lang.Object r2 = r0.getKey()
            java.lang.Object r3 = r0.getValue()
            java.util.Map r0 = java.util.Collections.singletonMap(r2, r3)
            java.lang.String r1 = "with(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    private static final <K, V> java.util.Map<K, V> toSingletonMapOrSelf(java.util.Map<K, ? extends V> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.util.Map r0 = kotlin.collections.MapsKt.toSingletonMap(r1)
            return r0
    }

    public static final <K extends java.lang.Comparable<? super K>, V> java.util.SortedMap<K, V> toSortedMap(java.util.Map<? extends K, ? extends V> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.util.TreeMap r0 = new java.util.TreeMap
            r0.<init>(r1)
            java.util.SortedMap r0 = (java.util.SortedMap) r0
            return r0
    }

    public static final <K, V> java.util.SortedMap<K, V> toSortedMap(java.util.Map<? extends K, ? extends V> r3, java.util.Comparator<? super K> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "comparator"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.util.TreeMap r0 = new java.util.TreeMap
            r0.<init>(r4)
            r1 = r0
            r2 = 0
            r1.putAll(r3)
            java.util.SortedMap r0 = (java.util.SortedMap) r0
            return r0
    }
}
