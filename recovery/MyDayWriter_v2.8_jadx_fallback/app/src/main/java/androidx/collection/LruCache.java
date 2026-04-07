package androidx.collection;

/* JADX INFO: compiled from: LruCache.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010%\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00022\u00020\u0002B\u000f\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0017\u0010\u0011\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0012\u001a\u00028\u0000H\u0014¢\u0006\u0002\u0010\u0013J\u0006\u0010\u0007\u001a\u00020\u0005J/\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u0018\u001a\u00028\u00012\b\u0010\u0019\u001a\u0004\u0018\u00018\u0001H\u0014¢\u0006\u0002\u0010\u001aJ\u0006\u0010\u001b\u001a\u00020\u0015J\u0006\u0010\b\u001a\u00020\u0005J\u0018\u0010\u001c\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0012\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0002\u0010\u0013J\u0006\u0010\t\u001a\u00020\u0005J\u0006\u0010\u0004\u001a\u00020\u0005J\u0006\u0010\u000e\u001a\u00020\u0005J\u001d\u0010\u001d\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u001e\u001a\u00028\u0001¢\u0006\u0002\u0010\u001fJ\u0006\u0010\u000f\u001a\u00020\u0005J\u0015\u0010 \u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0012\u001a\u00028\u0000¢\u0006\u0002\u0010\u0013J\u0012\u0010!\u001a\u00020\u00152\b\b\u0001\u0010\u0004\u001a\u00020\u0005H\u0016J\u001d\u0010\"\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u001e\u001a\u00028\u0001H\u0002¢\u0006\u0002\u0010#J\u0006\u0010\u0010\u001a\u00020\u0005J\u001d\u0010$\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u001e\u001a\u00028\u0001H\u0014¢\u0006\u0002\u0010#J\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010&J\b\u0010'\u001a\u00020(H\u0016J\u0010\u0010)\u001a\u00020\u00152\u0006\u0010\u0004\u001a\u00020\u0005H\u0016R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006*"}, d2 = {"Landroidx/collection/LruCache;", "K", "", "V", "maxSize", "", "(I)V", "createCount", "evictionCount", "hitCount", "lock", "Landroidx/collection/internal/Lock;", "map", "Landroidx/collection/internal/LruHashMap;", "missCount", "putCount", "size", "create", "key", "(Ljava/lang/Object;)Ljava/lang/Object;", "entryRemoved", "", "evicted", "", "oldValue", "newValue", "(ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "evictAll", "get", "put", "value", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "remove", "resize", "safeSizeOf", "(Ljava/lang/Object;Ljava/lang/Object;)I", "sizeOf", "snapshot", "", "toString", "", "trimToSize", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class LruCache<K, V> {
    private int createCount;
    private int evictionCount;
    private int hitCount;
    private final androidx.collection.internal.Lock lock;
    private final androidx.collection.internal.LruHashMap<K, V> map;
    private int maxSize;
    private int missCount;
    private int putCount;
    private int size;

    public LruCache(int r4) {
            r3 = this;
            r3.<init>()
            r3.maxSize = r4
            int r0 = r3.maxSize
            r1 = 0
            if (r0 <= 0) goto Ld
            r0 = 1
            goto Le
        Ld:
            r0 = r1
        Le:
            if (r0 == 0) goto L22
        L11:
            androidx.collection.internal.LruHashMap r0 = new androidx.collection.internal.LruHashMap
            r2 = 1061158912(0x3f400000, float:0.75)
            r0.<init>(r1, r2)
            r3.map = r0
            androidx.collection.internal.Lock r0 = new androidx.collection.internal.Lock
            r0.<init>()
            r3.lock = r0
            return
        L22:
            r0 = 0
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "maxSize <= 0"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    private final int safeSizeOf(K r5, V r6) {
            r4 = this;
            int r0 = r4.sizeOf(r5, r6)
            if (r0 < 0) goto L8
            r1 = 1
            goto L9
        L8:
            r1 = 0
        L9:
            if (r1 == 0) goto Lc
            return r0
        Lc:
            r1 = 0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Negative size: "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r5)
            r3 = 61
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r6)
            java.lang.String r1 = r2.toString()
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r1 = r1.toString()
            r2.<init>(r1)
            throw r2
    }

    protected V create(K r2) {
            r1 = this;
            java.lang.String r0 = "key"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r0 = 0
            return r0
    }

    public final int createCount() {
            r6 = this;
            androidx.collection.internal.Lock r0 = r6.lock
            r1 = 0
            r2 = r0
            r3 = 0
            monitor-enter(r2)
            r4 = 0
            int r5 = r6.createCount     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r2)
            return r5
        Ld:
            r4 = move-exception
            monitor-exit(r2)
            throw r4
    }

    protected void entryRemoved(boolean r2, K r3, V r4, V r5) {
            r1 = this;
            java.lang.String r0 = "key"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "oldValue"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            return
    }

    public final void evictAll() {
            r1 = this;
            r0 = -1
            r1.trimToSize(r0)
            return
    }

    public final int evictionCount() {
            r6 = this;
            androidx.collection.internal.Lock r0 = r6.lock
            r1 = 0
            r2 = r0
            r3 = 0
            monitor-enter(r2)
            r4 = 0
            int r5 = r6.evictionCount     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r2)
            return r5
        Ld:
            r4 = move-exception
            monitor-exit(r2)
            throw r4
    }

    public final V get(K r10) {
            r9 = this;
            java.lang.String r0 = "key"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            r0 = 0
            androidx.collection.internal.Lock r1 = r9.lock
            r2 = 0
            r3 = r1
            r4 = 0
            monitor-enter(r3)
            r5 = 0
            androidx.collection.internal.LruHashMap<K, V> r6 = r9.map     // Catch: java.lang.Throwable -> L6d
            java.lang.Object r6 = r6.get(r10)     // Catch: java.lang.Throwable -> L6d
            r0 = r6
            if (r0 == 0) goto L20
            int r6 = r9.hitCount     // Catch: java.lang.Throwable -> L6d
            int r6 = r6 + 1
            r9.hitCount = r6     // Catch: java.lang.Throwable -> L6d
            monitor-exit(r3)
            return r0
        L20:
            int r6 = r9.missCount     // Catch: java.lang.Throwable -> L6d
            int r6 = r6 + 1
            r9.missCount = r6     // Catch: java.lang.Throwable -> L6d
            monitor-exit(r3)
            java.lang.Object r1 = r9.create(r10)
            if (r1 != 0) goto L30
            r1 = 0
            return r1
        L30:
            androidx.collection.internal.Lock r2 = r9.lock
            r3 = 0
            r4 = r2
            r5 = 0
            monitor-enter(r4)
            r6 = 0
            int r7 = r9.createCount     // Catch: java.lang.Throwable -> L6a
            int r7 = r7 + 1
            r9.createCount = r7     // Catch: java.lang.Throwable -> L6a
            androidx.collection.internal.LruHashMap<K, V> r7 = r9.map     // Catch: java.lang.Throwable -> L6a
            java.lang.Object r7 = r7.put(r10, r1)     // Catch: java.lang.Throwable -> L6a
            r0 = r7
            if (r0 == 0) goto L4d
            androidx.collection.internal.LruHashMap<K, V> r7 = r9.map     // Catch: java.lang.Throwable -> L6a
            r7.put(r10, r0)     // Catch: java.lang.Throwable -> L6a
            goto L58
        L4d:
            int r7 = r9.size     // Catch: java.lang.Throwable -> L6a
            int r8 = r9.safeSizeOf(r10, r1)     // Catch: java.lang.Throwable -> L6a
            int r7 = r7 + r8
            r9.size = r7     // Catch: java.lang.Throwable -> L6a
            kotlin.Unit r7 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L6a
        L58:
            monitor-exit(r4)
            if (r0 == 0) goto L63
            r2 = 0
            r9.entryRemoved(r2, r10, r1, r0)
            r2 = r0
            goto L69
        L63:
            int r2 = r9.maxSize
            r9.trimToSize(r2)
            r2 = r1
        L69:
            return r2
        L6a:
            r6 = move-exception
            monitor-exit(r4)
            throw r6
        L6d:
            r5 = move-exception
            monitor-exit(r3)
            throw r5
    }

    public final int hitCount() {
            r6 = this;
            androidx.collection.internal.Lock r0 = r6.lock
            r1 = 0
            r2 = r0
            r3 = 0
            monitor-enter(r2)
            r4 = 0
            int r5 = r6.hitCount     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r2)
            return r5
        Ld:
            r4 = move-exception
            monitor-exit(r2)
            throw r4
    }

    public final int maxSize() {
            r6 = this;
            androidx.collection.internal.Lock r0 = r6.lock
            r1 = 0
            r2 = r0
            r3 = 0
            monitor-enter(r2)
            r4 = 0
            int r5 = r6.maxSize     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r2)
            return r5
        Ld:
            r4 = move-exception
            monitor-exit(r2)
            throw r4
    }

    public final int missCount() {
            r6 = this;
            androidx.collection.internal.Lock r0 = r6.lock
            r1 = 0
            r2 = r0
            r3 = 0
            monitor-enter(r2)
            r4 = 0
            int r5 = r6.missCount     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r2)
            return r5
        Ld:
            r4 = move-exception
            monitor-exit(r2)
            throw r4
    }

    public final V put(K r9, V r10) {
            r8 = this;
            java.lang.String r0 = "key"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r0 = "value"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            r0 = 0
            androidx.collection.internal.Lock r1 = r8.lock
            r2 = 0
            r3 = r1
            r4 = 0
            monitor-enter(r3)
            r5 = 0
            int r6 = r8.putCount     // Catch: java.lang.Throwable -> L45
            int r6 = r6 + 1
            r8.putCount = r6     // Catch: java.lang.Throwable -> L45
            int r6 = r8.size     // Catch: java.lang.Throwable -> L45
            int r7 = r8.safeSizeOf(r9, r10)     // Catch: java.lang.Throwable -> L45
            int r6 = r6 + r7
            r8.size = r6     // Catch: java.lang.Throwable -> L45
            androidx.collection.internal.LruHashMap<K, V> r6 = r8.map     // Catch: java.lang.Throwable -> L45
            java.lang.Object r6 = r6.put(r9, r10)     // Catch: java.lang.Throwable -> L45
            r0 = r6
            if (r0 == 0) goto L34
            int r6 = r8.size     // Catch: java.lang.Throwable -> L45
            int r7 = r8.safeSizeOf(r9, r0)     // Catch: java.lang.Throwable -> L45
            int r6 = r6 - r7
            r8.size = r6     // Catch: java.lang.Throwable -> L45
        L34:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L45
            monitor-exit(r3)
            if (r0 == 0) goto L3f
            r1 = 0
            r8.entryRemoved(r1, r9, r0, r10)
        L3f:
            int r1 = r8.maxSize
            r8.trimToSize(r1)
            return r0
        L45:
            r5 = move-exception
            monitor-exit(r3)
            throw r5
    }

    public final int putCount() {
            r6 = this;
            androidx.collection.internal.Lock r0 = r6.lock
            r1 = 0
            r2 = r0
            r3 = 0
            monitor-enter(r2)
            r4 = 0
            int r5 = r6.putCount     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r2)
            return r5
        Ld:
            r4 = move-exception
            monitor-exit(r2)
            throw r4
    }

    public final V remove(K r9) {
            r8 = this;
            java.lang.String r0 = "key"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            r0 = 0
            androidx.collection.internal.Lock r1 = r8.lock
            r2 = 0
            r3 = r1
            r4 = 0
            monitor-enter(r3)
            r5 = 0
            androidx.collection.internal.LruHashMap<K, V> r6 = r8.map     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r6 = r6.remove(r9)     // Catch: java.lang.Throwable -> L2d
            r0 = r6
            if (r0 == 0) goto L20
            int r6 = r8.size     // Catch: java.lang.Throwable -> L2d
            int r7 = r8.safeSizeOf(r9, r0)     // Catch: java.lang.Throwable -> L2d
            int r6 = r6 - r7
            r8.size = r6     // Catch: java.lang.Throwable -> L2d
        L20:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L2d
            monitor-exit(r3)
            if (r0 == 0) goto L2c
            r1 = 0
            r2 = 0
            r8.entryRemoved(r1, r9, r0, r2)
        L2c:
            return r0
        L2d:
            r5 = move-exception
            monitor-exit(r3)
            throw r5
    }

    public void resize(int r6) {
            r5 = this;
            if (r6 <= 0) goto L4
            r0 = 1
            goto L5
        L4:
            r0 = 0
        L5:
            if (r0 == 0) goto L1d
            androidx.collection.internal.Lock r0 = r5.lock
            r1 = 0
            r2 = r0
            r3 = 0
            monitor-enter(r2)
            r4 = 0
            r5.maxSize = r6     // Catch: java.lang.Throwable -> L1a
            kotlin.Unit r4 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L1a
            monitor-exit(r2)
            r5.trimToSize(r6)
            return
        L1a:
            r4 = move-exception
            monitor-exit(r2)
            throw r4
        L1d:
            r0 = 0
            java.lang.String r0 = "maxSize <= 0"
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
    }

    public final int size() {
            r6 = this;
            androidx.collection.internal.Lock r0 = r6.lock
            r1 = 0
            r2 = r0
            r3 = 0
            monitor-enter(r2)
            r4 = 0
            int r5 = r6.size     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r2)
            return r5
        Ld:
            r4 = move-exception
            monitor-exit(r2)
            throw r4
    }

    protected int sizeOf(K r2, V r3) {
            r1 = this;
            java.lang.String r0 = "key"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "value"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = 1
            return r0
    }

    public final java.util.Map<K, V> snapshot() {
            r14 = this;
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            androidx.collection.internal.Lock r1 = r14.lock
            r2 = 0
            r3 = r1
            r4 = 0
            monitor-enter(r3)
            r5 = 0
            androidx.collection.internal.LruHashMap<K, V> r6 = r14.map     // Catch: java.lang.Throwable -> L43
            java.util.Set r6 = r6.getEntries()     // Catch: java.lang.Throwable -> L43
            java.lang.Iterable r6 = (java.lang.Iterable) r6     // Catch: java.lang.Throwable -> L43
            r7 = 0
            java.util.Iterator r8 = r6.iterator()     // Catch: java.lang.Throwable -> L43
        L1a:
            boolean r9 = r8.hasNext()     // Catch: java.lang.Throwable -> L43
            if (r9 == 0) goto L39
            java.lang.Object r9 = r8.next()     // Catch: java.lang.Throwable -> L43
            r10 = r9
            java.util.Map$Entry r10 = (java.util.Map.Entry) r10     // Catch: java.lang.Throwable -> L43
            r11 = 0
            java.lang.Object r12 = r10.getKey()     // Catch: java.lang.Throwable -> L43
            java.lang.Object r10 = r10.getValue()     // Catch: java.lang.Throwable -> L43
            r13 = r0
            java.util.Map r13 = (java.util.Map) r13     // Catch: java.lang.Throwable -> L43
            r13.put(r12, r10)     // Catch: java.lang.Throwable -> L43
            goto L1a
        L39:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L43
            monitor-exit(r3)
            r1 = r0
            java.util.Map r1 = (java.util.Map) r1
            return r1
        L43:
            r5 = move-exception
            monitor-exit(r3)
            throw r5
    }

    public java.lang.String toString() {
            r9 = this;
            androidx.collection.internal.Lock r0 = r9.lock
            r1 = 0
            r2 = r0
            r3 = 0
            monitor-enter(r2)
            r4 = 0
            int r5 = r9.hitCount     // Catch: java.lang.Throwable -> L57
            int r6 = r9.missCount     // Catch: java.lang.Throwable -> L57
            int r5 = r5 + r6
            if (r5 == 0) goto L15
            int r6 = r9.hitCount     // Catch: java.lang.Throwable -> L57
            int r6 = r6 * 100
            int r6 = r6 / r5
            goto L16
        L15:
            r6 = 0
        L16:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L57
            r7.<init>()     // Catch: java.lang.Throwable -> L57
            java.lang.String r8 = "LruCache[maxSize="
            java.lang.StringBuilder r7 = r7.append(r8)     // Catch: java.lang.Throwable -> L57
            int r8 = r9.maxSize     // Catch: java.lang.Throwable -> L57
            java.lang.StringBuilder r7 = r7.append(r8)     // Catch: java.lang.Throwable -> L57
            java.lang.String r8 = ",hits="
            java.lang.StringBuilder r7 = r7.append(r8)     // Catch: java.lang.Throwable -> L57
            int r8 = r9.hitCount     // Catch: java.lang.Throwable -> L57
            java.lang.StringBuilder r7 = r7.append(r8)     // Catch: java.lang.Throwable -> L57
            java.lang.String r8 = ",misses="
            java.lang.StringBuilder r7 = r7.append(r8)     // Catch: java.lang.Throwable -> L57
            int r8 = r9.missCount     // Catch: java.lang.Throwable -> L57
            java.lang.StringBuilder r7 = r7.append(r8)     // Catch: java.lang.Throwable -> L57
            java.lang.String r8 = ",hitRate="
            java.lang.StringBuilder r7 = r7.append(r8)     // Catch: java.lang.Throwable -> L57
            java.lang.StringBuilder r7 = r7.append(r6)     // Catch: java.lang.Throwable -> L57
            java.lang.String r8 = "%]"
            java.lang.StringBuilder r7 = r7.append(r8)     // Catch: java.lang.Throwable -> L57
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L57
            monitor-exit(r2)
            return r7
        L57:
            r4 = move-exception
            monitor-exit(r2)
            throw r4
    }

    public void trimToSize(int r12) {
            r11 = this;
        L1:
            r0 = 0
            r1 = 0
            androidx.collection.internal.Lock r2 = r11.lock
            r3 = 0
            r4 = r2
            r5 = 0
            monitor-enter(r4)
            r6 = 0
            int r7 = r11.size     // Catch: java.lang.Throwable -> L75
            r8 = 1
            if (r7 < 0) goto L1f
            androidx.collection.internal.LruHashMap<K, V> r7 = r11.map     // Catch: java.lang.Throwable -> L75
            boolean r7 = r7.isEmpty()     // Catch: java.lang.Throwable -> L75
            if (r7 == 0) goto L1d
            int r7 = r11.size     // Catch: java.lang.Throwable -> L75
            if (r7 != 0) goto L1f
        L1d:
            r7 = r8
            goto L20
        L1f:
            r7 = 0
        L20:
            if (r7 == 0) goto L68
            int r7 = r11.size     // Catch: java.lang.Throwable -> L75
            if (r7 <= r12) goto L65
            androidx.collection.internal.LruHashMap<K, V> r7 = r11.map     // Catch: java.lang.Throwable -> L75
            boolean r7 = r7.isEmpty()     // Catch: java.lang.Throwable -> L75
            if (r7 == 0) goto L2f
            goto L65
        L2f:
            androidx.collection.internal.LruHashMap<K, V> r7 = r11.map     // Catch: java.lang.Throwable -> L75
            java.util.Set r7 = r7.getEntries()     // Catch: java.lang.Throwable -> L75
            java.lang.Iterable r7 = (java.lang.Iterable) r7     // Catch: java.lang.Throwable -> L75
            java.lang.Object r7 = kotlin.collections.CollectionsKt.firstOrNull(r7)     // Catch: java.lang.Throwable -> L75
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7     // Catch: java.lang.Throwable -> L75
            if (r7 != 0) goto L41
            monitor-exit(r4)
            return
        L41:
            java.lang.Object r9 = r7.getKey()     // Catch: java.lang.Throwable -> L75
            r0 = r9
            java.lang.Object r9 = r7.getValue()     // Catch: java.lang.Throwable -> L75
            r1 = r9
            androidx.collection.internal.LruHashMap<K, V> r9 = r11.map     // Catch: java.lang.Throwable -> L75
            r9.remove(r0)     // Catch: java.lang.Throwable -> L75
            int r9 = r11.size     // Catch: java.lang.Throwable -> L75
            int r10 = r11.safeSizeOf(r0, r1)     // Catch: java.lang.Throwable -> L75
            int r9 = r9 - r10
            r11.size = r9     // Catch: java.lang.Throwable -> L75
            int r9 = r11.evictionCount     // Catch: java.lang.Throwable -> L75
            int r9 = r9 + r8
            r11.evictionCount = r9     // Catch: java.lang.Throwable -> L75
            monitor-exit(r4)
            r2 = 0
            r11.entryRemoved(r8, r0, r1, r2)
            goto L1
        L65:
            monitor-exit(r4)
            return
        L68:
            r7 = 0
            java.lang.String r8 = "LruCache.sizeOf() is reporting inconsistent results!"
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L75
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L75
            r7.<init>(r8)     // Catch: java.lang.Throwable -> L75
            throw r7     // Catch: java.lang.Throwable -> L75
        L75:
            r6 = move-exception
            monitor-exit(r4)
            throw r6
    }
}
