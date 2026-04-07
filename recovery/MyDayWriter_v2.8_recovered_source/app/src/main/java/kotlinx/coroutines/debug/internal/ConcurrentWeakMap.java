package kotlinx.coroutines.debug.internal;

/* JADX INFO: compiled from: ConcurrentWeakMap.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0010'\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0004:\u0003()*B\u000f\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0014\u0010\u0019\u001a\u00020\u001a2\n\u0010\u001b\u001a\u0006\u0012\u0002\b\u00030\u001cH\u0002J\b\u0010\u001d\u001a\u00020\u001aH\u0016J\b\u0010\u001e\u001a\u00020\u001aH\u0002J\u0018\u0010\u001f\u001a\u0004\u0018\u00018\u00012\u0006\u0010 \u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010!J\u001f\u0010\"\u001a\u0004\u0018\u00018\u00012\u0006\u0010 \u001a\u00028\u00002\u0006\u0010#\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010$J!\u0010%\u001a\u0004\u0018\u00018\u00012\u0006\u0010 \u001a\u00028\u00002\b\u0010#\u001a\u0004\u0018\u00018\u0001H\u0002¢\u0006\u0002\u0010$J\u0017\u0010&\u001a\u0004\u0018\u00018\u00012\u0006\u0010 \u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010!J\u0006\u0010'\u001a\u00020\u001aR\t\u0010\b\u001a\u00020\tX\u0082\u0004R\u001f\u0010\n\u001a\u0018\u0012\u0014\u0012\u00120\fR\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00000\u000bX\u0082\u0004R&\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000f0\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0005\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0018X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006+"}, d2 = {"Lkotlinx/coroutines/debug/internal/ConcurrentWeakMap;", "K", "", "V", "Lkotlin/collections/AbstractMutableMap;", "weakRefQueue", "", "(Z)V", "_size", "Lkotlinx/atomicfu/AtomicInt;", "core", "Lkotlinx/atomicfu/AtomicRef;", "Lkotlinx/coroutines/debug/internal/ConcurrentWeakMap$Core;", "entries", "", "", "getEntries", "()Ljava/util/Set;", "keys", "getKeys", "size", "", "getSize", "()I", "Ljava/lang/ref/ReferenceQueue;", "cleanWeakRef", "", "w", "Lkotlinx/coroutines/debug/internal/HashedWeakRef;", "clear", "decrementSize", "get", "key", "(Ljava/lang/Object;)Ljava/lang/Object;", "put", "value", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "putSynchronized", "remove", "runWeakRefQueueCleaningLoopUntilInterrupted", "Core", "Entry", "KeyValueSet", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ConcurrentWeakMap<K, V> extends kotlin.collections.AbstractMutableMap<K, V> {
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater _size$volatile$FU = null;
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater core$volatile$FU = null;
    private volatile /* synthetic */ int _size$volatile;
    private volatile /* synthetic */ java.lang.Object core$volatile;
    private final java.lang.ref.ReferenceQueue<K> weakRefQueue;

    /* JADX INFO: compiled from: ConcurrentWeakMap.kt */
    @kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001:\u0001!B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\r\u001a\u00020\u000e2\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u0007J\u0015\u0010\u0010\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0011\u001a\u00028\u0000¢\u0006\u0002\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0003H\u0002J,\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00170\u0016\"\u0004\b\u0002\u0010\u00172\u0018\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u0002H\u00170\u0019J1\u0010\u001a\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0011\u001a\u00028\u00002\b\u0010\u001b\u001a\u0004\u0018\u00018\u00012\u0010\b\u0002\u0010\u001c\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0007¢\u0006\u0002\u0010\u001dJ\u0016\u0010\u001e\u001a\u00120\u0000R\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001fJ\u0010\u0010 \u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0003H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0005\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00070\u0006X\u0082\u0004R\t\u0010\b\u001a\u00020\tX\u0082\u0004R\u000e\u0010\n\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006X\u0082\u0004¨\u0006\""}, d2 = {"Lkotlinx/coroutines/debug/internal/ConcurrentWeakMap$Core;", "", "allocated", "", "(Lkotlinx/coroutines/debug/internal/ConcurrentWeakMap;I)V", "keys", "Lkotlinx/atomicfu/AtomicArray;", "Lkotlinx/coroutines/debug/internal/HashedWeakRef;", "load", "Lkotlinx/atomicfu/AtomicInt;", "shift", "threshold", "values", "cleanWeakRef", "", "weakRef", "getImpl", "key", "(Ljava/lang/Object;)Ljava/lang/Object;", "index", "hash", "keyValueIterator", "", "E", "factory", "Lkotlin/Function2;", "putImpl", "value", "weakKey0", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlinx/coroutines/debug/internal/HashedWeakRef;)Ljava/lang/Object;", "rehash", "Lkotlinx/coroutines/debug/internal/ConcurrentWeakMap;", "removeCleanedAt", "KeyValueIterator", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private final class Core {
        private static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater load$volatile$FU = null;
        private final int allocated;
        private final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceArray keys;
        private volatile /* synthetic */ int load$volatile;
        private final int shift;
        final /* synthetic */ kotlinx.coroutines.debug.internal.ConcurrentWeakMap<K, V> this$0;
        private final int threshold;
        private final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceArray values;

        /* JADX INFO: compiled from: ConcurrentWeakMap.kt */
        @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010)\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0000\b\u0082\u0004\u0018\u0000*\u0004\b\u0002\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u001f\u0012\u0018\u0010\u0003\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u000b\u001a\u00020\fH\u0002J\t\u0010\r\u001a\u00020\u000eH\u0096\u0002J\u000e\u0010\u000f\u001a\u00028\u0002H\u0096\u0002¢\u0006\u0002\u0010\u0010J\b\u0010\u0011\u001a\u00020\u0012H\u0016R \u0010\u0003\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u00028\u0000X\u0082.¢\u0006\u0004\n\u0002\u0010\tR\u0010\u0010\n\u001a\u00028\u0001X\u0082.¢\u0006\u0004\n\u0002\u0010\t¨\u0006\u0013"}, d2 = {"Lkotlinx/coroutines/debug/internal/ConcurrentWeakMap$Core$KeyValueIterator;", "E", "", "factory", "Lkotlin/Function2;", "(Lkotlinx/coroutines/debug/internal/ConcurrentWeakMap$Core;Lkotlin/jvm/functions/Function2;)V", "index", "", "key", "Ljava/lang/Object;", "value", "findNext", "", "hasNext", "", "next", "()Ljava/lang/Object;", "remove", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
        private final class KeyValueIterator<E> implements java.util.Iterator<E>, kotlin.jvm.internal.markers.KMutableIterator {
            private final kotlin.jvm.functions.Function2<K, V, E> factory;
            private int index;
            private K key;
            final /* synthetic */ kotlinx.coroutines.debug.internal.ConcurrentWeakMap<K, V>.Core this$0;
            private V value;

            public KeyValueIterator(kotlinx.coroutines.debug.internal.ConcurrentWeakMap.Core r2, kotlin.jvm.functions.Function2<? super K, ? super V, ? extends E> r3) {
                    r1 = this;
                    r1.this$0 = r2
                    r1.<init>()
                    r1.factory = r3
                    r0 = -1
                    r1.index = r0
                    r1.findNext()
                    return
            }

            private final void findNext() {
                    r2 = this;
                L1:
                    int r0 = r2.index
                    int r0 = r0 + 1
                    r2.index = r0
                    int r0 = r2.index
                    kotlinx.coroutines.debug.internal.ConcurrentWeakMap<K, V>$Core r1 = r2.this$0
                    int r1 = kotlinx.coroutines.debug.internal.ConcurrentWeakMap.Core.access$getAllocated$p(r1)
                    if (r0 >= r1) goto L44
                    kotlinx.coroutines.debug.internal.ConcurrentWeakMap<K, V>$Core r0 = r2.this$0
                    java.util.concurrent.atomic.AtomicReferenceArray r0 = kotlinx.coroutines.debug.internal.ConcurrentWeakMap.Core.access$getKeys(r0)
                    int r1 = r2.index
                    java.lang.Object r0 = r0.get(r1)
                    kotlinx.coroutines.debug.internal.HashedWeakRef r0 = (kotlinx.coroutines.debug.internal.HashedWeakRef) r0
                    if (r0 == 0) goto L1
                    java.lang.Object r0 = r0.get()
                    if (r0 != 0) goto L28
                    goto L1
                L28:
                    r2.key = r0
                    kotlinx.coroutines.debug.internal.ConcurrentWeakMap<K, V>$Core r0 = r2.this$0
                    java.util.concurrent.atomic.AtomicReferenceArray r0 = kotlinx.coroutines.debug.internal.ConcurrentWeakMap.Core.access$getValues(r0)
                    int r1 = r2.index
                    java.lang.Object r0 = r0.get(r1)
                    boolean r1 = r0 instanceof kotlinx.coroutines.debug.internal.Marked
                    if (r1 == 0) goto L3f
                    r1 = r0
                    kotlinx.coroutines.debug.internal.Marked r1 = (kotlinx.coroutines.debug.internal.Marked) r1
                    java.lang.Object r0 = r1.ref
                L3f:
                    if (r0 == 0) goto L1
                    r2.value = r0
                    return
                L44:
                    return
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                    r2 = this;
                    int r0 = r2.index
                    kotlinx.coroutines.debug.internal.ConcurrentWeakMap<K, V>$Core r1 = r2.this$0
                    int r1 = kotlinx.coroutines.debug.internal.ConcurrentWeakMap.Core.access$getAllocated$p(r1)
                    if (r0 >= r1) goto Lc
                    r0 = 1
                    goto Ld
                Lc:
                    r0 = 0
                Ld:
                    return r0
            }

            @Override // java.util.Iterator
            public E next() {
                    r3 = this;
                    int r0 = r3.index
                    kotlinx.coroutines.debug.internal.ConcurrentWeakMap<K, V>$Core r1 = r3.this$0
                    int r1 = kotlinx.coroutines.debug.internal.ConcurrentWeakMap.Core.access$getAllocated$p(r1)
                    if (r0 >= r1) goto L2c
                    kotlin.jvm.functions.Function2<K, V, E> r0 = r3.factory
                    K r1 = r3.key
                    if (r1 != 0) goto L17
                    java.lang.String r1 = "key"
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
                    kotlin.Unit r1 = kotlin.Unit.INSTANCE
                L17:
                    V r2 = r3.value
                    if (r2 != 0) goto L22
                    java.lang.String r2 = "value"
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
                    kotlin.Unit r2 = kotlin.Unit.INSTANCE
                L22:
                    java.lang.Object r0 = r0.invoke(r1, r2)
                    r1 = r0
                    r2 = 0
                    r3.findNext()
                    return r0
                L2c:
                    java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                    r0.<init>()
                    throw r0
            }

            @Override // java.util.Iterator
            public java.lang.Void remove() {
                    r1 = this;
                    kotlinx.coroutines.debug.internal.ConcurrentWeakMapKt.access$noImpl()
                    kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
                    r0.<init>()
                    throw r0
            }

            @Override // java.util.Iterator
            public /* bridge */ /* synthetic */ void remove() {
                    r0 = this;
                    r0.remove()
                    return
            }
        }

        static {
                java.lang.Class<kotlinx.coroutines.debug.internal.ConcurrentWeakMap$Core> r0 = kotlinx.coroutines.debug.internal.ConcurrentWeakMap.Core.class
                java.lang.String r1 = "load$volatile"
                java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r0, r1)
                kotlinx.coroutines.debug.internal.ConcurrentWeakMap.Core.load$volatile$FU = r0
                return
        }

        public Core(kotlinx.coroutines.debug.internal.ConcurrentWeakMap r3, int r4) {
                r2 = this;
                r2.this$0 = r3
                r2.<init>()
                r2.allocated = r4
                int r0 = r2.allocated
                int r0 = java.lang.Integer.numberOfLeadingZeros(r0)
                int r0 = r0 + 1
                r2.shift = r0
                int r0 = r2.allocated
                int r0 = r0 * 2
                int r0 = r0 / 3
                r2.threshold = r0
                java.util.concurrent.atomic.AtomicReferenceArray r0 = new java.util.concurrent.atomic.AtomicReferenceArray
                int r1 = r2.allocated
                r0.<init>(r1)
                r2.keys = r0
                java.util.concurrent.atomic.AtomicReferenceArray r0 = new java.util.concurrent.atomic.AtomicReferenceArray
                int r1 = r2.allocated
                r0.<init>(r1)
                r2.values = r0
                return
        }

        public static final /* synthetic */ int access$getAllocated$p(kotlinx.coroutines.debug.internal.ConcurrentWeakMap.Core r1) {
                int r0 = r1.allocated
                return r0
        }

        public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceArray access$getKeys(kotlinx.coroutines.debug.internal.ConcurrentWeakMap.Core r1) {
                java.util.concurrent.atomic.AtomicReferenceArray r0 = r1.getKeys()
                return r0
        }

        public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceArray access$getValues(kotlinx.coroutines.debug.internal.ConcurrentWeakMap.Core r1) {
                java.util.concurrent.atomic.AtomicReferenceArray r0 = r1.getValues()
                return r0
        }

        private final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceArray getKeys() {
                r1 = this;
                java.util.concurrent.atomic.AtomicReferenceArray r0 = r1.keys
                return r0
        }

        private final /* synthetic */ int getLoad$volatile() {
                r1 = this;
                int r0 = r1.load$volatile
                return r0
        }

        private static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater getLoad$volatile$FU() {
                java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = kotlinx.coroutines.debug.internal.ConcurrentWeakMap.Core.load$volatile$FU
                return r0
        }

        private final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceArray getValues() {
                r1 = this;
                java.util.concurrent.atomic.AtomicReferenceArray r0 = r1.values
                return r0
        }

        private final int index(int r3) {
                r2 = this;
                r0 = -1640531527(0xffffffff9e3779b9, float:-9.713111E-21)
                int r0 = r0 * r3
                int r1 = r2.shift
                int r0 = r0 >>> r1
                return r0
        }

        public static /* synthetic */ java.lang.Object putImpl$default(kotlinx.coroutines.debug.internal.ConcurrentWeakMap.Core r0, java.lang.Object r1, java.lang.Object r2, kotlinx.coroutines.debug.internal.HashedWeakRef r3, int r4, java.lang.Object r5) {
                r4 = r4 & 4
                if (r4 == 0) goto L5
                r3 = 0
            L5:
                java.lang.Object r0 = r0.putImpl(r1, r2, r3)
                return r0
        }

        private final void removeCleanedAt(int r4) {
                r3 = this;
            L1:
                java.util.concurrent.atomic.AtomicReferenceArray r0 = r3.getValues()
                java.lang.Object r0 = r0.get(r4)
                if (r0 != 0) goto Ld
                return
            Ld:
                boolean r1 = r0 instanceof kotlinx.coroutines.debug.internal.Marked
                if (r1 == 0) goto L12
                return
            L12:
                java.util.concurrent.atomic.AtomicReferenceArray r1 = r3.getValues()
                r2 = 0
                boolean r1 = kotlinx.coroutines.channels.ChannelSegment$$ExternalSyntheticBackportWithForwarding0.m(r1, r4, r0, r2)
                if (r1 == 0) goto L1
                kotlinx.coroutines.debug.internal.ConcurrentWeakMap<K, V> r1 = r3.this$0
                kotlinx.coroutines.debug.internal.ConcurrentWeakMap.access$decrementSize(r1)
                return
        }

        private final /* synthetic */ void setLoad$volatile(int r1) {
                r0 = this;
                r0.load$volatile = r1
                return
        }

        private final /* synthetic */ void update$atomicfu(java.lang.Object r3, java.util.concurrent.atomic.AtomicIntegerFieldUpdater r4, kotlin.jvm.functions.Function1<? super java.lang.Integer, java.lang.Integer> r5) {
                r2 = this;
            L0:
                int r0 = r4.get(r3)
                java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
                java.lang.Object r1 = r5.invoke(r1)
                java.lang.Number r1 = (java.lang.Number) r1
                int r1 = r1.intValue()
                boolean r0 = r4.compareAndSet(r3, r0, r1)
                if (r0 == 0) goto L0
                return
        }

        public final void cleanWeakRef(kotlinx.coroutines.debug.internal.HashedWeakRef<?> r3) {
                r2 = this;
                int r0 = r3.hash
                int r0 = r2.index(r0)
            L6:
                java.util.concurrent.atomic.AtomicReferenceArray r1 = r2.getKeys()
                java.lang.Object r1 = r1.get(r0)
                kotlinx.coroutines.debug.internal.HashedWeakRef r1 = (kotlinx.coroutines.debug.internal.HashedWeakRef) r1
                if (r1 != 0) goto L14
                return
            L14:
                if (r1 != r3) goto L1a
                r2.removeCleanedAt(r0)
                return
            L1a:
                if (r0 != 0) goto L1e
                int r0 = r2.allocated
            L1e:
                int r0 = r0 + (-1)
                goto L6
        }

        public final V getImpl(K r6) {
                r5 = this;
                int r0 = r6.hashCode()
                int r0 = r5.index(r0)
            L8:
                java.util.concurrent.atomic.AtomicReferenceArray r1 = r5.getKeys()
                java.lang.Object r1 = r1.get(r0)
                kotlinx.coroutines.debug.internal.HashedWeakRef r1 = (kotlinx.coroutines.debug.internal.HashedWeakRef) r1
                if (r1 != 0) goto L17
                r1 = 0
                return r1
            L17:
                java.lang.Object r2 = r1.get()
                boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r6, r2)
                if (r3 == 0) goto L35
                java.util.concurrent.atomic.AtomicReferenceArray r3 = r5.getValues()
                java.lang.Object r3 = r3.get(r0)
                boolean r4 = r3 instanceof kotlinx.coroutines.debug.internal.Marked
                if (r4 == 0) goto L33
                r4 = r3
                kotlinx.coroutines.debug.internal.Marked r4 = (kotlinx.coroutines.debug.internal.Marked) r4
                java.lang.Object r4 = r4.ref
                goto L34
            L33:
                r4 = r3
            L34:
                return r4
            L35:
                if (r2 != 0) goto L3a
                r5.removeCleanedAt(r0)
            L3a:
                if (r0 != 0) goto L3e
                int r0 = r5.allocated
            L3e:
                int r0 = r0 + (-1)
                goto L8
        }

        public final <E> java.util.Iterator<E> keyValueIterator(kotlin.jvm.functions.Function2<? super K, ? super V, ? extends E> r2) {
                r1 = this;
                kotlinx.coroutines.debug.internal.ConcurrentWeakMap$Core$KeyValueIterator r0 = new kotlinx.coroutines.debug.internal.ConcurrentWeakMap$Core$KeyValueIterator
                r0.<init>(r1, r2)
                java.util.Iterator r0 = (java.util.Iterator) r0
                return r0
        }

        public final java.lang.Object putImpl(K r12, V r13, kotlinx.coroutines.debug.internal.HashedWeakRef<K> r14) {
                r11 = this;
                int r0 = r12.hashCode()
                int r0 = r11.index(r0)
                r1 = 0
                r2 = r14
            La:
                java.util.concurrent.atomic.AtomicReferenceArray r3 = r11.getKeys()
                java.lang.Object r3 = r3.get(r0)
                kotlinx.coroutines.debug.internal.HashedWeakRef r3 = (kotlinx.coroutines.debug.internal.HashedWeakRef) r3
                if (r3 != 0) goto L56
                r4 = 0
                if (r13 != 0) goto L1b
                return r4
            L1b:
                if (r1 != 0) goto L3a
                java.util.concurrent.atomic.AtomicIntegerFieldUpdater r5 = getLoad$volatile$FU()
                r6 = r11
            L22:
                int r7 = r5.get(r11)
                r8 = r7
                r9 = 0
                int r10 = r11.threshold
                if (r8 < r10) goto L31
                kotlinx.coroutines.internal.Symbol r4 = kotlinx.coroutines.debug.internal.ConcurrentWeakMapKt.access$getREHASH$p()
                return r4
            L31:
                int r8 = r8 + 1
                boolean r7 = r5.compareAndSet(r11, r7, r8)
                if (r7 == 0) goto L22
                r1 = 1
            L3a:
                if (r2 != 0) goto L48
                kotlinx.coroutines.debug.internal.HashedWeakRef r5 = new kotlinx.coroutines.debug.internal.HashedWeakRef
                kotlinx.coroutines.debug.internal.ConcurrentWeakMap<K, V> r6 = r11.this$0
                java.lang.ref.ReferenceQueue r6 = kotlinx.coroutines.debug.internal.ConcurrentWeakMap.access$getWeakRefQueue$p(r6)
                r5.<init>(r12, r6)
                r2 = r5
            L48:
                java.util.concurrent.atomic.AtomicReferenceArray r5 = r11.getKeys()
                boolean r4 = kotlinx.coroutines.channels.ChannelSegment$$ExternalSyntheticBackportWithForwarding0.m(r5, r0, r4, r2)
                if (r4 != 0) goto L53
                goto La
            L53:
                r5 = r1
                r6 = r2
                goto L6b
            L56:
                java.lang.Object r4 = r3.get()
                boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual(r12, r4)
                if (r5 == 0) goto L89
                if (r1 == 0) goto L69
                java.util.concurrent.atomic.AtomicIntegerFieldUpdater r5 = getLoad$volatile$FU()
                r5.decrementAndGet(r11)
            L69:
                r5 = r1
                r6 = r2
            L6b:
                r1 = 0
            L6c:
                java.util.concurrent.atomic.AtomicReferenceArray r2 = r11.getValues()
                java.lang.Object r1 = r2.get(r0)
                boolean r2 = r1 instanceof kotlinx.coroutines.debug.internal.Marked
                if (r2 == 0) goto L7e
                kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.debug.internal.ConcurrentWeakMapKt.access$getREHASH$p()
                return r2
            L7e:
                java.util.concurrent.atomic.AtomicReferenceArray r2 = r11.getValues()
                boolean r2 = kotlinx.coroutines.channels.ChannelSegment$$ExternalSyntheticBackportWithForwarding0.m(r2, r0, r1, r13)
                if (r2 == 0) goto L6c
                return r1
            L89:
                if (r4 != 0) goto L8e
                r11.removeCleanedAt(r0)
            L8e:
                if (r0 != 0) goto L92
                int r0 = r11.allocated
            L92:
                int r0 = r0 + (-1)
                goto La
        }

        public final kotlinx.coroutines.debug.internal.ConcurrentWeakMap<K, V>.Core rehash() {
                r9 = this;
            L1:
                kotlinx.coroutines.debug.internal.ConcurrentWeakMap<K, V> r0 = r9.this$0
                int r0 = r0.size()
                r1 = 4
                int r0 = kotlin.ranges.RangesKt.coerceAtLeast(r0, r1)
                int r0 = java.lang.Integer.highestOneBit(r0)
                int r0 = r0 * r1
                kotlinx.coroutines.debug.internal.ConcurrentWeakMap$Core r1 = new kotlinx.coroutines.debug.internal.ConcurrentWeakMap$Core
                kotlinx.coroutines.debug.internal.ConcurrentWeakMap<K, V> r2 = r9.this$0
                r1.<init>(r2, r0)
                r2 = 0
                int r3 = r9.allocated
            L1c:
                if (r2 >= r3) goto L7a
                java.util.concurrent.atomic.AtomicReferenceArray r4 = r9.getKeys()
                java.lang.Object r4 = r4.get(r2)
                kotlinx.coroutines.debug.internal.HashedWeakRef r4 = (kotlinx.coroutines.debug.internal.HashedWeakRef) r4
                if (r4 == 0) goto L2f
                java.lang.Object r5 = r4.get()
                goto L30
            L2f:
                r5 = 0
            L30:
                if (r4 == 0) goto L37
                if (r5 != 0) goto L37
                r9.removeCleanedAt(r2)
            L37:
                r6 = 0
            L38:
                java.util.concurrent.atomic.AtomicReferenceArray r7 = r9.getValues()
                java.lang.Object r6 = r7.get(r2)
                boolean r7 = r6 instanceof kotlinx.coroutines.debug.internal.Marked
                if (r7 == 0) goto L4b
                r7 = r6
                kotlinx.coroutines.debug.internal.Marked r7 = (kotlinx.coroutines.debug.internal.Marked) r7
                java.lang.Object r6 = r7.ref
                goto L59
            L4b:
                java.util.concurrent.atomic.AtomicReferenceArray r7 = r9.getValues()
                kotlinx.coroutines.debug.internal.Marked r8 = kotlinx.coroutines.debug.internal.ConcurrentWeakMapKt.access$mark(r6)
                boolean r7 = kotlinx.coroutines.channels.ChannelSegment$$ExternalSyntheticBackportWithForwarding0.m(r7, r2, r6, r8)
                if (r7 == 0) goto L38
            L59:
                if (r5 == 0) goto L77
                if (r6 == 0) goto L77
                java.lang.Object r7 = r1.putImpl(r5, r6, r4)
                kotlinx.coroutines.internal.Symbol r8 = kotlinx.coroutines.debug.internal.ConcurrentWeakMapKt.access$getREHASH$p()
                if (r7 == r8) goto L1
                if (r7 != 0) goto L6b
                r8 = 1
                goto L6c
            L6b:
                r8 = 0
            L6c:
                if (r8 == 0) goto L6f
                goto L77
            L6f:
                java.lang.AssertionError r3 = new java.lang.AssertionError
                java.lang.String r8 = "Assertion failed"
                r3.<init>(r8)
                throw r3
            L77:
                int r2 = r2 + 1
                goto L1c
            L7a:
                return r1
        }
    }

    /* JADX INFO: compiled from: ConcurrentWeakMap.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010'\n\u0002\b\u000b\b\u0002\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u0003B\u0015\u0012\u0006\u0010\u0004\u001a\u00028\u0002\u0012\u0006\u0010\u0005\u001a\u00028\u0003¢\u0006\u0002\u0010\u0006J\u0015\u0010\u000b\u001a\u00028\u00032\u0006\u0010\f\u001a\u00028\u0003H\u0016¢\u0006\u0002\u0010\rR\u0016\u0010\u0004\u001a\u00028\u0002X\u0096\u0004¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0005\u001a\u00028\u0003X\u0096\u0004¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\n\u0010\b¨\u0006\u000e"}, d2 = {"Lkotlinx/coroutines/debug/internal/ConcurrentWeakMap$Entry;", "K", "V", "", "key", "value", "(Ljava/lang/Object;Ljava/lang/Object;)V", "getKey", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getValue", "setValue", "newValue", "(Ljava/lang/Object;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class Entry<K, V> implements java.util.Map.Entry<K, V>, kotlin.jvm.internal.markers.KMutableMap.Entry {
        private final K key;
        private final V value;

        public Entry(K r1, V r2) {
                r0 = this;
                r0.<init>()
                r0.key = r1
                r0.value = r2
                return
        }

        @Override // java.util.Map.Entry
        public K getKey() {
                r1 = this;
                K r0 = r1.key
                return r0
        }

        @Override // java.util.Map.Entry
        public V getValue() {
                r1 = this;
                V r0 = r1.value
                return r0
        }

        @Override // java.util.Map.Entry
        public V setValue(V r2) {
                r1 = this;
                kotlinx.coroutines.debug.internal.ConcurrentWeakMapKt.access$noImpl()
                kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
                r0.<init>()
                throw r0
        }
    }

    /* JADX INFO: compiled from: ConcurrentWeakMap.kt */
    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010)\n\u0000\b\u0082\u0004\u0018\u0000*\u0004\b\u0002\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u001f\u0012\u0018\u0010\u0003\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0015\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00028\u0002H\u0016¢\u0006\u0002\u0010\rJ\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00020\u000fH\u0096\u0002R \u0010\u0003\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u0010"}, d2 = {"Lkotlinx/coroutines/debug/internal/ConcurrentWeakMap$KeyValueSet;", "E", "Lkotlin/collections/AbstractMutableSet;", "factory", "Lkotlin/Function2;", "(Lkotlinx/coroutines/debug/internal/ConcurrentWeakMap;Lkotlin/jvm/functions/Function2;)V", "size", "", "getSize", "()I", "add", "", "element", "(Ljava/lang/Object;)Z", "iterator", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private final class KeyValueSet<E> extends kotlin.collections.AbstractMutableSet<E> {
        private final kotlin.jvm.functions.Function2<K, V, E> factory;
        final /* synthetic */ kotlinx.coroutines.debug.internal.ConcurrentWeakMap<K, V> this$0;

        public KeyValueSet(kotlinx.coroutines.debug.internal.ConcurrentWeakMap r1, kotlin.jvm.functions.Function2<? super K, ? super V, ? extends E> r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.factory = r2
                return
        }

        @Override // kotlin.collections.AbstractMutableSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean add(E r2) {
                r1 = this;
                kotlinx.coroutines.debug.internal.ConcurrentWeakMapKt.access$noImpl()
                kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
                r0.<init>()
                throw r0
        }

        @Override // kotlin.collections.AbstractMutableSet
        public int getSize() {
                r1 = this;
                kotlinx.coroutines.debug.internal.ConcurrentWeakMap<K, V> r0 = r1.this$0
                int r0 = r0.size()
                return r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public java.util.Iterator<E> iterator() {
                r2 = this;
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.debug.internal.ConcurrentWeakMap.access$getCore$volatile$FU()
                kotlinx.coroutines.debug.internal.ConcurrentWeakMap<K, V> r1 = r2.this$0
                java.lang.Object r0 = r0.get(r1)
                kotlinx.coroutines.debug.internal.ConcurrentWeakMap$Core r0 = (kotlinx.coroutines.debug.internal.ConcurrentWeakMap.Core) r0
                kotlin.jvm.functions.Function2<K, V, E> r1 = r2.factory
                java.util.Iterator r0 = r0.keyValueIterator(r1)
                return r0
        }
    }

    static {
            java.lang.String r0 = "_size$volatile"
            java.lang.Class<kotlinx.coroutines.debug.internal.ConcurrentWeakMap> r1 = kotlinx.coroutines.debug.internal.ConcurrentWeakMap.class
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r1, r0)
            kotlinx.coroutines.debug.internal.ConcurrentWeakMap._size$volatile$FU = r0
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.String r2 = "core$volatile"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r0, r2)
            kotlinx.coroutines.debug.internal.ConcurrentWeakMap.core$volatile$FU = r0
            return
    }

    public ConcurrentWeakMap() {
            r3 = this;
            r0 = 1
            r1 = 0
            r2 = 0
            r3.<init>(r2, r0, r1)
            return
    }

    public ConcurrentWeakMap(boolean r3) {
            r2 = this;
            r2.<init>()
            kotlinx.coroutines.debug.internal.ConcurrentWeakMap$Core r0 = new kotlinx.coroutines.debug.internal.ConcurrentWeakMap$Core
            r1 = 16
            r0.<init>(r2, r1)
            r2.core$volatile = r0
            if (r3 == 0) goto L14
            java.lang.ref.ReferenceQueue r0 = new java.lang.ref.ReferenceQueue
            r0.<init>()
            goto L15
        L14:
            r0 = 0
        L15:
            r2.weakRefQueue = r0
            return
    }

    public /* synthetic */ ConcurrentWeakMap(boolean r1, int r2, kotlin.jvm.internal.DefaultConstructorMarker r3) {
            r0 = this;
            r2 = r2 & 1
            if (r2 == 0) goto L5
            r1 = 0
        L5:
            r0.<init>(r1)
            return
    }

    public static final /* synthetic */ void access$decrementSize(kotlinx.coroutines.debug.internal.ConcurrentWeakMap r0) {
            r0.decrementSize()
            return
    }

    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater access$getCore$volatile$FU() {
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = getCore$volatile$FU()
            return r0
    }

    public static final /* synthetic */ java.lang.ref.ReferenceQueue access$getWeakRefQueue$p(kotlinx.coroutines.debug.internal.ConcurrentWeakMap r1) {
            java.lang.ref.ReferenceQueue<K> r0 = r1.weakRefQueue
            return r0
    }

    private final void cleanWeakRef(kotlinx.coroutines.debug.internal.HashedWeakRef<?> r2) {
            r1 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = getCore$volatile$FU()
            java.lang.Object r0 = r0.get(r1)
            kotlinx.coroutines.debug.internal.ConcurrentWeakMap$Core r0 = (kotlinx.coroutines.debug.internal.ConcurrentWeakMap.Core) r0
            r0.cleanWeakRef(r2)
            return
    }

    private final void decrementSize() {
            r1 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = get_size$volatile$FU()
            r0.decrementAndGet(r1)
            return
    }

    private final /* synthetic */ java.lang.Object getCore$volatile() {
            r1 = this;
            java.lang.Object r0 = r1.core$volatile
            return r0
    }

    private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater getCore$volatile$FU() {
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.debug.internal.ConcurrentWeakMap.core$volatile$FU
            return r0
    }

    private final /* synthetic */ int get_size$volatile() {
            r1 = this;
            int r0 = r1._size$volatile
            return r0
    }

    private static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater get_size$volatile$FU() {
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = kotlinx.coroutines.debug.internal.ConcurrentWeakMap._size$volatile$FU
            return r0
    }

    private final synchronized V putSynchronized(K r8, V r9) {
            r7 = this;
            monitor-enter(r7)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = getCore$volatile$FU()     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r0 = r0.get(r7)     // Catch: java.lang.Throwable -> L2d
            kotlinx.coroutines.debug.internal.ConcurrentWeakMap$Core r0 = (kotlinx.coroutines.debug.internal.ConcurrentWeakMap.Core) r0     // Catch: java.lang.Throwable -> L2d
            r1 = r0
        Lc:
            r5 = 4
            r6 = 0
            r4 = 0
            r2 = r8
            r3 = r9
            java.lang.Object r8 = kotlinx.coroutines.debug.internal.ConcurrentWeakMap.Core.putImpl$default(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L2d
            kotlinx.coroutines.internal.Symbol r9 = kotlinx.coroutines.debug.internal.ConcurrentWeakMapKt.access$getREHASH$p()     // Catch: java.lang.Throwable -> L2d
            if (r8 == r9) goto L1e
            monitor-exit(r7)
            return r8
        L1e:
            kotlinx.coroutines.debug.internal.ConcurrentWeakMap$Core r9 = r1.rehash()     // Catch: java.lang.Throwable -> L2d
            r1 = r9
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r9 = getCore$volatile$FU()     // Catch: java.lang.Throwable -> L2d
            r9.set(r7, r1)     // Catch: java.lang.Throwable -> L2d
            r8 = r2
            r9 = r3
            goto Lc
        L2d:
            r0 = move-exception
            r8 = r0
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L2d
            throw r8
    }

    private final /* synthetic */ void setCore$volatile(java.lang.Object r1) {
            r0 = this;
            r0.core$volatile = r1
            return
    }

    private final /* synthetic */ void set_size$volatile(int r1) {
            r0 = this;
            r0._size$volatile = r1
            return
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
            r2 = this;
            java.util.Set r0 = r2.keySet()
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()
            r2.remove(r1)
            goto L8
        L16:
            return
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(java.lang.Object r2) {
            r1 = this;
            if (r2 != 0) goto L4
            r0 = 0
            return r0
        L4:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = getCore$volatile$FU()
            java.lang.Object r0 = r0.get(r1)
            kotlinx.coroutines.debug.internal.ConcurrentWeakMap$Core r0 = (kotlinx.coroutines.debug.internal.ConcurrentWeakMap.Core) r0
            java.lang.Object r0 = r0.getImpl(r2)
            return r0
    }

    @Override // kotlin.collections.AbstractMutableMap
    public java.util.Set<java.util.Map.Entry<K, V>> getEntries() {
            r2 = this;
            kotlinx.coroutines.debug.internal.ConcurrentWeakMap$KeyValueSet r0 = new kotlinx.coroutines.debug.internal.ConcurrentWeakMap$KeyValueSet
            kotlinx.coroutines.debug.internal.ConcurrentWeakMap$entries$1 r1 = kotlinx.coroutines.debug.internal.ConcurrentWeakMap$entries$1.INSTANCE
            kotlin.jvm.functions.Function2 r1 = (kotlin.jvm.functions.Function2) r1
            r0.<init>(r2, r1)
            java.util.Set r0 = (java.util.Set) r0
            return r0
    }

    @Override // kotlin.collections.AbstractMutableMap
    public java.util.Set<K> getKeys() {
            r2 = this;
            kotlinx.coroutines.debug.internal.ConcurrentWeakMap$KeyValueSet r0 = new kotlinx.coroutines.debug.internal.ConcurrentWeakMap$KeyValueSet
            kotlinx.coroutines.debug.internal.ConcurrentWeakMap$keys$1 r1 = kotlinx.coroutines.debug.internal.ConcurrentWeakMap$keys$1.INSTANCE
            kotlin.jvm.functions.Function2 r1 = (kotlin.jvm.functions.Function2) r1
            r0.<init>(r2, r1)
            java.util.Set r0 = (java.util.Set) r0
            return r0
    }

    @Override // kotlin.collections.AbstractMutableMap
    public int getSize() {
            r1 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = get_size$volatile$FU()
            int r0 = r0.get(r1)
            return r0
    }

    @Override // kotlin.collections.AbstractMutableMap, java.util.AbstractMap, java.util.Map
    public V put(K r8, V r9) {
            r7 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = getCore$volatile$FU()
            java.lang.Object r0 = r0.get(r7)
            r1 = r0
            kotlinx.coroutines.debug.internal.ConcurrentWeakMap$Core r1 = (kotlinx.coroutines.debug.internal.ConcurrentWeakMap.Core) r1
            r5 = 4
            r6 = 0
            r4 = 0
            r2 = r8
            r3 = r9
            java.lang.Object r8 = kotlinx.coroutines.debug.internal.ConcurrentWeakMap.Core.putImpl$default(r1, r2, r3, r4, r5, r6)
            kotlinx.coroutines.internal.Symbol r9 = kotlinx.coroutines.debug.internal.ConcurrentWeakMapKt.access$getREHASH$p()
            if (r8 != r9) goto L1e
            java.lang.Object r8 = r7.putSynchronized(r2, r3)
        L1e:
            if (r8 != 0) goto L27
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r9 = get_size$volatile$FU()
            r9.incrementAndGet(r7)
        L27:
            return r8
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(java.lang.Object r9) {
            r8 = this;
            r0 = 0
            if (r9 != 0) goto L4
            return r0
        L4:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = getCore$volatile$FU()
            java.lang.Object r1 = r1.get(r8)
            r2 = r1
            kotlinx.coroutines.debug.internal.ConcurrentWeakMap$Core r2 = (kotlinx.coroutines.debug.internal.ConcurrentWeakMap.Core) r2
            r6 = 4
            r7 = 0
            r4 = 0
            r5 = 0
            r3 = r9
            java.lang.Object r9 = kotlinx.coroutines.debug.internal.ConcurrentWeakMap.Core.putImpl$default(r2, r3, r4, r5, r6, r7)
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.debug.internal.ConcurrentWeakMapKt.access$getREHASH$p()
            if (r9 != r1) goto L22
            java.lang.Object r9 = r8.putSynchronized(r3, r0)
        L22:
            if (r9 == 0) goto L2b
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = get_size$volatile$FU()
            r0.decrementAndGet(r8)
        L2b:
            return r9
    }

    public final void runWeakRefQueueCleaningLoopUntilInterrupted() {
            r2 = this;
            java.lang.ref.ReferenceQueue<K> r0 = r2.weakRefQueue
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            if (r0 == 0) goto L25
        La:
        Lb:
            java.lang.ref.ReferenceQueue<K> r0 = r2.weakRefQueue     // Catch: java.lang.InterruptedException -> L1c
            java.lang.ref.Reference r0 = r0.remove()     // Catch: java.lang.InterruptedException -> L1c
            java.lang.String r1 = "null cannot be cast to non-null type kotlinx.coroutines.debug.internal.HashedWeakRef<*>"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0, r1)     // Catch: java.lang.InterruptedException -> L1c
            kotlinx.coroutines.debug.internal.HashedWeakRef r0 = (kotlinx.coroutines.debug.internal.HashedWeakRef) r0     // Catch: java.lang.InterruptedException -> L1c
            r2.cleanWeakRef(r0)     // Catch: java.lang.InterruptedException -> L1c
            goto La
        L1c:
            r0 = move-exception
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r1.interrupt()
            return
        L25:
            r0 = 0
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Must be created with weakRefQueue = true"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }
}
