package androidx.collection;

/* JADX INFO: compiled from: IntList.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0014\u001a\u00020\u0015J:\u0010\u0014\u001a\u00020\u00152!\u0010\u0016\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\u00150\u0017H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J\u0011\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u0003H\u0086\u0002J\u000e\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u0000J\u0006\u0010\u001e\u001a\u00020\u0003J:\u0010\u001e\u001a\u00020\u00032!\u0010\u0016\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\u00150\u0017H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J\u0010\u0010\u001f\u001a\u00020\u00032\b\b\u0001\u0010 \u001a\u00020\u0003J9\u0010!\u001a\u00020\u00032\b\b\u0001\u0010 \u001a\u00020\u00032!\u0010\"\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b( \u0012\u0004\u0012\u00020\u00030\u0017H\u0086\bø\u0001\u0000J\u0013\u0010#\u001a\u00020\u00152\b\u0010$\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\u0006\u0010%\u001a\u00020\u0003J:\u0010%\u001a\u00020\u00032!\u0010\u0016\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\u00150\u0017H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001Jb\u0010&\u001a\u0002H'\"\u0004\b\u0000\u0010'2\u0006\u0010(\u001a\u0002H'26\u0010)\u001a2\u0012\u0013\u0012\u0011H'¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(+\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u0002H'0*H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0002\u0010,Jw\u0010-\u001a\u0002H'\"\u0004\b\u0000\u0010'2\u0006\u0010(\u001a\u0002H'2K\u0010)\u001aG\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b( \u0012\u0013\u0012\u0011H'¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(+\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u0002H'0.H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0002\u0010/Jb\u00100\u001a\u0002H'\"\u0004\b\u0000\u0010'2\u0006\u0010(\u001a\u0002H'26\u0010)\u001a2\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001a\u0012\u0013\u0012\u0011H'¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(+\u0012\u0004\u0012\u0002H'0*H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0002\u0010,Jw\u00101\u001a\u0002H'\"\u0004\b\u0000\u0010'2\u0006\u0010(\u001a\u0002H'2K\u0010)\u001aG\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b( \u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001a\u0012\u0013\u0012\u0011H'¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(+\u0012\u0004\u0012\u0002H'0.H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0002\u0010/J:\u00102\u001a\u0002032!\u00104\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u0002030\u0017H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001JO\u00105\u001a\u00020326\u00104\u001a2\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b( \u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u0002030*H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J:\u00106\u001a\u0002032!\u00104\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u0002030\u0017H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001JO\u00107\u001a\u00020326\u00104\u001a2\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b( \u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u0002030*H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J\u0013\u00108\u001a\u00020\u00032\b\b\u0001\u0010 \u001a\u00020\u0003H\u0086\u0002J\b\u00109\u001a\u00020\u0003H\u0016J\u000e\u0010:\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u0003J:\u0010;\u001a\u00020\u00032!\u0010\u0016\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\u00150\u0017H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J:\u0010<\u001a\u00020\u00032!\u0010\u0016\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\u00150\u0017H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J\u0006\u0010=\u001a\u00020\u0015J\u0006\u0010>\u001a\u00020\u0015J:\u0010?\u001a\u00020@2\b\b\u0002\u0010A\u001a\u00020B2\b\b\u0002\u0010C\u001a\u00020B2\b\b\u0002\u0010D\u001a\u00020B2\b\b\u0002\u0010E\u001a\u00020\u00032\b\b\u0002\u0010F\u001a\u00020BH\u0007JT\u0010?\u001a\u00020@2\b\b\u0002\u0010A\u001a\u00020B2\b\b\u0002\u0010C\u001a\u00020B2\b\b\u0002\u0010D\u001a\u00020B2\b\b\u0002\u0010E\u001a\u00020\u00032\b\b\u0002\u0010F\u001a\u00020B2\u0014\b\u0004\u0010G\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020B0\u0017H\u0087\bø\u0001\u0000J\u0006\u0010H\u001a\u00020\u0003J:\u0010H\u001a\u00020\u00032!\u0010\u0016\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\u00150\u0017H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J\u000e\u0010I\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u0003J\u0006\u0010J\u001a\u00020\u0015J:\u0010K\u001a\u00020\u00152!\u0010\u0016\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\u00150\u0017H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J\b\u0010L\u001a\u00020@H\u0016R\u0018\u0010\u0005\u001a\u00020\u00038\u0000@\u0000X\u0081\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0007R\u0018\u0010\b\u001a\u00020\t8\u0000@\u0000X\u0081\u000e¢\u0006\b\n\u0000\u0012\u0004\b\n\u0010\u0007R\u0012\u0010\u000b\u001a\u00020\f8Æ\u0002¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0012\u0010\u000f\u001a\u00020\u00038Ç\u0002¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\u00038G¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011\u0082\u0001\u0001M\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006N"}, d2 = {"Landroidx/collection/IntList;", "", "initialCapacity", "", "(I)V", "_size", "get_size$annotations", "()V", "content", "", "getContent$annotations", "indices", "Lkotlin/ranges/IntRange;", "getIndices", "()Lkotlin/ranges/IntRange;", "lastIndex", "getLastIndex", "()I", "size", "getSize", "any", "", "predicate", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "element", "contains", "containsAll", "elements", "count", "elementAt", "index", "elementAtOrElse", "defaultValue", "equals", "other", "first", "fold", "R", "initial", "operation", "Lkotlin/Function2;", "acc", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "foldIndexed", "Lkotlin/Function3;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)Ljava/lang/Object;", "foldRight", "foldRightIndexed", "forEach", "", "block", "forEachIndexed", "forEachReversed", "forEachReversedIndexed", "get", "hashCode", "indexOf", "indexOfFirst", "indexOfLast", "isEmpty", "isNotEmpty", "joinToString", "", "separator", "", "prefix", "postfix", "limit", "truncated", "transform", "last", "lastIndexOf", "none", "reversedAny", "toString", "Landroidx/collection/MutableIntList;", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class IntList {
    public int _size;
    public int[] content;

    private IntList(int r2) {
            r1 = this;
            r1.<init>()
            if (r2 != 0) goto La
            int[] r0 = androidx.collection.IntSetKt.getEmptyIntArray()
            goto Lc
        La:
            int[] r0 = new int[r2]
        Lc:
            r1.content = r0
            return
    }

    public /* synthetic */ IntList(int r1, kotlin.jvm.internal.DefaultConstructorMarker r2) {
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

    public static /* synthetic */ java.lang.String joinToString$default(androidx.collection.IntList r1, java.lang.CharSequence r2, java.lang.CharSequence r3, java.lang.CharSequence r4, int r5, java.lang.CharSequence r6, int r7, java.lang.Object r8) {
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

    public static /* synthetic */ java.lang.String joinToString$default(androidx.collection.IntList r17, java.lang.CharSequence r18, java.lang.CharSequence r19, java.lang.CharSequence r20, int r21, java.lang.CharSequence r22, kotlin.jvm.functions.Function1 r23, int r24, java.lang.Object r25) {
            r0 = r23
            if (r25 != 0) goto Laa
            r1 = r24 & 1
            if (r1 == 0) goto Ld
            java.lang.String r1 = ", "
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            goto Lf
        Ld:
            r1 = r18
        Lf:
            r2 = r24 & 2
            java.lang.String r3 = ""
            if (r2 == 0) goto L19
            r2 = r3
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            goto L1b
        L19:
            r2 = r19
        L1b:
            r4 = r24 & 4
            if (r4 == 0) goto L22
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            goto L24
        L22:
            r3 = r20
        L24:
            r4 = r24 & 8
            if (r4 == 0) goto L2a
            r4 = -1
            goto L2c
        L2a:
            r4 = r21
        L2c:
            r5 = r24 & 16
            if (r5 == 0) goto L35
            java.lang.String r5 = "..."
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            goto L37
        L35:
            r5 = r22
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
            r10 = r17
            r11 = 0
            int[] r12 = r10.content
            r13 = 0
            int r14 = r10._size
        L64:
            if (r13 >= r14) goto L97
            r15 = r12[r13]
            r16 = r13
            r18 = r16
            r16 = 0
            r19 = r2
            r2 = r18
            if (r2 != r4) goto L7a
            r8.append(r5)
            r18 = r1
            goto La0
        L7a:
            if (r2 == 0) goto L7f
            r8.append(r1)
        L7f:
            r18 = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r15)
            java.lang.Object r1 = r0.invoke(r1)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r8.append(r1)
            int r13 = r13 + 1
            r1 = r18
            r2 = r19
            goto L64
        L97:
            r18 = r1
            r19 = r2
            r8.append(r3)
        La0:
            java.lang.String r1 = r7.toString()
            java.lang.String r2 = "StringBuilder().apply(builderAction).toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            return r1
        Laa:
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

    public final boolean any(kotlin.jvm.functions.Function1<? super java.lang.Integer, java.lang.Boolean> r10) {
            r9 = this;
            java.lang.String r0 = "predicate"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            r0 = 0
            r1 = r9
            r2 = 0
            int[] r3 = r1.content
            r4 = 0
            int r5 = r1._size
        Lf:
            if (r4 >= r5) goto L2b
            r6 = r3[r4]
            r7 = 0
            java.lang.Integer r8 = java.lang.Integer.valueOf(r6)
            java.lang.Object r8 = r10.invoke(r8)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L26
            r5 = 1
            return r5
        L26:
            int r4 = r4 + 1
            goto Lf
        L2b:
            r1 = 0
            return r1
    }

    public final boolean contains(int r8) {
            r7 = this;
            r0 = r7
            r1 = 0
            int[] r2 = r0.content
            r3 = 0
            int r4 = r0._size
        L8:
            if (r3 >= r4) goto L16
            r5 = r2[r3]
            r6 = 0
            if (r5 != r8) goto L11
            r4 = 1
            return r4
        L11:
            int r3 = r3 + 1
            goto L8
        L16:
            r0 = 0
            return r0
    }

    public final boolean containsAll(androidx.collection.IntList r5) {
            r4 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = r5
            r1 = 0
            int r2 = r0._size
            r3 = 0
            kotlin.ranges.IntRange r0 = kotlin.ranges.RangesKt.until(r3, r2)
            int r1 = r0.getFirst()
            int r0 = r0.getLast()
            if (r1 > r0) goto L28
        L18:
            int r2 = r5.get(r1)
            boolean r2 = r4.contains(r2)
            if (r2 != 0) goto L23
            return r3
        L23:
            if (r1 == r0) goto L28
            int r1 = r1 + 1
            goto L18
        L28:
            r0 = 1
            return r0
    }

    public final int count() {
            r1 = this;
            int r0 = r1._size
            return r0
    }

    public final int count(kotlin.jvm.functions.Function1<? super java.lang.Integer, java.lang.Boolean> r11) {
            r10 = this;
            java.lang.String r0 = "predicate"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            r0 = 0
            r1 = 0
            r2 = r10
            r3 = 0
            int[] r4 = r2.content
            r5 = 0
            int r6 = r2._size
        L10:
            if (r5 >= r6) goto L2b
            r7 = r4[r5]
            r8 = 0
            java.lang.Integer r9 = java.lang.Integer.valueOf(r7)
            java.lang.Object r9 = r11.invoke(r9)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L27
            int r1 = r1 + 1
        L27:
            int r5 = r5 + 1
            goto L10
        L2b:
            return r1
    }

    public final int elementAt(int r7) {
            r6 = this;
            r0 = 1
            r1 = 0
            if (r7 < 0) goto L9
            int r2 = r6._size
            if (r7 >= r2) goto L9
            r1 = r0
        L9:
            if (r1 == 0) goto L10
            int[] r0 = r6.content
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

    public final int elementAtOrElse(int r4, kotlin.jvm.functions.Function1<? super java.lang.Integer, java.lang.Integer> r5) {
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
            if (r1 != 0) goto L1f
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            java.lang.Object r1 = r5.invoke(r1)
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            return r1
        L1f:
            int[] r1 = r3.content
            r1 = r1[r4]
            return r1
    }

    public boolean equals(java.lang.Object r8) {
            r7 = this;
            boolean r0 = r8 instanceof androidx.collection.IntList
            r1 = 0
            if (r0 == 0) goto L36
            r0 = r8
            androidx.collection.IntList r0 = (androidx.collection.IntList) r0
            int r0 = r0._size
            int r2 = r7._size
            if (r0 == r2) goto Lf
            goto L36
        Lf:
            int[] r0 = r7.content
            r2 = r8
            androidx.collection.IntList r2 = (androidx.collection.IntList) r2
            int[] r2 = r2.content
            r3 = r7
            r4 = 0
            int r5 = r3._size
            kotlin.ranges.IntRange r3 = kotlin.ranges.RangesKt.until(r1, r5)
            int r4 = r3.getFirst()
            int r3 = r3.getLast()
            if (r4 > r3) goto L34
        L28:
            r5 = r0[r4]
            r6 = r2[r4]
            if (r5 == r6) goto L2f
            return r1
        L2f:
            if (r4 == r3) goto L34
            int r4 = r4 + 1
            goto L28
        L34:
            r1 = 1
            return r1
        L36:
            return r1
    }

    public final int first() {
            r2 = this;
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto Lc
            int[] r0 = r2.content
            r1 = 0
            r0 = r0[r1]
            return r0
        Lc:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            java.lang.String r1 = "IntList is empty."
            r0.<init>(r1)
            throw r0
    }

    public final int first(kotlin.jvm.functions.Function1<? super java.lang.Integer, java.lang.Boolean> r10) {
            r9 = this;
            java.lang.String r0 = "predicate"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            r0 = 0
            r1 = r9
            r2 = 0
            int[] r3 = r1.content
            r4 = 0
            int r5 = r1._size
        Lf:
            if (r4 >= r5) goto L2a
            r6 = r3[r4]
            r7 = 0
            java.lang.Integer r8 = java.lang.Integer.valueOf(r6)
            java.lang.Object r8 = r10.invoke(r8)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L25
            return r6
        L25:
            int r4 = r4 + 1
            goto Lf
        L2a:
            java.util.NoSuchElementException r1 = new java.util.NoSuchElementException
            java.lang.String r2 = "IntList contains no element matching the predicate."
            r1.<init>(r2)
            throw r1
    }

    public final <R> R fold(R r11, kotlin.jvm.functions.Function2<? super R, ? super java.lang.Integer, ? extends R> r12) {
            r10 = this;
            java.lang.String r0 = "operation"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            r0 = 0
            r1 = 0
            r1 = r11
            r2 = r10
            r3 = 0
            int[] r4 = r2.content
            r5 = 0
            int r6 = r2._size
        L11:
            if (r5 >= r6) goto L23
            r7 = r4[r5]
            r8 = 0
            java.lang.Integer r9 = java.lang.Integer.valueOf(r7)
            java.lang.Object r1 = r12.invoke(r1, r9)
            int r5 = r5 + 1
            goto L11
        L23:
            return r1
    }

    public final <R> R foldIndexed(R r13, kotlin.jvm.functions.Function3<? super java.lang.Integer, ? super R, ? super java.lang.Integer, ? extends R> r14) {
            r12 = this;
            java.lang.String r0 = "operation"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            r0 = 0
            r1 = 0
            r1 = r13
            r2 = r12
            r3 = 0
            int[] r4 = r2.content
            r5 = 0
            int r6 = r2._size
        L11:
            if (r5 >= r6) goto L28
            r7 = r4[r5]
            r8 = r5
            r9 = 0
            java.lang.Integer r10 = java.lang.Integer.valueOf(r8)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r7)
            java.lang.Object r1 = r14.invoke(r10, r1, r11)
            int r5 = r5 + 1
            goto L11
        L28:
            return r1
    }

    public final <R> R foldRight(R r10, kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super R, ? extends R> r11) {
            r9 = this;
            java.lang.String r0 = "operation"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            r0 = 0
            r1 = 0
            r1 = r10
            r2 = r9
            r3 = 0
            int[] r4 = r2.content
            int r5 = r2._size
            int r5 = r5 + (-1)
        L12:
            r6 = -1
            if (r6 >= r5) goto L25
            r6 = r4[r5]
            r7 = 0
            java.lang.Integer r8 = java.lang.Integer.valueOf(r6)
            java.lang.Object r1 = r11.invoke(r8, r1)
            int r5 = r5 + (-1)
            goto L12
        L25:
            return r1
    }

    public final <R> R foldRightIndexed(R r12, kotlin.jvm.functions.Function3<? super java.lang.Integer, ? super java.lang.Integer, ? super R, ? extends R> r13) {
            r11 = this;
            java.lang.String r0 = "operation"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            r0 = 0
            r1 = 0
            r1 = r12
            r2 = r11
            r3 = 0
            int[] r4 = r2.content
            int r5 = r2._size
            int r5 = r5 + (-1)
        L12:
            r6 = -1
            if (r6 >= r5) goto L2a
            r6 = r4[r5]
            r7 = r5
            r8 = 0
            java.lang.Integer r9 = java.lang.Integer.valueOf(r7)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r6)
            java.lang.Object r1 = r13.invoke(r9, r10, r1)
            int r5 = r5 + (-1)
            goto L12
        L2a:
            return r1
    }

    public final void forEach(kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> r6) {
            r5 = this;
            java.lang.String r0 = "block"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            r0 = 0
            int[] r1 = r5.content
            r2 = 0
            int r3 = r5._size
        Lc:
            if (r2 >= r3) goto L1a
            r4 = r1[r2]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r6.invoke(r4)
            int r2 = r2 + 1
            goto Lc
        L1a:
            return
    }

    public final void forEachIndexed(kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super java.lang.Integer, kotlin.Unit> r7) {
            r6 = this;
            java.lang.String r0 = "block"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            r0 = 0
            int[] r1 = r6.content
            r2 = 0
            int r3 = r6._size
        Lc:
            if (r2 >= r3) goto L1e
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            r5 = r1[r2]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r7.invoke(r4, r5)
            int r2 = r2 + 1
            goto Lc
        L1e:
            return
    }

    public final void forEachReversed(kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> r5) {
            r4 = this;
            java.lang.String r0 = "block"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = 0
            int[] r1 = r4.content
            int r2 = r4._size
            int r2 = r2 + (-1)
        Ld:
            r3 = -1
            if (r3 >= r2) goto L1c
            r3 = r1[r2]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r5.invoke(r3)
            int r2 = r2 + (-1)
            goto Ld
        L1c:
            return
    }

    public final void forEachReversedIndexed(kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super java.lang.Integer, kotlin.Unit> r6) {
            r5 = this;
            java.lang.String r0 = "block"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            r0 = 0
            int[] r1 = r5.content
            int r2 = r5._size
            int r2 = r2 + (-1)
        Ld:
            r3 = -1
            if (r3 >= r2) goto L20
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r4 = r1[r2]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r6.invoke(r3, r4)
            int r2 = r2 + (-1)
            goto Ld
        L20:
            return
    }

    public final int get(int r7) {
            r6 = this;
            r0 = 1
            r1 = 0
            if (r7 < 0) goto L9
            int r2 = r6._size
            if (r7 >= r2) goto L9
            r1 = r0
        L9:
            if (r1 == 0) goto L10
            int[] r0 = r6.content
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
            int[] r3 = r1.content
            r4 = 0
            int r5 = r1._size
        L9:
            if (r4 >= r5) goto L1a
            r6 = r3[r4]
            r7 = 0
            int r8 = java.lang.Integer.hashCode(r6)
            int r8 = r8 * 31
            int r0 = r0 + r8
            int r4 = r4 + 1
            goto L9
        L1a:
            return r0
    }

    public final int indexOf(int r9) {
            r8 = this;
            r0 = r8
            r1 = 0
            int[] r2 = r0.content
            r3 = 0
            int r4 = r0._size
        L8:
            if (r3 >= r4) goto L16
            r5 = r2[r3]
            r6 = r3
            r7 = 0
            if (r9 != r5) goto L11
            return r6
        L11:
            int r3 = r3 + 1
            goto L8
        L16:
            r0 = -1
            return r0
    }

    public final int indexOfFirst(kotlin.jvm.functions.Function1<? super java.lang.Integer, java.lang.Boolean> r11) {
            r10 = this;
            java.lang.String r0 = "predicate"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            r0 = 0
            r1 = r10
            r2 = 0
            int[] r3 = r1.content
            r4 = 0
            int r5 = r1._size
        Lf:
            if (r4 >= r5) goto L2b
            r6 = r3[r4]
            r7 = r4
            r8 = 0
            java.lang.Integer r9 = java.lang.Integer.valueOf(r6)
            java.lang.Object r9 = r11.invoke(r9)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L26
            return r7
        L26:
            int r4 = r4 + 1
            goto Lf
        L2b:
            r1 = -1
            return r1
    }

    public final int indexOfLast(kotlin.jvm.functions.Function1<? super java.lang.Integer, java.lang.Boolean> r10) {
            r9 = this;
            java.lang.String r0 = "predicate"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            r0 = 0
            r1 = r9
            r2 = 0
            int[] r3 = r1.content
            int r4 = r1._size
            int r4 = r4 + (-1)
        L10:
            r5 = -1
            if (r5 >= r4) goto L2d
            r5 = r3[r4]
            r6 = r4
            r7 = 0
            java.lang.Integer r8 = java.lang.Integer.valueOf(r5)
            java.lang.Object r8 = r10.invoke(r8)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L28
            return r6
        L28:
            int r4 = r4 + (-1)
            goto L10
        L2d:
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

    public final java.lang.String joinToString(java.lang.CharSequence r17, java.lang.CharSequence r18, java.lang.CharSequence r19, int r20, java.lang.CharSequence r21) {
            r16 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r21
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
            r7 = r16
            r8 = 0
            int[] r9 = r7.content
            r10 = 0
            int r11 = r7._size
        L2f:
            if (r10 >= r11) goto L4a
            r12 = r9[r10]
            r13 = r10
            r14 = 0
            r15 = r20
            if (r13 != r15) goto L3d
            r5.append(r3)
            goto L51
        L3d:
            if (r13 == 0) goto L42
            r5.append(r0)
        L42:
            r5.append(r12)
            int r10 = r10 + 1
            goto L2f
        L4a:
            r15 = r20
            r5.append(r2)
        L51:
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = "StringBuilder().apply(builderAction).toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r5)
            return r4
    }

    public final java.lang.String joinToString(java.lang.CharSequence r18, java.lang.CharSequence r19, java.lang.CharSequence r20, int r21, java.lang.CharSequence r22, kotlin.jvm.functions.Function1<? super java.lang.Integer, ? extends java.lang.CharSequence> r23) {
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
            java.lang.String r5 = "transform"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r5)
            r5 = 0
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r7 = r6
            r8 = 0
            r7.append(r1)
            r9 = r17
            r10 = 0
            int[] r11 = r9.content
            r12 = 0
            int r13 = r9._size
        L37:
            if (r12 >= r13) goto L61
            r14 = r11[r12]
            r15 = r12
            r16 = 0
            r1 = r21
            if (r15 != r1) goto L46
            r7.append(r3)
            goto L68
        L46:
            if (r15 == 0) goto L4b
            r7.append(r0)
        L4b:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r14)
            java.lang.Object r0 = r4.invoke(r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r7.append(r0)
            int r12 = r12 + 1
            r0 = r18
            r1 = r19
            goto L37
        L61:
            r1 = r21
            r7.append(r2)
        L68:
            java.lang.String r0 = r6.toString()
            java.lang.String r6 = "StringBuilder().apply(builderAction).toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r6)
            return r0
    }

    public final java.lang.String joinToString(java.lang.CharSequence r19, java.lang.CharSequence r20, java.lang.CharSequence r21, int r22, kotlin.jvm.functions.Function1<? super java.lang.Integer, ? extends java.lang.CharSequence> r23) {
            r18 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            r3 = r23
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
            r10 = r18
            r11 = 0
            int[] r12 = r10.content
            r13 = 0
            int r14 = r10._size
        L36:
            if (r13 >= r14) goto L6a
            r15 = r12[r13]
            r16 = r13
            r17 = r16
            r16 = 0
            r1 = r17
            r17 = r4
            r4 = r1
            r1 = r22
            if (r4 != r1) goto L4d
            r8.append(r5)
            goto L73
        L4d:
            if (r4 == 0) goto L52
            r8.append(r0)
        L52:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r15)
            java.lang.Object r0 = r3.invoke(r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r8.append(r0)
            int r13 = r13 + 1
            r0 = r19
            r1 = r20
            r4 = r17
            goto L36
        L6a:
            r1 = r22
            r17 = r4
            r8.append(r2)
        L73:
            java.lang.String r0 = r7.toString()
            java.lang.String r4 = "StringBuilder().apply(builderAction).toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r4)
            return r0
    }

    public final java.lang.String joinToString(java.lang.CharSequence r20, java.lang.CharSequence r21, java.lang.CharSequence r22, kotlin.jvm.functions.Function1<? super java.lang.Integer, ? extends java.lang.CharSequence> r23) {
            r19 = this;
            r0 = r20
            r1 = r21
            r2 = r22
            r3 = r23
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
            r11 = r19
            r12 = 0
            int[] r13 = r11.content
            r14 = 0
            int r15 = r11._size
        L38:
            if (r14 >= r15) goto L65
            r16 = r13[r14]
            r17 = r14
            r18 = r17
            r17 = 0
            r1 = r18
            if (r1 != r5) goto L4a
            r9.append(r6)
            goto L6a
        L4a:
            if (r1 == 0) goto L4f
            r9.append(r0)
        L4f:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r16)
            java.lang.Object r0 = r3.invoke(r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r9.append(r0)
            int r14 = r14 + 1
            r0 = r20
            r1 = r21
            goto L38
        L65:
            r9.append(r2)
        L6a:
            java.lang.String r0 = r8.toString()
            java.lang.String r1 = "StringBuilder().apply(builderAction).toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    public final java.lang.String joinToString(java.lang.CharSequence r20, java.lang.CharSequence r21, kotlin.jvm.functions.Function1<? super java.lang.Integer, ? extends java.lang.CharSequence> r22) {
            r19 = this;
            r0 = r20
            r1 = r21
            r2 = r22
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
            r11 = r19
            r12 = 0
            int[] r13 = r11.content
            r14 = 0
            int r15 = r11._size
        L36:
            if (r14 >= r15) goto L63
            r16 = r13[r14]
            r17 = r14
            r18 = r17
            r17 = 0
            r1 = r18
            if (r1 != r5) goto L48
            r9.append(r6)
            goto L68
        L48:
            if (r1 == 0) goto L4d
            r9.append(r0)
        L4d:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r16)
            java.lang.Object r0 = r2.invoke(r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r9.append(r0)
            int r14 = r14 + 1
            r0 = r20
            r1 = r21
            goto L36
        L63:
            r9.append(r4)
        L68:
            java.lang.String r0 = r8.toString()
            java.lang.String r1 = "StringBuilder().apply(builderAction).toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    public final java.lang.String joinToString(java.lang.CharSequence r21, kotlin.jvm.functions.Function1<? super java.lang.Integer, ? extends java.lang.CharSequence> r22) {
            r20 = this;
            r0 = r21
            r1 = r22
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
            r11 = r20
            r12 = 0
            int[] r13 = r11.content
            r14 = 0
            int r15 = r11._size
        L33:
            if (r14 >= r15) goto L62
            r16 = r13[r14]
            r17 = r14
            r18 = r17
            r17 = 0
            r19 = r2
            r2 = r18
            if (r2 != r5) goto L47
            r9.append(r6)
            goto L69
        L47:
            if (r2 == 0) goto L4c
            r9.append(r0)
        L4c:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r16)
            java.lang.Object r0 = r1.invoke(r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r9.append(r0)
            int r14 = r14 + 1
            r0 = r21
            r2 = r19
            goto L33
        L62:
            r19 = r2
            r9.append(r3)
        L69:
            java.lang.String r0 = r8.toString()
            java.lang.String r2 = "StringBuilder().apply(builderAction).toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)
            return r0
    }

    public final java.lang.String joinToString(kotlin.jvm.functions.Function1<? super java.lang.Integer, ? extends java.lang.CharSequence> r21) {
            r20 = this;
            r0 = r21
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
            r11 = r20
            r12 = 0
            int[] r13 = r11.content
            r14 = 0
            int r15 = r11._size
        L31:
            if (r14 >= r15) goto L60
            r16 = r13[r14]
            r17 = r14
            r18 = r17
            r17 = 0
            r19 = r1
            r1 = r18
            if (r1 != r5) goto L45
            r9.append(r6)
            goto L67
        L45:
            if (r1 == 0) goto L4a
            r9.append(r2)
        L4a:
            r18 = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r16)
            java.lang.Object r1 = r0.invoke(r1)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r9.append(r1)
            int r14 = r14 + 1
            r1 = r19
            goto L31
        L60:
            r19 = r1
            r9.append(r3)
        L67:
            java.lang.String r1 = r8.toString()
            java.lang.String r8 = "StringBuilder().apply(builderAction).toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r8)
            return r1
    }

    public final int last() {
            r4 = this;
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L11
            int[] r0 = r4.content
            r1 = r4
            r2 = 0
            int r3 = r1._size
            int r3 = r3 + (-1)
            r0 = r0[r3]
            return r0
        L11:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            java.lang.String r1 = "IntList is empty."
            r0.<init>(r1)
            throw r0
    }

    public final int last(kotlin.jvm.functions.Function1<? super java.lang.Integer, java.lang.Boolean> r9) {
            r8 = this;
            java.lang.String r0 = "predicate"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            r0 = 0
            r1 = r8
            r2 = 0
            int[] r3 = r1.content
            int r4 = r1._size
            int r4 = r4 + (-1)
        L10:
            r5 = -1
            if (r5 >= r4) goto L2c
            r5 = r3[r4]
            r6 = 0
            java.lang.Integer r7 = java.lang.Integer.valueOf(r5)
            java.lang.Object r7 = r9.invoke(r7)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L27
            return r5
        L27:
            int r4 = r4 + (-1)
            goto L10
        L2c:
            java.util.NoSuchElementException r1 = new java.util.NoSuchElementException
            java.lang.String r2 = "IntList contains no element matching the predicate."
            r1.<init>(r2)
            throw r1
    }

    public final int lastIndexOf(int r8) {
            r7 = this;
            r0 = r7
            r1 = 0
            int[] r2 = r0.content
            int r3 = r0._size
            int r3 = r3 + (-1)
        L9:
            r4 = -1
            if (r4 >= r3) goto L18
            r4 = r2[r3]
            r5 = r3
            r6 = 0
            if (r4 != r8) goto L13
            return r5
        L13:
            int r3 = r3 + (-1)
            goto L9
        L18:
            return r4
    }

    public final boolean none() {
            r1 = this;
            boolean r0 = r1.isEmpty()
            return r0
    }

    public final boolean reversedAny(kotlin.jvm.functions.Function1<? super java.lang.Integer, java.lang.Boolean> r10) {
            r9 = this;
            java.lang.String r0 = "predicate"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            r0 = 0
            r1 = r9
            r2 = 0
            int[] r3 = r1.content
            int r4 = r1._size
            r5 = 1
            int r4 = r4 - r5
        L10:
            r6 = -1
            if (r6 >= r4) goto L2c
            r6 = r3[r4]
            r7 = 0
            java.lang.Integer r8 = java.lang.Integer.valueOf(r6)
            java.lang.Object r8 = r10.invoke(r8)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L27
            return r5
        L27:
            int r4 = r4 + (-1)
            goto L10
        L2c:
            r1 = 0
            return r1
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
