package androidx.collection;

/* JADX INFO: compiled from: IntObjectMap.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007\b\u0004¢\u0006\u0002\u0010\u0003J&\u0010\u0018\u001a\u00020\u00192\u0018\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00190\u001bH\u0086\bø\u0001\u0000J\u0006\u0010\u001c\u001a\u00020\u0019J&\u0010\u001c\u001a\u00020\u00192\u0018\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00190\u001bH\u0086\bø\u0001\u0000J\u0011\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u0005H\u0086\u0002J\u000e\u0010\u001f\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u0005J\u0013\u0010 \u001a\u00020\u00192\u0006\u0010!\u001a\u00028\u0000¢\u0006\u0002\u0010\"J\u0006\u0010#\u001a\u00020\u0005J&\u0010#\u001a\u00020\u00052\u0018\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00190\u001bH\u0086\bø\u0001\u0000J\u0013\u0010$\u001a\u00020\u00192\b\u0010%\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\u0016\u0010&\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u0005H\u0080\b¢\u0006\u0002\b'JD\u0010(\u001a\u00020)26\u0010*\u001a2\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b+\u0012\b\b,\u0012\u0004\b\b(\u001e\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b+\u0012\b\b,\u0012\u0004\b\b(!\u0012\u0004\u0012\u00020)0\u001bH\u0086\bø\u0001\u0000J/\u0010-\u001a\u00020)2!\u0010*\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b+\u0012\b\b,\u0012\u0004\b\b(/\u0012\u0004\u0012\u00020)0.H\u0081\bø\u0001\u0000J/\u00100\u001a\u00020)2!\u0010*\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b+\u0012\b\b,\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u00020)0.H\u0086\bø\u0001\u0000J/\u00101\u001a\u00020)2!\u0010*\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b+\u0012\b\b,\u0012\u0004\b\b(!\u0012\u0004\u0012\u00020)0.H\u0086\bø\u0001\u0000J\u0018\u00102\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u001e\u001a\u00020\u0005H\u0086\u0002¢\u0006\u0002\u00103J\u001b\u00104\u001a\u00028\u00002\u0006\u0010\u001e\u001a\u00020\u00052\u0006\u00105\u001a\u00028\u0000¢\u0006\u0002\u00106J'\u00107\u001a\u00028\u00002\u0006\u0010\u001e\u001a\u00020\u00052\f\u00105\u001a\b\u0012\u0004\u0012\u00028\u000008H\u0086\bø\u0001\u0000¢\u0006\u0002\u00109J\b\u0010:\u001a\u00020\u0005H\u0016J\u0006\u0010;\u001a\u00020\u0019J\u0006\u0010<\u001a\u00020\u0019J:\u0010=\u001a\u00020>2\b\b\u0002\u0010?\u001a\u00020@2\b\b\u0002\u0010A\u001a\u00020@2\b\b\u0002\u0010B\u001a\u00020@2\b\b\u0002\u0010C\u001a\u00020\u00052\b\b\u0002\u0010D\u001a\u00020@H\u0007Jx\u0010=\u001a\u00020>2\b\b\u0002\u0010?\u001a\u00020@2\b\b\u0002\u0010A\u001a\u00020@2\b\b\u0002\u0010B\u001a\u00020@2\b\b\u0002\u0010C\u001a\u00020\u00052\b\b\u0002\u0010D\u001a\u00020@28\b\u0004\u0010E\u001a2\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b+\u0012\b\b,\u0012\u0004\b\b(\u001e\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b+\u0012\b\b,\u0012\u0004\b\b(!\u0012\u0004\u0012\u00020@0\u001bH\u0087\bø\u0001\u0000J\u0006\u0010F\u001a\u00020\u0019J\b\u0010G\u001a\u00020>H\u0016R\u0018\u0010\u0004\u001a\u00020\u00058\u0000@\u0000X\u0081\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0003R\u0018\u0010\u0007\u001a\u00020\u00058\u0000@\u0000X\u0081\u000e¢\u0006\b\n\u0000\u0012\u0004\b\b\u0010\u0003R\u0011\u0010\t\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\f\u001a\u00020\r8\u0000@\u0000X\u0081\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u000e\u0010\u0003R\u0018\u0010\u000f\u001a\u00020\u00108\u0000@\u0000X\u0081\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u0011\u0010\u0003R\u0011\u0010\u0012\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u000bR\"\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00158\u0000@\u0000X\u0081\u000e¢\u0006\n\n\u0002\u0010\u0017\u0012\u0004\b\u0016\u0010\u0003\u0082\u0001\u0001H\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006I"}, d2 = {"Landroidx/collection/IntObjectMap;", "V", "", "()V", "_capacity", "", "get_capacity$collection$annotations", "_size", "get_size$collection$annotations", "capacity", "getCapacity", "()I", "keys", "", "getKeys$annotations", "metadata", "", "getMetadata$annotations", "size", "getSize", "values", "", "getValues$annotations", "[Ljava/lang/Object;", "all", "", "predicate", "Lkotlin/Function2;", "any", "contains", "key", "containsKey", "containsValue", "value", "(Ljava/lang/Object;)Z", "count", "equals", "other", "findKeyIndex", "findKeyIndex$collection", "forEach", "", "block", "Lkotlin/ParameterName;", "name", "forEachIndexed", "Lkotlin/Function1;", "index", "forEachKey", "forEachValue", "get", "(I)Ljava/lang/Object;", "getOrDefault", "defaultValue", "(ILjava/lang/Object;)Ljava/lang/Object;", "getOrElse", "Lkotlin/Function0;", "(ILkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "hashCode", "isEmpty", "isNotEmpty", "joinToString", "", "separator", "", "prefix", "postfix", "limit", "truncated", "transform", "none", "toString", "Landroidx/collection/MutableIntObjectMap;", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class IntObjectMap<V> {
    public int _capacity;
    public int _size;
    public int[] keys;
    public long[] metadata;
    public java.lang.Object[] values;

    private IntObjectMap() {
            r1 = this;
            r1.<init>()
            long[] r0 = androidx.collection.ScatterMapKt.EmptyGroup
            r1.metadata = r0
            int[] r0 = androidx.collection.IntSetKt.getEmptyIntArray()
            r1.keys = r0
            java.lang.Object[] r0 = androidx.collection.internal.ContainerHelpersKt.EMPTY_OBJECTS
            r1.values = r0
            return
    }

    public /* synthetic */ IntObjectMap(kotlin.jvm.internal.DefaultConstructorMarker r1) {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ void getKeys$annotations() {
            return
    }

    public static /* synthetic */ void getMetadata$annotations() {
            return
    }

    public static /* synthetic */ void getValues$annotations() {
            return
    }

    public static /* synthetic */ void get_capacity$collection$annotations() {
            return
    }

    public static /* synthetic */ void get_size$collection$annotations() {
            return
    }

    public static /* synthetic */ java.lang.String joinToString$default(androidx.collection.IntObjectMap r1, java.lang.CharSequence r2, java.lang.CharSequence r3, java.lang.CharSequence r4, int r5, java.lang.CharSequence r6, int r7, java.lang.Object r8) {
            if (r8 != 0) goto L34
            r8 = r7 & 1
            if (r8 == 0) goto La
            java.lang.String r2 = ", "
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
        La:
            r8 = r7 & 2
            java.lang.String r0 = ""
            if (r8 == 0) goto L13
            r3 = r0
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
        L13:
            r8 = r7 & 4
            if (r8 == 0) goto L1a
            r4 = r0
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
        L1a:
            r8 = r7 & 8
            if (r8 == 0) goto L1f
            r5 = -1
        L1f:
            r7 = r7 & 16
            if (r7 == 0) goto L29
            java.lang.String r6 = "..."
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            r8 = r6
            goto L2a
        L29:
            r8 = r6
        L2a:
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
            java.lang.String r1 = r3.joinToString(r4, r5, r6, r7, r8)
            return r1
        L34:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Super calls with default arguments not supported in this target, function: joinToString"
            r1.<init>(r2)
            throw r1
    }

    public static /* synthetic */ java.lang.String joinToString$default(androidx.collection.IntObjectMap r26, java.lang.CharSequence r27, java.lang.CharSequence r28, java.lang.CharSequence r29, int r30, java.lang.CharSequence r31, kotlin.jvm.functions.Function2 r32, int r33, java.lang.Object r34) {
            r0 = r32
            if (r34 != 0) goto L12a
            r1 = r33 & 1
            if (r1 == 0) goto Ld
            java.lang.String r1 = ", "
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            goto Lf
        Ld:
            r1 = r27
        Lf:
            r2 = r33 & 2
            java.lang.String r3 = ""
            if (r2 == 0) goto L19
            r2 = r3
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            goto L1b
        L19:
            r2 = r28
        L1b:
            r4 = r33 & 4
            if (r4 == 0) goto L22
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            goto L24
        L22:
            r3 = r29
        L24:
            r4 = r33 & 8
            if (r4 == 0) goto L2a
            r4 = -1
            goto L2c
        L2a:
            r4 = r30
        L2c:
            r5 = r33 & 16
            if (r5 == 0) goto L35
            java.lang.String r5 = "..."
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            goto L37
        L35:
            r5 = r31
        L37:
            java.lang.String r6 = "separator"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r6)
            java.lang.String r6 = "prefix"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r6)
            java.lang.String r6 = "postfix"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r6)
            java.lang.String r6 = "truncated"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r6)
            java.lang.String r6 = "transform"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r6)
            r6 = 0
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r8 = r7
            r9 = 0
            r8.append(r2)
            r10 = 0
            r11 = r26
            r12 = 0
            int[] r13 = r11.keys
            java.lang.Object[] r14 = r11.values
            r15 = r11
            r16 = 0
            r27 = r2
            long[] r2 = r15.metadata
            r28 = r6
            int r6 = r2.length
            int r6 = r6 + (-2)
            r29 = r2
            r2 = 0
            if (r2 > r6) goto L112
        L74:
            r17 = r29[r2]
            r30 = r17
            r19 = 0
            r33 = r9
            r34 = r10
            r9 = r30
            r30 = r11
            r31 = r12
            long r11 = ~r9
            r20 = 7
            long r11 = r11 << r20
            long r11 = r11 & r9
            r20 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r11 & r20
            int r9 = (r9 > r20 ? 1 : (r9 == r20 ? 0 : -1))
            if (r9 == 0) goto L100
            int r9 = r2 - r6
            int r9 = ~r9
            int r9 = r9 >>> 31
            r10 = 8
            int r9 = 8 - r9
            r11 = 0
            r12 = r11
            r11 = r34
        La2:
            if (r12 >= r9) goto Lf6
            r19 = 255(0xff, double:1.26E-321)
            long r19 = r17 & r19
            r21 = 0
            r22 = 128(0x80, double:6.3E-322)
            int r22 = (r19 > r22 ? 1 : (r19 == r22 ? 0 : -1))
            if (r22 >= 0) goto Lb3
            r22 = 1
            goto Lb5
        Lb3:
            r22 = 0
        Lb5:
            if (r22 == 0) goto Le9
            int r19 = r2 << 3
            int r19 = r19 + r12
            r20 = r19
            r21 = 0
            r22 = r13[r20]
            r23 = r10
            r10 = r14[r20]
            r24 = 0
            if (r11 != r4) goto Lcf
            r8.append(r5)
            r25 = r1
            goto L120
        Lcf:
            if (r11 == 0) goto Ld4
            r8.append(r1)
        Ld4:
            r25 = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r22)
            java.lang.Object r1 = r0.invoke(r1, r10)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r8.append(r1)
            int r11 = r11 + 1
            goto Led
        Le9:
            r25 = r1
            r23 = r10
        Led:
            long r17 = r17 >> r23
            int r12 = r12 + 1
            r10 = r23
            r1 = r25
            goto La2
        Lf6:
            r25 = r1
            r23 = r10
            r1 = r23
            if (r9 != r1) goto L11b
            r10 = r11
            goto L104
        L100:
            r25 = r1
            r10 = r34
        L104:
            if (r2 == r6) goto L11a
            int r2 = r2 + 1
            r11 = r30
            r12 = r31
            r9 = r33
            r1 = r25
            goto L74
        L112:
            r25 = r1
            r33 = r9
            r30 = r11
            r31 = r12
        L11a:
            r11 = r10
        L11b:
            r8.append(r3)
        L120:
            java.lang.String r1 = r7.toString()
            java.lang.String r2 = "StringBuilder().apply(builderAction).toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            return r1
        L12a:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Super calls with default arguments not supported in this target, function: joinToString"
            r1.<init>(r2)
            throw r1
    }

    public final boolean all(kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super V, java.lang.Boolean> r26) {
            r25 = this;
            r0 = r26
            java.lang.String r1 = "predicate"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            r1 = 0
            r2 = r25
            r3 = 0
            int[] r4 = r2.keys
            java.lang.Object[] r5 = r2.values
            r6 = r2
            r7 = 0
            long[] r8 = r6.metadata
            int r9 = r8.length
            int r9 = r9 + (-2)
            r10 = 0
            if (r10 > r9) goto L96
        L19:
            r12 = r8[r10]
            r14 = r12
            r16 = 0
            r18 = r12
            r17 = 1
            long r11 = ~r14
            r13 = 7
            long r11 = r11 << r13
            long r11 = r11 & r14
            r20 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r20
            int r11 = (r11 > r20 ? 1 : (r11 == r20 ? 0 : -1))
            if (r11 == 0) goto L8d
            int r11 = r10 - r9
            int r11 = ~r11
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r13 = 0
        L3b:
            if (r13 >= r11) goto L84
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r18 & r14
            r16 = 0
            r20 = 128(0x80, double:6.3E-322)
            int r20 = (r14 > r20 ? 1 : (r14 == r20 ? 0 : -1))
            r21 = 0
            if (r20 >= 0) goto L4e
            r14 = r17
            goto L50
        L4e:
            r14 = r21
        L50:
            if (r14 == 0) goto L77
            int r14 = r10 << 3
            int r14 = r14 + r13
            r15 = r14
            r16 = 0
            r20 = r4[r15]
            r22 = r12
            r12 = r5[r15]
            r23 = 0
            r24 = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r20)
            java.lang.Object r1 = r0.invoke(r1, r12)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L73
            return r21
        L73:
            goto L7b
        L77:
            r24 = r1
            r22 = r12
        L7b:
            long r18 = r18 >> r22
            int r13 = r13 + 1
            r12 = r22
            r1 = r24
            goto L3b
        L84:
            r24 = r1
            r22 = r12
            r1 = r22
            if (r11 != r1) goto L9b
            goto L8f
        L8d:
            r24 = r1
        L8f:
            if (r10 == r9) goto L9a
            int r10 = r10 + 1
            r1 = r24
            goto L19
        L96:
            r24 = r1
            r17 = 1
        L9a:
        L9b:
            return r17
    }

    public final boolean any() {
            r1 = this;
            int r0 = r1._size
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    public final boolean any(kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super V, java.lang.Boolean> r26) {
            r25 = this;
            r0 = r26
            java.lang.String r1 = "predicate"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            r1 = 0
            r2 = r25
            r3 = 0
            int[] r4 = r2.keys
            java.lang.Object[] r5 = r2.values
            r6 = r2
            r7 = 0
            long[] r8 = r6.metadata
            int r9 = r8.length
            int r9 = r9 + (-2)
            r10 = 0
            if (r10 > r9) goto L96
        L19:
            r12 = r8[r10]
            r14 = r12
            r16 = 0
            r18 = r12
            r17 = 0
            long r11 = ~r14
            r13 = 7
            long r11 = r11 << r13
            long r11 = r11 & r14
            r20 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r20
            int r11 = (r11 > r20 ? 1 : (r11 == r20 ? 0 : -1))
            if (r11 == 0) goto L8d
            int r11 = r10 - r9
            int r11 = ~r11
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r13 = 0
        L3b:
            if (r13 >= r11) goto L84
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r18 & r14
            r16 = 0
            r20 = 128(0x80, double:6.3E-322)
            int r20 = (r14 > r20 ? 1 : (r14 == r20 ? 0 : -1))
            r21 = 1
            if (r20 >= 0) goto L4e
            r14 = r21
            goto L50
        L4e:
            r14 = r17
        L50:
            if (r14 == 0) goto L77
            int r14 = r10 << 3
            int r14 = r14 + r13
            r15 = r14
            r16 = 0
            r20 = r4[r15]
            r22 = r12
            r12 = r5[r15]
            r23 = 0
            r24 = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r20)
            java.lang.Object r1 = r0.invoke(r1, r12)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L73
            return r21
        L73:
            goto L7b
        L77:
            r24 = r1
            r22 = r12
        L7b:
            long r18 = r18 >> r22
            int r13 = r13 + 1
            r12 = r22
            r1 = r24
            goto L3b
        L84:
            r24 = r1
            r22 = r12
            r1 = r22
            if (r11 != r1) goto L9b
            goto L8f
        L8d:
            r24 = r1
        L8f:
            if (r10 == r9) goto L9a
            int r10 = r10 + 1
            r1 = r24
            goto L19
        L96:
            r24 = r1
            r17 = 0
        L9a:
        L9b:
            return r17
    }

    public final boolean contains(int r25) {
            r24 = this;
            r0 = r24
            r1 = 0
            r2 = 0
            int r3 = java.lang.Integer.hashCode(r25)
            r4 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r3 = r3 * r4
            int r4 = r3 << 16
            r2 = r3 ^ r4
            r3 = 0
            r3 = r2 & 127(0x7f, float:1.78E-43)
            int r4 = r0._capacity
            r5 = 0
            int r5 = r2 >>> 7
            r5 = r5 & r4
            r6 = 0
        L1c:
            long[] r7 = r0.metadata
            r8 = 0
            int r9 = r5 >> 3
            r10 = r5 & 7
            int r10 = r10 << 3
            r11 = r7[r9]
            long r11 = r11 >>> r10
            int r13 = r9 + 1
            r13 = r7[r13]
            int r15 = 64 - r10
            long r13 = r13 << r15
            r15 = r1
            r16 = r2
            long r1 = (long) r10
            long r1 = -r1
            r17 = 63
            long r1 = r1 >> r17
            long r1 = r1 & r13
            long r1 = r1 | r11
            r7 = r1
            r9 = 0
            long r10 = (long) r3
            r12 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r10 = r10 * r12
            long r10 = r10 ^ r7
            long r12 = r10 - r12
            r17 = r1
            long r1 = ~r10
            long r1 = r1 & r12
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r1 = r1 & r12
        L53:
            r7 = r1
            r9 = 0
            r10 = 0
            int r14 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            r19 = 0
            r20 = 1
            if (r14 == 0) goto L62
            r7 = r20
            goto L64
        L62:
            r7 = r19
        L64:
            if (r7 == 0) goto L87
            r7 = r1
            r9 = 0
            r10 = r7
            r14 = 0
            int r21 = java.lang.Long.numberOfTrailingZeros(r10)
            int r10 = r21 >> 3
            int r10 = r10 + r5
            r7 = r10 & r4
            int[] r8 = r0.keys
            r8 = r8[r7]
            r9 = r25
            if (r8 != r9) goto L7d
            goto L9c
        L7d:
            r10 = r1
            r8 = 0
            r19 = 1
            long r19 = r10 - r19
            long r10 = r10 & r19
            r1 = r10
            goto L53
        L87:
            r9 = r25
            r7 = r17
            r14 = 0
            r21 = r10
            long r10 = ~r7
            r23 = 6
            long r10 = r10 << r23
            long r10 = r10 & r7
            long r7 = r10 & r12
            int r7 = (r7 > r21 ? 1 : (r7 == r21 ? 0 : -1))
            if (r7 == 0) goto La1
        L9b:
            r7 = -1
        L9c:
            if (r7 < 0) goto La0
            r19 = r20
        La0:
            return r19
        La1:
            int r6 = r6 + 8
            int r7 = r5 + r6
            r5 = r7 & r4
            r1 = r15
            r2 = r16
            goto L1c
    }

    public final boolean containsKey(int r25) {
            r24 = this;
            r0 = r24
            r1 = 0
            r2 = 0
            int r3 = java.lang.Integer.hashCode(r25)
            r4 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r3 = r3 * r4
            int r4 = r3 << 16
            r2 = r3 ^ r4
            r3 = 0
            r3 = r2 & 127(0x7f, float:1.78E-43)
            int r4 = r0._capacity
            r5 = 0
            int r5 = r2 >>> 7
            r5 = r5 & r4
            r6 = 0
        L1c:
            long[] r7 = r0.metadata
            r8 = 0
            int r9 = r5 >> 3
            r10 = r5 & 7
            int r10 = r10 << 3
            r11 = r7[r9]
            long r11 = r11 >>> r10
            int r13 = r9 + 1
            r13 = r7[r13]
            int r15 = 64 - r10
            long r13 = r13 << r15
            r15 = r1
            r16 = r2
            long r1 = (long) r10
            long r1 = -r1
            r17 = 63
            long r1 = r1 >> r17
            long r1 = r1 & r13
            long r1 = r1 | r11
            r7 = r1
            r9 = 0
            long r10 = (long) r3
            r12 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r10 = r10 * r12
            long r10 = r10 ^ r7
            long r12 = r10 - r12
            r17 = r1
            long r1 = ~r10
            long r1 = r1 & r12
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r1 = r1 & r12
        L53:
            r7 = r1
            r9 = 0
            r10 = 0
            int r14 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            r19 = 0
            r20 = 1
            if (r14 == 0) goto L62
            r7 = r20
            goto L64
        L62:
            r7 = r19
        L64:
            if (r7 == 0) goto L87
            r7 = r1
            r9 = 0
            r10 = r7
            r14 = 0
            int r21 = java.lang.Long.numberOfTrailingZeros(r10)
            int r10 = r21 >> 3
            int r10 = r10 + r5
            r7 = r10 & r4
            int[] r8 = r0.keys
            r8 = r8[r7]
            r9 = r25
            if (r8 != r9) goto L7d
            goto L9c
        L7d:
            r10 = r1
            r8 = 0
            r19 = 1
            long r19 = r10 - r19
            long r10 = r10 & r19
            r1 = r10
            goto L53
        L87:
            r9 = r25
            r7 = r17
            r14 = 0
            r21 = r10
            long r10 = ~r7
            r23 = 6
            long r10 = r10 << r23
            long r10 = r10 & r7
            long r7 = r10 & r12
            int r7 = (r7 > r21 ? 1 : (r7 == r21 ? 0 : -1))
            if (r7 == 0) goto La1
        L9b:
            r7 = -1
        L9c:
            if (r7 < 0) goto La0
            r19 = r20
        La0:
            return r19
        La1:
            int r6 = r6 + 8
            int r7 = r5 + r6
            r5 = r7 & r4
            r1 = r15
            r2 = r16
            goto L1c
    }

    public final boolean containsValue(V r23) {
            r22 = this;
            r0 = r22
            r1 = 0
            java.lang.Object[] r2 = r0.values
            r3 = r0
            r4 = 0
            long[] r5 = r3.metadata
            int r6 = r5.length
            int r6 = r6 + (-2)
            r7 = 0
            if (r7 > r6) goto L7f
        Lf:
            r9 = r5[r7]
            r11 = r9
            r13 = 0
            long r14 = ~r11
            r16 = 7
            long r14 = r14 << r16
            long r14 = r14 & r11
            r16 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r14 & r16
            int r11 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1))
            if (r11 == 0) goto L76
            int r11 = r7 - r6
            int r11 = ~r11
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r13 = 0
        L2e:
            if (r13 >= r11) goto L6b
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r9
            r16 = 0
            r17 = 128(0x80, double:6.3E-322)
            int r17 = (r14 > r17 ? 1 : (r14 == r17 ? 0 : -1))
            r18 = 1
            if (r17 >= 0) goto L40
            r14 = r18
            goto L41
        L40:
            r14 = 0
        L41:
            if (r14 == 0) goto L5e
            int r14 = r7 << 3
            int r14 = r14 + r13
            r15 = r14
            r16 = 0
            r17 = 0
            r8 = r2[r15]
            r19 = 0
            r20 = r12
            r12 = r23
            boolean r21 = kotlin.jvm.internal.Intrinsics.areEqual(r12, r8)
            if (r21 == 0) goto L5a
            return r18
        L5a:
            goto L64
        L5e:
            r20 = r12
            r17 = 0
            r12 = r23
        L64:
            long r9 = r9 >> r20
            int r13 = r13 + 1
            r12 = r20
            goto L2e
        L6b:
            r20 = r12
            r17 = 0
            r12 = r23
            r8 = r20
            if (r11 != r8) goto L84
            goto L7a
        L76:
            r12 = r23
            r17 = 0
        L7a:
            if (r7 == r6) goto L83
            int r7 = r7 + 1
            goto Lf
        L7f:
            r12 = r23
            r17 = 0
        L83:
        L84:
            return r17
    }

    public final int count() {
            r1 = this;
            int r0 = r1.getSize()
            return r0
    }

    public final int count(kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super V, java.lang.Boolean> r25) {
            r24 = this;
            r0 = r25
            java.lang.String r1 = "predicate"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            r1 = 0
            r2 = 0
            r3 = r24
            r4 = 0
            int[] r5 = r3.keys
            java.lang.Object[] r6 = r3.values
            r7 = r3
            r8 = 0
            long[] r9 = r7.metadata
            int r10 = r9.length
            int r10 = r10 + (-2)
            r11 = 0
            if (r11 > r10) goto L9d
        L1a:
            r12 = r9[r11]
            r14 = r12
            r16 = 0
            r17 = r1
            r18 = r2
            long r1 = ~r14
            r19 = 7
            long r1 = r1 << r19
            long r1 = r1 & r14
            r19 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r1 = r1 & r19
            int r1 = (r1 > r19 ? 1 : (r1 == r19 ? 0 : -1))
            if (r1 == 0) goto L8f
            int r1 = r11 - r10
            int r1 = ~r1
            int r1 = r1 >>> 31
            r2 = 8
            int r1 = 8 - r1
            r14 = 0
        L3e:
            if (r14 >= r1) goto L86
            r15 = 255(0xff, double:1.26E-321)
            long r15 = r15 & r12
            r19 = 0
            r20 = 128(0x80, double:6.3E-322)
            int r20 = (r15 > r20 ? 1 : (r15 == r20 ? 0 : -1))
            if (r20 >= 0) goto L4e
            r20 = 1
            goto L50
        L4e:
            r20 = 0
        L50:
            if (r20 == 0) goto L79
            int r15 = r11 << 3
            int r15 = r15 + r14
            r16 = r15
            r19 = 0
            r20 = r5[r16]
            r21 = r2
            r2 = r6[r16]
            r22 = 0
            r23 = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r20)
            java.lang.Object r3 = r0.invoke(r3, r2)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L75
            int r18 = r18 + 1
        L75:
            goto L7d
        L79:
            r21 = r2
            r23 = r3
        L7d:
            long r12 = r12 >> r21
            int r14 = r14 + 1
            r2 = r21
            r3 = r23
            goto L3e
        L86:
            r21 = r2
            r23 = r3
            if (r1 != r2) goto La3
            r2 = r18
            goto L93
        L8f:
            r23 = r3
            r2 = r18
        L93:
            if (r11 == r10) goto La1
            int r11 = r11 + 1
            r1 = r17
            r3 = r23
            goto L1a
        L9d:
            r17 = r1
            r23 = r3
        La1:
            r18 = r2
        La3:
            return r18
    }

    public boolean equals(java.lang.Object r24) {
            r23 = this;
            r0 = r24
            r1 = 1
            r2 = r23
            if (r0 != r2) goto L8
            return r1
        L8:
            boolean r3 = r0 instanceof androidx.collection.IntObjectMap
            r4 = 0
            if (r3 != 0) goto Le
            return r4
        Le:
            r3 = r0
            androidx.collection.IntObjectMap r3 = (androidx.collection.IntObjectMap) r3
            int r3 = r3.getSize()
            int r5 = r2.getSize()
            if (r3 == r5) goto L1c
            return r4
        L1c:
            r3 = r23
            r5 = 0
            int[] r6 = r3.keys
            java.lang.Object[] r7 = r3.values
            r8 = r3
            r9 = 0
            long[] r10 = r8.metadata
            int r11 = r10.length
            int r11 = r11 + (-2)
            r12 = 0
            if (r12 > r11) goto Lcb
        L2d:
            r13 = r10[r12]
            r15 = r13
            r17 = 0
            r18 = r1
            r1 = r15
            r15 = r4
            r16 = r5
            long r4 = ~r1
            r19 = 7
            long r4 = r4 << r19
            long r4 = r4 & r1
            r19 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r1 = r4 & r19
            int r1 = (r1 > r19 ? 1 : (r1 == r19 ? 0 : -1))
            if (r1 == 0) goto Lb9
            int r1 = r12 - r11
            int r1 = ~r1
            int r1 = r1 >>> 31
            r2 = 8
            int r1 = 8 - r1
            r4 = 0
        L53:
            if (r4 >= r1) goto Lb0
            r19 = 255(0xff, double:1.26E-321)
            long r19 = r13 & r19
            r5 = 0
            r21 = 128(0x80, double:6.3E-322)
            int r17 = (r19 > r21 ? 1 : (r19 == r21 ? 0 : -1))
            if (r17 >= 0) goto L63
            r5 = r18
            goto L64
        L63:
            r5 = r15
        L64:
            if (r5 == 0) goto La1
            int r5 = r12 << 3
            int r5 = r5 + r4
            r17 = r5
            r19 = 0
            r20 = r15
            r15 = r6[r17]
            r21 = r2
            r2 = r7[r17]
            r22 = 0
            if (r2 != 0) goto L8e
            r0 = r24
            androidx.collection.IntObjectMap r0 = (androidx.collection.IntObjectMap) r0
            java.lang.Object r0 = r0.get(r15)
            if (r0 != 0) goto L8d
            r0 = r24
            androidx.collection.IntObjectMap r0 = (androidx.collection.IntObjectMap) r0
            boolean r0 = r0.containsKey(r15)
            if (r0 != 0) goto L9d
        L8d:
            return r20
        L8e:
            r0 = r24
            androidx.collection.IntObjectMap r0 = (androidx.collection.IntObjectMap) r0
            java.lang.Object r0 = r0.get(r15)
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r0)
            if (r0 != 0) goto L9d
            return r20
        L9d:
            goto La5
        La1:
            r21 = r2
            r20 = r15
        La5:
            long r13 = r13 >> r21
            int r4 = r4 + 1
            r0 = r24
            r15 = r20
            r2 = r21
            goto L53
        Lb0:
            r21 = r2
            r20 = r15
            r0 = r21
            if (r1 != r0) goto Ld0
            goto Lbb
        Lb9:
            r20 = r15
        Lbb:
            if (r12 == r11) goto Lcf
            int r12 = r12 + 1
            r2 = r23
            r0 = r24
            r5 = r16
            r1 = r18
            r4 = r20
            goto L2d
        Lcb:
            r18 = r1
            r16 = r5
        Lcf:
        Ld0:
            return r18
    }

    public final int findKeyIndex$collection(int r23) {
            r22 = this;
            r0 = r22
            r1 = 0
            r2 = 0
            int r3 = java.lang.Integer.hashCode(r23)
            r4 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r3 = r3 * r4
            int r4 = r3 << 16
            r2 = r3 ^ r4
            r3 = 0
            r3 = r2 & 127(0x7f, float:1.78E-43)
            int r4 = r0._capacity
            r5 = 0
            int r5 = r2 >>> 7
            r5 = r5 & r4
            r6 = 0
        L1c:
            long[] r7 = r0.metadata
            r8 = 0
            int r9 = r5 >> 3
            r10 = r5 & 7
            int r10 = r10 << 3
            r11 = r7[r9]
            long r11 = r11 >>> r10
            int r13 = r9 + 1
            r13 = r7[r13]
            int r15 = 64 - r10
            long r13 = r13 << r15
            r15 = r1
            r16 = r2
            long r1 = (long) r10
            long r1 = -r1
            r17 = 63
            long r1 = r1 >> r17
            long r1 = r1 & r13
            long r1 = r1 | r11
            r7 = r1
            r9 = 0
            long r10 = (long) r3
            r12 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r10 = r10 * r12
            long r10 = r10 ^ r7
            long r12 = r10 - r12
            r17 = r1
            long r1 = ~r10
            long r1 = r1 & r12
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r1 = r1 & r12
        L53:
            r7 = r1
            r9 = 0
            r10 = 0
            int r14 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r14 == 0) goto L5d
            r14 = 1
            goto L5e
        L5d:
            r14 = 0
        L5e:
            if (r14 == 0) goto L81
            r7 = r1
            r9 = 0
            r10 = r7
            r14 = 0
            int r19 = java.lang.Long.numberOfTrailingZeros(r10)
            int r10 = r19 >> 3
            int r10 = r10 + r5
            r7 = r10 & r4
            int[] r8 = r0.keys
            r8 = r8[r7]
            r9 = r23
            if (r8 != r9) goto L77
            return r7
        L77:
            r10 = r1
            r8 = 0
            r19 = 1
            long r19 = r10 - r19
            long r10 = r10 & r19
            r1 = r10
            goto L53
        L81:
            r9 = r23
            r7 = r17
            r14 = 0
            r19 = r10
            long r10 = ~r7
            r21 = 6
            long r10 = r10 << r21
            long r10 = r10 & r7
            long r7 = r10 & r12
            int r7 = (r7 > r19 ? 1 : (r7 == r19 ? 0 : -1))
            if (r7 == 0) goto L97
        L95:
            r1 = -1
            return r1
        L97:
            int r6 = r6 + 8
            int r7 = r5 + r6
            r5 = r7 & r4
            r1 = r15
            r2 = r16
            goto L1c
    }

    public final void forEach(kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super V, kotlin.Unit> r21) {
            r20 = this;
            r0 = r20
            r1 = r21
            java.lang.String r2 = "block"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            r2 = 0
            int[] r3 = r0.keys
            java.lang.Object[] r4 = r0.values
            r5 = r20
            r6 = 0
            long[] r7 = r5.metadata
            int r8 = r7.length
            int r8 = r8 + (-2)
            r9 = 0
            if (r9 > r8) goto L7f
        L19:
            r10 = r7[r9]
            r12 = r10
            r14 = 0
            r15 = r2
            r16 = r3
            long r2 = ~r12
            r17 = 7
            long r2 = r2 << r17
            long r2 = r2 & r12
            r17 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r2 = r2 & r17
            int r2 = (r2 > r17 ? 1 : (r2 == r17 ? 0 : -1))
            if (r2 == 0) goto L75
            int r2 = r9 - r8
            int r2 = ~r2
            int r2 = r2 >>> 31
            r3 = 8
            int r2 = 8 - r2
            r12 = 0
        L3b:
            if (r12 >= r2) goto L6f
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r10
            r17 = 0
            r18 = 128(0x80, double:6.3E-322)
            int r18 = (r13 > r18 ? 1 : (r13 == r18 ? 0 : -1))
            if (r18 >= 0) goto L4b
            r18 = 1
            goto L4d
        L4b:
            r18 = 0
        L4d:
            if (r18 == 0) goto L64
            int r13 = r9 << 3
            int r13 = r13 + r12
            r14 = r13
            r17 = 0
            r18 = r16[r14]
            r19 = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r18)
            r0 = r4[r14]
            r1.invoke(r3, r0)
            goto L66
        L64:
            r19 = r3
        L66:
            long r10 = r10 >> r19
            int r12 = r12 + 1
            r0 = r20
            r3 = r19
            goto L3b
        L6f:
            r19 = r3
            r0 = r19
            if (r2 != r0) goto L83
        L75:
            if (r9 == r8) goto L82
            int r9 = r9 + 1
            r0 = r20
            r2 = r15
            r3 = r16
            goto L19
        L7f:
            r15 = r2
            r16 = r3
        L82:
        L83:
            return
    }

    public final void forEachIndexed(kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> r15) {
            r14 = this;
            java.lang.String r0 = "block"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
            r0 = 0
            long[] r1 = r14.metadata
            int r2 = r1.length
            int r2 = r2 + (-2)
            r3 = 0
            if (r3 > r2) goto L52
        Le:
            r4 = r1[r3]
            r6 = r4
            r8 = 0
            long r9 = ~r6
            r11 = 7
            long r9 = r9 << r11
            long r9 = r9 & r6
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r9 & r11
            int r6 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r6 == 0) goto L4d
            int r6 = r3 - r2
            int r6 = ~r6
            int r6 = r6 >>> 31
            r7 = 8
            int r6 = 8 - r6
            r8 = 0
        L2b:
            if (r8 >= r6) goto L4a
            r9 = 255(0xff, double:1.26E-321)
            long r9 = r9 & r4
            r11 = 0
            r12 = 128(0x80, double:6.3E-322)
            int r12 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r12 >= 0) goto L39
            r12 = 1
            goto L3a
        L39:
            r12 = 0
        L3a:
            if (r12 == 0) goto L46
            int r9 = r3 << 3
            int r9 = r9 + r8
            java.lang.Integer r10 = java.lang.Integer.valueOf(r9)
            r15.invoke(r10)
        L46:
            long r4 = r4 >> r7
            int r8 = r8 + 1
            goto L2b
        L4a:
            if (r6 == r7) goto L4d
            return
        L4d:
            if (r3 == r2) goto L52
            int r3 = r3 + 1
            goto Le
        L52:
            return
    }

    public final void forEachKey(kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> r20) {
            r19 = this;
            r0 = r20
            java.lang.String r1 = "block"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            r1 = 0
            r2 = r19
            int[] r3 = r2.keys
            r4 = r19
            r5 = 0
            long[] r6 = r4.metadata
            int r7 = r6.length
            int r7 = r7 + (-2)
            r8 = 0
            if (r8 > r7) goto L6f
        L17:
            r9 = r6[r8]
            r11 = r9
            r13 = 0
            long r14 = ~r11
            r16 = 7
            long r14 = r14 << r16
            long r14 = r14 & r11
            r16 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r14 & r16
            int r11 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1))
            if (r11 == 0) goto L6a
            int r11 = r8 - r7
            int r11 = ~r11
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r13 = 0
        L36:
            if (r13 >= r11) goto L66
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r9
            r16 = 0
            r17 = 128(0x80, double:6.3E-322)
            int r17 = (r14 > r17 ? 1 : (r14 == r17 ? 0 : -1))
            if (r17 >= 0) goto L46
            r17 = 1
            goto L48
        L46:
            r17 = 0
        L48:
            if (r17 == 0) goto L5d
            int r14 = r8 << 3
            int r14 = r14 + r13
            r15 = r14
            r16 = 0
            r17 = r3[r15]
            r18 = r12
            java.lang.Integer r12 = java.lang.Integer.valueOf(r17)
            r0.invoke(r12)
            goto L5f
        L5d:
            r18 = r12
        L5f:
            long r9 = r9 >> r18
            int r13 = r13 + 1
            r12 = r18
            goto L36
        L66:
            r18 = r12
            if (r11 != r12) goto L70
        L6a:
            if (r8 == r7) goto L6f
            int r8 = r8 + 1
            goto L17
        L6f:
        L70:
            return
    }

    public final void forEachValue(kotlin.jvm.functions.Function1<? super V, kotlin.Unit> r20) {
            r19 = this;
            r0 = r20
            java.lang.String r1 = "block"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            r1 = 0
            r2 = r19
            java.lang.Object[] r3 = r2.values
            r4 = r19
            r5 = 0
            long[] r6 = r4.metadata
            int r7 = r6.length
            int r7 = r7 + (-2)
            r8 = 0
            if (r8 > r7) goto L6b
        L17:
            r9 = r6[r8]
            r11 = r9
            r13 = 0
            long r14 = ~r11
            r16 = 7
            long r14 = r14 << r16
            long r14 = r14 & r11
            r16 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r14 & r16
            int r11 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1))
            if (r11 == 0) goto L66
            int r11 = r8 - r7
            int r11 = ~r11
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r13 = 0
        L36:
            if (r13 >= r11) goto L62
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r9
            r16 = 0
            r17 = 128(0x80, double:6.3E-322)
            int r17 = (r14 > r17 ? 1 : (r14 == r17 ? 0 : -1))
            if (r17 >= 0) goto L46
            r17 = 1
            goto L48
        L46:
            r17 = 0
        L48:
            if (r17 == 0) goto L59
            int r14 = r8 << 3
            int r14 = r14 + r13
            r15 = r14
            r16 = 0
            r17 = r12
            r12 = r3[r15]
            r0.invoke(r12)
            goto L5b
        L59:
            r17 = r12
        L5b:
            long r9 = r9 >> r17
            int r13 = r13 + 1
            r12 = r17
            goto L36
        L62:
            r17 = r12
            if (r11 != r12) goto L6c
        L66:
            if (r8 == r7) goto L6b
            int r8 = r8 + 1
            goto L17
        L6b:
        L6c:
            return
    }

    public final V get(int r23) {
            r22 = this;
            r0 = r22
            r1 = 0
            r2 = 0
            int r3 = java.lang.Integer.hashCode(r23)
            r4 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r3 = r3 * r4
            int r4 = r3 << 16
            r2 = r3 ^ r4
            r3 = 0
            r3 = r2 & 127(0x7f, float:1.78E-43)
            int r4 = r0._capacity
            r5 = 0
            int r5 = r2 >>> 7
            r5 = r5 & r4
            r6 = 0
        L1c:
            long[] r7 = r0.metadata
            r8 = 0
            int r9 = r5 >> 3
            r10 = r5 & 7
            int r10 = r10 << 3
            r11 = r7[r9]
            long r11 = r11 >>> r10
            int r13 = r9 + 1
            r13 = r7[r13]
            int r15 = 64 - r10
            long r13 = r13 << r15
            r15 = r1
            r16 = r2
            long r1 = (long) r10
            long r1 = -r1
            r17 = 63
            long r1 = r1 >> r17
            long r1 = r1 & r13
            long r1 = r1 | r11
            r7 = r1
            r9 = 0
            long r10 = (long) r3
            r12 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r10 = r10 * r12
            long r10 = r10 ^ r7
            long r12 = r10 - r12
            r17 = r1
            long r1 = ~r10
            long r1 = r1 & r12
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r1 = r1 & r12
        L53:
            r7 = r1
            r9 = 0
            r10 = 0
            int r14 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r14 == 0) goto L5d
            r14 = 1
            goto L5e
        L5d:
            r14 = 0
        L5e:
            if (r14 == 0) goto L81
            r7 = r1
            r9 = 0
            r10 = r7
            r14 = 0
            int r19 = java.lang.Long.numberOfTrailingZeros(r10)
            int r10 = r19 >> 3
            int r10 = r10 + r5
            r7 = r10 & r4
            int[] r8 = r0.keys
            r8 = r8[r7]
            r9 = r23
            if (r8 != r9) goto L77
            goto L96
        L77:
            r10 = r1
            r8 = 0
            r19 = 1
            long r19 = r10 - r19
            long r10 = r10 & r19
            r1 = r10
            goto L53
        L81:
            r9 = r23
            r7 = r17
            r14 = 0
            r19 = r10
            long r10 = ~r7
            r21 = 6
            long r10 = r10 << r21
            long r10 = r10 & r7
            long r7 = r10 & r12
            int r7 = (r7 > r19 ? 1 : (r7 == r19 ? 0 : -1))
            if (r7 == 0) goto La4
        L95:
            r7 = -1
        L96:
            if (r7 < 0) goto La0
            r8 = r22
            java.lang.Object[] r0 = r8.values
            r0 = r0[r7]
            goto La3
        La0:
            r8 = r22
            r0 = 0
        La3:
            return r0
        La4:
            r8 = r22
            int r6 = r6 + 8
            int r7 = r5 + r6
            r5 = r7 & r4
            r1 = r15
            r2 = r16
            goto L1c
    }

    public final int getCapacity() {
            r1 = this;
            int r0 = r1._capacity
            return r0
    }

    public final V getOrDefault(int r23, V r24) {
            r22 = this;
            r0 = r22
            r1 = 0
            r2 = 0
            int r3 = java.lang.Integer.hashCode(r23)
            r4 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r3 = r3 * r4
            int r4 = r3 << 16
            r2 = r3 ^ r4
            r3 = 0
            r3 = r2 & 127(0x7f, float:1.78E-43)
            int r4 = r0._capacity
            r5 = 0
            int r5 = r2 >>> 7
            r5 = r5 & r4
            r6 = 0
        L1c:
            long[] r7 = r0.metadata
            r8 = 0
            int r9 = r5 >> 3
            r10 = r5 & 7
            int r10 = r10 << 3
            r11 = r7[r9]
            long r11 = r11 >>> r10
            int r13 = r9 + 1
            r13 = r7[r13]
            int r15 = 64 - r10
            long r13 = r13 << r15
            r15 = r1
            r16 = r2
            long r1 = (long) r10
            long r1 = -r1
            r17 = 63
            long r1 = r1 >> r17
            long r1 = r1 & r13
            long r1 = r1 | r11
            r7 = r1
            r9 = 0
            long r10 = (long) r3
            r12 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r10 = r10 * r12
            long r10 = r10 ^ r7
            long r12 = r10 - r12
            r17 = r1
            long r1 = ~r10
            long r1 = r1 & r12
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r1 = r1 & r12
        L53:
            r7 = r1
            r9 = 0
            r10 = 0
            int r14 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r14 == 0) goto L5d
            r14 = 1
            goto L5e
        L5d:
            r14 = 0
        L5e:
            if (r14 == 0) goto L81
            r7 = r1
            r9 = 0
            r10 = r7
            r14 = 0
            int r19 = java.lang.Long.numberOfTrailingZeros(r10)
            int r10 = r19 >> 3
            int r10 = r10 + r5
            r7 = r10 & r4
            int[] r8 = r0.keys
            r8 = r8[r7]
            r9 = r23
            if (r8 != r9) goto L77
            goto L96
        L77:
            r10 = r1
            r8 = 0
            r19 = 1
            long r19 = r10 - r19
            long r10 = r10 & r19
            r1 = r10
            goto L53
        L81:
            r9 = r23
            r7 = r17
            r14 = 0
            r19 = r10
            long r10 = ~r7
            r21 = 6
            long r10 = r10 << r21
            long r10 = r10 & r7
            long r7 = r10 & r12
            int r7 = (r7 > r19 ? 1 : (r7 == r19 ? 0 : -1))
            if (r7 == 0) goto La3
        L95:
            r7 = -1
        L96:
            if (r7 < 0) goto La0
            r8 = r22
            java.lang.Object[] r0 = r8.values
            r0 = r0[r7]
            return r0
        La0:
            r8 = r22
            return r24
        La3:
            r8 = r22
            int r6 = r6 + 8
            int r7 = r5 + r6
            r5 = r7 & r4
            r1 = r15
            r2 = r16
            goto L1c
    }

    public final V getOrElse(int r3, kotlin.jvm.functions.Function0<? extends V> r4) {
            r2 = this;
            java.lang.String r0 = "defaultValue"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = 0
            java.lang.Object r1 = r2.get(r3)
            if (r1 != 0) goto L10
            java.lang.Object r1 = r4.invoke()
        L10:
            return r1
    }

    public final int getSize() {
            r1 = this;
            int r0 = r1._size
            return r0
    }

    public int hashCode() {
            r23 = this;
            r0 = 0
            r1 = r23
            r2 = 0
            int[] r3 = r1.keys
            java.lang.Object[] r4 = r1.values
            r5 = r1
            r6 = 0
            long[] r7 = r5.metadata
            int r8 = r7.length
            int r8 = r8 + (-2)
            r9 = 0
            if (r9 > r8) goto L79
        L12:
            r10 = r7[r9]
            r12 = r10
            r14 = 0
            r16 = r0
            r15 = r1
            long r0 = ~r12
            r17 = 7
            long r0 = r0 << r17
            long r0 = r0 & r12
            r17 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r0 = r0 & r17
            int r0 = (r0 > r17 ? 1 : (r0 == r17 ? 0 : -1))
            if (r0 == 0) goto L71
            int r0 = r9 - r8
            int r0 = ~r0
            int r0 = r0 >>> 31
            r1 = 8
            int r0 = 8 - r0
            r12 = 0
        L34:
            if (r12 >= r0) goto L6c
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r10
            r17 = 0
            r18 = 128(0x80, double:6.3E-322)
            int r18 = (r13 > r18 ? 1 : (r13 == r18 ? 0 : -1))
            r19 = 0
            if (r18 >= 0) goto L46
            r18 = 1
            goto L48
        L46:
            r18 = r19
        L48:
            if (r18 == 0) goto L68
            int r13 = r9 << 3
            int r13 = r13 + r12
            r14 = r13
            r17 = 0
            r18 = r3[r14]
            r20 = r4[r14]
            r21 = 0
            int r22 = java.lang.Integer.hashCode(r18)
            if (r20 == 0) goto L60
            int r19 = r20.hashCode()
        L60:
            r19 = r22 ^ r19
            int r16 = r16 + r19
        L68:
            long r10 = r10 >> r1
            int r12 = r12 + 1
            goto L34
        L6c:
            if (r0 != r1) goto L7c
            r0 = r16
            goto L73
        L71:
            r0 = r16
        L73:
            if (r9 == r8) goto L7a
            int r9 = r9 + 1
            r1 = r15
            goto L12
        L79:
            r15 = r1
        L7a:
            r16 = r0
        L7c:
            return r16
    }

    public final boolean isEmpty() {
            r1 = this;
            int r0 = r1._size
            if (r0 != 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    public final boolean isNotEmpty() {
            r1 = this;
            int r0 = r1._size
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    public final java.lang.String joinToString() {
            r8 = this;
            r6 = 31
            r7 = 0
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r0 = r8
            java.lang.String r1 = joinToString$default(r0, r1, r2, r3, r4, r5, r6, r7)
            return r1
    }

    public final java.lang.String joinToString(java.lang.CharSequence r10) {
            r9 = this;
            java.lang.String r0 = "separator"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            r7 = 30
            r8 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r1 = r9
            r2 = r10
            java.lang.String r10 = joinToString$default(r1, r2, r3, r4, r5, r6, r7, r8)
            return r10
    }

    public final java.lang.String joinToString(java.lang.CharSequence r10, java.lang.CharSequence r11) {
            r9 = this;
            java.lang.String r0 = "separator"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.lang.String r0 = "prefix"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            r7 = 28
            r8 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r1 = r9
            r2 = r10
            r3 = r11
            java.lang.String r10 = joinToString$default(r1, r2, r3, r4, r5, r6, r7, r8)
            return r10
    }

    public final java.lang.String joinToString(java.lang.CharSequence r10, java.lang.CharSequence r11, java.lang.CharSequence r12) {
            r9 = this;
            java.lang.String r0 = "separator"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.lang.String r0 = "prefix"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.lang.String r0 = "postfix"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            r7 = 24
            r8 = 0
            r5 = 0
            r6 = 0
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            java.lang.String r10 = joinToString$default(r1, r2, r3, r4, r5, r6, r7, r8)
            return r10
    }

    public final java.lang.String joinToString(java.lang.CharSequence r10, java.lang.CharSequence r11, java.lang.CharSequence r12, int r13) {
            r9 = this;
            java.lang.String r0 = "separator"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.lang.String r0 = "prefix"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.lang.String r0 = "postfix"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            r7 = 16
            r8 = 0
            r6 = 0
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            java.lang.String r10 = joinToString$default(r1, r2, r3, r4, r5, r6, r7, r8)
            return r10
    }

    public final java.lang.String joinToString(java.lang.CharSequence r29, java.lang.CharSequence r30, java.lang.CharSequence r31, int r32, java.lang.CharSequence r33) {
            r28 = this;
            r0 = r29
            r1 = r30
            r2 = r31
            r3 = r33
            java.lang.String r4 = "separator"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r4)
            java.lang.String r4 = "prefix"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r4)
            java.lang.String r4 = "postfix"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r4)
            java.lang.String r4 = "truncated"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r5 = r4
            r6 = 0
            r5.append(r1)
            r7 = 0
            r8 = r28
            r9 = 0
            int[] r10 = r8.keys
            java.lang.Object[] r11 = r8.values
            r12 = r8
            r13 = 0
            long[] r14 = r12.metadata
            int r15 = r14.length
            int r15 = r15 + (-2)
            r1 = 0
            if (r1 > r15) goto Le4
        L38:
            r16 = r14[r1]
            r18 = r16
            r20 = 0
            r21 = r6
            r22 = r7
            r6 = r18
            r18 = r8
            r19 = r9
            long r8 = ~r6
            r23 = 7
            long r8 = r8 << r23
            long r8 = r8 & r6
            r23 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r8 & r23
            int r6 = (r6 > r23 ? 1 : (r6 == r23 ? 0 : -1))
            if (r6 == 0) goto Lce
            int r6 = r1 - r15
            int r6 = ~r6
            int r6 = r6 >>> 31
            r7 = 8
            int r6 = 8 - r6
            r8 = 0
            r9 = r8
            r8 = r22
        L66:
            if (r9 >= r6) goto Lc2
            r22 = 255(0xff, double:1.26E-321)
            long r22 = r16 & r22
            r20 = 0
            r24 = 128(0x80, double:6.3E-322)
            int r24 = (r22 > r24 ? 1 : (r22 == r24 ? 0 : -1))
            if (r24 >= 0) goto L77
            r24 = 1
            goto L79
        L77:
            r24 = 0
        L79:
            if (r24 == 0) goto Lb1
            int r20 = r1 << 3
            int r20 = r20 + r9
            r22 = r20
            r23 = 0
            r24 = r10[r22]
            r25 = r7
            r7 = r11[r22]
            r26 = r24
            r24 = 0
            r27 = r4
            r4 = r32
            if (r8 != r4) goto L98
            r5.append(r3)
            goto Lf4
        L98:
            if (r8 == 0) goto L9d
            r5.append(r0)
        L9d:
            r0 = r26
            r5.append(r0)
            r0 = 61
            r5.append(r0)
            r5.append(r7)
            int r8 = r8 + 1
            goto Lb7
        Lb1:
            r27 = r4
            r25 = r7
            r4 = r32
        Lb7:
            long r16 = r16 >> r25
            int r9 = r9 + 1
            r0 = r29
            r7 = r25
            r4 = r27
            goto L66
        Lc2:
            r27 = r4
            r25 = r7
            r4 = r32
            r0 = r25
            if (r6 != r0) goto Lef
            r7 = r8
            goto Ld4
        Lce:
            r27 = r4
            r4 = r32
            r7 = r22
        Ld4:
            if (r1 == r15) goto Lee
            int r1 = r1 + 1
            r0 = r29
            r8 = r18
            r9 = r19
            r6 = r21
            r4 = r27
            goto L38
        Le4:
            r27 = r4
            r21 = r6
            r18 = r8
            r19 = r9
            r4 = r32
        Lee:
            r8 = r7
        Lef:
            r5.append(r2)
        Lf4:
            java.lang.String r0 = r27.toString()
            java.lang.String r1 = "StringBuilder().apply(builderAction).toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    public final java.lang.String joinToString(java.lang.CharSequence r31, java.lang.CharSequence r32, java.lang.CharSequence r33, int r34, java.lang.CharSequence r35, kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super V, ? extends java.lang.CharSequence> r36) {
            r30 = this;
            r0 = r31
            r1 = r32
            r2 = r33
            r3 = r35
            r4 = r36
            java.lang.String r5 = "separator"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r5)
            java.lang.String r5 = "prefix"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r5)
            java.lang.String r5 = "postfix"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r5)
            java.lang.String r5 = "truncated"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r5)
            java.lang.String r5 = "transform"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r5)
            r5 = 0
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r7 = r6
            r8 = 0
            r7.append(r1)
            r9 = 0
            r10 = r30
            r11 = 0
            int[] r12 = r10.keys
            java.lang.Object[] r13 = r10.values
            r14 = r10
            r15 = 0
            long[] r1 = r14.metadata
            r16 = r5
            int r5 = r1.length
            int r5 = r5 + (-2)
            r17 = r1
            r1 = 0
            if (r1 > r5) goto Led
        L44:
            r18 = r17[r1]
            r20 = r18
            r22 = 0
            r23 = r8
            r24 = r9
            r8 = r20
            r20 = r10
            r21 = r11
            long r10 = ~r8
            r25 = 7
            long r10 = r10 << r25
            long r10 = r10 & r8
            r25 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r10 & r25
            int r8 = (r8 > r25 ? 1 : (r8 == r25 ? 0 : -1))
            if (r8 == 0) goto Ld7
            int r8 = r1 - r5
            int r8 = ~r8
            int r8 = r8 >>> 31
            r9 = 8
            int r8 = 8 - r8
            r10 = 0
            r11 = r10
            r10 = r24
        L72:
            if (r11 >= r8) goto Lcb
            r24 = 255(0xff, double:1.26E-321)
            long r24 = r18 & r24
            r22 = 0
            r26 = 128(0x80, double:6.3E-322)
            int r26 = (r24 > r26 ? 1 : (r24 == r26 ? 0 : -1))
            if (r26 >= 0) goto L83
            r26 = 1
            goto L85
        L83:
            r26 = 0
        L85:
            if (r26 == 0) goto Lba
            int r22 = r1 << 3
            int r22 = r22 + r11
            r24 = r22
            r25 = 0
            r26 = r12[r24]
            r27 = r9
            r9 = r13[r24]
            r28 = 0
            r29 = r6
            r6 = r34
            if (r10 != r6) goto La2
            r7.append(r3)
            goto Lfd
        La2:
            if (r10 == 0) goto La7
            r7.append(r0)
        La7:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r26)
            java.lang.Object r0 = r4.invoke(r0, r9)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r7.append(r0)
            int r10 = r10 + 1
            goto Lc0
        Lba:
            r29 = r6
            r27 = r9
            r6 = r34
        Lc0:
            long r18 = r18 >> r27
            int r11 = r11 + 1
            r0 = r31
            r9 = r27
            r6 = r29
            goto L72
        Lcb:
            r29 = r6
            r27 = r9
            r6 = r34
            r0 = r27
            if (r8 != r0) goto Lf8
            r9 = r10
            goto Ldd
        Ld7:
            r29 = r6
            r6 = r34
            r9 = r24
        Ldd:
            if (r1 == r5) goto Lf7
            int r1 = r1 + 1
            r0 = r31
            r10 = r20
            r11 = r21
            r8 = r23
            r6 = r29
            goto L44
        Led:
            r29 = r6
            r23 = r8
            r20 = r10
            r21 = r11
            r6 = r34
        Lf7:
            r10 = r9
        Lf8:
            r7.append(r2)
        Lfd:
            java.lang.String r0 = r29.toString()
            java.lang.String r1 = "StringBuilder().apply(builderAction).toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    public final java.lang.String joinToString(java.lang.CharSequence r32, java.lang.CharSequence r33, java.lang.CharSequence r34, int r35, kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super V, ? extends java.lang.CharSequence> r36) {
            r31 = this;
            r0 = r32
            r1 = r33
            r2 = r34
            r3 = r36
            java.lang.String r4 = "separator"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r4)
            java.lang.String r4 = "prefix"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r4)
            java.lang.String r4 = "postfix"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r4)
            java.lang.String r4 = "transform"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r4)
            r4 = 0
            java.lang.String r5 = "..."
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            r6 = 0
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r8 = r7
            r9 = 0
            r8.append(r1)
            r10 = 0
            r11 = r31
            r12 = 0
            int[] r13 = r11.keys
            java.lang.Object[] r14 = r11.values
            r15 = r11
            r16 = 0
            long[] r1 = r15.metadata
            r17 = r4
            int r4 = r1.length
            int r4 = r4 + (-2)
            r18 = r1
            r1 = 0
            if (r1 > r4) goto Le5
        L44:
            r19 = r18[r1]
            r21 = r19
            r23 = 0
            r24 = r6
            r25 = r7
            r6 = r21
            r21 = r9
            r22 = r10
            long r9 = ~r6
            r26 = 7
            long r9 = r9 << r26
            long r9 = r9 & r6
            r26 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r9 & r26
            int r6 = (r6 > r26 ? 1 : (r6 == r26 ? 0 : -1))
            if (r6 == 0) goto Ld3
            int r6 = r1 - r4
            int r6 = ~r6
            int r6 = r6 >>> 31
            r7 = 8
            int r6 = 8 - r6
            r9 = 0
            r10 = r22
        L71:
            if (r9 >= r6) goto Lc8
            r22 = 255(0xff, double:1.26E-321)
            long r22 = r19 & r22
            r26 = 0
            r27 = 128(0x80, double:6.3E-322)
            int r27 = (r22 > r27 ? 1 : (r22 == r27 ? 0 : -1))
            if (r27 >= 0) goto L82
            r27 = 1
            goto L84
        L82:
            r27 = 0
        L84:
            if (r27 == 0) goto Lb8
            int r22 = r1 << 3
            int r22 = r22 + r9
            r23 = r22
            r26 = 0
            r27 = r13[r23]
            r28 = r7
            r7 = r14[r23]
            r29 = 0
            r30 = r9
            r9 = r35
            if (r10 != r9) goto La0
            r8.append(r5)
            goto Lf3
        La0:
            if (r10 == 0) goto La5
            r8.append(r0)
        La5:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r27)
            java.lang.Object r0 = r3.invoke(r0, r7)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r8.append(r0)
            int r10 = r10 + 1
            goto Lbe
        Lb8:
            r28 = r7
            r30 = r9
            r9 = r35
        Lbe:
            long r19 = r19 >> r28
            int r0 = r30 + 1
            r9 = r0
            r7 = r28
            r0 = r32
            goto L71
        Lc8:
            r28 = r7
            r30 = r9
            r9 = r35
            r0 = r28
            if (r6 != r0) goto Lee
            goto Ld7
        Ld3:
            r9 = r35
            r10 = r22
        Ld7:
            if (r1 == r4) goto Led
            int r1 = r1 + 1
            r0 = r32
            r9 = r21
            r6 = r24
            r7 = r25
            goto L44
        Le5:
            r24 = r6
            r25 = r7
            r21 = r9
            r9 = r35
        Led:
        Lee:
            r8.append(r2)
        Lf3:
            java.lang.String r0 = r25.toString()
            java.lang.String r1 = "StringBuilder().apply(builderAction).toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    public final java.lang.String joinToString(java.lang.CharSequence r32, java.lang.CharSequence r33, java.lang.CharSequence r34, kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super V, ? extends java.lang.CharSequence> r35) {
            r31 = this;
            r0 = r32
            r1 = r33
            r2 = r34
            r3 = r35
            java.lang.String r4 = "separator"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r4)
            java.lang.String r4 = "prefix"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r4)
            java.lang.String r4 = "postfix"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r4)
            java.lang.String r4 = "transform"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r4)
            r4 = 0
            r5 = -1
            java.lang.String r6 = "..."
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            r7 = 0
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r9 = r8
            r10 = 0
            r9.append(r1)
            r11 = 0
            r12 = r31
            r13 = 0
            int[] r14 = r12.keys
            java.lang.Object[] r15 = r12.values
            r16 = r12
            r17 = 0
            r1 = r16
            r16 = r4
            long[] r4 = r1.metadata
            r18 = r1
            int r1 = r4.length
            int r1 = r1 + (-2)
            r19 = r4
            r4 = 0
            if (r4 > r1) goto Ldd
        L4b:
            r20 = r19[r4]
            r22 = r20
            r24 = 0
            r25 = r7
            r26 = r8
            r7 = r22
            r22 = r10
            r23 = r11
            long r10 = ~r7
            r27 = 7
            long r10 = r10 << r27
            long r10 = r10 & r7
            r27 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r10 & r27
            int r7 = (r7 > r27 ? 1 : (r7 == r27 ? 0 : -1))
            if (r7 == 0) goto Lcd
            int r7 = r4 - r1
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r10 = 0
            r11 = r23
        L78:
            if (r10 >= r7) goto Lc6
            r23 = 255(0xff, double:1.26E-321)
            long r23 = r20 & r23
            r27 = 0
            r28 = 128(0x80, double:6.3E-322)
            int r28 = (r23 > r28 ? 1 : (r23 == r28 ? 0 : -1))
            if (r28 >= 0) goto L89
            r28 = 1
            goto L8b
        L89:
            r28 = 0
        L8b:
            if (r28 == 0) goto Lbb
            int r23 = r4 << 3
            int r23 = r23 + r10
            r24 = r23
            r27 = 0
            r28 = r14[r24]
            r29 = r8
            r8 = r15[r24]
            r30 = 0
            if (r11 != r5) goto La3
            r9.append(r6)
            goto Le9
        La3:
            if (r11 == 0) goto La8
            r9.append(r0)
        La8:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r28)
            java.lang.Object r0 = r3.invoke(r0, r8)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r9.append(r0)
            int r11 = r11 + 1
            goto Lbd
        Lbb:
            r29 = r8
        Lbd:
            long r20 = r20 >> r29
            int r10 = r10 + 1
            r0 = r32
            r8 = r29
            goto L78
        Lc6:
            r29 = r8
            r0 = r29
            if (r7 != r0) goto Le4
            goto Lcf
        Lcd:
            r11 = r23
        Lcf:
            if (r4 == r1) goto Le3
            int r4 = r4 + 1
            r0 = r32
            r10 = r22
            r7 = r25
            r8 = r26
            goto L4b
        Ldd:
            r25 = r7
            r26 = r8
            r22 = r10
        Le3:
        Le4:
            r9.append(r2)
        Le9:
            java.lang.String r0 = r26.toString()
            java.lang.String r1 = "StringBuilder().apply(builderAction).toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    public final java.lang.String joinToString(java.lang.CharSequence r32, java.lang.CharSequence r33, kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super V, ? extends java.lang.CharSequence> r34) {
            r31 = this;
            r0 = r32
            r1 = r33
            r2 = r34
            java.lang.String r3 = "separator"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r3)
            java.lang.String r3 = "prefix"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r3)
            java.lang.String r3 = "transform"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r3)
            r3 = 0
            java.lang.String r4 = ""
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            r5 = -1
            java.lang.String r6 = "..."
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            r7 = 0
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r9 = r8
            r10 = 0
            r9.append(r1)
            r11 = 0
            r12 = r31
            r13 = 0
            int[] r14 = r12.keys
            java.lang.Object[] r15 = r12.values
            r16 = r12
            r17 = 0
            r1 = r16
            r16 = r3
            long[] r3 = r1.metadata
            r18 = r1
            int r1 = r3.length
            int r1 = r1 + (-2)
            r19 = r3
            r3 = 0
            if (r3 > r1) goto Ldb
        L49:
            r20 = r19[r3]
            r22 = r20
            r24 = 0
            r25 = r7
            r26 = r8
            r7 = r22
            r22 = r10
            r23 = r11
            long r10 = ~r7
            r27 = 7
            long r10 = r10 << r27
            long r10 = r10 & r7
            r27 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r10 & r27
            int r7 = (r7 > r27 ? 1 : (r7 == r27 ? 0 : -1))
            if (r7 == 0) goto Lcb
            int r7 = r3 - r1
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r10 = 0
            r11 = r23
        L76:
            if (r10 >= r7) goto Lc4
            r23 = 255(0xff, double:1.26E-321)
            long r23 = r20 & r23
            r27 = 0
            r28 = 128(0x80, double:6.3E-322)
            int r28 = (r23 > r28 ? 1 : (r23 == r28 ? 0 : -1))
            if (r28 >= 0) goto L87
            r28 = 1
            goto L89
        L87:
            r28 = 0
        L89:
            if (r28 == 0) goto Lb9
            int r23 = r3 << 3
            int r23 = r23 + r10
            r24 = r23
            r27 = 0
            r28 = r14[r24]
            r29 = r8
            r8 = r15[r24]
            r30 = 0
            if (r11 != r5) goto La1
            r9.append(r6)
            goto Le7
        La1:
            if (r11 == 0) goto La6
            r9.append(r0)
        La6:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r28)
            java.lang.Object r0 = r2.invoke(r0, r8)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r9.append(r0)
            int r11 = r11 + 1
            goto Lbb
        Lb9:
            r29 = r8
        Lbb:
            long r20 = r20 >> r29
            int r10 = r10 + 1
            r0 = r32
            r8 = r29
            goto L76
        Lc4:
            r29 = r8
            r0 = r29
            if (r7 != r0) goto Le2
            goto Lcd
        Lcb:
            r11 = r23
        Lcd:
            if (r3 == r1) goto Le1
            int r3 = r3 + 1
            r0 = r32
            r10 = r22
            r7 = r25
            r8 = r26
            goto L49
        Ldb:
            r25 = r7
            r26 = r8
            r22 = r10
        Le1:
        Le2:
            r9.append(r4)
        Le7:
            java.lang.String r0 = r26.toString()
            java.lang.String r1 = "StringBuilder().apply(builderAction).toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    public final java.lang.String joinToString(java.lang.CharSequence r33, kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super V, ? extends java.lang.CharSequence> r34) {
            r32 = this;
            r0 = r33
            r1 = r34
            java.lang.String r2 = "separator"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r2)
            java.lang.String r2 = "transform"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            r2 = 0
            java.lang.String r3 = ""
            r4 = r3
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            r5 = -1
            java.lang.String r6 = "..."
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            r7 = 0
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r9 = r8
            r10 = 0
            r9.append(r4)
            r11 = 0
            r12 = r32
            r13 = 0
            int[] r14 = r12.keys
            java.lang.Object[] r15 = r12.values
            r16 = r12
            r17 = 0
            r18 = r2
            r2 = r16
            r16 = r4
            long[] r4 = r2.metadata
            r19 = r2
            int r2 = r4.length
            int r2 = r2 + (-2)
            r20 = r4
            r4 = 0
            if (r4 > r2) goto Lda
        L48:
            r21 = r20[r4]
            r23 = r21
            r25 = 0
            r26 = r7
            r27 = r8
            r7 = r23
            r23 = r10
            r24 = r11
            long r10 = ~r7
            r28 = 7
            long r10 = r10 << r28
            long r10 = r10 & r7
            r28 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r10 & r28
            int r7 = (r7 > r28 ? 1 : (r7 == r28 ? 0 : -1))
            if (r7 == 0) goto Lca
            int r7 = r4 - r2
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r10 = 0
            r11 = r24
        L75:
            if (r10 >= r7) goto Lc3
            r24 = 255(0xff, double:1.26E-321)
            long r24 = r21 & r24
            r28 = 0
            r29 = 128(0x80, double:6.3E-322)
            int r29 = (r24 > r29 ? 1 : (r24 == r29 ? 0 : -1))
            if (r29 >= 0) goto L86
            r29 = 1
            goto L88
        L86:
            r29 = 0
        L88:
            if (r29 == 0) goto Lb8
            int r24 = r4 << 3
            int r24 = r24 + r10
            r25 = r24
            r28 = 0
            r29 = r14[r25]
            r30 = r8
            r8 = r15[r25]
            r31 = 0
            if (r11 != r5) goto La0
            r9.append(r6)
            goto Le6
        La0:
            if (r11 == 0) goto La5
            r9.append(r0)
        La5:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r29)
            java.lang.Object r0 = r1.invoke(r0, r8)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r9.append(r0)
            int r11 = r11 + 1
            goto Lba
        Lb8:
            r30 = r8
        Lba:
            long r21 = r21 >> r30
            int r10 = r10 + 1
            r0 = r33
            r8 = r30
            goto L75
        Lc3:
            r30 = r8
            r0 = r30
            if (r7 != r0) goto Le1
            goto Lcc
        Lca:
            r11 = r24
        Lcc:
            if (r4 == r2) goto Le0
            int r4 = r4 + 1
            r0 = r33
            r10 = r23
            r7 = r26
            r8 = r27
            goto L48
        Lda:
            r26 = r7
            r27 = r8
            r23 = r10
        Le0:
        Le1:
            r9.append(r3)
        Le6:
            java.lang.String r0 = r27.toString()
            java.lang.String r2 = "StringBuilder().apply(builderAction).toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)
            return r0
    }

    public final java.lang.String joinToString(kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super V, ? extends java.lang.CharSequence> r34) {
            r33 = this;
            r0 = r34
            java.lang.String r1 = "transform"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            r1 = 0
            java.lang.String r2 = ", "
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            java.lang.String r3 = ""
            r4 = r3
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            r5 = -1
            java.lang.String r6 = "..."
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            r7 = 0
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r9 = r8
            r10 = 0
            r9.append(r4)
            r11 = 0
            r12 = r33
            r13 = 0
            int[] r14 = r12.keys
            java.lang.Object[] r15 = r12.values
            r16 = r12
            r17 = 0
            r18 = r1
            r1 = r16
            r16 = r4
            long[] r4 = r1.metadata
            r19 = r1
            int r1 = r4.length
            int r1 = r1 + (-2)
            r20 = r4
            r4 = 0
            if (r4 > r1) goto Le2
        L46:
            r21 = r20[r4]
            r23 = r21
            r25 = 0
            r26 = r7
            r27 = r8
            r7 = r23
            r23 = r10
            r24 = r11
            long r10 = ~r7
            r28 = 7
            long r10 = r10 << r28
            long r10 = r10 & r7
            r28 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r10 & r28
            int r7 = (r7 > r28 ? 1 : (r7 == r28 ? 0 : -1))
            if (r7 == 0) goto Ld0
            int r7 = r4 - r1
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r10 = 0
            r11 = r24
        L73:
            if (r10 >= r7) goto Lc7
            r24 = 255(0xff, double:1.26E-321)
            long r24 = r21 & r24
            r28 = 0
            r29 = 128(0x80, double:6.3E-322)
            int r29 = (r24 > r29 ? 1 : (r24 == r29 ? 0 : -1))
            if (r29 >= 0) goto L84
            r29 = 1
            goto L86
        L84:
            r29 = 0
        L86:
            if (r29 == 0) goto Lba
            int r24 = r4 << 3
            int r24 = r24 + r10
            r25 = r24
            r28 = 0
            r29 = r14[r25]
            r30 = r8
            r8 = r15[r25]
            r31 = 0
            if (r11 != r5) goto La0
            r9.append(r6)
            r32 = r2
            goto Lf0
        La0:
            if (r11 == 0) goto La5
            r9.append(r2)
        La5:
            r32 = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r29)
            java.lang.Object r2 = r0.invoke(r2, r8)
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r9.append(r2)
            int r11 = r11 + 1
            goto Lbe
        Lba:
            r32 = r2
            r30 = r8
        Lbe:
            long r21 = r21 >> r30
            int r10 = r10 + 1
            r8 = r30
            r2 = r32
            goto L73
        Lc7:
            r32 = r2
            r30 = r8
            r2 = r30
            if (r7 != r2) goto Leb
            goto Ld4
        Ld0:
            r32 = r2
            r11 = r24
        Ld4:
            if (r4 == r1) goto Lea
            int r4 = r4 + 1
            r10 = r23
            r7 = r26
            r8 = r27
            r2 = r32
            goto L46
        Le2:
            r32 = r2
            r26 = r7
            r27 = r8
            r23 = r10
        Lea:
        Leb:
            r9.append(r3)
        Lf0:
            java.lang.String r1 = r27.toString()
            java.lang.String r2 = "StringBuilder().apply(builderAction).toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            return r1
    }

    public final boolean none() {
            r1 = this;
            int r0 = r1._size
            if (r0 != 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    public java.lang.String toString() {
            r25 = this;
            r0 = r25
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto Lb
            java.lang.String r1 = "{}"
            return r1
        Lb:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r2 = 123(0x7b, float:1.72E-43)
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = 0
            r3 = r25
            r4 = 0
            int[] r5 = r3.keys
            java.lang.Object[] r6 = r3.values
            r7 = r3
            r8 = 0
            long[] r9 = r7.metadata
            int r10 = r9.length
            int r10 = r10 + (-2)
            r11 = 0
            if (r11 > r10) goto Lc7
        L28:
            r12 = r9[r11]
            r14 = r12
            r16 = 0
            r18 = r2
            r17 = r3
            long r2 = ~r14
            r19 = 7
            long r2 = r2 << r19
            long r2 = r2 & r14
            r19 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r2 = r2 & r19
            int r2 = (r2 > r19 ? 1 : (r2 == r19 ? 0 : -1))
            if (r2 == 0) goto Lb7
            int r2 = r11 - r10
            int r2 = ~r2
            int r2 = r2 >>> 31
            r3 = 8
            int r2 = 8 - r2
            r14 = 0
        L4c:
            if (r14 >= r2) goto Lac
            r15 = 255(0xff, double:1.26E-321)
            long r15 = r15 & r12
            r19 = 0
            r20 = 128(0x80, double:6.3E-322)
            int r20 = (r15 > r20 ? 1 : (r15 == r20 ? 0 : -1))
            if (r20 >= 0) goto L5c
            r20 = 1
            goto L5e
        L5c:
            r20 = 0
        L5e:
            if (r20 == 0) goto L9d
            int r15 = r11 << 3
            int r15 = r15 + r14
            r16 = r15
            r19 = 0
            r20 = r3
            r3 = r5[r16]
            r21 = r4
            r4 = r6[r16]
            r22 = 0
            r1.append(r3)
            r23 = r3
            java.lang.String r3 = "="
            r1.append(r3)
            if (r4 != r0) goto L80
            java.lang.String r3 = "(this)"
            goto L81
        L80:
            r3 = r4
        L81:
            r1.append(r3)
            int r3 = r18 + 1
            r24 = r4
            int r4 = r0._size
            if (r3 >= r4) goto L97
            r4 = 44
            java.lang.StringBuilder r4 = r1.append(r4)
            r0 = 32
            r4.append(r0)
        L97:
            r18 = r3
            goto La1
        L9d:
            r20 = r3
            r21 = r4
        La1:
            long r12 = r12 >> r20
            int r14 = r14 + 1
            r0 = r25
            r3 = r20
            r4 = r21
            goto L4c
        Lac:
            r20 = r3
            r21 = r4
            r0 = r20
            if (r2 != r0) goto Lcd
            r2 = r18
            goto Lbb
        Lb7:
            r21 = r4
            r2 = r18
        Lbb:
            if (r11 == r10) goto Lcb
            int r11 = r11 + 1
            r0 = r25
            r3 = r17
            r4 = r21
            goto L28
        Lc7:
            r17 = r3
            r21 = r4
        Lcb:
            r18 = r2
        Lcd:
            r0 = 125(0x7d, float:1.75E-43)
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "s.append('}').toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)
            return r0
    }
}
