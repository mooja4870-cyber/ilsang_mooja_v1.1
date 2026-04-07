package androidx.collection;

/* JADX INFO: compiled from: ObjectFloatMap.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u000f\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u0007\u001a\u00020\bH\u0002J\u0006\u0010\t\u001a\u00020\bJ\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004H\u0002J\u0015\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010\u000eJ'\u0010\u000f\u001a\u00020\u00102\u0006\u0010\r\u001a\u00028\u00002\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0012H\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\u0013J\b\u0010\u0014\u001a\u00020\bH\u0002J\u0010\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0004H\u0002J\u0010\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0004H\u0002J\u0016\u0010\u0018\u001a\u00020\b2\u0006\u0010\r\u001a\u00028\u0000H\u0086\n¢\u0006\u0002\u0010\u0019J\u0017\u0010\u0018\u001a\u00020\b2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u001bH\u0086\nJ\u001e\u0010\u0018\u001a\u00020\b2\u000e\u0010\u001a\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u001cH\u0086\n¢\u0006\u0002\u0010\u001dJ\u0017\u0010\u0018\u001a\u00020\b2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u001eH\u0086\nJ\u0017\u0010\u0018\u001a\u00020\b2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u001fH\u0086\nJ\u0017\u0010 \u001a\u00020\b2\f\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086\nJ\u001b\u0010\"\u001a\u00020\b2\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010#\u001a\u00020\u0010¢\u0006\u0002\u0010$J#\u0010\"\u001a\u00020\u00102\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010#\u001a\u00020\u00102\u0006\u0010%\u001a\u00020\u0010¢\u0006\u0002\u0010&J\u0014\u0010'\u001a\u00020\b2\f\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002J\u0013\u0010(\u001a\u00020\b2\u0006\u0010\r\u001a\u00028\u0000¢\u0006\u0002\u0010\u0019J\u001b\u0010(\u001a\u00020)2\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010#\u001a\u00020\u0010¢\u0006\u0002\u0010*J\b\u0010+\u001a\u00020\bH\u0002J&\u0010,\u001a\u00020\b2\u0018\u0010-\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020)0.H\u0086\bø\u0001\u0000J\u0010\u0010/\u001a\u00020\b2\u0006\u00100\u001a\u00020\u0004H\u0001J\u0010\u00101\u001a\u00020\b2\u0006\u00102\u001a\u00020\u0004H\u0002J\u001e\u00103\u001a\u00020\b2\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010#\u001a\u00020\u0010H\u0086\u0002¢\u0006\u0002\u0010$J\u0006\u00104\u001a\u00020\u0004J\u0019\u00105\u001a\u00020\b2\u0006\u00100\u001a\u00020\u00042\u0006\u0010#\u001a\u000206H\u0082\bR\u000e\u0010\u0006\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u00067"}, d2 = {"Landroidx/collection/MutableObjectFloatMap;", "K", "Landroidx/collection/ObjectFloatMap;", "initialCapacity", "", "(I)V", "growthLimit", "adjustStorage", "", "clear", "findFirstAvailableSlot", "hash1", "findIndex", "key", "(Ljava/lang/Object;)I", "getOrPut", "", "defaultValue", "Lkotlin/Function0;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)F", "initializeGrowth", "initializeMetadata", "capacity", "initializeStorage", "minusAssign", "(Ljava/lang/Object;)V", "keys", "Landroidx/collection/ScatterSet;", "", "([Ljava/lang/Object;)V", "", "Lkotlin/sequences/Sequence;", "plusAssign", "from", "put", "value", "(Ljava/lang/Object;F)V", "default", "(Ljava/lang/Object;FF)F", "putAll", "remove", "", "(Ljava/lang/Object;F)Z", "removeDeletedMarkers", "removeIf", "predicate", "Lkotlin/Function2;", "removeValueAt", "index", "resizeStorage", "newCapacity", "set", "trim", "writeMetadata", "", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class MutableObjectFloatMap<K> extends androidx.collection.ObjectFloatMap<K> {
    private int growthLimit;

    public MutableObjectFloatMap() {
            r3 = this;
            r0 = 1
            r1 = 0
            r2 = 0
            r3.<init>(r2, r0, r1)
            return
    }

    public MutableObjectFloatMap(int r3) {
            r2 = this;
            r0 = 0
            r2.<init>(r0)
            if (r3 < 0) goto L9
            r0 = 1
            goto La
        L9:
            r0 = 0
        La:
            if (r0 == 0) goto L15
            int r0 = androidx.collection.ScatterMapKt.unloadedCapacity(r3)
            r2.initializeStorage(r0)
            return
        L15:
            r0 = 0
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Capacity must be a positive value."
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public /* synthetic */ MutableObjectFloatMap(int r1, int r2, kotlin.jvm.internal.DefaultConstructorMarker r3) {
            r0 = this;
            r2 = r2 & 1
            if (r2 == 0) goto L5
            r1 = 6
        L5:
            r0.<init>(r1)
            return
    }

    private final void adjustStorage() {
            r6 = this;
            int r0 = r6._capacity
            r1 = 8
            if (r0 <= r1) goto L2c
            int r0 = r6._size
            long r0 = (long) r0
            long r0 = kotlin.ULong.m327constructorimpl(r0)
            r2 = 32
            long r0 = r0 * r2
            long r0 = kotlin.ULong.m327constructorimpl(r0)
            int r2 = r6._capacity
            long r2 = (long) r2
            long r2 = kotlin.ULong.m327constructorimpl(r2)
            r4 = 25
            long r2 = r2 * r4
            long r2 = kotlin.ULong.m327constructorimpl(r2)
            int r0 = androidx.collection.MutableFloatFloatMap$$ExternalSyntheticBackport0.m(r0, r2)
            if (r0 > 0) goto L2c
            r6.removeDeletedMarkers()
            goto L35
        L2c:
            int r0 = r6._capacity
            int r0 = androidx.collection.ScatterMapKt.nextCapacity(r0)
            r6.resizeStorage(r0)
        L35:
            return
    }

    private final int findFirstAvailableSlot(int r15) {
            r14 = this;
            int r0 = r14._capacity
            r1 = r15 & r0
            r2 = 0
        L5:
            long[] r3 = r14.metadata
            r4 = 0
            int r5 = r1 >> 3
            r6 = r1 & 7
            int r6 = r6 << 3
            r7 = r3[r5]
            long r7 = r7 >>> r6
            int r9 = r5 + 1
            r9 = r3[r9]
            int r11 = 64 - r6
            long r9 = r9 << r11
            long r11 = (long) r6
            long r11 = -r11
            r13 = 63
            long r11 = r11 >> r13
            long r9 = r9 & r11
            long r3 = r7 | r9
            r5 = r3
            r7 = 0
            long r8 = ~r5
            r10 = 7
            long r8 = r8 << r10
            long r8 = r8 & r5
            r10 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r5 = r8 & r10
            r7 = 0
            int r7 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r7 == 0) goto L41
            r7 = r5
            r9 = 0
            int r10 = java.lang.Long.numberOfTrailingZeros(r7)
            int r7 = r10 >> 3
            int r7 = r7 + r1
            r7 = r7 & r0
            return r7
        L41:
            int r2 = r2 + 8
            int r7 = r1 + r2
            r1 = r7 & r0
            goto L5
    }

    private final int findIndex(K r25) {
            r24 = this;
            r0 = r24
            r1 = r25
            r2 = 0
            if (r1 == 0) goto Lc
            int r4 = r1.hashCode()
            goto Ld
        Lc:
            r4 = 0
        Ld:
            r5 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r4 = r4 * r5
            int r5 = r4 << 16
            r2 = r4 ^ r5
            r4 = 0
            int r4 = r2 >>> 7
            r5 = 0
            r5 = r2 & 127(0x7f, float:1.78E-43)
            int r6 = r0._capacity
            r7 = r4 & r6
            r8 = 0
        L23:
            long[] r9 = r0.metadata
            r10 = 0
            int r11 = r7 >> 3
            r12 = r7 & 7
            int r12 = r12 << 3
            r13 = r9[r11]
            long r13 = r13 >>> r12
            int r15 = r11 + 1
            r15 = r9[r15]
            int r17 = 64 - r12
            long r15 = r15 << r17
            r18 = r4
            long r3 = (long) r12
            long r3 = -r3
            r19 = 63
            long r3 = r3 >> r19
            long r3 = r3 & r15
            long r3 = r3 | r13
            r9 = r3
            r11 = 0
            long r12 = (long) r5
            r14 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r12 = r12 * r14
            long r12 = r12 ^ r9
            long r14 = r12 - r14
            r16 = r2
            r19 = r3
            long r2 = ~r12
            long r2 = r2 & r14
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r2 = r2 & r14
        L5c:
            r9 = r2
            r4 = 0
            r11 = 0
            int r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            r21 = 1
            if (r13 == 0) goto L69
            r4 = r21
            goto L6a
        L69:
            r4 = 0
        L6a:
            if (r4 == 0) goto L8e
            r9 = r2
            r4 = 0
            r11 = r9
            r13 = 0
            int r21 = java.lang.Long.numberOfTrailingZeros(r11)
            int r11 = r21 >> 3
            int r11 = r11 + r7
            r4 = r11 & r6
            java.lang.Object[] r9 = r0.keys
            r9 = r9[r4]
            boolean r9 = kotlin.jvm.internal.Intrinsics.areEqual(r9, r1)
            if (r9 == 0) goto L85
            return r4
        L85:
            r9 = r2
            r11 = 0
            r12 = 1
            long r12 = r9 - r12
            long r9 = r9 & r12
            r2 = r9
            goto L5c
        L8e:
            r9 = r19
            r4 = 0
            r22 = r11
            long r11 = ~r9
            r13 = 6
            long r11 = r11 << r13
            long r11 = r11 & r9
            long r9 = r11 & r14
            int r4 = (r9 > r22 ? 1 : (r9 == r22 ? 0 : -1))
            if (r4 == 0) goto L130
        L9e:
            r4 = r18
            int r2 = r0.findFirstAvailableSlot(r4)
            int r3 = r0.growthLimit
            r9 = 255(0xff, double:1.26E-321)
            if (r3 != 0) goto Lcc
            long[] r3 = r0.metadata
            r11 = 0
            r12 = 0
            int r13 = r2 >> 3
            r13 = r3[r13]
            r15 = r2 & 7
            int r15 = r15 << 3
            long r13 = r13 >> r15
            long r12 = r13 & r9
            r14 = 254(0xfe, double:1.255E-321)
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 != 0) goto Lc2
            r3 = r21
            goto Lc3
        Lc2:
            r3 = 0
        Lc3:
            if (r3 != 0) goto Lcc
            r0.adjustStorage()
            int r2 = r0.findFirstAvailableSlot(r4)
        Lcc:
            int r3 = r0._size
            int r3 = r3 + 1
            r0._size = r3
            int r3 = r0.growthLimit
            long[] r11 = r0.metadata
            r12 = 0
            r13 = 0
            int r14 = r2 >> 3
            r14 = r11[r14]
            r18 = r2 & 7
            int r18 = r18 << 3
            long r14 = r14 >> r18
            long r13 = r14 & r9
            r18 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r18 ? 1 : (r13 == r18 ? 0 : -1))
            if (r13 != 0) goto Led
            r17 = r21
            goto Lef
        Led:
            r17 = 0
        Lef:
            int r3 = r3 - r17
            r0.growthLimit = r3
            long r11 = (long) r5
            r3 = r24
            r13 = 0
            long[] r14 = r3.metadata
            r15 = 0
            int r17 = r2 >> 3
            r18 = r2 & 7
            int r18 = r18 << 3
            r19 = r14[r17]
            r21 = r9
            long r9 = r21 << r18
            long r9 = ~r9
            long r9 = r19 & r9
            long r19 = r11 << r18
            long r9 = r9 | r19
            r14[r17] = r9
            int r9 = r3._capacity
            int r10 = r2 + (-7)
            r10 = r10 & r9
            r15 = r9 & 7
            int r10 = r10 + r15
            r15 = 0
            int r17 = r10 >> 3
            r18 = r10 & 7
            int r18 = r18 << 3
            r19 = r14[r17]
            long r0 = r21 << r18
            long r0 = ~r0
            long r0 = r19 & r0
            long r19 = r11 << r18
            long r0 = r0 | r19
            r14[r17] = r0
            int r0 = ~r2
            return r0
        L130:
            r4 = r18
            int r8 = r8 + 8
            int r0 = r7 + r8
            r7 = r0 & r6
            r0 = r24
            r1 = r25
            r2 = r16
            goto L23
    }

    private final void initializeGrowth() {
            r2 = this;
            int r0 = r2.getCapacity()
            int r0 = androidx.collection.ScatterMapKt.loadedCapacity(r0)
            int r1 = r2._size
            int r0 = r0 - r1
            r2.growthLimit = r0
            return
    }

    private final void initializeMetadata(int r11) {
            r10 = this;
            if (r11 != 0) goto L5
            long[] r0 = androidx.collection.ScatterMapKt.EmptyGroup
            goto L21
        L5:
            int r0 = r11 + 1
            int r0 = r0 + 7
            int r0 = r0 + 7
            r0 = r0 & (-8)
            int r0 = r0 >> 3
            long[] r1 = new long[r0]
            r2 = r1
            r9 = 0
            r7 = 6
            r8 = 0
            r3 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            r5 = 0
            r6 = 0
            kotlin.collections.ArraysKt.fill$default(r2, r3, r5, r6, r7, r8)
            r0 = r1
        L21:
            r10.metadata = r0
            long[] r0 = r10.metadata
            r1 = 255(0xff, double:1.26E-321)
            r3 = 0
            int r4 = r11 >> 3
            r5 = r11 & 7
            int r5 = r5 << 3
            r6 = r0[r4]
            r8 = 255(0xff, double:1.26E-321)
            long r8 = r8 << r5
            long r8 = ~r8
            long r6 = r6 & r8
            long r8 = r1 << r5
            long r6 = r6 | r8
            r0[r4] = r6
            r10.initializeGrowth()
            return
    }

    private final void initializeStorage(int r3) {
            r2 = this;
            if (r3 <= 0) goto Lc
            r0 = 7
            int r1 = androidx.collection.ScatterMapKt.normalizeCapacity(r3)
            int r0 = java.lang.Math.max(r0, r1)
            goto Ld
        Lc:
            r0 = 0
        Ld:
            r2._capacity = r0
            r2.initializeMetadata(r0)
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r2.keys = r1
            float[] r1 = new float[r0]
            r2.values = r1
            return
    }

    private final void removeDeletedMarkers() {
            r23 = this;
            r0 = r23
            long[] r1 = r0.metadata
            int r2 = r0._capacity
            r3 = 0
            r4 = 0
        L8:
            if (r4 >= r2) goto L6d
            r5 = 0
            int r6 = r4 >> 3
            r6 = r1[r6]
            r8 = r4 & 7
            int r8 = r8 << 3
            long r6 = r6 >> r8
            r8 = 255(0xff, double:1.26E-321)
            long r5 = r6 & r8
            r10 = 254(0xfe, double:1.255E-321)
            int r7 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r7 != 0) goto L62
            r10 = 128(0x80, double:6.3E-322)
            r7 = r23
            r12 = 0
            long[] r13 = r7.metadata
            r14 = 0
            int r15 = r4 >> 3
            r16 = r4 & 7
            int r16 = r16 << 3
            r17 = r13[r15]
            r19 = r8
            long r8 = r19 << r16
            long r8 = ~r8
            long r8 = r17 & r8
            long r17 = r10 << r16
            long r8 = r8 | r17
            r13[r15] = r8
            int r8 = r7._capacity
            int r9 = r4 + (-7)
            r9 = r9 & r8
            r14 = r8 & 7
            int r9 = r9 + r14
            r14 = 0
            int r15 = r9 >> 3
            r16 = r9 & 7
            int r16 = r16 << 3
            r17 = r13[r15]
            r21 = r1
            r22 = r2
            long r1 = r19 << r16
            long r1 = ~r1
            long r1 = r17 & r1
            long r17 = r10 << r16
            long r1 = r1 | r17
            r13[r15] = r1
            int r3 = r3 + 1
            goto L66
        L62:
            r21 = r1
            r22 = r2
        L66:
            int r4 = r4 + 1
            r1 = r21
            r2 = r22
            goto L8
        L6d:
            r21 = r1
            int r1 = r0.growthLimit
            int r1 = r1 + r3
            r0.growthLimit = r1
            return
    }

    private final void resizeStorage(int r27) {
            r26 = this;
            r0 = r26
            long[] r1 = r0.metadata
            java.lang.Object[] r2 = r0.keys
            float[] r3 = r0.values
            int r4 = r0._capacity
            r26.initializeStorage(r27)
            java.lang.Object[] r5 = r0.keys
            float[] r6 = r0.values
            r7 = 0
        L12:
            if (r7 >= r4) goto L9e
            r8 = 0
            r9 = 0
            int r10 = r7 >> 3
            r10 = r1[r10]
            r12 = r7 & 7
            int r12 = r12 << 3
            long r10 = r10 >> r12
            r12 = 255(0xff, double:1.26E-321)
            long r9 = r10 & r12
            r14 = 128(0x80, double:6.3E-322)
            int r9 = (r9 > r14 ? 1 : (r9 == r14 ? 0 : -1))
            r10 = 0
            if (r9 >= 0) goto L2c
            r9 = 1
            goto L2d
        L2c:
            r9 = r10
        L2d:
            if (r9 == 0) goto L94
            r8 = r2[r7]
            r9 = 0
            if (r8 == 0) goto L38
            int r10 = r8.hashCode()
        L38:
            r11 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r10 = r10 * r11
            int r11 = r10 << 16
            r9 = r10 ^ r11
            r10 = 0
            int r10 = r9 >>> 7
            int r10 = r0.findFirstAvailableSlot(r10)
            r11 = 0
            r11 = r9 & 127(0x7f, float:1.78E-43)
            long r14 = (long) r11
            r11 = r26
            r16 = 0
            r17 = r12
            long[] r12 = r11.metadata
            r13 = 0
            int r19 = r10 >> 3
            r20 = r10 & 7
            int r20 = r20 << 3
            r21 = r12[r19]
            r23 = r1
            long r0 = r17 << r20
            long r0 = ~r0
            long r0 = r21 & r0
            long r21 = r14 << r20
            long r0 = r0 | r21
            r12[r19] = r0
            int r0 = r11._capacity
            int r1 = r10 + (-7)
            r1 = r1 & r0
            r13 = r0 & 7
            int r1 = r1 + r13
            r13 = 0
            int r19 = r1 >> 3
            r20 = r1 & 7
            int r20 = r20 << 3
            r21 = r12[r19]
            r24 = r0
            r25 = r1
            long r0 = r17 << r20
            long r0 = ~r0
            long r0 = r21 & r0
            long r17 = r14 << r20
            long r0 = r0 | r17
            r12[r19] = r0
            r5[r10] = r8
            r0 = r3[r7]
            r6[r10] = r0
            goto L96
        L94:
            r23 = r1
        L96:
            int r7 = r7 + 1
            r0 = r26
            r1 = r23
            goto L12
        L9e:
            return
    }

    private final void writeMetadata(int r12, long r13) {
            r11 = this;
            r0 = 0
            long[] r1 = r11.metadata
            r2 = 0
            int r3 = r12 >> 3
            r4 = r12 & 7
            int r4 = r4 << 3
            r5 = r1[r3]
            r7 = 255(0xff, double:1.26E-321)
            long r9 = r7 << r4
            long r9 = ~r9
            long r5 = r5 & r9
            long r9 = r13 << r4
            long r5 = r5 | r9
            r1[r3] = r5
            int r2 = r11._capacity
            int r3 = r12 + (-7)
            r3 = r3 & r2
            r4 = r2 & 7
            int r3 = r3 + r4
            r4 = 0
            int r5 = r3 >> 3
            r6 = r3 & 7
            int r6 = r6 << 3
            r9 = r1[r5]
            long r7 = r7 << r6
            long r7 = ~r7
            long r7 = r7 & r9
            long r9 = r13 << r6
            long r7 = r7 | r9
            r1[r5] = r7
            return
    }

    public final void clear() {
            r12 = this;
            r0 = 0
            r12._size = r0
            long[] r1 = r12.metadata
            long[] r2 = androidx.collection.ScatterMapKt.EmptyGroup
            if (r1 == r2) goto L31
            long[] r3 = r12.metadata
            r8 = 6
            r9 = 0
            r4 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            r6 = 0
            r7 = 0
            kotlin.collections.ArraysKt.fill$default(r3, r4, r6, r7, r8, r9)
            long[] r1 = r12.metadata
            int r2 = r12._capacity
            r3 = 255(0xff, double:1.26E-321)
            r5 = 0
            int r6 = r2 >> 3
            r7 = r2 & 7
            int r7 = r7 << 3
            r8 = r1[r6]
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 << r7
            long r10 = ~r10
            long r8 = r8 & r10
            long r10 = r3 << r7
            long r8 = r8 | r10
            r1[r6] = r8
        L31:
            java.lang.Object[] r1 = r12.keys
            r2 = 0
            int r3 = r12._capacity
            kotlin.collections.ArraysKt.fill(r1, r2, r0, r3)
            r12.initializeGrowth()
            return
    }

    public final float getOrPut(K r4, kotlin.jvm.functions.Function0<java.lang.Float> r5) {
            r3 = this;
            java.lang.String r0 = "defaultValue"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = 0
            int r1 = r3.findKeyIndex(r4)
            if (r1 < 0) goto L11
            float[] r2 = r3.values
            r2 = r2[r1]
            return r2
        L11:
            java.lang.Object r2 = r5.invoke()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            r3.set(r4, r2)
            return r2
    }

    public final void minusAssign(androidx.collection.ScatterSet<K> r21) {
            r20 = this;
            java.lang.String r0 = "keys"
            r1 = r21
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            r0 = 0
            r2 = r21
            r3 = 0
            java.lang.Object[] r4 = r2.elements
            r5 = r2
            r6 = 0
            long[] r7 = r5.metadata
            int r8 = r7.length
            int r8 = r8 + (-2)
            r9 = 0
            if (r9 > r8) goto L8a
        L19:
            r10 = r7[r9]
            r12 = r10
            r14 = 0
            r15 = r0
            long r0 = ~r12
            r16 = 7
            long r0 = r0 << r16
            long r0 = r0 & r12
            r16 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r0 = r0 & r16
            int r0 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r0 == 0) goto L7c
            int r0 = r9 - r8
            int r0 = ~r0
            int r0 = r0 >>> 31
            r1 = 8
            int r0 = 8 - r0
            r12 = 0
        L39:
            if (r12 >= r0) goto L73
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r10
            r16 = 0
            r17 = 128(0x80, double:6.3E-322)
            int r17 = (r13 > r17 ? 1 : (r13 == r17 ? 0 : -1))
            if (r17 >= 0) goto L49
            r17 = 1
            goto L4b
        L49:
            r17 = 0
        L4b:
            if (r17 == 0) goto L64
            int r13 = r9 << 3
            int r13 = r13 + r12
            r14 = r13
            r16 = 0
            r17 = r1
            r1 = r4[r14]
            r18 = 0
            r19 = r2
            r2 = r20
            r2.remove(r1)
            goto L6a
        L64:
            r17 = r1
            r19 = r2
            r2 = r20
        L6a:
            long r10 = r10 >> r17
            int r12 = r12 + 1
            r1 = r17
            r2 = r19
            goto L39
        L73:
            r17 = r1
            r19 = r2
            r2 = r20
            if (r0 != r1) goto L90
            goto L80
        L7c:
            r19 = r2
            r2 = r20
        L80:
            if (r9 == r8) goto L8f
            int r9 = r9 + 1
            r1 = r21
            r0 = r15
            r2 = r19
            goto L19
        L8a:
            r15 = r0
            r19 = r2
            r2 = r20
        L8f:
        L90:
            return
    }

    public final void minusAssign(java.lang.Iterable<? extends K> r4) {
            r3 = this;
            java.lang.String r0 = "keys"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = 0
            java.util.Iterator r1 = r4.iterator()
        La:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L18
            java.lang.Object r2 = r1.next()
            r3.remove(r2)
            goto La
        L18:
            return
    }

    public final void minusAssign(K r2) {
            r1 = this;
            r0 = 0
            r1.remove(r2)
            return
    }

    public final void minusAssign(kotlin.sequences.Sequence<? extends K> r4) {
            r3 = this;
            java.lang.String r0 = "keys"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = 0
            java.util.Iterator r1 = r4.iterator()
        La:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L18
            java.lang.Object r2 = r1.next()
            r3.remove(r2)
            goto La
        L18:
            return
    }

    public final void minusAssign(K[] r5) {
            r4 = this;
            java.lang.String r0 = "keys"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = 0
            int r1 = r5.length
            r2 = 0
        L8:
            if (r2 >= r1) goto L12
            r3 = r5[r2]
            r4.remove(r3)
            int r2 = r2 + 1
            goto L8
        L12:
            return
    }

    public final void plusAssign(androidx.collection.ObjectFloatMap<K> r2) {
            r1 = this;
            java.lang.String r0 = "from"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r0 = 0
            r1.putAll(r2)
            return
    }

    public final float put(K r4, float r5, float r6) {
            r3 = this;
            int r0 = r3.findIndex(r4)
            r1 = r6
            if (r0 >= 0) goto L9
            int r0 = ~r0
            goto Ld
        L9:
            float[] r2 = r3.values
            r1 = r2[r0]
        Ld:
            java.lang.Object[] r2 = r3.keys
            r2[r0] = r4
            float[] r2 = r3.values
            r2[r0] = r5
            return r1
    }

    public final void put(K r1, float r2) {
            r0 = this;
            r0.set(r1, r2)
            return
    }

    public final void putAll(androidx.collection.ObjectFloatMap<K> r22) {
            r21 = this;
            java.lang.String r0 = "from"
            r1 = r22
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            r0 = r22
            r2 = 0
            java.lang.Object[] r3 = r0.keys
            float[] r4 = r0.values
            r5 = r0
            r6 = 0
            long[] r7 = r5.metadata
            int r8 = r7.length
            int r8 = r8 + (-2)
            r9 = 0
            if (r9 > r8) goto L97
        L18:
            r10 = r7[r9]
            r12 = r10
            r14 = 0
            r15 = r0
            long r0 = ~r12
            r16 = 7
            long r0 = r0 << r16
            long r0 = r0 & r12
            r16 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r0 = r0 & r16
            int r0 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r0 == 0) goto L85
            int r0 = r9 - r8
            int r0 = ~r0
            int r0 = r0 >>> 31
            r1 = 8
            int r0 = 8 - r0
            r12 = 0
        L38:
            if (r12 >= r0) goto L7a
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r10
            r16 = 0
            r17 = 128(0x80, double:6.3E-322)
            int r17 = (r13 > r17 ? 1 : (r13 == r17 ? 0 : -1))
            if (r17 >= 0) goto L48
            r17 = 1
            goto L4a
        L48:
            r17 = 0
        L4a:
            if (r17 == 0) goto L67
            int r13 = r9 << 3
            int r13 = r13 + r12
            r14 = r13
            r16 = 0
            r17 = r1
            r1 = r3[r14]
            r18 = r2
            r2 = r4[r14]
            r19 = 0
            r20 = r3
            r3 = r21
            r3.set(r1, r2)
            goto L6f
        L67:
            r17 = r1
            r18 = r2
            r20 = r3
            r3 = r21
        L6f:
            long r10 = r10 >> r17
            int r12 = r12 + 1
            r1 = r17
            r2 = r18
            r3 = r20
            goto L38
        L7a:
            r17 = r1
            r18 = r2
            r20 = r3
            r3 = r21
            if (r0 != r1) goto L9f
            goto L8b
        L85:
            r18 = r2
            r20 = r3
            r3 = r21
        L8b:
            if (r9 == r8) goto L9e
            int r9 = r9 + 1
            r1 = r22
            r0 = r15
            r2 = r18
            r3 = r20
            goto L18
        L97:
            r15 = r0
            r18 = r2
            r20 = r3
            r3 = r21
        L9e:
        L9f:
            return
    }

    public final void remove(K r2) {
            r1 = this;
            int r0 = r1.findKeyIndex(r2)
            if (r0 < 0) goto L9
            r1.removeValueAt(r0)
        L9:
            return
    }

    public final boolean remove(K r5, float r6) {
            r4 = this;
            int r0 = r4.findKeyIndex(r5)
            r1 = 0
            if (r0 < 0) goto L19
            float[] r2 = r4.values
            r2 = r2[r0]
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            r3 = 1
            if (r2 != 0) goto L12
            r2 = r3
            goto L13
        L12:
            r2 = r1
        L13:
            if (r2 == 0) goto L19
            r4.removeValueAt(r0)
            return r3
        L19:
            return r1
    }

    public final void removeIf(kotlin.jvm.functions.Function2<? super K, ? super java.lang.Float, java.lang.Boolean> r19) {
            r18 = this;
            r0 = r18
            r1 = r19
            java.lang.String r2 = "predicate"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            r2 = 0
            r3 = r0
            androidx.collection.ObjectFloatMap r3 = (androidx.collection.ObjectFloatMap) r3
            r4 = 0
            long[] r5 = r3.metadata
            int r6 = r5.length
            int r6 = r6 + (-2)
            r7 = 0
            if (r7 > r6) goto L8b
        L16:
            r8 = r5[r7]
            r10 = r8
            r12 = 0
            long r13 = ~r10
            r15 = 7
            long r13 = r13 << r15
            long r13 = r13 & r10
            r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r13 & r15
            int r10 = (r10 > r15 ? 1 : (r10 == r15 ? 0 : -1))
            if (r10 == 0) goto L82
            int r10 = r7 - r6
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = 0
        L33:
            if (r12 >= r10) goto L79
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 0
            r16 = 128(0x80, double:6.3E-322)
            int r16 = (r13 > r16 ? 1 : (r13 == r16 ? 0 : -1))
            if (r16 >= 0) goto L42
            r16 = 1
            goto L44
        L42:
            r16 = 0
        L44:
            if (r16 == 0) goto L6c
            int r13 = r7 << 3
            int r13 = r13 + r12
            r14 = r13
            r15 = 0
            r16 = r11
            java.lang.Object[] r11 = r0.keys
            r11 = r11[r14]
            r17 = r2
            float[] r2 = r0.values
            r2 = r2[r14]
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            java.lang.Object r2 = r1.invoke(r11, r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L6a
            r0.removeValueAt(r14)
        L6a:
            goto L70
        L6c:
            r17 = r2
            r16 = r11
        L70:
            long r8 = r8 >> r16
            int r12 = r12 + 1
            r11 = r16
            r2 = r17
            goto L33
        L79:
            r17 = r2
            r16 = r11
            r2 = r16
            if (r10 != r2) goto L8e
            goto L84
        L82:
            r17 = r2
        L84:
            if (r7 == r6) goto L8d
            int r7 = r7 + 1
            r2 = r17
            goto L16
        L8b:
            r17 = r2
        L8d:
        L8e:
            return
    }

    public final void removeValueAt(int r15) {
            r14 = this;
            int r0 = r14._size
            int r0 = r0 + (-1)
            r14._size = r0
            r0 = 254(0xfe, double:1.255E-321)
            r2 = r14
            r3 = 0
            long[] r4 = r2.metadata
            r5 = 0
            int r6 = r15 >> 3
            r7 = r15 & 7
            int r7 = r7 << 3
            r8 = r4[r6]
            r10 = 255(0xff, double:1.26E-321)
            long r12 = r10 << r7
            long r12 = ~r12
            long r8 = r8 & r12
            long r12 = r0 << r7
            long r8 = r8 | r12
            r4[r6] = r8
            int r5 = r2._capacity
            int r6 = r15 + (-7)
            r6 = r6 & r5
            r7 = r5 & 7
            int r6 = r6 + r7
            r7 = 0
            int r8 = r6 >> 3
            r9 = r6 & 7
            int r9 = r9 << 3
            r12 = r4[r8]
            long r10 = r10 << r9
            long r10 = ~r10
            long r10 = r10 & r12
            long r12 = r0 << r9
            long r10 = r10 | r12
            r4[r8] = r10
            java.lang.Object[] r0 = r14.keys
            r1 = 0
            r0[r15] = r1
            return
    }

    public final void set(K r3, float r4) {
            r2 = this;
            int r0 = r2.findIndex(r3)
            if (r0 >= 0) goto L7
            int r0 = ~r0
        L7:
            java.lang.Object[] r1 = r2.keys
            r1[r0] = r3
            float[] r1 = r2.values
            r1[r0] = r4
            return
    }

    public final int trim() {
            r3 = this;
            int r0 = r3._capacity
            int r1 = r3._size
            int r1 = androidx.collection.ScatterMapKt.unloadedCapacity(r1)
            int r1 = androidx.collection.ScatterMapKt.normalizeCapacity(r1)
            if (r1 >= r0) goto L16
            r3.resizeStorage(r1)
            int r2 = r3._capacity
            int r2 = r0 - r2
            return r2
        L16:
            r2 = 0
            return r2
    }
}
