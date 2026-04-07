package kotlin.collections;

/* JADX INFO: compiled from: Arrays.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000H\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a5\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\f\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0018\u00010\u00032\u0010\u0010\u0004\u001a\f\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0018\u00010\u0003H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a#\u0010\u0007\u001a\u00020\b\"\u0004\b\u0000\u0010\u0002*\f\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0018\u00010\u0003H\u0001¢\u0006\u0004\b\t\u0010\n\u001a?\u0010\u000b\u001a\u00020\f\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u00032\n\u0010\r\u001a\u00060\u000ej\u0002`\u000f2\u0010\u0010\u0010\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a+\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0015\"\u0004\b\u0000\u0010\u0002*\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u00030\u0003¢\u0006\u0002\u0010\u0016\u001aH\u0010\u0017\u001a\u0002H\u0018\"\u0010\b\u0000\u0010\u0019*\u0006\u0012\u0002\b\u00030\u0003*\u0002H\u0018\"\u0004\b\u0001\u0010\u0018*\u0002H\u00192\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u0002H\u00180\u001bH\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0000¢\u0006\u0002\u0010\u001c\u001a)\u0010\u001d\u001a\u00020\u0001*\b\u0012\u0002\b\u0003\u0018\u00010\u0003H\u0087\b\u0082\u0002\u000e\n\f\b\u0000\u0012\u0002\u0018\u0001\u001a\u0004\b\u0003\u0010\u0000¢\u0006\u0002\u0010\u001e\u001aG\u0010\u001f\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00180\u00150 \"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0018*\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00180 0\u0003¢\u0006\u0002\u0010!\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\""}, d2 = {"contentDeepEqualsImpl", "", "T", "", "other", "contentDeepEquals", "([Ljava/lang/Object;[Ljava/lang/Object;)Z", "contentDeepToStringImpl", "", "contentDeepToString", "([Ljava/lang/Object;)Ljava/lang/String;", "contentDeepToStringInternal", "", "result", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "processed", "", "contentDeepToStringInternal$ArraysKt__ArraysKt", "([Ljava/lang/Object;Ljava/lang/StringBuilder;Ljava/util/List;)V", "flatten", "", "([[Ljava/lang/Object;)Ljava/util/List;", "ifEmpty", "R", "C", "defaultValue", "Lkotlin/Function0;", "([Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "isNullOrEmpty", "([Ljava/lang/Object;)Z", "unzip", "Lkotlin/Pair;", "([Lkotlin/Pair;)Lkotlin/Pair;", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/collections/ArraysKt")
class ArraysKt__ArraysKt extends kotlin.collections.ArraysKt__ArraysJVMKt {
    public ArraysKt__ArraysKt() {
            r0 = this;
            r0.<init>()
            return
    }

    public static final <T> boolean contentDeepEquals(T[] r8, T[] r9) {
            r0 = 1
            if (r8 != r9) goto L4
            return r0
        L4:
            r1 = 0
            if (r8 == 0) goto L160
            if (r9 == 0) goto L160
            int r2 = r8.length
            int r3 = r9.length
            if (r2 == r3) goto Lf
            goto L160
        Lf:
            r2 = 0
            int r3 = r8.length
        L11:
            if (r2 >= r3) goto L15f
            r4 = r8[r2]
            r5 = r9[r2]
            if (r4 != r5) goto L1b
            goto L15a
        L1b:
            if (r4 == 0) goto L15e
            if (r5 != 0) goto L21
            goto L15e
        L21:
            boolean r6 = r4 instanceof java.lang.Object[]
            if (r6 == 0) goto L37
            boolean r6 = r5 instanceof java.lang.Object[]
            if (r6 == 0) goto L37
            r6 = r4
            java.lang.Object[] r6 = (java.lang.Object[]) r6
            r7 = r5
            java.lang.Object[] r7 = (java.lang.Object[]) r7
            boolean r6 = kotlin.collections.ArraysKt.contentDeepEquals(r6, r7)
            if (r6 != 0) goto L15a
            return r1
        L37:
            boolean r6 = r4 instanceof byte[]
            if (r6 == 0) goto L4c
            boolean r6 = r5 instanceof byte[]
            if (r6 == 0) goto L4c
            r6 = r4
            byte[] r6 = (byte[]) r6
            r7 = r5
            byte[] r7 = (byte[]) r7
            boolean r6 = java.util.Arrays.equals(r6, r7)
            if (r6 != 0) goto L15a
            return r1
        L4c:
            boolean r6 = r4 instanceof short[]
            if (r6 == 0) goto L61
            boolean r6 = r5 instanceof short[]
            if (r6 == 0) goto L61
            r6 = r4
            short[] r6 = (short[]) r6
            r7 = r5
            short[] r7 = (short[]) r7
            boolean r6 = java.util.Arrays.equals(r6, r7)
            if (r6 != 0) goto L15a
            return r1
        L61:
            boolean r6 = r4 instanceof int[]
            if (r6 == 0) goto L76
            boolean r6 = r5 instanceof int[]
            if (r6 == 0) goto L76
            r6 = r4
            int[] r6 = (int[]) r6
            r7 = r5
            int[] r7 = (int[]) r7
            boolean r6 = java.util.Arrays.equals(r6, r7)
            if (r6 != 0) goto L15a
            return r1
        L76:
            boolean r6 = r4 instanceof long[]
            if (r6 == 0) goto L8b
            boolean r6 = r5 instanceof long[]
            if (r6 == 0) goto L8b
            r6 = r4
            long[] r6 = (long[]) r6
            r7 = r5
            long[] r7 = (long[]) r7
            boolean r6 = java.util.Arrays.equals(r6, r7)
            if (r6 != 0) goto L15a
            return r1
        L8b:
            boolean r6 = r4 instanceof float[]
            if (r6 == 0) goto La0
            boolean r6 = r5 instanceof float[]
            if (r6 == 0) goto La0
            r6 = r4
            float[] r6 = (float[]) r6
            r7 = r5
            float[] r7 = (float[]) r7
            boolean r6 = java.util.Arrays.equals(r6, r7)
            if (r6 != 0) goto L15a
            return r1
        La0:
            boolean r6 = r4 instanceof double[]
            if (r6 == 0) goto Lb5
            boolean r6 = r5 instanceof double[]
            if (r6 == 0) goto Lb5
            r6 = r4
            double[] r6 = (double[]) r6
            r7 = r5
            double[] r7 = (double[]) r7
            boolean r6 = java.util.Arrays.equals(r6, r7)
            if (r6 != 0) goto L15a
            return r1
        Lb5:
            boolean r6 = r4 instanceof char[]
            if (r6 == 0) goto Lca
            boolean r6 = r5 instanceof char[]
            if (r6 == 0) goto Lca
            r6 = r4
            char[] r6 = (char[]) r6
            r7 = r5
            char[] r7 = (char[]) r7
            boolean r6 = java.util.Arrays.equals(r6, r7)
            if (r6 != 0) goto L15a
            return r1
        Lca:
            boolean r6 = r4 instanceof boolean[]
            if (r6 == 0) goto Ldf
            boolean r6 = r5 instanceof boolean[]
            if (r6 == 0) goto Ldf
            r6 = r4
            boolean[] r6 = (boolean[]) r6
            r7 = r5
            boolean[] r7 = (boolean[]) r7
            boolean r6 = java.util.Arrays.equals(r6, r7)
            if (r6 != 0) goto L15a
            return r1
        Ldf:
            boolean r6 = r4 instanceof kotlin.UByteArray
            if (r6 == 0) goto Lfc
            boolean r6 = r5 instanceof kotlin.UByteArray
            if (r6 == 0) goto Lfc
            r6 = r4
            kotlin.UByteArray r6 = (kotlin.UByteArray) r6
            byte[] r6 = r6.m238unboximpl()
            r7 = r5
            kotlin.UByteArray r7 = (kotlin.UByteArray) r7
            byte[] r7 = r7.m238unboximpl()
            boolean r6 = kotlin.collections.unsigned.UArraysKt.m723contentEqualskV0jMPg(r6, r7)
            if (r6 != 0) goto L15a
            return r1
        Lfc:
            boolean r6 = r4 instanceof kotlin.UShortArray
            if (r6 == 0) goto L119
            boolean r6 = r5 instanceof kotlin.UShortArray
            if (r6 == 0) goto L119
            r6 = r4
            kotlin.UShortArray r6 = (kotlin.UShortArray) r6
            short[] r6 = r6.m501unboximpl()
            r7 = r5
            kotlin.UShortArray r7 = (kotlin.UShortArray) r7
            short[] r7 = r7.m501unboximpl()
            boolean r6 = kotlin.collections.unsigned.UArraysKt.m721contentEqualsFGO6Aew(r6, r7)
            if (r6 != 0) goto L15a
            return r1
        L119:
            boolean r6 = r4 instanceof kotlin.UIntArray
            if (r6 == 0) goto L136
            boolean r6 = r5 instanceof kotlin.UIntArray
            if (r6 == 0) goto L136
            r6 = r4
            kotlin.UIntArray r6 = (kotlin.UIntArray) r6
            int[] r6 = r6.m317unboximpl()
            r7 = r5
            kotlin.UIntArray r7 = (kotlin.UIntArray) r7
            int[] r7 = r7.m317unboximpl()
            boolean r6 = kotlin.collections.unsigned.UArraysKt.m722contentEqualsKJPZfPQ(r6, r7)
            if (r6 != 0) goto L15a
            return r1
        L136:
            boolean r6 = r4 instanceof kotlin.ULongArray
            if (r6 == 0) goto L153
            boolean r6 = r5 instanceof kotlin.ULongArray
            if (r6 == 0) goto L153
            r6 = r4
            kotlin.ULongArray r6 = (kotlin.ULongArray) r6
            long[] r6 = r6.m396unboximpl()
            r7 = r5
            kotlin.ULongArray r7 = (kotlin.ULongArray) r7
            long[] r7 = r7.m396unboximpl()
            boolean r6 = kotlin.collections.unsigned.UArraysKt.m724contentEqualslec5QzE(r6, r7)
            if (r6 != 0) goto L15a
            return r1
        L153:
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual(r4, r5)
            if (r6 != 0) goto L15a
            return r1
        L15a:
            int r2 = r2 + 1
            goto L11
        L15e:
            return r1
        L15f:
            return r0
        L160:
            return r1
    }

    public static final <T> java.lang.String contentDeepToString(T[] r5) {
            if (r5 != 0) goto L5
            java.lang.String r0 = "null"
            return r0
        L5:
            int r0 = r5.length
            r1 = 429496729(0x19999999, float:1.5881867E-23)
            int r0 = kotlin.ranges.RangesKt.coerceAtMost(r0, r1)
            int r0 = r0 * 5
            int r0 = r0 + 2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r2 = r1
            r3 = 0
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.List r4 = (java.util.List) r4
            contentDeepToStringInternal$ArraysKt__ArraysKt(r5, r2, r4)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "toString(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            return r1
    }

    private static final <T> void contentDeepToStringInternal$ArraysKt__ArraysKt(T[] r5, java.lang.StringBuilder r6, java.util.List<java.lang.Object[]> r7) {
            boolean r0 = r7.contains(r5)
            if (r0 == 0) goto Lc
            java.lang.String r0 = "[...]"
            r6.append(r0)
            return
        Lc:
            r7.add(r5)
            r0 = 91
            r6.append(r0)
            r0 = 0
            int r1 = r5.length
        L16:
            if (r0 >= r1) goto L130
            if (r0 == 0) goto L1f
            java.lang.String r2 = ", "
            r6.append(r2)
        L1f:
            r2 = r5[r0]
            if (r2 != 0) goto L2b
            java.lang.String r3 = "null"
            r6.append(r3)
            goto L12c
        L2b:
            boolean r3 = r2 instanceof java.lang.Object[]
            if (r3 == 0) goto L37
            r3 = r2
            java.lang.Object[] r3 = (java.lang.Object[]) r3
            contentDeepToStringInternal$ArraysKt__ArraysKt(r3, r6, r7)
            goto L12c
        L37:
            boolean r3 = r2 instanceof byte[]
            java.lang.String r4 = "toString(...)"
            if (r3 == 0) goto L4c
            r3 = r2
            byte[] r3 = (byte[]) r3
            java.lang.String r3 = java.util.Arrays.toString(r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            r6.append(r3)
            goto L12c
        L4c:
            boolean r3 = r2 instanceof short[]
            if (r3 == 0) goto L5f
            r3 = r2
            short[] r3 = (short[]) r3
            java.lang.String r3 = java.util.Arrays.toString(r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            r6.append(r3)
            goto L12c
        L5f:
            boolean r3 = r2 instanceof int[]
            if (r3 == 0) goto L72
            r3 = r2
            int[] r3 = (int[]) r3
            java.lang.String r3 = java.util.Arrays.toString(r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            r6.append(r3)
            goto L12c
        L72:
            boolean r3 = r2 instanceof long[]
            if (r3 == 0) goto L85
            r3 = r2
            long[] r3 = (long[]) r3
            java.lang.String r3 = java.util.Arrays.toString(r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            r6.append(r3)
            goto L12c
        L85:
            boolean r3 = r2 instanceof float[]
            if (r3 == 0) goto L98
            r3 = r2
            float[] r3 = (float[]) r3
            java.lang.String r3 = java.util.Arrays.toString(r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            r6.append(r3)
            goto L12c
        L98:
            boolean r3 = r2 instanceof double[]
            if (r3 == 0) goto Lab
            r3 = r2
            double[] r3 = (double[]) r3
            java.lang.String r3 = java.util.Arrays.toString(r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            r6.append(r3)
            goto L12c
        Lab:
            boolean r3 = r2 instanceof char[]
            if (r3 == 0) goto Lbe
            r3 = r2
            char[] r3 = (char[]) r3
            java.lang.String r3 = java.util.Arrays.toString(r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            r6.append(r3)
            goto L12c
        Lbe:
            boolean r3 = r2 instanceof boolean[]
            if (r3 == 0) goto Ld0
            r3 = r2
            boolean[] r3 = (boolean[]) r3
            java.lang.String r3 = java.util.Arrays.toString(r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            r6.append(r3)
            goto L12c
        Ld0:
            boolean r3 = r2 instanceof kotlin.UByteArray
            r4 = 0
            if (r3 == 0) goto Le6
            r3 = r2
            kotlin.UByteArray r3 = (kotlin.UByteArray) r3
            if (r3 == 0) goto Lde
            byte[] r4 = r3.m238unboximpl()
        Lde:
            java.lang.String r3 = kotlin.collections.unsigned.UArraysKt.m729contentToString2csIQuQ(r4)
            r6.append(r3)
            goto L12c
        Le6:
            boolean r3 = r2 instanceof kotlin.UShortArray
            if (r3 == 0) goto Lfb
            r3 = r2
            kotlin.UShortArray r3 = (kotlin.UShortArray) r3
            if (r3 == 0) goto Lf3
            short[] r4 = r3.m501unboximpl()
        Lf3:
            java.lang.String r3 = kotlin.collections.unsigned.UArraysKt.m731contentToStringd6D3K8(r4)
            r6.append(r3)
            goto L12c
        Lfb:
            boolean r3 = r2 instanceof kotlin.UIntArray
            if (r3 == 0) goto L110
            r3 = r2
            kotlin.UIntArray r3 = (kotlin.UIntArray) r3
            if (r3 == 0) goto L108
            int[] r4 = r3.m317unboximpl()
        L108:
            java.lang.String r3 = kotlin.collections.unsigned.UArraysKt.m730contentToStringXUkPCBk(r4)
            r6.append(r3)
            goto L12c
        L110:
            boolean r3 = r2 instanceof kotlin.ULongArray
            if (r3 == 0) goto L125
            r3 = r2
            kotlin.ULongArray r3 = (kotlin.ULongArray) r3
            if (r3 == 0) goto L11d
            long[] r4 = r3.m396unboximpl()
        L11d:
            java.lang.String r3 = kotlin.collections.unsigned.UArraysKt.m732contentToStringuLth9ew(r4)
            r6.append(r3)
            goto L12c
        L125:
            java.lang.String r3 = r2.toString()
            r6.append(r3)
        L12c:
            int r0 = r0 + 1
            goto L16
        L130:
            r0 = 93
            r6.append(r0)
            int r0 = kotlin.collections.CollectionsKt.getLastIndex(r7)
            r7.remove(r0)
            return
    }

    public static final <T> java.util.List<T> flatten(T[][] r7) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            r0 = r7
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            int r1 = r0.length
            r2 = 0
            r3 = r2
            r4 = r3
        Lc:
            if (r3 >= r1) goto L19
            r5 = r0[r3]
            java.lang.Object[] r5 = (java.lang.Object[]) r5
            r6 = 0
            int r5 = r5.length
            int r4 = r4 + r5
            int r3 = r3 + 1
            goto Lc
        L19:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r4)
            r1 = r7
            java.lang.Object[] r1 = (java.lang.Object[]) r1
            int r1 = r1.length
        L22:
            if (r2 >= r1) goto L2f
            r3 = r7[r2]
            r4 = r0
            java.util.Collection r4 = (java.util.Collection) r4
            kotlin.collections.CollectionsKt.addAll(r4, r3)
            int r2 = r2 + 1
            goto L22
        L2f:
            r1 = r0
            java.util.List r1 = (java.util.List) r1
            return r1
    }

    /* JADX WARN: Incorrect types in method signature: <C:[Ljava/lang/Object;:TR;R:Ljava/lang/Object;>(TC;Lkotlin/jvm/functions/Function0<+TR;>;)TR; */
    private static final java.lang.Object ifEmpty(java.lang.Object[] r1, kotlin.jvm.functions.Function0 r2) {
            java.lang.String r0 = "defaultValue"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            int r0 = r1.length
            if (r0 != 0) goto Lb
            r0 = 1
            goto Lc
        Lb:
            r0 = 0
        Lc:
            if (r0 == 0) goto L13
            java.lang.Object r0 = r2.invoke()
            goto L14
        L13:
            r0 = r1
        L14:
            return r0
    }

    private static final boolean isNullOrEmpty(java.lang.Object[] r3) {
            r0 = 1
            if (r3 == 0) goto Lf
            int r1 = r3.length
            r2 = 0
            if (r1 != 0) goto La
            r1 = r0
            goto Lb
        La:
            r1 = r2
        Lb:
            if (r1 == 0) goto Le
            goto Lf
        Le:
            r0 = r2
        Lf:
            return r0
    }

    public static final <T, R> kotlin.Pair<java.util.List<T>, java.util.List<R>> unzip(kotlin.Pair<? extends T, ? extends R>[] r6) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r6.length
            r0.<init>(r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r6.length
            r1.<init>(r2)
            int r2 = r6.length
            r3 = 0
        L13:
            if (r3 >= r2) goto L28
            r4 = r6[r3]
            java.lang.Object r5 = r4.getFirst()
            r0.add(r5)
            java.lang.Object r5 = r4.getSecond()
            r1.add(r5)
            int r3 = r3 + 1
            goto L13
        L28:
            kotlin.Pair r2 = kotlin.TuplesKt.to(r0, r1)
            return r2
    }
}
