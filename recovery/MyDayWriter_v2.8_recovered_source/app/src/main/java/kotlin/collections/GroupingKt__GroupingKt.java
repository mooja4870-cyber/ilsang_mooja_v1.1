package kotlin.collections;

/* JADX INFO: compiled from: Grouping.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u001a\u009e\u0001\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0004\"\u0004\b\u0001\u0010\u0002\"\u0004\b\u0002\u0010\u0003*\u000e\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u00020\u00052b\u0010\u0006\u001a^\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0015\u0012\u0013\u0018\u0001H\u0003¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u0011H\u0004¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\r¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u0002H\u00030\u0007H\u0087\bø\u0001\u0000\u001a·\u0001\u0010\u000f\u001a\u0002H\u0010\"\u0004\b\u0000\u0010\u0004\"\u0004\b\u0001\u0010\u0002\"\u0004\b\u0002\u0010\u0003\"\u0016\b\u0003\u0010\u0010*\u0010\u0012\u0006\b\u0000\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0011*\u000e\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u00020\u00052\u0006\u0010\u0012\u001a\u0002H\u00102b\u0010\u0006\u001a^\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0015\u0012\u0013\u0018\u0001H\u0003¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u0011H\u0004¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\r¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u0002H\u00030\u0007H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\u0013\u001aI\u0010\u0014\u001a\u0002H\u0010\"\u0004\b\u0000\u0010\u0004\"\u0004\b\u0001\u0010\u0002\"\u0016\b\u0002\u0010\u0010*\u0010\u0012\u0006\b\u0000\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00150\u0011*\u000e\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u00020\u00052\u0006\u0010\u0012\u001a\u0002H\u0010H\u0007¢\u0006\u0002\u0010\u0016\u001a¿\u0001\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0004\"\u0004\b\u0001\u0010\u0002\"\u0004\b\u0002\u0010\u0003*\u000e\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u00020\u000526\u0010\u0018\u001a2\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u0011H\u0004¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\f\u0012\u0004\u0012\u0002H\u00030\u00192K\u0010\u0006\u001aG\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u0011H\u0003¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u0011H\u0004¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\f\u0012\u0004\u0012\u0002H\u00030\u001aH\u0087\bø\u0001\u0000\u001a\u007f\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0004\"\u0004\b\u0001\u0010\u0002\"\u0004\b\u0002\u0010\u0003*\u000e\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u00020\u00052\u0006\u0010\u001b\u001a\u0002H\u000326\u0010\u0006\u001a2\u0012\u0013\u0012\u0011H\u0003¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u0011H\u0004¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\f\u0012\u0004\u0012\u0002H\u00030\u0019H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\u001c\u001aØ\u0001\u0010\u001d\u001a\u0002H\u0010\"\u0004\b\u0000\u0010\u0004\"\u0004\b\u0001\u0010\u0002\"\u0004\b\u0002\u0010\u0003\"\u0016\b\u0003\u0010\u0010*\u0010\u0012\u0006\b\u0000\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0011*\u000e\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u00020\u00052\u0006\u0010\u0012\u001a\u0002H\u001026\u0010\u0018\u001a2\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u0011H\u0004¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\f\u0012\u0004\u0012\u0002H\u00030\u00192K\u0010\u0006\u001aG\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u0011H\u0003¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u0011H\u0004¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\f\u0012\u0004\u0012\u0002H\u00030\u001aH\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\u001e\u001a\u0093\u0001\u0010\u001d\u001a\u0002H\u0010\"\u0004\b\u0000\u0010\u0004\"\u0004\b\u0001\u0010\u0002\"\u0004\b\u0002\u0010\u0003\"\u0016\b\u0003\u0010\u0010*\u0010\u0012\u0006\b\u0000\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0011*\u000e\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u00020\u00052\u0006\u0010\u0012\u001a\u0002H\u00102\u0006\u0010\u001b\u001a\u0002H\u000326\u0010\u0006\u001a2\u0012\u0013\u0012\u0011H\u0003¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u0011H\u0004¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\f\u0012\u0004\u0012\u0002H\u00030\u0019H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\u001f\u001a\u008b\u0001\u0010 \u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H!0\u0001\"\u0004\b\u0000\u0010!\"\b\b\u0001\u0010\u0004*\u0002H!\"\u0004\b\u0002\u0010\u0002*\u000e\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u00020\u00052K\u0010\u0006\u001aG\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u0011H!¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u0011H\u0004¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\f\u0012\u0004\u0012\u0002H!0\u001aH\u0087\bø\u0001\u0000\u001a¤\u0001\u0010\"\u001a\u0002H\u0010\"\u0004\b\u0000\u0010!\"\b\b\u0001\u0010\u0004*\u0002H!\"\u0004\b\u0002\u0010\u0002\"\u0016\b\u0003\u0010\u0010*\u0010\u0012\u0006\b\u0000\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H!0\u0011*\u000e\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u00020\u00052\u0006\u0010\u0012\u001a\u0002H\u00102K\u0010\u0006\u001aG\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u0011H!¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u0011H\u0004¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\f\u0012\u0004\u0012\u0002H!0\u001aH\u0087\bø\u0001\u0000¢\u0006\u0002\u0010#\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006$"}, d2 = {"aggregate", "", "K", "R", "T", "Lkotlin/collections/Grouping;", "operation", "Lkotlin/Function4;", "Lkotlin/ParameterName;", "name", "key", "accumulator", "element", "", "first", "aggregateTo", "M", "", "destination", "(Lkotlin/collections/Grouping;Ljava/util/Map;Lkotlin/jvm/functions/Function4;)Ljava/util/Map;", "eachCountTo", "", "(Lkotlin/collections/Grouping;Ljava/util/Map;)Ljava/util/Map;", "fold", "initialValueSelector", "Lkotlin/Function2;", "Lkotlin/Function3;", "initialValue", "(Lkotlin/collections/Grouping;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/util/Map;", "foldTo", "(Lkotlin/collections/Grouping;Ljava/util/Map;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;)Ljava/util/Map;", "(Lkotlin/collections/Grouping;Ljava/util/Map;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/util/Map;", "reduce", "S", "reduceTo", "(Lkotlin/collections/Grouping;Ljava/util/Map;Lkotlin/jvm/functions/Function3;)Ljava/util/Map;", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/collections/GroupingKt")
class GroupingKt__GroupingKt extends kotlin.collections.GroupingKt__GroupingJVMKt {
    public GroupingKt__GroupingKt() {
            r0 = this;
            r0.<init>()
            return
    }

    public static final <T, K, R> java.util.Map<K, R> aggregate(kotlin.collections.Grouping<T, ? extends K> r9, kotlin.jvm.functions.Function4<? super K, ? super R, ? super T, ? super java.lang.Boolean, ? extends R> r10) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r0 = "operation"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            r0 = 0
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            java.util.Map r1 = (java.util.Map) r1
            r2 = r9
            r3 = 0
            java.util.Iterator r4 = r2.sourceIterator()
        L18:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L41
            java.lang.Object r5 = r4.next()
            java.lang.Object r6 = r2.keyOf(r5)
            java.lang.Object r7 = r1.get(r6)
            if (r7 != 0) goto L34
            boolean r8 = r1.containsKey(r6)
            if (r8 != 0) goto L34
            r8 = 1
            goto L35
        L34:
            r8 = 0
        L35:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            java.lang.Object r8 = r10.invoke(r6, r7, r5, r8)
            r1.put(r6, r8)
            goto L18
        L41:
            return r1
    }

    public static final <T, K, R, M extends java.util.Map<? super K, R>> M aggregateTo(kotlin.collections.Grouping<T, ? extends K> r6, M r7, kotlin.jvm.functions.Function4<? super K, ? super R, ? super T, ? super java.lang.Boolean, ? extends R> r8) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "destination"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "operation"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r0 = 0
            java.util.Iterator r1 = r6.sourceIterator()
        L14:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L3d
            java.lang.Object r2 = r1.next()
            java.lang.Object r3 = r6.keyOf(r2)
            java.lang.Object r4 = r7.get(r3)
            if (r4 != 0) goto L30
            boolean r5 = r7.containsKey(r3)
            if (r5 != 0) goto L30
            r5 = 1
            goto L31
        L30:
            r5 = 0
        L31:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            java.lang.Object r5 = r8.invoke(r3, r4, r2, r5)
            r7.put(r3, r5)
            goto L14
        L3d:
            return r7
    }

    public static final <T, K, M extends java.util.Map<? super K, java.lang.Integer>> M eachCountTo(kotlin.collections.Grouping<T, ? extends K> r19, M r20) {
            r0 = r20
            java.lang.String r1 = "<this>"
            r2 = r19
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r1)
            java.lang.String r1 = "destination"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            r1 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            r4 = r19
            r5 = 0
            r6 = r4
            r7 = 0
            java.util.Iterator r8 = r6.sourceIterator()
        L1c:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L58
            java.lang.Object r9 = r8.next()
            java.lang.Object r10 = r6.keyOf(r9)
            java.lang.Object r11 = r0.get(r10)
            r12 = 1
            if (r11 != 0) goto L39
            boolean r13 = r0.containsKey(r10)
            if (r13 != 0) goto L39
            r13 = r12
            goto L3a
        L39:
            r13 = r1
        L3a:
            r14 = r9
            r15 = r11
            r16 = 0
            if (r13 == 0) goto L43
            r17 = r3
            goto L45
        L43:
            r17 = r15
        L45:
            java.lang.Number r17 = (java.lang.Number) r17
            int r17 = r17.intValue()
            r18 = 0
            int r17 = r17 + 1
            java.lang.Integer r12 = java.lang.Integer.valueOf(r17)
            r0.put(r10, r12)
            goto L1c
        L58:
            return r0
    }

    public static final <T, K, R> java.util.Map<K, R> fold(kotlin.collections.Grouping<T, ? extends K> r17, R r18, kotlin.jvm.functions.Function2<? super R, ? super T, ? extends R> r19) {
            r0 = r19
            java.lang.String r1 = "<this>"
            r2 = r17
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r1)
            java.lang.String r1 = "operation"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            r1 = 0
            r3 = r17
            r4 = 0
            java.util.LinkedHashMap r5 = new java.util.LinkedHashMap
            r5.<init>()
            java.util.Map r5 = (java.util.Map) r5
            r6 = r3
            r7 = 0
            java.util.Iterator r8 = r6.sourceIterator()
        L1f:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L51
            java.lang.Object r9 = r8.next()
            java.lang.Object r10 = r6.keyOf(r9)
            java.lang.Object r11 = r5.get(r10)
            if (r11 != 0) goto L3b
            boolean r12 = r5.containsKey(r10)
            if (r12 != 0) goto L3b
            r12 = 1
            goto L3c
        L3b:
            r12 = 0
        L3c:
            r13 = r11
            r14 = r9
            r15 = 0
            r16 = r1
            if (r12 == 0) goto L46
            r1 = r18
            goto L47
        L46:
            r1 = r13
        L47:
            java.lang.Object r1 = r0.invoke(r1, r14)
            r5.put(r10, r1)
            r1 = r16
            goto L1f
        L51:
            return r5
    }

    public static final <T, K, R> java.util.Map<K, R> fold(kotlin.collections.Grouping<T, ? extends K> r19, kotlin.jvm.functions.Function2<? super K, ? super T, ? extends R> r20, kotlin.jvm.functions.Function3<? super K, ? super R, ? super T, ? extends R> r21) {
            r0 = r20
            r1 = r21
            java.lang.String r2 = "<this>"
            r3 = r19
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r2)
            java.lang.String r2 = "initialValueSelector"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r2)
            java.lang.String r2 = "operation"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            r2 = 0
            r4 = r19
            r5 = 0
            java.util.LinkedHashMap r6 = new java.util.LinkedHashMap
            r6.<init>()
            java.util.Map r6 = (java.util.Map) r6
            r7 = r4
            r8 = 0
            java.util.Iterator r9 = r7.sourceIterator()
        L26:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L67
            java.lang.Object r10 = r9.next()
            java.lang.Object r11 = r7.keyOf(r10)
            java.lang.Object r12 = r6.get(r11)
            if (r12 != 0) goto L42
            boolean r13 = r6.containsKey(r11)
            if (r13 != 0) goto L42
            r13 = 1
            goto L43
        L42:
            r13 = 0
        L43:
            r14 = r12
            r15 = r10
            r16 = r11
            r17 = 0
            if (r13 == 0) goto L56
            r18 = r2
            r2 = r16
            java.lang.Object r16 = r0.invoke(r2, r15)
            r0 = r16
            goto L5b
        L56:
            r18 = r2
            r2 = r16
            r0 = r14
        L5b:
            java.lang.Object r0 = r1.invoke(r2, r0, r15)
            r6.put(r11, r0)
            r0 = r20
            r2 = r18
            goto L26
        L67:
            return r6
    }

    public static final <T, K, R, M extends java.util.Map<? super K, R>> M foldTo(kotlin.collections.Grouping<T, ? extends K> r12, M r13, R r14, kotlin.jvm.functions.Function2<? super R, ? super T, ? extends R> r15) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            java.lang.String r0 = "destination"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            java.lang.String r0 = "operation"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
            r0 = 0
            r1 = r12
            r2 = 0
            java.util.Iterator r3 = r1.sourceIterator()
        L16:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L43
            java.lang.Object r4 = r3.next()
            java.lang.Object r5 = r1.keyOf(r4)
            java.lang.Object r6 = r13.get(r5)
            if (r6 != 0) goto L32
            boolean r7 = r13.containsKey(r5)
            if (r7 != 0) goto L32
            r7 = 1
            goto L33
        L32:
            r7 = 0
        L33:
            r8 = r4
            r9 = r6
            r10 = 0
            if (r7 == 0) goto L3a
            r11 = r14
            goto L3b
        L3a:
            r11 = r9
        L3b:
            java.lang.Object r7 = r15.invoke(r11, r8)
            r13.put(r5, r7)
            goto L16
        L43:
            return r13
    }

    public static final <T, K, R, M extends java.util.Map<? super K, R>> M foldTo(kotlin.collections.Grouping<T, ? extends K> r17, M r18, kotlin.jvm.functions.Function2<? super K, ? super T, ? extends R> r19, kotlin.jvm.functions.Function3<? super K, ? super R, ? super T, ? extends R> r20) {
            r0 = r18
            r1 = r19
            r2 = r20
            java.lang.String r3 = "<this>"
            r4 = r17
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r3)
            java.lang.String r3 = "destination"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r3)
            java.lang.String r3 = "initialValueSelector"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r3)
            java.lang.String r3 = "operation"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r3)
            r3 = 0
            r5 = r17
            r6 = 0
            java.util.Iterator r7 = r5.sourceIterator()
        L24:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L59
            java.lang.Object r8 = r7.next()
            java.lang.Object r9 = r5.keyOf(r8)
            java.lang.Object r10 = r0.get(r9)
            if (r10 != 0) goto L40
            boolean r11 = r0.containsKey(r9)
            if (r11 != 0) goto L40
            r11 = 1
            goto L41
        L40:
            r11 = 0
        L41:
            r12 = r9
            r13 = r8
            r14 = r10
            r15 = 0
            if (r11 == 0) goto L4e
            java.lang.Object r16 = r1.invoke(r12, r13)
            r1 = r16
            goto L4f
        L4e:
            r1 = r14
        L4f:
            java.lang.Object r1 = r2.invoke(r12, r1, r13)
            r0.put(r9, r1)
            r1 = r19
            goto L24
        L59:
            return r0
    }

    public static final <S, T extends S, K> java.util.Map<K, S> reduce(kotlin.collections.Grouping<T, ? extends K> r18, kotlin.jvm.functions.Function3<? super K, ? super S, ? super T, ? extends S> r19) {
            r0 = r19
            java.lang.String r1 = "<this>"
            r2 = r18
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r1)
            java.lang.String r1 = "operation"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            r1 = 0
            r3 = r18
            r4 = 0
            java.util.LinkedHashMap r5 = new java.util.LinkedHashMap
            r5.<init>()
            java.util.Map r5 = (java.util.Map) r5
            r6 = r3
            r7 = 0
            java.util.Iterator r8 = r6.sourceIterator()
        L1f:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L4e
            java.lang.Object r9 = r8.next()
            java.lang.Object r10 = r6.keyOf(r9)
            java.lang.Object r11 = r5.get(r10)
            if (r11 != 0) goto L3b
            boolean r12 = r5.containsKey(r10)
            if (r12 != 0) goto L3b
            r12 = 1
            goto L3c
        L3b:
            r12 = 0
        L3c:
            r13 = r10
            r14 = r11
            r15 = r9
            r16 = 0
            if (r12 == 0) goto L44
            goto L4a
        L44:
            java.lang.Object r17 = r0.invoke(r13, r14, r15)
            r15 = r17
        L4a:
            r5.put(r10, r15)
            goto L1f
        L4e:
            return r5
    }

    public static final <S, T extends S, K, M extends java.util.Map<? super K, S>> M reduceTo(kotlin.collections.Grouping<T, ? extends K> r13, M r14, kotlin.jvm.functions.Function3<? super K, ? super S, ? super T, ? extends S> r15) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            java.lang.String r0 = "destination"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            java.lang.String r0 = "operation"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
            r0 = 0
            r1 = r13
            r2 = 0
            java.util.Iterator r3 = r1.sourceIterator()
        L16:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L43
            java.lang.Object r4 = r3.next()
            java.lang.Object r5 = r1.keyOf(r4)
            java.lang.Object r6 = r14.get(r5)
            if (r6 != 0) goto L32
            boolean r7 = r14.containsKey(r5)
            if (r7 != 0) goto L32
            r7 = 1
            goto L33
        L32:
            r7 = 0
        L33:
            r8 = r6
            r9 = r5
            r10 = r4
            r11 = 0
            if (r7 == 0) goto L3a
            goto L3f
        L3a:
            java.lang.Object r12 = r15.invoke(r9, r8, r10)
            r10 = r12
        L3f:
            r14.put(r5, r10)
            goto L16
        L43:
            return r14
    }
}
