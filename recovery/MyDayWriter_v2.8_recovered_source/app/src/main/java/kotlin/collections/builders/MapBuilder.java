package kotlin.collections.builders;

/* JADX INFO: compiled from: MapBuilder.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\b\n\u0002\u0010#\n\u0002\u0010'\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u001f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010&\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 \u0081\u0001*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u00032\u00060\u0004j\u0002`\u0005:\f\u0081\u0001\u0082\u0001\u0083\u0001\u0084\u0001\u0085\u0001\u0086\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0006B\u000f\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tBE\b\u0002\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u000b\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\b\u0012\u0006\u0010\u0011\u001a\u00020\b¢\u0006\u0002\u0010\u0012J\u0017\u00103\u001a\u00020\b2\u0006\u00104\u001a\u00028\u0000H\u0000¢\u0006\u0004\b5\u00106J\u0013\u00107\u001a\b\u0012\u0004\u0012\u00028\u00010\u000bH\u0002¢\u0006\u0002\u00108J\u0012\u00109\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010:J\r\u0010;\u001a\u00020<H\u0000¢\u0006\u0002\b=J\b\u0010>\u001a\u00020<H\u0016J\u0010\u0010?\u001a\u00020<2\u0006\u0010@\u001a\u00020!H\u0002J\u0019\u0010A\u001a\u00020!2\n\u0010B\u001a\u0006\u0012\u0002\b\u00030CH\u0000¢\u0006\u0002\bDJ!\u0010E\u001a\u00020!2\u0012\u0010F\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010GH\u0000¢\u0006\u0002\bHJ\u0015\u0010I\u001a\u00020!2\u0006\u00104\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010JJ\u0015\u0010K\u001a\u00020!2\u0006\u0010L\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010JJ\u0018\u0010M\u001a\u00020!2\u000e\u0010N\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030:H\u0002J\u0010\u0010O\u001a\u00020<2\u0006\u0010P\u001a\u00020\bH\u0002J\u0010\u0010Q\u001a\u00020<2\u0006\u0010R\u001a\u00020\bH\u0002J\u0019\u0010S\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010TH\u0000¢\u0006\u0002\bUJ\u0013\u0010V\u001a\u00020!2\b\u0010N\u001a\u0004\u0018\u00010WH\u0096\u0002J\u0015\u0010X\u001a\u00020\b2\u0006\u00104\u001a\u00028\u0000H\u0002¢\u0006\u0002\u00106J\u0015\u0010Y\u001a\u00020\b2\u0006\u0010L\u001a\u00028\u0001H\u0002¢\u0006\u0002\u00106J\u0018\u0010Z\u001a\u0004\u0018\u00018\u00012\u0006\u00104\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010[J\u0015\u0010\\\u001a\u00020\b2\u0006\u00104\u001a\u00028\u0000H\u0002¢\u0006\u0002\u00106J\b\u0010]\u001a\u00020\bH\u0016J\b\u0010^\u001a\u00020!H\u0016J\u0019\u0010_\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010`H\u0000¢\u0006\u0002\baJ\u001f\u0010b\u001a\u0004\u0018\u00018\u00012\u0006\u00104\u001a\u00028\u00002\u0006\u0010L\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010cJ\u001e\u0010d\u001a\u00020<2\u0014\u0010e\u001a\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010:H\u0016J\"\u0010f\u001a\u00020!2\u0018\u0010e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010G0CH\u0002J\u001c\u0010g\u001a\u00020!2\u0012\u0010F\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010GH\u0002J\u0010\u0010h\u001a\u00020!2\u0006\u0010i\u001a\u00020\bH\u0002J\b\u0010j\u001a\u00020<H\u0002J\u0010\u0010k\u001a\u00020<2\u0006\u0010l\u001a\u00020\bH\u0002J\u0017\u0010m\u001a\u0004\u0018\u00018\u00012\u0006\u00104\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010[J!\u0010n\u001a\u00020!2\u0012\u0010F\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010GH\u0000¢\u0006\u0002\boJ\u0010\u0010p\u001a\u00020<2\u0006\u0010q\u001a\u00020\bH\u0002J\u0010\u0010r\u001a\u00020<2\u0006\u0010s\u001a\u00020\bH\u0002J\u0017\u0010t\u001a\u00020!2\u0006\u00104\u001a\u00028\u0000H\u0000¢\u0006\u0004\bu\u0010JJ\u0017\u0010v\u001a\u00020!2\u0006\u0010w\u001a\u00028\u0001H\u0000¢\u0006\u0004\bx\u0010JJ\u0010\u0010y\u001a\u00020!2\u0006\u0010z\u001a\u00020\bH\u0002J\b\u0010{\u001a\u00020|H\u0016J\u0019\u0010}\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010~H\u0000¢\u0006\u0002\b\u007fJ\t\u0010\u0080\u0001\u001a\u00020WH\u0002R\u0014\u0010\u0013\u001a\u00020\b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R&\u0010\u0016\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00180\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0015R\u001e\u0010\"\u001a\u00020!2\u0006\u0010 \u001a\u00020!@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010\u001aR\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bX\u0082\u000e¢\u0006\u0004\n\u0002\u0010'R\u0016\u0010(\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010)X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010+\u001a\u00020\b2\u0006\u0010 \u001a\u00020\b@RX\u0096\u000e¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u0015R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00010.8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u00100R\u0018\u0010\f\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0004\n\u0002\u0010'R\u0016\u00101\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u000102X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0087\u0001"}, d2 = {"Lkotlin/collections/builders/MapBuilder;", "K", "V", "", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "()V", "initialCapacity", "", "(I)V", "keysArray", "", "valuesArray", "presenceArray", "", "hashArray", "maxProbeDistance", "length", "([Ljava/lang/Object;[Ljava/lang/Object;[I[III)V", "capacity", "getCapacity$kotlin_stdlib", "()I", "entries", "", "", "getEntries", "()Ljava/util/Set;", "entriesView", "Lkotlin/collections/builders/MapBuilderEntries;", "hashShift", "hashSize", "getHashSize", "<set-?>", "", "isReadOnly", "isReadOnly$kotlin_stdlib", "()Z", "keys", "getKeys", "[Ljava/lang/Object;", "keysView", "Lkotlin/collections/builders/MapBuilderKeys;", "modCount", "size", "getSize", "values", "", "getValues", "()Ljava/util/Collection;", "valuesView", "Lkotlin/collections/builders/MapBuilderValues;", "addKey", "key", "addKey$kotlin_stdlib", "(Ljava/lang/Object;)I", "allocateValuesArray", "()[Ljava/lang/Object;", "build", "", "checkIsMutable", "", "checkIsMutable$kotlin_stdlib", "clear", "compact", "updateHashArray", "containsAllEntries", "m", "", "containsAllEntries$kotlin_stdlib", "containsEntry", "entry", "", "containsEntry$kotlin_stdlib", "containsKey", "(Ljava/lang/Object;)Z", "containsValue", "value", "contentEquals", "other", "ensureCapacity", "minCapacity", "ensureExtraCapacity", "n", "entriesIterator", "Lkotlin/collections/builders/MapBuilder$EntriesItr;", "entriesIterator$kotlin_stdlib", "equals", "", "findKey", "findValue", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "hash", "hashCode", "isEmpty", "keysIterator", "Lkotlin/collections/builders/MapBuilder$KeysItr;", "keysIterator$kotlin_stdlib", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "putAll", "from", "putAllEntries", "putEntry", "putRehash", "i", "registerModification", "rehash", "newHashSize", "remove", "removeEntry", "removeEntry$kotlin_stdlib", "removeEntryAt", "index", "removeHashAt", "removedHash", "removeKey", "removeKey$kotlin_stdlib", "removeValue", "element", "removeValue$kotlin_stdlib", "shouldCompact", "extraCapacity", "toString", "", "valuesIterator", "Lkotlin/collections/builders/MapBuilder$ValuesItr;", "valuesIterator$kotlin_stdlib", "writeReplace", "Companion", "EntriesItr", "EntryRef", "Itr", "KeysItr", "ValuesItr", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class MapBuilder<K, V> implements java.util.Map<K, V>, java.io.Serializable, kotlin.jvm.internal.markers.KMutableMap {
    public static final kotlin.collections.builders.MapBuilder.Companion Companion = null;
    private static final kotlin.collections.builders.MapBuilder Empty = null;
    private static final int INITIAL_CAPACITY = 8;
    private static final int INITIAL_MAX_PROBE_DISTANCE = 2;
    private static final int MAGIC = -1640531527;
    private static final int TOMBSTONE = -1;
    private kotlin.collections.builders.MapBuilderEntries<K, V> entriesView;
    private int[] hashArray;
    private int hashShift;
    private boolean isReadOnly;
    private K[] keysArray;
    private kotlin.collections.builders.MapBuilderKeys<K> keysView;
    private int length;
    private int maxProbeDistance;
    private int modCount;
    private int[] presenceArray;
    private int size;
    private V[] valuesArray;
    private kotlin.collections.builders.MapBuilderValues<V> valuesView;

    /* JADX INFO: compiled from: MapBuilder.kt */
    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\tH\u0002J\u0010\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\tH\u0002R \u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lkotlin/collections/builders/MapBuilder$Companion;", "", "()V", "Empty", "Lkotlin/collections/builders/MapBuilder;", "", "getEmpty$kotlin_stdlib", "()Lkotlin/collections/builders/MapBuilder;", "INITIAL_CAPACITY", "", "INITIAL_MAX_PROBE_DISTANCE", "MAGIC", "TOMBSTONE", "computeHashSize", "capacity", "computeShift", "hashSize", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public static final /* synthetic */ int access$computeHashSize(kotlin.collections.builders.MapBuilder.Companion r1, int r2) {
                int r0 = r1.computeHashSize(r2)
                return r0
        }

        public static final /* synthetic */ int access$computeShift(kotlin.collections.builders.MapBuilder.Companion r1, int r2) {
                int r0 = r1.computeShift(r2)
                return r0
        }

        private final int computeHashSize(int r2) {
                r1 = this;
                r0 = 1
                int r0 = kotlin.ranges.RangesKt.coerceAtLeast(r2, r0)
                int r0 = r0 * 3
                int r0 = java.lang.Integer.highestOneBit(r0)
                return r0
        }

        private final int computeShift(int r2) {
                r1 = this;
                int r0 = java.lang.Integer.numberOfLeadingZeros(r2)
                int r0 = r0 + 1
                return r0
        }

        public final kotlin.collections.builders.MapBuilder getEmpty$kotlin_stdlib() {
                r1 = this;
                kotlin.collections.builders.MapBuilder r0 = kotlin.collections.builders.MapBuilder.access$getEmpty$cp()
                return r0
        }
    }

    /* JADX INFO: compiled from: MapBuilder.kt */
    @kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0002\u0010'\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u00032\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u00050\u0004B\u0019\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0007¢\u0006\u0002\u0010\bJ\u0015\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\nH\u0096\u0002J\u0012\u0010\u000b\u001a\u00020\f2\n\u0010\r\u001a\u00060\u000ej\u0002`\u000fJ\r\u0010\u0010\u001a\u00020\u0011H\u0000¢\u0006\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Lkotlin/collections/builders/MapBuilder$EntriesItr;", "K", "V", "Lkotlin/collections/builders/MapBuilder$Itr;", "", "", "map", "Lkotlin/collections/builders/MapBuilder;", "(Lkotlin/collections/builders/MapBuilder;)V", "next", "Lkotlin/collections/builders/MapBuilder$EntryRef;", "nextAppendString", "", "sb", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "nextHashCode", "", "nextHashCode$kotlin_stdlib", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class EntriesItr<K, V> extends kotlin.collections.builders.MapBuilder.Itr<K, V> implements java.util.Iterator<java.util.Map.Entry<K, V>>, kotlin.jvm.internal.markers.KMutableIterator {
        public EntriesItr(kotlin.collections.builders.MapBuilder<K, V> r2) {
                r1 = this;
                java.lang.String r0 = "map"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                r1.<init>(r2)
                return
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ java.lang.Object next() {
                r1 = this;
                kotlin.collections.builders.MapBuilder$EntryRef r0 = r1.next()
                return r0
        }

        @Override // java.util.Iterator
        public kotlin.collections.builders.MapBuilder.EntryRef<K, V> next() {
                r3 = this;
                r3.checkForComodification$kotlin_stdlib()
                int r0 = r3.getIndex$kotlin_stdlib()
                kotlin.collections.builders.MapBuilder r1 = r3.getMap$kotlin_stdlib()
                int r1 = kotlin.collections.builders.MapBuilder.access$getLength$p(r1)
                if (r0 >= r1) goto L2e
                int r0 = r3.getIndex$kotlin_stdlib()
                int r1 = r0 + 1
                r3.setIndex$kotlin_stdlib(r1)
                r3.setLastIndex$kotlin_stdlib(r0)
                kotlin.collections.builders.MapBuilder$EntryRef r0 = new kotlin.collections.builders.MapBuilder$EntryRef
                kotlin.collections.builders.MapBuilder r1 = r3.getMap$kotlin_stdlib()
                int r2 = r3.getLastIndex$kotlin_stdlib()
                r0.<init>(r1, r2)
                r3.initNext$kotlin_stdlib()
                return r0
            L2e:
                java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                r0.<init>()
                throw r0
        }

        public final void nextAppendString(java.lang.StringBuilder r5) {
                r4 = this;
                java.lang.String r0 = "sb"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                int r0 = r4.getIndex$kotlin_stdlib()
                kotlin.collections.builders.MapBuilder r1 = r4.getMap$kotlin_stdlib()
                int r1 = kotlin.collections.builders.MapBuilder.access$getLength$p(r1)
                if (r0 >= r1) goto L63
                int r0 = r4.getIndex$kotlin_stdlib()
                int r1 = r0 + 1
                r4.setIndex$kotlin_stdlib(r1)
                r4.setLastIndex$kotlin_stdlib(r0)
                kotlin.collections.builders.MapBuilder r0 = r4.getMap$kotlin_stdlib()
                java.lang.Object[] r0 = kotlin.collections.builders.MapBuilder.access$getKeysArray$p(r0)
                int r1 = r4.getLastIndex$kotlin_stdlib()
                r0 = r0[r1]
                kotlin.collections.builders.MapBuilder r1 = r4.getMap$kotlin_stdlib()
                java.lang.String r2 = "(this Map)"
                if (r0 != r1) goto L39
                r5.append(r2)
                goto L3c
            L39:
                r5.append(r0)
            L3c:
                r1 = 61
                r5.append(r1)
                kotlin.collections.builders.MapBuilder r1 = r4.getMap$kotlin_stdlib()
                java.lang.Object[] r1 = kotlin.collections.builders.MapBuilder.access$getValuesArray$p(r1)
                kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
                int r3 = r4.getLastIndex$kotlin_stdlib()
                r1 = r1[r3]
                kotlin.collections.builders.MapBuilder r3 = r4.getMap$kotlin_stdlib()
                if (r1 != r3) goto L5c
                r5.append(r2)
                goto L5f
            L5c:
                r5.append(r1)
            L5f:
                r4.initNext$kotlin_stdlib()
                return
            L63:
                java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                r0.<init>()
                throw r0
        }

        public final int nextHashCode$kotlin_stdlib() {
                r4 = this;
                int r0 = r4.getIndex$kotlin_stdlib()
                kotlin.collections.builders.MapBuilder r1 = r4.getMap$kotlin_stdlib()
                int r1 = kotlin.collections.builders.MapBuilder.access$getLength$p(r1)
                if (r0 >= r1) goto L4d
                int r0 = r4.getIndex$kotlin_stdlib()
                int r1 = r0 + 1
                r4.setIndex$kotlin_stdlib(r1)
                r4.setLastIndex$kotlin_stdlib(r0)
                kotlin.collections.builders.MapBuilder r0 = r4.getMap$kotlin_stdlib()
                java.lang.Object[] r0 = kotlin.collections.builders.MapBuilder.access$getKeysArray$p(r0)
                int r1 = r4.getLastIndex$kotlin_stdlib()
                r0 = r0[r1]
                r1 = 0
                if (r0 == 0) goto L30
                int r0 = r0.hashCode()
                goto L31
            L30:
                r0 = r1
            L31:
                kotlin.collections.builders.MapBuilder r2 = r4.getMap$kotlin_stdlib()
                java.lang.Object[] r2 = kotlin.collections.builders.MapBuilder.access$getValuesArray$p(r2)
                kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
                int r3 = r4.getLastIndex$kotlin_stdlib()
                r2 = r2[r3]
                if (r2 == 0) goto L48
                int r1 = r2.hashCode()
            L48:
                r0 = r0 ^ r1
                r4.initNext$kotlin_stdlib()
                return r0
            L4d:
                java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                r0.<init>()
                throw r0
        }
    }

    /* JADX INFO: compiled from: MapBuilder.kt */
    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u0003B!\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0007H\u0016J\u0015\u0010\u0013\u001a\u00028\u00032\u0006\u0010\u0014\u001a\u00028\u0003H\u0016¢\u0006\u0002\u0010\u0015J\b\u0010\u0016\u001a\u00020\u0017H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00028\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00028\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000b¨\u0006\u0018"}, d2 = {"Lkotlin/collections/builders/MapBuilder$EntryRef;", "K", "V", "", "map", "Lkotlin/collections/builders/MapBuilder;", "index", "", "(Lkotlin/collections/builders/MapBuilder;I)V", "key", "getKey", "()Ljava/lang/Object;", "value", "getValue", "equals", "", "other", "", "hashCode", "setValue", "newValue", "(Ljava/lang/Object;)Ljava/lang/Object;", "toString", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class EntryRef<K, V> implements java.util.Map.Entry<K, V>, kotlin.jvm.internal.markers.KMutableMap.Entry {
        private final int index;
        private final kotlin.collections.builders.MapBuilder<K, V> map;

        public EntryRef(kotlin.collections.builders.MapBuilder<K, V> r2, int r3) {
                r1 = this;
                java.lang.String r0 = "map"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                r1.<init>()
                r1.map = r2
                r1.index = r3
                return
        }

        @Override // java.util.Map.Entry
        public boolean equals(java.lang.Object r3) {
                r2 = this;
                boolean r0 = r3 instanceof java.util.Map.Entry
                if (r0 == 0) goto L28
                r0 = r3
                java.util.Map$Entry r0 = (java.util.Map.Entry) r0
                java.lang.Object r0 = r0.getKey()
                java.lang.Object r1 = r2.getKey()
                boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
                if (r0 == 0) goto L28
                r0 = r3
                java.util.Map$Entry r0 = (java.util.Map.Entry) r0
                java.lang.Object r0 = r0.getValue()
                java.lang.Object r1 = r2.getValue()
                boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
                if (r0 == 0) goto L28
                r0 = 1
                goto L29
            L28:
                r0 = 0
            L29:
                return r0
        }

        @Override // java.util.Map.Entry
        public K getKey() {
                r2 = this;
                kotlin.collections.builders.MapBuilder<K, V> r0 = r2.map
                java.lang.Object[] r0 = kotlin.collections.builders.MapBuilder.access$getKeysArray$p(r0)
                int r1 = r2.index
                r0 = r0[r1]
                return r0
        }

        @Override // java.util.Map.Entry
        public V getValue() {
                r2 = this;
                kotlin.collections.builders.MapBuilder<K, V> r0 = r2.map
                java.lang.Object[] r0 = kotlin.collections.builders.MapBuilder.access$getValuesArray$p(r0)
                kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
                int r1 = r2.index
                r0 = r0[r1]
                return r0
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
                r3 = this;
                java.lang.Object r0 = r3.getKey()
                r1 = 0
                if (r0 == 0) goto Lc
                int r0 = r0.hashCode()
                goto Ld
            Lc:
                r0 = r1
            Ld:
                java.lang.Object r2 = r3.getValue()
                if (r2 == 0) goto L17
                int r1 = r2.hashCode()
            L17:
                r0 = r0 ^ r1
                return r0
        }

        @Override // java.util.Map.Entry
        public V setValue(V r4) {
                r3 = this;
                kotlin.collections.builders.MapBuilder<K, V> r0 = r3.map
                r0.checkIsMutable$kotlin_stdlib()
                kotlin.collections.builders.MapBuilder<K, V> r0 = r3.map
                java.lang.Object[] r0 = kotlin.collections.builders.MapBuilder.access$allocateValuesArray(r0)
                int r1 = r3.index
                r1 = r0[r1]
                int r2 = r3.index
                r0[r2] = r4
                return r1
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.Object r1 = r2.getKey()
                java.lang.StringBuilder r0 = r0.append(r1)
                r1 = 61
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.Object r1 = r2.getValue()
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* JADX INFO: compiled from: MapBuilder.kt */
    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0010\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u00020\u0003B\u0019\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0005¢\u0006\u0002\u0010\u0006J\r\u0010\u0013\u001a\u00020\u0014H\u0000¢\u0006\u0002\b\u0015J\u0006\u0010\u0016\u001a\u00020\u0017J\r\u0010\u0018\u001a\u00020\u0014H\u0000¢\u0006\u0002\b\u0019J\u0006\u0010\u001a\u001a\u00020\u0014R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u00020\bX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\bX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\rR \u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001b"}, d2 = {"Lkotlin/collections/builders/MapBuilder$Itr;", "K", "V", "", "map", "Lkotlin/collections/builders/MapBuilder;", "(Lkotlin/collections/builders/MapBuilder;)V", "expectedModCount", "", "index", "getIndex$kotlin_stdlib", "()I", "setIndex$kotlin_stdlib", "(I)V", "lastIndex", "getLastIndex$kotlin_stdlib", "setLastIndex$kotlin_stdlib", "getMap$kotlin_stdlib", "()Lkotlin/collections/builders/MapBuilder;", "checkForComodification", "", "checkForComodification$kotlin_stdlib", "hasNext", "", "initNext", "initNext$kotlin_stdlib", "remove", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static class Itr<K, V> {
        private int expectedModCount;
        private int index;
        private int lastIndex;
        private final kotlin.collections.builders.MapBuilder<K, V> map;

        public Itr(kotlin.collections.builders.MapBuilder<K, V> r2) {
                r1 = this;
                java.lang.String r0 = "map"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                r1.<init>()
                r1.map = r2
                r0 = -1
                r1.lastIndex = r0
                kotlin.collections.builders.MapBuilder<K, V> r0 = r1.map
                int r0 = kotlin.collections.builders.MapBuilder.access$getModCount$p(r0)
                r1.expectedModCount = r0
                r1.initNext$kotlin_stdlib()
                return
        }

        public final void checkForComodification$kotlin_stdlib() {
                r2 = this;
                kotlin.collections.builders.MapBuilder<K, V> r0 = r2.map
                int r0 = kotlin.collections.builders.MapBuilder.access$getModCount$p(r0)
                int r1 = r2.expectedModCount
                if (r0 != r1) goto Lb
                return
            Lb:
                java.util.ConcurrentModificationException r0 = new java.util.ConcurrentModificationException
                r0.<init>()
                throw r0
        }

        public final int getIndex$kotlin_stdlib() {
                r1 = this;
                int r0 = r1.index
                return r0
        }

        public final int getLastIndex$kotlin_stdlib() {
                r1 = this;
                int r0 = r1.lastIndex
                return r0
        }

        public final kotlin.collections.builders.MapBuilder<K, V> getMap$kotlin_stdlib() {
                r1 = this;
                kotlin.collections.builders.MapBuilder<K, V> r0 = r1.map
                return r0
        }

        public final boolean hasNext() {
                r2 = this;
                int r0 = r2.index
                kotlin.collections.builders.MapBuilder<K, V> r1 = r2.map
                int r1 = kotlin.collections.builders.MapBuilder.access$getLength$p(r1)
                if (r0 >= r1) goto Lc
                r0 = 1
                goto Ld
            Lc:
                r0 = 0
            Ld:
                return r0
        }

        public final void initNext$kotlin_stdlib() {
                r2 = this;
            L1:
                int r0 = r2.index
                kotlin.collections.builders.MapBuilder<K, V> r1 = r2.map
                int r1 = kotlin.collections.builders.MapBuilder.access$getLength$p(r1)
                if (r0 >= r1) goto L1e
                kotlin.collections.builders.MapBuilder<K, V> r0 = r2.map
                int[] r0 = kotlin.collections.builders.MapBuilder.access$getPresenceArray$p(r0)
                int r1 = r2.index
                r0 = r0[r1]
                if (r0 >= 0) goto L1e
                int r0 = r2.index
                int r0 = r0 + 1
                r2.index = r0
                goto L1
            L1e:
                return
        }

        public final void remove() {
                r3 = this;
                r3.checkForComodification$kotlin_stdlib()
                int r0 = r3.lastIndex
                r1 = -1
                if (r0 == r1) goto La
                r0 = 1
                goto Lb
            La:
                r0 = 0
            Lb:
                if (r0 == 0) goto L24
                kotlin.collections.builders.MapBuilder<K, V> r0 = r3.map
                r0.checkIsMutable$kotlin_stdlib()
                kotlin.collections.builders.MapBuilder<K, V> r0 = r3.map
                int r2 = r3.lastIndex
                kotlin.collections.builders.MapBuilder.access$removeEntryAt(r0, r2)
                r3.lastIndex = r1
                kotlin.collections.builders.MapBuilder<K, V> r0 = r3.map
                int r0 = kotlin.collections.builders.MapBuilder.access$getModCount$p(r0)
                r3.expectedModCount = r0
                return
            L24:
                r0 = 0
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "Call next() before removing element from the iterator."
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
        }

        public final void setIndex$kotlin_stdlib(int r1) {
                r0 = this;
                r0.index = r1
                return
        }

        public final void setLastIndex$kotlin_stdlib(int r1) {
                r0 = this;
                r0.lastIndex = r1
                return
        }
    }

    /* JADX INFO: compiled from: MapBuilder.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u00032\b\u0012\u0004\u0012\u0002H\u00010\u0004B\u0019\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0006¢\u0006\u0002\u0010\u0007J\u000e\u0010\b\u001a\u00028\u0002H\u0096\u0002¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"Lkotlin/collections/builders/MapBuilder$KeysItr;", "K", "V", "Lkotlin/collections/builders/MapBuilder$Itr;", "", "map", "Lkotlin/collections/builders/MapBuilder;", "(Lkotlin/collections/builders/MapBuilder;)V", "next", "()Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class KeysItr<K, V> extends kotlin.collections.builders.MapBuilder.Itr<K, V> implements java.util.Iterator<K>, kotlin.jvm.internal.markers.KMutableIterator {
        public KeysItr(kotlin.collections.builders.MapBuilder<K, V> r2) {
                r1 = this;
                java.lang.String r0 = "map"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                r1.<init>(r2)
                return
        }

        @Override // java.util.Iterator
        public K next() {
                r2 = this;
                r2.checkForComodification$kotlin_stdlib()
                int r0 = r2.getIndex$kotlin_stdlib()
                kotlin.collections.builders.MapBuilder r1 = r2.getMap$kotlin_stdlib()
                int r1 = kotlin.collections.builders.MapBuilder.access$getLength$p(r1)
                if (r0 >= r1) goto L2f
                int r0 = r2.getIndex$kotlin_stdlib()
                int r1 = r0 + 1
                r2.setIndex$kotlin_stdlib(r1)
                r2.setLastIndex$kotlin_stdlib(r0)
                kotlin.collections.builders.MapBuilder r0 = r2.getMap$kotlin_stdlib()
                java.lang.Object[] r0 = kotlin.collections.builders.MapBuilder.access$getKeysArray$p(r0)
                int r1 = r2.getLastIndex$kotlin_stdlib()
                r0 = r0[r1]
                r2.initNext$kotlin_stdlib()
                return r0
            L2f:
                java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                r0.<init>()
                throw r0
        }
    }

    /* JADX INFO: compiled from: MapBuilder.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u00032\b\u0012\u0004\u0012\u0002H\u00020\u0004B\u0019\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0006¢\u0006\u0002\u0010\u0007J\u000e\u0010\b\u001a\u00028\u0003H\u0096\u0002¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"Lkotlin/collections/builders/MapBuilder$ValuesItr;", "K", "V", "Lkotlin/collections/builders/MapBuilder$Itr;", "", "map", "Lkotlin/collections/builders/MapBuilder;", "(Lkotlin/collections/builders/MapBuilder;)V", "next", "()Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ValuesItr<K, V> extends kotlin.collections.builders.MapBuilder.Itr<K, V> implements java.util.Iterator<V>, kotlin.jvm.internal.markers.KMutableIterator {
        public ValuesItr(kotlin.collections.builders.MapBuilder<K, V> r2) {
                r1 = this;
                java.lang.String r0 = "map"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                r1.<init>(r2)
                return
        }

        @Override // java.util.Iterator
        public V next() {
                r2 = this;
                r2.checkForComodification$kotlin_stdlib()
                int r0 = r2.getIndex$kotlin_stdlib()
                kotlin.collections.builders.MapBuilder r1 = r2.getMap$kotlin_stdlib()
                int r1 = kotlin.collections.builders.MapBuilder.access$getLength$p(r1)
                if (r0 >= r1) goto L32
                int r0 = r2.getIndex$kotlin_stdlib()
                int r1 = r0 + 1
                r2.setIndex$kotlin_stdlib(r1)
                r2.setLastIndex$kotlin_stdlib(r0)
                kotlin.collections.builders.MapBuilder r0 = r2.getMap$kotlin_stdlib()
                java.lang.Object[] r0 = kotlin.collections.builders.MapBuilder.access$getValuesArray$p(r0)
                kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
                int r1 = r2.getLastIndex$kotlin_stdlib()
                r0 = r0[r1]
                r2.initNext$kotlin_stdlib()
                return r0
            L32:
                java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                r0.<init>()
                throw r0
        }
    }

    static {
            kotlin.collections.builders.MapBuilder$Companion r0 = new kotlin.collections.builders.MapBuilder$Companion
            r1 = 0
            r0.<init>(r1)
            kotlin.collections.builders.MapBuilder.Companion = r0
            kotlin.collections.builders.MapBuilder r0 = new kotlin.collections.builders.MapBuilder
            r1 = 0
            r0.<init>(r1)
            r1 = r0
            r2 = 0
            r3 = 1
            r1.isReadOnly = r3
            kotlin.collections.builders.MapBuilder.Empty = r0
            return
    }

    public MapBuilder() {
            r1 = this;
            r0 = 8
            r1.<init>(r0)
            return
    }

    public MapBuilder(int r8) {
            r7 = this;
            java.lang.Object[] r1 = kotlin.collections.builders.ListBuilderKt.arrayOfUninitializedElements(r8)
            int[] r3 = new int[r8]
            kotlin.collections.builders.MapBuilder$Companion r0 = kotlin.collections.builders.MapBuilder.Companion
            int r0 = kotlin.collections.builders.MapBuilder.Companion.access$computeHashSize(r0, r8)
            int[] r4 = new int[r0]
            r2 = 0
            r5 = 2
            r6 = 0
            r0 = r7
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    private MapBuilder(K[] r3, V[] r4, int[] r5, int[] r6, int r7, int r8) {
            r2 = this;
            r2.<init>()
            r2.keysArray = r3
            r2.valuesArray = r4
            r2.presenceArray = r5
            r2.hashArray = r6
            r2.maxProbeDistance = r7
            r2.length = r8
            kotlin.collections.builders.MapBuilder$Companion r0 = kotlin.collections.builders.MapBuilder.Companion
            int r1 = r2.getHashSize()
            int r0 = kotlin.collections.builders.MapBuilder.Companion.access$computeShift(r0, r1)
            r2.hashShift = r0
            return
    }

    public static final /* synthetic */ java.lang.Object[] access$allocateValuesArray(kotlin.collections.builders.MapBuilder r1) {
            java.lang.Object[] r0 = r1.allocateValuesArray()
            return r0
    }

    public static final /* synthetic */ kotlin.collections.builders.MapBuilder access$getEmpty$cp() {
            kotlin.collections.builders.MapBuilder r0 = kotlin.collections.builders.MapBuilder.Empty
            return r0
    }

    public static final /* synthetic */ java.lang.Object[] access$getKeysArray$p(kotlin.collections.builders.MapBuilder r1) {
            K[] r0 = r1.keysArray
            return r0
    }

    public static final /* synthetic */ int access$getLength$p(kotlin.collections.builders.MapBuilder r1) {
            int r0 = r1.length
            return r0
    }

    public static final /* synthetic */ int access$getModCount$p(kotlin.collections.builders.MapBuilder r1) {
            int r0 = r1.modCount
            return r0
    }

    public static final /* synthetic */ int[] access$getPresenceArray$p(kotlin.collections.builders.MapBuilder r1) {
            int[] r0 = r1.presenceArray
            return r0
    }

    public static final /* synthetic */ java.lang.Object[] access$getValuesArray$p(kotlin.collections.builders.MapBuilder r1) {
            V[] r0 = r1.valuesArray
            return r0
    }

    public static final /* synthetic */ void access$removeEntryAt(kotlin.collections.builders.MapBuilder r0, int r1) {
            r0.removeEntryAt(r1)
            return
    }

    private final V[] allocateValuesArray() {
            r2 = this;
            V[] r0 = r2.valuesArray
            if (r0 == 0) goto L5
            return r0
        L5:
            int r1 = r2.getCapacity$kotlin_stdlib()
            java.lang.Object[] r1 = kotlin.collections.builders.ListBuilderKt.arrayOfUninitializedElements(r1)
            r2.valuesArray = r1
            return r1
    }

    private final void compact(boolean r7) {
            r6 = this;
            r0 = 0
            r1 = 0
            V[] r2 = r6.valuesArray
        L4:
            int r3 = r6.length
            if (r0 >= r3) goto L2e
            int[] r3 = r6.presenceArray
            r3 = r3[r0]
            if (r3 < 0) goto L2a
            K[] r4 = r6.keysArray
            K[] r5 = r6.keysArray
            r5 = r5[r0]
            r4[r1] = r5
            if (r2 == 0) goto L1c
            r4 = r2[r0]
            r2[r1] = r4
        L1c:
            if (r7 == 0) goto L28
            int[] r4 = r6.presenceArray
            r4[r1] = r3
            int[] r4 = r6.hashArray
            int r5 = r1 + 1
            r4[r3] = r5
        L28:
            int r1 = r1 + 1
        L2a:
            int r0 = r0 + 1
            goto L4
        L2e:
            K[] r3 = r6.keysArray
            int r4 = r6.length
            kotlin.collections.builders.ListBuilderKt.resetRange(r3, r1, r4)
            if (r2 == 0) goto L3c
            int r3 = r6.length
            kotlin.collections.builders.ListBuilderKt.resetRange(r2, r1, r3)
        L3c:
            r6.length = r1
            return
    }

    private final boolean contentEquals(java.util.Map<?, ?> r3) {
            r2 = this;
            int r0 = r2.size()
            int r1 = r3.size()
            if (r0 != r1) goto L18
            java.util.Set r0 = r3.entrySet()
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r2.containsAllEntries$kotlin_stdlib(r0)
            if (r0 == 0) goto L18
            r0 = 1
            goto L19
        L18:
            r0 = 0
        L19:
            return r0
    }

    private final void ensureCapacity(int r4) {
            r3 = this;
            if (r4 < 0) goto L43
            int r0 = r3.getCapacity$kotlin_stdlib()
            if (r4 <= r0) goto L42
            kotlin.collections.AbstractList$Companion r0 = kotlin.collections.AbstractList.Companion
            int r1 = r3.getCapacity$kotlin_stdlib()
            int r0 = r0.newCapacity$kotlin_stdlib(r1, r4)
            K[] r1 = r3.keysArray
            java.lang.Object[] r1 = kotlin.collections.builders.ListBuilderKt.copyOfUninitializedElements(r1, r0)
            r3.keysArray = r1
            V[] r1 = r3.valuesArray
            if (r1 == 0) goto L23
            java.lang.Object[] r1 = kotlin.collections.builders.ListBuilderKt.copyOfUninitializedElements(r1, r0)
            goto L24
        L23:
            r1 = 0
        L24:
            r3.valuesArray = r1
            int[] r1 = r3.presenceArray
            int[] r1 = java.util.Arrays.copyOf(r1, r0)
            java.lang.String r2 = "copyOf(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            r3.presenceArray = r1
            kotlin.collections.builders.MapBuilder$Companion r1 = kotlin.collections.builders.MapBuilder.Companion
            int r1 = kotlin.collections.builders.MapBuilder.Companion.access$computeHashSize(r1, r0)
            int r2 = r3.getHashSize()
            if (r1 <= r2) goto L42
            r3.rehash(r1)
        L42:
            return
        L43:
            java.lang.OutOfMemoryError r0 = new java.lang.OutOfMemoryError
            r0.<init>()
            throw r0
    }

    private final void ensureExtraCapacity(int r2) {
            r1 = this;
            boolean r0 = r1.shouldCompact(r2)
            if (r0 == 0) goto Lb
            r0 = 1
            r1.compact(r0)
            goto L11
        Lb:
            int r0 = r1.length
            int r0 = r0 + r2
            r1.ensureCapacity(r0)
        L11:
            return
    }

    private final int findKey(K r7) {
            r6 = this;
            int r0 = r6.hash(r7)
            int r1 = r6.maxProbeDistance
        L6:
            int[] r2 = r6.hashArray
            r2 = r2[r0]
            r3 = -1
            if (r2 != 0) goto Lf
            return r3
        Lf:
            if (r2 <= 0) goto L20
            K[] r4 = r6.keysArray
            int r5 = r2 + (-1)
            r4 = r4[r5]
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual(r4, r7)
            if (r4 == 0) goto L20
            int r3 = r2 + (-1)
            return r3
        L20:
            int r1 = r1 + (-1)
            if (r1 >= 0) goto L25
            return r3
        L25:
            int r3 = r0 + (-1)
            if (r0 != 0) goto L30
            int r0 = r6.getHashSize()
            int r0 = r0 + (-1)
            goto L6
        L30:
            r0 = r3
            goto L6
    }

    private final int findValue(V r3) {
            r2 = this;
            int r0 = r2.length
        L2:
            r1 = -1
            int r0 = r0 + r1
            if (r0 < 0) goto L1a
            int[] r1 = r2.presenceArray
            r1 = r1[r0]
            if (r1 < 0) goto L2
            V[] r1 = r2.valuesArray
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            r1 = r1[r0]
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            if (r1 == 0) goto L2
            return r0
        L1a:
            return r1
    }

    private final int getHashSize() {
            r1 = this;
            int[] r0 = r1.hashArray
            int r0 = r0.length
            return r0
    }

    private final int hash(K r3) {
            r2 = this;
            if (r3 == 0) goto L7
            int r0 = r3.hashCode()
            goto L8
        L7:
            r0 = 0
        L8:
            r1 = -1640531527(0xffffffff9e3779b9, float:-9.713111E-21)
            int r0 = r0 * r1
            int r1 = r2.hashShift
            int r0 = r0 >>> r1
            return r0
    }

    private final boolean putAllEntries(java.util.Collection<? extends java.util.Map.Entry<? extends K, ? extends V>> r4) {
            r3 = this;
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L8
            r0 = 0
            return r0
        L8:
            int r0 = r4.size()
            r3.ensureExtraCapacity(r0)
            java.util.Iterator r0 = r4.iterator()
            r1 = 0
        L14:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L28
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            boolean r2 = r3.putEntry(r2)
            if (r2 == 0) goto L14
            r1 = 1
            goto L14
        L28:
            return r1
    }

    private final boolean putEntry(java.util.Map.Entry<? extends K, ? extends V> r7) {
            r6 = this;
            java.lang.Object r0 = r7.getKey()
            int r0 = r6.addKey$kotlin_stdlib(r0)
            java.lang.Object[] r1 = r6.allocateValuesArray()
            r2 = 1
            if (r0 < 0) goto L16
            java.lang.Object r3 = r7.getValue()
            r1[r0] = r3
            return r2
        L16:
            int r3 = -r0
            int r3 = r3 - r2
            r3 = r1[r3]
            java.lang.Object r4 = r7.getValue()
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual(r4, r3)
            if (r4 != 0) goto L2d
            int r4 = -r0
            int r4 = r4 - r2
            java.lang.Object r5 = r7.getValue()
            r1[r4] = r5
            return r2
        L2d:
            r2 = 0
            return r2
    }

    private final boolean putRehash(int r7) {
            r6 = this;
            K[] r0 = r6.keysArray
            r0 = r0[r7]
            int r0 = r6.hash(r0)
            int r1 = r6.maxProbeDistance
        La:
            int[] r2 = r6.hashArray
            r2 = r2[r0]
            r3 = 1
            if (r2 != 0) goto L1d
            int[] r4 = r6.hashArray
            int r5 = r7 + 1
            r4[r0] = r5
            int[] r4 = r6.presenceArray
            r4[r7] = r0
            return r3
        L1d:
            int r1 = r1 + (-1)
            if (r1 >= 0) goto L23
            r3 = 0
            return r3
        L23:
            int r4 = r0 + (-1)
            if (r0 != 0) goto L2d
            int r0 = r6.getHashSize()
            int r0 = r0 - r3
            goto La
        L2d:
            r0 = r4
            goto La
    }

    private final void registerModification() {
            r1 = this;
            int r0 = r1.modCount
            int r0 = r0 + 1
            r1.modCount = r0
            return
    }

    private final void rehash(int r4) {
            r3 = this;
            r3.registerModification()
            int r0 = r3.length
            int r1 = r3.size()
            if (r0 <= r1) goto Lf
            r0 = 0
            r3.compact(r0)
        Lf:
            int[] r0 = new int[r4]
            r3.hashArray = r0
            kotlin.collections.builders.MapBuilder$Companion r0 = kotlin.collections.builders.MapBuilder.Companion
            int r0 = kotlin.collections.builders.MapBuilder.Companion.access$computeShift(r0, r4)
            r3.hashShift = r0
            r0 = 0
        L1c:
            int r1 = r3.length
            if (r0 >= r1) goto L33
            int r1 = r0 + 1
            boolean r0 = r3.putRehash(r0)
            if (r0 == 0) goto L2a
            r0 = r1
            goto L1c
        L2a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?"
            r0.<init>(r2)
            throw r0
        L33:
            return
    }

    private final void removeEntryAt(int r3) {
            r2 = this;
            K[] r0 = r2.keysArray
            kotlin.collections.builders.ListBuilderKt.resetAt(r0, r3)
            V[] r0 = r2.valuesArray
            if (r0 == 0) goto Lc
            kotlin.collections.builders.ListBuilderKt.resetAt(r0, r3)
        Lc:
            int[] r0 = r2.presenceArray
            r0 = r0[r3]
            r2.removeHashAt(r0)
            int[] r0 = r2.presenceArray
            r1 = -1
            r0[r3] = r1
            int r0 = r2.size()
            int r0 = r0 + r1
            r2.size = r0
            r2.registerModification()
            return
    }

    private final void removeHashAt(int r10) {
            r9 = this;
            r0 = r10
            r1 = r10
            r2 = 0
            int r3 = r9.maxProbeDistance
            int r3 = r3 * 2
            int r4 = r9.getHashSize()
            int r4 = r4 / 2
            int r3 = kotlin.ranges.RangesKt.coerceAtMost(r3, r4)
        L11:
            int r4 = r0 + (-1)
            if (r0 != 0) goto L1d
            int r0 = r9.getHashSize()
            int r0 = r0 + (-1)
            goto L1e
        L1d:
            r0 = r4
        L1e:
            int r2 = r2 + 1
            int r4 = r9.maxProbeDistance
            r5 = 0
            if (r2 <= r4) goto L2a
            int[] r4 = r9.hashArray
            r4[r1] = r5
            return
        L2a:
            int[] r4 = r9.hashArray
            r4 = r4[r0]
            if (r4 != 0) goto L35
            int[] r6 = r9.hashArray
            r6[r1] = r5
            return
        L35:
            r5 = -1
            if (r4 >= 0) goto L3f
            int[] r6 = r9.hashArray
            r6[r1] = r5
            r1 = r0
            r2 = 0
            goto L60
        L3f:
            K[] r6 = r9.keysArray
            int r7 = r4 + (-1)
            r6 = r6[r7]
            int r6 = r9.hash(r6)
            int r7 = r6 - r0
            int r8 = r9.getHashSize()
            int r8 = r8 + (-1)
            r7 = r7 & r8
            if (r7 < r2) goto L60
            int[] r7 = r9.hashArray
            r7[r1] = r4
            int[] r7 = r9.presenceArray
            int r8 = r4 + (-1)
            r7[r8] = r1
            r1 = r0
            r2 = 0
        L60:
            int r3 = r3 + (-1)
            if (r3 >= 0) goto L11
            int[] r6 = r9.hashArray
            r6[r1] = r5
            return
    }

    private final boolean shouldCompact(int r4) {
            r3 = this;
            int r0 = r3.getCapacity$kotlin_stdlib()
            int r1 = r3.length
            int r0 = r0 - r1
            int r1 = r3.length
            int r2 = r3.size()
            int r1 = r1 - r2
            if (r0 >= r4) goto L1e
            int r2 = r1 + r0
            if (r2 < r4) goto L1e
            int r2 = r3.getCapacity$kotlin_stdlib()
            int r2 = r2 / 4
            if (r1 < r2) goto L1e
            r2 = 1
            goto L1f
        L1e:
            r2 = 0
        L1f:
            return r2
    }

    private final java.lang.Object writeReplace() {
            r2 = this;
            boolean r0 = r2.isReadOnly
            if (r0 == 0) goto Ld
            kotlin.collections.builders.SerializedMap r0 = new kotlin.collections.builders.SerializedMap
            r1 = r2
            java.util.Map r1 = (java.util.Map) r1
            r0.<init>(r1)
            return r0
        Ld:
            java.io.NotSerializableException r0 = new java.io.NotSerializableException
            java.lang.String r1 = "The map cannot be serialized while it is being built."
            r0.<init>(r1)
            throw r0
    }

    public final int addKey$kotlin_stdlib(K r9) {
            r8 = this;
            r8.checkIsMutable$kotlin_stdlib()
        L3:
            int r0 = r8.hash(r9)
            int r1 = r8.maxProbeDistance
            int r1 = r1 * 2
            int r2 = r8.getHashSize()
            int r2 = r2 / 2
            int r1 = kotlin.ranges.RangesKt.coerceAtMost(r1, r2)
            r2 = 0
        L17:
            int[] r3 = r8.hashArray
            r3 = r3[r0]
            r4 = 1
            if (r3 > 0) goto L50
            int r5 = r8.length
            int r6 = r8.getCapacity$kotlin_stdlib()
            if (r5 < r6) goto L2b
            r8.ensureExtraCapacity(r4)
            goto L3
        L2b:
            int r5 = r8.length
            int r6 = r5 + 1
            r8.length = r6
            K[] r6 = r8.keysArray
            r6[r5] = r9
            int[] r6 = r8.presenceArray
            r6[r5] = r0
            int[] r6 = r8.hashArray
            int r7 = r5 + 1
            r6[r0] = r7
            int r6 = r8.size()
            int r6 = r6 + r4
            r8.size = r6
            r8.registerModification()
            int r4 = r8.maxProbeDistance
            if (r2 <= r4) goto L4f
            r8.maxProbeDistance = r2
        L4f:
            return r5
        L50:
            K[] r5 = r8.keysArray
            int r6 = r3 + (-1)
            r5 = r5[r6]
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual(r5, r9)
            if (r5 == 0) goto L5e
            int r4 = -r3
            return r4
        L5e:
            int r2 = r2 + 1
            if (r2 <= r1) goto L6c
            int r4 = r8.getHashSize()
            int r4 = r4 * 2
            r8.rehash(r4)
            goto L3
        L6c:
            int r5 = r0 + (-1)
            if (r0 != 0) goto L76
            int r0 = r8.getHashSize()
            int r0 = r0 - r4
            goto L17
        L76:
            r0 = r5
            goto L17
    }

    public final java.util.Map<K, V> build() {
            r2 = this;
            r2.checkIsMutable$kotlin_stdlib()
            r0 = 1
            r2.isReadOnly = r0
            int r0 = r2.size()
            if (r0 <= 0) goto L10
            r0 = r2
            java.util.Map r0 = (java.util.Map) r0
            goto L19
        L10:
            kotlin.collections.builders.MapBuilder r0 = kotlin.collections.builders.MapBuilder.Empty
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0, r1)
            java.util.Map r0 = (java.util.Map) r0
        L19:
            return r0
    }

    public final void checkIsMutable$kotlin_stdlib() {
            r1 = this;
            boolean r0 = r1.isReadOnly
            if (r0 != 0) goto L5
            return
        L5:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // java.util.Map
    public void clear() {
            r6 = this;
            r6.checkIsMutable$kotlin_stdlib()
            r0 = 0
            int r1 = r6.length
            int r1 = r1 + (-1)
            r2 = 0
            if (r0 > r1) goto L1f
        Lb:
            int[] r3 = r6.presenceArray
            r3 = r3[r0]
            if (r3 < 0) goto L1a
            int[] r4 = r6.hashArray
            r4[r3] = r2
            int[] r4 = r6.presenceArray
            r5 = -1
            r4[r0] = r5
        L1a:
            if (r0 == r1) goto L1f
            int r0 = r0 + 1
            goto Lb
        L1f:
            K[] r0 = r6.keysArray
            int r1 = r6.length
            kotlin.collections.builders.ListBuilderKt.resetRange(r0, r2, r1)
            V[] r0 = r6.valuesArray
            if (r0 == 0) goto L2f
            int r1 = r6.length
            kotlin.collections.builders.ListBuilderKt.resetRange(r0, r2, r1)
        L2f:
            r6.size = r2
            r6.length = r2
            r6.registerModification()
            return
    }

    public final boolean containsAllEntries$kotlin_stdlib(java.util.Collection<?> r5) {
            r4 = this;
            java.lang.String r0 = "m"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.util.Iterator r0 = r5.iterator()
        L9:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L24
            java.lang.Object r1 = r0.next()
            r2 = 0
            if (r1 == 0) goto L23
            r3 = r1
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch: java.lang.ClassCastException -> L21
            boolean r3 = r4.containsEntry$kotlin_stdlib(r3)     // Catch: java.lang.ClassCastException -> L21
            if (r3 != 0) goto L9
            goto L23
        L21:
            r3 = move-exception
            return r2
        L23:
            return r2
        L24:
            r1 = 1
            return r1
    }

    public final boolean containsEntry$kotlin_stdlib(java.util.Map.Entry<? extends K, ? extends V> r4) {
            r3 = this;
            java.lang.String r0 = "entry"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.Object r0 = r4.getKey()
            int r0 = r3.findKey(r0)
            if (r0 >= 0) goto L11
            r1 = 0
            return r1
        L11:
            V[] r1 = r3.valuesArray
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            r1 = r1[r0]
            java.lang.Object r2 = r4.getValue()
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
            return r1
    }

    @Override // java.util.Map
    public boolean containsKey(java.lang.Object r2) {
            r1 = this;
            int r0 = r1.findKey(r2)
            if (r0 < 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    @Override // java.util.Map
    public boolean containsValue(java.lang.Object r2) {
            r1 = this;
            int r0 = r1.findValue(r2)
            if (r0 < 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    public final kotlin.collections.builders.MapBuilder.EntriesItr<K, V> entriesIterator$kotlin_stdlib() {
            r1 = this;
            kotlin.collections.builders.MapBuilder$EntriesItr r0 = new kotlin.collections.builders.MapBuilder$EntriesItr
            r0.<init>(r1)
            return r0
    }

    @Override // java.util.Map
    public final /* bridge */ java.util.Set<java.util.Map.Entry<K, V>> entrySet() {
            r1 = this;
            java.util.Set r0 = r1.getEntries()
            return r0
    }

    @Override // java.util.Map
    public boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r2 == r1) goto L12
            boolean r0 = r2 instanceof java.util.Map
            if (r0 == 0) goto L10
            r0 = r2
            java.util.Map r0 = (java.util.Map) r0
            boolean r0 = r1.contentEquals(r0)
            if (r0 == 0) goto L10
            goto L12
        L10:
            r0 = 0
            goto L13
        L12:
            r0 = 1
        L13:
            return r0
    }

    @Override // java.util.Map
    public V get(java.lang.Object r3) {
            r2 = this;
            int r0 = r2.findKey(r3)
            if (r0 >= 0) goto L8
            r1 = 0
            return r1
        L8:
            V[] r1 = r2.valuesArray
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            r1 = r1[r0]
            return r1
    }

    public final int getCapacity$kotlin_stdlib() {
            r1 = this;
            K[] r0 = r1.keysArray
            int r0 = r0.length
            return r0
    }

    public java.util.Set<java.util.Map.Entry<K, V>> getEntries() {
            r3 = this;
            kotlin.collections.builders.MapBuilderEntries<K, V> r0 = r3.entriesView
            if (r0 != 0) goto Lf
            kotlin.collections.builders.MapBuilderEntries r1 = new kotlin.collections.builders.MapBuilderEntries
            r1.<init>(r3)
            r3.entriesView = r1
            r2 = r1
            java.util.Set r2 = (java.util.Set) r2
            return r2
        Lf:
            r1 = r0
            java.util.Set r1 = (java.util.Set) r1
            return r1
    }

    public java.util.Set<K> getKeys() {
            r2 = this;
            kotlin.collections.builders.MapBuilderKeys<K> r0 = r2.keysView
            if (r0 != 0) goto Lf
            kotlin.collections.builders.MapBuilderKeys r1 = new kotlin.collections.builders.MapBuilderKeys
            r1.<init>(r2)
            r2.keysView = r1
            java.util.Set r1 = (java.util.Set) r1
            goto L12
        Lf:
            r1 = r0
            java.util.Set r1 = (java.util.Set) r1
        L12:
            return r1
    }

    public int getSize() {
            r1 = this;
            int r0 = r1.size
            return r0
    }

    public java.util.Collection<V> getValues() {
            r2 = this;
            kotlin.collections.builders.MapBuilderValues<V> r0 = r2.valuesView
            if (r0 != 0) goto Lf
            kotlin.collections.builders.MapBuilderValues r1 = new kotlin.collections.builders.MapBuilderValues
            r1.<init>(r2)
            r2.valuesView = r1
            java.util.Collection r1 = (java.util.Collection) r1
            goto L12
        Lf:
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
        L12:
            return r1
    }

    @Override // java.util.Map
    public int hashCode() {
            r3 = this;
            r0 = 0
            kotlin.collections.builders.MapBuilder$EntriesItr r1 = r3.entriesIterator$kotlin_stdlib()
        L5:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L11
            int r2 = r1.nextHashCode$kotlin_stdlib()
            int r0 = r0 + r2
            goto L5
        L11:
            return r0
    }

    @Override // java.util.Map
    public boolean isEmpty() {
            r1 = this;
            int r0 = r1.size()
            if (r0 != 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    public final boolean isReadOnly$kotlin_stdlib() {
            r1 = this;
            boolean r0 = r1.isReadOnly
            return r0
    }

    @Override // java.util.Map
    public final /* bridge */ java.util.Set<K> keySet() {
            r1 = this;
            java.util.Set r0 = r1.getKeys()
            return r0
    }

    public final kotlin.collections.builders.MapBuilder.KeysItr<K, V> keysIterator$kotlin_stdlib() {
            r1 = this;
            kotlin.collections.builders.MapBuilder$KeysItr r0 = new kotlin.collections.builders.MapBuilder$KeysItr
            r0.<init>(r1)
            return r0
    }

    @Override // java.util.Map
    public V put(K r5, V r6) {
            r4 = this;
            r4.checkIsMutable$kotlin_stdlib()
            int r0 = r4.addKey$kotlin_stdlib(r5)
            java.lang.Object[] r1 = r4.allocateValuesArray()
            if (r0 >= 0) goto L18
            int r2 = -r0
            int r2 = r2 + (-1)
            r2 = r1[r2]
            int r3 = -r0
            int r3 = r3 + (-1)
            r1[r3] = r6
            return r2
        L18:
            r1[r0] = r6
            r2 = 0
            return r2
    }

    @Override // java.util.Map
    public void putAll(java.util.Map<? extends K, ? extends V> r2) {
            r1 = this;
            java.lang.String r0 = "from"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.checkIsMutable$kotlin_stdlib()
            java.util.Set r0 = r2.entrySet()
            java.util.Collection r0 = (java.util.Collection) r0
            r1.putAllEntries(r0)
            return
    }

    @Override // java.util.Map
    public V remove(java.lang.Object r3) {
            r2 = this;
            r2.checkIsMutable$kotlin_stdlib()
            int r0 = r2.findKey(r3)
            if (r0 >= 0) goto Lb
            r1 = 0
            return r1
        Lb:
            V[] r1 = r2.valuesArray
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            r1 = r1[r0]
            r2.removeEntryAt(r0)
            return r1
    }

    public final boolean removeEntry$kotlin_stdlib(java.util.Map.Entry<? extends K, ? extends V> r5) {
            r4 = this;
            java.lang.String r0 = "entry"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r4.checkIsMutable$kotlin_stdlib()
            java.lang.Object r0 = r5.getKey()
            int r0 = r4.findKey(r0)
            r1 = 0
            if (r0 >= 0) goto L14
            return r1
        L14:
            V[] r2 = r4.valuesArray
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            r2 = r2[r0]
            java.lang.Object r3 = r5.getValue()
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r3)
            if (r2 != 0) goto L26
            return r1
        L26:
            r4.removeEntryAt(r0)
            r1 = 1
            return r1
    }

    public final boolean removeKey$kotlin_stdlib(K r3) {
            r2 = this;
            r2.checkIsMutable$kotlin_stdlib()
            int r0 = r2.findKey(r3)
            if (r0 >= 0) goto Lb
            r1 = 0
            return r1
        Lb:
            r2.removeEntryAt(r0)
            r1 = 1
            return r1
    }

    public final boolean removeValue$kotlin_stdlib(V r3) {
            r2 = this;
            r2.checkIsMutable$kotlin_stdlib()
            int r0 = r2.findValue(r3)
            if (r0 >= 0) goto Lb
            r1 = 0
            return r1
        Lb:
            r2.removeEntryAt(r0)
            r1 = 1
            return r1
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
            r1 = this;
            int r0 = r1.getSize()
            return r0
    }

    public java.lang.String toString() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r5.size()
            int r1 = r1 * 3
            int r1 = r1 + 2
            r0.<init>(r1)
            java.lang.String r1 = "{"
            r0.append(r1)
            r1 = 0
            kotlin.collections.builders.MapBuilder$EntriesItr r2 = r5.entriesIterator$kotlin_stdlib()
        L17:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L2a
            if (r1 <= 0) goto L24
            java.lang.String r3 = ", "
            r0.append(r3)
        L24:
            r2.nextAppendString(r0)
            int r1 = r1 + 1
            goto L17
        L2a:
            java.lang.String r3 = "}"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.lang.String r4 = "toString(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            return r3
    }

    @Override // java.util.Map
    public final /* bridge */ java.util.Collection<V> values() {
            r1 = this;
            java.util.Collection r0 = r1.getValues()
            return r0
    }

    public final kotlin.collections.builders.MapBuilder.ValuesItr<K, V> valuesIterator$kotlin_stdlib() {
            r1 = this;
            kotlin.collections.builders.MapBuilder$ValuesItr r0 = new kotlin.collections.builders.MapBuilder$ValuesItr
            r0.<init>(r1)
            return r0
    }
}
