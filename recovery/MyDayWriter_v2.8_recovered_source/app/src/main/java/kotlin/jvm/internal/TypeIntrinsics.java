package kotlin.jvm.internal;

/* JADX INFO: loaded from: classes.dex */
public class TypeIntrinsics {
    public TypeIntrinsics() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.util.Collection asMutableCollection(java.lang.Object r1) {
            boolean r0 = r1 instanceof kotlin.jvm.internal.markers.KMappedMarker
            if (r0 == 0) goto Ld
            boolean r0 = r1 instanceof kotlin.jvm.internal.markers.KMutableCollection
            if (r0 != 0) goto Ld
            java.lang.String r0 = "kotlin.collections.MutableCollection"
            throwCce(r1, r0)
        Ld:
            java.util.Collection r0 = castToCollection(r1)
            return r0
    }

    public static java.util.Collection asMutableCollection(java.lang.Object r1, java.lang.String r2) {
            boolean r0 = r1 instanceof kotlin.jvm.internal.markers.KMappedMarker
            if (r0 == 0) goto Lb
            boolean r0 = r1 instanceof kotlin.jvm.internal.markers.KMutableCollection
            if (r0 != 0) goto Lb
            throwCce(r2)
        Lb:
            java.util.Collection r0 = castToCollection(r1)
            return r0
    }

    public static java.lang.Iterable asMutableIterable(java.lang.Object r1) {
            boolean r0 = r1 instanceof kotlin.jvm.internal.markers.KMappedMarker
            if (r0 == 0) goto Ld
            boolean r0 = r1 instanceof kotlin.jvm.internal.markers.KMutableIterable
            if (r0 != 0) goto Ld
            java.lang.String r0 = "kotlin.collections.MutableIterable"
            throwCce(r1, r0)
        Ld:
            java.lang.Iterable r0 = castToIterable(r1)
            return r0
    }

    public static java.lang.Iterable asMutableIterable(java.lang.Object r1, java.lang.String r2) {
            boolean r0 = r1 instanceof kotlin.jvm.internal.markers.KMappedMarker
            if (r0 == 0) goto Lb
            boolean r0 = r1 instanceof kotlin.jvm.internal.markers.KMutableIterable
            if (r0 != 0) goto Lb
            throwCce(r2)
        Lb:
            java.lang.Iterable r0 = castToIterable(r1)
            return r0
    }

    public static java.util.Iterator asMutableIterator(java.lang.Object r1) {
            boolean r0 = r1 instanceof kotlin.jvm.internal.markers.KMappedMarker
            if (r0 == 0) goto Ld
            boolean r0 = r1 instanceof kotlin.jvm.internal.markers.KMutableIterator
            if (r0 != 0) goto Ld
            java.lang.String r0 = "kotlin.collections.MutableIterator"
            throwCce(r1, r0)
        Ld:
            java.util.Iterator r0 = castToIterator(r1)
            return r0
    }

    public static java.util.Iterator asMutableIterator(java.lang.Object r1, java.lang.String r2) {
            boolean r0 = r1 instanceof kotlin.jvm.internal.markers.KMappedMarker
            if (r0 == 0) goto Lb
            boolean r0 = r1 instanceof kotlin.jvm.internal.markers.KMutableIterator
            if (r0 != 0) goto Lb
            throwCce(r2)
        Lb:
            java.util.Iterator r0 = castToIterator(r1)
            return r0
    }

    public static java.util.List asMutableList(java.lang.Object r1) {
            boolean r0 = r1 instanceof kotlin.jvm.internal.markers.KMappedMarker
            if (r0 == 0) goto Ld
            boolean r0 = r1 instanceof kotlin.jvm.internal.markers.KMutableList
            if (r0 != 0) goto Ld
            java.lang.String r0 = "kotlin.collections.MutableList"
            throwCce(r1, r0)
        Ld:
            java.util.List r0 = castToList(r1)
            return r0
    }

    public static java.util.List asMutableList(java.lang.Object r1, java.lang.String r2) {
            boolean r0 = r1 instanceof kotlin.jvm.internal.markers.KMappedMarker
            if (r0 == 0) goto Lb
            boolean r0 = r1 instanceof kotlin.jvm.internal.markers.KMutableList
            if (r0 != 0) goto Lb
            throwCce(r2)
        Lb:
            java.util.List r0 = castToList(r1)
            return r0
    }

