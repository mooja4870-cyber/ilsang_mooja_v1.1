package androidx.collection;

/* JADX INFO: compiled from: ObjectList.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u001c\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u000f\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0006\u0010\u0016\u001a\u00020\u0017J:\u0010\u0016\u001a\u00020\u00172!\u0010\u0018\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020\u00170\u0019H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J\u000e\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001eH&J\u0016\u0010\u001f\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0002\u0010 J\u0014\u0010!\u001a\u00020\u00172\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000J\u0019\u0010!\u001a\u00020\u00172\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000\n¢\u0006\u0002\u0010#J\u0014\u0010!\u001a\u00020\u00172\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000$J\u0014\u0010!\u001a\u00020\u00172\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000\u001eJ\u0006\u0010%\u001a\u00020\u0004J:\u0010%\u001a\u00020\u00042!\u0010\u0018\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020\u00170\u0019H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J\u0015\u0010&\u001a\u00028\u00002\b\b\u0001\u0010'\u001a\u00020\u0004¢\u0006\u0002\u0010(J>\u0010)\u001a\u00028\u00002\b\b\u0001\u0010'\u001a\u00020\u00042!\u0010*\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b('\u0012\u0004\u0012\u00028\u00000\u0019H\u0086\bø\u0001\u0000¢\u0006\u0002\u0010+J\u0013\u0010,\u001a\u00020\u00172\b\u0010-\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\u000b\u0010.\u001a\u00028\u0000¢\u0006\u0002\u0010/J?\u0010.\u001a\u00028\u00002!\u0010\u0018\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020\u00170\u0019H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0002\u00100J\u0010\u00101\u001a\u0004\u0018\u00018\u0000H\u0086\b¢\u0006\u0002\u0010/JA\u00101\u001a\u0004\u0018\u00018\u00002!\u0010\u0018\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020\u00170\u0019H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0002\u00100Jb\u00102\u001a\u0002H3\"\u0004\b\u0001\u001032\u0006\u00104\u001a\u0002H326\u00105\u001a2\u0012\u0013\u0012\u0011H3¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(7\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u0002H306H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0002\u00108Jw\u00109\u001a\u0002H3\"\u0004\b\u0001\u001032\u0006\u00104\u001a\u0002H32K\u00105\u001aG\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b('\u0012\u0013\u0012\u0011H3¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(7\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u0002H30:H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0002\u0010;Jb\u0010<\u001a\u0002H3\"\u0004\b\u0001\u001032\u0006\u00104\u001a\u0002H326\u00105\u001a2\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0013\u0012\u0011H3¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(7\u0012\u0004\u0012\u0002H306H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0002\u00108Jw\u0010=\u001a\u0002H3\"\u0004\b\u0001\u001032\u0006\u00104\u001a\u0002H32K\u00105\u001aG\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b('\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0013\u0012\u0011H3¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(7\u0012\u0004\u0012\u0002H30:H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0002\u0010;J:\u0010>\u001a\u00020?2!\u0010@\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020?0\u0019H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001JO\u0010A\u001a\u00020?26\u0010@\u001a2\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b('\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020?06H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J:\u0010B\u001a\u00020?2!\u0010@\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020?0\u0019H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001JO\u0010C\u001a\u00020?26\u0010@\u001a2\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b('\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020?06H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J\u0018\u0010D\u001a\u00028\u00002\b\b\u0001\u0010'\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0002\u0010(J\b\u0010E\u001a\u00020\u0004H\u0016J\u0013\u0010F\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00028\u0000¢\u0006\u0002\u0010GJ:\u0010H\u001a\u00020\u00042!\u0010\u0018\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020\u00170\u0019H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J:\u0010I\u001a\u00020\u00042!\u0010\u0018\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020\u00170\u0019H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J\u0006\u0010J\u001a\u00020\u0017J\u0006\u0010K\u001a\u00020\u0017JR\u0010L\u001a\u00020M2\b\b\u0002\u0010N\u001a\u00020O2\b\b\u0002\u0010P\u001a\u00020O2\b\b\u0002\u0010Q\u001a\u00020O2\b\b\u0002\u0010R\u001a\u00020\u00042\b\b\u0002\u0010S\u001a\u00020O2\u0016\b\u0002\u0010T\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020O\u0018\u00010\u0019H\u0007J\u000b\u0010U\u001a\u00028\u0000¢\u0006\u0002\u0010/J?\u0010U\u001a\u00028\u00002!\u0010\u0018\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020\u00170\u0019H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0002\u00100J\u0013\u0010V\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00028\u0000¢\u0006\u0002\u0010GJ\u0010\u0010W\u001a\u0004\u0018\u00018\u0000H\u0086\b¢\u0006\u0002\u0010/JA\u0010W\u001a\u0004\u0018\u00018\u00002!\u0010\u0018\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020\u00170\u0019H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0002\u00100J\u0006\u0010X\u001a\u00020\u0017J:\u0010Y\u001a\u00020\u00172!\u0010\u0018\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020\u00170\u0019H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J\b\u0010Z\u001a\u00020MH\u0016R\u0018\u0010\u0006\u001a\u00020\u00048\u0000@\u0000X\u0081\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u0007\u0010\bR\"\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\n8\u0000@\u0000X\u0081\u000e¢\u0006\n\n\u0002\u0010\f\u0012\u0004\b\u000b\u0010\bR\u0012\u0010\r\u001a\u00020\u000e8Æ\u0002¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0012\u0010\u0011\u001a\u00020\u00048Ç\u0002¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0013\u0082\u0001\u0001[\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\\"}, d2 = {"Landroidx/collection/ObjectList;", "E", "", "initialCapacity", "", "(I)V", "_size", "get_size$annotations", "()V", "content", "", "getContent$annotations", "[Ljava/lang/Object;", "indices", "Lkotlin/ranges/IntRange;", "getIndices", "()Lkotlin/ranges/IntRange;", "lastIndex", "getLastIndex", "()I", "size", "getSize", "any", "", "predicate", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "element", "asList", "", "contains", "(Ljava/lang/Object;)Z", "containsAll", "elements", "([Ljava/lang/Object;)Z", "", "count", "elementAt", "index", "(I)Ljava/lang/Object;", "elementAtOrElse", "defaultValue", "(ILkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "equals", "other", "first", "()Ljava/lang/Object;", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "firstOrNull", "fold", "R", "initial", "operation", "Lkotlin/Function2;", "acc", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "foldIndexed", "Lkotlin/Function3;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)Ljava/lang/Object;", "foldRight", "foldRightIndexed", "forEach", "", "block", "forEachIndexed", "forEachReversed", "forEachReversedIndexed", "get", "hashCode", "indexOf", "(Ljava/lang/Object;)I", "indexOfFirst", "indexOfLast", "isEmpty", "isNotEmpty", "joinToString", "", "separator", "", "prefix", "postfix", "limit", "truncated", "transform", "last", "lastIndexOf", "lastOrNull", "none", "reversedAny", "toString", "Landroidx/collection/MutableObjectList;", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class ObjectList<E> {
    public int _size;
    public java.lang.Object[] content;


    private ObjectList(int r2) {
            r1 = this;
            r1.<init>()
            if (r2 != 0) goto La
            java.lang.Object[] r0 = androidx.collection.ObjectListKt.access$getEmptyArray$p()
            goto Lc
        La:
            java.lang.Object[] r0 = new java.lang.Object[r2]
        Lc:
            r1.content = r0
            return
    }

    public /* synthetic */ ObjectList(int r1, kotlin.jvm.internal.DefaultConstructorMarker r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public static /* synthetic */ void getContent$annotations() {
            return
    }

    public static /* synthetic */ void get_size$annotations() {
            return
    }

    public static /* synthetic */ java.lang.String joinToString$default(androidx.collection.ObjectList r1, java.lang.CharSequence r2, java.lang.CharSequence r3, java.lang.CharSequence r4, int r5, java.lang.CharSequence r6, kotlin.jvm.functions.Function1 r7, int r8, java.lang.Object r9) {
            if (r9 != 0) goto L3a
            r9 = r8 & 1
            if (r9 == 0) goto La
            java.lang.String r2 = ", "
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
        La:
            r9 = r8 & 2
            java.lang.String r0 = ""
            if (r9 == 0) goto L13
            r3 = r0
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
        L13:
            r9 = r8 & 4
            if (r9 == 0) goto L1a
            r4 = r0
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
        L1a:
            r9 = r8 & 8
            if (r9 == 0) goto L1f
            r5 = -1
        L1f:
            r9 = r8 & 16
            if (r9 == 0) goto L27
            java.lang.String r6 = "..."
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
        L27:
            r8 = r8 & 32
            if (r8 == 0) goto L2e
            r7 = 0
            r9 = r7
            goto L2f
        L2e:
            r9 = r7
        L2f:
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
            java.lang.String r1 = r3.joinToString(r4, r5, r6, r7, r8, r9)
            return r1
        L3a:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Super calls with default arguments not supported in this target, function: joinToString"
            r1.<init>(r2)
            throw r1
    }

    public final boolean any() {
            r1 = this;
            boolean r0 = r1.isNotEmpty()
            return r0
    }

    public final boolean any(kotlin.jvm.functions.Function1<? super E, java.lang.Boolean> r10) {
            r9 = this;
            java.lang.String r0 = "predicate"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            r0 = 0
            r1 = r9
            r2 = 0
            java.lang.Object[] r3 = r1.content
            r4 = 0
            int r5 = r1._size
        Lf:
            if (r4 >= r5) goto L27
            r6 = r3[r4]
            r7 = 0
            java.lang.Object r8 = r10.invoke(r6)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L22
            r5 = 1
            return r5
        L22:
            int r4 = r4 + 1
            goto Lf
        L27:
            r1 = 0
            return r1
    }

    public abstract java.util.List<E> asList();

    public final boolean contains(E r2) {
            r1 = this;
            int r0 = r1.indexOf(r2)
            if (r0 < 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    public final boolean containsAll(androidx.collection.ObjectList<E> r9) {
            r8 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            r0 = r9
            r1 = 0
            java.lang.Object[] r2 = r0.content
            r3 = 0
            int r4 = r0._size
        Ld:
            if (r3 >= r4) goto L1f
            r5 = r2[r3]
            r6 = 0
            boolean r7 = r8.contains(r5)
            if (r7 != 0) goto L1a
            r4 = 0
            return r4
        L1a:
            int r3 = r3 + 1
            goto Ld
        L1f:
            r0 = 1
            return r0
    }

    public final boolean containsAll(java.lang.Iterable<? extends E> r8) {
            r7 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r0 = r8
            r1 = 0
            java.util.Iterator r2 = r0.iterator()
        Lb:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L22
            java.lang.Object r3 = r2.next()
            r4 = r3
            r5 = 0
            boolean r6 = r7.contains(r4)
            if (r6 != 0) goto L1f
            r2 = 0
            return r2
        L1f:
            goto Lb
        L22:
            r0 = 1
            return r0
    }

    public final boolean containsAll(java.util.List<? extends E> r4) {
            r3 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = 0
            int r1 = r4.size()
        La:
            if (r0 >= r1) goto L1b
            java.lang.Object r2 = r4.get(r0)
            boolean r2 = r3.contains(r2)
            if (r2 != 0) goto L18
            r1 = 0
            return r1
        L18:
            int r0 = r0 + 1
            goto La
        L1b:
            r0 = 1
            return r0
    }

    public final boolean containsAll(E[] r4) {
            r3 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = 0
            int r1 = r4.length
        L7:
            if (r0 >= r1) goto L16
            r2 = r4[r0]
            boolean r2 = r3.contains(r2)
            if (r2 != 0) goto L13
            r1 = 0
            return r1
        L13:
            int r0 = r0 + 1
            goto L7
        L16:
            r0 = 1
            return r0
    }

    public final int count() {
            r1 = this;
            int r0 = r1._size
            return r0
    }

    public final int count(kotlin.jvm.functions.Function1<? super E, java.lang.Boolean> r11) {
            r10 = this;
            java.lang.String r0 = "predicate"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            r0 = 0
            r1 = 0
            r2 = r10
            r3 = 0
            java.lang.Object[] r4 = r2.content
            r5 = 0
            int r6 = r2._size
        L10:
            if (r5 >= r6) goto L27
            r7 = r4[r5]
            r8 = 0
            java.lang.Object r9 = r11.invoke(r7)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L23
            int r1 = r1 + 1
        L23:
            int r5 = r5 + 1
            goto L10
        L27:
            return r1
    }

    public final E elementAt(int r7) {
            r6 = this;
            r0 = 1
            r1 = 0
            if (r7 < 0) goto L9
            int r2 = r6._size
            if (r7 >= r2) goto L9
            r1 = r0
        L9:
            if (r1 == 0) goto L10
            java.lang.Object[] r0 = r6.content
            r0 = r0[r7]
            return r0
        L10:
            java.lang.IndexOutOfBoundsException r1 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Index "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r7)
            java.lang.String r3 = " must be in 0.."
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r6
            r4 = 0
            int r5 = r3._size
            int r5 = r5 - r0
            java.lang.StringBuilder r0 = r2.append(r5)
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
    }

    public final E elementAtOrElse(int r4, kotlin.jvm.functions.Function1<? super java.lang.Integer, ? extends E> r5) {
            r3 = this;
            java.lang.String r0 = "defaultValue"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = 0
            r1 = 0
            if (r4 < 0) goto Le
            int r2 = r3._size
            if (r4 >= r2) goto Le
            r1 = 1
        Le:
            if (r1 != 0) goto L19
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            java.lang.Object r1 = r5.invoke(r1)
            return r1
        L19:
            java.lang.Object[] r1 = r3.content
            r1 = r1[r4]
            return r1
    }

    public boolean equals(java.lang.Object r8) {
            r7 = this;
            boolean r0 = r8 instanceof androidx.collection.ObjectList
            r1 = 0
            if (r0 == 0) goto L3a
            r0 = r8
            androidx.collection.ObjectList r0 = (androidx.collection.ObjectList) r0
            int r0 = r0._size
            int r2 = r7._size
            if (r0 == r2) goto Lf
            goto L3a
        Lf:
            java.lang.Object[] r0 = r7.content
            r2 = r8
            androidx.collection.ObjectList r2 = (androidx.collection.ObjectList) r2
            java.lang.Object[] r2 = r2.content
            r3 = r7
            r4 = 0
            int r5 = r3._size
            kotlin.ranges.IntRange r3 = kotlin.ranges.RangesKt.until(r1, r5)
            int r4 = r3.getFirst()
            int r3 = r3.getLast()
            if (r4 > r3) goto L38
        L28:
            r5 = r0[r4]
            r6 = r2[r4]
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual(r5, r6)
            if (r5 != 0) goto L33
            return r1
        L33:
            if (r4 == r3) goto L38
            int r4 = r4 + 1
            goto L28
        L38:
            r1 = 1
            return r1
        L3a:
            return r1
    }

    public final E first() {
            r2 = this;
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto Lc
            java.lang.Object[] r0 = r2.content
            r1 = 0
            r0 = r0[r1]
            return r0
        Lc:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            java.lang.String r1 = "ObjectList is empty."
            r0.<init>(r1)
            throw r0
    }

    public final E first(kotlin.jvm.functions.Function1<? super E, java.lang.Boolean> r10) {
            r9 = this;
            java.lang.String r0 = "predicate"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            r0 = 0
            r1 = r9
            r2 = 0
            java.lang.Object[] r3 = r1.content
            r4 = 0
            int r5 = r1._size
        Lf:
            if (r4 >= r5) goto L26
            r6 = r3[r4]
            r7 = 0
            java.lang.Object r8 = r10.invoke(r6)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L21
            return r6
        L21:
            int r4 = r4 + 1
            goto Lf
        L26:
            java.util.NoSuchElementException r1 = new java.util.NoSuchElementException
            java.lang.String r2 = "ObjectList contains no element matching the predicate."
            r1.<init>(r2)
            throw r1
    }

    public final E firstOrNull() {
            r2 = this;
            r0 = 0
            boolean r1 = r2.isEmpty()
            if (r1 == 0) goto L9
            r1 = 0
            goto Le
        L9:
            r1 = 0
            java.lang.Object r1 = r2.get(r1)
        Le:
            return r1
    }

    public final E firstOrNull(kotlin.jvm.functions.Function1<? super E, java.lang.Boolean> r10) {
            r9 = this;
            java.lang.String r0 = "predicate"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            r0 = 0
            r1 = r9
            r2 = 0
            java.lang.Object[] r3 = r1.content
            r4 = 0
            int r5 = r1._size
        Lf:
            if (r4 >= r5) goto L26
            r6 = r3[r4]
            r7 = 0
            java.lang.Object r8 = r10.invoke(r6)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L21
            return r6
        L21:
            int r4 = r4 + 1
            goto Lf
        L26:
            r1 = 0
            return r1
    }

    public final <R> R fold(R r10, kotlin.jvm.functions.Function2<? super R, ? super E, ? extends R> r11) {
            r9 = this;
            java.lang.String r0 = "operation"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            r0 = 0
            r1 = 0
            r1 = r10
            r2 = r9
            r3 = 0
            java.lang.Object[] r4 = r2.content
            r5 = 0
            int r6 = r2._size
        L11:
            if (r5 >= r6) goto L1f
            r7 = r4[r5]
            r8 = 0
            java.lang.Object r1 = r11.invoke(r1, r7)
            int r5 = r5 + 1
            goto L11
        L1f:
            return r1
    }

    public final <R> R foldIndexed(R r12, kotlin.jvm.functions.Function3<? super java.lang.Integer, ? super R, ? super E, ? extends R> r13) {
            r11 = this;
            java.lang.String r0 = "operation"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            r0 = 0
            r1 = 0
            r1 = r12
            r2 = r11
            r3 = 0
            java.lang.Object[] r4 = r2.content
            r5 = 0
            int r6 = r2._size
        L11:
            if (r5 >= r6) goto L24
            r7 = r4[r5]
            r8 = r5
            r9 = 0
            java.lang.Integer r10 = java.lang.Integer.valueOf(r8)
            java.lang.Object r1 = r13.invoke(r10, r1, r7)
            int r5 = r5 + 1
            goto L11
        L24:
            return r1
    }

    public final <R> R foldRight(R r9, kotlin.jvm.functions.Function2<? super E, ? super R, ? extends R> r10) {
            r8 = this;
            java.lang.String r0 = "operation"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            r0 = 0
            r1 = 0
            r1 = r9
            r2 = r8
            r3 = 0
            java.lang.Object[] r4 = r2.content
            int r5 = r2._size
            int r5 = r5 + (-1)
        L12:
            r6 = -1
            if (r6 >= r5) goto L21
            r6 = r4[r5]
            r7 = 0
            java.lang.Object r1 = r10.invoke(r6, r1)
            int r5 = r5 + (-1)
            goto L12
        L21:
            return r1
    }

    public final <R> R foldRightIndexed(R r11, kotlin.jvm.functions.Function3<? super java.lang.Integer, ? super E, ? super R, ? extends R> r12) {
            r10 = this;
            java.lang.String r0 = "operation"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            r0 = 0
            r1 = 0
            r1 = r11
            r2 = r10
            r3 = 0
            java.lang.Object[] r4 = r2.content
            int r5 = r2._size
            int r5 = r5 + (-1)
        L12:
            r6 = -1
            if (r6 >= r5) goto L26
            r6 = r4[r5]
            r7 = r5
            r8 = 0
            java.lang.Integer r9 = java.lang.Integer.valueOf(r7)
            java.lang.Object r1 = r12.invoke(r9, r6, r1)
            int r5 = r5 + (-1)
            goto L12
        L26:
            return r1
    }

    public final void forEach(kotlin.jvm.functions.Function1<? super E, kotlin.Unit> r6) {
            r5 = this;
            java.lang.String r0 = "block"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            r0 = 0
            java.lang.Object[] r1 = r5.content
            r2 = 0
            int r3 = r5._size
        Lc:
            if (r2 >= r3) goto L16
            r4 = r1[r2]
            r6.invoke(r4)
            int r2 = r2 + 1
            goto Lc
        L16:
            return
    }

    public final void forEachIndexed(kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super E, kotlin.Unit> r7) {
            r6 = this;
            java.lang.String r0 = "block"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            r0 = 0
            java.lang.Object[] r1 = r6.content
            r2 = 0
            int r3 = r6._size
        Lc:
            if (r2 >= r3) goto L1a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            r5 = r1[r2]
            r7.invoke(r4, r5)
            int r2 = r2 + 1
            goto Lc
        L1a:
            return
    }

    public final void forEachReversed(kotlin.jvm.functions.Function1<? super E, kotlin.Unit> r5) {
            r4 = this;
            java.lang.String r0 = "block"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = 0
            java.lang.Object[] r1 = r4.content
            int r2 = r4._size
            int r2 = r2 + (-1)
        Ld:
            r3 = -1
            if (r3 >= r2) goto L18
            r3 = r1[r2]
            r5.invoke(r3)
            int r2 = r2 + (-1)
            goto Ld
        L18:
            return
    }

    public final void forEachReversedIndexed(kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super E, kotlin.Unit> r6) {
            r5 = this;
            java.lang.String r0 = "block"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            r0 = 0
            java.lang.Object[] r1 = r5.content
            int r2 = r5._size
            int r2 = r2 + (-1)
        Ld:
            r3 = -1
            if (r3 >= r2) goto L1c
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r4 = r1[r2]
            r6.invoke(r3, r4)
            int r2 = r2 + (-1)
            goto Ld
        L1c:
            return
    }

    public final E get(int r7) {
            r6 = this;
            r0 = 1
            r1 = 0
            if (r7 < 0) goto L9
            int r2 = r6._size
            if (r7 >= r2) goto L9
            r1 = r0
        L9:
            if (r1 == 0) goto L10
            java.lang.Object[] r0 = r6.content
            r0 = r0[r7]
            return r0
        L10:
            java.lang.IndexOutOfBoundsException r1 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Index "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r7)
            java.lang.String r3 = " must be in 0.."
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r6
            r4 = 0
            int r5 = r3._size
            int r5 = r5 - r0
            java.lang.StringBuilder r0 = r2.append(r5)
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
    }

    public final kotlin.ranges.IntRange getIndices() {
            r3 = this;
            r0 = 0
            r1 = 0
            int r2 = r3._size
            kotlin.ranges.IntRange r1 = kotlin.ranges.RangesKt.until(r1, r2)
            return r1
    }

    public final int getLastIndex() {
            r2 = this;
            r0 = 0
            int r1 = r2._size
            int r1 = r1 + (-1)
            return r1
    }

    public final int getSize() {
            r1 = this;
            int r0 = r1._size
            return r0
    }

    public int hashCode() {
            r9 = this;
            r0 = 0
            r1 = r9
            r2 = 0
            java.lang.Object[] r3 = r1.content
            r4 = 0
            int r5 = r1._size
        L9:
            if (r4 >= r5) goto L1e
            r6 = r3[r4]
            r7 = 0
            if (r6 == 0) goto L15
            int r8 = r6.hashCode()
            goto L16
        L15:
            r8 = 0
        L16:
            int r8 = r8 * 31
            int r0 = r0 + r8
            int r4 = r4 + 1
            goto L9
        L1e:
            return r0
    }

    public final int indexOf(E r10) {
            r9 = this;
            if (r10 != 0) goto L1a
            r0 = r9
            r1 = 0
            java.lang.Object[] r2 = r0.content
            r3 = 0
            int r4 = r0._size
        La:
            if (r3 >= r4) goto L18
            r5 = r2[r3]
            r6 = r3
            r7 = 0
            if (r5 != 0) goto L13
            return r6
        L13:
            int r3 = r3 + 1
            goto La
        L18:
            goto L35
        L1a:
            r0 = r9
            r1 = 0
            java.lang.Object[] r2 = r0.content
            r3 = 0
            int r4 = r0._size
        L22:
            if (r3 >= r4) goto L34
            r5 = r2[r3]
            r6 = r3
            r7 = 0
            boolean r8 = r10.equals(r5)
            if (r8 == 0) goto L2f
            return r6
        L2f:
            int r3 = r3 + 1
            goto L22
        L34:
        L35:
            r0 = -1
            return r0
    }

    public final int indexOfFirst(kotlin.jvm.functions.Function1<? super E, java.lang.Boolean> r11) {
            r10 = this;
            java.lang.String r0 = "predicate"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            r0 = 0
            r1 = r10
            r2 = 0
            java.lang.Object[] r3 = r1.content
            r4 = 0
            int r5 = r1._size
        Lf:
            if (r4 >= r5) goto L27
            r6 = r3[r4]
            r7 = r4
            r8 = 0
            java.lang.Object r9 = r11.invoke(r6)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L22
            return r7
        L22:
            int r4 = r4 + 1
            goto Lf
        L27:
            r1 = -1
            return r1
    }

    public final int indexOfLast(kotlin.jvm.functions.Function1<? super E, java.lang.Boolean> r10) {
            r9 = this;
            java.lang.String r0 = "predicate"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            r0 = 0
            r1 = r9
            r2 = 0
            java.lang.Object[] r3 = r1.content
            int r4 = r1._size
            int r4 = r4 + (-1)
        L10:
            r5 = -1
            if (r5 >= r4) goto L29
            r5 = r3[r4]
            r6 = r4
            r7 = 0
            java.lang.Object r8 = r10.invoke(r5)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L24
            return r6
        L24:
            int r4 = r4 + (-1)
            goto L10
        L29:
            return r5
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
            r9 = this;
            r7 = 63
            r8 = 0
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r0 = r9
            java.lang.String r1 = joinToString$default(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return r1
    }

    public final java.lang.String joinToString(java.lang.CharSequence r11) {
            r10 = this;
            java.lang.String r0 = "separator"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            r8 = 62
            r9 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r1 = r10
            r2 = r11
            java.lang.String r11 = joinToString$default(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return r11
    }

    public final java.lang.String joinToString(java.lang.CharSequence r11, java.lang.CharSequence r12) {
            r10 = this;
            java.lang.String r0 = "separator"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.lang.String r0 = "prefix"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            r8 = 60
            r9 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r1 = r10
            r2 = r11
            r3 = r12
            java.lang.String r11 = joinToString$default(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return r11
    }

    public final java.lang.String joinToString(java.lang.CharSequence r11, java.lang.CharSequence r12, java.lang.CharSequence r13) {
            r10 = this;
            java.lang.String r0 = "separator"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.lang.String r0 = "prefix"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            java.lang.String r0 = "postfix"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            r8 = 56
            r9 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            java.lang.String r11 = joinToString$default(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return r11
    }

    public final java.lang.String joinToString(java.lang.CharSequence r11, java.lang.CharSequence r12, java.lang.CharSequence r13, int r14) {
            r10 = this;
            java.lang.String r0 = "separator"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.lang.String r0 = "prefix"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            java.lang.String r0 = "postfix"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            r8 = 48
            r9 = 0
            r6 = 0
            r7 = 0
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            java.lang.String r11 = joinToString$default(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return r11
    }

    public final java.lang.String joinToString(java.lang.CharSequence r11, java.lang.CharSequence r12, java.lang.CharSequence r13, int r14, java.lang.CharSequence r15) {
            r10 = this;
            java.lang.String r0 = "separator"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.lang.String r0 = "prefix"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            java.lang.String r0 = "postfix"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            java.lang.String r0 = "truncated"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
            r8 = 32
            r9 = 0
            r7 = 0
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            java.lang.String r11 = joinToString$default(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return r11
    }

    public final java.lang.String joinToString(java.lang.CharSequence r18, java.lang.CharSequence r19, java.lang.CharSequence r20, int r21, java.lang.CharSequence r22, kotlin.jvm.functions.Function1<? super E, ? extends java.lang.CharSequence> r23) {
            r17 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r22
            r4 = r23
            java.lang.String r5 = "separator"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r5)
            java.lang.String r5 = "prefix"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r5)
            java.lang.String r5 = "postfix"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r5)
            java.lang.String r5 = "truncated"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r6 = r5
            r7 = 0
            r6.append(r1)
            r8 = r17
            r9 = 0
            java.lang.Object[] r10 = r8.content
            r11 = 0
            int r12 = r8._size
        L31:
            if (r11 >= r12) goto L5e
            r13 = r10[r11]
            r14 = r11
            r15 = 0
            r1 = r21
            if (r14 != r1) goto L3f
            r6.append(r3)
            goto L65
        L3f:
            if (r14 == 0) goto L44
            r6.append(r0)
        L44:
            if (r4 != 0) goto L4a
            r6.append(r13)
            goto L55
        L4a:
            java.lang.Object r16 = r4.invoke(r13)
            r0 = r16
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r6.append(r0)
        L55:
            int r11 = r11 + 1
            r0 = r18
            r1 = r19
            goto L31
        L5e:
            r1 = r21
            r6.append(r2)
        L65:
            java.lang.String r0 = r5.toString()
            java.lang.String r5 = "StringBuilder().apply(builderAction).toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r5)
            return r0
    }

    public final E last() {
            r4 = this;
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L11
            java.lang.Object[] r0 = r4.content
            r1 = r4
            r2 = 0
            int r3 = r1._size
            int r3 = r3 + (-1)
            r0 = r0[r3]
            return r0
        L11:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            java.lang.String r1 = "ObjectList is empty."
            r0.<init>(r1)
            throw r0
    }

    public final E last(kotlin.jvm.functions.Function1<? super E, java.lang.Boolean> r9) {
            r8 = this;
            java.lang.String r0 = "predicate"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            r0 = 0
            r1 = r8
            r2 = 0
            java.lang.Object[] r3 = r1.content
            int r4 = r1._size
            int r4 = r4 + (-1)
        L10:
            r5 = -1
            if (r5 >= r4) goto L28
            r5 = r3[r4]
            r6 = 0
            java.lang.Object r7 = r9.invoke(r5)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L23
            return r5
        L23:
            int r4 = r4 + (-1)
            goto L10
        L28:
            java.util.NoSuchElementException r1 = new java.util.NoSuchElementException
            java.lang.String r2 = "ObjectList contains no element matching the predicate."
            r1.<init>(r2)
            throw r1
    }

    public final int lastIndexOf(E r10) {
            r9 = this;
            r0 = -1
            if (r10 != 0) goto L1c
            r1 = r9
            r2 = 0
            java.lang.Object[] r3 = r1.content
            int r4 = r1._size
            int r4 = r4 + (-1)
        Lc:
            if (r0 >= r4) goto L1a
            r5 = r3[r4]
            r6 = r4
            r7 = 0
            if (r5 != 0) goto L15
            return r6
        L15:
            int r4 = r4 + (-1)
            goto Lc
        L1a:
            goto L38
        L1c:
            r1 = r9
            r2 = 0
            java.lang.Object[] r3 = r1.content
            int r4 = r1._size
            int r4 = r4 + (-1)
        L25:
            if (r0 >= r4) goto L37
            r5 = r3[r4]
            r6 = r4
            r7 = 0
            boolean r8 = r10.equals(r5)
            if (r8 == 0) goto L32
            return r6
        L32:
            int r4 = r4 + (-1)
            goto L25
        L37:
        L38:
            return r0
    }

    public final E lastOrNull() {
            r5 = this;
            r0 = 0
            boolean r1 = r5.isEmpty()
            if (r1 == 0) goto L9
            r1 = 0
            goto L13
        L9:
            java.lang.Object[] r1 = r5.content
            r2 = r5
            r3 = 0
            int r4 = r2._size
            int r4 = r4 + (-1)
            r1 = r1[r4]
        L13:
            return r1
    }

    public final E lastOrNull(kotlin.jvm.functions.Function1<? super E, java.lang.Boolean> r9) {
            r8 = this;
            java.lang.String r0 = "predicate"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            r0 = 0
            r1 = r8
            r2 = 0
            java.lang.Object[] r3 = r1.content
            int r4 = r1._size
            int r4 = r4 + (-1)
        L10:
            r5 = -1
            if (r5 >= r4) goto L28
            r5 = r3[r4]
            r6 = 0
            java.lang.Object r7 = r9.invoke(r5)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L23
            return r5
        L23:
            int r4 = r4 + (-1)
            goto L10
        L28:
            r1 = 0
            return r1
    }

    public final boolean none() {
            r1 = this;
            boolean r0 = r1.isEmpty()
            return r0
    }

    public final boolean reversedAny(kotlin.jvm.functions.Function1<? super E, java.lang.Boolean> r10) {
            r9 = this;
            java.lang.String r0 = "predicate"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            r0 = 0
            r1 = r9
            r2 = 0
            java.lang.Object[] r3 = r1.content
            int r4 = r1._size
            r5 = 1
            int r4 = r4 - r5
        L10:
            r6 = -1
            if (r6 >= r4) goto L28
            r6 = r3[r4]
            r7 = 0
            java.lang.Object r8 = r10.invoke(r6)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L23
            return r5
        L23:
            int r4 = r4 + (-1)
            goto L10
        L28:
            r1 = 0
            return r1
    }

    public java.lang.String toString() {
            r10 = this;
            java.lang.String r0 = "["
            r3 = r0
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            java.lang.String r0 = "]"
            r4 = r0
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            androidx.collection.ObjectList$toString$1 r0 = new androidx.collection.ObjectList$toString$1
            r0.<init>(r10)
            r7 = r0
            kotlin.jvm.functions.Function1 r7 = (kotlin.jvm.functions.Function1) r7
            r8 = 25
            r9 = 0
            r2 = 0
            r5 = 0
            r6 = 0
            r1 = r10
            java.lang.String r0 = joinToString$default(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return r0
    }
}
