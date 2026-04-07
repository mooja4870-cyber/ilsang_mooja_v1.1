package androidx.collection;

/* JADX INFO: compiled from: FloatLongMap.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0014\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0006\u001a\u00020\u0007H\u0002J\u0006\u0010\b\u001a\u00020\u0007J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0003H\u0002J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH\u0002J\"\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0011H\u0086\bø\u0001\u0000J\b\u0010\u0012\u001a\u00020\u0007H\u0002J\u0010\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0003H\u0002J\u0010\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u0011\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0018H\u0086\nJ\u0011\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0019H\u0086\nJ\u0011\u0010\u0016\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\rH\u0086\nJ\u0011\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u001aH\u0086\nJ\u0011\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u0001H\u0086\nJ\u0016\u0010\u001d\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u000fJ\u001e\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u000fJ\u000e\u0010 \u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u0001J\u000e\u0010!\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\rJ\u0016\u0010!\u001a\u00020\"2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u000fJ\b\u0010#\u001a\u00020\u0007H\u0002J&\u0010$\u001a\u00020\u00072\u0018\u0010%\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\"0&H\u0086\bø\u0001\u0000J\u0010\u0010'\u001a\u00020\u00072\u0006\u0010(\u001a\u00020\u0003H\u0001J\u0010\u0010)\u001a\u00020\u00072\u0006\u0010*\u001a\u00020\u0003H\u0002J\u0019\u0010+\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u000fH\u0086\u0002J\u0006\u0010,\u001a\u00020\u0003J\u0019\u0010-\u001a\u00020\u00072\u0006\u0010(\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u000fH\u0082\bR\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006."}, d2 = {"Landroidx/collection/MutableFloatLongMap;", "Landroidx/collection/FloatLongMap;", "initialCapacity", "", "(I)V", "growthLimit", "adjustStorage", "", "clear", "findFirstAvailableSlot", "hash1", "findInsertIndex", "key", "", "getOrPut", "", "defaultValue", "Lkotlin/Function0;", "initializeGrowth", "initializeMetadata", "capacity", "initializeStorage", "minusAssign", "keys", "Landroidx/collection/FloatList;", "Landroidx/collection/FloatSet;", "", "plusAssign", "from", "put", "value", "default", "putAll", "remove", "", "removeDeletedMarkers", "removeIf", "predicate", "Lkotlin/Function2;", "removeValueAt", "index", "resizeStorage", "newCapacity", "set", "trim", "writeMetadata", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class MutableFloatLongMap extends androidx.collection.FloatLongMap {
    private int growthLimit;

    public MutableFloatLongMap() {
            r3 = this;
            r0 = 1
            r1 = 0
            r2 = 0
            r3.<init>(r2, r0, r1)
            return
    }

    public MutableFloatLongMap(int r3) {
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

    public /* synthetic */ MutableFloatLongMap(int r1, int r2, kotlin.jvm.internal.DefaultConstructorMarker r3) {
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

    private final int findInsertIndex(float r24) {
            r23 = this;
            r0 = r23
            r1 = 0
            int r2 = java.lang.Float.hashCode(r24)
            r3 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r2 = r2 * r3
            int r3 = r2 << 16
            r1 = r2 ^ r3
            r2 = 0
            int r2 = r1 >>> 7
            r3 = 0
            r3 = r1 & 127(0x7f, float:1.78E-43)
            int r4 = r0._capacity
            r5 = r2 & r4
            r6 = 0
        L1d:
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
            r15 = r4
            r16 = r5
            long r4 = (long) r10
            long r4 = -r4
            r17 = 63
            long r4 = r4 >> r17
            long r4 = r4 & r13
            long r4 = r4 | r11
            r7 = r4
            r9 = 0
            long r10 = (long) r3
            r12 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r10 = r10 * r12
            long r10 = r10 ^ r7
            long r12 = r10 - r12
            r17 = r4
            long r4 = ~r10
            long r4 = r4 & r12
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r4 = r4 & r12
        L54:
            r7 = r4
            r9 = 0
            r10 = 0
            int r14 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            r19 = 0
            r20 = 1
            if (r14 == 0) goto L63
            r7 = r20
            goto L65
        L63:
            r7 = r19
        L65:
            if (r7 == 0) goto L8c
            r7 = r4
            r9 = 0
            r10 = r7
            r14 = 0
            int r21 = java.lang.Long.numberOfTrailingZeros(r10)
            int r10 = r21 >> 3
            int r7 = r16 + r10
            r7 = r7 & r15
            float[] r8 = r0.keys
            r8 = r8[r7]
            int r8 = (r8 > r24 ? 1 : (r8 == r24 ? 0 : -1))
            if (r8 != 0) goto L7f
            r19 = r20
        L7f:
            if (r19 == 0) goto L82
            return r7
        L82:
            r8 = r4
            r10 = 0
            r19 = 1
            long r19 = r8 - r19
            long r8 = r8 & r19
            r4 = r8
            goto L54
        L8c:
            r7 = r17
            r9 = 0
            r21 = r10
            long r10 = ~r7
            r14 = 6
            long r10 = r10 << r14
            long r10 = r10 & r7
            long r7 = r10 & r12
            int r7 = (r7 > r21 ? 1 : (r7 == r21 ? 0 : -1))
            if (r7 == 0) goto L12b
        L9c:
            int r4 = r0.findFirstAvailableSlot(r2)
            int r5 = r0.growthLimit
            r7 = 255(0xff, double:1.26E-321)
            if (r5 != 0) goto Lc9
            long[] r5 = r0.metadata
            r9 = 0
            r10 = 0
            int r11 = r4 >> 3
            r11 = r5[r11]
            r13 = r4 & 7
            int r13 = r13 << 3
            long r11 = r11 >> r13
            long r10 = r11 & r7
            r12 = 254(0xfe, double:1.255E-321)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 != 0) goto Lbe
            r5 = r20
            goto Lc0
        Lbe:
            r5 = r19
        Lc0:
            if (r5 != 0) goto Lc9
            r0.adjustStorage()
            int r4 = r0.findFirstAvailableSlot(r2)
        Lc9:
            int r5 = r0._size
            int r5 = r5 + 1
            r0._size = r5
            int r5 = r0.growthLimit
            long[] r9 = r0.metadata
            r10 = 0
            r11 = 0
            int r12 = r4 >> 3
            r12 = r9[r12]
            r14 = r4 & 7
            int r14 = r14 << 3
            long r12 = r12 >> r14
            long r11 = r12 & r7
            r13 = 128(0x80, double:6.3E-322)
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 != 0) goto Le8
            r19 = r20
        Le8:
            int r5 = r5 - r19
            r0.growthLimit = r5
            long r9 = (long) r3
            r5 = r23
            r11 = 0
            long[] r12 = r5.metadata
            r13 = 0
            int r14 = r4 >> 3
            r17 = r4 & 7
            int r17 = r17 << 3
            r18 = r12[r14]
            r20 = r7
            long r7 = r20 << r17
            long r7 = ~r7
            long r7 = r18 & r7
            long r18 = r9 << r17
            long r7 = r7 | r18
            r12[r14] = r7
            int r7 = r5._capacity
            int r8 = r4 + (-7)
            r8 = r8 & r7
            r13 = r7 & 7
            int r8 = r8 + r13
            r13 = 0
            int r14 = r8 >> 3
            r17 = r8 & 7
            int r17 = r17 << 3
            r18 = r12[r14]
            r22 = r1
            long r0 = r20 << r17
            long r0 = ~r0
            long r0 = r18 & r0
            long r18 = r9 << r17
            long r0 = r0 | r18
            r12[r14] = r0
            int r0 = ~r4
            return r0
        L12b:
            r22 = r1
            int r6 = r6 + 8
            int r0 = r16 + r6
            r5 = r0 & r15
            r0 = r23
            r4 = r15
            goto L1d
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
            float[] r1 = new float[r0]
            r2.keys = r1
            long[] r1 = new long[r0]
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
            float[] r2 = r0.keys
            long[] r3 = r0.values
            int r4 = r0._capacity
            r26.initializeStorage(r27)
            float[] r5 = r0.keys
            long[] r6 = r0.values
            r7 = 0
        L12:
            if (r7 >= r4) goto L9b
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
            if (r9 >= 0) goto L2b
            r9 = 1
            goto L2c
        L2b:
            r9 = 0
        L2c:
            if (r9 == 0) goto L91
            r8 = r2[r7]
            r9 = 0
            int r10 = java.lang.Float.hashCode(r8)
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
            goto L93
        L91:
            r23 = r1
        L93:
            int r7 = r7 + 1
            r0 = r26
            r1 = r23
            goto L12
        L9b:
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
            r11 = this;
            r0 = 0
            r11._size = r0
            long[] r0 = r11.metadata
            long[] r1 = androidx.collection.ScatterMapKt.EmptyGroup
            if (r0 == r1) goto L31
            long[] r2 = r11.metadata
            r7 = 6
            r8 = 0
            r3 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            r5 = 0
            r6 = 0
            kotlin.collections.ArraysKt.fill$default(r2, r3, r5, r6, r7, r8)
            long[] r0 = r11.metadata
            int r1 = r11._capacity
            r2 = 255(0xff, double:1.26E-321)
            r4 = 0
            int r5 = r1 >> 3
            r6 = r1 & 7
            int r6 = r6 << 3
            r7 = r0[r5]
            r9 = 255(0xff, double:1.26E-321)
            long r9 = r9 << r6
            long r9 = ~r9
            long r7 = r7 & r9
            long r9 = r2 << r6
            long r7 = r7 | r9
            r0[r5] = r7
        L31:
            r11.initializeGrowth()
            return
    }

    public final long getOrPut(float r6, kotlin.jvm.functions.Function0<java.lang.Long> r7) {
            r5 = this;
            java.lang.String r0 = "defaultValue"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            r0 = 0
            int r1 = r5.findKeyIndex(r6)
            if (r1 >= 0) goto L1b
            java.lang.Object r2 = r7.invoke()
            java.lang.Number r2 = (java.lang.Number) r2
            long r2 = r2.longValue()
            r5.put(r6, r2)
            goto L20
        L1b:
            long[] r2 = r5.values
            r3 = r2[r1]
            r2 = r3
        L20:
            return r2
    }

    public final void minusAssign(float r2) {
            r1 = this;
            r0 = 0
            r1.remove(r2)
            return
    }

    public final void minusAssign(androidx.collection.FloatList r9) {
            r8 = this;
            java.lang.String r0 = "keys"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            r0 = 0
            r1 = r9
            r2 = 0
            float[] r3 = r1.content
            r4 = 0
            int r5 = r1._size
        Le:
            if (r4 >= r5) goto L1b
            r6 = r3[r4]
            r7 = 0
            r8.remove(r6)
            int r4 = r4 + 1
            goto Le
        L1b:
            return
    }

    public final void minusAssign(androidx.collection.FloatSet r21) {
            r20 = this;
            java.lang.String r0 = "keys"
            r1 = r21
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            r0 = 0
            r2 = r21
            r3 = 0
            float[] r4 = r2.elements
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

    public final void minusAssign(float[] r5) {
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

    public final void plusAssign(androidx.collection.FloatLongMap r2) {
            r1 = this;
            java.lang.String r0 = "from"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r0 = 0
            r1.putAll(r2)
            return
    }

    public final long put(float r5, long r6, long r8) {
            r4 = this;
            int r0 = r4.findInsertIndex(r5)
            r1 = r8
            if (r0 >= 0) goto L9
            int r0 = ~r0
            goto Ld
        L9:
            long[] r3 = r4.values
            r1 = r3[r0]
        Ld:
            float[] r3 = r4.keys
            r3[r0] = r5
            long[] r3 = r4.values
            r3[r0] = r6
            return r1
    }

    public final void put(float r1, long r2) {
            r0 = this;
            r0.set(r1, r2)
            return
    }

    public final void putAll(androidx.collection.FloatLongMap r23) {
            r22 = this;
            java.lang.String r0 = "from"
            r1 = r23
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            r0 = r23
            r2 = 0
            float[] r3 = r0.keys
            long[] r4 = r0.values
            r5 = r0
            r6 = 0
            long[] r7 = r5.metadata
            int r8 = r7.length
            int r8 = r8 + (-2)
            r9 = 0
            if (r9 > r8) goto La4
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
            if (r0 == 0) goto L8d
            int r0 = r9 - r8
            int r0 = ~r0
            int r0 = r0 >>> 31
            r1 = 8
            int r0 = 8 - r0
            r12 = 0
        L38:
            if (r12 >= r0) goto L80
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
            if (r17 == 0) goto L69
            int r13 = r9 << 3
            int r13 = r13 + r12
            r14 = r13
            r16 = 0
            r17 = r1
            r1 = r3[r14]
            r18 = r2
            r19 = r3
            r2 = r4[r14]
            r20 = 0
            r21 = r4
            r4 = r22
            r4.set(r1, r2)
            goto L73
        L69:
            r17 = r1
            r18 = r2
            r19 = r3
            r21 = r4
            r4 = r22
        L73:
            long r10 = r10 >> r17
            int r12 = r12 + 1
            r1 = r17
            r2 = r18
            r3 = r19
            r4 = r21
            goto L38
        L80:
            r17 = r1
            r18 = r2
            r19 = r3
            r21 = r4
            r4 = r22
            if (r0 != r1) goto Lae
            goto L95
        L8d:
            r18 = r2
            r19 = r3
            r21 = r4
            r4 = r22
        L95:
            if (r9 == r8) goto Lad
            int r9 = r9 + 1
            r1 = r23
            r0 = r15
            r2 = r18
            r3 = r19
            r4 = r21
            goto L18
        La4:
            r15 = r0
            r18 = r2
            r19 = r3
            r21 = r4
            r4 = r22
        Lad:
        Lae:
            return
    }

    public final void remove(float r2) {
            r1 = this;
            int r0 = r1.findKeyIndex(r2)
            if (r0 < 0) goto L9
            r1.removeValueAt(r0)
        L9:
            return
    }

    public final boolean remove(float r5, long r6) {
            r4 = this;
            int r0 = r4.findKeyIndex(r5)
            if (r0 < 0) goto L13
            long[] r1 = r4.values
            r2 = r1[r0]
            int r1 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r1 != 0) goto L13
            r4.removeValueAt(r0)
            r1 = 1
            return r1
        L13:
            r1 = 0
            return r1
    }

    public final void removeIf(kotlin.jvm.functions.Function2<? super java.lang.Float, ? super java.lang.Long, java.lang.Boolean> r21) {
            r20 = this;
            r0 = r20
            r1 = r21
            java.lang.String r2 = "predicate"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            r2 = 0
            r3 = r0
            androidx.collection.FloatLongMap r3 = (androidx.collection.FloatLongMap) r3
            r4 = 0
            long[] r5 = r3.metadata
            int r6 = r5.length
            int r6 = r6 + (-2)
            r7 = 0
            if (r7 > r6) goto L8f
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
            if (r10 == 0) goto L86
            int r10 = r7 - r6
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = 0
        L33:
            if (r12 >= r10) goto L7d
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
            if (r16 == 0) goto L70
            int r13 = r7 << 3
            int r13 = r13 + r12
            r14 = r13
            r15 = 0
            r16 = r11
            float[] r11 = r0.keys
            r11 = r11[r14]
            java.lang.Float r11 = java.lang.Float.valueOf(r11)
            r17 = r2
            long[] r2 = r0.values
            r18 = r2[r14]
            java.lang.Long r2 = java.lang.Long.valueOf(r18)
            java.lang.Object r2 = r1.invoke(r11, r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L6e
            r0.removeValueAt(r14)
        L6e:
            goto L74
        L70:
            r17 = r2
            r16 = r11
        L74:
            long r8 = r8 >> r16
            int r12 = r12 + 1
            r11 = r16
            r2 = r17
            goto L33
        L7d:
            r17 = r2
            r16 = r11
            r2 = r16
            if (r10 != r2) goto L92
            goto L88
        L86:
            r17 = r2
        L88:
            if (r7 == r6) goto L91
            int r7 = r7 + 1
            r2 = r17
            goto L16
        L8f:
            r17 = r2
        L91:
        L92:
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
            return
    }

    public final void set(float r3, long r4) {
            r2 = this;
            int r0 = r2.findInsertIndex(r3)
            if (r0 >= 0) goto L7
            int r0 = ~r0
        L7:
            float[] r1 = r2.keys
            r1[r0] = r3
            long[] r1 = r2.values
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