    public static java.util.ListIterator asMutableListIterator(java.lang.Object r1) {
            boolean r0 = r1 instanceof kotlin.jvm.internal.markers.KMappedMarker
            if (r0 == 0) goto Ld
            boolean r0 = r1 instanceof kotlin.jvm.internal.markers.KMutableListIterator
            if (r0 != 0) goto Ld
            java.lang.String r0 = "kotlin.collections.MutableListIterator"
            throwCce(r1, r0)
        Ld:
            java.util.ListIterator r0 = castToListIterator(r1)
            return r0
    }

    public static java.util.ListIterator asMutableListIterator(java.lang.Object r1, java.lang.String r2) {
            boolean r0 = r1 instanceof kotlin.jvm.internal.markers.KMappedMarker
            if (r0 == 0) goto Lb
            boolean r0 = r1 instanceof kotlin.jvm.internal.markers.KMutableListIterator
            if (r0 != 0) goto Lb
            throwCce(r2)
        Lb:
            java.util.ListIterator r0 = castToListIterator(r1)
            return r0
    }

    public static java.util.Map asMutableMap(java.lang.Object r1) {
            boolean r0 = r1 instanceof kotlin.jvm.internal.markers.KMappedMarker
            if (r0 == 0) goto Ld
            boolean r0 = r1 instanceof kotlin.jvm.internal.markers.KMutableMap
            if (r0 != 0) goto Ld
            java.lang.String r0 = "kotlin.collections.MutableMap"
            throwCce(r1, r0)
        Ld:
            java.util.Map r0 = castToMap(r1)
            return r0
    }

    public static java.util.Map asMutableMap(java.lang.Object r1, java.lang.String r2) {
            boolean r0 = r1 instanceof kotlin.jvm.internal.markers.KMappedMarker
            if (r0 == 0) goto Lb
            boolean r0 = r1 instanceof kotlin.jvm.internal.markers.KMutableMap
            if (r0 != 0) goto Lb
            throwCce(r2)
        Lb:
            java.util.Map r0 = castToMap(r1)
            return r0
    }

    public static java.util.Map.Entry asMutableMapEntry(java.lang.Object r1) {
            boolean r0 = r1 instanceof kotlin.jvm.internal.markers.KMappedMarker
            if (r0 == 0) goto Ld
            boolean r0 = r1 instanceof kotlin.jvm.internal.markers.KMutableMap.Entry
            if (r0 != 0) goto Ld
            java.lang.String r0 = "kotlin.collections.MutableMap.MutableEntry"
            throwCce(r1, r0)
        Ld:
            java.util.Map$Entry r0 = castToMapEntry(r1)
            return r0
    }

    public static java.util.Map.Entry asMutableMapEntry(java.lang.Object r1, java.lang.String r2) {
            boolean r0 = r1 instanceof kotlin.jvm.internal.markers.KMappedMarker
            if (r0 == 0) goto Lb
            boolean r0 = r1 instanceof kotlin.jvm.internal.markers.KMutableMap.Entry
            if (r0 != 0) goto Lb
            throwCce(r2)
        Lb:
            java.util.Map$Entry r0 = castToMapEntry(r1)
            return r0
    }

    public static java.util.Set asMutableSet(java.lang.Object r1) {
            boolean r0 = r1 instanceof kotlin.jvm.internal.markers.KMappedMarker
            if (r0 == 0) goto Ld
            boolean r0 = r1 instanceof kotlin.jvm.internal.markers.KMutableSet
            if (r0 != 0) goto Ld
            java.lang.String r0 = "kotlin.collections.MutableSet"
            throwCce(r1, r0)
        Ld:
            java.util.Set r0 = castToSet(r1)
            return r0
    }

    public static java.util.Set asMutableSet(java.lang.Object r1, java.lang.String r2) {
            boolean r0 = r1 instanceof kotlin.jvm.internal.markers.KMappedMarker
            if (r0 == 0) goto Lb
            boolean r0 = r1 instanceof kotlin.jvm.internal.markers.KMutableSet
            if (r0 != 0) goto Lb
            throwCce(r2)
        Lb:
            java.util.Set r0 = castToSet(r1)
            return r0
    }

