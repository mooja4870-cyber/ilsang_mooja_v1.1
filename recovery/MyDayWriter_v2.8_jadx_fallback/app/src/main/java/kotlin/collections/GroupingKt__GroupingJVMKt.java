package kotlin.collections;

/* JADX INFO: compiled from: GroupingJVM.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010&\n\u0000\u001a0\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00030\u0001\"\u0004\b\u0000\u0010\u0004\"\u0004\b\u0001\u0010\u0002*\u000e\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u00020\u0005H\u0007\u001aZ\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\b0\u0007\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\t\"\u0004\b\u0002\u0010\b*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\t0\u00072\u001e\u0010\n\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\t0\f\u0012\u0004\u0012\u0002H\b0\u000bH\u0081\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\r"}, d2 = {"eachCount", "", "K", "", "T", "Lkotlin/collections/Grouping;", "mapValuesInPlace", "", "R", "V", "f", "Lkotlin/Function1;", "", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/collections/GroupingKt")
class GroupingKt__GroupingJVMKt {
    public GroupingKt__GroupingJVMKt() {
            r0 = this;
            r0.<init>()
            return
    }

    public static final <T, K> java.util.Map<K, java.lang.Integer> eachCount(kotlin.collections.Grouping<T, ? extends K> r20) {
            java.lang.String r0 = "<this>"
            r1 = r20
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.util.Map r0 = (java.util.Map) r0
            r2 = r20
            r3 = 0
            r4 = r2
            r5 = 0
            java.util.Iterator r6 = r4.sourceIterator()
        L17:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L63
            java.lang.Object r7 = r6.next()
            java.lang.Object r8 = r4.keyOf(r7)
            java.lang.Object r9 = r0.get(r8)
            if (r9 != 0) goto L33
            boolean r11 = r0.containsKey(r8)
            if (r11 != 0) goto L33
            r11 = 1
            goto L34
        L33:
            r11 = 0
        L34:
            r12 = r9
            r13 = r8
            r14 = r7
            r15 = 0
            if (r11 == 0) goto L42
            r16 = 0
            kotlin.jvm.internal.Ref$IntRef r17 = new kotlin.jvm.internal.Ref$IntRef
            r17.<init>()
            goto L44
        L42:
            r17 = r12
        L44:
            r16 = 1
            r10 = r17
            kotlin.jvm.internal.Ref$IntRef r10 = (kotlin.jvm.internal.Ref.IntRef) r10
            r17 = 0
            r18 = r10
            r19 = 0
            r1 = r18
            r18 = r2
            int r2 = r1.element
            int r2 = r2 + 1
            r1.element = r2
            r0.put(r8, r10)
            r1 = r20
            r2 = r18
            goto L17
        L63:
            r18 = r2
            java.util.Set r1 = r0.entrySet()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        L70:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L97
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.String r3 = "null cannot be cast to non-null type kotlin.collections.MutableMap.MutableEntry<K of kotlin.collections.GroupingKt__GroupingJVMKt.mapValuesInPlace$lambda$4, R of kotlin.collections.GroupingKt__GroupingJVMKt.mapValuesInPlace$lambda$4>"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2, r3)
            java.util.Map$Entry r3 = kotlin.jvm.internal.TypeIntrinsics.asMutableMapEntry(r2)
            r4 = 0
            java.lang.Object r5 = r2.getValue()
            kotlin.jvm.internal.Ref$IntRef r5 = (kotlin.jvm.internal.Ref.IntRef) r5
            int r2 = r5.element
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.setValue(r2)
            goto L70
        L97:
            java.util.Map r0 = kotlin.jvm.internal.TypeIntrinsics.asMutableMap(r0)
            return r0
    }

    private static final <K, V, R> java.util.Map<K, R> mapValuesInPlace(java.util.Map<K, V> r8, kotlin.jvm.functions.Function1<? super java.util.Map.Entry<? extends K, ? extends V>, ? extends R> r9) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "f"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.util.Set r0 = r8.entrySet()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            r1 = 0
            java.util.Iterator r2 = r0.iterator()
        L15:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L36
            java.lang.Object r3 = r2.next()
            r4 = r3
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            r5 = 0
            java.lang.String r6 = "null cannot be cast to non-null type kotlin.collections.MutableMap.MutableEntry<K of kotlin.collections.GroupingKt__GroupingJVMKt.mapValuesInPlace$lambda$4, R of kotlin.collections.GroupingKt__GroupingJVMKt.mapValuesInPlace$lambda$4>"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4, r6)
            java.util.Map$Entry r6 = kotlin.jvm.internal.TypeIntrinsics.asMutableMapEntry(r4)
            java.lang.Object r7 = r9.invoke(r4)
            r6.setValue(r7)
            goto L15
        L36:
            java.util.Map r0 = kotlin.jvm.internal.TypeIntrinsics.asMutableMap(r8)
            return r0
    }
}
