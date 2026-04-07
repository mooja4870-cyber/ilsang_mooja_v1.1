package androidx.collection;

/* JADX INFO: compiled from: IntSet.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\u0007\b\u0004¢\u0006\u0002\u0010\u0002J:\u0010\u0011\u001a\u00020\u00122!\u0010\u0013\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\u00120\u0014H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J\u0006\u0010\u0018\u001a\u00020\u0012J:\u0010\u0018\u001a\u00020\u00122!\u0010\u0013\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\u00120\u0014H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J\u0011\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0004H\u0086\u0002J\b\u0010\u001a\u001a\u00020\u0004H\u0007J:\u0010\u001a\u001a\u00020\u00042!\u0010\u0013\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\u00120\u0014H\u0087\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J\u0013\u0010\u001b\u001a\u00020\u00122\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\u0016\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0004H\u0080\b¢\u0006\u0002\b\u001eJ\t\u0010\u001f\u001a\u00020\u0004H\u0086\bJ:\u0010\u001f\u001a\u00020\u00042!\u0010\u0013\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\u00120\u0014H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J:\u0010 \u001a\u00020!2!\u0010\"\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020!0\u0014H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J:\u0010#\u001a\u00020!2!\u0010\"\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b($\u0012\u0004\u0012\u00020!0\u0014H\u0081\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J\b\u0010%\u001a\u00020\u0004H\u0016J\u0006\u0010&\u001a\u00020\u0012J\u0006\u0010'\u001a\u00020\u0012J:\u0010(\u001a\u00020)2\b\b\u0002\u0010*\u001a\u00020+2\b\b\u0002\u0010,\u001a\u00020+2\b\b\u0002\u0010-\u001a\u00020+2\b\b\u0002\u0010.\u001a\u00020\u00042\b\b\u0002\u0010/\u001a\u00020+H\u0007JT\u0010(\u001a\u00020)2\b\b\u0002\u0010*\u001a\u00020+2\b\b\u0002\u0010,\u001a\u00020+2\b\b\u0002\u0010-\u001a\u00020+2\b\b\u0002\u0010.\u001a\u00020\u00042\b\b\u0002\u0010/\u001a\u00020+2\u0014\b\u0004\u00100\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020+0\u0014H\u0087\bø\u0001\u0000J\u0006\u00101\u001a\u00020\u0012J\b\u00102\u001a\u00020)H\u0016R\u0012\u0010\u0003\u001a\u00020\u00048\u0000@\u0000X\u0081\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u00020\u00048\u0000@\u0000X\u0081\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\t\u001a\u00020\n8\u0000@\u0000X\u0081\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u000b\u0010\u0002R\u0018\u0010\f\u001a\u00020\r8\u0000@\u0000X\u0081\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u000e\u0010\u0002R\u0011\u0010\u000f\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0010\u0010\b\u0082\u0001\u00013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u00064"}, d2 = {"Landroidx/collection/IntSet;", "", "()V", "_capacity", "", "_size", "capacity", "getCapacity", "()I", "elements", "", "getElements$annotations", "metadata", "", "getMetadata$annotations", "size", "getSize", "all", "", "predicate", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "element", "any", "contains", "count", "equals", "other", "findElementIndex", "findElementIndex$collection", "first", "forEach", "", "block", "forEachIndex", "index", "hashCode", "isEmpty", "isNotEmpty", "joinToString", "", "separator", "", "prefix", "postfix", "limit", "truncated", "transform", "none", "toString", "Landroidx/collection/MutableIntSet;", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class IntSet {
    public int _capacity;
    public int _size;
    public int[] elements;
    public long[] metadata;

    private IntSet() {
            r1 = this;
            r1.<init>()
            long[] r0 = androidx.collection.ScatterMapKt.EmptyGroup
            r1.metadata = r0
            int[] r0 = androidx.collection.IntSetKt.getEmptyIntArray()
            r1.elements = r0
            return
    }

    public /* synthetic */ IntSet(kotlin.jvm.internal.DefaultConstructorMarker r1) {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ void getElements$annotations() {
            return
    }

    public static /* synthetic */ void getMetadata$annotations() {
            return
    }

    public static /* synthetic */ java.lang.String joinToString$default(androidx.collection.IntSet r1, java.lang.CharSequence r2, java.lang.CharSequence r3, java.lang.CharSequence r4, int r5, java.lang.CharSequence r6, int r7, java.lang.Object r8) {
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

    public static /* synthetic */ java.lang.String joinToString$default(androidx.collection.IntSet r24, java.lang.CharSequence r25, java.lang.CharSequence r26, java.lang.CharSequence r27, int r28, java.lang.CharSequence r29, kotlin.jvm.functions.Function1 r30, int r31, java.lang.Object r32) {
            r0 = r30
            if (r32 != 0) goto L115
            r1 = r31 & 1
            if (r1 == 0) goto Ld
            java.lang.String r1 = ", "
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            goto Lf
        Ld:
            r1 = r25
        Lf:
            r2 = r31 & 2
            java.lang.String r3 = ""
            if (r2 == 0) goto L19
            r2 = r3
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            goto L1b
        L19:
            r2 = r26
        L1b:
            r4 = r31 & 4
            if (r4 == 0) goto L22
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            goto L24
        L22:
            r3 = r27
        L24:
            r4 = r31 & 8
            if (r4 == 0) goto L2a
            r4 = -1
            goto L2c
        L2a:
            r4 = r28
        L2c:
            r5 = r31 & 16
            if (r5 == 0) goto L35
            java.lang.String r5 = "..."
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            goto L37
        L35:
            r5 = r29
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
            r11 = r24
            r12 = 0
            int[] r13 = r11.elements
            r14 = r11
            r15 = 0
            r25 = r2
            long[] r2 = r14.metadata
            r26 = r6
            int r6 = r2.length
            int r6 = r6 + (-2)
            r27 = r2
            r2 = 0
            if (r2 > r6) goto Lff
        L73:
            r16 = r27[r2]
            r28 = r16
            r18 = 0
            r31 = r9
            r32 = r10
            r9 = r28
            r28 = r11
            r29 = r12
            long r11 = ~r9
            r19 = 7
            long r11 = r11 << r19
            long r11 = r11 & r9
            r19 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r11 & r19
            int r9 = (r9 > r19 ? 1 : (r9 == r19 ? 0 : -1))
            if (r9 == 0) goto Lf1
            int r9 = r2 - r6
            int r9 = ~r9
            int r9 = r9 >>> 31
            r10 = 8
            int r9 = 8 - r9
            r11 = 0
            r12 = r11
            r11 = r32
        La1:
            if (r12 >= r9) goto Leb
            r18 = 255(0xff, double:1.26E-321)
            long r18 = r16 & r18
            r20 = 0
            r21 = 128(0x80, double:6.3E-322)
            int r21 = (r18 > r21 ? 1 : (r18 == r21 ? 0 : -1))
            if (r21 >= 0) goto Lb2
            r21 = 1
            goto Lb4
        Lb2:
            r21 = 0
        Lb4:
            if (r21 == 0) goto Le2
            int r18 = r2 << 3
            int r18 = r18 + r12
            r19 = r18
            r20 = 0
            r21 = r13[r19]
            r22 = 0
            if (r11 != r4) goto Lc8
            r8.append(r5)
            goto L10b
        Lc8:
            if (r11 == 0) goto Lcd
            r8.append(r1)
        Lcd:
            r23 = r10
            java.lang.Integer r10 = java.lang.Integer.valueOf(r21)
            java.lang.Object r10 = r0.invoke(r10)
            java.lang.CharSequence r10 = (java.lang.CharSequence) r10
            r8.append(r10)
            int r11 = r11 + 1
            goto Le4
        Le2:
            r23 = r10
        Le4:
            long r16 = r16 >> r23
            int r12 = r12 + 1
            r10 = r23
            goto La1
        Leb:
            r23 = r10
            if (r9 != r10) goto L106
            r10 = r11
            goto Lf3
        Lf1:
            r10 = r32
        Lf3:
            if (r2 == r6) goto L105
            int r2 = r2 + 1
            r11 = r28
            r12 = r29
            r9 = r31
            goto L73
        Lff:
            r31 = r9
            r28 = r11
            r29 = r12
        L105:
            r11 = r10
        L106:
            r8.append(r3)
        L10b:
            java.lang.String r2 = r7.toString()
            java.lang.String r6 = "StringBuilder().apply(builderAction).toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r6)
            return r2
        L115:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Super calls with default arguments not supported in this target, function: joinToString"
            r1.<init>(r2)
            throw r1
    }

    public final boolean all(kotlin.jvm.functions.Function1<? super java.lang.Integer, java.lang.Boolean> r24) {
            r23 = this;
            r0 = r24
            java.lang.String r1 = "predicate"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            r1 = 0
            r2 = r23
            r3 = 0
            int[] r4 = r2.elements
            r5 = r2
            r6 = 0
            long[] r7 = r5.metadata
            int r8 = r7.length
            int r8 = r8 + (-2)
            r9 = 0
            if (r9 > r8) goto L83
        L1a:
            r11 = r7[r9]
            r13 = r11
            r15 = 0
            r17 = r11
            r16 = 1
            long r10 = ~r13
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r13
            r19 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r19
            int r10 = (r10 > r19 ? 1 : (r10 == r19 ? 0 : -1))
            if (r10 == 0) goto L7e
            int r10 = r9 - r8
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = 0
        L3b:
            if (r12 >= r10) goto L7a
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r17 & r13
            r15 = 0
            r19 = 128(0x80, double:6.3E-322)
            int r19 = (r13 > r19 ? 1 : (r13 == r19 ? 0 : -1))
            r20 = 0
            if (r19 >= 0) goto L4d
            r13 = r16
            goto L4f
        L4d:
            r13 = r20
        L4f:
            if (r13 == 0) goto L71
            int r13 = r9 << 3
            int r13 = r13 + r12
            r14 = r13
            r15 = 0
            r19 = r4[r14]
            r21 = 0
            r22 = r11
            java.lang.Integer r11 = java.lang.Integer.valueOf(r19)
            java.lang.Object r11 = r0.invoke(r11)
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 != 0) goto L6d
            return r20
        L6d:
            goto L73
        L71:
            r22 = r11
        L73:
            long r17 = r17 >> r22
            int r12 = r12 + 1
            r11 = r22
            goto L3b
        L7a:
            r22 = r11
            if (r10 != r11) goto L86
        L7e:
            if (r9 == r8) goto L85
            int r9 = r9 + 1
            goto L1a
        L83:
            r16 = 1
        L85:
        L86:
            return r16
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

    public final boolean any(kotlin.jvm.functions.Function1<? super java.lang.Integer, java.lang.Boolean> r24) {
            r23 = this;
            r0 = r24
            java.lang.String r1 = "predicate"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            r1 = 0
            r2 = r23
            r3 = 0
            int[] r4 = r2.elements
            r5 = r2
            r6 = 0
            long[] r7 = r5.metadata
            int r8 = r7.length
            int r8 = r8 + (-2)
            r9 = 0
            if (r9 > r8) goto L83
        L1a:
            r11 = r7[r9]
            r13 = r11
            r15 = 0
            r17 = r11
            r16 = 0
            long r10 = ~r13
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r13
            r19 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r19
            int r10 = (r10 > r19 ? 1 : (r10 == r19 ? 0 : -1))
            if (r10 == 0) goto L7e
            int r10 = r9 - r8
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = 0
        L3b:
            if (r12 >= r10) goto L7a
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r17 & r13
            r15 = 0
            r19 = 128(0x80, double:6.3E-322)
            int r19 = (r13 > r19 ? 1 : (r13 == r19 ? 0 : -1))
            r20 = 1
            if (r19 >= 0) goto L4d
            r13 = r20
            goto L4f
        L4d:
            r13 = r16
        L4f:
            if (r13 == 0) goto L71
            int r13 = r9 << 3
            int r13 = r13 + r12
            r14 = r13
            r15 = 0
            r19 = r4[r14]
            r21 = 0
            r22 = r11
            java.lang.Integer r11 = java.lang.Integer.valueOf(r19)
            java.lang.Object r11 = r0.invoke(r11)
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto L6d
            return r20
        L6d:
            goto L73
        L71:
            r22 = r11
        L73:
            long r17 = r17 >> r22
            int r12 = r12 + 1
            r11 = r22
            goto L3b
        L7a:
            r22 = r11
            if (r10 != r11) goto L86
        L7e:
            if (r9 == r8) goto L85
            int r9 = r9 + 1
            goto L1a
        L83:
            r16 = 0
        L85:
        L86:
            return r16
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
            int[] r8 = r0.elements
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

    public final int count() {
            r1 = this;
            int r0 = r1._size
            return r0
    }

    public final int count(kotlin.jvm.functions.Function1<? super java.lang.Integer, java.lang.Boolean> r23) {
            r22 = this;
            r0 = r23
            java.lang.String r1 = "predicate"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            r1 = 0
            r2 = 0
            r3 = r22
            r4 = 0
            int[] r5 = r3.elements
            r6 = r3
            r7 = 0
            long[] r8 = r6.metadata
            int r9 = r8.length
            int r9 = r9 + (-2)
            r10 = 0
            if (r10 > r9) goto L8d
        L1b:
            r11 = r8[r10]
            r13 = r11
            r15 = 0
            r16 = r1
            r17 = r2
            long r1 = ~r13
            r18 = 7
            long r1 = r1 << r18
            long r1 = r1 & r13
            r18 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r1 = r1 & r18
            int r1 = (r1 > r18 ? 1 : (r1 == r18 ? 0 : -1))
            if (r1 == 0) goto L84
            int r1 = r10 - r9
            int r1 = ~r1
            int r1 = r1 >>> 31
            r2 = 8
            int r1 = 8 - r1
            r13 = 0
        L3e:
            if (r13 >= r1) goto L7d
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r11
            r18 = 0
            r19 = 128(0x80, double:6.3E-322)
            int r19 = (r14 > r19 ? 1 : (r14 == r19 ? 0 : -1))
            if (r19 >= 0) goto L4e
            r19 = 1
            goto L50
        L4e:
            r19 = 0
        L50:
            if (r19 == 0) goto L74
            int r14 = r10 << 3
            int r14 = r14 + r13
            r15 = r14
            r18 = 0
            r19 = r5[r15]
            r20 = 0
            r21 = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r19)
            java.lang.Object r2 = r0.invoke(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L70
            int r17 = r17 + 1
        L70:
            goto L76
        L74:
            r21 = r2
        L76:
            long r11 = r11 >> r21
            int r13 = r13 + 1
            r2 = r21
            goto L3e
        L7d:
            r21 = r2
            if (r1 != r2) goto L91
            r2 = r17
            goto L86
        L84:
            r2 = r17
        L86:
            if (r10 == r9) goto L8f
            int r10 = r10 + 1
            r1 = r16
            goto L1b
        L8d:
            r16 = r1
        L8f:
            r17 = r2
        L91:
            return r17
    }

    public boolean equals(java.lang.Object r24) {
            r23 = this;
            r0 = r23
            r1 = r24
            r2 = 1
            if (r1 != r0) goto L8
            return r2
        L8:
            boolean r3 = r1 instanceof androidx.collection.IntSet
            r4 = 0
            if (r3 != 0) goto Le
            return r4
        Le:
            r3 = r1
            androidx.collection.IntSet r3 = (androidx.collection.IntSet) r3
            int r3 = r3._size
            int r5 = r0._size
            if (r3 == r5) goto L18
            return r4
        L18:
            r3 = r23
            r5 = 0
            int[] r6 = r3.elements
            r7 = r3
            r8 = 0
            long[] r9 = r7.metadata
            int r10 = r9.length
            int r10 = r10 + (-2)
            r11 = 0
            if (r11 > r10) goto L9e
        L29:
            r12 = r9[r11]
            r14 = r12
            r16 = 0
            r17 = r2
            r18 = r3
            long r2 = ~r14
            r19 = 7
            long r2 = r2 << r19
            long r2 = r2 & r14
            r19 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r2 = r2 & r19
            int r2 = (r2 > r19 ? 1 : (r2 == r19 ? 0 : -1))
            if (r2 == 0) goto L91
            int r2 = r11 - r10
            int r2 = ~r2
            int r2 = r2 >>> 31
            r3 = 8
            int r2 = 8 - r2
            r14 = 0
        L4d:
            if (r14 >= r2) goto L8a
            r15 = 255(0xff, double:1.26E-321)
            long r15 = r15 & r12
            r19 = 0
            r20 = 128(0x80, double:6.3E-322)
            int r20 = (r15 > r20 ? 1 : (r15 == r20 ? 0 : -1))
            if (r20 >= 0) goto L5d
            r15 = r17
            goto L5e
        L5d:
            r15 = r4
        L5e:
            if (r15 == 0) goto L7d
            int r15 = r11 << 3
            int r15 = r15 + r14
            r16 = r15
            r19 = 0
            r20 = r4
            r4 = r6[r16]
            r21 = 0
            r22 = r3
            r3 = r1
            androidx.collection.IntSet r3 = (androidx.collection.IntSet) r3
            boolean r3 = r3.contains(r4)
            if (r3 != 0) goto L79
            return r20
        L79:
            goto L81
        L7d:
            r22 = r3
            r20 = r4
        L81:
            long r12 = r12 >> r22
            int r14 = r14 + 1
            r4 = r20
            r3 = r22
            goto L4d
        L8a:
            r22 = r3
            r20 = r4
            if (r2 != r3) goto La3
            goto L93
        L91:
            r20 = r4
        L93:
            if (r11 == r10) goto La2
            int r11 = r11 + 1
            r2 = r17
            r3 = r18
            r4 = r20
            goto L29
        L9e:
            r17 = r2
            r18 = r3
        La2:
        La3:
            return r17
    }

    public final int findElementIndex$collection(int r23) {
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
            int[] r8 = r0.elements
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

    public final int first() {
            r19 = this;
            r0 = 0
            r1 = r19
            r2 = 0
            int[] r3 = r1.elements
            r4 = r1
            r5 = 0
            long[] r6 = r4.metadata
            int r7 = r6.length
            int r7 = r7 + (-2)
            r8 = 0
            if (r8 > r7) goto L5a
        L12:
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
            if (r11 == 0) goto L55
            int r11 = r8 - r7
            int r11 = ~r11
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r13 = 0
        L31:
            if (r13 >= r11) goto L53
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r9
            r16 = 0
            r17 = 128(0x80, double:6.3E-322)
            int r17 = (r14 > r17 ? 1 : (r14 == r17 ? 0 : -1))
            if (r17 >= 0) goto L41
            r17 = 1
            goto L43
        L41:
            r17 = 0
        L43:
            if (r17 == 0) goto L4f
            int r12 = r8 << 3
            int r12 = r12 + r13
            r14 = r12
            r15 = 0
            r16 = r3[r14]
            r17 = 0
            return r16
        L4f:
            long r9 = r9 >> r12
            int r13 = r13 + 1
            goto L31
        L53:
            if (r11 != r12) goto L5b
        L55:
            if (r8 == r7) goto L5a
            int r8 = r8 + 1
            goto L12
        L5a:
        L5b:
            java.util.NoSuchElementException r1 = new java.util.NoSuchElementException
            java.lang.String r2 = "The IntSet is empty"
            r1.<init>(r2)
            throw r1
    }

    public final int first(kotlin.jvm.functions.Function1<? super java.lang.Integer, java.lang.Boolean> r22) {
            r21 = this;
            r0 = r22
            java.lang.String r1 = "predicate"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            r1 = 0
            r2 = r21
            r3 = 0
            int[] r4 = r2.elements
            r5 = r2
            r6 = 0
            long[] r7 = r5.metadata
            int r8 = r7.length
            int r8 = r8 + (-2)
            r9 = 0
            if (r9 > r8) goto L85
        L1a:
            r10 = r7[r9]
            r12 = r10
            r14 = 0
            r15 = r1
            r16 = r2
            long r1 = ~r12
            r17 = 7
            long r1 = r1 << r17
            long r1 = r1 & r12
            r17 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r1 = r1 & r17
            int r1 = (r1 > r17 ? 1 : (r1 == r17 ? 0 : -1))
            if (r1 == 0) goto L7d
            int r1 = r9 - r8
            int r1 = ~r1
            int r1 = r1 >>> 31
            r2 = 8
            int r1 = 8 - r1
            r12 = 0
        L3c:
            if (r12 >= r1) goto L79
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r10
            r17 = 0
            r18 = 128(0x80, double:6.3E-322)
            int r18 = (r13 > r18 ? 1 : (r13 == r18 ? 0 : -1))
            if (r18 >= 0) goto L4c
            r18 = 1
            goto L4e
        L4c:
            r18 = 0
        L4e:
            if (r18 == 0) goto L70
            int r13 = r9 << 3
            int r13 = r13 + r12
            r14 = r13
            r17 = 0
            r18 = r4[r14]
            r19 = 0
            r20 = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r18)
            java.lang.Object r2 = r0.invoke(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L6d
            return r18
        L6d:
            goto L72
        L70:
            r20 = r2
        L72:
            long r10 = r10 >> r20
            int r12 = r12 + 1
            r2 = r20
            goto L3c
        L79:
            r20 = r2
            if (r1 != r2) goto L89
        L7d:
            if (r9 == r8) goto L88
            int r9 = r9 + 1
            r1 = r15
            r2 = r16
            goto L1a
        L85:
            r15 = r1
            r16 = r2
        L88:
        L89:
            java.util.NoSuchElementException r1 = new java.util.NoSuchElementException
            java.lang.String r2 = "Could not find a match"
            r1.<init>(r2)
            throw r1
    }

    public final void forEach(kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> r20) {
            r19 = this;
            r0 = r20
            java.lang.String r1 = "block"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            r1 = 0
            r2 = r19
            int[] r3 = r2.elements
            r4 = r19
            r5 = 0
            long[] r6 = r4.metadata
            int r7 = r6.length
            int r7 = r7 + (-2)
            r8 = 0
            if (r8 > r7) goto L71
        L19:
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
            if (r11 == 0) goto L6c
            int r11 = r8 - r7
            int r11 = ~r11
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r13 = 0
        L38:
            if (r13 >= r11) goto L68
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r9
            r16 = 0
            r17 = 128(0x80, double:6.3E-322)
            int r17 = (r14 > r17 ? 1 : (r14 == r17 ? 0 : -1))
            if (r17 >= 0) goto L48
            r17 = 1
            goto L4a
        L48:
            r17 = 0
        L4a:
            if (r17 == 0) goto L5f
            int r14 = r8 << 3
            int r14 = r14 + r13
            r15 = r14
            r16 = 0
            r17 = r3[r15]
            r18 = r12
            java.lang.Integer r12 = java.lang.Integer.valueOf(r17)
            r0.invoke(r12)
            goto L61
        L5f:
            r18 = r12
        L61:
            long r9 = r9 >> r18
            int r13 = r13 + 1
            r12 = r18
            goto L38
        L68:
            r18 = r12
            if (r11 != r12) goto L72
        L6c:
            if (r8 == r7) goto L71
            int r8 = r8 + 1
            goto L19
        L71:
        L72:
            return
    }

    public final void forEachIndex(kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> r15) {
            r14 = this;
            java.lang.String r0 = "block"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
            r0 = 0
            long[] r1 = r14.metadata
            int r2 = r1.length
            int r2 = r2 + (-2)
            r3 = 0
            if (r3 > r2) goto L53
        Lf:
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
            if (r6 == 0) goto L4e
            int r6 = r3 - r2
            int r6 = ~r6
            int r6 = r6 >>> 31
            r7 = 8
            int r6 = 8 - r6
            r8 = 0
        L2c:
            if (r8 >= r6) goto L4b
            r9 = 255(0xff, double:1.26E-321)
            long r9 = r9 & r4
            r11 = 0
            r12 = 128(0x80, double:6.3E-322)
            int r12 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r12 >= 0) goto L3a
            r12 = 1
            goto L3b
        L3a:
            r12 = 0
        L3b:
            if (r12 == 0) goto L47
            int r9 = r3 << 3
            int r9 = r9 + r8
            java.lang.Integer r10 = java.lang.Integer.valueOf(r9)
            r15.invoke(r10)
        L47:
            long r4 = r4 >> r7
            int r8 = r8 + 1
            goto L2c
        L4b:
            if (r6 == r7) goto L4e
            return
        L4e:
            if (r3 == r2) goto L53
            int r3 = r3 + 1
            goto Lf
        L53:
            return
    }

    public final int getCapacity() {
            r1 = this;
            int r0 = r1._capacity
            return r0
    }

    public final int getSize() {
            r1 = this;
            int r0 = r1._size
            return r0
    }

    public int hashCode() {
            r20 = this;
            r0 = 0
            r1 = r20
            r2 = 0
            int[] r3 = r1.elements
            r4 = r1
            r5 = 0
            long[] r6 = r4.metadata
            int r7 = r6.length
            int r7 = r7 + (-2)
            r8 = 0
            if (r8 > r7) goto L64
        L12:
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
            if (r11 == 0) goto L5f
            int r11 = r8 - r7
            int r11 = ~r11
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r13 = 0
        L31:
            if (r13 >= r11) goto L5d
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r9
            r16 = 0
            r17 = 128(0x80, double:6.3E-322)
            int r17 = (r14 > r17 ? 1 : (r14 == r17 ? 0 : -1))
            if (r17 >= 0) goto L41
            r17 = 1
            goto L43
        L41:
            r17 = 0
        L43:
            if (r17 == 0) goto L59
            int r14 = r8 << 3
            int r14 = r14 + r13
            r15 = r14
            r16 = 0
            r17 = r3[r15]
            r18 = 0
            int r19 = java.lang.Integer.hashCode(r17)
            int r0 = r0 + r19
        L59:
            long r9 = r9 >> r12
            int r13 = r13 + 1
            goto L31
        L5d:
            if (r11 != r12) goto L65
        L5f:
            if (r8 == r7) goto L64
            int r8 = r8 + 1
            goto L12
        L64:
        L65:
            return r0
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

    public final java.lang.String joinToString(java.lang.CharSequence r27, java.lang.CharSequence r28, java.lang.CharSequence r29, int r30, java.lang.CharSequence r31) {
            r26 = this;
            r0 = r27
            r1 = r28
            r2 = r29
            r3 = r31
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
            r8 = r26
            r9 = 0
            int[] r10 = r8.elements
            r11 = r8
            r12 = 0
            long[] r13 = r11.metadata
            int r14 = r13.length
            int r14 = r14 + (-2)
            r15 = 0
            if (r15 > r14) goto Lc6
        L38:
            r16 = r13[r15]
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
            if (r6 == 0) goto Lb4
            int r6 = r15 - r14
            int r6 = ~r6
            int r6 = r6 >>> 31
            r7 = 8
            int r6 = 8 - r6
            r8 = 0
            r9 = r8
            r8 = r22
        L66:
            if (r9 >= r6) goto Lac
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
            if (r24 == 0) goto L9f
            int r20 = r15 << 3
            int r20 = r20 + r9
            r22 = r20
            r23 = 0
            r24 = r7
            r7 = r10[r22]
            r25 = 0
            r1 = r30
            if (r8 != r1) goto L91
            r5.append(r3)
            goto Ld4
        L91:
            if (r8 == 0) goto L96
            r5.append(r0)
        L96:
            r5.append(r7)
            int r8 = r8 + 1
            goto La3
        L9f:
            r1 = r30
            r24 = r7
        La3:
            long r16 = r16 >> r24
            int r9 = r9 + 1
            r1 = r28
            r7 = r24
            goto L66
        Lac:
            r1 = r30
            r24 = r7
            if (r6 != r7) goto Lcf
            r7 = r8
            goto Lb8
        Lb4:
            r1 = r30
            r7 = r22
        Lb8:
            if (r15 == r14) goto Lce
            int r15 = r15 + 1
            r1 = r28
            r8 = r18
            r9 = r19
            r6 = r21
            goto L38
        Lc6:
            r1 = r30
            r21 = r6
            r18 = r8
            r19 = r9
        Lce:
            r8 = r7
        Lcf:
            r5.append(r2)
        Ld4:
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = "StringBuilder().apply(builderAction).toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r5)
            return r4
    }

    public final java.lang.String joinToString(java.lang.CharSequence r29, java.lang.CharSequence r30, java.lang.CharSequence r31, int r32, java.lang.CharSequence r33, kotlin.jvm.functions.Function1<? super java.lang.Integer, ? extends java.lang.CharSequence> r34) {
            r28 = this;
            r0 = r29
            r1 = r30
            r2 = r31
            r3 = r33
            r4 = r34
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
            r10 = r28
            r11 = 0
            int[] r12 = r10.elements
            r13 = r10
            r14 = 0
            long[] r15 = r13.metadata
            int r1 = r15.length
            int r1 = r1 + (-2)
            r16 = r5
            r5 = 0
            if (r5 > r1) goto Ldc
        L42:
            r17 = r15[r5]
            r19 = r17
            r21 = 0
            r22 = r8
            r23 = r9
            r8 = r19
            r19 = r10
            r20 = r11
            long r10 = ~r8
            r24 = 7
            long r10 = r10 << r24
            long r10 = r10 & r8
            r24 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r10 & r24
            int r8 = (r8 > r24 ? 1 : (r8 == r24 ? 0 : -1))
            if (r8 == 0) goto Lc9
            int r8 = r5 - r1
            int r8 = ~r8
            int r8 = r8 >>> 31
            r9 = 8
            int r8 = 8 - r8
            r10 = 0
            r11 = r10
            r10 = r23
        L70:
            if (r11 >= r8) goto Lc0
            r23 = 255(0xff, double:1.26E-321)
            long r23 = r17 & r23
            r21 = 0
            r25 = 128(0x80, double:6.3E-322)
            int r25 = (r23 > r25 ? 1 : (r23 == r25 ? 0 : -1))
            if (r25 >= 0) goto L81
            r25 = 1
            goto L83
        L81:
            r25 = 0
        L83:
            if (r25 == 0) goto Lb3
            int r21 = r5 << 3
            int r21 = r21 + r11
            r23 = r21
            r24 = 0
            r25 = r12[r23]
            r26 = 0
            r27 = r9
            r9 = r32
            if (r10 != r9) goto L9b
            r7.append(r3)
            goto Lec
        L9b:
            if (r10 == 0) goto La0
            r7.append(r0)
        La0:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r25)
            java.lang.Object r0 = r4.invoke(r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r7.append(r0)
            int r10 = r10 + 1
            goto Lb7
        Lb3:
            r27 = r9
            r9 = r32
        Lb7:
            long r17 = r17 >> r27
            int r11 = r11 + 1
            r0 = r29
            r9 = r27
            goto L70
        Lc0:
            r27 = r9
            r9 = r32
            r0 = r27
            if (r8 != r0) goto Le7
            goto Lcd
        Lc9:
            r9 = r32
            r10 = r23
        Lcd:
            if (r5 == r1) goto Le6
            int r5 = r5 + 1
            r0 = r29
            r9 = r10
            r10 = r19
            r11 = r20
            r8 = r22
            goto L42
        Ldc:
            r22 = r8
            r0 = r9
            r19 = r10
            r20 = r11
            r9 = r32
            r10 = r0
        Le6:
        Le7:
            r7.append(r2)
        Lec:
            java.lang.String r0 = r6.toString()
            java.lang.String r1 = "StringBuilder().apply(builderAction).toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    public final java.lang.String joinToString(java.lang.CharSequence r30, java.lang.CharSequence r31, java.lang.CharSequence r32, int r33, kotlin.jvm.functions.Function1<? super java.lang.Integer, ? extends java.lang.CharSequence> r34) {
            r29 = this;
            r0 = r30
            r1 = r31
            r2 = r32
            r3 = r34
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
            r11 = r29
            r12 = 0
            int[] r13 = r11.elements
            r14 = r11
            r15 = 0
            long[] r1 = r14.metadata
            r16 = r4
            int r4 = r1.length
            int r4 = r4 + (-2)
            r17 = r1
            r1 = 0
            if (r1 > r4) goto Ldb
        L43:
            r18 = r17[r1]
            r20 = r18
            r22 = 0
            r23 = r6
            r24 = r7
            r6 = r20
            r20 = r9
            r21 = r10
            long r9 = ~r6
            r25 = 7
            long r9 = r9 << r25
            long r9 = r9 & r6
            r25 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r9 & r25
            int r6 = (r6 > r25 ? 1 : (r6 == r25 ? 0 : -1))
            if (r6 == 0) goto Lc9
            int r6 = r1 - r4
            int r6 = ~r6
            int r6 = r6 >>> 31
            r7 = 8
            int r6 = 8 - r6
            r9 = 0
            r10 = r21
        L70:
            if (r9 >= r6) goto Lc0
            r21 = 255(0xff, double:1.26E-321)
            long r21 = r18 & r21
            r25 = 0
            r26 = 128(0x80, double:6.3E-322)
            int r26 = (r21 > r26 ? 1 : (r21 == r26 ? 0 : -1))
            if (r26 >= 0) goto L81
            r26 = 1
            goto L83
        L81:
            r26 = 0
        L83:
            if (r26 == 0) goto Lb3
            int r21 = r1 << 3
            int r21 = r21 + r9
            r22 = r21
            r25 = 0
            r26 = r13[r22]
            r27 = 0
            r28 = r7
            r7 = r33
            if (r10 != r7) goto L9b
            r8.append(r5)
            goto Le9
        L9b:
            if (r10 == 0) goto La0
            r8.append(r0)
        La0:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r26)
            java.lang.Object r0 = r3.invoke(r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r8.append(r0)
            int r10 = r10 + 1
            goto Lb7
        Lb3:
            r28 = r7
            r7 = r33
        Lb7:
            long r18 = r18 >> r28
            int r9 = r9 + 1
            r0 = r30
            r7 = r28
            goto L70
        Lc0:
            r28 = r7
            r7 = r33
            r0 = r28
            if (r6 != r0) goto Le4
            goto Lcd
        Lc9:
            r7 = r33
            r10 = r21
        Lcd:
            if (r1 == r4) goto Le3
            int r1 = r1 + 1
            r0 = r30
            r9 = r20
            r6 = r23
            r7 = r24
            goto L43
        Ldb:
            r23 = r6
            r24 = r7
            r20 = r9
            r7 = r33
        Le3:
        Le4:
            r8.append(r2)
        Le9:
            java.lang.String r0 = r24.toString()
            java.lang.String r1 = "StringBuilder().apply(builderAction).toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    public final java.lang.String joinToString(java.lang.CharSequence r31, java.lang.CharSequence r32, java.lang.CharSequence r33, kotlin.jvm.functions.Function1<? super java.lang.Integer, ? extends java.lang.CharSequence> r34) {
            r30 = this;
            r0 = r31
            r1 = r32
            r2 = r33
            r3 = r34
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
            r12 = r30
            r13 = 0
            int[] r14 = r12.elements
            r15 = r12
            r16 = 0
            long[] r1 = r15.metadata
            r17 = r4
            int r4 = r1.length
            int r4 = r4 + (-2)
            r18 = r1
            r1 = 0
            if (r1 > r4) goto Ld0
        L46:
            r19 = r18[r1]
            r21 = r19
            r23 = 0
            r24 = r7
            r25 = r8
            r7 = r21
            r21 = r10
            r22 = r11
            long r10 = ~r7
            r26 = 7
            long r10 = r10 << r26
            long r10 = r10 & r7
            r26 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r10 & r26
            int r7 = (r7 > r26 ? 1 : (r7 == r26 ? 0 : -1))
            if (r7 == 0) goto Lc2
            int r7 = r1 - r4
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r10 = 0
            r11 = r22
        L73:
            if (r10 >= r7) goto Lbd
            r22 = 255(0xff, double:1.26E-321)
            long r22 = r19 & r22
            r26 = 0
            r27 = 128(0x80, double:6.3E-322)
            int r27 = (r22 > r27 ? 1 : (r22 == r27 ? 0 : -1))
            if (r27 >= 0) goto L84
            r27 = 1
            goto L86
        L84:
            r27 = 0
        L86:
            if (r27 == 0) goto Lb4
            int r22 = r1 << 3
            int r22 = r22 + r10
            r23 = r22
            r26 = 0
            r27 = r14[r23]
            r28 = 0
            if (r11 != r5) goto L9a
            r9.append(r6)
            goto Ldc
        L9a:
            if (r11 == 0) goto L9f
            r9.append(r0)
        L9f:
            r29 = r8
            java.lang.Integer r8 = java.lang.Integer.valueOf(r27)
            java.lang.Object r8 = r3.invoke(r8)
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            r9.append(r8)
            int r11 = r11 + 1
            goto Lb6
        Lb4:
            r29 = r8
        Lb6:
            long r19 = r19 >> r29
            int r10 = r10 + 1
            r8 = r29
            goto L73
        Lbd:
            r29 = r8
            if (r7 != r8) goto Ld7
            goto Lc4
        Lc2:
            r11 = r22
        Lc4:
            if (r1 == r4) goto Ld6
            int r1 = r1 + 1
            r10 = r21
            r7 = r24
            r8 = r25
            goto L46
        Ld0:
            r24 = r7
            r25 = r8
            r21 = r10
        Ld6:
        Ld7:
            r9.append(r2)
        Ldc:
            java.lang.String r1 = r25.toString()
            java.lang.String r4 = "StringBuilder().apply(builderAction).toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r4)
            return r1
    }

    public final java.lang.String joinToString(java.lang.CharSequence r31, java.lang.CharSequence r32, kotlin.jvm.functions.Function1<? super java.lang.Integer, ? extends java.lang.CharSequence> r33) {
            r30 = this;
            r0 = r31
            r1 = r32
            r2 = r33
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
            r12 = r30
            r13 = 0
            int[] r14 = r12.elements
            r15 = r12
            r16 = 0
            long[] r1 = r15.metadata
            r17 = r3
            int r3 = r1.length
            int r3 = r3 + (-2)
            r18 = r1
            r1 = 0
            if (r1 > r3) goto Lce
        L44:
            r19 = r18[r1]
            r21 = r19
            r23 = 0
            r24 = r7
            r25 = r8
            r7 = r21
            r21 = r10
            r22 = r11
            long r10 = ~r7
            r26 = 7
            long r10 = r10 << r26
            long r10 = r10 & r7
            r26 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r10 & r26
            int r7 = (r7 > r26 ? 1 : (r7 == r26 ? 0 : -1))
            if (r7 == 0) goto Lc0
            int r7 = r1 - r3
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r10 = 0
            r11 = r22
        L71:
            if (r10 >= r7) goto Lbb
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
            if (r27 == 0) goto Lb2
            int r22 = r1 << 3
            int r22 = r22 + r10
            r23 = r22
            r26 = 0
            r27 = r14[r23]
            r28 = 0
            if (r11 != r5) goto L98
            r9.append(r6)
            goto Lda
        L98:
            if (r11 == 0) goto L9d
            r9.append(r0)
        L9d:
            r29 = r8
            java.lang.Integer r8 = java.lang.Integer.valueOf(r27)
            java.lang.Object r8 = r2.invoke(r8)
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            r9.append(r8)
            int r11 = r11 + 1
            goto Lb4
        Lb2:
            r29 = r8
        Lb4:
            long r19 = r19 >> r29
            int r10 = r10 + 1
            r8 = r29
            goto L71
        Lbb:
            r29 = r8
            if (r7 != r8) goto Ld5
            goto Lc2
        Lc0:
            r11 = r22
        Lc2:
            if (r1 == r3) goto Ld4
            int r1 = r1 + 1
            r10 = r21
            r7 = r24
            r8 = r25
            goto L44
        Lce:
            r24 = r7
            r25 = r8
            r21 = r10
        Ld4:
        Ld5:
            r9.append(r4)
        Lda:
            java.lang.String r1 = r25.toString()
            java.lang.String r3 = "StringBuilder().apply(builderAction).toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r3)
            return r1
    }

    public final java.lang.String joinToString(java.lang.CharSequence r32, kotlin.jvm.functions.Function1<? super java.lang.Integer, ? extends java.lang.CharSequence> r33) {
            r31 = this;
            r0 = r32
            r1 = r33
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
            r12 = r31
            r13 = 0
            int[] r14 = r12.elements
            r15 = r12
            r16 = 0
            r17 = r2
            long[] r2 = r15.metadata
            r18 = r4
            int r4 = r2.length
            int r4 = r4 + (-2)
            r19 = r2
            r2 = 0
            if (r2 > r4) goto Lcd
        L43:
            r20 = r19[r2]
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
            if (r7 == 0) goto Lbf
            int r7 = r2 - r4
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r10 = 0
            r11 = r23
        L70:
            if (r10 >= r7) goto Lba
            r23 = 255(0xff, double:1.26E-321)
            long r23 = r20 & r23
            r27 = 0
            r28 = 128(0x80, double:6.3E-322)
            int r28 = (r23 > r28 ? 1 : (r23 == r28 ? 0 : -1))
            if (r28 >= 0) goto L81
            r28 = 1
            goto L83
        L81:
            r28 = 0
        L83:
            if (r28 == 0) goto Lb1
            int r23 = r2 << 3
            int r23 = r23 + r10
            r24 = r23
            r27 = 0
            r28 = r14[r24]
            r29 = 0
            if (r11 != r5) goto L97
            r9.append(r6)
            goto Ld9
        L97:
            if (r11 == 0) goto L9c
            r9.append(r0)
        L9c:
            r30 = r8
            java.lang.Integer r8 = java.lang.Integer.valueOf(r28)
            java.lang.Object r8 = r1.invoke(r8)
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            r9.append(r8)
            int r11 = r11 + 1
            goto Lb3
        Lb1:
            r30 = r8
        Lb3:
            long r20 = r20 >> r30
            int r10 = r10 + 1
            r8 = r30
            goto L70
        Lba:
            r30 = r8
            if (r7 != r8) goto Ld4
            goto Lc1
        Lbf:
            r11 = r23
        Lc1:
            if (r2 == r4) goto Ld3
            int r2 = r2 + 1
            r10 = r22
            r7 = r25
            r8 = r26
            goto L43
        Lcd:
            r25 = r7
            r26 = r8
            r22 = r10
        Ld3:
        Ld4:
            r9.append(r3)
        Ld9:
            java.lang.String r2 = r26.toString()
            java.lang.String r4 = "StringBuilder().apply(builderAction).toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r4)
            return r2
    }

    public final java.lang.String joinToString(kotlin.jvm.functions.Function1<? super java.lang.Integer, ? extends java.lang.CharSequence> r32) {
            r31 = this;
            r0 = r32
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
            r12 = r31
            r13 = 0
            int[] r14 = r12.elements
            r15 = r12
            r16 = 0
            r17 = r1
            long[] r1 = r15.metadata
            r18 = r4
            int r4 = r1.length
            int r4 = r4 + (-2)
            r19 = r1
            r1 = 0
            if (r1 > r4) goto Lcb
        L41:
            r20 = r19[r1]
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
            if (r7 == 0) goto Lbd
            int r7 = r1 - r4
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r10 = 0
            r11 = r23
        L6e:
            if (r10 >= r7) goto Lb8
            r23 = 255(0xff, double:1.26E-321)
            long r23 = r20 & r23
            r27 = 0
            r28 = 128(0x80, double:6.3E-322)
            int r28 = (r23 > r28 ? 1 : (r23 == r28 ? 0 : -1))
            if (r28 >= 0) goto L7f
            r28 = 1
            goto L81
        L7f:
            r28 = 0
        L81:
            if (r28 == 0) goto Laf
            int r23 = r1 << 3
            int r23 = r23 + r10
            r24 = r23
            r27 = 0
            r28 = r14[r24]
            r29 = 0
            if (r11 != r5) goto L95
            r9.append(r6)
            goto Ld7
        L95:
            if (r11 == 0) goto L9a
            r9.append(r2)
        L9a:
            r30 = r8
            java.lang.Integer r8 = java.lang.Integer.valueOf(r28)
            java.lang.Object r8 = r0.invoke(r8)
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            r9.append(r8)
            int r11 = r11 + 1
            goto Lb1
        Laf:
            r30 = r8
        Lb1:
            long r20 = r20 >> r30
            int r10 = r10 + 1
            r8 = r30
            goto L6e
        Lb8:
            r30 = r8
            if (r7 != r8) goto Ld2
            goto Lbf
        Lbd:
            r11 = r23
        Lbf:
            if (r1 == r4) goto Ld1
            int r1 = r1 + 1
            r10 = r22
            r7 = r25
            r8 = r26
            goto L41
        Lcb:
            r25 = r7
            r26 = r8
            r22 = r10
        Ld1:
        Ld2:
            r9.append(r3)
        Ld7:
            java.lang.String r1 = r26.toString()
            java.lang.String r4 = "StringBuilder().apply(builderAction).toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r4)
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
            r9 = this;
            java.lang.String r0 = "["
            r3 = r0
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            java.lang.String r0 = "]"
            r4 = r0
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            r7 = 25
            r8 = 0
            r2 = 0
            r5 = 0
            r6 = 0
            r1 = r9
            java.lang.String r0 = joinToString$default(r1, r2, r3, r4, r5, r6, r7, r8)
            return r0
    }
}