    public static java.lang.Object beforeCheckcastToFunctionOfArity(java.lang.Object r2, int r3) {
            if (r2 == 0) goto L1e
            boolean r0 = isFunctionOfArity(r2, r3)
            if (r0 != 0) goto L1e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "kotlin.jvm.functions.Function"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.String r0 = r0.toString()
            throwCce(r2, r0)
        L1e:
            return r2
    }

    public static java.lang.Object beforeCheckcastToFunctionOfArity(java.lang.Object r1, int r2, java.lang.String r3) {
            if (r1 == 0) goto Lb
            boolean r0 = isFunctionOfArity(r1, r2)
            if (r0 != 0) goto Lb
            throwCce(r3)
        Lb:
            return r1
    }

    public static java.util.Collection castToCollection(java.lang.Object r2) {
            r0 = r2
            java.util.Collection r0 = (java.util.Collection) r0     // Catch: java.lang.ClassCastException -> L4
            return r0
        L4:
            r0 = move-exception
            java.lang.ClassCastException r1 = throwCce(r0)
            throw r1
    }

    public static java.lang.Iterable castToIterable(java.lang.Object r2) {
            r0 = r2
            java.lang.Iterable r0 = (java.lang.Iterable) r0     // Catch: java.lang.ClassCastException -> L4
            return r0
        L4:
            r0 = move-exception
            java.lang.ClassCastException r1 = throwCce(r0)
            throw r1
    }

    public static java.util.Iterator castToIterator(java.lang.Object r2) {
            r0 = r2
            java.util.Iterator r0 = (java.util.Iterator) r0     // Catch: java.lang.ClassCastException -> L4
            return r0
        L4:
            r0 = move-exception
            java.lang.ClassCastException r1 = throwCce(r0)
            throw r1
    }

    public static java.util.List castToList(java.lang.Object r2) {
            r0 = r2
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.ClassCastException -> L4
            return r0
        L4:
            r0 = move-exception
            java.lang.ClassCastException r1 = throwCce(r0)
            throw r1
    }

    public static java.util.ListIterator castToListIterator(java.lang.Object r2) {
            r0 = r2
            java.util.ListIterator r0 = (java.util.ListIterator) r0     // Catch: java.lang.ClassCastException -> L4
            return r0
        L4:
            r0 = move-exception
            java.lang.ClassCastException r1 = throwCce(r0)
            throw r1
    }

    public static java.util.Map castToMap(java.lang.Object r2) {
            r0 = r2
            java.util.Map r0 = (java.util.Map) r0     // Catch: java.lang.ClassCastException -> L4
            return r0
        L4:
            r0 = move-exception
            java.lang.ClassCastException r1 = throwCce(r0)
            throw r1
    }

    public static java.util.Map.Entry castToMapEntry(java.lang.Object r2) {
            r0 = r2
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.ClassCastException -> L4
            return r0
        L4:
            r0 = move-exception
            java.lang.ClassCastException r1 = throwCce(r0)
            throw r1
    }

    public static java.util.Set castToSet(java.lang.Object r2) {
            r0 = r2
            java.util.Set r0 = (java.util.Set) r0     // Catch: java.lang.ClassCastException -> L4
            return r0
        L4:
            r0 = move-exception
            java.lang.ClassCastException r1 = throwCce(r0)
            throw r1
    }

