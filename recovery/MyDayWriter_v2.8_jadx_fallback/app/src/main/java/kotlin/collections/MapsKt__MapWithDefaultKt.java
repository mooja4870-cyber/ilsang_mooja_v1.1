package kotlin.collections;

/* JADX INFO: compiled from: MapWithDefault.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\b\u0002\u001a3\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001aQ\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00010\u0003\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00010\u00032!\u0010\b\u001a\u001d\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u0002H\u00010\t\u001aX\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00010\f\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00010\f2!\u0010\b\u001a\u001d\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u0002H\u00010\tH\u0007¢\u0006\u0002\b\r¨\u0006\u000e"}, d2 = {"getOrImplicitDefault", "V", "K", "", "key", "getOrImplicitDefaultNullable", "(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;", "withDefault", "defaultValue", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "", "withDefaultMutable", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/collections/MapsKt")
class MapsKt__MapWithDefaultKt {
    public MapsKt__MapWithDefaultKt() {
            r0 = this;
            r0.<init>()
            return
    }

    public static final <K, V> V getOrImplicitDefaultNullable(java.util.Map<K, ? extends V> r7, K r8) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            boolean r0 = r7 instanceof kotlin.collections.MapWithDefault
            if (r0 == 0) goto L11
            r0 = r7
            kotlin.collections.MapWithDefault r0 = (kotlin.collections.MapWithDefault) r0
            java.lang.Object r0 = r0.getOrImplicitDefault(r8)
            return r0
        L11:
            r0 = r7
            r1 = 0
            java.lang.Object r2 = r0.get(r8)
            if (r2 != 0) goto L40
            boolean r3 = r0.containsKey(r8)
            if (r3 == 0) goto L20
            goto L40
        L20:
            r3 = 0
            java.util.NoSuchElementException r4 = new java.util.NoSuchElementException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Key "
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.StringBuilder r5 = r5.append(r8)
            java.lang.String r6 = " is missing in the map."
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L40:
            return r2
    }

    public static final <K, V> java.util.Map<K, V> withDefault(java.util.Map<K, ? extends V> r1, kotlin.jvm.functions.Function1<? super K, ? extends V> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "defaultValue"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            boolean r0 = r1 instanceof kotlin.collections.MapWithDefault
            if (r0 == 0) goto L1b
            r0 = r1
            kotlin.collections.MapWithDefault r0 = (kotlin.collections.MapWithDefault) r0
            java.util.Map r0 = r0.getMap()
            java.util.Map r0 = kotlin.collections.MapsKt.withDefault(r0, r2)
            goto L22
        L1b:
            kotlin.collections.MapWithDefaultImpl r0 = new kotlin.collections.MapWithDefaultImpl
            r0.<init>(r1, r2)
            java.util.Map r0 = (java.util.Map) r0
        L22:
            return r0
    }

    public static final <K, V> java.util.Map<K, V> withDefaultMutable(java.util.Map<K, V> r1, kotlin.jvm.functions.Function1<? super K, ? extends V> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "defaultValue"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            boolean r0 = r1 instanceof kotlin.collections.MutableMapWithDefault
            if (r0 == 0) goto L1b
            r0 = r1
            kotlin.collections.MutableMapWithDefault r0 = (kotlin.collections.MutableMapWithDefault) r0
            java.util.Map r0 = r0.getMap()
            java.util.Map r0 = kotlin.collections.MapsKt.withDefaultMutable(r0, r2)
            goto L22
        L1b:
            kotlin.collections.MutableMapWithDefaultImpl r0 = new kotlin.collections.MutableMapWithDefaultImpl
            r0.<init>(r1, r2)
            java.util.Map r0 = (java.util.Map) r0
        L22:
            return r0
    }
}
