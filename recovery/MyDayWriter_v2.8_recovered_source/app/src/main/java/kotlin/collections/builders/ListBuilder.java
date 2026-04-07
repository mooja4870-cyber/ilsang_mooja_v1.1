package kotlin.collections.builders;

/* JADX INFO: compiled from: ListBuilder.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0010+\n\u0002\b\u0016\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0000\u0018\u0000 Q*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00060\u0003j\u0002`\u00042\b\u0012\u0004\u0012\u0002H\u00010\u00052\u00060\u0006j\u0002`\u0007:\u0003PQRB\u000f\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0015\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0016J\u001d\u0010\u0014\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0019J\u001e\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\t2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001cH\u0016J\u0016\u0010\u001a\u001a\u00020\u000f2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001cH\u0016J&\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\t2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c2\u0006\u0010\u001f\u001a\u00020\tH\u0002J\u001d\u0010 \u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010\u0019J\f\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\"J\b\u0010#\u001a\u00020\u0017H\u0002J\b\u0010$\u001a\u00020\u0017H\u0016J\u0014\u0010%\u001a\u00020\u000f2\n\u0010&\u001a\u0006\u0012\u0002\b\u00030\"H\u0002J\u0010\u0010'\u001a\u00020\u00172\u0006\u0010(\u001a\u00020\tH\u0002J\u0010\u0010)\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020\tH\u0002J\u0013\u0010*\u001a\u00020\u000f2\b\u0010&\u001a\u0004\u0018\u00010+H\u0096\u0002J\u0016\u0010,\u001a\u00028\u00002\u0006\u0010\u0018\u001a\u00020\tH\u0096\u0002¢\u0006\u0002\u0010-J\b\u0010.\u001a\u00020\tH\u0016J\u0015\u0010/\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00028\u0000H\u0016¢\u0006\u0002\u00100J\u0018\u00101\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\tH\u0002J\b\u00102\u001a\u00020\u000fH\u0016J\u000f\u00103\u001a\b\u0012\u0004\u0012\u00028\u000004H\u0096\u0002J\u0015\u00105\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00028\u0000H\u0016¢\u0006\u0002\u00100J\u000e\u00106\u001a\b\u0012\u0004\u0012\u00028\u000007H\u0016J\u0016\u00106\u001a\b\u0012\u0004\u0012\u00028\u0000072\u0006\u0010\u0018\u001a\u00020\tH\u0016J\b\u00108\u001a\u00020\u0017H\u0002J\u0015\u00109\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0016J\u0016\u0010:\u001a\u00020\u000f2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001cH\u0016J\u0015\u0010;\u001a\u00028\u00002\u0006\u0010\u0018\u001a\u00020\tH\u0016¢\u0006\u0002\u0010-J\u0015\u0010<\u001a\u00028\u00002\u0006\u0010\u001e\u001a\u00020\tH\u0002¢\u0006\u0002\u0010-J\u0018\u0010=\u001a\u00020\u00172\u0006\u0010>\u001a\u00020\t2\u0006\u0010?\u001a\u00020\tH\u0002J\u0016\u0010@\u001a\u00020\u000f2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001cH\u0016J.\u0010A\u001a\u00020\t2\u0006\u0010>\u001a\u00020\t2\u0006\u0010?\u001a\u00020\t2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c2\u0006\u0010B\u001a\u00020\u000fH\u0002J\u001e\u0010C\u001a\u00028\u00002\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010DJ\u001e\u0010E\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010F\u001a\u00020\t2\u0006\u0010G\u001a\u00020\tH\u0016J\u0015\u0010H\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010+0\fH\u0016¢\u0006\u0002\u0010IJ'\u0010H\u001a\b\u0012\u0004\u0012\u0002HJ0\f\"\u0004\b\u0001\u0010J2\f\u0010K\u001a\b\u0012\u0004\u0012\u0002HJ0\fH\u0016¢\u0006\u0002\u0010LJ\b\u0010M\u001a\u00020NH\u0016J\b\u0010O\u001a\u00020+H\u0002R\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\fX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006S"}, d2 = {"Lkotlin/collections/builders/ListBuilder;", "E", "", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "Lkotlin/collections/AbstractMutableList;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "initialCapacity", "", "(I)V", "backing", "", "[Ljava/lang/Object;", "isReadOnly", "", "length", "size", "getSize", "()I", "add", "element", "(Ljava/lang/Object;)Z", "", "index", "(ILjava/lang/Object;)V", "addAll", "elements", "", "addAllInternal", "i", "n", "addAtInternal", "build", "", "checkIsMutable", "clear", "contentEquals", "other", "ensureCapacityInternal", "minCapacity", "ensureExtraCapacity", "equals", "", "get", "(I)Ljava/lang/Object;", "hashCode", "indexOf", "(Ljava/lang/Object;)I", "insertAtInternal", "isEmpty", "iterator", "", "lastIndexOf", "listIterator", "", "registerModification", "remove", "removeAll", "removeAt", "removeAtInternal", "removeRangeInternal", "rangeOffset", "rangeLength", "retainAll", "retainOrRemoveAllInternal", "retain", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "subList", "fromIndex", "toIndex", "toArray", "()[Ljava/lang/Object;", "T", "array", "([Ljava/lang/Object;)[Ljava/lang/Object;", "toString", "", "writeReplace", "BuilderSubList", "Companion", "Itr", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ListBuilder<E> extends kotlin.collections.AbstractMutableList<E> implements java.util.List<E>, java.util.RandomAccess, java.io.Serializable, kotlin.jvm.internal.markers.KMutableList {
    private static final kotlin.collections.builders.ListBuilder.Companion Companion = null;
    private static final kotlin.collections.builders.ListBuilder Empty = null;
    private E[] backing;
    private boolean isReadOnly;
    private int length;

    /* JADX INFO: compiled from: ListBuilder.kt */
    @kotlin.Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\b\t\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0010+\n\u0002\b\u0016\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00060\u0003j\u0002`\u00042\b\u0012\u0004\u0012\u0002H\u00010\u00052\u00060\u0006j\u0002`\u0007:\u0001PBA\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0000\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\u000f¢\u0006\u0002\u0010\u0010J\u0015\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u001aJ\u001d\u0010\u0018\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u001dJ\u001e\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u000b2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00010 H\u0016J\u0016\u0010\u001e\u001a\u00020\u00132\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00010 H\u0016J&\u0010!\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020\u000b2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00010 2\u0006\u0010#\u001a\u00020\u000bH\u0002J\u001d\u0010$\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00028\u0001H\u0002¢\u0006\u0002\u0010\u001dJ\b\u0010%\u001a\u00020\u001bH\u0002J\b\u0010&\u001a\u00020\u001bH\u0002J\b\u0010'\u001a\u00020\u001bH\u0016J\u0014\u0010(\u001a\u00020\u00132\n\u0010)\u001a\u0006\u0012\u0002\b\u00030*H\u0002J\u0013\u0010+\u001a\u00020\u00132\b\u0010)\u001a\u0004\u0018\u00010,H\u0096\u0002J\u0016\u0010-\u001a\u00028\u00012\u0006\u0010\u001c\u001a\u00020\u000bH\u0096\u0002¢\u0006\u0002\u0010.J\b\u0010/\u001a\u00020\u000bH\u0016J\u0015\u00100\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00028\u0001H\u0016¢\u0006\u0002\u00101J\b\u00102\u001a\u00020\u0013H\u0016J\u000f\u00103\u001a\b\u0012\u0004\u0012\u00028\u000104H\u0096\u0002J\u0015\u00105\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00028\u0001H\u0016¢\u0006\u0002\u00101J\u000e\u00106\u001a\b\u0012\u0004\u0012\u00028\u000107H\u0016J\u0016\u00106\u001a\b\u0012\u0004\u0012\u00028\u0001072\u0006\u0010\u001c\u001a\u00020\u000bH\u0016J\b\u00108\u001a\u00020\u001bH\u0002J\u0015\u00109\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u001aJ\u0016\u0010:\u001a\u00020\u00132\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00010 H\u0016J\u0015\u0010;\u001a\u00028\u00012\u0006\u0010\u001c\u001a\u00020\u000bH\u0016¢\u0006\u0002\u0010.J\u0015\u0010<\u001a\u00028\u00012\u0006\u0010\"\u001a\u00020\u000bH\u0002¢\u0006\u0002\u0010.J\u0018\u0010=\u001a\u00020\u001b2\u0006\u0010>\u001a\u00020\u000b2\u0006\u0010?\u001a\u00020\u000bH\u0002J\u0016\u0010@\u001a\u00020\u00132\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00010 H\u0016J.\u0010A\u001a\u00020\u000b2\u0006\u0010>\u001a\u00020\u000b2\u0006\u0010?\u001a\u00020\u000b2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00010 2\u0006\u0010B\u001a\u00020\u0013H\u0002J\u001e\u0010C\u001a\u00028\u00012\u0006\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0002\u0010DJ\u001e\u0010E\u001a\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010F\u001a\u00020\u000b2\u0006\u0010G\u001a\u00020\u000bH\u0016J\u0015\u0010H\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010,0\tH\u0016¢\u0006\u0002\u0010IJ'\u0010H\u001a\b\u0012\u0004\u0012\u0002HJ0\t\"\u0004\b\u0002\u0010J2\f\u0010K\u001a\b\u0012\u0004\u0012\u0002HJ0\tH\u0016¢\u0006\u0002\u0010LJ\b\u0010M\u001a\u00020NH\u0016J\b\u0010O\u001a\u00020,H\u0002R\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\tX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00138BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0014R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0000X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006Q"}, d2 = {"Lkotlin/collections/builders/ListBuilder$BuilderSubList;", "E", "", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "Lkotlin/collections/AbstractMutableList;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "backing", "", "offset", "", "length", "parent", "root", "Lkotlin/collections/builders/ListBuilder;", "([Ljava/lang/Object;IILkotlin/collections/builders/ListBuilder$BuilderSubList;Lkotlin/collections/builders/ListBuilder;)V", "[Ljava/lang/Object;", "isReadOnly", "", "()Z", "size", "getSize", "()I", "add", "element", "(Ljava/lang/Object;)Z", "", "index", "(ILjava/lang/Object;)V", "addAll", "elements", "", "addAllInternal", "i", "n", "addAtInternal", "checkForComodification", "checkIsMutable", "clear", "contentEquals", "other", "", "equals", "", "get", "(I)Ljava/lang/Object;", "hashCode", "indexOf", "(Ljava/lang/Object;)I", "isEmpty", "iterator", "", "lastIndexOf", "listIterator", "", "registerModification", "remove", "removeAll", "removeAt", "removeAtInternal", "removeRangeInternal", "rangeOffset", "rangeLength", "retainAll", "retainOrRemoveAllInternal", "retain", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "subList", "fromIndex", "toIndex", "toArray", "()[Ljava/lang/Object;", "T", "array", "([Ljava/lang/Object;)[Ljava/lang/Object;", "toString", "", "writeReplace", "Itr", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class BuilderSubList<E> extends kotlin.collections.AbstractMutableList<E> implements java.util.List<E>, java.util.RandomAccess, java.io.Serializable, kotlin.jvm.internal.markers.KMutableList {
        private E[] backing;
        private int length;
        private final int offset;
        private final kotlin.collections.builders.ListBuilder.BuilderSubList<E> parent;
        private final kotlin.collections.builders.ListBuilder<E> root;

        /* JADX INFO: compiled from: ListBuilder.kt */
        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010+\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\b\u0002\u0018\u0000*\u0004\b\u0002\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u001b\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0015\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00028\u0002H\u0016¢\u0006\u0002\u0010\rJ\b\u0010\u000e\u001a\u00020\u000bH\u0002J\t\u0010\u000f\u001a\u00020\u0010H\u0096\u0002J\b\u0010\u0011\u001a\u00020\u0010H\u0016J\u000e\u0010\u0012\u001a\u00028\u0002H\u0096\u0002¢\u0006\u0002\u0010\u0013J\b\u0010\u0014\u001a\u00020\u0006H\u0016J\r\u0010\u0015\u001a\u00028\u0002H\u0016¢\u0006\u0002\u0010\u0013J\b\u0010\u0016\u001a\u00020\u0006H\u0016J\b\u0010\u0017\u001a\u00020\u000bH\u0016J\u0015\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00028\u0002H\u0016¢\u0006\u0002\u0010\rR\u000e\u0010\b\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lkotlin/collections/builders/ListBuilder$BuilderSubList$Itr;", "E", "", "list", "Lkotlin/collections/builders/ListBuilder$BuilderSubList;", "index", "", "(Lkotlin/collections/builders/ListBuilder$BuilderSubList;I)V", "expectedModCount", "lastIndex", "add", "", "element", "(Ljava/lang/Object;)V", "checkForComodification", "hasNext", "", "hasPrevious", "next", "()Ljava/lang/Object;", "nextIndex", "previous", "previousIndex", "remove", "set", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
        private static final class Itr<E> implements java.util.ListIterator<E>, kotlin.jvm.internal.markers.KMutableListIterator {
            private int expectedModCount;
            private int index;
            private int lastIndex;
            private final kotlin.collections.builders.ListBuilder.BuilderSubList<E> list;

            public Itr(kotlin.collections.builders.ListBuilder.BuilderSubList<E> r2, int r3) {
                    r1 = this;
                    java.lang.String r0 = "list"
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                    r1.<init>()
                    r1.list = r2
                    r1.index = r3
                    r0 = -1
                    r1.lastIndex = r0
                    kotlin.collections.builders.ListBuilder$BuilderSubList<E> r0 = r1.list
                    int r0 = kotlin.collections.builders.ListBuilder.BuilderSubList.access$getModCount$p$s1462993667(r0)
                    r1.expectedModCount = r0
                    return
            }

            private final void checkForComodification() {
                    r2 = this;
                    kotlin.collections.builders.ListBuilder$BuilderSubList<E> r0 = r2.list
                    kotlin.collections.builders.ListBuilder r0 = kotlin.collections.builders.ListBuilder.BuilderSubList.access$getRoot$p(r0)
                    int r0 = kotlin.collections.builders.ListBuilder.m620access$getModCount$p$s2084097795(r0)
                    int r1 = r2.expectedModCount
                    if (r0 != r1) goto Lf
                    return
                Lf:
                    java.util.ConcurrentModificationException r0 = new java.util.ConcurrentModificationException
                    r0.<init>()
                    throw r0
            }

            @Override // java.util.ListIterator
            public void add(E r4) {
                    r3 = this;
                    r3.checkForComodification()
                    kotlin.collections.builders.ListBuilder$BuilderSubList<E> r0 = r3.list
                    int r1 = r3.index
                    int r2 = r1 + 1
                    r3.index = r2
                    r0.add(r1, r4)
                    r0 = -1
                    r3.lastIndex = r0
                    kotlin.collections.builders.ListBuilder$BuilderSubList<E> r0 = r3.list
                    int r0 = kotlin.collections.builders.ListBuilder.BuilderSubList.access$getModCount$p$s1462993667(r0)
                    r3.expectedModCount = r0
                    return
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public boolean hasNext() {
                    r2 = this;
                    int r0 = r2.index
                    kotlin.collections.builders.ListBuilder$BuilderSubList<E> r1 = r2.list
                    int r1 = kotlin.collections.builders.ListBuilder.BuilderSubList.access$getLength$p(r1)
                    if (r0 >= r1) goto Lc
                    r0 = 1
                    goto Ld
                Lc:
                    r0 = 0
                Ld:
                    return r0
            }

            @Override // java.util.ListIterator
            public boolean hasPrevious() {
                    r1 = this;
                    int r0 = r1.index
                    if (r0 <= 0) goto L6
                    r0 = 1
                    goto L7
                L6:
                    r0 = 0
                L7:
                    return r0
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public E next() {
                    r3 = this;
                    r3.checkForComodification()
                    int r0 = r3.index
                    kotlin.collections.builders.ListBuilder$BuilderSubList<E> r1 = r3.list
                    int r1 = kotlin.collections.builders.ListBuilder.BuilderSubList.access$getLength$p(r1)
                    if (r0 >= r1) goto L27
                    int r0 = r3.index
                    int r1 = r0 + 1
                    r3.index = r1
                    r3.lastIndex = r0
                    kotlin.collections.builders.ListBuilder$BuilderSubList<E> r0 = r3.list
                    java.lang.Object[] r0 = kotlin.collections.builders.ListBuilder.BuilderSubList.access$getBacking$p(r0)
                    kotlin.collections.builders.ListBuilder$BuilderSubList<E> r1 = r3.list
                    int r1 = kotlin.collections.builders.ListBuilder.BuilderSubList.access$getOffset$p(r1)
                    int r2 = r3.lastIndex
                    int r1 = r1 + r2
                    r0 = r0[r1]
                    return r0
                L27:
                    java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                    r0.<init>()
                    throw r0
            }

            @Override // java.util.ListIterator
            public int nextIndex() {
                    r1 = this;
                    int r0 = r1.index
                    return r0
            }

            @Override // java.util.ListIterator
            public E previous() {
                    r3 = this;
                    r3.checkForComodification()
                    int r0 = r3.index
                    if (r0 <= 0) goto L23
                    int r0 = r3.index
                    int r0 = r0 + (-1)
                    r3.index = r0
                    int r0 = r3.index
                    r3.lastIndex = r0
                    kotlin.collections.builders.ListBuilder$BuilderSubList<E> r0 = r3.list
                    java.lang.Object[] r0 = kotlin.collections.builders.ListBuilder.BuilderSubList.access$getBacking$p(r0)
                    kotlin.collections.builders.ListBuilder$BuilderSubList<E> r1 = r3.list
                    int r1 = kotlin.collections.builders.ListBuilder.BuilderSubList.access$getOffset$p(r1)
                    int r2 = r3.lastIndex
                    int r1 = r1 + r2
                    r0 = r0[r1]
                    return r0
                L23:
                    java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                    r0.<init>()
                    throw r0
            }

            @Override // java.util.ListIterator
            public int previousIndex() {
                    r1 = this;
                    int r0 = r1.index
                    int r0 = r0 + (-1)
                    return r0
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public void remove() {
                    r3 = this;
                    r3.checkForComodification()
                    int r0 = r3.lastIndex
                    r1 = -1
                    if (r0 == r1) goto La
                    r0 = 1
                    goto Lb
                La:
                    r0 = 0
                Lb:
                    if (r0 == 0) goto L23
                    kotlin.collections.builders.ListBuilder$BuilderSubList<E> r0 = r3.list
                    int r2 = r3.lastIndex
                    r0.remove(r2)
                    int r0 = r3.lastIndex
                    r3.index = r0
                    r3.lastIndex = r1
                    kotlin.collections.builders.ListBuilder$BuilderSubList<E> r0 = r3.list
                    int r0 = kotlin.collections.builders.ListBuilder.BuilderSubList.access$getModCount$p$s1462993667(r0)
                    r3.expectedModCount = r0
                    return
                L23:
                    r0 = 0
                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                    java.lang.String r1 = "Call next() or previous() before removing element from the iterator."
                    java.lang.String r1 = r1.toString()
                    r0.<init>(r1)
                    throw r0
            }

            @Override // java.util.ListIterator
            public void set(E r3) {
                    r2 = this;
                    r2.checkForComodification()
                    int r0 = r2.lastIndex
                    r1 = -1
                    if (r0 == r1) goto La
                    r0 = 1
                    goto Lb
                La:
                    r0 = 0
                Lb:
                    if (r0 == 0) goto L15
                    kotlin.collections.builders.ListBuilder$BuilderSubList<E> r0 = r2.list
                    int r1 = r2.lastIndex
                    r0.set(r1, r3)
                    return
                L15:
                    r0 = 0
                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                    java.lang.String r1 = "Call next() or previous() before replacing element from the iterator."
                    java.lang.String r1 = r1.toString()
                    r0.<init>(r1)
                    throw r0
            }
        }

        public BuilderSubList(E[] r2, int r3, int r4, kotlin.collections.builders.ListBuilder.BuilderSubList<E> r5, kotlin.collections.builders.ListBuilder<E> r6) {
                r1 = this;
                java.lang.String r0 = "backing"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                java.lang.String r0 = "root"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
                r1.<init>()
                r1.backing = r2
                r1.offset = r3
                r1.length = r4
                r1.parent = r5
                r1.root = r6
                kotlin.collections.builders.ListBuilder<E> r0 = r1.root
                int r0 = kotlin.collections.builders.ListBuilder.m620access$getModCount$p$s2084097795(r0)
                r1.modCount = r0
                return
        }

        public static final /* synthetic */ java.lang.Object[] access$getBacking$p(kotlin.collections.builders.ListBuilder.BuilderSubList r1) {
                E[] r0 = r1.backing
                return r0
        }

        public static final /* synthetic */ int access$getLength$p(kotlin.collections.builders.ListBuilder.BuilderSubList r1) {
                int r0 = r1.length
                return r0
        }

        public static final /* synthetic */ int access$getModCount$p$s1462993667(kotlin.collections.builders.ListBuilder.BuilderSubList r1) {
                int r0 = r1.modCount
                return r0
        }

        public static final /* synthetic */ int access$getOffset$p(kotlin.collections.builders.ListBuilder.BuilderSubList r1) {
                int r0 = r1.offset
                return r0
        }

        public static final /* synthetic */ kotlin.collections.builders.ListBuilder access$getRoot$p(kotlin.collections.builders.ListBuilder.BuilderSubList r1) {
                kotlin.collections.builders.ListBuilder<E> r0 = r1.root
                return r0
        }

        private final void addAllInternal(int r2, java.util.Collection<? extends E> r3, int r4) {
                r1 = this;
                r1.registerModification()
                kotlin.collections.builders.ListBuilder$BuilderSubList<E> r0 = r1.parent
                if (r0 == 0) goto Ld
                kotlin.collections.builders.ListBuilder$BuilderSubList<E> r0 = r1.parent
                r0.addAllInternal(r2, r3, r4)
                goto L12
            Ld:
                kotlin.collections.builders.ListBuilder<E> r0 = r1.root
                kotlin.collections.builders.ListBuilder.access$addAllInternal(r0, r2, r3, r4)
            L12:
                kotlin.collections.builders.ListBuilder<E> r0 = r1.root
                java.lang.Object[] r0 = kotlin.collections.builders.ListBuilder.access$getBacking$p(r0)
                r1.backing = r0
                int r0 = r1.length
                int r0 = r0 + r4
                r1.length = r0
                return
        }

        private final void addAtInternal(int r2, E r3) {
                r1 = this;
                r1.registerModification()
                kotlin.collections.builders.ListBuilder$BuilderSubList<E> r0 = r1.parent
                if (r0 == 0) goto Ld
                kotlin.collections.builders.ListBuilder$BuilderSubList<E> r0 = r1.parent
                r0.addAtInternal(r2, r3)
                goto L12
            Ld:
                kotlin.collections.builders.ListBuilder<E> r0 = r1.root
                kotlin.collections.builders.ListBuilder.access$addAtInternal(r0, r2, r3)
            L12:
                kotlin.collections.builders.ListBuilder<E> r0 = r1.root
                java.lang.Object[] r0 = kotlin.collections.builders.ListBuilder.access$getBacking$p(r0)
                r1.backing = r0
                int r0 = r1.length
                int r0 = r0 + 1
                r1.length = r0
                return
        }

        private final void checkForComodification() {
                r2 = this;
                kotlin.collections.builders.ListBuilder<E> r0 = r2.root
                int r0 = kotlin.collections.builders.ListBuilder.m620access$getModCount$p$s2084097795(r0)
                int r1 = r2.modCount
                if (r0 != r1) goto Lb
                return
            Lb:
                java.util.ConcurrentModificationException r0 = new java.util.ConcurrentModificationException
                r0.<init>()
                throw r0
        }

        private final void checkIsMutable() {
                r1 = this;
                boolean r0 = r1.isReadOnly()
                if (r0 != 0) goto L7
                return
            L7:
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                r0.<init>()
                throw r0
        }

        private final boolean contentEquals(java.util.List<?> r4) {
                r3 = this;
                E[] r0 = r3.backing
                int r1 = r3.offset
                int r2 = r3.length
                boolean r0 = kotlin.collections.builders.ListBuilderKt.access$subarrayContentEquals(r0, r1, r2, r4)
                return r0
        }

        private final boolean isReadOnly() {
                r1 = this;
                kotlin.collections.builders.ListBuilder<E> r0 = r1.root
                boolean r0 = kotlin.collections.builders.ListBuilder.access$isReadOnly$p(r0)
                return r0
        }

        private final void registerModification() {
                r1 = this;
                int r0 = r1.modCount
                int r0 = r0 + 1
                r1.modCount = r0
                return
        }

        private final E removeAtInternal(int r3) {
                r2 = this;
                r2.registerModification()
                kotlin.collections.builders.ListBuilder$BuilderSubList<E> r0 = r2.parent
                if (r0 == 0) goto Le
                kotlin.collections.builders.ListBuilder$BuilderSubList<E> r0 = r2.parent
                java.lang.Object r0 = r0.removeAtInternal(r3)
                goto L14
            Le:
                kotlin.collections.builders.ListBuilder<E> r0 = r2.root
                java.lang.Object r0 = kotlin.collections.builders.ListBuilder.access$removeAtInternal(r0, r3)
            L14:
                int r1 = r2.length
                int r1 = r1 + (-1)
                r2.length = r1
                return r0
        }

        private final void removeRangeInternal(int r2, int r3) {
                r1 = this;
                if (r3 <= 0) goto L5
                r1.registerModification()
            L5:
                kotlin.collections.builders.ListBuilder$BuilderSubList<E> r0 = r1.parent
                if (r0 == 0) goto Lf
                kotlin.collections.builders.ListBuilder$BuilderSubList<E> r0 = r1.parent
                r0.removeRangeInternal(r2, r3)
                goto L14
            Lf:
                kotlin.collections.builders.ListBuilder<E> r0 = r1.root
                kotlin.collections.builders.ListBuilder.access$removeRangeInternal(r0, r2, r3)
            L14:
                int r0 = r1.length
                int r0 = r0 - r3
                r1.length = r0
                return
        }

        private final int retainOrRemoveAllInternal(int r3, int r4, java.util.Collection<? extends E> r5, boolean r6) {
                r2 = this;
                kotlin.collections.builders.ListBuilder$BuilderSubList<E> r0 = r2.parent
                if (r0 == 0) goto Lb
                kotlin.collections.builders.ListBuilder$BuilderSubList<E> r0 = r2.parent
                int r0 = r0.retainOrRemoveAllInternal(r3, r4, r5, r6)
                goto L11
            Lb:
                kotlin.collections.builders.ListBuilder<E> r0 = r2.root
                int r0 = kotlin.collections.builders.ListBuilder.access$retainOrRemoveAllInternal(r0, r3, r4, r5, r6)
            L11:
                if (r0 <= 0) goto L18
                r2.registerModification()
            L18:
                int r1 = r2.length
                int r1 = r1 - r0
                r2.length = r1
                return r0
        }

        private final java.lang.Object writeReplace() {
                r3 = this;
                boolean r0 = r3.isReadOnly()
                if (r0 == 0) goto L10
                kotlin.collections.builders.SerializedCollection r0 = new kotlin.collections.builders.SerializedCollection
                r1 = r3
                java.util.Collection r1 = (java.util.Collection) r1
                r2 = 0
                r0.<init>(r1, r2)
                return r0
            L10:
                java.io.NotSerializableException r0 = new java.io.NotSerializableException
                java.lang.String r1 = "The list cannot be serialized while it is being built."
                r0.<init>(r1)
                throw r0
        }

        @Override // kotlin.collections.AbstractMutableList, java.util.AbstractList, java.util.List
        public void add(int r3, E r4) {
                r2 = this;
                r2.checkIsMutable()
                r2.checkForComodification()
                kotlin.collections.AbstractList$Companion r0 = kotlin.collections.AbstractList.Companion
                int r1 = r2.length
                r0.checkPositionIndex$kotlin_stdlib(r3, r1)
                int r0 = r2.offset
                int r0 = r0 + r3
                r2.addAtInternal(r0, r4)
                return
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean add(E r3) {
                r2 = this;
                r2.checkIsMutable()
                r2.checkForComodification()
                int r0 = r2.offset
                int r1 = r2.length
                int r0 = r0 + r1
                r2.addAtInternal(r0, r3)
                r0 = 1
                return r0
        }

        @Override // java.util.AbstractList, java.util.List
        public boolean addAll(int r3, java.util.Collection<? extends E> r4) {
                r2 = this;
                java.lang.String r0 = "elements"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                r2.checkIsMutable()
                r2.checkForComodification()
                kotlin.collections.AbstractList$Companion r0 = kotlin.collections.AbstractList.Companion
                int r1 = r2.length
                r0.checkPositionIndex$kotlin_stdlib(r3, r1)
                int r0 = r4.size()
                int r1 = r2.offset
                int r1 = r1 + r3
                r2.addAllInternal(r1, r4, r0)
                if (r0 <= 0) goto L20
                r1 = 1
                goto L21
            L20:
                r1 = 0
            L21:
                return r1
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean addAll(java.util.Collection<? extends E> r4) {
                r3 = this;
                java.lang.String r0 = "elements"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                r3.checkIsMutable()
                r3.checkForComodification()
                int r0 = r4.size()
                int r1 = r3.offset
                int r2 = r3.length
                int r1 = r1 + r2
                r3.addAllInternal(r1, r4, r0)
                if (r0 <= 0) goto L1b
                r1 = 1
                goto L1c
            L1b:
                r1 = 0
            L1c:
                return r1
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public void clear() {
                r2 = this;
                r2.checkIsMutable()
                r2.checkForComodification()
                int r0 = r2.offset
                int r1 = r2.length
                r2.removeRangeInternal(r0, r1)
                return
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(java.lang.Object r2) {
                r1 = this;
                r1.checkForComodification()
                if (r2 == r1) goto L15
                boolean r0 = r2 instanceof java.util.List
                if (r0 == 0) goto L13
                r0 = r2
                java.util.List r0 = (java.util.List) r0
                boolean r0 = r1.contentEquals(r0)
                if (r0 == 0) goto L13
                goto L15
            L13:
                r0 = 0
                goto L16
            L15:
                r0 = 1
            L16:
                return r0
        }

        @Override // java.util.AbstractList, java.util.List
        public E get(int r3) {
                r2 = this;
                r2.checkForComodification()
                kotlin.collections.AbstractList$Companion r0 = kotlin.collections.AbstractList.Companion
                int r1 = r2.length
                r0.checkElementIndex$kotlin_stdlib(r3, r1)
                E[] r0 = r2.backing
                int r1 = r2.offset
                int r1 = r1 + r3
                r0 = r0[r1]
                return r0
        }

        @Override // kotlin.collections.AbstractMutableList
        public int getSize() {
                r1 = this;
                r1.checkForComodification()
                int r0 = r1.length
                return r0
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
                r3 = this;
                r3.checkForComodification()
                E[] r0 = r3.backing
                int r1 = r3.offset
                int r2 = r3.length
                int r0 = kotlin.collections.builders.ListBuilderKt.access$subarrayContentHashCode(r0, r1, r2)
                return r0
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(java.lang.Object r4) {
                r3 = this;
                r3.checkForComodification()
                r0 = 0
            L4:
                int r1 = r3.length
                if (r0 >= r1) goto L19
                E[] r1 = r3.backing
                int r2 = r3.offset
                int r2 = r2 + r0
                r1 = r1[r2]
                boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r4)
                if (r1 == 0) goto L16
                return r0
            L16:
                int r0 = r0 + 1
                goto L4
            L19:
                r1 = -1
                return r1
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
                r1 = this;
                r1.checkForComodification()
                int r0 = r1.length
                if (r0 != 0) goto L9
                r0 = 1
                goto La
            L9:
                r0 = 0
            La:
                return r0
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public java.util.Iterator<E> iterator() {
                r1 = this;
                r0 = 0
                java.util.ListIterator r0 = r1.listIterator(r0)
                java.util.Iterator r0 = (java.util.Iterator) r0
                return r0
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(java.lang.Object r4) {
                r3 = this;
                r3.checkForComodification()
                int r0 = r3.length
                int r0 = r0 + (-1)
            L7:
                if (r0 < 0) goto L1a
                E[] r1 = r3.backing
                int r2 = r3.offset
                int r2 = r2 + r0
                r1 = r1[r2]
                boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r4)
                if (r1 == 0) goto L17
                return r0
            L17:
                int r0 = r0 + (-1)
                goto L7
            L1a:
                r1 = -1
                return r1
        }

        @Override // java.util.AbstractList, java.util.List
        public java.util.ListIterator<E> listIterator() {
                r1 = this;
                r0 = 0
                java.util.ListIterator r0 = r1.listIterator(r0)
                return r0
        }

        @Override // java.util.AbstractList, java.util.List
        public java.util.ListIterator<E> listIterator(int r3) {
                r2 = this;
                r2.checkForComodification()
                kotlin.collections.AbstractList$Companion r0 = kotlin.collections.AbstractList.Companion
                int r1 = r2.length
                r0.checkPositionIndex$kotlin_stdlib(r3, r1)
                kotlin.collections.builders.ListBuilder$BuilderSubList$Itr r0 = new kotlin.collections.builders.ListBuilder$BuilderSubList$Itr
                r0.<init>(r2, r3)
                java.util.ListIterator r0 = (java.util.ListIterator) r0
                return r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean remove(java.lang.Object r3) {
                r2 = this;
                r2.checkIsMutable()
                r2.checkForComodification()
                int r0 = r2.indexOf(r3)
                if (r0 < 0) goto Lf
                r2.remove(r0)
            Lf:
                if (r0 < 0) goto L13
                r1 = 1
                goto L14
            L13:
                r1 = 0
            L14:
                return r1
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean removeAll(java.util.Collection<? extends java.lang.Object> r4) {
                r3 = this;
                java.lang.String r0 = "elements"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                r3.checkIsMutable()
                r3.checkForComodification()
                int r0 = r3.offset
                int r1 = r3.length
                r2 = 0
                int r0 = r3.retainOrRemoveAllInternal(r0, r1, r4, r2)
                if (r0 <= 0) goto L17
                r2 = 1
            L17:
                return r2
        }

        @Override // kotlin.collections.AbstractMutableList
        public E removeAt(int r3) {
                r2 = this;
                r2.checkIsMutable()
                r2.checkForComodification()
                kotlin.collections.AbstractList$Companion r0 = kotlin.collections.AbstractList.Companion
                int r1 = r2.length
                r0.checkElementIndex$kotlin_stdlib(r3, r1)
                int r0 = r2.offset
                int r0 = r0 + r3
                java.lang.Object r0 = r2.removeAtInternal(r0)
                return r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean retainAll(java.util.Collection<? extends java.lang.Object> r4) {
                r3 = this;
                java.lang.String r0 = "elements"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                r3.checkIsMutable()
                r3.checkForComodification()
                int r0 = r3.offset
                int r1 = r3.length
                r2 = 1
                int r0 = r3.retainOrRemoveAllInternal(r0, r1, r4, r2)
                if (r0 <= 0) goto L17
                goto L18
            L17:
                r2 = 0
            L18:
                return r2
        }

        @Override // kotlin.collections.AbstractMutableList, java.util.AbstractList, java.util.List
        public E set(int r4, E r5) {
                r3 = this;
                r3.checkIsMutable()
                r3.checkForComodification()
                kotlin.collections.AbstractList$Companion r0 = kotlin.collections.AbstractList.Companion
                int r1 = r3.length
                r0.checkElementIndex$kotlin_stdlib(r4, r1)
                E[] r0 = r3.backing
                int r1 = r3.offset
                int r1 = r1 + r4
                r0 = r0[r1]
                E[] r1 = r3.backing
                int r2 = r3.offset
                int r2 = r2 + r4
                r1[r2] = r5
                return r0
        }

        @Override // java.util.AbstractList, java.util.List
        public java.util.List<E> subList(int r9, int r10) {
                r8 = this;
                kotlin.collections.AbstractList$Companion r0 = kotlin.collections.AbstractList.Companion
                int r1 = r8.length
                r0.checkRangeIndexes$kotlin_stdlib(r9, r10, r1)
                kotlin.collections.builders.ListBuilder$BuilderSubList r2 = new kotlin.collections.builders.ListBuilder$BuilderSubList
                E[] r3 = r8.backing
                int r0 = r8.offset
                int r4 = r0 + r9
                int r5 = r10 - r9
                kotlin.collections.builders.ListBuilder<E> r7 = r8.root
                r6 = r8
                r2.<init>(r3, r4, r5, r6, r7)
                java.util.List r2 = (java.util.List) r2
                return r2
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public java.lang.Object[] toArray() {
                r4 = this;
                r4.checkForComodification()
                E[] r0 = r4.backing
                int r1 = r4.offset
                int r2 = r4.offset
                int r3 = r4.length
                int r2 = r2 + r3
                java.lang.Object[] r0 = kotlin.collections.ArraysKt.copyOfRange(r0, r1, r2)
                return r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public <T> T[] toArray(T[] r5) {
                r4 = this;
                java.lang.String r0 = "array"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                r4.checkForComodification()
                int r0 = r5.length
                int r1 = r4.length
                if (r0 >= r1) goto L24
                E[] r0 = r4.backing
                int r1 = r4.offset
                int r2 = r4.offset
                int r3 = r4.length
                int r2 = r2 + r3
                java.lang.Class r3 = r5.getClass()
                java.lang.Object[] r0 = java.util.Arrays.copyOfRange(r0, r1, r2, r3)
                java.lang.String r1 = "copyOfRange(...)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
                return r0
            L24:
                E[] r0 = r4.backing
                int r1 = r4.offset
                int r2 = r4.offset
                int r3 = r4.length
                int r2 = r2 + r3
                r3 = 0
                kotlin.collections.ArraysKt.copyInto(r0, r5, r3, r1, r2)
                int r0 = r4.length
                java.lang.Object[] r0 = kotlin.collections.CollectionsKt.terminateCollectionToArray(r0, r5)
                return r0
        }

        @Override // java.util.AbstractCollection
        public java.lang.String toString() {
                r4 = this;
                r4.checkForComodification()
                E[] r0 = r4.backing
                int r1 = r4.offset
                int r2 = r4.length
                r3 = r4
                java.util.Collection r3 = (java.util.Collection) r3
                java.lang.String r0 = kotlin.collections.builders.ListBuilderKt.access$subarrayContentToString(r0, r1, r2, r3)
                return r0
        }
    }

    /* JADX INFO: compiled from: ListBuilder.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lkotlin/collections/builders/ListBuilder$Companion;", "", "()V", "Empty", "Lkotlin/collections/builders/ListBuilder;", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class Companion {
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
    }

    /* JADX INFO: compiled from: ListBuilder.kt */
    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010+\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u001b\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0015\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\rJ\b\u0010\u000e\u001a\u00020\u000bH\u0002J\t\u0010\u000f\u001a\u00020\u0010H\u0096\u0002J\b\u0010\u0011\u001a\u00020\u0010H\u0016J\u000e\u0010\u0012\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0002\u0010\u0013J\b\u0010\u0014\u001a\u00020\u0006H\u0016J\r\u0010\u0015\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u0013J\b\u0010\u0016\u001a\u00020\u0006H\u0016J\b\u0010\u0017\u001a\u00020\u000bH\u0016J\u0015\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\rR\u000e\u0010\b\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lkotlin/collections/builders/ListBuilder$Itr;", "E", "", "list", "Lkotlin/collections/builders/ListBuilder;", "index", "", "(Lkotlin/collections/builders/ListBuilder;I)V", "expectedModCount", "lastIndex", "add", "", "element", "(Ljava/lang/Object;)V", "checkForComodification", "hasNext", "", "hasPrevious", "next", "()Ljava/lang/Object;", "nextIndex", "previous", "previousIndex", "remove", "set", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class Itr<E> implements java.util.ListIterator<E>, kotlin.jvm.internal.markers.KMutableListIterator {
        private int expectedModCount;
        private int index;
        private int lastIndex;
        private final kotlin.collections.builders.ListBuilder<E> list;

        public Itr(kotlin.collections.builders.ListBuilder<E> r2, int r3) {
                r1 = this;
                java.lang.String r0 = "list"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                r1.<init>()
                r1.list = r2
                r1.index = r3
                r0 = -1
                r1.lastIndex = r0
                kotlin.collections.builders.ListBuilder<E> r0 = r1.list
                int r0 = kotlin.collections.builders.ListBuilder.m620access$getModCount$p$s2084097795(r0)
                r1.expectedModCount = r0
                return
        }

        private final void checkForComodification() {
                r2 = this;
                kotlin.collections.builders.ListBuilder<E> r0 = r2.list
                int r0 = kotlin.collections.builders.ListBuilder.m620access$getModCount$p$s2084097795(r0)
                int r1 = r2.expectedModCount
                if (r0 != r1) goto Lb
                return
            Lb:
                java.util.ConcurrentModificationException r0 = new java.util.ConcurrentModificationException
                r0.<init>()
                throw r0
        }

        @Override // java.util.ListIterator
        public void add(E r4) {
                r3 = this;
                r3.checkForComodification()
                kotlin.collections.builders.ListBuilder<E> r0 = r3.list
                int r1 = r3.index
                int r2 = r1 + 1
                r3.index = r2
                r0.add(r1, r4)
                r0 = -1
                r3.lastIndex = r0
                kotlin.collections.builders.ListBuilder<E> r0 = r3.list
                int r0 = kotlin.collections.builders.ListBuilder.m620access$getModCount$p$s2084097795(r0)
                r3.expectedModCount = r0
                return
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
                r2 = this;
                int r0 = r2.index
                kotlin.collections.builders.ListBuilder<E> r1 = r2.list
                int r1 = kotlin.collections.builders.ListBuilder.access$getLength$p(r1)
                if (r0 >= r1) goto Lc
                r0 = 1
                goto Ld
            Lc:
                r0 = 0
            Ld:
                return r0
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
                r1 = this;
                int r0 = r1.index
                if (r0 <= 0) goto L6
                r0 = 1
                goto L7
            L6:
                r0 = 0
            L7:
                return r0
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public E next() {
                r2 = this;
                r2.checkForComodification()
                int r0 = r2.index
                kotlin.collections.builders.ListBuilder<E> r1 = r2.list
                int r1 = kotlin.collections.builders.ListBuilder.access$getLength$p(r1)
                if (r0 >= r1) goto L20
                int r0 = r2.index
                int r1 = r0 + 1
                r2.index = r1
                r2.lastIndex = r0
                kotlin.collections.builders.ListBuilder<E> r0 = r2.list
                java.lang.Object[] r0 = kotlin.collections.builders.ListBuilder.access$getBacking$p(r0)
                int r1 = r2.lastIndex
                r0 = r0[r1]
                return r0
            L20:
                java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                r0.<init>()
                throw r0
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
                r1 = this;
                int r0 = r1.index
                return r0
        }

        @Override // java.util.ListIterator
        public E previous() {
                r2 = this;
                r2.checkForComodification()
                int r0 = r2.index
                if (r0 <= 0) goto L1c
                int r0 = r2.index
                int r0 = r0 + (-1)
                r2.index = r0
                int r0 = r2.index
                r2.lastIndex = r0
                kotlin.collections.builders.ListBuilder<E> r0 = r2.list
                java.lang.Object[] r0 = kotlin.collections.builders.ListBuilder.access$getBacking$p(r0)
                int r1 = r2.lastIndex
                r0 = r0[r1]
                return r0
            L1c:
                java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                r0.<init>()
                throw r0
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
                r1 = this;
                int r0 = r1.index
                int r0 = r0 + (-1)
                return r0
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
                r3 = this;
                r3.checkForComodification()
                int r0 = r3.lastIndex
                r1 = -1
                if (r0 == r1) goto La
                r0 = 1
                goto Lb
            La:
                r0 = 0
            Lb:
                if (r0 == 0) goto L23
                kotlin.collections.builders.ListBuilder<E> r0 = r3.list
                int r2 = r3.lastIndex
                r0.remove(r2)
                int r0 = r3.lastIndex
                r3.index = r0
                r3.lastIndex = r1
                kotlin.collections.builders.ListBuilder<E> r0 = r3.list
                int r0 = kotlin.collections.builders.ListBuilder.m620access$getModCount$p$s2084097795(r0)
                r3.expectedModCount = r0
                return
            L23:
                r0 = 0
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "Call next() or previous() before removing element from the iterator."
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
        }

        @Override // java.util.ListIterator
        public void set(E r3) {
                r2 = this;
                r2.checkForComodification()
                int r0 = r2.lastIndex
                r1 = -1
                if (r0 == r1) goto La
                r0 = 1
                goto Lb
            La:
                r0 = 0
            Lb:
                if (r0 == 0) goto L15
                kotlin.collections.builders.ListBuilder<E> r0 = r2.list
                int r1 = r2.lastIndex
                r0.set(r1, r3)
                return
            L15:
                r0 = 0
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "Call next() or previous() before replacing element from the iterator."
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
        }
    }

    static {
            kotlin.collections.builders.ListBuilder$Companion r0 = new kotlin.collections.builders.ListBuilder$Companion
            r1 = 0
            r0.<init>(r1)
            kotlin.collections.builders.ListBuilder.Companion = r0
            kotlin.collections.builders.ListBuilder r0 = new kotlin.collections.builders.ListBuilder
            r1 = 0
            r0.<init>(r1)
            r1 = r0
            r2 = 0
            r3 = 1
            r1.isReadOnly = r3
            kotlin.collections.builders.ListBuilder.Empty = r0
            return
    }

    public ListBuilder() {
            r3 = this;
            r0 = 1
            r1 = 0
            r2 = 0
            r3.<init>(r2, r0, r1)
            return
    }

    public ListBuilder(int r2) {
            r1 = this;
            r1.<init>()
            java.lang.Object[] r0 = kotlin.collections.builders.ListBuilderKt.arrayOfUninitializedElements(r2)
            r1.backing = r0
            return
    }

    public /* synthetic */ ListBuilder(int r1, int r2, kotlin.jvm.internal.DefaultConstructorMarker r3) {
            r0 = this;
            r2 = r2 & 1
            if (r2 == 0) goto L6
            r1 = 10
        L6:
            r0.<init>(r1)
            return
    }

    public static final /* synthetic */ void access$addAllInternal(kotlin.collections.builders.ListBuilder r0, int r1, java.util.Collection r2, int r3) {
            r0.addAllInternal(r1, r2, r3)
            return
    }

    public static final /* synthetic */ void access$addAtInternal(kotlin.collections.builders.ListBuilder r0, int r1, java.lang.Object r2) {
            r0.addAtInternal(r1, r2)
            return
    }

    public static final /* synthetic */ java.lang.Object[] access$getBacking$p(kotlin.collections.builders.ListBuilder r1) {
            E[] r0 = r1.backing
            return r0
    }

    public static final /* synthetic */ int access$getLength$p(kotlin.collections.builders.ListBuilder r1) {
            int r0 = r1.length
            return r0
    }

    /* JADX INFO: renamed from: access$getModCount$p$s-2084097795, reason: not valid java name */
    public static final /* synthetic */ int m620access$getModCount$p$s2084097795(kotlin.collections.builders.ListBuilder r1) {
            int r0 = r1.modCount
            return r0
    }

    public static final /* synthetic */ boolean access$isReadOnly$p(kotlin.collections.builders.ListBuilder r1) {
            boolean r0 = r1.isReadOnly
            return r0
    }

    public static final /* synthetic */ java.lang.Object access$removeAtInternal(kotlin.collections.builders.ListBuilder r1, int r2) {
            java.lang.Object r0 = r1.removeAtInternal(r2)
            return r0
    }

    public static final /* synthetic */ void access$removeRangeInternal(kotlin.collections.builders.ListBuilder r0, int r1, int r2) {
            r0.removeRangeInternal(r1, r2)
            return
    }

    public static final /* synthetic */ int access$retainOrRemoveAllInternal(kotlin.collections.builders.ListBuilder r1, int r2, int r3, java.util.Collection r4, boolean r5) {
            int r0 = r1.retainOrRemoveAllInternal(r2, r3, r4, r5)
            return r0
    }

    private final void addAllInternal(int r6, java.util.Collection<? extends E> r7, int r8) {
            r5 = this;
            r5.registerModification()
            r5.insertAtInternal(r6, r8)
            r0 = 0
            java.util.Iterator r1 = r7.iterator()
        Lb:
            if (r0 >= r8) goto L1a
            E[] r2 = r5.backing
            int r3 = r6 + r0
            java.lang.Object r4 = r1.next()
            r2[r3] = r4
            int r0 = r0 + 1
            goto Lb
        L1a:
            return
    }

    private final void addAtInternal(int r2, E r3) {
            r1 = this;
            r1.registerModification()
            r0 = 1
            r1.insertAtInternal(r2, r0)
            E[] r0 = r1.backing
            r0[r2] = r3
            return
    }

    private final void checkIsMutable() {
            r1 = this;
            boolean r0 = r1.isReadOnly
            if (r0 != 0) goto L5
            return
        L5:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    private final boolean contentEquals(java.util.List<?> r4) {
            r3 = this;
            E[] r0 = r3.backing
            r1 = 0
            int r2 = r3.length
            boolean r0 = kotlin.collections.builders.ListBuilderKt.access$subarrayContentEquals(r0, r1, r2, r4)
            return r0
    }

    private final void ensureCapacityInternal(int r3) {
            r2 = this;
            if (r3 < 0) goto L19
            E[] r0 = r2.backing
            int r0 = r0.length
            if (r3 <= r0) goto L18
            kotlin.collections.AbstractList$Companion r0 = kotlin.collections.AbstractList.Companion
            E[] r1 = r2.backing
            int r1 = r1.length
            int r0 = r0.newCapacity$kotlin_stdlib(r1, r3)
            E[] r1 = r2.backing
            java.lang.Object[] r1 = kotlin.collections.builders.ListBuilderKt.copyOfUninitializedElements(r1, r0)
            r2.backing = r1
        L18:
            return
        L19:
            java.lang.OutOfMemoryError r0 = new java.lang.OutOfMemoryError
            r0.<init>()
            throw r0
    }

    private final void ensureExtraCapacity(int r2) {
            r1 = this;
            int r0 = r1.length
            int r0 = r0 + r2
            r1.ensureCapacityInternal(r0)
            return
    }

    private final void insertAtInternal(int r5, int r6) {
            r4 = this;
            r4.ensureExtraCapacity(r6)
            E[] r0 = r4.backing
            E[] r1 = r4.backing
            int r2 = r4.length
            int r3 = r5 + r6
            kotlin.collections.ArraysKt.copyInto(r0, r1, r3, r5, r2)
            int r0 = r4.length
            int r0 = r0 + r6
            r4.length = r0
            return
    }

    private final void registerModification() {
            r1 = this;
            int r0 = r1.modCount
            int r0 = r0 + 1
            r1.modCount = r0
            return
    }

    private final E removeAtInternal(int r6) {
            r5 = this;
            r5.registerModification()
            E[] r0 = r5.backing
            r0 = r0[r6]
            E[] r1 = r5.backing
            E[] r2 = r5.backing
            int r3 = r6 + 1
            int r4 = r5.length
            kotlin.collections.ArraysKt.copyInto(r1, r2, r6, r3, r4)
            E[] r1 = r5.backing
            int r2 = r5.length
            int r2 = r2 + (-1)
            kotlin.collections.builders.ListBuilderKt.resetAt(r1, r2)
            int r1 = r5.length
            int r1 = r1 + (-1)
            r5.length = r1
            return r0
    }

    private final void removeRangeInternal(int r5, int r6) {
            r4 = this;
            if (r6 <= 0) goto L5
            r4.registerModification()
        L5:
            E[] r0 = r4.backing
            E[] r1 = r4.backing
            int r2 = r5 + r6
            int r3 = r4.length
            kotlin.collections.ArraysKt.copyInto(r0, r1, r5, r2, r3)
            E[] r0 = r4.backing
            int r1 = r4.length
            int r1 = r1 - r6
            int r2 = r4.length
            kotlin.collections.builders.ListBuilderKt.resetRange(r0, r1, r2)
            int r0 = r4.length
            int r0 = r0 - r6
            r4.length = r0
            return
    }

    private final int retainOrRemoveAllInternal(int r9, int r10, java.util.Collection<? extends E> r11, boolean r12) {
            r8 = this;
            r0 = 0
            r1 = 0
        L2:
            if (r0 >= r10) goto L24
            E[] r2 = r8.backing
            int r3 = r9 + r0
            r2 = r2[r3]
            boolean r2 = r11.contains(r2)
            if (r2 != r12) goto L21
            E[] r2 = r8.backing
            int r3 = r1 + 1
            int r1 = r1 + r9
            E[] r4 = r8.backing
            int r5 = r0 + 1
            int r0 = r0 + r9
            r0 = r4[r0]
            r2[r1] = r0
            r1 = r3
            r0 = r5
            goto L2
        L21:
            int r0 = r0 + 1
            goto L2
        L24:
            int r2 = r10 - r1
            E[] r3 = r8.backing
            E[] r4 = r8.backing
            int r5 = r9 + r10
            int r6 = r8.length
            int r7 = r9 + r1
            kotlin.collections.ArraysKt.copyInto(r3, r4, r7, r5, r6)
            E[] r3 = r8.backing
            int r4 = r8.length
            int r4 = r4 - r2
            int r5 = r8.length
            kotlin.collections.builders.ListBuilderKt.resetRange(r3, r4, r5)
            if (r2 <= 0) goto L42
            r8.registerModification()
        L42:
            int r3 = r8.length
            int r3 = r3 - r2
            r8.length = r3
            return r2
    }

    private final java.lang.Object writeReplace() {
            r3 = this;
            boolean r0 = r3.isReadOnly
            if (r0 == 0) goto Le
            kotlin.collections.builders.SerializedCollection r0 = new kotlin.collections.builders.SerializedCollection
            r1 = r3
            java.util.Collection r1 = (java.util.Collection) r1
            r2 = 0
            r0.<init>(r1, r2)
            return r0
        Le:
            java.io.NotSerializableException r0 = new java.io.NotSerializableException
            java.lang.String r1 = "The list cannot be serialized while it is being built."
            r0.<init>(r1)
            throw r0
    }

    @Override // kotlin.collections.AbstractMutableList, java.util.AbstractList, java.util.List
    public void add(int r3, E r4) {
            r2 = this;
            r2.checkIsMutable()
            kotlin.collections.AbstractList$Companion r0 = kotlin.collections.AbstractList.Companion
            int r1 = r2.length
            r0.checkPositionIndex$kotlin_stdlib(r3, r1)
            r2.addAtInternal(r3, r4)
            return
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E r2) {
            r1 = this;
            r1.checkIsMutable()
            int r0 = r1.length
            r1.addAtInternal(r0, r2)
            r0 = 1
            return r0
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int r3, java.util.Collection<? extends E> r4) {
            r2 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r2.checkIsMutable()
            kotlin.collections.AbstractList$Companion r0 = kotlin.collections.AbstractList.Companion
            int r1 = r2.length
            r0.checkPositionIndex$kotlin_stdlib(r3, r1)
            int r0 = r4.size()
            r2.addAllInternal(r3, r4, r0)
            if (r0 <= 0) goto L1a
            r1 = 1
            goto L1b
        L1a:
            r1 = 0
        L1b:
            return r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(java.util.Collection<? extends E> r3) {
            r2 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r2.checkIsMutable()
            int r0 = r3.size()
            int r1 = r2.length
            r2.addAllInternal(r1, r3, r0)
            if (r0 <= 0) goto L15
            r1 = 1
            goto L16
        L15:
            r1 = 0
        L16:
            return r1
    }

    public final java.util.List<E> build() {
            r1 = this;
            r1.checkIsMutable()
            r0 = 1
            r1.isReadOnly = r0
            int r0 = r1.length
            if (r0 <= 0) goto Le
            r0 = r1
            java.util.List r0 = (java.util.List) r0
            goto L12
        Le:
            kotlin.collections.builders.ListBuilder r0 = kotlin.collections.builders.ListBuilder.Empty
            java.util.List r0 = (java.util.List) r0
        L12:
            return r0
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
            r2 = this;
            r2.checkIsMutable()
            r0 = 0
            int r1 = r2.length
            r2.removeRangeInternal(r0, r1)
            return
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r2 == r1) goto L12
            boolean r0 = r2 instanceof java.util.List
            if (r0 == 0) goto L10
            r0 = r2
            java.util.List r0 = (java.util.List) r0
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

    @Override // java.util.AbstractList, java.util.List
    public E get(int r3) {
            r2 = this;
            kotlin.collections.AbstractList$Companion r0 = kotlin.collections.AbstractList.Companion
            int r1 = r2.length
            r0.checkElementIndex$kotlin_stdlib(r3, r1)
            E[] r0 = r2.backing
            r0 = r0[r3]
            return r0
    }

    @Override // kotlin.collections.AbstractMutableList
    public int getSize() {
            r1 = this;
            int r0 = r1.length
            return r0
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
            r3 = this;
            E[] r0 = r3.backing
            r1 = 0
            int r2 = r3.length
            int r0 = kotlin.collections.builders.ListBuilderKt.access$subarrayContentHashCode(r0, r1, r2)
            return r0
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(java.lang.Object r3) {
            r2 = this;
            r0 = 0
        L1:
            int r1 = r2.length
            if (r0 >= r1) goto L13
            E[] r1 = r2.backing
            r1 = r1[r0]
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            if (r1 == 0) goto L10
            return r0
        L10:
            int r0 = r0 + 1
            goto L1
        L13:
            r1 = -1
            return r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
            r1 = this;
            int r0 = r1.length
            if (r0 != 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public java.util.Iterator<E> iterator() {
            r1 = this;
            r0 = 0
            java.util.ListIterator r0 = r1.listIterator(r0)
            java.util.Iterator r0 = (java.util.Iterator) r0
            return r0
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(java.lang.Object r3) {
            r2 = this;
            int r0 = r2.length
            int r0 = r0 + (-1)
        L4:
            if (r0 < 0) goto L14
            E[] r1 = r2.backing
            r1 = r1[r0]
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            if (r1 == 0) goto L11
            return r0
        L11:
            int r0 = r0 + (-1)
            goto L4
        L14:
            r1 = -1
            return r1
    }

    @Override // java.util.AbstractList, java.util.List
    public java.util.ListIterator<E> listIterator() {
            r1 = this;
            r0 = 0
            java.util.ListIterator r0 = r1.listIterator(r0)
            return r0
    }

    @Override // java.util.AbstractList, java.util.List
    public java.util.ListIterator<E> listIterator(int r3) {
            r2 = this;
            kotlin.collections.AbstractList$Companion r0 = kotlin.collections.AbstractList.Companion
            int r1 = r2.length
            r0.checkPositionIndex$kotlin_stdlib(r3, r1)
            kotlin.collections.builders.ListBuilder$Itr r0 = new kotlin.collections.builders.ListBuilder$Itr
            r0.<init>(r2, r3)
            java.util.ListIterator r0 = (java.util.ListIterator) r0
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(java.lang.Object r3) {
            r2 = this;
            r2.checkIsMutable()
            int r0 = r2.indexOf(r3)
            if (r0 < 0) goto Lc
            r2.remove(r0)
        Lc:
            if (r0 < 0) goto L10
            r1 = 1
            goto L11
        L10:
            r1 = 0
        L11:
            return r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(java.util.Collection<? extends java.lang.Object> r3) {
            r2 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r2.checkIsMutable()
            int r0 = r2.length
            r1 = 0
            int r0 = r2.retainOrRemoveAllInternal(r1, r0, r3, r1)
            if (r0 <= 0) goto L12
            r1 = 1
        L12:
            return r1
    }

    @Override // kotlin.collections.AbstractMutableList
    public E removeAt(int r3) {
            r2 = this;
            r2.checkIsMutable()
            kotlin.collections.AbstractList$Companion r0 = kotlin.collections.AbstractList.Companion
            int r1 = r2.length
            r0.checkElementIndex$kotlin_stdlib(r3, r1)
            java.lang.Object r0 = r2.removeAtInternal(r3)
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(java.util.Collection<? extends java.lang.Object> r4) {
            r3 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r3.checkIsMutable()
            int r0 = r3.length
            r1 = 0
            r2 = 1
            int r0 = r3.retainOrRemoveAllInternal(r1, r0, r4, r2)
            if (r0 <= 0) goto L13
            r1 = r2
        L13:
            return r1
    }

    @Override // kotlin.collections.AbstractMutableList, java.util.AbstractList, java.util.List
    public E set(int r3, E r4) {
            r2 = this;
            r2.checkIsMutable()
            kotlin.collections.AbstractList$Companion r0 = kotlin.collections.AbstractList.Companion
            int r1 = r2.length
            r0.checkElementIndex$kotlin_stdlib(r3, r1)
            E[] r0 = r2.backing
            r0 = r0[r3]
            E[] r1 = r2.backing
            r1[r3] = r4
            return r0
    }

    @Override // java.util.AbstractList, java.util.List
    public java.util.List<E> subList(int r9, int r10) {
            r8 = this;
            kotlin.collections.AbstractList$Companion r0 = kotlin.collections.AbstractList.Companion
            int r1 = r8.length
            r0.checkRangeIndexes$kotlin_stdlib(r9, r10, r1)
            kotlin.collections.builders.ListBuilder$BuilderSubList r2 = new kotlin.collections.builders.ListBuilder$BuilderSubList
            E[] r3 = r8.backing
            int r5 = r10 - r9
            r6 = 0
            r7 = r8
            r4 = r9
            r2.<init>(r3, r4, r5, r6, r7)
            java.util.List r2 = (java.util.List) r2
            return r2
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public java.lang.Object[] toArray() {
            r3 = this;
            E[] r0 = r3.backing
            r1 = 0
            int r2 = r3.length
            java.lang.Object[] r0 = kotlin.collections.ArraysKt.copyOfRange(r0, r1, r2)
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public <T> T[] toArray(T[] r5) {
            r4 = this;
            java.lang.String r0 = "array"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            int r0 = r5.length
            int r1 = r4.length
            r2 = 0
            if (r0 >= r1) goto L1d
            E[] r0 = r4.backing
            int r1 = r4.length
            java.lang.Class r3 = r5.getClass()
            java.lang.Object[] r0 = java.util.Arrays.copyOfRange(r0, r2, r1, r3)
            java.lang.String r1 = "copyOfRange(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
        L1d:
            E[] r0 = r4.backing
            int r1 = r4.length
            kotlin.collections.ArraysKt.copyInto(r0, r5, r2, r2, r1)
            int r0 = r4.length
            java.lang.Object[] r0 = kotlin.collections.CollectionsKt.terminateCollectionToArray(r0, r5)
            return r0
    }

    @Override // java.util.AbstractCollection
    public java.lang.String toString() {
            r4 = this;
            E[] r0 = r4.backing
            int r1 = r4.length
            r2 = r4
            java.util.Collection r2 = (java.util.Collection) r2
            r3 = 0
            java.lang.String r0 = kotlin.collections.builders.ListBuilderKt.access$subarrayContentToString(r0, r3, r1, r2)
            return r0
    }
}