    public static int getFunctionArity(java.lang.Object r1) {
            boolean r0 = r1 instanceof kotlin.jvm.internal.FunctionBase
            if (r0 == 0) goto Lc
            r0 = r1
            kotlin.jvm.internal.FunctionBase r0 = (kotlin.jvm.internal.FunctionBase) r0
            int r0 = r0.getArity()
            return r0
        Lc:
            boolean r0 = r1 instanceof kotlin.jvm.functions.Function0
            if (r0 == 0) goto L12
            r0 = 0
            return r0
        L12:
            boolean r0 = r1 instanceof kotlin.jvm.functions.Function1
            if (r0 == 0) goto L18
            r0 = 1
            return r0
        L18:
            boolean r0 = r1 instanceof kotlin.jvm.functions.Function2
            if (r0 == 0) goto L1e
            r0 = 2
            return r0
        L1e:
            boolean r0 = r1 instanceof kotlin.jvm.functions.Function3
            if (r0 == 0) goto L24
            r0 = 3
            return r0
        L24:
            boolean r0 = r1 instanceof kotlin.jvm.functions.Function4
            if (r0 == 0) goto L2a
            r0 = 4
            return r0
        L2a:
            boolean r0 = r1 instanceof kotlin.jvm.functions.Function5
            if (r0 == 0) goto L30
            r0 = 5
            return r0
        L30:
            boolean r0 = r1 instanceof kotlin.jvm.functions.Function6
            if (r0 == 0) goto L36
            r0 = 6
            return r0
        L36:
            boolean r0 = r1 instanceof kotlin.jvm.functions.Function7
            if (r0 == 0) goto L3c
            r0 = 7
            return r0
        L3c:
            boolean r0 = r1 instanceof kotlin.jvm.functions.Function8
            if (r0 == 0) goto L43
            r0 = 8
            return r0
        L43:
            boolean r0 = r1 instanceof kotlin.jvm.functions.Function9
            if (r0 == 0) goto L4a
            r0 = 9
            return r0
        L4a:
            boolean r0 = r1 instanceof kotlin.jvm.functions.Function10
            if (r0 == 0) goto L51
            r0 = 10
            return r0
        L51:
            boolean r0 = r1 instanceof kotlin.jvm.functions.Function11
            if (r0 == 0) goto L58
            r0 = 11
            return r0
        L58:
            boolean r0 = r1 instanceof kotlin.jvm.functions.Function12
            if (r0 == 0) goto L5f
            r0 = 12
            return r0
        L5f:
            boolean r0 = r1 instanceof kotlin.jvm.functions.Function13
            if (r0 == 0) goto L66
            r0 = 13
            return r0
        L66:
            boolean r0 = r1 instanceof kotlin.jvm.functions.Function14
            if (r0 == 0) goto L6d
            r0 = 14
            return r0
        L6d:
            boolean r0 = r1 instanceof kotlin.jvm.functions.Function15
            if (r0 == 0) goto L74
            r0 = 15
            return r0
        L74:
            boolean r0 = r1 instanceof kotlin.jvm.functions.Function16
            if (r0 == 0) goto L7b
            r0 = 16
            return r0
        L7b:
            boolean r0 = r1 instanceof kotlin.jvm.functions.Function17
            if (r0 == 0) goto L82
            r0 = 17
            return r0
        L82:
            boolean r0 = r1 instanceof kotlin.jvm.functions.Function18
            if (r0 == 0) goto L89
            r0 = 18
            return r0
        L89:
            boolean r0 = r1 instanceof kotlin.jvm.functions.Function19
            if (r0 == 0) goto L90
            r0 = 19
            return r0
        L90:
            boolean r0 = r1 instanceof kotlin.jvm.functions.Function20
            if (r0 == 0) goto L97
            r0 = 20
            return r0
        L97:
            boolean r0 = r1 instanceof kotlin.jvm.functions.Function21
            if (r0 == 0) goto L9e
            r0 = 21
            return r0
        L9e:
            boolean r0 = r1 instanceof kotlin.jvm.functions.Function22
            if (r0 == 0) goto La5
            r0 = 22
            return r0
        La5:
            r0 = -1
            return r0
    }

    public static boolean isFunctionOfArity(java.lang.Object r1, int r2) {
            boolean r0 = r1 instanceof kotlin.Function
            if (r0 == 0) goto Lc
            int r0 = getFunctionArity(r1)
            if (r0 != r2) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    public static boolean isMutableCollection(java.lang.Object r1) {
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto Le
            boolean r0 = r1 instanceof kotlin.jvm.internal.markers.KMappedMarker
            if (r0 == 0) goto Lc
            boolean r0 = r1 instanceof kotlin.jvm.internal.markers.KMutableCollection
            if (r0 == 0) goto Le
        Lc:
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    public static boolean isMutableIterable(java.lang.Object r1) {
            boolean r0 = r1 instanceof java.lang.Iterable
            if (r0 == 0) goto Le
            boolean r0 = r1 instanceof kotlin.jvm.internal.markers.KMappedMarker
            if (r0 == 0) goto Lc
            boolean r0 = r1 instanceof kotlin.jvm.internal.markers.KMutableIterable
            if (r0 == 0) goto Le
        Lc:
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    public static boolean isMutableIterator(java.lang.Object r1) {
            boolean r0 = r1 instanceof java.util.Iterator
            if (r0 == 0) goto Le
            boolean r0 = r1 instanceof kotlin.jvm.internal.markers.KMappedMarker
            if (r0 == 0) goto Lc
            boolean r0 = r1 instanceof kotlin.jvm.internal.markers.KMutableIterator
            if (r0 == 0) goto Le
        Lc:
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    public static boolean isMutableList(java.lang.Object r1) {
            boolean r0 = r1 instanceof java.util.List
            if (r0 == 0) goto Le
            boolean r0 = r1 instanceof kotlin.jvm.internal.markers.KMappedMarker
            if (r0 == 0) goto Lc
            boolean r0 = r1 instanceof kotlin.jvm.internal.markers.KMutableList
            if (r0 == 0) goto Le
        Lc:
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    public static boolean isMutableListIterator(java.lang.Object r1) {
            boolean r0 = r1 instanceof java.util.ListIterator
            if (r0 == 0) goto Le
            boolean r0 = r1 instanceof kotlin.jvm.internal.markers.KMappedMarker
            if (r0 == 0) goto Lc
            boolean r0 = r1 instanceof kotlin.jvm.internal.markers.KMutableListIterator
            if (r0 == 0) goto Le
        Lc:
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    public static boolean isMutableMap(java.lang.Object r1) {
            boolean r0 = r1 instanceof java.util.Map
            if (r0 == 0) goto Le
            boolean r0 = r1 instanceof kotlin.jvm.internal.markers.KMappedMarker
            if (r0 == 0) goto Lc
            boolean r0 = r1 instanceof kotlin.jvm.internal.markers.KMutableMap
            if (r0 == 0) goto Le
        Lc:
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    public static boolean isMutableMapEntry(java.lang.Object r1) {
            boolean r0 = r1 instanceof java.util.Map.Entry
            if (r0 == 0) goto Le
            boolean r0 = r1 instanceof kotlin.jvm.internal.markers.KMappedMarker
            if (r0 == 0) goto Lc
            boolean r0 = r1 instanceof kotlin.jvm.internal.markers.KMutableMap.Entry
            if (r0 == 0) goto Le
        Lc:
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    public static boolean isMutableSet(java.lang.Object r1) {
            boolean r0 = r1 instanceof java.util.Set
            if (r0 == 0) goto Le
            boolean r0 = r1 instanceof kotlin.jvm.internal.markers.KMappedMarker
            if (r0 == 0) goto Lc
            boolean r0 = r1 instanceof kotlin.jvm.internal.markers.KMutableSet
            if (r0 == 0) goto Le
        Lc:
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    private static <T extends java.lang.Throwable> T sanitizeStackTrace(T r1) {
            java.lang.Class<kotlin.jvm.internal.TypeIntrinsics> r0 = kotlin.jvm.internal.TypeIntrinsics.class
            java.lang.String r0 = r0.getName()
            java.lang.Throwable r0 = kotlin.jvm.internal.Intrinsics.sanitizeStackTrace(r1, r0)
            return r0
    }

    public static java.lang.ClassCastException throwCce(java.lang.ClassCastException r1) {
            java.lang.Throwable r0 = sanitizeStackTrace(r1)
            java.lang.ClassCastException r0 = (java.lang.ClassCastException) r0
            throw r0
    }

    public static void throwCce(java.lang.Object r3, java.lang.String r4) {
            if (r3 != 0) goto L5
            java.lang.String r0 = "null"
            goto Ld
        L5:
            java.lang.Class r0 = r3.getClass()
            java.lang.String r0 = r0.getName()
        Ld:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r1 = r1.append(r0)
            java.lang.String r2 = " cannot be cast to "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r4)
            java.lang.String r1 = r1.toString()
            throwCce(r1)
            return
    }

    public static void throwCce(java.lang.String r1) {
            java.lang.ClassCastException r0 = new java.lang.ClassCastException
            r0.<init>(r1)
            java.lang.ClassCastException r0 = throwCce(r0)
            throw r0
    }
}
